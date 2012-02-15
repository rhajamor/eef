/*******************************************************************************
 * Copyright (c) 2009 - 2010 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.eefnr.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;



// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public interface AdvancedReferencesTableSamplePropertiesEditionPart {



	/**
	 * Init the advancedreferencestableRequiredProperty
	 * @param settings settings for the advancedreferencestableRequiredProperty ReferencesTable 
	 */
	public void initAdvancedreferencestableRequiredProperty(ReferencesTableSettings settings);

	/**
	 * Update the advancedreferencestableRequiredProperty
	 * @param newValue the advancedreferencestableRequiredProperty to update
	 * 
	 */
	public void updateAdvancedreferencestableRequiredProperty();

	/**
	 * Adds the given filter to the advancedreferencestableRequiredProperty edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToAdvancedreferencestableRequiredProperty(ViewerFilter filter);

	/**
	 * Adds the given filter to the advancedreferencestableRequiredProperty edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToAdvancedreferencestableRequiredProperty(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the advancedreferencestableRequiredProperty table
	 * 
	 */
	public boolean isContainedInAdvancedreferencestableRequiredPropertyTable(EObject element);




	/**
	 * Init the advancedreferencestableOptionalProperty
	 * @param settings settings for the advancedreferencestableOptionalProperty ReferencesTable 
	 */
	public void initAdvancedreferencestableOptionalProperty(ReferencesTableSettings settings);

	/**
	 * Update the advancedreferencestableOptionalProperty
	 * @param newValue the advancedreferencestableOptionalProperty to update
	 * 
	 */
	public void updateAdvancedreferencestableOptionalProperty();

	/**
	 * Adds the given filter to the advancedreferencestableOptionalProperty edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToAdvancedreferencestableOptionalProperty(ViewerFilter filter);

	/**
	 * Adds the given filter to the advancedreferencestableOptionalProperty edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToAdvancedreferencestableOptionalProperty(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the advancedreferencestableOptionalProperty table
	 * 
	 */
	public boolean isContainedInAdvancedreferencestableOptionalPropertyTable(EObject element);





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
