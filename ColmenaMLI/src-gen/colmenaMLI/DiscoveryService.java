/**
 */
package colmenaMLI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Discovery Service</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see colmenaMLI.ColmenaMLIPackage#getDiscoveryService()
 * @model
 * @generated
 */
public enum DiscoveryService implements Enumerator {
	/**
	 * The '<em><b>Consul</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSUL_VALUE
	 * @generated
	 * @ordered
	 */
	CONSUL(0, "Consul", "Consul"),

	/**
	 * The '<em><b>Eureka</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EUREKA_VALUE
	 * @generated
	 * @ordered
	 */
	EUREKA(1, "Eureka", "Eureka");

	/**
	 * The '<em><b>Consul</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSUL
	 * @model name="Consul"
	 * @generated
	 * @ordered
	 */
	public static final int CONSUL_VALUE = 0;

	/**
	 * The '<em><b>Eureka</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EUREKA
	 * @model name="Eureka"
	 * @generated
	 * @ordered
	 */
	public static final int EUREKA_VALUE = 1;

	/**
	 * An array of all the '<em><b>Discovery Service</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DiscoveryService[] VALUES_ARRAY = new DiscoveryService[] { CONSUL, EUREKA, };

	/**
	 * A public read-only list of all the '<em><b>Discovery Service</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DiscoveryService> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Discovery Service</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DiscoveryService get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DiscoveryService result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Discovery Service</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DiscoveryService getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DiscoveryService result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Discovery Service</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DiscoveryService get(int value) {
		switch (value) {
		case CONSUL_VALUE:
			return CONSUL;
		case EUREKA_VALUE:
			return EUREKA;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DiscoveryService(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
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
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //DiscoveryService
