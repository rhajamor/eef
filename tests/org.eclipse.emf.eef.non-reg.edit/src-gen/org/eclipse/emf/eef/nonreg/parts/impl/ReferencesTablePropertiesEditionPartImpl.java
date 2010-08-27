/**
 * Generated with Acceleo
 */
package org.eclipse.emf.eef.nonreg.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.nonreg.parts.NonregViewsRepository;
import org.eclipse.emf.eef.nonreg.parts.ReferencesTablePropertiesEditionPart;
import org.eclipse.emf.eef.nonreg.providers.NonregMessages;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil;
import org.eclipse.emf.eef.runtime.ui.widgets.EMFModelViewerDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
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
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.TableColumn;



// End of user code	

/**
 * 
 * @generated
 */
public class ReferencesTablePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ReferencesTablePropertiesEditionPart {

	protected EMFListEditUtil referencestableEditUtil;
	protected TableViewer referencestable;
	protected Button addReferencestable;
	protected Button removeReferencestable;
	protected List<ViewerFilter> referencestableBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> referencestableFilters = new ArrayList<ViewerFilter>();
	protected EMFListEditUtil referencestableROEditUtil;
	protected TableViewer referencestableRO;
	protected Button addReferencestableRO;
	protected Button removeReferencestableRO;
	protected List<ViewerFilter> referencestableROBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> referencestableROFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * @generated
	 */
	public ReferencesTablePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
    createReferencestableReferencesTable(view);

    createReferencestableROReferencesTable(view);


    // Start of user code for additional ui definition
    
