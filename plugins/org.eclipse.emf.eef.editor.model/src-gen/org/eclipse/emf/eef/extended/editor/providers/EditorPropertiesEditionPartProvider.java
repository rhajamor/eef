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
package org.eclipse.emf.eef.extended.editor.providers;

import org.eclipse.emf.eef.extended.editor.parts.EditorViewsRepository;
import org.eclipse.emf.eef.extended.editor.parts.forms.DynamicEEFEditorContributionPropertiesEditionPartForm;
import org.eclipse.emf.eef.extended.editor.parts.forms.EEFEditorContributionsPropertiesEditionPartForm;
import org.eclipse.emf.eef.extended.editor.parts.forms.EEFEditorPagesPropertiesEditionPartForm;
import org.eclipse.emf.eef.extended.editor.parts.forms.EEFMasterPagePropertiesEditionPartForm;
import org.eclipse.emf.eef.extended.editor.parts.forms.PartFilterPropertiesEditionPartForm;
import org.eclipse.emf.eef.extended.editor.parts.forms.StandardFormPagePropertiesEditionPartForm;
import org.eclipse.emf.eef.extended.editor.parts.forms.StaticEEFEditorContributionPropertiesEditionPartForm;
import org.eclipse.emf.eef.extended.editor.parts.forms.TreeMasterPagePropertiesEditionPartForm;
import org.eclipse.emf.eef.extended.editor.parts.impl.DynamicEEFEditorContributionPropertiesEditionPartImpl;
import org.eclipse.emf.eef.extended.editor.parts.impl.EEFEditorContributionsPropertiesEditionPartImpl;
import org.eclipse.emf.eef.extended.editor.parts.impl.EEFEditorPagesPropertiesEditionPartImpl;
import org.eclipse.emf.eef.extended.editor.parts.impl.EEFMasterPagePropertiesEditionPartImpl;
import org.eclipse.emf.eef.extended.editor.parts.impl.PartFilterPropertiesEditionPartImpl;
import org.eclipse.emf.eef.extended.editor.parts.impl.StandardFormPagePropertiesEditionPartImpl;
import org.eclipse.emf.eef.extended.editor.parts.impl.StaticEEFEditorContributionPropertiesEditionPartImpl;
import org.eclipse.emf.eef.extended.editor.parts.impl.TreeMasterPagePropertiesEditionPartImpl;
import org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.parts.PropertiesEditingPart;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingPartProvider;




/**
 * 
 * 
 */
public class EditorPropertiesEditionPartProvider implements PropertiesEditingPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingPartProvider.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == EditorViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingPartProvider.IPropertiesEditionPartProvider#getPropertiesEditingPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent)
	 * 
	 */
	public PropertiesEditingPart getPropertiesEditingPart(Object key, int kind, PropertiesEditingComponent component) {
		if (key == EditorViewsRepository.StandardFormPage.class) {
			if (kind == EditorViewsRepository.SWT_KIND)
				return new StandardFormPagePropertiesEditionPartImpl(component);
			if (kind == EditorViewsRepository.FORM_KIND)
				return new StandardFormPagePropertiesEditionPartForm(component);
		}
		if (key == EditorViewsRepository.EEFMasterPage.class) {
			if (kind == EditorViewsRepository.SWT_KIND)
				return new EEFMasterPagePropertiesEditionPartImpl(component);
			if (kind == EditorViewsRepository.FORM_KIND)
				return new EEFMasterPagePropertiesEditionPartForm(component);
		}
		if (key == EditorViewsRepository.TreeMasterPage.class) {
			if (kind == EditorViewsRepository.SWT_KIND)
				return new TreeMasterPagePropertiesEditionPartImpl(component);
			if (kind == EditorViewsRepository.FORM_KIND)
				return new TreeMasterPagePropertiesEditionPartForm(component);
		}
		if (key == EditorViewsRepository.PartFilter.class) {
			if (kind == EditorViewsRepository.SWT_KIND)
				return new PartFilterPropertiesEditionPartImpl(component);
			if (kind == EditorViewsRepository.FORM_KIND)
				return new PartFilterPropertiesEditionPartForm(component);
		}
		if (key == EditorViewsRepository.EEFEditorContributions.class) {
			if (kind == EditorViewsRepository.SWT_KIND)
				return new EEFEditorContributionsPropertiesEditionPartImpl(component);
			if (kind == EditorViewsRepository.FORM_KIND)
				return new EEFEditorContributionsPropertiesEditionPartForm(component);
		}
		if (key == EditorViewsRepository.EEFEditorPages.class) {
			if (kind == EditorViewsRepository.SWT_KIND)
				return new EEFEditorPagesPropertiesEditionPartImpl(component);
			if (kind == EditorViewsRepository.FORM_KIND)
				return new EEFEditorPagesPropertiesEditionPartForm(component);
		}
		if (key == EditorViewsRepository.StaticEEFEditorContribution.class) {
			if (kind == EditorViewsRepository.SWT_KIND)
				return new StaticEEFEditorContributionPropertiesEditionPartImpl(component);
			if (kind == EditorViewsRepository.FORM_KIND)
				return new StaticEEFEditorContributionPropertiesEditionPartForm(component);
		}
		if (key == EditorViewsRepository.DynamicEEFEditorContribution.class) {
			if (kind == EditorViewsRepository.SWT_KIND)
				return new DynamicEEFEditorContributionPropertiesEditionPartImpl(component);
			if (kind == EditorViewsRepository.FORM_KIND)
				return new DynamicEEFEditorContributionPropertiesEditionPartForm(component);
		}
		return null;
	}

}
