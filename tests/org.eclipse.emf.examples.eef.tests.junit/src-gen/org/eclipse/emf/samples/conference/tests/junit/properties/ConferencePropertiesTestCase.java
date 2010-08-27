/*******************************************************************************
 * Copyright (c) 2009 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.samples.conference.tests.junit.properties;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.eef.runtime.tests.SWTBotEEFTestCase;
import org.eclipse.emf.eef.runtime.tests.exceptions.InputModelInvalidException;
import org.eclipse.emf.eef.runtime.tests.exceptions.WidgetInvalidException;
import org.eclipse.emf.eef.runtime.tests.utils.EEFTestsModelsUtils;
import org.eclipse.emf.eef.runtime.ui.utils.EEFRuntimeUIMessages;
import org.eclipse.emf.samples.conference.ConferencePackage;
import org.eclipse.emf.samples.conference.Site;
import org.eclipse.emf.samples.conference.providers.ConferenceMessages;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotEditor;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotView;
import org.eclipse.swtbot.swt.finder.SWTBot;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotShell;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTreeItem;
/**
 * TestCase for Conference
 * @author <a href="mailto:stephane.bouchet@obeo.fr">Stephane Bouchet</a>
 */
public class ConferencePropertiesTestCase extends SWTBotEEFTestCase {

	/**
	 * The EClass of the type to edit
	 */
	private EClass conferenceMetaClass = ConferencePackage.eINSTANCE.getConference();

