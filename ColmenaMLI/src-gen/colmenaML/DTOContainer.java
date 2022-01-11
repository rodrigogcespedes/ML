/**
 */
package colmenaML;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DTO Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link colmenaML.DTOContainer#getContained_dtos <em>Contained dtos</em>}</li>
 *   <li>{@link colmenaML.DTOContainer#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see colmenaML.ColmenaMLPackage#getDTOContainer()
 * @model
 * @generated
 */
public interface DTOContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Contained dtos</b></em>' containment reference list.
	 * The list contents are of type {@link colmenaML.DTO}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained dtos</em>' containment reference list.
	 * @see colmenaML.ColmenaMLPackage#getDTOContainer_Contained_dtos()
	 * @model containment="true"
	 * @generated
	 */
	EList<DTO> getContained_dtos();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see colmenaML.ColmenaMLPackage#getDTOContainer_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link colmenaML.DTOContainer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // DTOContainer
