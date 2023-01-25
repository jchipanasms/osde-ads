package pages;


import org.jfree.util.Log;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.BasePageMobile;
import log.LogMobile;

public class PantallaInicioPage extends BasePageMobile {

	
	@FindBy (id = "homeGestionesOnlineButton")
	private WebElement btnGestionesOnLine;
	
	@FindBy (id = "homeCartillaButton")
	private WebElement BtnCartillaMedica;
		
	@FindBy (id = "homeTelefonosButton")
	private WebElement BtnTelefonos;
		
	@FindBy (id = "homeCAPsButton")
	private WebElement BtnCentrosAtencion;
		
	@FindBy (id = "homeAyudaButton")
	private WebElement BtnAyuda;
	
	@FindBy (id = "ext-element-121")
	private WebElement NombreLogueo;
	
	@FindBy (id = "homeNavMenuButtonCloseSession")
	private WebElement BtnCerrarSesion;
	
	@FindBy (id = "ext-button-3")
	private WebElement BtnAceptarCerrarSesion;

	@FindBy (xpath = "//android.webkit.WebView[@text='OSDE-TAS']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']")
	private WebElement PopUpTiempo;
	
//	@FindBy (id = "ext-button-1")
//	@FindBy(xpath = "//*[@class ='android.view.View' and @package='com.osde.ar' and @resource-id='ext-button-1']")
//	@FindBy (xpath = "//*[@resource-id='ext-element-40']")
	@FindBy (xpath = "//android.webkit.WebView[@text='OSDE-TAS']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='1']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0'"
			+ "/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='1']/android.view.View[@index='0']/android.view.View[@index='2']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']]")
	
	private WebElement BtnVolver;
	
	@FindBy (id = "ext-titlebar-1")
	private WebElement LogoOSDE;
	
	@FindBy (id = "ext-element-121")
	private WebElement Panio;
	
	@FindBy (id = "empadronamientosButton")
	private WebElement btnEmpadronamiento;
	
	public void clickGestionesOnLine() {
		try {
			
			wait.until(ExpectedConditions.elementToBeClickable(btnGestionesOnLine));
			btnGestionesOnLine.click();
			//action.click(btnGestionesOnLine);
			LogMobile.info("Se hizo click en el Bot�n Gestiones On Line");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Bot�n Gestiones On Line");
			e.printStackTrace();
		}
		
	}
	
	public  Boolean esVisibleBtnGestionesOnLine() {
		Boolean esVisible = false;
		try {
		//	action.click(btnGestionesOnLine);
			wait.until(ExpectedConditions.visibilityOf(btnGestionesOnLine));
			esVisible = btnGestionesOnLine.isDisplayed();
			Log.info("Se obtuvo el elemento bot�n de Gestiones On Line");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento bot�n de Gestiones On Line");
		}
		return esVisible;
	}
	
