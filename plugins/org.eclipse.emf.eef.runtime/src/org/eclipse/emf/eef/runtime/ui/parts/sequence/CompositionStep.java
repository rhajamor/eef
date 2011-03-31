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

import java.util.ArrayList;
import java.util.List;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 */
public class CompositionStep {

	public CompositionStep parent;

	public Object key;

	protected List<CompositionStep> subSteps;

	private boolean visibility;

	/**
	 * @param parent
	 *            the containing {@link CompositionSequence}
	 * @param key
	 *            of this Step
	 */
	public CompositionStep(CompositionStep parent, Object key) {
		super();
		this.parent = parent;
		this.key = key;
		subSteps = new ArrayList<CompositionStep>();
		this.visibility = true;
	}

	/**
	 * @return the subSteps
	 */
	public List<CompositionStep> getSubSteps() {
		return subSteps;
	}

	/**
	 * Add a Sub-Step to the sequence.
	 * 
	 * @param key
	 *            the key of the sub step
	 * @return the created {@link CompositionStep}
	 */
	public CompositionStep addStep(Object key) {
		CompositionStep compositionStep = new CompositionStep(this, key);
		subSteps.add(compositionStep);
		return compositionStep;
	}

	/**
	 * Remove a Sub-Step to the sequence.
	 * 
	 * @param key
	 *            the key of the sub step to remove
	 * @return <code>this</code>
	 */
	public CompositionStep removeStep(Object key) {
		for (CompositionStep step : subSteps) {
			if (step.key == key) {
				subSteps.remove(step);
				return this;
			}
		}
		return this;
	}

	/**
	 * @return the visibility
	 */
	public boolean isVisibile() {
		return visibility && (parent == null || parent.isVisibile());
	}

	/**
	 * switch the step visibility
	 */
	public void switchVisibilty() {
		visibility = !visibility;
	}

	/**
	 * @return the next step of the sequence.
	 */
	public CompositionStep next() {
		if (subSteps.isEmpty()) {
			return parent.nextOf(this);
		} else {
			return subSteps.get(0);
		}
	}

	/**
	 * Search the next step following the deep first algorithm
	 * 
	 * @param step
	 *            step search the following
	 * @return the following step for <code>step</code>, <code>null</code> otherwise.
	 */
	protected CompositionStep nextOf(CompositionStep step) {
		if (step == null) {
			return null;
		} else {
			int index = subSteps.indexOf(step);
			if (index >= 0) {
				if (index + 1 < subSteps.size()) {
					return subSteps.get(index + 1);
				} else {
					if (parent != null) {
						return parent.nextOf(this);
					} else {
						return null;
					}
				}
			}
			return null;
		}
	}

	/**
	 * @return the previous step
	 */
	public CompositionStep before() {
		if (parent != null) {
			return parent.beforeOf(this);
		} else {
			return null;
		}

	}

	/**
	 * @param compositionStep
	 */
	private CompositionStep beforeOf(CompositionStep step) {
		if (step == null) {
			return null;
		} else {
			int index = subSteps.indexOf(step);
			if (index >= 0) {
				if (index - 1 >= 0) {
					return subSteps.get(index - 1);
				} else {
					if (parent != null) {
						return parent.beforeOf(this);
					} else {
						return null;
					}
				}
			}
			return null;
		}
	}

	/**
	 * up the step in the sequence
	 */
	public void up() {
		if (parent != null) {
			parent.upStep(this);
		}
	}

	/**
	 * @param step
	 *            the step to up
	 */
	private void upStep(CompositionStep step) {
		if (step != null) {
			int index = subSteps.indexOf(step);
			if (index > 0) {
				subSteps.set(index, subSteps.get(index - 1));
				subSteps.set(index - 1, step);
			}
		}
	}

	/**
	 * down the step in the sequence
	 */
	public void down() {
		if (parent != null) {
			parent.downStep(this);
		}
	}

	/**
	 * @param step
	 *            the step to down
	 */
	private void downStep(CompositionStep step) {
		if (step != null) {
			int index = subSteps.indexOf(step);
			if (index < subSteps.size() - 1) {
				subSteps.set(index, subSteps.get(index + 1));
				subSteps.set(index + 1, step);
			}
		}
	}

	/**
	 * Move the current Step to a new container.
	 * 
	 * @param newParent
	 *            the new container
	 */
	public void moveTo(CompositionStep newParent) {
		if (newParent != null) {
			parent.subSteps.remove(this);
			newParent.subSteps.add(this);
			parent = newParent;
		}
	}

	/**
	 * @param key the concerning key.
	 * @return <code>visibility</code> if the key correspond to the key of the step <code>false</code> otherwise.
	 */
	public boolean isVisible(Object key) {
		if (key == this.key) {
			return isVisibile();
		} else {
			for (CompositionStep step : subSteps) {
				if (step.isVisible(key)) {
					return true;
				}
			}
		}
		return false;
	}

}
