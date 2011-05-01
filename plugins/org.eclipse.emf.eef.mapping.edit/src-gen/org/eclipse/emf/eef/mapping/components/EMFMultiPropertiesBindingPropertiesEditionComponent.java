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
package org.eclipse.emf.eef.mapping.components;

// Start of user code for imports

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.eef.mapping.EMFMultiPropertiesBinding;
import org.eclipse.emf.eef.mapping.parts.EMFMultiPropertiesBindingPropertiesEditionPart;
import org.eclipse.emf.eef.mapping.parts.MappingViewsRepository;
import org.eclipse.emf.eef.runtime.components.impl.ComposedPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.parts.PropertiesEditingPart;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class EMFMultiPropertiesBindingPropertiesEditionComponent extends ComposedPropertiesEditingComponent {

	/**
	 * The Base part
	 * 
	 */
	private EMFMultiPropertiesBindingPropertiesEditionPart basePart;

	/**
	 * The EMFMultiPropertiesBindingBasePropertiesEditionComponent sub component
	 * 
	 */
	protected EMFMultiPropertiesBindingBasePropertiesEditionComponent eMFMultiPropertiesBindingBasePropertiesEditionComponent;
	/**
	 * The DocumentedElementPropertiesEditionComponent sub component
	 * 
	 */
	protected DocumentedElementPropertiesEditionComponent documentedElementPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param eMFMultiPropertiesBinding the EObject to edit
	 * 
	 */
	public EMFMultiPropertiesBindingPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject eMFMultiPropertiesBinding, String editing_mode) {
		super(editingContext, editing_mode);
		if (eMFMultiPropertiesBinding instanceof EMFMultiPropertiesBinding) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eMFMultiPropertiesBinding, PropertiesEditingProvider.class);
			eMFMultiPropertiesBindingBasePropertiesEditionComponent = (EMFMultiPropertiesBindingBasePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, EMFMultiPropertiesBindingBasePropertiesEditionComponent.BASE_PART, EMFMultiPropertiesBindingBasePropertiesEditionComponent.class);
			addSubComponent(eMFMultiPropertiesBindingBasePropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eMFMultiPropertiesBinding, PropertiesEditingProvider.class);
			documentedElementPropertiesEditionComponent = (DocumentedElementPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, DocumentedElementPropertiesEditionComponent.DOCUMENTATION_PART, DocumentedElementPropertiesEditionComponent.class);
			addSubComponent(documentedElementPropertiesEditionComponent);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.components.impl.ComposedPropertiesEditingComponent#
	 *      getPropertiesEditingPart(int, java.lang.String)
	 * 
	 */
	public PropertiesEditingPart getPropertiesEditingPart(int kind, String key) {
		if (EMFMultiPropertiesBindingBasePropertiesEditionComponent.BASE_PART.equals(key)) {
			basePart = (EMFMultiPropertiesBindingPropertiesEditionPart)eMFMultiPropertiesBindingBasePropertiesEditionComponent.getPropertiesEditingPart(kind, key);
			return (PropertiesEditingPart)basePart;
		}
		return super.getPropertiesEditingPart(kind, key);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.components.impl.ComposedPropertiesEditingComponent#
	 *      setPropertiesEditingPart(java.lang.Object, int,
	 *      org.eclipse.emf.eef.runtime.parts.PropertiesEditingPart)
	 * 
	 */
	public void setPropertiesEditingPart(java.lang.Object key, int kind, PropertiesEditingPart propertiesEditionPart) {
		if (MappingViewsRepository.EMFMultiPropertiesBinding.class == key) {
			super.setPropertiesEditingPart(key, kind, propertiesEditionPart);
			basePart = (EMFMultiPropertiesBindingPropertiesEditionPart)propertiesEditionPart;
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.components.impl.ComposedPropertiesEditingComponent#
	 *      initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject,
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(java.lang.Object key, int kind, EObject element, ResourceSet allResource) {
		if (key == MappingViewsRepository.EMFMultiPropertiesBinding.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == MappingViewsRepository.Documentation.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
