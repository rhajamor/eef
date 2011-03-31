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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.eef.views.Category;
import org.eclipse.emf.eef.views.IdentifiedElement;
import org.eclipse.emf.eef.views.View;
import org.eclipse.emf.eef.views.ViewsPackage;
import org.eclipse.emf.eef.views.ViewsRepository;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.views.impl.ViewsRepositoryImpl#getQualifiedIdentifier <em>Qualified Identifier</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.views.impl.ViewsRepositoryImpl#getViews <em>Views</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.views.impl.ViewsRepositoryImpl#getRepositoryKind <em>Repository Kind</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.views.impl.ViewsRepositoryImpl#getCategories <em>Categories</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.views.impl.ViewsRepositoryImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ViewsRepositoryImpl extends DocumentedElementImpl implements ViewsRepository {
	/**
	 * The default value of the '{@link #getQualifiedIdentifier() <em>Qualified Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALIFIED_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getViews() <em>Views</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViews()
	 * @generated
	 * @ordered
	 */
	protected EList<View> views;

	/**
	 * The cached value of the '{@link #getRepositoryKind() <em>Repository Kind</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepositoryKind()
	 * @generated
	 * @ordered
	 */
	protected EList<String> repositoryKind;

	/**
	 * The cached value of the '{@link #getCategories() <em>Categories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<Category> categories;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewsRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.VIEWS_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getQualifiedIdentifier() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setQualifiedIdentifier(String newQualifiedIdentifier) {
		// Nothing to do
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<View> getViews() {
		if (views == null) {
			views = new EObjectContainmentWithInverseEList<View>(View.class, this, ViewsPackage.VIEWS_REPOSITORY__VIEWS, ViewsPackage.VIEW__REPOSITORY);
		}
		return views;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getRepositoryKind() {
		if (repositoryKind == null) {
			repositoryKind = new EDataTypeUniqueEList<String>(String.class, this, ViewsPackage.VIEWS_REPOSITORY__REPOSITORY_KIND);
		}
		return repositoryKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Category> getCategories() {
		if (categories == null) {
			categories = new EObjectContainmentWithInverseEList<Category>(Category.class, this, ViewsPackage.VIEWS_REPOSITORY__CATEGORIES, ViewsPackage.CATEGORY__REPOSITORY);
		}
		return categories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.VIEWS_REPOSITORY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ViewsPackage.VIEWS_REPOSITORY__VIEWS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getViews()).basicAdd(otherEnd, msgs);
		case ViewsPackage.VIEWS_REPOSITORY__CATEGORIES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getCategories()).basicAdd(otherEnd, msgs);
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
		case ViewsPackage.VIEWS_REPOSITORY__VIEWS:
			return ((InternalEList<?>) getViews()).basicRemove(otherEnd, msgs);
		case ViewsPackage.VIEWS_REPOSITORY__CATEGORIES:
			return ((InternalEList<?>) getCategories()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ViewsPackage.VIEWS_REPOSITORY__QUALIFIED_IDENTIFIER:
			return getQualifiedIdentifier();
		case ViewsPackage.VIEWS_REPOSITORY__VIEWS:
			return getViews();
		case ViewsPackage.VIEWS_REPOSITORY__REPOSITORY_KIND:
			return getRepositoryKind();
		case ViewsPackage.VIEWS_REPOSITORY__CATEGORIES:
			return getCategories();
		case ViewsPackage.VIEWS_REPOSITORY__NAME:
			return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ViewsPackage.VIEWS_REPOSITORY__VIEWS:
			getViews().clear();
			getViews().addAll((Collection<? extends View>) newValue);
			return;
		case ViewsPackage.VIEWS_REPOSITORY__REPOSITORY_KIND:
			getRepositoryKind().clear();
			getRepositoryKind().addAll((Collection<? extends String>) newValue);
			return;
		case ViewsPackage.VIEWS_REPOSITORY__CATEGORIES:
			getCategories().clear();
			getCategories().addAll((Collection<? extends Category>) newValue);
			return;
		case ViewsPackage.VIEWS_REPOSITORY__NAME:
			setName((String) newValue);
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
		case ViewsPackage.VIEWS_REPOSITORY__VIEWS:
			getViews().clear();
			return;
		case ViewsPackage.VIEWS_REPOSITORY__REPOSITORY_KIND:
			getRepositoryKind().clear();
			return;
		case ViewsPackage.VIEWS_REPOSITORY__CATEGORIES:
			getCategories().clear();
			return;
		case ViewsPackage.VIEWS_REPOSITORY__NAME:
			setName(NAME_EDEFAULT);
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
		case ViewsPackage.VIEWS_REPOSITORY__QUALIFIED_IDENTIFIER:
			return QUALIFIED_IDENTIFIER_EDEFAULT == null ? getQualifiedIdentifier() != null : !QUALIFIED_IDENTIFIER_EDEFAULT.equals(getQualifiedIdentifier());
		case ViewsPackage.VIEWS_REPOSITORY__VIEWS:
			return views != null && !views.isEmpty();
		case ViewsPackage.VIEWS_REPOSITORY__REPOSITORY_KIND:
			return repositoryKind != null && !repositoryKind.isEmpty();
		case ViewsPackage.VIEWS_REPOSITORY__CATEGORIES:
			return categories != null && !categories.isEmpty();
		case ViewsPackage.VIEWS_REPOSITORY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == IdentifiedElement.class) {
			switch (derivedFeatureID) {
			case ViewsPackage.VIEWS_REPOSITORY__QUALIFIED_IDENTIFIER:
				return ViewsPackage.IDENTIFIED_ELEMENT__QUALIFIED_IDENTIFIER;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == IdentifiedElement.class) {
			switch (baseFeatureID) {
			case ViewsPackage.IDENTIFIED_ELEMENT__QUALIFIED_IDENTIFIER:
				return ViewsPackage.VIEWS_REPOSITORY__QUALIFIED_IDENTIFIER;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (RepositoryKind: "); //$NON-NLS-1$
		result.append(repositoryKind);
		result.append(", name: "); //$NON-NLS-1$
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ViewsRepositoryImpl
