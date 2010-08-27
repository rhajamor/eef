/**
 * Generated with Acceleo
 */
package org.eclipse.emf.eef.nonreg.components;

// Start of user code for imports
import java.util.Collection;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.command.IdentityCommand;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.eef.middle.middlenonreg.MiddlenonregPackage;
import org.eclipse.emf.eef.middle.middlenonreg.NamedElement;
import org.eclipse.emf.eef.nonreg.NonregPackage;
import org.eclipse.emf.eef.nonreg.parts.NonregViewsRepository;
import org.eclipse.emf.eef.nonreg.parts.TestFilterPropertiesEditionPart;
import org.eclipse.emf.eef.nonreg.subPackageNonRegForFilters.ForFilters;
import org.eclipse.emf.eef.nonreg.subPackageNonRegForFilters.SubPackageNonRegForFiltersPackage;
import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;
import org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesValidationEditionEvent;
import org.eclipse.emf.eef.runtime.impl.services.PropertiesEditionPartProviderService;
import org.eclipse.emf.eef.runtime.impl.utils.EEFUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
	

// End of user code

/**
 * 
 * 
 */
public class TestFilterFlatComboPropertiesEditionComponent extends StandardPropertiesEditionComponent {

	
	public static String TESTFILTER_PART = "testFilter"; //$NON-NLS-1$

	
	private String[] parts = {TESTFILTER_PART};

	/**
	 * The EObject to edit
	 * 
	 */
	private ForFilters forFilters;

	/**
	 * The testFilter part
	 * 
	 */
	protected TestFilterPropertiesEditionPart testFilterPart;

	/**
	 * Default constructor
	 * 
	 */
	public TestFilterFlatComboPropertiesEditionComponent(EObject forFilters, String editing_mode) {
		if (forFilters instanceof ForFilters) {
			this.forFilters = (ForFilters)forFilters;
			if (IPropertiesEditionComponent.LIVE_MODE.equals(editing_mode)) {
				semanticAdapter = initializeSemanticAdapter();
				this.forFilters.eAdapters().add(semanticAdapter);
			}
		}
		this.editing_mode = editing_mode;
	}

