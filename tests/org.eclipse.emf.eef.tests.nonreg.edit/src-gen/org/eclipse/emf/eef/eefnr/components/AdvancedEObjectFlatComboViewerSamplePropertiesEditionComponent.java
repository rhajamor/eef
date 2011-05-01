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
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.eef.eefnr.AdvancedEObjectFlatComboViewerSample;
import org.eclipse.emf.eef.eefnr.EefnrFactory;
import org.eclipse.emf.eef.eefnr.EefnrPackage;
import org.eclipse.emf.eef.eefnr.TotalSample;
import org.eclipse.emf.eef.eefnr.parts.AdvancedEObjectFlatComboViewerSamplePropertiesEditionPart;
import org.eclipse.emf.eef.eefnr.parts.EefnrViewsRepository;
import org.eclipse.emf.eef.runtime.components.impl.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditingContext;
import org.eclipse.emf.eef.runtime.notify.PropertiesEditingEvent;
import org.eclipse.emf.eef.runtime.notify.impl.PropertiesEditingEventImpl;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
	

// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class AdvancedEObjectFlatComboViewerSamplePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for advancedeobjectflatcomboviewerRequiredProperty EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings advancedeobjectflatcomboviewerRequiredPropertySettings;
	
	/**
	 * Settings for advancedeobjectflatcomboviewerOptionalProperty EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings advancedeobjectflatcomboviewerOptionalPropertySettings;
	
	/**
	 * Default constructor
	 * 
	 */
	public AdvancedEObjectFlatComboViewerSamplePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject advancedEObjectFlatComboViewerSample, String editing_mode) {
		super(editingContext, advancedEObjectFlatComboViewerSample, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = EefnrViewsRepository.class;
		partKey = EefnrViewsRepository.AdvancedEObjectFlatComboViewerSample.class;
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
			final AdvancedEObjectFlatComboViewerSample advancedEObjectFlatComboViewerSample = (AdvancedEObjectFlatComboViewerSample)elt;
			final AdvancedEObjectFlatComboViewerSamplePropertiesEditionPart basePart = (AdvancedEObjectFlatComboViewerSamplePropertiesEditionPart)editingPart;
			// init values
			// init part
			advancedeobjectflatcomboviewerRequiredPropertySettings = new EObjectFlatComboSettings(advancedEObjectFlatComboViewerSample, EefnrPackage.eINSTANCE.getAdvancedEObjectFlatComboViewerSample_AdvancedeobjectflatcomboviewerRequiredProperty());
			basePart.initAdvancedeobjectflatcomboviewerRequiredProperty(advancedeobjectflatcomboviewerRequiredPropertySettings);
			// set the button mode
			basePart.setAdvancedeobjectflatcomboviewerRequiredPropertyButtonMode(ButtonsModeEnum.BROWSE);
			// init part
			advancedeobjectflatcomboviewerOptionalPropertySettings = new EObjectFlatComboSettings(advancedEObjectFlatComboViewerSample, EefnrPackage.eINSTANCE.getAdvancedEObjectFlatComboViewerSample_AdvancedeobjectflatcomboviewerOptionalProperty());
			basePart.initAdvancedeobjectflatcomboviewerOptionalProperty(advancedeobjectflatcomboviewerOptionalPropertySettings);
			// set the button mode
			basePart.setAdvancedeobjectflatcomboviewerOptionalPropertyButtonMode(ButtonsModeEnum.BROWSE);
			// init filters
			
			
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
		AdvancedEObjectFlatComboViewerSample advancedEObjectFlatComboViewerSample = (AdvancedEObjectFlatComboViewerSample)semanticObject;
		if (EefnrViewsRepository.AdvancedEObjectFlatComboViewerSample.Properties.advancedeobjectflatcomboviewerRequiredProperty == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditingEventImpl.SET)  {
				advancedeobjectflatcomboviewerRequiredPropertySettings.setToReference((TotalSample)event.getNewValue());
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
				advancedeobjectflatcomboviewerRequiredPropertySettings.setToReference(eObject);
			}
		}
		if (EefnrViewsRepository.AdvancedEObjectFlatComboViewerSample.Properties.advancedeobjectflatcomboviewerOptionalProperty == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditingEventImpl.SET)  {
				advancedeobjectflatcomboviewerOptionalPropertySettings.setToReference((TotalSample)event.getNewValue());
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
				advancedeobjectflatcomboviewerOptionalPropertySettings.setToReference(eObject);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.components.impl.StandardPropertiesEditingComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			AdvancedEObjectFlatComboViewerSamplePropertiesEditionPart basePart = (AdvancedEObjectFlatComboViewerSamplePropertiesEditionPart)editingPart;
			if (EefnrPackage.eINSTANCE.getAdvancedEObjectFlatComboViewerSample_AdvancedeobjectflatcomboviewerRequiredProperty().equals(msg.getFeature()) && basePart != null)
				basePart.setAdvancedeobjectflatcomboviewerRequiredProperty((EObject)msg.getNewValue());
			if (EefnrPackage.eINSTANCE.getAdvancedEObjectFlatComboViewerSample_AdvancedeobjectflatcomboviewerOptionalProperty().equals(msg.getFeature()) && basePart != null)
				basePart.setAdvancedeobjectflatcomboviewerOptionalProperty((EObject)msg.getNewValue());
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.components.impl.StandardPropertiesEditingComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == EefnrViewsRepository.AdvancedEObjectFlatComboViewerSample.Properties.advancedeobjectflatcomboviewerRequiredProperty;
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
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}

}
