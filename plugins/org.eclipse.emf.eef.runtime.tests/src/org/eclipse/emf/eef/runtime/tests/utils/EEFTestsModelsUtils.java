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
package org.eclipse.emf.eef.runtime.tests.utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
  *
 */
public class EEFTestsModelsUtils {
	
	/**
	 * Return the first EObject of the given type in the resource.
	 * @param resource the resource to process
	 * @param eClass the type to search
	 * @return the first founded EObject <code>null</code> otherwise.
	 */
	public static EObject getFirstInstanceOf(Resource resource, EClass eClass) {
		if (resource != null && eClass != null) {
			TreeIterator<Object> allContents = EcoreUtil.getAllContents(resource, true);
			for (Iterator<Object> iterator = allContents; iterator.hasNext();) {
				Object object =  iterator.next();
				if (object instanceof EObject && eClass.isInstance(object))
					return (EObject) object;
			}
		}
		return null;
	}
	
	/**
	 * Return the first EObject of the given type in the resource.
	 * @param resource the resource to process
	 * @param eClass the type to search
	 * @return the first founded EObject <code>null</code> otherwise.
	 */
	public static EObject getFirstInstanceOf(List list, EClass eClass) {
		if (list != null && eClass != null) {
			if (!list.isEmpty()) {
				return (EObject)list.get(0);
			}
		}
		return null;
	}

	/**
	 * Return the first EObject of the given type in the resource.
	 * @param resource the resource to process
	 * @param eClass the type to search
	 * @param index 
	 * @return the first founded EObject <code>null</code> otherwise.
	 */
	public static EObject getInstanceOf(Resource resource, EClass eClass, int index) {
		List<EObject> allInstancesOf = getAllInstancesOf(resource, eClass);
		if (index < allInstancesOf.size())
			return allInstancesOf.get(index);
		return null;
	}

	/**
	 * Return all the EObject of the given type in the resource.
	 * @param resource the resource to process
	 * @param eClass the type to search
	 * @return the list of founded EObject <code>null</code> otherwise.
	 */
	public static List<EObject> getAllInstancesOf(Resource resource, EClass eClass) {
		List<EObject> list = new ArrayList<EObject>();
		if (resource != null && eClass != null) {
			for (Iterator<Object> iterator = EcoreUtil.getAllContents(resource, true); iterator.hasNext();) {
				Object object =  iterator.next();
				if (object instanceof EObject && eClass.isInstance(object))
					list.add((EObject) object);
			}
		}
		return list;
	}
}
