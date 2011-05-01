/*******************************************************************************
 * Copyright (c) 2008, 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.mapping.parts.forms;

// Start of user code for imports

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.mapping.parts.EMFElementBindingPropertiesEditionPart;
import org.eclipse.emf.eef.mapping.parts.MappingViewsRepository;
import org.eclipse.emf.eef.mapping.providers.MappingMessages;
import org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditingContext;
import org.eclipse.emf.eef.runtime.notify.PropertiesEditingEvent;
import org.eclipse.emf.eef.runtime.notify.impl.PropertiesEditingEventImpl;
import org.eclipse.emf.eef.runtime.parts.FormPropertiesEditingPart;
import org.eclipse.emf.eef.runtime.parts.impl.CompositePropertiesEditingPart;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
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
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class EMFElementBindingPropertiesEditionPartForm extends CompositePropertiesEditingPart implements FormPropertiesEditingPart, EMFElementBindingPropertiesEditionPart {

	protected Text name;
	protected EObjectFlatComboViewer model;
		protected ReferencesTable views;
		protected List<ViewerFilter> viewsBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> viewsFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link PropertiesEditingComponent} that manage this part
	 * 
	 */
	public EMFElementBindingPropertiesEditionPartForm(PropertiesEditingComponent editionComponent) {
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
		CompositionSequence eMFElementBindingStep = new CompositionSequence();
		eMFElementBindingStep
			.addStep(MappingViewsRepository.EMFElementBinding.Properties.class)
			.addStep(MappingViewsRepository.EMFElementBinding.Properties.name);
		
		CompositionStep bindingStep = eMFElementBindingStep.addStep(MappingViewsRepository.EMFElementBinding.Binding.class);
		bindingStep.addStep(MappingViewsRepository.EMFElementBinding.Binding.model);
		bindingStep.addStep(MappingViewsRepository.EMFElementBinding.Binding.views);
		
		
		composer = new PartComposer(eMFElementBindingStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == MappingViewsRepository.EMFElementBinding.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == MappingViewsRepository.EMFElementBinding.Properties.name) {
					return 		createNameText(widgetFactory, parent);
				}
				if (key == MappingViewsRepository.EMFElementBinding.Binding.class) {
					return createBindingGroup(widgetFactory, parent);
				}
				if (key == MappingViewsRepository.EMFElementBinding.Binding.model) {
					return createModelFlatComboViewer(parent, widgetFactory);
				}
				if (key == MappingViewsRepository.EMFElementBinding.Binding.views) {
					return createViewsReferencesTable(widgetFactory, parent);
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
		propertiesSection.setText(MappingMessages.EMFElementBindingPropertiesEditionPart_PropertiesGroupLabel);
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

	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, MappingMessages.EMFElementBindingPropertiesEditionPart_NameLabel, propertiesEditingComponent.isRequired(MappingViewsRepository.EMFElementBinding.Properties.name, MappingViewsRepository.FORM_KIND));
		name = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		name.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditingComponent != null)
					propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(EMFElementBindingPropertiesEditionPartForm.this, MappingViewsRepository.EMFElementBinding.Properties.name, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, name.getText()));
			}
		});
		name.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditingComponent != null)
						propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(EMFElementBindingPropertiesEditionPartForm.this, MappingViewsRepository.EMFElementBinding.Properties.name, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, MappingViewsRepository.EMFElementBinding.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditingComponent.getHelpContent(MappingViewsRepository.EMFElementBinding.Properties.name, MappingViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createBindingGroup(FormToolkit widgetFactory, final Composite parent) {
		Section bindingSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		bindingSection.setText(MappingMessages.EMFElementBindingPropertiesEditionPart_BindingGroupLabel);
		GridData bindingSectionData = new GridData(GridData.FILL_HORIZONTAL);
		bindingSectionData.horizontalSpan = 3;
		bindingSection.setLayoutData(bindingSectionData);
		Composite bindingGroup = widgetFactory.createComposite(bindingSection);
		GridLayout bindingGroupLayout = new GridLayout();
		bindingGroupLayout.numColumns = 3;
		bindingGroup.setLayout(bindingGroupLayout);
		bindingSection.setClient(bindingGroup);
		return bindingGroup;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createModelFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, MappingMessages.EMFElementBindingPropertiesEditionPart_ModelLabel, propertiesEditingComponent.isRequired(MappingViewsRepository.EMFElementBinding.Binding.model, MappingViewsRepository.FORM_KIND));
		model = new EObjectFlatComboViewer(parent, !propertiesEditingComponent.isRequired(MappingViewsRepository.EMFElementBinding.Binding.model, MappingViewsRepository.FORM_KIND));
		model.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData modelData = new GridData(GridData.FILL_HORIZONTAL);
		model.setLayoutData(modelData);
		model.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditingComponent != null)
					propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(EMFElementBindingPropertiesEditionPartForm.this, MappingViewsRepository.EMFElementBinding.Binding.model, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, getModel()));
			}

		});
		model.setID(MappingViewsRepository.EMFElementBinding.Binding.model);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditingComponent.getHelpContent(MappingViewsRepository.EMFElementBinding.Binding.model, MappingViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createViewsReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.views = new ReferencesTable(MappingMessages.EMFElementBindingPropertiesEditionPart_ViewsLabel, new ReferencesTableListener	() {
			public void handleAdd() { addViews(); }
			public void handleEdit(EObject element) { editViews(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveViews(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromViews(element); }
			public void navigateTo(EObject element) { }
		});
		this.views.setHelpText(propertiesEditingComponent.getHelpContent(MappingViewsRepository.EMFElementBinding.Binding.views, MappingViewsRepository.FORM_KIND));
		this.views.createControls(parent, widgetFactory);
		this.views.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(EMFElementBindingPropertiesEditionPartForm.this, MappingViewsRepository.EMFElementBinding.Binding.views, PropertiesEditingEventImpl.CHANGE, PropertiesEditingEventImpl.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData viewsData = new GridData(GridData.FILL_HORIZONTAL);
		viewsData.horizontalSpan = 3;
		this.views.setLayoutData(viewsData);
		this.views.disableMove();
		views.setID(MappingViewsRepository.EMFElementBinding.Binding.views);
		views.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addViews() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(views.getInput(), viewsFilters, viewsBusinessFilters,
		"views", propertiesEditingComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(EMFElementBindingPropertiesEditionPartForm.this, MappingViewsRepository.EMFElementBinding.Binding.views,
						PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.ADD, null, elem));
				}
				views.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveViews(EObject element, int oldIndex, int newIndex) {
		propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(EMFElementBindingPropertiesEditionPartForm.this, MappingViewsRepository.EMFElementBinding.Binding.views, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.MOVE, element, newIndex));
		views.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromViews(EObject element) {
		propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(EMFElementBindingPropertiesEditionPartForm.this, MappingViewsRepository.EMFElementBinding.Binding.views, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.REMOVE, null, element));
		views.refresh();
	}

	/**
	 * 
	 */
	protected void editViews(EObject element) {
		EObjectPropertiesEditingContext context = new EObjectPropertiesEditingContext(propertiesEditingComponent.getEditingContext(), propertiesEditingComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				views.refresh();
			}
		}
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.notify.PropertiesEditingListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.notify.PropertiesEditingEvent)
	 * 
	 */
	public void firePropertiesChanged(PropertiesEditingEvent event) {
		// Start of user code for tab synchronization

// Nothing to do
// End of user code
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.mapping.parts.EMFElementBindingPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.mapping.parts.EMFElementBindingPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.mapping.parts.EMFElementBindingPropertiesEditionPart#getModel()
	 * 
	 */
	public EObject getModel() {
		if (model.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) model.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.mapping.parts.EMFElementBindingPropertiesEditionPart#initModel(EObjectFlatComboSettings)
	 */
	public void initModel(EObjectFlatComboSettings settings) {
		model.setInput(settings);
		if (current != null) {
			model.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.mapping.parts.EMFElementBindingPropertiesEditionPart#setModel(EObject newValue)
	 * 
	 */
	public void setModel(EObject newValue) {
		if (newValue != null) {
			model.setSelection(new StructuredSelection(newValue));
		} else {
			model.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.mapping.parts.EMFElementBindingPropertiesEditionPart#setModelButtonMode(ButtonsModeEnum newValue)
	 */
	public void setModelButtonMode(ButtonsModeEnum newValue) {
		model.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.mapping.parts.EMFElementBindingPropertiesEditionPart#addFilterModel(ViewerFilter filter)
	 * 
	 */
	public void addFilterToModel(ViewerFilter filter) {
		model.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.mapping.parts.EMFElementBindingPropertiesEditionPart#addBusinessFilterModel(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToModel(ViewerFilter filter) {
		model.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.mapping.parts.EMFElementBindingPropertiesEditionPart#initViews(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initViews(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		views.setContentProvider(contentProvider);
		views.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.mapping.parts.EMFElementBindingPropertiesEditionPart#updateViews()
	 * 
	 */
	public void updateViews() {
	views.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.mapping.parts.EMFElementBindingPropertiesEditionPart#addFilterViews(ViewerFilter filter)
	 * 
	 */
	public void addFilterToViews(ViewerFilter filter) {
		viewsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.mapping.parts.EMFElementBindingPropertiesEditionPart#addBusinessFilterViews(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToViews(ViewerFilter filter) {
		viewsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.mapping.parts.EMFElementBindingPropertiesEditionPart#isContainedInViewsTable(EObject element)
	 * 
	 */
	public boolean isContainedInViewsTable(EObject element) {
		return ((ReferencesTableSettings)views.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.parts.PropertiesEditingPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return MappingMessages.EMFElementBinding_Part_Title;
	}

	// Start of user code additional methods
 	
	// End of user code


}
