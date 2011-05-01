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
package org.eclipse.emf.eef.EEFGen.parts.impl;

// Start of user code for imports

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.EEFGen.parts.EEFGenViewsRepository;
import org.eclipse.emf.eef.EEFGen.parts.GenEditionContextPropertiesEditionPart;
import org.eclipse.emf.eef.EEFGen.providers.EEFGenMessages;
import org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.notify.PropertiesEditingEvent;
import org.eclipse.emf.eef.runtime.notify.impl.PropertiesEditingEventImpl;
import org.eclipse.emf.eef.runtime.parts.SWTPropertiesEditingPart;
import org.eclipse.emf.eef.runtime.parts.impl.CompositePropertiesEditingPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
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
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class GenEditionContextPropertiesEditionPartImpl extends CompositePropertiesEditingPart implements SWTPropertiesEditingPart, GenEditionContextPropertiesEditionPart {

	protected EObjectFlatComboViewer propertiesEditionContext;
	protected Text basePackage;
	protected Text descriptorsContributorID;
	protected Button genericPropertiesViewsDescriptors;
	protected Button gMFSpecificPropertiesViews;
	protected Button jUnitTestCases;
	protected Text leafComponentsSuperClass;
	protected Text propertiesEditingProvidersSuperClass;



	/**
	 * Default constructor
	 * @param editionComponent the {@link PropertiesEditingComponent} that manage this part
	 * 
	 */
	public GenEditionContextPropertiesEditionPartImpl(PropertiesEditingComponent editionComponent) {
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
		CompositionSequence genEditionContextStep = new CompositionSequence();
		genEditionContextStep
			.addStep(EEFGenViewsRepository.GenEditionContext.Reference.class)
			.addStep(EEFGenViewsRepository.GenEditionContext.Reference.propertiesEditionContext);
		
		CompositionStep parametersStep = genEditionContextStep.addStep(EEFGenViewsRepository.GenEditionContext.Parameters.class);
		parametersStep.addStep(EEFGenViewsRepository.GenEditionContext.Parameters.basePackage);
		parametersStep.addStep(EEFGenViewsRepository.GenEditionContext.Parameters.descriptorsContributorID);
		
		CompositionStep activationStep = genEditionContextStep.addStep(EEFGenViewsRepository.GenEditionContext.Activation.class);
		activationStep.addStep(EEFGenViewsRepository.GenEditionContext.Activation.genericPropertiesViewsDescriptors);
		activationStep.addStep(EEFGenViewsRepository.GenEditionContext.Activation.gMFSpecificPropertiesViews);
		activationStep.addStep(EEFGenViewsRepository.GenEditionContext.Activation.jUnitTestCases);
		
		CompositionStep implementationStep = genEditionContextStep.addStep(EEFGenViewsRepository.GenEditionContext.Implementation.class);
		implementationStep.addStep(EEFGenViewsRepository.GenEditionContext.Implementation.leafComponentsSuperClass);
		implementationStep.addStep(EEFGenViewsRepository.GenEditionContext.Implementation.propertiesEditingProvidersSuperClass);
		
		
		composer = new PartComposer(genEditionContextStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EEFGenViewsRepository.GenEditionContext.Reference.class) {
					return createReferenceGroup(parent);
				}
				if (key == EEFGenViewsRepository.GenEditionContext.Reference.propertiesEditionContext) {
					return createPropertiesEditionContextFlatComboViewer(parent);
				}
				if (key == EEFGenViewsRepository.GenEditionContext.Parameters.class) {
					return createParametersGroup(parent);
				}
				if (key == EEFGenViewsRepository.GenEditionContext.Parameters.basePackage) {
					return createBasePackageText(parent);
				}
				if (key == EEFGenViewsRepository.GenEditionContext.Parameters.descriptorsContributorID) {
					return createDescriptorsContributorIDText(parent);
				}
				if (key == EEFGenViewsRepository.GenEditionContext.Activation.class) {
					return createActivationGroup(parent);
				}
				if (key == EEFGenViewsRepository.GenEditionContext.Activation.genericPropertiesViewsDescriptors) {
					return createGenericPropertiesViewsDescriptorsCheckbox(parent);
				}
				if (key == EEFGenViewsRepository.GenEditionContext.Activation.gMFSpecificPropertiesViews) {
					return createGMFSpecificPropertiesViewsCheckbox(parent);
				}
				if (key == EEFGenViewsRepository.GenEditionContext.Activation.jUnitTestCases) {
					return createJUnitTestCasesCheckbox(parent);
				}
				if (key == EEFGenViewsRepository.GenEditionContext.Implementation.class) {
					return createImplementationGroup(parent);
				}
				if (key == EEFGenViewsRepository.GenEditionContext.Implementation.leafComponentsSuperClass) {
					return createLeafComponentsSuperClassText(parent);
				}
				if (key == EEFGenViewsRepository.GenEditionContext.Implementation.propertiesEditingProvidersSuperClass) {
					return createPropertiesEditingProvidersSuperClassText(parent);
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
		referenceGroup.setText(EEFGenMessages.GenEditionContextPropertiesEditionPart_ReferenceGroupLabel);
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
	protected Composite createPropertiesEditionContextFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, EEFGenMessages.GenEditionContextPropertiesEditionPart_PropertiesEditionContextLabel, propertiesEditingComponent.isRequired(EEFGenViewsRepository.GenEditionContext.Reference.propertiesEditionContext, EEFGenViewsRepository.SWT_KIND));
		propertiesEditionContext = new EObjectFlatComboViewer(parent, !propertiesEditingComponent.isRequired(EEFGenViewsRepository.GenEditionContext.Reference.propertiesEditionContext, EEFGenViewsRepository.SWT_KIND));
		propertiesEditionContext.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		propertiesEditionContext.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(GenEditionContextPropertiesEditionPartImpl.this, EEFGenViewsRepository.GenEditionContext.Reference.propertiesEditionContext, PropertiesEditingEventImpl.CHANGE, PropertiesEditingEventImpl.SET, null, getPropertiesEditionContext()));
			}

		});
		GridData propertiesEditionContextData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesEditionContext.setLayoutData(propertiesEditionContextData);
		propertiesEditionContext.setID(EEFGenViewsRepository.GenEditionContext.Reference.propertiesEditionContext);
		SWTUtils.createHelpButton(parent, propertiesEditingComponent.getHelpContent(EEFGenViewsRepository.GenEditionContext.Reference.propertiesEditionContext, EEFGenViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createParametersGroup(Composite parent) {
		Group parametersGroup = new Group(parent, SWT.NONE);
		parametersGroup.setText(EEFGenMessages.GenEditionContextPropertiesEditionPart_ParametersGroupLabel);
		GridData parametersGroupData = new GridData(GridData.FILL_HORIZONTAL);
		parametersGroupData.horizontalSpan = 3;
		parametersGroup.setLayoutData(parametersGroupData);
		GridLayout parametersGroupLayout = new GridLayout();
		parametersGroupLayout.numColumns = 3;
		parametersGroup.setLayout(parametersGroupLayout);
		return parametersGroup;
	}

	
	protected Composite createBasePackageText(Composite parent) {
		SWTUtils.createPartLabel(parent, EEFGenMessages.GenEditionContextPropertiesEditionPart_BasePackageLabel, propertiesEditingComponent.isRequired(EEFGenViewsRepository.GenEditionContext.Parameters.basePackage, EEFGenViewsRepository.SWT_KIND));
		basePackage = new Text(parent, SWT.BORDER);
		GridData basePackageData = new GridData(GridData.FILL_HORIZONTAL);
		basePackage.setLayoutData(basePackageData);
		basePackage.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditingComponent != null)
					propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(GenEditionContextPropertiesEditionPartImpl.this, EEFGenViewsRepository.GenEditionContext.Parameters.basePackage, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, basePackage.getText()));
			}

		});
		basePackage.addKeyListener(new KeyAdapter() {

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
					if (propertiesEditingComponent != null)
						propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(GenEditionContextPropertiesEditionPartImpl.this, EEFGenViewsRepository.GenEditionContext.Parameters.basePackage, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, basePackage.getText()));
				}
			}

		});
		EditingUtils.setID(basePackage, EEFGenViewsRepository.GenEditionContext.Parameters.basePackage);
		EditingUtils.setEEFtype(basePackage, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditingComponent.getHelpContent(EEFGenViewsRepository.GenEditionContext.Parameters.basePackage, EEFGenViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDescriptorsContributorIDText(Composite parent) {
		SWTUtils.createPartLabel(parent, EEFGenMessages.GenEditionContextPropertiesEditionPart_DescriptorsContributorIDLabel, propertiesEditingComponent.isRequired(EEFGenViewsRepository.GenEditionContext.Parameters.descriptorsContributorID, EEFGenViewsRepository.SWT_KIND));
		descriptorsContributorID = new Text(parent, SWT.BORDER);
		GridData descriptorsContributorIDData = new GridData(GridData.FILL_HORIZONTAL);
		descriptorsContributorID.setLayoutData(descriptorsContributorIDData);
		descriptorsContributorID.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditingComponent != null)
					propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(GenEditionContextPropertiesEditionPartImpl.this, EEFGenViewsRepository.GenEditionContext.Parameters.descriptorsContributorID, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, descriptorsContributorID.getText()));
			}

		});
		descriptorsContributorID.addKeyListener(new KeyAdapter() {

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
					if (propertiesEditingComponent != null)
						propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(GenEditionContextPropertiesEditionPartImpl.this, EEFGenViewsRepository.GenEditionContext.Parameters.descriptorsContributorID, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, descriptorsContributorID.getText()));
				}
			}

		});
		EditingUtils.setID(descriptorsContributorID, EEFGenViewsRepository.GenEditionContext.Parameters.descriptorsContributorID);
		EditingUtils.setEEFtype(descriptorsContributorID, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditingComponent.getHelpContent(EEFGenViewsRepository.GenEditionContext.Parameters.descriptorsContributorID, EEFGenViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createActivationGroup(Composite parent) {
		Group activationGroup = new Group(parent, SWT.NONE);
		activationGroup.setText(EEFGenMessages.GenEditionContextPropertiesEditionPart_ActivationGroupLabel);
		GridData activationGroupData = new GridData(GridData.FILL_HORIZONTAL);
		activationGroupData.horizontalSpan = 3;
		activationGroup.setLayoutData(activationGroupData);
		GridLayout activationGroupLayout = new GridLayout();
		activationGroupLayout.numColumns = 3;
		activationGroup.setLayout(activationGroupLayout);
		return activationGroup;
	}

	
	protected Composite createGenericPropertiesViewsDescriptorsCheckbox(Composite parent) {
		genericPropertiesViewsDescriptors = new Button(parent, SWT.CHECK);
		genericPropertiesViewsDescriptors.setText(EEFGenMessages.GenEditionContextPropertiesEditionPart_GenericPropertiesViewsDescriptorsLabel);
		genericPropertiesViewsDescriptors.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditingComponent != null)
					propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(GenEditionContextPropertiesEditionPartImpl.this, EEFGenViewsRepository.GenEditionContext.Activation.genericPropertiesViewsDescriptors, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, new Boolean(genericPropertiesViewsDescriptors.getSelection())));
			}

		});
		GridData genericPropertiesViewsDescriptorsData = new GridData(GridData.FILL_HORIZONTAL);
		genericPropertiesViewsDescriptorsData.horizontalSpan = 2;
		genericPropertiesViewsDescriptors.setLayoutData(genericPropertiesViewsDescriptorsData);
		EditingUtils.setID(genericPropertiesViewsDescriptors, EEFGenViewsRepository.GenEditionContext.Activation.genericPropertiesViewsDescriptors);
		EditingUtils.setEEFtype(genericPropertiesViewsDescriptors, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditingComponent.getHelpContent(EEFGenViewsRepository.GenEditionContext.Activation.genericPropertiesViewsDescriptors, EEFGenViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createGMFSpecificPropertiesViewsCheckbox(Composite parent) {
		gMFSpecificPropertiesViews = new Button(parent, SWT.CHECK);
		gMFSpecificPropertiesViews.setText(EEFGenMessages.GenEditionContextPropertiesEditionPart_GMFSpecificPropertiesViewsLabel);
		gMFSpecificPropertiesViews.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditingComponent != null)
					propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(GenEditionContextPropertiesEditionPartImpl.this, EEFGenViewsRepository.GenEditionContext.Activation.gMFSpecificPropertiesViews, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, new Boolean(gMFSpecificPropertiesViews.getSelection())));
			}

		});
		GridData gMFSpecificPropertiesViewsData = new GridData(GridData.FILL_HORIZONTAL);
		gMFSpecificPropertiesViewsData.horizontalSpan = 2;
		gMFSpecificPropertiesViews.setLayoutData(gMFSpecificPropertiesViewsData);
		EditingUtils.setID(gMFSpecificPropertiesViews, EEFGenViewsRepository.GenEditionContext.Activation.gMFSpecificPropertiesViews);
		EditingUtils.setEEFtype(gMFSpecificPropertiesViews, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditingComponent.getHelpContent(EEFGenViewsRepository.GenEditionContext.Activation.gMFSpecificPropertiesViews, EEFGenViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createJUnitTestCasesCheckbox(Composite parent) {
		jUnitTestCases = new Button(parent, SWT.CHECK);
		jUnitTestCases.setText(EEFGenMessages.GenEditionContextPropertiesEditionPart_JUnitTestCasesLabel);
		jUnitTestCases.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditingComponent != null)
					propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(GenEditionContextPropertiesEditionPartImpl.this, EEFGenViewsRepository.GenEditionContext.Activation.jUnitTestCases, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, new Boolean(jUnitTestCases.getSelection())));
			}

		});
		GridData jUnitTestCasesData = new GridData(GridData.FILL_HORIZONTAL);
		jUnitTestCasesData.horizontalSpan = 2;
		jUnitTestCases.setLayoutData(jUnitTestCasesData);
		EditingUtils.setID(jUnitTestCases, EEFGenViewsRepository.GenEditionContext.Activation.jUnitTestCases);
		EditingUtils.setEEFtype(jUnitTestCases, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditingComponent.getHelpContent(EEFGenViewsRepository.GenEditionContext.Activation.jUnitTestCases, EEFGenViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createImplementationGroup(Composite parent) {
		Group implementationGroup = new Group(parent, SWT.NONE);
		implementationGroup.setText(EEFGenMessages.GenEditionContextPropertiesEditionPart_ImplementationGroupLabel);
		GridData implementationGroupData = new GridData(GridData.FILL_HORIZONTAL);
		implementationGroupData.horizontalSpan = 3;
		implementationGroup.setLayoutData(implementationGroupData);
		GridLayout implementationGroupLayout = new GridLayout();
		implementationGroupLayout.numColumns = 3;
		implementationGroup.setLayout(implementationGroupLayout);
		return implementationGroup;
	}

	
	protected Composite createLeafComponentsSuperClassText(Composite parent) {
		SWTUtils.createPartLabel(parent, EEFGenMessages.GenEditionContextPropertiesEditionPart_LeafComponentsSuperClassLabel, propertiesEditingComponent.isRequired(EEFGenViewsRepository.GenEditionContext.Implementation.leafComponentsSuperClass, EEFGenViewsRepository.SWT_KIND));
		leafComponentsSuperClass = new Text(parent, SWT.BORDER);
		GridData leafComponentsSuperClassData = new GridData(GridData.FILL_HORIZONTAL);
		leafComponentsSuperClass.setLayoutData(leafComponentsSuperClassData);
		leafComponentsSuperClass.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditingComponent != null)
					propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(GenEditionContextPropertiesEditionPartImpl.this, EEFGenViewsRepository.GenEditionContext.Implementation.leafComponentsSuperClass, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, leafComponentsSuperClass.getText()));
			}

		});
		leafComponentsSuperClass.addKeyListener(new KeyAdapter() {

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
					if (propertiesEditingComponent != null)
						propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(GenEditionContextPropertiesEditionPartImpl.this, EEFGenViewsRepository.GenEditionContext.Implementation.leafComponentsSuperClass, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, leafComponentsSuperClass.getText()));
				}
			}

		});
		EditingUtils.setID(leafComponentsSuperClass, EEFGenViewsRepository.GenEditionContext.Implementation.leafComponentsSuperClass);
		EditingUtils.setEEFtype(leafComponentsSuperClass, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditingComponent.getHelpContent(EEFGenViewsRepository.GenEditionContext.Implementation.leafComponentsSuperClass, EEFGenViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createPropertiesEditingProvidersSuperClassText(Composite parent) {
		SWTUtils.createPartLabel(parent, EEFGenMessages.GenEditionContextPropertiesEditionPart_PropertiesEditingProvidersSuperClassLabel, propertiesEditingComponent.isRequired(EEFGenViewsRepository.GenEditionContext.Implementation.propertiesEditingProvidersSuperClass, EEFGenViewsRepository.SWT_KIND));
		propertiesEditingProvidersSuperClass = new Text(parent, SWT.BORDER);
		GridData propertiesEditingProvidersSuperClassData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesEditingProvidersSuperClass.setLayoutData(propertiesEditingProvidersSuperClassData);
		propertiesEditingProvidersSuperClass.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditingComponent != null)
					propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(GenEditionContextPropertiesEditionPartImpl.this, EEFGenViewsRepository.GenEditionContext.Implementation.propertiesEditingProvidersSuperClass, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, propertiesEditingProvidersSuperClass.getText()));
			}

		});
		propertiesEditingProvidersSuperClass.addKeyListener(new KeyAdapter() {

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
					if (propertiesEditingComponent != null)
						propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(GenEditionContextPropertiesEditionPartImpl.this, EEFGenViewsRepository.GenEditionContext.Implementation.propertiesEditingProvidersSuperClass, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, propertiesEditingProvidersSuperClass.getText()));
				}
			}

		});
		EditingUtils.setID(propertiesEditingProvidersSuperClass, EEFGenViewsRepository.GenEditionContext.Implementation.propertiesEditingProvidersSuperClass);
		EditingUtils.setEEFtype(propertiesEditingProvidersSuperClass, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditingComponent.getHelpContent(EEFGenViewsRepository.GenEditionContext.Implementation.propertiesEditingProvidersSuperClass, EEFGenViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see org.eclipse.emf.eef.EEFGen.parts.GenEditionContextPropertiesEditionPart#getPropertiesEditionContext()
	 * 
	 */
	public EObject getPropertiesEditionContext() {
		if (propertiesEditionContext.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) propertiesEditionContext.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.EEFGen.parts.GenEditionContextPropertiesEditionPart#initPropertiesEditionContext(EObjectFlatComboSettings)
	 */
	public void initPropertiesEditionContext(EObjectFlatComboSettings settings) {
		propertiesEditionContext.setInput(settings);
		if (current != null) {
			propertiesEditionContext.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.EEFGen.parts.GenEditionContextPropertiesEditionPart#setPropertiesEditionContext(EObject newValue)
	 * 
	 */
	public void setPropertiesEditionContext(EObject newValue) {
		if (newValue != null) {
			propertiesEditionContext.setSelection(new StructuredSelection(newValue));
		} else {
			propertiesEditionContext.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.EEFGen.parts.GenEditionContextPropertiesEditionPart#setPropertiesEditionContextButtonMode(ButtonsModeEnum newValue)
	 */
	public void setPropertiesEditionContextButtonMode(ButtonsModeEnum newValue) {
		propertiesEditionContext.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.EEFGen.parts.GenEditionContextPropertiesEditionPart#addFilterPropertiesEditionContext(ViewerFilter filter)
	 * 
	 */
	public void addFilterToPropertiesEditionContext(ViewerFilter filter) {
		propertiesEditionContext.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.EEFGen.parts.GenEditionContextPropertiesEditionPart#addBusinessFilterPropertiesEditionContext(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToPropertiesEditionContext(ViewerFilter filter) {
		propertiesEditionContext.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.EEFGen.parts.GenEditionContextPropertiesEditionPart#getBasePackage()
	 * 
	 */
	public String getBasePackage() {
		return basePackage.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.EEFGen.parts.GenEditionContextPropertiesEditionPart#setBasePackage(String newValue)
	 * 
	 */
	public void setBasePackage(String newValue) {
		if (newValue != null) {
			basePackage.setText(newValue);
		} else {
			basePackage.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.EEFGen.parts.GenEditionContextPropertiesEditionPart#getDescriptorsContributorID()
	 * 
	 */
	public String getDescriptorsContributorID() {
		return descriptorsContributorID.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.EEFGen.parts.GenEditionContextPropertiesEditionPart#setDescriptorsContributorID(String newValue)
	 * 
	 */
	public void setDescriptorsContributorID(String newValue) {
		if (newValue != null) {
			descriptorsContributorID.setText(newValue);
		} else {
			descriptorsContributorID.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.EEFGen.parts.GenEditionContextPropertiesEditionPart#getGenericPropertiesViewsDescriptors()
	 * 
	 */
	public Boolean getGenericPropertiesViewsDescriptors() {
		return Boolean.valueOf(genericPropertiesViewsDescriptors.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.EEFGen.parts.GenEditionContextPropertiesEditionPart#setGenericPropertiesViewsDescriptors(Boolean newValue)
	 * 
	 */
	public void setGenericPropertiesViewsDescriptors(Boolean newValue) {
		if (newValue != null) {
			genericPropertiesViewsDescriptors.setSelection(newValue.booleanValue());
		} else {
			genericPropertiesViewsDescriptors.setSelection(false);
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.EEFGen.parts.GenEditionContextPropertiesEditionPart#getGMFSpecificPropertiesViews()
	 * 
	 */
	public Boolean getGMFSpecificPropertiesViews() {
		return Boolean.valueOf(gMFSpecificPropertiesViews.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.EEFGen.parts.GenEditionContextPropertiesEditionPart#setGMFSpecificPropertiesViews(Boolean newValue)
	 * 
	 */
	public void setGMFSpecificPropertiesViews(Boolean newValue) {
		if (newValue != null) {
			gMFSpecificPropertiesViews.setSelection(newValue.booleanValue());
		} else {
			gMFSpecificPropertiesViews.setSelection(false);
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.EEFGen.parts.GenEditionContextPropertiesEditionPart#getJUnitTestCases()
	 * 
	 */
	public Boolean getJUnitTestCases() {
		return Boolean.valueOf(jUnitTestCases.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.EEFGen.parts.GenEditionContextPropertiesEditionPart#setJUnitTestCases(Boolean newValue)
	 * 
	 */
	public void setJUnitTestCases(Boolean newValue) {
		if (newValue != null) {
			jUnitTestCases.setSelection(newValue.booleanValue());
		} else {
			jUnitTestCases.setSelection(false);
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.EEFGen.parts.GenEditionContextPropertiesEditionPart#getLeafComponentsSuperClass()
	 * 
	 */
	public String getLeafComponentsSuperClass() {
		return leafComponentsSuperClass.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.EEFGen.parts.GenEditionContextPropertiesEditionPart#setLeafComponentsSuperClass(String newValue)
	 * 
	 */
	public void setLeafComponentsSuperClass(String newValue) {
		if (newValue != null) {
			leafComponentsSuperClass.setText(newValue);
		} else {
			leafComponentsSuperClass.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.EEFGen.parts.GenEditionContextPropertiesEditionPart#getPropertiesEditingProvidersSuperClass()
	 * 
	 */
	public String getPropertiesEditingProvidersSuperClass() {
		return propertiesEditingProvidersSuperClass.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.EEFGen.parts.GenEditionContextPropertiesEditionPart#setPropertiesEditingProvidersSuperClass(String newValue)
	 * 
	 */
	public void setPropertiesEditingProvidersSuperClass(String newValue) {
		if (newValue != null) {
			propertiesEditingProvidersSuperClass.setText(newValue);
		} else {
			propertiesEditingProvidersSuperClass.setText(""); //$NON-NLS-1$
		}
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.parts.PropertiesEditingPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EEFGenMessages.GenEditionContext_Part_Title;
	}

	// Start of user code additional methods
 	
	// End of user code


}
