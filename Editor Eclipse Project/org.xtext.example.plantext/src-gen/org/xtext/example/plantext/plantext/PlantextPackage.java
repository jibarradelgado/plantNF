/**
 */
package org.xtext.example.plantext.plantext;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.plantext.plantext.PlantextFactory
 * @model kind="package"
 * @generated
 */
public interface PlantextPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "plantext";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/plantext/PlantExt";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "plantext";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PlantextPackage eINSTANCE = org.xtext.example.plantext.plantext.impl.PlantextPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.plantext.plantext.impl.DocumentImpl <em>Document</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.plantext.plantext.impl.DocumentImpl
   * @see org.xtext.example.plantext.plantext.impl.PlantextPackageImpl#getDocument()
   * @generated
   */
  int DOCUMENT = 0;

  /**
   * The feature id for the '<em><b>Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT__DECLARATION = 0;

  /**
   * The feature id for the '<em><b>Template</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT__TEMPLATE = 1;

  /**
   * The feature id for the '<em><b>System</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT__SYSTEM = 2;

  /**
   * The number of structural features of the '<em>Document</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.plantext.plantext.impl.DeclarationImpl <em>Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.plantext.plantext.impl.DeclarationImpl
   * @see org.xtext.example.plantext.plantext.impl.PlantextPackageImpl#getDeclaration()
   * @generated
   */
  int DECLARATION = 1;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__TEXT = 0;

  /**
   * The number of structural features of the '<em>Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.plantext.plantext.impl.TemplateImpl <em>Template</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.plantext.plantext.impl.TemplateImpl
   * @see org.xtext.example.plantext.plantext.impl.PlantextPackageImpl#getTemplate()
   * @generated
   */
  int TEMPLATE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE__NAME = 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE__PARAMETERS = 1;

  /**
   * The feature id for the '<em><b>Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE__DECLARATION = 2;

  /**
   * The feature id for the '<em><b>State</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE__STATE = 3;

  /**
   * The feature id for the '<em><b>Branchpoint</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE__BRANCHPOINT = 4;

  /**
   * The feature id for the '<em><b>Transition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE__TRANSITION = 5;

  /**
   * The number of structural features of the '<em>Template</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.xtext.example.plantext.plantext.impl.SystemImpl <em>System</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.plantext.plantext.impl.SystemImpl
   * @see org.xtext.example.plantext.plantext.impl.PlantextPackageImpl#getSystem()
   * @generated
   */
  int SYSTEM = 3;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM__TEXT = 0;

  /**
   * The number of structural features of the '<em>System</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.plantext.plantext.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.plantext.plantext.impl.ParameterImpl
   * @see org.xtext.example.plantext.plantext.impl.PlantextPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 4;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__TEXT = 0;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.plantext.plantext.impl.StateImpl <em>State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.plantext.plantext.impl.StateImpl
   * @see org.xtext.example.plantext.plantext.impl.PlantextPackageImpl#getState()
   * @generated
   */
  int STATE = 5;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__ID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__NAME = 1;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__TEXT = 2;

  /**
   * The feature id for the '<em><b>Exponential Rate</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__EXPONENTIAL_RATE = 3;

  /**
   * The number of structural features of the '<em>State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.plantext.plantext.impl.BranchpointImpl <em>Branchpoint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.plantext.plantext.impl.BranchpointImpl
   * @see org.xtext.example.plantext.plantext.impl.PlantextPackageImpl#getBranchpoint()
   * @generated
   */
  int BRANCHPOINT = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRANCHPOINT__NAME = 0;

  /**
   * The number of structural features of the '<em>Branchpoint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRANCHPOINT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.plantext.plantext.impl.TransitionImpl <em>Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.plantext.plantext.impl.TransitionImpl
   * @see org.xtext.example.plantext.plantext.impl.PlantextPackageImpl#getTransition()
   * @generated
   */
  int TRANSITION = 7;

  /**
   * The feature id for the '<em><b>Out Bound State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__OUT_BOUND_STATE = 0;

  /**
   * The feature id for the '<em><b>Inbound State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__INBOUND_STATE = 1;

  /**
   * The feature id for the '<em><b>Select</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__SELECT = 2;

  /**
   * The feature id for the '<em><b>Guard</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__GUARD = 3;

  /**
   * The feature id for the '<em><b>Sync</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__SYNC = 4;

  /**
   * The feature id for the '<em><b>Assign</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__ASSIGN = 5;

  /**
   * The feature id for the '<em><b>Probability</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__PROBABILITY = 6;

  /**
   * The feature id for the '<em><b>Comments</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__COMMENTS = 7;

  /**
   * The number of structural features of the '<em>Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_FEATURE_COUNT = 8;


  /**
   * Returns the meta object for class '{@link org.xtext.example.plantext.plantext.Document <em>Document</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Document</em>'.
   * @see org.xtext.example.plantext.plantext.Document
   * @generated
   */
  EClass getDocument();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.plantext.plantext.Document#getDeclaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Declaration</em>'.
   * @see org.xtext.example.plantext.plantext.Document#getDeclaration()
   * @see #getDocument()
   * @generated
   */
  EReference getDocument_Declaration();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.plantext.plantext.Document#getTemplate <em>Template</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Template</em>'.
   * @see org.xtext.example.plantext.plantext.Document#getTemplate()
   * @see #getDocument()
   * @generated
   */
  EReference getDocument_Template();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.plantext.plantext.Document#getSystem <em>System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>System</em>'.
   * @see org.xtext.example.plantext.plantext.Document#getSystem()
   * @see #getDocument()
   * @generated
   */
  EReference getDocument_System();

  /**
   * Returns the meta object for class '{@link org.xtext.example.plantext.plantext.Declaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Declaration</em>'.
   * @see org.xtext.example.plantext.plantext.Declaration
   * @generated
   */
  EClass getDeclaration();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.plantext.plantext.Declaration#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Text</em>'.
   * @see org.xtext.example.plantext.plantext.Declaration#getText()
   * @see #getDeclaration()
   * @generated
   */
  EAttribute getDeclaration_Text();

  /**
   * Returns the meta object for class '{@link org.xtext.example.plantext.plantext.Template <em>Template</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Template</em>'.
   * @see org.xtext.example.plantext.plantext.Template
   * @generated
   */
  EClass getTemplate();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.plantext.plantext.Template#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.plantext.plantext.Template#getName()
   * @see #getTemplate()
   * @generated
   */
  EAttribute getTemplate_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.plantext.plantext.Template#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameters</em>'.
   * @see org.xtext.example.plantext.plantext.Template#getParameters()
   * @see #getTemplate()
   * @generated
   */
  EReference getTemplate_Parameters();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.plantext.plantext.Template#getDeclaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Declaration</em>'.
   * @see org.xtext.example.plantext.plantext.Template#getDeclaration()
   * @see #getTemplate()
   * @generated
   */
  EReference getTemplate_Declaration();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.plantext.plantext.Template#getState <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>State</em>'.
   * @see org.xtext.example.plantext.plantext.Template#getState()
   * @see #getTemplate()
   * @generated
   */
  EReference getTemplate_State();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.plantext.plantext.Template#getBranchpoint <em>Branchpoint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Branchpoint</em>'.
   * @see org.xtext.example.plantext.plantext.Template#getBranchpoint()
   * @see #getTemplate()
   * @generated
   */
  EReference getTemplate_Branchpoint();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.plantext.plantext.Template#getTransition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Transition</em>'.
   * @see org.xtext.example.plantext.plantext.Template#getTransition()
   * @see #getTemplate()
   * @generated
   */
  EReference getTemplate_Transition();

  /**
   * Returns the meta object for class '{@link org.xtext.example.plantext.plantext.System <em>System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>System</em>'.
   * @see org.xtext.example.plantext.plantext.System
   * @generated
   */
  EClass getSystem();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.plantext.plantext.System#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Text</em>'.
   * @see org.xtext.example.plantext.plantext.System#getText()
   * @see #getSystem()
   * @generated
   */
  EAttribute getSystem_Text();

  /**
   * Returns the meta object for class '{@link org.xtext.example.plantext.plantext.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see org.xtext.example.plantext.plantext.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.plantext.plantext.Parameter#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Text</em>'.
   * @see org.xtext.example.plantext.plantext.Parameter#getText()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Text();

  /**
   * Returns the meta object for class '{@link org.xtext.example.plantext.plantext.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State</em>'.
   * @see org.xtext.example.plantext.plantext.State
   * @generated
   */
  EClass getState();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.plantext.plantext.State#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.xtext.example.plantext.plantext.State#getId()
   * @see #getState()
   * @generated
   */
  EAttribute getState_Id();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.plantext.plantext.State#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.plantext.plantext.State#getName()
   * @see #getState()
   * @generated
   */
  EAttribute getState_Name();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.plantext.plantext.State#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Text</em>'.
   * @see org.xtext.example.plantext.plantext.State#getText()
   * @see #getState()
   * @generated
   */
  EAttribute getState_Text();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.plantext.plantext.State#getExponentialRate <em>Exponential Rate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Exponential Rate</em>'.
   * @see org.xtext.example.plantext.plantext.State#getExponentialRate()
   * @see #getState()
   * @generated
   */
  EAttribute getState_ExponentialRate();

  /**
   * Returns the meta object for class '{@link org.xtext.example.plantext.plantext.Branchpoint <em>Branchpoint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Branchpoint</em>'.
   * @see org.xtext.example.plantext.plantext.Branchpoint
   * @generated
   */
  EClass getBranchpoint();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.plantext.plantext.Branchpoint#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.plantext.plantext.Branchpoint#getName()
   * @see #getBranchpoint()
   * @generated
   */
  EAttribute getBranchpoint_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.plantext.plantext.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition</em>'.
   * @see org.xtext.example.plantext.plantext.Transition
   * @generated
   */
  EClass getTransition();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.plantext.plantext.Transition#getOutBoundState <em>Out Bound State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Out Bound State</em>'.
   * @see org.xtext.example.plantext.plantext.Transition#getOutBoundState()
   * @see #getTransition()
   * @generated
   */
  EAttribute getTransition_OutBoundState();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.plantext.plantext.Transition#getInboundState <em>Inbound State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Inbound State</em>'.
   * @see org.xtext.example.plantext.plantext.Transition#getInboundState()
   * @see #getTransition()
   * @generated
   */
  EAttribute getTransition_InboundState();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.plantext.plantext.Transition#getSelect <em>Select</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Select</em>'.
   * @see org.xtext.example.plantext.plantext.Transition#getSelect()
   * @see #getTransition()
   * @generated
   */
  EAttribute getTransition_Select();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.plantext.plantext.Transition#getGuard <em>Guard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Guard</em>'.
   * @see org.xtext.example.plantext.plantext.Transition#getGuard()
   * @see #getTransition()
   * @generated
   */
  EAttribute getTransition_Guard();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.plantext.plantext.Transition#getSync <em>Sync</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Sync</em>'.
   * @see org.xtext.example.plantext.plantext.Transition#getSync()
   * @see #getTransition()
   * @generated
   */
  EAttribute getTransition_Sync();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.plantext.plantext.Transition#getAssign <em>Assign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Assign</em>'.
   * @see org.xtext.example.plantext.plantext.Transition#getAssign()
   * @see #getTransition()
   * @generated
   */
  EAttribute getTransition_Assign();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.plantext.plantext.Transition#getProbability <em>Probability</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Probability</em>'.
   * @see org.xtext.example.plantext.plantext.Transition#getProbability()
   * @see #getTransition()
   * @generated
   */
  EAttribute getTransition_Probability();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.plantext.plantext.Transition#getComments <em>Comments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Comments</em>'.
   * @see org.xtext.example.plantext.plantext.Transition#getComments()
   * @see #getTransition()
   * @generated
   */
  EAttribute getTransition_Comments();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  PlantextFactory getPlantextFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.plantext.plantext.impl.DocumentImpl <em>Document</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.plantext.plantext.impl.DocumentImpl
     * @see org.xtext.example.plantext.plantext.impl.PlantextPackageImpl#getDocument()
     * @generated
     */
    EClass DOCUMENT = eINSTANCE.getDocument();

    /**
     * The meta object literal for the '<em><b>Declaration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT__DECLARATION = eINSTANCE.getDocument_Declaration();

    /**
     * The meta object literal for the '<em><b>Template</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT__TEMPLATE = eINSTANCE.getDocument_Template();

    /**
     * The meta object literal for the '<em><b>System</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT__SYSTEM = eINSTANCE.getDocument_System();

    /**
     * The meta object literal for the '{@link org.xtext.example.plantext.plantext.impl.DeclarationImpl <em>Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.plantext.plantext.impl.DeclarationImpl
     * @see org.xtext.example.plantext.plantext.impl.PlantextPackageImpl#getDeclaration()
     * @generated
     */
    EClass DECLARATION = eINSTANCE.getDeclaration();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECLARATION__TEXT = eINSTANCE.getDeclaration_Text();

    /**
     * The meta object literal for the '{@link org.xtext.example.plantext.plantext.impl.TemplateImpl <em>Template</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.plantext.plantext.impl.TemplateImpl
     * @see org.xtext.example.plantext.plantext.impl.PlantextPackageImpl#getTemplate()
     * @generated
     */
    EClass TEMPLATE = eINSTANCE.getTemplate();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEMPLATE__NAME = eINSTANCE.getTemplate_Name();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPLATE__PARAMETERS = eINSTANCE.getTemplate_Parameters();

    /**
     * The meta object literal for the '<em><b>Declaration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPLATE__DECLARATION = eINSTANCE.getTemplate_Declaration();

    /**
     * The meta object literal for the '<em><b>State</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPLATE__STATE = eINSTANCE.getTemplate_State();

    /**
     * The meta object literal for the '<em><b>Branchpoint</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPLATE__BRANCHPOINT = eINSTANCE.getTemplate_Branchpoint();

    /**
     * The meta object literal for the '<em><b>Transition</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPLATE__TRANSITION = eINSTANCE.getTemplate_Transition();

    /**
     * The meta object literal for the '{@link org.xtext.example.plantext.plantext.impl.SystemImpl <em>System</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.plantext.plantext.impl.SystemImpl
     * @see org.xtext.example.plantext.plantext.impl.PlantextPackageImpl#getSystem()
     * @generated
     */
    EClass SYSTEM = eINSTANCE.getSystem();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYSTEM__TEXT = eINSTANCE.getSystem_Text();

    /**
     * The meta object literal for the '{@link org.xtext.example.plantext.plantext.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.plantext.plantext.impl.ParameterImpl
     * @see org.xtext.example.plantext.plantext.impl.PlantextPackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__TEXT = eINSTANCE.getParameter_Text();

    /**
     * The meta object literal for the '{@link org.xtext.example.plantext.plantext.impl.StateImpl <em>State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.plantext.plantext.impl.StateImpl
     * @see org.xtext.example.plantext.plantext.impl.PlantextPackageImpl#getState()
     * @generated
     */
    EClass STATE = eINSTANCE.getState();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__ID = eINSTANCE.getState_Id();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__NAME = eINSTANCE.getState_Name();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__TEXT = eINSTANCE.getState_Text();

    /**
     * The meta object literal for the '<em><b>Exponential Rate</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__EXPONENTIAL_RATE = eINSTANCE.getState_ExponentialRate();

    /**
     * The meta object literal for the '{@link org.xtext.example.plantext.plantext.impl.BranchpointImpl <em>Branchpoint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.plantext.plantext.impl.BranchpointImpl
     * @see org.xtext.example.plantext.plantext.impl.PlantextPackageImpl#getBranchpoint()
     * @generated
     */
    EClass BRANCHPOINT = eINSTANCE.getBranchpoint();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BRANCHPOINT__NAME = eINSTANCE.getBranchpoint_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.plantext.plantext.impl.TransitionImpl <em>Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.plantext.plantext.impl.TransitionImpl
     * @see org.xtext.example.plantext.plantext.impl.PlantextPackageImpl#getTransition()
     * @generated
     */
    EClass TRANSITION = eINSTANCE.getTransition();

    /**
     * The meta object literal for the '<em><b>Out Bound State</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION__OUT_BOUND_STATE = eINSTANCE.getTransition_OutBoundState();

    /**
     * The meta object literal for the '<em><b>Inbound State</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION__INBOUND_STATE = eINSTANCE.getTransition_InboundState();

    /**
     * The meta object literal for the '<em><b>Select</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION__SELECT = eINSTANCE.getTransition_Select();

    /**
     * The meta object literal for the '<em><b>Guard</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION__GUARD = eINSTANCE.getTransition_Guard();

    /**
     * The meta object literal for the '<em><b>Sync</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION__SYNC = eINSTANCE.getTransition_Sync();

    /**
     * The meta object literal for the '<em><b>Assign</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION__ASSIGN = eINSTANCE.getTransition_Assign();

    /**
     * The meta object literal for the '<em><b>Probability</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION__PROBABILITY = eINSTANCE.getTransition_Probability();

    /**
     * The meta object literal for the '<em><b>Comments</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION__COMMENTS = eINSTANCE.getTransition_Comments();

  }

} //PlantextPackage
