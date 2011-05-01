/*******************************************************************************
 * Copyright (c) 2009 - 2010 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.eefnr.parts.forms;

// Start of user code for imports
import org.eclipse.emf.eef.eefnr.parts.CheckboxSamplePropertiesEditionPart;
import org.eclipse.emf.eef.eefnr.parts.EefnrViewsRepository;
import org.eclipse.emf.eef.eefnr.providers.EefnrMessages;
import org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.notify.PropertiesEditingEvent;
import org.eclipse.emf.eef.runtime.notify.impl.PropertiesEditingEventImpl;
import org.eclipse.emf.eef.runtime.parts.FormPropertiesEditingPart;
import org.eclipse.emf.eef.runtime.parts.impl.CompositePropertiesEditingPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;


// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class CheckboxSamplePropertiesEditionPartForm extends CompositePropertiesEditingPart implements FormPropertiesEditingPart, CheckboxSamplePropertiesEditionPart {

	protected Button checkboxRequiredProperty;
	protected Button checkboxOptionalProperty;



	/**
	 * Default constructor
	 * @param editionComponent the {@link PropertiesEditingComponent} that manage this part
	 * 
	 */
	public CheckboxSamplePropertiesEditionPartForm(PropertiesEditingComponent editionComponent) {
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
		CompositionSequence checkboxSampleStep = new CompositionSequence();
		CompositionStep propertiesStep = checkboxSampleStep.addStep(EefnrViewsRepository.CheckboxSample.Properties.class);
		propertiesStep.addStep(EefnrViewsRepository.CheckboxSample.Properties.checkboxRequiredProperty);
		propertiesStep.addStep(EefnrViewsRepository.CheckboxSample.Properties.checkboxOptionalProperty);
		
		
		composer = new PartComposer(checkboxSampleStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EefnrViewsRepository.CheckboxSample.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == EefnrViewsRepository.CheckboxSample.Properties.checkboxRequiredProperty) {
					return createCheckboxRequiredPropertyCheckbox(widgetFactory, parent);
				}
				if (key == EefnrViewsRepository.CheckboxSample.Properties.checkboxOptionalProperty) {
					return createCheckboxOptionalPropertyCheckbox(widgetFactory, parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * 
	 */
	protected Composite createPropertiesGroup(FormToolkit widgetFactory, final Composite parent) {
		Section propertiesSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		propertiesSection.setText(EefnrMessages.CheckboxSamplePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		propertiesSection.setClient(propertiesGroup);
		return propertiesGroup;
	}

	
	protected Composite createCheckboxRequiredPropertyCheckbox(FormToolkit widgetFactory, Composite parent) {
		checkboxRequiredProperty = widgetFactory.createButton(parent, EefnrMessages.CheckboxSamplePropertiesEditionPart_CheckboxRequiredPropertyLabel, SWT.CHECK);
		checkboxRequiredProperty.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditingComponent != null)
					propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(CheckboxSamplePropertiesEditionPartForm.this, EefnrViewsRepository.CheckboxSample.Properties.checkboxRequiredProperty, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, new Boolean(checkboxRequiredProperty.getSelection())));
			}

		});
		GridData checkboxRequiredPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		checkboxRequiredPropertyData.horizontalSpan = 2;
		checkboxRequiredProperty.setLayoutData(checkboxRequiredPropertyData);
		EditingUtils.setID(checkboxRequiredProperty, EefnrViewsRepository.CheckboxSample.Properties.checkboxRequiredProperty);
		EditingUtils.setEEFtype(checkboxRequiredProperty, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditingComponent.getHelpContent(EefnrViewsRepository.CheckboxSample.Properties.checkboxRequiredProperty, EefnrViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createCheckboxOptionalPropertyCheckbox(FormToolkit widgetFactory, Composite parent) {
		checkboxOptionalProperty = widgetFactory.createButton(parent, EefnrMessages.CheckboxSamplePropertiesEditionPart_CheckboxOptionalPropertyLabel, SWT.CHECK);
		checkboxOptionalProperty.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditingComponent != null)
					propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(CheckboxSamplePropertiesEditionPartForm.this, EefnrViewsRepository.CheckboxSample.Properties.checkboxOptionalProperty, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, new Boolean(checkboxOptionalProperty.getSelection())));
			}

		});
		GridData checkboxOptionalPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		checkboxOptionalPropertyData.horizontalSpan = 2;
		checkboxOptionalProperty.setLayoutData(checkboxOptionalPropertyData);
		EditingUtils.setID(checkboxOptionalProperty, EefnrViewsRepository.CheckboxSample.Properties.checkboxOptionalProperty);
		EditingUtils.setEEFtype(checkboxOptionalProperty, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditingComponent.getHelpContent(EefnrViewsRepository.CheckboxSample.Properties.checkboxOptionalProperty, EefnrViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see org.eclipse.emf.eef.eefnr.parts.CheckboxSamplePropertiesEditionPart#getCheckboxRequiredProperty()
	 * 
	 */
	public Boolean getCheckboxRequiredProperty() {
		return Boolean.valueOf(checkboxRequiredProperty.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.CheckboxSamplePropertiesEditionPart#setCheckboxRequiredProperty(Boolean newValue)
	 * 
	 */
	public void setCheckboxRequiredProperty(Boolean newValue) {
		if (newValue != null) {
			checkboxRequiredProperty.setSelection(newValue.booleanValue());
		} else {
			checkboxRequiredProperty.setSelection(false);
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.CheckboxSamplePropertiesEditionPart#getCheckboxOptionalProperty()
	 * 
	 */
	public Boolean getCheckboxOptionalProperty() {
		return Boolean.valueOf(checkboxOptionalProperty.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.CheckboxSamplePropertiesEditionPart#setCheckboxOptionalProperty(Boolean newValue)
	 * 
	 */
	public void setCheckboxOptionalProperty(Boolean newValue) {
		if (newValue != null) {
			checkboxOptionalProperty.setSelection(newValue.booleanValue());
		} else {
			checkboxOptionalProperty.setSelection(false);
		}
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.parts.PropertiesEditingPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EefnrMessages.CheckboxSample_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
