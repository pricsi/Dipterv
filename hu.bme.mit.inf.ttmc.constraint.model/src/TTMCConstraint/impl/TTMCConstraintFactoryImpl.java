/**
 */
package TTMCConstraint.impl;

import TTMCConstraint.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TTMCConstraintFactoryImpl extends EFactoryImpl implements TTMCConstraintFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TTMCConstraintFactory init() {
		try {
			TTMCConstraintFactory theTTMCConstraintFactory = (TTMCConstraintFactory)EPackage.Registry.INSTANCE.getEFactory(TTMCConstraintPackage.eNS_URI);
			if (theTTMCConstraintFactory != null) {
				return theTTMCConstraintFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TTMCConstraintFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTMCConstraintFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TTMCConstraintPackage.PARAMETRIZED_ELEMENT: return createParametrizedElement();
			case TTMCConstraintPackage.CONSTRAINT_SPECIFICATION: return createConstraintSpecification();
			case TTMCConstraintPackage.PARAMETER_DECLARATION: return createParameterDeclaration();
			case TTMCConstraintPackage.FIELD_DECLARATION: return createFieldDeclaration();
			case TTMCConstraintPackage.LET_DECLARATION: return createLetDeclaration();
			case TTMCConstraintPackage.CONSTANT_DECLARATION: return createConstantDeclaration();
			case TTMCConstraintPackage.FUNCTION_DECLARATION: return createFunctionDeclaration();
			case TTMCConstraintPackage.TYPE: return createType();
			case TTMCConstraintPackage.TYPE_DECLARATION: return createTypeDeclaration();
			case TTMCConstraintPackage.TYPE_REFERENCE: return createTypeReference();
			case TTMCConstraintPackage.TYPE_DEFINITION: return createTypeDefinition();
			case TTMCConstraintPackage.INTEGER_TYPE_DEFINITION: return createIntegerTypeDefinition();
			case TTMCConstraintPackage.NATURAL_TYPE_DEFINITION: return createNaturalTypeDefinition();
			case TTMCConstraintPackage.BOOLEAN_TYPE_DEFINITION: return createBooleanTypeDefinition();
			case TTMCConstraintPackage.REAL_TYPE_DEFINITION: return createRealTypeDefinition();
			case TTMCConstraintPackage.SUBRANGE_TYPE_DEFINITION: return createSubrangeTypeDefinition();
			case TTMCConstraintPackage.SUB_TYPE_DEFINITION: return createSubTypeDefinition();
			case TTMCConstraintPackage.ENUMERATION_TYPE_DEFINITION: return createEnumerationTypeDefinition();
			case TTMCConstraintPackage.ENUMERATION_LITERAL_DEFINITION: return createEnumerationLiteralDefinition();
			case TTMCConstraintPackage.FUNCTION_TYPE_DEFINITION: return createFunctionTypeDefinition();
			case TTMCConstraintPackage.ARRAY_TYPE_DEFINITION: return createArrayTypeDefinition();
			case TTMCConstraintPackage.TUPLE_TYPE_DEFINITION: return createTupleTypeDefinition();
			case TTMCConstraintPackage.RECORD_TYPE_DEFINITION: return createRecordTypeDefinition();
			case TTMCConstraintPackage.BASIC_CONSTRAINT_DEFINITION: return createBasicConstraintDefinition();
			case TTMCConstraintPackage.INTEGER_LITERAL_EXPRESSION: return createIntegerLiteralExpression();
			case TTMCConstraintPackage.DECIMAL_LITERAL_EXPRESSION: return createDecimalLiteralExpression();
			case TTMCConstraintPackage.RATIONAL_LITERAL_EXPRESSION: return createRationalLiteralExpression();
			case TTMCConstraintPackage.TRUE_EXPRESSION: return createTrueExpression();
			case TTMCConstraintPackage.FALSE_EXPRESSION: return createFalseExpression();
			case TTMCConstraintPackage.ARRAY_LITERAL_EXPRESSION: return createArrayLiteralExpression();
			case TTMCConstraintPackage.FUNCTION_LITERAL_EXPRESSION: return createFunctionLiteralExpression();
			case TTMCConstraintPackage.RECORD_LITERAL_EXPRESSION: return createRecordLiteralExpression();
			case TTMCConstraintPackage.FIELD_ASSIGNMENT: return createFieldAssignment();
			case TTMCConstraintPackage.ENUMERATION_LITERAL_EXPRESSION: return createEnumerationLiteralExpression();
			case TTMCConstraintPackage.TUPLE_LITERAL_EXPRESSION: return createTupleLiteralExpression();
			case TTMCConstraintPackage.REFERENCE_EXPRESSION: return createReferenceExpression();
			case TTMCConstraintPackage.IF_THEN_ELSE_EXPRESSION: return createIfThenElseExpression();
			case TTMCConstraintPackage.LET_EXPRESSION: return createLetExpression();
			case TTMCConstraintPackage.EQUAL_EXPRESSION: return createEqualExpression();
			case TTMCConstraintPackage.IMPLY_EXPRESSION: return createImplyExpression();
			case TTMCConstraintPackage.OR_EXPRESSION: return createOrExpression();
			case TTMCConstraintPackage.AND_EXPRESSION: return createAndExpression();
			case TTMCConstraintPackage.RELEASE_EXPRESSION: return createReleaseExpression();
			case TTMCConstraintPackage.UNTIL_EXPRESSION: return createUntilExpression();
			case TTMCConstraintPackage.NOT_EXPRESSION: return createNotExpression();
			case TTMCConstraintPackage.FORALL_EXPRESSION: return createForallExpression();
			case TTMCConstraintPackage.EXISTS_EXPRESSION: return createExistsExpression();
			case TTMCConstraintPackage.GLOBALLY_EXPRESSION: return createGloballyExpression();
			case TTMCConstraintPackage.FINALLY_EXPRESSION: return createFinallyExpression();
			case TTMCConstraintPackage.NEXT_EXPRESSION: return createNextExpression();
			case TTMCConstraintPackage.TEMPORAL_FORALL_EXPRESSION: return createTemporalForallExpression();
			case TTMCConstraintPackage.TEMPORAL_EXISTS_EXPRESSION: return createTemporalExistsExpression();
			case TTMCConstraintPackage.IN_EXPRESSION: return createInExpression();
			case TTMCConstraintPackage.PRIMED_EXPRESSION: return createPrimedExpression();
			case TTMCConstraintPackage.EQUALITY_EXPRESSION: return createEqualityExpression();
			case TTMCConstraintPackage.INEQUALITY_EXPRESSION: return createInequalityExpression();
			case TTMCConstraintPackage.GREATER_EXPRESSION: return createGreaterExpression();
			case TTMCConstraintPackage.GREATER_EQUAL_EXPRESSION: return createGreaterEqualExpression();
			case TTMCConstraintPackage.LESS_EXPRESSION: return createLessExpression();
			case TTMCConstraintPackage.LESS_EQUAL_EXPRESSION: return createLessEqualExpression();
			case TTMCConstraintPackage.ADD_EXPRESSION: return createAddExpression();
			case TTMCConstraintPackage.SUBTRACT_EXPRESSION: return createSubtractExpression();
			case TTMCConstraintPackage.MULTIPLY_EXPRESSION: return createMultiplyExpression();
			case TTMCConstraintPackage.DIVIDE_EXPRESSION: return createDivideExpression();
			case TTMCConstraintPackage.DIV_EXPRESSION: return createDivExpression();
			case TTMCConstraintPackage.MOD_EXPRESSION: return createModExpression();
			case TTMCConstraintPackage.UNARY_MINUS_EXPRESSION: return createUnaryMinusExpression();
			case TTMCConstraintPackage.UNARY_PLUS_EXPRESSION: return createUnaryPlusExpression();
			case TTMCConstraintPackage.FUNCTION_ACCESS_EXPRESSION: return createFunctionAccessExpression();
			case TTMCConstraintPackage.ARRAY_ACCESS_EXPRESSION: return createArrayAccessExpression();
			case TTMCConstraintPackage.TUPLE_ACCESS_EXPRESSION: return createTupleAccessExpression();
			case TTMCConstraintPackage.RECORD_ACCESS_EXPRESSION: return createRecordAccessExpression();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParametrizedElement createParametrizedElement() {
		ParametrizedElementImpl parametrizedElement = new ParametrizedElementImpl();
		return parametrizedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintSpecification createConstraintSpecification() {
		ConstraintSpecificationImpl constraintSpecification = new ConstraintSpecificationImpl();
		return constraintSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterDeclaration createParameterDeclaration() {
		ParameterDeclarationImpl parameterDeclaration = new ParameterDeclarationImpl();
		return parameterDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldDeclaration createFieldDeclaration() {
		FieldDeclarationImpl fieldDeclaration = new FieldDeclarationImpl();
		return fieldDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LetDeclaration createLetDeclaration() {
		LetDeclarationImpl letDeclaration = new LetDeclarationImpl();
		return letDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstantDeclaration createConstantDeclaration() {
		ConstantDeclarationImpl constantDeclaration = new ConstantDeclarationImpl();
		return constantDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionDeclaration createFunctionDeclaration() {
		FunctionDeclarationImpl functionDeclaration = new FunctionDeclarationImpl();
		return functionDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createType() {
		TypeImpl type = new TypeImpl();
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDeclaration createTypeDeclaration() {
		TypeDeclarationImpl typeDeclaration = new TypeDeclarationImpl();
		return typeDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeReference createTypeReference() {
		TypeReferenceImpl typeReference = new TypeReferenceImpl();
		return typeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDefinition createTypeDefinition() {
		TypeDefinitionImpl typeDefinition = new TypeDefinitionImpl();
		return typeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerTypeDefinition createIntegerTypeDefinition() {
		IntegerTypeDefinitionImpl integerTypeDefinition = new IntegerTypeDefinitionImpl();
		return integerTypeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NaturalTypeDefinition createNaturalTypeDefinition() {
		NaturalTypeDefinitionImpl naturalTypeDefinition = new NaturalTypeDefinitionImpl();
		return naturalTypeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanTypeDefinition createBooleanTypeDefinition() {
		BooleanTypeDefinitionImpl booleanTypeDefinition = new BooleanTypeDefinitionImpl();
		return booleanTypeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealTypeDefinition createRealTypeDefinition() {
		RealTypeDefinitionImpl realTypeDefinition = new RealTypeDefinitionImpl();
		return realTypeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubrangeTypeDefinition createSubrangeTypeDefinition() {
		SubrangeTypeDefinitionImpl subrangeTypeDefinition = new SubrangeTypeDefinitionImpl();
		return subrangeTypeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubTypeDefinition createSubTypeDefinition() {
		SubTypeDefinitionImpl subTypeDefinition = new SubTypeDefinitionImpl();
		return subTypeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationTypeDefinition createEnumerationTypeDefinition() {
		EnumerationTypeDefinitionImpl enumerationTypeDefinition = new EnumerationTypeDefinitionImpl();
		return enumerationTypeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationLiteralDefinition createEnumerationLiteralDefinition() {
		EnumerationLiteralDefinitionImpl enumerationLiteralDefinition = new EnumerationLiteralDefinitionImpl();
		return enumerationLiteralDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionTypeDefinition createFunctionTypeDefinition() {
		FunctionTypeDefinitionImpl functionTypeDefinition = new FunctionTypeDefinitionImpl();
		return functionTypeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayTypeDefinition createArrayTypeDefinition() {
		ArrayTypeDefinitionImpl arrayTypeDefinition = new ArrayTypeDefinitionImpl();
		return arrayTypeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TupleTypeDefinition createTupleTypeDefinition() {
		TupleTypeDefinitionImpl tupleTypeDefinition = new TupleTypeDefinitionImpl();
		return tupleTypeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecordTypeDefinition createRecordTypeDefinition() {
		RecordTypeDefinitionImpl recordTypeDefinition = new RecordTypeDefinitionImpl();
		return recordTypeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicConstraintDefinition createBasicConstraintDefinition() {
		BasicConstraintDefinitionImpl basicConstraintDefinition = new BasicConstraintDefinitionImpl();
		return basicConstraintDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerLiteralExpression createIntegerLiteralExpression() {
		IntegerLiteralExpressionImpl integerLiteralExpression = new IntegerLiteralExpressionImpl();
		return integerLiteralExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalLiteralExpression createDecimalLiteralExpression() {
		DecimalLiteralExpressionImpl decimalLiteralExpression = new DecimalLiteralExpressionImpl();
		return decimalLiteralExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RationalLiteralExpression createRationalLiteralExpression() {
		RationalLiteralExpressionImpl rationalLiteralExpression = new RationalLiteralExpressionImpl();
		return rationalLiteralExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrueExpression createTrueExpression() {
		TrueExpressionImpl trueExpression = new TrueExpressionImpl();
		return trueExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FalseExpression createFalseExpression() {
		FalseExpressionImpl falseExpression = new FalseExpressionImpl();
		return falseExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayLiteralExpression createArrayLiteralExpression() {
		ArrayLiteralExpressionImpl arrayLiteralExpression = new ArrayLiteralExpressionImpl();
		return arrayLiteralExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionLiteralExpression createFunctionLiteralExpression() {
		FunctionLiteralExpressionImpl functionLiteralExpression = new FunctionLiteralExpressionImpl();
		return functionLiteralExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecordLiteralExpression createRecordLiteralExpression() {
		RecordLiteralExpressionImpl recordLiteralExpression = new RecordLiteralExpressionImpl();
		return recordLiteralExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldAssignment createFieldAssignment() {
		FieldAssignmentImpl fieldAssignment = new FieldAssignmentImpl();
		return fieldAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationLiteralExpression createEnumerationLiteralExpression() {
		EnumerationLiteralExpressionImpl enumerationLiteralExpression = new EnumerationLiteralExpressionImpl();
		return enumerationLiteralExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TupleLiteralExpression createTupleLiteralExpression() {
		TupleLiteralExpressionImpl tupleLiteralExpression = new TupleLiteralExpressionImpl();
		return tupleLiteralExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceExpression createReferenceExpression() {
		ReferenceExpressionImpl referenceExpression = new ReferenceExpressionImpl();
		return referenceExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfThenElseExpression createIfThenElseExpression() {
		IfThenElseExpressionImpl ifThenElseExpression = new IfThenElseExpressionImpl();
		return ifThenElseExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LetExpression createLetExpression() {
		LetExpressionImpl letExpression = new LetExpressionImpl();
		return letExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EqualExpression createEqualExpression() {
		EqualExpressionImpl equalExpression = new EqualExpressionImpl();
		return equalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplyExpression createImplyExpression() {
		ImplyExpressionImpl implyExpression = new ImplyExpressionImpl();
		return implyExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrExpression createOrExpression() {
		OrExpressionImpl orExpression = new OrExpressionImpl();
		return orExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndExpression createAndExpression() {
		AndExpressionImpl andExpression = new AndExpressionImpl();
		return andExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReleaseExpression createReleaseExpression() {
		ReleaseExpressionImpl releaseExpression = new ReleaseExpressionImpl();
		return releaseExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UntilExpression createUntilExpression() {
		UntilExpressionImpl untilExpression = new UntilExpressionImpl();
		return untilExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotExpression createNotExpression() {
		NotExpressionImpl notExpression = new NotExpressionImpl();
		return notExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForallExpression createForallExpression() {
		ForallExpressionImpl forallExpression = new ForallExpressionImpl();
		return forallExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExistsExpression createExistsExpression() {
		ExistsExpressionImpl existsExpression = new ExistsExpressionImpl();
		return existsExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GloballyExpression createGloballyExpression() {
		GloballyExpressionImpl globallyExpression = new GloballyExpressionImpl();
		return globallyExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinallyExpression createFinallyExpression() {
		FinallyExpressionImpl finallyExpression = new FinallyExpressionImpl();
		return finallyExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NextExpression createNextExpression() {
		NextExpressionImpl nextExpression = new NextExpressionImpl();
		return nextExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalForallExpression createTemporalForallExpression() {
		TemporalForallExpressionImpl temporalForallExpression = new TemporalForallExpressionImpl();
		return temporalForallExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalExistsExpression createTemporalExistsExpression() {
		TemporalExistsExpressionImpl temporalExistsExpression = new TemporalExistsExpressionImpl();
		return temporalExistsExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InExpression createInExpression() {
		InExpressionImpl inExpression = new InExpressionImpl();
		return inExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimedExpression createPrimedExpression() {
		PrimedExpressionImpl primedExpression = new PrimedExpressionImpl();
		return primedExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EqualityExpression createEqualityExpression() {
		EqualityExpressionImpl equalityExpression = new EqualityExpressionImpl();
		return equalityExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InequalityExpression createInequalityExpression() {
		InequalityExpressionImpl inequalityExpression = new InequalityExpressionImpl();
		return inequalityExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GreaterExpression createGreaterExpression() {
		GreaterExpressionImpl greaterExpression = new GreaterExpressionImpl();
		return greaterExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GreaterEqualExpression createGreaterEqualExpression() {
		GreaterEqualExpressionImpl greaterEqualExpression = new GreaterEqualExpressionImpl();
		return greaterEqualExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LessExpression createLessExpression() {
		LessExpressionImpl lessExpression = new LessExpressionImpl();
		return lessExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LessEqualExpression createLessEqualExpression() {
		LessEqualExpressionImpl lessEqualExpression = new LessEqualExpressionImpl();
		return lessEqualExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddExpression createAddExpression() {
		AddExpressionImpl addExpression = new AddExpressionImpl();
		return addExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubtractExpression createSubtractExpression() {
		SubtractExpressionImpl subtractExpression = new SubtractExpressionImpl();
		return subtractExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiplyExpression createMultiplyExpression() {
		MultiplyExpressionImpl multiplyExpression = new MultiplyExpressionImpl();
		return multiplyExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DivideExpression createDivideExpression() {
		DivideExpressionImpl divideExpression = new DivideExpressionImpl();
		return divideExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DivExpression createDivExpression() {
		DivExpressionImpl divExpression = new DivExpressionImpl();
		return divExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModExpression createModExpression() {
		ModExpressionImpl modExpression = new ModExpressionImpl();
		return modExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryMinusExpression createUnaryMinusExpression() {
		UnaryMinusExpressionImpl unaryMinusExpression = new UnaryMinusExpressionImpl();
		return unaryMinusExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryPlusExpression createUnaryPlusExpression() {
		UnaryPlusExpressionImpl unaryPlusExpression = new UnaryPlusExpressionImpl();
		return unaryPlusExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionAccessExpression createFunctionAccessExpression() {
		FunctionAccessExpressionImpl functionAccessExpression = new FunctionAccessExpressionImpl();
		return functionAccessExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayAccessExpression createArrayAccessExpression() {
		ArrayAccessExpressionImpl arrayAccessExpression = new ArrayAccessExpressionImpl();
		return arrayAccessExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TupleAccessExpression createTupleAccessExpression() {
		TupleAccessExpressionImpl tupleAccessExpression = new TupleAccessExpressionImpl();
		return tupleAccessExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecordAccessExpression createRecordAccessExpression() {
		RecordAccessExpressionImpl recordAccessExpression = new RecordAccessExpressionImpl();
		return recordAccessExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTMCConstraintPackage getTTMCConstraintPackage() {
		return (TTMCConstraintPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TTMCConstraintPackage getPackage() {
		return TTMCConstraintPackage.eINSTANCE;
	}

} //TTMCConstraintFactoryImpl
