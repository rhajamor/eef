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
package org.eclipse.emf.eef.eefnr.references.providers;

import org.eclipse.emf.eef.eefnr.references.parts.ReferencesViewsRepository;
import org.eclipse.emf.eef.eefnr.references.parts.forms.AbstractEnabledSamplePropertiesEditionPartForm;
import org.eclipse.emf.eef.eefnr.references.parts.forms.AbstractSamplePropertiesEditionPartForm;
import org.eclipse.emf.eef.eefnr.references.parts.forms.ReferenceEnabledSamplePropertiesEditionPartForm;
import org.eclipse.emf.eef.eefnr.references.parts.impl.AbstractEnabledSamplePropertiesEditionPartImpl;
import org.eclipse.emf.eef.eefnr.references.parts.impl.AbstractSamplePropertiesEditionPartImpl;
import org.eclipse.emf.eef.eefnr.references.parts.impl.ReferenceEnabledSamplePropertiesEditionPartImpl;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;




/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class ReferencesPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == ReferencesViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == ReferencesViewsRepository.ReferenceEnabledSample.class) {
			if (kind == ReferencesViewsRepository.SWT_KIND)
				return new ReferenceEnabledSamplePropertiesEditionPartImpl(component);
			if (kind == ReferencesViewsRepository.FORM_KIND)
				return new ReferenceEnabledSamplePropertiesEditionPartForm(component);
		}
		if (key == ReferencesViewsRepository.AbstractEnabledSample.class) {
			if (kind == ReferencesViewsRepository.SWT_KIND)
				return new AbstractEnabledSamplePropertiesEditionPartImpl(component);
			if (kind == ReferencesViewsRepository.FORM_KIND)
				return new AbstractEnabledSamplePropertiesEditionPartForm(component);
		}
		if (key == ReferencesViewsRepository.AbstractSample.class) {
			if (kind == ReferencesViewsRepository.SWT_KIND)
				return new AbstractSamplePropertiesEditionPartImpl(component);
			if (kind == ReferencesViewsRepository.FORM_KIND)
				return new AbstractSamplePropertiesEditionPartForm(component);
		}
		return null;
	}

}
