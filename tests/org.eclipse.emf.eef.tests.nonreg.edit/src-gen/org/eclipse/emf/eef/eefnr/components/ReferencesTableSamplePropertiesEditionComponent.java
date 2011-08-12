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
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.eef.eefnr.EefnrPackage;
import org.eclipse.emf.eef.eefnr.ReferencesTableSample;
import org.eclipse.emf.eef.eefnr.TotalSample;
import org.eclipse.emf.eef.eefnr.parts.EefnrViewsRepository;
import org.eclipse.emf.eef.eefnr.parts.ReferencesTableSamplePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.filters.EObjectStrictFilter;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
	

// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class ReferencesTableSamplePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for referencestableRequiredProperty ReferencesTable
	 */
	private	ReferencesTableSettings referencestableRequiredPropertySettings;
	
	/**
	 * Settings for referencestableOptionalProperty ReferencesTable
	 */
	private	ReferencesTableSettings referencestableOptionalPropertySettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public ReferencesTableSamplePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject referencesTableSample, String editing_mode) {
		super(editingContext, referencesTableSample, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = EefnrViewsRepository.class;
		partKey = EefnrViewsRepository.ReferencesTableSample.class;
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
			final ReferencesTableSample referencesTableSample = (ReferencesTableSample)elt;
			final ReferencesTableSamplePropertiesEditionPart basePart = (ReferencesTableSamplePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(EefnrViewsRepository.ReferencesTableSample.Properties.referencestableRequiredProperty)) {
				referencestableRequiredPropertySettings = new ReferencesTableSettings(referencesTableSample, EefnrPackage.eINSTANCE.getReferencesTableSample_ReferencestableRequiredProperty());
				basePart.initReferencestableRequiredProperty(referencestableRequiredPropertySettings);
			}
			if (isAccessible(EefnrViewsRepository.ReferencesTableSample.Properties.referencestableOptionalProperty)) {
				referencestableOptionalPropertySettings = new ReferencesTableSettings(referencesTableSample, EefnrPackage.eINSTANCE.getReferencesTableSample_ReferencestableOptionalProperty());
				basePart.initReferencestableOptionalProperty(referencestableOptionalPropertySettings);
			}
			// init filters
			basePart.addFilterToReferencestableRequiredProperty(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInReferencestableRequiredPropertyTable((EObject)element));
					return false;
				}
			
			});
			basePart.addFilterToReferencestableRequiredProperty(new EObjectStrictFilter(EefnrPackage.eINSTANCE.getTotalSample()));
			// Start of user code for additional businessfilters for referencestableRequiredProperty
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
																																																																																																																																																																																																																																																																																																																																																																																																																																										// End of user code
			
			basePart.addFilterToReferencestableOptionalProperty(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInReferencestableOptionalPropertyTable((EObject)element));
					return element instanceof String && element.equals("");
				}
			
			});
			basePart.addFilterToReferencestableOptionalProperty(new EObjectStrictFilter(EefnrPackage.eINSTANCE.getTotalSample()));
			// Start of user code for additional businessfilters for referencestableOptionalProperty
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
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
		if (editorKey == EefnrViewsRepository.ReferencesTableSample.Properties.referencestableRequiredProperty) {
			return EefnrPackage.eINSTANCE.getReferencesTableSample_ReferencestableRequiredProperty();
		}
		if (editorKey == EefnrViewsRepository.ReferencesTableSample.Properties.referencestableOptionalProperty) {
			return EefnrPackage.eINSTANCE.getReferencesTableSample_ReferencestableOptionalProperty();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		ReferencesTableSample referencesTableSample = (ReferencesTableSample)semanticObject;
		if (EefnrViewsRepository.ReferencesTableSample.Properties.referencestableRequiredProperty == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof TotalSample) {
					referencestableRequiredPropertySettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				referencestableRequiredPropertySettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				referencestableRequiredPropertySettings.move(event.getNewIndex(), (TotalSample) event.getNewValue());
			}
		}
		if (EefnrViewsRepository.ReferencesTableSample.Properties.referencestableOptionalProperty == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof TotalSample) {
					referencestableOptionalPropertySettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				referencestableOptionalPropertySettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				referencestableOptionalPropertySettings.move(event.getNewIndex(), (TotalSample) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			ReferencesTableSamplePropertiesEditionPart basePart = (ReferencesTableSamplePropertiesEditionPart)editingPart;
			if (EefnrPackage.eINSTANCE.getReferencesTableSample_ReferencestableRequiredProperty().equals(msg.getFeature())  && isAccessible(EefnrViewsRepository.ReferencesTableSample.Properties.referencestableRequiredProperty))
				basePart.updateReferencestableRequiredProperty();
			if (EefnrPackage.eINSTANCE.getReferencesTableSample_ReferencestableOptionalProperty().equals(msg.getFeature())  && isAccessible(EefnrViewsRepository.ReferencesTableSample.Properties.referencestableOptionalProperty))
				basePart.updateReferencestableOptionalProperty();
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == EefnrViewsRepository.ReferencesTableSample.Properties.referencestableRequiredProperty;
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
