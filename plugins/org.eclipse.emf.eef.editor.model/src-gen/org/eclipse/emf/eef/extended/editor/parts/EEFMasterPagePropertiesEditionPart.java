/**
 * Copyright (c) 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 ******************************************************************************
 */
package org.eclipse.emf.eef.extended.editor.parts;

// Start of user code for imports




// End of user code

/**
 * 
 * 
 */
public interface EEFMasterPagePropertiesEditionPart {

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


	/**
	 * @return the title
	 * 
	 */
	public String getTitle_();

	/**
	 * Defines a new title
	 * @param newValue the new title to set
	 * 
	 */
	public void setTitle_(String newValue);


	/**
	 * @return the orientable
	 * 
	 */
	public Boolean getOrientable();

	/**
	 * Defines a new orientable
	 * @param newValue the new orientable to set
	 * 
	 */
	public void setOrientable(Boolean newValue);


	/**
	 * @return the showValidatePage
	 * 
	 */
	public Boolean getShowValidatePage();

	/**
	 * Defines a new showValidatePage
	 * @param newValue the new showValidatePage to set
	 * 
	 */
	public void setShowValidatePage(Boolean newValue);





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
