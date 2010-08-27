/**
 * Generated with Acceleo
 */
package org.eclipse.emf.eef.nonreg.parts.impl;

// Start of user code for imports
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.ab.abstractnonreg.parts.AbstractnonregViewsRepository;
import org.eclipse.emf.eef.ab.abstractnonreg.parts.DocumentedElementPropertiesEditionPart;
import org.eclipse.emf.eef.nonreg.parts.NonregViewsRepository;
import org.eclipse.emf.eef.nonreg.parts.TalkPropertiesEditionPart;
import org.eclipse.emf.eef.nonreg.providers.NonregMessages;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.services.PropertiesEditionPartProviderService;
import org.eclipse.emf.eef.runtime.ui.providers.EMFListContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
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
 * @generated
 */
public class TalkPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, TalkPropertiesEditionPart {

	protected Text title_;
	protected EMFComboViewer type;
	protected EObjectFlatComboViewer presenter;
	protected EMFComboViewer creator;
	private DocumentedElementPropertiesEditionPart documentedElementPropertiesEditionPart;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * @generated
	 */
	public TalkPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
    createPropertiesGroup(view);

    createDocumentedElement(view);


    // Start of user code for additional ui definition
    
    // End of user code
  }

	/**
	 * @generated
	 */
	protected void createPropertiesGroup(Composite parent) {
    Group propertiesGroup = new Group(parent, SWT.NONE);
    propertiesGroup.setText(NonregMessages.TalkPropertiesEditionPart_PropertiesGroupLabel);
    GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
    propertiesGroupData.horizontalSpan = 3;
    propertiesGroup.setLayoutData(propertiesGroupData);
    GridLayout propertiesGroupLayout = new GridLayout();
    propertiesGroupLayout.numColumns = 3;
    propertiesGroup.setLayout(propertiesGroupLayout);
    createTitle_Text(propertiesGroup);
    createTypeEMFComboViewer(propertiesGroup);
    createPresenterFlatComboViewer(propertiesGroup);
    createCreatorEMFComboViewer(propertiesGroup);
  }

	
	protected void createTitle_Text(Composite parent) {
		SWTUtils.createPartLabel(parent, NonregMessages.TalkPropertiesEditionPart_Title_Label, propertiesEditionComponent.isRequired(NonregViewsRepository.Talk.title_, NonregViewsRepository.SWT_KIND));
		title_ = new Text(parent, SWT.BORDER);
		GridData title_Data = new GridData(GridData.FILL_HORIZONTAL);
		title_.setLayoutData(title_Data);
		title_.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * @generated
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TalkPropertiesEditionPartImpl.this, NonregViewsRepository.Talk.title_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, title_.getText()));
			}

		});
		title_.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * @generated
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TalkPropertiesEditionPartImpl.this, NonregViewsRepository.Talk.title_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, title_.getText()));
				}
			}

		});
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NonregViewsRepository.Talk.title_, NonregViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	
	protected void createTypeEMFComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, NonregMessages.TalkPropertiesEditionPart_TypeLabel, propertiesEditionComponent.isRequired(NonregViewsRepository.Talk.type, NonregViewsRepository.SWT_KIND));
		type = new EMFComboViewer(parent);
		type.setContentProvider(new ArrayContentProvider());
		type.setLabelProvider(new AdapterFactoryLabelProvider(new EcoreAdapterFactory()));
		GridData typeData = new GridData(GridData.FILL_HORIZONTAL);
		type.getCombo().setLayoutData(typeData);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NonregViewsRepository.Talk.type, NonregViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	/**
	 * @param propertiesGroup
	 * @generated
	 */
	protected void createPresenterFlatComboViewer(Composite parent) {
    SWTUtils.createPartLabel(parent, NonregMessages.TalkPropertiesEditionPart_PresenterLabel, propertiesEditionComponent.isRequired(NonregViewsRepository.Talk.presenter, NonregViewsRepository.SWT_KIND));
    presenter = new EObjectFlatComboViewer(parent, false);
    presenter.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

    presenter.addSelectionChangedListener(new ISelectionChangedListener() {

      public void selectionChanged(SelectionChangedEvent event) {
        propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TalkPropertiesEditionPartImpl.this, NonregViewsRepository.Talk.presenter, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getPresenter()));
      }

    });
    GridData presenterData = new GridData(GridData.FILL_HORIZONTAL);
    presenter.setLayoutData(presenterData);
    SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NonregViewsRepository.Talk.presenter, NonregViewsRepository.SWT_KIND), null); //$NON-NLS-1$
  }

	
	protected void createCreatorEMFComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, NonregMessages.TalkPropertiesEditionPart_CreatorLabel, propertiesEditionComponent.isRequired(NonregViewsRepository.Talk.creator, NonregViewsRepository.SWT_KIND));
		creator = new EMFComboViewer(parent);
		GridData creatorData = new GridData(GridData.FILL_HORIZONTAL);
		creator.getCombo().setLayoutData(creatorData);
		creator.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		creator.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TalkPropertiesEditionPartImpl.this, NonregViewsRepository.Talk.creator, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getCreator()));
			}
			
		});
		creator.setContentProvider(new EMFListContentProvider());
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NonregViewsRepository.Talk.creator, NonregViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	protected void createDocumentedElement(Composite container) {
		IPropertiesEditionPartProvider provider = PropertiesEditionPartProviderService.getInstance().getProvider(AbstractnonregViewsRepository.class);
		documentedElementPropertiesEditionPart = (DocumentedElementPropertiesEditionPart)provider.getPropertiesEditionPart(AbstractnonregViewsRepository.DocumentedElement.class, AbstractnonregViewsRepository.SWT_KIND, propertiesEditionComponent);
		((ISWTPropertiesEditionPart)documentedElementPropertiesEditionPart).createControls(container);
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
	 * @see org.eclipse.emf.eef.nonreg.parts.TalkPropertiesEditionPart#getTitle_()
	 * @generated
	 */
	public String getTitle_() {
    return title_.getText();
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.TalkPropertiesEditionPart#setTitle_(String newValue)
	 * @generated
	 */
	public void setTitle_(String newValue) {
    if (newValue != null) {
      title_.setText(newValue);
    } else {
      title_.setText(""); //$NON-NLS-1$
    }
  }


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.TalkPropertiesEditionPart#getType()
	 * @generated
	 */
	public Enumerator getType() {
    EEnumLiteral selection = (EEnumLiteral) ((StructuredSelection) type.getSelection()).getFirstElement();
    return selection.getInstance();
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.TalkPropertiesEditionPart#initType(EEnum eenum, Enumerator current)
	 */
	public void initType(EEnum eenum, Enumerator current) {
		type.setInput(eenum.getELiterals());
		type.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.TalkPropertiesEditionPart#setType(Enumerator newValue)
	 * @generated
	 */
	public void setType(Enumerator newValue) {
    type.modelUpdating(new StructuredSelection(newValue));
  }


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.TalkPropertiesEditionPart#getPresenter()
	 * @generated
	 */
	public EObject getPresenter() {
    if (presenter.getSelection() instanceof StructuredSelection) {
      Object firstElement = ((StructuredSelection) presenter.getSelection()).getFirstElement();
      if (firstElement instanceof EObject)
        return (EObject) firstElement;
    }
    return null;
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.TalkPropertiesEditionPart#initPresenter(ResourceSet allResources, EObject current)
	 */
	public void initPresenter(ResourceSet allResources, EObject current) {
		presenter.setInput(allResources);
		if (current != null) {
			presenter.setSelection(new StructuredSelection(current));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.TalkPropertiesEditionPart#setPresenter(EObject newValue)
	 * @generated
	 */
	public void setPresenter(EObject newValue) {
    if (newValue != null) {
      presenter.setSelection(new StructuredSelection(newValue));
    } else {
      presenter.setSelection(new StructuredSelection()); //$NON-NLS-1$
    }
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.TalkPropertiesEditionPart#setPresenterButtonMode(ButtonsModeEnum newValue)
	 */
	public void setPresenterButtonMode(ButtonsModeEnum newValue) {
		presenter.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.TalkPropertiesEditionPart#addFilterPresenter(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToPresenter(ViewerFilter filter) {
    presenter.addFilter(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.TalkPropertiesEditionPart#addBusinessFilterPresenter(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToPresenter(ViewerFilter filter) {
    presenter.addBusinessRuleFilter(filter);
  }


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.TalkPropertiesEditionPart#getCreator()
	 * @generated
	 */
	public Object getCreator() {
    if (creator.getSelection() instanceof StructuredSelection) {
      Object firstElement = ((StructuredSelection) creator.getSelection()).getFirstElement();
      if (firstElement instanceof EObject)
        return (EObject) firstElement;
    }
    return "";
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.TalkPropertiesEditionPart#initCreator(ResourceSet allResources, EObject current)
	 */
	public void initCreator(ResourceSet allResources, EObject current) {
		creator.setInput(allResources);
		if (current != null) {
			creator.setSelection(new StructuredSelection(current));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.TalkPropertiesEditionPart#setCreator(Object newValue)
	 * @generated
	 */
	public void setCreator(Object newValue) {
    if (newValue != null) {
      creator.modelUpdating(new StructuredSelection(newValue));
    } else {
      creator.modelUpdating(new StructuredSelection("")); //$NON-NLS-1$
    }
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.TalkPropertiesEditionPart#addFilterCreator(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToCreator(ViewerFilter filter) {
    creator.addFilter(filter);
  }


/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.TalkPropertiesEditionPart#getDocumentedElementReferencedView()
	 * @generated
	 */
		public IPropertiesEditionPart getDocumentedElementReferencedView() {
      return (IPropertiesEditionPart) documentedElementPropertiesEditionPart;
    }
	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.TalkPropertiesEditionPart#getDocumentation()
	 * @generated
	 */
	public String getDocumentation() {
    return documentedElementPropertiesEditionPart.getDocumentation();
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.nonreg.parts.TalkPropertiesEditionPart#setDocumentation(String newValue)
	 * @generated
	 */
	public void setDocumentation(String newValue) {
    documentedElementPropertiesEditionPart.setDocumentation(newValue);
  }







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * @generated
	 */
	public String getTitle() {
    return NonregMessages.Talk_Part_Title;
  }

	// Start of user code additional methods
	
	// End of user code


}
