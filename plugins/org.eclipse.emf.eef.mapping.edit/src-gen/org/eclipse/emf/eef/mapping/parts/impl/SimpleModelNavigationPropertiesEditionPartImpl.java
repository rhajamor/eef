/**
 *  Copyright (c) 2008 - 2010 Obeo.
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
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.mapping.navigation.NavigationPackage;
import org.eclipse.emf.eef.mapping.navigation.SimpleModelNavigation;
import org.eclipse.emf.eef.mapping.parts.MappingViewsRepository;
import org.eclipse.emf.eef.mapping.parts.SimpleModelNavigationPropertiesEditionPart;
import org.eclipse.emf.eef.mapping.providers.MappingMessages;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.utils.EEFUtils;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class SimpleModelNavigationPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, SimpleModelNavigationPropertiesEditionPart {

	protected Text index;
	protected EObjectFlatComboViewer feature;
	protected EObjectFlatComboViewer discriminatorType;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public SimpleModelNavigationPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence simpleModelNavigationStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = simpleModelNavigationStep.addStep(MappingViewsRepository.SimpleModelNavigation.Properties.class);
		propertiesStep.addStep(MappingViewsRepository.SimpleModelNavigation.Properties.index);
		propertiesStep.addStep(MappingViewsRepository.SimpleModelNavigation.Properties.feature);
		propertiesStep.addStep(MappingViewsRepository.SimpleModelNavigation.Properties.discriminatorType);
		
		
		composer = new PartComposer(simpleModelNavigationStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == MappingViewsRepository.SimpleModelNavigation.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == MappingViewsRepository.SimpleModelNavigation.Properties.index) {
					return createIndexText(parent);
				}
				if (key == MappingViewsRepository.SimpleModelNavigation.Properties.feature) {
					return createFeatureFlatComboViewer(parent);
				}
				if (key == MappingViewsRepository.SimpleModelNavigation.Properties.discriminatorType) {
					return createDiscriminatorTypeFlatComboViewer(parent);
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
		propertiesGroup.setText(MappingMessages.SimpleModelNavigationPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createIndexText(Composite parent) {
		SWTUtils.createPartLabel(parent, MappingMessages.SimpleModelNavigationPropertiesEditionPart_IndexLabel, propertiesEditionComponent.isRequired(MappingViewsRepository.SimpleModelNavigation.Properties.index, MappingViewsRepository.SWT_KIND));
		index = new Text(parent, SWT.BORDER);
		GridData indexData = new GridData(GridData.FILL_HORIZONTAL);
		index.setLayoutData(indexData);
		index.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SimpleModelNavigationPropertiesEditionPartImpl.this, MappingViewsRepository.SimpleModelNavigation.Properties.index, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, index.getText()));
			}

		});
		index.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SimpleModelNavigationPropertiesEditionPartImpl.this, MappingViewsRepository.SimpleModelNavigation.Properties.index, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, index.getText()));
				}
			}

		});
		EditingUtils.setID(index, MappingViewsRepository.SimpleModelNavigation.Properties.index);
		EditingUtils.setEEFtype(index, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(MappingViewsRepository.SimpleModelNavigation.Properties.index, MappingViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createFeatureFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, MappingMessages.SimpleModelNavigationPropertiesEditionPart_FeatureLabel, propertiesEditionComponent.isRequired(MappingViewsRepository.SimpleModelNavigation.Properties.feature, MappingViewsRepository.SWT_KIND));
		feature = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(MappingViewsRepository.SimpleModelNavigation.Properties.feature, MappingViewsRepository.SWT_KIND));
		feature.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		feature.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SimpleModelNavigationPropertiesEditionPartImpl.this, MappingViewsRepository.SimpleModelNavigation.Properties.feature, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getFeature()));
			}

		});
		GridData featureData = new GridData(GridData.FILL_HORIZONTAL);
		feature.setLayoutData(featureData);
		feature.setID(MappingViewsRepository.SimpleModelNavigation.Properties.feature);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(MappingViewsRepository.SimpleModelNavigation.Properties.feature, MappingViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createDiscriminatorTypeFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, MappingMessages.SimpleModelNavigationPropertiesEditionPart_DiscriminatorTypeLabel, propertiesEditionComponent.isRequired(MappingViewsRepository.SimpleModelNavigation.Properties.discriminatorType, MappingViewsRepository.SWT_KIND));
		discriminatorType = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(MappingViewsRepository.SimpleModelNavigation.Properties.discriminatorType, MappingViewsRepository.SWT_KIND));
		discriminatorType.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		discriminatorType.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SimpleModelNavigationPropertiesEditionPartImpl.this, MappingViewsRepository.SimpleModelNavigation.Properties.discriminatorType, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getDiscriminatorType()));
			}

		});
		GridData discriminatorTypeData = new GridData(GridData.FILL_HORIZONTAL);
		discriminatorType.setLayoutData(discriminatorTypeData);
		discriminatorType.setID(MappingViewsRepository.SimpleModelNavigation.Properties.discriminatorType);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(MappingViewsRepository.SimpleModelNavigation.Properties.discriminatorType, MappingViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see org.eclipse.emf.eef.navigation.parts.SimpleModelNavigationPropertiesEditionPart#getIndex()
	 * 
	 */
	public String getIndex() {
		return index.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SimpleModelNavigationPropertiesEditionPart#setIndex(String newValue)
	 * 
	 */
	public void setIndex(String newValue) {
		if (newValue != null) {
			index.setText(newValue);
		} else {
			index.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SimpleModelNavigationPropertiesEditionPart#getFeature()
	 * 
	 */
	public EObject getFeature() {
		if (feature.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) feature.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SimpleModelNavigationPropertiesEditionPart#initFeature(EObjectFlatComboSettings)
	 */
	public void initFeature(EObjectFlatComboSettings settings) {
		feature.setInput(settings);
		if (current != null) {
			feature.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SimpleModelNavigationPropertiesEditionPart#setFeature(EObject newValue)
	 * 
	 */
	public void setFeature(EObject newValue) {
		if (newValue != null) {
			feature.setSelection(new StructuredSelection(newValue));
		} else {
			feature.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SimpleModelNavigationPropertiesEditionPart#setFeatureButtonMode(ButtonsModeEnum newValue)
	 */
	public void setFeatureButtonMode(ButtonsModeEnum newValue) {
		feature.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SimpleModelNavigationPropertiesEditionPart#addFilterFeature(ViewerFilter filter)
	 * 
	 */
	public void addFilterToFeature(ViewerFilter filter) {
		feature.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SimpleModelNavigationPropertiesEditionPart#addBusinessFilterFeature(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToFeature(ViewerFilter filter) {
		feature.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SimpleModelNavigationPropertiesEditionPart#getDiscriminatorType()
	 * 
	 */
	public EObject getDiscriminatorType() {
		if (discriminatorType.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) discriminatorType.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SimpleModelNavigationPropertiesEditionPart#initDiscriminatorType(EObjectFlatComboSettings)
	 */
	public void initDiscriminatorType(EObjectFlatComboSettings settings) {
		discriminatorType.setInput(settings);
		if (current != null) {
			discriminatorType.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SimpleModelNavigationPropertiesEditionPart#setDiscriminatorType(EObject newValue)
	 * 
	 */
	public void setDiscriminatorType(EObject newValue) {
		if (newValue != null) {
			discriminatorType.setSelection(new StructuredSelection(newValue));
		} else {
			discriminatorType.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SimpleModelNavigationPropertiesEditionPart#setDiscriminatorTypeButtonMode(ButtonsModeEnum newValue)
	 */
	public void setDiscriminatorTypeButtonMode(ButtonsModeEnum newValue) {
		discriminatorType.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SimpleModelNavigationPropertiesEditionPart#addFilterDiscriminatorType(ViewerFilter filter)
	 * 
	 */
	public void addFilterToDiscriminatorType(ViewerFilter filter) {
		discriminatorType.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SimpleModelNavigationPropertiesEditionPart#addBusinessFilterDiscriminatorType(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDiscriminatorType(ViewerFilter filter) {
		discriminatorType.addBusinessRuleFilter(filter);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return MappingMessages.SimpleModelNavigation_Part_Title;
	}

	// Start of user code additional methods
 	public void setDiscriminatorInput(SimpleModelNavigation simpleModelNavigation, ResourceSet allResources){
		discriminatorType.setInput(EEFUtils.choiceOfValues(adapterFactory, simpleModelNavigation, NavigationPackage.eINSTANCE.getSimpleModelNavigation_DiscriminatorType(), allResources));
		if (simpleModelNavigation.getDiscriminatorType() != null){
			discriminatorType.setSelection(new StructuredSelection(simpleModelNavigation.getDiscriminatorType()));
		}
 	}
	// End of user code


}
