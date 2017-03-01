/**
 */
package TTMCHybrid;

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
 * @see TTMCHybrid.TTMCHybridFactory
 * @model kind="package"
 * @generated
 */
public interface TTMCHybridPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "TTMCHybrid";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.inf.mit.bme.hu/ttmc/TTMCHybrid";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "TTMCHybrid";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TTMCHybridPackage eINSTANCE = TTMCHybrid.impl.TTMCHybridPackageImpl.init();

	/**
	 * The meta object id for the '{@link TTMCHybrid.impl.HybridSpecificationImpl <em>Hybrid Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCHybrid.impl.HybridSpecificationImpl
	 * @see TTMCHybrid.impl.TTMCHybridPackageImpl#getHybridSpecification()
	 * @generated
	 */
	int HYBRID_SPECIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_SPECIFICATION__NAME = TTMCConstraintPackage.CONSTRAINT_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Parameter Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_SPECIFICATION__PARAMETER_DECLARATIONS = TTMCConstraintPackage.CONSTRAINT_SPECIFICATION__PARAMETER_DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Type Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_SPECIFICATION__TYPE_DECLARATIONS = TTMCConstraintPackage.CONSTRAINT_SPECIFICATION__TYPE_DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Constant Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_SPECIFICATION__CONSTANT_DECLARATIONS = TTMCConstraintPackage.CONSTRAINT_SPECIFICATION__CONSTANT_DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Function Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_SPECIFICATION__FUNCTION_DECLARATIONS = TTMCConstraintPackage.CONSTRAINT_SPECIFICATION__FUNCTION_DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Basic Constraint Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_SPECIFICATION__BASIC_CONSTRAINT_DEFINITIONS = TTMCConstraintPackage.CONSTRAINT_SPECIFICATION__BASIC_CONSTRAINT_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Hybrid Automaton Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_SPECIFICATION__HYBRID_AUTOMATON_DECLARATIONS = TTMCConstraintPackage.CONSTRAINT_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_SPECIFICATION__PROPERTY_DECLARATIONS = TTMCConstraintPackage.CONSTRAINT_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Hybrid Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_SPECIFICATION_FEATURE_COUNT = TTMCConstraintPackage.CONSTRAINT_SPECIFICATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Hybrid Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_SPECIFICATION_OPERATION_COUNT = TTMCConstraintPackage.CONSTRAINT_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCHybrid.impl.ClockTypeDefinitionImpl <em>Clock Type Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCHybrid.impl.ClockTypeDefinitionImpl
	 * @see TTMCHybrid.impl.TTMCHybridPackageImpl#getClockTypeDefinition()
	 * @generated
	 */
	int CLOCK_TYPE_DEFINITION = 1;

	/**
	 * The number of structural features of the '<em>Clock Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_TYPE_DEFINITION_FEATURE_COUNT = TTMCConstraintPackage.BASIC_TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Clock Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_TYPE_DEFINITION_OPERATION_COUNT = TTMCConstraintPackage.BASIC_TYPE_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCHybrid.impl.DotExpressionImpl <em>Dot Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCHybrid.impl.DotExpressionImpl
	 * @see TTMCHybrid.impl.TTMCHybridPackageImpl#getDotExpression()
	 * @generated
	 */
	int DOT_EXPRESSION = 2;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_EXPRESSION__OPERAND = TTMCConstraintPackage.UNARY_EXPRESSION__OPERAND;

	/**
	 * The number of structural features of the '<em>Dot Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_EXPRESSION_FEATURE_COUNT = TTMCConstraintPackage.UNARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dot Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_EXPRESSION_OPERATION_COUNT = TTMCConstraintPackage.UNARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCHybrid.impl.LocationReferenceExpressionImpl <em>Location Reference Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCHybrid.impl.LocationReferenceExpressionImpl
	 * @see TTMCHybrid.impl.TTMCHybridPackageImpl#getLocationReferenceExpression()
	 * @generated
	 */
	int LOCATION_REFERENCE_EXPRESSION = 3;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_REFERENCE_EXPRESSION__LOCATION = TTMCConstraintPackage.NULLARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Location Reference Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_REFERENCE_EXPRESSION_FEATURE_COUNT = TTMCConstraintPackage.NULLARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Location Reference Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_REFERENCE_EXPRESSION_OPERATION_COUNT = TTMCConstraintPackage.NULLARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCHybrid.impl.HybridAutomatonImpl <em>Hybrid Automaton</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCHybrid.impl.HybridAutomatonImpl
	 * @see TTMCHybrid.impl.TTMCHybridPackageImpl#getHybridAutomaton()
	 * @generated
	 */
	int HYBRID_AUTOMATON = 4;

	/**
	 * The number of structural features of the '<em>Hybrid Automaton</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_AUTOMATON_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Hybrid Automaton</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_AUTOMATON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TTMCHybrid.impl.HybridAutomatonDeclarationImpl <em>Hybrid Automaton Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCHybrid.impl.HybridAutomatonDeclarationImpl
	 * @see TTMCHybrid.impl.TTMCHybridPackageImpl#getHybridAutomatonDeclaration()
	 * @generated
	 */
	int HYBRID_AUTOMATON_DECLARATION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_AUTOMATON_DECLARATION__NAME = TTMCConstraintPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameter Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_AUTOMATON_DECLARATION__PARAMETER_DECLARATIONS = TTMCConstraintPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hybrid Automaton</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_AUTOMATON_DECLARATION__HYBRID_AUTOMATON = TTMCConstraintPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Hybrid Automaton Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_AUTOMATON_DECLARATION_FEATURE_COUNT = TTMCConstraintPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Hybrid Automaton Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_AUTOMATON_DECLARATION_OPERATION_COUNT = TTMCConstraintPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCHybrid.impl.HybridAutomatonReferenceImpl <em>Hybrid Automaton Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCHybrid.impl.HybridAutomatonReferenceImpl
	 * @see TTMCHybrid.impl.TTMCHybridPackageImpl#getHybridAutomatonReference()
	 * @generated
	 */
	int HYBRID_AUTOMATON_REFERENCE = 6;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_AUTOMATON_REFERENCE__PARAMETERS = HYBRID_AUTOMATON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_AUTOMATON_REFERENCE__DECLARATION = HYBRID_AUTOMATON_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Hybrid Automaton Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_AUTOMATON_REFERENCE_FEATURE_COUNT = HYBRID_AUTOMATON_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Hybrid Automaton Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_AUTOMATON_REFERENCE_OPERATION_COUNT = HYBRID_AUTOMATON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCHybrid.impl.HybridAutomatonDefinitionImpl <em>Hybrid Automaton Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCHybrid.impl.HybridAutomatonDefinitionImpl
	 * @see TTMCHybrid.impl.TTMCHybridPackageImpl#getHybridAutomatonDefinition()
	 * @generated
	 */
	int HYBRID_AUTOMATON_DEFINITION = 7;

	/**
	 * The feature id for the '<em><b>Variable Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_AUTOMATON_DEFINITION__VARIABLE_DECLARATIONS = HYBRID_AUTOMATON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_AUTOMATON_DEFINITION__LOCATIONS = HYBRID_AUTOMATON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_AUTOMATON_DEFINITION__TRANSITIONS = HYBRID_AUTOMATON_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Hybrid Automaton Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_AUTOMATON_DEFINITION_FEATURE_COUNT = HYBRID_AUTOMATON_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Hybrid Automaton Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_AUTOMATON_DEFINITION_OPERATION_COUNT = HYBRID_AUTOMATON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCHybrid.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCHybrid.impl.VariableDeclarationImpl
	 * @see TTMCHybrid.impl.TTMCHybridPackageImpl#getVariableDeclaration()
	 * @generated
	 */
	int VARIABLE_DECLARATION = 8;

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
	 * The meta object id for the '{@link TTMCHybrid.impl.LocalVariableDeclarationImpl <em>Local Variable Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCHybrid.impl.LocalVariableDeclarationImpl
	 * @see TTMCHybrid.impl.TTMCHybridPackageImpl#getLocalVariableDeclaration()
	 * @generated
	 */
	int LOCAL_VARIABLE_DECLARATION = 9;

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
	 * The meta object id for the '{@link TTMCHybrid.impl.GlobalVariableDeclarationImpl <em>Global Variable Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCHybrid.impl.GlobalVariableDeclarationImpl
	 * @see TTMCHybrid.impl.TTMCHybridPackageImpl#getGlobalVariableDeclaration()
	 * @generated
	 */
	int GLOBAL_VARIABLE_DECLARATION = 10;

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
	 * The meta object id for the '{@link TTMCHybrid.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCHybrid.impl.LocationImpl
	 * @see TTMCHybrid.impl.TTMCHybridPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__NAME = TTMCConstraintPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__CONDITIONS = TTMCConstraintPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = TTMCConstraintPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = TTMCConstraintPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCHybrid.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCHybrid.impl.ConditionImpl
	 * @see TTMCHybrid.impl.TTMCHybridPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 12;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__EXPRESSION = 0;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TTMCHybrid.impl.InitialConditionImpl <em>Initial Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCHybrid.impl.InitialConditionImpl
	 * @see TTMCHybrid.impl.TTMCHybridPackageImpl#getInitialCondition()
	 * @generated
	 */
	int INITIAL_CONDITION = 13;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_CONDITION__EXPRESSION = CONDITION__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Initial Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Initial Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCHybrid.impl.InvariantConditionImpl <em>Invariant Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCHybrid.impl.InvariantConditionImpl
	 * @see TTMCHybrid.impl.TTMCHybridPackageImpl#getInvariantCondition()
	 * @generated
	 */
	int INVARIANT_CONDITION = 14;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVARIANT_CONDITION__EXPRESSION = CONDITION__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Invariant Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVARIANT_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Invariant Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVARIANT_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCHybrid.impl.FlowConditionImpl <em>Flow Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCHybrid.impl.FlowConditionImpl
	 * @see TTMCHybrid.impl.TTMCHybridPackageImpl#getFlowCondition()
	 * @generated
	 */
	int FLOW_CONDITION = 15;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_CONDITION__EXPRESSION = CONDITION__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Flow Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Flow Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCHybrid.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCHybrid.impl.TransitionImpl
	 * @see TTMCHybrid.impl.TTMCHybridPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 16;

	/**
	 * The feature id for the '<em><b>Parameter Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__PARAMETER_DECLARATIONS = TTMCConstraintPackage.PARAMETRIC_ELEMENT__PARAMETER_DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SOURCE = TTMCConstraintPackage.PARAMETRIC_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET = TTMCConstraintPackage.PARAMETRIC_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Guards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__GUARDS = TTMCConstraintPackage.PARAMETRIC_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ASSIGNMENTS = TTMCConstraintPackage.PARAMETRIC_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = TTMCConstraintPackage.PARAMETRIC_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = TTMCConstraintPackage.PARAMETRIC_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCHybrid.impl.AssignmentImpl <em>Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCHybrid.impl.AssignmentImpl
	 * @see TTMCHybrid.impl.TTMCHybridPackageImpl#getAssignment()
	 * @generated
	 */
	int ASSIGNMENT = 17;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__LHS = 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__RHS = 1;

	/**
	 * The number of structural features of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link TTMCHybrid.impl.PropertyDeclarationImpl <em>Property Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCHybrid.impl.PropertyDeclarationImpl
	 * @see TTMCHybrid.impl.TTMCHybridPackageImpl#getPropertyDeclaration()
	 * @generated
	 */
	int PROPERTY_DECLARATION = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_DECLARATION__NAME = TTMCConstraintPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Hybrid Automaton</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_DECLARATION__HYBRID_AUTOMATON = TTMCConstraintPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

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
	 * Returns the meta object for class '{@link TTMCHybrid.HybridSpecification <em>Hybrid Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hybrid Specification</em>'.
	 * @see TTMCHybrid.HybridSpecification
	 * @generated
	 */
	EClass getHybridSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link TTMCHybrid.HybridSpecification#getHybridAutomatonDeclarations <em>Hybrid Automaton Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hybrid Automaton Declarations</em>'.
	 * @see TTMCHybrid.HybridSpecification#getHybridAutomatonDeclarations()
	 * @see #getHybridSpecification()
	 * @generated
	 */
	EReference getHybridSpecification_HybridAutomatonDeclarations();

	/**
	 * Returns the meta object for the containment reference list '{@link TTMCHybrid.HybridSpecification#getPropertyDeclarations <em>Property Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property Declarations</em>'.
	 * @see TTMCHybrid.HybridSpecification#getPropertyDeclarations()
	 * @see #getHybridSpecification()
	 * @generated
	 */
	EReference getHybridSpecification_PropertyDeclarations();

	/**
	 * Returns the meta object for class '{@link TTMCHybrid.ClockTypeDefinition <em>Clock Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clock Type Definition</em>'.
	 * @see TTMCHybrid.ClockTypeDefinition
	 * @generated
	 */
	EClass getClockTypeDefinition();

	/**
	 * Returns the meta object for class '{@link TTMCHybrid.DotExpression <em>Dot Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dot Expression</em>'.
	 * @see TTMCHybrid.DotExpression
	 * @generated
	 */
	EClass getDotExpression();

	/**
	 * Returns the meta object for class '{@link TTMCHybrid.LocationReferenceExpression <em>Location Reference Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location Reference Expression</em>'.
	 * @see TTMCHybrid.LocationReferenceExpression
	 * @generated
	 */
	EClass getLocationReferenceExpression();

	/**
	 * Returns the meta object for the reference '{@link TTMCHybrid.LocationReferenceExpression#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see TTMCHybrid.LocationReferenceExpression#getLocation()
	 * @see #getLocationReferenceExpression()
	 * @generated
	 */
	EReference getLocationReferenceExpression_Location();

	/**
	 * Returns the meta object for class '{@link TTMCHybrid.HybridAutomaton <em>Hybrid Automaton</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hybrid Automaton</em>'.
	 * @see TTMCHybrid.HybridAutomaton
	 * @generated
	 */
	EClass getHybridAutomaton();

	/**
	 * Returns the meta object for class '{@link TTMCHybrid.HybridAutomatonDeclaration <em>Hybrid Automaton Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hybrid Automaton Declaration</em>'.
	 * @see TTMCHybrid.HybridAutomatonDeclaration
	 * @generated
	 */
	EClass getHybridAutomatonDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link TTMCHybrid.HybridAutomatonDeclaration#getHybridAutomaton <em>Hybrid Automaton</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hybrid Automaton</em>'.
	 * @see TTMCHybrid.HybridAutomatonDeclaration#getHybridAutomaton()
	 * @see #getHybridAutomatonDeclaration()
	 * @generated
	 */
	EReference getHybridAutomatonDeclaration_HybridAutomaton();

	/**
	 * Returns the meta object for class '{@link TTMCHybrid.HybridAutomatonReference <em>Hybrid Automaton Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hybrid Automaton Reference</em>'.
	 * @see TTMCHybrid.HybridAutomatonReference
	 * @generated
	 */
	EClass getHybridAutomatonReference();

	/**
	 * Returns the meta object for the reference '{@link TTMCHybrid.HybridAutomatonReference#getDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Declaration</em>'.
	 * @see TTMCHybrid.HybridAutomatonReference#getDeclaration()
	 * @see #getHybridAutomatonReference()
	 * @generated
	 */
	EReference getHybridAutomatonReference_Declaration();

	/**
	 * Returns the meta object for class '{@link TTMCHybrid.HybridAutomatonDefinition <em>Hybrid Automaton Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hybrid Automaton Definition</em>'.
	 * @see TTMCHybrid.HybridAutomatonDefinition
	 * @generated
	 */
	EClass getHybridAutomatonDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link TTMCHybrid.HybridAutomatonDefinition#getVariableDeclarations <em>Variable Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable Declarations</em>'.
	 * @see TTMCHybrid.HybridAutomatonDefinition#getVariableDeclarations()
	 * @see #getHybridAutomatonDefinition()
	 * @generated
	 */
	EReference getHybridAutomatonDefinition_VariableDeclarations();

	/**
	 * Returns the meta object for the containment reference list '{@link TTMCHybrid.HybridAutomatonDefinition#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Locations</em>'.
	 * @see TTMCHybrid.HybridAutomatonDefinition#getLocations()
	 * @see #getHybridAutomatonDefinition()
	 * @generated
	 */
	EReference getHybridAutomatonDefinition_Locations();

	/**
	 * Returns the meta object for the containment reference list '{@link TTMCHybrid.HybridAutomatonDefinition#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see TTMCHybrid.HybridAutomatonDefinition#getTransitions()
	 * @see #getHybridAutomatonDefinition()
	 * @generated
	 */
	EReference getHybridAutomatonDefinition_Transitions();

	/**
	 * Returns the meta object for class '{@link TTMCHybrid.VariableDeclaration <em>Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Declaration</em>'.
	 * @see TTMCHybrid.VariableDeclaration
	 * @generated
	 */
	EClass getVariableDeclaration();

	/**
	 * Returns the meta object for class '{@link TTMCHybrid.LocalVariableDeclaration <em>Local Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Variable Declaration</em>'.
	 * @see TTMCHybrid.LocalVariableDeclaration
	 * @generated
	 */
	EClass getLocalVariableDeclaration();

	/**
	 * Returns the meta object for class '{@link TTMCHybrid.GlobalVariableDeclaration <em>Global Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Variable Declaration</em>'.
	 * @see TTMCHybrid.GlobalVariableDeclaration
	 * @generated
	 */
	EClass getGlobalVariableDeclaration();

	/**
	 * Returns the meta object for class '{@link TTMCHybrid.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see TTMCHybrid.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the containment reference list '{@link TTMCHybrid.Location#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see TTMCHybrid.Location#getConditions()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_Conditions();

	/**
	 * Returns the meta object for class '{@link TTMCHybrid.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see TTMCHybrid.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the containment reference '{@link TTMCHybrid.Condition#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see TTMCHybrid.Condition#getExpression()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Expression();

	/**
	 * Returns the meta object for class '{@link TTMCHybrid.InitialCondition <em>Initial Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial Condition</em>'.
	 * @see TTMCHybrid.InitialCondition
	 * @generated
	 */
	EClass getInitialCondition();

	/**
	 * Returns the meta object for class '{@link TTMCHybrid.InvariantCondition <em>Invariant Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invariant Condition</em>'.
	 * @see TTMCHybrid.InvariantCondition
	 * @generated
	 */
	EClass getInvariantCondition();

	/**
	 * Returns the meta object for class '{@link TTMCHybrid.FlowCondition <em>Flow Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Condition</em>'.
	 * @see TTMCHybrid.FlowCondition
	 * @generated
	 */
	EClass getFlowCondition();

	/**
	 * Returns the meta object for class '{@link TTMCHybrid.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see TTMCHybrid.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference '{@link TTMCHybrid.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see TTMCHybrid.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Source();

	/**
	 * Returns the meta object for the reference '{@link TTMCHybrid.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see TTMCHybrid.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Target();

	/**
	 * Returns the meta object for the containment reference list '{@link TTMCHybrid.Transition#getGuards <em>Guards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Guards</em>'.
	 * @see TTMCHybrid.Transition#getGuards()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Guards();

	/**
	 * Returns the meta object for the containment reference list '{@link TTMCHybrid.Transition#getAssignments <em>Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assignments</em>'.
	 * @see TTMCHybrid.Transition#getAssignments()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Assignments();

	/**
	 * Returns the meta object for class '{@link TTMCHybrid.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment</em>'.
	 * @see TTMCHybrid.Assignment
	 * @generated
	 */
	EClass getAssignment();

	/**
	 * Returns the meta object for the containment reference '{@link TTMCHybrid.Assignment#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see TTMCHybrid.Assignment#getLhs()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_Lhs();

	/**
	 * Returns the meta object for the containment reference '{@link TTMCHybrid.Assignment#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see TTMCHybrid.Assignment#getRhs()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_Rhs();

	/**
	 * Returns the meta object for class '{@link TTMCHybrid.PropertyDeclaration <em>Property Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Declaration</em>'.
	 * @see TTMCHybrid.PropertyDeclaration
	 * @generated
	 */
	EClass getPropertyDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link TTMCHybrid.PropertyDeclaration#getHybridAutomaton <em>Hybrid Automaton</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hybrid Automaton</em>'.
	 * @see TTMCHybrid.PropertyDeclaration#getHybridAutomaton()
	 * @see #getPropertyDeclaration()
	 * @generated
	 */
	EReference getPropertyDeclaration_HybridAutomaton();

	/**
	 * Returns the meta object for the containment reference '{@link TTMCHybrid.PropertyDeclaration#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see TTMCHybrid.PropertyDeclaration#getExpression()
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
	TTMCHybridFactory getTTMCHybridFactory();

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
		 * The meta object literal for the '{@link TTMCHybrid.impl.HybridSpecificationImpl <em>Hybrid Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCHybrid.impl.HybridSpecificationImpl
		 * @see TTMCHybrid.impl.TTMCHybridPackageImpl#getHybridSpecification()
		 * @generated
		 */
		EClass HYBRID_SPECIFICATION = eINSTANCE.getHybridSpecification();

		/**
		 * The meta object literal for the '<em><b>Hybrid Automaton Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYBRID_SPECIFICATION__HYBRID_AUTOMATON_DECLARATIONS = eINSTANCE.getHybridSpecification_HybridAutomatonDeclarations();

		/**
		 * The meta object literal for the '<em><b>Property Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYBRID_SPECIFICATION__PROPERTY_DECLARATIONS = eINSTANCE.getHybridSpecification_PropertyDeclarations();

		/**
		 * The meta object literal for the '{@link TTMCHybrid.impl.ClockTypeDefinitionImpl <em>Clock Type Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCHybrid.impl.ClockTypeDefinitionImpl
		 * @see TTMCHybrid.impl.TTMCHybridPackageImpl#getClockTypeDefinition()
		 * @generated
		 */
		EClass CLOCK_TYPE_DEFINITION = eINSTANCE.getClockTypeDefinition();

		/**
		 * The meta object literal for the '{@link TTMCHybrid.impl.DotExpressionImpl <em>Dot Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCHybrid.impl.DotExpressionImpl
		 * @see TTMCHybrid.impl.TTMCHybridPackageImpl#getDotExpression()
		 * @generated
		 */
		EClass DOT_EXPRESSION = eINSTANCE.getDotExpression();

		/**
		 * The meta object literal for the '{@link TTMCHybrid.impl.LocationReferenceExpressionImpl <em>Location Reference Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCHybrid.impl.LocationReferenceExpressionImpl
		 * @see TTMCHybrid.impl.TTMCHybridPackageImpl#getLocationReferenceExpression()
		 * @generated
		 */
		EClass LOCATION_REFERENCE_EXPRESSION = eINSTANCE.getLocationReferenceExpression();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION_REFERENCE_EXPRESSION__LOCATION = eINSTANCE.getLocationReferenceExpression_Location();

		/**
		 * The meta object literal for the '{@link TTMCHybrid.impl.HybridAutomatonImpl <em>Hybrid Automaton</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCHybrid.impl.HybridAutomatonImpl
		 * @see TTMCHybrid.impl.TTMCHybridPackageImpl#getHybridAutomaton()
		 * @generated
		 */
		EClass HYBRID_AUTOMATON = eINSTANCE.getHybridAutomaton();

		/**
		 * The meta object literal for the '{@link TTMCHybrid.impl.HybridAutomatonDeclarationImpl <em>Hybrid Automaton Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCHybrid.impl.HybridAutomatonDeclarationImpl
		 * @see TTMCHybrid.impl.TTMCHybridPackageImpl#getHybridAutomatonDeclaration()
		 * @generated
		 */
		EClass HYBRID_AUTOMATON_DECLARATION = eINSTANCE.getHybridAutomatonDeclaration();

		/**
		 * The meta object literal for the '<em><b>Hybrid Automaton</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYBRID_AUTOMATON_DECLARATION__HYBRID_AUTOMATON = eINSTANCE.getHybridAutomatonDeclaration_HybridAutomaton();

		/**
		 * The meta object literal for the '{@link TTMCHybrid.impl.HybridAutomatonReferenceImpl <em>Hybrid Automaton Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCHybrid.impl.HybridAutomatonReferenceImpl
		 * @see TTMCHybrid.impl.TTMCHybridPackageImpl#getHybridAutomatonReference()
		 * @generated
		 */
		EClass HYBRID_AUTOMATON_REFERENCE = eINSTANCE.getHybridAutomatonReference();

		/**
		 * The meta object literal for the '<em><b>Declaration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYBRID_AUTOMATON_REFERENCE__DECLARATION = eINSTANCE.getHybridAutomatonReference_Declaration();

		/**
		 * The meta object literal for the '{@link TTMCHybrid.impl.HybridAutomatonDefinitionImpl <em>Hybrid Automaton Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCHybrid.impl.HybridAutomatonDefinitionImpl
		 * @see TTMCHybrid.impl.TTMCHybridPackageImpl#getHybridAutomatonDefinition()
		 * @generated
		 */
		EClass HYBRID_AUTOMATON_DEFINITION = eINSTANCE.getHybridAutomatonDefinition();

		/**
		 * The meta object literal for the '<em><b>Variable Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYBRID_AUTOMATON_DEFINITION__VARIABLE_DECLARATIONS = eINSTANCE.getHybridAutomatonDefinition_VariableDeclarations();

		/**
		 * The meta object literal for the '<em><b>Locations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYBRID_AUTOMATON_DEFINITION__LOCATIONS = eINSTANCE.getHybridAutomatonDefinition_Locations();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYBRID_AUTOMATON_DEFINITION__TRANSITIONS = eINSTANCE.getHybridAutomatonDefinition_Transitions();

		/**
		 * The meta object literal for the '{@link TTMCHybrid.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCHybrid.impl.VariableDeclarationImpl
		 * @see TTMCHybrid.impl.TTMCHybridPackageImpl#getVariableDeclaration()
		 * @generated
		 */
		EClass VARIABLE_DECLARATION = eINSTANCE.getVariableDeclaration();

		/**
		 * The meta object literal for the '{@link TTMCHybrid.impl.LocalVariableDeclarationImpl <em>Local Variable Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCHybrid.impl.LocalVariableDeclarationImpl
		 * @see TTMCHybrid.impl.TTMCHybridPackageImpl#getLocalVariableDeclaration()
		 * @generated
		 */
		EClass LOCAL_VARIABLE_DECLARATION = eINSTANCE.getLocalVariableDeclaration();

		/**
		 * The meta object literal for the '{@link TTMCHybrid.impl.GlobalVariableDeclarationImpl <em>Global Variable Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCHybrid.impl.GlobalVariableDeclarationImpl
		 * @see TTMCHybrid.impl.TTMCHybridPackageImpl#getGlobalVariableDeclaration()
		 * @generated
		 */
		EClass GLOBAL_VARIABLE_DECLARATION = eINSTANCE.getGlobalVariableDeclaration();

		/**
		 * The meta object literal for the '{@link TTMCHybrid.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCHybrid.impl.LocationImpl
		 * @see TTMCHybrid.impl.TTMCHybridPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__CONDITIONS = eINSTANCE.getLocation_Conditions();

		/**
		 * The meta object literal for the '{@link TTMCHybrid.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCHybrid.impl.ConditionImpl
		 * @see TTMCHybrid.impl.TTMCHybridPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__EXPRESSION = eINSTANCE.getCondition_Expression();

		/**
		 * The meta object literal for the '{@link TTMCHybrid.impl.InitialConditionImpl <em>Initial Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCHybrid.impl.InitialConditionImpl
		 * @see TTMCHybrid.impl.TTMCHybridPackageImpl#getInitialCondition()
		 * @generated
		 */
		EClass INITIAL_CONDITION = eINSTANCE.getInitialCondition();

		/**
		 * The meta object literal for the '{@link TTMCHybrid.impl.InvariantConditionImpl <em>Invariant Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCHybrid.impl.InvariantConditionImpl
		 * @see TTMCHybrid.impl.TTMCHybridPackageImpl#getInvariantCondition()
		 * @generated
		 */
		EClass INVARIANT_CONDITION = eINSTANCE.getInvariantCondition();

		/**
		 * The meta object literal for the '{@link TTMCHybrid.impl.FlowConditionImpl <em>Flow Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCHybrid.impl.FlowConditionImpl
		 * @see TTMCHybrid.impl.TTMCHybridPackageImpl#getFlowCondition()
		 * @generated
		 */
		EClass FLOW_CONDITION = eINSTANCE.getFlowCondition();

		/**
		 * The meta object literal for the '{@link TTMCHybrid.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCHybrid.impl.TransitionImpl
		 * @see TTMCHybrid.impl.TTMCHybridPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '<em><b>Guards</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__GUARDS = eINSTANCE.getTransition_Guards();

		/**
		 * The meta object literal for the '<em><b>Assignments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__ASSIGNMENTS = eINSTANCE.getTransition_Assignments();

		/**
		 * The meta object literal for the '{@link TTMCHybrid.impl.AssignmentImpl <em>Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCHybrid.impl.AssignmentImpl
		 * @see TTMCHybrid.impl.TTMCHybridPackageImpl#getAssignment()
		 * @generated
		 */
		EClass ASSIGNMENT = eINSTANCE.getAssignment();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT__LHS = eINSTANCE.getAssignment_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT__RHS = eINSTANCE.getAssignment_Rhs();

		/**
		 * The meta object literal for the '{@link TTMCHybrid.impl.PropertyDeclarationImpl <em>Property Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCHybrid.impl.PropertyDeclarationImpl
		 * @see TTMCHybrid.impl.TTMCHybridPackageImpl#getPropertyDeclaration()
		 * @generated
		 */
		EClass PROPERTY_DECLARATION = eINSTANCE.getPropertyDeclaration();

		/**
		 * The meta object literal for the '<em><b>Hybrid Automaton</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_DECLARATION__HYBRID_AUTOMATON = eINSTANCE.getPropertyDeclaration_HybridAutomaton();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_DECLARATION__EXPRESSION = eINSTANCE.getPropertyDeclaration_Expression();

	}

} //TTMCHybridPackage
