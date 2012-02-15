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
import org.eclipse.emf.common.util.EList;



// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public interface DeferedMultivaluedEditorPropertiesEditionPart {

	/**
	 * @return the multivaluedEditor
	 * 
	 */
	public EList getMultivaluedEditor();

	/**
	 * Defines a new multivaluedEditor
	 * @param newValue the new multivaluedEditor to set
	 * 
	 */
	public void setMultivaluedEditor(EList newValue);

	/**
	 * Add a value to the multivaluedEditor multivalued attribute.
	 * @param newValue the value to add
	 */
	public void addToMultivaluedEditor(Object newValue);

	/**
	 * Remove a value to the multivaluedEditor multivalued attribute.
	 * @param newValue the value to remove
	 */
	public void removeToMultivaluedEditor(Object newValue);





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
