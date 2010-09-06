/*******************************************************************************
 * Copyright (c) 2008, 2010 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.runtime.ui.widgets;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.impl.utils.EEFUtils;
import org.eclipse.emf.eef.runtime.impl.utils.ModelViewerHelper;
import org.eclipse.emf.eef.runtime.ui.utils.EEFRuntimeUIMessages;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.viewers.AbstractTreeViewer;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.dialogs.FilteredTree;
import org.eclipse.ui.dialogs.PatternFilter;

/**
 * This dialog shows the tree of all owned element by taking in account a filter
 * 
 * @author Patrick Tessier
 * @author <a href="mailto:jerome.benois@obeo.fr">Jerome Benois</a>
 * @author <a href="mailto:stephane.bouchet@obeo.fr">Stephane Bouchet</a>
 */
public abstract class TabElementTreeSelectionDialog<T extends EObject> extends Dialog implements IPropertiesFilteredWidget {

	/**
	 * the label
	 */
	protected Label label;

	/**
	 * The selection tree.
	 */
	protected Tree tree;

	/** title of the window */
	protected String title = EEFRuntimeUIMessages.TabElementTreeSelectionDialog_title;

	/**
	 * filters
	 */
	private List<ViewerFilter> viewerFilters;

	/**
	 * business rules filters
	 */
	private List<ViewerFilter> brFilters;

	/**
	 * The adapter factory.
	 */
	protected AdapterFactory adapterFactory = new ComposedAdapterFactory(
			ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

	private Composite parent;

	private Object input;

	private IStructuredSelection selection;

	private EClass restrictToEClass;

	/**
	 * The main resource. It's optional. The first resource is the main resource by default.
	 */
	private Resource mainResource;

	/**
	 * Constructor with parent shell and Element.
	 * 
	 * @param parentElement
	 *            the element where we look for a children
	 * @param filters
	 *            this is an array of filter see {@link ViewerFilter} or an example {@link OperationFilter}
	 * @param title
	 *            title of the window
	 * @param createElement
	 *            this is the listener to create an element
	 * @param abstractElement
	 *            it used to inform about if the element is abstract in this case the creation button does not
	 *            appear
	 * @deprecated 
	 */
	public TabElementTreeSelectionDialog(Object input, List<ViewerFilter> filters,
			List<ViewerFilter> brFilters, String title, EClass restrictToEClass) {
		super(Display.getDefault().getActiveShell());
		// add the resize ability to the window
		setShellStyle(SWT.RESIZE | super.getShellStyle());
		this.input = input;
		this.viewerFilters = filters;
		this.brFilters = brFilters;
		this.title = title;
		this.restrictToEClass = restrictToEClass;
	}

	/**
	 * Constructor with parent shell and Element.
	 * 
	 * @param parentElement
	 *            the element where we look for a children
	 * @param filters
	 *            this is an array of filter see {@link ViewerFilter} or an example {@link OperationFilter}
	 * @param title
	 *            title of the window
	 * @param createElement
	 *            this is the listener to create an element
	 * @param abstractElement
	 *            it used to inform about if the element is abstract in this case the creation button does not
	 *            appear
	 * @param mainResource
	 *            the main resource.
	 */
	public TabElementTreeSelectionDialog(Object input, List<ViewerFilter> filters,
			List<ViewerFilter> brFilters, String title, EClass restrictToEClass, Resource mainResource) {
		super(Display.getDefault().getActiveShell());
		// add the resize ability to the window
		setShellStyle(SWT.RESIZE | super.getShellStyle());
		this.input = input;
		this.viewerFilters = filters;
		this.brFilters = brFilters;
		this.title = title;
		this.restrictToEClass = restrictToEClass;
		this.mainResource = mainResource;
	}

	/**
	 * Creates the dialog area.
	 * 
	 * @param parent
	 *            composite.
	 * @return control Control.
	 */
	protected Control createDialogArea(Composite parent) {
		this.parent = parent;
		final CTabFolder tabFolder = new CTabFolder(parent, SWT.BORDER);
		tabFolder.setMaximized(true);

		CTabItem tabItem = new CTabItem(tabFolder, SWT.NULL);
		tabItem.setText(EEFRuntimeUIMessages.TabElementTreeSelectionDialog_model_resource_tab_title);
		tabItem.setControl(fillModelpage(tabFolder, false, new ViewerFilter() {
			// Filter elements only in main Resource
			@Override
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				if (input instanceof ResourceSet) {
					ResourceSet resourceSet = (ResourceSet)input;
					Resource mainResource = TabElementTreeSelectionDialog.this.mainResource != null ? TabElementTreeSelectionDialog.this.mainResource
							: resourceSet.getResources().get(0);
					if (mainResource != null && mainResource == element) {
						return true;
					}
				}
				if (element instanceof EObject) {
					EObject eObject = (EObject)element;
					ResourceSet resourceSet = (ResourceSet)input;
					Resource mainResource = TabElementTreeSelectionDialog.this.mainResource != null ? TabElementTreeSelectionDialog.this.mainResource
							: resourceSet.getResources().get(0);
					if (mainResource != null && mainResource == eObject.eResource()) {
						return true;
					}
				}
				return false;
			}
		}));

		tabItem = new CTabItem(tabFolder, SWT.NULL);
		tabItem.setText(EEFRuntimeUIMessages.TabElementTreeSelectionDialog_all_resources_tab_title);
		tabItem.setControl(fillModelpage(tabFolder, true, null));

		return tabFolder;
	}

