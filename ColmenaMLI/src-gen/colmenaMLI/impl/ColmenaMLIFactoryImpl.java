/**
 */
package colmenaMLI.impl;

import colmenaMLI.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class ColmenaMLIFactoryImpl extends EFactoryImpl implements ColmenaMLIFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ColmenaMLIFactory init() {
		try {
			ColmenaMLIFactory theColmenaMLIFactory = (ColmenaMLIFactory) EPackage.Registry.INSTANCE
					.getEFactory(ColmenaMLIPackage.eNS_URI);
			if (theColmenaMLIFactory != null) {
				return theColmenaMLIFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ColmenaMLIFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColmenaMLIFactoryImpl() {
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
		case ColmenaMLIPackage.INFRASTRUCTURE_DIAGRAM:
			return createInfrastructureDiagram();
		case ColmenaMLIPackage.FUNCTIONAL_MS:
			return createFunctionalMs();
		case ColmenaMLIPackage.AUTHENTICATION:
			return createAuthentication();
		case ColmenaMLIPackage.AUTHORIZATION:
			return createAuthorization();
		case ColmenaMLIPackage.GATEWAY:
			return createGateway();
		case ColmenaMLIPackage.CONFIG_SERVER:
			return createConfigServer();
		case ColmenaMLIPackage.DISCOVERY:
			return createDiscovery();
		case ColmenaMLIPackage.LOG_SERVER:
			return createLogServer();
		case ColmenaMLIPackage.INFRASTRUCTURE_CONFIG:
			return createInfrastructureConfig();
		case ColmenaMLIPackage.DOCKER_CONFIG:
			return createDockerConfig();
		case ColmenaMLIPackage.DIAGRAMA:
			return createDiagrama();
		case ColmenaMLIPackage.DATABASE:
			return createDatabase();
		case ColmenaMLIPackage.ENVIRONMENT:
			return createEnvironment();
		case ColmenaMLIPackage.MODEL_RELATION:
			return createModelRelation();
		case ColmenaMLIPackage.INFRASTRUCTURE_RELATION:
			return createInfrastructureRelation();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case ColmenaMLIPackage.DOCKER_IMAGE:
			return createDockerImageFromString(eDataType, initialValue);
		case ColmenaMLIPackage.LANGUAGE:
			return createLanguageFromString(eDataType, initialValue);
		case ColmenaMLIPackage.RELATION_TYPE:
			return createRelationTypeFromString(eDataType, initialValue);
		case ColmenaMLIPackage.RESTART_TYPE:
			return createRestartTypeFromString(eDataType, initialValue);
		case ColmenaMLIPackage.DATABASE_DIALECT:
			return createDatabaseDialectFromString(eDataType, initialValue);
		case ColmenaMLIPackage.DISCOVERY_SERVICE:
			return createDiscoveryServiceFromString(eDataType, initialValue);
		case ColmenaMLIPackage.GATEWAY_SERVICE:
			return createGatewayServiceFromString(eDataType, initialValue);
		case ColmenaMLIPackage.PROPERTIES_SYNTAX:
			return createPropertiesSyntaxFromString(eDataType, initialValue);
		case ColmenaMLIPackage.DEPENDENCIES_MANAGER:
			return createDependenciesManagerFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case ColmenaMLIPackage.DOCKER_IMAGE:
			return convertDockerImageToString(eDataType, instanceValue);
		case ColmenaMLIPackage.LANGUAGE:
			return convertLanguageToString(eDataType, instanceValue);
		case ColmenaMLIPackage.RELATION_TYPE:
			return convertRelationTypeToString(eDataType, instanceValue);
		case ColmenaMLIPackage.RESTART_TYPE:
			return convertRestartTypeToString(eDataType, instanceValue);
		case ColmenaMLIPackage.DATABASE_DIALECT:
			return convertDatabaseDialectToString(eDataType, instanceValue);
		case ColmenaMLIPackage.DISCOVERY_SERVICE:
			return convertDiscoveryServiceToString(eDataType, instanceValue);
		case ColmenaMLIPackage.GATEWAY_SERVICE:
			return convertGatewayServiceToString(eDataType, instanceValue);
		case ColmenaMLIPackage.PROPERTIES_SYNTAX:
			return convertPropertiesSyntaxToString(eDataType, instanceValue);
		case ColmenaMLIPackage.DEPENDENCIES_MANAGER:
			return convertDependenciesManagerToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructureDiagram createInfrastructureDiagram() {
		InfrastructureDiagramImpl infrastructureDiagram = new InfrastructureDiagramImpl();
		return infrastructureDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalMs createFunctionalMs() {
		FunctionalMsImpl functionalMs = new FunctionalMsImpl();
		return functionalMs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Authentication createAuthentication() {
		AuthenticationImpl authentication = new AuthenticationImpl();
		return authentication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Authorization createAuthorization() {
		AuthorizationImpl authorization = new AuthorizationImpl();
		return authorization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gateway createGateway() {
		GatewayImpl gateway = new GatewayImpl();
		return gateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigServer createConfigServer() {
		ConfigServerImpl configServer = new ConfigServerImpl();
		return configServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Discovery createDiscovery() {
		DiscoveryImpl discovery = new DiscoveryImpl();
		return discovery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogServer createLogServer() {
		LogServerImpl logServer = new LogServerImpl();
		return logServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructureConfig createInfrastructureConfig() {
		InfrastructureConfigImpl infrastructureConfig = new InfrastructureConfigImpl();
		return infrastructureConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerConfig createDockerConfig() {
		DockerConfigImpl dockerConfig = new DockerConfigImpl();
		return dockerConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diagrama createDiagrama() {
		DiagramaImpl diagrama = new DiagramaImpl();
		return diagrama;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Database createDatabase() {
		DatabaseImpl database = new DatabaseImpl();
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Environment createEnvironment() {
		EnvironmentImpl environment = new EnvironmentImpl();
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelRelation createModelRelation() {
		ModelRelationImpl modelRelation = new ModelRelationImpl();
		return modelRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructureRelation createInfrastructureRelation() {
		InfrastructureRelationImpl infrastructureRelation = new InfrastructureRelationImpl();
		return infrastructureRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerImage createDockerImageFromString(EDataType eDataType, String initialValue) {
		DockerImage result = DockerImage.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDockerImageToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Language createLanguageFromString(EDataType eDataType, String initialValue) {
		Language result = Language.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLanguageToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationType createRelationTypeFromString(EDataType eDataType, String initialValue) {
		RelationType result = RelationType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestartType createRestartTypeFromString(EDataType eDataType, String initialValue) {
		RestartType result = RestartType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRestartTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseDialect createDatabaseDialectFromString(EDataType eDataType, String initialValue) {
		DatabaseDialect result = DatabaseDialect.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDatabaseDialectToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscoveryService createDiscoveryServiceFromString(EDataType eDataType, String initialValue) {
		DiscoveryService result = DiscoveryService.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDiscoveryServiceToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GatewayService createGatewayServiceFromString(EDataType eDataType, String initialValue) {
		GatewayService result = GatewayService.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGatewayServiceToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesSyntax createPropertiesSyntaxFromString(EDataType eDataType, String initialValue) {
		PropertiesSyntax result = PropertiesSyntax.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertiesSyntaxToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependenciesManager createDependenciesManagerFromString(EDataType eDataType, String initialValue) {
		DependenciesManager result = DependenciesManager.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDependenciesManagerToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColmenaMLIPackage getColmenaMLIPackage() {
		return (ColmenaMLIPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ColmenaMLIPackage getPackage() {
		return ColmenaMLIPackage.eINSTANCE;
	}

} //ColmenaMLIFactoryImpl
