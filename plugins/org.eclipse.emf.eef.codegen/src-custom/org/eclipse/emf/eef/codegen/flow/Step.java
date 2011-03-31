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
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.eef.codegen.flow.var.WorkflowContext;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 * 
 */
public abstract class Step {

	/**
	 * ResourceSet where to work 
	 */
	protected ResourceSet resourceSet;

	/**
	 * Workflow context
	 */
	protected WorkflowContext context;
	
	/**
	 * Step name
	 */
	protected final String name;


	/**
	 * @param name StepName
	 */
	public Step(String name) {
		this.name = name;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the context
	 */
	public WorkflowContext getContext() {
		if (context == null) {
			context = new WorkflowContext();
		}
		return context;
	}

	/**
	 * @param context to set
	 */
	public void setContext(WorkflowContext context) {
		this.context = context;
	}
	
	/**
	 * @return the resourceSet
	 */
	public ResourceSet getResourceSet() {
		if (resourceSet == null) {
			resourceSet = new ResourceSetImpl();
		}
		return resourceSet;
	}

	/**
	 * @param resourceSet the resourceSet to set
	 */
	public void setResourceSet(ResourceSet resourceSet) {
		this.resourceSet = resourceSet;
	}
	
	/**
	 * @return <code>true</code> if the step must be executed
	 */
	public boolean validateExecution() {
		return true;
	}

	/**
	 * @param monitor monitor to use
	 * @return the execution result
	 */
	public abstract IStatus execute(IProgressMonitor monitor);

}
