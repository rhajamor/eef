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

import org.eclipse.emf.samples.tests.junit.modelingbot.ComposedBotModelingTestCase;
import org.eclipse.emf.samples.tests.junit.modelingbot.ConferenceModelingBotTestCase;
import org.eclipse.emf.samples.tests.junit.modelingbot.SWTBotModelingTestCase;
import org.eclipse.emf.samples.tests.junit.modelingbot.SWTBotModelingTestCase2;
import org.eclipse.emf.samples.tests.junit.modelingbot.SWTBotModelingTestCase3;
import org.eclipse.emf.samples.tests.junit.modelingbot.SiteModelingBotTestCase;

public class AllModelingBotTests {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test for modeling bot on Conference");
		// $JUnit-BEGIN$
		suite.addTestSuite(ConferenceModelingBotTestCase.class);
		suite.addTestSuite(SiteModelingBotTestCase.class);
		suite.addTestSuite(ComposedBotModelingTestCase.class);
		suite.addTestSuite(SWTBotModelingTestCase.class);
		suite.addTestSuite(SWTBotModelingTestCase2.class);
		suite.addTestSuite(SWTBotModelingTestCase3.class);
		// $JUnit-END$
		return suite;
	}

}
