/**
 * Copyright (c) 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 ******************************************************************************
 */
package org.eclipse.emf.eef.extended.query.providers;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.eef.extended.query.util.QueryAdapterFactory;


/**
 * 
 * 
 */
public class QueryEEFAdapterFactory extends QueryAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.extended.query.util.QueryAdapterFactory#createOCLQueryAdapter()
	 * 
	 */
	public Adapter createOCLQueryAdapter() {
		return new OCLQueryPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.extended.query.util.QueryAdapterFactory#createExplicitPathQueryAdapter()
	 * 
	 */
	public Adapter createExplicitPathQueryAdapter() {
		return new ExplicitPathQueryPropertiesEditionProvider();
	}

}
