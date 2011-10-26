/**
 * <copyright>
 * </copyright>
 *
 * $Id: NavigationSwitch.java,v 1.4.2.2 2011/10/26 16:16:45 sbouchet Exp $
 */
package org.eclipse.emf.eef.eefnr.navigation.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.eefnr.AbstractSample;

import org.eclipse.emf.eef.eefnr.NamedElement;
import org.eclipse.emf.eef.eefnr.navigation.*;

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
 * @see org.eclipse.emf.eef.eefnr.navigation.NavigationPackage
 * @generated
 */
public class NavigationSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static NavigationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavigationSwitch() {
		if (modelPackage == null) {
			modelPackage = NavigationPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case NavigationPackage.DEFERED_FLAT_REFERENCE_TABLE_EDITOR_SAMPLE: {
				DeferedFlatReferenceTableEditorSample deferedFlatReferenceTableEditorSample = (DeferedFlatReferenceTableEditorSample)theEObject;
				T result = caseDeferedFlatReferenceTableEditorSample(deferedFlatReferenceTableEditorSample);
				if (result == null) result = caseAbstractSample(deferedFlatReferenceTableEditorSample);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NavigationPackage.DEFERED_REFERENCE: {
				DeferedReference deferedReference = (DeferedReference)theEObject;
				T result = caseDeferedReference(deferedReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NavigationPackage.DEFERED_REFERENCE_TABLE_EDITOR_SAMPLE: {
				DeferedReferenceTableEditorSample deferedReferenceTableEditorSample = (DeferedReferenceTableEditorSample)theEObject;
				T result = caseDeferedReferenceTableEditorSample(deferedReferenceTableEditorSample);
				if (result == null) result = caseAbstractSample(deferedReferenceTableEditorSample);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NavigationPackage.OWNER: {
				Owner owner = (Owner)theEObject;
				T result = caseOwner(owner);
				if (result == null) result = caseAbstractSample(owner);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NavigationPackage.MULTIPLE_REFERENCER: {
				MultipleReferencer multipleReferencer = (MultipleReferencer)theEObject;
				T result = caseMultipleReferencer(multipleReferencer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NavigationPackage.SUBTYPE: {
				Subtype subtype = (Subtype)theEObject;
				T result = caseSubtype(subtype);
				if (result == null) result = caseOwner(subtype);
				if (result == null) result = caseAbstractSample(subtype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NavigationPackage.SINGLE_REFERENCER: {
				SingleReferencer singleReferencer = (SingleReferencer)theEObject;
				T result = caseSingleReferencer(singleReferencer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NavigationPackage.ANOTHER_SUB_TYPE: {
				AnotherSubType anotherSubType = (AnotherSubType)theEObject;
				T result = caseAnotherSubType(anotherSubType);
				if (result == null) result = caseSubtype(anotherSubType);
				if (result == null) result = caseOwner(anotherSubType);
				if (result == null) result = caseAbstractSample(anotherSubType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NavigationPackage.ELEMENT: {
				Element element = (Element)theEObject;
				T result = caseElement(element);
				if (result == null) result = caseNamedElement(element);
				if (result == null) result = caseAbstractSample(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NavigationPackage.ATTRIBUTE_NAVIGATION_SAMPLE: {
				AttributeNavigationSample attributeNavigationSample = (AttributeNavigationSample)theEObject;
				T result = caseAttributeNavigationSample(attributeNavigationSample);
				if (result == null) result = caseAbstractSample(attributeNavigationSample);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NavigationPackage.ATTRIBUTE_DELEGATE: {
				AttributeDelegate attributeDelegate = (AttributeDelegate)theEObject;
				T result = caseAttributeDelegate(attributeDelegate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Defered Flat Reference Table Editor Sample</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Defered Flat Reference Table Editor Sample</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeferedFlatReferenceTableEditorSample(DeferedFlatReferenceTableEditorSample object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Defered Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Defered Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeferedReference(DeferedReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Defered Reference Table Editor Sample</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Defered Reference Table Editor Sample</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeferedReferenceTableEditorSample(DeferedReferenceTableEditorSample object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Owner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Owner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOwner(Owner object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiple Referencer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiple Referencer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultipleReferencer(MultipleReferencer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subtype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subtype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubtype(Subtype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Referencer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Referencer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleReferencer(SingleReferencer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Another Sub Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Another Sub Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnotherSubType(AnotherSubType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Navigation Sample</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Navigation Sample</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeNavigationSample(AttributeNavigationSample object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Delegate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Delegate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeDelegate(AttributeDelegate object) {
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
	public T defaultCase(EObject object) {
		return null;
	}

} //NavigationSwitch
