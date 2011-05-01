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
import org.eclipse.emf.eef.eefnr.EObjectFlatComboViewerSample;
import org.eclipse.emf.eef.eefnr.EefnrFactory;
import org.eclipse.emf.eef.eefnr.EefnrPackage;
import org.eclipse.emf.eef.eefnr.TotalSample;
import org.eclipse.emf.eef.eefnr.parts.EObjectFlatComboViewerSamplePropertiesEditionPart;
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
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
	

// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class EObjectFlatComboViewerSamplePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for eobjectflatcomboviewerRequiredPropery EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings eobjectflatcomboviewerRequiredProperySettings;
	
	/**
	 * Settings for eobjectflatcomboviewerOptionalPropery EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings eobjectflatcomboviewerOptionalProperySettings;
	
	/**
	 * Default constructor
	 * 
	 */
	public EObjectFlatComboViewerSamplePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject eObjectFlatComboViewerSample, String editing_mode) {
		super(editingContext, eObjectFlatComboViewerSample, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = EefnrViewsRepository.class;
		partKey = EefnrViewsRepository.EObjectFlatComboViewerSample.class;
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
			final EObjectFlatComboViewerSample eObjectFlatComboViewerSample = (EObjectFlatComboViewerSample)elt;
			final EObjectFlatComboViewerSamplePropertiesEditionPart basePart = (EObjectFlatComboViewerSamplePropertiesEditionPart)editingPart;
			// init values
			// init part
			eobjectflatcomboviewerRequiredProperySettings = new EObjectFlatComboSettings(eObjectFlatComboViewerSample, EefnrPackage.eINSTANCE.getEObjectFlatComboViewerSample_EobjectflatcomboviewerRequiredPropery());
			basePart.initEobjectflatcomboviewerRequiredPropery(eobjectflatcomboviewerRequiredProperySettings);
			// set the button mode
			basePart.setEobjectflatcomboviewerRequiredProperyButtonMode(ButtonsModeEnum.BROWSE);
			// init part
			eobjectflatcomboviewerOptionalProperySettings = new EObjectFlatComboSettings(eObjectFlatComboViewerSample, EefnrPackage.eINSTANCE.getEObjectFlatComboViewerSample_EobjectflatcomboviewerOptionalPropery());
			basePart.initEobjectflatcomboviewerOptionalPropery(eobjectflatcomboviewerOptionalProperySettings);
			// set the button mode
			basePart.setEobjectflatcomboviewerOptionalProperyButtonMode(ButtonsModeEnum.BROWSE);
			// init filters
			basePart.addFilterToEobjectflatcomboviewerRequiredPropery(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof TotalSample);
				}
			
			});
			// Start of user code for additional businessfilters for eobjectflatcomboviewerRequiredPropery
																																																																																																																																																									
																																																																																																																																																									// End of user code
			
			basePart.addFilterToEobjectflatcomboviewerOptionalPropery(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof TotalSample); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for eobjectflatcomboviewerOptionalPropery
																																																																																																																																																									
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
		EObjectFlatComboViewerSample eObjectFlatComboViewerSample = (EObjectFlatComboViewerSample)semanticObject;
		if (EefnrViewsRepository.EObjectFlatComboViewerSample.Properties.eobjectflatcomboviewerRequiredPropery == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditingEventImpl.SET)  {
				eobjectflatcomboviewerRequiredProperySettings.setToReference((TotalSample)event.getNewValue());
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
				eobjectflatcomboviewerRequiredProperySettings.setToReference(eObject);
			}
		}
		if (EefnrViewsRepository.EObjectFlatComboViewerSample.Properties.eobjectflatcomboviewerOptionalPropery == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditingEventImpl.SET)  {
				eobjectflatcomboviewerOptionalProperySettings.setToReference((TotalSample)event.getNewValue());
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
				eobjectflatcomboviewerOptionalProperySettings.setToReference(eObject);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.components.impl.StandardPropertiesEditingComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			EObjectFlatComboViewerSamplePropertiesEditionPart basePart = (EObjectFlatComboViewerSamplePropertiesEditionPart)editingPart;
			if (EefnrPackage.eINSTANCE.getEObjectFlatComboViewerSample_EobjectflatcomboviewerRequiredPropery().equals(msg.getFeature()) && basePart != null)
				basePart.setEobjectflatcomboviewerRequiredPropery((EObject)msg.getNewValue());
			if (EefnrPackage.eINSTANCE.getEObjectFlatComboViewerSample_EobjectflatcomboviewerOptionalPropery().equals(msg.getFeature()) && basePart != null)
				basePart.setEobjectflatcomboviewerOptionalPropery((EObject)msg.getNewValue());
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.components.impl.StandardPropertiesEditingComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == EefnrViewsRepository.EObjectFlatComboViewerSample.Properties.eobjectflatcomboviewerRequiredPropery;
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
