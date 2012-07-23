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

import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.conference.ComposedMBotAddAdvTableCompo;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.conference.ComposedMBotCancelAddAdvTableCompo;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.conference.ComposedMBotCancelSetAttributeMVE;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.conference.ComposedMBotCancelSetReferenceAdvRefTable;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.conference.ComposedMBotCancelSetReferenceEOFCV;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.conference.ComposedMBotRedoAddAdvTableCompo;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.conference.ComposedMBotRedoSetAttributeMVE;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.conference.ComposedMBotRedoSetAttributeTextArea;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.conference.ComposedMBotRedoSetReferenceEOFCV;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.conference.ComposedMBotRemoveAdvTableCompo;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.conference.ComposedMBotSetAttributeCheckbox;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.conference.ComposedMBotSetAttributeEMFComboViewer;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.conference.ComposedMBotSetAttributeMVE;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.conference.ComposedMBotSetAttributeText;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.conference.ComposedMBotSetAttributeTextArea;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.conference.ComposedMBotSetReferenceAdvRefTable;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.conference.ComposedMBotSetReferenceAdvRefTable2;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.conference.ComposedMBotSetReferenceEOFCV;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.conference.ComposedMBotUndoAddAdvTableCompo;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.conference.ComposedMBotUndoSetAttributeMVE;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.conference.ComposedMBotUndoSetAttributeTextArea;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.conference.ComposedMBotUndoSetReferenceEOFCV;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.conference.ComposedMBotUnsetAdvRefTable;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.conference.ComposedMBotUnsetAttributeMVE;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.conference.ComposedMBotUnsetAttributeText;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.conference.ComposedMBotUnsetAttributeTextArea;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.conference.ComposedMBotUnsetMVE;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.conference.ComposedMBotUnsetReferenceAdvRefTable;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.conference.ComposedMBotUnsetText;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.conference.ComposedMBotUnsetTextArea;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.nonreg.ComposedMBotAddAdvTableCompoOnAbstractRef;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.nonreg.ComposedMBotAddTableCompo;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.nonreg.ComposedMBotCancelAddTableCompo;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.nonreg.ComposedMBotCancelSetReferenceAEOFCV;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.nonreg.ComposedMBotCancelSetReferenceFlatRefTable;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.nonreg.ComposedMBotCancelSetReferenceRefTable;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.nonreg.ComposedMBotRedoAddTableCompo;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.nonreg.ComposedMBotRedoSetAttributeRadio;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.nonreg.ComposedMBotRedoSetReferenceAEOFCV;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.nonreg.ComposedMBotRedoSetReferenceCombo;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.nonreg.ComposedMBotRedoSetReferenceFlatRefTable;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.nonreg.ComposedMBotRedoSetReferenceRefTable;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.nonreg.ComposedMBotRemoveTableCompo;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.nonreg.ComposedMBotSetAttributeRadio;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.nonreg.ComposedMBotSetReferenceAEOFCV;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.nonreg.ComposedMBotSetReferenceCombo;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.nonreg.ComposedMBotSetReferenceFlatRefTable;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.nonreg.ComposedMBotSetReferenceRefTable;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.nonreg.ComposedMBotUndoAddTableCompo;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.nonreg.ComposedMBotUndoSetAttributeRadio;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.nonreg.ComposedMBotUndoSetReferenceAEOFCV;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.nonreg.ComposedMBotUndoSetReferenceCombo;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.nonreg.ComposedMBotUndoSetReferenceFlatRefTable;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.nonreg.ComposedMBotUndoSetReferenceRefTable;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.nonreg.ComposedMBotUnsetAEOFCV;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.nonreg.ComposedMBotUnsetCombo;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.nonreg.ComposedMBotUnsetEOFCV;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.nonreg.ComposedMBotUnsetFlatRefTable;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.nonreg.ComposedMBotUnsetRefTable;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.nonreg.ComposedMBotUnsetReferenceAEOFCV;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.nonreg.ComposedMBotUnsetReferenceCombo;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.nonreg.ComposedMBotUnsetReferenceEOFCV;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.nonreg.ComposedMBotUnsetReferenceFlatRefTable;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.nonreg.ComposedMBotUnsetReferenceRefTable;

