/**
 */
package TTMCSystem.util;

import TTMCConstraint.ConstraintDefinition;
import TTMCConstraint.ConstraintSpecification;
import TTMCConstraint.Declaration;
import TTMCConstraint.DefinableDeclaration;
import TTMCConstraint.NamedElement;
import TTMCConstraint.ParametricElement;
import TTMCConstraint.ParametrizedElement;

import TTMCSystem.AsynchronousCompositeSystem;
import TTMCSystem.AsynchronousMultiSystem;
import TTMCSystem.CompositeSystem;
import TTMCSystem.DefinitionDeclaration;
import TTMCSystem.GlobalVariableDeclaration;
import TTMCSystem.InitialConstraintDefinition;
import TTMCSystem.InputVariableDeclaration;
import TTMCSystem.InvariantConstraintDefinition;
import TTMCSystem.LocalVariableDeclaration;
import TTMCSystem.MultiSystem;
import TTMCSystem.OutputVariableDeclaration;
import TTMCSystem.PropertyDeclaration;
import TTMCSystem.SynchronousCompositeSystem;
import TTMCSystem.SynchronousMultiSystem;
import TTMCSystem.SystemConstraintDefinition;
import TTMCSystem.SystemDeclaration;
import TTMCSystem.SystemDefinition;
import TTMCSystem.SystemReference;
import TTMCSystem.SystemSpecification;
import TTMCSystem.TTMCSystemPackage;
import TTMCSystem.TransitionConstraintDefinition;
import TTMCSystem.VariableDeclaration;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see TTMCSystem.TTMCSystemPackage
 * @generated
 */
