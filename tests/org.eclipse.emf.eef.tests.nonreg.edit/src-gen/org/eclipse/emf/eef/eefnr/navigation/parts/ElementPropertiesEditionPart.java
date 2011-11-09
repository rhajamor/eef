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
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;




// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public interface ElementPropertiesEditionPart {

	/**
	 * @return the isVisible
	 * 
	 */
	public Boolean getIsVisible();

	/**
	 * Defines a new isVisible
	 * @param newValue the new isVisible to set
	 * 
	 */
	public void setIsVisible(Boolean newValue);


	/**
		 * @return the NamedElement referenced view
		 * 
		 */
		public IPropertiesEditionPart getNamedElementReferencedView();
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
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * 
	 */
	public String getTitle();

	// Start of user code for additional methods
	
	// End of user code

}
