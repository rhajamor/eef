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
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.eefnr.EefnrPackage;
import org.eclipse.emf.eef.eefnr.parts.EefnrViewsRepository;
import org.eclipse.emf.eef.eefnr.parts.MultiValuedEditorSamplePropertiesEditionPart;
import org.eclipse.emf.eef.eefnr.providers.EefnrMessages;
import org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.notify.PropertiesEditingEvent;
import org.eclipse.emf.eef.runtime.notify.impl.PropertiesEditingEventImpl;
import org.eclipse.emf.eef.runtime.parts.SWTPropertiesEditingPart;
import org.eclipse.emf.eef.runtime.parts.impl.CompositePropertiesEditingPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.EEFFeatureEditorDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;



// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class MultiValuedEditorSamplePropertiesEditionPartImpl extends CompositePropertiesEditingPart implements SWTPropertiesEditingPart, MultiValuedEditorSamplePropertiesEditionPart {

	protected Text multivaluededitorRequiredProperty;
	protected Button editMultivaluededitorRequiredProperty;
	private EList multivaluededitorRequiredPropertyList;
	protected Text multivaluededitorOptionalProperty;
	protected Button editMultivaluededitorOptionalProperty;
	private EList multivaluededitorOptionalPropertyList;



	/**
	 * Default constructor
	 * @param editionComponent the {@link PropertiesEditingComponent} that manage this part
	 * 
	 */
	public MultiValuedEditorSamplePropertiesEditionPartImpl(PropertiesEditingComponent editionComponent) {
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
		CompositionSequence multiValuedEditorSampleStep = new CompositionSequence();
		CompositionStep propertiesStep = multiValuedEditorSampleStep.addStep(EefnrViewsRepository.MultiValuedEditorSample.Properties.class);
		propertiesStep.addStep(EefnrViewsRepository.MultiValuedEditorSample.Properties.multivaluededitorRequiredProperty);
		propertiesStep.addStep(EefnrViewsRepository.MultiValuedEditorSample.Properties.multivaluededitorOptionalProperty);
		
		
		composer = new PartComposer(multiValuedEditorSampleStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EefnrViewsRepository.MultiValuedEditorSample.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == EefnrViewsRepository.MultiValuedEditorSample.Properties.multivaluededitorRequiredProperty) {
					return createMultivaluededitorRequiredPropertyMultiValuedEditor(parent);
				}
				if (key == EefnrViewsRepository.MultiValuedEditorSample.Properties.multivaluededitorOptionalProperty) {
					return createMultivaluededitorOptionalPropertyMultiValuedEditor(parent);
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
		propertiesGroup.setText(EefnrMessages.MultiValuedEditorSamplePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	protected Composite createMultivaluededitorRequiredPropertyMultiValuedEditor(Composite parent) {
		multivaluededitorRequiredProperty = new Text(parent, SWT.BORDER | SWT.READ_ONLY);
		GridData multivaluededitorRequiredPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		multivaluededitorRequiredPropertyData.horizontalSpan = 2;
		multivaluededitorRequiredProperty.setLayoutData(multivaluededitorRequiredPropertyData);
		EditingUtils.setID(multivaluededitorRequiredProperty, EefnrViewsRepository.MultiValuedEditorSample.Properties.multivaluededitorRequiredProperty);
		EditingUtils.setEEFtype(multivaluededitorRequiredProperty, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editMultivaluededitorRequiredProperty = new Button(parent, SWT.NONE);
		editMultivaluededitorRequiredProperty.setText(EefnrMessages.MultiValuedEditorSamplePropertiesEditionPart_MultivaluededitorRequiredPropertyLabel);
		GridData editMultivaluededitorRequiredPropertyData = new GridData();
		editMultivaluededitorRequiredProperty.setLayoutData(editMultivaluededitorRequiredPropertyData);
		editMultivaluededitorRequiredProperty.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			public void widgetSelected(SelectionEvent e) {
				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(
						multivaluededitorRequiredProperty.getShell(), "MultiValuedEditorSample", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						multivaluededitorRequiredPropertyList, EefnrPackage.eINSTANCE.getMultiValuedEditorSample_MultivaluededitorRequiredProperty().getEType(), null,
						false, true, 
						null, null);
				if (dialog.open() == Window.OK) {
					multivaluededitorRequiredPropertyList = dialog.getResult();
					if (multivaluededitorRequiredPropertyList == null) {
						multivaluededitorRequiredPropertyList = new BasicEList();
					}
					multivaluededitorRequiredProperty.setText(multivaluededitorRequiredPropertyList.toString());
					propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(MultiValuedEditorSamplePropertiesEditionPartImpl.this, EefnrViewsRepository.MultiValuedEditorSample.Properties.multivaluededitorRequiredProperty, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, new BasicEList(multivaluededitorRequiredPropertyList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editMultivaluededitorRequiredProperty, EefnrViewsRepository.MultiValuedEditorSample.Properties.multivaluededitorRequiredProperty);
		EditingUtils.setEEFtype(editMultivaluededitorRequiredProperty, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
		return parent;
	}

	protected Composite createMultivaluededitorOptionalPropertyMultiValuedEditor(Composite parent) {
		multivaluededitorOptionalProperty = new Text(parent, SWT.BORDER | SWT.READ_ONLY);
		GridData multivaluededitorOptionalPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		multivaluededitorOptionalPropertyData.horizontalSpan = 2;
		multivaluededitorOptionalProperty.setLayoutData(multivaluededitorOptionalPropertyData);
		EditingUtils.setID(multivaluededitorOptionalProperty, EefnrViewsRepository.MultiValuedEditorSample.Properties.multivaluededitorOptionalProperty);
		EditingUtils.setEEFtype(multivaluededitorOptionalProperty, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editMultivaluededitorOptionalProperty = new Button(parent, SWT.NONE);
		editMultivaluededitorOptionalProperty.setText(EefnrMessages.MultiValuedEditorSamplePropertiesEditionPart_MultivaluededitorOptionalPropertyLabel);
		GridData editMultivaluededitorOptionalPropertyData = new GridData();
		editMultivaluededitorOptionalProperty.setLayoutData(editMultivaluededitorOptionalPropertyData);
		editMultivaluededitorOptionalProperty.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			public void widgetSelected(SelectionEvent e) {
				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(
						multivaluededitorOptionalProperty.getShell(), "MultiValuedEditorSample", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						multivaluededitorOptionalPropertyList, EefnrPackage.eINSTANCE.getMultiValuedEditorSample_MultivaluededitorOptionalProperty().getEType(), null,
						false, true, 
						null, null);
				if (dialog.open() == Window.OK) {
					multivaluededitorOptionalPropertyList = dialog.getResult();
					if (multivaluededitorOptionalPropertyList == null) {
						multivaluededitorOptionalPropertyList = new BasicEList();
					}
					multivaluededitorOptionalProperty.setText(multivaluededitorOptionalPropertyList.toString());
					propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(MultiValuedEditorSamplePropertiesEditionPartImpl.this, EefnrViewsRepository.MultiValuedEditorSample.Properties.multivaluededitorOptionalProperty, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, new BasicEList(multivaluededitorOptionalPropertyList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editMultivaluededitorOptionalProperty, EefnrViewsRepository.MultiValuedEditorSample.Properties.multivaluededitorOptionalProperty);
		EditingUtils.setEEFtype(editMultivaluededitorOptionalProperty, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
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
	 * @see org.eclipse.emf.eef.eefnr.parts.MultiValuedEditorSamplePropertiesEditionPart#getMultivaluededitorRequiredProperty()
	 * 
	 */
	public EList getMultivaluededitorRequiredProperty() {
		return multivaluededitorRequiredPropertyList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.MultiValuedEditorSamplePropertiesEditionPart#setMultivaluededitorRequiredProperty(EList newValue)
	 * 
	 */
	public void setMultivaluededitorRequiredProperty(EList newValue) {
		multivaluededitorRequiredPropertyList = newValue;
		if (newValue != null) {
			multivaluededitorRequiredProperty.setText(multivaluededitorRequiredPropertyList.toString());
		} else {
			multivaluededitorRequiredProperty.setText(""); //$NON-NLS-1$
		}
	}

	public void addToMultivaluededitorRequiredProperty(Object newValue) {
		multivaluededitorRequiredPropertyList.add(newValue);
		if (newValue != null) {
			multivaluededitorRequiredProperty.setText(multivaluededitorRequiredPropertyList.toString());
		} else {
			multivaluededitorRequiredProperty.setText(""); //$NON-NLS-1$
		}
	}

	public void removeToMultivaluededitorRequiredProperty(Object newValue) {
		multivaluededitorRequiredPropertyList.remove(newValue);
		if (newValue != null) {
			multivaluededitorRequiredProperty.setText(multivaluededitorRequiredPropertyList.toString());
		} else {
			multivaluededitorRequiredProperty.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.MultiValuedEditorSamplePropertiesEditionPart#getMultivaluededitorOptionalProperty()
	 * 
	 */
	public EList getMultivaluededitorOptionalProperty() {
		return multivaluededitorOptionalPropertyList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.MultiValuedEditorSamplePropertiesEditionPart#setMultivaluededitorOptionalProperty(EList newValue)
	 * 
	 */
	public void setMultivaluededitorOptionalProperty(EList newValue) {
		multivaluededitorOptionalPropertyList = newValue;
		if (newValue != null) {
			multivaluededitorOptionalProperty.setText(multivaluededitorOptionalPropertyList.toString());
		} else {
			multivaluededitorOptionalProperty.setText(""); //$NON-NLS-1$
		}
	}

	public void addToMultivaluededitorOptionalProperty(Object newValue) {
		multivaluededitorOptionalPropertyList.add(newValue);
		if (newValue != null) {
			multivaluededitorOptionalProperty.setText(multivaluededitorOptionalPropertyList.toString());
		} else {
			multivaluededitorOptionalProperty.setText(""); //$NON-NLS-1$
		}
	}

	public void removeToMultivaluededitorOptionalProperty(Object newValue) {
		multivaluededitorOptionalPropertyList.remove(newValue);
		if (newValue != null) {
			multivaluededitorOptionalProperty.setText(multivaluededitorOptionalPropertyList.toString());
		} else {
			multivaluededitorOptionalProperty.setText(""); //$NON-NLS-1$
		}
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.parts.PropertiesEditingPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EefnrMessages.MultiValuedEditorSample_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
