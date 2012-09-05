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
package org.eclipse.emf.eef.mapping.navigation.providers;

import org.eclipse.emf.eef.mapping.navigation.parts.NavigationViewsRepository;

import org.eclipse.emf.eef.mapping.navigation.parts.forms.DeclarativeNavigationStepPropertiesEditionPartForm;
import org.eclipse.emf.eef.mapping.navigation.parts.forms.JavaBodyStepInitializerPropertiesEditionPartForm;
import org.eclipse.emf.eef.mapping.navigation.parts.forms.JavaDeclarationStepInitializerPropertiesEditionPartForm;
import org.eclipse.emf.eef.mapping.navigation.parts.forms.ModelNavigationPropertiesEditionPartForm;
import org.eclipse.emf.eef.mapping.navigation.parts.forms.SimpleModelNavigationPropertiesEditionPartForm;

import org.eclipse.emf.eef.mapping.navigation.parts.impl.DeclarativeNavigationStepPropertiesEditionPartImpl;
import org.eclipse.emf.eef.mapping.navigation.parts.impl.JavaBodyStepInitializerPropertiesEditionPartImpl;
import org.eclipse.emf.eef.mapping.navigation.parts.impl.JavaDeclarationStepInitializerPropertiesEditionPartImpl;
import org.eclipse.emf.eef.mapping.navigation.parts.impl.ModelNavigationPropertiesEditionPartImpl;
import org.eclipse.emf.eef.mapping.navigation.parts.impl.SimpleModelNavigationPropertiesEditionPartImpl;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class NavigationPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == NavigationViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == NavigationViewsRepository.ModelNavigation.class) {
			if (kind == NavigationViewsRepository.SWT_KIND)
				return new ModelNavigationPropertiesEditionPartImpl(component);
			if (kind == NavigationViewsRepository.FORM_KIND)
				return new ModelNavigationPropertiesEditionPartForm(component);
		}
		if (key == NavigationViewsRepository.SimpleModelNavigation.class) {
			if (kind == NavigationViewsRepository.SWT_KIND)
				return new SimpleModelNavigationPropertiesEditionPartImpl(component);
			if (kind == NavigationViewsRepository.FORM_KIND)
				return new SimpleModelNavigationPropertiesEditionPartForm(component);
		}
		if (key == NavigationViewsRepository.DeclarativeNavigationStep.class) {
			if (kind == NavigationViewsRepository.SWT_KIND)
				return new DeclarativeNavigationStepPropertiesEditionPartImpl(component);
			if (kind == NavigationViewsRepository.FORM_KIND)
				return new DeclarativeNavigationStepPropertiesEditionPartForm(component);
		}
		if (key == NavigationViewsRepository.JavaDeclarationStepInitializer.class) {
			if (kind == NavigationViewsRepository.SWT_KIND)
				return new JavaDeclarationStepInitializerPropertiesEditionPartImpl(component);
			if (kind == NavigationViewsRepository.FORM_KIND)
				return new JavaDeclarationStepInitializerPropertiesEditionPartForm(component);
		}
		if (key == NavigationViewsRepository.JavaBodyStepInitializer.class) {
			if (kind == NavigationViewsRepository.SWT_KIND)
				return new JavaBodyStepInitializerPropertiesEditionPartImpl(component);
			if (kind == NavigationViewsRepository.FORM_KIND)
				return new JavaBodyStepInitializerPropertiesEditionPartForm(component);
		}
		return null;
	}

}
