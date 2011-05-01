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
import org.eclipse.emf.eef.extended.editor.parts.EditorViewsRepository;
import org.eclipse.emf.eef.extended.editor.parts.StaticEEFEditorContributionPropertiesEditionPart;
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
 * 
 * 
 */
public class StaticEEFEditorContributionPropertiesEditionPartImpl extends CompositePropertiesEditingPart implements SWTPropertiesEditingPart, StaticEEFEditorContributionPropertiesEditionPart {

	protected Text name;
	protected ReferencesTable views;
	protected List<ViewerFilter> viewsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> viewsFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link PropertiesEditingComponent} that manage this part
	 * 
	 */
	public StaticEEFEditorContributionPropertiesEditionPartImpl(PropertiesEditingComponent editionComponent) {
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
		CompositionSequence staticEEFEditorContributionStep = new CompositionSequence();
		staticEEFEditorContributionStep
			.addStep(EditorViewsRepository.StaticEEFEditorContribution.Naming.class)
			.addStep(EditorViewsRepository.StaticEEFEditorContribution.Naming.name);
		
		staticEEFEditorContributionStep
			.addStep(EditorViewsRepository.StaticEEFEditorContribution.Binding.class)
			.addStep(EditorViewsRepository.StaticEEFEditorContribution.Binding.views);
		
		
		composer = new PartComposer(staticEEFEditorContributionStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EditorViewsRepository.StaticEEFEditorContribution.Naming.class) {
					return createNamingGroup(parent);
				}
				if (key == EditorViewsRepository.StaticEEFEditorContribution.Naming.name) {
					return createNameText(parent);
				}
				if (key == EditorViewsRepository.StaticEEFEditorContribution.Binding.class) {
					return createBindingGroup(parent);
				}
				if (key == EditorViewsRepository.StaticEEFEditorContribution.Binding.views) {
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
		namingGroup.setText(EditorMessages.StaticEEFEditorContributionPropertiesEditionPart_NamingGroupLabel);
		GridData namingGroupData = new GridData(GridData.FILL_HORIZONTAL);
		namingGroupData.horizontalSpan = 3;
		namingGroup.setLayoutData(namingGroupData);
		GridLayout namingGroupLayout = new GridLayout();
		namingGroupLayout.numColumns = 3;
		namingGroup.setLayout(namingGroupLayout);
		return namingGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, EditorMessages.StaticEEFEditorContributionPropertiesEditionPart_NameLabel, propertiesEditingComponent.isRequired(EditorViewsRepository.StaticEEFEditorContribution.Naming.name, EditorViewsRepository.SWT_KIND));
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
					propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(StaticEEFEditorContributionPropertiesEditionPartImpl.this, EditorViewsRepository.StaticEEFEditorContribution.Naming.name, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, name.getText()));
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
						propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(StaticEEFEditorContributionPropertiesEditionPartImpl.this, EditorViewsRepository.StaticEEFEditorContribution.Naming.name, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, EditorViewsRepository.StaticEEFEditorContribution.Naming.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditingComponent.getHelpContent(EditorViewsRepository.StaticEEFEditorContribution.Naming.name, EditorViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createBindingGroup(Composite parent) {
		Group bindingGroup = new Group(parent, SWT.NONE);
		bindingGroup.setText(EditorMessages.StaticEEFEditorContributionPropertiesEditionPart_BindingGroupLabel);
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
	protected Composite createViewsAdvancedReferencesTable(Composite parent) {
		this.views = new ReferencesTable(EditorMessages.StaticEEFEditorContributionPropertiesEditionPart_ViewsLabel, new ReferencesTableListener() {
			public void handleAdd() { addViews(); }
			public void handleEdit(EObject element) { editViews(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveViews(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromViews(element); }
			public void navigateTo(EObject element) { }
		});
		this.views.setHelpText(propertiesEditingComponent.getHelpContent(EditorViewsRepository.StaticEEFEditorContribution.Binding.views, EditorViewsRepository.SWT_KIND));
		this.views.createControls(parent);
		this.views.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(StaticEEFEditorContributionPropertiesEditionPartImpl.this, EditorViewsRepository.StaticEEFEditorContribution.Binding.views, PropertiesEditingEventImpl.CHANGE, PropertiesEditingEventImpl.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData viewsData = new GridData(GridData.FILL_HORIZONTAL);
		viewsData.horizontalSpan = 3;
		this.views.setLayoutData(viewsData);
		this.views.disableMove();
		views.setID(EditorViewsRepository.StaticEEFEditorContribution.Binding.views);
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
					propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(StaticEEFEditorContributionPropertiesEditionPartImpl.this, EditorViewsRepository.StaticEEFEditorContribution.Binding.views,
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
		propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(StaticEEFEditorContributionPropertiesEditionPartImpl.this, EditorViewsRepository.StaticEEFEditorContribution.Binding.views, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.MOVE, element, newIndex));
		views.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromViews(EObject element) {
		propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(StaticEEFEditorContributionPropertiesEditionPartImpl.this, EditorViewsRepository.StaticEEFEditorContribution.Binding.views, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.REMOVE, null, element));
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
	 * @see org.eclipse.emf.eef.extended.editor.parts.StaticEEFEditorContributionPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.extended.editor.parts.StaticEEFEditorContributionPropertiesEditionPart#setName(String newValue)
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
	 * @see org.eclipse.emf.eef.extended.editor.parts.StaticEEFEditorContributionPropertiesEditionPart#initViews(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.eclipse.emf.eef.extended.editor.parts.StaticEEFEditorContributionPropertiesEditionPart#updateViews()
	 * 
	 */
	public void updateViews() {
	views.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.extended.editor.parts.StaticEEFEditorContributionPropertiesEditionPart#addFilterViews(ViewerFilter filter)
	 * 
	 */
	public void addFilterToViews(ViewerFilter filter) {
		viewsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.extended.editor.parts.StaticEEFEditorContributionPropertiesEditionPart#addBusinessFilterViews(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToViews(ViewerFilter filter) {
		viewsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.extended.editor.parts.StaticEEFEditorContributionPropertiesEditionPart#isContainedInViewsTable(EObject element)
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
		return EditorMessages.StaticEEFEditorContribution_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
