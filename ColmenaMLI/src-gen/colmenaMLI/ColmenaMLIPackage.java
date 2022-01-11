/**
 */
package colmenaMLI;

import colmenaML.ColmenaMLPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see colmenaMLI.ColmenaMLIFactory
 * @model kind="package"
 * @generated
 */
public interface ColmenaMLIPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "colmenaMLI";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/colmenaMLI";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "colmenaMLI";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ColmenaMLIPackage eINSTANCE = colmenaMLI.impl.ColmenaMLIPackageImpl.init();

	/**
	 * The meta object id for the '{@link colmenaMLI.impl.InfrastructureDiagramImpl <em>Infrastructure Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see colmenaMLI.impl.InfrastructureDiagramImpl
	 * @see colmenaMLI.impl.ColmenaMLIPackageImpl#getInfrastructureDiagram()
	 * @generated
	 */
	int INFRASTRUCTURE_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Contained configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_DIAGRAM__CONTAINED_CONFIGURATIONS = 0;

	/**
	 * The feature id for the '<em><b>Contained environments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_DIAGRAM__CONTAINED_ENVIRONMENTS = 1;

	/**
	 * The number of structural features of the '<em>Infrastructure Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_DIAGRAM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Infrastructure Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_DIAGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link colmenaMLI.impl.MicroserviceImpl <em>Microservice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see colmenaMLI.impl.MicroserviceImpl
	 * @see colmenaMLI.impl.ColmenaMLIPackageImpl#getMicroservice()
	 * @generated
	 */
	int MICROSERVICE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Lang Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__LANG_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Contained relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__CONTAINED_RELATIONS = 2;

	/**
	 * The feature id for the '<em><b>Artifact Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__ARTIFACT_ID = 3;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__VERSION = 4;

	/**
	 * The feature id for the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__GROUP_ID = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__DESCRIPTION = 6;

	/**
	 * The feature id for the '<em><b>Database</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__DATABASE = 7;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__PORT = 8;

	/**
	 * The feature id for the '<em><b>Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__IP = 9;

	/**
	 * The number of structural features of the '<em>Microservice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Microservice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link colmenaMLI.impl.InfrastructureMsImpl <em>Infrastructure Ms</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see colmenaMLI.impl.InfrastructureMsImpl
	 * @see colmenaMLI.impl.ColmenaMLIPackageImpl#getInfrastructureMs()
	 * @generated
	 */
	int INFRASTRUCTURE_MS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_MS__NAME = MICROSERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Lang Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_MS__LANG_TYPE = MICROSERVICE__LANG_TYPE;

	/**
	 * The feature id for the '<em><b>Contained relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_MS__CONTAINED_RELATIONS = MICROSERVICE__CONTAINED_RELATIONS;

	/**
	 * The feature id for the '<em><b>Artifact Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_MS__ARTIFACT_ID = MICROSERVICE__ARTIFACT_ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_MS__VERSION = MICROSERVICE__VERSION;

	/**
	 * The feature id for the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_MS__GROUP_ID = MICROSERVICE__GROUP_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_MS__DESCRIPTION = MICROSERVICE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Database</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_MS__DATABASE = MICROSERVICE__DATABASE;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_MS__PORT = MICROSERVICE__PORT;

	/**
	 * The feature id for the '<em><b>Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_MS__IP = MICROSERVICE__IP;

	/**
	 * The number of structural features of the '<em>Infrastructure Ms</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_MS_FEATURE_COUNT = MICROSERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Infrastructure Ms</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_MS_OPERATION_COUNT = MICROSERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link colmenaMLI.impl.FunctionalMsImpl <em>Functional Ms</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see colmenaMLI.impl.FunctionalMsImpl
	 * @see colmenaMLI.impl.ColmenaMLIPackageImpl#getFunctionalMs()
	 * @generated
	 */
	int FUNCTIONAL_MS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_MS__NAME = MICROSERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Lang Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_MS__LANG_TYPE = MICROSERVICE__LANG_TYPE;

	/**
	 * The feature id for the '<em><b>Contained relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_MS__CONTAINED_RELATIONS = MICROSERVICE__CONTAINED_RELATIONS;

	/**
	 * The feature id for the '<em><b>Artifact Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_MS__ARTIFACT_ID = MICROSERVICE__ARTIFACT_ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_MS__VERSION = MICROSERVICE__VERSION;

	/**
	 * The feature id for the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_MS__GROUP_ID = MICROSERVICE__GROUP_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_MS__DESCRIPTION = MICROSERVICE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Database</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_MS__DATABASE = MICROSERVICE__DATABASE;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_MS__PORT = MICROSERVICE__PORT;

	/**
	 * The feature id for the '<em><b>Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_MS__IP = MICROSERVICE__IP;

	/**
	 * The feature id for the '<em><b>Contained contracts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_MS__CONTAINED_CONTRACTS = MICROSERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contained packages</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_MS__CONTAINED_PACKAGES = MICROSERVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Contained dto Containers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_MS__CONTAINED_DTO_CONTAINERS = MICROSERVICE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Porperties Syntax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_MS__PORPERTIES_SYNTAX = MICROSERVICE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Dependencies Manager</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_MS__DEPENDENCIES_MANAGER = MICROSERVICE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Functional Ms</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_MS_FEATURE_COUNT = MICROSERVICE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Functional Ms</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_MS_OPERATION_COUNT = MICROSERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link colmenaMLI.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see colmenaMLI.impl.RelationImpl
	 * @see colmenaMLI.impl.ColmenaMLIPackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 4;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__DESTINATION = 0;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__ORIGIN = 1;

	/**
	 * The feature id for the '<em><b>Relation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__RELATION_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link colmenaMLI.impl.AuthenticationImpl <em>Authentication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see colmenaMLI.impl.AuthenticationImpl
	 * @see colmenaMLI.impl.ColmenaMLIPackageImpl#getAuthentication()
	 * @generated
	 */
	int AUTHENTICATION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__NAME = INFRASTRUCTURE_MS__NAME;

	/**
	 * The feature id for the '<em><b>Lang Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__LANG_TYPE = INFRASTRUCTURE_MS__LANG_TYPE;

	/**
	 * The feature id for the '<em><b>Contained relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__CONTAINED_RELATIONS = INFRASTRUCTURE_MS__CONTAINED_RELATIONS;

	/**
	 * The feature id for the '<em><b>Artifact Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__ARTIFACT_ID = INFRASTRUCTURE_MS__ARTIFACT_ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__VERSION = INFRASTRUCTURE_MS__VERSION;

	/**
	 * The feature id for the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__GROUP_ID = INFRASTRUCTURE_MS__GROUP_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__DESCRIPTION = INFRASTRUCTURE_MS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Database</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__DATABASE = INFRASTRUCTURE_MS__DATABASE;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__PORT = INFRASTRUCTURE_MS__PORT;

	/**
	 * The feature id for the '<em><b>Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__IP = INFRASTRUCTURE_MS__IP;

	/**
	 * The number of structural features of the '<em>Authentication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_FEATURE_COUNT = INFRASTRUCTURE_MS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Authentication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_OPERATION_COUNT = INFRASTRUCTURE_MS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link colmenaMLI.impl.AuthorizationImpl <em>Authorization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see colmenaMLI.impl.AuthorizationImpl
	 * @see colmenaMLI.impl.ColmenaMLIPackageImpl#getAuthorization()
	 * @generated
	 */
	int AUTHORIZATION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION__NAME = INFRASTRUCTURE_MS__NAME;

	/**
	 * The feature id for the '<em><b>Lang Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION__LANG_TYPE = INFRASTRUCTURE_MS__LANG_TYPE;

	/**
	 * The feature id for the '<em><b>Contained relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION__CONTAINED_RELATIONS = INFRASTRUCTURE_MS__CONTAINED_RELATIONS;

	/**
	 * The feature id for the '<em><b>Artifact Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION__ARTIFACT_ID = INFRASTRUCTURE_MS__ARTIFACT_ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION__VERSION = INFRASTRUCTURE_MS__VERSION;

	/**
	 * The feature id for the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION__GROUP_ID = INFRASTRUCTURE_MS__GROUP_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION__DESCRIPTION = INFRASTRUCTURE_MS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Database</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION__DATABASE = INFRASTRUCTURE_MS__DATABASE;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION__PORT = INFRASTRUCTURE_MS__PORT;

	/**
	 * The feature id for the '<em><b>Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION__IP = INFRASTRUCTURE_MS__IP;

	/**
	 * The number of structural features of the '<em>Authorization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_FEATURE_COUNT = INFRASTRUCTURE_MS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Authorization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_OPERATION_COUNT = INFRASTRUCTURE_MS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link colmenaMLI.impl.GatewayImpl <em>Gateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see colmenaMLI.impl.GatewayImpl
	 * @see colmenaMLI.impl.ColmenaMLIPackageImpl#getGateway()
	 * @generated
	 */
	int GATEWAY = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__NAME = INFRASTRUCTURE_MS__NAME;

	/**
	 * The feature id for the '<em><b>Lang Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__LANG_TYPE = INFRASTRUCTURE_MS__LANG_TYPE;

	/**
	 * The feature id for the '<em><b>Contained relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__CONTAINED_RELATIONS = INFRASTRUCTURE_MS__CONTAINED_RELATIONS;

	/**
	 * The feature id for the '<em><b>Artifact Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__ARTIFACT_ID = INFRASTRUCTURE_MS__ARTIFACT_ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__VERSION = INFRASTRUCTURE_MS__VERSION;

	/**
	 * The feature id for the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__GROUP_ID = INFRASTRUCTURE_MS__GROUP_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__DESCRIPTION = INFRASTRUCTURE_MS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Database</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__DATABASE = INFRASTRUCTURE_MS__DATABASE;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__PORT = INFRASTRUCTURE_MS__PORT;

	/**
	 * The feature id for the '<em><b>Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__IP = INFRASTRUCTURE_MS__IP;

	/**
	 * The feature id for the '<em><b>Gateway Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__GATEWAY_SERVICE = INFRASTRUCTURE_MS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_FEATURE_COUNT = INFRASTRUCTURE_MS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_OPERATION_COUNT = INFRASTRUCTURE_MS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link colmenaMLI.impl.ConfigServerImpl <em>Config Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see colmenaMLI.impl.ConfigServerImpl
	 * @see colmenaMLI.impl.ColmenaMLIPackageImpl#getConfigServer()
	 * @generated
	 */
	int CONFIG_SERVER = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_SERVER__NAME = INFRASTRUCTURE_MS__NAME;

	/**
	 * The feature id for the '<em><b>Lang Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_SERVER__LANG_TYPE = INFRASTRUCTURE_MS__LANG_TYPE;

	/**
	 * The feature id for the '<em><b>Contained relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_SERVER__CONTAINED_RELATIONS = INFRASTRUCTURE_MS__CONTAINED_RELATIONS;

	/**
	 * The feature id for the '<em><b>Artifact Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_SERVER__ARTIFACT_ID = INFRASTRUCTURE_MS__ARTIFACT_ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_SERVER__VERSION = INFRASTRUCTURE_MS__VERSION;

	/**
	 * The feature id for the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_SERVER__GROUP_ID = INFRASTRUCTURE_MS__GROUP_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_SERVER__DESCRIPTION = INFRASTRUCTURE_MS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Database</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_SERVER__DATABASE = INFRASTRUCTURE_MS__DATABASE;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_SERVER__PORT = INFRASTRUCTURE_MS__PORT;

	/**
	 * The feature id for the '<em><b>Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_SERVER__IP = INFRASTRUCTURE_MS__IP;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_SERVER__USERNAME = INFRASTRUCTURE_MS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_SERVER__PASSWORD = INFRASTRUCTURE_MS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Config Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_SERVER_FEATURE_COUNT = INFRASTRUCTURE_MS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Config Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_SERVER_OPERATION_COUNT = INFRASTRUCTURE_MS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link colmenaMLI.impl.DiscoveryImpl <em>Discovery</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see colmenaMLI.impl.DiscoveryImpl
	 * @see colmenaMLI.impl.ColmenaMLIPackageImpl#getDiscovery()
	 * @generated
	 */
	int DISCOVERY = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY__NAME = INFRASTRUCTURE_MS__NAME;

	/**
	 * The feature id for the '<em><b>Lang Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY__LANG_TYPE = INFRASTRUCTURE_MS__LANG_TYPE;

	/**
	 * The feature id for the '<em><b>Contained relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY__CONTAINED_RELATIONS = INFRASTRUCTURE_MS__CONTAINED_RELATIONS;

	/**
	 * The feature id for the '<em><b>Artifact Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY__ARTIFACT_ID = INFRASTRUCTURE_MS__ARTIFACT_ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY__VERSION = INFRASTRUCTURE_MS__VERSION;

	/**
	 * The feature id for the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY__GROUP_ID = INFRASTRUCTURE_MS__GROUP_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY__DESCRIPTION = INFRASTRUCTURE_MS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Database</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY__DATABASE = INFRASTRUCTURE_MS__DATABASE;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY__PORT = INFRASTRUCTURE_MS__PORT;

	/**
	 * The feature id for the '<em><b>Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY__IP = INFRASTRUCTURE_MS__IP;

	/**
	 * The feature id for the '<em><b>Discovery Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY__DISCOVERY_SERVICE = INFRASTRUCTURE_MS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Discovery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_FEATURE_COUNT = INFRASTRUCTURE_MS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Discovery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_OPERATION_COUNT = INFRASTRUCTURE_MS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link colmenaMLI.impl.LogServerImpl <em>Log Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see colmenaMLI.impl.LogServerImpl
	 * @see colmenaMLI.impl.ColmenaMLIPackageImpl#getLogServer()
	 * @generated
	 */
	int LOG_SERVER = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_SERVER__NAME = INFRASTRUCTURE_MS__NAME;

	/**
	 * The feature id for the '<em><b>Lang Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_SERVER__LANG_TYPE = INFRASTRUCTURE_MS__LANG_TYPE;

	/**
	 * The feature id for the '<em><b>Contained relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_SERVER__CONTAINED_RELATIONS = INFRASTRUCTURE_MS__CONTAINED_RELATIONS;

	/**
	 * The feature id for the '<em><b>Artifact Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_SERVER__ARTIFACT_ID = INFRASTRUCTURE_MS__ARTIFACT_ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_SERVER__VERSION = INFRASTRUCTURE_MS__VERSION;

	/**
	 * The feature id for the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_SERVER__GROUP_ID = INFRASTRUCTURE_MS__GROUP_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_SERVER__DESCRIPTION = INFRASTRUCTURE_MS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Database</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_SERVER__DATABASE = INFRASTRUCTURE_MS__DATABASE;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_SERVER__PORT = INFRASTRUCTURE_MS__PORT;

	/**
	 * The feature id for the '<em><b>Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_SERVER__IP = INFRASTRUCTURE_MS__IP;

	/**
	 * The number of structural features of the '<em>Log Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_SERVER_FEATURE_COUNT = INFRASTRUCTURE_MS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Log Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_SERVER_OPERATION_COUNT = INFRASTRUCTURE_MS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link colmenaMLI.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see colmenaMLI.impl.ConfigurationImpl
	 * @see colmenaMLI.impl.ColmenaMLIPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 11;

	/**
	 * The feature id for the '<em><b>Network</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__NETWORK = 0;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__ENVIRONMENT = 1;

	/**
	 * The feature id for the '<em><b>Restart Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__RESTART_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Microservice</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__MICROSERVICE = 3;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link colmenaMLI.impl.InfrastructureConfigImpl <em>Infrastructure Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see colmenaMLI.impl.InfrastructureConfigImpl
	 * @see colmenaMLI.impl.ColmenaMLIPackageImpl#getInfrastructureConfig()
	 * @generated
	 */
	int INFRASTRUCTURE_CONFIG = 12;

	/**
	 * The feature id for the '<em><b>Network</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_CONFIG__NETWORK = CONFIGURATION__NETWORK;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_CONFIG__ENVIRONMENT = CONFIGURATION__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Restart Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_CONFIG__RESTART_TYPE = CONFIGURATION__RESTART_TYPE;

	/**
	 * The feature id for the '<em><b>Microservice</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_CONFIG__MICROSERVICE = CONFIGURATION__MICROSERVICE;

	/**
	 * The feature id for the '<em><b>Infrastructure Ms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_CONFIG__INFRASTRUCTURE_MS = CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Infrastructure Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_CONFIG_FEATURE_COUNT = CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Infrastructure Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_CONFIG_OPERATION_COUNT = CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link colmenaMLI.impl.DockerConfigImpl <em>Docker Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see colmenaMLI.impl.DockerConfigImpl
	 * @see colmenaMLI.impl.ColmenaMLIPackageImpl#getDockerConfig()
	 * @generated
	 */
	int DOCKER_CONFIG = 13;

	/**
	 * The feature id for the '<em><b>Network</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONFIG__NETWORK = CONFIGURATION__NETWORK;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONFIG__ENVIRONMENT = CONFIGURATION__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Restart Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONFIG__RESTART_TYPE = CONFIGURATION__RESTART_TYPE;

	/**
	 * The feature id for the '<em><b>Microservice</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONFIG__MICROSERVICE = CONFIGURATION__MICROSERVICE;

	/**
	 * The feature id for the '<em><b>Inner Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONFIG__INNER_PORT = CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expose Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONFIG__EXPOSE_PORT = CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Docker Base Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONFIG__DOCKER_BASE_IMAGE = CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Docker Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONFIG_FEATURE_COUNT = CONFIGURATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Docker Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONFIG_OPERATION_COUNT = CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link colmenaMLI.impl.DiagramaImpl <em>Diagrama</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see colmenaMLI.impl.DiagramaImpl
	 * @see colmenaMLI.impl.ColmenaMLIPackageImpl#getDiagrama()
	 * @generated
	 */
	int DIAGRAMA = 14;

	/**
	 * The feature id for the '<em><b>Contained contracts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA__CONTAINED_CONTRACTS = ColmenaMLPackage.CLASS_DIAGRAM__CONTAINED_CONTRACTS;

	/**
	 * The feature id for the '<em><b>Contained packages</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA__CONTAINED_PACKAGES = ColmenaMLPackage.CLASS_DIAGRAM__CONTAINED_PACKAGES;

	/**
	 * The feature id for the '<em><b>Contained dto Containers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA__CONTAINED_DTO_CONTAINERS = ColmenaMLPackage.CLASS_DIAGRAM__CONTAINED_DTO_CONTAINERS;

	/**
	 * The number of structural features of the '<em>Diagrama</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA_FEATURE_COUNT = ColmenaMLPackage.CLASS_DIAGRAM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Diagrama</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA_OPERATION_COUNT = ColmenaMLPackage.CLASS_DIAGRAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link colmenaMLI.impl.DatabaseImpl <em>Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see colmenaMLI.impl.DatabaseImpl
	 * @see colmenaMLI.impl.ColmenaMLIPackageImpl#getDatabase()
	 * @generated
	 */
	int DATABASE = 15;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__USERNAME = 0;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__PASSWORD = 1;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__URL = 2;

	/**
	 * The feature id for the '<em><b>Dialect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__DIALECT = 3;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__PORT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__NAME = 5;

	/**
	 * The number of structural features of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link colmenaMLI.impl.EnvironmentImpl <em>Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see colmenaMLI.impl.EnvironmentImpl
	 * @see colmenaMLI.impl.ColmenaMLIPackageImpl#getEnvironment()
	 * @generated
	 */
	int ENVIRONMENT = 16;

	/**
	 * The feature id for the '<em><b>Contained microservices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__CONTAINED_MICROSERVICES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link colmenaMLI.impl.ModelRelationImpl <em>Model Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see colmenaMLI.impl.ModelRelationImpl
	 * @see colmenaMLI.impl.ColmenaMLIPackageImpl#getModelRelation()
	 * @generated
	 */
	int MODEL_RELATION = 17;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_RELATION__DESTINATION = RELATION__DESTINATION;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_RELATION__ORIGIN = RELATION__ORIGIN;

	/**
	 * The feature id for the '<em><b>Relation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_RELATION__RELATION_TYPE = RELATION__RELATION_TYPE;

	/**
	 * The feature id for the '<em><b>Classes Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_RELATION__CLASSES_RELATION = RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_RELATION_FEATURE_COUNT = RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Model Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_RELATION_OPERATION_COUNT = RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link colmenaMLI.impl.InfrastructureRelationImpl <em>Infrastructure Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see colmenaMLI.impl.InfrastructureRelationImpl
	 * @see colmenaMLI.impl.ColmenaMLIPackageImpl#getInfrastructureRelation()
	 * @generated
	 */
	int INFRASTRUCTURE_RELATION = 18;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_RELATION__DESTINATION = RELATION__DESTINATION;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_RELATION__ORIGIN = RELATION__ORIGIN;

	/**
	 * The feature id for the '<em><b>Relation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_RELATION__RELATION_TYPE = RELATION__RELATION_TYPE;

	/**
	 * The number of structural features of the '<em>Infrastructure Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_RELATION_FEATURE_COUNT = RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Infrastructure Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_RELATION_OPERATION_COUNT = RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link colmenaMLI.DockerImage <em>Docker Image</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see colmenaMLI.DockerImage
	 * @see colmenaMLI.impl.ColmenaMLIPackageImpl#getDockerImage()
	 * @generated
	 */
	int DOCKER_IMAGE = 19;

	/**
	 * The meta object id for the '{@link colmenaMLI.Language <em>Language</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see colmenaMLI.Language
	 * @see colmenaMLI.impl.ColmenaMLIPackageImpl#getLanguage()
	 * @generated
	 */
	int LANGUAGE = 20;

	/**
	 * The meta object id for the '{@link colmenaMLI.RelationType <em>Relation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see colmenaMLI.RelationType
	 * @see colmenaMLI.impl.ColmenaMLIPackageImpl#getRelationType()
	 * @generated
	 */
	int RELATION_TYPE = 21;

	/**
	 * The meta object id for the '{@link colmenaMLI.RestartType <em>Restart Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see colmenaMLI.RestartType
	 * @see colmenaMLI.impl.ColmenaMLIPackageImpl#getRestartType()
	 * @generated
	 */
	int RESTART_TYPE = 22;

	/**
	 * The meta object id for the '{@link colmenaMLI.DatabaseDialect <em>Database Dialect</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see colmenaMLI.DatabaseDialect
	 * @see colmenaMLI.impl.ColmenaMLIPackageImpl#getDatabaseDialect()
	 * @generated
	 */
	int DATABASE_DIALECT = 23;

	/**
	 * The meta object id for the '{@link colmenaMLI.DiscoveryService <em>Discovery Service</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see colmenaMLI.DiscoveryService
	 * @see colmenaMLI.impl.ColmenaMLIPackageImpl#getDiscoveryService()
	 * @generated
	 */
	int DISCOVERY_SERVICE = 24;

	/**
	 * The meta object id for the '{@link colmenaMLI.GatewayService <em>Gateway Service</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see colmenaMLI.GatewayService
	 * @see colmenaMLI.impl.ColmenaMLIPackageImpl#getGatewayService()
	 * @generated
	 */
	int GATEWAY_SERVICE = 25;

	/**
	 * The meta object id for the '{@link colmenaMLI.PropertiesSyntax <em>Properties Syntax</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see colmenaMLI.PropertiesSyntax
	 * @see colmenaMLI.impl.ColmenaMLIPackageImpl#getPropertiesSyntax()
	 * @generated
	 */
	int PROPERTIES_SYNTAX = 26;

	/**
	 * The meta object id for the '{@link colmenaMLI.DependenciesManager <em>Dependencies Manager</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see colmenaMLI.DependenciesManager
	 * @see colmenaMLI.impl.ColmenaMLIPackageImpl#getDependenciesManager()
	 * @generated
	 */
	int DEPENDENCIES_MANAGER = 27;

	/**
	 * Returns the meta object for class '{@link colmenaMLI.InfrastructureDiagram <em>Infrastructure Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infrastructure Diagram</em>'.
	 * @see colmenaMLI.InfrastructureDiagram
	 * @generated
	 */
	EClass getInfrastructureDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link colmenaMLI.InfrastructureDiagram#getContained_configurations <em>Contained configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained configurations</em>'.
	 * @see colmenaMLI.InfrastructureDiagram#getContained_configurations()
	 * @see #getInfrastructureDiagram()
	 * @generated
	 */
	EReference getInfrastructureDiagram_Contained_configurations();

	/**
	 * Returns the meta object for the containment reference list '{@link colmenaMLI.InfrastructureDiagram#getContained_environments <em>Contained environments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained environments</em>'.
	 * @see colmenaMLI.InfrastructureDiagram#getContained_environments()
	 * @see #getInfrastructureDiagram()
	 * @generated
	 */
	EReference getInfrastructureDiagram_Contained_environments();

	/**
	 * Returns the meta object for class '{@link colmenaMLI.Microservice <em>Microservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Microservice</em>'.
	 * @see colmenaMLI.Microservice
	 * @generated
	 */
	EClass getMicroservice();

	/**
	 * Returns the meta object for the attribute '{@link colmenaMLI.Microservice#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see colmenaMLI.Microservice#getName()
	 * @see #getMicroservice()
	 * @generated
	 */
	EAttribute getMicroservice_Name();

	/**
	 * Returns the meta object for the attribute '{@link colmenaMLI.Microservice#getLangType <em>Lang Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang Type</em>'.
	 * @see colmenaMLI.Microservice#getLangType()
	 * @see #getMicroservice()
	 * @generated
	 */
	EAttribute getMicroservice_LangType();

	/**
	 * Returns the meta object for the containment reference list '{@link colmenaMLI.Microservice#getContained_relations <em>Contained relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained relations</em>'.
	 * @see colmenaMLI.Microservice#getContained_relations()
	 * @see #getMicroservice()
	 * @generated
	 */
	EReference getMicroservice_Contained_relations();

	/**
	 * Returns the meta object for the attribute '{@link colmenaMLI.Microservice#getArtifactId <em>Artifact Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Artifact Id</em>'.
	 * @see colmenaMLI.Microservice#getArtifactId()
	 * @see #getMicroservice()
	 * @generated
	 */
	EAttribute getMicroservice_ArtifactId();

	/**
	 * Returns the meta object for the attribute '{@link colmenaMLI.Microservice#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see colmenaMLI.Microservice#getVersion()
	 * @see #getMicroservice()
	 * @generated
	 */
	EAttribute getMicroservice_Version();

	/**
	 * Returns the meta object for the attribute '{@link colmenaMLI.Microservice#getGroupId <em>Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Id</em>'.
	 * @see colmenaMLI.Microservice#getGroupId()
	 * @see #getMicroservice()
	 * @generated
	 */
	EAttribute getMicroservice_GroupId();

	/**
	 * Returns the meta object for the attribute '{@link colmenaMLI.Microservice#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see colmenaMLI.Microservice#getDescription()
	 * @see #getMicroservice()
	 * @generated
	 */
	EAttribute getMicroservice_Description();

	/**
	 * Returns the meta object for the containment reference '{@link colmenaMLI.Microservice#getDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Database</em>'.
	 * @see colmenaMLI.Microservice#getDatabase()
	 * @see #getMicroservice()
	 * @generated
	 */
	EReference getMicroservice_Database();

	/**
	 * Returns the meta object for the attribute '{@link colmenaMLI.Microservice#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see colmenaMLI.Microservice#getPort()
	 * @see #getMicroservice()
	 * @generated
	 */
	EAttribute getMicroservice_Port();

	/**
	 * Returns the meta object for the attribute '{@link colmenaMLI.Microservice#getIp <em>Ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip</em>'.
	 * @see colmenaMLI.Microservice#getIp()
	 * @see #getMicroservice()
	 * @generated
	 */
	EAttribute getMicroservice_Ip();

	/**
	 * Returns the meta object for class '{@link colmenaMLI.InfrastructureMs <em>Infrastructure Ms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infrastructure Ms</em>'.
	 * @see colmenaMLI.InfrastructureMs
	 * @generated
	 */
	EClass getInfrastructureMs();

	/**
	 * Returns the meta object for class '{@link colmenaMLI.FunctionalMs <em>Functional Ms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional Ms</em>'.
	 * @see colmenaMLI.FunctionalMs
	 * @generated
	 */
	EClass getFunctionalMs();

	/**
	 * Returns the meta object for the attribute '{@link colmenaMLI.FunctionalMs#getPorpertiesSyntax <em>Porperties Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Porperties Syntax</em>'.
	 * @see colmenaMLI.FunctionalMs#getPorpertiesSyntax()
	 * @see #getFunctionalMs()
	 * @generated
	 */
	EAttribute getFunctionalMs_PorpertiesSyntax();

	/**
	 * Returns the meta object for the attribute '{@link colmenaMLI.FunctionalMs#getDependenciesManager <em>Dependencies Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dependencies Manager</em>'.
	 * @see colmenaMLI.FunctionalMs#getDependenciesManager()
	 * @see #getFunctionalMs()
	 * @generated
	 */
	EAttribute getFunctionalMs_DependenciesManager();

	/**
	 * Returns the meta object for class '{@link colmenaMLI.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see colmenaMLI.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for the reference '{@link colmenaMLI.Relation#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see colmenaMLI.Relation#getDestination()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Destination();

	/**
	 * Returns the meta object for the reference '{@link colmenaMLI.Relation#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origin</em>'.
	 * @see colmenaMLI.Relation#getOrigin()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Origin();

	/**
	 * Returns the meta object for the attribute '{@link colmenaMLI.Relation#getRelationType <em>Relation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relation Type</em>'.
	 * @see colmenaMLI.Relation#getRelationType()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_RelationType();

	/**
	 * Returns the meta object for class '{@link colmenaMLI.Authentication <em>Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authentication</em>'.
	 * @see colmenaMLI.Authentication
	 * @generated
	 */
	EClass getAuthentication();

	/**
	 * Returns the meta object for class '{@link colmenaMLI.Authorization <em>Authorization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authorization</em>'.
	 * @see colmenaMLI.Authorization
	 * @generated
	 */
	EClass getAuthorization();

	/**
	 * Returns the meta object for class '{@link colmenaMLI.Gateway <em>Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gateway</em>'.
	 * @see colmenaMLI.Gateway
	 * @generated
	 */
	EClass getGateway();

	/**
	 * Returns the meta object for the attribute '{@link colmenaMLI.Gateway#getGatewayService <em>Gateway Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gateway Service</em>'.
	 * @see colmenaMLI.Gateway#getGatewayService()
	 * @see #getGateway()
	 * @generated
	 */
	EAttribute getGateway_GatewayService();

	/**
	 * Returns the meta object for class '{@link colmenaMLI.ConfigServer <em>Config Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config Server</em>'.
	 * @see colmenaMLI.ConfigServer
	 * @generated
	 */
	EClass getConfigServer();

	/**
	 * Returns the meta object for the attribute '{@link colmenaMLI.ConfigServer#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see colmenaMLI.ConfigServer#getUsername()
	 * @see #getConfigServer()
	 * @generated
	 */
	EAttribute getConfigServer_Username();

	/**
	 * Returns the meta object for the attribute '{@link colmenaMLI.ConfigServer#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see colmenaMLI.ConfigServer#getPassword()
	 * @see #getConfigServer()
	 * @generated
	 */
	EAttribute getConfigServer_Password();

	/**
	 * Returns the meta object for class '{@link colmenaMLI.Discovery <em>Discovery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discovery</em>'.
	 * @see colmenaMLI.Discovery
	 * @generated
	 */
	EClass getDiscovery();

	/**
	 * Returns the meta object for the attribute '{@link colmenaMLI.Discovery#getDiscoveryService <em>Discovery Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discovery Service</em>'.
	 * @see colmenaMLI.Discovery#getDiscoveryService()
	 * @see #getDiscovery()
	 * @generated
	 */
	EAttribute getDiscovery_DiscoveryService();

	/**
	 * Returns the meta object for class '{@link colmenaMLI.LogServer <em>Log Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Log Server</em>'.
	 * @see colmenaMLI.LogServer
	 * @generated
	 */
	EClass getLogServer();

	/**
	 * Returns the meta object for class '{@link colmenaMLI.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see colmenaMLI.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link colmenaMLI.Configuration#getNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Network</em>'.
	 * @see colmenaMLI.Configuration#getNetwork()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_Network();

	/**
	 * Returns the meta object for the attribute '{@link colmenaMLI.Configuration#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Environment</em>'.
	 * @see colmenaMLI.Configuration#getEnvironment()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_Environment();

	/**
	 * Returns the meta object for the attribute '{@link colmenaMLI.Configuration#getRestartType <em>Restart Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Restart Type</em>'.
	 * @see colmenaMLI.Configuration#getRestartType()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_RestartType();

	/**
	 * Returns the meta object for the containment reference list '{@link colmenaMLI.Configuration#getMicroservice <em>Microservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Microservice</em>'.
	 * @see colmenaMLI.Configuration#getMicroservice()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Microservice();

	/**
	 * Returns the meta object for class '{@link colmenaMLI.InfrastructureConfig <em>Infrastructure Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infrastructure Config</em>'.
	 * @see colmenaMLI.InfrastructureConfig
	 * @generated
	 */
	EClass getInfrastructureConfig();

	/**
	 * Returns the meta object for the reference list '{@link colmenaMLI.InfrastructureConfig#getInfrastructureMs <em>Infrastructure Ms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Infrastructure Ms</em>'.
	 * @see colmenaMLI.InfrastructureConfig#getInfrastructureMs()
	 * @see #getInfrastructureConfig()
	 * @generated
	 */
	EReference getInfrastructureConfig_InfrastructureMs();

	/**
	 * Returns the meta object for class '{@link colmenaMLI.DockerConfig <em>Docker Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Docker Config</em>'.
	 * @see colmenaMLI.DockerConfig
	 * @generated
	 */
	EClass getDockerConfig();

	/**
	 * Returns the meta object for the attribute '{@link colmenaMLI.DockerConfig#getInnerPort <em>Inner Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inner Port</em>'.
	 * @see colmenaMLI.DockerConfig#getInnerPort()
	 * @see #getDockerConfig()
	 * @generated
	 */
	EAttribute getDockerConfig_InnerPort();

	/**
	 * Returns the meta object for the attribute '{@link colmenaMLI.DockerConfig#getExposePort <em>Expose Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expose Port</em>'.
	 * @see colmenaMLI.DockerConfig#getExposePort()
	 * @see #getDockerConfig()
	 * @generated
	 */
	EAttribute getDockerConfig_ExposePort();

	/**
	 * Returns the meta object for the attribute '{@link colmenaMLI.DockerConfig#getDockerBaseImage <em>Docker Base Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Docker Base Image</em>'.
	 * @see colmenaMLI.DockerConfig#getDockerBaseImage()
	 * @see #getDockerConfig()
	 * @generated
	 */
	EAttribute getDockerConfig_DockerBaseImage();

	/**
	 * Returns the meta object for class '{@link colmenaMLI.Diagrama <em>Diagrama</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagrama</em>'.
	 * @see colmenaMLI.Diagrama
	 * @generated
	 */
	EClass getDiagrama();

	/**
	 * Returns the meta object for class '{@link colmenaMLI.Database <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database</em>'.
	 * @see colmenaMLI.Database
	 * @generated
	 */
	EClass getDatabase();

	/**
	 * Returns the meta object for the attribute '{@link colmenaMLI.Database#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see colmenaMLI.Database#getUsername()
	 * @see #getDatabase()
	 * @generated
	 */
	EAttribute getDatabase_Username();

	/**
	 * Returns the meta object for the attribute '{@link colmenaMLI.Database#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see colmenaMLI.Database#getPassword()
	 * @see #getDatabase()
	 * @generated
	 */
	EAttribute getDatabase_Password();

	/**
	 * Returns the meta object for the attribute '{@link colmenaMLI.Database#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see colmenaMLI.Database#getUrl()
	 * @see #getDatabase()
	 * @generated
	 */
	EAttribute getDatabase_Url();

	/**
	 * Returns the meta object for the attribute '{@link colmenaMLI.Database#getDialect <em>Dialect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dialect</em>'.
	 * @see colmenaMLI.Database#getDialect()
	 * @see #getDatabase()
	 * @generated
	 */
	EAttribute getDatabase_Dialect();

	/**
	 * Returns the meta object for the attribute '{@link colmenaMLI.Database#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see colmenaMLI.Database#getPort()
	 * @see #getDatabase()
	 * @generated
	 */
	EAttribute getDatabase_Port();

	/**
	 * Returns the meta object for the attribute '{@link colmenaMLI.Database#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see colmenaMLI.Database#getName()
	 * @see #getDatabase()
	 * @generated
	 */
	EAttribute getDatabase_Name();

	/**
	 * Returns the meta object for class '{@link colmenaMLI.Environment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment</em>'.
	 * @see colmenaMLI.Environment
	 * @generated
	 */
	EClass getEnvironment();

	/**
	 * Returns the meta object for the containment reference list '{@link colmenaMLI.Environment#getContained_microservices <em>Contained microservices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained microservices</em>'.
	 * @see colmenaMLI.Environment#getContained_microservices()
	 * @see #getEnvironment()
	 * @generated
	 */
	EReference getEnvironment_Contained_microservices();

	/**
	 * Returns the meta object for the attribute '{@link colmenaMLI.Environment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see colmenaMLI.Environment#getName()
	 * @see #getEnvironment()
	 * @generated
	 */
	EAttribute getEnvironment_Name();

	/**
	 * Returns the meta object for class '{@link colmenaMLI.ModelRelation <em>Model Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Relation</em>'.
	 * @see colmenaMLI.ModelRelation
	 * @generated
	 */
	EClass getModelRelation();

	/**
	 * Returns the meta object for the reference '{@link colmenaMLI.ModelRelation#getClassesRelation <em>Classes Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Classes Relation</em>'.
	 * @see colmenaMLI.ModelRelation#getClassesRelation()
	 * @see #getModelRelation()
	 * @generated
	 */
	EReference getModelRelation_ClassesRelation();

	/**
	 * Returns the meta object for class '{@link colmenaMLI.InfrastructureRelation <em>Infrastructure Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infrastructure Relation</em>'.
	 * @see colmenaMLI.InfrastructureRelation
	 * @generated
	 */
	EClass getInfrastructureRelation();

	/**
	 * Returns the meta object for enum '{@link colmenaMLI.DockerImage <em>Docker Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Docker Image</em>'.
	 * @see colmenaMLI.DockerImage
	 * @generated
	 */
	EEnum getDockerImage();

	/**
	 * Returns the meta object for enum '{@link colmenaMLI.Language <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Language</em>'.
	 * @see colmenaMLI.Language
	 * @generated
	 */
	EEnum getLanguage();

	/**
	 * Returns the meta object for enum '{@link colmenaMLI.RelationType <em>Relation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Relation Type</em>'.
	 * @see colmenaMLI.RelationType
	 * @generated
	 */
	EEnum getRelationType();

	/**
	 * Returns the meta object for enum '{@link colmenaMLI.RestartType <em>Restart Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Restart Type</em>'.
	 * @see colmenaMLI.RestartType
	 * @generated
	 */
	EEnum getRestartType();

	/**
	 * Returns the meta object for enum '{@link colmenaMLI.DatabaseDialect <em>Database Dialect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Database Dialect</em>'.
	 * @see colmenaMLI.DatabaseDialect
	 * @generated
	 */
	EEnum getDatabaseDialect();

	/**
	 * Returns the meta object for enum '{@link colmenaMLI.DiscoveryService <em>Discovery Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Discovery Service</em>'.
	 * @see colmenaMLI.DiscoveryService
	 * @generated
	 */
	EEnum getDiscoveryService();

	/**
	 * Returns the meta object for enum '{@link colmenaMLI.GatewayService <em>Gateway Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Gateway Service</em>'.
	 * @see colmenaMLI.GatewayService
	 * @generated
	 */
	EEnum getGatewayService();

	/**
	 * Returns the meta object for enum '{@link colmenaMLI.PropertiesSyntax <em>Properties Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Properties Syntax</em>'.
	 * @see colmenaMLI.PropertiesSyntax
	 * @generated
	 */
	EEnum getPropertiesSyntax();

	/**
	 * Returns the meta object for enum '{@link colmenaMLI.DependenciesManager <em>Dependencies Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dependencies Manager</em>'.
	 * @see colmenaMLI.DependenciesManager
	 * @generated
	 */
	EEnum getDependenciesManager();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ColmenaMLIFactory getColmenaMLIFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link colmenaMLI.impl.InfrastructureDiagramImpl <em>Infrastructure Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see colmenaMLI.impl.InfrastructureDiagramImpl
		 * @see colmenaMLI.impl.ColmenaMLIPackageImpl#getInfrastructureDiagram()
		 * @generated
		 */
		EClass INFRASTRUCTURE_DIAGRAM = eINSTANCE.getInfrastructureDiagram();

		/**
		 * The meta object literal for the '<em><b>Contained configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRASTRUCTURE_DIAGRAM__CONTAINED_CONFIGURATIONS = eINSTANCE
				.getInfrastructureDiagram_Contained_configurations();

		/**
		 * The meta object literal for the '<em><b>Contained environments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRASTRUCTURE_DIAGRAM__CONTAINED_ENVIRONMENTS = eINSTANCE
				.getInfrastructureDiagram_Contained_environments();

		/**
		 * The meta object literal for the '{@link colmenaMLI.impl.MicroserviceImpl <em>Microservice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see colmenaMLI.impl.MicroserviceImpl
		 * @see colmenaMLI.impl.ColmenaMLIPackageImpl#getMicroservice()
		 * @generated
		 */
		EClass MICROSERVICE = eINSTANCE.getMicroservice();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MICROSERVICE__NAME = eINSTANCE.getMicroservice_Name();

		/**
		 * The meta object literal for the '<em><b>Lang Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MICROSERVICE__LANG_TYPE = eINSTANCE.getMicroservice_LangType();

		/**
		 * The meta object literal for the '<em><b>Contained relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROSERVICE__CONTAINED_RELATIONS = eINSTANCE.getMicroservice_Contained_relations();

		/**
		 * The meta object literal for the '<em><b>Artifact Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MICROSERVICE__ARTIFACT_ID = eINSTANCE.getMicroservice_ArtifactId();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MICROSERVICE__VERSION = eINSTANCE.getMicroservice_Version();

		/**
		 * The meta object literal for the '<em><b>Group Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MICROSERVICE__GROUP_ID = eINSTANCE.getMicroservice_GroupId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MICROSERVICE__DESCRIPTION = eINSTANCE.getMicroservice_Description();

		/**
		 * The meta object literal for the '<em><b>Database</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROSERVICE__DATABASE = eINSTANCE.getMicroservice_Database();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MICROSERVICE__PORT = eINSTANCE.getMicroservice_Port();

		/**
		 * The meta object literal for the '<em><b>Ip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MICROSERVICE__IP = eINSTANCE.getMicroservice_Ip();

		/**
		 * The meta object literal for the '{@link colmenaMLI.impl.InfrastructureMsImpl <em>Infrastructure Ms</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see colmenaMLI.impl.InfrastructureMsImpl
		 * @see colmenaMLI.impl.ColmenaMLIPackageImpl#getInfrastructureMs()
		 * @generated
		 */
		EClass INFRASTRUCTURE_MS = eINSTANCE.getInfrastructureMs();

		/**
		 * The meta object literal for the '{@link colmenaMLI.impl.FunctionalMsImpl <em>Functional Ms</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see colmenaMLI.impl.FunctionalMsImpl
		 * @see colmenaMLI.impl.ColmenaMLIPackageImpl#getFunctionalMs()
		 * @generated
		 */
		EClass FUNCTIONAL_MS = eINSTANCE.getFunctionalMs();

		/**
		 * The meta object literal for the '<em><b>Porperties Syntax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTIONAL_MS__PORPERTIES_SYNTAX = eINSTANCE.getFunctionalMs_PorpertiesSyntax();

		/**
		 * The meta object literal for the '<em><b>Dependencies Manager</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTIONAL_MS__DEPENDENCIES_MANAGER = eINSTANCE.getFunctionalMs_DependenciesManager();

		/**
		 * The meta object literal for the '{@link colmenaMLI.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see colmenaMLI.impl.RelationImpl
		 * @see colmenaMLI.impl.ColmenaMLIPackageImpl#getRelation()
		 * @generated
		 */
		EClass RELATION = eINSTANCE.getRelation();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__DESTINATION = eINSTANCE.getRelation_Destination();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__ORIGIN = eINSTANCE.getRelation_Origin();

		/**
		 * The meta object literal for the '<em><b>Relation Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__RELATION_TYPE = eINSTANCE.getRelation_RelationType();

		/**
		 * The meta object literal for the '{@link colmenaMLI.impl.AuthenticationImpl <em>Authentication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see colmenaMLI.impl.AuthenticationImpl
		 * @see colmenaMLI.impl.ColmenaMLIPackageImpl#getAuthentication()
		 * @generated
		 */
		EClass AUTHENTICATION = eINSTANCE.getAuthentication();

		/**
		 * The meta object literal for the '{@link colmenaMLI.impl.AuthorizationImpl <em>Authorization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see colmenaMLI.impl.AuthorizationImpl
		 * @see colmenaMLI.impl.ColmenaMLIPackageImpl#getAuthorization()
		 * @generated
		 */
		EClass AUTHORIZATION = eINSTANCE.getAuthorization();

		/**
		 * The meta object literal for the '{@link colmenaMLI.impl.GatewayImpl <em>Gateway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see colmenaMLI.impl.GatewayImpl
		 * @see colmenaMLI.impl.ColmenaMLIPackageImpl#getGateway()
		 * @generated
		 */
		EClass GATEWAY = eINSTANCE.getGateway();

		/**
		 * The meta object literal for the '<em><b>Gateway Service</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GATEWAY__GATEWAY_SERVICE = eINSTANCE.getGateway_GatewayService();

		/**
		 * The meta object literal for the '{@link colmenaMLI.impl.ConfigServerImpl <em>Config Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see colmenaMLI.impl.ConfigServerImpl
		 * @see colmenaMLI.impl.ColmenaMLIPackageImpl#getConfigServer()
		 * @generated
		 */
		EClass CONFIG_SERVER = eINSTANCE.getConfigServer();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG_SERVER__USERNAME = eINSTANCE.getConfigServer_Username();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG_SERVER__PASSWORD = eINSTANCE.getConfigServer_Password();

		/**
		 * The meta object literal for the '{@link colmenaMLI.impl.DiscoveryImpl <em>Discovery</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see colmenaMLI.impl.DiscoveryImpl
		 * @see colmenaMLI.impl.ColmenaMLIPackageImpl#getDiscovery()
		 * @generated
		 */
		EClass DISCOVERY = eINSTANCE.getDiscovery();

		/**
		 * The meta object literal for the '<em><b>Discovery Service</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOVERY__DISCOVERY_SERVICE = eINSTANCE.getDiscovery_DiscoveryService();

		/**
		 * The meta object literal for the '{@link colmenaMLI.impl.LogServerImpl <em>Log Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see colmenaMLI.impl.LogServerImpl
		 * @see colmenaMLI.impl.ColmenaMLIPackageImpl#getLogServer()
		 * @generated
		 */
		EClass LOG_SERVER = eINSTANCE.getLogServer();

		/**
		 * The meta object literal for the '{@link colmenaMLI.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see colmenaMLI.impl.ConfigurationImpl
		 * @see colmenaMLI.impl.ColmenaMLIPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Network</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__NETWORK = eINSTANCE.getConfiguration_Network();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__ENVIRONMENT = eINSTANCE.getConfiguration_Environment();

		/**
		 * The meta object literal for the '<em><b>Restart Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__RESTART_TYPE = eINSTANCE.getConfiguration_RestartType();

		/**
		 * The meta object literal for the '<em><b>Microservice</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__MICROSERVICE = eINSTANCE.getConfiguration_Microservice();

		/**
		 * The meta object literal for the '{@link colmenaMLI.impl.InfrastructureConfigImpl <em>Infrastructure Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see colmenaMLI.impl.InfrastructureConfigImpl
		 * @see colmenaMLI.impl.ColmenaMLIPackageImpl#getInfrastructureConfig()
		 * @generated
		 */
		EClass INFRASTRUCTURE_CONFIG = eINSTANCE.getInfrastructureConfig();

		/**
		 * The meta object literal for the '<em><b>Infrastructure Ms</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRASTRUCTURE_CONFIG__INFRASTRUCTURE_MS = eINSTANCE.getInfrastructureConfig_InfrastructureMs();

		/**
		 * The meta object literal for the '{@link colmenaMLI.impl.DockerConfigImpl <em>Docker Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see colmenaMLI.impl.DockerConfigImpl
		 * @see colmenaMLI.impl.ColmenaMLIPackageImpl#getDockerConfig()
		 * @generated
		 */
		EClass DOCKER_CONFIG = eINSTANCE.getDockerConfig();

		/**
		 * The meta object literal for the '<em><b>Inner Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_CONFIG__INNER_PORT = eINSTANCE.getDockerConfig_InnerPort();

		/**
		 * The meta object literal for the '<em><b>Expose Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_CONFIG__EXPOSE_PORT = eINSTANCE.getDockerConfig_ExposePort();

		/**
		 * The meta object literal for the '<em><b>Docker Base Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_CONFIG__DOCKER_BASE_IMAGE = eINSTANCE.getDockerConfig_DockerBaseImage();

		/**
		 * The meta object literal for the '{@link colmenaMLI.impl.DiagramaImpl <em>Diagrama</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see colmenaMLI.impl.DiagramaImpl
		 * @see colmenaMLI.impl.ColmenaMLIPackageImpl#getDiagrama()
		 * @generated
		 */
		EClass DIAGRAMA = eINSTANCE.getDiagrama();

		/**
		 * The meta object literal for the '{@link colmenaMLI.impl.DatabaseImpl <em>Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see colmenaMLI.impl.DatabaseImpl
		 * @see colmenaMLI.impl.ColmenaMLIPackageImpl#getDatabase()
		 * @generated
		 */
		EClass DATABASE = eINSTANCE.getDatabase();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE__USERNAME = eINSTANCE.getDatabase_Username();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE__PASSWORD = eINSTANCE.getDatabase_Password();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE__URL = eINSTANCE.getDatabase_Url();

		/**
		 * The meta object literal for the '<em><b>Dialect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE__DIALECT = eINSTANCE.getDatabase_Dialect();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE__PORT = eINSTANCE.getDatabase_Port();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE__NAME = eINSTANCE.getDatabase_Name();

		/**
		 * The meta object literal for the '{@link colmenaMLI.impl.EnvironmentImpl <em>Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see colmenaMLI.impl.EnvironmentImpl
		 * @see colmenaMLI.impl.ColmenaMLIPackageImpl#getEnvironment()
		 * @generated
		 */
		EClass ENVIRONMENT = eINSTANCE.getEnvironment();

		/**
		 * The meta object literal for the '<em><b>Contained microservices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT__CONTAINED_MICROSERVICES = eINSTANCE.getEnvironment_Contained_microservices();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT__NAME = eINSTANCE.getEnvironment_Name();

		/**
		 * The meta object literal for the '{@link colmenaMLI.impl.ModelRelationImpl <em>Model Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see colmenaMLI.impl.ModelRelationImpl
		 * @see colmenaMLI.impl.ColmenaMLIPackageImpl#getModelRelation()
		 * @generated
		 */
		EClass MODEL_RELATION = eINSTANCE.getModelRelation();

		/**
		 * The meta object literal for the '<em><b>Classes Relation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_RELATION__CLASSES_RELATION = eINSTANCE.getModelRelation_ClassesRelation();

		/**
		 * The meta object literal for the '{@link colmenaMLI.impl.InfrastructureRelationImpl <em>Infrastructure Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see colmenaMLI.impl.InfrastructureRelationImpl
		 * @see colmenaMLI.impl.ColmenaMLIPackageImpl#getInfrastructureRelation()
		 * @generated
		 */
		EClass INFRASTRUCTURE_RELATION = eINSTANCE.getInfrastructureRelation();

		/**
		 * The meta object literal for the '{@link colmenaMLI.DockerImage <em>Docker Image</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see colmenaMLI.DockerImage
		 * @see colmenaMLI.impl.ColmenaMLIPackageImpl#getDockerImage()
		 * @generated
		 */
		EEnum DOCKER_IMAGE = eINSTANCE.getDockerImage();

		/**
		 * The meta object literal for the '{@link colmenaMLI.Language <em>Language</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see colmenaMLI.Language
		 * @see colmenaMLI.impl.ColmenaMLIPackageImpl#getLanguage()
		 * @generated
		 */
		EEnum LANGUAGE = eINSTANCE.getLanguage();

		/**
		 * The meta object literal for the '{@link colmenaMLI.RelationType <em>Relation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see colmenaMLI.RelationType
		 * @see colmenaMLI.impl.ColmenaMLIPackageImpl#getRelationType()
		 * @generated
		 */
		EEnum RELATION_TYPE = eINSTANCE.getRelationType();

		/**
		 * The meta object literal for the '{@link colmenaMLI.RestartType <em>Restart Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see colmenaMLI.RestartType
		 * @see colmenaMLI.impl.ColmenaMLIPackageImpl#getRestartType()
		 * @generated
		 */
		EEnum RESTART_TYPE = eINSTANCE.getRestartType();

		/**
		 * The meta object literal for the '{@link colmenaMLI.DatabaseDialect <em>Database Dialect</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see colmenaMLI.DatabaseDialect
		 * @see colmenaMLI.impl.ColmenaMLIPackageImpl#getDatabaseDialect()
		 * @generated
		 */
		EEnum DATABASE_DIALECT = eINSTANCE.getDatabaseDialect();

		/**
		 * The meta object literal for the '{@link colmenaMLI.DiscoveryService <em>Discovery Service</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see colmenaMLI.DiscoveryService
		 * @see colmenaMLI.impl.ColmenaMLIPackageImpl#getDiscoveryService()
		 * @generated
		 */
		EEnum DISCOVERY_SERVICE = eINSTANCE.getDiscoveryService();

		/**
		 * The meta object literal for the '{@link colmenaMLI.GatewayService <em>Gateway Service</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see colmenaMLI.GatewayService
		 * @see colmenaMLI.impl.ColmenaMLIPackageImpl#getGatewayService()
		 * @generated
		 */
		EEnum GATEWAY_SERVICE = eINSTANCE.getGatewayService();

		/**
		 * The meta object literal for the '{@link colmenaMLI.PropertiesSyntax <em>Properties Syntax</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see colmenaMLI.PropertiesSyntax
		 * @see colmenaMLI.impl.ColmenaMLIPackageImpl#getPropertiesSyntax()
		 * @generated
		 */
		EEnum PROPERTIES_SYNTAX = eINSTANCE.getPropertiesSyntax();

		/**
		 * The meta object literal for the '{@link colmenaMLI.DependenciesManager <em>Dependencies Manager</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see colmenaMLI.DependenciesManager
		 * @see colmenaMLI.impl.ColmenaMLIPackageImpl#getDependenciesManager()
		 * @generated
		 */
		EEnum DEPENDENCIES_MANAGER = eINSTANCE.getDependenciesManager();

	}

} //ColmenaMLIPackage
