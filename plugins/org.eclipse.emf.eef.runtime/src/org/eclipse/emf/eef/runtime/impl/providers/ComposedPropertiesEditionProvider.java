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
package org.eclipse.emf.eef.runtime.impl.providers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.providers.impl.PropertiesEditingProviderImpl;

/**
 * An implementation of {@link PropertiesEditingProvider} composing several {@link PropertiesEditingProvider}.
 * 
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 */
public class ComposedPropertiesEditionProvider extends PropertiesEditingProviderImpl {

	/**
	 * The managed providers.
	 */
	private List<PropertiesEditingProvider> editPropertiesProviders;

	/**
	 * Default constructor.
	 */
	public ComposedPropertiesEditionProvider() {
		editPropertiesProviders = new ArrayList<PropertiesEditingProvider>();
	}

	/**
	 * Constructor with initialized providers.
	 * 
	 * @param editPropertiesProviders
	 *            the initialized providers
	 */
	public ComposedPropertiesEditionProvider(List<PropertiesEditingProvider> editPropertiesProviders) {
		this.editPropertiesProviders = editPropertiesProviders;
	}

	/**
	 * Append a IEditPropertiesProvider to the list
	 * 
	 * @param editPropertiesProvider
	 *            the IEditPropertiesProvider to add
	 */
	public void append(PropertiesEditingProvider editPropertiesProvider) {
		editPropertiesProviders.add(editPropertiesProvider);
	}

	/**
	 * @param clazz
	 * @param editPropertiesProvider
	 * @deprecated use the PropertiesEditionProvider extension point
	 */
	public void replace(Class clazz, PropertiesEditingProvider editPropertiesProvider) {
		for (int i = 0; i < editPropertiesProviders.size(); i++) {
			PropertiesEditingProvider provider = editPropertiesProviders.get(i);
			if (clazz.isInstance(provider))
				editPropertiesProviders.set(i, editPropertiesProvider);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext)
	 */
	public boolean provides(PropertiesEditingContext editingContext) {
		for (PropertiesEditingProvider editPropertiesProvider : editPropertiesProviders) {
			if (editPropertiesProvider.provides(editingContext))
				return true;
		}
		return false;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext,
	 *      java.lang.String)
	 */
	public boolean provides(PropertiesEditingContext editingContext, String part) {
		for (PropertiesEditingProvider editPropertiesProvider : editPropertiesProviders) {
			if (editPropertiesProvider.provides(editingContext, part))
				return true;
		}
		return false;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext,
	 *      java.lang.Class)
	 */
	public boolean provides(PropertiesEditingContext editingContext, Class refinement) {
		for (PropertiesEditingProvider editPropertiesProvider : editPropertiesProviders) {
			if (editPropertiesProvider.provides(editingContext, refinement))
				return true;
		}
		return false;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext,
	 *      java.lang.String, java.lang.Class)
	 */
	public boolean provides(PropertiesEditingContext editingContext, String part, Class refinement) {
		for (PropertiesEditingProvider editPropertiesProvider : editPropertiesProviders) {
			if (editPropertiesProvider.provides(editingContext, part, refinement))
				return true;
		}
		return false;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext,
	 *      java.lang.String)
	 */
	public IPropertiesEditionComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext,
			String mode) {
		for (PropertiesEditingProvider editPropertiesProvider : editPropertiesProviders) {
			if (editPropertiesProvider.provides(editingContext))
				return editPropertiesProvider.getPropertiesEditingComponent(editingContext, mode);
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext,
	 *      java.lang.String, java.lang.String)
	 */
	public IPropertiesEditionComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext,
			String mode, String part) {
		for (PropertiesEditingProvider editPropertiesProvider : editPropertiesProviders) {
			if (editPropertiesProvider.provides(editingContext, part))
				return editPropertiesProvider.getPropertiesEditingComponent(editingContext, mode, part);
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext,
	 *      java.lang.String, java.lang.String, java.lang.Class)
	 */
	public IPropertiesEditionComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext,
			String mode, String part, Class refinement) {
		for (PropertiesEditingProvider editPropertiesProvider : editPropertiesProviders) {
			if (editPropertiesProvider.provides(editingContext, part, refinement))
				return editPropertiesProvider.getPropertiesEditingComponent(editingContext, mode, part,
						refinement);
		}
		return null;
	}

}
