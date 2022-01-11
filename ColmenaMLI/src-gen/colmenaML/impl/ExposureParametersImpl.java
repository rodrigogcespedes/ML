/**
 */
package colmenaML.impl;

import colmenaML.ColmenaMLPackage;
import colmenaML.DTO;
import colmenaML.ExposureParameters;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exposure Parameters</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link colmenaML.impl.ExposureParametersImpl#getDto <em>Dto</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExposureParametersImpl extends MinimalEObjectImpl.Container implements ExposureParameters {
	/**
	 * The cached value of the '{@link #getDto() <em>Dto</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDto()
	 * @generated
	 * @ordered
	 */
	protected DTO dto;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExposureParametersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ColmenaMLPackage.Literals.EXPOSURE_PARAMETERS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTO getDto() {
		if (dto != null && dto.eIsProxy()) {
			InternalEObject oldDto = (InternalEObject) dto;
			dto = (DTO) eResolveProxy(oldDto);
			if (dto != oldDto) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ColmenaMLPackage.EXPOSURE_PARAMETERS__DTO,
							oldDto, dto));
			}
		}
		return dto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTO basicGetDto() {
		return dto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDto(DTO newDto) {
		DTO oldDto = dto;
		dto = newDto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ColmenaMLPackage.EXPOSURE_PARAMETERS__DTO, oldDto,
					dto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ColmenaMLPackage.EXPOSURE_PARAMETERS__DTO:
			if (resolve)
				return getDto();
			return basicGetDto();
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
		case ColmenaMLPackage.EXPOSURE_PARAMETERS__DTO:
			setDto((DTO) newValue);
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
		case ColmenaMLPackage.EXPOSURE_PARAMETERS__DTO:
			setDto((DTO) null);
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
		case ColmenaMLPackage.EXPOSURE_PARAMETERS__DTO:
			return dto != null;
		}
		return super.eIsSet(featureID);
	}

} //ExposureParametersImpl
