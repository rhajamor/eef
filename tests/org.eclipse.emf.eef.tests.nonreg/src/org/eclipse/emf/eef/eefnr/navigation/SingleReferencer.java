/**
 * <copyright>
 * </copyright>
 *
 * $Id: SingleReferencer.java,v 1.1.2.1 2011/10/26 16:16:44 sbouchet Exp $
 */
package org.eclipse.emf.eef.eefnr.navigation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Referencer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.eefnr.navigation.SingleReferencer#getSingleSampleForTableComposition <em>Single Sample For Table Composition</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.navigation.SingleReferencer#getSingleSampleForAdvancedTableComposition <em>Single Sample For Advanced Table Composition</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.navigation.SingleReferencer#getSingleSampleForReferencesTable <em>Single Sample For References Table</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.navigation.SingleReferencer#getSingleSampleAdvancedReferencesTable <em>Single Sample Advanced References Table</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.navigation.SingleReferencer#getSingleSampleForFlatReferencesTable <em>Single Sample For Flat References Table</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.navigation.SingleReferencer#getSingleContainmentForEObjectFlatComboViewer <em>Single Containment For EObject Flat Combo Viewer</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.navigation.SingleReferencer#getSingleReferenceForEObjectFlatComboViewer <em>Single Reference For EObject Flat Combo Viewer</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.navigation.SingleReferencer#getSingleContainmentForAdvancedEObjectFlatComboViewer <em>Single Containment For Advanced EObject Flat Combo Viewer</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.navigation.SingleReferencer#getSingleReferenceForAdvancedEObjectFlatComboViewer <em>Single Reference For Advanced EObject Flat Combo Viewer</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.navigation.SingleReferencer#isBooleanAttribute <em>Boolean Attribute</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.navigation.SingleReferencer#getEenumAttribute <em>Eenum Attribute</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.navigation.SingleReferencer#getStringAttribute <em>String Attribute</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.navigation.SingleReferencer#getListAttribute <em>List Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.eef.eefnr.navigation.NavigationPackage#getSingleReferencer()
 * @model
 * @generated
 */
public interface SingleReferencer extends EObject {
	/**
	 * Returns the value of the '<em><b>Single Sample For Table Composition</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.eef.eefnr.navigation.Owner}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Single Sample For Table Composition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Single Sample For Table Composition</em>' containment reference list.
	 * @see org.eclipse.emf.eef.eefnr.navigation.NavigationPackage#getSingleReferencer_SingleSampleForTableComposition()
	 * @model containment="true"
	 * @generated
	 */
	EList<Owner> getSingleSampleForTableComposition();

	/**
	 * Returns the value of the '<em><b>Single Sample For Advanced Table Composition</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.eef.eefnr.navigation.Owner}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Single Sample For Advanced Table Composition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Single Sample For Advanced Table Composition</em>' containment reference list.
	 * @see org.eclipse.emf.eef.eefnr.navigation.NavigationPackage#getSingleReferencer_SingleSampleForAdvancedTableComposition()
	 * @model containment="true"
	 * @generated
	 */
	EList<Owner> getSingleSampleForAdvancedTableComposition();

	/**
	 * Returns the value of the '<em><b>Single Sample For References Table</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.eef.eefnr.navigation.Owner}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Single Sample For References Table</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Single Sample For References Table</em>' reference list.
	 * @see org.eclipse.emf.eef.eefnr.navigation.NavigationPackage#getSingleReferencer_SingleSampleForReferencesTable()
	 * @model
	 * @generated
	 */
	EList<Owner> getSingleSampleForReferencesTable();

	/**
	 * Returns the value of the '<em><b>Single Sample Advanced References Table</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.eef.eefnr.navigation.Owner}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Single Sample Advanced References Table</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Single Sample Advanced References Table</em>' reference list.
	 * @see org.eclipse.emf.eef.eefnr.navigation.NavigationPackage#getSingleReferencer_SingleSampleAdvancedReferencesTable()
	 * @model
	 * @generated
	 */
	EList<Owner> getSingleSampleAdvancedReferencesTable();

	/**
	 * Returns the value of the '<em><b>Single Sample For Flat References Table</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.eef.eefnr.navigation.Owner}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Single Sample For Flat References Table</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Single Sample For Flat References Table</em>' reference list.
	 * @see org.eclipse.emf.eef.eefnr.navigation.NavigationPackage#getSingleReferencer_SingleSampleForFlatReferencesTable()
	 * @model
	 * @generated
	 */
	EList<Owner> getSingleSampleForFlatReferencesTable();

	/**
	 * Returns the value of the '<em><b>Single Containment For EObject Flat Combo Viewer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Single Containment For EObject Flat Combo Viewer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Single Containment For EObject Flat Combo Viewer</em>' containment reference.
	 * @see #setSingleContainmentForEObjectFlatComboViewer(Owner)
	 * @see org.eclipse.emf.eef.eefnr.navigation.NavigationPackage#getSingleReferencer_SingleContainmentForEObjectFlatComboViewer()
	 * @model containment="true"
	 * @generated
	 */
	Owner getSingleContainmentForEObjectFlatComboViewer();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.eefnr.navigation.SingleReferencer#getSingleContainmentForEObjectFlatComboViewer <em>Single Containment For EObject Flat Combo Viewer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Single Containment For EObject Flat Combo Viewer</em>' containment reference.
	 * @see #getSingleContainmentForEObjectFlatComboViewer()
	 * @generated
	 */
	void setSingleContainmentForEObjectFlatComboViewer(Owner value);

