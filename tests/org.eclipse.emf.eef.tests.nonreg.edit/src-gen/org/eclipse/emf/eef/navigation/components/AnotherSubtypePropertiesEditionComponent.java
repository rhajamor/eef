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
import org.eclipse.emf.eef.eefnr.navigation.AnotherSubType;
import org.eclipse.emf.eef.eefnr.navigation.parts.AnotherSubtypePropertiesEditionPart;
import org.eclipse.emf.eef.eefnr.navigation.parts.NavigationViewsRepository;
import org.eclipse.emf.eef.runtime.components.impl.ComposedPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.parts.PropertiesEditingPart;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;


// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class AnotherSubtypePropertiesEditionComponent extends ComposedPropertiesEditingComponent {

	/**
	 * The Base part
	 * 
	 */
	private AnotherSubtypePropertiesEditionPart basePart;

	/**
	 * The AnotherSubtypeBasePropertiesEditionComponent sub component
	 * 
	 */
	protected AnotherSubtypeBasePropertiesEditionComponent anotherSubtypeBasePropertiesEditionComponent;
	/**
	 * The SubtypePropertiesEditionComponent sub component
	 * 
	 */
	protected SubtypePropertiesEditionComponent subtypePropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param anotherSubType the EObject to edit
	 * 
	 */
	public AnotherSubtypePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject anotherSubType, String editing_mode) {
		super(editingContext, editing_mode);
		if (anotherSubType instanceof AnotherSubType) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(anotherSubType, PropertiesEditingProvider.class);
			anotherSubtypeBasePropertiesEditionComponent = (AnotherSubtypeBasePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, AnotherSubtypeBasePropertiesEditionComponent.BASE_PART, AnotherSubtypeBasePropertiesEditionComponent.class);
			addSubComponent(anotherSubtypeBasePropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(anotherSubType, PropertiesEditingProvider.class);
			subtypePropertiesEditionComponent = (SubtypePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, SubtypeBasePropertiesEditionComponent.BASE_PART, SubtypePropertiesEditionComponent.class);
			addSubComponent(subtypePropertiesEditionComponent);
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
		if (AnotherSubtypeBasePropertiesEditionComponent.BASE_PART.equals(key)) {
			basePart = (AnotherSubtypePropertiesEditionPart)anotherSubtypeBasePropertiesEditionComponent.getPropertiesEditingPart(kind, key);
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
		if (NavigationViewsRepository.AnotherSubtype.class == key) {
			super.setPropertiesEditingPart(key, kind, propertiesEditionPart);
			basePart = (AnotherSubtypePropertiesEditionPart)propertiesEditionPart;
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
		if (key == NavigationViewsRepository.AnotherSubtype.class) {
			super.initPart(key, kind, element, allResource);
			subtypePropertiesEditionComponent.setPropertiesEditingPart(NavigationViewsRepository.Subtype.class, kind, basePart.getSubtypeReferencedView());
			subtypePropertiesEditionComponent.initPart(NavigationViewsRepository.Subtype.class, kind, element, allResource);
		}
		if (key == NavigationViewsRepository.Subtype.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
