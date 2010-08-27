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
public interface EclipseSummitPropertiesEditionPart {

	/**
	 * @return the place
	 * @generated
	 */
	public String getPlace();

	/**
	 * Defines a new place
	 * @param newValue the new place to set
	 * @generated
	 */
	public void setPlace(String newValue);


	/**
	 * @return the sites to add
	 * @generated
	 */
	public List getSitesToAdd();

	/**
	 * @return the sites to remove
	 * @generated
	 */
	public List getSitesToRemove();

	/**
	 * @return the sites to move
	 * @generated
	 */
	public List getSitesToMove();

	/**
	 * @return the sites to edit
	 * @generated
	 */
	public Map getSitesToEdit();

	/**
	 * @return the current sites table
	 * @generated
	 */
	public List getSitesTable();

	/**
	 * Init the sites
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initSites(EObject current, EReference containingFeature, EReference feature);

	/**
	 * Update the sites
	 * @param newValue the sites to update
	 * @generated
	 */
	public void updateSites(EObject newValue);

	/**
	 * Adds the given filter to the sites edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToSites(ViewerFilter filter);

	/**
	 * Adds the given filter to the sites edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addBusinessFilterToSites(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the sites table
	 * @generated
	 */
	public boolean isContainedInSitesTable(EObject element);





	/**
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.

	 */
	public String getTitle();

	// Start of user code for additional methods
	
	// End of user code

}
