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
package org.eclipse.emf.eef.codegen.core.util;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 *
 */
public class EMFHelper {
	
	/**
	 * @param modelURI
	 * @param resourceSet
	 * @return
	 * @throws IOException
	 */
	public static EObject load(URI modelURI, ResourceSet resourceSet) throws IOException {
		EObject result = null;
		Resource modelResource = null;
		modelResource = resourceAlreadyLoaded(modelURI, resourceSet, modelResource); 
		if (modelResource == null) {
			modelResource = createResource(modelURI, resourceSet);
			final Map<String, String> options = new HashMap<String, String>();
			options.put(XMLResource.OPTION_ENCODING, System.getProperty("file.encoding"));
			modelResource.load(options);
		}
		if (modelResource.getContents().size() > 0) {
			result = modelResource.getContents().get(0);
		} else {
			// Maybe the resource was deleted. Try a reload
			modelResource.unload();
			final Map<String, String> options = new HashMap<String, String>();
			options.put(XMLResource.OPTION_ENCODING, System.getProperty("file.encoding"));
			modelResource.load(options);
			if (modelResource.getContents().size() > 0) {
				result = modelResource.getContents().get(0);
			}
		}
		return result;
	}

	/**
	 * @param modelURI
	 * @param resourceSet
	 * @param modelResource
	 * @return
	 */
	protected static Resource resourceAlreadyLoaded(URI modelURI, ResourceSet resourceSet, Resource modelResource) {
		for (Resource resource : resourceSet.getResources()) {
			if (resource.getURI().equals(modelURI)) {
				modelResource = resource;
			}
		}
		return modelResource;
	}

	/**
	 * This will create a {@link Resource} given the model extension it is intended for and a ResourceSet.
	 * 
	 * @param modelURI
	 *            {@link org.eclipse.emf.common.util.URI URI} where the model is stored.
	 * @param resourceSet
	 *            The {@link ResourceSet} to load the model in.
	 * @return The {@link Resource} given the model extension it is intended for.
	 * @generated
	 */
	public static Resource createResource(URI modelURI, ResourceSet resourceSet) {
		String fileExtension = modelURI.fileExtension();
		if (fileExtension == null || fileExtension.length() == 0) {
			fileExtension = Resource.Factory.Registry.DEFAULT_EXTENSION;
		}
		final Resource.Factory.Registry registry = Resource.Factory.Registry.INSTANCE;
		final Object resourceFactory = registry.getExtensionToFactoryMap().get(fileExtension);
		if (resourceFactory != null) {
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(fileExtension,
					resourceFactory);
		} else {
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(fileExtension,
					new XMIResourceFactoryImpl());
		}
		return resourceSet.createResource(modelURI);
	}

	
	/**
	 * @param eObject
	 * @return
	 */
	public static IFile associatedFile(EObject eObject) {
		if (eObject.eResource().getURI().isPlatformResource()) {
			URI uri = eObject.eResource().getURI();
			String path = uri.toString().substring("platform:/resource".length());
			return ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(path));
		}
		return null;
	}

}
