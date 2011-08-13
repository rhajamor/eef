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
package org.eclipse.emf.eef.eefnrext.providers;

import java.util.List;

import org.eclipse.emf.eef.eefnrext.EefnrextPackage;
import org.eclipse.emf.eef.eefnrext.FlatReferenceExtendedEditorSample;
import org.eclipse.emf.eef.eefnrext.components.CheckBoxExtendedEditorSampleBasePropertiesEditionComponent;
import org.eclipse.emf.eef.eefnrext.components.CheckBoxExtendedEditorSamplePropertiesEditionComponent;
import org.eclipse.emf.eef.eefnrext.components.FlatReferenceExtendedEditorSampleBasePropertiesEditionComponent;
import org.eclipse.emf.eef.eefnrext.components.FlatReferenceExtendedEditorSamplePropertiesEditionComponent;
import org.eclipse.emf.eef.eefnrext.components.FlatReferenceExtendedEditorSampleSecondFlatReferenceExtendedEditorSamplePropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.providers.impl.PropertiesEditingProviderImpl;

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class FlatReferenceExtendedEditorSamplePropertiesEditionProvider extends PropertiesEditingProviderImpl {

	/**
	 * Constructor without provider for super types.
	 */
	public FlatReferenceExtendedEditorSamplePropertiesEditionProvider() {
		super();
	}

	/**
	 * Constructor with providers for super types.
	 * @param superProviders providers to use for super types.
	 */
	public FlatReferenceExtendedEditorSamplePropertiesEditionProvider(List<PropertiesEditingProvider> superProviders) {
		super(superProviders);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext)
	 * 
	 */
	public boolean provides(PropertiesEditingContext editingContext) {
		return (editingContext.getEObject() instanceof FlatReferenceExtendedEditorSample) 
					&& (EefnrextPackage.eINSTANCE.getFlatReferenceExtendedEditorSample() == editingContext.getEObject().eClass());
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String)
	 * 
	 */
	public boolean provides(PropertiesEditingContext editingContext, String part) {
		return (editingContext.getEObject() instanceof FlatReferenceExtendedEditorSample) && (FlatReferenceExtendedEditorSampleBasePropertiesEditionComponent.BASE_PART.equals(part) || FlatReferenceExtendedEditorSampleSecondFlatReferenceExtendedEditorSamplePropertiesEditionComponent.SECONDFLATREFERENCEEXTENDEDEDITORSAMPLE_PART.equals(part) || CheckBoxExtendedEditorSampleBasePropertiesEditionComponent.BASE_PART.equals(part));
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.Class)
	 * 
	 */
	@SuppressWarnings("rawtypes")
	public boolean provides(PropertiesEditingContext editingContext, java.lang.Class refinement) {
		return (editingContext.getEObject() instanceof FlatReferenceExtendedEditorSample) && (refinement == FlatReferenceExtendedEditorSampleBasePropertiesEditionComponent.class || refinement == FlatReferenceExtendedEditorSampleSecondFlatReferenceExtendedEditorSamplePropertiesEditionComponent.class || refinement == CheckBoxExtendedEditorSamplePropertiesEditionComponent.class);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String, java.lang.Class)
	 * 
	 */
	@SuppressWarnings("rawtypes")
	public boolean provides(PropertiesEditingContext editingContext, String part, java.lang.Class refinement) {
		return (editingContext.getEObject() instanceof FlatReferenceExtendedEditorSample) && ((FlatReferenceExtendedEditorSampleBasePropertiesEditionComponent.BASE_PART.equals(part) && refinement == FlatReferenceExtendedEditorSampleBasePropertiesEditionComponent.class) || (FlatReferenceExtendedEditorSampleSecondFlatReferenceExtendedEditorSamplePropertiesEditionComponent.SECONDFLATREFERENCEEXTENDEDEDITORSAMPLE_PART.equals(part) && refinement == FlatReferenceExtendedEditorSampleSecondFlatReferenceExtendedEditorSamplePropertiesEditionComponent.class) || (CheckBoxExtendedEditorSampleBasePropertiesEditionComponent.BASE_PART.equals(part) && refinement == CheckBoxExtendedEditorSamplePropertiesEditionComponent.class));
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String)
	 * 
	 */
	public IPropertiesEditionComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext, String mode) {
		if (editingContext.getEObject() instanceof FlatReferenceExtendedEditorSample) {
			return new FlatReferenceExtendedEditorSamplePropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
		}
		return super.getPropertiesEditingComponent(editingContext, mode);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String, java.lang.String)
	 * 
	 */
	public IPropertiesEditionComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext, String mode, String part) {
		if (editingContext.getEObject() instanceof FlatReferenceExtendedEditorSample) {
			if (FlatReferenceExtendedEditorSampleBasePropertiesEditionComponent.BASE_PART.equals(part))
				return new FlatReferenceExtendedEditorSampleBasePropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (FlatReferenceExtendedEditorSampleSecondFlatReferenceExtendedEditorSamplePropertiesEditionComponent.SECONDFLATREFERENCEEXTENDEDEDITORSAMPLE_PART.equals(part))
				return new FlatReferenceExtendedEditorSampleSecondFlatReferenceExtendedEditorSamplePropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (CheckBoxExtendedEditorSampleBasePropertiesEditionComponent.BASE_PART.equals(part))
				return new CheckBoxExtendedEditorSamplePropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
		}
		return super.getPropertiesEditingComponent(editingContext, mode, part);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String, java.lang.String, java.lang.Class)
	 */
	@SuppressWarnings("rawtypes")
	public IPropertiesEditionComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext, String mode, String part, java.lang.Class refinement) {
		if (editingContext.getEObject() instanceof FlatReferenceExtendedEditorSample) {
			if (FlatReferenceExtendedEditorSampleBasePropertiesEditionComponent.BASE_PART.equals(part)
				&& refinement == FlatReferenceExtendedEditorSampleBasePropertiesEditionComponent.class)
				return new FlatReferenceExtendedEditorSampleBasePropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (FlatReferenceExtendedEditorSampleSecondFlatReferenceExtendedEditorSamplePropertiesEditionComponent.SECONDFLATREFERENCEEXTENDEDEDITORSAMPLE_PART.equals(part)
				&& refinement == FlatReferenceExtendedEditorSampleSecondFlatReferenceExtendedEditorSamplePropertiesEditionComponent.class)
				return new FlatReferenceExtendedEditorSampleSecondFlatReferenceExtendedEditorSamplePropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (CheckBoxExtendedEditorSampleBasePropertiesEditionComponent.BASE_PART.equals(part)
				&& refinement == CheckBoxExtendedEditorSamplePropertiesEditionComponent.class)
				return new CheckBoxExtendedEditorSamplePropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
		}
		return super.getPropertiesEditingComponent(editingContext, mode, part, refinement);
	}

}
