package pages;


import org.jfree.util.Log;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.BasePageMobile;
import helpers.PageHelperMobile;
import log.LogMobile;

public class EmpadronamientoPage extends BasePageMobile {

	
	@FindBy (id = "empadronamientosButton")
	private WebElement btnEmpadronamiento;
	
	@FindBy (xpath = "//*[@resource-id='menuHeaderButton']")
	private WebElement btnMenuIniciarSesion;
	
	@FindBy (id = "homeGestionesOnlineButton")
	private WebElement btnGestionesOnLine;
	
	@FindBy (id = "tipoPractica")
	private WebElement SelecTipoPractica;
	
	@FindBy (id = "integrantePrestacion")
	private WebElement SelecIntegrantePrestacion;
	
	@FindBy (id = "id-terminos")
	private WebElement TerminosCondiciones;
	
	@FindBy (id = "id-proteccion")
	private WebElement ProteccionDatos;
	
//	@FindBy(xpath = "//*[@class ='android.view.View' and @package='com.osde.ar'][1]")
	@FindBy (id = "miembro-1")
	private WebElement Familiar;
	
	@FindBy (id = "id-btnsiguiente-stepone")
	private WebElement BtnSiguiente;
	
	@FindBy (id = "id-antecedente-")
	private WebElement Antecedentes;
	
	@FindBy (id = "id-btnsiguiente-steptwo")
	private WebElement BtnSiguienteAntecedentes;
	
	@FindBy (id = "editar-integrante-grupo-familiar")
	private WebElement BtnEditarIntegrante;
	
	@FindBy (id = "motivo-prescripcion")
	private WebElement MotivoPrescripcion;
	
	@FindBy (id = "id-proteccion")
	private WebElement LnkProteccion;
	
	@FindBy (id = "id-terminos")
	private WebElement LnkTerminos;
	
	@FindBy (id = "btn-generar-tramite")
	private WebElement BtnGenerarTramite;
	
	@FindBy (id = "btn-close")
	private WebElement BtnCerrarLnks;
	
	@FindBy (xpath = "//*[@resource-id='btn-back']")
	private WebElement BtnVolver;
	
	@FindBy (id = "btn-logout")
	private WebElement BtnCerrarSesion;
	
	@FindBy (id = "ext-button-3")
	private WebElement BtnAceptarCerrarSesion;
	
	public void clickGestionesOnLine() {
		try {
			
			wait.until(ExpectedConditions.elementToBeClickable(btnGestionesOnLine));
			btnGestionesOnLine.click();
		//	action.click(btnGestionesOnLine);
			LogMobile.info("Se hizo click en el Botón Gestiones On Line");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Botón Gestiones On Line");
			e.printStackTrace();
		}
		
	}
	
	public  Boolean esVisibleBtnGestionesOnLine() {
		Boolean esVisible = false;
		try {
		//	action.click(btnGestionesOnLine);
			wait.until(ExpectedConditions.visibilityOf(btnGestionesOnLine));
			esVisible = btnGestionesOnLine.isDisplayed();
			Log.info("Se obtuvo el elemento botón de Gestiones On Line");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento botón de Gestiones On Line");
		}
		return esVisible;
	}
	
