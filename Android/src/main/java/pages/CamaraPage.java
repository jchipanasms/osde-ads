package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.BasePageMobile;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import static java.time.Duration.ofMillis;
import io.appium.java_client.touch.offset.PointOption;
import log.LogMobile;

public class CamaraPage extends BasePageMobile {
	
	@FindBy (id = "com.android.packageinstaller:id/permission_allow_button")
	private WebElement btn_otorgar_permiso;
	
	@FindBy (xpath = "//*[@resource-id='com.jack.mainactivity:id/btn_takepicture']")
	private WebElement btn_tomar_captura;
	
	@FindBy (xpath = "//*[@resource-id='com.jack.mainactivity:id/btn_cancelar']")
	private WebElement btn_cancelar_captura;
	
	@FindBy (xpath = "//*[@resource-id='com.jack.mainactivity:id/btn_aceptar']")
	private WebElement btn_aceptar_captura;
	
	
	public void click_otorgar_permiso_camara() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btn_otorgar_permiso));
			btn_otorgar_permiso.click();
			LogMobile.info("Se hizo click en el permiso");
		} catch (Exception e) {
			LogMobile.info("Se hizo click en el permiso");
			e.printStackTrace();
		}
	}
	
	public Boolean esVisibleBtnTomarCaptura() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btn_tomar_captura));
			esVisible = btn_tomar_captura.isDisplayed();
			LogMobile.info("Se pudo verificar que se encuentra el boton capturar");
		} catch (Exception e) {
			LogMobile.info("Fallo al obtener el boton de capturar");
		}
		return esVisible;
	}
	
	public void click_tomar_captura() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btn_tomar_captura));
			btn_tomar_captura.click();
			LogMobile.info("Se hizo click en tomar captura");
		} catch (Exception e) {
			LogMobile.info("Se hizo click en tomar captura");
			e.printStackTrace();
		}
	}
	
	public void click_cancelar_captura() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btn_cancelar_captura));
			btn_cancelar_captura.click();
			LogMobile.info("Se hizo click en cancelar captura");
		} catch (Exception e) {
			LogMobile.info("Se hizo click en cancelar captura");
			e.printStackTrace();
		}
	}
	
	public void click_confirmar_captura() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btn_aceptar_captura));
			btn_aceptar_captura.click();
			LogMobile.info("Se hizo click en confirmar captura");
		} catch (Exception e) {
			LogMobile.info("Se hizo click en confirmar captura");
			e.printStackTrace();
		}
	}

}
