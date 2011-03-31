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

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.eef.codegen.EEFCodegenPlugin;
import org.eclipse.emf.eef.codegen.core.util.BundleHelper;
import org.eclipse.emf.eef.codegen.flow.Step;
import org.eclipse.emf.eef.codegen.flow.var.WorkflowVariable;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 *
 */
public class AddDependency extends Step {
	
	private Object project;
	private String dependency;

	/**
	 * @param name of the step
	 */
	public AddDependency(String name, Object project, String dependency) {
		super(name);
		this.project = project;
		this.dependency = dependency;
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.codegen.flow.Step#execute(org.eclipse.core.runtime.IProgressMonitor)
	 */
	public IStatus execute(IProgressMonitor monitor) {
		try {
			BundleHelper bundleHelper = new BundleHelper(getEditProject());
			bundleHelper.addDependency(dependency);
			return Status.OK_STATUS;
		} catch (CoreException e) {
			return new Status(IStatus.ERROR, EEFCodegenPlugin.PLUGIN_ID, "An error occured when adding dependency.", e);
		}
	}

	private IProject getEditProject() {
		if (project instanceof IProject) {
			return (IProject) project;
		} else if (project instanceof WorkflowVariable) {
			return (IProject) ((WorkflowVariable)project).getValue();
		} else {
			return null;
		}
	}

}
