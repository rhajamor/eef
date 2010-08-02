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
package org.eclipse.emf.eef.codegen.ui.generators.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IContainer;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.ui.actions.OrganizeImportsAction;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IWorkbenchSite;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 */
public class ImportOrganizer {

	public static void organizeImports(IWorkbenchSite site, Set<IContainer> folders) {
		List<ICompilationUnit> units = new ArrayList<ICompilationUnit>();
		for (IContainer container : folders) {
			IJavaElement element = JavaCore.create(container);
			try {
				if (element instanceof IPackageFragmentRoot) {
					IJavaElement[] children = ((IPackageFragmentRoot)element).getChildren();
					for (int i = 0; i < children.length; i++) {
						IJavaElement javaElement = children[i];
						if (javaElement instanceof IPackageFragment) {
							IPackageFragment fragment = (IPackageFragment)javaElement;
							units.addAll(Arrays.asList(fragment.getCompilationUnits()));
						}
					}
				}
			} catch (JavaModelException e) {
			}
		}
		OrganizeImportsAction organizeImportsAction = new OrganizeImportsAction(site);
		organizeImportsAction.run(new StructuredSelection(units));
	}

}
