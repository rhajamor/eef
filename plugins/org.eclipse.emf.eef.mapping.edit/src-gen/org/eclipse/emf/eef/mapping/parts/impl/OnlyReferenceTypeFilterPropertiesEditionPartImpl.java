/**
 *  Copyright (c) 2008 - 2011 Obeo.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *      Obeo - initial API and implementation
 *
 */
package org.eclipse.emf.eef.mapping.parts.impl;

// Start of user code for imports

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.mapping.parts.FilterPropertiesPropertiesEditionPart;
import org.eclipse.emf.eef.mapping.parts.MappingViewsRepository;
import org.eclipse.emf.eef.mapping.parts.OnlyReferenceTypeFilterPropertiesEditionPart;
import org.eclipse.emf.eef.mapping.providers.MappingMessages;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.services.PropertiesEditionPartProviderService;
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
public class OnlyReferenceTypeFilterPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, OnlyReferenceTypeFilterPropertiesEditionPart {

	protected EObjectFlatComboViewer referencedFeature;
	private FilterPropertiesPropertiesEditionPart filterPropertiesPropertiesEditionPart;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public OnlyReferenceTypeFilterPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence onlyReferenceTypeFilterStep = new CompositionSequence();
		onlyReferenceTypeFilterStep
			.addStep(MappingViewsRepository.OnlyReferenceTypeFilter.ReferencedFeature.class)
			.addStep(MappingViewsRepository.OnlyReferenceTypeFilter.ReferencedFeature.referencedFeature_);
		
		onlyReferenceTypeFilterStep.addStep(MappingViewsRepository.OnlyReferenceTypeFilter.filterProperties);
		
		composer = new PartComposer(onlyReferenceTypeFilterStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == MappingViewsRepository.OnlyReferenceTypeFilter.ReferencedFeature.class) {
					return createReferencedFeatureGroup(parent);
				}
				if (key == MappingViewsRepository.OnlyReferenceTypeFilter.ReferencedFeature.referencedFeature_) {
					return createReferencedFeatureFlatComboViewer(parent);
				}
				if (key == MappingViewsRepository.OnlyReferenceTypeFilter.filterProperties) {
					return createFilterProperties(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createReferencedFeatureGroup(Composite parent) {
		Group referencedFeatureGroup = new Group(parent, SWT.NONE);
		referencedFeatureGroup.setText(MappingMessages.OnlyReferenceTypeFilterPropertiesEditionPart_ReferencedFeatureGroupLabel);
		GridData referencedFeatureGroupData = new GridData(GridData.FILL_HORIZONTAL);
		referencedFeatureGroupData.horizontalSpan = 3;
		referencedFeatureGroup.setLayoutData(referencedFeatureGroupData);
		GridLayout referencedFeatureGroupLayout = new GridLayout();
		referencedFeatureGroupLayout.numColumns = 3;
		referencedFeatureGroup.setLayout(referencedFeatureGroupLayout);
		return referencedFeatureGroup;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createReferencedFeatureFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, MappingMessages.OnlyReferenceTypeFilterPropertiesEditionPart_ReferencedFeatureLabel, propertiesEditionComponent.isRequired(MappingViewsRepository.OnlyReferenceTypeFilter.ReferencedFeature.referencedFeature_, MappingViewsRepository.SWT_KIND));
		referencedFeature = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(MappingViewsRepository.OnlyReferenceTypeFilter.ReferencedFeature.referencedFeature_, MappingViewsRepository.SWT_KIND));
		referencedFeature.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		referencedFeature.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OnlyReferenceTypeFilterPropertiesEditionPartImpl.this, MappingViewsRepository.OnlyReferenceTypeFilter.ReferencedFeature.referencedFeature_, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getReferencedFeature()));
			}

		});
		GridData referencedFeatureData = new GridData(GridData.FILL_HORIZONTAL);
		referencedFeature.setLayoutData(referencedFeatureData);
		referencedFeature.setID(MappingViewsRepository.OnlyReferenceTypeFilter.ReferencedFeature.referencedFeature_);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(MappingViewsRepository.OnlyReferenceTypeFilter.ReferencedFeature.referencedFeature_, MappingViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	protected Composite createFilterProperties(Composite container) {
		IPropertiesEditionPartProvider provider = PropertiesEditionPartProviderService.getInstance().getProvider(MappingViewsRepository.class);
		filterPropertiesPropertiesEditionPart = (FilterPropertiesPropertiesEditionPart)provider.getPropertiesEditionPart(MappingViewsRepository.FilterProperties.class, MappingViewsRepository.SWT_KIND, propertiesEditionComponent);
		((ISWTPropertiesEditionPart)filterPropertiesPropertiesEditionPart).createControls(container);
		return container;
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
	 * @see org.eclipse.emf.eef.filters.parts.OnlyReferenceTypeFilterPropertiesEditionPart#getReferencedFeature()
	 * 
	 */
	public EObject getReferencedFeature() {
		if (referencedFeature.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) referencedFeature.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.OnlyReferenceTypeFilterPropertiesEditionPart#initReferencedFeature(EObjectFlatComboSettings)
	 */
	public void initReferencedFeature(EObjectFlatComboSettings settings) {
		referencedFeature.setInput(settings);
		if (current != null) {
			referencedFeature.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.OnlyReferenceTypeFilterPropertiesEditionPart#setReferencedFeature(EObject newValue)
	 * 
	 */
	public void setReferencedFeature(EObject newValue) {
		if (newValue != null) {
			referencedFeature.setSelection(new StructuredSelection(newValue));
		} else {
			referencedFeature.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.OnlyReferenceTypeFilterPropertiesEditionPart#setReferencedFeatureButtonMode(ButtonsModeEnum newValue)
	 */
	public void setReferencedFeatureButtonMode(ButtonsModeEnum newValue) {
		referencedFeature.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.OnlyReferenceTypeFilterPropertiesEditionPart#addFilterReferencedFeature(ViewerFilter filter)
	 * 
	 */
	public void addFilterToReferencedFeature(ViewerFilter filter) {
		referencedFeature.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.OnlyReferenceTypeFilterPropertiesEditionPart#addBusinessFilterReferencedFeature(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToReferencedFeature(ViewerFilter filter) {
		referencedFeature.addBusinessRuleFilter(filter);
	}


/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.OnlyReferenceTypeFilterPropertiesEditionPart#getFilterPropertiesReferencedView()
	 * 
	 */
		public IPropertiesEditionPart getFilterPropertiesReferencedView() {
			return (IPropertiesEditionPart) filterPropertiesPropertiesEditionPart;
		}
	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.OnlyReferenceTypeFilterPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return filterPropertiesPropertiesEditionPart.getName();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.OnlyReferenceTypeFilterPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		filterPropertiesPropertiesEditionPart.setName(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.OnlyReferenceTypeFilterPropertiesEditionPart#getMandatory()
	 * 
	 */
	public Boolean getMandatory() {
		return filterPropertiesPropertiesEditionPart.getMandatory();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.OnlyReferenceTypeFilterPropertiesEditionPart#setMandatory(Boolean newValue)
	 * 
	 */
	public void setMandatory(Boolean newValue) {
		filterPropertiesPropertiesEditionPart.setMandatory(newValue);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return MappingMessages.OnlyReferenceTypeFilter_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
