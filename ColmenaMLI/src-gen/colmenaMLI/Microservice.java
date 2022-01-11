/**
 */
package colmenaMLI;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Microservice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link colmenaMLI.Microservice#getName <em>Name</em>}</li>
 *   <li>{@link colmenaMLI.Microservice#getLangType <em>Lang Type</em>}</li>
 *   <li>{@link colmenaMLI.Microservice#getContained_relations <em>Contained relations</em>}</li>
 *   <li>{@link colmenaMLI.Microservice#getArtifactId <em>Artifact Id</em>}</li>
 *   <li>{@link colmenaMLI.Microservice#getVersion <em>Version</em>}</li>
 *   <li>{@link colmenaMLI.Microservice#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link colmenaMLI.Microservice#getDescription <em>Description</em>}</li>
 *   <li>{@link colmenaMLI.Microservice#getDatabase <em>Database</em>}</li>
 *   <li>{@link colmenaMLI.Microservice#getPort <em>Port</em>}</li>
 *   <li>{@link colmenaMLI.Microservice#getIp <em>Ip</em>}</li>
 * </ul>
 *
 * @see colmenaMLI.ColmenaMLIPackage#getMicroservice()
 * @model abstract="true"
 * @generated
 */
public interface Microservice extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see colmenaMLI.ColmenaMLIPackage#getMicroservice_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link colmenaMLI.Microservice#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Lang Type</b></em>' attribute.
	 * The literals are from the enumeration {@link colmenaMLI.Language}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lang Type</em>' attribute.
	 * @see colmenaMLI.Language
	 * @see #setLangType(Language)
	 * @see colmenaMLI.ColmenaMLIPackage#getMicroservice_LangType()
	 * @model
	 * @generated
	 */
	Language getLangType();

	/**
	 * Sets the value of the '{@link colmenaMLI.Microservice#getLangType <em>Lang Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang Type</em>' attribute.
	 * @see colmenaMLI.Language
	 * @see #getLangType()
	 * @generated
	 */
	void setLangType(Language value);

	/**
	 * Returns the value of the '<em><b>Contained relations</b></em>' containment reference list.
	 * The list contents are of type {@link colmenaMLI.Relation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained relations</em>' containment reference list.
	 * @see colmenaMLI.ColmenaMLIPackage#getMicroservice_Contained_relations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relation> getContained_relations();

	/**
	 * Returns the value of the '<em><b>Artifact Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact Id</em>' attribute.
	 * @see #setArtifactId(String)
	 * @see colmenaMLI.ColmenaMLIPackage#getMicroservice_ArtifactId()
	 * @model
	 * @generated
	 */
	String getArtifactId();

	/**
	 * Sets the value of the '{@link colmenaMLI.Microservice#getArtifactId <em>Artifact Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact Id</em>' attribute.
	 * @see #getArtifactId()
	 * @generated
	 */
	void setArtifactId(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see colmenaMLI.ColmenaMLIPackage#getMicroservice_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link colmenaMLI.Microservice#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Id</em>' attribute.
	 * @see #setGroupId(String)
	 * @see colmenaMLI.ColmenaMLIPackage#getMicroservice_GroupId()
	 * @model
	 * @generated
	 */
	String getGroupId();

	/**
	 * Sets the value of the '{@link colmenaMLI.Microservice#getGroupId <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Id</em>' attribute.
	 * @see #getGroupId()
	 * @generated
	 */
	void setGroupId(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see colmenaMLI.ColmenaMLIPackage#getMicroservice_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link colmenaMLI.Microservice#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Database</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database</em>' containment reference.
	 * @see #setDatabase(Database)
	 * @see colmenaMLI.ColmenaMLIPackage#getMicroservice_Database()
	 * @model containment="true"
	 * @generated
	 */
	Database getDatabase();

	/**
	 * Sets the value of the '{@link colmenaMLI.Microservice#getDatabase <em>Database</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database</em>' containment reference.
	 * @see #getDatabase()
	 * @generated
	 */
	void setDatabase(Database value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * The default value is <code>"8080"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(Integer)
	 * @see colmenaMLI.ColmenaMLIPackage#getMicroservice_Port()
	 * @model default="8080"
	 * @generated
	 */
	Integer getPort();

	/**
	 * Sets the value of the '{@link colmenaMLI.Microservice#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(Integer value);

	/**
	 * Returns the value of the '<em><b>Ip</b></em>' attribute.
	 * The default value is <code>"localhost"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ip</em>' attribute.
	 * @see #setIp(String)
	 * @see colmenaMLI.ColmenaMLIPackage#getMicroservice_Ip()
	 * @model default="localhost"
	 * @generated
	 */
	String getIp();

	/**
	 * Sets the value of the '{@link colmenaMLI.Microservice#getIp <em>Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip</em>' attribute.
	 * @see #getIp()
	 * @generated
	 */
	void setIp(String value);

} // Microservice
