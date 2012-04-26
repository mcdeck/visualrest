package de.van_porten.vrest.ui.diagram.state.state;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import de.van_porten.vrest.core.model.rest.RestApplicationModel;
import de.van_porten.vrest.core.model.restbehavior.State;
import de.van_porten.vrest.core.model.reststructure.Method;
import de.van_porten.vrest.core.model.reststructure.MethodType;

public final class StateUtil {

	public static List<String> createMethodLabelValuesForState( State state, RestApplicationModel application ) {
		List<String> methodLabels = new ArrayList<String>();

		EList<MethodType> methodTypes = application.getMethodTypes();
		for (MethodType methodType : methodTypes) {
			String text = null;
			for( Method method : state.getSupportedMethods() ) {
				if( method.getMethodtype().equals( methodType ) ) {
					text = methodType.getName() + " : " + method.getName();
					break;
				}
			}

			if( text == null ) {
				text = methodType.getName() + " : -";
			}
			methodLabels.add(text);
		}

		return methodLabels;
	}

}
