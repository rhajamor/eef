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
public interface GenEditionContextPropertiesEditionPart {

	/**
	 * @return the properties Edition Context
	 * 
	 */
	public EObject getPropertiesEditionContext();

	/**
	 * Init the properties Edition Context
	 * @param settings the combo setting
	 */
	public void initPropertiesEditionContext(EObjectFlatComboSettings settings);

	/**
	 * Defines a new properties Edition Context
	 * @param newValue the new properties Edition Context to set
	 * 
	 */
	public void setPropertiesEditionContext(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setPropertiesEditionContextButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the properties Edition Context edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToPropertiesEditionContext(ViewerFilter filter);

	/**
	 * Adds the given filter to the properties Edition Context edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToPropertiesEditionContext(ViewerFilter filter);


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
	 * @return the Descriptors contributorID
	 * 
	 */
	public String getDescriptorsContributorID();

	/**
	 * Defines a new Descriptors contributorID
	 * @param newValue the new Descriptors contributorID to set
	 * 
	 */
	public void setDescriptorsContributorID(String newValue);


	/**
	 * @return the Generic properties views descriptors
	 * 
	 */
	public Boolean getGenericPropertiesViewsDescriptors();

	/**
	 * Defines a new Generic properties views descriptors
	 * @param newValue the new Generic properties views descriptors to set
	 * 
	 */
	public void setGenericPropertiesViewsDescriptors(Boolean newValue);


	/**
	 * @return the GMF specific properties views
	 * 
	 */
	public Boolean getGMFSpecificPropertiesViews();

	/**
	 * Defines a new GMF specific properties views
	 * @param newValue the new GMF specific properties views to set
	 * 
	 */
	public void setGMFSpecificPropertiesViews(Boolean newValue);


	/**
	 * @return the JUnit test cases
	 * 
	 */
	public Boolean getJUnitTestCases();

	/**
	 * Defines a new JUnit test cases
	 * @param newValue the new JUnit test cases to set
	 * 
	 */
	public void setJUnitTestCases(Boolean newValue);


	/**
	 * @return the leafComponentsSuperClass
	 * 
	 */
	public String getLeafComponentsSuperClass();

	/**
	 * Defines a new leafComponentsSuperClass
	 * @param newValue the new leafComponentsSuperClass to set
	 * 
	 */
	public void setLeafComponentsSuperClass(String newValue);


	/**
	 * @return the propertiesEditingProvidersSuperClass
	 * 
	 */
	public String getPropertiesEditingProvidersSuperClass();

	/**
	 * Defines a new propertiesEditingProvidersSuperClass
	 * @param newValue the new propertiesEditingProvidersSuperClass to set
	 * 
	 */
	public void setPropertiesEditingProvidersSuperClass(String newValue);





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
