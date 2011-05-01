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
package org.eclipse.emf.eef.eefnrext.components;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.eef.eefnr.references.parts.ReferencesViewsRepository;
import org.eclipse.emf.eef.eefnrext.CheckBoxExtendedEditorSample;
import org.eclipse.emf.eef.eefnrext.parts.CheckBoxExtendedEditorSamplePropertiesEditionPart;
import org.eclipse.emf.eef.eefnrext.parts.EefnrextViewsRepository;
import org.eclipse.emf.eef.references.components.AbstractSamplePropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.components.impl.ComposedPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.parts.PropertiesEditingPart;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;


// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class CheckBoxExtendedEditorSamplePropertiesEditionComponent extends ComposedPropertiesEditingComponent {

	/**
	 * The Base part
	 * 
	 */
	private CheckBoxExtendedEditorSamplePropertiesEditionPart basePart;

	/**
	 * The CheckBoxExtendedEditorSampleBasePropertiesEditionComponent sub component
	 * 
	 */
	protected CheckBoxExtendedEditorSampleBasePropertiesEditionComponent checkBoxExtendedEditorSampleBasePropertiesEditionComponent;
	/**
	 * The AbstractSamplePropertiesEditionComponent sub component
	 * 
	 */
	protected AbstractSamplePropertiesEditionComponent abstractSamplePropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param checkBoxExtendedEditorSample the EObject to edit
	 * 
	 */
	public CheckBoxExtendedEditorSamplePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject checkBoxExtendedEditorSample, String editing_mode) {
		super(editingContext, editing_mode);
		if (checkBoxExtendedEditorSample instanceof CheckBoxExtendedEditorSample) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(checkBoxExtendedEditorSample, PropertiesEditingProvider.class);
			checkBoxExtendedEditorSampleBasePropertiesEditionComponent = (CheckBoxExtendedEditorSampleBasePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, CheckBoxExtendedEditorSampleBasePropertiesEditionComponent.BASE_PART, CheckBoxExtendedEditorSampleBasePropertiesEditionComponent.class);
			addSubComponent(checkBoxExtendedEditorSampleBasePropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(checkBoxExtendedEditorSample, PropertiesEditingProvider.class);
			abstractSamplePropertiesEditionComponent = (AbstractSamplePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, AbstractSamplePropertiesEditionComponent.BASE_PART, AbstractSamplePropertiesEditionComponent.class);
			addSubComponent(abstractSamplePropertiesEditionComponent);
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
		if (CheckBoxExtendedEditorSampleBasePropertiesEditionComponent.BASE_PART.equals(key)) {
			basePart = (CheckBoxExtendedEditorSamplePropertiesEditionPart)checkBoxExtendedEditorSampleBasePropertiesEditionComponent.getPropertiesEditingPart(kind, key);
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
		if (EefnrextViewsRepository.CheckBoxExtendedEditorSample.class == key) {
			super.setPropertiesEditingPart(key, kind, propertiesEditionPart);
			basePart = (CheckBoxExtendedEditorSamplePropertiesEditionPart)propertiesEditionPart;
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
		if (key == EefnrextViewsRepository.CheckBoxExtendedEditorSample.class) {
			super.initPart(key, kind, element, allResource);
			abstractSamplePropertiesEditionComponent.setPropertiesEditingPart(ReferencesViewsRepository.AbstractSample.class, kind, basePart.getAbstractSampleReferencedView());
			abstractSamplePropertiesEditionComponent.initPart(ReferencesViewsRepository.AbstractSample.class, kind, element, allResource);
		}
		if (key == ReferencesViewsRepository.AbstractSample.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
