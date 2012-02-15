/*******************************************************************************
 * Copyright (c) 2009 - 2010 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.eefnr.navigation.parts.forms;

// Start of user code for imports
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.eefnr.navigation.NavigationPackage;
import org.eclipse.emf.eef.eefnr.navigation.parts.DeferedMultivaluedEditorPropertiesEditionPart;
import org.eclipse.emf.eef.eefnr.navigation.parts.NavigationViewsRepository;
import org.eclipse.emf.eef.eefnr.navigation.providers.NavigationMessages;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.EEFFeatureEditorDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;


// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class DeferedMultivaluedEditorPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, DeferedMultivaluedEditorPropertiesEditionPart {

	protected Text multivaluedEditor;
		protected Button editMultivaluedEditor;
		private EList multivaluedEditorList;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public DeferedMultivaluedEditorPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createFigure(org.eclipse.swt.widgets.Composite, org.eclipse.ui.forms.widgets.FormToolkit)
	 * 
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
	 * 
	 */
	public void createControls(final FormToolkit widgetFactory, Composite view) {
		CompositionSequence deferedMultivaluedEditorStep = new BindingCompositionSequence(propertiesEditionComponent);
		deferedMultivaluedEditorStep
			.addStep(NavigationViewsRepository.DeferedMultivaluedEditor.Properties.class)
			.addStep(NavigationViewsRepository.DeferedMultivaluedEditor.Properties.multivaluedEditor);
		
		
		composer = new PartComposer(deferedMultivaluedEditorStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == NavigationViewsRepository.DeferedMultivaluedEditor.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == NavigationViewsRepository.DeferedMultivaluedEditor.Properties.multivaluedEditor) {
					return createMultivaluedEditorMultiValuedEditor(widgetFactory, parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * 
	 */
	protected Composite createPropertiesGroup(FormToolkit widgetFactory, final Composite parent) {
		Section propertiesSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		propertiesSection.setText(NavigationMessages.DeferedMultivaluedEditorPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		propertiesSection.setClient(propertiesGroup);
		return propertiesGroup;
	}

	/**
	 * 
	 */
	protected Composite createMultivaluedEditorMultiValuedEditor(FormToolkit widgetFactory, Composite parent) {
		multivaluedEditor = widgetFactory.createText(parent, "", SWT.READ_ONLY); //$NON-NLS-1$
		GridData multivaluedEditorData = new GridData(GridData.FILL_HORIZONTAL);
		multivaluedEditorData.horizontalSpan = 2;
		multivaluedEditor.setLayoutData(multivaluedEditorData);
		EditingUtils.setID(multivaluedEditor, NavigationViewsRepository.DeferedMultivaluedEditor.Properties.multivaluedEditor);
		EditingUtils.setEEFtype(multivaluedEditor, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editMultivaluedEditor = widgetFactory.createButton(parent, NavigationMessages.DeferedMultivaluedEditorPropertiesEditionPart_MultivaluedEditorLabel, SWT.NONE);
		GridData editMultivaluedEditorData = new GridData();
		editMultivaluedEditor.setLayoutData(editMultivaluedEditorData);
		editMultivaluedEditor.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(
						multivaluedEditor.getShell(), "DeferedMultivaluedEditorSample", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						multivaluedEditorList, NavigationPackage.eINSTANCE.getDeferedMultivaluedEditor_MultiValuedEditor().getEType(), null,
						false, true, 
						null, null);
				if (dialog.open() == Window.OK) {
					multivaluedEditorList = dialog.getResult();
					if (multivaluedEditorList == null) {
						multivaluedEditorList = new BasicEList();
					}
					multivaluedEditor.setText(multivaluedEditorList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DeferedMultivaluedEditorPropertiesEditionPartForm.this, NavigationViewsRepository.DeferedMultivaluedEditor.Properties.multivaluedEditor, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new BasicEList(multivaluedEditorList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editMultivaluedEditor, NavigationViewsRepository.DeferedMultivaluedEditor.Properties.multivaluedEditor);
		EditingUtils.setEEFtype(editMultivaluedEditor, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
		return parent;
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
	 * @see org.eclipse.emf.eef.navigation.parts.DeferedMultivaluedEditorPropertiesEditionPart#getMultivaluedEditor()
	 * 
	 */
	public EList getMultivaluedEditor() {
		return multivaluedEditorList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.DeferedMultivaluedEditorPropertiesEditionPart#setMultivaluedEditor(EList newValue)
	 * 
	 */
	public void setMultivaluedEditor(EList newValue) {
		multivaluedEditorList = newValue;
		if (newValue != null) {
			multivaluedEditor.setText(multivaluedEditorList.toString());
		} else {
			multivaluedEditor.setText(""); //$NON-NLS-1$
		}
	}

	public void addToMultivaluedEditor(Object newValue) {
		multivaluedEditorList.add(newValue);
		if (newValue != null) {
			multivaluedEditor.setText(multivaluedEditorList.toString());
		} else {
			multivaluedEditor.setText(""); //$NON-NLS-1$
		}
	}

	public void removeToMultivaluedEditor(Object newValue) {
		multivaluedEditorList.remove(newValue);
		if (newValue != null) {
			multivaluedEditor.setText(multivaluedEditorList.toString());
		} else {
			multivaluedEditor.setText(""); //$NON-NLS-1$
		}
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return NavigationMessages.DeferedMultivaluedEditor_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
