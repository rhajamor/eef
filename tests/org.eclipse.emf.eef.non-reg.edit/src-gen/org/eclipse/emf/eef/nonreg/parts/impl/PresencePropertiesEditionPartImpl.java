/**
 * Generated with Acceleo
 */
package org.eclipse.emf.eef.nonreg.parts.impl;

// Start of user code for imports
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.nonreg.parts.NonregViewsRepository;
import org.eclipse.emf.eef.nonreg.parts.PresencePropertiesEditionPart;
import org.eclipse.emf.eef.nonreg.providers.NonregMessages;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.widgets.FlatReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;



// End of user code	

/**
 * 
 * @generated
 */
public class PresencePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, PresencePropertiesEditionPart {

	protected FlatReferencesTable assists;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * @generated
	 */
	public PresencePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
    super(editionComponent);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createFigure(org.eclipse.swt.widgets.Composite)
	 * @generated
	 */
	public Composite createFigure(final Composite parent) {
    view = new Composite(parent, SWT.NONE);
    GridLayout layout = new GridLayout();
    layout.numColumns = 3;
    view.setLayout(layout);
    createControls(view);
    return view;
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createControls(org.eclipse.swt.widgets.Composite)
	 * @generated
	 */
	public void createControls(Composite view) { 
    createPresenceGroup(view);


    // Start of user code for additional ui definition
    
    // End of user code
  }

	/**
	 * @generated
	 */
	protected void createPresenceGroup(Composite parent) {
    Group presenceGroup = new Group(parent, SWT.NONE);
    presenceGroup.setText(NonregMessages.PresencePropertiesEditionPart_PresenceGroupLabel);
    GridData presenceGroupData = new GridData(GridData.FILL_HORIZONTAL);
    presenceGroupData.horizontalSpan = 3;
    presenceGroup.setLayoutData(presenceGroupData);
    GridLayout presenceGroupLayout = new GridLayout();
    presenceGroupLayout.numColumns = 3;
    presenceGroup.setLayout(presenceGroupLayout);
    createAssistsFlatReferencesTable(presenceGroup);
  }

	/**
	 * @param parent
	 * @generated
	 */
	protected void createAssistsFlatReferencesTable(Composite parent) {
    SWTUtils.createPartLabel(parent, NonregMessages.PresencePropertiesEditionPart_AssistsLabel, propertiesEditionComponent.isRequired(NonregViewsRepository.Presence.assists, NonregViewsRepository.SWT_KIND));
    assists = new FlatReferencesTable(parent);
    assists.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

    assists.addSelectionChangedListener(new ISelectionChangedListener() {

      public void selectionChanged(SelectionChangedEvent event) {
        if (event.getSelection() instanceof StructuredSelection) 
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PresencePropertiesEditionPartImpl.this, NonregViewsRepository.Presence.assists, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, ((StructuredSelection)event.getSelection()).toList()));
      }

    });
    GridData assistsData = new GridData(GridData.FILL_HORIZONTAL);
    assists.setLayoutData(assistsData);
    SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NonregViewsRepository.Presence.assists, NonregViewsRepository.SWT_KIND), null); //$NON-NLS-1$
  }




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * @generated
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
    // Start of user code for tab synchronization
    
    // End of user code
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.PresencePropertiesEditionPart#getAssistsToAdd()
	 * @generated
	 */
	public List getAssistsToAdd() {
    return assists.getElementsToAdd();
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.PresencePropertiesEditionPart#getAssistsToRemove()
	 * @generated
	 */
	public List getAssistsToRemove() {
    return assists.getElementsToRemove();
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.PresencePropertiesEditionPart#getAssistsTable()
	 * @generated
	 */
	public List getAssistsTable() {
    return assists.getVirtualList();
  }


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.PresencePropertiesEditionPart#initAssists(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initAssists(EObject current, EReference containingFeature, EReference feature) {
		assists.initComponent(current, containingFeature, feature);
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			assists.setInput(current.eResource().getResourceSet());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.PresencePropertiesEditionPart#updateAssists(EObject newValue)
	 * @generated
	 */
	public void updateAssists(EObject newValue) {
    assists.updateComponent(newValue);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.PresencePropertiesEditionPart#addFilterAssists(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToAssists(ViewerFilter filter) {
    assists.addFilter(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.PresencePropertiesEditionPart#addBusinessFilterAssists(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToAssists(ViewerFilter filter) {
    assists.addBusinessRuleFilter(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.PresencePropertiesEditionPart#isContainedInAssistsTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInAssistsTable(EObject element) {
    return assists.virtualListContains(element);
  }







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * @generated
	 */
	public String getTitle() {
    return NonregMessages.Presence_Part_Title;
  }

	// Start of user code additional methods
	
	// End of user code


}
