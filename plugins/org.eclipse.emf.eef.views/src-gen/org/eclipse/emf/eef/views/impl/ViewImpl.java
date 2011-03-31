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
package org.eclipse.emf.eef.views.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.views.Category;
import org.eclipse.emf.eef.views.IdentifiedElement;
import org.eclipse.emf.eef.views.View;
import org.eclipse.emf.eef.views.ViewsPackage;
import org.eclipse.emf.eef.views.ViewsRepository;
import org.eclispe.emf.eef.views.helpers.NamingHelper;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.views.impl.ViewImpl#getRepository <em>Repository</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.views.impl.ViewImpl#isExplicit <em>Explicit</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.views.impl.ViewImpl#getCategory <em>Category</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ViewImpl extends ContainerImpl implements View {
	/**
	 * The default value of the '{@link #isExplicit() <em>Explicit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExplicit()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXPLICIT_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isExplicit() <em>Explicit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExplicit()
	 * @generated
	 * @ordered
	 */
	protected boolean explicit = EXPLICIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getQualifiedIdentifier() {
		StringBuilder result = new StringBuilder(name);
		result.append(NamingHelper.nameDiscriminator(this));
		EObject container = this.eContainer();
		while (container != null) {
			if (container instanceof IdentifiedElement) {
				result.insert(0, "::"); //$NON-NLS-1$
				result.insert(0, ((IdentifiedElement) container).getQualifiedIdentifier());
				return result.toString();
			}
			container = container.eContainer();
		}
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewsRepository getRepository() {
		if (eContainerFeatureID() != ViewsPackage.VIEW__REPOSITORY)
			return null;
		return (ViewsRepository) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepository(ViewsRepository newRepository, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newRepository, ViewsPackage.VIEW__REPOSITORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepository(ViewsRepository newRepository) {
		if (newRepository != eInternalContainer() || (eContainerFeatureID() != ViewsPackage.VIEW__REPOSITORY && newRepository != null)) {
			if (EcoreUtil.isAncestor(this, newRepository))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRepository != null)
				msgs = ((InternalEObject) newRepository).eInverseAdd(this, ViewsPackage.VIEWS_REPOSITORY__VIEWS, ViewsRepository.class, msgs);
			msgs = basicSetRepository(newRepository, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.VIEW__REPOSITORY, newRepository, newRepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExplicit() {
		return explicit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExplicit(boolean newExplicit) {
		boolean oldExplicit = explicit;
		explicit = newExplicit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.VIEW__EXPLICIT, oldExplicit, explicit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category getCategory() {
		if (eContainerFeatureID() != ViewsPackage.VIEW__CATEGORY)
			return null;
		return (Category) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCategory(Category newCategory, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newCategory, ViewsPackage.VIEW__CATEGORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(Category newCategory) {
		if (newCategory != eInternalContainer() || (eContainerFeatureID() != ViewsPackage.VIEW__CATEGORY && newCategory != null)) {
			if (EcoreUtil.isAncestor(this, newCategory))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCategory != null)
				msgs = ((InternalEObject) newCategory).eInverseAdd(this, ViewsPackage.CATEGORY__VIEWS, Category.class, msgs);
			msgs = basicSetCategory(newCategory, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.VIEW__CATEGORY, newCategory, newCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ViewsPackage.VIEW__REPOSITORY:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetRepository((ViewsRepository) otherEnd, msgs);
		case ViewsPackage.VIEW__CATEGORY:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetCategory((Category) otherEnd, msgs);
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
		case ViewsPackage.VIEW__REPOSITORY:
			return basicSetRepository(null, msgs);
		case ViewsPackage.VIEW__CATEGORY:
			return basicSetCategory(null, msgs);
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
		case ViewsPackage.VIEW__REPOSITORY:
			return eInternalContainer().eInverseRemove(this, ViewsPackage.VIEWS_REPOSITORY__VIEWS, ViewsRepository.class, msgs);
		case ViewsPackage.VIEW__CATEGORY:
			return eInternalContainer().eInverseRemove(this, ViewsPackage.CATEGORY__VIEWS, Category.class, msgs);
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
		case ViewsPackage.VIEW__REPOSITORY:
			return getRepository();
		case ViewsPackage.VIEW__EXPLICIT:
			return isExplicit();
		case ViewsPackage.VIEW__CATEGORY:
			return getCategory();
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
		case ViewsPackage.VIEW__REPOSITORY:
			setRepository((ViewsRepository) newValue);
			return;
		case ViewsPackage.VIEW__EXPLICIT:
			setExplicit((Boolean) newValue);
			return;
		case ViewsPackage.VIEW__CATEGORY:
			setCategory((Category) newValue);
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
		case ViewsPackage.VIEW__REPOSITORY:
			setRepository((ViewsRepository) null);
			return;
		case ViewsPackage.VIEW__EXPLICIT:
			setExplicit(EXPLICIT_EDEFAULT);
			return;
		case ViewsPackage.VIEW__CATEGORY:
			setCategory((Category) null);
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
		case ViewsPackage.VIEW__REPOSITORY:
			return getRepository() != null;
		case ViewsPackage.VIEW__EXPLICIT:
			return explicit != EXPLICIT_EDEFAULT;
		case ViewsPackage.VIEW__CATEGORY:
			return getCategory() != null;
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
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (explicit: "); //$NON-NLS-1$
		result.append(explicit);
		result.append(')');
		return result.toString();
	}

} //ViewImpl
