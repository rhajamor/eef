/*******************************************************************************
 * Copyright (c) 2009 - 2010 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.eefnr.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.eef.eefnr.AdvancedTableCompositionEditorSample;
import org.eclipse.emf.eef.eefnr.EefnrPackage;
import org.eclipse.emf.eef.eefnr.Sample;
import org.eclipse.emf.eef.eefnr.parts.AdvancedTableCompositionEditorSamplePropertiesEditionPart;
import org.eclipse.emf.eef.eefnr.parts.EefnrViewsRepository;
import org.eclipse.emf.eef.runtime.components.impl.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditingContext;
import org.eclipse.emf.eef.runtime.notify.PropertiesEditingEvent;
import org.eclipse.emf.eef.runtime.notify.impl.PropertiesEditingEventImpl;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
	

// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class AdvancedTableCompositionEditorSamplePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for advancedtablecompositionRequiredProperty ReferencesTable
	 */
	protected ReferencesTableSettings advancedtablecompositionRequiredPropertySettings;
	
	/**
	 * Settings for advancedtablecompositionOptionalProperty ReferencesTable
	 */
	protected ReferencesTableSettings advancedtablecompositionOptionalPropertySettings;
	
	/**
	 * Default constructor
	 * 
	 */
	public AdvancedTableCompositionEditorSamplePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject advancedTableCompositionEditorSample, String editing_mode) {
		super(editingContext, advancedTableCompositionEditorSample, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = EefnrViewsRepository.class;
		partKey = EefnrViewsRepository.AdvancedTableCompositionEditorSample.class;
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
			final AdvancedTableCompositionEditorSample advancedTableCompositionEditorSample = (AdvancedTableCompositionEditorSample)elt;
			final AdvancedTableCompositionEditorSamplePropertiesEditionPart basePart = (AdvancedTableCompositionEditorSamplePropertiesEditionPart)editingPart;
			// init values
			advancedtablecompositionRequiredPropertySettings = new ReferencesTableSettings(advancedTableCompositionEditorSample, EefnrPackage.eINSTANCE.getAdvancedTableCompositionEditorSample_AdvancedtablecompositionRequiredProperty());
			basePart.initAdvancedtablecompositionRequiredProperty(advancedtablecompositionRequiredPropertySettings);
			advancedtablecompositionOptionalPropertySettings = new ReferencesTableSettings(advancedTableCompositionEditorSample, EefnrPackage.eINSTANCE.getAdvancedTableCompositionEditorSample_AdvancedtablecompositionOptionalProperty());
			basePart.initAdvancedtablecompositionOptionalProperty(advancedtablecompositionOptionalPropertySettings);
			// init filters
			basePart.addFilterToAdvancedtablecompositionRequiredProperty(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof Sample);
					}
			
			});
			// Start of user code for additional businessfilters for advancedtablecompositionRequiredProperty
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
																																																																																																																																																																																																																																																																																																																																																																																																																																										// End of user code
			
			basePart.addFilterToAdvancedtablecompositionOptionalProperty(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Sample); //$NON-NLS-1$ 
					}
			
			});
			// Start of user code for additional businessfilters for advancedtablecompositionOptionalProperty
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
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
		AdvancedTableCompositionEditorSample advancedTableCompositionEditorSample = (AdvancedTableCompositionEditorSample)semanticObject;
		if (EefnrViewsRepository.AdvancedTableCompositionEditorSample.Properties.advancedtablecompositionRequiredProperty == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditingEventImpl.ADD)  {
				EReferencePropertiesEditingContext context = new EReferencePropertiesEditingContext(editingContext, this, advancedtablecompositionRequiredPropertySettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditingEventImpl.EDIT) {
				EObjectPropertiesEditingContext context = new EObjectPropertiesEditingContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditingEventImpl.REMOVE) {
					advancedtablecompositionRequiredPropertySettings.removeFromReference((EObject) event.getNewValue());
			}
		}
		if (EefnrViewsRepository.AdvancedTableCompositionEditorSample.Properties.advancedtablecompositionOptionalProperty == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditingEventImpl.ADD)  {
				EReferencePropertiesEditingContext context = new EReferencePropertiesEditingContext(editingContext, this, advancedtablecompositionOptionalPropertySettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditingEventImpl.EDIT) {
				EObjectPropertiesEditingContext context = new EObjectPropertiesEditingContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditingEventImpl.REMOVE) {
					advancedtablecompositionOptionalPropertySettings.removeFromReference((EObject) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.components.impl.StandardPropertiesEditingComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			AdvancedTableCompositionEditorSamplePropertiesEditionPart basePart = (AdvancedTableCompositionEditorSamplePropertiesEditionPart)editingPart;
			if (EefnrPackage.eINSTANCE.getAdvancedTableCompositionEditorSample_AdvancedtablecompositionRequiredProperty().equals(msg.getFeature()))
				basePart.updateAdvancedtablecompositionRequiredProperty();
			if (EefnrPackage.eINSTANCE.getAdvancedTableCompositionEditorSample_AdvancedtablecompositionOptionalProperty().equals(msg.getFeature()))
				basePart.updateAdvancedtablecompositionOptionalProperty();
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.components.impl.StandardPropertiesEditingComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == EefnrViewsRepository.AdvancedTableCompositionEditorSample.Properties.advancedtablecompositionRequiredProperty;
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
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}

}
