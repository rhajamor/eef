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
package org.eclipse.emf.eef.codegen.flow.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.eef.codegen.EEFCodegenPlugin;
import org.eclipse.emf.eef.codegen.core.util.ExtensionHelper;
import org.eclipse.emf.eef.codegen.flow.Step;
import org.eclipse.emf.eef.codegen.flow.var.WorkflowVariable;
import org.w3c.dom.Node;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 *
 */
public class MergePluginXML extends Step {

	private Object editGenProject;

	/**
	 * @param name of the step
	 */
	public MergePluginXML(String name, Object editGenProject) {
		super(name);
		this.editGenProject = editGenProject;
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.codegen.flow.Step#execute(org.eclipse.core.runtime.IProgressMonitor)
	 */
	public IStatus execute(IProgressMonitor monitor) {
		try {
			IProject editProject = getEditGenProject();
			editProject.refreshLocal(IResource.DEPTH_INFINITE, monitor);
			PluginXMLSearcher searcher = new PluginXMLSearcher();
			editProject.accept(searcher);
			ExtensionHelper actualHelper = new ExtensionHelper(editProject);
			for (IFile next : searcher.filesToMerge) {
				ExtensionHelper predictiveHelper = new ExtensionHelper(next);
				List<Node> diff = actualHelper.diff(predictiveHelper);
				actualHelper.append(diff);
			}
			return Status.OK_STATUS;
		} catch (Exception e) {
			return new Status(IStatus.ERROR, EEFCodegenPlugin.PLUGIN_ID, "An error occured during workspace analysis.", e);
		} 
	}

	/**
	 * @return
	 */
	private IProject getEditGenProject() {
		if (editGenProject instanceof IProject) {
			return (IProject) editGenProject;
		} else if (editGenProject instanceof WorkflowVariable) {
			return (IProject) ((WorkflowVariable)editGenProject).getValue();
		} else {
			return null;
		}
	}
	
	private class PluginXMLSearcher implements IResourceVisitor {

		private List<IFile> filesToMerge;
		
		/**
		 * 
		 */
		public PluginXMLSearcher() {
			filesToMerge = new ArrayList<IFile>();
		}

		/**
		 * {@inheritDoc}
		 * @see org.eclipse.core.resources.IResourceVisitor#visit(org.eclipse.core.resources.IResource)
		 */
		public boolean visit(IResource resource) throws CoreException {
			if (resource instanceof IFile) {
				IFile file = (IFile) resource;
				if (file.getName().matches(".*\\.plugin\\.xml")) {
					filesToMerge.add(file);
				}
			}
			return true;
		}
		
	}
}

