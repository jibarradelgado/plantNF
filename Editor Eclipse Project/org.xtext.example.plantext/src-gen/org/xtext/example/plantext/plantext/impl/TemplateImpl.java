/**
 */
package org.xtext.example.plantext.plantext.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.plantext.plantext.Branchpoint;
import org.xtext.example.plantext.plantext.Declaration;
import org.xtext.example.plantext.plantext.Parameter;
import org.xtext.example.plantext.plantext.PlantextPackage;
import org.xtext.example.plantext.plantext.State;
import org.xtext.example.plantext.plantext.Template;
import org.xtext.example.plantext.plantext.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.plantext.plantext.impl.TemplateImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.plantext.plantext.impl.TemplateImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.xtext.example.plantext.plantext.impl.TemplateImpl#getDeclaration <em>Declaration</em>}</li>
 *   <li>{@link org.xtext.example.plantext.plantext.impl.TemplateImpl#getState <em>State</em>}</li>
 *   <li>{@link org.xtext.example.plantext.plantext.impl.TemplateImpl#getBranchpoint <em>Branchpoint</em>}</li>
 *   <li>{@link org.xtext.example.plantext.plantext.impl.TemplateImpl#getTransition <em>Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemplateImpl extends MinimalEObjectImpl.Container implements Template
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected Parameter parameters;

  /**
   * The cached value of the '{@link #getDeclaration() <em>Declaration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclaration()
   * @generated
   * @ordered
   */
  protected Declaration declaration;

  /**
   * The cached value of the '{@link #getState() <em>State</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getState()
   * @generated
   * @ordered
   */
  protected EList<State> state;

  /**
   * The cached value of the '{@link #getBranchpoint() <em>Branchpoint</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBranchpoint()
   * @generated
   * @ordered
   */
  protected EList<Branchpoint> branchpoint;

  /**
   * The cached value of the '{@link #getTransition() <em>Transition</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransition()
   * @generated
   * @ordered
   */
  protected EList<Transition> transition;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TemplateImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PlantextPackage.Literals.TEMPLATE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlantextPackage.TEMPLATE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter getParameters()
  {
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParameters(Parameter newParameters, NotificationChain msgs)
  {
    Parameter oldParameters = parameters;
    parameters = newParameters;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlantextPackage.TEMPLATE__PARAMETERS, oldParameters, newParameters);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParameters(Parameter newParameters)
  {
    if (newParameters != parameters)
    {
      NotificationChain msgs = null;
      if (parameters != null)
        msgs = ((InternalEObject)parameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlantextPackage.TEMPLATE__PARAMETERS, null, msgs);
      if (newParameters != null)
        msgs = ((InternalEObject)newParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlantextPackage.TEMPLATE__PARAMETERS, null, msgs);
      msgs = basicSetParameters(newParameters, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlantextPackage.TEMPLATE__PARAMETERS, newParameters, newParameters));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Declaration getDeclaration()
  {
    return declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDeclaration(Declaration newDeclaration, NotificationChain msgs)
  {
    Declaration oldDeclaration = declaration;
    declaration = newDeclaration;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlantextPackage.TEMPLATE__DECLARATION, oldDeclaration, newDeclaration);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeclaration(Declaration newDeclaration)
  {
    if (newDeclaration != declaration)
    {
      NotificationChain msgs = null;
      if (declaration != null)
        msgs = ((InternalEObject)declaration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlantextPackage.TEMPLATE__DECLARATION, null, msgs);
      if (newDeclaration != null)
        msgs = ((InternalEObject)newDeclaration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlantextPackage.TEMPLATE__DECLARATION, null, msgs);
      msgs = basicSetDeclaration(newDeclaration, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlantextPackage.TEMPLATE__DECLARATION, newDeclaration, newDeclaration));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<State> getState()
  {
    if (state == null)
    {
      state = new EObjectContainmentEList<State>(State.class, this, PlantextPackage.TEMPLATE__STATE);
    }
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Branchpoint> getBranchpoint()
  {
    if (branchpoint == null)
    {
      branchpoint = new EObjectContainmentEList<Branchpoint>(Branchpoint.class, this, PlantextPackage.TEMPLATE__BRANCHPOINT);
    }
    return branchpoint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Transition> getTransition()
  {
    if (transition == null)
    {
      transition = new EObjectContainmentEList<Transition>(Transition.class, this, PlantextPackage.TEMPLATE__TRANSITION);
    }
    return transition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PlantextPackage.TEMPLATE__PARAMETERS:
        return basicSetParameters(null, msgs);
      case PlantextPackage.TEMPLATE__DECLARATION:
        return basicSetDeclaration(null, msgs);
      case PlantextPackage.TEMPLATE__STATE:
        return ((InternalEList<?>)getState()).basicRemove(otherEnd, msgs);
      case PlantextPackage.TEMPLATE__BRANCHPOINT:
        return ((InternalEList<?>)getBranchpoint()).basicRemove(otherEnd, msgs);
      case PlantextPackage.TEMPLATE__TRANSITION:
        return ((InternalEList<?>)getTransition()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PlantextPackage.TEMPLATE__NAME:
        return getName();
      case PlantextPackage.TEMPLATE__PARAMETERS:
        return getParameters();
      case PlantextPackage.TEMPLATE__DECLARATION:
        return getDeclaration();
      case PlantextPackage.TEMPLATE__STATE:
        return getState();
      case PlantextPackage.TEMPLATE__BRANCHPOINT:
        return getBranchpoint();
      case PlantextPackage.TEMPLATE__TRANSITION:
        return getTransition();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PlantextPackage.TEMPLATE__NAME:
        setName((String)newValue);
        return;
      case PlantextPackage.TEMPLATE__PARAMETERS:
        setParameters((Parameter)newValue);
        return;
      case PlantextPackage.TEMPLATE__DECLARATION:
        setDeclaration((Declaration)newValue);
        return;
      case PlantextPackage.TEMPLATE__STATE:
        getState().clear();
        getState().addAll((Collection<? extends State>)newValue);
        return;
      case PlantextPackage.TEMPLATE__BRANCHPOINT:
        getBranchpoint().clear();
        getBranchpoint().addAll((Collection<? extends Branchpoint>)newValue);
        return;
      case PlantextPackage.TEMPLATE__TRANSITION:
        getTransition().clear();
        getTransition().addAll((Collection<? extends Transition>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PlantextPackage.TEMPLATE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PlantextPackage.TEMPLATE__PARAMETERS:
        setParameters((Parameter)null);
        return;
      case PlantextPackage.TEMPLATE__DECLARATION:
        setDeclaration((Declaration)null);
        return;
      case PlantextPackage.TEMPLATE__STATE:
        getState().clear();
        return;
      case PlantextPackage.TEMPLATE__BRANCHPOINT:
        getBranchpoint().clear();
        return;
      case PlantextPackage.TEMPLATE__TRANSITION:
        getTransition().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PlantextPackage.TEMPLATE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PlantextPackage.TEMPLATE__PARAMETERS:
        return parameters != null;
      case PlantextPackage.TEMPLATE__DECLARATION:
        return declaration != null;
      case PlantextPackage.TEMPLATE__STATE:
        return state != null && !state.isEmpty();
      case PlantextPackage.TEMPLATE__BRANCHPOINT:
        return branchpoint != null && !branchpoint.isEmpty();
      case PlantextPackage.TEMPLATE__TRANSITION:
        return transition != null && !transition.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //TemplateImpl
