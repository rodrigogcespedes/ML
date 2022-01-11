/**
 */
package colmenaMLI.impl;

import colmenaML.ClassDiagram;
import colmenaML.ColmenaMLPackage;
import colmenaML.Contract;
import colmenaML.DTOContainer;

import colmenaMLI.ColmenaMLIPackage;
import colmenaMLI.DependenciesManager;
import colmenaMLI.Diagrama;
import colmenaMLI.FunctionalMs;
import colmenaMLI.PropertiesSyntax;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functional Ms</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link colmenaMLI.impl.FunctionalMsImpl#getContained_contracts <em>Contained contracts</em>}</li>
 *   <li>{@link colmenaMLI.impl.FunctionalMsImpl#getContained_packages <em>Contained packages</em>}</li>
 *   <li>{@link colmenaMLI.impl.FunctionalMsImpl#getContained_dtoContainers <em>Contained dto Containers</em>}</li>
 *   <li>{@link colmenaMLI.impl.FunctionalMsImpl#getPorpertiesSyntax <em>Porperties Syntax</em>}</li>
 *   <li>{@link colmenaMLI.impl.FunctionalMsImpl#getDependenciesManager <em>Dependencies Manager</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionalMsImpl extends MicroserviceImpl implements FunctionalMs {
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
	 * The default value of the '{@link #getPorpertiesSyntax() <em>Porperties Syntax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorpertiesSyntax()
	 * @generated
	 * @ordered
	 */
	protected static final PropertiesSyntax PORPERTIES_SYNTAX_EDEFAULT = PropertiesSyntax.YML;

	/**
	 * The cached value of the '{@link #getPorpertiesSyntax() <em>Porperties Syntax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorpertiesSyntax()
	 * @generated
	 * @ordered
	 */
	protected PropertiesSyntax porpertiesSyntax = PORPERTIES_SYNTAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getDependenciesManager() <em>Dependencies Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependenciesManager()
	 * @generated
	 * @ordered
	 */
	protected static final DependenciesManager DEPENDENCIES_MANAGER_EDEFAULT = DependenciesManager.MAVEN;

	/**
	 * The cached value of the '{@link #getDependenciesManager() <em>Dependencies Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependenciesManager()
	 * @generated
	 * @ordered
	 */
	protected DependenciesManager dependenciesManager = DEPENDENCIES_MANAGER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionalMsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ColmenaMLIPackage.Literals.FUNCTIONAL_MS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Contract> getContained_contracts() {
		if (contained_contracts == null) {
			contained_contracts = new EObjectContainmentEList<Contract>(Contract.class, this,
					ColmenaMLIPackage.FUNCTIONAL_MS__CONTAINED_CONTRACTS);
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
					ColmenaMLIPackage.FUNCTIONAL_MS__CONTAINED_PACKAGES, oldContained_packages, newContained_packages);
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
						EOPPOSITE_FEATURE_BASE - ColmenaMLIPackage.FUNCTIONAL_MS__CONTAINED_PACKAGES, null, msgs);
			if (newContained_packages != null)
				msgs = ((InternalEObject) newContained_packages).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ColmenaMLIPackage.FUNCTIONAL_MS__CONTAINED_PACKAGES, null, msgs);
			msgs = basicSetContained_packages(newContained_packages, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ColmenaMLIPackage.FUNCTIONAL_MS__CONTAINED_PACKAGES,
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
					ColmenaMLIPackage.FUNCTIONAL_MS__CONTAINED_DTO_CONTAINERS, oldContained_dtoContainers,
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
						EOPPOSITE_FEATURE_BASE - ColmenaMLIPackage.FUNCTIONAL_MS__CONTAINED_DTO_CONTAINERS, null, msgs);
			if (newContained_dtoContainers != null)
				msgs = ((InternalEObject) newContained_dtoContainers).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ColmenaMLIPackage.FUNCTIONAL_MS__CONTAINED_DTO_CONTAINERS, null, msgs);
			msgs = basicSetContained_dtoContainers(newContained_dtoContainers, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ColmenaMLIPackage.FUNCTIONAL_MS__CONTAINED_DTO_CONTAINERS, newContained_dtoContainers,
					newContained_dtoContainers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesSyntax getPorpertiesSyntax() {
		return porpertiesSyntax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPorpertiesSyntax(PropertiesSyntax newPorpertiesSyntax) {
		PropertiesSyntax oldPorpertiesSyntax = porpertiesSyntax;
		porpertiesSyntax = newPorpertiesSyntax == null ? PORPERTIES_SYNTAX_EDEFAULT : newPorpertiesSyntax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ColmenaMLIPackage.FUNCTIONAL_MS__PORPERTIES_SYNTAX,
					oldPorpertiesSyntax, porpertiesSyntax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependenciesManager getDependenciesManager() {
		return dependenciesManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependenciesManager(DependenciesManager newDependenciesManager) {
		DependenciesManager oldDependenciesManager = dependenciesManager;
		dependenciesManager = newDependenciesManager == null ? DEPENDENCIES_MANAGER_EDEFAULT : newDependenciesManager;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ColmenaMLIPackage.FUNCTIONAL_MS__DEPENDENCIES_MANAGER,
					oldDependenciesManager, dependenciesManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ColmenaMLIPackage.FUNCTIONAL_MS__CONTAINED_CONTRACTS:
			return ((InternalEList<?>) getContained_contracts()).basicRemove(otherEnd, msgs);
		case ColmenaMLIPackage.FUNCTIONAL_MS__CONTAINED_PACKAGES:
			return basicSetContained_packages(null, msgs);
		case ColmenaMLIPackage.FUNCTIONAL_MS__CONTAINED_DTO_CONTAINERS:
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
		case ColmenaMLIPackage.FUNCTIONAL_MS__CONTAINED_CONTRACTS:
			return getContained_contracts();
		case ColmenaMLIPackage.FUNCTIONAL_MS__CONTAINED_PACKAGES:
			return getContained_packages();
		case ColmenaMLIPackage.FUNCTIONAL_MS__CONTAINED_DTO_CONTAINERS:
			return getContained_dtoContainers();
		case ColmenaMLIPackage.FUNCTIONAL_MS__PORPERTIES_SYNTAX:
			return getPorpertiesSyntax();
		case ColmenaMLIPackage.FUNCTIONAL_MS__DEPENDENCIES_MANAGER:
			return getDependenciesManager();
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
		case ColmenaMLIPackage.FUNCTIONAL_MS__CONTAINED_CONTRACTS:
			getContained_contracts().clear();
			getContained_contracts().addAll((Collection<? extends Contract>) newValue);
			return;
		case ColmenaMLIPackage.FUNCTIONAL_MS__CONTAINED_PACKAGES:
			setContained_packages((colmenaML.Package) newValue);
			return;
		case ColmenaMLIPackage.FUNCTIONAL_MS__CONTAINED_DTO_CONTAINERS:
			setContained_dtoContainers((DTOContainer) newValue);
			return;
		case ColmenaMLIPackage.FUNCTIONAL_MS__PORPERTIES_SYNTAX:
			setPorpertiesSyntax((PropertiesSyntax) newValue);
			return;
		case ColmenaMLIPackage.FUNCTIONAL_MS__DEPENDENCIES_MANAGER:
			setDependenciesManager((DependenciesManager) newValue);
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
		case ColmenaMLIPackage.FUNCTIONAL_MS__CONTAINED_CONTRACTS:
			getContained_contracts().clear();
			return;
		case ColmenaMLIPackage.FUNCTIONAL_MS__CONTAINED_PACKAGES:
			setContained_packages((colmenaML.Package) null);
			return;
		case ColmenaMLIPackage.FUNCTIONAL_MS__CONTAINED_DTO_CONTAINERS:
			setContained_dtoContainers((DTOContainer) null);
			return;
		case ColmenaMLIPackage.FUNCTIONAL_MS__PORPERTIES_SYNTAX:
			setPorpertiesSyntax(PORPERTIES_SYNTAX_EDEFAULT);
			return;
		case ColmenaMLIPackage.FUNCTIONAL_MS__DEPENDENCIES_MANAGER:
			setDependenciesManager(DEPENDENCIES_MANAGER_EDEFAULT);
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
		case ColmenaMLIPackage.FUNCTIONAL_MS__CONTAINED_CONTRACTS:
			return contained_contracts != null && !contained_contracts.isEmpty();
		case ColmenaMLIPackage.FUNCTIONAL_MS__CONTAINED_PACKAGES:
			return contained_packages != null;
		case ColmenaMLIPackage.FUNCTIONAL_MS__CONTAINED_DTO_CONTAINERS:
			return contained_dtoContainers != null;
		case ColmenaMLIPackage.FUNCTIONAL_MS__PORPERTIES_SYNTAX:
			return porpertiesSyntax != PORPERTIES_SYNTAX_EDEFAULT;
		case ColmenaMLIPackage.FUNCTIONAL_MS__DEPENDENCIES_MANAGER:
			return dependenciesManager != DEPENDENCIES_MANAGER_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ClassDiagram.class) {
			switch (derivedFeatureID) {
			case ColmenaMLIPackage.FUNCTIONAL_MS__CONTAINED_CONTRACTS:
				return ColmenaMLPackage.CLASS_DIAGRAM__CONTAINED_CONTRACTS;
			case ColmenaMLIPackage.FUNCTIONAL_MS__CONTAINED_PACKAGES:
				return ColmenaMLPackage.CLASS_DIAGRAM__CONTAINED_PACKAGES;
			case ColmenaMLIPackage.FUNCTIONAL_MS__CONTAINED_DTO_CONTAINERS:
				return ColmenaMLPackage.CLASS_DIAGRAM__CONTAINED_DTO_CONTAINERS;
			default:
				return -1;
			}
		}
		if (baseClass == Diagrama.class) {
			switch (derivedFeatureID) {
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ClassDiagram.class) {
			switch (baseFeatureID) {
			case ColmenaMLPackage.CLASS_DIAGRAM__CONTAINED_CONTRACTS:
				return ColmenaMLIPackage.FUNCTIONAL_MS__CONTAINED_CONTRACTS;
			case ColmenaMLPackage.CLASS_DIAGRAM__CONTAINED_PACKAGES:
				return ColmenaMLIPackage.FUNCTIONAL_MS__CONTAINED_PACKAGES;
			case ColmenaMLPackage.CLASS_DIAGRAM__CONTAINED_DTO_CONTAINERS:
				return ColmenaMLIPackage.FUNCTIONAL_MS__CONTAINED_DTO_CONTAINERS;
			default:
				return -1;
			}
		}
		if (baseClass == Diagrama.class) {
			switch (baseFeatureID) {
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (porpertiesSyntax: ");
		result.append(porpertiesSyntax);
		result.append(", dependenciesManager: ");
		result.append(dependenciesManager);
		result.append(')');
		return result.toString();
	}

} //FunctionalMsImpl
