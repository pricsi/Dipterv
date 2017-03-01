/**
 */
package TTMCSystem.impl;

import TTMCConstraint.TTMCConstraintPackage;

import TTMCSystem.AsynchronousCompositeSystem;
import TTMCSystem.AsynchronousMultiSystem;
import TTMCSystem.CompositeSystem;
import TTMCSystem.DefinitionDeclaration;
import TTMCSystem.GlobalVariableDeclaration;
import TTMCSystem.InitialConstraintDefinition;
import TTMCSystem.InputVariableDeclaration;
import TTMCSystem.InvariantConstraintDefinition;
import TTMCSystem.LocalVariableDeclaration;
import TTMCSystem.MultiSystem;
import TTMCSystem.OutputVariableDeclaration;
import TTMCSystem.PropertyDeclaration;
import TTMCSystem.SynchronousCompositeSystem;
import TTMCSystem.SynchronousMultiSystem;
import TTMCSystem.SystemConstraintDefinition;
import TTMCSystem.SystemDeclaration;
import TTMCSystem.SystemDefinition;
import TTMCSystem.SystemReference;
import TTMCSystem.SystemSpecification;
import TTMCSystem.TTMCSystemFactory;
import TTMCSystem.TTMCSystemPackage;
import TTMCSystem.TransitionConstraintDefinition;
import TTMCSystem.VariableDeclaration;

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
public class TTMCSystemPackageImpl extends EPackageImpl implements TTMCSystemPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionDeclarationEClass = null;

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
	private EClass systemSpecificationEClass = null;

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
	private EClass inputVariableDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputVariableDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass synchronousCompositeSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass asynchronousCompositeSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass synchronousMultiSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass asynchronousMultiSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemConstraintDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invariantConstraintDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialConstraintDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionConstraintDefinitionEClass = null;

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
	 * @see TTMCSystem.TTMCSystemPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TTMCSystemPackageImpl() {
		super(eNS_URI, TTMCSystemFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TTMCSystemPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TTMCSystemPackage init() {
		if (isInited) return (TTMCSystemPackage)EPackage.Registry.INSTANCE.getEPackage(TTMCSystemPackage.eNS_URI);

		// Obtain or create and register package
		TTMCSystemPackageImpl theTTMCSystemPackage = (TTMCSystemPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TTMCSystemPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TTMCSystemPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TTMCConstraintPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTTMCSystemPackage.createPackageContents();

		// Initialize created meta-data
		theTTMCSystemPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTTMCSystemPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TTMCSystemPackage.eNS_URI, theTTMCSystemPackage);
		return theTTMCSystemPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefinitionDeclaration() {
		return definitionDeclarationEClass;
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
	public EClass getSystemSpecification() {
		return systemSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemSpecification_SystemDeclarations() {
		return (EReference)systemSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemSpecification_PropertyDeclarations() {
		return (EReference)systemSpecificationEClass.getEStructuralFeatures().get(1);
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
	public EClass getInputVariableDeclaration() {
		return inputVariableDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputVariableDeclaration() {
		return outputVariableDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemDeclaration() {
		return systemDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemDeclaration_System() {
		return (EReference)systemDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystem() {
		return systemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemDefinition() {
		return systemDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemDefinition_VariableDeclarations() {
		return (EReference)systemDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemDefinition_DefinitionDeclarations() {
		return (EReference)systemDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemDefinition_SystemConstraintDefinitions() {
		return (EReference)systemDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemReference() {
		return systemReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemReference_Reference() {
		return (EReference)systemReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeSystem() {
		return compositeSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeSystem_LeftSystem() {
		return (EReference)compositeSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeSystem_RightSystem() {
		return (EReference)compositeSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSynchronousCompositeSystem() {
		return synchronousCompositeSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAsynchronousCompositeSystem() {
		return asynchronousCompositeSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiSystem() {
		return multiSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiSystem_System() {
		return (EReference)multiSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSynchronousMultiSystem() {
		return synchronousMultiSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAsynchronousMultiSystem() {
		return asynchronousMultiSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemConstraintDefinition() {
		return systemConstraintDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInvariantConstraintDefinition() {
		return invariantConstraintDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitialConstraintDefinition() {
		return initialConstraintDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransitionConstraintDefinition() {
		return transitionConstraintDefinitionEClass;
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
	public EReference getPropertyDeclaration_System() {
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
	public TTMCSystemFactory getTTMCSystemFactory() {
		return (TTMCSystemFactory)getEFactoryInstance();
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
		definitionDeclarationEClass = createEClass(DEFINITION_DECLARATION);

		variableDeclarationEClass = createEClass(VARIABLE_DECLARATION);

		systemSpecificationEClass = createEClass(SYSTEM_SPECIFICATION);
		createEReference(systemSpecificationEClass, SYSTEM_SPECIFICATION__SYSTEM_DECLARATIONS);
		createEReference(systemSpecificationEClass, SYSTEM_SPECIFICATION__PROPERTY_DECLARATIONS);

		localVariableDeclarationEClass = createEClass(LOCAL_VARIABLE_DECLARATION);

		globalVariableDeclarationEClass = createEClass(GLOBAL_VARIABLE_DECLARATION);

		inputVariableDeclarationEClass = createEClass(INPUT_VARIABLE_DECLARATION);

		outputVariableDeclarationEClass = createEClass(OUTPUT_VARIABLE_DECLARATION);

		systemDeclarationEClass = createEClass(SYSTEM_DECLARATION);
		createEReference(systemDeclarationEClass, SYSTEM_DECLARATION__SYSTEM);

		systemEClass = createEClass(SYSTEM);

		systemDefinitionEClass = createEClass(SYSTEM_DEFINITION);
		createEReference(systemDefinitionEClass, SYSTEM_DEFINITION__VARIABLE_DECLARATIONS);
		createEReference(systemDefinitionEClass, SYSTEM_DEFINITION__DEFINITION_DECLARATIONS);
		createEReference(systemDefinitionEClass, SYSTEM_DEFINITION__SYSTEM_CONSTRAINT_DEFINITIONS);

		systemReferenceEClass = createEClass(SYSTEM_REFERENCE);
		createEReference(systemReferenceEClass, SYSTEM_REFERENCE__REFERENCE);

		compositeSystemEClass = createEClass(COMPOSITE_SYSTEM);
		createEReference(compositeSystemEClass, COMPOSITE_SYSTEM__LEFT_SYSTEM);
		createEReference(compositeSystemEClass, COMPOSITE_SYSTEM__RIGHT_SYSTEM);

		synchronousCompositeSystemEClass = createEClass(SYNCHRONOUS_COMPOSITE_SYSTEM);

		asynchronousCompositeSystemEClass = createEClass(ASYNCHRONOUS_COMPOSITE_SYSTEM);

		multiSystemEClass = createEClass(MULTI_SYSTEM);
		createEReference(multiSystemEClass, MULTI_SYSTEM__SYSTEM);

		synchronousMultiSystemEClass = createEClass(SYNCHRONOUS_MULTI_SYSTEM);

		asynchronousMultiSystemEClass = createEClass(ASYNCHRONOUS_MULTI_SYSTEM);

		systemConstraintDefinitionEClass = createEClass(SYSTEM_CONSTRAINT_DEFINITION);

		invariantConstraintDefinitionEClass = createEClass(INVARIANT_CONSTRAINT_DEFINITION);

		initialConstraintDefinitionEClass = createEClass(INITIAL_CONSTRAINT_DEFINITION);

		transitionConstraintDefinitionEClass = createEClass(TRANSITION_CONSTRAINT_DEFINITION);

		propertyDeclarationEClass = createEClass(PROPERTY_DECLARATION);
		createEReference(propertyDeclarationEClass, PROPERTY_DECLARATION__SYSTEM);
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
		definitionDeclarationEClass.getESuperTypes().add(theTTMCConstraintPackage.getDefinableDeclaration());
		variableDeclarationEClass.getESuperTypes().add(theTTMCConstraintPackage.getDeclaration());
		systemSpecificationEClass.getESuperTypes().add(theTTMCConstraintPackage.getConstraintSpecification());
		localVariableDeclarationEClass.getESuperTypes().add(this.getVariableDeclaration());
		globalVariableDeclarationEClass.getESuperTypes().add(this.getVariableDeclaration());
		inputVariableDeclarationEClass.getESuperTypes().add(this.getVariableDeclaration());
		outputVariableDeclarationEClass.getESuperTypes().add(this.getVariableDeclaration());
		systemDeclarationEClass.getESuperTypes().add(theTTMCConstraintPackage.getNamedElement());
		systemDeclarationEClass.getESuperTypes().add(theTTMCConstraintPackage.getParametricElement());
		systemDefinitionEClass.getESuperTypes().add(this.getSystem());
		systemReferenceEClass.getESuperTypes().add(this.getSystem());
		systemReferenceEClass.getESuperTypes().add(theTTMCConstraintPackage.getParametrizedElement());
		compositeSystemEClass.getESuperTypes().add(this.getSystem());
		synchronousCompositeSystemEClass.getESuperTypes().add(this.getCompositeSystem());
		asynchronousCompositeSystemEClass.getESuperTypes().add(this.getCompositeSystem());
		multiSystemEClass.getESuperTypes().add(this.getSystem());
		multiSystemEClass.getESuperTypes().add(theTTMCConstraintPackage.getParametricElement());
		synchronousMultiSystemEClass.getESuperTypes().add(this.getMultiSystem());
		asynchronousMultiSystemEClass.getESuperTypes().add(this.getMultiSystem());
		systemConstraintDefinitionEClass.getESuperTypes().add(theTTMCConstraintPackage.getConstraintDefinition());
		invariantConstraintDefinitionEClass.getESuperTypes().add(this.getSystemConstraintDefinition());
		initialConstraintDefinitionEClass.getESuperTypes().add(this.getSystemConstraintDefinition());
		transitionConstraintDefinitionEClass.getESuperTypes().add(this.getSystemConstraintDefinition());
		propertyDeclarationEClass.getESuperTypes().add(theTTMCConstraintPackage.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(definitionDeclarationEClass, DefinitionDeclaration.class, "DefinitionDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(variableDeclarationEClass, VariableDeclaration.class, "VariableDeclaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(systemSpecificationEClass, SystemSpecification.class, "SystemSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemSpecification_SystemDeclarations(), this.getSystemDeclaration(), null, "systemDeclarations", null, 0, -1, SystemSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemSpecification_PropertyDeclarations(), this.getPropertyDeclaration(), null, "propertyDeclarations", null, 0, -1, SystemSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(localVariableDeclarationEClass, LocalVariableDeclaration.class, "LocalVariableDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(globalVariableDeclarationEClass, GlobalVariableDeclaration.class, "GlobalVariableDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inputVariableDeclarationEClass, InputVariableDeclaration.class, "InputVariableDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(outputVariableDeclarationEClass, OutputVariableDeclaration.class, "OutputVariableDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(systemDeclarationEClass, SystemDeclaration.class, "SystemDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemDeclaration_System(), this.getSystem(), null, "system", null, 1, 1, SystemDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemEClass, TTMCSystem.System.class, "System", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(systemDefinitionEClass, SystemDefinition.class, "SystemDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemDefinition_VariableDeclarations(), this.getVariableDeclaration(), null, "variableDeclarations", null, 0, -1, SystemDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemDefinition_DefinitionDeclarations(), this.getDefinitionDeclaration(), null, "definitionDeclarations", null, 0, -1, SystemDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemDefinition_SystemConstraintDefinitions(), this.getSystemConstraintDefinition(), null, "systemConstraintDefinitions", null, 0, -1, SystemDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemReferenceEClass, SystemReference.class, "SystemReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemReference_Reference(), this.getSystemDeclaration(), null, "reference", null, 1, 1, SystemReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeSystemEClass, CompositeSystem.class, "CompositeSystem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeSystem_LeftSystem(), this.getSystem(), null, "leftSystem", null, 1, 1, CompositeSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompositeSystem_RightSystem(), this.getSystem(), null, "rightSystem", null, 1, 1, CompositeSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(synchronousCompositeSystemEClass, SynchronousCompositeSystem.class, "SynchronousCompositeSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(asynchronousCompositeSystemEClass, AsynchronousCompositeSystem.class, "AsynchronousCompositeSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multiSystemEClass, MultiSystem.class, "MultiSystem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultiSystem_System(), this.getSystem(), null, "system", null, 1, 1, MultiSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(synchronousMultiSystemEClass, SynchronousMultiSystem.class, "SynchronousMultiSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(asynchronousMultiSystemEClass, AsynchronousMultiSystem.class, "AsynchronousMultiSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(systemConstraintDefinitionEClass, SystemConstraintDefinition.class, "SystemConstraintDefinition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(invariantConstraintDefinitionEClass, InvariantConstraintDefinition.class, "InvariantConstraintDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(initialConstraintDefinitionEClass, InitialConstraintDefinition.class, "InitialConstraintDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transitionConstraintDefinitionEClass, TransitionConstraintDefinition.class, "TransitionConstraintDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propertyDeclarationEClass, PropertyDeclaration.class, "PropertyDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyDeclaration_System(), this.getSystem(), null, "system", null, 1, 1, PropertyDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyDeclaration_Expression(), theTTMCConstraintPackage.getExpression(), null, "expression", null, 1, 1, PropertyDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //TTMCSystemPackageImpl
