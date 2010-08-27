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
package org.eclipse.emf.eef.eefnr.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.eefnr.EefnrFactory;
import org.eclipse.emf.eef.eefnr.Sample;
import org.eclipse.emf.eef.eefnr.parts.EefnrViewsRepository;
import org.eclipse.emf.eef.eefnr.parts.TableCompositionEditorSamplePropertiesEditionPart;
import org.eclipse.emf.eef.eefnr.providers.EefnrMessages;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.policies.IPropertiesEditionPolicy;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPolicyProvider;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.policies.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.services.PropertiesEditionPolicyProviderService;
import org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil;
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

	protected EMFListEditUtil tablecompositionRequiredPropertyEditUtil;
	protected TableViewer tablecompositionRequiredProperty;
	protected List<ViewerFilter> tablecompositionRequiredPropertyBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> tablecompositionRequiredPropertyFilters = new ArrayList<ViewerFilter>();
	protected EMFListEditUtil tablecompositionOptionalPropertyEditUtil;
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
		createPropertiesGroup(view);


		// Start of user code for additional ui definition
		
		// End of user code
	}

	/**
	 * 
	 */
	protected void createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(EefnrMessages.TableCompositionEditorSamplePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		createTablecompositionRequiredPropertyTableComposition(propertiesGroup);
		createTablecompositionOptionalPropertyTableComposition(propertiesGroup);
	}

	/**
	 * @param container
	 * 
	 */
	protected void createTablecompositionRequiredPropertyTableComposition(Composite container) {
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
				editTablecompositionRequiredProperty();
			}
	
		});
		GridData tablecompositionRequiredPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		tablecompositionRequiredPropertyData.minimumHeight = 120;
		tablecompositionRequiredPropertyData.heightHint = 120;
		tablecompositionRequiredProperty.getTable().setLayoutData(tablecompositionRequiredPropertyData);
		createTablecompositionRequiredPropertyPanel(tableContainer);
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
			 */
			public void widgetSelected(SelectionEvent e) {
				addToTablecompositionRequiredProperty();
			}
		});
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
				removeFromTablecompositionRequiredProperty();
			}

		});
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
				editTablecompositionRequiredProperty();
			}

		});
		return tablecompositionRequiredPropertyPanel;
	}

	/**
	 *  
	 */
	protected void addToTablecompositionRequiredProperty() {
		// Start of user code addToTablecompositionRequiredProperty() method body
				Sample eObject = EefnrFactory.eINSTANCE.createSample();
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(eObject);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent, eObject,resourceSet));
					if (propertiesEditionObject != null) {
						tablecompositionRequiredPropertyEditUtil.addElement(propertiesEditionObject);
						tablecompositionRequiredProperty.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TableCompositionEditorSamplePropertiesEditionPartImpl.this, EefnrViewsRepository.TableCompositionEditorSample.tablecompositionRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
					}
				}
		
		
		// End of user code

	}

	/**
	 *  
	 */
	protected void removeFromTablecompositionRequiredProperty() {
		// Start of user code removeFromTablecompositionRequiredProperty() method body
				if (tablecompositionRequiredProperty.getSelection() instanceof IStructuredSelection) {
					IStructuredSelection selection = (IStructuredSelection) tablecompositionRequiredProperty.getSelection();
					if (selection.getFirstElement() instanceof EObject) {
						EObject selectedElement = (EObject) selection.getFirstElement();
						EObject editedElement = tablecompositionRequiredPropertyEditUtil.foundCorrespondingEObject(selectedElement);
						tablecompositionRequiredPropertyEditUtil.removeElement(selectedElement);
						tablecompositionRequiredProperty.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TableCompositionEditorSamplePropertiesEditionPartImpl.this, EefnrViewsRepository.TableCompositionEditorSample.tablecompositionRequiredProperty, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.REMOVE, null, editedElement));
					}
				}
		
		// End of user code

	}

	/**
	 *  
	 */
	protected void editTablecompositionRequiredProperty() {
		// Start of user code editTablecompositionRequiredProperty() method body
				if (tablecompositionRequiredProperty.getSelection() instanceof IStructuredSelection) {
					IStructuredSelection selection = (IStructuredSelection) tablecompositionRequiredProperty.getSelection();
					if (selection.getFirstElement() instanceof EObject) {
						EObject selectedElement = (EObject) selection.getFirstElement();
						EObject editedElement = tablecompositionRequiredPropertyEditUtil.foundCorrespondingEObject(selectedElement);
						IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(editedElement);
						IPropertiesEditionPolicy editionPolicy = policyProvider	.getEditionPolicy(editedElement);
						if (editionPolicy != null) {
							EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, selectedElement,resourceSet));
							if (propertiesEditionObject != null) {
								tablecompositionRequiredPropertyEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
								tablecompositionRequiredProperty.refresh();
								propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TableCompositionEditorSamplePropertiesEditionPartImpl.this, EefnrViewsRepository.TableCompositionEditorSample.tablecompositionRequiredProperty, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
							}
						}
					}
				}
		
		// End of user code

	}

	/**
	 * @param container
	 * 
	 */
	protected void createTablecompositionOptionalPropertyTableComposition(Composite container) {
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
				editTablecompositionOptionalProperty();
			}
	
		});
		GridData tablecompositionOptionalPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		tablecompositionOptionalPropertyData.minimumHeight = 120;
		tablecompositionOptionalPropertyData.heightHint = 120;
		tablecompositionOptionalProperty.getTable().setLayoutData(tablecompositionOptionalPropertyData);
		createTablecompositionOptionalPropertyPanel(tableContainer);
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
			 */
			public void widgetSelected(SelectionEvent e) {
				addToTablecompositionOptionalProperty();
			}
		});
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
				removeFromTablecompositionOptionalProperty();
			}

		});
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
				editTablecompositionOptionalProperty();
			}

		});
		return tablecompositionOptionalPropertyPanel;
	}

	/**
	 *  
	 */
	protected void addToTablecompositionOptionalProperty() {
		// Start of user code addToTablecompositionOptionalProperty() method body
				Sample eObject = EefnrFactory.eINSTANCE.createSample();
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(eObject);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent, eObject,resourceSet));
					if (propertiesEditionObject != null) {
						tablecompositionOptionalPropertyEditUtil.addElement(propertiesEditionObject);
						tablecompositionOptionalProperty.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TableCompositionEditorSamplePropertiesEditionPartImpl.this, EefnrViewsRepository.TableCompositionEditorSample.tablecompositionOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
					}
				}
		
		
		// End of user code

	}

	/**
	 *  
	 */
	protected void removeFromTablecompositionOptionalProperty() {
		// Start of user code removeFromTablecompositionOptionalProperty() method body
				if (tablecompositionOptionalProperty.getSelection() instanceof IStructuredSelection) {
					IStructuredSelection selection = (IStructuredSelection) tablecompositionOptionalProperty.getSelection();
					if (selection.getFirstElement() instanceof EObject) {
						EObject selectedElement = (EObject) selection.getFirstElement();
						EObject editedElement = tablecompositionOptionalPropertyEditUtil.foundCorrespondingEObject(selectedElement);
						tablecompositionOptionalPropertyEditUtil.removeElement(selectedElement);
						tablecompositionOptionalProperty.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TableCompositionEditorSamplePropertiesEditionPartImpl.this, EefnrViewsRepository.TableCompositionEditorSample.tablecompositionOptionalProperty, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.REMOVE, null, editedElement));
					}
				}
		
		// End of user code

	}

	/**
	 *  
	 */
	protected void editTablecompositionOptionalProperty() {
		// Start of user code editTablecompositionOptionalProperty() method body
				if (tablecompositionOptionalProperty.getSelection() instanceof IStructuredSelection) {
					IStructuredSelection selection = (IStructuredSelection) tablecompositionOptionalProperty.getSelection();
					if (selection.getFirstElement() instanceof EObject) {
						EObject selectedElement = (EObject) selection.getFirstElement();
						EObject editedElement = tablecompositionOptionalPropertyEditUtil.foundCorrespondingEObject(selectedElement);
						IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(editedElement);
						IPropertiesEditionPolicy editionPolicy = policyProvider	.getEditionPolicy(editedElement);
						if (editionPolicy != null) {
							EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, selectedElement,resourceSet));
							if (propertiesEditionObject != null) {
								tablecompositionOptionalPropertyEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
								tablecompositionOptionalProperty.refresh();
								propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TableCompositionEditorSamplePropertiesEditionPartImpl.this, EefnrViewsRepository.TableCompositionEditorSample.tablecompositionOptionalProperty, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
							}
						}
					}
				}
		
		// End of user code

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
	 * @see org.eclipse.emf.eef.eefnr.parts.TableCompositionEditorSamplePropertiesEditionPart#getTablecompositionRequiredPropertyToAdd()
	 * 
	 */
	public List getTablecompositionRequiredPropertyToAdd() {
		return tablecompositionRequiredPropertyEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TableCompositionEditorSamplePropertiesEditionPart#getTablecompositionRequiredPropertyToRemove()
	 * 
	 */
	public List getTablecompositionRequiredPropertyToRemove() {
		return tablecompositionRequiredPropertyEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TableCompositionEditorSamplePropertiesEditionPart#getTablecompositionRequiredPropertyToEdit()
	 * 
	 */
	public Map getTablecompositionRequiredPropertyToEdit() {
		return tablecompositionRequiredPropertyEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TableCompositionEditorSamplePropertiesEditionPart#getTablecompositionRequiredPropertyToMove()
	 * 
	 */
	public List getTablecompositionRequiredPropertyToMove() {
		return tablecompositionRequiredPropertyEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TableCompositionEditorSamplePropertiesEditionPart#getTablecompositionRequiredPropertyTable()
	 * 
	 */
	public List getTablecompositionRequiredPropertyTable() {
		return tablecompositionRequiredPropertyEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TableCompositionEditorSamplePropertiesEditionPart#initTablecompositionRequiredProperty(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initTablecompositionRequiredProperty(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			tablecompositionRequiredPropertyEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			tablecompositionRequiredPropertyEditUtil = new EMFListEditUtil(current, feature);
		this.tablecompositionRequiredProperty.setInput(tablecompositionRequiredPropertyEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TableCompositionEditorSamplePropertiesEditionPart#updateTablecompositionRequiredProperty(EObject newValue)
	 * 
	 */
	public void updateTablecompositionRequiredProperty(EObject newValue) {
		if(tablecompositionRequiredPropertyEditUtil != null){
			tablecompositionRequiredPropertyEditUtil.reinit(newValue);
			tablecompositionRequiredProperty.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TableCompositionEditorSamplePropertiesEditionPart#addFilterTablecompositionRequiredProperty(ViewerFilter filter)
	 * 
	 */
	public void addFilterToTablecompositionRequiredProperty(ViewerFilter filter) {
		tablecompositionRequiredPropertyFilters.add(filter);
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
		return tablecompositionRequiredPropertyEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TableCompositionEditorSamplePropertiesEditionPart#getTablecompositionOptionalPropertyToAdd()
	 * 
	 */
	public List getTablecompositionOptionalPropertyToAdd() {
		return tablecompositionOptionalPropertyEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TableCompositionEditorSamplePropertiesEditionPart#getTablecompositionOptionalPropertyToRemove()
	 * 
	 */
	public List getTablecompositionOptionalPropertyToRemove() {
		return tablecompositionOptionalPropertyEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TableCompositionEditorSamplePropertiesEditionPart#getTablecompositionOptionalPropertyToEdit()
	 * 
	 */
	public Map getTablecompositionOptionalPropertyToEdit() {
		return tablecompositionOptionalPropertyEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TableCompositionEditorSamplePropertiesEditionPart#getTablecompositionOptionalPropertyToMove()
	 * 
	 */
	public List getTablecompositionOptionalPropertyToMove() {
		return tablecompositionOptionalPropertyEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TableCompositionEditorSamplePropertiesEditionPart#getTablecompositionOptionalPropertyTable()
	 * 
	 */
	public List getTablecompositionOptionalPropertyTable() {
		return tablecompositionOptionalPropertyEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TableCompositionEditorSamplePropertiesEditionPart#initTablecompositionOptionalProperty(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initTablecompositionOptionalProperty(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			tablecompositionOptionalPropertyEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			tablecompositionOptionalPropertyEditUtil = new EMFListEditUtil(current, feature);
		this.tablecompositionOptionalProperty.setInput(tablecompositionOptionalPropertyEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TableCompositionEditorSamplePropertiesEditionPart#updateTablecompositionOptionalProperty(EObject newValue)
	 * 
	 */
	public void updateTablecompositionOptionalProperty(EObject newValue) {
		if(tablecompositionOptionalPropertyEditUtil != null){
			tablecompositionOptionalPropertyEditUtil.reinit(newValue);
			tablecompositionOptionalProperty.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TableCompositionEditorSamplePropertiesEditionPart#addFilterTablecompositionOptionalProperty(ViewerFilter filter)
	 * 
	 */
	public void addFilterToTablecompositionOptionalProperty(ViewerFilter filter) {
		tablecompositionOptionalPropertyFilters.add(filter);
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
		return tablecompositionOptionalPropertyEditUtil.contains(element);
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
