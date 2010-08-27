/**
 * Generated with Acceleo
 */
package org.eclipse.emf.eef.nonreg.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.nonreg.NonregFactory;
import org.eclipse.emf.eef.nonreg.Site;
import org.eclipse.emf.eef.nonreg.parts.NonregViewsRepository;
import org.eclipse.emf.eef.nonreg.parts.TableCompositionPropertiesEditionPart;
import org.eclipse.emf.eef.nonreg.providers.NonregMessages;
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
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.TableColumn;



// End of user code	

/**
 * 
 * @generated
 */
public class TableCompositionPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, TableCompositionPropertiesEditionPart {

	protected EMFListEditUtil tablecompositionEditUtil;
	protected TableViewer tablecomposition;
	protected List<ViewerFilter> tablecompositionBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> tablecompositionFilters = new ArrayList<ViewerFilter>();
	protected EMFListEditUtil tablecompositionROEditUtil;
	protected TableViewer tablecompositionRO;
	protected List<ViewerFilter> tablecompositionROBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> tablecompositionROFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * @generated
	 */
	public TableCompositionPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
    super(editionComponent);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createFigure(org.eclipse.swt.widgets.Composite)
	 * @generated
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
	 * @generated
	 */
	public void createControls(Composite view) { 
    createTablecompositionTableComposition(view);

    createTablecompositionROTableComposition(view);


    // Start of user code for additional ui definition
    
    // End of user code
  }

	/**
	 * @param container
	 * @generated
	 */
	protected void createTablecompositionTableComposition(Composite container) {
    Composite tableContainer = new Composite(container, SWT.NONE);
    GridLayout tableContainerLayout = new GridLayout();
    GridData tableContainerData = new GridData(GridData.FILL_BOTH);
    tableContainerData.horizontalSpan = 3;
    tableContainer.setLayoutData(tableContainerData);
    tableContainerLayout.numColumns = 2;
    tableContainer.setLayout(tableContainerLayout);
    org.eclipse.swt.widgets.Table tableTablecomposition = new org.eclipse.swt.widgets.Table(tableContainer, SWT.FULL_SELECTION);
    tableTablecomposition.setHeaderVisible(true);
    GridData gdTablecomposition = new GridData();
    gdTablecomposition.grabExcessHorizontalSpace = true;
    gdTablecomposition.horizontalAlignment = GridData.FILL;
    gdTablecomposition.grabExcessVerticalSpace = true;
    gdTablecomposition.verticalAlignment = GridData.FILL;
    tableTablecomposition.setLayoutData(gdTablecomposition);
    tableTablecomposition.setLinesVisible(true);
    
    // Start of user code for columns definition for Tablecomposition
        TableColumn name = new TableColumn(tableTablecomposition, SWT.NONE);
        name.setWidth(80);
        name.setText("Label"); //$NON-NLS-1$
    // End of user code

    tablecomposition = new TableViewer(tableTablecomposition);
    tablecomposition.setContentProvider(new ArrayContentProvider());
    tablecomposition.setLabelProvider(new ITableLabelProvider() {
      //Start of user code for label provider definition for Tablecomposition
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
    tablecomposition.getTable().addListener(SWT.MouseDoubleClick, new Listener(){

      public void handleEvent(Event event) {
        editTablecomposition();
      }
  
    });
    GridData tablecompositionData = new GridData(GridData.FILL_HORIZONTAL);
    tablecompositionData.minimumHeight = 120;
    tablecompositionData.heightHint = 120;
    tablecomposition.getTable().setLayoutData(tablecompositionData);
    createTablecompositionPanel(tableContainer);
  }

	/**
	 * @param container
	 * @generated
	 */
	protected Composite createTablecompositionPanel(Composite container) {
    Composite tablecompositionPanel = new Composite(container, SWT.NONE);
    GridLayout tablecompositionPanelLayout = new GridLayout();
    tablecompositionPanelLayout.numColumns = 1;
    tablecompositionPanel.setLayout(tablecompositionPanelLayout);
    Button addTablecomposition = new Button(tablecompositionPanel, SWT.NONE);
    addTablecomposition.setText(NonregMessages.PropertiesEditionPart_AddTableViewerLabel);
    GridData addTablecompositionData = new GridData(GridData.FILL_HORIZONTAL);
    addTablecomposition.setLayoutData(addTablecompositionData);
    addTablecomposition.addSelectionListener(new SelectionAdapter() {

      /**
       * {@inheritDoc}
       * 
       * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
       */
      public void widgetSelected(SelectionEvent e) {
        addToTablecomposition();
      }
    });
    Button removeTablecomposition = new Button(tablecompositionPanel, SWT.NONE);
    removeTablecomposition.setText(NonregMessages.PropertiesEditionPart_RemoveTableViewerLabel);
    GridData removeTablecompositionData = new GridData(GridData.FILL_HORIZONTAL);
    removeTablecomposition.setLayoutData(removeTablecompositionData);
    removeTablecomposition.addSelectionListener(new SelectionAdapter() {

      /**
       * {@inheritDoc}
       * 
       * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
       * 
       */
      public void widgetSelected(SelectionEvent e) {
        removeFromTablecomposition();
      }

    });
    Button editTablecomposition = new Button(tablecompositionPanel, SWT.NONE);
    editTablecomposition.setText(NonregMessages.PropertiesEditionPart_EditTableViewerLabel);
    GridData editTablecompositionData = new GridData(GridData.FILL_HORIZONTAL);
    editTablecomposition.setLayoutData(editTablecompositionData);
    editTablecomposition.addSelectionListener(new SelectionAdapter() {

      /**
       * {@inheritDoc}
       * 
       * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
       * 
       */
      public void widgetSelected(SelectionEvent e) {
        editTablecomposition();
      }

    });
    return tablecompositionPanel;
  }

	/**
	 * @generated 
	 */
	protected void addToTablecomposition() {
    // Start of user code addToTablecomposition() method body
        Site eObject = NonregFactory.eINSTANCE.createSite();
        IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(eObject);
        IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
        if (editionPolicy != null) {
          EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent, eObject,resourceSet));
          if (propertiesEditionObject != null) {
            tablecompositionEditUtil.addElement(propertiesEditionObject);
            tablecomposition.refresh();
            propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TableCompositionPropertiesEditionPartImpl.this, NonregViewsRepository.TableComposition.tablecomposition, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
          }
        }
    
    
    // End of user code

  }

