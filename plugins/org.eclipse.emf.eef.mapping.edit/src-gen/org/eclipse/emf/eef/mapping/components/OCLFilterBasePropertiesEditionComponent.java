/**
 *  Copyright (c) 2008 - 2010 Obeo.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *      Obeo - initial API and implementation
 *
 */
package org.eclipse.emf.eef.mapping.components;

// Start of user code for imports

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.mapping.filters.FiltersPackage;
import org.eclipse.emf.eef.mapping.filters.OCLFilter;
import org.eclipse.emf.eef.mapping.parts.MappingViewsRepository;
import org.eclipse.emf.eef.mapping.parts.OCLFilterPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;

// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class OCLFilterBasePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public OCLFilterBasePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject oCLFilter, String editing_mode) {
		super(editingContext, oCLFilter, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = MappingViewsRepository.class;
		partKey = MappingViewsRepository.OCLFilter.class;
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
			final OCLFilter oCLFilter = (OCLFilter)elt;
			final OCLFilterPropertiesEditionPart basePart = (OCLFilterPropertiesEditionPart)editingPart;
			// init values
			if (oCLFilter.getOCLBody() != null && isAccessible(MappingViewsRepository.OCLFilter.FilterExpression.oCLExpressionBody))
				basePart.setOCLExpressionBody(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), oCLFilter.getOCLBody()));
			// init filters
			
			// init values for referenced views
					basePart.getFilterPropertiesReferencedView().setContext(elt, allResource);
			
			// init filters for referenced views
			
			
			
		}
		setInitializing(false);
	}






	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#associatedFeature(java.lang.Object)
	 */
	protected EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == MappingViewsRepository.OCLFilter.FilterExpression.oCLExpressionBody) {
			return FiltersPackage.eINSTANCE.getOCLFilter_OCLBody();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		OCLFilter oCLFilter = (OCLFilter)semanticObject;
		if (MappingViewsRepository.OCLFilter.FilterExpression.oCLExpressionBody == event.getAffectedEditor()) {
			oCLFilter.setOCLBody((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			OCLFilterPropertiesEditionPart basePart = (OCLFilterPropertiesEditionPart)editingPart;
			if (FiltersPackage.eINSTANCE.getOCLFilter_OCLBody().equals(msg.getFeature()) && basePart != null && isAccessible(MappingViewsRepository.OCLFilter.FilterExpression.oCLExpressionBody)){
				if (msg.getNewValue() != null) {
					basePart.setOCLExpressionBody(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setOCLExpressionBody("");
				}
			}
			
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
				if (MappingViewsRepository.OCLFilter.FilterExpression.oCLExpressionBody == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(FiltersPackage.eINSTANCE.getOCLFilter_OCLBody().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(FiltersPackage.eINSTANCE.getOCLFilter_OCLBody().getEAttributeType(), newValue);
				}
				if (MappingViewsRepository.FilterProperties.FilterProperties_.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(FiltersPackage.eINSTANCE.getBindingFilter_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(FiltersPackage.eINSTANCE.getBindingFilter_Name().getEAttributeType(), newValue);
				}
				if (MappingViewsRepository.FilterProperties.FilterProperties_.mandatory == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(FiltersPackage.eINSTANCE.getBindingFilter_Mandatory().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(FiltersPackage.eINSTANCE.getBindingFilter_Mandatory().getEAttributeType(), newValue);
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
