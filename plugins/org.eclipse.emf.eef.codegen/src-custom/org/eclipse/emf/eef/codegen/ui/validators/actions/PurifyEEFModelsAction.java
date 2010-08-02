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
package org.eclipse.emf.eef.codegen.ui.validators.actions;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.CrossReferencer;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.emf.eef.EEFGen.EEFGenModel;
import org.eclipse.emf.eef.EEFGen.GenViewsRepository;
import org.eclipse.emf.eef.codegen.EEFCodegenPlugin;
import org.eclipse.emf.eef.views.ElementEditor;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 */
public class PurifyEEFModelsAction implements IObjectActionDelegate {

	private URI modelURI;

	private IFile selectedFile;

	private EEFGenModel eefGenModel;

	/**
	 * Constructor for Action1.
	 */
	public PurifyEEFModelsAction() {
		super();
		selectedFile = null;
		eefGenModel = null;
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		if (selectedFile != null) {
			try {
				modelURI = URI.createPlatformResourceURI(selectedFile.getFullPath().toString(), true);
				IContainer target = getGenContainer();
				if (target != null) {
					int processCount = 0;
					Set<Resource> resourcesToSave = new HashSet<Resource>();
					eefGenModel = getEEFGenModel();
					if (eefGenModel != null) {
						int count = 0;
						if (eefGenModel.getEditionContexts() != null)
							count += eefGenModel.getEditionContexts().size();
						if (eefGenModel.getViewsRepositories() != null)
							count += eefGenModel.getViewsRepositories().size();
						ResourceSet resourceSet = eefGenModel.eResource().getResourceSet();
						EcoreUtil.resolveAll(resourceSet);
						CrossReferencer referencer = new CrossReferencer(resourceSet) {
							/**
							 * Serialization ID
							 */
							private static final long serialVersionUID = -8116181119811335250L;

							{
								crossReference();
							}
						};
						for (GenViewsRepository genViewsRepository : eefGenModel.getViewsRepositories()) {
							TreeIterator<EObject> allContents = genViewsRepository.getViewsRepository()
									.eAllContents();
							while (allContents.hasNext()) {
								EObject next = allContents.next();
								if (next instanceof ElementEditor) {
									ElementEditor elementEditor = (ElementEditor)next;
									Collection<Setting> references = referencer.get(next);
									if (references == null || references.size() == 0) {
										if (elementEditor.eContainer().eGet(
												elementEditor.eContainingFeature()) instanceof EList) {
											processCount++;
											EEFCodegenPlugin.getDefault().getLog().log(
													new Status(IStatus.WARNING, EEFCodegenPlugin.PLUGIN_ID,
															elementEditor.getName()
																	+ " ("
																	+ ((XMIResourceImpl)elementEditor
																			.eResource())
																			.getID(elementEditor)
																	+ ") will be removed"));
											resourcesToSave.add(elementEditor.eContainer().eResource());
											((EList)elementEditor.eContainer().eGet(
													elementEditor.eContainingFeature()))
													.remove(elementEditor);
										}
									}
								}
							}
							selectedFile = null;
							eefGenModel = null;
						}
						for (Resource resource : resourcesToSave) {
							resource.save(Collections.EMPTY_MAP);
						}
						EEFCodegenPlugin.getDefault().getLog().log(
								new Status(IStatus.OK, EEFCodegenPlugin.PLUGIN_ID, "Purification done. "
										+ processCount + " element removed."));
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof StructuredSelection) {
			StructuredSelection sSelection = (StructuredSelection)selection;
			if (sSelection.getFirstElement() instanceof IFile) {
				this.selectedFile = (IFile)sSelection.getFirstElement();
			}

		}
	}

	private EEFGenModel getEEFGenModel() throws IOException {
		if (eefGenModel != null)
			return eefGenModel;
		else {
			ResourceSet resourceSet = new ResourceSetImpl();
			String fileExtension = modelURI.fileExtension();
			if (fileExtension == null || fileExtension.length() == 0) {
				fileExtension = Resource.Factory.Registry.DEFAULT_EXTENSION;
			}
			final Resource.Factory.Registry registry = Resource.Factory.Registry.INSTANCE;
			final Object resourceFactory = registry.getExtensionToFactoryMap().get(fileExtension);
			if (resourceFactory != null) {
				resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(fileExtension,
						resourceFactory);
			} else {
				resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(fileExtension,
						new XMIResourceFactoryImpl());
			}
			Resource res = resourceSet.createResource(modelURI);
			res.load(Collections.EMPTY_MAP);
			EcoreUtil.resolveAll(resourceSet);
			if (res.getContents().size() > 0) {
				EObject object = res.getContents().get(0);
				if (object instanceof EEFGenModel) {
					eefGenModel = (EEFGenModel)object;
					if (eefGenModel != null) {
						return eefGenModel;
					}
				}
			}
			return null;
		}
	}

	public IContainer getGenContainer() throws IOException {
		eefGenModel = getEEFGenModel();
		if (eefGenModel != null) {
			if (eefGenModel.getGenDirectory() != null) {
				final IContainer target = (IContainer)ResourcesPlugin.getWorkspace().getRoot().getFolder(
						new Path(eefGenModel.getGenDirectory()));
				return target;
			}
		}
		return null;
	}

	class EEFElementEditorReferenceError {

		private ElementEditor element;

		public EEFElementEditorReferenceError(ElementEditor element) {
			this.element = element;
		}

		public String getErrorMsg() {
			return "ElementEditor '" + element.getName() + "' ("
					+ ((XMIResourceImpl)element.eResource()).getID(element) + ") seems to not be referenced";
		}
	}

}
