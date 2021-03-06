/*******************************************************************************
 * Copyright (c) 2008, 2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.references.components;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.eef.eefnr.references.ReferenceEnabledSample;
import org.eclipse.emf.eef.eefnr.references.parts.ReferenceEnabledSamplePropertiesEditionPart;
import org.eclipse.emf.eef.eefnr.references.parts.ReferencesViewsRepository;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.impl.components.ComposedPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;


// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class ReferenceEnabledSamplePropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The Base part
	 * 
	 */
	private ReferenceEnabledSamplePropertiesEditionPart basePart;

	/**
	 * The ReferenceEnabledSampleBasePropertiesEditionComponent sub component
	 * 
	 */
	protected ReferenceEnabledSampleBasePropertiesEditionComponent referenceEnabledSampleBasePropertiesEditionComponent;

	/**
	 * The AbstractSamplePropertiesEditionComponent sub component
	 * 
	 */
	protected AbstractSamplePropertiesEditionComponent abstractSamplePropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param referenceEnabledSample the EObject to edit
	 * 
	 */
	public ReferenceEnabledSamplePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject referenceEnabledSample, String editing_mode) {
		super(editingContext, editing_mode);
		if (referenceEnabledSample instanceof ReferenceEnabledSample) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(referenceEnabledSample, PropertiesEditingProvider.class);
			referenceEnabledSampleBasePropertiesEditionComponent = (ReferenceEnabledSampleBasePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, ReferenceEnabledSampleBasePropertiesEditionComponent.BASE_PART, ReferenceEnabledSampleBasePropertiesEditionComponent.class);
			addSubComponent(referenceEnabledSampleBasePropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(referenceEnabledSample, PropertiesEditingProvider.class);
			abstractSamplePropertiesEditionComponent = (AbstractSamplePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, AbstractSamplePropertiesEditionComponent.BASE_PART, AbstractSamplePropertiesEditionComponent.class);
			addSubComponent(abstractSamplePropertiesEditionComponent);
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
		if (ReferenceEnabledSampleBasePropertiesEditionComponent.BASE_PART.equals(key)) {
			basePart = (ReferenceEnabledSamplePropertiesEditionPart)referenceEnabledSampleBasePropertiesEditionComponent.getPropertiesEditionPart(kind, key);
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
		if (ReferencesViewsRepository.ReferenceEnabledSample.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			basePart = (ReferenceEnabledSamplePropertiesEditionPart)propertiesEditionPart;
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
		if (key == ReferencesViewsRepository.ReferenceEnabledSample.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == ReferencesViewsRepository.AbstractSample.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