    // End of user code
  }

	/**
	 * @param parent
	 * @generated
	 */
	protected void createReferencestableReferencesTable(Composite parent) {
    Label referencestableLabel = SWTUtils.createPartLabel(parent, NonregMessages.ReferencesTablePropertiesEditionPart_ReferencestableLabel, propertiesEditionComponent.isRequired(NonregViewsRepository.ReferencesTable.referencestable, NonregViewsRepository.SWT_KIND));
    GridData referencestableLabelData = new GridData();
    referencestableLabelData.horizontalSpan = 3;
    referencestableLabel.setLayoutData(referencestableLabelData);
    referencestable = createReferencestableViewer(parent, adapterFactory);
    GridData referencestableData = new GridData(GridData.FILL_HORIZONTAL);
    referencestableData.horizontalSpan = 2;
    referencestableData.minimumHeight = 120;
    referencestableData.heightHint = 120;
    referencestable.getTable().setLayoutData(referencestableData);
    createReferencestableControlPanel(parent);
  }

	/**
	 * @generated
	 */
	protected TableViewer createReferencestableViewer(Composite container, AdapterFactory adapter) {
    org.eclipse.swt.widgets.Table table = new org.eclipse.swt.widgets.Table(container, SWT.FULL_SELECTION);
    table.setHeaderVisible(true);
    GridData gd = new GridData();
    gd.grabExcessHorizontalSpace = true;
    gd.horizontalAlignment = GridData.FILL;
    gd.grabExcessVerticalSpace = true;
    gd.verticalAlignment = GridData.FILL;
    table.setLayoutData(gd);
    table.setLinesVisible(true);
    // Start of user code for table referencestable s columns definition		
        TableColumn name = new TableColumn(table, SWT.NONE);
        name.setWidth(80);
        name.setText("Label"); //$NON-NLS-1$
    
    // End of user code
    
    TableViewer result = new TableViewer(table);
    result.setContentProvider(new ArrayContentProvider());
    result.setLabelProvider(new ITableLabelProvider() {
  
      // Start of user code for table referencestable label provider
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
	 * @generated
	 */
	protected void createReferencestableControlPanel(Composite container) {
    Composite result = new Composite(container, SWT.NONE);
    GridLayout layout = new GridLayout();
    layout.numColumns = 1;
    result.setLayout(layout);
    addReferencestable = new Button(result, SWT.NONE);
    addReferencestable.setText(NonregMessages.PropertiesEditionPart_AddListViewerLabel);
    GridData addData = new GridData(GridData.FILL_HORIZONTAL);
    addReferencestable.setLayoutData(addData);
    addReferencestable.addSelectionListener(new SelectionAdapter() {

      /**
       * {@inheritDoc}
       * 
       * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
       * 
       */
      public void widgetSelected(SelectionEvent e) {
        addReferencestable();
        referencestable.refresh();
      }

    });
    removeReferencestable = new Button(result, SWT.NONE);
    removeReferencestable.setText(NonregMessages.PropertiesEditionPart_RemoveListViewerLabel);
    GridData removeData = new GridData(GridData.FILL_HORIZONTAL);
    removeReferencestable.setLayoutData(removeData);
    removeReferencestable.addSelectionListener(new SelectionAdapter() {

      /**
       * {@inheritDoc}
       * 
       * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
       * 
       */
      public void widgetSelected(SelectionEvent e) {
        if (referencestable.getSelection() instanceof IStructuredSelection) {
          IStructuredSelection selection = (IStructuredSelection) referencestable.getSelection();
          removeReferencestable(selection);
          referencestable.refresh();
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReferencesTablePropertiesEditionPartImpl.this, NonregViewsRepository.ReferencesTable.referencestable, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.REMOVE, null, selection.getFirstElement()));
        }
      }

    });
  }

	/**
	 * @generated
	 */
	protected void addReferencestable() {
    EMFModelViewerDialog dialog = new EMFModelViewerDialog(new AdapterFactoryLabelProvider(adapterFactory), resourceSet, referencestableFilters, referencestableBusinessFilters, true, true) {
      public void process(IStructuredSelection selection) {
        for (Iterator iter = selection.iterator(); iter.hasNext();) {
          EObject elem = (EObject) iter.next();
          if (!referencestableEditUtil.getVirtualList().contains(elem))
            referencestableEditUtil.addElement(elem);
        }
        propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReferencesTablePropertiesEditionPartImpl.this, NonregViewsRepository.ReferencesTable.referencestable, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.ADD, null, selection));
      }

    };
    dialog.open();
  }

	/**
	 * @param selection the referencestable to remove
	 * @generated
	 */
	protected void removeReferencestable(IStructuredSelection selection) {
    if (selection.getFirstElement() instanceof EObject) {
      EObject selectedElement = (EObject) selection.getFirstElement();
      referencestableEditUtil.removeElement(selectedElement);
    }
  }

	/**
	 * @param parent
	 * @generated
	 */
	protected void createReferencestableROReferencesTable(Composite parent) {
    Label referencestableROLabel = SWTUtils.createPartLabel(parent, NonregMessages.ReferencesTablePropertiesEditionPart_ReferencestableROLabel, propertiesEditionComponent.isRequired(NonregViewsRepository.ReferencesTable.referencestableRO, NonregViewsRepository.SWT_KIND));
    GridData referencestableROLabelData = new GridData();
    referencestableROLabelData.horizontalSpan = 3;
    referencestableROLabel.setLayoutData(referencestableROLabelData);
    referencestableRO = createReferencestableROViewer(parent, adapterFactory);
    GridData referencestableROData = new GridData(GridData.FILL_HORIZONTAL);
    referencestableROData.horizontalSpan = 2;
    referencestableROData.minimumHeight = 120;
    referencestableROData.heightHint = 120;
    referencestableRO.getTable().setLayoutData(referencestableROData);
    createReferencestableROControlPanel(parent);
  }

	/**
	 * @generated
	 */
	protected TableViewer createReferencestableROViewer(Composite container, AdapterFactory adapter) {
    org.eclipse.swt.widgets.Table table = new org.eclipse.swt.widgets.Table(container, SWT.FULL_SELECTION);
    table.setHeaderVisible(true);
    table.setEnabled(false);
    table.setToolTipText(NonregMessages.ReferencesTable_ReadOnly);
    GridData gd = new GridData();
    gd.grabExcessHorizontalSpace = true;
    gd.horizontalAlignment = GridData.FILL;
    gd.grabExcessVerticalSpace = true;
    gd.verticalAlignment = GridData.FILL;
    table.setLayoutData(gd);
    table.setLinesVisible(true);
    // Start of user code for table referencestableRO s columns definition		
        TableColumn name = new TableColumn(table, SWT.NONE);
        name.setWidth(80);
        name.setText("Label"); //$NON-NLS-1$
    
    // End of user code
    
    TableViewer result = new TableViewer(table);
    result.setContentProvider(new ArrayContentProvider());
    result.setLabelProvider(new ITableLabelProvider() {
  
      // Start of user code for table referencestableRO label provider
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
	 * @generated
	 */
	protected void createReferencestableROControlPanel(Composite container) {
    Composite result = new Composite(container, SWT.NONE);
    GridLayout layout = new GridLayout();
    layout.numColumns = 1;
    result.setLayout(layout);
    addReferencestableRO = new Button(result, SWT.NONE);
    addReferencestableRO.setText(NonregMessages.PropertiesEditionPart_AddListViewerLabel);
    addReferencestableRO.setEnabled(false);
    addReferencestableRO.setToolTipText(NonregMessages.ReferencesTable_ReadOnly);
    GridData addData = new GridData(GridData.FILL_HORIZONTAL);
    addReferencestableRO.setLayoutData(addData);
    addReferencestableRO.addSelectionListener(new SelectionAdapter() {

      /**
       * {@inheritDoc}
       * 
       * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
       * 
       */
      public void widgetSelected(SelectionEvent e) {
        addReferencestableRO();
        referencestableRO.refresh();
      }

    });
    removeReferencestableRO = new Button(result, SWT.NONE);
    removeReferencestableRO.setText(NonregMessages.PropertiesEditionPart_RemoveListViewerLabel);
    removeReferencestableRO.setEnabled(false);
    removeReferencestableRO.setToolTipText(NonregMessages.ReferencesTable_ReadOnly);
    GridData removeData = new GridData(GridData.FILL_HORIZONTAL);
    removeReferencestableRO.setLayoutData(removeData);
    removeReferencestableRO.addSelectionListener(new SelectionAdapter() {

      /**
       * {@inheritDoc}
       * 
       * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
       * 
       */
      public void widgetSelected(SelectionEvent e) {
        if (referencestableRO.getSelection() instanceof IStructuredSelection) {
          IStructuredSelection selection = (IStructuredSelection) referencestableRO.getSelection();
          removeReferencestableRO(selection);
          referencestableRO.refresh();
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReferencesTablePropertiesEditionPartImpl.this, NonregViewsRepository.ReferencesTable.referencestableRO, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.REMOVE, null, selection.getFirstElement()));
        }
      }

    });
  }

	/**
	 * @generated
	 */
	protected void addReferencestableRO() {
    EMFModelViewerDialog dialog = new EMFModelViewerDialog(new AdapterFactoryLabelProvider(adapterFactory), resourceSet, referencestableROFilters, referencestableROBusinessFilters, true, true) {
      public void process(IStructuredSelection selection) {
        for (Iterator iter = selection.iterator(); iter.hasNext();) {
          EObject elem = (EObject) iter.next();
          if (!referencestableROEditUtil.getVirtualList().contains(elem))
            referencestableROEditUtil.addElement(elem);
        }
        propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReferencesTablePropertiesEditionPartImpl.this, NonregViewsRepository.ReferencesTable.referencestableRO, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.ADD, null, selection));
      }

    };
    dialog.open();
  }

	/**
	 * @param selection the referencestableRO to remove
	 * @generated
	 */
	protected void removeReferencestableRO(IStructuredSelection selection) {
    if (selection.getFirstElement() instanceof EObject) {
      EObject selectedElement = (EObject) selection.getFirstElement();
      referencestableROEditUtil.removeElement(selectedElement);
    }
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
	 * @see org.eclipse.emf.eef.nonreg.parts.ReferencesTablePropertiesEditionPart#getReferencestableToAdd()
	 * @generated
	 */
	public List getReferencestableToAdd() {
    return referencestableEditUtil.getElementsToAdd();
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.ReferencesTablePropertiesEditionPart#getReferencestableToRemove()
	 * @generated
	 */
	public List getReferencestableToRemove() {
    return referencestableEditUtil.getElementsToRemove();
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.ReferencesTablePropertiesEditionPart#getReferencestableTable()
	 * @generated
	 */
	public List getReferencestableTable() {
    return referencestableEditUtil.getVirtualList();
  }


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.ReferencesTablePropertiesEditionPart#initReferencestable(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initReferencestable(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			referencestableEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			referencestableEditUtil = new EMFListEditUtil(current, feature);
		this.referencestable.setInput(referencestableEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.ReferencesTablePropertiesEditionPart#updateReferencestable(EObject newValue)
	 * @generated
	 */
	public void updateReferencestable(EObject newValue) {
    if(referencestableEditUtil != null){
      referencestableEditUtil.reinit(newValue);
      referencestable.refresh();
    }
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.ReferencesTablePropertiesEditionPart#addFilterReferencestable(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToReferencestable(ViewerFilter filter) {
    referencestableFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.ReferencesTablePropertiesEditionPart#addBusinessFilterReferencestable(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToReferencestable(ViewerFilter filter) {
    referencestableBusinessFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.ReferencesTablePropertiesEditionPart#isContainedInReferencestableTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInReferencestableTable(EObject element) {
    return referencestableEditUtil.contains(element);
  }


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.ReferencesTablePropertiesEditionPart#getReferencestableROToAdd()
	 * @generated
	 */
	public List getReferencestableROToAdd() {
    return referencestableROEditUtil.getElementsToAdd();
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.ReferencesTablePropertiesEditionPart#getReferencestableROToRemove()
	 * @generated
	 */
	public List getReferencestableROToRemove() {
    return referencestableROEditUtil.getElementsToRemove();
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.ReferencesTablePropertiesEditionPart#getReferencestableROTable()
	 * @generated
	 */
	public List getReferencestableROTable() {
    return referencestableROEditUtil.getVirtualList();
  }


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.ReferencesTablePropertiesEditionPart#initReferencestableRO(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initReferencestableRO(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			referencestableROEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			referencestableROEditUtil = new EMFListEditUtil(current, feature);
		this.referencestableRO.setInput(referencestableROEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.ReferencesTablePropertiesEditionPart#updateReferencestableRO(EObject newValue)
	 * @generated
	 */
	public void updateReferencestableRO(EObject newValue) {
    if(referencestableROEditUtil != null){
      referencestableROEditUtil.reinit(newValue);
      referencestableRO.refresh();
    }
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.ReferencesTablePropertiesEditionPart#addFilterReferencestableRO(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToReferencestableRO(ViewerFilter filter) {
    referencestableROFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.ReferencesTablePropertiesEditionPart#addBusinessFilterReferencestableRO(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToReferencestableRO(ViewerFilter filter) {
    referencestableROBusinessFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.ReferencesTablePropertiesEditionPart#isContainedInReferencestableROTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInReferencestableROTable(EObject element) {
    return referencestableROEditUtil.contains(element);
  }







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * @generated
	 */
	public String getTitle() {
    return NonregMessages.ReferencesTable_Part_Title;
  }

	// Start of user code additional methods
	
	// End of user code


}
