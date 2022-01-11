/**
 */
package colmenaMLI.impl;

import colmenaMLI.ColmenaMLIPackage;
import colmenaMLI.Gateway;
import colmenaMLI.GatewayService;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gateway</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link colmenaMLI.impl.GatewayImpl#getGatewayService <em>Gateway Service</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GatewayImpl extends InfrastructureMsImpl implements Gateway {
	/**
	 * The default value of the '{@link #getGatewayService() <em>Gateway Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGatewayService()
	 * @generated
	 * @ordered
	 */
	protected static final GatewayService GATEWAY_SERVICE_EDEFAULT = GatewayService.SPRING_CLOUD;

	/**
	 * The cached value of the '{@link #getGatewayService() <em>Gateway Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGatewayService()
	 * @generated
	 * @ordered
	 */
	protected GatewayService gatewayService = GATEWAY_SERVICE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GatewayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ColmenaMLIPackage.Literals.GATEWAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GatewayService getGatewayService() {
		return gatewayService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGatewayService(GatewayService newGatewayService) {
		GatewayService oldGatewayService = gatewayService;
		gatewayService = newGatewayService == null ? GATEWAY_SERVICE_EDEFAULT : newGatewayService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ColmenaMLIPackage.GATEWAY__GATEWAY_SERVICE,
					oldGatewayService, gatewayService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ColmenaMLIPackage.GATEWAY__GATEWAY_SERVICE:
			return getGatewayService();
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
		case ColmenaMLIPackage.GATEWAY__GATEWAY_SERVICE:
			setGatewayService((GatewayService) newValue);
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
		case ColmenaMLIPackage.GATEWAY__GATEWAY_SERVICE:
			setGatewayService(GATEWAY_SERVICE_EDEFAULT);
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
		case ColmenaMLIPackage.GATEWAY__GATEWAY_SERVICE:
			return gatewayService != GATEWAY_SERVICE_EDEFAULT;
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
		result.append(" (gatewayService: ");
		result.append(gatewayService);
		result.append(')');
		return result.toString();
	}

} //GatewayImpl
