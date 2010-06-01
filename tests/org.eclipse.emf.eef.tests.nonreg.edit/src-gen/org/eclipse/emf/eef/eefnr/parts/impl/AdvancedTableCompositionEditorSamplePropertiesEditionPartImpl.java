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
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.eef.eefnr.EefnrFactory;
import org.eclipse.emf.eef.eefnr.TotalSample;
import org.eclipse.emf.eef.eefnr.parts.AdvancedTableCompositionEditorSamplePropertiesEditionPart;
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
public class AdvancedTableCompositionEditorSamplePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, AdvancedTableCompositionEditorSamplePropertiesEditionPart {

	protected EMFListEditUtil advancedtablecompositionRequiredPropertyEditUtil;
	protected ReferencesTable<? extends EObject> advancedtablecompositionRequiredProperty;
	protected List<ViewerFilter> advancedtablecompositionRequiredPropertyBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> advancedtablecompositionRequiredPropertyFilters = new ArrayList<ViewerFilter>();
	protected EMFListEditUtil advancedtablecompositionOptionalPropertyEditUtil;
	protected ReferencesTable<? extends EObject> advancedtablecompositionOptionalProperty;
	protected List<ViewerFilter> advancedtablecompositionOptionalPropertyBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> advancedtablecompositionOptionalPropertyFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public AdvancedTableCompositionEditorSamplePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		propertiesGroup.setText(EefnrMessages.AdvancedTableCompositionEditorSamplePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		createAdvancedtablecompositionRequiredPropertyAdvancedTableComposition(propertiesGroup);
		createAdvancedtablecompositionOptionalPropertyAdvancedTableComposition(propertiesGroup);
	}

	/**
	 * @param container
	 * 
	 */
	protected void createAdvancedtablecompositionRequiredPropertyAdvancedTableComposition(Composite parent) {
		this.advancedtablecompositionRequiredProperty = new ReferencesTable<TotalSample>(EefnrMessages.AdvancedTableCompositionEditorSamplePropertiesEditionPart_AdvancedtablecompositionRequiredPropertyLabel, new ReferencesTableListener<TotalSample>() {			
			public void handleAdd() { addToAdvancedtablecompositionRequiredProperty();}
			public void handleEdit(TotalSample element) { editAdvancedtablecompositionRequiredProperty(element); }
			public void handleMove(TotalSample element, int oldIndex, int newIndex) { moveAdvancedtablecompositionRequiredProperty(element, oldIndex, newIndex); }
			public void handleRemove(TotalSample element) { removeFromAdvancedtablecompositionRequiredProperty(element); }
			public void navigateTo(TotalSample element) { }
		});
		this.advancedtablecompositionRequiredProperty.setHelpText(propertiesEditionComponent.getHelpContent(EefnrViewsRepository.AdvancedTableCompositionEditorSample.advancedtablecompositionRequiredProperty, EefnrViewsRepository.SWT_KIND));
		this.advancedtablecompositionRequiredProperty.createControls(parent);
		GridData advancedtablecompositionRequiredPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		advancedtablecompositionRequiredPropertyData.horizontalSpan = 3;
		this.advancedtablecompositionRequiredProperty.setLayoutData(advancedtablecompositionRequiredPropertyData);
		this.advancedtablecompositionRequiredProperty.setLowerBound(1);
		this.advancedtablecompositionRequiredProperty.setUpperBound(-1);
	}

