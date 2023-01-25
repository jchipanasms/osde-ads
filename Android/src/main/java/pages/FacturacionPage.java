package pages;


import org.jfree.util.Log;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.BasePageMobile;
import helpers.PageHelperMobile;
import log.LogMobile;

public class FacturacionPage extends BasePageMobile {

	
	@FindBy (id = "facturacionButton")
	private WebElement btnFacturacion;
	
	@FindBy (xpath = "//*[@resource-id='menuHeaderButton']")
	private WebElement btnMenuIniciarSesion;
	
	@FindBy (id = "homeGestionesOnlineButton")
	private WebElement btnGestionesOnLine;
	
	@FindBy (id = "tipoPractica")
	private WebElement SelecTipoPractica;
	
	@FindBy (id = "integrantePrestacion")
	private WebElement SelecIntegrantePrestacion;
		
	@FindBy (id = "misDocumentosTableView")
	private WebElement EstadoCuenta;
	
	@FindBy (id = "ext-sheet-7")
	private WebElement PopUpEnviarDocumentacion;
	
	@FindBy (id = "id-sin-comprobantes")
	private WebElement LeyendaSinComprobantes;
	
	@FindBy (id = "id-nombre-afiliado")
	private WebElement NombreAfiliado;
	
	@FindBy (id = "listResultHeaderTitleText")
	private WebElement TituloFacturacion;
	
	@FindBy (id = "ext-element-121")
	private WebElement NombreLogueo;
	
	@FindBy (id = "ext-button-1")
	private WebElement BtnVolver;
	
	@FindBy (id = "homeNavMenuButtonCloseSession")
	private WebElement BtnCerrarSesion;
	
	@FindBy (id = "ext-button-3")
	private WebElement BtnAceptarCerrarSesion;
		
	public void clickGestionesOnLine() {
		try {
			
			wait.until(ExpectedConditions.elementToBeClickable(btnGestionesOnLine));
			btnGestionesOnLine.click();
		//	action.click(btnGestionesOnLine);
			LogMobile.info("Se hizo click en el Botn Gestiones On Line");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Botn Gestiones On Line");
			e.printStackTrace();
		}
		
	}
	
	public  Boolean esVisibleBtnGestionesOnLine() {
		Boolean esVisible = false;
		try {
		//	action.click(btnGestionesOnLine);
			wait.until(ExpectedConditions.visibilityOf(btnGestionesOnLine));
			esVisible = btnGestionesOnLine.isDisplayed();
			Log.info("Se obtuvo el elemento botn de Gestiones On Line");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento botn de Gestiones On Line");
		}
		return esVisible;
	}
	
	public void clickBtnFacturacion() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnFacturacion));
			btnFacturacion.click();
			LogMobile.info("Se hizo click en el Botn de Facturacin");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Botn de Facturacin");
			e.printStackTrace();
		}
	}
	
	public  Boolean esVisibleBtnFacturacion() {
		Boolean esVisible = false;
		try {
			waitFluent.until(ExpectedConditions.visibilityOf(btnFacturacion));
			esVisible = btnFacturacion.isDisplayed();
			Log.info("Se obtuvo el elemento botn de Facturacin");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento botn de Facturacin");
		}
		return esVisible;
	}

	public void clickBtnEstadoCuenta() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(EstadoCuenta));
			EstadoCuenta.click();
			LogMobile.info("Se hizo click en el Botn Estado de Cuenta");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Botn Estado de Cuenta");
			e.printStackTrace();
		}
	}
	
	public  Boolean esVisiblePopUpEnviarDocumentacion() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(PopUpEnviarDocumentacion));
			esVisible = PopUpEnviarDocumentacion.isDisplayed();
			Log.info("Se obtuvo el elemento PopUp Enviar Documentacin");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento PopUp Enviar Documentacin");
		}
		return esVisible;
	}
	
	public  Boolean esVisibleNombreLogueo() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(NombreLogueo));
			esVisible = NombreLogueo.isDisplayed();
			Log.info("Se obtuvo el elemento nombre de Logueo");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento NombreLogueo");
		}
		return esVisible;
	}
	
	public  Boolean esVisibleTitulo() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(TituloFacturacion));
			esVisible = TituloFacturacion.isDisplayed();
			Log.info("Se obtuvo el elemento Titulo");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Titulo");
		}
		return esVisible;
	}
	
	public  Boolean esVisibleNombreAfiliado() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(NombreAfiliado));
			esVisible = NombreAfiliado.isDisplayed();
			Log.info("Se obtuvo el elemento Nombre Afiliado");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Nombre Afiliado");
		}
		return esVisible;
	}
	
	public  Boolean esVisibleLeyendaSinComprobantes() {
		Boolean esVisible = false;
		try {
			waitFluent.until(ExpectedConditions.visibilityOf(LeyendaSinComprobantes));
			esVisible = LeyendaSinComprobantes.isDisplayed();
			Log.info("Se obtuvo el elemento Sin Comprobantes");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Sin Comprobantes");
		}
		return esVisible;
	}
	
	public  String recuperarTxtTitulo() {
		String texto = null;
		try {
			texto = TituloFacturacion.getAttribute("name");
			LogMobile.info("Se recupera texto del elemento");
		} catch (Exception e){
			LogMobile.info("Fallo el recuperar el texto del elemento");
		}
		return texto;
	}
	
	public  String recuperarTxtLeyendaSinComprobantes() {
		String texto = null;
		try {
			texto = LeyendaSinComprobantes.getAttribute("name");
			LogMobile.info("Se recupera texto del elemento");
		} catch (Exception e){
			LogMobile.info("Fallo el recuperar el texto del elemento");
		}
		return texto;
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
	
	public  Boolean esVisibleBtnVolver() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(BtnVolver));
			esVisible = BtnVolver.isDisplayed();
			Log.info("Se obtuvo el elemento Nro de Socio, segundo elemento");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Nro de Socio, segundo elemento");
		}
		return esVisible;
	}
	
	public void clickBtnCerrarSesion() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(BtnCerrarSesion));
			BtnCerrarSesion.click();
			LogMobile.info("Se hizo click en el Botn de Cerrar Sesion");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Botn de Cerrar Sesion");
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
			LogMobile.info("Se hizo click en el Botn de Cerrar Sesion");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Botn de Cerrar Sesion");
			e.printStackTrace();
		}
	}
}
