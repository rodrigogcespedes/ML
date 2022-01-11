/**
 */
package colmenaMLI;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gateway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link colmenaMLI.Gateway#getGatewayService <em>Gateway Service</em>}</li>
 * </ul>
 *
 * @see colmenaMLI.ColmenaMLIPackage#getGateway()
 * @model
 * @generated
 */
public interface Gateway extends InfrastructureMs {
	/**
	 * Returns the value of the '<em><b>Gateway Service</b></em>' attribute.
	 * The literals are from the enumeration {@link colmenaMLI.GatewayService}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gateway Service</em>' attribute.
	 * @see colmenaMLI.GatewayService
	 * @see #setGatewayService(GatewayService)
	 * @see colmenaMLI.ColmenaMLIPackage#getGateway_GatewayService()
	 * @model
	 * @generated
	 */
	GatewayService getGatewayService();

	/**
	 * Sets the value of the '{@link colmenaMLI.Gateway#getGatewayService <em>Gateway Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gateway Service</em>' attribute.
	 * @see colmenaMLI.GatewayService
	 * @see #getGatewayService()
	 * @generated
	 */
	void setGatewayService(GatewayService value);

} // Gateway
