/**
 */
package colmenaMLI;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Infrastructure Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link colmenaMLI.InfrastructureDiagram#getContained_configurations <em>Contained configurations</em>}</li>
 *   <li>{@link colmenaMLI.InfrastructureDiagram#getContained_environments <em>Contained environments</em>}</li>
 * </ul>
 *
 * @see colmenaMLI.ColmenaMLIPackage#getInfrastructureDiagram()
 * @model
 * @generated
 */
public interface InfrastructureDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Contained configurations</b></em>' containment reference list.
	 * The list contents are of type {@link colmenaMLI.Configuration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained configurations</em>' containment reference list.
	 * @see colmenaMLI.ColmenaMLIPackage#getInfrastructureDiagram_Contained_configurations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Configuration> getContained_configurations();

	/**
	 * Returns the value of the '<em><b>Contained environments</b></em>' containment reference list.
	 * The list contents are of type {@link colmenaMLI.Environment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained environments</em>' containment reference list.
	 * @see colmenaMLI.ColmenaMLIPackage#getInfrastructureDiagram_Contained_environments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Environment> getContained_environments();

} // InfrastructureDiagram
