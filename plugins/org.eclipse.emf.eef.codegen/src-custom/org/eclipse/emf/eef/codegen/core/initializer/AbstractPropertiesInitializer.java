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
package org.eclipse.emf.eef.codegen.core.initializer;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.eef.components.resources.ComponentsResourceFactory;
import org.eclipse.emf.eef.views.resources.ViewsResourceFactory;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 */
public abstract class AbstractPropertiesInitializer implements IPropertiesInitializer {

	/**
	 * The name of the initializer
	 */
	private String name;

	/**
	 * The description of the initializer
	 */
	private String description;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Updates the registry used for looking up a package based namespace, in the resource set.
	 * 
	 * @param resourceSet
	 *            is the resource set
	 * @generated
	 */
	protected void registerPackages(ResourceSet resourceSet) {
		resourceSet.getPackageRegistry().put(
				org.eclipse.emf.eef.components.ComponentsPackage.eINSTANCE.getNsURI(),
				org.eclipse.emf.eef.components.ComponentsPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getNsURI(),
				org.eclipse.emf.ecore.EcorePackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(GenModelPackage.eINSTANCE.getNsURI(), GenModelFactory.eINSTANCE);
		resourceSet.getPackageRegistry().put(org.eclipse.emf.eef.views.ViewsPackage.eINSTANCE.getNsURI(),
				org.eclipse.emf.eef.views.ViewsPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(
				org.eclipse.emf.eef.toolkits.ToolkitsPackage.eINSTANCE.getNsURI(),
				org.eclipse.emf.eef.toolkits.ToolkitsPackage.eINSTANCE);
	
	}

	/**
	 * @param modelURI
	 * @param resourceSet
	 * @return
	 * @throws IOException
	 */
	protected EObject load(URI modelURI, ResourceSet resourceSet) throws IOException {
		EObject result = null;
		final Resource modelResource = createResource(modelURI, resourceSet);
		final Map<String, String> options = new HashMap<String, String>();
		options.put(XMLResource.OPTION_ENCODING, System.getProperty("file.encoding"));
		modelResource.load(options);
		if (modelResource.getContents().size() > 0) {
			result = modelResource.getContents().get(0);
		}
		return result;
	}

	/**
	 * Updates the registry used for looking up resources factory in the given resource set.
	 * 
	 * @param resourceSet
	 *            The resource set that is to be updated.
	 * @generated
	 */
	protected void registerResourceFactories(ResourceSet resourceSet) {
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore",
				new EcoreResourceFactoryImpl());
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("views",
				new ViewsResourceFactory());
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("components",
				new ComponentsResourceFactory());
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
				Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
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
	protected Resource createResource(URI modelURI, ResourceSet resourceSet) {
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

}
