/*******************************************************************************
 * Copyright (c) 2008, 2012 Obeo.
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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.ViewerFilter;



// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public interface EObjectFlatComboViewerSamplePropertiesEditionPart {

	/**
	 * @return the eobjectflatcomboviewerRequiredPropery
	 * 
	 */
	public EObject getEobjectflatcomboviewerRequiredPropery();

	/**
	 * Init the eobjectflatcomboviewerRequiredPropery
	 * @param settings the combo setting
	 */
	public void initEobjectflatcomboviewerRequiredPropery(EObjectFlatComboSettings settings);

	/**
	 * Defines a new eobjectflatcomboviewerRequiredPropery
	 * @param newValue the new eobjectflatcomboviewerRequiredPropery to set
	 * 
	 */
	public void setEobjectflatcomboviewerRequiredPropery(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setEobjectflatcomboviewerRequiredProperyButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the eobjectflatcomboviewerRequiredPropery edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToEobjectflatcomboviewerRequiredPropery(ViewerFilter filter);

	/**
	 * Adds the given filter to the eobjectflatcomboviewerRequiredPropery edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToEobjectflatcomboviewerRequiredPropery(ViewerFilter filter);


	/**
	 * @return the eobjectflatcomboviewerOptionalPropery
	 * 
	 */
	public EObject getEobjectflatcomboviewerOptionalPropery();

	/**
	 * Init the eobjectflatcomboviewerOptionalPropery
	 * @param settings the combo setting
	 */
	public void initEobjectflatcomboviewerOptionalPropery(EObjectFlatComboSettings settings);

	/**
	 * Defines a new eobjectflatcomboviewerOptionalPropery
	 * @param newValue the new eobjectflatcomboviewerOptionalPropery to set
	 * 
	 */
	public void setEobjectflatcomboviewerOptionalPropery(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setEobjectflatcomboviewerOptionalProperyButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the eobjectflatcomboviewerOptionalPropery edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToEobjectflatcomboviewerOptionalPropery(ViewerFilter filter);

	/**
	 * Adds the given filter to the eobjectflatcomboviewerOptionalPropery edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToEobjectflatcomboviewerOptionalPropery(ViewerFilter filter);





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
