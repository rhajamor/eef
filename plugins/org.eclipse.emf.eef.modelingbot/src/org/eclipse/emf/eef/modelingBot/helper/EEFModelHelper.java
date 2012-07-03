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

package org.eclipse.emf.eef.modelingBot.helper;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.eef.components.PropertiesEditionComponent;
import org.eclipse.emf.eef.components.PropertiesEditionElement;
import org.eclipse.emf.eef.views.ElementEditor;
import org.eclipse.emf.eef.views.View;

public class EEFModelHelper {

	/**
	 * Get the object from the feature.
	 * 
	 * @param container
	 * @param eContainingFeature
	 * @return the object from the feature.
	 */
	public static Object eGet(EObject container, EStructuralFeature eContainingFeature) {
		final Object eGet = container.eGet(container.eClass().getEStructuralFeature(eContainingFeature.getName()));
		if (eGet instanceof EList) {
			if (!((EList) eGet).isEmpty()) {
				return (EObject) ((EList) eGet).get(((EList) eGet).size() - 1);
			} else {
				return null;
			}
			
		}
		return (EObject) eGet;
	}

	/**
	 * @param modelElement
	 *            the element to process
	 * @return a list containing the element to expand
	 */
	public static List<Object> getExpansionPath(EObject modelElement) {
		final List<Object> result = new ArrayList<Object>();
		result.add(modelElement);
		EObject container = modelElement.eContainer();
		while (container != null) {
			result.add(0, container);
			container = container.eContainer();
		}
		return result;
	}

	/**
	 * @param obj
	 * @return the view corresponding to the ElementEditor.
	 */
	public static View getView(ElementEditor obj) {
		EObject container = obj.eContainer();
		while (container != null) {
			if (container instanceof View) {

				return (View) container;
			}
			container = container.eContainer();
		}
		return null;
	}

	/**
	 * @param editingElement
	 * @return the {@link PropertiesEditionComponent} containing the given
	 *         editingElement
	 */
	public static PropertiesEditionComponent getComponent(PropertiesEditionElement editingElement) {
		EObject container = editingElement.eContainer();
		while (container != null) {
			if (container instanceof PropertiesEditionComponent) {

				return (PropertiesEditionComponent) container;
			}
			container = container.eContainer();
		}
		return null;
	}

}
