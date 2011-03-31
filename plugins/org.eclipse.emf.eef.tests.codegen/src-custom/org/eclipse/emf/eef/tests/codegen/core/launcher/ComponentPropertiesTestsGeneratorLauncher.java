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
package org.eclipse.emf.eef.tests.codegen.core.launcher;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.eef.EEFGen.EEFGenModel;
import org.eclipse.emf.eef.EEFGen.GenEditionContext;
import org.eclipse.emf.eef.codegen.EEFCodegenPlugin;
import org.eclipse.emf.eef.codegen.core.launcher.AbstractPropertiesGeneratorLauncher;
import org.eclipse.emf.eef.components.PropertiesEditionContext;
import org.eclipse.emf.eef.tests.codegen.main.cases.ComponentPropertiesTests;

/**
 * Extension for generating PropertiesSection set up for GMF1 modelers
 * 
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 */
public class ComponentPropertiesTestsGeneratorLauncher extends AbstractPropertiesGeneratorLauncher {

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.codegen.core.launcher.IPropertiesGeneratorLauncher#doGenerate(org.eclipse.emf.eef.EEFGen.EEFGenModel,
	 *      java.io.File, org.eclipse.core.runtime.IProgressMonitor)
	 */
	public void doGenerate(EEFGenModel eefGenModel, File targetFolder, IProgressMonitor monitor) {
		List<Object> arguments = new ArrayList<Object>();
		for (GenEditionContext genEditionContext : eefGenModel.getEditionContexts()) {
			if (genEditionContext.isGenerateJunitTestCases()) {
				try {
					PropertiesEditionContext propertiesEditionContext = genEditionContext.getPropertiesEditionContext();
					monitor.subTask("Generating JUnits TestCases");
					IContainer testGenContainer = getTestGenContainer(eefGenModel);
					if (testGenContainer != null && !testGenContainer.exists()) {
						EEFCodegenPlugin.getDefault().logWarning(new FileNotFoundException("Cannot find junit test project named \"" + testGenContainer.getProject().getName() + "\""));
						return;
					}
					ComponentPropertiesTests gen = new ComponentPropertiesTests(propertiesEditionContext, testGenContainer.getLocation().toFile(), arguments);
					gen.doGenerate(BasicMonitor.toMonitor(monitor));
					targetContainer.add(testGenContainer);
					monitor.worked(1);
				} catch (IOException e) {
					EEFCodegenPlugin.getDefault().logError(e);
				}
			}
		}
	}

	/**
	 * Returns the container that the EEFGenModel use as generation directory
	 * 
	 * @param eefGenModel
	 *            the eefGenModel
	 * @return the generation directory
	 * @throws IOException
	 *             an error occurred during container creation
	 */
	public IContainer getTestGenContainer(EEFGenModel eefGenModel) throws IOException {
		if (eefGenModel != null) {
			if (eefGenModel.getGenDirectory() != null) {
				final IContainer target = ResourcesPlugin.getWorkspace().getRoot()
						.getFolder(new Path(eefGenModel.getTestsGenDirectory()));
				return target;
			}
		}
		return null;
	}

}
