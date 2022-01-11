/**
 */
package colmenaML.impl;

import colmenaML.ColmenaMLPackage;
import colmenaML.ContractExposure;
import colmenaML.ExposureParameters;
import colmenaML.ExposureReturnType;
import colmenaML.HTTPVerbs;

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
 * An implementation of the model object '<em><b>Contract Exposure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link colmenaML.impl.ContractExposureImpl#getVerbType <em>Verb Type</em>}</li>
 *   <li>{@link colmenaML.impl.ContractExposureImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link colmenaML.impl.ContractExposureImpl#getContained_parameters <em>Contained parameters</em>}</li>
 *   <li>{@link colmenaML.impl.ContractExposureImpl#getContained_returnType <em>Contained return Type</em>}</li>
 *   <li>{@link colmenaML.impl.ContractExposureImpl#getName <em>Name</em>}</li>
 *   <li>{@link colmenaML.impl.ContractExposureImpl#isFallbackFunction <em>Fallback Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContractExposureImpl extends MinimalEObjectImpl.Container implements ContractExposure {
	/**
	 * The default value of the '{@link #getVerbType() <em>Verb Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerbType()
	 * @generated
	 * @ordered
	 */
	protected static final HTTPVerbs VERB_TYPE_EDEFAULT = HTTPVerbs.GET;

	/**
	 * The cached value of the '{@link #getVerbType() <em>Verb Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerbType()
	 * @generated
	 * @ordered
	 */
	protected HTTPVerbs verbType = VERB_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContained_parameters() <em>Contained parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContained_parameters()
	 * @generated
	 * @ordered
	 */
	protected EList<ExposureParameters> contained_parameters;

	/**
	 * The cached value of the '{@link #getContained_returnType() <em>Contained return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContained_returnType()
	 * @generated
	 * @ordered
	 */
	protected ExposureReturnType contained_returnType;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "";

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
	 * The default value of the '{@link #isFallbackFunction() <em>Fallback Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFallbackFunction()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FALLBACK_FUNCTION_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isFallbackFunction() <em>Fallback Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFallbackFunction()
	 * @generated
	 * @ordered
	 */
	protected boolean fallbackFunction = FALLBACK_FUNCTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContractExposureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ColmenaMLPackage.Literals.CONTRACT_EXPOSURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTTPVerbs getVerbType() {
		return verbType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerbType(HTTPVerbs newVerbType) {
		HTTPVerbs oldVerbType = verbType;
		verbType = newVerbType == null ? VERB_TYPE_EDEFAULT : newVerbType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ColmenaMLPackage.CONTRACT_EXPOSURE__VERB_TYPE,
					oldVerbType, verbType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ColmenaMLPackage.CONTRACT_EXPOSURE__URL, oldUrl,
					url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExposureParameters> getContained_parameters() {
		if (contained_parameters == null) {
			contained_parameters = new EObjectContainmentEList<ExposureParameters>(ExposureParameters.class, this,
					ColmenaMLPackage.CONTRACT_EXPOSURE__CONTAINED_PARAMETERS);
		}
		return contained_parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExposureReturnType getContained_returnType() {
		return contained_returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContained_returnType(ExposureReturnType newContained_returnType,
			NotificationChain msgs) {
		ExposureReturnType oldContained_returnType = contained_returnType;
		contained_returnType = newContained_returnType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ColmenaMLPackage.CONTRACT_EXPOSURE__CONTAINED_RETURN_TYPE, oldContained_returnType,
					newContained_returnType);
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
	public void setContained_returnType(ExposureReturnType newContained_returnType) {
		if (newContained_returnType != contained_returnType) {
			NotificationChain msgs = null;
			if (contained_returnType != null)
				msgs = ((InternalEObject) contained_returnType).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ColmenaMLPackage.CONTRACT_EXPOSURE__CONTAINED_RETURN_TYPE, null, msgs);
			if (newContained_returnType != null)
				msgs = ((InternalEObject) newContained_returnType).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ColmenaMLPackage.CONTRACT_EXPOSURE__CONTAINED_RETURN_TYPE, null, msgs);
			msgs = basicSetContained_returnType(newContained_returnType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ColmenaMLPackage.CONTRACT_EXPOSURE__CONTAINED_RETURN_TYPE, newContained_returnType,
					newContained_returnType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ColmenaMLPackage.CONTRACT_EXPOSURE__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFallbackFunction() {
		return fallbackFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFallbackFunction(boolean newFallbackFunction) {
		boolean oldFallbackFunction = fallbackFunction;
		fallbackFunction = newFallbackFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ColmenaMLPackage.CONTRACT_EXPOSURE__FALLBACK_FUNCTION,
					oldFallbackFunction, fallbackFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ColmenaMLPackage.CONTRACT_EXPOSURE__CONTAINED_PARAMETERS:
			return ((InternalEList<?>) getContained_parameters()).basicRemove(otherEnd, msgs);
		case ColmenaMLPackage.CONTRACT_EXPOSURE__CONTAINED_RETURN_TYPE:
			return basicSetContained_returnType(null, msgs);
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
		case ColmenaMLPackage.CONTRACT_EXPOSURE__VERB_TYPE:
			return getVerbType();
		case ColmenaMLPackage.CONTRACT_EXPOSURE__URL:
			return getUrl();
		case ColmenaMLPackage.CONTRACT_EXPOSURE__CONTAINED_PARAMETERS:
			return getContained_parameters();
		case ColmenaMLPackage.CONTRACT_EXPOSURE__CONTAINED_RETURN_TYPE:
			return getContained_returnType();
		case ColmenaMLPackage.CONTRACT_EXPOSURE__NAME:
			return getName();
		case ColmenaMLPackage.CONTRACT_EXPOSURE__FALLBACK_FUNCTION:
			return isFallbackFunction();
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
		case ColmenaMLPackage.CONTRACT_EXPOSURE__VERB_TYPE:
			setVerbType((HTTPVerbs) newValue);
			return;
		case ColmenaMLPackage.CONTRACT_EXPOSURE__URL:
			setUrl((String) newValue);
			return;
		case ColmenaMLPackage.CONTRACT_EXPOSURE__CONTAINED_PARAMETERS:
			getContained_parameters().clear();
			getContained_parameters().addAll((Collection<? extends ExposureParameters>) newValue);
			return;
		case ColmenaMLPackage.CONTRACT_EXPOSURE__CONTAINED_RETURN_TYPE:
			setContained_returnType((ExposureReturnType) newValue);
			return;
		case ColmenaMLPackage.CONTRACT_EXPOSURE__NAME:
			setName((String) newValue);
			return;
		case ColmenaMLPackage.CONTRACT_EXPOSURE__FALLBACK_FUNCTION:
			setFallbackFunction((Boolean) newValue);
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
		case ColmenaMLPackage.CONTRACT_EXPOSURE__VERB_TYPE:
			setVerbType(VERB_TYPE_EDEFAULT);
			return;
		case ColmenaMLPackage.CONTRACT_EXPOSURE__URL:
			setUrl(URL_EDEFAULT);
			return;
		case ColmenaMLPackage.CONTRACT_EXPOSURE__CONTAINED_PARAMETERS:
			getContained_parameters().clear();
			return;
		case ColmenaMLPackage.CONTRACT_EXPOSURE__CONTAINED_RETURN_TYPE:
			setContained_returnType((ExposureReturnType) null);
			return;
		case ColmenaMLPackage.CONTRACT_EXPOSURE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ColmenaMLPackage.CONTRACT_EXPOSURE__FALLBACK_FUNCTION:
			setFallbackFunction(FALLBACK_FUNCTION_EDEFAULT);
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
		case ColmenaMLPackage.CONTRACT_EXPOSURE__VERB_TYPE:
			return verbType != VERB_TYPE_EDEFAULT;
		case ColmenaMLPackage.CONTRACT_EXPOSURE__URL:
			return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
		case ColmenaMLPackage.CONTRACT_EXPOSURE__CONTAINED_PARAMETERS:
			return contained_parameters != null && !contained_parameters.isEmpty();
		case ColmenaMLPackage.CONTRACT_EXPOSURE__CONTAINED_RETURN_TYPE:
			return contained_returnType != null;
		case ColmenaMLPackage.CONTRACT_EXPOSURE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ColmenaMLPackage.CONTRACT_EXPOSURE__FALLBACK_FUNCTION:
			return fallbackFunction != FALLBACK_FUNCTION_EDEFAULT;
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
		result.append(" (verbType: ");
		result.append(verbType);
		result.append(", url: ");
		result.append(url);
		result.append(", name: ");
		result.append(name);
		result.append(", fallbackFunction: ");
		result.append(fallbackFunction);
		result.append(')');
		return result.toString();
	}

} //ContractExposureImpl
