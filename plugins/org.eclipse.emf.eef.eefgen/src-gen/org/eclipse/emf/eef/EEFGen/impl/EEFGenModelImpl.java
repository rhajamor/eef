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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.eef.EEFGen.EEFGenModel;
import org.eclipse.emf.eef.EEFGen.EEFGenModelReference;
import org.eclipse.emf.eef.EEFGen.EEFGenPackage;
import org.eclipse.emf.eef.EEFGen.GenEditionContext;
import org.eclipse.emf.eef.EEFGen.GenViewsRepository;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.EEFGen.impl.EEFGenModelImpl#getEditionContexts <em>Edition Contexts</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.EEFGen.impl.EEFGenModelImpl#getViewsRepositories <em>Views Repositories</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.EEFGen.impl.EEFGenModelImpl#getGenDirectory <em>Gen Directory</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.EEFGen.impl.EEFGenModelImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.EEFGen.impl.EEFGenModelImpl#getLicense <em>License</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.EEFGen.impl.EEFGenModelImpl#getReferences <em>References</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.EEFGen.impl.EEFGenModelImpl#getTestsGenDirectory <em>Tests Gen Directory</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.EEFGen.impl.EEFGenModelImpl#isUseJMergeForUserCode <em>Use JMerge For User Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EEFGenModelImpl extends EObjectImpl implements EEFGenModel {
	/**
	 * The cached value of the '{@link #getEditionContexts() <em>Edition Contexts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditionContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<GenEditionContext> editionContexts;

	/**
	 * The cached value of the '{@link #getViewsRepositories() <em>Views Repositories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewsRepositories()
	 * @generated
	 * @ordered
	 */
	protected EList<GenViewsRepository> viewsRepositories;

	/**
	 * The default value of the '{@link #getGenDirectory() <em>Gen Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenDirectory()
	 * @generated
	 * @ordered
	 */
	protected static final String GEN_DIRECTORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGenDirectory() <em>Gen Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenDirectory()
	 * @generated
	 * @ordered
	 */
	protected String genDirectory = GEN_DIRECTORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected String author = AUTHOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getLicense() <em>License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicense()
	 * @generated
	 * @ordered
	 */
	protected static final String LICENSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLicense() <em>License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicense()
	 * @generated
	 * @ordered
	 */
	protected String license = LICENSE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReferences() <em>References</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<EEFGenModelReference> references;

	/**
	 * The default value of the '{@link #getTestsGenDirectory() <em>Tests Gen Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestsGenDirectory()
	 * @generated
	 * @ordered
	 */
	protected static final String TESTS_GEN_DIRECTORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTestsGenDirectory() <em>Tests Gen Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestsGenDirectory()
	 * @generated
	 * @ordered
	 */
	protected String testsGenDirectory = TESTS_GEN_DIRECTORY_EDEFAULT;

	/**
	 * The default value of the '{@link #isUseJMergeForUserCode() <em>Use JMerge For User Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseJMergeForUserCode()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_JMERGE_FOR_USER_CODE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUseJMergeForUserCode() <em>Use JMerge For User Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseJMergeForUserCode()
	 * @generated
	 * @ordered
	 */
	protected boolean useJMergeForUserCode = USE_JMERGE_FOR_USER_CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EEFGenModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EEFGenPackage.Literals.EEF_GEN_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenEditionContext> getEditionContexts() {
		if (editionContexts == null) {
			editionContexts = new EObjectContainmentWithInverseEList<GenEditionContext>(GenEditionContext.class, this, EEFGenPackage.EEF_GEN_MODEL__EDITION_CONTEXTS, EEFGenPackage.GEN_EDITION_CONTEXT__EEF_GEN_MODEL);
		}
		return editionContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenViewsRepository> getViewsRepositories() {
		if (viewsRepositories == null) {
			viewsRepositories = new EObjectContainmentWithInverseEList<GenViewsRepository>(GenViewsRepository.class, this, EEFGenPackage.EEF_GEN_MODEL__VIEWS_REPOSITORIES, EEFGenPackage.GEN_VIEWS_REPOSITORY__EEF_GEN_MODEL);
		}
		return viewsRepositories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGenDirectory() {
		return genDirectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenDirectory(String newGenDirectory) {
		String oldGenDirectory = genDirectory;
		genDirectory = newGenDirectory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EEFGenPackage.EEF_GEN_MODEL__GEN_DIRECTORY, oldGenDirectory, genDirectory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(String newAuthor) {
		String oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EEFGenPackage.EEF_GEN_MODEL__AUTHOR, oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLicense() {
		return license;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLicense(String newLicense) {
		String oldLicense = license;
		license = newLicense;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EEFGenPackage.EEF_GEN_MODEL__LICENSE, oldLicense, license));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EEFGenModelReference> getReferences() {
		if (references == null) {
			references = new EObjectContainmentEList<EEFGenModelReference>(EEFGenModelReference.class, this, EEFGenPackage.EEF_GEN_MODEL__REFERENCES);
		}
		return references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTestsGenDirectory() {
		return testsGenDirectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestsGenDirectory(String newTestsGenDirectory) {
		String oldTestsGenDirectory = testsGenDirectory;
		testsGenDirectory = newTestsGenDirectory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EEFGenPackage.EEF_GEN_MODEL__TESTS_GEN_DIRECTORY, oldTestsGenDirectory, testsGenDirectory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUseJMergeForUserCode() {
		return useJMergeForUserCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseJMergeForUserCode(boolean newUseJMergeForUserCode) {
		boolean oldUseJMergeForUserCode = useJMergeForUserCode;
		useJMergeForUserCode = newUseJMergeForUserCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EEFGenPackage.EEF_GEN_MODEL__USE_JMERGE_FOR_USER_CODE, oldUseJMergeForUserCode, useJMergeForUserCode));
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
			case EEFGenPackage.EEF_GEN_MODEL__EDITION_CONTEXTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEditionContexts()).basicAdd(otherEnd, msgs);
			case EEFGenPackage.EEF_GEN_MODEL__VIEWS_REPOSITORIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getViewsRepositories()).basicAdd(otherEnd, msgs);
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
			case EEFGenPackage.EEF_GEN_MODEL__EDITION_CONTEXTS:
				return ((InternalEList<?>)getEditionContexts()).basicRemove(otherEnd, msgs);
			case EEFGenPackage.EEF_GEN_MODEL__VIEWS_REPOSITORIES:
				return ((InternalEList<?>)getViewsRepositories()).basicRemove(otherEnd, msgs);
			case EEFGenPackage.EEF_GEN_MODEL__REFERENCES:
				return ((InternalEList<?>)getReferences()).basicRemove(otherEnd, msgs);
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
			case EEFGenPackage.EEF_GEN_MODEL__EDITION_CONTEXTS:
				return getEditionContexts();
			case EEFGenPackage.EEF_GEN_MODEL__VIEWS_REPOSITORIES:
				return getViewsRepositories();
			case EEFGenPackage.EEF_GEN_MODEL__GEN_DIRECTORY:
				return getGenDirectory();
			case EEFGenPackage.EEF_GEN_MODEL__AUTHOR:
				return getAuthor();
			case EEFGenPackage.EEF_GEN_MODEL__LICENSE:
				return getLicense();
			case EEFGenPackage.EEF_GEN_MODEL__REFERENCES:
				return getReferences();
			case EEFGenPackage.EEF_GEN_MODEL__TESTS_GEN_DIRECTORY:
				return getTestsGenDirectory();
			case EEFGenPackage.EEF_GEN_MODEL__USE_JMERGE_FOR_USER_CODE:
				return isUseJMergeForUserCode();
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
			case EEFGenPackage.EEF_GEN_MODEL__EDITION_CONTEXTS:
				getEditionContexts().clear();
				getEditionContexts().addAll((Collection<? extends GenEditionContext>)newValue);
				return;
			case EEFGenPackage.EEF_GEN_MODEL__VIEWS_REPOSITORIES:
				getViewsRepositories().clear();
				getViewsRepositories().addAll((Collection<? extends GenViewsRepository>)newValue);
				return;
			case EEFGenPackage.EEF_GEN_MODEL__GEN_DIRECTORY:
				setGenDirectory((String)newValue);
				return;
			case EEFGenPackage.EEF_GEN_MODEL__AUTHOR:
				setAuthor((String)newValue);
				return;
			case EEFGenPackage.EEF_GEN_MODEL__LICENSE:
				setLicense((String)newValue);
				return;
			case EEFGenPackage.EEF_GEN_MODEL__REFERENCES:
				getReferences().clear();
				getReferences().addAll((Collection<? extends EEFGenModelReference>)newValue);
				return;
			case EEFGenPackage.EEF_GEN_MODEL__TESTS_GEN_DIRECTORY:
				setTestsGenDirectory((String)newValue);
				return;
			case EEFGenPackage.EEF_GEN_MODEL__USE_JMERGE_FOR_USER_CODE:
				setUseJMergeForUserCode((Boolean)newValue);
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
			case EEFGenPackage.EEF_GEN_MODEL__EDITION_CONTEXTS:
				getEditionContexts().clear();
				return;
			case EEFGenPackage.EEF_GEN_MODEL__VIEWS_REPOSITORIES:
				getViewsRepositories().clear();
				return;
			case EEFGenPackage.EEF_GEN_MODEL__GEN_DIRECTORY:
				setGenDirectory(GEN_DIRECTORY_EDEFAULT);
				return;
			case EEFGenPackage.EEF_GEN_MODEL__AUTHOR:
				setAuthor(AUTHOR_EDEFAULT);
				return;
			case EEFGenPackage.EEF_GEN_MODEL__LICENSE:
				setLicense(LICENSE_EDEFAULT);
				return;
			case EEFGenPackage.EEF_GEN_MODEL__REFERENCES:
				getReferences().clear();
				return;
			case EEFGenPackage.EEF_GEN_MODEL__TESTS_GEN_DIRECTORY:
				setTestsGenDirectory(TESTS_GEN_DIRECTORY_EDEFAULT);
				return;
			case EEFGenPackage.EEF_GEN_MODEL__USE_JMERGE_FOR_USER_CODE:
				setUseJMergeForUserCode(USE_JMERGE_FOR_USER_CODE_EDEFAULT);
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
			case EEFGenPackage.EEF_GEN_MODEL__EDITION_CONTEXTS:
				return editionContexts != null && !editionContexts.isEmpty();
			case EEFGenPackage.EEF_GEN_MODEL__VIEWS_REPOSITORIES:
				return viewsRepositories != null && !viewsRepositories.isEmpty();
			case EEFGenPackage.EEF_GEN_MODEL__GEN_DIRECTORY:
				return GEN_DIRECTORY_EDEFAULT == null ? genDirectory != null : !GEN_DIRECTORY_EDEFAULT.equals(genDirectory);
			case EEFGenPackage.EEF_GEN_MODEL__AUTHOR:
				return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
			case EEFGenPackage.EEF_GEN_MODEL__LICENSE:
				return LICENSE_EDEFAULT == null ? license != null : !LICENSE_EDEFAULT.equals(license);
			case EEFGenPackage.EEF_GEN_MODEL__REFERENCES:
				return references != null && !references.isEmpty();
			case EEFGenPackage.EEF_GEN_MODEL__TESTS_GEN_DIRECTORY:
				return TESTS_GEN_DIRECTORY_EDEFAULT == null ? testsGenDirectory != null : !TESTS_GEN_DIRECTORY_EDEFAULT.equals(testsGenDirectory);
			case EEFGenPackage.EEF_GEN_MODEL__USE_JMERGE_FOR_USER_CODE:
				return useJMergeForUserCode != USE_JMERGE_FOR_USER_CODE_EDEFAULT;
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
		result.append(" (genDirectory: ");
		result.append(genDirectory);
		result.append(", author: ");
		result.append(author);
		result.append(", license: ");
		result.append(license);
		result.append(", testsGenDirectory: ");
		result.append(testsGenDirectory);
		result.append(", useJMergeForUserCode: ");
		result.append(useJMergeForUserCode);
		result.append(')');
		return result.toString();
	}

} //EEFGenModelImpl
