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
 * $Id: SpecificElementEditorPropertiesEditionPartImpl.java,v 1.2 2009/04/30 17:49:39 nlepine Exp $
 */
package org.eclipse.emf.eef.views.parts.impl;

// Start of user code for imports

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.toolkits.Widget;
import org.eclipse.emf.eef.views.SpecificElementEditor;
import org.eclipse.emf.eef.views.parts.SpecificElementEditorPropertiesEditionPart;
import org.eclipse.emf.eef.views.parts.ViewsViewsRepository;
import org.eclipse.emf.eef.views.providers.ViewsMessages;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

// End of user code
/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 */
public class SpecificElementEditorPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, SpecificElementEditorPropertiesEditionPart {

	private Text name;
	protected EObjectFlatComboViewer representation;
	private Button readOnly;




	
	public SpecificElementEditorPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		
		// Start of user code for additional ui definition
		
		// End of user code		
	}

	protected void createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(ViewsMessages.SpecificElementEditorPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		createNameText(propertiesGroup);
		createRepresentationFlatComboViewer(propertiesGroup);
		createReadOnlyCheckbox(propertiesGroup);
	}
	protected void createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, ViewsMessages.SpecificElementEditorPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(ViewsViewsRepository.SpecificElementEditor.name, ViewsViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SpecificElementEditorPropertiesEditionPartImpl.this, ViewsViewsRepository.SpecificElementEditor.name, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, name.getText()));
			}
			
		});

		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ViewsViewsRepository.SpecificElementEditor.name, ViewsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}
	/**
	 * @param propertiesGroup
	 */
	protected void createRepresentationFlatComboViewer(Composite parent) {

		SWTUtils.createPartLabel(parent, ViewsMessages.SpecificElementEditorPropertiesEditionPart_RepresentationLabel, propertiesEditionComponent.isRequired(ViewsViewsRepository.SpecificElementEditor.representation, ViewsViewsRepository.SWT_KIND));
		representation = new EObjectFlatComboViewer(parent, true);
		representation.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		
		// Start of user code for representation filters initialisation

 		// End of user code		
		representation.addFilter(new ViewerFilter() {

			/*
			 * (non-Javadoc)
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof Widget); //$NON-NLS-1$ 
			}

		});
		representation.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SpecificElementEditorPropertiesEditionPartImpl.this, ViewsViewsRepository.SpecificElementEditor.representation, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getRepresentation()));
			}

		});
		GridData representationData = new GridData(GridData.FILL_HORIZONTAL);
		representation.setLayoutData(representationData);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ViewsViewsRepository.SpecificElementEditor.representation, ViewsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}
	protected void createReadOnlyCheckbox(Composite parent) {
		readOnly = new Button(parent, SWT.CHECK);
		readOnly.setText(ViewsMessages.SpecificElementEditorPropertiesEditionPart_ReadOnlyLabel);
		GridData readOnlyData = new GridData(GridData.FILL_HORIZONTAL);
		readOnlyData.horizontalSpan = 2;
		readOnly.setLayoutData(readOnlyData);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ViewsViewsRepository.SpecificElementEditor.readOnly, ViewsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	
	public void firePropertiesChanged(PropertiesEditionEvent event) {
		// Start of user code for tab synchronization
		
		// End of user code		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.views.parts.SpecificElementEditorPropertiesEditionPart#getName()
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.views.parts.SpecificElementEditorPropertiesEditionPart#setName(String newValue)
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
	 * @see org.eclipse.emf.eef.views.parts.SpecificElementEditorPropertiesEditionPart#getRepresentation()
	 */
	public EObject getRepresentation() {
		if (representation.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) representation.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.views.parts.SpecificElementEditorPropertiesEditionPart#initRepresentation(ResourceSet allResources, EObject current)
	 */
	public void initRepresentation(ResourceSet allResources, EObject current) {
		representation.setInput(allResources);
		if (current != null)
			representation.setSelection(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.views.parts.SpecificElementEditorPropertiesEditionPart#setRepresentation(EObject newValue)
	 */
	public void setRepresentation(EObject newValue) {
		if (newValue != null)
			representation.setSelection(new StructuredSelection(newValue));
		else
			representation.setSelection(new StructuredSelection("")); //$NON-NLS-1$
	}

	public void setMessageForRepresentation(String msg, int msgLevel) {

	}

	public void unsetMessageForRepresentation() {

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.views.parts.SpecificElementEditorPropertiesEditionPart#getReadOnly()
	 */
	public Boolean getReadOnly() {
		return Boolean.valueOf(readOnly.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.views.parts.SpecificElementEditorPropertiesEditionPart#setReadOnly(Boolean newValue)
	 */
	public void setReadOnly(Boolean newValue) {
		if (newValue != null) {
			readOnly.setSelection(newValue.booleanValue());
		} else {
			readOnly.setSelection(false);
		}
	}

	public void setMessageForReadOnly(String msg, int msgLevel) {

	}

	public void unsetMessageForReadOnly() {

	}








	// Start of user code additional methods
 	
	// End of user code
}