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
package org.eclipse.emf.eef.views.components;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.impl.components.ComposedPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.views.CustomElementEditor;
import org.eclipse.emf.eef.views.parts.CustomElementEditorPropertiesEditionPart;
import org.eclipse.emf.eef.views.parts.ViewsViewsRepository;


// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class CustomElementEditorPropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The Base part
	 * 
	 */
	private CustomElementEditorPropertiesEditionPart basePart;

	/**
	 * The CustomElementEditorBasePropertiesEditionComponent sub component
	 * 
	 */
	protected CustomElementEditorBasePropertiesEditionComponent customElementEditorBasePropertiesEditionComponent;
	/**
	 * The DocumentedElementPropertiesEditionComponent sub component
	 * 
	 */
	protected DocumentedElementPropertiesEditionComponent documentedElementPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param customElementEditor the EObject to edit
	 * 
	 */
	public CustomElementEditorPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject customElementEditor, String editing_mode) {
		super(editingContext, editing_mode);
		if (customElementEditor instanceof CustomElementEditor) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(customElementEditor, PropertiesEditingProvider.class);
			customElementEditorBasePropertiesEditionComponent = (CustomElementEditorBasePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, CustomElementEditorBasePropertiesEditionComponent.BASE_PART, CustomElementEditorBasePropertiesEditionComponent.class);
			addSubComponent(customElementEditorBasePropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(customElementEditor, PropertiesEditingProvider.class);
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
		if (CustomElementEditorBasePropertiesEditionComponent.BASE_PART.equals(key)) {
			basePart = (CustomElementEditorPropertiesEditionPart)customElementEditorBasePropertiesEditionComponent.getPropertiesEditionPart(kind, key);
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
		if (ViewsViewsRepository.CustomElementEditor.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			basePart = (CustomElementEditorPropertiesEditionPart)propertiesEditionPart;
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
		if (key == ViewsViewsRepository.CustomElementEditor.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == ViewsViewsRepository.Documentation.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