	public void clickBtnEmpadronamiento() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnEmpadronamiento));
			btnEmpadronamiento.click();
			LogMobile.info("Se hizo click en el Botón de Empadronamientos");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Botón de Empadronamientos");
			e.printStackTrace();
		}
	}
	
	public  Boolean esVisibleBtnEmpadronamiento() {
		Boolean esVisible = false;
		try {
			waitFluent.until(ExpectedConditions.visibilityOf(btnEmpadronamiento));
			esVisible = btnEmpadronamiento.isDisplayed();
			Log.info("Se obtuvo el elemento botón de Reintegros");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento botón de Reintegros");
		}
		return esVisible;
	}
	
	public  Boolean esVisibleTerminosCondiciones() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(TerminosCondiciones));
			esVisible = TerminosCondiciones.isDisplayed();
			Log.info("Se obtuvo el elemento Términos y condiciones");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Términos y condiciones");
		}
		return esVisible;
	}
	
	
	public  Boolean esVisibleProteccionDatos() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(ProteccionDatos));
			esVisible = ProteccionDatos.isDisplayed();
			Log.info("Se obtuvo el elemento Protección de datos");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Protección de datos");
		}
		return esVisible;
	}
	
	public  Boolean esVisibleFamiliar() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(Familiar));
			esVisible = Familiar.isDisplayed();
			Log.info("Se obtuvo el elemento Familiar");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Familiar");
		}
		return esVisible;
	}
	public void clickFamiliar() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(Familiar));
			Familiar.click();
			LogMobile.info("Se hizo click en el Familiar");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Familiar");
			e.printStackTrace();
		}
	}
	
	public  Boolean esVisibleBtnSiguiente() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(BtnSiguiente));
			esVisible = BtnSiguiente.isDisplayed();
			Log.info("Se obtuvo el elemento Familiar");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Familiar");
		}
		return esVisible;
	}
	public void clickBtnSiguiente() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(BtnSiguiente));
			BtnSiguiente.click();
			LogMobile.info("Se hizo click en el Familiar");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Familiar");
			e.printStackTrace();
		}
	}
	
	public  Boolean esVisibleAntecedentes() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(Antecedentes));
			esVisible = Antecedentes.isDisplayed();
			Log.info("Se obtuvo el elemento Antecedentes");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Antecedentes");
		}
		return esVisible;
	}
	
	public void clickCheckAntecedentes() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(Antecedentes));
			Antecedentes.click();
			LogMobile.info("Se hizo click en el Familiar");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Familiar");
			e.printStackTrace();
		}
	}
	
	public void clickBtnSiguienteAntecedentes() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(BtnSiguienteAntecedentes));
			BtnSiguienteAntecedentes.click();
			LogMobile.info("Se hizo click en el Familiar");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Familiar");
			e.printStackTrace();
		}
	}
	
	public  Boolean esVisibleBtnSiguienteAntecedentes() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(BtnSiguienteAntecedentes));
			esVisible = BtnSiguienteAntecedentes.isDisplayed();
			Log.info("Se obtuvo el elemento Antecedentes");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Antecedentes");
		}
		return esVisible;
	}
	
	public  Boolean esVisibleBtnEditarIntegrante() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(BtnEditarIntegrante));
			esVisible = BtnEditarIntegrante.isDisplayed();
			Log.info("Se obtuvo el elemento Botón Editar Integrantes");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Botón Editar Integrantes");
		}
		return esVisible;
	}
	
	public  Boolean esVisibleMotivoPrescripcion() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(MotivoPrescripcion));
			esVisible = MotivoPrescripcion.isDisplayed();
			Log.info("Se obtuvo el elemento Editar Prescripción");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Editar Prescripción");
		}
		return esVisible;
	}
	
	public  Boolean esVisibleLnkProteccion() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(LnkProteccion));
			esVisible = LnkProteccion.isDisplayed();
			Log.info("Se obtuvo el elemento Link a Proteccion");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Link a Proteccion");
		}
		return esVisible;
	}
	
	public void clickLnkProteccion() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(LnkProteccion));
			LnkProteccion.click();
			LogMobile.info("Se hizo click en el Link de proteccion de datos");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Link de proteccion de datos");
			e.printStackTrace();
		}
	}
	
	public  Boolean esVisibleLnkTerminos() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(LnkTerminos));
			esVisible = LnkTerminos.isDisplayed();
			Log.info("Se obtuvo el elemento Link a Términos y Condiciones");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Link a Términos y Condiciones");
		}
		return esVisible;
	}

	public void clickLnkTerminos() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(LnkTerminos));
			LnkTerminos.click();
			LogMobile.info("Se hizo click en el Link de Términos y Condiciones");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Link de Términos y Condiciones");
			e.printStackTrace();
		}
	}
	
	public  Boolean esVisibleBtnGenerarTramite() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(BtnGenerarTramite));
			esVisible = BtnGenerarTramite.isDisplayed();
			Log.info("Se obtuvo el elemento Botón Generar Trámite");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Botón Generar Trámite");
		}
		return esVisible;
	}
	
	public  Boolean esVisibleBtnCerrarLnks() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(BtnCerrarLnks));
			esVisible = BtnCerrarLnks.isDisplayed();
			Log.info("Se obtuvo el elemento Cerrar Link");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Cerrar Link");
		}
		return esVisible;
	}
	
	public void clickBtnCerrarLnks() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(BtnCerrarLnks));
			BtnCerrarLnks.click();
			LogMobile.info("Se hizo click en el Botón Volver");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Botón Volver");
			e.printStackTrace();
		}
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
			wait.until(ExpectedConditions.elementToBeClickable(BtnVolver));
			BtnVolver.click();
			LogMobile.info("Se hizo click en el Botón Volver");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Botón Volver");
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
	
	public void clickBtnCerrarSesion() {
		try {
			waitFluent.until(ExpectedConditions.elementToBeClickable(BtnCerrarSesion));
			BtnCerrarSesion.click();
			LogMobile.info("Se hizo click en el Botón de Cerrar Sesion");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Botón de Cerrar Sesion");
			e.printStackTrace();
		}
	}
	
	public void clickBtnAceptarCerrarSesion() {
		try {
			waitFluent.until(ExpectedConditions.elementToBeClickable(BtnAceptarCerrarSesion));
			BtnAceptarCerrarSesion.click();
			LogMobile.info("Se hizo click en el Botón de Cerrar Sesion");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Botón de Cerrar Sesion");
			e.printStackTrace();
		}
	}
}
