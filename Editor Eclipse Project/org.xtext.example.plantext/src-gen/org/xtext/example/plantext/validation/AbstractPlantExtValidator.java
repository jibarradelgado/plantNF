/*
 * generated by Xtext
 */
package org.xtext.example.plantext.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractPlantExtValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(org.xtext.example.plantext.plantext.PlantextPackage.eINSTANCE);
		return result;
	}
}
