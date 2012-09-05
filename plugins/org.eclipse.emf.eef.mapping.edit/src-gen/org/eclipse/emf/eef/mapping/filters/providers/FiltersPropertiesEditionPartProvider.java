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
package org.eclipse.emf.eef.mapping.filters.providers;

import org.eclipse.emf.eef.mapping.filters.parts.FiltersViewsRepository;

import org.eclipse.emf.eef.mapping.filters.parts.forms.JavaBodyStepFilterPropertiesEditionPartForm;
import org.eclipse.emf.eef.mapping.filters.parts.forms.JavaDeclarationFilterPropertiesEditionPartForm;
import org.eclipse.emf.eef.mapping.filters.parts.forms.JavaDeclarationStepFilterPropertiesEditionPartForm;
import org.eclipse.emf.eef.mapping.filters.parts.forms.JavaExpressionFilterPropertiesEditionPartForm;
import org.eclipse.emf.eef.mapping.filters.parts.forms.OCLFilterPropertiesEditionPartForm;
import org.eclipse.emf.eef.mapping.filters.parts.forms.OnlyReferenceTypeFilterPropertiesEditionPartForm;
import org.eclipse.emf.eef.mapping.filters.parts.forms.StrictTypingFilterPropertiesEditionPartForm;

import org.eclipse.emf.eef.mapping.filters.parts.impl.JavaBodyStepFilterPropertiesEditionPartImpl;
import org.eclipse.emf.eef.mapping.filters.parts.impl.JavaDeclarationFilterPropertiesEditionPartImpl;
import org.eclipse.emf.eef.mapping.filters.parts.impl.JavaDeclarationStepFilterPropertiesEditionPartImpl;
import org.eclipse.emf.eef.mapping.filters.parts.impl.JavaExpressionFilterPropertiesEditionPartImpl;
import org.eclipse.emf.eef.mapping.filters.parts.impl.OCLFilterPropertiesEditionPartImpl;
import org.eclipse.emf.eef.mapping.filters.parts.impl.OnlyReferenceTypeFilterPropertiesEditionPartImpl;
import org.eclipse.emf.eef.mapping.filters.parts.impl.StrictTypingFilterPropertiesEditionPartImpl;

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
		if (key == FiltersViewsRepository.OnlyReferenceTypeFilter.class) {
			if (kind == FiltersViewsRepository.SWT_KIND)
				return new OnlyReferenceTypeFilterPropertiesEditionPartImpl(component);
			if (kind == FiltersViewsRepository.FORM_KIND)
				return new OnlyReferenceTypeFilterPropertiesEditionPartForm(component);
		}
		if (key == FiltersViewsRepository.OCLFilter.class) {
			if (kind == FiltersViewsRepository.SWT_KIND)
				return new OCLFilterPropertiesEditionPartImpl(component);
			if (kind == FiltersViewsRepository.FORM_KIND)
				return new OCLFilterPropertiesEditionPartForm(component);
		}
		if (key == FiltersViewsRepository.JavaExpressionFilter.class) {
			if (kind == FiltersViewsRepository.SWT_KIND)
				return new JavaExpressionFilterPropertiesEditionPartImpl(component);
			if (kind == FiltersViewsRepository.FORM_KIND)
				return new JavaExpressionFilterPropertiesEditionPartForm(component);
		}
		if (key == FiltersViewsRepository.JavaDeclarationFilter.class) {
			if (kind == FiltersViewsRepository.SWT_KIND)
				return new JavaDeclarationFilterPropertiesEditionPartImpl(component);
			if (kind == FiltersViewsRepository.FORM_KIND)
				return new JavaDeclarationFilterPropertiesEditionPartForm(component);
		}
		if (key == FiltersViewsRepository.StrictTypingFilter.class) {
			if (kind == FiltersViewsRepository.SWT_KIND)
				return new StrictTypingFilterPropertiesEditionPartImpl(component);
			if (kind == FiltersViewsRepository.FORM_KIND)
				return new StrictTypingFilterPropertiesEditionPartForm(component);
		}
		if (key == FiltersViewsRepository.JavaDeclarationStepFilter.class) {
			if (kind == FiltersViewsRepository.SWT_KIND)
				return new JavaDeclarationStepFilterPropertiesEditionPartImpl(component);
			if (kind == FiltersViewsRepository.FORM_KIND)
				return new JavaDeclarationStepFilterPropertiesEditionPartForm(component);
		}
		if (key == FiltersViewsRepository.JavaBodyStepFilter.class) {
			if (kind == FiltersViewsRepository.SWT_KIND)
				return new JavaBodyStepFilterPropertiesEditionPartImpl(component);
			if (kind == FiltersViewsRepository.FORM_KIND)
				return new JavaBodyStepFilterPropertiesEditionPartForm(component);
		}
		return null;
	}

}
