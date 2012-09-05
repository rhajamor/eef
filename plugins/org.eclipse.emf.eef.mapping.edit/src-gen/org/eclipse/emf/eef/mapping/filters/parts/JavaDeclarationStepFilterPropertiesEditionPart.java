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
package org.eclipse.emf.eef.mapping.filters.parts;

// Start of user code for imports



// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public interface JavaDeclarationStepFilterPropertiesEditionPart {

	/**
	 * @return the qualifiedClass
	 * 
	 */
	public String getQualifiedClass();

	/**
	 * Defines a new qualifiedClass
	 * @param newValue the new qualifiedClass to set
	 * 
	 */
	public void setQualifiedClass(String newValue);


	/**
	 * @return the methodFilter
	 * 
	 */
	public String getMethodFilter();

	/**
	 * Defines a new methodFilter
	 * @param newValue the new methodFilter to set
	 * 
	 */
	public void setMethodFilter(String newValue);


	/**
	 * @return the staticMethod
	 * 
	 */
	public Boolean getStaticMethod();

	/**
	 * Defines a new staticMethod
	 * @param newValue the new staticMethod to set
	 * 
	 */
	public void setStaticMethod(Boolean newValue);





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
