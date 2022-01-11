/**
 */
package colmenaMLI;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link colmenaMLI.Database#getUsername <em>Username</em>}</li>
 *   <li>{@link colmenaMLI.Database#getPassword <em>Password</em>}</li>
 *   <li>{@link colmenaMLI.Database#getUrl <em>Url</em>}</li>
 *   <li>{@link colmenaMLI.Database#getDialect <em>Dialect</em>}</li>
 *   <li>{@link colmenaMLI.Database#getPort <em>Port</em>}</li>
 *   <li>{@link colmenaMLI.Database#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see colmenaMLI.ColmenaMLIPackage#getDatabase()
 * @model
 * @generated
 */
public interface Database extends EObject {
	/**
	 * Returns the value of the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Username</em>' attribute.
	 * @see #setUsername(String)
	 * @see colmenaMLI.ColmenaMLIPackage#getDatabase_Username()
	 * @model
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link colmenaMLI.Database#getUsername <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' attribute.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see colmenaMLI.ColmenaMLIPackage#getDatabase_Password()
	 * @model
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link colmenaMLI.Database#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see colmenaMLI.ColmenaMLIPackage#getDatabase_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link colmenaMLI.Database#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Dialect</b></em>' attribute.
	 * The literals are from the enumeration {@link colmenaMLI.DatabaseDialect}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dialect</em>' attribute.
	 * @see colmenaMLI.DatabaseDialect
	 * @see #setDialect(DatabaseDialect)
	 * @see colmenaMLI.ColmenaMLIPackage#getDatabase_Dialect()
	 * @model
	 * @generated
	 */
	DatabaseDialect getDialect();

	/**
	 * Sets the value of the '{@link colmenaMLI.Database#getDialect <em>Dialect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dialect</em>' attribute.
	 * @see colmenaMLI.DatabaseDialect
	 * @see #getDialect()
	 * @generated
	 */
	void setDialect(DatabaseDialect value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(Integer)
	 * @see colmenaMLI.ColmenaMLIPackage#getDatabase_Port()
	 * @model
	 * @generated
	 */
	Integer getPort();

	/**
	 * Sets the value of the '{@link colmenaMLI.Database#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(Integer value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see colmenaMLI.ColmenaMLIPackage#getDatabase_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link colmenaMLI.Database#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Database
