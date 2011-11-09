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
package org.eclipse.emf.eef.eefnr.navigation.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;




// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public interface DeferedFlatReferencesTableSamplePropertiesEditionPart {

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
	 * Init the flatReferencesTableSampleEditor
	 * @param settings settings for the flatReferencesTableSampleEditor ReferencesTable 
	 */
	public void initFlatReferencesTableSampleEditor(ReferencesTableSettings settings);

	/**
	 * Update the flatReferencesTableSampleEditor
	 * @param newValue the flatReferencesTableSampleEditor to update
	 * 
	 */
	public void updateFlatReferencesTableSampleEditor();

	/**
	 * Adds the given filter to the flatReferencesTableSampleEditor edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToFlatReferencesTableSampleEditor(ViewerFilter filter);

	/**
	 * Adds the given filter to the flatReferencesTableSampleEditor edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToFlatReferencesTableSampleEditor(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the flatReferencesTableSampleEditor table
	 * 
	 */
	public boolean isContainedInFlatReferencesTableSampleEditorTable(EObject element);





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
