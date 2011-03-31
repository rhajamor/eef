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
package org.eclipse.emf.eef.codegen.extended.initializer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.codegen.core.initializer.AbstractTransformer;
import org.eclipse.emf.eef.extended.editor.EEFEditorPages;
import org.eclipse.emf.eef.extended.editor.EEFPage;
import org.eclipse.emf.eef.extended.editor.EditorFactory;
import org.eclipse.emf.eef.extended.editor.TreeMasterPage;
import org.eclipse.emf.eef.views.ViewElement;
import org.eclipse.emf.eef.views.ViewsFactory;
import org.eclipse.emf.eef.views.ViewsRepository;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 *
 */
public class EEFPagesTransformer extends AbstractTransformer {
	
	private Map<EObject, List<ViewElement>> workingResolvTemp;
	private ViewsRepository repository;

	public EEFPagesTransformer() {
		workingResolvTemp = new HashMap<EObject, List<ViewElement>>();
	}

	public Map<EObject, List<ViewElement>> getWorkingResolvTemp() {
		return workingResolvTemp;
	}
	
	public void addElementToEObject(EObject source, ViewElement element) {
		if (workingResolvTemp.get(source) != null)
			workingResolvTemp.get(source).add(element);
		else {
			List<ViewElement> list = new UniqueEList<ViewElement>();
			list.add(element);
			workingResolvTemp.put(source, list);
		}
	}
	
	public ViewsRepository genPackage2ViewsRepository(GenPackage genPackage) {
		repository = ViewsFactory.eINSTANCE.createViewsRepository();
		repository.getRepositoryKind().add("Editor");
		repository.setName(genPackage.getEcorePackage().getName() + " editor");
		repository.setDocumentation("Editor pages for " + genPackage.getEcorePackage().getName() + " GenPackage");
		EEFEditorPages editorPages = EditorFactory.eINSTANCE.createEEFEditorPages();
		editorPages.setName(genPackage.getEcorePackage().getName() + " editor pages");
		repository.getCategories().add(editorPages);
		editorPages.getViews().addAll(genPackage2EditorPages(genPackage));

		return repository;

	}

	/**
	 * @param genPackage
	 * @return
	 */
	private Collection<EEFPage> genPackage2EditorPages(GenPackage genPackage) {
		Collection<EEFPage> result = new ArrayList<EEFPage>();
		TreeMasterPage mainPage = EditorFactory.eINSTANCE.createTreeMasterPage();
		mainPage.setName("main");
		mainPage.setTitle(genPackage.getEcorePackage().getName());
		addElementToEObject(genPackage.getEcorePackage(), mainPage);
		result.add(mainPage);
		return result;
	}

}
