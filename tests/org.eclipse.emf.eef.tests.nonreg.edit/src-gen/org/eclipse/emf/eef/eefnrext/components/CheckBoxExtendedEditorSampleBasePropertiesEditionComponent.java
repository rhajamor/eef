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
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.eefnr.EefnrPackage;
import org.eclipse.emf.eef.eefnr.references.parts.ReferencesViewsRepository;
import org.eclipse.emf.eef.eefnrext.CheckBoxExtendedEditorSample;
import org.eclipse.emf.eef.eefnrext.EefnrextPackage;
import org.eclipse.emf.eef.eefnrext.parts.CheckBoxExtendedEditorSamplePropertiesEditionPart;
import org.eclipse.emf.eef.eefnrext.parts.EefnrextViewsRepository;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
	

// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class CheckBoxExtendedEditorSampleBasePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Default constructor
	 * 
	 */
	public CheckBoxExtendedEditorSampleBasePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject checkBoxExtendedEditorSample, String editing_mode) {
		super(editingContext, checkBoxExtendedEditorSample, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = EefnrextViewsRepository.class;
		partKey = EefnrextViewsRepository.CheckBoxExtendedEditorSample.class;
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
			final CheckBoxExtendedEditorSample checkBoxExtendedEditorSample = (CheckBoxExtendedEditorSample)elt;
			final CheckBoxExtendedEditorSamplePropertiesEditionPart basePart = (CheckBoxExtendedEditorSamplePropertiesEditionPart)editingPart;
			// init values
			basePart.setCheckboxEditorSample(checkBoxExtendedEditorSample.isCheckboxEditorSample());
			
			// init filters
			
		}
		// init values for referenced views
		
		// init filters for referenced views
		
		
		setInitializing(false);
	}





	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		CheckBoxExtendedEditorSample checkBoxExtendedEditorSample = (CheckBoxExtendedEditorSample)semanticObject;
		if (EefnrextViewsRepository.CheckBoxExtendedEditorSample.Properties.checkboxEditorSample == event.getAffectedEditor()) {
			checkBoxExtendedEditorSample.setCheckboxEditorSample((Boolean)event.getNewValue());	
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		CheckBoxExtendedEditorSamplePropertiesEditionPart basePart = (CheckBoxExtendedEditorSamplePropertiesEditionPart)editingPart;
		if (EefnrextPackage.eINSTANCE.getCheckBoxExtendedEditorSample_CheckboxEditorSample().equals(msg.getFeature()) && basePart != null)
			basePart.setCheckboxEditorSample((Boolean)msg.getNewValue());
		
		
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
			String newStringValue = event.getNewValue().toString();
			try {
				if (EefnrextViewsRepository.CheckBoxExtendedEditorSample.Properties.checkboxEditorSample == event.getAffectedEditor()) {
					Object newValue = EcoreUtil.createFromString(EefnrextPackage.eINSTANCE.getCheckBoxExtendedEditorSample_CheckboxEditorSample().getEAttributeType(), newStringValue);
					ret = Diagnostician.INSTANCE.validate(EefnrextPackage.eINSTANCE.getCheckBoxExtendedEditorSample_CheckboxEditorSample().getEAttributeType(), newValue);
				}
				if (ReferencesViewsRepository.AbstractSample.NameProperties.name == event.getAffectedEditor()) {
					Object newValue = EcoreUtil.createFromString(EefnrPackage.eINSTANCE.getAbstractSample_Name().getEAttributeType(), newStringValue);
					ret = Diagnostician.INSTANCE.validate(EefnrPackage.eINSTANCE.getAbstractSample_Name().getEAttributeType(), newValue);
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
