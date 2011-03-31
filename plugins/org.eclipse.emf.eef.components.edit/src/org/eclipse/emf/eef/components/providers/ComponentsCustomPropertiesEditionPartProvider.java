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
package org.eclipse.emf.eef.components.providers;

import org.eclipse.emf.eef.components.parts.ComponentsViewsRepository;
import org.eclipse.emf.eef.components.parts.forms.PropertiesEditionElementCustomPropertiesEditionPartForm;
import org.eclipse.emf.eef.components.parts.impl.PropertiesEditionElementCustomPropertiesEditionPartImpl;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 */
public class ComponentsCustomPropertiesEditionPartProvider extends ComponentsPropertiesEditionPartProvider {

	@Override
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind,
			IPropertiesEditionComponent component) {
		if (key == ComponentsViewsRepository.PropertiesEditionElement.class) {
			if (kind == ComponentsViewsRepository.SWT_KIND)
				return new PropertiesEditionElementCustomPropertiesEditionPartImpl(component);
			if (kind == ComponentsViewsRepository.FORM_KIND)
				return new PropertiesEditionElementCustomPropertiesEditionPartForm(component);
		}
		return super.getPropertiesEditionPart(key, kind, component);
	}

}
