/**
 * 
 */
package org.eclipse.emf.eef.ui.section;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;
import org.eclipse.emf.eef.runtime.api.adapters.SemanticAdapter;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.DomainPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.utils.EEFRuntimeUIMessages;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.ISection;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

/**
 * @author glefur
 *
 */
public abstract class PropertiesEditingSection extends CompositePropertiesEditionPart  implements IFormPropertiesEditionPart, ISection {
	
	/**
	 * The tabbed property sheet page
	 */
	private TabbedPropertySheetPage tabbedPropertySheetPage;
	
	/**
	 * The editingDomain where the viewer must perform editing commands.
	 */
	private EditingDomain editingDomain;

	/**
	 * The current selected object or the first object in the selection when multiple objects are selected.
	 */
	protected EObject eObject;

	/**
	 * The list of current selected objects.
	 */
	protected List<?> eObjectList;

	protected Composite container;
	
	private boolean usedAsPropertySection;

	/**
	 * 
	 */
	protected PropertiesEditingSection() {
		super();
		this.usedAsPropertySection = true;
	}	
	
	public PropertiesEditingSection(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
		this.usedAsPropertySection = false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.views.properties.tabbed.ISection#createControls(org.eclipse.swt.widgets.Composite, org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage)
	 */
	@Override
	public void createControls(Composite parent, TabbedPropertySheetPage tabbedPropertySheetPage) {
		this.tabbedPropertySheetPage = tabbedPropertySheetPage;
		this.container = tabbedPropertySheetPage.getWidgetFactory().createComposite(parent);
		container.setLayout(new GridLayout(3, false));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.views.properties.tabbed.ISection#setInput(org.eclipse.ui.IWorkbenchPart, org.eclipse.jface.viewers.ISelection)
	 */
	@Override
	public void setInput(IWorkbenchPart part, ISelection selection) {
		initializeEditingDomain(part);
		if (!(selection instanceof IStructuredSelection)) {
			return;
		}
		if (resolveSemanticObject(((IStructuredSelection)selection).getFirstElement()) != null) {
			EObject newEObject = resolveSemanticObject(((IStructuredSelection)selection).getFirstElement());
			if (newEObject != eObject) {
				eObject = newEObject;
				if (eObject != null) {
					disposeComponent();
					refreshComponent();
				}
			}
		}
		eObjectList = ((IStructuredSelection)selection).toList();
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart#refresh()
	 */
	public void refresh() {
		if (usedAsPropertySection) {
			initSemanticContents();
		} else {
			super.refresh();
		}
	}

	private void initializeEditingDomain(IWorkbenchPart part) {
		editingDomain = EditingUtils.getResourceSetFromEditor(part);
	}

	/**
	 * @param object
	 * @return
	 */
	protected EObject resolveSemanticObject(Object object) {
		if (object instanceof EObject) {
			return (EObject)object;
		} else if (object instanceof IAdaptable) {
			IAdaptable adaptable = (IAdaptable)object;
			if (adaptable.getAdapter(SemanticAdapter.class) != null) {
				SemanticAdapter semanticAdapter = (SemanticAdapter)adaptable.getAdapter(SemanticAdapter.class);
				return semanticAdapter.getEObject();
			} else if (adaptable.getAdapter(EObject.class) != null) {
				return (EObject)adaptable.getAdapter(EObject.class);
			}
		}
		return null;
	}
	
	private void refreshComponent() {
		PropertiesEditingProvider provider = getProvider(eObject);
		if (provider != null) {
			propertiesEditionComponent = provider.getPropertiesEditingComponent(new DomainPropertiesEditionContext(null, null, editingDomain, adapterFactory, eObject), IPropertiesEditionComponent.LIVE_MODE);
			if (propertiesEditionComponent != null) {
				this.adapterFactory = propertiesEditionComponent.getEditingContext().getAdapterFactory();
				propertiesEditionComponent.setPropertiesEditionPart(propertiesEditionComponent.translatePart(getDescriptor()), 0, this);
				propertiesEditionComponent.setLiveEditingDomain(editingDomain);
				propertiesEditionComponent.addListener(this);
				Composite editComposite = this.createFigure(container, tabbedPropertySheetPage.getWidgetFactory());
				if (editComposite != null) {
					editComposite.setLayoutData(new GridData(GridData.FILL_BOTH));
					container.layout();
				}
			}
		}
	}
	
	/**
	 * @param descriptor
	 */
	protected void initSemanticContents() {
		propertiesEditionComponent.initPart(propertiesEditionComponent.translatePart(getDescriptor()), 1, eObject);
	}

	protected PropertiesEditingProvider getProvider(EObject eObject) {
		if (this.adapterFactory == null) {
			adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		}
		return (PropertiesEditingProvider)adapterFactory.adapt(eObject, PropertiesEditingProvider.class);
	}

	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.views.properties.tabbed.ISection#aboutToBeShown()
	 */
	@Override
	public void aboutToBeShown() {
		/* empty default implementation */		
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.views.properties.tabbed.ISection#aboutToBeHidden()
	 */
	@Override
	public void aboutToBeHidden() {
		/* empty default implementation */		
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.views.properties.tabbed.ISection#dispose()
	 */
	@Override
	public void dispose() {
		disposeComponent();
		
	}

	private void disposeComponent() {
		if (propertiesEditionComponent != null) {
			PropertiesEditingContext editingContext = propertiesEditionComponent.getEditingContext();
			if (editingContext != null && editingContext.getParentContext() == null) {
				editingContext.dispose();
			}
			propertiesEditionComponent.dispose();
		}
	}


	/* (non-Javadoc)
	 * @see org.eclipse.ui.views.properties.tabbed.ISection#getMinimumHeight()
	 */
	@Override
	public int getMinimumHeight() {
		return SWT.DEFAULT;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.views.properties.tabbed.ISection#shouldUseExtraSpace()
	 */
	@Override
	public boolean shouldUseExtraSpace() {
		return false;
	}

	
	/**
	 * Magic method For eclipse 3.2 & 3.3 & 3.4 & 3.5
	 * 
	 * @return
	 */
	protected String getDescriptor() {
		Map<?,?> descriptor = getPageDescriptor(tabbedPropertySheetPage);
		for (Iterator<?> iterator = descriptor.keySet().iterator(); iterator.hasNext();) {
			Object key = iterator.next();
			Object tab = descriptor.get(key);
			Method getSectionAtIndex = getMethod(tab, "getSectionAtIndex", int.class); //$NON-NLS-1$
			if (getSectionAtIndex != null) {
				Object result = callMethod(tab, getSectionAtIndex, new Integer(0));
				if (result == this) {
					Method getId = getMethod(key, "getId"); //$NON-NLS-1$
					if (getId != null) {
						String id = (String)callMethod(key, getId);
						return id;
					}
				}
			}
		}
		return ""; //$NON-NLS-1$
	}

	private Map<?, ?> getPageDescriptor(TabbedPropertySheetPage propertySheetPage) {
		Field descriptorToTabField = null;
		boolean oldAccessible = false;
		try {
			Class<?> cls = propertySheetPage.getClass();
			while (!cls.equals(TabbedPropertySheetPage.class)) {
				cls = cls.getSuperclass();
			}
			descriptorToTabField = cls.getDeclaredField("descriptorToTab"); //$NON-NLS-1$
			oldAccessible = descriptorToTabField.isAccessible();
			descriptorToTabField.setAccessible(true);
			return (Map<?,?>)descriptorToTabField.get(propertySheetPage);

		} catch (SecurityException e) {

			EEFRuntimePlugin.getDefault().logError(
					EEFRuntimeUIMessages.PropertiesEditionSection_descriptorToTab_not_found, e);
		} catch (NoSuchFieldException e) {

			EEFRuntimePlugin.getDefault().logError(
					EEFRuntimeUIMessages.PropertiesEditionSection_descriptorToTab_not_found, e);
		} catch (IllegalArgumentException e) {

			EEFRuntimePlugin.getDefault().logError(
					EEFRuntimeUIMessages.PropertiesEditionSection_descriptorToTab_not_found, e);
		} catch (IllegalAccessException e) {

			EEFRuntimePlugin.getDefault().logError(
					EEFRuntimeUIMessages.PropertiesEditionSection_descriptorToTab_not_found, e);
		} finally {
			if (descriptorToTabField != null) {
				descriptorToTabField.setAccessible(oldAccessible);
			}
		}
		return null;
	}

	/**
	 * @param source
	 *            the source object
	 * @param name
	 *            the method to get
	 * @param argsType
	 *            the method arguments type
	 * @return the given method
	 */
	private Method getMethod(Object source, String name, Class<?>... argsType) {
		try {
			return source.getClass().getDeclaredMethod(name, argsType);
		} catch (Exception e) {
			EEFRuntimePlugin.getDefault().logError(
					EEFRuntimeUIMessages.PropertiesEditionSection_method_not_found + name, e);
		}
		return null;
	}

	/**
	 * @param source
	 *            the source object
	 * @param name
	 *            the method to get
	 * @param argsType
	 *            the method arguments type
	 * @return the result of the given method
	 */
	private Object callMethod(Object source, Method method, Object... args) {
		try {
			return method.invoke(source, args);
		} catch (Exception e) {
			EEFRuntimePlugin.getDefault().logError(
					EEFRuntimeUIMessages.PropertiesEditionSection_error_occured_on + method.getName()
							+ EEFRuntimeUIMessages.PropertiesEditionSection_call, e);
		}
		return null;
	}

}
