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
package org.eclipse.emf.eef.codegen.flow;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.eef.codegen.EEFCodegenPlugin;
import org.eclipse.emf.eef.codegen.flow.var.WorkflowContext;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.widgets.Shell;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 *
 */
public class Workflow extends StepWithInput {
	
	private Map<String, Step> steps;
	private Shell shell;
	private boolean prepared;
	private boolean canExecute;

	/**
	 * Create an empty flow 
	 */
	public Workflow(String name, Shell shell) {
		super(name);
		steps = new LinkedHashMap<String, Step>();
		this.shell = shell;
		prepared = false;
	}

	/**
	 * Create a flow with the given steps
	 * @param name flow name
	 * @param shell current shell
	 * @param steps the workflow's steps
	 */
	public Workflow(String name, Shell shell, Map<String, Step> steps) {
		super(name);
		this.steps = steps;
		this.shell = shell;
		prepared = false;
	}

	/**
	 * @param context
	 */
	public void setContext(WorkflowContext context) {
		super.setContext(context);
		for (Step step : steps.values()) {
			step.setContext(context);
		}
	}

	/**
	 * Add a new step to the workflow.
	 * @param key title of the step (must be unique)
	 * @param step the step to add
	 */
	public void addStep(String key, Step step) {
		if (context == null) {
			context = new WorkflowContext();
		}
		step.setContext(context);
		if (resourceSet == null) {
			resourceSet = new ResourceSetImpl();
		}
		step.setResourceSet(resourceSet);
		steps.put(key, step);
	}
	
	
	/**
	 * {@inheritDoc]
	 * @see org.eclipse.emf.eef.codegen.flow.Step#getResourceSet()
	 */
	public ResourceSet getResourceSet() {
		if (resourceSet == null) {
			resourceSet = new ResourceSetImpl();
			for (Step step : steps.values()) {
				step.setResourceSet(resourceSet);
			}
		}
		return resourceSet;
	}

	/**
	 * {@inheritDoc]
	 * @see org.eclipse.emf.eef.codegen.flow.Step#setResourceSet(org.eclipse.emf.ecore.resource.ResourceSet)
	 */
	public void setResourceSet(ResourceSet resourceSet) {
		super.setResourceSet(resourceSet);
		for (Step step : steps.values()) {
			step.setResourceSet(resourceSet);
		}
	}
	
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.codegen.flow.StepWithInput#getInputPages()
	 */
	public List<WizardPage> getInputPages() {
		List<WizardPage> flowPages = new ArrayList<WizardPage>();
		for (Step step : steps.values()) {
			if (step instanceof ConditionalStep) {
				if (((ConditionalStep) step).condition()) {
					step = ((ConditionalStep) step).getThenStep();
				} else {
					step = ((ConditionalStep) step).getElseStep();
				}
			}
			if (step instanceof StepWithInput) {
				flowPages.addAll(((StepWithInput) step).getInputPages());
			}
		}
		return flowPages;
	}
	
	/**
	 * Prepare the flow execution.
	 */
	public boolean prepare() {
		canExecute = true;
		if (getInputPages().size() > 0) {
			Wizard prepareWizard = new Wizard() {

				/**
				 * {@inheritDoc}
				 * @see org.eclipse.jface.wizard.Wizard#addPages()
				 */
				public void addPages() {
					for (WizardPage page : getInputPages()) {
						addPage(page);
					}
				}

				/**
				 * {@inheritDoc}
				 * @see org.eclipse.jface.wizard.Wizard#performFinish()
				 */
				public boolean performFinish() {
					canExecute = true;
					return true;
				}

				/**
				 * {@inheritDoc}
				 * @see org.eclipse.jface.wizard.Wizard#performCancel()
				 */
				public boolean performCancel() {
					canExecute = false;
					return true;
				}
				
				
			};
			WizardDialog wDialog = new WizardDialog(shell, prepareWizard);
			wDialog.open();
		}
		prepared = true;
		return canExecute;
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.codegen.flow.Step#execute(org.eclipse.core.runtime.IProgressMonitor)
	 */
	public IStatus execute(IProgressMonitor monitor) {
		assert prepared == true:"Workflow must be prepared before execution";
		monitor.beginTask(name, steps.size());
		for (Iterator<String> iterator = steps.keySet().iterator(); iterator.hasNext();) {
			String key = (String) iterator.next();
			monitor.subTask(key);
			Step step = steps.get(key);
			if (step instanceof ConditionalStep) {
				if (((ConditionalStep) step).condition()) {
					step = ((ConditionalStep) step).getThenStep();
				} else {
					step = ((ConditionalStep) step).getElseStep();
				}
			}
			if (step.validateExecution()) {
				IStatus execute = step.execute(monitor);
				if (!execute.isOK()) {
					EEFCodegenPlugin.getDefault().logError((Exception) execute.getException());
					return execute;
				}
			}
			monitor.worked(1);
		}
		return Status.OK_STATUS;
	}

}
