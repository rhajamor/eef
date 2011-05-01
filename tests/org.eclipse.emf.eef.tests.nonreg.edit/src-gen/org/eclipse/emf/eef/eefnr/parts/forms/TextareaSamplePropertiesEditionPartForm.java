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
import org.eclipse.emf.eef.eefnr.parts.EefnrViewsRepository;
import org.eclipse.emf.eef.eefnr.parts.TextareaSamplePropertiesEditionPart;
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
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;


// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class TextareaSamplePropertiesEditionPartForm extends CompositePropertiesEditingPart implements FormPropertiesEditingPart, TextareaSamplePropertiesEditionPart {

	protected Text textareaRequiredProperty;
	protected Text textareaOptionalProperty;



	/**
	 * Default constructor
	 * @param editionComponent the {@link PropertiesEditingComponent} that manage this part
	 * 
	 */
	public TextareaSamplePropertiesEditionPartForm(PropertiesEditingComponent editionComponent) {
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
		CompositionSequence textareaSampleStep = new CompositionSequence();
		CompositionStep propertiesStep = textareaSampleStep.addStep(EefnrViewsRepository.TextareaSample.Properties.class);
		propertiesStep.addStep(EefnrViewsRepository.TextareaSample.Properties.textareaRequiredProperty);
		propertiesStep.addStep(EefnrViewsRepository.TextareaSample.Properties.textareaOptionalProperty);
		
		
		composer = new PartComposer(textareaSampleStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EefnrViewsRepository.TextareaSample.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == EefnrViewsRepository.TextareaSample.Properties.textareaRequiredProperty) {
					return createTextareaRequiredPropertyTextarea(widgetFactory, parent);
				}
				if (key == EefnrViewsRepository.TextareaSample.Properties.textareaOptionalProperty) {
					return createTextareaOptionalPropertyTextarea(widgetFactory, parent);
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
		propertiesSection.setText(EefnrMessages.TextareaSamplePropertiesEditionPart_PropertiesGroupLabel);
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

	
	protected Composite createTextareaRequiredPropertyTextarea(FormToolkit widgetFactory, Composite parent) {
		Label textareaRequiredPropertyLabel = FormUtils.createPartLabel(widgetFactory, parent, EefnrMessages.TextareaSamplePropertiesEditionPart_TextareaRequiredPropertyLabel, propertiesEditingComponent.isRequired(EefnrViewsRepository.TextareaSample.Properties.textareaRequiredProperty, EefnrViewsRepository.FORM_KIND));
		GridData textareaRequiredPropertyLabelData = new GridData(GridData.FILL_HORIZONTAL);
		textareaRequiredPropertyLabelData.horizontalSpan = 3;
		textareaRequiredPropertyLabel.setLayoutData(textareaRequiredPropertyLabelData);
		textareaRequiredProperty = widgetFactory.createText(parent, "", SWT.BORDER | SWT.WRAP | SWT.MULTI | SWT.V_SCROLL); //$NON-NLS-1$
		GridData textareaRequiredPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		textareaRequiredPropertyData.horizontalSpan = 2;
		textareaRequiredPropertyData.heightHint = 80;
		textareaRequiredPropertyData.widthHint = 200;
		textareaRequiredProperty.setLayoutData(textareaRequiredPropertyData);
		textareaRequiredProperty.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			public void focusLost(FocusEvent e) {
				if (propertiesEditingComponent != null)
					propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(TextareaSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TextareaSample.Properties.textareaRequiredProperty, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, textareaRequiredProperty.getText()));
			}

		});
		EditingUtils.setID(textareaRequiredProperty, EefnrViewsRepository.TextareaSample.Properties.textareaRequiredProperty);
		EditingUtils.setEEFtype(textareaRequiredProperty, "eef::Textarea"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditingComponent.getHelpContent(EefnrViewsRepository.TextareaSample.Properties.textareaRequiredProperty, EefnrViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createTextareaOptionalPropertyTextarea(FormToolkit widgetFactory, Composite parent) {
		Label textareaOptionalPropertyLabel = FormUtils.createPartLabel(widgetFactory, parent, EefnrMessages.TextareaSamplePropertiesEditionPart_TextareaOptionalPropertyLabel, propertiesEditingComponent.isRequired(EefnrViewsRepository.TextareaSample.Properties.textareaOptionalProperty, EefnrViewsRepository.FORM_KIND));
		GridData textareaOptionalPropertyLabelData = new GridData(GridData.FILL_HORIZONTAL);
		textareaOptionalPropertyLabelData.horizontalSpan = 3;
		textareaOptionalPropertyLabel.setLayoutData(textareaOptionalPropertyLabelData);
		textareaOptionalProperty = widgetFactory.createText(parent, "", SWT.BORDER | SWT.WRAP | SWT.MULTI | SWT.V_SCROLL); //$NON-NLS-1$
		GridData textareaOptionalPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		textareaOptionalPropertyData.horizontalSpan = 2;
		textareaOptionalPropertyData.heightHint = 80;
		textareaOptionalPropertyData.widthHint = 200;
		textareaOptionalProperty.setLayoutData(textareaOptionalPropertyData);
		textareaOptionalProperty.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			public void focusLost(FocusEvent e) {
				if (propertiesEditingComponent != null)
					propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(TextareaSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TextareaSample.Properties.textareaOptionalProperty, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, textareaOptionalProperty.getText()));
			}

		});
		EditingUtils.setID(textareaOptionalProperty, EefnrViewsRepository.TextareaSample.Properties.textareaOptionalProperty);
		EditingUtils.setEEFtype(textareaOptionalProperty, "eef::Textarea"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditingComponent.getHelpContent(EefnrViewsRepository.TextareaSample.Properties.textareaOptionalProperty, EefnrViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see org.eclipse.emf.eef.eefnr.parts.TextareaSamplePropertiesEditionPart#getTextareaRequiredProperty()
	 * 
	 */
	public String getTextareaRequiredProperty() {
		return textareaRequiredProperty.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TextareaSamplePropertiesEditionPart#setTextareaRequiredProperty(String newValue)
	 * 
	 */
	public void setTextareaRequiredProperty(String newValue) {
		if (newValue != null) {
			textareaRequiredProperty.setText(newValue);
		} else {
			textareaRequiredProperty.setText("");  //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TextareaSamplePropertiesEditionPart#getTextareaOptionalProperty()
	 * 
	 */
	public String getTextareaOptionalProperty() {
		return textareaOptionalProperty.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TextareaSamplePropertiesEditionPart#setTextareaOptionalProperty(String newValue)
	 * 
	 */
	public void setTextareaOptionalProperty(String newValue) {
		if (newValue != null) {
			textareaOptionalProperty.setText(newValue);
		} else {
			textareaOptionalProperty.setText("");  //$NON-NLS-1$
		}
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.parts.PropertiesEditingPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EefnrMessages.TextareaSample_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
