/*******************************************************************************
 * Copyright (c) 2008, 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.runtime.ui.widgets.masterdetails;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.eef.runtime.ui.utils.EEFRuntimeUIMessages;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.SectionPart;
import org.eclipse.ui.forms.widgets.ExpandableComposite;
import org.eclipse.ui.forms.widgets.FormToolkit;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 *
 */
public abstract class AbstractEEFMasterPart extends SectionPart {

	protected StructuredViewer modelViewer;
	private AdapterFactory adapterFactory;
	private AbstractEEFMasterDetailsBlock block;
	
	/**
	 * @param toolkit the toolkit to use to create part widgets
	 * @param container the composite where to create the part
	 * @param block the AbstractEEFMasterDetailsBlock
	 */
	public AbstractEEFMasterPart(FormToolkit toolkit, Composite container, AbstractEEFMasterDetailsBlock block) {
		super(container, toolkit, ExpandableComposite.TITLE_BAR);
		this.block = block;
		Composite sectionContainer = toolkit.createComposite(getSection());
		createSectionClient(sectionContainer, toolkit);
		getSection().setText(EEFRuntimeUIMessages.AbstractEEFMasterPart_part_title);
		getSection().setClient(sectionContainer);
		
		
	}
	
	/**
	 * Create the content of the master part
	 * @param sectionContainer the parent
	 * @param toolkit the toolkit to use
	 */
	protected void createSectionClient(Composite sectionContainer, FormToolkit toolkit) {
		sectionContainer.setLayout(new GridLayout());
		modelViewer = null;
		modelViewer = createSectionClientContents(sectionContainer, toolkit);
		assert modelViewer != null : EEFRuntimeUIMessages.AbstractEEFMasterPart_part_cannot_be_null;
	}

	/**
	 * Create the content of the master part
	 * @param sectionContainer the parent
	 * @param toolkit the toolkit to use
	 */
	protected abstract StructuredViewer createSectionClientContents(Composite sectionContainer, FormToolkit toolkit);
	
	/**
	 * @return the adapterFactory
	 */
	public AdapterFactory getAdapterFactory() {
		if (adapterFactory == null)
			adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		return adapterFactory;
	}

	/**
	 * @param adapterFactory the adapterFactory to set
	 */
	public void setAdapterFactory(AdapterFactory adapterFactory) {
		this.adapterFactory = adapterFactory;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		getSection().setText(title);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.ui.widgets.masterdetails.IEEFMasterPart#getModelViewer()
	 */
	public StructuredViewer getModelViewer() {
		return modelViewer;
	}
	
	/**
	 * @param input the input of the model viewer
	 */
	public void setInput(Object input) {
		assert modelViewer != null : EEFRuntimeUIMessages.AbstractEEFMasterPart_viewer_not_defined_on_input_model_definition;
		modelViewer.setInput(input);
	}
	
	/**
	 * @param listener add a listener to the mode viewer
	 */
	public void addSelectionChangeListener(ISelectionChangedListener listener) {
		assert modelViewer != null : EEFRuntimeUIMessages.AbstractEEFMasterPart_viewer_not_defined_on_selection_listener_adding;
		modelViewer.addSelectionChangedListener(listener);
	}
	
	/**
	 * @param listener remove a listener to the mode viewer
	 */
	public void removeSelectionChangeListener(ISelectionChangedListener listener) {
		assert modelViewer != null : EEFRuntimeUIMessages.AbstractEEFMasterPart_viewer_not_defined_on_selection_listener_adding;
		modelViewer.removeSelectionChangedListener(listener);
	}

	/**
	 * @param filter add a filter to the model viewer
	 */
	public void addFilter(ViewerFilter filter) {
		assert modelViewer != null : EEFRuntimeUIMessages.AbstractEEFMasterPart_viewer_not_defined_on_filter_adding;
		modelViewer.addFilter(filter);
	}
	
	/**
	 * @return the AbstractEEFMasterDetailsBlock
	 */
	public AbstractEEFMasterDetailsBlock getBlock() {
		return block;
	}
	
	/**
	 * @param block the AbstractEEFMasterDetailsBlock
	 */
	public void setBlock(AbstractEEFMasterDetailsBlock block) {
		this.block = block;
	}
		
}
