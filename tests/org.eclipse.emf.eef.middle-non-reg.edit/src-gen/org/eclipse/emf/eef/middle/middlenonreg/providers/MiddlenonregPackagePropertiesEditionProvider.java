/**
 * Generated with Acceleo
 */
package org.eclipse.emf.eef.middle.middlenonreg.providers;

import org.eclipse.emf.eef.runtime.impl.providers.ComposedPropertiesEditionProvider;

/**
 * 
 * 
 */
public class MiddlenonregPackagePropertiesEditionProvider extends ComposedPropertiesEditionProvider {

	/**
	 * Default Constructor
	 * 
	 */
	public MiddlenonregPackagePropertiesEditionProvider() {
		super();
		append(createNamedElementPropertiesEditionProvider());
	}

	/**
	 * This keeps track of the one PropertiesEditionProvider used for all
	 * NamedElement instances.
	 * 
	 */
	protected NamedElementPropertiesEditionProvider namedElementPropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a NamedElement
	 * 
	 */
	public NamedElementPropertiesEditionProvider createNamedElementPropertiesEditionProvider() {
		if (namedElementPropertiesEditionProvider == null)
			namedElementPropertiesEditionProvider = new NamedElementPropertiesEditionProvider();
		return namedElementPropertiesEditionProvider;
	}

}
