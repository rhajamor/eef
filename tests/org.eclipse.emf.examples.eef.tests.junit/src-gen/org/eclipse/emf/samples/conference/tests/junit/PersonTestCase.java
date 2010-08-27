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
package org.eclipse.emf.samples.conference.tests.junit;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.eef.runtime.tests.SWTBotEEFTestCase;
import org.eclipse.emf.eef.runtime.tests.exceptions.InputModelInvalidException;
import org.eclipse.emf.eef.runtime.tests.utils.EEFTestsModelsUtils;
import org.eclipse.emf.samples.conference.ConferencePackage;
import org.eclipse.emf.samples.conference.Person;
import org.eclipse.emf.samples.conference.providers.ConferenceMessages;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotEditor;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotShell;
/**
 * TestCase for Person
 * @author <a href="mailto:stephane.bouchet@obeo.fr">Stephane Bouchet</a>
 */
public class PersonTestCase extends SWTBotEEFTestCase {

	/**
	 * The EClass of the type to edit
	 */
	private EClass personMetaClass = ConferencePackage.eINSTANCE.getPerson();

	/**
	 * The type to edit
	 */
	private EObject person;
	/**
	 * The enum value for the enum class gender
	 */
	private Object enumValueForGender;
	/**
	 * The reference value for the reference class assists
	 */
	private Object referenceValueForAssists;
	/**
	 * The EClass of the reference to edit
	 */
	private EClass talkMetaClass = ConferencePackage.eINSTANCE.getTalk();	
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
	protected void initializeExpectedModelForPersonFirstname() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject person = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, personMetaClass);
		if (person == null)
			throw new InputModelInvalidException(personMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
				cc.append(SetCommand.create(editingDomain, person, ConferencePackage.eINSTANCE.getPerson_Firstname(), UPDATED_VALUE));
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
	public void testEditPersonFirstname() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		person = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), personMetaClass);
		if (person == null)
			throw new InputModelInvalidException(personMetaClass.getName());
	
		// Create the expected model
		initializeExpectedModelForPersonFirstname();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF wizard (by double click) to edit the Person element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), personMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(personMetaClass.getName());
		
		SWTBotShell wizardShell = bot.prepareBatchEditing(modelEditor, personMetaClass, firstInstanceOf, "Base");
		
		// Change value of the firstname feature of the Person element 
				bot.editTextFeature(wizardShell, ConferenceMessages.PersonPropertiesEditionPart_FirstnameLabel, UPDATED_VALUE);
		
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
	protected void initializeExpectedModelForPersonLastname() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject person = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, personMetaClass);
		if (person == null)
			throw new InputModelInvalidException(personMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
				cc.append(SetCommand.create(editingDomain, person, ConferencePackage.eINSTANCE.getPerson_Lastname(), UPDATED_VALUE));
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
	public void testEditPersonLastname() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		person = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), personMetaClass);
		if (person == null)
			throw new InputModelInvalidException(personMetaClass.getName());
	
		// Create the expected model
		initializeExpectedModelForPersonLastname();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF wizard (by double click) to edit the Person element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), personMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(personMetaClass.getName());
		
		SWTBotShell wizardShell = bot.prepareBatchEditing(modelEditor, personMetaClass, firstInstanceOf, "Base");
		
		// Change value of the lastname feature of the Person element 
				bot.editTextFeature(wizardShell, ConferenceMessages.PersonPropertiesEditionPart_LastnameLabel, UPDATED_VALUE);
		
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
	protected void initializeExpectedModelForPersonAge() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject person = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, personMetaClass);
		if (person == null)
			throw new InputModelInvalidException(personMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
				cc.append(SetCommand.create(editingDomain, person, ConferencePackage.eINSTANCE.getPerson_Age(), UPDATED_VALUE));
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
	public void testEditPersonAge() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		person = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), personMetaClass);
		if (person == null)
			throw new InputModelInvalidException(personMetaClass.getName());
	
		// Create the expected model
		initializeExpectedModelForPersonAge();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF wizard (by double click) to edit the Person element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), personMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(personMetaClass.getName());
		
		SWTBotShell wizardShell = bot.prepareBatchEditing(modelEditor, personMetaClass, firstInstanceOf, "Base");
		
		// Change value of the age feature of the Person element 
				bot.editTextFeature(wizardShell, ConferenceMessages.PersonPropertiesEditionPart_AgeLabel, UPDATED_VALUE);
		
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
	protected void initializeExpectedModelForPersonEclipseCommiter() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject person = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, personMetaClass);
		if (person == null)
			throw new InputModelInvalidException(personMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
				cc.append(SetCommand.create(editingDomain, person, ConferencePackage.eINSTANCE.getPerson_EclipseCommiter(), UPDATED_VALUE));
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
	public void testEditPersonEclipseCommiter() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		person = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), personMetaClass);
		if (person == null)
			throw new InputModelInvalidException(personMetaClass.getName());
	
		// Create the expected model
		initializeExpectedModelForPersonEclipseCommiter();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF wizard (by double click) to edit the Person element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), personMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(personMetaClass.getName());
		
		SWTBotShell wizardShell = bot.prepareBatchEditing(modelEditor, personMetaClass, firstInstanceOf, "Base");
		
		// Change value of the eclipseCommiter feature of the Person element 
				bot.editTextFeature(wizardShell, ConferenceMessages.PersonPropertiesEditionPart_EclipseCommiterLabel, UPDATED_VALUE);
		
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
	protected void initializeExpectedModelForPersonAssists() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject person = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, personMetaClass);
		if (person == null)
			throw new InputModelInvalidException(personMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
				allInstancesOf = EEFTestsModelsUtils.getAllInstancesOf(expectedModel, talkMetaClass);
				referenceValueForAssists = bot.changeReferenceValue(allInstancesOf, ((Person)person).getAssists());
				cc.append(AddCommand.create(editingDomain, person, ConferencePackage.eINSTANCE.getPerson_Assists(), referenceValueForAssists));
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
	public void testEditPersonAssists() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		person = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), personMetaClass);
		if (person == null)
			throw new InputModelInvalidException(personMetaClass.getName());
	
		// Create the expected model
		initializeExpectedModelForPersonAssists();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF wizard (by double click) to edit the Person element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), personMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(personMetaClass.getName());
		
		SWTBotShell wizardShell = bot.prepareBatchEditing(modelEditor, personMetaClass, firstInstanceOf, "Presence");
		
		// Change value of the assists feature of the Person element 
				bot.editAdvancedReferencesTableFeature(wizardShell, 0, referenceValueForAssists);
		
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
	protected void initializeRemoveExpectedModelForPersonAssists() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject person = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, personMetaClass);
		if (person == null)
			throw new InputModelInvalidException(personMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
		List<EObject> allReferencedInstances = (List<EObject>)person.eGet(ConferencePackage.eINSTANCE.getPerson_Assists());
		if (allReferencedInstances.size() > 0) {
			cc.append(RemoveCommand.create(editingDomain, person, ConferencePackage.eINSTANCE.getPerson_Assists(), allReferencedInstances.get(0)));
		}
		else {
			throw new InputModelInvalidException();
		}
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
	public void testRemovePersonAssists() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		person = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), personMetaClass);
		if (person == null)
			throw new InputModelInvalidException(personMetaClass.getName());
	
		// Create the expected model
		initializeRemoveExpectedModelForPersonAssists();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF wizard (by double click) to edit the Person element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), personMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(personMetaClass.getName());
		
		SWTBotShell wizardShell = bot.prepareBatchEditing(modelEditor, personMetaClass, firstInstanceOf, "Presence");
		
		// Change value of the assists feature of the Person element 
				bot.removeAdvancedReferencesTableFeature(wizardShell, 0, ConferenceMessages.PropertiesEditionPart_RemoveListViewerLabel);
		
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
	protected void initializeExpectedModelForPersonGender() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject person = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, personMetaClass);
		if (person == null)
			throw new InputModelInvalidException(personMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
				cc.append(SetCommand.create(editingDomain, person, ConferencePackage.eINSTANCE.getPerson_Gender(), UPDATED_VALUE));
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
	public void testEditPersonGender() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		person = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), personMetaClass);
		if (person == null)
			throw new InputModelInvalidException(personMetaClass.getName());
	
		enumValueForGender = bot.changeEnumLiteralValue(ConferencePackage.eINSTANCE.getGENDER(), ((Person)person).getGender().getLiteral());
		// Create the expected model
		initializeExpectedModelForPersonGender();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF wizard (by double click) to edit the Person element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), personMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(personMetaClass.getName());
		
		SWTBotShell wizardShell = bot.prepareBatchEditing(modelEditor, personMetaClass, firstInstanceOf, "Base");
		
		// Change value of the gender feature of the Person element 
				bot.editTextFeature(wizardShell, ConferenceMessages.PersonPropertiesEditionPart_GenderLabel, UPDATED_VALUE);
		
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
	protected void initializeExpectedModelForPersonIsRegistered() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject person = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, personMetaClass);
		if (person == null)
			throw new InputModelInvalidException(personMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
				cc.append(SetCommand.create(editingDomain, person, ConferencePackage.eINSTANCE.getPerson_IsRegistered(), UPDATED_VALUE));
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
	public void testEditPersonIsRegistered() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		person = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), personMetaClass);
		if (person == null)
			throw new InputModelInvalidException(personMetaClass.getName());
	
		// Create the expected model
		initializeExpectedModelForPersonIsRegistered();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF wizard (by double click) to edit the Person element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), personMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(personMetaClass.getName());
		
		SWTBotShell wizardShell = bot.prepareBatchEditing(modelEditor, personMetaClass, firstInstanceOf, "Base");
		
		// Change value of the isRegistered feature of the Person element 
				bot.editTextFeature(wizardShell, ConferenceMessages.PersonPropertiesEditionPart_IsRegisteredLabel, UPDATED_VALUE);
		
		// Save the changement
		bot.finalizeEdition(modelEditor);
		
		// Compare real model with expected model
		assertExpectedModelReached(expectedModel);
		
		// Delete the input model
		deleteModels();
	
	}
















}
