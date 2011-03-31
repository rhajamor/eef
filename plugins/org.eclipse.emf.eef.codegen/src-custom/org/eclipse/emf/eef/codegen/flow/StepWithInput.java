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

import java.util.List;

import org.eclipse.jface.wizard.WizardPage;


/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 *
 */
public abstract class StepWithInput extends Step {

	/**
	 * @param name of the task
	 */
	public StepWithInput(String name) {
		super(name);
	}
	
	/**
	 * @return a wizard page to get the step inputs
	 */
	public abstract List<WizardPage> getInputPages();

}
