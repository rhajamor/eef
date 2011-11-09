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
package org.eclipse.emf.eef.eefnr.references.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;



// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public interface ReferenceEnabledSamplePropertiesEditionPart {



	/**
	 * Init the reference
	 * @param settings settings for the reference ReferencesTable 
	 */
	public void initReference(ReferencesTableSettings settings);

	/**
	 * Update the reference
	 * @param newValue the reference to update
	 * 
	 */
	public void updateReference();

	/**
	 * Adds the given filter to the reference edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToReference(ViewerFilter filter);

	/**
	 * Adds the given filter to the reference edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToReference(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the reference table
	 * 
	 */
	public boolean isContainedInReferenceTable(EObject element);


	/**
		 * @return the AbstractEnabledSample referenced view
		 * 
		 */
		public IPropertiesEditionPart getAbstractEnabledSampleReferencedView();
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
