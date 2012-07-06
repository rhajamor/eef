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
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.conference.MBotRedoSetAttributeTextArea;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.conference.MBotRemoveAdvTableCompo;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.conference.MBotSetAttributeText;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.conference.MBotSetReferenceAdvRefTable;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.conference.MBotSetReferenceAdvRefTable2;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.conference.MBotSetReferenceEOFCV;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.conference.MBotUndoSetAttributeTextArea;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.conference.MBotUnsetMVE;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.conference.MBotUnsetReferenceAdvRefTable;
import org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.conference.MBotUnsetText;

public class AllSWTMBotTests {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test for org.eclipse.emf.samples.tests.junit");
		// $JUnit-BEGIN$
		
		//Set Attribute
		suite.addTestSuite(MBotSetAttributeText.class);
		
		//Set Reference
		suite.addTestSuite(MBotSetReferenceAdvRefTable.class);
		suite.addTestSuite(MBotSetReferenceAdvRefTable2.class);
		suite.addTestSuite(MBotSetReferenceEOFCV.class);
		
		//Unset
		suite.addTestSuite(MBotUnsetMVE.class);
		suite.addTestSuite(MBotUnsetText.class);
		
		//Unset Attribute
		
		//Unset Reference
		suite.addTestSuite(MBotUnsetReferenceAdvRefTable.class);
		
		//Add
		suite.addTestSuite(MBotAddAdvTableCompo.class);
		
		//Remove
		suite.addTestSuite(MBotRemoveAdvTableCompo.class);
		
		//Undo
		suite.addTestSuite(MBotUndoSetAttributeTextArea.class);
		
		//Redo
		suite.addTestSuite(MBotRedoSetAttributeTextArea.class);
		
		//Cancel
		
		//Edit
		
		// $JUnit-END$
		return suite;
	}

}
