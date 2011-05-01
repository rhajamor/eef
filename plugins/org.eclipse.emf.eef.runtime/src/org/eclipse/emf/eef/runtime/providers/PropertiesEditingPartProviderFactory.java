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
package org.eclipse.emf.eef.runtime.providers;

/**
 * Defines the {@link PropertiesEditingPartProvider} factories interface.
 * 
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 */
public interface PropertiesEditingPartProviderFactory {

	/**
	 * Indicates whether this provider provides the specified ViewRepository.
	 * 
	 * @param key
	 *            the ViewRepository to provide
	 * @return <code>true</code> if this provider provides the ViewRepository; <code>false</code> otherwise.
	 */
	public abstract boolean provides(Object key);

	/**
	 * Register a new {@link PropertiesEditingPartProvider} in the factory.
	 * 
	 * @param editPropertiesProvider
	 */
	public abstract void register(PropertiesEditingPartProvider editPropertiesPartProvider);

	/**
	 * Provides a {@link PropertiesEditingPartProvider} for the specified ViewRepository.
	 * 
	 * @param the
	 *            ViewRepository to provide
	 * @return the {@link PropertiesEditingPartProvider} for the specified ViewRepository.
	 */
	public abstract PropertiesEditingPartProvider getProvider(Object key);

}
