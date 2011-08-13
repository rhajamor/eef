/*******************************************************************************
 * Copyright (c) 2009 - 2010 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.eefnr.providers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.eef.eefnr.navigation.util.NavigationAdapterFactory;
import org.eclipse.emf.eef.navigation.providers.AnotherSubtypePropertiesEditionProvider;
import org.eclipse.emf.eef.navigation.providers.AttributeNavigationSamplePropertiesEditionProvider;
import org.eclipse.emf.eef.navigation.providers.DeferedFlatReferencesTableSampleEditorPropertiesEditionProvider;
import org.eclipse.emf.eef.navigation.providers.DeferedReferencesTableSampleEditorPropertiesEditionProvider;
import org.eclipse.emf.eef.navigation.providers.ElementPropertiesEditionProvider;
import org.eclipse.emf.eef.navigation.providers.NamedElementPropertiesEditionProvider;
import org.eclipse.emf.eef.navigation.providers.OwnerPropertiesEditionProvider;
import org.eclipse.emf.eef.navigation.providers.SubtypePropertiesEditionProvider;
import org.eclipse.emf.eef.references.providers.AbstractSamplePropertiesEditionProvider;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;


/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class NavigationEEFAdapterFactory extends NavigationAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.eefnr.navigation.util.NavigationAdapterFactory#createAbstractSampleAdapter()
	 * 
	 */
	public Adapter createAbstractSampleAdapter() {
		return new AbstractSamplePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.eefnr.navigation.util.NavigationAdapterFactory#createDeferedFlatReferenceTableEditorSampleAdapter()
	 * 
	 */
	public Adapter createDeferedFlatReferenceTableEditorSampleAdapter() {
		return new DeferedFlatReferencesTableSampleEditorPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.eefnr.navigation.util.NavigationAdapterFactory#createDeferedReferenceTableEditorSampleAdapter()
	 * 
	 */
	public Adapter createDeferedReferenceTableEditorSampleAdapter() {
		return new DeferedReferencesTableSampleEditorPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.eefnr.navigation.util.NavigationAdapterFactory#createOwnerAdapter()
	 * 
	 */
	public Adapter createOwnerAdapter() {
		return new OwnerPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.eefnr.navigation.util.NavigationAdapterFactory#createSubtypeAdapter()
	 * 
	 */
	public Adapter createSubtypeAdapter() {
		List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(1);
		providers.add((PropertiesEditingProvider)createOwnerAdapter());
		return new SubtypePropertiesEditionProvider(providers);
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.eefnr.navigation.util.NavigationAdapterFactory#createAnotherSubTypeAdapter()
	 * 
	 */
	public Adapter createAnotherSubTypeAdapter() {
		List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(1);
		providers.add((PropertiesEditingProvider)createSubtypeAdapter());
		return new AnotherSubtypePropertiesEditionProvider(providers);
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.eefnr.navigation.util.NavigationAdapterFactory#createNamedElementAdapter()
	 * 
	 */
	public Adapter createNamedElementAdapter() {
		return new NamedElementPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.eefnr.navigation.util.NavigationAdapterFactory#createElementAdapter()
	 * 
	 */
	public Adapter createElementAdapter() {
		List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(1);
		providers.add((PropertiesEditingProvider)createNamedElementAdapter());
		return new ElementPropertiesEditionProvider(providers);
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.eefnr.navigation.util.NavigationAdapterFactory#createAttributeNavigationSampleAdapter()
	 * 
	 */
	public Adapter createAttributeNavigationSampleAdapter() {
		return new AttributeNavigationSamplePropertiesEditionProvider();
	}

}
