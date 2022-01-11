/**
 */
package colmenaML;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contract Exposure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link colmenaML.ContractExposure#getVerbType <em>Verb Type</em>}</li>
 *   <li>{@link colmenaML.ContractExposure#getUrl <em>Url</em>}</li>
 *   <li>{@link colmenaML.ContractExposure#getContained_parameters <em>Contained parameters</em>}</li>
 *   <li>{@link colmenaML.ContractExposure#getContained_returnType <em>Contained return Type</em>}</li>
 *   <li>{@link colmenaML.ContractExposure#getName <em>Name</em>}</li>
 *   <li>{@link colmenaML.ContractExposure#isFallbackFunction <em>Fallback Function</em>}</li>
 * </ul>
 *
 * @see colmenaML.ColmenaMLPackage#getContractExposure()
 * @model
 * @generated
 */
public interface ContractExposure extends EObject {
	/**
	 * Returns the value of the '<em><b>Verb Type</b></em>' attribute.
	 * The literals are from the enumeration {@link colmenaML.HTTPVerbs}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verb Type</em>' attribute.
	 * @see colmenaML.HTTPVerbs
	 * @see #setVerbType(HTTPVerbs)
	 * @see colmenaML.ColmenaMLPackage#getContractExposure_VerbType()
	 * @model
	 * @generated
	 */
	HTTPVerbs getVerbType();

	/**
	 * Sets the value of the '{@link colmenaML.ContractExposure#getVerbType <em>Verb Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verb Type</em>' attribute.
	 * @see colmenaML.HTTPVerbs
	 * @see #getVerbType()
	 * @generated
	 */
	void setVerbType(HTTPVerbs value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see colmenaML.ColmenaMLPackage#getContractExposure_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link colmenaML.ContractExposure#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Contained parameters</b></em>' containment reference list.
	 * The list contents are of type {@link colmenaML.ExposureParameters}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained parameters</em>' containment reference list.
	 * @see colmenaML.ColmenaMLPackage#getContractExposure_Contained_parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExposureParameters> getContained_parameters();

	/**
	 * Returns the value of the '<em><b>Contained return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained return Type</em>' containment reference.
	 * @see #setContained_returnType(ExposureReturnType)
	 * @see colmenaML.ColmenaMLPackage#getContractExposure_Contained_returnType()
	 * @model containment="true"
	 * @generated
	 */
	ExposureReturnType getContained_returnType();

	/**
	 * Sets the value of the '{@link colmenaML.ContractExposure#getContained_returnType <em>Contained return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contained return Type</em>' containment reference.
	 * @see #getContained_returnType()
	 * @generated
	 */
	void setContained_returnType(ExposureReturnType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see colmenaML.ColmenaMLPackage#getContractExposure_Name()
	 * @model default=""
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link colmenaML.ContractExposure#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Fallback Function</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fallback Function</em>' attribute.
	 * @see #setFallbackFunction(boolean)
	 * @see colmenaML.ColmenaMLPackage#getContractExposure_FallbackFunction()
	 * @model default="true"
	 * @generated
	 */
	boolean isFallbackFunction();

	/**
	 * Sets the value of the '{@link colmenaML.ContractExposure#isFallbackFunction <em>Fallback Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fallback Function</em>' attribute.
	 * @see #isFallbackFunction()
	 * @generated
	 */
	void setFallbackFunction(boolean value);

} // ContractExposure
