/**
 * Generated with Acceleo
 */
package org.eclipse.emf.eef.nonreg.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.jface.viewers.ViewerFilter;



// End of user code

/**
 * 

 */
public interface CompanyPropertiesEditionPart {

	/**
	 * @return the Adress
	 * @generated
	 */
	public EObject getAdress();

	/**
	 * Init the Adress
	 * @param allResources the ResourceSet where the widget have to process
	 * @param current the current value
	 */
	public void initAdress(ResourceSet allResources, EObject current);

	/**
	 * Defines a new Adress
	 * @param newValue the new Adress to set
	 * @generated
	 */
	public void setAdress(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * @generated
	 */
	public void setAdressButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the Adress edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToAdress(ViewerFilter filter);

	/**
	 * Adds the given filter to the Adress edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addBusinessFilterToAdress(ViewerFilter filter);


	/**
		 * @return the NamedElement referenced view
		 * @generated
		 */
		public IPropertiesEditionPart getNamedElementReferencedView();
	/**
	 * @return the name
	 * @generated
	 */
	public String getName();

	/**
	 * Defines a new name
	 * @param newValue the new name to set
	 * @generated
	 */
	public void setName(String newValue);

	/**
	 * @return the documentation
	 * @generated
	 */
	public String getDocumentation();

	/**
	 * Defines a new documentation
	 * @param newValue the new documentation to set
	 * @generated
	 */
	public void setDocumentation(String newValue);






	/**
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.

	 */
	public String getTitle();

	// Start of user code for additional methods
	
	// End of user code

}
