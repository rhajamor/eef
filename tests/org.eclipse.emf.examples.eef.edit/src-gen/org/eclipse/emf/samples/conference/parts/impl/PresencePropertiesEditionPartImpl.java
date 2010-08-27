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
import java.util.Iterator;
import java.util.List;

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
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;
import org.eclipse.emf.samples.conference.ConferencePackage;
import org.eclipse.emf.samples.conference.Talk;
import org.eclipse.emf.samples.conference.parts.ConferenceViewsRepository;
import org.eclipse.emf.samples.conference.parts.PresencePropertiesEditionPart;
import org.eclipse.emf.samples.conference.providers.ConferenceMessages;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

// End of user code	

/**
 * @author <a href="mailto:stephane.bouchet@obeo.fr">Stephane Bouchet</a>
 * 
 */
public class PresencePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, PresencePropertiesEditionPart {

	protected EMFListEditUtil assistsEditUtil;
	protected ReferencesTable<? extends EObject> assists;
	protected List<ViewerFilter> assistsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> assistsFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public PresencePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		createTalksGroup(view);


		// Start of user code for additional ui definition
		
		// End of user code
	}

	/**
	 * 
	 */
	protected void createTalksGroup(Composite parent) {
		Group talksGroup = new Group(parent, SWT.NONE);
		talksGroup.setText(ConferenceMessages.PresencePropertiesEditionPart_TalksGroupLabel);
		GridData talksGroupData = new GridData(GridData.FILL_HORIZONTAL);
		talksGroupData.horizontalSpan = 3;
		talksGroup.setLayoutData(talksGroupData);
		GridLayout talksGroupLayout = new GridLayout();
		talksGroupLayout.numColumns = 3;
		talksGroup.setLayout(talksGroupLayout);
		createAssistsAdvancedReferencesTable(talksGroup);
	}

	/**
	 * 
	 */
	protected void createAssistsAdvancedReferencesTable(Composite parent) {
		this.assists = new ReferencesTable<Talk>(ConferenceMessages.PresencePropertiesEditionPart_AssistsLabel, new ReferencesTableListener<Talk>() {
			public void handleAdd() {
				TabElementTreeSelectionDialog<Talk> dialog = new TabElementTreeSelectionDialog<Talk>(resourceSet, assistsFilters, assistsBusinessFilters,
				"Talk", ConferencePackage.eINSTANCE.getTalk(), current.eResource()) {

					public void process(IStructuredSelection selection) {
						for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
							EObject elem = (EObject) iter.next();
							if (!assistsEditUtil.getVirtualList().contains(elem))
								assistsEditUtil.addElement(elem);
							propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PresencePropertiesEditionPartImpl.this, ConferenceViewsRepository.Presence.assists,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
						}
						assists.refresh();
					}

				};
				dialog.open();
			}
			public void handleEdit(Talk element) { editAssists(element); }
			public void handleMove(Talk element, int oldIndex, int newIndex) { moveAssists(element, oldIndex, newIndex); }
			public void handleRemove(Talk element) { removeFromAssists(element); }
			public void navigateTo(Talk element) { }
		});
		this.assists.setHelpText(propertiesEditionComponent.getHelpContent(ConferenceViewsRepository.Presence.assists, ConferenceViewsRepository.SWT_KIND));
		this.assists.createControls(parent);
		GridData assistsData = new GridData(GridData.FILL_HORIZONTAL);
		assistsData.horizontalSpan = 3;
		this.assists.setLayoutData(assistsData);
		this.assists.disableMove();
	}

	/**
	 * 
	 */
	protected void moveAssists(Talk element, int oldIndex, int newIndex) {
		EObject editedElement = assistsEditUtil.foundCorrespondingEObject(element);
		assistsEditUtil.moveElement(element, oldIndex, newIndex);
		assists.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PresencePropertiesEditionPartImpl.this, ConferenceViewsRepository.Presence.assists, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));
	}

	/**
	 * 
	 */
	protected void removeFromAssists(Talk element) {
		// Start of user code removeFromAssists() method body
		EObject editedElement = assistsEditUtil.foundCorrespondingEObject(element);
		assistsEditUtil.removeElement(element);
		assists.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PresencePropertiesEditionPartImpl.this, ConferenceViewsRepository.Presence.assists, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, editedElement));
		// End of user code
	}

	/**
	 * 
	 */
	protected void editAssists(Talk element) {
		// Start of user code editAssists() method body
		EObject editedElement = assistsEditUtil.foundCorrespondingEObject(element);
		IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
		IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(editedElement);
		if (editionPolicy != null) {
			EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
			if (propertiesEditionObject != null) {
				assistsEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
				assists.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PresencePropertiesEditionPartImpl.this, ConferenceViewsRepository.Presence.assists, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
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
	 * @see org.eclipse.emf.samples.conference.parts.PresencePropertiesEditionPart#getAssistsToAdd()
	 * 
	 */
	public List getAssistsToAdd() {
		return assistsEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.PresencePropertiesEditionPart#getAssistsToRemove()
	 * 
	 */
	public List getAssistsToRemove() {
		return assistsEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.PresencePropertiesEditionPart#getAssistsTable()
	 * 
	 */
	public List getAssistsTable() {
		return assistsEditUtil.getVirtualList();
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.PresencePropertiesEditionPart#initAssists(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initAssists(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			assistsEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			assistsEditUtil = new EMFListEditUtil(current, feature);
		this.assists.setInput(assistsEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.PresencePropertiesEditionPart#updateAssists(EObject newValue)
	 * 
	 */
	public void updateAssists(EObject newValue) {
		if(assistsEditUtil != null){
			assistsEditUtil.reinit(newValue);
			assists.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.PresencePropertiesEditionPart#addFilterAssists(ViewerFilter filter)
	 * 
	 */
	public void addFilterToAssists(ViewerFilter filter) {
		assistsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.PresencePropertiesEditionPart#addBusinessFilterAssists(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToAssists(ViewerFilter filter) {
		assistsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.PresencePropertiesEditionPart#isContainedInAssistsTable(EObject element)
	 * 
	 */
	public boolean isContainedInAssistsTable(EObject element) {
		return assistsEditUtil.contains(element);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ConferenceMessages.Presence_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
