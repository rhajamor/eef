/**
 * Generated with Acceleo
 */
package org.eclipse.emf.eef.nonreg.parts;

// Start of user code for imports
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.jface.viewers.ViewerFilter;



// End of user code

/**
 * 

 */
public interface AdvancedReferencesTablePropertiesEditionPart {

	/**
	 * @return the advancedreferencestable to add
	 * @generated
	 */
	public List getAdvancedreferencestableToAdd();

	/**
	 * @return the advancedreferencestable to remove
	 * @generated
	 */
	public List getAdvancedreferencestableToRemove();

	/**
	 * @return the current advancedreferencestable table
	 * @generated
	 */
	public List getAdvancedreferencestableTable();

	/**
	 * Init the advancedreferencestable
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initAdvancedreferencestable(EObject current, EReference containingFeature, EReference feature);

	/**
	 * Update the advancedreferencestable
	 * @param newValue the advancedreferencestable to update
	 * @generated
	 */
	public void updateAdvancedreferencestable(EObject newValue);

	/**
	 * Adds the given filter to the advancedreferencestable edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToAdvancedreferencestable(ViewerFilter filter);

	/**
	 * Adds the given filter to the advancedreferencestable edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addBusinessFilterToAdvancedreferencestable(ViewerFilter filter);
	/**
	 * @return true if the given element is contained inside the advancedreferencestable table
	 * @generated
	 */
	public boolean isContainedInAdvancedreferencestableTable(EObject element);


	/**
	 * @return the advancedreferencestableRO to add
	 * @generated
	 */
	public List getAdvancedreferencestableROToAdd();

	/**
	 * @return the advancedreferencestableRO to remove
	 * @generated
	 */
	public List getAdvancedreferencestableROToRemove();

	/**
	 * @return the current advancedreferencestableRO table
	 * @generated
	 */
	public List getAdvancedreferencestableROTable();

	/**
	 * Init the advancedreferencestableRO
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initAdvancedreferencestableRO(EObject current, EReference containingFeature, EReference feature);

	/**
	 * Update the advancedreferencestableRO
	 * @param newValue the advancedreferencestableRO to update
	 * @generated
	 */
	public void updateAdvancedreferencestableRO(EObject newValue);

	/**
	 * Adds the given filter to the advancedreferencestableRO edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToAdvancedreferencestableRO(ViewerFilter filter);

	/**
	 * Adds the given filter to the advancedreferencestableRO edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addBusinessFilterToAdvancedreferencestableRO(ViewerFilter filter);
	/**
	 * @return true if the given element is contained inside the advancedreferencestableRO table
	 * @generated
	 */
	public boolean isContainedInAdvancedreferencestableROTable(EObject element);





	/**
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.

	 */
	public String getTitle();

	// Start of user code for additional methods
	
	// End of user code

}
