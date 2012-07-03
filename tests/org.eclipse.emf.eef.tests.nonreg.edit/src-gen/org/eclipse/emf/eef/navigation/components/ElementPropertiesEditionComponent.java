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
package org.eclipse.emf.eef.navigation.components;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.eef.eefnr.navigation.Element;
import org.eclipse.emf.eef.eefnr.navigation.parts.ElementPropertiesEditionPart;
import org.eclipse.emf.eef.eefnr.navigation.parts.NavigationViewsRepository;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.impl.components.ComposedPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;


// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class ElementPropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The Base part
	 * 
	 */
	private ElementPropertiesEditionPart basePart;

	/**
	 * The ElementBasePropertiesEditionComponent sub component
	 * 
	 */
	protected ElementBasePropertiesEditionComponent elementBasePropertiesEditionComponent;

	/**
	 * The NamedElementPropertiesEditionComponent sub component
	 * 
	 */
	protected NamedElementPropertiesEditionComponent namedElementPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param element the EObject to edit
	 * 
	 */
	public ElementPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject element, String editing_mode) {
		super(editingContext, editing_mode);
		if (element instanceof Element) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(element, PropertiesEditingProvider.class);
			elementBasePropertiesEditionComponent = (ElementBasePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, ElementBasePropertiesEditionComponent.BASE_PART, ElementBasePropertiesEditionComponent.class);
			addSubComponent(elementBasePropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(element, PropertiesEditingProvider.class);
			namedElementPropertiesEditionComponent = (NamedElementPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, NamedElementPropertiesEditionComponent.BASE_PART, NamedElementPropertiesEditionComponent.class);
			addSubComponent(namedElementPropertiesEditionComponent);
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
		if (ElementBasePropertiesEditionComponent.BASE_PART.equals(key)) {
			basePart = (ElementPropertiesEditionPart)elementBasePropertiesEditionComponent.getPropertiesEditionPart(kind, key);
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
		if (NavigationViewsRepository.Element.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			basePart = (ElementPropertiesEditionPart)propertiesEditionPart;
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
		if (key == NavigationViewsRepository.Element.class) {
			super.initPart(key, kind, element, allResource);
			namedElementPropertiesEditionComponent.setPropertiesEditionPart(NavigationViewsRepository.NamedElement.class, kind, basePart.getNamedElementReferencedView());
			namedElementPropertiesEditionComponent.initPart(NavigationViewsRepository.NamedElement.class, kind, element, allResource);
		}
		if (key == NavigationViewsRepository.NamedElement.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
