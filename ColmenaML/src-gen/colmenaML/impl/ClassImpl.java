/**
 */
package colmenaML.impl;

import colmenaML.CRUDType;
import colmenaML.ColmenaMLPackage;
import colmenaML.Implementation;
import colmenaML.Relation;

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
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link colmenaML.impl.ClassImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link colmenaML.impl.ClassImpl#isIsAssociative <em>Is Associative</em>}</li>
 *   <li>{@link colmenaML.impl.ClassImpl#isIsAuditable <em>Is Auditable</em>}</li>
 *   <li>{@link colmenaML.impl.ClassImpl#getCrudType <em>Crud Type</em>}</li>
 *   <li>{@link colmenaML.impl.ClassImpl#getContained_relations <em>Contained relations</em>}</li>
 *   <li>{@link colmenaML.impl.ClassImpl#getContained_implementations <em>Contained implementations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassImpl extends ClassifierImpl implements colmenaML.Class {
	/**
	 * The default value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean isAbstract = IS_ABSTRACT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsAssociative() <em>Is Associative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAssociative()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ASSOCIATIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAssociative() <em>Is Associative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAssociative()
	 * @generated
	 * @ordered
	 */
	protected boolean isAssociative = IS_ASSOCIATIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsAuditable() <em>Is Auditable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAuditable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_AUDITABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAuditable() <em>Is Auditable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAuditable()
	 * @generated
	 * @ordered
	 */
	protected boolean isAuditable = IS_AUDITABLE_EDEFAULT;

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
	 * The cached value of the '{@link #getContained_relations() <em>Contained relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContained_relations()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> contained_relations;

	/**
	 * The cached value of the '{@link #getContained_implementations() <em>Contained implementations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContained_implementations()
	 * @generated
	 * @ordered
	 */
	protected EList<Implementation> contained_implementations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ColmenaMLPackage.Literals.CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAbstract() {
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstract(boolean newIsAbstract) {
		boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ColmenaMLPackage.CLASS__IS_ABSTRACT, oldIsAbstract,
					isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAssociative() {
		return isAssociative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAssociative(boolean newIsAssociative) {
		boolean oldIsAssociative = isAssociative;
		isAssociative = newIsAssociative;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ColmenaMLPackage.CLASS__IS_ASSOCIATIVE,
					oldIsAssociative, isAssociative));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAuditable() {
		return isAuditable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAuditable(boolean newIsAuditable) {
		boolean oldIsAuditable = isAuditable;
		isAuditable = newIsAuditable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ColmenaMLPackage.CLASS__IS_AUDITABLE, oldIsAuditable,
					isAuditable));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ColmenaMLPackage.CLASS__CRUD_TYPE, oldCrudType,
					crudType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relation> getContained_relations() {
		if (contained_relations == null) {
			contained_relations = new EObjectContainmentEList<Relation>(Relation.class, this,
					ColmenaMLPackage.CLASS__CONTAINED_RELATIONS);
		}
		return contained_relations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Implementation> getContained_implementations() {
		if (contained_implementations == null) {
			contained_implementations = new EObjectContainmentEList<Implementation>(Implementation.class, this,
					ColmenaMLPackage.CLASS__CONTAINED_IMPLEMENTATIONS);
		}
		return contained_implementations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ColmenaMLPackage.CLASS__CONTAINED_RELATIONS:
			return ((InternalEList<?>) getContained_relations()).basicRemove(otherEnd, msgs);
		case ColmenaMLPackage.CLASS__CONTAINED_IMPLEMENTATIONS:
			return ((InternalEList<?>) getContained_implementations()).basicRemove(otherEnd, msgs);
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
		case ColmenaMLPackage.CLASS__IS_ABSTRACT:
			return isIsAbstract();
		case ColmenaMLPackage.CLASS__IS_ASSOCIATIVE:
			return isIsAssociative();
		case ColmenaMLPackage.CLASS__IS_AUDITABLE:
			return isIsAuditable();
		case ColmenaMLPackage.CLASS__CRUD_TYPE:
			return getCrudType();
		case ColmenaMLPackage.CLASS__CONTAINED_RELATIONS:
			return getContained_relations();
		case ColmenaMLPackage.CLASS__CONTAINED_IMPLEMENTATIONS:
			return getContained_implementations();
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
		case ColmenaMLPackage.CLASS__IS_ABSTRACT:
			setIsAbstract((Boolean) newValue);
			return;
		case ColmenaMLPackage.CLASS__IS_ASSOCIATIVE:
			setIsAssociative((Boolean) newValue);
			return;
		case ColmenaMLPackage.CLASS__IS_AUDITABLE:
			setIsAuditable((Boolean) newValue);
			return;
		case ColmenaMLPackage.CLASS__CRUD_TYPE:
			setCrudType((CRUDType) newValue);
			return;
		case ColmenaMLPackage.CLASS__CONTAINED_RELATIONS:
			getContained_relations().clear();
			getContained_relations().addAll((Collection<? extends Relation>) newValue);
			return;
		case ColmenaMLPackage.CLASS__CONTAINED_IMPLEMENTATIONS:
			getContained_implementations().clear();
			getContained_implementations().addAll((Collection<? extends Implementation>) newValue);
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
		case ColmenaMLPackage.CLASS__IS_ABSTRACT:
			setIsAbstract(IS_ABSTRACT_EDEFAULT);
			return;
		case ColmenaMLPackage.CLASS__IS_ASSOCIATIVE:
			setIsAssociative(IS_ASSOCIATIVE_EDEFAULT);
			return;
		case ColmenaMLPackage.CLASS__IS_AUDITABLE:
			setIsAuditable(IS_AUDITABLE_EDEFAULT);
			return;
		case ColmenaMLPackage.CLASS__CRUD_TYPE:
			setCrudType(CRUD_TYPE_EDEFAULT);
			return;
		case ColmenaMLPackage.CLASS__CONTAINED_RELATIONS:
			getContained_relations().clear();
			return;
		case ColmenaMLPackage.CLASS__CONTAINED_IMPLEMENTATIONS:
			getContained_implementations().clear();
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
		case ColmenaMLPackage.CLASS__IS_ABSTRACT:
			return isAbstract != IS_ABSTRACT_EDEFAULT;
		case ColmenaMLPackage.CLASS__IS_ASSOCIATIVE:
			return isAssociative != IS_ASSOCIATIVE_EDEFAULT;
		case ColmenaMLPackage.CLASS__IS_AUDITABLE:
			return isAuditable != IS_AUDITABLE_EDEFAULT;
		case ColmenaMLPackage.CLASS__CRUD_TYPE:
			return crudType != CRUD_TYPE_EDEFAULT;
		case ColmenaMLPackage.CLASS__CONTAINED_RELATIONS:
			return contained_relations != null && !contained_relations.isEmpty();
		case ColmenaMLPackage.CLASS__CONTAINED_IMPLEMENTATIONS:
			return contained_implementations != null && !contained_implementations.isEmpty();
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
		result.append(" (isAbstract: ");
		result.append(isAbstract);
		result.append(", isAssociative: ");
		result.append(isAssociative);
		result.append(", isAuditable: ");
		result.append(isAuditable);
		result.append(", crudType: ");
		result.append(crudType);
		result.append(')');
		return result.toString();
	}

} //ClassImpl
