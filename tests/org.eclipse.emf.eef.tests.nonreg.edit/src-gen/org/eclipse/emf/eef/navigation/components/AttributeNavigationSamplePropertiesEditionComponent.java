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
import org.eclipse.emf.eef.eefnr.EefnrPackage;
import org.eclipse.emf.eef.eefnr.navigation.AttributeNavigationSample;
import org.eclipse.emf.eef.eefnr.navigation.NavigationPackage;
import org.eclipse.emf.eef.eefnr.navigation.parts.AttributeNavigationSamplePropertiesEditionPart;
import org.eclipse.emf.eef.eefnr.navigation.parts.NavigationViewsRepository;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.ui.widgets.settings.EEFEditorSettingsBuilder;
import org.eclipse.emf.eef.runtime.ui.widgets.settings.EEFEditorSettingsBuilder.EEFEditorSettingsImpl;
import org.eclipse.emf.eef.runtime.ui.widgets.settings.NavigationStepBuilder;


// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class AttributeNavigationSamplePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	private final EEFEditorSettingsImpl singleDelegate1Settings = (EEFEditorSettingsImpl) EEFEditorSettingsBuilder.builder(semanticObject, NavigationPackage.eINSTANCE.getAttributeDelegate_Delegate1())
																													.addStep(
																															NavigationStepBuilder.create()
																																.setReference(NavigationPackage.eINSTANCE.getAttributeNavigationSample_SingleValuedAttributeDelegate())
																																.build()
																													).build();

	private final EEFEditorSettingsImpl singleDelegate2Settings = (EEFEditorSettingsImpl) EEFEditorSettingsBuilder.builder(semanticObject, NavigationPackage.eINSTANCE.getAttributeDelegate_Delegate2())
																													.addStep(
																															NavigationStepBuilder.create()
																																.setReference(NavigationPackage.eINSTANCE.getAttributeNavigationSample_SingleValuedAttributeDelegate())
																																.build()
																													).build();

	private final EEFEditorSettingsImpl multiDelegate1Settings = (EEFEditorSettingsImpl) EEFEditorSettingsBuilder.builder(semanticObject, NavigationPackage.eINSTANCE.getAttributeDelegate_Delegate1())
																													.addStep(
																															NavigationStepBuilder.create()
																																.setReference(NavigationPackage.eINSTANCE.getAttributeNavigationSample_MultiValuedAttributeDelegate())
																																.setIndex(0).build()
																													).build();

	private final EEFEditorSettingsImpl multiDelegate2Settings = (EEFEditorSettingsImpl) EEFEditorSettingsBuilder.builder(semanticObject, NavigationPackage.eINSTANCE.getAttributeDelegate_Delegate2())
																													.addStep(
																															NavigationStepBuilder.create()
																																.setReference(NavigationPackage.eINSTANCE.getAttributeNavigationSample_MultiValuedAttributeDelegate())
																																.setIndex(0).build()
																													).build();

	/**
	 * Default constructor
	 * 
	 */
	public AttributeNavigationSamplePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject attributeNavigationSample, String editing_mode) {
		super(editingContext, attributeNavigationSample, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = NavigationViewsRepository.class;
		partKey = NavigationViewsRepository.AttributeNavigationSample.class;
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
			final AttributeNavigationSample attributeNavigationSample = (AttributeNavigationSample)elt;
			final AttributeNavigationSamplePropertiesEditionPart basePart = (AttributeNavigationSamplePropertiesEditionPart)editingPart;
			// init values
			if (attributeNavigationSample.getName() != null && isAccessible(NavigationViewsRepository.AttributeNavigationSample.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), attributeNavigationSample.getName()));
			
			if (singleDelegate1Settings.getValue() != null && isAccessible(NavigationViewsRepository.AttributeNavigationSample.Properties.delegate1ForSingleValued))
				basePart.setDelegate1ForSingleValued(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), singleDelegate1Settings.getValue()));
			
			if (isAccessible(NavigationViewsRepository.AttributeNavigationSample.Properties.delegate2ForSingleValued)) {
				basePart.setDelegate2ForSingleValued(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), singleDelegate2Settings.getValue()));
			}
			
			if (multiDelegate1Settings.getValue() != null && isAccessible(NavigationViewsRepository.AttributeNavigationSample.Properties.delegate1ForSingleValued))
				basePart.setDelegate1ForSingleValued(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), multiDelegate1Settings.getValue()));
			
			if (isAccessible(NavigationViewsRepository.AttributeNavigationSample.Properties.delegate2ForSingleValued)) {
				basePart.setDelegate2ForSingleValued(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), multiDelegate2Settings.getValue()));
			}
			
			// init filters
			
			
			
			
			
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
		if (event.getAffectedEditor() == NavigationViewsRepository.AttributeNavigationSample.Properties.delegate1ForSingleValued) {
			return (singleDelegate1Settings.getValue() == null) ? (event.getNewValue() != null) : (!singleDelegate1Settings.getValue().equals(event.getNewValue()));
		}
		if (event.getAffectedEditor() == NavigationViewsRepository.AttributeNavigationSample.Properties.delegate2ForSingleValued) {
			return (singleDelegate2Settings.getValue() == null) ? (event.getNewValue() != null) : (!singleDelegate2Settings.getValue().equals(event.getNewValue()));
		}
		if (event.getAffectedEditor() == NavigationViewsRepository.AttributeNavigationSample.Properties.delegate1ForMultiValued) {
			return (multiDelegate1Settings.getValue() == null) ? (event.getNewValue() != null) : (!multiDelegate1Settings.getValue().equals(event.getNewValue()));
		}
		if (event.getAffectedEditor() == NavigationViewsRepository.AttributeNavigationSample.Properties.delegate2ForMultiValued) {
			return (multiDelegate2Settings.getValue() == null) ? (event.getNewValue() != null) : (!multiDelegate2Settings.getValue().equals(event.getNewValue()));
		}
		return super.shouldProcess(event);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#associatedFeature(java.lang.Object)
	 */
	protected EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == NavigationViewsRepository.AttributeNavigationSample.Properties.name) {
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
		AttributeNavigationSample attributeNavigationSample = (AttributeNavigationSample)semanticObject;
		if (NavigationViewsRepository.AttributeNavigationSample.Properties.name == event.getAffectedEditor()) {
			attributeNavigationSample.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (NavigationViewsRepository.AttributeNavigationSample.Properties.delegate1ForSingleValued == event.getAffectedEditor()) {
			singleDelegate1Settings.setValue((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (NavigationViewsRepository.AttributeNavigationSample.Properties.delegate2ForSingleValued == event.getAffectedEditor()) {
			singleDelegate2Settings.setValue((EEFConverterUtil.createIntFromString(EcorePackage.eINSTANCE.getEInt(), (String)event.getNewValue())));
		}
		if (NavigationViewsRepository.AttributeNavigationSample.Properties.delegate1ForSingleValued == event.getAffectedEditor()) {
			multiDelegate1Settings.setValue((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (NavigationViewsRepository.AttributeNavigationSample.Properties.delegate2ForSingleValued == event.getAffectedEditor()) {
			multiDelegate2Settings.setValue((EEFConverterUtil.createIntFromString(EcorePackage.eINSTANCE.getEInt(), (String)event.getNewValue())));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			AttributeNavigationSamplePropertiesEditionPart basePart = (AttributeNavigationSamplePropertiesEditionPart)editingPart;
			if (EefnrPackage.eINSTANCE.getAbstractSample_Name().equals(msg.getFeature()) && basePart != null && isAccessible(NavigationViewsRepository.AttributeNavigationSample.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (NavigationPackage.eINSTANCE.getAttributeDelegate_Delegate1().equals(msg.getFeature()) && basePart != null && isAccessible(NavigationViewsRepository.AttributeNavigationSample.Properties.delegate1ForSingleValued)) {
				if (msg.getNewValue() != null) {
					basePart.setDelegate1ForSingleValued(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setDelegate1ForSingleValued("");
				}
			}
			if (NavigationPackage.eINSTANCE.getAttributeDelegate_Delegate2().equals(msg.getFeature()) && basePart != null && isAccessible(NavigationViewsRepository.AttributeNavigationSample.Properties.delegate2ForSingleValued)) {
				if (msg.getNewValue() != null) {
					basePart.setDelegate2ForSingleValued(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), msg.getNewValue()));
				} else {
					basePart.setDelegate2ForSingleValued("");
				}
			}
			if (NavigationPackage.eINSTANCE.getAttributeDelegate_Delegate1().equals(msg.getFeature()) && basePart != null && isAccessible(NavigationViewsRepository.AttributeNavigationSample.Properties.delegate1ForSingleValued)) {
				if (msg.getNewValue() != null) {
					basePart.setDelegate1ForSingleValued(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setDelegate1ForSingleValued("");
				}
			}
			if (NavigationPackage.eINSTANCE.getAttributeDelegate_Delegate2().equals(msg.getFeature()) && basePart != null && isAccessible(NavigationViewsRepository.AttributeNavigationSample.Properties.delegate2ForSingleValued)) {
				if (msg.getNewValue() != null) {
					basePart.setDelegate2ForSingleValued(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), msg.getNewValue()));
				} else {
					basePart.setDelegate2ForSingleValued("");
				}
			}
			
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#mustBeComposed(java.lang.Object, int)
	 */
	public boolean mustBeComposed(Object key, int kind) {
		return key == NavigationViewsRepository.AttributeNavigationSample.Properties.name || key == NavigationViewsRepository.AttributeNavigationSample.Properties.delegate1ForSingleValued || key == NavigationViewsRepository.AttributeNavigationSample.Properties.delegate2ForSingleValued || key == NavigationViewsRepository.AttributeNavigationSample.Properties.delegate1ForMultiValued || key == NavigationViewsRepository.AttributeNavigationSample.Properties.delegate2ForMultiValued || key == NavigationViewsRepository.AttributeNavigationSample.Properties.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == NavigationViewsRepository.AttributeNavigationSample.Properties.delegate1ForSingleValued || key == NavigationViewsRepository.AttributeNavigationSample.Properties.delegate1ForSingleValued;
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
				if (NavigationViewsRepository.AttributeNavigationSample.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(EefnrPackage.eINSTANCE.getAbstractSample_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EefnrPackage.eINSTANCE.getAbstractSample_Name().getEAttributeType(), newValue);
				}
				if (NavigationViewsRepository.AttributeNavigationSample.Properties.delegate1ForSingleValued == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(NavigationPackage.eINSTANCE.getAttributeDelegate_Delegate1().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(NavigationPackage.eINSTANCE.getAttributeDelegate_Delegate1().getEAttributeType(), newValue);
				}
				if (NavigationViewsRepository.AttributeNavigationSample.Properties.delegate2ForSingleValued == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(NavigationPackage.eINSTANCE.getAttributeDelegate_Delegate2().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(NavigationPackage.eINSTANCE.getAttributeDelegate_Delegate2().getEAttributeType(), newValue);
				}
				if (NavigationViewsRepository.AttributeNavigationSample.Properties.delegate1ForSingleValued == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(NavigationPackage.eINSTANCE.getAttributeDelegate_Delegate1().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(NavigationPackage.eINSTANCE.getAttributeDelegate_Delegate1().getEAttributeType(), newValue);
				}
				if (NavigationViewsRepository.AttributeNavigationSample.Properties.delegate2ForSingleValued == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(NavigationPackage.eINSTANCE.getAttributeDelegate_Delegate2().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(NavigationPackage.eINSTANCE.getAttributeDelegate_Delegate2().getEAttributeType(), newValue);
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
