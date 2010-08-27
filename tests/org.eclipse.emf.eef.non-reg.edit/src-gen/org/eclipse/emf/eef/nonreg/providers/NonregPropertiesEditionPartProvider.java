/**
 * Generated with Acceleo
 */
package org.eclipse.emf.eef.nonreg.providers;

import org.eclipse.emf.eef.nonreg.parts.NonregViewsRepository;
import org.eclipse.emf.eef.nonreg.parts.forms.AccessPropertiesEditionPartForm;
import org.eclipse.emf.eef.nonreg.parts.forms.AccreditationsPropertiesEditionPartForm;
import org.eclipse.emf.eef.nonreg.parts.forms.AdressPropertiesEditionPartForm;
import org.eclipse.emf.eef.nonreg.parts.forms.AdvancedEObjectFlatComboViewerPropertiesEditionPartForm;
import org.eclipse.emf.eef.nonreg.parts.forms.AdvancedReferencesTablePropertiesEditionPartForm;
import org.eclipse.emf.eef.nonreg.parts.forms.AdvancedTableCompositionPropertiesEditionPartForm;
import org.eclipse.emf.eef.nonreg.parts.forms.CheckboxPropertiesEditionPartForm;
import org.eclipse.emf.eef.nonreg.parts.forms.ComboPropertiesEditionPartForm;
import org.eclipse.emf.eef.nonreg.parts.forms.CompanyPropertiesEditionPartForm;
import org.eclipse.emf.eef.nonreg.parts.forms.EMFComboViewerPropertiesEditionPartForm;
import org.eclipse.emf.eef.nonreg.parts.forms.EObjectFlatComboViewerPropertiesEditionPartForm;
import org.eclipse.emf.eef.nonreg.parts.forms.EclipseSummitPropertiesEditionPartForm;
import org.eclipse.emf.eef.nonreg.parts.forms.MultiValuedEditorPropertiesEditionPartForm;
import org.eclipse.emf.eef.nonreg.parts.forms.PersonPropertiesEditionPartForm;
import org.eclipse.emf.eef.nonreg.parts.forms.PresencePropertiesEditionPartForm;
import org.eclipse.emf.eef.nonreg.parts.forms.RadioPropertiesEditionPartForm;
import org.eclipse.emf.eef.nonreg.parts.forms.ReferencesTablePropertiesEditionPartForm;
import org.eclipse.emf.eef.nonreg.parts.forms.SitePropertiesEditionPartForm;
import org.eclipse.emf.eef.nonreg.parts.forms.SourcePropertiesEditionPartForm;
import org.eclipse.emf.eef.nonreg.parts.forms.SuperCiblePropertiesEditionPartForm;
import org.eclipse.emf.eef.nonreg.parts.forms.TableCompositionPropertiesEditionPartForm;
import org.eclipse.emf.eef.nonreg.parts.forms.TalkPropertiesEditionPartForm;
import org.eclipse.emf.eef.nonreg.parts.forms.TestFilterPropertiesEditionPartForm;
import org.eclipse.emf.eef.nonreg.parts.forms.TestVRFilterPropertiesEditionPartForm;
import org.eclipse.emf.eef.nonreg.parts.forms.TextAreaPropertiesEditionPartForm;
import org.eclipse.emf.eef.nonreg.parts.forms.TextPropertiesEditionPartForm;
import org.eclipse.emf.eef.nonreg.parts.forms.TopicPropertiesEditionPartForm;
import org.eclipse.emf.eef.nonreg.parts.impl.AccessPropertiesEditionPartImpl;
import org.eclipse.emf.eef.nonreg.parts.impl.AccreditationsPropertiesEditionPartImpl;
import org.eclipse.emf.eef.nonreg.parts.impl.AdressPropertiesEditionPartImpl;
import org.eclipse.emf.eef.nonreg.parts.impl.AdvancedEObjectFlatComboViewerPropertiesEditionPartImpl;
import org.eclipse.emf.eef.nonreg.parts.impl.AdvancedReferencesTablePropertiesEditionPartImpl;
import org.eclipse.emf.eef.nonreg.parts.impl.AdvancedTableCompositionPropertiesEditionPartImpl;
import org.eclipse.emf.eef.nonreg.parts.impl.CheckboxPropertiesEditionPartImpl;
import org.eclipse.emf.eef.nonreg.parts.impl.ComboPropertiesEditionPartImpl;
import org.eclipse.emf.eef.nonreg.parts.impl.CompanyPropertiesEditionPartImpl;
import org.eclipse.emf.eef.nonreg.parts.impl.EMFComboViewerPropertiesEditionPartImpl;
import org.eclipse.emf.eef.nonreg.parts.impl.EObjectFlatComboViewerPropertiesEditionPartImpl;
import org.eclipse.emf.eef.nonreg.parts.impl.EclipseSummitPropertiesEditionPartImpl;
import org.eclipse.emf.eef.nonreg.parts.impl.MultiValuedEditorPropertiesEditionPartImpl;
import org.eclipse.emf.eef.nonreg.parts.impl.PersonPropertiesEditionPartImpl;
import org.eclipse.emf.eef.nonreg.parts.impl.PresencePropertiesEditionPartImpl;
import org.eclipse.emf.eef.nonreg.parts.impl.RadioPropertiesEditionPartImpl;
import org.eclipse.emf.eef.nonreg.parts.impl.ReferencesTablePropertiesEditionPartImpl;
import org.eclipse.emf.eef.nonreg.parts.impl.SitePropertiesEditionPartImpl;
import org.eclipse.emf.eef.nonreg.parts.impl.SourcePropertiesEditionPartImpl;
import org.eclipse.emf.eef.nonreg.parts.impl.SuperCiblePropertiesEditionPartImpl;
import org.eclipse.emf.eef.nonreg.parts.impl.TableCompositionPropertiesEditionPartImpl;
import org.eclipse.emf.eef.nonreg.parts.impl.TalkPropertiesEditionPartImpl;
import org.eclipse.emf.eef.nonreg.parts.impl.TestFilterPropertiesEditionPartImpl;
import org.eclipse.emf.eef.nonreg.parts.impl.TestVRFilterPropertiesEditionPartImpl;
import org.eclipse.emf.eef.nonreg.parts.impl.TextAreaPropertiesEditionPartImpl;
import org.eclipse.emf.eef.nonreg.parts.impl.TextPropertiesEditionPartImpl;
import org.eclipse.emf.eef.nonreg.parts.impl.TopicPropertiesEditionPartImpl;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;

