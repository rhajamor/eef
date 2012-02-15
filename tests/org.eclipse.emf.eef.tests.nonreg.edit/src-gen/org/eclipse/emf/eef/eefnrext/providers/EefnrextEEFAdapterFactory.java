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
package org.eclipse.emf.eef.eefnrext.providers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.eef.eefnrext.util.EefnrextAdapterFactory;
import org.eclipse.emf.eef.references.providers.AbstractSamplePropertiesEditionProvider;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;


/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class EefnrextEEFAdapterFactory extends EefnrextAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.eefnrext.util.EefnrextAdapterFactory#createAbstractSampleAdapter()
	 * 
	 */
	public Adapter createAbstractSampleAdapter() {
		return new AbstractSamplePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.eefnrext.util.EefnrextAdapterFactory#createTableCompositionTargetExtensionEditorSampleAdapter()
	 * 
	 */
	public Adapter createTableCompositionTargetExtensionEditorSampleAdapter() {
		return new TableCompositionTargetExtensionEditorSamplePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.eefnrext.util.EefnrextAdapterFactory#createCheckBoxExtendedEditorSampleAdapter()
	 * 
	 */
	public Adapter createCheckBoxExtendedEditorSampleAdapter() {
		List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(1);
		providers.add((PropertiesEditingProvider)createAbstractSampleAdapter());
		return new CheckBoxExtendedEditorSamplePropertiesEditionProvider(providers);
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.eefnrext.util.EefnrextAdapterFactory#createFlatReferenceExtendedEditorSampleAdapter()
	 * 
	 */
	public Adapter createFlatReferenceExtendedEditorSampleAdapter() {
		List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(1);
		providers.add((PropertiesEditingProvider)createCheckBoxExtendedEditorSampleAdapter());
		return new FlatReferenceExtendedEditorSamplePropertiesEditionProvider(providers);
	}

}
