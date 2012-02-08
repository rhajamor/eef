/*******************************************************************************
 * Copyright (c) 2009 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.samples.conference.components;

// Start of user code for imports

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.emf.samples.conference.ConferencePackage;
import org.eclipse.emf.samples.conference.Person;
import org.eclipse.emf.samples.conference.Talk;
import org.eclipse.emf.samples.conference.parts.ConferenceViewsRepository;
import org.eclipse.emf.samples.conference.parts.PresencePropertiesEditionPart;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

// End of user code

/**
 * @author <a href="mailto:stephane.bouchet@obeo.fr">Stephane Bouchet</a>
 * 
 */
public class PersonPresencePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String PRESENCE_PART = "Presence"; //$NON-NLS-1$

	
	/**
	 * Settings for assists ReferencesTable
	 */
	private	ReferencesTableSettings assistsSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public PersonPresencePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject person, String editing_mode) {
		super(editingContext, person, editing_mode);
		parts = new String[] { PRESENCE_PART };
		repositoryKey = ConferenceViewsRepository.class;
		partKey = ConferenceViewsRepository.Presence.class;
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
			final Person person = (Person)elt;
			final PresencePropertiesEditionPart presencePart = (PresencePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(ConferenceViewsRepository.Presence.Talks.assists)) {
				assistsSettings = new ReferencesTableSettings(person, ConferencePackage.eINSTANCE.getPerson_Assists());
				presencePart.initAssists(assistsSettings);
			}
			// init filters
			if (isAccessible(ConferenceViewsRepository.Presence.Talks.assists)) {
				presencePart.addFilterToAssists(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!presencePart.isContainedInAssistsTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				presencePart.addFilterToAssists(new EObjectFilter(ConferencePackage.eINSTANCE.getTalk()));
				// Start of user code for additional businessfilters for assists
																																											
																																											// End of user code
			}
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
		if (editorKey == ConferenceViewsRepository.Presence.Talks.assists) {
			return ConferencePackage.eINSTANCE.getPerson_Assists();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Person person = (Person)semanticObject;
		if (ConferenceViewsRepository.Presence.Talks.assists == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Talk) {
					assistsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				assistsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				assistsSettings.move(event.getNewIndex(), (Talk) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			PresencePropertiesEditionPart presencePart = (PresencePropertiesEditionPart)editingPart;
			if (ConferencePackage.eINSTANCE.getPerson_Assists().equals(msg.getFeature())  && isAccessible(ConferenceViewsRepository.Presence.Talks.assists))
				presencePart.updateAssists();
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == ConferenceViewsRepository.Person.Identity.firstname || key == ConferenceViewsRepository.Person.Identity.age;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#getHelpContent(java.lang.Object, int)
	 * 
	 */
	public String getHelpContent(Object key, int kind) {
		if (key == ConferenceViewsRepository.Person.Identity.firstname)
			return "Firstname of the person"; //$NON-NLS-1$
		if (key == ConferenceViewsRepository.Person.Identity.lastname)
			return "Last name of the person"; //$NON-NLS-1$
		if (key == ConferenceViewsRepository.Person.Identity.age)
			return "age of the person"; //$NON-NLS-1$
		if (key == ConferenceViewsRepository.Person.EclipseStatus.eclipseCommiter)
			return "Does the person commit on Eclipse"; //$NON-NLS-1$
		if (key == ConferenceViewsRepository.Presence.Talks.assists)
			return "Talks which the person attends"; //$NON-NLS-1$
		if (key == ConferenceViewsRepository.Person.Identity.gender)
			return "Gender of the person"; //$NON-NLS-1$
		if (key == ConferenceViewsRepository.Person.EclipseStatus.isRegistered)
			return "Does the person is registered for the conference"; //$NON-NLS-1$
		return super.getHelpContent(key, kind);
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
