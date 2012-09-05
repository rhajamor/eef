/*******************************************************************************
 * Copyright (c) 2008, 2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.filters.providers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;

import org.eclipse.emf.eef.mapping.filters.util.FiltersAdapterFactory;

import org.eclipse.emf.eef.mapping.providers.DocumentedElementPropertiesEditionProvider;
import org.eclipse.emf.eef.mapping.providers.FilterPropertiesPropertiesEditionProvider;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class FiltersEEFAdapterFactory extends FiltersAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.mapping.filters.util.FiltersAdapterFactory#createDocumentedElementAdapter()
	 * 
	 */
	public Adapter createDocumentedElementAdapter() {
		return new DocumentedElementPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.mapping.filters.util.FiltersAdapterFactory#createBindingFilterAdapter()
	 * 
	 */
	public Adapter createBindingFilterAdapter() {
		return new FilterPropertiesPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.mapping.filters.util.FiltersAdapterFactory#createOCLFilterAdapter()
	 * 
	 */
	public Adapter createOCLFilterAdapter() {
		List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(2);
		providers.add((PropertiesEditingProvider)createDocumentedElementAdapter());
		providers.add((PropertiesEditingProvider)createBindingFilterAdapter());
		return new OCLFilterPropertiesEditionProvider(providers);
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.mapping.filters.util.FiltersAdapterFactory#createJavaDeclarationFilterAdapter()
	 * 
	 */
	public Adapter createJavaDeclarationFilterAdapter() {
		List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(2);
		providers.add((PropertiesEditingProvider)createDocumentedElementAdapter());
		providers.add((PropertiesEditingProvider)createBindingFilterAdapter());
		return new JavaDeclarationFilterPropertiesEditionProvider(providers);
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.mapping.filters.util.FiltersAdapterFactory#createJavaExpressionFilterAdapter()
	 * 
	 */
	public Adapter createJavaExpressionFilterAdapter() {
		List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(2);
		providers.add((PropertiesEditingProvider)createDocumentedElementAdapter());
		providers.add((PropertiesEditingProvider)createBindingFilterAdapter());
		return new JavaExpressionFilterPropertiesEditionProvider(providers);
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.mapping.filters.util.FiltersAdapterFactory#createOnlyReferenceTypeFilterAdapter()
	 * 
	 */
	public Adapter createOnlyReferenceTypeFilterAdapter() {
		List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(2);
		providers.add((PropertiesEditingProvider)createDocumentedElementAdapter());
		providers.add((PropertiesEditingProvider)createBindingFilterAdapter());
		return new OnlyReferenceTypeFilterPropertiesEditionProvider(providers);
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.mapping.filters.util.FiltersAdapterFactory#createStrictTypingFilterAdapter()
	 * 
	 */
	public Adapter createStrictTypingFilterAdapter() {
		List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(2);
		providers.add((PropertiesEditingProvider)createDocumentedElementAdapter());
		providers.add((PropertiesEditingProvider)createBindingFilterAdapter());
		return new StrictTypingFilterFilterPropertiesEditionProvider(providers);
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.mapping.filters.util.FiltersAdapterFactory#createJavaBodyStepFilterAdapter()
	 * 
	 */
	public Adapter createJavaBodyStepFilterAdapter() {
		return new JavaBodyStepFilterPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.mapping.filters.util.FiltersAdapterFactory#createJavaDeclarationStepFilterAdapter()
	 * 
	 */
	public Adapter createJavaDeclarationStepFilterAdapter() {
		return new JavaDeclarationStepFilterPropertiesEditionProvider();
	}

}
