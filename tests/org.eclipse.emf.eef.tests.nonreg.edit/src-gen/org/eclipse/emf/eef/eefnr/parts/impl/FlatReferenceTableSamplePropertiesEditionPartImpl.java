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
package org.eclipse.emf.eef.eefnr.parts.impl;

// Start of user code for imports
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.eefnr.parts.EefnrViewsRepository;
import org.eclipse.emf.eef.eefnr.parts.FlatReferenceTableSamplePropertiesEditionPart;
import org.eclipse.emf.eef.eefnr.providers.EefnrMessages;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.widgets.FlatReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;



// End of user code	

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class FlatReferenceTableSamplePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, FlatReferenceTableSamplePropertiesEditionPart {

	protected FlatReferencesTable flatreferencetableRequiredProperty;
	protected FlatReferencesTable flatreferencetableOptionalProperty;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public FlatReferenceTableSamplePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createFigure(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public Composite createFigure(final Composite parent) {
		view = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(view);
		return view;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createControls(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(Composite view) { 
		createPropertiesGroup(view);


		// Start of user code for additional ui definition
		
		// End of user code
	}

	/**
	 * 
	 */
	protected void createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(EefnrMessages.FlatReferenceTableSamplePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		createFlatreferencetableRequiredPropertyFlatReferencesTable(propertiesGroup);
		createFlatreferencetableOptionalPropertyFlatReferencesTable(propertiesGroup);
	}

	/**
	 * @param parent
	 * 
	 */
	protected void createFlatreferencetableRequiredPropertyFlatReferencesTable(Composite parent) {
		SWTUtils.createPartLabel(parent, EefnrMessages.FlatReferenceTableSamplePropertiesEditionPart_FlatreferencetableRequiredPropertyLabel, propertiesEditionComponent.isRequired(EefnrViewsRepository.FlatReferenceTableSample.flatreferencetableRequiredProperty, EefnrViewsRepository.SWT_KIND));
		flatreferencetableRequiredProperty = new FlatReferencesTable(parent);
		flatreferencetableRequiredProperty.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		flatreferencetableRequiredProperty.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				if (event.getSelection() instanceof StructuredSelection) 
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FlatReferenceTableSamplePropertiesEditionPartImpl.this, EefnrViewsRepository.FlatReferenceTableSample.flatreferencetableRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, ((StructuredSelection)event.getSelection()).toList()));
			}

		});
		GridData flatreferencetableRequiredPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		flatreferencetableRequiredProperty.setLayoutData(flatreferencetableRequiredPropertyData);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EefnrViewsRepository.FlatReferenceTableSample.flatreferencetableRequiredProperty, EefnrViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}


	/**
	 * @param parent
	 * 
	 */
	protected void createFlatreferencetableOptionalPropertyFlatReferencesTable(Composite parent) {
		SWTUtils.createPartLabel(parent, EefnrMessages.FlatReferenceTableSamplePropertiesEditionPart_FlatreferencetableOptionalPropertyLabel, propertiesEditionComponent.isRequired(EefnrViewsRepository.FlatReferenceTableSample.flatreferencetableOptionalProperty, EefnrViewsRepository.SWT_KIND));
		flatreferencetableOptionalProperty = new FlatReferencesTable(parent);
		flatreferencetableOptionalProperty.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		flatreferencetableOptionalProperty.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				if (event.getSelection() instanceof StructuredSelection) 
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FlatReferenceTableSamplePropertiesEditionPartImpl.this, EefnrViewsRepository.FlatReferenceTableSample.flatreferencetableOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, ((StructuredSelection)event.getSelection()).toList()));
			}

		});
		GridData flatreferencetableOptionalPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		flatreferencetableOptionalProperty.setLayoutData(flatreferencetableOptionalPropertyData);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EefnrViewsRepository.FlatReferenceTableSample.flatreferencetableOptionalProperty, EefnrViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization
		
		// End of user code
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.FlatReferenceTableSamplePropertiesEditionPart#getFlatreferencetableRequiredPropertyToAdd()
	 * 
	 */
	public List getFlatreferencetableRequiredPropertyToAdd() {
		return flatreferencetableRequiredProperty.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.FlatReferenceTableSamplePropertiesEditionPart#getFlatreferencetableRequiredPropertyToRemove()
	 * 
	 */
	public List getFlatreferencetableRequiredPropertyToRemove() {
		return flatreferencetableRequiredProperty.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.FlatReferenceTableSamplePropertiesEditionPart#getFlatreferencetableRequiredPropertyTable()
	 * 
	 */
	public List getFlatreferencetableRequiredPropertyTable() {
		return flatreferencetableRequiredProperty.getVirtualList();
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.FlatReferenceTableSamplePropertiesEditionPart#initFlatreferencetableRequiredProperty(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initFlatreferencetableRequiredProperty(EObject current, EReference containingFeature, EReference feature) {
		flatreferencetableRequiredProperty.initComponent(current, containingFeature, feature);
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			flatreferencetableRequiredProperty.setInput(current.eResource().getResourceSet());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.FlatReferenceTableSamplePropertiesEditionPart#updateFlatreferencetableRequiredProperty(EObject newValue)
	 * 
	 */
	public void updateFlatreferencetableRequiredProperty(EObject newValue) {
		flatreferencetableRequiredProperty.updateComponent(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.FlatReferenceTableSamplePropertiesEditionPart#addFilterFlatreferencetableRequiredProperty(ViewerFilter filter)
	 * 
	 */
	public void addFilterToFlatreferencetableRequiredProperty(ViewerFilter filter) {
		flatreferencetableRequiredProperty.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.FlatReferenceTableSamplePropertiesEditionPart#addBusinessFilterFlatreferencetableRequiredProperty(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToFlatreferencetableRequiredProperty(ViewerFilter filter) {
		flatreferencetableRequiredProperty.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.FlatReferenceTableSamplePropertiesEditionPart#isContainedInFlatreferencetableRequiredPropertyTable(EObject element)
	 * 
	 */
	public boolean isContainedInFlatreferencetableRequiredPropertyTable(EObject element) {
		return flatreferencetableRequiredProperty.virtualListContains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.FlatReferenceTableSamplePropertiesEditionPart#getFlatreferencetableOptionalPropertyToAdd()
	 * 
	 */
	public List getFlatreferencetableOptionalPropertyToAdd() {
		return flatreferencetableOptionalProperty.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.FlatReferenceTableSamplePropertiesEditionPart#getFlatreferencetableOptionalPropertyToRemove()
	 * 
	 */
	public List getFlatreferencetableOptionalPropertyToRemove() {
		return flatreferencetableOptionalProperty.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.FlatReferenceTableSamplePropertiesEditionPart#getFlatreferencetableOptionalPropertyTable()
	 * 
	 */
	public List getFlatreferencetableOptionalPropertyTable() {
		return flatreferencetableOptionalProperty.getVirtualList();
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.FlatReferenceTableSamplePropertiesEditionPart#initFlatreferencetableOptionalProperty(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initFlatreferencetableOptionalProperty(EObject current, EReference containingFeature, EReference feature) {
		flatreferencetableOptionalProperty.initComponent(current, containingFeature, feature);
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			flatreferencetableOptionalProperty.setInput(current.eResource().getResourceSet());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.FlatReferenceTableSamplePropertiesEditionPart#updateFlatreferencetableOptionalProperty(EObject newValue)
	 * 
	 */
	public void updateFlatreferencetableOptionalProperty(EObject newValue) {
		flatreferencetableOptionalProperty.updateComponent(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.FlatReferenceTableSamplePropertiesEditionPart#addFilterFlatreferencetableOptionalProperty(ViewerFilter filter)
	 * 
	 */
	public void addFilterToFlatreferencetableOptionalProperty(ViewerFilter filter) {
		flatreferencetableOptionalProperty.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.FlatReferenceTableSamplePropertiesEditionPart#addBusinessFilterFlatreferencetableOptionalProperty(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToFlatreferencetableOptionalProperty(ViewerFilter filter) {
		flatreferencetableOptionalProperty.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.FlatReferenceTableSamplePropertiesEditionPart#isContainedInFlatreferencetableOptionalPropertyTable(EObject element)
	 * 
	 */
	public boolean isContainedInFlatreferencetableOptionalPropertyTable(EObject element) {
		return flatreferencetableOptionalProperty.virtualListContains(element);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EefnrMessages.FlatReferenceTableSample_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
