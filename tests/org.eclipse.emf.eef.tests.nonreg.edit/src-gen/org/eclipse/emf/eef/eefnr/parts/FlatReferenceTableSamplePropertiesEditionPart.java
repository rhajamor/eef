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
public interface FlatReferenceTableSamplePropertiesEditionPart {



	/**
	 * Init the flatreferencetableRequiredProperty
	 * @param settings settings for the flatreferencetableRequiredProperty ReferencesTable 
	 */
	public void initFlatreferencetableRequiredProperty(ReferencesTableSettings settings);

	/**
	 * Update the flatreferencetableRequiredProperty
	 * @param newValue the flatreferencetableRequiredProperty to update
	 * 
	 */
	public void updateFlatreferencetableRequiredProperty();

	/**
	 * Adds the given filter to the flatreferencetableRequiredProperty edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToFlatreferencetableRequiredProperty(ViewerFilter filter);

	/**
	 * Adds the given filter to the flatreferencetableRequiredProperty edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToFlatreferencetableRequiredProperty(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the flatreferencetableRequiredProperty table
	 * 
	 */
	public boolean isContainedInFlatreferencetableRequiredPropertyTable(EObject element);




	/**
	 * Init the flatreferencetableOptionalProperty
	 * @param settings settings for the flatreferencetableOptionalProperty ReferencesTable 
	 */
	public void initFlatreferencetableOptionalProperty(ReferencesTableSettings settings);

	/**
	 * Update the flatreferencetableOptionalProperty
	 * @param newValue the flatreferencetableOptionalProperty to update
	 * 
	 */
	public void updateFlatreferencetableOptionalProperty();

	/**
	 * Adds the given filter to the flatreferencetableOptionalProperty edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToFlatreferencetableOptionalProperty(ViewerFilter filter);

	/**
	 * Adds the given filter to the flatreferencetableOptionalProperty edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToFlatreferencetableOptionalProperty(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the flatreferencetableOptionalProperty table
	 * 
	 */
	public boolean isContainedInFlatreferencetableOptionalPropertyTable(EObject element);





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
