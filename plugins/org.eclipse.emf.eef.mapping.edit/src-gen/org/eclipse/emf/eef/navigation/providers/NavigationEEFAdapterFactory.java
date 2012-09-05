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
package org.eclipse.emf.eef.navigation.providers;

import org.eclipse.emf.common.notify.Adapter;

import org.eclipse.emf.eef.mapping.navigation.util.NavigationAdapterFactory;

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class NavigationEEFAdapterFactory extends NavigationAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.mapping.navigation.util.NavigationAdapterFactory#createSimpleModelNavigationAdapter()
	 * 
	 */
	public Adapter createSimpleModelNavigationAdapter() {
		return new SimpleModelNavigationPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.mapping.navigation.util.NavigationAdapterFactory#createDeclarativeNavigationStepAdapter()
	 * 
	 */
	public Adapter createDeclarativeNavigationStepAdapter() {
		return new DeclarativeNavigationStepPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.mapping.navigation.util.NavigationAdapterFactory#createJavaDeclarationStepInitializerAdapter()
	 * 
	 */
	public Adapter createJavaDeclarationStepInitializerAdapter() {
		return new JavaDeclarationStepInitializerPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.mapping.navigation.util.NavigationAdapterFactory#createJavaBodyStepInitializerAdapter()
	 * 
	 */
	public Adapter createJavaBodyStepInitializerAdapter() {
		return new JavaBodyStepInitializerPropertiesEditionProvider();
	}

}
