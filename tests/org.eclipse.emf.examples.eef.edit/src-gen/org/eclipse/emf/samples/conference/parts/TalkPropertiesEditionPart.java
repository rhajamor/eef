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
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.ViewerFilter;



// End of user code

/**
 * @author <a href="mailto:stephane.bouchet@obeo.fr">Stephane Bouchet</a>
 * 
 */
public interface TalkPropertiesEditionPart {

	/**
	 * @return the title
	 * 
	 */
	public String getTitle_();

	/**
	 * Defines a new title
	 * @param newValue the new title to set
	 * 
	 */
	public void setTitle_(String newValue);


	/**
	 * @return the topic
	 * 
	 */
	public EObject getTopic();

	/**
	 * Init the topic
	 * @param settings the combo setting
	 */
	public void initTopic(EObjectFlatComboSettings settings);

	/**
	 * Defines a new topic
	 * @param newValue the new topic to set
	 * 
	 */
	public void setTopic(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setTopicButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the topic edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToTopic(ViewerFilter filter);

	/**
	 * Adds the given filter to the topic edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToTopic(ViewerFilter filter);


	/**
	 * @return the type
	 * 
	 */
	public Enumerator getType();

	/**
	 * Init the type
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initType(Object input, Enumerator current);

	/**
	 * Defines a new type
	 * @param newValue the new type to set
	 * 
	 */
	public void setType(Enumerator newValue);


	/**
	 * @return the presenter
	 * 
	 */
	public EObject getPresenter();

	/**
	 * Init the presenter
	 * @param settings the combo setting
	 */
	public void initPresenter(EObjectFlatComboSettings settings);

	/**
	 * Defines a new presenter
	 * @param newValue the new presenter to set
	 * 
	 */
	public void setPresenter(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setPresenterButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the presenter edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToPresenter(ViewerFilter filter);

	/**
	 * Adds the given filter to the presenter edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToPresenter(ViewerFilter filter);


	/**
	 * @return the creator
	 * 
	 */
	public EObject getCreator();

	/**
	 * Init the creator
	 * @param settings the combo setting
	 */
	public void initCreator(EObjectFlatComboSettings settings);

	/**
	 * Defines a new creator
	 * @param newValue the new creator to set
	 * 
	 */
	public void setCreator(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setCreatorButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the creator edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToCreator(ViewerFilter filter);

	/**
	 * Adds the given filter to the creator edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToCreator(ViewerFilter filter);


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
