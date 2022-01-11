/**
 */
package colmenaML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link colmenaML.Attribute#getType <em>Type</em>}</li>
 *   <li>{@link colmenaML.Attribute#isIsAuditable <em>Is Auditable</em>}</li>
 *   <li>{@link colmenaML.Attribute#getPseudonym <em>Pseudonym</em>}</li>
 *   <li>{@link colmenaML.Attribute#getGraphicRepresentation <em>Graphic Representation</em>}</li>
 * </ul>
 *
 * @see colmenaML.ColmenaMLPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends Returnable {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link colmenaML.DataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see colmenaML.DataType
	 * @see #setType(DataType)
	 * @see colmenaML.ColmenaMLPackage#getAttribute_Type()
	 * @model
	 * @generated
	 */
	DataType getType();

	/**
	 * Sets the value of the '{@link colmenaML.Attribute#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see colmenaML.DataType
	 * @see #getType()
	 * @generated
	 */
	void setType(DataType value);

	/**
	 * Returns the value of the '<em><b>Is Auditable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Auditable</em>' attribute.
	 * @see #setIsAuditable(boolean)
	 * @see colmenaML.ColmenaMLPackage#getAttribute_IsAuditable()
	 * @model
	 * @generated
	 */
	boolean isIsAuditable();

	/**
	 * Sets the value of the '{@link colmenaML.Attribute#isIsAuditable <em>Is Auditable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Auditable</em>' attribute.
	 * @see #isIsAuditable()
	 * @generated
	 */
	void setIsAuditable(boolean value);

	/**
	 * Returns the value of the '<em><b>Pseudonym</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pseudonym</em>' attribute.
	 * @see #setPseudonym(String)
	 * @see colmenaML.ColmenaMLPackage#getAttribute_Pseudonym()
	 * @model
	 * @generated
	 */
	String getPseudonym();

	/**
	 * Sets the value of the '{@link colmenaML.Attribute#getPseudonym <em>Pseudonym</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pseudonym</em>' attribute.
	 * @see #getPseudonym()
	 * @generated
	 */
	void setPseudonym(String value);

	/**
	 * Returns the value of the '<em><b>Graphic Representation</b></em>' attribute.
	 * The literals are from the enumeration {@link colmenaML.GraphicRepresentation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graphic Representation</em>' attribute.
	 * @see colmenaML.GraphicRepresentation
	 * @see #setGraphicRepresentation(GraphicRepresentation)
	 * @see colmenaML.ColmenaMLPackage#getAttribute_GraphicRepresentation()
	 * @model
	 * @generated
	 */
	GraphicRepresentation getGraphicRepresentation();

	/**
	 * Sets the value of the '{@link colmenaML.Attribute#getGraphicRepresentation <em>Graphic Representation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graphic Representation</em>' attribute.
	 * @see colmenaML.GraphicRepresentation
	 * @see #getGraphicRepresentation()
	 * @generated
	 */
	void setGraphicRepresentation(GraphicRepresentation value);

} // Attribute
