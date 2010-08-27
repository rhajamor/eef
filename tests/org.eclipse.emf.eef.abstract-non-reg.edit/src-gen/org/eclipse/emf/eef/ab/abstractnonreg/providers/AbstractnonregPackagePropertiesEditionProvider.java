/**
 * Generated with Acceleo
 */
package org.eclipse.emf.eef.ab.abstractnonreg.providers;

import org.eclipse.emf.eef.runtime.impl.providers.ComposedPropertiesEditionProvider;

/**
 * 
 * 
 */
public class AbstractnonregPackagePropertiesEditionProvider extends ComposedPropertiesEditionProvider {

	/**
	 * Default Constructor
	 * 
	 */
	public AbstractnonregPackagePropertiesEditionProvider() {
		super();
		append(createDocumentedElementPropertiesEditionProvider());
	}

	/**
	 * This keeps track of the one PropertiesEditionProvider used for all
	 * DocumentedElement instances.
	 * 
	 */
	protected DocumentedElementPropertiesEditionProvider documentedElementPropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a DocumentedElement
	 * 
	 */
	public DocumentedElementPropertiesEditionProvider createDocumentedElementPropertiesEditionProvider() {
		if (documentedElementPropertiesEditionProvider == null)
			documentedElementPropertiesEditionProvider = new DocumentedElementPropertiesEditionProvider();
		return documentedElementPropertiesEditionProvider;
	}

}
