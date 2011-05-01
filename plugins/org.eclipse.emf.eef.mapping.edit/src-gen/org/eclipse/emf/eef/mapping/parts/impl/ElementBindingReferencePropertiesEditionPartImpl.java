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
package org.eclipse.emf.eef.mapping.parts.impl;

// Start of user code for imports

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.mapping.parts.ElementBindingReferencePropertiesEditionPart;
import org.eclipse.emf.eef.mapping.parts.MappingViewsRepository;
import org.eclipse.emf.eef.mapping.providers.MappingMessages;
import org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.notify.PropertiesEditingEvent;
import org.eclipse.emf.eef.runtime.notify.impl.PropertiesEditingEventImpl;
import org.eclipse.emf.eef.runtime.parts.SWTPropertiesEditingPart;
import org.eclipse.emf.eef.runtime.parts.impl.CompositePropertiesEditingPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
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
public class ElementBindingReferencePropertiesEditionPartImpl extends CompositePropertiesEditingPart implements SWTPropertiesEditingPart, ElementBindingReferencePropertiesEditionPart {

	protected EObjectFlatComboViewer binding;



	/**
	 * Default constructor
	 * @param editionComponent the {@link PropertiesEditingComponent} that manage this part
	 * 
	 */
	public ElementBindingReferencePropertiesEditionPartImpl(PropertiesEditingComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.parts.SWTPropertiesEditingPart#
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
	 * @see org.eclipse.emf.eef.runtime.parts.SWTPropertiesEditingPart#
	 * 			createControls(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(Composite view) { 
		CompositionSequence elementBindingReferenceStep = new CompositionSequence();
		elementBindingReferenceStep
			.addStep(MappingViewsRepository.ElementBindingReference.Reference.class)
			.addStep(MappingViewsRepository.ElementBindingReference.Reference.binding);
		
		
		composer = new PartComposer(elementBindingReferenceStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == MappingViewsRepository.ElementBindingReference.Reference.class) {
					return createReferenceGroup(parent);
				}
				if (key == MappingViewsRepository.ElementBindingReference.Reference.binding) {
					return createBindingFlatComboViewer(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createReferenceGroup(Composite parent) {
		Group referenceGroup = new Group(parent, SWT.NONE);
		referenceGroup.setText(MappingMessages.ElementBindingReferencePropertiesEditionPart_ReferenceGroupLabel);
		GridData referenceGroupData = new GridData(GridData.FILL_HORIZONTAL);
		referenceGroupData.horizontalSpan = 3;
		referenceGroup.setLayoutData(referenceGroupData);
		GridLayout referenceGroupLayout = new GridLayout();
		referenceGroupLayout.numColumns = 3;
		referenceGroup.setLayout(referenceGroupLayout);
		return referenceGroup;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createBindingFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, MappingMessages.ElementBindingReferencePropertiesEditionPart_BindingLabel, propertiesEditingComponent.isRequired(MappingViewsRepository.ElementBindingReference.Reference.binding, MappingViewsRepository.SWT_KIND));
		binding = new EObjectFlatComboViewer(parent, !propertiesEditingComponent.isRequired(MappingViewsRepository.ElementBindingReference.Reference.binding, MappingViewsRepository.SWT_KIND));
		binding.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		binding.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(ElementBindingReferencePropertiesEditionPartImpl.this, MappingViewsRepository.ElementBindingReference.Reference.binding, PropertiesEditingEventImpl.CHANGE, PropertiesEditingEventImpl.SET, null, getBinding()));
			}

		});
		GridData bindingData = new GridData(GridData.FILL_HORIZONTAL);
		binding.setLayoutData(bindingData);
		binding.setID(MappingViewsRepository.ElementBindingReference.Reference.binding);
		SWTUtils.createHelpButton(parent, propertiesEditingComponent.getHelpContent(MappingViewsRepository.ElementBindingReference.Reference.binding, MappingViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.notify.PropertiesEditingListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.notify.PropertiesEditingEvent)
	 * 
	 */
	public void firePropertiesChanged(PropertiesEditingEvent event) {
		// Start of user code for tab synchronization

// End of user code
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.mapping.parts.ElementBindingReferencePropertiesEditionPart#getBinding()
	 * 
	 */
	public EObject getBinding() {
		if (binding.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) binding.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.mapping.parts.ElementBindingReferencePropertiesEditionPart#initBinding(EObjectFlatComboSettings)
	 */
	public void initBinding(EObjectFlatComboSettings settings) {
		binding.setInput(settings);
		if (current != null) {
			binding.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.mapping.parts.ElementBindingReferencePropertiesEditionPart#setBinding(EObject newValue)
	 * 
	 */
	public void setBinding(EObject newValue) {
		if (newValue != null) {
			binding.setSelection(new StructuredSelection(newValue));
		} else {
			binding.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.mapping.parts.ElementBindingReferencePropertiesEditionPart#setBindingButtonMode(ButtonsModeEnum newValue)
	 */
	public void setBindingButtonMode(ButtonsModeEnum newValue) {
		binding.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.mapping.parts.ElementBindingReferencePropertiesEditionPart#addFilterBinding(ViewerFilter filter)
	 * 
	 */
	public void addFilterToBinding(ViewerFilter filter) {
		binding.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.mapping.parts.ElementBindingReferencePropertiesEditionPart#addBusinessFilterBinding(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToBinding(ViewerFilter filter) {
		binding.addBusinessRuleFilter(filter);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.parts.PropertiesEditingPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return MappingMessages.ElementBindingReference_Part_Title;
	}

	// Start of user code additional methods
 	
	// End of user code


}
