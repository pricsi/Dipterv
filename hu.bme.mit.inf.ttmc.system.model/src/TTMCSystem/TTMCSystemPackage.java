/**
 */
package TTMCSystem;

import TTMCConstraint.TTMCConstraintPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see TTMCSystem.TTMCSystemFactory
 * @model kind="package"
 * @generated
 */
public interface TTMCSystemPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "TTMCSystem";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.inf.mit.bme.hu/ttmc/TTMCSystem";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "TTMCSystem";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TTMCSystemPackage eINSTANCE = TTMCSystem.impl.TTMCSystemPackageImpl.init();

	/**
	 * The meta object id for the '{@link TTMCSystem.impl.DefinitionDeclarationImpl <em>Definition Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCSystem.impl.DefinitionDeclarationImpl
	 * @see TTMCSystem.impl.TTMCSystemPackageImpl#getDefinitionDeclaration()
	 * @generated
	 */
	int DEFINITION_DECLARATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_DECLARATION__NAME = TTMCConstraintPackage.DEFINABLE_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_DECLARATION__TYPE = TTMCConstraintPackage.DEFINABLE_DECLARATION__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_DECLARATION__EXPRESSION = TTMCConstraintPackage.DEFINABLE_DECLARATION__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Definition Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_DECLARATION_FEATURE_COUNT = TTMCConstraintPackage.DEFINABLE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Definition Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_DECLARATION_OPERATION_COUNT = TTMCConstraintPackage.DEFINABLE_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCSystem.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCSystem.impl.VariableDeclarationImpl
	 * @see TTMCSystem.impl.TTMCSystemPackageImpl#getVariableDeclaration()
	 * @generated
	 */
	int VARIABLE_DECLARATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__NAME = TTMCConstraintPackage.DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__TYPE = TTMCConstraintPackage.DECLARATION__TYPE;

	/**
	 * The number of structural features of the '<em>Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_FEATURE_COUNT = TTMCConstraintPackage.DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_OPERATION_COUNT = TTMCConstraintPackage.DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCSystem.impl.SystemSpecificationImpl <em>System Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCSystem.impl.SystemSpecificationImpl
	 * @see TTMCSystem.impl.TTMCSystemPackageImpl#getSystemSpecification()
	 * @generated
	 */
	int SYSTEM_SPECIFICATION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_SPECIFICATION__NAME = TTMCConstraintPackage.CONSTRAINT_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Parameter Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_SPECIFICATION__PARAMETER_DECLARATIONS = TTMCConstraintPackage.CONSTRAINT_SPECIFICATION__PARAMETER_DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Type Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_SPECIFICATION__TYPE_DECLARATIONS = TTMCConstraintPackage.CONSTRAINT_SPECIFICATION__TYPE_DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Constant Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_SPECIFICATION__CONSTANT_DECLARATIONS = TTMCConstraintPackage.CONSTRAINT_SPECIFICATION__CONSTANT_DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Function Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_SPECIFICATION__FUNCTION_DECLARATIONS = TTMCConstraintPackage.CONSTRAINT_SPECIFICATION__FUNCTION_DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Basic Constraint Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_SPECIFICATION__BASIC_CONSTRAINT_DEFINITIONS = TTMCConstraintPackage.CONSTRAINT_SPECIFICATION__BASIC_CONSTRAINT_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>System Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_SPECIFICATION__SYSTEM_DECLARATIONS = TTMCConstraintPackage.CONSTRAINT_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_SPECIFICATION__PROPERTY_DECLARATIONS = TTMCConstraintPackage.CONSTRAINT_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>System Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_SPECIFICATION_FEATURE_COUNT = TTMCConstraintPackage.CONSTRAINT_SPECIFICATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>System Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_SPECIFICATION_OPERATION_COUNT = TTMCConstraintPackage.CONSTRAINT_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCSystem.impl.LocalVariableDeclarationImpl <em>Local Variable Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCSystem.impl.LocalVariableDeclarationImpl
	 * @see TTMCSystem.impl.TTMCSystemPackageImpl#getLocalVariableDeclaration()
	 * @generated
	 */
	int LOCAL_VARIABLE_DECLARATION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE_DECLARATION__NAME = VARIABLE_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE_DECLARATION__TYPE = VARIABLE_DECLARATION__TYPE;

	/**
	 * The number of structural features of the '<em>Local Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE_DECLARATION_FEATURE_COUNT = VARIABLE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Local Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE_DECLARATION_OPERATION_COUNT = VARIABLE_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCSystem.impl.GlobalVariableDeclarationImpl <em>Global Variable Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCSystem.impl.GlobalVariableDeclarationImpl
	 * @see TTMCSystem.impl.TTMCSystemPackageImpl#getGlobalVariableDeclaration()
	 * @generated
	 */
	int GLOBAL_VARIABLE_DECLARATION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE_DECLARATION__NAME = VARIABLE_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE_DECLARATION__TYPE = VARIABLE_DECLARATION__TYPE;

	/**
	 * The number of structural features of the '<em>Global Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE_DECLARATION_FEATURE_COUNT = VARIABLE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Global Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE_DECLARATION_OPERATION_COUNT = VARIABLE_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCSystem.impl.InputVariableDeclarationImpl <em>Input Variable Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCSystem.impl.InputVariableDeclarationImpl
	 * @see TTMCSystem.impl.TTMCSystemPackageImpl#getInputVariableDeclaration()
	 * @generated
	 */
	int INPUT_VARIABLE_DECLARATION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VARIABLE_DECLARATION__NAME = VARIABLE_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VARIABLE_DECLARATION__TYPE = VARIABLE_DECLARATION__TYPE;

	/**
	 * The number of structural features of the '<em>Input Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VARIABLE_DECLARATION_FEATURE_COUNT = VARIABLE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Input Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VARIABLE_DECLARATION_OPERATION_COUNT = VARIABLE_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCSystem.impl.OutputVariableDeclarationImpl <em>Output Variable Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCSystem.impl.OutputVariableDeclarationImpl
	 * @see TTMCSystem.impl.TTMCSystemPackageImpl#getOutputVariableDeclaration()
	 * @generated
	 */
	int OUTPUT_VARIABLE_DECLARATION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_VARIABLE_DECLARATION__NAME = VARIABLE_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_VARIABLE_DECLARATION__TYPE = VARIABLE_DECLARATION__TYPE;

	/**
	 * The number of structural features of the '<em>Output Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_VARIABLE_DECLARATION_FEATURE_COUNT = VARIABLE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Output Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_VARIABLE_DECLARATION_OPERATION_COUNT = VARIABLE_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCSystem.impl.SystemDeclarationImpl <em>System Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCSystem.impl.SystemDeclarationImpl
	 * @see TTMCSystem.impl.TTMCSystemPackageImpl#getSystemDeclaration()
	 * @generated
	 */
	int SYSTEM_DECLARATION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DECLARATION__NAME = TTMCConstraintPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameter Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DECLARATION__PARAMETER_DECLARATIONS = TTMCConstraintPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DECLARATION__SYSTEM = TTMCConstraintPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>System Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DECLARATION_FEATURE_COUNT = TTMCConstraintPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>System Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DECLARATION_OPERATION_COUNT = TTMCConstraintPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCSystem.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCSystem.impl.SystemImpl
	 * @see TTMCSystem.impl.TTMCSystemPackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 8;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TTMCSystem.impl.SystemDefinitionImpl <em>System Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCSystem.impl.SystemDefinitionImpl
	 * @see TTMCSystem.impl.TTMCSystemPackageImpl#getSystemDefinition()
	 * @generated
	 */
	int SYSTEM_DEFINITION = 9;

	/**
	 * The feature id for the '<em><b>Variable Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DEFINITION__VARIABLE_DECLARATIONS = SYSTEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Definition Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DEFINITION__DEFINITION_DECLARATIONS = SYSTEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>System Constraint Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DEFINITION__SYSTEM_CONSTRAINT_DEFINITIONS = SYSTEM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>System Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DEFINITION_FEATURE_COUNT = SYSTEM_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>System Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DEFINITION_OPERATION_COUNT = SYSTEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCSystem.impl.SystemReferenceImpl <em>System Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCSystem.impl.SystemReferenceImpl
	 * @see TTMCSystem.impl.TTMCSystemPackageImpl#getSystemReference()
	 * @generated
	 */
	int SYSTEM_REFERENCE = 10;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REFERENCE__PARAMETERS = SYSTEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REFERENCE__REFERENCE = SYSTEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>System Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REFERENCE_FEATURE_COUNT = SYSTEM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>System Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REFERENCE_OPERATION_COUNT = SYSTEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCSystem.impl.CompositeSystemImpl <em>Composite System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCSystem.impl.CompositeSystemImpl
	 * @see TTMCSystem.impl.TTMCSystemPackageImpl#getCompositeSystem()
	 * @generated
	 */
	int COMPOSITE_SYSTEM = 11;

	/**
	 * The feature id for the '<em><b>Left System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SYSTEM__LEFT_SYSTEM = SYSTEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SYSTEM__RIGHT_SYSTEM = SYSTEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Composite System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SYSTEM_FEATURE_COUNT = SYSTEM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Composite System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SYSTEM_OPERATION_COUNT = SYSTEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCSystem.impl.SynchronousCompositeSystemImpl <em>Synchronous Composite System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCSystem.impl.SynchronousCompositeSystemImpl
	 * @see TTMCSystem.impl.TTMCSystemPackageImpl#getSynchronousCompositeSystem()
	 * @generated
	 */
	int SYNCHRONOUS_COMPOSITE_SYSTEM = 12;

	/**
	 * The feature id for the '<em><b>Left System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_COMPOSITE_SYSTEM__LEFT_SYSTEM = COMPOSITE_SYSTEM__LEFT_SYSTEM;

	/**
	 * The feature id for the '<em><b>Right System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_COMPOSITE_SYSTEM__RIGHT_SYSTEM = COMPOSITE_SYSTEM__RIGHT_SYSTEM;

	/**
	 * The number of structural features of the '<em>Synchronous Composite System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_COMPOSITE_SYSTEM_FEATURE_COUNT = COMPOSITE_SYSTEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Synchronous Composite System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_COMPOSITE_SYSTEM_OPERATION_COUNT = COMPOSITE_SYSTEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCSystem.impl.AsynchronousCompositeSystemImpl <em>Asynchronous Composite System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCSystem.impl.AsynchronousCompositeSystemImpl
	 * @see TTMCSystem.impl.TTMCSystemPackageImpl#getAsynchronousCompositeSystem()
	 * @generated
	 */
	int ASYNCHRONOUS_COMPOSITE_SYSTEM = 13;

	/**
	 * The feature id for the '<em><b>Left System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCHRONOUS_COMPOSITE_SYSTEM__LEFT_SYSTEM = COMPOSITE_SYSTEM__LEFT_SYSTEM;

	/**
	 * The feature id for the '<em><b>Right System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCHRONOUS_COMPOSITE_SYSTEM__RIGHT_SYSTEM = COMPOSITE_SYSTEM__RIGHT_SYSTEM;

	/**
	 * The number of structural features of the '<em>Asynchronous Composite System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCHRONOUS_COMPOSITE_SYSTEM_FEATURE_COUNT = COMPOSITE_SYSTEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Asynchronous Composite System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCHRONOUS_COMPOSITE_SYSTEM_OPERATION_COUNT = COMPOSITE_SYSTEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCSystem.impl.MultiSystemImpl <em>Multi System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCSystem.impl.MultiSystemImpl
	 * @see TTMCSystem.impl.TTMCSystemPackageImpl#getMultiSystem()
	 * @generated
	 */
	int MULTI_SYSTEM = 14;

	/**
	 * The feature id for the '<em><b>Parameter Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_SYSTEM__PARAMETER_DECLARATIONS = SYSTEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_SYSTEM__SYSTEM = SYSTEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Multi System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_SYSTEM_FEATURE_COUNT = SYSTEM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Multi System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_SYSTEM_OPERATION_COUNT = SYSTEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCSystem.impl.SynchronousMultiSystemImpl <em>Synchronous Multi System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCSystem.impl.SynchronousMultiSystemImpl
	 * @see TTMCSystem.impl.TTMCSystemPackageImpl#getSynchronousMultiSystem()
	 * @generated
	 */
	int SYNCHRONOUS_MULTI_SYSTEM = 15;

	/**
	 * The feature id for the '<em><b>Parameter Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MULTI_SYSTEM__PARAMETER_DECLARATIONS = MULTI_SYSTEM__PARAMETER_DECLARATIONS;

	/**
	 * The feature id for the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MULTI_SYSTEM__SYSTEM = MULTI_SYSTEM__SYSTEM;

	/**
	 * The number of structural features of the '<em>Synchronous Multi System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MULTI_SYSTEM_FEATURE_COUNT = MULTI_SYSTEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Synchronous Multi System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MULTI_SYSTEM_OPERATION_COUNT = MULTI_SYSTEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCSystem.impl.AsynchronousMultiSystemImpl <em>Asynchronous Multi System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCSystem.impl.AsynchronousMultiSystemImpl
	 * @see TTMCSystem.impl.TTMCSystemPackageImpl#getAsynchronousMultiSystem()
	 * @generated
	 */
	int ASYNCHRONOUS_MULTI_SYSTEM = 16;

	/**
	 * The feature id for the '<em><b>Parameter Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCHRONOUS_MULTI_SYSTEM__PARAMETER_DECLARATIONS = MULTI_SYSTEM__PARAMETER_DECLARATIONS;

	/**
	 * The feature id for the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCHRONOUS_MULTI_SYSTEM__SYSTEM = MULTI_SYSTEM__SYSTEM;

	/**
	 * The number of structural features of the '<em>Asynchronous Multi System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCHRONOUS_MULTI_SYSTEM_FEATURE_COUNT = MULTI_SYSTEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Asynchronous Multi System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCHRONOUS_MULTI_SYSTEM_OPERATION_COUNT = MULTI_SYSTEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCSystem.impl.SystemConstraintDefinitionImpl <em>System Constraint Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCSystem.impl.SystemConstraintDefinitionImpl
	 * @see TTMCSystem.impl.TTMCSystemPackageImpl#getSystemConstraintDefinition()
	 * @generated
	 */
	int SYSTEM_CONSTRAINT_DEFINITION = 17;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONSTRAINT_DEFINITION__EXPRESSION = TTMCConstraintPackage.CONSTRAINT_DEFINITION__EXPRESSION;

	/**
	 * The number of structural features of the '<em>System Constraint Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONSTRAINT_DEFINITION_FEATURE_COUNT = TTMCConstraintPackage.CONSTRAINT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>System Constraint Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONSTRAINT_DEFINITION_OPERATION_COUNT = TTMCConstraintPackage.CONSTRAINT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCSystem.impl.InvariantConstraintDefinitionImpl <em>Invariant Constraint Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCSystem.impl.InvariantConstraintDefinitionImpl
	 * @see TTMCSystem.impl.TTMCSystemPackageImpl#getInvariantConstraintDefinition()
	 * @generated
	 */
	int INVARIANT_CONSTRAINT_DEFINITION = 18;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVARIANT_CONSTRAINT_DEFINITION__EXPRESSION = SYSTEM_CONSTRAINT_DEFINITION__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Invariant Constraint Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVARIANT_CONSTRAINT_DEFINITION_FEATURE_COUNT = SYSTEM_CONSTRAINT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Invariant Constraint Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVARIANT_CONSTRAINT_DEFINITION_OPERATION_COUNT = SYSTEM_CONSTRAINT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCSystem.impl.InitialConstraintDefinitionImpl <em>Initial Constraint Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCSystem.impl.InitialConstraintDefinitionImpl
	 * @see TTMCSystem.impl.TTMCSystemPackageImpl#getInitialConstraintDefinition()
	 * @generated
	 */
	int INITIAL_CONSTRAINT_DEFINITION = 19;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_CONSTRAINT_DEFINITION__EXPRESSION = SYSTEM_CONSTRAINT_DEFINITION__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Initial Constraint Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_CONSTRAINT_DEFINITION_FEATURE_COUNT = SYSTEM_CONSTRAINT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Initial Constraint Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_CONSTRAINT_DEFINITION_OPERATION_COUNT = SYSTEM_CONSTRAINT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCSystem.impl.TransitionConstraintDefinitionImpl <em>Transition Constraint Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCSystem.impl.TransitionConstraintDefinitionImpl
	 * @see TTMCSystem.impl.TTMCSystemPackageImpl#getTransitionConstraintDefinition()
	 * @generated
	 */
	int TRANSITION_CONSTRAINT_DEFINITION = 20;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_CONSTRAINT_DEFINITION__EXPRESSION = SYSTEM_CONSTRAINT_DEFINITION__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Transition Constraint Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_CONSTRAINT_DEFINITION_FEATURE_COUNT = SYSTEM_CONSTRAINT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Transition Constraint Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_CONSTRAINT_DEFINITION_OPERATION_COUNT = SYSTEM_CONSTRAINT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCSystem.impl.PropertyDeclarationImpl <em>Property Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCSystem.impl.PropertyDeclarationImpl
	 * @see TTMCSystem.impl.TTMCSystemPackageImpl#getPropertyDeclaration()
	 * @generated
	 */
	int PROPERTY_DECLARATION = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_DECLARATION__NAME = TTMCConstraintPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_DECLARATION__SYSTEM = TTMCConstraintPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_DECLARATION__EXPRESSION = TTMCConstraintPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Property Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_DECLARATION_FEATURE_COUNT = TTMCConstraintPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Property Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_DECLARATION_OPERATION_COUNT = TTMCConstraintPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link TTMCSystem.DefinitionDeclaration <em>Definition Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition Declaration</em>'.
	 * @see TTMCSystem.DefinitionDeclaration
	 * @generated
	 */
	EClass getDefinitionDeclaration();

	/**
	 * Returns the meta object for class '{@link TTMCSystem.VariableDeclaration <em>Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Declaration</em>'.
	 * @see TTMCSystem.VariableDeclaration
	 * @generated
	 */
	EClass getVariableDeclaration();

	/**
	 * Returns the meta object for class '{@link TTMCSystem.SystemSpecification <em>System Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Specification</em>'.
	 * @see TTMCSystem.SystemSpecification
	 * @generated
	 */
	EClass getSystemSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link TTMCSystem.SystemSpecification#getSystemDeclarations <em>System Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>System Declarations</em>'.
	 * @see TTMCSystem.SystemSpecification#getSystemDeclarations()
	 * @see #getSystemSpecification()
	 * @generated
	 */
	EReference getSystemSpecification_SystemDeclarations();

	/**
	 * Returns the meta object for the containment reference list '{@link TTMCSystem.SystemSpecification#getPropertyDeclarations <em>Property Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property Declarations</em>'.
	 * @see TTMCSystem.SystemSpecification#getPropertyDeclarations()
	 * @see #getSystemSpecification()
	 * @generated
	 */
	EReference getSystemSpecification_PropertyDeclarations();

	/**
	 * Returns the meta object for class '{@link TTMCSystem.LocalVariableDeclaration <em>Local Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Variable Declaration</em>'.
	 * @see TTMCSystem.LocalVariableDeclaration
	 * @generated
	 */
	EClass getLocalVariableDeclaration();

	/**
	 * Returns the meta object for class '{@link TTMCSystem.GlobalVariableDeclaration <em>Global Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Variable Declaration</em>'.
	 * @see TTMCSystem.GlobalVariableDeclaration
	 * @generated
	 */
	EClass getGlobalVariableDeclaration();

	/**
	 * Returns the meta object for class '{@link TTMCSystem.InputVariableDeclaration <em>Input Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Variable Declaration</em>'.
	 * @see TTMCSystem.InputVariableDeclaration
	 * @generated
	 */
	EClass getInputVariableDeclaration();

	/**
	 * Returns the meta object for class '{@link TTMCSystem.OutputVariableDeclaration <em>Output Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Variable Declaration</em>'.
	 * @see TTMCSystem.OutputVariableDeclaration
	 * @generated
	 */
	EClass getOutputVariableDeclaration();

	/**
	 * Returns the meta object for class '{@link TTMCSystem.SystemDeclaration <em>System Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Declaration</em>'.
	 * @see TTMCSystem.SystemDeclaration
	 * @generated
	 */
	EClass getSystemDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link TTMCSystem.SystemDeclaration#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>System</em>'.
	 * @see TTMCSystem.SystemDeclaration#getSystem()
	 * @see #getSystemDeclaration()
	 * @generated
	 */
	EReference getSystemDeclaration_System();

	/**
	 * Returns the meta object for class '{@link TTMCSystem.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see TTMCSystem.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for class '{@link TTMCSystem.SystemDefinition <em>System Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Definition</em>'.
	 * @see TTMCSystem.SystemDefinition
	 * @generated
	 */
	EClass getSystemDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link TTMCSystem.SystemDefinition#getVariableDeclarations <em>Variable Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable Declarations</em>'.
	 * @see TTMCSystem.SystemDefinition#getVariableDeclarations()
	 * @see #getSystemDefinition()
	 * @generated
	 */
	EReference getSystemDefinition_VariableDeclarations();

	/**
	 * Returns the meta object for the containment reference list '{@link TTMCSystem.SystemDefinition#getDefinitionDeclarations <em>Definition Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Definition Declarations</em>'.
	 * @see TTMCSystem.SystemDefinition#getDefinitionDeclarations()
	 * @see #getSystemDefinition()
	 * @generated
	 */
	EReference getSystemDefinition_DefinitionDeclarations();

	/**
	 * Returns the meta object for the containment reference list '{@link TTMCSystem.SystemDefinition#getSystemConstraintDefinitions <em>System Constraint Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>System Constraint Definitions</em>'.
	 * @see TTMCSystem.SystemDefinition#getSystemConstraintDefinitions()
	 * @see #getSystemDefinition()
	 * @generated
	 */
	EReference getSystemDefinition_SystemConstraintDefinitions();

	/**
	 * Returns the meta object for class '{@link TTMCSystem.SystemReference <em>System Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Reference</em>'.
	 * @see TTMCSystem.SystemReference
	 * @generated
	 */
	EClass getSystemReference();

	/**
	 * Returns the meta object for the reference '{@link TTMCSystem.SystemReference#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see TTMCSystem.SystemReference#getReference()
	 * @see #getSystemReference()
	 * @generated
	 */
	EReference getSystemReference_Reference();

	/**
	 * Returns the meta object for class '{@link TTMCSystem.CompositeSystem <em>Composite System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite System</em>'.
	 * @see TTMCSystem.CompositeSystem
	 * @generated
	 */
	EClass getCompositeSystem();

	/**
	 * Returns the meta object for the containment reference '{@link TTMCSystem.CompositeSystem#getLeftSystem <em>Left System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left System</em>'.
	 * @see TTMCSystem.CompositeSystem#getLeftSystem()
	 * @see #getCompositeSystem()
	 * @generated
	 */
	EReference getCompositeSystem_LeftSystem();

	/**
	 * Returns the meta object for the containment reference '{@link TTMCSystem.CompositeSystem#getRightSystem <em>Right System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right System</em>'.
	 * @see TTMCSystem.CompositeSystem#getRightSystem()
	 * @see #getCompositeSystem()
	 * @generated
	 */
	EReference getCompositeSystem_RightSystem();

	/**
	 * Returns the meta object for class '{@link TTMCSystem.SynchronousCompositeSystem <em>Synchronous Composite System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synchronous Composite System</em>'.
	 * @see TTMCSystem.SynchronousCompositeSystem
	 * @generated
	 */
	EClass getSynchronousCompositeSystem();

	/**
	 * Returns the meta object for class '{@link TTMCSystem.AsynchronousCompositeSystem <em>Asynchronous Composite System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asynchronous Composite System</em>'.
	 * @see TTMCSystem.AsynchronousCompositeSystem
	 * @generated
	 */
	EClass getAsynchronousCompositeSystem();

	/**
	 * Returns the meta object for class '{@link TTMCSystem.MultiSystem <em>Multi System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi System</em>'.
	 * @see TTMCSystem.MultiSystem
	 * @generated
	 */
	EClass getMultiSystem();

	/**
	 * Returns the meta object for the containment reference '{@link TTMCSystem.MultiSystem#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>System</em>'.
	 * @see TTMCSystem.MultiSystem#getSystem()
	 * @see #getMultiSystem()
	 * @generated
	 */
	EReference getMultiSystem_System();

	/**
	 * Returns the meta object for class '{@link TTMCSystem.SynchronousMultiSystem <em>Synchronous Multi System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synchronous Multi System</em>'.
	 * @see TTMCSystem.SynchronousMultiSystem
	 * @generated
	 */
	EClass getSynchronousMultiSystem();

	/**
	 * Returns the meta object for class '{@link TTMCSystem.AsynchronousMultiSystem <em>Asynchronous Multi System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asynchronous Multi System</em>'.
	 * @see TTMCSystem.AsynchronousMultiSystem
	 * @generated
	 */
	EClass getAsynchronousMultiSystem();

	/**
	 * Returns the meta object for class '{@link TTMCSystem.SystemConstraintDefinition <em>System Constraint Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Constraint Definition</em>'.
	 * @see TTMCSystem.SystemConstraintDefinition
	 * @generated
	 */
	EClass getSystemConstraintDefinition();

	/**
	 * Returns the meta object for class '{@link TTMCSystem.InvariantConstraintDefinition <em>Invariant Constraint Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invariant Constraint Definition</em>'.
	 * @see TTMCSystem.InvariantConstraintDefinition
	 * @generated
	 */
	EClass getInvariantConstraintDefinition();

	/**
	 * Returns the meta object for class '{@link TTMCSystem.InitialConstraintDefinition <em>Initial Constraint Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial Constraint Definition</em>'.
	 * @see TTMCSystem.InitialConstraintDefinition
	 * @generated
	 */
	EClass getInitialConstraintDefinition();

	/**
	 * Returns the meta object for class '{@link TTMCSystem.TransitionConstraintDefinition <em>Transition Constraint Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Constraint Definition</em>'.
	 * @see TTMCSystem.TransitionConstraintDefinition
	 * @generated
	 */
	EClass getTransitionConstraintDefinition();

	/**
	 * Returns the meta object for class '{@link TTMCSystem.PropertyDeclaration <em>Property Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Declaration</em>'.
	 * @see TTMCSystem.PropertyDeclaration
	 * @generated
	 */
	EClass getPropertyDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link TTMCSystem.PropertyDeclaration#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>System</em>'.
	 * @see TTMCSystem.PropertyDeclaration#getSystem()
	 * @see #getPropertyDeclaration()
	 * @generated
	 */
	EReference getPropertyDeclaration_System();

	/**
	 * Returns the meta object for the containment reference '{@link TTMCSystem.PropertyDeclaration#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see TTMCSystem.PropertyDeclaration#getExpression()
	 * @see #getPropertyDeclaration()
	 * @generated
	 */
	EReference getPropertyDeclaration_Expression();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TTMCSystemFactory getTTMCSystemFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link TTMCSystem.impl.DefinitionDeclarationImpl <em>Definition Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCSystem.impl.DefinitionDeclarationImpl
		 * @see TTMCSystem.impl.TTMCSystemPackageImpl#getDefinitionDeclaration()
		 * @generated
		 */
		EClass DEFINITION_DECLARATION = eINSTANCE.getDefinitionDeclaration();

		/**
		 * The meta object literal for the '{@link TTMCSystem.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCSystem.impl.VariableDeclarationImpl
		 * @see TTMCSystem.impl.TTMCSystemPackageImpl#getVariableDeclaration()
		 * @generated
		 */
		EClass VARIABLE_DECLARATION = eINSTANCE.getVariableDeclaration();

		/**
		 * The meta object literal for the '{@link TTMCSystem.impl.SystemSpecificationImpl <em>System Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCSystem.impl.SystemSpecificationImpl
		 * @see TTMCSystem.impl.TTMCSystemPackageImpl#getSystemSpecification()
		 * @generated
		 */
		EClass SYSTEM_SPECIFICATION = eINSTANCE.getSystemSpecification();

		/**
		 * The meta object literal for the '<em><b>System Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_SPECIFICATION__SYSTEM_DECLARATIONS = eINSTANCE.getSystemSpecification_SystemDeclarations();

		/**
		 * The meta object literal for the '<em><b>Property Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_SPECIFICATION__PROPERTY_DECLARATIONS = eINSTANCE.getSystemSpecification_PropertyDeclarations();

		/**
		 * The meta object literal for the '{@link TTMCSystem.impl.LocalVariableDeclarationImpl <em>Local Variable Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCSystem.impl.LocalVariableDeclarationImpl
		 * @see TTMCSystem.impl.TTMCSystemPackageImpl#getLocalVariableDeclaration()
		 * @generated
		 */
		EClass LOCAL_VARIABLE_DECLARATION = eINSTANCE.getLocalVariableDeclaration();

		/**
		 * The meta object literal for the '{@link TTMCSystem.impl.GlobalVariableDeclarationImpl <em>Global Variable Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCSystem.impl.GlobalVariableDeclarationImpl
		 * @see TTMCSystem.impl.TTMCSystemPackageImpl#getGlobalVariableDeclaration()
		 * @generated
		 */
		EClass GLOBAL_VARIABLE_DECLARATION = eINSTANCE.getGlobalVariableDeclaration();

		/**
		 * The meta object literal for the '{@link TTMCSystem.impl.InputVariableDeclarationImpl <em>Input Variable Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCSystem.impl.InputVariableDeclarationImpl
		 * @see TTMCSystem.impl.TTMCSystemPackageImpl#getInputVariableDeclaration()
		 * @generated
		 */
		EClass INPUT_VARIABLE_DECLARATION = eINSTANCE.getInputVariableDeclaration();

		/**
		 * The meta object literal for the '{@link TTMCSystem.impl.OutputVariableDeclarationImpl <em>Output Variable Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCSystem.impl.OutputVariableDeclarationImpl
		 * @see TTMCSystem.impl.TTMCSystemPackageImpl#getOutputVariableDeclaration()
		 * @generated
		 */
		EClass OUTPUT_VARIABLE_DECLARATION = eINSTANCE.getOutputVariableDeclaration();

		/**
		 * The meta object literal for the '{@link TTMCSystem.impl.SystemDeclarationImpl <em>System Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCSystem.impl.SystemDeclarationImpl
		 * @see TTMCSystem.impl.TTMCSystemPackageImpl#getSystemDeclaration()
		 * @generated
		 */
		EClass SYSTEM_DECLARATION = eINSTANCE.getSystemDeclaration();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_DECLARATION__SYSTEM = eINSTANCE.getSystemDeclaration_System();

		/**
		 * The meta object literal for the '{@link TTMCSystem.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCSystem.impl.SystemImpl
		 * @see TTMCSystem.impl.TTMCSystemPackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '{@link TTMCSystem.impl.SystemDefinitionImpl <em>System Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCSystem.impl.SystemDefinitionImpl
		 * @see TTMCSystem.impl.TTMCSystemPackageImpl#getSystemDefinition()
		 * @generated
		 */
		EClass SYSTEM_DEFINITION = eINSTANCE.getSystemDefinition();

		/**
		 * The meta object literal for the '<em><b>Variable Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_DEFINITION__VARIABLE_DECLARATIONS = eINSTANCE.getSystemDefinition_VariableDeclarations();

		/**
		 * The meta object literal for the '<em><b>Definition Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_DEFINITION__DEFINITION_DECLARATIONS = eINSTANCE.getSystemDefinition_DefinitionDeclarations();

		/**
		 * The meta object literal for the '<em><b>System Constraint Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_DEFINITION__SYSTEM_CONSTRAINT_DEFINITIONS = eINSTANCE.getSystemDefinition_SystemConstraintDefinitions();

		/**
		 * The meta object literal for the '{@link TTMCSystem.impl.SystemReferenceImpl <em>System Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCSystem.impl.SystemReferenceImpl
		 * @see TTMCSystem.impl.TTMCSystemPackageImpl#getSystemReference()
		 * @generated
		 */
		EClass SYSTEM_REFERENCE = eINSTANCE.getSystemReference();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_REFERENCE__REFERENCE = eINSTANCE.getSystemReference_Reference();

		/**
		 * The meta object literal for the '{@link TTMCSystem.impl.CompositeSystemImpl <em>Composite System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCSystem.impl.CompositeSystemImpl
		 * @see TTMCSystem.impl.TTMCSystemPackageImpl#getCompositeSystem()
		 * @generated
		 */
		EClass COMPOSITE_SYSTEM = eINSTANCE.getCompositeSystem();

		/**
		 * The meta object literal for the '<em><b>Left System</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_SYSTEM__LEFT_SYSTEM = eINSTANCE.getCompositeSystem_LeftSystem();

		/**
		 * The meta object literal for the '<em><b>Right System</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_SYSTEM__RIGHT_SYSTEM = eINSTANCE.getCompositeSystem_RightSystem();

		/**
		 * The meta object literal for the '{@link TTMCSystem.impl.SynchronousCompositeSystemImpl <em>Synchronous Composite System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCSystem.impl.SynchronousCompositeSystemImpl
		 * @see TTMCSystem.impl.TTMCSystemPackageImpl#getSynchronousCompositeSystem()
		 * @generated
		 */
		EClass SYNCHRONOUS_COMPOSITE_SYSTEM = eINSTANCE.getSynchronousCompositeSystem();

		/**
		 * The meta object literal for the '{@link TTMCSystem.impl.AsynchronousCompositeSystemImpl <em>Asynchronous Composite System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCSystem.impl.AsynchronousCompositeSystemImpl
		 * @see TTMCSystem.impl.TTMCSystemPackageImpl#getAsynchronousCompositeSystem()
		 * @generated
		 */
		EClass ASYNCHRONOUS_COMPOSITE_SYSTEM = eINSTANCE.getAsynchronousCompositeSystem();

		/**
		 * The meta object literal for the '{@link TTMCSystem.impl.MultiSystemImpl <em>Multi System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCSystem.impl.MultiSystemImpl
		 * @see TTMCSystem.impl.TTMCSystemPackageImpl#getMultiSystem()
		 * @generated
		 */
		EClass MULTI_SYSTEM = eINSTANCE.getMultiSystem();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_SYSTEM__SYSTEM = eINSTANCE.getMultiSystem_System();

		/**
		 * The meta object literal for the '{@link TTMCSystem.impl.SynchronousMultiSystemImpl <em>Synchronous Multi System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCSystem.impl.SynchronousMultiSystemImpl
		 * @see TTMCSystem.impl.TTMCSystemPackageImpl#getSynchronousMultiSystem()
		 * @generated
		 */
		EClass SYNCHRONOUS_MULTI_SYSTEM = eINSTANCE.getSynchronousMultiSystem();

		/**
		 * The meta object literal for the '{@link TTMCSystem.impl.AsynchronousMultiSystemImpl <em>Asynchronous Multi System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCSystem.impl.AsynchronousMultiSystemImpl
		 * @see TTMCSystem.impl.TTMCSystemPackageImpl#getAsynchronousMultiSystem()
		 * @generated
		 */
		EClass ASYNCHRONOUS_MULTI_SYSTEM = eINSTANCE.getAsynchronousMultiSystem();

		/**
		 * The meta object literal for the '{@link TTMCSystem.impl.SystemConstraintDefinitionImpl <em>System Constraint Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCSystem.impl.SystemConstraintDefinitionImpl
		 * @see TTMCSystem.impl.TTMCSystemPackageImpl#getSystemConstraintDefinition()
		 * @generated
		 */
		EClass SYSTEM_CONSTRAINT_DEFINITION = eINSTANCE.getSystemConstraintDefinition();

		/**
		 * The meta object literal for the '{@link TTMCSystem.impl.InvariantConstraintDefinitionImpl <em>Invariant Constraint Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCSystem.impl.InvariantConstraintDefinitionImpl
		 * @see TTMCSystem.impl.TTMCSystemPackageImpl#getInvariantConstraintDefinition()
		 * @generated
		 */
		EClass INVARIANT_CONSTRAINT_DEFINITION = eINSTANCE.getInvariantConstraintDefinition();

		/**
		 * The meta object literal for the '{@link TTMCSystem.impl.InitialConstraintDefinitionImpl <em>Initial Constraint Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCSystem.impl.InitialConstraintDefinitionImpl
		 * @see TTMCSystem.impl.TTMCSystemPackageImpl#getInitialConstraintDefinition()
		 * @generated
		 */
		EClass INITIAL_CONSTRAINT_DEFINITION = eINSTANCE.getInitialConstraintDefinition();

		/**
		 * The meta object literal for the '{@link TTMCSystem.impl.TransitionConstraintDefinitionImpl <em>Transition Constraint Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCSystem.impl.TransitionConstraintDefinitionImpl
		 * @see TTMCSystem.impl.TTMCSystemPackageImpl#getTransitionConstraintDefinition()
		 * @generated
		 */
		EClass TRANSITION_CONSTRAINT_DEFINITION = eINSTANCE.getTransitionConstraintDefinition();

		/**
		 * The meta object literal for the '{@link TTMCSystem.impl.PropertyDeclarationImpl <em>Property Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCSystem.impl.PropertyDeclarationImpl
		 * @see TTMCSystem.impl.TTMCSystemPackageImpl#getPropertyDeclaration()
		 * @generated
		 */
		EClass PROPERTY_DECLARATION = eINSTANCE.getPropertyDeclaration();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_DECLARATION__SYSTEM = eINSTANCE.getPropertyDeclaration_System();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_DECLARATION__EXPRESSION = eINSTANCE.getPropertyDeclaration_Expression();

	}

} //TTMCSystemPackage
