/**
 */
package colmenaMLI;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functional Ms</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link colmenaMLI.FunctionalMs#getPorpertiesSyntax <em>Porperties Syntax</em>}</li>
 *   <li>{@link colmenaMLI.FunctionalMs#getDependenciesManager <em>Dependencies Manager</em>}</li>
 * </ul>
 *
 * @see colmenaMLI.ColmenaMLIPackage#getFunctionalMs()
 * @model
 * @generated
 */
public interface FunctionalMs extends Microservice, Diagrama {
	/**
	 * Returns the value of the '<em><b>Porperties Syntax</b></em>' attribute.
	 * The literals are from the enumeration {@link colmenaMLI.PropertiesSyntax}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Porperties Syntax</em>' attribute.
	 * @see colmenaMLI.PropertiesSyntax
	 * @see #setPorpertiesSyntax(PropertiesSyntax)
	 * @see colmenaMLI.ColmenaMLIPackage#getFunctionalMs_PorpertiesSyntax()
	 * @model
	 * @generated
	 */
	PropertiesSyntax getPorpertiesSyntax();

	/**
	 * Sets the value of the '{@link colmenaMLI.FunctionalMs#getPorpertiesSyntax <em>Porperties Syntax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Porperties Syntax</em>' attribute.
	 * @see colmenaMLI.PropertiesSyntax
	 * @see #getPorpertiesSyntax()
	 * @generated
	 */
	void setPorpertiesSyntax(PropertiesSyntax value);

	/**
	 * Returns the value of the '<em><b>Dependencies Manager</b></em>' attribute.
	 * The literals are from the enumeration {@link colmenaMLI.DependenciesManager}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies Manager</em>' attribute.
	 * @see colmenaMLI.DependenciesManager
	 * @see #setDependenciesManager(DependenciesManager)
	 * @see colmenaMLI.ColmenaMLIPackage#getFunctionalMs_DependenciesManager()
	 * @model
	 * @generated
	 */
	DependenciesManager getDependenciesManager();

	/**
	 * Sets the value of the '{@link colmenaMLI.FunctionalMs#getDependenciesManager <em>Dependencies Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependencies Manager</em>' attribute.
	 * @see colmenaMLI.DependenciesManager
	 * @see #getDependenciesManager()
	 * @generated
	 */
	void setDependenciesManager(DependenciesManager value);

} // FunctionalMs
