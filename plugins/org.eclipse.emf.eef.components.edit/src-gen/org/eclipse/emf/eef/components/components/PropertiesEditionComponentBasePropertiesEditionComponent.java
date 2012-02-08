/**
 *  Copyright (c) 2008 - 2010 Obeo.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *      Obeo - initial API and implementation
 *
 */
package org.eclipse.emf.eef.components.components;

// Start of user code for imports

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.components.ComponentsPackage;
import org.eclipse.emf.eef.components.PropertiesEditionComponent;
import org.eclipse.emf.eef.components.parts.ComponentsViewsRepository;
import org.eclipse.emf.eef.components.parts.PropertiesEditionComponentPropertiesEditionPart;
import org.eclipse.emf.eef.mapping.MappingPackage;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.emf.eef.views.View;
import org.eclipse.emf.eef.views.ViewsPackage;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class PropertiesEditionComponentBasePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for views ReferencesTable
	 */
	private	ReferencesTableSettings viewsSettings;
	
	/**
	 * Settings for model EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings modelSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public PropertiesEditionComponentBasePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject propertiesEditionComponent, String editing_mode) {
		super(editingContext, propertiesEditionComponent, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ComponentsViewsRepository.class;
		partKey = ComponentsViewsRepository.PropertiesEditionComponent.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(Object key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (editingPart != null && key == partKey) {
			editingPart.setContext(elt, allResource);
			final PropertiesEditionComponent propertiesEditionComponent = (PropertiesEditionComponent)elt;
			final PropertiesEditionComponentPropertiesEditionPart basePart = (PropertiesEditionComponentPropertiesEditionPart)editingPart;
			// init values
			if (propertiesEditionComponent.getName() != null && isAccessible(ComponentsViewsRepository.PropertiesEditionComponent.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), propertiesEditionComponent.getName()));
			
			if (isAccessible(ComponentsViewsRepository.PropertiesEditionComponent.Binding.views)) {
				viewsSettings = new ReferencesTableSettings(propertiesEditionComponent, MappingPackage.eINSTANCE.getAbstractElementBinding_Views());
				basePart.initViews(viewsSettings);
			}
			if (isAccessible(ComponentsViewsRepository.PropertiesEditionComponent.Binding.model)) {
				// init part
				modelSettings = new EObjectFlatComboSettings(propertiesEditionComponent, MappingPackage.eINSTANCE.getEMFElementBinding_Model());
				basePart.initModel(modelSettings);
				// set the button mode
				basePart.setModelButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (propertiesEditionComponent.getHelpID() != null && isAccessible(ComponentsViewsRepository.PropertiesEditionComponent.Properties.helpID))
				basePart.setHelpID(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), propertiesEditionComponent.getHelpID()));
			
			if (isAccessible(ComponentsViewsRepository.PropertiesEditionComponent.Properties.explicit)) {
				basePart.setExplicit(propertiesEditionComponent.isExplicit());
			}
			// init filters
			
			if (isAccessible(ComponentsViewsRepository.PropertiesEditionComponent.Binding.views)) {
				basePart.addFilterToViews(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInViewsTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToViews(new EObjectFilter(ViewsPackage.eINSTANCE.getView()));
				// Start of user code for additional businessfilters for views
				
				// End of user code
			}
			if (isAccessible(ComponentsViewsRepository.PropertiesEditionComponent.Binding.model)) {
				basePart.addFilterToModel(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof org.eclipse.emf.ecore.EClassifier);
					}
					
				});
				// Start of user code for additional businessfilters for model
				
				// End of user code
			}
			
			
			// init values for referenced views
			
			// init filters for referenced views
			
		}
		setInitializing(false);
	}








	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#associatedFeature(java.lang.Object)
	 */
	public EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == ComponentsViewsRepository.PropertiesEditionComponent.Properties.name) {
			return MappingPackage.eINSTANCE.getAbstractElementBinding_Name();
		}
		if (editorKey == ComponentsViewsRepository.PropertiesEditionComponent.Binding.views) {
			return MappingPackage.eINSTANCE.getAbstractElementBinding_Views();
		}
		if (editorKey == ComponentsViewsRepository.PropertiesEditionComponent.Binding.model) {
			return MappingPackage.eINSTANCE.getEMFElementBinding_Model();
		}
		if (editorKey == ComponentsViewsRepository.PropertiesEditionComponent.Properties.helpID) {
			return ComponentsPackage.eINSTANCE.getEEFElement_HelpID();
		}
		if (editorKey == ComponentsViewsRepository.PropertiesEditionComponent.Properties.explicit) {
			return ComponentsPackage.eINSTANCE.getPropertiesEditionComponent_Explicit();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		PropertiesEditionComponent propertiesEditionComponent = (PropertiesEditionComponent)semanticObject;
		if (ComponentsViewsRepository.PropertiesEditionComponent.Properties.name == event.getAffectedEditor()) {
			propertiesEditionComponent.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ComponentsViewsRepository.PropertiesEditionComponent.Binding.views == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof View) {
					viewsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				viewsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				viewsSettings.move(event.getNewIndex(), (View) event.getNewValue());
			}
		}
		if (ComponentsViewsRepository.PropertiesEditionComponent.Binding.model == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				modelSettings.setToReference((org.eclipse.emf.ecore.EClassifier)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, modelSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			}
		}
		if (ComponentsViewsRepository.PropertiesEditionComponent.Properties.helpID == event.getAffectedEditor()) {
			propertiesEditionComponent.setHelpID((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ComponentsViewsRepository.PropertiesEditionComponent.Properties.explicit == event.getAffectedEditor()) {
			propertiesEditionComponent.setExplicit((Boolean)event.getNewValue());
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			PropertiesEditionComponentPropertiesEditionPart basePart = (PropertiesEditionComponentPropertiesEditionPart)editingPart;
			if (MappingPackage.eINSTANCE.getAbstractElementBinding_Name().equals(msg.getFeature()) && basePart != null && isAccessible(ComponentsViewsRepository.PropertiesEditionComponent.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (MappingPackage.eINSTANCE.getAbstractElementBinding_Views().equals(msg.getFeature())  && isAccessible(ComponentsViewsRepository.PropertiesEditionComponent.Binding.views))
				basePart.updateViews();
			if (MappingPackage.eINSTANCE.getEMFElementBinding_Model().equals(msg.getFeature()) && basePart != null && isAccessible(ComponentsViewsRepository.PropertiesEditionComponent.Binding.model))
				basePart.setModel((EObject)msg.getNewValue());
			if (ComponentsPackage.eINSTANCE.getEEFElement_HelpID().equals(msg.getFeature()) && basePart != null && isAccessible(ComponentsViewsRepository.PropertiesEditionComponent.Properties.helpID)) {
				if (msg.getNewValue() != null) {
					basePart.setHelpID(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setHelpID("");
				}
			}
			if (ComponentsPackage.eINSTANCE.getPropertiesEditionComponent_Explicit().equals(msg.getFeature()) && basePart != null && isAccessible(ComponentsViewsRepository.PropertiesEditionComponent.Properties.explicit))
				basePart.setExplicit((Boolean)msg.getNewValue());
			
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == ComponentsViewsRepository.PropertiesEditionComponent.Properties.name || key == ComponentsViewsRepository.PropertiesEditionComponent.Binding.views || key == ComponentsViewsRepository.PropertiesEditionComponent.Binding.model;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#getHelpContent(java.lang.Object, int)
	 * 
	 */
	public String getHelpContent(Object key, int kind) {
		if (key == ComponentsViewsRepository.PropertiesEditionComponent.Properties.name)
			return "The name of this element binding"; //$NON-NLS-1$
		if (key == ComponentsViewsRepository.PropertiesEditionComponent.Binding.views)
			return "The mapped views"; //$NON-NLS-1$
		if (key == ComponentsViewsRepository.PropertiesEditionComponent.Binding.model)
			return "The mapped classifier"; //$NON-NLS-1$
		if (key == ComponentsViewsRepository.PropertiesEditionComponent.Properties.helpID)
			return "The ID of the dynamic help associated to this element (not implemented for the moment)"; //$NON-NLS-1$
		if (key == ComponentsViewsRepository.PropertiesEditionComponent.Properties.explicit)
			return "Whether the component can be directly used"; //$NON-NLS-1$
		return super.getHelpContent(key, kind);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public Diagnostic validateValue(IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
				if (ComponentsViewsRepository.PropertiesEditionComponent.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(MappingPackage.eINSTANCE.getAbstractElementBinding_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(MappingPackage.eINSTANCE.getAbstractElementBinding_Name().getEAttributeType(), newValue);
				}
				if (ComponentsViewsRepository.PropertiesEditionComponent.Properties.helpID == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ComponentsPackage.eINSTANCE.getEEFElement_HelpID().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ComponentsPackage.eINSTANCE.getEEFElement_HelpID().getEAttributeType(), newValue);
				}
				if (ComponentsViewsRepository.PropertiesEditionComponent.Properties.explicit == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ComponentsPackage.eINSTANCE.getPropertiesEditionComponent_Explicit().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ComponentsPackage.eINSTANCE.getPropertiesEditionComponent_Explicit().getEAttributeType(), newValue);
				}
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}

}
