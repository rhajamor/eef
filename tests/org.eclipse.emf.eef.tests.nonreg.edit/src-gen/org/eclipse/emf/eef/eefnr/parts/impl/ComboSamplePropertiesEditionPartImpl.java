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
package org.eclipse.emf.eef.eefnr.parts.impl;

// Start of user code for imports
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import org.eclipse.emf.eef.eefnr.parts.ComboSamplePropertiesEditionPart;
import org.eclipse.emf.eef.eefnr.parts.EefnrViewsRepository;

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

import org.eclipse.emf.eef.runtime.ui.providers.EMFListContentProvider;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
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
public class ComboSamplePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ComboSamplePropertiesEditionPart {

	protected EMFComboViewer comboRequiredReferenceProperty;
	protected EMFComboViewer comboOptionalReferenceProperty;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ComboSamplePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence comboSampleStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = comboSampleStep.addStep(EefnrViewsRepository.ComboSample.Properties.class);
		propertiesStep.addStep(EefnrViewsRepository.ComboSample.Properties.comboRequiredReferenceProperty);
		propertiesStep.addStep(EefnrViewsRepository.ComboSample.Properties.comboOptionalReferenceProperty);
		
		
		composer = new PartComposer(comboSampleStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EefnrViewsRepository.ComboSample.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == EefnrViewsRepository.ComboSample.Properties.comboRequiredReferenceProperty) {
					return createComboRequiredReferencePropertyEMFComboViewer(parent);
				}
				if (key == EefnrViewsRepository.ComboSample.Properties.comboOptionalReferenceProperty) {
					return createComboOptionalReferencePropertyEMFComboViewer(parent);
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
		propertiesGroup.setText(EefnrMessages.ComboSamplePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createComboRequiredReferencePropertyEMFComboViewer(Composite parent) {
		createDescription(parent, EefnrViewsRepository.ComboSample.Properties.comboRequiredReferenceProperty, EefnrMessages.ComboSamplePropertiesEditionPart_ComboRequiredReferencePropertyLabel);
		comboRequiredReferenceProperty = new EMFComboViewer(parent);
		GridData comboRequiredReferencePropertyData = new GridData(GridData.FILL_HORIZONTAL);
		comboRequiredReferenceProperty.getCombo().setLayoutData(comboRequiredReferencePropertyData);
		comboRequiredReferenceProperty.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		comboRequiredReferenceProperty.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ComboSamplePropertiesEditionPartImpl.this, EefnrViewsRepository.ComboSample.Properties.comboRequiredReferenceProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getComboRequiredReferenceProperty()));
			}

		});
		comboRequiredReferenceProperty.setContentProvider(new EMFListContentProvider());
		EditingUtils.setID(comboRequiredReferenceProperty.getCombo(), EefnrViewsRepository.ComboSample.Properties.comboRequiredReferenceProperty);
		EditingUtils.setEEFtype(comboRequiredReferenceProperty.getCombo(), "eef::Combo"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EefnrViewsRepository.ComboSample.Properties.comboRequiredReferenceProperty, EefnrViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createComboOptionalReferencePropertyEMFComboViewer(Composite parent) {
		createDescription(parent, EefnrViewsRepository.ComboSample.Properties.comboOptionalReferenceProperty, EefnrMessages.ComboSamplePropertiesEditionPart_ComboOptionalReferencePropertyLabel);
		comboOptionalReferenceProperty = new EMFComboViewer(parent);
		GridData comboOptionalReferencePropertyData = new GridData(GridData.FILL_HORIZONTAL);
		comboOptionalReferenceProperty.getCombo().setLayoutData(comboOptionalReferencePropertyData);
		comboOptionalReferenceProperty.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		comboOptionalReferenceProperty.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ComboSamplePropertiesEditionPartImpl.this, EefnrViewsRepository.ComboSample.Properties.comboOptionalReferenceProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getComboOptionalReferenceProperty()));
			}

		});
		comboOptionalReferenceProperty.setContentProvider(new EMFListContentProvider());
		EditingUtils.setID(comboOptionalReferenceProperty.getCombo(), EefnrViewsRepository.ComboSample.Properties.comboOptionalReferenceProperty);
		EditingUtils.setEEFtype(comboOptionalReferenceProperty.getCombo(), "eef::Combo"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EefnrViewsRepository.ComboSample.Properties.comboOptionalReferenceProperty, EefnrViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see org.eclipse.emf.eef.eefnr.parts.ComboSamplePropertiesEditionPart#getComboRequiredReferenceProperty()
	 * 
	 */
	public Object getComboRequiredReferenceProperty() {
		if (comboRequiredReferenceProperty.getSelection() instanceof StructuredSelection) {
			return ((StructuredSelection) comboRequiredReferenceProperty.getSelection()).getFirstElement();
		}
		return "";
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.ComboSamplePropertiesEditionPart#initComboRequiredReferenceProperty(Object input, Object currentValue)
	 */
	public void initComboRequiredReferenceProperty(Object input, Object currentValue) {
		comboRequiredReferenceProperty.setInput(input);
		if (currentValue != null) {
			comboRequiredReferenceProperty.setSelection(new StructuredSelection(currentValue));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.ComboSamplePropertiesEditionPart#setComboRequiredReferenceProperty(Object newValue)
	 * 
	 */
	public void setComboRequiredReferenceProperty(Object newValue) {
		if (newValue != null) {
			comboRequiredReferenceProperty.modelUpdating(new StructuredSelection(newValue));
		} else {
			comboRequiredReferenceProperty.modelUpdating(new StructuredSelection("")); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.ComboSamplePropertiesEditionPart#addFilterComboRequiredReferenceProperty(ViewerFilter filter)
	 * 
	 */
	public void addFilterToComboRequiredReferenceProperty(ViewerFilter filter) {
		comboRequiredReferenceProperty.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.ComboSamplePropertiesEditionPart#getComboOptionalReferenceProperty()
	 * 
	 */
	public Object getComboOptionalReferenceProperty() {
		if (comboOptionalReferenceProperty.getSelection() instanceof StructuredSelection) {
			return ((StructuredSelection) comboOptionalReferenceProperty.getSelection()).getFirstElement();
		}
		return "";
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.ComboSamplePropertiesEditionPart#initComboOptionalReferenceProperty(Object input, Object currentValue)
	 */
	public void initComboOptionalReferenceProperty(Object input, Object currentValue) {
		comboOptionalReferenceProperty.setInput(input);
		if (currentValue != null) {
			comboOptionalReferenceProperty.setSelection(new StructuredSelection(currentValue));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.ComboSamplePropertiesEditionPart#setComboOptionalReferenceProperty(Object newValue)
	 * 
	 */
	public void setComboOptionalReferenceProperty(Object newValue) {
		if (newValue != null) {
			comboOptionalReferenceProperty.modelUpdating(new StructuredSelection(newValue));
		} else {
			comboOptionalReferenceProperty.modelUpdating(new StructuredSelection("")); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.ComboSamplePropertiesEditionPart#addFilterComboOptionalReferenceProperty(ViewerFilter filter)
	 * 
	 */
	public void addFilterToComboOptionalReferenceProperty(ViewerFilter filter) {
		comboOptionalReferenceProperty.addFilter(filter);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EefnrMessages.ComboSample_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
