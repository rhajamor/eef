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
import org.eclipse.emf.eef.eefnr.references.util.ReferencesAdapterFactory;
import org.eclipse.emf.eef.navigation.providers.NamedElementPropertiesEditionProvider;
import org.eclipse.emf.eef.references.providers.AbstractEnabledSamplePropertiesEditionProvider;
import org.eclipse.emf.eef.references.providers.AbstractSamplePropertiesEditionProvider;
import org.eclipse.emf.eef.references.providers.ReferenceEnabledSamplePropertiesEditionProvider;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;


/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 *
 * org.eclipse.emf.eef.components.impl.PropertiesEditionContextImpl@1154c85 (documentation: Edition Context for eefnr GenPackage)
 * org.eclipse.emf.codegen.ecore.genmodel.impl.GenPackageImpl@c5db73 (prefix: References, basePackage: org.eclipse.emf.eef.eefnr, resource: None, disposableProviderFactory: true, adapterFactory: true, loadInitialization: false, interfacePackageSuffix: , metaDataPackageSuffix: , classPackageSuffix: impl, utilityPackageSuffix: util, providerPackageSuffix: provider, presentationPackageSuffix: presentation, testsPackageSuffix: tests, generateExampleClass: true, literalsInterface: true, dataTypeConverters: false, multipleEditorPages: true, generateModelWizard: true, extensibleProviderFactory: false, childCreationExtenders: false, contentTypeIdentifier: null, fileExtensions: null)
 * References
 * ReferencesAdapterFactory
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
