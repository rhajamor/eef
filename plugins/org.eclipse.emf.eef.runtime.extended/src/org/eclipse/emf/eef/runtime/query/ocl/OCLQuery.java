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
package org.eclipse.emf.eef.runtime.query.ocl;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.eef.runtime.query.QueryWrapper;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 */
public class OCLQuery implements QueryWrapper {

	private String oclQuery;
	private EClassifier context;
	
	/**
	 * @param oclQuery the query to evaluate
	 */
	public OCLQuery(EClassifier context, String oclQuery) {
		super();
		this.oclQuery = oclQuery;
		this.context = context;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.eef.query.QueryWrapper#getKind()
	 */
	public String getKind() {
		return OCLProcessor.OCL_KIND;
	}
	
	/**
	 * @return the context
	 */
	public EClassifier getContext() {
		return context;
	}

	/**
	 * @return the querto evaluate
	 */
	public String getOclQuery() {
		return oclQuery;
	}

}
