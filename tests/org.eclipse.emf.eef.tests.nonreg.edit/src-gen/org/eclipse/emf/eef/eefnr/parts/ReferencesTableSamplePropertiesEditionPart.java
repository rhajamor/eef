/*******************************************************************************
 * Copyright (c) 2008, 2012 Obeo.
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
public interface ReferencesTableSamplePropertiesEditionPart {



	/**
	 * Init the referencestableRequiredProperty
	 * @param settings settings for the referencestableRequiredProperty ReferencesTable 
	 */
	public void initReferencestableRequiredProperty(ReferencesTableSettings settings);

	/**
	 * Update the referencestableRequiredProperty
	 * @param newValue the referencestableRequiredProperty to update
	 * 
	 */
	public void updateReferencestableRequiredProperty();

	/**
	 * Adds the given filter to the referencestableRequiredProperty edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToReferencestableRequiredProperty(ViewerFilter filter);

	/**
	 * Adds the given filter to the referencestableRequiredProperty edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToReferencestableRequiredProperty(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the referencestableRequiredProperty table
	 * 
	 */
	public boolean isContainedInReferencestableRequiredPropertyTable(EObject element);




	/**
	 * Init the referencestableOptionalProperty
	 * @param settings settings for the referencestableOptionalProperty ReferencesTable 
	 */
	public void initReferencestableOptionalProperty(ReferencesTableSettings settings);

	/**
	 * Update the referencestableOptionalProperty
	 * @param newValue the referencestableOptionalProperty to update
	 * 
	 */
	public void updateReferencestableOptionalProperty();

	/**
	 * Adds the given filter to the referencestableOptionalProperty edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToReferencestableOptionalProperty(ViewerFilter filter);

	/**
	 * Adds the given filter to the referencestableOptionalProperty edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToReferencestableOptionalProperty(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the referencestableOptionalProperty table
	 * 
	 */
	public boolean isContainedInReferencestableOptionalPropertyTable(EObject element);





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
