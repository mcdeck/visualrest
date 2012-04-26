/**
 * Generated with Acceleo
 */
package de.van_porten.vrest.ui.properties.rest.providers;

import org.eclipse.emf.common.notify.Adapter;

import de.van_porten.vrest.core.model.rest.util.RestAdapterFactory;


/**
 * @author Oliver van Porten
 * 
 */
public class RestEEFAdapterFactory extends RestAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see de.van_porten.vrest.core.model.rest.util.RestAdapterFactory#createRestApplicationModelAdapter()
	 * 
	 */
	public Adapter createRestApplicationModelAdapter() {
		return new RestApplicationModelPropertiesEditionProvider();
	}

}
