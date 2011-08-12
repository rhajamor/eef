/**
 * <copyright>
 * </copyright>
 *
 * $Id: SequenceImpl.java,v 1.1.2.1 2011/08/12 09:21:12 sbouchet Exp $
 */
package org.eclipse.emf.eef.modelingBot.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.eef.modelingBot.Action;
import org.eclipse.emf.eef.modelingBot.ModelingBotPackage;
import org.eclipse.emf.eef.modelingBot.Processing;
import org.eclipse.emf.eef.modelingBot.Sequence;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.modelingBot.impl.SequenceImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.modelingBot.impl.SequenceImpl#getSequences <em>Sequences</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.modelingBot.impl.SequenceImpl#getProcessings <em>Processings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class SequenceImpl extends DocumentedElementImpl implements Sequence {
	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> actions;

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
	 * The cached value of the '{@link #getProcessings() <em>Processings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessings()
	 * @generated
	 * @ordered
	 */
	protected EList<Processing> processings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelingBotPackage.Literals.SEQUENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<Action>(Action.class, this, ModelingBotPackage.SEQUENCE__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sequence> getSequences() {
		if (sequences == null) {
			sequences = new EObjectContainmentEList<Sequence>(Sequence.class, this, ModelingBotPackage.SEQUENCE__SEQUENCES);
		}
		return sequences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Processing> getProcessings() {
		if (processings == null) {
			processings = new EObjectContainmentEList<Processing>(Processing.class, this, ModelingBotPackage.SEQUENCE__PROCESSINGS);
		}
		return processings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelingBotPackage.SEQUENCE__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
			case ModelingBotPackage.SEQUENCE__SEQUENCES:
				return ((InternalEList<?>)getSequences()).basicRemove(otherEnd, msgs);
			case ModelingBotPackage.SEQUENCE__PROCESSINGS:
				return ((InternalEList<?>)getProcessings()).basicRemove(otherEnd, msgs);
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
			case ModelingBotPackage.SEQUENCE__ACTIONS:
				return getActions();
			case ModelingBotPackage.SEQUENCE__SEQUENCES:
				return getSequences();
			case ModelingBotPackage.SEQUENCE__PROCESSINGS:
				return getProcessings();
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
			case ModelingBotPackage.SEQUENCE__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends Action>)newValue);
				return;
			case ModelingBotPackage.SEQUENCE__SEQUENCES:
				getSequences().clear();
				getSequences().addAll((Collection<? extends Sequence>)newValue);
				return;
			case ModelingBotPackage.SEQUENCE__PROCESSINGS:
				getProcessings().clear();
				getProcessings().addAll((Collection<? extends Processing>)newValue);
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
			case ModelingBotPackage.SEQUENCE__ACTIONS:
				getActions().clear();
				return;
			case ModelingBotPackage.SEQUENCE__SEQUENCES:
				getSequences().clear();
				return;
			case ModelingBotPackage.SEQUENCE__PROCESSINGS:
				getProcessings().clear();
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
			case ModelingBotPackage.SEQUENCE__ACTIONS:
				return actions != null && !actions.isEmpty();
			case ModelingBotPackage.SEQUENCE__SEQUENCES:
				return sequences != null && !sequences.isEmpty();
			case ModelingBotPackage.SEQUENCE__PROCESSINGS:
				return processings != null && !processings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SequenceImpl
