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
package org.eclipse.emf.samples.conference.parts.impl;

// Start of user code for imports
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.util.EcoreAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.notify.PropertiesEditingEvent;
import org.eclipse.emf.eef.runtime.notify.impl.PropertiesEditingEventImpl;
import org.eclipse.emf.eef.runtime.parts.SWTPropertiesEditingPart;
import org.eclipse.emf.eef.runtime.parts.impl.CompositePropertiesEditingPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
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
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;


// End of user code

/**
 * @author <a href="mailto:stephane.bouchet@obeo.fr">Stephane Bouchet</a>
 * 
 */
public class PersonPropertiesEditionPartImpl extends CompositePropertiesEditingPart implements SWTPropertiesEditingPart, PersonPropertiesEditionPart {

	protected Text firstname;
	protected Text lastname;
	protected Text age;
	protected EMFComboViewer gender;
	protected Button eclipseCommiter;
	protected Button isRegistered;



	/**
	 * Default constructor
	 * @param editionComponent the {@link PropertiesEditingComponent} that manage this part
	 * 
	 */
	public PersonPropertiesEditionPartImpl(PropertiesEditingComponent editionComponent) {
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
		CompositionSequence personStep = new BindingCompositionSequence(propertiesEditingComponent);
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
					return createIdentityGroup(parent);
				}
				if (key == ConferenceViewsRepository.Person.Identity.firstname) {
					return createFirstnameText(parent);
				}
				if (key == ConferenceViewsRepository.Person.Identity.lastname) {
					return createLastnameText(parent);
				}
				if (key == ConferenceViewsRepository.Person.Identity.age) {
					return createAgeText(parent);
				}
				if (key == ConferenceViewsRepository.Person.Identity.gender) {
					return createGenderEMFComboViewer(parent);
				}
				if (key == ConferenceViewsRepository.Person.EclipseStatus.class) {
					return createEclipseStatusGroup(parent);
				}
				if (key == ConferenceViewsRepository.Person.EclipseStatus.eclipseCommiter) {
					return createEclipseCommiterCheckbox(parent);
				}
				if (key == ConferenceViewsRepository.Person.EclipseStatus.isRegistered) {
					return createIsRegisteredCheckbox(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createIdentityGroup(Composite parent) {
		Group identityGroup = new Group(parent, SWT.NONE);
		identityGroup.setText(ConferenceMessages.PersonPropertiesEditionPart_IdentityGroupLabel);
		GridData identityGroupData = new GridData(GridData.FILL_HORIZONTAL);
		identityGroupData.horizontalSpan = 3;
		identityGroup.setLayoutData(identityGroupData);
		GridLayout identityGroupLayout = new GridLayout();
		identityGroupLayout.numColumns = 3;
		identityGroup.setLayout(identityGroupLayout);
		return identityGroup;
	}

	
	protected Composite createFirstnameText(Composite parent) {
		SWTUtils.createPartLabel(parent, ConferenceMessages.PersonPropertiesEditionPart_FirstnameLabel, propertiesEditingComponent.isRequired(ConferenceViewsRepository.Person.Identity.firstname, ConferenceViewsRepository.SWT_KIND));
		firstname = new Text(parent, SWT.BORDER);
		GridData firstnameData = new GridData(GridData.FILL_HORIZONTAL);
		firstname.setLayoutData(firstnameData);
		firstname.addFocusListener(new FocusAdapter() {

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
					propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(PersonPropertiesEditionPartImpl.this, ConferenceViewsRepository.Person.Identity.firstname, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, firstname.getText()));
			}

		});
		firstname.addKeyListener(new KeyAdapter() {

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
						propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(PersonPropertiesEditionPartImpl.this, ConferenceViewsRepository.Person.Identity.firstname, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, firstname.getText()));
				}
			}

		});
		EditingUtils.setID(firstname, ConferenceViewsRepository.Person.Identity.firstname);
		EditingUtils.setEEFtype(firstname, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditingComponent.getHelpContent(ConferenceViewsRepository.Person.Identity.firstname, ConferenceViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createLastnameText(Composite parent) {
		SWTUtils.createPartLabel(parent, ConferenceMessages.PersonPropertiesEditionPart_LastnameLabel, propertiesEditingComponent.isRequired(ConferenceViewsRepository.Person.Identity.lastname, ConferenceViewsRepository.SWT_KIND));
		lastname = new Text(parent, SWT.BORDER);
		GridData lastnameData = new GridData(GridData.FILL_HORIZONTAL);
		lastname.setLayoutData(lastnameData);
		lastname.addFocusListener(new FocusAdapter() {

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
					propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(PersonPropertiesEditionPartImpl.this, ConferenceViewsRepository.Person.Identity.lastname, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, lastname.getText()));
			}

		});
		lastname.addKeyListener(new KeyAdapter() {

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
						propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(PersonPropertiesEditionPartImpl.this, ConferenceViewsRepository.Person.Identity.lastname, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, lastname.getText()));
				}
			}

		});
		EditingUtils.setID(lastname, ConferenceViewsRepository.Person.Identity.lastname);
		EditingUtils.setEEFtype(lastname, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditingComponent.getHelpContent(ConferenceViewsRepository.Person.Identity.lastname, ConferenceViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createAgeText(Composite parent) {
		SWTUtils.createPartLabel(parent, ConferenceMessages.PersonPropertiesEditionPart_AgeLabel, propertiesEditingComponent.isRequired(ConferenceViewsRepository.Person.Identity.age, ConferenceViewsRepository.SWT_KIND));
		age = new Text(parent, SWT.BORDER);
		GridData ageData = new GridData(GridData.FILL_HORIZONTAL);
		age.setLayoutData(ageData);
		age.addFocusListener(new FocusAdapter() {

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
					propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(PersonPropertiesEditionPartImpl.this, ConferenceViewsRepository.Person.Identity.age, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, age.getText()));
			}

		});
		age.addKeyListener(new KeyAdapter() {

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
						propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(PersonPropertiesEditionPartImpl.this, ConferenceViewsRepository.Person.Identity.age, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, age.getText()));
				}
			}

		});
		EditingUtils.setID(age, ConferenceViewsRepository.Person.Identity.age);
		EditingUtils.setEEFtype(age, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditingComponent.getHelpContent(ConferenceViewsRepository.Person.Identity.age, ConferenceViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createGenderEMFComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, ConferenceMessages.PersonPropertiesEditionPart_GenderLabel, propertiesEditingComponent.isRequired(ConferenceViewsRepository.Person.Identity.gender, ConferenceViewsRepository.SWT_KIND));
		gender = new EMFComboViewer(parent);
		gender.setContentProvider(new ArrayContentProvider());
		gender.setLabelProvider(new AdapterFactoryLabelProvider(new EcoreAdapterFactory()));
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
				if (propertiesEditingComponent != null)
					propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(PersonPropertiesEditionPartImpl.this, ConferenceViewsRepository.Person.Identity.gender, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, getGender()));
			}

		});
		gender.setID(ConferenceViewsRepository.Person.Identity.gender);
		SWTUtils.createHelpButton(parent, propertiesEditingComponent.getHelpContent(ConferenceViewsRepository.Person.Identity.gender, ConferenceViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createEclipseStatusGroup(Composite parent) {
		Group eclipseStatusGroup = new Group(parent, SWT.NONE);
		eclipseStatusGroup.setText(ConferenceMessages.PersonPropertiesEditionPart_EclipseStatusGroupLabel);
		GridData eclipseStatusGroupData = new GridData(GridData.FILL_HORIZONTAL);
		eclipseStatusGroupData.horizontalSpan = 3;
		eclipseStatusGroup.setLayoutData(eclipseStatusGroupData);
		GridLayout eclipseStatusGroupLayout = new GridLayout();
		eclipseStatusGroupLayout.numColumns = 3;
		eclipseStatusGroup.setLayout(eclipseStatusGroupLayout);
		return eclipseStatusGroup;
	}

	
	protected Composite createEclipseCommiterCheckbox(Composite parent) {
		eclipseCommiter = new Button(parent, SWT.CHECK);
		eclipseCommiter.setText(ConferenceMessages.PersonPropertiesEditionPart_EclipseCommiterLabel);
		eclipseCommiter.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditingComponent != null)
					propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(PersonPropertiesEditionPartImpl.this, ConferenceViewsRepository.Person.EclipseStatus.eclipseCommiter, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, new Boolean(eclipseCommiter.getSelection())));
			}

		});
		GridData eclipseCommiterData = new GridData(GridData.FILL_HORIZONTAL);
		eclipseCommiterData.horizontalSpan = 2;
		eclipseCommiter.setLayoutData(eclipseCommiterData);
		EditingUtils.setID(eclipseCommiter, ConferenceViewsRepository.Person.EclipseStatus.eclipseCommiter);
		EditingUtils.setEEFtype(eclipseCommiter, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditingComponent.getHelpContent(ConferenceViewsRepository.Person.EclipseStatus.eclipseCommiter, ConferenceViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createIsRegisteredCheckbox(Composite parent) {
		isRegistered = new Button(parent, SWT.CHECK);
		isRegistered.setText(ConferenceMessages.PersonPropertiesEditionPart_IsRegisteredLabel);
		isRegistered.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditingComponent != null)
					propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(PersonPropertiesEditionPartImpl.this, ConferenceViewsRepository.Person.EclipseStatus.isRegistered, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, new Boolean(isRegistered.getSelection())));
			}

		});
		GridData isRegisteredData = new GridData(GridData.FILL_HORIZONTAL);
		isRegisteredData.horizontalSpan = 2;
		isRegistered.setLayoutData(isRegisteredData);
		EditingUtils.setID(isRegistered, ConferenceViewsRepository.Person.EclipseStatus.isRegistered);
		EditingUtils.setEEFtype(isRegistered, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditingComponent.getHelpContent(ConferenceViewsRepository.Person.EclipseStatus.isRegistered, ConferenceViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
		EEnumLiteral selection = (EEnumLiteral) ((StructuredSelection) gender.getSelection()).getFirstElement();
		return selection.getInstance();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.PersonPropertiesEditionPart#initGender(EEnum eenum, Enumerator current)
	 */
	public void initGender(EEnum eenum, Enumerator current) {
		gender.setInput(eenum.getELiterals());
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
	 * @see org.eclipse.emf.eef.runtime.parts.PropertiesEditingPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ConferenceMessages.Person_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
