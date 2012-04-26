/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.rest.tests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.equalTo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import de.van_porten.vrest.core.model.rest.RestApplicationModel;
import de.van_porten.vrest.core.model.rest.RestFactory;
import de.van_porten.vrest.core.model.rest.RestPackage;
import de.van_porten.vrest.core.model.restbehavior.OpType;
import de.van_porten.vrest.core.model.restbehavior.RestBehaviorFactory;
import de.van_porten.vrest.core.model.reststructure.DataType;
import de.van_porten.vrest.core.model.reststructure.PrimitiveDataType;
import de.van_porten.vrest.core.model.reststructure.RestStructureFactory;
import de.van_porten.vrest.core.model.reststructure.RestStructurePackage;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Application Model</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RestApplicationModelTest extends TestCase {

	/**
	 * The fixture for this Application Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RestApplicationModel fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RestApplicationModelTest.class);
	}

	/**
	 * Constructs a new Application Model test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestApplicationModelTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Application Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(RestApplicationModel fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Application Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RestApplicationModel getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RestFactory.eINSTANCE.createRestApplicationModel());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	public void testApplicationModelBasics() {
		ResourceSet resourceSet = new ResourceSetImpl();

		// Register the appropriate resource factory to handle all file extensions.
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put
			(Resource.Factory.Registry.DEFAULT_EXTENSION,
			 new XMIResourceFactoryImpl());

		// Register the package to ensure it is available during loading.
		resourceSet.getPackageRegistry().put
			(RestPackage.eNS_URI,
			 RestPackage.eINSTANCE);

		File resourceFile = null;
		try {
			resourceFile = File.createTempFile("testApplicationModelBasics", null);
		} catch (IOException e) {
			fail(e.getMessage());
		}

		if( resourceFile != null ) {
			try {
				Resource resource = resourceSet.createResource(URI.createURI("http:///My.rest"));
				assert(resource != null);
				RestApplicationModel root = RestFactory.eINSTANCE.createRestApplicationModel();
				assert(root != null);
				boolean rv = resource.getContents().add(root);
				assertThat(rv, is(true));

				FileOutputStream fos = null;
				fos = new FileOutputStream(resourceFile);
				resource.save(fos, null);
				fos.close();

			} catch (FileNotFoundException e) {
				fail(e.getMessage());
			} catch (IOException e) {
				fail(e.getMessage());
			}

			URI uri = URI.createFileURI(resourceFile.getAbsolutePath());

			try {
				// Demand load resource for this file.
				Resource resource = resourceSet.getResource(uri, true);

				// Validate the contents of the loaded resource.
				for (EObject eObject : resource.getContents()) {
					Diagnostic diagnostic = Diagnostician.INSTANCE.validate(eObject);
					assertThat(diagnostic.getSeverity(), is(equalTo(Diagnostic.OK)));
				}
			} catch (RuntimeException e) {
				fail(e.getMessage());
			}
		}
	}

	public void testAddOpTypeToApplicationModel() {
		RestApplicationModel appModel = RestFactory.eINSTANCE.createRestApplicationModel();

		OpType opType = RestBehaviorFactory.eINSTANCE.createBinOpType();
		appModel.getOptypes().add(opType);
		assertThat(appModel, is(equalTo(opType.eContainer())));
	}

	public void testAddDataTypeToApplicationModel() {
		RestApplicationModel appModel = RestFactory.eINSTANCE.createRestApplicationModel();

		DataType dataType = RestStructureFactory.eINSTANCE.createPrimitiveDataType();
		dataType.eSet(RestStructurePackage.eINSTANCE.getPrimitiveDataType_Name(), "newType");
		PrimitiveDataType primitiveDataType = (PrimitiveDataType) dataType;
		assertThat(primitiveDataType.getName(), is(equalTo("newType")));
		appModel.getDataTypes().add(primitiveDataType );
		assertThat(appModel, is(equalTo(dataType.eContainer())));
	}

} //RestApplicationModelTest
