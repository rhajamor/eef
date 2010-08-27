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

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.eef.eefnr.EefnrPackage;
import org.eclipse.emf.eef.eefnr.RadioSample;
import org.eclipse.emf.eef.eefnr.providers.EefnrMessages;
import org.eclipse.emf.eef.runtime.tests.SWTBotEEFTestCase;
import org.eclipse.emf.eef.runtime.tests.exceptions.InputModelInvalidException;
import org.eclipse.emf.eef.runtime.tests.utils.EEFTestsModelsUtils;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotEditor;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotShell;
/**
 * TestCase for RadioSample
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 */
public class RadioSampleTestCase extends SWTBotEEFTestCase {

	/**
	 * The EClass of the type to edit
	 */
	private EClass radioSampleMetaClass = EefnrPackage.eINSTANCE.getRadioSample();

	/**
	 * The type to edit
	 */
	private EObject radioSample;
	/**
	 * The enum value for the enum class radioRequiredProperty
	 */
	private Object enumValueForRadioRequiredProperty;
	/**
	 * The enum value for the enum class radioOptionalProperty
	 */
	private Object enumValueForRadioOptionalProperty;
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
	protected void initializeExpectedModelForRadioSampleRadioRequiredProperty() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject radioSample = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, radioSampleMetaClass);
		if (radioSample == null)
			throw new InputModelInvalidException(radioSampleMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
				cc.append(SetCommand.create(editingDomain, radioSample, EefnrPackage.eINSTANCE.getRadioSample_RadioRequiredProperty(), UPDATED_VALUE));
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
	public void testEditRadioSampleRadioRequiredProperty() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		radioSample = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), radioSampleMetaClass);
		if (radioSample == null)
			throw new InputModelInvalidException(radioSampleMetaClass.getName());
	
		enumValueForRadioRequiredProperty = bot.changeEnumLiteralValue(EefnrPackage.eINSTANCE.getENUM_SAMPLE(), ((RadioSample)radioSample).getRadioRequiredProperty().getLiteral());
		// Create the expected model
		initializeExpectedModelForRadioSampleRadioRequiredProperty();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF wizard (by double click) to edit the RadioSample element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), radioSampleMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(radioSampleMetaClass.getName());
		
		SWTBotShell wizardShell = bot.prepareBatchEditing(modelEditor, radioSampleMetaClass, firstInstanceOf, "Base");
		
		// Change value of the radioRequiredProperty feature of the RadioSample element 
				bot.editTextFeature(wizardShell, EefnrMessages.RadioSamplePropertiesEditionPart_RadioRequiredPropertyLabel, UPDATED_VALUE);
		
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
	protected void initializeExpectedModelForRadioSampleRadioOptionalProperty() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject radioSample = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, radioSampleMetaClass);
		if (radioSample == null)
			throw new InputModelInvalidException(radioSampleMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
				cc.append(SetCommand.create(editingDomain, radioSample, EefnrPackage.eINSTANCE.getRadioSample_RadioOptionalProperty(), UPDATED_VALUE));
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
	public void testEditRadioSampleRadioOptionalProperty() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		radioSample = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), radioSampleMetaClass);
		if (radioSample == null)
			throw new InputModelInvalidException(radioSampleMetaClass.getName());
	
		enumValueForRadioOptionalProperty = bot.changeEnumLiteralValue(EefnrPackage.eINSTANCE.getENUM_SAMPLE(), ((RadioSample)radioSample).getRadioOptionalProperty().getLiteral());
		// Create the expected model
		initializeExpectedModelForRadioSampleRadioOptionalProperty();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF wizard (by double click) to edit the RadioSample element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), radioSampleMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(radioSampleMetaClass.getName());
		
		SWTBotShell wizardShell = bot.prepareBatchEditing(modelEditor, radioSampleMetaClass, firstInstanceOf, "Base");
		
		// Change value of the radioOptionalProperty feature of the RadioSample element 
				bot.editTextFeature(wizardShell, EefnrMessages.RadioSamplePropertiesEditionPart_RadioOptionalPropertyLabel, UPDATED_VALUE);
		
		// Save the changement
		bot.finalizeEdition(modelEditor);
		
		// Compare real model with expected model
		assertExpectedModelReached(expectedModel);
		
		// Delete the input model
		deleteModels();
	
	}






}
