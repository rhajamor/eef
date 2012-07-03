/*******************************************************************************
 * Copyright (c) 2008, 2012 Obeo.
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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.eefnr.parts.AdvancedEObjectFlatComboViewerSamplePropertiesEditionPart;
import org.eclipse.emf.eef.eefnr.parts.EefnrViewsRepository;
import org.eclipse.emf.eef.eefnr.providers.EefnrMessages;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.widgets.AdvancedEObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.AdvancedEObjectFlatComboViewer.EObjectFlatComboViewerListener;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.views.properties.tabbed.ISection;


// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class AdvancedEObjectFlatComboViewerSamplePropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, AdvancedEObjectFlatComboViewerSamplePropertiesEditionPart {

	protected AdvancedEObjectFlatComboViewer advancedeobjectflatcomboviewerRequiredProperty;
	protected ViewerFilter advancedeobjectflatcomboviewerRequiredPropertyFilter;
	protected AdvancedEObjectFlatComboViewer advancedeobjectflatcomboviewerOptionalProperty;
	protected ViewerFilter advancedeobjectflatcomboviewerOptionalPropertyFilter;



	/**
	 * For {@link ISection} use only.
	 */
	public AdvancedEObjectFlatComboViewerSamplePropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public AdvancedEObjectFlatComboViewerSamplePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence advancedEObjectFlatComboViewerSampleStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = advancedEObjectFlatComboViewerSampleStep.addStep(EefnrViewsRepository.AdvancedEObjectFlatComboViewerSample.Properties.class);
		propertiesStep.addStep(EefnrViewsRepository.AdvancedEObjectFlatComboViewerSample.Properties.advancedeobjectflatcomboviewerRequiredProperty);
		propertiesStep.addStep(EefnrViewsRepository.AdvancedEObjectFlatComboViewerSample.Properties.advancedeobjectflatcomboviewerOptionalProperty);
		
		
		composer = new PartComposer(advancedEObjectFlatComboViewerSampleStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EefnrViewsRepository.AdvancedEObjectFlatComboViewerSample.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == EefnrViewsRepository.AdvancedEObjectFlatComboViewerSample.Properties.advancedeobjectflatcomboviewerRequiredProperty) {
					return createAdvancedeobjectflatcomboviewerRequiredPropertyFlatComboViewer(parent, widgetFactory);
				}
				if (key == EefnrViewsRepository.AdvancedEObjectFlatComboViewerSample.Properties.advancedeobjectflatcomboviewerOptionalProperty) {
					return createAdvancedeobjectflatcomboviewerOptionalPropertyFlatComboViewer(parent, widgetFactory);
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
		propertiesSection.setText(EefnrMessages.AdvancedEObjectFlatComboViewerSamplePropertiesEditionPart_PropertiesGroupLabel);
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

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createAdvancedeobjectflatcomboviewerRequiredPropertyFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, EefnrViewsRepository.AdvancedEObjectFlatComboViewerSample.Properties.advancedeobjectflatcomboviewerRequiredProperty, EefnrMessages.AdvancedEObjectFlatComboViewerSamplePropertiesEditionPart_AdvancedeobjectflatcomboviewerRequiredPropertyLabel);
		// create callback listener
		EObjectFlatComboViewerListener listener = new EObjectFlatComboViewerListener(){
			public void handleSet(EObject element){
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AdvancedEObjectFlatComboViewerSamplePropertiesEditionPartForm.this, EefnrViewsRepository.AdvancedEObjectFlatComboViewerSample.Properties.advancedeobjectflatcomboviewerRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, element)); 
			}
			public void navigateTo(EObject element){ }

			public EObject handleCreate() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AdvancedEObjectFlatComboViewerSamplePropertiesEditionPartForm.this, EefnrViewsRepository.AdvancedEObjectFlatComboViewerSample.Properties.advancedeobjectflatcomboviewerRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null)); 
				return null;
			}

		};
		//create widget
		advancedeobjectflatcomboviewerRequiredProperty = new AdvancedEObjectFlatComboViewer(EefnrMessages.AdvancedEObjectFlatComboViewerSamplePropertiesEditionPart_AdvancedeobjectflatcomboviewerRequiredPropertyLabel, resourceSet, advancedeobjectflatcomboviewerRequiredPropertyFilter, propertiesEditionComponent.getEditingContext().getAdapterFactory(), listener);
		advancedeobjectflatcomboviewerRequiredProperty.createControls(parent, widgetFactory);
		GridData advancedeobjectflatcomboviewerRequiredPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		advancedeobjectflatcomboviewerRequiredProperty.setLayoutData(advancedeobjectflatcomboviewerRequiredPropertyData);
		advancedeobjectflatcomboviewerRequiredProperty.setID(EefnrViewsRepository.AdvancedEObjectFlatComboViewerSample.Properties.advancedeobjectflatcomboviewerRequiredProperty);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EefnrViewsRepository.AdvancedEObjectFlatComboViewerSample.Properties.advancedeobjectflatcomboviewerRequiredProperty, EefnrViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}


	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createAdvancedeobjectflatcomboviewerOptionalPropertyFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, EefnrViewsRepository.AdvancedEObjectFlatComboViewerSample.Properties.advancedeobjectflatcomboviewerOptionalProperty, EefnrMessages.AdvancedEObjectFlatComboViewerSamplePropertiesEditionPart_AdvancedeobjectflatcomboviewerOptionalPropertyLabel);
		// create callback listener
		EObjectFlatComboViewerListener listener = new EObjectFlatComboViewerListener(){
			public void handleSet(EObject element){
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AdvancedEObjectFlatComboViewerSamplePropertiesEditionPartForm.this, EefnrViewsRepository.AdvancedEObjectFlatComboViewerSample.Properties.advancedeobjectflatcomboviewerOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, element)); 
			}
			public void navigateTo(EObject element){ }

			public EObject handleCreate() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AdvancedEObjectFlatComboViewerSamplePropertiesEditionPartForm.this, EefnrViewsRepository.AdvancedEObjectFlatComboViewerSample.Properties.advancedeobjectflatcomboviewerOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null)); 
				return null;
			}

		};
		//create widget
		advancedeobjectflatcomboviewerOptionalProperty = new AdvancedEObjectFlatComboViewer(EefnrMessages.AdvancedEObjectFlatComboViewerSamplePropertiesEditionPart_AdvancedeobjectflatcomboviewerOptionalPropertyLabel, resourceSet, advancedeobjectflatcomboviewerOptionalPropertyFilter, propertiesEditionComponent.getEditingContext().getAdapterFactory(), listener);
		advancedeobjectflatcomboviewerOptionalProperty.createControls(parent, widgetFactory);
		GridData advancedeobjectflatcomboviewerOptionalPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		advancedeobjectflatcomboviewerOptionalProperty.setLayoutData(advancedeobjectflatcomboviewerOptionalPropertyData);
		advancedeobjectflatcomboviewerOptionalProperty.setID(EefnrViewsRepository.AdvancedEObjectFlatComboViewerSample.Properties.advancedeobjectflatcomboviewerOptionalProperty);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EefnrViewsRepository.AdvancedEObjectFlatComboViewerSample.Properties.advancedeobjectflatcomboviewerOptionalProperty, EefnrViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see org.eclipse.emf.eef.eefnr.parts.AdvancedEObjectFlatComboViewerSamplePropertiesEditionPart#getAdvancedeobjectflatcomboviewerRequiredProperty()
	 * 
	 */
	public EObject getAdvancedeobjectflatcomboviewerRequiredProperty() {
		return advancedeobjectflatcomboviewerRequiredProperty.getSelection();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.AdvancedEObjectFlatComboViewerSamplePropertiesEditionPart#initAdvancedeobjectflatcomboviewerRequiredProperty(EObjectFlatComboSettings)
	 */
	public void initAdvancedeobjectflatcomboviewerRequiredProperty(EObjectFlatComboSettings settings) {
		advancedeobjectflatcomboviewerRequiredProperty.setInput(settings);
		if (current != null) {
			advancedeobjectflatcomboviewerRequiredProperty.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.AdvancedEObjectFlatComboViewerSamplePropertiesEditionPart#setAdvancedeobjectflatcomboviewerRequiredProperty(EObject newValue)
	 * 
	 */
	public void setAdvancedeobjectflatcomboviewerRequiredProperty(EObject newValue) {
		if (newValue != null) {
			advancedeobjectflatcomboviewerRequiredProperty.setSelection(new StructuredSelection(newValue));
		} else {
			advancedeobjectflatcomboviewerRequiredProperty.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.AdvancedEObjectFlatComboViewerSamplePropertiesEditionPart#setAdvancedeobjectflatcomboviewerRequiredPropertyButtonMode(ButtonsModeEnum newValue)
	 */
	public void setAdvancedeobjectflatcomboviewerRequiredPropertyButtonMode(ButtonsModeEnum newValue) {
		advancedeobjectflatcomboviewerRequiredProperty.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.AdvancedEObjectFlatComboViewerSamplePropertiesEditionPart#addFilterAdvancedeobjectflatcomboviewerRequiredProperty(ViewerFilter filter)
	 * 
	 */
	public void addFilterToAdvancedeobjectflatcomboviewerRequiredProperty(ViewerFilter filter) {
		advancedeobjectflatcomboviewerRequiredProperty.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.AdvancedEObjectFlatComboViewerSamplePropertiesEditionPart#addBusinessFilterAdvancedeobjectflatcomboviewerRequiredProperty(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToAdvancedeobjectflatcomboviewerRequiredProperty(ViewerFilter filter) {
		advancedeobjectflatcomboviewerRequiredProperty.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.AdvancedEObjectFlatComboViewerSamplePropertiesEditionPart#getAdvancedeobjectflatcomboviewerOptionalProperty()
	 * 
	 */
	public EObject getAdvancedeobjectflatcomboviewerOptionalProperty() {
		return advancedeobjectflatcomboviewerOptionalProperty.getSelection();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.AdvancedEObjectFlatComboViewerSamplePropertiesEditionPart#initAdvancedeobjectflatcomboviewerOptionalProperty(EObjectFlatComboSettings)
	 */
	public void initAdvancedeobjectflatcomboviewerOptionalProperty(EObjectFlatComboSettings settings) {
		advancedeobjectflatcomboviewerOptionalProperty.setInput(settings);
		if (current != null) {
			advancedeobjectflatcomboviewerOptionalProperty.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.AdvancedEObjectFlatComboViewerSamplePropertiesEditionPart#setAdvancedeobjectflatcomboviewerOptionalProperty(EObject newValue)
	 * 
	 */
	public void setAdvancedeobjectflatcomboviewerOptionalProperty(EObject newValue) {
		if (newValue != null) {
			advancedeobjectflatcomboviewerOptionalProperty.setSelection(new StructuredSelection(newValue));
		} else {
			advancedeobjectflatcomboviewerOptionalProperty.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.AdvancedEObjectFlatComboViewerSamplePropertiesEditionPart#setAdvancedeobjectflatcomboviewerOptionalPropertyButtonMode(ButtonsModeEnum newValue)
	 */
	public void setAdvancedeobjectflatcomboviewerOptionalPropertyButtonMode(ButtonsModeEnum newValue) {
		advancedeobjectflatcomboviewerOptionalProperty.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.AdvancedEObjectFlatComboViewerSamplePropertiesEditionPart#addFilterAdvancedeobjectflatcomboviewerOptionalProperty(ViewerFilter filter)
	 * 
	 */
	public void addFilterToAdvancedeobjectflatcomboviewerOptionalProperty(ViewerFilter filter) {
		advancedeobjectflatcomboviewerOptionalProperty.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.AdvancedEObjectFlatComboViewerSamplePropertiesEditionPart#addBusinessFilterAdvancedeobjectflatcomboviewerOptionalProperty(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToAdvancedeobjectflatcomboviewerOptionalProperty(ViewerFilter filter) {
		advancedeobjectflatcomboviewerOptionalProperty.addBusinessRuleFilter(filter);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EefnrMessages.AdvancedEObjectFlatComboViewerSample_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
