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
package org.eclipse.emf.samples.conference.providers;

import java.util.List;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.providers.impl.PropertiesEditingProviderImpl;
import org.eclipse.emf.samples.conference.Conference;
import org.eclipse.emf.samples.conference.ConferencePackage;
import org.eclipse.emf.samples.conference.components.ConferenceBasePropertiesEditionComponent;
import org.eclipse.emf.samples.conference.components.ConferenceLocalisationPropertiesEditionComponent;
import org.eclipse.emf.samples.conference.components.ConferenceParticipantsPropertiesEditionComponent;
import org.eclipse.emf.samples.conference.components.ConferencePropertiesEditionComponent;
import org.eclipse.emf.samples.conference.components.ConferenceTalksAndTopicsPropertiesEditionComponent;

/**
 * @author <a href="mailto:stephane.bouchet@obeo.fr">Stephane Bouchet</a>
 * 
 */
public class ConferencePropertiesEditionProvider extends PropertiesEditingProviderImpl {

	/**
	 * Constructor without provider for super types.
	 */
	public ConferencePropertiesEditionProvider() {
		super();
	}

	/**
	 * Constructor with providers for super types.
	 * @param superProviders providers to use for super types.
	 */
	public ConferencePropertiesEditionProvider(List<PropertiesEditingProvider> superProviders) {
		super(superProviders);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext)
	 * 
	 */
	public boolean provides(PropertiesEditingContext editingContext) {
		return (editingContext.getEObject() instanceof Conference) 
					&& (ConferencePackage.eINSTANCE.getConference() == editingContext.getEObject().eClass());
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String)
	 * 
	 */
	public boolean provides(PropertiesEditingContext editingContext, String part) {
		return (editingContext.getEObject() instanceof Conference) && (ConferenceBasePropertiesEditionComponent.BASE_PART.equals(part) || ConferenceLocalisationPropertiesEditionComponent.LOCALISATION_PART.equals(part) || ConferenceParticipantsPropertiesEditionComponent.PARTICIPANTS_PART.equals(part) || ConferenceTalksAndTopicsPropertiesEditionComponent.TALKSANDTOPICS_PART.equals(part));
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.Class)
	 * 
	 */
	@SuppressWarnings("rawtypes")
	public boolean provides(PropertiesEditingContext editingContext, java.lang.Class refinement) {
		return (editingContext.getEObject() instanceof Conference) && (refinement == ConferenceBasePropertiesEditionComponent.class || refinement == ConferenceLocalisationPropertiesEditionComponent.class || refinement == ConferenceParticipantsPropertiesEditionComponent.class || refinement == ConferenceTalksAndTopicsPropertiesEditionComponent.class);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String, java.lang.Class)
	 * 
	 */
	@SuppressWarnings("rawtypes")
	public boolean provides(PropertiesEditingContext editingContext, String part, java.lang.Class refinement) {
		return (editingContext.getEObject() instanceof Conference) && ((ConferenceBasePropertiesEditionComponent.BASE_PART.equals(part) && refinement == ConferenceBasePropertiesEditionComponent.class) || (ConferenceLocalisationPropertiesEditionComponent.LOCALISATION_PART.equals(part) && refinement == ConferenceLocalisationPropertiesEditionComponent.class) || (ConferenceParticipantsPropertiesEditionComponent.PARTICIPANTS_PART.equals(part) && refinement == ConferenceParticipantsPropertiesEditionComponent.class) || (ConferenceTalksAndTopicsPropertiesEditionComponent.TALKSANDTOPICS_PART.equals(part) && refinement == ConferenceTalksAndTopicsPropertiesEditionComponent.class));
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String)
	 * 
	 */
	public IPropertiesEditionComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext, String mode) {
		if (editingContext.getEObject() instanceof Conference) {
			return new ConferencePropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
		}
		return super.getPropertiesEditingComponent(editingContext, mode);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String, java.lang.String)
	 * 
	 */
	public IPropertiesEditionComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext, String mode, String part) {
		if (editingContext.getEObject() instanceof Conference) {
			if (ConferenceBasePropertiesEditionComponent.BASE_PART.equals(part))
				return new ConferenceBasePropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (ConferenceLocalisationPropertiesEditionComponent.LOCALISATION_PART.equals(part))
				return new ConferenceLocalisationPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (ConferenceParticipantsPropertiesEditionComponent.PARTICIPANTS_PART.equals(part))
				return new ConferenceParticipantsPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (ConferenceTalksAndTopicsPropertiesEditionComponent.TALKSANDTOPICS_PART.equals(part))
				return new ConferenceTalksAndTopicsPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
		}
		return super.getPropertiesEditingComponent(editingContext, mode, part);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String, java.lang.String, java.lang.Class)
	 */
	@SuppressWarnings("rawtypes")
	public IPropertiesEditionComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext, String mode, String part, java.lang.Class refinement) {
		if (editingContext.getEObject() instanceof Conference) {
			if (ConferenceBasePropertiesEditionComponent.BASE_PART.equals(part)
				&& refinement == ConferenceBasePropertiesEditionComponent.class)
				return new ConferenceBasePropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (ConferenceLocalisationPropertiesEditionComponent.LOCALISATION_PART.equals(part)
				&& refinement == ConferenceLocalisationPropertiesEditionComponent.class)
				return new ConferenceLocalisationPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (ConferenceParticipantsPropertiesEditionComponent.PARTICIPANTS_PART.equals(part)
				&& refinement == ConferenceParticipantsPropertiesEditionComponent.class)
				return new ConferenceParticipantsPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (ConferenceTalksAndTopicsPropertiesEditionComponent.TALKSANDTOPICS_PART.equals(part)
				&& refinement == ConferenceTalksAndTopicsPropertiesEditionComponent.class)
				return new ConferenceTalksAndTopicsPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
		}
		return super.getPropertiesEditingComponent(editingContext, mode, part, refinement);
	}

}
