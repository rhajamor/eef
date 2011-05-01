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
package org.eclipse.emf.eef.runtime.components.impl;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;
import org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.notify.PropertiesEditingListener;
import org.eclipse.emf.eef.runtime.parts.PropertiesEditingPart;
import org.eclipse.emf.eef.runtime.parts.impl.CompositePropertiesEditingPart;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingPartProvider;
import org.eclipse.emf.eef.runtime.services.PropertiesEditingPartProviderService;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël Barbero</a>
 */
public abstract class SinglePartPropertiesEditingComponent extends StandardPropertiesEditingComponent {

	/**
	 * EObject to edit
	 */
	protected EObject semanticObject;

	/**
	 * Component's part
	 */
	protected PropertiesEditingPart editingPart;

	/**
	 * Key to use to get the Part provider
	 */
	protected java.lang.Object repositoryKey;

	/**
	 * Key to use to get the Part
	 */
	protected java.lang.Object partKey;

	/**
	 * Default constructor
	 */
	public SinglePartPropertiesEditingComponent(PropertiesEditingContext editingContext,
			EObject semanticObject, String editing_mode) {
		this.semanticObject = semanticObject;
		this.editingContext = editingContext;
		if (PropertiesEditingComponent.LIVE_MODE.equals(editing_mode)) {
			semanticAdapter = initializeSemanticAdapter();
		}
		this.editing_mode = editing_mode;
		activate();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see PropertiesEditingComponent#activate()
	 */
	public void activate() {
		if (semanticAdapter != null) {
			this.semanticObject.eAdapters().add(semanticAdapter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see PropertiesEditingComponent#deactivate()
	 */
	public void deactivate() {
		if (semanticAdapter != null) {
			this.semanticObject.eAdapters().remove(semanticAdapter);
		}
	}

	/**
	 * @return
	 */
	private String partID() {
		return parts[0];
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.components.impl.StandardPropertiesEditingComponent#translatePart(java.lang.String)
	 */
	public java.lang.Object translatePart(String key) {
		if (partID().equals(key))
			return partKey;
		return super.translatePart(key);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.components.impl.StandardPropertiesEditingComponent#
	 *      setPropertiesEditingPart(java.lang.Object, int,
	 *      org.eclipse.emf.eef.runtime.parts.PropertiesEditingPart)
	 */
	public void setPropertiesEditingPart(java.lang.Object key, int kind, PropertiesEditingPart propertiesEditingPart) {
		if (key == partKey) {
			this.editingPart = propertiesEditingPart;
			if (semanticAdapter != null)
				semanticAdapter.setPart(editingPart);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent#getEditingContext()
	 */
	public PropertiesEditingContext getEditingContext() {
		return editingContext;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent#validate()
	 */
	public Diagnostic validate() {
		Diagnostic validate = Diagnostic.OK_INSTANCE;
		validate = EEFRuntimePlugin.getEEFValidator().validate(semanticObject);
		return validate;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent#dispose()
	 */
	public void dispose() {
		deactivate();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent#getPropertiesEditingPart
	 *      (java.lang.String, java.lang.String)
	 */
	public PropertiesEditingPart getPropertiesEditingPart(int kind, String key) {
		if (semanticObject != null && partID().equals(key)) {
			if (editingPart == null) {
				PropertiesEditingPartProvider provider = PropertiesEditingPartProviderService.getInstance()
						.getProvider(repositoryKey);
				if (provider != null) {
					editingPart = provider.getPropertiesEditingPart(partKey, kind, this);
					addListener((PropertiesEditingListener)editingPart);
					if (semanticAdapter != null)
						semanticAdapter.setPart(editingPart);
				}
			}
			return (PropertiesEditingPart)editingPart;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent#getTabText(java.lang.String)
	 */
	public String getTabText(String p_key) {
		return editingPart.getTitle();
	}

	/**
	 * @param key of the editor to ckeck
	 * @return <code>true</code> is the editor is visible.
	 */
	public boolean isAccessible(Object key) {
		if (editingPart != null && ((CompositePropertiesEditingPart)editingPart).getComposer() != null) {
			return ((CompositePropertiesEditingPart)editingPart).getComposer().isVisible(key);
		}
		return false;
	}
}
