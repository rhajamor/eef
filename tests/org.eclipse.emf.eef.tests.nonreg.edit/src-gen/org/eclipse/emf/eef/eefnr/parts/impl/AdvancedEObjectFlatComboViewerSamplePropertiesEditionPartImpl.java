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
package org.eclipse.emf.eef.eefnr.parts.impl;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.eefnr.parts.AdvancedEObjectFlatComboViewerSamplePropertiesEditionPart;
import org.eclipse.emf.eef.eefnr.parts.EefnrViewsRepository;
import org.eclipse.emf.eef.eefnr.providers.EefnrMessages;
import org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.notify.PropertiesEditingEvent;
import org.eclipse.emf.eef.runtime.notify.impl.PropertiesEditingEventImpl;
import org.eclipse.emf.eef.runtime.parts.SWTPropertiesEditingPart;
import org.eclipse.emf.eef.runtime.parts.impl.CompositePropertiesEditingPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.widgets.AdvancedEObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.AdvancedEObjectFlatComboViewer.EObjectFlatComboViewerListener;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
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
public class AdvancedEObjectFlatComboViewerSamplePropertiesEditionPartImpl extends CompositePropertiesEditingPart implements SWTPropertiesEditingPart, AdvancedEObjectFlatComboViewerSamplePropertiesEditionPart {

	private AdvancedEObjectFlatComboViewer advancedeobjectflatcomboviewerRequiredProperty;
	protected ViewerFilter advancedeobjectflatcomboviewerRequiredPropertyFilter;
	private AdvancedEObjectFlatComboViewer advancedeobjectflatcomboviewerOptionalProperty;
	protected ViewerFilter advancedeobjectflatcomboviewerOptionalPropertyFilter;



