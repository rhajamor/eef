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
package org.eclipse.emf.eef.extended.editor.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.extended.editor.parts.DynamicEEFEditorContributionPropertiesEditionPart;
import org.eclipse.emf.eef.extended.editor.parts.EditorViewsRepository;
import org.eclipse.emf.eef.extended.editor.providers.EditorMessages;
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
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
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
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;


// End of user code

/**
 * 
 * 
 */
public class DynamicEEFEditorContributionPropertiesEditionPartImpl extends CompositePropertiesEditingPart implements SWTPropertiesEditingPart, DynamicEEFEditorContributionPropertiesEditionPart {

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
	public DynamicEEFEditorContributionPropertiesEditionPartImpl(PropertiesEditingComponent editionComponent) {
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
		CompositionSequence dynamicEEFEditorContributionStep = new CompositionSequence();
		dynamicEEFEditorContributionStep
			.addStep(EditorViewsRepository.DynamicEEFEditorContribution.Naming.class)
			.addStep(EditorViewsRepository.DynamicEEFEditorContribution.Naming.name);
		
		CompositionStep bindingStep = dynamicEEFEditorContributionStep.addStep(EditorViewsRepository.DynamicEEFEditorContribution.Binding.class);
		bindingStep.addStep(EditorViewsRepository.DynamicEEFEditorContribution.Binding.model);
		bindingStep.addStep(EditorViewsRepository.DynamicEEFEditorContribution.Binding.views);
		
		
		composer = new PartComposer(dynamicEEFEditorContributionStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EditorViewsRepository.DynamicEEFEditorContribution.Naming.class) {
					return createNamingGroup(parent);
				}
				if (key == EditorViewsRepository.DynamicEEFEditorContribution.Naming.name) {
					return createNameText(parent);
				}
				if (key == EditorViewsRepository.DynamicEEFEditorContribution.Binding.class) {
					return createBindingGroup(parent);
				}
				if (key == EditorViewsRepository.DynamicEEFEditorContribution.Binding.model) {
					return createModelFlatComboViewer(parent);
				}
				if (key == EditorViewsRepository.DynamicEEFEditorContribution.Binding.views) {
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
	protected Composite createNamingGroup(Composite parent) {
		Group namingGroup = new Group(parent, SWT.NONE);
		namingGroup.setText(EditorMessages.DynamicEEFEditorContributionPropertiesEditionPart_NamingGroupLabel);
		GridData namingGroupData = new GridData(GridData.FILL_HORIZONTAL);
		namingGroupData.horizontalSpan = 3;
		namingGroup.setLayoutData(namingGroupData);
		GridLayout namingGroupLayout = new GridLayout();
		namingGroupLayout.numColumns = 3;
		namingGroup.setLayout(namingGroupLayout);
		return namingGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, EditorMessages.DynamicEEFEditorContributionPropertiesEditionPart_NameLabel, propertiesEditingComponent.isRequired(EditorViewsRepository.DynamicEEFEditorContribution.Naming.name, EditorViewsRepository.SWT_KIND));
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
					propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(DynamicEEFEditorContributionPropertiesEditionPartImpl.this, EditorViewsRepository.DynamicEEFEditorContribution.Naming.name, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, name.getText()));
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
						propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(DynamicEEFEditorContributionPropertiesEditionPartImpl.this, EditorViewsRepository.DynamicEEFEditorContribution.Naming.name, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, EditorViewsRepository.DynamicEEFEditorContribution.Naming.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditingComponent.getHelpContent(EditorViewsRepository.DynamicEEFEditorContribution.Naming.name, EditorViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createBindingGroup(Composite parent) {
		Group bindingGroup = new Group(parent, SWT.NONE);
		bindingGroup.setText(EditorMessages.DynamicEEFEditorContributionPropertiesEditionPart_BindingGroupLabel);
		GridData bindingGroupData = new GridData(GridData.FILL_HORIZONTAL);
		bindingGroupData.horizontalSpan = 3;
		bindingGroup.setLayoutData(bindingGroupData);
		GridLayout bindingGroupLayout = new GridLayout();
		bindingGroupLayout.numColumns = 3;
		bindingGroup.setLayout(bindingGroupLayout);
		return bindingGroup;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createModelFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, EditorMessages.DynamicEEFEditorContributionPropertiesEditionPart_ModelLabel, propertiesEditingComponent.isRequired(EditorViewsRepository.DynamicEEFEditorContribution.Binding.model, EditorViewsRepository.SWT_KIND));
		model = new EObjectFlatComboViewer(parent, !propertiesEditingComponent.isRequired(EditorViewsRepository.DynamicEEFEditorContribution.Binding.model, EditorViewsRepository.SWT_KIND));
		model.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		model.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(DynamicEEFEditorContributionPropertiesEditionPartImpl.this, EditorViewsRepository.DynamicEEFEditorContribution.Binding.model, PropertiesEditingEventImpl.CHANGE, PropertiesEditingEventImpl.SET, null, getModel()));
			}

		});
		GridData modelData = new GridData(GridData.FILL_HORIZONTAL);
		model.setLayoutData(modelData);
		model.setID(EditorViewsRepository.DynamicEEFEditorContribution.Binding.model);
		SWTUtils.createHelpButton(parent, propertiesEditingComponent.getHelpContent(EditorViewsRepository.DynamicEEFEditorContribution.Binding.model, EditorViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createViewsAdvancedReferencesTable(Composite parent) {
		this.views = new ReferencesTable(EditorMessages.DynamicEEFEditorContributionPropertiesEditionPart_ViewsLabel, new ReferencesTableListener() {
			public void handleAdd() { addViews(); }
			public void handleEdit(EObject element) { editViews(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveViews(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromViews(element); }
			public void navigateTo(EObject element) { }
		});
		this.views.setHelpText(propertiesEditingComponent.getHelpContent(EditorViewsRepository.DynamicEEFEditorContribution.Binding.views, EditorViewsRepository.SWT_KIND));
		this.views.createControls(parent);
		this.views.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(DynamicEEFEditorContributionPropertiesEditionPartImpl.this, EditorViewsRepository.DynamicEEFEditorContribution.Binding.views, PropertiesEditingEventImpl.CHANGE, PropertiesEditingEventImpl.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData viewsData = new GridData(GridData.FILL_HORIZONTAL);
		viewsData.horizontalSpan = 3;
		this.views.setLayoutData(viewsData);
		this.views.disableMove();
		views.setID(EditorViewsRepository.DynamicEEFEditorContribution.Binding.views);
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
					propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(DynamicEEFEditorContributionPropertiesEditionPartImpl.this, EditorViewsRepository.DynamicEEFEditorContribution.Binding.views,
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
		propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(DynamicEEFEditorContributionPropertiesEditionPartImpl.this, EditorViewsRepository.DynamicEEFEditorContribution.Binding.views, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.MOVE, element, newIndex));
		views.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromViews(EObject element) {
		propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(DynamicEEFEditorContributionPropertiesEditionPartImpl.this, EditorViewsRepository.DynamicEEFEditorContribution.Binding.views, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.REMOVE, null, element));
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
	 * @see org.eclipse.emf.eef.extended.editor.parts.DynamicEEFEditorContributionPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.extended.editor.parts.DynamicEEFEditorContributionPropertiesEditionPart#setName(String newValue)
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
	 * @see org.eclipse.emf.eef.extended.editor.parts.DynamicEEFEditorContributionPropertiesEditionPart#getModel()
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
	 * @see org.eclipse.emf.eef.extended.editor.parts.DynamicEEFEditorContributionPropertiesEditionPart#initModel(EObjectFlatComboSettings)
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
	 * @see org.eclipse.emf.eef.extended.editor.parts.DynamicEEFEditorContributionPropertiesEditionPart#setModel(EObject newValue)
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
	 * @see org.eclipse.emf.eef.extended.editor.parts.DynamicEEFEditorContributionPropertiesEditionPart#setModelButtonMode(ButtonsModeEnum newValue)
	 */
	public void setModelButtonMode(ButtonsModeEnum newValue) {
		model.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.extended.editor.parts.DynamicEEFEditorContributionPropertiesEditionPart#addFilterModel(ViewerFilter filter)
	 * 
	 */
	public void addFilterToModel(ViewerFilter filter) {
		model.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.extended.editor.parts.DynamicEEFEditorContributionPropertiesEditionPart#addBusinessFilterModel(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToModel(ViewerFilter filter) {
		model.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.extended.editor.parts.DynamicEEFEditorContributionPropertiesEditionPart#initViews(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.eclipse.emf.eef.extended.editor.parts.DynamicEEFEditorContributionPropertiesEditionPart#updateViews()
	 * 
	 */
	public void updateViews() {
	views.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.extended.editor.parts.DynamicEEFEditorContributionPropertiesEditionPart#addFilterViews(ViewerFilter filter)
	 * 
	 */
	public void addFilterToViews(ViewerFilter filter) {
		viewsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.extended.editor.parts.DynamicEEFEditorContributionPropertiesEditionPart#addBusinessFilterViews(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToViews(ViewerFilter filter) {
		viewsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.extended.editor.parts.DynamicEEFEditorContributionPropertiesEditionPart#isContainedInViewsTable(EObject element)
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
		return EditorMessages.DynamicEEFEditorContribution_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
