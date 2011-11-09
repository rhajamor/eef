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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.emf.samples.conference.parts.ConferenceViewsRepository;
import org.eclipse.emf.samples.conference.parts.ParticipantsPropertiesEditionPart;
import org.eclipse.emf.samples.conference.providers.ConferenceMessages;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;


// End of user code

/**
 * @author <a href="mailto:stephane.bouchet@obeo.fr">Stephane Bouchet</a>
 * 
 */
public class ParticipantsPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ParticipantsPropertiesEditionPart {

protected ReferencesTable participants;
protected List<ViewerFilter> participantsBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> participantsFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ParticipantsPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence participantsStep = new BindingCompositionSequence(propertiesEditionComponent);
		participantsStep.addStep(ConferenceViewsRepository.Participants.participants_);
		
		composer = new PartComposer(participantsStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ConferenceViewsRepository.Participants.participants_) {
					return createParticipantsAdvancedTableComposition(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createParticipantsAdvancedTableComposition(Composite parent) {
		this.participants = new ReferencesTable(ConferenceMessages.ParticipantsPropertiesEditionPart_ParticipantsLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParticipantsPropertiesEditionPartImpl.this, ConferenceViewsRepository.Participants.participants_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				participants.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParticipantsPropertiesEditionPartImpl.this, ConferenceViewsRepository.Participants.participants_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				participants.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParticipantsPropertiesEditionPartImpl.this, ConferenceViewsRepository.Participants.participants_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				participants.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParticipantsPropertiesEditionPartImpl.this, ConferenceViewsRepository.Participants.participants_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				participants.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.participantsFilters) {
			this.participants.addFilter(filter);
		}
		this.participants.setHelpText(propertiesEditionComponent.getHelpContent(ConferenceViewsRepository.Participants.participants_, ConferenceViewsRepository.SWT_KIND));
		this.participants.createControls(parent);
		this.participants.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParticipantsPropertiesEditionPartImpl.this, ConferenceViewsRepository.Participants.participants_, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData participantsData = new GridData(GridData.FILL_HORIZONTAL);
		participantsData.horizontalSpan = 3;
		this.participants.setLayoutData(participantsData);
		this.participants.setLowerBound(0);
		this.participants.setUpperBound(-1);
		participants.setID(ConferenceViewsRepository.Participants.participants_);
		participants.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
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
	 * @see org.eclipse.emf.samples.conference.parts.ParticipantsPropertiesEditionPart#initParticipants(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initParticipants(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		participants.setContentProvider(contentProvider);
		participants.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.ParticipantsPropertiesEditionPart#updateParticipants()
	 * 
	 */
	public void updateParticipants() {
	participants.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.ParticipantsPropertiesEditionPart#addFilterParticipants(ViewerFilter filter)
	 * 
	 */
	public void addFilterToParticipants(ViewerFilter filter) {
		participantsFilters.add(filter);
		if (this.participants != null) {
			this.participants.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.ParticipantsPropertiesEditionPart#addBusinessFilterParticipants(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToParticipants(ViewerFilter filter) {
		participantsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.ParticipantsPropertiesEditionPart#isContainedInParticipantsTable(EObject element)
	 * 
	 */
	public boolean isContainedInParticipantsTable(EObject element) {
		return ((ReferencesTableSettings)participants.getInput()).contains(element);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ConferenceMessages.Participants_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
