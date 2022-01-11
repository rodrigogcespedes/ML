/**
 */
package colmenaML;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CRUD Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see colmenaML.ColmenaMLPackage#getCRUDType()
 * @model
 * @generated
 */
public enum CRUDType implements Enumerator {
	/**
	 * The '<em><b>Simple</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIMPLE_VALUE
	 * @generated
	 * @ordered
	 */
	SIMPLE(0, "simple", "simple"),

	/**
	 * The '<em><b>Selectable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SELECTABLE_VALUE
	 * @generated
	 * @ordered
	 */
	SELECTABLE(1, "selectable", "selectable"),

	/**
	 * The '<em><b>Master Detail</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MASTER_DETAIL_VALUE
	 * @generated
	 * @ordered
	 */
	MASTER_DETAIL(2, "masterDetail", "masterDetail"),

	/**
	 * The '<em><b>Master Detail Combo</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MASTER_DETAIL_COMBO_VALUE
	 * @generated
	 * @ordered
	 */
	MASTER_DETAIL_COMBO(3, "masterDetailCombo", "masterDetailCombo"),

	/**
	 * The '<em><b>Master Combo Detail</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MASTER_COMBO_DETAIL_VALUE
	 * @generated
	 * @ordered
	 */
	MASTER_COMBO_DETAIL(4, "masterComboDetail", "masterComboDetail"),

	/**
	 * The '<em><b>Master Combo Detail Combo</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MASTER_COMBO_DETAIL_COMBO_VALUE
	 * @generated
	 * @ordered
	 */
	MASTER_COMBO_DETAIL_COMBO(5, "masterComboDetailCombo", "masterComboDetailCombo"),

	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(6, "none", "none");

	/**
	 * The '<em><b>Simple</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIMPLE
	 * @model name="simple"
	 * @generated
	 * @ordered
	 */
	public static final int SIMPLE_VALUE = 0;

	/**
	 * The '<em><b>Selectable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SELECTABLE
	 * @model name="selectable"
	 * @generated
	 * @ordered
	 */
	public static final int SELECTABLE_VALUE = 1;

	/**
	 * The '<em><b>Master Detail</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MASTER_DETAIL
	 * @model name="masterDetail"
	 * @generated
	 * @ordered
	 */
	public static final int MASTER_DETAIL_VALUE = 2;

	/**
	 * The '<em><b>Master Detail Combo</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MASTER_DETAIL_COMBO
	 * @model name="masterDetailCombo"
	 * @generated
	 * @ordered
	 */
	public static final int MASTER_DETAIL_COMBO_VALUE = 3;

	/**
	 * The '<em><b>Master Combo Detail</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MASTER_COMBO_DETAIL
	 * @model name="masterComboDetail"
	 * @generated
	 * @ordered
	 */
	public static final int MASTER_COMBO_DETAIL_VALUE = 4;

	/**
	 * The '<em><b>Master Combo Detail Combo</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MASTER_COMBO_DETAIL_COMBO
	 * @model name="masterComboDetailCombo"
	 * @generated
	 * @ordered
	 */
	public static final int MASTER_COMBO_DETAIL_COMBO_VALUE = 5;

	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model name="none"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 6;

	/**
	 * An array of all the '<em><b>CRUD Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CRUDType[] VALUES_ARRAY = new CRUDType[] { SIMPLE, SELECTABLE, MASTER_DETAIL,
			MASTER_DETAIL_COMBO, MASTER_COMBO_DETAIL, MASTER_COMBO_DETAIL_COMBO, NONE, };

	/**
	 * A public read-only list of all the '<em><b>CRUD Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CRUDType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CRUD Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CRUDType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CRUDType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CRUD Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CRUDType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CRUDType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CRUD Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CRUDType get(int value) {
		switch (value) {
		case SIMPLE_VALUE:
			return SIMPLE;
		case SELECTABLE_VALUE:
			return SELECTABLE;
		case MASTER_DETAIL_VALUE:
			return MASTER_DETAIL;
		case MASTER_DETAIL_COMBO_VALUE:
			return MASTER_DETAIL_COMBO;
		case MASTER_COMBO_DETAIL_VALUE:
			return MASTER_COMBO_DETAIL;
		case MASTER_COMBO_DETAIL_COMBO_VALUE:
			return MASTER_COMBO_DETAIL_COMBO;
		case NONE_VALUE:
			return NONE;
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
	private CRUDType(int value, String name, String literal) {
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

} //CRUDType
