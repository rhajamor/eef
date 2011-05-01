/*******************************************************************************
 * Copyright (c) 2008, 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.views.parts.impl;

// Start of user code for imports

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.notify.PropertiesEditingEvent;
import org.eclipse.emf.eef.runtime.notify.impl.PropertiesEditingEventImpl;
import org.eclipse.emf.eef.runtime.parts.SWTPropertiesEditingPart;
import org.eclipse.emf.eef.runtime.parts.impl.CompositePropertiesEditingPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.views.parts.ViewReferencePropertiesEditionPart;
import org.eclipse.emf.eef.views.parts.ViewsViewsRepository;
import org.eclipse.emf.eef.views.providers.ViewsMessages;
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
public class ViewReferencePropertiesEditionPartImpl extends CompositePropertiesEditingPart implements SWTPropertiesEditingPart, ViewReferencePropertiesEditionPart {

	protected Text name;
	protected EObjectFlatComboViewer referencedView;



	/**
	 * Default constructor
	 * @param editionComponent the {@link PropertiesEditingComponent} that manage this part
	 * 
	 */
	public ViewReferencePropertiesEditionPartImpl(PropertiesEditingComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.parts.SWTPropertiesEditingPart#
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
	 * @see org.eclipse.emf.eef.runtime.parts.SWTPropertiesEditingPart#
	 * 			createControls(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(Composite view) { 
		CompositionSequence viewReferenceStep = new CompositionSequence();
		CompositionStep propertiesStep = viewReferenceStep.addStep(ViewsViewsRepository.ViewReference.Properties.class);
		propertiesStep.addStep(ViewsViewsRepository.ViewReference.Properties.name);
		propertiesStep.addStep(ViewsViewsRepository.ViewReference.Properties.referencedView);
		
		
		composer = new PartComposer(viewReferenceStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ViewsViewsRepository.ViewReference.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == ViewsViewsRepository.ViewReference.Properties.name) {
					return createNameText(parent);
				}
				if (key == ViewsViewsRepository.ViewReference.Properties.referencedView) {
					return createReferencedViewFlatComboViewer(parent);
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
		propertiesGroup.setText(ViewsMessages.ViewReferencePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, ViewsMessages.ViewReferencePropertiesEditionPart_NameLabel, propertiesEditingComponent.isRequired(ViewsViewsRepository.ViewReference.Properties.name, ViewsViewsRepository.SWT_KIND));
		name = new Text(parent, SWT.BORDER);
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
				if (propertiesEditingComponent != null)
					propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(ViewReferencePropertiesEditionPartImpl.this, ViewsViewsRepository.ViewReference.Properties.name, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, name.getText()));
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
					if (propertiesEditingComponent != null)
						propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(ViewReferencePropertiesEditionPartImpl.this, ViewsViewsRepository.ViewReference.Properties.name, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, ViewsViewsRepository.ViewReference.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditingComponent.getHelpContent(ViewsViewsRepository.ViewReference.Properties.name, ViewsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createReferencedViewFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, ViewsMessages.ViewReferencePropertiesEditionPart_ReferencedViewLabel, propertiesEditingComponent.isRequired(ViewsViewsRepository.ViewReference.Properties.referencedView, ViewsViewsRepository.SWT_KIND));
		referencedView = new EObjectFlatComboViewer(parent, !propertiesEditingComponent.isRequired(ViewsViewsRepository.ViewReference.Properties.referencedView, ViewsViewsRepository.SWT_KIND));
		referencedView.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		referencedView.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(ViewReferencePropertiesEditionPartImpl.this, ViewsViewsRepository.ViewReference.Properties.referencedView, PropertiesEditingEventImpl.CHANGE, PropertiesEditingEventImpl.SET, null, getReferencedView()));
			}

		});
		GridData referencedViewData = new GridData(GridData.FILL_HORIZONTAL);
		referencedView.setLayoutData(referencedViewData);
		referencedView.setID(ViewsViewsRepository.ViewReference.Properties.referencedView);
		SWTUtils.createHelpButton(parent, propertiesEditingComponent.getHelpContent(ViewsViewsRepository.ViewReference.Properties.referencedView, ViewsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.notify.PropertiesEditingListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.notify.PropertiesEditingEvent)
	 * 
	 */
	public void firePropertiesChanged(PropertiesEditingEvent event) {
		// Start of user code for tab synchronization

// End of user code
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.views.parts.ViewReferencePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.views.parts.ViewReferencePropertiesEditionPart#setName(String newValue)
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
	 * @see org.eclipse.emf.eef.views.parts.ViewReferencePropertiesEditionPart#getReferencedView()
	 * 
	 */
	public EObject getReferencedView() {
		if (referencedView.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) referencedView.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.views.parts.ViewReferencePropertiesEditionPart#initReferencedView(EObjectFlatComboSettings)
	 */
	public void initReferencedView(EObjectFlatComboSettings settings) {
		referencedView.setInput(settings);
		if (current != null) {
			referencedView.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.views.parts.ViewReferencePropertiesEditionPart#setReferencedView(EObject newValue)
	 * 
	 */
	public void setReferencedView(EObject newValue) {
		if (newValue != null) {
			referencedView.setSelection(new StructuredSelection(newValue));
		} else {
			referencedView.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.views.parts.ViewReferencePropertiesEditionPart#setReferencedViewButtonMode(ButtonsModeEnum newValue)
	 */
	public void setReferencedViewButtonMode(ButtonsModeEnum newValue) {
		referencedView.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.views.parts.ViewReferencePropertiesEditionPart#addFilterReferencedView(ViewerFilter filter)
	 * 
	 */
	public void addFilterToReferencedView(ViewerFilter filter) {
		referencedView.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.views.parts.ViewReferencePropertiesEditionPart#addBusinessFilterReferencedView(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToReferencedView(ViewerFilter filter) {
		referencedView.addBusinessRuleFilter(filter);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.parts.PropertiesEditingPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ViewsMessages.ViewReference_Part_Title;
	}

	// Start of user code additional methods
 	
	// End of user code


}
