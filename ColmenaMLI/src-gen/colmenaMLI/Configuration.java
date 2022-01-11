/**
 */
package colmenaMLI;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link colmenaMLI.Configuration#getNetwork <em>Network</em>}</li>
 *   <li>{@link colmenaMLI.Configuration#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link colmenaMLI.Configuration#getRestartType <em>Restart Type</em>}</li>
 *   <li>{@link colmenaMLI.Configuration#getMicroservice <em>Microservice</em>}</li>
 * </ul>
 *
 * @see colmenaMLI.ColmenaMLIPackage#getConfiguration()
 * @model abstract="true"
 * @generated
 */
public interface Configuration extends EObject {
	/**
	 * Returns the value of the '<em><b>Network</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network</em>' attribute.
	 * @see #setNetwork(String)
	 * @see colmenaMLI.ColmenaMLIPackage#getConfiguration_Network()
	 * @model
	 * @generated
	 */
	String getNetwork();

	/**
	 * Sets the value of the '{@link colmenaMLI.Configuration#getNetwork <em>Network</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network</em>' attribute.
	 * @see #getNetwork()
	 * @generated
	 */
	void setNetwork(String value);

	/**
	 * Returns the value of the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' attribute.
	 * @see #setEnvironment(String)
	 * @see colmenaMLI.ColmenaMLIPackage#getConfiguration_Environment()
	 * @model
	 * @generated
	 */
	String getEnvironment();

	/**
	 * Sets the value of the '{@link colmenaMLI.Configuration#getEnvironment <em>Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' attribute.
	 * @see #getEnvironment()
	 * @generated
	 */
	void setEnvironment(String value);

	/**
	 * Returns the value of the '<em><b>Restart Type</b></em>' attribute.
	 * The literals are from the enumeration {@link colmenaMLI.RestartType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restart Type</em>' attribute.
	 * @see colmenaMLI.RestartType
	 * @see #setRestartType(RestartType)
	 * @see colmenaMLI.ColmenaMLIPackage#getConfiguration_RestartType()
	 * @model
	 * @generated
	 */
	RestartType getRestartType();

	/**
	 * Sets the value of the '{@link colmenaMLI.Configuration#getRestartType <em>Restart Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restart Type</em>' attribute.
	 * @see colmenaMLI.RestartType
	 * @see #getRestartType()
	 * @generated
	 */
	void setRestartType(RestartType value);

	/**
	 * Returns the value of the '<em><b>Microservice</b></em>' containment reference list.
	 * The list contents are of type {@link colmenaMLI.Microservice}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Microservice</em>' containment reference list.
	 * @see colmenaMLI.ColmenaMLIPackage#getConfiguration_Microservice()
	 * @model containment="true"
	 * @generated
	 */
	EList<Microservice> getMicroservice();

} // Configuration
