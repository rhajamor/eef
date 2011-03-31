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
package org.eclipse.emf.eef.codegen.ui.generators.callback.imports;

import java.util.Set;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.eef.codegen.ui.generators.callback.EEFGenerationCallback;
import org.eclipse.emf.eef.codegen.ui.generators.common.ImportOrganizer;
import org.eclipse.emf.eef.runtime.impl.utils.EEFUtils;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchSite;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 *
 */
public class JDTImportsOrganisationCallback implements EEFGenerationCallback {

	private IWorkbenchSite site;

	/**
	 * @param site the current workbench site
	 */
	public JDTImportsOrganisationCallback(IWorkbenchSite site) {
		this.site = site;
	}



	/**
	 * {@inheritDoc]
	 * @see org.eclipse.emf.eef.codegen.ui.generators.callback.EEFGenerationCallback#execute()
	 */
	public void execute(final Set<IContainer> target, final IProgressMonitor monitor) {
		if (EEFUtils.isBundleLoaded(EEFUtils.JDT_CORE_SYMBOLIC_NAME)) {
			monitor.beginTask("Organize imports", 1);
			Display.getDefault().asyncExec(new Runnable() {
				public void run() {
					ImportOrganizer.organizeImports(site, target);
				}
			});
		}
		
	}

	
}
