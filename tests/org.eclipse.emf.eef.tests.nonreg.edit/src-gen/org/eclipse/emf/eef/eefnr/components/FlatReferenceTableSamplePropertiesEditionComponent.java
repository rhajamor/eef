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
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.eef.eefnr.EefnrPackage;
import org.eclipse.emf.eef.eefnr.FlatReferencesTableSample;
import org.eclipse.emf.eef.eefnr.parts.EefnrViewsRepository;
import org.eclipse.emf.eef.eefnr.parts.FlatReferenceTableSamplePropertiesEditionPart;
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
public class FlatReferenceTableSamplePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for flatreferencetableRequiredProperty ReferencesTable
	 */
	private	ReferencesTableSettings flatreferencetableRequiredPropertySettings;
	
	/**
	 * Settings for flatreferencetableOptionalProperty ReferencesTable
	 */
	private	ReferencesTableSettings flatreferencetableOptionalPropertySettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public FlatReferenceTableSamplePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject flatReferencesTableSample, String editing_mode) {
		super(editingContext, flatReferencesTableSample, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = EefnrViewsRepository.class;
		partKey = EefnrViewsRepository.FlatReferenceTableSample.class;
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
			final FlatReferencesTableSample flatReferencesTableSample = (FlatReferencesTableSample)elt;
			final FlatReferenceTableSamplePropertiesEditionPart basePart = (FlatReferenceTableSamplePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(EefnrViewsRepository.FlatReferenceTableSample.Properties.flatreferencetableRequiredProperty)) {
				flatreferencetableRequiredPropertySettings = new ReferencesTableSettings(flatReferencesTableSample, EefnrPackage.eINSTANCE.getFlatReferencesTableSample_FlatreferencestableRequiredProperty());
				basePart.initFlatreferencetableRequiredProperty(flatreferencetableRequiredPropertySettings);
			}
			if (isAccessible(EefnrViewsRepository.FlatReferenceTableSample.Properties.flatreferencetableOptionalProperty)) {
				flatreferencetableOptionalPropertySettings = new ReferencesTableSettings(flatReferencesTableSample, EefnrPackage.eINSTANCE.getFlatReferencesTableSample_FlatreferencestableOptionalProperty());
				basePart.initFlatreferencetableOptionalProperty(flatreferencetableOptionalPropertySettings);
			}
			// init filters
			basePart.addFilterToFlatreferencetableRequiredProperty(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInFlatreferencetableRequiredPropertyTable((EObject)element));
					return false;
				}
			
			});
			basePart.addFilterToFlatreferencetableRequiredProperty(new EObjectStrictFilter(EefnrPackage.eINSTANCE.getTotalSample()));
			// Start of user code for additional businessfilters for flatreferencetableRequiredProperty
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
																																																																																																																																																																																																																																																																																																																																																																																																																																										// End of user code
			
			basePart.addFilterToFlatreferencetableOptionalProperty(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInFlatreferencetableOptionalPropertyTable((EObject)element));
					return element instanceof String && element.equals("");
				}
			
			});
			basePart.addFilterToFlatreferencetableOptionalProperty(new EObjectStrictFilter(EefnrPackage.eINSTANCE.getTotalSample()));
			// Start of user code for additional businessfilters for flatreferencetableOptionalProperty
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
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
		if (editorKey == EefnrViewsRepository.FlatReferenceTableSample.Properties.flatreferencetableRequiredProperty) {
			return EefnrPackage.eINSTANCE.getFlatReferencesTableSample_FlatreferencestableRequiredProperty();
		}
		if (editorKey == EefnrViewsRepository.FlatReferenceTableSample.Properties.flatreferencetableOptionalProperty) {
			return EefnrPackage.eINSTANCE.getFlatReferencesTableSample_FlatreferencestableOptionalProperty();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		FlatReferencesTableSample flatReferencesTableSample = (FlatReferencesTableSample)semanticObject;
		if (EefnrViewsRepository.FlatReferenceTableSample.Properties.flatreferencetableRequiredProperty == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET)
				flatreferencetableRequiredPropertySettings.setToReference((List<EObject>) event.getNewValue());
		}
		if (EefnrViewsRepository.FlatReferenceTableSample.Properties.flatreferencetableOptionalProperty == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET)
				flatreferencetableOptionalPropertySettings.setToReference((List<EObject>) event.getNewValue());
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			FlatReferenceTableSamplePropertiesEditionPart basePart = (FlatReferenceTableSamplePropertiesEditionPart)editingPart;
			if (EefnrPackage.eINSTANCE.getFlatReferencesTableSample_FlatreferencestableRequiredProperty().equals(msg.getFeature()) && isAccessible(EefnrViewsRepository.FlatReferenceTableSample.Properties.flatreferencetableRequiredProperty))
				basePart.updateFlatreferencetableRequiredProperty();
			if (EefnrPackage.eINSTANCE.getFlatReferencesTableSample_FlatreferencestableOptionalProperty().equals(msg.getFeature()) && isAccessible(EefnrViewsRepository.FlatReferenceTableSample.Properties.flatreferencetableOptionalProperty))
				basePart.updateFlatreferencetableOptionalProperty();
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == EefnrViewsRepository.FlatReferenceTableSample.Properties.flatreferencetableRequiredProperty;
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
