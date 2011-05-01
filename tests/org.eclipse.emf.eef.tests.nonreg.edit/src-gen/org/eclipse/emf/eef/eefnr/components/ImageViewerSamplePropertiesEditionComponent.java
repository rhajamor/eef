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
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.eefnr.EefnrPackage;
import org.eclipse.emf.eef.eefnr.ImageViewerSample;
import org.eclipse.emf.eef.eefnr.parts.EefnrViewsRepository;
import org.eclipse.emf.eef.eefnr.parts.ImageViewerSamplePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.components.impl.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.notify.PropertiesEditingEvent;


// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class ImageViewerSamplePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Default constructor
	 * 
	 */
	public ImageViewerSamplePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject imageViewerSample, String editing_mode) {
		super(editingContext, imageViewerSample, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = EefnrViewsRepository.class;
		partKey = EefnrViewsRepository.ImageViewerSample.class;
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
			final ImageViewerSample imageViewerSample = (ImageViewerSample)elt;
			final ImageViewerSamplePropertiesEditionPart basePart = (ImageViewerSamplePropertiesEditionPart)editingPart;
			// init values
			if (imageViewerSample.getImageviewerRequiredProperty() != null && isAccessible(EefnrViewsRepository.ImageViewerSample.Properties.imageviewerRequiredProperty)) {
				basePart.initImageviewerRequiredProperty(EcoreUtil.getIdentification(imageViewerSample), imageViewerSample.getImageviewerRequiredProperty());
			}
			
			if (imageViewerSample.getImageviewerOptionalProperty() != null && isAccessible(EefnrViewsRepository.ImageViewerSample.Properties.imageviewerOptionalProperty)) {
				basePart.initImageviewerOptionalProperty(EcoreUtil.getIdentification(imageViewerSample), imageViewerSample.getImageviewerOptionalProperty());
			}
			
			// init filters
			
			
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
		ImageViewerSample imageViewerSample = (ImageViewerSample)semanticObject;
		if (EefnrViewsRepository.ImageViewerSample.Properties.imageviewerRequiredProperty == event.getAffectedEditor()) {
			imageViewerSample.setImageviewerRequiredProperty((String)event.getNewValue());
		}
		if (EefnrViewsRepository.ImageViewerSample.Properties.imageviewerOptionalProperty == event.getAffectedEditor()) {
			imageViewerSample.setImageviewerOptionalProperty((String)event.getNewValue());
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.components.impl.StandardPropertiesEditingComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			ImageViewerSamplePropertiesEditionPart basePart = (ImageViewerSamplePropertiesEditionPart)editingPart;
			if (EefnrPackage.eINSTANCE.getImageViewerSample_ImageviewerRequiredProperty().equals(msg.getFeature()) && isAccessible(EefnrViewsRepository.ImageViewerSample.Properties.imageviewerRequiredProperty)){
				if (msg.getNewValue() != null) {
					basePart.setImageviewerRequiredProperty((String)msg.getNewValue());
				}
				else {
					basePart.setImageviewerRequiredProperty("");
				}
			}
			if (EefnrPackage.eINSTANCE.getImageViewerSample_ImageviewerOptionalProperty().equals(msg.getFeature()) && isAccessible(EefnrViewsRepository.ImageViewerSample.Properties.imageviewerOptionalProperty)){
				if (msg.getNewValue() != null) {
					basePart.setImageviewerOptionalProperty((String)msg.getNewValue());
				}
				else {
					basePart.setImageviewerOptionalProperty("");
				}
			}
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.components.impl.StandardPropertiesEditingComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == EefnrViewsRepository.ImageViewerSample.Properties.imageviewerRequiredProperty;
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
				if (EefnrViewsRepository.ImageViewerSample.Properties.imageviewerRequiredProperty == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(EefnrPackage.eINSTANCE.getImageViewerSample_ImageviewerRequiredProperty().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EefnrPackage.eINSTANCE.getImageViewerSample_ImageviewerRequiredProperty().getEAttributeType(), newValue);
				}
				if (EefnrViewsRepository.ImageViewerSample.Properties.imageviewerOptionalProperty == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(EefnrPackage.eINSTANCE.getImageViewerSample_ImageviewerOptionalProperty().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EefnrPackage.eINSTANCE.getImageViewerSample_ImageviewerOptionalProperty().getEAttributeType(), newValue);
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
