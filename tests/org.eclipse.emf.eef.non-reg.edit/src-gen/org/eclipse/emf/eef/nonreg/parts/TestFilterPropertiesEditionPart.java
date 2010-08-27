/**
 * Generated with Acceleo
 */
package org.eclipse.emf.eef.nonreg.parts;

// Start of user code for imports
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.jface.viewers.ViewerFilter;



// End of user code

/**
 * 

 */
public interface TestFilterPropertiesEditionPart {

	/**
	 * @return the testEOFCV
	 * @generated
	 */
	public EObject getTestEOFCV();

	/**
	 * Init the testEOFCV
	 * @param allResources the ResourceSet where the widget have to process
	 * @param current the current value
	 */
	public void initTestEOFCV(ResourceSet allResources, EObject current);

	/**
	 * Defines a new testEOFCV
	 * @param newValue the new testEOFCV to set
	 * @generated
	 */
	public void setTestEOFCV(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * @generated
	 */
	public void setTestEOFCVButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the testEOFCV edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToTestEOFCV(ViewerFilter filter);

	/**
	 * Adds the given filter to the testEOFCV edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addBusinessFilterToTestEOFCV(ViewerFilter filter);


	/**
	 * @return the testART to add
	 * @generated
	 */
	public List getTestARTToAdd();

	/**
	 * @return the testART to remove
	 * @generated
	 */
	public List getTestARTToRemove();

	/**
	 * @return the current testART table
	 * @generated
	 */
	public List getTestARTTable();

	/**
	 * Init the testART
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initTestART(EObject current, EReference containingFeature, EReference feature);

	/**
	 * Update the testART
	 * @param newValue the testART to update
	 * @generated
	 */
	public void updateTestART(EObject newValue);

	/**
	 * Adds the given filter to the testART edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToTestART(ViewerFilter filter);

	/**
	 * Adds the given filter to the testART edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addBusinessFilterToTestART(ViewerFilter filter);
	/**
	 * @return true if the given element is contained inside the testART table
	 * @generated
	 */
	public boolean isContainedInTestARTTable(EObject element);


	/**
	 * @return the testAEOFCV
	 * @generated
	 */
	public EObject getTestAEOFCV();

	/**
	 * Init the testAEOFCV
	 * @param allResources the ResourceSet where the widget have to process
	 * @param current the current value
	 */
	public void initTestAEOFCV(ResourceSet allResources, EObject current);

	/**
	 * Defines a new testAEOFCV
	 * @param newValue the new testAEOFCV to set
	 * @generated
	 */
	public void setTestAEOFCV(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * @generated
	 */
	public void setTestAEOFCVButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the testAEOFCV edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToTestAEOFCV(ViewerFilter filter);

	/**
	 * Adds the given filter to the testAEOFCV edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addBusinessFilterToTestAEOFCV(ViewerFilter filter);


	/**
	 * @return the testRT to add
	 * @generated
	 */
	public List getTestRTToAdd();

	/**
	 * @return the testRT to remove
	 * @generated
	 */
	public List getTestRTToRemove();

	/**
	 * @return the current testRT table
	 * @generated
	 */
	public List getTestRTTable();

	/**
	 * Init the testRT
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initTestRT(EObject current, EReference containingFeature, EReference feature);

	/**
	 * Update the testRT
	 * @param newValue the testRT to update
	 * @generated
	 */
	public void updateTestRT(EObject newValue);

	/**
	 * Adds the given filter to the testRT edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToTestRT(ViewerFilter filter);

	/**
	 * Adds the given filter to the testRT edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addBusinessFilterToTestRT(ViewerFilter filter);
	/**
	 * @return true if the given element is contained inside the testRT table
	 * @generated
	 */
	public boolean isContainedInTestRTTable(EObject element);





	/**
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.

	 */
	public String getTitle();

	// Start of user code for additional methods
	
	// End of user code

}
