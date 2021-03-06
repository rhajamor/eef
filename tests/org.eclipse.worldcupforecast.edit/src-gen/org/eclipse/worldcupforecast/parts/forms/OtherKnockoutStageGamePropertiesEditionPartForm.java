/*******************************************************************************
 * Copyright (c) 2008, 2010 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
/**
 * Generated with Acceleo
 */
package org.eclipse.worldcupforecast.parts.forms;

// Start of user code for imports
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
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
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

import org.eclipse.worldcupforecast.parts.OtherKnockoutStageGamePropertiesEditionPart;
import org.eclipse.worldcupforecast.parts.WorldcupforecastViewsRepository;
import org.eclipse.worldcupforecast.providers.WorldcupforecastMessages;


// End of user code

/**
 * 
 * 
 */
public class OtherKnockoutStageGamePropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, OtherKnockoutStageGamePropertiesEditionPart {

	protected Text hours;
	protected Text minutes;
	protected Text coefficient;
	protected EObjectFlatComboViewer team1WinnerOfMatch;
	protected EObjectFlatComboViewer team2WinnerOfMatch;
	protected EObjectFlatComboViewer team1;
	protected EObjectFlatComboViewer team2;
	protected EMFComboViewer type;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public OtherKnockoutStageGamePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		createPropertiesGroup(widgetFactory, view);

		// Start of user code for additional ui definition
		
