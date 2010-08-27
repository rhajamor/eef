/**
 * Generated with Acceleo
 */
package org.eclipse.emf.eef.nonreg.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.nonreg.modelNavigation.ModelNavigationFactory;
import org.eclipse.emf.eef.nonreg.modelNavigation.ModelNavigationPackage;
import org.eclipse.emf.eef.nonreg.modelNavigation.RealCible;
import org.eclipse.emf.eef.nonreg.modelNavigation.SuperCible;
import org.eclipse.emf.eef.nonreg.parts.NonregViewsRepository;
import org.eclipse.emf.eef.nonreg.parts.SourcePropertiesEditionPart;
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
import org.eclipse.emf.eef.runtime.ui.widgets.AdvancedEObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.AdvancedEObjectFlatComboViewer.EObjectFlatComboViewerListener;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;



// End of user code	

/**
 * 
 * @generated
 */
public class SourcePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, SourcePropertiesEditionPart {

	private AdvancedEObjectFlatComboViewer<SuperCible> advancedUniqueRef;
	protected ViewerFilter advancedUniqueRefFilter;
	protected EMFListEditUtil advancedMultipleContainmentEditUtil;
	protected ReferencesTable<? extends EObject> advancedMultipleContainment;
	protected List<ViewerFilter> advancedMultipleContainmentBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> advancedMultipleContainmentFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * @generated
	 */
	public SourcePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
    createPropsGroup(view);


    // Start of user code for additional ui definition
    
