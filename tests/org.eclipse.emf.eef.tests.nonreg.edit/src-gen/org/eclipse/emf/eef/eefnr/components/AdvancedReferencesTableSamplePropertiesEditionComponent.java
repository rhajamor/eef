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
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.eef.eefnr.AdvancedReferencesTableSample;
import org.eclipse.emf.eef.eefnr.EefnrPackage;
import org.eclipse.emf.eef.eefnr.TotalSample;
import org.eclipse.emf.eef.eefnr.parts.AdvancedReferencesTableSamplePropertiesEditionPart;
import org.eclipse.emf.eef.eefnr.parts.EefnrViewsRepository;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
	

// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class AdvancedReferencesTableSamplePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for advancedreferencestableRequiredProperty ReferencesTable
	 */
	private	ReferencesTableSettings advancedreferencestableRequiredPropertySettings;
	
	/**
	 * Settings for advancedreferencestableOptionalProperty ReferencesTable
	 */
	private	ReferencesTableSettings advancedreferencestableOptionalPropertySettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public AdvancedReferencesTableSamplePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject advancedReferencesTableSample, String editing_mode) {
		super(editingContext, advancedReferencesTableSample, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = EefnrViewsRepository.class;
		partKey = EefnrViewsRepository.AdvancedReferencesTableSample.class;
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
			final AdvancedReferencesTableSample advancedReferencesTableSample = (AdvancedReferencesTableSample)elt;
			final AdvancedReferencesTableSamplePropertiesEditionPart basePart = (AdvancedReferencesTableSamplePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(EefnrViewsRepository.AdvancedReferencesTableSample.Properties.advancedreferencestableRequiredProperty)) {
				advancedreferencestableRequiredPropertySettings = new ReferencesTableSettings(advancedReferencesTableSample, EefnrPackage.eINSTANCE.getAdvancedReferencesTableSample_AdvancedreferencestableRequiredProperty());
				basePart.initAdvancedreferencestableRequiredProperty(advancedreferencestableRequiredPropertySettings);
			}
			if (isAccessible(EefnrViewsRepository.AdvancedReferencesTableSample.Properties.advancedreferencestableOptionalProperty)) {
				advancedreferencestableOptionalPropertySettings = new ReferencesTableSettings(advancedReferencesTableSample, EefnrPackage.eINSTANCE.getAdvancedReferencesTableSample_AdvancedreferencestableOptionalProperty());
				basePart.initAdvancedreferencestableOptionalProperty(advancedreferencestableOptionalPropertySettings);
			}
			// init filters
			if (isAccessible(EefnrViewsRepository.AdvancedReferencesTableSample.Properties.advancedreferencestableRequiredProperty)) {
				basePart.addFilterToAdvancedreferencestableRequiredProperty(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInAdvancedreferencestableRequiredPropertyTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToAdvancedreferencestableRequiredProperty(new EObjectFilter(EefnrPackage.eINSTANCE.getTotalSample()));
				// Start of user code for additional businessfilters for advancedreferencestableRequiredProperty
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																
																																																																																																																																																																																																																																																																																																																																																																																																																																																																					// End of user code
			}
			if (isAccessible(EefnrViewsRepository.AdvancedReferencesTableSample.Properties.advancedreferencestableOptionalProperty)) {
				basePart.addFilterToAdvancedreferencestableOptionalProperty(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInAdvancedreferencestableOptionalPropertyTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToAdvancedreferencestableOptionalProperty(new EObjectFilter(EefnrPackage.eINSTANCE.getTotalSample()));
				// Start of user code for additional businessfilters for advancedreferencestableOptionalProperty
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																
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
		if (editorKey == EefnrViewsRepository.AdvancedReferencesTableSample.Properties.advancedreferencestableRequiredProperty) {
			return EefnrPackage.eINSTANCE.getAdvancedReferencesTableSample_AdvancedreferencestableRequiredProperty();
		}
		if (editorKey == EefnrViewsRepository.AdvancedReferencesTableSample.Properties.advancedreferencestableOptionalProperty) {
			return EefnrPackage.eINSTANCE.getAdvancedReferencesTableSample_AdvancedreferencestableOptionalProperty();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		AdvancedReferencesTableSample advancedReferencesTableSample = (AdvancedReferencesTableSample)semanticObject;
		if (EefnrViewsRepository.AdvancedReferencesTableSample.Properties.advancedreferencestableRequiredProperty == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof TotalSample) {
					advancedreferencestableRequiredPropertySettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				advancedreferencestableRequiredPropertySettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				advancedreferencestableRequiredPropertySettings.move(event.getNewIndex(), (TotalSample) event.getNewValue());
			}
		}
		if (EefnrViewsRepository.AdvancedReferencesTableSample.Properties.advancedreferencestableOptionalProperty == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof TotalSample) {
					advancedreferencestableOptionalPropertySettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				advancedreferencestableOptionalPropertySettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				advancedreferencestableOptionalPropertySettings.move(event.getNewIndex(), (TotalSample) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			AdvancedReferencesTableSamplePropertiesEditionPart basePart = (AdvancedReferencesTableSamplePropertiesEditionPart)editingPart;
			if (EefnrPackage.eINSTANCE.getAdvancedReferencesTableSample_AdvancedreferencestableRequiredProperty().equals(msg.getFeature())  && isAccessible(EefnrViewsRepository.AdvancedReferencesTableSample.Properties.advancedreferencestableRequiredProperty))
				basePart.updateAdvancedreferencestableRequiredProperty();
			if (EefnrPackage.eINSTANCE.getAdvancedReferencesTableSample_AdvancedreferencestableOptionalProperty().equals(msg.getFeature())  && isAccessible(EefnrViewsRepository.AdvancedReferencesTableSample.Properties.advancedreferencestableOptionalProperty))
				basePart.updateAdvancedreferencestableOptionalProperty();
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == EefnrViewsRepository.AdvancedReferencesTableSample.Properties.advancedreferencestableRequiredProperty;
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
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}

}
