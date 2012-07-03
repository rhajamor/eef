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
package org.eclipse.emf.eef.eefnr.filters.providers;

import org.eclipse.emf.eef.eefnr.filters.parts.FiltersViewsRepository;

import org.eclipse.emf.eef.eefnr.filters.parts.forms.ConcreteReferenceOwnerSamplePropertiesEditionPartForm;
import org.eclipse.emf.eef.eefnr.filters.parts.forms.ConcreteReferenceTargetSample1PropertiesEditionPartForm;
import org.eclipse.emf.eef.eefnr.filters.parts.forms.ConcreteReferenceTargetSample2PropertiesEditionPartForm;

import org.eclipse.emf.eef.eefnr.filters.parts.impl.ConcreteReferenceOwnerSamplePropertiesEditionPartImpl;
import org.eclipse.emf.eef.eefnr.filters.parts.impl.ConcreteReferenceTargetSample1PropertiesEditionPartImpl;
import org.eclipse.emf.eef.eefnr.filters.parts.impl.ConcreteReferenceTargetSample2PropertiesEditionPartImpl;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class FiltersPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == FiltersViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == FiltersViewsRepository.ConcreteReferenceOwnerSample.class) {
			if (kind == FiltersViewsRepository.SWT_KIND)
				return new ConcreteReferenceOwnerSamplePropertiesEditionPartImpl(component);
			if (kind == FiltersViewsRepository.FORM_KIND)
				return new ConcreteReferenceOwnerSamplePropertiesEditionPartForm(component);
		}
		if (key == FiltersViewsRepository.ConcreteReferenceTargetSample1.class) {
			if (kind == FiltersViewsRepository.SWT_KIND)
				return new ConcreteReferenceTargetSample1PropertiesEditionPartImpl(component);
			if (kind == FiltersViewsRepository.FORM_KIND)
				return new ConcreteReferenceTargetSample1PropertiesEditionPartForm(component);
		}
		if (key == FiltersViewsRepository.ConcreteReferenceTargetSample2.class) {
			if (kind == FiltersViewsRepository.SWT_KIND)
				return new ConcreteReferenceTargetSample2PropertiesEditionPartImpl(component);
			if (kind == FiltersViewsRepository.FORM_KIND)
				return new ConcreteReferenceTargetSample2PropertiesEditionPartForm(component);
		}
		return null;
	}

}
