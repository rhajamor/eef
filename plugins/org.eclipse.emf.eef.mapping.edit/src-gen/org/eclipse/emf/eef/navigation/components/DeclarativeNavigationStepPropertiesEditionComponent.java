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
package org.eclipse.emf.eef.navigation.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.emf.eef.mapping.navigation.DeclarativeNavigationStep;
import org.eclipse.emf.eef.mapping.navigation.NavigationPackage;

import org.eclipse.emf.eef.mapping.navigation.parts.DeclarativeNavigationStepPropertiesEditionPart;
import org.eclipse.emf.eef.mapping.navigation.parts.NavigationViewsRepository;

import org.eclipse.emf.eef.runtime.api.notify.EStructuralFeatureNotificationFilter;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.NotificationFilter;

import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;

import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;

import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;

import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;

import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;

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
public class DeclarativeNavigationStepPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for feature EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings featureSettings;
	
	/**
	 * Settings for discriminatorType EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings discriminatorTypeSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public DeclarativeNavigationStepPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject declarativeNavigationStep, String editing_mode) {
		super(editingContext, declarativeNavigationStep, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = NavigationViewsRepository.class;
		partKey = NavigationViewsRepository.DeclarativeNavigationStep.class;
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
			final DeclarativeNavigationStep declarativeNavigationStep = (DeclarativeNavigationStep)elt;
			final DeclarativeNavigationStepPropertiesEditionPart basePart = (DeclarativeNavigationStepPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(NavigationViewsRepository.DeclarativeNavigationStep.Properties.createsIfNotExists)) {
				basePart.setCreatesIfNotExists(declarativeNavigationStep.isCreatesIfNotExists());
			}
			if (isAccessible(NavigationViewsRepository.DeclarativeNavigationStep.Properties.index)) {
				basePart.setIndex(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, declarativeNavigationStep.getIndex()));
			}
			
			if (isAccessible(NavigationViewsRepository.DeclarativeNavigationStep.Properties.feature)) {
				// init part
				featureSettings = new EObjectFlatComboSettings(declarativeNavigationStep, NavigationPackage.eINSTANCE.getDeclarativeNavigationStep_Feature());
				basePart.initFeature(featureSettings);
				// set the button mode
				basePart.setFeatureButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(NavigationViewsRepository.DeclarativeNavigationStep.Properties.discriminatorType)) {
				// init part
				discriminatorTypeSettings = new EObjectFlatComboSettings(declarativeNavigationStep, NavigationPackage.eINSTANCE.getDeclarativeNavigationStep_DiscriminatorType());
				basePart.initDiscriminatorType(discriminatorTypeSettings);
				// set the button mode
				basePart.setDiscriminatorTypeButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			
			
			if (isAccessible(NavigationViewsRepository.DeclarativeNavigationStep.Properties.feature)) {
				basePart.addFilterToFeature(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof EReference);
					}
					
				});
				// Start of user code for additional businessfilters for feature
				// End of user code
			}
			if (isAccessible(NavigationViewsRepository.DeclarativeNavigationStep.Properties.discriminatorType)) {
				basePart.addFilterToDiscriminatorType(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof EClassifier); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for discriminatorType
				// End of user code
			}
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
		if (editorKey == NavigationViewsRepository.DeclarativeNavigationStep.Properties.createsIfNotExists) {
			return NavigationPackage.eINSTANCE.getNavigationStep_CreatesIfNotExists();
		}
		if (editorKey == NavigationViewsRepository.DeclarativeNavigationStep.Properties.index) {
			return NavigationPackage.eINSTANCE.getDeclarativeNavigationStep_Index();
		}
		if (editorKey == NavigationViewsRepository.DeclarativeNavigationStep.Properties.feature) {
			return NavigationPackage.eINSTANCE.getDeclarativeNavigationStep_Feature();
		}
		if (editorKey == NavigationViewsRepository.DeclarativeNavigationStep.Properties.discriminatorType) {
			return NavigationPackage.eINSTANCE.getDeclarativeNavigationStep_DiscriminatorType();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		DeclarativeNavigationStep declarativeNavigationStep = (DeclarativeNavigationStep)semanticObject;
		if (NavigationViewsRepository.DeclarativeNavigationStep.Properties.createsIfNotExists == event.getAffectedEditor()) {
			declarativeNavigationStep.setCreatesIfNotExists((Boolean)event.getNewValue());
		}
		if (NavigationViewsRepository.DeclarativeNavigationStep.Properties.index == event.getAffectedEditor()) {
			declarativeNavigationStep.setIndex((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
		if (NavigationViewsRepository.DeclarativeNavigationStep.Properties.feature == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				featureSettings.setToReference((EReference)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReference eObject = EcoreFactory.eINSTANCE.createEReference();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				featureSettings.setToReference(eObject);
			}
		}
		if (NavigationViewsRepository.DeclarativeNavigationStep.Properties.discriminatorType == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				discriminatorTypeSettings.setToReference((EClassifier)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, discriminatorTypeSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			DeclarativeNavigationStepPropertiesEditionPart basePart = (DeclarativeNavigationStepPropertiesEditionPart)editingPart;
			if (NavigationPackage.eINSTANCE.getNavigationStep_CreatesIfNotExists().equals(msg.getFeature()) && basePart != null && isAccessible(NavigationViewsRepository.DeclarativeNavigationStep.Properties.createsIfNotExists))
				basePart.setCreatesIfNotExists((Boolean)msg.getNewValue());
			
			if (NavigationPackage.eINSTANCE.getDeclarativeNavigationStep_Index().equals(msg.getFeature()) && basePart != null && isAccessible(NavigationViewsRepository.DeclarativeNavigationStep.Properties.index)) {
				if (msg.getNewValue() != null) {
					basePart.setIndex(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					basePart.setIndex("");
				}
			}
			if (NavigationPackage.eINSTANCE.getDeclarativeNavigationStep_Feature().equals(msg.getFeature()) && basePart != null && isAccessible(NavigationViewsRepository.DeclarativeNavigationStep.Properties.feature))
				basePart.setFeature((EObject)msg.getNewValue());
			if (NavigationPackage.eINSTANCE.getDeclarativeNavigationStep_DiscriminatorType().equals(msg.getFeature()) && basePart != null && isAccessible(NavigationViewsRepository.DeclarativeNavigationStep.Properties.discriminatorType))
				basePart.setDiscriminatorType((EObject)msg.getNewValue());
			
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
			NavigationPackage.eINSTANCE.getNavigationStep_CreatesIfNotExists(),
			NavigationPackage.eINSTANCE.getDeclarativeNavigationStep_Index(),
			NavigationPackage.eINSTANCE.getDeclarativeNavigationStep_Feature(),
			NavigationPackage.eINSTANCE.getDeclarativeNavigationStep_DiscriminatorType());
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == NavigationViewsRepository.DeclarativeNavigationStep.Properties.createsIfNotExists || key == NavigationViewsRepository.DeclarativeNavigationStep.Properties.feature;
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
				if (NavigationViewsRepository.DeclarativeNavigationStep.Properties.createsIfNotExists == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(NavigationPackage.eINSTANCE.getNavigationStep_CreatesIfNotExists().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(NavigationPackage.eINSTANCE.getNavigationStep_CreatesIfNotExists().getEAttributeType(), newValue);
				}
				if (NavigationViewsRepository.DeclarativeNavigationStep.Properties.index == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(NavigationPackage.eINSTANCE.getDeclarativeNavigationStep_Index().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(NavigationPackage.eINSTANCE.getDeclarativeNavigationStep_Index().getEAttributeType(), newValue);
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
