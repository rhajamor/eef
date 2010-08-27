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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.eefnr.AdvancedEObjectFlatComboViewerSample;
import org.eclipse.emf.eef.eefnr.EefnrFactory;
import org.eclipse.emf.eef.eefnr.EefnrPackage;
import org.eclipse.emf.eef.eefnr.TotalSample;
import org.eclipse.emf.eef.eefnr.parts.AdvancedEObjectFlatComboViewerSamplePropertiesEditionPart;
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
import org.eclipse.emf.eef.runtime.ui.widgets.AdvancedEObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.AdvancedEObjectFlatComboViewer.EObjectFlatComboViewerListener;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.jface.viewers.StructuredSelection;
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
public class AdvancedEObjectFlatComboViewerSamplePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, AdvancedEObjectFlatComboViewerSamplePropertiesEditionPart {

	private AdvancedEObjectFlatComboViewer<TotalSample> advancedeobjectflatcomboviewerRequiredProperty;
	protected ViewerFilter advancedeobjectflatcomboviewerRequiredPropertyFilter;
	private AdvancedEObjectFlatComboViewer<TotalSample> advancedeobjectflatcomboviewerOptionalProperty;
	protected ViewerFilter advancedeobjectflatcomboviewerOptionalPropertyFilter;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public AdvancedEObjectFlatComboViewerSamplePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		propertiesGroup.setText(EefnrMessages.AdvancedEObjectFlatComboViewerSamplePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		createAdvancedeobjectflatcomboviewerRequiredPropertyAdvancedFlatComboViewer(propertiesGroup);
		createAdvancedeobjectflatcomboviewerOptionalPropertyAdvancedFlatComboViewer(propertiesGroup);
	}

