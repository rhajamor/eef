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
package org.eclipse.emf.eef.filters.components;

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

import org.eclipse.emf.eef.mapping.filters.JavaDeclarationStepFilter;

import org.eclipse.emf.eef.mapping.filters.parts.FiltersViewsRepository;
import org.eclipse.emf.eef.mapping.filters.parts.JavaDeclarationStepFilterPropertiesEditionPart;

import org.eclipse.emf.eef.mapping.navigation.NavigationPackage;

import org.eclipse.emf.eef.runtime.api.notify.EStructuralFeatureNotificationFilter;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.NotificationFilter;

import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;

import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;

import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;


// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class JavaDeclarationStepFilterPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public JavaDeclarationStepFilterPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject javaDeclarationStepFilter, String editing_mode) {
		super(editingContext, javaDeclarationStepFilter, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = FiltersViewsRepository.class;
		partKey = FiltersViewsRepository.JavaDeclarationStepFilter.class;
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
			final JavaDeclarationStepFilter javaDeclarationStepFilter = (JavaDeclarationStepFilter)elt;
			final JavaDeclarationStepFilterPropertiesEditionPart basePart = (JavaDeclarationStepFilterPropertiesEditionPart)editingPart;
			// init values
			if (javaDeclarationStepFilter.getQualifiedClass() != null && isAccessible(FiltersViewsRepository.JavaDeclarationStepFilter.Properties.qualifiedClass))
				basePart.setQualifiedClass(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, javaDeclarationStepFilter.getQualifiedClass()));
			
			if (javaDeclarationStepFilter.getMethodFilter() != null && isAccessible(FiltersViewsRepository.JavaDeclarationStepFilter.Properties.methodFilter))
				basePart.setMethodFilter(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, javaDeclarationStepFilter.getMethodFilter()));
			
			if (isAccessible(FiltersViewsRepository.JavaDeclarationStepFilter.Properties.staticMethod)) {
				basePart.setStaticMethod(javaDeclarationStepFilter.isStaticMethod());
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
		if (editorKey == FiltersViewsRepository.JavaDeclarationStepFilter.Properties.qualifiedClass) {
			return NavigationPackage.eINSTANCE.getJavaDeclarationExpression_QualifiedClass();
		}
		if (editorKey == FiltersViewsRepository.JavaDeclarationStepFilter.Properties.methodFilter) {
			return NavigationPackage.eINSTANCE.getJavaDeclarationExpression_MethodFilter();
		}
		if (editorKey == FiltersViewsRepository.JavaDeclarationStepFilter.Properties.staticMethod) {
			return NavigationPackage.eINSTANCE.getJavaDeclarationExpression_StaticMethod();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		JavaDeclarationStepFilter javaDeclarationStepFilter = (JavaDeclarationStepFilter)semanticObject;
		if (FiltersViewsRepository.JavaDeclarationStepFilter.Properties.qualifiedClass == event.getAffectedEditor()) {
			javaDeclarationStepFilter.setQualifiedClass((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (FiltersViewsRepository.JavaDeclarationStepFilter.Properties.methodFilter == event.getAffectedEditor()) {
			javaDeclarationStepFilter.setMethodFilter((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (FiltersViewsRepository.JavaDeclarationStepFilter.Properties.staticMethod == event.getAffectedEditor()) {
			javaDeclarationStepFilter.setStaticMethod((Boolean)event.getNewValue());
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			JavaDeclarationStepFilterPropertiesEditionPart basePart = (JavaDeclarationStepFilterPropertiesEditionPart)editingPart;
			if (NavigationPackage.eINSTANCE.getJavaDeclarationExpression_QualifiedClass().equals(msg.getFeature()) && basePart != null && isAccessible(FiltersViewsRepository.JavaDeclarationStepFilter.Properties.qualifiedClass)) {
				if (msg.getNewValue() != null) {
					basePart.setQualifiedClass(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setQualifiedClass("");
				}
			}
			if (NavigationPackage.eINSTANCE.getJavaDeclarationExpression_MethodFilter().equals(msg.getFeature()) && basePart != null && isAccessible(FiltersViewsRepository.JavaDeclarationStepFilter.Properties.methodFilter)) {
				if (msg.getNewValue() != null) {
					basePart.setMethodFilter(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setMethodFilter("");
				}
			}
			if (NavigationPackage.eINSTANCE.getJavaDeclarationExpression_StaticMethod().equals(msg.getFeature()) && basePart != null && isAccessible(FiltersViewsRepository.JavaDeclarationStepFilter.Properties.staticMethod))
				basePart.setStaticMethod((Boolean)msg.getNewValue());
			
			
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#getNotificationFilters()
	 */
	@Override
	protected NotificationFilter[] getNotificationFilters() {
		NotificationFilter filter = new EStructuralFeatureNotificationFilter(
			NavigationPackage.eINSTANCE.getJavaDeclarationExpression_QualifiedClass(),
			NavigationPackage.eINSTANCE.getJavaDeclarationExpression_MethodFilter(),
			NavigationPackage.eINSTANCE.getJavaDeclarationExpression_StaticMethod());
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == FiltersViewsRepository.JavaDeclarationStepFilter.Properties.qualifiedClass || key == FiltersViewsRepository.JavaDeclarationStepFilter.Properties.methodFilter;
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
				if (FiltersViewsRepository.JavaDeclarationStepFilter.Properties.qualifiedClass == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(NavigationPackage.eINSTANCE.getJavaDeclarationExpression_QualifiedClass().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(NavigationPackage.eINSTANCE.getJavaDeclarationExpression_QualifiedClass().getEAttributeType(), newValue);
				}
				if (FiltersViewsRepository.JavaDeclarationStepFilter.Properties.methodFilter == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(NavigationPackage.eINSTANCE.getJavaDeclarationExpression_MethodFilter().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(NavigationPackage.eINSTANCE.getJavaDeclarationExpression_MethodFilter().getEAttributeType(), newValue);
				}
				if (FiltersViewsRepository.JavaDeclarationStepFilter.Properties.staticMethod == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(NavigationPackage.eINSTANCE.getJavaDeclarationExpression_StaticMethod().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(NavigationPackage.eINSTANCE.getJavaDeclarationExpression_StaticMethod().getEAttributeType(), newValue);
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
