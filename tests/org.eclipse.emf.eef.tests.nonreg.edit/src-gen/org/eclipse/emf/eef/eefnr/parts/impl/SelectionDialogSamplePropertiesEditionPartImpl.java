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
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
import org.eclipse.emf.eef.eefnr.parts.EefnrViewsRepository;
import org.eclipse.emf.eef.eefnr.parts.SelectionDialogSamplePropertiesEditionPart;
import org.eclipse.emf.eef.eefnr.providers.EefnrMessages;
import org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.notify.PropertiesEditingEvent;
import org.eclipse.emf.eef.runtime.notify.impl.PropertiesEditingEventImpl;
import org.eclipse.emf.eef.runtime.parts.SWTPropertiesEditingPart;
import org.eclipse.emf.eef.runtime.parts.impl.CompositePropertiesEditingPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.SelectionDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;


// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class SelectionDialogSamplePropertiesEditionPartImpl extends CompositePropertiesEditingPart implements SWTPropertiesEditingPart, SelectionDialogSamplePropertiesEditionPart {

protected SelectionDialog selectionDialogRequiredProperty;
protected SelectionDialog selectionDialogOptionalProperty;



	/**
	 * Default constructor
	 * @param editionComponent the {@link PropertiesEditingComponent} that manage this part
	 * 
	 */
	public SelectionDialogSamplePropertiesEditionPartImpl(PropertiesEditingComponent editionComponent) {
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
		CompositionSequence selectionDialogSampleStep = new CompositionSequence();
		CompositionStep propertiesStep = selectionDialogSampleStep.addStep(EefnrViewsRepository.SelectionDialogSample.Properties.class);
		propertiesStep.addStep(EefnrViewsRepository.SelectionDialogSample.Properties.selectionDialogRequiredProperty);
		propertiesStep.addStep(EefnrViewsRepository.SelectionDialogSample.Properties.selectionDialogOptionalProperty);
		
		
		composer = new PartComposer(selectionDialogSampleStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EefnrViewsRepository.SelectionDialogSample.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == EefnrViewsRepository.SelectionDialogSample.Properties.selectionDialogRequiredProperty) {
					return createSelectionDialogRequiredPropertySelectionDialog(parent);
				}
				if (key == EefnrViewsRepository.SelectionDialogSample.Properties.selectionDialogOptionalProperty) {
					return createSelectionDialogOptionalPropertySelectionDialog(parent);
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
		propertiesGroup.setText(EefnrMessages.SelectionDialogSamplePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createSelectionDialogRequiredPropertySelectionDialog(Composite parent) {
		SWTUtils.createPartLabel(parent, EefnrMessages.SelectionDialogSamplePropertiesEditionPart_SelectionDialogRequiredPropertyLabel, propertiesEditingComponent.isRequired(EefnrViewsRepository.SelectionDialogSample.Properties.selectionDialogRequiredProperty, EefnrViewsRepository.SWT_KIND));
		selectionDialogRequiredProperty = new SelectionDialog(parent, SWT.NONE);

		GridData generatorData = new GridData(GridData.FILL_HORIZONTAL);
		selectionDialogRequiredProperty.setLayoutData(generatorData);

		selectionDialogRequiredProperty.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
					selectionDialogRequiredPropertySelectionDialog();
			}
		});

		selectionDialogRequiredProperty.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditingComponent != null)
					propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(SelectionDialogSamplePropertiesEditionPartImpl.this, EefnrViewsRepository.SelectionDialogSample.Properties.selectionDialogRequiredProperty, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, selectionDialogRequiredProperty.getText()));
			}
		});
		selectionDialogRequiredProperty.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditingComponent != null)
						propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(SelectionDialogSamplePropertiesEditionPartImpl.this, EefnrViewsRepository.SelectionDialogSample.Properties.selectionDialogRequiredProperty, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, selectionDialogRequiredProperty.getText()));
				}
			}
		});
		SWTUtils.createHelpButton(parent, propertiesEditingComponent.getHelpContent(EefnrViewsRepository.SelectionDialogSample.Properties.selectionDialogRequiredProperty, EefnrViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}
	
	protected void selectionDialogRequiredPropertySelectionDialog() {
	//Start of user code browse button selection dialog
		if (PlatformUI.getWorkbench() != null && PlatformUI.getWorkbench().getActiveWorkbenchWindow() != null) {
			Shell theShell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
			IFile[] file = WorkspaceResourceDialog.openFileSelection(theShell, "File Selection", "", false, null, null);
			if(file.length == 1) {
				selectionDialogOptionalProperty.setText(file[0].getProject().getName() + "/" + file[0].getProjectRelativePath().toString());
				propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(SelectionDialogSamplePropertiesEditionPartImpl.this, EefnrViewsRepository.SelectionDialogSample.Properties.selectionDialogOptionalProperty, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, selectionDialogOptionalProperty.getText()));
			}
		}
	//End of user code
	}

	
	protected Composite createSelectionDialogOptionalPropertySelectionDialog(Composite parent) {
		SWTUtils.createPartLabel(parent, EefnrMessages.SelectionDialogSamplePropertiesEditionPart_SelectionDialogOptionalPropertyLabel, propertiesEditingComponent.isRequired(EefnrViewsRepository.SelectionDialogSample.Properties.selectionDialogOptionalProperty, EefnrViewsRepository.SWT_KIND));
		selectionDialogOptionalProperty = new SelectionDialog(parent, SWT.NONE);

		GridData generatorData = new GridData(GridData.FILL_HORIZONTAL);
		selectionDialogOptionalProperty.setLayoutData(generatorData);

		selectionDialogOptionalProperty.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
					selectionDialogOptionalPropertySelectionDialog();
			}
		});

		selectionDialogOptionalProperty.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditingComponent != null)
					propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(SelectionDialogSamplePropertiesEditionPartImpl.this, EefnrViewsRepository.SelectionDialogSample.Properties.selectionDialogOptionalProperty, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, selectionDialogOptionalProperty.getText()));
			}
		});
		selectionDialogOptionalProperty.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditingComponent != null)
						propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(SelectionDialogSamplePropertiesEditionPartImpl.this, EefnrViewsRepository.SelectionDialogSample.Properties.selectionDialogOptionalProperty, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, selectionDialogOptionalProperty.getText()));
				}
			}
		});
		SWTUtils.createHelpButton(parent, propertiesEditingComponent.getHelpContent(EefnrViewsRepository.SelectionDialogSample.Properties.selectionDialogOptionalProperty, EefnrViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}
	
	protected void selectionDialogOptionalPropertySelectionDialog() {
	//Start of user code browse button selection dialog
		if (PlatformUI.getWorkbench() != null && PlatformUI.getWorkbench().getActiveWorkbenchWindow() != null) {
			Shell theShell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
			IFile[] file = WorkspaceResourceDialog.openFileSelection(theShell, "File Selection", "", false, null, null);
			if(file.length == 1) {
				selectionDialogOptionalProperty.setText(file[0].getProject().getName() + "/" + file[0].getProjectRelativePath().toString());
				propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(SelectionDialogSamplePropertiesEditionPartImpl.this, EefnrViewsRepository.SelectionDialogSample.Properties.selectionDialogOptionalProperty, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, selectionDialogOptionalProperty.getText()));
			}
		}
	//End of user code
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
	 * @see org.eclipse.emf.eef.eefnr.parts.SelectionDialogSamplePropertiesEditionPart#getSelectionDialogRequiredProperty()
	 * 
	 */
	public String getSelectionDialogRequiredProperty() {
		return selectionDialogRequiredProperty.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.SelectionDialogSamplePropertiesEditionPart#setSelectionDialogRequiredProperty(String newValue)
	 * 
	 */
	public void setSelectionDialogRequiredProperty(String newValue) {
		if (newValue != null) {
			selectionDialogRequiredProperty.setText(newValue);
		} else {
			selectionDialogRequiredProperty.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.SelectionDialogSamplePropertiesEditionPart#getSelectionDialogOptionalProperty()
	 * 
	 */
	public String getSelectionDialogOptionalProperty() {
		return selectionDialogOptionalProperty.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.SelectionDialogSamplePropertiesEditionPart#setSelectionDialogOptionalProperty(String newValue)
	 * 
	 */
	public void setSelectionDialogOptionalProperty(String newValue) {
		if (newValue != null) {
			selectionDialogOptionalProperty.setText(newValue);
		} else {
			selectionDialogOptionalProperty.setText(""); //$NON-NLS-1$
		}
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.parts.PropertiesEditingPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EefnrMessages.SelectionDialogSample_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
