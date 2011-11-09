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
public interface TextSamplePropertiesEditionPart {

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
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * 
	 */
	public String getTitle();

	// Start of user code for additional methods
	
	// End of user code

}
