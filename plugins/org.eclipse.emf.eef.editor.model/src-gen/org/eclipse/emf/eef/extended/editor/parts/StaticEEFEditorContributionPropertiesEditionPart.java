/**
 * Generated with Acceleo
 */
package org.eclipse.emf.eef.extended.editor.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;



// End of user code

/**
 * 
 * 
 */
public interface StaticEEFEditorContributionPropertiesEditionPart {

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
	 * Init the views
	 * @param settings settings for the views ReferencesTable 
	 */
	public void initViews(ReferencesTableSettings settings);

	/**
	 * Update the views
	 * @param newValue the views to update
	 * 
	 */
	public void updateViews();

	/**
	 * Adds the given filter to the views edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToViews(ViewerFilter filter);

	/**
	 * Adds the given filter to the views edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToViews(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the views table
	 * 
	 */
	public boolean isContainedInViewsTable(EObject element);





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
