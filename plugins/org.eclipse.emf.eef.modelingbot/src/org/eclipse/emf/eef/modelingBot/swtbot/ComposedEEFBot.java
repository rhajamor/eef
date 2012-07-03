/*******************************************************************************
 * Copyright (c) 2008, 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.modelingBot.swtbot;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.compare.diff.metamodel.DiffGroup;
import org.eclipse.emf.compare.diff.metamodel.DiffModel;
import org.eclipse.emf.compare.diff.service.DiffService;
import org.eclipse.emf.compare.match.metamodel.MatchModel;
import org.eclipse.emf.compare.match.service.MatchService;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.eef.components.PropertiesEditionElement;
import org.eclipse.emf.eef.extended.editor.ReferenceableObject;
import org.eclipse.emf.eef.modelingBot.IModelingBot;
import org.eclipse.emf.eef.modelingBot.SequenceType;
import org.eclipse.emf.eef.modelingBot.interpreter.ComposedEEFInterpreter;
import org.eclipse.emf.eef.modelingBot.interpreter.IModelingBotInterpreter;
import org.eclipse.emf.eef.modelingBot.uri.EEFURIConverter;
import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;
import org.eclipse.emf.eef.runtime.impl.utils.EEFUtils;

/**
 * Composed eef bot : SWTEEFbot and BatchModeling bot.
 * 
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 */
public class ComposedEEFBot implements IModelingBot {

	/**
	 * The ResourceSet where to operate.
	 */
	protected EditingDomain editingDomain = new AdapterFactoryEditingDomain(EEFRuntimePlugin.getDefault()
			.getAdapterFactory(), new BasicCommandStack());

	/**
	 * Composed eef interpreter.
	 */
	private ComposedEEFInterpreter interpreter;

	/**
	 * Bots Collection.
	 */
	private Collection<IModelingBot> bots;

