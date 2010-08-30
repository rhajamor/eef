/**
 * <copyright>
 * </copyright>
 *
 * $Id: Topic.java,v 1.2.4.1 2010/08/30 08:45:00 sbouchet Exp $
 */
package org.eclipse.emf.eef.nonreg;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.eef.ab.abstractnonreg.DocumentedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Topic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.nonreg.Topic#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.nonreg.Topic#getReferences <em>References</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.eef.nonreg.NonregPackage#getTopic()
 * @model
 * @generated
 */
public interface Topic extends DocumentedElement {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.eclipse.emf.eef.nonreg.NonregPackage#getTopic_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.nonreg.Topic#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>References</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' attribute list.
	 * @see org.eclipse.emf.eef.nonreg.NonregPackage#getTopic_References()
	 * @model
	 * @generated
	 */
	EList<String> getReferences();

} // Topic
