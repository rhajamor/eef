/*******************************************************************************
 * Copyright (c) 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.extended.query.parts.forms;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.extended.query.parts.OCLQueryPropertiesEditionPart;
import org.eclipse.emf.eef.extended.query.parts.QueryViewsRepository;
import org.eclipse.emf.eef.extended.query.providers.QueryMessages;
import org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.notify.PropertiesEditingEvent;
import org.eclipse.emf.eef.runtime.notify.impl.PropertiesEditingEventImpl;
import org.eclipse.emf.eef.runtime.parts.FormPropertiesEditingPart;
import org.eclipse.emf.eef.runtime.parts.impl.CompositePropertiesEditingPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
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
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;


// End of user code

/**
 * 
 * 
 */
public class OCLQueryPropertiesEditionPartForm extends CompositePropertiesEditingPart implements FormPropertiesEditingPart, OCLQueryPropertiesEditionPart {

	protected EObjectFlatComboViewer context;
	protected Text query;



	/**
	 * Default constructor
	 * @param editionComponent the {@link PropertiesEditingComponent} that manage this part
	 * 
	 */
	public OCLQueryPropertiesEditionPartForm(PropertiesEditingComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.parts.FormPropertiesEditingPart#
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
	 * @see org.eclipse.emf.eef.runtime.parts.FormPropertiesEditingPart#
	 *  createControls(org.eclipse.ui.forms.widgets.FormToolkit, org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(final FormToolkit widgetFactory, Composite view) {
		CompositionSequence oCLQueryStep = new CompositionSequence();
		CompositionStep propertiesStep = oCLQueryStep.addStep(QueryViewsRepository.OCLQuery.Properties.class);
		propertiesStep.addStep(QueryViewsRepository.OCLQuery.Properties.context);
		propertiesStep.addStep(QueryViewsRepository.OCLQuery.Properties.query_);
		
		
		composer = new PartComposer(oCLQueryStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == QueryViewsRepository.OCLQuery.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == QueryViewsRepository.OCLQuery.Properties.context) {
					return createContextFlatComboViewer(parent, widgetFactory);
				}
				if (key == QueryViewsRepository.OCLQuery.Properties.query_) {
					return 		createQueryText(widgetFactory, parent);
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
		propertiesSection.setText(QueryMessages.OCLQueryPropertiesEditionPart_PropertiesGroupLabel);
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

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createContextFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, QueryMessages.OCLQueryPropertiesEditionPart_ContextLabel, propertiesEditingComponent.isRequired(QueryViewsRepository.OCLQuery.Properties.context, QueryViewsRepository.FORM_KIND));
		context = new EObjectFlatComboViewer(parent, !propertiesEditingComponent.isRequired(QueryViewsRepository.OCLQuery.Properties.context, QueryViewsRepository.FORM_KIND));
		context.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData contextData = new GridData(GridData.FILL_HORIZONTAL);
		context.setLayoutData(contextData);
		context.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditingComponent != null)
					propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(OCLQueryPropertiesEditionPartForm.this, QueryViewsRepository.OCLQuery.Properties.context, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, getContext()));
			}

		});
		context.setID(QueryViewsRepository.OCLQuery.Properties.context);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditingComponent.getHelpContent(QueryViewsRepository.OCLQuery.Properties.context, QueryViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createQueryText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, QueryMessages.OCLQueryPropertiesEditionPart_QueryLabel, propertiesEditingComponent.isRequired(QueryViewsRepository.OCLQuery.Properties.query_, QueryViewsRepository.FORM_KIND));
		query = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		query.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData queryData = new GridData(GridData.FILL_HORIZONTAL);
		query.setLayoutData(queryData);
		query.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditingComponent != null)
					propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(OCLQueryPropertiesEditionPartForm.this, QueryViewsRepository.OCLQuery.Properties.query_, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, query.getText()));
			}
		});
		query.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditingComponent != null)
						propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(OCLQueryPropertiesEditionPartForm.this, QueryViewsRepository.OCLQuery.Properties.query_, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, query.getText()));
				}
			}
		});
		EditingUtils.setID(query, QueryViewsRepository.OCLQuery.Properties.query_);
		EditingUtils.setEEFtype(query, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditingComponent.getHelpContent(QueryViewsRepository.OCLQuery.Properties.query_, QueryViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see org.eclipse.emf.eef.extended.query.parts.OCLQueryPropertiesEditionPart#getContext()
	 * 
	 */
	public EObject getContext() {
		if (context.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) context.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.extended.query.parts.OCLQueryPropertiesEditionPart#initContext(EObjectFlatComboSettings)
	 */
	public void initContext(EObjectFlatComboSettings settings) {
		context.setInput(settings);
		if (current != null) {
			context.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.extended.query.parts.OCLQueryPropertiesEditionPart#setContext(EObject newValue)
	 * 
	 */
	public void setContext(EObject newValue) {
		if (newValue != null) {
			context.setSelection(new StructuredSelection(newValue));
		} else {
			context.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.extended.query.parts.OCLQueryPropertiesEditionPart#setContextButtonMode(ButtonsModeEnum newValue)
	 */
	public void setContextButtonMode(ButtonsModeEnum newValue) {
		context.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.extended.query.parts.OCLQueryPropertiesEditionPart#addFilterContext(ViewerFilter filter)
	 * 
	 */
	public void addFilterToContext(ViewerFilter filter) {
		context.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.extended.query.parts.OCLQueryPropertiesEditionPart#addBusinessFilterContext(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToContext(ViewerFilter filter) {
		context.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.extended.query.parts.OCLQueryPropertiesEditionPart#getQuery()
	 * 
	 */
	public String getQuery() {
		return query.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.extended.query.parts.OCLQueryPropertiesEditionPart#setQuery(String newValue)
	 * 
	 */
	public void setQuery(String newValue) {
		if (newValue != null) {
			query.setText(newValue);
		} else {
			query.setText(""); //$NON-NLS-1$
		}
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.parts.PropertiesEditingPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return QueryMessages.OCLQuery_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
