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
package org.eclipse.emf.eef.runtime.impl.providers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProviderFactory;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 */
public class StandardPropertiesEditionPartProviderFactory implements IPropertiesEditionPartProviderFactory {

	/**
	 * List of managed providers.
	 */
	private List<IPropertiesEditionPartProvider> editPropertiesPartProviders;

	/**
	 * Default constructor.
	 */
	public StandardPropertiesEditionPartProviderFactory() {
		editPropertiesPartProviders = new ArrayList<IPropertiesEditionPartProvider>();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProviderFactory#getProvider(java.lang.Object)
	 */
	public IPropertiesEditionPartProvider getProvider(Object key) {
		for (IPropertiesEditionPartProvider editPropertiesPartProvider : editPropertiesPartProviders) {
			if (editPropertiesPartProvider.provides(key))
				return editPropertiesPartProvider;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProviderFactory#provides(java.lang.Object)
	 */
	public boolean provides(Object key) {
		for (IPropertiesEditionPartProvider editPropertiesPartProvider : editPropertiesPartProviders) {
			if (editPropertiesPartProvider.provides(key))
				return true;
		}
		return false;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProviderFactory#register(org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider)
	 */
	public void register(IPropertiesEditionPartProvider editPropertiesPartProvider) {
		editPropertiesPartProviders.add(editPropertiesPartProvider);
	}

}
