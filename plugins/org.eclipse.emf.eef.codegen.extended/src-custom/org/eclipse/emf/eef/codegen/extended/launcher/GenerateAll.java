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
package org.eclipse.emf.eef.codegen.extended.launcher;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.EEFGen.EEFGenModel;
import org.eclipse.emf.eef.codegen.EEFCodegenPlugin;
import org.eclipse.emf.eef.codegen.core.launcher.AbstractPropertiesGeneratorLauncher;
import org.eclipse.emf.eef.codegen.core.services.PropertiesGeneratorLaunchersServices;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 *
 */
public class GenerateAll {


	public GenerateAll() {
	}
	

	public void doGenerate(EEFGenModel eefGenModel, IContainer target, IProgressMonitor monitor) throws IOException {
		Set<IContainer> generationTargets = new LinkedHashSet<IContainer>();
		generationTargets.add(target);
		try {
			final EEFEditorLauncher generator = new EEFEditorLauncher(eefGenModel, target.getLocation().toFile(), new ArrayList<String>());
			generator.doGenerate(BasicMonitor.toMonitor(monitor));
			List<AbstractPropertiesGeneratorLauncher> launchers = PropertiesGeneratorLaunchersServices.getInstance().getlaunchers();
			for (AbstractPropertiesGeneratorLauncher abstractPropertiesGeneratorLauncher : launchers) {
				EObject inputModel = generator.getModel();
				if (inputModel instanceof EEFGenModel) {
					abstractPropertiesGeneratorLauncher.doGenerate(eefGenModel,generator.getTargetFolder(),monitor);
					if (!abstractPropertiesGeneratorLauncher.getTargetContainer().isEmpty())
						generationTargets.addAll(abstractPropertiesGeneratorLauncher.getTargetContainer());
				}
			}
		} catch (IOException e) {
			EEFCodegenPlugin.getDefault().logError(e);
		}
		
		// Desactivation of Acceleo Traceability
	}
}
