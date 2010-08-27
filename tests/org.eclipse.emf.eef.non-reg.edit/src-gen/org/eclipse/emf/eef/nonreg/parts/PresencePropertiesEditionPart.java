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
public interface PresencePropertiesEditionPart {

	/**
	 * @return the assists to add
	 * @generated
	 */
	public List getAssistsToAdd();

	/**
	 * @return the assists to remove
	 * @generated
	 */
	public List getAssistsToRemove();

	/**
	 * @return the current assists table
	 * @generated
	 */
	public List getAssistsTable();

	/**
	 * Init the assists
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initAssists(EObject current, EReference containingFeature, EReference feature);

	/**
	 * Update the assists
	 * @param newValue the assists to update
	 * @generated
	 */
	public void updateAssists(EObject newValue);

	/**
	 * Adds the given filter to the assists edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToAssists(ViewerFilter filter);

	/**
	 * Adds the given filter to the assists edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addBusinessFilterToAssists(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the assists table
	 * @generated
	 */
	public boolean isContainedInAssistsTable(EObject element);





	/**
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.

	 */
	public String getTitle();

	// Start of user code for additional methods
	
	// End of user code

}
