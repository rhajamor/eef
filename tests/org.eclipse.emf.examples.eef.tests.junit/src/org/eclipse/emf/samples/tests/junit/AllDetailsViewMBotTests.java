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

import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.conference.MBotAddAdvTableCompo;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.conference.MBotCancelAddAdvTableCompo;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.conference.MBotCancelSetAttributeMVE;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.conference.MBotCancelSetReferenceAdvRefTable;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.conference.MBotCancelSetReferenceEOFCV;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.conference.MBotRedoAddAdvTableCompo;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.conference.MBotRedoSetAttributeCheckbox;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.conference.MBotRedoSetAttributeEMFComboViewer;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.conference.MBotRedoSetAttributeMVE;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.conference.MBotRedoSetAttributeText;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.conference.MBotRedoSetAttributeTextArea;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.conference.MBotRedoSetReferenceAdvRefTable;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.conference.MBotRedoSetReferenceEOFCV;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.conference.MBotRemoveAdvTableCompo;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.conference.MBotSetAttributeCheckbox;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.conference.MBotSetAttributeEMFComboViewer;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.conference.MBotSetAttributeMVE;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.conference.MBotSetAttributeText;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.conference.MBotSetAttributeTextArea;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.conference.MBotSetReferenceAdvRefTable;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.conference.MBotSetReferenceAdvRefTable2;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.conference.MBotSetReferenceEOFCV;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.conference.MBotUndoAddAdvTableCompo;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.conference.MBotUndoSetAttributeCheckbox;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.conference.MBotUndoSetAttributeEMFComboViewer;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.conference.MBotUndoSetAttributeMVE;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.conference.MBotUndoSetAttributeText;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.conference.MBotUndoSetAttributeTextArea;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.conference.MBotUndoSetReferenceAdvRefTable;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.conference.MBotUndoSetReferenceEOFCV;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.conference.MBotUnsetAdvRefTable;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.conference.MBotUnsetAttributeMVE;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.conference.MBotUnsetAttributeText;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.conference.MBotUnsetAttributeTextArea;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.conference.MBotUnsetMVE;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.conference.MBotUnsetReferenceAdvRefTable;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.conference.MBotUnsetText;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.conference.MBotUnsetTextArea;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.nonreg.MBotAddAdvTableCompoOnAbstractRef;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.nonreg.MBotAddTableCompo;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.nonreg.MBotCancelAddTableCompo;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.nonreg.MBotCancelSetReferenceAEOFCV;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.nonreg.MBotCancelSetReferenceFlatRefTable;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.nonreg.MBotCancelSetReferenceRefTable;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.nonreg.MBotRedoAddTableCompo;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.nonreg.MBotRedoSetAttributeRadio;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.nonreg.MBotRedoSetReferenceAEOFCV;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.nonreg.MBotRedoSetReferenceCombo;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.nonreg.MBotRedoSetReferenceFlatRefTable;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.nonreg.MBotRedoSetReferenceRefTable;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.nonreg.MBotRemoveTableCompo;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.nonreg.MBotSetAttributeRadio;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.nonreg.MBotSetReferenceAEOFCV;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.nonreg.MBotSetReferenceCombo;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.nonreg.MBotSetReferenceFlatRefTable;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.nonreg.MBotSetReferenceRefTable;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.nonreg.MBotUndoAddTableCompo;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.nonreg.MBotUndoSetAttributeRadio;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.nonreg.MBotUndoSetReferenceAEOFCV;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.nonreg.MBotUndoSetReferenceCombo;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.nonreg.MBotUndoSetReferenceFlatRefTable;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.nonreg.MBotUndoSetReferenceRefTable;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.nonreg.MBotUnsetAEOFCV;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.nonreg.MBotUnsetCombo;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.nonreg.MBotUnsetEOFCV;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.nonreg.MBotUnsetFlatRefTable;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.nonreg.MBotUnsetRefTable;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.nonreg.MBotUnsetReferenceAEOFCV;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.nonreg.MBotUnsetReferenceCombo;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.nonreg.MBotUnsetReferenceEOFCV;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.nonreg.MBotUnsetReferenceFlatRefTable;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.nonreg.MBotUnsetReferenceRefTable;

