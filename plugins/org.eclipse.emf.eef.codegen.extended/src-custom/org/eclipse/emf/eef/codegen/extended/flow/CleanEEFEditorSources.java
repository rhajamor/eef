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
package org.eclipse.emf.eef.codegen.extended.flow;


import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.eef.codegen.flow.StepWithInput;
import org.eclipse.emf.eef.codegen.flow.util.GenmodelHelper;
import org.eclipse.emf.eef.runtime.ui.EEFExtendedRuntime;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 *
 */
public class CleanEEFEditorSources extends StepWithInput {

	private static final String PLUGIN_XML = "plugin.xml";
	private static final String PLUGIN_PROPERTIES = "plugin.properties";
	private static final String BUILD_PROPERTIES = "build.properties";

	private GenmodelHelper helper;
	private IFile ecoreModel;
	private IContainer targetFolder;

	private boolean genmodel;
	private boolean emfModelCode;
	private boolean emfEditCode;
	private boolean emfEditorCode;
	private boolean eefPropertiesModels;
	private boolean eefEditorModels;
	
	/**
	 * @param name task name
	 * @param activeShell the active shell
	 */
	public CleanEEFEditorSources(String name, IFile ecoreModel, IContainer targetFolder) {
		super(name);
		this.ecoreModel = ecoreModel;
		this.targetFolder = targetFolder;
		genmodel = true;
		emfModelCode = true;
		emfEditCode = true;
		emfEditorCode = true;
		eefPropertiesModels = true;
		eefEditorModels = false;
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.codegen.flow.Step#execute(org.eclipse.core.runtime.IProgressMonitor)
	 */
	public IStatus execute(IProgressMonitor monitor) {
		try {
			GenModel genModel = helper.getGenModel();
			if (genModel != null) {
				String modelDirectory = genModel.getModelDirectory();
				String editDirectory = genModel.getEditDirectory();
				String editorDirectory = genModel.getEditorDirectory();
				if (genmodel) {
					deleteGenmodel(monitor);
				}
				if (emfModelCode) {
					deleteProject(modelDirectory, monitor);
				}
				if (emfEditCode) {
					deleteProject(editDirectory, monitor);
				}
				if (emfEditorCode) {
					deleteProject(editorDirectory, monitor);
				}
				if (eefPropertiesModels) {
					deleteEEFPropertiesModels(monitor);
				}
				if (eefEditorModels) {
					deleteEEFEditorModels(monitor);
				}
			} 
		} catch (CoreException e) {
			return new Status(IStatus.ERROR, EEFExtendedRuntime.PLUGIN_ID, "Unable to delete genmodel file.", e);
		}
		return Status.OK_STATUS;
	}
	
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.codegen.flow.StepWithInput#getInputPages()
	 */
	public List<WizardPage> getInputPages() {
		helper = new GenmodelHelper(resourceSet, ecoreModel, targetFolder);
		CleanEEFEditorSourcesWizardPage cleanEEFEditorSourcesWizardPage = new CleanEEFEditorSourcesWizardPage("Clean EEF Editor sources page");
		List<WizardPage> pages = new ArrayList<WizardPage>();
		pages.add(cleanEEFEditorSourcesWizardPage);
		return pages;
	}

	/**
	 * @param monitor
	 * @throws CoreException
	 */
	protected void deleteGenmodel(IProgressMonitor monitor) throws CoreException {
		IFile genModelFile = helper.getGenModelFile();
		if (genModelFile.isAccessible()) {
			genModelFile.delete(true, monitor);
			helper.getTargetFolder().refreshLocal(IResource.DEPTH_INFINITE, monitor);
		}
	}

	/**
	 * @param srcFolderDirectory
	 * @param monitor
	 * @throws CoreException
	 */
	protected void deleteProject(String srcFolderDirectory, IProgressMonitor monitor) throws CoreException {
		IFolder srcFolder = ecoreModel.getWorkspace().getRoot().getFolder(new Path(srcFolderDirectory));
		IProject project = srcFolder.getProject();
		IFile pluginXML = project.getFile(new Path(PLUGIN_XML));
		IFile pluginProperties = project.getFile(new Path(PLUGIN_PROPERTIES));
		IFile buildProperties = project.getFile(new Path(BUILD_PROPERTIES));
		if (srcFolder.isAccessible()) {
			srcFolder.delete(true, monitor);
		}
		if (pluginXML.isAccessible()) {
			pluginXML.delete(true, monitor);
		}
		if (pluginProperties.isAccessible()) {
			pluginProperties.delete(true, monitor);
		}
		if (buildProperties.isAccessible()) {
			buildProperties.delete(true, monitor);
		}
		project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
	}

	/**
	 * @param monitor
	 * @throws CoreException
	 */
	protected void deleteEEFPropertiesModels(IProgressMonitor monitor) throws CoreException {
		IFile eefPropertiesComponentsModel = helper.getEEFPropertiesComponentsModel();
		if (eefPropertiesComponentsModel.isAccessible()) {
			eefPropertiesComponentsModel.delete(true, monitor);
		}
		IFile eefPropertiesEEFGenModel = helper.getEEFPropertiesEEFGenModel();
		if (eefPropertiesEEFGenModel.isAccessible()) {
			eefPropertiesEEFGenModel.delete(true, monitor);
		}
		helper.getEEFModelsFolder().refreshLocal(IResource.DEPTH_INFINITE, monitor);
	}

	/**
	 * @param monitor
	 * @throws CoreException
	 */
	protected void deleteEEFEditorModels(IProgressMonitor monitor) throws CoreException {
		IFile eefEditorComponentsModel = helper.getEEFEditorComponentsModel();
		if (eefEditorComponentsModel.isAccessible()) {
			eefEditorComponentsModel.delete(true, monitor);
		}
		IFile eefEditorEEFGenModel = helper.getEEFEditorEEFGenModel();
		if (eefEditorEEFGenModel.isAccessible()) {
			eefEditorEEFGenModel.delete(true, monitor);
		}
		helper.getEEFModelsFolder().refreshLocal(IResource.DEPTH_INFINITE, monitor);
	}

	private class CleanEEFEditorSourcesWizardPage extends WizardPage {

		private Button genmodelButton;
		private Button emfModelCodeButton;
		private Button emfEditCodeButton;
		private Button emfEditorCodeButton;
		private Button eefPropertiesModelsButton;
		private Button eefEditorModelsButton;

		/**
		 * @param pageName
		 */
		public CleanEEFEditorSourcesWizardPage(String pageName) {
			super(pageName);
			setTitle("EEF editor sources cleaning");
			setDescription("Choose actions you want to perform");
		}

		/**
		 * {@inheritDoc}
		 * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets.Composite)
		 */
		public void createControl(Composite parent) {
			Composite container = new Composite(parent, SWT.NONE);
			GridLayout layout = new GridLayout();
			container.setLayout(layout);
			genmodelButton = new Button(container, SWT.CHECK);
			genmodelButton.setText("Delete generated 'genmodel' file");
			genmodelButton.addSelectionListener(new SelectionAdapter() {

				/**
				 * {@inheritDoc}
				 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
				 */
				public void widgetSelected(SelectionEvent e) {
					genmodel = !genmodel;
				}
				
			});
			if (helper.getGenModelFile().exists()) {
				genmodelButton.setSelection(genmodel);
			} else {
				genmodelButton.setEnabled(false);
				genmodel = false;
			}
			emfModelCodeButton = new Button(container, SWT.CHECK);
			emfModelCodeButton.setText("Delete generated EMF model code");
			emfModelCodeButton.addSelectionListener(new SelectionAdapter() {

				/**
				 * {@inheritDoc}
				 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
				 */
				public void widgetSelected(SelectionEvent e) {
					emfModelCode = !emfModelCode;
				}
				
			});
			IFolder emfModelSrcFolder = helper.getEMFModelSrcFolder();
			if (emfModelSrcFolder != null && emfModelSrcFolder.isAccessible()) {
				emfModelCodeButton.setSelection(emfModelCode);
			} else {
				emfModelCodeButton.setEnabled(false);
				emfModelCode = false;
			}
			emfEditCodeButton = new Button(container, SWT.CHECK);
			emfEditCodeButton.setText("Delete generated EMF edit code");
			emfEditCodeButton.addSelectionListener(new SelectionAdapter() {

				/**
				 * {@inheritDoc}
				 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
				 */
				public void widgetSelected(SelectionEvent e) {
					emfEditCode = !emfEditCode;
				}
				
			});
			IFolder emfEditSrcFolder = helper.getEMFEditSrcFolder();
			if (emfEditSrcFolder != null && emfEditSrcFolder.isAccessible()) {
				emfEditCodeButton.setSelection(emfEditCode);
			} else {
				emfEditCodeButton.setEnabled(false);
				emfEditCode = false;
			}
			emfEditorCodeButton = new Button(container, SWT.CHECK);
			emfEditorCodeButton.setText("Delete generated EMF editor code");
			emfEditorCodeButton.addSelectionListener(new SelectionAdapter() {

				/**
				 * {@inheritDoc}
				 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
				 */
				public void widgetSelected(SelectionEvent e) {
					emfEditorCode = !emfEditorCode;
				}
				
			});
			IFolder emfEditorSrcFolder = helper.getEMFEditorSrcFolder();
			if (emfEditorSrcFolder != null && emfEditorSrcFolder.isAccessible()) {
				emfEditorCodeButton.setSelection(emfEditorCode);
			} else {
				emfEditorCodeButton.setEnabled(false);
				emfEditorCode = false;
			}
			eefPropertiesModelsButton = new Button(container, SWT.CHECK);
			eefPropertiesModelsButton.setText("Delete generated EEF models for properties views");
			eefPropertiesModelsButton.addSelectionListener(new SelectionAdapter() {

				/**
				 * {@inheritDoc}
				 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
				 */
				public void widgetSelected(SelectionEvent e) {
					eefPropertiesModels = !eefPropertiesModels;
				}
				
			});
			if (helper.getEEFPropertiesComponentsModel().exists() || helper.getEEFPropertiesEEFGenModel().exists()) {
				eefPropertiesModelsButton.setSelection(eefPropertiesModels);
			} else {
				eefPropertiesModelsButton.setEnabled(false);
				eefPropertiesModels = false;
			}
			eefEditorModelsButton = new Button(container, SWT.CHECK);
			eefEditorModelsButton.setText("Delete generated EEF models for EEF editor");
			eefEditorModelsButton.setSelection(true);
			eefEditorModelsButton.addSelectionListener(new SelectionAdapter() {


				/**
				 * {@inheritDoc}
				 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
				 */
				public void widgetSelected(SelectionEvent e) {
					eefEditorModels = !eefEditorModels;
				}
				
			});
			if (helper.getEEFEditorComponentsModel().exists() || helper.getEEFEditorEEFGenModel().exists()) {
				eefEditorModelsButton.setSelection(eefEditorModels); 
			} else {
				eefEditorModelsButton.setEnabled(false);
				eefEditorModels = false;
			}
			setControl(container);
		}

	}
	
}
