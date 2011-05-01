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
import org.eclipse.emf.eef.extended.editor.EEFMasterPage;
import org.eclipse.emf.eef.extended.editor.parts.EEFMasterPagePropertiesEditionPart;
import org.eclipse.emf.eef.extended.editor.parts.EditorViewsRepository;
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
public class EEFMasterPagePropertiesEditionComponent extends ComposedPropertiesEditingComponent {

	/**
	 * The Base part
	 * 
	 */
	private EEFMasterPagePropertiesEditionPart basePart;

	/**
	 * The EEFMasterPageBasePropertiesEditionComponent sub component
	 * 
	 */
	protected EEFMasterPageBasePropertiesEditionComponent eEFMasterPageBasePropertiesEditionComponent;
	/**
	 * The DocumentedElementPropertiesEditionComponent sub component
	 * 
	 */
	protected DocumentedElementPropertiesEditionComponent documentedElementPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param eEFMasterPage the EObject to edit
	 * 
	 */
	public EEFMasterPagePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject eEFMasterPage, String editing_mode) {
		super(editingContext, editing_mode);
		if (eEFMasterPage instanceof EEFMasterPage) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eEFMasterPage, PropertiesEditingProvider.class);
			eEFMasterPageBasePropertiesEditionComponent = (EEFMasterPageBasePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, EEFMasterPageBasePropertiesEditionComponent.BASE_PART, EEFMasterPageBasePropertiesEditionComponent.class);
			addSubComponent(eEFMasterPageBasePropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eEFMasterPage, PropertiesEditingProvider.class);
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
		if (EEFMasterPageBasePropertiesEditionComponent.BASE_PART.equals(key)) {
			basePart = (EEFMasterPagePropertiesEditionPart)eEFMasterPageBasePropertiesEditionComponent.getPropertiesEditingPart(kind, key);
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
		if (EditorViewsRepository.EEFMasterPage.class == key) {
			super.setPropertiesEditingPart(key, kind, propertiesEditionPart);
			basePart = (EEFMasterPagePropertiesEditionPart)propertiesEditionPart;
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
		if (key == EditorViewsRepository.EEFMasterPage.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == ViewsViewsRepository.Documentation.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
