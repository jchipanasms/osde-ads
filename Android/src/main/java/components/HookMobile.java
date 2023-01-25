package components;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import helpers.StepHelperMobile;
import helpers.XMLHelperMobile;
import initializer.InitilizeHookMobile;

public class HookMobile extends InitilizeHookMobile {
	
	 String testName;
    
    
	public HookMobile() {
	}
	
	@BeforeTest(alwaysRun = true) 
	public static void setUpClass() {
		OpenConfiguration();
		OpenLogger();
		//OpenDelivery();
		OpenReport("Reporte.pdf");
		CreateFolder();
		StartAppiumService();
		OpenApplication();

	}
	
	@BeforeMethod
	public void setUp(Method method) throws FileNotFoundException, IOException {
		testName = method.getName();
		OpenContextData(testName);

	}
	
	@AfterMethod 
	public void stepFail(ITestResult testResult) { 
		if (testResult.getStatus() == ITestResult.FAILURE) { 
			String pathImgScreen = StepHelperMobile.takeScreenShot("FALLA_" + testName);
			XMLHelperMobile.object.setImgFalla(pathImgScreen);
		} 
	}
	
	@AfterMethod
	public void tearDown(Method method) {
		CloseContextData(testName);
	}

	@AfterTest
	public static void tearDownClass() {
		CloseDriver();
		StopAppiumService();
		CloseReport();
		//CloseDelivery();
		CloseConfiguration();
	}	

}
