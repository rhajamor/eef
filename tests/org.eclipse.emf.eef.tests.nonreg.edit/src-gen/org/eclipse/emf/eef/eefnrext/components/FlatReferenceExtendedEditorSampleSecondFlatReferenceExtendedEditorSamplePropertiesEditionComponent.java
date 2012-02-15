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
package org.eclipse.emf.eef.eefnrext.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.eefnrext.EefnrextPackage;
import org.eclipse.emf.eef.eefnrext.FlatReferenceExtendedEditorSample;
import org.eclipse.emf.eef.eefnrext.parts.EefnrextViewsRepository;
import org.eclipse.emf.eef.eefnrext.parts.SecondFlatReferenceExtendedEditorSamplePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;


// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class FlatReferenceExtendedEditorSampleSecondFlatReferenceExtendedEditorSamplePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String SECONDFLATREFERENCEEXTENDEDEDITORSAMPLE_PART = "SecondFlatReferenceExtendedEditorSample"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public FlatReferenceExtendedEditorSampleSecondFlatReferenceExtendedEditorSamplePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject flatReferenceExtendedEditorSample, String editing_mode) {
		super(editingContext, flatReferenceExtendedEditorSample, editing_mode);
		parts = new String[] { SECONDFLATREFERENCEEXTENDEDEDITORSAMPLE_PART };
		repositoryKey = EefnrextViewsRepository.class;
		partKey = EefnrextViewsRepository.SecondFlatReferenceExtendedEditorSample.class;
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
			final FlatReferenceExtendedEditorSample flatReferenceExtendedEditorSample = (FlatReferenceExtendedEditorSample)elt;
			final SecondFlatReferenceExtendedEditorSamplePropertiesEditionPart secondFlatReferenceExtendedEditorSamplePart = (SecondFlatReferenceExtendedEditorSamplePropertiesEditionPart)editingPart;
			// init values
			if (flatReferenceExtendedEditorSample.getDemo() != null && isAccessible(EefnrextViewsRepository.SecondFlatReferenceExtendedEditorSample.Extended.demo))
				secondFlatReferenceExtendedEditorSamplePart.setDemo(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), flatReferenceExtendedEditorSample.getDemo()));
			
			if (isAccessible(EefnrextViewsRepository.SecondFlatReferenceExtendedEditorSample.Extended.size)) {
				secondFlatReferenceExtendedEditorSamplePart.setSize(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), flatReferenceExtendedEditorSample.getSize()));
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
		if (editorKey == EefnrextViewsRepository.SecondFlatReferenceExtendedEditorSample.Extended.demo) {
			return EefnrextPackage.eINSTANCE.getFlatReferenceExtendedEditorSample_Demo();
		}
		if (editorKey == EefnrextViewsRepository.SecondFlatReferenceExtendedEditorSample.Extended.size) {
			return EefnrextPackage.eINSTANCE.getFlatReferenceExtendedEditorSample_Size();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		FlatReferenceExtendedEditorSample flatReferenceExtendedEditorSample = (FlatReferenceExtendedEditorSample)semanticObject;
		if (EefnrextViewsRepository.SecondFlatReferenceExtendedEditorSample.Extended.demo == event.getAffectedEditor()) {
			flatReferenceExtendedEditorSample.setDemo((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (EefnrextViewsRepository.SecondFlatReferenceExtendedEditorSample.Extended.size == event.getAffectedEditor()) {
			flatReferenceExtendedEditorSample.setSize((EEFConverterUtil.createIntFromString(EcorePackage.eINSTANCE.getEInt(), (String)event.getNewValue())));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			SecondFlatReferenceExtendedEditorSamplePropertiesEditionPart secondFlatReferenceExtendedEditorSamplePart = (SecondFlatReferenceExtendedEditorSamplePropertiesEditionPart)editingPart;
			if (EefnrextPackage.eINSTANCE.getFlatReferenceExtendedEditorSample_Demo().equals(msg.getFeature()) && secondFlatReferenceExtendedEditorSamplePart != null && isAccessible(EefnrextViewsRepository.SecondFlatReferenceExtendedEditorSample.Extended.demo)) {
				if (msg.getNewValue() != null) {
					secondFlatReferenceExtendedEditorSamplePart.setDemo(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					secondFlatReferenceExtendedEditorSamplePart.setDemo("");
				}
			}
			if (EefnrextPackage.eINSTANCE.getFlatReferenceExtendedEditorSample_Size().equals(msg.getFeature()) && secondFlatReferenceExtendedEditorSamplePart != null && isAccessible(EefnrextViewsRepository.SecondFlatReferenceExtendedEditorSample.Extended.size)) {
				if (msg.getNewValue() != null) {
					secondFlatReferenceExtendedEditorSamplePart.setSize(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), msg.getNewValue()));
				} else {
					secondFlatReferenceExtendedEditorSamplePart.setSize("");
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
		return key == EefnrextViewsRepository.SecondFlatReferenceExtendedEditorSample.Extended.demo;
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
				if (EefnrextViewsRepository.SecondFlatReferenceExtendedEditorSample.Extended.demo == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(EefnrextPackage.eINSTANCE.getFlatReferenceExtendedEditorSample_Demo().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EefnrextPackage.eINSTANCE.getFlatReferenceExtendedEditorSample_Demo().getEAttributeType(), newValue);
				}
				if (EefnrextViewsRepository.SecondFlatReferenceExtendedEditorSample.Extended.size == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(EefnrextPackage.eINSTANCE.getFlatReferenceExtendedEditorSample_Size().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EefnrextPackage.eINSTANCE.getFlatReferenceExtendedEditorSample_Size().getEAttributeType(), newValue);
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
