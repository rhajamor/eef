/*******************************************************************************
 * Copyright (c) 2009 - 2010 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.eefnr.tests.junit.properties;

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
import org.eclipse.emf.eef.eefnr.EefnrPackage;
import org.eclipse.emf.eef.eefnr.Sample;
import org.eclipse.emf.eef.eefnr.TotalSample;
import org.eclipse.emf.eef.eefnr.providers.EefnrMessages;
import org.eclipse.emf.eef.runtime.tests.SWTBotEEFTestCase;
import org.eclipse.emf.eef.runtime.tests.exceptions.InputModelInvalidException;
import org.eclipse.emf.eef.runtime.tests.exceptions.WidgetInvalidException;
import org.eclipse.emf.eef.runtime.tests.utils.EEFTestsModelsUtils;
import org.eclipse.emf.eef.runtime.ui.utils.EEFRuntimeUIMessages;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotEditor;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotView;
import org.eclipse.swtbot.swt.finder.SWTBot;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotShell;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTreeItem;
/**
 * TestCase for TotalSample
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 */
public class TotalSamplePropertiesTestCase extends SWTBotEEFTestCase {

	/**
	 * The EClass of the type to edit
	 */
	private EClass totalSampleMetaClass = EefnrPackage.eINSTANCE.getTotalSample();

