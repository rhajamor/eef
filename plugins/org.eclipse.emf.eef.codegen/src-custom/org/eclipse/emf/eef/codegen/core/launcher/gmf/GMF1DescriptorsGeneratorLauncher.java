/*******************************************************************************
 * Copyright (c) 2008-2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.codegen.core.launcher.gmf;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.eef.EEFGen.EEFGenModel;
import org.eclipse.emf.eef.codegen.EEFCodegenPlugin;
import org.eclipse.emf.eef.codegen.core.launcher.AbstractPropertiesGeneratorLauncher;

/**
 * Extension for generating PropertiesSection set up for GMF1 modelers
 * 
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 */
public class GMF1DescriptorsGeneratorLauncher extends
		AbstractPropertiesGeneratorLauncher {

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.codegen.core.launcher.IPropertiesGeneratorLauncher#doGenerate(org.eclipse.emf.eef.EEFGen.EEFGenModel,
	 *      java.io.File, org.eclipse.core.runtime.IProgressMonitor)
	 */
	public void doGenerate(EEFGenModel eefGenModel, File targetFolder,
			IProgressMonitor monitor) {
		List<Object> arguments = new ArrayList<Object>();
		monitor.subTask("Loading templates...");
		try {
			org.eclipse.emf.eef.codegen.launcher.GMF1DescriptorsGeneratorLauncher launcher = new org.eclipse.emf.eef.codegen.launcher.GMF1DescriptorsGeneratorLauncher(
					eefGenModel, targetFolder, arguments);
			monitor.worked(1);
			monitor.subTask("Generating using "
					+ eefGenModel.eResource().getURI().lastSegment() + "...");
			launcher.doGenerate(BasicMonitor.toMonitor(monitor));
			monitor.worked(1);
		} catch (IOException e) {
			EEFCodegenPlugin.getDefault().logError(e);
		}
	}
}
