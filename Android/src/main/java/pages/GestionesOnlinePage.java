package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.BasePageMobile;
import log.LogMobile;

public class GestionesOnlinePage extends BasePageMobile {
	
	@FindBy (xpath = "//*[@resource-id='btn-back']")
	private WebElement btn_volver;
	
	@FindBy (xpath = "//*[@text='Back']")
	private WebElement btn_volver_desde_tramites;
	
	@FindBy (xpath = "//android.view.View[@text='Back']")
	private WebElement boton_volver_desde_tramites;
	
	@FindBy (xpath = "//*[@resource-id='btn-logout']")
	private WebElement btn_deslogueo;
	
	@FindBy (xpath = "//*[@resource-id='homeNavMenuButtonCloseSession']")
	private WebElement btn_deslogueo_listado_tramites;
	
	@FindBy (xpath = "//*[@text='Aceptar']")
	private WebElement btn_deslogueo_aceptar;
	
	@FindBy (xpath = "//*[@text='Cancelar']")
	private WebElement btn_deslogueo_cancelar;
	
	@FindBy (xpath = "//*[@resource-id='nombre-user']")
	private WebElement label_nombre_socio;
	
	@FindBy (xpath = "//*[@resource-id='userActiveLabel']/android.view.View/android.view.View")
	private WebElement nombre_socio_lista_tramites;
	
	@FindBy (xpath = "//*[@resource-id='reintegrosButton']")
	private WebElement btn_reintegros;
	
	@FindBy (xpath = "//*[@resource-id='empadronamientosButton']")
	private WebElement btn_empadronamientos;
	
	@FindBy (xpath = "//*[@resource-id='autorizacionesButton']")
	private WebElement BtnAutorizaciones;
	
	@FindBy (xpath = "//*[@resource-id='misTurnosButton']")
	private WebElement btn_turnos;
	
	@FindBy (xpath = "//*[@resource-id='datosContactoButton']")
	private WebElement btn_datos_contacto;
	
	@FindBy (xpath = "//*[@resource-id='facturacionButton']")
	private WebElement btn_facturacion;
	
	@FindBy (xpath = "//*[@resource-id='credencialProvisoriaButton']")
	private WebElement btn_credencial;
	
