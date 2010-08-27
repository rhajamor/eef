/**
 * Generated with Acceleo
 */
package org.eclipse.emf.eef.nonreg.parts.forms;

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
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.widgets.FlatReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;


// End of user code

/**
 * 
 * @generated
 */
public class PresencePropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, PresencePropertiesEditionPart {

		protected FlatReferencesTable assists;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * @generated
	 */
	public PresencePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
    super(editionComponent);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createFigure(org.eclipse.swt.widgets.Composite, org.eclipse.ui.forms.widgets.FormToolkit)
	 * @generated
	 */
	public Composite createFigure(final Composite parent, final FormToolkit widgetFactory) {
    ScrolledForm scrolledForm = widgetFactory.createScrolledForm(parent);
    Form form = scrolledForm.getForm();
    view = form.getBody();
    GridLayout layout = new GridLayout();
    layout.numColumns = 3;
    view.setLayout(layout);
    createControls(widgetFactory, view);
    return scrolledForm;
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createControls(org.eclipse.ui.forms.widgets.FormToolkit, org.eclipse.swt.widgets.Composite)
	 * @generated
	 */
	public void createControls(final FormToolkit widgetFactory, Composite view) {
    createPresenceGroup(widgetFactory, view);

    // Start of user code for additional ui definition
    
    // End of user code
  }
	/**
	 * @generated
	 */
	protected void createPresenceGroup(FormToolkit widgetFactory, final Composite view) {
    Section presenceSection = widgetFactory.createSection(view, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
    presenceSection.setText(NonregMessages.PresencePropertiesEditionPart_PresenceGroupLabel);
    GridData presenceSectionData = new GridData(GridData.FILL_HORIZONTAL);
    presenceSectionData.horizontalSpan = 3;
    presenceSection.setLayoutData(presenceSectionData);
    Composite presenceGroup = widgetFactory.createComposite(presenceSection);
    GridLayout presenceGroupLayout = new GridLayout();
    presenceGroupLayout.numColumns = 3;
    presenceGroup.setLayout(presenceGroupLayout);
    createAssistsFlatReferencesTable(widgetFactory, presenceGroup);
    presenceSection.setClient(presenceGroup);
  }

	/**
	 * @param parent
	 * @generated
	 */
	protected void createAssistsFlatReferencesTable(FormToolkit widgetFactory, Composite parent) {
    FormUtils.createPartLabel(widgetFactory, parent, NonregMessages.PresencePropertiesEditionPart_AssistsLabel, propertiesEditionComponent.isRequired(NonregViewsRepository.Presence.assists, NonregViewsRepository.FORM_KIND));
    assists = new FlatReferencesTable(parent);
    assists.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

    assists.addSelectionChangedListener(new ISelectionChangedListener() {

      public void selectionChanged(SelectionChangedEvent event) {
        if (event.getSelection() instanceof StructuredSelection) 
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PresencePropertiesEditionPartForm.this, NonregViewsRepository.Presence.assists, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, ((StructuredSelection)event.getSelection()).getFirstElement()));
      }

    });
    GridData assistsData = new GridData(GridData.FILL_HORIZONTAL);
    assists.setLayoutData(assistsData);
    FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(NonregViewsRepository.Presence.assists, NonregViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
