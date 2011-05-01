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
package org.eclipse.emf.eef.eefnrext.parts.forms;

// Start of user code for imports
import org.eclipse.emf.eef.eefnr.references.parts.AbstractSamplePropertiesEditionPart;
import org.eclipse.emf.eef.eefnr.references.parts.ReferencesViewsRepository;
import org.eclipse.emf.eef.eefnrext.parts.CheckBoxExtendedEditorSamplePropertiesEditionPart;
import org.eclipse.emf.eef.eefnrext.parts.EefnrextViewsRepository;
import org.eclipse.emf.eef.eefnrext.providers.EefnrextMessages;
import org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.notify.PropertiesEditingEvent;
import org.eclipse.emf.eef.runtime.notify.impl.PropertiesEditingEventImpl;
import org.eclipse.emf.eef.runtime.parts.FormPropertiesEditingPart;
import org.eclipse.emf.eef.runtime.parts.PropertiesEditingPart;
import org.eclipse.emf.eef.runtime.parts.impl.CompositePropertiesEditingPart;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingPartProvider;
import org.eclipse.emf.eef.runtime.services.PropertiesEditingPartProviderService;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
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
public class CheckBoxExtendedEditorSamplePropertiesEditionPartForm extends CompositePropertiesEditingPart implements FormPropertiesEditingPart, CheckBoxExtendedEditorSamplePropertiesEditionPart {

	protected Button checkboxEditorSample;
	private AbstractSamplePropertiesEditionPart abstractSamplePropertiesEditionPart;



	/**
	 * Default constructor
	 * @param editionComponent the {@link PropertiesEditingComponent} that manage this part
	 * 
	 */
	public CheckBoxExtendedEditorSamplePropertiesEditionPartForm(PropertiesEditingComponent editionComponent) {
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
		CompositionSequence checkBoxExtendedEditorSampleStep = new CompositionSequence();
		checkBoxExtendedEditorSampleStep
			.addStep(EefnrextViewsRepository.CheckBoxExtendedEditorSample.Properties.class)
			.addStep(EefnrextViewsRepository.CheckBoxExtendedEditorSample.Properties.checkboxEditorSample);
		
		checkBoxExtendedEditorSampleStep.addStep(EefnrextViewsRepository.CheckBoxExtendedEditorSample.abstractSampleReference);
		
		composer = new PartComposer(checkBoxExtendedEditorSampleStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EefnrextViewsRepository.CheckBoxExtendedEditorSample.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == EefnrextViewsRepository.CheckBoxExtendedEditorSample.Properties.checkboxEditorSample) {
					return createCheckboxEditorSampleCheckbox(widgetFactory, parent);
				}
				if (key == EefnrextViewsRepository.CheckBoxExtendedEditorSample.abstractSampleReference) {
					return createAbstractSample(widgetFactory, parent);
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
		propertiesSection.setText(EefnrextMessages.CheckBoxExtendedEditorSamplePropertiesEditionPart_PropertiesGroupLabel);
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

	
	protected Composite createCheckboxEditorSampleCheckbox(FormToolkit widgetFactory, Composite parent) {
		checkboxEditorSample = widgetFactory.createButton(parent, EefnrextMessages.CheckBoxExtendedEditorSamplePropertiesEditionPart_CheckboxEditorSampleLabel, SWT.CHECK);
		checkboxEditorSample.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditingComponent != null)
					propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(CheckBoxExtendedEditorSamplePropertiesEditionPartForm.this, EefnrextViewsRepository.CheckBoxExtendedEditorSample.Properties.checkboxEditorSample, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, new Boolean(checkboxEditorSample.getSelection())));
			}

		});
		GridData checkboxEditorSampleData = new GridData(GridData.FILL_HORIZONTAL);
		checkboxEditorSampleData.horizontalSpan = 2;
		checkboxEditorSample.setLayoutData(checkboxEditorSampleData);
		EditingUtils.setID(checkboxEditorSample, EefnrextViewsRepository.CheckBoxExtendedEditorSample.Properties.checkboxEditorSample);
		EditingUtils.setEEFtype(checkboxEditorSample, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditingComponent.getHelpContent(EefnrextViewsRepository.CheckBoxExtendedEditorSample.Properties.checkboxEditorSample, EefnrextViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	protected Composite createAbstractSample(FormToolkit widgetFactory, Composite container) {
		PropertiesEditingPartProvider provider = PropertiesEditingPartProviderService.getInstance().getProvider(ReferencesViewsRepository.class);
		abstractSamplePropertiesEditionPart = (AbstractSamplePropertiesEditionPart)provider.getPropertiesEditingPart(ReferencesViewsRepository.AbstractSample.class, ReferencesViewsRepository.FORM_KIND, propertiesEditingComponent);
		((FormPropertiesEditingPart)abstractSamplePropertiesEditionPart).createControls(widgetFactory, container);
		return container;
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
	 * @see org.eclipse.emf.eef.eefnrext.parts.CheckBoxExtendedEditorSamplePropertiesEditionPart#getCheckboxEditorSample()
	 * 
	 */
	public Boolean getCheckboxEditorSample() {
		return Boolean.valueOf(checkboxEditorSample.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnrext.parts.CheckBoxExtendedEditorSamplePropertiesEditionPart#setCheckboxEditorSample(Boolean newValue)
	 * 
	 */
	public void setCheckboxEditorSample(Boolean newValue) {
		if (newValue != null) {
			checkboxEditorSample.setSelection(newValue.booleanValue());
		} else {
			checkboxEditorSample.setSelection(false);
		}
	}

/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnrext.parts.CheckBoxExtendedEditorSamplePropertiesEditionPart#getAbstractSampleReferencedView()
	 * 
	 */
		public PropertiesEditingPart getAbstractSampleReferencedView() {
			return (PropertiesEditingPart) abstractSamplePropertiesEditionPart;
		}
	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnrext.parts.CheckBoxExtendedEditorSamplePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return abstractSamplePropertiesEditionPart.getName();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnrext.parts.CheckBoxExtendedEditorSamplePropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		abstractSamplePropertiesEditionPart.setName(newValue);
	}





	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.parts.PropertiesEditingPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EefnrextMessages.CheckBoxExtendedEditorSample_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
