/**
 */
package colmenaMLI;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Docker Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link colmenaMLI.DockerConfig#getInnerPort <em>Inner Port</em>}</li>
 *   <li>{@link colmenaMLI.DockerConfig#getExposePort <em>Expose Port</em>}</li>
 *   <li>{@link colmenaMLI.DockerConfig#getDockerBaseImage <em>Docker Base Image</em>}</li>
 * </ul>
 *
 * @see colmenaMLI.ColmenaMLIPackage#getDockerConfig()
 * @model
 * @generated
 */
public interface DockerConfig extends Configuration {
	/**
	 * Returns the value of the '<em><b>Inner Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Port</em>' attribute.
	 * @see #setInnerPort(Integer)
	 * @see colmenaMLI.ColmenaMLIPackage#getDockerConfig_InnerPort()
	 * @model
	 * @generated
	 */
	Integer getInnerPort();

	/**
	 * Sets the value of the '{@link colmenaMLI.DockerConfig#getInnerPort <em>Inner Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner Port</em>' attribute.
	 * @see #getInnerPort()
	 * @generated
	 */
	void setInnerPort(Integer value);

	/**
	 * Returns the value of the '<em><b>Expose Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expose Port</em>' attribute.
	 * @see #setExposePort(Integer)
	 * @see colmenaMLI.ColmenaMLIPackage#getDockerConfig_ExposePort()
	 * @model
	 * @generated
	 */
	Integer getExposePort();

	/**
	 * Sets the value of the '{@link colmenaMLI.DockerConfig#getExposePort <em>Expose Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expose Port</em>' attribute.
	 * @see #getExposePort()
	 * @generated
	 */
	void setExposePort(Integer value);

	/**
	 * Returns the value of the '<em><b>Docker Base Image</b></em>' attribute.
	 * The literals are from the enumeration {@link colmenaMLI.DockerImage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Docker Base Image</em>' attribute.
	 * @see colmenaMLI.DockerImage
	 * @see #setDockerBaseImage(DockerImage)
	 * @see colmenaMLI.ColmenaMLIPackage#getDockerConfig_DockerBaseImage()
	 * @model
	 * @generated
	 */
	DockerImage getDockerBaseImage();

	/**
	 * Sets the value of the '{@link colmenaMLI.DockerConfig#getDockerBaseImage <em>Docker Base Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Docker Base Image</em>' attribute.
	 * @see colmenaMLI.DockerImage
	 * @see #getDockerBaseImage()
	 * @generated
	 */
	void setDockerBaseImage(DockerImage value);

} // DockerConfig
