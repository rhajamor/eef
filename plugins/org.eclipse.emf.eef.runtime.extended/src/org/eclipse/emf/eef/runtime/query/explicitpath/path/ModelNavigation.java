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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.query.explicitpath.exception.EvaluationException;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 */
public interface ModelNavigation {
	
	public Object evaluate(EObject value) throws EvaluationException;

}
