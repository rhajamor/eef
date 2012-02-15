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
public interface TextareaSamplePropertiesEditionPart {

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
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * 
	 */
	public String getTitle();

	// Start of user code for additional methods
	
	// End of user code

}
