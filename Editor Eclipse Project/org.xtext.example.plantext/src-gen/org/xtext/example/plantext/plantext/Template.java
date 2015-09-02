/**
 */
package org.xtext.example.plantext.plantext;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.plantext.plantext.Template#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.plantext.plantext.Template#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.xtext.example.plantext.plantext.Template#getDeclaration <em>Declaration</em>}</li>
 *   <li>{@link org.xtext.example.plantext.plantext.Template#getState <em>State</em>}</li>
 *   <li>{@link org.xtext.example.plantext.plantext.Template#getBranchpoint <em>Branchpoint</em>}</li>
 *   <li>{@link org.xtext.example.plantext.plantext.Template#getTransition <em>Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.plantext.plantext.PlantextPackage#getTemplate()
 * @model
 * @generated
 */
public interface Template extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.plantext.plantext.PlantextPackage#getTemplate_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.plantext.plantext.Template#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference.
   * @see #setParameters(Parameter)
   * @see org.xtext.example.plantext.plantext.PlantextPackage#getTemplate_Parameters()
   * @model containment="true"
   * @generated
   */
  Parameter getParameters();

  /**
   * Sets the value of the '{@link org.xtext.example.plantext.plantext.Template#getParameters <em>Parameters</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameters</em>' containment reference.
   * @see #getParameters()
   * @generated
   */
  void setParameters(Parameter value);

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
   * @see org.xtext.example.plantext.plantext.PlantextPackage#getTemplate_Declaration()
   * @model containment="true"
   * @generated
   */
  Declaration getDeclaration();

  /**
   * Sets the value of the '{@link org.xtext.example.plantext.plantext.Template#getDeclaration <em>Declaration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Declaration</em>' containment reference.
   * @see #getDeclaration()
   * @generated
   */
  void setDeclaration(Declaration value);

  /**
   * Returns the value of the '<em><b>State</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.plantext.plantext.State}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>State</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>State</em>' containment reference list.
   * @see org.xtext.example.plantext.plantext.PlantextPackage#getTemplate_State()
   * @model containment="true"
   * @generated
   */
  EList<State> getState();

  /**
   * Returns the value of the '<em><b>Branchpoint</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.plantext.plantext.Branchpoint}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Branchpoint</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Branchpoint</em>' containment reference list.
   * @see org.xtext.example.plantext.plantext.PlantextPackage#getTemplate_Branchpoint()
   * @model containment="true"
   * @generated
   */
  EList<Branchpoint> getBranchpoint();

  /**
   * Returns the value of the '<em><b>Transition</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.plantext.plantext.Transition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transition</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transition</em>' containment reference list.
   * @see org.xtext.example.plantext.plantext.PlantextPackage#getTemplate_Transition()
   * @model containment="true"
   * @generated
   */
  EList<Transition> getTransition();

} // Template
