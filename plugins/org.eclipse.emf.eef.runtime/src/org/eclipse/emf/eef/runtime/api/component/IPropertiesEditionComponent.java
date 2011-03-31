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
package org.eclipse.emf.eef.runtime.api.component;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;

/**
 * A stateful element to edit an EObject divided in one or more parts.
 * 
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël Barbero</a>
 */
public interface IPropertiesEditionComponent extends IPropertiesEditionListener {

	public static final String BATCH_MODE = "Batch"; //$NON-NLS-1$

	public static final String LIVE_MODE = "Live"; //$NON-NLS-1$

	/**
	 * Returns the Edition Parts list.
	 * 
	 * @return a String array with all parts keys
	 */
	public abstract String[] partsList();

	/**
	 * Return the Edition Part in the given context.
	 * 
	 * @param kind
	 *            the kind of the expected Part
	 * @param key
	 *            the Part key
	 * @return the Part created in the parent
	 */
	public abstract IPropertiesEditionPart getPropertiesEditionPart(int kind, String key);

	/**
	 * @return the current editingContext
	 */
	public abstract PropertiesEditingContext getEditingContext();

	/**
	 * @param key
	 *            the key identifying the ElementEditor
	 * @param kind
	 *            the kind of the part
	 * @param element
	 *            the element which initialize the part
	 * @param allResource
	 *            the resource where the part has to process
	 */
	public abstract void initPart(Object key, int kind, EObject element, ResourceSet allResource);

	/**
	 * @param key
	 *            the key identifying the ElementEditor
	 * @param kind
	 *            the kind of the part
	 * @param element
	 *            the element which initialize the part
	 */
	public abstract void initPart(Object key, int kind, EObject element);

	/**
	 * Return the diagnostic object linked to the current state validation.
	 * 
	 * @return a list of errors message
	 */
	public Diagnostic validateValue(IPropertiesEditionEvent event);

	/**
	 * Return the diagnostic object linked to the edited element.
	 * 
	 * @return a list of errors message
	 */
	public Diagnostic validate();

	/**
	 * Specifies that a feature value has changed and will be fired later.
	 * 
	 * @param event
	 */
	void delayedFirePropertiesChanged(IPropertiesEditionEvent event);

	/**
	 * Activates this controller. Do nothing it it is already activated.
	 */
	public void activate();

	/**
	 * Deactivates this controller. Do nothing if it is not activated.
	 */
	public void deactivate();

	/**
	 * Listening management - Adding a new listener.
	 * 
	 * @param listener
	 *            the new listener to notify
	 */
	public void addListener(IPropertiesEditionListener listener);

	/**
	 * Listening management - Removing a new listener.
	 * 
	 * @param listener
	 *            the listener to no longer notify
	 */
	public void removeListener(IPropertiesEditionListener listener);

	/**
	 * Allows to define editingDomain for live synchronization
	 * 
	 * @param editingDomain
	 *            the editingDomain to define
	 */
	public void setLiveEditingDomain(EditingDomain editingDomain);

	/**
	 * Dispose the component
	 */
	public void dispose();

	/**
	 * Set a part of the Component
	 * 
	 * @param key
	 *            the key identifying the part
	 * @param kind
	 *            the kind of the part
	 * @param propertiesEditionPart
	 *            the part to set
	 */
	public void setPropertiesEditionPart(Object key, int kind, IPropertiesEditionPart propertiesEditionPart);

	/**
	 * In dynamic case, managed PropertiesEditionPart can ask the component do decide if they compose a
	 * sub-view or not
	 * 
	 * @param key
	 *            the sub-view to check
	 * @param kind
	 *            the of the view
	 * @return <code>true</code> if the sub-view must be composed
	 */
	public boolean mustBeComposed(Object key, int kind);

	/**
	 * This method allow managed PropertiesEditionPart to ask the component if a elementEditor is required or
	 * not
	 * 
	 * @param key
	 *            the key identifying the ElementEditor
	 * @param kind
	 *            the kind of the part
	 * @return <code>true</code> if the given ElementEditor if required
	 */
	public boolean isRequired(Object key, int kind);

	/**
	 * This method allow managed PropertiesEditionPart to ask the component for an ElementEditor help
	 * documentation
	 * 
	 * @param key
	 *            the key identifying the ElementEditor
	 * @param kind
	 *            the kind of the part
	 * @return the help content for the given ElementEditor according the help strategy
	 */
	public String getHelpContent(Object key, int kind);

	/**
	 * This method translate a Part name into his identifier
	 * 
	 * @param key
	 *            the part name
	 * @return the key identifying the part
	 */
	public Object translatePart(String key);

	/**
	 * Returns the internationalized text for the specified tab ( in wizards )
	 * 
	 * @param key
	 *            the tab key
	 * @return the internationalized message
	 */
	public String getTabText(String key);
}
