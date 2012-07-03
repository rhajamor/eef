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
package org.eclipse.emf.samples.conference.tests.junit;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test for org.eclipse.emf.samples.conference.tests.junit");
		// $JUnit-BEGIN$
//		suite.addTestSuite(TalkTestCase.class);
//		suite.addTestSuite(ConferenceTestCase.class);
//		suite.addTestSuite(SiteTestCase.class);
//		suite.addTestSuite(TopicTestCase.class);
//		suite.addTestSuite(PersonTestCase.class);
		// $JUnit-END$
		return suite;
	}

}
