/**
 */
package colmenaML;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link colmenaML.Package#getName <em>Name</em>}</li>
 *   <li>{@link colmenaML.Package#getContained_classifiers <em>Contained classifiers</em>}</li>
 * </ul>
 *
 * @see colmenaML.ColmenaMLPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see colmenaML.ColmenaMLPackage#getPackage_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link colmenaML.Package#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Contained classifiers</b></em>' containment reference list.
	 * The list contents are of type {@link colmenaML.Classifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained classifiers</em>' containment reference list.
	 * @see colmenaML.ColmenaMLPackage#getPackage_Contained_classifiers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Classifier> getContained_classifiers();

} // Package
