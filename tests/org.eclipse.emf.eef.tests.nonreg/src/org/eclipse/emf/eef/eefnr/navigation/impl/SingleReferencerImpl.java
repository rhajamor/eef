/**
 * <copyright>
 * </copyright>
 *
 * $Id: SingleReferencerImpl.java,v 1.2.6.1 2011/11/09 10:11:51 sbouchet Exp $
 */
package org.eclipse.emf.eef.eefnr.navigation.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.eef.eefnr.navigation.NavigationPackage;
import org.eclipse.emf.eef.eefnr.navigation.Owner;
import org.eclipse.emf.eef.eefnr.navigation.SingleReferencer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Referencer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.eefnr.navigation.impl.SingleReferencerImpl#getSingleSampleForTableComposition <em>Single Sample For Table Composition</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.navigation.impl.SingleReferencerImpl#getSingleSampleForAdvancedTableComposition <em>Single Sample For Advanced Table Composition</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.navigation.impl.SingleReferencerImpl#getSingleSampleForReferencesTable <em>Single Sample For References Table</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.navigation.impl.SingleReferencerImpl#getSingleSampleAdvancedReferencesTable <em>Single Sample Advanced References Table</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.navigation.impl.SingleReferencerImpl#getSingleSampleForFlatReferencesTable <em>Single Sample For Flat References Table</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.navigation.impl.SingleReferencerImpl#getSingleContainmentForEObjectFlatComboViewer <em>Single Containment For EObject Flat Combo Viewer</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.navigation.impl.SingleReferencerImpl#getSingleReferenceForEObjectFlatComboViewer <em>Single Reference For EObject Flat Combo Viewer</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.navigation.impl.SingleReferencerImpl#getSingleContainmentForAdvancedEObjectFlatComboViewer <em>Single Containment For Advanced EObject Flat Combo Viewer</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.navigation.impl.SingleReferencerImpl#getSingleReferenceForAdvancedEObjectFlatComboViewer <em>Single Reference For Advanced EObject Flat Combo Viewer</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.navigation.impl.SingleReferencerImpl#isBooleanAttribute <em>Boolean Attribute</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.navigation.impl.SingleReferencerImpl#getEenumAttribute <em>Eenum Attribute</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.navigation.impl.SingleReferencerImpl#getStringAttribute <em>String Attribute</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.navigation.impl.SingleReferencerImpl#getListAttribute <em>List Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SingleReferencerImpl extends EObjectImpl implements SingleReferencer {
	/**
	 * The cached value of the '{@link #getSingleSampleForTableComposition() <em>Single Sample For Table Composition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingleSampleForTableComposition()
	 * @generated
	 * @ordered
	 */
	protected EList<Owner> singleSampleForTableComposition;

	/**
	 * The cached value of the '{@link #getSingleSampleForAdvancedTableComposition() <em>Single Sample For Advanced Table Composition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingleSampleForAdvancedTableComposition()
	 * @generated
	 * @ordered
	 */
	protected EList<Owner> singleSampleForAdvancedTableComposition;

	/**
	 * The cached value of the '{@link #getSingleSampleForReferencesTable() <em>Single Sample For References Table</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingleSampleForReferencesTable()
	 * @generated
	 * @ordered
	 */
	protected EList<Owner> singleSampleForReferencesTable;

	/**
	 * The cached value of the '{@link #getSingleSampleAdvancedReferencesTable() <em>Single Sample Advanced References Table</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingleSampleAdvancedReferencesTable()
	 * @generated
	 * @ordered
	 */
	protected EList<Owner> singleSampleAdvancedReferencesTable;

	/**
	 * The cached value of the '{@link #getSingleSampleForFlatReferencesTable() <em>Single Sample For Flat References Table</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingleSampleForFlatReferencesTable()
	 * @generated
	 * @ordered
	 */
	protected EList<Owner> singleSampleForFlatReferencesTable;

	/**
	 * The cached value of the '{@link #getSingleContainmentForEObjectFlatComboViewer() <em>Single Containment For EObject Flat Combo Viewer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingleContainmentForEObjectFlatComboViewer()
	 * @generated
	 * @ordered
	 */
	protected Owner singleContainmentForEObjectFlatComboViewer;

	/**
	 * The cached value of the '{@link #getSingleReferenceForEObjectFlatComboViewer() <em>Single Reference For EObject Flat Combo Viewer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingleReferenceForEObjectFlatComboViewer()
	 * @generated
	 * @ordered
	 */
	protected Owner singleReferenceForEObjectFlatComboViewer;

	/**
	 * The cached value of the '{@link #getSingleContainmentForAdvancedEObjectFlatComboViewer() <em>Single Containment For Advanced EObject Flat Combo Viewer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingleContainmentForAdvancedEObjectFlatComboViewer()
	 * @generated
	 * @ordered
	 */
	protected Owner singleContainmentForAdvancedEObjectFlatComboViewer;

	/**
	 * The cached value of the '{@link #getSingleReferenceForAdvancedEObjectFlatComboViewer() <em>Single Reference For Advanced EObject Flat Combo Viewer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingleReferenceForAdvancedEObjectFlatComboViewer()
	 * @generated
	 * @ordered
	 */
	protected Owner singleReferenceForAdvancedEObjectFlatComboViewer;

	/**
	 * The default value of the '{@link #isBooleanAttribute() <em>Boolean Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBooleanAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BOOLEAN_ATTRIBUTE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBooleanAttribute() <em>Boolean Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBooleanAttribute()
	 * @generated
	 * @ordered
	 */
	protected boolean booleanAttribute = BOOLEAN_ATTRIBUTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEenumAttribute() <em>Eenum Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEenumAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final Enumerator EENUM_ATTRIBUTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEenumAttribute() <em>Eenum Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEenumAttribute()
	 * @generated
	 * @ordered
	 */
	protected Enumerator eenumAttribute = EENUM_ATTRIBUTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStringAttribute() <em>String Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final String STRING_ATTRIBUTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStringAttribute() <em>String Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringAttribute()
	 * @generated
	 * @ordered
	 */
	protected String stringAttribute = STRING_ATTRIBUTE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getListAttribute() <em>List Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<?> listAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingleReferencerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NavigationPackage.Literals.SINGLE_REFERENCER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Owner> getSingleSampleForTableComposition() {
		if (singleSampleForTableComposition == null) {
			singleSampleForTableComposition = new EObjectContainmentEList<Owner>(Owner.class, this, NavigationPackage.SINGLE_REFERENCER__SINGLE_SAMPLE_FOR_TABLE_COMPOSITION);
		}
		return singleSampleForTableComposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Owner> getSingleSampleForAdvancedTableComposition() {
		if (singleSampleForAdvancedTableComposition == null) {
			singleSampleForAdvancedTableComposition = new EObjectContainmentEList<Owner>(Owner.class, this, NavigationPackage.SINGLE_REFERENCER__SINGLE_SAMPLE_FOR_ADVANCED_TABLE_COMPOSITION);
		}
		return singleSampleForAdvancedTableComposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Owner> getSingleSampleForReferencesTable() {
		if (singleSampleForReferencesTable == null) {
			singleSampleForReferencesTable = new EObjectResolvingEList<Owner>(Owner.class, this, NavigationPackage.SINGLE_REFERENCER__SINGLE_SAMPLE_FOR_REFERENCES_TABLE);
		}
		return singleSampleForReferencesTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Owner> getSingleSampleAdvancedReferencesTable() {
		if (singleSampleAdvancedReferencesTable == null) {
			singleSampleAdvancedReferencesTable = new EObjectResolvingEList<Owner>(Owner.class, this, NavigationPackage.SINGLE_REFERENCER__SINGLE_SAMPLE_ADVANCED_REFERENCES_TABLE);
		}
		return singleSampleAdvancedReferencesTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Owner> getSingleSampleForFlatReferencesTable() {
		if (singleSampleForFlatReferencesTable == null) {
			singleSampleForFlatReferencesTable = new EObjectResolvingEList<Owner>(Owner.class, this, NavigationPackage.SINGLE_REFERENCER__SINGLE_SAMPLE_FOR_FLAT_REFERENCES_TABLE);
		}
		return singleSampleForFlatReferencesTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Owner getSingleContainmentForEObjectFlatComboViewer() {
		return singleContainmentForEObjectFlatComboViewer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSingleContainmentForEObjectFlatComboViewer(Owner newSingleContainmentForEObjectFlatComboViewer, NotificationChain msgs) {
		Owner oldSingleContainmentForEObjectFlatComboViewer = singleContainmentForEObjectFlatComboViewer;
		singleContainmentForEObjectFlatComboViewer = newSingleContainmentForEObjectFlatComboViewer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NavigationPackage.SINGLE_REFERENCER__SINGLE_CONTAINMENT_FOR_EOBJECT_FLAT_COMBO_VIEWER, oldSingleContainmentForEObjectFlatComboViewer, newSingleContainmentForEObjectFlatComboViewer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSingleContainmentForEObjectFlatComboViewer(Owner newSingleContainmentForEObjectFlatComboViewer) {
		if (newSingleContainmentForEObjectFlatComboViewer != singleContainmentForEObjectFlatComboViewer) {
			NotificationChain msgs = null;
			if (singleContainmentForEObjectFlatComboViewer != null)
				msgs = ((InternalEObject)singleContainmentForEObjectFlatComboViewer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NavigationPackage.SINGLE_REFERENCER__SINGLE_CONTAINMENT_FOR_EOBJECT_FLAT_COMBO_VIEWER, null, msgs);
			if (newSingleContainmentForEObjectFlatComboViewer != null)
				msgs = ((InternalEObject)newSingleContainmentForEObjectFlatComboViewer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NavigationPackage.SINGLE_REFERENCER__SINGLE_CONTAINMENT_FOR_EOBJECT_FLAT_COMBO_VIEWER, null, msgs);
			msgs = basicSetSingleContainmentForEObjectFlatComboViewer(newSingleContainmentForEObjectFlatComboViewer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NavigationPackage.SINGLE_REFERENCER__SINGLE_CONTAINMENT_FOR_EOBJECT_FLAT_COMBO_VIEWER, newSingleContainmentForEObjectFlatComboViewer, newSingleContainmentForEObjectFlatComboViewer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Owner getSingleReferenceForEObjectFlatComboViewer() {
		if (singleReferenceForEObjectFlatComboViewer != null && singleReferenceForEObjectFlatComboViewer.eIsProxy()) {
			InternalEObject oldSingleReferenceForEObjectFlatComboViewer = (InternalEObject)singleReferenceForEObjectFlatComboViewer;
			singleReferenceForEObjectFlatComboViewer = (Owner)eResolveProxy(oldSingleReferenceForEObjectFlatComboViewer);
			if (singleReferenceForEObjectFlatComboViewer != oldSingleReferenceForEObjectFlatComboViewer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NavigationPackage.SINGLE_REFERENCER__SINGLE_REFERENCE_FOR_EOBJECT_FLAT_COMBO_VIEWER, oldSingleReferenceForEObjectFlatComboViewer, singleReferenceForEObjectFlatComboViewer));
			}
		}
		return singleReferenceForEObjectFlatComboViewer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Owner basicGetSingleReferenceForEObjectFlatComboViewer() {
		return singleReferenceForEObjectFlatComboViewer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSingleReferenceForEObjectFlatComboViewer(Owner newSingleReferenceForEObjectFlatComboViewer) {
		Owner oldSingleReferenceForEObjectFlatComboViewer = singleReferenceForEObjectFlatComboViewer;
		singleReferenceForEObjectFlatComboViewer = newSingleReferenceForEObjectFlatComboViewer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NavigationPackage.SINGLE_REFERENCER__SINGLE_REFERENCE_FOR_EOBJECT_FLAT_COMBO_VIEWER, oldSingleReferenceForEObjectFlatComboViewer, singleReferenceForEObjectFlatComboViewer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Owner getSingleContainmentForAdvancedEObjectFlatComboViewer() {
		return singleContainmentForAdvancedEObjectFlatComboViewer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSingleContainmentForAdvancedEObjectFlatComboViewer(Owner newSingleContainmentForAdvancedEObjectFlatComboViewer, NotificationChain msgs) {
		Owner oldSingleContainmentForAdvancedEObjectFlatComboViewer = singleContainmentForAdvancedEObjectFlatComboViewer;
		singleContainmentForAdvancedEObjectFlatComboViewer = newSingleContainmentForAdvancedEObjectFlatComboViewer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NavigationPackage.SINGLE_REFERENCER__SINGLE_CONTAINMENT_FOR_ADVANCED_EOBJECT_FLAT_COMBO_VIEWER, oldSingleContainmentForAdvancedEObjectFlatComboViewer, newSingleContainmentForAdvancedEObjectFlatComboViewer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSingleContainmentForAdvancedEObjectFlatComboViewer(Owner newSingleContainmentForAdvancedEObjectFlatComboViewer) {
		if (newSingleContainmentForAdvancedEObjectFlatComboViewer != singleContainmentForAdvancedEObjectFlatComboViewer) {
			NotificationChain msgs = null;
			if (singleContainmentForAdvancedEObjectFlatComboViewer != null)
				msgs = ((InternalEObject)singleContainmentForAdvancedEObjectFlatComboViewer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NavigationPackage.SINGLE_REFERENCER__SINGLE_CONTAINMENT_FOR_ADVANCED_EOBJECT_FLAT_COMBO_VIEWER, null, msgs);
			if (newSingleContainmentForAdvancedEObjectFlatComboViewer != null)
				msgs = ((InternalEObject)newSingleContainmentForAdvancedEObjectFlatComboViewer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NavigationPackage.SINGLE_REFERENCER__SINGLE_CONTAINMENT_FOR_ADVANCED_EOBJECT_FLAT_COMBO_VIEWER, null, msgs);
			msgs = basicSetSingleContainmentForAdvancedEObjectFlatComboViewer(newSingleContainmentForAdvancedEObjectFlatComboViewer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NavigationPackage.SINGLE_REFERENCER__SINGLE_CONTAINMENT_FOR_ADVANCED_EOBJECT_FLAT_COMBO_VIEWER, newSingleContainmentForAdvancedEObjectFlatComboViewer, newSingleContainmentForAdvancedEObjectFlatComboViewer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Owner getSingleReferenceForAdvancedEObjectFlatComboViewer() {
		if (singleReferenceForAdvancedEObjectFlatComboViewer != null && singleReferenceForAdvancedEObjectFlatComboViewer.eIsProxy()) {
			InternalEObject oldSingleReferenceForAdvancedEObjectFlatComboViewer = (InternalEObject)singleReferenceForAdvancedEObjectFlatComboViewer;
			singleReferenceForAdvancedEObjectFlatComboViewer = (Owner)eResolveProxy(oldSingleReferenceForAdvancedEObjectFlatComboViewer);
			if (singleReferenceForAdvancedEObjectFlatComboViewer != oldSingleReferenceForAdvancedEObjectFlatComboViewer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NavigationPackage.SINGLE_REFERENCER__SINGLE_REFERENCE_FOR_ADVANCED_EOBJECT_FLAT_COMBO_VIEWER, oldSingleReferenceForAdvancedEObjectFlatComboViewer, singleReferenceForAdvancedEObjectFlatComboViewer));
			}
		}
		return singleReferenceForAdvancedEObjectFlatComboViewer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Owner basicGetSingleReferenceForAdvancedEObjectFlatComboViewer() {
		return singleReferenceForAdvancedEObjectFlatComboViewer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSingleReferenceForAdvancedEObjectFlatComboViewer(Owner newSingleReferenceForAdvancedEObjectFlatComboViewer) {
		Owner oldSingleReferenceForAdvancedEObjectFlatComboViewer = singleReferenceForAdvancedEObjectFlatComboViewer;
		singleReferenceForAdvancedEObjectFlatComboViewer = newSingleReferenceForAdvancedEObjectFlatComboViewer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NavigationPackage.SINGLE_REFERENCER__SINGLE_REFERENCE_FOR_ADVANCED_EOBJECT_FLAT_COMBO_VIEWER, oldSingleReferenceForAdvancedEObjectFlatComboViewer, singleReferenceForAdvancedEObjectFlatComboViewer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBooleanAttribute() {
		return booleanAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBooleanAttribute(boolean newBooleanAttribute) {
		boolean oldBooleanAttribute = booleanAttribute;
		booleanAttribute = newBooleanAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NavigationPackage.SINGLE_REFERENCER__BOOLEAN_ATTRIBUTE, oldBooleanAttribute, booleanAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumerator getEenumAttribute() {
		return eenumAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEenumAttribute(Enumerator newEenumAttribute) {
		Enumerator oldEenumAttribute = eenumAttribute;
		eenumAttribute = newEenumAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NavigationPackage.SINGLE_REFERENCER__EENUM_ATTRIBUTE, oldEenumAttribute, eenumAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStringAttribute() {
		return stringAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStringAttribute(String newStringAttribute) {
		String oldStringAttribute = stringAttribute;
		stringAttribute = newStringAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NavigationPackage.SINGLE_REFERENCER__STRING_ATTRIBUTE, oldStringAttribute, stringAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<?> getListAttribute() {
		return listAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListAttribute(EList<?> newListAttribute) {
		EList<?> oldListAttribute = listAttribute;
		listAttribute = newListAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NavigationPackage.SINGLE_REFERENCER__LIST_ATTRIBUTE, oldListAttribute, listAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NavigationPackage.SINGLE_REFERENCER__SINGLE_SAMPLE_FOR_TABLE_COMPOSITION:
				return ((InternalEList<?>)getSingleSampleForTableComposition()).basicRemove(otherEnd, msgs);
			case NavigationPackage.SINGLE_REFERENCER__SINGLE_SAMPLE_FOR_ADVANCED_TABLE_COMPOSITION:
				return ((InternalEList<?>)getSingleSampleForAdvancedTableComposition()).basicRemove(otherEnd, msgs);
			case NavigationPackage.SINGLE_REFERENCER__SINGLE_CONTAINMENT_FOR_EOBJECT_FLAT_COMBO_VIEWER:
				return basicSetSingleContainmentForEObjectFlatComboViewer(null, msgs);
			case NavigationPackage.SINGLE_REFERENCER__SINGLE_CONTAINMENT_FOR_ADVANCED_EOBJECT_FLAT_COMBO_VIEWER:
				return basicSetSingleContainmentForAdvancedEObjectFlatComboViewer(null, msgs);
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
			case NavigationPackage.SINGLE_REFERENCER__SINGLE_SAMPLE_FOR_TABLE_COMPOSITION:
				return getSingleSampleForTableComposition();
			case NavigationPackage.SINGLE_REFERENCER__SINGLE_SAMPLE_FOR_ADVANCED_TABLE_COMPOSITION:
				return getSingleSampleForAdvancedTableComposition();
			case NavigationPackage.SINGLE_REFERENCER__SINGLE_SAMPLE_FOR_REFERENCES_TABLE:
				return getSingleSampleForReferencesTable();
			case NavigationPackage.SINGLE_REFERENCER__SINGLE_SAMPLE_ADVANCED_REFERENCES_TABLE:
				return getSingleSampleAdvancedReferencesTable();
			case NavigationPackage.SINGLE_REFERENCER__SINGLE_SAMPLE_FOR_FLAT_REFERENCES_TABLE:
				return getSingleSampleForFlatReferencesTable();
			case NavigationPackage.SINGLE_REFERENCER__SINGLE_CONTAINMENT_FOR_EOBJECT_FLAT_COMBO_VIEWER:
				return getSingleContainmentForEObjectFlatComboViewer();
			case NavigationPackage.SINGLE_REFERENCER__SINGLE_REFERENCE_FOR_EOBJECT_FLAT_COMBO_VIEWER:
				if (resolve) return getSingleReferenceForEObjectFlatComboViewer();
				return basicGetSingleReferenceForEObjectFlatComboViewer();
			case NavigationPackage.SINGLE_REFERENCER__SINGLE_CONTAINMENT_FOR_ADVANCED_EOBJECT_FLAT_COMBO_VIEWER:
				return getSingleContainmentForAdvancedEObjectFlatComboViewer();
			case NavigationPackage.SINGLE_REFERENCER__SINGLE_REFERENCE_FOR_ADVANCED_EOBJECT_FLAT_COMBO_VIEWER:
				if (resolve) return getSingleReferenceForAdvancedEObjectFlatComboViewer();
				return basicGetSingleReferenceForAdvancedEObjectFlatComboViewer();
			case NavigationPackage.SINGLE_REFERENCER__BOOLEAN_ATTRIBUTE:
				return isBooleanAttribute();
			case NavigationPackage.SINGLE_REFERENCER__EENUM_ATTRIBUTE:
				return getEenumAttribute();
			case NavigationPackage.SINGLE_REFERENCER__STRING_ATTRIBUTE:
				return getStringAttribute();
			case NavigationPackage.SINGLE_REFERENCER__LIST_ATTRIBUTE:
				return getListAttribute();
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
			case NavigationPackage.SINGLE_REFERENCER__SINGLE_SAMPLE_FOR_TABLE_COMPOSITION:
				getSingleSampleForTableComposition().clear();
				getSingleSampleForTableComposition().addAll((Collection<? extends Owner>)newValue);
				return;
			case NavigationPackage.SINGLE_REFERENCER__SINGLE_SAMPLE_FOR_ADVANCED_TABLE_COMPOSITION:
				getSingleSampleForAdvancedTableComposition().clear();
				getSingleSampleForAdvancedTableComposition().addAll((Collection<? extends Owner>)newValue);
				return;
			case NavigationPackage.SINGLE_REFERENCER__SINGLE_SAMPLE_FOR_REFERENCES_TABLE:
				getSingleSampleForReferencesTable().clear();
				getSingleSampleForReferencesTable().addAll((Collection<? extends Owner>)newValue);
				return;
			case NavigationPackage.SINGLE_REFERENCER__SINGLE_SAMPLE_ADVANCED_REFERENCES_TABLE:
				getSingleSampleAdvancedReferencesTable().clear();
				getSingleSampleAdvancedReferencesTable().addAll((Collection<? extends Owner>)newValue);
				return;
			case NavigationPackage.SINGLE_REFERENCER__SINGLE_SAMPLE_FOR_FLAT_REFERENCES_TABLE:
				getSingleSampleForFlatReferencesTable().clear();
				getSingleSampleForFlatReferencesTable().addAll((Collection<? extends Owner>)newValue);
				return;
			case NavigationPackage.SINGLE_REFERENCER__SINGLE_CONTAINMENT_FOR_EOBJECT_FLAT_COMBO_VIEWER:
				setSingleContainmentForEObjectFlatComboViewer((Owner)newValue);
				return;
			case NavigationPackage.SINGLE_REFERENCER__SINGLE_REFERENCE_FOR_EOBJECT_FLAT_COMBO_VIEWER:
				setSingleReferenceForEObjectFlatComboViewer((Owner)newValue);
				return;
			case NavigationPackage.SINGLE_REFERENCER__SINGLE_CONTAINMENT_FOR_ADVANCED_EOBJECT_FLAT_COMBO_VIEWER:
				setSingleContainmentForAdvancedEObjectFlatComboViewer((Owner)newValue);
				return;
			case NavigationPackage.SINGLE_REFERENCER__SINGLE_REFERENCE_FOR_ADVANCED_EOBJECT_FLAT_COMBO_VIEWER:
				setSingleReferenceForAdvancedEObjectFlatComboViewer((Owner)newValue);
				return;
			case NavigationPackage.SINGLE_REFERENCER__BOOLEAN_ATTRIBUTE:
				setBooleanAttribute((Boolean)newValue);
				return;
			case NavigationPackage.SINGLE_REFERENCER__EENUM_ATTRIBUTE:
				setEenumAttribute((Enumerator)newValue);
				return;
			case NavigationPackage.SINGLE_REFERENCER__STRING_ATTRIBUTE:
				setStringAttribute((String)newValue);
				return;
			case NavigationPackage.SINGLE_REFERENCER__LIST_ATTRIBUTE:
				setListAttribute((EList<?>)newValue);
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
			case NavigationPackage.SINGLE_REFERENCER__SINGLE_SAMPLE_FOR_TABLE_COMPOSITION:
				getSingleSampleForTableComposition().clear();
				return;
			case NavigationPackage.SINGLE_REFERENCER__SINGLE_SAMPLE_FOR_ADVANCED_TABLE_COMPOSITION:
				getSingleSampleForAdvancedTableComposition().clear();
				return;
			case NavigationPackage.SINGLE_REFERENCER__SINGLE_SAMPLE_FOR_REFERENCES_TABLE:
				getSingleSampleForReferencesTable().clear();
				return;
			case NavigationPackage.SINGLE_REFERENCER__SINGLE_SAMPLE_ADVANCED_REFERENCES_TABLE:
				getSingleSampleAdvancedReferencesTable().clear();
				return;
			case NavigationPackage.SINGLE_REFERENCER__SINGLE_SAMPLE_FOR_FLAT_REFERENCES_TABLE:
				getSingleSampleForFlatReferencesTable().clear();
				return;
			case NavigationPackage.SINGLE_REFERENCER__SINGLE_CONTAINMENT_FOR_EOBJECT_FLAT_COMBO_VIEWER:
				setSingleContainmentForEObjectFlatComboViewer((Owner)null);
				return;
			case NavigationPackage.SINGLE_REFERENCER__SINGLE_REFERENCE_FOR_EOBJECT_FLAT_COMBO_VIEWER:
				setSingleReferenceForEObjectFlatComboViewer((Owner)null);
				return;
			case NavigationPackage.SINGLE_REFERENCER__SINGLE_CONTAINMENT_FOR_ADVANCED_EOBJECT_FLAT_COMBO_VIEWER:
				setSingleContainmentForAdvancedEObjectFlatComboViewer((Owner)null);
				return;
			case NavigationPackage.SINGLE_REFERENCER__SINGLE_REFERENCE_FOR_ADVANCED_EOBJECT_FLAT_COMBO_VIEWER:
				setSingleReferenceForAdvancedEObjectFlatComboViewer((Owner)null);
				return;
			case NavigationPackage.SINGLE_REFERENCER__BOOLEAN_ATTRIBUTE:
				setBooleanAttribute(BOOLEAN_ATTRIBUTE_EDEFAULT);
				return;
			case NavigationPackage.SINGLE_REFERENCER__EENUM_ATTRIBUTE:
				setEenumAttribute(EENUM_ATTRIBUTE_EDEFAULT);
				return;
			case NavigationPackage.SINGLE_REFERENCER__STRING_ATTRIBUTE:
				setStringAttribute(STRING_ATTRIBUTE_EDEFAULT);
				return;
			case NavigationPackage.SINGLE_REFERENCER__LIST_ATTRIBUTE:
				setListAttribute((EList<?>)null);
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
			case NavigationPackage.SINGLE_REFERENCER__SINGLE_SAMPLE_FOR_TABLE_COMPOSITION:
				return singleSampleForTableComposition != null && !singleSampleForTableComposition.isEmpty();
			case NavigationPackage.SINGLE_REFERENCER__SINGLE_SAMPLE_FOR_ADVANCED_TABLE_COMPOSITION:
				return singleSampleForAdvancedTableComposition != null && !singleSampleForAdvancedTableComposition.isEmpty();
			case NavigationPackage.SINGLE_REFERENCER__SINGLE_SAMPLE_FOR_REFERENCES_TABLE:
				return singleSampleForReferencesTable != null && !singleSampleForReferencesTable.isEmpty();
			case NavigationPackage.SINGLE_REFERENCER__SINGLE_SAMPLE_ADVANCED_REFERENCES_TABLE:
				return singleSampleAdvancedReferencesTable != null && !singleSampleAdvancedReferencesTable.isEmpty();
			case NavigationPackage.SINGLE_REFERENCER__SINGLE_SAMPLE_FOR_FLAT_REFERENCES_TABLE:
				return singleSampleForFlatReferencesTable != null && !singleSampleForFlatReferencesTable.isEmpty();
			case NavigationPackage.SINGLE_REFERENCER__SINGLE_CONTAINMENT_FOR_EOBJECT_FLAT_COMBO_VIEWER:
				return singleContainmentForEObjectFlatComboViewer != null;
			case NavigationPackage.SINGLE_REFERENCER__SINGLE_REFERENCE_FOR_EOBJECT_FLAT_COMBO_VIEWER:
				return singleReferenceForEObjectFlatComboViewer != null;
			case NavigationPackage.SINGLE_REFERENCER__SINGLE_CONTAINMENT_FOR_ADVANCED_EOBJECT_FLAT_COMBO_VIEWER:
				return singleContainmentForAdvancedEObjectFlatComboViewer != null;
			case NavigationPackage.SINGLE_REFERENCER__SINGLE_REFERENCE_FOR_ADVANCED_EOBJECT_FLAT_COMBO_VIEWER:
				return singleReferenceForAdvancedEObjectFlatComboViewer != null;
			case NavigationPackage.SINGLE_REFERENCER__BOOLEAN_ATTRIBUTE:
				return booleanAttribute != BOOLEAN_ATTRIBUTE_EDEFAULT;
			case NavigationPackage.SINGLE_REFERENCER__EENUM_ATTRIBUTE:
				return EENUM_ATTRIBUTE_EDEFAULT == null ? eenumAttribute != null : !EENUM_ATTRIBUTE_EDEFAULT.equals(eenumAttribute);
			case NavigationPackage.SINGLE_REFERENCER__STRING_ATTRIBUTE:
				return STRING_ATTRIBUTE_EDEFAULT == null ? stringAttribute != null : !STRING_ATTRIBUTE_EDEFAULT.equals(stringAttribute);
			case NavigationPackage.SINGLE_REFERENCER__LIST_ATTRIBUTE:
				return listAttribute != null;
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
		result.append(" (booleanAttribute: ");
		result.append(booleanAttribute);
		result.append(", eenumAttribute: ");
		result.append(eenumAttribute);
		result.append(", stringAttribute: ");
		result.append(stringAttribute);
		result.append(", listAttribute: ");
		result.append(listAttribute);
		result.append(')');
		return result.toString();
	}

} //SingleReferencerImpl
