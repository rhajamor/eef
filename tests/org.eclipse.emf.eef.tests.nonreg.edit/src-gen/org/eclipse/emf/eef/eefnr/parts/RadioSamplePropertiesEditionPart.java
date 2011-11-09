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

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnum;

// Start of user code for imports



// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public interface RadioSamplePropertiesEditionPart {

	/**
	 * @return the radioRequiredProperty
	 * 
	 */
	public Object getRadioRequiredProperty();

	/**
	 * Init the radioRequiredProperty
	 * @param eenum the enum to manage
	 * @param current the current value
	 */
	public void initRadioRequiredProperty(EEnum eenum, Enumerator current);

	/**
	 * Defines a new radioRequiredProperty
	 * @param newValue the new radioRequiredProperty to set
	 * 
	 */
	public void setRadioRequiredProperty(Object newValue);


	/**
	 * @return the radioOptionalProperty
	 * 
	 */
	public Object getRadioOptionalProperty();

	/**
	 * Init the radioOptionalProperty
	 * @param eenum the enum to manage
	 * @param current the current value
	 */
	public void initRadioOptionalProperty(EEnum eenum, Enumerator current);

	/**
	 * Defines a new radioOptionalProperty
	 * @param newValue the new radioOptionalProperty to set
	 * 
	 */
	public void setRadioOptionalProperty(Object newValue);





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