	/**
	 * @generated 
	 */
	protected void removeFromTablecomposition() {
    // Start of user code removeFromTablecomposition() method body
        if (tablecomposition.getSelection() instanceof IStructuredSelection) {
          IStructuredSelection selection = (IStructuredSelection) tablecomposition.getSelection();
          if (selection.getFirstElement() instanceof EObject) {
            EObject selectedElement = (EObject) selection.getFirstElement();
            EObject editedElement = tablecompositionEditUtil.foundCorrespondingEObject(selectedElement);
            tablecompositionEditUtil.removeElement(selectedElement);
            tablecomposition.refresh();
            propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TableCompositionPropertiesEditionPartImpl.this, NonregViewsRepository.TableComposition.tablecomposition, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.REMOVE, null, editedElement));
          }
        }
    
    // End of user code

  }

	/**
	 * @generated 
	 */
	protected void editTablecomposition() {
    // Start of user code editTablecomposition() method body
        if (tablecomposition.getSelection() instanceof IStructuredSelection) {
          IStructuredSelection selection = (IStructuredSelection) tablecomposition.getSelection();
          if (selection.getFirstElement() instanceof EObject) {
            EObject selectedElement = (EObject) selection.getFirstElement();
            EObject editedElement = tablecompositionEditUtil.foundCorrespondingEObject(selectedElement);
            IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(editedElement);
            IPropertiesEditionPolicy editionPolicy = policyProvider	.getEditionPolicy(editedElement);
            if (editionPolicy != null) {
              EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, selectedElement,resourceSet));
              if (propertiesEditionObject != null) {
                tablecompositionEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
                tablecomposition.refresh();
                propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TableCompositionPropertiesEditionPartImpl.this, NonregViewsRepository.TableComposition.tablecomposition, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
              }
            }
          }
        }
    
    // End of user code

  }

	/**
	 * @param container
	 * @generated
	 */
	protected void createTablecompositionROTableComposition(Composite container) {
    Composite tableContainer = new Composite(container, SWT.NONE);
    GridLayout tableContainerLayout = new GridLayout();
    GridData tableContainerData = new GridData(GridData.FILL_BOTH);
    tableContainerData.horizontalSpan = 3;
    tableContainer.setLayoutData(tableContainerData);
    tableContainerLayout.numColumns = 2;
    tableContainer.setLayout(tableContainerLayout);
    org.eclipse.swt.widgets.Table tableTablecompositionRO = new org.eclipse.swt.widgets.Table(tableContainer, SWT.FULL_SELECTION);
    tableTablecompositionRO.setHeaderVisible(true);
    tableTablecompositionRO.setEnabled(false);
    tableTablecompositionRO.setToolTipText(NonregMessages.TableComposition_ReadOnly);
    GridData gdTablecompositionRO = new GridData();
    gdTablecompositionRO.grabExcessHorizontalSpace = true;
    gdTablecompositionRO.horizontalAlignment = GridData.FILL;
    gdTablecompositionRO.grabExcessVerticalSpace = true;
    gdTablecompositionRO.verticalAlignment = GridData.FILL;
    tableTablecompositionRO.setLayoutData(gdTablecompositionRO);
    tableTablecompositionRO.setLinesVisible(true);
    
    // Start of user code for columns definition for TablecompositionRO
        TableColumn name = new TableColumn(tableTablecompositionRO, SWT.NONE);
        name.setWidth(80);
        name.setText("Label"); //$NON-NLS-1$
    // End of user code

    tablecompositionRO = new TableViewer(tableTablecompositionRO);
    tablecompositionRO.setContentProvider(new ArrayContentProvider());
    tablecompositionRO.setLabelProvider(new ITableLabelProvider() {
      //Start of user code for label provider definition for TablecompositionRO
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
    tablecompositionRO.getTable().addListener(SWT.MouseDoubleClick, new Listener(){

      public void handleEvent(Event event) {
        editTablecompositionRO();
      }
  
    });
    GridData tablecompositionROData = new GridData(GridData.FILL_HORIZONTAL);
    tablecompositionROData.minimumHeight = 120;
    tablecompositionROData.heightHint = 120;
    tablecompositionRO.getTable().setLayoutData(tablecompositionROData);
    createTablecompositionROPanel(tableContainer);
  }

	/**
	 * @param container
	 * @generated
	 */
	protected Composite createTablecompositionROPanel(Composite container) {
    Composite tablecompositionROPanel = new Composite(container, SWT.NONE);
    GridLayout tablecompositionROPanelLayout = new GridLayout();
    tablecompositionROPanelLayout.numColumns = 1;
    tablecompositionROPanel.setLayout(tablecompositionROPanelLayout);
    Button addTablecompositionRO = new Button(tablecompositionROPanel, SWT.NONE);
    addTablecompositionRO.setText(NonregMessages.PropertiesEditionPart_AddTableViewerLabel);
    addTablecompositionRO.setEnabled(false);
    addTablecompositionRO.setToolTipText(NonregMessages.TableComposition_ReadOnly);
    GridData addTablecompositionROData = new GridData(GridData.FILL_HORIZONTAL);
    addTablecompositionRO.setLayoutData(addTablecompositionROData);
    addTablecompositionRO.addSelectionListener(new SelectionAdapter() {

      /**
       * {@inheritDoc}
       * 
       * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
       */
      public void widgetSelected(SelectionEvent e) {
        addToTablecompositionRO();
      }
    });
    Button removeTablecompositionRO = new Button(tablecompositionROPanel, SWT.NONE);
    removeTablecompositionRO.setText(NonregMessages.PropertiesEditionPart_RemoveTableViewerLabel);
    removeTablecompositionRO.setEnabled(false);
    removeTablecompositionRO.setToolTipText(NonregMessages.TableComposition_ReadOnly);
    GridData removeTablecompositionROData = new GridData(GridData.FILL_HORIZONTAL);
    removeTablecompositionRO.setLayoutData(removeTablecompositionROData);
    removeTablecompositionRO.addSelectionListener(new SelectionAdapter() {

      /**
       * {@inheritDoc}
       * 
       * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
       * 
       */
      public void widgetSelected(SelectionEvent e) {
        removeFromTablecompositionRO();
      }

    });
    Button editTablecompositionRO = new Button(tablecompositionROPanel, SWT.NONE);
    editTablecompositionRO.setText(NonregMessages.PropertiesEditionPart_EditTableViewerLabel);
    editTablecompositionRO.setEnabled(false);
    editTablecompositionRO.setToolTipText(NonregMessages.TableComposition_ReadOnly);
    GridData editTablecompositionROData = new GridData(GridData.FILL_HORIZONTAL);
    editTablecompositionRO.setLayoutData(editTablecompositionROData);
    editTablecompositionRO.addSelectionListener(new SelectionAdapter() {

      /**
       * {@inheritDoc}
       * 
       * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
       * 
       */
      public void widgetSelected(SelectionEvent e) {
        editTablecompositionRO();
      }

    });
    return tablecompositionROPanel;
  }

	/**
	 * @generated 
	 */
	protected void addToTablecompositionRO() {
    // Start of user code addToTablecompositionRO() method body
        Site eObject = NonregFactory.eINSTANCE.createSite();
        IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(eObject);
        IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
        if (editionPolicy != null) {
          EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent, eObject,resourceSet));
          if (propertiesEditionObject != null) {
            tablecompositionROEditUtil.addElement(propertiesEditionObject);
            tablecompositionRO.refresh();
            propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TableCompositionPropertiesEditionPartImpl.this, NonregViewsRepository.TableComposition.tablecompositionRO, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
          }
        }
    
    
    // End of user code

  }

	/**
	 * @generated 
	 */
	protected void removeFromTablecompositionRO() {
    // Start of user code removeFromTablecompositionRO() method body
        if (tablecompositionRO.getSelection() instanceof IStructuredSelection) {
          IStructuredSelection selection = (IStructuredSelection) tablecompositionRO.getSelection();
          if (selection.getFirstElement() instanceof EObject) {
            EObject selectedElement = (EObject) selection.getFirstElement();
            EObject editedElement = tablecompositionROEditUtil.foundCorrespondingEObject(selectedElement);
            tablecompositionROEditUtil.removeElement(selectedElement);
            tablecompositionRO.refresh();
            propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TableCompositionPropertiesEditionPartImpl.this, NonregViewsRepository.TableComposition.tablecompositionRO, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.REMOVE, null, editedElement));
          }
        }
    
    // End of user code

  }

	/**
	 * @generated 
	 */
	protected void editTablecompositionRO() {
    // Start of user code editTablecompositionRO() method body
        if (tablecompositionRO.getSelection() instanceof IStructuredSelection) {
          IStructuredSelection selection = (IStructuredSelection) tablecompositionRO.getSelection();
          if (selection.getFirstElement() instanceof EObject) {
            EObject selectedElement = (EObject) selection.getFirstElement();
            EObject editedElement = tablecompositionROEditUtil.foundCorrespondingEObject(selectedElement);
            IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(editedElement);
            IPropertiesEditionPolicy editionPolicy = policyProvider	.getEditionPolicy(editedElement);
            if (editionPolicy != null) {
              EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, selectedElement,resourceSet));
              if (propertiesEditionObject != null) {
                tablecompositionROEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
                tablecompositionRO.refresh();
                propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TableCompositionPropertiesEditionPartImpl.this, NonregViewsRepository.TableComposition.tablecompositionRO, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
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
	 * @generated
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
    // Start of user code for tab synchronization
    
    // End of user code
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.TableCompositionPropertiesEditionPart#getTablecompositionToAdd()
	 * @generated
	 */
	public List getTablecompositionToAdd() {
    return tablecompositionEditUtil.getElementsToAdd();
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.TableCompositionPropertiesEditionPart#getTablecompositionToRemove()
	 * @generated
	 */
	public List getTablecompositionToRemove() {
    return tablecompositionEditUtil.getElementsToRemove();
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.TableCompositionPropertiesEditionPart#getTablecompositionToEdit()
	 * @generated
	 */
	public Map getTablecompositionToEdit() {
    return tablecompositionEditUtil.getElementsToRefresh();
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.TableCompositionPropertiesEditionPart#getTablecompositionToMove()
	 * @generated
	 */
	public List getTablecompositionToMove() {
    return tablecompositionEditUtil.getElementsToMove();
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.TableCompositionPropertiesEditionPart#getTablecompositionTable()
	 * @generated
	 */
	public List getTablecompositionTable() {
    return tablecompositionEditUtil.getVirtualList();
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.TableCompositionPropertiesEditionPart#initTablecomposition(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initTablecomposition(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			tablecompositionEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			tablecompositionEditUtil = new EMFListEditUtil(current, feature);
		this.tablecomposition.setInput(tablecompositionEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.TableCompositionPropertiesEditionPart#updateTablecomposition(EObject newValue)
	 * @generated
	 */
	public void updateTablecomposition(EObject newValue) {
    if(tablecompositionEditUtil != null){
      tablecompositionEditUtil.reinit(newValue);
      tablecomposition.refresh();
    }
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.TableCompositionPropertiesEditionPart#addFilterTablecomposition(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToTablecomposition(ViewerFilter filter) {
    tablecompositionFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.TableCompositionPropertiesEditionPart#addBusinessFilterTablecomposition(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToTablecomposition(ViewerFilter filter) {
    tablecompositionBusinessFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.TableCompositionPropertiesEditionPart#isContainedInTablecompositionTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInTablecompositionTable(EObject element) {
    return tablecompositionEditUtil.contains(element);
  }


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.TableCompositionPropertiesEditionPart#getTablecompositionROToAdd()
	 * @generated
	 */
	public List getTablecompositionROToAdd() {
    return tablecompositionROEditUtil.getElementsToAdd();
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.TableCompositionPropertiesEditionPart#getTablecompositionROToRemove()
	 * @generated
	 */
	public List getTablecompositionROToRemove() {
    return tablecompositionROEditUtil.getElementsToRemove();
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.TableCompositionPropertiesEditionPart#getTablecompositionROToEdit()
	 * @generated
	 */
	public Map getTablecompositionROToEdit() {
    return tablecompositionROEditUtil.getElementsToRefresh();
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.TableCompositionPropertiesEditionPart#getTablecompositionROToMove()
	 * @generated
	 */
	public List getTablecompositionROToMove() {
    return tablecompositionROEditUtil.getElementsToMove();
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.TableCompositionPropertiesEditionPart#getTablecompositionROTable()
	 * @generated
	 */
	public List getTablecompositionROTable() {
    return tablecompositionROEditUtil.getVirtualList();
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.TableCompositionPropertiesEditionPart#initTablecompositionRO(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initTablecompositionRO(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			tablecompositionROEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			tablecompositionROEditUtil = new EMFListEditUtil(current, feature);
		this.tablecompositionRO.setInput(tablecompositionROEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.TableCompositionPropertiesEditionPart#updateTablecompositionRO(EObject newValue)
	 * @generated
	 */
	public void updateTablecompositionRO(EObject newValue) {
    if(tablecompositionROEditUtil != null){
      tablecompositionROEditUtil.reinit(newValue);
      tablecompositionRO.refresh();
    }
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.TableCompositionPropertiesEditionPart#addFilterTablecompositionRO(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToTablecompositionRO(ViewerFilter filter) {
    tablecompositionROFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.TableCompositionPropertiesEditionPart#addBusinessFilterTablecompositionRO(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToTablecompositionRO(ViewerFilter filter) {
    tablecompositionROBusinessFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.TableCompositionPropertiesEditionPart#isContainedInTablecompositionROTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInTablecompositionROTable(EObject element) {
    return tablecompositionROEditUtil.contains(element);
  }







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * @generated
	 */
	public String getTitle() {
    return NonregMessages.TableComposition_Part_Title;
  }

	// Start of user code additional methods
	
	// End of user code


}
