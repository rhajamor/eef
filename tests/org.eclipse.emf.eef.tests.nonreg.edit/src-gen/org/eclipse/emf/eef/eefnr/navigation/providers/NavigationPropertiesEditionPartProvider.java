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
package org.eclipse.emf.eef.eefnr.navigation.providers;

import org.eclipse.emf.eef.eefnr.navigation.parts.NavigationViewsRepository;

import org.eclipse.emf.eef.eefnr.navigation.parts.forms.AnotherSubtypePropertiesEditionPartForm;
import org.eclipse.emf.eef.eefnr.navigation.parts.forms.AttributeNavigationSamplePropertiesEditionPartForm;
import org.eclipse.emf.eef.eefnr.navigation.parts.forms.DeferedFlatReferencesTableSamplePropertiesEditionPartForm;
import org.eclipse.emf.eef.eefnr.navigation.parts.forms.DeferedReferencesTableSamplePropertiesEditionPartForm;
import org.eclipse.emf.eef.eefnr.navigation.parts.forms.ElementPropertiesEditionPartForm;
import org.eclipse.emf.eef.eefnr.navigation.parts.forms.NamedElementPropertiesEditionPartForm;
import org.eclipse.emf.eef.eefnr.navigation.parts.forms.OwnerPropertiesEditionPartForm;
import org.eclipse.emf.eef.eefnr.navigation.parts.forms.SubtypePropertiesEditionPartForm;

import org.eclipse.emf.eef.eefnr.navigation.parts.impl.AnotherSubtypePropertiesEditionPartImpl;
import org.eclipse.emf.eef.eefnr.navigation.parts.impl.AttributeNavigationSamplePropertiesEditionPartImpl;
import org.eclipse.emf.eef.eefnr.navigation.parts.impl.DeferedFlatReferencesTableSamplePropertiesEditionPartImpl;
import org.eclipse.emf.eef.eefnr.navigation.parts.impl.DeferedReferencesTableSamplePropertiesEditionPartImpl;
import org.eclipse.emf.eef.eefnr.navigation.parts.impl.ElementPropertiesEditionPartImpl;
import org.eclipse.emf.eef.eefnr.navigation.parts.impl.NamedElementPropertiesEditionPartImpl;
import org.eclipse.emf.eef.eefnr.navigation.parts.impl.OwnerPropertiesEditionPartImpl;
import org.eclipse.emf.eef.eefnr.navigation.parts.impl.SubtypePropertiesEditionPartImpl;

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
		if (key == NavigationViewsRepository.DeferedFlatReferencesTableSample.class) {
			if (kind == NavigationViewsRepository.SWT_KIND)
				return new DeferedFlatReferencesTableSamplePropertiesEditionPartImpl(component);
			if (kind == NavigationViewsRepository.FORM_KIND)
				return new DeferedFlatReferencesTableSamplePropertiesEditionPartForm(component);
		}
		if (key == NavigationViewsRepository.DeferedReferencesTableSample.class) {
			if (kind == NavigationViewsRepository.SWT_KIND)
				return new DeferedReferencesTableSamplePropertiesEditionPartImpl(component);
			if (kind == NavigationViewsRepository.FORM_KIND)
				return new DeferedReferencesTableSamplePropertiesEditionPartForm(component);
		}
		if (key == NavigationViewsRepository.Owner.class) {
			if (kind == NavigationViewsRepository.SWT_KIND)
				return new OwnerPropertiesEditionPartImpl(component);
			if (kind == NavigationViewsRepository.FORM_KIND)
				return new OwnerPropertiesEditionPartForm(component);
		}
		if (key == NavigationViewsRepository.Subtype.class) {
			if (kind == NavigationViewsRepository.SWT_KIND)
				return new SubtypePropertiesEditionPartImpl(component);
			if (kind == NavigationViewsRepository.FORM_KIND)
				return new SubtypePropertiesEditionPartForm(component);
		}
		if (key == NavigationViewsRepository.AnotherSubtype.class) {
			if (kind == NavigationViewsRepository.SWT_KIND)
				return new AnotherSubtypePropertiesEditionPartImpl(component);
			if (kind == NavigationViewsRepository.FORM_KIND)
				return new AnotherSubtypePropertiesEditionPartForm(component);
		}
		if (key == NavigationViewsRepository.NamedElement.class) {
			if (kind == NavigationViewsRepository.SWT_KIND)
				return new NamedElementPropertiesEditionPartImpl(component);
			if (kind == NavigationViewsRepository.FORM_KIND)
				return new NamedElementPropertiesEditionPartForm(component);
		}
		if (key == NavigationViewsRepository.Element.class) {
			if (kind == NavigationViewsRepository.SWT_KIND)
				return new ElementPropertiesEditionPartImpl(component);
			if (kind == NavigationViewsRepository.FORM_KIND)
				return new ElementPropertiesEditionPartForm(component);
		}
		if (key == NavigationViewsRepository.AttributeNavigationSample.class) {
			if (kind == NavigationViewsRepository.SWT_KIND)
				return new AttributeNavigationSamplePropertiesEditionPartImpl(component);
			if (kind == NavigationViewsRepository.FORM_KIND)
				return new AttributeNavigationSamplePropertiesEditionPartForm(component);
		}
		return null;
	}

}