	/**
	 * The type to edit
	 */
	private EObject totalSample;
	/**
	 * The enum value for the enum class radioRequiredProperty
	 */
	private Object enumValueForRadioRequiredProperty;
	/**
	 * The enum value for the enum class radioOptionalProperty
	 */
	private Object enumValueForRadioOptionalProperty;
	/**
	 * The enum value for the enum class emfcomboviewerRequiredProperty
	 */
	private Object enumValueForEmfcomboviewerRequiredProperty;
	/**
	 * The enum value for the enum class emfcomboviewerOptionalProperty
	 */
	private Object enumValueForEmfcomboviewerOptionalProperty;
	/**
	 * The reference value for the reference class advancedeobjectflatcomboviewerRequiredPropery
	 */
	private Object referenceValueForAdvancedeobjectflatcomboviewerRequiredPropery;
	/**
	 * The reference value for the reference class advancedreferencestableRequiredProperty
	 */
	private Object referenceValueForAdvancedreferencestableRequiredProperty;
	/**
	 * The reference value for the reference class referencestableOptionalProperty
	 */
	private Object referenceValueForReferencestableOptionalProperty;
	/**
	 * The reference value for the reference class referencestableRequiredProperty
	 */
	private Object referenceValueForReferencestableRequiredProperty;
	/**
	 * The reference value for the reference class advancedeobjectflatcomboviewerOptionalPropery
	 */
	private Object referenceValueForAdvancedeobjectflatcomboviewerOptionalPropery;
	/**
	 * The reference value for the reference class eobjectflatcomboviewerRequiredProperty
	 */
	private Object referenceValueForEobjectflatcomboviewerRequiredProperty;
	/**
	 * The reference value for the reference class advancedreferencestableOptionalProperty
	 */
	private Object referenceValueForAdvancedreferencestableOptionalProperty;
	/**
	 * The reference value for the reference class eobjectflatcomboviewerOptionalProperty
	 */
	private Object referenceValueForEobjectflatcomboviewerOptionalProperty;
	/**
	 * The EClass of the reference to edit
	 */
	private EClass sampleMetaClass = EefnrPackage.eINSTANCE.getSample();	
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
		return "expected.eefnr";
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
		return "input.eefnr";
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.tests.SWTBotEEFTestCase#getTestsProjectName()
	 */
	protected String getTestsProjectName() {
		return "org.eclipse.emf.eef.tests.nonreg.junit";
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
	protected void initializeExpectedModelForTotalSampleTextRequiredProperty() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject totalSample = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, totalSampleMetaClass);
		if (totalSample == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
				cc.append(SetCommand.create(editingDomain, totalSample, EefnrPackage.eINSTANCE.getTotalSample_TextRequiredProperty(), UPDATED_VALUE));
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
	public void testEditTotalSampleTextRequiredProperty() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		totalSample = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), totalSampleMetaClass);
		if (totalSample == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
	
		// Create the expected model
		initializeExpectedModelForTotalSampleTextRequiredProperty();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF properties view to edit the TotalSample element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), totalSampleMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
		
		SWTBotView propertiesView = bot.prepareLiveEditing(modelEditor, firstInstanceOf, "Base");
		
		// Change value of the textRequiredProperty feature of the TotalSample element 
				bot.editPropertyTextFeature(propertiesView, EefnrMessages.TotalSamplePropertiesEditionPart_TextRequiredPropertyLabel, UPDATED_VALUE, bot.selectNode(modelEditor, firstInstanceOf));
		
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
	protected void initializeExpectedModelForTotalSampleTextOptionalProperty() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject totalSample = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, totalSampleMetaClass);
		if (totalSample == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
				cc.append(SetCommand.create(editingDomain, totalSample, EefnrPackage.eINSTANCE.getTotalSample_TextOptionalProperty(), UPDATED_VALUE));
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
	public void testEditTotalSampleTextOptionalProperty() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		totalSample = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), totalSampleMetaClass);
		if (totalSample == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
	
		// Create the expected model
		initializeExpectedModelForTotalSampleTextOptionalProperty();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF properties view to edit the TotalSample element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), totalSampleMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
		
		SWTBotView propertiesView = bot.prepareLiveEditing(modelEditor, firstInstanceOf, "Base");
		
		// Change value of the textOptionalProperty feature of the TotalSample element 
				bot.editPropertyTextFeature(propertiesView, EefnrMessages.TotalSamplePropertiesEditionPart_TextOptionalPropertyLabel, UPDATED_VALUE, bot.selectNode(modelEditor, firstInstanceOf));
		
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
	protected void initializeExpectedModelForTotalSampleCheckboxRequiredProperty() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject totalSample = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, totalSampleMetaClass);
		if (totalSample == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
				cc.append(SetCommand.create(editingDomain, totalSample, EefnrPackage.eINSTANCE.getTotalSample_CheckboxRequiredProperty(), UPDATED_VALUE));
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
	public void testEditTotalSampleCheckboxRequiredProperty() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		totalSample = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), totalSampleMetaClass);
		if (totalSample == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
	
		// Create the expected model
		initializeExpectedModelForTotalSampleCheckboxRequiredProperty();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF properties view to edit the TotalSample element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), totalSampleMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
		
		SWTBotView propertiesView = bot.prepareLiveEditing(modelEditor, firstInstanceOf, "Base");
		
		// Change value of the checkboxRequiredProperty feature of the TotalSample element 
				bot.editPropertyTextFeature(propertiesView, EefnrMessages.TotalSamplePropertiesEditionPart_CheckboxRequiredPropertyLabel, UPDATED_VALUE, bot.selectNode(modelEditor, firstInstanceOf));
		
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
	protected void initializeExpectedModelForTotalSampleCheckboxOptionalProperty() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject totalSample = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, totalSampleMetaClass);
		if (totalSample == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
				cc.append(SetCommand.create(editingDomain, totalSample, EefnrPackage.eINSTANCE.getTotalSample_CheckboxOptionalProperty(), UPDATED_VALUE));
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
	public void testEditTotalSampleCheckboxOptionalProperty() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		totalSample = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), totalSampleMetaClass);
		if (totalSample == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
	
		// Create the expected model
		initializeExpectedModelForTotalSampleCheckboxOptionalProperty();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF properties view to edit the TotalSample element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), totalSampleMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
		
		SWTBotView propertiesView = bot.prepareLiveEditing(modelEditor, firstInstanceOf, "Base");
		
		// Change value of the checkboxOptionalProperty feature of the TotalSample element 
				bot.editPropertyTextFeature(propertiesView, EefnrMessages.TotalSamplePropertiesEditionPart_CheckboxOptionalPropertyLabel, UPDATED_VALUE, bot.selectNode(modelEditor, firstInstanceOf));
		
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
	protected void initializeExpectedModelForTotalSampleTextareaRequiredProperty() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject totalSample = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, totalSampleMetaClass);
		if (totalSample == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
				cc.append(SetCommand.create(editingDomain, totalSample, EefnrPackage.eINSTANCE.getTotalSample_TextareaRequiredProperty(), UPDATED_VALUE));
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
	public void testEditTotalSampleTextareaRequiredProperty() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		totalSample = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), totalSampleMetaClass);
		if (totalSample == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
	
		// Create the expected model
		initializeExpectedModelForTotalSampleTextareaRequiredProperty();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF properties view to edit the TotalSample element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), totalSampleMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
		
		SWTBotView propertiesView = bot.prepareLiveEditing(modelEditor, firstInstanceOf, "Base");
		
		// Change value of the textareaRequiredProperty feature of the TotalSample element 
				bot.editPropertyTextFeature(propertiesView, EefnrMessages.TotalSamplePropertiesEditionPart_TextareaRequiredPropertyLabel, UPDATED_VALUE, bot.selectNode(modelEditor, firstInstanceOf));
		
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
	protected void initializeExpectedModelForTotalSampleTextareaOptionalProperty() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject totalSample = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, totalSampleMetaClass);
		if (totalSample == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
				cc.append(SetCommand.create(editingDomain, totalSample, EefnrPackage.eINSTANCE.getTotalSample_TextareaOptionalProperty(), UPDATED_VALUE));
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
	public void testEditTotalSampleTextareaOptionalProperty() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		totalSample = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), totalSampleMetaClass);
		if (totalSample == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
	
		// Create the expected model
		initializeExpectedModelForTotalSampleTextareaOptionalProperty();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF properties view to edit the TotalSample element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), totalSampleMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
		
		SWTBotView propertiesView = bot.prepareLiveEditing(modelEditor, firstInstanceOf, "Base");
		
		// Change value of the textareaOptionalProperty feature of the TotalSample element 
				bot.editPropertyTextFeature(propertiesView, EefnrMessages.TotalSamplePropertiesEditionPart_TextareaOptionalPropertyLabel, UPDATED_VALUE, bot.selectNode(modelEditor, firstInstanceOf));
		
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
	protected void initializeExpectedModelForTotalSampleRadioRequiredProperty() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject totalSample = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, totalSampleMetaClass);
		if (totalSample == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
				cc.append(SetCommand.create(editingDomain, totalSample, EefnrPackage.eINSTANCE.getTotalSample_RadioRequiredProperty(), UPDATED_VALUE));
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
	public void testEditTotalSampleRadioRequiredProperty() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		totalSample = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), totalSampleMetaClass);
		if (totalSample == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
	
		enumValueForRadioRequiredProperty = bot.changeEnumLiteralValue(EefnrPackage.eINSTANCE.getENUM_SAMPLE(), ((TotalSample)totalSample).getRadioRequiredProperty().getLiteral());
		// Create the expected model
		initializeExpectedModelForTotalSampleRadioRequiredProperty();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF properties view to edit the TotalSample element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), totalSampleMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
		
		SWTBotView propertiesView = bot.prepareLiveEditing(modelEditor, firstInstanceOf, "Base");
		
		// Change value of the radioRequiredProperty feature of the TotalSample element 
				bot.editPropertyTextFeature(propertiesView, EefnrMessages.TotalSamplePropertiesEditionPart_RadioRequiredPropertyLabel, UPDATED_VALUE, bot.selectNode(modelEditor, firstInstanceOf));
		
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
	protected void initializeExpectedModelForTotalSampleRadioOptionalProperty() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject totalSample = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, totalSampleMetaClass);
		if (totalSample == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
				cc.append(SetCommand.create(editingDomain, totalSample, EefnrPackage.eINSTANCE.getTotalSample_RadioOptionalProperty(), UPDATED_VALUE));
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
	public void testEditTotalSampleRadioOptionalProperty() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		totalSample = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), totalSampleMetaClass);
		if (totalSample == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
	
		enumValueForRadioOptionalProperty = bot.changeEnumLiteralValue(EefnrPackage.eINSTANCE.getENUM_SAMPLE(), ((TotalSample)totalSample).getRadioOptionalProperty().getLiteral());
		// Create the expected model
		initializeExpectedModelForTotalSampleRadioOptionalProperty();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF properties view to edit the TotalSample element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), totalSampleMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
		
		SWTBotView propertiesView = bot.prepareLiveEditing(modelEditor, firstInstanceOf, "Base");
		
		// Change value of the radioOptionalProperty feature of the TotalSample element 
				bot.editPropertyTextFeature(propertiesView, EefnrMessages.TotalSamplePropertiesEditionPart_RadioOptionalPropertyLabel, UPDATED_VALUE, bot.selectNode(modelEditor, firstInstanceOf));
		
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
	protected void initializeExpectedModelForTotalSampleEobjectflatcomboviewerRequiredProperty() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject totalSample = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, totalSampleMetaClass);
		if (totalSample == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
				allInstancesOf = EEFTestsModelsUtils.getAllInstancesOf(expectedModel, totalSampleMetaClass);
				referenceValueForEobjectflatcomboviewerRequiredProperty = bot.changeReferenceValue(allInstancesOf, ((TotalSample)totalSample).getEobjectflatcomboviewerRequiredProperty());
				cc.append(SetCommand.create(editingDomain, totalSample, EefnrPackage.eINSTANCE.getTotalSample_EobjectflatcomboviewerRequiredProperty(), referenceValueForEobjectflatcomboviewerRequiredProperty));
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
	public void testEditTotalSampleEobjectflatcomboviewerRequiredProperty() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		totalSample = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), totalSampleMetaClass);
		if (totalSample == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
	
		// Create the expected model
		initializeExpectedModelForTotalSampleEobjectflatcomboviewerRequiredProperty();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF properties view to edit the TotalSample element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), totalSampleMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
		
		SWTBotView propertiesView = bot.prepareLiveEditing(modelEditor, firstInstanceOf, "Base");
		
		// Change value of the eobjectflatcomboviewerRequiredProperty feature of the TotalSample element 
				bot.editPropertyEObjectFlatComboViewerFeature(propertiesView, 0, allInstancesOf.indexOf(referenceValueForEobjectflatcomboviewerRequiredProperty), bot.selectNode(modelEditor, firstInstanceOf));
		
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
	protected void initializeExpectedModelForTotalSampleEobjectflatcomboviewerOptionalProperty() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject totalSample = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, totalSampleMetaClass);
		if (totalSample == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
				allInstancesOf = EEFTestsModelsUtils.getAllInstancesOf(expectedModel, totalSampleMetaClass);
				referenceValueForEobjectflatcomboviewerOptionalProperty = bot.changeReferenceValue(allInstancesOf, ((TotalSample)totalSample).getEobjectflatcomboviewerOptionalProperty());
				cc.append(SetCommand.create(editingDomain, totalSample, EefnrPackage.eINSTANCE.getTotalSample_EobjectflatcomboviewerOptionalProperty(), referenceValueForEobjectflatcomboviewerOptionalProperty));
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
	public void testEditTotalSampleEobjectflatcomboviewerOptionalProperty() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		totalSample = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), totalSampleMetaClass);
		if (totalSample == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
	
		// Create the expected model
		initializeExpectedModelForTotalSampleEobjectflatcomboviewerOptionalProperty();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF properties view to edit the TotalSample element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), totalSampleMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
		
		SWTBotView propertiesView = bot.prepareLiveEditing(modelEditor, firstInstanceOf, "Base");
		
		// Change value of the eobjectflatcomboviewerOptionalProperty feature of the TotalSample element 
				bot.editPropertyEObjectFlatComboViewerFeature(propertiesView, 1, allInstancesOf.indexOf(referenceValueForEobjectflatcomboviewerOptionalProperty)+1, bot.selectNode(modelEditor, firstInstanceOf));
		
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
	protected void initializeRemoveExpectedModelForTotalSampleEobjectflatcomboviewerOptionalProperty() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject totalSample = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, totalSampleMetaClass);
		if (totalSample == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
				allInstancesOf = EEFTestsModelsUtils.getAllInstancesOf(expectedModel, totalSampleMetaClass);
				cc.append(SetCommand.create(editingDomain, totalSample, EefnrPackage.eINSTANCE.getTotalSample_EobjectflatcomboviewerOptionalProperty(), null));
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
	public void testRemoveTotalSampleEobjectflatcomboviewerOptionalProperty() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		totalSample = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), totalSampleMetaClass);
		if (totalSample == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
	
		// Create the expected model
		initializeRemoveExpectedModelForTotalSampleEobjectflatcomboviewerOptionalProperty();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF properties view to edit the TotalSample element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), totalSampleMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
		
		SWTBotView propertiesView = bot.prepareLiveEditing(modelEditor, firstInstanceOf, "Base");
		
		// Change value of the eobjectflatcomboviewerOptionalProperty feature of the TotalSample element 
				bot.removePropertyEObjectFlatComboViewerFeature(propertiesView, 1, bot.selectNode(modelEditor, firstInstanceOf));
		
		
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
	protected void initializeExpectedModelForTotalSampleReferencestableRequiredProperty() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject totalSample = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, totalSampleMetaClass);
		if (totalSample == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
				allInstancesOf = EEFTestsModelsUtils.getAllInstancesOf(expectedModel, totalSampleMetaClass);
				referenceValueForReferencestableRequiredProperty = bot.changeReferenceValue(allInstancesOf, ((TotalSample)totalSample).getReferencestableRequiredProperty());
				cc.append(AddCommand.create(editingDomain, totalSample, EefnrPackage.eINSTANCE.getTotalSample_ReferencestableRequiredProperty(), referenceValueForReferencestableRequiredProperty));
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
	public void testEditTotalSampleReferencestableRequiredProperty() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		totalSample = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), totalSampleMetaClass);
		if (totalSample == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
	
		// Create the expected model
		initializeExpectedModelForTotalSampleReferencestableRequiredProperty();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF properties view to edit the TotalSample element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), totalSampleMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
		
		SWTBotView propertiesView = bot.prepareLiveEditing(modelEditor, firstInstanceOf, "Base");
		
		// Change value of the referencestableRequiredProperty feature of the TotalSample element 
				bot.editPropertyAdvancedReferencesTableFeature(propertiesView, 0, referenceValueForReferencestableRequiredProperty, bot.selectNode(modelEditor, firstInstanceOf));
		
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
	protected void initializeRemoveExpectedModelForTotalSampleReferencestableRequiredProperty() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject totalSample = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, totalSampleMetaClass);
		if (totalSample == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
		List<EObject> allReferencedInstances = (List<EObject>)totalSample.eGet(EefnrPackage.eINSTANCE.getTotalSample_ReferencestableRequiredProperty());
		if (allReferencedInstances.size() > 0) {
			cc.append(RemoveCommand.create(editingDomain, totalSample, EefnrPackage.eINSTANCE.getTotalSample_ReferencestableRequiredProperty(), allReferencedInstances.get(0)));
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
	public void testRemoveTotalSampleReferencestableRequiredProperty() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		totalSample = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), totalSampleMetaClass);
		if (totalSample == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
	
		// Create the expected model
		initializeRemoveExpectedModelForTotalSampleReferencestableRequiredProperty();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF properties view to edit the TotalSample element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), totalSampleMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
		
		SWTBotView propertiesView = bot.prepareLiveEditing(modelEditor, firstInstanceOf, "Base");
		
		// Change value of the referencestableRequiredProperty feature of the TotalSample element 
				bot.removePropertyAdvancedReferencesTableFeature(propertiesView, 0, EefnrMessages.PropertiesEditionPart_RemoveListViewerLabel, bot.selectNode(modelEditor, firstInstanceOf));
		
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
	protected void initializeExpectedModelForTotalSampleReferencestableOptionalProperty() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject totalSample = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, totalSampleMetaClass);
		if (totalSample == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
				allInstancesOf = EEFTestsModelsUtils.getAllInstancesOf(expectedModel, totalSampleMetaClass);
				referenceValueForReferencestableOptionalProperty = bot.changeReferenceValue(allInstancesOf, ((TotalSample)totalSample).getReferencestableOptionalProperty());
				cc.append(AddCommand.create(editingDomain, totalSample, EefnrPackage.eINSTANCE.getTotalSample_ReferencestableOptionalProperty(), referenceValueForReferencestableOptionalProperty));
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
	public void testEditTotalSampleReferencestableOptionalProperty() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		totalSample = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), totalSampleMetaClass);
		if (totalSample == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
	
		// Create the expected model
		initializeExpectedModelForTotalSampleReferencestableOptionalProperty();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF properties view to edit the TotalSample element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), totalSampleMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
		
		SWTBotView propertiesView = bot.prepareLiveEditing(modelEditor, firstInstanceOf, "Base");
		
		// Change value of the referencestableOptionalProperty feature of the TotalSample element 
				bot.editPropertyAdvancedReferencesTableFeature(propertiesView, 1, referenceValueForReferencestableOptionalProperty, bot.selectNode(modelEditor, firstInstanceOf));
		
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
	protected void initializeRemoveExpectedModelForTotalSampleReferencestableOptionalProperty() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject totalSample = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, totalSampleMetaClass);
		if (totalSample == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
		List<EObject> allReferencedInstances = (List<EObject>)totalSample.eGet(EefnrPackage.eINSTANCE.getTotalSample_ReferencestableOptionalProperty());
		if (allReferencedInstances.size() > 0) {
			cc.append(RemoveCommand.create(editingDomain, totalSample, EefnrPackage.eINSTANCE.getTotalSample_ReferencestableOptionalProperty(), allReferencedInstances.get(0)));
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
	public void testRemoveTotalSampleReferencestableOptionalProperty() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		totalSample = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), totalSampleMetaClass);
		if (totalSample == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
	
		// Create the expected model
		initializeRemoveExpectedModelForTotalSampleReferencestableOptionalProperty();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF properties view to edit the TotalSample element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), totalSampleMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
		
		SWTBotView propertiesView = bot.prepareLiveEditing(modelEditor, firstInstanceOf, "Base");
		
		// Change value of the referencestableOptionalProperty feature of the TotalSample element 
				bot.removePropertyAdvancedReferencesTableFeature(propertiesView, 1, EefnrMessages.PropertiesEditionPart_RemoveListViewerLabel, bot.selectNode(modelEditor, firstInstanceOf));
		
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
	protected void initializeExpectedModelForTotalSampleEmfcomboviewerRequiredProperty() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject totalSample = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, totalSampleMetaClass);
		if (totalSample == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
				cc.append(SetCommand.create(editingDomain, totalSample, EefnrPackage.eINSTANCE.getTotalSample_EmfcomboviewerRequiredProperty(), UPDATED_VALUE));
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
	public void testEditTotalSampleEmfcomboviewerRequiredProperty() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		totalSample = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), totalSampleMetaClass);
		if (totalSample == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
	
		enumValueForEmfcomboviewerRequiredProperty = bot.changeEnumLiteralValue(EefnrPackage.eINSTANCE.getENUM_SAMPLE(), ((TotalSample)totalSample).getEmfcomboviewerRequiredProperty().getLiteral());
		// Create the expected model
		initializeExpectedModelForTotalSampleEmfcomboviewerRequiredProperty();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF properties view to edit the TotalSample element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), totalSampleMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
		
		SWTBotView propertiesView = bot.prepareLiveEditing(modelEditor, firstInstanceOf, "Base");
		
		// Change value of the emfcomboviewerRequiredProperty feature of the TotalSample element 
				bot.editPropertyTextFeature(propertiesView, EefnrMessages.TotalSamplePropertiesEditionPart_EmfcomboviewerRequiredPropertyLabel, UPDATED_VALUE, bot.selectNode(modelEditor, firstInstanceOf));
		
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
	protected void initializeExpectedModelForTotalSampleEmfcomboviewerOptionalProperty() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject totalSample = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, totalSampleMetaClass);
		if (totalSample == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
				cc.append(SetCommand.create(editingDomain, totalSample, EefnrPackage.eINSTANCE.getTotalSample_EmfcomboviewerOptionalProperty(), UPDATED_VALUE));
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
	public void testEditTotalSampleEmfcomboviewerOptionalProperty() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		totalSample = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), totalSampleMetaClass);
		if (totalSample == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
	
		enumValueForEmfcomboviewerOptionalProperty = bot.changeEnumLiteralValue(EefnrPackage.eINSTANCE.getENUM_SAMPLE(), ((TotalSample)totalSample).getEmfcomboviewerOptionalProperty().getLiteral());
		// Create the expected model
		initializeExpectedModelForTotalSampleEmfcomboviewerOptionalProperty();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF properties view to edit the TotalSample element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), totalSampleMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
		
		SWTBotView propertiesView = bot.prepareLiveEditing(modelEditor, firstInstanceOf, "Base");
		
		// Change value of the emfcomboviewerOptionalProperty feature of the TotalSample element 
				bot.editPropertyTextFeature(propertiesView, EefnrMessages.TotalSamplePropertiesEditionPart_EmfcomboviewerOptionalPropertyLabel, UPDATED_VALUE, bot.selectNode(modelEditor, firstInstanceOf));
		
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
	protected void initializeExpectedModelForTotalSampleMultivaluededitorRequiredProperty() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject totalSample = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, totalSampleMetaClass);
		if (totalSample == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
				cc.append(SetCommand.create(editingDomain, totalSample, EefnrPackage.eINSTANCE.getTotalSample_MultivaluededitorRequiredProperty(), UPDATED_VALUE));
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
	public void testEditTotalSampleMultivaluededitorRequiredProperty() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		totalSample = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), totalSampleMetaClass);
		if (totalSample == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
	
		// Create the expected model
		initializeExpectedModelForTotalSampleMultivaluededitorRequiredProperty();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF properties view to edit the TotalSample element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), totalSampleMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
		
		SWTBotView propertiesView = bot.prepareLiveEditing(modelEditor, firstInstanceOf, "Base");
		
		// Change value of the multivaluededitorRequiredProperty feature of the TotalSample element 
				bot.editPropertyTextFeature(propertiesView, EefnrMessages.TotalSamplePropertiesEditionPart_MultivaluededitorRequiredPropertyLabel, UPDATED_VALUE, bot.selectNode(modelEditor, firstInstanceOf));
		
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
	protected void initializeExpectedModelForTotalSampleMultivaluededitorOptionalProperty() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject totalSample = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, totalSampleMetaClass);
		if (totalSample == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
				cc.append(SetCommand.create(editingDomain, totalSample, EefnrPackage.eINSTANCE.getTotalSample_MultivaluededitorOptionalProperty(), UPDATED_VALUE));
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
	public void testEditTotalSampleMultivaluededitorOptionalProperty() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		totalSample = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), totalSampleMetaClass);
		if (totalSample == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
	
		// Create the expected model
		initializeExpectedModelForTotalSampleMultivaluededitorOptionalProperty();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF properties view to edit the TotalSample element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), totalSampleMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
		
		SWTBotView propertiesView = bot.prepareLiveEditing(modelEditor, firstInstanceOf, "Base");
		
		// Change value of the multivaluededitorOptionalProperty feature of the TotalSample element 
				bot.editPropertyTextFeature(propertiesView, EefnrMessages.TotalSamplePropertiesEditionPart_MultivaluededitorOptionalPropertyLabel, UPDATED_VALUE, bot.selectNode(modelEditor, firstInstanceOf));
		
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
	protected void initializeExpectedModelForTotalSampleTablecompositionRequiredProperty() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject totalSample = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, totalSampleMetaClass);
		if (totalSample == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
		EClass sampleMetaClass = EefnrPackage.eINSTANCE.getSample();
		EObject sample = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, sampleMetaClass);
		if (sample == null)
			throw new InputModelInvalidException(sampleMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
		cc.append(AddCommand.create(editingDomain, totalSample, EefnrPackage.eINSTANCE.getTotalSample_TablecompositionRequiredProperty(), EcoreUtil.copy(sample)));
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
	public void testEditTotalSampleTablecompositionRequiredProperty() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		totalSample = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), totalSampleMetaClass);
		if (totalSample == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
	
		// Create the expected model
		initializeExpectedModelForTotalSampleTablecompositionRequiredProperty();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF properties view to edit the TotalSample element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), totalSampleMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
		
		SWTBotView propertiesView = bot.prepareLiveEditing(modelEditor, firstInstanceOf, "Base");
		
		// Change value of the tablecompositionRequiredProperty feature of the TotalSample element
				editAdvancedTableCompositiontablecompositionRequiredPropertyFeature(propertiesView, bot.selectNode(modelEditor, firstInstanceOf));
		
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
	protected void initializeRemoveExpectedModelForTotalSampleTablecompositionRequiredProperty() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject totalSample = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, totalSampleMetaClass);
		if (totalSample == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
		List eGet = (List)totalSample.eGet(EefnrPackage.eINSTANCE.getTotalSample_TablecompositionRequiredProperty());
		if (eGet.size() == 0)
			throw new InputModelInvalidException("Model is invalid");					
		EObject firstInstanceOf = (EObject) eGet.get(0);
		cc.append(RemoveCommand.create(editingDomain, totalSample, EefnrPackage.eINSTANCE.getTotalSample_TablecompositionRequiredProperty(), firstInstanceOf));
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
	public void testRemoveTotalSampleTablecompositionRequiredProperty() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		totalSample = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), totalSampleMetaClass);
		if (totalSample == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
	
		// Create the expected model
		initializeRemoveExpectedModelForTotalSampleTablecompositionRequiredProperty();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF properties view to edit the TotalSample element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), totalSampleMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
		
		SWTBotView propertiesView = bot.prepareLiveEditing(modelEditor, firstInstanceOf, "Base");
		
		// Change value of the tablecompositionRequiredProperty feature of the TotalSample element 
				bot.removePropertyAdvancedReferencesTableFeature(propertiesView, 2, firstInstanceOf, bot.selectNode(modelEditor, firstInstanceOf));
		
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
	protected void initializeExpectedModelForTotalSampleTablecompositionOptionalProperty() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject totalSample = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, totalSampleMetaClass);
		if (totalSample == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
		EClass sampleMetaClass = EefnrPackage.eINSTANCE.getSample();
		EObject sample = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, sampleMetaClass);
		if (sample == null)
			throw new InputModelInvalidException(sampleMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
		cc.append(AddCommand.create(editingDomain, totalSample, EefnrPackage.eINSTANCE.getTotalSample_TablecompositionOptionalProperty(), EcoreUtil.copy(sample)));
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
	public void testEditTotalSampleTablecompositionOptionalProperty() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		totalSample = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), totalSampleMetaClass);
		if (totalSample == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
	
		// Create the expected model
		initializeExpectedModelForTotalSampleTablecompositionOptionalProperty();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF properties view to edit the TotalSample element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), totalSampleMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
		
		SWTBotView propertiesView = bot.prepareLiveEditing(modelEditor, firstInstanceOf, "Base");
		
		// Change value of the tablecompositionOptionalProperty feature of the TotalSample element
				editAdvancedTableCompositiontablecompositionOptionalPropertyFeature(propertiesView, bot.selectNode(modelEditor, firstInstanceOf));
		
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
	protected void initializeRemoveExpectedModelForTotalSampleTablecompositionOptionalProperty() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject totalSample = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, totalSampleMetaClass);
		if (totalSample == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
		List eGet = (List)totalSample.eGet(EefnrPackage.eINSTANCE.getTotalSample_TablecompositionOptionalProperty());
		if (eGet.size() == 0)
			throw new InputModelInvalidException("Model is invalid");					
		EObject firstInstanceOf = (EObject) eGet.get(0);
		cc.append(RemoveCommand.create(editingDomain, totalSample, EefnrPackage.eINSTANCE.getTotalSample_TablecompositionOptionalProperty(), firstInstanceOf));
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
	public void testRemoveTotalSampleTablecompositionOptionalProperty() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		totalSample = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), totalSampleMetaClass);
		if (totalSample == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
	
		// Create the expected model
		initializeRemoveExpectedModelForTotalSampleTablecompositionOptionalProperty();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF properties view to edit the TotalSample element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), totalSampleMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
		
		SWTBotView propertiesView = bot.prepareLiveEditing(modelEditor, firstInstanceOf, "Base");
		
		// Change value of the tablecompositionOptionalProperty feature of the TotalSample element 
				bot.removePropertyAdvancedReferencesTableFeature(propertiesView, 3, firstInstanceOf, bot.selectNode(modelEditor, firstInstanceOf));
		
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
	protected void initializeExpectedModelForTotalSampleAdvancedreferencestableRequiredProperty() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject totalSample = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, totalSampleMetaClass);
		if (totalSample == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
				allInstancesOf = EEFTestsModelsUtils.getAllInstancesOf(expectedModel, totalSampleMetaClass);
				referenceValueForAdvancedreferencestableRequiredProperty = bot.changeReferenceValue(allInstancesOf, ((TotalSample)totalSample).getAdvancedreferencestableRequiredProperty());
				cc.append(AddCommand.create(editingDomain, totalSample, EefnrPackage.eINSTANCE.getTotalSample_AdvancedreferencestableRequiredProperty(), referenceValueForAdvancedreferencestableRequiredProperty));
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
	public void testEditTotalSampleAdvancedreferencestableRequiredProperty() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		totalSample = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), totalSampleMetaClass);
		if (totalSample == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
	
		// Create the expected model
		initializeExpectedModelForTotalSampleAdvancedreferencestableRequiredProperty();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF properties view to edit the TotalSample element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), totalSampleMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
		
		SWTBotView propertiesView = bot.prepareLiveEditing(modelEditor, firstInstanceOf, "Base");
		
		// Change value of the advancedreferencestableRequiredProperty feature of the TotalSample element 
				bot.editPropertyAdvancedReferencesTableFeature(propertiesView, 4, referenceValueForAdvancedreferencestableRequiredProperty, bot.selectNode(modelEditor, firstInstanceOf));
		
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
	protected void initializeRemoveExpectedModelForTotalSampleAdvancedreferencestableRequiredProperty() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject totalSample = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, totalSampleMetaClass);
		if (totalSample == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
		List<EObject> allReferencedInstances = (List<EObject>)totalSample.eGet(EefnrPackage.eINSTANCE.getTotalSample_AdvancedreferencestableRequiredProperty());
		if (allReferencedInstances.size() > 0) {
			cc.append(RemoveCommand.create(editingDomain, totalSample, EefnrPackage.eINSTANCE.getTotalSample_AdvancedreferencestableRequiredProperty(), allReferencedInstances.get(0)));
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
	public void testRemoveTotalSampleAdvancedreferencestableRequiredProperty() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		totalSample = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), totalSampleMetaClass);
		if (totalSample == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
	
		// Create the expected model
		initializeRemoveExpectedModelForTotalSampleAdvancedreferencestableRequiredProperty();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF properties view to edit the TotalSample element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), totalSampleMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
		
		SWTBotView propertiesView = bot.prepareLiveEditing(modelEditor, firstInstanceOf, "Base");
		
		// Change value of the advancedreferencestableRequiredProperty feature of the TotalSample element 
				bot.removePropertyAdvancedReferencesTableFeature(propertiesView, 4, EefnrMessages.PropertiesEditionPart_RemoveListViewerLabel, bot.selectNode(modelEditor, firstInstanceOf));
		
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
	protected void initializeExpectedModelForTotalSampleAdvancedreferencestableOptionalProperty() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject totalSample = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, totalSampleMetaClass);
		if (totalSample == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
				allInstancesOf = EEFTestsModelsUtils.getAllInstancesOf(expectedModel, totalSampleMetaClass);
				referenceValueForAdvancedreferencestableOptionalProperty = bot.changeReferenceValue(allInstancesOf, ((TotalSample)totalSample).getAdvancedreferencestableOptionalProperty());
				cc.append(AddCommand.create(editingDomain, totalSample, EefnrPackage.eINSTANCE.getTotalSample_AdvancedreferencestableOptionalProperty(), referenceValueForAdvancedreferencestableOptionalProperty));
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
	public void testEditTotalSampleAdvancedreferencestableOptionalProperty() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		totalSample = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), totalSampleMetaClass);
		if (totalSample == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
	
		// Create the expected model
		initializeExpectedModelForTotalSampleAdvancedreferencestableOptionalProperty();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF properties view to edit the TotalSample element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), totalSampleMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
		
		SWTBotView propertiesView = bot.prepareLiveEditing(modelEditor, firstInstanceOf, "Base");
		
		// Change value of the advancedreferencestableOptionalProperty feature of the TotalSample element 
				bot.editPropertyAdvancedReferencesTableFeature(propertiesView, 5, referenceValueForAdvancedreferencestableOptionalProperty, bot.selectNode(modelEditor, firstInstanceOf));
		
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
	protected void initializeRemoveExpectedModelForTotalSampleAdvancedreferencestableOptionalProperty() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject totalSample = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, totalSampleMetaClass);
		if (totalSample == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
		List<EObject> allReferencedInstances = (List<EObject>)totalSample.eGet(EefnrPackage.eINSTANCE.getTotalSample_AdvancedreferencestableOptionalProperty());
		if (allReferencedInstances.size() > 0) {
			cc.append(RemoveCommand.create(editingDomain, totalSample, EefnrPackage.eINSTANCE.getTotalSample_AdvancedreferencestableOptionalProperty(), allReferencedInstances.get(0)));
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
	public void testRemoveTotalSampleAdvancedreferencestableOptionalProperty() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		totalSample = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), totalSampleMetaClass);
		if (totalSample == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
	
		// Create the expected model
		initializeRemoveExpectedModelForTotalSampleAdvancedreferencestableOptionalProperty();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF properties view to edit the TotalSample element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), totalSampleMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
		
		SWTBotView propertiesView = bot.prepareLiveEditing(modelEditor, firstInstanceOf, "Base");
		
		// Change value of the advancedreferencestableOptionalProperty feature of the TotalSample element 
				bot.removePropertyAdvancedReferencesTableFeature(propertiesView, 5, EefnrMessages.PropertiesEditionPart_RemoveListViewerLabel, bot.selectNode(modelEditor, firstInstanceOf));
		
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
	protected void initializeExpectedModelForTotalSampleAdvancedeobjectflatcomboviewerRequiredPropery() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject totalSample = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, totalSampleMetaClass);
		if (totalSample == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
				allInstancesOf = EEFTestsModelsUtils.getAllInstancesOf(expectedModel, totalSampleMetaClass);
				referenceValueForAdvancedeobjectflatcomboviewerRequiredPropery = bot.changeReferenceValue(allInstancesOf, ((TotalSample)totalSample).getAdvancedeobjectflatcomboviewerRequiredPropery());
				cc.append(SetCommand.create(editingDomain, totalSample, EefnrPackage.eINSTANCE.getTotalSample_AdvancedeobjectflatcomboviewerRequiredPropery(), referenceValueForAdvancedeobjectflatcomboviewerRequiredPropery));
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
	public void testEditTotalSampleAdvancedeobjectflatcomboviewerRequiredPropery() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		totalSample = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), totalSampleMetaClass);
		if (totalSample == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
	
		// Create the expected model
		initializeExpectedModelForTotalSampleAdvancedeobjectflatcomboviewerRequiredPropery();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF properties view to edit the TotalSample element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), totalSampleMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
		
		SWTBotView propertiesView = bot.prepareLiveEditing(modelEditor, firstInstanceOf, "Base");
		
		// Change value of the advancedeobjectflatcomboviewerRequiredPropery feature of the TotalSample element 
				bot.editPropertyEObjectFlatComboViewerFeature(propertiesView, 2, allInstancesOf.indexOf(referenceValueForAdvancedeobjectflatcomboviewerRequiredPropery), bot.selectNode(modelEditor, firstInstanceOf));
		
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
	protected void initializeExpectedModelForTotalSampleAdvancedeobjectflatcomboviewerOptionalPropery() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject totalSample = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, totalSampleMetaClass);
		if (totalSample == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
				allInstancesOf = EEFTestsModelsUtils.getAllInstancesOf(expectedModel, totalSampleMetaClass);
				referenceValueForAdvancedeobjectflatcomboviewerOptionalPropery = bot.changeReferenceValue(allInstancesOf, ((TotalSample)totalSample).getAdvancedeobjectflatcomboviewerOptionalPropery());
				cc.append(SetCommand.create(editingDomain, totalSample, EefnrPackage.eINSTANCE.getTotalSample_AdvancedeobjectflatcomboviewerOptionalPropery(), referenceValueForAdvancedeobjectflatcomboviewerOptionalPropery));
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
	public void testEditTotalSampleAdvancedeobjectflatcomboviewerOptionalPropery() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		totalSample = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), totalSampleMetaClass);
		if (totalSample == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
	
		// Create the expected model
		initializeExpectedModelForTotalSampleAdvancedeobjectflatcomboviewerOptionalPropery();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF properties view to edit the TotalSample element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), totalSampleMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
		
		SWTBotView propertiesView = bot.prepareLiveEditing(modelEditor, firstInstanceOf, "Base");
		
		// Change value of the advancedeobjectflatcomboviewerOptionalPropery feature of the TotalSample element 
				bot.editPropertyEObjectFlatComboViewerFeature(propertiesView, 3, allInstancesOf.indexOf(referenceValueForAdvancedeobjectflatcomboviewerOptionalPropery)+1, bot.selectNode(modelEditor, firstInstanceOf));
		
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
	protected void initializeRemoveExpectedModelForTotalSampleAdvancedeobjectflatcomboviewerOptionalPropery() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject totalSample = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, totalSampleMetaClass);
		if (totalSample == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
				allInstancesOf = EEFTestsModelsUtils.getAllInstancesOf(expectedModel, totalSampleMetaClass);
				cc.append(SetCommand.create(editingDomain, totalSample, EefnrPackage.eINSTANCE.getTotalSample_AdvancedeobjectflatcomboviewerOptionalPropery(), null));
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
	public void testRemoveTotalSampleAdvancedeobjectflatcomboviewerOptionalPropery() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		totalSample = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), totalSampleMetaClass);
		if (totalSample == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
	
		// Create the expected model
		initializeRemoveExpectedModelForTotalSampleAdvancedeobjectflatcomboviewerOptionalPropery();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF properties view to edit the TotalSample element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), totalSampleMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
		
		SWTBotView propertiesView = bot.prepareLiveEditing(modelEditor, firstInstanceOf, "Base");
		
		// Change value of the advancedeobjectflatcomboviewerOptionalPropery feature of the TotalSample element 
				bot.removePropertyEObjectFlatComboViewerFeature(propertiesView, 3, bot.selectNode(modelEditor, firstInstanceOf));
		
		
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
	protected void initializeExpectedModelForTotalSampleAdvancedtablecompositionRequiredProperty() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject totalSample = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, totalSampleMetaClass);
		if (totalSample == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
		EClass sampleMetaClass = EefnrPackage.eINSTANCE.getSample();
		EObject sample = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, sampleMetaClass);
		if (sample == null)
			throw new InputModelInvalidException(sampleMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
		cc.append(AddCommand.create(editingDomain, totalSample, EefnrPackage.eINSTANCE.getTotalSample_AdvancedtablecompositionRequiredProperty(), EcoreUtil.copy(sample)));
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
	public void testEditTotalSampleAdvancedtablecompositionRequiredProperty() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		totalSample = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), totalSampleMetaClass);
		if (totalSample == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
	
		// Create the expected model
		initializeExpectedModelForTotalSampleAdvancedtablecompositionRequiredProperty();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF properties view to edit the TotalSample element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), totalSampleMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
		
		SWTBotView propertiesView = bot.prepareLiveEditing(modelEditor, firstInstanceOf, "Base");
		
		// Change value of the advancedtablecompositionRequiredProperty feature of the TotalSample element
				editAdvancedTableCompositionadvancedtablecompositionRequiredPropertyFeature(propertiesView, bot.selectNode(modelEditor, firstInstanceOf));
		
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
	protected void initializeRemoveExpectedModelForTotalSampleAdvancedtablecompositionRequiredProperty() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject totalSample = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, totalSampleMetaClass);
		if (totalSample == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
		List eGet = (List)totalSample.eGet(EefnrPackage.eINSTANCE.getTotalSample_AdvancedtablecompositionRequiredProperty());
		if (eGet.size() == 0)
			throw new InputModelInvalidException("Model is invalid");					
		EObject firstInstanceOf = (EObject) eGet.get(0);
		cc.append(RemoveCommand.create(editingDomain, totalSample, EefnrPackage.eINSTANCE.getTotalSample_AdvancedtablecompositionRequiredProperty(), firstInstanceOf));
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
	public void testRemoveTotalSampleAdvancedtablecompositionRequiredProperty() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		totalSample = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), totalSampleMetaClass);
		if (totalSample == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
	
		// Create the expected model
		initializeRemoveExpectedModelForTotalSampleAdvancedtablecompositionRequiredProperty();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF properties view to edit the TotalSample element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), totalSampleMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
		
		SWTBotView propertiesView = bot.prepareLiveEditing(modelEditor, firstInstanceOf, "Base");
		
		// Change value of the advancedtablecompositionRequiredProperty feature of the TotalSample element 
				bot.removePropertyAdvancedReferencesTableFeature(propertiesView, 6, firstInstanceOf, bot.selectNode(modelEditor, firstInstanceOf));
		
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
	protected void initializeExpectedModelForTotalSampleAdvancedtablecompositionOptionalProperty() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject totalSample = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, totalSampleMetaClass);
		if (totalSample == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
		EClass sampleMetaClass = EefnrPackage.eINSTANCE.getSample();
		EObject sample = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, sampleMetaClass);
		if (sample == null)
			throw new InputModelInvalidException(sampleMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
		cc.append(AddCommand.create(editingDomain, totalSample, EefnrPackage.eINSTANCE.getTotalSample_AdvancedtablecompositionOptionalProperty(), EcoreUtil.copy(sample)));
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
	public void testEditTotalSampleAdvancedtablecompositionOptionalProperty() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		totalSample = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), totalSampleMetaClass);
		if (totalSample == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
	
		// Create the expected model
		initializeExpectedModelForTotalSampleAdvancedtablecompositionOptionalProperty();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF properties view to edit the TotalSample element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), totalSampleMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
		
		SWTBotView propertiesView = bot.prepareLiveEditing(modelEditor, firstInstanceOf, "Base");
		
		// Change value of the advancedtablecompositionOptionalProperty feature of the TotalSample element
				editAdvancedTableCompositionadvancedtablecompositionOptionalPropertyFeature(propertiesView, bot.selectNode(modelEditor, firstInstanceOf));
		
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
	protected void initializeRemoveExpectedModelForTotalSampleAdvancedtablecompositionOptionalProperty() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject totalSample = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, totalSampleMetaClass);
		if (totalSample == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
		List eGet = (List)totalSample.eGet(EefnrPackage.eINSTANCE.getTotalSample_AdvancedtablecompositionOptionalProperty());
		if (eGet.size() == 0)
			throw new InputModelInvalidException("Model is invalid");					
		EObject firstInstanceOf = (EObject) eGet.get(0);
		cc.append(RemoveCommand.create(editingDomain, totalSample, EefnrPackage.eINSTANCE.getTotalSample_AdvancedtablecompositionOptionalProperty(), firstInstanceOf));
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
	public void testRemoveTotalSampleAdvancedtablecompositionOptionalProperty() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		totalSample = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), totalSampleMetaClass);
		if (totalSample == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
	
		// Create the expected model
		initializeRemoveExpectedModelForTotalSampleAdvancedtablecompositionOptionalProperty();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF properties view to edit the TotalSample element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), totalSampleMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
		
		SWTBotView propertiesView = bot.prepareLiveEditing(modelEditor, firstInstanceOf, "Base");
		
		// Change value of the advancedtablecompositionOptionalProperty feature of the TotalSample element 
				bot.removePropertyAdvancedReferencesTableFeature(propertiesView, 7, firstInstanceOf, bot.selectNode(modelEditor, firstInstanceOf));
		
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
	protected void initializeExpectedModelForTotalSampleName() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject totalSample = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, totalSampleMetaClass);
		if (totalSample == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
				cc.append(SetCommand.create(editingDomain, totalSample, EefnrPackage.eINSTANCE.getAbstractSample_Name(), UPDATED_VALUE));
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
	public void testEditTotalSampleName() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		totalSample = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), totalSampleMetaClass);
		if (totalSample == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
	
		// Create the expected model
		initializeExpectedModelForTotalSampleName();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF properties view to edit the TotalSample element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), totalSampleMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(totalSampleMetaClass.getName());
		
		SWTBotView propertiesView = bot.prepareLiveEditing(modelEditor, firstInstanceOf, "Base");
		
		// Change value of the name feature of the TotalSample element 
				bot.editPropertyTextFeature(propertiesView, EefnrMessages.TotalSamplePropertiesEditionPart_NameLabel, UPDATED_VALUE, bot.selectNode(modelEditor, firstInstanceOf));
		
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
	protected void editAdvancedTableCompositionFortablecompositionRequiredPropertyFeature() throws WidgetInvalidException {
		EClass sampleMetaClass = EefnrPackage.eINSTANCE.getSample();
		SWTBotShell shellTable = bot.shell(sampleMetaClass.getName());
		bot.activateShell(shellTable);
		Sample sample = (Sample) EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), sampleMetaClass);
		bot.sleep(500);
		// Change value of the textRequiredProperty feature of the textRequiredProperty element 
				bot.editTextWithLabel(EefnrMessages.SamplePropertiesEditionPart_TextRequiredPropertyLabel, sample.getTextRequiredProperty());
		bot.sleep(500);
		// Change value of the textOptionalProperty feature of the textOptionalProperty element 
				bot.editTextWithLabel(EefnrMessages.SamplePropertiesEditionPart_TextOptionalPropertyLabel, sample.getTextOptionalProperty());
		bot.closeShellWithFinishButton(shellTable);
	}	
	/**
	 * Edit the table composition
	 * @param wizardShell
	 */
	protected void editAdvancedTableCompositiontablecompositionRequiredPropertyFeature(SWTBotView propertyView, SWTBotTreeItem selectNode) throws WidgetInvalidException {
		SWTBot propertyBot = propertyView.bot();
		propertyBot.buttonWithTooltip(EEFRuntimeUIMessages.ReferencesTable_add_tooltip, 2).click();
		editAdvancedTableCompositionFortablecompositionRequiredPropertyFeature();
		selectNode.select();
	}
	/**
	 * Edit the feature in the table composition
	 */
	protected void editAdvancedTableCompositionFortablecompositionOptionalPropertyFeature() throws WidgetInvalidException {
		EClass sampleMetaClass = EefnrPackage.eINSTANCE.getSample();
		SWTBotShell shellTable = bot.shell(sampleMetaClass.getName());
		bot.activateShell(shellTable);
		Sample sample = (Sample) EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), sampleMetaClass);
		bot.sleep(500);
		// Change value of the textRequiredProperty feature of the textRequiredProperty element 
				bot.editTextWithLabel(EefnrMessages.SamplePropertiesEditionPart_TextRequiredPropertyLabel, sample.getTextRequiredProperty());
		bot.sleep(500);
		// Change value of the textOptionalProperty feature of the textOptionalProperty element 
				bot.editTextWithLabel(EefnrMessages.SamplePropertiesEditionPart_TextOptionalPropertyLabel, sample.getTextOptionalProperty());
		bot.closeShellWithFinishButton(shellTable);
	}	
	/**
	 * Edit the table composition
	 * @param wizardShell
	 */
	protected void editAdvancedTableCompositiontablecompositionOptionalPropertyFeature(SWTBotView propertyView, SWTBotTreeItem selectNode) throws WidgetInvalidException {
		SWTBot propertyBot = propertyView.bot();
		propertyBot.buttonWithTooltip(EEFRuntimeUIMessages.ReferencesTable_add_tooltip, 3).click();
		editAdvancedTableCompositionFortablecompositionOptionalPropertyFeature();
		selectNode.select();
	}








	/**
	 * Edit the feature in the table composition
	 */
	protected void editAdvancedTableCompositionForadvancedtablecompositionRequiredPropertyFeature() throws WidgetInvalidException {
		EClass sampleMetaClass = EefnrPackage.eINSTANCE.getSample();
		SWTBotShell shellTable = bot.shell(sampleMetaClass.getName());
		bot.activateShell(shellTable);
		Sample sample = (Sample) EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), sampleMetaClass);
		bot.sleep(500);
		// Change value of the textRequiredProperty feature of the textRequiredProperty element 
				bot.editTextWithLabel(EefnrMessages.SamplePropertiesEditionPart_TextRequiredPropertyLabel, sample.getTextRequiredProperty());
		bot.sleep(500);
		// Change value of the textOptionalProperty feature of the textOptionalProperty element 
				bot.editTextWithLabel(EefnrMessages.SamplePropertiesEditionPart_TextOptionalPropertyLabel, sample.getTextOptionalProperty());
		bot.closeShellWithFinishButton(shellTable);
	}	
	/**
	 * Edit the table composition
	 * @param wizardShell
	 */
	protected void editAdvancedTableCompositionadvancedtablecompositionRequiredPropertyFeature(SWTBotView propertyView, SWTBotTreeItem selectNode) throws WidgetInvalidException {
		SWTBot propertyBot = propertyView.bot();
		propertyBot.buttonWithTooltip(EEFRuntimeUIMessages.ReferencesTable_add_tooltip, 6).click();
		editAdvancedTableCompositionForadvancedtablecompositionRequiredPropertyFeature();
		selectNode.select();
	}
	/**
	 * Edit the feature in the table composition
	 */
	protected void editAdvancedTableCompositionForadvancedtablecompositionOptionalPropertyFeature() throws WidgetInvalidException {
		EClass sampleMetaClass = EefnrPackage.eINSTANCE.getSample();
		SWTBotShell shellTable = bot.shell(sampleMetaClass.getName());
		bot.activateShell(shellTable);
		Sample sample = (Sample) EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), sampleMetaClass);
		bot.sleep(500);
		// Change value of the textRequiredProperty feature of the textRequiredProperty element 
				bot.editTextWithLabel(EefnrMessages.SamplePropertiesEditionPart_TextRequiredPropertyLabel, sample.getTextRequiredProperty());
		bot.sleep(500);
		// Change value of the textOptionalProperty feature of the textOptionalProperty element 
				bot.editTextWithLabel(EefnrMessages.SamplePropertiesEditionPart_TextOptionalPropertyLabel, sample.getTextOptionalProperty());
		bot.closeShellWithFinishButton(shellTable);
	}	
	/**
	 * Edit the table composition
	 * @param wizardShell
	 */
	protected void editAdvancedTableCompositionadvancedtablecompositionOptionalPropertyFeature(SWTBotView propertyView, SWTBotTreeItem selectNode) throws WidgetInvalidException {
		SWTBot propertyBot = propertyView.bot();
		propertyBot.buttonWithTooltip(EEFRuntimeUIMessages.ReferencesTable_add_tooltip, 7).click();
		editAdvancedTableCompositionForadvancedtablecompositionOptionalPropertyFeature();
		selectNode.select();
	}




}
