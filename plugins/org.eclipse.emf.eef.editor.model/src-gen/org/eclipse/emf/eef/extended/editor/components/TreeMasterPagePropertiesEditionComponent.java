/*******************************************************************************
 * Copyright (c) 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.extended.editor.components;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.eef.extended.editor.TreeMasterPage;
import org.eclipse.emf.eef.extended.editor.parts.EditorViewsRepository;
import org.eclipse.emf.eef.extended.editor.parts.TreeMasterPagePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.components.impl.ComposedPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.parts.PropertiesEditingPart;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.views.components.DocumentedElementPropertiesEditionComponent;
import org.eclipse.emf.eef.views.parts.ViewsViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class TreeMasterPagePropertiesEditionComponent extends ComposedPropertiesEditingComponent {

	/**
	 * The Base part
	 * 
	 */
	private TreeMasterPagePropertiesEditionPart basePart;

	/**
	 * The TreeMasterPageBasePropertiesEditionComponent sub component
	 * 
	 */
	protected TreeMasterPageBasePropertiesEditionComponent treeMasterPageBasePropertiesEditionComponent;
	/**
	 * The DocumentedElementPropertiesEditionComponent sub component
	 * 
	 */
	protected DocumentedElementPropertiesEditionComponent documentedElementPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param treeMasterPage the EObject to edit
	 * 
	 */
	public TreeMasterPagePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject treeMasterPage, String editing_mode) {
		super(editingContext, editing_mode);
		if (treeMasterPage instanceof TreeMasterPage) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(treeMasterPage, PropertiesEditingProvider.class);
			treeMasterPageBasePropertiesEditionComponent = (TreeMasterPageBasePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, TreeMasterPageBasePropertiesEditionComponent.BASE_PART, TreeMasterPageBasePropertiesEditionComponent.class);
			addSubComponent(treeMasterPageBasePropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(treeMasterPage, PropertiesEditingProvider.class);
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
		if (TreeMasterPageBasePropertiesEditionComponent.BASE_PART.equals(key)) {
			basePart = (TreeMasterPagePropertiesEditionPart)treeMasterPageBasePropertiesEditionComponent.getPropertiesEditingPart(kind, key);
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
		if (EditorViewsRepository.TreeMasterPage.class == key) {
			super.setPropertiesEditingPart(key, kind, propertiesEditionPart);
			basePart = (TreeMasterPagePropertiesEditionPart)propertiesEditionPart;
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
		if (key == EditorViewsRepository.TreeMasterPage.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == ViewsViewsRepository.Documentation.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
