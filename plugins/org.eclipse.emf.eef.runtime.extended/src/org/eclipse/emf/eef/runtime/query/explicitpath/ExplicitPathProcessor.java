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
package org.eclipse.emf.eef.runtime.query.explicitpath;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.query.EEFQuery;
import org.eclipse.emf.eef.runtime.query.QueryProcessor;
import org.eclipse.emf.eef.runtime.query.QueryResult;
import org.eclipse.emf.eef.runtime.query.QueryWrapper;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 */
public class ExplicitPathProcessor implements QueryProcessor {

	public static final String EXPLICITPATH_KIND = "explicit path";
	
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.query.QueryProcessor#evaluate(org.eclipse.emf.ecore.EObject, org.eclipse.emf.eef.runtime.query.QueryWrapper)
	 */
	public QueryResult evaluate(EObject context, QueryWrapper query) {
		try {
			ExplicitPathQuery pathQuery = (ExplicitPathQuery)query;
			return new QueryResult(Status.OK_STATUS, pathQuery.getModelNavigation().evaluate(context));
		} catch (Exception e) {
			return new QueryResult(new Status(IStatus.ERROR, EEFQuery.PLUGIN_ID, "Error during evaluating model navigation.", e), null);
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.query.QueryProcessor#canEvaluate(org.eclipse.emf.eef.runtime.query.QueryWrapper)
	 */
	public boolean canEvaluate(QueryWrapper query) {
		return query.getKind() == EXPLICITPATH_KIND;
	}

}
