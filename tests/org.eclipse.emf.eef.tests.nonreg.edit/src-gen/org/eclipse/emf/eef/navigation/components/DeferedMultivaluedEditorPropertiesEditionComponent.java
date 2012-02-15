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
package org.eclipse.emf.eef.navigation.components;

// Start of user code for imports
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.eef.eefnr.navigation.DeferedMultivaluedEditorSample;
import org.eclipse.emf.eef.eefnr.navigation.NavigationPackage;
import org.eclipse.emf.eef.eefnr.navigation.parts.DeferedMultivaluedEditorPropertiesEditionPart;
import org.eclipse.emf.eef.eefnr.navigation.parts.NavigationViewsRepository;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.ui.widgets.settings.EEFEditorSettingsBuilder;
import org.eclipse.emf.eef.runtime.ui.widgets.settings.EEFEditorSettingsBuilder.EEFEditorSettingsImpl;
import org.eclipse.emf.eef.runtime.ui.widgets.settings.NavigationStepBuilder;


// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class DeferedMultivaluedEditorPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Settings for multivaluedEditor editor
	 */
	protected EEFEditorSettingsImpl multivaluedEditorSettings = (EEFEditorSettingsImpl) EEFEditorSettingsBuilder.create(semanticObject, NavigationPackage.eINSTANCE.getDeferedMultivaluedEditor_MultiValuedEditor())
																														.nextStep(NavigationStepBuilder.create(NavigationPackage.eINSTANCE.getDeferedMultivaluedEditorSample_DeferedEditor())			
																																	.index(0).build())
																														.build();
	
	/**
	 * Default constructor
	 * 
	 */
	public DeferedMultivaluedEditorPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject deferedMultivaluedEditorSample, String editing_mode) {
		super(editingContext, deferedMultivaluedEditorSample, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = NavigationViewsRepository.class;
		partKey = NavigationViewsRepository.DeferedMultivaluedEditor.class;
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
			final DeferedMultivaluedEditorSample deferedMultivaluedEditorSample = (DeferedMultivaluedEditorSample)elt;
			final DeferedMultivaluedEditorPropertiesEditionPart basePart = (DeferedMultivaluedEditorPropertiesEditionPart)editingPart;
			// init values
			if (deferedMultivaluedEditorSample.getMultiValuedEditor() != null && isAccessible(NavigationViewsRepository.DeferedMultivaluedEditor.Properties.multivaluedEditor))
				basePart.setMultivaluedEditor(deferedMultivaluedEditorSample.getMultiValuedEditor());
			
			// init filters
			
			// init values for referenced views
			
			// init filters for referenced views
			
		}
		setInitializing(false);
	}



	
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent#shouldProcess(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 */
	protected boolean shouldProcess(IPropertiesEditionEvent event) {
		if (event.getAffectedEditor() == NavigationViewsRepository.DeferedMultivaluedEditor.Properties.multivaluedEditor) {
			return (multivaluedEditorSettings.getValue() == null) ? (event.getNewValue() != null) : (!multivaluedEditorSettings.getValue().equals(event.getNewValue()));
		}
		return super.shouldProcess(event);
	}	

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#associatedFeature(java.lang.Object)
	 */
	public EStructuralFeature associatedFeature(Object editorKey) {
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		DeferedMultivaluedEditorSample deferedMultivaluedEditorSample = (DeferedMultivaluedEditorSample)semanticObject;
		if (NavigationViewsRepository.DeferedMultivaluedEditor.Properties.multivaluedEditor == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				deferedMultivaluedEditorSample.getMultiValuedEditor().clear();
				deferedMultivaluedEditorSample.getMultiValuedEditor().addAll(((List) event.getNewValue()));
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			DeferedMultivaluedEditorPropertiesEditionPart basePart = (DeferedMultivaluedEditorPropertiesEditionPart)editingPart;
			if (NavigationPackage.eINSTANCE.getDeferedMultivaluedEditor_MultiValuedEditor().equals(msg.getFeature()) && basePart != null && isAccessible(NavigationViewsRepository.DeferedMultivaluedEditor.Properties.multivaluedEditor)) {
				basePart.setMultivaluedEditor(((DeferedMultivaluedEditorSample)semanticObject).getMultivaluedEditor());
			}
			
			
		}
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
				if (NavigationViewsRepository.DeferedMultivaluedEditor.Properties.multivaluedEditor == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(NavigationPackage.eINSTANCE.getDeferedMultivaluedEditor_MultiValuedEditor().getEAttributeType(), iterator.next()));
					}
					ret = chain;
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
