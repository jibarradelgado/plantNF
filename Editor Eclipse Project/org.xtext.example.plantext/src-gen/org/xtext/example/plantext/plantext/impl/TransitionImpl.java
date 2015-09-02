/**
 */
package org.xtext.example.plantext.plantext.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.xtext.example.plantext.plantext.PlantextPackage;
import org.xtext.example.plantext.plantext.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.plantext.plantext.impl.TransitionImpl#getOutBoundState <em>Out Bound State</em>}</li>
 *   <li>{@link org.xtext.example.plantext.plantext.impl.TransitionImpl#getInboundState <em>Inbound State</em>}</li>
 *   <li>{@link org.xtext.example.plantext.plantext.impl.TransitionImpl#getSelect <em>Select</em>}</li>
 *   <li>{@link org.xtext.example.plantext.plantext.impl.TransitionImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.xtext.example.plantext.plantext.impl.TransitionImpl#getSync <em>Sync</em>}</li>
 *   <li>{@link org.xtext.example.plantext.plantext.impl.TransitionImpl#getAssign <em>Assign</em>}</li>
 *   <li>{@link org.xtext.example.plantext.plantext.impl.TransitionImpl#getProbability <em>Probability</em>}</li>
 *   <li>{@link org.xtext.example.plantext.plantext.impl.TransitionImpl#getComments <em>Comments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionImpl extends MinimalEObjectImpl.Container implements Transition
{
  /**
   * The default value of the '{@link #getOutBoundState() <em>Out Bound State</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutBoundState()
   * @generated
   * @ordered
   */
  protected static final String OUT_BOUND_STATE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOutBoundState() <em>Out Bound State</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutBoundState()
   * @generated
   * @ordered
   */
  protected String outBoundState = OUT_BOUND_STATE_EDEFAULT;

  /**
   * The default value of the '{@link #getInboundState() <em>Inbound State</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInboundState()
   * @generated
   * @ordered
   */
  protected static final String INBOUND_STATE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInboundState() <em>Inbound State</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInboundState()
   * @generated
   * @ordered
   */
  protected String inboundState = INBOUND_STATE_EDEFAULT;

  /**
   * The cached value of the '{@link #getSelect() <em>Select</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelect()
   * @generated
   * @ordered
   */
  protected EList<String> select;

  /**
   * The cached value of the '{@link #getGuard() <em>Guard</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGuard()
   * @generated
   * @ordered
   */
  protected EList<String> guard;

  /**
   * The cached value of the '{@link #getSync() <em>Sync</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSync()
   * @generated
   * @ordered
   */
  protected EList<String> sync;

  /**
   * The cached value of the '{@link #getAssign() <em>Assign</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssign()
   * @generated
   * @ordered
   */
  protected EList<String> assign;

  /**
   * The cached value of the '{@link #getProbability() <em>Probability</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProbability()
   * @generated
   * @ordered
   */
  protected EList<String> probability;

  /**
   * The cached value of the '{@link #getComments() <em>Comments</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComments()
   * @generated
   * @ordered
   */
  protected EList<String> comments;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TransitionImpl()
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
    return PlantextPackage.Literals.TRANSITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOutBoundState()
  {
    return outBoundState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOutBoundState(String newOutBoundState)
  {
    String oldOutBoundState = outBoundState;
    outBoundState = newOutBoundState;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlantextPackage.TRANSITION__OUT_BOUND_STATE, oldOutBoundState, outBoundState));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInboundState()
  {
    return inboundState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInboundState(String newInboundState)
  {
    String oldInboundState = inboundState;
    inboundState = newInboundState;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlantextPackage.TRANSITION__INBOUND_STATE, oldInboundState, inboundState));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getSelect()
  {
    if (select == null)
    {
      select = new EDataTypeEList<String>(String.class, this, PlantextPackage.TRANSITION__SELECT);
    }
    return select;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getGuard()
  {
    if (guard == null)
    {
      guard = new EDataTypeEList<String>(String.class, this, PlantextPackage.TRANSITION__GUARD);
    }
    return guard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getSync()
  {
    if (sync == null)
    {
      sync = new EDataTypeEList<String>(String.class, this, PlantextPackage.TRANSITION__SYNC);
    }
    return sync;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getAssign()
  {
    if (assign == null)
    {
      assign = new EDataTypeEList<String>(String.class, this, PlantextPackage.TRANSITION__ASSIGN);
    }
    return assign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getProbability()
  {
    if (probability == null)
    {
      probability = new EDataTypeEList<String>(String.class, this, PlantextPackage.TRANSITION__PROBABILITY);
    }
    return probability;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getComments()
  {
    if (comments == null)
    {
      comments = new EDataTypeEList<String>(String.class, this, PlantextPackage.TRANSITION__COMMENTS);
    }
    return comments;
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
      case PlantextPackage.TRANSITION__OUT_BOUND_STATE:
        return getOutBoundState();
      case PlantextPackage.TRANSITION__INBOUND_STATE:
        return getInboundState();
      case PlantextPackage.TRANSITION__SELECT:
        return getSelect();
      case PlantextPackage.TRANSITION__GUARD:
        return getGuard();
      case PlantextPackage.TRANSITION__SYNC:
        return getSync();
      case PlantextPackage.TRANSITION__ASSIGN:
        return getAssign();
      case PlantextPackage.TRANSITION__PROBABILITY:
        return getProbability();
      case PlantextPackage.TRANSITION__COMMENTS:
        return getComments();
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
      case PlantextPackage.TRANSITION__OUT_BOUND_STATE:
        setOutBoundState((String)newValue);
        return;
      case PlantextPackage.TRANSITION__INBOUND_STATE:
        setInboundState((String)newValue);
        return;
      case PlantextPackage.TRANSITION__SELECT:
        getSelect().clear();
        getSelect().addAll((Collection<? extends String>)newValue);
        return;
      case PlantextPackage.TRANSITION__GUARD:
        getGuard().clear();
        getGuard().addAll((Collection<? extends String>)newValue);
        return;
      case PlantextPackage.TRANSITION__SYNC:
        getSync().clear();
        getSync().addAll((Collection<? extends String>)newValue);
        return;
      case PlantextPackage.TRANSITION__ASSIGN:
        getAssign().clear();
        getAssign().addAll((Collection<? extends String>)newValue);
        return;
      case PlantextPackage.TRANSITION__PROBABILITY:
        getProbability().clear();
        getProbability().addAll((Collection<? extends String>)newValue);
        return;
      case PlantextPackage.TRANSITION__COMMENTS:
        getComments().clear();
        getComments().addAll((Collection<? extends String>)newValue);
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
      case PlantextPackage.TRANSITION__OUT_BOUND_STATE:
        setOutBoundState(OUT_BOUND_STATE_EDEFAULT);
        return;
      case PlantextPackage.TRANSITION__INBOUND_STATE:
        setInboundState(INBOUND_STATE_EDEFAULT);
        return;
      case PlantextPackage.TRANSITION__SELECT:
        getSelect().clear();
        return;
      case PlantextPackage.TRANSITION__GUARD:
        getGuard().clear();
        return;
      case PlantextPackage.TRANSITION__SYNC:
        getSync().clear();
        return;
      case PlantextPackage.TRANSITION__ASSIGN:
        getAssign().clear();
        return;
      case PlantextPackage.TRANSITION__PROBABILITY:
        getProbability().clear();
        return;
      case PlantextPackage.TRANSITION__COMMENTS:
        getComments().clear();
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
      case PlantextPackage.TRANSITION__OUT_BOUND_STATE:
        return OUT_BOUND_STATE_EDEFAULT == null ? outBoundState != null : !OUT_BOUND_STATE_EDEFAULT.equals(outBoundState);
      case PlantextPackage.TRANSITION__INBOUND_STATE:
        return INBOUND_STATE_EDEFAULT == null ? inboundState != null : !INBOUND_STATE_EDEFAULT.equals(inboundState);
      case PlantextPackage.TRANSITION__SELECT:
        return select != null && !select.isEmpty();
      case PlantextPackage.TRANSITION__GUARD:
        return guard != null && !guard.isEmpty();
      case PlantextPackage.TRANSITION__SYNC:
        return sync != null && !sync.isEmpty();
      case PlantextPackage.TRANSITION__ASSIGN:
        return assign != null && !assign.isEmpty();
      case PlantextPackage.TRANSITION__PROBABILITY:
        return probability != null && !probability.isEmpty();
      case PlantextPackage.TRANSITION__COMMENTS:
        return comments != null && !comments.isEmpty();
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
    result.append(" (outBoundState: ");
    result.append(outBoundState);
    result.append(", inboundState: ");
    result.append(inboundState);
    result.append(", select: ");
    result.append(select);
    result.append(", guard: ");
    result.append(guard);
    result.append(", sync: ");
    result.append(sync);
    result.append(", assign: ");
    result.append(assign);
    result.append(", probability: ");
    result.append(probability);
    result.append(", comments: ");
    result.append(comments);
    result.append(')');
    return result.toString();
  }

} //TransitionImpl
