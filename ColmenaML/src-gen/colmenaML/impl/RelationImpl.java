/**
 */
package colmenaML.impl;

import colmenaML.AccessModifiers;
import colmenaML.CRUDType;
import colmenaML.Classifier;
import colmenaML.ColmenaMLPackage;
import colmenaML.Relation;
import colmenaML.RelationMultiplicity;
import colmenaML.RelationType;

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
 * An implementation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link colmenaML.impl.RelationImpl#getName <em>Name</em>}</li>
 *   <li>{@link colmenaML.impl.RelationImpl#getType <em>Type</em>}</li>
 *   <li>{@link colmenaML.impl.RelationImpl#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link colmenaML.impl.RelationImpl#isIsFinal <em>Is Final</em>}</li>
 *   <li>{@link colmenaML.impl.RelationImpl#isIsStatic <em>Is Static</em>}</li>
 *   <li>{@link colmenaML.impl.RelationImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link colmenaML.impl.RelationImpl#getCrudType <em>Crud Type</em>}</li>
 *   <li>{@link colmenaML.impl.RelationImpl#isSubordinate <em>Subordinate</em>}</li>
 *   <li>{@link colmenaML.impl.RelationImpl#getAssociative_classes_contained <em>Associative classes contained</em>}</li>
 *   <li>{@link colmenaML.impl.RelationImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link colmenaML.impl.RelationImpl#getOrigin <em>Origin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationImpl extends MinimalEObjectImpl.Container implements Relation {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final RelationType TYPE_EDEFAULT = RelationType.UNIDIRECTIONAL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected RelationType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected static final RelationMultiplicity MULTIPLICITY_EDEFAULT = RelationMultiplicity.ONE_TO_ONE;

	/**
	 * The cached value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected RelationMultiplicity multiplicity = MULTIPLICITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsFinal() <em>Is Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFinal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FINAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsFinal() <em>Is Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFinal()
	 * @generated
	 * @ordered
	 */
	protected boolean isFinal = IS_FINAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsStatic() <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStatic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_STATIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsStatic() <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStatic()
	 * @generated
	 * @ordered
	 */
	protected boolean isStatic = IS_STATIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final AccessModifiers VISIBILITY_EDEFAULT = AccessModifiers.PRIVATE;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected AccessModifiers visibility = VISIBILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCrudType() <em>Crud Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrudType()
	 * @generated
	 * @ordered
	 */
	protected static final CRUDType CRUD_TYPE_EDEFAULT = CRUDType.SIMPLE;

	/**
	 * The cached value of the '{@link #getCrudType() <em>Crud Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrudType()
	 * @generated
	 * @ordered
	 */
	protected CRUDType crudType = CRUD_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isSubordinate() <em>Subordinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSubordinate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SUBORDINATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSubordinate() <em>Subordinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSubordinate()
	 * @generated
	 * @ordered
	 */
	protected boolean subordinate = SUBORDINATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssociative_classes_contained() <em>Associative classes contained</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociative_classes_contained()
	 * @generated
	 * @ordered
	 */
	protected EList<colmenaML.Class> associative_classes_contained;

	/**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected Classifier destination;

	/**
	 * The cached value of the '{@link #getOrigin() <em>Origin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected colmenaML.Class origin;

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
		return ColmenaMLPackage.Literals.RELATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ColmenaMLPackage.RELATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(RelationType newType) {
		RelationType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ColmenaMLPackage.RELATION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationMultiplicity getMultiplicity() {
		return multiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicity(RelationMultiplicity newMultiplicity) {
		RelationMultiplicity oldMultiplicity = multiplicity;
		multiplicity = newMultiplicity == null ? MULTIPLICITY_EDEFAULT : newMultiplicity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ColmenaMLPackage.RELATION__MULTIPLICITY,
					oldMultiplicity, multiplicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsFinal() {
		return isFinal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsFinal(boolean newIsFinal) {
		boolean oldIsFinal = isFinal;
		isFinal = newIsFinal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ColmenaMLPackage.RELATION__IS_FINAL, oldIsFinal,
					isFinal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsStatic() {
		return isStatic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsStatic(boolean newIsStatic) {
		boolean oldIsStatic = isStatic;
		isStatic = newIsStatic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ColmenaMLPackage.RELATION__IS_STATIC, oldIsStatic,
					isStatic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessModifiers getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(AccessModifiers newVisibility) {
		AccessModifiers oldVisibility = visibility;
		visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ColmenaMLPackage.RELATION__VISIBILITY, oldVisibility,
					visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CRUDType getCrudType() {
		return crudType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCrudType(CRUDType newCrudType) {
		CRUDType oldCrudType = crudType;
		crudType = newCrudType == null ? CRUD_TYPE_EDEFAULT : newCrudType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ColmenaMLPackage.RELATION__CRUD_TYPE, oldCrudType,
					crudType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSubordinate() {
		return subordinate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubordinate(boolean newSubordinate) {
		boolean oldSubordinate = subordinate;
		subordinate = newSubordinate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ColmenaMLPackage.RELATION__SUBORDINATE,
					oldSubordinate, subordinate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<colmenaML.Class> getAssociative_classes_contained() {
		if (associative_classes_contained == null) {
			associative_classes_contained = new EObjectContainmentEList<colmenaML.Class>(colmenaML.Class.class, this,
					ColmenaMLPackage.RELATION__ASSOCIATIVE_CLASSES_CONTAINED);
		}
		return associative_classes_contained;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getDestination() {
		if (destination != null && destination.eIsProxy()) {
			InternalEObject oldDestination = (InternalEObject) destination;
			destination = (Classifier) eResolveProxy(oldDestination);
			if (destination != oldDestination) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ColmenaMLPackage.RELATION__DESTINATION,
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
	public Classifier basicGetDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestination(Classifier newDestination) {
		Classifier oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ColmenaMLPackage.RELATION__DESTINATION,
					oldDestination, destination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public colmenaML.Class getOrigin() {
		if (origin != null && origin.eIsProxy()) {
			InternalEObject oldOrigin = (InternalEObject) origin;
			origin = (colmenaML.Class) eResolveProxy(oldOrigin);
			if (origin != oldOrigin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ColmenaMLPackage.RELATION__ORIGIN,
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
	public colmenaML.Class basicGetOrigin() {
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrigin(colmenaML.Class newOrigin) {
		colmenaML.Class oldOrigin = origin;
		origin = newOrigin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ColmenaMLPackage.RELATION__ORIGIN, oldOrigin,
					origin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ColmenaMLPackage.RELATION__ASSOCIATIVE_CLASSES_CONTAINED:
			return ((InternalEList<?>) getAssociative_classes_contained()).basicRemove(otherEnd, msgs);
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
		case ColmenaMLPackage.RELATION__NAME:
			return getName();
		case ColmenaMLPackage.RELATION__TYPE:
			return getType();
		case ColmenaMLPackage.RELATION__MULTIPLICITY:
			return getMultiplicity();
		case ColmenaMLPackage.RELATION__IS_FINAL:
			return isIsFinal();
		case ColmenaMLPackage.RELATION__IS_STATIC:
			return isIsStatic();
		case ColmenaMLPackage.RELATION__VISIBILITY:
			return getVisibility();
		case ColmenaMLPackage.RELATION__CRUD_TYPE:
			return getCrudType();
		case ColmenaMLPackage.RELATION__SUBORDINATE:
			return isSubordinate();
		case ColmenaMLPackage.RELATION__ASSOCIATIVE_CLASSES_CONTAINED:
			return getAssociative_classes_contained();
		case ColmenaMLPackage.RELATION__DESTINATION:
			if (resolve)
				return getDestination();
			return basicGetDestination();
		case ColmenaMLPackage.RELATION__ORIGIN:
			if (resolve)
				return getOrigin();
			return basicGetOrigin();
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
		case ColmenaMLPackage.RELATION__NAME:
			setName((String) newValue);
			return;
		case ColmenaMLPackage.RELATION__TYPE:
			setType((RelationType) newValue);
			return;
		case ColmenaMLPackage.RELATION__MULTIPLICITY:
			setMultiplicity((RelationMultiplicity) newValue);
			return;
		case ColmenaMLPackage.RELATION__IS_FINAL:
			setIsFinal((Boolean) newValue);
			return;
		case ColmenaMLPackage.RELATION__IS_STATIC:
			setIsStatic((Boolean) newValue);
			return;
		case ColmenaMLPackage.RELATION__VISIBILITY:
			setVisibility((AccessModifiers) newValue);
			return;
		case ColmenaMLPackage.RELATION__CRUD_TYPE:
			setCrudType((CRUDType) newValue);
			return;
		case ColmenaMLPackage.RELATION__SUBORDINATE:
			setSubordinate((Boolean) newValue);
			return;
		case ColmenaMLPackage.RELATION__ASSOCIATIVE_CLASSES_CONTAINED:
			getAssociative_classes_contained().clear();
			getAssociative_classes_contained().addAll((Collection<? extends colmenaML.Class>) newValue);
			return;
		case ColmenaMLPackage.RELATION__DESTINATION:
			setDestination((Classifier) newValue);
			return;
		case ColmenaMLPackage.RELATION__ORIGIN:
			setOrigin((colmenaML.Class) newValue);
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
		case ColmenaMLPackage.RELATION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ColmenaMLPackage.RELATION__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case ColmenaMLPackage.RELATION__MULTIPLICITY:
			setMultiplicity(MULTIPLICITY_EDEFAULT);
			return;
		case ColmenaMLPackage.RELATION__IS_FINAL:
			setIsFinal(IS_FINAL_EDEFAULT);
			return;
		case ColmenaMLPackage.RELATION__IS_STATIC:
			setIsStatic(IS_STATIC_EDEFAULT);
			return;
		case ColmenaMLPackage.RELATION__VISIBILITY:
			setVisibility(VISIBILITY_EDEFAULT);
			return;
		case ColmenaMLPackage.RELATION__CRUD_TYPE:
			setCrudType(CRUD_TYPE_EDEFAULT);
			return;
		case ColmenaMLPackage.RELATION__SUBORDINATE:
			setSubordinate(SUBORDINATE_EDEFAULT);
			return;
		case ColmenaMLPackage.RELATION__ASSOCIATIVE_CLASSES_CONTAINED:
			getAssociative_classes_contained().clear();
			return;
		case ColmenaMLPackage.RELATION__DESTINATION:
			setDestination((Classifier) null);
			return;
		case ColmenaMLPackage.RELATION__ORIGIN:
			setOrigin((colmenaML.Class) null);
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
		case ColmenaMLPackage.RELATION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ColmenaMLPackage.RELATION__TYPE:
			return type != TYPE_EDEFAULT;
		case ColmenaMLPackage.RELATION__MULTIPLICITY:
			return multiplicity != MULTIPLICITY_EDEFAULT;
		case ColmenaMLPackage.RELATION__IS_FINAL:
			return isFinal != IS_FINAL_EDEFAULT;
		case ColmenaMLPackage.RELATION__IS_STATIC:
			return isStatic != IS_STATIC_EDEFAULT;
		case ColmenaMLPackage.RELATION__VISIBILITY:
			return visibility != VISIBILITY_EDEFAULT;
		case ColmenaMLPackage.RELATION__CRUD_TYPE:
			return crudType != CRUD_TYPE_EDEFAULT;
		case ColmenaMLPackage.RELATION__SUBORDINATE:
			return subordinate != SUBORDINATE_EDEFAULT;
		case ColmenaMLPackage.RELATION__ASSOCIATIVE_CLASSES_CONTAINED:
			return associative_classes_contained != null && !associative_classes_contained.isEmpty();
		case ColmenaMLPackage.RELATION__DESTINATION:
			return destination != null;
		case ColmenaMLPackage.RELATION__ORIGIN:
			return origin != null;
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
		result.append(", type: ");
		result.append(type);
		result.append(", multiplicity: ");
		result.append(multiplicity);
		result.append(", isFinal: ");
		result.append(isFinal);
		result.append(", isStatic: ");
		result.append(isStatic);
		result.append(", visibility: ");
		result.append(visibility);
		result.append(", crudType: ");
		result.append(crudType);
		result.append(", subordinate: ");
		result.append(subordinate);
		result.append(')');
		return result.toString();
	}

} //RelationImpl
