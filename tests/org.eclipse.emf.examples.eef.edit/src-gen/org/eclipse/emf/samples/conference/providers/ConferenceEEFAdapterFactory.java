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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.samples.conference.util.ConferenceAdapterFactory;


/**
 * @author <a href="mailto:stephane.bouchet@obeo.fr">Stephane Bouchet</a>
 * 
 */
public class ConferenceEEFAdapterFactory extends ConferenceAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.samples.conference.util.ConferenceAdapterFactory#createConferenceAdapter()
	 * 
	 */
	public Adapter createConferenceAdapter() {
		return new ConferencePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.samples.conference.util.ConferenceAdapterFactory#createPersonAdapter()
	 * 
	 */
	public Adapter createPersonAdapter() {
		return new PersonPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.samples.conference.util.ConferenceAdapterFactory#createTalkAdapter()
	 * 
	 */
	public Adapter createTalkAdapter() {
		return new TalkPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.samples.conference.util.ConferenceAdapterFactory#createTopicAdapter()
	 * 
	 */
	public Adapter createTopicAdapter() {
		return new TopicPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.samples.conference.util.ConferenceAdapterFactory#createSiteAdapter()
	 * 
	 */
	public Adapter createSiteAdapter() {
		return new SitePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.samples.conference.util.ConferenceAdapterFactory#createRoomAdapter()
	 * 
	 */
	public Adapter createRoomAdapter() {
		return new RoomPropertiesEditionProvider();
	}

}
