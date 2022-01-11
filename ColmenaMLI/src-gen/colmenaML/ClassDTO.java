/**
 */
package colmenaML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class DTO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link colmenaML.ClassDTO#getReference_class <em>Reference class</em>}</li>
 * </ul>
 *
 * @see colmenaML.ColmenaMLPackage#getClassDTO()
 * @model
 * @generated
 */
public interface ClassDTO extends DTO {
	/**
	 * Returns the value of the '<em><b>Reference class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference class</em>' reference.
	 * @see #setReference_class(colmenaML.Class)
	 * @see colmenaML.ColmenaMLPackage#getClassDTO_Reference_class()
	 * @model required="true"
	 * @generated
	 */
	colmenaML.Class getReference_class();

	/**
	 * Sets the value of the '{@link colmenaML.ClassDTO#getReference_class <em>Reference class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference class</em>' reference.
	 * @see #getReference_class()
	 * @generated
	 */
	void setReference_class(colmenaML.Class value);

} // ClassDTO
