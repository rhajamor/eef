/*******************************************************************************
 * Copyright (c) 2008, 2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.samples.tests.junit;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.conference.BatchMBotAddAdvTableCompo;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.conference.BatchMBotCancelAddAdvTableCompo;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.conference.BatchMBotCancelSetAttributeMVE;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.conference.BatchMBotCancelSetReferenceAdvRefTable;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.conference.BatchMBotCancelSetReferenceEOFCV;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.conference.BatchMBotRedoAddAdvTableCompo;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.conference.BatchMBotRedoSetAttributeCheckbox;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.conference.BatchMBotRedoSetAttributeEMFComboViewer;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.conference.BatchMBotRedoSetAttributeMVE;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.conference.BatchMBotRedoSetAttributeText;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.conference.BatchMBotRedoSetAttributeTextArea;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.conference.BatchMBotRedoSetReferenceAdvRefTable;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.conference.BatchMBotRedoSetReferenceEOFCV;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.conference.BatchMBotRemoveAdvTableCompo;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.conference.BatchMBotSetAttributeCheckbox;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.conference.BatchMBotSetAttributeEMFComboViewer;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.conference.BatchMBotSetAttributeMVE;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.conference.BatchMBotSetAttributeText;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.conference.BatchMBotSetAttributeTextArea;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.conference.BatchMBotSetReferenceAdvRefTable;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.conference.BatchMBotSetReferenceAdvRefTable2;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.conference.BatchMBotSetReferenceEOFCV;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.conference.BatchMBotUndoAddAdvTableCompo;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.conference.BatchMBotUndoSetAttributeCheckbox;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.conference.BatchMBotUndoSetAttributeEMFComboViewer;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.conference.BatchMBotUndoSetAttributeMVE;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.conference.BatchMBotUndoSetAttributeText;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.conference.BatchMBotUndoSetAttributeTextArea;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.conference.BatchMBotUndoSetReferenceAdvRefTable;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.conference.BatchMBotUndoSetReferenceEOFCV;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.conference.BatchMBotUnsetAdvRefTable;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.conference.BatchMBotUnsetAttributeMVE;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.conference.BatchMBotUnsetAttributeText;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.conference.BatchMBotUnsetAttributeTextArea;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.conference.BatchMBotUnsetMVE;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.conference.BatchMBotUnsetReferenceAdvRefTable;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.conference.BatchMBotUnsetText;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.conference.BatchMBotUnsetTextArea;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.nonreg.BatchMBotAddTableCompo;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.nonreg.BatchMBotCancelAddTableCompo;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.nonreg.BatchMBotCancelSetReferenceAEOFCV;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.nonreg.BatchMBotCancelSetReferenceFlatRefTable;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.nonreg.BatchMBotCancelSetReferenceRefTable;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.nonreg.BatchMBotRedoAddTableCompo;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.nonreg.BatchMBotRedoSetAttributeRadio;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.nonreg.BatchMBotRedoSetReferenceAEOFCV;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.nonreg.BatchMBotRedoSetReferenceCombo;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.nonreg.BatchMBotRedoSetReferenceFlatRefTable;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.nonreg.BatchMBotRedoSetReferenceRefTable;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.nonreg.BatchMBotRemoveTableCompo;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.nonreg.BatchMBotSetAttributeRadio;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.nonreg.BatchMBotSetReferenceAEOFCV;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.nonreg.BatchMBotSetReferenceCombo;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.nonreg.BatchMBotSetReferenceFlatRefTable;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.nonreg.BatchMBotSetReferenceRefTable;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.nonreg.BatchMBotUndoAddTableCompo;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.nonreg.BatchMBotUndoSetAttributeRadio;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.nonreg.BatchMBotUndoSetReferenceAEOFCV;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.nonreg.BatchMBotUndoSetReferenceCombo;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.nonreg.BatchMBotUndoSetReferenceFlatRefTable;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.nonreg.BatchMBotUndoSetReferenceRefTable;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.nonreg.BatchMBotUnsetAEOFCV;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.nonreg.BatchMBotUnsetCombo;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.nonreg.BatchMBotUnsetEOFCV;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.nonreg.BatchMBotUnsetFlatRefTable;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.nonreg.BatchMBotUnsetRefTable;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.nonreg.BatchMBotUnsetReferenceAEOFCV;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.nonreg.BatchMBotUnsetReferenceCombo;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.nonreg.BatchMBotUnsetReferenceEOFCV;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.nonreg.BatchMBotUnsetReferenceFlatRefTable;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.nonreg.BatchMBotUnsetReferenceRefTable;

public class AllBatchMBotTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"Test for org.eclipse.emf.samples.tests.junit");
		// $JUnit-BEGIN$

		// Set Attribute
		suite.addTestSuite(BatchMBotSetAttributeCheckbox.class);
		suite.addTestSuite(BatchMBotSetAttributeEMFComboViewer.class);
		suite.addTestSuite(BatchMBotSetAttributeMVE.class);
		suite.addTestSuite(BatchMBotSetAttributeText.class);
		suite.addTestSuite(BatchMBotSetAttributeTextArea.class);

		suite.addTestSuite(BatchMBotSetAttributeRadio.class);

		// Set Reference
		suite.addTestSuite(BatchMBotSetReferenceAdvRefTable.class);
		suite.addTestSuite(BatchMBotSetReferenceAdvRefTable2.class);
		suite.addTestSuite(BatchMBotSetReferenceEOFCV.class);

		suite.addTestSuite(BatchMBotSetReferenceAEOFCV.class);
		suite.addTestSuite(BatchMBotSetReferenceCombo.class);
		suite.addTestSuite(BatchMBotSetReferenceFlatRefTable.class);
		suite.addTestSuite(BatchMBotSetReferenceRefTable.class);

		// Unset
		suite.addTestSuite(BatchMBotUnsetAdvRefTable.class);
		suite.addTestSuite(BatchMBotUnsetMVE.class);
		suite.addTestSuite(BatchMBotUnsetText.class);
		suite.addTestSuite(BatchMBotUnsetTextArea.class);

		suite.addTestSuite(BatchMBotUnsetAEOFCV.class);
		suite.addTestSuite(BatchMBotUnsetCombo.class);
		suite.addTestSuite(BatchMBotUnsetEOFCV.class);
		suite.addTestSuite(BatchMBotUnsetFlatRefTable.class);
		suite.addTestSuite(BatchMBotUnsetRefTable.class);

		// Unset Attribute
		suite.addTestSuite(BatchMBotUnsetAttributeMVE.class);
		suite.addTestSuite(BatchMBotUnsetAttributeText.class);
		suite.addTestSuite(BatchMBotUnsetAttributeTextArea.class);

		// Unset Reference
		suite.addTestSuite(BatchMBotUnsetReferenceAdvRefTable.class);

		suite.addTestSuite(BatchMBotUnsetReferenceAEOFCV.class);
		suite.addTestSuite(BatchMBotUnsetReferenceCombo.class);
		suite.addTestSuite(BatchMBotUnsetReferenceEOFCV.class);
		suite.addTestSuite(BatchMBotUnsetReferenceFlatRefTable.class);
		suite.addTestSuite(BatchMBotUnsetReferenceRefTable.class);

		// Add
		suite.addTestSuite(BatchMBotAddAdvTableCompo.class);

		suite.addTestSuite(BatchMBotAddTableCompo.class);

		// Remove
		suite.addTestSuite(BatchMBotRemoveAdvTableCompo.class);

		suite.addTestSuite(BatchMBotRemoveTableCompo.class);

		// Undo
		suite.addTestSuite(BatchMBotUndoAddAdvTableCompo.class);
		suite.addTestSuite(BatchMBotUndoSetAttributeCheckbox.class);
		suite.addTestSuite(BatchMBotUndoSetAttributeEMFComboViewer.class);
		suite.addTestSuite(BatchMBotUndoSetAttributeMVE.class);
		suite.addTestSuite(BatchMBotUndoSetAttributeText.class);
		suite.addTestSuite(BatchMBotUndoSetAttributeTextArea.class);
		suite.addTestSuite(BatchMBotUndoSetReferenceAdvRefTable.class);
		suite.addTestSuite(BatchMBotUndoSetReferenceEOFCV.class);

		suite.addTestSuite(BatchMBotUndoAddTableCompo.class);
		suite.addTestSuite(BatchMBotUndoSetAttributeRadio.class);
		suite.addTestSuite(BatchMBotUndoSetReferenceAEOFCV.class);
		suite.addTestSuite(BatchMBotUndoSetReferenceCombo.class);
		suite.addTestSuite(BatchMBotUndoSetReferenceFlatRefTable.class);
		suite.addTestSuite(BatchMBotUndoSetReferenceRefTable.class);

		// Redo
		suite.addTestSuite(BatchMBotRedoAddAdvTableCompo.class);
		suite.addTestSuite(BatchMBotRedoSetAttributeCheckbox.class);
		suite.addTestSuite(BatchMBotRedoSetAttributeEMFComboViewer.class);
		suite.addTestSuite(BatchMBotRedoSetAttributeMVE.class);
		suite.addTestSuite(BatchMBotRedoSetAttributeText.class);
		suite.addTestSuite(BatchMBotRedoSetAttributeTextArea.class);
		suite.addTestSuite(BatchMBotRedoSetReferenceAdvRefTable.class);
		suite.addTestSuite(BatchMBotRedoSetReferenceEOFCV.class);

		suite.addTestSuite(BatchMBotRedoAddTableCompo.class);
		suite.addTestSuite(BatchMBotRedoSetAttributeRadio.class);
		suite.addTestSuite(BatchMBotRedoSetReferenceAEOFCV.class);
		suite.addTestSuite(BatchMBotRedoSetReferenceCombo.class);
		suite.addTestSuite(BatchMBotRedoSetReferenceFlatRefTable.class);
		suite.addTestSuite(BatchMBotRedoSetReferenceRefTable.class);

		// Cancel
		suite.addTestSuite(BatchMBotCancelAddAdvTableCompo.class);
		suite.addTestSuite(BatchMBotCancelSetAttributeMVE.class);
		suite.addTestSuite(BatchMBotCancelSetReferenceAdvRefTable.class);
		suite.addTestSuite(BatchMBotCancelSetReferenceEOFCV.class);

		suite.addTestSuite(BatchMBotCancelAddTableCompo.class);
		suite.addTestSuite(BatchMBotCancelSetReferenceAEOFCV.class);
		suite.addTestSuite(BatchMBotCancelSetReferenceFlatRefTable.class);
		suite.addTestSuite(BatchMBotCancelSetReferenceRefTable.class);

		// Edit

		// $JUnit-END$
		return suite;
	}

}
