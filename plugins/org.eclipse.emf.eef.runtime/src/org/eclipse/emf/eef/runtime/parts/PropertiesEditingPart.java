/*******************************************************************************
 * Copyright (c) 2008, 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.runtime.parts;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.eef.runtime.notify.PropertiesEditingListener;
import org.eclipse.jface.databinding.swt.ISWTObservableValue;
import org.eclipse.swt.widgets.Composite;

/**
 * A interface for part of element edition.
 * 
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 */
public interface PropertiesEditingPart extends PropertiesEditingListener {

	/**
	 * Getter for the view
	 * 
	 * @return the part view
	 */
	public Composite getFigure();

	/**
	 * Defines the context (edited element, resourceset) of the part
	 * 
	 * @param eObject
	 *            the EObject to edit
	 * @param allResources
	 *            the resourceset where edit
	 */
	public void setContext(EObject eObject, ResourceSet allResources);

	/**
	 * Return an observer on the given Element Editor
	 * 
	 * @param key
	 *            the key qualifying the Element Editor
	 * @return an observer on the given Element Editor
	 */
	public ISWTObservableValue getObserver(String key);

	/**
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 */
	public String getTitle();
	
	
	/**
	 * @return <code>true</code> if the part is visible
	 */
	public boolean isVisible();
	
	/**
	 * Defines the part visibility.
	 * @param visibility to set.
	 */
	public void setVisible(boolean visibility);
}