	public ComposedEEFBot(Collection<IModelingBot> bots) {
		super();
		this.bots = bots;
		editingDomain.getResourceSet().setURIConverter(new EEFURIConverter());
		final List<IModelingBot> list = new ArrayList<IModelingBot>();
		list.addAll(bots);
		list.add(this);
		interpreter = new ComposedEEFInterpreter(list, editingDomain);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.modelingBot.IModelingBot#runModelingBot(java.lang.String)
	 */
	public void runModelingBot(String path) throws CoreException, IOException {
		interpreter.runModelingBot(path);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.modelingBot.IModelingBot#createProject(java.lang.String)
	 */
	public void createProject(String projectName) {
		// do nothing
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.modelingBot.IModelingBot#openProject(java.lang.String)
	 */
	public void openProject(String projectName) {
		// do nothing
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.modelingBot.IModelingBot#closeProject(java.lang.String)
	 */
	public void closeProject(String projectName) {
		// do nothing
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.modelingBot.IModelingBot#removeProject(java.lang.String)
	 */
	public void removeProject(String projectName) {
		// do nothing
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.modelingBot.IModelingBot#openPerspective(java.lang.String)
	 */
	public void openPerspective(String name) {
		// do nothing
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.modelingBot.IModelingBot#openEEFEditor(java.lang.String)
	 */
	public void openEEFEditor(String path) {
		// do nothing
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.modelingBot.IModelingBot#closeEditor(java.lang.String)
	 */
	public void closeEditor(String path) {
		// do nothing
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.modelingBot.IModelingBot#save()
	 */
	public void save() {
		// do nothing
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.modelingBot.IModelingBot#add(org.eclipse.emf.eef.components.PropertiesEditionElement,
	 *      org.eclipse.emf.eef.extended.editor.ReferenceableObject, org.eclipse.emf.ecore.EStructuralFeature,
	 *      org.eclipse.emf.ecore.EClass)
	 */
	public EObject add(PropertiesEditionElement propertiesEditionElement, ReferenceableObject referenceableObject,
			EStructuralFeature eContainingFeature, EClass type) {
		// do nothing
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.modelingBot.IModelingBot#remove(org.eclipse.emf.eef.components.PropertiesEditionElement,
	 *      org.eclipse.emf.eef.extended.editor.ReferenceableObject)
	 */
	public void remove(PropertiesEditionElement propertiesEditionElement, ReferenceableObject referenceableObject) {
		// do nothing
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.modelingBot.IModelingBot#set(org.eclipse.emf.eef.components.PropertiesEditionElement,
	 *      org.eclipse.emf.eef.extended.editor.ReferenceableObject, org.eclipse.emf.ecore.EStructuralFeature,
	 *      java.lang.String)
	 */
	public void set(PropertiesEditionElement propertiesEditionElement, ReferenceableObject referenceableObject,
			EStructuralFeature eContainingFeature, String value) {
		// do nothing
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.modelingBot.IModelingBot#set(org.eclipse.emf.eef.components.PropertiesEditionElement,
	 *      org.eclipse.emf.eef.extended.editor.ReferenceableObject, org.eclipse.emf.ecore.EStructuralFeature,
	 *      org.eclipse.emf.eef.extended.editor.ReferenceableObject)
	 */
	public void set(PropertiesEditionElement propertiesEditionElement, ReferenceableObject referenceableObject,
			EStructuralFeature eContainingFeature, ReferenceableObject value) {
		// do nothing
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.modelingBot.IModelingBot#unset(org.eclipse.emf.eef.components.PropertiesEditionElement,
	 *      org.eclipse.emf.eef.extended.editor.ReferenceableObject, org.eclipse.emf.ecore.EStructuralFeature)
	 */
	public void unset(PropertiesEditionElement propertiesEditionElement, ReferenceableObject referenceableObject,
			EStructuralFeature eContainingFeature) {
		// do nothing
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.modelingBot.IModelingBot#createModel(java.lang.String, java.lang.String,
	 *      org.eclipse.emf.ecore.EClass)
	 */
	public EObject createModel(String path, String modelName, EClass eClass) {
		// do nothing
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.modelingBot.IModelingBot#cancel()
	 */
	public void cancel() {
		// do nothing
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.modelingBot.IModelingBot#setSequenceType(org.eclipse.emf.eef.modelingBot.SequenceType)
	 */
	public void setSequenceType(SequenceType sequenceType) {
		// do nothing
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.modelingBot.IModelingBot#validateBatchEditing()
	 */
	public void validateBatchEditing() {
		// do nothing
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.modelingBot.IModelingBot#check()
	 */
	public void check() {
		for (IModelingBot bot : bots) {
			bot.check();
		}
		for (int i = 0; i < bots.size(); i++) {
			for (int j = i + 1; j < bots.size(); j++) {
				try {
					assertExpectedModelReached(((IModelingBot)bots.toArray()[i]).getActiveResource(),
							((IModelingBot)bots.toArray()[j]).getActiveResource());
				} catch (InterruptedException e) {
					fail("Error during model comparison.");
				}
			}
		}
	}

	public void assertExpectedModelReached(Resource expectedModel, Resource batchModel) throws InterruptedException {
		final Map<String, Object> options = new HashMap<String, Object>();
		options.put(org.eclipse.emf.compare.match.MatchOptions.OPTION_IGNORE_XMI_ID, Boolean.TRUE);
		final MatchModel match = MatchService.doResourceMatch(batchModel, expectedModel, options);
		final DiffModel diff = DiffService.doDiff(match);
		final List<EObject> diffList = EEFUtils.asEObjectList(diff.eAllContents());
		final List<EObject> result = filterAbnormalDiffElement(diffList);
		if (!result.isEmpty()) {
			System.out.println(result);
		}
		assertTrue("The active model isn't the same that the expected model.", result.isEmpty());
	}

	/**
	 * TODO: check this with the EMF Compare team
	 * 
	 * @param diffList
	 *            the list to filter
	 * @return the list of "good" diff
	 */
	private List<EObject> filterAbnormalDiffElement(List<EObject> diffList) {
		final List<EObject> result = new ArrayList<EObject>();
		for (EObject object : diffList) {
			if (!(object instanceof DiffGroup))
				result.add(object);
			else if (object.eContents().size() > 0)
				result.addAll(filterAbnormalDiffElement(object.eContents()));
		}
		return result;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.modelingBot.IModelingBot#getActiveResource()
	 */
	public Resource getActiveResource() {
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.modelingBot.IModelingBot#getModelingBotInterpreter()
	 */
	public IModelingBotInterpreter getModelingBotInterpreter() {
		return interpreter;
	}

	public EObject add(PropertiesEditionElement propertiesEditionElement,
			ReferenceableObject referenceableObjectContainer,
			ReferenceableObject referenceableObject,
			EStructuralFeature eContainingFeature, EClass type) {
		// TODO Auto-generated method stub
		return null;
	}

	public void unsetReference(PropertiesEditionElement propertiesEditionElement,
			ReferenceableObject referenceableObject,
			EStructuralFeature eContainingFeature, EList<ReferenceableObject> values) {
		// TODO Auto-generated method stub
		
	}

	public void undo() {
		// TODO Auto-generated method stub
		
	}

	public void redo() {
		// TODO Auto-generated method stub
		
	}

}
