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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.eef.runtime.components.impl.ComposedPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.parts.PropertiesEditingPart;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.samples.conference.Conference;
import org.eclipse.emf.samples.conference.parts.ConferencePropertiesEditionPart;
import org.eclipse.emf.samples.conference.parts.ConferenceViewsRepository;
import org.eclipse.emf.samples.conference.parts.LocalisationPropertiesEditionPart;
import org.eclipse.emf.samples.conference.parts.ParticipantsPropertiesEditionPart;
import org.eclipse.emf.samples.conference.parts.TalksAndTopicsPropertiesEditionPart;


// End of user code

/**
 * @author <a href="mailto:stephane.bouchet@obeo.fr">Stephane Bouchet</a>
 * 
 */
public class ConferencePropertiesEditionComponent extends ComposedPropertiesEditingComponent {

	/**
	 * The Base part
	 * 
	 */
	private ConferencePropertiesEditionPart basePart;

	/**
	 * The ConferenceBasePropertiesEditionComponent sub component
	 * 
	 */
	protected ConferenceBasePropertiesEditionComponent conferenceBasePropertiesEditionComponent;

	/**
	 * The Localisation part
	 * 
	 */
	private LocalisationPropertiesEditionPart localisationPart;

	/**
	 * The ConferenceLocalisationPropertiesEditionComponent sub component
	 * 
	 */
	protected ConferenceLocalisationPropertiesEditionComponent conferenceLocalisationPropertiesEditionComponent;

	/**
	 * The Participants part
	 * 
	 */
	private ParticipantsPropertiesEditionPart participantsPart;

	/**
	 * The ConferenceParticipantsPropertiesEditionComponent sub component
	 * 
	 */
	protected ConferenceParticipantsPropertiesEditionComponent conferenceParticipantsPropertiesEditionComponent;

	/**
	 * The Talks and Topics part
	 * 
	 */
	private TalksAndTopicsPropertiesEditionPart talksAndTopicsPart;

	/**
	 * The ConferenceTalksAndTopicsPropertiesEditionComponent sub component
	 * 
	 */
	protected ConferenceTalksAndTopicsPropertiesEditionComponent conferenceTalksAndTopicsPropertiesEditionComponent;
	/**
	 * Parameterized constructor
	 * 
	 * @param conference the EObject to edit
	 * 
	 */
	public ConferencePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject conference, String editing_mode) {
		super(editingContext, editing_mode);
		if (conference instanceof Conference) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(conference, PropertiesEditingProvider.class);
			conferenceBasePropertiesEditionComponent = (ConferenceBasePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, ConferenceBasePropertiesEditionComponent.BASE_PART, ConferenceBasePropertiesEditionComponent.class);
			addSubComponent(conferenceBasePropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(conference, PropertiesEditingProvider.class);
			conferenceLocalisationPropertiesEditionComponent = (ConferenceLocalisationPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, ConferenceLocalisationPropertiesEditionComponent.LOCALISATION_PART, ConferenceLocalisationPropertiesEditionComponent.class);
			addSubComponent(conferenceLocalisationPropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(conference, PropertiesEditingProvider.class);
			conferenceParticipantsPropertiesEditionComponent = (ConferenceParticipantsPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, ConferenceParticipantsPropertiesEditionComponent.PARTICIPANTS_PART, ConferenceParticipantsPropertiesEditionComponent.class);
			addSubComponent(conferenceParticipantsPropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(conference, PropertiesEditingProvider.class);
			conferenceTalksAndTopicsPropertiesEditionComponent = (ConferenceTalksAndTopicsPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, ConferenceTalksAndTopicsPropertiesEditionComponent.TALKSANDTOPICS_PART, ConferenceTalksAndTopicsPropertiesEditionComponent.class);
			addSubComponent(conferenceTalksAndTopicsPropertiesEditionComponent);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.components.impl.ComposedPropertiesEditingComponent#
	 *      getPropertiesEditingPart(int, java.lang.String)
	 * 
	 */
	public PropertiesEditingPart getPropertiesEditingPart(int kind, String key) {
		if (ConferenceBasePropertiesEditionComponent.BASE_PART.equals(key)) {
			basePart = (ConferencePropertiesEditionPart)conferenceBasePropertiesEditionComponent.getPropertiesEditingPart(kind, key);
			return (PropertiesEditingPart)basePart;
		}
		if (ConferenceLocalisationPropertiesEditionComponent.LOCALISATION_PART.equals(key)) {
			localisationPart = (LocalisationPropertiesEditionPart)conferenceLocalisationPropertiesEditionComponent.getPropertiesEditingPart(kind, key);
			return (PropertiesEditingPart)localisationPart;
		}
		if (ConferenceParticipantsPropertiesEditionComponent.PARTICIPANTS_PART.equals(key)) {
			participantsPart = (ParticipantsPropertiesEditionPart)conferenceParticipantsPropertiesEditionComponent.getPropertiesEditingPart(kind, key);
			return (PropertiesEditingPart)participantsPart;
		}
		if (ConferenceTalksAndTopicsPropertiesEditionComponent.TALKSANDTOPICS_PART.equals(key)) {
			talksAndTopicsPart = (TalksAndTopicsPropertiesEditionPart)conferenceTalksAndTopicsPropertiesEditionComponent.getPropertiesEditingPart(kind, key);
			return (PropertiesEditingPart)talksAndTopicsPart;
		}
		return super.getPropertiesEditingPart(kind, key);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.components.impl.ComposedPropertiesEditingComponent#
	 *      setPropertiesEditingPart(java.lang.Object, int,
	 *      org.eclipse.emf.eef.runtime.parts.PropertiesEditingPart)
	 * 
	 */
	public void setPropertiesEditingPart(java.lang.Object key, int kind, PropertiesEditingPart propertiesEditionPart) {
		if (ConferenceViewsRepository.Conference_.class == key) {
			super.setPropertiesEditingPart(key, kind, propertiesEditionPart);
			basePart = (ConferencePropertiesEditionPart)propertiesEditionPart;
		}
		if (ConferenceViewsRepository.Localisation.class == key) {
			super.setPropertiesEditingPart(key, kind, propertiesEditionPart);
			localisationPart = (LocalisationPropertiesEditionPart)propertiesEditionPart;
		}
		if (ConferenceViewsRepository.Participants.class == key) {
			super.setPropertiesEditingPart(key, kind, propertiesEditionPart);
			participantsPart = (ParticipantsPropertiesEditionPart)propertiesEditionPart;
		}
		if (ConferenceViewsRepository.TalksAndTopics.class == key) {
			super.setPropertiesEditingPart(key, kind, propertiesEditionPart);
			talksAndTopicsPart = (TalksAndTopicsPropertiesEditionPart)propertiesEditionPart;
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.components.impl.ComposedPropertiesEditingComponent#
	 *      initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject,
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(java.lang.Object key, int kind, EObject element, ResourceSet allResource) {
		if (key == ConferenceViewsRepository.Conference_.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == ConferenceViewsRepository.Localisation.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == ConferenceViewsRepository.Participants.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == ConferenceViewsRepository.TalksAndTopics.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
