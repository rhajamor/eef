/**
 * Generated with Acceleo
 */
package org.eclipse.emf.eef.nonreg.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.ab.abstractnonreg.AbstractnonregPackage;
import org.eclipse.emf.eef.ab.abstractnonreg.DocumentedElement;
import org.eclipse.emf.eef.middle.middlenonreg.MiddlenonregFactory;
import org.eclipse.emf.eef.middle.middlenonreg.MiddlenonregPackage;
import org.eclipse.emf.eef.middle.middlenonreg.NamedElement;
import org.eclipse.emf.eef.nonreg.parts.NonregViewsRepository;
import org.eclipse.emf.eef.nonreg.parts.TestFilterPropertiesEditionPart;
import org.eclipse.emf.eef.nonreg.providers.NonregMessages;
import org.eclipse.emf.eef.nonreg.subPackageNonRegForFilters.ForFilters;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.policies.IPropertiesEditionPolicy;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPolicyProvider;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.policies.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.services.PropertiesEditionPolicyProviderService;
import org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil;
import org.eclipse.emf.eef.runtime.ui.widgets.AdvancedEObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.AdvancedEObjectFlatComboViewer.EObjectFlatComboViewerListener;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EMFModelViewerDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;
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
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;


// End of user code

/**
 * 
 * @generated
 */
public class TestFilterPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, TestFilterPropertiesEditionPart {

