/**
 *  Copyright (c) 2008 - 2011 Obeo.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *      Obeo - initial API and implementation
 *
 */
package org.eclipse.emf.eef.components.parts.impl;

// Start of user code for imports

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.components.parts.ComponentsViewsRepository;
import org.eclipse.emf.eef.components.parts.PropertiesEditionComponentPropertiesEditionPart;
import org.eclipse.emf.eef.components.providers.ComponentsMessages;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
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
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;



// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class PropertiesEditionComponentPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, PropertiesEditionComponentPropertiesEditionPart {

	protected Text name;
	protected Text helpID;
	protected Button explicit;
	protected EObjectFlatComboViewer model;
	protected ReferencesTable views;
	protected List<ViewerFilter> viewsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> viewsFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public PropertiesEditionComponentPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence propertiesEditionComponentStep = new CompositionSequence();
		CompositionStep propertiesStep = propertiesEditionComponentStep.addStep(ComponentsViewsRepository.PropertiesEditionComponent.Properties.class);
		propertiesStep.addStep(ComponentsViewsRepository.PropertiesEditionComponent.Properties.name);
		propertiesStep.addStep(ComponentsViewsRepository.PropertiesEditionComponent.Properties.helpID);
		propertiesStep.addStep(ComponentsViewsRepository.PropertiesEditionComponent.Properties.explicit);
		
		CompositionStep bindingStep = propertiesEditionComponentStep.addStep(ComponentsViewsRepository.PropertiesEditionComponent.Binding.class);
		bindingStep.addStep(ComponentsViewsRepository.PropertiesEditionComponent.Binding.model);
		bindingStep.addStep(ComponentsViewsRepository.PropertiesEditionComponent.Binding.views);
		
		
		composer = new PartComposer(propertiesEditionComponentStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ComponentsViewsRepository.PropertiesEditionComponent.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == ComponentsViewsRepository.PropertiesEditionComponent.Properties.name) {
					return createNameText(parent);
				}
				if (key == ComponentsViewsRepository.PropertiesEditionComponent.Properties.helpID) {
					return createHelpIDText(parent);
				}
				if (key == ComponentsViewsRepository.PropertiesEditionComponent.Properties.explicit) {
					return createExplicitCheckbox(parent);
				}
				if (key == ComponentsViewsRepository.PropertiesEditionComponent.Binding.class) {
					return createBindingGroup(parent);
				}
				if (key == ComponentsViewsRepository.PropertiesEditionComponent.Binding.model) {
					return createModelFlatComboViewer(parent);
				}
				if (key == ComponentsViewsRepository.PropertiesEditionComponent.Binding.views) {
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
		propertiesGroup.setText(ComponentsMessages.PropertiesEditionComponentPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, ComponentsMessages.PropertiesEditionComponentPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(ComponentsViewsRepository.PropertiesEditionComponent.Properties.name, ComponentsViewsRepository.SWT_KIND));
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
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PropertiesEditionComponentPropertiesEditionPartImpl.this, ComponentsViewsRepository.PropertiesEditionComponent.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PropertiesEditionComponentPropertiesEditionPartImpl.this, ComponentsViewsRepository.PropertiesEditionComponent.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, ComponentsViewsRepository.PropertiesEditionComponent.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ComponentsViewsRepository.PropertiesEditionComponent.Properties.name, ComponentsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createHelpIDText(Composite parent) {
		SWTUtils.createPartLabel(parent, ComponentsMessages.PropertiesEditionComponentPropertiesEditionPart_HelpIDLabel, propertiesEditionComponent.isRequired(ComponentsViewsRepository.PropertiesEditionComponent.Properties.helpID, ComponentsViewsRepository.SWT_KIND));
		helpID = new Text(parent, SWT.BORDER);
		GridData helpIDData = new GridData(GridData.FILL_HORIZONTAL);
		helpID.setLayoutData(helpIDData);
		helpID.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PropertiesEditionComponentPropertiesEditionPartImpl.this, ComponentsViewsRepository.PropertiesEditionComponent.Properties.helpID, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, helpID.getText()));
			}

		});
		helpID.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PropertiesEditionComponentPropertiesEditionPartImpl.this, ComponentsViewsRepository.PropertiesEditionComponent.Properties.helpID, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, helpID.getText()));
				}
			}

		});
		EditingUtils.setID(helpID, ComponentsViewsRepository.PropertiesEditionComponent.Properties.helpID);
		EditingUtils.setEEFtype(helpID, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ComponentsViewsRepository.PropertiesEditionComponent.Properties.helpID, ComponentsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createExplicitCheckbox(Composite parent) {
		explicit = new Button(parent, SWT.CHECK);
		explicit.setText(ComponentsMessages.PropertiesEditionComponentPropertiesEditionPart_ExplicitLabel);
		explicit.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PropertiesEditionComponentPropertiesEditionPartImpl.this, ComponentsViewsRepository.PropertiesEditionComponent.Properties.explicit, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(explicit.getSelection())));
			}

		});
		GridData explicitData = new GridData(GridData.FILL_HORIZONTAL);
		explicitData.horizontalSpan = 2;
		explicit.setLayoutData(explicitData);
		EditingUtils.setID(explicit, ComponentsViewsRepository.PropertiesEditionComponent.Properties.explicit);
		EditingUtils.setEEFtype(explicit, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ComponentsViewsRepository.PropertiesEditionComponent.Properties.explicit, ComponentsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createBindingGroup(Composite parent) {
		Group bindingGroup = new Group(parent, SWT.NONE);
		bindingGroup.setText(ComponentsMessages.PropertiesEditionComponentPropertiesEditionPart_BindingGroupLabel);
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
		SWTUtils.createPartLabel(parent, ComponentsMessages.PropertiesEditionComponentPropertiesEditionPart_ModelLabel, propertiesEditionComponent.isRequired(ComponentsViewsRepository.PropertiesEditionComponent.Binding.model, ComponentsViewsRepository.SWT_KIND));
		model = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ComponentsViewsRepository.PropertiesEditionComponent.Binding.model, ComponentsViewsRepository.SWT_KIND));
		model.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		model.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PropertiesEditionComponentPropertiesEditionPartImpl.this, ComponentsViewsRepository.PropertiesEditionComponent.Binding.model, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getModel()));
			}

		});
		GridData modelData = new GridData(GridData.FILL_HORIZONTAL);
		model.setLayoutData(modelData);
		model.setID(ComponentsViewsRepository.PropertiesEditionComponent.Binding.model);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ComponentsViewsRepository.PropertiesEditionComponent.Binding.model, ComponentsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createViewsAdvancedReferencesTable(Composite parent) {
		this.views = new ReferencesTable(ComponentsMessages.PropertiesEditionComponentPropertiesEditionPart_ViewsLabel, new ReferencesTableListener() {
			public void handleAdd() { addViews(); }
			public void handleEdit(EObject element) { editViews(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveViews(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromViews(element); }
			public void navigateTo(EObject element) { }
		});
		this.views.setHelpText(propertiesEditionComponent.getHelpContent(ComponentsViewsRepository.PropertiesEditionComponent.Binding.views, ComponentsViewsRepository.SWT_KIND));
		this.views.createControls(parent);
		this.views.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PropertiesEditionComponentPropertiesEditionPartImpl.this, ComponentsViewsRepository.PropertiesEditionComponent.Binding.views, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData viewsData = new GridData(GridData.FILL_HORIZONTAL);
		viewsData.horizontalSpan = 3;
		this.views.setLayoutData(viewsData);
		this.views.disableMove();
		views.setID(ComponentsViewsRepository.PropertiesEditionComponent.Binding.views);
		views.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addViews() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(views.getInput(), viewsFilters, viewsBusinessFilters,
		"views", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PropertiesEditionComponentPropertiesEditionPartImpl.this, ComponentsViewsRepository.PropertiesEditionComponent.Binding.views,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PropertiesEditionComponentPropertiesEditionPartImpl.this, ComponentsViewsRepository.PropertiesEditionComponent.Binding.views, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		views.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromViews(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PropertiesEditionComponentPropertiesEditionPartImpl.this, ComponentsViewsRepository.PropertiesEditionComponent.Binding.views, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		views.refresh();
	}

	/**
	 * 
	 */
	protected void editViews(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
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
	 * @see org.eclipse.emf.eef.components.parts.PropertiesEditionComponentPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.components.parts.PropertiesEditionComponentPropertiesEditionPart#setName(String newValue)
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
	 * @see org.eclipse.emf.eef.components.parts.PropertiesEditionComponentPropertiesEditionPart#getHelpID()
	 * 
	 */
	public String getHelpID() {
		return helpID.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.components.parts.PropertiesEditionComponentPropertiesEditionPart#setHelpID(String newValue)
	 * 
	 */
	public void setHelpID(String newValue) {
		if (newValue != null) {
			helpID.setText(newValue);
		} else {
			helpID.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.components.parts.PropertiesEditionComponentPropertiesEditionPart#getExplicit()
	 * 
	 */
	public Boolean getExplicit() {
		return Boolean.valueOf(explicit.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.components.parts.PropertiesEditionComponentPropertiesEditionPart#setExplicit(Boolean newValue)
	 * 
	 */
	public void setExplicit(Boolean newValue) {
		if (newValue != null) {
			explicit.setSelection(newValue.booleanValue());
		} else {
			explicit.setSelection(false);
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.components.parts.PropertiesEditionComponentPropertiesEditionPart#getModel()
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
	 * @see org.eclipse.emf.eef.components.parts.PropertiesEditionComponentPropertiesEditionPart#initModel(EObjectFlatComboSettings)
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
	 * @see org.eclipse.emf.eef.components.parts.PropertiesEditionComponentPropertiesEditionPart#setModel(EObject newValue)
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
	 * @see org.eclipse.emf.eef.components.parts.PropertiesEditionComponentPropertiesEditionPart#setModelButtonMode(ButtonsModeEnum newValue)
	 */
	public void setModelButtonMode(ButtonsModeEnum newValue) {
		model.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.components.parts.PropertiesEditionComponentPropertiesEditionPart#addFilterModel(ViewerFilter filter)
	 * 
	 */
	public void addFilterToModel(ViewerFilter filter) {
		model.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.components.parts.PropertiesEditionComponentPropertiesEditionPart#addBusinessFilterModel(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToModel(ViewerFilter filter) {
		model.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.components.parts.PropertiesEditionComponentPropertiesEditionPart#initViews(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.eclipse.emf.eef.components.parts.PropertiesEditionComponentPropertiesEditionPart#updateViews()
	 * 
	 */
	public void updateViews() {
	views.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.components.parts.PropertiesEditionComponentPropertiesEditionPart#addFilterViews(ViewerFilter filter)
	 * 
	 */
	public void addFilterToViews(ViewerFilter filter) {
		viewsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.components.parts.PropertiesEditionComponentPropertiesEditionPart#addBusinessFilterViews(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToViews(ViewerFilter filter) {
		viewsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.components.parts.PropertiesEditionComponentPropertiesEditionPart#isContainedInViewsTable(EObject element)
	 * 
	 */
	public boolean isContainedInViewsTable(EObject element) {
		return ((ReferencesTableSettings)views.getInput()).contains(element);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ComponentsMessages.PropertiesEditionComponent_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