	/**
	 *  
	 */
	protected void moveAdvancedtablecompositionRequiredProperty(TotalSample element, int oldIndex, int newIndex) {
		EObject editedElement = advancedtablecompositionRequiredPropertyEditUtil.foundCorrespondingEObject(element);
		advancedtablecompositionRequiredPropertyEditUtil.moveElement(element, oldIndex, newIndex);
		advancedtablecompositionRequiredProperty.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AdvancedTableCompositionEditorSamplePropertiesEditionPartImpl.this, EefnrViewsRepository.AdvancedTableCompositionEditorSample.advancedtablecompositionRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));	
	}

	/**
	 *  
	 */
	protected void addToAdvancedtablecompositionRequiredProperty() {
		// Start of user code addToAdvancedtablecompositionRequiredProperty() method body
				TotalSample eObject = EefnrFactory.eINSTANCE.createTotalSample();
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(eObject);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent, eObject,resourceSet));
					if (propertiesEditionObject != null) {
						advancedtablecompositionRequiredPropertyEditUtil.addElement(propertiesEditionObject);
						advancedtablecompositionRequiredProperty.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AdvancedTableCompositionEditorSamplePropertiesEditionPartImpl.this, EefnrViewsRepository.AdvancedTableCompositionEditorSample.advancedtablecompositionRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
					}
				}
		
		// End of user code
	}

	/**
	 *  
	 */
	protected void removeFromAdvancedtablecompositionRequiredProperty(TotalSample element) {
		// Start of user code removeFromAdvancedtablecompositionRequiredProperty() method body
				EObject editedElement = advancedtablecompositionRequiredPropertyEditUtil.foundCorrespondingEObject(element);
				advancedtablecompositionRequiredPropertyEditUtil.removeElement(element);
				advancedtablecompositionRequiredProperty.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AdvancedTableCompositionEditorSamplePropertiesEditionPartImpl.this, EefnrViewsRepository.AdvancedTableCompositionEditorSample.advancedtablecompositionRequiredProperty, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.REMOVE, null, editedElement));
		// End of user code
	}

	/**
	 *  
	 */
	protected void editAdvancedtablecompositionRequiredProperty(TotalSample element) {
		// Start of user code editAdvancedtablecompositionRequiredProperty() method body
				EObject editedElement = advancedtablecompositionRequiredPropertyEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider	.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						advancedtablecompositionRequiredPropertyEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						advancedtablecompositionRequiredProperty.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AdvancedTableCompositionEditorSamplePropertiesEditionPartImpl.this, EefnrViewsRepository.AdvancedTableCompositionEditorSample.advancedtablecompositionRequiredProperty, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
		// End of user code
	}

	/**
	 * @param container
	 * 
	 */
	protected void createAdvancedtablecompositionOptionalPropertyAdvancedTableComposition(Composite parent) {
		this.advancedtablecompositionOptionalProperty = new ReferencesTable<TotalSample>(EefnrMessages.AdvancedTableCompositionEditorSamplePropertiesEditionPart_AdvancedtablecompositionOptionalPropertyLabel, new ReferencesTableListener<TotalSample>() {			
			public void handleAdd() { addToAdvancedtablecompositionOptionalProperty();}
			public void handleEdit(TotalSample element) { editAdvancedtablecompositionOptionalProperty(element); }
			public void handleMove(TotalSample element, int oldIndex, int newIndex) { moveAdvancedtablecompositionOptionalProperty(element, oldIndex, newIndex); }
			public void handleRemove(TotalSample element) { removeFromAdvancedtablecompositionOptionalProperty(element); }
			public void navigateTo(TotalSample element) { }
		});
		this.advancedtablecompositionOptionalProperty.setHelpText(propertiesEditionComponent.getHelpContent(EefnrViewsRepository.AdvancedTableCompositionEditorSample.advancedtablecompositionOptionalProperty, EefnrViewsRepository.SWT_KIND));
		this.advancedtablecompositionOptionalProperty.createControls(parent);
		GridData advancedtablecompositionOptionalPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		advancedtablecompositionOptionalPropertyData.horizontalSpan = 3;
		this.advancedtablecompositionOptionalProperty.setLayoutData(advancedtablecompositionOptionalPropertyData);
		this.advancedtablecompositionOptionalProperty.setLowerBound(0);
		this.advancedtablecompositionOptionalProperty.setUpperBound(-1);
	}

	/**
	 *  
	 */
	protected void moveAdvancedtablecompositionOptionalProperty(TotalSample element, int oldIndex, int newIndex) {
		EObject editedElement = advancedtablecompositionOptionalPropertyEditUtil.foundCorrespondingEObject(element);
		advancedtablecompositionOptionalPropertyEditUtil.moveElement(element, oldIndex, newIndex);
		advancedtablecompositionOptionalProperty.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AdvancedTableCompositionEditorSamplePropertiesEditionPartImpl.this, EefnrViewsRepository.AdvancedTableCompositionEditorSample.advancedtablecompositionOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));	
	}

	/**
	 *  
	 */
	protected void addToAdvancedtablecompositionOptionalProperty() {
		// Start of user code addToAdvancedtablecompositionOptionalProperty() method body
				TotalSample eObject = EefnrFactory.eINSTANCE.createTotalSample();
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(eObject);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent, eObject,resourceSet));
					if (propertiesEditionObject != null) {
						advancedtablecompositionOptionalPropertyEditUtil.addElement(propertiesEditionObject);
						advancedtablecompositionOptionalProperty.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AdvancedTableCompositionEditorSamplePropertiesEditionPartImpl.this, EefnrViewsRepository.AdvancedTableCompositionEditorSample.advancedtablecompositionOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
					}
				}
		
		// End of user code
	}

	/**
	 *  
	 */
	protected void removeFromAdvancedtablecompositionOptionalProperty(TotalSample element) {
		// Start of user code removeFromAdvancedtablecompositionOptionalProperty() method body
				EObject editedElement = advancedtablecompositionOptionalPropertyEditUtil.foundCorrespondingEObject(element);
				advancedtablecompositionOptionalPropertyEditUtil.removeElement(element);
				advancedtablecompositionOptionalProperty.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AdvancedTableCompositionEditorSamplePropertiesEditionPartImpl.this, EefnrViewsRepository.AdvancedTableCompositionEditorSample.advancedtablecompositionOptionalProperty, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.REMOVE, null, editedElement));
		// End of user code
	}

	/**
	 *  
	 */
	protected void editAdvancedtablecompositionOptionalProperty(TotalSample element) {
		// Start of user code editAdvancedtablecompositionOptionalProperty() method body
				EObject editedElement = advancedtablecompositionOptionalPropertyEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider	.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						advancedtablecompositionOptionalPropertyEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						advancedtablecompositionOptionalProperty.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AdvancedTableCompositionEditorSamplePropertiesEditionPartImpl.this, EefnrViewsRepository.AdvancedTableCompositionEditorSample.advancedtablecompositionOptionalProperty, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
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
	 * @see org.eclipse.emf.eef.eefnr.parts.AdvancedTableCompositionEditorSamplePropertiesEditionPart#getAdvancedtablecompositionRequiredPropertyToAdd()
	 * 
	 */
	public List getAdvancedtablecompositionRequiredPropertyToAdd() {
		return advancedtablecompositionRequiredPropertyEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.AdvancedTableCompositionEditorSamplePropertiesEditionPart#getAdvancedtablecompositionRequiredPropertyToRemove()
	 * 
	 */
	public List getAdvancedtablecompositionRequiredPropertyToRemove() {
		return advancedtablecompositionRequiredPropertyEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.AdvancedTableCompositionEditorSamplePropertiesEditionPart#getAdvancedtablecompositionRequiredPropertyToEdit()
	 * 
	 */
	public Map getAdvancedtablecompositionRequiredPropertyToEdit() {
		return advancedtablecompositionRequiredPropertyEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.AdvancedTableCompositionEditorSamplePropertiesEditionPart#getAdvancedtablecompositionRequiredPropertyToMove()
	 * 
	 */
	public List getAdvancedtablecompositionRequiredPropertyToMove() {
		return advancedtablecompositionRequiredPropertyEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.AdvancedTableCompositionEditorSamplePropertiesEditionPart#getAdvancedtablecompositionRequiredPropertyTable()
	 * 
	 */
	public List getAdvancedtablecompositionRequiredPropertyTable() {
		return advancedtablecompositionRequiredPropertyEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.AdvancedTableCompositionEditorSamplePropertiesEditionPart#initAdvancedtablecompositionRequiredProperty(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initAdvancedtablecompositionRequiredProperty(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			advancedtablecompositionRequiredPropertyEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			advancedtablecompositionRequiredPropertyEditUtil = new EMFListEditUtil(current, feature);
		this.advancedtablecompositionRequiredProperty.setInput(advancedtablecompositionRequiredPropertyEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.AdvancedTableCompositionEditorSamplePropertiesEditionPart#updateAdvancedtablecompositionRequiredProperty(EObject newValue)
	 * 
	 */
	public void updateAdvancedtablecompositionRequiredProperty(EObject newValue) {
		if(advancedtablecompositionRequiredPropertyEditUtil != null){
			advancedtablecompositionRequiredPropertyEditUtil.reinit(newValue);
			advancedtablecompositionRequiredProperty.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.AdvancedTableCompositionEditorSamplePropertiesEditionPart#addFilterAdvancedtablecompositionRequiredProperty(ViewerFilter filter)
	 * 
	 */
	public void addFilterToAdvancedtablecompositionRequiredProperty(ViewerFilter filter) {
		advancedtablecompositionRequiredPropertyFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.AdvancedTableCompositionEditorSamplePropertiesEditionPart#addBusinessFilterAdvancedtablecompositionRequiredProperty(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToAdvancedtablecompositionRequiredProperty(ViewerFilter filter) {
		advancedtablecompositionRequiredPropertyBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.AdvancedTableCompositionEditorSamplePropertiesEditionPart#isContainedInAdvancedtablecompositionRequiredPropertyTable(EObject element)
	 * 
	 */
	public boolean isContainedInAdvancedtablecompositionRequiredPropertyTable(EObject element) {
		return advancedtablecompositionRequiredPropertyEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.AdvancedTableCompositionEditorSamplePropertiesEditionPart#getAdvancedtablecompositionOptionalPropertyToAdd()
	 * 
	 */
	public List getAdvancedtablecompositionOptionalPropertyToAdd() {
		return advancedtablecompositionOptionalPropertyEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.AdvancedTableCompositionEditorSamplePropertiesEditionPart#getAdvancedtablecompositionOptionalPropertyToRemove()
	 * 
	 */
	public List getAdvancedtablecompositionOptionalPropertyToRemove() {
		return advancedtablecompositionOptionalPropertyEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.AdvancedTableCompositionEditorSamplePropertiesEditionPart#getAdvancedtablecompositionOptionalPropertyToEdit()
	 * 
	 */
	public Map getAdvancedtablecompositionOptionalPropertyToEdit() {
		return advancedtablecompositionOptionalPropertyEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.AdvancedTableCompositionEditorSamplePropertiesEditionPart#getAdvancedtablecompositionOptionalPropertyToMove()
	 * 
	 */
	public List getAdvancedtablecompositionOptionalPropertyToMove() {
		return advancedtablecompositionOptionalPropertyEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.AdvancedTableCompositionEditorSamplePropertiesEditionPart#getAdvancedtablecompositionOptionalPropertyTable()
	 * 
	 */
	public List getAdvancedtablecompositionOptionalPropertyTable() {
		return advancedtablecompositionOptionalPropertyEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.AdvancedTableCompositionEditorSamplePropertiesEditionPart#initAdvancedtablecompositionOptionalProperty(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initAdvancedtablecompositionOptionalProperty(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			advancedtablecompositionOptionalPropertyEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			advancedtablecompositionOptionalPropertyEditUtil = new EMFListEditUtil(current, feature);
		this.advancedtablecompositionOptionalProperty.setInput(advancedtablecompositionOptionalPropertyEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.AdvancedTableCompositionEditorSamplePropertiesEditionPart#updateAdvancedtablecompositionOptionalProperty(EObject newValue)
	 * 
	 */
	public void updateAdvancedtablecompositionOptionalProperty(EObject newValue) {
		if(advancedtablecompositionOptionalPropertyEditUtil != null){
			advancedtablecompositionOptionalPropertyEditUtil.reinit(newValue);
			advancedtablecompositionOptionalProperty.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.AdvancedTableCompositionEditorSamplePropertiesEditionPart#addFilterAdvancedtablecompositionOptionalProperty(ViewerFilter filter)
	 * 
	 */
	public void addFilterToAdvancedtablecompositionOptionalProperty(ViewerFilter filter) {
		advancedtablecompositionOptionalPropertyFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.AdvancedTableCompositionEditorSamplePropertiesEditionPart#addBusinessFilterAdvancedtablecompositionOptionalProperty(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToAdvancedtablecompositionOptionalProperty(ViewerFilter filter) {
		advancedtablecompositionOptionalPropertyBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.AdvancedTableCompositionEditorSamplePropertiesEditionPart#isContainedInAdvancedtablecompositionOptionalPropertyTable(EObject element)
	 * 
	 */
	public boolean isContainedInAdvancedtablecompositionOptionalPropertyTable(EObject element) {
		return advancedtablecompositionOptionalPropertyEditUtil.contains(element);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EefnrMessages.AdvancedTableCompositionEditorSample_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}