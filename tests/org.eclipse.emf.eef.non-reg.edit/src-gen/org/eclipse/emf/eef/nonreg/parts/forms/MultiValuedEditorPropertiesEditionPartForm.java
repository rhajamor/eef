/**
 * Generated with Acceleo
 */
package org.eclipse.emf.eef.nonreg.parts.forms;

// Start of user code for imports

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.celleditor.FeatureEditorDialog;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.nonreg.NonregPackage;
import org.eclipse.emf.eef.nonreg.parts.MultiValuedEditorPropertiesEditionPart;
import org.eclipse.emf.eef.nonreg.providers.NonregMessages;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.services.PropertiesContextService;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;

// End of user code

/**
 * 
 */
public class MultiValuedEditorPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, MultiValuedEditorPropertiesEditionPart {

	protected Text multivaluededitor;
	protected Button editMultivaluededitor;
	private EList multivaluededitorList;
	protected Text multivaluededitorRO;
	protected Button editMultivaluededitorRO;
	private EList multivaluededitorROList;





	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 */
	public MultiValuedEditorPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createFigure(org.eclipse.swt.widgets.Composite, org.eclipse.ui.forms.widgets.FormToolkit)
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
	 */
	public void createControls(final FormToolkit widgetFactory, Composite view) {
		this.messageManager = messageManager;
		createMultivaluededitorMultiValuedEditor(widgetFactory, view);

		createMultivaluededitorROMultiValuedEditor(widgetFactory, view);

		// Start of user code for additional ui definition
		
		// End of user code
	}
	protected void createMultivaluededitorMultiValuedEditor(FormToolkit widgetFactory, Composite parent) {
		multivaluededitor = widgetFactory.createText(parent, "", SWT.READ_ONLY); //$NON-NLS-1$
		GridData multivaluededitorData = new GridData(GridData.FILL_HORIZONTAL);
		multivaluededitorData.horizontalSpan = 2;
		multivaluededitor.setLayoutData(multivaluededitorData);
		editMultivaluededitor = widgetFactory.createButton(parent, NonregMessages.MultiValuedEditorPropertiesEditionPart_MultivaluededitorLabel, SWT.NONE);
		GridData editMultivaluededitorData = new GridData();
		editMultivaluededitor.setLayoutData(editMultivaluededitorData);
		editMultivaluededitor.addSelectionListener(new SelectionAdapter() {

			/*
			 * (non-Javadoc)
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			public void widgetSelected(SelectionEvent e) {
				EObject person = PropertiesContextService.getInstance().lastElement();
				FeatureEditorDialog dialog = new FeatureEditorDialog(Display.getDefault().getActiveShell(), new AdapterFactoryLabelProvider(adapterFactory), person, NonregPackage.eINSTANCE.getPerson_Firstname().getEType(), 
						multivaluededitorList, "Person", null, false, false); //$NON-NLS-1$
				if (dialog.open() == Window.OK) {
					multivaluededitorList = dialog.getResult();
					if (multivaluededitorList == null) {
						multivaluededitorList = new BasicEList();
					}
					multivaluededitor.setText(multivaluededitorList.toString());
					setHasChanged(true);
				}
			}
		});
	}

	protected void createMultivaluededitorROMultiValuedEditor(FormToolkit widgetFactory, Composite parent) {
		multivaluededitorRO = widgetFactory.createText(parent, "", SWT.READ_ONLY); //$NON-NLS-1$
		multivaluededitorRO.setEnabled(false);
		multivaluededitorRO.setToolTipText(NonregMessages.MultiValuedEditor_ReadOnly);
		GridData multivaluededitorROData = new GridData(GridData.FILL_HORIZONTAL);
		multivaluededitorROData.horizontalSpan = 2;
		multivaluededitorRO.setLayoutData(multivaluededitorROData);
		editMultivaluededitorRO = widgetFactory.createButton(parent, NonregMessages.MultiValuedEditorPropertiesEditionPart_MultivaluededitorROLabel, SWT.NONE);
		GridData editMultivaluededitorROData = new GridData();
		editMultivaluededitorRO.setLayoutData(editMultivaluededitorROData);
		editMultivaluededitorRO.addSelectionListener(new SelectionAdapter() {

			/*
			 * (non-Javadoc)
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			public void widgetSelected(SelectionEvent e) {
				EObject person = PropertiesContextService.getInstance().lastElement();
				FeatureEditorDialog dialog = new FeatureEditorDialog(Display.getDefault().getActiveShell(), new AdapterFactoryLabelProvider(adapterFactory), person, NonregPackage.eINSTANCE.getPerson_Firstname().getEType(), 
						multivaluededitorROList, "Person", null, false, false); //$NON-NLS-1$
				if (dialog.open() == Window.OK) {
					multivaluededitorROList = dialog.getResult();
					if (multivaluededitorROList == null) {
						multivaluededitorROList = new BasicEList();
					}
					multivaluededitorRO.setText(multivaluededitorROList.toString());
					setHasChanged(true);
				}
			}
		});
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization
		
		// End of user code
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.MultiValuedEditorPropertiesEditionPart#getMultivaluededitor()
	 */
	public EList getMultivaluededitor() {
		return multivaluededitorList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.MultiValuedEditorPropertiesEditionPart#setMultivaluededitor(EList newValue)
	 */
	public void setMultivaluededitor(EList newValue) {
		multivaluededitorList = newValue;
		if (newValue != null) {
			multivaluededitor.setText(multivaluededitorList.toString());
		} else {
			multivaluededitor.setText(""); //$NON-NLS-1$
		}
	}





	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.MultiValuedEditorPropertiesEditionPart#getMultivaluededitorRO()
	 */
	public EList getMultivaluededitorRO() {
		return multivaluededitorROList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.MultiValuedEditorPropertiesEditionPart#setMultivaluededitorRO(EList newValue)
	 */
	public void setMultivaluededitorRO(EList newValue) {
		multivaluededitorROList = newValue;
		if (newValue != null) {
			multivaluededitorRO.setText(multivaluededitorROList.toString());
		} else {
			multivaluededitorRO.setText(""); //$NON-NLS-1$
		}
	}










	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 */
	public String getTitle() {
		return NonregMessages.MultiValuedEditor_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code

}
