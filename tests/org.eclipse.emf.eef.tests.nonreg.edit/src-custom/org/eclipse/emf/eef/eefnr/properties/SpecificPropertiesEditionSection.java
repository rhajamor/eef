/**
 * 
 */
package org.eclipse.emf.eef.eefnr.properties;

import java.util.Collection;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

/**
 * @author glefur
 *
 */
public class SpecificPropertiesEditionSection /*extends PropertiesEditionSection*/ {
	
	private ResourceSet resourceSet;

	/**
	 * 
	 */
	public SpecificPropertiesEditionSection() {
		super();
		IWorkbenchPart activePart = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActivePart();
		EditingDomain domain = EditingUtils.getResourceSetFromEditor(activePart);
		if (domain instanceof AdapterFactoryEditingDomain) {
			AdapterFactoryEditingDomain afed = (AdapterFactoryEditingDomain) domain;
			this.resourceSet = afed.getResourceSet();
			loadAllMetamodels();
		}
	}
	
	private void loadAllMetamodels() {
		Registry registry = EPackage.Registry.INSTANCE;
		Collection<Object> values = registry.values();
		for (Object ePackage : values) {
			if (ePackage instanceof EPackage)
				this.resourceSet.getResources().add(((EPackage) ePackage).eResource());			
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.ui.properties.sections.PropertiesEditionSection#initSemanticContents(java.lang.String)
	 */
	protected void initSemanticContents(String descriptor) {
		//propertiesEditionComponent.initPart(propertiesEditionComponent.translatePart(descriptor), 1, eObject, resourceSet);
	}
	


}
