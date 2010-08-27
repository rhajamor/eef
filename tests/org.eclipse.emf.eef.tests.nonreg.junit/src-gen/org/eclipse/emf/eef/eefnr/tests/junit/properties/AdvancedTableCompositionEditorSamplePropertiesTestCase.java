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
import org.eclipse.emf.eef.eefnr.EefnrPackage;
import org.eclipse.emf.eef.eefnr.Sample;
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
 * TestCase for AdvancedTableCompositionEditorSample
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 */
public class AdvancedTableCompositionEditorSamplePropertiesTestCase extends SWTBotEEFTestCase {

	/**
	 * The EClass of the type to edit
	 */
	private EClass advancedTableCompositionEditorSampleMetaClass = EefnrPackage.eINSTANCE.getAdvancedTableCompositionEditorSample();

	/**
	 * The type to edit
	 */
	private EObject advancedTableCompositionEditorSample;
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
	protected void initializeExpectedModelForAdvancedTableCompositionEditorSampleAdvancedtablecompositionRequiredProperty() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject advancedTableCompositionEditorSample = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, advancedTableCompositionEditorSampleMetaClass);
		if (advancedTableCompositionEditorSample == null)
			throw new InputModelInvalidException(advancedTableCompositionEditorSampleMetaClass.getName());
		EClass sampleMetaClass = EefnrPackage.eINSTANCE.getSample();
		EObject sample = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, sampleMetaClass);
		if (sample == null)
			throw new InputModelInvalidException(sampleMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
		cc.append(AddCommand.create(editingDomain, advancedTableCompositionEditorSample, EefnrPackage.eINSTANCE.getAdvancedTableCompositionEditorSample_AdvancedtablecompositionRequiredProperty(), EcoreUtil.copy(sample)));
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
	public void testEditAdvancedTableCompositionEditorSampleAdvancedtablecompositionRequiredProperty() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		advancedTableCompositionEditorSample = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), advancedTableCompositionEditorSampleMetaClass);
		if (advancedTableCompositionEditorSample == null)
			throw new InputModelInvalidException(advancedTableCompositionEditorSampleMetaClass.getName());
	
		// Create the expected model
		initializeExpectedModelForAdvancedTableCompositionEditorSampleAdvancedtablecompositionRequiredProperty();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF properties view to edit the AdvancedTableCompositionEditorSample element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), advancedTableCompositionEditorSampleMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(advancedTableCompositionEditorSampleMetaClass.getName());
		
		SWTBotView propertiesView = bot.prepareLiveEditing(modelEditor, firstInstanceOf, "Base");
		
		// Change value of the advancedtablecompositionRequiredProperty feature of the AdvancedTableCompositionEditorSample element
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
	protected void initializeRemoveExpectedModelForAdvancedTableCompositionEditorSampleAdvancedtablecompositionRequiredProperty() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject advancedTableCompositionEditorSample = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, advancedTableCompositionEditorSampleMetaClass);
		if (advancedTableCompositionEditorSample == null)
			throw new InputModelInvalidException(advancedTableCompositionEditorSampleMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
		List eGet = (List)advancedTableCompositionEditorSample.eGet(EefnrPackage.eINSTANCE.getAdvancedTableCompositionEditorSample_AdvancedtablecompositionRequiredProperty());
		if (eGet.size() == 0)
			throw new InputModelInvalidException("Model is invalid");					
		EObject firstInstanceOf = (EObject) eGet.get(0);
		cc.append(RemoveCommand.create(editingDomain, advancedTableCompositionEditorSample, EefnrPackage.eINSTANCE.getAdvancedTableCompositionEditorSample_AdvancedtablecompositionRequiredProperty(), firstInstanceOf));
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
	public void testRemoveAdvancedTableCompositionEditorSampleAdvancedtablecompositionRequiredProperty() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		advancedTableCompositionEditorSample = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), advancedTableCompositionEditorSampleMetaClass);
		if (advancedTableCompositionEditorSample == null)
			throw new InputModelInvalidException(advancedTableCompositionEditorSampleMetaClass.getName());
	
		// Create the expected model
		initializeRemoveExpectedModelForAdvancedTableCompositionEditorSampleAdvancedtablecompositionRequiredProperty();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF properties view to edit the AdvancedTableCompositionEditorSample element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), advancedTableCompositionEditorSampleMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(advancedTableCompositionEditorSampleMetaClass.getName());
		
		SWTBotView propertiesView = bot.prepareLiveEditing(modelEditor, firstInstanceOf, "Base");
		
		// Change value of the advancedtablecompositionRequiredProperty feature of the AdvancedTableCompositionEditorSample element 
				bot.removePropertyAdvancedReferencesTableFeature(propertiesView, 0, firstInstanceOf, bot.selectNode(modelEditor, firstInstanceOf));
		
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
	protected void initializeExpectedModelForAdvancedTableCompositionEditorSampleAdvancedtablecompositionOptionalProperty() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject advancedTableCompositionEditorSample = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, advancedTableCompositionEditorSampleMetaClass);
		if (advancedTableCompositionEditorSample == null)
			throw new InputModelInvalidException(advancedTableCompositionEditorSampleMetaClass.getName());
		EClass sampleMetaClass = EefnrPackage.eINSTANCE.getSample();
		EObject sample = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, sampleMetaClass);
		if (sample == null)
			throw new InputModelInvalidException(sampleMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
		cc.append(AddCommand.create(editingDomain, advancedTableCompositionEditorSample, EefnrPackage.eINSTANCE.getAdvancedTableCompositionEditorSample_AdvancedtablecompositionOptionalProperty(), EcoreUtil.copy(sample)));
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
	public void testEditAdvancedTableCompositionEditorSampleAdvancedtablecompositionOptionalProperty() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		advancedTableCompositionEditorSample = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), advancedTableCompositionEditorSampleMetaClass);
		if (advancedTableCompositionEditorSample == null)
			throw new InputModelInvalidException(advancedTableCompositionEditorSampleMetaClass.getName());
	
		// Create the expected model
		initializeExpectedModelForAdvancedTableCompositionEditorSampleAdvancedtablecompositionOptionalProperty();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF properties view to edit the AdvancedTableCompositionEditorSample element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), advancedTableCompositionEditorSampleMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(advancedTableCompositionEditorSampleMetaClass.getName());
		
		SWTBotView propertiesView = bot.prepareLiveEditing(modelEditor, firstInstanceOf, "Base");
		
		// Change value of the advancedtablecompositionOptionalProperty feature of the AdvancedTableCompositionEditorSample element
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
	protected void initializeRemoveExpectedModelForAdvancedTableCompositionEditorSampleAdvancedtablecompositionOptionalProperty() throws InputModelInvalidException, IOException {
		// Create the expected model content by applying the attempted command on a copy of the input model content
		createExpectedModel();
		EObject advancedTableCompositionEditorSample = EEFTestsModelsUtils.getFirstInstanceOf(expectedModel, advancedTableCompositionEditorSampleMetaClass);
		if (advancedTableCompositionEditorSample == null)
			throw new InputModelInvalidException(advancedTableCompositionEditorSampleMetaClass.getName());
		CompoundCommand cc = new CompoundCommand();
		List eGet = (List)advancedTableCompositionEditorSample.eGet(EefnrPackage.eINSTANCE.getAdvancedTableCompositionEditorSample_AdvancedtablecompositionOptionalProperty());
		if (eGet.size() == 0)
			throw new InputModelInvalidException("Model is invalid");					
		EObject firstInstanceOf = (EObject) eGet.get(0);
		cc.append(RemoveCommand.create(editingDomain, advancedTableCompositionEditorSample, EefnrPackage.eINSTANCE.getAdvancedTableCompositionEditorSample_AdvancedtablecompositionOptionalProperty(), firstInstanceOf));
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
	public void testRemoveAdvancedTableCompositionEditorSampleAdvancedtablecompositionOptionalProperty() throws Exception {
		
		// Import the input model
		initializeInputModel();
		
		advancedTableCompositionEditorSample = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), advancedTableCompositionEditorSampleMetaClass);
		if (advancedTableCompositionEditorSample == null)
			throw new InputModelInvalidException(advancedTableCompositionEditorSampleMetaClass.getName());
	
		// Create the expected model
		initializeRemoveExpectedModelForAdvancedTableCompositionEditorSampleAdvancedtablecompositionOptionalProperty();
		
		// Open the input model with the treeview editor
		SWTBotEditor modelEditor = bot.openActiveModel();
		
		// Open the EEF properties view to edit the AdvancedTableCompositionEditorSample element
		EObject firstInstanceOf = EEFTestsModelsUtils.getFirstInstanceOf(bot.getActiveResource(), advancedTableCompositionEditorSampleMetaClass);
		if (firstInstanceOf == null)
			throw new InputModelInvalidException(advancedTableCompositionEditorSampleMetaClass.getName());
		
		SWTBotView propertiesView = bot.prepareLiveEditing(modelEditor, firstInstanceOf, "Base");
		
		// Change value of the advancedtablecompositionOptionalProperty feature of the AdvancedTableCompositionEditorSample element 
				bot.removePropertyAdvancedReferencesTableFeature(propertiesView, 1, firstInstanceOf, bot.selectNode(modelEditor, firstInstanceOf));
		
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
		propertyBot.buttonWithTooltip(EEFRuntimeUIMessages.ReferencesTable_add_tooltip, 0).click();
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
		propertyBot.buttonWithTooltip(EEFRuntimeUIMessages.ReferencesTable_add_tooltip, 1).click();
		editAdvancedTableCompositionForadvancedtablecompositionOptionalPropertyFeature();
		selectNode.select();
	}


}