	/**
	 * Default constructor
	 * @param editionComponent the {@link PropertiesEditingComponent} that manage this part
	 * 
	 */
	public AdvancedEObjectFlatComboViewerSamplePropertiesEditionPartImpl(PropertiesEditingComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.parts.SWTPropertiesEditingPart#
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
	 * @see org.eclipse.emf.eef.runtime.parts.SWTPropertiesEditingPart#
	 * 			createControls(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(Composite view) { 
		CompositionSequence advancedEObjectFlatComboViewerSampleStep = new CompositionSequence();
		CompositionStep propertiesStep = advancedEObjectFlatComboViewerSampleStep.addStep(EefnrViewsRepository.AdvancedEObjectFlatComboViewerSample.Properties.class);
		propertiesStep.addStep(EefnrViewsRepository.AdvancedEObjectFlatComboViewerSample.Properties.advancedeobjectflatcomboviewerRequiredProperty);
		propertiesStep.addStep(EefnrViewsRepository.AdvancedEObjectFlatComboViewerSample.Properties.advancedeobjectflatcomboviewerOptionalProperty);
		
		
		composer = new PartComposer(advancedEObjectFlatComboViewerSampleStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EefnrViewsRepository.AdvancedEObjectFlatComboViewerSample.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == EefnrViewsRepository.AdvancedEObjectFlatComboViewerSample.Properties.advancedeobjectflatcomboviewerRequiredProperty) {
					return createAdvancedeobjectflatcomboviewerRequiredPropertyAdvancedFlatComboViewer(parent);
				}
				if (key == EefnrViewsRepository.AdvancedEObjectFlatComboViewerSample.Properties.advancedeobjectflatcomboviewerOptionalProperty) {
					return createAdvancedeobjectflatcomboviewerOptionalPropertyAdvancedFlatComboViewer(parent);
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
		propertiesGroup.setText(EefnrMessages.AdvancedEObjectFlatComboViewerSamplePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createAdvancedeobjectflatcomboviewerRequiredPropertyAdvancedFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, EefnrMessages.AdvancedEObjectFlatComboViewerSamplePropertiesEditionPart_AdvancedeobjectflatcomboviewerRequiredPropertyLabel, propertiesEditingComponent.isRequired(EefnrViewsRepository.AdvancedEObjectFlatComboViewerSample.Properties.advancedeobjectflatcomboviewerRequiredProperty, EefnrViewsRepository.SWT_KIND));
		// create callback listener
		EObjectFlatComboViewerListener listener = new EObjectFlatComboViewerListener(){
			public void handleSet(EObject element){
				propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(AdvancedEObjectFlatComboViewerSamplePropertiesEditionPartImpl.this, EefnrViewsRepository.AdvancedEObjectFlatComboViewerSample.Properties.advancedeobjectflatcomboviewerRequiredProperty, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, element)); 
			}
			public void navigateTo(EObject element){ }

			public EObject handleCreate() {
				propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(AdvancedEObjectFlatComboViewerSamplePropertiesEditionPartImpl.this, EefnrViewsRepository.AdvancedEObjectFlatComboViewerSample.Properties.advancedeobjectflatcomboviewerRequiredProperty, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.ADD, null, null)); 
				return null;
			}
		};
		//create widget
		advancedeobjectflatcomboviewerRequiredProperty = new AdvancedEObjectFlatComboViewer(EefnrMessages.AdvancedEObjectFlatComboViewerSamplePropertiesEditionPart_AdvancedeobjectflatcomboviewerRequiredPropertyLabel, resourceSet, advancedeobjectflatcomboviewerRequiredPropertyFilter, propertiesEditingComponent.getEditingContext().getAdapterFactory(), listener);
		advancedeobjectflatcomboviewerRequiredProperty.createControls(parent);
		GridData advancedeobjectflatcomboviewerRequiredPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		advancedeobjectflatcomboviewerRequiredProperty.setLayoutData(advancedeobjectflatcomboviewerRequiredPropertyData);
		advancedeobjectflatcomboviewerRequiredProperty.setID(EefnrViewsRepository.AdvancedEObjectFlatComboViewerSample.Properties.advancedeobjectflatcomboviewerRequiredProperty);
		SWTUtils.createHelpButton(parent, propertiesEditingComponent.getHelpContent(EefnrViewsRepository.AdvancedEObjectFlatComboViewerSample.Properties.advancedeobjectflatcomboviewerRequiredProperty, EefnrViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createAdvancedeobjectflatcomboviewerOptionalPropertyAdvancedFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, EefnrMessages.AdvancedEObjectFlatComboViewerSamplePropertiesEditionPart_AdvancedeobjectflatcomboviewerOptionalPropertyLabel, propertiesEditingComponent.isRequired(EefnrViewsRepository.AdvancedEObjectFlatComboViewerSample.Properties.advancedeobjectflatcomboviewerOptionalProperty, EefnrViewsRepository.SWT_KIND));
		// create callback listener
		EObjectFlatComboViewerListener listener = new EObjectFlatComboViewerListener(){
			public void handleSet(EObject element){
				propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(AdvancedEObjectFlatComboViewerSamplePropertiesEditionPartImpl.this, EefnrViewsRepository.AdvancedEObjectFlatComboViewerSample.Properties.advancedeobjectflatcomboviewerOptionalProperty, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, element)); 
			}
			public void navigateTo(EObject element){ }

			public EObject handleCreate() {
				propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(AdvancedEObjectFlatComboViewerSamplePropertiesEditionPartImpl.this, EefnrViewsRepository.AdvancedEObjectFlatComboViewerSample.Properties.advancedeobjectflatcomboviewerOptionalProperty, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.ADD, null, null)); 
				return null;
			}
		};
		//create widget
		advancedeobjectflatcomboviewerOptionalProperty = new AdvancedEObjectFlatComboViewer(EefnrMessages.AdvancedEObjectFlatComboViewerSamplePropertiesEditionPart_AdvancedeobjectflatcomboviewerOptionalPropertyLabel, resourceSet, advancedeobjectflatcomboviewerOptionalPropertyFilter, propertiesEditingComponent.getEditingContext().getAdapterFactory(), listener);
		advancedeobjectflatcomboviewerOptionalProperty.createControls(parent);
		GridData advancedeobjectflatcomboviewerOptionalPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		advancedeobjectflatcomboviewerOptionalProperty.setLayoutData(advancedeobjectflatcomboviewerOptionalPropertyData);
		advancedeobjectflatcomboviewerOptionalProperty.setID(EefnrViewsRepository.AdvancedEObjectFlatComboViewerSample.Properties.advancedeobjectflatcomboviewerOptionalProperty);
		SWTUtils.createHelpButton(parent, propertiesEditingComponent.getHelpContent(EefnrViewsRepository.AdvancedEObjectFlatComboViewerSample.Properties.advancedeobjectflatcomboviewerOptionalProperty, EefnrViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see org.eclipse.emf.eef.runtime.parts.PropertiesEditingPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EefnrMessages.AdvancedEObjectFlatComboViewerSample_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
