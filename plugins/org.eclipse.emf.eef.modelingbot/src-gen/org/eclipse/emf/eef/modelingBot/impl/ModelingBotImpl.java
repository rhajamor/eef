/**
 * <copyright>
 * </copyright>
 *
 * $Id: ModelingBotImpl.java,v 1.1.2.1 2011/08/12 09:21:12 sbouchet Exp $
 */
package org.eclipse.emf.eef.modelingBot.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.eef.components.PropertiesEditionContext;

import org.eclipse.emf.eef.modelingBot.ModelingBot;
import org.eclipse.emf.eef.modelingBot.ModelingBotPackage;
import org.eclipse.emf.eef.modelingBot.Sequence;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modeling Bot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.modelingBot.impl.ModelingBotImpl#getPropertiesEditionContext <em>Properties Edition Context</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.modelingBot.impl.ModelingBotImpl#getSequences <em>Sequences</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelingBotImpl extends EObjectImpl implements ModelingBot {
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
	 * The cached value of the '{@link #getSequences() <em>Sequences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequences()
	 * @generated
	 * @ordered
	 */
	protected EList<Sequence> sequences;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelingBotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelingBotPackage.Literals.MODELING_BOT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelingBotPackage.MODELING_BOT__PROPERTIES_EDITION_CONTEXT, oldPropertiesEditionContext, propertiesEditionContext));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelingBotPackage.MODELING_BOT__PROPERTIES_EDITION_CONTEXT, oldPropertiesEditionContext, propertiesEditionContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sequence> getSequences() {
		if (sequences == null) {
			sequences = new EObjectContainmentEList<Sequence>(Sequence.class, this, ModelingBotPackage.MODELING_BOT__SEQUENCES);
		}
		return sequences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelingBotPackage.MODELING_BOT__SEQUENCES:
				return ((InternalEList<?>)getSequences()).basicRemove(otherEnd, msgs);
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
			case ModelingBotPackage.MODELING_BOT__PROPERTIES_EDITION_CONTEXT:
				if (resolve) return getPropertiesEditionContext();
				return basicGetPropertiesEditionContext();
			case ModelingBotPackage.MODELING_BOT__SEQUENCES:
				return getSequences();
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
			case ModelingBotPackage.MODELING_BOT__PROPERTIES_EDITION_CONTEXT:
				setPropertiesEditionContext((PropertiesEditionContext)newValue);
				return;
			case ModelingBotPackage.MODELING_BOT__SEQUENCES:
				getSequences().clear();
				getSequences().addAll((Collection<? extends Sequence>)newValue);
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
			case ModelingBotPackage.MODELING_BOT__PROPERTIES_EDITION_CONTEXT:
				setPropertiesEditionContext((PropertiesEditionContext)null);
				return;
			case ModelingBotPackage.MODELING_BOT__SEQUENCES:
				getSequences().clear();
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
			case ModelingBotPackage.MODELING_BOT__PROPERTIES_EDITION_CONTEXT:
				return propertiesEditionContext != null;
			case ModelingBotPackage.MODELING_BOT__SEQUENCES:
				return sequences != null && !sequences.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelingBotImpl
