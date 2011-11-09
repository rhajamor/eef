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
package org.eclipse.emf.eef.references.providers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.eef.eefnr.references.util.ReferencesAdapterFactory;
import org.eclipse.emf.eef.navigation.providers.NamedElementPropertiesEditionProvider;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;


/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class ReferencesEEFAdapterFactory extends ReferencesAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.eefnr.references.util.ReferencesAdapterFactory#createAbstractSampleAdapter()
	 * 
	 */
	public Adapter createAbstractSampleAdapter() {
		return new AbstractSamplePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.eefnr.references.util.ReferencesAdapterFactory#createAbstractEnabledSampleAdapter()
	 * 
	 */
	public Adapter createAbstractEnabledSampleAdapter() {
		List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(1);
		providers.add((PropertiesEditingProvider)createAbstractSampleAdapter());
		return new AbstractEnabledSamplePropertiesEditionProvider(providers);
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.eefnr.references.util.ReferencesAdapterFactory#createReferenceEnabledSampleAdapter()
	 * 
	 */
	public Adapter createReferenceEnabledSampleAdapter() {
		List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(1);
		providers.add((PropertiesEditingProvider)createAbstractSampleAdapter());
		return new ReferenceEnabledSamplePropertiesEditionProvider(providers);
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.eefnr.references.util.ReferencesAdapterFactory#createNamedElementAdapter()
	 * 
	 */
	public Adapter createNamedElementAdapter() {
		return new NamedElementPropertiesEditionProvider();
	}

}
