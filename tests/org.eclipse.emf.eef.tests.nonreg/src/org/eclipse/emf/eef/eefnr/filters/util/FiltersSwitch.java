/**
 * <copyright>
 * </copyright>
 *
 * $Id: FiltersSwitch.java,v 1.1.6.1 2011/08/13 21:33:20 glefur Exp $
 */
package org.eclipse.emf.eef.eefnr.filters.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.emf.eef.eefnr.AbstractSample;

import org.eclipse.emf.eef.eefnr.filters.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.eef.eefnr.filters.FiltersPackage
 * @generated
 */
public class FiltersSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FiltersPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FiltersSwitch() {
		if (modelPackage == null) {
			modelPackage = FiltersPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case FiltersPackage.ABSTRACT_REFERENCE_OWNER_SAMPLE: {
				AbstractReferenceOwnerSample abstractReferenceOwnerSample = (AbstractReferenceOwnerSample)theEObject;
				T result = caseAbstractReferenceOwnerSample(abstractReferenceOwnerSample);
				if (result == null) result = caseAbstractSample(abstractReferenceOwnerSample);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FiltersPackage.ABSTRACT_REFERENCE_TARGET_SAMPLE: {
				AbstractReferenceTargetSample abstractReferenceTargetSample = (AbstractReferenceTargetSample)theEObject;
				T result = caseAbstractReferenceTargetSample(abstractReferenceTargetSample);
				if (result == null) result = caseAbstractSample(abstractReferenceTargetSample);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FiltersPackage.CONCRETE_REFERENCE_OWNER_SAMPLE: {
				ConcreteReferenceOwnerSample concreteReferenceOwnerSample = (ConcreteReferenceOwnerSample)theEObject;
				T result = caseConcreteReferenceOwnerSample(concreteReferenceOwnerSample);
				if (result == null) result = caseAbstractReferenceOwnerSample(concreteReferenceOwnerSample);
				if (result == null) result = caseAbstractSample(concreteReferenceOwnerSample);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FiltersPackage.CONCRETE_REFERENCE_TARGET_SAMPLE1: {
				ConcreteReferenceTargetSample1 concreteReferenceTargetSample1 = (ConcreteReferenceTargetSample1)theEObject;
				T result = caseConcreteReferenceTargetSample1(concreteReferenceTargetSample1);
				if (result == null) result = caseAbstractReferenceTargetSample(concreteReferenceTargetSample1);
				if (result == null) result = caseAbstractSample(concreteReferenceTargetSample1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FiltersPackage.CONCRETE_REFERENCE_TARGET_SAMPLE2: {
				ConcreteReferenceTargetSample2 concreteReferenceTargetSample2 = (ConcreteReferenceTargetSample2)theEObject;
				T result = caseConcreteReferenceTargetSample2(concreteReferenceTargetSample2);
				if (result == null) result = caseAbstractReferenceTargetSample(concreteReferenceTargetSample2);
				if (result == null) result = caseAbstractSample(concreteReferenceTargetSample2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Reference Owner Sample</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Reference Owner Sample</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractReferenceOwnerSample(AbstractReferenceOwnerSample object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Reference Target Sample</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Reference Target Sample</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractReferenceTargetSample(AbstractReferenceTargetSample object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concrete Reference Owner Sample</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concrete Reference Owner Sample</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcreteReferenceOwnerSample(ConcreteReferenceOwnerSample object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concrete Reference Target Sample1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concrete Reference Target Sample1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcreteReferenceTargetSample1(ConcreteReferenceTargetSample1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concrete Reference Target Sample2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concrete Reference Target Sample2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcreteReferenceTargetSample2(ConcreteReferenceTargetSample2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Sample</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Sample</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractSample(AbstractSample object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //FiltersSwitch
