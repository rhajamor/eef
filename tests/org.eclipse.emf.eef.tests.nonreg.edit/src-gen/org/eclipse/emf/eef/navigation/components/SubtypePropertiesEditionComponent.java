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
package org.eclipse.emf.eef.navigation.components;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.eef.eefnr.navigation.Subtype;
import org.eclipse.emf.eef.eefnr.navigation.parts.NavigationViewsRepository;
import org.eclipse.emf.eef.eefnr.navigation.parts.SubtypePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.components.impl.ComposedPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.parts.PropertiesEditingPart;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
	

// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class SubtypePropertiesEditionComponent extends ComposedPropertiesEditingComponent {

	/**
	 * The Base part
	 * 
	 */
	private SubtypePropertiesEditionPart basePart;

	/**
	 * The SubtypeBasePropertiesEditionComponent sub component
	 * 
	 */
	protected SubtypeBasePropertiesEditionComponent subtypeBasePropertiesEditionComponent;
	/**
	 * The OwnerPropertiesEditionComponent sub component
	 * 
	 */
	protected OwnerPropertiesEditionComponent ownerPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param subtype the EObject to edit
	 * 
	 */
	public SubtypePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject subtype, String editing_mode) {
		super(editingContext, editing_mode);
		if (subtype instanceof Subtype) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(subtype, PropertiesEditingProvider.class);
			subtypeBasePropertiesEditionComponent = (SubtypeBasePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, SubtypeBasePropertiesEditionComponent.BASE_PART, SubtypeBasePropertiesEditionComponent.class);
			addSubComponent(subtypeBasePropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(subtype, PropertiesEditingProvider.class);
			ownerPropertiesEditionComponent = (OwnerPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, OwnerPropertiesEditionComponent.BASE_PART, OwnerPropertiesEditionComponent.class);
			addSubComponent(ownerPropertiesEditionComponent);
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
		if (SubtypeBasePropertiesEditionComponent.BASE_PART.equals(key)) {
			basePart = (SubtypePropertiesEditionPart)subtypeBasePropertiesEditionComponent.getPropertiesEditingPart(kind, key);
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
		if (NavigationViewsRepository.Subtype.class == key) {
			super.setPropertiesEditingPart(key, kind, propertiesEditionPart);
			basePart = (SubtypePropertiesEditionPart)propertiesEditionPart;
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
		if (key == NavigationViewsRepository.Subtype.class) {
			super.initPart(key, kind, element, allResource);
			ownerPropertiesEditionComponent.setPropertiesEditingPart(NavigationViewsRepository.Owner.class, kind, basePart.getOwnerReferencedView());
			ownerPropertiesEditionComponent.initPart(NavigationViewsRepository.Owner.class, kind, element, allResource);
		}
		if (key == NavigationViewsRepository.Owner.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
