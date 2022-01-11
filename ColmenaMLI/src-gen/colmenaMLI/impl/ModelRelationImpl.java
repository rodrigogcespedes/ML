/**
 */
package colmenaMLI.impl;

import colmenaML.Relation;

import colmenaMLI.ColmenaMLIPackage;
import colmenaMLI.ModelRelation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link colmenaMLI.impl.ModelRelationImpl#getClassesRelation <em>Classes Relation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelRelationImpl extends RelationImpl implements ModelRelation {
	/**
	 * The cached value of the '{@link #getClassesRelation() <em>Classes Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassesRelation()
	 * @generated
	 * @ordered
	 */
	protected Relation classesRelation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ColmenaMLIPackage.Literals.MODEL_RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation getClassesRelation() {
		if (classesRelation != null && classesRelation.eIsProxy()) {
			InternalEObject oldClassesRelation = (InternalEObject) classesRelation;
			classesRelation = (Relation) eResolveProxy(oldClassesRelation);
			if (classesRelation != oldClassesRelation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ColmenaMLIPackage.MODEL_RELATION__CLASSES_RELATION, oldClassesRelation, classesRelation));
			}
		}
		return classesRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation basicGetClassesRelation() {
		return classesRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassesRelation(Relation newClassesRelation) {
		Relation oldClassesRelation = classesRelation;
		classesRelation = newClassesRelation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ColmenaMLIPackage.MODEL_RELATION__CLASSES_RELATION,
					oldClassesRelation, classesRelation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ColmenaMLIPackage.MODEL_RELATION__CLASSES_RELATION:
			if (resolve)
				return getClassesRelation();
			return basicGetClassesRelation();
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
		case ColmenaMLIPackage.MODEL_RELATION__CLASSES_RELATION:
			setClassesRelation((Relation) newValue);
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
		case ColmenaMLIPackage.MODEL_RELATION__CLASSES_RELATION:
			setClassesRelation((Relation) null);
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
		case ColmenaMLIPackage.MODEL_RELATION__CLASSES_RELATION:
			return classesRelation != null;
		}
		return super.eIsSet(featureID);
	}

} //ModelRelationImpl
