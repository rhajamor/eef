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
public interface ImageViewerSamplePropertiesEditionPart {

	/**
	 * @return the imageviewerRequiredProperty
	 * 
	 */
	public String getImageviewerRequiredProperty();

	/**
	 * Init the imageviewerRequiredProperty
	 * @param key the key of the editor 
	 * @param current the new path of the pics
	 */
	public void initImageviewerRequiredProperty(String key, String newValue);

	/**
	 * Defines a new imageviewerRequiredProperty
	 * @param newValue the new imageviewerRequiredProperty to set
	 * 
	 */
	public void setImageviewerRequiredProperty(String newValue);


	/**
	 * @return the imageviewerOptionalProperty
	 * 
	 */
	public String getImageviewerOptionalProperty();

	/**
	 * Init the imageviewerOptionalProperty
	 * @param key the key of the editor 
	 * @param current the new path of the pics
	 */
	public void initImageviewerOptionalProperty(String key, String newValue);

	/**
	 * Defines a new imageviewerOptionalProperty
	 * @param newValue the new imageviewerOptionalProperty to set
	 * 
	 */
	public void setImageviewerOptionalProperty(String newValue);





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
