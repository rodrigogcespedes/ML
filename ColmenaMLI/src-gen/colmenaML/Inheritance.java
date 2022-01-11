/**
 */
package colmenaML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inheritance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link colmenaML.Inheritance#getOrigin <em>Origin</em>}</li>
 *   <li>{@link colmenaML.Inheritance#getDestination <em>Destination</em>}</li>
 * </ul>
 *
 * @see colmenaML.ColmenaMLPackage#getInheritance()
 * @model
 * @generated
 */
public interface Inheritance extends EObject {
	/**
	 * Returns the value of the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' reference.
	 * @see #setOrigin(Classifier)
	 * @see colmenaML.ColmenaMLPackage#getInheritance_Origin()
	 * @model
	 * @generated
	 */
	Classifier getOrigin();

	/**
	 * Sets the value of the '{@link colmenaML.Inheritance#getOrigin <em>Origin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' reference.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(Classifier value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' reference.
	 * @see #setDestination(Classifier)
	 * @see colmenaML.ColmenaMLPackage#getInheritance_Destination()
	 * @model
	 * @generated
	 */
	Classifier getDestination();

	/**
	 * Sets the value of the '{@link colmenaML.Inheritance#getDestination <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(Classifier value);

} // Inheritance
