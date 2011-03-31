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
import java.util.List;
import java.util.Map;

import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.codegen.core.initializer.AbstractTransformer;
import org.eclipse.emf.eef.components.ComponentsFactory;
import org.eclipse.emf.eef.components.PropertiesEditionContext;
import org.eclipse.emf.eef.extended.editor.AllResourcesRootsRelativeInput;
import org.eclipse.emf.eef.extended.editor.EEFEditorContributions;
import org.eclipse.emf.eef.extended.editor.EEFPage;
import org.eclipse.emf.eef.extended.editor.EditorFactory;
import org.eclipse.emf.eef.extended.editor.StaticEEFEditorContribution;
import org.eclipse.emf.eef.views.ViewElement;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 *
 */
public class EEFEditorContributionTransformer extends AbstractTransformer {

	
	/* ===== Constructor ===== */

	private Map<EObject, List<ViewElement>> workingResolvTemp;

	public EEFEditorContributionTransformer(Map<EObject, List<ViewElement>> workingResolvTemp) {
		this.workingResolvTemp = workingResolvTemp;
	}

	public PropertiesEditionContext genPackage2Context(GenPackage genPackage) {
		PropertiesEditionContext context = ComponentsFactory.eINSTANCE.createPropertiesEditionContext();
		context.setModel(genPackage);
		context.setDocumentation("Editor contribution for " + genPackage.getEcorePackage().getName() + " GenPackage");
		EEFEditorContributions contributions = EditorFactory.eINSTANCE.createEEFEditorContributions();
		contributions.setName(genPackage.getEcorePackage().getName() + " contributions");
		context.getCategories().add(contributions);
		contributions.getBindings().addAll(genPackage2Contributions(genPackage));
		return context;
	}

	private Collection<StaticEEFEditorContribution> genPackage2Contributions(GenPackage genPackage) {
		Collection<StaticEEFEditorContribution> result = new ArrayList<StaticEEFEditorContribution>();
		StaticEEFEditorContribution eefEditorContribution = EditorFactory.eINSTANCE.createStaticEEFEditorContribution();
		eefEditorContribution.setName("Main contribution");
		workingResolvTemp.get(genPackage.getEcorePackage());
		Collection<EEFPage> pages = new ArrayList<EEFPage>();
		for (ViewElement viewElement : workingResolvTemp.get(genPackage.getEcorePackage())) {
			if (viewElement instanceof EEFPage) {
				pages.add((EEFPage) viewElement);
			}
		}
		eefEditorContribution.getViews().addAll(pages);
		AllResourcesRootsRelativeInput input = EditorFactory.eINSTANCE.createAllResourcesRootsRelativeInput();
		eefEditorContribution.setInput(input);
		result.add(eefEditorContribution);
		return result ;
	}



}
