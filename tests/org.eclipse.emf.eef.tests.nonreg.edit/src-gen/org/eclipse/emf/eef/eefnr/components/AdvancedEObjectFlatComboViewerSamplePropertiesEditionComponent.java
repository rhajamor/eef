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
package org.eclipse.emf.eef.eefnr.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.eef.eefnr.AdvancedEObjectFlatComboViewerSample;
import org.eclipse.emf.eef.eefnr.EefnrFactory;
import org.eclipse.emf.eef.eefnr.EefnrPackage;
import org.eclipse.emf.eef.eefnr.TotalSample;
import org.eclipse.emf.eef.eefnr.parts.AdvancedEObjectFlatComboViewerSamplePropertiesEditionPart;
import org.eclipse.emf.eef.eefnr.parts.EefnrViewsRepository;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
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
	private EObjectFlatComboSettings advancedeobjectflatcomboviewerRequiredPropertySettings;
	
	/**
	 * Settings for advancedeobjectflatcomboviewerOptionalProperty EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings advancedeobjectflatcomboviewerOptionalPropertySettings;
	
	
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
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject, 
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
			if (isAccessible(EefnrViewsRepository.AdvancedEObjectFlatComboViewerSample.Properties.advancedeobjectflatcomboviewerRequiredProperty)) {
				// init part
				advancedeobjectflatcomboviewerRequiredPropertySettings = new EObjectFlatComboSettings(advancedEObjectFlatComboViewerSample, EefnrPackage.eINSTANCE.getAdvancedEObjectFlatComboViewerSample_AdvancedeobjectflatcomboviewerRequiredProperty());
				basePart.initAdvancedeobjectflatcomboviewerRequiredProperty(advancedeobjectflatcomboviewerRequiredPropertySettings);
				// set the button mode
				basePart.setAdvancedeobjectflatcomboviewerRequiredPropertyButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(EefnrViewsRepository.AdvancedEObjectFlatComboViewerSample.Properties.advancedeobjectflatcomboviewerOptionalProperty)) {
				// init part
				advancedeobjectflatcomboviewerOptionalPropertySettings = new EObjectFlatComboSettings(advancedEObjectFlatComboViewerSample, EefnrPackage.eINSTANCE.getAdvancedEObjectFlatComboViewerSample_AdvancedeobjectflatcomboviewerOptionalProperty());
				basePart.initAdvancedeobjectflatcomboviewerOptionalProperty(advancedeobjectflatcomboviewerOptionalPropertySettings);
				// set the button mode
				basePart.setAdvancedeobjectflatcomboviewerOptionalPropertyButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			
			
			// init values for referenced views
			
			// init filters for referenced views
			
		}
		setInitializing(false);
	}





	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#associatedFeature(java.lang.Object)
	 */
	public EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == EefnrViewsRepository.AdvancedEObjectFlatComboViewerSample.Properties.advancedeobjectflatcomboviewerRequiredProperty) {
			return EefnrPackage.eINSTANCE.getAdvancedEObjectFlatComboViewerSample_AdvancedeobjectflatcomboviewerRequiredProperty();
		}
		if (editorKey == EefnrViewsRepository.AdvancedEObjectFlatComboViewerSample.Properties.advancedeobjectflatcomboviewerOptionalProperty) {
			return EefnrPackage.eINSTANCE.getAdvancedEObjectFlatComboViewerSample_AdvancedeobjectflatcomboviewerOptionalProperty();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		AdvancedEObjectFlatComboViewerSample advancedEObjectFlatComboViewerSample = (AdvancedEObjectFlatComboViewerSample)semanticObject;
		if (EefnrViewsRepository.AdvancedEObjectFlatComboViewerSample.Properties.advancedeobjectflatcomboviewerRequiredProperty == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				advancedeobjectflatcomboviewerRequiredPropertySettings.setToReference((TotalSample)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				TotalSample eObject = EefnrFactory.eINSTANCE.createTotalSample();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
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
			if (event.getKind() == PropertiesEditionEvent.SET) {
				advancedeobjectflatcomboviewerOptionalPropertySettings.setToReference((TotalSample)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				TotalSample eObject = EefnrFactory.eINSTANCE.createTotalSample();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
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
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			AdvancedEObjectFlatComboViewerSamplePropertiesEditionPart basePart = (AdvancedEObjectFlatComboViewerSamplePropertiesEditionPart)editingPart;
			if (EefnrPackage.eINSTANCE.getAdvancedEObjectFlatComboViewerSample_AdvancedeobjectflatcomboviewerRequiredProperty().equals(msg.getFeature()) && basePart != null && isAccessible(EefnrViewsRepository.AdvancedEObjectFlatComboViewerSample.Properties.advancedeobjectflatcomboviewerRequiredProperty))
				basePart.setAdvancedeobjectflatcomboviewerRequiredProperty((EObject)msg.getNewValue());
			if (EefnrPackage.eINSTANCE.getAdvancedEObjectFlatComboViewerSample_AdvancedeobjectflatcomboviewerOptionalProperty().equals(msg.getFeature()) && basePart != null && isAccessible(EefnrViewsRepository.AdvancedEObjectFlatComboViewerSample.Properties.advancedeobjectflatcomboviewerOptionalProperty))
				basePart.setAdvancedeobjectflatcomboviewerOptionalProperty((EObject)msg.getNewValue());
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == EefnrViewsRepository.AdvancedEObjectFlatComboViewerSample.Properties.advancedeobjectflatcomboviewerRequiredProperty;
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
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}

}
