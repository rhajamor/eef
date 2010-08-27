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
import org.eclipse.emf.eef.eefnr.providers.EefnrMessages;
import org.eclipse.emf.eef.runtime.tests.SWTBotEEFTestCase;
import org.eclipse.emf.eef.runtime.tests.exceptions.InputModelInvalidException;
import org.eclipse.emf.eef.runtime.tests.utils.EEFTestsModelsUtils;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotEditor;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotShell;
/**
 * TestCase for MultiValuedEditorSample
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 */
public class MultiValuedEditorSampleTestCase extends SWTBotEEFTestCase {

	/**
	 * The EClass of the type to edit
	 */
	private EClass multiValuedEditorSampleMetaClass = EefnrPackage.eINSTANCE.getMultiValuedEditorSample();

	/**
	 * The type to edit
	 */
	private EObject multiValuedEditorSample;
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
	protected void initializeExpectedModelForMultiValuedEditorSampleMultivaluededitorRequiredProperty() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject multiValuedEditorSample = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, multiValuedEditorSampleMetaClass);
		if (multiValuedEditorSample == null)
			throw new InputModelInvalidException(multiValuedEditorSampleMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
				cc.append(SetCommand.create(editingDomain, multiValuedEditorSample, EefnrPackage.eINSTANCE.getMultiValuedEditorSample_MultivaluededitorRequiredProperty(), UPDATED_VALUE));
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
	public void testEditMultiValuedEditorSampleMultivaluededitorRequiredProperty() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		multiValuedEditorSample = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), multiValuedEditorSampleMetaClass);
		if (multiValuedEditorSample == null)
			throw new InputModelInvalidException(multiValuedEditorSampleMetaClass.getName());
	
		// Create the expected model
		initializeExpectedModelForMultiValuedEditorSampleMultivaluededitorRequiredProperty();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF wizard (by double click) to edit the MultiValuedEditorSample element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), multiValuedEditorSampleMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(multiValuedEditorSampleMetaClass.getName());
		
		SWTBotShell wizardShell = bot.prepareBatchEditing(modelEditor, multiValuedEditorSampleMetaClass, firstInstanceOf, "Base");
		
		// Change value of the multivaluededitorRequiredProperty feature of the MultiValuedEditorSample element 
				bot.editTextFeature(wizardShell, EefnrMessages.MultiValuedEditorSamplePropertiesEditionPart_MultivaluededitorRequiredPropertyLabel, UPDATED_VALUE);
		
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
	protected void initializeExpectedModelForMultiValuedEditorSampleMultivaluededitorOptionalProperty() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject multiValuedEditorSample = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, multiValuedEditorSampleMetaClass);
		if (multiValuedEditorSample == null)
			throw new InputModelInvalidException(multiValuedEditorSampleMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
				cc.append(SetCommand.create(editingDomain, multiValuedEditorSample, EefnrPackage.eINSTANCE.getMultiValuedEditorSample_MultivaluededitorOptionalProperty(), UPDATED_VALUE));
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
	public void testEditMultiValuedEditorSampleMultivaluededitorOptionalProperty() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		multiValuedEditorSample = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), multiValuedEditorSampleMetaClass);
		if (multiValuedEditorSample == null)
			throw new InputModelInvalidException(multiValuedEditorSampleMetaClass.getName());
	
		// Create the expected model
		initializeExpectedModelForMultiValuedEditorSampleMultivaluededitorOptionalProperty();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF wizard (by double click) to edit the MultiValuedEditorSample element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), multiValuedEditorSampleMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(multiValuedEditorSampleMetaClass.getName());
		
		SWTBotShell wizardShell = bot.prepareBatchEditing(modelEditor, multiValuedEditorSampleMetaClass, firstInstanceOf, "Base");
		
		// Change value of the multivaluededitorOptionalProperty feature of the MultiValuedEditorSample element 
				bot.editTextFeature(wizardShell, EefnrMessages.MultiValuedEditorSamplePropertiesEditionPart_MultivaluededitorOptionalPropertyLabel, UPDATED_VALUE);
		
		// Save the changement
		bot.finalizeEdition(modelEditor);
		
		// Compare real model with expected model
		assertExpectedModelReached(expectedModel);
		
		// Delete the input model
		deleteModels();
	
	}






}
