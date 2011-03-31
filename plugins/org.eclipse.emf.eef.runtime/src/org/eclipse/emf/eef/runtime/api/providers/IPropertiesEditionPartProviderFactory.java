/*******************************************************************************
 * Copyright (c) 2008, 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.runtime.api.providers;

/**
 * Defines the {@link IPropertiesEditionPartProvider} factories interface.
 * 
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 */
public interface IPropertiesEditionPartProviderFactory {

	/**
	 * Indicates whether this provider provides the specified ViewRepository.
	 * 
	 * @param key
	 *            the ViewRepository to provide
	 * @return <code>true</code> if this provider provides the ViewRepository; <code>false</code> otherwise.
	 */
	public abstract boolean provides(Object key);

	/**
	 * Register a new {@link IPropertiesEditionPartProvider} in the factory.
	 * 
	 * @param editPropertiesProvider
	 */
	public abstract void register(IPropertiesEditionPartProvider editPropertiesPartProvider);

	/**
	 * Provides a {@link IPropertiesEditionPartProvider} for the specified ViewRepository.
	 * 
	 * @param the
	 *            ViewRepository to provide
	 * @return the {@link IPropertiesEditionPartProvider} for the specified ViewRepository.
	 */
	public abstract IPropertiesEditionPartProvider getProvider(Object key);

}