	//popup timeout luego de 30seg
	@FindBy (xpath = "//android.webkit.WebView[@text='OSDE-TAS']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']")
	private WebElement titulo_advertencia_timeout;
	
	
	public Boolean verificarTimeout() {
		Boolean verifica = false;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(titulo_advertencia_timeout));
			verifica = titulo_advertencia_timeout.getText().equals("Advertencia!");
			LogMobile.info("Se pudo comprobar el popup timeout de los 30seg");
		} catch (Exception e) {
			LogMobile.info("Fallo al comprobar el popup timeout de los 30seg");
		}
		return verifica;
	}
	
	public void clickTimeOut() {
		try {
			titulo_advertencia_timeout.click();
			LogMobile.info("Se pudo hacer click en el mensaje de advertencia");
		} catch (Exception e) {
			LogMobile.info("Fallo al hacer click en el mensaje de advertencia");
		}
	}
	
	public Boolean esVisibleNombreSocio(String nombre) {
		boolean estado = false;
		try {
			waitFluent.until(ExpectedConditions.elementToBeClickable(label_nombre_socio));
			estado = label_nombre_socio.getText().equalsIgnoreCase("Hola " + nombre);
			LogMobile.info("Se verifica el nombre del usuario");
		} catch (Exception e) {
			LogMobile.info("Falla al verificar el nombre del usuario");
			e.printStackTrace();
		}
		return estado;
	}
	
	public Boolean esVisibleNombreSocioListaTramites(String nombre) {
		boolean estado = false;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(nombre_socio_lista_tramites));
			estado = nombre_socio_lista_tramites.getText().equalsIgnoreCase("Hola " + nombre);
			LogMobile.info("Se verifica el nombre del usuario");
		} catch (Exception e) {
			LogMobile.info("Falla al verificar el nombre del usuario");
			e.printStackTrace();
		}
		return estado;
	}
	
	public Boolean esVisibleBtnVolver() {
		boolean estado = false;
		try {
			waitFluent.until(ExpectedConditions.elementToBeClickable(btn_volver));
			estado = btn_volver.isDisplayed();
			LogMobile.info("Se verifica el boton");
		} catch (Exception e) {
			LogMobile.info("Falla al verificar el boton");
			e.printStackTrace();
		}
		return estado;
	}
	
	public Boolean esVisibleBtnVolverListaTramites() {
		boolean estado = false;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btn_volver_desde_tramites));
			estado = btn_volver_desde_tramites.isDisplayed();
			LogMobile.info("Se verifica el boton");
		} catch (Exception e) {
			LogMobile.info("Falla al verificar el boton");
			e.printStackTrace();
		}
		return estado;
	}
	
	public Boolean esVisibleBtnDeslogueo() {
		boolean estado = false;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btn_deslogueo));
			estado = btn_deslogueo.isDisplayed();
			LogMobile.info("Se verifica el boton");
		} catch (Exception e) {
			LogMobile.info("Falla al verificar el boton");
			e.printStackTrace();
		}
		return estado;
	}
	
	public Boolean esVisibleBtnDeslogueoListaTramites() {
		boolean estado = false;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btn_deslogueo_listado_tramites));
			estado = btn_deslogueo_listado_tramites.isDisplayed();
			LogMobile.info("Se verifica el boton");
		} catch (Exception e) {
			LogMobile.info("Falla al verificar el boton");
			e.printStackTrace();
		}
		return estado;
	}
	
	public void click_deslogueo() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btn_deslogueo));
			btn_deslogueo.click();
			LogMobile.info("Se hace clic al desloguear al usuario");
		} catch (Exception e) {
			LogMobile.info("Falla al hacer clic al desloguear al usuario");
			e.printStackTrace();
		}
	}
	
	public void aceptar_deslogueo() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btn_deslogueo_aceptar));
			btn_deslogueo_aceptar.click();
			LogMobile.info("Se desloguea al usuario");
		} catch (Exception e) {
			LogMobile.info("Falla al desloguear al usuario");
			e.printStackTrace();
		}
	}
	
	public void cancelar_deslogueo() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btn_deslogueo_cancelar));
			btn_deslogueo_cancelar.click();
			LogMobile.info("Se cancela el deslogueo al usuario");
		} catch (Exception e) {
			LogMobile.info("Falla al cancelar el deslogueo al usuario");
			e.printStackTrace();
		}
	}
	
	public void volver() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btn_volver));
			btn_volver.click();
			LogMobile.info("Se vuelve a la pagina anterior");
		} catch (Exception e) {
			LogMobile.info("Falla al encontrar el elemento para volver");
			e.printStackTrace();
		}
	}
	
	public void clic_btn_volver_tramites() {
		try {
			wait.until(ExpectedConditions.visibilityOf(boton_volver_desde_tramites));
			boton_volver_desde_tramites.click();
			LogMobile.info("Se obtiene el elemento");
		} catch (Exception e) {
			LogMobile.info("Fallo el encontrar el elemento");
		}
	}
	public Boolean esVisibleBtnVolver_tramites() {
		boolean estado = false;
		try {
			waitFluent.until(ExpectedConditions.elementToBeClickable(boton_volver_desde_tramites));
			estado = boton_volver_desde_tramites.isDisplayed();
			LogMobile.info("Se verifica el boton");
		} catch (Exception e) {
			LogMobile.info("Falla al verificar el boton");
			e.printStackTrace();
		}
		return estado;
	}
	
	public void clickModulo(String modulo) {
		try {
			switch (modulo) {
			case "reintegros":
				waitFluent.until(ExpectedConditions.elementToBeClickable(btn_reintegros));
					btn_reintegros.click();									
				LogMobile.info("Se hizo click en el Bot贸n "+modulo);
				break;
			case "empadronamiento":
				waitFluent.until(ExpectedConditions.elementToBeClickable(btn_empadronamientos));
				btn_empadronamientos.click();
				LogMobile.info("Se hizo click en el Bot贸n "+modulo);
				break;
			case "autorizaciones":
				waitFluent.until(ExpectedConditions.elementToBeClickable(BtnAutorizaciones));
				BtnAutorizaciones.click();
				LogMobile.info("Se hizo click en el Bot贸n "+modulo);
				break;
			case "turnos":
				waitFluent.until(ExpectedConditions.elementToBeClickable(btn_turnos));
				btn_turnos.click();
				LogMobile.info("Se hizo click en el Bot贸n "+modulo);
				break;
			case "datos_contacto":
				waitFluent.until(ExpectedConditions.elementToBeClickable(btn_datos_contacto));
				btn_datos_contacto.click();
				LogMobile.info("Se hizo click en el Bot贸n "+modulo);
				break;
			case "facturacion":
				waitFluent.until(ExpectedConditions.elementToBeClickable(btn_facturacion));
				btn_facturacion.click();
				LogMobile.info("Se hizo click en el Bot贸n "+modulo);
				break;
			case "credenciales":
				waitFluent.until(ExpectedConditions.elementToBeClickable(btn_credencial));
				btn_credencial.click();
				LogMobile.info("Se hizo click en el Bot贸n "+modulo);
				break;
			default:
				LogMobile.info("No existe el boton "+modulo);
				break;
			}
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Bot贸n "+modulo);
			e.printStackTrace();
		}
	}
	
	public Boolean esVisibleModulo(String modulo) {
		Boolean esVisible = false;
		try {
			switch (modulo) {
			case "reintegros":
				wait.until(ExpectedConditions.elementToBeClickable(btn_reintegros));
				esVisible = btn_reintegros.isDisplayed();									
				LogMobile.info("Es visible el bot贸n "+modulo);
				break;
			case "empadronamiento":
				wait.until(ExpectedConditions.elementToBeClickable(btn_empadronamientos));
				esVisible = btn_empadronamientos.isDisplayed();									
				LogMobile.info("Es visible el bot贸n "+modulo);
				break;
			case "autorizaciones":
				wait.until(ExpectedConditions.elementToBeClickable(BtnAutorizaciones));
				esVisible = BtnAutorizaciones.isDisplayed();									
				LogMobile.info("Es visible el bot贸n "+modulo);
				break;
			case "turnos":
				wait.until(ExpectedConditions.elementToBeClickable(btn_turnos));
				esVisible = btn_turnos.isDisplayed();									
				LogMobile.info("Es visible el bot贸n "+modulo);
				break;
			case "datos_contacto":
				wait.until(ExpectedConditions.elementToBeClickable(btn_datos_contacto));
				esVisible = btn_datos_contacto.isDisplayed();									
				LogMobile.info("Es visible el bot贸n "+modulo);
				break;
			case "facturacion":
				wait.until(ExpectedConditions.elementToBeClickable(btn_facturacion));
				esVisible = btn_facturacion.isDisplayed();									
				LogMobile.info("Es visible el bot贸n "+modulo);
				break;
			case "credenciales":
				wait.until(ExpectedConditions.elementToBeClickable(btn_credencial));
				esVisible = btn_credencial.isDisplayed();									
				LogMobile.info("Es visible el bot贸n "+modulo);
				break;
			default:
				LogMobile.info("No existe el boton "+modulo);
				break;
			}
		} catch (Exception e) {
			LogMobile.info("Fallo al ver el bot贸n "+modulo);
			e.printStackTrace();
		}
		return esVisible;
	}


	public void clickBtnAutorizaciones() {
		try {
			waitFluent.until(ExpectedConditions.elementToBeClickable(BtnAutorizaciones));
			BtnAutorizaciones.click();
			LogMobile.info("Se hizo click en el Bot髇 de Empadronamientos");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Bot髇 de Empadronamientos");
			e.printStackTrace();
		}
	}
	
}
