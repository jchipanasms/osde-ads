package pages;


import org.jfree.util.Log;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.BasePageMobile;
import log.LogMobile;

public class TelefonosPage extends BasePageMobile {

	@FindBy (id = "homeTelefonosButton")
	private WebElement btnTelefonos;

	@FindBy (xpath = "//*[@resource-id='home-call-phones-title']")
	private WebElement TituloTelefono;

	@FindBy (xpath = "//*[@resource-id='home-call-urgencies-title-text']")
	private WebElement TituloTelefonoUrgencias;

	@FindBy (xpath = "//*[@resource-id='home-call-urgencies-button-number']")
	private WebElement TituloTelefonoUrgenciasNro1;

	@FindBy (xpath = "//*[@resource-id='home-call-urgencies-alt-button-number']")
	private WebElement TituloTelefonoUrgenciasNro2;

	@FindBy (xpath = "//*[@resource-id='home-call-life-threatening-title-text']")
	private WebElement TxtTelefonoRiesgoVida;

	@FindBy (xpath = "//*[@resource-id='home-call-life-threatening-button-number']")
	private WebElement TxtTelefonoRiesgoVidaNro;

	@FindBy (xpath = "//*[@resource-id='home-call-caps-title-text']")
	private WebElement TxtTelefonoCentroAtencion;

	@FindBy (xpath = "//*[@resource-id='home-call-caps-button-number']")
	private WebElement TxtTelefonoCentroAtencionNro;
	
//	@FindBy (xpath = "//*[@resource-id='homeCallUrgenciesWAButton']/Text")
	@FindBy (xpath = "//*[@resource-id='home-call-urgencies-wa-button-number']")
	private WebElement TxtTelefonoUrgenciaWapp;
	
	@FindBy (xpath = "//*[@resource-id='home-call-cads-title-text']")
	private WebElement TxtTelefonoCentroDigital;
	
	@FindBy (xpath = "//*[@resource-id='home-call-cads-button-number']")
	private WebElement TxtTelefonoCentroDigitalNro;	
	
	@FindBy (xpath = "//*[@resource-id='ext-button-1']")
	private WebElement BtnVolver;
	
	
	public void clickTelefonos() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnTelefonos));
			btnTelefonos.click();
			LogMobile.info("Se hizo click en el Item Telefonos");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Item Telefonos");
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
	
			
	public  Boolean esVisibleTituloTelefono() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(TituloTelefono));
			esVisible = TituloTelefono.isDisplayed();
			Log.info("Se obtuvo el elemento Telfonos");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Telfonos");
		}
		return esVisible;
	}
	
	public  Boolean esVisibleTelefonoWapp() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(TxtTelefonoUrgenciaWapp));
			esVisible = TxtTelefonoUrgenciaWapp.isDisplayed();
			Log.info("Se obtuvo el elemento Telfonos");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Telfonos");
		}
		return esVisible;
	}
	
	
	public  String recuperarTxtTelefono() {
		String texto = null;
		try {
			texto = TituloTelefono.getAttribute("name");
			LogMobile.info("Se recupera texto del elemento");
		} catch (Exception e){
			LogMobile.info("Fallo el recuperar el texto del elemento");
		}
		return texto;
	}
	
	public  String recuperarTxtTelefonoUrgencias() {
		String texto = null;
		try {
			texto = TituloTelefonoUrgencias.getAttribute("name");
			LogMobile.info("Se recupera texto del elemento Urgencias");
		} catch (Exception e){
			LogMobile.info("Fallo el recuperar el texto del elemento");
		}
		return texto;
	}
	
	public  String recuperarTxtTelefonoUrgenciasNro1() {
		String texto = null;
		try {
			texto = TituloTelefonoUrgenciasNro1.getAttribute("name");
			LogMobile.info("Se recupera texto del elemento");
		} catch (Exception e){
			LogMobile.info("Fallo el recuperar el texto del elemento");
		}
		return texto;
	}
	
	public  String recuperarTxtTelefonoUrgenciasNro2() {
		String texto = null;
		try {
			texto = TituloTelefonoUrgenciasNro2.getAttribute("name");
			LogMobile.info("Se recupera texto del elemento");
		} catch (Exception e){
			LogMobile.info("Fallo el recuperar el texto del elemento");
		}
		return texto;
	}
	

	public  String recuperarTxtTelefonoRiesgoVida() {
		String texto = null;
		try {
			texto = TxtTelefonoRiesgoVida.getAttribute("name");
			LogMobile.info("Se recupera texto del elemento");
		} catch (Exception e){
			LogMobile.info("Fallo el recuperar el texto del elemento");
		}
		return texto;
	}
	
	public  String recuperarTxtTelefonoRiesgoVidaNro() {
		String texto = null;
		try {
			texto = TxtTelefonoRiesgoVidaNro.getAttribute("name");
			LogMobile.info("Se recupera texto del elemento");
		} catch (Exception e){
			LogMobile.info("Fallo el recuperar el texto del elemento");
		}
		return texto;
	}
	
	public  String recuperarTxtTelefonoCentroAtencion() {
		String texto = null;
		try {
			texto = TxtTelefonoCentroAtencion.getAttribute("name");
			LogMobile.info("Se recupera texto del elemento");
		} catch (Exception e){
			LogMobile.info("Fallo el recuperar el texto del elemento");
		}
		return texto;
	}
	
	public  String recuperarTxtTelefonoCentroAtencionNro() {
		String texto = null;
		try {
			texto = TxtTelefonoCentroAtencionNro.getAttribute("name");
			LogMobile.info("Se recupera texto del elemento");
		} catch (Exception e){
			LogMobile.info("Fallo el recuperar el texto del elemento");
		}
		return texto;
	}
	
	public  String recuperarTxtTelefonoUrgenciaWapp() {
		String texto = null;
		try {
			texto = TxtTelefonoUrgenciaWapp.getAttribute("name");
			LogMobile.info("Se recupera texto del elemento");
		} catch (Exception e){
			LogMobile.info("Fallo el recuperar el texto del elemento");
		}
		return texto;
	}
	
	public  String recuperarTxtTelefonoCentroDigital() {
		String texto = null;
		try {
			texto = TxtTelefonoCentroDigital.getAttribute("name");
			LogMobile.info("Se recupera texto del elemento");
		} catch (Exception e){
			LogMobile.info("Fallo el recuperar el texto del elemento");
		}
		return texto;
	}
	
	public  String recuperarTxtTelefonoCentroDigitalNro() {
		String texto = null;
		try {
			texto = TxtTelefonoCentroDigitalNro.getAttribute("name");
			LogMobile.info("Se recupera texto del elemento");
		} catch (Exception e){
			LogMobile.info("Fallo el recuperar el texto del elemento");
		}
		return texto;
	}
	
}

