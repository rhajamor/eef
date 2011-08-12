/*******************************************************************************
 * Copyright (c) 2008, 2010 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.EEFGen.parts.impl;

// Start of user code for imports

import org.eclipse.emf.eef.EEFGen.parts.EEFGenModelPropertiesEditionPart;
import org.eclipse.emf.eef.EEFGen.parts.EEFGenViewsRepository;
import org.eclipse.emf.eef.EEFGen.providers.EEFGenMessages;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class EEFGenModelPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, EEFGenModelPropertiesEditionPart {

	protected Text generationDirectory;
	protected Text testsGenerationDirectory;
	protected Button useJMergeToManageUserCode;
	protected Text author;
	protected Text license;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public EEFGenModelPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence eEFGenModelStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep parametersStep = eEFGenModelStep.addStep(EEFGenViewsRepository.EEFGenModel.Parameters.class);
		parametersStep.addStep(EEFGenViewsRepository.EEFGenModel.Parameters.generationDirectory);
		parametersStep.addStep(EEFGenViewsRepository.EEFGenModel.Parameters.testsGenerationDirectory);
		parametersStep.addStep(EEFGenViewsRepository.EEFGenModel.Parameters.useJMergeToManageUserCode);
		
		CompositionStep legalStep = eEFGenModelStep.addStep(EEFGenViewsRepository.EEFGenModel.Legal.class);
		legalStep.addStep(EEFGenViewsRepository.EEFGenModel.Legal.author);
		legalStep.addStep(EEFGenViewsRepository.EEFGenModel.Legal.license);
		
		
		composer = new PartComposer(eEFGenModelStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EEFGenViewsRepository.EEFGenModel.Parameters.class) {
					return createParametersGroup(parent);
				}
				if (key == EEFGenViewsRepository.EEFGenModel.Parameters.generationDirectory) {
					return createGenerationDirectoryText(parent);
				}
				if (key == EEFGenViewsRepository.EEFGenModel.Parameters.testsGenerationDirectory) {
					return createTestsGenerationDirectoryText(parent);
				}
				if (key == EEFGenViewsRepository.EEFGenModel.Parameters.useJMergeToManageUserCode) {
					return createUseJMergeToManageUserCodeCheckbox(parent);
				}
				if (key == EEFGenViewsRepository.EEFGenModel.Legal.class) {
					return createLegalGroup(parent);
				}
				if (key == EEFGenViewsRepository.EEFGenModel.Legal.author) {
					return createAuthorText(parent);
				}
				if (key == EEFGenViewsRepository.EEFGenModel.Legal.license) {
					return createLicenseTextarea(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createParametersGroup(Composite parent) {
		Group parametersGroup = new Group(parent, SWT.NONE);
		parametersGroup.setText(EEFGenMessages.EEFGenModelPropertiesEditionPart_ParametersGroupLabel);
		GridData parametersGroupData = new GridData(GridData.FILL_HORIZONTAL);
		parametersGroupData.horizontalSpan = 3;
		parametersGroup.setLayoutData(parametersGroupData);
		GridLayout parametersGroupLayout = new GridLayout();
		parametersGroupLayout.numColumns = 3;
		parametersGroup.setLayout(parametersGroupLayout);
		return parametersGroup;
	}

	
	protected Composite createGenerationDirectoryText(Composite parent) {
		SWTUtils.createPartLabel(parent, EEFGenMessages.EEFGenModelPropertiesEditionPart_GenerationDirectoryLabel, propertiesEditionComponent.isRequired(EEFGenViewsRepository.EEFGenModel.Parameters.generationDirectory, EEFGenViewsRepository.SWT_KIND));
		generationDirectory = new Text(parent, SWT.BORDER);
		GridData generationDirectoryData = new GridData(GridData.FILL_HORIZONTAL);
		generationDirectory.setLayoutData(generationDirectoryData);
		generationDirectory.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EEFGenModelPropertiesEditionPartImpl.this, EEFGenViewsRepository.EEFGenModel.Parameters.generationDirectory, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, generationDirectory.getText()));
			}

		});
		generationDirectory.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EEFGenModelPropertiesEditionPartImpl.this, EEFGenViewsRepository.EEFGenModel.Parameters.generationDirectory, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, generationDirectory.getText()));
				}
			}

		});
		EditingUtils.setID(generationDirectory, EEFGenViewsRepository.EEFGenModel.Parameters.generationDirectory);
		EditingUtils.setEEFtype(generationDirectory, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EEFGenViewsRepository.EEFGenModel.Parameters.generationDirectory, EEFGenViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createTestsGenerationDirectoryText(Composite parent) {
		SWTUtils.createPartLabel(parent, EEFGenMessages.EEFGenModelPropertiesEditionPart_TestsGenerationDirectoryLabel, propertiesEditionComponent.isRequired(EEFGenViewsRepository.EEFGenModel.Parameters.testsGenerationDirectory, EEFGenViewsRepository.SWT_KIND));
		testsGenerationDirectory = new Text(parent, SWT.BORDER);
		GridData testsGenerationDirectoryData = new GridData(GridData.FILL_HORIZONTAL);
		testsGenerationDirectory.setLayoutData(testsGenerationDirectoryData);
		testsGenerationDirectory.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EEFGenModelPropertiesEditionPartImpl.this, EEFGenViewsRepository.EEFGenModel.Parameters.testsGenerationDirectory, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, testsGenerationDirectory.getText()));
			}

		});
		testsGenerationDirectory.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EEFGenModelPropertiesEditionPartImpl.this, EEFGenViewsRepository.EEFGenModel.Parameters.testsGenerationDirectory, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, testsGenerationDirectory.getText()));
				}
			}

		});
		EditingUtils.setID(testsGenerationDirectory, EEFGenViewsRepository.EEFGenModel.Parameters.testsGenerationDirectory);
		EditingUtils.setEEFtype(testsGenerationDirectory, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EEFGenViewsRepository.EEFGenModel.Parameters.testsGenerationDirectory, EEFGenViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createUseJMergeToManageUserCodeCheckbox(Composite parent) {
		useJMergeToManageUserCode = new Button(parent, SWT.CHECK);
		useJMergeToManageUserCode.setText(EEFGenMessages.EEFGenModelPropertiesEditionPart_UseJMergeToManageUserCodeLabel);
		useJMergeToManageUserCode.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EEFGenModelPropertiesEditionPartImpl.this, EEFGenViewsRepository.EEFGenModel.Parameters.useJMergeToManageUserCode, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(useJMergeToManageUserCode.getSelection())));
			}

		});
		GridData useJMergeToManageUserCodeData = new GridData(GridData.FILL_HORIZONTAL);
		useJMergeToManageUserCodeData.horizontalSpan = 2;
		useJMergeToManageUserCode.setLayoutData(useJMergeToManageUserCodeData);
		EditingUtils.setID(useJMergeToManageUserCode, EEFGenViewsRepository.EEFGenModel.Parameters.useJMergeToManageUserCode);
		EditingUtils.setEEFtype(useJMergeToManageUserCode, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EEFGenViewsRepository.EEFGenModel.Parameters.useJMergeToManageUserCode, EEFGenViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createLegalGroup(Composite parent) {
		Group legalGroup = new Group(parent, SWT.NONE);
		legalGroup.setText(EEFGenMessages.EEFGenModelPropertiesEditionPart_LegalGroupLabel);
		GridData legalGroupData = new GridData(GridData.FILL_HORIZONTAL);
		legalGroupData.horizontalSpan = 3;
		legalGroup.setLayoutData(legalGroupData);
		GridLayout legalGroupLayout = new GridLayout();
		legalGroupLayout.numColumns = 3;
		legalGroup.setLayout(legalGroupLayout);
		return legalGroup;
	}

	
	protected Composite createAuthorText(Composite parent) {
		SWTUtils.createPartLabel(parent, EEFGenMessages.EEFGenModelPropertiesEditionPart_AuthorLabel, propertiesEditionComponent.isRequired(EEFGenViewsRepository.EEFGenModel.Legal.author, EEFGenViewsRepository.SWT_KIND));
		author = new Text(parent, SWT.BORDER);
		GridData authorData = new GridData(GridData.FILL_HORIZONTAL);
		author.setLayoutData(authorData);
		author.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EEFGenModelPropertiesEditionPartImpl.this, EEFGenViewsRepository.EEFGenModel.Legal.author, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, author.getText()));
			}

		});
		author.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EEFGenModelPropertiesEditionPartImpl.this, EEFGenViewsRepository.EEFGenModel.Legal.author, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, author.getText()));
				}
			}

		});
		EditingUtils.setID(author, EEFGenViewsRepository.EEFGenModel.Legal.author);
		EditingUtils.setEEFtype(author, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EEFGenViewsRepository.EEFGenModel.Legal.author, EEFGenViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createLicenseTextarea(Composite parent) {
		Label licenseLabel = SWTUtils.createPartLabel(parent, EEFGenMessages.EEFGenModelPropertiesEditionPart_LicenseLabel, propertiesEditionComponent.isRequired(EEFGenViewsRepository.EEFGenModel.Legal.license, EEFGenViewsRepository.SWT_KIND));
		GridData licenseLabelData = new GridData(GridData.FILL_HORIZONTAL);
		licenseLabelData.horizontalSpan = 3;
		licenseLabel.setLayoutData(licenseLabelData);
		license = new Text(parent, SWT.BORDER | SWT.WRAP | SWT.MULTI | SWT.V_SCROLL);
		GridData licenseData = new GridData(GridData.FILL_HORIZONTAL);
		licenseData.horizontalSpan = 2;
		licenseData.heightHint = 80;
		licenseData.widthHint = 200;
		license.setLayoutData(licenseData);
		license.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EEFGenModelPropertiesEditionPartImpl.this, EEFGenViewsRepository.EEFGenModel.Legal.license, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, license.getText()));
			}

		});
		EditingUtils.setID(license, EEFGenViewsRepository.EEFGenModel.Legal.license);
		EditingUtils.setEEFtype(license, "eef::Textarea"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EEFGenViewsRepository.EEFGenModel.Legal.license, EEFGenViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see org.eclipse.emf.eef.EEFGen.parts.EEFGenModelPropertiesEditionPart#getGenerationDirectory()
	 * 
	 */
	public String getGenerationDirectory() {
		return generationDirectory.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.EEFGen.parts.EEFGenModelPropertiesEditionPart#setGenerationDirectory(String newValue)
	 * 
	 */
	public void setGenerationDirectory(String newValue) {
		if (newValue != null) {
			generationDirectory.setText(newValue);
		} else {
			generationDirectory.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.EEFGen.parts.EEFGenModelPropertiesEditionPart#getTestsGenerationDirectory()
	 * 
	 */
	public String getTestsGenerationDirectory() {
		return testsGenerationDirectory.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.EEFGen.parts.EEFGenModelPropertiesEditionPart#setTestsGenerationDirectory(String newValue)
	 * 
	 */
	public void setTestsGenerationDirectory(String newValue) {
		if (newValue != null) {
			testsGenerationDirectory.setText(newValue);
		} else {
			testsGenerationDirectory.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.EEFGen.parts.EEFGenModelPropertiesEditionPart#getUseJMergeToManageUserCode()
	 * 
	 */
	public Boolean getUseJMergeToManageUserCode() {
		return Boolean.valueOf(useJMergeToManageUserCode.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.EEFGen.parts.EEFGenModelPropertiesEditionPart#setUseJMergeToManageUserCode(Boolean newValue)
	 * 
	 */
	public void setUseJMergeToManageUserCode(Boolean newValue) {
		if (newValue != null) {
			useJMergeToManageUserCode.setSelection(newValue.booleanValue());
		} else {
			useJMergeToManageUserCode.setSelection(false);
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.EEFGen.parts.EEFGenModelPropertiesEditionPart#getAuthor()
	 * 
	 */
	public String getAuthor() {
		return author.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.EEFGen.parts.EEFGenModelPropertiesEditionPart#setAuthor(String newValue)
	 * 
	 */
	public void setAuthor(String newValue) {
		if (newValue != null) {
			author.setText(newValue);
		} else {
			author.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.EEFGen.parts.EEFGenModelPropertiesEditionPart#getLicense()
	 * 
	 */
	public String getLicense() {
		return license.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.EEFGen.parts.EEFGenModelPropertiesEditionPart#setLicense(String newValue)
	 * 
	 */
	public void setLicense(String newValue) {
		if (newValue != null) {
			license.setText(newValue);
		} else {
			license.setText(""); //$NON-NLS-1$
		}
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EEFGenMessages.EEFGenModel_Part_Title;
	}

	// Start of user code additional methods
 	
	// End of user code


}
