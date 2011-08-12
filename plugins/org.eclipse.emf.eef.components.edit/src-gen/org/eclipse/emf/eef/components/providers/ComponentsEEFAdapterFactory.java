/**
 *  Copyright (c) 2008 - 2010 Obeo.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *      Obeo - initial API and implementation
 *
 */
package org.eclipse.emf.eef.components.providers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.eef.components.util.ComponentsAdapterFactory;
import org.eclipse.emf.eef.mapping.providers.DocumentedElementPropertiesEditionProvider;
import org.eclipse.emf.eef.mapping.providers.EMFElementBindingPropertiesEditionProvider;
import org.eclipse.emf.eef.mapping.providers.EMFMultiPropertiesBindingPropertiesEditionProvider;
import org.eclipse.emf.eef.mapping.providers.EMFPropertyBindingPropertiesEditionProvider;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;


/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class ComponentsEEFAdapterFactory extends ComponentsAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.components.util.ComponentsAdapterFactory#createDocumentedElementAdapter()
	 * 
	 */
	public Adapter createDocumentedElementAdapter() {
		return new DocumentedElementPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.components.util.ComponentsAdapterFactory#createPropertiesEditionContextAdapter()
	 * 
	 */
	public Adapter createPropertiesEditionContextAdapter() {
		List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(1);
		providers.add((PropertiesEditingProvider)createDocumentedElementAdapter());
		return new PropertiesEditionContextPropertiesEditionProvider(providers);
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.components.util.ComponentsAdapterFactory#createEMFElementBindingAdapter()
	 * 
	 */
	public Adapter createEMFElementBindingAdapter() {
		List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(1);
		providers.add((PropertiesEditingProvider)createDocumentedElementAdapter());
		return new EMFElementBindingPropertiesEditionProvider(providers);
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.components.util.ComponentsAdapterFactory#createPropertiesEditionComponentAdapter()
	 * 
	 */
	public Adapter createPropertiesEditionComponentAdapter() {
		List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(1);
		providers.add((PropertiesEditingProvider)createDocumentedElementAdapter());
		return new PropertiesEditionComponentPropertiesEditionProvider(providers);
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.components.util.ComponentsAdapterFactory#createEMFPropertyBindingAdapter()
	 * 
	 */
	public Adapter createEMFPropertyBindingAdapter() {
		List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(1);
		providers.add((PropertiesEditingProvider)createDocumentedElementAdapter());
		return new EMFPropertyBindingPropertiesEditionProvider(providers);
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.components.util.ComponentsAdapterFactory#createPropertiesEditionElementAdapter()
	 * 
	 */
	public Adapter createPropertiesEditionElementAdapter() {
		List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(1);
		providers.add((PropertiesEditingProvider)createDocumentedElementAdapter());
		return new PropertiesEditionElementPropertiesEditionProvider(providers);
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.components.util.ComponentsAdapterFactory#createEMFMultiPropertiesBindingAdapter()
	 * 
	 */
	public Adapter createEMFMultiPropertiesBindingAdapter() {
		List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(1);
		providers.add((PropertiesEditingProvider)createDocumentedElementAdapter());
		return new EMFMultiPropertiesBindingPropertiesEditionProvider(providers);
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.components.util.ComponentsAdapterFactory#createPropertiesMultiEditionElementAdapter()
	 * 
	 */
	public Adapter createPropertiesMultiEditionElementAdapter() {
		List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(1);
		providers.add((PropertiesEditingProvider)createDocumentedElementAdapter());
		return new PropertiesMultiEditionElementPropertiesEditionProvider(providers);
	}

}
