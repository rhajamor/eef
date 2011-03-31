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

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.eef.codegen.flow.var.WorkflowContext;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 *
 */
public abstract class ConditionalStep extends Step {

	private Step thenStep;
	private Step elseStep;

	/**
	 * @param thenStep execution if condition is valid
	 */
	public ConditionalStep(Step thenStep) {
		super("Conditional step");
		this.thenStep = thenStep;
		this.elseStep = new IdentityStep();
	}

	/**
	 * @param thenStep execution if condition is valid
	 * @param elseStep execution if condition is invalid
	 */
	public ConditionalStep(Step thenStep, Step elseStep) {
		super("Conditional step");
		this.thenStep = thenStep;
		this.elseStep = elseStep;
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.codegen.flow.Step#execute(org.eclipse.core.runtime.IProgressMonitor)
	 */
	public IStatus execute(IProgressMonitor monitor) {
		if (condition()) {
			return thenStep.execute(monitor);
		} else {
			if (elseStep != null) {
				return elseStep.execute(monitor);
			}
		}
		return Status.OK_STATUS;
	}

	/**
	 * Defines if the thenStep or the elseStep must be executed.
	 * @return result
	 */
	public abstract boolean condition();

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.codegen.flow.Step#getName()
	 */
	public String getName() {
		return super.getName();
	}
	
	/**
	 * @return the thenStep
	 */
	public Step getThenStep() {
		return thenStep;
	}

	/**
	 * @return the elseStep
	 */
	public Step getElseStep() {
		return elseStep;
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.codegen.flow.Step#setContext(org.eclipse.emf.eef.codegen.flow.var.WorkflowContext)
	 */
	public void setContext(WorkflowContext context) {
		super.setContext(context);
		thenStep.setContext(context);
		if (elseStep != null) {
			elseStep.setContext(context);
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.codegen.flow.Step#setResourceSet(org.eclipse.emf.ecore.resource.ResourceSet)
	 */
	public void setResourceSet(ResourceSet resourceSet) {
		super.setResourceSet(resourceSet);
		thenStep.setResourceSet(resourceSet);
		if (elseStep != null) {
			elseStep.setResourceSet(resourceSet);
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.codegen.flow.Step#validateExecution()
	 */
	public boolean validateExecution() {
		if (condition()) {
			return thenStep.validateExecution();
		} else {
			if (elseStep != null) {
				return elseStep.validateExecution();
			}
			else {
				return super.validateExecution();
			}
		}
	}
	
}
