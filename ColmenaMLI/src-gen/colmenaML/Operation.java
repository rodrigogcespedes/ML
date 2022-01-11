/**
 */
package colmenaML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link colmenaML.Operation#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link colmenaML.Operation#isIsAbstract <em>Is Abstract</em>}</li>
 * </ul>
 *
 * @see colmenaML.ColmenaMLPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends Returnable {
	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' attribute.
	 * The literals are from the enumeration {@link colmenaML.ReturnType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' attribute.
	 * @see colmenaML.ReturnType
	 * @see #setReturnType(ReturnType)
	 * @see colmenaML.ColmenaMLPackage#getOperation_ReturnType()
	 * @model
	 * @generated
	 */
	ReturnType getReturnType();

	/**
	 * Sets the value of the '{@link colmenaML.Operation#getReturnType <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' attribute.
	 * @see colmenaML.ReturnType
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(ReturnType value);

	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(boolean)
	 * @see colmenaML.ColmenaMLPackage#getOperation_IsAbstract()
	 * @model
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link colmenaML.Operation#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isIsAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);

} // Operation
