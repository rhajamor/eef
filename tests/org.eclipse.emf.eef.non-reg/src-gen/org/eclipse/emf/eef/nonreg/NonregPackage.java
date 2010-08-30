/**
 * <copyright>
 * </copyright>
 *
 * $Id: NonregPackage.java,v 1.4.4.1 2010/08/30 08:45:00 sbouchet Exp $
 */
package org.eclipse.emf.eef.nonreg;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.eef.ab.abstractnonreg.AbstractnonregPackage;
import org.eclipse.emf.eef.middle.middlenonreg.MiddlenonregPackage;

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
 * @see org.eclipse.emf.eef.nonreg.NonregFactory
 * @model kind="package"
 * @generated
 */
public interface NonregPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "nonreg";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/properties/1.0.0/NonReg";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "empf-nonreg";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NonregPackage eINSTANCE = org.eclipse.emf.eef.nonreg.impl.NonregPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.nonreg.impl.EclipseSummitImpl <em>Eclipse Summit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.nonreg.impl.EclipseSummitImpl
	 * @see org.eclipse.emf.eef.nonreg.impl.NonregPackageImpl#getEclipseSummit()
	 * @generated
	 */
	int ECLIPSE_SUMMIT = 0;

	/**
	 * The feature id for the '<em><b>Place</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLIPSE_SUMMIT__PLACE = 0;

	/**
	 * The feature id for the '<em><b>Participants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLIPSE_SUMMIT__PARTICIPANTS = 1;

	/**
	 * The feature id for the '<em><b>Talks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLIPSE_SUMMIT__TALKS = 2;

	/**
	 * The feature id for the '<em><b>Topics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLIPSE_SUMMIT__TOPICS = 3;

	/**
	 * The feature id for the '<em><b>Sites</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLIPSE_SUMMIT__SITES = 4;

	/**
	 * The feature id for the '<em><b>Sponsors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLIPSE_SUMMIT__SPONSORS = 5;

	/**
	 * The number of structural features of the '<em>Eclipse Summit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLIPSE_SUMMIT_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.nonreg.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.nonreg.impl.PersonImpl
	 * @see org.eclipse.emf.eef.nonreg.impl.NonregPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 1;

	/**
	 * The feature id for the '<em><b>Firstname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__FIRSTNAME = 0;

	/**
	 * The feature id for the '<em><b>Lastname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LASTNAME = 1;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__AGE = 2;

	/**
	 * The feature id for the '<em><b>Eclipse Commiter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ECLIPSE_COMMITER = 3;

	/**
	 * The feature id for the '<em><b>Assists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ASSISTS = 4;

	/**
	 * The feature id for the '<em><b>Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__GENDER = 5;

	/**
	 * The feature id for the '<em><b>Is Registered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__IS_REGISTERED = 6;

	/**
	 * The feature id for the '<em><b>Accreditations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ACCREDITATIONS = 7;

	/**
	 * The feature id for the '<em><b>Work For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__WORK_FOR = 8;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.nonreg.impl.TalkImpl <em>Talk</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.nonreg.impl.TalkImpl
	 * @see org.eclipse.emf.eef.nonreg.impl.NonregPackageImpl#getTalk()
	 * @generated
	 */
	int TALK = 2;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TALK__DOCUMENTATION = AbstractnonregPackage.DOCUMENTED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TALK__TITLE = AbstractnonregPackage.DOCUMENTED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TALK__TOPIC = AbstractnonregPackage.DOCUMENTED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TALK__TYPE = AbstractnonregPackage.DOCUMENTED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Presenter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TALK__PRESENTER = AbstractnonregPackage.DOCUMENTED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TALK__CREATOR = AbstractnonregPackage.DOCUMENTED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Talk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TALK_FEATURE_COUNT = AbstractnonregPackage.DOCUMENTED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.nonreg.impl.TopicImpl <em>Topic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.nonreg.impl.TopicImpl
	 * @see org.eclipse.emf.eef.nonreg.impl.NonregPackageImpl#getTopic()
	 * @generated
	 */
	int TOPIC = 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC__DOCUMENTATION = AbstractnonregPackage.DOCUMENTED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC__DESCRIPTION = AbstractnonregPackage.DOCUMENTED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>References</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC__REFERENCES = AbstractnonregPackage.DOCUMENTED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Topic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_FEATURE_COUNT = AbstractnonregPackage.DOCUMENTED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.nonreg.impl.SiteImpl <em>Site</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.nonreg.impl.SiteImpl
	 * @see org.eclipse.emf.eef.nonreg.impl.NonregPackageImpl#getSite()
	 * @generated
	 */
	int SITE = 4;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__DOCUMENTATION = MiddlenonregPackage.NAMED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__NAME = MiddlenonregPackage.NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Site</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_FEATURE_COUNT = MiddlenonregPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.nonreg.impl.AccessImpl <em>Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.nonreg.impl.AccessImpl
	 * @see org.eclipse.emf.eef.nonreg.impl.NonregPackageImpl#getAccess()
	 * @generated
	 */
	int ACCESS = 5;

	/**
	 * The feature id for the '<em><b>Site Acceded</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS__SITE_ACCEDED = 0;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS__PERIOD = 1;

	/**
	 * The number of structural features of the '<em>Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.nonreg.impl.CompanyImpl <em>Company</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.nonreg.impl.CompanyImpl
	 * @see org.eclipse.emf.eef.nonreg.impl.NonregPackageImpl#getCompany()
	 * @generated
	 */
	int COMPANY = 6;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY__DOCUMENTATION = MiddlenonregPackage.NAMED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY__NAME = MiddlenonregPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Adress</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY__ADRESS = MiddlenonregPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Company</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY_FEATURE_COUNT = MiddlenonregPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.nonreg.impl.AdressImpl <em>Adress</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.nonreg.impl.AdressImpl
	 * @see org.eclipse.emf.eef.nonreg.impl.NonregPackageImpl#getAdress()
	 * @generated
	 */
	int ADRESS = 7;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADRESS__POSTAL_CODE = 0;

	/**
	 * The number of structural features of the '<em>Adress</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADRESS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.nonreg.TALK_TYPE <em>TALK TYPE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.nonreg.TALK_TYPE
	 * @see org.eclipse.emf.eef.nonreg.impl.NonregPackageImpl#getTALK_TYPE()
	 * @generated
	 */
	int TALK_TYPE = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.nonreg.GENDER <em>GENDER</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.nonreg.GENDER
	 * @see org.eclipse.emf.eef.nonreg.impl.NonregPackageImpl#getGENDER()
	 * @generated
	 */
	int GENDER = 9;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.nonreg.EclipseSummit <em>Eclipse Summit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eclipse Summit</em>'.
	 * @see org.eclipse.emf.eef.nonreg.EclipseSummit
	 * @generated
	 */
	EClass getEclipseSummit();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.nonreg.EclipseSummit#getPlace <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Place</em>'.
	 * @see org.eclipse.emf.eef.nonreg.EclipseSummit#getPlace()
	 * @see #getEclipseSummit()
	 * @generated
	 */
	EAttribute getEclipseSummit_Place();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.eef.nonreg.EclipseSummit#getParticipants <em>Participants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Participants</em>'.
	 * @see org.eclipse.emf.eef.nonreg.EclipseSummit#getParticipants()
	 * @see #getEclipseSummit()
	 * @generated
	 */
	EReference getEclipseSummit_Participants();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.eef.nonreg.EclipseSummit#getTalks <em>Talks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Talks</em>'.
	 * @see org.eclipse.emf.eef.nonreg.EclipseSummit#getTalks()
	 * @see #getEclipseSummit()
	 * @generated
	 */
	EReference getEclipseSummit_Talks();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.eef.nonreg.EclipseSummit#getTopics <em>Topics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Topics</em>'.
	 * @see org.eclipse.emf.eef.nonreg.EclipseSummit#getTopics()
	 * @see #getEclipseSummit()
	 * @generated
	 */
	EReference getEclipseSummit_Topics();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.eef.nonreg.EclipseSummit#getSites <em>Sites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sites</em>'.
	 * @see org.eclipse.emf.eef.nonreg.EclipseSummit#getSites()
	 * @see #getEclipseSummit()
	 * @generated
	 */
	EReference getEclipseSummit_Sites();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.eef.nonreg.EclipseSummit#getSponsors <em>Sponsors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sponsors</em>'.
	 * @see org.eclipse.emf.eef.nonreg.EclipseSummit#getSponsors()
	 * @see #getEclipseSummit()
	 * @generated
	 */
	EReference getEclipseSummit_Sponsors();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.nonreg.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see org.eclipse.emf.eef.nonreg.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.nonreg.Person#getFirstname <em>Firstname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Firstname</em>'.
	 * @see org.eclipse.emf.eef.nonreg.Person#getFirstname()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Firstname();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.nonreg.Person#getLastname <em>Lastname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lastname</em>'.
	 * @see org.eclipse.emf.eef.nonreg.Person#getLastname()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Lastname();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.nonreg.Person#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age</em>'.
	 * @see org.eclipse.emf.eef.nonreg.Person#getAge()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Age();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.nonreg.Person#isEclipseCommiter <em>Eclipse Commiter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eclipse Commiter</em>'.
	 * @see org.eclipse.emf.eef.nonreg.Person#isEclipseCommiter()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_EclipseCommiter();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.eef.nonreg.Person#getAssists <em>Assists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assists</em>'.
	 * @see org.eclipse.emf.eef.nonreg.Person#getAssists()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Assists();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.nonreg.Person#getGender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gender</em>'.
	 * @see org.eclipse.emf.eef.nonreg.Person#getGender()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Gender();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.nonreg.Person#isIsRegistered <em>Is Registered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Registered</em>'.
	 * @see org.eclipse.emf.eef.nonreg.Person#isIsRegistered()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_IsRegistered();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.eef.nonreg.Person#getAccreditations <em>Accreditations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Accreditations</em>'.
	 * @see org.eclipse.emf.eef.nonreg.Person#getAccreditations()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Accreditations();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.eef.nonreg.Person#getWorkFor <em>Work For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work For</em>'.
	 * @see org.eclipse.emf.eef.nonreg.Person#getWorkFor()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_WorkFor();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.nonreg.Talk <em>Talk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Talk</em>'.
	 * @see org.eclipse.emf.eef.nonreg.Talk
	 * @generated
	 */
	EClass getTalk();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.nonreg.Talk#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.emf.eef.nonreg.Talk#getTitle()
	 * @see #getTalk()
	 * @generated
	 */
	EAttribute getTalk_Title();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.eef.nonreg.Talk#getTopic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Topic</em>'.
	 * @see org.eclipse.emf.eef.nonreg.Talk#getTopic()
	 * @see #getTalk()
	 * @generated
	 */
	EReference getTalk_Topic();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.nonreg.Talk#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.emf.eef.nonreg.Talk#getType()
	 * @see #getTalk()
	 * @generated
	 */
	EAttribute getTalk_Type();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.eef.nonreg.Talk#getPresenter <em>Presenter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Presenter</em>'.
	 * @see org.eclipse.emf.eef.nonreg.Talk#getPresenter()
	 * @see #getTalk()
	 * @generated
	 */
	EReference getTalk_Presenter();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.eef.nonreg.Talk#getCreator <em>Creator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Creator</em>'.
	 * @see org.eclipse.emf.eef.nonreg.Talk#getCreator()
	 * @see #getTalk()
	 * @generated
	 */
	EReference getTalk_Creator();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.nonreg.Topic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Topic</em>'.
	 * @see org.eclipse.emf.eef.nonreg.Topic
	 * @generated
	 */
	EClass getTopic();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.nonreg.Topic#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.emf.eef.nonreg.Topic#getDescription()
	 * @see #getTopic()
	 * @generated
	 */
	EAttribute getTopic_Description();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.eef.nonreg.Topic#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>References</em>'.
	 * @see org.eclipse.emf.eef.nonreg.Topic#getReferences()
	 * @see #getTopic()
	 * @generated
	 */
	EAttribute getTopic_References();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.nonreg.Site <em>Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Site</em>'.
	 * @see org.eclipse.emf.eef.nonreg.Site
	 * @generated
	 */
	EClass getSite();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.nonreg.Access <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access</em>'.
	 * @see org.eclipse.emf.eef.nonreg.Access
	 * @generated
	 */
	EClass getAccess();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.eef.nonreg.Access#getSiteAcceded <em>Site Acceded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Site Acceded</em>'.
	 * @see org.eclipse.emf.eef.nonreg.Access#getSiteAcceded()
	 * @see #getAccess()
	 * @generated
	 */
	EReference getAccess_SiteAcceded();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.nonreg.Access#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see org.eclipse.emf.eef.nonreg.Access#getPeriod()
	 * @see #getAccess()
	 * @generated
	 */
	EAttribute getAccess_Period();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.nonreg.Company <em>Company</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Company</em>'.
	 * @see org.eclipse.emf.eef.nonreg.Company
	 * @generated
	 */
	EClass getCompany();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.eef.nonreg.Company#getAdress <em>Adress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Adress</em>'.
	 * @see org.eclipse.emf.eef.nonreg.Company#getAdress()
	 * @see #getCompany()
	 * @generated
	 */
	EReference getCompany_Adress();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.nonreg.Adress <em>Adress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adress</em>'.
	 * @see org.eclipse.emf.eef.nonreg.Adress
	 * @generated
	 */
	EClass getAdress();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.nonreg.Adress#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postal Code</em>'.
	 * @see org.eclipse.emf.eef.nonreg.Adress#getPostalCode()
	 * @see #getAdress()
	 * @generated
	 */
	EAttribute getAdress_PostalCode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.eef.nonreg.TALK_TYPE <em>TALK TYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TALK TYPE</em>'.
	 * @see org.eclipse.emf.eef.nonreg.TALK_TYPE
	 * @generated
	 */
	EEnum getTALK_TYPE();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.eef.nonreg.GENDER <em>GENDER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GENDER</em>'.
	 * @see org.eclipse.emf.eef.nonreg.GENDER
	 * @generated
	 */
	EEnum getGENDER();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NonregFactory getNonregFactory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.eef.nonreg.impl.EclipseSummitImpl <em>Eclipse Summit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.nonreg.impl.EclipseSummitImpl
		 * @see org.eclipse.emf.eef.nonreg.impl.NonregPackageImpl#getEclipseSummit()
		 * @generated
		 */
		EClass ECLIPSE_SUMMIT = eINSTANCE.getEclipseSummit();

		/**
		 * The meta object literal for the '<em><b>Place</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECLIPSE_SUMMIT__PLACE = eINSTANCE.getEclipseSummit_Place();

		/**
		 * The meta object literal for the '<em><b>Participants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLIPSE_SUMMIT__PARTICIPANTS = eINSTANCE.getEclipseSummit_Participants();

		/**
		 * The meta object literal for the '<em><b>Talks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLIPSE_SUMMIT__TALKS = eINSTANCE.getEclipseSummit_Talks();

		/**
		 * The meta object literal for the '<em><b>Topics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLIPSE_SUMMIT__TOPICS = eINSTANCE.getEclipseSummit_Topics();

		/**
		 * The meta object literal for the '<em><b>Sites</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLIPSE_SUMMIT__SITES = eINSTANCE.getEclipseSummit_Sites();

		/**
		 * The meta object literal for the '<em><b>Sponsors</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLIPSE_SUMMIT__SPONSORS = eINSTANCE.getEclipseSummit_Sponsors();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.nonreg.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.nonreg.impl.PersonImpl
		 * @see org.eclipse.emf.eef.nonreg.impl.NonregPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Firstname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__FIRSTNAME = eINSTANCE.getPerson_Firstname();

		/**
		 * The meta object literal for the '<em><b>Lastname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__LASTNAME = eINSTANCE.getPerson_Lastname();

		/**
		 * The meta object literal for the '<em><b>Age</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__AGE = eINSTANCE.getPerson_Age();

		/**
		 * The meta object literal for the '<em><b>Eclipse Commiter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__ECLIPSE_COMMITER = eINSTANCE.getPerson_EclipseCommiter();

		/**
		 * The meta object literal for the '<em><b>Assists</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__ASSISTS = eINSTANCE.getPerson_Assists();

		/**
		 * The meta object literal for the '<em><b>Gender</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__GENDER = eINSTANCE.getPerson_Gender();

		/**
		 * The meta object literal for the '<em><b>Is Registered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__IS_REGISTERED = eINSTANCE.getPerson_IsRegistered();

		/**
		 * The meta object literal for the '<em><b>Accreditations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__ACCREDITATIONS = eINSTANCE.getPerson_Accreditations();

		/**
		 * The meta object literal for the '<em><b>Work For</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__WORK_FOR = eINSTANCE.getPerson_WorkFor();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.nonreg.impl.TalkImpl <em>Talk</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.nonreg.impl.TalkImpl
		 * @see org.eclipse.emf.eef.nonreg.impl.NonregPackageImpl#getTalk()
		 * @generated
		 */
		EClass TALK = eINSTANCE.getTalk();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TALK__TITLE = eINSTANCE.getTalk_Title();

		/**
		 * The meta object literal for the '<em><b>Topic</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TALK__TOPIC = eINSTANCE.getTalk_Topic();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TALK__TYPE = eINSTANCE.getTalk_Type();

		/**
		 * The meta object literal for the '<em><b>Presenter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TALK__PRESENTER = eINSTANCE.getTalk_Presenter();

		/**
		 * The meta object literal for the '<em><b>Creator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TALK__CREATOR = eINSTANCE.getTalk_Creator();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.nonreg.impl.TopicImpl <em>Topic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.nonreg.impl.TopicImpl
		 * @see org.eclipse.emf.eef.nonreg.impl.NonregPackageImpl#getTopic()
		 * @generated
		 */
		EClass TOPIC = eINSTANCE.getTopic();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOPIC__DESCRIPTION = eINSTANCE.getTopic_Description();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOPIC__REFERENCES = eINSTANCE.getTopic_References();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.nonreg.impl.SiteImpl <em>Site</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.nonreg.impl.SiteImpl
		 * @see org.eclipse.emf.eef.nonreg.impl.NonregPackageImpl#getSite()
		 * @generated
		 */
		EClass SITE = eINSTANCE.getSite();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.nonreg.impl.AccessImpl <em>Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.nonreg.impl.AccessImpl
		 * @see org.eclipse.emf.eef.nonreg.impl.NonregPackageImpl#getAccess()
		 * @generated
		 */
		EClass ACCESS = eINSTANCE.getAccess();

		/**
		 * The meta object literal for the '<em><b>Site Acceded</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS__SITE_ACCEDED = eINSTANCE.getAccess_SiteAcceded();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS__PERIOD = eINSTANCE.getAccess_Period();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.nonreg.impl.CompanyImpl <em>Company</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.nonreg.impl.CompanyImpl
		 * @see org.eclipse.emf.eef.nonreg.impl.NonregPackageImpl#getCompany()
		 * @generated
		 */
		EClass COMPANY = eINSTANCE.getCompany();

		/**
		 * The meta object literal for the '<em><b>Adress</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPANY__ADRESS = eINSTANCE.getCompany_Adress();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.nonreg.impl.AdressImpl <em>Adress</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.nonreg.impl.AdressImpl
		 * @see org.eclipse.emf.eef.nonreg.impl.NonregPackageImpl#getAdress()
		 * @generated
		 */
		EClass ADRESS = eINSTANCE.getAdress();

		/**
		 * The meta object literal for the '<em><b>Postal Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADRESS__POSTAL_CODE = eINSTANCE.getAdress_PostalCode();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.nonreg.TALK_TYPE <em>TALK TYPE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.nonreg.TALK_TYPE
		 * @see org.eclipse.emf.eef.nonreg.impl.NonregPackageImpl#getTALK_TYPE()
		 * @generated
		 */
		EEnum TALK_TYPE = eINSTANCE.getTALK_TYPE();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.nonreg.GENDER <em>GENDER</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.nonreg.GENDER
		 * @see org.eclipse.emf.eef.nonreg.impl.NonregPackageImpl#getGENDER()
		 * @generated
		 */
		EEnum GENDER = eINSTANCE.getGENDER();

	}

} //NonregPackage
