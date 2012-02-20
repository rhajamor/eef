/**
 *  Copyright (c) 2008 - 2010 Obeo.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *      Obeo - initial API and implementation
 *
 */
package org.eclipse.emf.eef.filters.providers;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.filters.components.JavaDeclarationFilterBasePropertiesEditionComponent;
import org.eclipse.emf.eef.filters.components.JavaDeclarationFilterPropertiesEditionComponent;

import org.eclipse.emf.eef.mapping.components.DocumentedElementPropertiesEditionComponent;
import org.eclipse.emf.eef.mapping.components.FilterPropertiesPropertiesEditionComponent;

import org.eclipse.emf.eef.mapping.filters.FiltersPackage;
import org.eclipse.emf.eef.mapping.filters.JavaDeclarationFilter;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.providers.impl.PropertiesEditingProviderImpl;

import org.eclipse.jface.viewers.IFilter;

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class JavaDeclarationFilterPropertiesEditionProvider extends PropertiesEditingProviderImpl {

	/**
	 * Constructor without provider for super types.
	 */
	public JavaDeclarationFilterPropertiesEditionProvider() {
		super();
	}

	/**
	 * Constructor with providers for super types.
	 * @param superProviders providers to use for super types.
	 */
	public JavaDeclarationFilterPropertiesEditionProvider(List<PropertiesEditingProvider> superProviders) {
		super(superProviders);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext)
	 * 
	 */
	public boolean provides(PropertiesEditingContext editingContext) {
		return (editingContext.getEObject() instanceof JavaDeclarationFilter) 
					&& (FiltersPackage.Literals.JAVA_DECLARATION_FILTER == editingContext.getEObject().eClass());
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String)
	 * 
	 */
	public boolean provides(PropertiesEditingContext editingContext, String part) {
		return (editingContext.getEObject() instanceof JavaDeclarationFilter) && (JavaDeclarationFilterBasePropertiesEditionComponent.BASE_PART.equals(part) || DocumentedElementPropertiesEditionComponent.DOCUMENTATION_PART.equals(part) || FilterPropertiesPropertiesEditionComponent.FILTERPROPERTIES_PART.equals(part));
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.Class)
	 * 
	 */
	@SuppressWarnings("rawtypes")
	public boolean provides(PropertiesEditingContext editingContext, java.lang.Class refinement) {
		return (editingContext.getEObject() instanceof JavaDeclarationFilter) && (refinement == JavaDeclarationFilterBasePropertiesEditionComponent.class || refinement == DocumentedElementPropertiesEditionComponent.class || refinement == FilterPropertiesPropertiesEditionComponent.class);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String, java.lang.Class)
	 * 
	 */
	@SuppressWarnings("rawtypes")
	public boolean provides(PropertiesEditingContext editingContext, String part, java.lang.Class refinement) {
		return (editingContext.getEObject() instanceof JavaDeclarationFilter) && ((JavaDeclarationFilterBasePropertiesEditionComponent.BASE_PART.equals(part) && refinement == JavaDeclarationFilterBasePropertiesEditionComponent.class) || (DocumentedElementPropertiesEditionComponent.DOCUMENTATION_PART.equals(part) && refinement == DocumentedElementPropertiesEditionComponent.class) || (FilterPropertiesPropertiesEditionComponent.FILTERPROPERTIES_PART.equals(part) && refinement == FilterPropertiesPropertiesEditionComponent.class));
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String)
	 * 
	 */
	public IPropertiesEditionComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext, String mode) {
		if (editingContext.getEObject() instanceof JavaDeclarationFilter) {
			return new JavaDeclarationFilterPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
		}
		return super.getPropertiesEditingComponent(editingContext, mode);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String, java.lang.String)
	 * 
	 */
	public IPropertiesEditionComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext, String mode, String part) {
		if (editingContext.getEObject() instanceof JavaDeclarationFilter) {
			if (JavaDeclarationFilterBasePropertiesEditionComponent.BASE_PART.equals(part))
				return new JavaDeclarationFilterBasePropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (DocumentedElementPropertiesEditionComponent.DOCUMENTATION_PART.equals(part))
				return new DocumentedElementPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (FilterPropertiesPropertiesEditionComponent.FILTERPROPERTIES_PART.equals(part))
				return new FilterPropertiesPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
		}
		return super.getPropertiesEditingComponent(editingContext, mode, part);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String, java.lang.String, java.lang.Class)
	 */
	@SuppressWarnings("rawtypes")
	public IPropertiesEditionComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext, String mode, String part, java.lang.Class refinement) {
		if (editingContext.getEObject() instanceof JavaDeclarationFilter) {
			if (JavaDeclarationFilterBasePropertiesEditionComponent.BASE_PART.equals(part)
				&& refinement == JavaDeclarationFilterBasePropertiesEditionComponent.class)
				return new JavaDeclarationFilterBasePropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (DocumentedElementPropertiesEditionComponent.DOCUMENTATION_PART.equals(part)
				&& refinement == DocumentedElementPropertiesEditionComponent.class)
				return new DocumentedElementPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (FilterPropertiesPropertiesEditionComponent.FILTERPROPERTIES_PART.equals(part)
				&& refinement == FilterPropertiesPropertiesEditionComponent.class)
				return new FilterPropertiesPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
		}
		return super.getPropertiesEditingComponent(editingContext, mode, part, refinement);
	}

	/**
	 * Provides the filter used by the plugin.xml to assign part forms.
	 */
	public static class EditionFilter implements IFilter {
		
		/**
		 * {@inheritDoc}
		 * 
		 * @see org.eclipse.jface.viewers.IFilter#select(java.lang.Object)
		 */
		public boolean select(Object toTest) {
			return toTest instanceof EObject && FiltersPackage.Literals.JAVA_DECLARATION_FILTER == ((EObject)toTest).eClass();
		}
		
	}

}