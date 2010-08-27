/**
 * Generated with Acceleo
 */
package org.eclipse.emf.eef.nonreg.parts.forms;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.nonreg.Company;
import org.eclipse.emf.eef.nonreg.NonregFactory;
import org.eclipse.emf.eef.nonreg.NonregPackage;
import org.eclipse.emf.eef.nonreg.Person;
import org.eclipse.emf.eef.nonreg.parts.AdvancedEObjectFlatComboViewerPropertiesEditionPart;
import org.eclipse.emf.eef.nonreg.parts.NonregViewsRepository;
import org.eclipse.emf.eef.nonreg.providers.NonregMessages;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.policies.IPropertiesEditionPolicy;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPolicyProvider;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.policies.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.services.PropertiesEditionPolicyProviderService;
import org.eclipse.emf.eef.runtime.ui.widgets.AdvancedEObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.AdvancedEObjectFlatComboViewer.EObjectFlatComboViewerListener;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;


// End of user code

/**
 * 
 * @generated
 */
public class AdvancedEObjectFlatComboViewerPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, AdvancedEObjectFlatComboViewerPropertiesEditionPart {

	protected AdvancedEObjectFlatComboViewer<Company> advancedeobjectflatcomboviewer;
		protected ViewerFilter advancedeobjectflatcomboviewerFilter;
	protected AdvancedEObjectFlatComboViewer<Company> advancedeobjectflatcomboviewerRO;
		protected ViewerFilter advancedeobjectflatcomboviewerROFilter;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * @generated
	 */
	public AdvancedEObjectFlatComboViewerPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
    createAdvancedeobjectflatcomboviewerFlatComboViewer(view, widgetFactory);

    createAdvancedeobjectflatcomboviewerROFlatComboViewer(view, widgetFactory);

    // Start of user code for additional ui definition
    
    // End of user code
  }
	/**
	 * @param view
	 */
	protected void createAdvancedeobjectflatcomboviewerFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, NonregMessages.AdvancedEObjectFlatComboViewerPropertiesEditionPart_AdvancedeobjectflatcomboviewerLabel, propertiesEditionComponent.isRequired(NonregViewsRepository.AdvancedEObjectFlatComboViewer.advancedeobjectflatcomboviewer, NonregViewsRepository.FORM_KIND));
		// create callback listener
		EObjectFlatComboViewerListener<Company> listener = new EObjectFlatComboViewerListener<Company>(){
			public void handleSet(Company element){
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AdvancedEObjectFlatComboViewerPropertiesEditionPartForm.this, NonregViewsRepository.AdvancedEObjectFlatComboViewer.advancedeobjectflatcomboviewer, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, element)); 
			}
			public void navigateTo(Company element){ }

			public Company handleCreate() {
				Company eObject = NonregFactory.eINSTANCE.createCompany();
				if (current != null && current instanceof Person && ((Person)current).getWorkFor() != null) {
					eObject = (Company)EcoreUtil.copy(((Person)current).getWorkFor());
				}
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(eObject);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent, eObject,resourceSet));
					if (propertiesEditionObject != null) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AdvancedEObjectFlatComboViewerPropertiesEditionPartForm.this, NonregViewsRepository.AdvancedEObjectFlatComboViewer.advancedeobjectflatcomboviewer, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, propertiesEditionObject));
						return (Company)propertiesEditionObject;
					}
					if (current != null && current instanceof Person && ((Person)current).getWorkFor() != null)
						return eObject;
					return null;
				}
				return null;
			}

		};
		//create widget
		advancedeobjectflatcomboviewer = new AdvancedEObjectFlatComboViewer<Company>(NonregMessages.AdvancedEObjectFlatComboViewerPropertiesEditionPart_AdvancedeobjectflatcomboviewerLabel, 
			resourceSet, advancedeobjectflatcomboviewerFilter, NonregPackage.eINSTANCE.getCompany(), listener);
		advancedeobjectflatcomboviewer.createControls(parent, widgetFactory);
		GridData advancedeobjectflatcomboviewerData = new GridData(GridData.FILL_HORIZONTAL);
		advancedeobjectflatcomboviewer.setLayoutData(advancedeobjectflatcomboviewerData);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(NonregViewsRepository.AdvancedEObjectFlatComboViewer.advancedeobjectflatcomboviewer, NonregViewsRepository.FORM_KIND), null); //$NON-NLS-1$
	}


	/**
	 * @param view
	 */
	protected void createAdvancedeobjectflatcomboviewerROFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, NonregMessages.AdvancedEObjectFlatComboViewerPropertiesEditionPart_AdvancedeobjectflatcomboviewerROLabel, propertiesEditionComponent.isRequired(NonregViewsRepository.AdvancedEObjectFlatComboViewer.advancedeobjectflatcomboviewerRO, NonregViewsRepository.FORM_KIND));
		// create callback listener
		EObjectFlatComboViewerListener<Company> listener = new EObjectFlatComboViewerListener<Company>(){
			public void handleSet(Company element){
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AdvancedEObjectFlatComboViewerPropertiesEditionPartForm.this, NonregViewsRepository.AdvancedEObjectFlatComboViewer.advancedeobjectflatcomboviewerRO, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, element)); 
			}
			public void navigateTo(Company element){ }

			public Company handleCreate() {
				Company eObject = NonregFactory.eINSTANCE.createCompany();
				if (current != null && current instanceof Person && ((Person)current).getWorkFor() != null) {
					eObject = (Company)EcoreUtil.copy(((Person)current).getWorkFor());
				}
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(eObject);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent, eObject,resourceSet));
					if (propertiesEditionObject != null) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AdvancedEObjectFlatComboViewerPropertiesEditionPartForm.this, NonregViewsRepository.AdvancedEObjectFlatComboViewer.advancedeobjectflatcomboviewerRO, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, propertiesEditionObject));
						return (Company)propertiesEditionObject;
					}
					if (current != null && current instanceof Person && ((Person)current).getWorkFor() != null)
						return eObject;
					return null;
				}
				return null;
			}

		};
		//create widget
		advancedeobjectflatcomboviewerRO = new AdvancedEObjectFlatComboViewer<Company>(NonregMessages.AdvancedEObjectFlatComboViewerPropertiesEditionPart_AdvancedeobjectflatcomboviewerROLabel, 
			resourceSet, advancedeobjectflatcomboviewerROFilter, NonregPackage.eINSTANCE.getCompany(), listener);
		advancedeobjectflatcomboviewerRO.createControls(parent, widgetFactory);
		advancedeobjectflatcomboviewerRO.setEnabled(false);
		advancedeobjectflatcomboviewerRO.setToolTipText(NonregMessages.AdvancedEObjectFlatComboViewer_ReadOnly);
		GridData advancedeobjectflatcomboviewerROData = new GridData(GridData.FILL_HORIZONTAL);
		advancedeobjectflatcomboviewerRO.setLayoutData(advancedeobjectflatcomboviewerROData);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(NonregViewsRepository.AdvancedEObjectFlatComboViewer.advancedeobjectflatcomboviewerRO, NonregViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see org.eclipse.emf.eef.nonreg.parts.AdvancedEObjectFlatComboViewerPropertiesEditionPart#getAdvancedeobjectflatcomboviewer()
	 * @generated
	 */
	public EObject getAdvancedeobjectflatcomboviewer() {
    return advancedeobjectflatcomboviewer.getSelection();
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.AdvancedEObjectFlatComboViewerPropertiesEditionPart#initAdvancedeobjectflatcomboviewer(ResourceSet allResources, EObject current)
	 */
	public void initAdvancedeobjectflatcomboviewer(ResourceSet allResources, EObject current) {
		advancedeobjectflatcomboviewer.setInput(allResources);
		if (current != null) {
			advancedeobjectflatcomboviewer.setSelection(new StructuredSelection(current));
			advancedeobjectflatcomboviewer.setMainResource(current.eResource());
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.AdvancedEObjectFlatComboViewerPropertiesEditionPart#setAdvancedeobjectflatcomboviewer(EObject newValue)
	 * @generated
	 */
	public void setAdvancedeobjectflatcomboviewer(EObject newValue) {
    if (newValue != null) {
      advancedeobjectflatcomboviewer.setSelection(new StructuredSelection(newValue));
    } else {
      advancedeobjectflatcomboviewer.setSelection(new StructuredSelection()); //$NON-NLS-1$
    }
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.AdvancedEObjectFlatComboViewerPropertiesEditionPart#setAdvancedeobjectflatcomboviewerButtonMode(ButtonsModeEnum newValue)
	 */
	public void setAdvancedeobjectflatcomboviewerButtonMode(ButtonsModeEnum newValue) {
		advancedeobjectflatcomboviewer.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.AdvancedEObjectFlatComboViewerPropertiesEditionPart#addFilterAdvancedeobjectflatcomboviewer(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToAdvancedeobjectflatcomboviewer(ViewerFilter filter) {
    advancedeobjectflatcomboviewer.addFilter(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.AdvancedEObjectFlatComboViewerPropertiesEditionPart#addBusinessFilterAdvancedeobjectflatcomboviewer(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToAdvancedeobjectflatcomboviewer(ViewerFilter filter) {
    advancedeobjectflatcomboviewer.addBusinessRuleFilter(filter);
  }


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.AdvancedEObjectFlatComboViewerPropertiesEditionPart#getAdvancedeobjectflatcomboviewerRO()
	 * @generated
	 */
	public EObject getAdvancedeobjectflatcomboviewerRO() {
    return advancedeobjectflatcomboviewerRO.getSelection();
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.AdvancedEObjectFlatComboViewerPropertiesEditionPart#initAdvancedeobjectflatcomboviewerRO(ResourceSet allResources, EObject current)
	 */
	public void initAdvancedeobjectflatcomboviewerRO(ResourceSet allResources, EObject current) {
		advancedeobjectflatcomboviewerRO.setInput(allResources);
		if (current != null) {
			advancedeobjectflatcomboviewerRO.setSelection(new StructuredSelection(current));
			advancedeobjectflatcomboviewerRO.setMainResource(current.eResource());
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.AdvancedEObjectFlatComboViewerPropertiesEditionPart#setAdvancedeobjectflatcomboviewerRO(EObject newValue)
	 * @generated
	 */
	public void setAdvancedeobjectflatcomboviewerRO(EObject newValue) {
    if (newValue != null) {
      advancedeobjectflatcomboviewerRO.setSelection(new StructuredSelection(newValue));
    } else {
      advancedeobjectflatcomboviewerRO.setSelection(new StructuredSelection()); //$NON-NLS-1$
    }
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.AdvancedEObjectFlatComboViewerPropertiesEditionPart#setAdvancedeobjectflatcomboviewerROButtonMode(ButtonsModeEnum newValue)
	 */
	public void setAdvancedeobjectflatcomboviewerROButtonMode(ButtonsModeEnum newValue) {
		advancedeobjectflatcomboviewerRO.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.AdvancedEObjectFlatComboViewerPropertiesEditionPart#addFilterAdvancedeobjectflatcomboviewerRO(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToAdvancedeobjectflatcomboviewerRO(ViewerFilter filter) {
    advancedeobjectflatcomboviewerRO.addFilter(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.AdvancedEObjectFlatComboViewerPropertiesEditionPart#addBusinessFilterAdvancedeobjectflatcomboviewerRO(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToAdvancedeobjectflatcomboviewerRO(ViewerFilter filter) {
    advancedeobjectflatcomboviewerRO.addBusinessRuleFilter(filter);
  }




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * @generated
	 */
	public String getTitle() {
    return NonregMessages.AdvancedEObjectFlatComboViewer_Part_Title;
  }

	// Start of user code additional methods
	
	// End of user code


}
