/**
 */
package colmenaMLI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Gateway Service</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see colmenaMLI.ColmenaMLIPackage#getGatewayService()
 * @model
 * @generated
 */
public enum GatewayService implements Enumerator {
	/**
	 * The '<em><b>Spring Cloud</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPRING_CLOUD_VALUE
	 * @generated
	 * @ordered
	 */
	SPRING_CLOUD(0, "SpringCloud", "SpringCloud"),

	/**
	 * The '<em><b>Nginx</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NGINX_VALUE
	 * @generated
	 * @ordered
	 */
	NGINX(1, "Nginx", "Nginx");

	/**
	 * The '<em><b>Spring Cloud</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPRING_CLOUD
	 * @model name="SpringCloud"
	 * @generated
	 * @ordered
	 */
	public static final int SPRING_CLOUD_VALUE = 0;

	/**
	 * The '<em><b>Nginx</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NGINX
	 * @model name="Nginx"
	 * @generated
	 * @ordered
	 */
	public static final int NGINX_VALUE = 1;

	/**
	 * An array of all the '<em><b>Gateway Service</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GatewayService[] VALUES_ARRAY = new GatewayService[] { SPRING_CLOUD, NGINX, };

	/**
	 * A public read-only list of all the '<em><b>Gateway Service</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GatewayService> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Gateway Service</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GatewayService get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GatewayService result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Gateway Service</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GatewayService getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GatewayService result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Gateway Service</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GatewayService get(int value) {
		switch (value) {
		case SPRING_CLOUD_VALUE:
			return SPRING_CLOUD;
		case NGINX_VALUE:
			return NGINX;
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
	private GatewayService(int value, String name, String literal) {
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

} //GatewayService
