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
package org.eclipse.emf.eef.runtime.parts.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.notify.PropertiesEditingEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

/**
 * A "Null Object" implementation for the {@link CompositePropertiesEditingPart} .
 * 
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 */
public class NullCompositePropertiesEditingPart extends CompositePropertiesEditingPart {

	/**
	 * Default constructor.
	 * 
	 * @param editionComponent
	 *            the edition component.
	 */
	public NullCompositePropertiesEditingPart(PropertiesEditingComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.parts.impl.CompositePropertiesEditingPart#createFigure(org.eclipse.swt.widgets.Composite)
	 */
	public Composite createFigure(Composite parent) {
		return new Composite(parent, SWT.NONE);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.parts.impl.CompositePropertiesEditingPart#initComponent(org.eclipse.emf.ecore.EObject)
	 */
	public void initComponent(EObject eObject) {
		// nothing
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.notify.PropertiesEditingListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.notify.PropertiesEditingEvent)
	 */
	public void firePropertiesChanged(PropertiesEditingEvent event) {
		// nothing
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.parts.PropertiesEditingPart#requiredFeaturesNotEmpty()
	 */
	public List requiredFeaturesNotEmpty() {
		// Nothing to do
		return new ArrayList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.parts.PropertiesEditingPart#typeValidation()
	 */
	public List typeValidation() {
		// Nothing to do
		return new ArrayList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.parts.PropertiesEditingPart#getTitle()
	 */
	public String getTitle() {
		return ""; //$NON-NLS-1$
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.parts.PropertiesEditingPart#isVisible()
	 */
	public boolean isVisible() {
		return false;
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.parts.PropertiesEditingPart#setVisible(boolean)
	 */
	public void setVisible(boolean visibility) {
		
	}
	
	
}
