/**
 */
package colmenaMLI;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Config Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link colmenaMLI.ConfigServer#getUsername <em>Username</em>}</li>
 *   <li>{@link colmenaMLI.ConfigServer#getPassword <em>Password</em>}</li>
 * </ul>
 *
 * @see colmenaMLI.ColmenaMLIPackage#getConfigServer()
 * @model
 * @generated
 */
public interface ConfigServer extends InfrastructureMs {
	/**
	 * Returns the value of the '<em><b>Username</b></em>' attribute.
	 * The default value is <code>"root"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Username</em>' attribute.
	 * @see #setUsername(String)
	 * @see colmenaMLI.ColmenaMLIPackage#getConfigServer_Username()
	 * @model default="root"
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link colmenaMLI.ConfigServer#getUsername <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' attribute.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * The default value is <code>"root"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see colmenaMLI.ColmenaMLIPackage#getConfigServer_Password()
	 * @model default="root"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link colmenaMLI.ConfigServer#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

} // ConfigServer
