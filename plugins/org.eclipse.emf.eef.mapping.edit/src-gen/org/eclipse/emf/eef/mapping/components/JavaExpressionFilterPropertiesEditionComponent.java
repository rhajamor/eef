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
import org.eclipse.emf.eef.mapping.filters.JavaExpressionFilter;
import org.eclipse.emf.eef.mapping.parts.JavaExpressionFilterPropertiesEditionPart;
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
public class JavaExpressionFilterPropertiesEditionComponent extends ComposedPropertiesEditingComponent {

	/**
	 * The Base part
	 * 
	 */
	private JavaExpressionFilterPropertiesEditionPart basePart;

	/**
	 * The JavaExpressionFilterBasePropertiesEditionComponent sub component
	 * 
	 */
	protected JavaExpressionFilterBasePropertiesEditionComponent javaExpressionFilterBasePropertiesEditionComponent;
	/**
	 * The DocumentedElementPropertiesEditionComponent sub component
	 * 
	 */
	protected DocumentedElementPropertiesEditionComponent documentedElementPropertiesEditionComponent;

	/**
	 * The FilterPropertiesPropertiesEditionComponent sub component
	 * 
	 */
	protected FilterPropertiesPropertiesEditionComponent filterPropertiesPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param javaExpressionFilter the EObject to edit
	 * 
	 */
	public JavaExpressionFilterPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject javaExpressionFilter, String editing_mode) {
		super(editingContext, editing_mode);
		if (javaExpressionFilter instanceof JavaExpressionFilter) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(javaExpressionFilter, PropertiesEditingProvider.class);
			javaExpressionFilterBasePropertiesEditionComponent = (JavaExpressionFilterBasePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, JavaExpressionFilterBasePropertiesEditionComponent.BASE_PART, JavaExpressionFilterBasePropertiesEditionComponent.class);
			addSubComponent(javaExpressionFilterBasePropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(javaExpressionFilter, PropertiesEditingProvider.class);
			documentedElementPropertiesEditionComponent = (DocumentedElementPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, DocumentedElementPropertiesEditionComponent.DOCUMENTATION_PART, DocumentedElementPropertiesEditionComponent.class);
			addSubComponent(documentedElementPropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(javaExpressionFilter, PropertiesEditingProvider.class);
			filterPropertiesPropertiesEditionComponent = (FilterPropertiesPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, FilterPropertiesPropertiesEditionComponent.FILTERPROPERTIES_PART, FilterPropertiesPropertiesEditionComponent.class);
			addSubComponent(filterPropertiesPropertiesEditionComponent);
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
		if (JavaExpressionFilterBasePropertiesEditionComponent.BASE_PART.equals(key)) {
			basePart = (JavaExpressionFilterPropertiesEditionPart)javaExpressionFilterBasePropertiesEditionComponent.getPropertiesEditingPart(kind, key);
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
		if (MappingViewsRepository.JavaExpressionFilter.class == key) {
			super.setPropertiesEditingPart(key, kind, propertiesEditionPart);
			basePart = (JavaExpressionFilterPropertiesEditionPart)propertiesEditionPart;
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
		if (key == MappingViewsRepository.JavaExpressionFilter.class) {
			super.initPart(key, kind, element, allResource);
			filterPropertiesPropertiesEditionComponent.setPropertiesEditingPart(MappingViewsRepository.FilterProperties.class, kind, basePart.getFilterPropertiesReferencedView());
			filterPropertiesPropertiesEditionComponent.initPart(MappingViewsRepository.FilterProperties.class, kind, element, allResource);
		}
		if (key == MappingViewsRepository.Documentation.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == MappingViewsRepository.FilterProperties.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
