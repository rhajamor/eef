/**
 * Generated with Acceleo
 */
package org.eclipse.emf.eef.extended.editor.parts.impl;

// Start of user code for imports
import org.eclipse.emf.eef.extended.editor.parts.EEFMasterPagePropertiesEditionPart;
import org.eclipse.emf.eef.extended.editor.parts.EditorViewsRepository;
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
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
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
public class EEFMasterPagePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, EEFMasterPagePropertiesEditionPart {

	protected Text name;
	protected Text title_;
	protected Button orientable;
	protected Button showValidatePage;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public EEFMasterPagePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
					return createNamingGroup(parent);
				}
				if (key == EditorViewsRepository.EEFMasterPage.Naming.name) {
					return createNameText(parent);
				}
				if (key == EditorViewsRepository.EEFMasterPage.Naming.title_) {
					return createTitle_Text(parent);
				}
				if (key == EditorViewsRepository.EEFMasterPage.Settings.class) {
					return createSettingsGroup(parent);
				}
				if (key == EditorViewsRepository.EEFMasterPage.Settings.orientable) {
					return createOrientableCheckbox(parent);
				}
				if (key == EditorViewsRepository.EEFMasterPage.Settings.showValidatePage) {
					return createShowValidatePageCheckbox(parent);
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
		namingGroup.setText(EditorMessages.EEFMasterPagePropertiesEditionPart_NamingGroupLabel);
		GridData namingGroupData = new GridData(GridData.FILL_HORIZONTAL);
		namingGroupData.horizontalSpan = 3;
		namingGroup.setLayoutData(namingGroupData);
		GridLayout namingGroupLayout = new GridLayout();
		namingGroupLayout.numColumns = 3;
		namingGroup.setLayout(namingGroupLayout);
		return namingGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, EditorMessages.EEFMasterPagePropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(EditorViewsRepository.EEFMasterPage.Naming.name, EditorViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EEFMasterPagePropertiesEditionPartImpl.this, EditorViewsRepository.EEFMasterPage.Naming.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EEFMasterPagePropertiesEditionPartImpl.this, EditorViewsRepository.EEFMasterPage.Naming.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, EditorViewsRepository.EEFMasterPage.Naming.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EditorViewsRepository.EEFMasterPage.Naming.name, EditorViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createTitle_Text(Composite parent) {
		SWTUtils.createPartLabel(parent, EditorMessages.EEFMasterPagePropertiesEditionPart_Title_Label, propertiesEditionComponent.isRequired(EditorViewsRepository.EEFMasterPage.Naming.title_, EditorViewsRepository.SWT_KIND));
		title_ = new Text(parent, SWT.BORDER);
		GridData title_Data = new GridData(GridData.FILL_HORIZONTAL);
		title_.setLayoutData(title_Data);
		title_.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EEFMasterPagePropertiesEditionPartImpl.this, EditorViewsRepository.EEFMasterPage.Naming.title_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, title_.getText()));
			}

		});
		title_.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EEFMasterPagePropertiesEditionPartImpl.this, EditorViewsRepository.EEFMasterPage.Naming.title_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, title_.getText()));
				}
			}

		});
		EditingUtils.setID(title_, EditorViewsRepository.EEFMasterPage.Naming.title_);
		EditingUtils.setEEFtype(title_, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EditorViewsRepository.EEFMasterPage.Naming.title_, EditorViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createSettingsGroup(Composite parent) {
		Group settingsGroup = new Group(parent, SWT.NONE);
		settingsGroup.setText(EditorMessages.EEFMasterPagePropertiesEditionPart_SettingsGroupLabel);
		GridData settingsGroupData = new GridData(GridData.FILL_HORIZONTAL);
		settingsGroupData.horizontalSpan = 3;
		settingsGroup.setLayoutData(settingsGroupData);
		GridLayout settingsGroupLayout = new GridLayout();
		settingsGroupLayout.numColumns = 3;
		settingsGroup.setLayout(settingsGroupLayout);
		return settingsGroup;
	}

	
	protected Composite createOrientableCheckbox(Composite parent) {
		orientable = new Button(parent, SWT.CHECK);
		orientable.setText(EditorMessages.EEFMasterPagePropertiesEditionPart_OrientableLabel);
		orientable.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EEFMasterPagePropertiesEditionPartImpl.this, EditorViewsRepository.EEFMasterPage.Settings.orientable, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(orientable.getSelection())));
			}

		});
		GridData orientableData = new GridData(GridData.FILL_HORIZONTAL);
		orientableData.horizontalSpan = 2;
		orientable.setLayoutData(orientableData);
		EditingUtils.setID(orientable, EditorViewsRepository.EEFMasterPage.Settings.orientable);
		EditingUtils.setEEFtype(orientable, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EditorViewsRepository.EEFMasterPage.Settings.orientable, EditorViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createShowValidatePageCheckbox(Composite parent) {
		showValidatePage = new Button(parent, SWT.CHECK);
		showValidatePage.setText(EditorMessages.EEFMasterPagePropertiesEditionPart_ShowValidatePageLabel);
		showValidatePage.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EEFMasterPagePropertiesEditionPartImpl.this, EditorViewsRepository.EEFMasterPage.Settings.showValidatePage, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(showValidatePage.getSelection())));
			}

		});
		GridData showValidatePageData = new GridData(GridData.FILL_HORIZONTAL);
		showValidatePageData.horizontalSpan = 2;
		showValidatePage.setLayoutData(showValidatePageData);
		EditingUtils.setID(showValidatePage, EditorViewsRepository.EEFMasterPage.Settings.showValidatePage);
		EditingUtils.setEEFtype(showValidatePage, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EditorViewsRepository.EEFMasterPage.Settings.showValidatePage, EditorViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