public class TTMCSystemAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TTMCSystemPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTMCSystemAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TTMCSystemPackage.eINSTANCE;
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
	protected TTMCSystemSwitch<Adapter> modelSwitch =
		new TTMCSystemSwitch<Adapter>() {
			@Override
			public Adapter caseDefinitionDeclaration(DefinitionDeclaration object) {
				return createDefinitionDeclarationAdapter();
			}
			@Override
			public Adapter caseVariableDeclaration(VariableDeclaration object) {
				return createVariableDeclarationAdapter();
			}
			@Override
			public Adapter caseSystemSpecification(SystemSpecification object) {
				return createSystemSpecificationAdapter();
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
			public Adapter caseInputVariableDeclaration(InputVariableDeclaration object) {
				return createInputVariableDeclarationAdapter();
			}
			@Override
			public Adapter caseOutputVariableDeclaration(OutputVariableDeclaration object) {
				return createOutputVariableDeclarationAdapter();
			}
			@Override
			public Adapter caseSystemDeclaration(SystemDeclaration object) {
				return createSystemDeclarationAdapter();
			}
			@Override
			public Adapter caseSystem(TTMCSystem.System object) {
				return createSystemAdapter();
			}
			@Override
			public Adapter caseSystemDefinition(SystemDefinition object) {
				return createSystemDefinitionAdapter();
			}
			@Override
			public Adapter caseSystemReference(SystemReference object) {
				return createSystemReferenceAdapter();
			}
			@Override
			public Adapter caseCompositeSystem(CompositeSystem object) {
				return createCompositeSystemAdapter();
			}
			@Override
			public Adapter caseSynchronousCompositeSystem(SynchronousCompositeSystem object) {
				return createSynchronousCompositeSystemAdapter();
			}
			@Override
			public Adapter caseAsynchronousCompositeSystem(AsynchronousCompositeSystem object) {
				return createAsynchronousCompositeSystemAdapter();
			}
			@Override
			public Adapter caseMultiSystem(MultiSystem object) {
				return createMultiSystemAdapter();
			}
			@Override
			public Adapter caseSynchronousMultiSystem(SynchronousMultiSystem object) {
				return createSynchronousMultiSystemAdapter();
			}
			@Override
			public Adapter caseAsynchronousMultiSystem(AsynchronousMultiSystem object) {
				return createAsynchronousMultiSystemAdapter();
			}
			@Override
			public Adapter caseSystemConstraintDefinition(SystemConstraintDefinition object) {
				return createSystemConstraintDefinitionAdapter();
			}
			@Override
			public Adapter caseInvariantConstraintDefinition(InvariantConstraintDefinition object) {
				return createInvariantConstraintDefinitionAdapter();
			}
			@Override
			public Adapter caseInitialConstraintDefinition(InitialConstraintDefinition object) {
				return createInitialConstraintDefinitionAdapter();
			}
			@Override
			public Adapter caseTransitionConstraintDefinition(TransitionConstraintDefinition object) {
				return createTransitionConstraintDefinitionAdapter();
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
			public Adapter caseDeclaration(Declaration object) {
				return createDeclarationAdapter();
			}
			@Override
			public Adapter caseDefinableDeclaration(DefinableDeclaration object) {
				return createDefinableDeclarationAdapter();
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
			public Adapter caseParametrizedElement(ParametrizedElement object) {
				return createParametrizedElementAdapter();
			}
			@Override
			public Adapter caseConstraintDefinition(ConstraintDefinition object) {
				return createConstraintDefinitionAdapter();
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
	 * Creates a new adapter for an object of class '{@link TTMCSystem.DefinitionDeclaration <em>Definition Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCSystem.DefinitionDeclaration
	 * @generated
	 */
	public Adapter createDefinitionDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCSystem.VariableDeclaration <em>Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCSystem.VariableDeclaration
	 * @generated
	 */
	public Adapter createVariableDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCSystem.SystemSpecification <em>System Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCSystem.SystemSpecification
	 * @generated
	 */
	public Adapter createSystemSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCSystem.LocalVariableDeclaration <em>Local Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCSystem.LocalVariableDeclaration
	 * @generated
	 */
	public Adapter createLocalVariableDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCSystem.GlobalVariableDeclaration <em>Global Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCSystem.GlobalVariableDeclaration
	 * @generated
	 */
	public Adapter createGlobalVariableDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCSystem.InputVariableDeclaration <em>Input Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCSystem.InputVariableDeclaration
	 * @generated
	 */
	public Adapter createInputVariableDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCSystem.OutputVariableDeclaration <em>Output Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCSystem.OutputVariableDeclaration
	 * @generated
	 */
	public Adapter createOutputVariableDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCSystem.SystemDeclaration <em>System Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCSystem.SystemDeclaration
	 * @generated
	 */
	public Adapter createSystemDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCSystem.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCSystem.System
	 * @generated
	 */
	public Adapter createSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCSystem.SystemDefinition <em>System Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCSystem.SystemDefinition
	 * @generated
	 */
	public Adapter createSystemDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCSystem.SystemReference <em>System Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCSystem.SystemReference
	 * @generated
	 */
	public Adapter createSystemReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCSystem.CompositeSystem <em>Composite System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCSystem.CompositeSystem
	 * @generated
	 */
	public Adapter createCompositeSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCSystem.SynchronousCompositeSystem <em>Synchronous Composite System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCSystem.SynchronousCompositeSystem
	 * @generated
	 */
	public Adapter createSynchronousCompositeSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCSystem.AsynchronousCompositeSystem <em>Asynchronous Composite System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCSystem.AsynchronousCompositeSystem
	 * @generated
	 */
	public Adapter createAsynchronousCompositeSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCSystem.MultiSystem <em>Multi System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCSystem.MultiSystem
	 * @generated
	 */
	public Adapter createMultiSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCSystem.SynchronousMultiSystem <em>Synchronous Multi System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCSystem.SynchronousMultiSystem
	 * @generated
	 */
	public Adapter createSynchronousMultiSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCSystem.AsynchronousMultiSystem <em>Asynchronous Multi System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCSystem.AsynchronousMultiSystem
	 * @generated
	 */
	public Adapter createAsynchronousMultiSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCSystem.SystemConstraintDefinition <em>System Constraint Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCSystem.SystemConstraintDefinition
	 * @generated
	 */
	public Adapter createSystemConstraintDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCSystem.InvariantConstraintDefinition <em>Invariant Constraint Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCSystem.InvariantConstraintDefinition
	 * @generated
	 */
	public Adapter createInvariantConstraintDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCSystem.InitialConstraintDefinition <em>Initial Constraint Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCSystem.InitialConstraintDefinition
	 * @generated
	 */
	public Adapter createInitialConstraintDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCSystem.TransitionConstraintDefinition <em>Transition Constraint Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCSystem.TransitionConstraintDefinition
	 * @generated
	 */
	public Adapter createTransitionConstraintDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCSystem.PropertyDeclaration <em>Property Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCSystem.PropertyDeclaration
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
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.DefinableDeclaration <em>Definable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.DefinableDeclaration
	 * @generated
	 */
	public Adapter createDefinableDeclarationAdapter() {
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
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.ConstraintDefinition <em>Constraint Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.ConstraintDefinition
	 * @generated
	 */
	public Adapter createConstraintDefinitionAdapter() {
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

} //TTMCSystemAdapterFactory
