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
package org.eclipse.emf.eef.runtime.query;

import org.eclipse.emf.ecore.EObject;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 */
public interface QueryProcessor {
	
	/**
	 * Evaluate a query on a given object.
	 * @param context the object to process
	 * @param query the query to evaluate
	 * @return the result of evaluation
	 */
	QueryResult evaluate(EObject context, QueryWrapper query);
	
	/**
	 * Defines if a query can be evaluated by the current processor.
	 * @param query the query to evaluate
	 * @return <code>true</code> if the query can be evaluated
	 */
	boolean canEvaluate(QueryWrapper query);
}
