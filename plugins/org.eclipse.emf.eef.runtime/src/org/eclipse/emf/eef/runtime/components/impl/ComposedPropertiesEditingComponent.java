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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.notify.PropertiesEditingEvent;
import org.eclipse.emf.eef.runtime.notify.PropertiesEditingListener;
import org.eclipse.emf.eef.runtime.parts.PropertiesEditingPart;
import org.eclipse.emf.eef.runtime.parts.impl.NullCompositePropertiesEditingPart;
import org.eclipse.emf.eef.runtime.util.EEFRuntimeMessages;
import org.eclipse.emf.eef.runtime.util.StringTools;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël Barbero</a>
 */
public class ComposedPropertiesEditingComponent implements PropertiesEditingComponent {

	/**
	 * List of managed components
	 */
	protected List<PropertiesEditingComponent> subComponents;

	/**
	 * List of this component listeners
	 */
	private List<PropertiesEditingListener> listeners;

	/**
	 * The current editingContext
	 */
	private PropertiesEditingContext editingContext;

	/**
	 * Default constructor
	 */
	public ComposedPropertiesEditingComponent(PropertiesEditingContext editingContext, String mode) {
		this.editingContext = editingContext;
		this.subComponents = new ArrayList<PropertiesEditingComponent>();
		this.listeners = new ArrayList<PropertiesEditingListener>();
	}

