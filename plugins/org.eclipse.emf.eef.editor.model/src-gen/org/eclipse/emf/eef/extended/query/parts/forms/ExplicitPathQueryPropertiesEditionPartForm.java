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
import org.eclipse.emf.eef.extended.query.parts.ExplicitPathQueryPropertiesEditionPart;
import org.eclipse.emf.eef.extended.query.parts.QueryViewsRepository;
import org.eclipse.emf.eef.extended.query.providers.QueryMessages;
import org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.notify.PropertiesEditingEvent;
import org.eclipse.emf.eef.runtime.notify.impl.PropertiesEditingEventImpl;
import org.eclipse.emf.eef.runtime.parts.FormPropertiesEditingPart;
import org.eclipse.emf.eef.runtime.parts.impl.CompositePropertiesEditingPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;


// End of user code

/**
 * 
 * 
 */
public class ExplicitPathQueryPropertiesEditionPartForm extends CompositePropertiesEditingPart implements FormPropertiesEditingPart, ExplicitPathQueryPropertiesEditionPart {

	protected EObjectFlatComboViewer query;



	/**
	 * Default constructor
	 * @param editionComponent the {@link PropertiesEditingComponent} that manage this part
	 * 
	 */
	public ExplicitPathQueryPropertiesEditionPartForm(PropertiesEditingComponent editionComponent) {
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
		CompositionSequence explicitPathQueryStep = new CompositionSequence();
		explicitPathQueryStep
			.addStep(QueryViewsRepository.ExplicitPathQuery.Properties.class)
			.addStep(QueryViewsRepository.ExplicitPathQuery.Properties.query_);
		
		
		composer = new PartComposer(explicitPathQueryStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == QueryViewsRepository.ExplicitPathQuery.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == QueryViewsRepository.ExplicitPathQuery.Properties.query_) {
					return createQueryFlatComboViewer(parent, widgetFactory);
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
		propertiesSection.setText(QueryMessages.ExplicitPathQueryPropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createQueryFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, QueryMessages.ExplicitPathQueryPropertiesEditionPart_QueryLabel, propertiesEditingComponent.isRequired(QueryViewsRepository.ExplicitPathQuery.Properties.query_, QueryViewsRepository.FORM_KIND));
		query = new EObjectFlatComboViewer(parent, !propertiesEditingComponent.isRequired(QueryViewsRepository.ExplicitPathQuery.Properties.query_, QueryViewsRepository.FORM_KIND));
		query.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData queryData = new GridData(GridData.FILL_HORIZONTAL);
		query.setLayoutData(queryData);
		query.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditingComponent != null)
					propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(ExplicitPathQueryPropertiesEditionPartForm.this, QueryViewsRepository.ExplicitPathQuery.Properties.query_, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, getQuery()));
			}

		});
		query.setID(QueryViewsRepository.ExplicitPathQuery.Properties.query_);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditingComponent.getHelpContent(QueryViewsRepository.ExplicitPathQuery.Properties.query_, QueryViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see org.eclipse.emf.eef.extended.query.parts.ExplicitPathQueryPropertiesEditionPart#getQuery()
	 * 
	 */
	public EObject getQuery() {
		if (query.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) query.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.extended.query.parts.ExplicitPathQueryPropertiesEditionPart#initQuery(EObjectFlatComboSettings)
	 */
	public void initQuery(EObjectFlatComboSettings settings) {
		query.setInput(settings);
		if (current != null) {
			query.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.extended.query.parts.ExplicitPathQueryPropertiesEditionPart#setQuery(EObject newValue)
	 * 
	 */
	public void setQuery(EObject newValue) {
		if (newValue != null) {
			query.setSelection(new StructuredSelection(newValue));
		} else {
			query.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.extended.query.parts.ExplicitPathQueryPropertiesEditionPart#setQueryButtonMode(ButtonsModeEnum newValue)
	 */
	public void setQueryButtonMode(ButtonsModeEnum newValue) {
		query.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.extended.query.parts.ExplicitPathQueryPropertiesEditionPart#addFilterQuery(ViewerFilter filter)
	 * 
	 */
	public void addFilterToQuery(ViewerFilter filter) {
		query.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.extended.query.parts.ExplicitPathQueryPropertiesEditionPart#addBusinessFilterQuery(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToQuery(ViewerFilter filter) {
		query.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.parts.PropertiesEditingPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return QueryMessages.ExplicitPathQuery_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