		// End of user code
	}
	/**
	 * 
	 */
	protected void createPropertiesGroup(FormToolkit widgetFactory, final Composite view) {
		Section propertiesSection = widgetFactory.createSection(view, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		propertiesSection.setText(WorldcupforecastMessages.OtherKnockoutStageGamePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		createHoursText(widgetFactory, propertiesGroup);
		createMinutesText(widgetFactory, propertiesGroup);
		createCoefficientText(widgetFactory, propertiesGroup);
		createTeam1WinnerOfMatchFlatComboViewer(propertiesGroup, widgetFactory);
		createTeam2WinnerOfMatchFlatComboViewer(propertiesGroup, widgetFactory);
		createTeam1FlatComboViewer(propertiesGroup, widgetFactory);
		createTeam2FlatComboViewer(propertiesGroup, widgetFactory);
		createTypeEMFComboViewer(widgetFactory, propertiesGroup);
		propertiesSection.setClient(propertiesGroup);
	}

	
	protected void createHoursText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, WorldcupforecastMessages.OtherKnockoutStageGamePropertiesEditionPart_HoursLabel, propertiesEditionComponent.isRequired(WorldcupforecastViewsRepository.OtherKnockoutStageGame.hours, WorldcupforecastViewsRepository.FORM_KIND));
		hours = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		hours.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData hoursData = new GridData(GridData.FILL_HORIZONTAL);
		hours.setLayoutData(hoursData);
		hours.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherKnockoutStageGamePropertiesEditionPartForm.this, WorldcupforecastViewsRepository.OtherKnockoutStageGame.hours, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, hours.getText()));
			}
		});
		hours.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherKnockoutStageGamePropertiesEditionPartForm.this, WorldcupforecastViewsRepository.OtherKnockoutStageGame.hours, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, hours.getText()));
				}
			}
		});
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(WorldcupforecastViewsRepository.OtherKnockoutStageGame.hours, WorldcupforecastViewsRepository.FORM_KIND), null); //$NON-NLS-1$
	}

	
	protected void createMinutesText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, WorldcupforecastMessages.OtherKnockoutStageGamePropertiesEditionPart_MinutesLabel, propertiesEditionComponent.isRequired(WorldcupforecastViewsRepository.OtherKnockoutStageGame.minutes, WorldcupforecastViewsRepository.FORM_KIND));
		minutes = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		minutes.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData minutesData = new GridData(GridData.FILL_HORIZONTAL);
		minutes.setLayoutData(minutesData);
		minutes.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherKnockoutStageGamePropertiesEditionPartForm.this, WorldcupforecastViewsRepository.OtherKnockoutStageGame.minutes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, minutes.getText()));
			}
		});
		minutes.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherKnockoutStageGamePropertiesEditionPartForm.this, WorldcupforecastViewsRepository.OtherKnockoutStageGame.minutes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, minutes.getText()));
				}
			}
		});
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(WorldcupforecastViewsRepository.OtherKnockoutStageGame.minutes, WorldcupforecastViewsRepository.FORM_KIND), null); //$NON-NLS-1$
	}

	
	protected void createCoefficientText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, WorldcupforecastMessages.OtherKnockoutStageGamePropertiesEditionPart_CoefficientLabel, propertiesEditionComponent.isRequired(WorldcupforecastViewsRepository.OtherKnockoutStageGame.coefficient, WorldcupforecastViewsRepository.FORM_KIND));
		coefficient = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		coefficient.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData coefficientData = new GridData(GridData.FILL_HORIZONTAL);
		coefficient.setLayoutData(coefficientData);
		coefficient.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherKnockoutStageGamePropertiesEditionPartForm.this, WorldcupforecastViewsRepository.OtherKnockoutStageGame.coefficient, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, coefficient.getText()));
			}
		});
		coefficient.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherKnockoutStageGamePropertiesEditionPartForm.this, WorldcupforecastViewsRepository.OtherKnockoutStageGame.coefficient, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, coefficient.getText()));
				}
			}
		});
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(WorldcupforecastViewsRepository.OtherKnockoutStageGame.coefficient, WorldcupforecastViewsRepository.FORM_KIND), null); //$NON-NLS-1$
	}

	/**
	 * @param propertiesGroup
	 * 
	 */
	protected void createTeam1WinnerOfMatchFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, WorldcupforecastMessages.OtherKnockoutStageGamePropertiesEditionPart_Team1WinnerOfMatchLabel, propertiesEditionComponent.isRequired(WorldcupforecastViewsRepository.OtherKnockoutStageGame.team1WinnerOfMatch, WorldcupforecastViewsRepository.FORM_KIND));
		team1WinnerOfMatch = new EObjectFlatComboViewer(parent, false);
		team1WinnerOfMatch.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData team1WinnerOfMatchData = new GridData(GridData.FILL_HORIZONTAL);
		team1WinnerOfMatch.setLayoutData(team1WinnerOfMatchData);
		team1WinnerOfMatch.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherKnockoutStageGamePropertiesEditionPartForm.this, WorldcupforecastViewsRepository.OtherKnockoutStageGame.team1WinnerOfMatch, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getTeam1WinnerOfMatch()));
			}

		});
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(WorldcupforecastViewsRepository.OtherKnockoutStageGame.team1WinnerOfMatch, WorldcupforecastViewsRepository.FORM_KIND), null); //$NON-NLS-1$
	}

	/**
	 * @param propertiesGroup
	 * 
	 */
	protected void createTeam2WinnerOfMatchFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, WorldcupforecastMessages.OtherKnockoutStageGamePropertiesEditionPart_Team2WinnerOfMatchLabel, propertiesEditionComponent.isRequired(WorldcupforecastViewsRepository.OtherKnockoutStageGame.team2WinnerOfMatch, WorldcupforecastViewsRepository.FORM_KIND));
		team2WinnerOfMatch = new EObjectFlatComboViewer(parent, false);
		team2WinnerOfMatch.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData team2WinnerOfMatchData = new GridData(GridData.FILL_HORIZONTAL);
		team2WinnerOfMatch.setLayoutData(team2WinnerOfMatchData);
		team2WinnerOfMatch.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherKnockoutStageGamePropertiesEditionPartForm.this, WorldcupforecastViewsRepository.OtherKnockoutStageGame.team2WinnerOfMatch, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getTeam2WinnerOfMatch()));
			}

		});
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(WorldcupforecastViewsRepository.OtherKnockoutStageGame.team2WinnerOfMatch, WorldcupforecastViewsRepository.FORM_KIND), null); //$NON-NLS-1$
	}

	/**
	 * @param propertiesGroup
	 * 
	 */
	protected void createTeam1FlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, WorldcupforecastMessages.OtherKnockoutStageGamePropertiesEditionPart_Team1Label, propertiesEditionComponent.isRequired(WorldcupforecastViewsRepository.OtherKnockoutStageGame.team1, WorldcupforecastViewsRepository.FORM_KIND));
		team1 = new EObjectFlatComboViewer(parent, false);
		team1.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		team1.setEnabled(false);
		team1.setToolTipText(WorldcupforecastMessages.OtherKnockoutStageGame_ReadOnly);
		GridData team1Data = new GridData(GridData.FILL_HORIZONTAL);
		team1.setLayoutData(team1Data);
		team1.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherKnockoutStageGamePropertiesEditionPartForm.this, WorldcupforecastViewsRepository.OtherKnockoutStageGame.team1, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getTeam1()));
			}

		});
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(WorldcupforecastViewsRepository.OtherKnockoutStageGame.team1, WorldcupforecastViewsRepository.FORM_KIND), null); //$NON-NLS-1$
	}

	/**
	 * @param propertiesGroup
	 * 
	 */
	protected void createTeam2FlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, WorldcupforecastMessages.OtherKnockoutStageGamePropertiesEditionPart_Team2Label, propertiesEditionComponent.isRequired(WorldcupforecastViewsRepository.OtherKnockoutStageGame.team2, WorldcupforecastViewsRepository.FORM_KIND));
		team2 = new EObjectFlatComboViewer(parent, false);
		team2.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		team2.setEnabled(false);
		team2.setToolTipText(WorldcupforecastMessages.OtherKnockoutStageGame_ReadOnly);
		GridData team2Data = new GridData(GridData.FILL_HORIZONTAL);
		team2.setLayoutData(team2Data);
		team2.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherKnockoutStageGamePropertiesEditionPartForm.this, WorldcupforecastViewsRepository.OtherKnockoutStageGame.team2, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getTeam2()));
			}

		});
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(WorldcupforecastViewsRepository.OtherKnockoutStageGame.team2, WorldcupforecastViewsRepository.FORM_KIND), null); //$NON-NLS-1$
	}

	
	protected void createTypeEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, WorldcupforecastMessages.OtherKnockoutStageGamePropertiesEditionPart_TypeLabel, propertiesEditionComponent.isRequired(WorldcupforecastViewsRepository.OtherKnockoutStageGame.type, WorldcupforecastViewsRepository.FORM_KIND));
		type = new EMFComboViewer(parent);
		type.setContentProvider(new ArrayContentProvider());
		type.setLabelProvider(new AdapterFactoryLabelProvider(new EcoreAdapterFactory()));
		GridData typeData = new GridData(GridData.FILL_HORIZONTAL);
		type.getCombo().setLayoutData(typeData);
		type.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherKnockoutStageGamePropertiesEditionPartForm.this, WorldcupforecastViewsRepository.OtherKnockoutStageGame.type, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getType()));
			}

		});
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(WorldcupforecastViewsRepository.OtherKnockoutStageGame.type, WorldcupforecastViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see org.eclipse.worldcupforecast.parts.OtherKnockoutStageGamePropertiesEditionPart#getHours()
	 * 
	 */
	public String getHours() {
		return hours.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.worldcupforecast.parts.OtherKnockoutStageGamePropertiesEditionPart#setHours(String newValue)
	 * 
	 */
	public void setHours(String newValue) {
		if (newValue != null) {
			hours.setText(newValue);
		} else {
			hours.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.worldcupforecast.parts.OtherKnockoutStageGamePropertiesEditionPart#getMinutes()
	 * 
	 */
	public String getMinutes() {
		return minutes.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.worldcupforecast.parts.OtherKnockoutStageGamePropertiesEditionPart#setMinutes(String newValue)
	 * 
	 */
	public void setMinutes(String newValue) {
		if (newValue != null) {
			minutes.setText(newValue);
		} else {
			minutes.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.worldcupforecast.parts.OtherKnockoutStageGamePropertiesEditionPart#getCoefficient()
	 * 
	 */
	public String getCoefficient() {
		return coefficient.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.worldcupforecast.parts.OtherKnockoutStageGamePropertiesEditionPart#setCoefficient(String newValue)
	 * 
	 */
	public void setCoefficient(String newValue) {
		if (newValue != null) {
			coefficient.setText(newValue);
		} else {
			coefficient.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.worldcupforecast.parts.OtherKnockoutStageGamePropertiesEditionPart#getTeam1WinnerOfMatch()
	 * 
	 */
	public EObject getTeam1WinnerOfMatch() {
		if (team1WinnerOfMatch.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) team1WinnerOfMatch.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.worldcupforecast.parts.OtherKnockoutStageGamePropertiesEditionPart#initTeam1WinnerOfMatch(ResourceSet allResources, EObject current)
	 */
	public void initTeam1WinnerOfMatch(ResourceSet allResources, EObject current) {
		team1WinnerOfMatch.setInput(allResources);
		if (current != null) {
			team1WinnerOfMatch.setSelection(new StructuredSelection(current));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.worldcupforecast.parts.OtherKnockoutStageGamePropertiesEditionPart#setTeam1WinnerOfMatch(EObject newValue)
	 * 
	 */
	public void setTeam1WinnerOfMatch(EObject newValue) {
		if (newValue != null) {
			team1WinnerOfMatch.setSelection(new StructuredSelection(newValue));
		} else {
			team1WinnerOfMatch.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.worldcupforecast.parts.OtherKnockoutStageGamePropertiesEditionPart#setTeam1WinnerOfMatchButtonMode(ButtonsModeEnum newValue)
	 */
	public void setTeam1WinnerOfMatchButtonMode(ButtonsModeEnum newValue) {
		team1WinnerOfMatch.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.worldcupforecast.parts.OtherKnockoutStageGamePropertiesEditionPart#addFilterTeam1WinnerOfMatch(ViewerFilter filter)
	 * 
	 */
	public void addFilterToTeam1WinnerOfMatch(ViewerFilter filter) {
		team1WinnerOfMatch.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.worldcupforecast.parts.OtherKnockoutStageGamePropertiesEditionPart#addBusinessFilterTeam1WinnerOfMatch(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToTeam1WinnerOfMatch(ViewerFilter filter) {
		team1WinnerOfMatch.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.worldcupforecast.parts.OtherKnockoutStageGamePropertiesEditionPart#getTeam2WinnerOfMatch()
	 * 
	 */
	public EObject getTeam2WinnerOfMatch() {
		if (team2WinnerOfMatch.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) team2WinnerOfMatch.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.worldcupforecast.parts.OtherKnockoutStageGamePropertiesEditionPart#initTeam2WinnerOfMatch(ResourceSet allResources, EObject current)
	 */
	public void initTeam2WinnerOfMatch(ResourceSet allResources, EObject current) {
		team2WinnerOfMatch.setInput(allResources);
		if (current != null) {
			team2WinnerOfMatch.setSelection(new StructuredSelection(current));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.worldcupforecast.parts.OtherKnockoutStageGamePropertiesEditionPart#setTeam2WinnerOfMatch(EObject newValue)
	 * 
	 */
	public void setTeam2WinnerOfMatch(EObject newValue) {
		if (newValue != null) {
			team2WinnerOfMatch.setSelection(new StructuredSelection(newValue));
		} else {
			team2WinnerOfMatch.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.worldcupforecast.parts.OtherKnockoutStageGamePropertiesEditionPart#setTeam2WinnerOfMatchButtonMode(ButtonsModeEnum newValue)
	 */
	public void setTeam2WinnerOfMatchButtonMode(ButtonsModeEnum newValue) {
		team2WinnerOfMatch.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.worldcupforecast.parts.OtherKnockoutStageGamePropertiesEditionPart#addFilterTeam2WinnerOfMatch(ViewerFilter filter)
	 * 
	 */
	public void addFilterToTeam2WinnerOfMatch(ViewerFilter filter) {
		team2WinnerOfMatch.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.worldcupforecast.parts.OtherKnockoutStageGamePropertiesEditionPart#addBusinessFilterTeam2WinnerOfMatch(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToTeam2WinnerOfMatch(ViewerFilter filter) {
		team2WinnerOfMatch.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.worldcupforecast.parts.OtherKnockoutStageGamePropertiesEditionPart#getTeam1()
	 * 
	 */
	public EObject getTeam1() {
		if (team1.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) team1.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.worldcupforecast.parts.OtherKnockoutStageGamePropertiesEditionPart#initTeam1(ResourceSet allResources, EObject current)
	 */
	public void initTeam1(ResourceSet allResources, EObject current) {
		team1.setInput(allResources);
		if (current != null) {
			team1.setSelection(new StructuredSelection(current));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.worldcupforecast.parts.OtherKnockoutStageGamePropertiesEditionPart#setTeam1(EObject newValue)
	 * 
	 */
	public void setTeam1(EObject newValue) {
		if (newValue != null) {
			team1.setSelection(new StructuredSelection(newValue));
		} else {
			team1.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.worldcupforecast.parts.OtherKnockoutStageGamePropertiesEditionPart#setTeam1ButtonMode(ButtonsModeEnum newValue)
	 */
	public void setTeam1ButtonMode(ButtonsModeEnum newValue) {
		team1.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.worldcupforecast.parts.OtherKnockoutStageGamePropertiesEditionPart#addFilterTeam1(ViewerFilter filter)
	 * 
	 */
	public void addFilterToTeam1(ViewerFilter filter) {
		team1.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.worldcupforecast.parts.OtherKnockoutStageGamePropertiesEditionPart#addBusinessFilterTeam1(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToTeam1(ViewerFilter filter) {
		team1.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.worldcupforecast.parts.OtherKnockoutStageGamePropertiesEditionPart#getTeam2()
	 * 
	 */
	public EObject getTeam2() {
		if (team2.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) team2.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.worldcupforecast.parts.OtherKnockoutStageGamePropertiesEditionPart#initTeam2(ResourceSet allResources, EObject current)
	 */
	public void initTeam2(ResourceSet allResources, EObject current) {
		team2.setInput(allResources);
		if (current != null) {
			team2.setSelection(new StructuredSelection(current));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.worldcupforecast.parts.OtherKnockoutStageGamePropertiesEditionPart#setTeam2(EObject newValue)
	 * 
	 */
	public void setTeam2(EObject newValue) {
		if (newValue != null) {
			team2.setSelection(new StructuredSelection(newValue));
		} else {
			team2.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.worldcupforecast.parts.OtherKnockoutStageGamePropertiesEditionPart#setTeam2ButtonMode(ButtonsModeEnum newValue)
	 */
	public void setTeam2ButtonMode(ButtonsModeEnum newValue) {
		team2.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.worldcupforecast.parts.OtherKnockoutStageGamePropertiesEditionPart#addFilterTeam2(ViewerFilter filter)
	 * 
	 */
	public void addFilterToTeam2(ViewerFilter filter) {
		team2.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.worldcupforecast.parts.OtherKnockoutStageGamePropertiesEditionPart#addBusinessFilterTeam2(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToTeam2(ViewerFilter filter) {
		team2.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.worldcupforecast.parts.OtherKnockoutStageGamePropertiesEditionPart#getType()
	 * 
	 */
	public Enumerator getType() {
		EEnumLiteral selection = (EEnumLiteral) ((StructuredSelection) type.getSelection()).getFirstElement();
		return selection.getInstance();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.worldcupforecast.parts.OtherKnockoutStageGamePropertiesEditionPart#initType(EEnum eenum, Enumerator current)
	 */
	public void initType(EEnum eenum, Enumerator current) {
		type.setInput(eenum.getELiterals());
		type.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.worldcupforecast.parts.OtherKnockoutStageGamePropertiesEditionPart#setType(Enumerator newValue)
	 * 
	 */
	public void setType(Enumerator newValue) {
		type.modelUpdating(new StructuredSelection(newValue));
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return WorldcupforecastMessages.OtherKnockoutStageGame_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
