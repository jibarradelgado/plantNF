/**
 */
package org.xtext.example.plantext.plantext;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.plantext.plantext.Document#getDeclaration <em>Declaration</em>}</li>
 *   <li>{@link org.xtext.example.plantext.plantext.Document#getTemplate <em>Template</em>}</li>
 *   <li>{@link org.xtext.example.plantext.plantext.Document#getSystem <em>System</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.plantext.plantext.PlantextPackage#getDocument()
 * @model
 * @generated
 */
public interface Document extends EObject
{
  /**
   * Returns the value of the '<em><b>Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declaration</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declaration</em>' containment reference.
   * @see #setDeclaration(Declaration)
   * @see org.xtext.example.plantext.plantext.PlantextPackage#getDocument_Declaration()
   * @model containment="true"
   * @generated
   */
  Declaration getDeclaration();

  /**
   * Sets the value of the '{@link org.xtext.example.plantext.plantext.Document#getDeclaration <em>Declaration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Declaration</em>' containment reference.
   * @see #getDeclaration()
   * @generated
   */
  void setDeclaration(Declaration value);

  /**
   * Returns the value of the '<em><b>Template</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.plantext.plantext.Template}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Template</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Template</em>' containment reference list.
   * @see org.xtext.example.plantext.plantext.PlantextPackage#getDocument_Template()
   * @model containment="true"
   * @generated
   */
  EList<Template> getTemplate();

  /**
   * Returns the value of the '<em><b>System</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>System</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>System</em>' containment reference.
   * @see #setSystem(org.xtext.example.plantext.plantext.System)
   * @see org.xtext.example.plantext.plantext.PlantextPackage#getDocument_System()
   * @model containment="true"
   * @generated
   */
  org.xtext.example.plantext.plantext.System getSystem();

  /**
   * Sets the value of the '{@link org.xtext.example.plantext.plantext.Document#getSystem <em>System</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>System</em>' containment reference.
   * @see #getSystem()
   * @generated
   */
  void setSystem(org.xtext.example.plantext.plantext.System value);

} // Document
