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
package org.eclipse.emf.eef.eefnr.providers;

import org.eclipse.emf.common.notify.Adapter;

import org.eclipse.emf.eef.eefnr.providers.AdvancedEObjectFlatComboViewerSamplePropertiesEditionProvider;
import org.eclipse.emf.eef.eefnr.providers.AdvancedReferencesTableSamplePropertiesEditionProvider;
import org.eclipse.emf.eef.eefnr.providers.AdvancedTableCompositionEditorSamplePropertiesEditionProvider;
import org.eclipse.emf.eef.eefnr.providers.CheckboxSamplePropertiesEditionProvider;
import org.eclipse.emf.eef.eefnr.providers.ComboSamplePropertiesEditionProvider;
import org.eclipse.emf.eef.eefnr.providers.EMFComboViewerSamplePropertiesEditionProvider;
import org.eclipse.emf.eef.eefnr.providers.EObjectFlatComboViewerSamplePropertiesEditionProvider;
import org.eclipse.emf.eef.eefnr.providers.FlatReferenceTableSamplePropertiesEditionProvider;
import org.eclipse.emf.eef.eefnr.providers.ImageViewerSamplePropertiesEditionProvider;
import org.eclipse.emf.eef.eefnr.providers.MultiValuedEditorSamplePropertiesEditionProvider;
import org.eclipse.emf.eef.eefnr.providers.RadioSamplePropertiesEditionProvider;
import org.eclipse.emf.eef.eefnr.providers.ReferencesTableSamplePropertiesEditionProvider;
import org.eclipse.emf.eef.eefnr.providers.RootPropertiesEditionProvider;
import org.eclipse.emf.eef.eefnr.providers.SamplePropertiesEditionProvider;
import org.eclipse.emf.eef.eefnr.providers.SelectionDialogSamplePropertiesEditionProvider;
import org.eclipse.emf.eef.eefnr.providers.SingleCompositionViewerSamplePropertiesEditionProvider;
import org.eclipse.emf.eef.eefnr.providers.TableCompositionEditorSamplePropertiesEditionProvider;
import org.eclipse.emf.eef.eefnr.providers.TableCompositionExtensionEditorSamplePropertiesEditionProvider;
import org.eclipse.emf.eef.eefnr.providers.TextSamplePropertiesEditionProvider;
import org.eclipse.emf.eef.eefnr.providers.TextSampleWithTwoTabsPropertiesEditionProvider;
import org.eclipse.emf.eef.eefnr.providers.TextareaSamplePropertiesEditionProvider;
import org.eclipse.emf.eef.eefnr.providers.TotalSamplePropertiesEditionProvider;

import org.eclipse.emf.eef.eefnr.util.EefnrAdapterFactory;

import org.eclipse.emf.eef.navigation.providers.NamedElementPropertiesEditionProvider;

