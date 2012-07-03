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
package org.eclipse.emf.eef.naming.providers;

import org.eclipse.emf.common.notify.Adapter;

import org.eclipse.emf.eef.eefnr.naming.util.CustomNamingAdapterFactory;

import org.eclipse.emf.eef.naming.providers.EventPropertiesEditionProvider;

import org.eclipse.emf.eef.references.providers.AbstractSamplePropertiesEditionProvider;

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class NamingEEFAdapterFactory extends CustomNamingAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.eefnr.naming.util.CustomNamingAdapterFactory#createAbstractSampleAdapter()
	 * 
	 */
	public Adapter createAbstractSampleAdapter() {
		return new AbstractSamplePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.eefnr.naming.util.CustomNamingAdapterFactory#createEventAdapter()
	 * 
	 */
	public Adapter createEventAdapter() {
		return new EventPropertiesEditionProvider();
	}

}
