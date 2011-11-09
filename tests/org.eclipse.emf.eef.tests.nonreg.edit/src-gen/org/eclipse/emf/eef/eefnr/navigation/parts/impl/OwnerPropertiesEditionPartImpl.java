/*******************************************************************************
 * Copyright (c) 2009 - 2010 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.eefnr.navigation.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.eefnr.navigation.parts.NavigationViewsRepository;
import org.eclipse.emf.eef.eefnr.navigation.parts.OwnerPropertiesEditionPart;
import org.eclipse.emf.eef.eefnr.navigation.providers.NavigationMessages;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.AdvancedEObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.AdvancedEObjectFlatComboViewer.EObjectFlatComboViewerListener;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EMFModelViewerDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FlatReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;


// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class OwnerPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, OwnerPropertiesEditionPart {

	protected Text name;
	protected TableViewer multipleSampleForTableComposition;
	protected List<ViewerFilter> multipleSampleForTableCompositionBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> multipleSampleForTableCompositionFilters = new ArrayList<ViewerFilter>();
protected ReferencesTable multipleSampleForAdvancedTableComposition;
protected List<ViewerFilter> multipleSampleForAdvancedTableCompositionBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> multipleSampleForAdvancedTableCompositionFilters = new ArrayList<ViewerFilter>();
	protected TableViewer multipleSampleForReferencesTable;
	protected Button addMultipleSampleForReferencesTable;
	protected Button removeMultipleSampleForReferencesTable;
	protected List<ViewerFilter> multipleSampleForReferencesTableBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> multipleSampleForReferencesTableFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable multipleSampleForAdvancedReferencesTable;
	protected List<ViewerFilter> multipleSampleForAdvancedReferencesTableBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> multipleSampleForAdvancedReferencesTableFilters = new ArrayList<ViewerFilter>();
	protected FlatReferencesTable multipleSampleForFlatReferencesTable;
	protected TableViewer singleSampleForTableComposition;
	protected List<ViewerFilter> singleSampleForTableCompositionBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> singleSampleForTableCompositionFilters = new ArrayList<ViewerFilter>();
protected ReferencesTable singleSampleForAdvancedTableComposition;
protected List<ViewerFilter> singleSampleForAdvancedTableCompositionBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> singleSampleForAdvancedTableCompositionFilters = new ArrayList<ViewerFilter>();
	protected TableViewer singleSampleForReferencesTable;
	protected Button addSingleSampleForReferencesTable;
	protected Button removeSingleSampleForReferencesTable;
	protected List<ViewerFilter> singleSampleForReferencesTableBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> singleSampleForReferencesTableFilters = new ArrayList<ViewerFilter>();
	protected TableViewer singleSampleForAdvancedReferencesTable;
	protected Button addSingleSampleForAdvancedReferencesTable;
	protected Button removeSingleSampleForAdvancedReferencesTable;
	protected List<ViewerFilter> singleSampleForAdvancedReferencesTableBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> singleSampleForAdvancedReferencesTableFilters = new ArrayList<ViewerFilter>();
	protected FlatReferencesTable singleSampleForFlatReferencesTable;
	protected EObjectFlatComboViewer singleContainmentForEObjectFlatComboViewer;
	protected EObjectFlatComboViewer singleReferencesForEObjectFlatComboViewer;
	private AdvancedEObjectFlatComboViewer singleContainmentForAdvancedEObjectFlatComboViewer;
	protected ViewerFilter singleContainmentForAdvancedEObjectFlatComboViewerFilter;
	private AdvancedEObjectFlatComboViewer singleReferencesForAdvancedEObjectFlatComboViewer;
	protected ViewerFilter singleReferencesForAdvancedEObjectFlatComboViewerFilter;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public OwnerPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence ownerStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = ownerStep.addStep(NavigationViewsRepository.Owner.Properties.class);
		propertiesStep.addStep(NavigationViewsRepository.Owner.Properties.name);
		propertiesStep.addStep(NavigationViewsRepository.Owner.Properties.multipleSampleForTableComposition);
		propertiesStep.addStep(NavigationViewsRepository.Owner.Properties.multipleSampleForAdvancedTableComposition);
		propertiesStep.addStep(NavigationViewsRepository.Owner.Properties.multipleSampleForReferencesTable);
		propertiesStep.addStep(NavigationViewsRepository.Owner.Properties.multipleSampleForAdvancedReferencesTable);
		propertiesStep.addStep(NavigationViewsRepository.Owner.Properties.multipleSampleForFlatReferencesTable);
		propertiesStep.addStep(NavigationViewsRepository.Owner.Properties.singleSampleForTableComposition);
		propertiesStep.addStep(NavigationViewsRepository.Owner.Properties.singleSampleForAdvancedTableComposition);
		propertiesStep.addStep(NavigationViewsRepository.Owner.Properties.singleSampleForReferencesTable);
		propertiesStep.addStep(NavigationViewsRepository.Owner.Properties.singleSampleForAdvancedReferencesTable);
		propertiesStep.addStep(NavigationViewsRepository.Owner.Properties.singleSampleForFlatReferencesTable);
		propertiesStep.addStep(NavigationViewsRepository.Owner.Properties.singleContainmentForEObjectFlatComboViewer);
		propertiesStep.addStep(NavigationViewsRepository.Owner.Properties.singleReferencesForEObjectFlatComboViewer);
		propertiesStep.addStep(NavigationViewsRepository.Owner.Properties.singleContainmentForAdvancedEObjectFlatComboViewer);
		propertiesStep.addStep(NavigationViewsRepository.Owner.Properties.singleReferencesForAdvancedEObjectFlatComboViewer);
		
		
		composer = new PartComposer(ownerStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == NavigationViewsRepository.Owner.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == NavigationViewsRepository.Owner.Properties.name) {
					return createNameText(parent);
				}
				if (key == NavigationViewsRepository.Owner.Properties.multipleSampleForTableComposition) {
					return createMultipleSampleForTableCompositionTableComposition(parent);
				}
				if (key == NavigationViewsRepository.Owner.Properties.multipleSampleForAdvancedTableComposition) {
					return createMultipleSampleForAdvancedTableCompositionAdvancedTableComposition(parent);
				}
				if (key == NavigationViewsRepository.Owner.Properties.multipleSampleForReferencesTable) {
					return createMultipleSampleForReferencesTableReferencesTable(parent);
				}
				if (key == NavigationViewsRepository.Owner.Properties.multipleSampleForAdvancedReferencesTable) {
					return createMultipleSampleForAdvancedReferencesTableAdvancedReferencesTable(parent);
				}
				if (key == NavigationViewsRepository.Owner.Properties.multipleSampleForFlatReferencesTable) {
					return createMultipleSampleForFlatReferencesTableFlatReferencesTable(parent);
				}
				if (key == NavigationViewsRepository.Owner.Properties.singleSampleForTableComposition) {
					return createSingleSampleForTableCompositionTableComposition(parent);
				}
				if (key == NavigationViewsRepository.Owner.Properties.singleSampleForAdvancedTableComposition) {
					return createSingleSampleForAdvancedTableCompositionAdvancedTableComposition(parent);
				}
				if (key == NavigationViewsRepository.Owner.Properties.singleSampleForReferencesTable) {
					return createSingleSampleForReferencesTableReferencesTable(parent);
				}
				if (key == NavigationViewsRepository.Owner.Properties.singleSampleForAdvancedReferencesTable) {
					return createSingleSampleForAdvancedReferencesTableReferencesTable(parent);
				}
				if (key == NavigationViewsRepository.Owner.Properties.singleSampleForFlatReferencesTable) {
					return createSingleSampleForFlatReferencesTableFlatReferencesTable(parent);
				}
				if (key == NavigationViewsRepository.Owner.Properties.singleContainmentForEObjectFlatComboViewer) {
					return createSingleContainmentForEObjectFlatComboViewerFlatComboViewer(parent);
				}
				if (key == NavigationViewsRepository.Owner.Properties.singleReferencesForEObjectFlatComboViewer) {
					return createSingleReferencesForEObjectFlatComboViewerFlatComboViewer(parent);
				}
				if (key == NavigationViewsRepository.Owner.Properties.singleContainmentForAdvancedEObjectFlatComboViewer) {
					return createSingleContainmentForAdvancedEObjectFlatComboViewerAdvancedFlatComboViewer(parent);
				}
				if (key == NavigationViewsRepository.Owner.Properties.singleReferencesForAdvancedEObjectFlatComboViewer) {
					return createSingleReferencesForAdvancedEObjectFlatComboViewerAdvancedFlatComboViewer(parent);
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
		propertiesGroup.setText(NavigationMessages.OwnerPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, NavigationMessages.OwnerPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(NavigationViewsRepository.Owner.Properties.name, NavigationViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OwnerPropertiesEditionPartImpl.this, NavigationViewsRepository.Owner.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OwnerPropertiesEditionPartImpl.this, NavigationViewsRepository.Owner.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, NavigationViewsRepository.Owner.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NavigationViewsRepository.Owner.Properties.name, NavigationViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createMultipleSampleForTableCompositionTableComposition(Composite container) {
		Composite tableContainer = new Composite(container, SWT.NONE);
		GridLayout tableContainerLayout = new GridLayout();
		GridData tableContainerData = new GridData(GridData.FILL_BOTH);
		tableContainerData.horizontalSpan = 3;
		tableContainer.setLayoutData(tableContainerData);
		tableContainerLayout.numColumns = 2;
		tableContainer.setLayout(tableContainerLayout);
		org.eclipse.swt.widgets.Table tableMultipleSampleForTableComposition = new org.eclipse.swt.widgets.Table(tableContainer, SWT.FULL_SELECTION);
		tableMultipleSampleForTableComposition.setHeaderVisible(true);
		GridData gdMultipleSampleForTableComposition = new GridData();
		gdMultipleSampleForTableComposition.grabExcessHorizontalSpace = true;
		gdMultipleSampleForTableComposition.horizontalAlignment = GridData.FILL;
		gdMultipleSampleForTableComposition.grabExcessVerticalSpace = true;
		gdMultipleSampleForTableComposition.verticalAlignment = GridData.FILL;
		tableMultipleSampleForTableComposition.setLayoutData(gdMultipleSampleForTableComposition);
		tableMultipleSampleForTableComposition.setLinesVisible(true);

		// Start of user code for columns definition for MultipleSampleForTableComposition
				TableColumn name = new TableColumn(tableMultipleSampleForTableComposition, SWT.NONE);
				name.setWidth(80);
				name.setText("Label"); //$NON-NLS-1$
		// End of user code

		multipleSampleForTableComposition = new TableViewer(tableMultipleSampleForTableComposition);
		multipleSampleForTableComposition.setContentProvider(new ArrayContentProvider());
		multipleSampleForTableComposition.setLabelProvider(new ITableLabelProvider() {
			//Start of user code for label provider definition for MultipleSampleForTableComposition
						public String getColumnText(Object object, int columnIndex) {
							AdapterFactoryLabelProvider labelProvider = new AdapterFactoryLabelProvider(adapterFactory);
							if (object instanceof EObject) {
								switch (columnIndex) {
								case 0:
									return labelProvider.getText(object);
								}
							}
							return ""; //$NON-NLS-1$
						}
			
						public Image getColumnImage(Object element, int columnIndex) {
							return null;
						}
			
			//End of user code

			public void addListener(ILabelProviderListener listener) {
			}

			public void dispose() {
			}

			public boolean isLabelProperty(Object element, String property) {
				return false;
			}

			public void removeListener(ILabelProviderListener listener) {
			}

		});
		multipleSampleForTableComposition.getTable().addListener(SWT.MouseDoubleClick, new Listener(){

			public void handleEvent(Event event) {
				if (multipleSampleForTableComposition.getSelection() instanceof IStructuredSelection) {
					IStructuredSelection selection = (IStructuredSelection) multipleSampleForTableComposition.getSelection();
					if (selection.getFirstElement() instanceof EObject) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OwnerPropertiesEditionPartImpl.this, NavigationViewsRepository.Owner.Properties.multipleSampleForTableComposition, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, selection.getFirstElement()));
						multipleSampleForTableComposition.refresh();
					}
				}
			}

		});
		GridData multipleSampleForTableCompositionData = new GridData(GridData.FILL_HORIZONTAL);
		multipleSampleForTableCompositionData.minimumHeight = 120;
		multipleSampleForTableCompositionData.heightHint = 120;
		multipleSampleForTableComposition.getTable().setLayoutData(multipleSampleForTableCompositionData);
		for (ViewerFilter filter : this.multipleSampleForTableCompositionFilters) {
			multipleSampleForTableComposition.addFilter(filter);
		}
		EditingUtils.setID(multipleSampleForTableComposition.getTable(), NavigationViewsRepository.Owner.Properties.multipleSampleForTableComposition);
		EditingUtils.setEEFtype(multipleSampleForTableComposition.getTable(), "eef::TableComposition::field"); //$NON-NLS-1$
		createMultipleSampleForTableCompositionPanel(tableContainer);
		return container;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createMultipleSampleForTableCompositionPanel(Composite container) {
		Composite multipleSampleForTableCompositionPanel = new Composite(container, SWT.NONE);
		GridLayout multipleSampleForTableCompositionPanelLayout = new GridLayout();
		multipleSampleForTableCompositionPanelLayout.numColumns = 1;
		multipleSampleForTableCompositionPanel.setLayout(multipleSampleForTableCompositionPanelLayout);
		Button addMultipleSampleForTableComposition = new Button(multipleSampleForTableCompositionPanel, SWT.NONE);
		addMultipleSampleForTableComposition.setText(NavigationMessages.PropertiesEditionPart_AddTableViewerLabel);
		GridData addMultipleSampleForTableCompositionData = new GridData(GridData.FILL_HORIZONTAL);
		addMultipleSampleForTableComposition.setLayoutData(addMultipleSampleForTableCompositionData);
		addMultipleSampleForTableComposition.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OwnerPropertiesEditionPartImpl.this, NavigationViewsRepository.Owner.Properties.multipleSampleForTableComposition, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				multipleSampleForTableComposition.refresh();
			}
		});
		EditingUtils.setID(addMultipleSampleForTableComposition, NavigationViewsRepository.Owner.Properties.multipleSampleForTableComposition);
		EditingUtils.setEEFtype(addMultipleSampleForTableComposition, "eef::TableComposition::addbutton"); //$NON-NLS-1$
		Button removeMultipleSampleForTableComposition = new Button(multipleSampleForTableCompositionPanel, SWT.NONE);
		removeMultipleSampleForTableComposition.setText(NavigationMessages.PropertiesEditionPart_RemoveTableViewerLabel);
		GridData removeMultipleSampleForTableCompositionData = new GridData(GridData.FILL_HORIZONTAL);
		removeMultipleSampleForTableComposition.setLayoutData(removeMultipleSampleForTableCompositionData);
		removeMultipleSampleForTableComposition.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				if (multipleSampleForTableComposition.getSelection() instanceof IStructuredSelection) {
					IStructuredSelection selection = (IStructuredSelection) multipleSampleForTableComposition.getSelection();
					if (selection.getFirstElement() instanceof EObject) {
						EObject selectedElement = (EObject) selection.getFirstElement();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OwnerPropertiesEditionPartImpl.this, NavigationViewsRepository.Owner.Properties.multipleSampleForTableComposition, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.REMOVE, null, selectedElement));
						multipleSampleForTableComposition.refresh();
					}
				}
			}

		});
		EditingUtils.setID(removeMultipleSampleForTableComposition, NavigationViewsRepository.Owner.Properties.multipleSampleForTableComposition);
		EditingUtils.setEEFtype(removeMultipleSampleForTableComposition, "eef::TableComposition::removebutton"); //$NON-NLS-1$
		Button editMultipleSampleForTableComposition = new Button(multipleSampleForTableCompositionPanel, SWT.NONE);
		editMultipleSampleForTableComposition.setText(NavigationMessages.PropertiesEditionPart_EditTableViewerLabel);
		GridData editMultipleSampleForTableCompositionData = new GridData(GridData.FILL_HORIZONTAL);
		editMultipleSampleForTableComposition.setLayoutData(editMultipleSampleForTableCompositionData);
		editMultipleSampleForTableComposition.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				if (multipleSampleForTableComposition.getSelection() instanceof IStructuredSelection) {
					IStructuredSelection selection = (IStructuredSelection) multipleSampleForTableComposition.getSelection();
					if (selection.getFirstElement() instanceof EObject) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OwnerPropertiesEditionPartImpl.this, NavigationViewsRepository.Owner.Properties.multipleSampleForTableComposition, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, selection.getFirstElement()));
						multipleSampleForTableComposition.refresh();
					}
				}
			}

		});
		EditingUtils.setID(editMultipleSampleForTableComposition, NavigationViewsRepository.Owner.Properties.multipleSampleForTableComposition);
		EditingUtils.setEEFtype(editMultipleSampleForTableComposition, "eef::TableComposition::editbutton"); //$NON-NLS-1$
		return multipleSampleForTableCompositionPanel;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createMultipleSampleForAdvancedTableCompositionAdvancedTableComposition(Composite parent) {
		this.multipleSampleForAdvancedTableComposition = new ReferencesTable(NavigationMessages.OwnerPropertiesEditionPart_MultipleSampleForAdvancedTableCompositionLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OwnerPropertiesEditionPartImpl.this, NavigationViewsRepository.Owner.Properties.multipleSampleForAdvancedTableComposition, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				multipleSampleForAdvancedTableComposition.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OwnerPropertiesEditionPartImpl.this, NavigationViewsRepository.Owner.Properties.multipleSampleForAdvancedTableComposition, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				multipleSampleForAdvancedTableComposition.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OwnerPropertiesEditionPartImpl.this, NavigationViewsRepository.Owner.Properties.multipleSampleForAdvancedTableComposition, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				multipleSampleForAdvancedTableComposition.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OwnerPropertiesEditionPartImpl.this, NavigationViewsRepository.Owner.Properties.multipleSampleForAdvancedTableComposition, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				multipleSampleForAdvancedTableComposition.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.multipleSampleForAdvancedTableCompositionFilters) {
			this.multipleSampleForAdvancedTableComposition.addFilter(filter);
		}
		this.multipleSampleForAdvancedTableComposition.setHelpText(propertiesEditionComponent.getHelpContent(NavigationViewsRepository.Owner.Properties.multipleSampleForAdvancedTableComposition, NavigationViewsRepository.SWT_KIND));
		this.multipleSampleForAdvancedTableComposition.createControls(parent);
		this.multipleSampleForAdvancedTableComposition.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OwnerPropertiesEditionPartImpl.this, NavigationViewsRepository.Owner.Properties.multipleSampleForAdvancedTableComposition, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData multipleSampleForAdvancedTableCompositionData = new GridData(GridData.FILL_HORIZONTAL);
		multipleSampleForAdvancedTableCompositionData.horizontalSpan = 3;
		this.multipleSampleForAdvancedTableComposition.setLayoutData(multipleSampleForAdvancedTableCompositionData);
		this.multipleSampleForAdvancedTableComposition.setLowerBound(0);
		this.multipleSampleForAdvancedTableComposition.setUpperBound(1);
		multipleSampleForAdvancedTableComposition.setID(NavigationViewsRepository.Owner.Properties.multipleSampleForAdvancedTableComposition);
		multipleSampleForAdvancedTableComposition.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent
	 * 
	 */
	protected Composite createMultipleSampleForReferencesTableReferencesTable(Composite parent) {
		Label multipleSampleForReferencesTableLabel = SWTUtils.createPartLabel(parent, NavigationMessages.OwnerPropertiesEditionPart_MultipleSampleForReferencesTableLabel, propertiesEditionComponent.isRequired(NavigationViewsRepository.Owner.Properties.multipleSampleForReferencesTable, NavigationViewsRepository.SWT_KIND));
		GridData multipleSampleForReferencesTableLabelData = new GridData();
		multipleSampleForReferencesTableLabelData.horizontalSpan = 3;
		multipleSampleForReferencesTableLabel.setLayoutData(multipleSampleForReferencesTableLabelData);
		multipleSampleForReferencesTable = createMultipleSampleForReferencesTableViewer(parent, adapterFactory);
		GridData multipleSampleForReferencesTableData = new GridData(GridData.FILL_HORIZONTAL);
		multipleSampleForReferencesTableData.horizontalSpan = 2;
		multipleSampleForReferencesTableData.minimumHeight = 120;
		multipleSampleForReferencesTableData.heightHint = 120;
		multipleSampleForReferencesTable.getTable().setLayoutData(multipleSampleForReferencesTableData);
		EditingUtils.setID(multipleSampleForReferencesTable.getTable(), NavigationViewsRepository.Owner.Properties.multipleSampleForReferencesTable);
		EditingUtils.setEEFtype(multipleSampleForReferencesTable.getTable(), "eef::ReferencesTable::field"); //$NON-NLS-1$
		createMultipleSampleForReferencesTableControlPanel(parent);
		return parent;
	}

	/**
	 * 
	 */
	protected TableViewer createMultipleSampleForReferencesTableViewer(Composite container, AdapterFactory adapter) {
		org.eclipse.swt.widgets.Table table = new org.eclipse.swt.widgets.Table(container, SWT.FULL_SELECTION);
		table.setHeaderVisible(true);
		GridData gd = new GridData();
		gd.grabExcessHorizontalSpace = true;
		gd.horizontalAlignment = GridData.FILL;
		gd.grabExcessVerticalSpace = true;
		gd.verticalAlignment = GridData.FILL;
		table.setLayoutData(gd);
		table.setLinesVisible(true);
		// Start of user code for table multipleSampleForReferencesTable s columns definition
				TableColumn name = new TableColumn(table, SWT.NONE);
				name.setWidth(80);
				name.setText("Label"); //$NON-NLS-1$
		
		// End of user code

		TableViewer result = new TableViewer(table);
		result.setLabelProvider(new ITableLabelProvider() {

			// Start of user code for table multipleSampleForReferencesTable label provider
						public String getColumnText(Object object, int columnIndex) {
							AdapterFactoryLabelProvider labelProvider = new AdapterFactoryLabelProvider(adapterFactory);
							if (object instanceof EObject) {
								switch (columnIndex) {
								case 0:
									return labelProvider.getText(object);
								}
							}
							return ""; //$NON-NLS-1$
						}
			
						public Image getColumnImage(Object element, int columnIndex) {
							return null;
						}
			
			// End of user code

			public void addListener(ILabelProviderListener listener) {
			}

			public void dispose() {
			}

			public boolean isLabelProperty(Object element, String property) {
				return false;
			}

			public void removeListener(ILabelProviderListener listener) {
			}

		});
		return result;
	}

	/**
	 * 
	 */
	protected void createMultipleSampleForReferencesTableControlPanel(Composite container) {
		Composite result = new Composite(container, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 1;
		result.setLayout(layout);
		addMultipleSampleForReferencesTable = new Button(result, SWT.NONE);
		addMultipleSampleForReferencesTable.setText(NavigationMessages.PropertiesEditionPart_AddListViewerLabel);
		GridData addData = new GridData(GridData.FILL_HORIZONTAL);
		addMultipleSampleForReferencesTable.setLayoutData(addData);
		addMultipleSampleForReferencesTable.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				addMultipleSampleForReferencesTable();
			}

		});
		EditingUtils.setID(addMultipleSampleForReferencesTable, NavigationViewsRepository.Owner.Properties.multipleSampleForReferencesTable);
		EditingUtils.setEEFtype(addMultipleSampleForReferencesTable, "eef::ReferencesTable::addbutton"); //$NON-NLS-1$
		removeMultipleSampleForReferencesTable = new Button(result, SWT.NONE);
		removeMultipleSampleForReferencesTable.setText(NavigationMessages.PropertiesEditionPart_RemoveListViewerLabel);
		GridData removeData = new GridData(GridData.FILL_HORIZONTAL);
		removeMultipleSampleForReferencesTable.setLayoutData(removeData);
		removeMultipleSampleForReferencesTable.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				if (multipleSampleForReferencesTable.getSelection() instanceof IStructuredSelection) {
					removeMultipleSampleForReferencesTable((IStructuredSelection) multipleSampleForReferencesTable.getSelection());
				}
			}

		});
		EditingUtils.setID(removeMultipleSampleForReferencesTable, NavigationViewsRepository.Owner.Properties.multipleSampleForReferencesTable);
		EditingUtils.setEEFtype(removeMultipleSampleForReferencesTable, "eef::ReferencesTable::removebutton"); //$NON-NLS-1$
	}

	/**
	 * 
	 */
	protected void addMultipleSampleForReferencesTable() {
		EMFModelViewerDialog dialog = new EMFModelViewerDialog(new AdapterFactoryLabelProvider(adapterFactory), multipleSampleForReferencesTable.getInput(), multipleSampleForReferencesTableFilters, multipleSampleForReferencesTableBusinessFilters, false, true) {
			public void process(IStructuredSelection selection) {
				for (Iterator iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OwnerPropertiesEditionPartImpl.this, NavigationViewsRepository.Owner.Properties.multipleSampleForReferencesTable, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
			}

		};
		dialog.open();
		multipleSampleForReferencesTable.refresh();
	}

	/**
	 * @param selection the multipleSampleForReferencesTable to remove
	 * 
	 */
	protected void removeMultipleSampleForReferencesTable(IStructuredSelection selection) {
		for (Iterator iter = selection.iterator(); iter.hasNext();) {
			EObject elem = (EObject) iter.next();
			propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OwnerPropertiesEditionPartImpl.this, NavigationViewsRepository.Owner.Properties.multipleSampleForReferencesTable, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, elem));
		}
		multipleSampleForReferencesTable.refresh();
	}

	/**
	 * 
	 */
	protected Composite createMultipleSampleForAdvancedReferencesTableAdvancedReferencesTable(Composite parent) {
		this.multipleSampleForAdvancedReferencesTable = new ReferencesTable(NavigationMessages.OwnerPropertiesEditionPart_MultipleSampleForAdvancedReferencesTableLabel, new ReferencesTableListener() {
			public void handleAdd() { addMultipleSampleForAdvancedReferencesTable(); }
			public void handleEdit(EObject element) { editMultipleSampleForAdvancedReferencesTable(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveMultipleSampleForAdvancedReferencesTable(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromMultipleSampleForAdvancedReferencesTable(element); }
			public void navigateTo(EObject element) { }
		});
		this.multipleSampleForAdvancedReferencesTable.setHelpText(propertiesEditionComponent.getHelpContent(NavigationViewsRepository.Owner.Properties.multipleSampleForAdvancedReferencesTable, NavigationViewsRepository.SWT_KIND));
		this.multipleSampleForAdvancedReferencesTable.createControls(parent);
		this.multipleSampleForAdvancedReferencesTable.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OwnerPropertiesEditionPartImpl.this, NavigationViewsRepository.Owner.Properties.multipleSampleForAdvancedReferencesTable, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData multipleSampleForAdvancedReferencesTableData = new GridData(GridData.FILL_HORIZONTAL);
		multipleSampleForAdvancedReferencesTableData.horizontalSpan = 3;
		this.multipleSampleForAdvancedReferencesTable.setLayoutData(multipleSampleForAdvancedReferencesTableData);
		this.multipleSampleForAdvancedReferencesTable.disableMove();
		multipleSampleForAdvancedReferencesTable.setID(NavigationViewsRepository.Owner.Properties.multipleSampleForAdvancedReferencesTable);
		multipleSampleForAdvancedReferencesTable.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addMultipleSampleForAdvancedReferencesTable() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(multipleSampleForAdvancedReferencesTable.getInput(), multipleSampleForAdvancedReferencesTableFilters, multipleSampleForAdvancedReferencesTableBusinessFilters,
		"multipleSampleForAdvancedReferencesTable", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OwnerPropertiesEditionPartImpl.this, NavigationViewsRepository.Owner.Properties.multipleSampleForAdvancedReferencesTable,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				multipleSampleForAdvancedReferencesTable.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveMultipleSampleForAdvancedReferencesTable(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OwnerPropertiesEditionPartImpl.this, NavigationViewsRepository.Owner.Properties.multipleSampleForAdvancedReferencesTable, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		multipleSampleForAdvancedReferencesTable.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromMultipleSampleForAdvancedReferencesTable(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OwnerPropertiesEditionPartImpl.this, NavigationViewsRepository.Owner.Properties.multipleSampleForAdvancedReferencesTable, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		multipleSampleForAdvancedReferencesTable.refresh();
	}

	/**
	 * 
	 */
	protected void editMultipleSampleForAdvancedReferencesTable(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				multipleSampleForAdvancedReferencesTable.refresh();
			}
		}
	}

	/**
	 * @param parent
	 * 
	 */
	protected Composite createMultipleSampleForFlatReferencesTableFlatReferencesTable(Composite parent) {
		SWTUtils.createPartLabel(parent, NavigationMessages.OwnerPropertiesEditionPart_MultipleSampleForFlatReferencesTableLabel, propertiesEditionComponent.isRequired(NavigationViewsRepository.Owner.Properties.multipleSampleForFlatReferencesTable, NavigationViewsRepository.SWT_KIND));
		multipleSampleForFlatReferencesTable = new FlatReferencesTable(parent);
		multipleSampleForFlatReferencesTable.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		multipleSampleForFlatReferencesTable.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				if (event.getSelection() instanceof StructuredSelection) 
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OwnerPropertiesEditionPartImpl.this, NavigationViewsRepository.Owner.Properties.multipleSampleForFlatReferencesTable, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, ((StructuredSelection)event.getSelection()).toList()));
			}

		});
		GridData multipleSampleForFlatReferencesTableData = new GridData(GridData.FILL_HORIZONTAL);
		multipleSampleForFlatReferencesTable.setLayoutData(multipleSampleForFlatReferencesTableData);
		multipleSampleForFlatReferencesTable.setID(NavigationViewsRepository.Owner.Properties.multipleSampleForFlatReferencesTable);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NavigationViewsRepository.Owner.Properties.multipleSampleForFlatReferencesTable, NavigationViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}


	/**
	 * @param container
	 * 
	 */
	protected Composite createSingleSampleForTableCompositionTableComposition(Composite container) {
		Composite tableContainer = new Composite(container, SWT.NONE);
		GridLayout tableContainerLayout = new GridLayout();
		GridData tableContainerData = new GridData(GridData.FILL_BOTH);
		tableContainerData.horizontalSpan = 3;
		tableContainer.setLayoutData(tableContainerData);
		tableContainerLayout.numColumns = 2;
		tableContainer.setLayout(tableContainerLayout);
		org.eclipse.swt.widgets.Table tableSingleSampleForTableComposition = new org.eclipse.swt.widgets.Table(tableContainer, SWT.FULL_SELECTION);
		tableSingleSampleForTableComposition.setHeaderVisible(true);
		GridData gdSingleSampleForTableComposition = new GridData();
		gdSingleSampleForTableComposition.grabExcessHorizontalSpace = true;
		gdSingleSampleForTableComposition.horizontalAlignment = GridData.FILL;
		gdSingleSampleForTableComposition.grabExcessVerticalSpace = true;
		gdSingleSampleForTableComposition.verticalAlignment = GridData.FILL;
		tableSingleSampleForTableComposition.setLayoutData(gdSingleSampleForTableComposition);
		tableSingleSampleForTableComposition.setLinesVisible(true);

		// Start of user code for columns definition for SingleSampleForTableComposition
				TableColumn name = new TableColumn(tableSingleSampleForTableComposition, SWT.NONE);
				name.setWidth(80);
				name.setText("Label"); //$NON-NLS-1$
		// End of user code

		singleSampleForTableComposition = new TableViewer(tableSingleSampleForTableComposition);
		singleSampleForTableComposition.setContentProvider(new ArrayContentProvider());
		singleSampleForTableComposition.setLabelProvider(new ITableLabelProvider() {
			//Start of user code for label provider definition for SingleSampleForTableComposition
						public String getColumnText(Object object, int columnIndex) {
							AdapterFactoryLabelProvider labelProvider = new AdapterFactoryLabelProvider(adapterFactory);
							if (object instanceof EObject) {
								switch (columnIndex) {
								case 0:
									return labelProvider.getText(object);
								}
							}
							return ""; //$NON-NLS-1$
						}
			
						public Image getColumnImage(Object element, int columnIndex) {
							return null;
						}
			
			//End of user code

			public void addListener(ILabelProviderListener listener) {
			}

			public void dispose() {
			}

			public boolean isLabelProperty(Object element, String property) {
				return false;
			}

			public void removeListener(ILabelProviderListener listener) {
			}

		});
		singleSampleForTableComposition.getTable().addListener(SWT.MouseDoubleClick, new Listener(){

			public void handleEvent(Event event) {
				if (singleSampleForTableComposition.getSelection() instanceof IStructuredSelection) {
					IStructuredSelection selection = (IStructuredSelection) singleSampleForTableComposition.getSelection();
					if (selection.getFirstElement() instanceof EObject) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OwnerPropertiesEditionPartImpl.this, NavigationViewsRepository.Owner.Properties.singleSampleForTableComposition, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, selection.getFirstElement()));
						singleSampleForTableComposition.refresh();
					}
				}
			}

		});
		GridData singleSampleForTableCompositionData = new GridData(GridData.FILL_HORIZONTAL);
		singleSampleForTableCompositionData.minimumHeight = 120;
		singleSampleForTableCompositionData.heightHint = 120;
		singleSampleForTableComposition.getTable().setLayoutData(singleSampleForTableCompositionData);
		for (ViewerFilter filter : this.singleSampleForTableCompositionFilters) {
			singleSampleForTableComposition.addFilter(filter);
		}
		EditingUtils.setID(singleSampleForTableComposition.getTable(), NavigationViewsRepository.Owner.Properties.singleSampleForTableComposition);
		EditingUtils.setEEFtype(singleSampleForTableComposition.getTable(), "eef::TableComposition::field"); //$NON-NLS-1$
		createSingleSampleForTableCompositionPanel(tableContainer);
		return container;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createSingleSampleForTableCompositionPanel(Composite container) {
		Composite singleSampleForTableCompositionPanel = new Composite(container, SWT.NONE);
		GridLayout singleSampleForTableCompositionPanelLayout = new GridLayout();
		singleSampleForTableCompositionPanelLayout.numColumns = 1;
		singleSampleForTableCompositionPanel.setLayout(singleSampleForTableCompositionPanelLayout);
		Button addSingleSampleForTableComposition = new Button(singleSampleForTableCompositionPanel, SWT.NONE);
		addSingleSampleForTableComposition.setText(NavigationMessages.PropertiesEditionPart_AddTableViewerLabel);
		GridData addSingleSampleForTableCompositionData = new GridData(GridData.FILL_HORIZONTAL);
		addSingleSampleForTableComposition.setLayoutData(addSingleSampleForTableCompositionData);
		addSingleSampleForTableComposition.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OwnerPropertiesEditionPartImpl.this, NavigationViewsRepository.Owner.Properties.singleSampleForTableComposition, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				singleSampleForTableComposition.refresh();
			}
		});
		EditingUtils.setID(addSingleSampleForTableComposition, NavigationViewsRepository.Owner.Properties.singleSampleForTableComposition);
		EditingUtils.setEEFtype(addSingleSampleForTableComposition, "eef::TableComposition::addbutton"); //$NON-NLS-1$
		Button removeSingleSampleForTableComposition = new Button(singleSampleForTableCompositionPanel, SWT.NONE);
		removeSingleSampleForTableComposition.setText(NavigationMessages.PropertiesEditionPart_RemoveTableViewerLabel);
		GridData removeSingleSampleForTableCompositionData = new GridData(GridData.FILL_HORIZONTAL);
		removeSingleSampleForTableComposition.setLayoutData(removeSingleSampleForTableCompositionData);
		removeSingleSampleForTableComposition.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				if (singleSampleForTableComposition.getSelection() instanceof IStructuredSelection) {
					IStructuredSelection selection = (IStructuredSelection) singleSampleForTableComposition.getSelection();
					if (selection.getFirstElement() instanceof EObject) {
						EObject selectedElement = (EObject) selection.getFirstElement();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OwnerPropertiesEditionPartImpl.this, NavigationViewsRepository.Owner.Properties.singleSampleForTableComposition, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.REMOVE, null, selectedElement));
						singleSampleForTableComposition.refresh();
					}
				}
			}

		});
		EditingUtils.setID(removeSingleSampleForTableComposition, NavigationViewsRepository.Owner.Properties.singleSampleForTableComposition);
		EditingUtils.setEEFtype(removeSingleSampleForTableComposition, "eef::TableComposition::removebutton"); //$NON-NLS-1$
		Button editSingleSampleForTableComposition = new Button(singleSampleForTableCompositionPanel, SWT.NONE);
		editSingleSampleForTableComposition.setText(NavigationMessages.PropertiesEditionPart_EditTableViewerLabel);
		GridData editSingleSampleForTableCompositionData = new GridData(GridData.FILL_HORIZONTAL);
		editSingleSampleForTableComposition.setLayoutData(editSingleSampleForTableCompositionData);
		editSingleSampleForTableComposition.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				if (singleSampleForTableComposition.getSelection() instanceof IStructuredSelection) {
					IStructuredSelection selection = (IStructuredSelection) singleSampleForTableComposition.getSelection();
					if (selection.getFirstElement() instanceof EObject) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OwnerPropertiesEditionPartImpl.this, NavigationViewsRepository.Owner.Properties.singleSampleForTableComposition, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, selection.getFirstElement()));
						singleSampleForTableComposition.refresh();
					}
				}
			}

		});
		EditingUtils.setID(editSingleSampleForTableComposition, NavigationViewsRepository.Owner.Properties.singleSampleForTableComposition);
		EditingUtils.setEEFtype(editSingleSampleForTableComposition, "eef::TableComposition::editbutton"); //$NON-NLS-1$
		return singleSampleForTableCompositionPanel;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createSingleSampleForAdvancedTableCompositionAdvancedTableComposition(Composite parent) {
		this.singleSampleForAdvancedTableComposition = new ReferencesTable(NavigationMessages.OwnerPropertiesEditionPart_SingleSampleForAdvancedTableCompositionLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OwnerPropertiesEditionPartImpl.this, NavigationViewsRepository.Owner.Properties.singleSampleForAdvancedTableComposition, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				singleSampleForAdvancedTableComposition.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OwnerPropertiesEditionPartImpl.this, NavigationViewsRepository.Owner.Properties.singleSampleForAdvancedTableComposition, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				singleSampleForAdvancedTableComposition.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OwnerPropertiesEditionPartImpl.this, NavigationViewsRepository.Owner.Properties.singleSampleForAdvancedTableComposition, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				singleSampleForAdvancedTableComposition.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OwnerPropertiesEditionPartImpl.this, NavigationViewsRepository.Owner.Properties.singleSampleForAdvancedTableComposition, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				singleSampleForAdvancedTableComposition.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.singleSampleForAdvancedTableCompositionFilters) {
			this.singleSampleForAdvancedTableComposition.addFilter(filter);
		}
		this.singleSampleForAdvancedTableComposition.setHelpText(propertiesEditionComponent.getHelpContent(NavigationViewsRepository.Owner.Properties.singleSampleForAdvancedTableComposition, NavigationViewsRepository.SWT_KIND));
		this.singleSampleForAdvancedTableComposition.createControls(parent);
		this.singleSampleForAdvancedTableComposition.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OwnerPropertiesEditionPartImpl.this, NavigationViewsRepository.Owner.Properties.singleSampleForAdvancedTableComposition, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData singleSampleForAdvancedTableCompositionData = new GridData(GridData.FILL_HORIZONTAL);
		singleSampleForAdvancedTableCompositionData.horizontalSpan = 3;
		this.singleSampleForAdvancedTableComposition.setLayoutData(singleSampleForAdvancedTableCompositionData);
		this.singleSampleForAdvancedTableComposition.setLowerBound(0);
		this.singleSampleForAdvancedTableComposition.setUpperBound(-1);
		singleSampleForAdvancedTableComposition.setID(NavigationViewsRepository.Owner.Properties.singleSampleForAdvancedTableComposition);
		singleSampleForAdvancedTableComposition.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent
	 * 
	 */
	protected Composite createSingleSampleForReferencesTableReferencesTable(Composite parent) {
		Label singleSampleForReferencesTableLabel = SWTUtils.createPartLabel(parent, NavigationMessages.OwnerPropertiesEditionPart_SingleSampleForReferencesTableLabel, propertiesEditionComponent.isRequired(NavigationViewsRepository.Owner.Properties.singleSampleForReferencesTable, NavigationViewsRepository.SWT_KIND));
		GridData singleSampleForReferencesTableLabelData = new GridData();
		singleSampleForReferencesTableLabelData.horizontalSpan = 3;
		singleSampleForReferencesTableLabel.setLayoutData(singleSampleForReferencesTableLabelData);
		singleSampleForReferencesTable = createSingleSampleForReferencesTableViewer(parent, adapterFactory);
		GridData singleSampleForReferencesTableData = new GridData(GridData.FILL_HORIZONTAL);
		singleSampleForReferencesTableData.horizontalSpan = 2;
		singleSampleForReferencesTableData.minimumHeight = 120;
		singleSampleForReferencesTableData.heightHint = 120;
		singleSampleForReferencesTable.getTable().setLayoutData(singleSampleForReferencesTableData);
		EditingUtils.setID(singleSampleForReferencesTable.getTable(), NavigationViewsRepository.Owner.Properties.singleSampleForReferencesTable);
		EditingUtils.setEEFtype(singleSampleForReferencesTable.getTable(), "eef::ReferencesTable::field"); //$NON-NLS-1$
		createSingleSampleForReferencesTableControlPanel(parent);
		return parent;
	}

	/**
	 * 
	 */
	protected TableViewer createSingleSampleForReferencesTableViewer(Composite container, AdapterFactory adapter) {
		org.eclipse.swt.widgets.Table table = new org.eclipse.swt.widgets.Table(container, SWT.FULL_SELECTION);
		table.setHeaderVisible(true);
		GridData gd = new GridData();
		gd.grabExcessHorizontalSpace = true;
		gd.horizontalAlignment = GridData.FILL;
		gd.grabExcessVerticalSpace = true;
		gd.verticalAlignment = GridData.FILL;
		table.setLayoutData(gd);
		table.setLinesVisible(true);
		// Start of user code for table singleSampleForReferencesTable s columns definition
				TableColumn name = new TableColumn(table, SWT.NONE);
				name.setWidth(80);
				name.setText("Label"); //$NON-NLS-1$
		
		// End of user code

		TableViewer result = new TableViewer(table);
		result.setLabelProvider(new ITableLabelProvider() {

			// Start of user code for table singleSampleForReferencesTable label provider
						public String getColumnText(Object object, int columnIndex) {
							AdapterFactoryLabelProvider labelProvider = new AdapterFactoryLabelProvider(adapterFactory);
							if (object instanceof EObject) {
								switch (columnIndex) {
								case 0:
									return labelProvider.getText(object);
								}
							}
							return ""; //$NON-NLS-1$
						}
			
						public Image getColumnImage(Object element, int columnIndex) {
							return null;
						}
			
			// End of user code

			public void addListener(ILabelProviderListener listener) {
			}

			public void dispose() {
			}

			public boolean isLabelProperty(Object element, String property) {
				return false;
			}

			public void removeListener(ILabelProviderListener listener) {
			}

		});
		return result;
	}

	/**
	 * 
	 */
	protected void createSingleSampleForReferencesTableControlPanel(Composite container) {
		Composite result = new Composite(container, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 1;
		result.setLayout(layout);
		addSingleSampleForReferencesTable = new Button(result, SWT.NONE);
		addSingleSampleForReferencesTable.setText(NavigationMessages.PropertiesEditionPart_AddListViewerLabel);
		GridData addData = new GridData(GridData.FILL_HORIZONTAL);
		addSingleSampleForReferencesTable.setLayoutData(addData);
		addSingleSampleForReferencesTable.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				addSingleSampleForReferencesTable();
			}

		});
		EditingUtils.setID(addSingleSampleForReferencesTable, NavigationViewsRepository.Owner.Properties.singleSampleForReferencesTable);
		EditingUtils.setEEFtype(addSingleSampleForReferencesTable, "eef::ReferencesTable::addbutton"); //$NON-NLS-1$
		removeSingleSampleForReferencesTable = new Button(result, SWT.NONE);
		removeSingleSampleForReferencesTable.setText(NavigationMessages.PropertiesEditionPart_RemoveListViewerLabel);
		GridData removeData = new GridData(GridData.FILL_HORIZONTAL);
		removeSingleSampleForReferencesTable.setLayoutData(removeData);
		removeSingleSampleForReferencesTable.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				if (singleSampleForReferencesTable.getSelection() instanceof IStructuredSelection) {
					removeSingleSampleForReferencesTable((IStructuredSelection) singleSampleForReferencesTable.getSelection());
				}
			}

		});
		EditingUtils.setID(removeSingleSampleForReferencesTable, NavigationViewsRepository.Owner.Properties.singleSampleForReferencesTable);
		EditingUtils.setEEFtype(removeSingleSampleForReferencesTable, "eef::ReferencesTable::removebutton"); //$NON-NLS-1$
	}

	/**
	 * 
	 */
	protected void addSingleSampleForReferencesTable() {
		EMFModelViewerDialog dialog = new EMFModelViewerDialog(new AdapterFactoryLabelProvider(adapterFactory), singleSampleForReferencesTable.getInput(), singleSampleForReferencesTableFilters, singleSampleForReferencesTableBusinessFilters, false, true) {
			public void process(IStructuredSelection selection) {
				for (Iterator iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OwnerPropertiesEditionPartImpl.this, NavigationViewsRepository.Owner.Properties.singleSampleForReferencesTable, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
			}

		};
		dialog.open();
		singleSampleForReferencesTable.refresh();
	}

	/**
	 * @param selection the singleSampleForReferencesTable to remove
	 * 
	 */
	protected void removeSingleSampleForReferencesTable(IStructuredSelection selection) {
		for (Iterator iter = selection.iterator(); iter.hasNext();) {
			EObject elem = (EObject) iter.next();
			propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OwnerPropertiesEditionPartImpl.this, NavigationViewsRepository.Owner.Properties.singleSampleForReferencesTable, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, elem));
		}
		singleSampleForReferencesTable.refresh();
	}

	/**
	 * @param parent
	 * 
	 */
	protected Composite createSingleSampleForAdvancedReferencesTableReferencesTable(Composite parent) {
		Label singleSampleForAdvancedReferencesTableLabel = SWTUtils.createPartLabel(parent, NavigationMessages.OwnerPropertiesEditionPart_SingleSampleForAdvancedReferencesTableLabel, propertiesEditionComponent.isRequired(NavigationViewsRepository.Owner.Properties.singleSampleForAdvancedReferencesTable, NavigationViewsRepository.SWT_KIND));
		GridData singleSampleForAdvancedReferencesTableLabelData = new GridData();
		singleSampleForAdvancedReferencesTableLabelData.horizontalSpan = 3;
		singleSampleForAdvancedReferencesTableLabel.setLayoutData(singleSampleForAdvancedReferencesTableLabelData);
		singleSampleForAdvancedReferencesTable = createSingleSampleForAdvancedReferencesTableViewer(parent, adapterFactory);
		GridData singleSampleForAdvancedReferencesTableData = new GridData(GridData.FILL_HORIZONTAL);
		singleSampleForAdvancedReferencesTableData.horizontalSpan = 2;
		singleSampleForAdvancedReferencesTableData.minimumHeight = 120;
		singleSampleForAdvancedReferencesTableData.heightHint = 120;
		singleSampleForAdvancedReferencesTable.getTable().setLayoutData(singleSampleForAdvancedReferencesTableData);
		EditingUtils.setID(singleSampleForAdvancedReferencesTable.getTable(), NavigationViewsRepository.Owner.Properties.singleSampleForAdvancedReferencesTable);
		EditingUtils.setEEFtype(singleSampleForAdvancedReferencesTable.getTable(), "eef::ReferencesTable::field"); //$NON-NLS-1$
		createSingleSampleForAdvancedReferencesTableControlPanel(parent);
		return parent;
	}

	/**
	 * 
	 */
	protected TableViewer createSingleSampleForAdvancedReferencesTableViewer(Composite container, AdapterFactory adapter) {
		org.eclipse.swt.widgets.Table table = new org.eclipse.swt.widgets.Table(container, SWT.FULL_SELECTION);
		table.setHeaderVisible(true);
		GridData gd = new GridData();
		gd.grabExcessHorizontalSpace = true;
		gd.horizontalAlignment = GridData.FILL;
		gd.grabExcessVerticalSpace = true;
		gd.verticalAlignment = GridData.FILL;
		table.setLayoutData(gd);
		table.setLinesVisible(true);
		// Start of user code for table singleSampleForAdvancedReferencesTable s columns definition
				TableColumn name = new TableColumn(table, SWT.NONE);
				name.setWidth(80);
				name.setText("Label"); //$NON-NLS-1$
		
		// End of user code

		TableViewer result = new TableViewer(table);
		result.setLabelProvider(new ITableLabelProvider() {

			// Start of user code for table singleSampleForAdvancedReferencesTable label provider
						public String getColumnText(Object object, int columnIndex) {
							AdapterFactoryLabelProvider labelProvider = new AdapterFactoryLabelProvider(adapterFactory);
							if (object instanceof EObject) {
								switch (columnIndex) {
								case 0:
									return labelProvider.getText(object);
								}
							}
							return ""; //$NON-NLS-1$
						}
			
						public Image getColumnImage(Object element, int columnIndex) {
							return null;
						}
			
			// End of user code

			public void addListener(ILabelProviderListener listener) {
			}

			public void dispose() {
			}

			public boolean isLabelProperty(Object element, String property) {
				return false;
			}

			public void removeListener(ILabelProviderListener listener) {
			}

		});
		return result;
	}

	/**
	 * 
	 */
	protected void createSingleSampleForAdvancedReferencesTableControlPanel(Composite container) {
		Composite result = new Composite(container, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 1;
		result.setLayout(layout);
		addSingleSampleForAdvancedReferencesTable = new Button(result, SWT.NONE);
		addSingleSampleForAdvancedReferencesTable.setText(NavigationMessages.PropertiesEditionPart_AddListViewerLabel);
		GridData addData = new GridData(GridData.FILL_HORIZONTAL);
		addSingleSampleForAdvancedReferencesTable.setLayoutData(addData);
		addSingleSampleForAdvancedReferencesTable.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				addSingleSampleForAdvancedReferencesTable();
			}

		});
		EditingUtils.setID(addSingleSampleForAdvancedReferencesTable, NavigationViewsRepository.Owner.Properties.singleSampleForAdvancedReferencesTable);
		EditingUtils.setEEFtype(addSingleSampleForAdvancedReferencesTable, "eef::ReferencesTable::addbutton"); //$NON-NLS-1$
		removeSingleSampleForAdvancedReferencesTable = new Button(result, SWT.NONE);
		removeSingleSampleForAdvancedReferencesTable.setText(NavigationMessages.PropertiesEditionPart_RemoveListViewerLabel);
		GridData removeData = new GridData(GridData.FILL_HORIZONTAL);
		removeSingleSampleForAdvancedReferencesTable.setLayoutData(removeData);
		removeSingleSampleForAdvancedReferencesTable.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				if (singleSampleForAdvancedReferencesTable.getSelection() instanceof IStructuredSelection) {
					removeSingleSampleForAdvancedReferencesTable((IStructuredSelection) singleSampleForAdvancedReferencesTable.getSelection());
				}
			}

		});
		EditingUtils.setID(removeSingleSampleForAdvancedReferencesTable, NavigationViewsRepository.Owner.Properties.singleSampleForAdvancedReferencesTable);
		EditingUtils.setEEFtype(removeSingleSampleForAdvancedReferencesTable, "eef::ReferencesTable::removebutton"); //$NON-NLS-1$
	}

	/**
	 * 
	 */
	protected void addSingleSampleForAdvancedReferencesTable() {
		EMFModelViewerDialog dialog = new EMFModelViewerDialog(new AdapterFactoryLabelProvider(adapterFactory), singleSampleForAdvancedReferencesTable.getInput(), singleSampleForAdvancedReferencesTableFilters, singleSampleForAdvancedReferencesTableBusinessFilters, false, true) {
			public void process(IStructuredSelection selection) {
				for (Iterator iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OwnerPropertiesEditionPartImpl.this, NavigationViewsRepository.Owner.Properties.singleSampleForAdvancedReferencesTable, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
			}

		};
		dialog.open();
		singleSampleForAdvancedReferencesTable.refresh();
	}

	/**
	 * @param selection the singleSampleForAdvancedReferencesTable to remove
	 * 
	 */
	protected void removeSingleSampleForAdvancedReferencesTable(IStructuredSelection selection) {
		for (Iterator iter = selection.iterator(); iter.hasNext();) {
			EObject elem = (EObject) iter.next();
			propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OwnerPropertiesEditionPartImpl.this, NavigationViewsRepository.Owner.Properties.singleSampleForAdvancedReferencesTable, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, elem));
		}
		singleSampleForAdvancedReferencesTable.refresh();
	}

	/**
	 * @param parent
	 * 
	 */
	protected Composite createSingleSampleForFlatReferencesTableFlatReferencesTable(Composite parent) {
		SWTUtils.createPartLabel(parent, NavigationMessages.OwnerPropertiesEditionPart_SingleSampleForFlatReferencesTableLabel, propertiesEditionComponent.isRequired(NavigationViewsRepository.Owner.Properties.singleSampleForFlatReferencesTable, NavigationViewsRepository.SWT_KIND));
		singleSampleForFlatReferencesTable = new FlatReferencesTable(parent);
		singleSampleForFlatReferencesTable.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		singleSampleForFlatReferencesTable.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				if (event.getSelection() instanceof StructuredSelection) 
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OwnerPropertiesEditionPartImpl.this, NavigationViewsRepository.Owner.Properties.singleSampleForFlatReferencesTable, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, ((StructuredSelection)event.getSelection()).toList()));
			}

		});
		GridData singleSampleForFlatReferencesTableData = new GridData(GridData.FILL_HORIZONTAL);
		singleSampleForFlatReferencesTable.setLayoutData(singleSampleForFlatReferencesTableData);
		singleSampleForFlatReferencesTable.setID(NavigationViewsRepository.Owner.Properties.singleSampleForFlatReferencesTable);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NavigationViewsRepository.Owner.Properties.singleSampleForFlatReferencesTable, NavigationViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}


	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createSingleContainmentForEObjectFlatComboViewerFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, NavigationMessages.OwnerPropertiesEditionPart_SingleContainmentForEObjectFlatComboViewerLabel, propertiesEditionComponent.isRequired(NavigationViewsRepository.Owner.Properties.singleContainmentForEObjectFlatComboViewer, NavigationViewsRepository.SWT_KIND));
		singleContainmentForEObjectFlatComboViewer = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(NavigationViewsRepository.Owner.Properties.singleContainmentForEObjectFlatComboViewer, NavigationViewsRepository.SWT_KIND));
		singleContainmentForEObjectFlatComboViewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		singleContainmentForEObjectFlatComboViewer.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OwnerPropertiesEditionPartImpl.this, NavigationViewsRepository.Owner.Properties.singleContainmentForEObjectFlatComboViewer, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getSingleContainmentForEObjectFlatComboViewer()));
			}

		});
		GridData singleContainmentForEObjectFlatComboViewerData = new GridData(GridData.FILL_HORIZONTAL);
		singleContainmentForEObjectFlatComboViewer.setLayoutData(singleContainmentForEObjectFlatComboViewerData);
		singleContainmentForEObjectFlatComboViewer.setID(NavigationViewsRepository.Owner.Properties.singleContainmentForEObjectFlatComboViewer);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NavigationViewsRepository.Owner.Properties.singleContainmentForEObjectFlatComboViewer, NavigationViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createSingleReferencesForEObjectFlatComboViewerFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, NavigationMessages.OwnerPropertiesEditionPart_SingleReferencesForEObjectFlatComboViewerLabel, propertiesEditionComponent.isRequired(NavigationViewsRepository.Owner.Properties.singleReferencesForEObjectFlatComboViewer, NavigationViewsRepository.SWT_KIND));
		singleReferencesForEObjectFlatComboViewer = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(NavigationViewsRepository.Owner.Properties.singleReferencesForEObjectFlatComboViewer, NavigationViewsRepository.SWT_KIND));
		singleReferencesForEObjectFlatComboViewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		singleReferencesForEObjectFlatComboViewer.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OwnerPropertiesEditionPartImpl.this, NavigationViewsRepository.Owner.Properties.singleReferencesForEObjectFlatComboViewer, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getSingleReferencesForEObjectFlatComboViewer()));
			}

		});
		GridData singleReferencesForEObjectFlatComboViewerData = new GridData(GridData.FILL_HORIZONTAL);
		singleReferencesForEObjectFlatComboViewer.setLayoutData(singleReferencesForEObjectFlatComboViewerData);
		singleReferencesForEObjectFlatComboViewer.setID(NavigationViewsRepository.Owner.Properties.singleReferencesForEObjectFlatComboViewer);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NavigationViewsRepository.Owner.Properties.singleReferencesForEObjectFlatComboViewer, NavigationViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createSingleContainmentForAdvancedEObjectFlatComboViewerAdvancedFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, NavigationMessages.OwnerPropertiesEditionPart_SingleContainmentForAdvancedEObjectFlatComboViewerLabel, propertiesEditionComponent.isRequired(NavigationViewsRepository.Owner.Properties.singleContainmentForAdvancedEObjectFlatComboViewer, NavigationViewsRepository.SWT_KIND));
		// create callback listener
		EObjectFlatComboViewerListener listener = new EObjectFlatComboViewerListener(){
			public void handleSet(EObject element){
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OwnerPropertiesEditionPartImpl.this, NavigationViewsRepository.Owner.Properties.singleContainmentForAdvancedEObjectFlatComboViewer, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, element)); 
			}
			public void navigateTo(EObject element){ }

			public EObject handleCreate() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OwnerPropertiesEditionPartImpl.this, NavigationViewsRepository.Owner.Properties.singleContainmentForAdvancedEObjectFlatComboViewer, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null)); 
				return null;
			}
		};
		//create widget
		singleContainmentForAdvancedEObjectFlatComboViewer = new AdvancedEObjectFlatComboViewer(NavigationMessages.OwnerPropertiesEditionPart_SingleContainmentForAdvancedEObjectFlatComboViewerLabel, resourceSet, singleContainmentForAdvancedEObjectFlatComboViewerFilter, propertiesEditionComponent.getEditingContext().getAdapterFactory(), listener);
		singleContainmentForAdvancedEObjectFlatComboViewer.createControls(parent);
		GridData singleContainmentForAdvancedEObjectFlatComboViewerData = new GridData(GridData.FILL_HORIZONTAL);
		singleContainmentForAdvancedEObjectFlatComboViewer.setLayoutData(singleContainmentForAdvancedEObjectFlatComboViewerData);
		singleContainmentForAdvancedEObjectFlatComboViewer.setID(NavigationViewsRepository.Owner.Properties.singleContainmentForAdvancedEObjectFlatComboViewer);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NavigationViewsRepository.Owner.Properties.singleContainmentForAdvancedEObjectFlatComboViewer, NavigationViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createSingleReferencesForAdvancedEObjectFlatComboViewerAdvancedFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, NavigationMessages.OwnerPropertiesEditionPart_SingleReferencesForAdvancedEObjectFlatComboViewerLabel, propertiesEditionComponent.isRequired(NavigationViewsRepository.Owner.Properties.singleReferencesForAdvancedEObjectFlatComboViewer, NavigationViewsRepository.SWT_KIND));
		// create callback listener
		EObjectFlatComboViewerListener listener = new EObjectFlatComboViewerListener(){
			public void handleSet(EObject element){
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OwnerPropertiesEditionPartImpl.this, NavigationViewsRepository.Owner.Properties.singleReferencesForAdvancedEObjectFlatComboViewer, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, element)); 
			}
			public void navigateTo(EObject element){ }

			public EObject handleCreate() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OwnerPropertiesEditionPartImpl.this, NavigationViewsRepository.Owner.Properties.singleReferencesForAdvancedEObjectFlatComboViewer, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null)); 
				return null;
			}
		};
		//create widget
		singleReferencesForAdvancedEObjectFlatComboViewer = new AdvancedEObjectFlatComboViewer(NavigationMessages.OwnerPropertiesEditionPart_SingleReferencesForAdvancedEObjectFlatComboViewerLabel, resourceSet, singleReferencesForAdvancedEObjectFlatComboViewerFilter, propertiesEditionComponent.getEditingContext().getAdapterFactory(), listener);
		singleReferencesForAdvancedEObjectFlatComboViewer.createControls(parent);
		GridData singleReferencesForAdvancedEObjectFlatComboViewerData = new GridData(GridData.FILL_HORIZONTAL);
		singleReferencesForAdvancedEObjectFlatComboViewer.setLayoutData(singleReferencesForAdvancedEObjectFlatComboViewerData);
		singleReferencesForAdvancedEObjectFlatComboViewer.setID(NavigationViewsRepository.Owner.Properties.singleReferencesForAdvancedEObjectFlatComboViewer);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NavigationViewsRepository.Owner.Properties.singleReferencesForAdvancedEObjectFlatComboViewer, NavigationViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#setName(String newValue)
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
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#initMultipleSampleForTableComposition(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initMultipleSampleForTableComposition(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		multipleSampleForTableComposition.setContentProvider(contentProvider);
		multipleSampleForTableComposition.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#updateMultipleSampleForTableComposition()
	 * 
	 */
	public void updateMultipleSampleForTableComposition() {
	multipleSampleForTableComposition.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#addFilterMultipleSampleForTableComposition(ViewerFilter filter)
	 * 
	 */
	public void addFilterToMultipleSampleForTableComposition(ViewerFilter filter) {
		multipleSampleForTableCompositionFilters.add(filter);
		if (this.multipleSampleForTableComposition != null) {
			this.multipleSampleForTableComposition.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#addBusinessFilterMultipleSampleForTableComposition(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMultipleSampleForTableComposition(ViewerFilter filter) {
		multipleSampleForTableCompositionBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#isContainedInMultipleSampleForTableCompositionTable(EObject element)
	 * 
	 */
	public boolean isContainedInMultipleSampleForTableCompositionTable(EObject element) {
		return ((ReferencesTableSettings)multipleSampleForTableComposition.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#initMultipleSampleForAdvancedTableComposition(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initMultipleSampleForAdvancedTableComposition(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		multipleSampleForAdvancedTableComposition.setContentProvider(contentProvider);
		multipleSampleForAdvancedTableComposition.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#updateMultipleSampleForAdvancedTableComposition()
	 * 
	 */
	public void updateMultipleSampleForAdvancedTableComposition() {
	multipleSampleForAdvancedTableComposition.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#addFilterMultipleSampleForAdvancedTableComposition(ViewerFilter filter)
	 * 
	 */
	public void addFilterToMultipleSampleForAdvancedTableComposition(ViewerFilter filter) {
		multipleSampleForAdvancedTableCompositionFilters.add(filter);
		if (this.multipleSampleForAdvancedTableComposition != null) {
			this.multipleSampleForAdvancedTableComposition.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#addBusinessFilterMultipleSampleForAdvancedTableComposition(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMultipleSampleForAdvancedTableComposition(ViewerFilter filter) {
		multipleSampleForAdvancedTableCompositionBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#isContainedInMultipleSampleForAdvancedTableCompositionTable(EObject element)
	 * 
	 */
	public boolean isContainedInMultipleSampleForAdvancedTableCompositionTable(EObject element) {
		return ((ReferencesTableSettings)multipleSampleForAdvancedTableComposition.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#initMultipleSampleForReferencesTable(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initMultipleSampleForReferencesTable(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		multipleSampleForReferencesTable.setContentProvider(contentProvider);
		multipleSampleForReferencesTable.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#updateMultipleSampleForReferencesTable()
	 * 
	 */
	public void updateMultipleSampleForReferencesTable() {
	multipleSampleForReferencesTable.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#addFilterMultipleSampleForReferencesTable(ViewerFilter filter)
	 * 
	 */
	public void addFilterToMultipleSampleForReferencesTable(ViewerFilter filter) {
		multipleSampleForReferencesTableFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#addBusinessFilterMultipleSampleForReferencesTable(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMultipleSampleForReferencesTable(ViewerFilter filter) {
		multipleSampleForReferencesTableBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#isContainedInMultipleSampleForReferencesTableTable(EObject element)
	 * 
	 */
	public boolean isContainedInMultipleSampleForReferencesTableTable(EObject element) {
		return ((ReferencesTableSettings)multipleSampleForReferencesTable.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#initMultipleSampleForAdvancedReferencesTable(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initMultipleSampleForAdvancedReferencesTable(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		multipleSampleForAdvancedReferencesTable.setContentProvider(contentProvider);
		multipleSampleForAdvancedReferencesTable.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#updateMultipleSampleForAdvancedReferencesTable()
	 * 
	 */
	public void updateMultipleSampleForAdvancedReferencesTable() {
	multipleSampleForAdvancedReferencesTable.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#addFilterMultipleSampleForAdvancedReferencesTable(ViewerFilter filter)
	 * 
	 */
	public void addFilterToMultipleSampleForAdvancedReferencesTable(ViewerFilter filter) {
		multipleSampleForAdvancedReferencesTableFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#addBusinessFilterMultipleSampleForAdvancedReferencesTable(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMultipleSampleForAdvancedReferencesTable(ViewerFilter filter) {
		multipleSampleForAdvancedReferencesTableBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#isContainedInMultipleSampleForAdvancedReferencesTableTable(EObject element)
	 * 
	 */
	public boolean isContainedInMultipleSampleForAdvancedReferencesTableTable(EObject element) {
		return ((ReferencesTableSettings)multipleSampleForAdvancedReferencesTable.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#initMultipleSampleForFlatReferencesTable(ReferencesTableSettings)
	 */
	public void initMultipleSampleForFlatReferencesTable(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		multipleSampleForFlatReferencesTable.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#updateMultipleSampleForFlatReferencesTable()
	 * 
	 */
	public void updateMultipleSampleForFlatReferencesTable() {
	multipleSampleForFlatReferencesTable.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#addFilterMultipleSampleForFlatReferencesTable(ViewerFilter filter)
	 * 
	 */
	public void addFilterToMultipleSampleForFlatReferencesTable(ViewerFilter filter) {
		multipleSampleForFlatReferencesTable.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#addBusinessFilterMultipleSampleForFlatReferencesTable(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMultipleSampleForFlatReferencesTable(ViewerFilter filter) {
		multipleSampleForFlatReferencesTable.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#isContainedInMultipleSampleForFlatReferencesTableTable(EObject element)
	 * 
	 */
	public boolean isContainedInMultipleSampleForFlatReferencesTableTable(EObject element) {
		return ((ReferencesTableSettings)multipleSampleForFlatReferencesTable.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#initSingleSampleForTableComposition(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initSingleSampleForTableComposition(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		singleSampleForTableComposition.setContentProvider(contentProvider);
		singleSampleForTableComposition.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#updateSingleSampleForTableComposition()
	 * 
	 */
	public void updateSingleSampleForTableComposition() {
	singleSampleForTableComposition.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#addFilterSingleSampleForTableComposition(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSingleSampleForTableComposition(ViewerFilter filter) {
		singleSampleForTableCompositionFilters.add(filter);
		if (this.singleSampleForTableComposition != null) {
			this.singleSampleForTableComposition.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#addBusinessFilterSingleSampleForTableComposition(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSingleSampleForTableComposition(ViewerFilter filter) {
		singleSampleForTableCompositionBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#isContainedInSingleSampleForTableCompositionTable(EObject element)
	 * 
	 */
	public boolean isContainedInSingleSampleForTableCompositionTable(EObject element) {
		return ((ReferencesTableSettings)singleSampleForTableComposition.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#initSingleSampleForAdvancedTableComposition(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initSingleSampleForAdvancedTableComposition(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		singleSampleForAdvancedTableComposition.setContentProvider(contentProvider);
		singleSampleForAdvancedTableComposition.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#updateSingleSampleForAdvancedTableComposition()
	 * 
	 */
	public void updateSingleSampleForAdvancedTableComposition() {
	singleSampleForAdvancedTableComposition.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#addFilterSingleSampleForAdvancedTableComposition(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSingleSampleForAdvancedTableComposition(ViewerFilter filter) {
		singleSampleForAdvancedTableCompositionFilters.add(filter);
		if (this.singleSampleForAdvancedTableComposition != null) {
			this.singleSampleForAdvancedTableComposition.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#addBusinessFilterSingleSampleForAdvancedTableComposition(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSingleSampleForAdvancedTableComposition(ViewerFilter filter) {
		singleSampleForAdvancedTableCompositionBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#isContainedInSingleSampleForAdvancedTableCompositionTable(EObject element)
	 * 
	 */
	public boolean isContainedInSingleSampleForAdvancedTableCompositionTable(EObject element) {
		return ((ReferencesTableSettings)singleSampleForAdvancedTableComposition.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#initSingleSampleForReferencesTable(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initSingleSampleForReferencesTable(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		singleSampleForReferencesTable.setContentProvider(contentProvider);
		singleSampleForReferencesTable.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#updateSingleSampleForReferencesTable()
	 * 
	 */
	public void updateSingleSampleForReferencesTable() {
	singleSampleForReferencesTable.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#addFilterSingleSampleForReferencesTable(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSingleSampleForReferencesTable(ViewerFilter filter) {
		singleSampleForReferencesTableFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#addBusinessFilterSingleSampleForReferencesTable(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSingleSampleForReferencesTable(ViewerFilter filter) {
		singleSampleForReferencesTableBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#isContainedInSingleSampleForReferencesTableTable(EObject element)
	 * 
	 */
	public boolean isContainedInSingleSampleForReferencesTableTable(EObject element) {
		return ((ReferencesTableSettings)singleSampleForReferencesTable.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#initSingleSampleForAdvancedReferencesTable(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initSingleSampleForAdvancedReferencesTable(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		singleSampleForAdvancedReferencesTable.setContentProvider(contentProvider);
		singleSampleForAdvancedReferencesTable.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#updateSingleSampleForAdvancedReferencesTable()
	 * 
	 */
	public void updateSingleSampleForAdvancedReferencesTable() {
	singleSampleForAdvancedReferencesTable.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#addFilterSingleSampleForAdvancedReferencesTable(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSingleSampleForAdvancedReferencesTable(ViewerFilter filter) {
		singleSampleForAdvancedReferencesTableFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#addBusinessFilterSingleSampleForAdvancedReferencesTable(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSingleSampleForAdvancedReferencesTable(ViewerFilter filter) {
		singleSampleForAdvancedReferencesTableBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#isContainedInSingleSampleForAdvancedReferencesTableTable(EObject element)
	 * 
	 */
	public boolean isContainedInSingleSampleForAdvancedReferencesTableTable(EObject element) {
		return ((ReferencesTableSettings)singleSampleForAdvancedReferencesTable.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#initSingleSampleForFlatReferencesTable(ReferencesTableSettings)
	 */
	public void initSingleSampleForFlatReferencesTable(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		singleSampleForFlatReferencesTable.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#updateSingleSampleForFlatReferencesTable()
	 * 
	 */
	public void updateSingleSampleForFlatReferencesTable() {
	singleSampleForFlatReferencesTable.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#addFilterSingleSampleForFlatReferencesTable(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSingleSampleForFlatReferencesTable(ViewerFilter filter) {
		singleSampleForFlatReferencesTable.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#addBusinessFilterSingleSampleForFlatReferencesTable(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSingleSampleForFlatReferencesTable(ViewerFilter filter) {
		singleSampleForFlatReferencesTable.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#isContainedInSingleSampleForFlatReferencesTableTable(EObject element)
	 * 
	 */
	public boolean isContainedInSingleSampleForFlatReferencesTableTable(EObject element) {
		return ((ReferencesTableSettings)singleSampleForFlatReferencesTable.getInput()).contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#getSingleContainmentForEObjectFlatComboViewer()
	 * 
	 */
	public EObject getSingleContainmentForEObjectFlatComboViewer() {
		if (singleContainmentForEObjectFlatComboViewer.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) singleContainmentForEObjectFlatComboViewer.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#initSingleContainmentForEObjectFlatComboViewer(EObjectFlatComboSettings)
	 */
	public void initSingleContainmentForEObjectFlatComboViewer(EObjectFlatComboSettings settings) {
		singleContainmentForEObjectFlatComboViewer.setInput(settings);
		if (current != null) {
			singleContainmentForEObjectFlatComboViewer.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#setSingleContainmentForEObjectFlatComboViewer(EObject newValue)
	 * 
	 */
	public void setSingleContainmentForEObjectFlatComboViewer(EObject newValue) {
		if (newValue != null) {
			singleContainmentForEObjectFlatComboViewer.setSelection(new StructuredSelection(newValue));
		} else {
			singleContainmentForEObjectFlatComboViewer.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#setSingleContainmentForEObjectFlatComboViewerButtonMode(ButtonsModeEnum newValue)
	 */
	public void setSingleContainmentForEObjectFlatComboViewerButtonMode(ButtonsModeEnum newValue) {
		singleContainmentForEObjectFlatComboViewer.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#addFilterSingleContainmentForEObjectFlatComboViewer(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSingleContainmentForEObjectFlatComboViewer(ViewerFilter filter) {
		singleContainmentForEObjectFlatComboViewer.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#addBusinessFilterSingleContainmentForEObjectFlatComboViewer(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSingleContainmentForEObjectFlatComboViewer(ViewerFilter filter) {
		singleContainmentForEObjectFlatComboViewer.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#getSingleReferencesForEObjectFlatComboViewer()
	 * 
	 */
	public EObject getSingleReferencesForEObjectFlatComboViewer() {
		if (singleReferencesForEObjectFlatComboViewer.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) singleReferencesForEObjectFlatComboViewer.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#initSingleReferencesForEObjectFlatComboViewer(EObjectFlatComboSettings)
	 */
	public void initSingleReferencesForEObjectFlatComboViewer(EObjectFlatComboSettings settings) {
		singleReferencesForEObjectFlatComboViewer.setInput(settings);
		if (current != null) {
			singleReferencesForEObjectFlatComboViewer.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#setSingleReferencesForEObjectFlatComboViewer(EObject newValue)
	 * 
	 */
	public void setSingleReferencesForEObjectFlatComboViewer(EObject newValue) {
		if (newValue != null) {
			singleReferencesForEObjectFlatComboViewer.setSelection(new StructuredSelection(newValue));
		} else {
			singleReferencesForEObjectFlatComboViewer.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#setSingleReferencesForEObjectFlatComboViewerButtonMode(ButtonsModeEnum newValue)
	 */
	public void setSingleReferencesForEObjectFlatComboViewerButtonMode(ButtonsModeEnum newValue) {
		singleReferencesForEObjectFlatComboViewer.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#addFilterSingleReferencesForEObjectFlatComboViewer(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSingleReferencesForEObjectFlatComboViewer(ViewerFilter filter) {
		singleReferencesForEObjectFlatComboViewer.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#addBusinessFilterSingleReferencesForEObjectFlatComboViewer(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSingleReferencesForEObjectFlatComboViewer(ViewerFilter filter) {
		singleReferencesForEObjectFlatComboViewer.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#getSingleContainmentForAdvancedEObjectFlatComboViewer()
	 * 
	 */
	public EObject getSingleContainmentForAdvancedEObjectFlatComboViewer() {
		return singleContainmentForAdvancedEObjectFlatComboViewer.getSelection();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#initSingleContainmentForAdvancedEObjectFlatComboViewer(EObjectFlatComboSettings)
	 */
	public void initSingleContainmentForAdvancedEObjectFlatComboViewer(EObjectFlatComboSettings settings) {
		singleContainmentForAdvancedEObjectFlatComboViewer.setInput(settings);
		if (current != null) {
			singleContainmentForAdvancedEObjectFlatComboViewer.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#setSingleContainmentForAdvancedEObjectFlatComboViewer(EObject newValue)
	 * 
	 */
	public void setSingleContainmentForAdvancedEObjectFlatComboViewer(EObject newValue) {
		if (newValue != null) {
			singleContainmentForAdvancedEObjectFlatComboViewer.setSelection(new StructuredSelection(newValue));
		} else {
			singleContainmentForAdvancedEObjectFlatComboViewer.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#setSingleContainmentForAdvancedEObjectFlatComboViewerButtonMode(ButtonsModeEnum newValue)
	 */
	public void setSingleContainmentForAdvancedEObjectFlatComboViewerButtonMode(ButtonsModeEnum newValue) {
		singleContainmentForAdvancedEObjectFlatComboViewer.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#addFilterSingleContainmentForAdvancedEObjectFlatComboViewer(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSingleContainmentForAdvancedEObjectFlatComboViewer(ViewerFilter filter) {
		singleContainmentForAdvancedEObjectFlatComboViewer.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#addBusinessFilterSingleContainmentForAdvancedEObjectFlatComboViewer(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSingleContainmentForAdvancedEObjectFlatComboViewer(ViewerFilter filter) {
		singleContainmentForAdvancedEObjectFlatComboViewer.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#getSingleReferencesForAdvancedEObjectFlatComboViewer()
	 * 
	 */
	public EObject getSingleReferencesForAdvancedEObjectFlatComboViewer() {
		return singleReferencesForAdvancedEObjectFlatComboViewer.getSelection();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#initSingleReferencesForAdvancedEObjectFlatComboViewer(EObjectFlatComboSettings)
	 */
	public void initSingleReferencesForAdvancedEObjectFlatComboViewer(EObjectFlatComboSettings settings) {
		singleReferencesForAdvancedEObjectFlatComboViewer.setInput(settings);
		if (current != null) {
			singleReferencesForAdvancedEObjectFlatComboViewer.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#setSingleReferencesForAdvancedEObjectFlatComboViewer(EObject newValue)
	 * 
	 */
	public void setSingleReferencesForAdvancedEObjectFlatComboViewer(EObject newValue) {
		if (newValue != null) {
			singleReferencesForAdvancedEObjectFlatComboViewer.setSelection(new StructuredSelection(newValue));
		} else {
			singleReferencesForAdvancedEObjectFlatComboViewer.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#setSingleReferencesForAdvancedEObjectFlatComboViewerButtonMode(ButtonsModeEnum newValue)
	 */
	public void setSingleReferencesForAdvancedEObjectFlatComboViewerButtonMode(ButtonsModeEnum newValue) {
		singleReferencesForAdvancedEObjectFlatComboViewer.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#addFilterSingleReferencesForAdvancedEObjectFlatComboViewer(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSingleReferencesForAdvancedEObjectFlatComboViewer(ViewerFilter filter) {
		singleReferencesForAdvancedEObjectFlatComboViewer.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.OwnerPropertiesEditionPart#addBusinessFilterSingleReferencesForAdvancedEObjectFlatComboViewer(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSingleReferencesForAdvancedEObjectFlatComboViewer(ViewerFilter filter) {
		singleReferencesForAdvancedEObjectFlatComboViewer.addBusinessRuleFilter(filter);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return NavigationMessages.Owner_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
