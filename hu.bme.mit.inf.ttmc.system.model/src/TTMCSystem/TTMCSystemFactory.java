/**
 */
package TTMCSystem;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see TTMCSystem.TTMCSystemPackage
 * @generated
 */
public interface TTMCSystemFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TTMCSystemFactory eINSTANCE = TTMCSystem.impl.TTMCSystemFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Definition Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Definition Declaration</em>'.
	 * @generated
	 */
	DefinitionDeclaration createDefinitionDeclaration();

	/**
	 * Returns a new object of class '<em>System Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Specification</em>'.
	 * @generated
	 */
	SystemSpecification createSystemSpecification();

	/**
	 * Returns a new object of class '<em>Local Variable Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Local Variable Declaration</em>'.
	 * @generated
	 */
	LocalVariableDeclaration createLocalVariableDeclaration();

	/**
	 * Returns a new object of class '<em>Global Variable Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Global Variable Declaration</em>'.
	 * @generated
	 */
	GlobalVariableDeclaration createGlobalVariableDeclaration();

	/**
	 * Returns a new object of class '<em>Input Variable Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Variable Declaration</em>'.
	 * @generated
	 */
	InputVariableDeclaration createInputVariableDeclaration();

	/**
	 * Returns a new object of class '<em>Output Variable Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Variable Declaration</em>'.
	 * @generated
	 */
	OutputVariableDeclaration createOutputVariableDeclaration();

	/**
	 * Returns a new object of class '<em>System Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Declaration</em>'.
	 * @generated
	 */
	SystemDeclaration createSystemDeclaration();

	/**
	 * Returns a new object of class '<em>System Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Definition</em>'.
	 * @generated
	 */
	SystemDefinition createSystemDefinition();

	/**
	 * Returns a new object of class '<em>System Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Reference</em>'.
	 * @generated
	 */
	SystemReference createSystemReference();

	/**
	 * Returns a new object of class '<em>Synchronous Composite System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Synchronous Composite System</em>'.
	 * @generated
	 */
	SynchronousCompositeSystem createSynchronousCompositeSystem();

	/**
	 * Returns a new object of class '<em>Asynchronous Composite System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asynchronous Composite System</em>'.
	 * @generated
	 */
	AsynchronousCompositeSystem createAsynchronousCompositeSystem();

	/**
	 * Returns a new object of class '<em>Synchronous Multi System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Synchronous Multi System</em>'.
	 * @generated
	 */
	SynchronousMultiSystem createSynchronousMultiSystem();

	/**
	 * Returns a new object of class '<em>Asynchronous Multi System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asynchronous Multi System</em>'.
	 * @generated
	 */
	AsynchronousMultiSystem createAsynchronousMultiSystem();

	/**
	 * Returns a new object of class '<em>Invariant Constraint Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Invariant Constraint Definition</em>'.
	 * @generated
	 */
	InvariantConstraintDefinition createInvariantConstraintDefinition();

	/**
	 * Returns a new object of class '<em>Initial Constraint Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Initial Constraint Definition</em>'.
	 * @generated
	 */
	InitialConstraintDefinition createInitialConstraintDefinition();

	/**
	 * Returns a new object of class '<em>Transition Constraint Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition Constraint Definition</em>'.
	 * @generated
	 */
	TransitionConstraintDefinition createTransitionConstraintDefinition();

	/**
	 * Returns a new object of class '<em>Property Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Declaration</em>'.
	 * @generated
	 */
	PropertyDeclaration createPropertyDeclaration();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TTMCSystemPackage getTTMCSystemPackage();

} //TTMCSystemFactory
