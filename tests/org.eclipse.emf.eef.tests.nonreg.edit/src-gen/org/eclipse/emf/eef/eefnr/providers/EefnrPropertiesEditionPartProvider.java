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
package org.eclipse.emf.eef.eefnr.providers;

import org.eclipse.emf.eef.eefnr.parts.EefnrViewsRepository;
import org.eclipse.emf.eef.eefnr.parts.forms.AdvancedEObjectFlatComboViewerSamplePropertiesEditionPartForm;
import org.eclipse.emf.eef.eefnr.parts.forms.AdvancedReferencesTableSamplePropertiesEditionPartForm;
import org.eclipse.emf.eef.eefnr.parts.forms.AdvancedTableCompositionEditorSamplePropertiesEditionPartForm;
import org.eclipse.emf.eef.eefnr.parts.forms.CheckboxSamplePropertiesEditionPartForm;
import org.eclipse.emf.eef.eefnr.parts.forms.EMFComboViewerSamplePropertiesEditionPartForm;
import org.eclipse.emf.eef.eefnr.parts.forms.EObjectFlatComboViewerSamplePropertiesEditionPartForm;
import org.eclipse.emf.eef.eefnr.parts.forms.FlatReferenceTableSamplePropertiesEditionPartForm;
import org.eclipse.emf.eef.eefnr.parts.forms.ImageViewerSamplePropertiesEditionPartForm;
import org.eclipse.emf.eef.eefnr.parts.forms.MultiValuedEditorSamplePropertiesEditionPartForm;
import org.eclipse.emf.eef.eefnr.parts.forms.RadioSamplePropertiesEditionPartForm;
import org.eclipse.emf.eef.eefnr.parts.forms.ReferencesTableSamplePropertiesEditionPartForm;
import org.eclipse.emf.eef.eefnr.parts.forms.RootPropertiesEditionPartForm;
import org.eclipse.emf.eef.eefnr.parts.forms.SamplePropertiesEditionPartForm;
import org.eclipse.emf.eef.eefnr.parts.forms.SelectionDialogSamplePropertiesEditionPartForm;
import org.eclipse.emf.eef.eefnr.parts.forms.SingleCompositionViewerSamplePropertiesEditionPartForm;
import org.eclipse.emf.eef.eefnr.parts.forms.TableCompositionEditorSamplePropertiesEditionPartForm;
import org.eclipse.emf.eef.eefnr.parts.forms.TableCompositionExtensionEditorSamplePropertiesEditionPartForm;
import org.eclipse.emf.eef.eefnr.parts.forms.TextSampleFirstTabPropertiesEditionPartForm;
import org.eclipse.emf.eef.eefnr.parts.forms.TextSamplePropertiesEditionPartForm;
import org.eclipse.emf.eef.eefnr.parts.forms.TextSampleSecondTabPropertiesEditionPartForm;
import org.eclipse.emf.eef.eefnr.parts.forms.TextareaSamplePropertiesEditionPartForm;
import org.eclipse.emf.eef.eefnr.parts.forms.TotalSamplePropertiesEditionPartForm;
import org.eclipse.emf.eef.eefnr.parts.impl.AdvancedEObjectFlatComboViewerSamplePropertiesEditionPartImpl;
import org.eclipse.emf.eef.eefnr.parts.impl.AdvancedReferencesTableSamplePropertiesEditionPartImpl;
import org.eclipse.emf.eef.eefnr.parts.impl.AdvancedTableCompositionEditorSamplePropertiesEditionPartImpl;
import org.eclipse.emf.eef.eefnr.parts.impl.CheckboxSamplePropertiesEditionPartImpl;
import org.eclipse.emf.eef.eefnr.parts.impl.EMFComboViewerSamplePropertiesEditionPartImpl;
import org.eclipse.emf.eef.eefnr.parts.impl.EObjectFlatComboViewerSamplePropertiesEditionPartImpl;
import org.eclipse.emf.eef.eefnr.parts.impl.FlatReferenceTableSamplePropertiesEditionPartImpl;
import org.eclipse.emf.eef.eefnr.parts.impl.ImageViewerSamplePropertiesEditionPartImpl;
import org.eclipse.emf.eef.eefnr.parts.impl.MultiValuedEditorSamplePropertiesEditionPartImpl;
import org.eclipse.emf.eef.eefnr.parts.impl.RadioSamplePropertiesEditionPartImpl;
import org.eclipse.emf.eef.eefnr.parts.impl.ReferencesTableSamplePropertiesEditionPartImpl;
import org.eclipse.emf.eef.eefnr.parts.impl.RootPropertiesEditionPartImpl;
import org.eclipse.emf.eef.eefnr.parts.impl.SamplePropertiesEditionPartImpl;
import org.eclipse.emf.eef.eefnr.parts.impl.SelectionDialogSamplePropertiesEditionPartImpl;
import org.eclipse.emf.eef.eefnr.parts.impl.SingleCompositionViewerSamplePropertiesEditionPartImpl;
import org.eclipse.emf.eef.eefnr.parts.impl.TableCompositionEditorSamplePropertiesEditionPartImpl;
import org.eclipse.emf.eef.eefnr.parts.impl.TableCompositionExtensionEditorSamplePropertiesEditionPartImpl;
import org.eclipse.emf.eef.eefnr.parts.impl.TextSampleFirstTabPropertiesEditionPartImpl;
import org.eclipse.emf.eef.eefnr.parts.impl.TextSamplePropertiesEditionPartImpl;
import org.eclipse.emf.eef.eefnr.parts.impl.TextSampleSecondTabPropertiesEditionPartImpl;
import org.eclipse.emf.eef.eefnr.parts.impl.TextareaSamplePropertiesEditionPartImpl;
import org.eclipse.emf.eef.eefnr.parts.impl.TotalSamplePropertiesEditionPartImpl;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;




