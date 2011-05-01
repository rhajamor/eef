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
import org.eclipse.emf.samples.conference.Person;
import org.eclipse.emf.samples.conference.parts.ConferenceViewsRepository;
import org.eclipse.emf.samples.conference.parts.PersonPropertiesEditionPart;
import org.eclipse.emf.samples.conference.parts.PresencePropertiesEditionPart;


// End of user code

/**
 * @author <a href="mailto:stephane.bouchet@obeo.fr">Stephane Bouchet</a>
 * 
 */
public class PersonPropertiesEditionComponent extends ComposedPropertiesEditingComponent {

	/**
	 * The Base part
	 * 
	 */
	private PersonPropertiesEditionPart basePart;

	/**
	 * The PersonBasePropertiesEditionComponent sub component
	 * 
	 */
	protected PersonBasePropertiesEditionComponent personBasePropertiesEditionComponent;

	/**
	 * The Presence part
	 * 
	 */
	private PresencePropertiesEditionPart presencePart;

	/**
	 * The PersonPresencePropertiesEditionComponent sub component
	 * 
	 */
	protected PersonPresencePropertiesEditionComponent personPresencePropertiesEditionComponent;
	/**
	 * Parameterized constructor
	 * 
	 * @param person the EObject to edit
	 * 
	 */
	public PersonPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject person, String editing_mode) {
		super(editingContext, editing_mode);
		if (person instanceof Person) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(person, PropertiesEditingProvider.class);
			personBasePropertiesEditionComponent = (PersonBasePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, PersonBasePropertiesEditionComponent.BASE_PART, PersonBasePropertiesEditionComponent.class);
			addSubComponent(personBasePropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(person, PropertiesEditingProvider.class);
			personPresencePropertiesEditionComponent = (PersonPresencePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, PersonPresencePropertiesEditionComponent.PRESENCE_PART, PersonPresencePropertiesEditionComponent.class);
			addSubComponent(personPresencePropertiesEditionComponent);
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
		if (PersonBasePropertiesEditionComponent.BASE_PART.equals(key)) {
			basePart = (PersonPropertiesEditionPart)personBasePropertiesEditionComponent.getPropertiesEditingPart(kind, key);
			return (PropertiesEditingPart)basePart;
		}
		if (PersonPresencePropertiesEditionComponent.PRESENCE_PART.equals(key)) {
			presencePart = (PresencePropertiesEditionPart)personPresencePropertiesEditionComponent.getPropertiesEditingPart(kind, key);
			return (PropertiesEditingPart)presencePart;
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
		if (ConferenceViewsRepository.Person.class == key) {
			super.setPropertiesEditingPart(key, kind, propertiesEditionPart);
			basePart = (PersonPropertiesEditionPart)propertiesEditionPart;
		}
		if (ConferenceViewsRepository.Presence.class == key) {
			super.setPropertiesEditingPart(key, kind, propertiesEditionPart);
			presencePart = (PresencePropertiesEditionPart)propertiesEditionPart;
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
		if (key == ConferenceViewsRepository.Person.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == ConferenceViewsRepository.Presence.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
