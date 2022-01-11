/**
 */
package colmenaML.impl;

import colmenaML.AccessModifiers;
import colmenaML.Attribute;
import colmenaML.CRUDType;
import colmenaML.ClassDTO;
import colmenaML.ClassDiagram;
import colmenaML.Classifier;
import colmenaML.ColmenaMLFactory;
import colmenaML.ColmenaMLPackage;
import colmenaML.Contract;
import colmenaML.ContractExposure;
import colmenaML.CustomDTO;
import colmenaML.DTOContainer;
import colmenaML.DTOCustomAttribute;
import colmenaML.DTOReferenceAttribute;
import colmenaML.DataType;
import colmenaML.DatabaseProvider;
import colmenaML.ExposureParameters;
import colmenaML.ExposureReturnType;
import colmenaML.GraphicRepresentation;
import colmenaML.HTTPVerbs;
import colmenaML.Implementation;
import colmenaML.Inheritance;
import colmenaML.Interface;
import colmenaML.Language;
import colmenaML.Operation;
import colmenaML.RebootType;
import colmenaML.Relation;
import colmenaML.RelationMultiplicity;
import colmenaML.RelationType;
import colmenaML.ReturnType;
import colmenaML.Returnable;
import colmenaML.TransferType;

import colmenaMLI.ColmenaMLIPackage;

