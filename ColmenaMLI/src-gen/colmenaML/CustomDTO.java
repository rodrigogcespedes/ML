/**
 */
package colmenaML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom DTO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link colmenaML.CustomDTO#getContained_custom_attributes <em>Contained custom attributes</em>}</li>
 *   <li>{@link colmenaML.CustomDTO#getContained_reference_attributes <em>Contained reference attributes</em>}</li>
 * </ul>
 *
 * @see colmenaML.ColmenaMLPackage#getCustomDTO()
 * @model
 * @generated
 */
public interface CustomDTO extends DTO {
	/**
	 * Returns the value of the '<em><b>Contained custom attributes</b></em>' containment reference list.
	 * The list contents are of type {@link colmenaML.DTOCustomAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained custom attributes</em>' containment reference list.
	 * @see colmenaML.ColmenaMLPackage#getCustomDTO_Contained_custom_attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<DTOCustomAttribute> getContained_custom_attributes();

	/**
	 * Returns the value of the '<em><b>Contained reference attributes</b></em>' containment reference list.
	 * The list contents are of type {@link colmenaML.DTOReferenceAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained reference attributes</em>' containment reference list.
	 * @see colmenaML.ColmenaMLPackage#getCustomDTO_Contained_reference_attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<DTOReferenceAttribute> getContained_reference_attributes();

} // CustomDTO
