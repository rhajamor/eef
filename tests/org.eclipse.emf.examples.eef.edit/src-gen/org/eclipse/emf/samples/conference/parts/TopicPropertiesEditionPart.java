/*******************************************************************************
 * Copyright (c) 2009 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.samples.conference.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.EList;



// End of user code

/**
 * @author <a href="mailto:stephane.bouchet@obeo.fr">Stephane Bouchet</a>
 * 
 */
public interface TopicPropertiesEditionPart {

	/**
	 * @return the description
	 * 
	 */
	public String getDescription();

	/**
	 * Defines a new description
	 * @param newValue the new description to set
	 * 
	 */
	public void setDescription(String newValue);


	/**
	 * @return the references
	 * 
	 */
	public EList getReferences();

	/**
	 * Defines a new references
	 * @param newValue the new references to set
	 * 
	 */
	public void setReferences(EList newValue);

	/**
	 * Add a value to the references multivalued attribute.
	 * @param newValue the value to add
	 */
	public void addToReferences(Object newValue);

	/**
	 * Remove a value to the references multivalued attribute.
	 * @param newValue the value to remove
	 */
	public void removeToReferences(Object newValue);


	/**
	 * @return the documentation
	 * 
	 */
	public String getDocumentation();

	/**
	 * Defines a new documentation
	 * @param newValue the new documentation to set
	 * 
	 */
	public void setDocumentation(String newValue);





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
