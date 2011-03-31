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
package org.eclipse.emf.eef.codegen.flow.var;

import java.util.HashMap;
import java.util.Map;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 *
 */
public class WorkflowContext {
	
	private Map<String, WorkflowVariable> variables;

	/**
	 * Default constructor. 
	 */
	public WorkflowContext() {
		variables = new HashMap<String, WorkflowVariable>();
	}
	
	/**
	 * Returns the value of a variable.
	 * @param name of the variable
	 * @return value of the variable
	 */
	public Object get(String name) {
		if (variables.get(name) != null) {
			return variables.get(name).getValue();
		}
		return null;
	}

	/**
	 * Add a variable to the context.
	 * @param var to add
	 */
	public void add(WorkflowVariable var) {
		variables.put(var.getName(), var);
	}
	
	/**
	 * Add a variable to the context.
	 * @param name of the variable
	 * @param value of the variable
	 */
	public void add(String name, Object value) {
		WorkflowVariable var = new WorkflowVariable(name, value);
		variables.put(name, var);
	}
	
	/**
	 * Set a value to a variable of context.
	 * @param name of the variable
	 * @param value of the variable
	 */
	public void set(String name, Object value) {
		WorkflowVariable var = variables.get(name);
		if (var != null) {
			var.setValue(value);
		} else {
			var = new WorkflowVariable(name, value);			
			variables.put(name, var);
		}
	}
}
