/**
 * Generated with Acceleo
 */
package org.eclipse.emf.eef.nonreg.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.jface.viewers.ViewerFilter;




// End of user code

/**
 * 

 */
public interface TalkPropertiesEditionPart {

	/**
	 * @return the title
	 * @generated
	 */
	public String getTitle_();

	/**
	 * Defines a new title
	 * @param newValue the new title to set
	 * @generated
	 */
	public void setTitle_(String newValue);


	/**
	 * @return the type
	 * @generated
	 */
	public Enumerator getType();

	/**
	 * Init the type
	 * @param eenum the enum to manage
	 * @param current the current value
	 */
	public void initType(EEnum eenum, Enumerator current);

	/**
	 * Defines a new type
	 * @param newValue the new type to set
	 * @generated
	 */
	public void setType(Enumerator newValue);


	/**
	 * @return the presenter
	 * @generated
	 */
	public EObject getPresenter();

	/**
	 * Init the presenter
	 * @param allResources the ResourceSet where the widget have to process
	 * @param current the current value
	 */
	public void initPresenter(ResourceSet allResources, EObject current);

	/**
	 * Defines a new presenter
	 * @param newValue the new presenter to set
	 * @generated
	 */
	public void setPresenter(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * @generated
	 */
	public void setPresenterButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the presenter edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToPresenter(ViewerFilter filter);

	/**
	 * Adds the given filter to the presenter edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addBusinessFilterToPresenter(ViewerFilter filter);


	/**
	 * @return the creator
	 * @generated
	 */
	public Object getCreator();

	/**
	 * Init the creator
	 * @param eClass the eClass to manage
	 * @param current the current value
	 */
	public void initCreator(ResourceSet allResources, EObject current);

	/**
	 * Defines a new creator
	 * @param newValue the new creator to set
	 * @generated
	 */
	public void setCreator(Object newValue);

	/**
	 * Adds the given filter to the creator edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToCreator(ViewerFilter filter);


	/**
		 * @return the DocumentedElement referenced view
		 * @generated
		 */
		public IPropertiesEditionPart getDocumentedElementReferencedView();
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
