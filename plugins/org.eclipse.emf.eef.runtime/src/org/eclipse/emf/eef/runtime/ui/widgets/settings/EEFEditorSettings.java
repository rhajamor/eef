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
package org.eclipse.emf.eef.runtime.ui.widgets.settings;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 */
public interface EEFEditorSettings {

	/**
	 * @return the current value(s) of edited feature
	 */
	Object getValue();

	/**
	 * @param adapterFactory
	 *            adapterFactory to use
	 * @return the possible value for the edited features
	 */
	Object choiceOfValues(AdapterFactory adapterFactory);

	/**
	 * @param feature
	 *            to check
	 * @return <code>true</code> if the given feature is processed by these settings
	 */
	boolean isAffectingFeature(EStructuralFeature feature);

	/**
	 * @return the edited object
	 */
	EObject getSource();

	/**
	 * @return the final type of the settings.
	 */
	EClassifier getEType();

	/**
	 * @return the last reference of the settings
	 */
	EReference getLastReference();
}
