/**
 */
package colmenaMLI.impl;

import colmenaMLI.ColmenaMLIPackage;
import colmenaMLI.InfrastructureConfig;
import colmenaMLI.InfrastructureMs;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Infrastructure Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link colmenaMLI.impl.InfrastructureConfigImpl#getInfrastructureMs <em>Infrastructure Ms</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InfrastructureConfigImpl extends ConfigurationImpl implements InfrastructureConfig {
	/**
	 * The cached value of the '{@link #getInfrastructureMs() <em>Infrastructure Ms</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfrastructureMs()
	 * @generated
	 * @ordered
	 */
	protected EList<InfrastructureMs> infrastructureMs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfrastructureConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ColmenaMLIPackage.Literals.INFRASTRUCTURE_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InfrastructureMs> getInfrastructureMs() {
		if (infrastructureMs == null) {
			infrastructureMs = new EObjectResolvingEList<InfrastructureMs>(InfrastructureMs.class, this,
					ColmenaMLIPackage.INFRASTRUCTURE_CONFIG__INFRASTRUCTURE_MS);
		}
		return infrastructureMs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ColmenaMLIPackage.INFRASTRUCTURE_CONFIG__INFRASTRUCTURE_MS:
			return getInfrastructureMs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ColmenaMLIPackage.INFRASTRUCTURE_CONFIG__INFRASTRUCTURE_MS:
			getInfrastructureMs().clear();
			getInfrastructureMs().addAll((Collection<? extends InfrastructureMs>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ColmenaMLIPackage.INFRASTRUCTURE_CONFIG__INFRASTRUCTURE_MS:
			getInfrastructureMs().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ColmenaMLIPackage.INFRASTRUCTURE_CONFIG__INFRASTRUCTURE_MS:
			return infrastructureMs != null && !infrastructureMs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InfrastructureConfigImpl
