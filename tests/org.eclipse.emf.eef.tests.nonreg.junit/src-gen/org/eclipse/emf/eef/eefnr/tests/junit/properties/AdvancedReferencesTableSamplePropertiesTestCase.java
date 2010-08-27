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
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.eef.eefnr.AdvancedReferencesTableSample;
import org.eclipse.emf.eef.eefnr.EefnrPackage;
import org.eclipse.emf.eef.eefnr.providers.EefnrMessages;
import org.eclipse.emf.eef.runtime.tests.SWTBotEEFTestCase;
import org.eclipse.emf.eef.runtime.tests.exceptions.InputModelInvalidException;
import org.eclipse.emf.eef.runtime.tests.utils.EEFTestsModelsUtils;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotEditor;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotView;
/**
 * TestCase for AdvancedReferencesTableSample
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 */
public class AdvancedReferencesTableSamplePropertiesTestCase extends SWTBotEEFTestCase {

	/**
	 * The EClass of the type to edit
	 */
	private EClass advancedReferencesTableSampleMetaClass = EefnrPackage.eINSTANCE.getAdvancedReferencesTableSample();

	/**
	 * The type to edit
	 */
	private EObject advancedReferencesTableSample;
	/**
	 * The reference value for the reference class advancedreferencestableRequiredProperty
	 */
	private Object referenceValueForAdvancedreferencestableRequiredProperty;
	/**
	 * The reference value for the reference class advancedreferencestableOptionalProperty
	 */
	private Object referenceValueForAdvancedreferencestableOptionalProperty;
	/**
	 * The EClass of the reference to edit
	 */
	private EClass totalSampleMetaClass = EefnrPackage.eINSTANCE.getTotalSample();	
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
	protected void initializeExpectedModelForAdvancedReferencesTableSampleAdvancedreferencestableRequiredProperty() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject advancedReferencesTableSample = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, advancedReferencesTableSampleMetaClass);
		if (advancedReferencesTableSample == null)
			throw new InputModelInvalidException(advancedReferencesTableSampleMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
				allInstancesOf = EEFTestsModelsUtils.getAllInstancesOf(expectedModel, totalSampleMetaClass);
				referenceValueForAdvancedreferencestableRequiredProperty = bot.changeReferenceValue(allInstancesOf, ((AdvancedReferencesTableSample)advancedReferencesTableSample).getAdvancedreferencestableRequiredProperty());
				cc.append(AddCommand.create(editingDomain, advancedReferencesTableSample, EefnrPackage.eINSTANCE.getAdvancedReferencesTableSample_AdvancedreferencestableRequiredProperty(), referenceValueForAdvancedreferencestableRequiredProperty));
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
	public void testEditAdvancedReferencesTableSampleAdvancedreferencestableRequiredProperty() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		advancedReferencesTableSample = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), advancedReferencesTableSampleMetaClass);
		if (advancedReferencesTableSample == null)
			throw new InputModelInvalidException(advancedReferencesTableSampleMetaClass.getName());
	
		// Create the expected model
		initializeExpectedModelForAdvancedReferencesTableSampleAdvancedreferencestableRequiredProperty();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF properties view to edit the AdvancedReferencesTableSample element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), advancedReferencesTableSampleMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(advancedReferencesTableSampleMetaClass.getName());
		
		SWTBotView propertiesView = bot.prepareLiveEditing(modelEditor, firstInstanceOf, "Base");
		
		// Change value of the advancedreferencestableRequiredProperty feature of the AdvancedReferencesTableSample element 
				bot.editPropertyAdvancedReferencesTableFeature(propertiesView, 0, referenceValueForAdvancedreferencestableRequiredProperty, bot.selectNode(modelEditor, firstInstanceOf));
		
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
	protected void initializeRemoveExpectedModelForAdvancedReferencesTableSampleAdvancedreferencestableRequiredProperty() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject advancedReferencesTableSample = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, advancedReferencesTableSampleMetaClass);
		if (advancedReferencesTableSample == null)
			throw new InputModelInvalidException(advancedReferencesTableSampleMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
		List<EObject> allReferencedInstances = (List<EObject>)advancedReferencesTableSample.eGet(EefnrPackage.eINSTANCE.getAdvancedReferencesTableSample_AdvancedreferencestableRequiredProperty());
		if (allReferencedInstances.size() > 0) {
			cc.append(RemoveCommand.create(editingDomain, advancedReferencesTableSample, EefnrPackage.eINSTANCE.getAdvancedReferencesTableSample_AdvancedreferencestableRequiredProperty(), allReferencedInstances.get(0)));
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
	public void testRemoveAdvancedReferencesTableSampleAdvancedreferencestableRequiredProperty() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		advancedReferencesTableSample = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), advancedReferencesTableSampleMetaClass);
		if (advancedReferencesTableSample == null)
			throw new InputModelInvalidException(advancedReferencesTableSampleMetaClass.getName());
	
		// Create the expected model
		initializeRemoveExpectedModelForAdvancedReferencesTableSampleAdvancedreferencestableRequiredProperty();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF properties view to edit the AdvancedReferencesTableSample element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), advancedReferencesTableSampleMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(advancedReferencesTableSampleMetaClass.getName());
		
		SWTBotView propertiesView = bot.prepareLiveEditing(modelEditor, firstInstanceOf, "Base");
		
		// Change value of the advancedreferencestableRequiredProperty feature of the AdvancedReferencesTableSample element 
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
	protected void initializeExpectedModelForAdvancedReferencesTableSampleAdvancedreferencestableOptionalProperty() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject advancedReferencesTableSample = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, advancedReferencesTableSampleMetaClass);
		if (advancedReferencesTableSample == null)
			throw new InputModelInvalidException(advancedReferencesTableSampleMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
				allInstancesOf = EEFTestsModelsUtils.getAllInstancesOf(expectedModel, totalSampleMetaClass);
				referenceValueForAdvancedreferencestableOptionalProperty = bot.changeReferenceValue(allInstancesOf, ((AdvancedReferencesTableSample)advancedReferencesTableSample).getAdvancedreferencestableOptionalProperty());
				cc.append(AddCommand.create(editingDomain, advancedReferencesTableSample, EefnrPackage.eINSTANCE.getAdvancedReferencesTableSample_AdvancedreferencestableOptionalProperty(), referenceValueForAdvancedreferencestableOptionalProperty));
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
	public void testEditAdvancedReferencesTableSampleAdvancedreferencestableOptionalProperty() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		advancedReferencesTableSample = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), advancedReferencesTableSampleMetaClass);
		if (advancedReferencesTableSample == null)
			throw new InputModelInvalidException(advancedReferencesTableSampleMetaClass.getName());
	
		// Create the expected model
		initializeExpectedModelForAdvancedReferencesTableSampleAdvancedreferencestableOptionalProperty();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF properties view to edit the AdvancedReferencesTableSample element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), advancedReferencesTableSampleMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(advancedReferencesTableSampleMetaClass.getName());
		
		SWTBotView propertiesView = bot.prepareLiveEditing(modelEditor, firstInstanceOf, "Base");
		
		// Change value of the advancedreferencestableOptionalProperty feature of the AdvancedReferencesTableSample element 
				bot.editPropertyAdvancedReferencesTableFeature(propertiesView, 1, referenceValueForAdvancedreferencestableOptionalProperty, bot.selectNode(modelEditor, firstInstanceOf));
		
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
	protected void initializeRemoveExpectedModelForAdvancedReferencesTableSampleAdvancedreferencestableOptionalProperty() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject advancedReferencesTableSample = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, advancedReferencesTableSampleMetaClass);
		if (advancedReferencesTableSample == null)
			throw new InputModelInvalidException(advancedReferencesTableSampleMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
		List<EObject> allReferencedInstances = (List<EObject>)advancedReferencesTableSample.eGet(EefnrPackage.eINSTANCE.getAdvancedReferencesTableSample_AdvancedreferencestableOptionalProperty());
		if (allReferencedInstances.size() > 0) {
			cc.append(RemoveCommand.create(editingDomain, advancedReferencesTableSample, EefnrPackage.eINSTANCE.getAdvancedReferencesTableSample_AdvancedreferencestableOptionalProperty(), allReferencedInstances.get(0)));
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
	public void testRemoveAdvancedReferencesTableSampleAdvancedreferencestableOptionalProperty() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		advancedReferencesTableSample = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), advancedReferencesTableSampleMetaClass);
		if (advancedReferencesTableSample == null)
			throw new InputModelInvalidException(advancedReferencesTableSampleMetaClass.getName());
	
		// Create the expected model
		initializeRemoveExpectedModelForAdvancedReferencesTableSampleAdvancedreferencestableOptionalProperty();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF properties view to edit the AdvancedReferencesTableSample element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), advancedReferencesTableSampleMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(advancedReferencesTableSampleMetaClass.getName());
		
		SWTBotView propertiesView = bot.prepareLiveEditing(modelEditor, firstInstanceOf, "Base");
		
		// Change value of the advancedreferencestableOptionalProperty feature of the AdvancedReferencesTableSample element 
				bot.removePropertyAdvancedReferencesTableFeature(propertiesView, 1, EefnrMessages.PropertiesEditionPart_RemoveListViewerLabel, bot.selectNode(modelEditor, firstInstanceOf));
		
		// Save the changement
		bot.finalizeEdition(modelEditor);
		
		// Compare real model with expected model
		assertExpectedModelReached(expectedModel);
		
		// Delete the input model
		deleteModels();
	
	}






}
