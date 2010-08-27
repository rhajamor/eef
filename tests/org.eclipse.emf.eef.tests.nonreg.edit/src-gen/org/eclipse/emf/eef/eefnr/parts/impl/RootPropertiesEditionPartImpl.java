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
import org.eclipse.emf.eef.eefnr.AbstractSample;
import org.eclipse.emf.eef.eefnr.EefnrPackage;
import org.eclipse.emf.eef.eefnr.parts.EefnrViewsRepository;
import org.eclipse.emf.eef.eefnr.parts.RootPropertiesEditionPart;
import org.eclipse.emf.eef.eefnr.providers.EefnrMessages;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.policies.IPropertiesEditionPolicy;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPolicyProvider;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.policies.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.policies.EReferencePropertiesEditionContext;
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
public class RootPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, RootPropertiesEditionPart {

	protected EMFListEditUtil samplesEditUtil;
	protected ReferencesTable<? extends EObject> samples;
	protected List<ViewerFilter> samplesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> samplesFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public RootPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		propertiesGroup.setText(EefnrMessages.RootPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		createSamplesAdvancedTableComposition(propertiesGroup);
	}

	/**
	 * @param container
	 * 
	 */
	protected void createSamplesAdvancedTableComposition(Composite parent) {
		this.samples = new ReferencesTable<AbstractSample>(EefnrMessages.RootPropertiesEditionPart_SamplesLabel, new ReferencesTableListener<AbstractSample>() {			
			public void handleAdd() { addToSamples();}
			public void handleEdit(AbstractSample element) { editSamples(element); }
			public void handleMove(AbstractSample element, int oldIndex, int newIndex) { moveSamples(element, oldIndex, newIndex); }
			public void handleRemove(AbstractSample element) { removeFromSamples(element); }
			public void navigateTo(AbstractSample element) { }
		});
		this.samples.setHelpText(propertiesEditionComponent.getHelpContent(EefnrViewsRepository.Root.samples, EefnrViewsRepository.SWT_KIND));
		this.samples.createControls(parent);
		GridData samplesData = new GridData(GridData.FILL_HORIZONTAL);
		samplesData.horizontalSpan = 3;
		this.samples.setLayoutData(samplesData);
		this.samples.setLowerBound(0);
		this.samples.setUpperBound(-1);
	}

	/**
	 *  
	 */
	protected void moveSamples(AbstractSample element, int oldIndex, int newIndex) {
	}

	/**
	 *  
	 */
	protected void addToSamples() {
		// Start of user code addToSamples() method body
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(current);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(current);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EReferencePropertiesEditionContext(propertiesEditionComponent, EefnrPackage.eINSTANCE.getRoot_Samples(), resourceSet));
					if (propertiesEditionObject != null) {
						samplesEditUtil.addElement(propertiesEditionObject);
						samples.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RootPropertiesEditionPartImpl.this, EefnrViewsRepository.Root.samples, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
					}
				}
		
		// End of user code
	}

	/**
	 *  
	 */
	protected void removeFromSamples(AbstractSample element) {
		// Start of user code removeFromSamples() method body
				EObject editedElement = samplesEditUtil.foundCorrespondingEObject(element);
				samplesEditUtil.removeElement(element);
				samples.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RootPropertiesEditionPartImpl.this, EefnrViewsRepository.Root.samples, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.REMOVE, null, editedElement));
		// End of user code
	}

	/**
	 *  
	 */
	protected void editSamples(AbstractSample element) {
		// Start of user code editSamples() method body
				EObject editedElement = samplesEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider	.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						samplesEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						samples.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RootPropertiesEditionPartImpl.this, EefnrViewsRepository.Root.samples, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
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
	 * @see org.eclipse.emf.eef.eefnr.parts.RootPropertiesEditionPart#getSamplesToAdd()
	 * 
	 */
	public List getSamplesToAdd() {
		return samplesEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.RootPropertiesEditionPart#getSamplesToRemove()
	 * 
	 */
	public List getSamplesToRemove() {
		return samplesEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.RootPropertiesEditionPart#getSamplesToEdit()
	 * 
	 */
	public Map getSamplesToEdit() {
		return samplesEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.RootPropertiesEditionPart#getSamplesToMove()
	 * 
	 */
	public List getSamplesToMove() {
		return samplesEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.RootPropertiesEditionPart#getSamplesTable()
	 * 
	 */
	public List getSamplesTable() {
		return samplesEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.RootPropertiesEditionPart#initSamples(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initSamples(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			samplesEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			samplesEditUtil = new EMFListEditUtil(current, feature);
		this.samples.setInput(samplesEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.RootPropertiesEditionPart#updateSamples(EObject newValue)
	 * 
	 */
	public void updateSamples(EObject newValue) {
		if(samplesEditUtil != null){
			samplesEditUtil.reinit(newValue);
			samples.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.RootPropertiesEditionPart#addFilterSamples(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSamples(ViewerFilter filter) {
		samplesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.RootPropertiesEditionPart#addBusinessFilterSamples(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSamples(ViewerFilter filter) {
		samplesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.RootPropertiesEditionPart#isContainedInSamplesTable(EObject element)
	 * 
	 */
	public boolean isContainedInSamplesTable(EObject element) {
		return samplesEditUtil.contains(element);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EefnrMessages.Root_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
