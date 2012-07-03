/*******************************************************************************
 * Copyright (c) 2008, 2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.eefnr.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.eefnr.parts.EefnrViewsRepository;
import org.eclipse.emf.eef.eefnr.parts.TableCompositionEditorSamplePropertiesEditionPart;
import org.eclipse.emf.eef.eefnr.providers.EefnrMessages;
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
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.TableColumn;


// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class TableCompositionEditorSamplePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, TableCompositionEditorSamplePropertiesEditionPart {

	protected TableViewer tablecompositionRequiredProperty;
	protected List<ViewerFilter> tablecompositionRequiredPropertyBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> tablecompositionRequiredPropertyFilters = new ArrayList<ViewerFilter>();
	protected TableViewer tablecompositionOptionalProperty;
	protected List<ViewerFilter> tablecompositionOptionalPropertyBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> tablecompositionOptionalPropertyFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public TableCompositionEditorSamplePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence tableCompositionEditorSampleStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = tableCompositionEditorSampleStep.addStep(EefnrViewsRepository.TableCompositionEditorSample.Properties.class);
		propertiesStep.addStep(EefnrViewsRepository.TableCompositionEditorSample.Properties.tablecompositionRequiredProperty);
		propertiesStep.addStep(EefnrViewsRepository.TableCompositionEditorSample.Properties.tablecompositionOptionalProperty);
		
		
		composer = new PartComposer(tableCompositionEditorSampleStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EefnrViewsRepository.TableCompositionEditorSample.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == EefnrViewsRepository.TableCompositionEditorSample.Properties.tablecompositionRequiredProperty) {
					return createTablecompositionRequiredPropertyTableComposition(parent);
				}
				if (key == EefnrViewsRepository.TableCompositionEditorSample.Properties.tablecompositionOptionalProperty) {
					return createTablecompositionOptionalPropertyTableComposition(parent);
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
		propertiesGroup.setText(EefnrMessages.TableCompositionEditorSamplePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createTablecompositionRequiredPropertyTableComposition(Composite container) {
		Composite tableContainer = new Composite(container, SWT.NONE);
		GridLayout tableContainerLayout = new GridLayout();
		GridData tableContainerData = new GridData(GridData.FILL_BOTH);
		tableContainerData.horizontalSpan = 3;
		tableContainer.setLayoutData(tableContainerData);
		tableContainerLayout.numColumns = 2;
		tableContainer.setLayout(tableContainerLayout);
		org.eclipse.swt.widgets.Table tableTablecompositionRequiredProperty = new org.eclipse.swt.widgets.Table(tableContainer, SWT.FULL_SELECTION);
		tableTablecompositionRequiredProperty.setHeaderVisible(true);
		GridData gdTablecompositionRequiredProperty = new GridData();
		gdTablecompositionRequiredProperty.grabExcessHorizontalSpace = true;
		gdTablecompositionRequiredProperty.horizontalAlignment = GridData.FILL;
		gdTablecompositionRequiredProperty.grabExcessVerticalSpace = true;
		gdTablecompositionRequiredProperty.verticalAlignment = GridData.FILL;
		tableTablecompositionRequiredProperty.setLayoutData(gdTablecompositionRequiredProperty);
		tableTablecompositionRequiredProperty.setLinesVisible(true);

		// Start of user code for columns definition for TablecompositionRequiredProperty
				TableColumn name = new TableColumn(tableTablecompositionRequiredProperty, SWT.NONE);
				name.setWidth(80);
				name.setText("Label"); //$NON-NLS-1$
		// End of user code

		tablecompositionRequiredProperty = new TableViewer(tableTablecompositionRequiredProperty);
		tablecompositionRequiredProperty.setContentProvider(new ArrayContentProvider());
		tablecompositionRequiredProperty.setLabelProvider(new ITableLabelProvider() {
			//Start of user code for label provider definition for TablecompositionRequiredProperty
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
		tablecompositionRequiredProperty.getTable().addListener(SWT.MouseDoubleClick, new Listener(){

			public void handleEvent(Event event) {
				if (tablecompositionRequiredProperty.getSelection() instanceof IStructuredSelection) {
					IStructuredSelection selection = (IStructuredSelection) tablecompositionRequiredProperty.getSelection();
					if (selection.getFirstElement() instanceof EObject) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TableCompositionEditorSamplePropertiesEditionPartImpl.this, EefnrViewsRepository.TableCompositionEditorSample.Properties.tablecompositionRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, selection.getFirstElement()));
						tablecompositionRequiredProperty.refresh();
					}
				}
			}

		});
		GridData tablecompositionRequiredPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		tablecompositionRequiredPropertyData.minimumHeight = 120;
		tablecompositionRequiredPropertyData.heightHint = 120;
		tablecompositionRequiredProperty.getTable().setLayoutData(tablecompositionRequiredPropertyData);
		for (ViewerFilter filter : this.tablecompositionRequiredPropertyFilters) {
			tablecompositionRequiredProperty.addFilter(filter);
		}
		EditingUtils.setID(tablecompositionRequiredProperty.getTable(), EefnrViewsRepository.TableCompositionEditorSample.Properties.tablecompositionRequiredProperty);
		EditingUtils.setEEFtype(tablecompositionRequiredProperty.getTable(), "eef::TableComposition::field"); //$NON-NLS-1$
		createTablecompositionRequiredPropertyPanel(tableContainer);
		return container;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createTablecompositionRequiredPropertyPanel(Composite container) {
		Composite tablecompositionRequiredPropertyPanel = new Composite(container, SWT.NONE);
		GridLayout tablecompositionRequiredPropertyPanelLayout = new GridLayout();
		tablecompositionRequiredPropertyPanelLayout.numColumns = 1;
		tablecompositionRequiredPropertyPanel.setLayout(tablecompositionRequiredPropertyPanelLayout);
		Button addTablecompositionRequiredProperty = new Button(tablecompositionRequiredPropertyPanel, SWT.NONE);
		addTablecompositionRequiredProperty.setText(EefnrMessages.PropertiesEditionPart_AddTableViewerLabel);
		GridData addTablecompositionRequiredPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		addTablecompositionRequiredProperty.setLayoutData(addTablecompositionRequiredPropertyData);
		addTablecompositionRequiredProperty.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TableCompositionEditorSamplePropertiesEditionPartImpl.this, EefnrViewsRepository.TableCompositionEditorSample.Properties.tablecompositionRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				tablecompositionRequiredProperty.refresh();
			}
		});
		EditingUtils.setID(addTablecompositionRequiredProperty, EefnrViewsRepository.TableCompositionEditorSample.Properties.tablecompositionRequiredProperty);
		EditingUtils.setEEFtype(addTablecompositionRequiredProperty, "eef::TableComposition::addbutton"); //$NON-NLS-1$
		Button removeTablecompositionRequiredProperty = new Button(tablecompositionRequiredPropertyPanel, SWT.NONE);
		removeTablecompositionRequiredProperty.setText(EefnrMessages.PropertiesEditionPart_RemoveTableViewerLabel);
		GridData removeTablecompositionRequiredPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		removeTablecompositionRequiredProperty.setLayoutData(removeTablecompositionRequiredPropertyData);
		removeTablecompositionRequiredProperty.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				if (tablecompositionRequiredProperty.getSelection() instanceof IStructuredSelection) {
					IStructuredSelection selection = (IStructuredSelection) tablecompositionRequiredProperty.getSelection();
					if (selection.getFirstElement() instanceof EObject) {
						EObject selectedElement = (EObject) selection.getFirstElement();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TableCompositionEditorSamplePropertiesEditionPartImpl.this, EefnrViewsRepository.TableCompositionEditorSample.Properties.tablecompositionRequiredProperty, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.REMOVE, null, selectedElement));
						tablecompositionRequiredProperty.refresh();
					}
				}
			}

		});
		EditingUtils.setID(removeTablecompositionRequiredProperty, EefnrViewsRepository.TableCompositionEditorSample.Properties.tablecompositionRequiredProperty);
		EditingUtils.setEEFtype(removeTablecompositionRequiredProperty, "eef::TableComposition::removebutton"); //$NON-NLS-1$
		Button editTablecompositionRequiredProperty = new Button(tablecompositionRequiredPropertyPanel, SWT.NONE);
		editTablecompositionRequiredProperty.setText(EefnrMessages.PropertiesEditionPart_EditTableViewerLabel);
		GridData editTablecompositionRequiredPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		editTablecompositionRequiredProperty.setLayoutData(editTablecompositionRequiredPropertyData);
		editTablecompositionRequiredProperty.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				if (tablecompositionRequiredProperty.getSelection() instanceof IStructuredSelection) {
					IStructuredSelection selection = (IStructuredSelection) tablecompositionRequiredProperty.getSelection();
					if (selection.getFirstElement() instanceof EObject) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TableCompositionEditorSamplePropertiesEditionPartImpl.this, EefnrViewsRepository.TableCompositionEditorSample.Properties.tablecompositionRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, selection.getFirstElement()));
						tablecompositionRequiredProperty.refresh();
					}
				}
			}

		});
		EditingUtils.setID(editTablecompositionRequiredProperty, EefnrViewsRepository.TableCompositionEditorSample.Properties.tablecompositionRequiredProperty);
		EditingUtils.setEEFtype(editTablecompositionRequiredProperty, "eef::TableComposition::editbutton"); //$NON-NLS-1$
		return tablecompositionRequiredPropertyPanel;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createTablecompositionOptionalPropertyTableComposition(Composite container) {
		Composite tableContainer = new Composite(container, SWT.NONE);
		GridLayout tableContainerLayout = new GridLayout();
		GridData tableContainerData = new GridData(GridData.FILL_BOTH);
		tableContainerData.horizontalSpan = 3;
		tableContainer.setLayoutData(tableContainerData);
		tableContainerLayout.numColumns = 2;
		tableContainer.setLayout(tableContainerLayout);
		org.eclipse.swt.widgets.Table tableTablecompositionOptionalProperty = new org.eclipse.swt.widgets.Table(tableContainer, SWT.FULL_SELECTION);
		tableTablecompositionOptionalProperty.setHeaderVisible(true);
		GridData gdTablecompositionOptionalProperty = new GridData();
		gdTablecompositionOptionalProperty.grabExcessHorizontalSpace = true;
		gdTablecompositionOptionalProperty.horizontalAlignment = GridData.FILL;
		gdTablecompositionOptionalProperty.grabExcessVerticalSpace = true;
		gdTablecompositionOptionalProperty.verticalAlignment = GridData.FILL;
		tableTablecompositionOptionalProperty.setLayoutData(gdTablecompositionOptionalProperty);
		tableTablecompositionOptionalProperty.setLinesVisible(true);

		// Start of user code for columns definition for TablecompositionOptionalProperty
				TableColumn name = new TableColumn(tableTablecompositionOptionalProperty, SWT.NONE);
				name.setWidth(80);
				name.setText("Label"); //$NON-NLS-1$
		// End of user code

		tablecompositionOptionalProperty = new TableViewer(tableTablecompositionOptionalProperty);
		tablecompositionOptionalProperty.setContentProvider(new ArrayContentProvider());
		tablecompositionOptionalProperty.setLabelProvider(new ITableLabelProvider() {
			//Start of user code for label provider definition for TablecompositionOptionalProperty
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
		tablecompositionOptionalProperty.getTable().addListener(SWT.MouseDoubleClick, new Listener(){

			public void handleEvent(Event event) {
				if (tablecompositionOptionalProperty.getSelection() instanceof IStructuredSelection) {
					IStructuredSelection selection = (IStructuredSelection) tablecompositionOptionalProperty.getSelection();
					if (selection.getFirstElement() instanceof EObject) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TableCompositionEditorSamplePropertiesEditionPartImpl.this, EefnrViewsRepository.TableCompositionEditorSample.Properties.tablecompositionOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, selection.getFirstElement()));
						tablecompositionOptionalProperty.refresh();
					}
				}
			}

		});
		GridData tablecompositionOptionalPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		tablecompositionOptionalPropertyData.minimumHeight = 120;
		tablecompositionOptionalPropertyData.heightHint = 120;
		tablecompositionOptionalProperty.getTable().setLayoutData(tablecompositionOptionalPropertyData);
		for (ViewerFilter filter : this.tablecompositionOptionalPropertyFilters) {
			tablecompositionOptionalProperty.addFilter(filter);
		}
		EditingUtils.setID(tablecompositionOptionalProperty.getTable(), EefnrViewsRepository.TableCompositionEditorSample.Properties.tablecompositionOptionalProperty);
		EditingUtils.setEEFtype(tablecompositionOptionalProperty.getTable(), "eef::TableComposition::field"); //$NON-NLS-1$
		createTablecompositionOptionalPropertyPanel(tableContainer);
		return container;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createTablecompositionOptionalPropertyPanel(Composite container) {
		Composite tablecompositionOptionalPropertyPanel = new Composite(container, SWT.NONE);
		GridLayout tablecompositionOptionalPropertyPanelLayout = new GridLayout();
		tablecompositionOptionalPropertyPanelLayout.numColumns = 1;
		tablecompositionOptionalPropertyPanel.setLayout(tablecompositionOptionalPropertyPanelLayout);
		Button addTablecompositionOptionalProperty = new Button(tablecompositionOptionalPropertyPanel, SWT.NONE);
		addTablecompositionOptionalProperty.setText(EefnrMessages.PropertiesEditionPart_AddTableViewerLabel);
		GridData addTablecompositionOptionalPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		addTablecompositionOptionalProperty.setLayoutData(addTablecompositionOptionalPropertyData);
		addTablecompositionOptionalProperty.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TableCompositionEditorSamplePropertiesEditionPartImpl.this, EefnrViewsRepository.TableCompositionEditorSample.Properties.tablecompositionOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				tablecompositionOptionalProperty.refresh();
			}
		});
		EditingUtils.setID(addTablecompositionOptionalProperty, EefnrViewsRepository.TableCompositionEditorSample.Properties.tablecompositionOptionalProperty);
		EditingUtils.setEEFtype(addTablecompositionOptionalProperty, "eef::TableComposition::addbutton"); //$NON-NLS-1$
		Button removeTablecompositionOptionalProperty = new Button(tablecompositionOptionalPropertyPanel, SWT.NONE);
		removeTablecompositionOptionalProperty.setText(EefnrMessages.PropertiesEditionPart_RemoveTableViewerLabel);
		GridData removeTablecompositionOptionalPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		removeTablecompositionOptionalProperty.setLayoutData(removeTablecompositionOptionalPropertyData);
		removeTablecompositionOptionalProperty.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				if (tablecompositionOptionalProperty.getSelection() instanceof IStructuredSelection) {
					IStructuredSelection selection = (IStructuredSelection) tablecompositionOptionalProperty.getSelection();
					if (selection.getFirstElement() instanceof EObject) {
						EObject selectedElement = (EObject) selection.getFirstElement();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TableCompositionEditorSamplePropertiesEditionPartImpl.this, EefnrViewsRepository.TableCompositionEditorSample.Properties.tablecompositionOptionalProperty, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.REMOVE, null, selectedElement));
						tablecompositionOptionalProperty.refresh();
					}
				}
			}

		});
		EditingUtils.setID(removeTablecompositionOptionalProperty, EefnrViewsRepository.TableCompositionEditorSample.Properties.tablecompositionOptionalProperty);
		EditingUtils.setEEFtype(removeTablecompositionOptionalProperty, "eef::TableComposition::removebutton"); //$NON-NLS-1$
		Button editTablecompositionOptionalProperty = new Button(tablecompositionOptionalPropertyPanel, SWT.NONE);
		editTablecompositionOptionalProperty.setText(EefnrMessages.PropertiesEditionPart_EditTableViewerLabel);
		GridData editTablecompositionOptionalPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		editTablecompositionOptionalProperty.setLayoutData(editTablecompositionOptionalPropertyData);
		editTablecompositionOptionalProperty.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				if (tablecompositionOptionalProperty.getSelection() instanceof IStructuredSelection) {
					IStructuredSelection selection = (IStructuredSelection) tablecompositionOptionalProperty.getSelection();
					if (selection.getFirstElement() instanceof EObject) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TableCompositionEditorSamplePropertiesEditionPartImpl.this, EefnrViewsRepository.TableCompositionEditorSample.Properties.tablecompositionOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, selection.getFirstElement()));
						tablecompositionOptionalProperty.refresh();
					}
				}
			}

		});
		EditingUtils.setID(editTablecompositionOptionalProperty, EefnrViewsRepository.TableCompositionEditorSample.Properties.tablecompositionOptionalProperty);
		EditingUtils.setEEFtype(editTablecompositionOptionalProperty, "eef::TableComposition::editbutton"); //$NON-NLS-1$
		return tablecompositionOptionalPropertyPanel;
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
	 * @see org.eclipse.emf.eef.eefnr.parts.TableCompositionEditorSamplePropertiesEditionPart#initTablecompositionRequiredProperty(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initTablecompositionRequiredProperty(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		tablecompositionRequiredProperty.setContentProvider(contentProvider);
		tablecompositionRequiredProperty.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TableCompositionEditorSamplePropertiesEditionPart#updateTablecompositionRequiredProperty()
	 * 
	 */
	public void updateTablecompositionRequiredProperty() {
	tablecompositionRequiredProperty.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TableCompositionEditorSamplePropertiesEditionPart#addFilterTablecompositionRequiredProperty(ViewerFilter filter)
	 * 
	 */
	public void addFilterToTablecompositionRequiredProperty(ViewerFilter filter) {
		tablecompositionRequiredPropertyFilters.add(filter);
		if (this.tablecompositionRequiredProperty != null) {
			this.tablecompositionRequiredProperty.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TableCompositionEditorSamplePropertiesEditionPart#addBusinessFilterTablecompositionRequiredProperty(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToTablecompositionRequiredProperty(ViewerFilter filter) {
		tablecompositionRequiredPropertyBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TableCompositionEditorSamplePropertiesEditionPart#isContainedInTablecompositionRequiredPropertyTable(EObject element)
	 * 
	 */
	public boolean isContainedInTablecompositionRequiredPropertyTable(EObject element) {
		return ((ReferencesTableSettings)tablecompositionRequiredProperty.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TableCompositionEditorSamplePropertiesEditionPart#initTablecompositionOptionalProperty(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initTablecompositionOptionalProperty(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		tablecompositionOptionalProperty.setContentProvider(contentProvider);
		tablecompositionOptionalProperty.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TableCompositionEditorSamplePropertiesEditionPart#updateTablecompositionOptionalProperty()
	 * 
	 */
	public void updateTablecompositionOptionalProperty() {
	tablecompositionOptionalProperty.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TableCompositionEditorSamplePropertiesEditionPart#addFilterTablecompositionOptionalProperty(ViewerFilter filter)
	 * 
	 */
	public void addFilterToTablecompositionOptionalProperty(ViewerFilter filter) {
		tablecompositionOptionalPropertyFilters.add(filter);
		if (this.tablecompositionOptionalProperty != null) {
			this.tablecompositionOptionalProperty.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TableCompositionEditorSamplePropertiesEditionPart#addBusinessFilterTablecompositionOptionalProperty(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToTablecompositionOptionalProperty(ViewerFilter filter) {
		tablecompositionOptionalPropertyBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TableCompositionEditorSamplePropertiesEditionPart#isContainedInTablecompositionOptionalPropertyTable(EObject element)
	 * 
	 */
	public boolean isContainedInTablecompositionOptionalPropertyTable(EObject element) {
		return ((ReferencesTableSettings)tablecompositionOptionalProperty.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EefnrMessages.TableCompositionEditorSample_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
