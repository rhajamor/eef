/*******************************************************************************
 * Copyright (c) 2008, 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.runtime.tests.swtbot.utils;

import java.util.Collection;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.eef.runtime.impl.utils.EEFUtils;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 *
 */
public class ModelHelper {
	
	private AdapterFactory adapterFactory;
	
	/**
	 * @param adapterFactory
	 */
	public ModelHelper(AdapterFactory adapterFactory) {
		this.adapterFactory = adapterFactory;
	}



	/**
	 * @param eObj
	 * @param feature
	 * @return
	 */
	public Object anotherValue(EObject eObj, EStructuralFeature feature) {
		if (feature instanceof EReference) {
			Object choiceOfValues = EEFUtils.choiceOfValues(adapterFactory, eObj, feature);
			if (choiceOfValues instanceof Collection) {
				for (Object next : (Collection<?>)choiceOfValues) {
					if (next != eObj.eGet(feature))
						return next;
				}
			}
			return choiceOfValues;
		} else if (feature instanceof EAttribute) {
			if (feature.getEType().equals(EcorePackage.eINSTANCE.getEString())) {
				return "a" + eObj.eGet(feature);
			} else if (feature.getEType().equals(EcorePackage.eINSTANCE.getEInt()) || feature.getEType().equals(EcorePackage.eINSTANCE.getEIntegerObject())) {
				return 1 + (Integer)eObj.eGet(feature);
			} else if (feature.getEType().equals(EcorePackage.eINSTANCE.getEShort()) || feature.getEType().equals(EcorePackage.eINSTANCE.getEShortObject())) {
				return 1 + (Short)eObj.eGet(feature);
			} else if (feature.getEType().equals(EcorePackage.eINSTANCE.getEDouble()) || feature.getEType().equals(EcorePackage.eINSTANCE.getEDoubleObject())) {
				return 1.0d + (Double)eObj.eGet(feature);
			} else if (feature.getEType().equals(EcorePackage.eINSTANCE.getEBoolean()) || feature.getEType().equals(EcorePackage.eINSTANCE.getEBooleanObject())) {
				return !(Boolean)eObj.eGet(feature);
			}
		}
		return null;
	}
	
}
