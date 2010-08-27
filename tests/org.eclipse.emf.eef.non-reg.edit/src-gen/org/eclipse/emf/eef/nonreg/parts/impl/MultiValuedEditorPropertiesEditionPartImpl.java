/**
 * Generated with Acceleo
 */
package org.eclipse.emf.eef.nonreg.parts.impl;

// Start of user code for imports
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.celleditor.FeatureEditorDialog;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.nonreg.NonregPackage;
import org.eclipse.emf.eef.nonreg.parts.MultiValuedEditorPropertiesEditionPart;
import org.eclipse.emf.eef.nonreg.parts.NonregViewsRepository;
import org.eclipse.emf.eef.nonreg.providers.NonregMessages;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
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



// End of user code	

/**
 * 
 * @generated
 */
public class MultiValuedEditorPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, MultiValuedEditorPropertiesEditionPart {

	protected Text multivaluededitor;
	protected Button editMultivaluededitor;
	private EList multivaluededitorList;
	protected Text multivaluededitorRO;
	protected Button editMultivaluededitorRO;
	private EList multivaluededitorROList;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * @generated
	 */
	public MultiValuedEditorPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
    createMultivaluededitorMultiValuedEditor(view);

    createMultivaluededitorROMultiValuedEditor(view);


    // Start of user code for additional ui definition
    
    // End of user code
  }

	protected void createMultivaluededitorMultiValuedEditor(Composite parent) {
		multivaluededitor = new Text(parent, SWT.BORDER | SWT.READ_ONLY);
		GridData multivaluededitorData = new GridData(GridData.FILL_HORIZONTAL);
		multivaluededitorData.horizontalSpan = 2;
		multivaluededitor.setLayoutData(multivaluededitorData);
		editMultivaluededitor = new Button(parent, SWT.NONE);
		editMultivaluededitor.setText(NonregMessages.MultiValuedEditorPropertiesEditionPart_MultivaluededitorLabel);
		GridData editMultivaluededitorData = new GridData();
		editMultivaluededitor.setLayoutData(editMultivaluededitorData);
		editMultivaluededitor.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MultiValuedEditorPropertiesEditionPartImpl.this, NonregViewsRepository.MultiValuedEditor.multivaluededitor, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, multivaluededitorList));
					setHasChanged(true);
				}
			}
		});
	}

	protected void createMultivaluededitorROMultiValuedEditor(Composite parent) {
		multivaluededitorRO = new Text(parent, SWT.BORDER | SWT.READ_ONLY);
		multivaluededitorRO.setEnabled(false);
		multivaluededitorRO.setToolTipText(NonregMessages.MultiValuedEditor_ReadOnly);
		GridData multivaluededitorROData = new GridData(GridData.FILL_HORIZONTAL);
		multivaluededitorROData.horizontalSpan = 2;
		multivaluededitorRO.setLayoutData(multivaluededitorROData);
		editMultivaluededitorRO = new Button(parent, SWT.NONE);
		editMultivaluededitorRO.setText(NonregMessages.MultiValuedEditorPropertiesEditionPart_MultivaluededitorROLabel);
		GridData editMultivaluededitorROData = new GridData();
		editMultivaluededitorRO.setLayoutData(editMultivaluededitorROData);
		editMultivaluededitorRO.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MultiValuedEditorPropertiesEditionPartImpl.this, NonregViewsRepository.MultiValuedEditor.multivaluededitorRO, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, multivaluededitorROList));
					setHasChanged(true);
				}
			}
		});
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
	 * @see org.eclipse.emf.eef.nonreg.parts.MultiValuedEditorPropertiesEditionPart#getMultivaluededitor()
	 * @generated
	 */
	public EList getMultivaluededitor() {
    return multivaluededitorList;
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.MultiValuedEditorPropertiesEditionPart#setMultivaluededitor(EList newValue)
	 * @generated
	 */
	public void setMultivaluededitor(EList newValue) {
    multivaluededitorList = newValue;
    if (newValue != null) {
      multivaluededitor.setText(multivaluededitorList.toString());
    } else {
      multivaluededitor.setText(""); //$NON-NLS-1$
    }
  }
	
	public void addToMultivaluededitor(java.lang.String newValue) {
		multivaluededitorList.add(newValue);		
		if (newValue != null) {
			multivaluededitor.setText(multivaluededitorList.toString());
		} else {
			multivaluededitor.setText(""); //$NON-NLS-1$
		}
	}
	
	public void removeToMultivaluededitor(java.lang.String newValue) {
		multivaluededitorList.remove(newValue);		
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
	 * @generated
	 */
	public EList getMultivaluededitorRO() {
    return multivaluededitorROList;
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.MultiValuedEditorPropertiesEditionPart#setMultivaluededitorRO(EList newValue)
	 * @generated
	 */
	public void setMultivaluededitorRO(EList newValue) {
    multivaluededitorROList = newValue;
    if (newValue != null) {
      multivaluededitorRO.setText(multivaluededitorROList.toString());
    } else {
      multivaluededitorRO.setText(""); //$NON-NLS-1$
    }
  }
	
	public void addToMultivaluededitorRO(java.lang.String newValue) {
		multivaluededitorROList.add(newValue);		
		if (newValue != null) {
			multivaluededitorRO.setText(multivaluededitorROList.toString());
		} else {
			multivaluededitorRO.setText(""); //$NON-NLS-1$
		}
	}
	
	public void removeToMultivaluededitorRO(java.lang.String newValue) {
		multivaluededitorROList.remove(newValue);		
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
	 * @generated
	 */
	public String getTitle() {
    return NonregMessages.MultiValuedEditor_Part_Title;
  }

	// Start of user code additional methods
	
	// End of user code


}
