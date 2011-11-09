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

import org.eclipse.emf.common.notify.Adapter;
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
