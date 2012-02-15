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
package org.eclipse.emf.eef.eefnr.navigation.parts.impl;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.eef.eefnr.navigation.parts.NavigationViewsRepository;
import org.eclipse.emf.eef.eefnr.navigation.parts.OwnerPropertiesEditionPart;
import org.eclipse.emf.eef.eefnr.navigation.parts.SubtypePropertiesEditionPart;
import org.eclipse.emf.eef.eefnr.navigation.providers.NavigationMessages;
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
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;










// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class SubtypePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, SubtypePropertiesEditionPart {

	protected Button specialisedElement;
	private OwnerPropertiesEditionPart ownerPropertiesEditionPart;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public SubtypePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence subtypeStep = new BindingCompositionSequence(propertiesEditionComponent);
		subtypeStep.addStep(NavigationViewsRepository.Subtype.ownerView);
		subtypeStep
			.addStep(NavigationViewsRepository.Subtype.Specialisation.class)
			.addStep(NavigationViewsRepository.Subtype.Specialisation.specialisedElement);
		
		
		composer = new PartComposer(subtypeStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == NavigationViewsRepository.Subtype.ownerView) {
					return createOwner(parent);
				}
				if (key == NavigationViewsRepository.Subtype.Specialisation.class) {
					return createSpecialisationGroup(parent);
				}
				if (key == NavigationViewsRepository.Subtype.Specialisation.specialisedElement) {
					return createSpecialisedElementCheckbox(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	protected Composite createOwner(Composite container) {
		IPropertiesEditionPartProvider provider = PropertiesEditionPartProviderService.getInstance().getProvider(NavigationViewsRepository.class);
		ownerPropertiesEditionPart = (OwnerPropertiesEditionPart)provider.getPropertiesEditionPart(NavigationViewsRepository.Owner.class, NavigationViewsRepository.SWT_KIND, propertiesEditionComponent);
		((ISWTPropertiesEditionPart)ownerPropertiesEditionPart).createControls(container);
		return container;
	}


	/**
	 * 
	 */
	protected Composite createSpecialisationGroup(Composite parent) {
		Group specialisationGroup = new Group(parent, SWT.NONE);
		specialisationGroup.setText(NavigationMessages.SubtypePropertiesEditionPart_SpecialisationGroupLabel);
		GridData specialisationGroupData = new GridData(GridData.FILL_HORIZONTAL);
		specialisationGroupData.horizontalSpan = 3;
		specialisationGroup.setLayoutData(specialisationGroupData);
		GridLayout specialisationGroupLayout = new GridLayout();
		specialisationGroupLayout.numColumns = 3;
		specialisationGroup.setLayout(specialisationGroupLayout);
		return specialisationGroup;
	}

	
	protected Composite createSpecialisedElementCheckbox(Composite parent) {
		specialisedElement = new Button(parent, SWT.CHECK);
		specialisedElement.setText(NavigationMessages.SubtypePropertiesEditionPart_SpecialisedElementLabel);
		specialisedElement.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubtypePropertiesEditionPartImpl.this, NavigationViewsRepository.Subtype.Specialisation.specialisedElement, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(specialisedElement.getSelection())));
			}

		});
		GridData specialisedElementData = new GridData(GridData.FILL_HORIZONTAL);
		specialisedElementData.horizontalSpan = 2;
		specialisedElement.setLayoutData(specialisedElementData);
		EditingUtils.setID(specialisedElement, NavigationViewsRepository.Subtype.Specialisation.specialisedElement);
		EditingUtils.setEEFtype(specialisedElement, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NavigationViewsRepository.Subtype.Specialisation.specialisedElement, NavigationViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#getSpecialisedElement()
	 * 
	 */
	public Boolean getSpecialisedElement() {
		return Boolean.valueOf(specialisedElement.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#setSpecialisedElement(Boolean newValue)
	 * 
	 */
	public void setSpecialisedElement(Boolean newValue) {
		if (newValue != null) {
			specialisedElement.setSelection(newValue.booleanValue());
		} else {
			specialisedElement.setSelection(false);
		}
	}


/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#getOwnerReferencedView()
	 * 
	 */
		public IPropertiesEditionPart getOwnerReferencedView() {
			return (IPropertiesEditionPart) ownerPropertiesEditionPart;
		}
	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return ownerPropertiesEditionPart.getName();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		ownerPropertiesEditionPart.setName(newValue);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#initMultipleSampleForTableComposition(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initMultipleSampleForTableComposition(ReferencesTableSettings settings) {
		ownerPropertiesEditionPart.initMultipleSampleForTableComposition(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#updateMultipleSampleForTableComposition()
	 * 
	 */
	public void updateMultipleSampleForTableComposition() {
		ownerPropertiesEditionPart.updateMultipleSampleForTableComposition();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#addFilterMultipleSampleForTableComposition(ViewerFilter filter)
	 * 
	 */
	public void addFilterToMultipleSampleForTableComposition(ViewerFilter filter) {
		ownerPropertiesEditionPart.addFilterToMultipleSampleForTableComposition(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#addBusinessFilterMultipleSampleForTableComposition(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMultipleSampleForTableComposition(ViewerFilter filter) {
		ownerPropertiesEditionPart.addBusinessFilterToMultipleSampleForTableComposition(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#isContainedInMultipleSampleForTableCompositionTable(EObject element)
	 * 
	 */
	public boolean isContainedInMultipleSampleForTableCompositionTable(EObject element) {
		return ownerPropertiesEditionPart.isContainedInMultipleSampleForTableCompositionTable(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#initMultipleSampleForAdvancedTableComposition(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initMultipleSampleForAdvancedTableComposition(ReferencesTableSettings settings) {
		ownerPropertiesEditionPart.initMultipleSampleForAdvancedTableComposition(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#updateMultipleSampleForAdvancedTableComposition()
	 * 
	 */
	public void updateMultipleSampleForAdvancedTableComposition() {
		ownerPropertiesEditionPart.updateMultipleSampleForAdvancedTableComposition();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#addFilterMultipleSampleForAdvancedTableComposition(ViewerFilter filter)
	 * 
	 */
	public void addFilterToMultipleSampleForAdvancedTableComposition(ViewerFilter filter) {
		ownerPropertiesEditionPart.addFilterToMultipleSampleForAdvancedTableComposition(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#addBusinessFilterMultipleSampleForAdvancedTableComposition(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMultipleSampleForAdvancedTableComposition(ViewerFilter filter) {
		ownerPropertiesEditionPart.addBusinessFilterToMultipleSampleForAdvancedTableComposition(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#isContainedInMultipleSampleForAdvancedTableCompositionTable(EObject element)
	 * 
	 */
	public boolean isContainedInMultipleSampleForAdvancedTableCompositionTable(EObject element) {
		return ownerPropertiesEditionPart.isContainedInMultipleSampleForAdvancedTableCompositionTable(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#initMultipleSampleForReferencesTable(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initMultipleSampleForReferencesTable(ReferencesTableSettings settings) {
		ownerPropertiesEditionPart.initMultipleSampleForReferencesTable(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#updateMultipleSampleForReferencesTable()
	 * 
	 */
	public void updateMultipleSampleForReferencesTable() {
		ownerPropertiesEditionPart.updateMultipleSampleForReferencesTable();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#addFilterMultipleSampleForReferencesTable(ViewerFilter filter)
	 * 
	 */
	public void addFilterToMultipleSampleForReferencesTable(ViewerFilter filter) {
		ownerPropertiesEditionPart.addFilterToMultipleSampleForReferencesTable(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#addBusinessFilterMultipleSampleForReferencesTable(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMultipleSampleForReferencesTable(ViewerFilter filter) {
		ownerPropertiesEditionPart.addBusinessFilterToMultipleSampleForReferencesTable(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#isContainedInMultipleSampleForReferencesTableTable(EObject element)
	 * 
	 */
	public boolean isContainedInMultipleSampleForReferencesTableTable(EObject element) {
		return ownerPropertiesEditionPart.isContainedInMultipleSampleForReferencesTableTable(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#initMultipleSampleForAdvancedReferencesTable(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initMultipleSampleForAdvancedReferencesTable(ReferencesTableSettings settings) {
		ownerPropertiesEditionPart.initMultipleSampleForAdvancedReferencesTable(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#updateMultipleSampleForAdvancedReferencesTable()
	 * 
	 */
	public void updateMultipleSampleForAdvancedReferencesTable() {
		ownerPropertiesEditionPart.updateMultipleSampleForAdvancedReferencesTable();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#addFilterMultipleSampleForAdvancedReferencesTable(ViewerFilter filter)
	 * 
	 */
	public void addFilterToMultipleSampleForAdvancedReferencesTable(ViewerFilter filter) {
		ownerPropertiesEditionPart.addFilterToMultipleSampleForAdvancedReferencesTable(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#addBusinessFilterMultipleSampleForAdvancedReferencesTable(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMultipleSampleForAdvancedReferencesTable(ViewerFilter filter) {
		ownerPropertiesEditionPart.addBusinessFilterToMultipleSampleForAdvancedReferencesTable(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#isContainedInMultipleSampleForAdvancedReferencesTableTable(EObject element)
	 * 
	 */
	public boolean isContainedInMultipleSampleForAdvancedReferencesTableTable(EObject element) {
		return ownerPropertiesEditionPart.isContainedInMultipleSampleForAdvancedReferencesTableTable(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#initMultipleSampleForFlatReferencesTable(ReferencesTableSettings)
	 */
	public void initMultipleSampleForFlatReferencesTable(ReferencesTableSettings settings) {
		ownerPropertiesEditionPart.initMultipleSampleForFlatReferencesTable(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#updateMultipleSampleForFlatReferencesTable()
	 * 
	 */
	public void updateMultipleSampleForFlatReferencesTable() {
		ownerPropertiesEditionPart.updateMultipleSampleForFlatReferencesTable();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#addFilterMultipleSampleForFlatReferencesTable(ViewerFilter filter)
	 * 
	 */
	public void addFilterToMultipleSampleForFlatReferencesTable(ViewerFilter filter) {
		ownerPropertiesEditionPart.addFilterToMultipleSampleForFlatReferencesTable(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#addBusinessFilterMultipleSampleForFlatReferencesTable(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMultipleSampleForFlatReferencesTable(ViewerFilter filter) {
		ownerPropertiesEditionPart.addBusinessFilterToMultipleSampleForFlatReferencesTable(filter);
	}
	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#isContainedInMultipleSampleForFlatReferencesTableTable(EObject element)
	 * 
	 */
	public boolean isContainedInMultipleSampleForFlatReferencesTableTable(EObject element) {
		return ownerPropertiesEditionPart.isContainedInMultipleSampleForFlatReferencesTableTable(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#initSingleSampleForTableComposition(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initSingleSampleForTableComposition(ReferencesTableSettings settings) {
		ownerPropertiesEditionPart.initSingleSampleForTableComposition(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#updateSingleSampleForTableComposition()
	 * 
	 */
	public void updateSingleSampleForTableComposition() {
		ownerPropertiesEditionPart.updateSingleSampleForTableComposition();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#addFilterSingleSampleForTableComposition(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSingleSampleForTableComposition(ViewerFilter filter) {
		ownerPropertiesEditionPart.addFilterToSingleSampleForTableComposition(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#addBusinessFilterSingleSampleForTableComposition(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSingleSampleForTableComposition(ViewerFilter filter) {
		ownerPropertiesEditionPart.addBusinessFilterToSingleSampleForTableComposition(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#isContainedInSingleSampleForTableCompositionTable(EObject element)
	 * 
	 */
	public boolean isContainedInSingleSampleForTableCompositionTable(EObject element) {
		return ownerPropertiesEditionPart.isContainedInSingleSampleForTableCompositionTable(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#initSingleSampleForAdvancedTableComposition(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initSingleSampleForAdvancedTableComposition(ReferencesTableSettings settings) {
		ownerPropertiesEditionPart.initSingleSampleForAdvancedTableComposition(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#updateSingleSampleForAdvancedTableComposition()
	 * 
	 */
	public void updateSingleSampleForAdvancedTableComposition() {
		ownerPropertiesEditionPart.updateSingleSampleForAdvancedTableComposition();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#addFilterSingleSampleForAdvancedTableComposition(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSingleSampleForAdvancedTableComposition(ViewerFilter filter) {
		ownerPropertiesEditionPart.addFilterToSingleSampleForAdvancedTableComposition(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#addBusinessFilterSingleSampleForAdvancedTableComposition(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSingleSampleForAdvancedTableComposition(ViewerFilter filter) {
		ownerPropertiesEditionPart.addBusinessFilterToSingleSampleForAdvancedTableComposition(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#isContainedInSingleSampleForAdvancedTableCompositionTable(EObject element)
	 * 
	 */
	public boolean isContainedInSingleSampleForAdvancedTableCompositionTable(EObject element) {
		return ownerPropertiesEditionPart.isContainedInSingleSampleForAdvancedTableCompositionTable(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#initSingleSampleForReferencesTable(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initSingleSampleForReferencesTable(ReferencesTableSettings settings) {
		ownerPropertiesEditionPart.initSingleSampleForReferencesTable(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#updateSingleSampleForReferencesTable()
	 * 
	 */
	public void updateSingleSampleForReferencesTable() {
		ownerPropertiesEditionPart.updateSingleSampleForReferencesTable();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#addFilterSingleSampleForReferencesTable(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSingleSampleForReferencesTable(ViewerFilter filter) {
		ownerPropertiesEditionPart.addFilterToSingleSampleForReferencesTable(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#addBusinessFilterSingleSampleForReferencesTable(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSingleSampleForReferencesTable(ViewerFilter filter) {
		ownerPropertiesEditionPart.addBusinessFilterToSingleSampleForReferencesTable(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#isContainedInSingleSampleForReferencesTableTable(EObject element)
	 * 
	 */
	public boolean isContainedInSingleSampleForReferencesTableTable(EObject element) {
		return ownerPropertiesEditionPart.isContainedInSingleSampleForReferencesTableTable(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#initSingleSampleForAdvancedReferencesTable(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initSingleSampleForAdvancedReferencesTable(ReferencesTableSettings settings) {
		ownerPropertiesEditionPart.initSingleSampleForAdvancedReferencesTable(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#updateSingleSampleForAdvancedReferencesTable()
	 * 
	 */
	public void updateSingleSampleForAdvancedReferencesTable() {
		ownerPropertiesEditionPart.updateSingleSampleForAdvancedReferencesTable();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#addFilterSingleSampleForAdvancedReferencesTable(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSingleSampleForAdvancedReferencesTable(ViewerFilter filter) {
		ownerPropertiesEditionPart.addFilterToSingleSampleForAdvancedReferencesTable(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#addBusinessFilterSingleSampleForAdvancedReferencesTable(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSingleSampleForAdvancedReferencesTable(ViewerFilter filter) {
		ownerPropertiesEditionPart.addBusinessFilterToSingleSampleForAdvancedReferencesTable(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#isContainedInSingleSampleForAdvancedReferencesTableTable(EObject element)
	 * 
	 */
	public boolean isContainedInSingleSampleForAdvancedReferencesTableTable(EObject element) {
		return ownerPropertiesEditionPart.isContainedInSingleSampleForAdvancedReferencesTableTable(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#initSingleSampleForFlatReferencesTable(ReferencesTableSettings)
	 */
	public void initSingleSampleForFlatReferencesTable(ReferencesTableSettings settings) {
		ownerPropertiesEditionPart.initSingleSampleForFlatReferencesTable(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#updateSingleSampleForFlatReferencesTable()
	 * 
	 */
	public void updateSingleSampleForFlatReferencesTable() {
		ownerPropertiesEditionPart.updateSingleSampleForFlatReferencesTable();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#addFilterSingleSampleForFlatReferencesTable(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSingleSampleForFlatReferencesTable(ViewerFilter filter) {
		ownerPropertiesEditionPart.addFilterToSingleSampleForFlatReferencesTable(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#addBusinessFilterSingleSampleForFlatReferencesTable(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSingleSampleForFlatReferencesTable(ViewerFilter filter) {
		ownerPropertiesEditionPart.addBusinessFilterToSingleSampleForFlatReferencesTable(filter);
	}
	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#isContainedInSingleSampleForFlatReferencesTableTable(EObject element)
	 * 
	 */
	public boolean isContainedInSingleSampleForFlatReferencesTableTable(EObject element) {
		return ownerPropertiesEditionPart.isContainedInSingleSampleForFlatReferencesTableTable(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#getSingleContainmentForEObjectFlatComboViewer()
	 * 
	 */
	public EObject getSingleContainmentForEObjectFlatComboViewer() {
		return ownerPropertiesEditionPart.getSingleContainmentForEObjectFlatComboViewer();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#initSingleContainmentForEObjectFlatComboViewer(EObjectFlatComboSettings)
	 */
	public void initSingleContainmentForEObjectFlatComboViewer(EObjectFlatComboSettings settings) {
		ownerPropertiesEditionPart.initSingleContainmentForEObjectFlatComboViewer(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#setSingleContainmentForEObjectFlatComboViewer(EObject newValue)
	 * 
	 */
	public void setSingleContainmentForEObjectFlatComboViewer(EObject newValue) {
		ownerPropertiesEditionPart.setSingleContainmentForEObjectFlatComboViewer(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#setSingleContainmentForEObjectFlatComboViewerButtonMode(ButtonsModeEnum newValue)
	 */
	public void setSingleContainmentForEObjectFlatComboViewerButtonMode(ButtonsModeEnum newValue) {
		ownerPropertiesEditionPart.setSingleContainmentForEObjectFlatComboViewerButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#addFilterSingleContainmentForEObjectFlatComboViewer(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSingleContainmentForEObjectFlatComboViewer(ViewerFilter filter) {
		ownerPropertiesEditionPart.addFilterToSingleContainmentForEObjectFlatComboViewer(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#addBusinessFilterSingleContainmentForEObjectFlatComboViewer(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSingleContainmentForEObjectFlatComboViewer(ViewerFilter filter) {
		ownerPropertiesEditionPart.addBusinessFilterToSingleContainmentForEObjectFlatComboViewer(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#getSingleReferencesForEObjectFlatComboViewer()
	 * 
	 */
	public EObject getSingleReferencesForEObjectFlatComboViewer() {
		return ownerPropertiesEditionPart.getSingleReferencesForEObjectFlatComboViewer();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#initSingleReferencesForEObjectFlatComboViewer(EObjectFlatComboSettings)
	 */
	public void initSingleReferencesForEObjectFlatComboViewer(EObjectFlatComboSettings settings) {
		ownerPropertiesEditionPart.initSingleReferencesForEObjectFlatComboViewer(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#setSingleReferencesForEObjectFlatComboViewer(EObject newValue)
	 * 
	 */
	public void setSingleReferencesForEObjectFlatComboViewer(EObject newValue) {
		ownerPropertiesEditionPart.setSingleReferencesForEObjectFlatComboViewer(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#setSingleReferencesForEObjectFlatComboViewerButtonMode(ButtonsModeEnum newValue)
	 */
	public void setSingleReferencesForEObjectFlatComboViewerButtonMode(ButtonsModeEnum newValue) {
		ownerPropertiesEditionPart.setSingleReferencesForEObjectFlatComboViewerButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#addFilterSingleReferencesForEObjectFlatComboViewer(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSingleReferencesForEObjectFlatComboViewer(ViewerFilter filter) {
		ownerPropertiesEditionPart.addFilterToSingleReferencesForEObjectFlatComboViewer(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#addBusinessFilterSingleReferencesForEObjectFlatComboViewer(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSingleReferencesForEObjectFlatComboViewer(ViewerFilter filter) {
		ownerPropertiesEditionPart.addBusinessFilterToSingleReferencesForEObjectFlatComboViewer(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#getSingleContainmentForAdvancedEObjectFlatComboViewer()
	 * 
	 */
	public EObject getSingleContainmentForAdvancedEObjectFlatComboViewer() {
		return ownerPropertiesEditionPart.getSingleContainmentForAdvancedEObjectFlatComboViewer();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#initSingleContainmentForAdvancedEObjectFlatComboViewer(EObjectFlatComboSettings)
	 */
	public void initSingleContainmentForAdvancedEObjectFlatComboViewer(EObjectFlatComboSettings settings) {
		ownerPropertiesEditionPart.initSingleContainmentForAdvancedEObjectFlatComboViewer(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#setSingleContainmentForAdvancedEObjectFlatComboViewer(EObject newValue)
	 * 
	 */
	public void setSingleContainmentForAdvancedEObjectFlatComboViewer(EObject newValue) {
		ownerPropertiesEditionPart.setSingleContainmentForAdvancedEObjectFlatComboViewer(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#setSingleContainmentForAdvancedEObjectFlatComboViewerButtonMode(ButtonsModeEnum newValue)
	 */
	public void setSingleContainmentForAdvancedEObjectFlatComboViewerButtonMode(ButtonsModeEnum newValue) {
		ownerPropertiesEditionPart.setSingleContainmentForAdvancedEObjectFlatComboViewerButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#addFilterSingleContainmentForAdvancedEObjectFlatComboViewer(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSingleContainmentForAdvancedEObjectFlatComboViewer(ViewerFilter filter) {
		ownerPropertiesEditionPart.addFilterToSingleContainmentForAdvancedEObjectFlatComboViewer(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#addBusinessFilterSingleContainmentForAdvancedEObjectFlatComboViewer(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSingleContainmentForAdvancedEObjectFlatComboViewer(ViewerFilter filter) {
		ownerPropertiesEditionPart.addBusinessFilterToSingleContainmentForAdvancedEObjectFlatComboViewer(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#getSingleReferencesForAdvancedEObjectFlatComboViewer()
	 * 
	 */
	public EObject getSingleReferencesForAdvancedEObjectFlatComboViewer() {
		return ownerPropertiesEditionPart.getSingleReferencesForAdvancedEObjectFlatComboViewer();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#initSingleReferencesForAdvancedEObjectFlatComboViewer(EObjectFlatComboSettings)
	 */
	public void initSingleReferencesForAdvancedEObjectFlatComboViewer(EObjectFlatComboSettings settings) {
		ownerPropertiesEditionPart.initSingleReferencesForAdvancedEObjectFlatComboViewer(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#setSingleReferencesForAdvancedEObjectFlatComboViewer(EObject newValue)
	 * 
	 */
	public void setSingleReferencesForAdvancedEObjectFlatComboViewer(EObject newValue) {
		ownerPropertiesEditionPart.setSingleReferencesForAdvancedEObjectFlatComboViewer(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#setSingleReferencesForAdvancedEObjectFlatComboViewerButtonMode(ButtonsModeEnum newValue)
	 */
	public void setSingleReferencesForAdvancedEObjectFlatComboViewerButtonMode(ButtonsModeEnum newValue) {
		ownerPropertiesEditionPart.setSingleReferencesForAdvancedEObjectFlatComboViewerButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#addFilterSingleReferencesForAdvancedEObjectFlatComboViewer(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSingleReferencesForAdvancedEObjectFlatComboViewer(ViewerFilter filter) {
		ownerPropertiesEditionPart.addFilterToSingleReferencesForAdvancedEObjectFlatComboViewer(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#addBusinessFilterSingleReferencesForAdvancedEObjectFlatComboViewer(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSingleReferencesForAdvancedEObjectFlatComboViewer(ViewerFilter filter) {
		ownerPropertiesEditionPart.addBusinessFilterToSingleReferencesForAdvancedEObjectFlatComboViewer(filter);
	}








	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return NavigationMessages.Subtype_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
