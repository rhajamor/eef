/**
 *  Copyright (c) 2008-2009 Obeo.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *      Obeo - initial API and implementation
 * 
 *
 * $Id: StandardElementBindingPropertiesEditionPartImpl.java,v 1.3 2009/05/05 12:07:30 sbouchet Exp $
 */
package org.eclipse.emf.eef.mapping.parts.impl;

// Start of user code for imports

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.mapping.ModelElement;
import org.eclipse.emf.eef.mapping.parts.MappingViewsRepository;
import org.eclipse.emf.eef.mapping.parts.StandardElementBindingPropertiesEditionPart;
import org.eclipse.emf.eef.mapping.providers.MappingMessages;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.policies.IPropertiesEditionPolicy;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPolicyProvider;
import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.policies.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.services.PropertiesEditionPolicyProviderService;
import org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.views.View;
import org.eclipse.emf.eef.views.ViewsPackage;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

// End of user code
/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 */
public class StandardElementBindingPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, StandardElementBindingPropertiesEditionPart {

	private Text name;
	protected EObjectFlatComboViewer model;
	private EMFListEditUtil viewsEditUtil;
	private ReferencesTable<?> views;




	
	public StandardElementBindingPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}
	
	public Composite createFigure(final Composite parent) {
		view = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		
		createControls(view);
		return view;
	}
	
	public void createControls(Composite view) { 
		createPropertiesGroup(view);
		createBindingGroup(view);
		
		// Start of user code for additional ui definition
		
		// End of user code		
	}

	protected void createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(MappingMessages.StandardElementBindingPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		createNameText(propertiesGroup);
	}
	protected void createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, MappingMessages.StandardElementBindingPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(MappingViewsRepository.StandardElementBinding.name, MappingViewsRepository.SWT_KIND));
		name = new Text(parent, SWT.BORDER);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addModifyListener(new ModifyListener() {

			/*
			 * (non-Javadoc)
			 * 
			 * @see org.eclipse.swt.events.ModifyListener#modifyText(org.eclipse.swt.events.ModifyEvent)
			 */
			public void modifyText(ModifyEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StandardElementBindingPropertiesEditionPartImpl.this, MappingViewsRepository.StandardElementBinding.name, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, name.getText()));
			}
			
		});

		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(MappingViewsRepository.StandardElementBinding.name, MappingViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}
	protected void createBindingGroup(Composite parent) {
		Group bindingGroup = new Group(parent, SWT.NONE);
		bindingGroup.setText(MappingMessages.StandardElementBindingPropertiesEditionPart_BindingGroupLabel);
		GridData bindingGroupData = new GridData(GridData.FILL_HORIZONTAL);
		bindingGroupData.horizontalSpan = 3;
		bindingGroup.setLayoutData(bindingGroupData);
		GridLayout bindingGroupLayout = new GridLayout();
		bindingGroupLayout.numColumns = 3;
		bindingGroup.setLayout(bindingGroupLayout);
		createModelFlatComboViewer(bindingGroup);
		createViewsReferencesTable(bindingGroup);
	}
	/**
	 * @param bindingGroup
	 */
	protected void createModelFlatComboViewer(Composite parent) {

		SWTUtils.createPartLabel(parent, MappingMessages.StandardElementBindingPropertiesEditionPart_ModelLabel, propertiesEditionComponent.isRequired(MappingViewsRepository.StandardElementBinding.model, MappingViewsRepository.SWT_KIND));
		model = new EObjectFlatComboViewer(parent, false);
		model.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		
		// Start of user code for model filters initialisation

 		// End of user code		
		model.addFilter(new ViewerFilter() {

			/*
			 * (non-Javadoc)
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof ModelElement);
			}

		});
		model.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StandardElementBindingPropertiesEditionPartImpl.this, MappingViewsRepository.StandardElementBinding.model, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getModel()));
			}

		});
		GridData modelData = new GridData(GridData.FILL_HORIZONTAL);
		model.setLayoutData(modelData);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(MappingViewsRepository.StandardElementBinding.model, MappingViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}
	protected void createViewsReferencesTable(Composite parent) {
		this.views = new ReferencesTable<View>(MappingMessages.StandardElementBindingPropertiesEditionPart_ViewsLabel, new ReferencesTableListener<View>() {
			public void handleAdd() {
				ViewerFilter viewsFilter = new EObjectFilter(ViewsPackage.eINSTANCE.getView());
				ViewerFilter viewerFilter = new ViewerFilter() {

					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!viewsEditUtil.contains((EObject)element));
						return false;
					}

				};
				List filters = new ArrayList();
				filters.add(viewsFilter);
				filters.add(viewerFilter);
				TabElementTreeSelectionDialog<View> dialog = new TabElementTreeSelectionDialog<View>(resourceSet, filters,
				"View", ViewsPackage.eINSTANCE.getView()) {

					public void process(IStructuredSelection selection) {
						for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
							EObject elem = (EObject) iter.next();
							if (!viewsEditUtil.getVirtualList().contains(elem))
								viewsEditUtil.addElement(elem);
							propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StandardElementBindingPropertiesEditionPartImpl.this, MappingViewsRepository.StandardElementBinding.views,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
						}
						views.refresh();
					}

				};
				dialog.open();
			}
			public void handleEdit(View element) { editViews(element); }
			public void handleMove(View element, int oldIndex, int newIndex) { moveViews(element, oldIndex, newIndex); }
			public void handleRemove(View element) { removeFromViews(element); }
			public void navigateTo(View element) { }
		});
		this.views.setHelpText(propertiesEditionComponent.getHelpContent(MappingViewsRepository.StandardElementBinding.views, MappingViewsRepository.SWT_KIND));
		this.views.createControls(parent);
		GridData viewsData = new GridData(GridData.FILL_HORIZONTAL);
		viewsData.horizontalSpan = 3;
		this.views.setLayoutData(viewsData);
		this.views.disableMove();
	}
	
	/**
	 * 
	 */
	private void moveViews(View element, int oldIndex, int newIndex) {
		EObject editedElement = viewsEditUtil.foundCorrespondingEObject(element);
		viewsEditUtil.moveElement(element, oldIndex, newIndex);
		views.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StandardElementBindingPropertiesEditionPartImpl.this, MappingViewsRepository.StandardElementBinding.views, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));
	}
	
	/**
	 * 
	 */
	private void removeFromViews(View element) {

		// Start of user code for the removeFromViews() method body

		EObject editedElement = viewsEditUtil.foundCorrespondingEObject(element);
		viewsEditUtil.removeElement(element);
		views.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StandardElementBindingPropertiesEditionPartImpl.this, MappingViewsRepository.StandardElementBinding.views, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, editedElement));

		// End of user code
	}

	/**
	 * 
	 */
	private void editViews(View element) {

		// Start of user code editViews() method body
				 
		EObject editedElement = viewsEditUtil.foundCorrespondingEObject(element);
		IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
		IPropertiesEditionPolicy editionPolicy = policyProvider	.getEditionPolicy(editedElement);
		if (editionPolicy != null) {
			EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
			if (propertiesEditionObject != null) {
				viewsEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
				views.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StandardElementBindingPropertiesEditionPartImpl.this, MappingViewsRepository.StandardElementBinding.views, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
			}
		}

		// End of user code
	}

	
	public void firePropertiesChanged(PropertiesEditionEvent event) {
		// Start of user code for tab synchronization
		
		// End of user code		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.mapping.parts.StandardElementBindingPropertiesEditionPart#getName()
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.mapping.parts.StandardElementBindingPropertiesEditionPart#setName(String newValue)
	 */
	public void setName(String newValue) {
		name.setText(newValue);
	}

	public void setMessageForName(String msg, int msgLevel) {

	}

	public void unsetMessageForName() {

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.mapping.parts.StandardElementBindingPropertiesEditionPart#getModel()
	 */
	public EObject getModel() {
		if (model.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) model.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.mapping.parts.StandardElementBindingPropertiesEditionPart#initModel(ResourceSet allResources, EObject current)
	 */
	public void initModel(ResourceSet allResources, EObject current) {
		model.setInput(allResources);
		if (current != null)
			model.setSelection(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.mapping.parts.StandardElementBindingPropertiesEditionPart#setModel(EObject newValue)
	 */
	public void setModel(EObject newValue) {
		if (newValue != null)
			model.setSelection(new StructuredSelection(newValue));
		else
			model.setSelection(new StructuredSelection("")); //$NON-NLS-1$
	}

	public void setMessageForModel(String msg, int msgLevel) {

	}

	public void unsetMessageForModel() {

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.mapping.parts.StandardElementBindingPropertiesEditionPart#getViewsToAdd()
	 */
	public List getViewsToAdd() {
		return viewsEditUtil.getElementsToAdd();
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.mapping.parts.StandardElementBindingPropertiesEditionPart#getViewsToRemove()
	 */
	public List getViewsToRemove() {
		return viewsEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.mapping.parts.StandardElementBindingPropertiesEditionPart#initViews(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initViews(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			viewsEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			viewsEditUtil = new EMFListEditUtil(current, feature);
		this.views.setInput(viewsEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.mapping.parts.StandardElementBindingPropertiesEditionPart#updateViews(EObject newValue)
	 */
	public void updateViews(EObject newValue) {
		if(viewsEditUtil!=null){
			viewsEditUtil.reinit(newValue);
			views.refresh();
		}
	}

	public void setMessageForViews(String msg, int msgLevel) {

	}

	public void unsetMessageForViews() {

	}








	// Start of user code additional methods
 	
	// End of user code
}
