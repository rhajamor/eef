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
package org.eclipse.emf.eef.runtime.services;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingPartProvider;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingPartProviderFactory;
import org.eclipse.emf.eef.runtime.providers.impl.StandardPropertiesEditingPartProviderFactory;

/**
 * Service that manage all the registered {@link PropertiesEditingPartProviderFactory}.
 * 
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 */
public class PropertiesEditingPartProviderService implements PropertiesEditingPartProviderFactory {

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
	private static PropertiesEditingPartProviderService instance = new PropertiesEditingPartProviderService();

	/**
	 * The factory where the providers are registered.
	 */
	private PropertiesEditingPartProviderFactory editPropertiesPartProviderFactory;

	/**
	 * Default constructor.
	 */
	private PropertiesEditingPartProviderService() {
		editPropertiesPartProviderFactory = new StandardPropertiesEditingPartProviderFactory();
		configureService();
	}

	/**
	 * Singleton constructor.
	 * 
	 * @return the Singleton instance
	 */
	public static PropertiesEditingPartProviderService getInstance() {
		return instance;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingPartProviderFactory#getProvider(java.lang.Object)
	 */
	public PropertiesEditingPartProvider getProvider(Object key) {
		return editPropertiesPartProviderFactory.getProvider(key);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingPartProviderFactory#provides(java.lang.Object)
	 */
	public boolean provides(Object key) {
		return editPropertiesPartProviderFactory.provides(key);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingPartProviderFactory#register(org.eclipse.emf.eef.runtime.providers.PropertiesEditingPartProvider)
	 */
	public void register(PropertiesEditingPartProvider editPropertiesProvider) {
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
						register((PropertiesEditingPartProvider)cfg
								.createExecutableExtension(EXTENSION_ATTRIBUTE_NAME));
					} catch (CoreException e) {
						e.printStackTrace();
					}
				}
			}
		}

	}

}
