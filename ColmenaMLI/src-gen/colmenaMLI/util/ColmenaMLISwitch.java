/**
 */
package colmenaMLI.util;

import colmenaML.ClassDiagram;

import colmenaMLI.*;

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
 * @see colmenaMLI.ColmenaMLIPackage
 * @generated
 */
public class ColmenaMLISwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ColmenaMLIPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColmenaMLISwitch() {
		if (modelPackage == null) {
			modelPackage = ColmenaMLIPackage.eINSTANCE;
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
		case ColmenaMLIPackage.INFRASTRUCTURE_DIAGRAM: {
			InfrastructureDiagram infrastructureDiagram = (InfrastructureDiagram) theEObject;
			T result = caseInfrastructureDiagram(infrastructureDiagram);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ColmenaMLIPackage.MICROSERVICE: {
			Microservice microservice = (Microservice) theEObject;
			T result = caseMicroservice(microservice);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ColmenaMLIPackage.INFRASTRUCTURE_MS: {
			InfrastructureMs infrastructureMs = (InfrastructureMs) theEObject;
			T result = caseInfrastructureMs(infrastructureMs);
			if (result == null)
				result = caseMicroservice(infrastructureMs);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ColmenaMLIPackage.FUNCTIONAL_MS: {
			FunctionalMs functionalMs = (FunctionalMs) theEObject;
			T result = caseFunctionalMs(functionalMs);
			if (result == null)
				result = caseMicroservice(functionalMs);
			if (result == null)
				result = caseDiagrama(functionalMs);
			if (result == null)
				result = caseClassDiagram(functionalMs);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ColmenaMLIPackage.RELATION: {
			Relation relation = (Relation) theEObject;
			T result = caseRelation(relation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ColmenaMLIPackage.AUTHENTICATION: {
			Authentication authentication = (Authentication) theEObject;
			T result = caseAuthentication(authentication);
			if (result == null)
				result = caseInfrastructureMs(authentication);
			if (result == null)
				result = caseMicroservice(authentication);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ColmenaMLIPackage.AUTHORIZATION: {
			Authorization authorization = (Authorization) theEObject;
			T result = caseAuthorization(authorization);
			if (result == null)
				result = caseInfrastructureMs(authorization);
			if (result == null)
				result = caseMicroservice(authorization);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ColmenaMLIPackage.GATEWAY: {
			Gateway gateway = (Gateway) theEObject;
			T result = caseGateway(gateway);
			if (result == null)
				result = caseInfrastructureMs(gateway);
			if (result == null)
				result = caseMicroservice(gateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ColmenaMLIPackage.CONFIG_SERVER: {
			ConfigServer configServer = (ConfigServer) theEObject;
			T result = caseConfigServer(configServer);
			if (result == null)
				result = caseInfrastructureMs(configServer);
			if (result == null)
				result = caseMicroservice(configServer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ColmenaMLIPackage.DISCOVERY: {
			Discovery discovery = (Discovery) theEObject;
			T result = caseDiscovery(discovery);
			if (result == null)
				result = caseInfrastructureMs(discovery);
			if (result == null)
				result = caseMicroservice(discovery);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ColmenaMLIPackage.LOG_SERVER: {
			LogServer logServer = (LogServer) theEObject;
			T result = caseLogServer(logServer);
			if (result == null)
				result = caseInfrastructureMs(logServer);
			if (result == null)
				result = caseMicroservice(logServer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ColmenaMLIPackage.CONFIGURATION: {
			Configuration configuration = (Configuration) theEObject;
			T result = caseConfiguration(configuration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ColmenaMLIPackage.INFRASTRUCTURE_CONFIG: {
			InfrastructureConfig infrastructureConfig = (InfrastructureConfig) theEObject;
			T result = caseInfrastructureConfig(infrastructureConfig);
			if (result == null)
				result = caseConfiguration(infrastructureConfig);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ColmenaMLIPackage.DOCKER_CONFIG: {
			DockerConfig dockerConfig = (DockerConfig) theEObject;
			T result = caseDockerConfig(dockerConfig);
			if (result == null)
				result = caseConfiguration(dockerConfig);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ColmenaMLIPackage.DIAGRAMA: {
			Diagrama diagrama = (Diagrama) theEObject;
			T result = caseDiagrama(diagrama);
			if (result == null)
				result = caseClassDiagram(diagrama);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ColmenaMLIPackage.DATABASE: {
			Database database = (Database) theEObject;
			T result = caseDatabase(database);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ColmenaMLIPackage.ENVIRONMENT: {
			Environment environment = (Environment) theEObject;
			T result = caseEnvironment(environment);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ColmenaMLIPackage.MODEL_RELATION: {
			ModelRelation modelRelation = (ModelRelation) theEObject;
			T result = caseModelRelation(modelRelation);
			if (result == null)
				result = caseRelation(modelRelation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ColmenaMLIPackage.INFRASTRUCTURE_RELATION: {
			InfrastructureRelation infrastructureRelation = (InfrastructureRelation) theEObject;
			T result = caseInfrastructureRelation(infrastructureRelation);
			if (result == null)
				result = caseRelation(infrastructureRelation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Infrastructure Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Infrastructure Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfrastructureDiagram(InfrastructureDiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Microservice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Microservice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMicroservice(Microservice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Infrastructure Ms</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Infrastructure Ms</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfrastructureMs(InfrastructureMs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functional Ms</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functional Ms</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionalMs(FunctionalMs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelation(Relation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authentication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authentication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthentication(Authentication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authorization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authorization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthorization(Authorization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGateway(Gateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Config Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Config Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigServer(ConfigServer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discovery</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discovery</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscovery(Discovery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Log Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Log Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogServer(LogServer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfiguration(Configuration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Infrastructure Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Infrastructure Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfrastructureConfig(InfrastructureConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Docker Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Docker Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDockerConfig(DockerConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagrama</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagrama</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagrama(Diagrama object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Database</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Database</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabase(Database object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Environment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Environment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnvironment(Environment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelRelation(ModelRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Infrastructure Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Infrastructure Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfrastructureRelation(InfrastructureRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassDiagram(ClassDiagram object) {
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

} //ColmenaMLISwitch
