/**
 */
package colmenaML.impl;

import colmenaML.Attribute;
import colmenaML.ColmenaMLPackage;
import colmenaML.DataType;
import colmenaML.GraphicRepresentation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link colmenaML.impl.AttributeImpl#getType <em>Type</em>}</li>
 *   <li>{@link colmenaML.impl.AttributeImpl#isIsAuditable <em>Is Auditable</em>}</li>
 *   <li>{@link colmenaML.impl.AttributeImpl#getPseudonym <em>Pseudonym</em>}</li>
 *   <li>{@link colmenaML.impl.AttributeImpl#getGraphicRepresentation <em>Graphic Representation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeImpl extends ReturnableImpl implements Attribute {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final DataType TYPE_EDEFAULT = DataType.INT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected DataType type = TYPE_EDEFAULT;

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
	 * The default value of the '{@link #getPseudonym() <em>Pseudonym</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPseudonym()
	 * @generated
	 * @ordered
	 */
	protected static final String PSEUDONYM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPseudonym() <em>Pseudonym</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPseudonym()
	 * @generated
	 * @ordered
	 */
	protected String pseudonym = PSEUDONYM_EDEFAULT;

	/**
	 * The default value of the '{@link #getGraphicRepresentation() <em>Graphic Representation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphicRepresentation()
	 * @generated
	 * @ordered
	 */
	protected static final GraphicRepresentation GRAPHIC_REPRESENTATION_EDEFAULT = GraphicRepresentation.TEXT;

	/**
	 * The cached value of the '{@link #getGraphicRepresentation() <em>Graphic Representation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphicRepresentation()
	 * @generated
	 * @ordered
	 */
	protected GraphicRepresentation graphicRepresentation = GRAPHIC_REPRESENTATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ColmenaMLPackage.Literals.ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(DataType newType) {
		DataType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ColmenaMLPackage.ATTRIBUTE__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ColmenaMLPackage.ATTRIBUTE__IS_AUDITABLE,
					oldIsAuditable, isAuditable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPseudonym() {
		return pseudonym;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPseudonym(String newPseudonym) {
		String oldPseudonym = pseudonym;
		pseudonym = newPseudonym;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ColmenaMLPackage.ATTRIBUTE__PSEUDONYM, oldPseudonym,
					pseudonym));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphicRepresentation getGraphicRepresentation() {
		return graphicRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGraphicRepresentation(GraphicRepresentation newGraphicRepresentation) {
		GraphicRepresentation oldGraphicRepresentation = graphicRepresentation;
		graphicRepresentation = newGraphicRepresentation == null ? GRAPHIC_REPRESENTATION_EDEFAULT
				: newGraphicRepresentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ColmenaMLPackage.ATTRIBUTE__GRAPHIC_REPRESENTATION,
					oldGraphicRepresentation, graphicRepresentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ColmenaMLPackage.ATTRIBUTE__TYPE:
			return getType();
		case ColmenaMLPackage.ATTRIBUTE__IS_AUDITABLE:
			return isIsAuditable();
		case ColmenaMLPackage.ATTRIBUTE__PSEUDONYM:
			return getPseudonym();
		case ColmenaMLPackage.ATTRIBUTE__GRAPHIC_REPRESENTATION:
			return getGraphicRepresentation();
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
		case ColmenaMLPackage.ATTRIBUTE__TYPE:
			setType((DataType) newValue);
			return;
		case ColmenaMLPackage.ATTRIBUTE__IS_AUDITABLE:
			setIsAuditable((Boolean) newValue);
			return;
		case ColmenaMLPackage.ATTRIBUTE__PSEUDONYM:
			setPseudonym((String) newValue);
			return;
		case ColmenaMLPackage.ATTRIBUTE__GRAPHIC_REPRESENTATION:
			setGraphicRepresentation((GraphicRepresentation) newValue);
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
		case ColmenaMLPackage.ATTRIBUTE__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case ColmenaMLPackage.ATTRIBUTE__IS_AUDITABLE:
			setIsAuditable(IS_AUDITABLE_EDEFAULT);
			return;
		case ColmenaMLPackage.ATTRIBUTE__PSEUDONYM:
			setPseudonym(PSEUDONYM_EDEFAULT);
			return;
		case ColmenaMLPackage.ATTRIBUTE__GRAPHIC_REPRESENTATION:
			setGraphicRepresentation(GRAPHIC_REPRESENTATION_EDEFAULT);
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
		case ColmenaMLPackage.ATTRIBUTE__TYPE:
			return type != TYPE_EDEFAULT;
		case ColmenaMLPackage.ATTRIBUTE__IS_AUDITABLE:
			return isAuditable != IS_AUDITABLE_EDEFAULT;
		case ColmenaMLPackage.ATTRIBUTE__PSEUDONYM:
			return PSEUDONYM_EDEFAULT == null ? pseudonym != null : !PSEUDONYM_EDEFAULT.equals(pseudonym);
		case ColmenaMLPackage.ATTRIBUTE__GRAPHIC_REPRESENTATION:
			return graphicRepresentation != GRAPHIC_REPRESENTATION_EDEFAULT;
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
		result.append(" (type: ");
		result.append(type);
		result.append(", isAuditable: ");
		result.append(isAuditable);
		result.append(", pseudonym: ");
		result.append(pseudonym);
		result.append(", graphicRepresentation: ");
		result.append(graphicRepresentation);
		result.append(')');
		return result.toString();
	}

} //AttributeImpl
