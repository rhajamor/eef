/**
 * <copyright>
 * </copyright>
 *
 * $Id: NavigationPackage.java,v 1.4.2.3 2012/02/15 13:25:39 glefur Exp $
 */
package org.eclipse.emf.eef.eefnr.navigation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.eef.eefnr.EefnrPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.eef.eefnr.navigation.NavigationFactory
 * @model kind="package"
 * @generated
 */
public interface NavigationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "navigation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/eef/nonreg/navigation/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "eefnr-nav";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NavigationPackage eINSTANCE = org.eclipse.emf.eef.eefnr.navigation.impl.NavigationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.eefnr.navigation.impl.DeferedFlatReferenceTableEditorSampleImpl <em>Defered Flat Reference Table Editor Sample</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.eefnr.navigation.impl.DeferedFlatReferenceTableEditorSampleImpl
	 * @see org.eclipse.emf.eef.eefnr.navigation.impl.NavigationPackageImpl#getDeferedFlatReferenceTableEditorSample()
	 * @generated
	 */
	int DEFERED_FLAT_REFERENCE_TABLE_EDITOR_SAMPLE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFERED_FLAT_REFERENCE_TABLE_EDITOR_SAMPLE__NAME = EefnrPackage.ABSTRACT_SAMPLE__NAME;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFERED_FLAT_REFERENCE_TABLE_EDITOR_SAMPLE__REFERENCES = EefnrPackage.ABSTRACT_SAMPLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Defered Flat Reference Table Editor Sample</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFERED_FLAT_REFERENCE_TABLE_EDITOR_SAMPLE_FEATURE_COUNT = EefnrPackage.ABSTRACT_SAMPLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.eefnr.navigation.impl.DeferedReferenceImpl <em>Defered Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.eefnr.navigation.impl.DeferedReferenceImpl
	 * @see org.eclipse.emf.eef.eefnr.navigation.impl.NavigationPackageImpl#getDeferedReference()
	 * @generated
	 */
	int DEFERED_REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Flatreference Editor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFERED_REFERENCE__FLATREFERENCE_EDITOR = 0;

	/**
	 * The number of structural features of the '<em>Defered Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFERED_REFERENCE_FEATURE_COUNT = 1;


	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.eefnr.navigation.impl.DeferedReferenceTableEditorSampleImpl <em>Defered Reference Table Editor Sample</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.eefnr.navigation.impl.DeferedReferenceTableEditorSampleImpl
	 * @see org.eclipse.emf.eef.eefnr.navigation.impl.NavigationPackageImpl#getDeferedReferenceTableEditorSample()
	 * @generated
	 */
	int DEFERED_REFERENCE_TABLE_EDITOR_SAMPLE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFERED_REFERENCE_TABLE_EDITOR_SAMPLE__NAME = EefnrPackage.ABSTRACT_SAMPLE__NAME;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFERED_REFERENCE_TABLE_EDITOR_SAMPLE__REFERENCES = EefnrPackage.ABSTRACT_SAMPLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Defered Reference Table Editor Sample</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFERED_REFERENCE_TABLE_EDITOR_SAMPLE_FEATURE_COUNT = EefnrPackage.ABSTRACT_SAMPLE_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.eefnr.navigation.impl.OwnerImpl <em>Owner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.eefnr.navigation.impl.OwnerImpl
	 * @see org.eclipse.emf.eef.eefnr.navigation.impl.NavigationPackageImpl#getOwner()
	 * @generated
	 */
	int OWNER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER__NAME = EefnrPackage.ABSTRACT_SAMPLE__NAME;

	/**
	 * The feature id for the '<em><b>Multiple Referencers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER__MULTIPLE_REFERENCERS = EefnrPackage.ABSTRACT_SAMPLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Single Referencers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER__SINGLE_REFERENCERS = EefnrPackage.ABSTRACT_SAMPLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER_FEATURE_COUNT = EefnrPackage.ABSTRACT_SAMPLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.eefnr.navigation.impl.MultipleReferencerImpl <em>Multiple Referencer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.eefnr.navigation.impl.MultipleReferencerImpl
	 * @see org.eclipse.emf.eef.eefnr.navigation.impl.NavigationPackageImpl#getMultipleReferencer()
	 * @generated
	 */
	int MULTIPLE_REFERENCER = 4;

	/**
	 * The feature id for the '<em><b>Multiple Sample For Table Composition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_REFERENCER__MULTIPLE_SAMPLE_FOR_TABLE_COMPOSITION = 0;

	/**
	 * The feature id for the '<em><b>Multiple Sample For Advanced Table Composition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_REFERENCER__MULTIPLE_SAMPLE_FOR_ADVANCED_TABLE_COMPOSITION = 1;

	/**
	 * The feature id for the '<em><b>Multiple Sample For References Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_REFERENCER__MULTIPLE_SAMPLE_FOR_REFERENCES_TABLE = 2;

	/**
	 * The feature id for the '<em><b>Multiple Sample Advanced References Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_REFERENCER__MULTIPLE_SAMPLE_ADVANCED_REFERENCES_TABLE = 3;

	/**
	 * The feature id for the '<em><b>Multiple Sample For Flat References Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_REFERENCER__MULTIPLE_SAMPLE_FOR_FLAT_REFERENCES_TABLE = 4;

	/**
	 * The number of structural features of the '<em>Multiple Referencer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_REFERENCER_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.eefnr.navigation.impl.SubtypeImpl <em>Subtype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.eefnr.navigation.impl.SubtypeImpl
	 * @see org.eclipse.emf.eef.eefnr.navigation.impl.NavigationPackageImpl#getSubtype()
	 * @generated
	 */
	int SUBTYPE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTYPE__NAME = OWNER__NAME;

	/**
	 * The feature id for the '<em><b>Multiple Referencers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTYPE__MULTIPLE_REFERENCERS = OWNER__MULTIPLE_REFERENCERS;

	/**
	 * The feature id for the '<em><b>Single Referencers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTYPE__SINGLE_REFERENCERS = OWNER__SINGLE_REFERENCERS;

	/**
	 * The feature id for the '<em><b>Specialised Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTYPE__SPECIALISED_ELEMENT = OWNER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Subtype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTYPE_FEATURE_COUNT = OWNER_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.eefnr.navigation.impl.SingleReferencerImpl <em>Single Referencer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.eefnr.navigation.impl.SingleReferencerImpl
	 * @see org.eclipse.emf.eef.eefnr.navigation.impl.NavigationPackageImpl#getSingleReferencer()
	 * @generated
	 */
	int SINGLE_REFERENCER = 6;

	/**
	 * The feature id for the '<em><b>Single Sample For Table Composition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_REFERENCER__SINGLE_SAMPLE_FOR_TABLE_COMPOSITION = 0;

	/**
	 * The feature id for the '<em><b>Single Sample For Advanced Table Composition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_REFERENCER__SINGLE_SAMPLE_FOR_ADVANCED_TABLE_COMPOSITION = 1;

	/**
	 * The feature id for the '<em><b>Single Sample For References Table</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_REFERENCER__SINGLE_SAMPLE_FOR_REFERENCES_TABLE = 2;

	/**
	 * The feature id for the '<em><b>Single Sample Advanced References Table</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_REFERENCER__SINGLE_SAMPLE_ADVANCED_REFERENCES_TABLE = 3;

	/**
	 * The feature id for the '<em><b>Single Sample For Flat References Table</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_REFERENCER__SINGLE_SAMPLE_FOR_FLAT_REFERENCES_TABLE = 4;

	/**
	 * The feature id for the '<em><b>Single Containment For EObject Flat Combo Viewer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_REFERENCER__SINGLE_CONTAINMENT_FOR_EOBJECT_FLAT_COMBO_VIEWER = 5;

	/**
	 * The feature id for the '<em><b>Single Reference For EObject Flat Combo Viewer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_REFERENCER__SINGLE_REFERENCE_FOR_EOBJECT_FLAT_COMBO_VIEWER = 6;

	/**
	 * The feature id for the '<em><b>Single Containment For Advanced EObject Flat Combo Viewer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_REFERENCER__SINGLE_CONTAINMENT_FOR_ADVANCED_EOBJECT_FLAT_COMBO_VIEWER = 7;

	/**
	 * The feature id for the '<em><b>Single Reference For Advanced EObject Flat Combo Viewer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_REFERENCER__SINGLE_REFERENCE_FOR_ADVANCED_EOBJECT_FLAT_COMBO_VIEWER = 8;

	/**
	 * The feature id for the '<em><b>Boolean Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_REFERENCER__BOOLEAN_ATTRIBUTE = 9;

	/**
	 * The feature id for the '<em><b>Eenum Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_REFERENCER__EENUM_ATTRIBUTE = 10;

	/**
	 * The feature id for the '<em><b>String Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_REFERENCER__STRING_ATTRIBUTE = 11;

	/**
	 * The feature id for the '<em><b>List Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_REFERENCER__LIST_ATTRIBUTE = 12;

	/**
	 * The number of structural features of the '<em>Single Referencer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_REFERENCER_FEATURE_COUNT = 13;


	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.eefnr.navigation.impl.AnotherSubTypeImpl <em>Another Sub Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.eefnr.navigation.impl.AnotherSubTypeImpl
	 * @see org.eclipse.emf.eef.eefnr.navigation.impl.NavigationPackageImpl#getAnotherSubType()
	 * @generated
	 */
	int ANOTHER_SUB_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANOTHER_SUB_TYPE__NAME = SUBTYPE__NAME;

	/**
	 * The feature id for the '<em><b>Multiple Referencers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANOTHER_SUB_TYPE__MULTIPLE_REFERENCERS = SUBTYPE__MULTIPLE_REFERENCERS;

	/**
	 * The feature id for the '<em><b>Single Referencers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANOTHER_SUB_TYPE__SINGLE_REFERENCERS = SUBTYPE__SINGLE_REFERENCERS;

	/**
	 * The feature id for the '<em><b>Specialised Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANOTHER_SUB_TYPE__SPECIALISED_ELEMENT = SUBTYPE__SPECIALISED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Another Specialisation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANOTHER_SUB_TYPE__ANOTHER_SPECIALISATION = SUBTYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Another Sub Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANOTHER_SUB_TYPE_FEATURE_COUNT = SUBTYPE_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.eefnr.navigation.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.eefnr.navigation.impl.ElementImpl
	 * @see org.eclipse.emf.eef.eefnr.navigation.impl.NavigationPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = EefnrPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__VISIBLE = EefnrPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = EefnrPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.eefnr.navigation.impl.AttributeNavigationSampleImpl <em>Attribute Navigation Sample</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.eefnr.navigation.impl.AttributeNavigationSampleImpl
	 * @see org.eclipse.emf.eef.eefnr.navigation.impl.NavigationPackageImpl#getAttributeNavigationSample()
	 * @generated
	 */
	int ATTRIBUTE_NAVIGATION_SAMPLE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NAVIGATION_SAMPLE__NAME = EefnrPackage.ABSTRACT_SAMPLE__NAME;

	/**
	 * The feature id for the '<em><b>Single Valued Attribute Delegate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NAVIGATION_SAMPLE__SINGLE_VALUED_ATTRIBUTE_DELEGATE = EefnrPackage.ABSTRACT_SAMPLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Multi Valued Attribute Delegate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NAVIGATION_SAMPLE__MULTI_VALUED_ATTRIBUTE_DELEGATE = EefnrPackage.ABSTRACT_SAMPLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute Navigation Sample</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NAVIGATION_SAMPLE_FEATURE_COUNT = EefnrPackage.ABSTRACT_SAMPLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.eefnr.navigation.impl.AttributeDelegateImpl <em>Attribute Delegate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.eefnr.navigation.impl.AttributeDelegateImpl
	 * @see org.eclipse.emf.eef.eefnr.navigation.impl.NavigationPackageImpl#getAttributeDelegate()
	 * @generated
	 */
	int ATTRIBUTE_DELEGATE = 10;

	/**
	 * The feature id for the '<em><b>Delegate1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DELEGATE__DELEGATE1 = 0;

	/**
	 * The feature id for the '<em><b>Delegate2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DELEGATE__DELEGATE2 = 1;

	/**
	 * The number of structural features of the '<em>Attribute Delegate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DELEGATE_FEATURE_COUNT = 2;


	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.eefnr.navigation.impl.DeferedMultivaluedEditorSampleImpl <em>Defered Multivalued Editor Sample</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.eefnr.navigation.impl.DeferedMultivaluedEditorSampleImpl
	 * @see org.eclipse.emf.eef.eefnr.navigation.impl.NavigationPackageImpl#getDeferedMultivaluedEditorSample()
	 * @generated
	 */
	int DEFERED_MULTIVALUED_EDITOR_SAMPLE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFERED_MULTIVALUED_EDITOR_SAMPLE__NAME = EefnrPackage.ABSTRACT_SAMPLE__NAME;

	/**
	 * The feature id for the '<em><b>Defered Editor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFERED_MULTIVALUED_EDITOR_SAMPLE__DEFERED_EDITOR = EefnrPackage.ABSTRACT_SAMPLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Defered Multivalued Editor Sample</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFERED_MULTIVALUED_EDITOR_SAMPLE_FEATURE_COUNT = EefnrPackage.ABSTRACT_SAMPLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.eefnr.navigation.impl.DeferedMultivaluedEditorImpl <em>Defered Multivalued Editor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.eefnr.navigation.impl.DeferedMultivaluedEditorImpl
	 * @see org.eclipse.emf.eef.eefnr.navigation.impl.NavigationPackageImpl#getDeferedMultivaluedEditor()
	 * @generated
	 */
	int DEFERED_MULTIVALUED_EDITOR = 12;

	/**
	 * The feature id for the '<em><b>Multi Valued Editor</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFERED_MULTIVALUED_EDITOR__MULTI_VALUED_EDITOR = 0;

	/**
	 * The number of structural features of the '<em>Defered Multivalued Editor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFERED_MULTIVALUED_EDITOR_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.eefnr.navigation.DeferedFlatReferenceTableEditorSample <em>Defered Flat Reference Table Editor Sample</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Defered Flat Reference Table Editor Sample</em>'.
	 * @see org.eclipse.emf.eef.eefnr.navigation.DeferedFlatReferenceTableEditorSample
	 * @generated
	 */
	EClass getDeferedFlatReferenceTableEditorSample();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.eef.eefnr.navigation.DeferedFlatReferenceTableEditorSample#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>References</em>'.
	 * @see org.eclipse.emf.eef.eefnr.navigation.DeferedFlatReferenceTableEditorSample#getReferences()
	 * @see #getDeferedFlatReferenceTableEditorSample()
	 * @generated
	 */
	EReference getDeferedFlatReferenceTableEditorSample_References();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.eefnr.navigation.DeferedReference <em>Defered Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Defered Reference</em>'.
	 * @see org.eclipse.emf.eef.eefnr.navigation.DeferedReference
	 * @generated
	 */
	EClass getDeferedReference();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.eef.eefnr.navigation.DeferedReference#getFlatreferenceEditor <em>Flatreference Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Flatreference Editor</em>'.
	 * @see org.eclipse.emf.eef.eefnr.navigation.DeferedReference#getFlatreferenceEditor()
	 * @see #getDeferedReference()
	 * @generated
	 */
	EReference getDeferedReference_FlatreferenceEditor();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.eefnr.navigation.DeferedReferenceTableEditorSample <em>Defered Reference Table Editor Sample</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Defered Reference Table Editor Sample</em>'.
	 * @see org.eclipse.emf.eef.eefnr.navigation.DeferedReferenceTableEditorSample
	 * @generated
	 */
	EClass getDeferedReferenceTableEditorSample();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.eef.eefnr.navigation.DeferedReferenceTableEditorSample#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>References</em>'.
	 * @see org.eclipse.emf.eef.eefnr.navigation.DeferedReferenceTableEditorSample#getReferences()
	 * @see #getDeferedReferenceTableEditorSample()
	 * @generated
	 */
	EReference getDeferedReferenceTableEditorSample_References();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.eefnr.navigation.Owner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Owner</em>'.
	 * @see org.eclipse.emf.eef.eefnr.navigation.Owner
	 * @generated
	 */
	EClass getOwner();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.eef.eefnr.navigation.Owner#getMultipleReferencers <em>Multiple Referencers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Multiple Referencers</em>'.
	 * @see org.eclipse.emf.eef.eefnr.navigation.Owner#getMultipleReferencers()
	 * @see #getOwner()
	 * @generated
	 */
	EReference getOwner_MultipleReferencers();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.eef.eefnr.navigation.Owner#getSingleReferencers <em>Single Referencers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Single Referencers</em>'.
	 * @see org.eclipse.emf.eef.eefnr.navigation.Owner#getSingleReferencers()
	 * @see #getOwner()
	 * @generated
	 */
	EReference getOwner_SingleReferencers();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.eefnr.navigation.MultipleReferencer <em>Multiple Referencer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiple Referencer</em>'.
	 * @see org.eclipse.emf.eef.eefnr.navigation.MultipleReferencer
	 * @generated
	 */
	EClass getMultipleReferencer();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.eef.eefnr.navigation.MultipleReferencer#getMultipleSampleForTableComposition <em>Multiple Sample For Table Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Multiple Sample For Table Composition</em>'.
	 * @see org.eclipse.emf.eef.eefnr.navigation.MultipleReferencer#getMultipleSampleForTableComposition()
	 * @see #getMultipleReferencer()
	 * @generated
	 */
	EReference getMultipleReferencer_MultipleSampleForTableComposition();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.eef.eefnr.navigation.MultipleReferencer#getMultipleSampleForAdvancedTableComposition <em>Multiple Sample For Advanced Table Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Multiple Sample For Advanced Table Composition</em>'.
	 * @see org.eclipse.emf.eef.eefnr.navigation.MultipleReferencer#getMultipleSampleForAdvancedTableComposition()
	 * @see #getMultipleReferencer()
	 * @generated
	 */
	EReference getMultipleReferencer_MultipleSampleForAdvancedTableComposition();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.eef.eefnr.navigation.MultipleReferencer#getMultipleSampleForReferencesTable <em>Multiple Sample For References Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Multiple Sample For References Table</em>'.
	 * @see org.eclipse.emf.eef.eefnr.navigation.MultipleReferencer#getMultipleSampleForReferencesTable()
	 * @see #getMultipleReferencer()
	 * @generated
	 */
	EReference getMultipleReferencer_MultipleSampleForReferencesTable();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.eef.eefnr.navigation.MultipleReferencer#getMultipleSampleAdvancedReferencesTable <em>Multiple Sample Advanced References Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Multiple Sample Advanced References Table</em>'.
	 * @see org.eclipse.emf.eef.eefnr.navigation.MultipleReferencer#getMultipleSampleAdvancedReferencesTable()
	 * @see #getMultipleReferencer()
	 * @generated
	 */
	EReference getMultipleReferencer_MultipleSampleAdvancedReferencesTable();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.eef.eefnr.navigation.MultipleReferencer#getMultipleSampleForFlatReferencesTable <em>Multiple Sample For Flat References Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Multiple Sample For Flat References Table</em>'.
	 * @see org.eclipse.emf.eef.eefnr.navigation.MultipleReferencer#getMultipleSampleForFlatReferencesTable()
	 * @see #getMultipleReferencer()
	 * @generated
	 */
	EReference getMultipleReferencer_MultipleSampleForFlatReferencesTable();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.eefnr.navigation.Subtype <em>Subtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subtype</em>'.
	 * @see org.eclipse.emf.eef.eefnr.navigation.Subtype
	 * @generated
	 */
	EClass getSubtype();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.eefnr.navigation.Subtype#isSpecialisedElement <em>Specialised Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Specialised Element</em>'.
	 * @see org.eclipse.emf.eef.eefnr.navigation.Subtype#isSpecialisedElement()
	 * @see #getSubtype()
	 * @generated
	 */
	EAttribute getSubtype_SpecialisedElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.eefnr.navigation.SingleReferencer <em>Single Referencer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Referencer</em>'.
	 * @see org.eclipse.emf.eef.eefnr.navigation.SingleReferencer
	 * @generated
	 */
	EClass getSingleReferencer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.eef.eefnr.navigation.SingleReferencer#getSingleSampleForTableComposition <em>Single Sample For Table Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Single Sample For Table Composition</em>'.
	 * @see org.eclipse.emf.eef.eefnr.navigation.SingleReferencer#getSingleSampleForTableComposition()
	 * @see #getSingleReferencer()
	 * @generated
	 */
	EReference getSingleReferencer_SingleSampleForTableComposition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.eef.eefnr.navigation.SingleReferencer#getSingleSampleForAdvancedTableComposition <em>Single Sample For Advanced Table Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Single Sample For Advanced Table Composition</em>'.
	 * @see org.eclipse.emf.eef.eefnr.navigation.SingleReferencer#getSingleSampleForAdvancedTableComposition()
	 * @see #getSingleReferencer()
	 * @generated
	 */
	EReference getSingleReferencer_SingleSampleForAdvancedTableComposition();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.eef.eefnr.navigation.SingleReferencer#getSingleSampleForReferencesTable <em>Single Sample For References Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Single Sample For References Table</em>'.
	 * @see org.eclipse.emf.eef.eefnr.navigation.SingleReferencer#getSingleSampleForReferencesTable()
	 * @see #getSingleReferencer()
	 * @generated
	 */
	EReference getSingleReferencer_SingleSampleForReferencesTable();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.eef.eefnr.navigation.SingleReferencer#getSingleSampleAdvancedReferencesTable <em>Single Sample Advanced References Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Single Sample Advanced References Table</em>'.
	 * @see org.eclipse.emf.eef.eefnr.navigation.SingleReferencer#getSingleSampleAdvancedReferencesTable()
	 * @see #getSingleReferencer()
	 * @generated
	 */
	EReference getSingleReferencer_SingleSampleAdvancedReferencesTable();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.eef.eefnr.navigation.SingleReferencer#getSingleSampleForFlatReferencesTable <em>Single Sample For Flat References Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Single Sample For Flat References Table</em>'.
	 * @see org.eclipse.emf.eef.eefnr.navigation.SingleReferencer#getSingleSampleForFlatReferencesTable()
	 * @see #getSingleReferencer()
	 * @generated
	 */
	EReference getSingleReferencer_SingleSampleForFlatReferencesTable();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.eef.eefnr.navigation.SingleReferencer#getSingleContainmentForEObjectFlatComboViewer <em>Single Containment For EObject Flat Combo Viewer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Single Containment For EObject Flat Combo Viewer</em>'.
	 * @see org.eclipse.emf.eef.eefnr.navigation.SingleReferencer#getSingleContainmentForEObjectFlatComboViewer()
	 * @see #getSingleReferencer()
	 * @generated
	 */
	EReference getSingleReferencer_SingleContainmentForEObjectFlatComboViewer();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.eef.eefnr.navigation.SingleReferencer#getSingleReferenceForEObjectFlatComboViewer <em>Single Reference For EObject Flat Combo Viewer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Single Reference For EObject Flat Combo Viewer</em>'.
	 * @see org.eclipse.emf.eef.eefnr.navigation.SingleReferencer#getSingleReferenceForEObjectFlatComboViewer()
	 * @see #getSingleReferencer()
	 * @generated
	 */
	EReference getSingleReferencer_SingleReferenceForEObjectFlatComboViewer();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.eef.eefnr.navigation.SingleReferencer#getSingleContainmentForAdvancedEObjectFlatComboViewer <em>Single Containment For Advanced EObject Flat Combo Viewer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Single Containment For Advanced EObject Flat Combo Viewer</em>'.
	 * @see org.eclipse.emf.eef.eefnr.navigation.SingleReferencer#getSingleContainmentForAdvancedEObjectFlatComboViewer()
	 * @see #getSingleReferencer()
	 * @generated
	 */
	EReference getSingleReferencer_SingleContainmentForAdvancedEObjectFlatComboViewer();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.eef.eefnr.navigation.SingleReferencer#getSingleReferenceForAdvancedEObjectFlatComboViewer <em>Single Reference For Advanced EObject Flat Combo Viewer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Single Reference For Advanced EObject Flat Combo Viewer</em>'.
	 * @see org.eclipse.emf.eef.eefnr.navigation.SingleReferencer#getSingleReferenceForAdvancedEObjectFlatComboViewer()
	 * @see #getSingleReferencer()
	 * @generated
	 */
	EReference getSingleReferencer_SingleReferenceForAdvancedEObjectFlatComboViewer();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.eefnr.navigation.SingleReferencer#isBooleanAttribute <em>Boolean Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boolean Attribute</em>'.
	 * @see org.eclipse.emf.eef.eefnr.navigation.SingleReferencer#isBooleanAttribute()
	 * @see #getSingleReferencer()
	 * @generated
	 */
	EAttribute getSingleReferencer_BooleanAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.eefnr.navigation.SingleReferencer#getEenumAttribute <em>Eenum Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eenum Attribute</em>'.
	 * @see org.eclipse.emf.eef.eefnr.navigation.SingleReferencer#getEenumAttribute()
	 * @see #getSingleReferencer()
	 * @generated
	 */
	EAttribute getSingleReferencer_EenumAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.eefnr.navigation.SingleReferencer#getStringAttribute <em>String Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String Attribute</em>'.
	 * @see org.eclipse.emf.eef.eefnr.navigation.SingleReferencer#getStringAttribute()
	 * @see #getSingleReferencer()
	 * @generated
	 */
	EAttribute getSingleReferencer_StringAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.eefnr.navigation.SingleReferencer#getListAttribute <em>List Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>List Attribute</em>'.
	 * @see org.eclipse.emf.eef.eefnr.navigation.SingleReferencer#getListAttribute()
	 * @see #getSingleReferencer()
	 * @generated
	 */
	EAttribute getSingleReferencer_ListAttribute();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.eefnr.navigation.AnotherSubType <em>Another Sub Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Another Sub Type</em>'.
	 * @see org.eclipse.emf.eef.eefnr.navigation.AnotherSubType
	 * @generated
	 */
	EClass getAnotherSubType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.eefnr.navigation.AnotherSubType#isAnotherSpecialisation <em>Another Specialisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Another Specialisation</em>'.
	 * @see org.eclipse.emf.eef.eefnr.navigation.AnotherSubType#isAnotherSpecialisation()
	 * @see #getAnotherSubType()
	 * @generated
	 */
	EAttribute getAnotherSubType_AnotherSpecialisation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.eefnr.navigation.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see org.eclipse.emf.eef.eefnr.navigation.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.eefnr.navigation.Element#isVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see org.eclipse.emf.eef.eefnr.navigation.Element#isVisible()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Visible();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.eefnr.navigation.AttributeNavigationSample <em>Attribute Navigation Sample</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Navigation Sample</em>'.
	 * @see org.eclipse.emf.eef.eefnr.navigation.AttributeNavigationSample
	 * @generated
	 */
	EClass getAttributeNavigationSample();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.eef.eefnr.navigation.AttributeNavigationSample#getSingleValuedAttributeDelegate <em>Single Valued Attribute Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Single Valued Attribute Delegate</em>'.
	 * @see org.eclipse.emf.eef.eefnr.navigation.AttributeNavigationSample#getSingleValuedAttributeDelegate()
	 * @see #getAttributeNavigationSample()
	 * @generated
	 */
	EReference getAttributeNavigationSample_SingleValuedAttributeDelegate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.eef.eefnr.navigation.AttributeNavigationSample#getMultiValuedAttributeDelegate <em>Multi Valued Attribute Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Multi Valued Attribute Delegate</em>'.
	 * @see org.eclipse.emf.eef.eefnr.navigation.AttributeNavigationSample#getMultiValuedAttributeDelegate()
	 * @see #getAttributeNavigationSample()
	 * @generated
	 */
	EReference getAttributeNavigationSample_MultiValuedAttributeDelegate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.eefnr.navigation.AttributeDelegate <em>Attribute Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Delegate</em>'.
	 * @see org.eclipse.emf.eef.eefnr.navigation.AttributeDelegate
	 * @generated
	 */
	EClass getAttributeDelegate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.eefnr.navigation.AttributeDelegate#getDelegate1 <em>Delegate1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delegate1</em>'.
	 * @see org.eclipse.emf.eef.eefnr.navigation.AttributeDelegate#getDelegate1()
	 * @see #getAttributeDelegate()
	 * @generated
	 */
	EAttribute getAttributeDelegate_Delegate1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.eefnr.navigation.AttributeDelegate#getDelegate2 <em>Delegate2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delegate2</em>'.
	 * @see org.eclipse.emf.eef.eefnr.navigation.AttributeDelegate#getDelegate2()
	 * @see #getAttributeDelegate()
	 * @generated
	 */
	EAttribute getAttributeDelegate_Delegate2();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.eefnr.navigation.DeferedMultivaluedEditorSample <em>Defered Multivalued Editor Sample</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Defered Multivalued Editor Sample</em>'.
	 * @see org.eclipse.emf.eef.eefnr.navigation.DeferedMultivaluedEditorSample
	 * @generated
	 */
	EClass getDeferedMultivaluedEditorSample();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.eef.eefnr.navigation.DeferedMultivaluedEditorSample#getDeferedEditor <em>Defered Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Defered Editor</em>'.
	 * @see org.eclipse.emf.eef.eefnr.navigation.DeferedMultivaluedEditorSample#getDeferedEditor()
	 * @see #getDeferedMultivaluedEditorSample()
	 * @generated
	 */
	EReference getDeferedMultivaluedEditorSample_DeferedEditor();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.eefnr.navigation.DeferedMultivaluedEditor <em>Defered Multivalued Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Defered Multivalued Editor</em>'.
	 * @see org.eclipse.emf.eef.eefnr.navigation.DeferedMultivaluedEditor
	 * @generated
	 */
	EClass getDeferedMultivaluedEditor();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.eef.eefnr.navigation.DeferedMultivaluedEditor#getMultiValuedEditor <em>Multi Valued Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Multi Valued Editor</em>'.
	 * @see org.eclipse.emf.eef.eefnr.navigation.DeferedMultivaluedEditor#getMultiValuedEditor()
	 * @see #getDeferedMultivaluedEditor()
	 * @generated
	 */
	EAttribute getDeferedMultivaluedEditor_MultiValuedEditor();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NavigationFactory getNavigationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.eefnr.navigation.impl.DeferedFlatReferenceTableEditorSampleImpl <em>Defered Flat Reference Table Editor Sample</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.eefnr.navigation.impl.DeferedFlatReferenceTableEditorSampleImpl
		 * @see org.eclipse.emf.eef.eefnr.navigation.impl.NavigationPackageImpl#getDeferedFlatReferenceTableEditorSample()
		 * @generated
		 */
		EClass DEFERED_FLAT_REFERENCE_TABLE_EDITOR_SAMPLE = eINSTANCE.getDeferedFlatReferenceTableEditorSample();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFERED_FLAT_REFERENCE_TABLE_EDITOR_SAMPLE__REFERENCES = eINSTANCE.getDeferedFlatReferenceTableEditorSample_References();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.eefnr.navigation.impl.DeferedReferenceImpl <em>Defered Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.eefnr.navigation.impl.DeferedReferenceImpl
		 * @see org.eclipse.emf.eef.eefnr.navigation.impl.NavigationPackageImpl#getDeferedReference()
		 * @generated
		 */
		EClass DEFERED_REFERENCE = eINSTANCE.getDeferedReference();

		/**
		 * The meta object literal for the '<em><b>Flatreference Editor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFERED_REFERENCE__FLATREFERENCE_EDITOR = eINSTANCE.getDeferedReference_FlatreferenceEditor();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.eefnr.navigation.impl.DeferedReferenceTableEditorSampleImpl <em>Defered Reference Table Editor Sample</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.eefnr.navigation.impl.DeferedReferenceTableEditorSampleImpl
		 * @see org.eclipse.emf.eef.eefnr.navigation.impl.NavigationPackageImpl#getDeferedReferenceTableEditorSample()
		 * @generated
		 */
		EClass DEFERED_REFERENCE_TABLE_EDITOR_SAMPLE = eINSTANCE.getDeferedReferenceTableEditorSample();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFERED_REFERENCE_TABLE_EDITOR_SAMPLE__REFERENCES = eINSTANCE.getDeferedReferenceTableEditorSample_References();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.eefnr.navigation.impl.OwnerImpl <em>Owner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.eefnr.navigation.impl.OwnerImpl
		 * @see org.eclipse.emf.eef.eefnr.navigation.impl.NavigationPackageImpl#getOwner()
		 * @generated
		 */
		EClass OWNER = eINSTANCE.getOwner();

		/**
		 * The meta object literal for the '<em><b>Multiple Referencers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OWNER__MULTIPLE_REFERENCERS = eINSTANCE.getOwner_MultipleReferencers();

		/**
		 * The meta object literal for the '<em><b>Single Referencers</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OWNER__SINGLE_REFERENCERS = eINSTANCE.getOwner_SingleReferencers();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.eefnr.navigation.impl.MultipleReferencerImpl <em>Multiple Referencer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.eefnr.navigation.impl.MultipleReferencerImpl
		 * @see org.eclipse.emf.eef.eefnr.navigation.impl.NavigationPackageImpl#getMultipleReferencer()
		 * @generated
		 */
		EClass MULTIPLE_REFERENCER = eINSTANCE.getMultipleReferencer();

		/**
		 * The meta object literal for the '<em><b>Multiple Sample For Table Composition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLE_REFERENCER__MULTIPLE_SAMPLE_FOR_TABLE_COMPOSITION = eINSTANCE.getMultipleReferencer_MultipleSampleForTableComposition();

		/**
		 * The meta object literal for the '<em><b>Multiple Sample For Advanced Table Composition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLE_REFERENCER__MULTIPLE_SAMPLE_FOR_ADVANCED_TABLE_COMPOSITION = eINSTANCE.getMultipleReferencer_MultipleSampleForAdvancedTableComposition();

		/**
		 * The meta object literal for the '<em><b>Multiple Sample For References Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLE_REFERENCER__MULTIPLE_SAMPLE_FOR_REFERENCES_TABLE = eINSTANCE.getMultipleReferencer_MultipleSampleForReferencesTable();

		/**
		 * The meta object literal for the '<em><b>Multiple Sample Advanced References Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLE_REFERENCER__MULTIPLE_SAMPLE_ADVANCED_REFERENCES_TABLE = eINSTANCE.getMultipleReferencer_MultipleSampleAdvancedReferencesTable();

		/**
		 * The meta object literal for the '<em><b>Multiple Sample For Flat References Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLE_REFERENCER__MULTIPLE_SAMPLE_FOR_FLAT_REFERENCES_TABLE = eINSTANCE.getMultipleReferencer_MultipleSampleForFlatReferencesTable();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.eefnr.navigation.impl.SubtypeImpl <em>Subtype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.eefnr.navigation.impl.SubtypeImpl
		 * @see org.eclipse.emf.eef.eefnr.navigation.impl.NavigationPackageImpl#getSubtype()
		 * @generated
		 */
		EClass SUBTYPE = eINSTANCE.getSubtype();

		/**
		 * The meta object literal for the '<em><b>Specialised Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBTYPE__SPECIALISED_ELEMENT = eINSTANCE.getSubtype_SpecialisedElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.eefnr.navigation.impl.SingleReferencerImpl <em>Single Referencer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.eefnr.navigation.impl.SingleReferencerImpl
		 * @see org.eclipse.emf.eef.eefnr.navigation.impl.NavigationPackageImpl#getSingleReferencer()
		 * @generated
		 */
		EClass SINGLE_REFERENCER = eINSTANCE.getSingleReferencer();

		/**
		 * The meta object literal for the '<em><b>Single Sample For Table Composition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_REFERENCER__SINGLE_SAMPLE_FOR_TABLE_COMPOSITION = eINSTANCE.getSingleReferencer_SingleSampleForTableComposition();

		/**
		 * The meta object literal for the '<em><b>Single Sample For Advanced Table Composition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_REFERENCER__SINGLE_SAMPLE_FOR_ADVANCED_TABLE_COMPOSITION = eINSTANCE.getSingleReferencer_SingleSampleForAdvancedTableComposition();

		/**
		 * The meta object literal for the '<em><b>Single Sample For References Table</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_REFERENCER__SINGLE_SAMPLE_FOR_REFERENCES_TABLE = eINSTANCE.getSingleReferencer_SingleSampleForReferencesTable();

		/**
		 * The meta object literal for the '<em><b>Single Sample Advanced References Table</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_REFERENCER__SINGLE_SAMPLE_ADVANCED_REFERENCES_TABLE = eINSTANCE.getSingleReferencer_SingleSampleAdvancedReferencesTable();

		/**
		 * The meta object literal for the '<em><b>Single Sample For Flat References Table</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_REFERENCER__SINGLE_SAMPLE_FOR_FLAT_REFERENCES_TABLE = eINSTANCE.getSingleReferencer_SingleSampleForFlatReferencesTable();

		/**
		 * The meta object literal for the '<em><b>Single Containment For EObject Flat Combo Viewer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_REFERENCER__SINGLE_CONTAINMENT_FOR_EOBJECT_FLAT_COMBO_VIEWER = eINSTANCE.getSingleReferencer_SingleContainmentForEObjectFlatComboViewer();

		/**
		 * The meta object literal for the '<em><b>Single Reference For EObject Flat Combo Viewer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_REFERENCER__SINGLE_REFERENCE_FOR_EOBJECT_FLAT_COMBO_VIEWER = eINSTANCE.getSingleReferencer_SingleReferenceForEObjectFlatComboViewer();

		/**
		 * The meta object literal for the '<em><b>Single Containment For Advanced EObject Flat Combo Viewer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_REFERENCER__SINGLE_CONTAINMENT_FOR_ADVANCED_EOBJECT_FLAT_COMBO_VIEWER = eINSTANCE.getSingleReferencer_SingleContainmentForAdvancedEObjectFlatComboViewer();

		/**
		 * The meta object literal for the '<em><b>Single Reference For Advanced EObject Flat Combo Viewer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_REFERENCER__SINGLE_REFERENCE_FOR_ADVANCED_EOBJECT_FLAT_COMBO_VIEWER = eINSTANCE.getSingleReferencer_SingleReferenceForAdvancedEObjectFlatComboViewer();

		/**
		 * The meta object literal for the '<em><b>Boolean Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_REFERENCER__BOOLEAN_ATTRIBUTE = eINSTANCE.getSingleReferencer_BooleanAttribute();

		/**
		 * The meta object literal for the '<em><b>Eenum Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_REFERENCER__EENUM_ATTRIBUTE = eINSTANCE.getSingleReferencer_EenumAttribute();

		/**
		 * The meta object literal for the '<em><b>String Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_REFERENCER__STRING_ATTRIBUTE = eINSTANCE.getSingleReferencer_StringAttribute();

		/**
		 * The meta object literal for the '<em><b>List Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_REFERENCER__LIST_ATTRIBUTE = eINSTANCE.getSingleReferencer_ListAttribute();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.eefnr.navigation.impl.AnotherSubTypeImpl <em>Another Sub Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.eefnr.navigation.impl.AnotherSubTypeImpl
		 * @see org.eclipse.emf.eef.eefnr.navigation.impl.NavigationPackageImpl#getAnotherSubType()
		 * @generated
		 */
		EClass ANOTHER_SUB_TYPE = eINSTANCE.getAnotherSubType();

		/**
		 * The meta object literal for the '<em><b>Another Specialisation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANOTHER_SUB_TYPE__ANOTHER_SPECIALISATION = eINSTANCE.getAnotherSubType_AnotherSpecialisation();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.eefnr.navigation.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.eefnr.navigation.impl.ElementImpl
		 * @see org.eclipse.emf.eef.eefnr.navigation.impl.NavigationPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__VISIBLE = eINSTANCE.getElement_Visible();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.eefnr.navigation.impl.AttributeNavigationSampleImpl <em>Attribute Navigation Sample</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.eefnr.navigation.impl.AttributeNavigationSampleImpl
		 * @see org.eclipse.emf.eef.eefnr.navigation.impl.NavigationPackageImpl#getAttributeNavigationSample()
		 * @generated
		 */
		EClass ATTRIBUTE_NAVIGATION_SAMPLE = eINSTANCE.getAttributeNavigationSample();

		/**
		 * The meta object literal for the '<em><b>Single Valued Attribute Delegate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_NAVIGATION_SAMPLE__SINGLE_VALUED_ATTRIBUTE_DELEGATE = eINSTANCE.getAttributeNavigationSample_SingleValuedAttributeDelegate();

		/**
		 * The meta object literal for the '<em><b>Multi Valued Attribute Delegate</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_NAVIGATION_SAMPLE__MULTI_VALUED_ATTRIBUTE_DELEGATE = eINSTANCE.getAttributeNavigationSample_MultiValuedAttributeDelegate();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.eefnr.navigation.impl.AttributeDelegateImpl <em>Attribute Delegate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.eefnr.navigation.impl.AttributeDelegateImpl
		 * @see org.eclipse.emf.eef.eefnr.navigation.impl.NavigationPackageImpl#getAttributeDelegate()
		 * @generated
		 */
		EClass ATTRIBUTE_DELEGATE = eINSTANCE.getAttributeDelegate();

		/**
		 * The meta object literal for the '<em><b>Delegate1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DELEGATE__DELEGATE1 = eINSTANCE.getAttributeDelegate_Delegate1();

		/**
		 * The meta object literal for the '<em><b>Delegate2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DELEGATE__DELEGATE2 = eINSTANCE.getAttributeDelegate_Delegate2();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.eefnr.navigation.impl.DeferedMultivaluedEditorSampleImpl <em>Defered Multivalued Editor Sample</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.eefnr.navigation.impl.DeferedMultivaluedEditorSampleImpl
		 * @see org.eclipse.emf.eef.eefnr.navigation.impl.NavigationPackageImpl#getDeferedMultivaluedEditorSample()
		 * @generated
		 */
		EClass DEFERED_MULTIVALUED_EDITOR_SAMPLE = eINSTANCE.getDeferedMultivaluedEditorSample();

		/**
		 * The meta object literal for the '<em><b>Defered Editor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFERED_MULTIVALUED_EDITOR_SAMPLE__DEFERED_EDITOR = eINSTANCE.getDeferedMultivaluedEditorSample_DeferedEditor();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.eefnr.navigation.impl.DeferedMultivaluedEditorImpl <em>Defered Multivalued Editor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.eefnr.navigation.impl.DeferedMultivaluedEditorImpl
		 * @see org.eclipse.emf.eef.eefnr.navigation.impl.NavigationPackageImpl#getDeferedMultivaluedEditor()
		 * @generated
		 */
		EClass DEFERED_MULTIVALUED_EDITOR = eINSTANCE.getDeferedMultivaluedEditor();

		/**
		 * The meta object literal for the '<em><b>Multi Valued Editor</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFERED_MULTIVALUED_EDITOR__MULTI_VALUED_EDITOR = eINSTANCE.getDeferedMultivaluedEditor_MultiValuedEditor();

	}

} //NavigationPackage
