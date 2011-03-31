/*******************************************************************************
 * Copyright (c) 2008, 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.runtime.tests.ui.properties.section;

import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.eef.runtime.api.adapters.SemanticAdapter;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener;
import org.eclipse.emf.eef.runtime.context.impl.DomainPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.viewers.PropertiesEditionContentProvider;
import org.eclipse.emf.eef.runtime.ui.viewers.PropertiesEditionMessageManager;
import org.eclipse.emf.eef.runtime.ui.viewers.PropertiesEditionViewer;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.viewers.IFilter;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.views.properties.tabbed.AbstractPropertySection;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 */
public class EEFReflectiveEditionSection extends AbstractPropertySection implements IFilter, IPropertiesEditionListener {

	/**
	 * the property sheet page for this section.
	 */
//	private TabbedPropertySheetPage propertySheetPage;

	/**
	 * the section's parent
	 */
	protected Composite parent;

	/**
	 * The section's viewer
	 */
	protected PropertiesEditionViewer viewer;

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
	protected List eObjectList;

	/**
	 * The form containing the viewer
	 */
	private Form scrolledForm;

	/**
     * Manager for error message
     */
	private PropertiesEditionMessageManager messageManager;

	/**
	 * global register edition provider
	 */
	private AdapterFactory adapterFactory;
	
	private IPropertiesEditionComponent propertiesEditionComponent;

	/**
	 * @return the associated ProviderEditionProvider
	 */
	public PropertiesEditingProvider getProvider(EObject eObject) {
		return (PropertiesEditingProvider) getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
	}


	/**
	 * 
	 */
	private AdapterFactory getAdapterFactory() {
		if (adapterFactory == null)
			adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		return adapterFactory;
	}


	/**
	 * @see org.eclipse.ui.views.properties.tabbed.ISection#createControls(org.eclipse.swt.widgets.Composite,
	 *      org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage)
	 */
	public void createControls(Composite parent, TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);
//		this.propertySheetPage = aTabbedPropertySheetPage;
		this.parent = parent;
		scrolledForm = getWidgetFactory().createForm(parent);
		scrolledForm.getBody().setLayout(new GridLayout());		
		scrolledForm.getBody().setLayoutData(new GridData(GridData.FILL_BOTH));
		Composite container = getWidgetFactory().createComposite(scrolledForm.getBody());
		GridLayout containerLayout = new GridLayout();
		container.setLayout(containerLayout);
		container.setLayoutData(new GridData(GridData.FILL_BOTH));
		getWidgetFactory().decorateFormHeading(scrolledForm);
		viewer = new PropertiesEditionViewer(container, null, SWT.NONE, 1);
		viewer.setToolkit(getWidgetFactory());
		viewer.setDynamicTabHeader(true);
		getWidgetFactory().decorateFormHeading(scrolledForm);
		messageManager = new PropertiesEditionMessageManager() {

			@Override
			protected void updateStatus(String message) {
				if (message != null)
					scrolledForm.setMessage(message, IMessageProvider.ERROR);
				else
					scrolledForm.setMessage(""); //$NON-NLS-1$
			}
		};
	}

	/**
	 * @see org.eclipse.ui.views.properties.tabbed.ISection#setInput(org.eclipse.ui.IWorkbenchPart,
	 *      org.eclipse.jface.viewers.ISelection)
	 */
	public void setInput(IWorkbenchPart part, ISelection selection) {
		super.setInput(part, selection);
		initializeEditingDomain(part);
		PropertiesEditionContentProvider propertiesEditionContentProvider = new PropertiesEditionContentProvider(getAdapterFactory(), IPropertiesEditionComponent.LIVE_MODE, editingDomain);
		viewer.setContentProvider(propertiesEditionContentProvider);
		if (!(selection instanceof IStructuredSelection)) {
			return;
		}
		if (resolveSemanticObject(((IStructuredSelection)selection).getFirstElement()) != null) {
			EObject newEObject = resolveSemanticObject(((IStructuredSelection)selection).getFirstElement());
			if (newEObject != eObject) {
				eObject = newEObject;
				if (eObject != null) {
					disposeComponent();
					viewer.setInput(new DomainPropertiesEditionContext(null, null, editingDomain, adapterFactory, eObject));
				}
			}
		}
		eObjectList = ((IStructuredSelection)selection).toList();
	}

	private void disposeComponent() {
		if (propertiesEditionComponent != null) {
			propertiesEditionComponent.dispose();
		}
	}

	private void initializeEditingDomain(IWorkbenchPart part) {
		if (part instanceof ITabbedPropertySheetPageContributor) {
			ITabbedPropertySheetPageContributor editor = (ITabbedPropertySheetPageContributor)part;
			if (editor instanceof IEditorPart) {
				if (editor instanceof IEditingDomainProvider)
					editingDomain = ((IEditingDomainProvider)editor).getEditingDomain();
				else if ((((IEditorPart)editor).getAdapter(IEditingDomainProvider.class)) != null)
					editingDomain = ((IEditingDomainProvider)((IEditorPart)editor)
							.getAdapter(IEditingDomainProvider.class)).getEditingDomain();
				else if ((((IEditorPart)editor).getAdapter(EditingDomain.class)) != null)
					editingDomain = (EditingDomain)((IEditorPart)editor).getAdapter(EditingDomain.class);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.ui.views.properties.tabbed.AbstractPropertySection#dispose()
	 */
	public void dispose() {
		super.dispose();
		disposeComponent();
	}

	/**
	 * @param object
	 * @return
	 */
	private EObject resolveSemanticObject(Object object) {
		if (object instanceof EObject) {
			return (EObject)object;
		} else if (object instanceof IAdaptable) {
			IAdaptable adaptable = (IAdaptable)object;
			if (adaptable.getAdapter(SemanticAdapter.class) != null) {
				SemanticAdapter semanticAdapter = (SemanticAdapter)adaptable
						.getAdapter(SemanticAdapter.class);
				return semanticAdapter.getEObject();
			} else if (adaptable.getAdapter(EObject.class) != null) {
				return (EObject)adaptable.getAdapter(EObject.class);
			}
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.viewers.IFilter#select(java.lang.Object)
	 */
	public boolean select(Object toTest) {
		EObject eObj = resolveSemanticObject(toTest);
		if (eObj != null) {
			return getProvider(eObj) != null;
		}
		return false;
	}

	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		handleChange(event);
	}

	private void handleChange(IPropertiesEditionEvent event) {
		// do not handle changes if you are in initialization.
//		if (viewer.isInitializing())
//			return;
		messageManager.processMessage(event);
	}

}
