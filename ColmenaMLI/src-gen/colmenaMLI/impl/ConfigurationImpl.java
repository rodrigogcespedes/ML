/**
 */
package colmenaMLI.impl;

import colmenaMLI.ColmenaMLIPackage;
import colmenaMLI.Configuration;
import colmenaMLI.Microservice;
import colmenaMLI.RestartType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link colmenaMLI.impl.ConfigurationImpl#getNetwork <em>Network</em>}</li>
 *   <li>{@link colmenaMLI.impl.ConfigurationImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link colmenaMLI.impl.ConfigurationImpl#getRestartType <em>Restart Type</em>}</li>
 *   <li>{@link colmenaMLI.impl.ConfigurationImpl#getMicroservice <em>Microservice</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ConfigurationImpl extends MinimalEObjectImpl.Container implements Configuration {
	/**
	 * The default value of the '{@link #getNetwork() <em>Network</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetwork()
	 * @generated
	 * @ordered
	 */
	protected static final String NETWORK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNetwork() <em>Network</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetwork()
	 * @generated
	 * @ordered
	 */
	protected String network = NETWORK_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnvironment() <em>Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
	protected static final String ENVIRONMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnvironment() <em>Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
	protected String environment = ENVIRONMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRestartType() <em>Restart Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestartType()
	 * @generated
	 * @ordered
	 */
	protected static final RestartType RESTART_TYPE_EDEFAULT = RestartType.ALWAYS;

	/**
	 * The cached value of the '{@link #getRestartType() <em>Restart Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestartType()
	 * @generated
	 * @ordered
	 */
	protected RestartType restartType = RESTART_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMicroservice() <em>Microservice</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMicroservice()
	 * @generated
	 * @ordered
	 */
	protected EList<Microservice> microservice;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ColmenaMLIPackage.Literals.CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNetwork() {
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetwork(String newNetwork) {
		String oldNetwork = network;
		network = newNetwork;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ColmenaMLIPackage.CONFIGURATION__NETWORK, oldNetwork,
					network));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEnvironment() {
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvironment(String newEnvironment) {
		String oldEnvironment = environment;
		environment = newEnvironment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ColmenaMLIPackage.CONFIGURATION__ENVIRONMENT,
					oldEnvironment, environment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestartType getRestartType() {
		return restartType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRestartType(RestartType newRestartType) {
		RestartType oldRestartType = restartType;
		restartType = newRestartType == null ? RESTART_TYPE_EDEFAULT : newRestartType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ColmenaMLIPackage.CONFIGURATION__RESTART_TYPE,
					oldRestartType, restartType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Microservice> getMicroservice() {
		if (microservice == null) {
			microservice = new EObjectContainmentEList<Microservice>(Microservice.class, this,
					ColmenaMLIPackage.CONFIGURATION__MICROSERVICE);
		}
		return microservice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ColmenaMLIPackage.CONFIGURATION__MICROSERVICE:
			return ((InternalEList<?>) getMicroservice()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ColmenaMLIPackage.CONFIGURATION__NETWORK:
			return getNetwork();
		case ColmenaMLIPackage.CONFIGURATION__ENVIRONMENT:
			return getEnvironment();
		case ColmenaMLIPackage.CONFIGURATION__RESTART_TYPE:
			return getRestartType();
		case ColmenaMLIPackage.CONFIGURATION__MICROSERVICE:
			return getMicroservice();
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
		case ColmenaMLIPackage.CONFIGURATION__NETWORK:
			setNetwork((String) newValue);
			return;
		case ColmenaMLIPackage.CONFIGURATION__ENVIRONMENT:
			setEnvironment((String) newValue);
			return;
		case ColmenaMLIPackage.CONFIGURATION__RESTART_TYPE:
			setRestartType((RestartType) newValue);
			return;
		case ColmenaMLIPackage.CONFIGURATION__MICROSERVICE:
			getMicroservice().clear();
			getMicroservice().addAll((Collection<? extends Microservice>) newValue);
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
		case ColmenaMLIPackage.CONFIGURATION__NETWORK:
			setNetwork(NETWORK_EDEFAULT);
			return;
		case ColmenaMLIPackage.CONFIGURATION__ENVIRONMENT:
			setEnvironment(ENVIRONMENT_EDEFAULT);
			return;
		case ColmenaMLIPackage.CONFIGURATION__RESTART_TYPE:
			setRestartType(RESTART_TYPE_EDEFAULT);
			return;
		case ColmenaMLIPackage.CONFIGURATION__MICROSERVICE:
			getMicroservice().clear();
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
		case ColmenaMLIPackage.CONFIGURATION__NETWORK:
			return NETWORK_EDEFAULT == null ? network != null : !NETWORK_EDEFAULT.equals(network);
		case ColmenaMLIPackage.CONFIGURATION__ENVIRONMENT:
			return ENVIRONMENT_EDEFAULT == null ? environment != null : !ENVIRONMENT_EDEFAULT.equals(environment);
		case ColmenaMLIPackage.CONFIGURATION__RESTART_TYPE:
			return restartType != RESTART_TYPE_EDEFAULT;
		case ColmenaMLIPackage.CONFIGURATION__MICROSERVICE:
			return microservice != null && !microservice.isEmpty();
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
		result.append(" (network: ");
		result.append(network);
		result.append(", environment: ");
		result.append(environment);
		result.append(", restartType: ");
		result.append(restartType);
		result.append(')');
		return result.toString();
	}

} //ConfigurationImpl
