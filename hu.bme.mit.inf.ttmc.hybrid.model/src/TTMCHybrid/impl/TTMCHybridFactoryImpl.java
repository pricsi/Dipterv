/**
 */
package TTMCHybrid.impl;

import TTMCHybrid.*;

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
public class TTMCHybridFactoryImpl extends EFactoryImpl implements TTMCHybridFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TTMCHybridFactory init() {
		try {
			TTMCHybridFactory theTTMCHybridFactory = (TTMCHybridFactory)EPackage.Registry.INSTANCE.getEFactory(TTMCHybridPackage.eNS_URI);
			if (theTTMCHybridFactory != null) {
				return theTTMCHybridFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TTMCHybridFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTMCHybridFactoryImpl() {
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
			case TTMCHybridPackage.HYBRID_SPECIFICATION: return createHybridSpecification();
			case TTMCHybridPackage.CLOCK_TYPE_DEFINITION: return createClockTypeDefinition();
			case TTMCHybridPackage.DOT_EXPRESSION: return createDotExpression();
			case TTMCHybridPackage.LOCATION_REFERENCE_EXPRESSION: return createLocationReferenceExpression();
			case TTMCHybridPackage.HYBRID_AUTOMATON_DECLARATION: return createHybridAutomatonDeclaration();
			case TTMCHybridPackage.HYBRID_AUTOMATON_REFERENCE: return createHybridAutomatonReference();
			case TTMCHybridPackage.HYBRID_AUTOMATON_DEFINITION: return createHybridAutomatonDefinition();
			case TTMCHybridPackage.LOCAL_VARIABLE_DECLARATION: return createLocalVariableDeclaration();
			case TTMCHybridPackage.GLOBAL_VARIABLE_DECLARATION: return createGlobalVariableDeclaration();
			case TTMCHybridPackage.LOCATION: return createLocation();
			case TTMCHybridPackage.INITIAL_CONDITION: return createInitialCondition();
			case TTMCHybridPackage.INVARIANT_CONDITION: return createInvariantCondition();
			case TTMCHybridPackage.FLOW_CONDITION: return createFlowCondition();
			case TTMCHybridPackage.TRANSITION: return createTransition();
			case TTMCHybridPackage.ASSIGNMENT: return createAssignment();
			case TTMCHybridPackage.PROPERTY_DECLARATION: return createPropertyDeclaration();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HybridSpecification createHybridSpecification() {
		HybridSpecificationImpl hybridSpecification = new HybridSpecificationImpl();
		return hybridSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClockTypeDefinition createClockTypeDefinition() {
		ClockTypeDefinitionImpl clockTypeDefinition = new ClockTypeDefinitionImpl();
		return clockTypeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DotExpression createDotExpression() {
		DotExpressionImpl dotExpression = new DotExpressionImpl();
		return dotExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationReferenceExpression createLocationReferenceExpression() {
		LocationReferenceExpressionImpl locationReferenceExpression = new LocationReferenceExpressionImpl();
		return locationReferenceExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HybridAutomatonDeclaration createHybridAutomatonDeclaration() {
		HybridAutomatonDeclarationImpl hybridAutomatonDeclaration = new HybridAutomatonDeclarationImpl();
		return hybridAutomatonDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HybridAutomatonReference createHybridAutomatonReference() {
		HybridAutomatonReferenceImpl hybridAutomatonReference = new HybridAutomatonReferenceImpl();
		return hybridAutomatonReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HybridAutomatonDefinition createHybridAutomatonDefinition() {
		HybridAutomatonDefinitionImpl hybridAutomatonDefinition = new HybridAutomatonDefinitionImpl();
		return hybridAutomatonDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalVariableDeclaration createLocalVariableDeclaration() {
		LocalVariableDeclarationImpl localVariableDeclaration = new LocalVariableDeclarationImpl();
		return localVariableDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalVariableDeclaration createGlobalVariableDeclaration() {
		GlobalVariableDeclarationImpl globalVariableDeclaration = new GlobalVariableDeclarationImpl();
		return globalVariableDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialCondition createInitialCondition() {
		InitialConditionImpl initialCondition = new InitialConditionImpl();
		return initialCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvariantCondition createInvariantCondition() {
		InvariantConditionImpl invariantCondition = new InvariantConditionImpl();
		return invariantCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowCondition createFlowCondition() {
		FlowConditionImpl flowCondition = new FlowConditionImpl();
		return flowCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assignment createAssignment() {
		AssignmentImpl assignment = new AssignmentImpl();
		return assignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyDeclaration createPropertyDeclaration() {
		PropertyDeclarationImpl propertyDeclaration = new PropertyDeclarationImpl();
		return propertyDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTMCHybridPackage getTTMCHybridPackage() {
		return (TTMCHybridPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TTMCHybridPackage getPackage() {
		return TTMCHybridPackage.eINSTANCE;
	}

} //TTMCHybridFactoryImpl
