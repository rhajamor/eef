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
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.eef.eefnr.EefnrPackage;
import org.eclipse.emf.eef.eefnr.SingleCompositionViewerSample;
import org.eclipse.emf.eef.eefnr.parts.EefnrViewsRepository;
import org.eclipse.emf.eef.eefnr.parts.SingleCompositionViewerSamplePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;


// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class SingleCompositionViewerSamplePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Default constructor
	 * 
	 */
	public SingleCompositionViewerSamplePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject singleCompositionViewerSample, String editing_mode) {
		super(editingContext, singleCompositionViewerSample, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = EefnrViewsRepository.class;
		partKey = EefnrViewsRepository.SingleCompositionViewerSample.class;
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
			final SingleCompositionViewerSample singleCompositionViewerSample = (SingleCompositionViewerSample)elt;
			final SingleCompositionViewerSamplePropertiesEditionPart basePart = (SingleCompositionViewerSamplePropertiesEditionPart)editingPart;
			// init values
			//FIXME: Sorry this widget is deprecated for this version.
			//FIXME: Sorry this widget is deprecated for this version.
			//FIXME: Sorry this widget is deprecated for this version.
			//FIXME: Sorry this widget is deprecated for this version.
			// init filters
			//FIXME: Sorry this widget is deprecated for this version.
			//FIXME: Sorry this widget is deprecated for this version.
			//FIXME: Sorry this widget is deprecated for this version.
			//FIXME: Sorry this widget is deprecated for this version.
			// init values for referenced views
			
			// init filters for referenced views
			
		}
		setInitializing(false);
	}







	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#associatedFeature(java.lang.Object)
	 */
	protected EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == EefnrViewsRepository.SingleCompositionViewerSample.Properties.singlecompositionviewerSingleRequiredProperty) {
			return EefnrPackage.eINSTANCE.getSingleCompositionViewerSample_SinglecompositionviewSingleRequiredProperty();
		}
		if (editorKey == EefnrViewsRepository.SingleCompositionViewerSample.Properties.singlecompositionviewerSingleOptionalProperty) {
			return EefnrPackage.eINSTANCE.getSingleCompositionViewerSample_SinglecompositionviewSingleOptionalProperty();
		}
		if (editorKey == EefnrViewsRepository.SingleCompositionViewerSample.Properties.singlecompositionviewerMultiRequiredProperty) {
			return EefnrPackage.eINSTANCE.getSingleCompositionViewerSample_SinglecompositionviewMultiRequiredProperty();
		}
		if (editorKey == EefnrViewsRepository.SingleCompositionViewerSample.Properties.singlecompositionviewerMultiOptionalProperty) {
			return EefnrPackage.eINSTANCE.getSingleCompositionViewerSample_SinglecompositionviewMultiOptionalProperty();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		SingleCompositionViewerSample singleCompositionViewerSample = (SingleCompositionViewerSample)semanticObject;
		if (EefnrViewsRepository.SingleCompositionViewerSample.Properties.singlecompositionviewerSingleRequiredProperty == event.getAffectedEditor()) {
			//FIXME: Sorry this widget is deprecated for this version.
		}
		if (EefnrViewsRepository.SingleCompositionViewerSample.Properties.singlecompositionviewerSingleOptionalProperty == event.getAffectedEditor()) {
			//FIXME: Sorry this widget is deprecated for this version.
		}
		if (EefnrViewsRepository.SingleCompositionViewerSample.Properties.singlecompositionviewerMultiRequiredProperty == event.getAffectedEditor()) {
			//FIXME: Sorry this widget is deprecated for this version.
		}
		if (EefnrViewsRepository.SingleCompositionViewerSample.Properties.singlecompositionviewerMultiOptionalProperty == event.getAffectedEditor()) {
			//FIXME: Sorry this widget is deprecated for this version.
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			SingleCompositionViewerSamplePropertiesEditionPart basePart = (SingleCompositionViewerSamplePropertiesEditionPart)editingPart;
			//FIXME: Sorry this widget is deprecated for this version.
			//FIXME: Sorry this widget is deprecated for this version.
			//FIXME: Sorry this widget is deprecated for this version.
			//FIXME: Sorry this widget is deprecated for this version.
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == EefnrViewsRepository.SingleCompositionViewerSample.Properties.singlecompositionviewerSingleRequiredProperty || key == EefnrViewsRepository.SingleCompositionViewerSample.Properties.singlecompositionviewerMultiRequiredProperty;
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
