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
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.eef.eefnr.EObjectFlatComboViewerSample;
import org.eclipse.emf.eef.eefnr.EefnrPackage;
import org.eclipse.emf.eef.runtime.tests.SWTBotEEFTestCase;
import org.eclipse.emf.eef.runtime.tests.exceptions.InputModelInvalidException;
import org.eclipse.emf.eef.runtime.tests.utils.EEFTestsModelsUtils;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotEditor;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotView;
/**
 * TestCase for EObjectFlatComboViewerSample
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 */
public class EObjectFlatComboViewerSamplePropertiesTestCase extends SWTBotEEFTestCase {

	/**
	 * The EClass of the type to edit
	 */
	private EClass eObjectFlatComboViewerSampleMetaClass = EefnrPackage.eINSTANCE.getEObjectFlatComboViewerSample();

	/**
	 * The type to edit
	 */
	private EObject eObjectFlatComboViewerSample;
	/**
	 * The reference value for the reference class eobjectflatcomboviewerOptionalPropery
	 */
	private Object referenceValueForEobjectflatcomboviewerOptionalPropery;
	/**
	 * The reference value for the reference class eobjectflatcomboviewerRequiredPropery
	 */
	private Object referenceValueForEobjectflatcomboviewerRequiredPropery;
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
	protected void initializeExpectedModelForEObjectFlatComboViewerSampleEobjectflatcomboviewerRequiredPropery() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject eObjectFlatComboViewerSample = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, eObjectFlatComboViewerSampleMetaClass);
		if (eObjectFlatComboViewerSample == null)
			throw new InputModelInvalidException(eObjectFlatComboViewerSampleMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
				allInstancesOf = EEFTestsModelsUtils.getAllInstancesOf(expectedModel, totalSampleMetaClass);
				referenceValueForEobjectflatcomboviewerRequiredPropery = bot.changeReferenceValue(allInstancesOf, ((EObjectFlatComboViewerSample)eObjectFlatComboViewerSample).getEobjectflatcomboviewerRequiredPropery());
				cc.append(SetCommand.create(editingDomain, eObjectFlatComboViewerSample, EefnrPackage.eINSTANCE.getEObjectFlatComboViewerSample_EobjectflatcomboviewerRequiredPropery(), referenceValueForEobjectflatcomboviewerRequiredPropery));
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
	public void testEditEObjectFlatComboViewerSampleEobjectflatcomboviewerRequiredPropery() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		eObjectFlatComboViewerSample = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), eObjectFlatComboViewerSampleMetaClass);
		if (eObjectFlatComboViewerSample == null)
			throw new InputModelInvalidException(eObjectFlatComboViewerSampleMetaClass.getName());
	
		// Create the expected model
		initializeExpectedModelForEObjectFlatComboViewerSampleEobjectflatcomboviewerRequiredPropery();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF properties view to edit the EObjectFlatComboViewerSample element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), eObjectFlatComboViewerSampleMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(eObjectFlatComboViewerSampleMetaClass.getName());
		
		SWTBotView propertiesView = bot.prepareLiveEditing(modelEditor, firstInstanceOf, "Base");
		
		// Change value of the eobjectflatcomboviewerRequiredPropery feature of the EObjectFlatComboViewerSample element 
				bot.editPropertyEObjectFlatComboViewerFeature(propertiesView, 0, allInstancesOf.indexOf(referenceValueForEobjectflatcomboviewerRequiredPropery), bot.selectNode(modelEditor, firstInstanceOf));
		
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
	protected void initializeExpectedModelForEObjectFlatComboViewerSampleEobjectflatcomboviewerOptionalPropery() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject eObjectFlatComboViewerSample = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, eObjectFlatComboViewerSampleMetaClass);
		if (eObjectFlatComboViewerSample == null)
			throw new InputModelInvalidException(eObjectFlatComboViewerSampleMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
				allInstancesOf = EEFTestsModelsUtils.getAllInstancesOf(expectedModel, totalSampleMetaClass);
				referenceValueForEobjectflatcomboviewerOptionalPropery = bot.changeReferenceValue(allInstancesOf, ((EObjectFlatComboViewerSample)eObjectFlatComboViewerSample).getEobjectflatcomboviewerOptionalPropery());
				cc.append(SetCommand.create(editingDomain, eObjectFlatComboViewerSample, EefnrPackage.eINSTANCE.getEObjectFlatComboViewerSample_EobjectflatcomboviewerOptionalPropery(), referenceValueForEobjectflatcomboviewerOptionalPropery));
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
	public void testEditEObjectFlatComboViewerSampleEobjectflatcomboviewerOptionalPropery() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		eObjectFlatComboViewerSample = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), eObjectFlatComboViewerSampleMetaClass);
		if (eObjectFlatComboViewerSample == null)
			throw new InputModelInvalidException(eObjectFlatComboViewerSampleMetaClass.getName());
	
		// Create the expected model
		initializeExpectedModelForEObjectFlatComboViewerSampleEobjectflatcomboviewerOptionalPropery();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF properties view to edit the EObjectFlatComboViewerSample element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), eObjectFlatComboViewerSampleMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(eObjectFlatComboViewerSampleMetaClass.getName());
		
		SWTBotView propertiesView = bot.prepareLiveEditing(modelEditor, firstInstanceOf, "Base");
		
		// Change value of the eobjectflatcomboviewerOptionalPropery feature of the EObjectFlatComboViewerSample element 
				bot.editPropertyEObjectFlatComboViewerFeature(propertiesView, 1, allInstancesOf.indexOf(referenceValueForEobjectflatcomboviewerOptionalPropery)+1, bot.selectNode(modelEditor, firstInstanceOf));
		
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
	protected void initializeRemoveExpectedModelForEObjectFlatComboViewerSampleEobjectflatcomboviewerOptionalPropery() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject eObjectFlatComboViewerSample = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, eObjectFlatComboViewerSampleMetaClass);
		if (eObjectFlatComboViewerSample == null)
			throw new InputModelInvalidException(eObjectFlatComboViewerSampleMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
				allInstancesOf = EEFTestsModelsUtils.getAllInstancesOf(expectedModel, totalSampleMetaClass);
				cc.append(SetCommand.create(editingDomain, eObjectFlatComboViewerSample, EefnrPackage.eINSTANCE.getEObjectFlatComboViewerSample_EobjectflatcomboviewerOptionalPropery(), null));
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
	public void testRemoveEObjectFlatComboViewerSampleEobjectflatcomboviewerOptionalPropery() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		eObjectFlatComboViewerSample = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), eObjectFlatComboViewerSampleMetaClass);
		if (eObjectFlatComboViewerSample == null)
			throw new InputModelInvalidException(eObjectFlatComboViewerSampleMetaClass.getName());
	
		// Create the expected model
		initializeRemoveExpectedModelForEObjectFlatComboViewerSampleEobjectflatcomboviewerOptionalPropery();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF properties view to edit the EObjectFlatComboViewerSample element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), eObjectFlatComboViewerSampleMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(eObjectFlatComboViewerSampleMetaClass.getName());
		
		SWTBotView propertiesView = bot.prepareLiveEditing(modelEditor, firstInstanceOf, "Base");
		
		// Change value of the eobjectflatcomboviewerOptionalPropery feature of the EObjectFlatComboViewerSample element 
				bot.removePropertyEObjectFlatComboViewerFeature(propertiesView, 1, bot.selectNode(modelEditor, firstInstanceOf));
		
		
		// Save the changement
		bot.finalizeEdition(modelEditor);
		
		// Compare real model with expected model
		assertExpectedModelReached(expectedModel);
		
		// Delete the input model
		deleteModels();
	
	}






}
