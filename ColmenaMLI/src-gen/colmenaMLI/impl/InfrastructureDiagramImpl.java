/**
 */
package colmenaMLI.impl;

import colmenaMLI.ColmenaMLIPackage;
import colmenaMLI.Configuration;
import colmenaMLI.Environment;
import colmenaMLI.InfrastructureDiagram;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Infrastructure Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link colmenaMLI.impl.InfrastructureDiagramImpl#getContained_configurations <em>Contained configurations</em>}</li>
 *   <li>{@link colmenaMLI.impl.InfrastructureDiagramImpl#getContained_environments <em>Contained environments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InfrastructureDiagramImpl extends MinimalEObjectImpl.Container implements InfrastructureDiagram {
	/**
	 * The cached value of the '{@link #getContained_configurations() <em>Contained configurations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContained_configurations()
	 * @generated
	 * @ordered
	 */
	protected EList<Configuration> contained_configurations;

	/**
	 * The cached value of the '{@link #getContained_environments() <em>Contained environments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContained_environments()
	 * @generated
	 * @ordered
	 */
	protected EList<Environment> contained_environments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfrastructureDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ColmenaMLIPackage.Literals.INFRASTRUCTURE_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Configuration> getContained_configurations() {
		if (contained_configurations == null) {
			contained_configurations = new EObjectContainmentEList<Configuration>(Configuration.class, this,
					ColmenaMLIPackage.INFRASTRUCTURE_DIAGRAM__CONTAINED_CONFIGURATIONS);
		}
		return contained_configurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Environment> getContained_environments() {
		if (contained_environments == null) {
			contained_environments = new EObjectContainmentEList<Environment>(Environment.class, this,
					ColmenaMLIPackage.INFRASTRUCTURE_DIAGRAM__CONTAINED_ENVIRONMENTS);
		}
		return contained_environments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ColmenaMLIPackage.INFRASTRUCTURE_DIAGRAM__CONTAINED_CONFIGURATIONS:
			return ((InternalEList<?>) getContained_configurations()).basicRemove(otherEnd, msgs);
		case ColmenaMLIPackage.INFRASTRUCTURE_DIAGRAM__CONTAINED_ENVIRONMENTS:
			return ((InternalEList<?>) getContained_environments()).basicRemove(otherEnd, msgs);
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
		case ColmenaMLIPackage.INFRASTRUCTURE_DIAGRAM__CONTAINED_CONFIGURATIONS:
			return getContained_configurations();
		case ColmenaMLIPackage.INFRASTRUCTURE_DIAGRAM__CONTAINED_ENVIRONMENTS:
			return getContained_environments();
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
		case ColmenaMLIPackage.INFRASTRUCTURE_DIAGRAM__CONTAINED_CONFIGURATIONS:
			getContained_configurations().clear();
			getContained_configurations().addAll((Collection<? extends Configuration>) newValue);
			return;
		case ColmenaMLIPackage.INFRASTRUCTURE_DIAGRAM__CONTAINED_ENVIRONMENTS:
			getContained_environments().clear();
			getContained_environments().addAll((Collection<? extends Environment>) newValue);
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
		case ColmenaMLIPackage.INFRASTRUCTURE_DIAGRAM__CONTAINED_CONFIGURATIONS:
			getContained_configurations().clear();
			return;
		case ColmenaMLIPackage.INFRASTRUCTURE_DIAGRAM__CONTAINED_ENVIRONMENTS:
			getContained_environments().clear();
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
		case ColmenaMLIPackage.INFRASTRUCTURE_DIAGRAM__CONTAINED_CONFIGURATIONS:
			return contained_configurations != null && !contained_configurations.isEmpty();
		case ColmenaMLIPackage.INFRASTRUCTURE_DIAGRAM__CONTAINED_ENVIRONMENTS:
			return contained_environments != null && !contained_environments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InfrastructureDiagramImpl
