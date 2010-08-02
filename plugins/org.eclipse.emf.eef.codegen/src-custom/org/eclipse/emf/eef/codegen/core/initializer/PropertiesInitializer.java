/*******************************************************************************
 * Copyright (c) 2008, 2009 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.codegen.core.initializer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.eef.EEFGen.EEFGenFactory;
import org.eclipse.emf.eef.EEFGen.EEFGenModel;
import org.eclipse.emf.eef.EEFGen.GenEditionContext;
import org.eclipse.emf.eef.EEFGen.GenViewsRepository;
import org.eclipse.emf.eef.components.PropertiesEditionContext;
import org.eclipse.emf.eef.components.resources.ComponentsResourceFactory;
import org.eclipse.emf.eef.views.View;
import org.eclipse.emf.eef.views.ViewsFactory;
import org.eclipse.emf.eef.views.ViewsRepository;
import org.eclipse.emf.eef.views.resources.ViewsResourceFactory;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 */
public class PropertiesInitializer extends AbstractPropertiesInitializer {

	private static final String SWT_TOOLKIT_NAME = "SWT";

	private static final String EMF_PROPERTIES_TOOLKIT_NAME = "EMFProperties";

	private static String swt_pathmap = null;

	private static String emfproperties_pathmap = null;

	private static String findToolkitPath(EObject view, String str) {
		String res = "platform:/plugin/org.eclipse.emf.eef.views/std/" + str + ".toolkits";
		return res;
	}

	public static String getSWTPathmap(EObject view) {
		if (swt_pathmap == null) {
			swt_pathmap = findToolkitPath(view, SWT_TOOLKIT_NAME);
		}
		return swt_pathmap;
	}

	public static String getEMFPropertiesPathmap(EObject view) {
		if (emfproperties_pathmap == null) {
			emfproperties_pathmap = findToolkitPath(view, EMF_PROPERTIES_TOOLKIT_NAME);
		}
		return emfproperties_pathmap;
	}

	/**
	 * Updates the registry used for looking up a package based namespace, in the resource set.
	 * 
	 * @param resourceSet
	 *            is the resource set
	 * @generated
	 */
	private void registerPackages(ResourceSet resourceSet) {
		resourceSet.getPackageRegistry().put(
				org.eclipse.emf.eef.components.ComponentsPackage.eINSTANCE.getNsURI(),
				org.eclipse.emf.eef.components.ComponentsPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getNsURI(),
				org.eclipse.emf.ecore.EcorePackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(GenModelPackage.eINSTANCE.getNsURI(), GenModelFactory.eINSTANCE);
		resourceSet.getPackageRegistry().put(org.eclipse.emf.eef.views.ViewsPackage.eINSTANCE.getNsURI(),
				org.eclipse.emf.eef.views.ViewsPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(
				org.eclipse.emf.eef.toolkits.ToolkitsPackage.eINSTANCE.getNsURI(),
				org.eclipse.emf.eef.toolkits.ToolkitsPackage.eINSTANCE);

	}

	/**
	 * @param modelURI
	 * @param resourceSet
	 * @return
	 * @throws IOException
	 */
	private EObject load(URI modelURI, ResourceSet resourceSet) throws IOException {
		EObject result = null;
		final Resource modelResource = createResource(modelURI, resourceSet);
		final Map<String, String> options = new HashMap<String, String>();
		options.put(XMLResource.OPTION_ENCODING, System.getProperty("file.encoding"));
		modelResource.load(options);
		if (modelResource.getContents().size() > 0) {
			result = modelResource.getContents().get(0);
		}
		return result;
	}

	/**
	 * Updates the registry used for looking up resources factory in the given resource set.
	 * 
	 * @param resourceSet
	 *            The resource set that is to be updated.
	 * @generated
	 */
	private void registerResourceFactories(ResourceSet resourceSet) {
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore",
				new EcoreResourceFactoryImpl());
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("views",
				new ViewsResourceFactory());
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("components",
				new ComponentsResourceFactory());
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
				Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
	}

	/**
	 * This will create a {@link Resource} given the model extension it is intended for and a ResourceSet.
	 * 
	 * @param modelURI
	 *            {@link org.eclipse.emf.common.util.URI URI} where the model is stored.
	 * @param resourceSet
	 *            The {@link ResourceSet} to load the model in.
	 * @return The {@link Resource} given the model extension it is intended for.
	 * @generated
	 */
	private Resource createResource(URI modelURI, ResourceSet resourceSet) {
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
		return resourceSet.createResource(modelURI);
	}

	// /**
	// * The main method.
	// *
	// * @param args
	// * are the arguments
	// * @throws CoreException
	// * @generated
	// */
	// public static void main(String[] args) {
	// try {
	// if (args.length != 2) {
	// System.out.println("Arguments not valid : {model, folder}.");
	// } else {
	// modelURI = URI.createURI("file:/" + args[0]);
	// File folder = new File(args[1]);
	// PropertiesInitializer initializer = new PropertiesInitializer(modelURI, folder);
	// initializer.initialize();
	// }
	// } catch (IOException e) {
	// e.printStackTrace();
	// }
	// }

	public void initialize(URI modelURI, IContainer targetFolder) throws IOException, CoreException {

		ResourceSet resourceSet = new ResourceSetImpl();
		registerResourceFactories(resourceSet);
		registerPackages(resourceSet);
		EObject model = load(modelURI, resourceSet);

		if (!targetFolder.exists()) {
			if (targetFolder instanceof IFolder)
				((IFolder)targetFolder).create(true, true, new NullProgressMonitor());
			else
				return;
		}

		Map<String, EObject> toolkits = new HashMap<String, EObject>();
		View instanceView = ViewsFactory.eINSTANCE.createView();
		toolkits.put(SWT_TOOLKIT_NAME, load(URI.createURI(getSWTPathmap(instanceView), false), model
				.eResource().getResourceSet()));
		toolkits.put(EMF_PROPERTIES_TOOLKIT_NAME, load(URI.createURI(getEMFPropertiesPathmap(instanceView),
				false), model.eResource().getResourceSet()));

		ViewTransformer viewTransformer = new ViewTransformer(toolkits);
		TreeIterator<EObject> allContents = model.eAllContents();
		List<ViewsRepository> repositories = new ArrayList<ViewsRepository>();
		List<PropertiesEditionContext> contexts = new ArrayList<PropertiesEditionContext>();
		while (allContents.hasNext()) {
			EObject next = allContents.next();
			if (next instanceof GenPackage) {
				GenPackage genPack = (GenPackage)next;
				if (genPack.eContents().size() >= 1) {
					ViewsRepository repository = viewTransformer.genPackage2ViewsRepository(genPack,
							SWT_TOOLKIT_NAME);
					repositories.add(repository);
					ComponentTransformer componentTransformer = new ComponentTransformer(viewTransformer
							.getWorkingResolvTemp());
					PropertiesEditionContext context = componentTransformer.genPackage2Context(genPack);
					contexts.add(context);

				}
			}
		}
		String componentsFilePath = targetFolder.getFullPath() + "/"
				+ model.eResource().getURI().trimFileExtension().lastSegment() + ".components";
		URI componentsModelUri = URI.createPlatformResourceURI(componentsFilePath, false);
		Resource componentsResource = model.eResource().getResourceSet().createResource(componentsModelUri);
		for (PropertiesEditionContext context : contexts)
			componentsResource.getContents().add(context);
		for (ViewsRepository repository : repositories)
			componentsResource.getContents().add(repository);
		componentsResource.save(Collections.EMPTY_MAP);
		EEFGenModel eefGenModel = createEEFGenModel(repositories, contexts, targetFolder);
		String eefgenFilePath = targetFolder.getFullPath() + "/"
				+ model.eResource().getURI().trimFileExtension().lastSegment() + ".eefgen";
		URI eefgenModelUri = URI.createPlatformResourceURI(eefgenFilePath, false);
		Resource eefgenResource = model.eResource().getResourceSet().createResource(eefgenModelUri);
		eefgenResource.getContents().add(eefGenModel);
		eefgenResource.save(Collections.EMPTY_MAP);
		return;

	}

	private EEFGenModel createEEFGenModel(List<ViewsRepository> repositories,
			List<PropertiesEditionContext> contexts, IContainer targetFolder) {
		EEFGenModel eefGenModel = EEFGenFactory.eINSTANCE.createEEFGenModel();
		eefGenModel.setGenDirectory(findGenDirectory(targetFolder));
		for (PropertiesEditionContext context : contexts)
			eefGenModel.getEditionContexts().add(createGenEditionContext(context));
		String contextPackage = "";
		if (contexts.size() > 0)
			contextPackage = findBasePackage(contexts.get(0).getModel()) + "."
					+ contexts.get(0).getModel().getEcorePackage().getName().toLowerCase();
		for (ViewsRepository repository : repositories)
			eefGenModel.getViewsRepositories().add(createGenViewsRepository(repository, contextPackage));
		return eefGenModel;
	}

	private GenEditionContext createGenEditionContext(PropertiesEditionContext context) {
		GenEditionContext genEditionContext = EEFGenFactory.eINSTANCE.createGenEditionContext();
		genEditionContext.setPropertiesEditionContext(context);
		if (context.getModel() != null)
			genEditionContext.setBasePackage(findBasePackage(context.getModel()));
		genEditionContext.setDescriptorsGenericPropertiesViews(true);
		return genEditionContext;
	}

	private GenViewsRepository createGenViewsRepository(ViewsRepository repository, String contextPackage) {
		GenViewsRepository genViewsRepository = EEFGenFactory.eINSTANCE.createGenViewsRepository();
		genViewsRepository.setViewsRepository(repository);
		genViewsRepository.setBasePackage(contextPackage);
		genViewsRepository.setSwtViews(true);
		genViewsRepository.setFormViews(true);
		return genViewsRepository;
	}

	private String findBasePackage(GenPackage genPackage) {
		if (genPackage.getBasePackage() != null)
			return genPackage.getBasePackage();
		return "";
	}

	private String findGenDirectory(IContainer targetFolder) {
		return targetFolder.getFullPath().removeLastSegments(1).toString() + "/src-gen";
	}

}
