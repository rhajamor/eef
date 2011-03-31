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
package org.eclipse.emf.eef.runtime.impl.services;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProviderFactory;
import org.eclipse.emf.eef.runtime.impl.providers.StandardPropertiesEditionPartProviderFactory;

/**
 * Service that manage all the registered {@link IPropertiesEditionPartProviderFactory}.
 * 
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 */
public class PropertiesEditionPartProviderService implements IPropertiesEditionPartProviderFactory {

	/**
	 * The extension name.
	 */
	public static final String EXTENSION_NAME = "PropertiesEditionPartProvider"; //$NON-NLS-1$

	/**
	 * The extension's element name.
	 */
	private static final String EXTENSION_ELEMENT_NAME = "PropertiesEditionPartProvider"; //$NON-NLS-1$

	/**
	 * The element's attribute name.
	 */
	private static final String EXTENSION_ATTRIBUTE_NAME = "providerClass"; //$NON-NLS-1$

	/**
	 * A singleton for the service.
	 */
	private static PropertiesEditionPartProviderService instance = new PropertiesEditionPartProviderService();

	/**
	 * The factory where the providers are registered.
	 */
	private IPropertiesEditionPartProviderFactory editPropertiesPartProviderFactory;

	/**
	 * Default constructor.
	 */
	private PropertiesEditionPartProviderService() {
		editPropertiesPartProviderFactory = new StandardPropertiesEditionPartProviderFactory();
		configureService();
	}

	/**
	 * Singleton constructor.
	 * 
	 * @return the Singleton instance
	 */
	public static PropertiesEditionPartProviderService getInstance() {
		return instance;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProviderFactory#getProvider(java.lang.Object)
	 */
	public IPropertiesEditionPartProvider getProvider(Object key) {
		return editPropertiesPartProviderFactory.getProvider(key);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProviderFactory#provides(java.lang.Object)
	 */
	public boolean provides(Object key) {
		return editPropertiesPartProviderFactory.provides(key);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProviderFactory#register(org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider)
	 */
	public void register(IPropertiesEditionPartProvider editPropertiesProvider) {
		editPropertiesPartProviderFactory.register(editPropertiesProvider);
	}

	/**
	 * Load all the providers registered by extension point.
	 */
	private void configureService() {
		IExtensionPoint extensionPoint = Platform.getExtensionRegistry().getExtensionPoint(
				EEFRuntimePlugin.PLUGIN_ID, EXTENSION_NAME);

		IExtension[] extensions = extensionPoint.getExtensions();
		for (int extensionIndex = 0; extensionIndex < extensions.length; extensionIndex++) {
			IExtension extension = extensions[extensionIndex];
			IConfigurationElement[] configurationElements = extension.getConfigurationElements();
			for (int i = 0; i < configurationElements.length; i++) {
				IConfigurationElement cfg = configurationElements[i];

				if (EXTENSION_ELEMENT_NAME.equals(cfg.getName())) {
					try {
						register((IPropertiesEditionPartProvider)cfg
								.createExecutableExtension(EXTENSION_ATTRIBUTE_NAME));
					} catch (CoreException e) {
						e.printStackTrace();
					}
				}
			}
		}

	}

}
