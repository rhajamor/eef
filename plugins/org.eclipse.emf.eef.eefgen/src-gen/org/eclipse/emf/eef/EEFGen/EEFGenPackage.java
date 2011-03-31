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
package org.eclipse.emf.eef.EEFGen;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.eef.EEFGen.EEFGenFactory
 * @model kind="package"
 * @generated
 */
public interface EEFGenPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "EEFGen";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/eef/generation/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "eef-gen";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EEFGenPackage eINSTANCE = org.eclipse.emf.eef.EEFGen.impl.EEFGenPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.EEFGen.impl.GenEditionContextImpl <em>Gen Edition Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.EEFGen.impl.GenEditionContextImpl
	 * @see org.eclipse.emf.eef.EEFGen.impl.EEFGenPackageImpl#getGenEditionContext()
	 * @generated
	 */
	int GEN_EDITION_CONTEXT = 0;

	/**
	 * The feature id for the '<em><b>Properties Edition Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EDITION_CONTEXT__PROPERTIES_EDITION_CONTEXT = 0;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EDITION_CONTEXT__BASE_PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Eef Gen Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EDITION_CONTEXT__EEF_GEN_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Descriptors Contributor ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EDITION_CONTEXT__DESCRIPTORS_CONTRIBUTOR_ID = 3;

	/**
	 * The feature id for the '<em><b>Descriptors Generic Properties Views</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EDITION_CONTEXT__DESCRIPTORS_GENERIC_PROPERTIES_VIEWS = 4;

	/**
	 * The feature id for the '<em><b>Gmf Properties Views</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EDITION_CONTEXT__GMF_PROPERTIES_VIEWS = 5;

	/**
	 * The feature id for the '<em><b>Generate Junit Test Cases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EDITION_CONTEXT__GENERATE_JUNIT_TEST_CASES = 6;

	/**
	 * The feature id for the '<em><b>Leaf Components Super Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EDITION_CONTEXT__LEAF_COMPONENTS_SUPER_CLASS = 7;

	/**
	 * The feature id for the '<em><b>Properties Editing Providers Super Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EDITION_CONTEXT__PROPERTIES_EDITING_PROVIDERS_SUPER_CLASS = 8;

	/**
	 * The number of structural features of the '<em>Gen Edition Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EDITION_CONTEXT_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.EEFGen.impl.EEFGenModelReferenceImpl <em>Model Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.EEFGen.impl.EEFGenModelReferenceImpl
	 * @see org.eclipse.emf.eef.EEFGen.impl.EEFGenPackageImpl#getEEFGenModelReference()
	 * @generated
	 */
	int EEF_GEN_MODEL_REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Referenced Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_GEN_MODEL_REFERENCE__REFERENCED_CONTEXT = 0;

	/**
	 * The number of structural features of the '<em>Model Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_GEN_MODEL_REFERENCE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.EEFGen.impl.EEFGenModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.EEFGen.impl.EEFGenModelImpl
	 * @see org.eclipse.emf.eef.EEFGen.impl.EEFGenPackageImpl#getEEFGenModel()
	 * @generated
	 */
	int EEF_GEN_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Edition Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_GEN_MODEL__EDITION_CONTEXTS = 0;

	/**
	 * The feature id for the '<em><b>Views Repositories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_GEN_MODEL__VIEWS_REPOSITORIES = 1;

	/**
	 * The feature id for the '<em><b>Gen Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_GEN_MODEL__GEN_DIRECTORY = 2;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_GEN_MODEL__AUTHOR = 3;

	/**
	 * The feature id for the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_GEN_MODEL__LICENSE = 4;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_GEN_MODEL__REFERENCES = 5;

	/**
	 * The feature id for the '<em><b>Tests Gen Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_GEN_MODEL__TESTS_GEN_DIRECTORY = 6;

	/**
	 * The feature id for the '<em><b>Use JMerge For User Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_GEN_MODEL__USE_JMERGE_FOR_USER_CODE = 7;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_GEN_MODEL_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.EEFGen.impl.GenViewsRepositoryImpl <em>Gen Views Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.EEFGen.impl.GenViewsRepositoryImpl
	 * @see org.eclipse.emf.eef.EEFGen.impl.EEFGenPackageImpl#getGenViewsRepository()
	 * @generated
	 */
	int GEN_VIEWS_REPOSITORY = 3;

	/**
	 * The feature id for the '<em><b>Views Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_VIEWS_REPOSITORY__VIEWS_REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_VIEWS_REPOSITORY__BASE_PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Swt Views</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_VIEWS_REPOSITORY__SWT_VIEWS = 2;

	/**
	 * The feature id for the '<em><b>Form Views</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_VIEWS_REPOSITORY__FORM_VIEWS = 3;

	/**
	 * The feature id for the '<em><b>Help Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_VIEWS_REPOSITORY__HELP_STRATEGY = 4;

	/**
	 * The feature id for the '<em><b>Eef Gen Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_VIEWS_REPOSITORY__EEF_GEN_MODEL = 5;

	/**
	 * The feature id for the '<em><b>Parts Super Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_VIEWS_REPOSITORY__PARTS_SUPER_CLASS = 6;

	/**
	 * The number of structural features of the '<em>Gen Views Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_VIEWS_REPOSITORY_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.EEFGen.HELP_STRATEGY <em>HELP STRATEGY</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.EEFGen.HELP_STRATEGY
	 * @see org.eclipse.emf.eef.EEFGen.impl.EEFGenPackageImpl#getHELP_STRATEGY()
	 * @generated
	 */
	int HELP_STRATEGY = 4;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.EEFGen.GenEditionContext <em>Gen Edition Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Edition Context</em>'.
	 * @see org.eclipse.emf.eef.EEFGen.GenEditionContext
	 * @generated
	 */
	EClass getGenEditionContext();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.eef.EEFGen.GenEditionContext#getPropertiesEditionContext <em>Properties Edition Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Properties Edition Context</em>'.
	 * @see org.eclipse.emf.eef.EEFGen.GenEditionContext#getPropertiesEditionContext()
	 * @see #getGenEditionContext()
	 * @generated
	 */
	EReference getGenEditionContext_PropertiesEditionContext();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.EEFGen.GenEditionContext#getBasePackage <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Package</em>'.
	 * @see org.eclipse.emf.eef.EEFGen.GenEditionContext#getBasePackage()
	 * @see #getGenEditionContext()
	 * @generated
	 */
	EAttribute getGenEditionContext_BasePackage();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.emf.eef.EEFGen.GenEditionContext#getEefGenModel <em>Eef Gen Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Eef Gen Model</em>'.
	 * @see org.eclipse.emf.eef.EEFGen.GenEditionContext#getEefGenModel()
	 * @see #getGenEditionContext()
	 * @generated
	 */
	EReference getGenEditionContext_EefGenModel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.EEFGen.GenEditionContext#getDescriptorsContributorID <em>Descriptors Contributor ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descriptors Contributor ID</em>'.
	 * @see org.eclipse.emf.eef.EEFGen.GenEditionContext#getDescriptorsContributorID()
	 * @see #getGenEditionContext()
	 * @generated
	 */
	EAttribute getGenEditionContext_DescriptorsContributorID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.EEFGen.GenEditionContext#isDescriptorsGenericPropertiesViews <em>Descriptors Generic Properties Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descriptors Generic Properties Views</em>'.
	 * @see org.eclipse.emf.eef.EEFGen.GenEditionContext#isDescriptorsGenericPropertiesViews()
	 * @see #getGenEditionContext()
	 * @generated
	 */
	EAttribute getGenEditionContext_DescriptorsGenericPropertiesViews();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.EEFGen.GenEditionContext#isGmfPropertiesViews <em>Gmf Properties Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gmf Properties Views</em>'.
	 * @see org.eclipse.emf.eef.EEFGen.GenEditionContext#isGmfPropertiesViews()
	 * @see #getGenEditionContext()
	 * @generated
	 */
	EAttribute getGenEditionContext_GmfPropertiesViews();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.EEFGen.GenEditionContext#isGenerateJunitTestCases <em>Generate Junit Test Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generate Junit Test Cases</em>'.
	 * @see org.eclipse.emf.eef.EEFGen.GenEditionContext#isGenerateJunitTestCases()
	 * @see #getGenEditionContext()
	 * @generated
	 */
	EAttribute getGenEditionContext_GenerateJunitTestCases();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.EEFGen.GenEditionContext#getLeafComponentsSuperClass <em>Leaf Components Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Leaf Components Super Class</em>'.
	 * @see org.eclipse.emf.eef.EEFGen.GenEditionContext#getLeafComponentsSuperClass()
	 * @see #getGenEditionContext()
	 * @generated
	 */
	EAttribute getGenEditionContext_LeafComponentsSuperClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.EEFGen.GenEditionContext#getPropertiesEditingProvidersSuperClass <em>Properties Editing Providers Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Properties Editing Providers Super Class</em>'.
	 * @see org.eclipse.emf.eef.EEFGen.GenEditionContext#getPropertiesEditingProvidersSuperClass()
	 * @see #getGenEditionContext()
	 * @generated
	 */
	EAttribute getGenEditionContext_PropertiesEditingProvidersSuperClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.EEFGen.EEFGenModelReference <em>Model Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Reference</em>'.
	 * @see org.eclipse.emf.eef.EEFGen.EEFGenModelReference
	 * @generated
	 */
	EClass getEEFGenModelReference();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.eef.EEFGen.EEFGenModelReference#getReferencedContext <em>Referenced Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Context</em>'.
	 * @see org.eclipse.emf.eef.EEFGen.EEFGenModelReference#getReferencedContext()
	 * @see #getEEFGenModelReference()
	 * @generated
	 */
	EReference getEEFGenModelReference_ReferencedContext();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.EEFGen.EEFGenModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see org.eclipse.emf.eef.EEFGen.EEFGenModel
	 * @generated
	 */
	EClass getEEFGenModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.eef.EEFGen.EEFGenModel#getEditionContexts <em>Edition Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Edition Contexts</em>'.
	 * @see org.eclipse.emf.eef.EEFGen.EEFGenModel#getEditionContexts()
	 * @see #getEEFGenModel()
	 * @generated
	 */
	EReference getEEFGenModel_EditionContexts();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.eef.EEFGen.EEFGenModel#getViewsRepositories <em>Views Repositories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Views Repositories</em>'.
	 * @see org.eclipse.emf.eef.EEFGen.EEFGenModel#getViewsRepositories()
	 * @see #getEEFGenModel()
	 * @generated
	 */
	EReference getEEFGenModel_ViewsRepositories();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.EEFGen.EEFGenModel#getGenDirectory <em>Gen Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gen Directory</em>'.
	 * @see org.eclipse.emf.eef.EEFGen.EEFGenModel#getGenDirectory()
	 * @see #getEEFGenModel()
	 * @generated
	 */
	EAttribute getEEFGenModel_GenDirectory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.EEFGen.EEFGenModel#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see org.eclipse.emf.eef.EEFGen.EEFGenModel#getAuthor()
	 * @see #getEEFGenModel()
	 * @generated
	 */
	EAttribute getEEFGenModel_Author();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.EEFGen.EEFGenModel#getLicense <em>License</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>License</em>'.
	 * @see org.eclipse.emf.eef.EEFGen.EEFGenModel#getLicense()
	 * @see #getEEFGenModel()
	 * @generated
	 */
	EAttribute getEEFGenModel_License();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.eef.EEFGen.EEFGenModel#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>References</em>'.
	 * @see org.eclipse.emf.eef.EEFGen.EEFGenModel#getReferences()
	 * @see #getEEFGenModel()
	 * @generated
	 */
	EReference getEEFGenModel_References();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.EEFGen.EEFGenModel#getTestsGenDirectory <em>Tests Gen Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tests Gen Directory</em>'.
	 * @see org.eclipse.emf.eef.EEFGen.EEFGenModel#getTestsGenDirectory()
	 * @see #getEEFGenModel()
	 * @generated
	 */
	EAttribute getEEFGenModel_TestsGenDirectory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.EEFGen.EEFGenModel#isUseJMergeForUserCode <em>Use JMerge For User Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use JMerge For User Code</em>'.
	 * @see org.eclipse.emf.eef.EEFGen.EEFGenModel#isUseJMergeForUserCode()
	 * @see #getEEFGenModel()
	 * @generated
	 */
	EAttribute getEEFGenModel_UseJMergeForUserCode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.EEFGen.GenViewsRepository <em>Gen Views Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Views Repository</em>'.
	 * @see org.eclipse.emf.eef.EEFGen.GenViewsRepository
	 * @generated
	 */
	EClass getGenViewsRepository();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.eef.EEFGen.GenViewsRepository#getViewsRepository <em>Views Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Views Repository</em>'.
	 * @see org.eclipse.emf.eef.EEFGen.GenViewsRepository#getViewsRepository()
	 * @see #getGenViewsRepository()
	 * @generated
	 */
	EReference getGenViewsRepository_ViewsRepository();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.EEFGen.GenViewsRepository#getBasePackage <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Package</em>'.
	 * @see org.eclipse.emf.eef.EEFGen.GenViewsRepository#getBasePackage()
	 * @see #getGenViewsRepository()
	 * @generated
	 */
	EAttribute getGenViewsRepository_BasePackage();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.EEFGen.GenViewsRepository#isSwtViews <em>Swt Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Swt Views</em>'.
	 * @see org.eclipse.emf.eef.EEFGen.GenViewsRepository#isSwtViews()
	 * @see #getGenViewsRepository()
	 * @generated
	 */
	EAttribute getGenViewsRepository_SwtViews();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.EEFGen.GenViewsRepository#isFormViews <em>Form Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Form Views</em>'.
	 * @see org.eclipse.emf.eef.EEFGen.GenViewsRepository#isFormViews()
	 * @see #getGenViewsRepository()
	 * @generated
	 */
	EAttribute getGenViewsRepository_FormViews();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.EEFGen.GenViewsRepository#getHelpStrategy <em>Help Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Help Strategy</em>'.
	 * @see org.eclipse.emf.eef.EEFGen.GenViewsRepository#getHelpStrategy()
	 * @see #getGenViewsRepository()
	 * @generated
	 */
	EAttribute getGenViewsRepository_HelpStrategy();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.emf.eef.EEFGen.GenViewsRepository#getEefGenModel <em>Eef Gen Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Eef Gen Model</em>'.
	 * @see org.eclipse.emf.eef.EEFGen.GenViewsRepository#getEefGenModel()
	 * @see #getGenViewsRepository()
	 * @generated
	 */
	EReference getGenViewsRepository_EefGenModel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.EEFGen.GenViewsRepository#getPartsSuperClass <em>Parts Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parts Super Class</em>'.
	 * @see org.eclipse.emf.eef.EEFGen.GenViewsRepository#getPartsSuperClass()
	 * @see #getGenViewsRepository()
	 * @generated
	 */
	EAttribute getGenViewsRepository_PartsSuperClass();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.eef.EEFGen.HELP_STRATEGY <em>HELP STRATEGY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>HELP STRATEGY</em>'.
	 * @see org.eclipse.emf.eef.EEFGen.HELP_STRATEGY
	 * @generated
	 */
	EEnum getHELP_STRATEGY();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EEFGenFactory getEEFGenFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.EEFGen.impl.GenEditionContextImpl <em>Gen Edition Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.EEFGen.impl.GenEditionContextImpl
		 * @see org.eclipse.emf.eef.EEFGen.impl.EEFGenPackageImpl#getGenEditionContext()
		 * @generated
		 */
		EClass GEN_EDITION_CONTEXT = eINSTANCE.getGenEditionContext();

		/**
		 * The meta object literal for the '<em><b>Properties Edition Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_EDITION_CONTEXT__PROPERTIES_EDITION_CONTEXT = eINSTANCE.getGenEditionContext_PropertiesEditionContext();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_EDITION_CONTEXT__BASE_PACKAGE = eINSTANCE.getGenEditionContext_BasePackage();

		/**
		 * The meta object literal for the '<em><b>Eef Gen Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_EDITION_CONTEXT__EEF_GEN_MODEL = eINSTANCE.getGenEditionContext_EefGenModel();

		/**
		 * The meta object literal for the '<em><b>Descriptors Contributor ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_EDITION_CONTEXT__DESCRIPTORS_CONTRIBUTOR_ID = eINSTANCE.getGenEditionContext_DescriptorsContributorID();

		/**
		 * The meta object literal for the '<em><b>Descriptors Generic Properties Views</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_EDITION_CONTEXT__DESCRIPTORS_GENERIC_PROPERTIES_VIEWS = eINSTANCE.getGenEditionContext_DescriptorsGenericPropertiesViews();

		/**
		 * The meta object literal for the '<em><b>Gmf Properties Views</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_EDITION_CONTEXT__GMF_PROPERTIES_VIEWS = eINSTANCE.getGenEditionContext_GmfPropertiesViews();

		/**
		 * The meta object literal for the '<em><b>Generate Junit Test Cases</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_EDITION_CONTEXT__GENERATE_JUNIT_TEST_CASES = eINSTANCE.getGenEditionContext_GenerateJunitTestCases();

		/**
		 * The meta object literal for the '<em><b>Leaf Components Super Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_EDITION_CONTEXT__LEAF_COMPONENTS_SUPER_CLASS = eINSTANCE.getGenEditionContext_LeafComponentsSuperClass();

		/**
		 * The meta object literal for the '<em><b>Properties Editing Providers Super Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_EDITION_CONTEXT__PROPERTIES_EDITING_PROVIDERS_SUPER_CLASS = eINSTANCE.getGenEditionContext_PropertiesEditingProvidersSuperClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.EEFGen.impl.EEFGenModelReferenceImpl <em>Model Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.EEFGen.impl.EEFGenModelReferenceImpl
		 * @see org.eclipse.emf.eef.EEFGen.impl.EEFGenPackageImpl#getEEFGenModelReference()
		 * @generated
		 */
		EClass EEF_GEN_MODEL_REFERENCE = eINSTANCE.getEEFGenModelReference();

		/**
		 * The meta object literal for the '<em><b>Referenced Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEF_GEN_MODEL_REFERENCE__REFERENCED_CONTEXT = eINSTANCE.getEEFGenModelReference_ReferencedContext();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.EEFGen.impl.EEFGenModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.EEFGen.impl.EEFGenModelImpl
		 * @see org.eclipse.emf.eef.EEFGen.impl.EEFGenPackageImpl#getEEFGenModel()
		 * @generated
		 */
		EClass EEF_GEN_MODEL = eINSTANCE.getEEFGenModel();

		/**
		 * The meta object literal for the '<em><b>Edition Contexts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEF_GEN_MODEL__EDITION_CONTEXTS = eINSTANCE.getEEFGenModel_EditionContexts();

		/**
		 * The meta object literal for the '<em><b>Views Repositories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEF_GEN_MODEL__VIEWS_REPOSITORIES = eINSTANCE.getEEFGenModel_ViewsRepositories();

		/**
		 * The meta object literal for the '<em><b>Gen Directory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_GEN_MODEL__GEN_DIRECTORY = eINSTANCE.getEEFGenModel_GenDirectory();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_GEN_MODEL__AUTHOR = eINSTANCE.getEEFGenModel_Author();

		/**
		 * The meta object literal for the '<em><b>License</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_GEN_MODEL__LICENSE = eINSTANCE.getEEFGenModel_License();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEF_GEN_MODEL__REFERENCES = eINSTANCE.getEEFGenModel_References();

		/**
		 * The meta object literal for the '<em><b>Tests Gen Directory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_GEN_MODEL__TESTS_GEN_DIRECTORY = eINSTANCE.getEEFGenModel_TestsGenDirectory();

		/**
		 * The meta object literal for the '<em><b>Use JMerge For User Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_GEN_MODEL__USE_JMERGE_FOR_USER_CODE = eINSTANCE.getEEFGenModel_UseJMergeForUserCode();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.EEFGen.impl.GenViewsRepositoryImpl <em>Gen Views Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.EEFGen.impl.GenViewsRepositoryImpl
		 * @see org.eclipse.emf.eef.EEFGen.impl.EEFGenPackageImpl#getGenViewsRepository()
		 * @generated
		 */
		EClass GEN_VIEWS_REPOSITORY = eINSTANCE.getGenViewsRepository();

		/**
		 * The meta object literal for the '<em><b>Views Repository</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_VIEWS_REPOSITORY__VIEWS_REPOSITORY = eINSTANCE.getGenViewsRepository_ViewsRepository();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_VIEWS_REPOSITORY__BASE_PACKAGE = eINSTANCE.getGenViewsRepository_BasePackage();

		/**
		 * The meta object literal for the '<em><b>Swt Views</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_VIEWS_REPOSITORY__SWT_VIEWS = eINSTANCE.getGenViewsRepository_SwtViews();

		/**
		 * The meta object literal for the '<em><b>Form Views</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_VIEWS_REPOSITORY__FORM_VIEWS = eINSTANCE.getGenViewsRepository_FormViews();

		/**
		 * The meta object literal for the '<em><b>Help Strategy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_VIEWS_REPOSITORY__HELP_STRATEGY = eINSTANCE.getGenViewsRepository_HelpStrategy();

		/**
		 * The meta object literal for the '<em><b>Eef Gen Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_VIEWS_REPOSITORY__EEF_GEN_MODEL = eINSTANCE.getGenViewsRepository_EefGenModel();

		/**
		 * The meta object literal for the '<em><b>Parts Super Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_VIEWS_REPOSITORY__PARTS_SUPER_CLASS = eINSTANCE.getGenViewsRepository_PartsSuperClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.EEFGen.HELP_STRATEGY <em>HELP STRATEGY</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.EEFGen.HELP_STRATEGY
		 * @see org.eclipse.emf.eef.EEFGen.impl.EEFGenPackageImpl#getHELP_STRATEGY()
		 * @generated
		 */
		EEnum HELP_STRATEGY = eINSTANCE.getHELP_STRATEGY();

	}

} //EEFGenPackage
