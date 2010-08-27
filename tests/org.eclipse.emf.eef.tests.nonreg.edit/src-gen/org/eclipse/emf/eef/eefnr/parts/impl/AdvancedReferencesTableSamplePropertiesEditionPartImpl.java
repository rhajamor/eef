/*******************************************************************************
 * Copyright (c) 2009 - 2010 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.eefnr.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.eef.eefnr.EefnrPackage;
import org.eclipse.emf.eef.eefnr.TotalSample;
import org.eclipse.emf.eef.eefnr.parts.AdvancedReferencesTableSamplePropertiesEditionPart;
import org.eclipse.emf.eef.eefnr.parts.EefnrViewsRepository;
import org.eclipse.emf.eef.eefnr.providers.EefnrMessages;
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
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;



// End of user code	

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class AdvancedReferencesTableSamplePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, AdvancedReferencesTableSamplePropertiesEditionPart {

	protected EMFListEditUtil advancedreferencestableRequiredPropertyEditUtil;
	protected ReferencesTable<? extends EObject> advancedreferencestableRequiredProperty;
	protected List<ViewerFilter> advancedreferencestableRequiredPropertyBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> advancedreferencestableRequiredPropertyFilters = new ArrayList<ViewerFilter>();
	protected EMFListEditUtil advancedreferencestableOptionalPropertyEditUtil;
	protected ReferencesTable<? extends EObject> advancedreferencestableOptionalProperty;
	protected List<ViewerFilter> advancedreferencestableOptionalPropertyBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> advancedreferencestableOptionalPropertyFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public AdvancedReferencesTableSamplePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createFigure(org.eclipse.swt.widgets.Composite)
	 * 
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
	 * 
	 */
	public void createControls(Composite view) { 
		createPropertiesGroup(view);


		// Start of user code for additional ui definition
		
		// End of user code
	}

	/**
	 * 
	 */
	protected void createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(EefnrMessages.AdvancedReferencesTableSamplePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		createAdvancedreferencestableRequiredPropertyAdvancedReferencesTable(propertiesGroup);
		createAdvancedreferencestableOptionalPropertyAdvancedReferencesTable(propertiesGroup);
	}

	/**
	 * 
	 */
	protected void createAdvancedreferencestableRequiredPropertyAdvancedReferencesTable(Composite parent) {
		this.advancedreferencestableRequiredProperty = new ReferencesTable<TotalSample>(EefnrMessages.AdvancedReferencesTableSamplePropertiesEditionPart_AdvancedreferencestableRequiredPropertyLabel, new ReferencesTableListener<TotalSample>() {
			public void handleAdd() {
				TabElementTreeSelectionDialog<TotalSample> dialog = new TabElementTreeSelectionDialog<TotalSample>(resourceSet, advancedreferencestableRequiredPropertyFilters, advancedreferencestableRequiredPropertyBusinessFilters,
				"TotalSample", EefnrPackage.eINSTANCE.getTotalSample(), current.eResource()) {

					public void process(IStructuredSelection selection) {
						for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
							EObject elem = (EObject) iter.next();
							if (!advancedreferencestableRequiredPropertyEditUtil.getVirtualList().contains(elem))
								advancedreferencestableRequiredPropertyEditUtil.addElement(elem);
							propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AdvancedReferencesTableSamplePropertiesEditionPartImpl.this, EefnrViewsRepository.AdvancedReferencesTableSample.advancedreferencestableRequiredProperty,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
						}
						advancedreferencestableRequiredProperty.refresh();
					}

				};
				dialog.open();
			}
			public void handleEdit(TotalSample element) { editAdvancedreferencestableRequiredProperty(element); }
			public void handleMove(TotalSample element, int oldIndex, int newIndex) { moveAdvancedreferencestableRequiredProperty(element, oldIndex, newIndex); }
			public void handleRemove(TotalSample element) { removeFromAdvancedreferencestableRequiredProperty(element); }
			public void navigateTo(TotalSample element) { }
		});
		this.advancedreferencestableRequiredProperty.setHelpText(propertiesEditionComponent.getHelpContent(EefnrViewsRepository.AdvancedReferencesTableSample.advancedreferencestableRequiredProperty, EefnrViewsRepository.SWT_KIND));
		this.advancedreferencestableRequiredProperty.createControls(parent);
		GridData advancedreferencestableRequiredPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		advancedreferencestableRequiredPropertyData.horizontalSpan = 3;
		this.advancedreferencestableRequiredProperty.setLayoutData(advancedreferencestableRequiredPropertyData);
		this.advancedreferencestableRequiredProperty.disableMove();
	}

	/**
	 * 
	 */
	protected void moveAdvancedreferencestableRequiredProperty(TotalSample element, int oldIndex, int newIndex) {
		EObject editedElement = advancedreferencestableRequiredPropertyEditUtil.foundCorrespondingEObject(element);
		advancedreferencestableRequiredPropertyEditUtil.moveElement(element, oldIndex, newIndex);
		advancedreferencestableRequiredProperty.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AdvancedReferencesTableSamplePropertiesEditionPartImpl.this, EefnrViewsRepository.AdvancedReferencesTableSample.advancedreferencestableRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));
	}

	/**
	 * 
	 */
	protected void removeFromAdvancedreferencestableRequiredProperty(TotalSample element) {
		// Start of user code removeFromAdvancedreferencestableRequiredProperty() method body
				EObject editedElement = advancedreferencestableRequiredPropertyEditUtil.foundCorrespondingEObject(element);
				advancedreferencestableRequiredPropertyEditUtil.removeElement(element);
				advancedreferencestableRequiredProperty.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AdvancedReferencesTableSamplePropertiesEditionPartImpl.this, EefnrViewsRepository.AdvancedReferencesTableSample.advancedreferencestableRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, editedElement));
				
		// End of user code
	}

	/**
	 * 
	 */
	protected void editAdvancedreferencestableRequiredProperty(TotalSample element) {
		// Start of user code editAdvancedreferencestableRequiredProperty() method body
				EObject editedElement = advancedreferencestableRequiredPropertyEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						advancedreferencestableRequiredPropertyEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						advancedreferencestableRequiredProperty.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AdvancedReferencesTableSamplePropertiesEditionPartImpl.this, EefnrViewsRepository.AdvancedReferencesTableSample.advancedreferencestableRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
				
		// End of user code
	}

	/**
	 * 
	 */
	protected void createAdvancedreferencestableOptionalPropertyAdvancedReferencesTable(Composite parent) {
		this.advancedreferencestableOptionalProperty = new ReferencesTable<TotalSample>(EefnrMessages.AdvancedReferencesTableSamplePropertiesEditionPart_AdvancedreferencestableOptionalPropertyLabel, new ReferencesTableListener<TotalSample>() {
			public void handleAdd() {
				TabElementTreeSelectionDialog<TotalSample> dialog = new TabElementTreeSelectionDialog<TotalSample>(resourceSet, advancedreferencestableOptionalPropertyFilters, advancedreferencestableOptionalPropertyBusinessFilters,
				"TotalSample", EefnrPackage.eINSTANCE.getTotalSample(), current.eResource()) {

					public void process(IStructuredSelection selection) {
						for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
							EObject elem = (EObject) iter.next();
							if (!advancedreferencestableOptionalPropertyEditUtil.getVirtualList().contains(elem))
								advancedreferencestableOptionalPropertyEditUtil.addElement(elem);
							propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AdvancedReferencesTableSamplePropertiesEditionPartImpl.this, EefnrViewsRepository.AdvancedReferencesTableSample.advancedreferencestableOptionalProperty,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
						}
						advancedreferencestableOptionalProperty.refresh();
					}

				};
				dialog.open();
			}
			public void handleEdit(TotalSample element) { editAdvancedreferencestableOptionalProperty(element); }
			public void handleMove(TotalSample element, int oldIndex, int newIndex) { moveAdvancedreferencestableOptionalProperty(element, oldIndex, newIndex); }
			public void handleRemove(TotalSample element) { removeFromAdvancedreferencestableOptionalProperty(element); }
			public void navigateTo(TotalSample element) { }
		});
		this.advancedreferencestableOptionalProperty.setHelpText(propertiesEditionComponent.getHelpContent(EefnrViewsRepository.AdvancedReferencesTableSample.advancedreferencestableOptionalProperty, EefnrViewsRepository.SWT_KIND));
		this.advancedreferencestableOptionalProperty.createControls(parent);
		GridData advancedreferencestableOptionalPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		advancedreferencestableOptionalPropertyData.horizontalSpan = 3;
		this.advancedreferencestableOptionalProperty.setLayoutData(advancedreferencestableOptionalPropertyData);
		this.advancedreferencestableOptionalProperty.disableMove();
	}

	/**
	 * 
	 */
	protected void moveAdvancedreferencestableOptionalProperty(TotalSample element, int oldIndex, int newIndex) {
		EObject editedElement = advancedreferencestableOptionalPropertyEditUtil.foundCorrespondingEObject(element);
		advancedreferencestableOptionalPropertyEditUtil.moveElement(element, oldIndex, newIndex);
		advancedreferencestableOptionalProperty.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AdvancedReferencesTableSamplePropertiesEditionPartImpl.this, EefnrViewsRepository.AdvancedReferencesTableSample.advancedreferencestableOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));
	}

	/**
	 * 
	 */
	protected void removeFromAdvancedreferencestableOptionalProperty(TotalSample element) {
		// Start of user code removeFromAdvancedreferencestableOptionalProperty() method body
				EObject editedElement = advancedreferencestableOptionalPropertyEditUtil.foundCorrespondingEObject(element);
				advancedreferencestableOptionalPropertyEditUtil.removeElement(element);
				advancedreferencestableOptionalProperty.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AdvancedReferencesTableSamplePropertiesEditionPartImpl.this, EefnrViewsRepository.AdvancedReferencesTableSample.advancedreferencestableOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, editedElement));
				
		// End of user code
	}

	/**
	 * 
	 */
	protected void editAdvancedreferencestableOptionalProperty(TotalSample element) {
		// Start of user code editAdvancedreferencestableOptionalProperty() method body
				EObject editedElement = advancedreferencestableOptionalPropertyEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						advancedreferencestableOptionalPropertyEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						advancedreferencestableOptionalProperty.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AdvancedReferencesTableSamplePropertiesEditionPartImpl.this, EefnrViewsRepository.AdvancedReferencesTableSample.advancedreferencestableOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
				
		// End of user code
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization
		
		// End of user code
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.AdvancedReferencesTableSamplePropertiesEditionPart#getAdvancedreferencestableRequiredPropertyToAdd()
	 * 
	 */
	public List getAdvancedreferencestableRequiredPropertyToAdd() {
		return advancedreferencestableRequiredPropertyEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.AdvancedReferencesTableSamplePropertiesEditionPart#getAdvancedreferencestableRequiredPropertyToRemove()
	 * 
	 */
	public List getAdvancedreferencestableRequiredPropertyToRemove() {
		return advancedreferencestableRequiredPropertyEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.AdvancedReferencesTableSamplePropertiesEditionPart#getAdvancedreferencestableRequiredPropertyTable()
	 * 
	 */
	public List getAdvancedreferencestableRequiredPropertyTable() {
		return advancedreferencestableRequiredPropertyEditUtil.getVirtualList();
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.AdvancedReferencesTableSamplePropertiesEditionPart#initAdvancedreferencestableRequiredProperty(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initAdvancedreferencestableRequiredProperty(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			advancedreferencestableRequiredPropertyEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			advancedreferencestableRequiredPropertyEditUtil = new EMFListEditUtil(current, feature);
		this.advancedreferencestableRequiredProperty.setInput(advancedreferencestableRequiredPropertyEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.AdvancedReferencesTableSamplePropertiesEditionPart#updateAdvancedreferencestableRequiredProperty(EObject newValue)
	 * 
	 */
	public void updateAdvancedreferencestableRequiredProperty(EObject newValue) {
		if(advancedreferencestableRequiredPropertyEditUtil != null){
			advancedreferencestableRequiredPropertyEditUtil.reinit(newValue);
			advancedreferencestableRequiredProperty.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.AdvancedReferencesTableSamplePropertiesEditionPart#addFilterAdvancedreferencestableRequiredProperty(ViewerFilter filter)
	 * 
	 */
	public void addFilterToAdvancedreferencestableRequiredProperty(ViewerFilter filter) {
		advancedreferencestableRequiredPropertyFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.AdvancedReferencesTableSamplePropertiesEditionPart#addBusinessFilterAdvancedreferencestableRequiredProperty(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToAdvancedreferencestableRequiredProperty(ViewerFilter filter) {
		advancedreferencestableRequiredPropertyBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.AdvancedReferencesTableSamplePropertiesEditionPart#isContainedInAdvancedreferencestableRequiredPropertyTable(EObject element)
	 * 
	 */
	public boolean isContainedInAdvancedreferencestableRequiredPropertyTable(EObject element) {
		return advancedreferencestableRequiredPropertyEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.AdvancedReferencesTableSamplePropertiesEditionPart#getAdvancedreferencestableOptionalPropertyToAdd()
	 * 
	 */
	public List getAdvancedreferencestableOptionalPropertyToAdd() {
		return advancedreferencestableOptionalPropertyEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.AdvancedReferencesTableSamplePropertiesEditionPart#getAdvancedreferencestableOptionalPropertyToRemove()
	 * 
	 */
	public List getAdvancedreferencestableOptionalPropertyToRemove() {
		return advancedreferencestableOptionalPropertyEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.AdvancedReferencesTableSamplePropertiesEditionPart#getAdvancedreferencestableOptionalPropertyTable()
	 * 
	 */
	public List getAdvancedreferencestableOptionalPropertyTable() {
		return advancedreferencestableOptionalPropertyEditUtil.getVirtualList();
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.AdvancedReferencesTableSamplePropertiesEditionPart#initAdvancedreferencestableOptionalProperty(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initAdvancedreferencestableOptionalProperty(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			advancedreferencestableOptionalPropertyEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			advancedreferencestableOptionalPropertyEditUtil = new EMFListEditUtil(current, feature);
		this.advancedreferencestableOptionalProperty.setInput(advancedreferencestableOptionalPropertyEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.AdvancedReferencesTableSamplePropertiesEditionPart#updateAdvancedreferencestableOptionalProperty(EObject newValue)
	 * 
	 */
	public void updateAdvancedreferencestableOptionalProperty(EObject newValue) {
		if(advancedreferencestableOptionalPropertyEditUtil != null){
			advancedreferencestableOptionalPropertyEditUtil.reinit(newValue);
			advancedreferencestableOptionalProperty.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.AdvancedReferencesTableSamplePropertiesEditionPart#addFilterAdvancedreferencestableOptionalProperty(ViewerFilter filter)
	 * 
	 */
	public void addFilterToAdvancedreferencestableOptionalProperty(ViewerFilter filter) {
		advancedreferencestableOptionalPropertyFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.AdvancedReferencesTableSamplePropertiesEditionPart#addBusinessFilterAdvancedreferencestableOptionalProperty(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToAdvancedreferencestableOptionalProperty(ViewerFilter filter) {
		advancedreferencestableOptionalPropertyBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.AdvancedReferencesTableSamplePropertiesEditionPart#isContainedInAdvancedreferencestableOptionalPropertyTable(EObject element)
	 * 
	 */
	public boolean isContainedInAdvancedreferencestableOptionalPropertyTable(EObject element) {
		return advancedreferencestableOptionalPropertyEditUtil.contains(element);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EefnrMessages.AdvancedReferencesTableSample_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
