package pages;


import org.jfree.util.Log;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.BasePageMobile;
import log.LogMobile;

public class LoginPage extends BasePageMobile {

	@FindBy (id = "recoverPasswordCloseButton")
	private WebElement BtnCerrarOlvideContrasenia;
	
	@FindBy (id = "loginScreenForgotPasswordButton")
	private WebElement LinkOlvideMiContrasenia;

	@FindBy (xpath = "//*[@resource-id='userActiveLabel']/android.view.View/android.view.View")
	private WebElement label_usuario;
	
	@FindBy (xpath = "//*[@resource-id='homeNavMenuButtonCloseSession']")
	private WebElement btn_cerrar_sesion;

//	@FindBy (id = "homeNavMenuButton")
	@FindBy (xpath = "//*[@resource-id='homeNavMenuButton']")
	private WebElement btnMenuHome;
	
	@FindBy (xpath = "//*[@resource-id='menuHeaderButton']")
	private WebElement btnMenuIniciarSesion;
	
	@FindBy (xpath = "//*[@resource-id='homeGestionesOnlineButton']")
	private WebElement btnGestionesOnLine;
	
	@FindBy (id = "loginScreenUsernameTextField")
	private WebElement TxtDocumento;
	
	@FindBy (xpath = "//*[@resource-id='loginScreenPasswordTextField']")
	private WebElement TxtContrasenia;
	
	@FindBy (id = "ext-element-37")
	private WebElement PantallaPP;
	
//	@FindBy(xpath = "//*[@class ='android.view.View' and @package='com.osde.ar' and content-desc='Ingresar']")
	@FindBy (xpath = "//*[@resource-id='loginScreenLoginButton']")
	private WebElement BtnIngresar;
	
//	@FindBy (id = "")
	@FindBy (xpath = "//*[@resource-id='contentSliderContainer']")
	private WebElement Imageninicio;
	
	@FindBy(xpath = "//*[@text='Nº de Documento']")
	private WebElement Panio;
	
	@FindBy (id = "contentSliderContainer")
	private WebElement PanioGral;

	@FindBy (id = "ext-element-121")
//	@FindBy (xpath = "//*[@resource-id='nombre-user']")
	private WebElement NombreLogueo;

	
	@FindBy (id = "ext-sheet-2")
	private WebElement PopUpDatosInvalidos;
	
	@FindBy (id = "ext-button-2")
	private WebElement BtnAceptarPopUp;
	
	@FindBy (id = "loginScreenPrivatePolicyButton")
	private WebElement LnkPoliticasPrivacidad;
	
	@FindBy (id = "ext-element-197")
	private WebElement TituloPoliticasPrivacidad;
	
	@FindBy (id = "ext-element-209")
	private WebElement InfoPoliticasPrivacidad;
	
	@FindBy (id = "registrationPoliticasDePrivacidadCloseButton")
	private WebElement BtnCerrarPoliticas;
	
	@FindBy (id = "membershipNumberCloseButton")
	private WebElement BtnCerrarOlvideMiCorreo;
	
	@FindBy (id = "membershipNumberCloseButton")
	private WebElement BtnCerrarRegistrarme;
		
	@FindBy (id = "recoverPasswordCloseButton")
	private WebElement BtnCerrarOlvideContrasea;
	
	@FindBy (id = "loginScreenForgotPasswordButton")
	private WebElement LinkOlvideMiContrasea;

	@FindBy (id = "recoverPasswordScreenRecoverEmailButton")
	private WebElement LinkOlvideCorreoElectronico;
	
	@FindBy (id = "recoverPasswordButton")
	private WebElement BtnEnviar;
	
	@FindBy (id = "afiliado1Field")
	private WebElement NroSocio1;
	
	@FindBy (id = "afiliado2Field")
	private WebElement NroSocio2;
	
	@FindBy (id = "membershipNumberContinueToNextScreenButton")
	private WebElement BtnSteOlvideMiCorreo;
	
	@FindBy (id = "ext-input-5")
	private WebElement NrodeDocOlvideContrasea;
	
	@FindBy (id = "loginScreenUserRegistrationButton")
	private WebElement LinkRegistrarme;
	
	@FindBy (id = "btn-logout")
	private WebElement BtnCerrarSesion;
	
	@FindBy (xpath = "//*[@resource-id='ext-button-3']")
	private WebElement BtnAceptarCerrarSesion;
	