	public  Boolean esVisibleBtnCartillaMedica() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(BtnCartillaMedica));
			esVisible = BtnCartillaMedica.isDisplayed();
			Log.info("Se obtuvo el elemento bot�n de Cartilla M�dica");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento bot�n de Cartilla M�dica");
		}
		return esVisible;
	}
	
	public  Boolean esVisibleBtnTelefonos() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(BtnTelefonos));
			esVisible = BtnTelefonos.isDisplayed();
			Log.info("Se obtuvo el elemento bot�n Tel�fonos");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento bot�n Tel�fonos");
		}
		return esVisible;
	}

	public  Boolean esVisibleBtnCentrosAtencion() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(BtnCentrosAtencion));
			esVisible = BtnCentrosAtencion.isDisplayed();
			Log.info("Se obtuvo el elemento bot�n Centros de Atenci�n Personalizada");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento bot�n Centros de Atenci�n Personalizada");
		}
		return esVisible;
	}		
	
	public  Boolean esVisibleBtnAyuda() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(BtnAyuda));
			esVisible = BtnAyuda.isDisplayed();
			Log.info("Se obtuvo el elemento bot�n Ayuda");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento bot�n Ayuda");
		}
		return esVisible;
	}	
	
	public  Boolean esVisibleNombreLogueo() {
		Boolean esVisible = false;
		try {
			waitFluent.until(ExpectedConditions.visibilityOf(NombreLogueo));
			esVisible = NombreLogueo.isDisplayed();
			Log.info("Se obtuvo el elemento nombre de Logueo");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento NombreLogueo");
		}
		return esVisible;
	}
	

	public void clickBtnCerrarSesion() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(BtnCerrarSesion));
			BtnCerrarSesion.click();
			LogMobile.info("Se hizo click en el Bot�n de Cerrar Sesion");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Bot�n de Cerrar Sesion");
			e.printStackTrace();
		}
	}
	
	public  Boolean esVisibleBtnCerrarSesion() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(BtnCerrarSesion));
			esVisible = BtnCerrarSesion.isDisplayed();
			Log.info("Se obtuvo el elemento Nro de Socio, segundo elemento");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Nro de Socio, segundo elemento");
		}
		return esVisible;
	}
	
	public void clickBtnAceptarCerrarSesion() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(BtnAceptarCerrarSesion));
			BtnAceptarCerrarSesion.click();
			LogMobile.info("Se hizo click en el Bot�n de Cerrar Sesion");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Bot�n de Cerrar Sesion");
			e.printStackTrace();
		}
	}
	
	public void clickPopUpTiempo() {
		try {
			waitFluent.until(ExpectedConditions.elementToBeClickable(PopUpTiempo));
			PopUpTiempo.click();
			LogMobile.info("Se hizo click en el Bot�n Generar Credencial");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Bot�n Generar Credencial");
			e.printStackTrace();
		}
	}
	
	public  Boolean esVisiblePopUpTiempo() {
		Boolean esVisible = false;
		try {
			waitFluent.until(ExpectedConditions.visibilityOf(PopUpTiempo));
			esVisible = PopUpTiempo.isDisplayed();
			Log.info("Se obtuvo el elemento bot�n Generar Credencial");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento bot�n Generar Credencial");
		}
		return esVisible;
	}

	public  Boolean esVisibleBtnVolver() {
		Boolean esVisible = false;
		try {
			waitFluent.until(ExpectedConditions.visibilityOf(BtnVolver));
			esVisible = BtnVolver.isDisplayed();
			Log.info("Se obtuvo el elemento Detalle del prestador");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Detalle del prestador");
		}
		return esVisible;
	}	
	
	public void clickBtnVolver() {
		try {
			waitFluent.until(ExpectedConditions.elementToBeClickable(BtnVolver));
			BtnVolver.click();
			LogMobile.info("Se hizo click en el Bot�n Volver");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Bot�n Volver");
			e.printStackTrace();
		}
	}
	
	public  Boolean esVisibleLogoOSDE() {
		Boolean esVisible = false;
		try {
			waitFluent.until(ExpectedConditions.visibilityOf(LogoOSDE));
			esVisible = LogoOSDE.isDisplayed();
			Log.info("Se obtuvo el elemento Logo de OSDE");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Logo de OSDE");
		}
		return esVisible;
	}	
	
	public void clickPanio() {
		try {
			waitFluent.until(ExpectedConditions.elementToBeClickable(Panio));
			Panio.click();
			LogMobile.info("Se hizo click en el Pa�o");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Pa�o");
			e.printStackTrace();
		}
	}
	public  Boolean esVisibleBtnEmpadronamiento() {
		Boolean esVisible = false;
		try {
			waitFluent.until(ExpectedConditions.visibilityOf(btnEmpadronamiento));
			esVisible = btnEmpadronamiento.isDisplayed();
			Log.info("Se obtuvo el elemento bot�n de Reintegros");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento bot�n de Reintegros");
		}
		return esVisible;
	}
}
