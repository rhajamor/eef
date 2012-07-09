/*******************************************************************************
 * Copyright (c) 2008, 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.modelingBot.EEFActions.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.eef.components.ComponentsPackage;

import org.eclipse.emf.eef.extended.editor.EditorPackage;

import org.eclipse.emf.eef.extended.query.QueryPackage;

import org.eclipse.emf.eef.modelingBot.EEFActions.Add;
import org.eclipse.emf.eef.modelingBot.EEFActions.Cancel;
import org.eclipse.emf.eef.modelingBot.EEFActions.Check;
import org.eclipse.emf.eef.modelingBot.EEFActions.EEFAction;
import org.eclipse.emf.eef.modelingBot.EEFActions.EEFActionsFactory;
import org.eclipse.emf.eef.modelingBot.EEFActions.EEFActionsPackage;
import org.eclipse.emf.eef.modelingBot.EEFActions.EditAction;
import org.eclipse.emf.eef.modelingBot.EEFActions.OpenEEFEditor;
import org.eclipse.emf.eef.modelingBot.EEFActions.Remove;
import org.eclipse.emf.eef.modelingBot.EEFActions.SetAttribute;
import org.eclipse.emf.eef.modelingBot.EEFActions.SetReference;
import org.eclipse.emf.eef.modelingBot.EEFActions.Unset;

import org.eclipse.emf.eef.modelingBot.EEFActions.UnsetAttribute;
import org.eclipse.emf.eef.modelingBot.EEFActions.UnsetReference;
import org.eclipse.emf.eef.modelingBot.EclipseActions.EclipseActionsPackage;

import org.eclipse.emf.eef.modelingBot.EclipseActions.impl.EclipseActionsPackageImpl;

import org.eclipse.emf.eef.modelingBot.ModelingBotPackage;

import org.eclipse.emf.eef.modelingBot.impl.ModelingBotPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EEFActionsPackageImpl extends EPackageImpl implements EEFActionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass editActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unsetAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unsetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cancelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openEEFEditorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unsetReferenceEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.emf.eef.modelingBot.EEFActions.EEFActionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EEFActionsPackageImpl() {
		super(eNS_URI, EEFActionsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link EEFActionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EEFActionsPackage init() {
		if (isInited) return (EEFActionsPackage)EPackage.Registry.INSTANCE.getEPackage(EEFActionsPackage.eNS_URI);

		// Obtain or create and register package
		EEFActionsPackageImpl theEEFActionsPackage = (EEFActionsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EEFActionsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EEFActionsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EditorPackage.eINSTANCE.eClass();
		QueryPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ModelingBotPackageImpl theModelingBotPackage = (ModelingBotPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModelingBotPackage.eNS_URI) instanceof ModelingBotPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModelingBotPackage.eNS_URI) : ModelingBotPackage.eINSTANCE);
		EclipseActionsPackageImpl theEclipseActionsPackage = (EclipseActionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EclipseActionsPackage.eNS_URI) instanceof EclipseActionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EclipseActionsPackage.eNS_URI) : EclipseActionsPackage.eINSTANCE);

		// Create package meta-data objects
		theEEFActionsPackage.createPackageContents();
		theModelingBotPackage.createPackageContents();
		theEclipseActionsPackage.createPackageContents();

		// Initialize created meta-data
		theEEFActionsPackage.initializePackageContents();
		theModelingBotPackage.initializePackageContents();
		theEclipseActionsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEEFActionsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EEFActionsPackage.eNS_URI, theEEFActionsPackage);
		return theEEFActionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEEFAction() {
		return eefActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEditAction() {
		return editActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEditAction_PropertiesEditionElement() {
		return (EReference)editActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEditAction_ReferenceableObject() {
		return (EReference)editActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdd() {
		return addEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdd_Type() {
		return (EReference)addEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdd_EContainingFeature() {
		return (EReference)addEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemove() {
		return removeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetAttribute() {
		return setAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetAttribute_Values() {
		return (EAttribute)setAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetAttribute_EContainingFeature() {
		return (EReference)setAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnsetAttribute() {
		return unsetAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnsetAttribute_Values() {
		return (EAttribute)unsetAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnsetAttribute_EContainingFeature() {
		return (EReference)unsetAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnset() {
		return unsetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnset_Feature() {
		return (EReference)unsetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCancel() {
		return cancelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCancel_Action() {
		return (EReference)cancelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCheck() {
		return checkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpenEEFEditor() {
		return openEEFEditorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenEEFEditor_EditorName() {
		return (EAttribute)openEEFEditorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetReference() {
		return setReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetReference_Values() {
		return (EReference)setReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetReference_EContainingFeature() {
		return (EReference)setReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnsetReference() {
		return unsetReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnsetReference_Feature() {
		return (EReference)unsetReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnsetReference_Values() {
		return (EReference)unsetReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEFActionsFactory getEEFActionsFactory() {
		return (EEFActionsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		eefActionEClass = createEClass(EEF_ACTION);

		editActionEClass = createEClass(EDIT_ACTION);
		createEReference(editActionEClass, EDIT_ACTION__PROPERTIES_EDITION_ELEMENT);
		createEReference(editActionEClass, EDIT_ACTION__REFERENCEABLE_OBJECT);

		addEClass = createEClass(ADD);
		createEReference(addEClass, ADD__TYPE);
		createEReference(addEClass, ADD__ECONTAINING_FEATURE);

		removeEClass = createEClass(REMOVE);

		setAttributeEClass = createEClass(SET_ATTRIBUTE);
		createEAttribute(setAttributeEClass, SET_ATTRIBUTE__VALUES);
		createEReference(setAttributeEClass, SET_ATTRIBUTE__ECONTAINING_FEATURE);

		unsetAttributeEClass = createEClass(UNSET_ATTRIBUTE);
		createEAttribute(unsetAttributeEClass, UNSET_ATTRIBUTE__VALUES);
		createEReference(unsetAttributeEClass, UNSET_ATTRIBUTE__ECONTAINING_FEATURE);

		unsetEClass = createEClass(UNSET);
		createEReference(unsetEClass, UNSET__FEATURE);

		cancelEClass = createEClass(CANCEL);
		createEReference(cancelEClass, CANCEL__ACTION);

		checkEClass = createEClass(CHECK);

		openEEFEditorEClass = createEClass(OPEN_EEF_EDITOR);
		createEAttribute(openEEFEditorEClass, OPEN_EEF_EDITOR__EDITOR_NAME);

		setReferenceEClass = createEClass(SET_REFERENCE);
		createEReference(setReferenceEClass, SET_REFERENCE__VALUES);
		createEReference(setReferenceEClass, SET_REFERENCE__ECONTAINING_FEATURE);

		unsetReferenceEClass = createEClass(UNSET_REFERENCE);
		createEReference(unsetReferenceEClass, UNSET_REFERENCE__FEATURE);
		createEReference(unsetReferenceEClass, UNSET_REFERENCE__VALUES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ModelingBotPackage theModelingBotPackage = (ModelingBotPackage)EPackage.Registry.INSTANCE.getEPackage(ModelingBotPackage.eNS_URI);
		EditorPackage theEditorPackage = (EditorPackage)EPackage.Registry.INSTANCE.getEPackage(EditorPackage.eNS_URI);
		ComponentsPackage theComponentsPackage = (ComponentsPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentsPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		eefActionEClass.getESuperTypes().add(theModelingBotPackage.getAction());
		editActionEClass.getESuperTypes().add(this.getEEFAction());
		editActionEClass.getESuperTypes().add(theEditorPackage.getReferenceableObject());
		addEClass.getESuperTypes().add(this.getEditAction());
		removeEClass.getESuperTypes().add(this.getEditAction());
		setAttributeEClass.getESuperTypes().add(this.getEditAction());
		unsetAttributeEClass.getESuperTypes().add(this.getEditAction());
		unsetEClass.getESuperTypes().add(this.getEditAction());
		cancelEClass.getESuperTypes().add(this.getEEFAction());
		checkEClass.getESuperTypes().add(this.getEEFAction());
		openEEFEditorEClass.getESuperTypes().add(this.getEEFAction());
		setReferenceEClass.getESuperTypes().add(this.getEditAction());
		unsetReferenceEClass.getESuperTypes().add(this.getEditAction());

		// Initialize classes and features; add operations and parameters
		initEClass(eefActionEClass, EEFAction.class, "EEFAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(editActionEClass, EditAction.class, "EditAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEditAction_PropertiesEditionElement(), theComponentsPackage.getPropertiesEditionElement(), null, "propertiesEditionElement", null, 0, 1, EditAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEditAction_ReferenceableObject(), theEditorPackage.getReferenceableObject(), null, "referenceableObject", null, 0, 1, EditAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addEClass, Add.class, "Add", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdd_Type(), theEcorePackage.getEClass(), null, "type", null, 0, 1, Add.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdd_EContainingFeature(), theEcorePackage.getEStructuralFeature(), null, "eContainingFeature", null, 0, 1, Add.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(removeEClass, Remove.class, "Remove", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(setAttributeEClass, SetAttribute.class, "SetAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSetAttribute_Values(), theEcorePackage.getEString(), "values", null, 0, -1, SetAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetAttribute_EContainingFeature(), theEcorePackage.getEStructuralFeature(), null, "eContainingFeature", null, 0, 1, SetAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unsetAttributeEClass, UnsetAttribute.class, "UnsetAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnsetAttribute_Values(), theEcorePackage.getEString(), "values", null, 0, -1, UnsetAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnsetAttribute_EContainingFeature(), theEcorePackage.getEStructuralFeature(), null, "eContainingFeature", null, 0, 1, UnsetAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unsetEClass, Unset.class, "Unset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnset_Feature(), theEcorePackage.getEStructuralFeature(), null, "feature", null, 0, 1, Unset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cancelEClass, Cancel.class, "Cancel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCancel_Action(), theModelingBotPackage.getAction(), null, "action", null, 0, 1, Cancel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(checkEClass, Check.class, "Check", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(openEEFEditorEClass, OpenEEFEditor.class, "OpenEEFEditor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOpenEEFEditor_EditorName(), theEcorePackage.getEString(), "editorName", null, 0, 1, OpenEEFEditor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setReferenceEClass, SetReference.class, "SetReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSetReference_Values(), theEditorPackage.getReferenceableObject(), null, "values", null, 0, -1, SetReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetReference_EContainingFeature(), theEcorePackage.getEStructuralFeature(), null, "eContainingFeature", null, 0, 1, SetReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unsetReferenceEClass, UnsetReference.class, "UnsetReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnsetReference_Feature(), theEcorePackage.getEStructuralFeature(), null, "feature", null, 0, 1, UnsetReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnsetReference_Values(), theEditorPackage.getReferenceableObject(), null, "values", null, 0, -1, UnsetReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //EEFActionsPackageImpl
