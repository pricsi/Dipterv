/**
 */
package TTMCConstraint;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see TTMCConstraint.TTMCConstraintFactory
 * @model kind="package"
 * @generated
 */
public interface TTMCConstraintPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "TTMCConstraint";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.inf.mit.bme.hu/ttmc/TTMCConstraint";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "TTMCConstraint";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TTMCConstraintPackage eINSTANCE = TTMCConstraint.impl.TTMCConstraintPackageImpl.init();

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.NamedElementImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.ParametricElementImpl <em>Parametric Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.ParametricElementImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getParametricElement()
	 * @generated
	 */
	int PARAMETRIC_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Parameter Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRIC_ELEMENT__PARAMETER_DECLARATIONS = 0;

	/**
	 * The number of structural features of the '<em>Parametric Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRIC_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Parametric Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRIC_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.ParametrizedElementImpl <em>Parametrized Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.ParametrizedElementImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getParametrizedElement()
	 * @generated
	 */
	int PARAMETRIZED_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRIZED_ELEMENT__PARAMETERS = 0;

	/**
	 * The number of structural features of the '<em>Parametrized Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRIZED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Parametrized Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRIZED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.ConstraintSpecificationImpl <em>Constraint Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.ConstraintSpecificationImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getConstraintSpecification()
	 * @generated
	 */
	int CONSTRAINT_SPECIFICATION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_SPECIFICATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameter Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_SPECIFICATION__PARAMETER_DECLARATIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_SPECIFICATION__TYPE_DECLARATIONS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Constant Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_SPECIFICATION__CONSTANT_DECLARATIONS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Function Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_SPECIFICATION__FUNCTION_DECLARATIONS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Basic Constraint Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_SPECIFICATION__BASIC_CONSTRAINT_DEFINITIONS = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Constraint Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_SPECIFICATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Constraint Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_SPECIFICATION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.DeclarationImpl <em>Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.DeclarationImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getDeclaration()
	 * @generated
	 */
	int DECLARATION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.DefinableDeclarationImpl <em>Definable Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.DefinableDeclarationImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getDefinableDeclaration()
	 * @generated
	 */
	int DEFINABLE_DECLARATION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINABLE_DECLARATION__NAME = DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINABLE_DECLARATION__TYPE = DECLARATION__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINABLE_DECLARATION__EXPRESSION = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Definable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINABLE_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Definable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINABLE_DECLARATION_OPERATION_COUNT = DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.ParameterDeclarationImpl <em>Parameter Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.ParameterDeclarationImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getParameterDeclaration()
	 * @generated
	 */
	int PARAMETER_DECLARATION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DECLARATION__NAME = DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DECLARATION__TYPE = DECLARATION__TYPE;

	/**
	 * The number of structural features of the '<em>Parameter Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Parameter Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DECLARATION_OPERATION_COUNT = DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.FieldDeclarationImpl <em>Field Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.FieldDeclarationImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getFieldDeclaration()
	 * @generated
	 */
	int FIELD_DECLARATION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DECLARATION__NAME = DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DECLARATION__TYPE = DECLARATION__TYPE;

	/**
	 * The number of structural features of the '<em>Field Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Field Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DECLARATION_OPERATION_COUNT = DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.LetDeclarationImpl <em>Let Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.LetDeclarationImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getLetDeclaration()
	 * @generated
	 */
	int LET_DECLARATION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_DECLARATION__NAME = DEFINABLE_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_DECLARATION__TYPE = DEFINABLE_DECLARATION__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_DECLARATION__EXPRESSION = DEFINABLE_DECLARATION__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Let Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_DECLARATION_FEATURE_COUNT = DEFINABLE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Let Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_DECLARATION_OPERATION_COUNT = DEFINABLE_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.ConstantDeclarationImpl <em>Constant Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.ConstantDeclarationImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getConstantDeclaration()
	 * @generated
	 */
	int CONSTANT_DECLARATION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_DECLARATION__NAME = DEFINABLE_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_DECLARATION__TYPE = DEFINABLE_DECLARATION__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_DECLARATION__EXPRESSION = DEFINABLE_DECLARATION__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Constant Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_DECLARATION_FEATURE_COUNT = DEFINABLE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Constant Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_DECLARATION_OPERATION_COUNT = DEFINABLE_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.FunctionDeclarationImpl <em>Function Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.FunctionDeclarationImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getFunctionDeclaration()
	 * @generated
	 */
	int FUNCTION_DECLARATION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION__NAME = DEFINABLE_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION__TYPE = DEFINABLE_DECLARATION__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION__EXPRESSION = DEFINABLE_DECLARATION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Parameter Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION__PARAMETER_DECLARATIONS = DEFINABLE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Function Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION_FEATURE_COUNT = DEFINABLE_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Function Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION_OPERATION_COUNT = DEFINABLE_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.TypeImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 11;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.TypeDeclarationImpl <em>Type Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.TypeDeclarationImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getTypeDeclaration()
	 * @generated
	 */
	int TYPE_DECLARATION = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Type Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.TypeReferenceImpl <em>Type Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.TypeReferenceImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getTypeReference()
	 * @generated
	 */
	int TYPE_REFERENCE = 13;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE__REFERENCE = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.TypeDefinitionImpl <em>Type Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.TypeDefinitionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getTypeDefinition()
	 * @generated
	 */
	int TYPE_DEFINITION = 14;

	/**
	 * The number of structural features of the '<em>Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.BasicTypeDefinitionImpl <em>Basic Type Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.BasicTypeDefinitionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getBasicTypeDefinition()
	 * @generated
	 */
	int BASIC_TYPE_DEFINITION = 15;

	/**
	 * The number of structural features of the '<em>Basic Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE_DEFINITION_FEATURE_COUNT = TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Basic Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE_DEFINITION_OPERATION_COUNT = TYPE_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.IntegerTypeDefinitionImpl <em>Integer Type Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.IntegerTypeDefinitionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getIntegerTypeDefinition()
	 * @generated
	 */
	int INTEGER_TYPE_DEFINITION = 16;

	/**
	 * The number of structural features of the '<em>Integer Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE_DEFINITION_FEATURE_COUNT = BASIC_TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Integer Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE_DEFINITION_OPERATION_COUNT = BASIC_TYPE_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.NaturalTypeDefinitionImpl <em>Natural Type Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.NaturalTypeDefinitionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getNaturalTypeDefinition()
	 * @generated
	 */
	int NATURAL_TYPE_DEFINITION = 17;

	/**
	 * The number of structural features of the '<em>Natural Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_TYPE_DEFINITION_FEATURE_COUNT = BASIC_TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Natural Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_TYPE_DEFINITION_OPERATION_COUNT = BASIC_TYPE_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.BooleanTypeDefinitionImpl <em>Boolean Type Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.BooleanTypeDefinitionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getBooleanTypeDefinition()
	 * @generated
	 */
	int BOOLEAN_TYPE_DEFINITION = 18;

	/**
	 * The number of structural features of the '<em>Boolean Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE_DEFINITION_FEATURE_COUNT = BASIC_TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE_DEFINITION_OPERATION_COUNT = BASIC_TYPE_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.RealTypeDefinitionImpl <em>Real Type Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.RealTypeDefinitionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getRealTypeDefinition()
	 * @generated
	 */
	int REAL_TYPE_DEFINITION = 19;

	/**
	 * The number of structural features of the '<em>Real Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE_DEFINITION_FEATURE_COUNT = BASIC_TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Real Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE_DEFINITION_OPERATION_COUNT = BASIC_TYPE_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.SubrangeTypeDefinitionImpl <em>Subrange Type Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.SubrangeTypeDefinitionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getSubrangeTypeDefinition()
	 * @generated
	 */
	int SUBRANGE_TYPE_DEFINITION = 20;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRANGE_TYPE_DEFINITION__LOWER_BOUND = TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRANGE_TYPE_DEFINITION__UPPER_BOUND = TYPE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Subrange Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRANGE_TYPE_DEFINITION_FEATURE_COUNT = TYPE_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Subrange Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRANGE_TYPE_DEFINITION_OPERATION_COUNT = TYPE_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.SubTypeDefinitionImpl <em>Sub Type Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.SubTypeDefinitionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getSubTypeDefinition()
	 * @generated
	 */
	int SUB_TYPE_DEFINITION = 21;

	/**
	 * The feature id for the '<em><b>Parameter Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE_DEFINITION__PARAMETER_DECLARATIONS = TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter Declaration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE_DEFINITION__PARAMETER_DECLARATION = TYPE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE_DEFINITION__EXPRESSION = TYPE_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sub Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE_DEFINITION_FEATURE_COUNT = TYPE_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Sub Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE_DEFINITION_OPERATION_COUNT = TYPE_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.EnumerationTypeDefinitionImpl <em>Enumeration Type Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.EnumerationTypeDefinitionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getEnumerationTypeDefinition()
	 * @generated
	 */
	int ENUMERATION_TYPE_DEFINITION = 22;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE_DEFINITION__LITERALS = TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumeration Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE_DEFINITION_FEATURE_COUNT = TYPE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enumeration Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE_DEFINITION_OPERATION_COUNT = TYPE_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.EnumerationLiteralDefinitionImpl <em>Enumeration Literal Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.EnumerationLiteralDefinitionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getEnumerationLiteralDefinition()
	 * @generated
	 */
	int ENUMERATION_LITERAL_DEFINITION = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL_DEFINITION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Enumeration Literal Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL_DEFINITION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Enumeration Literal Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL_DEFINITION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.FunctionTypeDefinitionImpl <em>Function Type Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.FunctionTypeDefinitionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getFunctionTypeDefinition()
	 * @generated
	 */
	int FUNCTION_TYPE_DEFINITION = 24;

	/**
	 * The feature id for the '<em><b>Parameter Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE_DEFINITION__PARAMETER_TYPES = TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE_DEFINITION__RETURN_TYPE = TYPE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Function Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE_DEFINITION_FEATURE_COUNT = TYPE_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Function Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE_DEFINITION_OPERATION_COUNT = TYPE_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.ArrayTypeDefinitionImpl <em>Array Type Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.ArrayTypeDefinitionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getArrayTypeDefinition()
	 * @generated
	 */
	int ARRAY_TYPE_DEFINITION = 25;

	/**
	 * The feature id for the '<em><b>Index Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_DEFINITION__INDEX_TYPES = TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_DEFINITION__ELEMENT_TYPE = TYPE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Array Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_DEFINITION_FEATURE_COUNT = TYPE_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Array Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_DEFINITION_OPERATION_COUNT = TYPE_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.TupleTypeDefinitionImpl <em>Tuple Type Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.TupleTypeDefinitionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getTupleTypeDefinition()
	 * @generated
	 */
	int TUPLE_TYPE_DEFINITION = 26;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE_DEFINITION__TYPES = TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tuple Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE_DEFINITION_FEATURE_COUNT = TYPE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Tuple Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE_DEFINITION_OPERATION_COUNT = TYPE_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.RecordTypeDefinitionImpl <em>Record Type Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.RecordTypeDefinitionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getRecordTypeDefinition()
	 * @generated
	 */
	int RECORD_TYPE_DEFINITION = 27;

	/**
	 * The feature id for the '<em><b>Field Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TYPE_DEFINITION__FIELD_DECLARATIONS = TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Record Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TYPE_DEFINITION_FEATURE_COUNT = TYPE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Record Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TYPE_DEFINITION_OPERATION_COUNT = TYPE_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.ConstraintDefinitionImpl <em>Constraint Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.ConstraintDefinitionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getConstraintDefinition()
	 * @generated
	 */
	int CONSTRAINT_DEFINITION = 28;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_DEFINITION__EXPRESSION = 0;

	/**
	 * The number of structural features of the '<em>Constraint Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_DEFINITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Constraint Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.BasicConstraintDefinitionImpl <em>Basic Constraint Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.BasicConstraintDefinitionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getBasicConstraintDefinition()
	 * @generated
	 */
	int BASIC_CONSTRAINT_DEFINITION = 29;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CONSTRAINT_DEFINITION__EXPRESSION = CONSTRAINT_DEFINITION__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Basic Constraint Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CONSTRAINT_DEFINITION_FEATURE_COUNT = CONSTRAINT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Basic Constraint Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CONSTRAINT_DEFINITION_OPERATION_COUNT = CONSTRAINT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.ExpressionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 30;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.NullaryExpressionImpl <em>Nullary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.NullaryExpressionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getNullaryExpression()
	 * @generated
	 */
	int NULLARY_EXPRESSION = 31;

	/**
	 * The number of structural features of the '<em>Nullary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULLARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Nullary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULLARY_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.UnaryExpressionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getUnaryExpression()
	 * @generated
	 */
	int UNARY_EXPRESSION = 32;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__OPERAND = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Unary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.BinaryExpressionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getBinaryExpression()
	 * @generated
	 */
	int BINARY_EXPRESSION = 33;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__LEFT_OPERAND = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__RIGHT_OPERAND = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.MultiaryExpressionImpl <em>Multiary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.MultiaryExpressionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getMultiaryExpression()
	 * @generated
	 */
	int MULTIARY_EXPRESSION = 34;

	/**
	 * The feature id for the '<em><b>Operands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIARY_EXPRESSION__OPERANDS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multiary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Multiary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIARY_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.PredicateExpressionImpl <em>Predicate Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.PredicateExpressionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getPredicateExpression()
	 * @generated
	 */
	int PREDICATE_EXPRESSION = 35;

	/**
	 * The number of structural features of the '<em>Predicate Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Predicate Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.ArithmeticExpressionImpl <em>Arithmetic Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.ArithmeticExpressionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getArithmeticExpression()
	 * @generated
	 */
	int ARITHMETIC_EXPRESSION = 36;

	/**
	 * The number of structural features of the '<em>Arithmetic Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Arithmetic Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.AccessExpressionImpl <em>Access Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.AccessExpressionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getAccessExpression()
	 * @generated
	 */
	int ACCESS_EXPRESSION = 37;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_EXPRESSION__OPERAND = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Access Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Access Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.BooleanExpressionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getBooleanExpression()
	 * @generated
	 */
	int BOOLEAN_EXPRESSION = 38;

	/**
	 * The number of structural features of the '<em>Boolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.QuantifierExpressionImpl <em>Quantifier Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.QuantifierExpressionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getQuantifierExpression()
	 * @generated
	 */
	int QUANTIFIER_EXPRESSION = 39;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIER_EXPRESSION__OPERAND = UNARY_EXPRESSION__OPERAND;

	/**
	 * The feature id for the '<em><b>Parameter Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIER_EXPRESSION__PARAMETER_DECLARATIONS = UNARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Quantifier Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIER_EXPRESSION_FEATURE_COUNT = UNARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Quantifier Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIER_EXPRESSION_OPERATION_COUNT = UNARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.TemporalExpressionImpl <em>Temporal Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.TemporalExpressionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getTemporalExpression()
	 * @generated
	 */
	int TEMPORAL_EXPRESSION = 40;

	/**
	 * The number of structural features of the '<em>Temporal Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Temporal Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.TemporalPathExpressionImpl <em>Temporal Path Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.TemporalPathExpressionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getTemporalPathExpression()
	 * @generated
	 */
	int TEMPORAL_PATH_EXPRESSION = 41;

	/**
	 * The number of structural features of the '<em>Temporal Path Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_PATH_EXPRESSION_FEATURE_COUNT = TEMPORAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Temporal Path Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_PATH_EXPRESSION_OPERATION_COUNT = TEMPORAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.TemporalStateExpressionImpl <em>Temporal State Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.TemporalStateExpressionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getTemporalStateExpression()
	 * @generated
	 */
	int TEMPORAL_STATE_EXPRESSION = 42;

	/**
	 * The number of structural features of the '<em>Temporal State Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_STATE_EXPRESSION_FEATURE_COUNT = TEMPORAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Temporal State Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_STATE_EXPRESSION_OPERATION_COUNT = TEMPORAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.LiteralExpressionImpl <em>Literal Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.LiteralExpressionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getLiteralExpression()
	 * @generated
	 */
	int LITERAL_EXPRESSION = 43;

	/**
	 * The number of structural features of the '<em>Literal Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Literal Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.ArithmeticLiteralExpressionImpl <em>Arithmetic Literal Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.ArithmeticLiteralExpressionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getArithmeticLiteralExpression()
	 * @generated
	 */
	int ARITHMETIC_LITERAL_EXPRESSION = 44;

	/**
	 * The number of structural features of the '<em>Arithmetic Literal Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_LITERAL_EXPRESSION_FEATURE_COUNT = NULLARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Arithmetic Literal Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_LITERAL_EXPRESSION_OPERATION_COUNT = NULLARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.IntegerLiteralExpressionImpl <em>Integer Literal Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.IntegerLiteralExpressionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getIntegerLiteralExpression()
	 * @generated
	 */
	int INTEGER_LITERAL_EXPRESSION = 45;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL_EXPRESSION__VALUE = ARITHMETIC_LITERAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Literal Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL_EXPRESSION_FEATURE_COUNT = ARITHMETIC_LITERAL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Integer Literal Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL_EXPRESSION_OPERATION_COUNT = ARITHMETIC_LITERAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.DecimalLiteralExpressionImpl <em>Decimal Literal Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.DecimalLiteralExpressionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getDecimalLiteralExpression()
	 * @generated
	 */
	int DECIMAL_LITERAL_EXPRESSION = 46;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_LITERAL_EXPRESSION__VALUE = ARITHMETIC_LITERAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Decimal Literal Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_LITERAL_EXPRESSION_FEATURE_COUNT = ARITHMETIC_LITERAL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Decimal Literal Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_LITERAL_EXPRESSION_OPERATION_COUNT = ARITHMETIC_LITERAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.RationalLiteralExpressionImpl <em>Rational Literal Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.RationalLiteralExpressionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getRationalLiteralExpression()
	 * @generated
	 */
	int RATIONAL_LITERAL_EXPRESSION = 47;

	/**
	 * The feature id for the '<em><b>Numerator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONAL_LITERAL_EXPRESSION__NUMERATOR = ARITHMETIC_LITERAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Denominator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONAL_LITERAL_EXPRESSION__DENOMINATOR = ARITHMETIC_LITERAL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rational Literal Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONAL_LITERAL_EXPRESSION_FEATURE_COUNT = ARITHMETIC_LITERAL_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Rational Literal Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONAL_LITERAL_EXPRESSION_OPERATION_COUNT = ARITHMETIC_LITERAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.BooleanLiteralExpressionImpl <em>Boolean Literal Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.BooleanLiteralExpressionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getBooleanLiteralExpression()
	 * @generated
	 */
	int BOOLEAN_LITERAL_EXPRESSION = 48;

	/**
	 * The number of structural features of the '<em>Boolean Literal Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_EXPRESSION_FEATURE_COUNT = NULLARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean Literal Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_EXPRESSION_OPERATION_COUNT = NULLARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.TrueExpressionImpl <em>True Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.TrueExpressionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getTrueExpression()
	 * @generated
	 */
	int TRUE_EXPRESSION = 49;

	/**
	 * The number of structural features of the '<em>True Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_EXPRESSION_FEATURE_COUNT = BOOLEAN_LITERAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>True Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_EXPRESSION_OPERATION_COUNT = BOOLEAN_LITERAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.FalseExpressionImpl <em>False Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.FalseExpressionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getFalseExpression()
	 * @generated
	 */
	int FALSE_EXPRESSION = 50;

	/**
	 * The number of structural features of the '<em>False Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALSE_EXPRESSION_FEATURE_COUNT = BOOLEAN_LITERAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>False Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALSE_EXPRESSION_OPERATION_COUNT = BOOLEAN_LITERAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.ArrayLiteralExpressionImpl <em>Array Literal Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.ArrayLiteralExpressionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getArrayLiteralExpression()
	 * @generated
	 */
	int ARRAY_LITERAL_EXPRESSION = 51;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_LITERAL_EXPRESSION__OPERAND = UNARY_EXPRESSION__OPERAND;

	/**
	 * The feature id for the '<em><b>Parameter Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_LITERAL_EXPRESSION__PARAMETER_DECLARATIONS = UNARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Array Literal Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_LITERAL_EXPRESSION_FEATURE_COUNT = UNARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Array Literal Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_LITERAL_EXPRESSION_OPERATION_COUNT = UNARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.FunctionLiteralExpressionImpl <em>Function Literal Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.FunctionLiteralExpressionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getFunctionLiteralExpression()
	 * @generated
	 */
	int FUNCTION_LITERAL_EXPRESSION = 52;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_LITERAL_EXPRESSION__OPERAND = UNARY_EXPRESSION__OPERAND;

	/**
	 * The feature id for the '<em><b>Parameter Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_LITERAL_EXPRESSION__PARAMETER_DECLARATIONS = UNARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_LITERAL_EXPRESSION__RETURN_TYPE = UNARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Function Literal Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_LITERAL_EXPRESSION_FEATURE_COUNT = UNARY_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Function Literal Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_LITERAL_EXPRESSION_OPERATION_COUNT = UNARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.RecordLiteralExpressionImpl <em>Record Literal Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.RecordLiteralExpressionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getRecordLiteralExpression()
	 * @generated
	 */
	int RECORD_LITERAL_EXPRESSION = 53;

	/**
	 * The feature id for the '<em><b>Field Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_LITERAL_EXPRESSION__FIELD_ASSIGNMENTS = LITERAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Record Literal Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_LITERAL_EXPRESSION_FEATURE_COUNT = LITERAL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Record Literal Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_LITERAL_EXPRESSION_OPERATION_COUNT = LITERAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.FieldAssignmentImpl <em>Field Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.FieldAssignmentImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getFieldAssignment()
	 * @generated
	 */
	int FIELD_ASSIGNMENT = 54;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ASSIGNMENT__REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ASSIGNMENT__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Field Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ASSIGNMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Field Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ASSIGNMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.EnumerationLiteralExpressionImpl <em>Enumeration Literal Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.EnumerationLiteralExpressionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getEnumerationLiteralExpression()
	 * @generated
	 */
	int ENUMERATION_LITERAL_EXPRESSION = 55;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL_EXPRESSION__REFERENCE = NULLARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumeration Literal Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL_EXPRESSION_FEATURE_COUNT = NULLARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enumeration Literal Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL_EXPRESSION_OPERATION_COUNT = NULLARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.TupleLiteralExpressionImpl <em>Tuple Literal Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.TupleLiteralExpressionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getTupleLiteralExpression()
	 * @generated
	 */
	int TUPLE_LITERAL_EXPRESSION = 56;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_LITERAL_EXPRESSION__EXPRESSIONS = LITERAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tuple Literal Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_LITERAL_EXPRESSION_FEATURE_COUNT = LITERAL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Tuple Literal Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_LITERAL_EXPRESSION_OPERATION_COUNT = LITERAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.ReferenceExpressionImpl <em>Reference Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.ReferenceExpressionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getReferenceExpression()
	 * @generated
	 */
	int REFERENCE_EXPRESSION = 57;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_EXPRESSION__DECLARATION = NULLARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reference Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_EXPRESSION_FEATURE_COUNT = NULLARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Reference Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_EXPRESSION_OPERATION_COUNT = NULLARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.IfThenElseExpressionImpl <em>If Then Else Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.IfThenElseExpressionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getIfThenElseExpression()
	 * @generated
	 */
	int IF_THEN_ELSE_EXPRESSION = 58;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_THEN_ELSE_EXPRESSION__CONDITION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_THEN_ELSE_EXPRESSION__THEN = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_THEN_ELSE_EXPRESSION__ELSE = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>If Then Else Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_THEN_ELSE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>If Then Else Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_THEN_ELSE_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.LetExpressionImpl <em>Let Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.LetExpressionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getLetExpression()
	 * @generated
	 */
	int LET_EXPRESSION = 59;

	/**
	 * The feature id for the '<em><b>Let Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXPRESSION__LET_DECLARATIONS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXPRESSION__EXPRESSION = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Let Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Let Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.EqualExpressionImpl <em>Equal Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.EqualExpressionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getEqualExpression()
	 * @generated
	 */
	int EQUAL_EXPRESSION = 60;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_EXPRESSION__LEFT_OPERAND = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_EXPRESSION__RIGHT_OPERAND = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Equal Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_EXPRESSION_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Equal Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_EXPRESSION_OPERATION_COUNT = BOOLEAN_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.ImplyExpressionImpl <em>Imply Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.ImplyExpressionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getImplyExpression()
	 * @generated
	 */
	int IMPLY_EXPRESSION = 61;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLY_EXPRESSION__LEFT_OPERAND = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLY_EXPRESSION__RIGHT_OPERAND = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Imply Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLY_EXPRESSION_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Imply Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLY_EXPRESSION_OPERATION_COUNT = BOOLEAN_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.OrExpressionImpl <em>Or Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.OrExpressionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getOrExpression()
	 * @generated
	 */
	int OR_EXPRESSION = 62;

	/**
	 * The feature id for the '<em><b>Operands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPRESSION__OPERANDS = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Or Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPRESSION_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Or Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPRESSION_OPERATION_COUNT = BOOLEAN_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.AndExpressionImpl <em>And Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.AndExpressionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getAndExpression()
	 * @generated
	 */
	int AND_EXPRESSION = 63;

	/**
	 * The feature id for the '<em><b>Operands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPRESSION__OPERANDS = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>And Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPRESSION_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>And Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPRESSION_OPERATION_COUNT = BOOLEAN_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.ReleaseExpressionImpl <em>Release Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.ReleaseExpressionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getReleaseExpression()
	 * @generated
	 */
	int RELEASE_EXPRESSION = 64;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_EXPRESSION__LEFT_OPERAND = TEMPORAL_PATH_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_EXPRESSION__RIGHT_OPERAND = TEMPORAL_PATH_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Release Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_EXPRESSION_FEATURE_COUNT = TEMPORAL_PATH_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Release Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_EXPRESSION_OPERATION_COUNT = TEMPORAL_PATH_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.UntilExpressionImpl <em>Until Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.UntilExpressionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getUntilExpression()
	 * @generated
	 */
	int UNTIL_EXPRESSION = 65;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTIL_EXPRESSION__LEFT_OPERAND = TEMPORAL_PATH_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTIL_EXPRESSION__RIGHT_OPERAND = TEMPORAL_PATH_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Until Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTIL_EXPRESSION_FEATURE_COUNT = TEMPORAL_PATH_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Until Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTIL_EXPRESSION_OPERATION_COUNT = TEMPORAL_PATH_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.NotExpressionImpl <em>Not Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.NotExpressionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getNotExpression()
	 * @generated
	 */
	int NOT_EXPRESSION = 66;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EXPRESSION__OPERAND = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Not Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EXPRESSION_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Not Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EXPRESSION_OPERATION_COUNT = BOOLEAN_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.ForallExpressionImpl <em>Forall Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.ForallExpressionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getForallExpression()
	 * @generated
	 */
	int FORALL_EXPRESSION = 67;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORALL_EXPRESSION__OPERAND = QUANTIFIER_EXPRESSION__OPERAND;

	/**
	 * The feature id for the '<em><b>Parameter Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORALL_EXPRESSION__PARAMETER_DECLARATIONS = QUANTIFIER_EXPRESSION__PARAMETER_DECLARATIONS;

	/**
	 * The number of structural features of the '<em>Forall Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORALL_EXPRESSION_FEATURE_COUNT = QUANTIFIER_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Forall Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORALL_EXPRESSION_OPERATION_COUNT = QUANTIFIER_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.ExistsExpressionImpl <em>Exists Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.ExistsExpressionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getExistsExpression()
	 * @generated
	 */
	int EXISTS_EXPRESSION = 68;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTS_EXPRESSION__OPERAND = QUANTIFIER_EXPRESSION__OPERAND;

	/**
	 * The feature id for the '<em><b>Parameter Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTS_EXPRESSION__PARAMETER_DECLARATIONS = QUANTIFIER_EXPRESSION__PARAMETER_DECLARATIONS;

	/**
	 * The number of structural features of the '<em>Exists Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTS_EXPRESSION_FEATURE_COUNT = QUANTIFIER_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Exists Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTS_EXPRESSION_OPERATION_COUNT = QUANTIFIER_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.GloballyExpressionImpl <em>Globally Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.GloballyExpressionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getGloballyExpression()
	 * @generated
	 */
	int GLOBALLY_EXPRESSION = 69;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBALLY_EXPRESSION__OPERAND = TEMPORAL_PATH_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Globally Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBALLY_EXPRESSION_FEATURE_COUNT = TEMPORAL_PATH_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Globally Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBALLY_EXPRESSION_OPERATION_COUNT = TEMPORAL_PATH_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.FinallyExpressionImpl <em>Finally Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.FinallyExpressionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getFinallyExpression()
	 * @generated
	 */
	int FINALLY_EXPRESSION = 70;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALLY_EXPRESSION__OPERAND = TEMPORAL_PATH_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Finally Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALLY_EXPRESSION_FEATURE_COUNT = TEMPORAL_PATH_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Finally Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALLY_EXPRESSION_OPERATION_COUNT = TEMPORAL_PATH_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.NextExpressionImpl <em>Next Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.NextExpressionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getNextExpression()
	 * @generated
	 */
	int NEXT_EXPRESSION = 71;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_EXPRESSION__OPERAND = TEMPORAL_PATH_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Next Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_EXPRESSION_FEATURE_COUNT = TEMPORAL_PATH_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Next Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_EXPRESSION_OPERATION_COUNT = TEMPORAL_PATH_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.TemporalForallExpressionImpl <em>Temporal Forall Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.TemporalForallExpressionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getTemporalForallExpression()
	 * @generated
	 */
	int TEMPORAL_FORALL_EXPRESSION = 72;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_FORALL_EXPRESSION__OPERAND = TEMPORAL_STATE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Temporal Forall Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_FORALL_EXPRESSION_FEATURE_COUNT = TEMPORAL_STATE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Temporal Forall Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_FORALL_EXPRESSION_OPERATION_COUNT = TEMPORAL_STATE_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.TemporalExistsExpressionImpl <em>Temporal Exists Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.TemporalExistsExpressionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getTemporalExistsExpression()
	 * @generated
	 */
	int TEMPORAL_EXISTS_EXPRESSION = 73;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_EXISTS_EXPRESSION__OPERAND = TEMPORAL_STATE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Temporal Exists Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_EXISTS_EXPRESSION_FEATURE_COUNT = TEMPORAL_STATE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Temporal Exists Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_EXISTS_EXPRESSION_OPERATION_COUNT = TEMPORAL_STATE_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.InExpressionImpl <em>In Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.InExpressionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getInExpression()
	 * @generated
	 */
	int IN_EXPRESSION = 74;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_EXPRESSION__OPERAND = PREDICATE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_EXPRESSION__TYPE = PREDICATE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>In Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_EXPRESSION_FEATURE_COUNT = PREDICATE_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>In Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_EXPRESSION_OPERATION_COUNT = PREDICATE_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.PrimedExpressionImpl <em>Primed Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.PrimedExpressionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getPrimedExpression()
	 * @generated
	 */
	int PRIMED_EXPRESSION = 75;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMED_EXPRESSION__OPERAND = UNARY_EXPRESSION__OPERAND;

	/**
	 * The number of structural features of the '<em>Primed Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMED_EXPRESSION_FEATURE_COUNT = UNARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Primed Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMED_EXPRESSION_OPERATION_COUNT = UNARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.EquivalenceExpressionImpl <em>Equivalence Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.EquivalenceExpressionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getEquivalenceExpression()
	 * @generated
	 */
	int EQUIVALENCE_EXPRESSION = 76;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENCE_EXPRESSION__LEFT_OPERAND = PREDICATE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENCE_EXPRESSION__RIGHT_OPERAND = PREDICATE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Equivalence Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENCE_EXPRESSION_FEATURE_COUNT = PREDICATE_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Equivalence Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENCE_EXPRESSION_OPERATION_COUNT = PREDICATE_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.EqualityExpressionImpl <em>Equality Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.EqualityExpressionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getEqualityExpression()
	 * @generated
	 */
	int EQUALITY_EXPRESSION = 77;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_EXPRESSION__LEFT_OPERAND = EQUIVALENCE_EXPRESSION__LEFT_OPERAND;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_EXPRESSION__RIGHT_OPERAND = EQUIVALENCE_EXPRESSION__RIGHT_OPERAND;

	/**
	 * The number of structural features of the '<em>Equality Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_EXPRESSION_FEATURE_COUNT = EQUIVALENCE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Equality Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_EXPRESSION_OPERATION_COUNT = EQUIVALENCE_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.InequalityExpressionImpl <em>Inequality Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.InequalityExpressionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getInequalityExpression()
	 * @generated
	 */
	int INEQUALITY_EXPRESSION = 78;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INEQUALITY_EXPRESSION__LEFT_OPERAND = EQUIVALENCE_EXPRESSION__LEFT_OPERAND;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INEQUALITY_EXPRESSION__RIGHT_OPERAND = EQUIVALENCE_EXPRESSION__RIGHT_OPERAND;

	/**
	 * The number of structural features of the '<em>Inequality Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INEQUALITY_EXPRESSION_FEATURE_COUNT = EQUIVALENCE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Inequality Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INEQUALITY_EXPRESSION_OPERATION_COUNT = EQUIVALENCE_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.ComparisionExpressionImpl <em>Comparision Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.ComparisionExpressionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getComparisionExpression()
	 * @generated
	 */
	int COMPARISION_EXPRESSION = 79;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISION_EXPRESSION__LEFT_OPERAND = PREDICATE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISION_EXPRESSION__RIGHT_OPERAND = PREDICATE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Comparision Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISION_EXPRESSION_FEATURE_COUNT = PREDICATE_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Comparision Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISION_EXPRESSION_OPERATION_COUNT = PREDICATE_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.GreaterExpressionImpl <em>Greater Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.GreaterExpressionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getGreaterExpression()
	 * @generated
	 */
	int GREATER_EXPRESSION = 80;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_EXPRESSION__LEFT_OPERAND = COMPARISION_EXPRESSION__LEFT_OPERAND;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_EXPRESSION__RIGHT_OPERAND = COMPARISION_EXPRESSION__RIGHT_OPERAND;

	/**
	 * The number of structural features of the '<em>Greater Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_EXPRESSION_FEATURE_COUNT = COMPARISION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Greater Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_EXPRESSION_OPERATION_COUNT = COMPARISION_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.GreaterEqualExpressionImpl <em>Greater Equal Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.GreaterEqualExpressionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getGreaterEqualExpression()
	 * @generated
	 */
	int GREATER_EQUAL_EXPRESSION = 81;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_EQUAL_EXPRESSION__LEFT_OPERAND = COMPARISION_EXPRESSION__LEFT_OPERAND;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_EQUAL_EXPRESSION__RIGHT_OPERAND = COMPARISION_EXPRESSION__RIGHT_OPERAND;

	/**
	 * The number of structural features of the '<em>Greater Equal Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_EQUAL_EXPRESSION_FEATURE_COUNT = COMPARISION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Greater Equal Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_EQUAL_EXPRESSION_OPERATION_COUNT = COMPARISION_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.LessExpressionImpl <em>Less Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.LessExpressionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getLessExpression()
	 * @generated
	 */
	int LESS_EXPRESSION = 82;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_EXPRESSION__LEFT_OPERAND = COMPARISION_EXPRESSION__LEFT_OPERAND;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_EXPRESSION__RIGHT_OPERAND = COMPARISION_EXPRESSION__RIGHT_OPERAND;

	/**
	 * The number of structural features of the '<em>Less Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_EXPRESSION_FEATURE_COUNT = COMPARISION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Less Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_EXPRESSION_OPERATION_COUNT = COMPARISION_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.LessEqualExpressionImpl <em>Less Equal Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.LessEqualExpressionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getLessEqualExpression()
	 * @generated
	 */
	int LESS_EQUAL_EXPRESSION = 83;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_EQUAL_EXPRESSION__LEFT_OPERAND = COMPARISION_EXPRESSION__LEFT_OPERAND;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_EQUAL_EXPRESSION__RIGHT_OPERAND = COMPARISION_EXPRESSION__RIGHT_OPERAND;

	/**
	 * The number of structural features of the '<em>Less Equal Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_EQUAL_EXPRESSION_FEATURE_COUNT = COMPARISION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Less Equal Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_EQUAL_EXPRESSION_OPERATION_COUNT = COMPARISION_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.AddExpressionImpl <em>Add Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.AddExpressionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getAddExpression()
	 * @generated
	 */
	int ADD_EXPRESSION = 84;

	/**
	 * The feature id for the '<em><b>Operands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_EXPRESSION__OPERANDS = ARITHMETIC_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Add Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_EXPRESSION_FEATURE_COUNT = ARITHMETIC_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Add Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_EXPRESSION_OPERATION_COUNT = ARITHMETIC_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.SubtractExpressionImpl <em>Subtract Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.SubtractExpressionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getSubtractExpression()
	 * @generated
	 */
	int SUBTRACT_EXPRESSION = 85;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACT_EXPRESSION__LEFT_OPERAND = ARITHMETIC_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACT_EXPRESSION__RIGHT_OPERAND = ARITHMETIC_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Subtract Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACT_EXPRESSION_FEATURE_COUNT = ARITHMETIC_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Subtract Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACT_EXPRESSION_OPERATION_COUNT = ARITHMETIC_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.MultiplyExpressionImpl <em>Multiply Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.MultiplyExpressionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getMultiplyExpression()
	 * @generated
	 */
	int MULTIPLY_EXPRESSION = 86;

	/**
	 * The feature id for the '<em><b>Operands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLY_EXPRESSION__OPERANDS = ARITHMETIC_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multiply Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLY_EXPRESSION_FEATURE_COUNT = ARITHMETIC_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Multiply Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLY_EXPRESSION_OPERATION_COUNT = ARITHMETIC_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.DivideExpressionImpl <em>Divide Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.DivideExpressionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getDivideExpression()
	 * @generated
	 */
	int DIVIDE_EXPRESSION = 87;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDE_EXPRESSION__LEFT_OPERAND = ARITHMETIC_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDE_EXPRESSION__RIGHT_OPERAND = ARITHMETIC_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Divide Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDE_EXPRESSION_FEATURE_COUNT = ARITHMETIC_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Divide Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDE_EXPRESSION_OPERATION_COUNT = ARITHMETIC_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.DivExpressionImpl <em>Div Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.DivExpressionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getDivExpression()
	 * @generated
	 */
	int DIV_EXPRESSION = 88;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_EXPRESSION__LEFT_OPERAND = ARITHMETIC_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_EXPRESSION__RIGHT_OPERAND = ARITHMETIC_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Div Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_EXPRESSION_FEATURE_COUNT = ARITHMETIC_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Div Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_EXPRESSION_OPERATION_COUNT = ARITHMETIC_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.ModExpressionImpl <em>Mod Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.ModExpressionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getModExpression()
	 * @generated
	 */
	int MOD_EXPRESSION = 89;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOD_EXPRESSION__LEFT_OPERAND = ARITHMETIC_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOD_EXPRESSION__RIGHT_OPERAND = ARITHMETIC_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Mod Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOD_EXPRESSION_FEATURE_COUNT = ARITHMETIC_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Mod Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOD_EXPRESSION_OPERATION_COUNT = ARITHMETIC_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.UnaryMinusExpressionImpl <em>Unary Minus Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.UnaryMinusExpressionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getUnaryMinusExpression()
	 * @generated
	 */
	int UNARY_MINUS_EXPRESSION = 90;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_MINUS_EXPRESSION__OPERAND = ARITHMETIC_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unary Minus Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_MINUS_EXPRESSION_FEATURE_COUNT = ARITHMETIC_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Unary Minus Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_MINUS_EXPRESSION_OPERATION_COUNT = ARITHMETIC_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.UnaryPlusExpressionImpl <em>Unary Plus Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.UnaryPlusExpressionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getUnaryPlusExpression()
	 * @generated
	 */
	int UNARY_PLUS_EXPRESSION = 91;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_PLUS_EXPRESSION__OPERAND = ARITHMETIC_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unary Plus Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_PLUS_EXPRESSION_FEATURE_COUNT = ARITHMETIC_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Unary Plus Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_PLUS_EXPRESSION_OPERATION_COUNT = ARITHMETIC_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.FunctionAccessExpressionImpl <em>Function Access Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.FunctionAccessExpressionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getFunctionAccessExpression()
	 * @generated
	 */
	int FUNCTION_ACCESS_EXPRESSION = 92;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_ACCESS_EXPRESSION__OPERAND = ACCESS_EXPRESSION__OPERAND;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_ACCESS_EXPRESSION__PARAMETERS = ACCESS_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Function Access Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_ACCESS_EXPRESSION_FEATURE_COUNT = ACCESS_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Function Access Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_ACCESS_EXPRESSION_OPERATION_COUNT = ACCESS_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.ArrayAccessExpressionImpl <em>Array Access Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.ArrayAccessExpressionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getArrayAccessExpression()
	 * @generated
	 */
	int ARRAY_ACCESS_EXPRESSION = 93;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ACCESS_EXPRESSION__OPERAND = ACCESS_EXPRESSION__OPERAND;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ACCESS_EXPRESSION__PARAMETERS = ACCESS_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Array Access Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ACCESS_EXPRESSION_FEATURE_COUNT = ACCESS_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Array Access Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ACCESS_EXPRESSION_OPERATION_COUNT = ACCESS_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.TupleAccessExpressionImpl <em>Tuple Access Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.TupleAccessExpressionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getTupleAccessExpression()
	 * @generated
	 */
	int TUPLE_ACCESS_EXPRESSION = 94;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_ACCESS_EXPRESSION__OPERAND = ACCESS_EXPRESSION__OPERAND;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_ACCESS_EXPRESSION__INDEX = ACCESS_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tuple Access Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_ACCESS_EXPRESSION_FEATURE_COUNT = ACCESS_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Tuple Access Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_ACCESS_EXPRESSION_OPERATION_COUNT = ACCESS_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TTMCConstraint.impl.RecordAccessExpressionImpl <em>Record Access Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TTMCConstraint.impl.RecordAccessExpressionImpl
	 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getRecordAccessExpression()
	 * @generated
	 */
	int RECORD_ACCESS_EXPRESSION = 95;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_ACCESS_EXPRESSION__OPERAND = ACCESS_EXPRESSION__OPERAND;

	/**
	 * The feature id for the '<em><b>Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_ACCESS_EXPRESSION__FIELD = ACCESS_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Record Access Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_ACCESS_EXPRESSION_FEATURE_COUNT = ACCESS_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Record Access Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_ACCESS_EXPRESSION_OPERATION_COUNT = ACCESS_EXPRESSION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link TTMCConstraint.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see TTMCConstraint.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link TTMCConstraint.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TTMCConstraint.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.ParametricElement <em>Parametric Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parametric Element</em>'.
	 * @see TTMCConstraint.ParametricElement
	 * @generated
	 */
	EClass getParametricElement();

	/**
	 * Returns the meta object for the containment reference list '{@link TTMCConstraint.ParametricElement#getParameterDeclarations <em>Parameter Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Declarations</em>'.
	 * @see TTMCConstraint.ParametricElement#getParameterDeclarations()
	 * @see #getParametricElement()
	 * @generated
	 */
	EReference getParametricElement_ParameterDeclarations();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.ParametrizedElement <em>Parametrized Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parametrized Element</em>'.
	 * @see TTMCConstraint.ParametrizedElement
	 * @generated
	 */
	EClass getParametrizedElement();

	/**
	 * Returns the meta object for the containment reference list '{@link TTMCConstraint.ParametrizedElement#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see TTMCConstraint.ParametrizedElement#getParameters()
	 * @see #getParametrizedElement()
	 * @generated
	 */
	EReference getParametrizedElement_Parameters();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.ConstraintSpecification <em>Constraint Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint Specification</em>'.
	 * @see TTMCConstraint.ConstraintSpecification
	 * @generated
	 */
	EClass getConstraintSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link TTMCConstraint.ConstraintSpecification#getTypeDeclarations <em>Type Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type Declarations</em>'.
	 * @see TTMCConstraint.ConstraintSpecification#getTypeDeclarations()
	 * @see #getConstraintSpecification()
	 * @generated
	 */
	EReference getConstraintSpecification_TypeDeclarations();

	/**
	 * Returns the meta object for the containment reference list '{@link TTMCConstraint.ConstraintSpecification#getConstantDeclarations <em>Constant Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constant Declarations</em>'.
	 * @see TTMCConstraint.ConstraintSpecification#getConstantDeclarations()
	 * @see #getConstraintSpecification()
	 * @generated
	 */
	EReference getConstraintSpecification_ConstantDeclarations();

	/**
	 * Returns the meta object for the containment reference list '{@link TTMCConstraint.ConstraintSpecification#getFunctionDeclarations <em>Function Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Function Declarations</em>'.
	 * @see TTMCConstraint.ConstraintSpecification#getFunctionDeclarations()
	 * @see #getConstraintSpecification()
	 * @generated
	 */
	EReference getConstraintSpecification_FunctionDeclarations();

	/**
	 * Returns the meta object for the containment reference list '{@link TTMCConstraint.ConstraintSpecification#getBasicConstraintDefinitions <em>Basic Constraint Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Basic Constraint Definitions</em>'.
	 * @see TTMCConstraint.ConstraintSpecification#getBasicConstraintDefinitions()
	 * @see #getConstraintSpecification()
	 * @generated
	 */
	EReference getConstraintSpecification_BasicConstraintDefinitions();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.Declaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declaration</em>'.
	 * @see TTMCConstraint.Declaration
	 * @generated
	 */
	EClass getDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link TTMCConstraint.Declaration#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see TTMCConstraint.Declaration#getType()
	 * @see #getDeclaration()
	 * @generated
	 */
	EReference getDeclaration_Type();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.DefinableDeclaration <em>Definable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definable Declaration</em>'.
	 * @see TTMCConstraint.DefinableDeclaration
	 * @generated
	 */
	EClass getDefinableDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link TTMCConstraint.DefinableDeclaration#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see TTMCConstraint.DefinableDeclaration#getExpression()
	 * @see #getDefinableDeclaration()
	 * @generated
	 */
	EReference getDefinableDeclaration_Expression();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.ParameterDeclaration <em>Parameter Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Declaration</em>'.
	 * @see TTMCConstraint.ParameterDeclaration
	 * @generated
	 */
	EClass getParameterDeclaration();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.FieldDeclaration <em>Field Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Declaration</em>'.
	 * @see TTMCConstraint.FieldDeclaration
	 * @generated
	 */
	EClass getFieldDeclaration();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.LetDeclaration <em>Let Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Let Declaration</em>'.
	 * @see TTMCConstraint.LetDeclaration
	 * @generated
	 */
	EClass getLetDeclaration();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.ConstantDeclaration <em>Constant Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant Declaration</em>'.
	 * @see TTMCConstraint.ConstantDeclaration
	 * @generated
	 */
	EClass getConstantDeclaration();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.FunctionDeclaration <em>Function Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Declaration</em>'.
	 * @see TTMCConstraint.FunctionDeclaration
	 * @generated
	 */
	EClass getFunctionDeclaration();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see TTMCConstraint.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.TypeDeclaration <em>Type Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Declaration</em>'.
	 * @see TTMCConstraint.TypeDeclaration
	 * @generated
	 */
	EClass getTypeDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link TTMCConstraint.TypeDeclaration#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see TTMCConstraint.TypeDeclaration#getType()
	 * @see #getTypeDeclaration()
	 * @generated
	 */
	EReference getTypeDeclaration_Type();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.TypeReference <em>Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Reference</em>'.
	 * @see TTMCConstraint.TypeReference
	 * @generated
	 */
	EClass getTypeReference();

	/**
	 * Returns the meta object for the reference '{@link TTMCConstraint.TypeReference#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see TTMCConstraint.TypeReference#getReference()
	 * @see #getTypeReference()
	 * @generated
	 */
	EReference getTypeReference_Reference();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.TypeDefinition <em>Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Definition</em>'.
	 * @see TTMCConstraint.TypeDefinition
	 * @generated
	 */
	EClass getTypeDefinition();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.BasicTypeDefinition <em>Basic Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Type Definition</em>'.
	 * @see TTMCConstraint.BasicTypeDefinition
	 * @generated
	 */
	EClass getBasicTypeDefinition();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.IntegerTypeDefinition <em>Integer Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Type Definition</em>'.
	 * @see TTMCConstraint.IntegerTypeDefinition
	 * @generated
	 */
	EClass getIntegerTypeDefinition();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.NaturalTypeDefinition <em>Natural Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Natural Type Definition</em>'.
	 * @see TTMCConstraint.NaturalTypeDefinition
	 * @generated
	 */
	EClass getNaturalTypeDefinition();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.BooleanTypeDefinition <em>Boolean Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Type Definition</em>'.
	 * @see TTMCConstraint.BooleanTypeDefinition
	 * @generated
	 */
	EClass getBooleanTypeDefinition();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.RealTypeDefinition <em>Real Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real Type Definition</em>'.
	 * @see TTMCConstraint.RealTypeDefinition
	 * @generated
	 */
	EClass getRealTypeDefinition();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.SubrangeTypeDefinition <em>Subrange Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subrange Type Definition</em>'.
	 * @see TTMCConstraint.SubrangeTypeDefinition
	 * @generated
	 */
	EClass getSubrangeTypeDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link TTMCConstraint.SubrangeTypeDefinition#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lower Bound</em>'.
	 * @see TTMCConstraint.SubrangeTypeDefinition#getLowerBound()
	 * @see #getSubrangeTypeDefinition()
	 * @generated
	 */
	EReference getSubrangeTypeDefinition_LowerBound();

	/**
	 * Returns the meta object for the containment reference '{@link TTMCConstraint.SubrangeTypeDefinition#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Upper Bound</em>'.
	 * @see TTMCConstraint.SubrangeTypeDefinition#getUpperBound()
	 * @see #getSubrangeTypeDefinition()
	 * @generated
	 */
	EReference getSubrangeTypeDefinition_UpperBound();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.SubTypeDefinition <em>Sub Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Type Definition</em>'.
	 * @see TTMCConstraint.SubTypeDefinition
	 * @generated
	 */
	EClass getSubTypeDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link TTMCConstraint.SubTypeDefinition#getParameterDeclaration <em>Parameter Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter Declaration</em>'.
	 * @see TTMCConstraint.SubTypeDefinition#getParameterDeclaration()
	 * @see #getSubTypeDefinition()
	 * @generated
	 */
	EReference getSubTypeDefinition_ParameterDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link TTMCConstraint.SubTypeDefinition#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see TTMCConstraint.SubTypeDefinition#getExpression()
	 * @see #getSubTypeDefinition()
	 * @generated
	 */
	EReference getSubTypeDefinition_Expression();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.EnumerationTypeDefinition <em>Enumeration Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Type Definition</em>'.
	 * @see TTMCConstraint.EnumerationTypeDefinition
	 * @generated
	 */
	EClass getEnumerationTypeDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link TTMCConstraint.EnumerationTypeDefinition#getLiterals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Literals</em>'.
	 * @see TTMCConstraint.EnumerationTypeDefinition#getLiterals()
	 * @see #getEnumerationTypeDefinition()
	 * @generated
	 */
	EReference getEnumerationTypeDefinition_Literals();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.EnumerationLiteralDefinition <em>Enumeration Literal Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Literal Definition</em>'.
	 * @see TTMCConstraint.EnumerationLiteralDefinition
	 * @generated
	 */
	EClass getEnumerationLiteralDefinition();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.FunctionTypeDefinition <em>Function Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Type Definition</em>'.
	 * @see TTMCConstraint.FunctionTypeDefinition
	 * @generated
	 */
	EClass getFunctionTypeDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link TTMCConstraint.FunctionTypeDefinition#getParameterTypes <em>Parameter Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Types</em>'.
	 * @see TTMCConstraint.FunctionTypeDefinition#getParameterTypes()
	 * @see #getFunctionTypeDefinition()
	 * @generated
	 */
	EReference getFunctionTypeDefinition_ParameterTypes();

	/**
	 * Returns the meta object for the containment reference '{@link TTMCConstraint.FunctionTypeDefinition#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Type</em>'.
	 * @see TTMCConstraint.FunctionTypeDefinition#getReturnType()
	 * @see #getFunctionTypeDefinition()
	 * @generated
	 */
	EReference getFunctionTypeDefinition_ReturnType();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.ArrayTypeDefinition <em>Array Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Type Definition</em>'.
	 * @see TTMCConstraint.ArrayTypeDefinition
	 * @generated
	 */
	EClass getArrayTypeDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link TTMCConstraint.ArrayTypeDefinition#getIndexTypes <em>Index Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Index Types</em>'.
	 * @see TTMCConstraint.ArrayTypeDefinition#getIndexTypes()
	 * @see #getArrayTypeDefinition()
	 * @generated
	 */
	EReference getArrayTypeDefinition_IndexTypes();

	/**
	 * Returns the meta object for the containment reference '{@link TTMCConstraint.ArrayTypeDefinition#getElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element Type</em>'.
	 * @see TTMCConstraint.ArrayTypeDefinition#getElementType()
	 * @see #getArrayTypeDefinition()
	 * @generated
	 */
	EReference getArrayTypeDefinition_ElementType();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.TupleTypeDefinition <em>Tuple Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuple Type Definition</em>'.
	 * @see TTMCConstraint.TupleTypeDefinition
	 * @generated
	 */
	EClass getTupleTypeDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link TTMCConstraint.TupleTypeDefinition#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see TTMCConstraint.TupleTypeDefinition#getTypes()
	 * @see #getTupleTypeDefinition()
	 * @generated
	 */
	EReference getTupleTypeDefinition_Types();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.RecordTypeDefinition <em>Record Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Record Type Definition</em>'.
	 * @see TTMCConstraint.RecordTypeDefinition
	 * @generated
	 */
	EClass getRecordTypeDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link TTMCConstraint.RecordTypeDefinition#getFieldDeclarations <em>Field Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Field Declarations</em>'.
	 * @see TTMCConstraint.RecordTypeDefinition#getFieldDeclarations()
	 * @see #getRecordTypeDefinition()
	 * @generated
	 */
	EReference getRecordTypeDefinition_FieldDeclarations();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.ConstraintDefinition <em>Constraint Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint Definition</em>'.
	 * @see TTMCConstraint.ConstraintDefinition
	 * @generated
	 */
	EClass getConstraintDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link TTMCConstraint.ConstraintDefinition#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see TTMCConstraint.ConstraintDefinition#getExpression()
	 * @see #getConstraintDefinition()
	 * @generated
	 */
	EReference getConstraintDefinition_Expression();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.BasicConstraintDefinition <em>Basic Constraint Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Constraint Definition</em>'.
	 * @see TTMCConstraint.BasicConstraintDefinition
	 * @generated
	 */
	EClass getBasicConstraintDefinition();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see TTMCConstraint.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.NullaryExpression <em>Nullary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nullary Expression</em>'.
	 * @see TTMCConstraint.NullaryExpression
	 * @generated
	 */
	EClass getNullaryExpression();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.UnaryExpression <em>Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Expression</em>'.
	 * @see TTMCConstraint.UnaryExpression
	 * @generated
	 */
	EClass getUnaryExpression();

	/**
	 * Returns the meta object for the containment reference '{@link TTMCConstraint.UnaryExpression#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand</em>'.
	 * @see TTMCConstraint.UnaryExpression#getOperand()
	 * @see #getUnaryExpression()
	 * @generated
	 */
	EReference getUnaryExpression_Operand();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.BinaryExpression <em>Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Expression</em>'.
	 * @see TTMCConstraint.BinaryExpression
	 * @generated
	 */
	EClass getBinaryExpression();

	/**
	 * Returns the meta object for the containment reference '{@link TTMCConstraint.BinaryExpression#getLeftOperand <em>Left Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Operand</em>'.
	 * @see TTMCConstraint.BinaryExpression#getLeftOperand()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_LeftOperand();

	/**
	 * Returns the meta object for the containment reference '{@link TTMCConstraint.BinaryExpression#getRightOperand <em>Right Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Operand</em>'.
	 * @see TTMCConstraint.BinaryExpression#getRightOperand()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_RightOperand();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.MultiaryExpression <em>Multiary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiary Expression</em>'.
	 * @see TTMCConstraint.MultiaryExpression
	 * @generated
	 */
	EClass getMultiaryExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link TTMCConstraint.MultiaryExpression#getOperands <em>Operands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operands</em>'.
	 * @see TTMCConstraint.MultiaryExpression#getOperands()
	 * @see #getMultiaryExpression()
	 * @generated
	 */
	EReference getMultiaryExpression_Operands();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.PredicateExpression <em>Predicate Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicate Expression</em>'.
	 * @see TTMCConstraint.PredicateExpression
	 * @generated
	 */
	EClass getPredicateExpression();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.ArithmeticExpression <em>Arithmetic Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arithmetic Expression</em>'.
	 * @see TTMCConstraint.ArithmeticExpression
	 * @generated
	 */
	EClass getArithmeticExpression();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.AccessExpression <em>Access Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Expression</em>'.
	 * @see TTMCConstraint.AccessExpression
	 * @generated
	 */
	EClass getAccessExpression();

	/**
	 * Returns the meta object for the containment reference '{@link TTMCConstraint.AccessExpression#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand</em>'.
	 * @see TTMCConstraint.AccessExpression#getOperand()
	 * @see #getAccessExpression()
	 * @generated
	 */
	EReference getAccessExpression_Operand();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.BooleanExpression <em>Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Expression</em>'.
	 * @see TTMCConstraint.BooleanExpression
	 * @generated
	 */
	EClass getBooleanExpression();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.QuantifierExpression <em>Quantifier Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantifier Expression</em>'.
	 * @see TTMCConstraint.QuantifierExpression
	 * @generated
	 */
	EClass getQuantifierExpression();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.TemporalExpression <em>Temporal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temporal Expression</em>'.
	 * @see TTMCConstraint.TemporalExpression
	 * @generated
	 */
	EClass getTemporalExpression();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.TemporalPathExpression <em>Temporal Path Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temporal Path Expression</em>'.
	 * @see TTMCConstraint.TemporalPathExpression
	 * @generated
	 */
	EClass getTemporalPathExpression();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.TemporalStateExpression <em>Temporal State Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temporal State Expression</em>'.
	 * @see TTMCConstraint.TemporalStateExpression
	 * @generated
	 */
	EClass getTemporalStateExpression();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.LiteralExpression <em>Literal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Expression</em>'.
	 * @see TTMCConstraint.LiteralExpression
	 * @generated
	 */
	EClass getLiteralExpression();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.ArithmeticLiteralExpression <em>Arithmetic Literal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arithmetic Literal Expression</em>'.
	 * @see TTMCConstraint.ArithmeticLiteralExpression
	 * @generated
	 */
	EClass getArithmeticLiteralExpression();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.IntegerLiteralExpression <em>Integer Literal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Literal Expression</em>'.
	 * @see TTMCConstraint.IntegerLiteralExpression
	 * @generated
	 */
	EClass getIntegerLiteralExpression();

	/**
	 * Returns the meta object for the attribute '{@link TTMCConstraint.IntegerLiteralExpression#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see TTMCConstraint.IntegerLiteralExpression#getValue()
	 * @see #getIntegerLiteralExpression()
	 * @generated
	 */
	EAttribute getIntegerLiteralExpression_Value();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.DecimalLiteralExpression <em>Decimal Literal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decimal Literal Expression</em>'.
	 * @see TTMCConstraint.DecimalLiteralExpression
	 * @generated
	 */
	EClass getDecimalLiteralExpression();

	/**
	 * Returns the meta object for the attribute '{@link TTMCConstraint.DecimalLiteralExpression#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see TTMCConstraint.DecimalLiteralExpression#getValue()
	 * @see #getDecimalLiteralExpression()
	 * @generated
	 */
	EAttribute getDecimalLiteralExpression_Value();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.RationalLiteralExpression <em>Rational Literal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rational Literal Expression</em>'.
	 * @see TTMCConstraint.RationalLiteralExpression
	 * @generated
	 */
	EClass getRationalLiteralExpression();

	/**
	 * Returns the meta object for the attribute '{@link TTMCConstraint.RationalLiteralExpression#getNumerator <em>Numerator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numerator</em>'.
	 * @see TTMCConstraint.RationalLiteralExpression#getNumerator()
	 * @see #getRationalLiteralExpression()
	 * @generated
	 */
	EAttribute getRationalLiteralExpression_Numerator();

	/**
	 * Returns the meta object for the attribute '{@link TTMCConstraint.RationalLiteralExpression#getDenominator <em>Denominator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Denominator</em>'.
	 * @see TTMCConstraint.RationalLiteralExpression#getDenominator()
	 * @see #getRationalLiteralExpression()
	 * @generated
	 */
	EAttribute getRationalLiteralExpression_Denominator();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.BooleanLiteralExpression <em>Boolean Literal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Literal Expression</em>'.
	 * @see TTMCConstraint.BooleanLiteralExpression
	 * @generated
	 */
	EClass getBooleanLiteralExpression();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.TrueExpression <em>True Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>True Expression</em>'.
	 * @see TTMCConstraint.TrueExpression
	 * @generated
	 */
	EClass getTrueExpression();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.FalseExpression <em>False Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>False Expression</em>'.
	 * @see TTMCConstraint.FalseExpression
	 * @generated
	 */
	EClass getFalseExpression();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.ArrayLiteralExpression <em>Array Literal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Literal Expression</em>'.
	 * @see TTMCConstraint.ArrayLiteralExpression
	 * @generated
	 */
	EClass getArrayLiteralExpression();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.FunctionLiteralExpression <em>Function Literal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Literal Expression</em>'.
	 * @see TTMCConstraint.FunctionLiteralExpression
	 * @generated
	 */
	EClass getFunctionLiteralExpression();

	/**
	 * Returns the meta object for the containment reference '{@link TTMCConstraint.FunctionLiteralExpression#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Type</em>'.
	 * @see TTMCConstraint.FunctionLiteralExpression#getReturnType()
	 * @see #getFunctionLiteralExpression()
	 * @generated
	 */
	EReference getFunctionLiteralExpression_ReturnType();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.RecordLiteralExpression <em>Record Literal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Record Literal Expression</em>'.
	 * @see TTMCConstraint.RecordLiteralExpression
	 * @generated
	 */
	EClass getRecordLiteralExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link TTMCConstraint.RecordLiteralExpression#getFieldAssignments <em>Field Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Field Assignments</em>'.
	 * @see TTMCConstraint.RecordLiteralExpression#getFieldAssignments()
	 * @see #getRecordLiteralExpression()
	 * @generated
	 */
	EReference getRecordLiteralExpression_FieldAssignments();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.FieldAssignment <em>Field Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Assignment</em>'.
	 * @see TTMCConstraint.FieldAssignment
	 * @generated
	 */
	EClass getFieldAssignment();

	/**
	 * Returns the meta object for the attribute '{@link TTMCConstraint.FieldAssignment#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see TTMCConstraint.FieldAssignment#getReference()
	 * @see #getFieldAssignment()
	 * @generated
	 */
	EAttribute getFieldAssignment_Reference();

	/**
	 * Returns the meta object for the containment reference '{@link TTMCConstraint.FieldAssignment#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see TTMCConstraint.FieldAssignment#getValue()
	 * @see #getFieldAssignment()
	 * @generated
	 */
	EReference getFieldAssignment_Value();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.EnumerationLiteralExpression <em>Enumeration Literal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Literal Expression</em>'.
	 * @see TTMCConstraint.EnumerationLiteralExpression
	 * @generated
	 */
	EClass getEnumerationLiteralExpression();

	/**
	 * Returns the meta object for the reference '{@link TTMCConstraint.EnumerationLiteralExpression#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see TTMCConstraint.EnumerationLiteralExpression#getReference()
	 * @see #getEnumerationLiteralExpression()
	 * @generated
	 */
	EReference getEnumerationLiteralExpression_Reference();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.TupleLiteralExpression <em>Tuple Literal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuple Literal Expression</em>'.
	 * @see TTMCConstraint.TupleLiteralExpression
	 * @generated
	 */
	EClass getTupleLiteralExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link TTMCConstraint.TupleLiteralExpression#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see TTMCConstraint.TupleLiteralExpression#getExpressions()
	 * @see #getTupleLiteralExpression()
	 * @generated
	 */
	EReference getTupleLiteralExpression_Expressions();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.ReferenceExpression <em>Reference Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Expression</em>'.
	 * @see TTMCConstraint.ReferenceExpression
	 * @generated
	 */
	EClass getReferenceExpression();

	/**
	 * Returns the meta object for the reference '{@link TTMCConstraint.ReferenceExpression#getDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Declaration</em>'.
	 * @see TTMCConstraint.ReferenceExpression#getDeclaration()
	 * @see #getReferenceExpression()
	 * @generated
	 */
	EReference getReferenceExpression_Declaration();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.IfThenElseExpression <em>If Then Else Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Then Else Expression</em>'.
	 * @see TTMCConstraint.IfThenElseExpression
	 * @generated
	 */
	EClass getIfThenElseExpression();

	/**
	 * Returns the meta object for the containment reference '{@link TTMCConstraint.IfThenElseExpression#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see TTMCConstraint.IfThenElseExpression#getCondition()
	 * @see #getIfThenElseExpression()
	 * @generated
	 */
	EReference getIfThenElseExpression_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link TTMCConstraint.IfThenElseExpression#getThen <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then</em>'.
	 * @see TTMCConstraint.IfThenElseExpression#getThen()
	 * @see #getIfThenElseExpression()
	 * @generated
	 */
	EReference getIfThenElseExpression_Then();

	/**
	 * Returns the meta object for the containment reference '{@link TTMCConstraint.IfThenElseExpression#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else</em>'.
	 * @see TTMCConstraint.IfThenElseExpression#getElse()
	 * @see #getIfThenElseExpression()
	 * @generated
	 */
	EReference getIfThenElseExpression_Else();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.LetExpression <em>Let Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Let Expression</em>'.
	 * @see TTMCConstraint.LetExpression
	 * @generated
	 */
	EClass getLetExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link TTMCConstraint.LetExpression#getLetDeclarations <em>Let Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Let Declarations</em>'.
	 * @see TTMCConstraint.LetExpression#getLetDeclarations()
	 * @see #getLetExpression()
	 * @generated
	 */
	EReference getLetExpression_LetDeclarations();

	/**
	 * Returns the meta object for the containment reference '{@link TTMCConstraint.LetExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see TTMCConstraint.LetExpression#getExpression()
	 * @see #getLetExpression()
	 * @generated
	 */
	EReference getLetExpression_Expression();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.EqualExpression <em>Equal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equal Expression</em>'.
	 * @see TTMCConstraint.EqualExpression
	 * @generated
	 */
	EClass getEqualExpression();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.ImplyExpression <em>Imply Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Imply Expression</em>'.
	 * @see TTMCConstraint.ImplyExpression
	 * @generated
	 */
	EClass getImplyExpression();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.OrExpression <em>Or Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Expression</em>'.
	 * @see TTMCConstraint.OrExpression
	 * @generated
	 */
	EClass getOrExpression();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.AndExpression <em>And Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Expression</em>'.
	 * @see TTMCConstraint.AndExpression
	 * @generated
	 */
	EClass getAndExpression();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.ReleaseExpression <em>Release Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Release Expression</em>'.
	 * @see TTMCConstraint.ReleaseExpression
	 * @generated
	 */
	EClass getReleaseExpression();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.UntilExpression <em>Until Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Until Expression</em>'.
	 * @see TTMCConstraint.UntilExpression
	 * @generated
	 */
	EClass getUntilExpression();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.NotExpression <em>Not Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Expression</em>'.
	 * @see TTMCConstraint.NotExpression
	 * @generated
	 */
	EClass getNotExpression();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.ForallExpression <em>Forall Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forall Expression</em>'.
	 * @see TTMCConstraint.ForallExpression
	 * @generated
	 */
	EClass getForallExpression();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.ExistsExpression <em>Exists Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exists Expression</em>'.
	 * @see TTMCConstraint.ExistsExpression
	 * @generated
	 */
	EClass getExistsExpression();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.GloballyExpression <em>Globally Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Globally Expression</em>'.
	 * @see TTMCConstraint.GloballyExpression
	 * @generated
	 */
	EClass getGloballyExpression();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.FinallyExpression <em>Finally Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Finally Expression</em>'.
	 * @see TTMCConstraint.FinallyExpression
	 * @generated
	 */
	EClass getFinallyExpression();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.NextExpression <em>Next Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Next Expression</em>'.
	 * @see TTMCConstraint.NextExpression
	 * @generated
	 */
	EClass getNextExpression();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.TemporalForallExpression <em>Temporal Forall Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temporal Forall Expression</em>'.
	 * @see TTMCConstraint.TemporalForallExpression
	 * @generated
	 */
	EClass getTemporalForallExpression();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.TemporalExistsExpression <em>Temporal Exists Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temporal Exists Expression</em>'.
	 * @see TTMCConstraint.TemporalExistsExpression
	 * @generated
	 */
	EClass getTemporalExistsExpression();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.InExpression <em>In Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Expression</em>'.
	 * @see TTMCConstraint.InExpression
	 * @generated
	 */
	EClass getInExpression();

	/**
	 * Returns the meta object for the containment reference '{@link TTMCConstraint.InExpression#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see TTMCConstraint.InExpression#getType()
	 * @see #getInExpression()
	 * @generated
	 */
	EReference getInExpression_Type();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.PrimedExpression <em>Primed Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primed Expression</em>'.
	 * @see TTMCConstraint.PrimedExpression
	 * @generated
	 */
	EClass getPrimedExpression();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.EquivalenceExpression <em>Equivalence Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equivalence Expression</em>'.
	 * @see TTMCConstraint.EquivalenceExpression
	 * @generated
	 */
	EClass getEquivalenceExpression();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.EqualityExpression <em>Equality Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equality Expression</em>'.
	 * @see TTMCConstraint.EqualityExpression
	 * @generated
	 */
	EClass getEqualityExpression();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.InequalityExpression <em>Inequality Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inequality Expression</em>'.
	 * @see TTMCConstraint.InequalityExpression
	 * @generated
	 */
	EClass getInequalityExpression();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.ComparisionExpression <em>Comparision Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparision Expression</em>'.
	 * @see TTMCConstraint.ComparisionExpression
	 * @generated
	 */
	EClass getComparisionExpression();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.GreaterExpression <em>Greater Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater Expression</em>'.
	 * @see TTMCConstraint.GreaterExpression
	 * @generated
	 */
	EClass getGreaterExpression();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.GreaterEqualExpression <em>Greater Equal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater Equal Expression</em>'.
	 * @see TTMCConstraint.GreaterEqualExpression
	 * @generated
	 */
	EClass getGreaterEqualExpression();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.LessExpression <em>Less Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Less Expression</em>'.
	 * @see TTMCConstraint.LessExpression
	 * @generated
	 */
	EClass getLessExpression();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.LessEqualExpression <em>Less Equal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Less Equal Expression</em>'.
	 * @see TTMCConstraint.LessEqualExpression
	 * @generated
	 */
	EClass getLessEqualExpression();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.AddExpression <em>Add Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Expression</em>'.
	 * @see TTMCConstraint.AddExpression
	 * @generated
	 */
	EClass getAddExpression();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.SubtractExpression <em>Subtract Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subtract Expression</em>'.
	 * @see TTMCConstraint.SubtractExpression
	 * @generated
	 */
	EClass getSubtractExpression();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.MultiplyExpression <em>Multiply Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiply Expression</em>'.
	 * @see TTMCConstraint.MultiplyExpression
	 * @generated
	 */
	EClass getMultiplyExpression();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.DivideExpression <em>Divide Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Divide Expression</em>'.
	 * @see TTMCConstraint.DivideExpression
	 * @generated
	 */
	EClass getDivideExpression();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.DivExpression <em>Div Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Div Expression</em>'.
	 * @see TTMCConstraint.DivExpression
	 * @generated
	 */
	EClass getDivExpression();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.ModExpression <em>Mod Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mod Expression</em>'.
	 * @see TTMCConstraint.ModExpression
	 * @generated
	 */
	EClass getModExpression();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.UnaryMinusExpression <em>Unary Minus Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Minus Expression</em>'.
	 * @see TTMCConstraint.UnaryMinusExpression
	 * @generated
	 */
	EClass getUnaryMinusExpression();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.UnaryPlusExpression <em>Unary Plus Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Plus Expression</em>'.
	 * @see TTMCConstraint.UnaryPlusExpression
	 * @generated
	 */
	EClass getUnaryPlusExpression();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.FunctionAccessExpression <em>Function Access Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Access Expression</em>'.
	 * @see TTMCConstraint.FunctionAccessExpression
	 * @generated
	 */
	EClass getFunctionAccessExpression();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.ArrayAccessExpression <em>Array Access Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Access Expression</em>'.
	 * @see TTMCConstraint.ArrayAccessExpression
	 * @generated
	 */
	EClass getArrayAccessExpression();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.TupleAccessExpression <em>Tuple Access Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuple Access Expression</em>'.
	 * @see TTMCConstraint.TupleAccessExpression
	 * @generated
	 */
	EClass getTupleAccessExpression();

	/**
	 * Returns the meta object for the attribute '{@link TTMCConstraint.TupleAccessExpression#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see TTMCConstraint.TupleAccessExpression#getIndex()
	 * @see #getTupleAccessExpression()
	 * @generated
	 */
	EAttribute getTupleAccessExpression_Index();

	/**
	 * Returns the meta object for class '{@link TTMCConstraint.RecordAccessExpression <em>Record Access Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Record Access Expression</em>'.
	 * @see TTMCConstraint.RecordAccessExpression
	 * @generated
	 */
	EClass getRecordAccessExpression();

	/**
	 * Returns the meta object for the attribute '{@link TTMCConstraint.RecordAccessExpression#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field</em>'.
	 * @see TTMCConstraint.RecordAccessExpression#getField()
	 * @see #getRecordAccessExpression()
	 * @generated
	 */
	EAttribute getRecordAccessExpression_Field();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TTMCConstraintFactory getTTMCConstraintFactory();

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
		 * The meta object literal for the '{@link TTMCConstraint.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.NamedElementImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.ParametricElementImpl <em>Parametric Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.ParametricElementImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getParametricElement()
		 * @generated
		 */
		EClass PARAMETRIC_ELEMENT = eINSTANCE.getParametricElement();

		/**
		 * The meta object literal for the '<em><b>Parameter Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETRIC_ELEMENT__PARAMETER_DECLARATIONS = eINSTANCE.getParametricElement_ParameterDeclarations();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.ParametrizedElementImpl <em>Parametrized Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.ParametrizedElementImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getParametrizedElement()
		 * @generated
		 */
		EClass PARAMETRIZED_ELEMENT = eINSTANCE.getParametrizedElement();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETRIZED_ELEMENT__PARAMETERS = eINSTANCE.getParametrizedElement_Parameters();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.ConstraintSpecificationImpl <em>Constraint Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.ConstraintSpecificationImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getConstraintSpecification()
		 * @generated
		 */
		EClass CONSTRAINT_SPECIFICATION = eINSTANCE.getConstraintSpecification();

		/**
		 * The meta object literal for the '<em><b>Type Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT_SPECIFICATION__TYPE_DECLARATIONS = eINSTANCE.getConstraintSpecification_TypeDeclarations();

		/**
		 * The meta object literal for the '<em><b>Constant Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT_SPECIFICATION__CONSTANT_DECLARATIONS = eINSTANCE.getConstraintSpecification_ConstantDeclarations();

		/**
		 * The meta object literal for the '<em><b>Function Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT_SPECIFICATION__FUNCTION_DECLARATIONS = eINSTANCE.getConstraintSpecification_FunctionDeclarations();

		/**
		 * The meta object literal for the '<em><b>Basic Constraint Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT_SPECIFICATION__BASIC_CONSTRAINT_DEFINITIONS = eINSTANCE.getConstraintSpecification_BasicConstraintDefinitions();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.DeclarationImpl <em>Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.DeclarationImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getDeclaration()
		 * @generated
		 */
		EClass DECLARATION = eINSTANCE.getDeclaration();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARATION__TYPE = eINSTANCE.getDeclaration_Type();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.DefinableDeclarationImpl <em>Definable Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.DefinableDeclarationImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getDefinableDeclaration()
		 * @generated
		 */
		EClass DEFINABLE_DECLARATION = eINSTANCE.getDefinableDeclaration();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINABLE_DECLARATION__EXPRESSION = eINSTANCE.getDefinableDeclaration_Expression();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.ParameterDeclarationImpl <em>Parameter Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.ParameterDeclarationImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getParameterDeclaration()
		 * @generated
		 */
		EClass PARAMETER_DECLARATION = eINSTANCE.getParameterDeclaration();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.FieldDeclarationImpl <em>Field Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.FieldDeclarationImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getFieldDeclaration()
		 * @generated
		 */
		EClass FIELD_DECLARATION = eINSTANCE.getFieldDeclaration();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.LetDeclarationImpl <em>Let Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.LetDeclarationImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getLetDeclaration()
		 * @generated
		 */
		EClass LET_DECLARATION = eINSTANCE.getLetDeclaration();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.ConstantDeclarationImpl <em>Constant Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.ConstantDeclarationImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getConstantDeclaration()
		 * @generated
		 */
		EClass CONSTANT_DECLARATION = eINSTANCE.getConstantDeclaration();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.FunctionDeclarationImpl <em>Function Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.FunctionDeclarationImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getFunctionDeclaration()
		 * @generated
		 */
		EClass FUNCTION_DECLARATION = eINSTANCE.getFunctionDeclaration();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.TypeImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.TypeDeclarationImpl <em>Type Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.TypeDeclarationImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getTypeDeclaration()
		 * @generated
		 */
		EClass TYPE_DECLARATION = eINSTANCE.getTypeDeclaration();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_DECLARATION__TYPE = eINSTANCE.getTypeDeclaration_Type();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.TypeReferenceImpl <em>Type Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.TypeReferenceImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getTypeReference()
		 * @generated
		 */
		EClass TYPE_REFERENCE = eINSTANCE.getTypeReference();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_REFERENCE__REFERENCE = eINSTANCE.getTypeReference_Reference();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.TypeDefinitionImpl <em>Type Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.TypeDefinitionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getTypeDefinition()
		 * @generated
		 */
		EClass TYPE_DEFINITION = eINSTANCE.getTypeDefinition();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.BasicTypeDefinitionImpl <em>Basic Type Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.BasicTypeDefinitionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getBasicTypeDefinition()
		 * @generated
		 */
		EClass BASIC_TYPE_DEFINITION = eINSTANCE.getBasicTypeDefinition();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.IntegerTypeDefinitionImpl <em>Integer Type Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.IntegerTypeDefinitionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getIntegerTypeDefinition()
		 * @generated
		 */
		EClass INTEGER_TYPE_DEFINITION = eINSTANCE.getIntegerTypeDefinition();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.NaturalTypeDefinitionImpl <em>Natural Type Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.NaturalTypeDefinitionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getNaturalTypeDefinition()
		 * @generated
		 */
		EClass NATURAL_TYPE_DEFINITION = eINSTANCE.getNaturalTypeDefinition();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.BooleanTypeDefinitionImpl <em>Boolean Type Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.BooleanTypeDefinitionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getBooleanTypeDefinition()
		 * @generated
		 */
		EClass BOOLEAN_TYPE_DEFINITION = eINSTANCE.getBooleanTypeDefinition();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.RealTypeDefinitionImpl <em>Real Type Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.RealTypeDefinitionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getRealTypeDefinition()
		 * @generated
		 */
		EClass REAL_TYPE_DEFINITION = eINSTANCE.getRealTypeDefinition();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.SubrangeTypeDefinitionImpl <em>Subrange Type Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.SubrangeTypeDefinitionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getSubrangeTypeDefinition()
		 * @generated
		 */
		EClass SUBRANGE_TYPE_DEFINITION = eINSTANCE.getSubrangeTypeDefinition();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBRANGE_TYPE_DEFINITION__LOWER_BOUND = eINSTANCE.getSubrangeTypeDefinition_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBRANGE_TYPE_DEFINITION__UPPER_BOUND = eINSTANCE.getSubrangeTypeDefinition_UpperBound();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.SubTypeDefinitionImpl <em>Sub Type Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.SubTypeDefinitionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getSubTypeDefinition()
		 * @generated
		 */
		EClass SUB_TYPE_DEFINITION = eINSTANCE.getSubTypeDefinition();

		/**
		 * The meta object literal for the '<em><b>Parameter Declaration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_TYPE_DEFINITION__PARAMETER_DECLARATION = eINSTANCE.getSubTypeDefinition_ParameterDeclaration();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_TYPE_DEFINITION__EXPRESSION = eINSTANCE.getSubTypeDefinition_Expression();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.EnumerationTypeDefinitionImpl <em>Enumeration Type Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.EnumerationTypeDefinitionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getEnumerationTypeDefinition()
		 * @generated
		 */
		EClass ENUMERATION_TYPE_DEFINITION = eINSTANCE.getEnumerationTypeDefinition();

		/**
		 * The meta object literal for the '<em><b>Literals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION_TYPE_DEFINITION__LITERALS = eINSTANCE.getEnumerationTypeDefinition_Literals();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.EnumerationLiteralDefinitionImpl <em>Enumeration Literal Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.EnumerationLiteralDefinitionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getEnumerationLiteralDefinition()
		 * @generated
		 */
		EClass ENUMERATION_LITERAL_DEFINITION = eINSTANCE.getEnumerationLiteralDefinition();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.FunctionTypeDefinitionImpl <em>Function Type Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.FunctionTypeDefinitionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getFunctionTypeDefinition()
		 * @generated
		 */
		EClass FUNCTION_TYPE_DEFINITION = eINSTANCE.getFunctionTypeDefinition();

		/**
		 * The meta object literal for the '<em><b>Parameter Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_TYPE_DEFINITION__PARAMETER_TYPES = eINSTANCE.getFunctionTypeDefinition_ParameterTypes();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_TYPE_DEFINITION__RETURN_TYPE = eINSTANCE.getFunctionTypeDefinition_ReturnType();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.ArrayTypeDefinitionImpl <em>Array Type Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.ArrayTypeDefinitionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getArrayTypeDefinition()
		 * @generated
		 */
		EClass ARRAY_TYPE_DEFINITION = eINSTANCE.getArrayTypeDefinition();

		/**
		 * The meta object literal for the '<em><b>Index Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_TYPE_DEFINITION__INDEX_TYPES = eINSTANCE.getArrayTypeDefinition_IndexTypes();

		/**
		 * The meta object literal for the '<em><b>Element Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_TYPE_DEFINITION__ELEMENT_TYPE = eINSTANCE.getArrayTypeDefinition_ElementType();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.TupleTypeDefinitionImpl <em>Tuple Type Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.TupleTypeDefinitionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getTupleTypeDefinition()
		 * @generated
		 */
		EClass TUPLE_TYPE_DEFINITION = eINSTANCE.getTupleTypeDefinition();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TUPLE_TYPE_DEFINITION__TYPES = eINSTANCE.getTupleTypeDefinition_Types();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.RecordTypeDefinitionImpl <em>Record Type Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.RecordTypeDefinitionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getRecordTypeDefinition()
		 * @generated
		 */
		EClass RECORD_TYPE_DEFINITION = eINSTANCE.getRecordTypeDefinition();

		/**
		 * The meta object literal for the '<em><b>Field Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECORD_TYPE_DEFINITION__FIELD_DECLARATIONS = eINSTANCE.getRecordTypeDefinition_FieldDeclarations();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.ConstraintDefinitionImpl <em>Constraint Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.ConstraintDefinitionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getConstraintDefinition()
		 * @generated
		 */
		EClass CONSTRAINT_DEFINITION = eINSTANCE.getConstraintDefinition();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT_DEFINITION__EXPRESSION = eINSTANCE.getConstraintDefinition_Expression();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.BasicConstraintDefinitionImpl <em>Basic Constraint Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.BasicConstraintDefinitionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getBasicConstraintDefinition()
		 * @generated
		 */
		EClass BASIC_CONSTRAINT_DEFINITION = eINSTANCE.getBasicConstraintDefinition();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.ExpressionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.NullaryExpressionImpl <em>Nullary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.NullaryExpressionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getNullaryExpression()
		 * @generated
		 */
		EClass NULLARY_EXPRESSION = eINSTANCE.getNullaryExpression();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.UnaryExpressionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getUnaryExpression()
		 * @generated
		 */
		EClass UNARY_EXPRESSION = eINSTANCE.getUnaryExpression();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_EXPRESSION__OPERAND = eINSTANCE.getUnaryExpression_Operand();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.BinaryExpressionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getBinaryExpression()
		 * @generated
		 */
		EClass BINARY_EXPRESSION = eINSTANCE.getBinaryExpression();

		/**
		 * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__LEFT_OPERAND = eINSTANCE.getBinaryExpression_LeftOperand();

		/**
		 * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__RIGHT_OPERAND = eINSTANCE.getBinaryExpression_RightOperand();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.MultiaryExpressionImpl <em>Multiary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.MultiaryExpressionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getMultiaryExpression()
		 * @generated
		 */
		EClass MULTIARY_EXPRESSION = eINSTANCE.getMultiaryExpression();

		/**
		 * The meta object literal for the '<em><b>Operands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIARY_EXPRESSION__OPERANDS = eINSTANCE.getMultiaryExpression_Operands();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.PredicateExpressionImpl <em>Predicate Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.PredicateExpressionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getPredicateExpression()
		 * @generated
		 */
		EClass PREDICATE_EXPRESSION = eINSTANCE.getPredicateExpression();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.ArithmeticExpressionImpl <em>Arithmetic Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.ArithmeticExpressionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getArithmeticExpression()
		 * @generated
		 */
		EClass ARITHMETIC_EXPRESSION = eINSTANCE.getArithmeticExpression();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.AccessExpressionImpl <em>Access Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.AccessExpressionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getAccessExpression()
		 * @generated
		 */
		EClass ACCESS_EXPRESSION = eINSTANCE.getAccessExpression();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_EXPRESSION__OPERAND = eINSTANCE.getAccessExpression_Operand();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.BooleanExpressionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getBooleanExpression()
		 * @generated
		 */
		EClass BOOLEAN_EXPRESSION = eINSTANCE.getBooleanExpression();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.QuantifierExpressionImpl <em>Quantifier Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.QuantifierExpressionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getQuantifierExpression()
		 * @generated
		 */
		EClass QUANTIFIER_EXPRESSION = eINSTANCE.getQuantifierExpression();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.TemporalExpressionImpl <em>Temporal Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.TemporalExpressionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getTemporalExpression()
		 * @generated
		 */
		EClass TEMPORAL_EXPRESSION = eINSTANCE.getTemporalExpression();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.TemporalPathExpressionImpl <em>Temporal Path Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.TemporalPathExpressionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getTemporalPathExpression()
		 * @generated
		 */
		EClass TEMPORAL_PATH_EXPRESSION = eINSTANCE.getTemporalPathExpression();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.TemporalStateExpressionImpl <em>Temporal State Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.TemporalStateExpressionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getTemporalStateExpression()
		 * @generated
		 */
		EClass TEMPORAL_STATE_EXPRESSION = eINSTANCE.getTemporalStateExpression();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.LiteralExpressionImpl <em>Literal Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.LiteralExpressionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getLiteralExpression()
		 * @generated
		 */
		EClass LITERAL_EXPRESSION = eINSTANCE.getLiteralExpression();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.ArithmeticLiteralExpressionImpl <em>Arithmetic Literal Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.ArithmeticLiteralExpressionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getArithmeticLiteralExpression()
		 * @generated
		 */
		EClass ARITHMETIC_LITERAL_EXPRESSION = eINSTANCE.getArithmeticLiteralExpression();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.IntegerLiteralExpressionImpl <em>Integer Literal Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.IntegerLiteralExpressionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getIntegerLiteralExpression()
		 * @generated
		 */
		EClass INTEGER_LITERAL_EXPRESSION = eINSTANCE.getIntegerLiteralExpression();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_LITERAL_EXPRESSION__VALUE = eINSTANCE.getIntegerLiteralExpression_Value();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.DecimalLiteralExpressionImpl <em>Decimal Literal Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.DecimalLiteralExpressionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getDecimalLiteralExpression()
		 * @generated
		 */
		EClass DECIMAL_LITERAL_EXPRESSION = eINSTANCE.getDecimalLiteralExpression();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECIMAL_LITERAL_EXPRESSION__VALUE = eINSTANCE.getDecimalLiteralExpression_Value();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.RationalLiteralExpressionImpl <em>Rational Literal Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.RationalLiteralExpressionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getRationalLiteralExpression()
		 * @generated
		 */
		EClass RATIONAL_LITERAL_EXPRESSION = eINSTANCE.getRationalLiteralExpression();

		/**
		 * The meta object literal for the '<em><b>Numerator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATIONAL_LITERAL_EXPRESSION__NUMERATOR = eINSTANCE.getRationalLiteralExpression_Numerator();

		/**
		 * The meta object literal for the '<em><b>Denominator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATIONAL_LITERAL_EXPRESSION__DENOMINATOR = eINSTANCE.getRationalLiteralExpression_Denominator();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.BooleanLiteralExpressionImpl <em>Boolean Literal Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.BooleanLiteralExpressionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getBooleanLiteralExpression()
		 * @generated
		 */
		EClass BOOLEAN_LITERAL_EXPRESSION = eINSTANCE.getBooleanLiteralExpression();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.TrueExpressionImpl <em>True Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.TrueExpressionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getTrueExpression()
		 * @generated
		 */
		EClass TRUE_EXPRESSION = eINSTANCE.getTrueExpression();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.FalseExpressionImpl <em>False Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.FalseExpressionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getFalseExpression()
		 * @generated
		 */
		EClass FALSE_EXPRESSION = eINSTANCE.getFalseExpression();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.ArrayLiteralExpressionImpl <em>Array Literal Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.ArrayLiteralExpressionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getArrayLiteralExpression()
		 * @generated
		 */
		EClass ARRAY_LITERAL_EXPRESSION = eINSTANCE.getArrayLiteralExpression();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.FunctionLiteralExpressionImpl <em>Function Literal Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.FunctionLiteralExpressionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getFunctionLiteralExpression()
		 * @generated
		 */
		EClass FUNCTION_LITERAL_EXPRESSION = eINSTANCE.getFunctionLiteralExpression();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_LITERAL_EXPRESSION__RETURN_TYPE = eINSTANCE.getFunctionLiteralExpression_ReturnType();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.RecordLiteralExpressionImpl <em>Record Literal Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.RecordLiteralExpressionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getRecordLiteralExpression()
		 * @generated
		 */
		EClass RECORD_LITERAL_EXPRESSION = eINSTANCE.getRecordLiteralExpression();

		/**
		 * The meta object literal for the '<em><b>Field Assignments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECORD_LITERAL_EXPRESSION__FIELD_ASSIGNMENTS = eINSTANCE.getRecordLiteralExpression_FieldAssignments();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.FieldAssignmentImpl <em>Field Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.FieldAssignmentImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getFieldAssignment()
		 * @generated
		 */
		EClass FIELD_ASSIGNMENT = eINSTANCE.getFieldAssignment();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_ASSIGNMENT__REFERENCE = eINSTANCE.getFieldAssignment_Reference();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_ASSIGNMENT__VALUE = eINSTANCE.getFieldAssignment_Value();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.EnumerationLiteralExpressionImpl <em>Enumeration Literal Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.EnumerationLiteralExpressionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getEnumerationLiteralExpression()
		 * @generated
		 */
		EClass ENUMERATION_LITERAL_EXPRESSION = eINSTANCE.getEnumerationLiteralExpression();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION_LITERAL_EXPRESSION__REFERENCE = eINSTANCE.getEnumerationLiteralExpression_Reference();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.TupleLiteralExpressionImpl <em>Tuple Literal Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.TupleLiteralExpressionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getTupleLiteralExpression()
		 * @generated
		 */
		EClass TUPLE_LITERAL_EXPRESSION = eINSTANCE.getTupleLiteralExpression();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TUPLE_LITERAL_EXPRESSION__EXPRESSIONS = eINSTANCE.getTupleLiteralExpression_Expressions();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.ReferenceExpressionImpl <em>Reference Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.ReferenceExpressionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getReferenceExpression()
		 * @generated
		 */
		EClass REFERENCE_EXPRESSION = eINSTANCE.getReferenceExpression();

		/**
		 * The meta object literal for the '<em><b>Declaration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_EXPRESSION__DECLARATION = eINSTANCE.getReferenceExpression_Declaration();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.IfThenElseExpressionImpl <em>If Then Else Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.IfThenElseExpressionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getIfThenElseExpression()
		 * @generated
		 */
		EClass IF_THEN_ELSE_EXPRESSION = eINSTANCE.getIfThenElseExpression();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_THEN_ELSE_EXPRESSION__CONDITION = eINSTANCE.getIfThenElseExpression_Condition();

		/**
		 * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_THEN_ELSE_EXPRESSION__THEN = eINSTANCE.getIfThenElseExpression_Then();

		/**
		 * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_THEN_ELSE_EXPRESSION__ELSE = eINSTANCE.getIfThenElseExpression_Else();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.LetExpressionImpl <em>Let Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.LetExpressionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getLetExpression()
		 * @generated
		 */
		EClass LET_EXPRESSION = eINSTANCE.getLetExpression();

		/**
		 * The meta object literal for the '<em><b>Let Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LET_EXPRESSION__LET_DECLARATIONS = eINSTANCE.getLetExpression_LetDeclarations();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LET_EXPRESSION__EXPRESSION = eINSTANCE.getLetExpression_Expression();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.EqualExpressionImpl <em>Equal Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.EqualExpressionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getEqualExpression()
		 * @generated
		 */
		EClass EQUAL_EXPRESSION = eINSTANCE.getEqualExpression();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.ImplyExpressionImpl <em>Imply Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.ImplyExpressionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getImplyExpression()
		 * @generated
		 */
		EClass IMPLY_EXPRESSION = eINSTANCE.getImplyExpression();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.OrExpressionImpl <em>Or Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.OrExpressionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getOrExpression()
		 * @generated
		 */
		EClass OR_EXPRESSION = eINSTANCE.getOrExpression();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.AndExpressionImpl <em>And Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.AndExpressionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getAndExpression()
		 * @generated
		 */
		EClass AND_EXPRESSION = eINSTANCE.getAndExpression();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.ReleaseExpressionImpl <em>Release Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.ReleaseExpressionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getReleaseExpression()
		 * @generated
		 */
		EClass RELEASE_EXPRESSION = eINSTANCE.getReleaseExpression();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.UntilExpressionImpl <em>Until Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.UntilExpressionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getUntilExpression()
		 * @generated
		 */
		EClass UNTIL_EXPRESSION = eINSTANCE.getUntilExpression();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.NotExpressionImpl <em>Not Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.NotExpressionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getNotExpression()
		 * @generated
		 */
		EClass NOT_EXPRESSION = eINSTANCE.getNotExpression();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.ForallExpressionImpl <em>Forall Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.ForallExpressionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getForallExpression()
		 * @generated
		 */
		EClass FORALL_EXPRESSION = eINSTANCE.getForallExpression();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.ExistsExpressionImpl <em>Exists Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.ExistsExpressionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getExistsExpression()
		 * @generated
		 */
		EClass EXISTS_EXPRESSION = eINSTANCE.getExistsExpression();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.GloballyExpressionImpl <em>Globally Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.GloballyExpressionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getGloballyExpression()
		 * @generated
		 */
		EClass GLOBALLY_EXPRESSION = eINSTANCE.getGloballyExpression();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.FinallyExpressionImpl <em>Finally Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.FinallyExpressionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getFinallyExpression()
		 * @generated
		 */
		EClass FINALLY_EXPRESSION = eINSTANCE.getFinallyExpression();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.NextExpressionImpl <em>Next Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.NextExpressionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getNextExpression()
		 * @generated
		 */
		EClass NEXT_EXPRESSION = eINSTANCE.getNextExpression();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.TemporalForallExpressionImpl <em>Temporal Forall Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.TemporalForallExpressionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getTemporalForallExpression()
		 * @generated
		 */
		EClass TEMPORAL_FORALL_EXPRESSION = eINSTANCE.getTemporalForallExpression();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.TemporalExistsExpressionImpl <em>Temporal Exists Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.TemporalExistsExpressionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getTemporalExistsExpression()
		 * @generated
		 */
		EClass TEMPORAL_EXISTS_EXPRESSION = eINSTANCE.getTemporalExistsExpression();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.InExpressionImpl <em>In Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.InExpressionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getInExpression()
		 * @generated
		 */
		EClass IN_EXPRESSION = eINSTANCE.getInExpression();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IN_EXPRESSION__TYPE = eINSTANCE.getInExpression_Type();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.PrimedExpressionImpl <em>Primed Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.PrimedExpressionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getPrimedExpression()
		 * @generated
		 */
		EClass PRIMED_EXPRESSION = eINSTANCE.getPrimedExpression();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.EquivalenceExpressionImpl <em>Equivalence Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.EquivalenceExpressionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getEquivalenceExpression()
		 * @generated
		 */
		EClass EQUIVALENCE_EXPRESSION = eINSTANCE.getEquivalenceExpression();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.EqualityExpressionImpl <em>Equality Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.EqualityExpressionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getEqualityExpression()
		 * @generated
		 */
		EClass EQUALITY_EXPRESSION = eINSTANCE.getEqualityExpression();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.InequalityExpressionImpl <em>Inequality Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.InequalityExpressionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getInequalityExpression()
		 * @generated
		 */
		EClass INEQUALITY_EXPRESSION = eINSTANCE.getInequalityExpression();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.ComparisionExpressionImpl <em>Comparision Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.ComparisionExpressionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getComparisionExpression()
		 * @generated
		 */
		EClass COMPARISION_EXPRESSION = eINSTANCE.getComparisionExpression();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.GreaterExpressionImpl <em>Greater Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.GreaterExpressionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getGreaterExpression()
		 * @generated
		 */
		EClass GREATER_EXPRESSION = eINSTANCE.getGreaterExpression();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.GreaterEqualExpressionImpl <em>Greater Equal Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.GreaterEqualExpressionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getGreaterEqualExpression()
		 * @generated
		 */
		EClass GREATER_EQUAL_EXPRESSION = eINSTANCE.getGreaterEqualExpression();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.LessExpressionImpl <em>Less Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.LessExpressionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getLessExpression()
		 * @generated
		 */
		EClass LESS_EXPRESSION = eINSTANCE.getLessExpression();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.LessEqualExpressionImpl <em>Less Equal Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.LessEqualExpressionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getLessEqualExpression()
		 * @generated
		 */
		EClass LESS_EQUAL_EXPRESSION = eINSTANCE.getLessEqualExpression();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.AddExpressionImpl <em>Add Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.AddExpressionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getAddExpression()
		 * @generated
		 */
		EClass ADD_EXPRESSION = eINSTANCE.getAddExpression();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.SubtractExpressionImpl <em>Subtract Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.SubtractExpressionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getSubtractExpression()
		 * @generated
		 */
		EClass SUBTRACT_EXPRESSION = eINSTANCE.getSubtractExpression();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.MultiplyExpressionImpl <em>Multiply Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.MultiplyExpressionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getMultiplyExpression()
		 * @generated
		 */
		EClass MULTIPLY_EXPRESSION = eINSTANCE.getMultiplyExpression();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.DivideExpressionImpl <em>Divide Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.DivideExpressionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getDivideExpression()
		 * @generated
		 */
		EClass DIVIDE_EXPRESSION = eINSTANCE.getDivideExpression();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.DivExpressionImpl <em>Div Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.DivExpressionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getDivExpression()
		 * @generated
		 */
		EClass DIV_EXPRESSION = eINSTANCE.getDivExpression();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.ModExpressionImpl <em>Mod Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.ModExpressionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getModExpression()
		 * @generated
		 */
		EClass MOD_EXPRESSION = eINSTANCE.getModExpression();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.UnaryMinusExpressionImpl <em>Unary Minus Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.UnaryMinusExpressionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getUnaryMinusExpression()
		 * @generated
		 */
		EClass UNARY_MINUS_EXPRESSION = eINSTANCE.getUnaryMinusExpression();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.UnaryPlusExpressionImpl <em>Unary Plus Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.UnaryPlusExpressionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getUnaryPlusExpression()
		 * @generated
		 */
		EClass UNARY_PLUS_EXPRESSION = eINSTANCE.getUnaryPlusExpression();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.FunctionAccessExpressionImpl <em>Function Access Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.FunctionAccessExpressionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getFunctionAccessExpression()
		 * @generated
		 */
		EClass FUNCTION_ACCESS_EXPRESSION = eINSTANCE.getFunctionAccessExpression();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.ArrayAccessExpressionImpl <em>Array Access Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.ArrayAccessExpressionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getArrayAccessExpression()
		 * @generated
		 */
		EClass ARRAY_ACCESS_EXPRESSION = eINSTANCE.getArrayAccessExpression();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.TupleAccessExpressionImpl <em>Tuple Access Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.TupleAccessExpressionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getTupleAccessExpression()
		 * @generated
		 */
		EClass TUPLE_ACCESS_EXPRESSION = eINSTANCE.getTupleAccessExpression();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUPLE_ACCESS_EXPRESSION__INDEX = eINSTANCE.getTupleAccessExpression_Index();

		/**
		 * The meta object literal for the '{@link TTMCConstraint.impl.RecordAccessExpressionImpl <em>Record Access Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TTMCConstraint.impl.RecordAccessExpressionImpl
		 * @see TTMCConstraint.impl.TTMCConstraintPackageImpl#getRecordAccessExpression()
		 * @generated
		 */
		EClass RECORD_ACCESS_EXPRESSION = eINSTANCE.getRecordAccessExpression();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORD_ACCESS_EXPRESSION__FIELD = eINSTANCE.getRecordAccessExpression_Field();

	}

} //TTMCConstraintPackage
