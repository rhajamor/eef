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
package org.eclipse.emf.eef.runtime.tests.utils;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
  *
 */
public class EEFTestsResourceUtils {
	
	/**
	 * Create the project for the tests
	 * @param projectName the name of the project
	 * @param folderNames the list of folder's name to initialize
	 * @return the created project
	 * @throws CoreException unable to create the project
	 */
	public static IProject createTestProject(String projectName, List<String> folderNames) throws CoreException {
		IProject testProject = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		NullProgressMonitor npm = new NullProgressMonitor();
		if (!testProject.exists()) 
			testProject.create(npm);
		if (!testProject.isAccessible()) {
			testProject.open(npm);
			if (folderNames != null && folderNames.size() > 0) {
				for (String folderName : folderNames) {
					IFolder folder = testProject.getFolder(new Path(folderName));
					if (!folder.exists())
						folder.create(true, true, npm);
				}
				testProject.refreshLocal(IProject.DEPTH_INFINITE, npm);
			}
		}
		return testProject;
	}
	
	/**
	 * @param bundleID the bundle where to search the model
	 * @param modelPath the path of the model
	 * @param target the folder where to copy the model
	 * @throws IOException unable to create the file
	 * @throws CoreException unable to create the file
	 */
	public static void importModel(String bundleID, String modelPath, IFolder target) throws IOException, CoreException {
		URL find = FileLocator.find(Platform.getBundle(bundleID), new Path(modelPath), Collections.EMPTY_MAP);
		Path inputPath = new Path(modelPath);
		Path targetPath = new Path(inputPath.lastSegment());
		IFile file = target.getFile(targetPath);
		if (!file.exists()) {
			InputStream openStream = find.openStream();
			file.create(openStream, true, new NullProgressMonitor());
		}
	}
	
	/**
	 * Find the file corresponding to the given Resource in the workspace
	 * @param resource the resource to search
	 * @return the model file in the workspace
	 */
	public static IFile workspaceFile(Resource resource) {
		URI uri = resource.getURI();
		if (uri.isPlatformResource()) {
			IPath path = new Path(uri.toPlatformString(true));
			IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
			return file;
		}
		return null;
	}
	
}