public class AllComposedMBotTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"Test for org.eclipse.emf.samples.tests.junit");
		// $JUnit-BEGIN$

		// Set Attribute
		suite.addTestSuite(ComposedMBotSetAttributeCheckbox.class);
		suite.addTestSuite(ComposedMBotSetAttributeEMFComboViewer.class);
		suite.addTestSuite(ComposedMBotSetAttributeMVE.class);
		suite.addTestSuite(ComposedMBotSetAttributeText.class);
		suite.addTestSuite(ComposedMBotSetAttributeTextArea.class);

		suite.addTestSuite(ComposedMBotSetAttributeRadio.class);

		// Set Reference
		suite.addTestSuite(ComposedMBotSetReferenceAdvRefTable.class);
		suite.addTestSuite(ComposedMBotSetReferenceAdvRefTable2.class);
		suite.addTestSuite(ComposedMBotSetReferenceEOFCV.class);

		suite.addTestSuite(ComposedMBotSetReferenceAEOFCV.class);
		suite.addTestSuite(ComposedMBotSetReferenceCombo.class);
		suite.addTestSuite(ComposedMBotSetReferenceFlatRefTable.class);
		suite.addTestSuite(ComposedMBotSetReferenceRefTable.class);

		// Unset
		suite.addTestSuite(ComposedMBotUnsetAdvRefTable.class);
		suite.addTestSuite(ComposedMBotUnsetMVE.class);
		suite.addTestSuite(ComposedMBotUnsetText.class);
		suite.addTestSuite(ComposedMBotUnsetTextArea.class);

		suite.addTestSuite(ComposedMBotUnsetAEOFCV.class);
		suite.addTestSuite(ComposedMBotUnsetCombo.class);
		suite.addTestSuite(ComposedMBotUnsetEOFCV.class);
		suite.addTestSuite(ComposedMBotUnsetFlatRefTable.class);
		suite.addTestSuite(ComposedMBotUnsetRefTable.class);

		// Unset Attribute
		suite.addTestSuite(ComposedMBotUnsetAttributeMVE.class);
		suite.addTestSuite(ComposedMBotUnsetAttributeText.class);
		suite.addTestSuite(ComposedMBotUnsetAttributeTextArea.class);

		// Unset Reference
		suite.addTestSuite(ComposedMBotUnsetReferenceAdvRefTable.class);

		suite.addTestSuite(ComposedMBotUnsetReferenceAEOFCV.class);
		suite.addTestSuite(ComposedMBotUnsetReferenceCombo.class);
		suite.addTestSuite(ComposedMBotUnsetReferenceEOFCV.class);
		suite.addTestSuite(ComposedMBotUnsetReferenceFlatRefTable.class);
		suite.addTestSuite(ComposedMBotUnsetReferenceRefTable.class);

		// Add
		suite.addTestSuite(ComposedMBotAddAdvTableCompo.class);

		suite.addTestSuite(ComposedMBotAddAdvTableCompoOnAbstractRef.class);
		suite.addTestSuite(ComposedMBotAddTableCompo.class);

		// Remove
		suite.addTestSuite(ComposedMBotRemoveAdvTableCompo.class);

		suite.addTestSuite(ComposedMBotRemoveTableCompo.class);

		// Undo
		suite.addTestSuite(ComposedMBotUndoAddAdvTableCompo.class);
		//suite.addTestSuite(ComposedMBotUndoSetAttributeCheckbox.class);
		//suite.addTestSuite(ComposedMBotUndoSetAttributeEMFComboViewer.class);
		suite.addTestSuite(ComposedMBotUndoSetAttributeMVE.class);
		//suite.addTestSuite(ComposedMBotUndoSetAttributeText.class);
		suite.addTestSuite(ComposedMBotUndoSetAttributeTextArea.class);
		//suite.addTestSuite(ComposedMBotUndoSetReferenceAdvRefTable.class);
		suite.addTestSuite(ComposedMBotUndoSetReferenceEOFCV.class);

		suite.addTestSuite(ComposedMBotUndoAddTableCompo.class);
		suite.addTestSuite(ComposedMBotUndoSetAttributeRadio.class);
		suite.addTestSuite(ComposedMBotUndoSetReferenceAEOFCV.class);
		suite.addTestSuite(ComposedMBotUndoSetReferenceCombo.class);
		suite.addTestSuite(ComposedMBotUndoSetReferenceFlatRefTable.class);
		suite.addTestSuite(ComposedMBotUndoSetReferenceRefTable.class);

		// Redo
		suite.addTestSuite(ComposedMBotRedoAddAdvTableCompo.class);
		//suite.addTestSuite(ComposedMBotRedoSetAttributeCheckbox.class);
		//suite.addTestSuite(ComposedMBotRedoSetAttributeEMFComboViewer.class);
		suite.addTestSuite(ComposedMBotRedoSetAttributeMVE.class);
		//suite.addTestSuite(ComposedMBotRedoSetAttributeText.class);
		suite.addTestSuite(ComposedMBotRedoSetAttributeTextArea.class);
		//suite.addTestSuite(ComposedMBotRedoSetReferenceAdvRefTable.class);
		suite.addTestSuite(ComposedMBotRedoSetReferenceEOFCV.class);

		suite.addTestSuite(ComposedMBotRedoAddTableCompo.class);
		suite.addTestSuite(ComposedMBotRedoSetAttributeRadio.class);
		suite.addTestSuite(ComposedMBotRedoSetReferenceAEOFCV.class);
		suite.addTestSuite(ComposedMBotRedoSetReferenceCombo.class);
		suite.addTestSuite(ComposedMBotRedoSetReferenceFlatRefTable.class);
		suite.addTestSuite(ComposedMBotRedoSetReferenceRefTable.class);

		// Cancel
		suite.addTestSuite(ComposedMBotCancelAddAdvTableCompo.class);
		suite.addTestSuite(ComposedMBotCancelSetAttributeMVE.class);
		suite.addTestSuite(ComposedMBotCancelSetReferenceAdvRefTable.class);
		suite.addTestSuite(ComposedMBotCancelSetReferenceEOFCV.class);

		suite.addTestSuite(ComposedMBotCancelAddTableCompo.class);
		suite.addTestSuite(ComposedMBotCancelSetReferenceAEOFCV.class);
		suite.addTestSuite(ComposedMBotCancelSetReferenceFlatRefTable.class);
		suite.addTestSuite(ComposedMBotCancelSetReferenceRefTable.class);

		// Edit

		// $JUnit-END$
		return suite;
	}

}
