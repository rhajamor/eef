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
package org.eclipse.emf.eef.eefnrext.components;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.eef.eefnrext.FlatReferenceExtendedEditorSample;
import org.eclipse.emf.eef.eefnrext.parts.EefnrextViewsRepository;
import org.eclipse.emf.eef.eefnrext.parts.FlatReferenceExtendedEditorSamplePropertiesEditionPart;
import org.eclipse.emf.eef.eefnrext.parts.SecondFlatReferenceExtendedEditorSamplePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.impl.components.ComposedPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;


// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class FlatReferenceExtendedEditorSamplePropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The Base part
	 * 
	 */
	private FlatReferenceExtendedEditorSamplePropertiesEditionPart basePart;

	/**
	 * The FlatReferenceExtendedEditorSampleBasePropertiesEditionComponent sub component
	 * 
	 */
	protected FlatReferenceExtendedEditorSampleBasePropertiesEditionComponent flatReferenceExtendedEditorSampleBasePropertiesEditionComponent;

	/**
	 * The SecondFlatReferenceExtendedEditorSample part
	 * 
	 */
	private SecondFlatReferenceExtendedEditorSamplePropertiesEditionPart secondFlatReferenceExtendedEditorSamplePart;

	/**
	 * The FlatReferenceExtendedEditorSampleSecondFlatReferenceExtendedEditorSamplePropertiesEditionComponent sub component
	 * 
	 */
	protected FlatReferenceExtendedEditorSampleSecondFlatReferenceExtendedEditorSamplePropertiesEditionComponent flatReferenceExtendedEditorSampleSecondFlatReferenceExtendedEditorSamplePropertiesEditionComponent;

	/**
	 * The CheckBoxExtendedEditorSamplePropertiesEditionComponent sub component
	 * 
	 */
	protected CheckBoxExtendedEditorSamplePropertiesEditionComponent checkBoxExtendedEditorSamplePropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param flatReferenceExtendedEditorSample the EObject to edit
	 * 
	 */
	public FlatReferenceExtendedEditorSamplePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject flatReferenceExtendedEditorSample, String editing_mode) {
		super(editingContext, editing_mode);
		if (flatReferenceExtendedEditorSample instanceof FlatReferenceExtendedEditorSample) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(flatReferenceExtendedEditorSample, PropertiesEditingProvider.class);
			flatReferenceExtendedEditorSampleBasePropertiesEditionComponent = (FlatReferenceExtendedEditorSampleBasePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, FlatReferenceExtendedEditorSampleBasePropertiesEditionComponent.BASE_PART, FlatReferenceExtendedEditorSampleBasePropertiesEditionComponent.class);
			addSubComponent(flatReferenceExtendedEditorSampleBasePropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(flatReferenceExtendedEditorSample, PropertiesEditingProvider.class);
			flatReferenceExtendedEditorSampleSecondFlatReferenceExtendedEditorSamplePropertiesEditionComponent = (FlatReferenceExtendedEditorSampleSecondFlatReferenceExtendedEditorSamplePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, FlatReferenceExtendedEditorSampleSecondFlatReferenceExtendedEditorSamplePropertiesEditionComponent.SECONDFLATREFERENCEEXTENDEDEDITORSAMPLE_PART, FlatReferenceExtendedEditorSampleSecondFlatReferenceExtendedEditorSamplePropertiesEditionComponent.class);
			addSubComponent(flatReferenceExtendedEditorSampleSecondFlatReferenceExtendedEditorSamplePropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(flatReferenceExtendedEditorSample, PropertiesEditingProvider.class);
			checkBoxExtendedEditorSamplePropertiesEditionComponent = (CheckBoxExtendedEditorSamplePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, CheckBoxExtendedEditorSampleBasePropertiesEditionComponent.BASE_PART, CheckBoxExtendedEditorSamplePropertiesEditionComponent.class);
			addSubComponent(checkBoxExtendedEditorSamplePropertiesEditionComponent);
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
		if (FlatReferenceExtendedEditorSampleBasePropertiesEditionComponent.BASE_PART.equals(key)) {
			basePart = (FlatReferenceExtendedEditorSamplePropertiesEditionPart)flatReferenceExtendedEditorSampleBasePropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)basePart;
		}
		if (FlatReferenceExtendedEditorSampleSecondFlatReferenceExtendedEditorSamplePropertiesEditionComponent.SECONDFLATREFERENCEEXTENDEDEDITORSAMPLE_PART.equals(key)) {
			secondFlatReferenceExtendedEditorSamplePart = (SecondFlatReferenceExtendedEditorSamplePropertiesEditionPart)flatReferenceExtendedEditorSampleSecondFlatReferenceExtendedEditorSamplePropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)secondFlatReferenceExtendedEditorSamplePart;
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
		if (EefnrextViewsRepository.FlatReferenceExtendedEditorSample.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			basePart = (FlatReferenceExtendedEditorSamplePropertiesEditionPart)propertiesEditionPart;
		}
		if (EefnrextViewsRepository.SecondFlatReferenceExtendedEditorSample.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			secondFlatReferenceExtendedEditorSamplePart = (SecondFlatReferenceExtendedEditorSamplePropertiesEditionPart)propertiesEditionPart;
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
		if (key == EefnrextViewsRepository.FlatReferenceExtendedEditorSample.class) {
			super.initPart(key, kind, element, allResource);
			checkBoxExtendedEditorSamplePropertiesEditionComponent.setPropertiesEditionPart(EefnrextViewsRepository.CheckBoxExtendedEditorSample.class, kind, basePart.getCheckBoxExtendedEditorSampleReferencedView());
			checkBoxExtendedEditorSamplePropertiesEditionComponent.initPart(EefnrextViewsRepository.CheckBoxExtendedEditorSample.class, kind, element, allResource);
		}
		if (key == EefnrextViewsRepository.SecondFlatReferenceExtendedEditorSample.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == EefnrextViewsRepository.CheckBoxExtendedEditorSample.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
