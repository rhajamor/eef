/**
 * Generated with Acceleo
 */
package org.eclipse.emf.eef.nonreg.components;

// Start of user code for imports
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

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
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.MoveCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.eef.ab.abstractnonreg.AbstractnonregPackage;
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
import org.eclipse.emf.eef.runtime.impl.filters.EObjectStrictFilter;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesValidationEditionEvent;
import org.eclipse.emf.eef.runtime.impl.services.PropertiesEditionPartProviderService;
import org.eclipse.emf.eef.runtime.impl.utils.EEFUtils;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
	

// End of user code

/**
 * 
 * 
 */
public class TestFilterForRVTestFilterPropertiesEditionComponent extends StandardPropertiesEditionComponent {

	
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
	public TestFilterForRVTestFilterPropertiesEditionComponent(EObject forFilters, String editing_mode) {
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
					TestFilterForRVTestFilterPropertiesEditionComponent.this.dispose();
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
		if (SubPackageNonRegForFiltersPackage.eINSTANCE.getForFilters_RT().equals(msg.getFeature()))
			testFilterPart.updateTestART(forFilters);
		if (SubPackageNonRegForFiltersPackage.eINSTANCE.getForFilters_RT().equals(msg.getFeature()))
			testFilterPart.updateTestRT(forFilters);

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
			testFilterPart.initTestART(forFilters, null, SubPackageNonRegForFiltersPackage.eINSTANCE.getForFilters_RT());
			testFilterPart.initTestRT(forFilters, null, SubPackageNonRegForFiltersPackage.eINSTANCE.getForFilters_RT());
			// init filters
			testFilterPart.addFilterToTestART(new ViewerFilter() {

				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!testFilterPart.isContainedInTestARTTable((EObject)element));
					return element instanceof Resource;
				}

			});
			testFilterPart.addFilterToTestART(new EObjectFilter(AbstractnonregPackage.eINSTANCE.getDocumentedElement()));
			testFilterPart.addFilterToTestART(new ViewerFilter() {

				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
return true;
				}

			});
			testFilterPart.addFilterToTestART(new ViewerFilter() {

				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					return methodFilterART(viewer, parentElement, element);
				}

			});
			// OCLFilter not implemented yet
			testFilterPart.addFilterToTestART(new ViewerFilter() {

				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					Object result = EEFUtils.choiceOfValues(TestFilterForRVTestFilterPropertiesEditionComponent.this.forFilters, NonregPackage.eINSTANCE.getPerson_Assists());
					if (result instanceof Collection) {
						return ((Collection)result).contains(element);
					} else if (result instanceof ResourceSet && element instanceof EObject) {
						return ((EObject)element).eResource() != null && ((EObject)element).eResource().getResourceSet() != null && ((EObject)element).eResource().getResourceSet().equals(result);
					}
					return element instanceof Resource;
				}
			});
			// Start of user code for additional businessfilters for testFilterFORART
			
			// End of user code

			testFilterPart.addFilterToTestRT(new ViewerFilter() {

				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!testFilterPart.isContainedInTestRTTable((EObject)element));
					return element instanceof String && element.equals("");
				}

			});
			testFilterPart.addFilterToTestRT(new EObjectStrictFilter(AbstractnonregPackage.eINSTANCE.getDocumentedElement()));
			testFilterPart.addFilterToTestRT(new ViewerFilter() {

				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
return true;
				}

			});
			testFilterPart.addFilterToTestRT(new ViewerFilter() {

				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					return methodFilterRT(viewer, parentElement, element);
				}

			});
			// OCLFilter not implemented yet
			testFilterPart.addFilterToTestRT(new ViewerFilter() {

				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					Object result = EEFUtils.choiceOfValues(TestFilterForRVTestFilterPropertiesEditionComponent.this.forFilters, NonregPackage.eINSTANCE.getPerson_Assists());
					if (result instanceof Collection) {
						return ((Collection)result).contains(element);
					} else if (result instanceof ResourceSet && element instanceof EObject) {
						return ((EObject)element).eResource() != null && ((EObject)element).eResource().getResourceSet() != null && ((EObject)element).eResource().getResourceSet().equals(result);
					}
					return element instanceof Resource;
				}
			});
			// Start of user code for additional businessfilters for testFilterFORRT
			
			// End of user code

		}
		// init values for referenced views

		// init filters for referenced views

		setInitializing(false);
	}

	/**
	 * 
	 */
	private boolean methodFilterART(Viewer viewer, Object parentElement, Object element){
		// Start of user code for user filter methodFilterART
		return true;
		// End of user code
	}

	/**
	 * 
	 */
	private boolean methodFilterRT(Viewer viewer, Object parentElement, Object element){
		// Start of user code for user filter methodFilterRT
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
			List rTToAddFromTestART = testFilterPart.getTestARTToAdd();
			for (Iterator iter = rTToAddFromTestART.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, forFilters, SubPackageNonRegForFiltersPackage.eINSTANCE.getForFilters_RT(), iter.next()));
			List rTToRemoveFromTestART = testFilterPart.getTestARTToRemove();
			for (Iterator iter = rTToRemoveFromTestART.iterator(); iter.hasNext();)
				cc.append(RemoveCommand.create(editingDomain, forFilters, SubPackageNonRegForFiltersPackage.eINSTANCE.getForFilters_RT(), iter.next()));
			//List rTToMoveFromTestART = testFilterPart.getTestARTToMove();
			//for (Iterator iter = rTToMoveFromTestART.iterator(); iter.hasNext();){
			//	org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement moveElement = (org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement)iter.next();
			//	cc.append(MoveCommand.create(editingDomain, forFilters, SubPackageNonRegForFiltersPackage.eINSTANCE.getDocumentedElement(), moveElement.getElement(), moveElement.getIndex()));
			//}
			List rTToAddFromTestRT = testFilterPart.getTestRTToAdd();
			for (Iterator iter = rTToAddFromTestRT.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, forFilters, SubPackageNonRegForFiltersPackage.eINSTANCE.getForFilters_RT(), iter.next()));
			List rTToRemoveFromTestRT = testFilterPart.getTestRTToRemove();
			for (Iterator iter = rTToRemoveFromTestRT.iterator(); iter.hasNext();)
				cc.append(RemoveCommand.create(editingDomain, forFilters, SubPackageNonRegForFiltersPackage.eINSTANCE.getForFilters_RT(), iter.next()));
			//List rTToMoveFromTestRT = testFilterPart.getTestRTToMove();
			//for (Iterator iter = rTToMoveFromTestRT.iterator(); iter.hasNext();){
			//	org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement moveElement = (org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement)iter.next();
			//	cc.append(MoveCommand.create(editingDomain, forFilters, SubPackageNonRegForFiltersPackage.eINSTANCE.getDocumentedElement(), moveElement.getElement(), moveElement.getIndex()));
			//}

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
			forFiltersToUpdate.getRT().addAll(testFilterPart.getTestARTToAdd());
			forFiltersToUpdate.getRT().addAll(testFilterPart.getTestRTToAdd());

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
			if (NonregViewsRepository.TestFilter.testART == event.getAffectedEditor()) {
				if (PropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, forFilters, SubPackageNonRegForFiltersPackage.eINSTANCE.getForFilters_RT(), event.getNewValue()));
				if (PropertiesEditionEvent.REMOVE == event.getKind())
					command.append(RemoveCommand.create(liveEditingDomain, forFilters, SubPackageNonRegForFiltersPackage.eINSTANCE.getForFilters_RT(), event.getNewValue()));
				if (PropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, forFilters, SubPackageNonRegForFiltersPackage.eINSTANCE.getForFilters_RT(), event.getNewValue(), event.getNewIndex()));
			}
			if (NonregViewsRepository.TestFilter.testRT == event.getAffectedEditor()) {
				if (PropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, forFilters, SubPackageNonRegForFiltersPackage.eINSTANCE.getForFilters_RT(), event.getNewValue()));
				if (PropertiesEditionEvent.REMOVE == event.getKind())
					command.append(RemoveCommand.create(liveEditingDomain, forFilters, SubPackageNonRegForFiltersPackage.eINSTANCE.getForFilters_RT(), event.getNewValue()));
				if (PropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, forFilters, SubPackageNonRegForFiltersPackage.eINSTANCE.getForFilters_RT(), event.getNewValue(), event.getNewIndex()));
			}

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
