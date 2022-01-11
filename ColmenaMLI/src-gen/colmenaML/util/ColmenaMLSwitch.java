/**
 */
package colmenaML.util;

import colmenaML.Attribute;
import colmenaML.ClassDTO;
import colmenaML.ClassDiagram;
import colmenaML.Classifier;
import colmenaML.ColmenaMLPackage;
import colmenaML.Contract;
import colmenaML.ContractExposure;
import colmenaML.CustomDTO;
import colmenaML.DTO;
import colmenaML.DTOContainer;
import colmenaML.DTOCustomAttribute;
import colmenaML.DTOReferenceAttribute;
import colmenaML.ExposureParameters;
import colmenaML.ExposureReturnType;
import colmenaML.Implementation;
import colmenaML.Inheritance;
import colmenaML.Interface;
import colmenaML.Operation;
import colmenaML.Relation;
import colmenaML.Returnable;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see colmenaML.ColmenaMLPackage
 * @generated
 */
public class ColmenaMLSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ColmenaMLPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColmenaMLSwitch() {
		if (modelPackage == null) {
			modelPackage = ColmenaMLPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case ColmenaMLPackage.CLASS_DIAGRAM: {
			ClassDiagram classDiagram = (ClassDiagram) theEObject;
			T result = caseClassDiagram(classDiagram);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ColmenaMLPackage.CONTRACT: {
			Contract contract = (Contract) theEObject;
			T result = caseContract(contract);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ColmenaMLPackage.CONTRACT_EXPOSURE: {
			ContractExposure contractExposure = (ContractExposure) theEObject;
			T result = caseContractExposure(contractExposure);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ColmenaMLPackage.PACKAGE: {
			colmenaML.Package package_ = (colmenaML.Package) theEObject;
			T result = casePackage(package_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ColmenaMLPackage.CLASSIFIER: {
			Classifier classifier = (Classifier) theEObject;
			T result = caseClassifier(classifier);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ColmenaMLPackage.CLASS: {
			colmenaML.Class class_ = (colmenaML.Class) theEObject;
			T result = caseClass(class_);
			if (result == null)
				result = caseClassifier(class_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ColmenaMLPackage.INTERFACE: {
			Interface interface_ = (Interface) theEObject;
			T result = caseInterface(interface_);
			if (result == null)
				result = caseClassifier(interface_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ColmenaMLPackage.RELATION: {
			Relation relation = (Relation) theEObject;
			T result = caseRelation(relation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ColmenaMLPackage.IMPLEMENTATION: {
			Implementation implementation = (Implementation) theEObject;
			T result = caseImplementation(implementation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ColmenaMLPackage.ATTRIBUTE: {
			Attribute attribute = (Attribute) theEObject;
			T result = caseAttribute(attribute);
			if (result == null)
				result = caseReturnable(attribute);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ColmenaMLPackage.OPERATION: {
			Operation operation = (Operation) theEObject;
			T result = caseOperation(operation);
			if (result == null)
				result = caseReturnable(operation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ColmenaMLPackage.RETURNABLE: {
			Returnable returnable = (Returnable) theEObject;
			T result = caseReturnable(returnable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ColmenaMLPackage.INHERITANCE: {
			Inheritance inheritance = (Inheritance) theEObject;
			T result = caseInheritance(inheritance);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ColmenaMLPackage.DTO_CONTAINER: {
			DTOContainer dtoContainer = (DTOContainer) theEObject;
			T result = caseDTOContainer(dtoContainer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ColmenaMLPackage.DTO: {
			DTO dto = (DTO) theEObject;
			T result = caseDTO(dto);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ColmenaMLPackage.DTO_REFERENCE_ATTRIBUTE: {
			DTOReferenceAttribute dtoReferenceAttribute = (DTOReferenceAttribute) theEObject;
			T result = caseDTOReferenceAttribute(dtoReferenceAttribute);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ColmenaMLPackage.DTO_CUSTOM_ATTRIBUTE: {
			DTOCustomAttribute dtoCustomAttribute = (DTOCustomAttribute) theEObject;
			T result = caseDTOCustomAttribute(dtoCustomAttribute);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ColmenaMLPackage.EXPOSURE_PARAMETERS: {
			ExposureParameters exposureParameters = (ExposureParameters) theEObject;
			T result = caseExposureParameters(exposureParameters);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ColmenaMLPackage.EXPOSURE_RETURN_TYPE: {
			ExposureReturnType exposureReturnType = (ExposureReturnType) theEObject;
			T result = caseExposureReturnType(exposureReturnType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ColmenaMLPackage.CUSTOM_DTO: {
			CustomDTO customDTO = (CustomDTO) theEObject;
			T result = caseCustomDTO(customDTO);
			if (result == null)
				result = caseDTO(customDTO);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ColmenaMLPackage.CLASS_DTO: {
			ClassDTO classDTO = (ClassDTO) theEObject;
			T result = caseClassDTO(classDTO);
			if (result == null)
				result = caseDTO(classDTO);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassDiagram(ClassDiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContract(Contract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contract Exposure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract Exposure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContractExposure(ContractExposure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackage(colmenaML.Package object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassifier(Classifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClass(colmenaML.Class object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterface(Interface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelation(Relation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementation(Implementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperation(Operation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Returnable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Returnable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnable(Returnable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inheritance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inheritance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInheritance(Inheritance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DTO Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DTO Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDTOContainer(DTOContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DTO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DTO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDTO(DTO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DTO Reference Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DTO Reference Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDTOReferenceAttribute(DTOReferenceAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DTO Custom Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DTO Custom Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDTOCustomAttribute(DTOCustomAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exposure Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exposure Parameters</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExposureParameters(ExposureParameters object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exposure Return Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exposure Return Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExposureReturnType(ExposureReturnType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom DTO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom DTO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomDTO(CustomDTO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class DTO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class DTO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassDTO(ClassDTO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ColmenaMLSwitch
