/*******************************************************************************
 * Copyright (c) 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.runtime.ui.editors.pages;

import org.eclipse.emf.eef.runtime.ui.viewers.PropertiesEditionViewer;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.ViewerFilter;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 *
 */
public interface EEFEditorPage {

	/**
	 * @return the main viewer of the page (where the filters are added).
	 */
	StructuredViewer getModelViewer();
	
	/**
	 * Defines the page input.
	 * @param input page input
	 */
	void setInput(Object input);
	
	/**
	 * Add a filter to the most appropriated {@link PropertiesEditionViewer}.
	 * @param filter the filter to add
	 */
	void addFilter(ViewerFilter filter);
	
	/**
	 * Add an action to the page.
	 * @param action action to add.
	 */
	public void addAction(Action action);
	
	/**
	 * Defines the page title.
	 * @param pageTitle page title
	 */
	void setPageTitle(String pageTitle);
	
	/**
	 * @return the {@link PropertiesEditionViewer} dedicated to properties editing.
	 */
	PropertiesEditionViewer getPropertiesViewer();
	
}
