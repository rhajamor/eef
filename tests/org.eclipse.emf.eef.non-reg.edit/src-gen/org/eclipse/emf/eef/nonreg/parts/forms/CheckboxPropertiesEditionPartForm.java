/**
 * Generated with Acceleo
 */
package org.eclipse.emf.eef.nonreg.parts.forms;

// Start of user code for imports
import org.eclipse.emf.eef.nonreg.parts.CheckboxPropertiesEditionPart;
import org.eclipse.emf.eef.nonreg.parts.NonregViewsRepository;
import org.eclipse.emf.eef.nonreg.providers.NonregMessages;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;


// End of user code

/**
 * 
 * @generated
 */
public class CheckboxPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, CheckboxPropertiesEditionPart {

	protected Button checkbox;
	protected Button checkboxRO;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * @generated
	 */
	public CheckboxPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
    createCheckboxCheckbox(widgetFactory, view);

    createCheckboxROCheckbox(widgetFactory, view);

    // Start of user code for additional ui definition
    
    // End of user code
  }
	
	protected void createCheckboxCheckbox(FormToolkit widgetFactory, Composite parent) {
		checkbox = widgetFactory.createButton(parent, NonregMessages.CheckboxPropertiesEditionPart_CheckboxLabel, SWT.CHECK);
		checkbox.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	@generated
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CheckboxPropertiesEditionPartForm.this, NonregViewsRepository.Checkbox.checkbox, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(checkbox.getSelection())));
			}

		});
		GridData checkboxData = new GridData(GridData.FILL_HORIZONTAL);
		checkboxData.horizontalSpan = 2;
		checkbox.setLayoutData(checkboxData);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(NonregViewsRepository.Checkbox.checkbox, NonregViewsRepository.FORM_KIND), null); //$NON-NLS-1$
	}

	
	protected void createCheckboxROCheckbox(FormToolkit widgetFactory, Composite parent) {
		checkboxRO = widgetFactory.createButton(parent, NonregMessages.CheckboxPropertiesEditionPart_CheckboxROLabel, SWT.CHECK);
		checkboxRO.setEnabled(false);
		checkboxRO.setToolTipText(NonregMessages.Checkbox_ReadOnly);
		checkboxRO.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	@generated
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CheckboxPropertiesEditionPartForm.this, NonregViewsRepository.Checkbox.checkboxRO, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(checkboxRO.getSelection())));
			}

		});
		GridData checkboxROData = new GridData(GridData.FILL_HORIZONTAL);
		checkboxROData.horizontalSpan = 2;
		checkboxRO.setLayoutData(checkboxROData);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(NonregViewsRepository.Checkbox.checkboxRO, NonregViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see org.eclipse.emf.eef.nonreg.parts.CheckboxPropertiesEditionPart#getCheckbox()
	 * @generated
	 */
	public Boolean getCheckbox() {
    return Boolean.valueOf(checkbox.getSelection());
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.CheckboxPropertiesEditionPart#setCheckbox(Boolean newValue)
	 * @generated
	 */
	public void setCheckbox(Boolean newValue) {
    if (newValue != null) {
      checkbox.setSelection(newValue.booleanValue());
    } else {
      checkbox.setSelection(false);
    }
  }


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.CheckboxPropertiesEditionPart#getCheckboxRO()
	 * @generated
	 */
	public Boolean getCheckboxRO() {
    return Boolean.valueOf(checkboxRO.getSelection());
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.CheckboxPropertiesEditionPart#setCheckboxRO(Boolean newValue)
	 * @generated
	 */
	public void setCheckboxRO(Boolean newValue) {
    if (newValue != null) {
      checkboxRO.setSelection(newValue.booleanValue());
    } else {
      checkboxRO.setSelection(false);
    }
  }




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * @generated
	 */
	public String getTitle() {
    return NonregMessages.Checkbox_Part_Title;
  }

	// Start of user code additional methods
	
	// End of user code


}
