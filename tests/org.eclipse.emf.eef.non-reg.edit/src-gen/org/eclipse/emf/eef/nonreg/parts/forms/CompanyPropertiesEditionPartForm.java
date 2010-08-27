/**
 * Generated with Acceleo
 */
package org.eclipse.emf.eef.nonreg.parts.forms;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.middle.middlenonreg.parts.MiddlenonregViewsRepository;
import org.eclipse.emf.eef.middle.middlenonreg.parts.NamedElementPropertiesEditionPart;
import org.eclipse.emf.eef.nonreg.Adress;
import org.eclipse.emf.eef.nonreg.Company;
import org.eclipse.emf.eef.nonreg.NonregFactory;
import org.eclipse.emf.eef.nonreg.NonregPackage;
import org.eclipse.emf.eef.nonreg.parts.CompanyPropertiesEditionPart;
import org.eclipse.emf.eef.nonreg.parts.NonregViewsRepository;
import org.eclipse.emf.eef.nonreg.providers.NonregMessages;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.policies.IPropertiesEditionPolicy;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPolicyProvider;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.policies.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.services.PropertiesEditionPartProviderService;
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
import org.eclipse.ui.forms.widgets.Section;



// End of user code

/**
 * 
 * @generated
 */
public class CompanyPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, CompanyPropertiesEditionPart {

	protected AdvancedEObjectFlatComboViewer<Adress> adress;
		protected ViewerFilter adressFilter;
	private NamedElementPropertiesEditionPart namedElementPropertiesEditionPart;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * @generated
	 */
	public CompanyPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
    createPropertiesGroup(widgetFactory, view);

    createNamedElement(widgetFactory, view);

    // Start of user code for additional ui definition
    
    // End of user code
  }
	/**
	 * @generated
	 */
	protected void createPropertiesGroup(FormToolkit widgetFactory, final Composite view) {
    Section propertiesSection = widgetFactory.createSection(view, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
    propertiesSection.setText(NonregMessages.CompanyPropertiesEditionPart_PropertiesGroupLabel);
    GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
    propertiesSectionData.horizontalSpan = 3;
    propertiesSection.setLayoutData(propertiesSectionData);
    Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
    GridLayout propertiesGroupLayout = new GridLayout();
    propertiesGroupLayout.numColumns = 3;
    propertiesGroup.setLayout(propertiesGroupLayout);
    createAdressFlatComboViewer(propertiesGroup, widgetFactory);
    propertiesSection.setClient(propertiesGroup);
  }

	/**
	 * @param propertiesGroup
	 */
	protected void createAdressFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, NonregMessages.CompanyPropertiesEditionPart_AdressLabel, propertiesEditionComponent.isRequired(NonregViewsRepository.Company.adress, NonregViewsRepository.FORM_KIND));
		// create callback listener
		EObjectFlatComboViewerListener<Adress> listener = new EObjectFlatComboViewerListener<Adress>(){
			public void handleSet(Adress element){
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CompanyPropertiesEditionPartForm.this, NonregViewsRepository.Company.adress, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, element)); 
			}
			public void navigateTo(Adress element){ }

			public Adress handleCreate() {
				Adress eObject = NonregFactory.eINSTANCE.createAdress();
				if (current != null && current instanceof Company && ((Company)current).getAdress() != null) {
					eObject = (Adress)EcoreUtil.copy(((Company)current).getAdress());
				}
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(eObject);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent, eObject,resourceSet));
					if (propertiesEditionObject != null) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CompanyPropertiesEditionPartForm.this, NonregViewsRepository.Company.adress, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, propertiesEditionObject));
						return (Adress)propertiesEditionObject;
					}
					if (current != null && current instanceof Company && ((Company)current).getAdress() != null)
						return eObject;
					return null;
				}
				return null;
			}

		};
		//create widget
		adress = new AdvancedEObjectFlatComboViewer<Adress>(NonregMessages.CompanyPropertiesEditionPart_AdressLabel, 
			resourceSet, adressFilter, NonregPackage.eINSTANCE.getAdress(), listener);
		adress.createControls(parent, widgetFactory);
		GridData adressData = new GridData(GridData.FILL_HORIZONTAL);
		adress.setLayoutData(adressData);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(NonregViewsRepository.Company.adress, NonregViewsRepository.FORM_KIND), null); //$NON-NLS-1$
	}


	protected void createNamedElement(FormToolkit widgetFactory, Composite container) {
		IPropertiesEditionPartProvider provider = PropertiesEditionPartProviderService.getInstance().getProvider(MiddlenonregViewsRepository.class);
		namedElementPropertiesEditionPart = (NamedElementPropertiesEditionPart)provider.getPropertiesEditionPart(MiddlenonregViewsRepository.NamedElement.class, MiddlenonregViewsRepository.FORM_KIND, propertiesEditionComponent);
		((IFormPropertiesEditionPart)namedElementPropertiesEditionPart).createControls(widgetFactory, container);
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
	 * @see org.eclipse.emf.eef.nonreg.parts.CompanyPropertiesEditionPart#getAdress()
	 * @generated
	 */
	public EObject getAdress() {
    return adress.getSelection();
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.CompanyPropertiesEditionPart#initAdress(ResourceSet allResources, EObject current)
	 */
	public void initAdress(ResourceSet allResources, EObject current) {
		adress.setInput(allResources);
		if (current != null) {
			adress.setSelection(new StructuredSelection(current));
			adress.setMainResource(current.eResource());
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.CompanyPropertiesEditionPart#setAdress(EObject newValue)
	 * @generated
	 */
	public void setAdress(EObject newValue) {
    if (newValue != null) {
      adress.setSelection(new StructuredSelection(newValue));
    } else {
      adress.setSelection(new StructuredSelection()); //$NON-NLS-1$
    }
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.CompanyPropertiesEditionPart#setAdressButtonMode(ButtonsModeEnum newValue)
	 */
	public void setAdressButtonMode(ButtonsModeEnum newValue) {
		adress.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.CompanyPropertiesEditionPart#addFilterAdress(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToAdress(ViewerFilter filter) {
    adress.addFilter(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.CompanyPropertiesEditionPart#addBusinessFilterAdress(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToAdress(ViewerFilter filter) {
    adress.addBusinessRuleFilter(filter);
  }

/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.CompanyPropertiesEditionPart#getNamedElementReferencedView()
	 * @generated
	 */
		public IPropertiesEditionPart getNamedElementReferencedView() {
      return (IPropertiesEditionPart) namedElementPropertiesEditionPart;
    }
	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.CompanyPropertiesEditionPart#getName()
	 * @generated
	 */
	public String getName() {
    return namedElementPropertiesEditionPart.getName();
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.CompanyPropertiesEditionPart#setName(String newValue)
	 * @generated
	 */
	public void setName(String newValue) {
    namedElementPropertiesEditionPart.setName(newValue);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.NamedElementPropertiesEditionPart#getDocumentation()
	 * @generated
	 */
	public String getDocumentation() {
    return namedElementPropertiesEditionPart.getDocumentation();
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.NamedElementPropertiesEditionPart#setDocumentation(String newValue)
	 * @generated
	 */
	public void setDocumentation(String newValue) {
    namedElementPropertiesEditionPart.setDocumentation(newValue);
  }






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * @generated
	 */
	public String getTitle() {
    return NonregMessages.Company_Part_Title;
  }

	// Start of user code additional methods
	
	// End of user code


}
