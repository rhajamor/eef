/*******************************************************************************
 * Copyright (c) 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - Initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.codegen.ecore.ui.launcher;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.eef.codegen.ecore.EMFCodegenPlugin;
import org.eclipse.emf.eef.codegen.flow.Workflow;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

/**
 * @author <a href="mailto:stephane.bouchet@obeo.fr">Stephane Bouchet</a>
 */
public abstract class GenerateEMFCodeAction implements IObjectActionDelegate {

	protected Shell shell;

	protected List<GenModel> emfGenModels;

	protected IWorkspace workspace = ResourcesPlugin.getWorkspace();

	public GenerateEMFCodeAction() {
		emfGenModels = new ArrayList<GenModel>();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		try {
			if (emfGenModels != null) {
				final Workflow flow = initEMFGenFlow();
				flow.prepare();
				WorkspaceModifyOperation runnable = new WorkspaceModifyOperation() {

					public void execute(IProgressMonitor monitor) throws InvocationTargetException,
							InterruptedException {
						flow.execute(monitor);
						monitor.done();
					}

				};
				new ProgressMonitorDialog(shell).run(true, true, runnable);
			}
		} catch (InvocationTargetException e) {
			EMFCodegenPlugin.getDefault().logError(e);
		} catch (InterruptedException e) {
			EMFCodegenPlugin.getDefault().logWarning(e);
		}
	}

	/**
	 * @return the flow to execute in order to generate EMF code.
	 */
	protected abstract Workflow initEMFGenFlow();

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		emfGenModels.clear();
		if (selection instanceof StructuredSelection) {
			StructuredSelection sSelection = (StructuredSelection)selection;
			for (Object selectedElement : sSelection.toList()) {
				if (selectedElement instanceof GenModel) {
					emfGenModels.add((GenModel)selectedElement);
				}
			}

		}
	}

	protected IProject extractProject(String sPath) {
		IPath path = new Path(sPath);
		if (path.isEmpty()) {
			return null;
		}
		return workspace.getRoot().getProject(path.segment(0));
	}

}
