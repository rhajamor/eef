/**
 * Generated with Acceleo
 */
package org.eclipse.emf.eef.nonreg.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.jface.viewers.ViewerFilter;



// End of user code

/**
 * 

 */
public interface EObjectFlatComboViewerPropertiesEditionPart {

	/**
	 * @return the eobjectflatcomboviewer
	 * @generated
	 */
	public EObject getEobjectflatcomboviewer();

	/**
	 * Init the eobjectflatcomboviewer
	 * @param allResources the ResourceSet where the widget have to process
	 * @param current the current value
	 */
	public void initEobjectflatcomboviewer(ResourceSet allResources, EObject current);

	/**
	 * Defines a new eobjectflatcomboviewer
	 * @param newValue the new eobjectflatcomboviewer to set
	 * @generated
	 */
	public void setEobjectflatcomboviewer(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * @generated
	 */
	public void setEobjectflatcomboviewerButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the eobjectflatcomboviewer edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToEobjectflatcomboviewer(ViewerFilter filter);

	/**
	 * Adds the given filter to the eobjectflatcomboviewer edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addBusinessFilterToEobjectflatcomboviewer(ViewerFilter filter);


	/**
	 * @return the eobjectflatcomboviewerRO
	 * @generated
	 */
	public EObject getEobjectflatcomboviewerRO();

	/**
	 * Init the eobjectflatcomboviewerRO
	 * @param allResources the ResourceSet where the widget have to process
	 * @param current the current value
	 */
	public void initEobjectflatcomboviewerRO(ResourceSet allResources, EObject current);

	/**
	 * Defines a new eobjectflatcomboviewerRO
	 * @param newValue the new eobjectflatcomboviewerRO to set
	 * @generated
	 */
	public void setEobjectflatcomboviewerRO(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * @generated
	 */
	public void setEobjectflatcomboviewerROButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the eobjectflatcomboviewerRO edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToEobjectflatcomboviewerRO(ViewerFilter filter);

	/**
	 * Adds the given filter to the eobjectflatcomboviewerRO edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addBusinessFilterToEobjectflatcomboviewerRO(ViewerFilter filter);





	/**
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.

	 */
	public String getTitle();

	// Start of user code for additional methods
	
	// End of user code

}