import org.eclipse.emf.eef.references.providers.AbstractSamplePropertiesEditionProvider;

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class EefnrEEFAdapterFactory extends EefnrAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.eefnr.util.EefnrAdapterFactory#createRootAdapter()
	 * 
	 */
	public Adapter createRootAdapter() {
		return new RootPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.eefnr.util.EefnrAdapterFactory#createAbstractSampleAdapter()
	 * 
	 */
	public Adapter createAbstractSampleAdapter() {
		return new AbstractSamplePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.eefnr.util.EefnrAdapterFactory#createTotalSampleAdapter()
	 * 
	 */
	public Adapter createTotalSampleAdapter() {
		return new TotalSamplePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.eefnr.util.EefnrAdapterFactory#createTextSampleAdapter()
	 * 
	 */
	public Adapter createTextSampleAdapter() {
		return new TextSamplePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.eefnr.util.EefnrAdapterFactory#createCheckboxSampleAdapter()
	 * 
	 */
	public Adapter createCheckboxSampleAdapter() {
		return new CheckboxSamplePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.eefnr.util.EefnrAdapterFactory#createTextareaSampleAdapter()
	 * 
	 */
	public Adapter createTextareaSampleAdapter() {
		return new TextareaSamplePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.eefnr.util.EefnrAdapterFactory#createRadioSampleAdapter()
	 * 
	 */
	public Adapter createRadioSampleAdapter() {
		return new RadioSamplePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.eefnr.util.EefnrAdapterFactory#createEObjectFlatComboViewerSampleAdapter()
	 * 
	 */
	public Adapter createEObjectFlatComboViewerSampleAdapter() {
		return new EObjectFlatComboViewerSamplePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.eefnr.util.EefnrAdapterFactory#createReferencesTableSampleAdapter()
	 * 
	 */
	public Adapter createReferencesTableSampleAdapter() {
		return new ReferencesTableSamplePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.eefnr.util.EefnrAdapterFactory#createEMFComboViewerSampleAdapter()
	 * 
	 */
	public Adapter createEMFComboViewerSampleAdapter() {
		return new EMFComboViewerSamplePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.eefnr.util.EefnrAdapterFactory#createComboSampleAdapter()
	 * 
	 */
	public Adapter createComboSampleAdapter() {
		return new ComboSamplePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.eefnr.util.EefnrAdapterFactory#createMultiValuedEditorSampleAdapter()
	 * 
	 */
	public Adapter createMultiValuedEditorSampleAdapter() {
		return new MultiValuedEditorSamplePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.eefnr.util.EefnrAdapterFactory#createTableCompositionEditorSampleAdapter()
	 * 
	 */
	public Adapter createTableCompositionEditorSampleAdapter() {
		return new TableCompositionEditorSamplePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.eefnr.util.EefnrAdapterFactory#createAdvancedReferencesTableSampleAdapter()
	 * 
	 */
	public Adapter createAdvancedReferencesTableSampleAdapter() {
		return new AdvancedReferencesTableSamplePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.eefnr.util.EefnrAdapterFactory#createAdvancedEObjectFlatComboViewerSampleAdapter()
	 * 
	 */
	public Adapter createAdvancedEObjectFlatComboViewerSampleAdapter() {
		return new AdvancedEObjectFlatComboViewerSamplePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.eefnr.util.EefnrAdapterFactory#createAdvancedTableCompositionEditorSampleAdapter()
	 * 
	 */
	public Adapter createAdvancedTableCompositionEditorSampleAdapter() {
		return new AdvancedTableCompositionEditorSamplePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.eefnr.util.EefnrAdapterFactory#createFlatReferencesTableSampleAdapter()
	 * 
	 */
	public Adapter createFlatReferencesTableSampleAdapter() {
		return new FlatReferenceTableSamplePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.eefnr.util.EefnrAdapterFactory#createSampleAdapter()
	 * 
	 */
	public Adapter createSampleAdapter() {
		return new SamplePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.eefnr.util.EefnrAdapterFactory#createTextSampleWithTwoTabsAdapter()
	 * 
	 */
	public Adapter createTextSampleWithTwoTabsAdapter() {
		return new TextSampleWithTwoTabsPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.eefnr.util.EefnrAdapterFactory#createTableCompositionExtensionEditorSampleAdapter()
	 * 
	 */
	public Adapter createTableCompositionExtensionEditorSampleAdapter() {
		return new TableCompositionExtensionEditorSamplePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.eefnr.util.EefnrAdapterFactory#createNamedElementAdapter()
	 * 
	 */
	public Adapter createNamedElementAdapter() {
		return new NamedElementPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.eefnr.util.EefnrAdapterFactory#createImageViewerSampleAdapter()
	 * 
	 */
	public Adapter createImageViewerSampleAdapter() {
		return new ImageViewerSamplePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.eefnr.util.EefnrAdapterFactory#createSelectionDialogSampleAdapter()
	 * 
	 */
	public Adapter createSelectionDialogSampleAdapter() {
		return new SelectionDialogSamplePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.eefnr.util.EefnrAdapterFactory#createSingleCompositionViewerSampleAdapter()
	 * 
	 */
	public Adapter createSingleCompositionViewerSampleAdapter() {
		return new SingleCompositionViewerSamplePropertiesEditionProvider();
	}

}
