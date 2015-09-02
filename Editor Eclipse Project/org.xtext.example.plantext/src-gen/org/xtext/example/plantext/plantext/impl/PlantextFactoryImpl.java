/**
 */
package org.xtext.example.plantext.plantext.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.plantext.plantext.Branchpoint;
import org.xtext.example.plantext.plantext.Declaration;
import org.xtext.example.plantext.plantext.Document;
import org.xtext.example.plantext.plantext.Parameter;
import org.xtext.example.plantext.plantext.PlantextFactory;
import org.xtext.example.plantext.plantext.PlantextPackage;
import org.xtext.example.plantext.plantext.State;
import org.xtext.example.plantext.plantext.Template;
import org.xtext.example.plantext.plantext.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlantextFactoryImpl extends EFactoryImpl implements PlantextFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PlantextFactory init()
  {
    try
    {
      PlantextFactory thePlantextFactory = (PlantextFactory)EPackage.Registry.INSTANCE.getEFactory(PlantextPackage.eNS_URI);
      if (thePlantextFactory != null)
      {
        return thePlantextFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new PlantextFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlantextFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case PlantextPackage.DOCUMENT: return createDocument();
      case PlantextPackage.DECLARATION: return createDeclaration();
      case PlantextPackage.TEMPLATE: return createTemplate();
      case PlantextPackage.SYSTEM: return createSystem();
      case PlantextPackage.PARAMETER: return createParameter();
      case PlantextPackage.STATE: return createState();
      case PlantextPackage.BRANCHPOINT: return createBranchpoint();
      case PlantextPackage.TRANSITION: return createTransition();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Document createDocument()
  {
    DocumentImpl document = new DocumentImpl();
    return document;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Declaration createDeclaration()
  {
    DeclarationImpl declaration = new DeclarationImpl();
    return declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Template createTemplate()
  {
    TemplateImpl template = new TemplateImpl();
    return template;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.example.plantext.plantext.System createSystem()
  {
    SystemImpl system = new SystemImpl();
    return system;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State createState()
  {
    StateImpl state = new StateImpl();
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Branchpoint createBranchpoint()
  {
    BranchpointImpl branchpoint = new BranchpointImpl();
    return branchpoint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Transition createTransition()
  {
    TransitionImpl transition = new TransitionImpl();
    return transition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlantextPackage getPlantextPackage()
  {
    return (PlantextPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static PlantextPackage getPackage()
  {
    return PlantextPackage.eINSTANCE;
  }

} //PlantextFactoryImpl
