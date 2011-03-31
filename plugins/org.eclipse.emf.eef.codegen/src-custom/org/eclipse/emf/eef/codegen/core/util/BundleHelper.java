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

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.pde.core.plugin.IPluginBase;
import org.eclipse.pde.core.plugin.IPluginImport;
import org.eclipse.pde.internal.core.bundle.BundlePluginModel;
import org.eclipse.pde.internal.core.bundle.BundlePluginModelBase;
import org.eclipse.pde.internal.core.bundle.WorkspaceBundleModel;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 *
 */
public class BundleHelper {
	
	private static final String MANIFEST_FILE_PATH = "META-INF/MANIFEST.MF";
	private IProject bundleProject;
	private BundlePluginModel pluginModel;

	/**
	 * @param bundleProject the bundle project to use
	 */
	public BundleHelper(IProject bundleProject) {
		super();
		this.bundleProject = bundleProject;
	}
	
	/**
	 * Extract the bundle model from the project.
	 * @return the extracted model
	 */
	public BundlePluginModel getBundlePluginModel() {
		if (pluginModel == null) {
			IFile manifest = bundleProject.getFile(new Path(MANIFEST_FILE_PATH));
			WorkspaceBundleModel bModel = new WorkspaceBundleModel(manifest);
			bModel.load();
//			WorkspaceExtensionsModel eModel = new WorkspaceExtensionsModel(pluginxml);
			pluginModel = new BundlePluginModel();
			pluginModel.setBundleModel(bModel);
//			pluginModel.setExtensionsModel(eModel);
		}
		return pluginModel;
	}

	/**
	 * Add a bundle to the dependencies of the managed plugin
	 * @param bundleToAdd  the bundle to add.
	 * @throws CoreException an error occured during the process.
	 */
	public void addDependency(String bundleToAdd) throws CoreException {
		IPluginBase pluginBase = getBundlePluginModel().getPluginBase();
		//TODO: Verifier la non existance effective 
//		IPluginImport[] imports = pluginBase.getImports();
		IPluginImport createImport = ((BundlePluginModelBase)getBundlePluginModel().getPluginFactory()).createImport(bundleToAdd);
		createImport.setReexported(true);
		pluginBase.add(createImport);
		getBundlePluginModel().save();
	}
	
//	@SuppressWarnings("restriction")
//	public void addExtension(String id) throws CoreException {
//		getBundlePluginModel().getExtensionsModel().load();
//		IPluginExtension extension = getBundlePluginModel().getFactory().createExtension();
//		extension.setPoint(id);
//		ISchemaElement schemaElement = null;
//		Object object = extension.getSchema();
//		if ((object != null) && (object instanceof Schema)) {
//			Schema schema = (Schema) object;
//			if (extension instanceof PluginExtension) {
//				PluginExtension pluginExt = (PluginExtension) extension;
//				String name = "PropertiesEditionPartProvider";
//				schemaElement = schema.findElement(name);
//			}
//			if (extension instanceof PluginExtensionNode) {
//				// Get the extension's XML element name
//				String elementName = ((PluginExtensionNode) extension).getXMLTagName();
//				// Find the extension's corresponding schema element
//				schemaElement = schema.findElement(elementName);
//			}
//			// If there is an associated schema, do the auto-insert
//			if (schemaElement != null) {
//				XMLInsertionComputer.computeInsertion(schemaElement, extension);
//			}
//		}
//		getBundlePluginModel().save();
//	}
		
}
