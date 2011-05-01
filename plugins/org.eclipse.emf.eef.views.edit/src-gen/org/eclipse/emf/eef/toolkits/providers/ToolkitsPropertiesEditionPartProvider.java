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
package org.eclipse.emf.eef.toolkits.providers;

import org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.parts.PropertiesEditingPart;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingPartProvider;
import org.eclipse.emf.eef.toolkits.parts.ToolkitsViewsRepository;
import org.eclipse.emf.eef.toolkits.parts.forms.ToolkitPropertiesEditionPartForm;
import org.eclipse.emf.eef.toolkits.parts.forms.WidgetPropertiesEditionPartForm;
import org.eclipse.emf.eef.toolkits.parts.impl.ToolkitPropertiesEditionPartImpl;
import org.eclipse.emf.eef.toolkits.parts.impl.WidgetPropertiesEditionPartImpl;




/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class ToolkitsPropertiesEditionPartProvider implements PropertiesEditingPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingPartProvider.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == ToolkitsViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingPartProvider.IPropertiesEditionPartProvider#getPropertiesEditingPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent)
	 * 
	 */
	public PropertiesEditingPart getPropertiesEditingPart(Object key, int kind, PropertiesEditingComponent component) {
		if (key == ToolkitsViewsRepository.Toolkit.class) {
			if (kind == ToolkitsViewsRepository.SWT_KIND)
				return new ToolkitPropertiesEditionPartImpl(component);
			if (kind == ToolkitsViewsRepository.FORM_KIND)
				return new ToolkitPropertiesEditionPartForm(component);
		}
		if (key == ToolkitsViewsRepository.Widget.class) {
			if (kind == ToolkitsViewsRepository.SWT_KIND)
				return new WidgetPropertiesEditionPartImpl(component);
			if (kind == ToolkitsViewsRepository.FORM_KIND)
				return new WidgetPropertiesEditionPartForm(component);
		}
		return null;
	}

}
