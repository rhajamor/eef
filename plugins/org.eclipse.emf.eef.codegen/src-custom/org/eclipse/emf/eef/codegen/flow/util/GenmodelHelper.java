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
package org.eclipse.emf.eef.codegen.flow.util;

import java.io.IOException;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.eef.codegen.core.util.EMFHelper;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 *
 */
public class GenmodelHelper {
	
	private static final String EDITOR_SUFFIX = "editor";
	private static final String PLATFORM_RESOURCE_SCHEME = "platform:/resource";
	private static final String GENMODEL_EXTENSION = "genmodel";
	private static final String EEF_MODELS_PATH = "models";
	private static final String COMPONENTS_FILE_EXTENSION = "components";
	private static final String EEFGEN_FILE_EXTENSION = "eefgen";
	
	private IFile ecoreModel;
	private IContainer targetFolder;
	private ResourceSet resourceSet;
	private URI ecoreModelURI;
	private GenModel genmodel;
	private URI genmodelURI;
	
	/**
	 * @param ecoreModel
	 * @param targetFolder
	 */
	public GenmodelHelper(ResourceSet resourceSet, IFile ecoreModel, IContainer targetFolder) {
		this.ecoreModel = ecoreModel;
		this.targetFolder = targetFolder;
		this.resourceSet = resourceSet;
	}
	
	/**
	 * @return the targetFolder
	 */
	public IContainer getTargetFolder() {
		return targetFolder;
	}

	/**
	 * @return the ecoreModel
	 */
	public IFile getEcoreModel() {
		return ecoreModel;
	}
	
	/**
	 * @return the ecoremodelURI
	 */
	public URI ecoreModelURI() {
		return computeEcoreModelURI();
	}
	
	/**
	 * @return the IFile containing the GenModel
	 */
	public IFile getGenModelFile() {
		return targetFolder.getFile(new Path(genmodelFileName()));
	}

	/**
	 * @return the generated genmodel URI.
	 */
	public URI genmodelURI() {
		if (genmodelURI == null) {
			genmodelURI = GenmodelHelper.computeGenmodelURI(targetFolder, genmodelFileName());
		}
		return genmodelURI;
	}
	
	/**
	 * @return the genmodel
	 */
	public GenModel getGenModel() {
		if (genmodel == null) {
			genmodel = loadGenmodel();
		}
		return genmodel;
	}

	/**
	 * @return the EEF models {@link IFolder}
	 */
	public IFolder getEEFModelsFolder() {
		IProject editProject = targetFolder.getWorkspace().getRoot().getProject(getGenModel().getEditPluginID());
		IFolder modelsFolder = editProject.getFolder(new Path(eefmodelsFolderPath()));
		return modelsFolder;
	}
	
	/**
	 * @return folder path for the EEF models
	 */
	public String eefmodelsFolderPath() {
		return EEF_MODELS_PATH;
	}
	
	/**
	 * @return components file for EEF properties
	 */
	public IFile getEEFPropertiesComponentsModel() {
		return getEEFModelsFolder().getFile(new Path(genmodelURI().trimFileExtension().appendFileExtension(COMPONENTS_FILE_EXTENSION).lastSegment()));
	}
	
	/**
	 * @return components file for EEF properties
	 */
	public IFile getEEFPropertiesEEFGenModel() {
		return getEEFModelsFolder().getFile(new Path(genmodelURI().trimFileExtension().appendFileExtension(EEFGEN_FILE_EXTENSION).lastSegment()));
	}
	
	/**
	 * @return components file for EEF Editor
	 */
	public IFile getEEFEditorComponentsModel() {
		return getEEFModelsFolder().getFile(new Path(genmodelURI().trimFileExtension().lastSegment() + "-" + EDITOR_SUFFIX + "." + COMPONENTS_FILE_EXTENSION));
	}
	
