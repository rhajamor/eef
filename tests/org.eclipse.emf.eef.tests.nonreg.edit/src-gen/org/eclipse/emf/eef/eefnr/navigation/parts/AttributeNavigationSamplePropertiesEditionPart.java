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
package org.eclipse.emf.eef.eefnr.navigation.parts;

// Start of user code for imports




// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public interface AttributeNavigationSamplePropertiesEditionPart {

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
	 * @return the delegate1ForSingleValued
	 * 
	 */
	public String getDelegate1ForSingleValued();

	/**
	 * Defines a new delegate1ForSingleValued
	 * @param newValue the new delegate1ForSingleValued to set
	 * 
	 */
	public void setDelegate1ForSingleValued(String newValue);


	/**
	 * @return the delegate2ForSingleValued
	 * 
	 */
	public String getDelegate2ForSingleValued();

	/**
	 * Defines a new delegate2ForSingleValued
	 * @param newValue the new delegate2ForSingleValued to set
	 * 
	 */
	public void setDelegate2ForSingleValued(String newValue);


	/**
	 * @return the delegate1ForMultiValued
	 * 
	 */
	public String getDelegate1ForMultiValued();

	/**
	 * Defines a new delegate1ForMultiValued
	 * @param newValue the new delegate1ForMultiValued to set
	 * 
	 */
	public void setDelegate1ForMultiValued(String newValue);


	/**
	 * @return the delegate2ForMultiValued
	 * 
	 */
	public String getDelegate2ForMultiValued();

	/**
	 * Defines a new delegate2ForMultiValued
	 * @param newValue the new delegate2ForMultiValued to set
	 * 
	 */
	public void setDelegate2ForMultiValued(String newValue);





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
