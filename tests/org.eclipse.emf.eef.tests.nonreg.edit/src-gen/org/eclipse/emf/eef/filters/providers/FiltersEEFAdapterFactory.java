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
package org.eclipse.emf.eef.filters.providers;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.eef.eefnr.filters.util.FiltersAdapterFactory;
import org.eclipse.emf.eef.references.providers.AbstractSamplePropertiesEditionProvider;


/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class FiltersEEFAdapterFactory extends FiltersAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.eefnr.filters.util.FiltersAdapterFactory#createAbstractSampleAdapter()
	 * 
	 */
	public Adapter createAbstractSampleAdapter() {
		return new AbstractSamplePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.eefnr.filters.util.FiltersAdapterFactory#createConcreteReferenceOwnerSampleAdapter()
	 * 
	 */
	public Adapter createConcreteReferenceOwnerSampleAdapter() {
		return new ConcreteReferenceOwnerSamplePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.eefnr.filters.util.FiltersAdapterFactory#createConcreteReferenceTargetSample1Adapter()
	 * 
	 */
	public Adapter createConcreteReferenceTargetSample1Adapter() {
		return new ConcreteReferenceTargetSample1PropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.eefnr.filters.util.FiltersAdapterFactory#createConcreteReferenceTargetSample2Adapter()
	 * 
	 */
	public Adapter createConcreteReferenceTargetSample2Adapter() {
		return new ConcreteReferenceTargetSample2PropertiesEditionProvider();
	}

}