	protected EObjectFlatComboViewer testEOFCV;
	private EMFListEditUtil testARTEditUtil;
		protected ReferencesTable<? extends EObject> testART;
		protected List<ViewerFilter> testARTBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> testARTFilters = new ArrayList<ViewerFilter>();
	protected AdvancedEObjectFlatComboViewer<NamedElement> testAEOFCV;
		protected ViewerFilter testAEOFCVFilter;
	protected EMFListEditUtil testRTEditUtil;
		protected TableViewer testRT;
		protected Button addTestRT;
		protected Button removeTestRT;
		protected List<ViewerFilter> testRTBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> testRTFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * @generated
	 */
	public TestFilterPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
    super(editionComponent);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createFigure(org.eclipse.swt.widgets.Composite, org.eclipse.ui.forms.widgets.FormToolkit)
	 * @generated
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
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createControls(org.eclipse.ui.forms.widgets.FormToolkit, org.eclipse.swt.widgets.Composite)
	 * @generated
	 */
	public void createControls(final FormToolkit widgetFactory, Composite view) {
    createGroupGroup(widgetFactory, view);

    // Start of user code for additional ui definition
    
    // End of user code
  }
	/**
	 * @generated
	 */
	protected void createGroupGroup(FormToolkit widgetFactory, final Composite view) {
    Section groupSection = widgetFactory.createSection(view, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
    groupSection.setText(NonregMessages.TestFilterPropertiesEditionPart_GroupGroupLabel);
    GridData groupSectionData = new GridData(GridData.FILL_HORIZONTAL);
    groupSectionData.horizontalSpan = 3;
    groupSection.setLayoutData(groupSectionData);
    Composite groupGroup = widgetFactory.createComposite(groupSection);
    GridLayout groupGroupLayout = new GridLayout();
    groupGroupLayout.numColumns = 3;
    groupGroup.setLayout(groupGroupLayout);
    createTestEOFCVFlatComboViewer(groupGroup, widgetFactory);
    createTestARTReferencesTable(widgetFactory, groupGroup);
    createTestAEOFCVFlatComboViewer(groupGroup, widgetFactory);
    createTestRTReferencesTable(widgetFactory, groupGroup);
    groupSection.setClient(groupGroup);
  }

	/**
	 * @param groupGroup
	 * @generated
	 */
	protected void createTestEOFCVFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
    FormUtils.createPartLabel(widgetFactory, parent, NonregMessages.TestFilterPropertiesEditionPart_TestEOFCVLabel, propertiesEditionComponent.isRequired(NonregViewsRepository.TestFilter.testEOFCV, NonregViewsRepository.FORM_KIND));
    testEOFCV = new EObjectFlatComboViewer(parent, true);
    testEOFCV.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
    GridData testEOFCVData = new GridData(GridData.FILL_HORIZONTAL);
    testEOFCV.setLayoutData(testEOFCVData);
    testEOFCV.addSelectionChangedListener(new ISelectionChangedListener() {

      /**
       * {@inheritDoc}
       * 
       * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
       */
      public void selectionChanged(SelectionChangedEvent event) {
        if (propertiesEditionComponent != null)
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TestFilterPropertiesEditionPartForm.this, NonregViewsRepository.TestFilter.testEOFCV, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getTestEOFCV()));
      }

    });
    FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(NonregViewsRepository.TestFilter.testEOFCV, NonregViewsRepository.FORM_KIND), null); //$NON-NLS-1$
  }

	/**
	 * @generated
	 */
	protected void createTestARTReferencesTable(FormToolkit widgetFactory, Composite parent) {
    this.testART = new ReferencesTable<DocumentedElement>(NonregMessages.TestFilterPropertiesEditionPart_TestARTLabel, new ReferencesTableListener<DocumentedElement>() {
      public void handleAdd() {
        TabElementTreeSelectionDialog<DocumentedElement> dialog = new TabElementTreeSelectionDialog<DocumentedElement>(resourceSet, testARTFilters, testARTBusinessFilters,
        "DocumentedElement", AbstractnonregPackage.eINSTANCE.getDocumentedElement(), current.eResource()) {
          @Override
          public void process(IStructuredSelection selection) {
            for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
              EObject elem = (EObject) iter.next();
              if (!testARTEditUtil.getVirtualList().contains(elem))
                testARTEditUtil.addElement(elem);
              propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TestFilterPropertiesEditionPartForm.this, NonregViewsRepository.TestFilter.testART,
                PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
            }
            testART.refresh();
          }
        };
        dialog.open();
      }
      public void handleEdit(DocumentedElement element) { editTestART(element); }
      public void handleMove(DocumentedElement element, int oldIndex, int newIndex) { moveTestART(element, oldIndex, newIndex); }
      public void handleRemove(DocumentedElement element) { removeFromTestART(element); }
      public void navigateTo(DocumentedElement element) { }
    });
    this.testART.setHelpText(propertiesEditionComponent.getHelpContent(NonregViewsRepository.TestFilter.testART, NonregViewsRepository.FORM_KIND));
    this.testART.createControls(parent, widgetFactory);
    GridData testARTData = new GridData(GridData.FILL_HORIZONTAL);
    testARTData.horizontalSpan = 3;
    this.testART.setLayoutData(testARTData);
    this.testART.disableMove();
  }

	/**
	 * @generated
	 */
	protected void moveTestART(DocumentedElement element, int oldIndex, int newIndex) {
    EObject editedElement = testARTEditUtil.foundCorrespondingEObject(element);
    testARTEditUtil.moveElement(element, oldIndex, newIndex);
    testART.refresh();
    propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TestFilterPropertiesEditionPartForm.this, NonregViewsRepository.TestFilter.testART, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));
  }

	/**
	 * @generated
	 */
	protected void removeFromTestART(DocumentedElement element) {
    // Start of user code for the removeFromTestART() method body
        EObject editedElement = testARTEditUtil.foundCorrespondingEObject(element);
        testARTEditUtil.removeElement(element);
        testART.refresh();
        propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TestFilterPropertiesEditionPartForm.this, NonregViewsRepository.TestFilter.testART, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, editedElement));
    
    // End of user code
  }

	/**
	 * @generated
	 */
	protected void editTestART(DocumentedElement element) {
    // Start of user code editTestART() method body		
        EObject editedElement = testARTEditUtil.foundCorrespondingEObject(element);
        IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
        IPropertiesEditionPolicy editionPolicy = policyProvider	.getEditionPolicy(editedElement);
        if (editionPolicy != null) {
          EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
          if (propertiesEditionObject != null) {
            testARTEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
            testART.refresh();
            propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TestFilterPropertiesEditionPartForm.this, NonregViewsRepository.TestFilter.testART, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
          }
        }
    
    // End of user code
  }

	/**
	 * @param groupGroup
	 */
	protected void createTestAEOFCVFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, NonregMessages.TestFilterPropertiesEditionPart_TestAEOFCVLabel, propertiesEditionComponent.isRequired(NonregViewsRepository.TestFilter.testAEOFCV, NonregViewsRepository.FORM_KIND));
		// create callback listener
		EObjectFlatComboViewerListener<NamedElement> listener = new EObjectFlatComboViewerListener<NamedElement>(){
			public void handleSet(NamedElement element){
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TestFilterPropertiesEditionPartForm.this, NonregViewsRepository.TestFilter.testAEOFCV, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, element)); 
			}
			public void navigateTo(NamedElement element){ }

			public NamedElement handleCreate() {
				NamedElement eObject = MiddlenonregFactory.eINSTANCE.createNamedElement();
				if (current != null && current instanceof ForFilters && ((ForFilters)current).getEOFCV() != null) {
					eObject = (NamedElement)EcoreUtil.copy(((ForFilters)current).getEOFCV());
				}
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(eObject);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent, eObject,resourceSet));
					if (propertiesEditionObject != null) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TestFilterPropertiesEditionPartForm.this, NonregViewsRepository.TestFilter.testAEOFCV, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, propertiesEditionObject));
						return (NamedElement)propertiesEditionObject;
					}
					if (current != null && current instanceof ForFilters && ((ForFilters)current).getEOFCV() != null)
						return eObject;
					return null;
				}
				return null;
			}

		};
		//create widget
		testAEOFCV = new AdvancedEObjectFlatComboViewer<NamedElement>(NonregMessages.TestFilterPropertiesEditionPart_TestAEOFCVLabel, 
			resourceSet, testAEOFCVFilter, MiddlenonregPackage.eINSTANCE.getNamedElement(), listener);
		testAEOFCV.createControls(parent, widgetFactory);
		GridData testAEOFCVData = new GridData(GridData.FILL_HORIZONTAL);
		testAEOFCV.setLayoutData(testAEOFCVData);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(NonregViewsRepository.TestFilter.testAEOFCV, NonregViewsRepository.FORM_KIND), null); //$NON-NLS-1$
	}


	/**
	 * @generated
	 */
	protected void createTestRTReferencesTable(FormToolkit widgetFactory, Composite parent) {
    Label testRTLabel = FormUtils.createPartLabel(widgetFactory, parent, NonregMessages.TestFilterPropertiesEditionPart_TestRTLabel, propertiesEditionComponent.isRequired(NonregViewsRepository.TestFilter.testRT, NonregViewsRepository.FORM_KIND));
    GridData testRTLabelData = new GridData();
    testRTLabelData.horizontalSpan = 3;
    testRTLabel.setLayoutData(testRTLabelData);
    testRT = createTestRTViewer(parent, widgetFactory, adapterFactory);
    GridData testRTData = new GridData(GridData.FILL_HORIZONTAL);
    testRTData.horizontalSpan = 2;
    testRTData.minimumHeight = 120;
    testRTData.heightHint = 120;
    testRT.getTable().setLayoutData(testRTData);
    createTestRTControlPanel(parent, widgetFactory);
  }

	/**
	 * @generated
	 */
	protected TableViewer createTestRTViewer(Composite container, FormToolkit widgetFactory, AdapterFactory adapter) {
    org.eclipse.swt.widgets.Table table = widgetFactory.createTable(container, SWT.FULL_SELECTION);
    table.setHeaderVisible(true);
    GridData gd = new GridData();
    gd.grabExcessHorizontalSpace = true;
    gd.horizontalAlignment = GridData.FILL;
    gd.grabExcessVerticalSpace = true;
    gd.verticalAlignment = GridData.FILL;
    table.setLayoutData(gd);
    table.setLinesVisible(true);
    // Start of user code for table testRT s columns definition
        TableColumn name = new TableColumn(table, SWT.NONE);
        name.setWidth(80);
        name.setText("Label"); //$NON-NLS-1$
    
    // End of user code
    
    TableViewer result = new TableViewer(table);
    result.setContentProvider(new ArrayContentProvider());
    result.setLabelProvider(new ITableLabelProvider() {
  
      // Start of user code for table testRT label provider
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
            
      
      // End of user code

      public Image getColumnImage(Object element, int columnIndex) {
        return null;
      }

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
	protected void createTestRTControlPanel(Composite container, FormToolkit widgetFactory) {
    Composite result = widgetFactory.createComposite(container, SWT.NONE);
    GridLayout layout = new GridLayout();
    layout.numColumns = 1;
    result.setLayout(layout);
    addTestRT = widgetFactory.createButton(result, NonregMessages.PropertiesEditionPart_AddListViewerLabel, SWT.NONE);
    GridData addData = new GridData(GridData.FILL_HORIZONTAL);
    addTestRT.setLayoutData(addData);
    addTestRT.addSelectionListener(new SelectionAdapter() {

      /**
       * {@inheritDoc}
       * 
       * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
       * 
       */
      public void widgetSelected(SelectionEvent e) {
        addTestRT();
        testRT.refresh();
      }

    });
    removeTestRT = widgetFactory.createButton(result, NonregMessages.PropertiesEditionPart_RemoveListViewerLabel, SWT.NONE);
    GridData removeData = new GridData(GridData.FILL_HORIZONTAL);
    removeTestRT.setLayoutData(removeData);
    removeTestRT.addSelectionListener(new SelectionAdapter() {

      /**
       * {@inheritDoc}
       * 
       * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
       * 
       */
      public void widgetSelected(SelectionEvent e) {
        if (testRT.getSelection() instanceof IStructuredSelection) {
          IStructuredSelection selection = (IStructuredSelection) testRT.getSelection();
          removeTestRT(selection);
          testRT.refresh();
        }
      }

    });
  }
	
	/**
	 * @generated
	 */
	protected void addTestRT() {

    EMFModelViewerDialog dialog = new EMFModelViewerDialog(new AdapterFactoryLabelProvider(adapterFactory), resourceSet, testRTFilters, testRTBusinessFilters, true, true) {
      public void process(IStructuredSelection selection) {
        for (Iterator iter = selection.iterator(); iter.hasNext();) {
          EObject elem = (EObject) iter.next();
          if (!testRTEditUtil.getVirtualList().contains(elem)) {
            testRTEditUtil.addElement(elem);
            propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TestFilterPropertiesEditionPartForm.this, NonregViewsRepository.TestFilter.testRT, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, testRTEditUtil.foundCorrespondingEObject(elem)));
          }
        }
      }

    };
    dialog.open();
  }
	
	/**
	 * @param selection the testRT to remove
	 * @generated
	 */
	protected void removeTestRT(IStructuredSelection selection) {
    if (selection.getFirstElement() instanceof EObject) {
      EObject selectedElement = (EObject) selection.getFirstElement();
      testRTEditUtil.removeElement(selectedElement);
      propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TestFilterPropertiesEditionPartForm.this, NonregViewsRepository.TestFilter.testRT, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, testRTEditUtil.foundCorrespondingEObject(selectedElement)));
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
	 * @see org.eclipse.emf.eef.subPackageNonRegForFilters.parts.TestFilterPropertiesEditionPart#getTestEOFCV()
	 * @generated
	 */
	public EObject getTestEOFCV() {
    if (testEOFCV.getSelection() instanceof StructuredSelection) {
      Object firstElement = ((StructuredSelection) testEOFCV.getSelection()).getFirstElement();
      if (firstElement instanceof EObject)
        return (EObject) firstElement;
    }
    return null;
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.subPackageNonRegForFilters.parts.TestFilterPropertiesEditionPart#initTestEOFCV(ResourceSet allResources, EObject current)
	 */
	public void initTestEOFCV(ResourceSet allResources, EObject current) {
		testEOFCV.setInput(allResources);
		if (current != null) {
			testEOFCV.setSelection(new StructuredSelection(current));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.subPackageNonRegForFilters.parts.TestFilterPropertiesEditionPart#setTestEOFCV(EObject newValue)
	 * @generated
	 */
	public void setTestEOFCV(EObject newValue) {
    if (newValue != null) {
      testEOFCV.setSelection(new StructuredSelection(newValue));
    } else {
      testEOFCV.setSelection(new StructuredSelection()); //$NON-NLS-1$
    }
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.subPackageNonRegForFilters.parts.TestFilterPropertiesEditionPart#setTestEOFCVButtonMode(ButtonsModeEnum newValue)
	 */
	public void setTestEOFCVButtonMode(ButtonsModeEnum newValue) {
		testEOFCV.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.subPackageNonRegForFilters.parts.TestFilterPropertiesEditionPart#addFilterTestEOFCV(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToTestEOFCV(ViewerFilter filter) {
    testEOFCV.addFilter(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.subPackageNonRegForFilters.parts.TestFilterPropertiesEditionPart#addBusinessFilterTestEOFCV(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToTestEOFCV(ViewerFilter filter) {
    testEOFCV.addBusinessRuleFilter(filter);
  }


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.subPackageNonRegForFilters.parts.TestFilterPropertiesEditionPart#getTestARTToAdd()
	 * @generated
	 */
	public List getTestARTToAdd() {
    return testARTEditUtil.getElementsToAdd();
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.subPackageNonRegForFilters.parts.TestFilterPropertiesEditionPart#getTestARTToRemove()
	 * @generated
	 */
	public List getTestARTToRemove() {
    return testARTEditUtil.getElementsToRemove();
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.subPackageNonRegForFilters.parts.TestFilterPropertiesEditionPart#getTestARTTable()
	 * @generated
	 */
	public List getTestARTTable() {
    return testARTEditUtil.getVirtualList();
  }


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.subPackageNonRegForFilters.parts.TestFilterPropertiesEditionPart#initTestART(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initTestART(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			testARTEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			testARTEditUtil = new EMFListEditUtil(current, feature);
		this.testART.setInput(testARTEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.subPackageNonRegForFilters.parts.TestFilterPropertiesEditionPart#updateTestART(EObject newValue)
	 * @generated
	 */
	public void updateTestART(EObject newValue) {
    if(testARTEditUtil != null){
      testARTEditUtil.reinit(newValue);
      testART.refresh();
    }
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.subPackageNonRegForFilters.parts.TestFilterPropertiesEditionPart#addFilterTestART(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToTestART(ViewerFilter filter) {
    testARTFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.subPackageNonRegForFilters.parts.TestFilterPropertiesEditionPart#addBusinessFilterTestART(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToTestART(ViewerFilter filter) {
    testARTBusinessFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.subPackageNonRegForFilters.parts.TestFilterPropertiesEditionPart#isContainedInTestARTTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInTestARTTable(EObject element) {
    return testARTEditUtil.contains(element);
  }


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.subPackageNonRegForFilters.parts.TestFilterPropertiesEditionPart#getTestAEOFCV()
	 * @generated
	 */
	public EObject getTestAEOFCV() {
    return testAEOFCV.getSelection();
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.subPackageNonRegForFilters.parts.TestFilterPropertiesEditionPart#initTestAEOFCV(ResourceSet allResources, EObject current)
	 */
	public void initTestAEOFCV(ResourceSet allResources, EObject current) {
		testAEOFCV.setInput(allResources);
		if (current != null) {
			testAEOFCV.setSelection(new StructuredSelection(current));
			testAEOFCV.setMainResource(current.eResource());
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.subPackageNonRegForFilters.parts.TestFilterPropertiesEditionPart#setTestAEOFCV(EObject newValue)
	 * @generated
	 */
	public void setTestAEOFCV(EObject newValue) {
    if (newValue != null) {
      testAEOFCV.setSelection(new StructuredSelection(newValue));
    } else {
      testAEOFCV.setSelection(new StructuredSelection()); //$NON-NLS-1$
    }
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.subPackageNonRegForFilters.parts.TestFilterPropertiesEditionPart#setTestAEOFCVButtonMode(ButtonsModeEnum newValue)
	 */
	public void setTestAEOFCVButtonMode(ButtonsModeEnum newValue) {
		testAEOFCV.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.subPackageNonRegForFilters.parts.TestFilterPropertiesEditionPart#addFilterTestAEOFCV(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToTestAEOFCV(ViewerFilter filter) {
    testAEOFCV.addFilter(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.subPackageNonRegForFilters.parts.TestFilterPropertiesEditionPart#addBusinessFilterTestAEOFCV(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToTestAEOFCV(ViewerFilter filter) {
    testAEOFCV.addBusinessRuleFilter(filter);
  }


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.subPackageNonRegForFilters.parts.TestFilterPropertiesEditionPart#getTestRTToAdd()
	 * @generated
	 */
	public List getTestRTToAdd() {
    return testRTEditUtil.getElementsToAdd();
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.subPackageNonRegForFilters.parts.TestFilterPropertiesEditionPart#getTestRTToRemove()
	 * @generated
	 */
	public List getTestRTToRemove() {
    return testRTEditUtil.getElementsToRemove();
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.subPackageNonRegForFilters.parts.TestFilterPropertiesEditionPart#getTestRTTable()
	 * @generated
	 */
	public List getTestRTTable() {
    return testRTEditUtil.getVirtualList();
  }


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.subPackageNonRegForFilters.parts.TestFilterPropertiesEditionPart#initTestRT(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initTestRT(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			testRTEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			testRTEditUtil = new EMFListEditUtil(current, feature);
		this.testRT.setInput(testRTEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.subPackageNonRegForFilters.parts.TestFilterPropertiesEditionPart#updateTestRT(EObject newValue)
	 * @generated
	 */
	public void updateTestRT(EObject newValue) {
    if(testRTEditUtil != null){
      testRTEditUtil.reinit(newValue);
      testRT.refresh();
    }
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.subPackageNonRegForFilters.parts.TestFilterPropertiesEditionPart#addFilterTestRT(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToTestRT(ViewerFilter filter) {
    testRTFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.subPackageNonRegForFilters.parts.TestFilterPropertiesEditionPart#addBusinessFilterTestRT(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToTestRT(ViewerFilter filter) {
    testRTBusinessFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.subPackageNonRegForFilters.parts.TestFilterPropertiesEditionPart#isContainedInTestRTTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInTestRTTable(EObject element) {
    return testRTEditUtil.contains(element);
  }




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * @generated
	 */
	public String getTitle() {
    return NonregMessages.TestFilter_Part_Title;
  }

	// Start of user code additional methods
	
	// End of user code


}
