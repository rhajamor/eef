/**
 * Copyright (c) 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 ******************************************************************************
 */
package org.eclipse.emf.eef.extended.editor.parts.forms;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.extended.editor.parts.EditorViewsRepository;
import org.eclipse.emf.eef.extended.editor.parts.PartFilterPropertiesEditionPart;
import org.eclipse.emf.eef.extended.editor.providers.EditorMessages;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
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
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;


// End of user code

/**
 * 
 * 
 */
public class PartFilterPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, PartFilterPropertiesEditionPart {

	protected Text name;
	protected EObjectFlatComboViewer contextualComponent;
	protected EObjectFlatComboViewer filteredPart;
	protected Button mandatory;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public PartFilterPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
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
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createControls(org.eclipse.ui.forms.widgets.FormToolkit, org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(final FormToolkit widgetFactory, Composite view) {
		CompositionSequence partFilterStep = new CompositionSequence();
		partFilterStep
			.addStep(EditorViewsRepository.PartFilter.Naming.class)
			.addStep(EditorViewsRepository.PartFilter.Naming.name);
		
		CompositionStep filterStep = partFilterStep.addStep(EditorViewsRepository.PartFilter.Filter.class);
		filterStep.addStep(EditorViewsRepository.PartFilter.Filter.contextualComponent);
		filterStep.addStep(EditorViewsRepository.PartFilter.Filter.filteredPart);
		
		partFilterStep
			.addStep(EditorViewsRepository.PartFilter.Settings.class)
			.addStep(EditorViewsRepository.PartFilter.Settings.mandatory);
		
		
		composer = new PartComposer(partFilterStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EditorViewsRepository.PartFilter.Naming.class) {
					return createNamingGroup(widgetFactory, parent);
				}
				if (key == EditorViewsRepository.PartFilter.Naming.name) {
					return 		createNameText(widgetFactory, parent);
				}
				if (key == EditorViewsRepository.PartFilter.Filter.class) {
					return createFilterGroup(widgetFactory, parent);
				}
				if (key == EditorViewsRepository.PartFilter.Filter.contextualComponent) {
					return createContextualComponentFlatComboViewer(parent, widgetFactory);
				}
				if (key == EditorViewsRepository.PartFilter.Filter.filteredPart) {
					return createFilteredPartFlatComboViewer(parent, widgetFactory);
				}
				if (key == EditorViewsRepository.PartFilter.Settings.class) {
					return createSettingsGroup(widgetFactory, parent);
				}
				if (key == EditorViewsRepository.PartFilter.Settings.mandatory) {
					return createMandatoryCheckbox(widgetFactory, parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * 
	 */
	protected Composite createNamingGroup(FormToolkit widgetFactory, final Composite parent) {
		Section namingSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		namingSection.setText(EditorMessages.PartFilterPropertiesEditionPart_NamingGroupLabel);
		GridData namingSectionData = new GridData(GridData.FILL_HORIZONTAL);
		namingSectionData.horizontalSpan = 3;
		namingSection.setLayoutData(namingSectionData);
		Composite namingGroup = widgetFactory.createComposite(namingSection);
		GridLayout namingGroupLayout = new GridLayout();
		namingGroupLayout.numColumns = 3;
		namingGroup.setLayout(namingGroupLayout);
		namingSection.setClient(namingGroup);
		return namingGroup;
	}

	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, EditorMessages.PartFilterPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(EditorViewsRepository.PartFilter.Naming.name, EditorViewsRepository.FORM_KIND));
		name = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		name.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PartFilterPropertiesEditionPartForm.this, EditorViewsRepository.PartFilter.Naming.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
			}
		});
		name.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PartFilterPropertiesEditionPartForm.this, EditorViewsRepository.PartFilter.Naming.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, EditorViewsRepository.PartFilter.Naming.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EditorViewsRepository.PartFilter.Naming.name, EditorViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createFilterGroup(FormToolkit widgetFactory, final Composite parent) {
		Section filterSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		filterSection.setText(EditorMessages.PartFilterPropertiesEditionPart_FilterGroupLabel);
		GridData filterSectionData = new GridData(GridData.FILL_HORIZONTAL);
		filterSectionData.horizontalSpan = 3;
		filterSection.setLayoutData(filterSectionData);
		Composite filterGroup = widgetFactory.createComposite(filterSection);
		GridLayout filterGroupLayout = new GridLayout();
		filterGroupLayout.numColumns = 3;
		filterGroup.setLayout(filterGroupLayout);
		filterSection.setClient(filterGroup);
		return filterGroup;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createContextualComponentFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, EditorMessages.PartFilterPropertiesEditionPart_ContextualComponentLabel, propertiesEditionComponent.isRequired(EditorViewsRepository.PartFilter.Filter.contextualComponent, EditorViewsRepository.FORM_KIND));
		contextualComponent = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(EditorViewsRepository.PartFilter.Filter.contextualComponent, EditorViewsRepository.FORM_KIND));
		contextualComponent.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData contextualComponentData = new GridData(GridData.FILL_HORIZONTAL);
		contextualComponent.setLayoutData(contextualComponentData);
		contextualComponent.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PartFilterPropertiesEditionPartForm.this, EditorViewsRepository.PartFilter.Filter.contextualComponent, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getContextualComponent()));
			}

		});
		contextualComponent.setID(EditorViewsRepository.PartFilter.Filter.contextualComponent);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EditorViewsRepository.PartFilter.Filter.contextualComponent, EditorViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createFilteredPartFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, EditorMessages.PartFilterPropertiesEditionPart_FilteredPartLabel, propertiesEditionComponent.isRequired(EditorViewsRepository.PartFilter.Filter.filteredPart, EditorViewsRepository.FORM_KIND));
		filteredPart = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(EditorViewsRepository.PartFilter.Filter.filteredPart, EditorViewsRepository.FORM_KIND));
		filteredPart.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData filteredPartData = new GridData(GridData.FILL_HORIZONTAL);
		filteredPart.setLayoutData(filteredPartData);
		filteredPart.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PartFilterPropertiesEditionPartForm.this, EditorViewsRepository.PartFilter.Filter.filteredPart, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getFilteredPart()));
			}

		});
		filteredPart.setID(EditorViewsRepository.PartFilter.Filter.filteredPart);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EditorViewsRepository.PartFilter.Filter.filteredPart, EditorViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createSettingsGroup(FormToolkit widgetFactory, final Composite parent) {
		Section settingsSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		settingsSection.setText(EditorMessages.PartFilterPropertiesEditionPart_SettingsGroupLabel);
		GridData settingsSectionData = new GridData(GridData.FILL_HORIZONTAL);
		settingsSectionData.horizontalSpan = 3;
		settingsSection.setLayoutData(settingsSectionData);
		Composite settingsGroup = widgetFactory.createComposite(settingsSection);
		GridLayout settingsGroupLayout = new GridLayout();
		settingsGroupLayout.numColumns = 3;
		settingsGroup.setLayout(settingsGroupLayout);
		settingsSection.setClient(settingsGroup);
		return settingsGroup;
	}

	
	protected Composite createMandatoryCheckbox(FormToolkit widgetFactory, Composite parent) {
		mandatory = widgetFactory.createButton(parent, EditorMessages.PartFilterPropertiesEditionPart_MandatoryLabel, SWT.CHECK);
		mandatory.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PartFilterPropertiesEditionPartForm.this, EditorViewsRepository.PartFilter.Settings.mandatory, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(mandatory.getSelection())));
			}

		});
		GridData mandatoryData = new GridData(GridData.FILL_HORIZONTAL);
		mandatoryData.horizontalSpan = 2;
		mandatory.setLayoutData(mandatoryData);
		EditingUtils.setID(mandatory, EditorViewsRepository.PartFilter.Settings.mandatory);
		EditingUtils.setEEFtype(mandatory, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EditorViewsRepository.PartFilter.Settings.mandatory, EditorViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see org.eclipse.emf.eef.extended.editor.parts.PartFilterPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.extended.editor.parts.PartFilterPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.extended.editor.parts.PartFilterPropertiesEditionPart#getContextualComponent()
	 * 
	 */
	public EObject getContextualComponent() {
		if (contextualComponent.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) contextualComponent.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.extended.editor.parts.PartFilterPropertiesEditionPart#initContextualComponent(EObjectFlatComboSettings)
	 */
	public void initContextualComponent(EObjectFlatComboSettings settings) {
		contextualComponent.setInput(settings);
		if (current != null) {
			contextualComponent.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.extended.editor.parts.PartFilterPropertiesEditionPart#setContextualComponent(EObject newValue)
	 * 
	 */
	public void setContextualComponent(EObject newValue) {
		if (newValue != null) {
			contextualComponent.setSelection(new StructuredSelection(newValue));
		} else {
			contextualComponent.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.extended.editor.parts.PartFilterPropertiesEditionPart#setContextualComponentButtonMode(ButtonsModeEnum newValue)
	 */
	public void setContextualComponentButtonMode(ButtonsModeEnum newValue) {
		contextualComponent.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.extended.editor.parts.PartFilterPropertiesEditionPart#addFilterContextualComponent(ViewerFilter filter)
	 * 
	 */
	public void addFilterToContextualComponent(ViewerFilter filter) {
		contextualComponent.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.extended.editor.parts.PartFilterPropertiesEditionPart#addBusinessFilterContextualComponent(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToContextualComponent(ViewerFilter filter) {
		contextualComponent.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.extended.editor.parts.PartFilterPropertiesEditionPart#getFilteredPart()
	 * 
	 */
	public EObject getFilteredPart() {
		if (filteredPart.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) filteredPart.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.extended.editor.parts.PartFilterPropertiesEditionPart#initFilteredPart(EObjectFlatComboSettings)
	 */
	public void initFilteredPart(EObjectFlatComboSettings settings) {
		filteredPart.setInput(settings);
		if (current != null) {
			filteredPart.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.extended.editor.parts.PartFilterPropertiesEditionPart#setFilteredPart(EObject newValue)
	 * 
	 */
	public void setFilteredPart(EObject newValue) {
		if (newValue != null) {
			filteredPart.setSelection(new StructuredSelection(newValue));
		} else {
			filteredPart.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.extended.editor.parts.PartFilterPropertiesEditionPart#setFilteredPartButtonMode(ButtonsModeEnum newValue)
	 */
	public void setFilteredPartButtonMode(ButtonsModeEnum newValue) {
		filteredPart.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.extended.editor.parts.PartFilterPropertiesEditionPart#addFilterFilteredPart(ViewerFilter filter)
	 * 
	 */
	public void addFilterToFilteredPart(ViewerFilter filter) {
		filteredPart.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.extended.editor.parts.PartFilterPropertiesEditionPart#addBusinessFilterFilteredPart(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToFilteredPart(ViewerFilter filter) {
		filteredPart.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.extended.editor.parts.PartFilterPropertiesEditionPart#getMandatory()
	 * 
	 */
	public Boolean getMandatory() {
		return Boolean.valueOf(mandatory.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.extended.editor.parts.PartFilterPropertiesEditionPart#setMandatory(Boolean newValue)
	 * 
	 */
	public void setMandatory(Boolean newValue) {
		if (newValue != null) {
			mandatory.setSelection(newValue.booleanValue());
		} else {
			mandatory.setSelection(false);
		}
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EditorMessages.PartFilter_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
