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
package org.eclipse.emf.eef.eefnrext.parts.impl;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.eefnrext.parts.CheckBoxExtendedEditorSamplePropertiesEditionPart;
import org.eclipse.emf.eef.eefnrext.parts.EefnrextViewsRepository;
import org.eclipse.emf.eef.eefnrext.parts.FlatReferenceExtendedEditorSamplePropertiesEditionPart;
import org.eclipse.emf.eef.eefnrext.providers.EefnrextMessages;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.services.PropertiesEditionPartProviderService;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.widgets.FlatReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;



// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class FlatReferenceExtendedEditorSamplePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, FlatReferenceExtendedEditorSamplePropertiesEditionPart {

	protected FlatReferencesTable flatReferenceEditorSample;
	private CheckBoxExtendedEditorSamplePropertiesEditionPart checkBoxExtendedEditorSamplePropertiesEditionPart;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public FlatReferenceExtendedEditorSamplePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence flatReferenceExtendedEditorSampleStep = new BindingCompositionSequence(propertiesEditionComponent);
		flatReferenceExtendedEditorSampleStep
			.addStep(EefnrextViewsRepository.FlatReferenceExtendedEditorSample.Properties.class)
			.addStep(EefnrextViewsRepository.FlatReferenceExtendedEditorSample.Properties.flatReferenceEditorSample);
		
		flatReferenceExtendedEditorSampleStep.addStep(EefnrextViewsRepository.FlatReferenceExtendedEditorSample.checkboxSampleReference);
		
		composer = new PartComposer(flatReferenceExtendedEditorSampleStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EefnrextViewsRepository.FlatReferenceExtendedEditorSample.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == EefnrextViewsRepository.FlatReferenceExtendedEditorSample.Properties.flatReferenceEditorSample) {
					return createFlatReferenceEditorSampleFlatReferencesTable(parent);
				}
				if (key == EefnrextViewsRepository.FlatReferenceExtendedEditorSample.checkboxSampleReference) {
					return createCheckBoxExtendedEditorSample(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(EefnrextMessages.FlatReferenceExtendedEditorSamplePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	/**
	 * @param parent
	 * 
	 */
	protected Composite createFlatReferenceEditorSampleFlatReferencesTable(Composite parent) {
		createDescription(parent, EefnrextViewsRepository.FlatReferenceExtendedEditorSample.Properties.flatReferenceEditorSample, EefnrextMessages.FlatReferenceExtendedEditorSamplePropertiesEditionPart_FlatReferenceEditorSampleLabel);
		flatReferenceEditorSample = new FlatReferencesTable(parent);
		flatReferenceEditorSample.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		flatReferenceEditorSample.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				if (event.getSelection() instanceof StructuredSelection) 
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FlatReferenceExtendedEditorSamplePropertiesEditionPartImpl.this, EefnrextViewsRepository.FlatReferenceExtendedEditorSample.Properties.flatReferenceEditorSample, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, ((StructuredSelection)event.getSelection()).toList()));
			}

		});
		GridData flatReferenceEditorSampleData = new GridData(GridData.FILL_HORIZONTAL);
		flatReferenceEditorSample.setLayoutData(flatReferenceEditorSampleData);
		flatReferenceEditorSample.setID(EefnrextViewsRepository.FlatReferenceExtendedEditorSample.Properties.flatReferenceEditorSample);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EefnrextViewsRepository.FlatReferenceExtendedEditorSample.Properties.flatReferenceEditorSample, EefnrextViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}


	protected Composite createCheckBoxExtendedEditorSample(Composite container) {
		IPropertiesEditionPartProvider provider = PropertiesEditionPartProviderService.getInstance().getProvider(EefnrextViewsRepository.class);
		checkBoxExtendedEditorSamplePropertiesEditionPart = (CheckBoxExtendedEditorSamplePropertiesEditionPart)provider.getPropertiesEditionPart(EefnrextViewsRepository.CheckBoxExtendedEditorSample.class, EefnrextViewsRepository.SWT_KIND, propertiesEditionComponent);
		((ISWTPropertiesEditionPart)checkBoxExtendedEditorSamplePropertiesEditionPart).createControls(container);
		return container;
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