    // End of user code
  }

	/**
	 * @generated
	 */
	protected void createPropsGroup(Composite parent) {
    Group propsGroup = new Group(parent, SWT.NONE);
    propsGroup.setText(NonregMessages.SourcePropertiesEditionPart_PropsGroupLabel);
    GridData propsGroupData = new GridData(GridData.FILL_HORIZONTAL);
    propsGroupData.horizontalSpan = 3;
    propsGroup.setLayoutData(propsGroupData);
    GridLayout propsGroupLayout = new GridLayout();
    propsGroupLayout.numColumns = 3;
    propsGroup.setLayout(propsGroupLayout);
    createAdvancedUniqueRefAdvancedFlatComboViewer(propsGroup);
    createAdvancedMultipleContainmentAdvancedReferencesTable(propsGroup);
  }

	/**
	 * @param propsGroup
	 */
	protected void createAdvancedUniqueRefAdvancedFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, NonregMessages.SourcePropertiesEditionPart_AdvancedUniqueRefLabel, propertiesEditionComponent.isRequired(NonregViewsRepository.Source.advancedUniqueRef, NonregViewsRepository.SWT_KIND));
		// create callback listener
		EObjectFlatComboViewerListener<SuperCible> listener = new EObjectFlatComboViewerListener<SuperCible>(){
			public void handleSet(SuperCible element){
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SourcePropertiesEditionPartImpl.this, NonregViewsRepository.Source.advancedUniqueRef, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, element)); 
			}
			public void navigateTo(SuperCible element){ }
			
			public SuperCible handleCreate() {
				SuperCible eObject = ModelNavigationFactory.eINSTANCE.createRealCible();
				if (current != null && current instanceof RealCible && ((RealCible)current).getRef() != null) {
					eObject = (SuperCible) EcoreUtil.copy(((RealCible)current).getRef());
				}
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(eObject);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent, eObject,resourceSet));
					if (propertiesEditionObject != null) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SourcePropertiesEditionPartImpl.this, NonregViewsRepository.Source.advancedUniqueRef, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, propertiesEditionObject));
						return (SuperCible)propertiesEditionObject;
					}
					if (current != null && current instanceof RealCible && ((RealCible)current).getRef() != null)
						return eObject;
					return null;
				}
				return null;
			}
		};
		//create widget
		advancedUniqueRef = new AdvancedEObjectFlatComboViewer<SuperCible>(NonregMessages.SourcePropertiesEditionPart_AdvancedUniqueRefLabel,
			resourceSet, advancedUniqueRefFilter, ModelNavigationPackage.eINSTANCE.getSuperCible(), listener);
		advancedUniqueRef.createControls(parent);
		GridData advancedUniqueRefData = new GridData(GridData.FILL_HORIZONTAL);
		advancedUniqueRef.setLayoutData(advancedUniqueRefData);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NonregViewsRepository.Source.advancedUniqueRef, NonregViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	protected void createAdvancedMultipleContainmentAdvancedReferencesTable(Composite parent) {
    this.advancedMultipleContainment = new ReferencesTable<SuperCible>(NonregMessages.SourcePropertiesEditionPart_AdvancedMultipleContainmentLabel, new ReferencesTableListener<SuperCible>() {
      public void handleAdd() {
        TabElementTreeSelectionDialog<SuperCible> dialog = new TabElementTreeSelectionDialog<SuperCible>(resourceSet, advancedMultipleContainmentFilters, advancedMultipleContainmentBusinessFilters,
        "SuperCible", ModelNavigationPackage.eINSTANCE.getSuperCible(), current.eResource()) {

          public void process(IStructuredSelection selection) {
            for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
              EObject elem = (EObject) iter.next();
              if (!advancedMultipleContainmentEditUtil.getVirtualList().contains(elem))
                advancedMultipleContainmentEditUtil.addElement(elem);
              propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SourcePropertiesEditionPartImpl.this, NonregViewsRepository.Source.advancedMultipleContainment,
                PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
            }
            advancedMultipleContainment.refresh();
          }

        };
        dialog.open();
      }
      public void handleEdit(SuperCible element) { editAdvancedMultipleContainment(element); }
      public void handleMove(SuperCible element, int oldIndex, int newIndex) { moveAdvancedMultipleContainment(element, oldIndex, newIndex); }
      public void handleRemove(SuperCible element) { removeFromAdvancedMultipleContainment(element); }
      public void navigateTo(SuperCible element) { }
    });
    this.advancedMultipleContainment.setHelpText(propertiesEditionComponent.getHelpContent(NonregViewsRepository.Source.advancedMultipleContainment, NonregViewsRepository.SWT_KIND));
    this.advancedMultipleContainment.createControls(parent);
    GridData advancedMultipleContainmentData = new GridData(GridData.FILL_HORIZONTAL);
    advancedMultipleContainmentData.horizontalSpan = 3;
    this.advancedMultipleContainment.setLayoutData(advancedMultipleContainmentData);
    this.advancedMultipleContainment.disableMove();
  }

	/**
	 * @generated
	 */
	protected void moveAdvancedMultipleContainment(SuperCible element, int oldIndex, int newIndex) {
  }

	/**
	 * @generated
	 */
	protected void removeFromAdvancedMultipleContainment(SuperCible element) {
    // Start of user code removeFromAdvancedMultipleContainment() method body
        EObject editedElement = advancedMultipleContainmentEditUtil.foundCorrespondingEObject(element);
        advancedMultipleContainmentEditUtil.removeElement(element);
        advancedMultipleContainment.refresh();
        propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SourcePropertiesEditionPartImpl.this, NonregViewsRepository.Source.advancedMultipleContainment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, editedElement));
        
    // End of user code
  }

	/**
	 * @generated
	 */
	protected void editAdvancedMultipleContainment(SuperCible element) {
    // Start of user code editAdvancedMultipleContainment() method body
        EObject editedElement = advancedMultipleContainmentEditUtil.foundCorrespondingEObject(element);
        IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
        IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(editedElement);
        if (editionPolicy != null) {
          EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
          if (propertiesEditionObject != null) {
            advancedMultipleContainmentEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
            advancedMultipleContainment.refresh();
            propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SourcePropertiesEditionPartImpl.this, NonregViewsRepository.Source.advancedMultipleContainment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
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
	 * @see org.eclipse.emf.eef.modelNavigation.parts.SourcePropertiesEditionPart#getAdvancedUniqueRef()
	 * @generated
	 */
	public EObject getAdvancedUniqueRef() {
    return advancedUniqueRef.getSelection();
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.modelNavigation.parts.SourcePropertiesEditionPart#initAdvancedUniqueRef(ResourceSet allResources, EObject current)
	 */
	public void initAdvancedUniqueRef(ResourceSet allResources, EObject current) {
		advancedUniqueRef.setInput(allResources);
		if (current != null) {
			advancedUniqueRef.setSelection(new StructuredSelection(current));
			advancedUniqueRef.setMainResource(current.eResource());
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.modelNavigation.parts.SourcePropertiesEditionPart#setAdvancedUniqueRef(EObject newValue)
	 * @generated
	 */
	public void setAdvancedUniqueRef(EObject newValue) {
    if (newValue != null) {
      advancedUniqueRef.setSelection(new StructuredSelection(newValue));
    } else {
      advancedUniqueRef.setSelection(new StructuredSelection()); //$NON-NLS-1$
    }
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.modelNavigation.parts.SourcePropertiesEditionPart#setAdvancedUniqueRefButtonMode(ButtonsModeEnum newValue)
	 */
	public void setAdvancedUniqueRefButtonMode(ButtonsModeEnum newValue) {
		advancedUniqueRef.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.modelNavigation.parts.SourcePropertiesEditionPart#addFilterAdvancedUniqueRef(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToAdvancedUniqueRef(ViewerFilter filter) {
    advancedUniqueRef.addFilter(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.modelNavigation.parts.SourcePropertiesEditionPart#addBusinessFilterAdvancedUniqueRef(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToAdvancedUniqueRef(ViewerFilter filter) {
    advancedUniqueRef.addBusinessRuleFilter(filter);
  }


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.modelNavigation.parts.SourcePropertiesEditionPart#getAdvancedMultipleContainmentToAdd()
	 * @generated
	 */
	public List getAdvancedMultipleContainmentToAdd() {
    return advancedMultipleContainmentEditUtil.getElementsToAdd();
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.modelNavigation.parts.SourcePropertiesEditionPart#getAdvancedMultipleContainmentToRemove()
	 * @generated
	 */
	public List getAdvancedMultipleContainmentToRemove() {
    return advancedMultipleContainmentEditUtil.getElementsToRemove();
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.modelNavigation.parts.SourcePropertiesEditionPart#getAdvancedMultipleContainmentTable()
	 * @generated
	 */
	public List getAdvancedMultipleContainmentTable() {
    return advancedMultipleContainmentEditUtil.getVirtualList();
  }


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.modelNavigation.parts.SourcePropertiesEditionPart#initAdvancedMultipleContainment(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initAdvancedMultipleContainment(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			advancedMultipleContainmentEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			advancedMultipleContainmentEditUtil = new EMFListEditUtil(current, feature);
		this.advancedMultipleContainment.setInput(advancedMultipleContainmentEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.modelNavigation.parts.SourcePropertiesEditionPart#updateAdvancedMultipleContainment(EObject newValue)
	 * @generated
	 */
	public void updateAdvancedMultipleContainment(EObject newValue) {
    if(advancedMultipleContainmentEditUtil != null){
      advancedMultipleContainmentEditUtil.reinit(newValue);
      advancedMultipleContainment.refresh();
    }
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.modelNavigation.parts.SourcePropertiesEditionPart#addFilterAdvancedMultipleContainment(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToAdvancedMultipleContainment(ViewerFilter filter) {
    advancedMultipleContainmentFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.modelNavigation.parts.SourcePropertiesEditionPart#addBusinessFilterAdvancedMultipleContainment(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToAdvancedMultipleContainment(ViewerFilter filter) {
    advancedMultipleContainmentBusinessFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.modelNavigation.parts.SourcePropertiesEditionPart#isContainedInAdvancedMultipleContainmentTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInAdvancedMultipleContainmentTable(EObject element) {
    return advancedMultipleContainmentEditUtil.contains(element);
  }







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * @generated
	 */
	public String getTitle() {
    return NonregMessages.Source_Part_Title;
  }

	// Start of user code additional methods
	
	// End of user code


}
