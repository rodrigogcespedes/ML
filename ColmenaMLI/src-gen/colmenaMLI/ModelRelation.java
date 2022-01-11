/**
 */
package colmenaMLI;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link colmenaMLI.ModelRelation#getClassesRelation <em>Classes Relation</em>}</li>
 * </ul>
 *
 * @see colmenaMLI.ColmenaMLIPackage#getModelRelation()
 * @model
 * @generated
 */
public interface ModelRelation extends Relation {
	/**
	 * Returns the value of the '<em><b>Classes Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes Relation</em>' reference.
	 * @see #setClassesRelation(colmenaML.Relation)
	 * @see colmenaMLI.ColmenaMLIPackage#getModelRelation_ClassesRelation()
	 * @model
	 * @generated
	 */
	colmenaML.Relation getClassesRelation();

	/**
	 * Sets the value of the '{@link colmenaMLI.ModelRelation#getClassesRelation <em>Classes Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classes Relation</em>' reference.
	 * @see #getClassesRelation()
	 * @generated
	 */
	void setClassesRelation(colmenaML.Relation value);

} // ModelRelation
