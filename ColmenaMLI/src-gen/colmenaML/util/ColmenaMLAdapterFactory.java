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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see colmenaML.ColmenaMLPackage
 * @generated
 */
public class ColmenaMLAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ColmenaMLPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColmenaMLAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ColmenaMLPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColmenaMLSwitch<Adapter> modelSwitch = new ColmenaMLSwitch<Adapter>() {
		@Override
		public Adapter caseClassDiagram(ClassDiagram object) {
			return createClassDiagramAdapter();
		}

		@Override
		public Adapter caseContract(Contract object) {
			return createContractAdapter();
		}

		@Override
		public Adapter caseContractExposure(ContractExposure object) {
			return createContractExposureAdapter();
		}

		@Override
		public Adapter casePackage(colmenaML.Package object) {
			return createPackageAdapter();
		}

		@Override
		public Adapter caseClassifier(Classifier object) {
			return createClassifierAdapter();
		}

		@Override
		public Adapter caseClass(colmenaML.Class object) {
			return createClassAdapter();
		}

		@Override
		public Adapter caseInterface(Interface object) {
			return createInterfaceAdapter();
		}

		@Override
		public Adapter caseRelation(Relation object) {
			return createRelationAdapter();
		}

		@Override
		public Adapter caseImplementation(Implementation object) {
			return createImplementationAdapter();
		}

		@Override
		public Adapter caseAttribute(Attribute object) {
			return createAttributeAdapter();
		}

		@Override
		public Adapter caseOperation(Operation object) {
			return createOperationAdapter();
		}

		@Override
		public Adapter caseReturnable(Returnable object) {
			return createReturnableAdapter();
		}

		@Override
		public Adapter caseInheritance(Inheritance object) {
			return createInheritanceAdapter();
		}

		@Override
		public Adapter caseDTOContainer(DTOContainer object) {
			return createDTOContainerAdapter();
		}

		@Override
		public Adapter caseDTO(DTO object) {
			return createDTOAdapter();
		}

		@Override
		public Adapter caseDTOReferenceAttribute(DTOReferenceAttribute object) {
			return createDTOReferenceAttributeAdapter();
		}

		@Override
		public Adapter caseDTOCustomAttribute(DTOCustomAttribute object) {
			return createDTOCustomAttributeAdapter();
		}

		@Override
		public Adapter caseExposureParameters(ExposureParameters object) {
			return createExposureParametersAdapter();
		}

		@Override
		public Adapter caseExposureReturnType(ExposureReturnType object) {
			return createExposureReturnTypeAdapter();
		}

		@Override
		public Adapter caseCustomDTO(CustomDTO object) {
			return createCustomDTOAdapter();
		}

		@Override
		public Adapter caseClassDTO(ClassDTO object) {
			return createClassDTOAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link colmenaML.ClassDiagram <em>Class Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see colmenaML.ClassDiagram
	 * @generated
	 */
	public Adapter createClassDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link colmenaML.Contract <em>Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see colmenaML.Contract
	 * @generated
	 */
	public Adapter createContractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link colmenaML.ContractExposure <em>Contract Exposure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see colmenaML.ContractExposure
	 * @generated
	 */
	public Adapter createContractExposureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link colmenaML.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see colmenaML.Package
	 * @generated
	 */
	public Adapter createPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link colmenaML.Classifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see colmenaML.Classifier
	 * @generated
	 */
	public Adapter createClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link colmenaML.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see colmenaML.Class
	 * @generated
	 */
	public Adapter createClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link colmenaML.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see colmenaML.Interface
	 * @generated
	 */
	public Adapter createInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link colmenaML.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see colmenaML.Relation
	 * @generated
	 */
	public Adapter createRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link colmenaML.Implementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see colmenaML.Implementation
	 * @generated
	 */
	public Adapter createImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link colmenaML.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see colmenaML.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link colmenaML.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see colmenaML.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link colmenaML.Returnable <em>Returnable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see colmenaML.Returnable
	 * @generated
	 */
	public Adapter createReturnableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link colmenaML.Inheritance <em>Inheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see colmenaML.Inheritance
	 * @generated
	 */
	public Adapter createInheritanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link colmenaML.DTOContainer <em>DTO Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see colmenaML.DTOContainer
	 * @generated
	 */
	public Adapter createDTOContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link colmenaML.DTO <em>DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see colmenaML.DTO
	 * @generated
	 */
	public Adapter createDTOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link colmenaML.DTOReferenceAttribute <em>DTO Reference Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see colmenaML.DTOReferenceAttribute
	 * @generated
	 */
	public Adapter createDTOReferenceAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link colmenaML.DTOCustomAttribute <em>DTO Custom Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see colmenaML.DTOCustomAttribute
	 * @generated
	 */
	public Adapter createDTOCustomAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link colmenaML.ExposureParameters <em>Exposure Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see colmenaML.ExposureParameters
	 * @generated
	 */
	public Adapter createExposureParametersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link colmenaML.ExposureReturnType <em>Exposure Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see colmenaML.ExposureReturnType
	 * @generated
	 */
	public Adapter createExposureReturnTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link colmenaML.CustomDTO <em>Custom DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see colmenaML.CustomDTO
	 * @generated
	 */
	public Adapter createCustomDTOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link colmenaML.ClassDTO <em>Class DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see colmenaML.ClassDTO
	 * @generated
	 */
	public Adapter createClassDTOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ColmenaMLAdapterFactory
