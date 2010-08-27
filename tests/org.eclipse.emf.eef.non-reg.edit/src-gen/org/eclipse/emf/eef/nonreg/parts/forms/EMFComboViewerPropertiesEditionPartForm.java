/**
 * Generated with Acceleo
 */
package org.eclipse.emf.eef.nonreg.parts.forms;

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
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;


// End of user code

/**
 * 
 * @generated
 */
public class EMFComboViewerPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, EMFComboViewerPropertiesEditionPart {

	protected EMFComboViewer emfcomboviewer;
	protected EMFComboViewer emfcomboviewerRO;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * @generated
	 */
	public EMFComboViewerPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
    createEmfcomboviewerEMFComboViewer(widgetFactory, view);

    createEmfcomboviewerROEMFComboViewer(widgetFactory, view);

    // Start of user code for additional ui definition
    
    // End of user code
  }
	
	protected void createEmfcomboviewerEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, NonregMessages.EMFComboViewerPropertiesEditionPart_EmfcomboviewerLabel, propertiesEditionComponent.isRequired(NonregViewsRepository.EMFComboViewer.emfcomboviewer, NonregViewsRepository.FORM_KIND));
		emfcomboviewer = new EMFComboViewer(parent);
		emfcomboviewer.setContentProvider(new ArrayContentProvider());
		emfcomboviewer.setLabelProvider(new AdapterFactoryLabelProvider(new EcoreAdapterFactory()));
		GridData emfcomboviewerData = new GridData(GridData.FILL_HORIZONTAL);
		emfcomboviewer.getCombo().setLayoutData(emfcomboviewerData);
		emfcomboviewer.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	@generated
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EMFComboViewerPropertiesEditionPartForm.this, NonregViewsRepository.EMFComboViewer.emfcomboviewer, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getEmfcomboviewer()));
			}

		});
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(NonregViewsRepository.EMFComboViewer.emfcomboviewer, NonregViewsRepository.FORM_KIND), null); //$NON-NLS-1$
	}

	
	protected void createEmfcomboviewerROEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, NonregMessages.EMFComboViewerPropertiesEditionPart_EmfcomboviewerROLabel, propertiesEditionComponent.isRequired(NonregViewsRepository.EMFComboViewer.emfcomboviewerRO, NonregViewsRepository.FORM_KIND));
		emfcomboviewerRO = new EMFComboViewer(parent);
		emfcomboviewerRO.setContentProvider(new ArrayContentProvider());
		emfcomboviewerRO.setLabelProvider(new AdapterFactoryLabelProvider(new EcoreAdapterFactory()));
		emfcomboviewerRO.setEnabled(false);
		emfcomboviewerRO.setToolTipText(NonregMessages.EMFComboViewer_ReadOnly);
		GridData emfcomboviewerROData = new GridData(GridData.FILL_HORIZONTAL);
		emfcomboviewerRO.getCombo().setLayoutData(emfcomboviewerROData);
		emfcomboviewerRO.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	@generated
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EMFComboViewerPropertiesEditionPartForm.this, NonregViewsRepository.EMFComboViewer.emfcomboviewerRO, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getEmfcomboviewerRO()));
			}

		});
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(NonregViewsRepository.EMFComboViewer.emfcomboviewerRO, NonregViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
