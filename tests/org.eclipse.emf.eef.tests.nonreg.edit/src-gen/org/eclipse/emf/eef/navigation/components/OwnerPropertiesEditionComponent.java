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
package org.eclipse.emf.eef.navigation.components;

// Start of user code for imports
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.eefnr.EefnrPackage;
import org.eclipse.emf.eef.eefnr.navigation.NavigationFactory;
import org.eclipse.emf.eef.eefnr.navigation.NavigationPackage;
import org.eclipse.emf.eef.eefnr.navigation.Owner;
import org.eclipse.emf.eef.eefnr.navigation.parts.NavigationViewsRepository;
import org.eclipse.emf.eef.eefnr.navigation.parts.OwnerPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;
import org.eclipse.emf.eef.runtime.impl.filters.EObjectStrictFilter;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.settings.EEFEditorSettingsBuilder;
import org.eclipse.emf.eef.runtime.ui.widgets.settings.EEFEditorSettingsBuilder.EEFEditorSettingsImpl;
import org.eclipse.emf.eef.runtime.ui.widgets.settings.NavigationStepBuilder;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
	

// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class OwnerPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for multipleSampleForTableComposition ReferencesTable
	 */
	protected ReferencesTableSettings multipleSampleForTableCompositionSettings;
	
	/**
	 * Settings for multipleSampleForAdvancedTableComposition ReferencesTable
	 */
	protected ReferencesTableSettings multipleSampleForAdvancedTableCompositionSettings;
	
	/**
	 * Settings for multipleSampleForReferencesTable ReferencesTable
	 */
	private	ReferencesTableSettings multipleSampleForReferencesTableSettings;
	
	/**
	 * Settings for multipleSampleForAdvancedReferencesTable ReferencesTable
	 */
	private	ReferencesTableSettings multipleSampleForAdvancedReferencesTableSettings;
	
	/**
	 * Settings for multipleSampleForFlatReferencesTables ReferencesTable
	 */
	private	ReferencesTableSettings multipleSampleForFlatReferencesTablesSettings;
	
	/**
	 * Settings for singleSampleForTableComposition ReferencesTable
	 */
	protected ReferencesTableSettings singleSampleForTableCompositionSettings;
	
	/**
	 * Settings for singleSampleForAdvancedTableComposition ReferencesTable
	 */
	protected ReferencesTableSettings singleSampleForAdvancedTableCompositionSettings;
	
	/**
	 * Settings for singleSampleForReferencesTable ReferencesTable
	 */
	private	ReferencesTableSettings singleSampleForReferencesTableSettings;
	
	/**
	 * Settings for singleSampleForAdvancedReferencesTable ReferencesTable
	 */
	private	ReferencesTableSettings singleSampleForAdvancedReferencesTableSettings;
	
	/**
	 * Settings for singleSampleForFlatReferencesTable ReferencesTable
	 */
	private	ReferencesTableSettings singleSampleForFlatReferencesTableSettings;
	
	/**
	 * Settings for singleContainmentForEObjectFlatComboViewer EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings singleContainmentForEObjectFlatComboViewerSettings;
	
	/**
	 * Settings for singleReferenceForEObjectFlatComboViewer EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings singleReferenceForEObjectFlatComboViewerSettings;
	
	/**
	 * Settings for singleContainmentForAdvancedEObjectFlatComboViewer EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings singleContainmentForAdvancedEObjectFlatComboViewerSettings;
	
	/**
	 * Settings for singleReferenceForAdvancedEObjectFlatComboViewer EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings singleReferenceForAdvancedEObjectFlatComboViewerSettings;
	
	
	/**
	 * Settings for multipleSampleForTableComposition editor
	 */
	protected EEFEditorSettingsImpl multipleSampleForTableCompositionSettings = (EEFEditorSettingsImpl) EEFEditorSettingsBuilder.create(semanticObject, NavigationPackage.eINSTANCE.getMultipleReferencer_MultipleSampleForTableComposition())
																														.nextStep(NavigationStepBuilder.create(NavigationPackage.eINSTANCE.getOwner_MultipleReferencers())			
																																	.index(0).build())
																														.build();
	
	/**
	 * Settings for multipleSampleForAdvancedTableComposition editor
	 */
	protected EEFEditorSettingsImpl multipleSampleForAdvancedTableCompositionSettings = (EEFEditorSettingsImpl) EEFEditorSettingsBuilder.create(semanticObject, NavigationPackage.eINSTANCE.getMultipleReferencer_MultipleSampleForAdvancedTableComposition())
																														.nextStep(NavigationStepBuilder.create(NavigationPackage.eINSTANCE.getOwner_MultipleReferencers())			
																																	.index(0).build())
																														.build();
	
	/**
	 * Settings for multipleSampleForReferencesTable editor
	 */
	protected EEFEditorSettingsImpl multipleSampleForReferencesTableSettings = (EEFEditorSettingsImpl) EEFEditorSettingsBuilder.create(semanticObject, NavigationPackage.eINSTANCE.getMultipleReferencer_MultipleSampleForReferencesTable())
																														.nextStep(NavigationStepBuilder.create(NavigationPackage.eINSTANCE.getOwner_MultipleReferencers())			
																																	.index(0).build())
																														.build();
	
	/**
	 * Settings for multipleSampleForAdvancedReferencesTable editor
	 */
	protected EEFEditorSettingsImpl multipleSampleForAdvancedReferencesTableSettings = (EEFEditorSettingsImpl) EEFEditorSettingsBuilder.create(semanticObject, NavigationPackage.eINSTANCE.getMultipleReferencer_MultipleSampleAdvancedReferencesTable())
																														.nextStep(NavigationStepBuilder.create(NavigationPackage.eINSTANCE.getOwner_MultipleReferencers())			
																																	.index(0).build())
																														.build();
	
	/**
	 * Settings for multipleSampleForFlatReferencesTables editor
	 */
	protected EEFEditorSettingsImpl multipleSampleForFlatReferencesTablesSettings = (EEFEditorSettingsImpl) EEFEditorSettingsBuilder.create(semanticObject, NavigationPackage.eINSTANCE.getMultipleReferencer_MultipleSampleForFlatReferencesTable())
																														.nextStep(NavigationStepBuilder.create(NavigationPackage.eINSTANCE.getOwner_MultipleReferencers())			
																																	.index(0).build())
																														.build();
	
	/**
	 * Settings for singleSampleForTableComposition editor
	 */
	protected EEFEditorSettingsImpl singleSampleForTableCompositionSettings = (EEFEditorSettingsImpl) EEFEditorSettingsBuilder.create(semanticObject, NavigationPackage.eINSTANCE.getSingleReferencer_SingleSampleForTableComposition())
																														.nextStep(NavigationStepBuilder.create(NavigationPackage.eINSTANCE.getOwner_SingleReferencers())			
																																	.index(0).build())
																														.build();
	
	/**
	 * Settings for singleSampleForAdvancedTableComposition editor
	 */
	protected EEFEditorSettingsImpl singleSampleForAdvancedTableCompositionSettings = (EEFEditorSettingsImpl) EEFEditorSettingsBuilder.create(semanticObject, NavigationPackage.eINSTANCE.getSingleReferencer_SingleSampleForAdvancedTableComposition())
																														.nextStep(NavigationStepBuilder.create(NavigationPackage.eINSTANCE.getOwner_SingleReferencers())			
																																	.index(0).build())
																														.build();
	
	/**
	 * Settings for singleSampleForReferencesTable editor
	 */
	protected EEFEditorSettingsImpl singleSampleForReferencesTableSettings = (EEFEditorSettingsImpl) EEFEditorSettingsBuilder.create(semanticObject, NavigationPackage.eINSTANCE.getSingleReferencer_SingleSampleForReferencesTable())
																														.nextStep(NavigationStepBuilder.create(NavigationPackage.eINSTANCE.getOwner_SingleReferencers())			
																																	.index(0).build())
																														.build();
	
	/**
	 * Settings for singleSampleForAdvancedReferencesTable editor
	 */
	protected EEFEditorSettingsImpl singleSampleForAdvancedReferencesTableSettings = (EEFEditorSettingsImpl) EEFEditorSettingsBuilder.create(semanticObject, NavigationPackage.eINSTANCE.getSingleReferencer_SingleSampleAdvancedReferencesTable())
																														.nextStep(NavigationStepBuilder.create(NavigationPackage.eINSTANCE.getOwner_SingleReferencers())			
																																	.index(0).build())
																														.build();
	
	/**
	 * Settings for singleSampleForFlatReferencesTable editor
	 */
	protected EEFEditorSettingsImpl singleSampleForFlatReferencesTableSettings = (EEFEditorSettingsImpl) EEFEditorSettingsBuilder.create(semanticObject, NavigationPackage.eINSTANCE.getSingleReferencer_SingleSampleForFlatReferencesTable())
																														.nextStep(NavigationStepBuilder.create(NavigationPackage.eINSTANCE.getOwner_SingleReferencers())			
																																	.index(0).build())
																														.build();
	
	/**
	 * Settings for singleContainmentForEObjectFlatComboViewer editor
	 */
	protected EEFEditorSettingsImpl singleContainmentForEObjectFlatComboViewerSettings = (EEFEditorSettingsImpl) EEFEditorSettingsBuilder.create(semanticObject, NavigationPackage.eINSTANCE.getSingleReferencer_SingleContainmentForEObjectFlatComboViewer())
																														.nextStep(NavigationStepBuilder.create(NavigationPackage.eINSTANCE.getOwner_SingleReferencers())			
																																	.index(0).build())
																														.build();
	
	/**
	 * Settings for singleReferenceForEObjectFlatComboViewer editor
	 */
	protected EEFEditorSettingsImpl singleReferenceForEObjectFlatComboViewerSettings = (EEFEditorSettingsImpl) EEFEditorSettingsBuilder.create(semanticObject, NavigationPackage.eINSTANCE.getSingleReferencer_SingleReferenceForEObjectFlatComboViewer())
																														.nextStep(NavigationStepBuilder.create(NavigationPackage.eINSTANCE.getOwner_SingleReferencers())			
																																	.index(0).build())
																														.build();
	
	/**
	 * Settings for singleContainmentForAdvancedEObjectFlatComboViewer editor
	 */
	protected EEFEditorSettingsImpl singleContainmentForAdvancedEObjectFlatComboViewerSettings = (EEFEditorSettingsImpl) EEFEditorSettingsBuilder.create(semanticObject, NavigationPackage.eINSTANCE.getSingleReferencer_SingleContainmentForAdvancedEObjectFlatComboViewer())
																														.nextStep(NavigationStepBuilder.create(NavigationPackage.eINSTANCE.getOwner_SingleReferencers())			
																																	.index(0).build())
																														.build();
	
	/**
	 * Settings for singleReferenceForAdvancedEObjectFlatComboViewer editor
	 */
	protected EEFEditorSettingsImpl singleReferenceForAdvancedEObjectFlatComboViewerSettings = (EEFEditorSettingsImpl) EEFEditorSettingsBuilder.create(semanticObject, NavigationPackage.eINSTANCE.getSingleReferencer_SingleReferenceForAdvancedEObjectFlatComboViewer())
																														.nextStep(NavigationStepBuilder.create(NavigationPackage.eINSTANCE.getOwner_SingleReferencers())			
																																	.index(0).build())
																														.build();
	
	/**
	 * Default constructor
	 * 
	 */
	public OwnerPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject owner, String editing_mode) {
		super(editingContext, owner, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = NavigationViewsRepository.class;
		partKey = NavigationViewsRepository.Owner.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(Object key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (editingPart != null && key == partKey) {
			editingPart.setContext(elt, allResource);
			final Owner owner = (Owner)elt;
			final OwnerPropertiesEditionPart basePart = (OwnerPropertiesEditionPart)editingPart;
			// init values
			if (owner.getName() != null && isAccessible(NavigationViewsRepository.Owner.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), owner.getName()));
			
			if (isAccessible(NavigationViewsRepository.Owner.Properties.multipleSampleForTableComposition)) {
				multipleSampleForTableCompositionSettings = new ReferencesTableSettings(owner, NavigationPackage.eINSTANCE.getOwner_MultipleReferencers(), NavigationPackage.eINSTANCE.getMultipleReferencer_MultipleSampleForTableComposition());
				basePart.initMultipleSampleForTableComposition(multipleSampleForTableCompositionSettings);
			}
			if (isAccessible(NavigationViewsRepository.Owner.Properties.multipleSampleForAdvancedTableComposition)) {
				multipleSampleForAdvancedTableCompositionSettings = new ReferencesTableSettings(owner, NavigationPackage.eINSTANCE.getOwner_MultipleReferencers(), NavigationPackage.eINSTANCE.getMultipleReferencer_MultipleSampleForAdvancedTableComposition());
				basePart.initMultipleSampleForAdvancedTableComposition(multipleSampleForAdvancedTableCompositionSettings);
			}
			if (isAccessible(NavigationViewsRepository.Owner.Properties.multipleSampleForReferencesTable)) {
				multipleSampleForReferencesTableSettings = new ReferencesTableSettings(owner, NavigationPackage.eINSTANCE.getOwner_MultipleReferencers(), NavigationPackage.eINSTANCE.getMultipleReferencer_MultipleSampleForReferencesTable());
				basePart.initMultipleSampleForReferencesTable(multipleSampleForReferencesTableSettings);
			}
			if (isAccessible(NavigationViewsRepository.Owner.Properties.multipleSampleForAdvancedReferencesTable)) {
				multipleSampleForAdvancedReferencesTableSettings = new ReferencesTableSettings(owner, NavigationPackage.eINSTANCE.getMultipleReferencer_MultipleSampleAdvancedReferencesTable());
				basePart.initMultipleSampleForAdvancedReferencesTable(multipleSampleForAdvancedReferencesTableSettings);
			}
			if (isAccessible(NavigationViewsRepository.Owner.Properties.multipleSampleForFlatReferencesTable)) {
				multipleSampleForFlatReferencesTablesSettings = new ReferencesTableSettings(owner, NavigationPackage.eINSTANCE.getOwner_MultipleReferencers(), NavigationPackage.eINSTANCE.getMultipleReferencer_MultipleSampleForFlatReferencesTable());
				basePart.initMultipleSampleForFlatReferencesTable(multipleSampleForFlatReferencesTablesSettings);
			}
			if (isAccessible(NavigationViewsRepository.Owner.Properties.singleSampleForTableComposition)) {
				singleSampleForTableCompositionSettings = new ReferencesTableSettings(owner, NavigationPackage.eINSTANCE.getOwner_SingleReferencers(), NavigationPackage.eINSTANCE.getSingleReferencer_SingleSampleForTableComposition());
				basePart.initSingleSampleForTableComposition(singleSampleForTableCompositionSettings);
			}
			if (isAccessible(NavigationViewsRepository.Owner.Properties.singleSampleForAdvancedTableComposition)) {
				singleSampleForAdvancedTableCompositionSettings = new ReferencesTableSettings(owner, NavigationPackage.eINSTANCE.getOwner_SingleReferencers(), NavigationPackage.eINSTANCE.getSingleReferencer_SingleSampleForAdvancedTableComposition());
				basePart.initSingleSampleForAdvancedTableComposition(singleSampleForAdvancedTableCompositionSettings);
			}
			if (isAccessible(NavigationViewsRepository.Owner.Properties.singleSampleForReferencesTable)) {
				singleSampleForReferencesTableSettings = new ReferencesTableSettings(owner, NavigationPackage.eINSTANCE.getOwner_SingleReferencers(), NavigationPackage.eINSTANCE.getSingleReferencer_SingleSampleForReferencesTable());
				basePart.initSingleSampleForReferencesTable(singleSampleForReferencesTableSettings);
			}
			if (isAccessible(NavigationViewsRepository.Owner.Properties.singleSampleForAdvancedReferencesTable)) {
				singleSampleForAdvancedReferencesTableSettings = new ReferencesTableSettings(owner, NavigationPackage.eINSTANCE.getOwner_SingleReferencers(), NavigationPackage.eINSTANCE.getSingleReferencer_SingleSampleAdvancedReferencesTable());
				basePart.initSingleSampleForAdvancedReferencesTable(singleSampleForAdvancedReferencesTableSettings);
			}
			if (isAccessible(NavigationViewsRepository.Owner.Properties.singleSampleForFlatReferencesTable)) {
				singleSampleForFlatReferencesTableSettings = new ReferencesTableSettings(owner, NavigationPackage.eINSTANCE.getOwner_SingleReferencers(), NavigationPackage.eINSTANCE.getSingleReferencer_SingleSampleForFlatReferencesTable());
				basePart.initSingleSampleForFlatReferencesTable(singleSampleForFlatReferencesTableSettings);
			}
			// FIXME NO VALID CASE INTO template public updater(editionElement : PropertiesEditionElement, view : View, pec : PropertiesEditionComponent) in widgetControl.mtl module, with the values : singleContainmentForEObjectFlatComboViewer, Owner, Owner.
			if (isAccessible(NavigationViewsRepository.Owner.Properties.singleReferencesForEObjectFlatComboViewer)) {
				// init part
				singleReferenceForEObjectFlatComboViewerSettings = new EObjectFlatComboSettings(owner, NavigationPackage.eINSTANCE.getOwner_SingleReferencers(), NavigationPackage.eINSTANCE.getSingleReferencer_SingleReferenceForEObjectFlatComboViewer());
				basePart.initSingleReferencesForEObjectFlatComboViewer(singleReferenceForEObjectFlatComboViewerSettings);
				// set the button mode
				basePart.setSingleReferencesForEObjectFlatComboViewerButtonMode(ButtonsModeEnum.BROWSE);
			}
			// FIXME NO VALID CASE INTO template public updater(editionElement : PropertiesEditionElement, view : View, pec : PropertiesEditionComponent) in widgetControl.mtl module, with the values : singleContainmentForAdvancedEObjectFlatComboViewer, Owner, Owner.
			if (isAccessible(NavigationViewsRepository.Owner.Properties.singleReferencesForAdvancedEObjectFlatComboViewer)) {
				// init part
				singleReferenceForAdvancedEObjectFlatComboViewerSettings = new EObjectFlatComboSettings(owner, NavigationPackage.eINSTANCE.getOwner_SingleReferencers(), NavigationPackage.eINSTANCE.getSingleReferencer_SingleReferenceForAdvancedEObjectFlatComboViewer());
				basePart.initSingleReferencesForAdvancedEObjectFlatComboViewer(singleReferenceForAdvancedEObjectFlatComboViewerSettings);
				// set the button mode
				basePart.setSingleReferencesForAdvancedEObjectFlatComboViewerButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			
			if (isAccessible(NavigationViewsRepository.Owner.Properties.multipleSampleForTableComposition)) {
				basePart.addFilterToMultipleSampleForTableComposition(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 *
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Owner); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for multipleSampleForTableComposition
																																																																																																																																																																																
																																																																																																																																																																																// End of user code
			}
			if (isAccessible(NavigationViewsRepository.Owner.Properties.multipleSampleForAdvancedTableComposition)) {
				basePart.addFilterToMultipleSampleForAdvancedTableComposition(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 *
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Owner); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for multipleSampleForAdvancedTableComposition
																																																																																																																																																																																
																																																																																																																																																																																// End of user code
			}
			if (isAccessible(NavigationViewsRepository.Owner.Properties.multipleSampleForReferencesTable)) {
				basePart.addFilterToMultipleSampleForReferencesTable(new ViewerFilter() {
				
						/**
						 * {@inheritDoc}
						 * 
						 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
						 */
						public boolean select(Viewer viewer, Object parentElement, Object element) {
							return (element instanceof String && element.equals("")) || (element instanceof Owner); //$NON-NLS-1$ 
					}
				
				});
				// Start of user code for additional businessfilters for multipleSampleForReferencesTable
																																																																																																																																																																							
																																																																																																																																																																							// End of user code
			}
			if (isAccessible(NavigationViewsRepository.Owner.Properties.multipleSampleForAdvancedReferencesTable)) {
				basePart.addFilterToMultipleSampleForAdvancedReferencesTable(new ViewerFilter() {
				
						/**
						 * {@inheritDoc}
						 * 
						 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
						 */
						public boolean select(Viewer viewer, Object parentElement, Object element) {
							return (element instanceof String && element.equals("")) || (element instanceof Owner); //$NON-NLS-1$ 
					}
				
				});
				// Start of user code for additional businessfilters for multipleSampleForAdvancedReferencesTable
																																																																																																																																																																							
																																																																																																																																																																							// End of user code
			}
			if (isAccessible(NavigationViewsRepository.Owner.Properties.multipleSampleForFlatReferencesTable)) {
				basePart.addFilterToMultipleSampleForFlatReferencesTable(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInMultipleSampleForFlatReferencesTableTable((EObject)element));
						return element instanceof String && element.equals("");
					}
				
				});
				basePart.addFilterToMultipleSampleForFlatReferencesTable(new EObjectStrictFilter(NavigationPackage.eINSTANCE.getOwner()));
				// Start of user code for additional businessfilters for multipleSampleForFlatReferencesTables
																																																																																																																																																																																
																																																																																																																																																																																// End of user code
			}
			if (isAccessible(NavigationViewsRepository.Owner.Properties.singleSampleForTableComposition)) {
				basePart.addFilterToSingleSampleForTableComposition(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
			if (element instanceof String)
							return element.equals(""); //$NON-NLS-1$ 
						if (element instanceof Owner)
							return true;
						return element instanceof Resource;
					}
			
				});
				// Start of user code for additional businessfilters for singleSampleForTableComposition
																																																																																																																																																																																
																																																																																																																																																																																// End of user code
			}
			if (isAccessible(NavigationViewsRepository.Owner.Properties.singleSampleForAdvancedTableComposition)) {
				basePart.addFilterToSingleSampleForAdvancedTableComposition(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
			if (element instanceof String)
							return element.equals(""); //$NON-NLS-1$ 
						if (element instanceof Owner)
							return true;
						return element instanceof Resource;
					}
			
				});
				// Start of user code for additional businessfilters for singleSampleForAdvancedTableComposition
																																																																																																																																																																																
																																																																																																																																																																																// End of user code
			}
			if (isAccessible(NavigationViewsRepository.Owner.Properties.singleSampleForReferencesTable)) {
				basePart.addFilterToSingleSampleForReferencesTable(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInSingleSampleForReferencesTableTable((EObject)element));
						return element instanceof String && element.equals("");
					}
				
				});
				basePart.addFilterToSingleSampleForReferencesTable(new EObjectStrictFilter(NavigationPackage.eINSTANCE.getOwner()));
				// Start of user code for additional businessfilters for singleSampleForReferencesTable
																																																																																																																																																																	
																																																																																																																																																																	// End of user code
			}
			if (isAccessible(NavigationViewsRepository.Owner.Properties.singleSampleForAdvancedReferencesTable)) {
				basePart.addFilterToSingleSampleForAdvancedReferencesTable(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInSingleSampleForAdvancedReferencesTableTable((EObject)element));
						return element instanceof String && element.equals("");
					}
				
				});
				basePart.addFilterToSingleSampleForAdvancedReferencesTable(new EObjectStrictFilter(NavigationPackage.eINSTANCE.getOwner()));
				// Start of user code for additional businessfilters for singleSampleForAdvancedReferencesTable
																																																																																																																																																																	
																																																																																																																																																																	// End of user code
			}
			if (isAccessible(NavigationViewsRepository.Owner.Properties.singleSampleForFlatReferencesTable)) {
				basePart.addFilterToSingleSampleForFlatReferencesTable(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInSingleSampleForFlatReferencesTableTable((EObject)element));
						return element instanceof String && element.equals("");
					}
				
				});
				basePart.addFilterToSingleSampleForFlatReferencesTable(new EObjectStrictFilter(NavigationPackage.eINSTANCE.getOwner()));
				// Start of user code for additional businessfilters for singleSampleForFlatReferencesTable
																																																																																																																																																																																
																																																																																																																																																																																// End of user code
			}
			
			if (isAccessible(NavigationViewsRepository.Owner.Properties.singleReferencesForEObjectFlatComboViewer)) {
				basePart.addFilterToSingleReferencesForEObjectFlatComboViewer(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Owner); //$NON-NLS-1$ 
					}
				
				});
				// Start of user code for additional businessfilters for singleReferenceForEObjectFlatComboViewer
																																																																																																																																															
																																																																																																																																															// End of user code
			}
			
			if (isAccessible(NavigationViewsRepository.Owner.Properties.singleReferencesForAdvancedEObjectFlatComboViewer)) {
				basePart.addFilterToSingleReferencesForAdvancedEObjectFlatComboViewer(new EObjectFilter(NavigationPackage.eINSTANCE.getOwner()));
			}
			// init values for referenced views
			
			// init filters for referenced views
			
		}
		setInitializing(false);
	}

















	
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent#shouldProcess(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 */
	protected boolean shouldProcess(IPropertiesEditionEvent event) {
		if (event.getAffectedEditor() == NavigationViewsRepository.Owner.Properties.multipleSampleForTableComposition) {
			return (multipleSampleForTableCompositionSettings.getValue() == null) ? (event.getNewValue() != null) : (!multipleSampleForTableCompositionSettings.getValue().equals(event.getNewValue()));
		}
		if (event.getAffectedEditor() == NavigationViewsRepository.Owner.Properties.multipleSampleForAdvancedTableComposition) {
			return (multipleSampleForAdvancedTableCompositionSettings.getValue() == null) ? (event.getNewValue() != null) : (!multipleSampleForAdvancedTableCompositionSettings.getValue().equals(event.getNewValue()));
		}
		if (event.getAffectedEditor() == NavigationViewsRepository.Owner.Properties.multipleSampleForReferencesTable) {
			return (multipleSampleForReferencesTableSettings.getValue() == null) ? (event.getNewValue() != null) : (!multipleSampleForReferencesTableSettings.getValue().equals(event.getNewValue()));
		}
		if (event.getAffectedEditor() == NavigationViewsRepository.Owner.Properties.multipleSampleForAdvancedReferencesTable) {
			return (multipleSampleForAdvancedReferencesTableSettings.getValue() == null) ? (event.getNewValue() != null) : (!multipleSampleForAdvancedReferencesTableSettings.getValue().equals(event.getNewValue()));
		}
		if (event.getAffectedEditor() == NavigationViewsRepository.Owner.Properties.multipleSampleForFlatReferencesTable) {
			return (multipleSampleForFlatReferencesTablesSettings.getValue() == null) ? (event.getNewValue() != null) : (!multipleSampleForFlatReferencesTablesSettings.getValue().equals(event.getNewValue()));
		}
		if (event.getAffectedEditor() == NavigationViewsRepository.Owner.Properties.singleSampleForTableComposition) {
			return (singleSampleForTableCompositionSettings.getValue() == null) ? (event.getNewValue() != null) : (!singleSampleForTableCompositionSettings.getValue().equals(event.getNewValue()));
		}
		if (event.getAffectedEditor() == NavigationViewsRepository.Owner.Properties.singleSampleForAdvancedTableComposition) {
			return (singleSampleForAdvancedTableCompositionSettings.getValue() == null) ? (event.getNewValue() != null) : (!singleSampleForAdvancedTableCompositionSettings.getValue().equals(event.getNewValue()));
		}
		if (event.getAffectedEditor() == NavigationViewsRepository.Owner.Properties.singleSampleForReferencesTable) {
			return (singleSampleForReferencesTableSettings.getValue() == null) ? (event.getNewValue() != null) : (!singleSampleForReferencesTableSettings.getValue().equals(event.getNewValue()));
		}
		if (event.getAffectedEditor() == NavigationViewsRepository.Owner.Properties.singleSampleForAdvancedReferencesTable) {
			return (singleSampleForAdvancedReferencesTableSettings.getValue() == null) ? (event.getNewValue() != null) : (!singleSampleForAdvancedReferencesTableSettings.getValue().equals(event.getNewValue()));
		}
		if (event.getAffectedEditor() == NavigationViewsRepository.Owner.Properties.singleSampleForFlatReferencesTable) {
			return (singleSampleForFlatReferencesTableSettings.getValue() == null) ? (event.getNewValue() != null) : (!singleSampleForFlatReferencesTableSettings.getValue().equals(event.getNewValue()));
		}
		if (event.getAffectedEditor() == NavigationViewsRepository.Owner.Properties.singleContainmentForEObjectFlatComboViewer) {
			return (singleContainmentForEObjectFlatComboViewerSettings.getValue() == null) ? (event.getNewValue() != null) : (!singleContainmentForEObjectFlatComboViewerSettings.getValue().equals(event.getNewValue()));
		}
		if (event.getAffectedEditor() == NavigationViewsRepository.Owner.Properties.singleReferencesForEObjectFlatComboViewer) {
			return (singleReferenceForEObjectFlatComboViewerSettings.getValue() == null) ? (event.getNewValue() != null) : (!singleReferenceForEObjectFlatComboViewerSettings.getValue().equals(event.getNewValue()));
		}
		if (event.getAffectedEditor() == NavigationViewsRepository.Owner.Properties.singleContainmentForAdvancedEObjectFlatComboViewer) {
			return (singleContainmentForAdvancedEObjectFlatComboViewerSettings.getValue() == null) ? (event.getNewValue() != null) : (!singleContainmentForAdvancedEObjectFlatComboViewerSettings.getValue().equals(event.getNewValue()));
		}
		if (event.getAffectedEditor() == NavigationViewsRepository.Owner.Properties.singleReferencesForAdvancedEObjectFlatComboViewer) {
			return (singleReferenceForAdvancedEObjectFlatComboViewerSettings.getValue() == null) ? (event.getNewValue() != null) : (!singleReferenceForAdvancedEObjectFlatComboViewerSettings.getValue().equals(event.getNewValue()));
		}
		return super.shouldProcess(event);
	}	

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#associatedFeature(java.lang.Object)
	 */
	public EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == NavigationViewsRepository.Owner.Properties.name) {
			return EefnrPackage.eINSTANCE.getAbstractSample_Name();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Owner owner = (Owner)semanticObject;
		if (NavigationViewsRepository.Owner.Properties.name == event.getAffectedEditor()) {
			owner.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (NavigationViewsRepository.Owner.Properties.multipleSampleForTableComposition == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, multipleSampleForTableCompositionSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				multipleSampleForTableCompositionSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				multipleSampleForTableCompositionSettings.move(event.getNewIndex(), (Owner) event.getNewValue());
			}
		}
		if (NavigationViewsRepository.Owner.Properties.multipleSampleForAdvancedTableComposition == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, multipleSampleForAdvancedTableCompositionSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				multipleSampleForAdvancedTableCompositionSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				multipleSampleForAdvancedTableCompositionSettings.move(event.getNewIndex(), (Owner) event.getNewValue());
			}
		}
		if (NavigationViewsRepository.Owner.Properties.multipleSampleForReferencesTable == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Owner) {
					multipleSampleForReferencesTableSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
					multipleSampleForReferencesTableSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				multipleSampleForReferencesTableSettings.move(event.getNewIndex(), (Owner) event.getNewValue());
			}
		}
		if (NavigationViewsRepository.Owner.Properties.multipleSampleForAdvancedReferencesTable == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Owner) {
					multipleSampleForAdvancedReferencesTableSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				multipleSampleForAdvancedReferencesTableSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				multipleSampleForAdvancedReferencesTableSettings.move(event.getNewIndex(), (Owner) event.getNewValue());
			}
		}
		if (NavigationViewsRepository.Owner.Properties.multipleSampleForFlatReferencesTable == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET)
				multipleSampleForFlatReferencesTablesSettings.setToReference((List<EObject>) event.getNewValue());
		}
		if (NavigationViewsRepository.Owner.Properties.singleSampleForTableComposition == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, singleSampleForTableCompositionSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				singleSampleForTableCompositionSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				singleSampleForTableCompositionSettings.move(event.getNewIndex(), (Owner) event.getNewValue());
			}
		}
		if (NavigationViewsRepository.Owner.Properties.singleSampleForAdvancedTableComposition == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, singleSampleForAdvancedTableCompositionSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				singleSampleForAdvancedTableCompositionSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				singleSampleForAdvancedTableCompositionSettings.move(event.getNewIndex(), (Owner) event.getNewValue());
			}
		}
		if (NavigationViewsRepository.Owner.Properties.singleSampleForReferencesTable == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Owner) {
					singleSampleForReferencesTableSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				singleSampleForReferencesTableSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				singleSampleForReferencesTableSettings.move(event.getNewIndex(), (Owner) event.getNewValue());
			}
		}
		if (NavigationViewsRepository.Owner.Properties.singleSampleForAdvancedReferencesTable == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Owner) {
					singleSampleForAdvancedReferencesTableSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				singleSampleForAdvancedReferencesTableSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				singleSampleForAdvancedReferencesTableSettings.move(event.getNewIndex(), (Owner) event.getNewValue());
			}
		}
		if (NavigationViewsRepository.Owner.Properties.singleSampleForFlatReferencesTable == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET)
				singleSampleForFlatReferencesTableSettings.setToReference((List<EObject>) event.getNewValue());
		}
		if (NavigationViewsRepository.Owner.Properties.singleContainmentForEObjectFlatComboViewer == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				singleContainmentForEObjectFlatComboViewerSettings.setToReference((Owner)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				Owner eObject = NavigationFactory.eINSTANCE.createOwner();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				singleContainmentForEObjectFlatComboViewerSettings.setToReference(eObject);
			}
		}
		if (NavigationViewsRepository.Owner.Properties.singleReferencesForEObjectFlatComboViewer == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				singleReferenceForEObjectFlatComboViewerSettings.setToReference((Owner)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				Owner eObject = NavigationFactory.eINSTANCE.createOwner();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				singleReferenceForEObjectFlatComboViewerSettings.setToReference(eObject);
			}
		}
		if (NavigationViewsRepository.Owner.Properties.singleContainmentForAdvancedEObjectFlatComboViewer == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				singleContainmentForAdvancedEObjectFlatComboViewerSettings.setToReference((Owner)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				Owner eObject = NavigationFactory.eINSTANCE.createOwner();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				singleContainmentForAdvancedEObjectFlatComboViewerSettings.setToReference(eObject);
			}
		}
		if (NavigationViewsRepository.Owner.Properties.singleReferencesForAdvancedEObjectFlatComboViewer == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				singleReferenceForAdvancedEObjectFlatComboViewerSettings.setToReference((Owner)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				Owner eObject = NavigationFactory.eINSTANCE.createOwner();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				singleReferenceForAdvancedEObjectFlatComboViewerSettings.setToReference(eObject);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			OwnerPropertiesEditionPart basePart = (OwnerPropertiesEditionPart)editingPart;
			if (EefnrPackage.eINSTANCE.getAbstractSample_Name().equals(msg.getFeature()) && basePart != null && isAccessible(NavigationViewsRepository.Owner.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (multipleSampleForTableCompositionSettings.isAffectingFeature((EStructuralFeature)msg.getFeature()) && isAccessible(NavigationViewsRepository.Owner.Properties.multipleSampleForTableComposition))
				basePart.updateMultipleSampleForTableComposition();
			if (multipleSampleForAdvancedTableCompositionSettings.isAffectingFeature((EStructuralFeature)msg.getFeature()) && isAccessible(NavigationViewsRepository.Owner.Properties.multipleSampleForAdvancedTableComposition))
				basePart.updateMultipleSampleForAdvancedTableComposition();
			if (multipleSampleForReferencesTableSettings.isAffectingFeature((EStructuralFeature)msg.getFeature()) && isAccessible(NavigationViewsRepository.Owner.Properties.multipleSampleForReferencesTable)) {
				basePart.updateMultipleSampleForReferencesTable();
			}
			if (NavigationPackage.eINSTANCE.getMultipleReferencer_MultipleSampleAdvancedReferencesTable().equals(msg.getFeature())  && isAccessible(NavigationViewsRepository.Owner.Properties.multipleSampleForAdvancedReferencesTable))
				basePart.updateMultipleSampleForAdvancedReferencesTable();
			if (multipleSampleForFlatReferencesTablesSettings.isAffectingFeature((EStructuralFeature)msg.getFeature()) && isAccessible(NavigationViewsRepository.Owner.Properties.multipleSampleForFlatReferencesTable))
				basePart.updateMultipleSampleForFlatReferencesTable();
			if (singleSampleForTableCompositionSettings.isAffectingFeature((EStructuralFeature)msg.getFeature()) && isAccessible(NavigationViewsRepository.Owner.Properties.singleSampleForTableComposition))
				basePart.updateSingleSampleForTableComposition();
			if (singleSampleForAdvancedTableCompositionSettings.isAffectingFeature((EStructuralFeature)msg.getFeature()) && isAccessible(NavigationViewsRepository.Owner.Properties.singleSampleForAdvancedTableComposition))
				basePart.updateSingleSampleForAdvancedTableComposition();
			if (singleSampleForReferencesTableSettings.isAffectingFeature((EStructuralFeature)msg.getFeature()) && isAccessible(NavigationViewsRepository.Owner.Properties.singleSampleForReferencesTable))
				basePart.updateSingleSampleForReferencesTable();
			if (singleSampleForAdvancedReferencesTableSettings.isAffectingFeature((EStructuralFeature)msg.getFeature()) && isAccessible(NavigationViewsRepository.Owner.Properties.singleSampleForAdvancedReferencesTable))
				basePart.updateSingleSampleForAdvancedReferencesTable();
			if (singleSampleForFlatReferencesTableSettings.isAffectingFeature((EStructuralFeature)msg.getFeature()) && isAccessible(NavigationViewsRepository.Owner.Properties.singleSampleForFlatReferencesTable))
				basePart.updateSingleSampleForFlatReferencesTable();
			if (NavigationPackage.eINSTANCE.getSingleReferencer_SingleContainmentForEObjectFlatComboViewer().equals(msg.getFeature()) && basePart != null && isAccessible(NavigationViewsRepository.Owner.Properties.singleContainmentForEObjectFlatComboViewer))
				basePart.setSingleContainmentForEObjectFlatComboViewer((EObject)msg.getNewValue());
			if (NavigationPackage.eINSTANCE.getSingleReferencer_SingleReferenceForEObjectFlatComboViewer().equals(msg.getFeature()) && basePart != null && isAccessible(NavigationViewsRepository.Owner.Properties.singleReferencesForEObjectFlatComboViewer))
				basePart.setSingleReferencesForEObjectFlatComboViewer((EObject)msg.getNewValue());
			if (NavigationPackage.eINSTANCE.getSingleReferencer_SingleContainmentForAdvancedEObjectFlatComboViewer().equals(msg.getFeature()) && basePart != null && isAccessible(NavigationViewsRepository.Owner.Properties.singleContainmentForAdvancedEObjectFlatComboViewer))
				basePart.setSingleContainmentForAdvancedEObjectFlatComboViewer((EObject)msg.getNewValue());
			if (NavigationPackage.eINSTANCE.getSingleReferencer_SingleReferenceForAdvancedEObjectFlatComboViewer().equals(msg.getFeature()) && basePart != null && isAccessible(NavigationViewsRepository.Owner.Properties.singleReferencesForAdvancedEObjectFlatComboViewer))
				basePart.setSingleReferencesForAdvancedEObjectFlatComboViewer((EObject)msg.getNewValue());
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public Diagnostic validateValue(IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
				if (NavigationViewsRepository.Owner.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(EefnrPackage.eINSTANCE.getAbstractSample_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EefnrPackage.eINSTANCE.getAbstractSample_Name().getEAttributeType(), newValue);
				}
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}

}
