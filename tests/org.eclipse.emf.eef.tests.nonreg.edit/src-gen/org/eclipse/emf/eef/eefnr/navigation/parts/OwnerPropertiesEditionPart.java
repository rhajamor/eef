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
package org.eclipse.emf.eef.eefnr.navigation.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;



// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public interface OwnerPropertiesEditionPart {

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
	 * Init the multipleSampleForTableComposition
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initMultipleSampleForTableComposition(ReferencesTableSettings settings);

	/**
	 * Update the multipleSampleForTableComposition
	 * @param newValue the multipleSampleForTableComposition to update
	 * 
	 */
	public void updateMultipleSampleForTableComposition();

	/**
	 * Adds the given filter to the multipleSampleForTableComposition edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToMultipleSampleForTableComposition(ViewerFilter filter);

	/**
	 * Adds the given filter to the multipleSampleForTableComposition edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToMultipleSampleForTableComposition(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the multipleSampleForTableComposition table
	 * 
	 */
	public boolean isContainedInMultipleSampleForTableCompositionTable(EObject element);




	/**
	 * Init the multipleSampleForAdvancedTableComposition
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initMultipleSampleForAdvancedTableComposition(ReferencesTableSettings settings);

	/**
	 * Update the multipleSampleForAdvancedTableComposition
	 * @param newValue the multipleSampleForAdvancedTableComposition to update
	 * 
	 */
	public void updateMultipleSampleForAdvancedTableComposition();

	/**
	 * Adds the given filter to the multipleSampleForAdvancedTableComposition edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToMultipleSampleForAdvancedTableComposition(ViewerFilter filter);

	/**
	 * Adds the given filter to the multipleSampleForAdvancedTableComposition edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToMultipleSampleForAdvancedTableComposition(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the multipleSampleForAdvancedTableComposition table
	 * 
	 */
	public boolean isContainedInMultipleSampleForAdvancedTableCompositionTable(EObject element);




	/**
	 * Init the multipleSampleForReferencesTable
	 * @param settings settings for the multipleSampleForReferencesTable ReferencesTable 
	 */
	public void initMultipleSampleForReferencesTable(ReferencesTableSettings settings);

	/**
	 * Update the multipleSampleForReferencesTable
	 * @param newValue the multipleSampleForReferencesTable to update
	 * 
	 */
	public void updateMultipleSampleForReferencesTable();

	/**
	 * Adds the given filter to the multipleSampleForReferencesTable edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToMultipleSampleForReferencesTable(ViewerFilter filter);

	/**
	 * Adds the given filter to the multipleSampleForReferencesTable edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToMultipleSampleForReferencesTable(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the multipleSampleForReferencesTable table
	 * 
	 */
	public boolean isContainedInMultipleSampleForReferencesTableTable(EObject element);




	/**
	 * Init the multipleSampleForAdvancedReferencesTable
	 * @param settings settings for the multipleSampleForAdvancedReferencesTable ReferencesTable 
	 */
	public void initMultipleSampleForAdvancedReferencesTable(ReferencesTableSettings settings);

	/**
	 * Update the multipleSampleForAdvancedReferencesTable
	 * @param newValue the multipleSampleForAdvancedReferencesTable to update
	 * 
	 */
	public void updateMultipleSampleForAdvancedReferencesTable();

	/**
	 * Adds the given filter to the multipleSampleForAdvancedReferencesTable edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToMultipleSampleForAdvancedReferencesTable(ViewerFilter filter);

	/**
	 * Adds the given filter to the multipleSampleForAdvancedReferencesTable edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToMultipleSampleForAdvancedReferencesTable(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the multipleSampleForAdvancedReferencesTable table
	 * 
	 */
	public boolean isContainedInMultipleSampleForAdvancedReferencesTableTable(EObject element);




	/**
	 * Init the multipleSampleForFlatReferencesTable
	 * @param settings settings for the multipleSampleForFlatReferencesTable ReferencesTable 
	 */
	public void initMultipleSampleForFlatReferencesTable(ReferencesTableSettings settings);

	/**
	 * Update the multipleSampleForFlatReferencesTable
	 * @param newValue the multipleSampleForFlatReferencesTable to update
	 * 
	 */
	public void updateMultipleSampleForFlatReferencesTable();

	/**
	 * Adds the given filter to the multipleSampleForFlatReferencesTable edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToMultipleSampleForFlatReferencesTable(ViewerFilter filter);

	/**
	 * Adds the given filter to the multipleSampleForFlatReferencesTable edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToMultipleSampleForFlatReferencesTable(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the multipleSampleForFlatReferencesTable table
	 * 
	 */
	public boolean isContainedInMultipleSampleForFlatReferencesTableTable(EObject element);




	/**
	 * Init the singleSampleForTableComposition
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initSingleSampleForTableComposition(ReferencesTableSettings settings);

	/**
	 * Update the singleSampleForTableComposition
	 * @param newValue the singleSampleForTableComposition to update
	 * 
	 */
	public void updateSingleSampleForTableComposition();

	/**
	 * Adds the given filter to the singleSampleForTableComposition edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSingleSampleForTableComposition(ViewerFilter filter);

	/**
	 * Adds the given filter to the singleSampleForTableComposition edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSingleSampleForTableComposition(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the singleSampleForTableComposition table
	 * 
	 */
	public boolean isContainedInSingleSampleForTableCompositionTable(EObject element);




	/**
	 * Init the singleSampleForAdvancedTableComposition
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initSingleSampleForAdvancedTableComposition(ReferencesTableSettings settings);

	/**
	 * Update the singleSampleForAdvancedTableComposition
	 * @param newValue the singleSampleForAdvancedTableComposition to update
	 * 
	 */
	public void updateSingleSampleForAdvancedTableComposition();

	/**
	 * Adds the given filter to the singleSampleForAdvancedTableComposition edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSingleSampleForAdvancedTableComposition(ViewerFilter filter);

	/**
	 * Adds the given filter to the singleSampleForAdvancedTableComposition edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSingleSampleForAdvancedTableComposition(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the singleSampleForAdvancedTableComposition table
	 * 
	 */
	public boolean isContainedInSingleSampleForAdvancedTableCompositionTable(EObject element);




	/**
	 * Init the singleSampleForReferencesTable
	 * @param settings settings for the singleSampleForReferencesTable ReferencesTable 
	 */
	public void initSingleSampleForReferencesTable(ReferencesTableSettings settings);

	/**
	 * Update the singleSampleForReferencesTable
	 * @param newValue the singleSampleForReferencesTable to update
	 * 
	 */
	public void updateSingleSampleForReferencesTable();

	/**
	 * Adds the given filter to the singleSampleForReferencesTable edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSingleSampleForReferencesTable(ViewerFilter filter);

	/**
	 * Adds the given filter to the singleSampleForReferencesTable edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSingleSampleForReferencesTable(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the singleSampleForReferencesTable table
	 * 
	 */
	public boolean isContainedInSingleSampleForReferencesTableTable(EObject element);




	/**
	 * Init the singleSampleForAdvancedReferencesTable
	 * @param settings settings for the singleSampleForAdvancedReferencesTable ReferencesTable 
	 */
	public void initSingleSampleForAdvancedReferencesTable(ReferencesTableSettings settings);

	/**
	 * Update the singleSampleForAdvancedReferencesTable
	 * @param newValue the singleSampleForAdvancedReferencesTable to update
	 * 
	 */
	public void updateSingleSampleForAdvancedReferencesTable();

	/**
	 * Adds the given filter to the singleSampleForAdvancedReferencesTable edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSingleSampleForAdvancedReferencesTable(ViewerFilter filter);

	/**
	 * Adds the given filter to the singleSampleForAdvancedReferencesTable edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSingleSampleForAdvancedReferencesTable(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the singleSampleForAdvancedReferencesTable table
	 * 
	 */
	public boolean isContainedInSingleSampleForAdvancedReferencesTableTable(EObject element);




	/**
	 * Init the singleSampleForFlatReferencesTable
	 * @param settings settings for the singleSampleForFlatReferencesTable ReferencesTable 
	 */
	public void initSingleSampleForFlatReferencesTable(ReferencesTableSettings settings);

	/**
	 * Update the singleSampleForFlatReferencesTable
	 * @param newValue the singleSampleForFlatReferencesTable to update
	 * 
	 */
	public void updateSingleSampleForFlatReferencesTable();

	/**
	 * Adds the given filter to the singleSampleForFlatReferencesTable edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSingleSampleForFlatReferencesTable(ViewerFilter filter);

	/**
	 * Adds the given filter to the singleSampleForFlatReferencesTable edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSingleSampleForFlatReferencesTable(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the singleSampleForFlatReferencesTable table
	 * 
	 */
	public boolean isContainedInSingleSampleForFlatReferencesTableTable(EObject element);


	/**
	 * @return the singleContainmentForEObjectFlatComboViewer
	 * 
	 */
	public EObject getSingleContainmentForEObjectFlatComboViewer();

	/**
	 * Init the singleContainmentForEObjectFlatComboViewer
	 * @param settings the combo setting
	 */
	public void initSingleContainmentForEObjectFlatComboViewer(EObjectFlatComboSettings settings);

	/**
	 * Defines a new singleContainmentForEObjectFlatComboViewer
	 * @param newValue the new singleContainmentForEObjectFlatComboViewer to set
	 * 
	 */
	public void setSingleContainmentForEObjectFlatComboViewer(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setSingleContainmentForEObjectFlatComboViewerButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the singleContainmentForEObjectFlatComboViewer edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSingleContainmentForEObjectFlatComboViewer(ViewerFilter filter);

	/**
	 * Adds the given filter to the singleContainmentForEObjectFlatComboViewer edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSingleContainmentForEObjectFlatComboViewer(ViewerFilter filter);


	/**
	 * @return the singleReferencesForEObjectFlatComboViewer
	 * 
	 */
	public EObject getSingleReferencesForEObjectFlatComboViewer();

	/**
	 * Init the singleReferencesForEObjectFlatComboViewer
	 * @param settings the combo setting
	 */
	public void initSingleReferencesForEObjectFlatComboViewer(EObjectFlatComboSettings settings);

	/**
	 * Defines a new singleReferencesForEObjectFlatComboViewer
	 * @param newValue the new singleReferencesForEObjectFlatComboViewer to set
	 * 
	 */
	public void setSingleReferencesForEObjectFlatComboViewer(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setSingleReferencesForEObjectFlatComboViewerButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the singleReferencesForEObjectFlatComboViewer edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSingleReferencesForEObjectFlatComboViewer(ViewerFilter filter);

	/**
	 * Adds the given filter to the singleReferencesForEObjectFlatComboViewer edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSingleReferencesForEObjectFlatComboViewer(ViewerFilter filter);


	/**
	 * @return the singleContainmentForAdvancedEObjectFlatComboViewer
	 * 
	 */
	public EObject getSingleContainmentForAdvancedEObjectFlatComboViewer();

	/**
	 * Init the singleContainmentForAdvancedEObjectFlatComboViewer
	 * @param settings the combo setting
	 */
	public void initSingleContainmentForAdvancedEObjectFlatComboViewer(EObjectFlatComboSettings settings);

	/**
	 * Defines a new singleContainmentForAdvancedEObjectFlatComboViewer
	 * @param newValue the new singleContainmentForAdvancedEObjectFlatComboViewer to set
	 * 
	 */
	public void setSingleContainmentForAdvancedEObjectFlatComboViewer(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setSingleContainmentForAdvancedEObjectFlatComboViewerButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the singleContainmentForAdvancedEObjectFlatComboViewer edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSingleContainmentForAdvancedEObjectFlatComboViewer(ViewerFilter filter);

	/**
	 * Adds the given filter to the singleContainmentForAdvancedEObjectFlatComboViewer edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSingleContainmentForAdvancedEObjectFlatComboViewer(ViewerFilter filter);


	/**
	 * @return the singleReferencesForAdvancedEObjectFlatComboViewer
	 * 
	 */
	public EObject getSingleReferencesForAdvancedEObjectFlatComboViewer();

	/**
	 * Init the singleReferencesForAdvancedEObjectFlatComboViewer
	 * @param settings the combo setting
	 */
	public void initSingleReferencesForAdvancedEObjectFlatComboViewer(EObjectFlatComboSettings settings);

	/**
	 * Defines a new singleReferencesForAdvancedEObjectFlatComboViewer
	 * @param newValue the new singleReferencesForAdvancedEObjectFlatComboViewer to set
	 * 
	 */
	public void setSingleReferencesForAdvancedEObjectFlatComboViewer(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setSingleReferencesForAdvancedEObjectFlatComboViewerButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the singleReferencesForAdvancedEObjectFlatComboViewer edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSingleReferencesForAdvancedEObjectFlatComboViewer(ViewerFilter filter);

	/**
	 * Adds the given filter to the singleReferencesForAdvancedEObjectFlatComboViewer edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSingleReferencesForAdvancedEObjectFlatComboViewer(ViewerFilter filter);





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
