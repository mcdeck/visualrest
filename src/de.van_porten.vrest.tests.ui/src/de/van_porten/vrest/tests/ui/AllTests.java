package de.van_porten.vrest.tests.ui;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	BasicRcpUiTests.class,
	ProjectInterfaceTests.class,
	StructureEditorTests.class })
public class AllTests {

}
