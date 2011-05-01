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
package org.eclipse.emf.eef.eefnr.components;

// Start of user code for imports
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.eefnr.ENUM_SAMPLE;
import org.eclipse.emf.eef.eefnr.EefnrFactory;
import org.eclipse.emf.eef.eefnr.EefnrPackage;
import org.eclipse.emf.eef.eefnr.Sample;
import org.eclipse.emf.eef.eefnr.TotalSample;
import org.eclipse.emf.eef.eefnr.parts.EefnrViewsRepository;
import org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.components.impl.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditingContext;
import org.eclipse.emf.eef.runtime.notify.PropertiesEditingEvent;
import org.eclipse.emf.eef.runtime.notify.impl.PropertiesEditingEventImpl;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.filters.EObjectFilter;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.emf.eef.runtime.util.EEFConverterUtil;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
	

// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class TotalSamplePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for eobjectflatcomboviewerRequiredProperty EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings eobjectflatcomboviewerRequiredPropertySettings;
	
	/**
	 * Settings for eobjectflatcomboviewerOptionalProperty EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings eobjectflatcomboviewerOptionalPropertySettings;
	
	/**
	 * Settings for referencestableRequiredProperty ReferencesTable
	 */
	private	ReferencesTableSettings referencestableRequiredPropertySettings;
	
	/**
	 * Settings for referencestableOptionalProperty ReferencesTable
	 */
	private	ReferencesTableSettings referencestableOptionalPropertySettings;
	
	/**
	 * Settings for tablecompositionRequiredProperty ReferencesTable
	 */
	protected ReferencesTableSettings tablecompositionRequiredPropertySettings;
	
	/**
	 * Settings for tablecompositionOptionalProperty ReferencesTable
	 */
	protected ReferencesTableSettings tablecompositionOptionalPropertySettings;
	
	/**
	 * Settings for advancedreferencestableRequiredProperty ReferencesTable
	 */
	private	ReferencesTableSettings advancedreferencestableRequiredPropertySettings;
	
	/**
	 * Settings for advancedreferencestableOptionalProperty ReferencesTable
	 */
	private	ReferencesTableSettings advancedreferencestableOptionalPropertySettings;
	
	/**
	 * Settings for advancedeobjectflatcomboviewerRequiredPropery EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings advancedeobjectflatcomboviewerRequiredProperySettings;
	
	/**
	 * Settings for advancedeobjectflatcomboviewerOptionalPropery EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings advancedeobjectflatcomboviewerOptionalProperySettings;
	
	/**
	 * Settings for advancedtablecompositionRequiredProperty ReferencesTable
	 */
	protected ReferencesTableSettings advancedtablecompositionRequiredPropertySettings;
	
	/**
	 * Settings for advancedtablecompositionOptionalProperty ReferencesTable
	 */
	protected ReferencesTableSettings advancedtablecompositionOptionalPropertySettings;
	
	/**
	 * Default constructor
	 * 
	 */
	public TotalSamplePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject totalSample, String editing_mode) {
		super(editingContext, totalSample, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = EefnrViewsRepository.class;
		partKey = EefnrViewsRepository.TotalSample.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent#initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(Object key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (editingPart != null && key == partKey) {
			editingPart.setContext(elt, allResource);
			final TotalSample totalSample = (TotalSample)elt;
			final TotalSamplePropertiesEditionPart basePart = (TotalSamplePropertiesEditionPart)editingPart;
			// init values
			if (totalSample.getTextRequiredProperty() != null)
				basePart.setTextRequiredProperty(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), totalSample.getTextRequiredProperty()));
			
			if (totalSample.getTextOptionalProperty() != null)
				basePart.setTextOptionalProperty(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), totalSample.getTextOptionalProperty()));
			
			basePart.setCheckboxRequiredProperty(totalSample.isCheckboxRequiredProperty());
			
			basePart.setCheckboxOptionalProperty(totalSample.isCheckboxOptionalProperty());
			
			if (totalSample.getTextareaRequiredProperty() != null)
				basePart.setTextareaRequiredProperty(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), totalSample.getTextareaRequiredProperty()));
			
			if (totalSample.getTextareaOptionalProperty() != null)
				basePart.setTextareaOptionalProperty(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), totalSample.getTextareaOptionalProperty()));
			
			if (isAccessible(EefnrViewsRepository.TotalSample.Properties.radioRequiredProperty)) {
				basePart.initRadioRequiredProperty((EEnum) EefnrPackage.eINSTANCE.getTotalSample_RadioRequiredProperty().getEType(), totalSample.getRadioRequiredProperty());
			}
			if (isAccessible(EefnrViewsRepository.TotalSample.Properties.radioOptionalProperty)) {
				basePart.initRadioOptionalProperty((EEnum) EefnrPackage.eINSTANCE.getTotalSample_RadioOptionalProperty().getEType(), totalSample.getRadioOptionalProperty());
			}
			// init part
			eobjectflatcomboviewerRequiredPropertySettings = new EObjectFlatComboSettings(totalSample, EefnrPackage.eINSTANCE.getTotalSample_EobjectflatcomboviewerRequiredProperty());
			basePart.initEobjectflatcomboviewerRequiredProperty(eobjectflatcomboviewerRequiredPropertySettings);
			// set the button mode
			basePart.setEobjectflatcomboviewerRequiredPropertyButtonMode(ButtonsModeEnum.BROWSE);
			// init part
			eobjectflatcomboviewerOptionalPropertySettings = new EObjectFlatComboSettings(totalSample, EefnrPackage.eINSTANCE.getTotalSample_EobjectflatcomboviewerOptionalProperty());
			basePart.initEobjectflatcomboviewerOptionalProperty(eobjectflatcomboviewerOptionalPropertySettings);
			// set the button mode
			basePart.setEobjectflatcomboviewerOptionalPropertyButtonMode(ButtonsModeEnum.BROWSE);
			referencestableRequiredPropertySettings = new ReferencesTableSettings(totalSample, EefnrPackage.eINSTANCE.getTotalSample_ReferencestableRequiredProperty());
			basePart.initReferencestableRequiredProperty(referencestableRequiredPropertySettings);
			referencestableOptionalPropertySettings = new ReferencesTableSettings(totalSample, EefnrPackage.eINSTANCE.getTotalSample_ReferencestableOptionalProperty());
			basePart.initReferencestableOptionalProperty(referencestableOptionalPropertySettings);
			if (isAccessible(EefnrViewsRepository.TotalSample.Properties.emfcomboviewerRequiredProperty)) {
				basePart.initEmfcomboviewerRequiredProperty((EEnum) EefnrPackage.eINSTANCE.getTotalSample_EmfcomboviewerRequiredProperty().getEType(), totalSample.getEmfcomboviewerRequiredProperty());
			}
			if (isAccessible(EefnrViewsRepository.TotalSample.Properties.emfcomboviewerOptionalProperty)) {
				basePart.initEmfcomboviewerOptionalProperty((EEnum) EefnrPackage.eINSTANCE.getTotalSample_EmfcomboviewerOptionalProperty().getEType(), totalSample.getEmfcomboviewerOptionalProperty());
			}
			if (totalSample.getMultivaluededitorRequiredProperty() != null)
				basePart.setMultivaluededitorRequiredProperty(totalSample.getMultivaluededitorRequiredProperty());
			
			if (totalSample.getMultivaluededitorOptionalProperty() != null)
				basePart.setMultivaluededitorOptionalProperty(totalSample.getMultivaluededitorOptionalProperty());
			
			tablecompositionRequiredPropertySettings = new ReferencesTableSettings(totalSample, EefnrPackage.eINSTANCE.getTotalSample_TablecompositionRequiredProperty());
			basePart.initTablecompositionRequiredProperty(tablecompositionRequiredPropertySettings);
			tablecompositionOptionalPropertySettings = new ReferencesTableSettings(totalSample, EefnrPackage.eINSTANCE.getTotalSample_TablecompositionOptionalProperty());
			basePart.initTablecompositionOptionalProperty(tablecompositionOptionalPropertySettings);
			advancedreferencestableRequiredPropertySettings = new ReferencesTableSettings(totalSample, EefnrPackage.eINSTANCE.getTotalSample_AdvancedreferencestableRequiredProperty());
			basePart.initAdvancedreferencestableRequiredProperty(advancedreferencestableRequiredPropertySettings);
			advancedreferencestableOptionalPropertySettings = new ReferencesTableSettings(totalSample, EefnrPackage.eINSTANCE.getTotalSample_AdvancedreferencestableOptionalProperty());
			basePart.initAdvancedreferencestableOptionalProperty(advancedreferencestableOptionalPropertySettings);
			// init part
			advancedeobjectflatcomboviewerRequiredProperySettings = new EObjectFlatComboSettings(totalSample, EefnrPackage.eINSTANCE.getTotalSample_AdvancedeobjectflatcomboviewerRequiredPropery());
			basePart.initAdvancedeobjectflatcomboviewerRequiredPropery(advancedeobjectflatcomboviewerRequiredProperySettings);
			// set the button mode
			basePart.setAdvancedeobjectflatcomboviewerRequiredProperyButtonMode(ButtonsModeEnum.BROWSE);
			// init part
			advancedeobjectflatcomboviewerOptionalProperySettings = new EObjectFlatComboSettings(totalSample, EefnrPackage.eINSTANCE.getTotalSample_AdvancedeobjectflatcomboviewerOptionalPropery());
			basePart.initAdvancedeobjectflatcomboviewerOptionalPropery(advancedeobjectflatcomboviewerOptionalProperySettings);
			// set the button mode
			basePart.setAdvancedeobjectflatcomboviewerOptionalProperyButtonMode(ButtonsModeEnum.BROWSE);
			advancedtablecompositionRequiredPropertySettings = new ReferencesTableSettings(totalSample, EefnrPackage.eINSTANCE.getTotalSample_AdvancedtablecompositionRequiredProperty());
			basePart.initAdvancedtablecompositionRequiredProperty(advancedtablecompositionRequiredPropertySettings);
			advancedtablecompositionOptionalPropertySettings = new ReferencesTableSettings(totalSample, EefnrPackage.eINSTANCE.getTotalSample_AdvancedtablecompositionOptionalProperty());
			basePart.initAdvancedtablecompositionOptionalProperty(advancedtablecompositionOptionalPropertySettings);
			if (totalSample.getName() != null)
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), totalSample.getName()));
			
			// init filters
			
			
			
			
			
			
			
			
			basePart.addFilterToEobjectflatcomboviewerRequiredProperty(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof TotalSample);
				}
			
			});
			// Start of user code for additional businessfilters for eobjectflatcomboviewerRequiredProperty
																																																																																																																																																									
																																																																																																																																																									// End of user code
			
			basePart.addFilterToEobjectflatcomboviewerOptionalProperty(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof TotalSample); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for eobjectflatcomboviewerOptionalProperty
																																																																																																																																																									
																																																																																																																																																									// End of user code
			
			basePart.addFilterToReferencestableRequiredProperty(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInReferencestableRequiredPropertyTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToReferencestableRequiredProperty(new EObjectFilter(EefnrPackage.eINSTANCE.getTotalSample()));
			// Start of user code for additional businessfilters for referencestableRequiredProperty
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					// End of user code
			
			basePart.addFilterToReferencestableOptionalProperty(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInReferencestableOptionalPropertyTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToReferencestableOptionalProperty(new EObjectFilter(EefnrPackage.eINSTANCE.getTotalSample()));
			// Start of user code for additional businessfilters for referencestableOptionalProperty
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					// End of user code
			
			
			
			
			
			basePart.addFilterToTablecompositionRequiredProperty(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof Sample);
					}
			
			});
			// Start of user code for additional businessfilters for tablecompositionRequiredProperty
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					// End of user code
			
			basePart.addFilterToTablecompositionOptionalProperty(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Sample); //$NON-NLS-1$ 
					}
			
			});
			// Start of user code for additional businessfilters for tablecompositionOptionalProperty
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					// End of user code
			
			basePart.addFilterToAdvancedreferencestableRequiredProperty(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInAdvancedreferencestableRequiredPropertyTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToAdvancedreferencestableRequiredProperty(new EObjectFilter(EefnrPackage.eINSTANCE.getTotalSample()));
			// Start of user code for additional businessfilters for advancedreferencestableRequiredProperty
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					// End of user code
			
			basePart.addFilterToAdvancedreferencestableOptionalProperty(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInAdvancedreferencestableOptionalPropertyTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToAdvancedreferencestableOptionalProperty(new EObjectFilter(EefnrPackage.eINSTANCE.getTotalSample()));
			// Start of user code for additional businessfilters for advancedreferencestableOptionalProperty
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					// End of user code
			
			basePart.addFilterToAdvancedeobjectflatcomboviewerRequiredPropery(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof TotalSample);
				}
			
			});
			// Start of user code for additional businessfilters for advancedeobjectflatcomboviewerRequiredPropery
																																																																																																																																																									
																																																																																																																																																									// End of user code
			
			basePart.addFilterToAdvancedeobjectflatcomboviewerOptionalPropery(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof TotalSample); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for advancedeobjectflatcomboviewerOptionalPropery
																																																																																																																																																									
																																																																																																																																																									// End of user code
			
			basePart.addFilterToAdvancedtablecompositionRequiredProperty(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof Sample);
					}
			
			});
			// Start of user code for additional businessfilters for advancedtablecompositionRequiredProperty
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					// End of user code
			
			basePart.addFilterToAdvancedtablecompositionOptionalProperty(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Sample); //$NON-NLS-1$ 
					}
			
			});
			// Start of user code for additional businessfilters for advancedtablecompositionOptionalProperty
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					// End of user code
			
			
			// init values for referenced views
			
			// init filters for referenced views
			
		}
		setInitializing(false);
	}




























	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.components.impl.StandardPropertiesEditingComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.notify.PropertiesEditingEvent)
	 * 
	 */
	public void updateSemanticModel(final PropertiesEditingEvent event) {
		TotalSample totalSample = (TotalSample)semanticObject;
		if (EefnrViewsRepository.TotalSample.Properties.textRequiredProperty == event.getAffectedEditor()) {
			totalSample.setTextRequiredProperty((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (EefnrViewsRepository.TotalSample.Properties.textOptionalProperty == event.getAffectedEditor()) {
			totalSample.setTextOptionalProperty((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (EefnrViewsRepository.TotalSample.Properties.checkboxRequiredProperty == event.getAffectedEditor()) {
			totalSample.setCheckboxRequiredProperty((Boolean)event.getNewValue());
		}
		if (EefnrViewsRepository.TotalSample.Properties.checkboxOptionalProperty == event.getAffectedEditor()) {
			totalSample.setCheckboxOptionalProperty((Boolean)event.getNewValue());
		}
		if (EefnrViewsRepository.TotalSample.Properties.textareaRequiredProperty == event.getAffectedEditor()) {
			totalSample.setTextareaRequiredProperty((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (EefnrViewsRepository.TotalSample.Properties.textareaOptionalProperty == event.getAffectedEditor()) {
			totalSample.setTextareaOptionalProperty((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (EefnrViewsRepository.TotalSample.Properties.radioRequiredProperty == event.getAffectedEditor()) {
			totalSample.setRadioRequiredProperty((ENUM_SAMPLE)event.getNewValue());
		}
		if (EefnrViewsRepository.TotalSample.Properties.radioOptionalProperty == event.getAffectedEditor()) {
			totalSample.setRadioOptionalProperty((ENUM_SAMPLE)event.getNewValue());
		}
		if (EefnrViewsRepository.TotalSample.Properties.eobjectflatcomboviewerRequiredProperty == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditingEventImpl.SET)  {
				eobjectflatcomboviewerRequiredPropertySettings.setToReference((TotalSample)event.getNewValue());
			} else if (event.getKind() == PropertiesEditingEventImpl.ADD)  {
				TotalSample eObject = EefnrFactory.eINSTANCE.createTotalSample();
				EObjectPropertiesEditingContext context = new EObjectPropertiesEditingContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				eobjectflatcomboviewerRequiredPropertySettings.setToReference(eObject);
			}
		}
		if (EefnrViewsRepository.TotalSample.Properties.eobjectflatcomboviewerOptionalProperty == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditingEventImpl.SET)  {
				eobjectflatcomboviewerOptionalPropertySettings.setToReference((TotalSample)event.getNewValue());
			} else if (event.getKind() == PropertiesEditingEventImpl.ADD)  {
				TotalSample eObject = EefnrFactory.eINSTANCE.createTotalSample();
				EObjectPropertiesEditingContext context = new EObjectPropertiesEditingContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				eobjectflatcomboviewerOptionalPropertySettings.setToReference(eObject);
			}
		}
		if (EefnrViewsRepository.TotalSample.Properties.referencestableRequiredProperty == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditingEventImpl.ADD)  {
				if (event.getNewValue() instanceof TotalSample) {
					referencestableRequiredPropertySettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditingEventImpl.REMOVE) {
					referencestableRequiredPropertySettings.removeFromReference((EObject) event.getNewValue());
			}
		}
		if (EefnrViewsRepository.TotalSample.Properties.referencestableOptionalProperty == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditingEventImpl.ADD)  {
				if (event.getNewValue() instanceof TotalSample) {
					referencestableOptionalPropertySettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditingEventImpl.REMOVE) {
					referencestableOptionalPropertySettings.removeFromReference((EObject) event.getNewValue());
			}
		}
		if (EefnrViewsRepository.TotalSample.Properties.emfcomboviewerRequiredProperty == event.getAffectedEditor()) {
			totalSample.setEmfcomboviewerRequiredProperty((ENUM_SAMPLE)event.getNewValue());
		}
		if (EefnrViewsRepository.TotalSample.Properties.emfcomboviewerOptionalProperty == event.getAffectedEditor()) {
			totalSample.setEmfcomboviewerOptionalProperty((ENUM_SAMPLE)event.getNewValue());
		}
		if (EefnrViewsRepository.TotalSample.Properties.multivaluededitorRequiredProperty == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditingEventImpl.SET) {
				totalSample.getMultivaluededitorRequiredProperty().clear();
				totalSample.getMultivaluededitorRequiredProperty().addAll(((List) event.getNewValue()));
			}
		}
		if (EefnrViewsRepository.TotalSample.Properties.multivaluededitorOptionalProperty == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditingEventImpl.SET) {
				totalSample.getMultivaluededitorOptionalProperty().clear();
				totalSample.getMultivaluededitorOptionalProperty().addAll(((List) event.getNewValue()));
			}
		}
		if (EefnrViewsRepository.TotalSample.Properties.tablecompositionRequiredProperty == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditingEventImpl.ADD)  {
				EReferencePropertiesEditingContext context = new EReferencePropertiesEditingContext(editingContext, this, tablecompositionRequiredPropertySettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditingEventImpl.EDIT) {
				EObjectPropertiesEditingContext context = new EObjectPropertiesEditingContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditingEventImpl.REMOVE) {
					tablecompositionRequiredPropertySettings.removeFromReference((EObject) event.getNewValue());
			}
		}
		if (EefnrViewsRepository.TotalSample.Properties.tablecompositionOptionalProperty == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditingEventImpl.ADD)  {
				EReferencePropertiesEditingContext context = new EReferencePropertiesEditingContext(editingContext, this, tablecompositionOptionalPropertySettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditingEventImpl.EDIT) {
				EObjectPropertiesEditingContext context = new EObjectPropertiesEditingContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditingEventImpl.REMOVE) {
					tablecompositionOptionalPropertySettings.removeFromReference((EObject) event.getNewValue());
			}
		}
		if (EefnrViewsRepository.TotalSample.Properties.advancedreferencestableRequiredProperty == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditingEventImpl.ADD)  {
				if (event.getNewValue() instanceof TotalSample) {
					advancedreferencestableRequiredPropertySettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditingEventImpl.REMOVE) {
					advancedreferencestableRequiredPropertySettings.removeFromReference((EObject) event.getNewValue());
			}
		}
		if (EefnrViewsRepository.TotalSample.Properties.advancedreferencestableOptionalProperty == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditingEventImpl.ADD)  {
				if (event.getNewValue() instanceof TotalSample) {
					advancedreferencestableOptionalPropertySettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditingEventImpl.REMOVE) {
					advancedreferencestableOptionalPropertySettings.removeFromReference((EObject) event.getNewValue());
			}
		}
		if (EefnrViewsRepository.TotalSample.Properties.advancedeobjectflatcomboviewerRequiredPropery == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditingEventImpl.SET)  {
				advancedeobjectflatcomboviewerRequiredProperySettings.setToReference((TotalSample)event.getNewValue());
			} else if (event.getKind() == PropertiesEditingEventImpl.ADD)  {
				TotalSample eObject = EefnrFactory.eINSTANCE.createTotalSample();
				EObjectPropertiesEditingContext context = new EObjectPropertiesEditingContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				advancedeobjectflatcomboviewerRequiredProperySettings.setToReference(eObject);
			}
		}
		if (EefnrViewsRepository.TotalSample.Properties.advancedeobjectflatcomboviewerOptionalPropery == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditingEventImpl.SET)  {
				advancedeobjectflatcomboviewerOptionalProperySettings.setToReference((TotalSample)event.getNewValue());
			} else if (event.getKind() == PropertiesEditingEventImpl.ADD)  {
				TotalSample eObject = EefnrFactory.eINSTANCE.createTotalSample();
				EObjectPropertiesEditingContext context = new EObjectPropertiesEditingContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				advancedeobjectflatcomboviewerOptionalProperySettings.setToReference(eObject);
			}
		}
		if (EefnrViewsRepository.TotalSample.Properties.advancedtablecompositionRequiredProperty == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditingEventImpl.ADD)  {
				EReferencePropertiesEditingContext context = new EReferencePropertiesEditingContext(editingContext, this, advancedtablecompositionRequiredPropertySettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditingEventImpl.EDIT) {
				EObjectPropertiesEditingContext context = new EObjectPropertiesEditingContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditingEventImpl.REMOVE) {
					advancedtablecompositionRequiredPropertySettings.removeFromReference((EObject) event.getNewValue());
			}
		}
		if (EefnrViewsRepository.TotalSample.Properties.advancedtablecompositionOptionalProperty == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditingEventImpl.ADD)  {
				EReferencePropertiesEditingContext context = new EReferencePropertiesEditingContext(editingContext, this, advancedtablecompositionOptionalPropertySettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditingEventImpl.EDIT) {
				EObjectPropertiesEditingContext context = new EObjectPropertiesEditingContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditingEventImpl.REMOVE) {
					advancedtablecompositionOptionalPropertySettings.removeFromReference((EObject) event.getNewValue());
			}
		}
		if (EefnrViewsRepository.TotalSample.Properties.name == event.getAffectedEditor()) {
			totalSample.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.components.impl.StandardPropertiesEditingComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			TotalSamplePropertiesEditionPart basePart = (TotalSamplePropertiesEditionPart)editingPart;
			if (EefnrPackage.eINSTANCE.getTotalSample_TextRequiredProperty().equals(msg.getFeature()) && basePart != null){
				if (msg.getNewValue() != null) {
					basePart.setTextRequiredProperty(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setTextRequiredProperty("");
				}
			}
			if (EefnrPackage.eINSTANCE.getTotalSample_TextOptionalProperty().equals(msg.getFeature()) && basePart != null){
				if (msg.getNewValue() != null) {
					basePart.setTextOptionalProperty(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setTextOptionalProperty("");
				}
			}
			if (EefnrPackage.eINSTANCE.getTotalSample_CheckboxRequiredProperty().equals(msg.getFeature()) && basePart != null)
				basePart.setCheckboxRequiredProperty((Boolean)msg.getNewValue());
			
			if (EefnrPackage.eINSTANCE.getTotalSample_CheckboxOptionalProperty().equals(msg.getFeature()) && basePart != null)
				basePart.setCheckboxOptionalProperty((Boolean)msg.getNewValue());
			
			if (EefnrPackage.eINSTANCE.getTotalSample_TextareaRequiredProperty().equals(msg.getFeature()) && basePart != null){
				if (msg.getNewValue() != null) {
					basePart.setTextareaRequiredProperty(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setTextareaRequiredProperty("");
				}
			}
			if (EefnrPackage.eINSTANCE.getTotalSample_TextareaOptionalProperty().equals(msg.getFeature()) && basePart != null){
				if (msg.getNewValue() != null) {
					basePart.setTextareaOptionalProperty(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setTextareaOptionalProperty("");
				}
			}
			if (EefnrPackage.eINSTANCE.getTotalSample_RadioRequiredProperty().equals(msg.getFeature()) && isAccessible(EefnrViewsRepository.TotalSample.Properties.radioRequiredProperty))
				basePart.setRadioRequiredProperty((Enumerator)msg.getNewValue());
			
			if (EefnrPackage.eINSTANCE.getTotalSample_RadioOptionalProperty().equals(msg.getFeature()) && isAccessible(EefnrViewsRepository.TotalSample.Properties.radioOptionalProperty))
				basePart.setRadioOptionalProperty((Enumerator)msg.getNewValue());
			
			if (EefnrPackage.eINSTANCE.getTotalSample_EobjectflatcomboviewerRequiredProperty().equals(msg.getFeature()) && basePart != null)
				basePart.setEobjectflatcomboviewerRequiredProperty((EObject)msg.getNewValue());
			if (EefnrPackage.eINSTANCE.getTotalSample_EobjectflatcomboviewerOptionalProperty().equals(msg.getFeature()) && basePart != null)
				basePart.setEobjectflatcomboviewerOptionalProperty((EObject)msg.getNewValue());
			if (EefnrPackage.eINSTANCE.getTotalSample_ReferencestableRequiredProperty().equals(msg.getFeature()))
				basePart.updateReferencestableRequiredProperty();
			if (EefnrPackage.eINSTANCE.getTotalSample_ReferencestableOptionalProperty().equals(msg.getFeature()))
				basePart.updateReferencestableOptionalProperty();
			if (EefnrPackage.eINSTANCE.getTotalSample_EmfcomboviewerRequiredProperty().equals(msg.getFeature()) && isAccessible(EefnrViewsRepository.TotalSample.Properties.emfcomboviewerRequiredProperty))
				basePart.setEmfcomboviewerRequiredProperty((Enumerator)msg.getNewValue());
			
			if (EefnrPackage.eINSTANCE.getTotalSample_EmfcomboviewerOptionalProperty().equals(msg.getFeature()) && isAccessible(EefnrViewsRepository.TotalSample.Properties.emfcomboviewerOptionalProperty))
				basePart.setEmfcomboviewerOptionalProperty((Enumerator)msg.getNewValue());
			
			if (EefnrPackage.eINSTANCE.getTotalSample_MultivaluededitorRequiredProperty().equals(msg.getFeature()) && basePart != null) {
				if (msg.getEventType() == Notification.ADD) 
					basePart.addToMultivaluededitorRequiredProperty(msg.getNewValue());
				else if (msg.getEventType() == Notification.REMOVE) 
					basePart.removeToMultivaluededitorRequiredProperty(msg.getOldValue());
			}
			
			if (EefnrPackage.eINSTANCE.getTotalSample_MultivaluededitorOptionalProperty().equals(msg.getFeature()) && basePart != null) {
				if (msg.getEventType() == Notification.ADD) 
					basePart.addToMultivaluededitorOptionalProperty(msg.getNewValue());
				else if (msg.getEventType() == Notification.REMOVE) 
					basePart.removeToMultivaluededitorOptionalProperty(msg.getOldValue());
			}
			
			if (EefnrPackage.eINSTANCE.getTotalSample_TablecompositionRequiredProperty().equals(msg.getFeature()))
				basePart.updateTablecompositionRequiredProperty();
			if (EefnrPackage.eINSTANCE.getTotalSample_TablecompositionOptionalProperty().equals(msg.getFeature()))
				basePart.updateTablecompositionOptionalProperty();
			if (EefnrPackage.eINSTANCE.getTotalSample_AdvancedreferencestableRequiredProperty().equals(msg.getFeature()))
				basePart.updateAdvancedreferencestableRequiredProperty();
			if (EefnrPackage.eINSTANCE.getTotalSample_AdvancedreferencestableOptionalProperty().equals(msg.getFeature()))
				basePart.updateAdvancedreferencestableOptionalProperty();
			if (EefnrPackage.eINSTANCE.getTotalSample_AdvancedeobjectflatcomboviewerRequiredPropery().equals(msg.getFeature()) && basePart != null)
				basePart.setAdvancedeobjectflatcomboviewerRequiredPropery((EObject)msg.getNewValue());
			if (EefnrPackage.eINSTANCE.getTotalSample_AdvancedeobjectflatcomboviewerOptionalPropery().equals(msg.getFeature()) && basePart != null)
				basePart.setAdvancedeobjectflatcomboviewerOptionalPropery((EObject)msg.getNewValue());
			if (EefnrPackage.eINSTANCE.getTotalSample_AdvancedtablecompositionRequiredProperty().equals(msg.getFeature()))
				basePart.updateAdvancedtablecompositionRequiredProperty();
			if (EefnrPackage.eINSTANCE.getTotalSample_AdvancedtablecompositionOptionalProperty().equals(msg.getFeature()))
				basePart.updateAdvancedtablecompositionOptionalProperty();
			if (EefnrPackage.eINSTANCE.getAbstractSample_Name().equals(msg.getFeature()) && basePart != null){
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.components.impl.StandardPropertiesEditingComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == EefnrViewsRepository.TotalSample.Properties.textRequiredProperty || key == EefnrViewsRepository.TotalSample.Properties.checkboxRequiredProperty || key == EefnrViewsRepository.TotalSample.Properties.textareaRequiredProperty || key == EefnrViewsRepository.TotalSample.Properties.radioRequiredProperty || key == EefnrViewsRepository.TotalSample.Properties.eobjectflatcomboviewerRequiredProperty || key == EefnrViewsRepository.TotalSample.Properties.referencestableRequiredProperty || key == EefnrViewsRepository.TotalSample.Properties.emfcomboviewerRequiredProperty || key == EefnrViewsRepository.TotalSample.Properties.multivaluededitorRequiredProperty || key == EefnrViewsRepository.TotalSample.Properties.tablecompositionRequiredProperty || key == EefnrViewsRepository.TotalSample.Properties.advancedreferencestableRequiredProperty || key == EefnrViewsRepository.TotalSample.Properties.advancedeobjectflatcomboviewerRequiredPropery || key == EefnrViewsRepository.TotalSample.Properties.advancedtablecompositionRequiredProperty;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent#validateValue(org.eclipse.emf.eef.runtime.notify.PropertiesEditingEvent)
	 * 
	 */
	public Diagnostic validateValue(PropertiesEditingEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
				if (EefnrViewsRepository.TotalSample.Properties.textRequiredProperty == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(EefnrPackage.eINSTANCE.getTotalSample_TextRequiredProperty().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EefnrPackage.eINSTANCE.getTotalSample_TextRequiredProperty().getEAttributeType(), newValue);
				}
				if (EefnrViewsRepository.TotalSample.Properties.textOptionalProperty == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(EefnrPackage.eINSTANCE.getTotalSample_TextOptionalProperty().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EefnrPackage.eINSTANCE.getTotalSample_TextOptionalProperty().getEAttributeType(), newValue);
				}
				if (EefnrViewsRepository.TotalSample.Properties.checkboxRequiredProperty == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(EefnrPackage.eINSTANCE.getTotalSample_CheckboxRequiredProperty().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EefnrPackage.eINSTANCE.getTotalSample_CheckboxRequiredProperty().getEAttributeType(), newValue);
				}
				if (EefnrViewsRepository.TotalSample.Properties.checkboxOptionalProperty == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(EefnrPackage.eINSTANCE.getTotalSample_CheckboxOptionalProperty().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EefnrPackage.eINSTANCE.getTotalSample_CheckboxOptionalProperty().getEAttributeType(), newValue);
				}
				if (EefnrViewsRepository.TotalSample.Properties.textareaRequiredProperty == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(EefnrPackage.eINSTANCE.getTotalSample_TextareaRequiredProperty().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EefnrPackage.eINSTANCE.getTotalSample_TextareaRequiredProperty().getEAttributeType(), newValue);
				}
				if (EefnrViewsRepository.TotalSample.Properties.textareaOptionalProperty == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(EefnrPackage.eINSTANCE.getTotalSample_TextareaOptionalProperty().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EefnrPackage.eINSTANCE.getTotalSample_TextareaOptionalProperty().getEAttributeType(), newValue);
				}
				if (EefnrViewsRepository.TotalSample.Properties.radioRequiredProperty == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(EefnrPackage.eINSTANCE.getTotalSample_RadioRequiredProperty().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EefnrPackage.eINSTANCE.getTotalSample_RadioRequiredProperty().getEAttributeType(), newValue);
				}
				if (EefnrViewsRepository.TotalSample.Properties.radioOptionalProperty == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(EefnrPackage.eINSTANCE.getTotalSample_RadioOptionalProperty().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EefnrPackage.eINSTANCE.getTotalSample_RadioOptionalProperty().getEAttributeType(), newValue);
				}
				if (EefnrViewsRepository.TotalSample.Properties.emfcomboviewerRequiredProperty == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(EefnrPackage.eINSTANCE.getTotalSample_EmfcomboviewerRequiredProperty().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EefnrPackage.eINSTANCE.getTotalSample_EmfcomboviewerRequiredProperty().getEAttributeType(), newValue);
				}
				if (EefnrViewsRepository.TotalSample.Properties.emfcomboviewerOptionalProperty == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(EefnrPackage.eINSTANCE.getTotalSample_EmfcomboviewerOptionalProperty().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EefnrPackage.eINSTANCE.getTotalSample_EmfcomboviewerOptionalProperty().getEAttributeType(), newValue);
				}
				if (EefnrViewsRepository.TotalSample.Properties.multivaluededitorRequiredProperty == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(EefnrPackage.eINSTANCE.getTotalSample_MultivaluededitorRequiredProperty().getEAttributeType(), iterator.next()));
					}
					ret = chain;
				}
				if (EefnrViewsRepository.TotalSample.Properties.multivaluededitorOptionalProperty == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(EefnrPackage.eINSTANCE.getTotalSample_MultivaluededitorOptionalProperty().getEAttributeType(), iterator.next()));
					}
					ret = chain;
				}
				if (EefnrViewsRepository.TotalSample.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(EefnrPackage.eINSTANCE.getAbstractSample_Name().getEAttributeType(), (String)newValue);
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
