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
package org.eclipse.emf.eef.runtime.query.explicitpath.path;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.query.explicitpath.exception.EvaluationException;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 */
public class ChainedModelNavigation implements ModelNavigation {

	private List<ModelNavigation> navigations;
	
	/**
	 * Empty constructor.
	 */
	public ChainedModelNavigation() {
		super();
		this.navigations = new ArrayList<ModelNavigation>();
	}


	/**
	 * Parameterized constructor.
	 * @param navigations the ModelNavigation to chain
	 */
	public ChainedModelNavigation(ModelNavigation[] navigations) {
		this.navigations = Arrays.asList(navigations);
	}
	
	/**
	 * Add a ModelNavigation to the list
	 * @param navigation the ModelNavigation to add
	 */
	public void addModelNavigation(ModelNavigation navigation) {
		navigations.add(navigation);
	}
	
	/**
	 * Remove a ModelNavigation to the list
	 * @param navigation the ModelNavigation to remove
	 */
	public void removeModelNavigation(ModelNavigation navigation) {
		navigations.remove(navigation);
	}
	
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.query.explicitpath.path.ModelNavigation#evaluate(org.eclipse.emf.ecore.EObject)
	 */
	public Object evaluate(EObject value) throws EvaluationException {
		Object result = value;
		for (ModelNavigation navigation : navigations) {
			if (result instanceof EObject)
				result = navigation.evaluate((EObject) result);
			else
				throw new EvaluationException("Bad return type during ModelNavigation evaluation");
		}
		return null;
	}

}
