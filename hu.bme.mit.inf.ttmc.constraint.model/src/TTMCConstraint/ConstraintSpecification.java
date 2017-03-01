/**
 */
package TTMCConstraint;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TTMCConstraint.ConstraintSpecification#getTypeDeclarations <em>Type Declarations</em>}</li>
 *   <li>{@link TTMCConstraint.ConstraintSpecification#getConstantDeclarations <em>Constant Declarations</em>}</li>
 *   <li>{@link TTMCConstraint.ConstraintSpecification#getFunctionDeclarations <em>Function Declarations</em>}</li>
 *   <li>{@link TTMCConstraint.ConstraintSpecification#getBasicConstraintDefinitions <em>Basic Constraint Definitions</em>}</li>
 * </ul>
 *
 * @see TTMCConstraint.TTMCConstraintPackage#getConstraintSpecification()
 * @model
 * @generated
 */
public interface ConstraintSpecification extends NamedElement, ParametricElement {
	/**
	 * Returns the value of the '<em><b>Type Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link TTMCConstraint.TypeDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Declarations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Declarations</em>' containment reference list.
	 * @see TTMCConstraint.TTMCConstraintPackage#getConstraintSpecification_TypeDeclarations()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeDeclaration> getTypeDeclarations();

	/**
	 * Returns the value of the '<em><b>Constant Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link TTMCConstraint.ConstantDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant Declarations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant Declarations</em>' containment reference list.
	 * @see TTMCConstraint.TTMCConstraintPackage#getConstraintSpecification_ConstantDeclarations()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConstantDeclaration> getConstantDeclarations();

	/**
	 * Returns the value of the '<em><b>Function Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link TTMCConstraint.FunctionDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Declarations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Declarations</em>' containment reference list.
	 * @see TTMCConstraint.TTMCConstraintPackage#getConstraintSpecification_FunctionDeclarations()
	 * @model containment="true"
	 * @generated
	 */
	EList<FunctionDeclaration> getFunctionDeclarations();

	/**
	 * Returns the value of the '<em><b>Basic Constraint Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link TTMCConstraint.BasicConstraintDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Basic Constraint Definitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basic Constraint Definitions</em>' containment reference list.
	 * @see TTMCConstraint.TTMCConstraintPackage#getConstraintSpecification_BasicConstraintDefinitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<BasicConstraintDefinition> getBasicConstraintDefinitions();

} // ConstraintSpecification
