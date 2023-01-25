package base;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.TouchAction;


public class BasePageMobile extends BaseMobile {

	public static WebDriverWait wait;
	public static Actions action;
	public static Select select;
	public static TouchAction actionTouch;
	public static Wait waitFluent;
	
	@SuppressWarnings("unchecked")
	public BasePageMobile() {
		wait = new WebDriverWait(driver, 5);
		waitFluent = new FluentWait(driver)
				.withTimeout(Duration.ofSeconds(420))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);
		action = new Actions(driver);
		actionTouch = new TouchAction(driver);
		
	}

	public <TPage extends BasePageMobile> TPage GetInstance(Class<TPage> page) {
		Object obj = PageFactory.initElements(driver, page);
		return page.cast(obj);
	}

	@SuppressWarnings("unchecked")
	public <TPage extends BasePageMobile> TPage As(Class<TPage> instancia) {
		try {
			return (TPage) this;
		} catch (Exception ex) {
			ex.getStackTrace();
		}
		return null;
	}
	
	
	
}
