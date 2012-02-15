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




// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public interface CheckboxSamplePropertiesEditionPart {

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
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * 
	 */
	public String getTitle();

	// Start of user code for additional methods
	
	// End of user code

}
