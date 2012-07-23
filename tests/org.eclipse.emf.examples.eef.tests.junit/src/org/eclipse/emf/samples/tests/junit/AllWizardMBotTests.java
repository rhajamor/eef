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

import org.eclipse.emf.samples.tests.junit.modelingbot.wizard.conference.WizardMBotSetAttributeText;

public class AllWizardMBotTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"Test for org.eclipse.emf.samples.tests.junit");
		// $JUnit-BEGIN$

		// Set Attribute
		suite.addTestSuite(WizardMBotSetAttributeText.class);

		// Set Reference

		// Unset

		// Unset Attribute

		// Unset Reference

		// Add

		// Remove

		// Undo

		// Redo

		// Cancel

		// Edit

		// $JUnit-END$
		return suite;
	}

}
