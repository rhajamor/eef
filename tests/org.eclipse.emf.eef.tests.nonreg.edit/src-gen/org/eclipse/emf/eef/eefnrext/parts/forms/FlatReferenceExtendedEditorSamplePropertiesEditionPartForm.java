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
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.eefnrext.parts.CheckBoxExtendedEditorSamplePropertiesEditionPart;
import org.eclipse.emf.eef.eefnrext.parts.EefnrextViewsRepository;
import org.eclipse.emf.eef.eefnrext.parts.FlatReferenceExtendedEditorSamplePropertiesEditionPart;
import org.eclipse.emf.eef.eefnrext.providers.EefnrextMessages;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.services.PropertiesEditionPartProviderService;
import org.eclipse.emf.eef.runtime.ui.widgets.FlatReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
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
public class FlatReferenceExtendedEditorSamplePropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, FlatReferenceExtendedEditorSamplePropertiesEditionPart {

		protected FlatReferencesTable flatReferenceEditorSample;
	private CheckBoxExtendedEditorSamplePropertiesEditionPart checkBoxExtendedEditorSamplePropertiesEditionPart;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public FlatReferenceExtendedEditorSamplePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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

		createCheckBoxExtendedEditorSample(widgetFactory, view);

		// Start of user code for additional ui definition
		
		// End of user code
	}
	/**
	 * 
	 */
	protected void createPropertiesGroup(FormToolkit widgetFactory, final Composite view) {
		Section propertiesSection = widgetFactory.createSection(view, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		propertiesSection.setText(EefnrextMessages.FlatReferenceExtendedEditorSamplePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		createFlatReferenceEditorSampleFlatReferencesTable(widgetFactory, propertiesGroup);
		propertiesSection.setClient(propertiesGroup);
	}

	/**
	 * @param parent
	 * 
	 */
	protected void createFlatReferenceEditorSampleFlatReferencesTable(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, EefnrextMessages.FlatReferenceExtendedEditorSamplePropertiesEditionPart_FlatReferenceEditorSampleLabel, propertiesEditionComponent.isRequired(EefnrextViewsRepository.FlatReferenceExtendedEditorSample.flatReferenceEditorSample, EefnrextViewsRepository.FORM_KIND));
		flatReferenceEditorSample = new FlatReferencesTable(parent);
		flatReferenceEditorSample.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		flatReferenceEditorSample.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				if (event.getSelection() instanceof StructuredSelection) 
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FlatReferenceExtendedEditorSamplePropertiesEditionPartForm.this, EefnrextViewsRepository.FlatReferenceExtendedEditorSample.flatReferenceEditorSample, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, ((StructuredSelection)event.getSelection()).getFirstElement()));
			}

		});
		GridData flatReferenceEditorSampleData = new GridData(GridData.FILL_HORIZONTAL);
		flatReferenceEditorSample.setLayoutData(flatReferenceEditorSampleData);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EefnrextViewsRepository.FlatReferenceExtendedEditorSample.flatReferenceEditorSample, EefnrextViewsRepository.FORM_KIND), null); //$NON-NLS-1$
	}


	protected void createCheckBoxExtendedEditorSample(FormToolkit widgetFactory, Composite container) {
		IPropertiesEditionPartProvider provider = PropertiesEditionPartProviderService.getInstance().getProvider(EefnrextViewsRepository.class);
		checkBoxExtendedEditorSamplePropertiesEditionPart = (CheckBoxExtendedEditorSamplePropertiesEditionPart)provider.getPropertiesEditionPart(EefnrextViewsRepository.CheckBoxExtendedEditorSample.class, EefnrextViewsRepository.FORM_KIND, propertiesEditionComponent);
		((IFormPropertiesEditionPart)checkBoxExtendedEditorSamplePropertiesEditionPart).createControls(widgetFactory, container);
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
	 * @see org.eclipse.emf.eef.eefnrext.parts.FlatReferenceExtendedEditorSamplePropertiesEditionPart#getFlatReferenceEditorSampleToAdd()
	 * 
	 */
	public List getFlatReferenceEditorSampleToAdd() {
		return flatReferenceEditorSample.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnrext.parts.FlatReferenceExtendedEditorSamplePropertiesEditionPart#getFlatReferenceEditorSampleToRemove()
	 * 
	 */
	public List getFlatReferenceEditorSampleToRemove() {
		return flatReferenceEditorSample.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnrext.parts.FlatReferenceExtendedEditorSamplePropertiesEditionPart#getFlatReferenceEditorSampleTable()
	 * 
	 */
	public List getFlatReferenceEditorSampleTable() {
		return flatReferenceEditorSample.getVirtualList();
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnrext.parts.FlatReferenceExtendedEditorSamplePropertiesEditionPart#initFlatReferenceEditorSample(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initFlatReferenceEditorSample(EObject current, EReference containingFeature, EReference feature) {
		flatReferenceEditorSample.initComponent(current, containingFeature, feature);
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			flatReferenceEditorSample.setInput(current.eResource().getResourceSet());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnrext.parts.FlatReferenceExtendedEditorSamplePropertiesEditionPart#updateFlatReferenceEditorSample(EObject newValue)
	 * 
	 */
	public void updateFlatReferenceEditorSample(EObject newValue) {
		flatReferenceEditorSample.updateComponent(newValue);
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
		return flatReferenceEditorSample.virtualListContains(element);
	}

/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnrext.parts.FlatReferenceExtendedEditorSamplePropertiesEditionPart#getCheckBoxExtendedEditorSampleReferencedView()
	 * 
	 */
		public IPropertiesEditionPart getCheckBoxExtendedEditorSampleReferencedView() {
			return (IPropertiesEditionPart) checkBoxExtendedEditorSamplePropertiesEditionPart;
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
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EefnrextMessages.FlatReferenceExtendedEditorSample_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
