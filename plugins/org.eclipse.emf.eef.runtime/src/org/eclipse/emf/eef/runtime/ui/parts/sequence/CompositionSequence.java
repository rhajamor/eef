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
package org.eclipse.emf.eef.runtime.ui.parts.sequence;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 */
public class CompositionSequence extends CompositionStep {

	public static final String START_SEQUENCE_ID = "start";

	/**
	 * A start point composition sequence with default ID
	 */
	public CompositionSequence() {
		super(null, START_SEQUENCE_ID);
	}

	/**
	 * A sub sequence
	 */
	public CompositionSequence(CompositionStep parent, Object id) {
		super(parent, id);
	}

}