	/**
	 * Returns the value of the '<em><b>Single Reference For EObject Flat Combo Viewer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Single Reference For EObject Flat Combo Viewer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Single Reference For EObject Flat Combo Viewer</em>' reference.
	 * @see #setSingleReferenceForEObjectFlatComboViewer(Owner)
	 * @see org.eclipse.emf.eef.eefnr.navigation.NavigationPackage#getSingleReferencer_SingleReferenceForEObjectFlatComboViewer()
	 * @model
	 * @generated
	 */
	Owner getSingleReferenceForEObjectFlatComboViewer();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.eefnr.navigation.SingleReferencer#getSingleReferenceForEObjectFlatComboViewer <em>Single Reference For EObject Flat Combo Viewer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Single Reference For EObject Flat Combo Viewer</em>' reference.
	 * @see #getSingleReferenceForEObjectFlatComboViewer()
	 * @generated
	 */
	void setSingleReferenceForEObjectFlatComboViewer(Owner value);

	/**
	 * Returns the value of the '<em><b>Single Containment For Advanced EObject Flat Combo Viewer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Single Containment For Advanced EObject Flat Combo Viewer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Single Containment For Advanced EObject Flat Combo Viewer</em>' containment reference.
	 * @see #setSingleContainmentForAdvancedEObjectFlatComboViewer(Owner)
	 * @see org.eclipse.emf.eef.eefnr.navigation.NavigationPackage#getSingleReferencer_SingleContainmentForAdvancedEObjectFlatComboViewer()
	 * @model containment="true"
	 * @generated
	 */
	Owner getSingleContainmentForAdvancedEObjectFlatComboViewer();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.eefnr.navigation.SingleReferencer#getSingleContainmentForAdvancedEObjectFlatComboViewer <em>Single Containment For Advanced EObject Flat Combo Viewer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Single Containment For Advanced EObject Flat Combo Viewer</em>' containment reference.
	 * @see #getSingleContainmentForAdvancedEObjectFlatComboViewer()
	 * @generated
	 */
	void setSingleContainmentForAdvancedEObjectFlatComboViewer(Owner value);

	/**
	 * Returns the value of the '<em><b>Single Reference For Advanced EObject Flat Combo Viewer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Single Reference For Advanced EObject Flat Combo Viewer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Single Reference For Advanced EObject Flat Combo Viewer</em>' reference.
	 * @see #setSingleReferenceForAdvancedEObjectFlatComboViewer(Owner)
	 * @see org.eclipse.emf.eef.eefnr.navigation.NavigationPackage#getSingleReferencer_SingleReferenceForAdvancedEObjectFlatComboViewer()
	 * @model
	 * @generated
	 */
	Owner getSingleReferenceForAdvancedEObjectFlatComboViewer();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.eefnr.navigation.SingleReferencer#getSingleReferenceForAdvancedEObjectFlatComboViewer <em>Single Reference For Advanced EObject Flat Combo Viewer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Single Reference For Advanced EObject Flat Combo Viewer</em>' reference.
	 * @see #getSingleReferenceForAdvancedEObjectFlatComboViewer()
	 * @generated
	 */
	void setSingleReferenceForAdvancedEObjectFlatComboViewer(Owner value);

	/**
	 * Returns the value of the '<em><b>Boolean Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boolean Attribute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean Attribute</em>' attribute.
	 * @see #setBooleanAttribute(boolean)
	 * @see org.eclipse.emf.eef.eefnr.navigation.NavigationPackage#getSingleReferencer_BooleanAttribute()
	 * @model
	 * @generated
	 */
	boolean isBooleanAttribute();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.eefnr.navigation.SingleReferencer#isBooleanAttribute <em>Boolean Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolean Attribute</em>' attribute.
	 * @see #isBooleanAttribute()
	 * @generated
	 */
	void setBooleanAttribute(boolean value);

	/**
	 * Returns the value of the '<em><b>Eenum Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eenum Attribute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eenum Attribute</em>' attribute.
	 * @see #setEenumAttribute(Enumerator)
	 * @see org.eclipse.emf.eef.eefnr.navigation.NavigationPackage#getSingleReferencer_EenumAttribute()
	 * @model transient="true"
	 * @generated
	 */
	Enumerator getEenumAttribute();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.eefnr.navigation.SingleReferencer#getEenumAttribute <em>Eenum Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eenum Attribute</em>' attribute.
	 * @see #getEenumAttribute()
	 * @generated
	 */
	void setEenumAttribute(Enumerator value);

	/**
	 * Returns the value of the '<em><b>String Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String Attribute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Attribute</em>' attribute.
	 * @see #setStringAttribute(String)
	 * @see org.eclipse.emf.eef.eefnr.navigation.NavigationPackage#getSingleReferencer_StringAttribute()
	 * @model
	 * @generated
	 */
	String getStringAttribute();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.eefnr.navigation.SingleReferencer#getStringAttribute <em>String Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String Attribute</em>' attribute.
	 * @see #getStringAttribute()
	 * @generated
	 */
	void setStringAttribute(String value);

	/**
	 * Returns the value of the '<em><b>List Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Attribute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Attribute</em>' attribute.
	 * @see #setListAttribute(EList)
	 * @see org.eclipse.emf.eef.eefnr.navigation.NavigationPackage#getSingleReferencer_ListAttribute()
	 * @model many="false" transient="true"
	 * @generated
	 */
	EList<?> getListAttribute();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.eefnr.navigation.SingleReferencer#getListAttribute <em>List Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Attribute</em>' attribute.
	 * @see #getListAttribute()
	 * @generated
	 */
	void setListAttribute(EList<?> value);

} // SingleReferencer
