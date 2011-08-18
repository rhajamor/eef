/**
 * Generated with Acceleo
 */
package org.eclipse.emf.eef.extended.editor.parts.forms;

// Start of user code for imports
import org.eclipse.emf.eef.extended.editor.parts.EEFMasterPagePropertiesEditionPart;
import org.eclipse.emf.eef.extended.editor.parts.EditorViewsRepository;
import org.eclipse.emf.eef.extended.editor.providers.EditorMessages;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
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
public class EEFMasterPagePropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, EEFMasterPagePropertiesEditionPart {

	protected Text name;
	protected Text title_;
	protected Button orientable;
	protected Button showValidatePage;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public EEFMasterPagePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence eEFMasterPageStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep namingStep = eEFMasterPageStep.addStep(EditorViewsRepository.EEFMasterPage.Naming.class);
		namingStep.addStep(EditorViewsRepository.EEFMasterPage.Naming.name);
		namingStep.addStep(EditorViewsRepository.EEFMasterPage.Naming.title_);
		
		CompositionStep settingsStep = eEFMasterPageStep.addStep(EditorViewsRepository.EEFMasterPage.Settings.class);
		settingsStep.addStep(EditorViewsRepository.EEFMasterPage.Settings.orientable);
		settingsStep.addStep(EditorViewsRepository.EEFMasterPage.Settings.showValidatePage);
		
		
		composer = new PartComposer(eEFMasterPageStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EditorViewsRepository.EEFMasterPage.Naming.class) {
					return createNamingGroup(widgetFactory, parent);
				}
				if (key == EditorViewsRepository.EEFMasterPage.Naming.name) {
					return 		createNameText(widgetFactory, parent);
				}
				if (key == EditorViewsRepository.EEFMasterPage.Naming.title_) {
					return 		createTitle_Text(widgetFactory, parent);
				}
				if (key == EditorViewsRepository.EEFMasterPage.Settings.class) {
					return createSettingsGroup(widgetFactory, parent);
				}
				if (key == EditorViewsRepository.EEFMasterPage.Settings.orientable) {
					return createOrientableCheckbox(widgetFactory, parent);
				}
				if (key == EditorViewsRepository.EEFMasterPage.Settings.showValidatePage) {
					return createShowValidatePageCheckbox(widgetFactory, parent);
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
		namingSection.setText(EditorMessages.EEFMasterPagePropertiesEditionPart_NamingGroupLabel);
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
		FormUtils.createPartLabel(widgetFactory, parent, EditorMessages.EEFMasterPagePropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(EditorViewsRepository.EEFMasterPage.Naming.name, EditorViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EEFMasterPagePropertiesEditionPartForm.this, EditorViewsRepository.EEFMasterPage.Naming.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EEFMasterPagePropertiesEditionPartForm.this, EditorViewsRepository.EEFMasterPage.Naming.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, EditorViewsRepository.EEFMasterPage.Naming.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EditorViewsRepository.EEFMasterPage.Naming.name, EditorViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createTitle_Text(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, EditorMessages.EEFMasterPagePropertiesEditionPart_Title_Label, propertiesEditionComponent.isRequired(EditorViewsRepository.EEFMasterPage.Naming.title_, EditorViewsRepository.FORM_KIND));
		title_ = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		title_.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData title_Data = new GridData(GridData.FILL_HORIZONTAL);
		title_.setLayoutData(title_Data);
		title_.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EEFMasterPagePropertiesEditionPartForm.this, EditorViewsRepository.EEFMasterPage.Naming.title_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, title_.getText()));
			}
		});
		title_.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EEFMasterPagePropertiesEditionPartForm.this, EditorViewsRepository.EEFMasterPage.Naming.title_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, title_.getText()));
				}
			}
		});
		EditingUtils.setID(title_, EditorViewsRepository.EEFMasterPage.Naming.title_);
		EditingUtils.setEEFtype(title_, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EditorViewsRepository.EEFMasterPage.Naming.title_, EditorViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createSettingsGroup(FormToolkit widgetFactory, final Composite parent) {
		Section settingsSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		settingsSection.setText(EditorMessages.EEFMasterPagePropertiesEditionPart_SettingsGroupLabel);
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

	
	protected Composite createOrientableCheckbox(FormToolkit widgetFactory, Composite parent) {
		orientable = widgetFactory.createButton(parent, EditorMessages.EEFMasterPagePropertiesEditionPart_OrientableLabel, SWT.CHECK);
		orientable.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EEFMasterPagePropertiesEditionPartForm.this, EditorViewsRepository.EEFMasterPage.Settings.orientable, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(orientable.getSelection())));
			}

		});
		GridData orientableData = new GridData(GridData.FILL_HORIZONTAL);
		orientableData.horizontalSpan = 2;
		orientable.setLayoutData(orientableData);
		EditingUtils.setID(orientable, EditorViewsRepository.EEFMasterPage.Settings.orientable);
		EditingUtils.setEEFtype(orientable, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EditorViewsRepository.EEFMasterPage.Settings.orientable, EditorViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createShowValidatePageCheckbox(FormToolkit widgetFactory, Composite parent) {
		showValidatePage = widgetFactory.createButton(parent, EditorMessages.EEFMasterPagePropertiesEditionPart_ShowValidatePageLabel, SWT.CHECK);
		showValidatePage.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EEFMasterPagePropertiesEditionPartForm.this, EditorViewsRepository.EEFMasterPage.Settings.showValidatePage, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(showValidatePage.getSelection())));
			}

		});
		GridData showValidatePageData = new GridData(GridData.FILL_HORIZONTAL);
		showValidatePageData.horizontalSpan = 2;
		showValidatePage.setLayoutData(showValidatePageData);
		EditingUtils.setID(showValidatePage, EditorViewsRepository.EEFMasterPage.Settings.showValidatePage);
		EditingUtils.setEEFtype(showValidatePage, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EditorViewsRepository.EEFMasterPage.Settings.showValidatePage, EditorViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see org.eclipse.emf.eef.extended.editor.parts.EEFMasterPagePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.extended.editor.parts.EEFMasterPagePropertiesEditionPart#setName(String newValue)
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
	 * @see org.eclipse.emf.eef.extended.editor.parts.EEFMasterPagePropertiesEditionPart#getTitle_()
	 * 
	 */
	public String getTitle_() {
		return title_.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.extended.editor.parts.EEFMasterPagePropertiesEditionPart#setTitle_(String newValue)
	 * 
	 */
	public void setTitle_(String newValue) {
		if (newValue != null) {
			title_.setText(newValue);
		} else {
			title_.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.extended.editor.parts.EEFMasterPagePropertiesEditionPart#getOrientable()
	 * 
	 */
	public Boolean getOrientable() {
		return Boolean.valueOf(orientable.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.extended.editor.parts.EEFMasterPagePropertiesEditionPart#setOrientable(Boolean newValue)
	 * 
	 */
	public void setOrientable(Boolean newValue) {
		if (newValue != null) {
			orientable.setSelection(newValue.booleanValue());
		} else {
			orientable.setSelection(false);
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.extended.editor.parts.EEFMasterPagePropertiesEditionPart#getShowValidatePage()
	 * 
	 */
	public Boolean getShowValidatePage() {
		return Boolean.valueOf(showValidatePage.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.extended.editor.parts.EEFMasterPagePropertiesEditionPart#setShowValidatePage(Boolean newValue)
	 * 
	 */
	public void setShowValidatePage(Boolean newValue) {
		if (newValue != null) {
			showValidatePage.setSelection(newValue.booleanValue());
		} else {
			showValidatePage.setSelection(false);
		}
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EditorMessages.EEFMasterPage_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
