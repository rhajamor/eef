/*******************************************************************************
 * Copyright (c) 2008, 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.navigation.providers;

import org.eclipse.emf.eef.mapping.parts.MappingViewsRepository;
import org.eclipse.emf.eef.mapping.providers.MappingPropertiesEditionPartProvider;
import org.eclipse.emf.eef.navigation.parts.forms.SimpleModelNavigationCustomPropertiesEditionPartForm;
import org.eclipse.emf.eef.navigation.parts.impl.SimpleModelNavigationCustomPropertiesEditionPartImpl;
import org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.parts.PropertiesEditingPart;

/**
 * @author <a href="mailto:stephane.bouchet@obeo.fr">Stephane Bouchet</a>
 */
public class MappingCustomPropertiesEditionPartProvider extends MappingPropertiesEditionPartProvider {

	@Override
	public PropertiesEditingPart getPropertiesEditingPart(Object key, int kind,
			PropertiesEditingComponent component) {
		if (key == MappingViewsRepository.SimpleModelNavigation.class) {
			if (kind == MappingViewsRepository.SWT_KIND)
				return new SimpleModelNavigationCustomPropertiesEditionPartImpl(component);
			if (kind == MappingViewsRepository.FORM_KIND)
				return new SimpleModelNavigationCustomPropertiesEditionPartForm(component);
		}
		return super.getPropertiesEditingPart(key, kind, component);
	}

}
