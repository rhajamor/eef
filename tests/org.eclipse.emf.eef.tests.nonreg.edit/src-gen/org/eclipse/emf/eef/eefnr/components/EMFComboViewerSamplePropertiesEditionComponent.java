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
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.eefnr.EMFComboViewerSample;
import org.eclipse.emf.eef.eefnr.ENUM_SAMPLE;
import org.eclipse.emf.eef.eefnr.EefnrPackage;
import org.eclipse.emf.eef.eefnr.parts.EMFComboViewerSamplePropertiesEditionPart;
import org.eclipse.emf.eef.eefnr.parts.EefnrViewsRepository;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
	

// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class EMFComboViewerSamplePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public EMFComboViewerSamplePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject eMFComboViewerSample, String editing_mode) {
		super(editingContext, eMFComboViewerSample, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = EefnrViewsRepository.class;
		partKey = EefnrViewsRepository.EMFComboViewerSample.class;
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
			final EMFComboViewerSample eMFComboViewerSample = (EMFComboViewerSample)elt;
			final EMFComboViewerSamplePropertiesEditionPart basePart = (EMFComboViewerSamplePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(EefnrViewsRepository.EMFComboViewerSample.Properties.emfcomboviewerRequiredProperty)) {
				basePart.initEmfcomboviewerRequiredProperty((EEnum) EefnrPackage.eINSTANCE.getEMFComboViewerSample_EmfcomboviewerRequiredProperty().getEType(), eMFComboViewerSample.getEmfcomboviewerRequiredProperty());
			}
			if (isAccessible(EefnrViewsRepository.EMFComboViewerSample.Properties.emfcomboviewerOptionalProperty)) {
				basePart.initEmfcomboviewerOptionalProperty((EEnum) EefnrPackage.eINSTANCE.getEMFComboViewerSample_EmfcomboviewerOptionalProperty().getEType(), eMFComboViewerSample.getEmfcomboviewerOptionalProperty());
			}
			// init filters
			
			
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
		if (editorKey == EefnrViewsRepository.EMFComboViewerSample.Properties.emfcomboviewerRequiredProperty) {
			return EefnrPackage.eINSTANCE.getEMFComboViewerSample_EmfcomboviewerRequiredProperty();
		}
		if (editorKey == EefnrViewsRepository.EMFComboViewerSample.Properties.emfcomboviewerOptionalProperty) {
			return EefnrPackage.eINSTANCE.getEMFComboViewerSample_EmfcomboviewerOptionalProperty();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		EMFComboViewerSample eMFComboViewerSample = (EMFComboViewerSample)semanticObject;
		if (EefnrViewsRepository.EMFComboViewerSample.Properties.emfcomboviewerRequiredProperty == event.getAffectedEditor()) {
			eMFComboViewerSample.setEmfcomboviewerRequiredProperty((ENUM_SAMPLE)event.getNewValue());
		}
		if (EefnrViewsRepository.EMFComboViewerSample.Properties.emfcomboviewerOptionalProperty == event.getAffectedEditor()) {
			eMFComboViewerSample.setEmfcomboviewerOptionalProperty((ENUM_SAMPLE)event.getNewValue());
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			EMFComboViewerSamplePropertiesEditionPart basePart = (EMFComboViewerSamplePropertiesEditionPart)editingPart;
			if (EefnrPackage.eINSTANCE.getEMFComboViewerSample_EmfcomboviewerRequiredProperty().equals(msg.getFeature()) && isAccessible(EefnrViewsRepository.EMFComboViewerSample.Properties.emfcomboviewerRequiredProperty))
				basePart.setEmfcomboviewerRequiredProperty((ENUM_SAMPLE)msg.getNewValue());
			
			if (EefnrPackage.eINSTANCE.getEMFComboViewerSample_EmfcomboviewerOptionalProperty().equals(msg.getFeature()) && isAccessible(EefnrViewsRepository.EMFComboViewerSample.Properties.emfcomboviewerOptionalProperty))
				basePart.setEmfcomboviewerOptionalProperty((ENUM_SAMPLE)msg.getNewValue());
			
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == EefnrViewsRepository.EMFComboViewerSample.Properties.emfcomboviewerRequiredProperty;
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
				if (EefnrViewsRepository.EMFComboViewerSample.Properties.emfcomboviewerRequiredProperty == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(EefnrPackage.eINSTANCE.getEMFComboViewerSample_EmfcomboviewerRequiredProperty().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EefnrPackage.eINSTANCE.getEMFComboViewerSample_EmfcomboviewerRequiredProperty().getEAttributeType(), newValue);
				}
				if (EefnrViewsRepository.EMFComboViewerSample.Properties.emfcomboviewerOptionalProperty == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(EefnrPackage.eINSTANCE.getEMFComboViewerSample_EmfcomboviewerOptionalProperty().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EefnrPackage.eINSTANCE.getEMFComboViewerSample_EmfcomboviewerOptionalProperty().getEAttributeType(), newValue);
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
