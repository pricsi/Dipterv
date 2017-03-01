/**
 */
package TTMCHybrid;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see TTMCHybrid.TTMCHybridPackage
 * @generated
 */
public interface TTMCHybridFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TTMCHybridFactory eINSTANCE = TTMCHybrid.impl.TTMCHybridFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Hybrid Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hybrid Specification</em>'.
	 * @generated
	 */
	HybridSpecification createHybridSpecification();

	/**
	 * Returns a new object of class '<em>Clock Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clock Type Definition</em>'.
	 * @generated
	 */
	ClockTypeDefinition createClockTypeDefinition();

	/**
	 * Returns a new object of class '<em>Dot Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dot Expression</em>'.
	 * @generated
	 */
	DotExpression createDotExpression();

	/**
	 * Returns a new object of class '<em>Location Reference Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location Reference Expression</em>'.
	 * @generated
	 */
	LocationReferenceExpression createLocationReferenceExpression();

	/**
	 * Returns a new object of class '<em>Hybrid Automaton Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hybrid Automaton Declaration</em>'.
	 * @generated
	 */
	HybridAutomatonDeclaration createHybridAutomatonDeclaration();

	/**
	 * Returns a new object of class '<em>Hybrid Automaton Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hybrid Automaton Reference</em>'.
	 * @generated
	 */
	HybridAutomatonReference createHybridAutomatonReference();

	/**
	 * Returns a new object of class '<em>Hybrid Automaton Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hybrid Automaton Definition</em>'.
	 * @generated
	 */
	HybridAutomatonDefinition createHybridAutomatonDefinition();

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
	 * Returns a new object of class '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location</em>'.
	 * @generated
	 */
	Location createLocation();

	/**
	 * Returns a new object of class '<em>Initial Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Initial Condition</em>'.
	 * @generated
	 */
	InitialCondition createInitialCondition();

	/**
	 * Returns a new object of class '<em>Invariant Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Invariant Condition</em>'.
	 * @generated
	 */
	InvariantCondition createInvariantCondition();

	/**
	 * Returns a new object of class '<em>Flow Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flow Condition</em>'.
	 * @generated
	 */
	FlowCondition createFlowCondition();

	/**
	 * Returns a new object of class '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition</em>'.
	 * @generated
	 */
	Transition createTransition();

	/**
	 * Returns a new object of class '<em>Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assignment</em>'.
	 * @generated
	 */
	Assignment createAssignment();

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
	TTMCHybridPackage getTTMCHybridPackage();

} //TTMCHybridFactory
