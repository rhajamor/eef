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
import org.eclipse.emf.eef.extended.editor.DynamicEEFEditorContribution;
import org.eclipse.emf.eef.extended.editor.parts.DynamicEEFEditorContributionPropertiesEditionPart;
import org.eclipse.emf.eef.extended.editor.parts.EditorViewsRepository;
import org.eclipse.emf.eef.mapping.components.DocumentedElementPropertiesEditionComponent;
import org.eclipse.emf.eef.mapping.parts.MappingViewsRepository;
import org.eclipse.emf.eef.runtime.components.impl.ComposedPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.parts.PropertiesEditingPart;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;


// End of user code

/**
 * 
 * 
 */
public class DynamicEEFEditorContributionPropertiesEditionComponent extends ComposedPropertiesEditingComponent {

	/**
	 * The Base part
	 * 
	 */
	private DynamicEEFEditorContributionPropertiesEditionPart basePart;

	/**
	 * The DynamicEEFEditorContributionBasePropertiesEditionComponent sub component
	 * 
	 */
	protected DynamicEEFEditorContributionBasePropertiesEditionComponent dynamicEEFEditorContributionBasePropertiesEditionComponent;
	/**
	 * The DocumentedElementPropertiesEditionComponent sub component
	 * 
	 */
	protected DocumentedElementPropertiesEditionComponent documentedElementPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param dynamicEEFEditorContribution the EObject to edit
	 * 
	 */
	public DynamicEEFEditorContributionPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject dynamicEEFEditorContribution, String editing_mode) {
		super(editingContext, editing_mode);
		if (dynamicEEFEditorContribution instanceof DynamicEEFEditorContribution) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(dynamicEEFEditorContribution, PropertiesEditingProvider.class);
			dynamicEEFEditorContributionBasePropertiesEditionComponent = (DynamicEEFEditorContributionBasePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, DynamicEEFEditorContributionBasePropertiesEditionComponent.BASE_PART, DynamicEEFEditorContributionBasePropertiesEditionComponent.class);
			addSubComponent(dynamicEEFEditorContributionBasePropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(dynamicEEFEditorContribution, PropertiesEditingProvider.class);
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
		if (DynamicEEFEditorContributionBasePropertiesEditionComponent.BASE_PART.equals(key)) {
			basePart = (DynamicEEFEditorContributionPropertiesEditionPart)dynamicEEFEditorContributionBasePropertiesEditionComponent.getPropertiesEditingPart(kind, key);
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
		if (EditorViewsRepository.DynamicEEFEditorContribution.class == key) {
			super.setPropertiesEditingPart(key, kind, propertiesEditionPart);
			basePart = (DynamicEEFEditorContributionPropertiesEditionPart)propertiesEditionPart;
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
		if (key == EditorViewsRepository.DynamicEEFEditorContribution.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == MappingViewsRepository.Documentation.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