	/**
	 * Parameterized constructor
	 * 
	 * @param subComponents
	 *            list of the managed components
	 */
	public ComposedPropertiesEditingComponent(List<PropertiesEditingComponent> subComponents) {
		this.subComponents = subComponents;
		this.listeners = new ArrayList<PropertiesEditingListener>();
		for (PropertiesEditingComponent component : subComponents) {
			listeners.add(component);
			component.addListener(this);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent#setLiveEditingDomain(org.eclipse.emf.edit.domain.EditingDomain)
	 */
	public void setLiveEditingDomain(EditingDomain editingDomain) {
		for (PropertiesEditingComponent component : subComponents) {
			component.setLiveEditingDomain(editingDomain);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent#partsList()
	 */
	public String[] partsList() {
		List<String> partsList = new ArrayList<String>();
		for (PropertiesEditingComponent component : subComponents) {
			String[] partsList2 = component.partsList();
			for (int i = 0; i < partsList2.length; i++) {
				String string = partsList2[i];
				if (!partsList.contains(string))
					partsList.add(string);
			}
		}
		String[] result = new String[partsList.size()];
		int i = 0;
		for (String nextPart : partsList) {
			result[i++] = nextPart;
		}
		return result;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent#initPart(java.lang.Object,
	 *      int, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.resource.ResourceSet)
	 */
	public void initPart(Object key, int kind, EObject element, ResourceSet allResource) {
		for (PropertiesEditingComponent component : subComponents) {
			component.initPart(key, kind, element, allResource);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent#initPart(java.lang.Object,
	 *      int, org.eclipse.emf.ecore.EObject)
	 */
	public void initPart(Object key, int kind, EObject element) {
		this.initPart(key, kind, element, element.eResource().getResourceSet());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent#getPropertiesEditingPart(java.lang.String,
	 *      java.lang.String)
	 */
	public PropertiesEditingPart getPropertiesEditingPart(int kind, String key) {
		for (PropertiesEditingComponent component : subComponents) {
			PropertiesEditingPart propertiesEditingPart = component.getPropertiesEditingPart(kind, key);
			if (propertiesEditingPart != null
					&& !(propertiesEditingPart instanceof NullCompositePropertiesEditingPart))
				return propertiesEditingPart;
		}
		return new NullCompositePropertiesEditingPart(this);
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
	 * @see org.eclipse.emf.eef.runtime.notify.PropertiesEditingListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.notify.PropertiesEditingEvent)
	 */
	public void firePropertiesChanged(PropertiesEditingEvent event) {
		event.addHolder(this);
		for (PropertiesEditingListener listener : listeners) {
			if (!event.hold(listener))
				listener.firePropertiesChanged(event);
		}
	}

	public void delayedFirePropertiesChanged(PropertiesEditingEvent event) {
		for (PropertiesEditingComponent propertiesEditingComponent : subComponents) {
			if (!event.hold(propertiesEditingComponent))
				propertiesEditingComponent.delayedFirePropertiesChanged(event);
		}
	}

	public void activate() {
		for (PropertiesEditingComponent propertiesEditingComponent : subComponents) {
			propertiesEditingComponent.activate();
		}
	}

	public void deactivate() {
		for (PropertiesEditingComponent propertiesEditingComponent : subComponents) {
			propertiesEditingComponent.deactivate();
		}
	}

	/**
	 * Add a new component of the managed components
	 * 
	 * @param component
	 *            the component to add
	 */
	public void addSubComponent(PropertiesEditingComponent component) {
		if (subComponents != null && listeners != null) {
			subComponents.add(component);
			listeners.add(component);
			component.addListener(this);
		}
	}

	/**
	 * Remove a component from the managed components
	 * 
	 * @param component
	 *            the component to removed
	 */
	public void removeSubComponent(PropertiesEditingComponent component) {
		if (subComponents != null && listeners != null) {
			component.removeListener(this);
			subComponents.remove(component);
			listeners.remove(component);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent#addListener(org.eclipse.emf.eef.runtime.notify.PropertiesEditingListener)
	 */
	public void addListener(PropertiesEditingListener listener) {
		if (listeners == null)
			listeners = new ArrayList<PropertiesEditingListener>();
		listeners.add(listener);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent#removeListener(org.eclipse.emf.eef.runtime.notify.PropertiesEditingListener)
	 */
	public void removeListener(PropertiesEditingListener listener) {
		if (listeners != null)
			listeners.remove(listener);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent#validateValue(org.eclipse.emf.eef.runtime.notify.PropertiesEditingEvent)
	 */
	public Diagnostic validateValue(PropertiesEditingEvent event) {
		BasicDiagnostic diagnostic = new BasicDiagnostic(Diagnostic.OK,
				EEFRuntimeMessages.ComposedPropertiesEditingComponent_eef_validation_diagnostic, 0,
				EEFRuntimeMessages.ComposedPropertiesEditingComponent_no_problem, null);
		for (PropertiesEditingComponent component : subComponents) {
			Diagnostic validateValue = component.validateValue(event);
			if (validateValue != null)
				diagnostic.add(validateValue);
		}
		diagnostic.recomputeSeverity();
		return diagnostic;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent#validate()
	 */
	public Diagnostic validate() {
		BasicDiagnostic diagnostic = new BasicDiagnostic(Diagnostic.OK,
				EEFRuntimeMessages.ComposedPropertiesEditingComponent_eef_validation_diagnostic, Status.OK,
				EEFRuntimeMessages.ComposedPropertiesEditingComponent_no_problem, null);
		for (PropertiesEditingComponent component : subComponents) {
			diagnostic.getChildren().add(component.validate());
		}
		return diagnostic;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent#dispose()
	 */
	public void dispose() {
		for (PropertiesEditingComponent component : subComponents) {
			component.dispose();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent#mustBeComposed(java.lang.Object,
	 *      int) Very strange case ... shouldn't be invoke ...
	 */
	public boolean mustBeComposed(Object key, int kind) {
		for (PropertiesEditingComponent component : subComponents) {
			if (!component.mustBeComposed(key, kind))
				return false;
		}
		return true;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent#isRequired(java.lang.Object,
	 *      int)
	 */
	public boolean isRequired(Object key, int kind) {
		for (PropertiesEditingComponent component : subComponents) {
			if (component.isRequired(key, kind))
				return true;
		}
		return false;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent#getHelpContent(java.lang.String,
	 *      int)
	 */
	public String getHelpContent(Object key, int kind) {
		for (PropertiesEditingComponent component : subComponents) {
			if (component.getHelpContent(key, kind) != StringTools.EMPTY_STRING)
				return component.getHelpContent(key, kind);
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent#translatePart(java.lang.String)
	 */
	public Object translatePart(String key) {
		for (PropertiesEditingComponent component : subComponents) {
			if (component.translatePart(key) != null)
				return component.translatePart(key);
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent#setPropertiesEditingPart(java.lang.Object,
	 *      int, org.eclipse.emf.eef.runtime.parts.PropertiesEditingPart)
	 */
	public void setPropertiesEditingPart(Object key, int kind, PropertiesEditingPart propertiesEditingPart) {
		for (PropertiesEditingComponent component : subComponents) {
			component.setPropertiesEditingPart(key, kind, propertiesEditingPart);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent#getTabText(java.lang.Object)
	 */
	public String getTabText(String key) {
		for (PropertiesEditingComponent component : subComponents) {
			PropertiesEditingPart part = component.getPropertiesEditingPart(0, key);
			if (part != null)
				return part.getTitle();
		}
		return key;
	}

}
