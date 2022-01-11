/**
 */
package colmenaMLI;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discovery</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link colmenaMLI.Discovery#getDiscoveryService <em>Discovery Service</em>}</li>
 * </ul>
 *
 * @see colmenaMLI.ColmenaMLIPackage#getDiscovery()
 * @model
 * @generated
 */
public interface Discovery extends InfrastructureMs {
	/**
	 * Returns the value of the '<em><b>Discovery Service</b></em>' attribute.
	 * The literals are from the enumeration {@link colmenaMLI.DiscoveryService}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discovery Service</em>' attribute.
	 * @see colmenaMLI.DiscoveryService
	 * @see #setDiscoveryService(DiscoveryService)
	 * @see colmenaMLI.ColmenaMLIPackage#getDiscovery_DiscoveryService()
	 * @model
	 * @generated
	 */
	DiscoveryService getDiscoveryService();

	/**
	 * Sets the value of the '{@link colmenaMLI.Discovery#getDiscoveryService <em>Discovery Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discovery Service</em>' attribute.
	 * @see colmenaMLI.DiscoveryService
	 * @see #getDiscoveryService()
	 * @generated
	 */
	void setDiscoveryService(DiscoveryService value);

} // Discovery
