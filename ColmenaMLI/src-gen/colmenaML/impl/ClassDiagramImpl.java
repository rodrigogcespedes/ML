/**
 */
package colmenaML.impl;

import colmenaML.ClassDiagram;
import colmenaML.ColmenaMLPackage;
import colmenaML.Contract;
import colmenaML.DTOContainer;

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
 * An implementation of the model object '<em><b>Class Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link colmenaML.impl.ClassDiagramImpl#getContained_contracts <em>Contained contracts</em>}</li>
 *   <li>{@link colmenaML.impl.ClassDiagramImpl#getContained_packages <em>Contained packages</em>}</li>
 *   <li>{@link colmenaML.impl.ClassDiagramImpl#getContained_dtoContainers <em>Contained dto Containers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassDiagramImpl extends MinimalEObjectImpl.Container implements ClassDiagram {
	/**
	 * The cached value of the '{@link #getContained_contracts() <em>Contained contracts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContained_contracts()
	 * @generated
	 * @ordered
	 */
	protected EList<Contract> contained_contracts;

	/**
	 * The cached value of the '{@link #getContained_packages() <em>Contained packages</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContained_packages()
	 * @generated
	 * @ordered
	 */
	protected colmenaML.Package contained_packages;

	/**
	 * The cached value of the '{@link #getContained_dtoContainers() <em>Contained dto Containers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContained_dtoContainers()
	 * @generated
	 * @ordered
	 */
	protected DTOContainer contained_dtoContainers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ColmenaMLPackage.Literals.CLASS_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Contract> getContained_contracts() {
		if (contained_contracts == null) {
			contained_contracts = new EObjectContainmentEList<Contract>(Contract.class, this,
					ColmenaMLPackage.CLASS_DIAGRAM__CONTAINED_CONTRACTS);
		}
		return contained_contracts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public colmenaML.Package getContained_packages() {
		return contained_packages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContained_packages(colmenaML.Package newContained_packages,
			NotificationChain msgs) {
		colmenaML.Package oldContained_packages = contained_packages;
		contained_packages = newContained_packages;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ColmenaMLPackage.CLASS_DIAGRAM__CONTAINED_PACKAGES, oldContained_packages, newContained_packages);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContained_packages(colmenaML.Package newContained_packages) {
		if (newContained_packages != contained_packages) {
			NotificationChain msgs = null;
			if (contained_packages != null)
				msgs = ((InternalEObject) contained_packages).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ColmenaMLPackage.CLASS_DIAGRAM__CONTAINED_PACKAGES, null, msgs);
			if (newContained_packages != null)
				msgs = ((InternalEObject) newContained_packages).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ColmenaMLPackage.CLASS_DIAGRAM__CONTAINED_PACKAGES, null, msgs);
			msgs = basicSetContained_packages(newContained_packages, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ColmenaMLPackage.CLASS_DIAGRAM__CONTAINED_PACKAGES,
					newContained_packages, newContained_packages));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTOContainer getContained_dtoContainers() {
		return contained_dtoContainers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContained_dtoContainers(DTOContainer newContained_dtoContainers,
			NotificationChain msgs) {
		DTOContainer oldContained_dtoContainers = contained_dtoContainers;
		contained_dtoContainers = newContained_dtoContainers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ColmenaMLPackage.CLASS_DIAGRAM__CONTAINED_DTO_CONTAINERS, oldContained_dtoContainers,
					newContained_dtoContainers);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContained_dtoContainers(DTOContainer newContained_dtoContainers) {
		if (newContained_dtoContainers != contained_dtoContainers) {
			NotificationChain msgs = null;
			if (contained_dtoContainers != null)
				msgs = ((InternalEObject) contained_dtoContainers).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ColmenaMLPackage.CLASS_DIAGRAM__CONTAINED_DTO_CONTAINERS, null, msgs);
			if (newContained_dtoContainers != null)
				msgs = ((InternalEObject) newContained_dtoContainers).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ColmenaMLPackage.CLASS_DIAGRAM__CONTAINED_DTO_CONTAINERS, null, msgs);
			msgs = basicSetContained_dtoContainers(newContained_dtoContainers, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ColmenaMLPackage.CLASS_DIAGRAM__CONTAINED_DTO_CONTAINERS, newContained_dtoContainers,
					newContained_dtoContainers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ColmenaMLPackage.CLASS_DIAGRAM__CONTAINED_CONTRACTS:
			return ((InternalEList<?>) getContained_contracts()).basicRemove(otherEnd, msgs);
		case ColmenaMLPackage.CLASS_DIAGRAM__CONTAINED_PACKAGES:
			return basicSetContained_packages(null, msgs);
		case ColmenaMLPackage.CLASS_DIAGRAM__CONTAINED_DTO_CONTAINERS:
			return basicSetContained_dtoContainers(null, msgs);
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
		case ColmenaMLPackage.CLASS_DIAGRAM__CONTAINED_CONTRACTS:
			return getContained_contracts();
		case ColmenaMLPackage.CLASS_DIAGRAM__CONTAINED_PACKAGES:
			return getContained_packages();
		case ColmenaMLPackage.CLASS_DIAGRAM__CONTAINED_DTO_CONTAINERS:
			return getContained_dtoContainers();
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
		case ColmenaMLPackage.CLASS_DIAGRAM__CONTAINED_CONTRACTS:
			getContained_contracts().clear();
			getContained_contracts().addAll((Collection<? extends Contract>) newValue);
			return;
		case ColmenaMLPackage.CLASS_DIAGRAM__CONTAINED_PACKAGES:
			setContained_packages((colmenaML.Package) newValue);
			return;
		case ColmenaMLPackage.CLASS_DIAGRAM__CONTAINED_DTO_CONTAINERS:
			setContained_dtoContainers((DTOContainer) newValue);
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
		case ColmenaMLPackage.CLASS_DIAGRAM__CONTAINED_CONTRACTS:
			getContained_contracts().clear();
			return;
		case ColmenaMLPackage.CLASS_DIAGRAM__CONTAINED_PACKAGES:
			setContained_packages((colmenaML.Package) null);
			return;
		case ColmenaMLPackage.CLASS_DIAGRAM__CONTAINED_DTO_CONTAINERS:
			setContained_dtoContainers((DTOContainer) null);
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
		case ColmenaMLPackage.CLASS_DIAGRAM__CONTAINED_CONTRACTS:
			return contained_contracts != null && !contained_contracts.isEmpty();
		case ColmenaMLPackage.CLASS_DIAGRAM__CONTAINED_PACKAGES:
			return contained_packages != null;
		case ColmenaMLPackage.CLASS_DIAGRAM__CONTAINED_DTO_CONTAINERS:
			return contained_dtoContainers != null;
		}
		return super.eIsSet(featureID);
	}

} //ClassDiagramImpl
