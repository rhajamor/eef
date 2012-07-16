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
package org.eclipse.emf.eef.modelingBot.interpreter;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.eef.components.PropertiesEditionContext;
import org.eclipse.emf.eef.modelingBot.Action;
import org.eclipse.emf.eef.modelingBot.DetailsPage;
import org.eclipse.emf.eef.modelingBot.IModelingBot;
import org.eclipse.emf.eef.modelingBot.ModelingBot;
import org.eclipse.emf.eef.modelingBot.Processing;
import org.eclipse.emf.eef.modelingBot.PropertiesView;
import org.eclipse.emf.eef.modelingBot.Scenario;
import org.eclipse.emf.eef.modelingBot.Sequence;
import org.eclipse.emf.eef.modelingBot.SequenceType;
import org.eclipse.emf.eef.modelingBot.Wizard;
import org.eclipse.emf.eef.modelingBot.EEFActions.Check;
import org.eclipse.emf.eef.modelingBot.swtbot.ComposedEEFBot;

/**
 * Interpreter for a list of modeling bots.
 * 
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 */
public class ComposedEEFInterpreter implements IModelingBotInterpreter {

	/**
	 * Editing domain.
	 */
	private EditingDomain editingDomain;

	/**
	 * List of modeling bots.
	 */
	private Collection<IModelingBot> modelingBots = new ArrayList<IModelingBot>();

	/**
	 * Map Bot <-> interpreter.
	 */
	// private Map<IModelingBot, IModelingBotInterpreter>
	// mapModelingBotInterpreter = new HashMap<IModelingBot,
	// IModelingBotInterpreter>();
	/**
	 * ComposedEEFBot.
	 */
	private IModelingBot composedEEFBot;

	/**
	 * Create the interpreter.
	 * 
	 * @param editingDomain
	 *            editing domain
	 */
	public ComposedEEFInterpreter(Collection<IModelingBot> modelingBots, EditingDomain editingDomain) {
		super();
		this.editingDomain = editingDomain;
		initInterpreter(modelingBots);
	}

	private void initInterpreter(Collection<IModelingBot> collection) {
		for (IModelingBot iModelingBot : collection) {
			if (iModelingBot instanceof ComposedEEFBot) {
				this.composedEEFBot = iModelingBot;
			} else {
				this.modelingBots.add(iModelingBot);
			}
		}
	}

	public void dispose() {

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.modelingBot.interpreter.IModelingBotInterpreter#runModelingBot(java.lang.String,
	 *      org.eclipse.emf.eef.modelingBot.IModelingBot)
	 */
	public void runModelingBot(String path) throws CoreException, IOException {
		final Resource modelingBotResource = loadModel(path);
		EcoreUtil.resolveAll(modelingBotResource.getResourceSet());
		assertFalse("The modeling bot resource is empty.", modelingBotResource.getContents().isEmpty());
		assertTrue("The modeling bot model contains errors, correct them first", modelingBotResource.getErrors()
				.isEmpty());
		final ModelingBot mbot = (ModelingBot)modelingBotResource.getContents().get(0);
		final Diagnostic diag = Diagnostician.INSTANCE.validate(mbot);
		assertTrue("The modeling bot model contains errors, correct them first", diag.getSeverity() == Diagnostic.OK);
		
		assertNotNull("The modeling bot resource is empty.", mbot);
		for (IModelingBot bot : modelingBots) {
			bot.getModelingBotInterpreter().setPropertiesEditionContext(mbot.getPropertiesEditionContext());
		}
		for (Sequence sequence : mbot.getSequences()) {
			if (sequence instanceof Scenario) {
				final Scenario scenario = (Scenario)sequence;
				runSequence(scenario);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.modelingBot.interpreter.IModelingBotInterpreter#runSequence(org.eclipse.emf.eef.modelingBot.Sequence)
	 */
	public void runSequence(Sequence sequence) {
		for (Processing processing : sequence.getProcessings()) {
			if (processing instanceof Action) {
				runAction((Action)processing);
			} else if (processing instanceof DetailsPage) {
				setSequenceType(SequenceType.DETAILS_PAGE);
				runSequence((DetailsPage)processing);
			} else if (processing instanceof PropertiesView) {
				setSequenceType(SequenceType.PROPERTIES_VIEW);
				runSequence((PropertiesView)processing);
			} else if (processing instanceof Wizard) {
				setSequenceType(SequenceType.WIZARD);
				runSequence((Wizard)processing);
				finishBatchEditing(processing);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.modelingBot.interpreter.IModelingBotInterpreter#runAction(org.eclipse.emf.eef.modelingBot.Action)
	 */
	public void runAction(Action action) {
		for (IModelingBot iModelingBot : modelingBots) {
			if (action instanceof Check) {
				composedEEFBot.check();
			} else {
				iModelingBot.getModelingBotInterpreter().runAction(action);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.modelingBot.interpreter.IModelingBotInterpreter#finishBatchEditing(org.eclipse.emf.eef.modelingBot.Processing)
	 */
	public void finishBatchEditing(Processing processing) {
		for (IModelingBot iModelingBot : modelingBots) {
			iModelingBot.getModelingBotInterpreter().finishBatchEditing(processing);
		}
	}

	private void setSequenceType(SequenceType sequenceType) {
		for (IModelingBot iModelingBot : modelingBots) {
			iModelingBot.setSequenceType(sequenceType);
		}
	}

	/**
	 * Get the loaded resource.
	 * 
	 * @param path
	 *            path of the model
	 * @return the resource loaded
	 * @throws IOException
	 * @throws CoreException
	 */
	public Resource loadModel(String path) throws IOException, CoreException {
		final URI fileURI = URI.createPlatformPluginURI(path, true);
		final Resource resource = editingDomain.getResourceSet().getResource(fileURI, true);
		assertNotNull("The modeling bot resource can not be loaded.", resource);
		return resource;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.modelingBot.interpreter.IModelingBotInterpreter#getPropertiesEditionContext()
	 */
	public PropertiesEditionContext getPropertiesEditionContext() {
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.modelingBot.interpreter.IModelingBotInterpreter#setPropertiesEditionContext(org.eclipse.emf.eef.components.PropertiesEditionContext)
	 */
	public void setPropertiesEditionContext(PropertiesEditionContext context) {

	}

}
