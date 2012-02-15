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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.eefnr.parts.EefnrViewsRepository;
import org.eclipse.emf.eef.eefnr.parts.FlatReferenceTableSamplePropertiesEditionPart;
import org.eclipse.emf.eef.eefnr.providers.EefnrMessages;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.widgets.FlatReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
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
		CompositionSequence flatReferenceTableSampleStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = flatReferenceTableSampleStep.addStep(EefnrViewsRepository.FlatReferenceTableSample.Properties.class);
		propertiesStep.addStep(EefnrViewsRepository.FlatReferenceTableSample.Properties.flatreferencetableRequiredProperty);
		propertiesStep.addStep(EefnrViewsRepository.FlatReferenceTableSample.Properties.flatreferencetableOptionalProperty);
		
		
		composer = new PartComposer(flatReferenceTableSampleStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EefnrViewsRepository.FlatReferenceTableSample.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == EefnrViewsRepository.FlatReferenceTableSample.Properties.flatreferencetableRequiredProperty) {
					return createFlatreferencetableRequiredPropertyFlatReferencesTable(parent);
				}
				if (key == EefnrViewsRepository.FlatReferenceTableSample.Properties.flatreferencetableOptionalProperty) {
					return createFlatreferencetableOptionalPropertyFlatReferencesTable(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(EefnrMessages.FlatReferenceTableSamplePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	/**
	 * @param parent
	 * 
	 */
	protected Composite createFlatreferencetableRequiredPropertyFlatReferencesTable(Composite parent) {
		SWTUtils.createPartLabel(parent, EefnrMessages.FlatReferenceTableSamplePropertiesEditionPart_FlatreferencetableRequiredPropertyLabel, propertiesEditionComponent.isRequired(EefnrViewsRepository.FlatReferenceTableSample.Properties.flatreferencetableRequiredProperty, EefnrViewsRepository.SWT_KIND));
		flatreferencetableRequiredProperty = new FlatReferencesTable(parent);
		flatreferencetableRequiredProperty.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		flatreferencetableRequiredProperty.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				if (event.getSelection() instanceof StructuredSelection) 
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FlatReferenceTableSamplePropertiesEditionPartImpl.this, EefnrViewsRepository.FlatReferenceTableSample.Properties.flatreferencetableRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, ((StructuredSelection)event.getSelection()).toList()));
			}

		});
		GridData flatreferencetableRequiredPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		flatreferencetableRequiredProperty.setLayoutData(flatreferencetableRequiredPropertyData);
		flatreferencetableRequiredProperty.setID(EefnrViewsRepository.FlatReferenceTableSample.Properties.flatreferencetableRequiredProperty);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EefnrViewsRepository.FlatReferenceTableSample.Properties.flatreferencetableRequiredProperty, EefnrViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}


	/**
	 * @param parent
	 * 
	 */
	protected Composite createFlatreferencetableOptionalPropertyFlatReferencesTable(Composite parent) {
		SWTUtils.createPartLabel(parent, EefnrMessages.FlatReferenceTableSamplePropertiesEditionPart_FlatreferencetableOptionalPropertyLabel, propertiesEditionComponent.isRequired(EefnrViewsRepository.FlatReferenceTableSample.Properties.flatreferencetableOptionalProperty, EefnrViewsRepository.SWT_KIND));
		flatreferencetableOptionalProperty = new FlatReferencesTable(parent);
		flatreferencetableOptionalProperty.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		flatreferencetableOptionalProperty.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				if (event.getSelection() instanceof StructuredSelection) 
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FlatReferenceTableSamplePropertiesEditionPartImpl.this, EefnrViewsRepository.FlatReferenceTableSample.Properties.flatreferencetableOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, ((StructuredSelection)event.getSelection()).toList()));
			}

		});
		GridData flatreferencetableOptionalPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		flatreferencetableOptionalProperty.setLayoutData(flatreferencetableOptionalPropertyData);
		flatreferencetableOptionalProperty.setID(EefnrViewsRepository.FlatReferenceTableSample.Properties.flatreferencetableOptionalProperty);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EefnrViewsRepository.FlatReferenceTableSample.Properties.flatreferencetableOptionalProperty, EefnrViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
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
	 * @see org.eclipse.emf.eef.eefnr.parts.FlatReferenceTableSamplePropertiesEditionPart#initFlatreferencetableRequiredProperty(ReferencesTableSettings)
	 */
	public void initFlatreferencetableRequiredProperty(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		flatreferencetableRequiredProperty.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.FlatReferenceTableSamplePropertiesEditionPart#updateFlatreferencetableRequiredProperty()
	 * 
	 */
	public void updateFlatreferencetableRequiredProperty() {
	flatreferencetableRequiredProperty.refresh();
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
		return ((ReferencesTableSettings)flatreferencetableRequiredProperty.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.FlatReferenceTableSamplePropertiesEditionPart#initFlatreferencetableOptionalProperty(ReferencesTableSettings)
	 */
	public void initFlatreferencetableOptionalProperty(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		flatreferencetableOptionalProperty.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.FlatReferenceTableSamplePropertiesEditionPart#updateFlatreferencetableOptionalProperty()
	 * 
	 */
	public void updateFlatreferencetableOptionalProperty() {
	flatreferencetableOptionalProperty.refresh();
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
		return ((ReferencesTableSettings)flatreferencetableOptionalProperty.getInput()).contains(element);
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
