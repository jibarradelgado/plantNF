/**
 */
package org.xtext.example.plantext.plantext;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.plantext.plantext.System#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.plantext.plantext.PlantextPackage#getSystem()
 * @model
 * @generated
 */
public interface System extends EObject
{
  /**
   * Returns the value of the '<em><b>Text</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' attribute list.
   * @see org.xtext.example.plantext.plantext.PlantextPackage#getSystem_Text()
   * @model unique="false"
   * @generated
   */
  EList<String> getText();

} // System
