/**
 * Generated with Acceleo
 */
package org.eclipse.emf.eef.extended.query.providers;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.eef.extended.query.util.QueryAdapterFactory;


/**
 * 
 * 
 */
public class QueryEEFAdapterFactory extends QueryAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.extended.query.util.QueryAdapterFactory#createOCLQueryAdapter()
	 * 
	 */
	public Adapter createOCLQueryAdapter() {
		return new OCLQueryPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.extended.query.util.QueryAdapterFactory#createExplicitPathQueryAdapter()
	 * 
	 */
	public Adapter createExplicitPathQueryAdapter() {
		return new ExplicitPathQueryPropertiesEditionProvider();
	}

}
