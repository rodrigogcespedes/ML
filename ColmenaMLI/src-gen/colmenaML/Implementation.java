/**
 */
package colmenaML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link colmenaML.Implementation#getOrigin <em>Origin</em>}</li>
 *   <li>{@link colmenaML.Implementation#getDestination <em>Destination</em>}</li>
 * </ul>
 *
 * @see colmenaML.ColmenaMLPackage#getImplementation()
 * @model
 * @generated
 */
public interface Implementation extends EObject {
	/**
	 * Returns the value of the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' reference.
	 * @see #setOrigin(colmenaML.Class)
	 * @see colmenaML.ColmenaMLPackage#getImplementation_Origin()
	 * @model
	 * @generated
	 */
	colmenaML.Class getOrigin();

	/**
	 * Sets the value of the '{@link colmenaML.Implementation#getOrigin <em>Origin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' reference.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(colmenaML.Class value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' reference.
	 * @see #setDestination(Interface)
	 * @see colmenaML.ColmenaMLPackage#getImplementation_Destination()
	 * @model
	 * @generated
	 */
	Interface getDestination();

	/**
	 * Sets the value of the '{@link colmenaML.Implementation#getDestination <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(Interface value);

} // Implementation
