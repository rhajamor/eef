/**
 *  Copyright (c) 2008 - 2010 Obeo.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *      Obeo - initial API and implementation
 *
 */
package org.eclipse.emf.eef.mapping.parts.impl;

// Start of user code for imports

import org.eclipse.emf.eef.mapping.parts.FilterPropertiesPropertiesEditionPart;
import org.eclipse.emf.eef.mapping.parts.MappingViewsRepository;
import org.eclipse.emf.eef.mapping.providers.MappingMessages;
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
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class FilterPropertiesPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, FilterPropertiesPropertiesEditionPart {

	protected Text name;
	protected Button mandatory;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public FilterPropertiesPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence filterPropertiesStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep filterProperties_Step = filterPropertiesStep.addStep(MappingViewsRepository.FilterProperties.FilterProperties_.class);
		filterProperties_Step.addStep(MappingViewsRepository.FilterProperties.FilterProperties_.name);
		filterProperties_Step.addStep(MappingViewsRepository.FilterProperties.FilterProperties_.mandatory);
		
		
		composer = new PartComposer(filterPropertiesStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == MappingViewsRepository.FilterProperties.FilterProperties_.class) {
					return createFilterPropertiesGroup(parent);
				}
				if (key == MappingViewsRepository.FilterProperties.FilterProperties_.name) {
					return createNameText(parent);
				}
				if (key == MappingViewsRepository.FilterProperties.FilterProperties_.mandatory) {
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
	protected Composite createFilterPropertiesGroup(Composite parent) {
		Group filterPropertiesGroup = new Group(parent, SWT.NONE);
		filterPropertiesGroup.setText(MappingMessages.FilterPropertiesPropertiesEditionPart_FilterPropertiesGroupLabel);
		GridData filterPropertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		filterPropertiesGroupData.horizontalSpan = 3;
		filterPropertiesGroup.setLayoutData(filterPropertiesGroupData);
		GridLayout filterPropertiesGroupLayout = new GridLayout();
		filterPropertiesGroupLayout.numColumns = 3;
		filterPropertiesGroup.setLayout(filterPropertiesGroupLayout);
		return filterPropertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, MappingMessages.FilterPropertiesPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(MappingViewsRepository.FilterProperties.FilterProperties_.name, MappingViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FilterPropertiesPropertiesEditionPartImpl.this, MappingViewsRepository.FilterProperties.FilterProperties_.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FilterPropertiesPropertiesEditionPartImpl.this, MappingViewsRepository.FilterProperties.FilterProperties_.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, MappingViewsRepository.FilterProperties.FilterProperties_.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(MappingViewsRepository.FilterProperties.FilterProperties_.name, MappingViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createMandatoryCheckbox(Composite parent) {
		mandatory = new Button(parent, SWT.CHECK);
		mandatory.setText(MappingMessages.FilterPropertiesPropertiesEditionPart_MandatoryLabel);
		mandatory.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FilterPropertiesPropertiesEditionPartImpl.this, MappingViewsRepository.FilterProperties.FilterProperties_.mandatory, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(mandatory.getSelection())));
			}

		});
		GridData mandatoryData = new GridData(GridData.FILL_HORIZONTAL);
		mandatoryData.horizontalSpan = 2;
		mandatory.setLayoutData(mandatoryData);
		EditingUtils.setID(mandatory, MappingViewsRepository.FilterProperties.FilterProperties_.mandatory);
		EditingUtils.setEEFtype(mandatory, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(MappingViewsRepository.FilterProperties.FilterProperties_.mandatory, MappingViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see org.eclipse.emf.eef.filters.parts.FilterPropertiesPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.FilterPropertiesPropertiesEditionPart#setName(String newValue)
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
	 * @see org.eclipse.emf.eef.filters.parts.FilterPropertiesPropertiesEditionPart#getMandatory()
	 * 
	 */
	public Boolean getMandatory() {
		return Boolean.valueOf(mandatory.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.FilterPropertiesPropertiesEditionPart#setMandatory(Boolean newValue)
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
		return MappingMessages.FilterProperties_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
