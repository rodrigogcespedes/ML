/**
 */
package colmenaMLI.impl;

import colmenaML.ColmenaMLPackage;

import colmenaML.impl.ColmenaMLPackageImpl;

import colmenaMLI.Authentication;
import colmenaMLI.Authorization;
import colmenaMLI.ColmenaMLIFactory;
import colmenaMLI.ColmenaMLIPackage;
import colmenaMLI.ConfigServer;
import colmenaMLI.Configuration;
import colmenaMLI.Database;
import colmenaMLI.DatabaseDialect;
import colmenaMLI.DependenciesManager;
import colmenaMLI.Diagrama;
import colmenaMLI.Discovery;
import colmenaMLI.DiscoveryService;
import colmenaMLI.DockerConfig;
import colmenaMLI.DockerImage;
import colmenaMLI.Environment;
import colmenaMLI.FunctionalMs;
import colmenaMLI.Gateway;
import colmenaMLI.GatewayService;
import colmenaMLI.InfrastructureConfig;
import colmenaMLI.InfrastructureDiagram;
import colmenaMLI.InfrastructureMs;
import colmenaMLI.InfrastructureRelation;
import colmenaMLI.Language;
import colmenaMLI.LogServer;
import colmenaMLI.Microservice;
import colmenaMLI.ModelRelation;
import colmenaMLI.PropertiesSyntax;
import colmenaMLI.Relation;
import colmenaMLI.RelationType;
import colmenaMLI.RestartType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ColmenaMLIPackageImpl extends EPackageImpl implements ColmenaMLIPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infrastructureDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass microserviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infrastructureMsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalMsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authenticationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authorizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discoveryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infrastructureConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dockerConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagramaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass environmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infrastructureRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dockerImageEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum languageEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum relationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum restartTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum databaseDialectEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum discoveryServiceEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gatewayServiceEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum propertiesSyntaxEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dependenciesManagerEEnum = null;

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
	 * @see colmenaMLI.ColmenaMLIPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ColmenaMLIPackageImpl() {
		super(eNS_URI, ColmenaMLIFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ColmenaMLIPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ColmenaMLIPackage init() {
		if (isInited)
			return (ColmenaMLIPackage) EPackage.Registry.INSTANCE.getEPackage(ColmenaMLIPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredColmenaMLIPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ColmenaMLIPackageImpl theColmenaMLIPackage = registeredColmenaMLIPackage instanceof ColmenaMLIPackageImpl
				? (ColmenaMLIPackageImpl) registeredColmenaMLIPackage
				: new ColmenaMLIPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ColmenaMLPackage.eNS_URI);
		ColmenaMLPackageImpl theColmenaMLPackage = (ColmenaMLPackageImpl) (registeredPackage instanceof ColmenaMLPackageImpl
				? registeredPackage
				: ColmenaMLPackage.eINSTANCE);

		// Create package meta-data objects
		theColmenaMLIPackage.createPackageContents();
		theColmenaMLPackage.createPackageContents();

		// Initialize created meta-data
		theColmenaMLIPackage.initializePackageContents();
		theColmenaMLPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theColmenaMLIPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ColmenaMLIPackage.eNS_URI, theColmenaMLIPackage);
		return theColmenaMLIPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfrastructureDiagram() {
		return infrastructureDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfrastructureDiagram_Contained_configurations() {
		return (EReference) infrastructureDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfrastructureDiagram_Contained_environments() {
		return (EReference) infrastructureDiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMicroservice() {
		return microserviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMicroservice_Name() {
		return (EAttribute) microserviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMicroservice_LangType() {
		return (EAttribute) microserviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMicroservice_Contained_relations() {
		return (EReference) microserviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMicroservice_ArtifactId() {
		return (EAttribute) microserviceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMicroservice_Version() {
		return (EAttribute) microserviceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMicroservice_GroupId() {
		return (EAttribute) microserviceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMicroservice_Description() {
		return (EAttribute) microserviceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMicroservice_Database() {
		return (EReference) microserviceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMicroservice_Port() {
		return (EAttribute) microserviceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMicroservice_Ip() {
		return (EAttribute) microserviceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfrastructureMs() {
		return infrastructureMsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionalMs() {
		return functionalMsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionalMs_PorpertiesSyntax() {
		return (EAttribute) functionalMsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionalMs_DependenciesManager() {
		return (EAttribute) functionalMsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelation() {
		return relationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelation_Destination() {
		return (EReference) relationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelation_Origin() {
		return (EReference) relationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelation_RelationType() {
		return (EAttribute) relationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthentication() {
		return authenticationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthorization() {
		return authorizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGateway() {
		return gatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGateway_GatewayService() {
		return (EAttribute) gatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigServer() {
		return configServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigServer_Username() {
		return (EAttribute) configServerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigServer_Password() {
		return (EAttribute) configServerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiscovery() {
		return discoveryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscovery_DiscoveryService() {
		return (EAttribute) discoveryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogServer() {
		return logServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfiguration() {
		return configurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfiguration_Network() {
		return (EAttribute) configurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfiguration_Environment() {
		return (EAttribute) configurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfiguration_RestartType() {
		return (EAttribute) configurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_Microservice() {
		return (EReference) configurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfrastructureConfig() {
		return infrastructureConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfrastructureConfig_InfrastructureMs() {
		return (EReference) infrastructureConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDockerConfig() {
		return dockerConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerConfig_InnerPort() {
		return (EAttribute) dockerConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerConfig_ExposePort() {
		return (EAttribute) dockerConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerConfig_DockerBaseImage() {
		return (EAttribute) dockerConfigEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagrama() {
		return diagramaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabase() {
		return databaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabase_Username() {
		return (EAttribute) databaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabase_Password() {
		return (EAttribute) databaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabase_Url() {
		return (EAttribute) databaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabase_Dialect() {
		return (EAttribute) databaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabase_Port() {
		return (EAttribute) databaseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabase_Name() {
		return (EAttribute) databaseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnvironment() {
		return environmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvironment_Contained_microservices() {
		return (EReference) environmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnvironment_Name() {
		return (EAttribute) environmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelRelation() {
		return modelRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelRelation_ClassesRelation() {
		return (EReference) modelRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfrastructureRelation() {
		return infrastructureRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDockerImage() {
		return dockerImageEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLanguage() {
		return languageEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRelationType() {
		return relationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRestartType() {
		return restartTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDatabaseDialect() {
		return databaseDialectEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDiscoveryService() {
		return discoveryServiceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGatewayService() {
		return gatewayServiceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPropertiesSyntax() {
		return propertiesSyntaxEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDependenciesManager() {
		return dependenciesManagerEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColmenaMLIFactory getColmenaMLIFactory() {
		return (ColmenaMLIFactory) getEFactoryInstance();
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
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		infrastructureDiagramEClass = createEClass(INFRASTRUCTURE_DIAGRAM);
		createEReference(infrastructureDiagramEClass, INFRASTRUCTURE_DIAGRAM__CONTAINED_CONFIGURATIONS);
		createEReference(infrastructureDiagramEClass, INFRASTRUCTURE_DIAGRAM__CONTAINED_ENVIRONMENTS);

		microserviceEClass = createEClass(MICROSERVICE);
		createEAttribute(microserviceEClass, MICROSERVICE__NAME);
		createEAttribute(microserviceEClass, MICROSERVICE__LANG_TYPE);
		createEReference(microserviceEClass, MICROSERVICE__CONTAINED_RELATIONS);
		createEAttribute(microserviceEClass, MICROSERVICE__ARTIFACT_ID);
		createEAttribute(microserviceEClass, MICROSERVICE__VERSION);
		createEAttribute(microserviceEClass, MICROSERVICE__GROUP_ID);
		createEAttribute(microserviceEClass, MICROSERVICE__DESCRIPTION);
		createEReference(microserviceEClass, MICROSERVICE__DATABASE);
		createEAttribute(microserviceEClass, MICROSERVICE__PORT);
		createEAttribute(microserviceEClass, MICROSERVICE__IP);

		infrastructureMsEClass = createEClass(INFRASTRUCTURE_MS);

		functionalMsEClass = createEClass(FUNCTIONAL_MS);
		createEAttribute(functionalMsEClass, FUNCTIONAL_MS__PORPERTIES_SYNTAX);
		createEAttribute(functionalMsEClass, FUNCTIONAL_MS__DEPENDENCIES_MANAGER);

		relationEClass = createEClass(RELATION);
		createEReference(relationEClass, RELATION__DESTINATION);
		createEReference(relationEClass, RELATION__ORIGIN);
		createEAttribute(relationEClass, RELATION__RELATION_TYPE);

		authenticationEClass = createEClass(AUTHENTICATION);

		authorizationEClass = createEClass(AUTHORIZATION);

		gatewayEClass = createEClass(GATEWAY);
		createEAttribute(gatewayEClass, GATEWAY__GATEWAY_SERVICE);

		configServerEClass = createEClass(CONFIG_SERVER);
		createEAttribute(configServerEClass, CONFIG_SERVER__USERNAME);
		createEAttribute(configServerEClass, CONFIG_SERVER__PASSWORD);

		discoveryEClass = createEClass(DISCOVERY);
		createEAttribute(discoveryEClass, DISCOVERY__DISCOVERY_SERVICE);

		logServerEClass = createEClass(LOG_SERVER);

		configurationEClass = createEClass(CONFIGURATION);
		createEAttribute(configurationEClass, CONFIGURATION__NETWORK);
		createEAttribute(configurationEClass, CONFIGURATION__ENVIRONMENT);
		createEAttribute(configurationEClass, CONFIGURATION__RESTART_TYPE);
		createEReference(configurationEClass, CONFIGURATION__MICROSERVICE);

		infrastructureConfigEClass = createEClass(INFRASTRUCTURE_CONFIG);
		createEReference(infrastructureConfigEClass, INFRASTRUCTURE_CONFIG__INFRASTRUCTURE_MS);

		dockerConfigEClass = createEClass(DOCKER_CONFIG);
		createEAttribute(dockerConfigEClass, DOCKER_CONFIG__INNER_PORT);
		createEAttribute(dockerConfigEClass, DOCKER_CONFIG__EXPOSE_PORT);
		createEAttribute(dockerConfigEClass, DOCKER_CONFIG__DOCKER_BASE_IMAGE);

		diagramaEClass = createEClass(DIAGRAMA);

		databaseEClass = createEClass(DATABASE);
		createEAttribute(databaseEClass, DATABASE__USERNAME);
		createEAttribute(databaseEClass, DATABASE__PASSWORD);
		createEAttribute(databaseEClass, DATABASE__URL);
		createEAttribute(databaseEClass, DATABASE__DIALECT);
		createEAttribute(databaseEClass, DATABASE__PORT);
		createEAttribute(databaseEClass, DATABASE__NAME);

		environmentEClass = createEClass(ENVIRONMENT);
		createEReference(environmentEClass, ENVIRONMENT__CONTAINED_MICROSERVICES);
		createEAttribute(environmentEClass, ENVIRONMENT__NAME);

		modelRelationEClass = createEClass(MODEL_RELATION);
		createEReference(modelRelationEClass, MODEL_RELATION__CLASSES_RELATION);

		infrastructureRelationEClass = createEClass(INFRASTRUCTURE_RELATION);

		// Create enums
		dockerImageEEnum = createEEnum(DOCKER_IMAGE);
		languageEEnum = createEEnum(LANGUAGE);
		relationTypeEEnum = createEEnum(RELATION_TYPE);
		restartTypeEEnum = createEEnum(RESTART_TYPE);
		databaseDialectEEnum = createEEnum(DATABASE_DIALECT);
		discoveryServiceEEnum = createEEnum(DISCOVERY_SERVICE);
		gatewayServiceEEnum = createEEnum(GATEWAY_SERVICE);
		propertiesSyntaxEEnum = createEEnum(PROPERTIES_SYNTAX);
		dependenciesManagerEEnum = createEEnum(DEPENDENCIES_MANAGER);
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
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ColmenaMLPackage theColmenaMLPackage = (ColmenaMLPackage) EPackage.Registry.INSTANCE
				.getEPackage(ColmenaMLPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		infrastructureMsEClass.getESuperTypes().add(this.getMicroservice());
		functionalMsEClass.getESuperTypes().add(this.getMicroservice());
		functionalMsEClass.getESuperTypes().add(this.getDiagrama());
		authenticationEClass.getESuperTypes().add(this.getInfrastructureMs());
		authorizationEClass.getESuperTypes().add(this.getInfrastructureMs());
		gatewayEClass.getESuperTypes().add(this.getInfrastructureMs());
		configServerEClass.getESuperTypes().add(this.getInfrastructureMs());
		discoveryEClass.getESuperTypes().add(this.getInfrastructureMs());
		logServerEClass.getESuperTypes().add(this.getInfrastructureMs());
		infrastructureConfigEClass.getESuperTypes().add(this.getConfiguration());
		dockerConfigEClass.getESuperTypes().add(this.getConfiguration());
		diagramaEClass.getESuperTypes().add(theColmenaMLPackage.getClassDiagram());
		modelRelationEClass.getESuperTypes().add(this.getRelation());
		infrastructureRelationEClass.getESuperTypes().add(this.getRelation());

		// Initialize classes, features, and operations; add parameters
		initEClass(infrastructureDiagramEClass, InfrastructureDiagram.class, "InfrastructureDiagram", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInfrastructureDiagram_Contained_configurations(), this.getConfiguration(), null,
				"contained_configurations", null, 0, -1, InfrastructureDiagram.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfrastructureDiagram_Contained_environments(), this.getEnvironment(), null,
				"contained_environments", null, 0, -1, InfrastructureDiagram.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(microserviceEClass, Microservice.class, "Microservice", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMicroservice_Name(), ecorePackage.getEString(), "name", null, 0, 1, Microservice.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMicroservice_LangType(), this.getLanguage(), "langType", null, 0, 1, Microservice.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMicroservice_Contained_relations(), this.getRelation(), null, "contained_relations", null, 0,
				-1, Microservice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMicroservice_ArtifactId(), ecorePackage.getEString(), "artifactId", null, 0, 1,
				Microservice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMicroservice_Version(), ecorePackage.getEString(), "version", null, 0, 1, Microservice.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMicroservice_GroupId(), ecorePackage.getEString(), "groupId", null, 0, 1, Microservice.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMicroservice_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				Microservice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getMicroservice_Database(), this.getDatabase(), null, "database", null, 0, 1, Microservice.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMicroservice_Port(), ecorePackage.getEIntegerObject(), "port", "8080", 0, 1,
				Microservice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMicroservice_Ip(), ecorePackage.getEString(), "ip", "localhost", 0, 1, Microservice.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(infrastructureMsEClass, InfrastructureMs.class, "InfrastructureMs", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(functionalMsEClass, FunctionalMs.class, "FunctionalMs", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunctionalMs_PorpertiesSyntax(), this.getPropertiesSyntax(), "porpertiesSyntax", null, 0, 1,
				FunctionalMs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionalMs_DependenciesManager(), this.getDependenciesManager(), "dependenciesManager",
				null, 0, 1, FunctionalMs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationEClass, Relation.class, "Relation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelation_Destination(), this.getMicroservice(), null, "destination", null, 0, 1,
				Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelation_Origin(), this.getMicroservice(), null, "origin", null, 0, 1, Relation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelation_RelationType(), this.getRelationType(), "relationType", null, 0, 1, Relation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(authenticationEClass, Authentication.class, "Authentication", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(authorizationEClass, Authorization.class, "Authorization", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(gatewayEClass, Gateway.class, "Gateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGateway_GatewayService(), this.getGatewayService(), "gatewayService", null, 0, 1,
				Gateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(configServerEClass, ConfigServer.class, "ConfigServer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfigServer_Username(), ecorePackage.getEString(), "username", "root", 0, 1,
				ConfigServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfigServer_Password(), ecorePackage.getEString(), "password", "root", 0, 1,
				ConfigServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(discoveryEClass, Discovery.class, "Discovery", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiscovery_DiscoveryService(), this.getDiscoveryService(), "discoveryService", null, 0, 1,
				Discovery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(logServerEClass, LogServer.class, "LogServer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(configurationEClass, Configuration.class, "Configuration", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfiguration_Network(), ecorePackage.getEString(), "network", null, 0, 1,
				Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfiguration_Environment(), ecorePackage.getEString(), "environment", null, 0, 1,
				Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfiguration_RestartType(), this.getRestartType(), "restartType", null, 0, 1,
				Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_Microservice(), this.getMicroservice(), null, "microservice", null, 0, -1,
				Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(infrastructureConfigEClass, InfrastructureConfig.class, "InfrastructureConfig", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInfrastructureConfig_InfrastructureMs(), this.getInfrastructureMs(), null, "infrastructureMs",
				null, 0, -1, InfrastructureConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dockerConfigEClass, DockerConfig.class, "DockerConfig", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDockerConfig_InnerPort(), ecorePackage.getEIntegerObject(), "innerPort", null, 0, 1,
				DockerConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerConfig_ExposePort(), ecorePackage.getEIntegerObject(), "exposePort", null, 0, 1,
				DockerConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerConfig_DockerBaseImage(), this.getDockerImage(), "dockerBaseImage", null, 0, 1,
				DockerConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(diagramaEClass, Diagrama.class, "Diagrama", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(databaseEClass, Database.class, "Database", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatabase_Username(), ecorePackage.getEString(), "username", null, 0, 1, Database.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabase_Password(), ecorePackage.getEString(), "password", null, 0, 1, Database.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabase_Url(), ecorePackage.getEString(), "url", null, 0, 1, Database.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabase_Dialect(), this.getDatabaseDialect(), "dialect", null, 0, 1, Database.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabase_Port(), ecorePackage.getEIntegerObject(), "port", null, 0, 1, Database.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabase_Name(), ecorePackage.getEString(), "name", null, 0, 1, Database.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(environmentEClass, Environment.class, "Environment", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnvironment_Contained_microservices(), this.getMicroservice(), null,
				"contained_microservices", null, 0, -1, Environment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnvironment_Name(), ecorePackage.getEString(), "name", null, 0, 1, Environment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelRelationEClass, ModelRelation.class, "ModelRelation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelRelation_ClassesRelation(), theColmenaMLPackage.getRelation(), null, "classesRelation",
				null, 0, 1, ModelRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(infrastructureRelationEClass, InfrastructureRelation.class, "InfrastructureRelation", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(dockerImageEEnum, DockerImage.class, "DockerImage");
		addEEnumLiteral(dockerImageEEnum, DockerImage.OPENJDK12ALPINE);

		initEEnum(languageEEnum, Language.class, "Language");
		addEEnumLiteral(languageEEnum, Language.JAVA8);
		addEEnumLiteral(languageEEnum, Language.JAVA9);

		initEEnum(relationTypeEEnum, RelationType.class, "RelationType");
		addEEnumLiteral(relationTypeEEnum, RelationType.AUTHENTICATED_BY);
		addEEnumLiteral(relationTypeEEnum, RelationType.AUTHORIZED_BY);
		addEEnumLiteral(relationTypeEEnum, RelationType.DEPENDS_ON);

		initEEnum(restartTypeEEnum, RestartType.class, "RestartType");
		addEEnumLiteral(restartTypeEEnum, RestartType.ALWAYS);

		initEEnum(databaseDialectEEnum, DatabaseDialect.class, "DatabaseDialect");
		addEEnumLiteral(databaseDialectEEnum, DatabaseDialect.MY_SQL);
		addEEnumLiteral(databaseDialectEEnum, DatabaseDialect.MONGO_DB);
		addEEnumLiteral(databaseDialectEEnum, DatabaseDialect.POSTGRE_SQL);
		addEEnumLiteral(databaseDialectEEnum, DatabaseDialect.MARIA_DB);
		addEEnumLiteral(databaseDialectEEnum, DatabaseDialect.ORACLE);
		addEEnumLiteral(databaseDialectEEnum, DatabaseDialect.H2);

		initEEnum(discoveryServiceEEnum, DiscoveryService.class, "DiscoveryService");
		addEEnumLiteral(discoveryServiceEEnum, DiscoveryService.CONSUL);
		addEEnumLiteral(discoveryServiceEEnum, DiscoveryService.EUREKA);

		initEEnum(gatewayServiceEEnum, GatewayService.class, "GatewayService");
		addEEnumLiteral(gatewayServiceEEnum, GatewayService.SPRING_CLOUD);
		addEEnumLiteral(gatewayServiceEEnum, GatewayService.NGINX);

		initEEnum(propertiesSyntaxEEnum, PropertiesSyntax.class, "PropertiesSyntax");
		addEEnumLiteral(propertiesSyntaxEEnum, PropertiesSyntax.YML);
		addEEnumLiteral(propertiesSyntaxEEnum, PropertiesSyntax.PROPERTIES);

		initEEnum(dependenciesManagerEEnum, DependenciesManager.class, "DependenciesManager");
		addEEnumLiteral(dependenciesManagerEEnum, DependenciesManager.MAVEN);
		addEEnumLiteral(dependenciesManagerEEnum, DependenciesManager.GRADDLE);

		// Create resource
		createResource(eNS_URI);
	}

} //ColmenaMLIPackageImpl