public class AllDetailsViewMBotTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"Test for org.eclipse.emf.samples.tests.junit");
		// $JUnit-BEGIN$

		// Set Attribute
		suite.addTestSuite(MBotSetAttributeCheckbox.class);
		suite.addTestSuite(MBotSetAttributeEMFComboViewer.class);
		suite.addTestSuite(MBotSetAttributeMVE.class);
		suite.addTestSuite(MBotSetAttributeText.class);
		suite.addTestSuite(MBotSetAttributeTextArea.class);

		suite.addTestSuite(MBotSetAttributeRadio.class);

		// Set Reference
		suite.addTestSuite(MBotSetReferenceAdvRefTable.class);
		suite.addTestSuite(MBotSetReferenceAdvRefTable2.class);
		suite.addTestSuite(MBotSetReferenceEOFCV.class);

		suite.addTestSuite(MBotSetReferenceAEOFCV.class);
		suite.addTestSuite(MBotSetReferenceCombo.class);
		suite.addTestSuite(MBotSetReferenceFlatRefTable.class);
		suite.addTestSuite(MBotSetReferenceRefTable.class);

		// Unset
		suite.addTestSuite(MBotUnsetAdvRefTable.class);
		suite.addTestSuite(MBotUnsetMVE.class);
		suite.addTestSuite(MBotUnsetText.class);
		suite.addTestSuite(MBotUnsetTextArea.class);

		suite.addTestSuite(MBotUnsetAEOFCV.class);
		suite.addTestSuite(MBotUnsetCombo.class);
		suite.addTestSuite(MBotUnsetEOFCV.class);
		suite.addTestSuite(MBotUnsetFlatRefTable.class);
		suite.addTestSuite(MBotUnsetRefTable.class);

		// Unset Attribute
		suite.addTestSuite(MBotUnsetAttributeMVE.class);
		suite.addTestSuite(MBotUnsetAttributeText.class);
		suite.addTestSuite(MBotUnsetAttributeTextArea.class);

		// Unset Reference
		suite.addTestSuite(MBotUnsetReferenceAdvRefTable.class);

		suite.addTestSuite(MBotUnsetReferenceAEOFCV.class);
		suite.addTestSuite(MBotUnsetReferenceCombo.class);
		suite.addTestSuite(MBotUnsetReferenceEOFCV.class);
		suite.addTestSuite(MBotUnsetReferenceFlatRefTable.class);
		suite.addTestSuite(MBotUnsetReferenceRefTable.class);

		// Add
		suite.addTestSuite(MBotAddAdvTableCompo.class);

		suite.addTestSuite(MBotAddAdvTableCompoOnAbstractRef.class);
		suite.addTestSuite(MBotAddTableCompo.class);

		// Remove
		suite.addTestSuite(MBotRemoveAdvTableCompo.class);

		suite.addTestSuite(MBotRemoveTableCompo.class);

		// Undo
		suite.addTestSuite(MBotUndoAddAdvTableCompo.class);
		suite.addTestSuite(MBotUndoSetAttributeCheckbox.class);
		suite.addTestSuite(MBotUndoSetAttributeEMFComboViewer.class);
		suite.addTestSuite(MBotUndoSetAttributeMVE.class);
		suite.addTestSuite(MBotUndoSetAttributeText.class);
		suite.addTestSuite(MBotUndoSetAttributeTextArea.class);
		suite.addTestSuite(MBotUndoSetReferenceAdvRefTable.class);
		suite.addTestSuite(MBotUndoSetReferenceEOFCV.class);

		suite.addTestSuite(MBotUndoAddTableCompo.class);
		suite.addTestSuite(MBotUndoSetAttributeRadio.class);
		suite.addTestSuite(MBotUndoSetReferenceAEOFCV.class);
		suite.addTestSuite(MBotUndoSetReferenceCombo.class);
		suite.addTestSuite(MBotUndoSetReferenceFlatRefTable.class);
		suite.addTestSuite(MBotUndoSetReferenceRefTable.class);

		// Redo
		suite.addTestSuite(MBotRedoAddAdvTableCompo.class);
		suite.addTestSuite(MBotRedoSetAttributeCheckbox.class);
		suite.addTestSuite(MBotRedoSetAttributeEMFComboViewer.class);
		suite.addTestSuite(MBotRedoSetAttributeMVE.class);
		suite.addTestSuite(MBotRedoSetAttributeText.class);
		suite.addTestSuite(MBotRedoSetAttributeTextArea.class);
		suite.addTestSuite(MBotRedoSetReferenceAdvRefTable.class);
		suite.addTestSuite(MBotRedoSetReferenceEOFCV.class);

		suite.addTestSuite(MBotRedoAddTableCompo.class);
		suite.addTestSuite(MBotRedoSetAttributeRadio.class);
		suite.addTestSuite(MBotRedoSetReferenceAEOFCV.class);
		suite.addTestSuite(MBotRedoSetReferenceCombo.class);
		suite.addTestSuite(MBotRedoSetReferenceFlatRefTable.class);
		suite.addTestSuite(MBotRedoSetReferenceRefTable.class);

		// Cancel
		suite.addTestSuite(MBotCancelAddAdvTableCompo.class);
		suite.addTestSuite(MBotCancelSetAttributeMVE.class);
		suite.addTestSuite(MBotCancelSetReferenceAdvRefTable.class);
		suite.addTestSuite(MBotCancelSetReferenceEOFCV.class);

		suite.addTestSuite(MBotCancelAddTableCompo.class);
		suite.addTestSuite(MBotCancelSetReferenceAEOFCV.class);
		suite.addTestSuite(MBotCancelSetReferenceFlatRefTable.class);
		suite.addTestSuite(MBotCancelSetReferenceRefTable.class);

		// Edit

		// $JUnit-END$
		return suite;
	}

}
