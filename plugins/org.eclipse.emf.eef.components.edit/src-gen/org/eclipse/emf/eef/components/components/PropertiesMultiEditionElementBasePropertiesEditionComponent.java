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
import org.eclipse.emf.eef.components.PropertiesMultiEditionElement;
import org.eclipse.emf.eef.components.parts.ComponentsViewsRepository;
import org.eclipse.emf.eef.components.parts.PropertiesMultiEditionElementPropertiesEditionPart;
import org.eclipse.emf.eef.mapping.MappingPackage;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;
import org.eclipse.emf.eef.runtime.impl.filters.EObjectStrictFilter;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.emf.eef.views.ElementEditor;
import org.eclipse.emf.eef.views.ViewsPackage;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class PropertiesMultiEditionElementBasePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for views ReferencesTable
	 */
	private	ReferencesTableSettings viewsSettings;
	
	/**
	 * Settings for model ReferencesTable
	 */
	private	ReferencesTableSettings modelSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public PropertiesMultiEditionElementBasePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject propertiesMultiEditionElement, String editing_mode) {
		super(editingContext, propertiesMultiEditionElement, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ComponentsViewsRepository.class;
		partKey = ComponentsViewsRepository.PropertiesMultiEditionElement.class;
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
			final PropertiesMultiEditionElement propertiesMultiEditionElement = (PropertiesMultiEditionElement)elt;
			final PropertiesMultiEditionElementPropertiesEditionPart basePart = (PropertiesMultiEditionElementPropertiesEditionPart)editingPart;
			// init values
			if (propertiesMultiEditionElement.getName() != null && isAccessible(ComponentsViewsRepository.PropertiesMultiEditionElement.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), propertiesMultiEditionElement.getName()));
			
			if (isAccessible(ComponentsViewsRepository.PropertiesMultiEditionElement.Binding.views)) {
				viewsSettings = new ReferencesTableSettings(propertiesMultiEditionElement, MappingPackage.eINSTANCE.getAbstractPropertyBinding_Views());
				basePart.initViews(viewsSettings);
			}
			if (isAccessible(ComponentsViewsRepository.PropertiesMultiEditionElement.Binding.model)) {
				modelSettings = new ReferencesTableSettings(propertiesMultiEditionElement, MappingPackage.eINSTANCE.getEMFMultiPropertiesBinding_Model());
				basePart.initModel(modelSettings);
			}
			if (propertiesMultiEditionElement.getHelpID() != null && isAccessible(ComponentsViewsRepository.PropertiesMultiEditionElement.Properties.helpID))
				basePart.setHelpID(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), propertiesMultiEditionElement.getHelpID()));
			
			// init filters
			
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
			basePart.addFilterToViews(new EObjectFilter(ViewsPackage.eINSTANCE.getElementEditor()));
			// Start of user code for additional businessfilters for views
			
			// End of user code
			
			basePart.addFilterToModel(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInModelTable((EObject)element));
					return false;
				}
			
			});
			basePart.addFilterToModel(new EObjectStrictFilter(EcorePackage.eINSTANCE.getEStructuralFeature()));
			// Start of user code for additional businessfilters for model
			
			// End of user code
			
			
			// init values for referenced views
			
			// init filters for referenced views
			
		}
		setInitializing(false);
	}







	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#associatedFeature(java.lang.Object)
	 */
	protected EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == ComponentsViewsRepository.PropertiesMultiEditionElement.Properties.name) {
			return MappingPackage.eINSTANCE.getAbstractPropertyBinding_Name();
		}
		if (editorKey == ComponentsViewsRepository.PropertiesMultiEditionElement.Binding.views) {
			return MappingPackage.eINSTANCE.getAbstractPropertyBinding_Views();
		}
		if (editorKey == ComponentsViewsRepository.PropertiesMultiEditionElement.Binding.model) {
			return MappingPackage.eINSTANCE.getEMFMultiPropertiesBinding_Model();
		}
		if (editorKey == ComponentsViewsRepository.PropertiesMultiEditionElement.Properties.helpID) {
			return ComponentsPackage.eINSTANCE.getEEFElement_HelpID();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		PropertiesMultiEditionElement propertiesMultiEditionElement = (PropertiesMultiEditionElement)semanticObject;
		if (ComponentsViewsRepository.PropertiesMultiEditionElement.Properties.name == event.getAffectedEditor()) {
			propertiesMultiEditionElement.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ComponentsViewsRepository.PropertiesMultiEditionElement.Binding.views == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof ElementEditor) {
					viewsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				viewsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				viewsSettings.move(event.getNewIndex(), (ElementEditor) event.getNewValue());
			}
		}
		if (ComponentsViewsRepository.PropertiesMultiEditionElement.Binding.model == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof EStructuralFeature) {
					modelSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				modelSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				modelSettings.move(event.getNewIndex(), (EStructuralFeature) event.getNewValue());
			}
		}
		if (ComponentsViewsRepository.PropertiesMultiEditionElement.Properties.helpID == event.getAffectedEditor()) {
			propertiesMultiEditionElement.setHelpID((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			PropertiesMultiEditionElementPropertiesEditionPart basePart = (PropertiesMultiEditionElementPropertiesEditionPart)editingPart;
			if (MappingPackage.eINSTANCE.getAbstractPropertyBinding_Name().equals(msg.getFeature()) && basePart != null && isAccessible(ComponentsViewsRepository.PropertiesMultiEditionElement.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (MappingPackage.eINSTANCE.getAbstractPropertyBinding_Views().equals(msg.getFeature())  && isAccessible(ComponentsViewsRepository.PropertiesMultiEditionElement.Binding.views))
				basePart.updateViews();
			if (MappingPackage.eINSTANCE.getEMFMultiPropertiesBinding_Model().equals(msg.getFeature())  && isAccessible(ComponentsViewsRepository.PropertiesMultiEditionElement.Binding.model))
				basePart.updateModel();
			if (ComponentsPackage.eINSTANCE.getEEFElement_HelpID().equals(msg.getFeature()) && basePart != null && isAccessible(ComponentsViewsRepository.PropertiesMultiEditionElement.Properties.helpID)) {
				if (msg.getNewValue() != null) {
					basePart.setHelpID(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setHelpID("");
				}
			}
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == ComponentsViewsRepository.PropertiesMultiEditionElement.Properties.name || key == ComponentsViewsRepository.PropertiesMultiEditionElement.Binding.views || key == ComponentsViewsRepository.PropertiesMultiEditionElement.Binding.model;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#getHelpContent(java.lang.Object, int)
	 * 
	 */
	public String getHelpContent(Object key, int kind) {
		if (key == ComponentsViewsRepository.PropertiesMultiEditionElement.Properties.name)
			return "The name of this property binding"; //$NON-NLS-1$
		if (key == ComponentsViewsRepository.PropertiesMultiEditionElement.Binding.views)
			return "The mapped views"; //$NON-NLS-1$
		if (key == ComponentsViewsRepository.PropertiesMultiEditionElement.Binding.model)
			return "The mapped properties"; //$NON-NLS-1$
		if (key == ComponentsViewsRepository.PropertiesMultiEditionElement.Properties.helpID)
			return "The ID of the dynamic help associated to this element (not implemented for the moment)"; //$NON-NLS-1$
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
				if (ComponentsViewsRepository.PropertiesMultiEditionElement.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(MappingPackage.eINSTANCE.getAbstractPropertyBinding_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(MappingPackage.eINSTANCE.getAbstractPropertyBinding_Name().getEAttributeType(), newValue);
				}
				if (ComponentsViewsRepository.PropertiesMultiEditionElement.Properties.helpID == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ComponentsPackage.eINSTANCE.getEEFElement_HelpID().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ComponentsPackage.eINSTANCE.getEEFElement_HelpID().getEAttributeType(), newValue);
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
