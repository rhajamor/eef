/**
 * Generated with Acceleo
 */
package org.eclipse.emf.eef.nonreg.parts.impl;

// Start of user code for imports
import org.eclipse.emf.eef.nonreg.parts.NonregViewsRepository;
import org.eclipse.emf.eef.nonreg.parts.TextAreaPropertiesEditionPart;
import org.eclipse.emf.eef.nonreg.providers.NonregMessages;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;



// End of user code	

/**
 * 
 * @generated
 */
public class TextAreaPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, TextAreaPropertiesEditionPart {

	protected Text textarea;
	protected Text textareaRO;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * @generated
	 */
	public TextAreaPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
    createTextareaTextarea(view);

    createTextareaROTextarea(view);


    // Start of user code for additional ui definition
    
    // End of user code
  }

	
	protected void createTextareaTextarea(Composite parent) {
		Label textareaLabel = SWTUtils.createPartLabel(parent, NonregMessages.TextAreaPropertiesEditionPart_TextareaLabel, propertiesEditionComponent.isRequired(NonregViewsRepository.TextArea.textarea, NonregViewsRepository.SWT_KIND));
		GridData textareaLabelData = new GridData(GridData.FILL_HORIZONTAL);
		textareaLabelData.horizontalSpan = 3;
		textareaLabel.setLayoutData(textareaLabelData);
		textarea = new Text(parent, SWT.BORDER | SWT.WRAP | SWT.MULTI | SWT.V_SCROLL);
		GridData textareaData = new GridData(GridData.FILL_HORIZONTAL);
		textareaData.horizontalSpan = 2;
		textareaData.heightHint = 80;
		textareaData.widthHint = 200;
		textarea.setLayoutData(textareaData);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NonregViewsRepository.TextArea.textarea, NonregViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	
	protected void createTextareaROTextarea(Composite parent) {
		Label textareaROLabel = SWTUtils.createPartLabel(parent, NonregMessages.TextAreaPropertiesEditionPart_TextareaROLabel, propertiesEditionComponent.isRequired(NonregViewsRepository.TextArea.textareaRO, NonregViewsRepository.SWT_KIND));
		GridData textareaROLabelData = new GridData(GridData.FILL_HORIZONTAL);
		textareaROLabelData.horizontalSpan = 3;
		textareaROLabel.setLayoutData(textareaROLabelData);
		textareaRO = new Text(parent, SWT.BORDER | SWT.WRAP | SWT.MULTI | SWT.V_SCROLL);
		textareaRO.setEnabled(false);
		textareaRO.setToolTipText(NonregMessages.TextArea_ReadOnly);
		GridData textareaROData = new GridData(GridData.FILL_HORIZONTAL);
		textareaROData.horizontalSpan = 2;
		textareaROData.heightHint = 80;
		textareaROData.widthHint = 200;
		textareaRO.setLayoutData(textareaROData);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NonregViewsRepository.TextArea.textareaRO, NonregViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
