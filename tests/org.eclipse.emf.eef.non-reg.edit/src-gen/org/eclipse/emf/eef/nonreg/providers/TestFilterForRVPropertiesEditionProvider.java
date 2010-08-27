/**
 * Generated with Acceleo
 */
package org.eclipse.emf.eef.nonreg.providers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.nonreg.components.TestFilterForRVPropertiesEditionComponent;
import org.eclipse.emf.eef.nonreg.components.TestFilterForRVTestFilterPropertiesEditionComponent;
import org.eclipse.emf.eef.nonreg.components.TestFilterForRVTestVRFilterPropertiesEditionComponent;
import org.eclipse.emf.eef.nonreg.components.TestFilterForReferenceTablesPropertiesEditionComponent;
import org.eclipse.emf.eef.nonreg.subPackageNonRegForFilters.ForFilters;
import org.eclipse.emf.eef.nonreg.subPackageNonRegForFilters.SubPackageNonRegForFiltersPackage;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionProvider;

/**
 * 
 * @generated
 */
public class TestFilterForRVPropertiesEditionProvider implements IPropertiesEditionProvider {

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionProvider#provides(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public boolean provides(EObject eObject) {
    return (eObject instanceof ForFilters) && (SubPackageNonRegForFiltersPackage.eINSTANCE.getForFilters() == eObject.eClass());
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionProvider#provides(org.eclipse.emf.ecore.EObject, java.lang.String)
	 * @generated
	 */
	public boolean provides(EObject eObject, String part) {
    return (eObject instanceof ForFilters) && (TestFilterForRVTestFilterPropertiesEditionComponent.TESTFILTER_PART.equals(part) || TestFilterForRVTestVRFilterPropertiesEditionComponent.TESTVRFILTER_PART.equals(part) || TestFilterForReferenceTablesPropertiesEditionComponent.TESTFILTER_PART.equals(part));
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionProvider#provides(org.eclipse.emf.ecore.EObject, java.lang.Class)
	 * @generated
	 */
	public boolean provides(EObject eObject, java.lang.Class refinement) {
    return (eObject instanceof ForFilters) && (refinement == TestFilterForRVTestFilterPropertiesEditionComponent.class || refinement == TestFilterForRVTestVRFilterPropertiesEditionComponent.class || refinement == TestFilterForReferenceTablesPropertiesEditionComponent.class);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionProvider#provides(org.eclipse.emf.ecore.EObject, java.lang.String, java.lang.Class)
	 * @generated
	 */
	public boolean provides(EObject eObject, String part, java.lang.Class refinement) {
    return (eObject instanceof ForFilters) && ((TestFilterForRVTestFilterPropertiesEditionComponent.TESTFILTER_PART.equals(part) && refinement == TestFilterForRVTestFilterPropertiesEditionComponent.class) || (TestFilterForRVTestVRFilterPropertiesEditionComponent.TESTVRFILTER_PART.equals(part) && refinement == TestFilterForRVTestVRFilterPropertiesEditionComponent.class) || (TestFilterForReferenceTablesPropertiesEditionComponent.TESTFILTER_PART.equals(part) && refinement == TestFilterForReferenceTablesPropertiesEditionComponent.class));
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionProvider#getPropertiesEditionComponent(org.eclipse.emf.ecore.EObject,
	 *  java.lang.String)
	 * @generated
	 */
	public IPropertiesEditionComponent getPropertiesEditionComponent(EObject eObject, String editing_mode) {
    if (eObject instanceof ForFilters) {
      return new TestFilterForRVPropertiesEditionComponent(eObject, editing_mode);
    }
    return null;
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionProvider#getPropertiesEditionComponent(org.eclipse.emf.ecore.EObject,
	 *  java.lang.String, java.lang.String)
	 * @generated
	 */
	public IPropertiesEditionComponent getPropertiesEditionComponent(EObject eObject, String editing_mode, String part) {
    if (eObject instanceof ForFilters) {
      if (TestFilterForRVTestFilterPropertiesEditionComponent.TESTFILTER_PART.equals(part))
        return new TestFilterForRVTestFilterPropertiesEditionComponent(eObject, editing_mode);
      if (TestFilterForRVTestVRFilterPropertiesEditionComponent.TESTVRFILTER_PART.equals(part))
        return new TestFilterForRVTestVRFilterPropertiesEditionComponent(eObject, editing_mode);
      if (TestFilterForReferenceTablesPropertiesEditionComponent.TESTFILTER_PART.equals(part))
        return new TestFilterForReferenceTablesPropertiesEditionComponent(eObject, editing_mode);
    }
    return null;
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionProvider#getPropertiesEditionComponent(org.eclipse.emf.ecore.EObject,
	 *  java.lang.String, java.lang.String, java.lang.Class)
	 * @generated
	 */
	public IPropertiesEditionComponent getPropertiesEditionComponent(EObject eObject, String editing_mode, String part, java.lang.Class refinement) {
    if (eObject instanceof ForFilters) {
      if (TestFilterForRVTestFilterPropertiesEditionComponent.TESTFILTER_PART.equals(part)
        && refinement == TestFilterForRVTestFilterPropertiesEditionComponent.class)
        return new TestFilterForRVTestFilterPropertiesEditionComponent(eObject, editing_mode);
      if (TestFilterForRVTestVRFilterPropertiesEditionComponent.TESTVRFILTER_PART.equals(part)
        && refinement == TestFilterForRVTestVRFilterPropertiesEditionComponent.class)
        return new TestFilterForRVTestVRFilterPropertiesEditionComponent(eObject, editing_mode);
      if (TestFilterForReferenceTablesPropertiesEditionComponent.TESTFILTER_PART.equals(part)
        && refinement == TestFilterForReferenceTablesPropertiesEditionComponent.class)
        return new TestFilterForReferenceTablesPropertiesEditionComponent(eObject, editing_mode);
    }
    return null;
  }

}
