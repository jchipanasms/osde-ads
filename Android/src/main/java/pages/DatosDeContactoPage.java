package pages;


import org.jfree.util.Log;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.BasePageMobile;
import helpers.PageHelperMobile;
import log.LogMobile;

public class DatosDeContactoPage extends BasePageMobile {

	
	@FindBy (id = "datosContactoButton")
	private WebElement btnDatosContacto;
	
	@FindBy (xpath = "//*[@resource-id='menuHeaderButton']")
	private WebElement btnMenuIniciarSesion;
	
	@FindBy (id = "homeGestionesOnlineButton")
	private WebElement btnGestionesOnLine;
	
	@FindBy (id = "id-email-0")
	private WebElement EmailContacto;
	
	@FindBy (id = "id-agregar-email-titular")
	private WebElement BtnAgregarEmail;
	
	@FindBy (id = "id-modificar-residencia")
	private WebElement BtnModificarResidencia;
	
	@FindBy (id = "newEmail")
	private WebElement TxtNuevoMail;
	
	@FindBy (id = "id-cancelar-correo")
	private WebElement BtnCancelarEmail;
	
	@FindBy (id = "id-guardar-correo")
	private WebElement BtnGuardarEmail;
	
	@FindBy (id = "id-selecciona-provincia")
	private WebElement CmbProvincia;
	
	@FindBy (id = "id-selecciona-localidad")
	private WebElement CmbLocalidad;
	
	@FindBy (id = "codigoPostal")
	private WebElement TxtCodPostal;
	
	@FindBy (id = "id-selecciona-calle")
	private WebElement CmbCalle;
	
	@FindBy (id = "id-numero")
	private WebElement TxtNro;
	
	@FindBy (id = "id-piso")
	private WebElement TxtPiso;
	
	@FindBy (id = "id-depto")
	private WebElement TxtDepto;
	
	@FindBy (id = "id-barrio")
	private WebElement TxtBarrio;
	
	@FindBy (id = "id-codArea-telfijo")
	private WebElement TxtCodArea;
	
	@FindBy (id = "id-interno-telfijo")
	private WebElement TxtInternoTelFijo;
	
	@FindBy (id = "id-codArea-telmovil")
	private WebElement TxtCodAreaMovil;
	
	@FindBy (id = "id-numero-telmovil")
	private WebElement TxtNroTelMovil;
	
	@FindBy (id = "id-mas-telefonos")
	private WebElement BtnMasTelefonos;
	
	@FindBy (id = "id-cancelar")
	private WebElement BtnCancelarDR;
	
	@FindBy (id = "id-guardar")
	private WebElement BtnGuardarDR;
	
	@FindBy (id = "id-numerocompleto-fijo")
	private WebElement TxtTelMT;
	
	@FindBy (id = "id-interno-fijo")
	private WebElement TxtTelMTInt;
	
	@FindBy (id ="id-numerocompleto-telmovil")
	private WebElement TxtTelMTMovil;
	
	@FindBy (id ="id-cancelar-telmovilfijo")
	private WebElement BtnCancelarTel;
	
	@FindBy (id ="id-cancelar-telmovilfijo")
	private WebElement BtnGuardarTel;
	
	@FindBy (id ="id-cancelar")
	private WebElement BtnCancelarResidencia;
	
	@FindBy (id ="id-guardar")
	private WebElement BtnGuardarResidencia;
	
	@FindBy (id ="id-modificar-correspondencia")
	private WebElement BtnModificarCorrespondencia;
	
	
	
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
	
