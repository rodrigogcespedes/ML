/**
 */
package colmenaMLI.impl;

import colmenaMLI.ColmenaMLIPackage;
import colmenaMLI.Discovery;
import colmenaMLI.DiscoveryService;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discovery</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link colmenaMLI.impl.DiscoveryImpl#getDiscoveryService <em>Discovery Service</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiscoveryImpl extends InfrastructureMsImpl implements Discovery {
	/**
	 * The default value of the '{@link #getDiscoveryService() <em>Discovery Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscoveryService()
	 * @generated
	 * @ordered
	 */
	protected static final DiscoveryService DISCOVERY_SERVICE_EDEFAULT = DiscoveryService.CONSUL;

	/**
	 * The cached value of the '{@link #getDiscoveryService() <em>Discovery Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscoveryService()
	 * @generated
	 * @ordered
	 */
	protected DiscoveryService discoveryService = DISCOVERY_SERVICE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiscoveryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ColmenaMLIPackage.Literals.DISCOVERY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscoveryService getDiscoveryService() {
		return discoveryService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscoveryService(DiscoveryService newDiscoveryService) {
		DiscoveryService oldDiscoveryService = discoveryService;
		discoveryService = newDiscoveryService == null ? DISCOVERY_SERVICE_EDEFAULT : newDiscoveryService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ColmenaMLIPackage.DISCOVERY__DISCOVERY_SERVICE,
					oldDiscoveryService, discoveryService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ColmenaMLIPackage.DISCOVERY__DISCOVERY_SERVICE:
			return getDiscoveryService();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ColmenaMLIPackage.DISCOVERY__DISCOVERY_SERVICE:
			setDiscoveryService((DiscoveryService) newValue);
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
		case ColmenaMLIPackage.DISCOVERY__DISCOVERY_SERVICE:
			setDiscoveryService(DISCOVERY_SERVICE_EDEFAULT);
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
		case ColmenaMLIPackage.DISCOVERY__DISCOVERY_SERVICE:
			return discoveryService != DISCOVERY_SERVICE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (discoveryService: ");
		result.append(discoveryService);
		result.append(')');
		return result.toString();
	}

} //DiscoveryImpl
