/**
 */
package org.xtext.example.plantext.plantext;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.plantext.plantext.Transition#getOutBoundState <em>Out Bound State</em>}</li>
 *   <li>{@link org.xtext.example.plantext.plantext.Transition#getInboundState <em>Inbound State</em>}</li>
 *   <li>{@link org.xtext.example.plantext.plantext.Transition#getSelect <em>Select</em>}</li>
 *   <li>{@link org.xtext.example.plantext.plantext.Transition#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.xtext.example.plantext.plantext.Transition#getSync <em>Sync</em>}</li>
 *   <li>{@link org.xtext.example.plantext.plantext.Transition#getAssign <em>Assign</em>}</li>
 *   <li>{@link org.xtext.example.plantext.plantext.Transition#getProbability <em>Probability</em>}</li>
 *   <li>{@link org.xtext.example.plantext.plantext.Transition#getComments <em>Comments</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.plantext.plantext.PlantextPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject
{
  /**
   * Returns the value of the '<em><b>Out Bound State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Out Bound State</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Out Bound State</em>' attribute.
   * @see #setOutBoundState(String)
   * @see org.xtext.example.plantext.plantext.PlantextPackage#getTransition_OutBoundState()
   * @model
   * @generated
   */
  String getOutBoundState();

  /**
   * Sets the value of the '{@link org.xtext.example.plantext.plantext.Transition#getOutBoundState <em>Out Bound State</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Out Bound State</em>' attribute.
   * @see #getOutBoundState()
   * @generated
   */
  void setOutBoundState(String value);

  /**
   * Returns the value of the '<em><b>Inbound State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inbound State</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inbound State</em>' attribute.
   * @see #setInboundState(String)
   * @see org.xtext.example.plantext.plantext.PlantextPackage#getTransition_InboundState()
   * @model
   * @generated
   */
  String getInboundState();

  /**
   * Sets the value of the '{@link org.xtext.example.plantext.plantext.Transition#getInboundState <em>Inbound State</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inbound State</em>' attribute.
   * @see #getInboundState()
   * @generated
   */
  void setInboundState(String value);

  /**
   * Returns the value of the '<em><b>Select</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Select</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Select</em>' attribute list.
   * @see org.xtext.example.plantext.plantext.PlantextPackage#getTransition_Select()
   * @model unique="false"
   * @generated
   */
  EList<String> getSelect();

  /**
   * Returns the value of the '<em><b>Guard</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Guard</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Guard</em>' attribute list.
   * @see org.xtext.example.plantext.plantext.PlantextPackage#getTransition_Guard()
   * @model unique="false"
   * @generated
   */
  EList<String> getGuard();

  /**
   * Returns the value of the '<em><b>Sync</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sync</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sync</em>' attribute list.
   * @see org.xtext.example.plantext.plantext.PlantextPackage#getTransition_Sync()
   * @model unique="false"
   * @generated
   */
  EList<String> getSync();

  /**
   * Returns the value of the '<em><b>Assign</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assign</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assign</em>' attribute list.
   * @see org.xtext.example.plantext.plantext.PlantextPackage#getTransition_Assign()
   * @model unique="false"
   * @generated
   */
  EList<String> getAssign();

  /**
   * Returns the value of the '<em><b>Probability</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Probability</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Probability</em>' attribute list.
   * @see org.xtext.example.plantext.plantext.PlantextPackage#getTransition_Probability()
   * @model unique="false"
   * @generated
   */
  EList<String> getProbability();

  /**
   * Returns the value of the '<em><b>Comments</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Comments</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comments</em>' attribute list.
   * @see org.xtext.example.plantext.plantext.PlantextPackage#getTransition_Comments()
   * @model unique="false"
   * @generated
   */
  EList<String> getComments();

} // Transition
