/*******************************************************************************
 * Copyright (c) 2009 - 2010 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.eefnr.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
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
public interface TotalSamplePropertiesEditionPart {

	/**
	 * @return the textRequiredProperty
	 * 
	 */
	public String getTextRequiredProperty();

	/**
	 * Defines a new textRequiredProperty
	 * @param newValue the new textRequiredProperty to set
	 * 
	 */
	public void setTextRequiredProperty(String newValue);


	/**
	 * @return the textOptionalProperty
	 * 
	 */
	public String getTextOptionalProperty();

	/**
	 * Defines a new textOptionalProperty
	 * @param newValue the new textOptionalProperty to set
	 * 
	 */
	public void setTextOptionalProperty(String newValue);


	/**
	 * @return the checkboxRequiredProperty
	 * 
	 */
	public Boolean getCheckboxRequiredProperty();

	/**
	 * Defines a new checkboxRequiredProperty
	 * @param newValue the new checkboxRequiredProperty to set
	 * 
	 */
	public void setCheckboxRequiredProperty(Boolean newValue);


	/**
	 * @return the checkboxOptionalProperty
	 * 
	 */
	public Boolean getCheckboxOptionalProperty();

	/**
	 * Defines a new checkboxOptionalProperty
	 * @param newValue the new checkboxOptionalProperty to set
	 * 
	 */
	public void setCheckboxOptionalProperty(Boolean newValue);


	/**
	 * @return the textareaRequiredProperty
	 * 
	 */
	public String getTextareaRequiredProperty();

	/**
	 * Defines a new textareaRequiredProperty
	 * @param newValue the new textareaRequiredProperty to set
	 * 
	 */
	public void setTextareaRequiredProperty(String newValue);


	/**
	 * @return the textareaOptionalProperty
	 * 
	 */
	public String getTextareaOptionalProperty();

	/**
	 * Defines a new textareaOptionalProperty
	 * @param newValue the new textareaOptionalProperty to set
	 * 
	 */
	public void setTextareaOptionalProperty(String newValue);


	/**
	 * @return the radioRequiredProperty
	 * 
	 */
	public Enumerator getRadioRequiredProperty();

	/**
	 * Init the radioRequiredProperty
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initRadioRequiredProperty(Object input, Enumerator current);

	/**
	 * Defines a new radioRequiredProperty
	 * @param newValue the new radioRequiredProperty to set
	 * 
	 */
	public void setRadioRequiredProperty(Enumerator newValue);


	/**
	 * @return the radioOptionalProperty
	 * 
	 */
	public Enumerator getRadioOptionalProperty();

	/**
	 * Init the radioOptionalProperty
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initRadioOptionalProperty(Object input, Enumerator current);

	/**
	 * Defines a new radioOptionalProperty
	 * @param newValue the new radioOptionalProperty to set
	 * 
	 */
	public void setRadioOptionalProperty(Enumerator newValue);


	/**
	 * @return the eobjectflatcomboviewerRequiredProperty
	 * 
	 */
	public EObject getEobjectflatcomboviewerRequiredProperty();

	/**
	 * Init the eobjectflatcomboviewerRequiredProperty
	 * @param settings the combo setting
	 */
	public void initEobjectflatcomboviewerRequiredProperty(EObjectFlatComboSettings settings);

	/**
	 * Defines a new eobjectflatcomboviewerRequiredProperty
	 * @param newValue the new eobjectflatcomboviewerRequiredProperty to set
	 * 
	 */
	public void setEobjectflatcomboviewerRequiredProperty(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setEobjectflatcomboviewerRequiredPropertyButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the eobjectflatcomboviewerRequiredProperty edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToEobjectflatcomboviewerRequiredProperty(ViewerFilter filter);

	/**
	 * Adds the given filter to the eobjectflatcomboviewerRequiredProperty edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToEobjectflatcomboviewerRequiredProperty(ViewerFilter filter);


	/**
	 * @return the eobjectflatcomboviewerOptionalProperty
	 * 
	 */
	public EObject getEobjectflatcomboviewerOptionalProperty();

	/**
	 * Init the eobjectflatcomboviewerOptionalProperty
	 * @param settings the combo setting
	 */
	public void initEobjectflatcomboviewerOptionalProperty(EObjectFlatComboSettings settings);

	/**
	 * Defines a new eobjectflatcomboviewerOptionalProperty
	 * @param newValue the new eobjectflatcomboviewerOptionalProperty to set
	 * 
	 */
	public void setEobjectflatcomboviewerOptionalProperty(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setEobjectflatcomboviewerOptionalPropertyButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the eobjectflatcomboviewerOptionalProperty edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToEobjectflatcomboviewerOptionalProperty(ViewerFilter filter);

	/**
	 * Adds the given filter to the eobjectflatcomboviewerOptionalProperty edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToEobjectflatcomboviewerOptionalProperty(ViewerFilter filter);




	/**
	 * Init the referencestableRequiredProperty
	 * @param settings settings for the referencestableRequiredProperty ReferencesTable 
	 */
	public void initReferencestableRequiredProperty(ReferencesTableSettings settings);

	/**
	 * Update the referencestableRequiredProperty
	 * @param newValue the referencestableRequiredProperty to update
	 * 
	 */
	public void updateReferencestableRequiredProperty();

	/**
	 * Adds the given filter to the referencestableRequiredProperty edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToReferencestableRequiredProperty(ViewerFilter filter);

	/**
	 * Adds the given filter to the referencestableRequiredProperty edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToReferencestableRequiredProperty(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the referencestableRequiredProperty table
	 * 
	 */
	public boolean isContainedInReferencestableRequiredPropertyTable(EObject element);




	/**
	 * Init the referencestableOptionalProperty
	 * @param settings settings for the referencestableOptionalProperty ReferencesTable 
	 */
	public void initReferencestableOptionalProperty(ReferencesTableSettings settings);

	/**
	 * Update the referencestableOptionalProperty
	 * @param newValue the referencestableOptionalProperty to update
	 * 
	 */
	public void updateReferencestableOptionalProperty();

	/**
	 * Adds the given filter to the referencestableOptionalProperty edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToReferencestableOptionalProperty(ViewerFilter filter);

	/**
	 * Adds the given filter to the referencestableOptionalProperty edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToReferencestableOptionalProperty(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the referencestableOptionalProperty table
	 * 
	 */
	public boolean isContainedInReferencestableOptionalPropertyTable(EObject element);


	/**
	 * @return the emfcomboviewerRequiredProperty
	 * 
	 */
	public Enumerator getEmfcomboviewerRequiredProperty();

	/**
	 * Init the emfcomboviewerRequiredProperty
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initEmfcomboviewerRequiredProperty(Object input, Enumerator current);

	/**
	 * Defines a new emfcomboviewerRequiredProperty
	 * @param newValue the new emfcomboviewerRequiredProperty to set
	 * 
	 */
	public void setEmfcomboviewerRequiredProperty(Enumerator newValue);


	/**
	 * @return the emfcomboviewerOptionalProperty
	 * 
	 */
	public Enumerator getEmfcomboviewerOptionalProperty();

	/**
	 * Init the emfcomboviewerOptionalProperty
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initEmfcomboviewerOptionalProperty(Object input, Enumerator current);

	/**
	 * Defines a new emfcomboviewerOptionalProperty
	 * @param newValue the new emfcomboviewerOptionalProperty to set
	 * 
	 */
	public void setEmfcomboviewerOptionalProperty(Enumerator newValue);


	/**
	 * @return the multivaluededitorRequiredProperty
	 * 
	 */
	public EList getMultivaluededitorRequiredProperty();

	/**
	 * Defines a new multivaluededitorRequiredProperty
	 * @param newValue the new multivaluededitorRequiredProperty to set
	 * 
	 */
	public void setMultivaluededitorRequiredProperty(EList newValue);

	/**
	 * Add a value to the multivaluededitorRequiredProperty multivalued attribute.
	 * @param newValue the value to add
	 */
	public void addToMultivaluededitorRequiredProperty(Object newValue);

	/**
	 * Remove a value to the multivaluededitorRequiredProperty multivalued attribute.
	 * @param newValue the value to remove
	 */
	public void removeToMultivaluededitorRequiredProperty(Object newValue);


	/**
	 * @return the multivaluededitorOptionalProperty
	 * 
	 */
	public EList getMultivaluededitorOptionalProperty();

	/**
	 * Defines a new multivaluededitorOptionalProperty
	 * @param newValue the new multivaluededitorOptionalProperty to set
	 * 
	 */
	public void setMultivaluededitorOptionalProperty(EList newValue);

	/**
	 * Add a value to the multivaluededitorOptionalProperty multivalued attribute.
	 * @param newValue the value to add
	 */
	public void addToMultivaluededitorOptionalProperty(Object newValue);

	/**
	 * Remove a value to the multivaluededitorOptionalProperty multivalued attribute.
	 * @param newValue the value to remove
	 */
	public void removeToMultivaluededitorOptionalProperty(Object newValue);




	/**
	 * Init the tablecompositionRequiredProperty
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initTablecompositionRequiredProperty(ReferencesTableSettings settings);

	/**
	 * Update the tablecompositionRequiredProperty
	 * @param newValue the tablecompositionRequiredProperty to update
	 * 
	 */
	public void updateTablecompositionRequiredProperty();

	/**
	 * Adds the given filter to the tablecompositionRequiredProperty edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToTablecompositionRequiredProperty(ViewerFilter filter);

	/**
	 * Adds the given filter to the tablecompositionRequiredProperty edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToTablecompositionRequiredProperty(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the tablecompositionRequiredProperty table
	 * 
	 */
	public boolean isContainedInTablecompositionRequiredPropertyTable(EObject element);




	/**
	 * Init the tablecompositionOptionalProperty
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initTablecompositionOptionalProperty(ReferencesTableSettings settings);

	/**
	 * Update the tablecompositionOptionalProperty
	 * @param newValue the tablecompositionOptionalProperty to update
	 * 
	 */
	public void updateTablecompositionOptionalProperty();

	/**
	 * Adds the given filter to the tablecompositionOptionalProperty edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToTablecompositionOptionalProperty(ViewerFilter filter);

	/**
	 * Adds the given filter to the tablecompositionOptionalProperty edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToTablecompositionOptionalProperty(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the tablecompositionOptionalProperty table
	 * 
	 */
	public boolean isContainedInTablecompositionOptionalPropertyTable(EObject element);




	/**
	 * Init the advancedreferencestableRequiredProperty
	 * @param settings settings for the advancedreferencestableRequiredProperty ReferencesTable 
	 */
	public void initAdvancedreferencestableRequiredProperty(ReferencesTableSettings settings);

	/**
	 * Update the advancedreferencestableRequiredProperty
	 * @param newValue the advancedreferencestableRequiredProperty to update
	 * 
	 */
	public void updateAdvancedreferencestableRequiredProperty();

	/**
	 * Adds the given filter to the advancedreferencestableRequiredProperty edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToAdvancedreferencestableRequiredProperty(ViewerFilter filter);

	/**
	 * Adds the given filter to the advancedreferencestableRequiredProperty edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToAdvancedreferencestableRequiredProperty(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the advancedreferencestableRequiredProperty table
	 * 
	 */
	public boolean isContainedInAdvancedreferencestableRequiredPropertyTable(EObject element);




	/**
	 * Init the advancedreferencestableOptionalProperty
	 * @param settings settings for the advancedreferencestableOptionalProperty ReferencesTable 
	 */
	public void initAdvancedreferencestableOptionalProperty(ReferencesTableSettings settings);

	/**
	 * Update the advancedreferencestableOptionalProperty
	 * @param newValue the advancedreferencestableOptionalProperty to update
	 * 
	 */
	public void updateAdvancedreferencestableOptionalProperty();

	/**
	 * Adds the given filter to the advancedreferencestableOptionalProperty edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToAdvancedreferencestableOptionalProperty(ViewerFilter filter);

	/**
	 * Adds the given filter to the advancedreferencestableOptionalProperty edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToAdvancedreferencestableOptionalProperty(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the advancedreferencestableOptionalProperty table
	 * 
	 */
	public boolean isContainedInAdvancedreferencestableOptionalPropertyTable(EObject element);


	/**
	 * @return the advancedeobjectflatcomboviewerRequiredPropery
	 * 
	 */
	public EObject getAdvancedeobjectflatcomboviewerRequiredPropery();

	/**
	 * Init the advancedeobjectflatcomboviewerRequiredPropery
	 * @param settings the combo setting
	 */
	public void initAdvancedeobjectflatcomboviewerRequiredPropery(EObjectFlatComboSettings settings);

	/**
	 * Defines a new advancedeobjectflatcomboviewerRequiredPropery
	 * @param newValue the new advancedeobjectflatcomboviewerRequiredPropery to set
	 * 
	 */
	public void setAdvancedeobjectflatcomboviewerRequiredPropery(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setAdvancedeobjectflatcomboviewerRequiredProperyButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the advancedeobjectflatcomboviewerRequiredPropery edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToAdvancedeobjectflatcomboviewerRequiredPropery(ViewerFilter filter);

	/**
	 * Adds the given filter to the advancedeobjectflatcomboviewerRequiredPropery edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToAdvancedeobjectflatcomboviewerRequiredPropery(ViewerFilter filter);


	/**
	 * @return the advancedeobjectflatcomboviewerOptionalPropery
	 * 
	 */
	public EObject getAdvancedeobjectflatcomboviewerOptionalPropery();

	/**
	 * Init the advancedeobjectflatcomboviewerOptionalPropery
	 * @param settings the combo setting
	 */
	public void initAdvancedeobjectflatcomboviewerOptionalPropery(EObjectFlatComboSettings settings);

	/**
	 * Defines a new advancedeobjectflatcomboviewerOptionalPropery
	 * @param newValue the new advancedeobjectflatcomboviewerOptionalPropery to set
	 * 
	 */
	public void setAdvancedeobjectflatcomboviewerOptionalPropery(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setAdvancedeobjectflatcomboviewerOptionalProperyButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the advancedeobjectflatcomboviewerOptionalPropery edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToAdvancedeobjectflatcomboviewerOptionalPropery(ViewerFilter filter);

	/**
	 * Adds the given filter to the advancedeobjectflatcomboviewerOptionalPropery edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToAdvancedeobjectflatcomboviewerOptionalPropery(ViewerFilter filter);




	/**
	 * Init the advancedtablecompositionRequiredProperty
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initAdvancedtablecompositionRequiredProperty(ReferencesTableSettings settings);

	/**
	 * Update the advancedtablecompositionRequiredProperty
	 * @param newValue the advancedtablecompositionRequiredProperty to update
	 * 
	 */
	public void updateAdvancedtablecompositionRequiredProperty();

	/**
	 * Adds the given filter to the advancedtablecompositionRequiredProperty edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToAdvancedtablecompositionRequiredProperty(ViewerFilter filter);

	/**
	 * Adds the given filter to the advancedtablecompositionRequiredProperty edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToAdvancedtablecompositionRequiredProperty(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the advancedtablecompositionRequiredProperty table
	 * 
	 */
	public boolean isContainedInAdvancedtablecompositionRequiredPropertyTable(EObject element);




	/**
	 * Init the advancedtablecompositionOptionalProperty
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initAdvancedtablecompositionOptionalProperty(ReferencesTableSettings settings);

	/**
	 * Update the advancedtablecompositionOptionalProperty
	 * @param newValue the advancedtablecompositionOptionalProperty to update
	 * 
	 */
	public void updateAdvancedtablecompositionOptionalProperty();

	/**
	 * Adds the given filter to the advancedtablecompositionOptionalProperty edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToAdvancedtablecompositionOptionalProperty(ViewerFilter filter);

	/**
	 * Adds the given filter to the advancedtablecompositionOptionalProperty edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToAdvancedtablecompositionOptionalProperty(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the advancedtablecompositionOptionalProperty table
	 * 
	 */
	public boolean isContainedInAdvancedtablecompositionOptionalPropertyTable(EObject element);


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




	// Start of user code for CustomElementEditor specific getters and setters declaration
	
	// End of user code

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
