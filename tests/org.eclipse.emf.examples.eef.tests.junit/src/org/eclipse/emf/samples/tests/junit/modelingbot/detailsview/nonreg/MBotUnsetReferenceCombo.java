/*******************************************************************************
 * Copyright (c) 2011, 2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.samples.tests.junit.modelingbot.detailsview.nonreg;

/**
 * @author arichard
 */
public class MBotUnsetReferenceCombo extends org.eclipse.emf.eef.modelingBot.testcase.AbstractSWTBotModelingBotTestCase {

	public void testModelingBot() throws Exception {
		bot.runModelingBot("org.eclipse.emf.examples.eef.tests.junit/models/modelingbot/details_view_nonreg/unsetReferenceCombo.modelingbot");
	}

}
