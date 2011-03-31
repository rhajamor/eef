/**
 *  Copyright (c) 2008 - 2011 Obeo.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *      Obeo - initial API and implementation
 *
 */
package org.eclipse.emf.eef.components.components;

// Start of user code for imports

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.eef.components.PropertiesEditionElement;
import org.eclipse.emf.eef.components.parts.ComponentsViewsRepository;
import org.eclipse.emf.eef.components.parts.PropertiesEditionElementPropertiesEditionPart;
import org.eclipse.emf.eef.mapping.components.DocumentedElementPropertiesEditionComponent;
import org.eclipse.emf.eef.mapping.parts.MappingViewsRepository;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.impl.components.ComposedPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class PropertiesEditionElementPropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The Base part
	 * 
	 */
	private PropertiesEditionElementPropertiesEditionPart basePart;

	/**
	 * The PropertiesEditionElementBasePropertiesEditionComponent sub component
	 * 
	 */
	protected PropertiesEditionElementBasePropertiesEditionComponent propertiesEditionElementBasePropertiesEditionComponent;
	/**
	 * The DocumentedElementPropertiesEditionComponent sub component
	 * 
	 */
	protected DocumentedElementPropertiesEditionComponent documentedElementPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param propertiesEditionElement the EObject to edit
	 * 
	 */
	public PropertiesEditionElementPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject propertiesEditionElement, String editing_mode) {
		super(editingContext, editing_mode);
		if (propertiesEditionElement instanceof PropertiesEditionElement) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(propertiesEditionElement, PropertiesEditingProvider.class);
			propertiesEditionElementBasePropertiesEditionComponent = (PropertiesEditionElementBasePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, PropertiesEditionElementBasePropertiesEditionComponent.BASE_PART, PropertiesEditionElementBasePropertiesEditionComponent.class);
			addSubComponent(propertiesEditionElementBasePropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(propertiesEditionElement, PropertiesEditingProvider.class);
			documentedElementPropertiesEditionComponent = (DocumentedElementPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, DocumentedElementPropertiesEditionComponent.DOCUMENTATION_PART, DocumentedElementPropertiesEditionComponent.class);
			addSubComponent(documentedElementPropertiesEditionComponent);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.ComposedPropertiesEditionComponent#
	 *      getPropertiesEditionPart(int, java.lang.String)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(int kind, String key) {
		if (PropertiesEditionElementBasePropertiesEditionComponent.BASE_PART.equals(key)) {
			basePart = (PropertiesEditionElementPropertiesEditionPart)propertiesEditionElementBasePropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)basePart;
		}
		return super.getPropertiesEditionPart(kind, key);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.ComposedPropertiesEditionComponent#
	 *      setPropertiesEditionPart(java.lang.Object, int,
	 *      org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart)
	 * 
	 */
	public void setPropertiesEditionPart(java.lang.Object key, int kind, IPropertiesEditionPart propertiesEditionPart) {
		if (ComponentsViewsRepository.PropertiesEditionElement.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			basePart = (PropertiesEditionElementPropertiesEditionPart)propertiesEditionPart;
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.ComposedPropertiesEditionComponent#
	 *      initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject,
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(java.lang.Object key, int kind, EObject element, ResourceSet allResource) {
		if (key == ComponentsViewsRepository.PropertiesEditionElement.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == MappingViewsRepository.Documentation.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
