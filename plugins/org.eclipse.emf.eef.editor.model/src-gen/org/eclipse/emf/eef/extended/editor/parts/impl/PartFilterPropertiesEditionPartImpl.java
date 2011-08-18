/**
 * Generated with Acceleo
 */
package org.eclipse.emf.eef.extended.editor.parts.impl;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.extended.editor.parts.EditorViewsRepository;
import org.eclipse.emf.eef.extended.editor.parts.PartFilterPropertiesEditionPart;
import org.eclipse.emf.eef.extended.editor.providers.EditorMessages;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
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
 * 
 * 
 */
public class PartFilterPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, PartFilterPropertiesEditionPart {

	protected Text name;
	protected EObjectFlatComboViewer contextualComponent;
	protected EObjectFlatComboViewer filteredPart;
	protected Button mandatory;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public PartFilterPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence partFilterStep = new BindingCompositionSequence(propertiesEditionComponent);
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
					return createNamingGroup(parent);
				}
				if (key == EditorViewsRepository.PartFilter.Naming.name) {
					return createNameText(parent);
				}
				if (key == EditorViewsRepository.PartFilter.Filter.class) {
					return createFilterGroup(parent);
				}
				if (key == EditorViewsRepository.PartFilter.Filter.contextualComponent) {
					return createContextualComponentFlatComboViewer(parent);
				}
				if (key == EditorViewsRepository.PartFilter.Filter.filteredPart) {
					return createFilteredPartFlatComboViewer(parent);
				}
				if (key == EditorViewsRepository.PartFilter.Settings.class) {
					return createSettingsGroup(parent);
				}
				if (key == EditorViewsRepository.PartFilter.Settings.mandatory) {
					return createMandatoryCheckbox(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createNamingGroup(Composite parent) {
		Group namingGroup = new Group(parent, SWT.NONE);
		namingGroup.setText(EditorMessages.PartFilterPropertiesEditionPart_NamingGroupLabel);
		GridData namingGroupData = new GridData(GridData.FILL_HORIZONTAL);
		namingGroupData.horizontalSpan = 3;
		namingGroup.setLayoutData(namingGroupData);
		GridLayout namingGroupLayout = new GridLayout();
		namingGroupLayout.numColumns = 3;
		namingGroup.setLayout(namingGroupLayout);
		return namingGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, EditorMessages.PartFilterPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(EditorViewsRepository.PartFilter.Naming.name, EditorViewsRepository.SWT_KIND));
		name = new Text(parent, SWT.BORDER);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PartFilterPropertiesEditionPartImpl.this, EditorViewsRepository.PartFilter.Naming.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
			}

		});
		name.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PartFilterPropertiesEditionPartImpl.this, EditorViewsRepository.PartFilter.Naming.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, EditorViewsRepository.PartFilter.Naming.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EditorViewsRepository.PartFilter.Naming.name, EditorViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createFilterGroup(Composite parent) {
		Group filterGroup = new Group(parent, SWT.NONE);
		filterGroup.setText(EditorMessages.PartFilterPropertiesEditionPart_FilterGroupLabel);
		GridData filterGroupData = new GridData(GridData.FILL_HORIZONTAL);
		filterGroupData.horizontalSpan = 3;
		filterGroup.setLayoutData(filterGroupData);
		GridLayout filterGroupLayout = new GridLayout();
		filterGroupLayout.numColumns = 3;
		filterGroup.setLayout(filterGroupLayout);
		return filterGroup;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createContextualComponentFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, EditorMessages.PartFilterPropertiesEditionPart_ContextualComponentLabel, propertiesEditionComponent.isRequired(EditorViewsRepository.PartFilter.Filter.contextualComponent, EditorViewsRepository.SWT_KIND));
		contextualComponent = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(EditorViewsRepository.PartFilter.Filter.contextualComponent, EditorViewsRepository.SWT_KIND));
		contextualComponent.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		contextualComponent.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PartFilterPropertiesEditionPartImpl.this, EditorViewsRepository.PartFilter.Filter.contextualComponent, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getContextualComponent()));
			}

		});
		GridData contextualComponentData = new GridData(GridData.FILL_HORIZONTAL);
		contextualComponent.setLayoutData(contextualComponentData);
		contextualComponent.setID(EditorViewsRepository.PartFilter.Filter.contextualComponent);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EditorViewsRepository.PartFilter.Filter.contextualComponent, EditorViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createFilteredPartFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, EditorMessages.PartFilterPropertiesEditionPart_FilteredPartLabel, propertiesEditionComponent.isRequired(EditorViewsRepository.PartFilter.Filter.filteredPart, EditorViewsRepository.SWT_KIND));
		filteredPart = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(EditorViewsRepository.PartFilter.Filter.filteredPart, EditorViewsRepository.SWT_KIND));
		filteredPart.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		filteredPart.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PartFilterPropertiesEditionPartImpl.this, EditorViewsRepository.PartFilter.Filter.filteredPart, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getFilteredPart()));
			}

		});
		GridData filteredPartData = new GridData(GridData.FILL_HORIZONTAL);
		filteredPart.setLayoutData(filteredPartData);
		filteredPart.setID(EditorViewsRepository.PartFilter.Filter.filteredPart);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EditorViewsRepository.PartFilter.Filter.filteredPart, EditorViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createSettingsGroup(Composite parent) {
		Group settingsGroup = new Group(parent, SWT.NONE);
		settingsGroup.setText(EditorMessages.PartFilterPropertiesEditionPart_SettingsGroupLabel);
		GridData settingsGroupData = new GridData(GridData.FILL_HORIZONTAL);
		settingsGroupData.horizontalSpan = 3;
		settingsGroup.setLayoutData(settingsGroupData);
		GridLayout settingsGroupLayout = new GridLayout();
		settingsGroupLayout.numColumns = 3;
		settingsGroup.setLayout(settingsGroupLayout);
		return settingsGroup;
	}

	
	protected Composite createMandatoryCheckbox(Composite parent) {
		mandatory = new Button(parent, SWT.CHECK);
		mandatory.setText(EditorMessages.PartFilterPropertiesEditionPart_MandatoryLabel);
		mandatory.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PartFilterPropertiesEditionPartImpl.this, EditorViewsRepository.PartFilter.Settings.mandatory, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(mandatory.getSelection())));
			}

		});
		GridData mandatoryData = new GridData(GridData.FILL_HORIZONTAL);
		mandatoryData.horizontalSpan = 2;
		mandatory.setLayoutData(mandatoryData);
		EditingUtils.setID(mandatory, EditorViewsRepository.PartFilter.Settings.mandatory);
		EditingUtils.setEEFtype(mandatory, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EditorViewsRepository.PartFilter.Settings.mandatory, EditorViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
