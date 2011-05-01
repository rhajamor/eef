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

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.parts.PropertiesEditingPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.jface.databinding.swt.ISWTObservableValue;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.forms.IMessageManager;

/**
 * A standard implementation of the {@link PropertiesEditingPart} by a SWT {@link Composite}.
 * 
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 */
public abstract class CompositePropertiesEditingPart implements PropertiesEditingPart {

	/**
	 * The component that manage this part.
	 */
	protected PropertiesEditingComponent propertiesEditingComponent;

	/**
	 * The part view.
	 */
	protected Composite view;

	/**
	 * Helper to use to create the part.
	 */
	protected PartComposer composer;

	/**
	 * The message manager.
	 */
	protected IMessageManager messageManager;

	/**
	 * The adapter factory.
	 */
	protected AdapterFactory adapterFactory;

	/**
	 * The edited element
	 */
	protected EObject current;

	/**
	 * the current ResourceSet
	 */
	protected ResourceSet resourceSet;

	/**
	 * Defines if part has changed
	 */
	protected boolean partHasChanged = false;
	
	/**
	 * Defines the part visibility.
	 */
	protected boolean visibility = true;

	/**
	 * Parameterized constructeur.
	 * 
	 * @param editionComponent
	 *            the component that manage this part
	 */
	public CompositePropertiesEditingPart(PropertiesEditingComponent editionComponent) {
		this.propertiesEditingComponent = editionComponent;
		this.adapterFactory = propertiesEditingComponent.getEditingContext().getAdapterFactory();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.parts.PropertiesEditingPart#setContext(org.eclipse.emf.ecore.EObject,
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 */
	public void setContext(EObject eObject, ResourceSet allResources) {
		this.current = eObject;
		this.resourceSet = allResources;
	}

	/**
	 * Getter for the view
	 * 
	 * @return the part view
	 */
	public Composite getFigure() {
		return view;
	}

	/**
	 * @return the composer
	 */
	public PartComposer getComposer() {
		return composer;
	}

	/**
	 * @param event
	 */
	public void handleNotificationEvent(Notification event) {
		partHasChanged = true;
	}

	/**
	 * Return <code>true</code> if part has changed
	 * 
	 * @return the hasChanged
	 */
	public boolean hasChanged() {
		return partHasChanged;
	}

	/**
	 * @param partHasChanged
	 *            the partHasChanged to set
	 */
	protected void setHasChanged(boolean partHasChanged) {
		this.partHasChanged = partHasChanged;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.parts.PropertiesEditingPart#getObserver(java.lang.String)
	 */
	public ISWTObservableValue getObserver(String key) {
		return null;
	}

	/**
	 * Refresh the part
	 */
	public void refresh() {
		clear();
		composer.compose(view);
		view.layout();
	}

	/**
	 * Clear all the graphical elements of the view
	 */
	private void clear() {
//		for (int i = 0; i < view.getChildren().length; i++) {
		while (view.getChildren().length > 0) {
			Control next = view.getChildren()[0];
			next.dispose();
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.parts.PropertiesEditingPart#isVisible()
	 */
	public boolean isVisible() {
		return visibility;
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.parts.PropertiesEditingPart#setVisible(boolean)
	 */
	public void setVisible(boolean visibility) {
		this.visibility = visibility;
	}
	
	

}
