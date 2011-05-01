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
package org.eclipse.emf.eef.runtime.providers.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingPartProvider;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingPartProviderFactory;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 */
public class StandardPropertiesEditingPartProviderFactory implements PropertiesEditingPartProviderFactory {

	/**
	 * List of managed providers.
	 */
	private List<PropertiesEditingPartProvider> editPropertiesPartProviders;

	/**
	 * Default constructor.
	 */
	public StandardPropertiesEditingPartProviderFactory() {
		editPropertiesPartProviders = new ArrayList<PropertiesEditingPartProvider>();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingPartProviderFactory#getProvider(java.lang.Object)
	 */
	public PropertiesEditingPartProvider getProvider(Object key) {
		for (PropertiesEditingPartProvider editPropertiesPartProvider : editPropertiesPartProviders) {
			if (editPropertiesPartProvider.provides(key))
				return editPropertiesPartProvider;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingPartProviderFactory#provides(java.lang.Object)
	 */
	public boolean provides(Object key) {
		for (PropertiesEditingPartProvider editPropertiesPartProvider : editPropertiesPartProviders) {
			if (editPropertiesPartProvider.provides(key))
				return true;
		}
		return false;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingPartProviderFactory#register(org.eclipse.emf.eef.runtime.providers.PropertiesEditingPartProvider)
	 */
	public void register(PropertiesEditingPartProvider editPropertiesPartProvider) {
		editPropertiesPartProviders.add(editPropertiesPartProvider);
	}

}
