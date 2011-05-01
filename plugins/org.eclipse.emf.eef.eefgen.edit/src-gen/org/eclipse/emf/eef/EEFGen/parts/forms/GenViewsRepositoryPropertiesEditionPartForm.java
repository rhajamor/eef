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
package org.eclipse.emf.eef.EEFGen.parts.forms;

// Start of user code for imports

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.EEFGen.parts.EEFGenViewsRepository;
import org.eclipse.emf.eef.EEFGen.parts.GenViewsRepositoryPropertiesEditionPart;
import org.eclipse.emf.eef.EEFGen.providers.EEFGenMessages;
import org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.notify.PropertiesEditingEvent;
import org.eclipse.emf.eef.runtime.notify.impl.PropertiesEditingEventImpl;
import org.eclipse.emf.eef.runtime.parts.FormPropertiesEditingPart;
import org.eclipse.emf.eef.runtime.parts.impl.CompositePropertiesEditingPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.ArrayContentProvider;
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
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class GenViewsRepositoryPropertiesEditionPartForm extends CompositePropertiesEditingPart implements FormPropertiesEditingPart, GenViewsRepositoryPropertiesEditionPart {

	protected EObjectFlatComboViewer viewsRepository;
	protected Text basePackage;
	protected EMFComboViewer helpStrategy;
	protected Button sWTViews;
	protected Button formsViews;
	protected Text partsSuperClass;



	/**
	 * Default constructor
	 * @param editionComponent the {@link PropertiesEditingComponent} that manage this part
	 * 
	 */
	public GenViewsRepositoryPropertiesEditionPartForm(PropertiesEditingComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.parts.FormPropertiesEditingPart#
	 *  createFigure(org.eclipse.swt.widgets.Composite, org.eclipse.ui.forms.widgets.FormToolkit)
	 * 
	 */
	public Composite createFigure(final Composite parent, final FormToolkit widgetFactory) {
		ScrolledForm scrolledForm = widgetFactory.createScrolledForm(parent);
		Form form = scrolledForm.getForm();
		view = form.getBody();
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(widgetFactory, view);
		return scrolledForm;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.parts.FormPropertiesEditingPart#
	 *  createControls(org.eclipse.ui.forms.widgets.FormToolkit, org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(final FormToolkit widgetFactory, Composite view) {
		CompositionSequence genViewsRepositoryStep = new CompositionSequence();
		genViewsRepositoryStep
			.addStep(EEFGenViewsRepository.GenViewsRepository.Reference.class)
			.addStep(EEFGenViewsRepository.GenViewsRepository.Reference.viewsRepository);
		
		CompositionStep parametersStep = genViewsRepositoryStep.addStep(EEFGenViewsRepository.GenViewsRepository.Parameters.class);
		parametersStep.addStep(EEFGenViewsRepository.GenViewsRepository.Parameters.basePackage);
		parametersStep.addStep(EEFGenViewsRepository.GenViewsRepository.Parameters.helpStrategy);
		
		CompositionStep activationStep = genViewsRepositoryStep.addStep(EEFGenViewsRepository.GenViewsRepository.Activation.class);
		activationStep.addStep(EEFGenViewsRepository.GenViewsRepository.Activation.sWTViews);
		activationStep.addStep(EEFGenViewsRepository.GenViewsRepository.Activation.formsViews);
		
		genViewsRepositoryStep
			.addStep(EEFGenViewsRepository.GenViewsRepository.Implementation.class)
			.addStep(EEFGenViewsRepository.GenViewsRepository.Implementation.partsSuperClass);
		
		
		composer = new PartComposer(genViewsRepositoryStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EEFGenViewsRepository.GenViewsRepository.Reference.class) {
					return createReferenceGroup(widgetFactory, parent);
				}
				if (key == EEFGenViewsRepository.GenViewsRepository.Reference.viewsRepository) {
					return createViewsRepositoryFlatComboViewer(parent, widgetFactory);
				}
				if (key == EEFGenViewsRepository.GenViewsRepository.Parameters.class) {
					return createParametersGroup(widgetFactory, parent);
				}
				if (key == EEFGenViewsRepository.GenViewsRepository.Parameters.basePackage) {
					return 		createBasePackageText(widgetFactory, parent);
				}
				if (key == EEFGenViewsRepository.GenViewsRepository.Parameters.helpStrategy) {
					return createHelpStrategyEMFComboViewer(widgetFactory, parent);
				}
				if (key == EEFGenViewsRepository.GenViewsRepository.Activation.class) {
					return createActivationGroup(widgetFactory, parent);
				}
				if (key == EEFGenViewsRepository.GenViewsRepository.Activation.sWTViews) {
					return createSWTViewsCheckbox(widgetFactory, parent);
				}
				if (key == EEFGenViewsRepository.GenViewsRepository.Activation.formsViews) {
					return createFormsViewsCheckbox(widgetFactory, parent);
				}
				if (key == EEFGenViewsRepository.GenViewsRepository.Implementation.class) {
					return createImplementationGroup(widgetFactory, parent);
				}
				if (key == EEFGenViewsRepository.GenViewsRepository.Implementation.partsSuperClass) {
					return 		createPartsSuperClassText(widgetFactory, parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * 
	 */
	protected Composite createReferenceGroup(FormToolkit widgetFactory, final Composite parent) {
		Section referenceSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		referenceSection.setText(EEFGenMessages.GenViewsRepositoryPropertiesEditionPart_ReferenceGroupLabel);
		GridData referenceSectionData = new GridData(GridData.FILL_HORIZONTAL);
		referenceSectionData.horizontalSpan = 3;
		referenceSection.setLayoutData(referenceSectionData);
		Composite referenceGroup = widgetFactory.createComposite(referenceSection);
		GridLayout referenceGroupLayout = new GridLayout();
		referenceGroupLayout.numColumns = 3;
		referenceGroup.setLayout(referenceGroupLayout);
		referenceSection.setClient(referenceGroup);
		return referenceGroup;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createViewsRepositoryFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, EEFGenMessages.GenViewsRepositoryPropertiesEditionPart_ViewsRepositoryLabel, propertiesEditingComponent.isRequired(EEFGenViewsRepository.GenViewsRepository.Reference.viewsRepository, EEFGenViewsRepository.FORM_KIND));
		viewsRepository = new EObjectFlatComboViewer(parent, !propertiesEditingComponent.isRequired(EEFGenViewsRepository.GenViewsRepository.Reference.viewsRepository, EEFGenViewsRepository.FORM_KIND));
		viewsRepository.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData viewsRepositoryData = new GridData(GridData.FILL_HORIZONTAL);
		viewsRepository.setLayoutData(viewsRepositoryData);
		viewsRepository.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditingComponent != null)
					propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(GenViewsRepositoryPropertiesEditionPartForm.this, EEFGenViewsRepository.GenViewsRepository.Reference.viewsRepository, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, getViewsRepository()));
			}

		});
		viewsRepository.setID(EEFGenViewsRepository.GenViewsRepository.Reference.viewsRepository);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditingComponent.getHelpContent(EEFGenViewsRepository.GenViewsRepository.Reference.viewsRepository, EEFGenViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createParametersGroup(FormToolkit widgetFactory, final Composite parent) {
		Section parametersSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		parametersSection.setText(EEFGenMessages.GenViewsRepositoryPropertiesEditionPart_ParametersGroupLabel);
		GridData parametersSectionData = new GridData(GridData.FILL_HORIZONTAL);
		parametersSectionData.horizontalSpan = 3;
		parametersSection.setLayoutData(parametersSectionData);
		Composite parametersGroup = widgetFactory.createComposite(parametersSection);
		GridLayout parametersGroupLayout = new GridLayout();
		parametersGroupLayout.numColumns = 3;
		parametersGroup.setLayout(parametersGroupLayout);
		parametersSection.setClient(parametersGroup);
		return parametersGroup;
	}

	
	protected Composite createBasePackageText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, EEFGenMessages.GenViewsRepositoryPropertiesEditionPart_BasePackageLabel, propertiesEditingComponent.isRequired(EEFGenViewsRepository.GenViewsRepository.Parameters.basePackage, EEFGenViewsRepository.FORM_KIND));
		basePackage = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		basePackage.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData basePackageData = new GridData(GridData.FILL_HORIZONTAL);
		basePackage.setLayoutData(basePackageData);
		basePackage.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditingComponent != null)
					propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(GenViewsRepositoryPropertiesEditionPartForm.this, EEFGenViewsRepository.GenViewsRepository.Parameters.basePackage, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, basePackage.getText()));
			}
		});
		basePackage.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditingComponent != null)
						propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(GenViewsRepositoryPropertiesEditionPartForm.this, EEFGenViewsRepository.GenViewsRepository.Parameters.basePackage, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, basePackage.getText()));
				}
			}
		});
		EditingUtils.setID(basePackage, EEFGenViewsRepository.GenViewsRepository.Parameters.basePackage);
		EditingUtils.setEEFtype(basePackage, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditingComponent.getHelpContent(EEFGenViewsRepository.GenViewsRepository.Parameters.basePackage, EEFGenViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createHelpStrategyEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, EEFGenMessages.GenViewsRepositoryPropertiesEditionPart_HelpStrategyLabel, propertiesEditingComponent.isRequired(EEFGenViewsRepository.GenViewsRepository.Parameters.helpStrategy, EEFGenViewsRepository.FORM_KIND));
		helpStrategy = new EMFComboViewer(parent);
		helpStrategy.setContentProvider(new ArrayContentProvider());
		helpStrategy.setLabelProvider(new AdapterFactoryLabelProvider(new EcoreAdapterFactory()));
		GridData helpStrategyData = new GridData(GridData.FILL_HORIZONTAL);
		helpStrategy.getCombo().setLayoutData(helpStrategyData);
		helpStrategy.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditingComponent != null)
					propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(GenViewsRepositoryPropertiesEditionPartForm.this, EEFGenViewsRepository.GenViewsRepository.Parameters.helpStrategy, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, getHelpStrategy()));
			}

		});
		helpStrategy.setID(EEFGenViewsRepository.GenViewsRepository.Parameters.helpStrategy);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditingComponent.getHelpContent(EEFGenViewsRepository.GenViewsRepository.Parameters.helpStrategy, EEFGenViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createActivationGroup(FormToolkit widgetFactory, final Composite parent) {
		Section activationSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		activationSection.setText(EEFGenMessages.GenViewsRepositoryPropertiesEditionPart_ActivationGroupLabel);
		GridData activationSectionData = new GridData(GridData.FILL_HORIZONTAL);
		activationSectionData.horizontalSpan = 3;
		activationSection.setLayoutData(activationSectionData);
		Composite activationGroup = widgetFactory.createComposite(activationSection);
		GridLayout activationGroupLayout = new GridLayout();
		activationGroupLayout.numColumns = 3;
		activationGroup.setLayout(activationGroupLayout);
		activationSection.setClient(activationGroup);
		return activationGroup;
	}

	
	protected Composite createSWTViewsCheckbox(FormToolkit widgetFactory, Composite parent) {
		sWTViews = widgetFactory.createButton(parent, EEFGenMessages.GenViewsRepositoryPropertiesEditionPart_SWTViewsLabel, SWT.CHECK);
		sWTViews.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditingComponent != null)
					propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(GenViewsRepositoryPropertiesEditionPartForm.this, EEFGenViewsRepository.GenViewsRepository.Activation.sWTViews, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, new Boolean(sWTViews.getSelection())));
			}

		});
		GridData sWTViewsData = new GridData(GridData.FILL_HORIZONTAL);
		sWTViewsData.horizontalSpan = 2;
		sWTViews.setLayoutData(sWTViewsData);
		EditingUtils.setID(sWTViews, EEFGenViewsRepository.GenViewsRepository.Activation.sWTViews);
		EditingUtils.setEEFtype(sWTViews, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditingComponent.getHelpContent(EEFGenViewsRepository.GenViewsRepository.Activation.sWTViews, EEFGenViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createFormsViewsCheckbox(FormToolkit widgetFactory, Composite parent) {
		formsViews = widgetFactory.createButton(parent, EEFGenMessages.GenViewsRepositoryPropertiesEditionPart_FormsViewsLabel, SWT.CHECK);
		formsViews.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditingComponent != null)
					propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(GenViewsRepositoryPropertiesEditionPartForm.this, EEFGenViewsRepository.GenViewsRepository.Activation.formsViews, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, new Boolean(formsViews.getSelection())));
			}

		});
		GridData formsViewsData = new GridData(GridData.FILL_HORIZONTAL);
		formsViewsData.horizontalSpan = 2;
		formsViews.setLayoutData(formsViewsData);
		EditingUtils.setID(formsViews, EEFGenViewsRepository.GenViewsRepository.Activation.formsViews);
		EditingUtils.setEEFtype(formsViews, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditingComponent.getHelpContent(EEFGenViewsRepository.GenViewsRepository.Activation.formsViews, EEFGenViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createImplementationGroup(FormToolkit widgetFactory, final Composite parent) {
		Section implementationSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		implementationSection.setText(EEFGenMessages.GenViewsRepositoryPropertiesEditionPart_ImplementationGroupLabel);
		GridData implementationSectionData = new GridData(GridData.FILL_HORIZONTAL);
		implementationSectionData.horizontalSpan = 3;
		implementationSection.setLayoutData(implementationSectionData);
		Composite implementationGroup = widgetFactory.createComposite(implementationSection);
		GridLayout implementationGroupLayout = new GridLayout();
		implementationGroupLayout.numColumns = 3;
		implementationGroup.setLayout(implementationGroupLayout);
		implementationSection.setClient(implementationGroup);
		return implementationGroup;
	}

	
	protected Composite createPartsSuperClassText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, EEFGenMessages.GenViewsRepositoryPropertiesEditionPart_PartsSuperClassLabel, propertiesEditingComponent.isRequired(EEFGenViewsRepository.GenViewsRepository.Implementation.partsSuperClass, EEFGenViewsRepository.FORM_KIND));
		partsSuperClass = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		partsSuperClass.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData partsSuperClassData = new GridData(GridData.FILL_HORIZONTAL);
		partsSuperClass.setLayoutData(partsSuperClassData);
		partsSuperClass.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditingComponent != null)
					propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(GenViewsRepositoryPropertiesEditionPartForm.this, EEFGenViewsRepository.GenViewsRepository.Implementation.partsSuperClass, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, partsSuperClass.getText()));
			}
		});
		partsSuperClass.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditingComponent != null)
						propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(GenViewsRepositoryPropertiesEditionPartForm.this, EEFGenViewsRepository.GenViewsRepository.Implementation.partsSuperClass, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, partsSuperClass.getText()));
				}
			}
		});
		EditingUtils.setID(partsSuperClass, EEFGenViewsRepository.GenViewsRepository.Implementation.partsSuperClass);
		EditingUtils.setEEFtype(partsSuperClass, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditingComponent.getHelpContent(EEFGenViewsRepository.GenViewsRepository.Implementation.partsSuperClass, EEFGenViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see org.eclipse.emf.eef.EEFGen.parts.GenViewsRepositoryPropertiesEditionPart#getViewsRepository()
	 * 
	 */
	public EObject getViewsRepository() {
		if (viewsRepository.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) viewsRepository.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.EEFGen.parts.GenViewsRepositoryPropertiesEditionPart#initViewsRepository(EObjectFlatComboSettings)
	 */
	public void initViewsRepository(EObjectFlatComboSettings settings) {
		viewsRepository.setInput(settings);
		if (current != null) {
			viewsRepository.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.EEFGen.parts.GenViewsRepositoryPropertiesEditionPart#setViewsRepository(EObject newValue)
	 * 
	 */
	public void setViewsRepository(EObject newValue) {
		if (newValue != null) {
			viewsRepository.setSelection(new StructuredSelection(newValue));
		} else {
			viewsRepository.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.EEFGen.parts.GenViewsRepositoryPropertiesEditionPart#setViewsRepositoryButtonMode(ButtonsModeEnum newValue)
	 */
	public void setViewsRepositoryButtonMode(ButtonsModeEnum newValue) {
		viewsRepository.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.EEFGen.parts.GenViewsRepositoryPropertiesEditionPart#addFilterViewsRepository(ViewerFilter filter)
	 * 
	 */
	public void addFilterToViewsRepository(ViewerFilter filter) {
		viewsRepository.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.EEFGen.parts.GenViewsRepositoryPropertiesEditionPart#addBusinessFilterViewsRepository(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToViewsRepository(ViewerFilter filter) {
		viewsRepository.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.EEFGen.parts.GenViewsRepositoryPropertiesEditionPart#getBasePackage()
	 * 
	 */
	public String getBasePackage() {
		return basePackage.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.EEFGen.parts.GenViewsRepositoryPropertiesEditionPart#setBasePackage(String newValue)
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
	 * @see org.eclipse.emf.eef.EEFGen.parts.GenViewsRepositoryPropertiesEditionPart#getHelpStrategy()
	 * 
	 */
	public Enumerator getHelpStrategy() {
		EEnumLiteral selection = (EEnumLiteral) ((StructuredSelection) helpStrategy.getSelection()).getFirstElement();
		return selection.getInstance();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.EEFGen.parts.GenViewsRepositoryPropertiesEditionPart#initHelpStrategy(EEnum eenum, Enumerator current)
	 */
	public void initHelpStrategy(EEnum eenum, Enumerator current) {
		helpStrategy.setInput(eenum.getELiterals());
		helpStrategy.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.EEFGen.parts.GenViewsRepositoryPropertiesEditionPart#setHelpStrategy(Enumerator newValue)
	 * 
	 */
	public void setHelpStrategy(Enumerator newValue) {
		helpStrategy.modelUpdating(new StructuredSelection(newValue));
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.EEFGen.parts.GenViewsRepositoryPropertiesEditionPart#getSWTViews()
	 * 
	 */
	public Boolean getSWTViews() {
		return Boolean.valueOf(sWTViews.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.EEFGen.parts.GenViewsRepositoryPropertiesEditionPart#setSWTViews(Boolean newValue)
	 * 
	 */
	public void setSWTViews(Boolean newValue) {
		if (newValue != null) {
			sWTViews.setSelection(newValue.booleanValue());
		} else {
			sWTViews.setSelection(false);
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.EEFGen.parts.GenViewsRepositoryPropertiesEditionPart#getFormsViews()
	 * 
	 */
	public Boolean getFormsViews() {
		return Boolean.valueOf(formsViews.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.EEFGen.parts.GenViewsRepositoryPropertiesEditionPart#setFormsViews(Boolean newValue)
	 * 
	 */
	public void setFormsViews(Boolean newValue) {
		if (newValue != null) {
			formsViews.setSelection(newValue.booleanValue());
		} else {
			formsViews.setSelection(false);
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.EEFGen.parts.GenViewsRepositoryPropertiesEditionPart#getPartsSuperClass()
	 * 
	 */
	public String getPartsSuperClass() {
		return partsSuperClass.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.EEFGen.parts.GenViewsRepositoryPropertiesEditionPart#setPartsSuperClass(String newValue)
	 * 
	 */
	public void setPartsSuperClass(String newValue) {
		if (newValue != null) {
			partsSuperClass.setText(newValue);
		} else {
			partsSuperClass.setText(""); //$NON-NLS-1$
		}
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.parts.PropertiesEditingPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EEFGenMessages.GenViewsRepository_Part_Title;
	}

	// Start of user code additional methods
 	
	// End of user code


}
