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
package org.eclipse.emf.eef.mapping.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.eef.mapping.filters.FiltersPackage;
import org.eclipse.emf.eef.mapping.filters.StrictTypingFilter;
import org.eclipse.emf.eef.mapping.parts.MappingViewsRepository;
import org.eclipse.emf.eef.mapping.parts.StrictTypingFilterPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class StrictTypingFilterFilterStrictTypingFilterPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String STRICTTYPINGFILTER_PART = "StrictTypingFilter"; //$NON-NLS-1$

	
	/**
	 * Settings for type EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings typeSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public StrictTypingFilterFilterStrictTypingFilterPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject strictTypingFilter, String editing_mode) {
		super(editingContext, strictTypingFilter, editing_mode);
		parts = new String[] { STRICTTYPINGFILTER_PART };
		repositoryKey = MappingViewsRepository.class;
		partKey = MappingViewsRepository.StrictTypingFilter.class;
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
			final StrictTypingFilter strictTypingFilter = (StrictTypingFilter)elt;
			final StrictTypingFilterPropertiesEditionPart strictTypingFilterPart = (StrictTypingFilterPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(MappingViewsRepository.StrictTypingFilter.Type.restriction)) {
				// init part
				typeSettings = new EObjectFlatComboSettings(strictTypingFilter, FiltersPackage.eINSTANCE.getStrictTypingFilter_Type());
				strictTypingFilterPart.initRestriction(typeSettings);
				// set the button mode
				strictTypingFilterPart.setRestrictionButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			strictTypingFilterPart.addFilterToRestriction(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof org.eclipse.emf.ecore.EClassifier);
				}
			
			});
			// Start of user code for additional businessfilters for type
			
			// End of user code
			
			// init values for referenced views
					strictTypingFilterPart.getFilterPropertiesReferencedView().setContext(elt, allResource);
			
			// init filters for referenced views
			
			
			
		}
		setInitializing(false);
	}






	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#associatedFeature(java.lang.Object)
	 */
	public EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == MappingViewsRepository.StrictTypingFilter.Type.restriction) {
			return FiltersPackage.eINSTANCE.getStrictTypingFilter_Type();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		StrictTypingFilter strictTypingFilter = (StrictTypingFilter)semanticObject;
		if (MappingViewsRepository.StrictTypingFilter.Type.restriction == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				typeSettings.setToReference((org.eclipse.emf.ecore.EClassifier)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, typeSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			StrictTypingFilterPropertiesEditionPart strictTypingFilterPart = (StrictTypingFilterPropertiesEditionPart)editingPart;
			if (FiltersPackage.eINSTANCE.getStrictTypingFilter_Type().equals(msg.getFeature()) && strictTypingFilterPart != null && isAccessible(MappingViewsRepository.StrictTypingFilter.Type.restriction))
				strictTypingFilterPart.setRestriction((EObject)msg.getNewValue());
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == MappingViewsRepository.StrictTypingFilter.Type.restriction;
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
				if (MappingViewsRepository.FilterProperties.FilterProperties_.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(FiltersPackage.eINSTANCE.getBindingFilter_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(FiltersPackage.eINSTANCE.getBindingFilter_Name().getEAttributeType(), newValue);
				}
				if (MappingViewsRepository.FilterProperties.FilterProperties_.mandatory == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(FiltersPackage.eINSTANCE.getBindingFilter_Mandatory().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(FiltersPackage.eINSTANCE.getBindingFilter_Mandatory().getEAttributeType(), newValue);
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
