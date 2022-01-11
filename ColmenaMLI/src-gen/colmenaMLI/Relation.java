/**
 */
package colmenaMLI;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link colmenaMLI.Relation#getDestination <em>Destination</em>}</li>
 *   <li>{@link colmenaMLI.Relation#getOrigin <em>Origin</em>}</li>
 *   <li>{@link colmenaMLI.Relation#getRelationType <em>Relation Type</em>}</li>
 * </ul>
 *
 * @see colmenaMLI.ColmenaMLIPackage#getRelation()
 * @model abstract="true"
 * @generated
 */
public interface Relation extends EObject {
	/**
	 * Returns the value of the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' reference.
	 * @see #setDestination(Microservice)
	 * @see colmenaMLI.ColmenaMLIPackage#getRelation_Destination()
	 * @model
	 * @generated
	 */
	Microservice getDestination();

	/**
	 * Sets the value of the '{@link colmenaMLI.Relation#getDestination <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(Microservice value);

	/**
	 * Returns the value of the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' reference.
	 * @see #setOrigin(Microservice)
	 * @see colmenaMLI.ColmenaMLIPackage#getRelation_Origin()
	 * @model
	 * @generated
	 */
	Microservice getOrigin();

	/**
	 * Sets the value of the '{@link colmenaMLI.Relation#getOrigin <em>Origin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' reference.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(Microservice value);

	/**
	 * Returns the value of the '<em><b>Relation Type</b></em>' attribute.
	 * The literals are from the enumeration {@link colmenaMLI.RelationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation Type</em>' attribute.
	 * @see colmenaMLI.RelationType
	 * @see #setRelationType(RelationType)
	 * @see colmenaMLI.ColmenaMLIPackage#getRelation_RelationType()
	 * @model
	 * @generated
	 */
	RelationType getRelationType();

	/**
	 * Sets the value of the '{@link colmenaMLI.Relation#getRelationType <em>Relation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation Type</em>' attribute.
	 * @see colmenaMLI.RelationType
	 * @see #getRelationType()
	 * @generated
	 */
	void setRelationType(RelationType value);

} // Relation