/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class EefnrPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == EefnrViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == EefnrViewsRepository.Root.class) {
			if (kind == EefnrViewsRepository.SWT_KIND)
				return new RootPropertiesEditionPartImpl(component);
			if (kind == EefnrViewsRepository.FORM_KIND)
				return new RootPropertiesEditionPartForm(component);
		}
		if (key == EefnrViewsRepository.TotalSample.class) {
			if (kind == EefnrViewsRepository.SWT_KIND)
				return new TotalSamplePropertiesEditionPartImpl(component);
			if (kind == EefnrViewsRepository.FORM_KIND)
				return new TotalSamplePropertiesEditionPartForm(component);
		}
		if (key == EefnrViewsRepository.TextSample.class) {
			if (kind == EefnrViewsRepository.SWT_KIND)
				return new TextSamplePropertiesEditionPartImpl(component);
			if (kind == EefnrViewsRepository.FORM_KIND)
				return new TextSamplePropertiesEditionPartForm(component);
		}
		if (key == EefnrViewsRepository.CheckboxSample.class) {
			if (kind == EefnrViewsRepository.SWT_KIND)
				return new CheckboxSamplePropertiesEditionPartImpl(component);
			if (kind == EefnrViewsRepository.FORM_KIND)
				return new CheckboxSamplePropertiesEditionPartForm(component);
		}
		if (key == EefnrViewsRepository.TextareaSample.class) {
			if (kind == EefnrViewsRepository.SWT_KIND)
				return new TextareaSamplePropertiesEditionPartImpl(component);
			if (kind == EefnrViewsRepository.FORM_KIND)
				return new TextareaSamplePropertiesEditionPartForm(component);
		}
		if (key == EefnrViewsRepository.RadioSample.class) {
			if (kind == EefnrViewsRepository.SWT_KIND)
				return new RadioSamplePropertiesEditionPartImpl(component);
			if (kind == EefnrViewsRepository.FORM_KIND)
				return new RadioSamplePropertiesEditionPartForm(component);
		}
		if (key == EefnrViewsRepository.EObjectFlatComboViewerSample.class) {
			if (kind == EefnrViewsRepository.SWT_KIND)
				return new EObjectFlatComboViewerSamplePropertiesEditionPartImpl(component);
			if (kind == EefnrViewsRepository.FORM_KIND)
				return new EObjectFlatComboViewerSamplePropertiesEditionPartForm(component);
		}
		if (key == EefnrViewsRepository.ReferencesTableSample.class) {
			if (kind == EefnrViewsRepository.SWT_KIND)
				return new ReferencesTableSamplePropertiesEditionPartImpl(component);
			if (kind == EefnrViewsRepository.FORM_KIND)
				return new ReferencesTableSamplePropertiesEditionPartForm(component);
		}
		if (key == EefnrViewsRepository.EMFComboViewerSample.class) {
			if (kind == EefnrViewsRepository.SWT_KIND)
				return new EMFComboViewerSamplePropertiesEditionPartImpl(component);
			if (kind == EefnrViewsRepository.FORM_KIND)
				return new EMFComboViewerSamplePropertiesEditionPartForm(component);
		}
		if (key == EefnrViewsRepository.MultiValuedEditorSample.class) {
			if (kind == EefnrViewsRepository.SWT_KIND)
				return new MultiValuedEditorSamplePropertiesEditionPartImpl(component);
			if (kind == EefnrViewsRepository.FORM_KIND)
				return new MultiValuedEditorSamplePropertiesEditionPartForm(component);
		}
		if (key == EefnrViewsRepository.TableCompositionEditorSample.class) {
			if (kind == EefnrViewsRepository.SWT_KIND)
				return new TableCompositionEditorSamplePropertiesEditionPartImpl(component);
			if (kind == EefnrViewsRepository.FORM_KIND)
				return new TableCompositionEditorSamplePropertiesEditionPartForm(component);
		}
		if (key == EefnrViewsRepository.AdvancedReferencesTableSample.class) {
			if (kind == EefnrViewsRepository.SWT_KIND)
				return new AdvancedReferencesTableSamplePropertiesEditionPartImpl(component);
			if (kind == EefnrViewsRepository.FORM_KIND)
				return new AdvancedReferencesTableSamplePropertiesEditionPartForm(component);
		}
		if (key == EefnrViewsRepository.AdvancedEObjectFlatComboViewerSample.class) {
			if (kind == EefnrViewsRepository.SWT_KIND)
				return new AdvancedEObjectFlatComboViewerSamplePropertiesEditionPartImpl(component);
			if (kind == EefnrViewsRepository.FORM_KIND)
				return new AdvancedEObjectFlatComboViewerSamplePropertiesEditionPartForm(component);
		}
		if (key == EefnrViewsRepository.AdvancedTableCompositionEditorSample.class) {
			if (kind == EefnrViewsRepository.SWT_KIND)
				return new AdvancedTableCompositionEditorSamplePropertiesEditionPartImpl(component);
			if (kind == EefnrViewsRepository.FORM_KIND)
				return new AdvancedTableCompositionEditorSamplePropertiesEditionPartForm(component);
		}
		if (key == EefnrViewsRepository.FlatReferenceTableSample.class) {
			if (kind == EefnrViewsRepository.SWT_KIND)
				return new FlatReferenceTableSamplePropertiesEditionPartImpl(component);
			if (kind == EefnrViewsRepository.FORM_KIND)
				return new FlatReferenceTableSamplePropertiesEditionPartForm(component);
		}
		if (key == EefnrViewsRepository.Sample.class) {
			if (kind == EefnrViewsRepository.SWT_KIND)
				return new SamplePropertiesEditionPartImpl(component);
			if (kind == EefnrViewsRepository.FORM_KIND)
				return new SamplePropertiesEditionPartForm(component);
		}
		if (key == EefnrViewsRepository.TextSampleFirstTab.class) {
			if (kind == EefnrViewsRepository.SWT_KIND)
				return new TextSampleFirstTabPropertiesEditionPartImpl(component);
			if (kind == EefnrViewsRepository.FORM_KIND)
				return new TextSampleFirstTabPropertiesEditionPartForm(component);
		}
		if (key == EefnrViewsRepository.TextSampleSecondTab.class) {
			if (kind == EefnrViewsRepository.SWT_KIND)
				return new TextSampleSecondTabPropertiesEditionPartImpl(component);
			if (kind == EefnrViewsRepository.FORM_KIND)
				return new TextSampleSecondTabPropertiesEditionPartForm(component);
		}
		if (key == EefnrViewsRepository.TableCompositionExtensionEditorSample.class) {
			if (kind == EefnrViewsRepository.SWT_KIND)
				return new TableCompositionExtensionEditorSamplePropertiesEditionPartImpl(component);
			if (kind == EefnrViewsRepository.FORM_KIND)
				return new TableCompositionExtensionEditorSamplePropertiesEditionPartForm(component);
		}
		if (key == EefnrViewsRepository.ImageViewerSample.class) {
			if (kind == EefnrViewsRepository.SWT_KIND)
				return new ImageViewerSamplePropertiesEditionPartImpl(component);
			if (kind == EefnrViewsRepository.FORM_KIND)
				return new ImageViewerSamplePropertiesEditionPartForm(component);
		}
		if (key == EefnrViewsRepository.SelectionDialogSample.class) {
			if (kind == EefnrViewsRepository.SWT_KIND)
				return new SelectionDialogSamplePropertiesEditionPartImpl(component);
			if (kind == EefnrViewsRepository.FORM_KIND)
				return new SelectionDialogSamplePropertiesEditionPartForm(component);
		}
		if (key == EefnrViewsRepository.SingleCompositionViewerSample.class) {
			if (kind == EefnrViewsRepository.SWT_KIND)
				return new SingleCompositionViewerSamplePropertiesEditionPartImpl(component);
			if (kind == EefnrViewsRepository.FORM_KIND)
				return new SingleCompositionViewerSamplePropertiesEditionPartForm(component);
		}
		return null;
	}

}
