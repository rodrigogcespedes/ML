/**
 */
package colmenaML.impl;

import colmenaML.ColmenaMLPackage;
import colmenaML.CustomDTO;
import colmenaML.DTOCustomAttribute;
import colmenaML.DTOReferenceAttribute;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom DTO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link colmenaML.impl.CustomDTOImpl#getContained_custom_attributes <em>Contained custom attributes</em>}</li>
 *   <li>{@link colmenaML.impl.CustomDTOImpl#getContained_reference_attributes <em>Contained reference attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomDTOImpl extends DTOImpl implements CustomDTO {
	/**
	 * The cached value of the '{@link #getContained_custom_attributes() <em>Contained custom attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContained_custom_attributes()
	 * @generated
	 * @ordered
	 */
	protected EList<DTOCustomAttribute> contained_custom_attributes;

	/**
	 * The cached value of the '{@link #getContained_reference_attributes() <em>Contained reference attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContained_reference_attributes()
	 * @generated
	 * @ordered
	 */
	protected EList<DTOReferenceAttribute> contained_reference_attributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomDTOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ColmenaMLPackage.Literals.CUSTOM_DTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DTOCustomAttribute> getContained_custom_attributes() {
		if (contained_custom_attributes == null) {
			contained_custom_attributes = new EObjectContainmentEList<DTOCustomAttribute>(DTOCustomAttribute.class,
					this, ColmenaMLPackage.CUSTOM_DTO__CONTAINED_CUSTOM_ATTRIBUTES);
		}
		return contained_custom_attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DTOReferenceAttribute> getContained_reference_attributes() {
		if (contained_reference_attributes == null) {
			contained_reference_attributes = new EObjectContainmentEList<DTOReferenceAttribute>(
					DTOReferenceAttribute.class, this, ColmenaMLPackage.CUSTOM_DTO__CONTAINED_REFERENCE_ATTRIBUTES);
		}
		return contained_reference_attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ColmenaMLPackage.CUSTOM_DTO__CONTAINED_CUSTOM_ATTRIBUTES:
			return ((InternalEList<?>) getContained_custom_attributes()).basicRemove(otherEnd, msgs);
		case ColmenaMLPackage.CUSTOM_DTO__CONTAINED_REFERENCE_ATTRIBUTES:
			return ((InternalEList<?>) getContained_reference_attributes()).basicRemove(otherEnd, msgs);
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
		case ColmenaMLPackage.CUSTOM_DTO__CONTAINED_CUSTOM_ATTRIBUTES:
			return getContained_custom_attributes();
		case ColmenaMLPackage.CUSTOM_DTO__CONTAINED_REFERENCE_ATTRIBUTES:
			return getContained_reference_attributes();
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
		case ColmenaMLPackage.CUSTOM_DTO__CONTAINED_CUSTOM_ATTRIBUTES:
			getContained_custom_attributes().clear();
			getContained_custom_attributes().addAll((Collection<? extends DTOCustomAttribute>) newValue);
			return;
		case ColmenaMLPackage.CUSTOM_DTO__CONTAINED_REFERENCE_ATTRIBUTES:
			getContained_reference_attributes().clear();
			getContained_reference_attributes().addAll((Collection<? extends DTOReferenceAttribute>) newValue);
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
		case ColmenaMLPackage.CUSTOM_DTO__CONTAINED_CUSTOM_ATTRIBUTES:
			getContained_custom_attributes().clear();
			return;
		case ColmenaMLPackage.CUSTOM_DTO__CONTAINED_REFERENCE_ATTRIBUTES:
			getContained_reference_attributes().clear();
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
		case ColmenaMLPackage.CUSTOM_DTO__CONTAINED_CUSTOM_ATTRIBUTES:
			return contained_custom_attributes != null && !contained_custom_attributes.isEmpty();
		case ColmenaMLPackage.CUSTOM_DTO__CONTAINED_REFERENCE_ATTRIBUTES:
			return contained_reference_attributes != null && !contained_reference_attributes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CustomDTOImpl
