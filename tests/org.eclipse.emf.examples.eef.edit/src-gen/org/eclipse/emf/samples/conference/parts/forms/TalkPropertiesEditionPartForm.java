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
package org.eclipse.emf.samples.conference.parts.forms;

// Start of user code for imports
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
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
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
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
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;


// End of user code

/**
 * @author <a href="mailto:stephane.bouchet@obeo.fr">Stephane Bouchet</a>
 * 
 */
public class TalkPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, TalkPropertiesEditionPart {

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
	public TalkPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == ConferenceViewsRepository.Talk.Properties.title_) {
					return 		createTitle_Text(widgetFactory, parent);
				}
				if (key == ConferenceViewsRepository.Talk.Properties.topic) {
					return createTopicFlatComboViewer(parent, widgetFactory);
				}
				if (key == ConferenceViewsRepository.Talk.Properties.type) {
					return createTypeEMFComboViewer(widgetFactory, parent);
				}
				if (key == ConferenceViewsRepository.Talk.Properties.presenter) {
					return createPresenterFlatComboViewer(parent, widgetFactory);
				}
				if (key == ConferenceViewsRepository.Talk.Properties.creator) {
					return createCreatorFlatComboViewer(parent, widgetFactory);
				}
				if (key == ConferenceViewsRepository.Talk.Properties.documentation) {
					return createDocumentationTextarea(widgetFactory, parent);
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
		propertiesSection.setText(ConferenceMessages.TalkPropertiesEditionPart_PropertiesGroupLabel);
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

	
	protected Composite createTitle_Text(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ConferenceMessages.TalkPropertiesEditionPart_Title_Label, propertiesEditionComponent.isRequired(ConferenceViewsRepository.Talk.Properties.title_, ConferenceViewsRepository.FORM_KIND));
		title_ = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		title_.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData title_Data = new GridData(GridData.FILL_HORIZONTAL);
		title_.setLayoutData(title_Data);
		title_.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TalkPropertiesEditionPartForm.this, ConferenceViewsRepository.Talk.Properties.title_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, title_.getText()));
			}
		});
		title_.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TalkPropertiesEditionPartForm.this, ConferenceViewsRepository.Talk.Properties.title_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, title_.getText()));
				}
			}
		});
		EditingUtils.setID(title_, ConferenceViewsRepository.Talk.Properties.title_);
		EditingUtils.setEEFtype(title_, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ConferenceViewsRepository.Talk.Properties.title_, ConferenceViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createTopicFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, ConferenceMessages.TalkPropertiesEditionPart_TopicLabel, propertiesEditionComponent.isRequired(ConferenceViewsRepository.Talk.Properties.topic, ConferenceViewsRepository.FORM_KIND));
		topic = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ConferenceViewsRepository.Talk.Properties.topic, ConferenceViewsRepository.FORM_KIND));
		widgetFactory.adapt(topic);
		topic.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData topicData = new GridData(GridData.FILL_HORIZONTAL);
		topic.setLayoutData(topicData);
		topic.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TalkPropertiesEditionPartForm.this, ConferenceViewsRepository.Talk.Properties.topic, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getTopic()));
			}

		});
		topic.setID(ConferenceViewsRepository.Talk.Properties.topic);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ConferenceViewsRepository.Talk.Properties.topic, ConferenceViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createTypeEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ConferenceMessages.TalkPropertiesEditionPart_TypeLabel, propertiesEditionComponent.isRequired(ConferenceViewsRepository.Talk.Properties.type, ConferenceViewsRepository.FORM_KIND));
		type = new EMFComboViewer(parent);
		type.setContentProvider(new ArrayContentProvider());
		type.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TalkPropertiesEditionPartForm.this, ConferenceViewsRepository.Talk.Properties.type, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getType()));
			}

		});
		type.setID(ConferenceViewsRepository.Talk.Properties.type);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ConferenceViewsRepository.Talk.Properties.type, ConferenceViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createPresenterFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, ConferenceMessages.TalkPropertiesEditionPart_PresenterLabel, propertiesEditionComponent.isRequired(ConferenceViewsRepository.Talk.Properties.presenter, ConferenceViewsRepository.FORM_KIND));
		presenter = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ConferenceViewsRepository.Talk.Properties.presenter, ConferenceViewsRepository.FORM_KIND));
		widgetFactory.adapt(presenter);
		presenter.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData presenterData = new GridData(GridData.FILL_HORIZONTAL);
		presenter.setLayoutData(presenterData);
		presenter.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TalkPropertiesEditionPartForm.this, ConferenceViewsRepository.Talk.Properties.presenter, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getPresenter()));
			}

		});
		presenter.setID(ConferenceViewsRepository.Talk.Properties.presenter);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ConferenceViewsRepository.Talk.Properties.presenter, ConferenceViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createCreatorFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, ConferenceMessages.TalkPropertiesEditionPart_CreatorLabel, propertiesEditionComponent.isRequired(ConferenceViewsRepository.Talk.Properties.creator, ConferenceViewsRepository.FORM_KIND));
		creator = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ConferenceViewsRepository.Talk.Properties.creator, ConferenceViewsRepository.FORM_KIND));
		widgetFactory.adapt(creator);
		creator.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData creatorData = new GridData(GridData.FILL_HORIZONTAL);
		creator.setLayoutData(creatorData);
		creator.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TalkPropertiesEditionPartForm.this, ConferenceViewsRepository.Talk.Properties.creator, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getCreator()));
			}

		});
		creator.setID(ConferenceViewsRepository.Talk.Properties.creator);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ConferenceViewsRepository.Talk.Properties.creator, ConferenceViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDocumentationTextarea(FormToolkit widgetFactory, Composite parent) {
		Label documentationLabel = FormUtils.createPartLabel(widgetFactory, parent, ConferenceMessages.TalkPropertiesEditionPart_DocumentationLabel, propertiesEditionComponent.isRequired(ConferenceViewsRepository.Talk.Properties.documentation, ConferenceViewsRepository.FORM_KIND));
		GridData documentationLabelData = new GridData(GridData.FILL_HORIZONTAL);
		documentationLabelData.horizontalSpan = 3;
		documentationLabel.setLayoutData(documentationLabelData);
		documentation = widgetFactory.createText(parent, "", SWT.BORDER | SWT.WRAP | SWT.MULTI | SWT.V_SCROLL); //$NON-NLS-1$
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TalkPropertiesEditionPartForm.this, ConferenceViewsRepository.Talk.Properties.documentation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, documentation.getText()));
			}

		});
		EditingUtils.setID(documentation, ConferenceViewsRepository.Talk.Properties.documentation);
		EditingUtils.setEEFtype(documentation, "eef::Textarea"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ConferenceViewsRepository.Talk.Properties.documentation, ConferenceViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
		Enumerator selection = (Enumerator) ((StructuredSelection) type.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.TalkPropertiesEditionPart#initType(Object input, Enumerator current)
	 */
	public void initType(Object input, Enumerator current) {
		type.setInput(input);
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