/**
 * 
 * @generated
 */
public class NonregPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Class)
	 * @generated
	 */
	public boolean provides(java.lang.Class key) {
    return key == NonregViewsRepository.class;
  }

	
	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Class, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * @generated
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(java.lang.Class key, int kind, IPropertiesEditionComponent component) {
    if (key == NonregViewsRepository.EclipseSummit.class) {
      if (kind == NonregViewsRepository.SWT_KIND)
        return new EclipseSummitPropertiesEditionPartImpl(component);
      if (kind == NonregViewsRepository.FORM_KIND)
        return new EclipseSummitPropertiesEditionPartForm(component);
    }
    if (key == NonregViewsRepository.Person.class) {
      if (kind == NonregViewsRepository.SWT_KIND)
        return new PersonPropertiesEditionPartImpl(component);
      if (kind == NonregViewsRepository.FORM_KIND)
        return new PersonPropertiesEditionPartForm(component);
    }
    if (key == NonregViewsRepository.Company.class) {
      if (kind == NonregViewsRepository.SWT_KIND)
        return new CompanyPropertiesEditionPartImpl(component);
      if (kind == NonregViewsRepository.FORM_KIND)
        return new CompanyPropertiesEditionPartForm(component);
    }
    if (key == NonregViewsRepository.Talk.class) {
      if (kind == NonregViewsRepository.SWT_KIND)
        return new TalkPropertiesEditionPartImpl(component);
      if (kind == NonregViewsRepository.FORM_KIND)
        return new TalkPropertiesEditionPartForm(component);
    }
    if (key == NonregViewsRepository.Topic.class) {
      if (kind == NonregViewsRepository.SWT_KIND)
        return new TopicPropertiesEditionPartImpl(component);
      if (kind == NonregViewsRepository.FORM_KIND)
        return new TopicPropertiesEditionPartForm(component);
    }
    if (key == NonregViewsRepository.Presence.class) {
      if (kind == NonregViewsRepository.SWT_KIND)
        return new PresencePropertiesEditionPartImpl(component);
      if (kind == NonregViewsRepository.FORM_KIND)
        return new PresencePropertiesEditionPartForm(component);
    }
    if (key == NonregViewsRepository.Site.class) {
      if (kind == NonregViewsRepository.SWT_KIND)
        return new SitePropertiesEditionPartImpl(component);
      if (kind == NonregViewsRepository.FORM_KIND)
        return new SitePropertiesEditionPartForm(component);
    }
    if (key == NonregViewsRepository.Access.class) {
      if (kind == NonregViewsRepository.SWT_KIND)
        return new AccessPropertiesEditionPartImpl(component);
      if (kind == NonregViewsRepository.FORM_KIND)
        return new AccessPropertiesEditionPartForm(component);
    }
    if (key == NonregViewsRepository.Adress.class) {
      if (kind == NonregViewsRepository.SWT_KIND)
        return new AdressPropertiesEditionPartImpl(component);
      if (kind == NonregViewsRepository.FORM_KIND)
        return new AdressPropertiesEditionPartForm(component);
    }
    if (key == NonregViewsRepository.Accreditations.class) {
      if (kind == NonregViewsRepository.SWT_KIND)
        return new AccreditationsPropertiesEditionPartImpl(component);
      if (kind == NonregViewsRepository.FORM_KIND)
        return new AccreditationsPropertiesEditionPartForm(component);
    }
    if (key == NonregViewsRepository.TestFilter.class) {
      if (kind == NonregViewsRepository.SWT_KIND)
        return new TestFilterPropertiesEditionPartImpl(component);
      if (kind == NonregViewsRepository.FORM_KIND)
        return new TestFilterPropertiesEditionPartForm(component);
    }
    if (key == NonregViewsRepository.TestVRFilter.class) {
      if (kind == NonregViewsRepository.SWT_KIND)
        return new TestVRFilterPropertiesEditionPartImpl(component);
      if (kind == NonregViewsRepository.FORM_KIND)
        return new TestVRFilterPropertiesEditionPartForm(component);
    }
    if (key == NonregViewsRepository.Source.class) {
      if (kind == NonregViewsRepository.SWT_KIND)
        return new SourcePropertiesEditionPartImpl(component);
      if (kind == NonregViewsRepository.FORM_KIND)
        return new SourcePropertiesEditionPartForm(component);
    }
    if (key == NonregViewsRepository.SuperCible.class) {
      if (kind == NonregViewsRepository.SWT_KIND)
        return new SuperCiblePropertiesEditionPartImpl(component);
      if (kind == NonregViewsRepository.FORM_KIND)
        return new SuperCiblePropertiesEditionPartForm(component);
    }
    if (key == NonregViewsRepository.Text.class) {
      if (kind == NonregViewsRepository.SWT_KIND)
        return new TextPropertiesEditionPartImpl(component);
      if (kind == NonregViewsRepository.FORM_KIND)
        return new TextPropertiesEditionPartForm(component);
    }
    if (key == NonregViewsRepository.TextArea.class) {
      if (kind == NonregViewsRepository.SWT_KIND)
        return new TextAreaPropertiesEditionPartImpl(component);
      if (kind == NonregViewsRepository.FORM_KIND)
        return new TextAreaPropertiesEditionPartForm(component);
    }
    if (key == NonregViewsRepository.Checkbox.class) {
      if (kind == NonregViewsRepository.SWT_KIND)
        return new CheckboxPropertiesEditionPartImpl(component);
      if (kind == NonregViewsRepository.FORM_KIND)
        return new CheckboxPropertiesEditionPartForm(component);
    }
    if (key == NonregViewsRepository.Radio.class) {
      if (kind == NonregViewsRepository.SWT_KIND)
        return new RadioPropertiesEditionPartImpl(component);
      if (kind == NonregViewsRepository.FORM_KIND)
        return new RadioPropertiesEditionPartForm(component);
    }
    if (key == NonregViewsRepository.Combo.class) {
      if (kind == NonregViewsRepository.SWT_KIND)
        return new ComboPropertiesEditionPartImpl(component);
      if (kind == NonregViewsRepository.FORM_KIND)
        return new ComboPropertiesEditionPartForm(component);
    }
    if (key == NonregViewsRepository.EObjectFlatComboViewer.class) {
      if (kind == NonregViewsRepository.SWT_KIND)
        return new EObjectFlatComboViewerPropertiesEditionPartImpl(component);
      if (kind == NonregViewsRepository.FORM_KIND)
        return new EObjectFlatComboViewerPropertiesEditionPartForm(component);
    }
    if (key == NonregViewsRepository.ReferencesTable.class) {
      if (kind == NonregViewsRepository.SWT_KIND)
        return new ReferencesTablePropertiesEditionPartImpl(component);
      if (kind == NonregViewsRepository.FORM_KIND)
        return new ReferencesTablePropertiesEditionPartForm(component);
    }
    if (key == NonregViewsRepository.EMFComboViewer.class) {
      if (kind == NonregViewsRepository.SWT_KIND)
        return new EMFComboViewerPropertiesEditionPartImpl(component);
      if (kind == NonregViewsRepository.FORM_KIND)
        return new EMFComboViewerPropertiesEditionPartForm(component);
    }
    if (key == NonregViewsRepository.MultiValuedEditor.class) {
      if (kind == NonregViewsRepository.SWT_KIND)
        return new MultiValuedEditorPropertiesEditionPartImpl(component);
      if (kind == NonregViewsRepository.FORM_KIND)
        return new MultiValuedEditorPropertiesEditionPartForm(component);
    }
    if (key == NonregViewsRepository.TableComposition.class) {
      if (kind == NonregViewsRepository.SWT_KIND)
        return new TableCompositionPropertiesEditionPartImpl(component);
      if (kind == NonregViewsRepository.FORM_KIND)
        return new TableCompositionPropertiesEditionPartForm(component);
    }
    if (key == NonregViewsRepository.AdvancedTableComposition.class) {
      if (kind == NonregViewsRepository.SWT_KIND)
        return new AdvancedTableCompositionPropertiesEditionPartImpl(component);
      if (kind == NonregViewsRepository.FORM_KIND)
        return new AdvancedTableCompositionPropertiesEditionPartForm(component);
    }
    if (key == NonregViewsRepository.AdvancedReferencesTable.class) {
      if (kind == NonregViewsRepository.SWT_KIND)
        return new AdvancedReferencesTablePropertiesEditionPartImpl(component);
      if (kind == NonregViewsRepository.FORM_KIND)
        return new AdvancedReferencesTablePropertiesEditionPartForm(component);
    }
    if (key == NonregViewsRepository.AdvancedEObjectFlatComboViewer.class) {
      if (kind == NonregViewsRepository.SWT_KIND)
        return new AdvancedEObjectFlatComboViewerPropertiesEditionPartImpl(component);
      if (kind == NonregViewsRepository.FORM_KIND)
        return new AdvancedEObjectFlatComboViewerPropertiesEditionPartForm(component);
    }
    return null;
  }

}