	/**
	 * @param propertiesGroup
	 */
	protected void createAdvancedeobjectflatcomboviewerRequiredPropertyAdvancedFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, EefnrMessages.AdvancedEObjectFlatComboViewerSamplePropertiesEditionPart_AdvancedeobjectflatcomboviewerRequiredPropertyLabel, propertiesEditionComponent.isRequired(EefnrViewsRepository.AdvancedEObjectFlatComboViewerSample.advancedeobjectflatcomboviewerRequiredProperty, EefnrViewsRepository.SWT_KIND));
		// create callback listener
		EObjectFlatComboViewerListener<TotalSample> listener = new EObjectFlatComboViewerListener<TotalSample>(){
			public void handleSet(TotalSample element){
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AdvancedEObjectFlatComboViewerSamplePropertiesEditionPartImpl.this, EefnrViewsRepository.AdvancedEObjectFlatComboViewerSample.advancedeobjectflatcomboviewerRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, element)); 
			}
			public void navigateTo(TotalSample element){ }
			
			public TotalSample handleCreate() {
				TotalSample eObject = EefnrFactory.eINSTANCE.createTotalSample();
				if (current != null && current instanceof AdvancedEObjectFlatComboViewerSample && ((AdvancedEObjectFlatComboViewerSample)current).getAdvancedeobjectflatcomboviewerRequiredProperty() != null) {
					eObject = (TotalSample) EcoreUtil.copy(((AdvancedEObjectFlatComboViewerSample)current).getAdvancedeobjectflatcomboviewerRequiredProperty());
				}
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(eObject);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent, eObject,resourceSet));
					if (propertiesEditionObject != null) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AdvancedEObjectFlatComboViewerSamplePropertiesEditionPartImpl.this, EefnrViewsRepository.AdvancedEObjectFlatComboViewerSample.advancedeobjectflatcomboviewerRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, propertiesEditionObject));
						return (TotalSample)propertiesEditionObject;
					}
					if (current != null && current instanceof AdvancedEObjectFlatComboViewerSample && ((AdvancedEObjectFlatComboViewerSample)current).getAdvancedeobjectflatcomboviewerRequiredProperty() != null)
						return eObject;
					return null;
				}
				return null;
			}
		};
		//create widget
		advancedeobjectflatcomboviewerRequiredProperty = new AdvancedEObjectFlatComboViewer<TotalSample>(EefnrMessages.AdvancedEObjectFlatComboViewerSamplePropertiesEditionPart_AdvancedeobjectflatcomboviewerRequiredPropertyLabel,
			resourceSet, advancedeobjectflatcomboviewerRequiredPropertyFilter, EefnrPackage.eINSTANCE.getTotalSample(), listener);
		advancedeobjectflatcomboviewerRequiredProperty.createControls(parent);
		GridData advancedeobjectflatcomboviewerRequiredPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		advancedeobjectflatcomboviewerRequiredProperty.setLayoutData(advancedeobjectflatcomboviewerRequiredPropertyData);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EefnrViewsRepository.AdvancedEObjectFlatComboViewerSample.advancedeobjectflatcomboviewerRequiredProperty, EefnrViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	/**
	 * @param propertiesGroup
	 */
	protected void createAdvancedeobjectflatcomboviewerOptionalPropertyAdvancedFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, EefnrMessages.AdvancedEObjectFlatComboViewerSamplePropertiesEditionPart_AdvancedeobjectflatcomboviewerOptionalPropertyLabel, propertiesEditionComponent.isRequired(EefnrViewsRepository.AdvancedEObjectFlatComboViewerSample.advancedeobjectflatcomboviewerOptionalProperty, EefnrViewsRepository.SWT_KIND));
		// create callback listener
		EObjectFlatComboViewerListener<TotalSample> listener = new EObjectFlatComboViewerListener<TotalSample>(){
			public void handleSet(TotalSample element){
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AdvancedEObjectFlatComboViewerSamplePropertiesEditionPartImpl.this, EefnrViewsRepository.AdvancedEObjectFlatComboViewerSample.advancedeobjectflatcomboviewerOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, element)); 
			}
			public void navigateTo(TotalSample element){ }
			
			public TotalSample handleCreate() {
				TotalSample eObject = EefnrFactory.eINSTANCE.createTotalSample();
				if (current != null && current instanceof AdvancedEObjectFlatComboViewerSample && ((AdvancedEObjectFlatComboViewerSample)current).getAdvancedeobjectflatcomboviewerOptionalProperty() != null) {
					eObject = (TotalSample) EcoreUtil.copy(((AdvancedEObjectFlatComboViewerSample)current).getAdvancedeobjectflatcomboviewerOptionalProperty());
				}
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(eObject);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent, eObject,resourceSet));
					if (propertiesEditionObject != null) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AdvancedEObjectFlatComboViewerSamplePropertiesEditionPartImpl.this, EefnrViewsRepository.AdvancedEObjectFlatComboViewerSample.advancedeobjectflatcomboviewerOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, propertiesEditionObject));
						return (TotalSample)propertiesEditionObject;
					}
					if (current != null && current instanceof AdvancedEObjectFlatComboViewerSample && ((AdvancedEObjectFlatComboViewerSample)current).getAdvancedeobjectflatcomboviewerOptionalProperty() != null)
						return eObject;
					return null;
				}
				return null;
			}
		};
		//create widget
		advancedeobjectflatcomboviewerOptionalProperty = new AdvancedEObjectFlatComboViewer<TotalSample>(EefnrMessages.AdvancedEObjectFlatComboViewerSamplePropertiesEditionPart_AdvancedeobjectflatcomboviewerOptionalPropertyLabel,
			resourceSet, advancedeobjectflatcomboviewerOptionalPropertyFilter, EefnrPackage.eINSTANCE.getTotalSample(), listener);
		advancedeobjectflatcomboviewerOptionalProperty.createControls(parent);
		GridData advancedeobjectflatcomboviewerOptionalPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		advancedeobjectflatcomboviewerOptionalProperty.setLayoutData(advancedeobjectflatcomboviewerOptionalPropertyData);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EefnrViewsRepository.AdvancedEObjectFlatComboViewerSample.advancedeobjectflatcomboviewerOptionalProperty, EefnrViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see org.eclipse.emf.eef.eefnr.parts.AdvancedEObjectFlatComboViewerSamplePropertiesEditionPart#getAdvancedeobjectflatcomboviewerRequiredProperty()
	 * 
	 */
	public EObject getAdvancedeobjectflatcomboviewerRequiredProperty() {
		return advancedeobjectflatcomboviewerRequiredProperty.getSelection();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.AdvancedEObjectFlatComboViewerSamplePropertiesEditionPart#initAdvancedeobjectflatcomboviewerRequiredProperty(ResourceSet allResources, EObject current)
	 */
	public void initAdvancedeobjectflatcomboviewerRequiredProperty(ResourceSet allResources, EObject current) {
		advancedeobjectflatcomboviewerRequiredProperty.setInput(allResources);
		if (current != null) {
			advancedeobjectflatcomboviewerRequiredProperty.setSelection(new StructuredSelection(current));
			advancedeobjectflatcomboviewerRequiredProperty.setMainResource(current.eResource());
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.AdvancedEObjectFlatComboViewerSamplePropertiesEditionPart#setAdvancedeobjectflatcomboviewerRequiredProperty(EObject newValue)
	 * 
	 */
	public void setAdvancedeobjectflatcomboviewerRequiredProperty(EObject newValue) {
		if (newValue != null) {
			advancedeobjectflatcomboviewerRequiredProperty.setSelection(new StructuredSelection(newValue));
		} else {
			advancedeobjectflatcomboviewerRequiredProperty.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.AdvancedEObjectFlatComboViewerSamplePropertiesEditionPart#setAdvancedeobjectflatcomboviewerRequiredPropertyButtonMode(ButtonsModeEnum newValue)
	 */
	public void setAdvancedeobjectflatcomboviewerRequiredPropertyButtonMode(ButtonsModeEnum newValue) {
		advancedeobjectflatcomboviewerRequiredProperty.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.AdvancedEObjectFlatComboViewerSamplePropertiesEditionPart#addFilterAdvancedeobjectflatcomboviewerRequiredProperty(ViewerFilter filter)
	 * 
	 */
	public void addFilterToAdvancedeobjectflatcomboviewerRequiredProperty(ViewerFilter filter) {
		advancedeobjectflatcomboviewerRequiredProperty.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.AdvancedEObjectFlatComboViewerSamplePropertiesEditionPart#addBusinessFilterAdvancedeobjectflatcomboviewerRequiredProperty(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToAdvancedeobjectflatcomboviewerRequiredProperty(ViewerFilter filter) {
		advancedeobjectflatcomboviewerRequiredProperty.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.AdvancedEObjectFlatComboViewerSamplePropertiesEditionPart#getAdvancedeobjectflatcomboviewerOptionalProperty()
	 * 
	 */
	public EObject getAdvancedeobjectflatcomboviewerOptionalProperty() {
		return advancedeobjectflatcomboviewerOptionalProperty.getSelection();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.AdvancedEObjectFlatComboViewerSamplePropertiesEditionPart#initAdvancedeobjectflatcomboviewerOptionalProperty(ResourceSet allResources, EObject current)
	 */
	public void initAdvancedeobjectflatcomboviewerOptionalProperty(ResourceSet allResources, EObject current) {
		advancedeobjectflatcomboviewerOptionalProperty.setInput(allResources);
		if (current != null) {
			advancedeobjectflatcomboviewerOptionalProperty.setSelection(new StructuredSelection(current));
			advancedeobjectflatcomboviewerOptionalProperty.setMainResource(current.eResource());
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.AdvancedEObjectFlatComboViewerSamplePropertiesEditionPart#setAdvancedeobjectflatcomboviewerOptionalProperty(EObject newValue)
	 * 
	 */
	public void setAdvancedeobjectflatcomboviewerOptionalProperty(EObject newValue) {
		if (newValue != null) {
			advancedeobjectflatcomboviewerOptionalProperty.setSelection(new StructuredSelection(newValue));
		} else {
			advancedeobjectflatcomboviewerOptionalProperty.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.AdvancedEObjectFlatComboViewerSamplePropertiesEditionPart#setAdvancedeobjectflatcomboviewerOptionalPropertyButtonMode(ButtonsModeEnum newValue)
	 */
	public void setAdvancedeobjectflatcomboviewerOptionalPropertyButtonMode(ButtonsModeEnum newValue) {
		advancedeobjectflatcomboviewerOptionalProperty.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.AdvancedEObjectFlatComboViewerSamplePropertiesEditionPart#addFilterAdvancedeobjectflatcomboviewerOptionalProperty(ViewerFilter filter)
	 * 
	 */
	public void addFilterToAdvancedeobjectflatcomboviewerOptionalProperty(ViewerFilter filter) {
		advancedeobjectflatcomboviewerOptionalProperty.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.AdvancedEObjectFlatComboViewerSamplePropertiesEditionPart#addBusinessFilterAdvancedeobjectflatcomboviewerOptionalProperty(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToAdvancedeobjectflatcomboviewerOptionalProperty(ViewerFilter filter) {
		advancedeobjectflatcomboviewerOptionalProperty.addBusinessRuleFilter(filter);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EefnrMessages.AdvancedEObjectFlatComboViewerSample_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
