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
public interface TableCompositionEditorSamplePropertiesEditionPart {



	/**
	 * Init the tablecompositionRequiredProperty
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initTablecompositionRequiredProperty(ReferencesTableSettings settings);

	/**
	 * Update the tablecompositionRequiredProperty
	 * @param newValue the tablecompositionRequiredProperty to update
	 * 
	 */
	public void updateTablecompositionRequiredProperty();

	/**
	 * Adds the given filter to the tablecompositionRequiredProperty edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToTablecompositionRequiredProperty(ViewerFilter filter);

	/**
	 * Adds the given filter to the tablecompositionRequiredProperty edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToTablecompositionRequiredProperty(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the tablecompositionRequiredProperty table
	 * 
	 */
	public boolean isContainedInTablecompositionRequiredPropertyTable(EObject element);




	/**
	 * Init the tablecompositionOptionalProperty
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initTablecompositionOptionalProperty(ReferencesTableSettings settings);

	/**
	 * Update the tablecompositionOptionalProperty
	 * @param newValue the tablecompositionOptionalProperty to update
	 * 
	 */
	public void updateTablecompositionOptionalProperty();

	/**
	 * Adds the given filter to the tablecompositionOptionalProperty edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToTablecompositionOptionalProperty(ViewerFilter filter);

	/**
	 * Adds the given filter to the tablecompositionOptionalProperty edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToTablecompositionOptionalProperty(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the tablecompositionOptionalProperty table
	 * 
	 */
	public boolean isContainedInTablecompositionOptionalPropertyTable(EObject element);





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
