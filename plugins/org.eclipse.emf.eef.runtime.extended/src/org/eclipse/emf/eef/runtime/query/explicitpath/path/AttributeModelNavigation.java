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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.query.explicitpath.exception.EvaluationException;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 */
public class AttributeModelNavigation implements ModelNavigation {

	/**
	 * the feature to navigate
	 */
	public EAttribute feature;
	
	/**
	 * the index for multivalued attributes
	 */
	public int index;

	/**
	 * @param feature the feature to navigate
	 */
	public AttributeModelNavigation(EAttribute feature) {
		super();
		this.feature = feature;
		this.index = -1;
	}
	
	/**
	 * @param feature the feature to navigate
	 * @param index the index of the object in feature to get
	 */
	public AttributeModelNavigation(EAttribute feature, int index) {
		super();
		assert feature.isMany():"Index defined for a not multi-valued attribute";
		this.feature = feature;
		this.index = index;
	}
	

	/**
	 * @param value the EObject to process
	 * @return the result of ModelNavigation evaluation
	 * @throws EvaluationException  
	 */
	public Object evaluate(EObject value) throws EvaluationException  {
		try {
			Object eGet = value.eGet(feature);
			if (index < 0) {
				return eGet;
			}
			else {
				if (eGet instanceof EList) {
					return ((EList<EObject>)eGet).get(index);
				}
				else 
					throw new EvaluationException("Index used on non many reference.");
			}
		} catch (Exception e) {
			throw new EvaluationException(e);
		}
	}
	
}
