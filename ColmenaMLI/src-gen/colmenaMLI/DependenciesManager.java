/**
 */
package colmenaMLI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Dependencies Manager</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see colmenaMLI.ColmenaMLIPackage#getDependenciesManager()
 * @model
 * @generated
 */
public enum DependenciesManager implements Enumerator {
	/**
	 * The '<em><b>Maven</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAVEN_VALUE
	 * @generated
	 * @ordered
	 */
	MAVEN(0, "Maven", "Maven"),

	/**
	 * The '<em><b>Graddle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRADDLE_VALUE
	 * @generated
	 * @ordered
	 */
	GRADDLE(1, "Graddle", "Graddle");

	/**
	 * The '<em><b>Maven</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAVEN
	 * @model name="Maven"
	 * @generated
	 * @ordered
	 */
	public static final int MAVEN_VALUE = 0;

	/**
	 * The '<em><b>Graddle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRADDLE
	 * @model name="Graddle"
	 * @generated
	 * @ordered
	 */
	public static final int GRADDLE_VALUE = 1;

	/**
	 * An array of all the '<em><b>Dependencies Manager</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DependenciesManager[] VALUES_ARRAY = new DependenciesManager[] { MAVEN, GRADDLE, };

	/**
	 * A public read-only list of all the '<em><b>Dependencies Manager</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DependenciesManager> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Dependencies Manager</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DependenciesManager get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DependenciesManager result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Dependencies Manager</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DependenciesManager getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DependenciesManager result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Dependencies Manager</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DependenciesManager get(int value) {
		switch (value) {
		case MAVEN_VALUE:
			return MAVEN;
		case GRADDLE_VALUE:
			return GRADDLE;
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
	private DependenciesManager(int value, String name, String literal) {
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

} //DependenciesManager
