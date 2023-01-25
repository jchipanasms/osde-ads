package base;


import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;

public class BaseMobile {

	public static AndroidDriver<?> driver;
	public static BasePageMobile CurrentPage;
	public static IOSDriver<?> iOSdriver;
	
	
	public static AndroidDriver<?> getDriver() {
		return driver;
	}
	
	public static void setAndroidDriver(AndroidDriver<?> driver) {
		BaseMobile.driver = driver;
	}
	
	public static IOSDriver<?> getIOSDriver() {
		return iOSdriver;
	}
	
	public static void setIOSDriver(IOSDriver<?> iOSdriver) {
		BaseMobile.iOSdriver = iOSdriver;
	}
	
}
