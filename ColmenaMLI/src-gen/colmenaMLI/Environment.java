/**
 */
package colmenaMLI;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link colmenaMLI.Environment#getContained_microservices <em>Contained microservices</em>}</li>
 *   <li>{@link colmenaMLI.Environment#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see colmenaMLI.ColmenaMLIPackage#getEnvironment()
 * @model
 * @generated
 */
public interface Environment extends EObject {
	/**
	 * Returns the value of the '<em><b>Contained microservices</b></em>' containment reference list.
	 * The list contents are of type {@link colmenaMLI.Microservice}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained microservices</em>' containment reference list.
	 * @see colmenaMLI.ColmenaMLIPackage#getEnvironment_Contained_microservices()
	 * @model containment="true"
	 * @generated
	 */
	EList<Microservice> getContained_microservices();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see colmenaMLI.ColmenaMLIPackage#getEnvironment_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link colmenaMLI.Environment#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Environment
