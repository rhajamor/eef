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

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.ViewerFilter;

// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public interface GenViewsRepositoryPropertiesEditionPart {

	/**
	 * @return the Views repository
	 * 
	 */
	public EObject getViewsRepository();

	/**
	 * Init the Views repository
	 * @param settings the combo setting
	 */
	public void initViewsRepository(EObjectFlatComboSettings settings);

	/**
	 * Defines a new Views repository
	 * @param newValue the new Views repository to set
	 * 
	 */
	public void setViewsRepository(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setViewsRepositoryButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the Views repository edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToViewsRepository(ViewerFilter filter);

	/**
	 * Adds the given filter to the Views repository edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToViewsRepository(ViewerFilter filter);


	/**
	 * @return the Base package
	 * 
	 */
	public String getBasePackage();

	/**
	 * Defines a new Base package
	 * @param newValue the new Base package to set
	 * 
	 */
	public void setBasePackage(String newValue);


	/**
	 * @return the Help strategy
	 * 
	 */
	public Enumerator getHelpStrategy();

	/**
	 * Init the Help strategy
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initHelpStrategy(Object input, Enumerator current);

	/**
	 * Defines a new Help strategy
	 * @param newValue the new Help strategy to set
	 * 
	 */
	public void setHelpStrategy(Enumerator newValue);


	/**
	 * @return the SWT views
	 * 
	 */
	public Boolean getSWTViews();

	/**
	 * Defines a new SWT views
	 * @param newValue the new SWT views to set
	 * 
	 */
	public void setSWTViews(Boolean newValue);


	/**
	 * @return the Forms views
	 * 
	 */
	public Boolean getFormsViews();

	/**
	 * Defines a new Forms views
	 * @param newValue the new Forms views to set
	 * 
	 */
	public void setFormsViews(Boolean newValue);


	/**
	 * @return the partsSuperClass
	 * 
	 */
	public String getPartsSuperClass();

	/**
	 * Defines a new partsSuperClass
	 * @param newValue the new partsSuperClass to set
	 * 
	 */
	public void setPartsSuperClass(String newValue);





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
