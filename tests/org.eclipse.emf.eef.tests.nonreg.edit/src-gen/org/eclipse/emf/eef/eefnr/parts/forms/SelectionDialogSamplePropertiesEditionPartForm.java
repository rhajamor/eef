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
package org.eclipse.emf.eef.eefnr.parts.forms;

// Start of user code for imports
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
import org.eclipse.emf.eef.eefnr.parts.EefnrViewsRepository;
import org.eclipse.emf.eef.eefnr.parts.SelectionDialogSamplePropertiesEditionPart;
import org.eclipse.emf.eef.eefnr.providers.EefnrMessages;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
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
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;


// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class SelectionDialogSamplePropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, SelectionDialogSamplePropertiesEditionPart {

	protected SelectionDialog selectionDialogRequiredProperty;
	protected SelectionDialog selectionDialogOptionalProperty;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public SelectionDialogSamplePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence selectionDialogSampleStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = selectionDialogSampleStep.addStep(EefnrViewsRepository.SelectionDialogSample.Properties.class);
		propertiesStep.addStep(EefnrViewsRepository.SelectionDialogSample.Properties.selectionDialogRequiredProperty);
		propertiesStep.addStep(EefnrViewsRepository.SelectionDialogSample.Properties.selectionDialogOptionalProperty);
		
		
		composer = new PartComposer(selectionDialogSampleStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EefnrViewsRepository.SelectionDialogSample.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == EefnrViewsRepository.SelectionDialogSample.Properties.selectionDialogRequiredProperty) {
					return createSelectionDialogRequiredPropertySelectionDialog(widgetFactory, parent);
				}
				if (key == EefnrViewsRepository.SelectionDialogSample.Properties.selectionDialogOptionalProperty) {
					return createSelectionDialogOptionalPropertySelectionDialog(widgetFactory, parent);
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
		propertiesSection.setText(EefnrMessages.SelectionDialogSamplePropertiesEditionPart_PropertiesGroupLabel);
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

	
	protected Composite createSelectionDialogRequiredPropertySelectionDialog(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, EefnrMessages.SelectionDialogSamplePropertiesEditionPart_SelectionDialogRequiredPropertyLabel, propertiesEditionComponent.isRequired(EefnrViewsRepository.SelectionDialogSample.Properties.selectionDialogRequiredProperty, EefnrViewsRepository.FORM_KIND));
		selectionDialogRequiredProperty = new SelectionDialog(parent, SWT.NONE, widgetFactory);

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
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SelectionDialogSamplePropertiesEditionPartForm.this, EefnrViewsRepository.SelectionDialogSample.Properties.selectionDialogRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, selectionDialogRequiredProperty.getText()));
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
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SelectionDialogSamplePropertiesEditionPartForm.this, EefnrViewsRepository.SelectionDialogSample.Properties.selectionDialogRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, selectionDialogRequiredProperty.getText()));
				}
			}
		});
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EefnrViewsRepository.SelectionDialogSample.Properties.selectionDialogRequiredProperty, EefnrViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	protected void selectionDialogRequiredPropertySelectionDialog() {
	//Start of user code browse button selection dialog
		if (PlatformUI.getWorkbench() != null && PlatformUI.getWorkbench().getActiveWorkbenchWindow() != null) {
			Shell theShell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
			IFile[] file = WorkspaceResourceDialog.openFileSelection(theShell, "File Selection", "", false, null, null);
			if(file.length == 1) {
				selectionDialogOptionalProperty.setText(file[0].getProject().getName() + "/" + file[0].getProjectRelativePath().toString());
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SelectionDialogSamplePropertiesEditionPartForm.this, EefnrViewsRepository.SelectionDialogSample.Properties.selectionDialogOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, selectionDialogOptionalProperty.getText()));
			}
		}
	//End of user code
	}

	
	protected Composite createSelectionDialogOptionalPropertySelectionDialog(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, EefnrMessages.SelectionDialogSamplePropertiesEditionPart_SelectionDialogOptionalPropertyLabel, propertiesEditionComponent.isRequired(EefnrViewsRepository.SelectionDialogSample.Properties.selectionDialogOptionalProperty, EefnrViewsRepository.FORM_KIND));
		selectionDialogOptionalProperty = new SelectionDialog(parent, SWT.NONE, widgetFactory);

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
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SelectionDialogSamplePropertiesEditionPartForm.this, EefnrViewsRepository.SelectionDialogSample.Properties.selectionDialogOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, selectionDialogOptionalProperty.getText()));
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
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SelectionDialogSamplePropertiesEditionPartForm.this, EefnrViewsRepository.SelectionDialogSample.Properties.selectionDialogOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, selectionDialogOptionalProperty.getText()));
				}
			}
		});
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EefnrViewsRepository.SelectionDialogSample.Properties.selectionDialogOptionalProperty, EefnrViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	protected void selectionDialogOptionalPropertySelectionDialog() {
	//Start of user code browse button selection dialog
		if (PlatformUI.getWorkbench() != null && PlatformUI.getWorkbench().getActiveWorkbenchWindow() != null) {
			Shell theShell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
			IFile[] file = WorkspaceResourceDialog.openFileSelection(theShell, "File Selection", "", false, null, null);
			if(file.length == 1) {
				selectionDialogOptionalProperty.setText(file[0].getProject().getName() + "/" + file[0].getProjectRelativePath().toString());
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SelectionDialogSamplePropertiesEditionPartForm.this, EefnrViewsRepository.SelectionDialogSample.Properties.selectionDialogOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, selectionDialogOptionalProperty.getText()));
			}
		}
	//End of user code
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
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EefnrMessages.SelectionDialogSample_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
