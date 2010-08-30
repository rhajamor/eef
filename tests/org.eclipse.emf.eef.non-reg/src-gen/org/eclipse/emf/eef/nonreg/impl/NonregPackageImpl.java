/**
 * <copyright>
 * </copyright>
 *
 * $Id: NonregPackageImpl.java,v 1.4.4.1 2010/08/30 08:45:00 sbouchet Exp $
 */
package org.eclipse.emf.eef.nonreg.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.eef.ab.abstractnonreg.AbstractnonregPackage;
import org.eclipse.emf.eef.middle.middlenonreg.MiddlenonregPackage;
import org.eclipse.emf.eef.nonreg.Access;
import org.eclipse.emf.eef.nonreg.Adress;
import org.eclipse.emf.eef.nonreg.Company;
import org.eclipse.emf.eef.nonreg.EclipseSummit;
import org.eclipse.emf.eef.nonreg.NonregFactory;
import org.eclipse.emf.eef.nonreg.NonregPackage;
import org.eclipse.emf.eef.nonreg.Person;
import org.eclipse.emf.eef.nonreg.Site;
import org.eclipse.emf.eef.nonreg.Talk;
import org.eclipse.emf.eef.nonreg.Topic;
import org.eclipse.emf.eef.nonreg.modelNavigation.ModelNavigationPackage;
import org.eclipse.emf.eef.nonreg.modelNavigation.impl.ModelNavigationPackageImpl;
import org.eclipse.emf.eef.nonreg.subPackageNonRegForFilters.SubPackageNonRegForFiltersPackage;
import org.eclipse.emf.eef.nonreg.subPackageNonRegForFilters.impl.SubPackageNonRegForFiltersPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NonregPackageImpl extends EPackageImpl implements NonregPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eclipseSummitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass talkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass siteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass companyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adressEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum talK_TYPEEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum genderEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.emf.eef.nonreg.NonregPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private NonregPackageImpl() {
		super(eNS_URI, NonregFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static NonregPackage init() {
		if (isInited) return (NonregPackage)EPackage.Registry.INSTANCE.getEPackage(NonregPackage.eNS_URI);

		// Obtain or create and register package
		NonregPackageImpl theNonregPackage = (NonregPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof NonregPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new NonregPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		MiddlenonregPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		SubPackageNonRegForFiltersPackageImpl theSubPackageNonRegForFiltersPackage = (SubPackageNonRegForFiltersPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SubPackageNonRegForFiltersPackage.eNS_URI) instanceof SubPackageNonRegForFiltersPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SubPackageNonRegForFiltersPackage.eNS_URI) : SubPackageNonRegForFiltersPackage.eINSTANCE);
		ModelNavigationPackageImpl theModelNavigationPackage = (ModelNavigationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModelNavigationPackage.eNS_URI) instanceof ModelNavigationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModelNavigationPackage.eNS_URI) : ModelNavigationPackage.eINSTANCE);

		// Create package meta-data objects
		theNonregPackage.createPackageContents();
		theSubPackageNonRegForFiltersPackage.createPackageContents();
		theModelNavigationPackage.createPackageContents();

		// Initialize created meta-data
		theNonregPackage.initializePackageContents();
		theSubPackageNonRegForFiltersPackage.initializePackageContents();
		theModelNavigationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theNonregPackage.freeze();

		return theNonregPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEclipseSummit() {
		return eclipseSummitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEclipseSummit_Place() {
		return (EAttribute)eclipseSummitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEclipseSummit_Participants() {
		return (EReference)eclipseSummitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEclipseSummit_Talks() {
		return (EReference)eclipseSummitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEclipseSummit_Topics() {
		return (EReference)eclipseSummitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEclipseSummit_Sites() {
		return (EReference)eclipseSummitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEclipseSummit_Sponsors() {
		return (EReference)eclipseSummitEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Firstname() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Lastname() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Age() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_EclipseCommiter() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Assists() {
		return (EReference)personEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Gender() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_IsRegistered() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Accreditations() {
		return (EReference)personEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_WorkFor() {
		return (EReference)personEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTalk() {
		return talkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTalk_Title() {
		return (EAttribute)talkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTalk_Topic() {
		return (EReference)talkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTalk_Type() {
		return (EAttribute)talkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTalk_Presenter() {
		return (EReference)talkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTalk_Creator() {
		return (EReference)talkEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTopic() {
		return topicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopic_Description() {
		return (EAttribute)topicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopic_References() {
		return (EAttribute)topicEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSite() {
		return siteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccess() {
		return accessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccess_SiteAcceded() {
		return (EReference)accessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccess_Period() {
		return (EAttribute)accessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompany() {
		return companyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompany_Adress() {
		return (EReference)companyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdress() {
		return adressEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdress_PostalCode() {
		return (EAttribute)adressEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTALK_TYPE() {
		return talK_TYPEEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGENDER() {
		return genderEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonregFactory getNonregFactory() {
		return (NonregFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		eclipseSummitEClass = createEClass(ECLIPSE_SUMMIT);
		createEAttribute(eclipseSummitEClass, ECLIPSE_SUMMIT__PLACE);
		createEReference(eclipseSummitEClass, ECLIPSE_SUMMIT__PARTICIPANTS);
		createEReference(eclipseSummitEClass, ECLIPSE_SUMMIT__TALKS);
		createEReference(eclipseSummitEClass, ECLIPSE_SUMMIT__TOPICS);
		createEReference(eclipseSummitEClass, ECLIPSE_SUMMIT__SITES);
		createEReference(eclipseSummitEClass, ECLIPSE_SUMMIT__SPONSORS);

		personEClass = createEClass(PERSON);
		createEAttribute(personEClass, PERSON__FIRSTNAME);
		createEAttribute(personEClass, PERSON__LASTNAME);
		createEAttribute(personEClass, PERSON__AGE);
		createEAttribute(personEClass, PERSON__ECLIPSE_COMMITER);
		createEReference(personEClass, PERSON__ASSISTS);
		createEAttribute(personEClass, PERSON__GENDER);
		createEAttribute(personEClass, PERSON__IS_REGISTERED);
		createEReference(personEClass, PERSON__ACCREDITATIONS);
		createEReference(personEClass, PERSON__WORK_FOR);

		talkEClass = createEClass(TALK);
		createEAttribute(talkEClass, TALK__TITLE);
		createEReference(talkEClass, TALK__TOPIC);
		createEAttribute(talkEClass, TALK__TYPE);
		createEReference(talkEClass, TALK__PRESENTER);
		createEReference(talkEClass, TALK__CREATOR);

		topicEClass = createEClass(TOPIC);
		createEAttribute(topicEClass, TOPIC__DESCRIPTION);
		createEAttribute(topicEClass, TOPIC__REFERENCES);

		siteEClass = createEClass(SITE);

		accessEClass = createEClass(ACCESS);
		createEReference(accessEClass, ACCESS__SITE_ACCEDED);
		createEAttribute(accessEClass, ACCESS__PERIOD);

		companyEClass = createEClass(COMPANY);
		createEReference(companyEClass, COMPANY__ADRESS);

		adressEClass = createEClass(ADRESS);
		createEAttribute(adressEClass, ADRESS__POSTAL_CODE);

		// Create enums
		talK_TYPEEEnum = createEEnum(TALK_TYPE);
		genderEEnum = createEEnum(GENDER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		SubPackageNonRegForFiltersPackage theSubPackageNonRegForFiltersPackage = (SubPackageNonRegForFiltersPackage)EPackage.Registry.INSTANCE.getEPackage(SubPackageNonRegForFiltersPackage.eNS_URI);
		ModelNavigationPackage theModelNavigationPackage = (ModelNavigationPackage)EPackage.Registry.INSTANCE.getEPackage(ModelNavigationPackage.eNS_URI);
		AbstractnonregPackage theAbstractnonregPackage = (AbstractnonregPackage)EPackage.Registry.INSTANCE.getEPackage(AbstractnonregPackage.eNS_URI);
		MiddlenonregPackage theMiddlenonregPackage = (MiddlenonregPackage)EPackage.Registry.INSTANCE.getEPackage(MiddlenonregPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theSubPackageNonRegForFiltersPackage);
		getESubpackages().add(theModelNavigationPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		talkEClass.getESuperTypes().add(theAbstractnonregPackage.getDocumentedElement());
		topicEClass.getESuperTypes().add(theAbstractnonregPackage.getDocumentedElement());
		siteEClass.getESuperTypes().add(theMiddlenonregPackage.getNamedElement());
		companyEClass.getESuperTypes().add(theMiddlenonregPackage.getNamedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(eclipseSummitEClass, EclipseSummit.class, "EclipseSummit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEclipseSummit_Place(), ecorePackage.getEString(), "place", null, 1, 1, EclipseSummit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEclipseSummit_Participants(), this.getPerson(), null, "participants", null, 0, -1, EclipseSummit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEclipseSummit_Talks(), this.getTalk(), null, "talks", null, 0, -1, EclipseSummit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEclipseSummit_Topics(), this.getTopic(), null, "topics", null, 0, -1, EclipseSummit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEclipseSummit_Sites(), this.getSite(), null, "sites", null, 0, -1, EclipseSummit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEclipseSummit_Sponsors(), this.getCompany(), null, "sponsors", null, 0, 1, EclipseSummit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerson_Firstname(), ecorePackage.getEString(), "firstname", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Lastname(), ecorePackage.getEString(), "lastname", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Age(), ecorePackage.getEInt(), "age", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_EclipseCommiter(), ecorePackage.getEBoolean(), "eclipseCommiter", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_Assists(), this.getTalk(), null, "assists", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Gender(), this.getGENDER(), "gender", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_IsRegistered(), ecorePackage.getEBoolean(), "isRegistered", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_Accreditations(), this.getAccess(), null, "accreditations", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_WorkFor(), this.getCompany(), null, "workFor", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(talkEClass, Talk.class, "Talk", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTalk_Title(), ecorePackage.getEString(), "title", null, 1, 1, Talk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTalk_Topic(), this.getTopic(), null, "topic", null, 1, 1, Talk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTalk_Type(), this.getTALK_TYPE(), "type", null, 0, 1, Talk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTalk_Presenter(), this.getPerson(), null, "presenter", null, 1, 1, Talk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTalk_Creator(), this.getPerson(), null, "creator", null, 0, 1, Talk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(topicEClass, Topic.class, "Topic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTopic_Description(), ecorePackage.getEString(), "description", null, 0, 1, Topic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTopic_References(), ecorePackage.getEString(), "references", null, 0, -1, Topic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(siteEClass, Site.class, "Site", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(accessEClass, Access.class, "Access", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAccess_SiteAcceded(), this.getSite(), null, "siteAcceded", null, 1, 1, Access.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccess_Period(), ecorePackage.getEDouble(), "Period", null, 0, 1, Access.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(companyEClass, Company.class, "Company", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompany_Adress(), this.getAdress(), null, "adress", null, 0, 1, Company.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adressEClass, Adress.class, "Adress", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdress_PostalCode(), ecorePackage.getEInt(), "postalCode", null, 1, 1, Adress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(talK_TYPEEEnum, org.eclipse.emf.eef.nonreg.TALK_TYPE.class, "TALK_TYPE");
		addEEnumLiteral(talK_TYPEEEnum, org.eclipse.emf.eef.nonreg.TALK_TYPE.WORKSHOP);
		addEEnumLiteral(talK_TYPEEEnum, org.eclipse.emf.eef.nonreg.TALK_TYPE.DEMONSTRATION);
		addEEnumLiteral(talK_TYPEEEnum, org.eclipse.emf.eef.nonreg.TALK_TYPE.CONFERENCE);

		initEEnum(genderEEnum, org.eclipse.emf.eef.nonreg.GENDER.class, "GENDER");
		addEEnumLiteral(genderEEnum, org.eclipse.emf.eef.nonreg.GENDER.MALE);
		addEEnumLiteral(genderEEnum, org.eclipse.emf.eef.nonreg.GENDER.FEMALE);
		addEEnumLiteral(genderEEnum, org.eclipse.emf.eef.nonreg.GENDER.UNKNOWN);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// genConstraint
		createGenConstraintAnnotations();
	}

	/**
	 * Initializes the annotations for <b>genConstraint</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenConstraintAnnotations() {
		String source = "genConstraint";		
		addAnnotation
		  (getTalk_Presenter(), 
		   source, 
		   new String[] {
			 "significant", "true"
		   });
	}

} //NonregPackageImpl
