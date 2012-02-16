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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;



// End of user code

/**
 * @author <a href="mailto:stephane.bouchet@obeo.fr">Stephane Bouchet</a>
 * 
 */
public interface TalksAndTopicsPropertiesEditionPart {



	/**
	 * Init the talks
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initTalks(ReferencesTableSettings settings);

	/**
	 * Update the talks
	 * @param newValue the talks to update
	 * 
	 */
	public void updateTalks();

	/**
	 * Adds the given filter to the talks edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToTalks(ViewerFilter filter);

	/**
	 * Adds the given filter to the talks edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToTalks(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the talks table
	 * 
	 */
	public boolean isContainedInTalksTable(EObject element);




	/**
	 * Init the topics
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initTopics(ReferencesTableSettings settings);

	/**
	 * Update the topics
	 * @param newValue the topics to update
	 * 
	 */
	public void updateTopics();

	/**
	 * Adds the given filter to the topics edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToTopics(ViewerFilter filter);

	/**
	 * Adds the given filter to the topics edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToTopics(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the topics table
	 * 
	 */
	public boolean isContainedInTopicsTable(EObject element);





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
