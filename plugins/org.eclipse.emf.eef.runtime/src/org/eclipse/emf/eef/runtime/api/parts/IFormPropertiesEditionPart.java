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
package org.eclipse.emf.eef.runtime.api.parts;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.FormToolkit;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 */
public interface IFormPropertiesEditionPart {

	/**
	 * Create the figure in the specified element.
	 * 
	 * @param parent
	 *            the parent
	 * @return the created view
	 */
	public abstract Composite createFigure(Composite parent, FormToolkit widgetFactory);

	/**
	 * Create all elements of the figure. This method is the stateless way to populate another composite.
	 * 
	 * @param parent
	 * @param widgetFactory
	 */
	public abstract void createControls(FormToolkit widgetFactory, Composite parent);

}
