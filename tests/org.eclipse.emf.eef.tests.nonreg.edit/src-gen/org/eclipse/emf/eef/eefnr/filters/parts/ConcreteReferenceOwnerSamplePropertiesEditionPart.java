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
package org.eclipse.emf.eef.eefnr.filters.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;



// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public interface ConcreteReferenceOwnerSamplePropertiesEditionPart {

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
	 * Init the abstractTarget
	 * @param settings settings for the abstractTarget ReferencesTable 
	 */
	public void initAbstractTarget(ReferencesTableSettings settings);

	/**
	 * Update the abstractTarget
	 * @param newValue the abstractTarget to update
	 * 
	 */
	public void updateAbstractTarget();

	/**
	 * Adds the given filter to the abstractTarget edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToAbstractTarget(ViewerFilter filter);

	/**
	 * Adds the given filter to the abstractTarget edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToAbstractTarget(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the abstractTarget table
	 * 
	 */
	public boolean isContainedInAbstractTargetTable(EObject element);




	/**
	 * Init the strictTyping
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initStrictTyping(ReferencesTableSettings settings);

	/**
	 * Update the strictTyping
	 * @param newValue the strictTyping to update
	 * 
	 */
	public void updateStrictTyping();

	/**
	 * Adds the given filter to the strictTyping edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToStrictTyping(ViewerFilter filter);

	/**
	 * Adds the given filter to the strictTyping edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToStrictTyping(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the strictTyping table
	 * 
	 */
	public boolean isContainedInStrictTypingTable(EObject element);





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
