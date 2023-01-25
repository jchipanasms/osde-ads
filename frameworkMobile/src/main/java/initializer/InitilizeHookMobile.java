package initializer;

import config.DataSetterMobile;
import static delivery.EmailSenderMobile.InitializeEmailDeliveryConfiguration;
import static delivery.EmailSenderMobile.exitDelivery;

import helpers.ExcelHelperMobile;
import helpers.XMLHelperMobile;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import log.LogMobile;

import org.openqa.selenium.remote.DesiredCapabilities;

import base.BaseMobile;
import report.ReportConfigurationMobile;

public class InitilizeHookMobile extends BaseMobile {
	
	static AppiumDriverLocalService service;

	public static void StartAppiumService() {
		String ipAppium = DataSetterMobile.configurationMobile.getIpAppium();
		int puertoAppium = DataSetterMobile.configurationMobile.getPortAppium();
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("automationName", "UiAutomator1");

		try {
			AppiumServiceBuilder build = new AppiumServiceBuilder();
			build.withIPAddress(ipAppium);
			build.usingPort(puertoAppium);
			build.withCapabilities(cap);
			service = AppiumDriverLocalService.buildService(build);
			service.start();
		} catch (Exception e) {
			e.printStackTrace();
			LogMobile.info("Fallo el inicio del servicio de appium");
		}
	}

	@SuppressWarnings("rawtypes")
	public static void OpenApplication() {
		String platformName = DataSetterMobile.configurationMobile.getPlatformName();
		String deviceName = DataSetterMobile.configurationMobile.getDeviceName();
		String platformVersion = DataSetterMobile.configurationMobile.getPlatformVersion();
		String ipAppium = DataSetterMobile.configurationMobile.getIpAppium();
		int puertoAppium = DataSetterMobile.configurationMobile.getPortAppium();
		
		try {
			DesiredCapabilities capability = new DesiredCapabilities();
			capability.setCapability("deviceName", deviceName);
			capability.setCapability("platformVersion", platformVersion);
			capability.setCapability("platformName", platformName);
			File file = new File(System.getProperty("user.dir")+DataSetterMobile.configurationMobile.getApkPath());
			capability.setCapability("app",file.getAbsolutePath());
			switch (platformName) {
			case "Android":
				driver = new AndroidDriver(new URL("http://" + ipAppium + ":" + puertoAppium + "/wd/hub"), capability);
				Thread.sleep(15000);
				break;
			case "iOS":
				iOSdriver = new IOSDriver(new URL("http://" + ipAppium + ":" + puertoAppium + "/wd/hub"), capability);
				break;
			default:
				driver = new AndroidDriver(new URL("http://" + ipAppium + ":" + puertoAppium + "/wd/hub"), capability);
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
			LogMobile.info("Fallo el abrir la aplicacion en el dispositivo");
		}
	}

	public static void OpenDelivery() {
		InitializeEmailDeliveryConfiguration();
	}

	public static void OpenReport(String testName) {
		ReportConfigurationMobile.getReportConfig(testName);
	}

	public static void CloseReport() {
		ReportConfigurationMobile.exitReport();
	}

	public static void CloseDelivery() {
		exitDelivery();
	}

	public static void OpenConfiguration() {
		DataSetterMobile.getConfiguration();
	}

	public static void CreateFolder() {
		File imagePath = new File(DataSetterMobile.configurationMobile.getImageRepository());
		if (!imagePath.exists()) {
			imagePath.mkdirs();
		}
	}

	public static void OpenContextData(String testName) throws FileNotFoundException, IOException {
		XMLHelperMobile.leerXml(testName);
		//ExcelHelperMobile.leerExcelCargado(testName);
	}

	public static void CloseConfiguration() {
		DataSetterMobile.dispose();
	}

	public static void CloseContextData(String testName) {
		XMLHelperMobile.guardarXml(testName);
	}

	public static void OpenLogger() {
		LogMobile.intilizedLogger();
	}

	public static void StopAppiumService() {
		service.stop();
	}
	
	public static void CloseDriver() {
		switch (DataSetterMobile.configurationMobile.getPlatformName()) {
		case "Android":
			driver.quit();
			break;
		case "iOS":
			iOSdriver.quit();
			break;
		default:
			driver.quit();
			break;
		}

	}
}
