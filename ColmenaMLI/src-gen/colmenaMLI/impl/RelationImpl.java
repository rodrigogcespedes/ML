/**
 */
package colmenaMLI.impl;

import colmenaMLI.ColmenaMLIPackage;
import colmenaMLI.Microservice;
import colmenaMLI.Relation;
import colmenaMLI.RelationType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link colmenaMLI.impl.RelationImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link colmenaMLI.impl.RelationImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link colmenaMLI.impl.RelationImpl#getRelationType <em>Relation Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RelationImpl extends MinimalEObjectImpl.Container implements Relation {
	/**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected Microservice destination;

	/**
	 * The cached value of the '{@link #getOrigin() <em>Origin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected Microservice origin;

	/**
	 * The default value of the '{@link #getRelationType() <em>Relation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationType()
	 * @generated
	 * @ordered
	 */
	protected static final RelationType RELATION_TYPE_EDEFAULT = RelationType.AUTHENTICATED_BY;

	/**
	 * The cached value of the '{@link #getRelationType() <em>Relation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationType()
	 * @generated
	 * @ordered
	 */
	protected RelationType relationType = RELATION_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ColmenaMLIPackage.Literals.RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Microservice getDestination() {
		if (destination != null && destination.eIsProxy()) {
			InternalEObject oldDestination = (InternalEObject) destination;
			destination = (Microservice) eResolveProxy(oldDestination);
			if (destination != oldDestination) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ColmenaMLIPackage.RELATION__DESTINATION,
							oldDestination, destination));
			}
		}
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Microservice basicGetDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestination(Microservice newDestination) {
		Microservice oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ColmenaMLIPackage.RELATION__DESTINATION,
					oldDestination, destination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Microservice getOrigin() {
		if (origin != null && origin.eIsProxy()) {
			InternalEObject oldOrigin = (InternalEObject) origin;
			origin = (Microservice) eResolveProxy(oldOrigin);
			if (origin != oldOrigin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ColmenaMLIPackage.RELATION__ORIGIN,
							oldOrigin, origin));
			}
		}
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Microservice basicGetOrigin() {
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrigin(Microservice newOrigin) {
		Microservice oldOrigin = origin;
		origin = newOrigin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ColmenaMLIPackage.RELATION__ORIGIN, oldOrigin,
					origin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationType getRelationType() {
		return relationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationType(RelationType newRelationType) {
		RelationType oldRelationType = relationType;
		relationType = newRelationType == null ? RELATION_TYPE_EDEFAULT : newRelationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ColmenaMLIPackage.RELATION__RELATION_TYPE,
					oldRelationType, relationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ColmenaMLIPackage.RELATION__DESTINATION:
			if (resolve)
				return getDestination();
			return basicGetDestination();
		case ColmenaMLIPackage.RELATION__ORIGIN:
			if (resolve)
				return getOrigin();
			return basicGetOrigin();
		case ColmenaMLIPackage.RELATION__RELATION_TYPE:
			return getRelationType();
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
		case ColmenaMLIPackage.RELATION__DESTINATION:
			setDestination((Microservice) newValue);
			return;
		case ColmenaMLIPackage.RELATION__ORIGIN:
			setOrigin((Microservice) newValue);
			return;
		case ColmenaMLIPackage.RELATION__RELATION_TYPE:
			setRelationType((RelationType) newValue);
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
		case ColmenaMLIPackage.RELATION__DESTINATION:
			setDestination((Microservice) null);
			return;
		case ColmenaMLIPackage.RELATION__ORIGIN:
			setOrigin((Microservice) null);
			return;
		case ColmenaMLIPackage.RELATION__RELATION_TYPE:
			setRelationType(RELATION_TYPE_EDEFAULT);
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
		case ColmenaMLIPackage.RELATION__DESTINATION:
			return destination != null;
		case ColmenaMLIPackage.RELATION__ORIGIN:
			return origin != null;
		case ColmenaMLIPackage.RELATION__RELATION_TYPE:
			return relationType != RELATION_TYPE_EDEFAULT;
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
		result.append(" (relationType: ");
		result.append(relationType);
		result.append(')');
		return result.toString();
	}

} //RelationImpl
