/**
 */
package TTMCSystem.impl;

import TTMCSystem.AsynchronousCompositeSystem;
import TTMCSystem.AsynchronousMultiSystem;
import TTMCSystem.DefinitionDeclaration;
import TTMCSystem.GlobalVariableDeclaration;
import TTMCSystem.InitialConstraintDefinition;
import TTMCSystem.InputVariableDeclaration;
import TTMCSystem.InvariantConstraintDefinition;
import TTMCSystem.LocalVariableDeclaration;
import TTMCSystem.OutputVariableDeclaration;
import TTMCSystem.PropertyDeclaration;
import TTMCSystem.SynchronousCompositeSystem;
import TTMCSystem.SynchronousMultiSystem;
import TTMCSystem.SystemDeclaration;
import TTMCSystem.SystemDefinition;
import TTMCSystem.SystemReference;
import TTMCSystem.SystemSpecification;
import TTMCSystem.TTMCSystemFactory;
import TTMCSystem.TTMCSystemPackage;
import TTMCSystem.TransitionConstraintDefinition;

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
public class TTMCSystemFactoryImpl extends EFactoryImpl implements TTMCSystemFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TTMCSystemFactory init() {
		try {
			TTMCSystemFactory theTTMCSystemFactory = (TTMCSystemFactory)EPackage.Registry.INSTANCE.getEFactory(TTMCSystemPackage.eNS_URI);
			if (theTTMCSystemFactory != null) {
				return theTTMCSystemFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TTMCSystemFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTMCSystemFactoryImpl() {
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
			case TTMCSystemPackage.DEFINITION_DECLARATION: return createDefinitionDeclaration();
			case TTMCSystemPackage.SYSTEM_SPECIFICATION: return createSystemSpecification();
			case TTMCSystemPackage.LOCAL_VARIABLE_DECLARATION: return createLocalVariableDeclaration();
			case TTMCSystemPackage.GLOBAL_VARIABLE_DECLARATION: return createGlobalVariableDeclaration();
			case TTMCSystemPackage.INPUT_VARIABLE_DECLARATION: return createInputVariableDeclaration();
			case TTMCSystemPackage.OUTPUT_VARIABLE_DECLARATION: return createOutputVariableDeclaration();
			case TTMCSystemPackage.SYSTEM_DECLARATION: return createSystemDeclaration();
			case TTMCSystemPackage.SYSTEM_DEFINITION: return createSystemDefinition();
			case TTMCSystemPackage.SYSTEM_REFERENCE: return createSystemReference();
			case TTMCSystemPackage.SYNCHRONOUS_COMPOSITE_SYSTEM: return createSynchronousCompositeSystem();
			case TTMCSystemPackage.ASYNCHRONOUS_COMPOSITE_SYSTEM: return createAsynchronousCompositeSystem();
			case TTMCSystemPackage.SYNCHRONOUS_MULTI_SYSTEM: return createSynchronousMultiSystem();
			case TTMCSystemPackage.ASYNCHRONOUS_MULTI_SYSTEM: return createAsynchronousMultiSystem();
			case TTMCSystemPackage.INVARIANT_CONSTRAINT_DEFINITION: return createInvariantConstraintDefinition();
			case TTMCSystemPackage.INITIAL_CONSTRAINT_DEFINITION: return createInitialConstraintDefinition();
			case TTMCSystemPackage.TRANSITION_CONSTRAINT_DEFINITION: return createTransitionConstraintDefinition();
			case TTMCSystemPackage.PROPERTY_DECLARATION: return createPropertyDeclaration();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefinitionDeclaration createDefinitionDeclaration() {
		DefinitionDeclarationImpl definitionDeclaration = new DefinitionDeclarationImpl();
		return definitionDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemSpecification createSystemSpecification() {
		SystemSpecificationImpl systemSpecification = new SystemSpecificationImpl();
		return systemSpecification;
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
	public InputVariableDeclaration createInputVariableDeclaration() {
		InputVariableDeclarationImpl inputVariableDeclaration = new InputVariableDeclarationImpl();
		return inputVariableDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputVariableDeclaration createOutputVariableDeclaration() {
		OutputVariableDeclarationImpl outputVariableDeclaration = new OutputVariableDeclarationImpl();
		return outputVariableDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemDeclaration createSystemDeclaration() {
		SystemDeclarationImpl systemDeclaration = new SystemDeclarationImpl();
		return systemDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemDefinition createSystemDefinition() {
		SystemDefinitionImpl systemDefinition = new SystemDefinitionImpl();
		return systemDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemReference createSystemReference() {
		SystemReferenceImpl systemReference = new SystemReferenceImpl();
		return systemReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronousCompositeSystem createSynchronousCompositeSystem() {
		SynchronousCompositeSystemImpl synchronousCompositeSystem = new SynchronousCompositeSystemImpl();
		return synchronousCompositeSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsynchronousCompositeSystem createAsynchronousCompositeSystem() {
		AsynchronousCompositeSystemImpl asynchronousCompositeSystem = new AsynchronousCompositeSystemImpl();
		return asynchronousCompositeSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronousMultiSystem createSynchronousMultiSystem() {
		SynchronousMultiSystemImpl synchronousMultiSystem = new SynchronousMultiSystemImpl();
		return synchronousMultiSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsynchronousMultiSystem createAsynchronousMultiSystem() {
		AsynchronousMultiSystemImpl asynchronousMultiSystem = new AsynchronousMultiSystemImpl();
		return asynchronousMultiSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvariantConstraintDefinition createInvariantConstraintDefinition() {
		InvariantConstraintDefinitionImpl invariantConstraintDefinition = new InvariantConstraintDefinitionImpl();
		return invariantConstraintDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialConstraintDefinition createInitialConstraintDefinition() {
		InitialConstraintDefinitionImpl initialConstraintDefinition = new InitialConstraintDefinitionImpl();
		return initialConstraintDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionConstraintDefinition createTransitionConstraintDefinition() {
		TransitionConstraintDefinitionImpl transitionConstraintDefinition = new TransitionConstraintDefinitionImpl();
		return transitionConstraintDefinition;
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
	public TTMCSystemPackage getTTMCSystemPackage() {
		return (TTMCSystemPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TTMCSystemPackage getPackage() {
		return TTMCSystemPackage.eINSTANCE;
	}

} //TTMCSystemFactoryImpl
