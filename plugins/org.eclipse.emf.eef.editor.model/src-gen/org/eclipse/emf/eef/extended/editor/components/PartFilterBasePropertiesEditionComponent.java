/*******************************************************************************
 * Copyright (c) 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.extended.editor.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.components.ComponentsFactory;
import org.eclipse.emf.eef.components.PropertiesEditionComponent;
import org.eclipse.emf.eef.extended.editor.EditorPackage;
import org.eclipse.emf.eef.extended.editor.PartFilter;
import org.eclipse.emf.eef.extended.editor.parts.EditorViewsRepository;
import org.eclipse.emf.eef.extended.editor.parts.PartFilterPropertiesEditionPart;
import org.eclipse.emf.eef.mapping.filters.FiltersPackage;
import org.eclipse.emf.eef.runtime.components.impl.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditingContext;
import org.eclipse.emf.eef.runtime.notify.PropertiesEditingEvent;
import org.eclipse.emf.eef.runtime.notify.impl.PropertiesEditingEventImpl;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.util.EEFConverterUtil;
import org.eclipse.emf.eef.views.View;
import org.eclipse.emf.eef.views.ViewsFactory;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public class PartFilterBasePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for filteredPart EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings filteredPartSettings;
	
	/**
	 * Settings for contextualComponent EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings contextualComponentSettings;
	
	/**
	 * Default constructor
	 * 
	 */
	public PartFilterBasePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject partFilter, String editing_mode) {
		super(editingContext, partFilter, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = EditorViewsRepository.class;
		partKey = EditorViewsRepository.PartFilter.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent#initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(Object key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (editingPart != null && key == partKey) {
			editingPart.setContext(elt, allResource);
			final PartFilter partFilter = (PartFilter)elt;
			final PartFilterPropertiesEditionPart basePart = (PartFilterPropertiesEditionPart)editingPart;
			// init values
			if (partFilter.getName() != null)
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), partFilter.getName()));
			
			basePart.setMandatory(partFilter.isMandatory());
			
			// init part
			filteredPartSettings = new EObjectFlatComboSettings(partFilter, EditorPackage.eINSTANCE.getPartFilter_FilteredPart());
			basePart.initFilteredPart(filteredPartSettings);
			// set the button mode
			basePart.setFilteredPartButtonMode(ButtonsModeEnum.BROWSE);
			// init part
			contextualComponentSettings = new EObjectFlatComboSettings(partFilter, EditorPackage.eINSTANCE.getPartFilter_ContextualComponent());
			basePart.initContextualComponent(contextualComponentSettings);
			// set the button mode
			basePart.setContextualComponentButtonMode(ButtonsModeEnum.BROWSE);
			// init filters
			
			
			basePart.addFilterToFilteredPart(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof View);
				}
			
			});
			// Start of user code for additional businessfilters for filteredPart
			
			// End of user code
			
			basePart.addFilterToContextualComponent(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof PropertiesEditionComponent); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for contextualComponent
			
			// End of user code
			
			// init values for referenced views
			
			// init filters for referenced views
			
		}
		setInitializing(false);
	}







	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.components.impl.StandardPropertiesEditingComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.notify.PropertiesEditingEvent)
	 * 
	 */
	public void updateSemanticModel(final PropertiesEditingEvent event) {
		PartFilter partFilter = (PartFilter)semanticObject;
		if (EditorViewsRepository.PartFilter.Naming.name == event.getAffectedEditor()) {
			partFilter.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (EditorViewsRepository.PartFilter.Settings.mandatory == event.getAffectedEditor()) {
			partFilter.setMandatory((Boolean)event.getNewValue());
		}
		if (EditorViewsRepository.PartFilter.Filter.filteredPart == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditingEventImpl.SET)  {
				filteredPartSettings.setToReference((View)event.getNewValue());
			} else if (event.getKind() == PropertiesEditingEventImpl.ADD)  {
				View eObject = ViewsFactory.eINSTANCE.createView();
				EObjectPropertiesEditingContext context = new EObjectPropertiesEditingContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				filteredPartSettings.setToReference(eObject);
			}
		}
		if (EditorViewsRepository.PartFilter.Filter.contextualComponent == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditingEventImpl.SET)  {
				contextualComponentSettings.setToReference((PropertiesEditionComponent)event.getNewValue());
			} else if (event.getKind() == PropertiesEditingEventImpl.ADD)  {
				PropertiesEditionComponent eObject = ComponentsFactory.eINSTANCE.createPropertiesEditionComponent();
				EObjectPropertiesEditingContext context = new EObjectPropertiesEditingContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				contextualComponentSettings.setToReference(eObject);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.components.impl.StandardPropertiesEditingComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			PartFilterPropertiesEditionPart basePart = (PartFilterPropertiesEditionPart)editingPart;
			if (FiltersPackage.eINSTANCE.getBindingFilter_Name().equals(msg.getFeature()) && basePart != null){
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (FiltersPackage.eINSTANCE.getBindingFilter_Mandatory().equals(msg.getFeature()) && basePart != null)
				basePart.setMandatory((Boolean)msg.getNewValue());
			
			if (EditorPackage.eINSTANCE.getPartFilter_FilteredPart().equals(msg.getFeature()) && basePart != null)
				basePart.setFilteredPart((EObject)msg.getNewValue());
			if (EditorPackage.eINSTANCE.getPartFilter_ContextualComponent().equals(msg.getFeature()) && basePart != null)
				basePart.setContextualComponent((EObject)msg.getNewValue());
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.components.impl.StandardPropertiesEditingComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == EditorViewsRepository.PartFilter.Filter.filteredPart;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent#validateValue(org.eclipse.emf.eef.runtime.notify.PropertiesEditingEvent)
	 * 
	 */
	public Diagnostic validateValue(PropertiesEditingEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
				if (EditorViewsRepository.PartFilter.Naming.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(FiltersPackage.eINSTANCE.getBindingFilter_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(FiltersPackage.eINSTANCE.getBindingFilter_Name().getEAttributeType(), newValue);
				}
				if (EditorViewsRepository.PartFilter.Settings.mandatory == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(FiltersPackage.eINSTANCE.getBindingFilter_Mandatory().getEAttributeType(), (String)newValue);
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
