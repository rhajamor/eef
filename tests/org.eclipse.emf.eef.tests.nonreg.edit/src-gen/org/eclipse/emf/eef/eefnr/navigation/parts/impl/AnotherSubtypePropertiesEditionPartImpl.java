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
import org.eclipse.emf.eef.eefnr.navigation.parts.AnotherSubtypePropertiesEditionPart;
import org.eclipse.emf.eef.eefnr.navigation.parts.NavigationViewsRepository;
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
public class AnotherSubtypePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, AnotherSubtypePropertiesEditionPart {

	protected Button anotherSpecialisationElement;
	private SubtypePropertiesEditionPart subtypePropertiesEditionPart;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public AnotherSubtypePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence anotherSubtypeStep = new BindingCompositionSequence(propertiesEditionComponent);
		anotherSubtypeStep.addStep(NavigationViewsRepository.AnotherSubtype.subtypeView);
		anotherSubtypeStep
			.addStep(NavigationViewsRepository.AnotherSubtype.AnotherSpecialisation.class)
			.addStep(NavigationViewsRepository.AnotherSubtype.AnotherSpecialisation.anotherSpecialisationElement);
		
		
		composer = new PartComposer(anotherSubtypeStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == NavigationViewsRepository.AnotherSubtype.subtypeView) {
					return createSubtype(parent);
				}
				if (key == NavigationViewsRepository.AnotherSubtype.AnotherSpecialisation.class) {
					return createAnotherSpecialisationGroup(parent);
				}
				if (key == NavigationViewsRepository.AnotherSubtype.AnotherSpecialisation.anotherSpecialisationElement) {
					return createAnotherSpecialisationElementCheckbox(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	protected Composite createSubtype(Composite container) {
		IPropertiesEditionPartProvider provider = PropertiesEditionPartProviderService.getInstance().getProvider(NavigationViewsRepository.class);
		subtypePropertiesEditionPart = (SubtypePropertiesEditionPart)provider.getPropertiesEditionPart(NavigationViewsRepository.Subtype.class, NavigationViewsRepository.SWT_KIND, propertiesEditionComponent);
		((ISWTPropertiesEditionPart)subtypePropertiesEditionPart).createControls(container);
		return container;
	}


	/**
	 * 
	 */
	protected Composite createAnotherSpecialisationGroup(Composite parent) {
		Group anotherSpecialisationGroup = new Group(parent, SWT.NONE);
		anotherSpecialisationGroup.setText(NavigationMessages.AnotherSubtypePropertiesEditionPart_AnotherSpecialisationGroupLabel);
		GridData anotherSpecialisationGroupData = new GridData(GridData.FILL_HORIZONTAL);
		anotherSpecialisationGroupData.horizontalSpan = 3;
		anotherSpecialisationGroup.setLayoutData(anotherSpecialisationGroupData);
		GridLayout anotherSpecialisationGroupLayout = new GridLayout();
		anotherSpecialisationGroupLayout.numColumns = 3;
		anotherSpecialisationGroup.setLayout(anotherSpecialisationGroupLayout);
		return anotherSpecialisationGroup;
	}

	
	protected Composite createAnotherSpecialisationElementCheckbox(Composite parent) {
		anotherSpecialisationElement = new Button(parent, SWT.CHECK);
		anotherSpecialisationElement.setText(NavigationMessages.AnotherSubtypePropertiesEditionPart_AnotherSpecialisationElementLabel);
		anotherSpecialisationElement.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnotherSubtypePropertiesEditionPartImpl.this, NavigationViewsRepository.AnotherSubtype.AnotherSpecialisation.anotherSpecialisationElement, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(anotherSpecialisationElement.getSelection())));
			}

		});
		GridData anotherSpecialisationElementData = new GridData(GridData.FILL_HORIZONTAL);
		anotherSpecialisationElementData.horizontalSpan = 2;
		anotherSpecialisationElement.setLayoutData(anotherSpecialisationElementData);
		EditingUtils.setID(anotherSpecialisationElement, NavigationViewsRepository.AnotherSubtype.AnotherSpecialisation.anotherSpecialisationElement);
		EditingUtils.setEEFtype(anotherSpecialisationElement, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NavigationViewsRepository.AnotherSubtype.AnotherSpecialisation.anotherSpecialisationElement, NavigationViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see org.eclipse.emf.eef.navigation.parts.AnotherSubtypePropertiesEditionPart#getAnotherSpecialisationElement()
	 * 
	 */
	public Boolean getAnotherSpecialisationElement() {
		return Boolean.valueOf(anotherSpecialisationElement.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.AnotherSubtypePropertiesEditionPart#setAnotherSpecialisationElement(Boolean newValue)
	 * 
	 */
	public void setAnotherSpecialisationElement(Boolean newValue) {
		if (newValue != null) {
			anotherSpecialisationElement.setSelection(newValue.booleanValue());
		} else {
			anotherSpecialisationElement.setSelection(false);
		}
	}


/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.AnotherSubtypePropertiesEditionPart#getSubtypeReferencedView()
	 * 
	 */
		public IPropertiesEditionPart getSubtypeReferencedView() {
			return (IPropertiesEditionPart) subtypePropertiesEditionPart;
		}
	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.AnotherSubtypePropertiesEditionPart#getSpecialisedElement()
	 * 
	 */
	public Boolean getSpecialisedElement() {
		return subtypePropertiesEditionPart.getSpecialisedElement();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.AnotherSubtypePropertiesEditionPart#setSpecialisedElement(Boolean newValue)
	 * 
	 */
	public void setSpecialisedElement(Boolean newValue) {
		subtypePropertiesEditionPart.setSpecialisedElement(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return subtypePropertiesEditionPart.getName();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		subtypePropertiesEditionPart.setName(newValue);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#initMultipleSampleForTableComposition(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initMultipleSampleForTableComposition(ReferencesTableSettings settings) {
		subtypePropertiesEditionPart.initMultipleSampleForTableComposition(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#updateMultipleSampleForTableComposition()
	 * 
	 */
	public void updateMultipleSampleForTableComposition() {
		subtypePropertiesEditionPart.updateMultipleSampleForTableComposition();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#addFilterMultipleSampleForTableComposition(ViewerFilter filter)
	 * 
	 */
	public void addFilterToMultipleSampleForTableComposition(ViewerFilter filter) {
		subtypePropertiesEditionPart.addFilterToMultipleSampleForTableComposition(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#addBusinessFilterMultipleSampleForTableComposition(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMultipleSampleForTableComposition(ViewerFilter filter) {
		subtypePropertiesEditionPart.addBusinessFilterToMultipleSampleForTableComposition(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#isContainedInMultipleSampleForTableCompositionTable(EObject element)
	 * 
	 */
	public boolean isContainedInMultipleSampleForTableCompositionTable(EObject element) {
		return subtypePropertiesEditionPart.isContainedInMultipleSampleForTableCompositionTable(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#initMultipleSampleForAdvancedTableComposition(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initMultipleSampleForAdvancedTableComposition(ReferencesTableSettings settings) {
		subtypePropertiesEditionPart.initMultipleSampleForAdvancedTableComposition(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#updateMultipleSampleForAdvancedTableComposition()
	 * 
	 */
	public void updateMultipleSampleForAdvancedTableComposition() {
		subtypePropertiesEditionPart.updateMultipleSampleForAdvancedTableComposition();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#addFilterMultipleSampleForAdvancedTableComposition(ViewerFilter filter)
	 * 
	 */
	public void addFilterToMultipleSampleForAdvancedTableComposition(ViewerFilter filter) {
		subtypePropertiesEditionPart.addFilterToMultipleSampleForAdvancedTableComposition(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#addBusinessFilterMultipleSampleForAdvancedTableComposition(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMultipleSampleForAdvancedTableComposition(ViewerFilter filter) {
		subtypePropertiesEditionPart.addBusinessFilterToMultipleSampleForAdvancedTableComposition(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#isContainedInMultipleSampleForAdvancedTableCompositionTable(EObject element)
	 * 
	 */
	public boolean isContainedInMultipleSampleForAdvancedTableCompositionTable(EObject element) {
		return subtypePropertiesEditionPart.isContainedInMultipleSampleForAdvancedTableCompositionTable(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#initMultipleSampleForReferencesTable(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initMultipleSampleForReferencesTable(ReferencesTableSettings settings) {
		subtypePropertiesEditionPart.initMultipleSampleForReferencesTable(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#updateMultipleSampleForReferencesTable()
	 * 
	 */
	public void updateMultipleSampleForReferencesTable() {
		subtypePropertiesEditionPart.updateMultipleSampleForReferencesTable();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#addFilterMultipleSampleForReferencesTable(ViewerFilter filter)
	 * 
	 */
	public void addFilterToMultipleSampleForReferencesTable(ViewerFilter filter) {
		subtypePropertiesEditionPart.addFilterToMultipleSampleForReferencesTable(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#addBusinessFilterMultipleSampleForReferencesTable(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMultipleSampleForReferencesTable(ViewerFilter filter) {
		subtypePropertiesEditionPart.addBusinessFilterToMultipleSampleForReferencesTable(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#isContainedInMultipleSampleForReferencesTableTable(EObject element)
	 * 
	 */
	public boolean isContainedInMultipleSampleForReferencesTableTable(EObject element) {
		return subtypePropertiesEditionPart.isContainedInMultipleSampleForReferencesTableTable(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#initMultipleSampleForAdvancedReferencesTable(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initMultipleSampleForAdvancedReferencesTable(ReferencesTableSettings settings) {
		subtypePropertiesEditionPart.initMultipleSampleForAdvancedReferencesTable(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#updateMultipleSampleForAdvancedReferencesTable()
	 * 
	 */
	public void updateMultipleSampleForAdvancedReferencesTable() {
		subtypePropertiesEditionPart.updateMultipleSampleForAdvancedReferencesTable();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#addFilterMultipleSampleForAdvancedReferencesTable(ViewerFilter filter)
	 * 
	 */
	public void addFilterToMultipleSampleForAdvancedReferencesTable(ViewerFilter filter) {
		subtypePropertiesEditionPart.addFilterToMultipleSampleForAdvancedReferencesTable(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#addBusinessFilterMultipleSampleForAdvancedReferencesTable(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMultipleSampleForAdvancedReferencesTable(ViewerFilter filter) {
		subtypePropertiesEditionPart.addBusinessFilterToMultipleSampleForAdvancedReferencesTable(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#isContainedInMultipleSampleForAdvancedReferencesTableTable(EObject element)
	 * 
	 */
	public boolean isContainedInMultipleSampleForAdvancedReferencesTableTable(EObject element) {
		return subtypePropertiesEditionPart.isContainedInMultipleSampleForAdvancedReferencesTableTable(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#initMultipleSampleForFlatReferencesTable(ReferencesTableSettings)
	 */
	public void initMultipleSampleForFlatReferencesTable(ReferencesTableSettings settings) {
		subtypePropertiesEditionPart.initMultipleSampleForFlatReferencesTable(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#updateMultipleSampleForFlatReferencesTable()
	 * 
	 */
	public void updateMultipleSampleForFlatReferencesTable() {
		subtypePropertiesEditionPart.updateMultipleSampleForFlatReferencesTable();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#addFilterMultipleSampleForFlatReferencesTable(ViewerFilter filter)
	 * 
	 */
	public void addFilterToMultipleSampleForFlatReferencesTable(ViewerFilter filter) {
		subtypePropertiesEditionPart.addFilterToMultipleSampleForFlatReferencesTable(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#addBusinessFilterMultipleSampleForFlatReferencesTable(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMultipleSampleForFlatReferencesTable(ViewerFilter filter) {
		subtypePropertiesEditionPart.addBusinessFilterToMultipleSampleForFlatReferencesTable(filter);
	}
	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#isContainedInMultipleSampleForFlatReferencesTableTable(EObject element)
	 * 
	 */
	public boolean isContainedInMultipleSampleForFlatReferencesTableTable(EObject element) {
		return subtypePropertiesEditionPart.isContainedInMultipleSampleForFlatReferencesTableTable(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#initSingleSampleForTableComposition(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initSingleSampleForTableComposition(ReferencesTableSettings settings) {
		subtypePropertiesEditionPart.initSingleSampleForTableComposition(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#updateSingleSampleForTableComposition()
	 * 
	 */
	public void updateSingleSampleForTableComposition() {
		subtypePropertiesEditionPart.updateSingleSampleForTableComposition();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#addFilterSingleSampleForTableComposition(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSingleSampleForTableComposition(ViewerFilter filter) {
		subtypePropertiesEditionPart.addFilterToSingleSampleForTableComposition(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#addBusinessFilterSingleSampleForTableComposition(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSingleSampleForTableComposition(ViewerFilter filter) {
		subtypePropertiesEditionPart.addBusinessFilterToSingleSampleForTableComposition(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#isContainedInSingleSampleForTableCompositionTable(EObject element)
	 * 
	 */
	public boolean isContainedInSingleSampleForTableCompositionTable(EObject element) {
		return subtypePropertiesEditionPart.isContainedInSingleSampleForTableCompositionTable(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#initSingleSampleForAdvancedTableComposition(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initSingleSampleForAdvancedTableComposition(ReferencesTableSettings settings) {
		subtypePropertiesEditionPart.initSingleSampleForAdvancedTableComposition(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#updateSingleSampleForAdvancedTableComposition()
	 * 
	 */
	public void updateSingleSampleForAdvancedTableComposition() {
		subtypePropertiesEditionPart.updateSingleSampleForAdvancedTableComposition();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#addFilterSingleSampleForAdvancedTableComposition(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSingleSampleForAdvancedTableComposition(ViewerFilter filter) {
		subtypePropertiesEditionPart.addFilterToSingleSampleForAdvancedTableComposition(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#addBusinessFilterSingleSampleForAdvancedTableComposition(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSingleSampleForAdvancedTableComposition(ViewerFilter filter) {
		subtypePropertiesEditionPart.addBusinessFilterToSingleSampleForAdvancedTableComposition(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#isContainedInSingleSampleForAdvancedTableCompositionTable(EObject element)
	 * 
	 */
	public boolean isContainedInSingleSampleForAdvancedTableCompositionTable(EObject element) {
		return subtypePropertiesEditionPart.isContainedInSingleSampleForAdvancedTableCompositionTable(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#initSingleSampleForReferencesTable(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initSingleSampleForReferencesTable(ReferencesTableSettings settings) {
		subtypePropertiesEditionPart.initSingleSampleForReferencesTable(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#updateSingleSampleForReferencesTable()
	 * 
	 */
	public void updateSingleSampleForReferencesTable() {
		subtypePropertiesEditionPart.updateSingleSampleForReferencesTable();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#addFilterSingleSampleForReferencesTable(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSingleSampleForReferencesTable(ViewerFilter filter) {
		subtypePropertiesEditionPart.addFilterToSingleSampleForReferencesTable(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#addBusinessFilterSingleSampleForReferencesTable(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSingleSampleForReferencesTable(ViewerFilter filter) {
		subtypePropertiesEditionPart.addBusinessFilterToSingleSampleForReferencesTable(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#isContainedInSingleSampleForReferencesTableTable(EObject element)
	 * 
	 */
	public boolean isContainedInSingleSampleForReferencesTableTable(EObject element) {
		return subtypePropertiesEditionPart.isContainedInSingleSampleForReferencesTableTable(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#initSingleSampleForAdvancedReferencesTable(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initSingleSampleForAdvancedReferencesTable(ReferencesTableSettings settings) {
		subtypePropertiesEditionPart.initSingleSampleForAdvancedReferencesTable(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#updateSingleSampleForAdvancedReferencesTable()
	 * 
	 */
	public void updateSingleSampleForAdvancedReferencesTable() {
		subtypePropertiesEditionPart.updateSingleSampleForAdvancedReferencesTable();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#addFilterSingleSampleForAdvancedReferencesTable(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSingleSampleForAdvancedReferencesTable(ViewerFilter filter) {
		subtypePropertiesEditionPart.addFilterToSingleSampleForAdvancedReferencesTable(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#addBusinessFilterSingleSampleForAdvancedReferencesTable(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSingleSampleForAdvancedReferencesTable(ViewerFilter filter) {
		subtypePropertiesEditionPart.addBusinessFilterToSingleSampleForAdvancedReferencesTable(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#isContainedInSingleSampleForAdvancedReferencesTableTable(EObject element)
	 * 
	 */
	public boolean isContainedInSingleSampleForAdvancedReferencesTableTable(EObject element) {
		return subtypePropertiesEditionPart.isContainedInSingleSampleForAdvancedReferencesTableTable(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#initSingleSampleForFlatReferencesTable(ReferencesTableSettings)
	 */
	public void initSingleSampleForFlatReferencesTable(ReferencesTableSettings settings) {
		subtypePropertiesEditionPart.initSingleSampleForFlatReferencesTable(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#updateSingleSampleForFlatReferencesTable()
	 * 
	 */
	public void updateSingleSampleForFlatReferencesTable() {
		subtypePropertiesEditionPart.updateSingleSampleForFlatReferencesTable();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#addFilterSingleSampleForFlatReferencesTable(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSingleSampleForFlatReferencesTable(ViewerFilter filter) {
		subtypePropertiesEditionPart.addFilterToSingleSampleForFlatReferencesTable(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#addBusinessFilterSingleSampleForFlatReferencesTable(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSingleSampleForFlatReferencesTable(ViewerFilter filter) {
		subtypePropertiesEditionPart.addBusinessFilterToSingleSampleForFlatReferencesTable(filter);
	}
	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#isContainedInSingleSampleForFlatReferencesTableTable(EObject element)
	 * 
	 */
	public boolean isContainedInSingleSampleForFlatReferencesTableTable(EObject element) {
		return subtypePropertiesEditionPart.isContainedInSingleSampleForFlatReferencesTableTable(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#getSingleContainmentForEObjectFlatComboViewer()
	 * 
	 */
	public EObject getSingleContainmentForEObjectFlatComboViewer() {
		return subtypePropertiesEditionPart.getSingleContainmentForEObjectFlatComboViewer();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#initSingleContainmentForEObjectFlatComboViewer(EObjectFlatComboSettings)
	 */
	public void initSingleContainmentForEObjectFlatComboViewer(EObjectFlatComboSettings settings) {
		subtypePropertiesEditionPart.initSingleContainmentForEObjectFlatComboViewer(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#setSingleContainmentForEObjectFlatComboViewer(EObject newValue)
	 * 
	 */
	public void setSingleContainmentForEObjectFlatComboViewer(EObject newValue) {
		subtypePropertiesEditionPart.setSingleContainmentForEObjectFlatComboViewer(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#setSingleContainmentForEObjectFlatComboViewerButtonMode(ButtonsModeEnum newValue)
	 */
	public void setSingleContainmentForEObjectFlatComboViewerButtonMode(ButtonsModeEnum newValue) {
		subtypePropertiesEditionPart.setSingleContainmentForEObjectFlatComboViewerButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#addFilterSingleContainmentForEObjectFlatComboViewer(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSingleContainmentForEObjectFlatComboViewer(ViewerFilter filter) {
		subtypePropertiesEditionPart.addFilterToSingleContainmentForEObjectFlatComboViewer(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#addBusinessFilterSingleContainmentForEObjectFlatComboViewer(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSingleContainmentForEObjectFlatComboViewer(ViewerFilter filter) {
		subtypePropertiesEditionPart.addBusinessFilterToSingleContainmentForEObjectFlatComboViewer(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#getSingleReferencesForEObjectFlatComboViewer()
	 * 
	 */
	public EObject getSingleReferencesForEObjectFlatComboViewer() {
		return subtypePropertiesEditionPart.getSingleReferencesForEObjectFlatComboViewer();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#initSingleReferencesForEObjectFlatComboViewer(EObjectFlatComboSettings)
	 */
	public void initSingleReferencesForEObjectFlatComboViewer(EObjectFlatComboSettings settings) {
		subtypePropertiesEditionPart.initSingleReferencesForEObjectFlatComboViewer(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#setSingleReferencesForEObjectFlatComboViewer(EObject newValue)
	 * 
	 */
	public void setSingleReferencesForEObjectFlatComboViewer(EObject newValue) {
		subtypePropertiesEditionPart.setSingleReferencesForEObjectFlatComboViewer(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#setSingleReferencesForEObjectFlatComboViewerButtonMode(ButtonsModeEnum newValue)
	 */
	public void setSingleReferencesForEObjectFlatComboViewerButtonMode(ButtonsModeEnum newValue) {
		subtypePropertiesEditionPart.setSingleReferencesForEObjectFlatComboViewerButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#addFilterSingleReferencesForEObjectFlatComboViewer(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSingleReferencesForEObjectFlatComboViewer(ViewerFilter filter) {
		subtypePropertiesEditionPart.addFilterToSingleReferencesForEObjectFlatComboViewer(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#addBusinessFilterSingleReferencesForEObjectFlatComboViewer(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSingleReferencesForEObjectFlatComboViewer(ViewerFilter filter) {
		subtypePropertiesEditionPart.addBusinessFilterToSingleReferencesForEObjectFlatComboViewer(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#getSingleContainmentForAdvancedEObjectFlatComboViewer()
	 * 
	 */
	public EObject getSingleContainmentForAdvancedEObjectFlatComboViewer() {
		return subtypePropertiesEditionPart.getSingleContainmentForAdvancedEObjectFlatComboViewer();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#initSingleContainmentForAdvancedEObjectFlatComboViewer(EObjectFlatComboSettings)
	 */
	public void initSingleContainmentForAdvancedEObjectFlatComboViewer(EObjectFlatComboSettings settings) {
		subtypePropertiesEditionPart.initSingleContainmentForAdvancedEObjectFlatComboViewer(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#setSingleContainmentForAdvancedEObjectFlatComboViewer(EObject newValue)
	 * 
	 */
	public void setSingleContainmentForAdvancedEObjectFlatComboViewer(EObject newValue) {
		subtypePropertiesEditionPart.setSingleContainmentForAdvancedEObjectFlatComboViewer(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#setSingleContainmentForAdvancedEObjectFlatComboViewerButtonMode(ButtonsModeEnum newValue)
	 */
	public void setSingleContainmentForAdvancedEObjectFlatComboViewerButtonMode(ButtonsModeEnum newValue) {
		subtypePropertiesEditionPart.setSingleContainmentForAdvancedEObjectFlatComboViewerButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#addFilterSingleContainmentForAdvancedEObjectFlatComboViewer(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSingleContainmentForAdvancedEObjectFlatComboViewer(ViewerFilter filter) {
		subtypePropertiesEditionPart.addFilterToSingleContainmentForAdvancedEObjectFlatComboViewer(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#addBusinessFilterSingleContainmentForAdvancedEObjectFlatComboViewer(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSingleContainmentForAdvancedEObjectFlatComboViewer(ViewerFilter filter) {
		subtypePropertiesEditionPart.addBusinessFilterToSingleContainmentForAdvancedEObjectFlatComboViewer(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#getSingleReferencesForAdvancedEObjectFlatComboViewer()
	 * 
	 */
	public EObject getSingleReferencesForAdvancedEObjectFlatComboViewer() {
		return subtypePropertiesEditionPart.getSingleReferencesForAdvancedEObjectFlatComboViewer();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#initSingleReferencesForAdvancedEObjectFlatComboViewer(EObjectFlatComboSettings)
	 */
	public void initSingleReferencesForAdvancedEObjectFlatComboViewer(EObjectFlatComboSettings settings) {
		subtypePropertiesEditionPart.initSingleReferencesForAdvancedEObjectFlatComboViewer(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#setSingleReferencesForAdvancedEObjectFlatComboViewer(EObject newValue)
	 * 
	 */
	public void setSingleReferencesForAdvancedEObjectFlatComboViewer(EObject newValue) {
		subtypePropertiesEditionPart.setSingleReferencesForAdvancedEObjectFlatComboViewer(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#setSingleReferencesForAdvancedEObjectFlatComboViewerButtonMode(ButtonsModeEnum newValue)
	 */
	public void setSingleReferencesForAdvancedEObjectFlatComboViewerButtonMode(ButtonsModeEnum newValue) {
		subtypePropertiesEditionPart.setSingleReferencesForAdvancedEObjectFlatComboViewerButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#addFilterSingleReferencesForAdvancedEObjectFlatComboViewer(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSingleReferencesForAdvancedEObjectFlatComboViewer(ViewerFilter filter) {
		subtypePropertiesEditionPart.addFilterToSingleReferencesForAdvancedEObjectFlatComboViewer(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.SubtypePropertiesEditionPart#addBusinessFilterSingleReferencesForAdvancedEObjectFlatComboViewer(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSingleReferencesForAdvancedEObjectFlatComboViewer(ViewerFilter filter) {
		subtypePropertiesEditionPart.addBusinessFilterToSingleReferencesForAdvancedEObjectFlatComboViewer(filter);
	}









	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return NavigationMessages.AnotherSubtype_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
