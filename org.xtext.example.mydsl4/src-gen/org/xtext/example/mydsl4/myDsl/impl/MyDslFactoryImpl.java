/**
 * generated by Xtext 2.36.0
 */
package org.xtext.example.mydsl4.myDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.mydsl4.myDsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyDslFactoryImpl extends EFactoryImpl implements MyDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MyDslFactory init()
  {
    try
    {
      MyDslFactory theMyDslFactory = (MyDslFactory)EPackage.Registry.INSTANCE.getEFactory(MyDslPackage.eNS_URI);
      if (theMyDslFactory != null)
      {
        return theMyDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MyDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslFactoryImpl()
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
      case MyDslPackage.MODEL: return createModel();
      case MyDslPackage.TEAM_GOAL_OR_TASK: return createTeam_goal_or_task();
      case MyDslPackage.TEAM_DEFINITION: return createTeamDefinition();
      case MyDslPackage.ROBOT_DEFINITION: return createRobotDefinition();
      case MyDslPackage.GOAL_DEFINITION: return createGoalDefinition();
      case MyDslPackage.TASK_DEFINITION: return createTaskDefinition();
      case MyDslPackage.CONDITION: return createCondition();
      case MyDslPackage.TASK_STATEMENT: return createTaskStatement();
      case MyDslPackage.MOVE_TO_STATEMENT: return createMoveToStatement();
      case MyDslPackage.SIMULATE_STATEMENT: return createSimulateStatement();
      case MyDslPackage.RUN_STATEMENT: return createRunStatement();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Team_goal_or_task createTeam_goal_or_task()
  {
    Team_goal_or_taskImpl team_goal_or_task = new Team_goal_or_taskImpl();
    return team_goal_or_task;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TeamDefinition createTeamDefinition()
  {
    TeamDefinitionImpl teamDefinition = new TeamDefinitionImpl();
    return teamDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RobotDefinition createRobotDefinition()
  {
    RobotDefinitionImpl robotDefinition = new RobotDefinitionImpl();
    return robotDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GoalDefinition createGoalDefinition()
  {
    GoalDefinitionImpl goalDefinition = new GoalDefinitionImpl();
    return goalDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TaskDefinition createTaskDefinition()
  {
    TaskDefinitionImpl taskDefinition = new TaskDefinitionImpl();
    return taskDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Condition createCondition()
  {
    ConditionImpl condition = new ConditionImpl();
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TaskStatement createTaskStatement()
  {
    TaskStatementImpl taskStatement = new TaskStatementImpl();
    return taskStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MoveToStatement createMoveToStatement()
  {
    MoveToStatementImpl moveToStatement = new MoveToStatementImpl();
    return moveToStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SimulateStatement createSimulateStatement()
  {
    SimulateStatementImpl simulateStatement = new SimulateStatementImpl();
    return simulateStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RunStatement createRunStatement()
  {
    RunStatementImpl runStatement = new RunStatementImpl();
    return runStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MyDslPackage getMyDslPackage()
  {
    return (MyDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MyDslPackage getPackage()
  {
    return MyDslPackage.eINSTANCE;
  }

} //MyDslFactoryImpl
