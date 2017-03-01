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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see TTMCSystem.TTMCSystemPackage
 * @generated
 */
public class TTMCSystemSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TTMCSystemPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTMCSystemSwitch() {
		if (modelPackage == null) {
			modelPackage = TTMCSystemPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TTMCSystemPackage.DEFINITION_DECLARATION: {
				DefinitionDeclaration definitionDeclaration = (DefinitionDeclaration)theEObject;
				T result = caseDefinitionDeclaration(definitionDeclaration);
				if (result == null) result = caseDefinableDeclaration(definitionDeclaration);
				if (result == null) result = caseDeclaration(definitionDeclaration);
				if (result == null) result = caseNamedElement(definitionDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCSystemPackage.VARIABLE_DECLARATION: {
				VariableDeclaration variableDeclaration = (VariableDeclaration)theEObject;
				T result = caseVariableDeclaration(variableDeclaration);
				if (result == null) result = caseDeclaration(variableDeclaration);
				if (result == null) result = caseNamedElement(variableDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCSystemPackage.SYSTEM_SPECIFICATION: {
				SystemSpecification systemSpecification = (SystemSpecification)theEObject;
				T result = caseSystemSpecification(systemSpecification);
				if (result == null) result = caseConstraintSpecification(systemSpecification);
				if (result == null) result = caseNamedElement(systemSpecification);
				if (result == null) result = caseParametricElement(systemSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCSystemPackage.LOCAL_VARIABLE_DECLARATION: {
				LocalVariableDeclaration localVariableDeclaration = (LocalVariableDeclaration)theEObject;
				T result = caseLocalVariableDeclaration(localVariableDeclaration);
				if (result == null) result = caseVariableDeclaration(localVariableDeclaration);
				if (result == null) result = caseDeclaration(localVariableDeclaration);
				if (result == null) result = caseNamedElement(localVariableDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCSystemPackage.GLOBAL_VARIABLE_DECLARATION: {
				GlobalVariableDeclaration globalVariableDeclaration = (GlobalVariableDeclaration)theEObject;
				T result = caseGlobalVariableDeclaration(globalVariableDeclaration);
				if (result == null) result = caseVariableDeclaration(globalVariableDeclaration);
				if (result == null) result = caseDeclaration(globalVariableDeclaration);
				if (result == null) result = caseNamedElement(globalVariableDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCSystemPackage.INPUT_VARIABLE_DECLARATION: {
				InputVariableDeclaration inputVariableDeclaration = (InputVariableDeclaration)theEObject;
				T result = caseInputVariableDeclaration(inputVariableDeclaration);
				if (result == null) result = caseVariableDeclaration(inputVariableDeclaration);
				if (result == null) result = caseDeclaration(inputVariableDeclaration);
				if (result == null) result = caseNamedElement(inputVariableDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCSystemPackage.OUTPUT_VARIABLE_DECLARATION: {
				OutputVariableDeclaration outputVariableDeclaration = (OutputVariableDeclaration)theEObject;
				T result = caseOutputVariableDeclaration(outputVariableDeclaration);
				if (result == null) result = caseVariableDeclaration(outputVariableDeclaration);
				if (result == null) result = caseDeclaration(outputVariableDeclaration);
				if (result == null) result = caseNamedElement(outputVariableDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCSystemPackage.SYSTEM_DECLARATION: {
				SystemDeclaration systemDeclaration = (SystemDeclaration)theEObject;
				T result = caseSystemDeclaration(systemDeclaration);
				if (result == null) result = caseNamedElement(systemDeclaration);
				if (result == null) result = caseParametricElement(systemDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCSystemPackage.SYSTEM: {
				TTMCSystem.System system = (TTMCSystem.System)theEObject;
				T result = caseSystem(system);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCSystemPackage.SYSTEM_DEFINITION: {
				SystemDefinition systemDefinition = (SystemDefinition)theEObject;
				T result = caseSystemDefinition(systemDefinition);
				if (result == null) result = caseSystem(systemDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCSystemPackage.SYSTEM_REFERENCE: {
				SystemReference systemReference = (SystemReference)theEObject;
				T result = caseSystemReference(systemReference);
				if (result == null) result = caseSystem(systemReference);
				if (result == null) result = caseParametrizedElement(systemReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCSystemPackage.COMPOSITE_SYSTEM: {
				CompositeSystem compositeSystem = (CompositeSystem)theEObject;
				T result = caseCompositeSystem(compositeSystem);
				if (result == null) result = caseSystem(compositeSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCSystemPackage.SYNCHRONOUS_COMPOSITE_SYSTEM: {
				SynchronousCompositeSystem synchronousCompositeSystem = (SynchronousCompositeSystem)theEObject;
				T result = caseSynchronousCompositeSystem(synchronousCompositeSystem);
				if (result == null) result = caseCompositeSystem(synchronousCompositeSystem);
				if (result == null) result = caseSystem(synchronousCompositeSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCSystemPackage.ASYNCHRONOUS_COMPOSITE_SYSTEM: {
				AsynchronousCompositeSystem asynchronousCompositeSystem = (AsynchronousCompositeSystem)theEObject;
				T result = caseAsynchronousCompositeSystem(asynchronousCompositeSystem);
				if (result == null) result = caseCompositeSystem(asynchronousCompositeSystem);
				if (result == null) result = caseSystem(asynchronousCompositeSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCSystemPackage.MULTI_SYSTEM: {
				MultiSystem multiSystem = (MultiSystem)theEObject;
				T result = caseMultiSystem(multiSystem);
				if (result == null) result = caseSystem(multiSystem);
				if (result == null) result = caseParametricElement(multiSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCSystemPackage.SYNCHRONOUS_MULTI_SYSTEM: {
				SynchronousMultiSystem synchronousMultiSystem = (SynchronousMultiSystem)theEObject;
				T result = caseSynchronousMultiSystem(synchronousMultiSystem);
				if (result == null) result = caseMultiSystem(synchronousMultiSystem);
				if (result == null) result = caseSystem(synchronousMultiSystem);
				if (result == null) result = caseParametricElement(synchronousMultiSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCSystemPackage.ASYNCHRONOUS_MULTI_SYSTEM: {
				AsynchronousMultiSystem asynchronousMultiSystem = (AsynchronousMultiSystem)theEObject;
				T result = caseAsynchronousMultiSystem(asynchronousMultiSystem);
				if (result == null) result = caseMultiSystem(asynchronousMultiSystem);
				if (result == null) result = caseSystem(asynchronousMultiSystem);
				if (result == null) result = caseParametricElement(asynchronousMultiSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCSystemPackage.SYSTEM_CONSTRAINT_DEFINITION: {
				SystemConstraintDefinition systemConstraintDefinition = (SystemConstraintDefinition)theEObject;
				T result = caseSystemConstraintDefinition(systemConstraintDefinition);
				if (result == null) result = caseConstraintDefinition(systemConstraintDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCSystemPackage.INVARIANT_CONSTRAINT_DEFINITION: {
				InvariantConstraintDefinition invariantConstraintDefinition = (InvariantConstraintDefinition)theEObject;
				T result = caseInvariantConstraintDefinition(invariantConstraintDefinition);
				if (result == null) result = caseSystemConstraintDefinition(invariantConstraintDefinition);
				if (result == null) result = caseConstraintDefinition(invariantConstraintDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCSystemPackage.INITIAL_CONSTRAINT_DEFINITION: {
				InitialConstraintDefinition initialConstraintDefinition = (InitialConstraintDefinition)theEObject;
				T result = caseInitialConstraintDefinition(initialConstraintDefinition);
				if (result == null) result = caseSystemConstraintDefinition(initialConstraintDefinition);
				if (result == null) result = caseConstraintDefinition(initialConstraintDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCSystemPackage.TRANSITION_CONSTRAINT_DEFINITION: {
				TransitionConstraintDefinition transitionConstraintDefinition = (TransitionConstraintDefinition)theEObject;
				T result = caseTransitionConstraintDefinition(transitionConstraintDefinition);
				if (result == null) result = caseSystemConstraintDefinition(transitionConstraintDefinition);
				if (result == null) result = caseConstraintDefinition(transitionConstraintDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCSystemPackage.PROPERTY_DECLARATION: {
				PropertyDeclaration propertyDeclaration = (PropertyDeclaration)theEObject;
				T result = casePropertyDeclaration(propertyDeclaration);
				if (result == null) result = caseNamedElement(propertyDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Definition Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Definition Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefinitionDeclaration(DefinitionDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDeclaration(VariableDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemSpecification(SystemSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Variable Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Variable Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalVariableDeclaration(LocalVariableDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Variable Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Variable Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalVariableDeclaration(GlobalVariableDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Variable Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Variable Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputVariableDeclaration(InputVariableDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Variable Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Variable Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputVariableDeclaration(OutputVariableDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemDeclaration(SystemDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystem(TTMCSystem.System object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemDefinition(SystemDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemReference(SystemReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeSystem(CompositeSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Synchronous Composite System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Synchronous Composite System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSynchronousCompositeSystem(SynchronousCompositeSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asynchronous Composite System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asynchronous Composite System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAsynchronousCompositeSystem(AsynchronousCompositeSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiSystem(MultiSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Synchronous Multi System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Synchronous Multi System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSynchronousMultiSystem(SynchronousMultiSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asynchronous Multi System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asynchronous Multi System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAsynchronousMultiSystem(AsynchronousMultiSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Constraint Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Constraint Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemConstraintDefinition(SystemConstraintDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invariant Constraint Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invariant Constraint Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvariantConstraintDefinition(InvariantConstraintDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initial Constraint Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initial Constraint Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitialConstraintDefinition(InitialConstraintDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition Constraint Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition Constraint Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransitionConstraintDefinition(TransitionConstraintDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyDeclaration(PropertyDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclaration(Declaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Definable Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Definable Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefinableDeclaration(DefinableDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parametric Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parametric Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParametricElement(ParametricElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintSpecification(ConstraintSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parametrized Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parametrized Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParametrizedElement(ParametrizedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintDefinition(ConstraintDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //TTMCSystemSwitch
