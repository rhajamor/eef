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
package org.eclipse.emf.eef.runtime.ui.viewers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.DomainPropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditingContext;
import org.eclipse.emf.eef.runtime.notify.PropertiesEditingEvent;
import org.eclipse.emf.eef.runtime.notify.PropertiesEditingListener;
import org.eclipse.emf.eef.runtime.parts.PropertiesEditingPart;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.utils.EEFRuntimeUIMessages;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 */
public class PropertiesEditingContentProvider implements IStructuredContentProvider {

	private AdapterFactory adapterFactory;

	private PropertiesEditingComponent propertiesEditingComponent;

	private String mode;

	private EditingDomain editingDomain;

	private List<PropertiesEditingListener> propertiesEditingListeners;

	/**
	 * @param adapterFactory
	 */
	public PropertiesEditingContentProvider(AdapterFactory adapterFactory, String mode) throws InstantiationException {
		if (mode == PropertiesEditingComponent.LIVE_MODE)
			throw new InstantiationException(
					EEFRuntimeUIMessages.PropertiesEditingContentProvider_editingDomain_not_defined);
		this.adapterFactory = adapterFactory;
		this.mode = mode;
		this.propertiesEditingListeners = new ArrayList<PropertiesEditingListener>();
	}

	/**
	 * @param adapterFactory
	 */
	public PropertiesEditingContentProvider(AdapterFactory adapterFactory, String mode, EditingDomain editingDomain) {
		this.adapterFactory = adapterFactory;
		this.mode = mode;
		this.editingDomain = editingDomain;
		this.propertiesEditingListeners = new ArrayList<PropertiesEditingListener>();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.viewers.IContentProvider#dispose()
	 */
	public void dispose() {
		if (propertiesEditingComponent != null) {
//			PropertiesContextService.getInstance().pop();
			propertiesEditingComponent.dispose();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.viewers.IContentProvider#inputChanged(org.eclipse.jface.viewers.Viewer,
	 *      java.lang.Object, java.lang.Object)
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		if (propertiesEditingComponent != null) {
//			PropertiesContextService.getInstance().pop();
			propertiesEditingComponent.dispose();
			propertiesEditingComponent = null;
		}
		EObject eObject = null;
		PropertiesEditingContext context = null;
		if (newInput instanceof EObject) {
			eObject = (EObject)newInput;
			if (mode == PropertiesEditingComponent.LIVE_MODE) {
				context = new DomainPropertiesEditingContext(null, null, editingDomain, adapterFactory, eObject);
			} else if (mode == PropertiesEditingComponent.BATCH_MODE) {
				context = new EObjectPropertiesEditingContext(null, null, eObject, adapterFactory);
			}
		} else if (newInput instanceof EObjectPropertiesEditingContext) {
			context = (PropertiesEditingContext)newInput;
			eObject = context.getEObject();
		}
		if (eObject != null) {
			PropertiesEditingProvider propertiesEditingProvider = (PropertiesEditingProvider)adapterFactory.adapt(eObject, PropertiesEditingProvider.class);
			if (propertiesEditingProvider != null) {
				this.propertiesEditingComponent = propertiesEditingProvider.getPropertiesEditingComponent(context, mode);
				if (mode == PropertiesEditingComponent.LIVE_MODE) {
					propertiesEditingComponent.setLiveEditingDomain(editingDomain);
				}
				updateListeners();
			}
		}
		
	}

	/**
	 * @param listener
	 *            the properties listener to add
	 */
	public void addPropertiesListener(PropertiesEditingListener listener) {
		propertiesEditingListeners.add(listener);
		if (propertiesEditingComponent != null)
			propertiesEditingComponent.addListener(listener);
	}

	/**
	 * Validate the model and return the resulting Diagnostic
	 * 
	 * @param event
	 *            the event triggering the validation
	 * @return the resulting value
	 */
	public Diagnostic validateValue(PropertiesEditingEvent event) {
		if (propertiesEditingComponent != null)
			return propertiesEditingComponent.validateValue(event);
		return null;
	}

	/**
	 * Returns the Edition Parts list.
	 * 
	 * @return a String array with all parts keys
	 */
	public String[] partsList() {
		if (propertiesEditingComponent != null)
			return propertiesEditingComponent.partsList();
		return new String[0];
	}

	/**
	 * Return the Edition Part in the given context.
	 * 
	 * @param kind
	 *            the kind of the expected Part
	 * @param key
	 *            the Part key
	 * @return the Part created in the parent
	 */
	public PropertiesEditingPart getPropertiesEditingPart(int kind, String key) {
		if (propertiesEditingComponent != null)
			return propertiesEditingComponent.getPropertiesEditingPart(kind, key);
		return null;
	}

	/**
	 * This method translate a Part name into his identifier
	 * 
	 * @param key
	 *            the part name
	 * @return the key identifying the part
	 */
	public Object translatePart(String key) {
		if (propertiesEditingComponent != null)
			return propertiesEditingComponent.translatePart(key);
		return null;
	}

	/**
	 * @param key
	 *            the key identifying the ElementEditor
	 * @param kind
	 *            the kind of the part
	 * @param element
	 *            the element which initialize the part
	 */
	public void initPart(Object key, int kind, EObject element) {
		if (propertiesEditingComponent != null)
			propertiesEditingComponent.initPart(key, kind, element);
	}

	/**
	 * @param key
	 *            the key identifying the ElementEditor
	 * @param kind
	 *            the kind of the part
	 * @param element
	 *            the element which initialize the part
	 * @param allResources
	 *            the resource where the part has to process
	 */
	public void initPart(Object key, int kind, EObject element, ResourceSet allResources) {
		if (propertiesEditingComponent != null)
			propertiesEditingComponent.initPart(key, kind, element, allResources);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.viewers.IStructuredContentProvider#getElements(java.lang.Object)
	 */
	public Object[] getElements(Object inputElement) {
		return new Object[] {inputElement};
	}

	/**
	 * 
	 */
	protected void updateListeners() {
		for (PropertiesEditingListener listener : propertiesEditingListeners) {
			propertiesEditingComponent.addListener(listener);
		}
	}

}
