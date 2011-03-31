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

import org.eclipse.emf.eef.extended.query.parts.QueryViewsRepository;
import org.eclipse.emf.eef.extended.query.parts.forms.ExplicitPathQueryPropertiesEditionPartForm;
import org.eclipse.emf.eef.extended.query.parts.forms.OCLQueryPropertiesEditionPartForm;
import org.eclipse.emf.eef.extended.query.parts.impl.ExplicitPathQueryPropertiesEditionPartImpl;
import org.eclipse.emf.eef.extended.query.parts.impl.OCLQueryPropertiesEditionPartImpl;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;




/**
 * 
 * 
 */
public class QueryPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == QueryViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == QueryViewsRepository.OCLQuery.class) {
			if (kind == QueryViewsRepository.SWT_KIND)
				return new OCLQueryPropertiesEditionPartImpl(component);
			if (kind == QueryViewsRepository.FORM_KIND)
				return new OCLQueryPropertiesEditionPartForm(component);
		}
		if (key == QueryViewsRepository.ExplicitPathQuery.class) {
			if (kind == QueryViewsRepository.SWT_KIND)
				return new ExplicitPathQueryPropertiesEditionPartImpl(component);
			if (kind == QueryViewsRepository.FORM_KIND)
				return new ExplicitPathQueryPropertiesEditionPartForm(component);
		}
		return null;
	}

}
