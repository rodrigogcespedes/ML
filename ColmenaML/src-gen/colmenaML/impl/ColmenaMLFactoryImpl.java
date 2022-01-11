/**
 */
package colmenaML.impl;

import colmenaML.AccessModifiers;
import colmenaML.Attribute;
import colmenaML.CRUDType;
import colmenaML.ClassDTO;
import colmenaML.ClassDiagram;
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
import colmenaML.TransferType;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ColmenaMLFactoryImpl extends EFactoryImpl implements ColmenaMLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ColmenaMLFactory init() {
		try {
			ColmenaMLFactory theColmenaMLFactory = (ColmenaMLFactory) EPackage.Registry.INSTANCE
					.getEFactory(ColmenaMLPackage.eNS_URI);
			if (theColmenaMLFactory != null) {
				return theColmenaMLFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ColmenaMLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColmenaMLFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ColmenaMLPackage.CLASS_DIAGRAM:
			return createClassDiagram();
		case ColmenaMLPackage.CONTRACT:
			return createContract();
		case ColmenaMLPackage.CONTRACT_EXPOSURE:
			return createContractExposure();
		case ColmenaMLPackage.PACKAGE:
			return createPackage();
		case ColmenaMLPackage.CLASS:
			return createClass();
		case ColmenaMLPackage.INTERFACE:
			return createInterface();
		case ColmenaMLPackage.RELATION:
			return createRelation();
		case ColmenaMLPackage.IMPLEMENTATION:
			return createImplementation();
		case ColmenaMLPackage.ATTRIBUTE:
			return createAttribute();
		case ColmenaMLPackage.OPERATION:
			return createOperation();
		case ColmenaMLPackage.INHERITANCE:
			return createInheritance();
		case ColmenaMLPackage.DTO_CONTAINER:
			return createDTOContainer();
		case ColmenaMLPackage.DTO_REFERENCE_ATTRIBUTE:
			return createDTOReferenceAttribute();
		case ColmenaMLPackage.DTO_CUSTOM_ATTRIBUTE:
			return createDTOCustomAttribute();
		case ColmenaMLPackage.EXPOSURE_PARAMETERS:
			return createExposureParameters();
		case ColmenaMLPackage.EXPOSURE_RETURN_TYPE:
			return createExposureReturnType();
		case ColmenaMLPackage.CUSTOM_DTO:
			return createCustomDTO();
		case ColmenaMLPackage.CLASS_DTO:
			return createClassDTO();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case ColmenaMLPackage.LANGUAGE:
			return createLanguageFromString(eDataType, initialValue);
		case ColmenaMLPackage.DATA_TYPE:
			return createDataTypeFromString(eDataType, initialValue);
		case ColmenaMLPackage.RETURN_TYPE:
			return createReturnTypeFromString(eDataType, initialValue);
		case ColmenaMLPackage.RELATION_MULTIPLICITY:
			return createRelationMultiplicityFromString(eDataType, initialValue);
		case ColmenaMLPackage.ACCESS_MODIFIERS:
			return createAccessModifiersFromString(eDataType, initialValue);
		case ColmenaMLPackage.DATABASE_PROVIDER:
			return createDatabaseProviderFromString(eDataType, initialValue);
		case ColmenaMLPackage.HTTP_VERBS:
			return createHTTPVerbsFromString(eDataType, initialValue);
		case ColmenaMLPackage.TRANSFER_TYPE:
			return createTransferTypeFromString(eDataType, initialValue);
		case ColmenaMLPackage.REBOOT_TYPE:
			return createRebootTypeFromString(eDataType, initialValue);
		case ColmenaMLPackage.GRAPHIC_REPRESENTATION:
			return createGraphicRepresentationFromString(eDataType, initialValue);
		case ColmenaMLPackage.CRUD_TYPE:
			return createCRUDTypeFromString(eDataType, initialValue);
		case ColmenaMLPackage.RELATION_TYPE:
			return createRelationTypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case ColmenaMLPackage.LANGUAGE:
			return convertLanguageToString(eDataType, instanceValue);
		case ColmenaMLPackage.DATA_TYPE:
			return convertDataTypeToString(eDataType, instanceValue);
		case ColmenaMLPackage.RETURN_TYPE:
			return convertReturnTypeToString(eDataType, instanceValue);
		case ColmenaMLPackage.RELATION_MULTIPLICITY:
			return convertRelationMultiplicityToString(eDataType, instanceValue);
		case ColmenaMLPackage.ACCESS_MODIFIERS:
			return convertAccessModifiersToString(eDataType, instanceValue);
		case ColmenaMLPackage.DATABASE_PROVIDER:
			return convertDatabaseProviderToString(eDataType, instanceValue);
		case ColmenaMLPackage.HTTP_VERBS:
			return convertHTTPVerbsToString(eDataType, instanceValue);
		case ColmenaMLPackage.TRANSFER_TYPE:
			return convertTransferTypeToString(eDataType, instanceValue);
		case ColmenaMLPackage.REBOOT_TYPE:
			return convertRebootTypeToString(eDataType, instanceValue);
		case ColmenaMLPackage.GRAPHIC_REPRESENTATION:
			return convertGraphicRepresentationToString(eDataType, instanceValue);
		case ColmenaMLPackage.CRUD_TYPE:
			return convertCRUDTypeToString(eDataType, instanceValue);
		case ColmenaMLPackage.RELATION_TYPE:
			return convertRelationTypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDiagram createClassDiagram() {
		ClassDiagramImpl classDiagram = new ClassDiagramImpl();
		return classDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contract createContract() {
		ContractImpl contract = new ContractImpl();
		return contract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractExposure createContractExposure() {
		ContractExposureImpl contractExposure = new ContractExposureImpl();
		return contractExposure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public colmenaML.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public colmenaML.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface createInterface() {
		InterfaceImpl interface_ = new InterfaceImpl();
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation createRelation() {
		RelationImpl relation = new RelationImpl();
		return relation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Implementation createImplementation() {
		ImplementationImpl implementation = new ImplementationImpl();
		return implementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inheritance createInheritance() {
		InheritanceImpl inheritance = new InheritanceImpl();
		return inheritance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTOContainer createDTOContainer() {
		DTOContainerImpl dtoContainer = new DTOContainerImpl();
		return dtoContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTOReferenceAttribute createDTOReferenceAttribute() {
		DTOReferenceAttributeImpl dtoReferenceAttribute = new DTOReferenceAttributeImpl();
		return dtoReferenceAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTOCustomAttribute createDTOCustomAttribute() {
		DTOCustomAttributeImpl dtoCustomAttribute = new DTOCustomAttributeImpl();
		return dtoCustomAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExposureParameters createExposureParameters() {
		ExposureParametersImpl exposureParameters = new ExposureParametersImpl();
		return exposureParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExposureReturnType createExposureReturnType() {
		ExposureReturnTypeImpl exposureReturnType = new ExposureReturnTypeImpl();
		return exposureReturnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomDTO createCustomDTO() {
		CustomDTOImpl customDTO = new CustomDTOImpl();
		return customDTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDTO createClassDTO() {
		ClassDTOImpl classDTO = new ClassDTOImpl();
		return classDTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Language createLanguageFromString(EDataType eDataType, String initialValue) {
		Language result = Language.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLanguageToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType createDataTypeFromString(EDataType eDataType, String initialValue) {
		DataType result = DataType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnType createReturnTypeFromString(EDataType eDataType, String initialValue) {
		ReturnType result = ReturnType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReturnTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationMultiplicity createRelationMultiplicityFromString(EDataType eDataType, String initialValue) {
		RelationMultiplicity result = RelationMultiplicity.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelationMultiplicityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessModifiers createAccessModifiersFromString(EDataType eDataType, String initialValue) {
		AccessModifiers result = AccessModifiers.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccessModifiersToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseProvider createDatabaseProviderFromString(EDataType eDataType, String initialValue) {
		DatabaseProvider result = DatabaseProvider.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDatabaseProviderToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTTPVerbs createHTTPVerbsFromString(EDataType eDataType, String initialValue) {
		HTTPVerbs result = HTTPVerbs.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHTTPVerbsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransferType createTransferTypeFromString(EDataType eDataType, String initialValue) {
		TransferType result = TransferType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransferTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RebootType createRebootTypeFromString(EDataType eDataType, String initialValue) {
		RebootType result = RebootType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRebootTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphicRepresentation createGraphicRepresentationFromString(EDataType eDataType, String initialValue) {
		GraphicRepresentation result = GraphicRepresentation.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGraphicRepresentationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CRUDType createCRUDTypeFromString(EDataType eDataType, String initialValue) {
		CRUDType result = CRUDType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCRUDTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationType createRelationTypeFromString(EDataType eDataType, String initialValue) {
		RelationType result = RelationType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColmenaMLPackage getColmenaMLPackage() {
		return (ColmenaMLPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ColmenaMLPackage getPackage() {
		return ColmenaMLPackage.eINSTANCE;
	}

} //ColmenaMLFactoryImpl
