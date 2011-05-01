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
package org.eclipse.emf.eef.references.components;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.eef.eefnr.references.AbstractEnabledSample;
import org.eclipse.emf.eef.eefnr.references.parts.AbstractEnabledSamplePropertiesEditionPart;
import org.eclipse.emf.eef.eefnr.references.parts.ReferencesViewsRepository;
import org.eclipse.emf.eef.runtime.components.impl.ComposedPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.parts.PropertiesEditingPart;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;


// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class AbstractEnabledSamplePropertiesEditionComponent extends ComposedPropertiesEditingComponent {

	/**
	 * The Base part
	 * 
	 */
	private AbstractEnabledSamplePropertiesEditionPart basePart;

	/**
	 * The AbstractEnabledSampleBasePropertiesEditionComponent sub component
	 * 
	 */
	protected AbstractEnabledSampleBasePropertiesEditionComponent abstractEnabledSampleBasePropertiesEditionComponent;
	/**
	 * The AbstractSamplePropertiesEditionComponent sub component
	 * 
	 */
	protected AbstractSamplePropertiesEditionComponent abstractSamplePropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param abstractEnabledSample the EObject to edit
	 * 
	 */
	public AbstractEnabledSamplePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject abstractEnabledSample, String editing_mode) {
		super(editingContext, editing_mode);
		if (abstractEnabledSample instanceof AbstractEnabledSample) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(abstractEnabledSample, PropertiesEditingProvider.class);
			abstractEnabledSampleBasePropertiesEditionComponent = (AbstractEnabledSampleBasePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, AbstractEnabledSampleBasePropertiesEditionComponent.BASE_PART, AbstractEnabledSampleBasePropertiesEditionComponent.class);
			addSubComponent(abstractEnabledSampleBasePropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(abstractEnabledSample, PropertiesEditingProvider.class);
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
		if (AbstractEnabledSampleBasePropertiesEditionComponent.BASE_PART.equals(key)) {
			basePart = (AbstractEnabledSamplePropertiesEditionPart)abstractEnabledSampleBasePropertiesEditionComponent.getPropertiesEditingPart(kind, key);
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
		if (ReferencesViewsRepository.AbstractEnabledSample.class == key) {
			super.setPropertiesEditingPart(key, kind, propertiesEditionPart);
			basePart = (AbstractEnabledSamplePropertiesEditionPart)propertiesEditionPart;
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
		if (key == ReferencesViewsRepository.AbstractEnabledSample.class) {
			super.initPart(key, kind, element, allResource);
			abstractSamplePropertiesEditionComponent.setPropertiesEditingPart(ReferencesViewsRepository.AbstractSample.class, kind, basePart.getAbstractSampleReferencedView());
			abstractSamplePropertiesEditionComponent.initPart(ReferencesViewsRepository.AbstractSample.class, kind, element, allResource);
		}
		if (key == ReferencesViewsRepository.AbstractSample.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
