package base;

import java.util.ArrayList;

import org.jfree.util.Log;
import org.openqa.selenium.JavascriptExecutor;

import helpers.PageHelperMobile;

public class BaseStepMobile extends BaseMobile {

	private static ArrayList<String> tabs;

//	public static void NavigateToSite(String urlsite) {
//		driver.navigate().to(urlsite);
//	}
//
//	public static void openNewTab(String newPage) {
//		((JavascriptExecutor) driver).executeScript("window.open('about:blank', '_blank');");
//		tabs = new ArrayList<String>(driver.getWindowHandles());
//		driver.switchTo().window(tabs.get(tabs.size() - 1));
//		NavigateToSite(newPage);
//	}
//
//	public static void switchToTab(String url) {
//		tabs = new ArrayList<String>(driver.getWindowHandles());
//		try {
//			for (String tab : tabs) {
//				driver.switchTo().window(tab);
//				PageHelperMobile.WaitForPageLoading();
//				String currentUrl = driver.getCurrentUrl();
//				if (currentUrl.contains(url)) {
//					LogMobile.info("Se cambia el foco a la ventana correspondiente");
//					break;
//				}
//			}
//		} catch (Exception e) {
//			LogMobile.info("Falla cambiar el foco de la ventana");
//		}
//
//	}

}
