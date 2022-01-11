/**
 */
package colmenaMLI;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see colmenaMLI.ColmenaMLIPackage
 * @generated
 */
public interface ColmenaMLIFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ColmenaMLIFactory eINSTANCE = colmenaMLI.impl.ColmenaMLIFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Infrastructure Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Infrastructure Diagram</em>'.
	 * @generated
	 */
	InfrastructureDiagram createInfrastructureDiagram();

	/**
	 * Returns a new object of class '<em>Functional Ms</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Functional Ms</em>'.
	 * @generated
	 */
	FunctionalMs createFunctionalMs();

	/**
	 * Returns a new object of class '<em>Authentication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Authentication</em>'.
	 * @generated
	 */
	Authentication createAuthentication();

	/**
	 * Returns a new object of class '<em>Authorization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Authorization</em>'.
	 * @generated
	 */
	Authorization createAuthorization();

	/**
	 * Returns a new object of class '<em>Gateway</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gateway</em>'.
	 * @generated
	 */
	Gateway createGateway();

	/**
	 * Returns a new object of class '<em>Config Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Config Server</em>'.
	 * @generated
	 */
	ConfigServer createConfigServer();

	/**
	 * Returns a new object of class '<em>Discovery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discovery</em>'.
	 * @generated
	 */
	Discovery createDiscovery();

	/**
	 * Returns a new object of class '<em>Log Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Log Server</em>'.
	 * @generated
	 */
	LogServer createLogServer();

	/**
	 * Returns a new object of class '<em>Infrastructure Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Infrastructure Config</em>'.
	 * @generated
	 */
	InfrastructureConfig createInfrastructureConfig();

	/**
	 * Returns a new object of class '<em>Docker Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Docker Config</em>'.
	 * @generated
	 */
	DockerConfig createDockerConfig();

	/**
	 * Returns a new object of class '<em>Diagrama</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagrama</em>'.
	 * @generated
	 */
	Diagrama createDiagrama();

	/**
	 * Returns a new object of class '<em>Database</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Database</em>'.
	 * @generated
	 */
	Database createDatabase();

	/**
	 * Returns a new object of class '<em>Environment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Environment</em>'.
	 * @generated
	 */
	Environment createEnvironment();

	/**
	 * Returns a new object of class '<em>Model Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Relation</em>'.
	 * @generated
	 */
	ModelRelation createModelRelation();

	/**
	 * Returns a new object of class '<em>Infrastructure Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Infrastructure Relation</em>'.
	 * @generated
	 */
	InfrastructureRelation createInfrastructureRelation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ColmenaMLIPackage getColmenaMLIPackage();

} //ColmenaMLIFactory
