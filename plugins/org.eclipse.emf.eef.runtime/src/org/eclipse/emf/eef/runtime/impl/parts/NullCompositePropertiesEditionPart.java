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
package org.eclipse.emf.eef.runtime.impl.parts;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

/**
 * A "Null Object" implementation for the {@link CompositePropertiesEditionPart} .
 * 
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 */
public class NullCompositePropertiesEditionPart extends CompositePropertiesEditionPart {

	/**
	 * Default constructor.
	 * 
	 * @param editionComponent
	 *            the edition component.
	 */
	public NullCompositePropertiesEditionPart(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart#createFigure(org.eclipse.swt.widgets.Composite)
	 */
	public Composite createFigure(Composite parent) {
		return new Composite(parent, SWT.NONE);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart#initComponent(org.eclipse.emf.ecore.EObject)
	 */
	public void initComponent(EObject eObject) {
		// nothing
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// nothing
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#requiredFeaturesNotEmpty()
	 */
	public List requiredFeaturesNotEmpty() {
		// Nothing to do
		return new ArrayList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#typeValidation()
	 */
	public List typeValidation() {
		// Nothing to do
		return new ArrayList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 */
	public String getTitle() {
		return ""; //$NON-NLS-1$
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#isVisible()
	 */
	public boolean isVisible() {
		return false;
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#setVisible(boolean)
	 */
	public void setVisible(boolean visibility) {
		
	}
	
	
}
