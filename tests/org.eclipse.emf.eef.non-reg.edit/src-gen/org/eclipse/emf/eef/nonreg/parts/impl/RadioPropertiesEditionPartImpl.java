/**
 * Generated with Acceleo
 */
package org.eclipse.emf.eef.nonreg.parts.impl;

// Start of user code for imports
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.eef.nonreg.parts.NonregViewsRepository;
import org.eclipse.emf.eef.nonreg.parts.RadioPropertiesEditionPart;
import org.eclipse.emf.eef.nonreg.providers.NonregMessages;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.widgets.RadioViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
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
public class RadioPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, RadioPropertiesEditionPart {

	protected RadioViewer radioRadioViewer;
	protected RadioViewer radioRORadioViewer;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * @generated
	 */
	public RadioPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
    createRadioRadioViewer(view);

    createRadioRORadioViewer(view);


    // Start of user code for additional ui definition
    
    // End of user code
  }

	/**
	 * @generated
	 */
	protected void createRadioRadioViewer(Composite parent) {
    radioRadioViewer = new RadioViewer(parent, SWT.CHECK);
    GridData radioData = new GridData(GridData.FILL_HORIZONTAL);
    radioData.horizontalSpan = 2;
    radioRadioViewer.setLayoutData(radioData);
    SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NonregViewsRepository.Radio.radio, NonregViewsRepository.SWT_KIND), null);
  }

	/**
	 * @generated
	 */
	protected void createRadioRORadioViewer(Composite parent) {
    radioRORadioViewer = new RadioViewer(parent, SWT.CHECK);
    radioRORadioViewer.setEnabled(false);
    radioRORadioViewer.setToolTipText(NonregMessages.Radio_ReadOnly);
    GridData radioROData = new GridData(GridData.FILL_HORIZONTAL);
    radioROData.horizontalSpan = 2;
    radioRORadioViewer.setLayoutData(radioROData);
    SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NonregViewsRepository.Radio.radioRO, NonregViewsRepository.SWT_KIND), null);
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
	 * @see org.eclipse.emf.eef.nonreg.parts.RadioPropertiesEditionPart#getRadio()
	 * @generated
	 */
	public Object getRadio() {
    if (radioRadioViewer.getSelection() instanceof StructuredSelection) {
      StructuredSelection sSelection = (StructuredSelection) radioRadioViewer.getSelection();
      return sSelection.getFirstElement();
    }
    return null;
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.RadioPropertiesEditionPart#initRadio(EEnum eenum, Enumerator current)
	 */
	public void initRadio(EEnum eenum, Enumerator current) {
		radioRadioViewer.setInput(eenum.getELiterals());
		radioRadioViewer.setSelection(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.RadioPropertiesEditionPart#setRadio(Object newValue)
	 * @generated
	 */
	public void setRadio(Object newValue) {
    radioRadioViewer.setSelection(new StructuredSelection(newValue));
  }


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.RadioPropertiesEditionPart#getRadioRO()
	 * @generated
	 */
	public Object getRadioRO() {
    if (radioRORadioViewer.getSelection() instanceof StructuredSelection) {
      StructuredSelection sSelection = (StructuredSelection) radioRORadioViewer.getSelection();
      return sSelection.getFirstElement();
    }
    return null;
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.RadioPropertiesEditionPart#initRadioRO(EEnum eenum, Enumerator current)
	 */
	public void initRadioRO(EEnum eenum, Enumerator current) {
		radioRORadioViewer.setInput(eenum.getELiterals());
		radioRORadioViewer.setSelection(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.RadioPropertiesEditionPart#setRadioRO(Object newValue)
	 * @generated
	 */
	public void setRadioRO(Object newValue) {
    radioRORadioViewer.setSelection(new StructuredSelection(newValue));
  }







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * @generated
	 */
	public String getTitle() {
    return NonregMessages.Radio_Part_Title;
  }

	// Start of user code additional methods
	
	// End of user code


}
