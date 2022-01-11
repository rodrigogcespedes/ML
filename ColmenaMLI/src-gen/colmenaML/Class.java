/**
 */
package colmenaML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link colmenaML.Class#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link colmenaML.Class#isIsAssociative <em>Is Associative</em>}</li>
 *   <li>{@link colmenaML.Class#isIsAuditable <em>Is Auditable</em>}</li>
 *   <li>{@link colmenaML.Class#getCrudType <em>Crud Type</em>}</li>
 *   <li>{@link colmenaML.Class#getContained_relations <em>Contained relations</em>}</li>
 *   <li>{@link colmenaML.Class#getContained_implementations <em>Contained implementations</em>}</li>
 * </ul>
 *
 * @see colmenaML.ColmenaMLPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends Classifier {
	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(boolean)
	 * @see colmenaML.ColmenaMLPackage#getClass_IsAbstract()
	 * @model
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link colmenaML.Class#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isIsAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Associative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Associative</em>' attribute.
	 * @see #setIsAssociative(boolean)
	 * @see colmenaML.ColmenaMLPackage#getClass_IsAssociative()
	 * @model
	 * @generated
	 */
	boolean isIsAssociative();

	/**
	 * Sets the value of the '{@link colmenaML.Class#isIsAssociative <em>Is Associative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Associative</em>' attribute.
	 * @see #isIsAssociative()
	 * @generated
	 */
	void setIsAssociative(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Auditable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Auditable</em>' attribute.
	 * @see #setIsAuditable(boolean)
	 * @see colmenaML.ColmenaMLPackage#getClass_IsAuditable()
	 * @model
	 * @generated
	 */
	boolean isIsAuditable();

	/**
	 * Sets the value of the '{@link colmenaML.Class#isIsAuditable <em>Is Auditable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Auditable</em>' attribute.
	 * @see #isIsAuditable()
	 * @generated
	 */
	void setIsAuditable(boolean value);

	/**
	 * Returns the value of the '<em><b>Crud Type</b></em>' attribute.
	 * The literals are from the enumeration {@link colmenaML.CRUDType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crud Type</em>' attribute.
	 * @see colmenaML.CRUDType
	 * @see #setCrudType(CRUDType)
	 * @see colmenaML.ColmenaMLPackage#getClass_CrudType()
	 * @model
	 * @generated
	 */
	CRUDType getCrudType();

	/**
	 * Sets the value of the '{@link colmenaML.Class#getCrudType <em>Crud Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crud Type</em>' attribute.
	 * @see colmenaML.CRUDType
	 * @see #getCrudType()
	 * @generated
	 */
	void setCrudType(CRUDType value);

	/**
	 * Returns the value of the '<em><b>Contained relations</b></em>' containment reference list.
	 * The list contents are of type {@link colmenaML.Relation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained relations</em>' containment reference list.
	 * @see colmenaML.ColmenaMLPackage#getClass_Contained_relations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relation> getContained_relations();

	/**
	 * Returns the value of the '<em><b>Contained implementations</b></em>' containment reference list.
	 * The list contents are of type {@link colmenaML.Implementation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained implementations</em>' containment reference list.
	 * @see colmenaML.ColmenaMLPackage#getClass_Contained_implementations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Implementation> getContained_implementations();

} // Class
