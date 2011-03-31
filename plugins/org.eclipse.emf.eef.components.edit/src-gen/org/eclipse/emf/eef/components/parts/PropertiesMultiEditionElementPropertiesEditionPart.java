/**
 *  Copyright (c) 2008 - 2011 Obeo.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *      Obeo - initial API and implementation
 *
 */
package org.eclipse.emf.eef.components.parts;

// Start of user code for imports

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;
 

// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public interface PropertiesMultiEditionElementPropertiesEditionPart {

	/**
	 * @return the name
	 * 
	 */
	public String getName();

	/**
	 * Defines a new name
	 * @param newValue the new name to set
	 * 
	 */
	public void setName(String newValue);


	/**
	 * @return the helpID
	 * 
	 */
	public String getHelpID();

	/**
	 * Defines a new helpID
	 * @param newValue the new helpID to set
	 * 
	 */
	public void setHelpID(String newValue);




	/**
	 * Init the model
	 * @param settings settings for the model ReferencesTable 
	 */
	public void initModel(ReferencesTableSettings settings);

	/**
	 * Update the model
	 * @param newValue the model to update
	 * 
	 */
	public void updateModel();

	/**
	 * Adds the given filter to the model edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToModel(ViewerFilter filter);

	/**
	 * Adds the given filter to the model edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToModel(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the model table
	 * 
	 */
	public boolean isContainedInModelTable(EObject element);




	/**
	 * Init the views
	 * @param settings settings for the views ReferencesTable 
	 */
	public void initViews(ReferencesTableSettings settings);

	/**
	 * Update the views
	 * @param newValue the views to update
	 * 
	 */
	public void updateViews();

	/**
	 * Adds the given filter to the views edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToViews(ViewerFilter filter);

	/**
	 * Adds the given filter to the views edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToViews(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the views table
	 * 
	 */
	public boolean isContainedInViewsTable(EObject element);





	/**
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * 
	 */
	public String getTitle();

	// Start of user code for additional methods
 	
// End of user code

}
