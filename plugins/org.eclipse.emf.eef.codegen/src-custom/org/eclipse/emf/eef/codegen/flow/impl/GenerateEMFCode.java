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
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.codegen.ecore.generator.Generator;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.util.GenModelUtil;
import org.eclipse.emf.eef.codegen.EEFCodegenPlugin;
import org.eclipse.emf.eef.codegen.flow.Step;
import org.eclipse.emf.eef.codegen.flow.var.WorkflowVariable;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 *
 */
public abstract class GenerateEMFCode extends Step {

	/**
	 * Genmodel to use
	 */
	private Object genmodel;
	
	/**
	 * 
	 */
	private WorkflowVariable genProjectVar;

	/**
	 * @param resourceSet
	 */
	public GenerateEMFCode(String name, Object genmodel) {
		super(name);
		this.genmodel = genmodel;
	}

	protected GenModel getGenModel() {
		if (genmodel instanceof GenModel) {
			return (GenModel) genmodel;
		} else if (genmodel instanceof WorkflowVariable && ((WorkflowVariable)genmodel).getValue() instanceof GenModel) {
			return (GenModel) ((WorkflowVariable)genmodel).getValue();
		} else {
			return null;
		}
	}
	
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.codegen.flow.Step#execute(org.eclipse.core.runtime.IProgressMonitor)
	 */
	public IStatus execute(IProgressMonitor monitor) {
		try {
			if (getGenModel() != null) {
				getGenModel().setCanGenerate(true);
				generateModelCode(getGenModel());
				valuateGenerationProject();
				return Status.OK_STATUS;
			} else {
				return new Status(IStatus.ERROR, EEFCodegenPlugin.PLUGIN_ID, "Unable to find the generated GenModel.");
			}
		} catch (Exception e) {
			return new Status(IStatus.ERROR, EEFCodegenPlugin.PLUGIN_ID, "An error occured during EMF code generation.", e);
		}
	}

	/**
	 * 
	 */
	protected abstract void valuateGenerationProject();
	
	/**
	 * @return
	 */
	public Object genProject() {
		if (genProjectVar == null) {
			genProjectVar = new WorkflowVariable(genprojectVarName());
		}
		return genProjectVar;
	}

	/**
	 * @param genModel
	 */
	protected void generateModelCode(GenModel genModel) {
		Generator generator = GenModelUtil.createGenerator(genModel);
		invokeGeneration(genModel, generator);
	}

	/**
	 * @return
	 */
	protected abstract String genprojectVarName();
	
	protected IProject extractProject(String sPath) {
        IPath path = new Path(sPath);
        IWorkspace workspace = ResourcesPlugin.getWorkspace();
        return workspace.getRoot().getProject(path.segment(0));
	}

	/**
	 * @param genModel
	 * @param generator
	 */
	protected abstract void invokeGeneration(GenModel genModel, Generator generator);

}
