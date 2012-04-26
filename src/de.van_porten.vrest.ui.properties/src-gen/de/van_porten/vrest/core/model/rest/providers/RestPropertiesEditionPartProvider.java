/**
 * Generated with Acceleo
 */
package de.van_porten.vrest.core.model.rest.providers;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;

import de.van_porten.vrest.core.model.rest.parts.RestViewsRepository;
import de.van_porten.vrest.core.model.rest.parts.forms.RestApplicationModelPropertiesEditionPartForm;
import de.van_porten.vrest.core.model.rest.parts.impl.RestApplicationModelPropertiesEditionPartImpl;




/**
 * @author Oliver van Porten
 * 
 */
public class RestPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == RestViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == RestViewsRepository.RestApplicationModel.class) {
			if (kind == RestViewsRepository.SWT_KIND)
				return new RestApplicationModelPropertiesEditionPartImpl(component);
			if (kind == RestViewsRepository.FORM_KIND)
				return new RestApplicationModelPropertiesEditionPartForm(component);
		}
		return null;
	}

}
