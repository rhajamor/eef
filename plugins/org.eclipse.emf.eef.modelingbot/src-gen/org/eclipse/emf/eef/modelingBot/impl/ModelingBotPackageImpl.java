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
package org.eclipse.emf.eef.modelingBot.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.eef.components.ComponentsPackage;

import org.eclipse.emf.eef.extended.editor.EditorPackage;

import org.eclipse.emf.eef.extended.query.QueryPackage;

import org.eclipse.emf.eef.modelingBot.Action;
import org.eclipse.emf.eef.modelingBot.DetailsPage;
import org.eclipse.emf.eef.modelingBot.DocumentedElement;

import org.eclipse.emf.eef.modelingBot.EEFActions.EEFActionsPackage;

import org.eclipse.emf.eef.modelingBot.EEFActions.impl.EEFActionsPackageImpl;

import org.eclipse.emf.eef.modelingBot.EclipseActions.EclipseActionsPackage;

import org.eclipse.emf.eef.modelingBot.EclipseActions.impl.EclipseActionsPackageImpl;

import org.eclipse.emf.eef.modelingBot.ModelingBot;
import org.eclipse.emf.eef.modelingBot.ModelingBotFactory;
import org.eclipse.emf.eef.modelingBot.ModelingBotPackage;
import org.eclipse.emf.eef.modelingBot.Processing;
import org.eclipse.emf.eef.modelingBot.PropertiesView;
import org.eclipse.emf.eef.modelingBot.Scenario;
import org.eclipse.emf.eef.modelingBot.Sequence;
import org.eclipse.emf.eef.modelingBot.SequenceType;
import org.eclipse.emf.eef.modelingBot.Wizard;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelingBotPackageImpl extends EPackageImpl implements ModelingBotPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scenarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wizardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelingBotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass detailsPageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertiesViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sequenceTypeEEnum = null;

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
	 * @see org.eclipse.emf.eef.modelingBot.ModelingBotPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModelingBotPackageImpl() {
		super(eNS_URI, ModelingBotFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ModelingBotPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModelingBotPackage init() {
		if (isInited) return (ModelingBotPackage)EPackage.Registry.INSTANCE.getEPackage(ModelingBotPackage.eNS_URI);

		// Obtain or create and register package
		ModelingBotPackageImpl theModelingBotPackage = (ModelingBotPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModelingBotPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModelingBotPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EditorPackage.eINSTANCE.eClass();
		QueryPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		EEFActionsPackageImpl theEEFActionsPackage = (EEFActionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EEFActionsPackage.eNS_URI) instanceof EEFActionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EEFActionsPackage.eNS_URI) : EEFActionsPackage.eINSTANCE);
		EclipseActionsPackageImpl theEclipseActionsPackage = (EclipseActionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EclipseActionsPackage.eNS_URI) instanceof EclipseActionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EclipseActionsPackage.eNS_URI) : EclipseActionsPackage.eINSTANCE);

		// Create package meta-data objects
		theModelingBotPackage.createPackageContents();
		theEEFActionsPackage.createPackageContents();
		theEclipseActionsPackage.createPackageContents();

		// Initialize created meta-data
		theModelingBotPackage.initializePackageContents();
		theEEFActionsPackage.initializePackageContents();
		theEclipseActionsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModelingBotPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModelingBotPackage.eNS_URI, theModelingBotPackage);
		return theModelingBotPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScenario() {
		return scenarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequence() {
		return sequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequence_Actions() {
		return (EReference)sequenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequence_Sequences() {
		return (EReference)sequenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequence_Processings() {
		return (EReference)sequenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWizard() {
		return wizardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWizard_ReferenceableObject() {
		return (EReference)wizardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentedElement() {
		return documentedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentedElement_Name() {
		return (EAttribute)documentedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentedElement_Documentation() {
		return (EAttribute)documentedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelingBot() {
		return modelingBotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelingBot_PropertiesEditionContext() {
		return (EReference)modelingBotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelingBot_Sequences() {
		return (EReference)modelingBotEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDetailsPage() {
		return detailsPageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertiesView() {
		return propertiesViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertiesView_Id() {
		return (EAttribute)propertiesViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessing() {
		return processingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSequenceType() {
		return sequenceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelingBotFactory getModelingBotFactory() {
		return (ModelingBotFactory)getEFactoryInstance();
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
		scenarioEClass = createEClass(SCENARIO);

		actionEClass = createEClass(ACTION);

		sequenceEClass = createEClass(SEQUENCE);
		createEReference(sequenceEClass, SEQUENCE__ACTIONS);
		createEReference(sequenceEClass, SEQUENCE__SEQUENCES);
		createEReference(sequenceEClass, SEQUENCE__PROCESSINGS);

		wizardEClass = createEClass(WIZARD);
		createEReference(wizardEClass, WIZARD__REFERENCEABLE_OBJECT);

		documentedElementEClass = createEClass(DOCUMENTED_ELEMENT);
		createEAttribute(documentedElementEClass, DOCUMENTED_ELEMENT__NAME);
		createEAttribute(documentedElementEClass, DOCUMENTED_ELEMENT__DOCUMENTATION);

		modelingBotEClass = createEClass(MODELING_BOT);
		createEReference(modelingBotEClass, MODELING_BOT__PROPERTIES_EDITION_CONTEXT);
		createEReference(modelingBotEClass, MODELING_BOT__SEQUENCES);

		detailsPageEClass = createEClass(DETAILS_PAGE);

		propertiesViewEClass = createEClass(PROPERTIES_VIEW);
		createEAttribute(propertiesViewEClass, PROPERTIES_VIEW__ID);

		processingEClass = createEClass(PROCESSING);

		// Create enums
		sequenceTypeEEnum = createEEnum(SEQUENCE_TYPE);
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
		EEFActionsPackage theEEFActionsPackage = (EEFActionsPackage)EPackage.Registry.INSTANCE.getEPackage(EEFActionsPackage.eNS_URI);
		EclipseActionsPackage theEclipseActionsPackage = (EclipseActionsPackage)EPackage.Registry.INSTANCE.getEPackage(EclipseActionsPackage.eNS_URI);
		EditorPackage theEditorPackage = (EditorPackage)EPackage.Registry.INSTANCE.getEPackage(EditorPackage.eNS_URI);
		ComponentsPackage theComponentsPackage = (ComponentsPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentsPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theEEFActionsPackage);
		getESubpackages().add(theEclipseActionsPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		scenarioEClass.getESuperTypes().add(this.getSequence());
		actionEClass.getESuperTypes().add(this.getDocumentedElement());
		actionEClass.getESuperTypes().add(this.getProcessing());
		sequenceEClass.getESuperTypes().add(this.getDocumentedElement());
		sequenceEClass.getESuperTypes().add(this.getProcessing());
		wizardEClass.getESuperTypes().add(this.getSequence());
		detailsPageEClass.getESuperTypes().add(this.getSequence());
		propertiesViewEClass.getESuperTypes().add(this.getSequence());

		// Initialize classes and features; add operations and parameters
		initEClass(scenarioEClass, Scenario.class, "Scenario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actionEClass, Action.class, "Action", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sequenceEClass, Sequence.class, "Sequence", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSequence_Actions(), this.getAction(), null, "actions", null, 0, -1, Sequence.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSequence_Sequences(), this.getSequence(), null, "sequences", null, 0, -1, Sequence.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSequence_Processings(), this.getProcessing(), null, "processings", null, 0, -1, Sequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wizardEClass, Wizard.class, "Wizard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWizard_ReferenceableObject(), theEditorPackage.getReferenceableObject(), null, "referenceableObject", null, 0, 1, Wizard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentedElementEClass, DocumentedElement.class, "DocumentedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, DocumentedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentedElement_Documentation(), ecorePackage.getEString(), "documentation", null, 0, 1, DocumentedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelingBotEClass, ModelingBot.class, "ModelingBot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelingBot_PropertiesEditionContext(), theComponentsPackage.getPropertiesEditionContext(), null, "propertiesEditionContext", null, 0, 1, ModelingBot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelingBot_Sequences(), this.getSequence(), null, "sequences", null, 0, -1, ModelingBot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(detailsPageEClass, DetailsPage.class, "DetailsPage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propertiesViewEClass, PropertiesView.class, "PropertiesView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropertiesView_Id(), theEcorePackage.getEString(), "id", null, 0, 1, PropertiesView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processingEClass, Processing.class, "Processing", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(sequenceTypeEEnum, SequenceType.class, "SequenceType");
		addEEnumLiteral(sequenceTypeEEnum, SequenceType.DETAILS_PAGE);
		addEEnumLiteral(sequenceTypeEEnum, SequenceType.WIZARD);
		addEEnumLiteral(sequenceTypeEEnum, SequenceType.PROPERTIES_VIEW);

		// Create resource
		createResource(eNS_URI);
	}

} //ModelingBotPackageImpl
