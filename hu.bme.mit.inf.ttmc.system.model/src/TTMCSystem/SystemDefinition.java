/**
 */
package TTMCSystem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link TTMCSystem.SystemDefinition#getVariableDeclarations <em>Variable Declarations</em>}</li>
 *   <li>{@link TTMCSystem.SystemDefinition#getDefinitionDeclarations <em>Definition Declarations</em>}</li>
 *   <li>{@link TTMCSystem.SystemDefinition#getSystemConstraintDefinitions <em>System Constraint Definitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see TTMCSystem.TTMCSystemPackage#getSystemDefinition()
 * @model
 * @generated
 */
public interface SystemDefinition extends TTMCSystem.System {
	/**
	 * Returns the value of the '<em><b>Variable Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link TTMCSystem.VariableDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Declarations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Declarations</em>' containment reference list.
	 * @see TTMCSystem.TTMCSystemPackage#getSystemDefinition_VariableDeclarations()
	 * @model containment="true"
	 * @generated
	 */
	EList<VariableDeclaration> getVariableDeclarations();

	/**
	 * Returns the value of the '<em><b>Definition Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link TTMCSystem.DefinitionDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition Declarations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition Declarations</em>' containment reference list.
	 * @see TTMCSystem.TTMCSystemPackage#getSystemDefinition_DefinitionDeclarations()
	 * @model containment="true"
	 * @generated
	 */
	EList<DefinitionDeclaration> getDefinitionDeclarations();

	/**
	 * Returns the value of the '<em><b>System Constraint Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link TTMCSystem.SystemConstraintDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Constraint Definitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Constraint Definitions</em>' containment reference list.
	 * @see TTMCSystem.TTMCSystemPackage#getSystemDefinition_SystemConstraintDefinitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<SystemConstraintDefinition> getSystemConstraintDefinitions();

} // SystemDefinition
