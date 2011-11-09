/*******************************************************************************
 * Copyright (c) 2009 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.samples.conference.parts.impl;

// Start of user code for imports
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
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
import org.eclipse.emf.eef.runtime.ui.widgets.EEFFeatureEditorDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.samples.conference.ConferencePackage;
import org.eclipse.emf.samples.conference.parts.ConferenceViewsRepository;
import org.eclipse.emf.samples.conference.parts.TopicPropertiesEditionPart;
import org.eclipse.emf.samples.conference.providers.ConferenceMessages;
import org.eclipse.jface.window.Window;
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
 * @author <a href="mailto:stephane.bouchet@obeo.fr">Stephane Bouchet</a>
 * 
 */
public class TopicPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, TopicPropertiesEditionPart {

	protected Text description;
	protected Text references;
	protected Button editReferences;
	private EList referencesList;
	protected Text documentation;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public TopicPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence topicStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = topicStep.addStep(ConferenceViewsRepository.Topic.Properties.class);
		propertiesStep.addStep(ConferenceViewsRepository.Topic.Properties.description);
		propertiesStep.addStep(ConferenceViewsRepository.Topic.Properties.references);
		propertiesStep.addStep(ConferenceViewsRepository.Topic.Properties.documentation);
		
		
		composer = new PartComposer(topicStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ConferenceViewsRepository.Topic.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == ConferenceViewsRepository.Topic.Properties.description) {
					return createDescriptionText(parent);
				}
				if (key == ConferenceViewsRepository.Topic.Properties.references) {
					return createReferencesMultiValuedEditor(parent);
				}
				if (key == ConferenceViewsRepository.Topic.Properties.documentation) {
					return createDocumentationTextarea(parent);
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
		propertiesGroup.setText(ConferenceMessages.TopicPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createDescriptionText(Composite parent) {
		SWTUtils.createPartLabel(parent, ConferenceMessages.TopicPropertiesEditionPart_DescriptionLabel, propertiesEditionComponent.isRequired(ConferenceViewsRepository.Topic.Properties.description, ConferenceViewsRepository.SWT_KIND));
		description = new Text(parent, SWT.BORDER);
		GridData descriptionData = new GridData(GridData.FILL_HORIZONTAL);
		description.setLayoutData(descriptionData);
		description.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TopicPropertiesEditionPartImpl.this, ConferenceViewsRepository.Topic.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
			}

		});
		description.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TopicPropertiesEditionPartImpl.this, ConferenceViewsRepository.Topic.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}

		});
		EditingUtils.setID(description, ConferenceViewsRepository.Topic.Properties.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ConferenceViewsRepository.Topic.Properties.description, ConferenceViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	protected Composite createReferencesMultiValuedEditor(Composite parent) {
		references = new Text(parent, SWT.BORDER | SWT.READ_ONLY);
		GridData referencesData = new GridData(GridData.FILL_HORIZONTAL);
		referencesData.horizontalSpan = 2;
		references.setLayoutData(referencesData);
		EditingUtils.setID(references, ConferenceViewsRepository.Topic.Properties.references);
		EditingUtils.setEEFtype(references, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editReferences = new Button(parent, SWT.NONE);
		editReferences.setText(ConferenceMessages.TopicPropertiesEditionPart_ReferencesLabel);
		GridData editReferencesData = new GridData();
		editReferences.setLayoutData(editReferencesData);
		editReferences.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			public void widgetSelected(SelectionEvent e) {
				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(
						references.getShell(), "Topic", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						referencesList, ConferencePackage.eINSTANCE.getTopic_References().getEType(), null,
						false, true, 
						null, null);
				if (dialog.open() == Window.OK) {
					referencesList = dialog.getResult();
					if (referencesList == null) {
						referencesList = new BasicEList();
					}
					references.setText(referencesList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TopicPropertiesEditionPartImpl.this, ConferenceViewsRepository.Topic.Properties.references, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new BasicEList(referencesList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editReferences, ConferenceViewsRepository.Topic.Properties.references);
		EditingUtils.setEEFtype(editReferences, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDocumentationTextarea(Composite parent) {
		Label documentationLabel = SWTUtils.createPartLabel(parent, ConferenceMessages.TopicPropertiesEditionPart_DocumentationLabel, propertiesEditionComponent.isRequired(ConferenceViewsRepository.Topic.Properties.documentation, ConferenceViewsRepository.SWT_KIND));
		GridData documentationLabelData = new GridData(GridData.FILL_HORIZONTAL);
		documentationLabelData.horizontalSpan = 3;
		documentationLabel.setLayoutData(documentationLabelData);
		documentation = new Text(parent, SWT.BORDER | SWT.WRAP | SWT.MULTI | SWT.V_SCROLL);
		GridData documentationData = new GridData(GridData.FILL_HORIZONTAL);
		documentationData.horizontalSpan = 2;
		documentationData.heightHint = 80;
		documentationData.widthHint = 200;
		documentation.setLayoutData(documentationData);
		documentation.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TopicPropertiesEditionPartImpl.this, ConferenceViewsRepository.Topic.Properties.documentation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, documentation.getText()));
			}

		});
		EditingUtils.setID(documentation, ConferenceViewsRepository.Topic.Properties.documentation);
		EditingUtils.setEEFtype(documentation, "eef::Textarea"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ConferenceViewsRepository.Topic.Properties.documentation, ConferenceViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see org.eclipse.emf.samples.conference.parts.TopicPropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.TopicPropertiesEditionPart#setDescription(String newValue)
	 * 
	 */
	public void setDescription(String newValue) {
		if (newValue != null) {
			description.setText(newValue);
		} else {
			description.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.TopicPropertiesEditionPart#getReferences()
	 * 
	 */
	public EList getReferences() {
		return referencesList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.TopicPropertiesEditionPart#setReferences(EList newValue)
	 * 
	 */
	public void setReferences(EList newValue) {
		referencesList = newValue;
		if (newValue != null) {
			references.setText(referencesList.toString());
		} else {
			references.setText(""); //$NON-NLS-1$
		}
	}

	public void addToReferences(Object newValue) {
		referencesList.add(newValue);
		if (newValue != null) {
			references.setText(referencesList.toString());
		} else {
			references.setText(""); //$NON-NLS-1$
		}
	}

	public void removeToReferences(Object newValue) {
		referencesList.remove(newValue);
		if (newValue != null) {
			references.setText(referencesList.toString());
		} else {
			references.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.TopicPropertiesEditionPart#getDocumentation()
	 * 
	 */
	public String getDocumentation() {
		return documentation.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.TopicPropertiesEditionPart#setDocumentation(String newValue)
	 * 
	 */
	public void setDocumentation(String newValue) {
		if (newValue != null) {
			documentation.setText(newValue);
		} else {
			documentation.setText(""); //$NON-NLS-1$
		}
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ConferenceMessages.Topic_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
