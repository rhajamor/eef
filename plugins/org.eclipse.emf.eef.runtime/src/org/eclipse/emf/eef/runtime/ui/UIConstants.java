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
package org.eclipse.emf.eef.runtime.ui;

import org.eclipse.swt.graphics.Point;

/**
 * List of UI constants used by EEF
 * 
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 */
public interface UIConstants {

	/**
	 * Defines the initial size for the Editing wizard.
	 */
	Point INITIAL_WIZARD_SIZE = new Point(650, 800);

	/**
	 * Defines the constant for an unknown EEF representation type.
	 */
	String UNKNOW_EEF_TYPE = "unknown eef type";

	/**
	 * Defines the key for the EEF widgets id.
	 */
	String EEF_WIDGET_ID_KEY = "org.eclipse.emf.eef.widgets.id";

	/**
	 * Defines the key for the EEF widgets type.
	 */
	String EEF_WIDGET_TYPE_KEY = "org.eclipse.emf.eef.widgets.type";
}