import colmenaMLI.impl.ColmenaMLIPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ColmenaMLPackageImpl extends EPackageImpl implements ColmenaMLPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contractExposureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inheritanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dtoContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dtoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dtoReferenceAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dtoCustomAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exposureParametersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exposureReturnTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customDTOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classDTOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum languageEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum returnTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum relationMultiplicityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum accessModifiersEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum databaseProviderEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum httpVerbsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transferTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum rebootTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum graphicRepresentationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum crudTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum relationTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see colmenaML.ColmenaMLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ColmenaMLPackageImpl() {
		super(eNS_URI, ColmenaMLFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ColmenaMLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ColmenaMLPackage init() {
		if (isInited)
			return (ColmenaMLPackage) EPackage.Registry.INSTANCE.getEPackage(ColmenaMLPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredColmenaMLPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ColmenaMLPackageImpl theColmenaMLPackage = registeredColmenaMLPackage instanceof ColmenaMLPackageImpl
				? (ColmenaMLPackageImpl) registeredColmenaMLPackage
				: new ColmenaMLPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ColmenaMLIPackage.eNS_URI);
		ColmenaMLIPackageImpl theColmenaMLIPackage = (ColmenaMLIPackageImpl) (registeredPackage instanceof ColmenaMLIPackageImpl
				? registeredPackage
				: ColmenaMLIPackage.eINSTANCE);

		// Create package meta-data objects
		theColmenaMLPackage.createPackageContents();
		theColmenaMLIPackage.createPackageContents();

		// Initialize created meta-data
		theColmenaMLPackage.initializePackageContents();
		theColmenaMLIPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theColmenaMLPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ColmenaMLPackage.eNS_URI, theColmenaMLPackage);
		return theColmenaMLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassDiagram() {
		return classDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassDiagram_Contained_contracts() {
		return (EReference) classDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassDiagram_Contained_packages() {
		return (EReference) classDiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassDiagram_Contained_dtoContainers() {
		return (EReference) classDiagramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContract() {
		return contractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContract_Name() {
		return (EAttribute) contractEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContract_Verbs_offered() {
		return (EReference) contractEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContract_Main_class() {
		return (EReference) contractEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContract_CrudMethods() {
		return (EAttribute) contractEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContractExposure() {
		return contractExposureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContractExposure_VerbType() {
		return (EAttribute) contractExposureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContractExposure_Url() {
		return (EAttribute) contractExposureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractExposure_Contained_parameters() {
		return (EReference) contractExposureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractExposure_Contained_returnType() {
		return (EReference) contractExposureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContractExposure_Name() {
		return (EAttribute) contractExposureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContractExposure_FallbackFunction() {
		return (EAttribute) contractExposureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackage() {
		return packageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_Name() {
		return (EAttribute) packageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_Contained_classifiers() {
		return (EReference) packageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassifier() {
		return classifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassifier_Name() {
		return (EAttribute) classifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_Contained_operations() {
		return (EReference) classifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_Contained_attributes() {
		return (EReference) classifierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_Contained_inheritances() {
		return (EReference) classifierEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClass_() {
		return classEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_IsAbstract() {
		return (EAttribute) classEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_IsAssociative() {
		return (EAttribute) classEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_IsAuditable() {
		return (EAttribute) classEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_CrudType() {
		return (EAttribute) classEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Contained_relations() {
		return (EReference) classEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Contained_implementations() {
		return (EReference) classEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterface() {
		return interfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelation() {
		return relationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelation_Name() {
		return (EAttribute) relationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelation_Type() {
		return (EAttribute) relationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelation_Multiplicity() {
		return (EAttribute) relationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelation_IsFinal() {
		return (EAttribute) relationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelation_IsStatic() {
		return (EAttribute) relationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelation_Visibility() {
		return (EAttribute) relationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelation_CrudType() {
		return (EAttribute) relationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelation_Subordinate() {
		return (EAttribute) relationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelation_Associative_classes_contained() {
		return (EReference) relationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelation_Destination() {
		return (EReference) relationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelation_Origin() {
		return (EReference) relationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplementation() {
		return implementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementation_Origin() {
		return (EReference) implementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementation_Destination() {
		return (EReference) implementationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Type() {
		return (EAttribute) attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_IsAuditable() {
		return (EAttribute) attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Pseudonym() {
		return (EAttribute) attributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_GraphicRepresentation() {
		return (EAttribute) attributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_ReturnType() {
		return (EAttribute) operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_IsAbstract() {
		return (EAttribute) operationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReturnable() {
		return returnableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReturnable_Name() {
		return (EAttribute) returnableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReturnable_IsFinal() {
		return (EAttribute) returnableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReturnable_IsStatic() {
		return (EAttribute) returnableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReturnable_Visibility() {
		return (EAttribute) returnableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInheritance() {
		return inheritanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInheritance_Origin() {
		return (EReference) inheritanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInheritance_Destination() {
		return (EReference) inheritanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDTOContainer() {
		return dtoContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDTOContainer_Contained_dtos() {
		return (EReference) dtoContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDTOContainer_Name() {
		return (EAttribute) dtoContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDTO() {
		return dtoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDTO_Name() {
		return (EAttribute) dtoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDTOReferenceAttribute() {
		return dtoReferenceAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDTOReferenceAttribute_Destination() {
		return (EReference) dtoReferenceAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDTOCustomAttribute() {
		return dtoCustomAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDTOCustomAttribute_Name() {
		return (EAttribute) dtoCustomAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDTOCustomAttribute_Type() {
		return (EAttribute) dtoCustomAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExposureParameters() {
		return exposureParametersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExposureParameters_Dto() {
		return (EReference) exposureParametersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExposureReturnType() {
		return exposureReturnTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExposureReturnType_Dto() {
		return (EReference) exposureReturnTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomDTO() {
		return customDTOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomDTO_Contained_custom_attributes() {
		return (EReference) customDTOEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomDTO_Contained_reference_attributes() {
		return (EReference) customDTOEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassDTO() {
		return classDTOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassDTO_Reference_class() {
		return (EReference) classDTOEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLanguage() {
		return languageEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataType() {
		return dataTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReturnType() {
		return returnTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRelationMultiplicity() {
		return relationMultiplicityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAccessModifiers() {
		return accessModifiersEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDatabaseProvider() {
		return databaseProviderEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHTTPVerbs() {
		return httpVerbsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTransferType() {
		return transferTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRebootType() {
		return rebootTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGraphicRepresentation() {
		return graphicRepresentationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCRUDType() {
		return crudTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRelationType() {
		return relationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColmenaMLFactory getColmenaMLFactory() {
		return (ColmenaMLFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		classDiagramEClass = createEClass(CLASS_DIAGRAM);
		createEReference(classDiagramEClass, CLASS_DIAGRAM__CONTAINED_CONTRACTS);
		createEReference(classDiagramEClass, CLASS_DIAGRAM__CONTAINED_PACKAGES);
		createEReference(classDiagramEClass, CLASS_DIAGRAM__CONTAINED_DTO_CONTAINERS);

		contractEClass = createEClass(CONTRACT);
		createEAttribute(contractEClass, CONTRACT__NAME);
		createEReference(contractEClass, CONTRACT__VERBS_OFFERED);
		createEReference(contractEClass, CONTRACT__MAIN_CLASS);
		createEAttribute(contractEClass, CONTRACT__CRUD_METHODS);

		contractExposureEClass = createEClass(CONTRACT_EXPOSURE);
		createEAttribute(contractExposureEClass, CONTRACT_EXPOSURE__VERB_TYPE);
		createEAttribute(contractExposureEClass, CONTRACT_EXPOSURE__URL);
		createEReference(contractExposureEClass, CONTRACT_EXPOSURE__CONTAINED_PARAMETERS);
		createEReference(contractExposureEClass, CONTRACT_EXPOSURE__CONTAINED_RETURN_TYPE);
		createEAttribute(contractExposureEClass, CONTRACT_EXPOSURE__NAME);
		createEAttribute(contractExposureEClass, CONTRACT_EXPOSURE__FALLBACK_FUNCTION);

		packageEClass = createEClass(PACKAGE);
		createEAttribute(packageEClass, PACKAGE__NAME);
		createEReference(packageEClass, PACKAGE__CONTAINED_CLASSIFIERS);

		classifierEClass = createEClass(CLASSIFIER);
		createEAttribute(classifierEClass, CLASSIFIER__NAME);
		createEReference(classifierEClass, CLASSIFIER__CONTAINED_OPERATIONS);
		createEReference(classifierEClass, CLASSIFIER__CONTAINED_ATTRIBUTES);
		createEReference(classifierEClass, CLASSIFIER__CONTAINED_INHERITANCES);

		classEClass = createEClass(CLASS);
		createEAttribute(classEClass, CLASS__IS_ABSTRACT);
		createEAttribute(classEClass, CLASS__IS_ASSOCIATIVE);
		createEAttribute(classEClass, CLASS__IS_AUDITABLE);
		createEAttribute(classEClass, CLASS__CRUD_TYPE);
		createEReference(classEClass, CLASS__CONTAINED_RELATIONS);
		createEReference(classEClass, CLASS__CONTAINED_IMPLEMENTATIONS);

		interfaceEClass = createEClass(INTERFACE);

		relationEClass = createEClass(RELATION);
		createEAttribute(relationEClass, RELATION__NAME);
		createEAttribute(relationEClass, RELATION__TYPE);
		createEAttribute(relationEClass, RELATION__MULTIPLICITY);
		createEAttribute(relationEClass, RELATION__IS_FINAL);
		createEAttribute(relationEClass, RELATION__IS_STATIC);
		createEAttribute(relationEClass, RELATION__VISIBILITY);
		createEAttribute(relationEClass, RELATION__CRUD_TYPE);
		createEAttribute(relationEClass, RELATION__SUBORDINATE);
		createEReference(relationEClass, RELATION__ASSOCIATIVE_CLASSES_CONTAINED);
		createEReference(relationEClass, RELATION__DESTINATION);
		createEReference(relationEClass, RELATION__ORIGIN);

		implementationEClass = createEClass(IMPLEMENTATION);
		createEReference(implementationEClass, IMPLEMENTATION__ORIGIN);
		createEReference(implementationEClass, IMPLEMENTATION__DESTINATION);

		attributeEClass = createEClass(ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__TYPE);
		createEAttribute(attributeEClass, ATTRIBUTE__IS_AUDITABLE);
		createEAttribute(attributeEClass, ATTRIBUTE__PSEUDONYM);
		createEAttribute(attributeEClass, ATTRIBUTE__GRAPHIC_REPRESENTATION);

		operationEClass = createEClass(OPERATION);
		createEAttribute(operationEClass, OPERATION__RETURN_TYPE);
		createEAttribute(operationEClass, OPERATION__IS_ABSTRACT);

		returnableEClass = createEClass(RETURNABLE);
		createEAttribute(returnableEClass, RETURNABLE__NAME);
		createEAttribute(returnableEClass, RETURNABLE__IS_FINAL);
		createEAttribute(returnableEClass, RETURNABLE__IS_STATIC);
		createEAttribute(returnableEClass, RETURNABLE__VISIBILITY);

		inheritanceEClass = createEClass(INHERITANCE);
		createEReference(inheritanceEClass, INHERITANCE__ORIGIN);
		createEReference(inheritanceEClass, INHERITANCE__DESTINATION);

		dtoContainerEClass = createEClass(DTO_CONTAINER);
		createEReference(dtoContainerEClass, DTO_CONTAINER__CONTAINED_DTOS);
		createEAttribute(dtoContainerEClass, DTO_CONTAINER__NAME);

		dtoEClass = createEClass(DTO);
		createEAttribute(dtoEClass, DTO__NAME);

		dtoReferenceAttributeEClass = createEClass(DTO_REFERENCE_ATTRIBUTE);
		createEReference(dtoReferenceAttributeEClass, DTO_REFERENCE_ATTRIBUTE__DESTINATION);

		dtoCustomAttributeEClass = createEClass(DTO_CUSTOM_ATTRIBUTE);
		createEAttribute(dtoCustomAttributeEClass, DTO_CUSTOM_ATTRIBUTE__NAME);
		createEAttribute(dtoCustomAttributeEClass, DTO_CUSTOM_ATTRIBUTE__TYPE);

		exposureParametersEClass = createEClass(EXPOSURE_PARAMETERS);
		createEReference(exposureParametersEClass, EXPOSURE_PARAMETERS__DTO);

		exposureReturnTypeEClass = createEClass(EXPOSURE_RETURN_TYPE);
		createEReference(exposureReturnTypeEClass, EXPOSURE_RETURN_TYPE__DTO);

		customDTOEClass = createEClass(CUSTOM_DTO);
		createEReference(customDTOEClass, CUSTOM_DTO__CONTAINED_CUSTOM_ATTRIBUTES);
		createEReference(customDTOEClass, CUSTOM_DTO__CONTAINED_REFERENCE_ATTRIBUTES);

		classDTOEClass = createEClass(CLASS_DTO);
		createEReference(classDTOEClass, CLASS_DTO__REFERENCE_CLASS);

		// Create enums
		languageEEnum = createEEnum(LANGUAGE);
		dataTypeEEnum = createEEnum(DATA_TYPE);
		returnTypeEEnum = createEEnum(RETURN_TYPE);
		relationMultiplicityEEnum = createEEnum(RELATION_MULTIPLICITY);
		accessModifiersEEnum = createEEnum(ACCESS_MODIFIERS);
		databaseProviderEEnum = createEEnum(DATABASE_PROVIDER);
		httpVerbsEEnum = createEEnum(HTTP_VERBS);
		transferTypeEEnum = createEEnum(TRANSFER_TYPE);
		rebootTypeEEnum = createEEnum(REBOOT_TYPE);
		graphicRepresentationEEnum = createEEnum(GRAPHIC_REPRESENTATION);
		crudTypeEEnum = createEEnum(CRUD_TYPE);
		relationTypeEEnum = createEEnum(RELATION_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		classEClass.getESuperTypes().add(this.getClassifier());
		interfaceEClass.getESuperTypes().add(this.getClassifier());
		attributeEClass.getESuperTypes().add(this.getReturnable());
		operationEClass.getESuperTypes().add(this.getReturnable());
		customDTOEClass.getESuperTypes().add(this.getDTO());
		classDTOEClass.getESuperTypes().add(this.getDTO());

		// Initialize classes, features, and operations; add parameters
		initEClass(classDiagramEClass, ClassDiagram.class, "ClassDiagram", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassDiagram_Contained_contracts(), this.getContract(), null, "contained_contracts", null, 0,
				-1, ClassDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassDiagram_Contained_packages(), this.getPackage(), null, "contained_packages", null, 0, 1,
				ClassDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassDiagram_Contained_dtoContainers(), this.getDTOContainer(), null,
				"contained_dtoContainers", null, 0, 1, ClassDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contractEClass, Contract.class, "Contract", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContract_Name(), ecorePackage.getEString(), "name", null, 0, 1, Contract.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContract_Verbs_offered(), this.getContractExposure(), null, "verbs_offered", null, 0, -1,
				Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContract_Main_class(), this.getClass_(), null, "main_class", null, 0, 1, Contract.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContract_CrudMethods(), ecorePackage.getEBoolean(), "crudMethods", "true", 0, 1,
				Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(contractExposureEClass, ContractExposure.class, "ContractExposure", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContractExposure_VerbType(), this.getHTTPVerbs(), "verbType", null, 0, 1,
				ContractExposure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getContractExposure_Url(), ecorePackage.getEString(), "url", null, 0, 1, ContractExposure.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContractExposure_Contained_parameters(), this.getExposureParameters(), null,
				"contained_parameters", null, 0, -1, ContractExposure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContractExposure_Contained_returnType(), this.getExposureReturnType(), null,
				"contained_returnType", null, 0, 1, ContractExposure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContractExposure_Name(), ecorePackage.getEString(), "name", "", 0, 1, ContractExposure.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContractExposure_FallbackFunction(), ecorePackage.getEBoolean(), "fallbackFunction", "true",
				0, 1, ContractExposure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageEClass, colmenaML.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPackage_Name(), ecorePackage.getEString(), "name", null, 0, 1, colmenaML.Package.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackage_Contained_classifiers(), this.getClassifier(), null, "contained_classifiers", null, 0,
				-1, colmenaML.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classifierEClass, Classifier.class, "Classifier", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClassifier_Name(), ecorePackage.getEString(), "name", null, 0, 1, Classifier.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassifier_Contained_operations(), this.getOperation(), null, "contained_operations", null, 0,
				-1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassifier_Contained_attributes(), this.getAttribute(), null, "contained_attributes", null, 0,
				-1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassifier_Contained_inheritances(), this.getInheritance(), null, "contained_inheritances",
				null, 0, -1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classEClass, colmenaML.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClass_IsAbstract(), ecorePackage.getEBoolean(), "isAbstract", null, 0, 1,
				colmenaML.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getClass_IsAssociative(), ecorePackage.getEBoolean(), "isAssociative", null, 0, 1,
				colmenaML.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getClass_IsAuditable(), ecorePackage.getEBoolean(), "isAuditable", null, 0, 1,
				colmenaML.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getClass_CrudType(), this.getCRUDType(), "crudType", null, 0, 1, colmenaML.Class.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_Contained_relations(), this.getRelation(), null, "contained_relations", null, 0, -1,
				colmenaML.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_Contained_implementations(), this.getImplementation(), null,
				"contained_implementations", null, 0, -1, colmenaML.Class.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceEClass, Interface.class, "Interface", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(relationEClass, Relation.class, "Relation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelation_Name(), ecorePackage.getEString(), "name", null, 0, 1, Relation.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelation_Type(), this.getRelationType(), "type", null, 0, 1, Relation.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelation_Multiplicity(), this.getRelationMultiplicity(), "multiplicity", null, 0, 1,
				Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelation_IsFinal(), ecorePackage.getEBoolean(), "isFinal", null, 0, 1, Relation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelation_IsStatic(), ecorePackage.getEBoolean(), "isStatic", null, 0, 1, Relation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelation_Visibility(), this.getAccessModifiers(), "visibility", null, 0, 1, Relation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelation_CrudType(), this.getCRUDType(), "crudType", null, 0, 1, Relation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelation_Subordinate(), ecorePackage.getEBoolean(), "subordinate", null, 0, 1, Relation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelation_Associative_classes_contained(), this.getClass_(), null,
				"associative_classes_contained", null, 0, -1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelation_Destination(), this.getClassifier(), null, "destination", null, 0, 1, Relation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelation_Origin(), this.getClass_(), null, "origin", null, 0, 1, Relation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(implementationEClass, Implementation.class, "Implementation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImplementation_Origin(), this.getClass_(), null, "origin", null, 0, 1, Implementation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImplementation_Destination(), this.getInterface(), null, "destination", null, 0, 1,
				Implementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_Type(), this.getDataType(), "type", null, 0, 1, Attribute.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_IsAuditable(), ecorePackage.getEBoolean(), "isAuditable", null, 0, 1,
				Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Pseudonym(), ecorePackage.getEString(), "pseudonym", null, 0, 1, Attribute.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_GraphicRepresentation(), this.getGraphicRepresentation(), "graphicRepresentation",
				null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperation_ReturnType(), this.getReturnType(), "returnType", null, 0, 1, Operation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_IsAbstract(), ecorePackage.getEBoolean(), "isAbstract", null, 0, 1, Operation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(returnableEClass, Returnable.class, "Returnable", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReturnable_Name(), ecorePackage.getEString(), "name", null, 0, 1, Returnable.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReturnable_IsFinal(), ecorePackage.getEBoolean(), "isFinal", null, 0, 1, Returnable.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReturnable_IsStatic(), ecorePackage.getEBoolean(), "isStatic", null, 0, 1, Returnable.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReturnable_Visibility(), this.getAccessModifiers(), "visibility", null, 0, 1,
				Returnable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(inheritanceEClass, Inheritance.class, "Inheritance", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInheritance_Origin(), this.getClassifier(), null, "origin", null, 0, 1, Inheritance.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInheritance_Destination(), this.getClassifier(), null, "destination", null, 0, 1,
				Inheritance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dtoContainerEClass, DTOContainer.class, "DTOContainer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDTOContainer_Contained_dtos(), this.getDTO(), null, "contained_dtos", null, 0, -1,
				DTOContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDTOContainer_Name(), ecorePackage.getEString(), "name", null, 0, 1, DTOContainer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dtoEClass, colmenaML.DTO.class, "DTO", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDTO_Name(), ecorePackage.getEString(), "name", null, 0, 1, colmenaML.DTO.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dtoReferenceAttributeEClass, DTOReferenceAttribute.class, "DTOReferenceAttribute", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDTOReferenceAttribute_Destination(), this.getAttribute(), null, "destination", null, 0, 1,
				DTOReferenceAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dtoCustomAttributeEClass, DTOCustomAttribute.class, "DTOCustomAttribute", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDTOCustomAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				DTOCustomAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDTOCustomAttribute_Type(), this.getDataType(), "type", null, 0, 1, DTOCustomAttribute.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exposureParametersEClass, ExposureParameters.class, "ExposureParameters", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExposureParameters_Dto(), this.getDTO(), null, "dto", null, 1, 1, ExposureParameters.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exposureReturnTypeEClass, ExposureReturnType.class, "ExposureReturnType", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExposureReturnType_Dto(), this.getDTO(), null, "dto", null, 1, 1, ExposureReturnType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customDTOEClass, CustomDTO.class, "CustomDTO", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCustomDTO_Contained_custom_attributes(), this.getDTOCustomAttribute(), null,
				"contained_custom_attributes", null, 0, -1, CustomDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomDTO_Contained_reference_attributes(), this.getDTOReferenceAttribute(), null,
				"contained_reference_attributes", null, 0, -1, CustomDTO.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classDTOEClass, ClassDTO.class, "ClassDTO", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassDTO_Reference_class(), this.getClass_(), null, "reference_class", null, 1, 1,
				ClassDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(languageEEnum, Language.class, "Language");
		addEEnumLiteral(languageEEnum, Language.JAVA);
		addEEnumLiteral(languageEEnum, Language.PYTHON);
		addEEnumLiteral(languageEEnum, Language.NET);
		addEEnumLiteral(languageEEnum, Language.NODE);

		initEEnum(dataTypeEEnum, DataType.class, "DataType");
		addEEnumLiteral(dataTypeEEnum, DataType.INT);
		addEEnumLiteral(dataTypeEEnum, DataType.FLOAT);
		addEEnumLiteral(dataTypeEEnum, DataType.DOUBLE);
		addEEnumLiteral(dataTypeEEnum, DataType.CHAR);
		addEEnumLiteral(dataTypeEEnum, DataType.BYTE);
		addEEnumLiteral(dataTypeEEnum, DataType.BOOLEAN);
		addEEnumLiteral(dataTypeEEnum, DataType.STRING);
		addEEnumLiteral(dataTypeEEnum, DataType.DATE);

		initEEnum(returnTypeEEnum, ReturnType.class, "ReturnType");
		addEEnumLiteral(returnTypeEEnum, ReturnType.VOID);
		addEEnumLiteral(returnTypeEEnum, ReturnType.FLOAT);
		addEEnumLiteral(returnTypeEEnum, ReturnType.INT);
		addEEnumLiteral(returnTypeEEnum, ReturnType.DOUBLE);
		addEEnumLiteral(returnTypeEEnum, ReturnType.CHAR);
		addEEnumLiteral(returnTypeEEnum, ReturnType.BYTE);
		addEEnumLiteral(returnTypeEEnum, ReturnType.BOOLEAN);
		addEEnumLiteral(returnTypeEEnum, ReturnType.STRING);

		initEEnum(relationMultiplicityEEnum, RelationMultiplicity.class, "RelationMultiplicity");
		addEEnumLiteral(relationMultiplicityEEnum, RelationMultiplicity.ONE_TO_ONE);
		addEEnumLiteral(relationMultiplicityEEnum, RelationMultiplicity.ONE_TO_MANY);
		addEEnumLiteral(relationMultiplicityEEnum, RelationMultiplicity.MANY_TO_ONE);
		addEEnumLiteral(relationMultiplicityEEnum, RelationMultiplicity.MANY_TO_MANY);

		initEEnum(accessModifiersEEnum, AccessModifiers.class, "AccessModifiers");
		addEEnumLiteral(accessModifiersEEnum, AccessModifiers.PRIVATE);
		addEEnumLiteral(accessModifiersEEnum, AccessModifiers.PUBLIC);
		addEEnumLiteral(accessModifiersEEnum, AccessModifiers.PROTECTED);
		addEEnumLiteral(accessModifiersEEnum, AccessModifiers.PACKAGE);

		initEEnum(databaseProviderEEnum, DatabaseProvider.class, "DatabaseProvider");
		addEEnumLiteral(databaseProviderEEnum, DatabaseProvider.MY_SQL);
		addEEnumLiteral(databaseProviderEEnum, DatabaseProvider.MONGO_DB);
		addEEnumLiteral(databaseProviderEEnum, DatabaseProvider.ORACLE);
		addEEnumLiteral(databaseProviderEEnum, DatabaseProvider.DB2);

		initEEnum(httpVerbsEEnum, HTTPVerbs.class, "HTTPVerbs");
		addEEnumLiteral(httpVerbsEEnum, HTTPVerbs.GET);
		addEEnumLiteral(httpVerbsEEnum, HTTPVerbs.POST);
		addEEnumLiteral(httpVerbsEEnum, HTTPVerbs.PUT);
		addEEnumLiteral(httpVerbsEEnum, HTTPVerbs.DELETE);

		initEEnum(transferTypeEEnum, TransferType.class, "TransferType");
		addEEnumLiteral(transferTypeEEnum, TransferType.JSON);
		addEEnumLiteral(transferTypeEEnum, TransferType.STRING);
		addEEnumLiteral(transferTypeEEnum, TransferType.XML);

		initEEnum(rebootTypeEEnum, RebootType.class, "RebootType");
		addEEnumLiteral(rebootTypeEEnum, RebootType.ALWAYS);
		addEEnumLiteral(rebootTypeEEnum, RebootType.NEVER);

		initEEnum(graphicRepresentationEEnum, GraphicRepresentation.class, "GraphicRepresentation");
		addEEnumLiteral(graphicRepresentationEEnum, GraphicRepresentation.TEXT);
		addEEnumLiteral(graphicRepresentationEEnum, GraphicRepresentation.COMBO);
		addEEnumLiteral(graphicRepresentationEEnum, GraphicRepresentation.RADIO);
		addEEnumLiteral(graphicRepresentationEEnum, GraphicRepresentation.CHECKBOX);
		addEEnumLiteral(graphicRepresentationEEnum, GraphicRepresentation.DATE);

		initEEnum(crudTypeEEnum, CRUDType.class, "CRUDType");
		addEEnumLiteral(crudTypeEEnum, CRUDType.SIMPLE);
		addEEnumLiteral(crudTypeEEnum, CRUDType.SELECTABLE);
		addEEnumLiteral(crudTypeEEnum, CRUDType.MASTER_DETAIL);
		addEEnumLiteral(crudTypeEEnum, CRUDType.MASTER_DETAIL_COMBO);
		addEEnumLiteral(crudTypeEEnum, CRUDType.MASTER_COMBO_DETAIL);
		addEEnumLiteral(crudTypeEEnum, CRUDType.MASTER_COMBO_DETAIL_COMBO);
		addEEnumLiteral(crudTypeEEnum, CRUDType.NONE);

		initEEnum(relationTypeEEnum, RelationType.class, "RelationType");
		addEEnumLiteral(relationTypeEEnum, RelationType.UNIDIRECTIONAL);
		addEEnumLiteral(relationTypeEEnum, RelationType.AGGREGATION);
		addEEnumLiteral(relationTypeEEnum, RelationType.COMPOSITION);
		addEEnumLiteral(relationTypeEEnum, RelationType.USAGE_DEPENDENCY);
		addEEnumLiteral(relationTypeEEnum, RelationType.CREATION_DEPENDENCY);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.obeo.fr/dsl/dnc/archetype
		createArchetypeAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.obeo.fr/dsl/dnc/archetype</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createArchetypeAnnotations() {
		String source = "http://www.obeo.fr/dsl/dnc/archetype";
		addAnnotation(returnableEClass, source, new String[] { "archetype", "Description" });
	}

} //ColmenaMLPackageImpl
