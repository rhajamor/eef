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

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.eef.eefnr.EMFComboViewerSample;
import org.eclipse.emf.eef.eefnr.EefnrPackage;
import org.eclipse.emf.eef.eefnr.providers.EefnrMessages;
import org.eclipse.emf.eef.runtime.tests.SWTBotEEFTestCase;
import org.eclipse.emf.eef.runtime.tests.exceptions.InputModelInvalidException;
import org.eclipse.emf.eef.runtime.tests.utils.EEFTestsModelsUtils;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotEditor;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotView;
/**
 * TestCase for EMFComboViewerSample
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 */
public class EMFComboViewerSamplePropertiesTestCase extends SWTBotEEFTestCase {

	/**
	 * The EClass of the type to edit
	 */
	private EClass eMFComboViewerSampleMetaClass = EefnrPackage.eINSTANCE.getEMFComboViewerSample();

	/**
	 * The type to edit
	 */
	private EObject eMFComboViewerSample;
	/**
	 * The enum value for the enum class emfcomboviewerRequiredProperty
	 */
	private Object enumValueForEmfcomboviewerRequiredProperty;
	/**
	 * The enum value for the enum class emfcomboviewerOptionalProperty
	 */
	private Object enumValueForEmfcomboviewerOptionalProperty;
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
	protected void initializeExpectedModelForEMFComboViewerSampleEmfcomboviewerRequiredProperty() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject eMFComboViewerSample = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, eMFComboViewerSampleMetaClass);
		if (eMFComboViewerSample == null)
			throw new InputModelInvalidException(eMFComboViewerSampleMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
				cc.append(SetCommand.create(editingDomain, eMFComboViewerSample, EefnrPackage.eINSTANCE.getEMFComboViewerSample_EmfcomboviewerRequiredProperty(), UPDATED_VALUE));
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
	public void testEditEMFComboViewerSampleEmfcomboviewerRequiredProperty() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		eMFComboViewerSample = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), eMFComboViewerSampleMetaClass);
		if (eMFComboViewerSample == null)
			throw new InputModelInvalidException(eMFComboViewerSampleMetaClass.getName());
	
		enumValueForEmfcomboviewerRequiredProperty = bot.changeEnumLiteralValue(EefnrPackage.eINSTANCE.getENUM_SAMPLE(), ((EMFComboViewerSample)eMFComboViewerSample).getEmfcomboviewerRequiredProperty().getLiteral());
		// Create the expected model
		initializeExpectedModelForEMFComboViewerSampleEmfcomboviewerRequiredProperty();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF properties view to edit the EMFComboViewerSample element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), eMFComboViewerSampleMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(eMFComboViewerSampleMetaClass.getName());
		
		SWTBotView propertiesView = bot.prepareLiveEditing(modelEditor, firstInstanceOf, "Base");
		
		// Change value of the emfcomboviewerRequiredProperty feature of the EMFComboViewerSample element 
				bot.editPropertyTextFeature(propertiesView, EefnrMessages.EMFComboViewerSamplePropertiesEditionPart_EmfcomboviewerRequiredPropertyLabel, UPDATED_VALUE, bot.selectNode(modelEditor, firstInstanceOf));
		
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
	protected void initializeExpectedModelForEMFComboViewerSampleEmfcomboviewerOptionalProperty() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject eMFComboViewerSample = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, eMFComboViewerSampleMetaClass);
		if (eMFComboViewerSample == null)
			throw new InputModelInvalidException(eMFComboViewerSampleMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
				cc.append(SetCommand.create(editingDomain, eMFComboViewerSample, EefnrPackage.eINSTANCE.getEMFComboViewerSample_EmfcomboviewerOptionalProperty(), UPDATED_VALUE));
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
	public void testEditEMFComboViewerSampleEmfcomboviewerOptionalProperty() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		eMFComboViewerSample = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), eMFComboViewerSampleMetaClass);
		if (eMFComboViewerSample == null)
			throw new InputModelInvalidException(eMFComboViewerSampleMetaClass.getName());
	
		enumValueForEmfcomboviewerOptionalProperty = bot.changeEnumLiteralValue(EefnrPackage.eINSTANCE.getENUM_SAMPLE(), ((EMFComboViewerSample)eMFComboViewerSample).getEmfcomboviewerOptionalProperty().getLiteral());
		// Create the expected model
		initializeExpectedModelForEMFComboViewerSampleEmfcomboviewerOptionalProperty();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF properties view to edit the EMFComboViewerSample element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), eMFComboViewerSampleMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(eMFComboViewerSampleMetaClass.getName());
		
		SWTBotView propertiesView = bot.prepareLiveEditing(modelEditor, firstInstanceOf, "Base");
		
		// Change value of the emfcomboviewerOptionalProperty feature of the EMFComboViewerSample element 
				bot.editPropertyTextFeature(propertiesView, EefnrMessages.EMFComboViewerSamplePropertiesEditionPart_EmfcomboviewerOptionalPropertyLabel, UPDATED_VALUE, bot.selectNode(modelEditor, firstInstanceOf));
		
		// Save the changement
		bot.finalizeEdition(modelEditor);
		
		// Compare real model with expected model
		assertExpectedModelReached(expectedModel);
		
		// Delete the input model
		deleteModels();
	
	}






}