	@FindBy (xpath = "//android.webkit.WebView[@text='OSDE-TAS']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']")
	private WebElement PopUpTiempo;
	
	@FindBy (xpath = "//*[@resource-id='ext-button-1']")
	private WebElement BtnVolver;
	
	@FindBy (id = "ext-titlebar-1")
	private WebElement LogoOSDE;
	
	@FindBy (id = "empadronamientosButton")
	private WebElement btnEmpadronamiento;
	
	@FindBy (id = "facturacionButton")
	private WebElement btnFacturacion;


	public void clickMenuLateral() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnMenuHome));
			btnMenuHome.click();
			LogMobile.info("Se hizo click en el campo Menu");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el campo Menu");
			e.printStackTrace();
		}
	}
	
	public void clickIniciarSesion() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnMenuIniciarSesion));
			btnMenuIniciarSesion.click();
			LogMobile.info("Se hizo click en el Botn Iniciar Sesin");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Botn Iniciar Sesin");
			e.printStackTrace();
		}
		
	}
	
	public void clickIngresar() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(BtnIngresar));
			BtnIngresar.click();
	//		BtnIngresar.wait(10000);
			LogMobile.info("Se hizo click en el Botn Ingresar");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Botn Ingresar");
			e.printStackTrace();
		}
		
	}
	
	public void clicContrasea() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(TxtContrasenia));
		//	TxtContrasenia.click();
			action.click(TxtContrasenia);
			LogMobile.info("Se hizo click en el Txt contrasea");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en Txt contrasea");
			e.printStackTrace();
		}
		
	}
	
	public void clickGestionesOnLine() {
		try {
			
			wait.until(ExpectedConditions.elementToBeClickable(btnGestionesOnLine));
			btnGestionesOnLine.click();
			//action.click(btnGestionesOnLine);
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
	
	public  Boolean esVisibleBtnIniciarSesion() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(btnMenuIniciarSesion));
			esVisible = btnMenuIniciarSesion.isDisplayed();
			Log.info("Se obtuvo el elemento botn Iniciar Sesin");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento botn Iniciar Sesin");
		}
		return esVisible;
	}
	
	
	
	public  Boolean esVisibleTxtDoc() {
		Boolean esVisible = false;
		try {
			waitFluent.until(ExpectedConditions.visibilityOf(TxtDocumento));
			esVisible = TxtDocumento.isDisplayed();
			Log.info("Se obtuvo el elemento clave Nro de documento");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Clave Nro de documento");
		}
		return esVisible;
	}

	public void ingresardocumento(String doc) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(TxtDocumento));
			TxtDocumento.sendKeys(doc);
		//	Pao.click();
			Log.info("Se ingreso el documento");
		} catch (Exception e) {
			Log.info("Fallo al ingresar el documento");
			e.printStackTrace();
		}
	}
	
	public void ingresarContrasenia(String password) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(TxtContrasenia));
		//	TxtContrasenia.click();
			TxtContrasenia.sendKeys(password);
		//	Pao.click();
			Log.info("Se ingreso la contrasenia");
		} catch (Exception e) {
			Log.info("Fallo al ingresar contrasenia");
			e.printStackTrace();
		}
	}
	
	public void clickPanio() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(Panio));
			Panio.click();
			LogMobile.info("Se hizo click en el pao");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el pao");
			e.printStackTrace();
		}
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
	
	public void clickImagenInicio() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(Imageninicio));
			Imageninicio.click();
			LogMobile.info("Se hizo click en la imagen de inicio");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en la imagen de inicio");
			e.printStackTrace();
		}
	}
	
	public void clickPanioGral() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(PanioGral));
			PanioGral.click();
			LogMobile.info("Se hizo click en el pao General");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el pao General");
			e.printStackTrace();
		}
	}
	
	public  Boolean esVisiblePopUpDatosInvalidos() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(PopUpDatosInvalidos));
			esVisible = PopUpDatosInvalidos.isDisplayed();
			Log.info("Se obtuvo el elemento PopUp Datos Invalidos");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento PopUp Datos Invalidos");
		}
		return esVisible;
	}
	
	public void clickBtnAceptarPopUp() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(BtnAceptarPopUp));
			BtnAceptarPopUp.click();
			LogMobile.info("Se hizo click en el Botn Aceptar PopUp");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Botn Aceptar PopUp");
			e.printStackTrace();
		}
	}
	
	public  Boolean esVisibleLnkPoliticasPrivacidad() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(LnkPoliticasPrivacidad));
			esVisible = LnkPoliticasPrivacidad.isDisplayed();
			Log.info("Se obtuvo el elemento Link a Poltica de Privacidad");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Link a Poltica de Privacidad");
		}
		return esVisible;
	}
	
	public void clickLnkPoliticasPrivacidad() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(LnkPoliticasPrivacidad));
			LnkPoliticasPrivacidad.click();
			LogMobile.info("Se hizo click en el Link a Poltica de Privacidad");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Link a Poltica de Privacidad");
			e.printStackTrace();
		}
	}
	
	public  Boolean esVisibleTituloPoliticasPrivacidad() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(TituloPoliticasPrivacidad));
			esVisible = TituloPoliticasPrivacidad.isDisplayed();
			Log.info("Se obtuvo el elemento Titulo de Poltica de Privacidad");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Titulo de Poltica de Privacidad");
		}
		return esVisible;
	}
	
	public  Boolean esVisibleInfoPoliticasPrivacidad() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(InfoPoliticasPrivacidad));
			esVisible = InfoPoliticasPrivacidad.isDisplayed();
			Log.info("Se obtuvo el elemento Info de Poltica de Privacidad");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Info de Poltica de Privacidad");
		}
		return esVisible;
	}
	
	public void clickBtnCerrarPoliticas() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(BtnCerrarPoliticas));
			BtnCerrarPoliticas.click();
			LogMobile.info("Se hizo click en el Botn de Cerrar Poltica de Privacidad");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Botn de Cerrar Poltica de Privacidad");
			e.printStackTrace();
		}
	}
	
	public void clickBtnCerrarOlvideMiCorreo() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(BtnCerrarOlvideMiCorreo));
			BtnCerrarOlvideMiCorreo.click();
			LogMobile.info("Se hizo click en el Botn de Cerrar Olvide mi  Correo Electronico");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Botn de Cerrar Olvide mi  Correo Electronico");
			e.printStackTrace();
		}
	}
	
	public void clickBtnCerrarOlvideContrasea() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(BtnCerrarOlvideContrasea));
			BtnCerrarOlvideContrasea.click();
			LogMobile.info("Se hizo click en el Botn de Cerrar Olvide mi Contrasea");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Botn de Cerrar Olvide mi Contrasea");
			e.printStackTrace();
		}
	}
	
	public void clickBtnCerrarRegistrarme() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(BtnCerrarRegistrarme));
			BtnCerrarRegistrarme.click();
			LogMobile.info("Se hizo click en el Botn de Cerrar Registrarme");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Botn de Cerrar Registrarme");
			e.printStackTrace();
		}
	}
	
	public  Boolean esVisibleLinkOlvideMiContrasea() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(LinkOlvideMiContrasea));
			esVisible = LinkOlvideMiContrasea.isDisplayed();
			Log.info("Se obtuvo el elemento Link de Olvide mi Contrasea");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Link de Olvide mi Contrasea");
		}
		return esVisible;
	}
	
	public void clickLinkOlvideMiContrasea() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(LinkOlvideMiContrasea));
			LinkOlvideMiContrasea.click();
			LogMobile.info("Se hizo click en el Link de Olvide mi Correo Electrninco");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Link de Olvide mi Correo Electrninco");
			e.printStackTrace();
		}
	}
	
	public  Boolean esVisibleLinkOlvideCorreoElectronico() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(LinkOlvideCorreoElectronico));
			esVisible = LinkOlvideCorreoElectronico.isDisplayed();
			Log.info("Se obtuvo el elemento Link de Olvide mi Correo Electrninco");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Link de Olvide mi Correo Electrninco");
		}
		return esVisible;
	}
	
	public void clickLinkOlvideCorreoElectronico() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(LinkOlvideCorreoElectronico));
			LinkOlvideCorreoElectronico.click();
			LogMobile.info("Se hizo click en el Link de Olvide mi Correo Electrninco");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Link de Olvide mi Correo Electrninco");
			e.printStackTrace();
		}
	}
	
	public  Boolean esVisibleBtnEnviar() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(BtnEnviar));
			esVisible = BtnEnviar.isDisplayed();
			Log.info("Se obtuvo el elemento Botn Enviar");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Botn Enviar");
		}
		return esVisible;
	}
	
	public void clickBtnEnviar() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(BtnEnviar));
			BtnEnviar.click();
			LogMobile.info("Se hizo click en el Botn Enviar");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Botn Enviar");
			e.printStackTrace();
		}
	}
	
	public  Boolean esVisibleNroSocio1() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(NroSocio1));
			esVisible = NroSocio1.isDisplayed();
			Log.info("Se obtuvo el elemento Nro de Socio, primer elemento");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Nro de Socio, primer elemento");
		}
		return esVisible;
	}
	
	public  Boolean esVisibleNroSocio2() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(NroSocio2));
			esVisible = NroSocio2.isDisplayed();
			Log.info("Se obtuvo el elemento Nro de Socio, segundo elemento");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Nro de Socio, segundo elemento");
		}
		return esVisible;
	}
	
	public  Boolean esVisibleBtnSteOlvideMiCorreo() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(BtnSteOlvideMiCorreo));
			esVisible = BtnSteOlvideMiCorreo.isDisplayed();
			Log.info("Se obtuvo el elemento Botn Siguiente de Olvide mi correo Electrnico");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Botn Siguiente de Olvide mi correo Electrnico");
		}
		return esVisible;
	}
	
	public void clickBtnSteOlvideMiCorreo() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(BtnSteOlvideMiCorreo));
			BtnSteOlvideMiCorreo.click();
			LogMobile.info("Se hizo click en el Botn Siguiente de Olvide mi correo Electrnico");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Botn Siguiente de Olvide mi correo Electrnico");
			e.printStackTrace();
		}
	}
	
	public void ingresardocumentoOlvideContrasenia(String doc) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(NrodeDocOlvideContrasea));
			NrodeDocOlvideContrasea.sendKeys(doc);
			Log.info("Se ingreso el documento");
		} catch (Exception e) {
			Log.info("Fallo al ingresar el documento");
			e.printStackTrace();
		}
	}
	
	public void clickLinkRegistrarme() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(LinkRegistrarme));
			LinkRegistrarme.click();
			LogMobile.info("Se hizo click en el Link de Registrarme");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Link de Registrarme");
			e.printStackTrace();
		}
	}
	public void clickBtnCerrarSesion() {
		try {
			waitFluent.until(ExpectedConditions.elementToBeClickable(BtnCerrarSesion));
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
			waitFluent.until(ExpectedConditions.elementToBeClickable(BtnAceptarCerrarSesion));
			BtnAceptarCerrarSesion.click();
			LogMobile.info("Se hizo click en el Botn de Cerrar Sesion");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Botn de Cerrar Sesion");
			e.printStackTrace();
		}
	}
	
	public void clickPopUpTiempo() {
		try {
			waitFluent.until(ExpectedConditions.elementToBeClickable(PopUpTiempo));
			PopUpTiempo.click();
			LogMobile.info("Se hizo click en el Botn Generar Credencial");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Botn Generar Credencial");
			e.printStackTrace();
		}
	}
	
	public  Boolean esVisiblePopUpTiempo() {
		Boolean esVisible = false;
		try {
			waitFluent.until(ExpectedConditions.visibilityOf(PopUpTiempo));
			esVisible = PopUpTiempo.isDisplayed();
			Log.info("Se obtuvo el elemento botn Generar Credencial");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento botn Generar Credencial");
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
			LogMobile.info("Se hizo click en el Botn Volvrt");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Botn Volver");
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
	
	public  Boolean esVisibleBtnEmpadronamiento() {
		Boolean esVisible = false;
		try {
			waitFluent.until(ExpectedConditions.visibilityOf(btnEmpadronamiento));
			esVisible = btnEmpadronamiento.isDisplayed();
			Log.info("Se obtuvo el elemento botn de Reintegros");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento botn de Reintegros");
		}
		return esVisible;
	}
	
	public  Boolean esVisibleBtnFacturacion() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(btnFacturacion));
			esVisible = btnFacturacion.isDisplayed();
			Log.info("Se obtuvo el elemento botn de Facturacin");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento botn de Facturacin");
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
	

	
	public Boolean esVisibleLabelSocio() {
		Boolean esVisible = false;
		try {
			esVisible = label_usuario.isDisplayed();
			LogMobile.info("Se obtiene el label del usuario");
		} catch (Exception e) {
			LogMobile.info("Fallo el encontrar el elemento");
			e.printStackTrace();
		}
		return esVisible;
	}
	
	
}
