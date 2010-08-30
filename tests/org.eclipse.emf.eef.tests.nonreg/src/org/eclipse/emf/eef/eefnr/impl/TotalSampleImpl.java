/**
 * <copyright>
 * </copyright>
 *
 * $Id: TotalSampleImpl.java,v 1.3.2.2 2010/08/30 08:48:24 sbouchet Exp $
 */
package org.eclipse.emf.eef.eefnr.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.eef.eefnr.ENUM_SAMPLE;
import org.eclipse.emf.eef.eefnr.EefnrPackage;
import org.eclipse.emf.eef.eefnr.Sample;
import org.eclipse.emf.eef.eefnr.TotalSample;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Total Sample</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.eefnr.impl.TotalSampleImpl#getTextRequiredProperty <em>Text Required Property</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.impl.TotalSampleImpl#getTextOptionalProperty <em>Text Optional Property</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.impl.TotalSampleImpl#isCheckboxRequiredProperty <em>Checkbox Required Property</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.impl.TotalSampleImpl#isCheckboxOptionalProperty <em>Checkbox Optional Property</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.impl.TotalSampleImpl#getTextareaRequiredProperty <em>Textarea Required Property</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.impl.TotalSampleImpl#getTextareaOptionalProperty <em>Textarea Optional Property</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.impl.TotalSampleImpl#getRadioRequiredProperty <em>Radio Required Property</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.impl.TotalSampleImpl#getRadioOptionalProperty <em>Radio Optional Property</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.impl.TotalSampleImpl#getEobjectflatcomboviewerRequiredProperty <em>Eobjectflatcomboviewer Required Property</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.impl.TotalSampleImpl#getEobjectflatcomboviewerOptionalProperty <em>Eobjectflatcomboviewer Optional Property</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.impl.TotalSampleImpl#getReferencestableRequiredProperty <em>Referencestable Required Property</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.impl.TotalSampleImpl#getReferencestableOptionalProperty <em>Referencestable Optional Property</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.impl.TotalSampleImpl#getEmfcomboviewerRequiredProperty <em>Emfcomboviewer Required Property</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.impl.TotalSampleImpl#getEmfcomboviewerOptionalProperty <em>Emfcomboviewer Optional Property</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.impl.TotalSampleImpl#getMultivaluededitorRequiredProperty <em>Multivaluededitor Required Property</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.impl.TotalSampleImpl#getMultivaluededitorOptionalProperty <em>Multivaluededitor Optional Property</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.impl.TotalSampleImpl#getTablecompositionOnSameTypeOptionalProperty <em>Tablecomposition On Same Type Optional Property</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.impl.TotalSampleImpl#getAdvancedreferencestableRequiredProperty <em>Advancedreferencestable Required Property</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.impl.TotalSampleImpl#getAdvancedreferencestableOptionalProperty <em>Advancedreferencestable Optional Property</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.impl.TotalSampleImpl#getAdvancedeobjectflatcomboviewerRequiredPropery <em>Advancedeobjectflatcomboviewer Required Propery</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.impl.TotalSampleImpl#getAdvancedeobjectflatcomboviewerOptionalPropery <em>Advancedeobjectflatcomboviewer Optional Propery</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.impl.TotalSampleImpl#getAdvancedtablecompositionOnSametypeOptionalProperty <em>Advancedtablecomposition On Sametype Optional Property</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.impl.TotalSampleImpl#getAdvancedtablecompositionRequiredProperty <em>Advancedtablecomposition Required Property</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.impl.TotalSampleImpl#getAdvancedtablecompositionOptionalProperty <em>Advancedtablecomposition Optional Property</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.impl.TotalSampleImpl#getTablecompositionRequiredProperty <em>Tablecomposition Required Property</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.impl.TotalSampleImpl#getTablecompositionOptionalProperty <em>Tablecomposition Optional Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TotalSampleImpl extends AbstractSampleImpl implements TotalSample {
	/**
	 * The default value of the '{@link #getTextRequiredProperty() <em>Text Required Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextRequiredProperty()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_REQUIRED_PROPERTY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextRequiredProperty() <em>Text Required Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextRequiredProperty()
	 * @generated
	 * @ordered
	 */
	protected String textRequiredProperty = TEXT_REQUIRED_PROPERTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextOptionalProperty() <em>Text Optional Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextOptionalProperty()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_OPTIONAL_PROPERTY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextOptionalProperty() <em>Text Optional Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextOptionalProperty()
	 * @generated
	 * @ordered
	 */
	protected String textOptionalProperty = TEXT_OPTIONAL_PROPERTY_EDEFAULT;

	/**
	 * The default value of the '{@link #isCheckboxRequiredProperty() <em>Checkbox Required Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckboxRequiredProperty()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHECKBOX_REQUIRED_PROPERTY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCheckboxRequiredProperty() <em>Checkbox Required Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckboxRequiredProperty()
	 * @generated
	 * @ordered
	 */
	protected boolean checkboxRequiredProperty = CHECKBOX_REQUIRED_PROPERTY_EDEFAULT;

	/**
	 * The default value of the '{@link #isCheckboxOptionalProperty() <em>Checkbox Optional Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckboxOptionalProperty()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHECKBOX_OPTIONAL_PROPERTY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCheckboxOptionalProperty() <em>Checkbox Optional Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckboxOptionalProperty()
	 * @generated
	 * @ordered
	 */
	protected boolean checkboxOptionalProperty = CHECKBOX_OPTIONAL_PROPERTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextareaRequiredProperty() <em>Textarea Required Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextareaRequiredProperty()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXTAREA_REQUIRED_PROPERTY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextareaRequiredProperty() <em>Textarea Required Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextareaRequiredProperty()
	 * @generated
	 * @ordered
	 */
	protected String textareaRequiredProperty = TEXTAREA_REQUIRED_PROPERTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextareaOptionalProperty() <em>Textarea Optional Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextareaOptionalProperty()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXTAREA_OPTIONAL_PROPERTY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextareaOptionalProperty() <em>Textarea Optional Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextareaOptionalProperty()
	 * @generated
	 * @ordered
	 */
	protected String textareaOptionalProperty = TEXTAREA_OPTIONAL_PROPERTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRadioRequiredProperty() <em>Radio Required Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadioRequiredProperty()
	 * @generated
	 * @ordered
	 */
	protected static final ENUM_SAMPLE RADIO_REQUIRED_PROPERTY_EDEFAULT = ENUM_SAMPLE.LITERAL1;

	/**
	 * The cached value of the '{@link #getRadioRequiredProperty() <em>Radio Required Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadioRequiredProperty()
	 * @generated
	 * @ordered
	 */
	protected ENUM_SAMPLE radioRequiredProperty = RADIO_REQUIRED_PROPERTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRadioOptionalProperty() <em>Radio Optional Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadioOptionalProperty()
	 * @generated
	 * @ordered
	 */
	protected static final ENUM_SAMPLE RADIO_OPTIONAL_PROPERTY_EDEFAULT = ENUM_SAMPLE.LITERAL1;

	/**
	 * The cached value of the '{@link #getRadioOptionalProperty() <em>Radio Optional Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadioOptionalProperty()
	 * @generated
	 * @ordered
	 */
	protected ENUM_SAMPLE radioOptionalProperty = RADIO_OPTIONAL_PROPERTY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEobjectflatcomboviewerRequiredProperty() <em>Eobjectflatcomboviewer Required Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEobjectflatcomboviewerRequiredProperty()
	 * @generated
	 * @ordered
	 */
	protected TotalSample eobjectflatcomboviewerRequiredProperty;

	/**
	 * The cached value of the '{@link #getEobjectflatcomboviewerOptionalProperty() <em>Eobjectflatcomboviewer Optional Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEobjectflatcomboviewerOptionalProperty()
	 * @generated
	 * @ordered
	 */
	protected TotalSample eobjectflatcomboviewerOptionalProperty;

	/**
	 * The cached value of the '{@link #getReferencestableRequiredProperty() <em>Referencestable Required Property</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencestableRequiredProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<TotalSample> referencestableRequiredProperty;

	/**
	 * The cached value of the '{@link #getReferencestableOptionalProperty() <em>Referencestable Optional Property</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencestableOptionalProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<TotalSample> referencestableOptionalProperty;

	/**
	 * The default value of the '{@link #getEmfcomboviewerRequiredProperty() <em>Emfcomboviewer Required Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmfcomboviewerRequiredProperty()
	 * @generated
	 * @ordered
	 */
	protected static final ENUM_SAMPLE EMFCOMBOVIEWER_REQUIRED_PROPERTY_EDEFAULT = ENUM_SAMPLE.LITERAL1;

	/**
	 * The cached value of the '{@link #getEmfcomboviewerRequiredProperty() <em>Emfcomboviewer Required Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmfcomboviewerRequiredProperty()
	 * @generated
	 * @ordered
	 */
	protected ENUM_SAMPLE emfcomboviewerRequiredProperty = EMFCOMBOVIEWER_REQUIRED_PROPERTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmfcomboviewerOptionalProperty() <em>Emfcomboviewer Optional Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmfcomboviewerOptionalProperty()
	 * @generated
	 * @ordered
	 */
	protected static final ENUM_SAMPLE EMFCOMBOVIEWER_OPTIONAL_PROPERTY_EDEFAULT = ENUM_SAMPLE.LITERAL1;

	/**
	 * The cached value of the '{@link #getEmfcomboviewerOptionalProperty() <em>Emfcomboviewer Optional Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmfcomboviewerOptionalProperty()
	 * @generated
	 * @ordered
	 */
	protected ENUM_SAMPLE emfcomboviewerOptionalProperty = EMFCOMBOVIEWER_OPTIONAL_PROPERTY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMultivaluededitorRequiredProperty() <em>Multivaluededitor Required Property</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultivaluededitorRequiredProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<String> multivaluededitorRequiredProperty;

	/**
	 * The cached value of the '{@link #getMultivaluededitorOptionalProperty() <em>Multivaluededitor Optional Property</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultivaluededitorOptionalProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<String> multivaluededitorOptionalProperty;

	/**
	 * The cached value of the '{@link #getTablecompositionOnSameTypeOptionalProperty() <em>Tablecomposition On Same Type Optional Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTablecompositionOnSameTypeOptionalProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<TotalSample> tablecompositionOnSameTypeOptionalProperty;

	/**
	 * The cached value of the '{@link #getAdvancedreferencestableRequiredProperty() <em>Advancedreferencestable Required Property</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvancedreferencestableRequiredProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<TotalSample> advancedreferencestableRequiredProperty;

	/**
	 * The cached value of the '{@link #getAdvancedreferencestableOptionalProperty() <em>Advancedreferencestable Optional Property</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvancedreferencestableOptionalProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<TotalSample> advancedreferencestableOptionalProperty;

	/**
	 * The cached value of the '{@link #getAdvancedeobjectflatcomboviewerRequiredPropery() <em>Advancedeobjectflatcomboviewer Required Propery</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvancedeobjectflatcomboviewerRequiredPropery()
	 * @generated
	 * @ordered
	 */
	protected TotalSample advancedeobjectflatcomboviewerRequiredPropery;

	/**
	 * The cached value of the '{@link #getAdvancedeobjectflatcomboviewerOptionalPropery() <em>Advancedeobjectflatcomboviewer Optional Propery</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvancedeobjectflatcomboviewerOptionalPropery()
	 * @generated
	 * @ordered
	 */
	protected TotalSample advancedeobjectflatcomboviewerOptionalPropery;

	/**
	 * The cached value of the '{@link #getAdvancedtablecompositionOnSametypeOptionalProperty() <em>Advancedtablecomposition On Sametype Optional Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvancedtablecompositionOnSametypeOptionalProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<TotalSample> advancedtablecompositionOnSametypeOptionalProperty;

	/**
	 * The cached value of the '{@link #getAdvancedtablecompositionRequiredProperty() <em>Advancedtablecomposition Required Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvancedtablecompositionRequiredProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<Sample> advancedtablecompositionRequiredProperty;

	/**
	 * The cached value of the '{@link #getAdvancedtablecompositionOptionalProperty() <em>Advancedtablecomposition Optional Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvancedtablecompositionOptionalProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<Sample> advancedtablecompositionOptionalProperty;

	/**
	 * The cached value of the '{@link #getTablecompositionRequiredProperty() <em>Tablecomposition Required Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTablecompositionRequiredProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<Sample> tablecompositionRequiredProperty;

	/**
	 * The cached value of the '{@link #getTablecompositionOptionalProperty() <em>Tablecomposition Optional Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTablecompositionOptionalProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<Sample> tablecompositionOptionalProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TotalSampleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefnrPackage.Literals.TOTAL_SAMPLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextRequiredProperty() {
		return textRequiredProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextRequiredProperty(String newTextRequiredProperty) {
		String oldTextRequiredProperty = textRequiredProperty;
		textRequiredProperty = newTextRequiredProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefnrPackage.TOTAL_SAMPLE__TEXT_REQUIRED_PROPERTY, oldTextRequiredProperty, textRequiredProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextOptionalProperty() {
		return textOptionalProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextOptionalProperty(String newTextOptionalProperty) {
		String oldTextOptionalProperty = textOptionalProperty;
		textOptionalProperty = newTextOptionalProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefnrPackage.TOTAL_SAMPLE__TEXT_OPTIONAL_PROPERTY, oldTextOptionalProperty, textOptionalProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCheckboxRequiredProperty() {
		return checkboxRequiredProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckboxRequiredProperty(boolean newCheckboxRequiredProperty) {
		boolean oldCheckboxRequiredProperty = checkboxRequiredProperty;
		checkboxRequiredProperty = newCheckboxRequiredProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefnrPackage.TOTAL_SAMPLE__CHECKBOX_REQUIRED_PROPERTY, oldCheckboxRequiredProperty, checkboxRequiredProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCheckboxOptionalProperty() {
		return checkboxOptionalProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckboxOptionalProperty(boolean newCheckboxOptionalProperty) {
		boolean oldCheckboxOptionalProperty = checkboxOptionalProperty;
		checkboxOptionalProperty = newCheckboxOptionalProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefnrPackage.TOTAL_SAMPLE__CHECKBOX_OPTIONAL_PROPERTY, oldCheckboxOptionalProperty, checkboxOptionalProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextareaRequiredProperty() {
		return textareaRequiredProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextareaRequiredProperty(String newTextareaRequiredProperty) {
		String oldTextareaRequiredProperty = textareaRequiredProperty;
		textareaRequiredProperty = newTextareaRequiredProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefnrPackage.TOTAL_SAMPLE__TEXTAREA_REQUIRED_PROPERTY, oldTextareaRequiredProperty, textareaRequiredProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextareaOptionalProperty() {
		return textareaOptionalProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextareaOptionalProperty(String newTextareaOptionalProperty) {
		String oldTextareaOptionalProperty = textareaOptionalProperty;
		textareaOptionalProperty = newTextareaOptionalProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefnrPackage.TOTAL_SAMPLE__TEXTAREA_OPTIONAL_PROPERTY, oldTextareaOptionalProperty, textareaOptionalProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUM_SAMPLE getRadioRequiredProperty() {
		return radioRequiredProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRadioRequiredProperty(ENUM_SAMPLE newRadioRequiredProperty) {
		ENUM_SAMPLE oldRadioRequiredProperty = radioRequiredProperty;
		radioRequiredProperty = newRadioRequiredProperty == null ? RADIO_REQUIRED_PROPERTY_EDEFAULT : newRadioRequiredProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefnrPackage.TOTAL_SAMPLE__RADIO_REQUIRED_PROPERTY, oldRadioRequiredProperty, radioRequiredProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUM_SAMPLE getRadioOptionalProperty() {
		return radioOptionalProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRadioOptionalProperty(ENUM_SAMPLE newRadioOptionalProperty) {
		ENUM_SAMPLE oldRadioOptionalProperty = radioOptionalProperty;
		radioOptionalProperty = newRadioOptionalProperty == null ? RADIO_OPTIONAL_PROPERTY_EDEFAULT : newRadioOptionalProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefnrPackage.TOTAL_SAMPLE__RADIO_OPTIONAL_PROPERTY, oldRadioOptionalProperty, radioOptionalProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TotalSample getEobjectflatcomboviewerRequiredProperty() {
		if (eobjectflatcomboviewerRequiredProperty != null && eobjectflatcomboviewerRequiredProperty.eIsProxy()) {
			InternalEObject oldEobjectflatcomboviewerRequiredProperty = (InternalEObject)eobjectflatcomboviewerRequiredProperty;
			eobjectflatcomboviewerRequiredProperty = (TotalSample)eResolveProxy(oldEobjectflatcomboviewerRequiredProperty);
			if (eobjectflatcomboviewerRequiredProperty != oldEobjectflatcomboviewerRequiredProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EefnrPackage.TOTAL_SAMPLE__EOBJECTFLATCOMBOVIEWER_REQUIRED_PROPERTY, oldEobjectflatcomboviewerRequiredProperty, eobjectflatcomboviewerRequiredProperty));
			}
		}
		return eobjectflatcomboviewerRequiredProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TotalSample basicGetEobjectflatcomboviewerRequiredProperty() {
		return eobjectflatcomboviewerRequiredProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEobjectflatcomboviewerRequiredProperty(TotalSample newEobjectflatcomboviewerRequiredProperty) {
		TotalSample oldEobjectflatcomboviewerRequiredProperty = eobjectflatcomboviewerRequiredProperty;
		eobjectflatcomboviewerRequiredProperty = newEobjectflatcomboviewerRequiredProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefnrPackage.TOTAL_SAMPLE__EOBJECTFLATCOMBOVIEWER_REQUIRED_PROPERTY, oldEobjectflatcomboviewerRequiredProperty, eobjectflatcomboviewerRequiredProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TotalSample getEobjectflatcomboviewerOptionalProperty() {
		if (eobjectflatcomboviewerOptionalProperty != null && eobjectflatcomboviewerOptionalProperty.eIsProxy()) {
			InternalEObject oldEobjectflatcomboviewerOptionalProperty = (InternalEObject)eobjectflatcomboviewerOptionalProperty;
			eobjectflatcomboviewerOptionalProperty = (TotalSample)eResolveProxy(oldEobjectflatcomboviewerOptionalProperty);
			if (eobjectflatcomboviewerOptionalProperty != oldEobjectflatcomboviewerOptionalProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EefnrPackage.TOTAL_SAMPLE__EOBJECTFLATCOMBOVIEWER_OPTIONAL_PROPERTY, oldEobjectflatcomboviewerOptionalProperty, eobjectflatcomboviewerOptionalProperty));
			}
		}
		return eobjectflatcomboviewerOptionalProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TotalSample basicGetEobjectflatcomboviewerOptionalProperty() {
		return eobjectflatcomboviewerOptionalProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEobjectflatcomboviewerOptionalProperty(TotalSample newEobjectflatcomboviewerOptionalProperty) {
		TotalSample oldEobjectflatcomboviewerOptionalProperty = eobjectflatcomboviewerOptionalProperty;
		eobjectflatcomboviewerOptionalProperty = newEobjectflatcomboviewerOptionalProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefnrPackage.TOTAL_SAMPLE__EOBJECTFLATCOMBOVIEWER_OPTIONAL_PROPERTY, oldEobjectflatcomboviewerOptionalProperty, eobjectflatcomboviewerOptionalProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TotalSample> getReferencestableRequiredProperty() {
		if (referencestableRequiredProperty == null) {
			referencestableRequiredProperty = new EObjectResolvingEList<TotalSample>(TotalSample.class, this, EefnrPackage.TOTAL_SAMPLE__REFERENCESTABLE_REQUIRED_PROPERTY);
		}
		return referencestableRequiredProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TotalSample> getReferencestableOptionalProperty() {
		if (referencestableOptionalProperty == null) {
			referencestableOptionalProperty = new EObjectResolvingEList<TotalSample>(TotalSample.class, this, EefnrPackage.TOTAL_SAMPLE__REFERENCESTABLE_OPTIONAL_PROPERTY);
		}
		return referencestableOptionalProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUM_SAMPLE getEmfcomboviewerRequiredProperty() {
		return emfcomboviewerRequiredProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmfcomboviewerRequiredProperty(ENUM_SAMPLE newEmfcomboviewerRequiredProperty) {
		ENUM_SAMPLE oldEmfcomboviewerRequiredProperty = emfcomboviewerRequiredProperty;
		emfcomboviewerRequiredProperty = newEmfcomboviewerRequiredProperty == null ? EMFCOMBOVIEWER_REQUIRED_PROPERTY_EDEFAULT : newEmfcomboviewerRequiredProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefnrPackage.TOTAL_SAMPLE__EMFCOMBOVIEWER_REQUIRED_PROPERTY, oldEmfcomboviewerRequiredProperty, emfcomboviewerRequiredProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUM_SAMPLE getEmfcomboviewerOptionalProperty() {
		return emfcomboviewerOptionalProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmfcomboviewerOptionalProperty(ENUM_SAMPLE newEmfcomboviewerOptionalProperty) {
		ENUM_SAMPLE oldEmfcomboviewerOptionalProperty = emfcomboviewerOptionalProperty;
		emfcomboviewerOptionalProperty = newEmfcomboviewerOptionalProperty == null ? EMFCOMBOVIEWER_OPTIONAL_PROPERTY_EDEFAULT : newEmfcomboviewerOptionalProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefnrPackage.TOTAL_SAMPLE__EMFCOMBOVIEWER_OPTIONAL_PROPERTY, oldEmfcomboviewerOptionalProperty, emfcomboviewerOptionalProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getMultivaluededitorRequiredProperty() {
		if (multivaluededitorRequiredProperty == null) {
			multivaluededitorRequiredProperty = new EDataTypeUniqueEList<String>(String.class, this, EefnrPackage.TOTAL_SAMPLE__MULTIVALUEDEDITOR_REQUIRED_PROPERTY);
		}
		return multivaluededitorRequiredProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getMultivaluededitorOptionalProperty() {
		if (multivaluededitorOptionalProperty == null) {
			multivaluededitorOptionalProperty = new EDataTypeUniqueEList<String>(String.class, this, EefnrPackage.TOTAL_SAMPLE__MULTIVALUEDEDITOR_OPTIONAL_PROPERTY);
		}
		return multivaluededitorOptionalProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TotalSample> getTablecompositionOnSameTypeOptionalProperty() {
		if (tablecompositionOnSameTypeOptionalProperty == null) {
			tablecompositionOnSameTypeOptionalProperty = new EObjectContainmentEList<TotalSample>(TotalSample.class, this, EefnrPackage.TOTAL_SAMPLE__TABLECOMPOSITION_ON_SAME_TYPE_OPTIONAL_PROPERTY);
		}
		return tablecompositionOnSameTypeOptionalProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sample> getTablecompositionRequiredProperty() {
		if (tablecompositionRequiredProperty == null) {
			tablecompositionRequiredProperty = new EObjectContainmentEList<Sample>(Sample.class, this, EefnrPackage.TOTAL_SAMPLE__TABLECOMPOSITION_REQUIRED_PROPERTY);
		}
		return tablecompositionRequiredProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sample> getTablecompositionOptionalProperty() {
		if (tablecompositionOptionalProperty == null) {
			tablecompositionOptionalProperty = new EObjectContainmentEList<Sample>(Sample.class, this, EefnrPackage.TOTAL_SAMPLE__TABLECOMPOSITION_OPTIONAL_PROPERTY);
		}
		return tablecompositionOptionalProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TotalSample> getAdvancedreferencestableRequiredProperty() {
		if (advancedreferencestableRequiredProperty == null) {
			advancedreferencestableRequiredProperty = new EObjectResolvingEList<TotalSample>(TotalSample.class, this, EefnrPackage.TOTAL_SAMPLE__ADVANCEDREFERENCESTABLE_REQUIRED_PROPERTY);
		}
		return advancedreferencestableRequiredProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TotalSample> getAdvancedreferencestableOptionalProperty() {
		if (advancedreferencestableOptionalProperty == null) {
			advancedreferencestableOptionalProperty = new EObjectResolvingEList<TotalSample>(TotalSample.class, this, EefnrPackage.TOTAL_SAMPLE__ADVANCEDREFERENCESTABLE_OPTIONAL_PROPERTY);
		}
		return advancedreferencestableOptionalProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TotalSample getAdvancedeobjectflatcomboviewerRequiredPropery() {
		if (advancedeobjectflatcomboviewerRequiredPropery != null && advancedeobjectflatcomboviewerRequiredPropery.eIsProxy()) {
			InternalEObject oldAdvancedeobjectflatcomboviewerRequiredPropery = (InternalEObject)advancedeobjectflatcomboviewerRequiredPropery;
			advancedeobjectflatcomboviewerRequiredPropery = (TotalSample)eResolveProxy(oldAdvancedeobjectflatcomboviewerRequiredPropery);
			if (advancedeobjectflatcomboviewerRequiredPropery != oldAdvancedeobjectflatcomboviewerRequiredPropery) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EefnrPackage.TOTAL_SAMPLE__ADVANCEDEOBJECTFLATCOMBOVIEWER_REQUIRED_PROPERY, oldAdvancedeobjectflatcomboviewerRequiredPropery, advancedeobjectflatcomboviewerRequiredPropery));
			}
		}
		return advancedeobjectflatcomboviewerRequiredPropery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TotalSample basicGetAdvancedeobjectflatcomboviewerRequiredPropery() {
		return advancedeobjectflatcomboviewerRequiredPropery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdvancedeobjectflatcomboviewerRequiredPropery(TotalSample newAdvancedeobjectflatcomboviewerRequiredPropery) {
		TotalSample oldAdvancedeobjectflatcomboviewerRequiredPropery = advancedeobjectflatcomboviewerRequiredPropery;
		advancedeobjectflatcomboviewerRequiredPropery = newAdvancedeobjectflatcomboviewerRequiredPropery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefnrPackage.TOTAL_SAMPLE__ADVANCEDEOBJECTFLATCOMBOVIEWER_REQUIRED_PROPERY, oldAdvancedeobjectflatcomboviewerRequiredPropery, advancedeobjectflatcomboviewerRequiredPropery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TotalSample getAdvancedeobjectflatcomboviewerOptionalPropery() {
		if (advancedeobjectflatcomboviewerOptionalPropery != null && advancedeobjectflatcomboviewerOptionalPropery.eIsProxy()) {
			InternalEObject oldAdvancedeobjectflatcomboviewerOptionalPropery = (InternalEObject)advancedeobjectflatcomboviewerOptionalPropery;
			advancedeobjectflatcomboviewerOptionalPropery = (TotalSample)eResolveProxy(oldAdvancedeobjectflatcomboviewerOptionalPropery);
			if (advancedeobjectflatcomboviewerOptionalPropery != oldAdvancedeobjectflatcomboviewerOptionalPropery) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EefnrPackage.TOTAL_SAMPLE__ADVANCEDEOBJECTFLATCOMBOVIEWER_OPTIONAL_PROPERY, oldAdvancedeobjectflatcomboviewerOptionalPropery, advancedeobjectflatcomboviewerOptionalPropery));
			}
		}
		return advancedeobjectflatcomboviewerOptionalPropery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TotalSample basicGetAdvancedeobjectflatcomboviewerOptionalPropery() {
		return advancedeobjectflatcomboviewerOptionalPropery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdvancedeobjectflatcomboviewerOptionalPropery(TotalSample newAdvancedeobjectflatcomboviewerOptionalPropery) {
		TotalSample oldAdvancedeobjectflatcomboviewerOptionalPropery = advancedeobjectflatcomboviewerOptionalPropery;
		advancedeobjectflatcomboviewerOptionalPropery = newAdvancedeobjectflatcomboviewerOptionalPropery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefnrPackage.TOTAL_SAMPLE__ADVANCEDEOBJECTFLATCOMBOVIEWER_OPTIONAL_PROPERY, oldAdvancedeobjectflatcomboviewerOptionalPropery, advancedeobjectflatcomboviewerOptionalPropery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TotalSample> getAdvancedtablecompositionOnSametypeOptionalProperty() {
		if (advancedtablecompositionOnSametypeOptionalProperty == null) {
			advancedtablecompositionOnSametypeOptionalProperty = new EObjectContainmentEList<TotalSample>(TotalSample.class, this, EefnrPackage.TOTAL_SAMPLE__ADVANCEDTABLECOMPOSITION_ON_SAMETYPE_OPTIONAL_PROPERTY);
		}
		return advancedtablecompositionOnSametypeOptionalProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sample> getAdvancedtablecompositionRequiredProperty() {
		if (advancedtablecompositionRequiredProperty == null) {
			advancedtablecompositionRequiredProperty = new EObjectContainmentEList<Sample>(Sample.class, this, EefnrPackage.TOTAL_SAMPLE__ADVANCEDTABLECOMPOSITION_REQUIRED_PROPERTY);
		}
		return advancedtablecompositionRequiredProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sample> getAdvancedtablecompositionOptionalProperty() {
		if (advancedtablecompositionOptionalProperty == null) {
			advancedtablecompositionOptionalProperty = new EObjectContainmentEList<Sample>(Sample.class, this, EefnrPackage.TOTAL_SAMPLE__ADVANCEDTABLECOMPOSITION_OPTIONAL_PROPERTY);
		}
		return advancedtablecompositionOptionalProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EefnrPackage.TOTAL_SAMPLE__TABLECOMPOSITION_ON_SAME_TYPE_OPTIONAL_PROPERTY:
				return ((InternalEList<?>)getTablecompositionOnSameTypeOptionalProperty()).basicRemove(otherEnd, msgs);
			case EefnrPackage.TOTAL_SAMPLE__ADVANCEDTABLECOMPOSITION_ON_SAMETYPE_OPTIONAL_PROPERTY:
				return ((InternalEList<?>)getAdvancedtablecompositionOnSametypeOptionalProperty()).basicRemove(otherEnd, msgs);
			case EefnrPackage.TOTAL_SAMPLE__ADVANCEDTABLECOMPOSITION_REQUIRED_PROPERTY:
				return ((InternalEList<?>)getAdvancedtablecompositionRequiredProperty()).basicRemove(otherEnd, msgs);
			case EefnrPackage.TOTAL_SAMPLE__ADVANCEDTABLECOMPOSITION_OPTIONAL_PROPERTY:
				return ((InternalEList<?>)getAdvancedtablecompositionOptionalProperty()).basicRemove(otherEnd, msgs);
			case EefnrPackage.TOTAL_SAMPLE__TABLECOMPOSITION_REQUIRED_PROPERTY:
				return ((InternalEList<?>)getTablecompositionRequiredProperty()).basicRemove(otherEnd, msgs);
			case EefnrPackage.TOTAL_SAMPLE__TABLECOMPOSITION_OPTIONAL_PROPERTY:
				return ((InternalEList<?>)getTablecompositionOptionalProperty()).basicRemove(otherEnd, msgs);
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
			case EefnrPackage.TOTAL_SAMPLE__TEXT_REQUIRED_PROPERTY:
				return getTextRequiredProperty();
			case EefnrPackage.TOTAL_SAMPLE__TEXT_OPTIONAL_PROPERTY:
				return getTextOptionalProperty();
			case EefnrPackage.TOTAL_SAMPLE__CHECKBOX_REQUIRED_PROPERTY:
				return isCheckboxRequiredProperty();
			case EefnrPackage.TOTAL_SAMPLE__CHECKBOX_OPTIONAL_PROPERTY:
				return isCheckboxOptionalProperty();
			case EefnrPackage.TOTAL_SAMPLE__TEXTAREA_REQUIRED_PROPERTY:
				return getTextareaRequiredProperty();
			case EefnrPackage.TOTAL_SAMPLE__TEXTAREA_OPTIONAL_PROPERTY:
				return getTextareaOptionalProperty();
			case EefnrPackage.TOTAL_SAMPLE__RADIO_REQUIRED_PROPERTY:
				return getRadioRequiredProperty();
			case EefnrPackage.TOTAL_SAMPLE__RADIO_OPTIONAL_PROPERTY:
				return getRadioOptionalProperty();
			case EefnrPackage.TOTAL_SAMPLE__EOBJECTFLATCOMBOVIEWER_REQUIRED_PROPERTY:
				if (resolve) return getEobjectflatcomboviewerRequiredProperty();
				return basicGetEobjectflatcomboviewerRequiredProperty();
			case EefnrPackage.TOTAL_SAMPLE__EOBJECTFLATCOMBOVIEWER_OPTIONAL_PROPERTY:
				if (resolve) return getEobjectflatcomboviewerOptionalProperty();
				return basicGetEobjectflatcomboviewerOptionalProperty();
			case EefnrPackage.TOTAL_SAMPLE__REFERENCESTABLE_REQUIRED_PROPERTY:
				return getReferencestableRequiredProperty();
			case EefnrPackage.TOTAL_SAMPLE__REFERENCESTABLE_OPTIONAL_PROPERTY:
				return getReferencestableOptionalProperty();
			case EefnrPackage.TOTAL_SAMPLE__EMFCOMBOVIEWER_REQUIRED_PROPERTY:
				return getEmfcomboviewerRequiredProperty();
			case EefnrPackage.TOTAL_SAMPLE__EMFCOMBOVIEWER_OPTIONAL_PROPERTY:
				return getEmfcomboviewerOptionalProperty();
			case EefnrPackage.TOTAL_SAMPLE__MULTIVALUEDEDITOR_REQUIRED_PROPERTY:
				return getMultivaluededitorRequiredProperty();
			case EefnrPackage.TOTAL_SAMPLE__MULTIVALUEDEDITOR_OPTIONAL_PROPERTY:
				return getMultivaluededitorOptionalProperty();
			case EefnrPackage.TOTAL_SAMPLE__TABLECOMPOSITION_ON_SAME_TYPE_OPTIONAL_PROPERTY:
				return getTablecompositionOnSameTypeOptionalProperty();
			case EefnrPackage.TOTAL_SAMPLE__ADVANCEDREFERENCESTABLE_REQUIRED_PROPERTY:
				return getAdvancedreferencestableRequiredProperty();
			case EefnrPackage.TOTAL_SAMPLE__ADVANCEDREFERENCESTABLE_OPTIONAL_PROPERTY:
				return getAdvancedreferencestableOptionalProperty();
			case EefnrPackage.TOTAL_SAMPLE__ADVANCEDEOBJECTFLATCOMBOVIEWER_REQUIRED_PROPERY:
				if (resolve) return getAdvancedeobjectflatcomboviewerRequiredPropery();
				return basicGetAdvancedeobjectflatcomboviewerRequiredPropery();
			case EefnrPackage.TOTAL_SAMPLE__ADVANCEDEOBJECTFLATCOMBOVIEWER_OPTIONAL_PROPERY:
				if (resolve) return getAdvancedeobjectflatcomboviewerOptionalPropery();
				return basicGetAdvancedeobjectflatcomboviewerOptionalPropery();
			case EefnrPackage.TOTAL_SAMPLE__ADVANCEDTABLECOMPOSITION_ON_SAMETYPE_OPTIONAL_PROPERTY:
				return getAdvancedtablecompositionOnSametypeOptionalProperty();
			case EefnrPackage.TOTAL_SAMPLE__ADVANCEDTABLECOMPOSITION_REQUIRED_PROPERTY:
				return getAdvancedtablecompositionRequiredProperty();
			case EefnrPackage.TOTAL_SAMPLE__ADVANCEDTABLECOMPOSITION_OPTIONAL_PROPERTY:
				return getAdvancedtablecompositionOptionalProperty();
			case EefnrPackage.TOTAL_SAMPLE__TABLECOMPOSITION_REQUIRED_PROPERTY:
				return getTablecompositionRequiredProperty();
			case EefnrPackage.TOTAL_SAMPLE__TABLECOMPOSITION_OPTIONAL_PROPERTY:
				return getTablecompositionOptionalProperty();
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
			case EefnrPackage.TOTAL_SAMPLE__TEXT_REQUIRED_PROPERTY:
				setTextRequiredProperty((String)newValue);
				return;
			case EefnrPackage.TOTAL_SAMPLE__TEXT_OPTIONAL_PROPERTY:
				setTextOptionalProperty((String)newValue);
				return;
			case EefnrPackage.TOTAL_SAMPLE__CHECKBOX_REQUIRED_PROPERTY:
				setCheckboxRequiredProperty((Boolean)newValue);
				return;
			case EefnrPackage.TOTAL_SAMPLE__CHECKBOX_OPTIONAL_PROPERTY:
				setCheckboxOptionalProperty((Boolean)newValue);
				return;
			case EefnrPackage.TOTAL_SAMPLE__TEXTAREA_REQUIRED_PROPERTY:
				setTextareaRequiredProperty((String)newValue);
				return;
			case EefnrPackage.TOTAL_SAMPLE__TEXTAREA_OPTIONAL_PROPERTY:
				setTextareaOptionalProperty((String)newValue);
				return;
			case EefnrPackage.TOTAL_SAMPLE__RADIO_REQUIRED_PROPERTY:
				setRadioRequiredProperty((ENUM_SAMPLE)newValue);
				return;
			case EefnrPackage.TOTAL_SAMPLE__RADIO_OPTIONAL_PROPERTY:
				setRadioOptionalProperty((ENUM_SAMPLE)newValue);
				return;
			case EefnrPackage.TOTAL_SAMPLE__EOBJECTFLATCOMBOVIEWER_REQUIRED_PROPERTY:
				setEobjectflatcomboviewerRequiredProperty((TotalSample)newValue);
				return;
			case EefnrPackage.TOTAL_SAMPLE__EOBJECTFLATCOMBOVIEWER_OPTIONAL_PROPERTY:
				setEobjectflatcomboviewerOptionalProperty((TotalSample)newValue);
				return;
			case EefnrPackage.TOTAL_SAMPLE__REFERENCESTABLE_REQUIRED_PROPERTY:
				getReferencestableRequiredProperty().clear();
				getReferencestableRequiredProperty().addAll((Collection<? extends TotalSample>)newValue);
				return;
			case EefnrPackage.TOTAL_SAMPLE__REFERENCESTABLE_OPTIONAL_PROPERTY:
				getReferencestableOptionalProperty().clear();
				getReferencestableOptionalProperty().addAll((Collection<? extends TotalSample>)newValue);
				return;
			case EefnrPackage.TOTAL_SAMPLE__EMFCOMBOVIEWER_REQUIRED_PROPERTY:
				setEmfcomboviewerRequiredProperty((ENUM_SAMPLE)newValue);
				return;
			case EefnrPackage.TOTAL_SAMPLE__EMFCOMBOVIEWER_OPTIONAL_PROPERTY:
				setEmfcomboviewerOptionalProperty((ENUM_SAMPLE)newValue);
				return;
			case EefnrPackage.TOTAL_SAMPLE__MULTIVALUEDEDITOR_REQUIRED_PROPERTY:
				getMultivaluededitorRequiredProperty().clear();
				getMultivaluededitorRequiredProperty().addAll((Collection<? extends String>)newValue);
				return;
			case EefnrPackage.TOTAL_SAMPLE__MULTIVALUEDEDITOR_OPTIONAL_PROPERTY:
				getMultivaluededitorOptionalProperty().clear();
				getMultivaluededitorOptionalProperty().addAll((Collection<? extends String>)newValue);
				return;
			case EefnrPackage.TOTAL_SAMPLE__TABLECOMPOSITION_ON_SAME_TYPE_OPTIONAL_PROPERTY:
				getTablecompositionOnSameTypeOptionalProperty().clear();
				getTablecompositionOnSameTypeOptionalProperty().addAll((Collection<? extends TotalSample>)newValue);
				return;
			case EefnrPackage.TOTAL_SAMPLE__ADVANCEDREFERENCESTABLE_REQUIRED_PROPERTY:
				getAdvancedreferencestableRequiredProperty().clear();
				getAdvancedreferencestableRequiredProperty().addAll((Collection<? extends TotalSample>)newValue);
				return;
			case EefnrPackage.TOTAL_SAMPLE__ADVANCEDREFERENCESTABLE_OPTIONAL_PROPERTY:
				getAdvancedreferencestableOptionalProperty().clear();
				getAdvancedreferencestableOptionalProperty().addAll((Collection<? extends TotalSample>)newValue);
				return;
			case EefnrPackage.TOTAL_SAMPLE__ADVANCEDEOBJECTFLATCOMBOVIEWER_REQUIRED_PROPERY:
				setAdvancedeobjectflatcomboviewerRequiredPropery((TotalSample)newValue);
				return;
			case EefnrPackage.TOTAL_SAMPLE__ADVANCEDEOBJECTFLATCOMBOVIEWER_OPTIONAL_PROPERY:
				setAdvancedeobjectflatcomboviewerOptionalPropery((TotalSample)newValue);
				return;
			case EefnrPackage.TOTAL_SAMPLE__ADVANCEDTABLECOMPOSITION_ON_SAMETYPE_OPTIONAL_PROPERTY:
				getAdvancedtablecompositionOnSametypeOptionalProperty().clear();
				getAdvancedtablecompositionOnSametypeOptionalProperty().addAll((Collection<? extends TotalSample>)newValue);
				return;
			case EefnrPackage.TOTAL_SAMPLE__ADVANCEDTABLECOMPOSITION_REQUIRED_PROPERTY:
				getAdvancedtablecompositionRequiredProperty().clear();
				getAdvancedtablecompositionRequiredProperty().addAll((Collection<? extends Sample>)newValue);
				return;
			case EefnrPackage.TOTAL_SAMPLE__ADVANCEDTABLECOMPOSITION_OPTIONAL_PROPERTY:
				getAdvancedtablecompositionOptionalProperty().clear();
				getAdvancedtablecompositionOptionalProperty().addAll((Collection<? extends Sample>)newValue);
				return;
			case EefnrPackage.TOTAL_SAMPLE__TABLECOMPOSITION_REQUIRED_PROPERTY:
				getTablecompositionRequiredProperty().clear();
				getTablecompositionRequiredProperty().addAll((Collection<? extends Sample>)newValue);
				return;
			case EefnrPackage.TOTAL_SAMPLE__TABLECOMPOSITION_OPTIONAL_PROPERTY:
				getTablecompositionOptionalProperty().clear();
				getTablecompositionOptionalProperty().addAll((Collection<? extends Sample>)newValue);
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
			case EefnrPackage.TOTAL_SAMPLE__TEXT_REQUIRED_PROPERTY:
				setTextRequiredProperty(TEXT_REQUIRED_PROPERTY_EDEFAULT);
				return;
			case EefnrPackage.TOTAL_SAMPLE__TEXT_OPTIONAL_PROPERTY:
				setTextOptionalProperty(TEXT_OPTIONAL_PROPERTY_EDEFAULT);
				return;
			case EefnrPackage.TOTAL_SAMPLE__CHECKBOX_REQUIRED_PROPERTY:
				setCheckboxRequiredProperty(CHECKBOX_REQUIRED_PROPERTY_EDEFAULT);
				return;
			case EefnrPackage.TOTAL_SAMPLE__CHECKBOX_OPTIONAL_PROPERTY:
				setCheckboxOptionalProperty(CHECKBOX_OPTIONAL_PROPERTY_EDEFAULT);
				return;
			case EefnrPackage.TOTAL_SAMPLE__TEXTAREA_REQUIRED_PROPERTY:
				setTextareaRequiredProperty(TEXTAREA_REQUIRED_PROPERTY_EDEFAULT);
				return;
			case EefnrPackage.TOTAL_SAMPLE__TEXTAREA_OPTIONAL_PROPERTY:
				setTextareaOptionalProperty(TEXTAREA_OPTIONAL_PROPERTY_EDEFAULT);
				return;
			case EefnrPackage.TOTAL_SAMPLE__RADIO_REQUIRED_PROPERTY:
				setRadioRequiredProperty(RADIO_REQUIRED_PROPERTY_EDEFAULT);
				return;
			case EefnrPackage.TOTAL_SAMPLE__RADIO_OPTIONAL_PROPERTY:
				setRadioOptionalProperty(RADIO_OPTIONAL_PROPERTY_EDEFAULT);
				return;
			case EefnrPackage.TOTAL_SAMPLE__EOBJECTFLATCOMBOVIEWER_REQUIRED_PROPERTY:
				setEobjectflatcomboviewerRequiredProperty((TotalSample)null);
				return;
			case EefnrPackage.TOTAL_SAMPLE__EOBJECTFLATCOMBOVIEWER_OPTIONAL_PROPERTY:
				setEobjectflatcomboviewerOptionalProperty((TotalSample)null);
				return;
			case EefnrPackage.TOTAL_SAMPLE__REFERENCESTABLE_REQUIRED_PROPERTY:
				getReferencestableRequiredProperty().clear();
				return;
			case EefnrPackage.TOTAL_SAMPLE__REFERENCESTABLE_OPTIONAL_PROPERTY:
				getReferencestableOptionalProperty().clear();
				return;
			case EefnrPackage.TOTAL_SAMPLE__EMFCOMBOVIEWER_REQUIRED_PROPERTY:
				setEmfcomboviewerRequiredProperty(EMFCOMBOVIEWER_REQUIRED_PROPERTY_EDEFAULT);
				return;
			case EefnrPackage.TOTAL_SAMPLE__EMFCOMBOVIEWER_OPTIONAL_PROPERTY:
				setEmfcomboviewerOptionalProperty(EMFCOMBOVIEWER_OPTIONAL_PROPERTY_EDEFAULT);
				return;
			case EefnrPackage.TOTAL_SAMPLE__MULTIVALUEDEDITOR_REQUIRED_PROPERTY:
				getMultivaluededitorRequiredProperty().clear();
				return;
			case EefnrPackage.TOTAL_SAMPLE__MULTIVALUEDEDITOR_OPTIONAL_PROPERTY:
				getMultivaluededitorOptionalProperty().clear();
				return;
			case EefnrPackage.TOTAL_SAMPLE__TABLECOMPOSITION_ON_SAME_TYPE_OPTIONAL_PROPERTY:
				getTablecompositionOnSameTypeOptionalProperty().clear();
				return;
			case EefnrPackage.TOTAL_SAMPLE__ADVANCEDREFERENCESTABLE_REQUIRED_PROPERTY:
				getAdvancedreferencestableRequiredProperty().clear();
				return;
			case EefnrPackage.TOTAL_SAMPLE__ADVANCEDREFERENCESTABLE_OPTIONAL_PROPERTY:
				getAdvancedreferencestableOptionalProperty().clear();
				return;
			case EefnrPackage.TOTAL_SAMPLE__ADVANCEDEOBJECTFLATCOMBOVIEWER_REQUIRED_PROPERY:
				setAdvancedeobjectflatcomboviewerRequiredPropery((TotalSample)null);
				return;
			case EefnrPackage.TOTAL_SAMPLE__ADVANCEDEOBJECTFLATCOMBOVIEWER_OPTIONAL_PROPERY:
				setAdvancedeobjectflatcomboviewerOptionalPropery((TotalSample)null);
				return;
			case EefnrPackage.TOTAL_SAMPLE__ADVANCEDTABLECOMPOSITION_ON_SAMETYPE_OPTIONAL_PROPERTY:
				getAdvancedtablecompositionOnSametypeOptionalProperty().clear();
				return;
			case EefnrPackage.TOTAL_SAMPLE__ADVANCEDTABLECOMPOSITION_REQUIRED_PROPERTY:
				getAdvancedtablecompositionRequiredProperty().clear();
				return;
			case EefnrPackage.TOTAL_SAMPLE__ADVANCEDTABLECOMPOSITION_OPTIONAL_PROPERTY:
				getAdvancedtablecompositionOptionalProperty().clear();
				return;
			case EefnrPackage.TOTAL_SAMPLE__TABLECOMPOSITION_REQUIRED_PROPERTY:
				getTablecompositionRequiredProperty().clear();
				return;
			case EefnrPackage.TOTAL_SAMPLE__TABLECOMPOSITION_OPTIONAL_PROPERTY:
				getTablecompositionOptionalProperty().clear();
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
			case EefnrPackage.TOTAL_SAMPLE__TEXT_REQUIRED_PROPERTY:
				return TEXT_REQUIRED_PROPERTY_EDEFAULT == null ? textRequiredProperty != null : !TEXT_REQUIRED_PROPERTY_EDEFAULT.equals(textRequiredProperty);
			case EefnrPackage.TOTAL_SAMPLE__TEXT_OPTIONAL_PROPERTY:
				return TEXT_OPTIONAL_PROPERTY_EDEFAULT == null ? textOptionalProperty != null : !TEXT_OPTIONAL_PROPERTY_EDEFAULT.equals(textOptionalProperty);
			case EefnrPackage.TOTAL_SAMPLE__CHECKBOX_REQUIRED_PROPERTY:
				return checkboxRequiredProperty != CHECKBOX_REQUIRED_PROPERTY_EDEFAULT;
			case EefnrPackage.TOTAL_SAMPLE__CHECKBOX_OPTIONAL_PROPERTY:
				return checkboxOptionalProperty != CHECKBOX_OPTIONAL_PROPERTY_EDEFAULT;
			case EefnrPackage.TOTAL_SAMPLE__TEXTAREA_REQUIRED_PROPERTY:
				return TEXTAREA_REQUIRED_PROPERTY_EDEFAULT == null ? textareaRequiredProperty != null : !TEXTAREA_REQUIRED_PROPERTY_EDEFAULT.equals(textareaRequiredProperty);
			case EefnrPackage.TOTAL_SAMPLE__TEXTAREA_OPTIONAL_PROPERTY:
				return TEXTAREA_OPTIONAL_PROPERTY_EDEFAULT == null ? textareaOptionalProperty != null : !TEXTAREA_OPTIONAL_PROPERTY_EDEFAULT.equals(textareaOptionalProperty);
			case EefnrPackage.TOTAL_SAMPLE__RADIO_REQUIRED_PROPERTY:
				return radioRequiredProperty != RADIO_REQUIRED_PROPERTY_EDEFAULT;
			case EefnrPackage.TOTAL_SAMPLE__RADIO_OPTIONAL_PROPERTY:
				return radioOptionalProperty != RADIO_OPTIONAL_PROPERTY_EDEFAULT;
			case EefnrPackage.TOTAL_SAMPLE__EOBJECTFLATCOMBOVIEWER_REQUIRED_PROPERTY:
				return eobjectflatcomboviewerRequiredProperty != null;
			case EefnrPackage.TOTAL_SAMPLE__EOBJECTFLATCOMBOVIEWER_OPTIONAL_PROPERTY:
				return eobjectflatcomboviewerOptionalProperty != null;
			case EefnrPackage.TOTAL_SAMPLE__REFERENCESTABLE_REQUIRED_PROPERTY:
				return referencestableRequiredProperty != null && !referencestableRequiredProperty.isEmpty();
			case EefnrPackage.TOTAL_SAMPLE__REFERENCESTABLE_OPTIONAL_PROPERTY:
				return referencestableOptionalProperty != null && !referencestableOptionalProperty.isEmpty();
			case EefnrPackage.TOTAL_SAMPLE__EMFCOMBOVIEWER_REQUIRED_PROPERTY:
				return emfcomboviewerRequiredProperty != EMFCOMBOVIEWER_REQUIRED_PROPERTY_EDEFAULT;
			case EefnrPackage.TOTAL_SAMPLE__EMFCOMBOVIEWER_OPTIONAL_PROPERTY:
				return emfcomboviewerOptionalProperty != EMFCOMBOVIEWER_OPTIONAL_PROPERTY_EDEFAULT;
			case EefnrPackage.TOTAL_SAMPLE__MULTIVALUEDEDITOR_REQUIRED_PROPERTY:
				return multivaluededitorRequiredProperty != null && !multivaluededitorRequiredProperty.isEmpty();
			case EefnrPackage.TOTAL_SAMPLE__MULTIVALUEDEDITOR_OPTIONAL_PROPERTY:
				return multivaluededitorOptionalProperty != null && !multivaluededitorOptionalProperty.isEmpty();
			case EefnrPackage.TOTAL_SAMPLE__TABLECOMPOSITION_ON_SAME_TYPE_OPTIONAL_PROPERTY:
				return tablecompositionOnSameTypeOptionalProperty != null && !tablecompositionOnSameTypeOptionalProperty.isEmpty();
			case EefnrPackage.TOTAL_SAMPLE__ADVANCEDREFERENCESTABLE_REQUIRED_PROPERTY:
				return advancedreferencestableRequiredProperty != null && !advancedreferencestableRequiredProperty.isEmpty();
			case EefnrPackage.TOTAL_SAMPLE__ADVANCEDREFERENCESTABLE_OPTIONAL_PROPERTY:
				return advancedreferencestableOptionalProperty != null && !advancedreferencestableOptionalProperty.isEmpty();
			case EefnrPackage.TOTAL_SAMPLE__ADVANCEDEOBJECTFLATCOMBOVIEWER_REQUIRED_PROPERY:
				return advancedeobjectflatcomboviewerRequiredPropery != null;
			case EefnrPackage.TOTAL_SAMPLE__ADVANCEDEOBJECTFLATCOMBOVIEWER_OPTIONAL_PROPERY:
				return advancedeobjectflatcomboviewerOptionalPropery != null;
			case EefnrPackage.TOTAL_SAMPLE__ADVANCEDTABLECOMPOSITION_ON_SAMETYPE_OPTIONAL_PROPERTY:
				return advancedtablecompositionOnSametypeOptionalProperty != null && !advancedtablecompositionOnSametypeOptionalProperty.isEmpty();
			case EefnrPackage.TOTAL_SAMPLE__ADVANCEDTABLECOMPOSITION_REQUIRED_PROPERTY:
				return advancedtablecompositionRequiredProperty != null && !advancedtablecompositionRequiredProperty.isEmpty();
			case EefnrPackage.TOTAL_SAMPLE__ADVANCEDTABLECOMPOSITION_OPTIONAL_PROPERTY:
				return advancedtablecompositionOptionalProperty != null && !advancedtablecompositionOptionalProperty.isEmpty();
			case EefnrPackage.TOTAL_SAMPLE__TABLECOMPOSITION_REQUIRED_PROPERTY:
				return tablecompositionRequiredProperty != null && !tablecompositionRequiredProperty.isEmpty();
			case EefnrPackage.TOTAL_SAMPLE__TABLECOMPOSITION_OPTIONAL_PROPERTY:
				return tablecompositionOptionalProperty != null && !tablecompositionOptionalProperty.isEmpty();
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
		result.append(" (textRequiredProperty: ");
		result.append(textRequiredProperty);
		result.append(", textOptionalProperty: ");
		result.append(textOptionalProperty);
		result.append(", checkboxRequiredProperty: ");
		result.append(checkboxRequiredProperty);
		result.append(", checkboxOptionalProperty: ");
		result.append(checkboxOptionalProperty);
		result.append(", textareaRequiredProperty: ");
		result.append(textareaRequiredProperty);
		result.append(", textareaOptionalProperty: ");
		result.append(textareaOptionalProperty);
		result.append(", radioRequiredProperty: ");
		result.append(radioRequiredProperty);
		result.append(", radioOptionalProperty: ");
		result.append(radioOptionalProperty);
		result.append(", emfcomboviewerRequiredProperty: ");
		result.append(emfcomboviewerRequiredProperty);
		result.append(", emfcomboviewerOptionalProperty: ");
		result.append(emfcomboviewerOptionalProperty);
		result.append(", multivaluededitorRequiredProperty: ");
		result.append(multivaluededitorRequiredProperty);
		result.append(", multivaluededitorOptionalProperty: ");
		result.append(multivaluededitorOptionalProperty);
		result.append(')');
		return result.toString();
	}

} //TotalSampleImpl
