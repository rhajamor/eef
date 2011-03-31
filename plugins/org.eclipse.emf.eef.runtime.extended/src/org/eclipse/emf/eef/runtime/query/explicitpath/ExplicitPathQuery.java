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

import org.eclipse.emf.eef.runtime.query.QueryWrapper;
import org.eclipse.emf.eef.runtime.query.explicitpath.path.ModelNavigation;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 */
public class ExplicitPathQuery implements QueryWrapper {

	private ModelNavigation modelNavigation;
	
	/**
	 * @param modelNavigation
	 */
	public ExplicitPathQuery(ModelNavigation modelNavigation) {
		super();
		this.modelNavigation = modelNavigation;
	}

	/**
	 * @return the modelNavigation
	 */
	public ModelNavigation getModelNavigation() {
		return modelNavigation;
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.query.QueryWrapper#getKind()
	 */
	public String getKind() {
		return ExplicitPathProcessor.EXPLICITPATH_KIND;
	}

}
