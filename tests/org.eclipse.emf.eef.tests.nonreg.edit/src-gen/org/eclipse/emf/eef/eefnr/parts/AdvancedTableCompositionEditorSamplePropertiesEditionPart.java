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
public interface AdvancedTableCompositionEditorSamplePropertiesEditionPart {



	/**
	 * Init the advancedtablecompositionRequiredProperty
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initAdvancedtablecompositionRequiredProperty(ReferencesTableSettings settings);

	/**
	 * Update the advancedtablecompositionRequiredProperty
	 * @param newValue the advancedtablecompositionRequiredProperty to update
	 * 
	 */
	public void updateAdvancedtablecompositionRequiredProperty();

	/**
	 * Adds the given filter to the advancedtablecompositionRequiredProperty edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToAdvancedtablecompositionRequiredProperty(ViewerFilter filter);

	/**
	 * Adds the given filter to the advancedtablecompositionRequiredProperty edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToAdvancedtablecompositionRequiredProperty(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the advancedtablecompositionRequiredProperty table
	 * 
	 */
	public boolean isContainedInAdvancedtablecompositionRequiredPropertyTable(EObject element);




	/**
	 * Init the advancedtablecompositionOptionalProperty
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initAdvancedtablecompositionOptionalProperty(ReferencesTableSettings settings);

	/**
	 * Update the advancedtablecompositionOptionalProperty
	 * @param newValue the advancedtablecompositionOptionalProperty to update
	 * 
	 */
	public void updateAdvancedtablecompositionOptionalProperty();

	/**
	 * Adds the given filter to the advancedtablecompositionOptionalProperty edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToAdvancedtablecompositionOptionalProperty(ViewerFilter filter);

	/**
	 * Adds the given filter to the advancedtablecompositionOptionalProperty edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToAdvancedtablecompositionOptionalProperty(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the advancedtablecompositionOptionalProperty table
	 * 
	 */
	public boolean isContainedInAdvancedtablecompositionOptionalPropertyTable(EObject element);





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
