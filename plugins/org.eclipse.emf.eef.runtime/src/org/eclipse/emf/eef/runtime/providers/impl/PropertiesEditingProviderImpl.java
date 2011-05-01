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
package org.eclipse.emf.eef.runtime.providers.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditingContext;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;
import org.eclipse.emf.eef.runtime.policies.impl.StandardEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 */
public abstract class PropertiesEditingProviderImpl extends AdapterImpl implements PropertiesEditingProvider {

	private List<PropertiesEditingProvider> superProviders;

	/**
	 * @param superProviders
	 */
	public PropertiesEditingProviderImpl() {
		this.superProviders = new ArrayList<PropertiesEditingProvider>();
	}

	/**
	 * @param superProviders
	 */
	public PropertiesEditingProviderImpl(List<PropertiesEditingProvider> superProviders) {
		this.superProviders = superProviders;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicyProvider#getPolicy(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext)
	 */
	public PropertiesEditingPolicy getPolicy(PropertiesEditingContext context) {
		if (context instanceof EReferencePropertiesEditingContext) {
			return new CreateEditingPolicy((EReferencePropertiesEditingContext)context);
		}
		if (context instanceof EObjectPropertiesEditingContext) {
			return new StandardEditingPolicy((PropertiesEditingContext)context);
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext,
	 *      java.lang.String)
	 */
	public PropertiesEditingComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext, String mode) {
		for (PropertiesEditingProvider provider : superProviders) {
			PropertiesEditingComponent propertiesEditingComponent = provider.getPropertiesEditingComponent(editingContext, mode);
			if (propertiesEditingComponent != null) {
				return propertiesEditingComponent;
			}
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext,
	 *      java.lang.String, java.lang.String)
	 */
	public PropertiesEditingComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext, String mode, String part) {
		for (PropertiesEditingProvider provider : superProviders) {
			PropertiesEditingComponent propertiesEditingComponent = provider.getPropertiesEditingComponent(editingContext, mode, part);
			if (propertiesEditingComponent != null) {
				return propertiesEditingComponent;
			}
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext,
	 *      java.lang.String, java.lang.String, java.lang.Class)
	 */
	public PropertiesEditingComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext, String mode, String part, Class refinement) {
		for (PropertiesEditingProvider provider : superProviders) {
			PropertiesEditingComponent propertiesEditingComponent = provider.getPropertiesEditingComponent(editingContext, mode, part, refinement);
			if (propertiesEditingComponent != null) {
				return propertiesEditingComponent;
			}
		}
		return null;
	}

}