	public void clickBtnDatosContacto() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnDatosContacto));
			btnDatosContacto.click();
			LogMobile.info("Se hizo click en el Botn de Datos de contacto");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Botn de Datos de contacto");
			e.printStackTrace();
		}
	}
	
	public  Boolean esVisibleBtnDatosContacto() {
		Boolean esVisible = false;
		try {
			waitFluent.until(ExpectedConditions.visibilityOf(btnDatosContacto));
			esVisible = btnDatosContacto.isDisplayed();
			Log.info("Se obtuvo el elemento botn de Reintegros");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento botn de Reintegros");
		}
		return esVisible;
	}
	
	public  Boolean esVisibleEmailContacto() {
		Boolean esVisible = false;
		try {
			waitFluent.until(ExpectedConditions.visibilityOf(EmailContacto));
			esVisible = EmailContacto.isDisplayed();
			Log.info("Se obtuvo el elemento Email");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Email");
		}
		return esVisible;
	}
	
	public  Boolean esVisibleBtnAgregarEmail() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(BtnAgregarEmail));
			esVisible = BtnAgregarEmail.isDisplayed();
			Log.info("Se obtuvo el elemento Botn Agregar Email");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Botn Agregar Email");
		}
		return esVisible;
	}
	
	public void clickBtnAgregarEmail() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(BtnAgregarEmail));
			BtnAgregarEmail.click();
			LogMobile.info("Se hizo click en el Botn Agregar Email");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Botn Agregar Email");
			e.printStackTrace();
		}
	}
	
	public  Boolean esVisibleBtnModificarResidencia() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(BtnModificarResidencia));
			esVisible = BtnModificarResidencia.isDisplayed();
			Log.info("Se obtuvo el elemento Botn Modificar Residencia");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Botn Modificar Residencia");
		}
		return esVisible;
	}
	
	public void clickBtnModificarResidencia() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(BtnModificarResidencia));
			BtnModificarResidencia.click();
			LogMobile.info("Se hizo click en el Botn Modificar Residencia");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Botn Modificar Residencia");
			e.printStackTrace();
		}
	}
	
	public  Boolean esVisibleTxtEmail() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(TxtNuevoMail));
			esVisible = TxtNuevoMail.isDisplayed();
			Log.info("Se obtuvo el elemento Texto del Email");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Texto del Email");
		}
		return esVisible;
	}
	
	public  Boolean esVisibleBtnCancelarEmail() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(BtnCancelarEmail));
			esVisible = BtnCancelarEmail.isDisplayed();
			Log.info("Se obtuvo el elemento Botn Cancelar Email");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Botn Cancelar Email");
		}
		return esVisible;
	}
	
	public void clickBtnCancelarEmail() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(BtnCancelarEmail));
			BtnCancelarEmail.click();
			LogMobile.info("Se hizo click en el Botn Cancelar Email");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Botn Cancelar Email");
			e.printStackTrace();
		}
	}
	
	public  Boolean esVisibleBtnGuardarEmail() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(BtnGuardarEmail));
			esVisible = BtnGuardarEmail.isDisplayed();
			Log.info("Se obtuvo el elemento Botn Guardar Email");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Botn Guardar Email");
		}
		return esVisible;
	}

	public  Boolean esVisibleCmbProvincia() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(CmbProvincia));
			esVisible = CmbProvincia.isDisplayed();
			Log.info("Se obtuvo el elemento Combo Provincia");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Combo Provincia");
		}
		return esVisible;
	}
	
	public  Boolean esVisibleCmbLocalidad() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(CmbLocalidad));
			esVisible = CmbLocalidad.isDisplayed();
			Log.info("Se obtuvo el elemento Combo Localidad");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Combo Localidad");
		}
		return esVisible;
	}
	
	public  Boolean esVisibleTxtCodPostal() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(TxtCodPostal));
			esVisible = TxtCodPostal.isDisplayed();
			Log.info("Se obtuvo el elemento cdigo Postal");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento cdigo Postal");
		}
		return esVisible;
	}
	
	public  Boolean esVisibleCmbCalle() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(CmbCalle));
			esVisible = CmbCalle.isDisplayed();
			Log.info("Se obtuvo el elemento Combo Calle");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Combo Calle");
		}
		return esVisible;
	}
	
	public  Boolean esVisibleTxtNro() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(TxtNro));
			esVisible = TxtNro.isDisplayed();
			Log.info("Se obtuvo el elemento Nro");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Nro");
		}
		return esVisible;
	}
	
	public  Boolean esVisibleTxtPiso() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(TxtPiso));
			esVisible = TxtPiso.isDisplayed();
			Log.info("Se obtuvo el elemento Piso");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Piso");
		}
		return esVisible;
	}
	
	public  Boolean esVisibleTxtDepto() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(TxtDepto));
			esVisible = TxtDepto.isDisplayed();
			Log.info("Se obtuvo el elemento Depto");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Depto");
		}
		return esVisible;
	}
	
	public  Boolean esVisibleTxtBarrio() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(TxtBarrio));
			esVisible = TxtBarrio.isDisplayed();
			Log.info("Se obtuvo el elemento Barrio");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Barrio");
		}
		return esVisible;
	}
	
	public  Boolean esVisibleTxtCodArea() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(TxtCodArea));
			esVisible = TxtCodArea.isDisplayed();
			Log.info("Se obtuvo el elemento Cdigo de Area");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Cdigo de Area");
		}
		return esVisible;
	}
	
	public  Boolean esVisibleTxtInternoTelFijo() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(TxtInternoTelFijo));
			esVisible = TxtInternoTelFijo.isDisplayed();
			Log.info("Se obtuvo el elemento Telefono Fijo");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Telefono Fijo");
		}
		return esVisible;
	}
	
	public  Boolean esVisibleTxtCodAreaMovil() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(TxtCodAreaMovil));
			esVisible = TxtCodAreaMovil.isDisplayed();
			Log.info("Se obtuvo el elemento Cdigo de Area Mvil");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Cdigo de Area Mvil");
		}
		return esVisible;
	}
	
	public  Boolean esVisibleTxtNroTelMovil() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(TxtNroTelMovil));
			esVisible = TxtNroTelMovil.isDisplayed();
			Log.info("Se obtuvo el elemento Telfono Mvil");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Telfono Mvil");
		}
		return esVisible;
	}
	
	public  Boolean esVisibleBtnMasTelefonos() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(BtnMasTelefonos));
			esVisible = BtnMasTelefonos.isDisplayed();
			Log.info("Se obtuvo el elemento Botn mas telfonos");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Botn mas telfonos");
		}
		return esVisible;
	}
	
	public void clickBtnMasTelefonos() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(BtnMasTelefonos));
			BtnMasTelefonos.click();
			LogMobile.info("Se hizo click en el Botn Botn mas telfonos");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Botn Botn mas telfonos");
			e.printStackTrace();
		}
	}
	
	public  Boolean esVisibleBtnCancelarDR() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(BtnCancelarDR));
			esVisible = BtnCancelarDR.isDisplayed();
			Log.info("Se obtuvo el elemento Botn Cancelar modificacin de Formulario");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Botn Cancelar modificacin de Formulario");
		}
		return esVisible;
	}
	
	public void clickBtnCancelarDR() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(BtnCancelarDR));
			BtnCancelarDR.click();
			LogMobile.info("Se hizo click en el Botn Cancelar Direccion de Residencia");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Botn Cancelar Direccion de Residencia");
			e.printStackTrace();
		}
	}
	
	public  Boolean esVisibleBtnGuardarDR() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(BtnGuardarDR));
			esVisible = BtnGuardarDR.isDisplayed();
			Log.info("Se obtuvo el elemento Botn Guardar modificacin de Formulario");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Botn Guardar modificacin de Formulario");
		}
		return esVisible;
	}
	
	public  Boolean esVisibleTxtTelMT() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(TxtTelMT));
			esVisible = TxtTelMT.isDisplayed();
			Log.info("Se obtuvo el elemento Telfono");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Telfono");
		}
		return esVisible;
	}
	
	public  Boolean esVisibleTxtTelMTInt() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(TxtTelMTInt));
			esVisible = TxtTelMTInt.isDisplayed();
			Log.info("Se obtuvo el elemento Telfono Interno");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Telfono Interno");
		}
		return esVisible;
	}
	
	public  Boolean esVisibleTxtTelMTMovil() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(TxtTelMTMovil));
			esVisible = TxtTelMTMovil.isDisplayed();
			Log.info("Se obtuvo el elemento Telfono Movil");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Telfono Movil");
		}
		return esVisible;
	}
	
	public  Boolean esVisibleBtnCancelarTel() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(BtnCancelarTel));
			esVisible = BtnCancelarTel.isDisplayed();
			Log.info("Se obtuvo el elemento Boton Cancelar Tel");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Boton Cancelar Tel");
		}
		return esVisible;
	}
	
	public  Boolean esVisibleBtnGuardarTel() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(BtnGuardarTel));
			esVisible = BtnGuardarTel.isDisplayed();
			Log.info("Se obtuvo el elemento Boton Guardar Tel");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Boton Guardar Tel");
		}
		return esVisible;
	}
	
	public void clickBtnCancelarTel() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(BtnCancelarTel));
			BtnCancelarTel.click();
			LogMobile.info("Se hizo click en el Botn Cancelar Modificacion de telefono");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Botn Cancelar Modificacion de telefono");
			e.printStackTrace();
		}
	}
	
	public  Boolean esVisibleBtnCancelarResidencia() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(BtnCancelarResidencia));
			esVisible = BtnCancelarResidencia.isDisplayed();
			Log.info("Se obtuvo el elemento Boton Guardar Tel");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Boton Guardar Tel");
		}
		return esVisible;
	}
	
	public  Boolean esVisibleBtnGuardarResidencia() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(BtnGuardarResidencia));
			esVisible = BtnGuardarResidencia.isDisplayed();
			Log.info("Se obtuvo el elemento Boton Guardar Tel");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Boton Guardar Tel");
		}
		return esVisible;
	}
	
	public void clickBtnCancelarResidencia() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(BtnCancelarResidencia));
			BtnCancelarResidencia.click();
			LogMobile.info("Se hizo click en el Botn Cancelar Modificacion de telefono");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Botn Cancelar Modificacion de telefono");
			e.printStackTrace();
		}
	}
	

	public  Boolean esVisibleBtnModificarCorrespondencia() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(BtnModificarCorrespondencia));
			esVisible = BtnModificarCorrespondencia.isDisplayed();
			Log.info("Se obtuvo el elemento Boton Modificar Correspondencia");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Modificar Correspondencia");
		}
		return esVisible;
	}
	
	public void ScrollDown() {
		try {
			PageHelperMobile.ScrollDown();
			LogMobile.info("Se hizo click en el Botn Modificar Residencia");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Botn Modificar Residencia");
			e.printStackTrace();
		}
	}
	public void clickBtnModificarCorrespondencia() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(BtnModificarCorrespondencia));
			BtnModificarCorrespondencia.click();
			LogMobile.info("Se hizo click en el Botn Modificar Residencia");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Botn Modificar Residencia");
			e.printStackTrace();
		}
	}
}
