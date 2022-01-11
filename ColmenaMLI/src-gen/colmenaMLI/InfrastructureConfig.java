/**
 */
package colmenaMLI;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Infrastructure Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link colmenaMLI.InfrastructureConfig#getInfrastructureMs <em>Infrastructure Ms</em>}</li>
 * </ul>
 *
 * @see colmenaMLI.ColmenaMLIPackage#getInfrastructureConfig()
 * @model
 * @generated
 */
public interface InfrastructureConfig extends Configuration {
	/**
	 * Returns the value of the '<em><b>Infrastructure Ms</b></em>' reference list.
	 * The list contents are of type {@link colmenaMLI.InfrastructureMs}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Infrastructure Ms</em>' reference list.
	 * @see colmenaMLI.ColmenaMLIPackage#getInfrastructureConfig_InfrastructureMs()
	 * @model
	 * @generated
	 */
	EList<InfrastructureMs> getInfrastructureMs();

} // InfrastructureConfig
