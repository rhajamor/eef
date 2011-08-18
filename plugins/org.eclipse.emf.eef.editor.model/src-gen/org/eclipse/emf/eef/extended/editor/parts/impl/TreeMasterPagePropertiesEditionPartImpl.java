/**
 * Generated with Acceleo
 */
package org.eclipse.emf.eef.extended.editor.parts.impl;

// Start of user code for imports
import org.eclipse.emf.eef.extended.editor.parts.EditorViewsRepository;
import org.eclipse.emf.eef.extended.editor.parts.TreeMasterPagePropertiesEditionPart;
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
public class TreeMasterPagePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, TreeMasterPagePropertiesEditionPart {

	protected Text name;
	protected Text title_;
	protected Button toolbarVisible;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public TreeMasterPagePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence treeMasterPageStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep namingStep = treeMasterPageStep.addStep(EditorViewsRepository.TreeMasterPage.Naming.class);
		namingStep.addStep(EditorViewsRepository.TreeMasterPage.Naming.name);
		namingStep.addStep(EditorViewsRepository.TreeMasterPage.Naming.title_);
		
		treeMasterPageStep
			.addStep(EditorViewsRepository.TreeMasterPage.Settings.class)
			.addStep(EditorViewsRepository.TreeMasterPage.Settings.toolbarVisible);
		
		
		composer = new PartComposer(treeMasterPageStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EditorViewsRepository.TreeMasterPage.Naming.class) {
					return createNamingGroup(parent);
				}
				if (key == EditorViewsRepository.TreeMasterPage.Naming.name) {
					return createNameText(parent);
				}
				if (key == EditorViewsRepository.TreeMasterPage.Naming.title_) {
					return createTitle_Text(parent);
				}
				if (key == EditorViewsRepository.TreeMasterPage.Settings.class) {
					return createSettingsGroup(parent);
				}
				if (key == EditorViewsRepository.TreeMasterPage.Settings.toolbarVisible) {
					return createToolbarVisibleCheckbox(parent);
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
		namingGroup.setText(EditorMessages.TreeMasterPagePropertiesEditionPart_NamingGroupLabel);
		GridData namingGroupData = new GridData(GridData.FILL_HORIZONTAL);
		namingGroupData.horizontalSpan = 3;
		namingGroup.setLayoutData(namingGroupData);
		GridLayout namingGroupLayout = new GridLayout();
		namingGroupLayout.numColumns = 3;
		namingGroup.setLayout(namingGroupLayout);
		return namingGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, EditorMessages.TreeMasterPagePropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(EditorViewsRepository.TreeMasterPage.Naming.name, EditorViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TreeMasterPagePropertiesEditionPartImpl.this, EditorViewsRepository.TreeMasterPage.Naming.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TreeMasterPagePropertiesEditionPartImpl.this, EditorViewsRepository.TreeMasterPage.Naming.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, EditorViewsRepository.TreeMasterPage.Naming.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EditorViewsRepository.TreeMasterPage.Naming.name, EditorViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createTitle_Text(Composite parent) {
		SWTUtils.createPartLabel(parent, EditorMessages.TreeMasterPagePropertiesEditionPart_Title_Label, propertiesEditionComponent.isRequired(EditorViewsRepository.TreeMasterPage.Naming.title_, EditorViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TreeMasterPagePropertiesEditionPartImpl.this, EditorViewsRepository.TreeMasterPage.Naming.title_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, title_.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TreeMasterPagePropertiesEditionPartImpl.this, EditorViewsRepository.TreeMasterPage.Naming.title_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, title_.getText()));
				}
			}

		});
		EditingUtils.setID(title_, EditorViewsRepository.TreeMasterPage.Naming.title_);
		EditingUtils.setEEFtype(title_, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EditorViewsRepository.TreeMasterPage.Naming.title_, EditorViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createSettingsGroup(Composite parent) {
		Group settingsGroup = new Group(parent, SWT.NONE);
		settingsGroup.setText(EditorMessages.TreeMasterPagePropertiesEditionPart_SettingsGroupLabel);
		GridData settingsGroupData = new GridData(GridData.FILL_HORIZONTAL);
		settingsGroupData.horizontalSpan = 3;
		settingsGroup.setLayoutData(settingsGroupData);
		GridLayout settingsGroupLayout = new GridLayout();
		settingsGroupLayout.numColumns = 3;
		settingsGroup.setLayout(settingsGroupLayout);
		return settingsGroup;
	}

	
	protected Composite createToolbarVisibleCheckbox(Composite parent) {
		toolbarVisible = new Button(parent, SWT.CHECK);
		toolbarVisible.setText(EditorMessages.TreeMasterPagePropertiesEditionPart_ToolbarVisibleLabel);
		toolbarVisible.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TreeMasterPagePropertiesEditionPartImpl.this, EditorViewsRepository.TreeMasterPage.Settings.toolbarVisible, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(toolbarVisible.getSelection())));
			}

		});
		GridData toolbarVisibleData = new GridData(GridData.FILL_HORIZONTAL);
		toolbarVisibleData.horizontalSpan = 2;
		toolbarVisible.setLayoutData(toolbarVisibleData);
		EditingUtils.setID(toolbarVisible, EditorViewsRepository.TreeMasterPage.Settings.toolbarVisible);
		EditingUtils.setEEFtype(toolbarVisible, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EditorViewsRepository.TreeMasterPage.Settings.toolbarVisible, EditorViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see org.eclipse.emf.eef.extended.editor.parts.TreeMasterPagePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.extended.editor.parts.TreeMasterPagePropertiesEditionPart#setName(String newValue)
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
	 * @see org.eclipse.emf.eef.extended.editor.parts.TreeMasterPagePropertiesEditionPart#getTitle_()
	 * 
	 */
	public String getTitle_() {
		return title_.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.extended.editor.parts.TreeMasterPagePropertiesEditionPart#setTitle_(String newValue)
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
	 * @see org.eclipse.emf.eef.extended.editor.parts.TreeMasterPagePropertiesEditionPart#getToolbarVisible()
	 * 
	 */
	public Boolean getToolbarVisible() {
		return Boolean.valueOf(toolbarVisible.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.extended.editor.parts.TreeMasterPagePropertiesEditionPart#setToolbarVisible(Boolean newValue)
	 * 
	 */
	public void setToolbarVisible(Boolean newValue) {
		if (newValue != null) {
			toolbarVisible.setSelection(newValue.booleanValue());
		} else {
			toolbarVisible.setSelection(false);
		}
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EditorMessages.TreeMasterPage_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
