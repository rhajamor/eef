/**
 *  Copyright (c) 2008 - 2010 Obeo.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *      Obeo - initial API and implementation
 *
 */
package org.eclipse.emf.eef.EEFGen.components;

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
import org.eclipse.emf.eef.EEFGen.EEFGenModel;
import org.eclipse.emf.eef.EEFGen.EEFGenPackage;
import org.eclipse.emf.eef.EEFGen.parts.EEFGenModelPropertiesEditionPart;
import org.eclipse.emf.eef.EEFGen.parts.EEFGenViewsRepository;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;

// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class EEFGenModelPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public EEFGenModelPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject eEFGenModel, String editing_mode) {
		super(editingContext, eEFGenModel, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = EEFGenViewsRepository.class;
		partKey = EEFGenViewsRepository.EEFGenModel.class;
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
			final EEFGenModel eEFGenModel = (EEFGenModel)elt;
			final EEFGenModelPropertiesEditionPart basePart = (EEFGenModelPropertiesEditionPart)editingPart;
			// init values
			if (eEFGenModel.getGenDirectory() != null && isAccessible(EEFGenViewsRepository.EEFGenModel.Parameters.generationDirectory))
				basePart.setGenerationDirectory(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), eEFGenModel.getGenDirectory()));
			
			if (eEFGenModel.getAuthor() != null && isAccessible(EEFGenViewsRepository.EEFGenModel.Legal.author))
				basePart.setAuthor(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), eEFGenModel.getAuthor()));
			
			if (eEFGenModel.getLicense() != null && isAccessible(EEFGenViewsRepository.EEFGenModel.Legal.license))
				basePart.setLicense(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), eEFGenModel.getLicense()));
			if (eEFGenModel.getTestsGenDirectory() != null && isAccessible(EEFGenViewsRepository.EEFGenModel.Parameters.testsGenerationDirectory))
				basePart.setTestsGenerationDirectory(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), eEFGenModel.getTestsGenDirectory()));
			
			if (isAccessible(EEFGenViewsRepository.EEFGenModel.Parameters.useJMergeToManageUserCode)) {
				basePart.setUseJMergeToManageUserCode(eEFGenModel.isUseJMergeForUserCode());
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
		if (editorKey == EEFGenViewsRepository.EEFGenModel.Parameters.generationDirectory) {
			return EEFGenPackage.eINSTANCE.getEEFGenModel_GenDirectory();
		}
		if (editorKey == EEFGenViewsRepository.EEFGenModel.Legal.author) {
			return EEFGenPackage.eINSTANCE.getEEFGenModel_Author();
		}
		if (editorKey == EEFGenViewsRepository.EEFGenModel.Legal.license) {
			return EEFGenPackage.eINSTANCE.getEEFGenModel_License();
		}
		if (editorKey == EEFGenViewsRepository.EEFGenModel.Parameters.testsGenerationDirectory) {
			return EEFGenPackage.eINSTANCE.getEEFGenModel_TestsGenDirectory();
		}
		if (editorKey == EEFGenViewsRepository.EEFGenModel.Parameters.useJMergeToManageUserCode) {
			return EEFGenPackage.eINSTANCE.getEEFGenModel_UseJMergeForUserCode();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		EEFGenModel eEFGenModel = (EEFGenModel)semanticObject;
		if (EEFGenViewsRepository.EEFGenModel.Parameters.generationDirectory == event.getAffectedEditor()) {
			eEFGenModel.setGenDirectory((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (EEFGenViewsRepository.EEFGenModel.Legal.author == event.getAffectedEditor()) {
			eEFGenModel.setAuthor((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (EEFGenViewsRepository.EEFGenModel.Legal.license == event.getAffectedEditor()) {
			eEFGenModel.setLicense((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (EEFGenViewsRepository.EEFGenModel.Parameters.testsGenerationDirectory == event.getAffectedEditor()) {
			eEFGenModel.setTestsGenDirectory((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (EEFGenViewsRepository.EEFGenModel.Parameters.useJMergeToManageUserCode == event.getAffectedEditor()) {
			eEFGenModel.setUseJMergeForUserCode((Boolean)event.getNewValue());
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			EEFGenModelPropertiesEditionPart basePart = (EEFGenModelPropertiesEditionPart)editingPart;
			if (EEFGenPackage.eINSTANCE.getEEFGenModel_GenDirectory().equals(msg.getFeature()) && basePart != null && isAccessible(EEFGenViewsRepository.EEFGenModel.Parameters.generationDirectory)) {
				if (msg.getNewValue() != null) {
					basePart.setGenerationDirectory(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setGenerationDirectory("");
				}
			}
			if (EEFGenPackage.eINSTANCE.getEEFGenModel_Author().equals(msg.getFeature()) && basePart != null && isAccessible(EEFGenViewsRepository.EEFGenModel.Legal.author)) {
				if (msg.getNewValue() != null) {
					basePart.setAuthor(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setAuthor("");
				}
			}
			if (EEFGenPackage.eINSTANCE.getEEFGenModel_License().equals(msg.getFeature()) && basePart != null && isAccessible(EEFGenViewsRepository.EEFGenModel.Legal.license)){
				if (msg.getNewValue() != null) {
					basePart.setLicense(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setLicense("");
				}
			}
			if (EEFGenPackage.eINSTANCE.getEEFGenModel_TestsGenDirectory().equals(msg.getFeature()) && basePart != null && isAccessible(EEFGenViewsRepository.EEFGenModel.Parameters.testsGenerationDirectory)) {
				if (msg.getNewValue() != null) {
					basePart.setTestsGenerationDirectory(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setTestsGenerationDirectory("");
				}
			}
			if (EEFGenPackage.eINSTANCE.getEEFGenModel_UseJMergeForUserCode().equals(msg.getFeature()) && basePart != null && isAccessible(EEFGenViewsRepository.EEFGenModel.Parameters.useJMergeToManageUserCode))
				basePart.setUseJMergeToManageUserCode((Boolean)msg.getNewValue());
			
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == EEFGenViewsRepository.EEFGenModel.Parameters.generationDirectory;
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
				if (EEFGenViewsRepository.EEFGenModel.Parameters.generationDirectory == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(EEFGenPackage.eINSTANCE.getEEFGenModel_GenDirectory().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EEFGenPackage.eINSTANCE.getEEFGenModel_GenDirectory().getEAttributeType(), newValue);
				}
				if (EEFGenViewsRepository.EEFGenModel.Legal.author == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(EEFGenPackage.eINSTANCE.getEEFGenModel_Author().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EEFGenPackage.eINSTANCE.getEEFGenModel_Author().getEAttributeType(), newValue);
				}
				if (EEFGenViewsRepository.EEFGenModel.Legal.license == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(EEFGenPackage.eINSTANCE.getEEFGenModel_License().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EEFGenPackage.eINSTANCE.getEEFGenModel_License().getEAttributeType(), newValue);
				}
				if (EEFGenViewsRepository.EEFGenModel.Parameters.testsGenerationDirectory == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(EEFGenPackage.eINSTANCE.getEEFGenModel_TestsGenDirectory().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EEFGenPackage.eINSTANCE.getEEFGenModel_TestsGenDirectory().getEAttributeType(), newValue);
				}
				if (EEFGenViewsRepository.EEFGenModel.Parameters.useJMergeToManageUserCode == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(EEFGenPackage.eINSTANCE.getEEFGenModel_UseJMergeForUserCode().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EEFGenPackage.eINSTANCE.getEEFGenModel_UseJMergeForUserCode().getEAttributeType(), newValue);
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
