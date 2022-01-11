/**
 */
package colmenaML;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link colmenaML.Relation#getName <em>Name</em>}</li>
 *   <li>{@link colmenaML.Relation#getType <em>Type</em>}</li>
 *   <li>{@link colmenaML.Relation#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link colmenaML.Relation#isIsFinal <em>Is Final</em>}</li>
 *   <li>{@link colmenaML.Relation#isIsStatic <em>Is Static</em>}</li>
 *   <li>{@link colmenaML.Relation#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link colmenaML.Relation#getCrudType <em>Crud Type</em>}</li>
 *   <li>{@link colmenaML.Relation#isSubordinate <em>Subordinate</em>}</li>
 *   <li>{@link colmenaML.Relation#getAssociative_classes_contained <em>Associative classes contained</em>}</li>
 *   <li>{@link colmenaML.Relation#getDestination <em>Destination</em>}</li>
 *   <li>{@link colmenaML.Relation#getOrigin <em>Origin</em>}</li>
 * </ul>
 *
 * @see colmenaML.ColmenaMLPackage#getRelation()
 * @model
 * @generated
 */
public interface Relation extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see colmenaML.ColmenaMLPackage#getRelation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link colmenaML.Relation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link colmenaML.RelationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see colmenaML.RelationType
	 * @see #setType(RelationType)
	 * @see colmenaML.ColmenaMLPackage#getRelation_Type()
	 * @model
	 * @generated
	 */
	RelationType getType();

	/**
	 * Sets the value of the '{@link colmenaML.Relation#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see colmenaML.RelationType
	 * @see #getType()
	 * @generated
	 */
	void setType(RelationType value);

	/**
	 * Returns the value of the '<em><b>Multiplicity</b></em>' attribute.
	 * The literals are from the enumeration {@link colmenaML.RelationMultiplicity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity</em>' attribute.
	 * @see colmenaML.RelationMultiplicity
	 * @see #setMultiplicity(RelationMultiplicity)
	 * @see colmenaML.ColmenaMLPackage#getRelation_Multiplicity()
	 * @model
	 * @generated
	 */
	RelationMultiplicity getMultiplicity();

	/**
	 * Sets the value of the '{@link colmenaML.Relation#getMultiplicity <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity</em>' attribute.
	 * @see colmenaML.RelationMultiplicity
	 * @see #getMultiplicity()
	 * @generated
	 */
	void setMultiplicity(RelationMultiplicity value);

	/**
	 * Returns the value of the '<em><b>Is Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Final</em>' attribute.
	 * @see #setIsFinal(boolean)
	 * @see colmenaML.ColmenaMLPackage#getRelation_IsFinal()
	 * @model
	 * @generated
	 */
	boolean isIsFinal();

	/**
	 * Sets the value of the '{@link colmenaML.Relation#isIsFinal <em>Is Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Final</em>' attribute.
	 * @see #isIsFinal()
	 * @generated
	 */
	void setIsFinal(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Static</em>' attribute.
	 * @see #setIsStatic(boolean)
	 * @see colmenaML.ColmenaMLPackage#getRelation_IsStatic()
	 * @model
	 * @generated
	 */
	boolean isIsStatic();

	/**
	 * Sets the value of the '{@link colmenaML.Relation#isIsStatic <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Static</em>' attribute.
	 * @see #isIsStatic()
	 * @generated
	 */
	void setIsStatic(boolean value);

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link colmenaML.AccessModifiers}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see colmenaML.AccessModifiers
	 * @see #setVisibility(AccessModifiers)
	 * @see colmenaML.ColmenaMLPackage#getRelation_Visibility()
	 * @model
	 * @generated
	 */
	AccessModifiers getVisibility();

	/**
	 * Sets the value of the '{@link colmenaML.Relation#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see colmenaML.AccessModifiers
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(AccessModifiers value);

	/**
	 * Returns the value of the '<em><b>Crud Type</b></em>' attribute.
	 * The literals are from the enumeration {@link colmenaML.CRUDType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crud Type</em>' attribute.
	 * @see colmenaML.CRUDType
	 * @see #setCrudType(CRUDType)
	 * @see colmenaML.ColmenaMLPackage#getRelation_CrudType()
	 * @model
	 * @generated
	 */
	CRUDType getCrudType();

	/**
	 * Sets the value of the '{@link colmenaML.Relation#getCrudType <em>Crud Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crud Type</em>' attribute.
	 * @see colmenaML.CRUDType
	 * @see #getCrudType()
	 * @generated
	 */
	void setCrudType(CRUDType value);

	/**
	 * Returns the value of the '<em><b>Subordinate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subordinate</em>' attribute.
	 * @see #setSubordinate(boolean)
	 * @see colmenaML.ColmenaMLPackage#getRelation_Subordinate()
	 * @model
	 * @generated
	 */
	boolean isSubordinate();

	/**
	 * Sets the value of the '{@link colmenaML.Relation#isSubordinate <em>Subordinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subordinate</em>' attribute.
	 * @see #isSubordinate()
	 * @generated
	 */
	void setSubordinate(boolean value);

	/**
	 * Returns the value of the '<em><b>Associative classes contained</b></em>' containment reference list.
	 * The list contents are of type {@link colmenaML.Class}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associative classes contained</em>' containment reference list.
	 * @see colmenaML.ColmenaMLPackage#getRelation_Associative_classes_contained()
	 * @model containment="true"
	 * @generated
	 */
	EList<colmenaML.Class> getAssociative_classes_contained();

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' reference.
	 * @see #setDestination(Classifier)
	 * @see colmenaML.ColmenaMLPackage#getRelation_Destination()
	 * @model
	 * @generated
	 */
	Classifier getDestination();

	/**
	 * Sets the value of the '{@link colmenaML.Relation#getDestination <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(Classifier value);

	/**
	 * Returns the value of the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' reference.
	 * @see #setOrigin(colmenaML.Class)
	 * @see colmenaML.ColmenaMLPackage#getRelation_Origin()
	 * @model
	 * @generated
	 */
	colmenaML.Class getOrigin();

	/**
	 * Sets the value of the '{@link colmenaML.Relation#getOrigin <em>Origin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' reference.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(colmenaML.Class value);

} // Relation
