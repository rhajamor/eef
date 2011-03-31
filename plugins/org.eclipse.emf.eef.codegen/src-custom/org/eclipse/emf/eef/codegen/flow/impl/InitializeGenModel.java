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

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.eef.codegen.EEFCodegenPlugin;
import org.eclipse.emf.eef.codegen.core.util.EMFHelper;
import org.eclipse.emf.eef.codegen.flow.Step;
import org.eclipse.emf.eef.codegen.flow.util.GenmodelHelper;
import org.eclipse.emf.eef.codegen.flow.var.WorkflowVariable;
import org.eclipse.emf.importer.ModelImporter;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 *
 */
public class InitializeGenModel extends Step {
	
	/**
	 * GenModel variable
	 */
	private WorkflowVariable genmodelVar;
	
	/**
	 * GenModel variable
	 */
	private WorkflowVariable genmodelURIVar;

	/**
	 * GenModel Helper
	 */
//	private GenmodelHelper helper;

	private IFile modelFile;

	private IContainer targetFolder;

	private String genmodelFileName;
	
	/**
	 * @param name of the step
	 * @param modelURI Ecore model file 
	 * @param targetFolder Folder where to generate the GenModel
	 */
	public InitializeGenModel(String name, IFile modelFile, IContainer targetFolder, String genmodelFileName) {
		super(name);
		this.modelFile = modelFile;
		this.targetFolder = targetFolder;
		this.genmodelFileName = genmodelFileName;
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.codegen.flow.Step#execute(org.eclipse.core.runtime.IProgressMonitor)
	 */
	public IStatus execute(IProgressMonitor monitor) {
		try {
			BasicMonitor emfMonitor = new BasicMonitor();
			ModelImporter importer = initializeConverter(genmodelFileName, emfMonitor);
			initializeGenModel(importer, emfMonitor);
			targetFolder.refreshLocal(IResource.DEPTH_INFINITE, monitor);
			URI genmodelURI = GenmodelHelper.computeGenmodelURI(targetFolder, genmodelFileName);
			((WorkflowVariable)getGenModelURI()).setValue(genmodelURI);
			((WorkflowVariable)genmodel()).setValue(EMFHelper.load(genmodelURI, resourceSet));
			return Status.OK_STATUS;
		} catch (Exception e) {
			return new Status(IStatus.ERROR, EEFCodegenPlugin.PLUGIN_ID, "An error occured during genmodel initialization", e);
		}
	}


	private final String genmodelVarName() {
		return "INIT_GENMODEL_" + name + "_GENMODEL";
	}
	
	private final String genmodelURIVarName() {
		return "INIT_GENMODEL_" + name + "_GENMODEL_URI";
	}
	
	public Object genmodel() {
		if (genmodelVar == null) {
			genmodelVar = new WorkflowVariable(genmodelVarName());
			getContext().add(genmodelVar);
		}
		return genmodelVar;
	}
	
	/**
	 * @return the generated genmodel URI.
	 */
	public Object getGenModelURI() {
		if (genmodelURIVar == null) {
			genmodelURIVar = new WorkflowVariable(genmodelURIVarName());
		}
		return genmodelURIVar;
	}

	private ModelImporter initializeConverter(String genmodelFileName, Monitor monitor) throws Exception {
		ModelImporter converter = new org.eclipse.emf.importer.ecore.EcoreImporter();
		converter.setGenModelContainerPath(targetFolder.getFullPath());
		converter.setGenModelFileName(genmodelFileName);
		converter.setModelFile(modelFile);
		converter.computeEPackages(monitor);
		converter.adjustEPackages(monitor);
		return converter;
	}

	protected void initializeGenModel(ModelImporter importer, Monitor monitor) throws Exception {
		importer.prepareGenModelAndEPackages(monitor);
		configureGenModel(importer.getGenModel());
		importer.saveGenModelAndEPackages(monitor);
	}


	protected void configureGenModel(GenModel genModel) { }

}
