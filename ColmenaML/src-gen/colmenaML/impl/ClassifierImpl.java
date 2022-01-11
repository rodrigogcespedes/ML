/**
 */
package colmenaML.impl;

import colmenaML.Attribute;
import colmenaML.Classifier;
import colmenaML.ColmenaMLPackage;
import colmenaML.Inheritance;
import colmenaML.Operation;

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
 * An implementation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link colmenaML.impl.ClassifierImpl#getName <em>Name</em>}</li>
 *   <li>{@link colmenaML.impl.ClassifierImpl#getContained_operations <em>Contained operations</em>}</li>
 *   <li>{@link colmenaML.impl.ClassifierImpl#getContained_attributes <em>Contained attributes</em>}</li>
 *   <li>{@link colmenaML.impl.ClassifierImpl#getContained_inheritances <em>Contained inheritances</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ClassifierImpl extends MinimalEObjectImpl.Container implements Classifier {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContained_operations() <em>Contained operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContained_operations()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> contained_operations;

	/**
	 * The cached value of the '{@link #getContained_attributes() <em>Contained attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContained_attributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> contained_attributes;

	/**
	 * The cached value of the '{@link #getContained_inheritances() <em>Contained inheritances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContained_inheritances()
	 * @generated
	 * @ordered
	 */
	protected EList<Inheritance> contained_inheritances;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ColmenaMLPackage.Literals.CLASSIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ColmenaMLPackage.CLASSIFIER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getContained_operations() {
		if (contained_operations == null) {
			contained_operations = new EObjectContainmentEList<Operation>(Operation.class, this,
					ColmenaMLPackage.CLASSIFIER__CONTAINED_OPERATIONS);
		}
		return contained_operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getContained_attributes() {
		if (contained_attributes == null) {
			contained_attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this,
					ColmenaMLPackage.CLASSIFIER__CONTAINED_ATTRIBUTES);
		}
		return contained_attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Inheritance> getContained_inheritances() {
		if (contained_inheritances == null) {
			contained_inheritances = new EObjectContainmentEList<Inheritance>(Inheritance.class, this,
					ColmenaMLPackage.CLASSIFIER__CONTAINED_INHERITANCES);
		}
		return contained_inheritances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ColmenaMLPackage.CLASSIFIER__CONTAINED_OPERATIONS:
			return ((InternalEList<?>) getContained_operations()).basicRemove(otherEnd, msgs);
		case ColmenaMLPackage.CLASSIFIER__CONTAINED_ATTRIBUTES:
			return ((InternalEList<?>) getContained_attributes()).basicRemove(otherEnd, msgs);
		case ColmenaMLPackage.CLASSIFIER__CONTAINED_INHERITANCES:
			return ((InternalEList<?>) getContained_inheritances()).basicRemove(otherEnd, msgs);
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
		case ColmenaMLPackage.CLASSIFIER__NAME:
			return getName();
		case ColmenaMLPackage.CLASSIFIER__CONTAINED_OPERATIONS:
			return getContained_operations();
		case ColmenaMLPackage.CLASSIFIER__CONTAINED_ATTRIBUTES:
			return getContained_attributes();
		case ColmenaMLPackage.CLASSIFIER__CONTAINED_INHERITANCES:
			return getContained_inheritances();
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
		case ColmenaMLPackage.CLASSIFIER__NAME:
			setName((String) newValue);
			return;
		case ColmenaMLPackage.CLASSIFIER__CONTAINED_OPERATIONS:
			getContained_operations().clear();
			getContained_operations().addAll((Collection<? extends Operation>) newValue);
			return;
		case ColmenaMLPackage.CLASSIFIER__CONTAINED_ATTRIBUTES:
			getContained_attributes().clear();
			getContained_attributes().addAll((Collection<? extends Attribute>) newValue);
			return;
		case ColmenaMLPackage.CLASSIFIER__CONTAINED_INHERITANCES:
			getContained_inheritances().clear();
			getContained_inheritances().addAll((Collection<? extends Inheritance>) newValue);
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
		case ColmenaMLPackage.CLASSIFIER__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ColmenaMLPackage.CLASSIFIER__CONTAINED_OPERATIONS:
			getContained_operations().clear();
			return;
		case ColmenaMLPackage.CLASSIFIER__CONTAINED_ATTRIBUTES:
			getContained_attributes().clear();
			return;
		case ColmenaMLPackage.CLASSIFIER__CONTAINED_INHERITANCES:
			getContained_inheritances().clear();
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
		case ColmenaMLPackage.CLASSIFIER__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ColmenaMLPackage.CLASSIFIER__CONTAINED_OPERATIONS:
			return contained_operations != null && !contained_operations.isEmpty();
		case ColmenaMLPackage.CLASSIFIER__CONTAINED_ATTRIBUTES:
			return contained_attributes != null && !contained_attributes.isEmpty();
		case ColmenaMLPackage.CLASSIFIER__CONTAINED_INHERITANCES:
			return contained_inheritances != null && !contained_inheritances.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ClassifierImpl
