/*******************************************************************************
 * Copyright (c) 2008, 2009 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.codegen.core.services;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.eef.codegen.EEFCodegenPlugin;
import org.eclipse.emf.eef.codegen.core.initializer.AbstractPropertiesInitializer;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 */
public class PropertiesInitializerStrategyServices {

	/**
	 * The extension name.
	 */
	public static final String EXTENSION_NAME = "PropertiesInitializerStrategy"; //$NON-NLS-1$

	/**
	 * The extension's element name.
	 */
	private static final String EXTENSION_ELEMENT_NAME = "PropertiesInitializerStrategy"; //$NON-NLS-1$

	/**
	 * The element's attribute name.
	 */
	private static final String EXTENSION_ATTRIBUTE_NAME = "name"; //$NON-NLS-1$

	/**
	 * The element's attribute description.
	 */
	private static final String EXTENSION_ATTRIBUTE_DESCRIPTION = "description"; //$NON-NLS-1$

	/**
	 * The element's attribute class.
	 */
	private static final String EXTENSION_ATTRIBUTE_CLASS = "strategyClass"; //$NON-NLS-1$

	/**
	 * The instance of the service
	 */
	private static PropertiesInitializerStrategyServices instance = new PropertiesInitializerStrategyServices();

	/**
	 * The discovered strategies
	 */
	private List<AbstractPropertiesInitializer> strategies;

	/**
	 * Default constructor
	 */
	private PropertiesInitializerStrategyServices() {
		configureService();
	}

	/**
	 * @return the service instance
	 */
	public static PropertiesInitializerStrategyServices getInstance() {
		return instance;
	}

	/**
	 * @return the strategies
	 */
	public List<AbstractPropertiesInitializer> getStrategies() {
		return strategies;
	}

	/**
	 * Load all the providers registered by extension point.
	 */
	private void configureService() {
		strategies = new ArrayList<AbstractPropertiesInitializer>();
		IExtensionPoint extensionPoint = Platform.getExtensionRegistry().getExtensionPoint(
				EEFCodegenPlugin.PLUGIN_ID, EXTENSION_NAME);

		IExtension[] extensions = extensionPoint.getExtensions();
		for (int extensionIndex = 0; extensionIndex < extensions.length; extensionIndex++) {
			IExtension extension = extensions[extensionIndex];
			IConfigurationElement[] configurationElements = extension.getConfigurationElements();
			for (int i = 0; i < configurationElements.length; i++) {
				IConfigurationElement cfg = configurationElements[i];

				if (EXTENSION_ELEMENT_NAME.equals(cfg.getName())) {
					try {
						AbstractPropertiesInitializer initializer = (AbstractPropertiesInitializer)cfg
								.createExecutableExtension(EXTENSION_ATTRIBUTE_CLASS);
						String nameAttribute = cfg.getAttribute(EXTENSION_ATTRIBUTE_NAME);
						if (nameAttribute != null)
							initializer.setName(nameAttribute);
						String descriptionAttribute = cfg.getAttribute(EXTENSION_ATTRIBUTE_DESCRIPTION);
						if (descriptionAttribute != null)
							initializer.setDescription(descriptionAttribute);
						strategies.add(initializer);
					} catch (CoreException e) {
						e.printStackTrace();
					}
				}
			}
		}

	}

}
