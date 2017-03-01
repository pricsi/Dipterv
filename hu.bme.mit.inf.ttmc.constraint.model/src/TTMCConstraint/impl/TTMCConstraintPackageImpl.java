/**
 */
package TTMCConstraint.impl;

import TTMCConstraint.AccessExpression;
import TTMCConstraint.AddExpression;
import TTMCConstraint.AndExpression;
import TTMCConstraint.ArithmeticExpression;
import TTMCConstraint.ArithmeticLiteralExpression;
import TTMCConstraint.ArrayAccessExpression;
import TTMCConstraint.ArrayLiteralExpression;
import TTMCConstraint.ArrayTypeDefinition;
import TTMCConstraint.BasicConstraintDefinition;
import TTMCConstraint.BasicTypeDefinition;
import TTMCConstraint.BinaryExpression;
import TTMCConstraint.BooleanExpression;
import TTMCConstraint.BooleanLiteralExpression;
import TTMCConstraint.BooleanTypeDefinition;
import TTMCConstraint.ComparisionExpression;
import TTMCConstraint.ConstantDeclaration;
import TTMCConstraint.ConstraintDefinition;
import TTMCConstraint.ConstraintSpecification;
import TTMCConstraint.DecimalLiteralExpression;
import TTMCConstraint.Declaration;
import TTMCConstraint.DefinableDeclaration;
import TTMCConstraint.DivExpression;
import TTMCConstraint.DivideExpression;
import TTMCConstraint.EnumerationLiteralDefinition;
import TTMCConstraint.EnumerationLiteralExpression;
import TTMCConstraint.EnumerationTypeDefinition;
import TTMCConstraint.EqualExpression;
import TTMCConstraint.EqualityExpression;
import TTMCConstraint.EquivalenceExpression;
import TTMCConstraint.ExistsExpression;
import TTMCConstraint.Expression;
import TTMCConstraint.FalseExpression;
import TTMCConstraint.FieldAssignment;
import TTMCConstraint.FieldDeclaration;
import TTMCConstraint.FinallyExpression;
import TTMCConstraint.ForallExpression;
import TTMCConstraint.FunctionAccessExpression;
import TTMCConstraint.FunctionDeclaration;
import TTMCConstraint.FunctionLiteralExpression;
import TTMCConstraint.FunctionTypeDefinition;
import TTMCConstraint.GloballyExpression;
import TTMCConstraint.GreaterEqualExpression;
import TTMCConstraint.GreaterExpression;
import TTMCConstraint.IfThenElseExpression;
import TTMCConstraint.ImplyExpression;
import TTMCConstraint.InExpression;
import TTMCConstraint.InequalityExpression;
import TTMCConstraint.IntegerLiteralExpression;
import TTMCConstraint.IntegerTypeDefinition;
import TTMCConstraint.LessEqualExpression;
import TTMCConstraint.LessExpression;
import TTMCConstraint.LetDeclaration;
import TTMCConstraint.LetExpression;
import TTMCConstraint.LiteralExpression;
import TTMCConstraint.ModExpression;
import TTMCConstraint.MultiaryExpression;
import TTMCConstraint.MultiplyExpression;
import TTMCConstraint.NamedElement;
import TTMCConstraint.NaturalTypeDefinition;
import TTMCConstraint.NextExpression;
import TTMCConstraint.NotExpression;
import TTMCConstraint.NullaryExpression;
import TTMCConstraint.OrExpression;
import TTMCConstraint.ParameterDeclaration;
import TTMCConstraint.ParametricElement;
import TTMCConstraint.ParametrizedElement;
import TTMCConstraint.PredicateExpression;
import TTMCConstraint.PrimedExpression;
import TTMCConstraint.QuantifierExpression;
import TTMCConstraint.RationalLiteralExpression;
import TTMCConstraint.RealTypeDefinition;
import TTMCConstraint.RecordAccessExpression;
import TTMCConstraint.RecordLiteralExpression;
import TTMCConstraint.RecordTypeDefinition;
import TTMCConstraint.ReferenceExpression;
import TTMCConstraint.ReleaseExpression;
import TTMCConstraint.SubTypeDefinition;
import TTMCConstraint.SubrangeTypeDefinition;
import TTMCConstraint.SubtractExpression;
import TTMCConstraint.TTMCConstraintFactory;
import TTMCConstraint.TTMCConstraintPackage;
import TTMCConstraint.TemporalExistsExpression;
import TTMCConstraint.TemporalExpression;
import TTMCConstraint.TemporalForallExpression;
import TTMCConstraint.TemporalPathExpression;
import TTMCConstraint.TemporalStateExpression;
import TTMCConstraint.TrueExpression;
import TTMCConstraint.TupleAccessExpression;
import TTMCConstraint.TupleLiteralExpression;
import TTMCConstraint.TupleTypeDefinition;
import TTMCConstraint.Type;
import TTMCConstraint.TypeDeclaration;
import TTMCConstraint.TypeDefinition;
import TTMCConstraint.TypeReference;
import TTMCConstraint.UnaryExpression;
import TTMCConstraint.UnaryMinusExpression;
import TTMCConstraint.UnaryPlusExpression;
import TTMCConstraint.UntilExpression;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TTMCConstraintPackageImpl extends EPackageImpl implements TTMCConstraintPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parametricElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parametrizedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definableDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass letDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicTypeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerTypeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass naturalTypeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanTypeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realTypeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subrangeTypeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subTypeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationTypeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationLiteralDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionTypeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayTypeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tupleTypeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recordTypeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicConstraintDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nullaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predicateExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arithmeticExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantifierExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temporalExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temporalPathExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temporalStateExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arithmeticLiteralExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerLiteralExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decimalLiteralExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rationalLiteralExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanLiteralExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trueExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass falseExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayLiteralExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionLiteralExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recordLiteralExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationLiteralExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tupleLiteralExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifThenElseExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass letExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equalExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implyExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass releaseExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass untilExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forallExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass existsExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globallyExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finallyExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nextExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temporalForallExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temporalExistsExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primedExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equivalenceExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equalityExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inequalityExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comparisionExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass greaterExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass greaterEqualExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lessExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lessEqualExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subtractExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiplyExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass divideExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass divExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryMinusExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryPlusExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionAccessExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayAccessExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tupleAccessExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recordAccessExpressionEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see TTMCConstraint.TTMCConstraintPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TTMCConstraintPackageImpl() {
		super(eNS_URI, TTMCConstraintFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link TTMCConstraintPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TTMCConstraintPackage init() {
		if (isInited) return (TTMCConstraintPackage)EPackage.Registry.INSTANCE.getEPackage(TTMCConstraintPackage.eNS_URI);

		// Obtain or create and register package
		TTMCConstraintPackageImpl theTTMCConstraintPackage = (TTMCConstraintPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TTMCConstraintPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TTMCConstraintPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theTTMCConstraintPackage.createPackageContents();

		// Initialize created meta-data
		theTTMCConstraintPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTTMCConstraintPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TTMCConstraintPackage.eNS_URI, theTTMCConstraintPackage);
		return theTTMCConstraintPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParametricElement() {
		return parametricElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametricElement_ParameterDeclarations() {
		return (EReference)parametricElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParametrizedElement() {
		return parametrizedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametrizedElement_Parameters() {
		return (EReference)parametrizedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraintSpecification() {
		return constraintSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintSpecification_TypeDeclarations() {
		return (EReference)constraintSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintSpecification_ConstantDeclarations() {
		return (EReference)constraintSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintSpecification_FunctionDeclarations() {
		return (EReference)constraintSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintSpecification_BasicConstraintDefinitions() {
		return (EReference)constraintSpecificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeclaration() {
		return declarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclaration_Type() {
		return (EReference)declarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefinableDeclaration() {
		return definableDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinableDeclaration_Expression() {
		return (EReference)definableDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterDeclaration() {
		return parameterDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFieldDeclaration() {
		return fieldDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLetDeclaration() {
		return letDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstantDeclaration() {
		return constantDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionDeclaration() {
		return functionDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDeclaration() {
		return typeDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeDeclaration_Type() {
		return (EReference)typeDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeReference() {
		return typeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeReference_Reference() {
		return (EReference)typeReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDefinition() {
		return typeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasicTypeDefinition() {
		return basicTypeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerTypeDefinition() {
		return integerTypeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNaturalTypeDefinition() {
		return naturalTypeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanTypeDefinition() {
		return booleanTypeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealTypeDefinition() {
		return realTypeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubrangeTypeDefinition() {
		return subrangeTypeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubrangeTypeDefinition_LowerBound() {
		return (EReference)subrangeTypeDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubrangeTypeDefinition_UpperBound() {
		return (EReference)subrangeTypeDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubTypeDefinition() {
		return subTypeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubTypeDefinition_ParameterDeclaration() {
		return (EReference)subTypeDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubTypeDefinition_Expression() {
		return (EReference)subTypeDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationTypeDefinition() {
		return enumerationTypeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumerationTypeDefinition_Literals() {
		return (EReference)enumerationTypeDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationLiteralDefinition() {
		return enumerationLiteralDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionTypeDefinition() {
		return functionTypeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionTypeDefinition_ParameterTypes() {
		return (EReference)functionTypeDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionTypeDefinition_ReturnType() {
		return (EReference)functionTypeDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayTypeDefinition() {
		return arrayTypeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayTypeDefinition_IndexTypes() {
		return (EReference)arrayTypeDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayTypeDefinition_ElementType() {
		return (EReference)arrayTypeDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTupleTypeDefinition() {
		return tupleTypeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTupleTypeDefinition_Types() {
		return (EReference)tupleTypeDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecordTypeDefinition() {
		return recordTypeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecordTypeDefinition_FieldDeclarations() {
		return (EReference)recordTypeDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraintDefinition() {
		return constraintDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintDefinition_Expression() {
		return (EReference)constraintDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasicConstraintDefinition() {
		return basicConstraintDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNullaryExpression() {
		return nullaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryExpression() {
		return unaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnaryExpression_Operand() {
		return (EReference)unaryExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryExpression() {
		return binaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryExpression_LeftOperand() {
		return (EReference)binaryExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryExpression_RightOperand() {
		return (EReference)binaryExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiaryExpression() {
		return multiaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiaryExpression_Operands() {
		return (EReference)multiaryExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPredicateExpression() {
		return predicateExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArithmeticExpression() {
		return arithmeticExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccessExpression() {
		return accessExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccessExpression_Operand() {
		return (EReference)accessExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanExpression() {
		return booleanExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuantifierExpression() {
		return quantifierExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemporalExpression() {
		return temporalExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemporalPathExpression() {
		return temporalPathExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemporalStateExpression() {
		return temporalStateExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralExpression() {
		return literalExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArithmeticLiteralExpression() {
		return arithmeticLiteralExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerLiteralExpression() {
		return integerLiteralExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerLiteralExpression_Value() {
		return (EAttribute)integerLiteralExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecimalLiteralExpression() {
		return decimalLiteralExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecimalLiteralExpression_Value() {
		return (EAttribute)decimalLiteralExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRationalLiteralExpression() {
		return rationalLiteralExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRationalLiteralExpression_Numerator() {
		return (EAttribute)rationalLiteralExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRationalLiteralExpression_Denominator() {
		return (EAttribute)rationalLiteralExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanLiteralExpression() {
		return booleanLiteralExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrueExpression() {
		return trueExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFalseExpression() {
		return falseExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayLiteralExpression() {
		return arrayLiteralExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionLiteralExpression() {
		return functionLiteralExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionLiteralExpression_ReturnType() {
		return (EReference)functionLiteralExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecordLiteralExpression() {
		return recordLiteralExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecordLiteralExpression_FieldAssignments() {
		return (EReference)recordLiteralExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFieldAssignment() {
		return fieldAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldAssignment_Reference() {
		return (EAttribute)fieldAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldAssignment_Value() {
		return (EReference)fieldAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationLiteralExpression() {
		return enumerationLiteralExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumerationLiteralExpression_Reference() {
		return (EReference)enumerationLiteralExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTupleLiteralExpression() {
		return tupleLiteralExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTupleLiteralExpression_Expressions() {
		return (EReference)tupleLiteralExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceExpression() {
		return referenceExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceExpression_Declaration() {
		return (EReference)referenceExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIfThenElseExpression() {
		return ifThenElseExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfThenElseExpression_Condition() {
		return (EReference)ifThenElseExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfThenElseExpression_Then() {
		return (EReference)ifThenElseExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfThenElseExpression_Else() {
		return (EReference)ifThenElseExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLetExpression() {
		return letExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLetExpression_LetDeclarations() {
		return (EReference)letExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLetExpression_Expression() {
		return (EReference)letExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEqualExpression() {
		return equalExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplyExpression() {
		return implyExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrExpression() {
		return orExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAndExpression() {
		return andExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReleaseExpression() {
		return releaseExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUntilExpression() {
		return untilExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotExpression() {
		return notExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForallExpression() {
		return forallExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExistsExpression() {
		return existsExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGloballyExpression() {
		return globallyExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinallyExpression() {
		return finallyExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNextExpression() {
		return nextExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemporalForallExpression() {
		return temporalForallExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemporalExistsExpression() {
		return temporalExistsExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInExpression() {
		return inExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInExpression_Type() {
		return (EReference)inExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimedExpression() {
		return primedExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEquivalenceExpression() {
		return equivalenceExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEqualityExpression() {
		return equalityExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInequalityExpression() {
		return inequalityExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComparisionExpression() {
		return comparisionExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGreaterExpression() {
		return greaterExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGreaterEqualExpression() {
		return greaterEqualExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLessExpression() {
		return lessExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLessEqualExpression() {
		return lessEqualExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddExpression() {
		return addExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubtractExpression() {
		return subtractExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiplyExpression() {
		return multiplyExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDivideExpression() {
		return divideExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDivExpression() {
		return divExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModExpression() {
		return modExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryMinusExpression() {
		return unaryMinusExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryPlusExpression() {
		return unaryPlusExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionAccessExpression() {
		return functionAccessExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayAccessExpression() {
		return arrayAccessExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTupleAccessExpression() {
		return tupleAccessExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTupleAccessExpression_Index() {
		return (EAttribute)tupleAccessExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecordAccessExpression() {
		return recordAccessExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecordAccessExpression_Field() {
		return (EAttribute)recordAccessExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTMCConstraintFactory getTTMCConstraintFactory() {
		return (TTMCConstraintFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		parametricElementEClass = createEClass(PARAMETRIC_ELEMENT);
		createEReference(parametricElementEClass, PARAMETRIC_ELEMENT__PARAMETER_DECLARATIONS);

		parametrizedElementEClass = createEClass(PARAMETRIZED_ELEMENT);
		createEReference(parametrizedElementEClass, PARAMETRIZED_ELEMENT__PARAMETERS);

		constraintSpecificationEClass = createEClass(CONSTRAINT_SPECIFICATION);
		createEReference(constraintSpecificationEClass, CONSTRAINT_SPECIFICATION__TYPE_DECLARATIONS);
		createEReference(constraintSpecificationEClass, CONSTRAINT_SPECIFICATION__CONSTANT_DECLARATIONS);
		createEReference(constraintSpecificationEClass, CONSTRAINT_SPECIFICATION__FUNCTION_DECLARATIONS);
		createEReference(constraintSpecificationEClass, CONSTRAINT_SPECIFICATION__BASIC_CONSTRAINT_DEFINITIONS);

		declarationEClass = createEClass(DECLARATION);
		createEReference(declarationEClass, DECLARATION__TYPE);

		definableDeclarationEClass = createEClass(DEFINABLE_DECLARATION);
		createEReference(definableDeclarationEClass, DEFINABLE_DECLARATION__EXPRESSION);

		parameterDeclarationEClass = createEClass(PARAMETER_DECLARATION);

		fieldDeclarationEClass = createEClass(FIELD_DECLARATION);

		letDeclarationEClass = createEClass(LET_DECLARATION);

		constantDeclarationEClass = createEClass(CONSTANT_DECLARATION);

		functionDeclarationEClass = createEClass(FUNCTION_DECLARATION);

		typeEClass = createEClass(TYPE);

		typeDeclarationEClass = createEClass(TYPE_DECLARATION);
		createEReference(typeDeclarationEClass, TYPE_DECLARATION__TYPE);

		typeReferenceEClass = createEClass(TYPE_REFERENCE);
		createEReference(typeReferenceEClass, TYPE_REFERENCE__REFERENCE);

		typeDefinitionEClass = createEClass(TYPE_DEFINITION);

		basicTypeDefinitionEClass = createEClass(BASIC_TYPE_DEFINITION);

		integerTypeDefinitionEClass = createEClass(INTEGER_TYPE_DEFINITION);

		naturalTypeDefinitionEClass = createEClass(NATURAL_TYPE_DEFINITION);

		booleanTypeDefinitionEClass = createEClass(BOOLEAN_TYPE_DEFINITION);

		realTypeDefinitionEClass = createEClass(REAL_TYPE_DEFINITION);

		subrangeTypeDefinitionEClass = createEClass(SUBRANGE_TYPE_DEFINITION);
		createEReference(subrangeTypeDefinitionEClass, SUBRANGE_TYPE_DEFINITION__LOWER_BOUND);
		createEReference(subrangeTypeDefinitionEClass, SUBRANGE_TYPE_DEFINITION__UPPER_BOUND);

		subTypeDefinitionEClass = createEClass(SUB_TYPE_DEFINITION);
		createEReference(subTypeDefinitionEClass, SUB_TYPE_DEFINITION__PARAMETER_DECLARATION);
		createEReference(subTypeDefinitionEClass, SUB_TYPE_DEFINITION__EXPRESSION);

		enumerationTypeDefinitionEClass = createEClass(ENUMERATION_TYPE_DEFINITION);
		createEReference(enumerationTypeDefinitionEClass, ENUMERATION_TYPE_DEFINITION__LITERALS);

		enumerationLiteralDefinitionEClass = createEClass(ENUMERATION_LITERAL_DEFINITION);

		functionTypeDefinitionEClass = createEClass(FUNCTION_TYPE_DEFINITION);
		createEReference(functionTypeDefinitionEClass, FUNCTION_TYPE_DEFINITION__PARAMETER_TYPES);
		createEReference(functionTypeDefinitionEClass, FUNCTION_TYPE_DEFINITION__RETURN_TYPE);

		arrayTypeDefinitionEClass = createEClass(ARRAY_TYPE_DEFINITION);
		createEReference(arrayTypeDefinitionEClass, ARRAY_TYPE_DEFINITION__INDEX_TYPES);
		createEReference(arrayTypeDefinitionEClass, ARRAY_TYPE_DEFINITION__ELEMENT_TYPE);

		tupleTypeDefinitionEClass = createEClass(TUPLE_TYPE_DEFINITION);
		createEReference(tupleTypeDefinitionEClass, TUPLE_TYPE_DEFINITION__TYPES);

		recordTypeDefinitionEClass = createEClass(RECORD_TYPE_DEFINITION);
		createEReference(recordTypeDefinitionEClass, RECORD_TYPE_DEFINITION__FIELD_DECLARATIONS);

		constraintDefinitionEClass = createEClass(CONSTRAINT_DEFINITION);
		createEReference(constraintDefinitionEClass, CONSTRAINT_DEFINITION__EXPRESSION);

		basicConstraintDefinitionEClass = createEClass(BASIC_CONSTRAINT_DEFINITION);

		expressionEClass = createEClass(EXPRESSION);

		nullaryExpressionEClass = createEClass(NULLARY_EXPRESSION);

		unaryExpressionEClass = createEClass(UNARY_EXPRESSION);
		createEReference(unaryExpressionEClass, UNARY_EXPRESSION__OPERAND);

		binaryExpressionEClass = createEClass(BINARY_EXPRESSION);
		createEReference(binaryExpressionEClass, BINARY_EXPRESSION__LEFT_OPERAND);
		createEReference(binaryExpressionEClass, BINARY_EXPRESSION__RIGHT_OPERAND);

		multiaryExpressionEClass = createEClass(MULTIARY_EXPRESSION);
		createEReference(multiaryExpressionEClass, MULTIARY_EXPRESSION__OPERANDS);

		predicateExpressionEClass = createEClass(PREDICATE_EXPRESSION);

		arithmeticExpressionEClass = createEClass(ARITHMETIC_EXPRESSION);

		accessExpressionEClass = createEClass(ACCESS_EXPRESSION);
		createEReference(accessExpressionEClass, ACCESS_EXPRESSION__OPERAND);

		booleanExpressionEClass = createEClass(BOOLEAN_EXPRESSION);

		quantifierExpressionEClass = createEClass(QUANTIFIER_EXPRESSION);

		temporalExpressionEClass = createEClass(TEMPORAL_EXPRESSION);

		temporalPathExpressionEClass = createEClass(TEMPORAL_PATH_EXPRESSION);

		temporalStateExpressionEClass = createEClass(TEMPORAL_STATE_EXPRESSION);

		literalExpressionEClass = createEClass(LITERAL_EXPRESSION);

		arithmeticLiteralExpressionEClass = createEClass(ARITHMETIC_LITERAL_EXPRESSION);

		integerLiteralExpressionEClass = createEClass(INTEGER_LITERAL_EXPRESSION);
		createEAttribute(integerLiteralExpressionEClass, INTEGER_LITERAL_EXPRESSION__VALUE);

		decimalLiteralExpressionEClass = createEClass(DECIMAL_LITERAL_EXPRESSION);
		createEAttribute(decimalLiteralExpressionEClass, DECIMAL_LITERAL_EXPRESSION__VALUE);

		rationalLiteralExpressionEClass = createEClass(RATIONAL_LITERAL_EXPRESSION);
		createEAttribute(rationalLiteralExpressionEClass, RATIONAL_LITERAL_EXPRESSION__NUMERATOR);
		createEAttribute(rationalLiteralExpressionEClass, RATIONAL_LITERAL_EXPRESSION__DENOMINATOR);

		booleanLiteralExpressionEClass = createEClass(BOOLEAN_LITERAL_EXPRESSION);

		trueExpressionEClass = createEClass(TRUE_EXPRESSION);

		falseExpressionEClass = createEClass(FALSE_EXPRESSION);

		arrayLiteralExpressionEClass = createEClass(ARRAY_LITERAL_EXPRESSION);

		functionLiteralExpressionEClass = createEClass(FUNCTION_LITERAL_EXPRESSION);
		createEReference(functionLiteralExpressionEClass, FUNCTION_LITERAL_EXPRESSION__RETURN_TYPE);

		recordLiteralExpressionEClass = createEClass(RECORD_LITERAL_EXPRESSION);
		createEReference(recordLiteralExpressionEClass, RECORD_LITERAL_EXPRESSION__FIELD_ASSIGNMENTS);

		fieldAssignmentEClass = createEClass(FIELD_ASSIGNMENT);
		createEAttribute(fieldAssignmentEClass, FIELD_ASSIGNMENT__REFERENCE);
		createEReference(fieldAssignmentEClass, FIELD_ASSIGNMENT__VALUE);

		enumerationLiteralExpressionEClass = createEClass(ENUMERATION_LITERAL_EXPRESSION);
		createEReference(enumerationLiteralExpressionEClass, ENUMERATION_LITERAL_EXPRESSION__REFERENCE);

		tupleLiteralExpressionEClass = createEClass(TUPLE_LITERAL_EXPRESSION);
		createEReference(tupleLiteralExpressionEClass, TUPLE_LITERAL_EXPRESSION__EXPRESSIONS);

		referenceExpressionEClass = createEClass(REFERENCE_EXPRESSION);
		createEReference(referenceExpressionEClass, REFERENCE_EXPRESSION__DECLARATION);

		ifThenElseExpressionEClass = createEClass(IF_THEN_ELSE_EXPRESSION);
		createEReference(ifThenElseExpressionEClass, IF_THEN_ELSE_EXPRESSION__CONDITION);
		createEReference(ifThenElseExpressionEClass, IF_THEN_ELSE_EXPRESSION__THEN);
		createEReference(ifThenElseExpressionEClass, IF_THEN_ELSE_EXPRESSION__ELSE);

		letExpressionEClass = createEClass(LET_EXPRESSION);
		createEReference(letExpressionEClass, LET_EXPRESSION__LET_DECLARATIONS);
		createEReference(letExpressionEClass, LET_EXPRESSION__EXPRESSION);

		equalExpressionEClass = createEClass(EQUAL_EXPRESSION);

		implyExpressionEClass = createEClass(IMPLY_EXPRESSION);

		orExpressionEClass = createEClass(OR_EXPRESSION);

		andExpressionEClass = createEClass(AND_EXPRESSION);

		releaseExpressionEClass = createEClass(RELEASE_EXPRESSION);

		untilExpressionEClass = createEClass(UNTIL_EXPRESSION);

		notExpressionEClass = createEClass(NOT_EXPRESSION);

		forallExpressionEClass = createEClass(FORALL_EXPRESSION);

		existsExpressionEClass = createEClass(EXISTS_EXPRESSION);

		globallyExpressionEClass = createEClass(GLOBALLY_EXPRESSION);

		finallyExpressionEClass = createEClass(FINALLY_EXPRESSION);

		nextExpressionEClass = createEClass(NEXT_EXPRESSION);

		temporalForallExpressionEClass = createEClass(TEMPORAL_FORALL_EXPRESSION);

		temporalExistsExpressionEClass = createEClass(TEMPORAL_EXISTS_EXPRESSION);

		inExpressionEClass = createEClass(IN_EXPRESSION);
		createEReference(inExpressionEClass, IN_EXPRESSION__TYPE);

		primedExpressionEClass = createEClass(PRIMED_EXPRESSION);

		equivalenceExpressionEClass = createEClass(EQUIVALENCE_EXPRESSION);

		equalityExpressionEClass = createEClass(EQUALITY_EXPRESSION);

		inequalityExpressionEClass = createEClass(INEQUALITY_EXPRESSION);

		comparisionExpressionEClass = createEClass(COMPARISION_EXPRESSION);

		greaterExpressionEClass = createEClass(GREATER_EXPRESSION);

		greaterEqualExpressionEClass = createEClass(GREATER_EQUAL_EXPRESSION);

		lessExpressionEClass = createEClass(LESS_EXPRESSION);

		lessEqualExpressionEClass = createEClass(LESS_EQUAL_EXPRESSION);

		addExpressionEClass = createEClass(ADD_EXPRESSION);

		subtractExpressionEClass = createEClass(SUBTRACT_EXPRESSION);

		multiplyExpressionEClass = createEClass(MULTIPLY_EXPRESSION);

		divideExpressionEClass = createEClass(DIVIDE_EXPRESSION);

		divExpressionEClass = createEClass(DIV_EXPRESSION);

		modExpressionEClass = createEClass(MOD_EXPRESSION);

		unaryMinusExpressionEClass = createEClass(UNARY_MINUS_EXPRESSION);

		unaryPlusExpressionEClass = createEClass(UNARY_PLUS_EXPRESSION);

		functionAccessExpressionEClass = createEClass(FUNCTION_ACCESS_EXPRESSION);

		arrayAccessExpressionEClass = createEClass(ARRAY_ACCESS_EXPRESSION);

		tupleAccessExpressionEClass = createEClass(TUPLE_ACCESS_EXPRESSION);
		createEAttribute(tupleAccessExpressionEClass, TUPLE_ACCESS_EXPRESSION__INDEX);

		recordAccessExpressionEClass = createEClass(RECORD_ACCESS_EXPRESSION);
		createEAttribute(recordAccessExpressionEClass, RECORD_ACCESS_EXPRESSION__FIELD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		constraintSpecificationEClass.getESuperTypes().add(this.getNamedElement());
		constraintSpecificationEClass.getESuperTypes().add(this.getParametricElement());
		declarationEClass.getESuperTypes().add(this.getNamedElement());
		definableDeclarationEClass.getESuperTypes().add(this.getDeclaration());
		parameterDeclarationEClass.getESuperTypes().add(this.getDeclaration());
		fieldDeclarationEClass.getESuperTypes().add(this.getDeclaration());
		letDeclarationEClass.getESuperTypes().add(this.getDefinableDeclaration());
		constantDeclarationEClass.getESuperTypes().add(this.getDefinableDeclaration());
		functionDeclarationEClass.getESuperTypes().add(this.getDefinableDeclaration());
		functionDeclarationEClass.getESuperTypes().add(this.getParametricElement());
		typeDeclarationEClass.getESuperTypes().add(this.getNamedElement());
		typeReferenceEClass.getESuperTypes().add(this.getType());
		typeDefinitionEClass.getESuperTypes().add(this.getType());
		basicTypeDefinitionEClass.getESuperTypes().add(this.getTypeDefinition());
		integerTypeDefinitionEClass.getESuperTypes().add(this.getBasicTypeDefinition());
		naturalTypeDefinitionEClass.getESuperTypes().add(this.getBasicTypeDefinition());
		booleanTypeDefinitionEClass.getESuperTypes().add(this.getBasicTypeDefinition());
		realTypeDefinitionEClass.getESuperTypes().add(this.getBasicTypeDefinition());
		subrangeTypeDefinitionEClass.getESuperTypes().add(this.getTypeDefinition());
		subTypeDefinitionEClass.getESuperTypes().add(this.getTypeDefinition());
		subTypeDefinitionEClass.getESuperTypes().add(this.getParametricElement());
		enumerationTypeDefinitionEClass.getESuperTypes().add(this.getTypeDefinition());
		enumerationLiteralDefinitionEClass.getESuperTypes().add(this.getNamedElement());
		functionTypeDefinitionEClass.getESuperTypes().add(this.getTypeDefinition());
		arrayTypeDefinitionEClass.getESuperTypes().add(this.getTypeDefinition());
		tupleTypeDefinitionEClass.getESuperTypes().add(this.getTypeDefinition());
		recordTypeDefinitionEClass.getESuperTypes().add(this.getTypeDefinition());
		basicConstraintDefinitionEClass.getESuperTypes().add(this.getConstraintDefinition());
		nullaryExpressionEClass.getESuperTypes().add(this.getExpression());
		unaryExpressionEClass.getESuperTypes().add(this.getExpression());
		binaryExpressionEClass.getESuperTypes().add(this.getExpression());
		multiaryExpressionEClass.getESuperTypes().add(this.getExpression());
		predicateExpressionEClass.getESuperTypes().add(this.getExpression());
		arithmeticExpressionEClass.getESuperTypes().add(this.getExpression());
		accessExpressionEClass.getESuperTypes().add(this.getExpression());
		booleanExpressionEClass.getESuperTypes().add(this.getExpression());
		quantifierExpressionEClass.getESuperTypes().add(this.getUnaryExpression());
		quantifierExpressionEClass.getESuperTypes().add(this.getParametricElement());
		temporalExpressionEClass.getESuperTypes().add(this.getExpression());
		temporalPathExpressionEClass.getESuperTypes().add(this.getTemporalExpression());
		temporalStateExpressionEClass.getESuperTypes().add(this.getTemporalExpression());
		literalExpressionEClass.getESuperTypes().add(this.getExpression());
		arithmeticLiteralExpressionEClass.getESuperTypes().add(this.getNullaryExpression());
		arithmeticLiteralExpressionEClass.getESuperTypes().add(this.getLiteralExpression());
		arithmeticLiteralExpressionEClass.getESuperTypes().add(this.getArithmeticExpression());
		integerLiteralExpressionEClass.getESuperTypes().add(this.getArithmeticLiteralExpression());
		decimalLiteralExpressionEClass.getESuperTypes().add(this.getArithmeticLiteralExpression());
		rationalLiteralExpressionEClass.getESuperTypes().add(this.getArithmeticLiteralExpression());
		booleanLiteralExpressionEClass.getESuperTypes().add(this.getNullaryExpression());
		booleanLiteralExpressionEClass.getESuperTypes().add(this.getLiteralExpression());
		booleanLiteralExpressionEClass.getESuperTypes().add(this.getBooleanExpression());
		trueExpressionEClass.getESuperTypes().add(this.getBooleanLiteralExpression());
		falseExpressionEClass.getESuperTypes().add(this.getBooleanLiteralExpression());
		arrayLiteralExpressionEClass.getESuperTypes().add(this.getUnaryExpression());
		arrayLiteralExpressionEClass.getESuperTypes().add(this.getLiteralExpression());
		arrayLiteralExpressionEClass.getESuperTypes().add(this.getParametricElement());
		functionLiteralExpressionEClass.getESuperTypes().add(this.getUnaryExpression());
		functionLiteralExpressionEClass.getESuperTypes().add(this.getLiteralExpression());
		functionLiteralExpressionEClass.getESuperTypes().add(this.getParametricElement());
		recordLiteralExpressionEClass.getESuperTypes().add(this.getLiteralExpression());
		enumerationLiteralExpressionEClass.getESuperTypes().add(this.getNullaryExpression());
		enumerationLiteralExpressionEClass.getESuperTypes().add(this.getLiteralExpression());
		tupleLiteralExpressionEClass.getESuperTypes().add(this.getLiteralExpression());
		referenceExpressionEClass.getESuperTypes().add(this.getNullaryExpression());
		ifThenElseExpressionEClass.getESuperTypes().add(this.getExpression());
		letExpressionEClass.getESuperTypes().add(this.getExpression());
		equalExpressionEClass.getESuperTypes().add(this.getBooleanExpression());
		equalExpressionEClass.getESuperTypes().add(this.getBinaryExpression());
		implyExpressionEClass.getESuperTypes().add(this.getBooleanExpression());
		implyExpressionEClass.getESuperTypes().add(this.getBinaryExpression());
		orExpressionEClass.getESuperTypes().add(this.getBooleanExpression());
		orExpressionEClass.getESuperTypes().add(this.getMultiaryExpression());
		andExpressionEClass.getESuperTypes().add(this.getBooleanExpression());
		andExpressionEClass.getESuperTypes().add(this.getMultiaryExpression());
		releaseExpressionEClass.getESuperTypes().add(this.getTemporalPathExpression());
		releaseExpressionEClass.getESuperTypes().add(this.getBinaryExpression());
		untilExpressionEClass.getESuperTypes().add(this.getTemporalPathExpression());
		untilExpressionEClass.getESuperTypes().add(this.getBinaryExpression());
		notExpressionEClass.getESuperTypes().add(this.getBooleanExpression());
		notExpressionEClass.getESuperTypes().add(this.getUnaryExpression());
		forallExpressionEClass.getESuperTypes().add(this.getQuantifierExpression());
		existsExpressionEClass.getESuperTypes().add(this.getQuantifierExpression());
		globallyExpressionEClass.getESuperTypes().add(this.getTemporalPathExpression());
		globallyExpressionEClass.getESuperTypes().add(this.getUnaryExpression());
		finallyExpressionEClass.getESuperTypes().add(this.getTemporalPathExpression());
		finallyExpressionEClass.getESuperTypes().add(this.getUnaryExpression());
		nextExpressionEClass.getESuperTypes().add(this.getTemporalPathExpression());
		nextExpressionEClass.getESuperTypes().add(this.getUnaryExpression());
		temporalForallExpressionEClass.getESuperTypes().add(this.getTemporalStateExpression());
		temporalForallExpressionEClass.getESuperTypes().add(this.getUnaryExpression());
		temporalExistsExpressionEClass.getESuperTypes().add(this.getTemporalStateExpression());
		temporalExistsExpressionEClass.getESuperTypes().add(this.getUnaryExpression());
		inExpressionEClass.getESuperTypes().add(this.getPredicateExpression());
		inExpressionEClass.getESuperTypes().add(this.getUnaryExpression());
		primedExpressionEClass.getESuperTypes().add(this.getUnaryExpression());
		equivalenceExpressionEClass.getESuperTypes().add(this.getPredicateExpression());
		equivalenceExpressionEClass.getESuperTypes().add(this.getBinaryExpression());
		equalityExpressionEClass.getESuperTypes().add(this.getEquivalenceExpression());
		inequalityExpressionEClass.getESuperTypes().add(this.getEquivalenceExpression());
		comparisionExpressionEClass.getESuperTypes().add(this.getPredicateExpression());
		comparisionExpressionEClass.getESuperTypes().add(this.getBinaryExpression());
		greaterExpressionEClass.getESuperTypes().add(this.getComparisionExpression());
		greaterEqualExpressionEClass.getESuperTypes().add(this.getComparisionExpression());
		lessExpressionEClass.getESuperTypes().add(this.getComparisionExpression());
		lessEqualExpressionEClass.getESuperTypes().add(this.getComparisionExpression());
		addExpressionEClass.getESuperTypes().add(this.getArithmeticExpression());
		addExpressionEClass.getESuperTypes().add(this.getMultiaryExpression());
		subtractExpressionEClass.getESuperTypes().add(this.getArithmeticExpression());
		subtractExpressionEClass.getESuperTypes().add(this.getBinaryExpression());
		multiplyExpressionEClass.getESuperTypes().add(this.getArithmeticExpression());
		multiplyExpressionEClass.getESuperTypes().add(this.getMultiaryExpression());
		divideExpressionEClass.getESuperTypes().add(this.getArithmeticExpression());
		divideExpressionEClass.getESuperTypes().add(this.getBinaryExpression());
		divExpressionEClass.getESuperTypes().add(this.getArithmeticExpression());
		divExpressionEClass.getESuperTypes().add(this.getBinaryExpression());
		modExpressionEClass.getESuperTypes().add(this.getArithmeticExpression());
		modExpressionEClass.getESuperTypes().add(this.getBinaryExpression());
		unaryMinusExpressionEClass.getESuperTypes().add(this.getArithmeticExpression());
		unaryMinusExpressionEClass.getESuperTypes().add(this.getUnaryExpression());
		unaryPlusExpressionEClass.getESuperTypes().add(this.getArithmeticExpression());
		unaryPlusExpressionEClass.getESuperTypes().add(this.getUnaryExpression());
		functionAccessExpressionEClass.getESuperTypes().add(this.getAccessExpression());
		functionAccessExpressionEClass.getESuperTypes().add(this.getParametrizedElement());
		arrayAccessExpressionEClass.getESuperTypes().add(this.getAccessExpression());
		arrayAccessExpressionEClass.getESuperTypes().add(this.getParametrizedElement());
		tupleAccessExpressionEClass.getESuperTypes().add(this.getAccessExpression());
		recordAccessExpressionEClass.getESuperTypes().add(this.getAccessExpression());

		// Initialize classes, features, and operations; add parameters
		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parametricElementEClass, ParametricElement.class, "ParametricElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParametricElement_ParameterDeclarations(), this.getParameterDeclaration(), null, "parameterDeclarations", null, 0, -1, ParametricElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parametrizedElementEClass, ParametrizedElement.class, "ParametrizedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParametrizedElement_Parameters(), this.getExpression(), null, "parameters", null, 0, -1, ParametrizedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintSpecificationEClass, ConstraintSpecification.class, "ConstraintSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstraintSpecification_TypeDeclarations(), this.getTypeDeclaration(), null, "typeDeclarations", null, 0, -1, ConstraintSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstraintSpecification_ConstantDeclarations(), this.getConstantDeclaration(), null, "constantDeclarations", null, 0, -1, ConstraintSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstraintSpecification_FunctionDeclarations(), this.getFunctionDeclaration(), null, "functionDeclarations", null, 0, -1, ConstraintSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstraintSpecification_BasicConstraintDefinitions(), this.getBasicConstraintDefinition(), null, "basicConstraintDefinitions", null, 0, -1, ConstraintSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(declarationEClass, Declaration.class, "Declaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeclaration_Type(), this.getType(), null, "type", null, 1, 1, Declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(definableDeclarationEClass, DefinableDeclaration.class, "DefinableDeclaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDefinableDeclaration_Expression(), this.getExpression(), null, "expression", null, 0, 1, DefinableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterDeclarationEClass, ParameterDeclaration.class, "ParameterDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fieldDeclarationEClass, FieldDeclaration.class, "FieldDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(letDeclarationEClass, LetDeclaration.class, "LetDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(constantDeclarationEClass, ConstantDeclaration.class, "ConstantDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(functionDeclarationEClass, FunctionDeclaration.class, "FunctionDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typeDeclarationEClass, TypeDeclaration.class, "TypeDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeDeclaration_Type(), this.getType(), null, "type", null, 1, 1, TypeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeReferenceEClass, TypeReference.class, "TypeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeReference_Reference(), this.getTypeDeclaration(), null, "reference", null, 0, 1, TypeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeDefinitionEClass, TypeDefinition.class, "TypeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(basicTypeDefinitionEClass, BasicTypeDefinition.class, "BasicTypeDefinition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(integerTypeDefinitionEClass, IntegerTypeDefinition.class, "IntegerTypeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(naturalTypeDefinitionEClass, NaturalTypeDefinition.class, "NaturalTypeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(booleanTypeDefinitionEClass, BooleanTypeDefinition.class, "BooleanTypeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(realTypeDefinitionEClass, RealTypeDefinition.class, "RealTypeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subrangeTypeDefinitionEClass, SubrangeTypeDefinition.class, "SubrangeTypeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubrangeTypeDefinition_LowerBound(), this.getExpression(), null, "lowerBound", null, 0, 1, SubrangeTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubrangeTypeDefinition_UpperBound(), this.getExpression(), null, "upperBound", null, 0, 1, SubrangeTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subTypeDefinitionEClass, SubTypeDefinition.class, "SubTypeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubTypeDefinition_ParameterDeclaration(), this.getParameterDeclaration(), null, "parameterDeclaration", null, 1, 1, SubTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubTypeDefinition_Expression(), this.getExpression(), null, "expression", null, 1, 1, SubTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationTypeDefinitionEClass, EnumerationTypeDefinition.class, "EnumerationTypeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumerationTypeDefinition_Literals(), this.getEnumerationLiteralDefinition(), null, "literals", null, 0, -1, EnumerationTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationLiteralDefinitionEClass, EnumerationLiteralDefinition.class, "EnumerationLiteralDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(functionTypeDefinitionEClass, FunctionTypeDefinition.class, "FunctionTypeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionTypeDefinition_ParameterTypes(), this.getType(), null, "parameterTypes", null, 0, -1, FunctionTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionTypeDefinition_ReturnType(), this.getType(), null, "returnType", null, 1, 1, FunctionTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayTypeDefinitionEClass, ArrayTypeDefinition.class, "ArrayTypeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArrayTypeDefinition_IndexTypes(), this.getType(), null, "indexTypes", null, 1, -1, ArrayTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArrayTypeDefinition_ElementType(), this.getType(), null, "elementType", null, 1, 1, ArrayTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tupleTypeDefinitionEClass, TupleTypeDefinition.class, "TupleTypeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTupleTypeDefinition_Types(), this.getType(), null, "types", null, 0, -1, TupleTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recordTypeDefinitionEClass, RecordTypeDefinition.class, "RecordTypeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRecordTypeDefinition_FieldDeclarations(), this.getFieldDeclaration(), null, "fieldDeclarations", null, 0, -1, RecordTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintDefinitionEClass, ConstraintDefinition.class, "ConstraintDefinition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstraintDefinition_Expression(), this.getExpression(), null, "expression", null, 1, 1, ConstraintDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(basicConstraintDefinitionEClass, BasicConstraintDefinition.class, "BasicConstraintDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nullaryExpressionEClass, NullaryExpression.class, "NullaryExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unaryExpressionEClass, UnaryExpression.class, "UnaryExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnaryExpression_Operand(), this.getExpression(), null, "operand", null, 1, 1, UnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binaryExpressionEClass, BinaryExpression.class, "BinaryExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinaryExpression_LeftOperand(), this.getExpression(), null, "leftOperand", null, 1, 1, BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryExpression_RightOperand(), this.getExpression(), null, "rightOperand", null, 1, 1, BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiaryExpressionEClass, MultiaryExpression.class, "MultiaryExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultiaryExpression_Operands(), this.getExpression(), null, "operands", null, 0, -1, MultiaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(predicateExpressionEClass, PredicateExpression.class, "PredicateExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arithmeticExpressionEClass, ArithmeticExpression.class, "ArithmeticExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(accessExpressionEClass, AccessExpression.class, "AccessExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAccessExpression_Operand(), this.getExpression(), null, "operand", null, 1, 1, AccessExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanExpressionEClass, BooleanExpression.class, "BooleanExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(quantifierExpressionEClass, QuantifierExpression.class, "QuantifierExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(temporalExpressionEClass, TemporalExpression.class, "TemporalExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(temporalPathExpressionEClass, TemporalPathExpression.class, "TemporalPathExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(temporalStateExpressionEClass, TemporalStateExpression.class, "TemporalStateExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(literalExpressionEClass, LiteralExpression.class, "LiteralExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arithmeticLiteralExpressionEClass, ArithmeticLiteralExpression.class, "ArithmeticLiteralExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(integerLiteralExpressionEClass, IntegerLiteralExpression.class, "IntegerLiteralExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerLiteralExpression_Value(), ecorePackage.getEBigInteger(), "value", null, 1, 1, IntegerLiteralExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(decimalLiteralExpressionEClass, DecimalLiteralExpression.class, "DecimalLiteralExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDecimalLiteralExpression_Value(), ecorePackage.getEBigDecimal(), "value", null, 1, 1, DecimalLiteralExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rationalLiteralExpressionEClass, RationalLiteralExpression.class, "RationalLiteralExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRationalLiteralExpression_Numerator(), ecorePackage.getEBigInteger(), "numerator", null, 1, 1, RationalLiteralExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRationalLiteralExpression_Denominator(), ecorePackage.getEBigInteger(), "denominator", null, 1, 1, RationalLiteralExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanLiteralExpressionEClass, BooleanLiteralExpression.class, "BooleanLiteralExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(trueExpressionEClass, TrueExpression.class, "TrueExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(falseExpressionEClass, FalseExpression.class, "FalseExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arrayLiteralExpressionEClass, ArrayLiteralExpression.class, "ArrayLiteralExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(functionLiteralExpressionEClass, FunctionLiteralExpression.class, "FunctionLiteralExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionLiteralExpression_ReturnType(), this.getType(), null, "returnType", null, 1, 1, FunctionLiteralExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recordLiteralExpressionEClass, RecordLiteralExpression.class, "RecordLiteralExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRecordLiteralExpression_FieldAssignments(), this.getFieldAssignment(), null, "fieldAssignments", null, 0, -1, RecordLiteralExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldAssignmentEClass, FieldAssignment.class, "FieldAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFieldAssignment_Reference(), ecorePackage.getEString(), "reference", null, 1, 1, FieldAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFieldAssignment_Value(), this.getExpression(), null, "value", null, 1, 1, FieldAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationLiteralExpressionEClass, EnumerationLiteralExpression.class, "EnumerationLiteralExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumerationLiteralExpression_Reference(), this.getEnumerationLiteralDefinition(), null, "reference", null, 1, 1, EnumerationLiteralExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tupleLiteralExpressionEClass, TupleLiteralExpression.class, "TupleLiteralExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTupleLiteralExpression_Expressions(), this.getExpression(), null, "expressions", null, 0, -1, TupleLiteralExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceExpressionEClass, ReferenceExpression.class, "ReferenceExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferenceExpression_Declaration(), this.getDeclaration(), null, "declaration", null, 1, 1, ReferenceExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ifThenElseExpressionEClass, IfThenElseExpression.class, "IfThenElseExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIfThenElseExpression_Condition(), this.getExpression(), null, "condition", null, 1, 1, IfThenElseExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfThenElseExpression_Then(), this.getExpression(), null, "then", null, 1, 1, IfThenElseExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfThenElseExpression_Else(), this.getExpression(), null, "else", null, 1, 1, IfThenElseExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(letExpressionEClass, LetExpression.class, "LetExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLetExpression_LetDeclarations(), this.getLetDeclaration(), null, "letDeclarations", null, 0, -1, LetExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLetExpression_Expression(), this.getExpression(), null, "expression", null, 1, 1, LetExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(equalExpressionEClass, EqualExpression.class, "EqualExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(implyExpressionEClass, ImplyExpression.class, "ImplyExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orExpressionEClass, OrExpression.class, "OrExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(andExpressionEClass, AndExpression.class, "AndExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(releaseExpressionEClass, ReleaseExpression.class, "ReleaseExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(untilExpressionEClass, UntilExpression.class, "UntilExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(notExpressionEClass, NotExpression.class, "NotExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(forallExpressionEClass, ForallExpression.class, "ForallExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(existsExpressionEClass, ExistsExpression.class, "ExistsExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(globallyExpressionEClass, GloballyExpression.class, "GloballyExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(finallyExpressionEClass, FinallyExpression.class, "FinallyExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nextExpressionEClass, NextExpression.class, "NextExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(temporalForallExpressionEClass, TemporalForallExpression.class, "TemporalForallExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(temporalExistsExpressionEClass, TemporalExistsExpression.class, "TemporalExistsExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inExpressionEClass, InExpression.class, "InExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInExpression_Type(), this.getType(), null, "type", null, 1, 1, InExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primedExpressionEClass, PrimedExpression.class, "PrimedExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(equivalenceExpressionEClass, EquivalenceExpression.class, "EquivalenceExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(equalityExpressionEClass, EqualityExpression.class, "EqualityExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inequalityExpressionEClass, InequalityExpression.class, "InequalityExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(comparisionExpressionEClass, ComparisionExpression.class, "ComparisionExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(greaterExpressionEClass, GreaterExpression.class, "GreaterExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(greaterEqualExpressionEClass, GreaterEqualExpression.class, "GreaterEqualExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lessExpressionEClass, LessExpression.class, "LessExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lessEqualExpressionEClass, LessEqualExpression.class, "LessEqualExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(addExpressionEClass, AddExpression.class, "AddExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subtractExpressionEClass, SubtractExpression.class, "SubtractExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multiplyExpressionEClass, MultiplyExpression.class, "MultiplyExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(divideExpressionEClass, DivideExpression.class, "DivideExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(divExpressionEClass, DivExpression.class, "DivExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modExpressionEClass, ModExpression.class, "ModExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unaryMinusExpressionEClass, UnaryMinusExpression.class, "UnaryMinusExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unaryPlusExpressionEClass, UnaryPlusExpression.class, "UnaryPlusExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(functionAccessExpressionEClass, FunctionAccessExpression.class, "FunctionAccessExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arrayAccessExpressionEClass, ArrayAccessExpression.class, "ArrayAccessExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tupleAccessExpressionEClass, TupleAccessExpression.class, "TupleAccessExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTupleAccessExpression_Index(), ecorePackage.getEBigInteger(), "index", null, 1, 1, TupleAccessExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recordAccessExpressionEClass, RecordAccessExpression.class, "RecordAccessExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRecordAccessExpression_Field(), ecorePackage.getEString(), "field", null, 1, 1, RecordAccessExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //TTMCConstraintPackageImpl
