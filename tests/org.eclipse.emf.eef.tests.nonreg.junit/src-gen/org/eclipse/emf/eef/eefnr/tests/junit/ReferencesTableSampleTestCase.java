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
package org.eclipse.emf.eef.eefnr.tests.junit;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.eef.eefnr.EefnrPackage;
import org.eclipse.emf.eef.eefnr.ReferencesTableSample;
import org.eclipse.emf.eef.eefnr.providers.EefnrMessages;
import org.eclipse.emf.eef.runtime.tests.SWTBotEEFTestCase;
import org.eclipse.emf.eef.runtime.tests.exceptions.InputModelInvalidException;
import org.eclipse.emf.eef.runtime.tests.utils.EEFTestsModelsUtils;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotEditor;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotShell;
/**
 * TestCase for ReferencesTableSample
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 */
public class ReferencesTableSampleTestCase extends SWTBotEEFTestCase {

	/**
	 * The EClass of the type to edit
	 */
	private EClass referencesTableSampleMetaClass = EefnrPackage.eINSTANCE.getReferencesTableSample();

	/**
	 * The type to edit
	 */
	private EObject referencesTableSample;
	/**
	 * The reference value for the reference class referencestableOptionalProperty
	 */
	private Object referenceValueForReferencestableOptionalProperty;
	/**
	 * The reference value for the reference class referencestableRequiredProperty
	 */
	private Object referenceValueForReferencestableRequiredProperty;
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
	protected void initializeExpectedModelForReferencesTableSampleReferencestableRequiredProperty() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject referencesTableSample = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, referencesTableSampleMetaClass);
		if (referencesTableSample == null)
			throw new InputModelInvalidException(referencesTableSampleMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
		allInstancesOf = EEFTestsModelsUtils.getAllInstancesOf(expectedModel, totalSampleMetaClass);
		referenceValueForReferencestableRequiredProperty = bot.changeReferenceValue(allInstancesOf, ((ReferencesTableSample)referencesTableSample).getReferencestableRequiredProperty());
		cc.append(AddCommand.create(editingDomain, referencesTableSample, EefnrPackage.eINSTANCE.getReferencesTableSample_ReferencestableRequiredProperty(), referenceValueForReferencestableRequiredProperty));
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
	public void testEditReferencesTableSampleReferencestableRequiredProperty() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		referencesTableSample = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), referencesTableSampleMetaClass);
		if (referencesTableSample == null)
			throw new InputModelInvalidException(referencesTableSampleMetaClass.getName());
	
		// Create the expected model
		initializeExpectedModelForReferencesTableSampleReferencestableRequiredProperty();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF wizard (by double click) to edit the ReferencesTableSample element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), referencesTableSampleMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(referencesTableSampleMetaClass.getName());
		
		SWTBotShell wizardShell = bot.prepareBatchEditing(modelEditor, referencesTableSampleMetaClass, firstInstanceOf, "Base");
		
		// Change value of the referencestableRequiredProperty feature of the ReferencesTableSample element 
				bot.editReferencesTableFeature(wizardShell, 0, 0, EefnrMessages.PropertiesEditionPart_AddListViewerLabel);
		
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
	protected void initializeRemoveExpectedModelForReferencesTableSampleReferencestableRequiredProperty() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject referencesTableSample = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, referencesTableSampleMetaClass);
		if (referencesTableSample == null)
			throw new InputModelInvalidException(referencesTableSampleMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
		List<EObject> allReferencedInstances = (List<EObject>)referencesTableSample.eGet(EefnrPackage.eINSTANCE.getReferencesTableSample_ReferencestableRequiredProperty());
		if (allReferencedInstances.size() > 0) {
			cc.append(RemoveCommand.create(editingDomain, referencesTableSample, EefnrPackage.eINSTANCE.getReferencesTableSample_ReferencestableRequiredProperty(), allReferencedInstances.get(0)));
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
	public void testRemoveReferencesTableSampleReferencestableRequiredProperty() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		referencesTableSample = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), referencesTableSampleMetaClass);
		if (referencesTableSample == null)
			throw new InputModelInvalidException(referencesTableSampleMetaClass.getName());
	
		// Create the expected model
		initializeRemoveExpectedModelForReferencesTableSampleReferencestableRequiredProperty();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF wizard (by double click) to edit the ReferencesTableSample element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), referencesTableSampleMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(referencesTableSampleMetaClass.getName());
		
		SWTBotShell wizardShell = bot.prepareBatchEditing(modelEditor, referencesTableSampleMetaClass, firstInstanceOf, "Base");
		
		// Change value of the referencestableRequiredProperty feature of the ReferencesTableSample element 
				bot.removeReferencesTableFeature(wizardShell, 0, 0, EefnrMessages.PropertiesEditionPart_RemoveListViewerLabel);
		
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
	protected void initializeExpectedModelForReferencesTableSampleReferencestableOptionalProperty() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject referencesTableSample = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, referencesTableSampleMetaClass);
		if (referencesTableSample == null)
			throw new InputModelInvalidException(referencesTableSampleMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
		allInstancesOf = EEFTestsModelsUtils.getAllInstancesOf(expectedModel, totalSampleMetaClass);
		referenceValueForReferencestableOptionalProperty = bot.changeReferenceValue(allInstancesOf, ((ReferencesTableSample)referencesTableSample).getReferencestableOptionalProperty());
		cc.append(AddCommand.create(editingDomain, referencesTableSample, EefnrPackage.eINSTANCE.getReferencesTableSample_ReferencestableOptionalProperty(), referenceValueForReferencestableOptionalProperty));
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
	public void testEditReferencesTableSampleReferencestableOptionalProperty() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		referencesTableSample = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), referencesTableSampleMetaClass);
		if (referencesTableSample == null)
			throw new InputModelInvalidException(referencesTableSampleMetaClass.getName());
	
		// Create the expected model
		initializeExpectedModelForReferencesTableSampleReferencestableOptionalProperty();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF wizard (by double click) to edit the ReferencesTableSample element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), referencesTableSampleMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(referencesTableSampleMetaClass.getName());
		
		SWTBotShell wizardShell = bot.prepareBatchEditing(modelEditor, referencesTableSampleMetaClass, firstInstanceOf, "Base");
		
		// Change value of the referencestableOptionalProperty feature of the ReferencesTableSample element 
				bot.editReferencesTableFeature(wizardShell, 1, 0, EefnrMessages.PropertiesEditionPart_AddListViewerLabel);
		
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
	protected void initializeRemoveExpectedModelForReferencesTableSampleReferencestableOptionalProperty() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject referencesTableSample = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, referencesTableSampleMetaClass);
		if (referencesTableSample == null)
			throw new InputModelInvalidException(referencesTableSampleMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
		List<EObject> allReferencedInstances = (List<EObject>)referencesTableSample.eGet(EefnrPackage.eINSTANCE.getReferencesTableSample_ReferencestableOptionalProperty());
		if (allReferencedInstances.size() > 0) {
			cc.append(RemoveCommand.create(editingDomain, referencesTableSample, EefnrPackage.eINSTANCE.getReferencesTableSample_ReferencestableOptionalProperty(), allReferencedInstances.get(0)));
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
	public void testRemoveReferencesTableSampleReferencestableOptionalProperty() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		referencesTableSample = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), referencesTableSampleMetaClass);
		if (referencesTableSample == null)
			throw new InputModelInvalidException(referencesTableSampleMetaClass.getName());
	
		// Create the expected model
		initializeRemoveExpectedModelForReferencesTableSampleReferencestableOptionalProperty();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF wizard (by double click) to edit the ReferencesTableSample element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), referencesTableSampleMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(referencesTableSampleMetaClass.getName());
		
		SWTBotShell wizardShell = bot.prepareBatchEditing(modelEditor, referencesTableSampleMetaClass, firstInstanceOf, "Base");
		
		// Change value of the referencestableOptionalProperty feature of the ReferencesTableSample element 
				bot.removeReferencesTableFeature(wizardShell, 1, 0, EefnrMessages.PropertiesEditionPart_RemoveListViewerLabel);
		
		// Save the changement
		bot.finalizeEdition(modelEditor);
		
		// Compare real model with expected model
		assertExpectedModelReached(expectedModel);
		
		// Delete the input model
		deleteModels();
	
	}






}
