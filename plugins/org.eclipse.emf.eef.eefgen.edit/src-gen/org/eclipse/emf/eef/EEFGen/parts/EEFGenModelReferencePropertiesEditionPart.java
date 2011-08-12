/*******************************************************************************
 * Copyright (c) 2008, 2010 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.EEFGen.parts;

// Start of user code for imports

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.ViewerFilter;
 

// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public interface EEFGenModelReferencePropertiesEditionPart {

	/**
	 * @return the Referenced EEFGenModel
	 * 
	 */
	public EObject getReferencedEEFGenModel();

	/**
	 * Init the Referenced EEFGenModel
	 * @param settings the combo setting
	 */
	public void initReferencedEEFGenModel(EObjectFlatComboSettings settings);

	/**
	 * Defines a new Referenced EEFGenModel
	 * @param newValue the new Referenced EEFGenModel to set
	 * 
	 */
	public void setReferencedEEFGenModel(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setReferencedEEFGenModelButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the Referenced EEFGenModel edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToReferencedEEFGenModel(ViewerFilter filter);

	/**
	 * Adds the given filter to the Referenced EEFGenModel edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToReferencedEEFGenModel(ViewerFilter filter);





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
