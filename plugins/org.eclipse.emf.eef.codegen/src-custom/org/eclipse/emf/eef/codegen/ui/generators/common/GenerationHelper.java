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
package org.eclipse.emf.eef.codegen.ui.generators.common;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.eef.EEFGen.EEFGenModel;
import org.eclipse.emf.eef.codegen.EEFCodegenPlugin;
import org.eclipse.emf.eef.codegen.ui.generators.callback.EEFGenerationCallback;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 *
 */
public class GenerationHelper {
	
	private List<EEFGenModel> eefGenModels;
	private List<EEFGenerationCallback> callbacks;

	/**
	 * Defaut constructor
	 * @param eefgen the eefGen to generate
	 */
	public GenerationHelper(List<EEFGenModel> eefgen, List<EEFGenerationCallback> callbacks) {
		super();
		this.eefGenModels = eefgen;
		this.callbacks = callbacks;
	}
	
	public void generate(IProgressMonitor monitor) {
		try {
			if (eefGenModels != null) {
				for (final EEFGenModel eefGenModel : eefGenModels) {
					final IContainer target = getGenContainer(eefGenModel);
					if (target != null) {
						int count = 2;
						if (eefGenModel.getEditionContexts() != null)
							count += eefGenModel.getEditionContexts().size() * 11;
						if (eefGenModel.getViewsRepositories() != null)
							count += eefGenModel.getViewsRepositories().size() * 5;
						monitor.beginTask("Generating EEF Architecture", count);
						final GenerateAll generator = new GenerateAll(target, eefGenModel);
						generator.doGenerate(monitor);
						for (Iterator<IContainer> iterator = generator.getGenerationTargets()
								.iterator(); iterator.hasNext();) {
							IContainer nextContainer = iterator.next();
							nextContainer.refreshLocal(IResource.DEPTH_INFINITE, monitor);
						}
						monitor.worked(1);
						for (EEFGenerationCallback callback : callbacks) {
							callback.execute(generator.getGenerationTargets(), monitor);
						}
					}
				}
			}
		} catch (IOException e) {
			EEFCodegenPlugin.getDefault().logError(e);
		} catch (CoreException e) {
			EEFCodegenPlugin.getDefault().logError(e);
		} finally {
			monitor.done();
		}

	}
	
	public IContainer getGenContainer(EEFGenModel eefGenModel) throws IOException {
		if (eefGenModel != null) {
			if (eefGenModel.getGenDirectory() != null) {
				final IContainer target = (IContainer)ResourcesPlugin.getWorkspace().getRoot().getFolder(
						new Path(eefGenModel.getGenDirectory()));
				return target;
			}
		}
		return null;
	}


}