	/**
	 * Initialize the semantic model listener for live editing mode
	 * 
	 * @return the semantic model listener
	 * 
	 */
	private AdapterImpl initializeSemanticAdapter() {
		return new EContentAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.emf.common.notify.impl.AdapterImpl#notifyChanged(org.eclipse.emf.common.notify.Notification)
			 * 
			 */
			public void notifyChanged(final Notification msg) {
				if (testFilterPart == null)
					TestFilterFlatComboPropertiesEditionComponent.this.dispose();
				else {
					Runnable updateRunnable = new Runnable() {
						public void run() {
							runUpdateRunnable(msg);
						}
					};
					if (null == Display.getCurrent()) {
						PlatformUI.getWorkbench().getDisplay().syncExec(updateRunnable);
					} else {
						updateRunnable.run();
					}
				}
			}

		};
	}

	/**
	 * Used to update the views
	 * 
	 */
	protected void runUpdateRunnable(final Notification msg) {
		if (SubPackageNonRegForFiltersPackage.eINSTANCE.getForFilters_EOFCV().equals(msg.getFeature()) && testFilterPart != null)
			testFilterPart.setTestEOFCV((EObject)msg.getNewValue());
		if (SubPackageNonRegForFiltersPackage.eINSTANCE.getForFilters_EOFCV().equals(msg.getFeature()) && testFilterPart != null)
			testFilterPart.setTestAEOFCV((EObject)msg.getNewValue());

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#translatePart(java.lang.String)
	 * 
	 */
	public java.lang.Class translatePart(String key) {
		if (TESTFILTER_PART.equals(key))
			return NonregViewsRepository.TestFilter.class;
		return super.translatePart(key);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#partsList()
	 * 
	 */
	public String[] partsList() {
		return parts;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#getPropertiesEditionPart
	 *  (java.lang.String, java.lang.String)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(int kind, String key) {
		if (forFilters != null && TESTFILTER_PART.equals(key)) {
			if (testFilterPart == null) {
				IPropertiesEditionPartProvider provider = PropertiesEditionPartProviderService.getInstance().getProvider(NonregViewsRepository.class);
				if (provider != null) {
					testFilterPart = (TestFilterPropertiesEditionPart)provider.getPropertiesEditionPart(NonregViewsRepository.TestFilter.class, kind, this);
					addListener((IPropertiesEditionListener)testFilterPart);
				}
			}
			return (IPropertiesEditionPart)testFilterPart;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#
	 *      setPropertiesEditionPart(java.lang.Class, int, org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart)
	 * 
	 */
	public void setPropertiesEditionPart(java.lang.Class key, int kind, IPropertiesEditionPart propertiesEditionPart) {
		if (key == NonregViewsRepository.TestFilter.class)
			this.testFilterPart = (TestFilterPropertiesEditionPart) propertiesEditionPart;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Class, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(java.lang.Class key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (testFilterPart != null && key == NonregViewsRepository.TestFilter.class) {
			((IPropertiesEditionPart)testFilterPart).setContext(elt, allResource);
			final ForFilters forFilters = (ForFilters)elt;
			// init values
			// init part
			testFilterPart.initTestEOFCV(allResource, forFilters.getEOFCV());
			// set the button mode
			testFilterPart.setTestEOFCVButtonMode(ButtonsModeEnum.BROWSE);
			// init part
			testFilterPart.initTestAEOFCV(allResource, forFilters.getEOFCV());
			// set the button mode
			testFilterPart.setTestAEOFCVButtonMode(ButtonsModeEnum.BROWSE);
			// init filters
			testFilterPart.addFilterToTestEOFCV(new ViewerFilter() {

				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					return (element instanceof String && element.equals("")) || (element instanceof NamedElement); //$NON-NLS-1$ 
				}

			});
			testFilterPart.addFilterToTestEOFCV(new ViewerFilter() {

				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
return true;
				}

			});
			testFilterPart.addFilterToTestEOFCV(new ViewerFilter() {

				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					return methodFilterEOFCV(viewer, parentElement, element);
				}

			});
			// OCLFilter not implemented yet
			testFilterPart.addFilterToTestEOFCV(new ViewerFilter() {

				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					Object result = EEFUtils.choiceOfValues(TestFilterFlatComboPropertiesEditionComponent.this.forFilters, NonregPackage.eINSTANCE.getPerson_Assists());
					if (result instanceof Collection) {
						return ((Collection)result).contains(element);
					} else if (result instanceof ResourceSet && element instanceof EObject) {
						return ((EObject)element).eResource() != null && ((EObject)element).eResource().getResourceSet() != null && ((EObject)element).eResource().getResourceSet().equals(result);
					}
					return element instanceof Resource;
				}
			});
			// Start of user code for additional businessfilters for testFilterForEOFCV
			
			// End of user code

			testFilterPart.addFilterToTestAEOFCV(new EObjectFilter(MiddlenonregPackage.eINSTANCE.getNamedElement()));
		}
		// init values for referenced views

		// init filters for referenced views

		setInitializing(false);
	}

	/**
	 * 
	 */
	private boolean methodFilterEOFCV(Viewer viewer, Object parentElement, Object element){
		// Start of user code for user filter methodFilterEOFCV
		return true;
		// End of user code
	}

	/**
	 * 
	 */
	private boolean methodFilterAEOFCV(Viewer viewer, Object parentElement, Object element){
		// Start of user code for user filter methodFilterAEOFCV
		return true;
		// End of user code
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#getPropertiesEditionCommand
	 *     (org.eclipse.emf.edit.domain.EditingDomain)
	 * 
	 */
	public CompoundCommand getPropertiesEditionCommand(EditingDomain editingDomain) {
		CompoundCommand cc = new CompoundCommand();
		if ((forFilters != null) && (testFilterPart != null)) { 
			if (forFilters.eGet(SubPackageNonRegForFiltersPackage.eINSTANCE.getForFilters_EOFCV()) == null || !forFilters.eGet(SubPackageNonRegForFiltersPackage.eINSTANCE.getForFilters_EOFCV()).equals(testFilterPart.getTestEOFCV())) {
				cc.append(SetCommand.create(editingDomain, forFilters, SubPackageNonRegForFiltersPackage.eINSTANCE.getForFilters_EOFCV(), testFilterPart.getTestEOFCV()));
			}
			if (forFilters.eGet(SubPackageNonRegForFiltersPackage.eINSTANCE.getForFilters_EOFCV()) == null || !forFilters.eGet(SubPackageNonRegForFiltersPackage.eINSTANCE.getForFilters_EOFCV()).equals(testFilterPart.getTestAEOFCV())) {
				cc.append(SetCommand.create(editingDomain, forFilters, SubPackageNonRegForFiltersPackage.eINSTANCE.getForFilters_EOFCV(), testFilterPart.getTestAEOFCV()));
			}

		}
		if (!cc.isEmpty())
			return cc;
		cc.append(IdentityCommand.INSTANCE);
		return cc;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#getPropertiesEditionObject()
	 * 
	 */
	public EObject getPropertiesEditionObject(EObject source) {
		if (source instanceof ForFilters) {
			ForFilters forFiltersToUpdate = (ForFilters)source;
			forFiltersToUpdate.setEOFCV((NamedElement)testFilterPart.getTestEOFCV());
			forFiltersToUpdate.setEOFCV((NamedElement)testFilterPart.getTestAEOFCV());

			return forFiltersToUpdate;
		}
		else
			return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		if (!isInitializing()) {
			Diagnostic valueDiagnostic = validateValue(event);
			if (PropertiesEditionEvent.COMMIT == event.getState() && IPropertiesEditionComponent.LIVE_MODE.equals(editing_mode) && valueDiagnostic.getSeverity() == Diagnostic.OK) {
				CompoundCommand command = new CompoundCommand();
			if (NonregViewsRepository.TestFilter.testEOFCV == event.getAffectedEditor())
				command.append(SetCommand.create(liveEditingDomain, forFilters, SubPackageNonRegForFiltersPackage.eINSTANCE.getForFilters_EOFCV(), event.getNewValue()));
			if (NonregViewsRepository.TestFilter.testAEOFCV == event.getAffectedEditor())
				command.append(SetCommand.create(liveEditingDomain, forFilters, SubPackageNonRegForFiltersPackage.eINSTANCE.getForFilters_EOFCV(), event.getNewValue()));

				if (!command.isEmpty() && !command.canExecute()) {
					EEFRuntimePlugin.getDefault().logError("Cannot perform model change command.", null);
				} else {
					liveEditingDomain.getCommandStack().execute(command);
				}
			}
			if (valueDiagnostic.getSeverity() != Diagnostic.OK && valueDiagnostic instanceof BasicDiagnostic)
				super.firePropertiesChanged(new PropertiesValidationEditionEvent(event, valueDiagnostic));
			else {
				Diagnostic validate = validate();
				super.firePropertiesChanged(new PropertiesValidationEditionEvent(event, validate));
			}
			super.firePropertiesChanged(event);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public Diagnostic validateValue(IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			String newStringValue = event.getNewValue().toString();
			try {
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validate()
	 * 
	 */
	public Diagnostic validate() {
		Diagnostic validate = Diagnostic.OK_INSTANCE;
		if (IPropertiesEditionComponent.BATCH_MODE.equals(editing_mode)) {
			EObject copy = EcoreUtil.copy(forFilters);
			copy = getPropertiesEditionObject(copy);
			validate =  EEFRuntimePlugin.getEEFValidator().validate(copy);
		}
		else if (IPropertiesEditionComponent.LIVE_MODE.equals(editing_mode))
			validate = EEFRuntimePlugin.getEEFValidator().validate(forFilters);
		// Start of user code for custom validation check
		
		// End of user code
		return validate;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#dispose()
	 * 
	 */
	public void dispose() {
		if (semanticAdapter != null)
			forFilters.eAdapters().remove(semanticAdapter);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#getTabText(java.lang.String)
	 * 
	 */
	public String getTabText(String p_key) {
		return testFilterPart.getTitle();
	}
}
