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
package org.eclipse.emf.eef.mapping.parts.impl;

// Start of user code for imports

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.mapping.parts.EMFMultiPropertiesBindingPropertiesEditionPart;
import org.eclipse.emf.eef.mapping.parts.MappingViewsRepository;
import org.eclipse.emf.eef.mapping.providers.MappingMessages;
import org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditingContext;
import org.eclipse.emf.eef.runtime.notify.PropertiesEditingEvent;
import org.eclipse.emf.eef.runtime.notify.impl.PropertiesEditingEventImpl;
import org.eclipse.emf.eef.runtime.parts.SWTPropertiesEditingPart;
import org.eclipse.emf.eef.runtime.parts.impl.CompositePropertiesEditingPart;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.IStructuredSelection;
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
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class EMFMultiPropertiesBindingPropertiesEditionPartImpl extends CompositePropertiesEditingPart implements SWTPropertiesEditingPart, EMFMultiPropertiesBindingPropertiesEditionPart {

	protected Text name;
	protected ReferencesTable model;
	protected List<ViewerFilter> modelBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> modelFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable views;
	protected List<ViewerFilter> viewsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> viewsFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link PropertiesEditingComponent} that manage this part
	 * 
	 */
	public EMFMultiPropertiesBindingPropertiesEditionPartImpl(PropertiesEditingComponent editionComponent) {
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
		CompositionSequence eMFMultiPropertiesBindingStep = new CompositionSequence();
		eMFMultiPropertiesBindingStep
			.addStep(MappingViewsRepository.EMFMultiPropertiesBinding.Properties.class)
			.addStep(MappingViewsRepository.EMFMultiPropertiesBinding.Properties.name);
		
		CompositionStep bindingStep = eMFMultiPropertiesBindingStep.addStep(MappingViewsRepository.EMFMultiPropertiesBinding.Binding.class);
		bindingStep.addStep(MappingViewsRepository.EMFMultiPropertiesBinding.Binding.model);
		bindingStep.addStep(MappingViewsRepository.EMFMultiPropertiesBinding.Binding.views);
		
		
		composer = new PartComposer(eMFMultiPropertiesBindingStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == MappingViewsRepository.EMFMultiPropertiesBinding.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == MappingViewsRepository.EMFMultiPropertiesBinding.Properties.name) {
					return createNameText(parent);
				}
				if (key == MappingViewsRepository.EMFMultiPropertiesBinding.Binding.class) {
					return createBindingGroup(parent);
				}
				if (key == MappingViewsRepository.EMFMultiPropertiesBinding.Binding.model) {
					return createModelAdvancedReferencesTable(parent);
				}
				if (key == MappingViewsRepository.EMFMultiPropertiesBinding.Binding.views) {
					return createViewsAdvancedReferencesTable(parent);
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
		propertiesGroup.setText(MappingMessages.EMFMultiPropertiesBindingPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, MappingMessages.EMFMultiPropertiesBindingPropertiesEditionPart_NameLabel, propertiesEditingComponent.isRequired(MappingViewsRepository.EMFMultiPropertiesBinding.Properties.name, MappingViewsRepository.SWT_KIND));
		name = new Text(parent, SWT.BORDER);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditingComponent != null)
					propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(EMFMultiPropertiesBindingPropertiesEditionPartImpl.this, MappingViewsRepository.EMFMultiPropertiesBinding.Properties.name, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, name.getText()));
			}

		});
		name.addKeyListener(new KeyAdapter() {

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
					if (propertiesEditingComponent != null)
						propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(EMFMultiPropertiesBindingPropertiesEditionPartImpl.this, MappingViewsRepository.EMFMultiPropertiesBinding.Properties.name, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, MappingViewsRepository.EMFMultiPropertiesBinding.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditingComponent.getHelpContent(MappingViewsRepository.EMFMultiPropertiesBinding.Properties.name, MappingViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createBindingGroup(Composite parent) {
		Group bindingGroup = new Group(parent, SWT.NONE);
		bindingGroup.setText(MappingMessages.EMFMultiPropertiesBindingPropertiesEditionPart_BindingGroupLabel);
		GridData bindingGroupData = new GridData(GridData.FILL_HORIZONTAL);
		bindingGroupData.horizontalSpan = 3;
		bindingGroup.setLayoutData(bindingGroupData);
		GridLayout bindingGroupLayout = new GridLayout();
		bindingGroupLayout.numColumns = 3;
		bindingGroup.setLayout(bindingGroupLayout);
		return bindingGroup;
	}

	/**
	 * 
	 */
	protected Composite createModelAdvancedReferencesTable(Composite parent) {
		this.model = new ReferencesTable(MappingMessages.EMFMultiPropertiesBindingPropertiesEditionPart_ModelLabel, new ReferencesTableListener() {
			public void handleAdd() { addModel(); }
			public void handleEdit(EObject element) { editModel(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveModel(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromModel(element); }
			public void navigateTo(EObject element) { }
		});
		this.model.setHelpText(propertiesEditingComponent.getHelpContent(MappingViewsRepository.EMFMultiPropertiesBinding.Binding.model, MappingViewsRepository.SWT_KIND));
		this.model.createControls(parent);
		this.model.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(EMFMultiPropertiesBindingPropertiesEditionPartImpl.this, MappingViewsRepository.EMFMultiPropertiesBinding.Binding.model, PropertiesEditingEventImpl.CHANGE, PropertiesEditingEventImpl.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData modelData = new GridData(GridData.FILL_HORIZONTAL);
		modelData.horizontalSpan = 3;
		this.model.setLayoutData(modelData);
		this.model.disableMove();
		model.setID(MappingViewsRepository.EMFMultiPropertiesBinding.Binding.model);
		model.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addModel() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(model.getInput(), modelFilters, modelBusinessFilters,
		"model", propertiesEditingComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(EMFMultiPropertiesBindingPropertiesEditionPartImpl.this, MappingViewsRepository.EMFMultiPropertiesBinding.Binding.model,
						PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.ADD, null, elem));
				}
				model.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveModel(EObject element, int oldIndex, int newIndex) {
		propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(EMFMultiPropertiesBindingPropertiesEditionPartImpl.this, MappingViewsRepository.EMFMultiPropertiesBinding.Binding.model, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.MOVE, element, newIndex));
		model.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromModel(EObject element) {
		propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(EMFMultiPropertiesBindingPropertiesEditionPartImpl.this, MappingViewsRepository.EMFMultiPropertiesBinding.Binding.model, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.REMOVE, null, element));
		model.refresh();
	}

	/**
	 * 
	 */
	protected void editModel(EObject element) {
		EObjectPropertiesEditingContext context = new EObjectPropertiesEditingContext(propertiesEditingComponent.getEditingContext(), propertiesEditingComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				model.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createViewsAdvancedReferencesTable(Composite parent) {
		this.views = new ReferencesTable(MappingMessages.EMFMultiPropertiesBindingPropertiesEditionPart_ViewsLabel, new ReferencesTableListener() {
			public void handleAdd() { addViews(); }
			public void handleEdit(EObject element) { editViews(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveViews(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromViews(element); }
			public void navigateTo(EObject element) { }
		});
		this.views.setHelpText(propertiesEditingComponent.getHelpContent(MappingViewsRepository.EMFMultiPropertiesBinding.Binding.views, MappingViewsRepository.SWT_KIND));
		this.views.createControls(parent);
		this.views.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(EMFMultiPropertiesBindingPropertiesEditionPartImpl.this, MappingViewsRepository.EMFMultiPropertiesBinding.Binding.views, PropertiesEditingEventImpl.CHANGE, PropertiesEditingEventImpl.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData viewsData = new GridData(GridData.FILL_HORIZONTAL);
		viewsData.horizontalSpan = 3;
		this.views.setLayoutData(viewsData);
		this.views.disableMove();
		views.setID(MappingViewsRepository.EMFMultiPropertiesBinding.Binding.views);
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
					propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(EMFMultiPropertiesBindingPropertiesEditionPartImpl.this, MappingViewsRepository.EMFMultiPropertiesBinding.Binding.views,
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
		propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(EMFMultiPropertiesBindingPropertiesEditionPartImpl.this, MappingViewsRepository.EMFMultiPropertiesBinding.Binding.views, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.MOVE, element, newIndex));
		views.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromViews(EObject element) {
		propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(EMFMultiPropertiesBindingPropertiesEditionPartImpl.this, MappingViewsRepository.EMFMultiPropertiesBinding.Binding.views, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.REMOVE, null, element));
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

// End of user code
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.mapping.parts.EMFMultiPropertiesBindingPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.mapping.parts.EMFMultiPropertiesBindingPropertiesEditionPart#setName(String newValue)
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
	 * @see org.eclipse.emf.eef.mapping.parts.EMFMultiPropertiesBindingPropertiesEditionPart#initModel(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initModel(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		model.setContentProvider(contentProvider);
		model.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.mapping.parts.EMFMultiPropertiesBindingPropertiesEditionPart#updateModel()
	 * 
	 */
	public void updateModel() {
	model.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.mapping.parts.EMFMultiPropertiesBindingPropertiesEditionPart#addFilterModel(ViewerFilter filter)
	 * 
	 */
	public void addFilterToModel(ViewerFilter filter) {
		modelFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.mapping.parts.EMFMultiPropertiesBindingPropertiesEditionPart#addBusinessFilterModel(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToModel(ViewerFilter filter) {
		modelBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.mapping.parts.EMFMultiPropertiesBindingPropertiesEditionPart#isContainedInModelTable(EObject element)
	 * 
	 */
	public boolean isContainedInModelTable(EObject element) {
		return ((ReferencesTableSettings)model.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.mapping.parts.EMFMultiPropertiesBindingPropertiesEditionPart#initViews(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.eclipse.emf.eef.mapping.parts.EMFMultiPropertiesBindingPropertiesEditionPart#updateViews()
	 * 
	 */
	public void updateViews() {
	views.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.mapping.parts.EMFMultiPropertiesBindingPropertiesEditionPart#addFilterViews(ViewerFilter filter)
	 * 
	 */
	public void addFilterToViews(ViewerFilter filter) {
		viewsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.mapping.parts.EMFMultiPropertiesBindingPropertiesEditionPart#addBusinessFilterViews(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToViews(ViewerFilter filter) {
		viewsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.mapping.parts.EMFMultiPropertiesBindingPropertiesEditionPart#isContainedInViewsTable(EObject element)
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
		return MappingMessages.EMFMultiPropertiesBinding_Part_Title;
	}

	// Start of user code additional methods
 	
	// End of user code


}
