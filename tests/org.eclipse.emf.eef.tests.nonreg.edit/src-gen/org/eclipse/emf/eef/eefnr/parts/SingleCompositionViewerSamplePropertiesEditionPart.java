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
package org.eclipse.emf.eef.eefnr.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.swt.events.ControlListener;




// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public interface SingleCompositionViewerSamplePropertiesEditionPart {

	/**
	 * @return the singlecompositionviewerSingleRequiredProperty
	 * 
	 */
	public EObject getSinglecompositionviewerSingleRequiredProperty();

	/**
	 * Init the singlecompositionviewerSingleRequiredProperty
	 * @param current the current value
	 * @param containingFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 * @param editingDomain
	 */
	public void initSinglecompositionviewerSingleRequiredProperty(EObject current, EReference containingFeature, EReference feature, EditingDomain editingDomain);

	/**
	 * Defines a new singlecompositionviewerSingleRequiredProperty
	 * @param newValue the new singlecompositionviewerSingleRequiredProperty to set
	 * 
	 */
	public void setSinglecompositionviewerSingleRequiredProperty(EObject newValue);

	/**
	 * Add a listener on singlecompositionviewerSingleRequiredProperty widget control.
	 * @param listener the Control Listener
	 */
	public void addSinglecompositionviewerSingleRequiredPropertyControlListener(ControlListener listener);


	/**
	 * @return the singlecompositionviewerSingleOptionalProperty
	 * 
	 */
	public EObject getSinglecompositionviewerSingleOptionalProperty();

	/**
	 * Init the singlecompositionviewerSingleOptionalProperty
	 * @param current the current value
	 * @param containingFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 * @param editingDomain
	 */
	public void initSinglecompositionviewerSingleOptionalProperty(EObject current, EReference containingFeature, EReference feature, EditingDomain editingDomain);

	/**
	 * Defines a new singlecompositionviewerSingleOptionalProperty
	 * @param newValue the new singlecompositionviewerSingleOptionalProperty to set
	 * 
	 */
	public void setSinglecompositionviewerSingleOptionalProperty(EObject newValue);

	/**
	 * Add a listener on singlecompositionviewerSingleOptionalProperty widget control.
	 * @param listener the Control Listener
	 */
	public void addSinglecompositionviewerSingleOptionalPropertyControlListener(ControlListener listener);


	/**
	 * @return the singlecompositionviewerMultiRequiredProperty
	 * 
	 */
	public EObject getSinglecompositionviewerMultiRequiredProperty();

	/**
	 * Init the singlecompositionviewerMultiRequiredProperty
	 * @param current the current value
	 * @param containingFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 * @param editingDomain
	 */
	public void initSinglecompositionviewerMultiRequiredProperty(EObject current, EReference containingFeature, EReference feature, EditingDomain editingDomain);

	/**
	 * Defines a new singlecompositionviewerMultiRequiredProperty
	 * @param newValue the new singlecompositionviewerMultiRequiredProperty to set
	 * 
	 */
	public void setSinglecompositionviewerMultiRequiredProperty(EObject newValue);

	/**
	 * Add a listener on singlecompositionviewerMultiRequiredProperty widget control.
	 * @param listener the Control Listener
	 */
	public void addSinglecompositionviewerMultiRequiredPropertyControlListener(ControlListener listener);


	/**
	 * @return the singlecompositionviewerMultiOptionalProperty
	 * 
	 */
	public EObject getSinglecompositionviewerMultiOptionalProperty();

	/**
	 * Init the singlecompositionviewerMultiOptionalProperty
	 * @param current the current value
	 * @param containingFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 * @param editingDomain
	 */
	public void initSinglecompositionviewerMultiOptionalProperty(EObject current, EReference containingFeature, EReference feature, EditingDomain editingDomain);

	/**
	 * Defines a new singlecompositionviewerMultiOptionalProperty
	 * @param newValue the new singlecompositionviewerMultiOptionalProperty to set
	 * 
	 */
	public void setSinglecompositionviewerMultiOptionalProperty(EObject newValue);

	/**
	 * Add a listener on singlecompositionviewerMultiOptionalProperty widget control.
	 * @param listener the Control Listener
	 */
	public void addSinglecompositionviewerMultiOptionalPropertyControlListener(ControlListener listener);





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
