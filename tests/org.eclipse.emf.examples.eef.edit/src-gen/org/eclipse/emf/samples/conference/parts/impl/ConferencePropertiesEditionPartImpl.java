/*******************************************************************************
 * Copyright (c) 2009 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.samples.conference.parts.impl;

// Start of user code for imports

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
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
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.samples.conference.ConferenceFactory;
import org.eclipse.emf.samples.conference.Site;
import org.eclipse.emf.samples.conference.parts.ConferencePropertiesEditionPart;
import org.eclipse.emf.samples.conference.parts.ConferenceViewsRepository;
import org.eclipse.emf.samples.conference.providers.ConferenceMessages;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

// End of user code	

/**
 * @author <a href="mailto:stephane.bouchet@obeo.fr">Stephane Bouchet</a>
 * 
 */
public class ConferencePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ConferencePropertiesEditionPart {

	protected Text place;
	protected EMFListEditUtil sitesEditUtil;
	protected ReferencesTable<? extends EObject> sites;
	protected List<ViewerFilter> sitesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> sitesFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ConferencePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		createLocalisationGroup(view);


		// Start of user code for additional ui definition
		
		// End of user code
	}

	/**
	 * 
	 */
	protected void createLocalisationGroup(Composite parent) {
		Group localisationGroup = new Group(parent, SWT.NONE);
		localisationGroup.setText(ConferenceMessages.ConferencePropertiesEditionPart_LocalisationGroupLabel);
		GridData localisationGroupData = new GridData(GridData.FILL_HORIZONTAL);
		localisationGroupData.horizontalSpan = 3;
		localisationGroup.setLayoutData(localisationGroupData);
		GridLayout localisationGroupLayout = new GridLayout();
		localisationGroupLayout.numColumns = 3;
		localisationGroup.setLayout(localisationGroupLayout);
		createPlaceText(localisationGroup);
		createSitesAdvancedTableComposition(localisationGroup);
	}

	
	protected void createPlaceText(Composite parent) {
		SWTUtils.createPartLabel(parent, ConferenceMessages.ConferencePropertiesEditionPart_PlaceLabel, propertiesEditionComponent.isRequired(ConferenceViewsRepository.Conference.place, ConferenceViewsRepository.SWT_KIND));
		place = new Text(parent, SWT.BORDER);
		GridData placeData = new GridData(GridData.FILL_HORIZONTAL);
		place.setLayoutData(placeData);
		place.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConferencePropertiesEditionPartImpl.this, ConferenceViewsRepository.Conference.place, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, place.getText()));
			}

		});
		place.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConferencePropertiesEditionPartImpl.this, ConferenceViewsRepository.Conference.place, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, place.getText()));
				}
			}

		});
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ConferenceViewsRepository.Conference.place, ConferenceViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	/**
	 * @param container
	 * 
	 */
	protected void createSitesAdvancedTableComposition(Composite parent) {
		this.sites = new ReferencesTable<Site>(ConferenceMessages.ConferencePropertiesEditionPart_SitesLabel, new ReferencesTableListener<Site>() {			
			public void handleAdd() { addToSites();}
			public void handleEdit(Site element) { editSites(element); }
			public void handleMove(Site element, int oldIndex, int newIndex) { moveSites(element, oldIndex, newIndex); }
			public void handleRemove(Site element) { removeFromSites(element); }
			public void navigateTo(Site element) { }
		});
		this.sites.setHelpText(propertiesEditionComponent.getHelpContent(ConferenceViewsRepository.Conference.sites, ConferenceViewsRepository.SWT_KIND));
		this.sites.createControls(parent);
		GridData sitesData = new GridData(GridData.FILL_HORIZONTAL);
		sitesData.horizontalSpan = 3;
		this.sites.setLayoutData(sitesData);
		this.sites.setLowerBound(0);
		this.sites.setUpperBound(-1);
	}

	/**
	 *  
	 */
	protected void moveSites(Site element, int oldIndex, int newIndex) {
		EObject editedElement = sitesEditUtil.foundCorrespondingEObject(element);
		sitesEditUtil.moveElement(element, oldIndex, newIndex);
		sites.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConferencePropertiesEditionPartImpl.this, ConferenceViewsRepository.Conference.sites, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));	
	}

	/**
	 *  
	 */
	protected void addToSites() {
		// Start of user code addToSites() method body
		Site eObject = ConferenceFactory.eINSTANCE.createSite();
		IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(eObject);
		IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
		if (editionPolicy != null) {
			EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent, eObject,resourceSet));
			if (propertiesEditionObject != null) {
				sitesEditUtil.addElement(propertiesEditionObject);
				sites.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConferencePropertiesEditionPartImpl.this, ConferenceViewsRepository.Conference.sites, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
			}
		}
		// End of user code
	}

	/**
	 *  
	 */
	protected void removeFromSites(Site element) {
		// Start of user code removeFromSites() method body
		EObject editedElement = sitesEditUtil.foundCorrespondingEObject(element);
		sitesEditUtil.removeElement(element);
		sites.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConferencePropertiesEditionPartImpl.this, ConferenceViewsRepository.Conference.sites, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.REMOVE, null, editedElement));
		// End of user code
	}

	/**
	 *  
	 */
	protected void editSites(Site element) {
		// Start of user code editSites() method body
		EObject editedElement = sitesEditUtil.foundCorrespondingEObject(element);
		IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
		IPropertiesEditionPolicy editionPolicy = policyProvider	.getEditionPolicy(editedElement);
		if (editionPolicy != null) {
			EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
			if (propertiesEditionObject != null) {
				sitesEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
				sites.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConferencePropertiesEditionPartImpl.this, ConferenceViewsRepository.Conference.sites, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
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
	 * @see org.eclipse.emf.samples.conference.parts.ConferencePropertiesEditionPart#getPlace()
	 * 
	 */
	public String getPlace() {
		return place.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.ConferencePropertiesEditionPart#setPlace(String newValue)
	 * 
	 */
	public void setPlace(String newValue) {
		if (newValue != null) {
			place.setText(newValue);
		} else {
			place.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.ConferencePropertiesEditionPart#getSitesToAdd()
	 * 
	 */
	public List getSitesToAdd() {
		return sitesEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.ConferencePropertiesEditionPart#getSitesToRemove()
	 * 
	 */
	public List getSitesToRemove() {
		return sitesEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.ConferencePropertiesEditionPart#getSitesToEdit()
	 * 
	 */
	public Map getSitesToEdit() {
		return sitesEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.ConferencePropertiesEditionPart#getSitesToMove()
	 * 
	 */
	public List getSitesToMove() {
		return sitesEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.ConferencePropertiesEditionPart#getSitesTable()
	 * 
	 */
	public List getSitesTable() {
		return sitesEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.ConferencePropertiesEditionPart#initSites(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initSites(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			sitesEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			sitesEditUtil = new EMFListEditUtil(current, feature);
		this.sites.setInput(sitesEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.ConferencePropertiesEditionPart#updateSites(EObject newValue)
	 * 
	 */
	public void updateSites(EObject newValue) {
		if(sitesEditUtil != null){
			sitesEditUtil.reinit(newValue);
			sites.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.ConferencePropertiesEditionPart#addFilterSites(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSites(ViewerFilter filter) {
		sitesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.ConferencePropertiesEditionPart#addBusinessFilterSites(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSites(ViewerFilter filter) {
		sitesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.ConferencePropertiesEditionPart#isContainedInSitesTable(EObject element)
	 * 
	 */
	public boolean isContainedInSitesTable(EObject element) {
		return sitesEditUtil.contains(element);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ConferenceMessages.Conference_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
