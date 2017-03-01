/**
 */
package TTMCHybrid.util;

import TTMCConstraint.BasicTypeDefinition;
import TTMCConstraint.ConstraintSpecification;
import TTMCConstraint.Declaration;
import TTMCConstraint.Expression;
import TTMCConstraint.NamedElement;
import TTMCConstraint.NullaryExpression;
import TTMCConstraint.ParametricElement;
import TTMCConstraint.ParametrizedElement;
import TTMCConstraint.Type;
import TTMCConstraint.TypeDefinition;
import TTMCConstraint.UnaryExpression;

import TTMCHybrid.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see TTMCHybrid.TTMCHybridPackage
 * @generated
 */
public class TTMCHybridAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TTMCHybridPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTMCHybridAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TTMCHybridPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TTMCHybridSwitch<Adapter> modelSwitch =
		new TTMCHybridSwitch<Adapter>() {
			@Override
			public Adapter caseHybridSpecification(HybridSpecification object) {
				return createHybridSpecificationAdapter();
			}
			@Override
			public Adapter caseClockTypeDefinition(ClockTypeDefinition object) {
				return createClockTypeDefinitionAdapter();
			}
			@Override
			public Adapter caseDotExpression(DotExpression object) {
				return createDotExpressionAdapter();
			}
			@Override
			public Adapter caseLocationReferenceExpression(LocationReferenceExpression object) {
				return createLocationReferenceExpressionAdapter();
			}
			@Override
			public Adapter caseHybridAutomaton(HybridAutomaton object) {
				return createHybridAutomatonAdapter();
			}
			@Override
			public Adapter caseHybridAutomatonDeclaration(HybridAutomatonDeclaration object) {
				return createHybridAutomatonDeclarationAdapter();
			}
			@Override
			public Adapter caseHybridAutomatonReference(HybridAutomatonReference object) {
				return createHybridAutomatonReferenceAdapter();
			}
			@Override
			public Adapter caseHybridAutomatonDefinition(HybridAutomatonDefinition object) {
				return createHybridAutomatonDefinitionAdapter();
			}
			@Override
			public Adapter caseVariableDeclaration(VariableDeclaration object) {
				return createVariableDeclarationAdapter();
			}
			@Override
			public Adapter caseLocalVariableDeclaration(LocalVariableDeclaration object) {
				return createLocalVariableDeclarationAdapter();
			}
			@Override
			public Adapter caseGlobalVariableDeclaration(GlobalVariableDeclaration object) {
				return createGlobalVariableDeclarationAdapter();
			}
			@Override
			public Adapter caseLocation(Location object) {
				return createLocationAdapter();
			}
			@Override
			public Adapter caseCondition(Condition object) {
				return createConditionAdapter();
			}
			@Override
			public Adapter caseInitialCondition(InitialCondition object) {
				return createInitialConditionAdapter();
			}
			@Override
			public Adapter caseInvariantCondition(InvariantCondition object) {
				return createInvariantConditionAdapter();
			}
			@Override
			public Adapter caseFlowCondition(FlowCondition object) {
				return createFlowConditionAdapter();
			}
			@Override
			public Adapter caseTransition(Transition object) {
				return createTransitionAdapter();
			}
			@Override
			public Adapter caseAssignment(Assignment object) {
				return createAssignmentAdapter();
			}
			@Override
			public Adapter casePropertyDeclaration(PropertyDeclaration object) {
				return createPropertyDeclarationAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseParametricElement(ParametricElement object) {
				return createParametricElementAdapter();
			}
			@Override
			public Adapter caseConstraintSpecification(ConstraintSpecification object) {
				return createConstraintSpecificationAdapter();
			}
			@Override
			public Adapter caseType(Type object) {
				return createTypeAdapter();
			}
			@Override
			public Adapter caseTypeDefinition(TypeDefinition object) {
				return createTypeDefinitionAdapter();
			}
			@Override
			public Adapter caseBasicTypeDefinition(BasicTypeDefinition object) {
				return createBasicTypeDefinitionAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseUnaryExpression(UnaryExpression object) {
				return createUnaryExpressionAdapter();
			}
			@Override
			public Adapter caseNullaryExpression(NullaryExpression object) {
				return createNullaryExpressionAdapter();
			}
			@Override
			public Adapter caseParametrizedElement(ParametrizedElement object) {
				return createParametrizedElementAdapter();
			}
			@Override
			public Adapter caseDeclaration(Declaration object) {
				return createDeclarationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link TTMCHybrid.HybridSpecification <em>Hybrid Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCHybrid.HybridSpecification
	 * @generated
	 */
	public Adapter createHybridSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCHybrid.ClockTypeDefinition <em>Clock Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCHybrid.ClockTypeDefinition
	 * @generated
	 */
	public Adapter createClockTypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCHybrid.DotExpression <em>Dot Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCHybrid.DotExpression
	 * @generated
	 */
	public Adapter createDotExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCHybrid.LocationReferenceExpression <em>Location Reference Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCHybrid.LocationReferenceExpression
	 * @generated
	 */
	public Adapter createLocationReferenceExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCHybrid.HybridAutomaton <em>Hybrid Automaton</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCHybrid.HybridAutomaton
	 * @generated
	 */
	public Adapter createHybridAutomatonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCHybrid.HybridAutomatonDeclaration <em>Hybrid Automaton Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCHybrid.HybridAutomatonDeclaration
	 * @generated
	 */
	public Adapter createHybridAutomatonDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCHybrid.HybridAutomatonReference <em>Hybrid Automaton Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCHybrid.HybridAutomatonReference
	 * @generated
	 */
	public Adapter createHybridAutomatonReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCHybrid.HybridAutomatonDefinition <em>Hybrid Automaton Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCHybrid.HybridAutomatonDefinition
	 * @generated
	 */
	public Adapter createHybridAutomatonDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCHybrid.VariableDeclaration <em>Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCHybrid.VariableDeclaration
	 * @generated
	 */
	public Adapter createVariableDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCHybrid.LocalVariableDeclaration <em>Local Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCHybrid.LocalVariableDeclaration
	 * @generated
	 */
	public Adapter createLocalVariableDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCHybrid.GlobalVariableDeclaration <em>Global Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCHybrid.GlobalVariableDeclaration
	 * @generated
	 */
	public Adapter createGlobalVariableDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCHybrid.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCHybrid.Location
	 * @generated
	 */
	public Adapter createLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCHybrid.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCHybrid.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCHybrid.InitialCondition <em>Initial Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCHybrid.InitialCondition
	 * @generated
	 */
	public Adapter createInitialConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCHybrid.InvariantCondition <em>Invariant Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCHybrid.InvariantCondition
	 * @generated
	 */
	public Adapter createInvariantConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCHybrid.FlowCondition <em>Flow Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCHybrid.FlowCondition
	 * @generated
	 */
	public Adapter createFlowConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCHybrid.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCHybrid.Transition
	 * @generated
	 */
	public Adapter createTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCHybrid.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCHybrid.Assignment
	 * @generated
	 */
	public Adapter createAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCHybrid.PropertyDeclaration <em>Property Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCHybrid.PropertyDeclaration
	 * @generated
	 */
	public Adapter createPropertyDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.ParametricElement <em>Parametric Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.ParametricElement
	 * @generated
	 */
	public Adapter createParametricElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.ConstraintSpecification <em>Constraint Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.ConstraintSpecification
	 * @generated
	 */
	public Adapter createConstraintSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.TypeDefinition <em>Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.TypeDefinition
	 * @generated
	 */
	public Adapter createTypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.BasicTypeDefinition <em>Basic Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.BasicTypeDefinition
	 * @generated
	 */
	public Adapter createBasicTypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.UnaryExpression <em>Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.UnaryExpression
	 * @generated
	 */
	public Adapter createUnaryExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.NullaryExpression <em>Nullary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.NullaryExpression
	 * @generated
	 */
	public Adapter createNullaryExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.ParametrizedElement <em>Parametrized Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.ParametrizedElement
	 * @generated
	 */
	public Adapter createParametrizedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.Declaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.Declaration
	 * @generated
	 */
	public Adapter createDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TTMCHybridAdapterFactory
