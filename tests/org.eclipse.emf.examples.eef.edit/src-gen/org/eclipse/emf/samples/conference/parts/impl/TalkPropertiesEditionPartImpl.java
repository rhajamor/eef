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
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreAdapterFactory;
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
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.samples.conference.parts.ConferenceViewsRepository;
import org.eclipse.emf.samples.conference.parts.TalkPropertiesEditionPart;
import org.eclipse.emf.samples.conference.providers.ConferenceMessages;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;


// End of user code

/**
 * @author <a href="mailto:stephane.bouchet@obeo.fr">Stephane Bouchet</a>
 * 
 */
public class TalkPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, TalkPropertiesEditionPart {

	protected Text title_;
	protected EObjectFlatComboViewer topic;
	protected EMFComboViewer type;
	protected EObjectFlatComboViewer presenter;
	protected EObjectFlatComboViewer creator;
	protected Text documentation;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public TalkPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence talkStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = talkStep.addStep(ConferenceViewsRepository.Talk.Properties.class);
		propertiesStep.addStep(ConferenceViewsRepository.Talk.Properties.title_);
		propertiesStep.addStep(ConferenceViewsRepository.Talk.Properties.topic);
		propertiesStep.addStep(ConferenceViewsRepository.Talk.Properties.type);
		propertiesStep.addStep(ConferenceViewsRepository.Talk.Properties.presenter);
		propertiesStep.addStep(ConferenceViewsRepository.Talk.Properties.creator);
		propertiesStep.addStep(ConferenceViewsRepository.Talk.Properties.documentation);
		
		
		composer = new PartComposer(talkStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ConferenceViewsRepository.Talk.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == ConferenceViewsRepository.Talk.Properties.title_) {
					return createTitle_Text(parent);
				}
				if (key == ConferenceViewsRepository.Talk.Properties.topic) {
					return createTopicFlatComboViewer(parent);
				}
				if (key == ConferenceViewsRepository.Talk.Properties.type) {
					return createTypeEMFComboViewer(parent);
				}
				if (key == ConferenceViewsRepository.Talk.Properties.presenter) {
					return createPresenterFlatComboViewer(parent);
				}
				if (key == ConferenceViewsRepository.Talk.Properties.creator) {
					return createCreatorFlatComboViewer(parent);
				}
				if (key == ConferenceViewsRepository.Talk.Properties.documentation) {
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
		propertiesGroup.setText(ConferenceMessages.TalkPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createTitle_Text(Composite parent) {
		SWTUtils.createPartLabel(parent, ConferenceMessages.TalkPropertiesEditionPart_Title_Label, propertiesEditionComponent.isRequired(ConferenceViewsRepository.Talk.Properties.title_, ConferenceViewsRepository.SWT_KIND));
		title_ = new Text(parent, SWT.BORDER);
		GridData title_Data = new GridData(GridData.FILL_HORIZONTAL);
		title_.setLayoutData(title_Data);
		title_.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TalkPropertiesEditionPartImpl.this, ConferenceViewsRepository.Talk.Properties.title_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, title_.getText()));
			}

		});
		title_.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TalkPropertiesEditionPartImpl.this, ConferenceViewsRepository.Talk.Properties.title_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, title_.getText()));
				}
			}

		});
		EditingUtils.setID(title_, ConferenceViewsRepository.Talk.Properties.title_);
		EditingUtils.setEEFtype(title_, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ConferenceViewsRepository.Talk.Properties.title_, ConferenceViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createTopicFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, ConferenceMessages.TalkPropertiesEditionPart_TopicLabel, propertiesEditionComponent.isRequired(ConferenceViewsRepository.Talk.Properties.topic, ConferenceViewsRepository.SWT_KIND));
		topic = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ConferenceViewsRepository.Talk.Properties.topic, ConferenceViewsRepository.SWT_KIND));
		topic.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		topic.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TalkPropertiesEditionPartImpl.this, ConferenceViewsRepository.Talk.Properties.topic, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getTopic()));
			}

		});
		GridData topicData = new GridData(GridData.FILL_HORIZONTAL);
		topic.setLayoutData(topicData);
		topic.setID(ConferenceViewsRepository.Talk.Properties.topic);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ConferenceViewsRepository.Talk.Properties.topic, ConferenceViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createTypeEMFComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, ConferenceMessages.TalkPropertiesEditionPart_TypeLabel, propertiesEditionComponent.isRequired(ConferenceViewsRepository.Talk.Properties.type, ConferenceViewsRepository.SWT_KIND));
		type = new EMFComboViewer(parent);
		type.setContentProvider(new ArrayContentProvider());
		type.setLabelProvider(new AdapterFactoryLabelProvider(new EcoreAdapterFactory()));
		GridData typeData = new GridData(GridData.FILL_HORIZONTAL);
		type.getCombo().setLayoutData(typeData);
		type.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TalkPropertiesEditionPartImpl.this, ConferenceViewsRepository.Talk.Properties.type, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getType()));
			}

		});
		type.setID(ConferenceViewsRepository.Talk.Properties.type);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ConferenceViewsRepository.Talk.Properties.type, ConferenceViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createPresenterFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, ConferenceMessages.TalkPropertiesEditionPart_PresenterLabel, propertiesEditionComponent.isRequired(ConferenceViewsRepository.Talk.Properties.presenter, ConferenceViewsRepository.SWT_KIND));
		presenter = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ConferenceViewsRepository.Talk.Properties.presenter, ConferenceViewsRepository.SWT_KIND));
		presenter.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		presenter.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TalkPropertiesEditionPartImpl.this, ConferenceViewsRepository.Talk.Properties.presenter, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getPresenter()));
			}

		});
		GridData presenterData = new GridData(GridData.FILL_HORIZONTAL);
		presenter.setLayoutData(presenterData);
		presenter.setID(ConferenceViewsRepository.Talk.Properties.presenter);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ConferenceViewsRepository.Talk.Properties.presenter, ConferenceViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createCreatorFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, ConferenceMessages.TalkPropertiesEditionPart_CreatorLabel, propertiesEditionComponent.isRequired(ConferenceViewsRepository.Talk.Properties.creator, ConferenceViewsRepository.SWT_KIND));
		creator = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ConferenceViewsRepository.Talk.Properties.creator, ConferenceViewsRepository.SWT_KIND));
		creator.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		creator.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TalkPropertiesEditionPartImpl.this, ConferenceViewsRepository.Talk.Properties.creator, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getCreator()));
			}

		});
		GridData creatorData = new GridData(GridData.FILL_HORIZONTAL);
		creator.setLayoutData(creatorData);
		creator.setID(ConferenceViewsRepository.Talk.Properties.creator);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ConferenceViewsRepository.Talk.Properties.creator, ConferenceViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDocumentationTextarea(Composite parent) {
		Label documentationLabel = SWTUtils.createPartLabel(parent, ConferenceMessages.TalkPropertiesEditionPart_DocumentationLabel, propertiesEditionComponent.isRequired(ConferenceViewsRepository.Talk.Properties.documentation, ConferenceViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TalkPropertiesEditionPartImpl.this, ConferenceViewsRepository.Talk.Properties.documentation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, documentation.getText()));
			}

		});
		EditingUtils.setID(documentation, ConferenceViewsRepository.Talk.Properties.documentation);
		EditingUtils.setEEFtype(documentation, "eef::Textarea"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ConferenceViewsRepository.Talk.Properties.documentation, ConferenceViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see org.eclipse.emf.samples.conference.parts.TalkPropertiesEditionPart#getTitle_()
	 * 
	 */
	public String getTitle_() {
		return title_.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.TalkPropertiesEditionPart#setTitle_(String newValue)
	 * 
	 */
	public void setTitle_(String newValue) {
		if (newValue != null) {
			title_.setText(newValue);
		} else {
			title_.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.TalkPropertiesEditionPart#getTopic()
	 * 
	 */
	public EObject getTopic() {
		if (topic.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) topic.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.TalkPropertiesEditionPart#initTopic(EObjectFlatComboSettings)
	 */
	public void initTopic(EObjectFlatComboSettings settings) {
		topic.setInput(settings);
		if (current != null) {
			topic.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.TalkPropertiesEditionPart#setTopic(EObject newValue)
	 * 
	 */
	public void setTopic(EObject newValue) {
		if (newValue != null) {
			topic.setSelection(new StructuredSelection(newValue));
		} else {
			topic.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.TalkPropertiesEditionPart#setTopicButtonMode(ButtonsModeEnum newValue)
	 */
	public void setTopicButtonMode(ButtonsModeEnum newValue) {
		topic.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.TalkPropertiesEditionPart#addFilterTopic(ViewerFilter filter)
	 * 
	 */
	public void addFilterToTopic(ViewerFilter filter) {
		topic.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.TalkPropertiesEditionPart#addBusinessFilterTopic(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToTopic(ViewerFilter filter) {
		topic.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.TalkPropertiesEditionPart#getType()
	 * 
	 */
	public Enumerator getType() {
		EEnumLiteral selection = (EEnumLiteral) ((StructuredSelection) type.getSelection()).getFirstElement();
		return selection.getInstance();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.TalkPropertiesEditionPart#initType(EEnum eenum, Enumerator current)
	 */
	public void initType(EEnum eenum, Enumerator current) {
		type.setInput(eenum.getELiterals());
		type.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.TalkPropertiesEditionPart#setType(Enumerator newValue)
	 * 
	 */
	public void setType(Enumerator newValue) {
		type.modelUpdating(new StructuredSelection(newValue));
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.TalkPropertiesEditionPart#getPresenter()
	 * 
	 */
	public EObject getPresenter() {
		if (presenter.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) presenter.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.TalkPropertiesEditionPart#initPresenter(EObjectFlatComboSettings)
	 */
	public void initPresenter(EObjectFlatComboSettings settings) {
		presenter.setInput(settings);
		if (current != null) {
			presenter.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.TalkPropertiesEditionPart#setPresenter(EObject newValue)
	 * 
	 */
	public void setPresenter(EObject newValue) {
		if (newValue != null) {
			presenter.setSelection(new StructuredSelection(newValue));
		} else {
			presenter.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.TalkPropertiesEditionPart#setPresenterButtonMode(ButtonsModeEnum newValue)
	 */
	public void setPresenterButtonMode(ButtonsModeEnum newValue) {
		presenter.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.TalkPropertiesEditionPart#addFilterPresenter(ViewerFilter filter)
	 * 
	 */
	public void addFilterToPresenter(ViewerFilter filter) {
		presenter.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.TalkPropertiesEditionPart#addBusinessFilterPresenter(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToPresenter(ViewerFilter filter) {
		presenter.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.TalkPropertiesEditionPart#getCreator()
	 * 
	 */
	public EObject getCreator() {
		if (creator.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) creator.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.TalkPropertiesEditionPart#initCreator(EObjectFlatComboSettings)
	 */
	public void initCreator(EObjectFlatComboSettings settings) {
		creator.setInput(settings);
		if (current != null) {
			creator.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.TalkPropertiesEditionPart#setCreator(EObject newValue)
	 * 
	 */
	public void setCreator(EObject newValue) {
		if (newValue != null) {
			creator.setSelection(new StructuredSelection(newValue));
		} else {
			creator.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.TalkPropertiesEditionPart#setCreatorButtonMode(ButtonsModeEnum newValue)
	 */
	public void setCreatorButtonMode(ButtonsModeEnum newValue) {
		creator.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.TalkPropertiesEditionPart#addFilterCreator(ViewerFilter filter)
	 * 
	 */
	public void addFilterToCreator(ViewerFilter filter) {
		creator.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.TalkPropertiesEditionPart#addBusinessFilterCreator(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToCreator(ViewerFilter filter) {
		creator.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.TalkPropertiesEditionPart#getDocumentation()
	 * 
	 */
	public String getDocumentation() {
		return documentation.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.TalkPropertiesEditionPart#setDocumentation(String newValue)
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
		return ConferenceMessages.Talk_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
