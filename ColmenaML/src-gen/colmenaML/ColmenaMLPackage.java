/**
 */
package colmenaML;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see colmenaML.ColmenaMLFactory
 * @model kind="package"
 * @generated
 */
public interface ColmenaMLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "colmenaML";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/colmenaML";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "colmenaML";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ColmenaMLPackage eINSTANCE = colmenaML.impl.ColmenaMLPackageImpl.init();

	/**
	 * The meta object id for the '{@link colmenaML.impl.ClassDiagramImpl <em>Class Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see colmenaML.impl.ClassDiagramImpl
	 * @see colmenaML.impl.ColmenaMLPackageImpl#getClassDiagram()
	 * @generated
	 */
	int CLASS_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Contained contracts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DIAGRAM__CONTAINED_CONTRACTS = 0;

	/**
	 * The feature id for the '<em><b>Contained packages</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DIAGRAM__CONTAINED_PACKAGES = 1;

	/**
	 * The feature id for the '<em><b>Contained dto Containers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DIAGRAM__CONTAINED_DTO_CONTAINERS = 2;

	/**
	 * The number of structural features of the '<em>Class Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DIAGRAM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Class Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DIAGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link colmenaML.impl.ContractImpl <em>Contract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see colmenaML.impl.ContractImpl
	 * @see colmenaML.impl.ColmenaMLPackageImpl#getContract()
	 * @generated
	 */
	int CONTRACT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Verbs offered</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__VERBS_OFFERED = 1;

	/**
	 * The feature id for the '<em><b>Main class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__MAIN_CLASS = 2;

	/**
	 * The feature id for the '<em><b>Crud Methods</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__CRUD_METHODS = 3;

	/**
	 * The number of structural features of the '<em>Contract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Contract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link colmenaML.impl.ContractExposureImpl <em>Contract Exposure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see colmenaML.impl.ContractExposureImpl
	 * @see colmenaML.impl.ColmenaMLPackageImpl#getContractExposure()
	 * @generated
	 */
	int CONTRACT_EXPOSURE = 2;

	/**
	 * The feature id for the '<em><b>Verb Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_EXPOSURE__VERB_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_EXPOSURE__URL = 1;

	/**
	 * The feature id for the '<em><b>Contained parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_EXPOSURE__CONTAINED_PARAMETERS = 2;

	/**
	 * The feature id for the '<em><b>Contained return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_EXPOSURE__CONTAINED_RETURN_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_EXPOSURE__NAME = 4;

	/**
	 * The feature id for the '<em><b>Fallback Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_EXPOSURE__FALLBACK_FUNCTION = 5;

	/**
	 * The number of structural features of the '<em>Contract Exposure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_EXPOSURE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Contract Exposure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_EXPOSURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link colmenaML.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see colmenaML.impl.PackageImpl
	 * @see colmenaML.impl.ColmenaMLPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Contained classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__CONTAINED_CLASSIFIERS = 1;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link colmenaML.impl.ClassifierImpl <em>Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see colmenaML.impl.ClassifierImpl
	 * @see colmenaML.impl.ColmenaMLPackageImpl#getClassifier()
	 * @generated
	 */
	int CLASSIFIER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Contained operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__CONTAINED_OPERATIONS = 1;

	/**
	 * The feature id for the '<em><b>Contained attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__CONTAINED_ATTRIBUTES = 2;

	/**
	 * The feature id for the '<em><b>Contained inheritances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__CONTAINED_INHERITANCES = 3;

	/**
	 * The number of structural features of the '<em>Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link colmenaML.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see colmenaML.impl.ClassImpl
	 * @see colmenaML.impl.ColmenaMLPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAME = CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Contained operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__CONTAINED_OPERATIONS = CLASSIFIER__CONTAINED_OPERATIONS;

	/**
	 * The feature id for the '<em><b>Contained attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__CONTAINED_ATTRIBUTES = CLASSIFIER__CONTAINED_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contained inheritances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__CONTAINED_INHERITANCES = CLASSIFIER__CONTAINED_INHERITANCES;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__IS_ABSTRACT = CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Associative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__IS_ASSOCIATIVE = CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Auditable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__IS_AUDITABLE = CLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Crud Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__CRUD_TYPE = CLASSIFIER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Contained relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__CONTAINED_RELATIONS = CLASSIFIER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Contained implementations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__CONTAINED_IMPLEMENTATIONS = CLASSIFIER_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_COUNT = CLASSIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link colmenaML.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see colmenaML.impl.InterfaceImpl
	 * @see colmenaML.impl.ColmenaMLPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__NAME = CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Contained operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__CONTAINED_OPERATIONS = CLASSIFIER__CONTAINED_OPERATIONS;

	/**
	 * The feature id for the '<em><b>Contained attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__CONTAINED_ATTRIBUTES = CLASSIFIER__CONTAINED_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contained inheritances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__CONTAINED_INHERITANCES = CLASSIFIER__CONTAINED_INHERITANCES;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION_COUNT = CLASSIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link colmenaML.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see colmenaML.impl.RelationImpl
	 * @see colmenaML.impl.ColmenaMLPackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__MULTIPLICITY = 2;

	/**
	 * The feature id for the '<em><b>Is Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__IS_FINAL = 3;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__IS_STATIC = 4;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__VISIBILITY = 5;

	/**
	 * The feature id for the '<em><b>Crud Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__CRUD_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Subordinate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__SUBORDINATE = 7;

	/**
	 * The feature id for the '<em><b>Associative classes contained</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__ASSOCIATIVE_CLASSES_CONTAINED = 8;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__DESTINATION = 9;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__ORIGIN = 10;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link colmenaML.impl.ImplementationImpl <em>Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see colmenaML.impl.ImplementationImpl
	 * @see colmenaML.impl.ColmenaMLPackageImpl#getImplementation()
	 * @generated
	 */
	int IMPLEMENTATION = 8;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION__ORIGIN = 0;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION__DESTINATION = 1;

	/**
	 * The number of structural features of the '<em>Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link colmenaML.impl.ReturnableImpl <em>Returnable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see colmenaML.impl.ReturnableImpl
	 * @see colmenaML.impl.ColmenaMLPackageImpl#getReturnable()
	 * @generated
	 */
	int RETURNABLE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURNABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Is Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURNABLE__IS_FINAL = 1;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURNABLE__IS_STATIC = 2;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURNABLE__VISIBILITY = 3;

	/**
	 * The number of structural features of the '<em>Returnable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURNABLE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Returnable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURNABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link colmenaML.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see colmenaML.impl.AttributeImpl
	 * @see colmenaML.impl.ColmenaMLPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = RETURNABLE__NAME;

	/**
	 * The feature id for the '<em><b>Is Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_FINAL = RETURNABLE__IS_FINAL;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_STATIC = RETURNABLE__IS_STATIC;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__VISIBILITY = RETURNABLE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = RETURNABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Auditable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_AUDITABLE = RETURNABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pseudonym</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__PSEUDONYM = RETURNABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Graphic Representation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__GRAPHIC_REPRESENTATION = RETURNABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = RETURNABLE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = RETURNABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link colmenaML.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see colmenaML.impl.OperationImpl
	 * @see colmenaML.impl.ColmenaMLPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = RETURNABLE__NAME;

	/**
	 * The feature id for the '<em><b>Is Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__IS_FINAL = RETURNABLE__IS_FINAL;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__IS_STATIC = RETURNABLE__IS_STATIC;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__VISIBILITY = RETURNABLE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__RETURN_TYPE = RETURNABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__IS_ABSTRACT = RETURNABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = RETURNABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = RETURNABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link colmenaML.impl.InheritanceImpl <em>Inheritance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see colmenaML.impl.InheritanceImpl
	 * @see colmenaML.impl.ColmenaMLPackageImpl#getInheritance()
	 * @generated
	 */
	int INHERITANCE = 12;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE__ORIGIN = 0;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE__DESTINATION = 1;

	/**
	 * The number of structural features of the '<em>Inheritance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Inheritance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link colmenaML.impl.DTOContainerImpl <em>DTO Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see colmenaML.impl.DTOContainerImpl
	 * @see colmenaML.impl.ColmenaMLPackageImpl#getDTOContainer()
	 * @generated
	 */
	int DTO_CONTAINER = 13;

	/**
	 * The feature id for the '<em><b>Contained dtos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_CONTAINER__CONTAINED_DTOS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_CONTAINER__NAME = 1;

	/**
	 * The number of structural features of the '<em>DTO Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_CONTAINER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>DTO Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link colmenaML.impl.DTOImpl <em>DTO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see colmenaML.impl.DTOImpl
	 * @see colmenaML.impl.ColmenaMLPackageImpl#getDTO()
	 * @generated
	 */
	int DTO = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO__NAME = 0;

	/**
	 * The number of structural features of the '<em>DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link colmenaML.impl.DTOReferenceAttributeImpl <em>DTO Reference Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see colmenaML.impl.DTOReferenceAttributeImpl
	 * @see colmenaML.impl.ColmenaMLPackageImpl#getDTOReferenceAttribute()
	 * @generated
	 */
	int DTO_REFERENCE_ATTRIBUTE = 15;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_REFERENCE_ATTRIBUTE__DESTINATION = 0;

	/**
	 * The number of structural features of the '<em>DTO Reference Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_REFERENCE_ATTRIBUTE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>DTO Reference Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_REFERENCE_ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link colmenaML.impl.DTOCustomAttributeImpl <em>DTO Custom Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see colmenaML.impl.DTOCustomAttributeImpl
	 * @see colmenaML.impl.ColmenaMLPackageImpl#getDTOCustomAttribute()
	 * @generated
	 */
	int DTO_CUSTOM_ATTRIBUTE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_CUSTOM_ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_CUSTOM_ATTRIBUTE__TYPE = 1;

	/**
	 * The number of structural features of the '<em>DTO Custom Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_CUSTOM_ATTRIBUTE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>DTO Custom Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_CUSTOM_ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link colmenaML.impl.ExposureParametersImpl <em>Exposure Parameters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see colmenaML.impl.ExposureParametersImpl
	 * @see colmenaML.impl.ColmenaMLPackageImpl#getExposureParameters()
	 * @generated
	 */
	int EXPOSURE_PARAMETERS = 17;

	/**
	 * The feature id for the '<em><b>Dto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPOSURE_PARAMETERS__DTO = 0;

	/**
	 * The number of structural features of the '<em>Exposure Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPOSURE_PARAMETERS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Exposure Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPOSURE_PARAMETERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link colmenaML.impl.ExposureReturnTypeImpl <em>Exposure Return Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see colmenaML.impl.ExposureReturnTypeImpl
	 * @see colmenaML.impl.ColmenaMLPackageImpl#getExposureReturnType()
	 * @generated
	 */
	int EXPOSURE_RETURN_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Dto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPOSURE_RETURN_TYPE__DTO = 0;

	/**
	 * The number of structural features of the '<em>Exposure Return Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPOSURE_RETURN_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Exposure Return Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPOSURE_RETURN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link colmenaML.impl.CustomDTOImpl <em>Custom DTO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see colmenaML.impl.CustomDTOImpl
	 * @see colmenaML.impl.ColmenaMLPackageImpl#getCustomDTO()
	 * @generated
	 */
	int CUSTOM_DTO = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DTO__NAME = DTO__NAME;

	/**
	 * The feature id for the '<em><b>Contained custom attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DTO__CONTAINED_CUSTOM_ATTRIBUTES = DTO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contained reference attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DTO__CONTAINED_REFERENCE_ATTRIBUTES = DTO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Custom DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DTO_FEATURE_COUNT = DTO_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Custom DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DTO_OPERATION_COUNT = DTO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link colmenaML.impl.ClassDTOImpl <em>Class DTO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see colmenaML.impl.ClassDTOImpl
	 * @see colmenaML.impl.ColmenaMLPackageImpl#getClassDTO()
	 * @generated
	 */
	int CLASS_DTO = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DTO__NAME = DTO__NAME;

	/**
	 * The feature id for the '<em><b>Reference class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DTO__REFERENCE_CLASS = DTO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Class DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DTO_FEATURE_COUNT = DTO_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Class DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DTO_OPERATION_COUNT = DTO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link colmenaML.Language <em>Language</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see colmenaML.Language
	 * @see colmenaML.impl.ColmenaMLPackageImpl#getLanguage()
	 * @generated
	 */
	int LANGUAGE = 21;

	/**
	 * The meta object id for the '{@link colmenaML.DataType <em>Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see colmenaML.DataType
	 * @see colmenaML.impl.ColmenaMLPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 22;

	/**
	 * The meta object id for the '{@link colmenaML.ReturnType <em>Return Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see colmenaML.ReturnType
	 * @see colmenaML.impl.ColmenaMLPackageImpl#getReturnType()
	 * @generated
	 */
	int RETURN_TYPE = 23;

	/**
	 * The meta object id for the '{@link colmenaML.RelationMultiplicity <em>Relation Multiplicity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see colmenaML.RelationMultiplicity
	 * @see colmenaML.impl.ColmenaMLPackageImpl#getRelationMultiplicity()
	 * @generated
	 */
	int RELATION_MULTIPLICITY = 24;

	/**
	 * The meta object id for the '{@link colmenaML.AccessModifiers <em>Access Modifiers</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see colmenaML.AccessModifiers
	 * @see colmenaML.impl.ColmenaMLPackageImpl#getAccessModifiers()
	 * @generated
	 */
	int ACCESS_MODIFIERS = 25;

	/**
	 * The meta object id for the '{@link colmenaML.DatabaseProvider <em>Database Provider</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see colmenaML.DatabaseProvider
	 * @see colmenaML.impl.ColmenaMLPackageImpl#getDatabaseProvider()
	 * @generated
	 */
	int DATABASE_PROVIDER = 26;

	/**
	 * The meta object id for the '{@link colmenaML.HTTPVerbs <em>HTTP Verbs</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see colmenaML.HTTPVerbs
	 * @see colmenaML.impl.ColmenaMLPackageImpl#getHTTPVerbs()
	 * @generated
	 */
	int HTTP_VERBS = 27;

	/**
	 * The meta object id for the '{@link colmenaML.TransferType <em>Transfer Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see colmenaML.TransferType
	 * @see colmenaML.impl.ColmenaMLPackageImpl#getTransferType()
	 * @generated
	 */
	int TRANSFER_TYPE = 28;

	/**
	 * The meta object id for the '{@link colmenaML.RebootType <em>Reboot Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see colmenaML.RebootType
	 * @see colmenaML.impl.ColmenaMLPackageImpl#getRebootType()
	 * @generated
	 */
	int REBOOT_TYPE = 29;

	/**
	 * The meta object id for the '{@link colmenaML.GraphicRepresentation <em>Graphic Representation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see colmenaML.GraphicRepresentation
	 * @see colmenaML.impl.ColmenaMLPackageImpl#getGraphicRepresentation()
	 * @generated
	 */
	int GRAPHIC_REPRESENTATION = 30;

	/**
	 * The meta object id for the '{@link colmenaML.CRUDType <em>CRUD Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see colmenaML.CRUDType
	 * @see colmenaML.impl.ColmenaMLPackageImpl#getCRUDType()
	 * @generated
	 */
	int CRUD_TYPE = 31;

	/**
	 * The meta object id for the '{@link colmenaML.RelationType <em>Relation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see colmenaML.RelationType
	 * @see colmenaML.impl.ColmenaMLPackageImpl#getRelationType()
	 * @generated
	 */
	int RELATION_TYPE = 32;

	/**
	 * Returns the meta object for class '{@link colmenaML.ClassDiagram <em>Class Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Diagram</em>'.
	 * @see colmenaML.ClassDiagram
	 * @generated
	 */
	EClass getClassDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link colmenaML.ClassDiagram#getContained_contracts <em>Contained contracts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained contracts</em>'.
	 * @see colmenaML.ClassDiagram#getContained_contracts()
	 * @see #getClassDiagram()
	 * @generated
	 */
	EReference getClassDiagram_Contained_contracts();

	/**
	 * Returns the meta object for the containment reference '{@link colmenaML.ClassDiagram#getContained_packages <em>Contained packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contained packages</em>'.
	 * @see colmenaML.ClassDiagram#getContained_packages()
	 * @see #getClassDiagram()
	 * @generated
	 */
	EReference getClassDiagram_Contained_packages();

	/**
	 * Returns the meta object for the containment reference '{@link colmenaML.ClassDiagram#getContained_dtoContainers <em>Contained dto Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contained dto Containers</em>'.
	 * @see colmenaML.ClassDiagram#getContained_dtoContainers()
	 * @see #getClassDiagram()
	 * @generated
	 */
	EReference getClassDiagram_Contained_dtoContainers();

	/**
	 * Returns the meta object for class '{@link colmenaML.Contract <em>Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contract</em>'.
	 * @see colmenaML.Contract
	 * @generated
	 */
	EClass getContract();

	/**
	 * Returns the meta object for the attribute '{@link colmenaML.Contract#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see colmenaML.Contract#getName()
	 * @see #getContract()
	 * @generated
	 */
	EAttribute getContract_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link colmenaML.Contract#getVerbs_offered <em>Verbs offered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Verbs offered</em>'.
	 * @see colmenaML.Contract#getVerbs_offered()
	 * @see #getContract()
	 * @generated
	 */
	EReference getContract_Verbs_offered();

	/**
	 * Returns the meta object for the reference '{@link colmenaML.Contract#getMain_class <em>Main class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Main class</em>'.
	 * @see colmenaML.Contract#getMain_class()
	 * @see #getContract()
	 * @generated
	 */
	EReference getContract_Main_class();

	/**
	 * Returns the meta object for the attribute '{@link colmenaML.Contract#isCrudMethods <em>Crud Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Crud Methods</em>'.
	 * @see colmenaML.Contract#isCrudMethods()
	 * @see #getContract()
	 * @generated
	 */
	EAttribute getContract_CrudMethods();

	/**
	 * Returns the meta object for class '{@link colmenaML.ContractExposure <em>Contract Exposure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contract Exposure</em>'.
	 * @see colmenaML.ContractExposure
	 * @generated
	 */
	EClass getContractExposure();

	/**
	 * Returns the meta object for the attribute '{@link colmenaML.ContractExposure#getVerbType <em>Verb Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Verb Type</em>'.
	 * @see colmenaML.ContractExposure#getVerbType()
	 * @see #getContractExposure()
	 * @generated
	 */
	EAttribute getContractExposure_VerbType();

	/**
	 * Returns the meta object for the attribute '{@link colmenaML.ContractExposure#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see colmenaML.ContractExposure#getUrl()
	 * @see #getContractExposure()
	 * @generated
	 */
	EAttribute getContractExposure_Url();

	/**
	 * Returns the meta object for the containment reference list '{@link colmenaML.ContractExposure#getContained_parameters <em>Contained parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained parameters</em>'.
	 * @see colmenaML.ContractExposure#getContained_parameters()
	 * @see #getContractExposure()
	 * @generated
	 */
	EReference getContractExposure_Contained_parameters();

	/**
	 * Returns the meta object for the containment reference '{@link colmenaML.ContractExposure#getContained_returnType <em>Contained return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contained return Type</em>'.
	 * @see colmenaML.ContractExposure#getContained_returnType()
	 * @see #getContractExposure()
	 * @generated
	 */
	EReference getContractExposure_Contained_returnType();

	/**
	 * Returns the meta object for the attribute '{@link colmenaML.ContractExposure#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see colmenaML.ContractExposure#getName()
	 * @see #getContractExposure()
	 * @generated
	 */
	EAttribute getContractExposure_Name();

	/**
	 * Returns the meta object for the attribute '{@link colmenaML.ContractExposure#isFallbackFunction <em>Fallback Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fallback Function</em>'.
	 * @see colmenaML.ContractExposure#isFallbackFunction()
	 * @see #getContractExposure()
	 * @generated
	 */
	EAttribute getContractExposure_FallbackFunction();

	/**
	 * Returns the meta object for class '{@link colmenaML.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see colmenaML.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the attribute '{@link colmenaML.Package#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see colmenaML.Package#getName()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link colmenaML.Package#getContained_classifiers <em>Contained classifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained classifiers</em>'.
	 * @see colmenaML.Package#getContained_classifiers()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Contained_classifiers();

	/**
	 * Returns the meta object for class '{@link colmenaML.Classifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classifier</em>'.
	 * @see colmenaML.Classifier
	 * @generated
	 */
	EClass getClassifier();

	/**
	 * Returns the meta object for the attribute '{@link colmenaML.Classifier#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see colmenaML.Classifier#getName()
	 * @see #getClassifier()
	 * @generated
	 */
	EAttribute getClassifier_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link colmenaML.Classifier#getContained_operations <em>Contained operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained operations</em>'.
	 * @see colmenaML.Classifier#getContained_operations()
	 * @see #getClassifier()
	 * @generated
	 */
	EReference getClassifier_Contained_operations();

	/**
	 * Returns the meta object for the containment reference list '{@link colmenaML.Classifier#getContained_attributes <em>Contained attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained attributes</em>'.
	 * @see colmenaML.Classifier#getContained_attributes()
	 * @see #getClassifier()
	 * @generated
	 */
	EReference getClassifier_Contained_attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link colmenaML.Classifier#getContained_inheritances <em>Contained inheritances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained inheritances</em>'.
	 * @see colmenaML.Classifier#getContained_inheritances()
	 * @see #getClassifier()
	 * @generated
	 */
	EReference getClassifier_Contained_inheritances();

	/**
	 * Returns the meta object for class '{@link colmenaML.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see colmenaML.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the attribute '{@link colmenaML.Class#isIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see colmenaML.Class#isIsAbstract()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_IsAbstract();

	/**
	 * Returns the meta object for the attribute '{@link colmenaML.Class#isIsAssociative <em>Is Associative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Associative</em>'.
	 * @see colmenaML.Class#isIsAssociative()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_IsAssociative();

	/**
	 * Returns the meta object for the attribute '{@link colmenaML.Class#isIsAuditable <em>Is Auditable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Auditable</em>'.
	 * @see colmenaML.Class#isIsAuditable()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_IsAuditable();

	/**
	 * Returns the meta object for the attribute '{@link colmenaML.Class#getCrudType <em>Crud Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Crud Type</em>'.
	 * @see colmenaML.Class#getCrudType()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_CrudType();

	/**
	 * Returns the meta object for the containment reference list '{@link colmenaML.Class#getContained_relations <em>Contained relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained relations</em>'.
	 * @see colmenaML.Class#getContained_relations()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Contained_relations();

	/**
	 * Returns the meta object for the containment reference list '{@link colmenaML.Class#getContained_implementations <em>Contained implementations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained implementations</em>'.
	 * @see colmenaML.Class#getContained_implementations()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Contained_implementations();

	/**
	 * Returns the meta object for class '{@link colmenaML.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see colmenaML.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for class '{@link colmenaML.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see colmenaML.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for the attribute '{@link colmenaML.Relation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see colmenaML.Relation#getName()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_Name();

	/**
	 * Returns the meta object for the attribute '{@link colmenaML.Relation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see colmenaML.Relation#getType()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_Type();

	/**
	 * Returns the meta object for the attribute '{@link colmenaML.Relation#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity</em>'.
	 * @see colmenaML.Relation#getMultiplicity()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_Multiplicity();

	/**
	 * Returns the meta object for the attribute '{@link colmenaML.Relation#isIsFinal <em>Is Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Final</em>'.
	 * @see colmenaML.Relation#isIsFinal()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_IsFinal();

	/**
	 * Returns the meta object for the attribute '{@link colmenaML.Relation#isIsStatic <em>Is Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Static</em>'.
	 * @see colmenaML.Relation#isIsStatic()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_IsStatic();

	/**
	 * Returns the meta object for the attribute '{@link colmenaML.Relation#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see colmenaML.Relation#getVisibility()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_Visibility();

	/**
	 * Returns the meta object for the attribute '{@link colmenaML.Relation#getCrudType <em>Crud Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Crud Type</em>'.
	 * @see colmenaML.Relation#getCrudType()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_CrudType();

	/**
	 * Returns the meta object for the attribute '{@link colmenaML.Relation#isSubordinate <em>Subordinate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subordinate</em>'.
	 * @see colmenaML.Relation#isSubordinate()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_Subordinate();

	/**
	 * Returns the meta object for the containment reference list '{@link colmenaML.Relation#getAssociative_classes_contained <em>Associative classes contained</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Associative classes contained</em>'.
	 * @see colmenaML.Relation#getAssociative_classes_contained()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Associative_classes_contained();

	/**
	 * Returns the meta object for the reference '{@link colmenaML.Relation#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see colmenaML.Relation#getDestination()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Destination();

	/**
	 * Returns the meta object for the reference '{@link colmenaML.Relation#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origin</em>'.
	 * @see colmenaML.Relation#getOrigin()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Origin();

	/**
	 * Returns the meta object for class '{@link colmenaML.Implementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implementation</em>'.
	 * @see colmenaML.Implementation
	 * @generated
	 */
	EClass getImplementation();

	/**
	 * Returns the meta object for the reference '{@link colmenaML.Implementation#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origin</em>'.
	 * @see colmenaML.Implementation#getOrigin()
	 * @see #getImplementation()
	 * @generated
	 */
	EReference getImplementation_Origin();

	/**
	 * Returns the meta object for the reference '{@link colmenaML.Implementation#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see colmenaML.Implementation#getDestination()
	 * @see #getImplementation()
	 * @generated
	 */
	EReference getImplementation_Destination();

	/**
	 * Returns the meta object for class '{@link colmenaML.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see colmenaML.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link colmenaML.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see colmenaML.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Type();

	/**
	 * Returns the meta object for the attribute '{@link colmenaML.Attribute#isIsAuditable <em>Is Auditable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Auditable</em>'.
	 * @see colmenaML.Attribute#isIsAuditable()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_IsAuditable();

	/**
	 * Returns the meta object for the attribute '{@link colmenaML.Attribute#getPseudonym <em>Pseudonym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pseudonym</em>'.
	 * @see colmenaML.Attribute#getPseudonym()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Pseudonym();

	/**
	 * Returns the meta object for the attribute '{@link colmenaML.Attribute#getGraphicRepresentation <em>Graphic Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Graphic Representation</em>'.
	 * @see colmenaML.Attribute#getGraphicRepresentation()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_GraphicRepresentation();

	/**
	 * Returns the meta object for class '{@link colmenaML.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see colmenaML.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '{@link colmenaML.Operation#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Type</em>'.
	 * @see colmenaML.Operation#getReturnType()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_ReturnType();

	/**
	 * Returns the meta object for the attribute '{@link colmenaML.Operation#isIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see colmenaML.Operation#isIsAbstract()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_IsAbstract();

	/**
	 * Returns the meta object for class '{@link colmenaML.Returnable <em>Returnable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Returnable</em>'.
	 * @see colmenaML.Returnable
	 * @generated
	 */
	EClass getReturnable();

	/**
	 * Returns the meta object for the attribute '{@link colmenaML.Returnable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see colmenaML.Returnable#getName()
	 * @see #getReturnable()
	 * @generated
	 */
	EAttribute getReturnable_Name();

	/**
	 * Returns the meta object for the attribute '{@link colmenaML.Returnable#isIsFinal <em>Is Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Final</em>'.
	 * @see colmenaML.Returnable#isIsFinal()
	 * @see #getReturnable()
	 * @generated
	 */
	EAttribute getReturnable_IsFinal();

	/**
	 * Returns the meta object for the attribute '{@link colmenaML.Returnable#isIsStatic <em>Is Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Static</em>'.
	 * @see colmenaML.Returnable#isIsStatic()
	 * @see #getReturnable()
	 * @generated
	 */
	EAttribute getReturnable_IsStatic();

	/**
	 * Returns the meta object for the attribute '{@link colmenaML.Returnable#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see colmenaML.Returnable#getVisibility()
	 * @see #getReturnable()
	 * @generated
	 */
	EAttribute getReturnable_Visibility();

	/**
	 * Returns the meta object for class '{@link colmenaML.Inheritance <em>Inheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inheritance</em>'.
	 * @see colmenaML.Inheritance
	 * @generated
	 */
	EClass getInheritance();

	/**
	 * Returns the meta object for the reference '{@link colmenaML.Inheritance#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origin</em>'.
	 * @see colmenaML.Inheritance#getOrigin()
	 * @see #getInheritance()
	 * @generated
	 */
	EReference getInheritance_Origin();

	/**
	 * Returns the meta object for the reference '{@link colmenaML.Inheritance#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see colmenaML.Inheritance#getDestination()
	 * @see #getInheritance()
	 * @generated
	 */
	EReference getInheritance_Destination();

	/**
	 * Returns the meta object for class '{@link colmenaML.DTOContainer <em>DTO Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DTO Container</em>'.
	 * @see colmenaML.DTOContainer
	 * @generated
	 */
	EClass getDTOContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link colmenaML.DTOContainer#getContained_dtos <em>Contained dtos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained dtos</em>'.
	 * @see colmenaML.DTOContainer#getContained_dtos()
	 * @see #getDTOContainer()
	 * @generated
	 */
	EReference getDTOContainer_Contained_dtos();

	/**
	 * Returns the meta object for the attribute '{@link colmenaML.DTOContainer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see colmenaML.DTOContainer#getName()
	 * @see #getDTOContainer()
	 * @generated
	 */
	EAttribute getDTOContainer_Name();

	/**
	 * Returns the meta object for class '{@link colmenaML.DTO <em>DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DTO</em>'.
	 * @see colmenaML.DTO
	 * @generated
	 */
	EClass getDTO();

	/**
	 * Returns the meta object for the attribute '{@link colmenaML.DTO#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see colmenaML.DTO#getName()
	 * @see #getDTO()
	 * @generated
	 */
	EAttribute getDTO_Name();

	/**
	 * Returns the meta object for class '{@link colmenaML.DTOReferenceAttribute <em>DTO Reference Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DTO Reference Attribute</em>'.
	 * @see colmenaML.DTOReferenceAttribute
	 * @generated
	 */
	EClass getDTOReferenceAttribute();

	/**
	 * Returns the meta object for the reference '{@link colmenaML.DTOReferenceAttribute#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see colmenaML.DTOReferenceAttribute#getDestination()
	 * @see #getDTOReferenceAttribute()
	 * @generated
	 */
	EReference getDTOReferenceAttribute_Destination();

	/**
	 * Returns the meta object for class '{@link colmenaML.DTOCustomAttribute <em>DTO Custom Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DTO Custom Attribute</em>'.
	 * @see colmenaML.DTOCustomAttribute
	 * @generated
	 */
	EClass getDTOCustomAttribute();

	/**
	 * Returns the meta object for the attribute '{@link colmenaML.DTOCustomAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see colmenaML.DTOCustomAttribute#getName()
	 * @see #getDTOCustomAttribute()
	 * @generated
	 */
	EAttribute getDTOCustomAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link colmenaML.DTOCustomAttribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see colmenaML.DTOCustomAttribute#getType()
	 * @see #getDTOCustomAttribute()
	 * @generated
	 */
	EAttribute getDTOCustomAttribute_Type();

	/**
	 * Returns the meta object for class '{@link colmenaML.ExposureParameters <em>Exposure Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exposure Parameters</em>'.
	 * @see colmenaML.ExposureParameters
	 * @generated
	 */
	EClass getExposureParameters();

	/**
	 * Returns the meta object for the reference '{@link colmenaML.ExposureParameters#getDto <em>Dto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dto</em>'.
	 * @see colmenaML.ExposureParameters#getDto()
	 * @see #getExposureParameters()
	 * @generated
	 */
	EReference getExposureParameters_Dto();

	/**
	 * Returns the meta object for class '{@link colmenaML.ExposureReturnType <em>Exposure Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exposure Return Type</em>'.
	 * @see colmenaML.ExposureReturnType
	 * @generated
	 */
	EClass getExposureReturnType();

	/**
	 * Returns the meta object for the reference '{@link colmenaML.ExposureReturnType#getDto <em>Dto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dto</em>'.
	 * @see colmenaML.ExposureReturnType#getDto()
	 * @see #getExposureReturnType()
	 * @generated
	 */
	EReference getExposureReturnType_Dto();

	/**
	 * Returns the meta object for class '{@link colmenaML.CustomDTO <em>Custom DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom DTO</em>'.
	 * @see colmenaML.CustomDTO
	 * @generated
	 */
	EClass getCustomDTO();

	/**
	 * Returns the meta object for the containment reference list '{@link colmenaML.CustomDTO#getContained_custom_attributes <em>Contained custom attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained custom attributes</em>'.
	 * @see colmenaML.CustomDTO#getContained_custom_attributes()
	 * @see #getCustomDTO()
	 * @generated
	 */
	EReference getCustomDTO_Contained_custom_attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link colmenaML.CustomDTO#getContained_reference_attributes <em>Contained reference attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained reference attributes</em>'.
	 * @see colmenaML.CustomDTO#getContained_reference_attributes()
	 * @see #getCustomDTO()
	 * @generated
	 */
	EReference getCustomDTO_Contained_reference_attributes();

	/**
	 * Returns the meta object for class '{@link colmenaML.ClassDTO <em>Class DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class DTO</em>'.
	 * @see colmenaML.ClassDTO
	 * @generated
	 */
	EClass getClassDTO();

	/**
	 * Returns the meta object for the reference '{@link colmenaML.ClassDTO#getReference_class <em>Reference class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference class</em>'.
	 * @see colmenaML.ClassDTO#getReference_class()
	 * @see #getClassDTO()
	 * @generated
	 */
	EReference getClassDTO_Reference_class();

	/**
	 * Returns the meta object for enum '{@link colmenaML.Language <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Language</em>'.
	 * @see colmenaML.Language
	 * @generated
	 */
	EEnum getLanguage();

	/**
	 * Returns the meta object for enum '{@link colmenaML.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Type</em>'.
	 * @see colmenaML.DataType
	 * @generated
	 */
	EEnum getDataType();

	/**
	 * Returns the meta object for enum '{@link colmenaML.ReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Return Type</em>'.
	 * @see colmenaML.ReturnType
	 * @generated
	 */
	EEnum getReturnType();

	/**
	 * Returns the meta object for enum '{@link colmenaML.RelationMultiplicity <em>Relation Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Relation Multiplicity</em>'.
	 * @see colmenaML.RelationMultiplicity
	 * @generated
	 */
	EEnum getRelationMultiplicity();

	/**
	 * Returns the meta object for enum '{@link colmenaML.AccessModifiers <em>Access Modifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Access Modifiers</em>'.
	 * @see colmenaML.AccessModifiers
	 * @generated
	 */
	EEnum getAccessModifiers();

	/**
	 * Returns the meta object for enum '{@link colmenaML.DatabaseProvider <em>Database Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Database Provider</em>'.
	 * @see colmenaML.DatabaseProvider
	 * @generated
	 */
	EEnum getDatabaseProvider();

	/**
	 * Returns the meta object for enum '{@link colmenaML.HTTPVerbs <em>HTTP Verbs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>HTTP Verbs</em>'.
	 * @see colmenaML.HTTPVerbs
	 * @generated
	 */
	EEnum getHTTPVerbs();

	/**
	 * Returns the meta object for enum '{@link colmenaML.TransferType <em>Transfer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transfer Type</em>'.
	 * @see colmenaML.TransferType
	 * @generated
	 */
	EEnum getTransferType();

	/**
	 * Returns the meta object for enum '{@link colmenaML.RebootType <em>Reboot Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reboot Type</em>'.
	 * @see colmenaML.RebootType
	 * @generated
	 */
	EEnum getRebootType();

	/**
	 * Returns the meta object for enum '{@link colmenaML.GraphicRepresentation <em>Graphic Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Graphic Representation</em>'.
	 * @see colmenaML.GraphicRepresentation
	 * @generated
	 */
	EEnum getGraphicRepresentation();

	/**
	 * Returns the meta object for enum '{@link colmenaML.CRUDType <em>CRUD Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>CRUD Type</em>'.
	 * @see colmenaML.CRUDType
	 * @generated
	 */
	EEnum getCRUDType();

	/**
	 * Returns the meta object for enum '{@link colmenaML.RelationType <em>Relation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Relation Type</em>'.
	 * @see colmenaML.RelationType
	 * @generated
	 */
	EEnum getRelationType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ColmenaMLFactory getColmenaMLFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link colmenaML.impl.ClassDiagramImpl <em>Class Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see colmenaML.impl.ClassDiagramImpl
		 * @see colmenaML.impl.ColmenaMLPackageImpl#getClassDiagram()
		 * @generated
		 */
		EClass CLASS_DIAGRAM = eINSTANCE.getClassDiagram();

		/**
		 * The meta object literal for the '<em><b>Contained contracts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_DIAGRAM__CONTAINED_CONTRACTS = eINSTANCE.getClassDiagram_Contained_contracts();

		/**
		 * The meta object literal for the '<em><b>Contained packages</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_DIAGRAM__CONTAINED_PACKAGES = eINSTANCE.getClassDiagram_Contained_packages();

		/**
		 * The meta object literal for the '<em><b>Contained dto Containers</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_DIAGRAM__CONTAINED_DTO_CONTAINERS = eINSTANCE.getClassDiagram_Contained_dtoContainers();

		/**
		 * The meta object literal for the '{@link colmenaML.impl.ContractImpl <em>Contract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see colmenaML.impl.ContractImpl
		 * @see colmenaML.impl.ColmenaMLPackageImpl#getContract()
		 * @generated
		 */
		EClass CONTRACT = eINSTANCE.getContract();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACT__NAME = eINSTANCE.getContract_Name();

		/**
		 * The meta object literal for the '<em><b>Verbs offered</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRACT__VERBS_OFFERED = eINSTANCE.getContract_Verbs_offered();

		/**
		 * The meta object literal for the '<em><b>Main class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRACT__MAIN_CLASS = eINSTANCE.getContract_Main_class();

		/**
		 * The meta object literal for the '<em><b>Crud Methods</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACT__CRUD_METHODS = eINSTANCE.getContract_CrudMethods();

		/**
		 * The meta object literal for the '{@link colmenaML.impl.ContractExposureImpl <em>Contract Exposure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see colmenaML.impl.ContractExposureImpl
		 * @see colmenaML.impl.ColmenaMLPackageImpl#getContractExposure()
		 * @generated
		 */
		EClass CONTRACT_EXPOSURE = eINSTANCE.getContractExposure();

		/**
		 * The meta object literal for the '<em><b>Verb Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACT_EXPOSURE__VERB_TYPE = eINSTANCE.getContractExposure_VerbType();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACT_EXPOSURE__URL = eINSTANCE.getContractExposure_Url();

		/**
		 * The meta object literal for the '<em><b>Contained parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRACT_EXPOSURE__CONTAINED_PARAMETERS = eINSTANCE.getContractExposure_Contained_parameters();

		/**
		 * The meta object literal for the '<em><b>Contained return Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRACT_EXPOSURE__CONTAINED_RETURN_TYPE = eINSTANCE.getContractExposure_Contained_returnType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACT_EXPOSURE__NAME = eINSTANCE.getContractExposure_Name();

		/**
		 * The meta object literal for the '<em><b>Fallback Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACT_EXPOSURE__FALLBACK_FUNCTION = eINSTANCE.getContractExposure_FallbackFunction();

		/**
		 * The meta object literal for the '{@link colmenaML.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see colmenaML.impl.PackageImpl
		 * @see colmenaML.impl.ColmenaMLPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__NAME = eINSTANCE.getPackage_Name();

		/**
		 * The meta object literal for the '<em><b>Contained classifiers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__CONTAINED_CLASSIFIERS = eINSTANCE.getPackage_Contained_classifiers();

		/**
		 * The meta object literal for the '{@link colmenaML.impl.ClassifierImpl <em>Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see colmenaML.impl.ClassifierImpl
		 * @see colmenaML.impl.ColmenaMLPackageImpl#getClassifier()
		 * @generated
		 */
		EClass CLASSIFIER = eINSTANCE.getClassifier();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFIER__NAME = eINSTANCE.getClassifier_Name();

		/**
		 * The meta object literal for the '<em><b>Contained operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER__CONTAINED_OPERATIONS = eINSTANCE.getClassifier_Contained_operations();

		/**
		 * The meta object literal for the '<em><b>Contained attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER__CONTAINED_ATTRIBUTES = eINSTANCE.getClassifier_Contained_attributes();

		/**
		 * The meta object literal for the '<em><b>Contained inheritances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER__CONTAINED_INHERITANCES = eINSTANCE.getClassifier_Contained_inheritances();

		/**
		 * The meta object literal for the '{@link colmenaML.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see colmenaML.impl.ClassImpl
		 * @see colmenaML.impl.ColmenaMLPackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__IS_ABSTRACT = eINSTANCE.getClass_IsAbstract();

		/**
		 * The meta object literal for the '<em><b>Is Associative</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__IS_ASSOCIATIVE = eINSTANCE.getClass_IsAssociative();

		/**
		 * The meta object literal for the '<em><b>Is Auditable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__IS_AUDITABLE = eINSTANCE.getClass_IsAuditable();

		/**
		 * The meta object literal for the '<em><b>Crud Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__CRUD_TYPE = eINSTANCE.getClass_CrudType();

		/**
		 * The meta object literal for the '<em><b>Contained relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__CONTAINED_RELATIONS = eINSTANCE.getClass_Contained_relations();

		/**
		 * The meta object literal for the '<em><b>Contained implementations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__CONTAINED_IMPLEMENTATIONS = eINSTANCE.getClass_Contained_implementations();

		/**
		 * The meta object literal for the '{@link colmenaML.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see colmenaML.impl.InterfaceImpl
		 * @see colmenaML.impl.ColmenaMLPackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '{@link colmenaML.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see colmenaML.impl.RelationImpl
		 * @see colmenaML.impl.ColmenaMLPackageImpl#getRelation()
		 * @generated
		 */
		EClass RELATION = eINSTANCE.getRelation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__NAME = eINSTANCE.getRelation_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__TYPE = eINSTANCE.getRelation_Type();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__MULTIPLICITY = eINSTANCE.getRelation_Multiplicity();

		/**
		 * The meta object literal for the '<em><b>Is Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__IS_FINAL = eINSTANCE.getRelation_IsFinal();

		/**
		 * The meta object literal for the '<em><b>Is Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__IS_STATIC = eINSTANCE.getRelation_IsStatic();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__VISIBILITY = eINSTANCE.getRelation_Visibility();

		/**
		 * The meta object literal for the '<em><b>Crud Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__CRUD_TYPE = eINSTANCE.getRelation_CrudType();

		/**
		 * The meta object literal for the '<em><b>Subordinate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__SUBORDINATE = eINSTANCE.getRelation_Subordinate();

		/**
		 * The meta object literal for the '<em><b>Associative classes contained</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__ASSOCIATIVE_CLASSES_CONTAINED = eINSTANCE.getRelation_Associative_classes_contained();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__DESTINATION = eINSTANCE.getRelation_Destination();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__ORIGIN = eINSTANCE.getRelation_Origin();

		/**
		 * The meta object literal for the '{@link colmenaML.impl.ImplementationImpl <em>Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see colmenaML.impl.ImplementationImpl
		 * @see colmenaML.impl.ColmenaMLPackageImpl#getImplementation()
		 * @generated
		 */
		EClass IMPLEMENTATION = eINSTANCE.getImplementation();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTATION__ORIGIN = eINSTANCE.getImplementation_Origin();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTATION__DESTINATION = eINSTANCE.getImplementation_Destination();

		/**
		 * The meta object literal for the '{@link colmenaML.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see colmenaML.impl.AttributeImpl
		 * @see colmenaML.impl.ColmenaMLPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

		/**
		 * The meta object literal for the '<em><b>Is Auditable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__IS_AUDITABLE = eINSTANCE.getAttribute_IsAuditable();

		/**
		 * The meta object literal for the '<em><b>Pseudonym</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__PSEUDONYM = eINSTANCE.getAttribute_Pseudonym();

		/**
		 * The meta object literal for the '<em><b>Graphic Representation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__GRAPHIC_REPRESENTATION = eINSTANCE.getAttribute_GraphicRepresentation();

		/**
		 * The meta object literal for the '{@link colmenaML.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see colmenaML.impl.OperationImpl
		 * @see colmenaML.impl.ColmenaMLPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__RETURN_TYPE = eINSTANCE.getOperation_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__IS_ABSTRACT = eINSTANCE.getOperation_IsAbstract();

		/**
		 * The meta object literal for the '{@link colmenaML.impl.ReturnableImpl <em>Returnable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see colmenaML.impl.ReturnableImpl
		 * @see colmenaML.impl.ColmenaMLPackageImpl#getReturnable()
		 * @generated
		 */
		EClass RETURNABLE = eINSTANCE.getReturnable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURNABLE__NAME = eINSTANCE.getReturnable_Name();

		/**
		 * The meta object literal for the '<em><b>Is Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURNABLE__IS_FINAL = eINSTANCE.getReturnable_IsFinal();

		/**
		 * The meta object literal for the '<em><b>Is Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURNABLE__IS_STATIC = eINSTANCE.getReturnable_IsStatic();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURNABLE__VISIBILITY = eINSTANCE.getReturnable_Visibility();

		/**
		 * The meta object literal for the '{@link colmenaML.impl.InheritanceImpl <em>Inheritance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see colmenaML.impl.InheritanceImpl
		 * @see colmenaML.impl.ColmenaMLPackageImpl#getInheritance()
		 * @generated
		 */
		EClass INHERITANCE = eINSTANCE.getInheritance();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INHERITANCE__ORIGIN = eINSTANCE.getInheritance_Origin();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INHERITANCE__DESTINATION = eINSTANCE.getInheritance_Destination();

		/**
		 * The meta object literal for the '{@link colmenaML.impl.DTOContainerImpl <em>DTO Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see colmenaML.impl.DTOContainerImpl
		 * @see colmenaML.impl.ColmenaMLPackageImpl#getDTOContainer()
		 * @generated
		 */
		EClass DTO_CONTAINER = eINSTANCE.getDTOContainer();

		/**
		 * The meta object literal for the '<em><b>Contained dtos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DTO_CONTAINER__CONTAINED_DTOS = eINSTANCE.getDTOContainer_Contained_dtos();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DTO_CONTAINER__NAME = eINSTANCE.getDTOContainer_Name();

		/**
		 * The meta object literal for the '{@link colmenaML.impl.DTOImpl <em>DTO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see colmenaML.impl.DTOImpl
		 * @see colmenaML.impl.ColmenaMLPackageImpl#getDTO()
		 * @generated
		 */
		EClass DTO = eINSTANCE.getDTO();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DTO__NAME = eINSTANCE.getDTO_Name();

		/**
		 * The meta object literal for the '{@link colmenaML.impl.DTOReferenceAttributeImpl <em>DTO Reference Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see colmenaML.impl.DTOReferenceAttributeImpl
		 * @see colmenaML.impl.ColmenaMLPackageImpl#getDTOReferenceAttribute()
		 * @generated
		 */
		EClass DTO_REFERENCE_ATTRIBUTE = eINSTANCE.getDTOReferenceAttribute();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DTO_REFERENCE_ATTRIBUTE__DESTINATION = eINSTANCE.getDTOReferenceAttribute_Destination();

		/**
		 * The meta object literal for the '{@link colmenaML.impl.DTOCustomAttributeImpl <em>DTO Custom Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see colmenaML.impl.DTOCustomAttributeImpl
		 * @see colmenaML.impl.ColmenaMLPackageImpl#getDTOCustomAttribute()
		 * @generated
		 */
		EClass DTO_CUSTOM_ATTRIBUTE = eINSTANCE.getDTOCustomAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DTO_CUSTOM_ATTRIBUTE__NAME = eINSTANCE.getDTOCustomAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DTO_CUSTOM_ATTRIBUTE__TYPE = eINSTANCE.getDTOCustomAttribute_Type();

		/**
		 * The meta object literal for the '{@link colmenaML.impl.ExposureParametersImpl <em>Exposure Parameters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see colmenaML.impl.ExposureParametersImpl
		 * @see colmenaML.impl.ColmenaMLPackageImpl#getExposureParameters()
		 * @generated
		 */
		EClass EXPOSURE_PARAMETERS = eINSTANCE.getExposureParameters();

		/**
		 * The meta object literal for the '<em><b>Dto</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPOSURE_PARAMETERS__DTO = eINSTANCE.getExposureParameters_Dto();

		/**
		 * The meta object literal for the '{@link colmenaML.impl.ExposureReturnTypeImpl <em>Exposure Return Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see colmenaML.impl.ExposureReturnTypeImpl
		 * @see colmenaML.impl.ColmenaMLPackageImpl#getExposureReturnType()
		 * @generated
		 */
		EClass EXPOSURE_RETURN_TYPE = eINSTANCE.getExposureReturnType();

		/**
		 * The meta object literal for the '<em><b>Dto</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPOSURE_RETURN_TYPE__DTO = eINSTANCE.getExposureReturnType_Dto();

		/**
		 * The meta object literal for the '{@link colmenaML.impl.CustomDTOImpl <em>Custom DTO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see colmenaML.impl.CustomDTOImpl
		 * @see colmenaML.impl.ColmenaMLPackageImpl#getCustomDTO()
		 * @generated
		 */
		EClass CUSTOM_DTO = eINSTANCE.getCustomDTO();

		/**
		 * The meta object literal for the '<em><b>Contained custom attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOM_DTO__CONTAINED_CUSTOM_ATTRIBUTES = eINSTANCE.getCustomDTO_Contained_custom_attributes();

		/**
		 * The meta object literal for the '<em><b>Contained reference attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOM_DTO__CONTAINED_REFERENCE_ATTRIBUTES = eINSTANCE.getCustomDTO_Contained_reference_attributes();

		/**
		 * The meta object literal for the '{@link colmenaML.impl.ClassDTOImpl <em>Class DTO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see colmenaML.impl.ClassDTOImpl
		 * @see colmenaML.impl.ColmenaMLPackageImpl#getClassDTO()
		 * @generated
		 */
		EClass CLASS_DTO = eINSTANCE.getClassDTO();

		/**
		 * The meta object literal for the '<em><b>Reference class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_DTO__REFERENCE_CLASS = eINSTANCE.getClassDTO_Reference_class();

		/**
		 * The meta object literal for the '{@link colmenaML.Language <em>Language</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see colmenaML.Language
		 * @see colmenaML.impl.ColmenaMLPackageImpl#getLanguage()
		 * @generated
		 */
		EEnum LANGUAGE = eINSTANCE.getLanguage();

		/**
		 * The meta object literal for the '{@link colmenaML.DataType <em>Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see colmenaML.DataType
		 * @see colmenaML.impl.ColmenaMLPackageImpl#getDataType()
		 * @generated
		 */
		EEnum DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '{@link colmenaML.ReturnType <em>Return Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see colmenaML.ReturnType
		 * @see colmenaML.impl.ColmenaMLPackageImpl#getReturnType()
		 * @generated
		 */
		EEnum RETURN_TYPE = eINSTANCE.getReturnType();

		/**
		 * The meta object literal for the '{@link colmenaML.RelationMultiplicity <em>Relation Multiplicity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see colmenaML.RelationMultiplicity
		 * @see colmenaML.impl.ColmenaMLPackageImpl#getRelationMultiplicity()
		 * @generated
		 */
		EEnum RELATION_MULTIPLICITY = eINSTANCE.getRelationMultiplicity();

		/**
		 * The meta object literal for the '{@link colmenaML.AccessModifiers <em>Access Modifiers</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see colmenaML.AccessModifiers
		 * @see colmenaML.impl.ColmenaMLPackageImpl#getAccessModifiers()
		 * @generated
		 */
		EEnum ACCESS_MODIFIERS = eINSTANCE.getAccessModifiers();

		/**
		 * The meta object literal for the '{@link colmenaML.DatabaseProvider <em>Database Provider</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see colmenaML.DatabaseProvider
		 * @see colmenaML.impl.ColmenaMLPackageImpl#getDatabaseProvider()
		 * @generated
		 */
		EEnum DATABASE_PROVIDER = eINSTANCE.getDatabaseProvider();

		/**
		 * The meta object literal for the '{@link colmenaML.HTTPVerbs <em>HTTP Verbs</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see colmenaML.HTTPVerbs
		 * @see colmenaML.impl.ColmenaMLPackageImpl#getHTTPVerbs()
		 * @generated
		 */
		EEnum HTTP_VERBS = eINSTANCE.getHTTPVerbs();

		/**
		 * The meta object literal for the '{@link colmenaML.TransferType <em>Transfer Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see colmenaML.TransferType
		 * @see colmenaML.impl.ColmenaMLPackageImpl#getTransferType()
		 * @generated
		 */
		EEnum TRANSFER_TYPE = eINSTANCE.getTransferType();

		/**
		 * The meta object literal for the '{@link colmenaML.RebootType <em>Reboot Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see colmenaML.RebootType
		 * @see colmenaML.impl.ColmenaMLPackageImpl#getRebootType()
		 * @generated
		 */
		EEnum REBOOT_TYPE = eINSTANCE.getRebootType();

		/**
		 * The meta object literal for the '{@link colmenaML.GraphicRepresentation <em>Graphic Representation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see colmenaML.GraphicRepresentation
		 * @see colmenaML.impl.ColmenaMLPackageImpl#getGraphicRepresentation()
		 * @generated
		 */
		EEnum GRAPHIC_REPRESENTATION = eINSTANCE.getGraphicRepresentation();

		/**
		 * The meta object literal for the '{@link colmenaML.CRUDType <em>CRUD Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see colmenaML.CRUDType
		 * @see colmenaML.impl.ColmenaMLPackageImpl#getCRUDType()
		 * @generated
		 */
		EEnum CRUD_TYPE = eINSTANCE.getCRUDType();

		/**
		 * The meta object literal for the '{@link colmenaML.RelationType <em>Relation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see colmenaML.RelationType
		 * @see colmenaML.impl.ColmenaMLPackageImpl#getRelationType()
		 * @generated
		 */
		EEnum RELATION_TYPE = eINSTANCE.getRelationType();

	}

} //ColmenaMLPackage
