/**
 */
package colmenaMLI.impl;

import colmenaMLI.ColmenaMLIPackage;
import colmenaMLI.Database;
import colmenaMLI.Language;
import colmenaMLI.Microservice;
import colmenaMLI.Relation;

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
 * An implementation of the model object '<em><b>Microservice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link colmenaMLI.impl.MicroserviceImpl#getName <em>Name</em>}</li>
 *   <li>{@link colmenaMLI.impl.MicroserviceImpl#getLangType <em>Lang Type</em>}</li>
 *   <li>{@link colmenaMLI.impl.MicroserviceImpl#getContained_relations <em>Contained relations</em>}</li>
 *   <li>{@link colmenaMLI.impl.MicroserviceImpl#getArtifactId <em>Artifact Id</em>}</li>
 *   <li>{@link colmenaMLI.impl.MicroserviceImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link colmenaMLI.impl.MicroserviceImpl#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link colmenaMLI.impl.MicroserviceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link colmenaMLI.impl.MicroserviceImpl#getDatabase <em>Database</em>}</li>
 *   <li>{@link colmenaMLI.impl.MicroserviceImpl#getPort <em>Port</em>}</li>
 *   <li>{@link colmenaMLI.impl.MicroserviceImpl#getIp <em>Ip</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MicroserviceImpl extends MinimalEObjectImpl.Container implements Microservice {
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
	 * The default value of the '{@link #getLangType() <em>Lang Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLangType()
	 * @generated
	 * @ordered
	 */
	protected static final Language LANG_TYPE_EDEFAULT = Language.JAVA8;

	/**
	 * The cached value of the '{@link #getLangType() <em>Lang Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLangType()
	 * @generated
	 * @ordered
	 */
	protected Language langType = LANG_TYPE_EDEFAULT;

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
	 * The default value of the '{@link #getArtifactId() <em>Artifact Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactId()
	 * @generated
	 * @ordered
	 */
	protected static final String ARTIFACT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArtifactId() <em>Artifact Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactId()
	 * @generated
	 * @ordered
	 */
	protected String artifactId = ARTIFACT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getGroupId() <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupId()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroupId() <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupId()
	 * @generated
	 * @ordered
	 */
	protected String groupId = GROUP_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDatabase() <em>Database</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabase()
	 * @generated
	 * @ordered
	 */
	protected Database database;

	/**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PORT_EDEFAULT = new Integer(8080);

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected Integer port = PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getIp() <em>Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIp()
	 * @generated
	 * @ordered
	 */
	protected static final String IP_EDEFAULT = "localhost";

	/**
	 * The cached value of the '{@link #getIp() <em>Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIp()
	 * @generated
	 * @ordered
	 */
	protected String ip = IP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MicroserviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ColmenaMLIPackage.Literals.MICROSERVICE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ColmenaMLIPackage.MICROSERVICE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Language getLangType() {
		return langType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLangType(Language newLangType) {
		Language oldLangType = langType;
		langType = newLangType == null ? LANG_TYPE_EDEFAULT : newLangType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ColmenaMLIPackage.MICROSERVICE__LANG_TYPE,
					oldLangType, langType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relation> getContained_relations() {
		if (contained_relations == null) {
			contained_relations = new EObjectContainmentEList<Relation>(Relation.class, this,
					ColmenaMLIPackage.MICROSERVICE__CONTAINED_RELATIONS);
		}
		return contained_relations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArtifactId() {
		return artifactId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArtifactId(String newArtifactId) {
		String oldArtifactId = artifactId;
		artifactId = newArtifactId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ColmenaMLIPackage.MICROSERVICE__ARTIFACT_ID,
					oldArtifactId, artifactId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ColmenaMLIPackage.MICROSERVICE__VERSION, oldVersion,
					version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroupId() {
		return groupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupId(String newGroupId) {
		String oldGroupId = groupId;
		groupId = newGroupId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ColmenaMLIPackage.MICROSERVICE__GROUP_ID, oldGroupId,
					groupId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ColmenaMLIPackage.MICROSERVICE__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Database getDatabase() {
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatabase(Database newDatabase, NotificationChain msgs) {
		Database oldDatabase = database;
		database = newDatabase;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ColmenaMLIPackage.MICROSERVICE__DATABASE, oldDatabase, newDatabase);
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
	public void setDatabase(Database newDatabase) {
		if (newDatabase != database) {
			NotificationChain msgs = null;
			if (database != null)
				msgs = ((InternalEObject) database).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ColmenaMLIPackage.MICROSERVICE__DATABASE, null, msgs);
			if (newDatabase != null)
				msgs = ((InternalEObject) newDatabase).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ColmenaMLIPackage.MICROSERVICE__DATABASE, null, msgs);
			msgs = basicSetDatabase(newDatabase, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ColmenaMLIPackage.MICROSERVICE__DATABASE, newDatabase,
					newDatabase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(Integer newPort) {
		Integer oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ColmenaMLIPackage.MICROSERVICE__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIp() {
		return ip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIp(String newIp) {
		String oldIp = ip;
		ip = newIp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ColmenaMLIPackage.MICROSERVICE__IP, oldIp, ip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ColmenaMLIPackage.MICROSERVICE__CONTAINED_RELATIONS:
			return ((InternalEList<?>) getContained_relations()).basicRemove(otherEnd, msgs);
		case ColmenaMLIPackage.MICROSERVICE__DATABASE:
			return basicSetDatabase(null, msgs);
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
		case ColmenaMLIPackage.MICROSERVICE__NAME:
			return getName();
		case ColmenaMLIPackage.MICROSERVICE__LANG_TYPE:
			return getLangType();
		case ColmenaMLIPackage.MICROSERVICE__CONTAINED_RELATIONS:
			return getContained_relations();
		case ColmenaMLIPackage.MICROSERVICE__ARTIFACT_ID:
			return getArtifactId();
		case ColmenaMLIPackage.MICROSERVICE__VERSION:
			return getVersion();
		case ColmenaMLIPackage.MICROSERVICE__GROUP_ID:
			return getGroupId();
		case ColmenaMLIPackage.MICROSERVICE__DESCRIPTION:
			return getDescription();
		case ColmenaMLIPackage.MICROSERVICE__DATABASE:
			return getDatabase();
		case ColmenaMLIPackage.MICROSERVICE__PORT:
			return getPort();
		case ColmenaMLIPackage.MICROSERVICE__IP:
			return getIp();
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
		case ColmenaMLIPackage.MICROSERVICE__NAME:
			setName((String) newValue);
			return;
		case ColmenaMLIPackage.MICROSERVICE__LANG_TYPE:
			setLangType((Language) newValue);
			return;
		case ColmenaMLIPackage.MICROSERVICE__CONTAINED_RELATIONS:
			getContained_relations().clear();
			getContained_relations().addAll((Collection<? extends Relation>) newValue);
			return;
		case ColmenaMLIPackage.MICROSERVICE__ARTIFACT_ID:
			setArtifactId((String) newValue);
			return;
		case ColmenaMLIPackage.MICROSERVICE__VERSION:
			setVersion((String) newValue);
			return;
		case ColmenaMLIPackage.MICROSERVICE__GROUP_ID:
			setGroupId((String) newValue);
			return;
		case ColmenaMLIPackage.MICROSERVICE__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case ColmenaMLIPackage.MICROSERVICE__DATABASE:
			setDatabase((Database) newValue);
			return;
		case ColmenaMLIPackage.MICROSERVICE__PORT:
			setPort((Integer) newValue);
			return;
		case ColmenaMLIPackage.MICROSERVICE__IP:
			setIp((String) newValue);
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
		case ColmenaMLIPackage.MICROSERVICE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ColmenaMLIPackage.MICROSERVICE__LANG_TYPE:
			setLangType(LANG_TYPE_EDEFAULT);
			return;
		case ColmenaMLIPackage.MICROSERVICE__CONTAINED_RELATIONS:
			getContained_relations().clear();
			return;
		case ColmenaMLIPackage.MICROSERVICE__ARTIFACT_ID:
			setArtifactId(ARTIFACT_ID_EDEFAULT);
			return;
		case ColmenaMLIPackage.MICROSERVICE__VERSION:
			setVersion(VERSION_EDEFAULT);
			return;
		case ColmenaMLIPackage.MICROSERVICE__GROUP_ID:
			setGroupId(GROUP_ID_EDEFAULT);
			return;
		case ColmenaMLIPackage.MICROSERVICE__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case ColmenaMLIPackage.MICROSERVICE__DATABASE:
			setDatabase((Database) null);
			return;
		case ColmenaMLIPackage.MICROSERVICE__PORT:
			setPort(PORT_EDEFAULT);
			return;
		case ColmenaMLIPackage.MICROSERVICE__IP:
			setIp(IP_EDEFAULT);
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
		case ColmenaMLIPackage.MICROSERVICE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ColmenaMLIPackage.MICROSERVICE__LANG_TYPE:
			return langType != LANG_TYPE_EDEFAULT;
		case ColmenaMLIPackage.MICROSERVICE__CONTAINED_RELATIONS:
			return contained_relations != null && !contained_relations.isEmpty();
		case ColmenaMLIPackage.MICROSERVICE__ARTIFACT_ID:
			return ARTIFACT_ID_EDEFAULT == null ? artifactId != null : !ARTIFACT_ID_EDEFAULT.equals(artifactId);
		case ColmenaMLIPackage.MICROSERVICE__VERSION:
			return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
		case ColmenaMLIPackage.MICROSERVICE__GROUP_ID:
			return GROUP_ID_EDEFAULT == null ? groupId != null : !GROUP_ID_EDEFAULT.equals(groupId);
		case ColmenaMLIPackage.MICROSERVICE__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case ColmenaMLIPackage.MICROSERVICE__DATABASE:
			return database != null;
		case ColmenaMLIPackage.MICROSERVICE__PORT:
			return PORT_EDEFAULT == null ? port != null : !PORT_EDEFAULT.equals(port);
		case ColmenaMLIPackage.MICROSERVICE__IP:
			return IP_EDEFAULT == null ? ip != null : !IP_EDEFAULT.equals(ip);
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
		result.append(", langType: ");
		result.append(langType);
		result.append(", artifactId: ");
		result.append(artifactId);
		result.append(", version: ");
		result.append(version);
		result.append(", groupId: ");
		result.append(groupId);
		result.append(", description: ");
		result.append(description);
		result.append(", port: ");
		result.append(port);
		result.append(", ip: ");
		result.append(ip);
		result.append(')');
		return result.toString();
	}

} //MicroserviceImpl
