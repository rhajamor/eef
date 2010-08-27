/**
 * Generated with Acceleo
 */
package org.eclipse.emf.eef.nonreg.components;

// Start of user code for imports
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
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.eef.nonreg.modelNavigation.ModelNavigationFactory;
import org.eclipse.emf.eef.nonreg.modelNavigation.ModelNavigationPackage;
import org.eclipse.emf.eef.nonreg.modelNavigation.RealCible;
import org.eclipse.emf.eef.nonreg.modelNavigation.Source;
import org.eclipse.emf.eef.nonreg.modelNavigation.SuperCible;
import org.eclipse.emf.eef.nonreg.parts.NonregViewsRepository;
import org.eclipse.emf.eef.nonreg.parts.SourcePropertiesEditionPart;
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
public class SimpleSourcePropertiesEditionComponent extends StandardPropertiesEditionComponent {

	
	public static String SOURCE_PART = "Source"; //$NON-NLS-1$

	
	private String[] parts = {SOURCE_PART};

	/**
	 * The EObject to edit
	 * 
	 */
	private Source source;

	/**
	 * The Source part
	 * 
	 */
	protected SourcePropertiesEditionPart sourcePart;

	/**
	 * Default constructor
	 * 
	 */
	public SimpleSourcePropertiesEditionComponent(EObject source, String editing_mode) {
		if (source instanceof Source) {
			this.source = (Source)source;
			if (IPropertiesEditionComponent.LIVE_MODE.equals(editing_mode)) {
				semanticAdapter = initializeSemanticAdapter();
				this.source.eAdapters().add(semanticAdapter);
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
				if (sourcePart == null)
					SimpleSourcePropertiesEditionComponent.this.dispose();
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
							if (ModelNavigationPackage.eINSTANCE.getSource_UniqueRef().equals(msg.getFeature())) {
								if (source.getUniqueRef() instanceof RealCible)
									sourcePart.setAdvancedUniqueRef(((RealCible)source.getUniqueRef()).getRef());
								else
									sourcePart.setAdvancedUniqueRef(null);
							}
							if (ModelNavigationPackage.eINSTANCE.getSource_MultipleContainment().equals(msg.getFeature())) {
								sourcePart.updateAdvancedMultipleContainment(source);
							}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#translatePart(java.lang.String)
	 * 
	 */
	public java.lang.Class translatePart(String key) {
		if (SOURCE_PART.equals(key))
			return NonregViewsRepository.Source.class;
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
		if (source != null && SOURCE_PART.equals(key)) {
			if (sourcePart == null) {
				IPropertiesEditionPartProvider provider = PropertiesEditionPartProviderService.getInstance().getProvider(NonregViewsRepository.class);
				if (provider != null) {
					sourcePart = (SourcePropertiesEditionPart)provider.getPropertiesEditionPart(NonregViewsRepository.Source.class, kind, this);
					addListener((IPropertiesEditionListener)sourcePart);
				}
			}
			return (IPropertiesEditionPart)sourcePart;
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
		if (key == NonregViewsRepository.Source.class)
			this.sourcePart = (SourcePropertiesEditionPart) propertiesEditionPart;
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
		if (sourcePart != null && key == NonregViewsRepository.Source.class) {
			((IPropertiesEditionPart)sourcePart).setContext(elt, allResource);
			final Source source = (Source)elt;
			// init values
			// init part
			if (source.getUniqueRef() instanceof RealCible)
				sourcePart.initAdvancedUniqueRef(allResource, ((RealCible)source.getUniqueRef()).getRef());
			else
				sourcePart.initAdvancedUniqueRef(allResource, null);
			// set the button mode
			sourcePart.setAdvancedUniqueRefButtonMode(ButtonsModeEnum.BROWSE);
			sourcePart.initAdvancedMultipleContainment(source, ModelNavigationPackage.eINSTANCE.getSource_MultipleContainment(), ModelNavigationPackage.eINSTANCE.getRealCible_Ref());
			// init filters
			sourcePart.addFilterToAdvancedUniqueRef(new EObjectFilter(ModelNavigationPackage.eINSTANCE.getSuperCible()));
			sourcePart.addFilterToAdvancedMultipleContainment(new ViewerFilter() {

				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!sourcePart.isContainedInAdvancedMultipleContainmentTable((EObject)element));
					return element instanceof Resource;
				}

			});
			sourcePart.addFilterToAdvancedMultipleContainment(new EObjectFilter(ModelNavigationPackage.eINSTANCE.getSuperCible()));
			// Start of user code for additional businessfilters for AvancedMultipleContainment
			
			// End of user code

		}
		// init values for referenced views

		// init filters for referenced views

		setInitializing(false);
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
		if ((source != null) && (sourcePart != null)) { 
			if (sourcePart.getAdvancedUniqueRef() == null) {
				cc.append(SetCommand.create(editingDomain, source, ModelNavigationPackage.eINSTANCE.getSource_UniqueRef(), null));
			} else if (source.eGet(ModelNavigationPackage.eINSTANCE.getSource_UniqueRef()) == null || !source.eGet(ModelNavigationPackage.eINSTANCE.getSource_UniqueRef()).equals(sourcePart.getAdvancedUniqueRef())) {
				RealCible realCible = ModelNavigationFactory.eINSTANCE.createRealCible();
				cc.append(SetCommand.create(editingDomain, realCible, ModelNavigationPackage.eINSTANCE.getRealCible_Ref(), sourcePart.getAdvancedUniqueRef()));
				cc.append(SetCommand.create(editingDomain, source, ModelNavigationPackage.eINSTANCE.getSource_UniqueRef(), realCible));
			}
			List refToAddFromAdvancedMultipleContainment = sourcePart.getAdvancedMultipleContainmentToAdd();
			for (Iterator iter = refToAddFromAdvancedMultipleContainment.iterator(); iter.hasNext();) {
				RealCible realCible = ModelNavigationFactory.eINSTANCE.createRealCible();
				cc.append(SetCommand.create(editingDomain, realCible, ModelNavigationPackage.eINSTANCE.getRealCible_Ref(), iter.next()));
				cc.append(AddCommand.create(editingDomain, source, ModelNavigationPackage.eINSTANCE.getSource_MultipleContainment(), realCible));
			}
			List realCibleToRemoveFromAdvancedMultipleContainment = sourcePart.getAdvancedMultipleContainmentToRemove();
			for (Iterator iter = realCibleToRemoveFromAdvancedMultipleContainment.iterator(); iter.hasNext();) {
				cc.append(RemoveCommand.create(editingDomain, iter.next()));
			}
			//List refToMoveFromAdvancedMultipleContainment = sourcePart.getAdvancedMultipleContainmentToMove();
			//for (Iterator iter = refToMoveFromAdvancedMultipleContainment.iterator(); iter.hasNext();){
			//	org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement moveElement = (org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement)iter.next();
			//	cc.append(MoveCommand.create(editingDomain, source, ModelNavigationPackage.eINSTANCE.getSuperCible(), moveElement.getElement(), moveElement.getIndex()));
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
		if (source instanceof Source) {
			Source sourceToUpdate = (Source)source;
			SuperCible refFromAdvancedUniqueRef = (SuperCible)sourcePart.getAdvancedUniqueRef();
			RealCible realCibleFromAdvancedUniqueRef = ModelNavigationFactory.eINSTANCE.createRealCible();
			realCibleFromAdvancedUniqueRef.setRef(refFromAdvancedUniqueRef);
			sourceToUpdate.setUniqueRef(realCibleFromAdvancedUniqueRef);
			for (Iterator iter = sourcePart.getAdvancedMultipleContainmentTable().iterator(); iter.hasNext();) {
				SuperCible ref = (SuperCible)iter.next();
				RealCible realCible = ModelNavigationFactory.eINSTANCE.createRealCible();
				realCible.setRef(ref);
				sourceToUpdate.getMultipleContainment().add(realCible);
			}

			return sourceToUpdate;
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
			if (NonregViewsRepository.Source.advancedUniqueRef == event.getAffectedEditor()) {
				if (PropertiesEditionEvent.SET == event.getKind() && event.getNewValue() != null) {
					RealCible realCible = ModelNavigationFactory.eINSTANCE.createRealCible();
					command.append(SetCommand.create(liveEditingDomain, realCible, ModelNavigationPackage.eINSTANCE.getRealCible_Ref(), event.getNewValue()));
					command.append(SetCommand.create(liveEditingDomain, source, ModelNavigationPackage.eINSTANCE.getSource_UniqueRef(), realCible));
				}
				if (PropertiesEditionEvent.SET == event.getKind() && event.getNewValue() == null) {
					command.append(RemoveCommand.create(liveEditingDomain, source.getUniqueRef()));
					command.append(SetCommand.create(liveEditingDomain, source, ModelNavigationPackage.eINSTANCE.getSource_UniqueRef(), null));
				}
			}
		if (NonregViewsRepository.Source.advancedMultipleContainment == event.getAffectedEditor()) {
			if (PropertiesEditionEvent.ADD == event.getKind()) {
				RealCible realCible = ModelNavigationFactory.eINSTANCE.createRealCible();
				command.append(SetCommand.create(liveEditingDomain, realCible, ModelNavigationPackage.eINSTANCE.getRealCible_Ref(), event.getNewValue()));
				command.append(AddCommand.create(liveEditingDomain, source, ModelNavigationPackage.eINSTANCE.getSource_MultipleContainment(), realCible));
			}
			if (PropertiesEditionEvent.REMOVE == event.getKind()){
				command.append(RemoveCommand.create(liveEditingDomain, event.getNewValue()));
			}
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
			EObject copy = EcoreUtil.copy(source);
			copy = getPropertiesEditionObject(copy);
			validate =  EEFRuntimePlugin.getEEFValidator().validate(copy);
		}
		else if (IPropertiesEditionComponent.LIVE_MODE.equals(editing_mode))
			validate = EEFRuntimePlugin.getEEFValidator().validate(source);
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
			source.eAdapters().remove(semanticAdapter);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#getTabText(java.lang.String)
	 * 
	 */
	public String getTabText(String p_key) {
		return sourcePart.getTitle();
	}
}
