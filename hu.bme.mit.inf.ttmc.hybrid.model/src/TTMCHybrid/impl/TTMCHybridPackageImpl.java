/**
 */
package TTMCHybrid.impl;

import TTMCConstraint.TTMCConstraintPackage;

import TTMCHybrid.Assignment;
import TTMCHybrid.ClockTypeDefinition;
import TTMCHybrid.Condition;
import TTMCHybrid.DotExpression;
import TTMCHybrid.FlowCondition;
import TTMCHybrid.GlobalVariableDeclaration;
import TTMCHybrid.HybridAutomaton;
import TTMCHybrid.HybridAutomatonDeclaration;
import TTMCHybrid.HybridAutomatonDefinition;
import TTMCHybrid.HybridAutomatonReference;
import TTMCHybrid.HybridSpecification;
import TTMCHybrid.InitialCondition;
import TTMCHybrid.InvariantCondition;
import TTMCHybrid.LocalVariableDeclaration;
import TTMCHybrid.Location;
import TTMCHybrid.LocationReferenceExpression;
import TTMCHybrid.PropertyDeclaration;
import TTMCHybrid.TTMCHybridFactory;
import TTMCHybrid.TTMCHybridPackage;
import TTMCHybrid.Transition;
import TTMCHybrid.VariableDeclaration;

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
public class TTMCHybridPackageImpl extends EPackageImpl implements TTMCHybridPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hybridSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clockTypeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dotExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationReferenceExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hybridAutomatonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hybridAutomatonDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hybridAutomatonReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hybridAutomatonDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localVariableDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalVariableDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invariantConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyDeclarationEClass = null;

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
	 * @see TTMCHybrid.TTMCHybridPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TTMCHybridPackageImpl() {
		super(eNS_URI, TTMCHybridFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TTMCHybridPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TTMCHybridPackage init() {
		if (isInited) return (TTMCHybridPackage)EPackage.Registry.INSTANCE.getEPackage(TTMCHybridPackage.eNS_URI);

		// Obtain or create and register package
		TTMCHybridPackageImpl theTTMCHybridPackage = (TTMCHybridPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TTMCHybridPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TTMCHybridPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TTMCConstraintPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTTMCHybridPackage.createPackageContents();

		// Initialize created meta-data
		theTTMCHybridPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTTMCHybridPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TTMCHybridPackage.eNS_URI, theTTMCHybridPackage);
		return theTTMCHybridPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHybridSpecification() {
		return hybridSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHybridSpecification_HybridAutomatonDeclarations() {
		return (EReference)hybridSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHybridSpecification_PropertyDeclarations() {
		return (EReference)hybridSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClockTypeDefinition() {
		return clockTypeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDotExpression() {
		return dotExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocationReferenceExpression() {
		return locationReferenceExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocationReferenceExpression_Location() {
		return (EReference)locationReferenceExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHybridAutomaton() {
		return hybridAutomatonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHybridAutomatonDeclaration() {
		return hybridAutomatonDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHybridAutomatonDeclaration_HybridAutomaton() {
		return (EReference)hybridAutomatonDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHybridAutomatonReference() {
		return hybridAutomatonReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHybridAutomatonReference_Declaration() {
		return (EReference)hybridAutomatonReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHybridAutomatonDefinition() {
		return hybridAutomatonDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHybridAutomatonDefinition_VariableDeclarations() {
		return (EReference)hybridAutomatonDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHybridAutomatonDefinition_Locations() {
		return (EReference)hybridAutomatonDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHybridAutomatonDefinition_Transitions() {
		return (EReference)hybridAutomatonDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableDeclaration() {
		return variableDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalVariableDeclaration() {
		return localVariableDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalVariableDeclaration() {
		return globalVariableDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocation() {
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_Conditions() {
		return (EReference)locationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_Expression() {
		return (EReference)conditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitialCondition() {
		return initialConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInvariantCondition() {
		return invariantConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowCondition() {
		return flowConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Source() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Target() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Guards() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Assignments() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssignment() {
		return assignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignment_Lhs() {
		return (EReference)assignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignment_Rhs() {
		return (EReference)assignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyDeclaration() {
		return propertyDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyDeclaration_HybridAutomaton() {
		return (EReference)propertyDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyDeclaration_Expression() {
		return (EReference)propertyDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTMCHybridFactory getTTMCHybridFactory() {
		return (TTMCHybridFactory)getEFactoryInstance();
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
		hybridSpecificationEClass = createEClass(HYBRID_SPECIFICATION);
		createEReference(hybridSpecificationEClass, HYBRID_SPECIFICATION__HYBRID_AUTOMATON_DECLARATIONS);
		createEReference(hybridSpecificationEClass, HYBRID_SPECIFICATION__PROPERTY_DECLARATIONS);

		clockTypeDefinitionEClass = createEClass(CLOCK_TYPE_DEFINITION);

		dotExpressionEClass = createEClass(DOT_EXPRESSION);

		locationReferenceExpressionEClass = createEClass(LOCATION_REFERENCE_EXPRESSION);
		createEReference(locationReferenceExpressionEClass, LOCATION_REFERENCE_EXPRESSION__LOCATION);

		hybridAutomatonEClass = createEClass(HYBRID_AUTOMATON);

		hybridAutomatonDeclarationEClass = createEClass(HYBRID_AUTOMATON_DECLARATION);
		createEReference(hybridAutomatonDeclarationEClass, HYBRID_AUTOMATON_DECLARATION__HYBRID_AUTOMATON);

		hybridAutomatonReferenceEClass = createEClass(HYBRID_AUTOMATON_REFERENCE);
		createEReference(hybridAutomatonReferenceEClass, HYBRID_AUTOMATON_REFERENCE__DECLARATION);

		hybridAutomatonDefinitionEClass = createEClass(HYBRID_AUTOMATON_DEFINITION);
		createEReference(hybridAutomatonDefinitionEClass, HYBRID_AUTOMATON_DEFINITION__VARIABLE_DECLARATIONS);
		createEReference(hybridAutomatonDefinitionEClass, HYBRID_AUTOMATON_DEFINITION__LOCATIONS);
		createEReference(hybridAutomatonDefinitionEClass, HYBRID_AUTOMATON_DEFINITION__TRANSITIONS);

		variableDeclarationEClass = createEClass(VARIABLE_DECLARATION);

		localVariableDeclarationEClass = createEClass(LOCAL_VARIABLE_DECLARATION);

		globalVariableDeclarationEClass = createEClass(GLOBAL_VARIABLE_DECLARATION);

		locationEClass = createEClass(LOCATION);
		createEReference(locationEClass, LOCATION__CONDITIONS);

		conditionEClass = createEClass(CONDITION);
		createEReference(conditionEClass, CONDITION__EXPRESSION);

		initialConditionEClass = createEClass(INITIAL_CONDITION);

		invariantConditionEClass = createEClass(INVARIANT_CONDITION);

		flowConditionEClass = createEClass(FLOW_CONDITION);

		transitionEClass = createEClass(TRANSITION);
		createEReference(transitionEClass, TRANSITION__SOURCE);
		createEReference(transitionEClass, TRANSITION__TARGET);
		createEReference(transitionEClass, TRANSITION__GUARDS);
		createEReference(transitionEClass, TRANSITION__ASSIGNMENTS);

		assignmentEClass = createEClass(ASSIGNMENT);
		createEReference(assignmentEClass, ASSIGNMENT__LHS);
		createEReference(assignmentEClass, ASSIGNMENT__RHS);

		propertyDeclarationEClass = createEClass(PROPERTY_DECLARATION);
		createEReference(propertyDeclarationEClass, PROPERTY_DECLARATION__HYBRID_AUTOMATON);
		createEReference(propertyDeclarationEClass, PROPERTY_DECLARATION__EXPRESSION);
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

		// Obtain other dependent packages
		TTMCConstraintPackage theTTMCConstraintPackage = (TTMCConstraintPackage)EPackage.Registry.INSTANCE.getEPackage(TTMCConstraintPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		hybridSpecificationEClass.getESuperTypes().add(theTTMCConstraintPackage.getConstraintSpecification());
		clockTypeDefinitionEClass.getESuperTypes().add(theTTMCConstraintPackage.getBasicTypeDefinition());
		dotExpressionEClass.getESuperTypes().add(theTTMCConstraintPackage.getUnaryExpression());
		locationReferenceExpressionEClass.getESuperTypes().add(theTTMCConstraintPackage.getNullaryExpression());
		hybridAutomatonDeclarationEClass.getESuperTypes().add(theTTMCConstraintPackage.getNamedElement());
		hybridAutomatonDeclarationEClass.getESuperTypes().add(theTTMCConstraintPackage.getParametricElement());
		hybridAutomatonReferenceEClass.getESuperTypes().add(this.getHybridAutomaton());
		hybridAutomatonReferenceEClass.getESuperTypes().add(theTTMCConstraintPackage.getParametrizedElement());
		hybridAutomatonDefinitionEClass.getESuperTypes().add(this.getHybridAutomaton());
		variableDeclarationEClass.getESuperTypes().add(theTTMCConstraintPackage.getDeclaration());
		localVariableDeclarationEClass.getESuperTypes().add(this.getVariableDeclaration());
		globalVariableDeclarationEClass.getESuperTypes().add(this.getVariableDeclaration());
		locationEClass.getESuperTypes().add(theTTMCConstraintPackage.getNamedElement());
		initialConditionEClass.getESuperTypes().add(this.getCondition());
		invariantConditionEClass.getESuperTypes().add(this.getCondition());
		flowConditionEClass.getESuperTypes().add(this.getCondition());
		transitionEClass.getESuperTypes().add(theTTMCConstraintPackage.getParametricElement());
		propertyDeclarationEClass.getESuperTypes().add(theTTMCConstraintPackage.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(hybridSpecificationEClass, HybridSpecification.class, "HybridSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHybridSpecification_HybridAutomatonDeclarations(), this.getHybridAutomatonDeclaration(), null, "hybridAutomatonDeclarations", null, 0, -1, HybridSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHybridSpecification_PropertyDeclarations(), this.getPropertyDeclaration(), null, "propertyDeclarations", null, 0, -1, HybridSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clockTypeDefinitionEClass, ClockTypeDefinition.class, "ClockTypeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dotExpressionEClass, DotExpression.class, "DotExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(locationReferenceExpressionEClass, LocationReferenceExpression.class, "LocationReferenceExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocationReferenceExpression_Location(), this.getLocation(), null, "location", null, 1, 1, LocationReferenceExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hybridAutomatonEClass, HybridAutomaton.class, "HybridAutomaton", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hybridAutomatonDeclarationEClass, HybridAutomatonDeclaration.class, "HybridAutomatonDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHybridAutomatonDeclaration_HybridAutomaton(), this.getHybridAutomaton(), null, "hybridAutomaton", null, 1, 1, HybridAutomatonDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hybridAutomatonReferenceEClass, HybridAutomatonReference.class, "HybridAutomatonReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHybridAutomatonReference_Declaration(), this.getHybridAutomatonDeclaration(), null, "declaration", null, 1, 1, HybridAutomatonReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hybridAutomatonDefinitionEClass, HybridAutomatonDefinition.class, "HybridAutomatonDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHybridAutomatonDefinition_VariableDeclarations(), this.getVariableDeclaration(), null, "variableDeclarations", null, 0, -1, HybridAutomatonDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHybridAutomatonDefinition_Locations(), this.getLocation(), null, "locations", null, 0, -1, HybridAutomatonDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHybridAutomatonDefinition_Transitions(), this.getTransition(), null, "transitions", null, 0, -1, HybridAutomatonDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableDeclarationEClass, VariableDeclaration.class, "VariableDeclaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(localVariableDeclarationEClass, LocalVariableDeclaration.class, "LocalVariableDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(globalVariableDeclarationEClass, GlobalVariableDeclaration.class, "GlobalVariableDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocation_Conditions(), this.getCondition(), null, "conditions", null, 0, -1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionEClass, Condition.class, "Condition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCondition_Expression(), theTTMCConstraintPackage.getExpression(), null, "expression", null, 1, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initialConditionEClass, InitialCondition.class, "InitialCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(invariantConditionEClass, InvariantCondition.class, "InvariantCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(flowConditionEClass, FlowCondition.class, "FlowCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransition_Source(), this.getLocation(), null, "source", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Target(), this.getLocation(), null, "target", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Guards(), theTTMCConstraintPackage.getExpression(), null, "guards", null, 0, -1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Assignments(), this.getAssignment(), null, "assignments", null, 0, -1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assignmentEClass, Assignment.class, "Assignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssignment_Lhs(), theTTMCConstraintPackage.getExpression(), null, "lhs", null, 1, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssignment_Rhs(), theTTMCConstraintPackage.getExpression(), null, "rhs", null, 1, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyDeclarationEClass, PropertyDeclaration.class, "PropertyDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyDeclaration_HybridAutomaton(), this.getHybridAutomaton(), null, "hybridAutomaton", null, 1, 1, PropertyDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyDeclaration_Expression(), theTTMCConstraintPackage.getExpression(), null, "expression", null, 1, 1, PropertyDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //TTMCHybridPackageImpl
