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
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.eefnr.parts.EMFComboViewerSamplePropertiesEditionPart;
import org.eclipse.emf.eef.eefnr.parts.EefnrViewsRepository;
import org.eclipse.emf.eef.eefnr.providers.EefnrMessages;
import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
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
public class EMFComboViewerSamplePropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, EMFComboViewerSamplePropertiesEditionPart {

	protected EMFComboViewer emfcomboviewerRequiredProperty;
	protected EMFComboViewer emfcomboviewerOptionalProperty;



	/**
	 * For {@link ISection} use only.
	 */
	public EMFComboViewerSamplePropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public EMFComboViewerSamplePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence eMFComboViewerSampleStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = eMFComboViewerSampleStep.addStep(EefnrViewsRepository.EMFComboViewerSample.Properties.class);
		propertiesStep.addStep(EefnrViewsRepository.EMFComboViewerSample.Properties.emfcomboviewerRequiredProperty);
		propertiesStep.addStep(EefnrViewsRepository.EMFComboViewerSample.Properties.emfcomboviewerOptionalProperty);
		
		
		composer = new PartComposer(eMFComboViewerSampleStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EefnrViewsRepository.EMFComboViewerSample.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == EefnrViewsRepository.EMFComboViewerSample.Properties.emfcomboviewerRequiredProperty) {
					return createEmfcomboviewerRequiredPropertyEMFComboViewer(widgetFactory, parent);
				}
				if (key == EefnrViewsRepository.EMFComboViewerSample.Properties.emfcomboviewerOptionalProperty) {
					return createEmfcomboviewerOptionalPropertyEMFComboViewer(widgetFactory, parent);
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
		propertiesSection.setText(EefnrMessages.EMFComboViewerSamplePropertiesEditionPart_PropertiesGroupLabel);
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

	
	protected Composite createEmfcomboviewerRequiredPropertyEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EefnrViewsRepository.EMFComboViewerSample.Properties.emfcomboviewerRequiredProperty, EefnrMessages.EMFComboViewerSamplePropertiesEditionPart_EmfcomboviewerRequiredPropertyLabel);
		emfcomboviewerRequiredProperty = new EMFComboViewer(parent);
		emfcomboviewerRequiredProperty.setContentProvider(new ArrayContentProvider());
		emfcomboviewerRequiredProperty.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData emfcomboviewerRequiredPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		emfcomboviewerRequiredProperty.getCombo().setLayoutData(emfcomboviewerRequiredPropertyData);
		emfcomboviewerRequiredProperty.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EMFComboViewerSamplePropertiesEditionPartForm.this, EefnrViewsRepository.EMFComboViewerSample.Properties.emfcomboviewerRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getEmfcomboviewerRequiredProperty()));
			}

		});
		emfcomboviewerRequiredProperty.setID(EefnrViewsRepository.EMFComboViewerSample.Properties.emfcomboviewerRequiredProperty);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EefnrViewsRepository.EMFComboViewerSample.Properties.emfcomboviewerRequiredProperty, EefnrViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createEmfcomboviewerOptionalPropertyEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EefnrViewsRepository.EMFComboViewerSample.Properties.emfcomboviewerOptionalProperty, EefnrMessages.EMFComboViewerSamplePropertiesEditionPart_EmfcomboviewerOptionalPropertyLabel);
		emfcomboviewerOptionalProperty = new EMFComboViewer(parent);
		emfcomboviewerOptionalProperty.setContentProvider(new ArrayContentProvider());
		emfcomboviewerOptionalProperty.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData emfcomboviewerOptionalPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		emfcomboviewerOptionalProperty.getCombo().setLayoutData(emfcomboviewerOptionalPropertyData);
		emfcomboviewerOptionalProperty.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EMFComboViewerSamplePropertiesEditionPartForm.this, EefnrViewsRepository.EMFComboViewerSample.Properties.emfcomboviewerOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getEmfcomboviewerOptionalProperty()));
			}

		});
		emfcomboviewerOptionalProperty.setID(EefnrViewsRepository.EMFComboViewerSample.Properties.emfcomboviewerOptionalProperty);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EefnrViewsRepository.EMFComboViewerSample.Properties.emfcomboviewerOptionalProperty, EefnrViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see org.eclipse.emf.eef.eefnr.parts.EMFComboViewerSamplePropertiesEditionPart#getEmfcomboviewerRequiredProperty()
	 * 
	 */
	public Enumerator getEmfcomboviewerRequiredProperty() {
		Enumerator selection = (Enumerator) ((StructuredSelection) emfcomboviewerRequiredProperty.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.EMFComboViewerSamplePropertiesEditionPart#initEmfcomboviewerRequiredProperty(Object input, Enumerator current)
	 */
	public void initEmfcomboviewerRequiredProperty(Object input, Enumerator current) {
		emfcomboviewerRequiredProperty.setInput(input);
		emfcomboviewerRequiredProperty.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.EMFComboViewerSamplePropertiesEditionPart#setEmfcomboviewerRequiredProperty(Enumerator newValue)
	 * 
	 */
	public void setEmfcomboviewerRequiredProperty(Enumerator newValue) {
		emfcomboviewerRequiredProperty.modelUpdating(new StructuredSelection(newValue));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.EMFComboViewerSamplePropertiesEditionPart#getEmfcomboviewerOptionalProperty()
	 * 
	 */
	public Enumerator getEmfcomboviewerOptionalProperty() {
		Enumerator selection = (Enumerator) ((StructuredSelection) emfcomboviewerOptionalProperty.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.EMFComboViewerSamplePropertiesEditionPart#initEmfcomboviewerOptionalProperty(Object input, Enumerator current)
	 */
	public void initEmfcomboviewerOptionalProperty(Object input, Enumerator current) {
		emfcomboviewerOptionalProperty.setInput(input);
		emfcomboviewerOptionalProperty.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.EMFComboViewerSamplePropertiesEditionPart#setEmfcomboviewerOptionalProperty(Enumerator newValue)
	 * 
	 */
	public void setEmfcomboviewerOptionalProperty(Enumerator newValue) {
		emfcomboviewerOptionalProperty.modelUpdating(new StructuredSelection(newValue));
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EefnrMessages.EMFComboViewerSample_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
