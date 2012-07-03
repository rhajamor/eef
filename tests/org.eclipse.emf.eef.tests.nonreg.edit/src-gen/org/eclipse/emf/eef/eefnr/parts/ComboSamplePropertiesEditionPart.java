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
import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public interface ComboSamplePropertiesEditionPart {

	/**
	 * @return the comboRequiredReferenceProperty
	 * 
	 */
	public Object getComboRequiredReferenceProperty();

	/**
	 * Init the comboRequiredReferenceProperty
	 * @param input choice of values
	 * @param currentValue the current value
	 */
	public void initComboRequiredReferenceProperty(Object input, Object currentValue);

	/**
	 * Defines a new comboRequiredReferenceProperty
	 * @param newValue the new comboRequiredReferenceProperty to set
	 * 
	 */
	public void setComboRequiredReferenceProperty(Object newValue);

	/**
	 * Adds the given filter to the comboRequiredReferenceProperty edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToComboRequiredReferenceProperty(ViewerFilter filter);


	/**
	 * @return the comboOptionalReferenceProperty
	 * 
	 */
	public Object getComboOptionalReferenceProperty();

	/**
	 * Init the comboOptionalReferenceProperty
	 * @param input choice of values
	 * @param currentValue the current value
	 */
	public void initComboOptionalReferenceProperty(Object input, Object currentValue);

	/**
	 * Defines a new comboOptionalReferenceProperty
	 * @param newValue the new comboOptionalReferenceProperty to set
	 * 
	 */
	public void setComboOptionalReferenceProperty(Object newValue);

	/**
	 * Adds the given filter to the comboOptionalReferenceProperty edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToComboOptionalReferenceProperty(ViewerFilter filter);





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
