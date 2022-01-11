/**
 */
package colmenaML.impl;

import colmenaML.ClassDTO;
import colmenaML.ColmenaMLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class DTO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link colmenaML.impl.ClassDTOImpl#getReference_class <em>Reference class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassDTOImpl extends DTOImpl implements ClassDTO {
	/**
	 * The cached value of the '{@link #getReference_class() <em>Reference class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference_class()
	 * @generated
	 * @ordered
	 */
	protected colmenaML.Class reference_class;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassDTOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ColmenaMLPackage.Literals.CLASS_DTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public colmenaML.Class getReference_class() {
		if (reference_class != null && reference_class.eIsProxy()) {
			InternalEObject oldReference_class = (InternalEObject) reference_class;
			reference_class = (colmenaML.Class) eResolveProxy(oldReference_class);
			if (reference_class != oldReference_class) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ColmenaMLPackage.CLASS_DTO__REFERENCE_CLASS, oldReference_class, reference_class));
			}
		}
		return reference_class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public colmenaML.Class basicGetReference_class() {
		return reference_class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference_class(colmenaML.Class newReference_class) {
		colmenaML.Class oldReference_class = reference_class;
		reference_class = newReference_class;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ColmenaMLPackage.CLASS_DTO__REFERENCE_CLASS,
					oldReference_class, reference_class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ColmenaMLPackage.CLASS_DTO__REFERENCE_CLASS:
			if (resolve)
				return getReference_class();
			return basicGetReference_class();
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
		case ColmenaMLPackage.CLASS_DTO__REFERENCE_CLASS:
			setReference_class((colmenaML.Class) newValue);
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
		case ColmenaMLPackage.CLASS_DTO__REFERENCE_CLASS:
			setReference_class((colmenaML.Class) null);
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
		case ColmenaMLPackage.CLASS_DTO__REFERENCE_CLASS:
			return reference_class != null;
		}
		return super.eIsSet(featureID);
	}

} //ClassDTOImpl
