/**
 */
package colmenaML.impl;

import colmenaML.ColmenaMLPackage;
import colmenaML.Contract;
import colmenaML.ContractExposure;

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
 * An implementation of the model object '<em><b>Contract</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link colmenaML.impl.ContractImpl#getName <em>Name</em>}</li>
 *   <li>{@link colmenaML.impl.ContractImpl#getVerbs_offered <em>Verbs offered</em>}</li>
 *   <li>{@link colmenaML.impl.ContractImpl#getMain_class <em>Main class</em>}</li>
 *   <li>{@link colmenaML.impl.ContractImpl#isCrudMethods <em>Crud Methods</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContractImpl extends MinimalEObjectImpl.Container implements Contract {
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
	 * The cached value of the '{@link #getVerbs_offered() <em>Verbs offered</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerbs_offered()
	 * @generated
	 * @ordered
	 */
	protected EList<ContractExposure> verbs_offered;

	/**
	 * The cached value of the '{@link #getMain_class() <em>Main class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMain_class()
	 * @generated
	 * @ordered
	 */
	protected colmenaML.Class main_class;

	/**
	 * The default value of the '{@link #isCrudMethods() <em>Crud Methods</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCrudMethods()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CRUD_METHODS_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isCrudMethods() <em>Crud Methods</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCrudMethods()
	 * @generated
	 * @ordered
	 */
	protected boolean crudMethods = CRUD_METHODS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContractImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ColmenaMLPackage.Literals.CONTRACT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ColmenaMLPackage.CONTRACT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContractExposure> getVerbs_offered() {
		if (verbs_offered == null) {
			verbs_offered = new EObjectContainmentEList<ContractExposure>(ContractExposure.class, this,
					ColmenaMLPackage.CONTRACT__VERBS_OFFERED);
		}
		return verbs_offered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public colmenaML.Class getMain_class() {
		if (main_class != null && main_class.eIsProxy()) {
			InternalEObject oldMain_class = (InternalEObject) main_class;
			main_class = (colmenaML.Class) eResolveProxy(oldMain_class);
			if (main_class != oldMain_class) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ColmenaMLPackage.CONTRACT__MAIN_CLASS,
							oldMain_class, main_class));
			}
		}
		return main_class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public colmenaML.Class basicGetMain_class() {
		return main_class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMain_class(colmenaML.Class newMain_class) {
		colmenaML.Class oldMain_class = main_class;
		main_class = newMain_class;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ColmenaMLPackage.CONTRACT__MAIN_CLASS, oldMain_class,
					main_class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCrudMethods() {
		return crudMethods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCrudMethods(boolean newCrudMethods) {
		boolean oldCrudMethods = crudMethods;
		crudMethods = newCrudMethods;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ColmenaMLPackage.CONTRACT__CRUD_METHODS,
					oldCrudMethods, crudMethods));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ColmenaMLPackage.CONTRACT__VERBS_OFFERED:
			return ((InternalEList<?>) getVerbs_offered()).basicRemove(otherEnd, msgs);
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
		case ColmenaMLPackage.CONTRACT__NAME:
			return getName();
		case ColmenaMLPackage.CONTRACT__VERBS_OFFERED:
			return getVerbs_offered();
		case ColmenaMLPackage.CONTRACT__MAIN_CLASS:
			if (resolve)
				return getMain_class();
			return basicGetMain_class();
		case ColmenaMLPackage.CONTRACT__CRUD_METHODS:
			return isCrudMethods();
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
		case ColmenaMLPackage.CONTRACT__NAME:
			setName((String) newValue);
			return;
		case ColmenaMLPackage.CONTRACT__VERBS_OFFERED:
			getVerbs_offered().clear();
			getVerbs_offered().addAll((Collection<? extends ContractExposure>) newValue);
			return;
		case ColmenaMLPackage.CONTRACT__MAIN_CLASS:
			setMain_class((colmenaML.Class) newValue);
			return;
		case ColmenaMLPackage.CONTRACT__CRUD_METHODS:
			setCrudMethods((Boolean) newValue);
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
		case ColmenaMLPackage.CONTRACT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ColmenaMLPackage.CONTRACT__VERBS_OFFERED:
			getVerbs_offered().clear();
			return;
		case ColmenaMLPackage.CONTRACT__MAIN_CLASS:
			setMain_class((colmenaML.Class) null);
			return;
		case ColmenaMLPackage.CONTRACT__CRUD_METHODS:
			setCrudMethods(CRUD_METHODS_EDEFAULT);
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
		case ColmenaMLPackage.CONTRACT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ColmenaMLPackage.CONTRACT__VERBS_OFFERED:
			return verbs_offered != null && !verbs_offered.isEmpty();
		case ColmenaMLPackage.CONTRACT__MAIN_CLASS:
			return main_class != null;
		case ColmenaMLPackage.CONTRACT__CRUD_METHODS:
			return crudMethods != CRUD_METHODS_EDEFAULT;
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
		result.append(", crudMethods: ");
		result.append(crudMethods);
		result.append(')');
		return result.toString();
	}

} //ContractImpl
