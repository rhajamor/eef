/**
 * <copyright>
 * </copyright>
 *
 * $Id: EefnrPackageImpl.java,v 1.10.2.2 2011/10/26 16:16:45 sbouchet Exp $
 */
package org.eclipse.emf.eef.eefnr.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.eef.eefnr.AbstractSample;
import org.eclipse.emf.eef.eefnr.AbstractTableCompositionTargetExtensionEditorSample;
import org.eclipse.emf.eef.eefnr.AdvancedEObjectFlatComboViewerSample;
import org.eclipse.emf.eef.eefnr.AdvancedReferencesTableSample;
import org.eclipse.emf.eef.eefnr.AdvancedTableCompositionEditorSample;
import org.eclipse.emf.eef.eefnr.CheckboxSample;
import org.eclipse.emf.eef.eefnr.EMFComboViewerSample;
import org.eclipse.emf.eef.eefnr.EObjectFlatComboViewerSample;
import org.eclipse.emf.eef.eefnr.EefnrFactory;
import org.eclipse.emf.eef.eefnr.EefnrPackage;
import org.eclipse.emf.eef.eefnr.FlatReferencesTableSample;
import org.eclipse.emf.eef.eefnr.ImageViewerSample;
import org.eclipse.emf.eef.eefnr.MultiValuedEditorSample;
import org.eclipse.emf.eef.eefnr.NamedElement;
import org.eclipse.emf.eef.eefnr.RadioSample;
import org.eclipse.emf.eef.eefnr.ReferencesTableSample;
import org.eclipse.emf.eef.eefnr.Root;
import org.eclipse.emf.eef.eefnr.Sample;
import org.eclipse.emf.eef.eefnr.SelectionDialogSample;
import org.eclipse.emf.eef.eefnr.SingleCompositionViewerSample;
import org.eclipse.emf.eef.eefnr.TableCompositionEditorSample;
import org.eclipse.emf.eef.eefnr.TableCompositionExtensionEditorSample;
import org.eclipse.emf.eef.eefnr.TextSample;
import org.eclipse.emf.eef.eefnr.TextSampleWithTwoTabs;
import org.eclipse.emf.eef.eefnr.TextareaSample;
import org.eclipse.emf.eef.eefnr.TotalSample;
import org.eclipse.emf.eef.eefnr.filters.FiltersPackage;
import org.eclipse.emf.eef.eefnr.filters.impl.FiltersPackageImpl;
import org.eclipse.emf.eef.eefnr.interface_.InterfacePackage;
import org.eclipse.emf.eef.eefnr.interface_.impl.InterfacePackageImpl;
import org.eclipse.emf.eef.eefnr.naming.CustomNamingPackage;
import org.eclipse.emf.eef.eefnr.naming.impl.CustomNamingPackageImpl;
import org.eclipse.emf.eef.eefnr.navigation.NavigationPackage;
import org.eclipse.emf.eef.eefnr.navigation.impl.NavigationPackageImpl;
import org.eclipse.emf.eef.eefnr.references.ReferencesPackage;
import org.eclipse.emf.eef.eefnr.references.impl.ReferencesPackageImpl;
import org.eclipse.emf.eef.eefnrext.EefnrextPackage;
import org.eclipse.emf.eef.eefnrext.impl.EefnrextPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EefnrPackageImpl extends EPackageImpl implements EefnrPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractSampleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass totalSampleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textSampleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkboxSampleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textareaSampleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass radioSampleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eObjectFlatComboViewerSampleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referencesTableSampleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emfComboViewerSampleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiValuedEditorSampleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableCompositionEditorSampleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass advancedReferencesTableSampleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass advancedEObjectFlatComboViewerSampleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass advancedTableCompositionEditorSampleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flatReferencesTableSampleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sampleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textSampleWithTwoTabsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableCompositionExtensionEditorSampleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractTableCompositionTargetExtensionEditorSampleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageViewerSampleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectionDialogSampleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleCompositionViewerSampleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enuM_SAMPLEEEnum = null;

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
	 * @see org.eclipse.emf.eef.eefnr.EefnrPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EefnrPackageImpl() {
		super(eNS_URI, EefnrFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link EefnrPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EefnrPackage init() {
		if (isInited) return (EefnrPackage)EPackage.Registry.INSTANCE.getEPackage(EefnrPackage.eNS_URI);

		// Obtain or create and register package
		EefnrPackageImpl theEefnrPackage = (EefnrPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EefnrPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EefnrPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ReferencesPackageImpl theReferencesPackage = (ReferencesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ReferencesPackage.eNS_URI) instanceof ReferencesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ReferencesPackage.eNS_URI) : ReferencesPackage.eINSTANCE);
		NavigationPackageImpl theNavigationPackage = (NavigationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NavigationPackage.eNS_URI) instanceof NavigationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NavigationPackage.eNS_URI) : NavigationPackage.eINSTANCE);
		FiltersPackageImpl theFiltersPackage = (FiltersPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FiltersPackage.eNS_URI) instanceof FiltersPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FiltersPackage.eNS_URI) : FiltersPackage.eINSTANCE);
		CustomNamingPackageImpl theCustomNamingPackage = (CustomNamingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CustomNamingPackage.eNS_URI) instanceof CustomNamingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CustomNamingPackage.eNS_URI) : CustomNamingPackage.eINSTANCE);
		InterfacePackageImpl theInterfacePackage = (InterfacePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InterfacePackage.eNS_URI) instanceof InterfacePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InterfacePackage.eNS_URI) : InterfacePackage.eINSTANCE);
		EefnrextPackageImpl theEefnrextPackage = (EefnrextPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EefnrextPackage.eNS_URI) instanceof EefnrextPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EefnrextPackage.eNS_URI) : EefnrextPackage.eINSTANCE);

		// Create package meta-data objects
		theEefnrPackage.createPackageContents();
		theReferencesPackage.createPackageContents();
		theNavigationPackage.createPackageContents();
		theFiltersPackage.createPackageContents();
		theCustomNamingPackage.createPackageContents();
		theInterfacePackage.createPackageContents();
		theEefnrextPackage.createPackageContents();

		// Initialize created meta-data
		theEefnrPackage.initializePackageContents();
		theReferencesPackage.initializePackageContents();
		theNavigationPackage.initializePackageContents();
		theFiltersPackage.initializePackageContents();
		theCustomNamingPackage.initializePackageContents();
		theInterfacePackage.initializePackageContents();
		theEefnrextPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEefnrPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EefnrPackage.eNS_URI, theEefnrPackage);
		return theEefnrPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoot() {
		return rootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoot_Samples() {
		return (EReference)rootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractSample() {
		return abstractSampleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractSample_Name() {
		return (EAttribute)abstractSampleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTotalSample() {
		return totalSampleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTotalSample_TextRequiredProperty() {
		return (EAttribute)totalSampleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTotalSample_TextOptionalProperty() {
		return (EAttribute)totalSampleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTotalSample_CheckboxRequiredProperty() {
		return (EAttribute)totalSampleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTotalSample_CheckboxOptionalProperty() {
		return (EAttribute)totalSampleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTotalSample_TextareaRequiredProperty() {
		return (EAttribute)totalSampleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTotalSample_TextareaOptionalProperty() {
		return (EAttribute)totalSampleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTotalSample_RadioRequiredProperty() {
		return (EAttribute)totalSampleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTotalSample_RadioOptionalProperty() {
		return (EAttribute)totalSampleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTotalSample_EobjectflatcomboviewerRequiredProperty() {
		return (EReference)totalSampleEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTotalSample_EobjectflatcomboviewerOptionalProperty() {
		return (EReference)totalSampleEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTotalSample_ReferencestableRequiredProperty() {
		return (EReference)totalSampleEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTotalSample_ReferencestableOptionalProperty() {
		return (EReference)totalSampleEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTotalSample_EmfcomboviewerRequiredProperty() {
		return (EAttribute)totalSampleEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTotalSample_EmfcomboviewerOptionalProperty() {
		return (EAttribute)totalSampleEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTotalSample_MultivaluededitorRequiredProperty() {
		return (EAttribute)totalSampleEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTotalSample_MultivaluededitorOptionalProperty() {
		return (EAttribute)totalSampleEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTotalSample_TablecompositionOnSameTypeOptionalProperty() {
		return (EReference)totalSampleEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTotalSample_TablecompositionRequiredProperty() {
		return (EReference)totalSampleEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTotalSample_TablecompositionOptionalProperty() {
		return (EReference)totalSampleEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTotalSample_AdvancedreferencestableRequiredProperty() {
		return (EReference)totalSampleEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTotalSample_AdvancedreferencestableOptionalProperty() {
		return (EReference)totalSampleEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTotalSample_AdvancedeobjectflatcomboviewerRequiredPropery() {
		return (EReference)totalSampleEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTotalSample_AdvancedeobjectflatcomboviewerOptionalPropery() {
		return (EReference)totalSampleEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTotalSample_AdvancedtablecompositionOnSametypeOptionalProperty() {
		return (EReference)totalSampleEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTotalSample_AdvancedtablecompositionRequiredProperty() {
		return (EReference)totalSampleEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTotalSample_AdvancedtablecompositionOptionalProperty() {
		return (EReference)totalSampleEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextSample() {
		return textSampleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextSample_TextRequiredProperty() {
		return (EAttribute)textSampleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextSample_TextOptionalProperty() {
		return (EAttribute)textSampleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCheckboxSample() {
		return checkboxSampleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCheckboxSample_CheckboxRequiredProperty() {
		return (EAttribute)checkboxSampleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCheckboxSample_CheckboxOptionalProperty() {
		return (EAttribute)checkboxSampleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextareaSample() {
		return textareaSampleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextareaSample_TextareaRequiredProperty() {
		return (EAttribute)textareaSampleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextareaSample_TextareaOptionalProperty() {
		return (EAttribute)textareaSampleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRadioSample() {
		return radioSampleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRadioSample_RadioRequiredProperty() {
		return (EAttribute)radioSampleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRadioSample_RadioOptionalProperty() {
		return (EAttribute)radioSampleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEObjectFlatComboViewerSample() {
		return eObjectFlatComboViewerSampleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEObjectFlatComboViewerSample_EobjectflatcomboviewerRequiredPropery() {
		return (EReference)eObjectFlatComboViewerSampleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEObjectFlatComboViewerSample_EobjectflatcomboviewerOptionalPropery() {
		return (EReference)eObjectFlatComboViewerSampleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferencesTableSample() {
		return referencesTableSampleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferencesTableSample_ReferencestableRequiredProperty() {
		return (EReference)referencesTableSampleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferencesTableSample_ReferencestableOptionalProperty() {
		return (EReference)referencesTableSampleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMFComboViewerSample() {
		return emfComboViewerSampleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMFComboViewerSample_EmfcomboviewerRequiredProperty() {
		return (EAttribute)emfComboViewerSampleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMFComboViewerSample_EmfcomboviewerOptionalProperty() {
		return (EAttribute)emfComboViewerSampleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiValuedEditorSample() {
		return multiValuedEditorSampleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiValuedEditorSample_MultivaluededitorRequiredProperty() {
		return (EAttribute)multiValuedEditorSampleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiValuedEditorSample_MultivaluededitorOptionalProperty() {
		return (EAttribute)multiValuedEditorSampleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableCompositionEditorSample() {
		return tableCompositionEditorSampleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableCompositionEditorSample_TablecompositionRequiredProperty() {
		return (EReference)tableCompositionEditorSampleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableCompositionEditorSample_TablecompositionOptionalProperty() {
		return (EReference)tableCompositionEditorSampleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdvancedReferencesTableSample() {
		return advancedReferencesTableSampleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdvancedReferencesTableSample_AdvancedreferencestableRequiredProperty() {
		return (EReference)advancedReferencesTableSampleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdvancedReferencesTableSample_AdvancedreferencestableOptionalProperty() {
		return (EReference)advancedReferencesTableSampleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdvancedEObjectFlatComboViewerSample() {
		return advancedEObjectFlatComboViewerSampleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdvancedEObjectFlatComboViewerSample_AdvancedeobjectflatcomboviewerRequiredProperty() {
		return (EReference)advancedEObjectFlatComboViewerSampleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdvancedEObjectFlatComboViewerSample_AdvancedeobjectflatcomboviewerOptionalProperty() {
		return (EReference)advancedEObjectFlatComboViewerSampleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdvancedTableCompositionEditorSample() {
		return advancedTableCompositionEditorSampleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdvancedTableCompositionEditorSample_AdvancedtablecompositionRequiredProperty() {
		return (EReference)advancedTableCompositionEditorSampleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdvancedTableCompositionEditorSample_AdvancedtablecompositionOptionalProperty() {
		return (EReference)advancedTableCompositionEditorSampleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlatReferencesTableSample() {
		return flatReferencesTableSampleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlatReferencesTableSample_FlatreferencestableRequiredProperty() {
		return (EReference)flatReferencesTableSampleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlatReferencesTableSample_FlatreferencestableOptionalProperty() {
		return (EReference)flatReferencesTableSampleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSample() {
		return sampleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSample_TextRequiredProperty() {
		return (EAttribute)sampleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSample_TextOptionalProperty() {
		return (EAttribute)sampleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextSampleWithTwoTabs() {
		return textSampleWithTwoTabsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextSampleWithTwoTabs_TextRequiredPropertyInFirstTab() {
		return (EAttribute)textSampleWithTwoTabsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextSampleWithTwoTabs_TextOptionalPropertyInFirstTab() {
		return (EAttribute)textSampleWithTwoTabsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextSampleWithTwoTabs_TextRequiredPropertyInSecondTab() {
		return (EAttribute)textSampleWithTwoTabsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextSampleWithTwoTabs_TextOptionalPropertyInSecondTab() {
		return (EAttribute)textSampleWithTwoTabsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableCompositionExtensionEditorSample() {
		return tableCompositionExtensionEditorSampleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableCompositionExtensionEditorSample_TablecompositionRequiredProperty() {
		return (EReference)tableCompositionExtensionEditorSampleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableCompositionExtensionEditorSample_TablecompositionOptionalProperty() {
		return (EReference)tableCompositionExtensionEditorSampleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractTableCompositionTargetExtensionEditorSample() {
		return abstractTableCompositionTargetExtensionEditorSampleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImageViewerSample() {
		return imageViewerSampleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageViewerSample_ImageviewerRequiredProperty() {
		return (EAttribute)imageViewerSampleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageViewerSample_ImageviewerOptionalProperty() {
		return (EAttribute)imageViewerSampleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectionDialogSample() {
		return selectionDialogSampleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelectionDialogSample_SelectionDialogRequiredProperty() {
		return (EAttribute)selectionDialogSampleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelectionDialogSample_SelectionDialogOptionalProperty() {
		return (EAttribute)selectionDialogSampleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleCompositionViewerSample() {
		return singleCompositionViewerSampleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleCompositionViewerSample_SinglecompositionviewSingleRequiredProperty() {
		return (EReference)singleCompositionViewerSampleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleCompositionViewerSample_SinglecompositionviewSingleOptionalProperty() {
		return (EReference)singleCompositionViewerSampleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleCompositionViewerSample_SinglecompositionviewMultiRequiredProperty() {
		return (EReference)singleCompositionViewerSampleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleCompositionViewerSample_SinglecompositionviewMultiOptionalProperty() {
		return (EReference)singleCompositionViewerSampleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getENUM_SAMPLE() {
		return enuM_SAMPLEEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EefnrFactory getEefnrFactory() {
		return (EefnrFactory)getEFactoryInstance();
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
		rootEClass = createEClass(ROOT);
		createEReference(rootEClass, ROOT__SAMPLES);

		abstractSampleEClass = createEClass(ABSTRACT_SAMPLE);
		createEAttribute(abstractSampleEClass, ABSTRACT_SAMPLE__NAME);

		totalSampleEClass = createEClass(TOTAL_SAMPLE);
		createEAttribute(totalSampleEClass, TOTAL_SAMPLE__TEXT_REQUIRED_PROPERTY);
		createEAttribute(totalSampleEClass, TOTAL_SAMPLE__TEXT_OPTIONAL_PROPERTY);
		createEAttribute(totalSampleEClass, TOTAL_SAMPLE__CHECKBOX_REQUIRED_PROPERTY);
		createEAttribute(totalSampleEClass, TOTAL_SAMPLE__CHECKBOX_OPTIONAL_PROPERTY);
		createEAttribute(totalSampleEClass, TOTAL_SAMPLE__TEXTAREA_REQUIRED_PROPERTY);
		createEAttribute(totalSampleEClass, TOTAL_SAMPLE__TEXTAREA_OPTIONAL_PROPERTY);
		createEAttribute(totalSampleEClass, TOTAL_SAMPLE__RADIO_REQUIRED_PROPERTY);
		createEAttribute(totalSampleEClass, TOTAL_SAMPLE__RADIO_OPTIONAL_PROPERTY);
		createEReference(totalSampleEClass, TOTAL_SAMPLE__EOBJECTFLATCOMBOVIEWER_REQUIRED_PROPERTY);
		createEReference(totalSampleEClass, TOTAL_SAMPLE__EOBJECTFLATCOMBOVIEWER_OPTIONAL_PROPERTY);
		createEReference(totalSampleEClass, TOTAL_SAMPLE__REFERENCESTABLE_REQUIRED_PROPERTY);
		createEReference(totalSampleEClass, TOTAL_SAMPLE__REFERENCESTABLE_OPTIONAL_PROPERTY);
		createEAttribute(totalSampleEClass, TOTAL_SAMPLE__EMFCOMBOVIEWER_REQUIRED_PROPERTY);
		createEAttribute(totalSampleEClass, TOTAL_SAMPLE__EMFCOMBOVIEWER_OPTIONAL_PROPERTY);
		createEAttribute(totalSampleEClass, TOTAL_SAMPLE__MULTIVALUEDEDITOR_REQUIRED_PROPERTY);
		createEAttribute(totalSampleEClass, TOTAL_SAMPLE__MULTIVALUEDEDITOR_OPTIONAL_PROPERTY);
		createEReference(totalSampleEClass, TOTAL_SAMPLE__TABLECOMPOSITION_ON_SAME_TYPE_OPTIONAL_PROPERTY);
		createEReference(totalSampleEClass, TOTAL_SAMPLE__ADVANCEDREFERENCESTABLE_REQUIRED_PROPERTY);
		createEReference(totalSampleEClass, TOTAL_SAMPLE__ADVANCEDREFERENCESTABLE_OPTIONAL_PROPERTY);
		createEReference(totalSampleEClass, TOTAL_SAMPLE__ADVANCEDEOBJECTFLATCOMBOVIEWER_REQUIRED_PROPERY);
		createEReference(totalSampleEClass, TOTAL_SAMPLE__ADVANCEDEOBJECTFLATCOMBOVIEWER_OPTIONAL_PROPERY);
		createEReference(totalSampleEClass, TOTAL_SAMPLE__ADVANCEDTABLECOMPOSITION_ON_SAMETYPE_OPTIONAL_PROPERTY);
		createEReference(totalSampleEClass, TOTAL_SAMPLE__ADVANCEDTABLECOMPOSITION_REQUIRED_PROPERTY);
		createEReference(totalSampleEClass, TOTAL_SAMPLE__ADVANCEDTABLECOMPOSITION_OPTIONAL_PROPERTY);
		createEReference(totalSampleEClass, TOTAL_SAMPLE__TABLECOMPOSITION_REQUIRED_PROPERTY);
		createEReference(totalSampleEClass, TOTAL_SAMPLE__TABLECOMPOSITION_OPTIONAL_PROPERTY);

		textSampleEClass = createEClass(TEXT_SAMPLE);
		createEAttribute(textSampleEClass, TEXT_SAMPLE__TEXT_REQUIRED_PROPERTY);
		createEAttribute(textSampleEClass, TEXT_SAMPLE__TEXT_OPTIONAL_PROPERTY);

		checkboxSampleEClass = createEClass(CHECKBOX_SAMPLE);
		createEAttribute(checkboxSampleEClass, CHECKBOX_SAMPLE__CHECKBOX_REQUIRED_PROPERTY);
		createEAttribute(checkboxSampleEClass, CHECKBOX_SAMPLE__CHECKBOX_OPTIONAL_PROPERTY);

		textareaSampleEClass = createEClass(TEXTAREA_SAMPLE);
		createEAttribute(textareaSampleEClass, TEXTAREA_SAMPLE__TEXTAREA_REQUIRED_PROPERTY);
		createEAttribute(textareaSampleEClass, TEXTAREA_SAMPLE__TEXTAREA_OPTIONAL_PROPERTY);

		radioSampleEClass = createEClass(RADIO_SAMPLE);
		createEAttribute(radioSampleEClass, RADIO_SAMPLE__RADIO_REQUIRED_PROPERTY);
		createEAttribute(radioSampleEClass, RADIO_SAMPLE__RADIO_OPTIONAL_PROPERTY);

		eObjectFlatComboViewerSampleEClass = createEClass(EOBJECT_FLAT_COMBO_VIEWER_SAMPLE);
		createEReference(eObjectFlatComboViewerSampleEClass, EOBJECT_FLAT_COMBO_VIEWER_SAMPLE__EOBJECTFLATCOMBOVIEWER_REQUIRED_PROPERY);
		createEReference(eObjectFlatComboViewerSampleEClass, EOBJECT_FLAT_COMBO_VIEWER_SAMPLE__EOBJECTFLATCOMBOVIEWER_OPTIONAL_PROPERY);

		referencesTableSampleEClass = createEClass(REFERENCES_TABLE_SAMPLE);
		createEReference(referencesTableSampleEClass, REFERENCES_TABLE_SAMPLE__REFERENCESTABLE_REQUIRED_PROPERTY);
		createEReference(referencesTableSampleEClass, REFERENCES_TABLE_SAMPLE__REFERENCESTABLE_OPTIONAL_PROPERTY);

		emfComboViewerSampleEClass = createEClass(EMF_COMBO_VIEWER_SAMPLE);
		createEAttribute(emfComboViewerSampleEClass, EMF_COMBO_VIEWER_SAMPLE__EMFCOMBOVIEWER_REQUIRED_PROPERTY);
		createEAttribute(emfComboViewerSampleEClass, EMF_COMBO_VIEWER_SAMPLE__EMFCOMBOVIEWER_OPTIONAL_PROPERTY);

		multiValuedEditorSampleEClass = createEClass(MULTI_VALUED_EDITOR_SAMPLE);
		createEAttribute(multiValuedEditorSampleEClass, MULTI_VALUED_EDITOR_SAMPLE__MULTIVALUEDEDITOR_REQUIRED_PROPERTY);
		createEAttribute(multiValuedEditorSampleEClass, MULTI_VALUED_EDITOR_SAMPLE__MULTIVALUEDEDITOR_OPTIONAL_PROPERTY);

		tableCompositionEditorSampleEClass = createEClass(TABLE_COMPOSITION_EDITOR_SAMPLE);
		createEReference(tableCompositionEditorSampleEClass, TABLE_COMPOSITION_EDITOR_SAMPLE__TABLECOMPOSITION_REQUIRED_PROPERTY);
		createEReference(tableCompositionEditorSampleEClass, TABLE_COMPOSITION_EDITOR_SAMPLE__TABLECOMPOSITION_OPTIONAL_PROPERTY);

		advancedReferencesTableSampleEClass = createEClass(ADVANCED_REFERENCES_TABLE_SAMPLE);
		createEReference(advancedReferencesTableSampleEClass, ADVANCED_REFERENCES_TABLE_SAMPLE__ADVANCEDREFERENCESTABLE_REQUIRED_PROPERTY);
		createEReference(advancedReferencesTableSampleEClass, ADVANCED_REFERENCES_TABLE_SAMPLE__ADVANCEDREFERENCESTABLE_OPTIONAL_PROPERTY);

		advancedEObjectFlatComboViewerSampleEClass = createEClass(ADVANCED_EOBJECT_FLAT_COMBO_VIEWER_SAMPLE);
		createEReference(advancedEObjectFlatComboViewerSampleEClass, ADVANCED_EOBJECT_FLAT_COMBO_VIEWER_SAMPLE__ADVANCEDEOBJECTFLATCOMBOVIEWER_REQUIRED_PROPERTY);
		createEReference(advancedEObjectFlatComboViewerSampleEClass, ADVANCED_EOBJECT_FLAT_COMBO_VIEWER_SAMPLE__ADVANCEDEOBJECTFLATCOMBOVIEWER_OPTIONAL_PROPERTY);

		advancedTableCompositionEditorSampleEClass = createEClass(ADVANCED_TABLE_COMPOSITION_EDITOR_SAMPLE);
		createEReference(advancedTableCompositionEditorSampleEClass, ADVANCED_TABLE_COMPOSITION_EDITOR_SAMPLE__ADVANCEDTABLECOMPOSITION_REQUIRED_PROPERTY);
		createEReference(advancedTableCompositionEditorSampleEClass, ADVANCED_TABLE_COMPOSITION_EDITOR_SAMPLE__ADVANCEDTABLECOMPOSITION_OPTIONAL_PROPERTY);

		flatReferencesTableSampleEClass = createEClass(FLAT_REFERENCES_TABLE_SAMPLE);
		createEReference(flatReferencesTableSampleEClass, FLAT_REFERENCES_TABLE_SAMPLE__FLATREFERENCESTABLE_REQUIRED_PROPERTY);
		createEReference(flatReferencesTableSampleEClass, FLAT_REFERENCES_TABLE_SAMPLE__FLATREFERENCESTABLE_OPTIONAL_PROPERTY);

		sampleEClass = createEClass(SAMPLE);
		createEAttribute(sampleEClass, SAMPLE__TEXT_REQUIRED_PROPERTY);
		createEAttribute(sampleEClass, SAMPLE__TEXT_OPTIONAL_PROPERTY);

		textSampleWithTwoTabsEClass = createEClass(TEXT_SAMPLE_WITH_TWO_TABS);
		createEAttribute(textSampleWithTwoTabsEClass, TEXT_SAMPLE_WITH_TWO_TABS__TEXT_REQUIRED_PROPERTY_IN_FIRST_TAB);
		createEAttribute(textSampleWithTwoTabsEClass, TEXT_SAMPLE_WITH_TWO_TABS__TEXT_OPTIONAL_PROPERTY_IN_FIRST_TAB);
		createEAttribute(textSampleWithTwoTabsEClass, TEXT_SAMPLE_WITH_TWO_TABS__TEXT_REQUIRED_PROPERTY_IN_SECOND_TAB);
		createEAttribute(textSampleWithTwoTabsEClass, TEXT_SAMPLE_WITH_TWO_TABS__TEXT_OPTIONAL_PROPERTY_IN_SECOND_TAB);

		tableCompositionExtensionEditorSampleEClass = createEClass(TABLE_COMPOSITION_EXTENSION_EDITOR_SAMPLE);
		createEReference(tableCompositionExtensionEditorSampleEClass, TABLE_COMPOSITION_EXTENSION_EDITOR_SAMPLE__TABLECOMPOSITION_REQUIRED_PROPERTY);
		createEReference(tableCompositionExtensionEditorSampleEClass, TABLE_COMPOSITION_EXTENSION_EDITOR_SAMPLE__TABLECOMPOSITION_OPTIONAL_PROPERTY);

		abstractTableCompositionTargetExtensionEditorSampleEClass = createEClass(ABSTRACT_TABLE_COMPOSITION_TARGET_EXTENSION_EDITOR_SAMPLE);

		namedElementEClass = createEClass(NAMED_ELEMENT);

		imageViewerSampleEClass = createEClass(IMAGE_VIEWER_SAMPLE);
		createEAttribute(imageViewerSampleEClass, IMAGE_VIEWER_SAMPLE__IMAGEVIEWER_REQUIRED_PROPERTY);
		createEAttribute(imageViewerSampleEClass, IMAGE_VIEWER_SAMPLE__IMAGEVIEWER_OPTIONAL_PROPERTY);

		selectionDialogSampleEClass = createEClass(SELECTION_DIALOG_SAMPLE);
		createEAttribute(selectionDialogSampleEClass, SELECTION_DIALOG_SAMPLE__SELECTION_DIALOG_REQUIRED_PROPERTY);
		createEAttribute(selectionDialogSampleEClass, SELECTION_DIALOG_SAMPLE__SELECTION_DIALOG_OPTIONAL_PROPERTY);

		singleCompositionViewerSampleEClass = createEClass(SINGLE_COMPOSITION_VIEWER_SAMPLE);
		createEReference(singleCompositionViewerSampleEClass, SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_SINGLE_REQUIRED_PROPERTY);
		createEReference(singleCompositionViewerSampleEClass, SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_SINGLE_OPTIONAL_PROPERTY);
		createEReference(singleCompositionViewerSampleEClass, SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_REQUIRED_PROPERTY);
		createEReference(singleCompositionViewerSampleEClass, SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_OPTIONAL_PROPERTY);

		// Create enums
		enuM_SAMPLEEEnum = createEEnum(ENUM_SAMPLE);
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
		ReferencesPackage theReferencesPackage = (ReferencesPackage)EPackage.Registry.INSTANCE.getEPackage(ReferencesPackage.eNS_URI);
		NavigationPackage theNavigationPackage = (NavigationPackage)EPackage.Registry.INSTANCE.getEPackage(NavigationPackage.eNS_URI);
		FiltersPackage theFiltersPackage = (FiltersPackage)EPackage.Registry.INSTANCE.getEPackage(FiltersPackage.eNS_URI);
		CustomNamingPackage theCustomNamingPackage = (CustomNamingPackage)EPackage.Registry.INSTANCE.getEPackage(CustomNamingPackage.eNS_URI);
		InterfacePackage theInterfacePackage = (InterfacePackage)EPackage.Registry.INSTANCE.getEPackage(InterfacePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theReferencesPackage);
		getESubpackages().add(theNavigationPackage);
		getESubpackages().add(theFiltersPackage);
		getESubpackages().add(theCustomNamingPackage);
		getESubpackages().add(theInterfacePackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		totalSampleEClass.getESuperTypes().add(this.getAbstractSample());
		textSampleEClass.getESuperTypes().add(this.getAbstractSample());
		checkboxSampleEClass.getESuperTypes().add(this.getAbstractSample());
		textareaSampleEClass.getESuperTypes().add(this.getAbstractSample());
		radioSampleEClass.getESuperTypes().add(this.getAbstractSample());
		eObjectFlatComboViewerSampleEClass.getESuperTypes().add(this.getAbstractSample());
		referencesTableSampleEClass.getESuperTypes().add(this.getAbstractSample());
		emfComboViewerSampleEClass.getESuperTypes().add(this.getAbstractSample());
		multiValuedEditorSampleEClass.getESuperTypes().add(this.getAbstractSample());
		tableCompositionEditorSampleEClass.getESuperTypes().add(this.getAbstractSample());
		advancedReferencesTableSampleEClass.getESuperTypes().add(this.getAbstractSample());
		advancedEObjectFlatComboViewerSampleEClass.getESuperTypes().add(this.getAbstractSample());
		advancedTableCompositionEditorSampleEClass.getESuperTypes().add(this.getAbstractSample());
		flatReferencesTableSampleEClass.getESuperTypes().add(this.getAbstractSample());
		sampleEClass.getESuperTypes().add(this.getAbstractSample());
		textSampleWithTwoTabsEClass.getESuperTypes().add(this.getAbstractSample());
		tableCompositionExtensionEditorSampleEClass.getESuperTypes().add(this.getAbstractSample());
		abstractTableCompositionTargetExtensionEditorSampleEClass.getESuperTypes().add(this.getAbstractSample());
		namedElementEClass.getESuperTypes().add(this.getAbstractSample());
		imageViewerSampleEClass.getESuperTypes().add(this.getAbstractSample());
		selectionDialogSampleEClass.getESuperTypes().add(this.getAbstractSample());
		singleCompositionViewerSampleEClass.getESuperTypes().add(this.getAbstractSample());

		// Initialize classes and features; add operations and parameters
		initEClass(rootEClass, Root.class, "Root", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoot_Samples(), this.getAbstractSample(), null, "samples", null, 0, -1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractSampleEClass, AbstractSample.class, "AbstractSample", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractSample_Name(), ecorePackage.getEString(), "name", null, 0, 1, AbstractSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(totalSampleEClass, TotalSample.class, "TotalSample", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTotalSample_TextRequiredProperty(), ecorePackage.getEString(), "textRequiredProperty", null, 1, 1, TotalSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTotalSample_TextOptionalProperty(), ecorePackage.getEString(), "textOptionalProperty", null, 0, 1, TotalSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTotalSample_CheckboxRequiredProperty(), ecorePackage.getEBoolean(), "checkboxRequiredProperty", null, 1, 1, TotalSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTotalSample_CheckboxOptionalProperty(), ecorePackage.getEBoolean(), "checkboxOptionalProperty", null, 0, 1, TotalSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTotalSample_TextareaRequiredProperty(), ecorePackage.getEString(), "textareaRequiredProperty", null, 1, 1, TotalSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTotalSample_TextareaOptionalProperty(), ecorePackage.getEString(), "textareaOptionalProperty", null, 0, 1, TotalSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTotalSample_RadioRequiredProperty(), this.getENUM_SAMPLE(), "radioRequiredProperty", null, 1, 1, TotalSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTotalSample_RadioOptionalProperty(), this.getENUM_SAMPLE(), "radioOptionalProperty", null, 0, 1, TotalSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTotalSample_EobjectflatcomboviewerRequiredProperty(), this.getTotalSample(), null, "eobjectflatcomboviewerRequiredProperty", null, 1, 1, TotalSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTotalSample_EobjectflatcomboviewerOptionalProperty(), this.getTotalSample(), null, "eobjectflatcomboviewerOptionalProperty", null, 0, 1, TotalSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTotalSample_ReferencestableRequiredProperty(), this.getTotalSample(), null, "referencestableRequiredProperty", null, 1, -1, TotalSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTotalSample_ReferencestableOptionalProperty(), this.getTotalSample(), null, "referencestableOptionalProperty", null, 0, -1, TotalSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTotalSample_EmfcomboviewerRequiredProperty(), this.getENUM_SAMPLE(), "emfcomboviewerRequiredProperty", null, 1, 1, TotalSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTotalSample_EmfcomboviewerOptionalProperty(), this.getENUM_SAMPLE(), "emfcomboviewerOptionalProperty", null, 0, 1, TotalSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTotalSample_MultivaluededitorRequiredProperty(), ecorePackage.getEString(), "multivaluededitorRequiredProperty", null, 1, -1, TotalSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTotalSample_MultivaluededitorOptionalProperty(), ecorePackage.getEString(), "multivaluededitorOptionalProperty", null, 0, -1, TotalSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTotalSample_TablecompositionOnSameTypeOptionalProperty(), this.getTotalSample(), null, "tablecompositionOnSameTypeOptionalProperty", null, 0, -1, TotalSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTotalSample_AdvancedreferencestableRequiredProperty(), this.getTotalSample(), null, "advancedreferencestableRequiredProperty", null, 1, -1, TotalSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTotalSample_AdvancedreferencestableOptionalProperty(), this.getTotalSample(), null, "advancedreferencestableOptionalProperty", null, 0, -1, TotalSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTotalSample_AdvancedeobjectflatcomboviewerRequiredPropery(), this.getTotalSample(), null, "advancedeobjectflatcomboviewerRequiredPropery", null, 1, 1, TotalSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTotalSample_AdvancedeobjectflatcomboviewerOptionalPropery(), this.getTotalSample(), null, "advancedeobjectflatcomboviewerOptionalPropery", null, 0, 1, TotalSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTotalSample_AdvancedtablecompositionOnSametypeOptionalProperty(), this.getTotalSample(), null, "advancedtablecompositionOnSametypeOptionalProperty", null, 0, -1, TotalSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTotalSample_AdvancedtablecompositionRequiredProperty(), this.getSample(), null, "advancedtablecompositionRequiredProperty", null, 1, -1, TotalSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTotalSample_AdvancedtablecompositionOptionalProperty(), this.getSample(), null, "advancedtablecompositionOptionalProperty", null, 0, -1, TotalSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTotalSample_TablecompositionRequiredProperty(), this.getSample(), null, "tablecompositionRequiredProperty", null, 1, -1, TotalSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTotalSample_TablecompositionOptionalProperty(), this.getSample(), null, "tablecompositionOptionalProperty", null, 0, -1, TotalSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textSampleEClass, TextSample.class, "TextSample", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextSample_TextRequiredProperty(), ecorePackage.getEString(), "textRequiredProperty", null, 1, 1, TextSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextSample_TextOptionalProperty(), ecorePackage.getEString(), "textOptionalProperty", null, 0, 1, TextSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(checkboxSampleEClass, CheckboxSample.class, "CheckboxSample", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCheckboxSample_CheckboxRequiredProperty(), ecorePackage.getEBoolean(), "checkboxRequiredProperty", null, 1, 1, CheckboxSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCheckboxSample_CheckboxOptionalProperty(), ecorePackage.getEBoolean(), "checkboxOptionalProperty", null, 0, 1, CheckboxSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textareaSampleEClass, TextareaSample.class, "TextareaSample", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextareaSample_TextareaRequiredProperty(), ecorePackage.getEString(), "textareaRequiredProperty", null, 1, 1, TextareaSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextareaSample_TextareaOptionalProperty(), ecorePackage.getEString(), "textareaOptionalProperty", null, 0, 1, TextareaSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(radioSampleEClass, RadioSample.class, "RadioSample", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRadioSample_RadioRequiredProperty(), this.getENUM_SAMPLE(), "radioRequiredProperty", null, 1, 1, RadioSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRadioSample_RadioOptionalProperty(), this.getENUM_SAMPLE(), "radioOptionalProperty", null, 0, 1, RadioSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eObjectFlatComboViewerSampleEClass, EObjectFlatComboViewerSample.class, "EObjectFlatComboViewerSample", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEObjectFlatComboViewerSample_EobjectflatcomboviewerRequiredPropery(), this.getTotalSample(), null, "eobjectflatcomboviewerRequiredPropery", null, 1, 1, EObjectFlatComboViewerSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEObjectFlatComboViewerSample_EobjectflatcomboviewerOptionalPropery(), this.getTotalSample(), null, "eobjectflatcomboviewerOptionalPropery", null, 0, 1, EObjectFlatComboViewerSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referencesTableSampleEClass, ReferencesTableSample.class, "ReferencesTableSample", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferencesTableSample_ReferencestableRequiredProperty(), this.getTotalSample(), null, "referencestableRequiredProperty", null, 1, -1, ReferencesTableSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReferencesTableSample_ReferencestableOptionalProperty(), this.getTotalSample(), null, "referencestableOptionalProperty", null, 0, -1, ReferencesTableSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emfComboViewerSampleEClass, EMFComboViewerSample.class, "EMFComboViewerSample", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEMFComboViewerSample_EmfcomboviewerRequiredProperty(), this.getENUM_SAMPLE(), "emfcomboviewerRequiredProperty", null, 1, 1, EMFComboViewerSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMFComboViewerSample_EmfcomboviewerOptionalProperty(), this.getENUM_SAMPLE(), "emfcomboviewerOptionalProperty", null, 0, 1, EMFComboViewerSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiValuedEditorSampleEClass, MultiValuedEditorSample.class, "MultiValuedEditorSample", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultiValuedEditorSample_MultivaluededitorRequiredProperty(), ecorePackage.getEString(), "multivaluededitorRequiredProperty", null, 1, -1, MultiValuedEditorSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiValuedEditorSample_MultivaluededitorOptionalProperty(), ecorePackage.getEString(), "multivaluededitorOptionalProperty", null, 0, -1, MultiValuedEditorSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableCompositionEditorSampleEClass, TableCompositionEditorSample.class, "TableCompositionEditorSample", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTableCompositionEditorSample_TablecompositionRequiredProperty(), this.getSample(), null, "tablecompositionRequiredProperty", null, 1, -1, TableCompositionEditorSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTableCompositionEditorSample_TablecompositionOptionalProperty(), this.getSample(), null, "tablecompositionOptionalProperty", null, 0, -1, TableCompositionEditorSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(advancedReferencesTableSampleEClass, AdvancedReferencesTableSample.class, "AdvancedReferencesTableSample", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdvancedReferencesTableSample_AdvancedreferencestableRequiredProperty(), this.getTotalSample(), null, "advancedreferencestableRequiredProperty", null, 1, -1, AdvancedReferencesTableSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdvancedReferencesTableSample_AdvancedreferencestableOptionalProperty(), this.getTotalSample(), null, "advancedreferencestableOptionalProperty", null, 0, -1, AdvancedReferencesTableSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(advancedEObjectFlatComboViewerSampleEClass, AdvancedEObjectFlatComboViewerSample.class, "AdvancedEObjectFlatComboViewerSample", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdvancedEObjectFlatComboViewerSample_AdvancedeobjectflatcomboviewerRequiredProperty(), this.getTotalSample(), null, "advancedeobjectflatcomboviewerRequiredProperty", null, 1, 1, AdvancedEObjectFlatComboViewerSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdvancedEObjectFlatComboViewerSample_AdvancedeobjectflatcomboviewerOptionalProperty(), this.getTotalSample(), null, "advancedeobjectflatcomboviewerOptionalProperty", null, 0, 1, AdvancedEObjectFlatComboViewerSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(advancedTableCompositionEditorSampleEClass, AdvancedTableCompositionEditorSample.class, "AdvancedTableCompositionEditorSample", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdvancedTableCompositionEditorSample_AdvancedtablecompositionRequiredProperty(), this.getSample(), null, "advancedtablecompositionRequiredProperty", null, 1, -1, AdvancedTableCompositionEditorSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdvancedTableCompositionEditorSample_AdvancedtablecompositionOptionalProperty(), this.getSample(), null, "advancedtablecompositionOptionalProperty", null, 0, -1, AdvancedTableCompositionEditorSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flatReferencesTableSampleEClass, FlatReferencesTableSample.class, "FlatReferencesTableSample", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFlatReferencesTableSample_FlatreferencestableRequiredProperty(), this.getTotalSample(), null, "flatreferencestableRequiredProperty", null, 1, -1, FlatReferencesTableSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlatReferencesTableSample_FlatreferencestableOptionalProperty(), this.getTotalSample(), null, "flatreferencestableOptionalProperty", null, 0, -1, FlatReferencesTableSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sampleEClass, Sample.class, "Sample", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSample_TextRequiredProperty(), ecorePackage.getEString(), "textRequiredProperty", null, 1, 1, Sample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSample_TextOptionalProperty(), ecorePackage.getEString(), "textOptionalProperty", null, 0, 1, Sample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textSampleWithTwoTabsEClass, TextSampleWithTwoTabs.class, "TextSampleWithTwoTabs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextSampleWithTwoTabs_TextRequiredPropertyInFirstTab(), ecorePackage.getEString(), "textRequiredPropertyInFirstTab", null, 1, 1, TextSampleWithTwoTabs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextSampleWithTwoTabs_TextOptionalPropertyInFirstTab(), ecorePackage.getEString(), "textOptionalPropertyInFirstTab", null, 0, 1, TextSampleWithTwoTabs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextSampleWithTwoTabs_TextRequiredPropertyInSecondTab(), ecorePackage.getEString(), "textRequiredPropertyInSecondTab", null, 1, 1, TextSampleWithTwoTabs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextSampleWithTwoTabs_TextOptionalPropertyInSecondTab(), ecorePackage.getEString(), "textOptionalPropertyInSecondTab", null, 0, 1, TextSampleWithTwoTabs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableCompositionExtensionEditorSampleEClass, TableCompositionExtensionEditorSample.class, "TableCompositionExtensionEditorSample", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTableCompositionExtensionEditorSample_TablecompositionRequiredProperty(), this.getAbstractTableCompositionTargetExtensionEditorSample(), null, "tablecompositionRequiredProperty", null, 1, -1, TableCompositionExtensionEditorSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTableCompositionExtensionEditorSample_TablecompositionOptionalProperty(), this.getAbstractTableCompositionTargetExtensionEditorSample(), null, "tablecompositionOptionalProperty", null, 0, -1, TableCompositionExtensionEditorSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractTableCompositionTargetExtensionEditorSampleEClass, AbstractTableCompositionTargetExtensionEditorSample.class, "AbstractTableCompositionTargetExtensionEditorSample", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(imageViewerSampleEClass, ImageViewerSample.class, "ImageViewerSample", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImageViewerSample_ImageviewerRequiredProperty(), ecorePackage.getEString(), "imageviewerRequiredProperty", null, 1, 1, ImageViewerSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageViewerSample_ImageviewerOptionalProperty(), ecorePackage.getEString(), "imageviewerOptionalProperty", null, 0, 1, ImageViewerSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectionDialogSampleEClass, SelectionDialogSample.class, "SelectionDialogSample", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSelectionDialogSample_SelectionDialogRequiredProperty(), ecorePackage.getEString(), "selectionDialogRequiredProperty", null, 1, 1, SelectionDialogSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSelectionDialogSample_SelectionDialogOptionalProperty(), ecorePackage.getEString(), "selectionDialogOptionalProperty", null, 0, 1, SelectionDialogSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(singleCompositionViewerSampleEClass, SingleCompositionViewerSample.class, "SingleCompositionViewerSample", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSingleCompositionViewerSample_SinglecompositionviewSingleRequiredProperty(), this.getSample(), null, "singlecompositionviewSingleRequiredProperty", null, 1, 1, SingleCompositionViewerSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSingleCompositionViewerSample_SinglecompositionviewSingleOptionalProperty(), this.getSample(), null, "singlecompositionviewSingleOptionalProperty", null, 0, 1, SingleCompositionViewerSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSingleCompositionViewerSample_SinglecompositionviewMultiRequiredProperty(), this.getAbstractSample(), null, "singlecompositionviewMultiRequiredProperty", null, 1, 1, SingleCompositionViewerSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSingleCompositionViewerSample_SinglecompositionviewMultiOptionalProperty(), this.getAbstractSample(), null, "singlecompositionviewMultiOptionalProperty", null, 0, 1, SingleCompositionViewerSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(enuM_SAMPLEEEnum, org.eclipse.emf.eef.eefnr.ENUM_SAMPLE.class, "ENUM_SAMPLE");
		addEEnumLiteral(enuM_SAMPLEEEnum, org.eclipse.emf.eef.eefnr.ENUM_SAMPLE.LITERAL1);
		addEEnumLiteral(enuM_SAMPLEEEnum, org.eclipse.emf.eef.eefnr.ENUM_SAMPLE.LITERAL2);
		addEEnumLiteral(enuM_SAMPLEEEnum, org.eclipse.emf.eef.eefnr.ENUM_SAMPLE.LITERAL3);

		// Create resource
		createResource(eNS_URI);
	}

} //EefnrPackageImpl
