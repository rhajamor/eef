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
package org.eclipse.emf.samples.conference.tests.junit.modelingbot;

import org.eclipse.emf.eef.modelingBot.testcase.AbstractComposedModelingBotTestCase;

/**
 * @author <a href="goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 */
public class ConferenceModelingBotTestCase extends AbstractComposedModelingBotTestCase {

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.modelingBot.testcase.AbstractComposedModelingBotTestCase#testModelingBot()
	 */
	public void testModelingBot() throws Exception {
		composedBot
				.runModelingBot("org.eclipse.emf.examples.eef.tests.junit/models/modelingbot/conference.modelingbot");
	}

}