	/**
	 * The type to edit
	 */
	private EObject conference;
	/**
	 * The EClass of the reference to edit
	 */
	private EClass siteMetaClass = ConferencePackage.eINSTANCE.getSite();	
	/**
	 * The eObjects list contained in widgets
	 */
	private List allInstancesOf;
	/**
	 * Updated value of the feature
	 */
	private static final String UPDATED_VALUE = "value2";

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.tests.SWTBotEEFTestCase#getExpectedModelName()
	 */
	protected String getExpectedModelName() {
		return "expected.conference";
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.tests.SWTBotEEFTestCase#getInputModelFolder()
	 */
	protected String getInputModelFolder() {
		return "input";
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.tests.SWTBotEEFTestCase#getInputModelName()
	 */
	protected String getInputModelName() {
		return "input.conference";
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.tests.SWTBotEEFTestCase#getTestsProjectName()
	 */
	protected String getTestsProjectName() {
		return "org.eclipse.emf.examples.eef.tests.junit";
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.tests.SWTBotEEFTestCase#getExpectedModelFolder()
	 */
	protected String getExpectedModelFolder() {
		// The project that contains models for tests
		return "expected";
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.tests.SWTBotEEFTestCase#getImportModelsFolder()
	 */
	protected String getImportModelsFolder() {
		return  "models";
	}
	/**
	 * Create the expected model from the input model
	 * @throws InputModelInvalidException error during expected model initialization
	 * @throws IOException error during expected model serialization
	 */
	protected void initializeExpectedModelForConferencePlace() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject conference = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, conferenceMetaClass);
		if (conference == null)
			throw new InputModelInvalidException(conferenceMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
				cc.append(SetCommand.create(editingDomain, conference, ConferencePackage.eINSTANCE.getConference_Place(), UPDATED_VALUE));
		editingDomain.getCommandStack().execute(cc);
		expectedModel.save(Collections.EMPTY_MAP);
	}
	/**
	 * Test the editor properties :
	 * - init the input model
	 * - calculate the expected model
	 * - initialize the model editor
	 * - change the properties in the editor properties
	 * - compare the expected and the real model : if they are equals the test pass
	 * - delete the models
	 */
	public void testEditConferencePlace() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		conference = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), conferenceMetaClass);
		if (conference == null)
			throw new InputModelInvalidException(conferenceMetaClass.getName());
	
		// Create the expected model
		initializeExpectedModelForConferencePlace();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF properties view to edit the Conference element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), conferenceMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(conferenceMetaClass.getName());
		
		SWTBotView propertiesView = bot.prepareLiveEditing(modelEditor, firstInstanceOf, "Base");
		
		// Change value of the place feature of the Conference element 
				bot.editPropertyTextFeature(propertiesView, ConferenceMessages.ConferencePropertiesEditionPart_PlaceLabel, UPDATED_VALUE, bot.selectNode(modelEditor, firstInstanceOf));
		
		// Save the changement
		bot.finalizeEdition(modelEditor);
		
		// Compare real model with expected model
		assertExpectedModelReached(expectedModel);
		
		// Delete the input model
		deleteModels();
	
	}
	/**
	 * Create the expected model from the input model
	 * @throws InputModelInvalidException error during expected model initialization
	 * @throws IOException error during expected model serialization
	 */
	protected void initializeExpectedModelForConferenceSites() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject conference = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, conferenceMetaClass);
		if (conference == null)
			throw new InputModelInvalidException(conferenceMetaClass.getName());
		EClass siteMetaClass = ConferencePackage.eINSTANCE.getSite();
		EObject site = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, siteMetaClass);
		if (site == null)
			throw new InputModelInvalidException(siteMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
		cc.append(AddCommand.create(editingDomain, conference, ConferencePackage.eINSTANCE.getConference_Sites(), EcoreUtil.copy(site)));
		editingDomain.getCommandStack().execute(cc);
		expectedModel.save(Collections.EMPTY_MAP);
	}
	/**
	 * Test the editor properties :
	 * - init the input model
	 * - calculate the expected model
	 * - initialize the model editor
	 * - change the properties in the editor properties
	 * - compare the expected and the real model : if they are equals the test pass
	 * - delete the models
	 */
	public void testEditConferenceSites() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		conference = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), conferenceMetaClass);
		if (conference == null)
			throw new InputModelInvalidException(conferenceMetaClass.getName());
	
		// Create the expected model
		initializeExpectedModelForConferenceSites();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF properties view to edit the Conference element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), conferenceMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(conferenceMetaClass.getName());
		
		SWTBotView propertiesView = bot.prepareLiveEditing(modelEditor, firstInstanceOf, "Base");
		
		// Change value of the sites feature of the Conference element
				editAdvancedTableCompositionsitesFeature(propertiesView, bot.selectNode(modelEditor, firstInstanceOf));
		
		// Save the changement
		bot.finalizeEdition(modelEditor);
		
		// Compare real model with expected model
		assertExpectedModelReached(expectedModel);
		
		// Delete the input model
		deleteModels();
	
	}
	/**
	 * Create the expected model from the input model
	 * @throws InputModelInvalidException error during expected model initialization
	 * @throws IOException error during expected model serialization
	 */
	protected void initializeRemoveExpectedModelForConferenceSites() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject conference = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, conferenceMetaClass);
		if (conference == null)
			throw new InputModelInvalidException(conferenceMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
		List eGet = (List)conference.eGet(ConferencePackage.eINSTANCE.getConference_Sites());
		if (eGet.size() == 0)
			throw new InputModelInvalidException("Model is invalid");					
		EObject firstInstanceOf = (EObject) eGet.get(0);
		cc.append(RemoveCommand.create(editingDomain, conference, ConferencePackage.eINSTANCE.getConference_Sites(), firstInstanceOf));
		editingDomain.getCommandStack().execute(cc);
		expectedModel.save(Collections.EMPTY_MAP);
	}
	/**
	 * Test the editor properties :
	 * - init the input model
	 * - calculate the expected model
	 * - initialize the model editor
	 * - change the properties in the editor properties
	 * - compare the expected and the real model : if they are equals the test pass
	 * - delete the models
	 */
	public void testRemoveConferenceSites() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		conference = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), conferenceMetaClass);
		if (conference == null)
			throw new InputModelInvalidException(conferenceMetaClass.getName());
	
		// Create the expected model
		initializeRemoveExpectedModelForConferenceSites();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF properties view to edit the Conference element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), conferenceMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(conferenceMetaClass.getName());
		
		SWTBotView propertiesView = bot.prepareLiveEditing(modelEditor, firstInstanceOf, "Base");
		
		// Change value of the sites feature of the Conference element 
				bot.removePropertyAdvancedReferencesTableFeature(propertiesView, 0, firstInstanceOf, bot.selectNode(modelEditor, firstInstanceOf));
		
		// Save the changement
		bot.finalizeEdition(modelEditor);
		
		// Compare real model with expected model
		assertExpectedModelReached(expectedModel);
		
		// Delete the input model
		deleteModels();
	
	}


	/**
	 * Edit the feature in the table composition
	 */
	protected void editAdvancedTableCompositionForsitesFeature() throws WidgetInvalidException {
		EClass siteMetaClass = ConferencePackage.eINSTANCE.getSite();
		SWTBotShell shellTable = bot.shell(siteMetaClass.getName());
		bot.activateShell(shellTable);
		Site site = (Site) EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), siteMetaClass);
		bot.sleep(500);
		// Change value of the documentation feature of the documentation element 
				bot.editTextWithLabel(ConferenceMessages.SitePropertiesEditionPart_DocumentationLabel, site.getDocumentation());
		bot.sleep(500);
		// Change value of the name feature of the name element 
				bot.editTextWithLabel(ConferenceMessages.SitePropertiesEditionPart_NameLabel, site.getName());
		bot.closeShellWithFinishButton(shellTable);
	}	
	/**
	 * Edit the table composition
	 * @param wizardShell
	 */
	protected void editAdvancedTableCompositionsitesFeature(SWTBotView propertyView, SWTBotTreeItem selectNode) throws WidgetInvalidException {
		SWTBot propertyBot = propertyView.bot();
		propertyBot.buttonWithTooltip(EEFRuntimeUIMessages.ReferencesTable_add_tooltip, 0).click();
		editAdvancedTableCompositionForsitesFeature();
		selectNode.select();
	}


}
