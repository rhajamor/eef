/**
 * Generated with Acceleo
 */
package org.eclipse.emf.eef.nonreg.parts.forms;

// Start of user code for imports
import org.eclipse.emf.eef.nonreg.parts.NonregViewsRepository;
import org.eclipse.emf.eef.nonreg.parts.TextAreaPropertiesEditionPart;
import org.eclipse.emf.eef.nonreg.providers.NonregMessages;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;


// End of user code

/**
 * 
 * @generated
 */
public class TextAreaPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, TextAreaPropertiesEditionPart {

	protected Text textarea;
	protected Text textareaRO;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * @generated
	 */
	public TextAreaPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
    createTextareaTextarea(widgetFactory, view);

    createTextareaROTextarea(widgetFactory, view);

    // Start of user code for additional ui definition
    
    // End of user code
  }
	
	protected void createTextareaTextarea(FormToolkit widgetFactory, Composite parent) {
		Label textareaLabel = FormUtils.createPartLabel(widgetFactory, parent, NonregMessages.TextAreaPropertiesEditionPart_TextareaLabel, propertiesEditionComponent.isRequired(NonregViewsRepository.TextArea.textarea, NonregViewsRepository.FORM_KIND));
		GridData textareaLabelData = new GridData(GridData.FILL_HORIZONTAL);
		textareaLabelData.horizontalSpan = 3;
		textareaLabel.setLayoutData(textareaLabelData);
		textarea = widgetFactory.createText(parent, "", SWT.BORDER | SWT.WRAP | SWT.MULTI | SWT.V_SCROLL); //$NON-NLS-1$
		GridData textareaData = new GridData(GridData.FILL_HORIZONTAL);
		textareaData.horizontalSpan = 2;
		textareaData.heightHint = 80;
		textareaData.widthHint = 200;
		textarea.setLayoutData(textareaData);
		textarea.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * @generated
			 */
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextAreaPropertiesEditionPartForm.this, NonregViewsRepository.TextArea.textarea, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, textarea.getText()));
			}

		});
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(NonregViewsRepository.TextArea.textarea, NonregViewsRepository.FORM_KIND), null); //$NON-NLS-1$
	}

	
	protected void createTextareaROTextarea(FormToolkit widgetFactory, Composite parent) {
		Label textareaROLabel = FormUtils.createPartLabel(widgetFactory, parent, NonregMessages.TextAreaPropertiesEditionPart_TextareaROLabel, propertiesEditionComponent.isRequired(NonregViewsRepository.TextArea.textareaRO, NonregViewsRepository.FORM_KIND));
		GridData textareaROLabelData = new GridData(GridData.FILL_HORIZONTAL);
		textareaROLabelData.horizontalSpan = 3;
		textareaROLabel.setLayoutData(textareaROLabelData);
		textareaRO = widgetFactory.createText(parent, "", SWT.BORDER | SWT.WRAP | SWT.MULTI | SWT.V_SCROLL); //$NON-NLS-1$
		textareaRO.setEnabled(false);
		textareaRO.setToolTipText(NonregMessages.TextArea_ReadOnly);
		GridData textareaROData = new GridData(GridData.FILL_HORIZONTAL);
		textareaROData.horizontalSpan = 2;
		textareaROData.heightHint = 80;
		textareaROData.widthHint = 200;
		textareaRO.setLayoutData(textareaROData);
		textareaRO.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * @generated
			 */
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextAreaPropertiesEditionPartForm.this, NonregViewsRepository.TextArea.textareaRO, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, textareaRO.getText()));
			}

		});
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(NonregViewsRepository.TextArea.textareaRO, NonregViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see org.eclipse.emf.eef.nonreg.parts.TextAreaPropertiesEditionPart#getTextarea()
	 * @generated
	 */
	public String getTextarea() {
    return textarea.getText();
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.TextAreaPropertiesEditionPart#setTextarea(String newValue)
	 * @generated
	 */
	public void setTextarea(String newValue) {
    if (newValue != null) {
      textarea.setText(newValue);
    } else {
      textarea.setText("");  //$NON-NLS-1$
    }
  }


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.TextAreaPropertiesEditionPart#getTextareaRO()
	 * @generated
	 */
	public String getTextareaRO() {
    return textareaRO.getText();
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.TextAreaPropertiesEditionPart#setTextareaRO(String newValue)
	 * @generated
	 */
	public void setTextareaRO(String newValue) {
    if (newValue != null) {
      textareaRO.setText(newValue);
    } else {
      textareaRO.setText("");  //$NON-NLS-1$
    }
  }




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * @generated
	 */
	public String getTitle() {
    return NonregMessages.TextArea_Part_Title;
  }

	// Start of user code additional methods
	
	// End of user code


}