	/**
	 * Used to display a page in a tab
	 * 
	 * @param tabFolder
	 *            that contains all tabs
	 * @param specificTabFilter
	 *            a specific filter to this page
	 * @return the composite of this page
	 */
	public Control fillModelpage(CTabFolder tabFolder, final boolean showResourceItem,
			final ViewerFilter specificTabFilter) {
		Composite composite = new Composite(tabFolder, SWT.None);
		GridLayout layout = new GridLayout();
		layout.marginHeight = convertVerticalDLUsToPixels(IDialogConstants.VERTICAL_MARGIN);
		layout.marginWidth = convertHorizontalDLUsToPixels(IDialogConstants.HORIZONTAL_MARGIN);
		layout.verticalSpacing = convertVerticalDLUsToPixels(IDialogConstants.VERTICAL_SPACING);
		layout.horizontalSpacing = convertHorizontalDLUsToPixels(IDialogConstants.HORIZONTAL_SPACING);
		composite.setLayout(layout);

		// use pattern filter
		PatternFilter patternFilter = new TreeSelectionPatternFilter();
		patternFilter.setIncludeLeadingWildcard(true);

		FilteredTree filteredTree = new FilteredTree(composite, SWT.SINGLE | SWT.BORDER | SWT.V_SCROLL
				| SWT.RESIZE, patternFilter);
		// use of EMF facilities
		final TreeViewer treeViewer = filteredTree.getViewer();
		treeViewer.setFilters(new ViewerFilter[0]);
		treeViewer.setUseHashlookup(true);
		treeViewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory) {
			@Override
			public Object[] getElements(Object inputElement) {
				if (inputElement instanceof ResourceSet) {
					ResourceSet resourceSet = (ResourceSet)inputElement;
					if (showResourceItem) {
						return resourceSet.getResources().toArray();
					} else {
						ArrayList<EObject> contents = new ArrayList<EObject>();
						for (Resource resource : resourceSet.getResources()) {
							contents.addAll(resource.getContents());
						}
						return contents.toArray();
					}
				}
				return super.getElements(inputElement);
			}

			@Override
			public Object[] getChildren(Object object) {
				// TODO Auto-generated method stub
				Object[] children = super.getChildren(object);
				return children;
			}
			
		});

		ArrayList<ViewerFilter> filters = new ArrayList<ViewerFilter>();
		if (specificTabFilter != null) {
			filters.add(specificTabFilter);
		}
		if (viewerFilters != null && !viewerFilters.isEmpty()) {
			for (ViewerFilter filter : viewerFilters) {
				filters.add(filter);
			}
		}
		// for now, add the businessRuleFilters to the 'normal' filters
		if (brFilters != null && !brFilters.isEmpty()) {
			for (ViewerFilter filter : brFilters) {
				filters.add(filter);
			}
		}
		filters.add(patternFilter);
		ViewerFilter[] v = filters.toArray(new ViewerFilter[filters.size()]);
		treeViewer.setFilters(v);
		treeViewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		filteredTree.setLayoutData(new GridData(550, 300));
		// handle selection change
		treeViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent event) {
				if (event.getSelection() instanceof IStructuredSelection) {
					// Check selection
					IStructuredSelection structuredSelection = (IStructuredSelection)event.getSelection();
					if (structuredSelection != null && !structuredSelection.isEmpty()) {
						Object o = structuredSelection.getFirstElement();
						if (o instanceof EObject) {
							// Check type matching
							EObject eObject = (EObject)o;
							Button okButton = getButton(IDialogConstants.OK_ID);
							if (EEFUtils.isInstanceOfEClass(eObject, restrictToEClass)) {
								selection = structuredSelection;
								if (okButton != null) {
									okButton.setEnabled(true);
								}
							} else {
								// Reject selection
								if (okButton != null) {
									okButton.setEnabled(false);
								}
							}
						}
					}

				}
			}
		});

		// handle double click to validate
		treeViewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				if (selection != null && !selection.isEmpty()) {
					Object o = selection.getFirstElement();
					if (o instanceof EObject) {
						if (EEFUtils.isInstanceOfEClass((EObject)o, restrictToEClass)) {
							okPressed();
						}
					}
				}
			}
		});

		treeViewer.setInput(input);

		// Init selected element
		if (selection != null) {
			treeViewer.setSelection(selection);
		}

		return composite;

	}

	private class TreeSelectionPatternFilter extends PatternFilter {
		@Override
		protected boolean isParentMatch(Viewer viewer, Object element) {
			Object[] children = ((ITreeContentProvider)((AbstractTreeViewer)viewer).getContentProvider())
					.getChildren(element);
			// apply all filters
			if (viewerFilters != null && children != null) {
				// if one child match, show the parent in tree
				for (ViewerFilter viewerFilter : viewerFilters) {
					for (Object child : children) {
						if (viewerFilter.select(viewer, null, child)) {
							return super.isParentMatch(viewer, element);
						}
					}
				}
				return false;
			} else {
				return super.isParentMatch(viewer, element);
			}
		}

		@Override
		protected boolean isLeafMatch(Viewer viewer, Object element) {
			if (element instanceof EObject) {
				String labelText = ((EObject)element).toString();
				if (labelText != null) {
					return wordMatches(labelText);
				}
			}
			return false;
		}
	}

	/**
	 * Sets or clears the input for this dialog.
	 */
	public void setInput(Object input) {
		this.input = input;
		this.refresh();
	}

	public void refresh() {
		parent.pack();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void configureShell(Shell shell) {
		super.configureShell(shell);
		shell.setText(EEFRuntimeUIMessages.TabElementTreeSelectionDialog_shell_title + this.title);
	}

	/**
	 * @see org.eclipse.jface.dialogs.Dialog#okPressed()
	 */
	@Override
	protected void okPressed() {
		if (selection != null && !selection.isEmpty()) {
			process(selection);
			ModelViewerHelper.setLastSelection(selection);
		}
		super.okPressed();
	}

	public void setSelection(IStructuredSelection selection) {
		this.selection = selection;
	}

	public abstract void process(IStructuredSelection selection);
	
	public void addBusinessRuleFilter(ViewerFilter filter) {
		this.brFilters.add(filter);
	}
	public void addFilter(ViewerFilter filter) {
		this.viewerFilters.add(filter);
	}
	public void removeBusinessRuleFilter(ViewerFilter filter) {
		this.brFilters.remove(filter);
	}
	public void removeFilter(ViewerFilter filter) {
		this.viewerFilters.remove(filter);
	}

}
