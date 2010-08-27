/**
 * Generated with Acceleo
 */
package org.eclipse.emf.eef.nonreg.parts;

// Start of user code for imports
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.jface.viewers.ViewerFilter;



// End of user code

/**
 * 

 */
public interface TableCompositionPropertiesEditionPart {

	/**
	 * @return the tablecomposition to add
	 * @generated
	 */
	public List getTablecompositionToAdd();

	/**
	 * @return the tablecomposition to remove
	 * @generated
	 */
	public List getTablecompositionToRemove();

	/**
	 * @return the tablecomposition to move
	 * @generated
	 */
	public List getTablecompositionToMove();

	/**
	 * @return the tablecomposition to edit
	 * @generated
	 */
	public Map getTablecompositionToEdit();

	/**
	 * @return the current tablecomposition table
	 * @generated
	 */
	public List getTablecompositionTable();

	/**
	 * Init the tablecomposition
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initTablecomposition(EObject current, EReference containingFeature, EReference feature);

	/**
	 * Update the tablecomposition
	 * @param newValue the tablecomposition to update
	 * @generated
	 */
	public void updateTablecomposition(EObject newValue);

	/**
	 * Adds the given filter to the tablecomposition edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToTablecomposition(ViewerFilter filter);

	/**
	 * Adds the given filter to the tablecomposition edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addBusinessFilterToTablecomposition(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the tablecomposition table
	 * @generated
	 */
	public boolean isContainedInTablecompositionTable(EObject element);


	/**
	 * @return the tablecompositionRO to add
	 * @generated
	 */
	public List getTablecompositionROToAdd();

	/**
	 * @return the tablecompositionRO to remove
	 * @generated
	 */
	public List getTablecompositionROToRemove();

	/**
	 * @return the tablecompositionRO to move
	 * @generated
	 */
	public List getTablecompositionROToMove();

	/**
	 * @return the tablecompositionRO to edit
	 * @generated
	 */
	public Map getTablecompositionROToEdit();

	/**
	 * @return the current tablecompositionRO table
	 * @generated
	 */
	public List getTablecompositionROTable();

	/**
	 * Init the tablecompositionRO
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initTablecompositionRO(EObject current, EReference containingFeature, EReference feature);

	/**
	 * Update the tablecompositionRO
	 * @param newValue the tablecompositionRO to update
	 * @generated
	 */
	public void updateTablecompositionRO(EObject newValue);

	/**
	 * Adds the given filter to the tablecompositionRO edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToTablecompositionRO(ViewerFilter filter);

	/**
	 * Adds the given filter to the tablecompositionRO edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addBusinessFilterToTablecompositionRO(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the tablecompositionRO table
	 * @generated
	 */
	public boolean isContainedInTablecompositionROTable(EObject element);





	/**
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.

	 */
	public String getTitle();

	// Start of user code for additional methods
	
	// End of user code

}
