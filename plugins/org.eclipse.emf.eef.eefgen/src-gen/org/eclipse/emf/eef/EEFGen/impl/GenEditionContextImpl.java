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
package org.eclipse.emf.eef.EEFGen.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.EEFGen.EEFGenModel;
import org.eclipse.emf.eef.EEFGen.EEFGenPackage;
import org.eclipse.emf.eef.EEFGen.GenEditionContext;
import org.eclipse.emf.eef.components.PropertiesEditionContext;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Edition Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.EEFGen.impl.GenEditionContextImpl#getPropertiesEditionContext <em>Properties Edition Context</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.EEFGen.impl.GenEditionContextImpl#getBasePackage <em>Base Package</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.EEFGen.impl.GenEditionContextImpl#getEefGenModel <em>Eef Gen Model</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.EEFGen.impl.GenEditionContextImpl#getDescriptorsContributorID <em>Descriptors Contributor ID</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.EEFGen.impl.GenEditionContextImpl#isDescriptorsGenericPropertiesViews <em>Descriptors Generic Properties Views</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.EEFGen.impl.GenEditionContextImpl#isGmfPropertiesViews <em>Gmf Properties Views</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.EEFGen.impl.GenEditionContextImpl#isGenerateJunitTestCases <em>Generate Junit Test Cases</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.EEFGen.impl.GenEditionContextImpl#getLeafComponentsSuperClass <em>Leaf Components Super Class</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.EEFGen.impl.GenEditionContextImpl#getPropertiesEditingProvidersSuperClass <em>Properties Editing Providers Super Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenEditionContextImpl extends EObjectImpl implements GenEditionContext {
	/**
	 * The cached value of the '{@link #getPropertiesEditionContext() <em>Properties Edition Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertiesEditionContext()
	 * @generated
	 * @ordered
	 */
	protected PropertiesEditionContext propertiesEditionContext;

	/**
	 * The default value of the '{@link #getBasePackage() <em>Base Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePackage()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_PACKAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBasePackage() <em>Base Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePackage()
	 * @generated
	 * @ordered
	 */
	protected String basePackage = BASE_PACKAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescriptorsContributorID() <em>Descriptors Contributor ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptorsContributorID()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTORS_CONTRIBUTOR_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescriptorsContributorID() <em>Descriptors Contributor ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptorsContributorID()
	 * @generated
	 * @ordered
	 */
	protected String descriptorsContributorID = DESCRIPTORS_CONTRIBUTOR_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isDescriptorsGenericPropertiesViews() <em>Descriptors Generic Properties Views</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDescriptorsGenericPropertiesViews()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DESCRIPTORS_GENERIC_PROPERTIES_VIEWS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDescriptorsGenericPropertiesViews() <em>Descriptors Generic Properties Views</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDescriptorsGenericPropertiesViews()
	 * @generated
	 * @ordered
	 */
	protected boolean descriptorsGenericPropertiesViews = DESCRIPTORS_GENERIC_PROPERTIES_VIEWS_EDEFAULT;

	/**
	 * The default value of the '{@link #isGmfPropertiesViews() <em>Gmf Properties Views</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGmfPropertiesViews()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GMF_PROPERTIES_VIEWS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGmfPropertiesViews() <em>Gmf Properties Views</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGmfPropertiesViews()
	 * @generated
	 * @ordered
	 */
	protected boolean gmfPropertiesViews = GMF_PROPERTIES_VIEWS_EDEFAULT;

	/**
	 * The default value of the '{@link #isGenerateJunitTestCases() <em>Generate Junit Test Cases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateJunitTestCases()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_JUNIT_TEST_CASES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGenerateJunitTestCases() <em>Generate Junit Test Cases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateJunitTestCases()
	 * @generated
	 * @ordered
	 */
	protected boolean generateJunitTestCases = GENERATE_JUNIT_TEST_CASES_EDEFAULT;

	/**
	 * The default value of the '{@link #getLeafComponentsSuperClass() <em>Leaf Components Super Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeafComponentsSuperClass()
	 * @generated
	 * @ordered
	 */
	protected static final String LEAF_COMPONENTS_SUPER_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLeafComponentsSuperClass() <em>Leaf Components Super Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeafComponentsSuperClass()
	 * @generated
	 * @ordered
	 */
	protected String leafComponentsSuperClass = LEAF_COMPONENTS_SUPER_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPropertiesEditingProvidersSuperClass() <em>Properties Editing Providers Super Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertiesEditingProvidersSuperClass()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTIES_EDITING_PROVIDERS_SUPER_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPropertiesEditingProvidersSuperClass() <em>Properties Editing Providers Super Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertiesEditingProvidersSuperClass()
	 * @generated
	 * @ordered
	 */
	protected String propertiesEditingProvidersSuperClass = PROPERTIES_EDITING_PROVIDERS_SUPER_CLASS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenEditionContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EEFGenPackage.Literals.GEN_EDITION_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesEditionContext getPropertiesEditionContext() {
		if (propertiesEditionContext != null && propertiesEditionContext.eIsProxy()) {
			InternalEObject oldPropertiesEditionContext = (InternalEObject)propertiesEditionContext;
			propertiesEditionContext = (PropertiesEditionContext)eResolveProxy(oldPropertiesEditionContext);
			if (propertiesEditionContext != oldPropertiesEditionContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EEFGenPackage.GEN_EDITION_CONTEXT__PROPERTIES_EDITION_CONTEXT, oldPropertiesEditionContext, propertiesEditionContext));
			}
		}
		return propertiesEditionContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesEditionContext basicGetPropertiesEditionContext() {
		return propertiesEditionContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertiesEditionContext(PropertiesEditionContext newPropertiesEditionContext) {
		PropertiesEditionContext oldPropertiesEditionContext = propertiesEditionContext;
		propertiesEditionContext = newPropertiesEditionContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EEFGenPackage.GEN_EDITION_CONTEXT__PROPERTIES_EDITION_CONTEXT, oldPropertiesEditionContext, propertiesEditionContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBasePackage() {
		return basePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasePackage(String newBasePackage) {
		String oldBasePackage = basePackage;
		basePackage = newBasePackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EEFGenPackage.GEN_EDITION_CONTEXT__BASE_PACKAGE, oldBasePackage, basePackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEFGenModel getEefGenModel() {
		if (eContainerFeatureID() != EEFGenPackage.GEN_EDITION_CONTEXT__EEF_GEN_MODEL) return null;
		return (EEFGenModel)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEefGenModel(EEFGenModel newEefGenModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEefGenModel, EEFGenPackage.GEN_EDITION_CONTEXT__EEF_GEN_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEefGenModel(EEFGenModel newEefGenModel) {
		if (newEefGenModel != eInternalContainer() || (eContainerFeatureID() != EEFGenPackage.GEN_EDITION_CONTEXT__EEF_GEN_MODEL && newEefGenModel != null)) {
			if (EcoreUtil.isAncestor(this, newEefGenModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEefGenModel != null)
				msgs = ((InternalEObject)newEefGenModel).eInverseAdd(this, EEFGenPackage.EEF_GEN_MODEL__EDITION_CONTEXTS, EEFGenModel.class, msgs);
			msgs = basicSetEefGenModel(newEefGenModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EEFGenPackage.GEN_EDITION_CONTEXT__EEF_GEN_MODEL, newEefGenModel, newEefGenModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescriptorsContributorID() {
		return descriptorsContributorID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescriptorsContributorID(String newDescriptorsContributorID) {
		String oldDescriptorsContributorID = descriptorsContributorID;
		descriptorsContributorID = newDescriptorsContributorID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EEFGenPackage.GEN_EDITION_CONTEXT__DESCRIPTORS_CONTRIBUTOR_ID, oldDescriptorsContributorID, descriptorsContributorID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDescriptorsGenericPropertiesViews() {
		return descriptorsGenericPropertiesViews;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescriptorsGenericPropertiesViews(boolean newDescriptorsGenericPropertiesViews) {
		boolean oldDescriptorsGenericPropertiesViews = descriptorsGenericPropertiesViews;
		descriptorsGenericPropertiesViews = newDescriptorsGenericPropertiesViews;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EEFGenPackage.GEN_EDITION_CONTEXT__DESCRIPTORS_GENERIC_PROPERTIES_VIEWS, oldDescriptorsGenericPropertiesViews, descriptorsGenericPropertiesViews));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGmfPropertiesViews() {
		return gmfPropertiesViews;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGmfPropertiesViews(boolean newGmfPropertiesViews) {
		boolean oldGmfPropertiesViews = gmfPropertiesViews;
		gmfPropertiesViews = newGmfPropertiesViews;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EEFGenPackage.GEN_EDITION_CONTEXT__GMF_PROPERTIES_VIEWS, oldGmfPropertiesViews, gmfPropertiesViews));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGenerateJunitTestCases() {
		return generateJunitTestCases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerateJunitTestCases(boolean newGenerateJunitTestCases) {
		boolean oldGenerateJunitTestCases = generateJunitTestCases;
		generateJunitTestCases = newGenerateJunitTestCases;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EEFGenPackage.GEN_EDITION_CONTEXT__GENERATE_JUNIT_TEST_CASES, oldGenerateJunitTestCases, generateJunitTestCases));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLeafComponentsSuperClass() {
		return leafComponentsSuperClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeafComponentsSuperClass(String newLeafComponentsSuperClass) {
		String oldLeafComponentsSuperClass = leafComponentsSuperClass;
		leafComponentsSuperClass = newLeafComponentsSuperClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EEFGenPackage.GEN_EDITION_CONTEXT__LEAF_COMPONENTS_SUPER_CLASS, oldLeafComponentsSuperClass, leafComponentsSuperClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPropertiesEditingProvidersSuperClass() {
		return propertiesEditingProvidersSuperClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertiesEditingProvidersSuperClass(String newPropertiesEditingProvidersSuperClass) {
		String oldPropertiesEditingProvidersSuperClass = propertiesEditingProvidersSuperClass;
		propertiesEditingProvidersSuperClass = newPropertiesEditingProvidersSuperClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EEFGenPackage.GEN_EDITION_CONTEXT__PROPERTIES_EDITING_PROVIDERS_SUPER_CLASS, oldPropertiesEditingProvidersSuperClass, propertiesEditingProvidersSuperClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EEFGenPackage.GEN_EDITION_CONTEXT__EEF_GEN_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEefGenModel((EEFGenModel)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EEFGenPackage.GEN_EDITION_CONTEXT__EEF_GEN_MODEL:
				return basicSetEefGenModel(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case EEFGenPackage.GEN_EDITION_CONTEXT__EEF_GEN_MODEL:
				return eInternalContainer().eInverseRemove(this, EEFGenPackage.EEF_GEN_MODEL__EDITION_CONTEXTS, EEFGenModel.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EEFGenPackage.GEN_EDITION_CONTEXT__PROPERTIES_EDITION_CONTEXT:
				if (resolve) return getPropertiesEditionContext();
				return basicGetPropertiesEditionContext();
			case EEFGenPackage.GEN_EDITION_CONTEXT__BASE_PACKAGE:
				return getBasePackage();
			case EEFGenPackage.GEN_EDITION_CONTEXT__EEF_GEN_MODEL:
				return getEefGenModel();
			case EEFGenPackage.GEN_EDITION_CONTEXT__DESCRIPTORS_CONTRIBUTOR_ID:
				return getDescriptorsContributorID();
			case EEFGenPackage.GEN_EDITION_CONTEXT__DESCRIPTORS_GENERIC_PROPERTIES_VIEWS:
				return isDescriptorsGenericPropertiesViews();
			case EEFGenPackage.GEN_EDITION_CONTEXT__GMF_PROPERTIES_VIEWS:
				return isGmfPropertiesViews();
			case EEFGenPackage.GEN_EDITION_CONTEXT__GENERATE_JUNIT_TEST_CASES:
				return isGenerateJunitTestCases();
			case EEFGenPackage.GEN_EDITION_CONTEXT__LEAF_COMPONENTS_SUPER_CLASS:
				return getLeafComponentsSuperClass();
			case EEFGenPackage.GEN_EDITION_CONTEXT__PROPERTIES_EDITING_PROVIDERS_SUPER_CLASS:
				return getPropertiesEditingProvidersSuperClass();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EEFGenPackage.GEN_EDITION_CONTEXT__PROPERTIES_EDITION_CONTEXT:
				setPropertiesEditionContext((PropertiesEditionContext)newValue);
				return;
			case EEFGenPackage.GEN_EDITION_CONTEXT__BASE_PACKAGE:
				setBasePackage((String)newValue);
				return;
			case EEFGenPackage.GEN_EDITION_CONTEXT__EEF_GEN_MODEL:
				setEefGenModel((EEFGenModel)newValue);
				return;
			case EEFGenPackage.GEN_EDITION_CONTEXT__DESCRIPTORS_CONTRIBUTOR_ID:
				setDescriptorsContributorID((String)newValue);
				return;
			case EEFGenPackage.GEN_EDITION_CONTEXT__DESCRIPTORS_GENERIC_PROPERTIES_VIEWS:
				setDescriptorsGenericPropertiesViews((Boolean)newValue);
				return;
			case EEFGenPackage.GEN_EDITION_CONTEXT__GMF_PROPERTIES_VIEWS:
				setGmfPropertiesViews((Boolean)newValue);
				return;
			case EEFGenPackage.GEN_EDITION_CONTEXT__GENERATE_JUNIT_TEST_CASES:
				setGenerateJunitTestCases((Boolean)newValue);
				return;
			case EEFGenPackage.GEN_EDITION_CONTEXT__LEAF_COMPONENTS_SUPER_CLASS:
				setLeafComponentsSuperClass((String)newValue);
				return;
			case EEFGenPackage.GEN_EDITION_CONTEXT__PROPERTIES_EDITING_PROVIDERS_SUPER_CLASS:
				setPropertiesEditingProvidersSuperClass((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EEFGenPackage.GEN_EDITION_CONTEXT__PROPERTIES_EDITION_CONTEXT:
				setPropertiesEditionContext((PropertiesEditionContext)null);
				return;
			case EEFGenPackage.GEN_EDITION_CONTEXT__BASE_PACKAGE:
				setBasePackage(BASE_PACKAGE_EDEFAULT);
				return;
			case EEFGenPackage.GEN_EDITION_CONTEXT__EEF_GEN_MODEL:
				setEefGenModel((EEFGenModel)null);
				return;
			case EEFGenPackage.GEN_EDITION_CONTEXT__DESCRIPTORS_CONTRIBUTOR_ID:
				setDescriptorsContributorID(DESCRIPTORS_CONTRIBUTOR_ID_EDEFAULT);
				return;
			case EEFGenPackage.GEN_EDITION_CONTEXT__DESCRIPTORS_GENERIC_PROPERTIES_VIEWS:
				setDescriptorsGenericPropertiesViews(DESCRIPTORS_GENERIC_PROPERTIES_VIEWS_EDEFAULT);
				return;
			case EEFGenPackage.GEN_EDITION_CONTEXT__GMF_PROPERTIES_VIEWS:
				setGmfPropertiesViews(GMF_PROPERTIES_VIEWS_EDEFAULT);
				return;
			case EEFGenPackage.GEN_EDITION_CONTEXT__GENERATE_JUNIT_TEST_CASES:
				setGenerateJunitTestCases(GENERATE_JUNIT_TEST_CASES_EDEFAULT);
				return;
			case EEFGenPackage.GEN_EDITION_CONTEXT__LEAF_COMPONENTS_SUPER_CLASS:
				setLeafComponentsSuperClass(LEAF_COMPONENTS_SUPER_CLASS_EDEFAULT);
				return;
			case EEFGenPackage.GEN_EDITION_CONTEXT__PROPERTIES_EDITING_PROVIDERS_SUPER_CLASS:
				setPropertiesEditingProvidersSuperClass(PROPERTIES_EDITING_PROVIDERS_SUPER_CLASS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EEFGenPackage.GEN_EDITION_CONTEXT__PROPERTIES_EDITION_CONTEXT:
				return propertiesEditionContext != null;
			case EEFGenPackage.GEN_EDITION_CONTEXT__BASE_PACKAGE:
				return BASE_PACKAGE_EDEFAULT == null ? basePackage != null : !BASE_PACKAGE_EDEFAULT.equals(basePackage);
			case EEFGenPackage.GEN_EDITION_CONTEXT__EEF_GEN_MODEL:
				return getEefGenModel() != null;
			case EEFGenPackage.GEN_EDITION_CONTEXT__DESCRIPTORS_CONTRIBUTOR_ID:
				return DESCRIPTORS_CONTRIBUTOR_ID_EDEFAULT == null ? descriptorsContributorID != null : !DESCRIPTORS_CONTRIBUTOR_ID_EDEFAULT.equals(descriptorsContributorID);
			case EEFGenPackage.GEN_EDITION_CONTEXT__DESCRIPTORS_GENERIC_PROPERTIES_VIEWS:
				return descriptorsGenericPropertiesViews != DESCRIPTORS_GENERIC_PROPERTIES_VIEWS_EDEFAULT;
			case EEFGenPackage.GEN_EDITION_CONTEXT__GMF_PROPERTIES_VIEWS:
				return gmfPropertiesViews != GMF_PROPERTIES_VIEWS_EDEFAULT;
			case EEFGenPackage.GEN_EDITION_CONTEXT__GENERATE_JUNIT_TEST_CASES:
				return generateJunitTestCases != GENERATE_JUNIT_TEST_CASES_EDEFAULT;
			case EEFGenPackage.GEN_EDITION_CONTEXT__LEAF_COMPONENTS_SUPER_CLASS:
				return LEAF_COMPONENTS_SUPER_CLASS_EDEFAULT == null ? leafComponentsSuperClass != null : !LEAF_COMPONENTS_SUPER_CLASS_EDEFAULT.equals(leafComponentsSuperClass);
			case EEFGenPackage.GEN_EDITION_CONTEXT__PROPERTIES_EDITING_PROVIDERS_SUPER_CLASS:
				return PROPERTIES_EDITING_PROVIDERS_SUPER_CLASS_EDEFAULT == null ? propertiesEditingProvidersSuperClass != null : !PROPERTIES_EDITING_PROVIDERS_SUPER_CLASS_EDEFAULT.equals(propertiesEditingProvidersSuperClass);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (basePackage: ");
		result.append(basePackage);
		result.append(", descriptorsContributorID: ");
		result.append(descriptorsContributorID);
		result.append(", descriptorsGenericPropertiesViews: ");
		result.append(descriptorsGenericPropertiesViews);
		result.append(", gmfPropertiesViews: ");
		result.append(gmfPropertiesViews);
		result.append(", generateJunitTestCases: ");
		result.append(generateJunitTestCases);
		result.append(", leafComponentsSuperClass: ");
		result.append(leafComponentsSuperClass);
		result.append(", propertiesEditingProvidersSuperClass: ");
		result.append(propertiesEditingProvidersSuperClass);
		result.append(')');
		return result.toString();
	}

} //GenEditionContextImpl
