/*******************************************************************************
 * Copyright (c) 2008, 2012 Obeo.
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
import java.util.ArrayList;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.emf.eef.eefnr.ComboSample;
import org.eclipse.emf.eef.eefnr.EefnrPackage;
import org.eclipse.emf.eef.eefnr.TotalSample;

import org.eclipse.emf.eef.eefnr.parts.ComboSamplePropertiesEditionPart;
import org.eclipse.emf.eef.eefnr.parts.EefnrViewsRepository;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;

import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;

import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.impl.utils.EEFUtils;


// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class ComboSamplePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public ComboSamplePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject comboSample, String editing_mode) {
		super(editingContext, comboSample, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = EefnrViewsRepository.class;
		partKey = EefnrViewsRepository.ComboSample.class;
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
			final ComboSample comboSample = (ComboSample)elt;
			final ComboSamplePropertiesEditionPart basePart = (ComboSamplePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(EefnrViewsRepository.ComboSample.Properties.comboRequiredReferenceProperty)) {
				basePart.initComboRequiredReferenceProperty(EEFUtils.choiceOfValues(comboSample, EefnrPackage.eINSTANCE.getComboSample_ComboRequiredReferenceProperty()), comboSample.getComboRequiredReferenceProperty());
			}
			if (isAccessible(EefnrViewsRepository.ComboSample.Properties.comboOptionalReferenceProperty)) {
				basePart.initComboOptionalReferenceProperty(EEFUtils.choiceOfValues(comboSample, EefnrPackage.eINSTANCE.getComboSample_ComboOptionalReferenceProperty()), comboSample.getComboOptionalReferenceProperty());
			}
			// init filters
			// Start of user code for additional businessfilters for comboRequiredReferenceProperty
			// End of user code
			
			// Start of user code for additional businessfilters for comboOptionalReferenceProperty
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
	public EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == EefnrViewsRepository.ComboSample.Properties.comboRequiredReferenceProperty) {
			return EefnrPackage.eINSTANCE.getComboSample_ComboRequiredReferenceProperty();
		}
		if (editorKey == EefnrViewsRepository.ComboSample.Properties.comboOptionalReferenceProperty) {
			return EefnrPackage.eINSTANCE.getComboSample_ComboOptionalReferenceProperty();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		ComboSample comboSample = (ComboSample)semanticObject;
		if (EefnrViewsRepository.ComboSample.Properties.comboRequiredReferenceProperty == event.getAffectedEditor()) {
			comboSample.setComboRequiredReferenceProperty(!"".equals(event.getNewValue()) ? (TotalSample) event.getNewValue() : null);
		}
		if (EefnrViewsRepository.ComboSample.Properties.comboOptionalReferenceProperty == event.getAffectedEditor()) {
			comboSample.setComboOptionalReferenceProperty(!"".equals(event.getNewValue()) ? (TotalSample) event.getNewValue() : null);
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			ComboSamplePropertiesEditionPart basePart = (ComboSamplePropertiesEditionPart)editingPart;
			if (EefnrPackage.eINSTANCE.getComboSample_ComboRequiredReferenceProperty().equals(msg.getFeature()) && basePart != null && isAccessible(EefnrViewsRepository.ComboSample.Properties.comboRequiredReferenceProperty))
				basePart.setComboRequiredReferenceProperty((Object)msg.getNewValue());
			if (EefnrPackage.eINSTANCE.getComboSample_ComboOptionalReferenceProperty().equals(msg.getFeature()) && basePart != null && isAccessible(EefnrViewsRepository.ComboSample.Properties.comboOptionalReferenceProperty))
				basePart.setComboOptionalReferenceProperty((Object)msg.getNewValue());
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == EefnrViewsRepository.ComboSample.Properties.comboRequiredReferenceProperty;
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
