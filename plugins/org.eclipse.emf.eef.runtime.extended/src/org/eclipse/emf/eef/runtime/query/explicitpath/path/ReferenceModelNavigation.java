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
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.eef.runtime.query.explicitpath.exception.EvaluationException;

/**
 * @author glefur
 *
 */
public class ReferenceModelNavigation implements ModelNavigation {
	
	public EReference feature;
	
	public int index;
	
	public EClass discriminatorType;

	/**
	 * @param feature the feature to navigate
	 * @param index the index of the object to navigate
	 * @param discriminatorType the discriminator
	 */
	public ReferenceModelNavigation(EReference feature, int index, EClass discriminatorType) {
		assert feature.isMany() : "Index defined for a not multi-valued attribute";
		assert feature.getEReferenceType().isSuperTypeOf(discriminatorType) : "Discriminator invalid";
		this.feature = feature;
		this.index = index;
		this.discriminatorType = discriminatorType;
	}
	
	/**
	 * @param feature the feature to navigate
	 * @param discriminatorType the discriminator
	 */
	public ReferenceModelNavigation(EReference feature, EClass discriminatorType) {
		assert feature.getEReferenceType().isSuperTypeOf(discriminatorType) : "Discriminator invalid";
		this.feature = feature;
		this.index = -1;
		this.discriminatorType = discriminatorType;
	}
	
	/**
	 * @param feature the feature to navigate
	 * @param index the index of the object to navigate
	 */
	public ReferenceModelNavigation(EReference feature, int index) {
		assert feature.isMany() : "Index defined for a not multi-valued attribute";
		this.feature = feature;
		this.index = index;
		this.discriminatorType = null;
	}
		
	/**
	 * @param feature the feature to navigate
	 */
	public ReferenceModelNavigation(EReference feature) {
		this.feature = feature;
		this.index = -1;
		this.discriminatorType = null;
	}
	
	/**
	 * @param value the EObject to process
	 * @return the result of ModelNavigation evaluation
	 * @throws EvaluationException  
	 */
	public Object evaluate(EObject value) throws EvaluationException {
		try {
			Object eGet = value.eGet(feature);
			if (discriminatorType != null) {
				if (eGet instanceof EList) {
					List<EObject> tmp = new ArrayList<EObject>();
					EList<EObject> eList = (EList<EObject>)eGet;
					for (EObject eObject : eList) {
						if (eObject.eClass().equals(discriminatorType))
							tmp.add(eObject);
					}
					if (index >= 0)
						return tmp.get(index);
					else
						return tmp;
				}
				else 
					throw new EvaluationException("Discriminator type used on non many reference.");
			}
			else if (index >= 0) {
				if (eGet instanceof EList) {
					return ((EList<EObject>)eGet).get(index);
				}
				else 
					throw new EvaluationException("Index used on non many reference.");
			}
			else
				return eGet;
		} catch (Exception e) {
			throw new EvaluationException(e);
		}
	}
}
