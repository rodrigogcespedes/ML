/**
 */
package colmenaML;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link colmenaML.ClassDiagram#getContained_contracts <em>Contained contracts</em>}</li>
 *   <li>{@link colmenaML.ClassDiagram#getContained_packages <em>Contained packages</em>}</li>
 *   <li>{@link colmenaML.ClassDiagram#getContained_dtoContainers <em>Contained dto Containers</em>}</li>
 * </ul>
 *
 * @see colmenaML.ColmenaMLPackage#getClassDiagram()
 * @model
 * @generated
 */
public interface ClassDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Contained contracts</b></em>' containment reference list.
	 * The list contents are of type {@link colmenaML.Contract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained contracts</em>' containment reference list.
	 * @see colmenaML.ColmenaMLPackage#getClassDiagram_Contained_contracts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Contract> getContained_contracts();

	/**
	 * Returns the value of the '<em><b>Contained packages</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained packages</em>' containment reference.
	 * @see #setContained_packages(colmenaML.Package)
	 * @see colmenaML.ColmenaMLPackage#getClassDiagram_Contained_packages()
	 * @model containment="true"
	 * @generated
	 */
	colmenaML.Package getContained_packages();

	/**
	 * Sets the value of the '{@link colmenaML.ClassDiagram#getContained_packages <em>Contained packages</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contained packages</em>' containment reference.
	 * @see #getContained_packages()
	 * @generated
	 */
	void setContained_packages(colmenaML.Package value);

	/**
	 * Returns the value of the '<em><b>Contained dto Containers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained dto Containers</em>' containment reference.
	 * @see #setContained_dtoContainers(DTOContainer)
	 * @see colmenaML.ColmenaMLPackage#getClassDiagram_Contained_dtoContainers()
	 * @model containment="true"
	 * @generated
	 */
	DTOContainer getContained_dtoContainers();

	/**
	 * Sets the value of the '{@link colmenaML.ClassDiagram#getContained_dtoContainers <em>Contained dto Containers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contained dto Containers</em>' containment reference.
	 * @see #getContained_dtoContainers()
	 * @generated
	 */
	void setContained_dtoContainers(DTOContainer value);

} // ClassDiagram
