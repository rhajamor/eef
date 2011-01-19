/**
 *  Copyright (c) 2008-2009 Obeo.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *      Obeo - initial API and implementation
 * 
 *
 * $Id: DocumentationPropertiesEditionPart.java,v 1.1 2009/04/30 17:49:47 nlepine Exp $
 */
package org.eclipse.emf.eef.components.parts;

// Start of user code for imports


 

// End of user code
/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 */
public interface DocumentationPropertiesEditionPart {

	/**
	 * @return the documentation
	 */
	public String getDocumentation();
	
	/**
	 * Defines a new documentation
	 * @param newValue the new documentation to set
	 */
	public void setDocumentation(String newValue);
	
	public void setMessageForDocumentation(String msg, int msgLevel);
	
	public void unsetMessageForDocumentation();
	





	// Start of user code for additional methods
 	
	// End of user code
}
