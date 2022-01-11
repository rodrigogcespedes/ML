/**
 */
package colmenaML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DTO Reference Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link colmenaML.DTOReferenceAttribute#getDestination <em>Destination</em>}</li>
 * </ul>
 *
 * @see colmenaML.ColmenaMLPackage#getDTOReferenceAttribute()
 * @model
 * @generated
 */
public interface DTOReferenceAttribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' reference.
	 * @see #setDestination(Attribute)
	 * @see colmenaML.ColmenaMLPackage#getDTOReferenceAttribute_Destination()
	 * @model
	 * @generated
	 */
	Attribute getDestination();

	/**
	 * Sets the value of the '{@link colmenaML.DTOReferenceAttribute#getDestination <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(Attribute value);

} // DTOReferenceAttribute
