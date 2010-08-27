/**
 * Generated with Acceleo
 */
package org.eclipse.emf.eef.nonreg.parts.forms;

// Start of user code for imports
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.eef.nonreg.parts.NonregViewsRepository;
import org.eclipse.emf.eef.nonreg.parts.TestFilterPropertiesEditionPart;
import org.eclipse.emf.eef.nonreg.parts.TestVRFilterPropertiesEditionPart;
import org.eclipse.emf.eef.nonreg.providers.NonregMessages;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.services.PropertiesEditionPartProviderService;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.jface.viewers.ViewerFilter;
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
public class TestVRFilterPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, TestVRFilterPropertiesEditionPart {

	private TestFilterPropertiesEditionPart testFilterPropertiesEditionPart;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * @generated
	 */
	public TestVRFilterPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
    createTestFilter(widgetFactory, view);

    // Start of user code for additional ui definition
    
    // End of user code
  }
	protected void createTestFilter(FormToolkit widgetFactory, Composite container) {
		IPropertiesEditionPartProvider provider = PropertiesEditionPartProviderService.getInstance().getProvider(NonregViewsRepository.class);
		testFilterPropertiesEditionPart = (TestFilterPropertiesEditionPart)provider.getPropertiesEditionPart(NonregViewsRepository.TestFilter.class, NonregViewsRepository.FORM_KIND, propertiesEditionComponent);
		((IFormPropertiesEditionPart)testFilterPropertiesEditionPart).createControls(widgetFactory, container);
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
	 * @see org.eclipse.emf.eef.subPackageNonRegForFilters.parts.TestVRFilterPropertiesEditionPart#getTestFilterReferencedView()
	 * @generated
	 */
		public IPropertiesEditionPart getTestFilterReferencedView() {
      return (IPropertiesEditionPart) testFilterPropertiesEditionPart;
    }
	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.subPackageNonRegForFilters.parts.TestVRFilterPropertiesEditionPart#getTestEOFCV()
	 * @generated
	 */
	public EObject getTestEOFCV() {
    return testFilterPropertiesEditionPart.getTestEOFCV();
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.subPackageNonRegForFilters.parts.TestVRFilterPropertiesEditionPart#initTestEOFCV(ResourceSet allResources, EObject current)
	 */
	public void initTestEOFCV(ResourceSet allResources, EObject current) {
		testFilterPropertiesEditionPart.initTestEOFCV(allResources, current);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.subPackageNonRegForFilters.parts.TestVRFilterPropertiesEditionPart#setTestEOFCV(EObject newValue)
	 * @generated
	 */
	public void setTestEOFCV(EObject newValue) {
    testFilterPropertiesEditionPart.setTestEOFCV(newValue);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.subPackageNonRegForFilters.parts.TestVRFilterPropertiesEditionPart#setTestEOFCVButtonMode(ButtonsModeEnum newValue)
	 */
	public void setTestEOFCVButtonMode(ButtonsModeEnum newValue) {
		testFilterPropertiesEditionPart.setTestEOFCVButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.subPackageNonRegForFilters.parts.TestVRFilterPropertiesEditionPart#addFilterTestEOFCV(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToTestEOFCV(ViewerFilter filter) {
    testFilterPropertiesEditionPart.addFilterToTestEOFCV(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.subPackageNonRegForFilters.parts.TestVRFilterPropertiesEditionPart#addBusinessFilterTestEOFCV(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToTestEOFCV(ViewerFilter filter) {
    testFilterPropertiesEditionPart.addBusinessFilterToTestEOFCV(filter);
  }


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.subPackageNonRegForFilters.parts.TestVRFilterPropertiesEditionPart#getTestARTToAdd()
	 * @generated
	 */
	public List getTestARTToAdd() {
    return testFilterPropertiesEditionPart.getTestARTToAdd();
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.subPackageNonRegForFilters.parts.TestVRFilterPropertiesEditionPart#getTestARTToRemove()
	 * @generated
	 */
	public List getTestARTToRemove() {
    return testFilterPropertiesEditionPart.getTestARTToRemove();
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.subPackageNonRegForFilters.parts.TestVRFilterPropertiesEditionPart#getTestARTTable()
	 * @generated
	 */
	public List getTestARTTable() {
    return testFilterPropertiesEditionPart.getTestARTTable();
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.subPackageNonRegForFilters.parts.TestVRFilterPropertiesEditionPart#initTestART(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initTestART(EObject current, EReference containingFeature, EReference feature) {
		testFilterPropertiesEditionPart.initTestART(current, containingFeature, feature);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.subPackageNonRegForFilters.parts.TestVRFilterPropertiesEditionPart#updateTestART(EObject newValue)
	 * @generated
	 */
	public void updateTestART(EObject newValue) {
    testFilterPropertiesEditionPart.updateTestART(newValue);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.subPackageNonRegForFilters.parts.TestVRFilterPropertiesEditionPart#addFilterTestART(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToTestART(ViewerFilter filter) {
    testFilterPropertiesEditionPart.addFilterToTestART(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.subPackageNonRegForFilters.parts.TestVRFilterPropertiesEditionPart#addBusinessFilterTestART(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToTestART(ViewerFilter filter) {
    testFilterPropertiesEditionPart.addBusinessFilterToTestART(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.subPackageNonRegForFilters.parts.TestVRFilterPropertiesEditionPart#isContainedInTestARTTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInTestARTTable(EObject element) {
    return testFilterPropertiesEditionPart.isContainedInTestARTTable(element);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.subPackageNonRegForFilters.parts.TestVRFilterPropertiesEditionPart#getTestAEOFCV()
	 * @generated
	 */
	public EObject getTestAEOFCV() {
    return testFilterPropertiesEditionPart.getTestAEOFCV();
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.subPackageNonRegForFilters.parts.TestVRFilterPropertiesEditionPart#initTestAEOFCV(ResourceSet allResources, EObject current)
	 */
	public void initTestAEOFCV(ResourceSet allResources, EObject current) {
		testFilterPropertiesEditionPart.initTestAEOFCV(allResources, current);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.subPackageNonRegForFilters.parts.TestVRFilterPropertiesEditionPart#setTestAEOFCV(EObject newValue)
	 * @generated
	 */
	public void setTestAEOFCV(EObject newValue) {
    testFilterPropertiesEditionPart.setTestAEOFCV(newValue);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.subPackageNonRegForFilters.parts.TestVRFilterPropertiesEditionPart#setTestAEOFCVButtonMode(ButtonsModeEnum newValue)
	 */
	public void setTestAEOFCVButtonMode(ButtonsModeEnum newValue) {
		testFilterPropertiesEditionPart.setTestAEOFCVButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.subPackageNonRegForFilters.parts.TestVRFilterPropertiesEditionPart#addFilterTestAEOFCV(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToTestAEOFCV(ViewerFilter filter) {
    testFilterPropertiesEditionPart.addFilterToTestAEOFCV(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.subPackageNonRegForFilters.parts.TestVRFilterPropertiesEditionPart#addBusinessFilterTestAEOFCV(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToTestAEOFCV(ViewerFilter filter) {
    testFilterPropertiesEditionPart.addBusinessFilterToTestAEOFCV(filter);
  }


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.subPackageNonRegForFilters.parts.TestVRFilterPropertiesEditionPart#getTestRTToAdd()
	 * @generated
	 */
	public List getTestRTToAdd() {
    return testFilterPropertiesEditionPart.getTestRTToAdd();
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.subPackageNonRegForFilters.parts.TestVRFilterPropertiesEditionPart#getTestRTToRemove()
	 * @generated
	 */
	public List getTestRTToRemove() {
    return testFilterPropertiesEditionPart.getTestRTToRemove();
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.subPackageNonRegForFilters.parts.TestVRFilterPropertiesEditionPart#getTestRTTable()
	 * @generated
	 */
	public List getTestRTTable() {
    return testFilterPropertiesEditionPart.getTestRTTable();
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.subPackageNonRegForFilters.parts.TestVRFilterPropertiesEditionPart#initTestRT(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initTestRT(EObject current, EReference containingFeature, EReference feature) {
		testFilterPropertiesEditionPart.initTestRT(current, containingFeature, feature);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.subPackageNonRegForFilters.parts.TestVRFilterPropertiesEditionPart#updateTestRT(EObject newValue)
	 * @generated
	 */
	public void updateTestRT(EObject newValue) {
    testFilterPropertiesEditionPart.updateTestRT(newValue);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.subPackageNonRegForFilters.parts.TestVRFilterPropertiesEditionPart#addFilterTestRT(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToTestRT(ViewerFilter filter) {
    testFilterPropertiesEditionPart.addFilterToTestRT(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.subPackageNonRegForFilters.parts.TestVRFilterPropertiesEditionPart#addBusinessFilterTestRT(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToTestRT(ViewerFilter filter) {
    testFilterPropertiesEditionPart.addBusinessFilterToTestRT(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.subPackageNonRegForFilters.parts.TestVRFilterPropertiesEditionPart#isContainedInTestRTTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInTestRTTable(EObject element) {
    return testFilterPropertiesEditionPart.isContainedInTestRTTable(element);
  }





	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * @generated
	 */
	public String getTitle() {
    return NonregMessages.TestVRFilter_Part_Title;
  }

	// Start of user code additional methods
	
	// End of user code


}
