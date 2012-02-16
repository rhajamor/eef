/*******************************************************************************
 * Copyright (c) 2009 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.samples.conference.parts.forms;

// Start of user code for imports
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;
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
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.samples.conference.parts.ConferenceViewsRepository;
import org.eclipse.emf.samples.conference.parts.PersonPropertiesEditionPart;
import org.eclipse.emf.samples.conference.providers.ConferenceMessages;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
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
 * @author <a href="mailto:stephane.bouchet@obeo.fr">Stephane Bouchet</a>
 * 
 */
public class PersonPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, PersonPropertiesEditionPart {

	protected Text firstname;
	protected Text lastname;
	protected Text age;
	protected EMFComboViewer gender;
	protected Button eclipseCommiter;
	protected Button isRegistered;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public PersonPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence personStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep identityStep = personStep.addStep(ConferenceViewsRepository.Person.Identity.class);
		identityStep.addStep(ConferenceViewsRepository.Person.Identity.firstname);
		identityStep.addStep(ConferenceViewsRepository.Person.Identity.lastname);
		identityStep.addStep(ConferenceViewsRepository.Person.Identity.age);
		identityStep.addStep(ConferenceViewsRepository.Person.Identity.gender);
		
		CompositionStep eclipseStatusStep = personStep.addStep(ConferenceViewsRepository.Person.EclipseStatus.class);
		eclipseStatusStep.addStep(ConferenceViewsRepository.Person.EclipseStatus.eclipseCommiter);
		eclipseStatusStep.addStep(ConferenceViewsRepository.Person.EclipseStatus.isRegistered);
		
		
		composer = new PartComposer(personStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ConferenceViewsRepository.Person.Identity.class) {
					return createIdentityGroup(widgetFactory, parent);
				}
				if (key == ConferenceViewsRepository.Person.Identity.firstname) {
					return 		createFirstnameText(widgetFactory, parent);
				}
				if (key == ConferenceViewsRepository.Person.Identity.lastname) {
					return 		createLastnameText(widgetFactory, parent);
				}
				if (key == ConferenceViewsRepository.Person.Identity.age) {
					return 		createAgeText(widgetFactory, parent);
				}
				if (key == ConferenceViewsRepository.Person.Identity.gender) {
					return createGenderEMFComboViewer(widgetFactory, parent);
				}
				if (key == ConferenceViewsRepository.Person.EclipseStatus.class) {
					return createEclipseStatusGroup(widgetFactory, parent);
				}
				if (key == ConferenceViewsRepository.Person.EclipseStatus.eclipseCommiter) {
					return createEclipseCommiterCheckbox(widgetFactory, parent);
				}
				if (key == ConferenceViewsRepository.Person.EclipseStatus.isRegistered) {
					return createIsRegisteredCheckbox(widgetFactory, parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * 
	 */
	protected Composite createIdentityGroup(FormToolkit widgetFactory, final Composite parent) {
		Section identitySection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		identitySection.setText(ConferenceMessages.PersonPropertiesEditionPart_IdentityGroupLabel);
		GridData identitySectionData = new GridData(GridData.FILL_HORIZONTAL);
		identitySectionData.horizontalSpan = 3;
		identitySection.setLayoutData(identitySectionData);
		Composite identityGroup = widgetFactory.createComposite(identitySection);
		GridLayout identityGroupLayout = new GridLayout();
		identityGroupLayout.numColumns = 3;
		identityGroup.setLayout(identityGroupLayout);
		identitySection.setClient(identityGroup);
		return identityGroup;
	}

	
	protected Composite createFirstnameText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ConferenceMessages.PersonPropertiesEditionPart_FirstnameLabel, propertiesEditionComponent.isRequired(ConferenceViewsRepository.Person.Identity.firstname, ConferenceViewsRepository.FORM_KIND));
		firstname = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		firstname.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData firstnameData = new GridData(GridData.FILL_HORIZONTAL);
		firstname.setLayoutData(firstnameData);
		firstname.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PersonPropertiesEditionPartForm.this, ConferenceViewsRepository.Person.Identity.firstname, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, firstname.getText()));
			}
		});
		firstname.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PersonPropertiesEditionPartForm.this, ConferenceViewsRepository.Person.Identity.firstname, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, firstname.getText()));
				}
			}
		});
		EditingUtils.setID(firstname, ConferenceViewsRepository.Person.Identity.firstname);
		EditingUtils.setEEFtype(firstname, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ConferenceViewsRepository.Person.Identity.firstname, ConferenceViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createLastnameText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ConferenceMessages.PersonPropertiesEditionPart_LastnameLabel, propertiesEditionComponent.isRequired(ConferenceViewsRepository.Person.Identity.lastname, ConferenceViewsRepository.FORM_KIND));
		lastname = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		lastname.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData lastnameData = new GridData(GridData.FILL_HORIZONTAL);
		lastname.setLayoutData(lastnameData);
		lastname.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PersonPropertiesEditionPartForm.this, ConferenceViewsRepository.Person.Identity.lastname, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, lastname.getText()));
			}
		});
		lastname.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PersonPropertiesEditionPartForm.this, ConferenceViewsRepository.Person.Identity.lastname, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, lastname.getText()));
				}
			}
		});
		EditingUtils.setID(lastname, ConferenceViewsRepository.Person.Identity.lastname);
		EditingUtils.setEEFtype(lastname, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ConferenceViewsRepository.Person.Identity.lastname, ConferenceViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createAgeText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ConferenceMessages.PersonPropertiesEditionPart_AgeLabel, propertiesEditionComponent.isRequired(ConferenceViewsRepository.Person.Identity.age, ConferenceViewsRepository.FORM_KIND));
		age = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		age.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData ageData = new GridData(GridData.FILL_HORIZONTAL);
		age.setLayoutData(ageData);
		age.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PersonPropertiesEditionPartForm.this, ConferenceViewsRepository.Person.Identity.age, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, age.getText()));
			}
		});
		age.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PersonPropertiesEditionPartForm.this, ConferenceViewsRepository.Person.Identity.age, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, age.getText()));
				}
			}
		});
		EditingUtils.setID(age, ConferenceViewsRepository.Person.Identity.age);
		EditingUtils.setEEFtype(age, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ConferenceViewsRepository.Person.Identity.age, ConferenceViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createGenderEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ConferenceMessages.PersonPropertiesEditionPart_GenderLabel, propertiesEditionComponent.isRequired(ConferenceViewsRepository.Person.Identity.gender, ConferenceViewsRepository.FORM_KIND));
		gender = new EMFComboViewer(parent);
		gender.setContentProvider(new ArrayContentProvider());
		gender.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData genderData = new GridData(GridData.FILL_HORIZONTAL);
		gender.getCombo().setLayoutData(genderData);
		gender.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PersonPropertiesEditionPartForm.this, ConferenceViewsRepository.Person.Identity.gender, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getGender()));
			}

		});
		gender.setID(ConferenceViewsRepository.Person.Identity.gender);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ConferenceViewsRepository.Person.Identity.gender, ConferenceViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createEclipseStatusGroup(FormToolkit widgetFactory, final Composite parent) {
		Section eclipseStatusSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		eclipseStatusSection.setText(ConferenceMessages.PersonPropertiesEditionPart_EclipseStatusGroupLabel);
		GridData eclipseStatusSectionData = new GridData(GridData.FILL_HORIZONTAL);
		eclipseStatusSectionData.horizontalSpan = 3;
		eclipseStatusSection.setLayoutData(eclipseStatusSectionData);
		Composite eclipseStatusGroup = widgetFactory.createComposite(eclipseStatusSection);
		GridLayout eclipseStatusGroupLayout = new GridLayout();
		eclipseStatusGroupLayout.numColumns = 3;
		eclipseStatusGroup.setLayout(eclipseStatusGroupLayout);
		eclipseStatusSection.setClient(eclipseStatusGroup);
		return eclipseStatusGroup;
	}

	
	protected Composite createEclipseCommiterCheckbox(FormToolkit widgetFactory, Composite parent) {
		eclipseCommiter = widgetFactory.createButton(parent, ConferenceMessages.PersonPropertiesEditionPart_EclipseCommiterLabel, SWT.CHECK);
		eclipseCommiter.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PersonPropertiesEditionPartForm.this, ConferenceViewsRepository.Person.EclipseStatus.eclipseCommiter, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(eclipseCommiter.getSelection())));
			}

		});
		GridData eclipseCommiterData = new GridData(GridData.FILL_HORIZONTAL);
		eclipseCommiterData.horizontalSpan = 2;
		eclipseCommiter.setLayoutData(eclipseCommiterData);
		EditingUtils.setID(eclipseCommiter, ConferenceViewsRepository.Person.EclipseStatus.eclipseCommiter);
		EditingUtils.setEEFtype(eclipseCommiter, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ConferenceViewsRepository.Person.EclipseStatus.eclipseCommiter, ConferenceViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createIsRegisteredCheckbox(FormToolkit widgetFactory, Composite parent) {
		isRegistered = widgetFactory.createButton(parent, ConferenceMessages.PersonPropertiesEditionPart_IsRegisteredLabel, SWT.CHECK);
		isRegistered.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PersonPropertiesEditionPartForm.this, ConferenceViewsRepository.Person.EclipseStatus.isRegistered, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isRegistered.getSelection())));
			}

		});
		GridData isRegisteredData = new GridData(GridData.FILL_HORIZONTAL);
		isRegisteredData.horizontalSpan = 2;
		isRegistered.setLayoutData(isRegisteredData);
		EditingUtils.setID(isRegistered, ConferenceViewsRepository.Person.EclipseStatus.isRegistered);
		EditingUtils.setEEFtype(isRegistered, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ConferenceViewsRepository.Person.EclipseStatus.isRegistered, ConferenceViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see org.eclipse.emf.samples.conference.parts.PersonPropertiesEditionPart#getFirstname()
	 * 
	 */
	public String getFirstname() {
		return firstname.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.PersonPropertiesEditionPart#setFirstname(String newValue)
	 * 
	 */
	public void setFirstname(String newValue) {
		if (newValue != null) {
			firstname.setText(newValue);
		} else {
			firstname.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.PersonPropertiesEditionPart#getLastname()
	 * 
	 */
	public String getLastname() {
		return lastname.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.PersonPropertiesEditionPart#setLastname(String newValue)
	 * 
	 */
	public void setLastname(String newValue) {
		if (newValue != null) {
			lastname.setText(newValue);
		} else {
			lastname.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.PersonPropertiesEditionPart#getAge()
	 * 
	 */
	public String getAge() {
		return age.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.PersonPropertiesEditionPart#setAge(String newValue)
	 * 
	 */
	public void setAge(String newValue) {
		if (newValue != null) {
			age.setText(newValue);
		} else {
			age.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.PersonPropertiesEditionPart#getGender()
	 * 
	 */
	public Enumerator getGender() {
		Enumerator selection = (Enumerator) ((StructuredSelection) gender.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.PersonPropertiesEditionPart#initGender(Object input, Enumerator current)
	 */
	public void initGender(Object input, Enumerator current) {
		gender.setInput(input);
		gender.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.PersonPropertiesEditionPart#setGender(Enumerator newValue)
	 * 
	 */
	public void setGender(Enumerator newValue) {
		gender.modelUpdating(new StructuredSelection(newValue));
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.PersonPropertiesEditionPart#getEclipseCommiter()
	 * 
	 */
	public Boolean getEclipseCommiter() {
		return Boolean.valueOf(eclipseCommiter.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.PersonPropertiesEditionPart#setEclipseCommiter(Boolean newValue)
	 * 
	 */
	public void setEclipseCommiter(Boolean newValue) {
		if (newValue != null) {
			eclipseCommiter.setSelection(newValue.booleanValue());
		} else {
			eclipseCommiter.setSelection(false);
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.PersonPropertiesEditionPart#getIsRegistered()
	 * 
	 */
	public Boolean getIsRegistered() {
		return Boolean.valueOf(isRegistered.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.PersonPropertiesEditionPart#setIsRegistered(Boolean newValue)
	 * 
	 */
	public void setIsRegistered(Boolean newValue) {
		if (newValue != null) {
			isRegistered.setSelection(newValue.booleanValue());
		} else {
			isRegistered.setSelection(false);
		}
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ConferenceMessages.Person_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
