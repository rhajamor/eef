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
package org.eclipse.emf.eef.eefnr.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.Enumerator;



// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public interface EMFComboViewerSamplePropertiesEditionPart {

	/**
	 * @return the emfcomboviewerRequiredProperty
	 * 
	 */
	public Enumerator getEmfcomboviewerRequiredProperty();

	/**
	 * Init the emfcomboviewerRequiredProperty
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initEmfcomboviewerRequiredProperty(Object input, Enumerator current);

	/**
	 * Defines a new emfcomboviewerRequiredProperty
	 * @param newValue the new emfcomboviewerRequiredProperty to set
	 * 
	 */
	public void setEmfcomboviewerRequiredProperty(Enumerator newValue);


	/**
	 * @return the emfcomboviewerOptionalProperty
	 * 
	 */
	public Enumerator getEmfcomboviewerOptionalProperty();

	/**
	 * Init the emfcomboviewerOptionalProperty
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initEmfcomboviewerOptionalProperty(Object input, Enumerator current);

	/**
	 * Defines a new emfcomboviewerOptionalProperty
	 * @param newValue the new emfcomboviewerOptionalProperty to set
	 * 
	 */
	public void setEmfcomboviewerOptionalProperty(Enumerator newValue);





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