	/**
	 * @return components file for EEF Editor
	 */
	public IFile getEEFEditorEEFGenModel() {
		return getEEFModelsFolder().getFile(new Path(genmodelURI().trimFileExtension().lastSegment() + "-" + EDITOR_SUFFIX + "." + EEFGEN_FILE_EXTENSION));
	}
	
	/**
	 * @return the Source folder of the EMF model plugin if genmodel found. null otherwise.
	 */
	public IFolder getEMFModelSrcFolder() {
		if (getGenModel() != null) {
			return targetFolder.getWorkspace().getRoot().getFolder(new Path(getGenModel().getModelDirectory()));
		}
		return null;
	}
	
	/**
	 * @return the Source folder of the EMF edit plugin if genmodel found. null otherwise.
	 */
	public IFolder getEMFEditSrcFolder() {
		if (getGenModel() != null) {
			return targetFolder.getWorkspace().getRoot().getFolder(new Path(getGenModel().getEditDirectory()));
		}
		return null;
	}
	
	/**
	 * @return the Source folder of the EMF editor plugin if genmodel found. null otherwise.
	 */
	public IFolder getEMFEditorSrcFolder() {
		if (getGenModel() != null) {
			return targetFolder.getWorkspace().getRoot().getFolder(new Path(getGenModel().getEditorDirectory()));
		}
		return null;
	}
	
	/**
	 * Compute the Ecore Model URI for the given ecore file
	 * @param ecoreModel the ecore file
	 * @return the ecore model URI
	 */
	private URI computeEcoreModelURI() {
		if (ecoreModelURI == null) {
			ecoreModelURI = URI.createURI(PLATFORM_RESOURCE_SCHEME + ecoreModel.getFullPath());
		}
		return ecoreModelURI;
	}
	
 	/**
	 * Compute the GenModel URI for the given ecore modelURI
	 * @param ecoreModelURI
	 * @return
	 */
	public static URI computeGenmodelURI(IContainer targetFolder, String genmodelFileName) {
		return URI.createPlatformResourceURI(targetFolder.getFullPath() + "/" + genmodelFileName, true);
	}
	
	/**
	 * @param modelURI
	 * @return
	 */
	public String genmodelFileName() {
		return ecoreModelURI().trimFileExtension().appendFileExtension(GENMODEL_EXTENSION).lastSegment();
	}
	
	/**
	 * @return the created genmodel
	 */
	private GenModel loadGenmodel() {
		try {
			URI genmodelURI = genmodelURI();
			EObject model = EMFHelper.load(genmodelURI, resourceSet);
			if (model instanceof GenModel) {
				return (GenModel) model;
			}
		} catch (IOException e) {
			// Silent catch
		}
		return null;
	}

	public static URI computePropertiesComponentsModelURI(IContainer targetFolder, URI genmodelURI) {
		return URI.createPlatformResourceURI(targetFolder.getFullPath() + "/" + genmodelURI.trimFileExtension().appendFileExtension(COMPONENTS_FILE_EXTENSION).lastSegment(), false);
	}

	public static URI computePropertiesEEFGenModelURI(IContainer targetFolder, URI genmodelURI) {
		return URI.createPlatformResourceURI(targetFolder.getFullPath() + "/" + genmodelURI.trimFileExtension().appendFileExtension(EEFGEN_FILE_EXTENSION).lastSegment(), false);
	}

	public static URI computeEditorComponentsModelURI(IContainer targetFolder, URI genmodelURI) {
		return URI.createPlatformResourceURI(targetFolder.getFullPath() + "/" + genmodelURI.trimFileExtension().lastSegment() + "-" + EDITOR_SUFFIX + "." + COMPONENTS_FILE_EXTENSION, false);
	}

	public static URI computeEditorEEFGenModelURI(IContainer targetFolder, URI genmodelURI) {
		return URI.createPlatformResourceURI(targetFolder.getFullPath() + "/" + genmodelURI.trimFileExtension().lastSegment() + "-" + EDITOR_SUFFIX + "." + EEFGEN_FILE_EXTENSION, false);
	}
}
