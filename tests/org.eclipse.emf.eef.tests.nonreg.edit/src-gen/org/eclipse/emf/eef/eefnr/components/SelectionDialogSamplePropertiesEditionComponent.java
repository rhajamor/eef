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
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.eefnr.EefnrPackage;
import org.eclipse.emf.eef.eefnr.SelectionDialogSample;
import org.eclipse.emf.eef.eefnr.parts.EefnrViewsRepository;
import org.eclipse.emf.eef.eefnr.parts.SelectionDialogSamplePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;


// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class SelectionDialogSamplePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public SelectionDialogSamplePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject selectionDialogSample, String editing_mode) {
		super(editingContext, selectionDialogSample, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = EefnrViewsRepository.class;
		partKey = EefnrViewsRepository.SelectionDialogSample.class;
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
			final SelectionDialogSample selectionDialogSample = (SelectionDialogSample)elt;
			final SelectionDialogSamplePropertiesEditionPart basePart = (SelectionDialogSamplePropertiesEditionPart)editingPart;
			// init values
				if (selectionDialogSample.getSelectionDialogRequiredProperty() != null && isAccessible(EefnrViewsRepository.SelectionDialogSample.Properties.selectionDialogRequiredProperty)) {
					basePart.setSelectionDialogRequiredProperty(EEFConverterUtil.convertToString(EefnrPackage.eINSTANCE.getSelectionDialogSample_SelectionDialogRequiredProperty().getEAttributeType(), selectionDialogSample.getSelectionDialogRequiredProperty()));
				}
			
				if (selectionDialogSample.getSelectionDialogOptionalProperty() != null && isAccessible(EefnrViewsRepository.SelectionDialogSample.Properties.selectionDialogOptionalProperty)) {
					basePart.setSelectionDialogOptionalProperty(EEFConverterUtil.convertToString(EefnrPackage.eINSTANCE.getSelectionDialogSample_SelectionDialogOptionalProperty().getEAttributeType(), selectionDialogSample.getSelectionDialogOptionalProperty()));
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
		if (editorKey == EefnrViewsRepository.SelectionDialogSample.Properties.selectionDialogRequiredProperty) {
			return EefnrPackage.eINSTANCE.getSelectionDialogSample_SelectionDialogRequiredProperty();
		}
		if (editorKey == EefnrViewsRepository.SelectionDialogSample.Properties.selectionDialogOptionalProperty) {
			return EefnrPackage.eINSTANCE.getSelectionDialogSample_SelectionDialogOptionalProperty();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		SelectionDialogSample selectionDialogSample = (SelectionDialogSample)semanticObject;
		if (EefnrViewsRepository.SelectionDialogSample.Properties.selectionDialogRequiredProperty == event.getAffectedEditor()) {
			selectionDialogSample.setSelectionDialogRequiredProperty((String)event.getNewValue());
		}
		if (EefnrViewsRepository.SelectionDialogSample.Properties.selectionDialogOptionalProperty == event.getAffectedEditor()) {
			selectionDialogSample.setSelectionDialogOptionalProperty((String)event.getNewValue());
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			SelectionDialogSamplePropertiesEditionPart basePart = (SelectionDialogSamplePropertiesEditionPart)editingPart;
			if (EefnrPackage.eINSTANCE.getSelectionDialogSample_SelectionDialogRequiredProperty().equals(msg.getFeature()) && basePart != null && isAccessible(EefnrViewsRepository.SelectionDialogSample.Properties.selectionDialogRequiredProperty)) {
				if (msg.getNewValue() != null) {
					basePart.setSelectionDialogRequiredProperty(EcoreUtil.convertToString(EefnrPackage.eINSTANCE.getSelectionDialogSample_SelectionDialogRequiredProperty().getEAttributeType(), msg.getNewValue()));
				} else {
					basePart.setSelectionDialogRequiredProperty("");
				}
			}
			if (EefnrPackage.eINSTANCE.getSelectionDialogSample_SelectionDialogOptionalProperty().equals(msg.getFeature()) && basePart != null && isAccessible(EefnrViewsRepository.SelectionDialogSample.Properties.selectionDialogOptionalProperty)) {
				if (msg.getNewValue() != null) {
					basePart.setSelectionDialogOptionalProperty(EcoreUtil.convertToString(EefnrPackage.eINSTANCE.getSelectionDialogSample_SelectionDialogOptionalProperty().getEAttributeType(), msg.getNewValue()));
				} else {
					basePart.setSelectionDialogOptionalProperty("");
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
		return key == EefnrViewsRepository.SelectionDialogSample.Properties.selectionDialogRequiredProperty;
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
				if (EefnrViewsRepository.SelectionDialogSample.Properties.selectionDialogRequiredProperty == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(EefnrPackage.eINSTANCE.getSelectionDialogSample_SelectionDialogRequiredProperty().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EefnrPackage.eINSTANCE.getSelectionDialogSample_SelectionDialogRequiredProperty().getEAttributeType(), newValue);
				}
				if (EefnrViewsRepository.SelectionDialogSample.Properties.selectionDialogOptionalProperty == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(EefnrPackage.eINSTANCE.getSelectionDialogSample_SelectionDialogOptionalProperty().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EefnrPackage.eINSTANCE.getSelectionDialogSample_SelectionDialogOptionalProperty().getEAttributeType(), newValue);
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
