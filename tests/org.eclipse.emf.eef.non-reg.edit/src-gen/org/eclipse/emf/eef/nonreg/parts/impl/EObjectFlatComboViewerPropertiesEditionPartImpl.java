/**
 * Generated with Acceleo
 */
package org.eclipse.emf.eef.nonreg.parts.impl;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.nonreg.parts.EObjectFlatComboViewerPropertiesEditionPart;
import org.eclipse.emf.eef.nonreg.parts.NonregViewsRepository;
import org.eclipse.emf.eef.nonreg.providers.NonregMessages;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;



// End of user code	

/**
 * 
 * @generated
 */
public class EObjectFlatComboViewerPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, EObjectFlatComboViewerPropertiesEditionPart {

	protected EObjectFlatComboViewer eobjectflatcomboviewer;
	protected EObjectFlatComboViewer eobjectflatcomboviewerRO;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * @generated
	 */
	public EObjectFlatComboViewerPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
    createEobjectflatcomboviewerFlatComboViewer(view);

    createEobjectflatcomboviewerROFlatComboViewer(view);


    // Start of user code for additional ui definition
    
    // End of user code
  }

	/**
	 * @param view
	 * @generated
	 */
	protected void createEobjectflatcomboviewerFlatComboViewer(Composite parent) {
    SWTUtils.createPartLabel(parent, NonregMessages.EObjectFlatComboViewerPropertiesEditionPart_EobjectflatcomboviewerLabel, propertiesEditionComponent.isRequired(NonregViewsRepository.EObjectFlatComboViewer.eobjectflatcomboviewer, NonregViewsRepository.SWT_KIND));
    eobjectflatcomboviewer = new EObjectFlatComboViewer(parent, true);
    eobjectflatcomboviewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

    eobjectflatcomboviewer.addSelectionChangedListener(new ISelectionChangedListener() {

      public void selectionChanged(SelectionChangedEvent event) {
        propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EObjectFlatComboViewerPropertiesEditionPartImpl.this, NonregViewsRepository.EObjectFlatComboViewer.eobjectflatcomboviewer, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getEobjectflatcomboviewer()));
      }

    });
    GridData eobjectflatcomboviewerData = new GridData(GridData.FILL_HORIZONTAL);
    eobjectflatcomboviewer.setLayoutData(eobjectflatcomboviewerData);
    SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NonregViewsRepository.EObjectFlatComboViewer.eobjectflatcomboviewer, NonregViewsRepository.SWT_KIND), null); //$NON-NLS-1$
  }

	/**
	 * @param view
	 * @generated
	 */
	protected void createEobjectflatcomboviewerROFlatComboViewer(Composite parent) {
    SWTUtils.createPartLabel(parent, NonregMessages.EObjectFlatComboViewerPropertiesEditionPart_EobjectflatcomboviewerROLabel, propertiesEditionComponent.isRequired(NonregViewsRepository.EObjectFlatComboViewer.eobjectflatcomboviewerRO, NonregViewsRepository.SWT_KIND));
    eobjectflatcomboviewerRO = new EObjectFlatComboViewer(parent, true);
    eobjectflatcomboviewerRO.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
    eobjectflatcomboviewerRO.setEnabled(false);
    eobjectflatcomboviewerRO.setToolTipText(NonregMessages.EObjectFlatComboViewer_ReadOnly);

    eobjectflatcomboviewerRO.addSelectionChangedListener(new ISelectionChangedListener() {

      public void selectionChanged(SelectionChangedEvent event) {
        propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EObjectFlatComboViewerPropertiesEditionPartImpl.this, NonregViewsRepository.EObjectFlatComboViewer.eobjectflatcomboviewerRO, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getEobjectflatcomboviewerRO()));
      }

    });
    GridData eobjectflatcomboviewerROData = new GridData(GridData.FILL_HORIZONTAL);
    eobjectflatcomboviewerRO.setLayoutData(eobjectflatcomboviewerROData);
    SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NonregViewsRepository.EObjectFlatComboViewer.eobjectflatcomboviewerRO, NonregViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see org.eclipse.emf.eef.nonreg.parts.EObjectFlatComboViewerPropertiesEditionPart#getEobjectflatcomboviewer()
	 * @generated
	 */
	public EObject getEobjectflatcomboviewer() {
    if (eobjectflatcomboviewer.getSelection() instanceof StructuredSelection) {
      Object firstElement = ((StructuredSelection) eobjectflatcomboviewer.getSelection()).getFirstElement();
      if (firstElement instanceof EObject)
        return (EObject) firstElement;
    }
    return null;
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.EObjectFlatComboViewerPropertiesEditionPart#initEobjectflatcomboviewer(ResourceSet allResources, EObject current)
	 */
	public void initEobjectflatcomboviewer(ResourceSet allResources, EObject current) {
		eobjectflatcomboviewer.setInput(allResources);
		if (current != null) {
			eobjectflatcomboviewer.setSelection(new StructuredSelection(current));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.EObjectFlatComboViewerPropertiesEditionPart#setEobjectflatcomboviewer(EObject newValue)
	 * @generated
	 */
	public void setEobjectflatcomboviewer(EObject newValue) {
    if (newValue != null) {
      eobjectflatcomboviewer.setSelection(new StructuredSelection(newValue));
    } else {
      eobjectflatcomboviewer.setSelection(new StructuredSelection()); //$NON-NLS-1$
    }
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.EObjectFlatComboViewerPropertiesEditionPart#setEobjectflatcomboviewerButtonMode(ButtonsModeEnum newValue)
	 */
	public void setEobjectflatcomboviewerButtonMode(ButtonsModeEnum newValue) {
		eobjectflatcomboviewer.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.EObjectFlatComboViewerPropertiesEditionPart#addFilterEobjectflatcomboviewer(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToEobjectflatcomboviewer(ViewerFilter filter) {
    eobjectflatcomboviewer.addFilter(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.EObjectFlatComboViewerPropertiesEditionPart#addBusinessFilterEobjectflatcomboviewer(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToEobjectflatcomboviewer(ViewerFilter filter) {
    eobjectflatcomboviewer.addBusinessRuleFilter(filter);
  }


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.EObjectFlatComboViewerPropertiesEditionPart#getEobjectflatcomboviewerRO()
	 * @generated
	 */
	public EObject getEobjectflatcomboviewerRO() {
    if (eobjectflatcomboviewerRO.getSelection() instanceof StructuredSelection) {
      Object firstElement = ((StructuredSelection) eobjectflatcomboviewerRO.getSelection()).getFirstElement();
      if (firstElement instanceof EObject)
        return (EObject) firstElement;
    }
    return null;
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.EObjectFlatComboViewerPropertiesEditionPart#initEobjectflatcomboviewerRO(ResourceSet allResources, EObject current)
	 */
	public void initEobjectflatcomboviewerRO(ResourceSet allResources, EObject current) {
		eobjectflatcomboviewerRO.setInput(allResources);
		if (current != null) {
			eobjectflatcomboviewerRO.setSelection(new StructuredSelection(current));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.EObjectFlatComboViewerPropertiesEditionPart#setEobjectflatcomboviewerRO(EObject newValue)
	 * @generated
	 */
	public void setEobjectflatcomboviewerRO(EObject newValue) {
    if (newValue != null) {
      eobjectflatcomboviewerRO.setSelection(new StructuredSelection(newValue));
    } else {
      eobjectflatcomboviewerRO.setSelection(new StructuredSelection()); //$NON-NLS-1$
    }
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.EObjectFlatComboViewerPropertiesEditionPart#setEobjectflatcomboviewerROButtonMode(ButtonsModeEnum newValue)
	 */
	public void setEobjectflatcomboviewerROButtonMode(ButtonsModeEnum newValue) {
		eobjectflatcomboviewerRO.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.EObjectFlatComboViewerPropertiesEditionPart#addFilterEobjectflatcomboviewerRO(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToEobjectflatcomboviewerRO(ViewerFilter filter) {
    eobjectflatcomboviewerRO.addFilter(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.EObjectFlatComboViewerPropertiesEditionPart#addBusinessFilterEobjectflatcomboviewerRO(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToEobjectflatcomboviewerRO(ViewerFilter filter) {
    eobjectflatcomboviewerRO.addBusinessRuleFilter(filter);
  }







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * @generated
	 */
	public String getTitle() {
    return NonregMessages.EObjectFlatComboViewer_Part_Title;
  }

	// Start of user code additional methods
	
	// End of user code


}
