/*******************************************************************************
 * Copyright (c) 2008, 2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.eefnr.navigation.parts.impl;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.eefnr.navigation.parts.DeferedFlatReferencesTableSamplePropertiesEditionPart;
import org.eclipse.emf.eef.eefnr.navigation.parts.NavigationViewsRepository;
import org.eclipse.emf.eef.eefnr.navigation.providers.NavigationMessages;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.FlatReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
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
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class DeferedFlatReferencesTableSamplePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, DeferedFlatReferencesTableSamplePropertiesEditionPart {

	protected Text name;
	protected FlatReferencesTable flatReferencesTableSampleEditor;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public DeferedFlatReferencesTableSamplePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence deferedFlatReferencesTableSampleStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = deferedFlatReferencesTableSampleStep.addStep(NavigationViewsRepository.DeferedFlatReferencesTableSample.Properties.class);
		propertiesStep.addStep(NavigationViewsRepository.DeferedFlatReferencesTableSample.Properties.name);
		propertiesStep.addStep(NavigationViewsRepository.DeferedFlatReferencesTableSample.Properties.flatReferencesTableSampleEditor);
		
		
		composer = new PartComposer(deferedFlatReferencesTableSampleStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == NavigationViewsRepository.DeferedFlatReferencesTableSample.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == NavigationViewsRepository.DeferedFlatReferencesTableSample.Properties.name) {
					return createNameText(parent);
				}
				if (key == NavigationViewsRepository.DeferedFlatReferencesTableSample.Properties.flatReferencesTableSampleEditor) {
					return createFlatReferencesTableSampleEditorFlatReferencesTable(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(NavigationMessages.DeferedFlatReferencesTableSamplePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, NavigationViewsRepository.DeferedFlatReferencesTableSample.Properties.name, NavigationMessages.DeferedFlatReferencesTableSamplePropertiesEditionPart_NameLabel);
		name = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DeferedFlatReferencesTableSamplePropertiesEditionPartImpl.this, NavigationViewsRepository.DeferedFlatReferencesTableSample.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
			}

		});
		name.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DeferedFlatReferencesTableSamplePropertiesEditionPartImpl.this, NavigationViewsRepository.DeferedFlatReferencesTableSample.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, NavigationViewsRepository.DeferedFlatReferencesTableSample.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NavigationViewsRepository.DeferedFlatReferencesTableSample.Properties.name, NavigationViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent
	 * 
	 */
	protected Composite createFlatReferencesTableSampleEditorFlatReferencesTable(Composite parent) {
		createDescription(parent, NavigationViewsRepository.DeferedFlatReferencesTableSample.Properties.flatReferencesTableSampleEditor, NavigationMessages.DeferedFlatReferencesTableSamplePropertiesEditionPart_FlatReferencesTableSampleEditorLabel);
		flatReferencesTableSampleEditor = new FlatReferencesTable(parent);
		flatReferencesTableSampleEditor.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		flatReferencesTableSampleEditor.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				if (event.getSelection() instanceof StructuredSelection) 
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DeferedFlatReferencesTableSamplePropertiesEditionPartImpl.this, NavigationViewsRepository.DeferedFlatReferencesTableSample.Properties.flatReferencesTableSampleEditor, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, ((StructuredSelection)event.getSelection()).toList()));
			}

		});
		GridData flatReferencesTableSampleEditorData = new GridData(GridData.FILL_HORIZONTAL);
		flatReferencesTableSampleEditor.setLayoutData(flatReferencesTableSampleEditorData);
		flatReferencesTableSampleEditor.setID(NavigationViewsRepository.DeferedFlatReferencesTableSample.Properties.flatReferencesTableSampleEditor);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NavigationViewsRepository.DeferedFlatReferencesTableSample.Properties.flatReferencesTableSampleEditor, NavigationViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see org.eclipse.emf.eef.navigation.parts.DeferedFlatReferencesTableSamplePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.DeferedFlatReferencesTableSamplePropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.DeferedFlatReferencesTableSamplePropertiesEditionPart#initFlatReferencesTableSampleEditor(ReferencesTableSettings)
	 */
	public void initFlatReferencesTableSampleEditor(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		flatReferencesTableSampleEditor.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.DeferedFlatReferencesTableSamplePropertiesEditionPart#updateFlatReferencesTableSampleEditor()
	 * 
	 */
	public void updateFlatReferencesTableSampleEditor() {
	flatReferencesTableSampleEditor.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.DeferedFlatReferencesTableSamplePropertiesEditionPart#addFilterFlatReferencesTableSampleEditor(ViewerFilter filter)
	 * 
	 */
	public void addFilterToFlatReferencesTableSampleEditor(ViewerFilter filter) {
		flatReferencesTableSampleEditor.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.DeferedFlatReferencesTableSamplePropertiesEditionPart#addBusinessFilterFlatReferencesTableSampleEditor(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToFlatReferencesTableSampleEditor(ViewerFilter filter) {
		flatReferencesTableSampleEditor.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.DeferedFlatReferencesTableSamplePropertiesEditionPart#isContainedInFlatReferencesTableSampleEditorTable(EObject element)
	 * 
	 */
	public boolean isContainedInFlatReferencesTableSampleEditorTable(EObject element) {
		return ((ReferencesTableSettings)flatReferencesTableSampleEditor.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return NavigationMessages.DeferedFlatReferencesTableSample_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
