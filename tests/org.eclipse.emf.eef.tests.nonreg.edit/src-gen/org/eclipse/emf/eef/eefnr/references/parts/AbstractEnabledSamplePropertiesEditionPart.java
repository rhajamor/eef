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
package org.eclipse.emf.eef.eefnr.references.parts;

// Start of user code for imports
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;




// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public interface AbstractEnabledSamplePropertiesEditionPart {

	/**
	 * @return the enabled
	 * 
	 */
	public Boolean getEnabled();

	/**
	 * Defines a new enabled
	 * @param newValue the new enabled to set
	 * 
	 */
	public void setEnabled(Boolean newValue);


	/**
		 * @return the AbstractSample referenced view
		 * 
		 */
		public IPropertiesEditionPart getAbstractSampleReferencedView();
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
