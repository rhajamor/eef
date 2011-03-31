/**
 *  Copyright (c) 2008 - 2011 Obeo.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *      Obeo - initial API and implementation
 *
 */
package org.eclipse.emf.eef.mapping.providers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.eef.mapping.util.MappingAdapterFactory;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;


/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class MappingEEFAdapterFactory extends MappingAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.mapping.util.MappingAdapterFactory#createDocumentedElementAdapter()
	 * 
	 */
	public Adapter createDocumentedElementAdapter() {
		return new DocumentedElementPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.mapping.util.MappingAdapterFactory#createEMFElementBindingAdapter()
	 * 
	 */
	public Adapter createEMFElementBindingAdapter() {
		List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(1);
		providers.add((PropertiesEditingProvider)createDocumentedElementAdapter());
		return new EMFElementBindingPropertiesEditionProvider(providers);
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.mapping.util.MappingAdapterFactory#createEMFPropertyBindingAdapter()
	 * 
	 */
	public Adapter createEMFPropertyBindingAdapter() {
		List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(1);
		providers.add((PropertiesEditingProvider)createDocumentedElementAdapter());
		return new EMFPropertyBindingPropertiesEditionProvider(providers);
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.mapping.util.MappingAdapterFactory#createStandardElementBindingAdapter()
	 * 
	 */
	public Adapter createStandardElementBindingAdapter() {
		List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(1);
		providers.add((PropertiesEditingProvider)createDocumentedElementAdapter());
		return new StandardElementBindingPropertiesEditionProvider(providers);
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.mapping.util.MappingAdapterFactory#createStandardPropertyBindingAdapter()
	 * 
	 */
	public Adapter createStandardPropertyBindingAdapter() {
		List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(1);
		providers.add((PropertiesEditingProvider)createDocumentedElementAdapter());
		return new StandardPropertyBindingPropertiesEditionProvider(providers);
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.mapping.util.MappingAdapterFactory#createCategoryAdapter()
	 * 
	 */
	public Adapter createCategoryAdapter() {
		List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(1);
		providers.add((PropertiesEditingProvider)createDocumentedElementAdapter());
		return new CategoryPropertiesEditionProvider(providers);
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.mapping.util.MappingAdapterFactory#createElementBindingReferenceAdapter()
	 * 
	 */
	public Adapter createElementBindingReferenceAdapter() {
		List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(1);
		providers.add((PropertiesEditingProvider)createDocumentedElementAdapter());
		return new ElementBindingReferencePropertiesEditionProvider(providers);
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.mapping.util.MappingAdapterFactory#createEMFMultiPropertiesBindingAdapter()
	 * 
	 */
	public Adapter createEMFMultiPropertiesBindingAdapter() {
		List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(1);
		providers.add((PropertiesEditingProvider)createDocumentedElementAdapter());
		return new EMFMultiPropertiesBindingPropertiesEditionProvider(providers);
	}

}
