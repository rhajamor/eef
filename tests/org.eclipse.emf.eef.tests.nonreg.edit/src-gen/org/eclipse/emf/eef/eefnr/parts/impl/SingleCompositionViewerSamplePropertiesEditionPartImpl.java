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
package org.eclipse.emf.eef.eefnr.parts.impl;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.eefnr.parts.EefnrViewsRepository;
import org.eclipse.emf.eef.eefnr.parts.SingleCompositionViewerSamplePropertiesEditionPart;
import org.eclipse.emf.eef.eefnr.providers.EefnrMessages;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.widgets.SingleCompositionViewer;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.ControlListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.ui.internal.forms.widgets.FormUtil;


// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class SingleCompositionViewerSamplePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, SingleCompositionViewerSamplePropertiesEditionPart {

	protected SingleCompositionViewer<? extends EObject> singlecompositionviewerSingleRequiredProperty;
	protected SingleCompositionViewer<? extends EObject> singlecompositionviewerSingleOptionalProperty;
	protected SingleCompositionViewer<? extends EObject> singlecompositionviewerMultiRequiredProperty;
	protected SingleCompositionViewer<? extends EObject> singlecompositionviewerMultiOptionalProperty;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public SingleCompositionViewerSamplePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence singleCompositionViewerSampleStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = singleCompositionViewerSampleStep.addStep(EefnrViewsRepository.SingleCompositionViewerSample.Properties.class);
		propertiesStep.addStep(EefnrViewsRepository.SingleCompositionViewerSample.Properties.singlecompositionviewerSingleRequiredProperty);
		propertiesStep.addStep(EefnrViewsRepository.SingleCompositionViewerSample.Properties.singlecompositionviewerSingleOptionalProperty);
		propertiesStep.addStep(EefnrViewsRepository.SingleCompositionViewerSample.Properties.singlecompositionviewerMultiRequiredProperty);
		propertiesStep.addStep(EefnrViewsRepository.SingleCompositionViewerSample.Properties.singlecompositionviewerMultiOptionalProperty);
		
		
		composer = new PartComposer(singleCompositionViewerSampleStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EefnrViewsRepository.SingleCompositionViewerSample.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == EefnrViewsRepository.SingleCompositionViewerSample.Properties.singlecompositionviewerSingleRequiredProperty) {
					return createSinglecompositionviewerSingleRequiredPropertySingleCompositionViewer(parent);
				}
				if (key == EefnrViewsRepository.SingleCompositionViewerSample.Properties.singlecompositionviewerSingleOptionalProperty) {
					return createSinglecompositionviewerSingleOptionalPropertySingleCompositionViewer(parent);
				}
				if (key == EefnrViewsRepository.SingleCompositionViewerSample.Properties.singlecompositionviewerMultiRequiredProperty) {
					return createSinglecompositionviewerMultiRequiredPropertySingleCompositionViewer(parent);
				}
				if (key == EefnrViewsRepository.SingleCompositionViewerSample.Properties.singlecompositionviewerMultiOptionalProperty) {
					return createSinglecompositionviewerMultiOptionalPropertySingleCompositionViewer(parent);
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
		propertiesGroup.setText(EefnrMessages.SingleCompositionViewerSamplePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createSinglecompositionviewerSingleRequiredPropertySingleCompositionViewer(Composite parent) {
		GridData singlecompositionviewerSingleRequiredPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		singlecompositionviewerSingleRequiredPropertyData.horizontalSpan = 3;
		this.singlecompositionviewerSingleRequiredProperty = new SingleCompositionViewer<EObject>(getDescription(EefnrViewsRepository.SingleCompositionViewerSample.Properties.singlecompositionviewerSingleRequiredProperty, EefnrMessages.SingleCompositionViewerSamplePropertiesEditionPart_SinglecompositionviewerSingleRequiredPropertyLabel), parent, SWT.NONE, null, EefnrViewsRepository.SWT_KIND, propertiesEditionComponent.isRequired(EefnrViewsRepository.SingleCompositionViewerSample.Properties.singlecompositionviewerSingleRequiredProperty, EefnrViewsRepository.SWT_KIND));
		this.singlecompositionviewerSingleRequiredProperty.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		this.singlecompositionviewerSingleRequiredProperty.setLayoutData(singlecompositionviewerSingleRequiredPropertyData);
			this.singlecompositionviewerSingleRequiredProperty.addSelectionChangedListener(new ISelectionChangedListener() {

				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
				 */
				public void selectionChanged(SelectionChangedEvent event) {
					if (propertiesEditionComponent != null) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SingleCompositionViewerSamplePropertiesEditionPartImpl.this, EefnrViewsRepository.SingleCompositionViewerSample.Properties.singlecompositionviewerSingleRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getSinglecompositionviewerSingleRequiredProperty()));
						singlecompositionviewerSingleRequiredProperty.update(getSinglecompositionviewerSingleRequiredProperty());
						ScrolledComposite scrolledComposite = (ScrolledComposite)view.getParent().getParent();
						Composite c = (Composite) view.getParent();
						Rectangle clientArea = scrolledComposite.getClientArea();

						Point newSize = scrolledComposite.computeSize(FormUtil.getWidthHint(
								clientArea.width, c), FormUtil.getHeightHint(clientArea.height,
								c));
						scrolledComposite.setMinSize(newSize);
					}
				}
			});

			this.singlecompositionviewerSingleRequiredProperty.addCheckBoxSelectionListener(new SelectionListener() {

				public void widgetSelected(SelectionEvent e) {
					if(!singlecompositionviewerSingleRequiredProperty.getCheckBoxSelection()) {
						if (propertiesEditionComponent != null) {
							propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SingleCompositionViewerSamplePropertiesEditionPartImpl.this, EefnrViewsRepository.SingleCompositionViewerSample.Properties.singlecompositionviewerSingleRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, null));
							singlecompositionviewerSingleRequiredProperty.update(null);
						}
					}
				}

				public void widgetDefaultSelected(SelectionEvent e) {

				}
			});
		return parent;
	}

	
	protected Composite createSinglecompositionviewerSingleOptionalPropertySingleCompositionViewer(Composite parent) {
		GridData singlecompositionviewerSingleOptionalPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		singlecompositionviewerSingleOptionalPropertyData.horizontalSpan = 3;
		this.singlecompositionviewerSingleOptionalProperty = new SingleCompositionViewer<EObject>(getDescription(EefnrViewsRepository.SingleCompositionViewerSample.Properties.singlecompositionviewerSingleOptionalProperty, EefnrMessages.SingleCompositionViewerSamplePropertiesEditionPart_SinglecompositionviewerSingleOptionalPropertyLabel), parent, SWT.NONE, null, EefnrViewsRepository.SWT_KIND, propertiesEditionComponent.isRequired(EefnrViewsRepository.SingleCompositionViewerSample.Properties.singlecompositionviewerSingleOptionalProperty, EefnrViewsRepository.SWT_KIND));
		this.singlecompositionviewerSingleOptionalProperty.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		this.singlecompositionviewerSingleOptionalProperty.setLayoutData(singlecompositionviewerSingleOptionalPropertyData);
			this.singlecompositionviewerSingleOptionalProperty.addSelectionChangedListener(new ISelectionChangedListener() {

				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
				 */
				public void selectionChanged(SelectionChangedEvent event) {
					if (propertiesEditionComponent != null) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SingleCompositionViewerSamplePropertiesEditionPartImpl.this, EefnrViewsRepository.SingleCompositionViewerSample.Properties.singlecompositionviewerSingleOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getSinglecompositionviewerSingleOptionalProperty()));
						singlecompositionviewerSingleOptionalProperty.update(getSinglecompositionviewerSingleOptionalProperty());
						ScrolledComposite scrolledComposite = (ScrolledComposite)view.getParent().getParent();
						Composite c = (Composite) view.getParent();
						Rectangle clientArea = scrolledComposite.getClientArea();

						Point newSize = scrolledComposite.computeSize(FormUtil.getWidthHint(
								clientArea.width, c), FormUtil.getHeightHint(clientArea.height,
								c));
						scrolledComposite.setMinSize(newSize);
					}
				}
			});

			this.singlecompositionviewerSingleOptionalProperty.addCheckBoxSelectionListener(new SelectionListener() {

				public void widgetSelected(SelectionEvent e) {
					if(!singlecompositionviewerSingleOptionalProperty.getCheckBoxSelection()) {
						if (propertiesEditionComponent != null) {
							propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SingleCompositionViewerSamplePropertiesEditionPartImpl.this, EefnrViewsRepository.SingleCompositionViewerSample.Properties.singlecompositionviewerSingleOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, null));
							singlecompositionviewerSingleOptionalProperty.update(null);
						}
					}
				}

				public void widgetDefaultSelected(SelectionEvent e) {

				}
			});
		return parent;
	}

	
	protected Composite createSinglecompositionviewerMultiRequiredPropertySingleCompositionViewer(Composite parent) {
		GridData singlecompositionviewerMultiRequiredPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		singlecompositionviewerMultiRequiredPropertyData.horizontalSpan = 3;
		this.singlecompositionviewerMultiRequiredProperty = new SingleCompositionViewer<EObject>(getDescription(EefnrViewsRepository.SingleCompositionViewerSample.Properties.singlecompositionviewerMultiRequiredProperty, EefnrMessages.SingleCompositionViewerSamplePropertiesEditionPart_SinglecompositionviewerMultiRequiredPropertyLabel), parent, SWT.NONE, null, EefnrViewsRepository.SWT_KIND, propertiesEditionComponent.isRequired(EefnrViewsRepository.SingleCompositionViewerSample.Properties.singlecompositionviewerMultiRequiredProperty, EefnrViewsRepository.SWT_KIND));
		this.singlecompositionviewerMultiRequiredProperty.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		this.singlecompositionviewerMultiRequiredProperty.setLayoutData(singlecompositionviewerMultiRequiredPropertyData);
			this.singlecompositionviewerMultiRequiredProperty.addSelectionChangedListener(new ISelectionChangedListener() {

				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
				 */
				public void selectionChanged(SelectionChangedEvent event) {
					if (propertiesEditionComponent != null) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SingleCompositionViewerSamplePropertiesEditionPartImpl.this, EefnrViewsRepository.SingleCompositionViewerSample.Properties.singlecompositionviewerMultiRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getSinglecompositionviewerMultiRequiredProperty()));
						singlecompositionviewerMultiRequiredProperty.update(getSinglecompositionviewerMultiRequiredProperty());
						ScrolledComposite scrolledComposite = (ScrolledComposite)view.getParent().getParent();
						Composite c = (Composite) view.getParent();
						Rectangle clientArea = scrolledComposite.getClientArea();

						Point newSize = scrolledComposite.computeSize(FormUtil.getWidthHint(
								clientArea.width, c), FormUtil.getHeightHint(clientArea.height,
								c));
						scrolledComposite.setMinSize(newSize);
					}
				}
			});

			this.singlecompositionviewerMultiRequiredProperty.addCheckBoxSelectionListener(new SelectionListener() {

				public void widgetSelected(SelectionEvent e) {
					if(!singlecompositionviewerMultiRequiredProperty.getCheckBoxSelection()) {
						if (propertiesEditionComponent != null) {
							propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SingleCompositionViewerSamplePropertiesEditionPartImpl.this, EefnrViewsRepository.SingleCompositionViewerSample.Properties.singlecompositionviewerMultiRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, null));
							singlecompositionviewerMultiRequiredProperty.update(null);
						}
					}
				}

				public void widgetDefaultSelected(SelectionEvent e) {

				}
			});
		return parent;
	}

	
	protected Composite createSinglecompositionviewerMultiOptionalPropertySingleCompositionViewer(Composite parent) {
		GridData singlecompositionviewerMultiOptionalPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		singlecompositionviewerMultiOptionalPropertyData.horizontalSpan = 3;
		this.singlecompositionviewerMultiOptionalProperty = new SingleCompositionViewer<EObject>(getDescription(EefnrViewsRepository.SingleCompositionViewerSample.Properties.singlecompositionviewerMultiOptionalProperty, EefnrMessages.SingleCompositionViewerSamplePropertiesEditionPart_SinglecompositionviewerMultiOptionalPropertyLabel), parent, SWT.NONE, null, EefnrViewsRepository.SWT_KIND, propertiesEditionComponent.isRequired(EefnrViewsRepository.SingleCompositionViewerSample.Properties.singlecompositionviewerMultiOptionalProperty, EefnrViewsRepository.SWT_KIND));
		this.singlecompositionviewerMultiOptionalProperty.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		this.singlecompositionviewerMultiOptionalProperty.setLayoutData(singlecompositionviewerMultiOptionalPropertyData);
			this.singlecompositionviewerMultiOptionalProperty.addSelectionChangedListener(new ISelectionChangedListener() {

				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
				 */
				public void selectionChanged(SelectionChangedEvent event) {
					if (propertiesEditionComponent != null) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SingleCompositionViewerSamplePropertiesEditionPartImpl.this, EefnrViewsRepository.SingleCompositionViewerSample.Properties.singlecompositionviewerMultiOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getSinglecompositionviewerMultiOptionalProperty()));
						singlecompositionviewerMultiOptionalProperty.update(getSinglecompositionviewerMultiOptionalProperty());
						ScrolledComposite scrolledComposite = (ScrolledComposite)view.getParent().getParent();
						Composite c = (Composite) view.getParent();
						Rectangle clientArea = scrolledComposite.getClientArea();

						Point newSize = scrolledComposite.computeSize(FormUtil.getWidthHint(
								clientArea.width, c), FormUtil.getHeightHint(clientArea.height,
								c));
						scrolledComposite.setMinSize(newSize);
					}
				}
			});

			this.singlecompositionviewerMultiOptionalProperty.addCheckBoxSelectionListener(new SelectionListener() {

				public void widgetSelected(SelectionEvent e) {
					if(!singlecompositionviewerMultiOptionalProperty.getCheckBoxSelection()) {
						if (propertiesEditionComponent != null) {
							propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SingleCompositionViewerSamplePropertiesEditionPartImpl.this, EefnrViewsRepository.SingleCompositionViewerSample.Properties.singlecompositionviewerMultiOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, null));
							singlecompositionviewerMultiOptionalProperty.update(null);
						}
					}
				}

				public void widgetDefaultSelected(SelectionEvent e) {

				}
			});
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
	 * @see org.eclipse.emf.eef.eefnr.parts.SingleCompositionViewerSamplePropertiesEditionPart#getSinglecompositionviewerSingleRequiredProperty()
	 * 
	 */
	public EObject getSinglecompositionviewerSingleRequiredProperty() {
		return singlecompositionviewerSingleRequiredProperty.getElement();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.SingleCompositionViewerSamplePropertiesEditionPart#initSinglecompositionviewerSingleRequiredProperty(EObject current, EReference containingFeature, EReference feature, EditingDomain editingDomain)
	 */
	public void initSinglecompositionviewerSingleRequiredProperty(EObject current, EReference containingFeature, EReference feature, EditingDomain editingDomain) {
		this.singlecompositionviewerSingleRequiredProperty.setInput(current, feature, resourceSet);
		this.singlecompositionviewerSingleRequiredProperty.init(editingDomain);
		if (current != null) {
			this.singlecompositionviewerSingleRequiredProperty.setSelection(new StructuredSelection(current), feature);
		}
		singlecompositionviewerSingleRequiredProperty.refresh();

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.SingleCompositionViewerSamplePropertiesEditionPart#setSinglecompositionviewerSingleRequiredProperty(EObject newValue)
	 * 
	 */
	public void setSinglecompositionviewerSingleRequiredProperty(EObject newValue) {
		singlecompositionviewerSingleRequiredProperty.update(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.SingleCompositionViewerSamplePropertiesEditionPart#initSinglecompositionviewerSingleRequiredProperty(ControlListener listener)
	 */
	public void addSinglecompositionviewerSingleRequiredPropertyControlListener(ControlListener listener) {
		singlecompositionviewerSingleRequiredProperty.addControlListener(listener);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.SingleCompositionViewerSamplePropertiesEditionPart#getSinglecompositionviewerSingleOptionalProperty()
	 * 
	 */
	public EObject getSinglecompositionviewerSingleOptionalProperty() {
		return singlecompositionviewerSingleOptionalProperty.getElement();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.SingleCompositionViewerSamplePropertiesEditionPart#initSinglecompositionviewerSingleOptionalProperty(EObject current, EReference containingFeature, EReference feature, EditingDomain editingDomain)
	 */
	public void initSinglecompositionviewerSingleOptionalProperty(EObject current, EReference containingFeature, EReference feature, EditingDomain editingDomain) {
		this.singlecompositionviewerSingleOptionalProperty.setInput(current, feature, resourceSet);
		this.singlecompositionviewerSingleOptionalProperty.init(editingDomain);
		if (current != null) {
			this.singlecompositionviewerSingleOptionalProperty.setSelection(new StructuredSelection(current), feature);
		}
		singlecompositionviewerSingleOptionalProperty.refresh();

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.SingleCompositionViewerSamplePropertiesEditionPart#setSinglecompositionviewerSingleOptionalProperty(EObject newValue)
	 * 
	 */
	public void setSinglecompositionviewerSingleOptionalProperty(EObject newValue) {
		singlecompositionviewerSingleOptionalProperty.update(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.SingleCompositionViewerSamplePropertiesEditionPart#initSinglecompositionviewerSingleOptionalProperty(ControlListener listener)
	 */
	public void addSinglecompositionviewerSingleOptionalPropertyControlListener(ControlListener listener) {
		singlecompositionviewerSingleOptionalProperty.addControlListener(listener);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.SingleCompositionViewerSamplePropertiesEditionPart#getSinglecompositionviewerMultiRequiredProperty()
	 * 
	 */
	public EObject getSinglecompositionviewerMultiRequiredProperty() {
		return singlecompositionviewerMultiRequiredProperty.getElement();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.SingleCompositionViewerSamplePropertiesEditionPart#initSinglecompositionviewerMultiRequiredProperty(EObject current, EReference containingFeature, EReference feature, EditingDomain editingDomain)
	 */
	public void initSinglecompositionviewerMultiRequiredProperty(EObject current, EReference containingFeature, EReference feature, EditingDomain editingDomain) {
		this.singlecompositionviewerMultiRequiredProperty.setInput(current, feature, resourceSet);
		this.singlecompositionviewerMultiRequiredProperty.init(editingDomain);
		if (current != null) {
			this.singlecompositionviewerMultiRequiredProperty.setSelection(new StructuredSelection(current), feature);
		}
		singlecompositionviewerMultiRequiredProperty.refresh();

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.SingleCompositionViewerSamplePropertiesEditionPart#setSinglecompositionviewerMultiRequiredProperty(EObject newValue)
	 * 
	 */
	public void setSinglecompositionviewerMultiRequiredProperty(EObject newValue) {
		singlecompositionviewerMultiRequiredProperty.update(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.SingleCompositionViewerSamplePropertiesEditionPart#initSinglecompositionviewerMultiRequiredProperty(ControlListener listener)
	 */
	public void addSinglecompositionviewerMultiRequiredPropertyControlListener(ControlListener listener) {
		singlecompositionviewerMultiRequiredProperty.addControlListener(listener);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.SingleCompositionViewerSamplePropertiesEditionPart#getSinglecompositionviewerMultiOptionalProperty()
	 * 
	 */
	public EObject getSinglecompositionviewerMultiOptionalProperty() {
		return singlecompositionviewerMultiOptionalProperty.getElement();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.SingleCompositionViewerSamplePropertiesEditionPart#initSinglecompositionviewerMultiOptionalProperty(EObject current, EReference containingFeature, EReference feature, EditingDomain editingDomain)
	 */
	public void initSinglecompositionviewerMultiOptionalProperty(EObject current, EReference containingFeature, EReference feature, EditingDomain editingDomain) {
		this.singlecompositionviewerMultiOptionalProperty.setInput(current, feature, resourceSet);
		this.singlecompositionviewerMultiOptionalProperty.init(editingDomain);
		if (current != null) {
			this.singlecompositionviewerMultiOptionalProperty.setSelection(new StructuredSelection(current), feature);
		}
		singlecompositionviewerMultiOptionalProperty.refresh();

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.SingleCompositionViewerSamplePropertiesEditionPart#setSinglecompositionviewerMultiOptionalProperty(EObject newValue)
	 * 
	 */
	public void setSinglecompositionviewerMultiOptionalProperty(EObject newValue) {
		singlecompositionviewerMultiOptionalProperty.update(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.SingleCompositionViewerSamplePropertiesEditionPart#initSinglecompositionviewerMultiOptionalProperty(ControlListener listener)
	 */
	public void addSinglecompositionviewerMultiOptionalPropertyControlListener(ControlListener listener) {
		singlecompositionviewerMultiOptionalProperty.addControlListener(listener);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EefnrMessages.SingleCompositionViewerSample_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
