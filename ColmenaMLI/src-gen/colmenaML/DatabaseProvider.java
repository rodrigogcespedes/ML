/**
 */
package colmenaML;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Database Provider</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see colmenaML.ColmenaMLPackage#getDatabaseProvider()
 * @model
 * @generated
 */
public enum DatabaseProvider implements Enumerator {
	/**
	 * The '<em><b>My SQL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MY_SQL_VALUE
	 * @generated
	 * @ordered
	 */
	MY_SQL(0, "MySQL", "MySQL"),

	/**
	 * The '<em><b>Mongo DB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MONGO_DB_VALUE
	 * @generated
	 * @ordered
	 */
	MONGO_DB(1, "MongoDB", "MongoDB"),

	/**
	 * The '<em><b>Oracle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORACLE_VALUE
	 * @generated
	 * @ordered
	 */
	ORACLE(2, "Oracle", "Oracle"),

	/**
	 * The '<em><b>DB2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DB2_VALUE
	 * @generated
	 * @ordered
	 */
	DB2(3, "DB2", "DB2");

	/**
	 * The '<em><b>My SQL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MY_SQL
	 * @model name="MySQL"
	 * @generated
	 * @ordered
	 */
	public static final int MY_SQL_VALUE = 0;

	/**
	 * The '<em><b>Mongo DB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MONGO_DB
	 * @model name="MongoDB"
	 * @generated
	 * @ordered
	 */
	public static final int MONGO_DB_VALUE = 1;

	/**
	 * The '<em><b>Oracle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORACLE
	 * @model name="Oracle"
	 * @generated
	 * @ordered
	 */
	public static final int ORACLE_VALUE = 2;

	/**
	 * The '<em><b>DB2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DB2
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DB2_VALUE = 3;

	/**
	 * An array of all the '<em><b>Database Provider</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DatabaseProvider[] VALUES_ARRAY = new DatabaseProvider[] { MY_SQL, MONGO_DB, ORACLE, DB2, };

	/**
	 * A public read-only list of all the '<em><b>Database Provider</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DatabaseProvider> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Database Provider</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DatabaseProvider get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DatabaseProvider result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Database Provider</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DatabaseProvider getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DatabaseProvider result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Database Provider</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DatabaseProvider get(int value) {
		switch (value) {
		case MY_SQL_VALUE:
			return MY_SQL;
		case MONGO_DB_VALUE:
			return MONGO_DB;
		case ORACLE_VALUE:
			return ORACLE;
		case DB2_VALUE:
			return DB2;
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
	private DatabaseProvider(int value, String name, String literal) {
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

} //DatabaseProvider
