/*******************************************************************************
 * Copyright (c) 2008, 2010 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.runtime.impl.utils;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 */
public class ModelViewerHelper {

	private static IStructuredSelection lastSelection;

	public static void setLastSelection(IStructuredSelection selection) {
		lastSelection = selection;
	}

	public static IStructuredSelection getLastSelection() {
		return lastSelection;
	}

	public static final String NAME = EEFRuntimeMessages.ModelViewerHelper_name_feature;

	public static String getName(Object element) {
		if (element instanceof EObject) {
			EObject eobj = (EObject)element;
			EStructuralFeature structuralFeature = eobj.eClass().getEStructuralFeature(NAME);
			if (structuralFeature != null) {
				Object name = eobj.eGet(structuralFeature);
				if (name == null) {
					return null;
				}
				return name.toString();
			}
			if (eobj instanceof EClass) {
				String type = ((EClass)eobj).getName();
				if (type != null && type != "") { //$NON-NLS-1$
					return type;
				}
			}
			return null;
		}
		return null;
	}

	/**
	 * Sets the selected existing container.
	 * 
	 * @param container
	 */
	public static void setSelectedElement(TreeViewer treeViewer, IResource resource) {
		// expand to and select the specified container
		List<IContainer> itemsToExpand = new ArrayList<IContainer>();
		IContainer parent = resource.getParent();
		while (parent != null) {
			itemsToExpand.add(0, parent);
			parent = parent.getParent();
		}
		treeViewer.setExpandedElements(itemsToExpand.toArray());
		treeViewer.setSelection(new StructuredSelection(resource), true);
	}
}
