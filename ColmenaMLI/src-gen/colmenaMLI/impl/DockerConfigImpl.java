/**
 */
package colmenaMLI.impl;

import colmenaMLI.ColmenaMLIPackage;
import colmenaMLI.DockerConfig;
import colmenaMLI.DockerImage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Docker Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link colmenaMLI.impl.DockerConfigImpl#getInnerPort <em>Inner Port</em>}</li>
 *   <li>{@link colmenaMLI.impl.DockerConfigImpl#getExposePort <em>Expose Port</em>}</li>
 *   <li>{@link colmenaMLI.impl.DockerConfigImpl#getDockerBaseImage <em>Docker Base Image</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DockerConfigImpl extends ConfigurationImpl implements DockerConfig {
	/**
	 * The default value of the '{@link #getInnerPort() <em>Inner Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerPort()
	 * @generated
	 * @ordered
	 */
	protected static final Integer INNER_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInnerPort() <em>Inner Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerPort()
	 * @generated
	 * @ordered
	 */
	protected Integer innerPort = INNER_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getExposePort() <em>Expose Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExposePort()
	 * @generated
	 * @ordered
	 */
	protected static final Integer EXPOSE_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExposePort() <em>Expose Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExposePort()
	 * @generated
	 * @ordered
	 */
	protected Integer exposePort = EXPOSE_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDockerBaseImage() <em>Docker Base Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDockerBaseImage()
	 * @generated
	 * @ordered
	 */
	protected static final DockerImage DOCKER_BASE_IMAGE_EDEFAULT = DockerImage.OPENJDK12ALPINE;

	/**
	 * The cached value of the '{@link #getDockerBaseImage() <em>Docker Base Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDockerBaseImage()
	 * @generated
	 * @ordered
	 */
	protected DockerImage dockerBaseImage = DOCKER_BASE_IMAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DockerConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ColmenaMLIPackage.Literals.DOCKER_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getInnerPort() {
		return innerPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInnerPort(Integer newInnerPort) {
		Integer oldInnerPort = innerPort;
		innerPort = newInnerPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ColmenaMLIPackage.DOCKER_CONFIG__INNER_PORT,
					oldInnerPort, innerPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getExposePort() {
		return exposePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExposePort(Integer newExposePort) {
		Integer oldExposePort = exposePort;
		exposePort = newExposePort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ColmenaMLIPackage.DOCKER_CONFIG__EXPOSE_PORT,
					oldExposePort, exposePort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerImage getDockerBaseImage() {
		return dockerBaseImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDockerBaseImage(DockerImage newDockerBaseImage) {
		DockerImage oldDockerBaseImage = dockerBaseImage;
		dockerBaseImage = newDockerBaseImage == null ? DOCKER_BASE_IMAGE_EDEFAULT : newDockerBaseImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ColmenaMLIPackage.DOCKER_CONFIG__DOCKER_BASE_IMAGE,
					oldDockerBaseImage, dockerBaseImage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ColmenaMLIPackage.DOCKER_CONFIG__INNER_PORT:
			return getInnerPort();
		case ColmenaMLIPackage.DOCKER_CONFIG__EXPOSE_PORT:
			return getExposePort();
		case ColmenaMLIPackage.DOCKER_CONFIG__DOCKER_BASE_IMAGE:
			return getDockerBaseImage();
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
		case ColmenaMLIPackage.DOCKER_CONFIG__INNER_PORT:
			setInnerPort((Integer) newValue);
			return;
		case ColmenaMLIPackage.DOCKER_CONFIG__EXPOSE_PORT:
			setExposePort((Integer) newValue);
			return;
		case ColmenaMLIPackage.DOCKER_CONFIG__DOCKER_BASE_IMAGE:
			setDockerBaseImage((DockerImage) newValue);
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
		case ColmenaMLIPackage.DOCKER_CONFIG__INNER_PORT:
			setInnerPort(INNER_PORT_EDEFAULT);
			return;
		case ColmenaMLIPackage.DOCKER_CONFIG__EXPOSE_PORT:
			setExposePort(EXPOSE_PORT_EDEFAULT);
			return;
		case ColmenaMLIPackage.DOCKER_CONFIG__DOCKER_BASE_IMAGE:
			setDockerBaseImage(DOCKER_BASE_IMAGE_EDEFAULT);
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
		case ColmenaMLIPackage.DOCKER_CONFIG__INNER_PORT:
			return INNER_PORT_EDEFAULT == null ? innerPort != null : !INNER_PORT_EDEFAULT.equals(innerPort);
		case ColmenaMLIPackage.DOCKER_CONFIG__EXPOSE_PORT:
			return EXPOSE_PORT_EDEFAULT == null ? exposePort != null : !EXPOSE_PORT_EDEFAULT.equals(exposePort);
		case ColmenaMLIPackage.DOCKER_CONFIG__DOCKER_BASE_IMAGE:
			return dockerBaseImage != DOCKER_BASE_IMAGE_EDEFAULT;
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
		result.append(" (innerPort: ");
		result.append(innerPort);
		result.append(", exposePort: ");
		result.append(exposePort);
		result.append(", dockerBaseImage: ");
		result.append(dockerBaseImage);
		result.append(')');
		return result.toString();
	}

} //DockerConfigImpl
