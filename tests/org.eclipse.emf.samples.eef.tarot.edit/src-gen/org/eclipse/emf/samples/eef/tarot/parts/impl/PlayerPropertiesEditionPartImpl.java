/**
 * Generated with Acceleo
 */
package org.eclipse.emf.samples.eef.tarot.parts.impl;

// Start of user code for imports

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.imageviewer.EEFImageViewer;
import org.eclipse.emf.samples.eef.tarot.parts.PlayerPropertiesEditionPart;
import org.eclipse.emf.samples.eef.tarot.parts.TarotViewsRepository;
import org.eclipse.emf.samples.eef.tarot.providers.TarotMessages;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

// End of user code	

/**
 * 
 * 
 */
public class PlayerPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, PlayerPropertiesEditionPart {

	protected Text name;
	protected EEFImageViewer pics;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public PlayerPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createFigure(org.eclipse.swt.widgets.Composite)
	 * 
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
	 * 
	 */
	public void createControls(Composite view) { 
		createIdentityGroup(view);


		// Start of user code for additional ui definition
		
		// End of user code
	}

	/**
	 * 
	 */
	protected void createIdentityGroup(Composite parent) {
		Group identityGroup = new Group(parent, SWT.NONE);
		identityGroup.setText(TarotMessages.PlayerPropertiesEditionPart_IdentityGroupLabel);
		GridData identityGroupData = new GridData(GridData.FILL_HORIZONTAL);
		identityGroupData.horizontalSpan = 3;
		identityGroup.setLayoutData(identityGroupData);
		GridLayout identityGroupLayout = new GridLayout();
		identityGroupLayout.numColumns = 3;
		identityGroup.setLayout(identityGroupLayout);
		createNameText(identityGroup);
		createPicsImageViewer(identityGroup);
	}

	
	protected void createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, TarotMessages.PlayerPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(TarotViewsRepository.Player.name, TarotViewsRepository.SWT_KIND));
		name = new Text(parent, SWT.BORDER);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlayerPropertiesEditionPartImpl.this, TarotViewsRepository.Player.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
			}

		});
		name.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlayerPropertiesEditionPartImpl.this, TarotViewsRepository.Player.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(TarotViewsRepository.Player.name, TarotViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	/**
	 * 
	 */
	protected void createPicsImageViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, TarotMessages.PlayerPropertiesEditionPart_PicsLabel, propertiesEditionComponent.isRequired(TarotViewsRepository.Player.pics, TarotViewsRepository.SWT_KIND));
		pics = new EEFImageViewer(parent, SWT.BORDER);
		GridData picsData = new GridData();
		// Start of user code for pics layout data customization
		picsData.widthHint = 260;
		picsData.heightHint = 260;
		picsData.horizontalAlignment = SWT.CENTER;
		picsData.verticalAlignment = SWT.CENTER;
 		// End of user code
		pics.setLayoutData(picsData);
		pics.addSelectionChangedListener(new ISelectionChangedListener() {
			
			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlayerPropertiesEditionPartImpl.this, TarotViewsRepository.Player.pics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getPics()));
			}
		});
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(TarotViewsRepository.Player.pics, TarotViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization
		
		// End of user code
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.eef.tarot.parts.PlayerPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.eef.tarot.parts.PlayerPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.eef.tarot.parts.PlayerPropertiesEditionPart#getPics()
	 * 
	 */
	public String getPics() {
		ISelection selection = pics.getSelection();
		if (selection instanceof StructuredSelection && ((StructuredSelection)selection).getFirstElement() instanceof String) {
			return (String)((StructuredSelection)selection).getFirstElement();
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.eef.tarot.parts.PlayerPropertiesEditionPart#initPics(String key, String newValue)
	 */
	public void initPics(String key, String newValue) {
		if (newValue != null) {
			pics.initViewer(key, newValue);
		} else {
			pics.initViewer(key, "");  //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.eef.tarot.parts.PlayerPropertiesEditionPart#setPics(String newValue)
	 * 
	 */
	public void setPics(String newValue) {
		if (newValue != null) {
			pics.setSelection(new StructuredSelection(newValue));
		} else {
			pics.setSelection(new StructuredSelection(""));  //$NON-NLS-1$
		}
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return TarotMessages.Player_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
