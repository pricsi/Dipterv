/**
 */
package TTMCConstraint.util;

import TTMCConstraint.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see TTMCConstraint.TTMCConstraintPackage
 * @generated
 */
public class TTMCConstraintAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TTMCConstraintPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTMCConstraintAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TTMCConstraintPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TTMCConstraintSwitch<Adapter> modelSwitch =
		new TTMCConstraintSwitch<Adapter>() {
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseParametricElement(ParametricElement object) {
				return createParametricElementAdapter();
			}
			@Override
			public Adapter caseParametrizedElement(ParametrizedElement object) {
				return createParametrizedElementAdapter();
			}
			@Override
			public Adapter caseConstraintSpecification(ConstraintSpecification object) {
				return createConstraintSpecificationAdapter();
			}
			@Override
			public Adapter caseDeclaration(Declaration object) {
				return createDeclarationAdapter();
			}
			@Override
			public Adapter caseDefinableDeclaration(DefinableDeclaration object) {
				return createDefinableDeclarationAdapter();
			}
			@Override
			public Adapter caseParameterDeclaration(ParameterDeclaration object) {
				return createParameterDeclarationAdapter();
			}
			@Override
			public Adapter caseFieldDeclaration(FieldDeclaration object) {
				return createFieldDeclarationAdapter();
			}
			@Override
			public Adapter caseLetDeclaration(LetDeclaration object) {
				return createLetDeclarationAdapter();
			}
			@Override
			public Adapter caseConstantDeclaration(ConstantDeclaration object) {
				return createConstantDeclarationAdapter();
			}
			@Override
			public Adapter caseFunctionDeclaration(FunctionDeclaration object) {
				return createFunctionDeclarationAdapter();
			}
			@Override
			public Adapter caseType(Type object) {
				return createTypeAdapter();
			}
			@Override
			public Adapter caseTypeDeclaration(TypeDeclaration object) {
				return createTypeDeclarationAdapter();
			}
			@Override
			public Adapter caseTypeReference(TypeReference object) {
				return createTypeReferenceAdapter();
			}
			@Override
			public Adapter caseTypeDefinition(TypeDefinition object) {
				return createTypeDefinitionAdapter();
			}
			@Override
			public Adapter caseBasicTypeDefinition(BasicTypeDefinition object) {
				return createBasicTypeDefinitionAdapter();
			}
			@Override
			public Adapter caseIntegerTypeDefinition(IntegerTypeDefinition object) {
				return createIntegerTypeDefinitionAdapter();
			}
			@Override
			public Adapter caseNaturalTypeDefinition(NaturalTypeDefinition object) {
				return createNaturalTypeDefinitionAdapter();
			}
			@Override
			public Adapter caseBooleanTypeDefinition(BooleanTypeDefinition object) {
				return createBooleanTypeDefinitionAdapter();
			}
			@Override
			public Adapter caseRealTypeDefinition(RealTypeDefinition object) {
				return createRealTypeDefinitionAdapter();
			}
			@Override
			public Adapter caseSubrangeTypeDefinition(SubrangeTypeDefinition object) {
				return createSubrangeTypeDefinitionAdapter();
			}
			@Override
			public Adapter caseSubTypeDefinition(SubTypeDefinition object) {
				return createSubTypeDefinitionAdapter();
			}
			@Override
			public Adapter caseEnumerationTypeDefinition(EnumerationTypeDefinition object) {
				return createEnumerationTypeDefinitionAdapter();
			}
			@Override
			public Adapter caseEnumerationLiteralDefinition(EnumerationLiteralDefinition object) {
				return createEnumerationLiteralDefinitionAdapter();
			}
			@Override
			public Adapter caseFunctionTypeDefinition(FunctionTypeDefinition object) {
				return createFunctionTypeDefinitionAdapter();
			}
			@Override
			public Adapter caseArrayTypeDefinition(ArrayTypeDefinition object) {
				return createArrayTypeDefinitionAdapter();
			}
			@Override
			public Adapter caseTupleTypeDefinition(TupleTypeDefinition object) {
				return createTupleTypeDefinitionAdapter();
			}
			@Override
			public Adapter caseRecordTypeDefinition(RecordTypeDefinition object) {
				return createRecordTypeDefinitionAdapter();
			}
			@Override
			public Adapter caseConstraintDefinition(ConstraintDefinition object) {
				return createConstraintDefinitionAdapter();
			}
			@Override
			public Adapter caseBasicConstraintDefinition(BasicConstraintDefinition object) {
				return createBasicConstraintDefinitionAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseNullaryExpression(NullaryExpression object) {
				return createNullaryExpressionAdapter();
			}
			@Override
			public Adapter caseUnaryExpression(UnaryExpression object) {
				return createUnaryExpressionAdapter();
			}
			@Override
			public Adapter caseBinaryExpression(BinaryExpression object) {
				return createBinaryExpressionAdapter();
			}
			@Override
			public Adapter caseMultiaryExpression(MultiaryExpression object) {
				return createMultiaryExpressionAdapter();
			}
			@Override
			public Adapter casePredicateExpression(PredicateExpression object) {
				return createPredicateExpressionAdapter();
			}
			@Override
			public Adapter caseArithmeticExpression(ArithmeticExpression object) {
				return createArithmeticExpressionAdapter();
			}
			@Override
			public Adapter caseAccessExpression(AccessExpression object) {
				return createAccessExpressionAdapter();
			}
			@Override
			public Adapter caseBooleanExpression(BooleanExpression object) {
				return createBooleanExpressionAdapter();
			}
			@Override
			public Adapter caseQuantifierExpression(QuantifierExpression object) {
				return createQuantifierExpressionAdapter();
			}
			@Override
			public Adapter caseTemporalExpression(TemporalExpression object) {
				return createTemporalExpressionAdapter();
			}
			@Override
			public Adapter caseTemporalPathExpression(TemporalPathExpression object) {
				return createTemporalPathExpressionAdapter();
			}
			@Override
			public Adapter caseTemporalStateExpression(TemporalStateExpression object) {
				return createTemporalStateExpressionAdapter();
			}
			@Override
			public Adapter caseLiteralExpression(LiteralExpression object) {
				return createLiteralExpressionAdapter();
			}
			@Override
			public Adapter caseArithmeticLiteralExpression(ArithmeticLiteralExpression object) {
				return createArithmeticLiteralExpressionAdapter();
			}
			@Override
			public Adapter caseIntegerLiteralExpression(IntegerLiteralExpression object) {
				return createIntegerLiteralExpressionAdapter();
			}
			@Override
			public Adapter caseDecimalLiteralExpression(DecimalLiteralExpression object) {
				return createDecimalLiteralExpressionAdapter();
			}
			@Override
			public Adapter caseRationalLiteralExpression(RationalLiteralExpression object) {
				return createRationalLiteralExpressionAdapter();
			}
			@Override
			public Adapter caseBooleanLiteralExpression(BooleanLiteralExpression object) {
				return createBooleanLiteralExpressionAdapter();
			}
			@Override
			public Adapter caseTrueExpression(TrueExpression object) {
				return createTrueExpressionAdapter();
			}
			@Override
			public Adapter caseFalseExpression(FalseExpression object) {
				return createFalseExpressionAdapter();
			}
			@Override
			public Adapter caseArrayLiteralExpression(ArrayLiteralExpression object) {
				return createArrayLiteralExpressionAdapter();
			}
			@Override
			public Adapter caseFunctionLiteralExpression(FunctionLiteralExpression object) {
				return createFunctionLiteralExpressionAdapter();
			}
			@Override
			public Adapter caseRecordLiteralExpression(RecordLiteralExpression object) {
				return createRecordLiteralExpressionAdapter();
			}
			@Override
			public Adapter caseFieldAssignment(FieldAssignment object) {
				return createFieldAssignmentAdapter();
			}
			@Override
			public Adapter caseEnumerationLiteralExpression(EnumerationLiteralExpression object) {
				return createEnumerationLiteralExpressionAdapter();
			}
			@Override
			public Adapter caseTupleLiteralExpression(TupleLiteralExpression object) {
				return createTupleLiteralExpressionAdapter();
			}
			@Override
			public Adapter caseReferenceExpression(ReferenceExpression object) {
				return createReferenceExpressionAdapter();
			}
			@Override
			public Adapter caseIfThenElseExpression(IfThenElseExpression object) {
				return createIfThenElseExpressionAdapter();
			}
			@Override
			public Adapter caseLetExpression(LetExpression object) {
				return createLetExpressionAdapter();
			}
			@Override
			public Adapter caseEqualExpression(EqualExpression object) {
				return createEqualExpressionAdapter();
			}
			@Override
			public Adapter caseImplyExpression(ImplyExpression object) {
				return createImplyExpressionAdapter();
			}
			@Override
			public Adapter caseOrExpression(OrExpression object) {
				return createOrExpressionAdapter();
			}
			@Override
			public Adapter caseAndExpression(AndExpression object) {
				return createAndExpressionAdapter();
			}
			@Override
			public Adapter caseReleaseExpression(ReleaseExpression object) {
				return createReleaseExpressionAdapter();
			}
			@Override
			public Adapter caseUntilExpression(UntilExpression object) {
				return createUntilExpressionAdapter();
			}
			@Override
			public Adapter caseNotExpression(NotExpression object) {
				return createNotExpressionAdapter();
			}
			@Override
			public Adapter caseForallExpression(ForallExpression object) {
				return createForallExpressionAdapter();
			}
			@Override
			public Adapter caseExistsExpression(ExistsExpression object) {
				return createExistsExpressionAdapter();
			}
			@Override
			public Adapter caseGloballyExpression(GloballyExpression object) {
				return createGloballyExpressionAdapter();
			}
			@Override
			public Adapter caseFinallyExpression(FinallyExpression object) {
				return createFinallyExpressionAdapter();
			}
			@Override
			public Adapter caseNextExpression(NextExpression object) {
				return createNextExpressionAdapter();
			}
			@Override
			public Adapter caseTemporalForallExpression(TemporalForallExpression object) {
				return createTemporalForallExpressionAdapter();
			}
			@Override
			public Adapter caseTemporalExistsExpression(TemporalExistsExpression object) {
				return createTemporalExistsExpressionAdapter();
			}
			@Override
			public Adapter caseInExpression(InExpression object) {
				return createInExpressionAdapter();
			}
			@Override
			public Adapter casePrimedExpression(PrimedExpression object) {
				return createPrimedExpressionAdapter();
			}
			@Override
			public Adapter caseEquivalenceExpression(EquivalenceExpression object) {
				return createEquivalenceExpressionAdapter();
			}
			@Override
			public Adapter caseEqualityExpression(EqualityExpression object) {
				return createEqualityExpressionAdapter();
			}
			@Override
			public Adapter caseInequalityExpression(InequalityExpression object) {
				return createInequalityExpressionAdapter();
			}
			@Override
			public Adapter caseComparisionExpression(ComparisionExpression object) {
				return createComparisionExpressionAdapter();
			}
			@Override
			public Adapter caseGreaterExpression(GreaterExpression object) {
				return createGreaterExpressionAdapter();
			}
			@Override
			public Adapter caseGreaterEqualExpression(GreaterEqualExpression object) {
				return createGreaterEqualExpressionAdapter();
			}
			@Override
			public Adapter caseLessExpression(LessExpression object) {
				return createLessExpressionAdapter();
			}
			@Override
			public Adapter caseLessEqualExpression(LessEqualExpression object) {
				return createLessEqualExpressionAdapter();
			}
			@Override
			public Adapter caseAddExpression(AddExpression object) {
				return createAddExpressionAdapter();
			}
			@Override
			public Adapter caseSubtractExpression(SubtractExpression object) {
				return createSubtractExpressionAdapter();
			}
			@Override
			public Adapter caseMultiplyExpression(MultiplyExpression object) {
				return createMultiplyExpressionAdapter();
			}
			@Override
			public Adapter caseDivideExpression(DivideExpression object) {
				return createDivideExpressionAdapter();
			}
			@Override
			public Adapter caseDivExpression(DivExpression object) {
				return createDivExpressionAdapter();
			}
			@Override
			public Adapter caseModExpression(ModExpression object) {
				return createModExpressionAdapter();
			}
			@Override
			public Adapter caseUnaryMinusExpression(UnaryMinusExpression object) {
				return createUnaryMinusExpressionAdapter();
			}
			@Override
			public Adapter caseUnaryPlusExpression(UnaryPlusExpression object) {
				return createUnaryPlusExpressionAdapter();
			}
			@Override
			public Adapter caseFunctionAccessExpression(FunctionAccessExpression object) {
				return createFunctionAccessExpressionAdapter();
			}
			@Override
			public Adapter caseArrayAccessExpression(ArrayAccessExpression object) {
				return createArrayAccessExpressionAdapter();
			}
			@Override
			public Adapter caseTupleAccessExpression(TupleAccessExpression object) {
				return createTupleAccessExpressionAdapter();
			}
			@Override
			public Adapter caseRecordAccessExpression(RecordAccessExpression object) {
				return createRecordAccessExpressionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.ParametricElement <em>Parametric Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.ParametricElement
	 * @generated
	 */
	public Adapter createParametricElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.ParametrizedElement <em>Parametrized Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.ParametrizedElement
	 * @generated
	 */
	public Adapter createParametrizedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.ConstraintSpecification <em>Constraint Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.ConstraintSpecification
	 * @generated
	 */
	public Adapter createConstraintSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.Declaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.Declaration
	 * @generated
	 */
	public Adapter createDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.DefinableDeclaration <em>Definable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.DefinableDeclaration
	 * @generated
	 */
	public Adapter createDefinableDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.ParameterDeclaration <em>Parameter Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.ParameterDeclaration
	 * @generated
	 */
	public Adapter createParameterDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.FieldDeclaration <em>Field Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.FieldDeclaration
	 * @generated
	 */
	public Adapter createFieldDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.LetDeclaration <em>Let Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.LetDeclaration
	 * @generated
	 */
	public Adapter createLetDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.ConstantDeclaration <em>Constant Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.ConstantDeclaration
	 * @generated
	 */
	public Adapter createConstantDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.FunctionDeclaration <em>Function Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.FunctionDeclaration
	 * @generated
	 */
	public Adapter createFunctionDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.TypeDeclaration <em>Type Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.TypeDeclaration
	 * @generated
	 */
	public Adapter createTypeDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.TypeReference <em>Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.TypeReference
	 * @generated
	 */
	public Adapter createTypeReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.TypeDefinition <em>Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.TypeDefinition
	 * @generated
	 */
	public Adapter createTypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.BasicTypeDefinition <em>Basic Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.BasicTypeDefinition
	 * @generated
	 */
	public Adapter createBasicTypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.IntegerTypeDefinition <em>Integer Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.IntegerTypeDefinition
	 * @generated
	 */
	public Adapter createIntegerTypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.NaturalTypeDefinition <em>Natural Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.NaturalTypeDefinition
	 * @generated
	 */
	public Adapter createNaturalTypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.BooleanTypeDefinition <em>Boolean Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.BooleanTypeDefinition
	 * @generated
	 */
	public Adapter createBooleanTypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.RealTypeDefinition <em>Real Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.RealTypeDefinition
	 * @generated
	 */
	public Adapter createRealTypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.SubrangeTypeDefinition <em>Subrange Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.SubrangeTypeDefinition
	 * @generated
	 */
	public Adapter createSubrangeTypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.SubTypeDefinition <em>Sub Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.SubTypeDefinition
	 * @generated
	 */
	public Adapter createSubTypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.EnumerationTypeDefinition <em>Enumeration Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.EnumerationTypeDefinition
	 * @generated
	 */
	public Adapter createEnumerationTypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.EnumerationLiteralDefinition <em>Enumeration Literal Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.EnumerationLiteralDefinition
	 * @generated
	 */
	public Adapter createEnumerationLiteralDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.FunctionTypeDefinition <em>Function Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.FunctionTypeDefinition
	 * @generated
	 */
	public Adapter createFunctionTypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.ArrayTypeDefinition <em>Array Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.ArrayTypeDefinition
	 * @generated
	 */
	public Adapter createArrayTypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.TupleTypeDefinition <em>Tuple Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.TupleTypeDefinition
	 * @generated
	 */
	public Adapter createTupleTypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.RecordTypeDefinition <em>Record Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.RecordTypeDefinition
	 * @generated
	 */
	public Adapter createRecordTypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.ConstraintDefinition <em>Constraint Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.ConstraintDefinition
	 * @generated
	 */
	public Adapter createConstraintDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.BasicConstraintDefinition <em>Basic Constraint Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.BasicConstraintDefinition
	 * @generated
	 */
	public Adapter createBasicConstraintDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.NullaryExpression <em>Nullary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.NullaryExpression
	 * @generated
	 */
	public Adapter createNullaryExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.UnaryExpression <em>Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.UnaryExpression
	 * @generated
	 */
	public Adapter createUnaryExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.BinaryExpression <em>Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.BinaryExpression
	 * @generated
	 */
	public Adapter createBinaryExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.MultiaryExpression <em>Multiary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.MultiaryExpression
	 * @generated
	 */
	public Adapter createMultiaryExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.PredicateExpression <em>Predicate Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.PredicateExpression
	 * @generated
	 */
	public Adapter createPredicateExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.ArithmeticExpression <em>Arithmetic Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.ArithmeticExpression
	 * @generated
	 */
	public Adapter createArithmeticExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.AccessExpression <em>Access Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.AccessExpression
	 * @generated
	 */
	public Adapter createAccessExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.BooleanExpression <em>Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.BooleanExpression
	 * @generated
	 */
	public Adapter createBooleanExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.QuantifierExpression <em>Quantifier Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.QuantifierExpression
	 * @generated
	 */
	public Adapter createQuantifierExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.TemporalExpression <em>Temporal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.TemporalExpression
	 * @generated
	 */
	public Adapter createTemporalExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.TemporalPathExpression <em>Temporal Path Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.TemporalPathExpression
	 * @generated
	 */
	public Adapter createTemporalPathExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.TemporalStateExpression <em>Temporal State Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.TemporalStateExpression
	 * @generated
	 */
	public Adapter createTemporalStateExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.LiteralExpression <em>Literal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.LiteralExpression
	 * @generated
	 */
	public Adapter createLiteralExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.ArithmeticLiteralExpression <em>Arithmetic Literal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.ArithmeticLiteralExpression
	 * @generated
	 */
	public Adapter createArithmeticLiteralExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.IntegerLiteralExpression <em>Integer Literal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.IntegerLiteralExpression
	 * @generated
	 */
	public Adapter createIntegerLiteralExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.DecimalLiteralExpression <em>Decimal Literal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.DecimalLiteralExpression
	 * @generated
	 */
	public Adapter createDecimalLiteralExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.RationalLiteralExpression <em>Rational Literal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.RationalLiteralExpression
	 * @generated
	 */
	public Adapter createRationalLiteralExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.BooleanLiteralExpression <em>Boolean Literal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.BooleanLiteralExpression
	 * @generated
	 */
	public Adapter createBooleanLiteralExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.TrueExpression <em>True Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.TrueExpression
	 * @generated
	 */
	public Adapter createTrueExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.FalseExpression <em>False Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.FalseExpression
	 * @generated
	 */
	public Adapter createFalseExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.ArrayLiteralExpression <em>Array Literal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.ArrayLiteralExpression
	 * @generated
	 */
	public Adapter createArrayLiteralExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.FunctionLiteralExpression <em>Function Literal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.FunctionLiteralExpression
	 * @generated
	 */
	public Adapter createFunctionLiteralExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.RecordLiteralExpression <em>Record Literal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.RecordLiteralExpression
	 * @generated
	 */
	public Adapter createRecordLiteralExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.FieldAssignment <em>Field Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.FieldAssignment
	 * @generated
	 */
	public Adapter createFieldAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.EnumerationLiteralExpression <em>Enumeration Literal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.EnumerationLiteralExpression
	 * @generated
	 */
	public Adapter createEnumerationLiteralExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.TupleLiteralExpression <em>Tuple Literal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.TupleLiteralExpression
	 * @generated
	 */
	public Adapter createTupleLiteralExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.ReferenceExpression <em>Reference Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.ReferenceExpression
	 * @generated
	 */
	public Adapter createReferenceExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.IfThenElseExpression <em>If Then Else Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.IfThenElseExpression
	 * @generated
	 */
	public Adapter createIfThenElseExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.LetExpression <em>Let Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.LetExpression
	 * @generated
	 */
	public Adapter createLetExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.EqualExpression <em>Equal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.EqualExpression
	 * @generated
	 */
	public Adapter createEqualExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.ImplyExpression <em>Imply Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.ImplyExpression
	 * @generated
	 */
	public Adapter createImplyExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.OrExpression <em>Or Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.OrExpression
	 * @generated
	 */
	public Adapter createOrExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.AndExpression <em>And Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.AndExpression
	 * @generated
	 */
	public Adapter createAndExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.ReleaseExpression <em>Release Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.ReleaseExpression
	 * @generated
	 */
	public Adapter createReleaseExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.UntilExpression <em>Until Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.UntilExpression
	 * @generated
	 */
	public Adapter createUntilExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.NotExpression <em>Not Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.NotExpression
	 * @generated
	 */
	public Adapter createNotExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.ForallExpression <em>Forall Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.ForallExpression
	 * @generated
	 */
	public Adapter createForallExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.ExistsExpression <em>Exists Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.ExistsExpression
	 * @generated
	 */
	public Adapter createExistsExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.GloballyExpression <em>Globally Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.GloballyExpression
	 * @generated
	 */
	public Adapter createGloballyExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.FinallyExpression <em>Finally Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.FinallyExpression
	 * @generated
	 */
	public Adapter createFinallyExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.NextExpression <em>Next Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.NextExpression
	 * @generated
	 */
	public Adapter createNextExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.TemporalForallExpression <em>Temporal Forall Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.TemporalForallExpression
	 * @generated
	 */
	public Adapter createTemporalForallExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.TemporalExistsExpression <em>Temporal Exists Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.TemporalExistsExpression
	 * @generated
	 */
	public Adapter createTemporalExistsExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.InExpression <em>In Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.InExpression
	 * @generated
	 */
	public Adapter createInExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.PrimedExpression <em>Primed Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.PrimedExpression
	 * @generated
	 */
	public Adapter createPrimedExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.EquivalenceExpression <em>Equivalence Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.EquivalenceExpression
	 * @generated
	 */
	public Adapter createEquivalenceExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.EqualityExpression <em>Equality Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.EqualityExpression
	 * @generated
	 */
	public Adapter createEqualityExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.InequalityExpression <em>Inequality Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.InequalityExpression
	 * @generated
	 */
	public Adapter createInequalityExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.ComparisionExpression <em>Comparision Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.ComparisionExpression
	 * @generated
	 */
	public Adapter createComparisionExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.GreaterExpression <em>Greater Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.GreaterExpression
	 * @generated
	 */
	public Adapter createGreaterExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.GreaterEqualExpression <em>Greater Equal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.GreaterEqualExpression
	 * @generated
	 */
	public Adapter createGreaterEqualExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.LessExpression <em>Less Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.LessExpression
	 * @generated
	 */
	public Adapter createLessExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.LessEqualExpression <em>Less Equal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.LessEqualExpression
	 * @generated
	 */
	public Adapter createLessEqualExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.AddExpression <em>Add Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.AddExpression
	 * @generated
	 */
	public Adapter createAddExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.SubtractExpression <em>Subtract Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.SubtractExpression
	 * @generated
	 */
	public Adapter createSubtractExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.MultiplyExpression <em>Multiply Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.MultiplyExpression
	 * @generated
	 */
	public Adapter createMultiplyExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.DivideExpression <em>Divide Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.DivideExpression
	 * @generated
	 */
	public Adapter createDivideExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.DivExpression <em>Div Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.DivExpression
	 * @generated
	 */
	public Adapter createDivExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.ModExpression <em>Mod Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.ModExpression
	 * @generated
	 */
	public Adapter createModExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.UnaryMinusExpression <em>Unary Minus Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.UnaryMinusExpression
	 * @generated
	 */
	public Adapter createUnaryMinusExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.UnaryPlusExpression <em>Unary Plus Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.UnaryPlusExpression
	 * @generated
	 */
	public Adapter createUnaryPlusExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.FunctionAccessExpression <em>Function Access Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.FunctionAccessExpression
	 * @generated
	 */
	public Adapter createFunctionAccessExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.ArrayAccessExpression <em>Array Access Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.ArrayAccessExpression
	 * @generated
	 */
	public Adapter createArrayAccessExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.TupleAccessExpression <em>Tuple Access Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.TupleAccessExpression
	 * @generated
	 */
	public Adapter createTupleAccessExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TTMCConstraint.RecordAccessExpression <em>Record Access Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TTMCConstraint.RecordAccessExpression
	 * @generated
	 */
	public Adapter createRecordAccessExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TTMCConstraintAdapterFactory
