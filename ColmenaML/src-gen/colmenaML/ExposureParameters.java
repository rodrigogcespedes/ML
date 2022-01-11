/**
 */
package colmenaML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exposure Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link colmenaML.ExposureParameters#getDto <em>Dto</em>}</li>
 * </ul>
 *
 * @see colmenaML.ColmenaMLPackage#getExposureParameters()
 * @model
 * @generated
 */
public interface ExposureParameters extends EObject {
	/**
	 * Returns the value of the '<em><b>Dto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dto</em>' reference.
	 * @see #setDto(DTO)
	 * @see colmenaML.ColmenaMLPackage#getExposureParameters_Dto()
	 * @model required="true"
	 * @generated
	 */
	DTO getDto();

	/**
	 * Sets the value of the '{@link colmenaML.ExposureParameters#getDto <em>Dto</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dto</em>' reference.
	 * @see #getDto()
	 * @generated
	 */
	void setDto(DTO value);

} // ExposureParameters
