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

import org.eclipse.emf.eef.eefnrext.parts.EefnrextViewsRepository;
import org.eclipse.emf.eef.eefnrext.parts.forms.CheckBoxExtendedEditorSamplePropertiesEditionPartForm;
import org.eclipse.emf.eef.eefnrext.parts.forms.FlatReferenceExtendedEditorSamplePropertiesEditionPartForm;
import org.eclipse.emf.eef.eefnrext.parts.forms.SecondFlatReferenceExtendedEditorSamplePropertiesEditionPartForm;
import org.eclipse.emf.eef.eefnrext.parts.forms.TableCompositionTargetExtensionEditorSamplePropertiesEditionPartForm;
import org.eclipse.emf.eef.eefnrext.parts.impl.CheckBoxExtendedEditorSamplePropertiesEditionPartImpl;
import org.eclipse.emf.eef.eefnrext.parts.impl.FlatReferenceExtendedEditorSamplePropertiesEditionPartImpl;
import org.eclipse.emf.eef.eefnrext.parts.impl.SecondFlatReferenceExtendedEditorSamplePropertiesEditionPartImpl;
import org.eclipse.emf.eef.eefnrext.parts.impl.TableCompositionTargetExtensionEditorSamplePropertiesEditionPartImpl;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;




/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class EefnrextPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == EefnrextViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == EefnrextViewsRepository.TableCompositionTargetExtensionEditorSample.class) {
			if (kind == EefnrextViewsRepository.SWT_KIND)
				return new TableCompositionTargetExtensionEditorSamplePropertiesEditionPartImpl(component);
			if (kind == EefnrextViewsRepository.FORM_KIND)
				return new TableCompositionTargetExtensionEditorSamplePropertiesEditionPartForm(component);
		}
		if (key == EefnrextViewsRepository.FlatReferenceExtendedEditorSample.class) {
			if (kind == EefnrextViewsRepository.SWT_KIND)
				return new FlatReferenceExtendedEditorSamplePropertiesEditionPartImpl(component);
			if (kind == EefnrextViewsRepository.FORM_KIND)
				return new FlatReferenceExtendedEditorSamplePropertiesEditionPartForm(component);
		}
		if (key == EefnrextViewsRepository.SecondFlatReferenceExtendedEditorSample.class) {
			if (kind == EefnrextViewsRepository.SWT_KIND)
				return new SecondFlatReferenceExtendedEditorSamplePropertiesEditionPartImpl(component);
			if (kind == EefnrextViewsRepository.FORM_KIND)
				return new SecondFlatReferenceExtendedEditorSamplePropertiesEditionPartForm(component);
		}
		if (key == EefnrextViewsRepository.CheckBoxExtendedEditorSample.class) {
			if (kind == EefnrextViewsRepository.SWT_KIND)
				return new CheckBoxExtendedEditorSamplePropertiesEditionPartImpl(component);
			if (kind == EefnrextViewsRepository.FORM_KIND)
				return new CheckBoxExtendedEditorSamplePropertiesEditionPartForm(component);
		}
		return null;
	}

}
