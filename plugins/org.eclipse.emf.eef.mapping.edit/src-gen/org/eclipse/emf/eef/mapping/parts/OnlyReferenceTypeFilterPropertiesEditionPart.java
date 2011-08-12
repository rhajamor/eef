/**
 *  Copyright (c) 2008 - 2010 Obeo.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *      Obeo - initial API and implementation
 *
 */
package org.eclipse.emf.eef.mapping.parts;

// Start of user code for imports

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.ViewerFilter;
 

// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public interface OnlyReferenceTypeFilterPropertiesEditionPart {

	/**
	 * @return the referencedFeature
	 * 
	 */
	public EObject getReferencedFeature();

	/**
	 * Init the referencedFeature
	 * @param settings the combo setting
	 */
	public void initReferencedFeature(EObjectFlatComboSettings settings);

	/**
	 * Defines a new referencedFeature
	 * @param newValue the new referencedFeature to set
	 * 
	 */
	public void setReferencedFeature(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setReferencedFeatureButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the referencedFeature edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToReferencedFeature(ViewerFilter filter);

	/**
	 * Adds the given filter to the referencedFeature edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToReferencedFeature(ViewerFilter filter);


	/**
		 * @return the Filter properties referenced view
		 * 
		 */
		public IPropertiesEditionPart getFilterPropertiesReferencedView();
	/**
	 * @return the Name
	 * 
	 */
	public String getName();

	/**
	 * Defines a new Name
	 * @param newValue the new Name to set
	 * 
	 */
	public void setName(String newValue);

	/**
	 * @return the Mandatory
	 * 
	 */
	public Boolean getMandatory();

	/**
	 * Defines a new Mandatory
	 * @param newValue the new Mandatory to set
	 * 
	 */
	public void setMandatory(Boolean newValue);





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
