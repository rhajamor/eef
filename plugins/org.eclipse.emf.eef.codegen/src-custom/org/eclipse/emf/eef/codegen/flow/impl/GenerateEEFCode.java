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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.eef.EEFGen.EEFGenModel;
import org.eclipse.emf.eef.codegen.flow.Step;
import org.eclipse.emf.eef.codegen.flow.var.WorkflowVariable;
import org.eclipse.emf.eef.codegen.ui.generators.callback.EEFGenerationCallback;
import org.eclipse.emf.eef.codegen.ui.generators.common.GenerationHelper;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 *
 */
public class GenerateEEFCode extends Step {

	private Object eefgenModel;
	private List<EEFGenerationCallback> callbacks;

	/**
	 * @param name of the step
	 */
	public GenerateEEFCode(String name, Object eefgenModel) {
		super(name);
		this.eefgenModel = eefgenModel;
		callbacks = new ArrayList<EEFGenerationCallback>(1);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.codegen.flow.Step#execute(org.eclipse.core.runtime.IProgressMonitor)
	 */
	public IStatus execute(IProgressMonitor monitor) {
		List<EEFGenModel> eefgenModels = new ArrayList<EEFGenModel>(1);
		eefgenModels.add(getEEFGenModel());
		GenerationHelper generationHelper = new GenerationHelper(eefgenModels, callbacks);
		generationHelper.generate(monitor);
		return Status.OK_STATUS;
	}

	public void addGenerationCallback(EEFGenerationCallback callback) {
		callbacks.add(callback);
	}

	public EEFGenModel getEEFGenModel() {
		if (eefgenModel instanceof EEFGenModel) {
			return (EEFGenModel) eefgenModel;	
		} else if (eefgenModel instanceof WorkflowVariable) {
			return (EEFGenModel) ((WorkflowVariable)eefgenModel).getValue();
		} else {
			return null;
		}
	}

}
