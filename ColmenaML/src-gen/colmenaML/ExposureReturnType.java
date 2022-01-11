/**
 */
package colmenaML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exposure Return Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link colmenaML.ExposureReturnType#getDto <em>Dto</em>}</li>
 * </ul>
 *
 * @see colmenaML.ColmenaMLPackage#getExposureReturnType()
 * @model
 * @generated
 */
public interface ExposureReturnType extends EObject {
	/**
	 * Returns the value of the '<em><b>Dto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dto</em>' reference.
	 * @see #setDto(DTO)
	 * @see colmenaML.ColmenaMLPackage#getExposureReturnType_Dto()
	 * @model required="true"
	 * @generated
	 */
	DTO getDto();

	/**
	 * Sets the value of the '{@link colmenaML.ExposureReturnType#getDto <em>Dto</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dto</em>' reference.
	 * @see #getDto()
	 * @generated
	 */
	void setDto(DTO value);

} // ExposureReturnType
