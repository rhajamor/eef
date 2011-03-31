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
package org.eclipse.emf.eef.runtime.ui.parts;

import java.util.List;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.swt.widgets.Composite;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 */
public abstract class PartComposer {

	private CompositionStep compositionSequence;

	/**
	 * Default constructor. The composition sequence is empty.
	 */
	public PartComposer(CompositionStep sequence) {
		compositionSequence = sequence;
	}

	/**
	 * @return the compositionSequence
	 */
	public CompositionStep getCompositionSequence() {
		return compositionSequence;
	}

	/**
	 * Compose the part.
	 * 
	 * @param parent
	 *            the view where to compose the part
	 */
	public void compose(Composite parent) {
		List<CompositionStep> subSteps = compositionSequence.getSubSteps();
		if (!subSteps.isEmpty()) {
			for (CompositionStep compositionStep : subSteps) {
				composeDelegate(parent, compositionStep);
			}
		}
	}

	/**
	 * Compose the part.
	 * 
	 * @param parent
	 *            the view where to compose the part
	 */
	protected void composeDelegate(Composite parent, CompositionStep step) {
		if (step.isVisibile()) {
			Composite currentContainer = addToPart(parent, step.key);
			List<CompositionStep> subSteps = step.getSubSteps();
			if (!subSteps.isEmpty()) {
				for (CompositionStep compositionStep : subSteps) {
					composeDelegate(currentContainer, compositionStep);
				}
			}
		}
	}

	/**
	 * @return <code>true</code> if the Editor associated to the key is visible.
	 */
	public boolean isVisible(Object key) {
		if (compositionSequence != null) {
			return compositionSequence.isVisible(key);
		}
		return false;
	}
	
	/**
	 * Ask for subclasses to instantiate the element with key {@code key} in the given parent.
	 * 
	 * @param parent
	 *            the element parent
	 * @param key
	 *            the element
	 */
	public abstract Composite addToPart(Composite parent, Object key);
}
