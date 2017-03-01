/**
 */
package TTMCConstraint.util;

import TTMCConstraint.*;

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
 * @see TTMCConstraint.TTMCConstraintPackage
 * @generated
 */
public class TTMCConstraintSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TTMCConstraintPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTMCConstraintSwitch() {
		if (modelPackage == null) {
			modelPackage = TTMCConstraintPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
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
			case TTMCConstraintPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.PARAMETRIC_ELEMENT: {
				ParametricElement parametricElement = (ParametricElement)theEObject;
				T result = caseParametricElement(parametricElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.PARAMETRIZED_ELEMENT: {
				ParametrizedElement parametrizedElement = (ParametrizedElement)theEObject;
				T result = caseParametrizedElement(parametrizedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.CONSTRAINT_SPECIFICATION: {
				ConstraintSpecification constraintSpecification = (ConstraintSpecification)theEObject;
				T result = caseConstraintSpecification(constraintSpecification);
				if (result == null) result = caseNamedElement(constraintSpecification);
				if (result == null) result = caseParametricElement(constraintSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.DECLARATION: {
				Declaration declaration = (Declaration)theEObject;
				T result = caseDeclaration(declaration);
				if (result == null) result = caseNamedElement(declaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.DEFINABLE_DECLARATION: {
				DefinableDeclaration definableDeclaration = (DefinableDeclaration)theEObject;
				T result = caseDefinableDeclaration(definableDeclaration);
				if (result == null) result = caseDeclaration(definableDeclaration);
				if (result == null) result = caseNamedElement(definableDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.PARAMETER_DECLARATION: {
				ParameterDeclaration parameterDeclaration = (ParameterDeclaration)theEObject;
				T result = caseParameterDeclaration(parameterDeclaration);
				if (result == null) result = caseDeclaration(parameterDeclaration);
				if (result == null) result = caseNamedElement(parameterDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.FIELD_DECLARATION: {
				FieldDeclaration fieldDeclaration = (FieldDeclaration)theEObject;
				T result = caseFieldDeclaration(fieldDeclaration);
				if (result == null) result = caseDeclaration(fieldDeclaration);
				if (result == null) result = caseNamedElement(fieldDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.LET_DECLARATION: {
				LetDeclaration letDeclaration = (LetDeclaration)theEObject;
				T result = caseLetDeclaration(letDeclaration);
				if (result == null) result = caseDefinableDeclaration(letDeclaration);
				if (result == null) result = caseDeclaration(letDeclaration);
				if (result == null) result = caseNamedElement(letDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.CONSTANT_DECLARATION: {
				ConstantDeclaration constantDeclaration = (ConstantDeclaration)theEObject;
				T result = caseConstantDeclaration(constantDeclaration);
				if (result == null) result = caseDefinableDeclaration(constantDeclaration);
				if (result == null) result = caseDeclaration(constantDeclaration);
				if (result == null) result = caseNamedElement(constantDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.FUNCTION_DECLARATION: {
				FunctionDeclaration functionDeclaration = (FunctionDeclaration)theEObject;
				T result = caseFunctionDeclaration(functionDeclaration);
				if (result == null) result = caseDefinableDeclaration(functionDeclaration);
				if (result == null) result = caseParametricElement(functionDeclaration);
				if (result == null) result = caseDeclaration(functionDeclaration);
				if (result == null) result = caseNamedElement(functionDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.TYPE: {
				Type type = (Type)theEObject;
				T result = caseType(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.TYPE_DECLARATION: {
				TypeDeclaration typeDeclaration = (TypeDeclaration)theEObject;
				T result = caseTypeDeclaration(typeDeclaration);
				if (result == null) result = caseNamedElement(typeDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.TYPE_REFERENCE: {
				TypeReference typeReference = (TypeReference)theEObject;
				T result = caseTypeReference(typeReference);
				if (result == null) result = caseType(typeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.TYPE_DEFINITION: {
				TypeDefinition typeDefinition = (TypeDefinition)theEObject;
				T result = caseTypeDefinition(typeDefinition);
				if (result == null) result = caseType(typeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.BASIC_TYPE_DEFINITION: {
				BasicTypeDefinition basicTypeDefinition = (BasicTypeDefinition)theEObject;
				T result = caseBasicTypeDefinition(basicTypeDefinition);
				if (result == null) result = caseTypeDefinition(basicTypeDefinition);
				if (result == null) result = caseType(basicTypeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.INTEGER_TYPE_DEFINITION: {
				IntegerTypeDefinition integerTypeDefinition = (IntegerTypeDefinition)theEObject;
				T result = caseIntegerTypeDefinition(integerTypeDefinition);
				if (result == null) result = caseBasicTypeDefinition(integerTypeDefinition);
				if (result == null) result = caseTypeDefinition(integerTypeDefinition);
				if (result == null) result = caseType(integerTypeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.NATURAL_TYPE_DEFINITION: {
				NaturalTypeDefinition naturalTypeDefinition = (NaturalTypeDefinition)theEObject;
				T result = caseNaturalTypeDefinition(naturalTypeDefinition);
				if (result == null) result = caseBasicTypeDefinition(naturalTypeDefinition);
				if (result == null) result = caseTypeDefinition(naturalTypeDefinition);
				if (result == null) result = caseType(naturalTypeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.BOOLEAN_TYPE_DEFINITION: {
				BooleanTypeDefinition booleanTypeDefinition = (BooleanTypeDefinition)theEObject;
				T result = caseBooleanTypeDefinition(booleanTypeDefinition);
				if (result == null) result = caseBasicTypeDefinition(booleanTypeDefinition);
				if (result == null) result = caseTypeDefinition(booleanTypeDefinition);
				if (result == null) result = caseType(booleanTypeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.REAL_TYPE_DEFINITION: {
				RealTypeDefinition realTypeDefinition = (RealTypeDefinition)theEObject;
				T result = caseRealTypeDefinition(realTypeDefinition);
				if (result == null) result = caseBasicTypeDefinition(realTypeDefinition);
				if (result == null) result = caseTypeDefinition(realTypeDefinition);
				if (result == null) result = caseType(realTypeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.SUBRANGE_TYPE_DEFINITION: {
				SubrangeTypeDefinition subrangeTypeDefinition = (SubrangeTypeDefinition)theEObject;
				T result = caseSubrangeTypeDefinition(subrangeTypeDefinition);
				if (result == null) result = caseTypeDefinition(subrangeTypeDefinition);
				if (result == null) result = caseType(subrangeTypeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.SUB_TYPE_DEFINITION: {
				SubTypeDefinition subTypeDefinition = (SubTypeDefinition)theEObject;
				T result = caseSubTypeDefinition(subTypeDefinition);
				if (result == null) result = caseTypeDefinition(subTypeDefinition);
				if (result == null) result = caseParametricElement(subTypeDefinition);
				if (result == null) result = caseType(subTypeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.ENUMERATION_TYPE_DEFINITION: {
				EnumerationTypeDefinition enumerationTypeDefinition = (EnumerationTypeDefinition)theEObject;
				T result = caseEnumerationTypeDefinition(enumerationTypeDefinition);
				if (result == null) result = caseTypeDefinition(enumerationTypeDefinition);
				if (result == null) result = caseType(enumerationTypeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.ENUMERATION_LITERAL_DEFINITION: {
				EnumerationLiteralDefinition enumerationLiteralDefinition = (EnumerationLiteralDefinition)theEObject;
				T result = caseEnumerationLiteralDefinition(enumerationLiteralDefinition);
				if (result == null) result = caseNamedElement(enumerationLiteralDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.FUNCTION_TYPE_DEFINITION: {
				FunctionTypeDefinition functionTypeDefinition = (FunctionTypeDefinition)theEObject;
				T result = caseFunctionTypeDefinition(functionTypeDefinition);
				if (result == null) result = caseTypeDefinition(functionTypeDefinition);
				if (result == null) result = caseType(functionTypeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.ARRAY_TYPE_DEFINITION: {
				ArrayTypeDefinition arrayTypeDefinition = (ArrayTypeDefinition)theEObject;
				T result = caseArrayTypeDefinition(arrayTypeDefinition);
				if (result == null) result = caseTypeDefinition(arrayTypeDefinition);
				if (result == null) result = caseType(arrayTypeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.TUPLE_TYPE_DEFINITION: {
				TupleTypeDefinition tupleTypeDefinition = (TupleTypeDefinition)theEObject;
				T result = caseTupleTypeDefinition(tupleTypeDefinition);
				if (result == null) result = caseTypeDefinition(tupleTypeDefinition);
				if (result == null) result = caseType(tupleTypeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.RECORD_TYPE_DEFINITION: {
				RecordTypeDefinition recordTypeDefinition = (RecordTypeDefinition)theEObject;
				T result = caseRecordTypeDefinition(recordTypeDefinition);
				if (result == null) result = caseTypeDefinition(recordTypeDefinition);
				if (result == null) result = caseType(recordTypeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.CONSTRAINT_DEFINITION: {
				ConstraintDefinition constraintDefinition = (ConstraintDefinition)theEObject;
				T result = caseConstraintDefinition(constraintDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.BASIC_CONSTRAINT_DEFINITION: {
				BasicConstraintDefinition basicConstraintDefinition = (BasicConstraintDefinition)theEObject;
				T result = caseBasicConstraintDefinition(basicConstraintDefinition);
				if (result == null) result = caseConstraintDefinition(basicConstraintDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.NULLARY_EXPRESSION: {
				NullaryExpression nullaryExpression = (NullaryExpression)theEObject;
				T result = caseNullaryExpression(nullaryExpression);
				if (result == null) result = caseExpression(nullaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.UNARY_EXPRESSION: {
				UnaryExpression unaryExpression = (UnaryExpression)theEObject;
				T result = caseUnaryExpression(unaryExpression);
				if (result == null) result = caseExpression(unaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.BINARY_EXPRESSION: {
				BinaryExpression binaryExpression = (BinaryExpression)theEObject;
				T result = caseBinaryExpression(binaryExpression);
				if (result == null) result = caseExpression(binaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.MULTIARY_EXPRESSION: {
				MultiaryExpression multiaryExpression = (MultiaryExpression)theEObject;
				T result = caseMultiaryExpression(multiaryExpression);
				if (result == null) result = caseExpression(multiaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.PREDICATE_EXPRESSION: {
				PredicateExpression predicateExpression = (PredicateExpression)theEObject;
				T result = casePredicateExpression(predicateExpression);
				if (result == null) result = caseExpression(predicateExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.ARITHMETIC_EXPRESSION: {
				ArithmeticExpression arithmeticExpression = (ArithmeticExpression)theEObject;
				T result = caseArithmeticExpression(arithmeticExpression);
				if (result == null) result = caseExpression(arithmeticExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.ACCESS_EXPRESSION: {
				AccessExpression accessExpression = (AccessExpression)theEObject;
				T result = caseAccessExpression(accessExpression);
				if (result == null) result = caseExpression(accessExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.BOOLEAN_EXPRESSION: {
				BooleanExpression booleanExpression = (BooleanExpression)theEObject;
				T result = caseBooleanExpression(booleanExpression);
				if (result == null) result = caseExpression(booleanExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.QUANTIFIER_EXPRESSION: {
				QuantifierExpression quantifierExpression = (QuantifierExpression)theEObject;
				T result = caseQuantifierExpression(quantifierExpression);
				if (result == null) result = caseUnaryExpression(quantifierExpression);
				if (result == null) result = caseParametricElement(quantifierExpression);
				if (result == null) result = caseExpression(quantifierExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.TEMPORAL_EXPRESSION: {
				TemporalExpression temporalExpression = (TemporalExpression)theEObject;
				T result = caseTemporalExpression(temporalExpression);
				if (result == null) result = caseExpression(temporalExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.TEMPORAL_PATH_EXPRESSION: {
				TemporalPathExpression temporalPathExpression = (TemporalPathExpression)theEObject;
				T result = caseTemporalPathExpression(temporalPathExpression);
				if (result == null) result = caseTemporalExpression(temporalPathExpression);
				if (result == null) result = caseExpression(temporalPathExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.TEMPORAL_STATE_EXPRESSION: {
				TemporalStateExpression temporalStateExpression = (TemporalStateExpression)theEObject;
				T result = caseTemporalStateExpression(temporalStateExpression);
				if (result == null) result = caseTemporalExpression(temporalStateExpression);
				if (result == null) result = caseExpression(temporalStateExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.LITERAL_EXPRESSION: {
				LiteralExpression literalExpression = (LiteralExpression)theEObject;
				T result = caseLiteralExpression(literalExpression);
				if (result == null) result = caseExpression(literalExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.ARITHMETIC_LITERAL_EXPRESSION: {
				ArithmeticLiteralExpression arithmeticLiteralExpression = (ArithmeticLiteralExpression)theEObject;
				T result = caseArithmeticLiteralExpression(arithmeticLiteralExpression);
				if (result == null) result = caseNullaryExpression(arithmeticLiteralExpression);
				if (result == null) result = caseLiteralExpression(arithmeticLiteralExpression);
				if (result == null) result = caseArithmeticExpression(arithmeticLiteralExpression);
				if (result == null) result = caseExpression(arithmeticLiteralExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.INTEGER_LITERAL_EXPRESSION: {
				IntegerLiteralExpression integerLiteralExpression = (IntegerLiteralExpression)theEObject;
				T result = caseIntegerLiteralExpression(integerLiteralExpression);
				if (result == null) result = caseArithmeticLiteralExpression(integerLiteralExpression);
				if (result == null) result = caseNullaryExpression(integerLiteralExpression);
				if (result == null) result = caseLiteralExpression(integerLiteralExpression);
				if (result == null) result = caseArithmeticExpression(integerLiteralExpression);
				if (result == null) result = caseExpression(integerLiteralExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.DECIMAL_LITERAL_EXPRESSION: {
				DecimalLiteralExpression decimalLiteralExpression = (DecimalLiteralExpression)theEObject;
				T result = caseDecimalLiteralExpression(decimalLiteralExpression);
				if (result == null) result = caseArithmeticLiteralExpression(decimalLiteralExpression);
				if (result == null) result = caseNullaryExpression(decimalLiteralExpression);
				if (result == null) result = caseLiteralExpression(decimalLiteralExpression);
				if (result == null) result = caseArithmeticExpression(decimalLiteralExpression);
				if (result == null) result = caseExpression(decimalLiteralExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.RATIONAL_LITERAL_EXPRESSION: {
				RationalLiteralExpression rationalLiteralExpression = (RationalLiteralExpression)theEObject;
				T result = caseRationalLiteralExpression(rationalLiteralExpression);
				if (result == null) result = caseArithmeticLiteralExpression(rationalLiteralExpression);
				if (result == null) result = caseNullaryExpression(rationalLiteralExpression);
				if (result == null) result = caseLiteralExpression(rationalLiteralExpression);
				if (result == null) result = caseArithmeticExpression(rationalLiteralExpression);
				if (result == null) result = caseExpression(rationalLiteralExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.BOOLEAN_LITERAL_EXPRESSION: {
				BooleanLiteralExpression booleanLiteralExpression = (BooleanLiteralExpression)theEObject;
				T result = caseBooleanLiteralExpression(booleanLiteralExpression);
				if (result == null) result = caseNullaryExpression(booleanLiteralExpression);
				if (result == null) result = caseLiteralExpression(booleanLiteralExpression);
				if (result == null) result = caseBooleanExpression(booleanLiteralExpression);
				if (result == null) result = caseExpression(booleanLiteralExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.TRUE_EXPRESSION: {
				TrueExpression trueExpression = (TrueExpression)theEObject;
				T result = caseTrueExpression(trueExpression);
				if (result == null) result = caseBooleanLiteralExpression(trueExpression);
				if (result == null) result = caseNullaryExpression(trueExpression);
				if (result == null) result = caseLiteralExpression(trueExpression);
				if (result == null) result = caseBooleanExpression(trueExpression);
				if (result == null) result = caseExpression(trueExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.FALSE_EXPRESSION: {
				FalseExpression falseExpression = (FalseExpression)theEObject;
				T result = caseFalseExpression(falseExpression);
				if (result == null) result = caseBooleanLiteralExpression(falseExpression);
				if (result == null) result = caseNullaryExpression(falseExpression);
				if (result == null) result = caseLiteralExpression(falseExpression);
				if (result == null) result = caseBooleanExpression(falseExpression);
				if (result == null) result = caseExpression(falseExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.ARRAY_LITERAL_EXPRESSION: {
				ArrayLiteralExpression arrayLiteralExpression = (ArrayLiteralExpression)theEObject;
				T result = caseArrayLiteralExpression(arrayLiteralExpression);
				if (result == null) result = caseUnaryExpression(arrayLiteralExpression);
				if (result == null) result = caseLiteralExpression(arrayLiteralExpression);
				if (result == null) result = caseParametricElement(arrayLiteralExpression);
				if (result == null) result = caseExpression(arrayLiteralExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.FUNCTION_LITERAL_EXPRESSION: {
				FunctionLiteralExpression functionLiteralExpression = (FunctionLiteralExpression)theEObject;
				T result = caseFunctionLiteralExpression(functionLiteralExpression);
				if (result == null) result = caseUnaryExpression(functionLiteralExpression);
				if (result == null) result = caseLiteralExpression(functionLiteralExpression);
				if (result == null) result = caseParametricElement(functionLiteralExpression);
				if (result == null) result = caseExpression(functionLiteralExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.RECORD_LITERAL_EXPRESSION: {
				RecordLiteralExpression recordLiteralExpression = (RecordLiteralExpression)theEObject;
				T result = caseRecordLiteralExpression(recordLiteralExpression);
				if (result == null) result = caseLiteralExpression(recordLiteralExpression);
				if (result == null) result = caseExpression(recordLiteralExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.FIELD_ASSIGNMENT: {
				FieldAssignment fieldAssignment = (FieldAssignment)theEObject;
				T result = caseFieldAssignment(fieldAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.ENUMERATION_LITERAL_EXPRESSION: {
				EnumerationLiteralExpression enumerationLiteralExpression = (EnumerationLiteralExpression)theEObject;
				T result = caseEnumerationLiteralExpression(enumerationLiteralExpression);
				if (result == null) result = caseNullaryExpression(enumerationLiteralExpression);
				if (result == null) result = caseLiteralExpression(enumerationLiteralExpression);
				if (result == null) result = caseExpression(enumerationLiteralExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.TUPLE_LITERAL_EXPRESSION: {
				TupleLiteralExpression tupleLiteralExpression = (TupleLiteralExpression)theEObject;
				T result = caseTupleLiteralExpression(tupleLiteralExpression);
				if (result == null) result = caseLiteralExpression(tupleLiteralExpression);
				if (result == null) result = caseExpression(tupleLiteralExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.REFERENCE_EXPRESSION: {
				ReferenceExpression referenceExpression = (ReferenceExpression)theEObject;
				T result = caseReferenceExpression(referenceExpression);
				if (result == null) result = caseNullaryExpression(referenceExpression);
				if (result == null) result = caseExpression(referenceExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.IF_THEN_ELSE_EXPRESSION: {
				IfThenElseExpression ifThenElseExpression = (IfThenElseExpression)theEObject;
				T result = caseIfThenElseExpression(ifThenElseExpression);
				if (result == null) result = caseExpression(ifThenElseExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.LET_EXPRESSION: {
				LetExpression letExpression = (LetExpression)theEObject;
				T result = caseLetExpression(letExpression);
				if (result == null) result = caseExpression(letExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.EQUAL_EXPRESSION: {
				EqualExpression equalExpression = (EqualExpression)theEObject;
				T result = caseEqualExpression(equalExpression);
				if (result == null) result = caseBooleanExpression(equalExpression);
				if (result == null) result = caseBinaryExpression(equalExpression);
				if (result == null) result = caseExpression(equalExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.IMPLY_EXPRESSION: {
				ImplyExpression implyExpression = (ImplyExpression)theEObject;
				T result = caseImplyExpression(implyExpression);
				if (result == null) result = caseBooleanExpression(implyExpression);
				if (result == null) result = caseBinaryExpression(implyExpression);
				if (result == null) result = caseExpression(implyExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.OR_EXPRESSION: {
				OrExpression orExpression = (OrExpression)theEObject;
				T result = caseOrExpression(orExpression);
				if (result == null) result = caseBooleanExpression(orExpression);
				if (result == null) result = caseMultiaryExpression(orExpression);
				if (result == null) result = caseExpression(orExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.AND_EXPRESSION: {
				AndExpression andExpression = (AndExpression)theEObject;
				T result = caseAndExpression(andExpression);
				if (result == null) result = caseBooleanExpression(andExpression);
				if (result == null) result = caseMultiaryExpression(andExpression);
				if (result == null) result = caseExpression(andExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.RELEASE_EXPRESSION: {
				ReleaseExpression releaseExpression = (ReleaseExpression)theEObject;
				T result = caseReleaseExpression(releaseExpression);
				if (result == null) result = caseTemporalPathExpression(releaseExpression);
				if (result == null) result = caseBinaryExpression(releaseExpression);
				if (result == null) result = caseTemporalExpression(releaseExpression);
				if (result == null) result = caseExpression(releaseExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.UNTIL_EXPRESSION: {
				UntilExpression untilExpression = (UntilExpression)theEObject;
				T result = caseUntilExpression(untilExpression);
				if (result == null) result = caseTemporalPathExpression(untilExpression);
				if (result == null) result = caseBinaryExpression(untilExpression);
				if (result == null) result = caseTemporalExpression(untilExpression);
				if (result == null) result = caseExpression(untilExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.NOT_EXPRESSION: {
				NotExpression notExpression = (NotExpression)theEObject;
				T result = caseNotExpression(notExpression);
				if (result == null) result = caseBooleanExpression(notExpression);
				if (result == null) result = caseUnaryExpression(notExpression);
				if (result == null) result = caseExpression(notExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.FORALL_EXPRESSION: {
				ForallExpression forallExpression = (ForallExpression)theEObject;
				T result = caseForallExpression(forallExpression);
				if (result == null) result = caseQuantifierExpression(forallExpression);
				if (result == null) result = caseUnaryExpression(forallExpression);
				if (result == null) result = caseParametricElement(forallExpression);
				if (result == null) result = caseExpression(forallExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.EXISTS_EXPRESSION: {
				ExistsExpression existsExpression = (ExistsExpression)theEObject;
				T result = caseExistsExpression(existsExpression);
				if (result == null) result = caseQuantifierExpression(existsExpression);
				if (result == null) result = caseUnaryExpression(existsExpression);
				if (result == null) result = caseParametricElement(existsExpression);
				if (result == null) result = caseExpression(existsExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.GLOBALLY_EXPRESSION: {
				GloballyExpression globallyExpression = (GloballyExpression)theEObject;
				T result = caseGloballyExpression(globallyExpression);
				if (result == null) result = caseTemporalPathExpression(globallyExpression);
				if (result == null) result = caseUnaryExpression(globallyExpression);
				if (result == null) result = caseTemporalExpression(globallyExpression);
				if (result == null) result = caseExpression(globallyExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.FINALLY_EXPRESSION: {
				FinallyExpression finallyExpression = (FinallyExpression)theEObject;
				T result = caseFinallyExpression(finallyExpression);
				if (result == null) result = caseTemporalPathExpression(finallyExpression);
				if (result == null) result = caseUnaryExpression(finallyExpression);
				if (result == null) result = caseTemporalExpression(finallyExpression);
				if (result == null) result = caseExpression(finallyExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.NEXT_EXPRESSION: {
				NextExpression nextExpression = (NextExpression)theEObject;
				T result = caseNextExpression(nextExpression);
				if (result == null) result = caseTemporalPathExpression(nextExpression);
				if (result == null) result = caseUnaryExpression(nextExpression);
				if (result == null) result = caseTemporalExpression(nextExpression);
				if (result == null) result = caseExpression(nextExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.TEMPORAL_FORALL_EXPRESSION: {
				TemporalForallExpression temporalForallExpression = (TemporalForallExpression)theEObject;
				T result = caseTemporalForallExpression(temporalForallExpression);
				if (result == null) result = caseTemporalStateExpression(temporalForallExpression);
				if (result == null) result = caseUnaryExpression(temporalForallExpression);
				if (result == null) result = caseTemporalExpression(temporalForallExpression);
				if (result == null) result = caseExpression(temporalForallExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.TEMPORAL_EXISTS_EXPRESSION: {
				TemporalExistsExpression temporalExistsExpression = (TemporalExistsExpression)theEObject;
				T result = caseTemporalExistsExpression(temporalExistsExpression);
				if (result == null) result = caseTemporalStateExpression(temporalExistsExpression);
				if (result == null) result = caseUnaryExpression(temporalExistsExpression);
				if (result == null) result = caseTemporalExpression(temporalExistsExpression);
				if (result == null) result = caseExpression(temporalExistsExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.IN_EXPRESSION: {
				InExpression inExpression = (InExpression)theEObject;
				T result = caseInExpression(inExpression);
				if (result == null) result = casePredicateExpression(inExpression);
				if (result == null) result = caseUnaryExpression(inExpression);
				if (result == null) result = caseExpression(inExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.PRIMED_EXPRESSION: {
				PrimedExpression primedExpression = (PrimedExpression)theEObject;
				T result = casePrimedExpression(primedExpression);
				if (result == null) result = caseUnaryExpression(primedExpression);
				if (result == null) result = caseExpression(primedExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.EQUIVALENCE_EXPRESSION: {
				EquivalenceExpression equivalenceExpression = (EquivalenceExpression)theEObject;
				T result = caseEquivalenceExpression(equivalenceExpression);
				if (result == null) result = casePredicateExpression(equivalenceExpression);
				if (result == null) result = caseBinaryExpression(equivalenceExpression);
				if (result == null) result = caseExpression(equivalenceExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.EQUALITY_EXPRESSION: {
				EqualityExpression equalityExpression = (EqualityExpression)theEObject;
				T result = caseEqualityExpression(equalityExpression);
				if (result == null) result = caseEquivalenceExpression(equalityExpression);
				if (result == null) result = casePredicateExpression(equalityExpression);
				if (result == null) result = caseBinaryExpression(equalityExpression);
				if (result == null) result = caseExpression(equalityExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.INEQUALITY_EXPRESSION: {
				InequalityExpression inequalityExpression = (InequalityExpression)theEObject;
				T result = caseInequalityExpression(inequalityExpression);
				if (result == null) result = caseEquivalenceExpression(inequalityExpression);
				if (result == null) result = casePredicateExpression(inequalityExpression);
				if (result == null) result = caseBinaryExpression(inequalityExpression);
				if (result == null) result = caseExpression(inequalityExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.COMPARISION_EXPRESSION: {
				ComparisionExpression comparisionExpression = (ComparisionExpression)theEObject;
				T result = caseComparisionExpression(comparisionExpression);
				if (result == null) result = casePredicateExpression(comparisionExpression);
				if (result == null) result = caseBinaryExpression(comparisionExpression);
				if (result == null) result = caseExpression(comparisionExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.GREATER_EXPRESSION: {
				GreaterExpression greaterExpression = (GreaterExpression)theEObject;
				T result = caseGreaterExpression(greaterExpression);
				if (result == null) result = caseComparisionExpression(greaterExpression);
				if (result == null) result = casePredicateExpression(greaterExpression);
				if (result == null) result = caseBinaryExpression(greaterExpression);
				if (result == null) result = caseExpression(greaterExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.GREATER_EQUAL_EXPRESSION: {
				GreaterEqualExpression greaterEqualExpression = (GreaterEqualExpression)theEObject;
				T result = caseGreaterEqualExpression(greaterEqualExpression);
				if (result == null) result = caseComparisionExpression(greaterEqualExpression);
				if (result == null) result = casePredicateExpression(greaterEqualExpression);
				if (result == null) result = caseBinaryExpression(greaterEqualExpression);
				if (result == null) result = caseExpression(greaterEqualExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.LESS_EXPRESSION: {
				LessExpression lessExpression = (LessExpression)theEObject;
				T result = caseLessExpression(lessExpression);
				if (result == null) result = caseComparisionExpression(lessExpression);
				if (result == null) result = casePredicateExpression(lessExpression);
				if (result == null) result = caseBinaryExpression(lessExpression);
				if (result == null) result = caseExpression(lessExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.LESS_EQUAL_EXPRESSION: {
				LessEqualExpression lessEqualExpression = (LessEqualExpression)theEObject;
				T result = caseLessEqualExpression(lessEqualExpression);
				if (result == null) result = caseComparisionExpression(lessEqualExpression);
				if (result == null) result = casePredicateExpression(lessEqualExpression);
				if (result == null) result = caseBinaryExpression(lessEqualExpression);
				if (result == null) result = caseExpression(lessEqualExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.ADD_EXPRESSION: {
				AddExpression addExpression = (AddExpression)theEObject;
				T result = caseAddExpression(addExpression);
				if (result == null) result = caseArithmeticExpression(addExpression);
				if (result == null) result = caseMultiaryExpression(addExpression);
				if (result == null) result = caseExpression(addExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.SUBTRACT_EXPRESSION: {
				SubtractExpression subtractExpression = (SubtractExpression)theEObject;
				T result = caseSubtractExpression(subtractExpression);
				if (result == null) result = caseArithmeticExpression(subtractExpression);
				if (result == null) result = caseBinaryExpression(subtractExpression);
				if (result == null) result = caseExpression(subtractExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.MULTIPLY_EXPRESSION: {
				MultiplyExpression multiplyExpression = (MultiplyExpression)theEObject;
				T result = caseMultiplyExpression(multiplyExpression);
				if (result == null) result = caseArithmeticExpression(multiplyExpression);
				if (result == null) result = caseMultiaryExpression(multiplyExpression);
				if (result == null) result = caseExpression(multiplyExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.DIVIDE_EXPRESSION: {
				DivideExpression divideExpression = (DivideExpression)theEObject;
				T result = caseDivideExpression(divideExpression);
				if (result == null) result = caseArithmeticExpression(divideExpression);
				if (result == null) result = caseBinaryExpression(divideExpression);
				if (result == null) result = caseExpression(divideExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.DIV_EXPRESSION: {
				DivExpression divExpression = (DivExpression)theEObject;
				T result = caseDivExpression(divExpression);
				if (result == null) result = caseArithmeticExpression(divExpression);
				if (result == null) result = caseBinaryExpression(divExpression);
				if (result == null) result = caseExpression(divExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.MOD_EXPRESSION: {
				ModExpression modExpression = (ModExpression)theEObject;
				T result = caseModExpression(modExpression);
				if (result == null) result = caseArithmeticExpression(modExpression);
				if (result == null) result = caseBinaryExpression(modExpression);
				if (result == null) result = caseExpression(modExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.UNARY_MINUS_EXPRESSION: {
				UnaryMinusExpression unaryMinusExpression = (UnaryMinusExpression)theEObject;
				T result = caseUnaryMinusExpression(unaryMinusExpression);
				if (result == null) result = caseArithmeticExpression(unaryMinusExpression);
				if (result == null) result = caseUnaryExpression(unaryMinusExpression);
				if (result == null) result = caseExpression(unaryMinusExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.UNARY_PLUS_EXPRESSION: {
				UnaryPlusExpression unaryPlusExpression = (UnaryPlusExpression)theEObject;
				T result = caseUnaryPlusExpression(unaryPlusExpression);
				if (result == null) result = caseArithmeticExpression(unaryPlusExpression);
				if (result == null) result = caseUnaryExpression(unaryPlusExpression);
				if (result == null) result = caseExpression(unaryPlusExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.FUNCTION_ACCESS_EXPRESSION: {
				FunctionAccessExpression functionAccessExpression = (FunctionAccessExpression)theEObject;
				T result = caseFunctionAccessExpression(functionAccessExpression);
				if (result == null) result = caseAccessExpression(functionAccessExpression);
				if (result == null) result = caseParametrizedElement(functionAccessExpression);
				if (result == null) result = caseExpression(functionAccessExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.ARRAY_ACCESS_EXPRESSION: {
				ArrayAccessExpression arrayAccessExpression = (ArrayAccessExpression)theEObject;
				T result = caseArrayAccessExpression(arrayAccessExpression);
				if (result == null) result = caseAccessExpression(arrayAccessExpression);
				if (result == null) result = caseParametrizedElement(arrayAccessExpression);
				if (result == null) result = caseExpression(arrayAccessExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.TUPLE_ACCESS_EXPRESSION: {
				TupleAccessExpression tupleAccessExpression = (TupleAccessExpression)theEObject;
				T result = caseTupleAccessExpression(tupleAccessExpression);
				if (result == null) result = caseAccessExpression(tupleAccessExpression);
				if (result == null) result = caseExpression(tupleAccessExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTMCConstraintPackage.RECORD_ACCESS_EXPRESSION: {
				RecordAccessExpression recordAccessExpression = (RecordAccessExpression)theEObject;
				T result = caseRecordAccessExpression(recordAccessExpression);
				if (result == null) result = caseAccessExpression(recordAccessExpression);
				if (result == null) result = caseExpression(recordAccessExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterDeclaration(ParameterDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldDeclaration(FieldDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Let Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Let Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLetDeclaration(LetDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constant Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constant Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstantDeclaration(ConstantDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionDeclaration(FunctionDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDeclaration(TypeDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeReference(TypeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDefinition(TypeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Type Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicTypeDefinition(BasicTypeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Type Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerTypeDefinition(IntegerTypeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Natural Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Natural Type Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNaturalTypeDefinition(NaturalTypeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Type Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanTypeDefinition(BooleanTypeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Real Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Real Type Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealTypeDefinition(RealTypeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subrange Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subrange Type Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubrangeTypeDefinition(SubrangeTypeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Type Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubTypeDefinition(SubTypeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Type Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerationTypeDefinition(EnumerationTypeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Literal Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Literal Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerationLiteralDefinition(EnumerationLiteralDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Type Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionTypeDefinition(FunctionTypeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Type Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayTypeDefinition(ArrayTypeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tuple Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tuple Type Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTupleTypeDefinition(TupleTypeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Record Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Record Type Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecordTypeDefinition(RecordTypeDefinition object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Basic Constraint Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Constraint Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicConstraintDefinition(BasicConstraintDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nullary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nullary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNullaryExpression(NullaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryExpression(UnaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryExpression(BinaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiaryExpression(MultiaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Predicate Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Predicate Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePredicateExpression(PredicateExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arithmetic Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arithmetic Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArithmeticExpression(ArithmeticExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Access Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Access Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessExpression(AccessExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanExpression(BooleanExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantifier Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantifier Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantifierExpression(QuantifierExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temporal Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temporal Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemporalExpression(TemporalExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temporal Path Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temporal Path Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemporalPathExpression(TemporalPathExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temporal State Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temporal State Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemporalStateExpression(TemporalStateExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralExpression(LiteralExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arithmetic Literal Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arithmetic Literal Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArithmeticLiteralExpression(ArithmeticLiteralExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Literal Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Literal Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerLiteralExpression(IntegerLiteralExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decimal Literal Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decimal Literal Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecimalLiteralExpression(DecimalLiteralExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rational Literal Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rational Literal Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRationalLiteralExpression(RationalLiteralExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Literal Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Literal Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanLiteralExpression(BooleanLiteralExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>True Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>True Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrueExpression(TrueExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>False Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>False Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFalseExpression(FalseExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Literal Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Literal Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayLiteralExpression(ArrayLiteralExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Literal Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Literal Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionLiteralExpression(FunctionLiteralExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Record Literal Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Record Literal Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecordLiteralExpression(RecordLiteralExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldAssignment(FieldAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Literal Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Literal Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerationLiteralExpression(EnumerationLiteralExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tuple Literal Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tuple Literal Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTupleLiteralExpression(TupleLiteralExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceExpression(ReferenceExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If Then Else Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Then Else Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIfThenElseExpression(IfThenElseExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Let Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Let Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLetExpression(LetExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equal Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equal Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEqualExpression(EqualExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imply Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imply Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplyExpression(ImplyExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrExpression(OrExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAndExpression(AndExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Release Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Release Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReleaseExpression(ReleaseExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Until Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Until Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUntilExpression(UntilExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotExpression(NotExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Forall Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Forall Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForallExpression(ForallExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exists Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exists Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExistsExpression(ExistsExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Globally Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Globally Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGloballyExpression(GloballyExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Finally Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Finally Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinallyExpression(FinallyExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Next Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Next Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNextExpression(NextExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temporal Forall Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temporal Forall Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemporalForallExpression(TemporalForallExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temporal Exists Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temporal Exists Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemporalExistsExpression(TemporalExistsExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>In Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>In Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInExpression(InExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primed Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primed Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimedExpression(PrimedExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equivalence Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equivalence Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEquivalenceExpression(EquivalenceExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equality Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equality Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEqualityExpression(EqualityExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inequality Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inequality Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInequalityExpression(InequalityExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comparision Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comparision Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComparisionExpression(ComparisionExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Greater Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Greater Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGreaterExpression(GreaterExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Greater Equal Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Greater Equal Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGreaterEqualExpression(GreaterEqualExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Less Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Less Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLessExpression(LessExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Less Equal Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Less Equal Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLessEqualExpression(LessEqualExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddExpression(AddExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subtract Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subtract Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubtractExpression(SubtractExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiply Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiply Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiplyExpression(MultiplyExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Divide Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Divide Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDivideExpression(DivideExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Div Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Div Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDivExpression(DivExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mod Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mod Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModExpression(ModExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Minus Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Minus Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryMinusExpression(UnaryMinusExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Plus Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Plus Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryPlusExpression(UnaryPlusExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Access Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Access Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionAccessExpression(FunctionAccessExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Access Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Access Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayAccessExpression(ArrayAccessExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tuple Access Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tuple Access Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTupleAccessExpression(TupleAccessExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Record Access Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Record Access Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecordAccessExpression(RecordAccessExpression object) {
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

} //TTMCConstraintSwitch
