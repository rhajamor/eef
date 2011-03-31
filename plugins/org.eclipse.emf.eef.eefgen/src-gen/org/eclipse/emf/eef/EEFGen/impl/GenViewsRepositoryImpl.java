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
import org.eclipse.emf.eef.EEFGen.GenViewsRepository;
import org.eclipse.emf.eef.EEFGen.HELP_STRATEGY;
import org.eclipse.emf.eef.views.ViewsRepository;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Views Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.EEFGen.impl.GenViewsRepositoryImpl#getViewsRepository <em>Views Repository</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.EEFGen.impl.GenViewsRepositoryImpl#getBasePackage <em>Base Package</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.EEFGen.impl.GenViewsRepositoryImpl#isSwtViews <em>Swt Views</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.EEFGen.impl.GenViewsRepositoryImpl#isFormViews <em>Form Views</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.EEFGen.impl.GenViewsRepositoryImpl#getHelpStrategy <em>Help Strategy</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.EEFGen.impl.GenViewsRepositoryImpl#getEefGenModel <em>Eef Gen Model</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.EEFGen.impl.GenViewsRepositoryImpl#getPartsSuperClass <em>Parts Super Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenViewsRepositoryImpl extends EObjectImpl implements GenViewsRepository {
	/**
	 * The cached value of the '{@link #getViewsRepository() <em>Views Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewsRepository()
	 * @generated
	 * @ordered
	 */
	protected ViewsRepository viewsRepository;

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
	 * The default value of the '{@link #isSwtViews() <em>Swt Views</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSwtViews()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SWT_VIEWS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSwtViews() <em>Swt Views</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSwtViews()
	 * @generated
	 * @ordered
	 */
	protected boolean swtViews = SWT_VIEWS_EDEFAULT;

	/**
	 * The default value of the '{@link #isFormViews() <em>Form Views</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFormViews()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FORM_VIEWS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFormViews() <em>Form Views</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFormViews()
	 * @generated
	 * @ordered
	 */
	protected boolean formViews = FORM_VIEWS_EDEFAULT;

	/**
	 * The default value of the '{@link #getHelpStrategy() <em>Help Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHelpStrategy()
	 * @generated
	 * @ordered
	 */
	protected static final HELP_STRATEGY HELP_STRATEGY_EDEFAULT = HELP_STRATEGY.GENMODEL;

	/**
	 * The cached value of the '{@link #getHelpStrategy() <em>Help Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHelpStrategy()
	 * @generated
	 * @ordered
	 */
	protected HELP_STRATEGY helpStrategy = HELP_STRATEGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPartsSuperClass() <em>Parts Super Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartsSuperClass()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTS_SUPER_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPartsSuperClass() <em>Parts Super Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartsSuperClass()
	 * @generated
	 * @ordered
	 */
	protected String partsSuperClass = PARTS_SUPER_CLASS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenViewsRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EEFGenPackage.Literals.GEN_VIEWS_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewsRepository getViewsRepository() {
		if (viewsRepository != null && viewsRepository.eIsProxy()) {
			InternalEObject oldViewsRepository = (InternalEObject)viewsRepository;
			viewsRepository = (ViewsRepository)eResolveProxy(oldViewsRepository);
			if (viewsRepository != oldViewsRepository) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EEFGenPackage.GEN_VIEWS_REPOSITORY__VIEWS_REPOSITORY, oldViewsRepository, viewsRepository));
			}
		}
		return viewsRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewsRepository basicGetViewsRepository() {
		return viewsRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewsRepository(ViewsRepository newViewsRepository) {
		ViewsRepository oldViewsRepository = viewsRepository;
		viewsRepository = newViewsRepository;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EEFGenPackage.GEN_VIEWS_REPOSITORY__VIEWS_REPOSITORY, oldViewsRepository, viewsRepository));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EEFGenPackage.GEN_VIEWS_REPOSITORY__BASE_PACKAGE, oldBasePackage, basePackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSwtViews() {
		return swtViews;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwtViews(boolean newSwtViews) {
		boolean oldSwtViews = swtViews;
		swtViews = newSwtViews;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EEFGenPackage.GEN_VIEWS_REPOSITORY__SWT_VIEWS, oldSwtViews, swtViews));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFormViews() {
		return formViews;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormViews(boolean newFormViews) {
		boolean oldFormViews = formViews;
		formViews = newFormViews;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EEFGenPackage.GEN_VIEWS_REPOSITORY__FORM_VIEWS, oldFormViews, formViews));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HELP_STRATEGY getHelpStrategy() {
		return helpStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHelpStrategy(HELP_STRATEGY newHelpStrategy) {
		HELP_STRATEGY oldHelpStrategy = helpStrategy;
		helpStrategy = newHelpStrategy == null ? HELP_STRATEGY_EDEFAULT : newHelpStrategy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EEFGenPackage.GEN_VIEWS_REPOSITORY__HELP_STRATEGY, oldHelpStrategy, helpStrategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEFGenModel getEefGenModel() {
		if (eContainerFeatureID() != EEFGenPackage.GEN_VIEWS_REPOSITORY__EEF_GEN_MODEL) return null;
		return (EEFGenModel)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEefGenModel(EEFGenModel newEefGenModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEefGenModel, EEFGenPackage.GEN_VIEWS_REPOSITORY__EEF_GEN_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEefGenModel(EEFGenModel newEefGenModel) {
		if (newEefGenModel != eInternalContainer() || (eContainerFeatureID() != EEFGenPackage.GEN_VIEWS_REPOSITORY__EEF_GEN_MODEL && newEefGenModel != null)) {
			if (EcoreUtil.isAncestor(this, newEefGenModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEefGenModel != null)
				msgs = ((InternalEObject)newEefGenModel).eInverseAdd(this, EEFGenPackage.EEF_GEN_MODEL__VIEWS_REPOSITORIES, EEFGenModel.class, msgs);
			msgs = basicSetEefGenModel(newEefGenModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EEFGenPackage.GEN_VIEWS_REPOSITORY__EEF_GEN_MODEL, newEefGenModel, newEefGenModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPartsSuperClass() {
		return partsSuperClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartsSuperClass(String newPartsSuperClass) {
		String oldPartsSuperClass = partsSuperClass;
		partsSuperClass = newPartsSuperClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EEFGenPackage.GEN_VIEWS_REPOSITORY__PARTS_SUPER_CLASS, oldPartsSuperClass, partsSuperClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EEFGenPackage.GEN_VIEWS_REPOSITORY__EEF_GEN_MODEL:
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
			case EEFGenPackage.GEN_VIEWS_REPOSITORY__EEF_GEN_MODEL:
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
			case EEFGenPackage.GEN_VIEWS_REPOSITORY__EEF_GEN_MODEL:
				return eInternalContainer().eInverseRemove(this, EEFGenPackage.EEF_GEN_MODEL__VIEWS_REPOSITORIES, EEFGenModel.class, msgs);
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
			case EEFGenPackage.GEN_VIEWS_REPOSITORY__VIEWS_REPOSITORY:
				if (resolve) return getViewsRepository();
				return basicGetViewsRepository();
			case EEFGenPackage.GEN_VIEWS_REPOSITORY__BASE_PACKAGE:
				return getBasePackage();
			case EEFGenPackage.GEN_VIEWS_REPOSITORY__SWT_VIEWS:
				return isSwtViews();
			case EEFGenPackage.GEN_VIEWS_REPOSITORY__FORM_VIEWS:
				return isFormViews();
			case EEFGenPackage.GEN_VIEWS_REPOSITORY__HELP_STRATEGY:
				return getHelpStrategy();
			case EEFGenPackage.GEN_VIEWS_REPOSITORY__EEF_GEN_MODEL:
				return getEefGenModel();
			case EEFGenPackage.GEN_VIEWS_REPOSITORY__PARTS_SUPER_CLASS:
				return getPartsSuperClass();
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
			case EEFGenPackage.GEN_VIEWS_REPOSITORY__VIEWS_REPOSITORY:
				setViewsRepository((ViewsRepository)newValue);
				return;
			case EEFGenPackage.GEN_VIEWS_REPOSITORY__BASE_PACKAGE:
				setBasePackage((String)newValue);
				return;
			case EEFGenPackage.GEN_VIEWS_REPOSITORY__SWT_VIEWS:
				setSwtViews((Boolean)newValue);
				return;
			case EEFGenPackage.GEN_VIEWS_REPOSITORY__FORM_VIEWS:
				setFormViews((Boolean)newValue);
				return;
			case EEFGenPackage.GEN_VIEWS_REPOSITORY__HELP_STRATEGY:
				setHelpStrategy((HELP_STRATEGY)newValue);
				return;
			case EEFGenPackage.GEN_VIEWS_REPOSITORY__EEF_GEN_MODEL:
				setEefGenModel((EEFGenModel)newValue);
				return;
			case EEFGenPackage.GEN_VIEWS_REPOSITORY__PARTS_SUPER_CLASS:
				setPartsSuperClass((String)newValue);
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
			case EEFGenPackage.GEN_VIEWS_REPOSITORY__VIEWS_REPOSITORY:
				setViewsRepository((ViewsRepository)null);
				return;
			case EEFGenPackage.GEN_VIEWS_REPOSITORY__BASE_PACKAGE:
				setBasePackage(BASE_PACKAGE_EDEFAULT);
				return;
			case EEFGenPackage.GEN_VIEWS_REPOSITORY__SWT_VIEWS:
				setSwtViews(SWT_VIEWS_EDEFAULT);
				return;
			case EEFGenPackage.GEN_VIEWS_REPOSITORY__FORM_VIEWS:
				setFormViews(FORM_VIEWS_EDEFAULT);
				return;
			case EEFGenPackage.GEN_VIEWS_REPOSITORY__HELP_STRATEGY:
				setHelpStrategy(HELP_STRATEGY_EDEFAULT);
				return;
			case EEFGenPackage.GEN_VIEWS_REPOSITORY__EEF_GEN_MODEL:
				setEefGenModel((EEFGenModel)null);
				return;
			case EEFGenPackage.GEN_VIEWS_REPOSITORY__PARTS_SUPER_CLASS:
				setPartsSuperClass(PARTS_SUPER_CLASS_EDEFAULT);
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
			case EEFGenPackage.GEN_VIEWS_REPOSITORY__VIEWS_REPOSITORY:
				return viewsRepository != null;
			case EEFGenPackage.GEN_VIEWS_REPOSITORY__BASE_PACKAGE:
				return BASE_PACKAGE_EDEFAULT == null ? basePackage != null : !BASE_PACKAGE_EDEFAULT.equals(basePackage);
			case EEFGenPackage.GEN_VIEWS_REPOSITORY__SWT_VIEWS:
				return swtViews != SWT_VIEWS_EDEFAULT;
			case EEFGenPackage.GEN_VIEWS_REPOSITORY__FORM_VIEWS:
				return formViews != FORM_VIEWS_EDEFAULT;
			case EEFGenPackage.GEN_VIEWS_REPOSITORY__HELP_STRATEGY:
				return helpStrategy != HELP_STRATEGY_EDEFAULT;
			case EEFGenPackage.GEN_VIEWS_REPOSITORY__EEF_GEN_MODEL:
				return getEefGenModel() != null;
			case EEFGenPackage.GEN_VIEWS_REPOSITORY__PARTS_SUPER_CLASS:
				return PARTS_SUPER_CLASS_EDEFAULT == null ? partsSuperClass != null : !PARTS_SUPER_CLASS_EDEFAULT.equals(partsSuperClass);
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
		result.append(", swtViews: ");
		result.append(swtViews);
		result.append(", formViews: ");
		result.append(formViews);
		result.append(", helpStrategy: ");
		result.append(helpStrategy);
		result.append(", partsSuperClass: ");
		result.append(partsSuperClass);
		result.append(')');
		return result.toString();
	}

} //GenViewsRepositoryImpl
