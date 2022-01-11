/**
 */
package colmenaML;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contract</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link colmenaML.Contract#getName <em>Name</em>}</li>
 *   <li>{@link colmenaML.Contract#getVerbs_offered <em>Verbs offered</em>}</li>
 *   <li>{@link colmenaML.Contract#getMain_class <em>Main class</em>}</li>
 *   <li>{@link colmenaML.Contract#isCrudMethods <em>Crud Methods</em>}</li>
 * </ul>
 *
 * @see colmenaML.ColmenaMLPackage#getContract()
 * @model
 * @generated
 */
public interface Contract extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see colmenaML.ColmenaMLPackage#getContract_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link colmenaML.Contract#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Verbs offered</b></em>' containment reference list.
	 * The list contents are of type {@link colmenaML.ContractExposure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verbs offered</em>' containment reference list.
	 * @see colmenaML.ColmenaMLPackage#getContract_Verbs_offered()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContractExposure> getVerbs_offered();

	/**
	 * Returns the value of the '<em><b>Main class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main class</em>' reference.
	 * @see #setMain_class(colmenaML.Class)
	 * @see colmenaML.ColmenaMLPackage#getContract_Main_class()
	 * @model
	 * @generated
	 */
	colmenaML.Class getMain_class();

	/**
	 * Sets the value of the '{@link colmenaML.Contract#getMain_class <em>Main class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main class</em>' reference.
	 * @see #getMain_class()
	 * @generated
	 */
	void setMain_class(colmenaML.Class value);

	/**
	 * Returns the value of the '<em><b>Crud Methods</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crud Methods</em>' attribute.
	 * @see #setCrudMethods(boolean)
	 * @see colmenaML.ColmenaMLPackage#getContract_CrudMethods()
	 * @model default="true"
	 * @generated
	 */
	boolean isCrudMethods();

	/**
	 * Sets the value of the '{@link colmenaML.Contract#isCrudMethods <em>Crud Methods</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crud Methods</em>' attribute.
	 * @see #isCrudMethods()
	 * @generated
	 */
	void setCrudMethods(boolean value);

} // Contract
