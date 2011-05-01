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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.eefnrext.parts.CheckBoxExtendedEditorSamplePropertiesEditionPart;
import org.eclipse.emf.eef.eefnrext.parts.EefnrextViewsRepository;
import org.eclipse.emf.eef.eefnrext.parts.FlatReferenceExtendedEditorSamplePropertiesEditionPart;
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
import org.eclipse.emf.eef.runtime.ui.widgets.FlatReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
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
public class FlatReferenceExtendedEditorSamplePropertiesEditionPartForm extends CompositePropertiesEditingPart implements FormPropertiesEditingPart, FlatReferenceExtendedEditorSamplePropertiesEditionPart {

		protected FlatReferencesTable flatReferenceEditorSample;
	private CheckBoxExtendedEditorSamplePropertiesEditionPart checkBoxExtendedEditorSamplePropertiesEditionPart;



	/**
	 * Default constructor
	 * @param editionComponent the {@link PropertiesEditingComponent} that manage this part
	 * 
	 */
	public FlatReferenceExtendedEditorSamplePropertiesEditionPartForm(PropertiesEditingComponent editionComponent) {
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
		CompositionSequence flatReferenceExtendedEditorSampleStep = new CompositionSequence();
		flatReferenceExtendedEditorSampleStep
			.addStep(EefnrextViewsRepository.FlatReferenceExtendedEditorSample.Properties.class)
			.addStep(EefnrextViewsRepository.FlatReferenceExtendedEditorSample.Properties.flatReferenceEditorSample);
		
		flatReferenceExtendedEditorSampleStep.addStep(EefnrextViewsRepository.FlatReferenceExtendedEditorSample.checkboxSampleReference);
		
		composer = new PartComposer(flatReferenceExtendedEditorSampleStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EefnrextViewsRepository.FlatReferenceExtendedEditorSample.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == EefnrextViewsRepository.FlatReferenceExtendedEditorSample.Properties.flatReferenceEditorSample) {
					return createFlatReferenceEditorSampleFlatReferencesTable(widgetFactory, parent);
				}
				if (key == EefnrextViewsRepository.FlatReferenceExtendedEditorSample.checkboxSampleReference) {
					return createCheckBoxExtendedEditorSample(widgetFactory, parent);
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
		propertiesSection.setText(EefnrextMessages.FlatReferenceExtendedEditorSamplePropertiesEditionPart_PropertiesGroupLabel);
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
	 * @param parent
	 * 
	 */
	protected Composite createFlatReferenceEditorSampleFlatReferencesTable(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, EefnrextMessages.FlatReferenceExtendedEditorSamplePropertiesEditionPart_FlatReferenceEditorSampleLabel, propertiesEditingComponent.isRequired(EefnrextViewsRepository.FlatReferenceExtendedEditorSample.Properties.flatReferenceEditorSample, EefnrextViewsRepository.FORM_KIND));
		flatReferenceEditorSample = new FlatReferencesTable(parent);
		flatReferenceEditorSample.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		flatReferenceEditorSample.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				if (event.getSelection() instanceof StructuredSelection) 
					propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(FlatReferenceExtendedEditorSamplePropertiesEditionPartForm.this, EefnrextViewsRepository.FlatReferenceExtendedEditorSample.Properties.flatReferenceEditorSample, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, ((StructuredSelection)event.getSelection()).toList()));
			}

		});
		GridData flatReferenceEditorSampleData = new GridData(GridData.FILL_HORIZONTAL);
		flatReferenceEditorSample.setLayoutData(flatReferenceEditorSampleData);
		flatReferenceEditorSample.setID(EefnrextViewsRepository.FlatReferenceExtendedEditorSample.Properties.flatReferenceEditorSample);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditingComponent.getHelpContent(EefnrextViewsRepository.FlatReferenceExtendedEditorSample.Properties.flatReferenceEditorSample, EefnrextViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}


	protected Composite createCheckBoxExtendedEditorSample(FormToolkit widgetFactory, Composite container) {
		PropertiesEditingPartProvider provider = PropertiesEditingPartProviderService.getInstance().getProvider(EefnrextViewsRepository.class);
		checkBoxExtendedEditorSamplePropertiesEditionPart = (CheckBoxExtendedEditorSamplePropertiesEditionPart)provider.getPropertiesEditingPart(EefnrextViewsRepository.CheckBoxExtendedEditorSample.class, EefnrextViewsRepository.FORM_KIND, propertiesEditingComponent);
		((FormPropertiesEditingPart)checkBoxExtendedEditorSamplePropertiesEditionPart).createControls(widgetFactory, container);
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
	 * @see org.eclipse.emf.eef.eefnrext.parts.FlatReferenceExtendedEditorSamplePropertiesEditionPart#initFlatReferenceEditorSample(ReferencesTableSettings)
	 */
	public void initFlatReferenceEditorSample(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		flatReferenceEditorSample.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnrext.parts.FlatReferenceExtendedEditorSamplePropertiesEditionPart#updateFlatReferenceEditorSample()
	 * 
	 */
	public void updateFlatReferenceEditorSample() {
	flatReferenceEditorSample.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnrext.parts.FlatReferenceExtendedEditorSamplePropertiesEditionPart#addFilterFlatReferenceEditorSample(ViewerFilter filter)
	 * 
	 */
	public void addFilterToFlatReferenceEditorSample(ViewerFilter filter) {
		flatReferenceEditorSample.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnrext.parts.FlatReferenceExtendedEditorSamplePropertiesEditionPart#addBusinessFilterFlatReferenceEditorSample(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToFlatReferenceEditorSample(ViewerFilter filter) {
		flatReferenceEditorSample.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnrext.parts.FlatReferenceExtendedEditorSamplePropertiesEditionPart#isContainedInFlatReferenceEditorSampleTable(EObject element)
	 * 
	 */
	public boolean isContainedInFlatReferenceEditorSampleTable(EObject element) {
		return ((ReferencesTableSettings)flatReferenceEditorSample.getInput()).contains(element);
	}

/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnrext.parts.FlatReferenceExtendedEditorSamplePropertiesEditionPart#getCheckBoxExtendedEditorSampleReferencedView()
	 * 
	 */
		public PropertiesEditingPart getCheckBoxExtendedEditorSampleReferencedView() {
			return (PropertiesEditingPart) checkBoxExtendedEditorSamplePropertiesEditionPart;
		}
	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnrext.parts.FlatReferenceExtendedEditorSamplePropertiesEditionPart#getCheckboxEditorSample()
	 * 
	 */
	public Boolean getCheckboxEditorSample() {
		return checkBoxExtendedEditorSamplePropertiesEditionPart.getCheckboxEditorSample();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnrext.parts.FlatReferenceExtendedEditorSamplePropertiesEditionPart#setCheckboxEditorSample(Boolean newValue)
	 * 
	 */
	public void setCheckboxEditorSample(Boolean newValue) {
		checkBoxExtendedEditorSamplePropertiesEditionPart.setCheckboxEditorSample(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnrext.parts.CheckBoxExtendedEditorSamplePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return checkBoxExtendedEditorSamplePropertiesEditionPart.getName();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnrext.parts.CheckBoxExtendedEditorSamplePropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		checkBoxExtendedEditorSamplePropertiesEditionPart.setName(newValue);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.parts.PropertiesEditingPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EefnrextMessages.FlatReferenceExtendedEditorSample_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
