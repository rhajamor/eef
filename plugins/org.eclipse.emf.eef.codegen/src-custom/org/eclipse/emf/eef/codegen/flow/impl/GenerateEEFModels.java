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

import java.io.IOException;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.EEFGen.EEFGenModel;
import org.eclipse.emf.eef.codegen.EEFCodegenPlugin;
import org.eclipse.emf.eef.codegen.core.initializer.PropertiesInitializer;
import org.eclipse.emf.eef.codegen.core.util.EMFHelper;
import org.eclipse.emf.eef.codegen.flow.Step;
import org.eclipse.emf.eef.codegen.flow.var.WorkflowVariable;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 *
 */
public class GenerateEEFModels extends Step {

	private PropertiesInitializer propertiesInitializer;
	private Object modelURI;
	private Object editGenProject;
	private Object genmodelURI;
	private WorkflowVariable eefgenModelVar;
	private WorkflowVariable eefModelsFolderVar;
	private String modelsFolderPath;

	/**
	 * @param name of the step
	 */
	public GenerateEEFModels(String name, Object modelURI, Object editGenProject, Object genmodelURI, String modelsFolderPath) {
		super(name);
		this.modelURI = modelURI;
		this.editGenProject = editGenProject;
		this.genmodelURI = genmodelURI;
		this.modelsFolderPath = modelsFolderPath;
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.codegen.flow.Step#execute(org.eclipse.core.runtime.IProgressMonitor)
	 */
	public IStatus execute(IProgressMonitor monitor) {
		try {
			IProject editProject = getEditProject();
			if (editProject != null) {
				propertiesInitializer = new PropertiesInitializer();
				IFolder modelsFolder = createEEFModelsFolder(editProject, monitor);
				initializeEEFModels(modelsFolder, getGenModelURI());
				EEFGenModel eefgenModel = generatedEEFGen(getModelURI(), modelsFolder);
				((WorkflowVariable)getEEFGenModel()).setValue(eefgenModel);
				return Status.OK_STATUS;
			}
			else {
				return new Status(IStatus.ERROR, EEFCodegenPlugin.PLUGIN_ID, "Unable to find edit project");
			}
		} catch (IOException e) {
			return new Status(IStatus.ERROR, EEFCodegenPlugin.PLUGIN_ID, "An error occured during EEF models initialization.");
		} catch (CoreException e) {
			return new Status(IStatus.ERROR, EEFCodegenPlugin.PLUGIN_ID, "An error occured during EEF models initialization.");
		}
	}
	
	public Object getEEFGenModel() {
		if (eefgenModelVar == null) {
			eefgenModelVar = new WorkflowVariable(eefgenmodelVarName());
		}
		return eefgenModelVar;
	}
	
	private final String eefgenmodelVarName() {
		return "GEN_EEF_MODELS_" + name + "_EEFGENMODEL";
	}
	
	public Object getEEFModelsFolder() {
		if (eefModelsFolderVar == null) {
			eefModelsFolderVar = new WorkflowVariable(eefModelsFolderVarName());
		}
		return eefModelsFolderVar;
	}
	
	private final String eefModelsFolderVarName() {
		return "GEN_EEF_MODELS_" + name + "_EEFMODELSFOLDER";
	}

	private URI getModelURI() {
		if (modelURI instanceof URI) {
			return (URI) modelURI;
		} else if (modelURI instanceof WorkflowVariable) {
			return (URI) ((WorkflowVariable)modelURI).getValue();
		}
		return null;
	}

	private URI getGenModelURI() {
		if (genmodelURI instanceof URI) {
			return (URI) genmodelURI;
		} else if (genmodelURI instanceof WorkflowVariable) {
			return (URI) ((WorkflowVariable)genmodelURI).getValue();
		}
		return null;
	}

	private IProject getEditProject() {
		if (editGenProject instanceof IProject) {
			return (IProject) editGenProject;
		} else if (editGenProject instanceof WorkflowVariable) {
			return (IProject) ((WorkflowVariable)editGenProject).getValue();
		}
		else {
			return null;
		}
	}

	private void initializeEEFModels(IFolder modelsFolder, URI genmodelURI) throws IOException, CoreException {
		NullProgressMonitor monitor = new NullProgressMonitor();
		propertiesInitializer.initialize(genmodelURI, modelsFolder);
		modelsFolder.refreshLocal(IResource.DEPTH_INFINITE, monitor);
	}
	
	private EEFGenModel generatedEEFGen(URI modelURI, IFolder modelsFolder) throws IOException {
		String eefgenPath = modelsFolder.getFullPath().toString() + "/" + modelURI.trimFileExtension().appendFileExtension("eefgen").lastSegment();
		EEFGenModel eefgenModel = null;
		URI eefgenURI = URI.createPlatformResourceURI(eefgenPath, true);
		EObject extractedEEFGenModel = EMFHelper.load(eefgenURI, resourceSet);
		if (extractedEEFGenModel instanceof EEFGenModel) {
			eefgenModel = (EEFGenModel)extractedEEFGenModel;
		}
		return eefgenModel;
	}


	private IFolder createEEFModelsFolder(IProject editProject, IProgressMonitor monitor) throws CoreException {
		IFolder modelsFolder = editProject.getFolder(new Path(modelsFolderPath));
		if (!modelsFolder.exists()) {
			modelsFolder.create(true, true, monitor);
			editProject.refreshLocal(IResource.DEPTH_INFINITE, monitor);
		}
		((WorkflowVariable)getEEFModelsFolder()).setValue(modelsFolder);
		return modelsFolder;
	}			


}
