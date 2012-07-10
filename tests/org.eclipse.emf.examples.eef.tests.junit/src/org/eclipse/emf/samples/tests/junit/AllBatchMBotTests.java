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
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.conference.BatchMBotRedoSetAttributeTextArea;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.conference.BatchMBotRemoveAdvTableCompo;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.conference.BatchMBotSetAttributeCheckbox;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.conference.BatchMBotSetAttributeEMFComboViewer;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.conference.BatchMBotSetAttributeMVE;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.conference.BatchMBotSetAttributeText;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.conference.BatchMBotSetAttributeTextArea;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.conference.BatchMBotSetReferenceAdvRefTable;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.conference.BatchMBotSetReferenceAdvRefTable2;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.conference.BatchMBotSetReferenceEOFCV;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.conference.BatchMBotUndoSetAttributeTextArea;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.conference.BatchMBotUnsetMVE;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.conference.BatchMBotUnsetReferenceAdvRefTable;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.conference.BatchMBotUnsetText;
import org.eclipse.emf.samples.tests.junit.modelingbot.batch.detailsview.nonreg.BatchMBotSetAttributeRadio;

public class AllBatchMBotTests {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test for org.eclipse.emf.samples.tests.junit");
		// $JUnit-BEGIN$
		
		//Set Attribute
		suite.addTestSuite(BatchMBotSetAttributeCheckbox.class);
		suite.addTestSuite(BatchMBotSetAttributeEMFComboViewer.class);
		suite.addTestSuite(BatchMBotSetAttributeMVE.class);
		suite.addTestSuite(BatchMBotSetAttributeText.class);
		suite.addTestSuite(BatchMBotSetAttributeTextArea.class);
		
		suite.addTestSuite(BatchMBotSetAttributeRadio.class);
		
		//Set Reference
		suite.addTestSuite(BatchMBotSetReferenceAdvRefTable.class);
		suite.addTestSuite(BatchMBotSetReferenceAdvRefTable2.class);
		suite.addTestSuite(BatchMBotSetReferenceEOFCV.class);
		
		//Unset
		suite.addTestSuite(BatchMBotUnsetMVE.class);
		suite.addTestSuite(BatchMBotUnsetText.class);
		
		//Unset Attribute
		
		//Unset Reference
		suite.addTestSuite(BatchMBotUnsetReferenceAdvRefTable.class);
		
		//Add
		suite.addTestSuite(BatchMBotAddAdvTableCompo.class);
		
		//Remove
		suite.addTestSuite(BatchMBotRemoveAdvTableCompo.class);
		
		//Undo
		suite.addTestSuite(BatchMBotUndoSetAttributeTextArea.class);
		
		//Redo
		suite.addTestSuite(BatchMBotRedoSetAttributeTextArea.class);
		
		//Cancel
		
		//Edit
		
		// $JUnit-END$
		return suite;
	}

}
