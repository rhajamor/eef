/*******************************************************************************
 * Copyright (c) 2008, 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.modelingBot.testcase;

import junit.framework.TestCase;

import org.eclipse.emf.eef.modelingBot.batch.BatchModelingBot;
import org.eclipse.swtbot.eclipse.finder.SWTBotEclipseTestCase;

/**
 * Batch modeling test case with BatchModelingBot.
 * 
 * @author arichard</a>
 */
public abstract class AbstractBatchModelingBotTestCase extends TestCase {

	/**
	 * An instance of SWTEclipseBot.
	 */
	protected BatchModelingBot bot = new BatchModelingBot();

	/**
	 * {@inheritDoc}
	 * 
	 * @see junit.framework.TestCase#setUp()
	 */
	public void setUp() throws Exception {
		
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	/**
	 * Test method. call <code>bot.runModelingBot("project/path.to/model.modelingbot");</code>
	 * 
	 * @throws Exception if any exception is thrown
	 */
	public abstract void testModelingBot() throws Exception;
	
}
