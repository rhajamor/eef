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
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.eefnr.EefnrPackage;
import org.eclipse.emf.eef.eefnr.TextSampleWithTwoTabs;
import org.eclipse.emf.eef.eefnr.parts.EefnrViewsRepository;
import org.eclipse.emf.eef.eefnr.parts.TextSampleFirstTabPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
	

// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class TextSampleWithTwoTabsTextSampleFirstTabPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String TEXTSAMPLEFIRSTTAB_PART = "TextSampleFirstTab"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public TextSampleWithTwoTabsTextSampleFirstTabPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject textSampleWithTwoTabs, String editing_mode) {
		super(editingContext, textSampleWithTwoTabs, editing_mode);
		parts = new String[] { TEXTSAMPLEFIRSTTAB_PART };
		repositoryKey = EefnrViewsRepository.class;
		partKey = EefnrViewsRepository.TextSampleFirstTab.class;
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
			final TextSampleFirstTabPropertiesEditionPart textSampleFirstTabPart = (TextSampleFirstTabPropertiesEditionPart)editingPart;
			// init values
			if (textSampleWithTwoTabs.getTextOptionalPropertyInFirstTab() != null && isAccessible(EefnrViewsRepository.TextSampleFirstTab.Properties.textOptionalPropertyInFirstTab))
				textSampleFirstTabPart.setTextOptionalPropertyInFirstTab(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), textSampleWithTwoTabs.getTextOptionalPropertyInFirstTab()));
			
			if (textSampleWithTwoTabs.getTextRequiredPropertyInFirstTab() != null && isAccessible(EefnrViewsRepository.TextSampleFirstTab.Properties.textRequiredPropertyInFirstTab))
				textSampleFirstTabPart.setTextRequiredPropertyInFirstTab(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), textSampleWithTwoTabs.getTextRequiredPropertyInFirstTab()));
			
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
		if (editorKey == EefnrViewsRepository.TextSampleFirstTab.Properties.textOptionalPropertyInFirstTab) {
			return EefnrPackage.eINSTANCE.getTextSampleWithTwoTabs_TextOptionalPropertyInFirstTab();
		}
		if (editorKey == EefnrViewsRepository.TextSampleFirstTab.Properties.textRequiredPropertyInFirstTab) {
			return EefnrPackage.eINSTANCE.getTextSampleWithTwoTabs_TextRequiredPropertyInFirstTab();
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
		if (EefnrViewsRepository.TextSampleFirstTab.Properties.textOptionalPropertyInFirstTab == event.getAffectedEditor()) {
			textSampleWithTwoTabs.setTextOptionalPropertyInFirstTab((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (EefnrViewsRepository.TextSampleFirstTab.Properties.textRequiredPropertyInFirstTab == event.getAffectedEditor()) {
			textSampleWithTwoTabs.setTextRequiredPropertyInFirstTab((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			TextSampleFirstTabPropertiesEditionPart textSampleFirstTabPart = (TextSampleFirstTabPropertiesEditionPart)editingPart;
			if (EefnrPackage.eINSTANCE.getTextSampleWithTwoTabs_TextOptionalPropertyInFirstTab().equals(msg.getFeature()) && textSampleFirstTabPart != null && isAccessible(EefnrViewsRepository.TextSampleFirstTab.Properties.textOptionalPropertyInFirstTab)) {
				if (msg.getNewValue() != null) {
					textSampleFirstTabPart.setTextOptionalPropertyInFirstTab(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					textSampleFirstTabPart.setTextOptionalPropertyInFirstTab("");
				}
			}
			if (EefnrPackage.eINSTANCE.getTextSampleWithTwoTabs_TextRequiredPropertyInFirstTab().equals(msg.getFeature()) && textSampleFirstTabPart != null && isAccessible(EefnrViewsRepository.TextSampleFirstTab.Properties.textRequiredPropertyInFirstTab)) {
				if (msg.getNewValue() != null) {
					textSampleFirstTabPart.setTextRequiredPropertyInFirstTab(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					textSampleFirstTabPart.setTextRequiredPropertyInFirstTab("");
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
				if (EefnrViewsRepository.TextSampleFirstTab.Properties.textOptionalPropertyInFirstTab == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(EefnrPackage.eINSTANCE.getTextSampleWithTwoTabs_TextOptionalPropertyInFirstTab().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EefnrPackage.eINSTANCE.getTextSampleWithTwoTabs_TextOptionalPropertyInFirstTab().getEAttributeType(), newValue);
				}
				if (EefnrViewsRepository.TextSampleFirstTab.Properties.textRequiredPropertyInFirstTab == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(EefnrPackage.eINSTANCE.getTextSampleWithTwoTabs_TextRequiredPropertyInFirstTab().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EefnrPackage.eINSTANCE.getTextSampleWithTwoTabs_TextRequiredPropertyInFirstTab().getEAttributeType(), newValue);
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
