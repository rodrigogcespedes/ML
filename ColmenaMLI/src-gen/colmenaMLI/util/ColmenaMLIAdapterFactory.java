/**
 */
package colmenaMLI.util;

import colmenaML.ClassDiagram;

import colmenaMLI.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see colmenaMLI.ColmenaMLIPackage
 * @generated
 */
public class ColmenaMLIAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ColmenaMLIPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColmenaMLIAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ColmenaMLIPackage.eINSTANCE;
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
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColmenaMLISwitch<Adapter> modelSwitch = new ColmenaMLISwitch<Adapter>() {
		@Override
		public Adapter caseInfrastructureDiagram(InfrastructureDiagram object) {
			return createInfrastructureDiagramAdapter();
		}

		@Override
		public Adapter caseMicroservice(Microservice object) {
			return createMicroserviceAdapter();
		}

		@Override
		public Adapter caseInfrastructureMs(InfrastructureMs object) {
			return createInfrastructureMsAdapter();
		}

		@Override
		public Adapter caseFunctionalMs(FunctionalMs object) {
			return createFunctionalMsAdapter();
		}

		@Override
		public Adapter caseRelation(Relation object) {
			return createRelationAdapter();
		}

		@Override
		public Adapter caseAuthentication(Authentication object) {
			return createAuthenticationAdapter();
		}

		@Override
		public Adapter caseAuthorization(Authorization object) {
			return createAuthorizationAdapter();
		}

		@Override
		public Adapter caseGateway(Gateway object) {
			return createGatewayAdapter();
		}

		@Override
		public Adapter caseConfigServer(ConfigServer object) {
			return createConfigServerAdapter();
		}

		@Override
		public Adapter caseDiscovery(Discovery object) {
			return createDiscoveryAdapter();
		}

		@Override
		public Adapter caseLogServer(LogServer object) {
			return createLogServerAdapter();
		}

		@Override
		public Adapter caseConfiguration(Configuration object) {
			return createConfigurationAdapter();
		}

		@Override
		public Adapter caseInfrastructureConfig(InfrastructureConfig object) {
			return createInfrastructureConfigAdapter();
		}

		@Override
		public Adapter caseDockerConfig(DockerConfig object) {
			return createDockerConfigAdapter();
		}

		@Override
		public Adapter caseDiagrama(Diagrama object) {
			return createDiagramaAdapter();
		}

		@Override
		public Adapter caseDatabase(Database object) {
			return createDatabaseAdapter();
		}

		@Override
		public Adapter caseEnvironment(Environment object) {
			return createEnvironmentAdapter();
		}

		@Override
		public Adapter caseModelRelation(ModelRelation object) {
			return createModelRelationAdapter();
		}

		@Override
		public Adapter caseInfrastructureRelation(InfrastructureRelation object) {
			return createInfrastructureRelationAdapter();
		}

		@Override
		public Adapter caseClassDiagram(ClassDiagram object) {
			return createClassDiagramAdapter();
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
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link colmenaMLI.InfrastructureDiagram <em>Infrastructure Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see colmenaMLI.InfrastructureDiagram
	 * @generated
	 */
	public Adapter createInfrastructureDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link colmenaMLI.Microservice <em>Microservice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see colmenaMLI.Microservice
	 * @generated
	 */
	public Adapter createMicroserviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link colmenaMLI.InfrastructureMs <em>Infrastructure Ms</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see colmenaMLI.InfrastructureMs
	 * @generated
	 */
	public Adapter createInfrastructureMsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link colmenaMLI.FunctionalMs <em>Functional Ms</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see colmenaMLI.FunctionalMs
	 * @generated
	 */
	public Adapter createFunctionalMsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link colmenaMLI.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see colmenaMLI.Relation
	 * @generated
	 */
	public Adapter createRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link colmenaMLI.Authentication <em>Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see colmenaMLI.Authentication
	 * @generated
	 */
	public Adapter createAuthenticationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link colmenaMLI.Authorization <em>Authorization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see colmenaMLI.Authorization
	 * @generated
	 */
	public Adapter createAuthorizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link colmenaMLI.Gateway <em>Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see colmenaMLI.Gateway
	 * @generated
	 */
	public Adapter createGatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link colmenaMLI.ConfigServer <em>Config Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see colmenaMLI.ConfigServer
	 * @generated
	 */
	public Adapter createConfigServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link colmenaMLI.Discovery <em>Discovery</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see colmenaMLI.Discovery
	 * @generated
	 */
	public Adapter createDiscoveryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link colmenaMLI.LogServer <em>Log Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see colmenaMLI.LogServer
	 * @generated
	 */
	public Adapter createLogServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link colmenaMLI.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see colmenaMLI.Configuration
	 * @generated
	 */
	public Adapter createConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link colmenaMLI.InfrastructureConfig <em>Infrastructure Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see colmenaMLI.InfrastructureConfig
	 * @generated
	 */
	public Adapter createInfrastructureConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link colmenaMLI.DockerConfig <em>Docker Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see colmenaMLI.DockerConfig
	 * @generated
	 */
	public Adapter createDockerConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link colmenaMLI.Diagrama <em>Diagrama</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see colmenaMLI.Diagrama
	 * @generated
	 */
	public Adapter createDiagramaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link colmenaMLI.Database <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see colmenaMLI.Database
	 * @generated
	 */
	public Adapter createDatabaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link colmenaMLI.Environment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see colmenaMLI.Environment
	 * @generated
	 */
	public Adapter createEnvironmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link colmenaMLI.ModelRelation <em>Model Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see colmenaMLI.ModelRelation
	 * @generated
	 */
	public Adapter createModelRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link colmenaMLI.InfrastructureRelation <em>Infrastructure Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see colmenaMLI.InfrastructureRelation
	 * @generated
	 */
	public Adapter createInfrastructureRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link colmenaML.ClassDiagram <em>Class Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see colmenaML.ClassDiagram
	 * @generated
	 */
	public Adapter createClassDiagramAdapter() {
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

} //ColmenaMLIAdapterFactory
