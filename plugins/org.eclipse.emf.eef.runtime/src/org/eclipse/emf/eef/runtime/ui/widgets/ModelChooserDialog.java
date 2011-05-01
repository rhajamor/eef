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
package org.eclipse.emf.eef.runtime.ui.widgets;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.edit.provider.IWrapperItemProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;
import org.eclipse.emf.eef.runtime.ui.utils.EEFRuntimeUIMessages;
import org.eclipse.emf.eef.runtime.util.EEFUtils;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 */
public class ModelChooserDialog extends Dialog {

	private TreeViewer workspaceViewer;

	protected String modelExtension;

	protected IFile selectedModel;

	public ModelChooserDialog(String modelExtension) {
		super(Display.getDefault().getActiveShell());
		this.modelExtension = modelExtension;
		setShellStyle(SWT.CLOSE | SWT.TITLE | SWT.BORDER | SWT.APPLICATION_MODAL | SWT.RESIZE);
	}

	public Shell getShell() {
		Shell s = super.getShell();
		// Rectangle r = s.getBounds();
		// s.setBounds(-1, -1, 500, 500);
		s.setText(EEFRuntimeUIMessages.ModelChooserDialog_title);
		return s;
	}

	protected Control createDialogArea(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		GridData containerData = new GridData(GridData.FILL_BOTH);
		container.setLayoutData(containerData);
		GridLayout containerLayout = new GridLayout();
		container.setLayout(containerLayout);
		Label label = new Label(container, SWT.NONE);
		label.setText(EEFRuntimeUIMessages.ModelChooserDialog_choose_model);
		workspaceViewer = new TreeViewer(container);
		workspaceViewer.getTree().setLayoutData(new GridData(GridData.FILL_BOTH));
		if (EEFUtils.isBundleLoaded("org.eclipse.ui.ide")) //$NON-NLS-1$
			workspaceViewer.setContentProvider(new WorkbenchContentProvider());
		else
			workspaceViewer.setContentProvider(new AdapterFactoryContentProvider(EEFRuntimePlugin
					.getDefault().getAdapterFactory()));

		workspaceViewer.setLabelProvider(new WorkbenchLabelProvider());
		workspaceViewer.addFilter(new ViewerFilter() {
			/*
			 * (non-Javadoc)
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface .viewers.Viewer,
			 * java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return valid(viewer, parentElement, element);
			}

		});
		workspaceViewer.setInput(ResourcesPlugin.getWorkspace().getRoot());
		workspaceViewer.addSelectionChangedListener(new OkButtonEnabler());
		workspaceViewer.addDoubleClickListener(new IDoubleClickListener() {

			public void doubleClick(DoubleClickEvent event) {
				okPressed();
			}

		});
		return container;
	}

	/**
	 * Cette methode filtre les dossiers ou projets ouverts qui contiennent des repertoires possedant des
	 * modeles.
	 * 
	 * @param p_viewer
	 * @param p_parentElement
	 * @param p_element
	 *            L'element en cours dans le Treeview.
	 * @return
	 */
	protected boolean valid(final Viewer p_viewer, final Object p_parentElement, final Object p_element) {
		boolean retour = false;
		try {
			if (p_element instanceof IProject && ((IProject)p_element).isOpen()
					&& !getFiles((IContainer)p_element).isEmpty()) {
				retour = true;
			} else if (p_element instanceof IFolder && !getFiles((IContainer)p_element).isEmpty()) {
				retour = true;
			} else if (p_element instanceof IFile
					&& ((IFile)p_element).getFileExtension().equalsIgnoreCase(modelExtension)) {
				retour = true;
			}
		} catch (final Exception p_exception) {
			p_exception.printStackTrace();
		}
		return retour;
	}

	/**
	 * Cette methode rend la liste des modeles donnees presents dans un conteneur.
	 * 
	 * @param p_container
	 *            Le conteneur de ressources
	 * @return La liste des modeles donnees de ce conteneur.
	 * @throws CoreException
	 */
	private Collection<IResource> getFiles(final IContainer p_container) throws CoreException {
		List<IResource> files = new ArrayList<IResource>();
		List<IContainer> folders = new ArrayList<IContainer>();
		IResource children[] = p_container.members();
		for (int i = 0; i < children.length; i++) {
			IResource child = children[i];
			int childType = child.getType();
			if (childType == IResource.FILE && child.getFileExtension() != null
					&& child.getFileExtension().equalsIgnoreCase(modelExtension)) {
				files.add(child);
			} else if (childType == IResource.FOLDER && !child.getName().startsWith(".")) { //$NON-NLS-1$
				folders.add((IContainer)child);
			}
		}
		Iterator<IContainer> iter = folders.iterator();
		while (iter.hasNext()) {
			files.addAll(getFiles(iter.next()));
		}
		return files;
	}

	protected void createButtonsForButtonBar(Composite parent) {
		super.createButtonsForButtonBar(parent);
		setOkButtonEnabled(false);
	}

	/**
	 * @generated
	 */
	protected void setOkButtonEnabled(boolean enabled) {
		getButton(IDialogConstants.OK_ID).setEnabled(enabled);
	}

	protected class OkButtonEnabler implements ISelectionChangedListener {

		public void selectionChanged(SelectionChangedEvent event) {
			if (event.getSelection() instanceof IStructuredSelection) {
				IStructuredSelection selection = (IStructuredSelection)event.getSelection();
				if (selection.size() == 1) {
					Object selectedElement = selection.getFirstElement();
					if (selectedElement instanceof IWrapperItemProvider) {
						selectedElement = ((IWrapperItemProvider)selectedElement).getValue();
					}
					if (selectedElement instanceof FeatureMap.Entry) {
						selectedElement = ((FeatureMap.Entry)selectedElement).getValue();
					}
					if (selectedElement instanceof IFile) {
						IFile file = (IFile)selectedElement;
						String fileExtension = file.getFileExtension().toString();
						if (fileExtension.equals(modelExtension)) {
							setOkButtonEnabled(true);
							selectedModel = file;
							return;
						}
					}
				}
			}
			selectedModel = null;
			setOkButtonEnabled(false);
		}

	}

	public IFile getSelectedModel() {
		return selectedModel;
	}

}
