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
package org.eclipse.emf.eef.views.providers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.views.util.ViewsAdapterFactory;


/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class ViewsEEFAdapterFactory extends ViewsAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.views.util.ViewsAdapterFactory#createDocumentedElementAdapter()
	 * 
	 */
	public Adapter createDocumentedElementAdapter() {
		return new DocumentedElementPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.views.util.ViewsAdapterFactory#createViewsRepositoryAdapter()
	 * 
	 */
	public Adapter createViewsRepositoryAdapter() {
		List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(1);
		providers.add((PropertiesEditingProvider)createDocumentedElementAdapter());
		return new ViewsRepositoryPropertiesEditionProvider(providers);
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.views.util.ViewsAdapterFactory#createContainerAdapter()
	 * 
	 */
	public Adapter createContainerAdapter() {
		List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(1);
		providers.add((PropertiesEditingProvider)createDocumentedElementAdapter());
		return new ContainerPropertiesEditionProvider(providers);
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.views.util.ViewsAdapterFactory#createViewAdapter()
	 * 
	 */
	public Adapter createViewAdapter() {
		List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(1);
		providers.add((PropertiesEditingProvider)createDocumentedElementAdapter());
		return new ViewPropertiesEditionProvider(providers);
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.views.util.ViewsAdapterFactory#createElementEditorAdapter()
	 * 
	 */
	public Adapter createElementEditorAdapter() {
		List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(1);
		providers.add((PropertiesEditingProvider)createDocumentedElementAdapter());
		return new ElementEditorPropertiesEditionProvider(providers);
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.views.util.ViewsAdapterFactory#createCategoryAdapter()
	 * 
	 */
	public Adapter createCategoryAdapter() {
		List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(1);
		providers.add((PropertiesEditingProvider)createDocumentedElementAdapter());
		return new CategoryPropertiesEditionProvider(providers);
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.views.util.ViewsAdapterFactory#createCustomElementEditorAdapter()
	 * 
	 */
	public Adapter createCustomElementEditorAdapter() {
		List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(1);
		providers.add((PropertiesEditingProvider)createDocumentedElementAdapter());
		return new CustomElementEditorPropertiesEditionProvider(providers);
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.views.util.ViewsAdapterFactory#createCustomViewAdapter()
	 * 
	 */
	public Adapter createCustomViewAdapter() {
		List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(1);
		providers.add((PropertiesEditingProvider)createDocumentedElementAdapter());
		return new CustomViewPropertiesEditionProvider(providers);
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.views.util.ViewsAdapterFactory#createViewReferenceAdapter()
	 * 
	 */
	public Adapter createViewReferenceAdapter() {
		List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(1);
		providers.add((PropertiesEditingProvider)createDocumentedElementAdapter());
		return new ViewReferencePropertiesEditionProvider(providers);
	}

}
