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

package org.eclipse.emf.eef.components.parts.impl;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.eef.mapping.MappingPackage;
import org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.util.EEFUtils;
import org.eclipse.jface.viewers.StructuredSelection;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 */
public class PropertiesEditionElementCustomPropertiesEditionPartImpl extends PropertiesEditionElementPropertiesEditionPartImpl {

	/**
	 * @param editionComponent
	 */
	public PropertiesEditionElementCustomPropertiesEditionPartImpl(
			PropertiesEditingComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.components.parts.forms.PropertiesEditionElementPropertiesEditionPartForm#initModel(org.eclipse.emf.ecore.resource.ResourceSet,
	 *      org.eclipse.emf.ecore.EObject)
	 */
	public void initModel(ResourceSet allResources, EObject current) {
		model.setInput(EEFUtils.choiceOfValues(this.current, MappingPackage.eINSTANCE
				.getEMFPropertyBinding_Model()));
		if (current != null) {
			model.setSelection(new StructuredSelection(current));
		}
	}

}
