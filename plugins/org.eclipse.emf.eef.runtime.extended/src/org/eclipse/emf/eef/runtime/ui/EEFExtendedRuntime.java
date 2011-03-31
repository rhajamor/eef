/*******************************************************************************
 * Copyright (c) 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.runtime.ui;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.eef.runtime.query.QueryProcessor;
import org.eclipse.emf.eef.runtime.query.compound.CompoundProcessor;
import org.eclipse.emf.eef.runtime.query.explicitpath.ExplicitPathProcessor;
import org.eclipse.emf.eef.runtime.query.ocl.OCLProcessor;

/**
 * This is the central singleton for the Extended edit plugin.
 * 
 */
public final class EEFExtendedRuntime extends EMFPlugin {
	
	/**
	 * ID of the Extended Runtime plugin
	 */
	public static final String PLUGIN_ID = "org.eclipse.emf.eef.runtime.extended";
	
	/**
	 * Keep track of the singleton.
	 * 
	 */
	public static final EEFExtendedRuntime INSTANCE = new EEFExtendedRuntime();

	/**
	 * Keep track of the singleton.
	 * 
	 */
	private static Implementation plugin;
	
	/**
	 * The Query Processor
	 */
	private QueryProcessor processor;
	
	/**
	 * @return the processor
	 */
	public QueryProcessor getProcessor() {
		return processor;
	}

	/**
	 * Create the instance.
	 * 
	 */
	public EEFExtendedRuntime() {
		super(new ResourceLocator [] { });
		processor = new CompoundProcessor();
		((CompoundProcessor)processor).addProcessor(new OCLProcessor());
		((CompoundProcessor)processor).addProcessor(new ExplicitPathProcessor());
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * @return the singleton instance.
	 * 
	 */
	@Override
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}
	
	/**
	 * @param modelURI the model URI 
	 * @return the associated resource
	 */
	public Resource getResource(URI modelURI) {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		Resource resource = resourceSet.getResource(modelURI, true);
		return resource;
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * @return the singleton instance.
	 * 
	 */
	public static Implementation getPlugin() {
		return plugin;
	}

	/**
	 * The actual implementation of the Eclipse <b>Plugin</b>.
	 * 
	 */
	public static class Implementation extends EclipsePlugin {
		/**
		 * Creates an instance.
		 * 
		 */
		public Implementation() {
			super();

			// Remember the static instance.
			//
			plugin = this;
		}
	}

}
