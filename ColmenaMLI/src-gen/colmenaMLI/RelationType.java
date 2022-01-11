/**
 */
package colmenaMLI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Relation Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see colmenaMLI.ColmenaMLIPackage#getRelationType()
 * @model
 * @generated
 */
public enum RelationType implements Enumerator {
	/**
	 * The '<em><b>Authenticated By</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTHENTICATED_BY_VALUE
	 * @generated
	 * @ordered
	 */
	AUTHENTICATED_BY(1, "authenticatedBy", "authenticatedBy"),

	/**
	 * The '<em><b>Authorized By</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTHORIZED_BY_VALUE
	 * @generated
	 * @ordered
	 */
	AUTHORIZED_BY(2, "authorizedBy", "authorizedBy"),

	/**
	 * The '<em><b>Depends On</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPENDS_ON_VALUE
	 * @generated
	 * @ordered
	 */
	DEPENDS_ON(5, "dependsOn", "dependsOn");

	/**
	 * The '<em><b>Authenticated By</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTHENTICATED_BY
	 * @model name="authenticatedBy"
	 * @generated
	 * @ordered
	 */
	public static final int AUTHENTICATED_BY_VALUE = 1;

	/**
	 * The '<em><b>Authorized By</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTHORIZED_BY
	 * @model name="authorizedBy"
	 * @generated
	 * @ordered
	 */
	public static final int AUTHORIZED_BY_VALUE = 2;

	/**
	 * The '<em><b>Depends On</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPENDS_ON
	 * @model name="dependsOn"
	 * @generated
	 * @ordered
	 */
	public static final int DEPENDS_ON_VALUE = 5;

	/**
	 * An array of all the '<em><b>Relation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RelationType[] VALUES_ARRAY = new RelationType[] { AUTHENTICATED_BY, AUTHORIZED_BY,
			DEPENDS_ON, };

	/**
	 * A public read-only list of all the '<em><b>Relation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RelationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Relation Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RelationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RelationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Relation Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RelationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RelationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Relation Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RelationType get(int value) {
		switch (value) {
		case AUTHENTICATED_BY_VALUE:
			return AUTHENTICATED_BY;
		case AUTHORIZED_BY_VALUE:
			return AUTHORIZED_BY;
		case DEPENDS_ON_VALUE:
			return DEPENDS_ON;
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
	private RelationType(int value, String name, String literal) {
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

} //RelationType
