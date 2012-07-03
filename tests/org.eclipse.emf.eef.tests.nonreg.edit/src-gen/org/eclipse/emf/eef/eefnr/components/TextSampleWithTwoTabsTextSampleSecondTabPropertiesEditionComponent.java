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
import org.eclipse.emf.eef.eefnr.EefnrPackage;
import org.eclipse.emf.eef.eefnr.TextSampleWithTwoTabs;
import org.eclipse.emf.eef.eefnr.parts.EefnrViewsRepository;
import org.eclipse.emf.eef.eefnr.parts.TextSampleSecondTabPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;


// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class TextSampleWithTwoTabsTextSampleSecondTabPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String TEXTSAMPLESECONDTAB_PART = "TextSampleSecondTab"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public TextSampleWithTwoTabsTextSampleSecondTabPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject textSampleWithTwoTabs, String editing_mode) {
		super(editingContext, textSampleWithTwoTabs, editing_mode);
		parts = new String[] { TEXTSAMPLESECONDTAB_PART };
		repositoryKey = EefnrViewsRepository.class;
		partKey = EefnrViewsRepository.TextSampleSecondTab.class;
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
			final TextSampleWithTwoTabs textSampleWithTwoTabs = (TextSampleWithTwoTabs)elt;
			final TextSampleSecondTabPropertiesEditionPart textSampleSecondTabPart = (TextSampleSecondTabPropertiesEditionPart)editingPart;
			// init values
			if (textSampleWithTwoTabs.getTextOptionalPropertyInSecondTab() != null && isAccessible(EefnrViewsRepository.TextSampleSecondTab.Properties.textOptionalPropertyInSecondTab))
				textSampleSecondTabPart.setTextOptionalPropertyInSecondTab(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, textSampleWithTwoTabs.getTextOptionalPropertyInSecondTab()));
			
			if (textSampleWithTwoTabs.getTextRequiredPropertyInSecondTab() != null && isAccessible(EefnrViewsRepository.TextSampleSecondTab.Properties.textRequiredPropertyInSecondTab))
				textSampleSecondTabPart.setTextRequiredPropertyInSecondTab(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, textSampleWithTwoTabs.getTextRequiredPropertyInSecondTab()));
			
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
		if (editorKey == EefnrViewsRepository.TextSampleSecondTab.Properties.textOptionalPropertyInSecondTab) {
			return EefnrPackage.eINSTANCE.getTextSampleWithTwoTabs_TextOptionalPropertyInSecondTab();
		}
		if (editorKey == EefnrViewsRepository.TextSampleSecondTab.Properties.textRequiredPropertyInSecondTab) {
			return EefnrPackage.eINSTANCE.getTextSampleWithTwoTabs_TextRequiredPropertyInSecondTab();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		TextSampleWithTwoTabs textSampleWithTwoTabs = (TextSampleWithTwoTabs)semanticObject;
		if (EefnrViewsRepository.TextSampleSecondTab.Properties.textOptionalPropertyInSecondTab == event.getAffectedEditor()) {
			textSampleWithTwoTabs.setTextOptionalPropertyInSecondTab((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (EefnrViewsRepository.TextSampleSecondTab.Properties.textRequiredPropertyInSecondTab == event.getAffectedEditor()) {
			textSampleWithTwoTabs.setTextRequiredPropertyInSecondTab((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			TextSampleSecondTabPropertiesEditionPart textSampleSecondTabPart = (TextSampleSecondTabPropertiesEditionPart)editingPart;
			if (EefnrPackage.eINSTANCE.getTextSampleWithTwoTabs_TextOptionalPropertyInSecondTab().equals(msg.getFeature()) && textSampleSecondTabPart != null && isAccessible(EefnrViewsRepository.TextSampleSecondTab.Properties.textOptionalPropertyInSecondTab)) {
				if (msg.getNewValue() != null) {
					textSampleSecondTabPart.setTextOptionalPropertyInSecondTab(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					textSampleSecondTabPart.setTextOptionalPropertyInSecondTab("");
				}
			}
			if (EefnrPackage.eINSTANCE.getTextSampleWithTwoTabs_TextRequiredPropertyInSecondTab().equals(msg.getFeature()) && textSampleSecondTabPart != null && isAccessible(EefnrViewsRepository.TextSampleSecondTab.Properties.textRequiredPropertyInSecondTab)) {
				if (msg.getNewValue() != null) {
					textSampleSecondTabPart.setTextRequiredPropertyInSecondTab(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					textSampleSecondTabPart.setTextRequiredPropertyInSecondTab("");
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
		return key == EefnrViewsRepository.TextSampleFirstTab.Properties.textRequiredPropertyInFirstTab || key == EefnrViewsRepository.TextSampleSecondTab.Properties.textRequiredPropertyInSecondTab;
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
				if (EefnrViewsRepository.TextSampleSecondTab.Properties.textOptionalPropertyInSecondTab == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(EefnrPackage.eINSTANCE.getTextSampleWithTwoTabs_TextOptionalPropertyInSecondTab().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EefnrPackage.eINSTANCE.getTextSampleWithTwoTabs_TextOptionalPropertyInSecondTab().getEAttributeType(), newValue);
				}
				if (EefnrViewsRepository.TextSampleSecondTab.Properties.textRequiredPropertyInSecondTab == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(EefnrPackage.eINSTANCE.getTextSampleWithTwoTabs_TextRequiredPropertyInSecondTab().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EefnrPackage.eINSTANCE.getTextSampleWithTwoTabs_TextRequiredPropertyInSecondTab().getEAttributeType(), newValue);
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
