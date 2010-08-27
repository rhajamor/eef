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
import org.eclipse.emf.eef.eefnr.EefnrPackage;
import org.eclipse.emf.eef.eefnr.FlatReferencesTableSample;
import org.eclipse.emf.eef.runtime.tests.SWTBotEEFTestCase;
import org.eclipse.emf.eef.runtime.tests.exceptions.InputModelInvalidException;
import org.eclipse.emf.eef.runtime.tests.utils.EEFTestsModelsUtils;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotEditor;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotView;
/**
 * TestCase for FlatReferenceTableSample
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 */
public class FlatReferenceTableSamplePropertiesTestCase extends SWTBotEEFTestCase {

	/**
	 * The EClass of the type to edit
	 */
	private EClass flatReferencesTableSampleMetaClass = EefnrPackage.eINSTANCE.getFlatReferencesTableSample();

	/**
	 * The type to edit
	 */
	private EObject flatReferencesTableSample;
	/**
	 * The reference value for the reference class flatreferencestableOptionalProperty
	 */
	private Object referenceValueForFlatreferencestableOptionalProperty;
	/**
	 * The reference value for the reference class flatreferencestableRequiredProperty
	 */
	private Object referenceValueForFlatreferencestableRequiredProperty;
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
	protected void initializeExpectedModelForFlatReferencesTableSampleFlatreferencetableRequiredProperty() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject flatReferencesTableSample = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, flatReferencesTableSampleMetaClass);
		if (flatReferencesTableSample == null)
			throw new InputModelInvalidException(flatReferencesTableSampleMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
		allInstancesOf = EEFTestsModelsUtils.getAllInstancesOf(expectedModel, totalSampleMetaClass);
		referenceValueForFlatreferencestableRequiredProperty = bot.changeReferenceValue(allInstancesOf, ((FlatReferencesTableSample)flatReferencesTableSample).getFlatreferencestableRequiredProperty());
		cc.append(AddCommand.create(editingDomain, flatReferencesTableSample, EefnrPackage.eINSTANCE.getFlatReferencesTableSample_FlatreferencestableRequiredProperty(), referenceValueForFlatreferencestableRequiredProperty));
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
	public void testEditFlatReferenceTableSampleFlatreferencetableRequiredProperty() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		flatReferencesTableSample = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), flatReferencesTableSampleMetaClass);
		if (flatReferencesTableSample == null)
			throw new InputModelInvalidException(flatReferencesTableSampleMetaClass.getName());
	
		// Create the expected model
		initializeExpectedModelForFlatReferencesTableSampleFlatreferencetableRequiredProperty();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF properties view to edit the FlatReferencesTableSample element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), flatReferencesTableSampleMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(flatReferencesTableSampleMetaClass.getName());
		
		SWTBotView propertiesView = bot.prepareLiveEditing(modelEditor, firstInstanceOf, "Base");
		
		// Change value of the flatreferencetableRequiredProperty feature of the FlatReferencesTableSample element 
		bot.editPropertyFlatReferencesTableFeature(propertiesView, 0, 0, bot.selectNode(modelEditor, firstInstanceOf));
		
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
	protected void initializeRemoveExpectedModelForFlatReferencesTableSampleFlatreferencetableRequiredProperty() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject flatReferencesTableSample = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, flatReferencesTableSampleMetaClass);
		if (flatReferencesTableSample == null)
			throw new InputModelInvalidException(flatReferencesTableSampleMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
		List<EObject> allReferencedInstances = (List<EObject>)flatReferencesTableSample.eGet(EefnrPackage.eINSTANCE.getFlatReferencesTableSample_FlatreferencestableRequiredProperty());
		if (allReferencedInstances.size() > 0) {
			cc.append(RemoveCommand.create(editingDomain, flatReferencesTableSample, EefnrPackage.eINSTANCE.getFlatReferencesTableSample_FlatreferencestableRequiredProperty(), allReferencedInstances.get(0)));
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
	public void testRemoveFlatReferenceTableSampleFlatreferencetableRequiredProperty() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		flatReferencesTableSample = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), flatReferencesTableSampleMetaClass);
		if (flatReferencesTableSample == null)
			throw new InputModelInvalidException(flatReferencesTableSampleMetaClass.getName());
	
		// Create the expected model
		initializeRemoveExpectedModelForFlatReferencesTableSampleFlatreferencetableRequiredProperty();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF properties view to edit the FlatReferencesTableSample element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), flatReferencesTableSampleMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(flatReferencesTableSampleMetaClass.getName());
		
		SWTBotView propertiesView = bot.prepareLiveEditing(modelEditor, firstInstanceOf, "Base");
		
		// Change value of the flatreferencetableRequiredProperty feature of the FlatReferencesTableSample element 
				bot.removePropertyFlatReferencesTableFeature(propertiesView, 0, bot.selectNode(modelEditor, firstInstanceOf));
		
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
	protected void initializeExpectedModelForFlatReferencesTableSampleFlatreferencetableOptionalProperty() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject flatReferencesTableSample = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, flatReferencesTableSampleMetaClass);
		if (flatReferencesTableSample == null)
			throw new InputModelInvalidException(flatReferencesTableSampleMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
		allInstancesOf = EEFTestsModelsUtils.getAllInstancesOf(expectedModel, totalSampleMetaClass);
		referenceValueForFlatreferencestableOptionalProperty = bot.changeReferenceValue(allInstancesOf, ((FlatReferencesTableSample)flatReferencesTableSample).getFlatreferencestableOptionalProperty());
		cc.append(AddCommand.create(editingDomain, flatReferencesTableSample, EefnrPackage.eINSTANCE.getFlatReferencesTableSample_FlatreferencestableOptionalProperty(), referenceValueForFlatreferencestableOptionalProperty));
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
	public void testEditFlatReferenceTableSampleFlatreferencetableOptionalProperty() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		flatReferencesTableSample = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), flatReferencesTableSampleMetaClass);
		if (flatReferencesTableSample == null)
			throw new InputModelInvalidException(flatReferencesTableSampleMetaClass.getName());
	
		// Create the expected model
		initializeExpectedModelForFlatReferencesTableSampleFlatreferencetableOptionalProperty();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF properties view to edit the FlatReferencesTableSample element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), flatReferencesTableSampleMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(flatReferencesTableSampleMetaClass.getName());
		
		SWTBotView propertiesView = bot.prepareLiveEditing(modelEditor, firstInstanceOf, "Base");
		
		// Change value of the flatreferencetableOptionalProperty feature of the FlatReferencesTableSample element 
		bot.editPropertyFlatReferencesTableFeature(propertiesView, 1, 0, bot.selectNode(modelEditor, firstInstanceOf));
		
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
	protected void initializeRemoveExpectedModelForFlatReferencesTableSampleFlatreferencetableOptionalProperty() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject flatReferencesTableSample = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, flatReferencesTableSampleMetaClass);
		if (flatReferencesTableSample == null)
			throw new InputModelInvalidException(flatReferencesTableSampleMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
		List<EObject> allReferencedInstances = (List<EObject>)flatReferencesTableSample.eGet(EefnrPackage.eINSTANCE.getFlatReferencesTableSample_FlatreferencestableOptionalProperty());
		if (allReferencedInstances.size() > 0) {
			cc.append(RemoveCommand.create(editingDomain, flatReferencesTableSample, EefnrPackage.eINSTANCE.getFlatReferencesTableSample_FlatreferencestableOptionalProperty(), allReferencedInstances.get(0)));
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
	public void testRemoveFlatReferenceTableSampleFlatreferencetableOptionalProperty() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		flatReferencesTableSample = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), flatReferencesTableSampleMetaClass);
		if (flatReferencesTableSample == null)
			throw new InputModelInvalidException(flatReferencesTableSampleMetaClass.getName());
	
		// Create the expected model
		initializeRemoveExpectedModelForFlatReferencesTableSampleFlatreferencetableOptionalProperty();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF properties view to edit the FlatReferencesTableSample element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), flatReferencesTableSampleMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(flatReferencesTableSampleMetaClass.getName());
		
		SWTBotView propertiesView = bot.prepareLiveEditing(modelEditor, firstInstanceOf, "Base");
		
		// Change value of the flatreferencetableOptionalProperty feature of the FlatReferencesTableSample element 
				bot.removePropertyFlatReferencesTableFeature(propertiesView, 1, bot.selectNode(modelEditor, firstInstanceOf));
		
		// Save the changement
		bot.finalizeEdition(modelEditor);
		
		// Compare real model with expected model
		assertExpectedModelReached(expectedModel);
		
		// Delete the input model
		deleteModels();
	
	}






}
