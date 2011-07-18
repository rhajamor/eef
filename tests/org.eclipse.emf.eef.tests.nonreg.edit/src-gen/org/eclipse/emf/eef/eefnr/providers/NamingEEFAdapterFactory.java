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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.eef.eefnr.naming.util.CustomNamingAdapterFactory;
import org.eclipse.emf.eef.naming.providers.EventPropertiesEditionProvider;
import org.eclipse.emf.eef.references.providers.AbstractSamplePropertiesEditionProvider;


/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 *
 * org.eclipse.emf.eef.components.impl.PropertiesEditionContextImpl@1154c85 (documentation: Edition Context for eefnr GenPackage)
 * org.eclipse.emf.codegen.ecore.genmodel.impl.GenPackageImpl@1496d29 (prefix: CustomNaming, basePackage: org.eclipse.emf.eef.eefnr, resource: None, disposableProviderFactory: true, adapterFactory: true, loadInitialization: false, interfacePackageSuffix: , metaDataPackageSuffix: , classPackageSuffix: impl, utilityPackageSuffix: util, providerPackageSuffix: provider, presentationPackageSuffix: presentation, testsPackageSuffix: tests, generateExampleClass: true, literalsInterface: true, dataTypeConverters: false, multipleEditorPages: true, generateModelWizard: true, extensibleProviderFactory: false, childCreationExtenders: false, contentTypeIdentifier: null, fileExtensions: null)
 * CustomNaming
 * CustomNamingAdapterFactory
 */
public class NamingEEFAdapterFactory extends CustomNamingAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.eefnr.naming.util.NamingAdapterFactory#createAbstractSampleAdapter()
	 * 
	 */
	public Adapter createAbstractSampleAdapter() {
		return new AbstractSamplePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.eefnr.naming.util.NamingAdapterFactory#createEventAdapter()
	 * 
	 */
	public Adapter createEventAdapter() {
		return new EventPropertiesEditionProvider();
	}

}
