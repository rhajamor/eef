/**
 * Generated with Acceleo
 */
package org.eclipse.emf.eef.nonreg.parts.impl;

// Start of user code for imports
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.util.EcoreAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.nonreg.parts.EMFComboViewerPropertiesEditionPart;
import org.eclipse.emf.eef.nonreg.parts.NonregViewsRepository;
import org.eclipse.emf.eef.nonreg.providers.NonregMessages;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;



// End of user code	

/**
 * 
 * @generated
 */
public class EMFComboViewerPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, EMFComboViewerPropertiesEditionPart {

	protected EMFComboViewer emfcomboviewer;
	protected EMFComboViewer emfcomboviewerRO;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * @generated
	 */
	public EMFComboViewerPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
    createEmfcomboviewerEMFComboViewer(view);

    createEmfcomboviewerROEMFComboViewer(view);


    // Start of user code for additional ui definition
    
    // End of user code
  }

	
	protected void createEmfcomboviewerEMFComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, NonregMessages.EMFComboViewerPropertiesEditionPart_EmfcomboviewerLabel, propertiesEditionComponent.isRequired(NonregViewsRepository.EMFComboViewer.emfcomboviewer, NonregViewsRepository.SWT_KIND));
		emfcomboviewer = new EMFComboViewer(parent);
		emfcomboviewer.setContentProvider(new ArrayContentProvider());
		emfcomboviewer.setLabelProvider(new AdapterFactoryLabelProvider(new EcoreAdapterFactory()));
		GridData emfcomboviewerData = new GridData(GridData.FILL_HORIZONTAL);
		emfcomboviewer.getCombo().setLayoutData(emfcomboviewerData);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NonregViewsRepository.EMFComboViewer.emfcomboviewer, NonregViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	
	protected void createEmfcomboviewerROEMFComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, NonregMessages.EMFComboViewerPropertiesEditionPart_EmfcomboviewerROLabel, propertiesEditionComponent.isRequired(NonregViewsRepository.EMFComboViewer.emfcomboviewerRO, NonregViewsRepository.SWT_KIND));
		emfcomboviewerRO = new EMFComboViewer(parent);
		emfcomboviewerRO.setContentProvider(new ArrayContentProvider());
		emfcomboviewerRO.setLabelProvider(new AdapterFactoryLabelProvider(new EcoreAdapterFactory()));
		emfcomboviewerRO.setEnabled(false);
		emfcomboviewerRO.setToolTipText(NonregMessages.EMFComboViewer_ReadOnly);
		GridData emfcomboviewerROData = new GridData(GridData.FILL_HORIZONTAL);
		emfcomboviewerRO.getCombo().setLayoutData(emfcomboviewerROData);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NonregViewsRepository.EMFComboViewer.emfcomboviewerRO, NonregViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see org.eclipse.emf.eef.nonreg.parts.EMFComboViewerPropertiesEditionPart#getEmfcomboviewer()
	 * @generated
	 */
	public Enumerator getEmfcomboviewer() {
    EEnumLiteral selection = (EEnumLiteral) ((StructuredSelection) emfcomboviewer.getSelection()).getFirstElement();
    return selection.getInstance();
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.EMFComboViewerPropertiesEditionPart#initEmfcomboviewer(EEnum eenum, Enumerator current)
	 */
	public void initEmfcomboviewer(EEnum eenum, Enumerator current) {
		emfcomboviewer.setInput(eenum.getELiterals());
		emfcomboviewer.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.EMFComboViewerPropertiesEditionPart#setEmfcomboviewer(Enumerator newValue)
	 * @generated
	 */
	public void setEmfcomboviewer(Enumerator newValue) {
    emfcomboviewer.modelUpdating(new StructuredSelection(newValue));
  }


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.EMFComboViewerPropertiesEditionPart#getEmfcomboviewerRO()
	 * @generated
	 */
	public Enumerator getEmfcomboviewerRO() {
    EEnumLiteral selection = (EEnumLiteral) ((StructuredSelection) emfcomboviewerRO.getSelection()).getFirstElement();
    return selection.getInstance();
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.EMFComboViewerPropertiesEditionPart#initEmfcomboviewerRO(EEnum eenum, Enumerator current)
	 */
	public void initEmfcomboviewerRO(EEnum eenum, Enumerator current) {
		emfcomboviewerRO.setInput(eenum.getELiterals());
		emfcomboviewerRO.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.EMFComboViewerPropertiesEditionPart#setEmfcomboviewerRO(Enumerator newValue)
	 * @generated
	 */
	public void setEmfcomboviewerRO(Enumerator newValue) {
    emfcomboviewerRO.modelUpdating(new StructuredSelection(newValue));
  }







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * @generated
	 */
	public String getTitle() {
    return NonregMessages.EMFComboViewer_Part_Title;
  }

	// Start of user code additional methods
	
	// End of user code


}
