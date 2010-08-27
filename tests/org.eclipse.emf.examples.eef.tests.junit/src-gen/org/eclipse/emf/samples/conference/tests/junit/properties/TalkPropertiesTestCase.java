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
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.eef.runtime.tests.SWTBotEEFTestCase;
import org.eclipse.emf.eef.runtime.tests.exceptions.InputModelInvalidException;
import org.eclipse.emf.eef.runtime.tests.utils.EEFTestsModelsUtils;
import org.eclipse.emf.samples.conference.ConferencePackage;
import org.eclipse.emf.samples.conference.Talk;
import org.eclipse.emf.samples.conference.providers.ConferenceMessages;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotEditor;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotView;
/**
 * TestCase for Talk
 * @author <a href="mailto:stephane.bouchet@obeo.fr">Stephane Bouchet</a>
 */
public class TalkPropertiesTestCase extends SWTBotEEFTestCase {

	/**
	 * The EClass of the type to edit
	 */
	private EClass talkMetaClass = ConferencePackage.eINSTANCE.getTalk();

	/**
	 * The type to edit
	 */
	private EObject talk;
	/**
	 * The enum value for the enum class type
	 */
	private Object enumValueForType;
	/**
	 * The reference value for the reference class topic
	 */
	private Object referenceValueForTopic;
	/**
	 * The reference value for the reference class presenter
	 */
	private Object referenceValueForPresenter;
	/**
	 * The reference value for the reference class creator
	 */
	private Object referenceValueForCreator;
	/**
	 * The EClass of the reference to edit
	 */
	private EClass topicMetaClass = ConferencePackage.eINSTANCE.getTopic();	
	/**
	 * The EClass of the reference to edit
	 */
	private EClass personMetaClass = ConferencePackage.eINSTANCE.getPerson();	
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
	protected void initializeExpectedModelForTalkTitle() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject talk = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, talkMetaClass);
		if (talk == null)
			throw new InputModelInvalidException(talkMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
				cc.append(SetCommand.create(editingDomain, talk, ConferencePackage.eINSTANCE.getTalk_Title(), UPDATED_VALUE));
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
	public void testEditTalkTitle() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		talk = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), talkMetaClass);
		if (talk == null)
			throw new InputModelInvalidException(talkMetaClass.getName());
	
		// Create the expected model
		initializeExpectedModelForTalkTitle();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF properties view to edit the Talk element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), talkMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(talkMetaClass.getName());
		
		SWTBotView propertiesView = bot.prepareLiveEditing(modelEditor, firstInstanceOf, "Base");
		
		// Change value of the title feature of the Talk element 
				bot.editPropertyTextFeature(propertiesView, ConferenceMessages.TalkPropertiesEditionPart_Title_Label, UPDATED_VALUE, bot.selectNode(modelEditor, firstInstanceOf));
		
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
	protected void initializeExpectedModelForTalkTopic() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject talk = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, talkMetaClass);
		if (talk == null)
			throw new InputModelInvalidException(talkMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
				allInstancesOf = EEFTestsModelsUtils.getAllInstancesOf(expectedModel, topicMetaClass);
				referenceValueForTopic = bot.changeReferenceValue(allInstancesOf, ((Talk)talk).getTopic());
				cc.append(SetCommand.create(editingDomain, talk, ConferencePackage.eINSTANCE.getTalk_Topic(), referenceValueForTopic));
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
	public void testEditTalkTopic() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		talk = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), talkMetaClass);
		if (talk == null)
			throw new InputModelInvalidException(talkMetaClass.getName());
	
		// Create the expected model
		initializeExpectedModelForTalkTopic();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF properties view to edit the Talk element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), talkMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(talkMetaClass.getName());
		
		SWTBotView propertiesView = bot.prepareLiveEditing(modelEditor, firstInstanceOf, "Base");
		
		// Change value of the topic feature of the Talk element 
				bot.editPropertyEObjectFlatComboViewerFeature(propertiesView, 0, allInstancesOf.indexOf(referenceValueForTopic), bot.selectNode(modelEditor, firstInstanceOf));
		
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
	protected void initializeExpectedModelForTalkType() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject talk = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, talkMetaClass);
		if (talk == null)
			throw new InputModelInvalidException(talkMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
				cc.append(SetCommand.create(editingDomain, talk, ConferencePackage.eINSTANCE.getTalk_Type(), UPDATED_VALUE));
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
	public void testEditTalkType() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		talk = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), talkMetaClass);
		if (talk == null)
			throw new InputModelInvalidException(talkMetaClass.getName());
	
		enumValueForType = bot.changeEnumLiteralValue(ConferencePackage.eINSTANCE.getTALK_TYPE(), ((Talk)talk).getType().getLiteral());
		// Create the expected model
		initializeExpectedModelForTalkType();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF properties view to edit the Talk element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), talkMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(talkMetaClass.getName());
		
		SWTBotView propertiesView = bot.prepareLiveEditing(modelEditor, firstInstanceOf, "Base");
		
		// Change value of the type feature of the Talk element 
				bot.editPropertyTextFeature(propertiesView, ConferenceMessages.TalkPropertiesEditionPart_TypeLabel, UPDATED_VALUE, bot.selectNode(modelEditor, firstInstanceOf));
		
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
	protected void initializeExpectedModelForTalkPresenter() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject talk = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, talkMetaClass);
		if (talk == null)
			throw new InputModelInvalidException(talkMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
				allInstancesOf = EEFTestsModelsUtils.getAllInstancesOf(expectedModel, personMetaClass);
				referenceValueForPresenter = bot.changeReferenceValue(allInstancesOf, ((Talk)talk).getPresenter());
				cc.append(SetCommand.create(editingDomain, talk, ConferencePackage.eINSTANCE.getTalk_Presenter(), referenceValueForPresenter));
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
	public void testEditTalkPresenter() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		talk = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), talkMetaClass);
		if (talk == null)
			throw new InputModelInvalidException(talkMetaClass.getName());
	
		// Create the expected model
		initializeExpectedModelForTalkPresenter();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF properties view to edit the Talk element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), talkMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(talkMetaClass.getName());
		
		SWTBotView propertiesView = bot.prepareLiveEditing(modelEditor, firstInstanceOf, "Base");
		
		// Change value of the presenter feature of the Talk element 
				bot.editPropertyEObjectFlatComboViewerFeature(propertiesView, 1, allInstancesOf.indexOf(referenceValueForPresenter), bot.selectNode(modelEditor, firstInstanceOf));
		
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
	protected void initializeExpectedModelForTalkCreator() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject talk = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, talkMetaClass);
		if (talk == null)
			throw new InputModelInvalidException(talkMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
				allInstancesOf = EEFTestsModelsUtils.getAllInstancesOf(expectedModel, personMetaClass);
				referenceValueForCreator = bot.changeReferenceValue(allInstancesOf, ((Talk)talk).getCreator());
				cc.append(SetCommand.create(editingDomain, talk, ConferencePackage.eINSTANCE.getTalk_Creator(), referenceValueForCreator));
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
	public void testEditTalkCreator() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		talk = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), talkMetaClass);
		if (talk == null)
			throw new InputModelInvalidException(talkMetaClass.getName());
	
		// Create the expected model
		initializeExpectedModelForTalkCreator();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF properties view to edit the Talk element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), talkMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(talkMetaClass.getName());
		
		SWTBotView propertiesView = bot.prepareLiveEditing(modelEditor, firstInstanceOf, "Base");
		
		// Change value of the creator feature of the Talk element 
				bot.editPropertyEObjectFlatComboViewerFeature(propertiesView, 2, allInstancesOf.indexOf(referenceValueForCreator)+1, bot.selectNode(modelEditor, firstInstanceOf));
		
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
	protected void initializeRemoveExpectedModelForTalkCreator() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject talk = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, talkMetaClass);
		if (talk == null)
			throw new InputModelInvalidException(talkMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
				allInstancesOf = EEFTestsModelsUtils.getAllInstancesOf(expectedModel, personMetaClass);
				cc.append(SetCommand.create(editingDomain, talk, ConferencePackage.eINSTANCE.getTalk_Creator(), null));
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
	public void testRemoveTalkCreator() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		talk = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), talkMetaClass);
		if (talk == null)
			throw new InputModelInvalidException(talkMetaClass.getName());
	
		// Create the expected model
		initializeRemoveExpectedModelForTalkCreator();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF properties view to edit the Talk element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), talkMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(talkMetaClass.getName());
		
		SWTBotView propertiesView = bot.prepareLiveEditing(modelEditor, firstInstanceOf, "Base");
		
		// Change value of the creator feature of the Talk element 
				bot.removePropertyEObjectFlatComboViewerFeature(propertiesView, 2, bot.selectNode(modelEditor, firstInstanceOf));
		
		
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
	protected void initializeExpectedModelForTalkDocumentation() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject talk = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, talkMetaClass);
		if (talk == null)
			throw new InputModelInvalidException(talkMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
				cc.append(SetCommand.create(editingDomain, talk, ConferencePackage.eINSTANCE.getTalk_Documentation(), UPDATED_VALUE));
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
	public void testEditTalkDocumentation() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		talk = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), talkMetaClass);
		if (talk == null)
			throw new InputModelInvalidException(talkMetaClass.getName());
	
		// Create the expected model
		initializeExpectedModelForTalkDocumentation();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF properties view to edit the Talk element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), talkMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(talkMetaClass.getName());
		
		SWTBotView propertiesView = bot.prepareLiveEditing(modelEditor, firstInstanceOf, "Base");
		
		// Change value of the documentation feature of the Talk element 
				bot.editPropertyTextFeature(propertiesView, ConferenceMessages.TalkPropertiesEditionPart_DocumentationLabel, UPDATED_VALUE, bot.selectNode(modelEditor, firstInstanceOf));
		
		// Save the changement
		bot.finalizeEdition(modelEditor);
		
		// Compare real model with expected model
		assertExpectedModelReached(expectedModel);
		
		// Delete the input model
		deleteModels();
	
	}














}
