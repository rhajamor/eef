/**
 * Generated with Acceleo
 */
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
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;




/**
 * 
 * 
 */
public class EditorPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == EditorViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
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
