package helpers;

import static base.BaseMobile.driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;

import static base.BasePageMobile.wait;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.jfree.util.Log;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedCondition;

import base.BasePageMobile;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

import java.time.Duration;

public class PageHelperMobile {

	private static JavascriptExecutor js = (JavascriptExecutor) driver;
	private static ArrayList<String> tabs;

	public static void ScrollingToElement(WebElement element) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", element);
	}

	public static void ScrollToTheTop() {
		((JavascriptExecutor) driver).executeScript(("window.scrollTo(0,0)"));
	}

	public static void ScrollToTheBottom() {
		((JavascriptExecutor) driver).executeScript(("window.scrollTo(0, document.body.scrollHeight)"));
	}

	public static void ScrollDown() {
		try {
			Dimension dimensions = driver.manage().window().getSize();
			Double screenHeightStart = dimensions.getHeight() * 0.5;
			int scrollStart = screenHeightStart.intValue();
			Double screenHeightEnd = dimensions.getHeight() * 0.2;
			int scrollEnd = screenHeightEnd.intValue();			
			BasePageMobile.actionTouch.press(PointOption.point(0, scrollStart))
			.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
			.moveTo(PointOption.point(0, scrollEnd))
			.release().perform();
			
		} catch (Exception e) {
			Log.info("Fallo al scrollear hasta abajo");
		}
	}

	public static void ScrollToElementMobile(WebElement element) {
		try {
			while(!element.isDisplayed()) {
				ScrollDown();
			}
		}catch (Exception e) {
				Log.info("Fallo al scrollear hasta el elemento");
		}
		
		
	}

	public static void tapScreen(WebElement element, WebElement elementToTap) {
		try {
			while (!elementStillPresent(element)) {
				int x = elementToTap.getLocation().getX();
				int y = elementToTap.getLocation().getY();				
				BasePageMobile.actionTouch.tap(PointOption.point(x, y)).perform();
			}
			Log.info("Se hace clic en la pantalla");
		} catch (Exception e){
			e.printStackTrace();
			Log.info("Fallo al hacer clic en la pantalla");
		}
	}
	
	public static void WaitForPageLoading() throws InterruptedException {
		Boolean r = false;
		int ite = 0;
		while (ite <= 50) {
			r = wait.until(new ExpectedCondition<Boolean>() {
				public Boolean apply(WebDriver driver) {
					return (Boolean) js.executeScript("return document.readyState").toString().equals("complete");
				}
			});
			ite++;
		}
	}

	public static void deleteAllCookies(WebDriver driver) {
		driver.manage().deleteAllCookies();
	}

	public static void deleteCookie(WebDriver driver, Cookie cookie) {
		driver.manage().deleteCookie(cookie);
	}

	public static void addCookies(WebDriver driver, Cookie cookie) {
		driver.manage().addCookie(cookie);
	}

	public static Cookie getCookieByName(WebDriver driver, String cookie) {
		return driver.manage().getCookieNamed(cookie);
	}

	public static Set<Cookie> getCookies(WebDriver driver) {
		return driver.manage().getCookies();
	}

	public static void fullScreenWindows(WebDriver driver) {
		driver.manage().window().fullscreen();
	}

	public static void maximizeWindows(WebDriver driver) {
		driver.manage().window().maximize();
	}

	public static void refreshBrowser(WebDriver driver) {
		driver.navigate().refresh();
	}

	public static void forwardBrowser(WebDriver driver) {
		driver.navigate().forward();
	}

	public static void backBrowser(WebDriver driver) {
		driver.navigate().back();
	}

	public static String getBrowserTitle(WebDriver driver) {
		return driver.getTitle();
	}

	public static String getPageSource(WebDriver driver) {
		return driver.getPageSource();
	}

	public static void switchToFrameByName(WebDriver driver, String frameName) {
		driver.switchTo().frame(frameName);
	}

	public static void switchToFrameByElement(WebDriver driver, WebElement element) {
		driver.switchTo().frame(element);
	}

	public static void switchToFrameByIndex(WebDriver driver, int index) {
		driver.switchTo().frame(index);
	}

	public static void switchToDefaultContent(WebDriver driver) {
		driver.switchTo().defaultContent();
	}

	public static void switchToWindow(WebDriver driver, String windowName) {
		driver.switchTo().window(windowName);
	}

	public static void switchToAlertAccept() {
		driver.switchTo().alert().accept();
	}

	public static String getAlertMessage(WebElement element) {
		return element.getText();
	}

	public static void waitImplicit() throws InterruptedException {
		Thread.sleep(5000);
	}

	public static void deleteLocalStorage() {
		((JavascriptExecutor) driver).executeScript(String.format("window.localStorage.clear();"));
	}

	public static void deleteSessionStorage() {
		((JavascriptExecutor) driver).executeScript(String.format("window.sessionStorage.clear();"));
	}

	public static boolean elementStillPresent(WebElement element) {
		boolean elementIsStillThere = false;
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.MILLISECONDS);
		try {
			elementIsStillThere = element.isDisplayed();
		} catch (Exception e) {
			Log.info("No se encuentra visible el elemento buscado");
		}
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		return elementIsStillThere;
	}

	public static void closeTabs() {
		tabs = new ArrayList<String>(driver.getWindowHandles());
		String tabPrincipal = tabs.get(0);
		tabs.remove(0);
		try {
			while (!tabs.isEmpty()) {
				for (String tab : tabs) {
					driver.switchTo().window(tab);
					driver.close();
					tabs.remove(tab);
				}
			}

		} catch (Exception e) {
			Log.info("Fallo el cerrar todas las ventanas");
		}
		driver.switchTo().window(tabPrincipal);
	}

	public static int countTabs() {
		tabs = new ArrayList<String>(driver.getWindowHandles());
		int cantVentanas = tabs.size();
		return cantVentanas;
	}
}