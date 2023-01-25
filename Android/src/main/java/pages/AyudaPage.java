package pages;


import org.jfree.util.Log;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.BasePageMobile;
import log.LogMobile;

public class AyudaPage extends BasePageMobile {
	
	@FindBy (xpath = "//*[@resource-id='homeAyudaButton']")
	private WebElement BtnAyuda;
	
	@FindBy (xpath = "//*[@resource-id='ext-button-1']")
	private WebElement BtnVolver;
	
	@FindBy (xpath = "//*[@resource-id='vid']")
	private WebElement Video;
	
	@FindBy(xpath = "//*[@class ='android.view.View' and @package='com.osde.ar' and content-desc='Ayuda']")
	private WebElement TituloAyuda;
	
	

	public void clickAyuda() {
		try {
			waitFluent.until(ExpectedConditions.elementToBeClickable(BtnAyuda));
			BtnAyuda.click();
			LogMobile.info("Se hizo click en el Item Ayuda");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Item Ayuda");
			e.printStackTrace();
		}
	}
	
	public void clickVolver() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(BtnVolver));
			BtnVolver.click();
			LogMobile.info("Se hizo click en el botn Volver");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el botn Volver");
			e.printStackTrace();
		}
	}
	
	public  Boolean esVisibleBtnAyuda() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(BtnAyuda));
			esVisible = BtnAyuda.isDisplayed();
			Log.info("Se obtuvo el elemento Botn Ayuda");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Botn Ayuda");
		}
		return esVisible;
	}
			
	public  Boolean esVisibleVideo() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(Video));
			esVisible = Video.isDisplayed();
			Log.info("Se obtuvo el elemento Video");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Video");
		}
		return esVisible;
	}
		
	public  String recuperarTxtAyuda() {
		String texto = null;
		try {
			texto = TituloAyuda.getAttribute("name");
			LogMobile.info("Se recupera texto del elemento");
		} catch (Exception e){
			LogMobile.info("Fallo el recuperar el texto del elemento");
		}
		return texto;
	}

}
