/**
 */
package colmenaML;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link colmenaML.Classifier#getName <em>Name</em>}</li>
 *   <li>{@link colmenaML.Classifier#getContained_operations <em>Contained operations</em>}</li>
 *   <li>{@link colmenaML.Classifier#getContained_attributes <em>Contained attributes</em>}</li>
 *   <li>{@link colmenaML.Classifier#getContained_inheritances <em>Contained inheritances</em>}</li>
 * </ul>
 *
 * @see colmenaML.ColmenaMLPackage#getClassifier()
 * @model abstract="true"
 * @generated
 */
public interface Classifier extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see colmenaML.ColmenaMLPackage#getClassifier_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link colmenaML.Classifier#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Contained operations</b></em>' containment reference list.
	 * The list contents are of type {@link colmenaML.Operation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained operations</em>' containment reference list.
	 * @see colmenaML.ColmenaMLPackage#getClassifier_Contained_operations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operation> getContained_operations();

	/**
	 * Returns the value of the '<em><b>Contained attributes</b></em>' containment reference list.
	 * The list contents are of type {@link colmenaML.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained attributes</em>' containment reference list.
	 * @see colmenaML.ColmenaMLPackage#getClassifier_Contained_attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getContained_attributes();

	/**
	 * Returns the value of the '<em><b>Contained inheritances</b></em>' containment reference list.
	 * The list contents are of type {@link colmenaML.Inheritance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained inheritances</em>' containment reference list.
	 * @see colmenaML.ColmenaMLPackage#getClassifier_Contained_inheritances()
	 * @model containment="true"
	 * @generated
	 */
	EList<Inheritance> getContained_inheritances();

} // Classifier
