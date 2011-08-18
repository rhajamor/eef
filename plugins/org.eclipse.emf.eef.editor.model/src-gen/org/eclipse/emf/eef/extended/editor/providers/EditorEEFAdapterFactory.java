/**
 * Generated with Acceleo
 */
package org.eclipse.emf.eef.extended.editor.providers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.eef.extended.editor.util.EditorAdapterFactory;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;


/**
 * 
 * 
 */
public class EditorEEFAdapterFactory extends EditorAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.extended.editor.util.EditorAdapterFactory#createStandardFormPageAdapter()
	 * 
	 */
	public Adapter createStandardFormPageAdapter() {
		List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(1);
		providers.add((PropertiesEditingProvider)createDocumentedElementAdapter());
		return new StandardFormPagePropertiesEditionProvider(providers);
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.extended.editor.util.EditorAdapterFactory#createEEFMasterPageAdapter()
	 * 
	 */
	public Adapter createEEFMasterPageAdapter() {
		List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(1);
		providers.add((PropertiesEditingProvider)createDocumentedElementAdapter());
		return new EEFMasterPagePropertiesEditionProvider(providers);
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.extended.editor.util.EditorAdapterFactory#createTreeMasterPageAdapter()
	 * 
	 */
	public Adapter createTreeMasterPageAdapter() {
		List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(1);
		providers.add((PropertiesEditingProvider)createDocumentedElementAdapter());
		return new TreeMasterPagePropertiesEditionProvider(providers);
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.extended.editor.util.EditorAdapterFactory#createPartFilterAdapter()
	 * 
	 */
	public Adapter createPartFilterAdapter() {
		List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(1);
		providers.add((PropertiesEditingProvider)createDocumentedElementAdapter());
		return new PartFilterPropertiesEditionProvider(providers);
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.extended.editor.util.EditorAdapterFactory#createEEFEditorContributionsAdapter()
	 * 
	 */
	public Adapter createEEFEditorContributionsAdapter() {
		List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(1);
		providers.add((PropertiesEditingProvider)createDocumentedElementAdapter());
		return new EEFEditorContributionsPropertiesEditionProvider(providers);
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.extended.editor.util.EditorAdapterFactory#createEEFEditorPagesAdapter()
	 * 
	 */
	public Adapter createEEFEditorPagesAdapter() {
		List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(1);
		providers.add((PropertiesEditingProvider)createDocumentedElementAdapter());
		return new EEFEditorPagesPropertiesEditionProvider(providers);
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.extended.editor.util.EditorAdapterFactory#createStaticEEFEditorContributionAdapter()
	 * 
	 */
	public Adapter createStaticEEFEditorContributionAdapter() {
		List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(1);
		providers.add((PropertiesEditingProvider)createDocumentedElementAdapter());
		return new StaticEEFEditorContributionPropertiesEditionProvider(providers);
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.extended.editor.util.EditorAdapterFactory#createDynamicEEFEditorContributionAdapter()
	 * 
	 */
	public Adapter createDynamicEEFEditorContributionAdapter() {
		List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(1);
		providers.add((PropertiesEditingProvider)createDocumentedElementAdapter());
		return new DynamicEEFEditorContributionPropertiesEditionProvider(providers);
	}

}
