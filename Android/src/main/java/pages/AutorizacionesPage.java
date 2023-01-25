package pages;


import java.util.List;

import org.jfree.util.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.BasePageMobile;
import log.LogMobile;

public class AutorizacionesPage extends BasePageMobile {

	@FindBy (id = "homeNavMenuButton")
	private WebElement btnMenuHome;
		
	//menuHeaderLoginTitle
	@FindBy (id = "menuHeaderButton")
	private WebElement btnMenuIniciarSesion;
	
	@FindBy (id = "homeGestionesOnlineButton")
	private WebElement btnGestionesOnLine;
	
	@FindBy (id = "ext-element-109")
	private WebElement TxtDocumento;
	
	@FindBy (id = "ext-element-142")
	private WebElement TxtDocumentoGO;

	@FindBy (xpath = "//*[@resource-id='ext-element-151']")
	private WebElement TxtContraseniaGO;
	
//	@FindBy (id = "ext-element-115")
	@FindBy (xpath = "//*[@resource-id='ext-element-115']")
	private WebElement TxtContrasenia;
	
	@FindBy(xpath = "//*[@class ='android.view.View' and @package='com.osde.ar' and content-desc='Ingresar']")
	private WebElement BtnIngresar;
	
	@FindBy (xpath = "//*[@resource-id='autorizacionesButton']")
	private WebElement BtnAutorizaciones;
	
	@FindBy (xpath = "//*[@resource-id='iniciarTramite_practicas']")
	private WebElement BtnPracticas;
	
	@FindBy (xpath = "//*[@resource-id='iniciarTramite_traslados']")
	private WebElement BtnTraslados;
	
	@FindBy (xpath = "//*[@resource-id='iniciarTramite_internacion']")
	private WebElement BtnInternacion;
			
//	@FindBy (id = "contentSliderContainer")
	@FindBy (xpath = "//*[@resource-id='contentSliderContainer']")
	private WebElement PanioGral;
	
	/*
	@FindBy (id = "ar.com.portalsalud.osde:id/callNow1Btt")
	private WebElement btnPrimerTelefono;

	@FindBy(id = "ar.com.portalsalud.osde:id/callNow2Btt")
	private WebElement btnSegundoTelefono;

	@FindBy(id = "ar.com.portalsalud.osde:id/tv_communicate")
	private WebElement labelTxtAcceder;

	@FindBy(id = "ar.com.portalsalud.osde:id/tv_communicate_info")
	private WebElement labelTxtServicioUrgencias;
android.view.View
	@FindBy(id = "ar.com.portalsalud.osde:id/versionName")
	private WebElement labelTxtVersion;
	
	@FindBy(id = "ar.com.portalsalud.osde:id/tv_rights_reserved")
	private WebElement labelTxtOSDE;
	
*/
//	@FindBy (id = "ext-panel-14")
//	@FindBy (xpath = "//*[@resource-id='ext-panel-14']")
/*	@FindBy(xpath = "//*[@class ='android.view.View' and @package='com.osde.ar' and content-desc='NÂº de Documento']")
	private WebElement Panio;
	*/
	//Elementos de Fer////
	@FindBy (xpath = "//*[@resource-id='contenido-vista-general']/android.view.View[@index='0']")
	private WebElement contenedor_gral;
	@FindBy(xpath = "//*[@resource-id='contenido-vista-general']/android.view.View[@index='0']/android.view.View[@index='0']")
	private WebElement titulo_aut;
	@FindBy(xpath = "//*[@resource-id='contenido-vista-general']/android.view.View[@index='0']/android.view.View[@index='1']")
	private WebElement subTitulo_aut;
	
	//paso 1
	@FindBy (xpath = "//*[@resource-id='contenido-vista-general']/android.view.View[@index='0']/android.view.View[@index='0']")
	private WebElement paso1_titulo_parte1;
	@FindBy (xpath = "//*[@resource-id='contenido-vista-general']/android.view.View[@index='0']/android.view.View[@index='1']")
	private WebElement paso1_titulo_parte2;
	@FindBy (xpath = "//*[@resource-id='contenido-vista-general']/android.view.View[@index='0']/android.view.View[@index='3']")
	private WebElement paso1_subtitulo;
//	@FindBy (xpath = "//*[@bounds='[230,984][266,1013]']")
//	private WebElement check_terminos;
	
	@FindBy (xpath = "//android.widget.CheckBox[@resource-id='tycCheck']")
	private WebElement check_terminos;
	
	@FindBy (xpath = "//*[@text='Términos y condiciones']")
	private WebElement link_terminos;
	@FindBy (xpath = "//*[@text='Protección de los datos personales. Ley 25.326']")
	private WebElement link_proteccion_datos;
	@FindBy (xpath = "//*[@resource-id='selected-member-btn-siguiente']")
	private WebElement btn_siguiente;
	
	@FindBy (xpath = "//*[@resource-id='autorizacionesModuleScreenIframe']/android.view.View/android.view.View/android.view.View[@index='3']/android.view.View[@index='0']/android.view.View[@index='0']")
	private WebElement titulo_terminos;
	@FindBy (xpath = "//*[@resource-id='autorizacionesModuleScreenIframe']/android.view.View/android.view.View/android.view.View[@index='3']/android.view.View[@index='0']/android.view.View[@index='1']/android.widget.Button")
	private WebElement cruz_terminos;	
	@FindBy (xpath = "//*[@resource-id='autorizacionesModuleScreenIframe']/android.view.View/android.view.View/android.view.View[@index='3']/android.view.View[@index='0']/android.view.View[@index='2']/android.widget.Button")
	private WebElement cruz_proteccion;	
	
	@FindBy (xpath = "//*[@resource-id='popup-aviso-tyc']")
	private WebElement aviso_popup_terminos;
	@FindBy (xpath = "//*[@text='ACEPTAR']")
	private WebElement btn_aceptar_terminos_popup;
	//paso2
	@FindBy (xpath = "//*[@resource-id='contenido-vista-general']/android.view.View[@index='0']/android.view.View[@index='4']")
	private WebElement titulo_fecha_realizacion;
	@FindBy (xpath = "//*[@resource-id='txt-fecha-realizacion']")
	private WebElement input_fecha_realizacion;
	
	@FindBy (xpath = "//*[@resource-id='contenido-vista-general']/android.view.View[@index='0']/android.view.View[@index='6']")
	private WebElement titulo_institucion_sanatorio;
	
	@FindBy(xpath = "//*[@class ='android.widget.EditText' and [@resource-id='idate-is']")
//	@FindBy (xpath = "//*[@resource-id='idate-is']")
	private WebElement input_institucion_sanatorio;
	
/*	@FindBy (xpath = "//*[@resource-id='idate-is']")
	private WebElement TxtSanatorio;*/
	
	@FindBy (xpath = "//*[@resource-id='contenido-vista-general']/android.view.View[@index='0']/android.view.View[@index='8']")
	private WebElement titulo_profesional_efectua;
	@FindBy (xpath = "//*[@resource-id='idate-p']")
	private WebElement input_profesional_efectua;
	
	@FindBy (xpath = "//*[@resource-id='contenido-vista-general']/android.view.View[@index='0']/android.view.View[@index='10']")
	private WebElement titulo_observaciones;
	@FindBy (xpath = "//*[@resource-id='txt-observaciones']")
	private WebElement input_observaciones;
	
	@FindBy (xpath = "//*[@resource-id='contenido-vista-general']/android.view.View[@index='0']/android.view.View[@index='12']")
	private WebElement titulo_datos_obligatorios;
	
	@FindBy (xpath = "//*[@resource-id='datos-btn-siguiente']")
	private WebElement btn_siguiente_paso2;
	
	@FindBy (xpath = "//*[@resource-id='autorizacionesModuleScreenIframe']/android.view.View/android.view.View/android.view.View[@index='3']/android.view.View/android.view.View[@index='0']")
	private WebElement titulo_popup;
	@FindBy (xpath = "//*[@resource-id='popup-aviso-generar']")
	private WebElement contenido_popup;
	@FindBy (xpath = "//android.widget.Button[@text='VOLVER ']")
	private WebElement btn_volver_popup;
	@FindBy (xpath = "//android.widget.Button[@text='CONTINUAR ']")
	private WebElement btn_continuar_popup;
	//paso3
	@FindBy (xpath = "//*[@resource-id='contenido-vista-general']/android.view.View[@index='0']/android.view.View[@index='4']")
	private WebElement titulo_pedido_medico;
	@FindBy (xpath = "//*[@resource-id='comprobanteFactura']/android.view.View[@index='0']")
	private WebElement input_adjuntar;
	@FindBy (xpath = "//*[@resource-id='btn-adjuntar']")
	private WebElement btn_adjuntar;
	@FindBy (xpath = "//*[@resource-id='camera']")
	private WebElement btn_camera;
	@FindBy (xpath = "//*[@resource-id='btn-documentacion-adicional']")
	private WebElement btn_doc_adicional;
	@FindBy (xpath = "//*[@resource-id='btn-siguiente']")
	private WebElement btn_siguiente_paso3;
	
	@FindBy (xpath = "//*[@resource-id='btn-trash']")
	private WebElement icono_basura;
	@FindBy (xpath = "//*[@resource-id='btn-search']")
	private WebElement icono_lupa;
	@FindBy (xpath = "//*[@resource-id='image-preview']")
	private WebElement imagen_previsualizada;
	@FindBy (xpath = "//android.widget.Button[@text='ACEPTAR ']")
	private WebElement btn_aceptar_prev;
	//paso4
	@FindBy (xpath = "//*[@resource-id='contenido-vista-general']/android.view.View[@index='0']/android.view.View[@index='4']")
	private WebElement titulo_email;
	@FindBy (xpath = "//*[@resource-id='input-email-contacto']")
	private WebElement input_email;	
	
	@FindBy (xpath = "//*[@resource-id='contenido-vista-general']/android.view.View[@index='0']/android.view.View[@index='7']")
	private WebElement titulo_tel;
	@FindBy (xpath = "//*[@resource-id='numero']")
	private WebElement input_tel;
	
	@FindBy (xpath = "//*[@resource-id='contenido-vista-general']/android.view.View[@index='0']/android.view.View[@index='10']")
	private WebElement info_paso4;
	//paso5
	@FindBy (xpath = "//*[@resource-id='contenido-vista-general']/android.view.View[@index='0']/android.view.View[@index='4']")
	private WebElement titulo_integrante_grupo_p5;
	@FindBy (xpath = "//*[@resource-id='ico-editar-integrante-grupo-familiar']")
	private WebElement lapiz_integrante_grupo_p5;
	@FindBy (xpath = "//*[@resource-id='input-integrante-grupo-familiar']")
	private WebElement input_integrante_grupo_p5;
	
	@FindBy (xpath = "//*[@resource-id='contenido-vista-general']/android.view.View[@index='0']/android.view.View[@index='8']")
	private WebElement titulo_fecha_realizacion_p5;
	@FindBy (xpath = "//*[@resource-id='ico-editar-fecha-realizacion']")
	private WebElement lapiz_fecha_realizacion_p5;
	@FindBy (xpath = "//*[@resource-id='input-fecha-realizacion']")
	private WebElement input_fecha_realizacion_p5;
	
	@FindBy (xpath = "//*[@resource-id='contenido-vista-general']/android.view.View[@index='0']/android.view.View[@index='12']")
	private WebElement titulo_inst_sanatorio_p5;
	@FindBy (xpath = "//*[@resource-id='ico-editar-institucion-sanatorio']")
	private WebElement lapiz_inst_sanatorio_p5;
	@FindBy (xpath = "//*[@resource-id='input-institucion-sanatorio']")
	private WebElement input_inst_sanatorio_p5;
	
	@FindBy (xpath = "//*[@resource-id='contenido-vista-general']/android.view.View[@index='0']/android.view.View[@index='16']")
	private WebElement titulo_prof_que_realiza_p5;
	@FindBy (xpath = "//*[@resource-id='ico-editar-profesional']")
	private WebElement lapiz_prof_que_realiza_p5;
	@FindBy (xpath = "//*[@resource-id='input-profesional']")
	private WebElement input_prof_que_realiza_p5;
	
	@FindBy (xpath = "//*[@resource-id='contenido-vista-general']/android.view.View[@index='0']/android.view.View[@index='20']")
	private WebElement titulo_observaciones_p5;
	@FindBy (xpath = "//*[@resource-id='ico-editar-observaciones']")
	private WebElement lapiz_observaciones_p5;
	@FindBy (xpath = "//*[@resource-id='input-observaciones']")
	private WebElement input_observaciones_p5;
	
	@FindBy (xpath = "//*[@resource-id='contenido-vista-general']/android.view.View[@index='0']/android.view.View[@index='24']")
	private WebElement titulo_ped_med_p5;
	@FindBy (xpath = "//*[@resource-id='ico-editar-pedido-medico']")
	private WebElement lapiz_ped_med_p5;
	@FindBy (xpath = "//*[@resource-id='input-pedido-medico']")
	private WebElement input_ped_med_p5;
	
	@FindBy (xpath = "//*[@resource-id='contenido-vista-general']/android.view.View[@index='0']/android.view.View[@index='28']")
	private WebElement titulo_doc_adicional_p5;
	@FindBy (xpath = "//*[@resource-id='ico-editar-documentos-adicionales']")
	private WebElement lapiz_doc_adicional_p5;
	@FindBy (xpath = "//*[@resource-id='input-ocumentos-adicionales']")
	private WebElement input_doc_adicional_p5;
	
	@FindBy (xpath = "//*[@resource-id='contenido-vista-general']/android.view.View[@index='0']/android.view.View[@index='31']")
	private WebElement titulo_email_p5;
	@FindBy (xpath = "//*[@resource-id='ico-editar-email']")
	private WebElement lapiz_email_p5;
	@FindBy (xpath = "//*[@resource-id='input-email']")
	private WebElement input_email_p5;
	
	@FindBy (xpath = "//*[@resource-id='contenido-vista-general']/android.view.View[@index='0']/android.view.View[@index='35']")
	private WebElement titulo_tel_p5;
	@FindBy (xpath = "//*[@resource-id='ico-editar-telefono']")
	private WebElement lapiz_tel_p5;
	@FindBy (xpath = "//*[@resource-id='input-telefono']")
	private WebElement input_tel_p5;
	
	@FindBy (xpath = "//*[@text='GENERAR TRÃ�MITE']")
	private WebElement btn_generar_tramite;
	
	@FindBy (xpath = "//*[@resource-id='socio-3']")
	private WebElement Socio;
	
	@FindBy (xpath = "//*[@resource-id='android:id/button1']")
	private WebElement BtnEstablecerFecha;
	
	@FindBy (xpath = "//*[@resource-id='autorizacionesModuleScreenIframe']")
	private WebElement Panio;
	
	
	
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
			LogMobile.info("Se hizo click en el BotÃ³n Iniciar SesiÃ³n");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el BotÃ³n Iniciar SesiÃ³n");
			e.printStackTrace();
		}
		
	}
	
	public void clickIngresar() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(BtnIngresar));
			BtnIngresar.click();
			BtnIngresar.wait(100000);
			LogMobile.info("Se hizo click en el BotÃ³n Ingresar");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el BotÃ³n Ingresar");
			e.printStackTrace();
		}
		
	}
	
	public void clicContrasenia() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(TxtContrasenia));
			TxtContrasenia.click();
			LogMobile.info("Se hizo click en el Txt contraseÃ±a");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en Txt contraseÃ±a");
			e.printStackTrace();
		}
		
	}
	
	public void clickGestionesOnLine() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnGestionesOnLine));
			btnGestionesOnLine.click();
			LogMobile.info("Se hizo click en el BotÃ³n Gestiones On Line");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el BotÃ³n Gestiones On Line");
			e.printStackTrace();
		}
		
	}
	
	public  Boolean esVisibleBtnGestionesOnLine() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(btnGestionesOnLine));
			esVisible = btnGestionesOnLine.isDisplayed();
			Log.info("Se obtuvo el elemento botÃ³n de Gestiones On Line");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento botÃ³n de Gestiones On Line");
		}
		return esVisible;
	}
	
	public  Boolean esVisibleBtnIniciarSesion() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(btnMenuIniciarSesion));
			esVisible = btnMenuIniciarSesion.isDisplayed();
			Log.info("Se obtuvo el elemento botÃ³n Iniciar SesiÃ³n");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento botÃ³n Iniciar SesiÃ³n");
		}
		return esVisible;
	}
	
	public  Boolean esVisibleTxtDoc() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(TxtDocumento));
			esVisible = TxtDocumento.isDisplayed();
			Log.info("Se obtuvo el elemento clave Nro de documento");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Clave Nro de documento");
		}
		return esVisible;
	}
	
	public  Boolean esVisibleTxtDocGO() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(TxtDocumentoGO));
			esVisible = TxtDocumentoGO.isDisplayed();
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
		//	PaÃ±o.click();
			Log.info("Se ingreso el documento");
		} catch (Exception e) {
			Log.info("Fallo al ingresar el documento");
			e.printStackTrace();
		}
	}
	
	public void ingresardocumentoGO(String doc) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(TxtDocumentoGO));
			TxtDocumentoGO.sendKeys(doc);
		//	PaÃ±o.click();
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
		//	PaÃ±o.click();
			Log.info("Se ingreso la contrasenia");
		} catch (Exception e) {
			Log.info("Fallo al ingresar contrasenia");
			e.printStackTrace();
		}
	}
	
	public void ingresarContraseniaGO(String password) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(TxtContraseniaGO));
		//	TxtContrasenia.click();
			TxtContraseniaGO.sendKeys(password);
			Log.info("Se ingreso la contrasenia");
		} catch (Exception e) {
			Log.info("Fallo al ingresar contrasenia");
			e.printStackTrace();
		}
	}
	
/*	public void clickPanio() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(Panio));
			Panio.click();
			LogMobile.info("Se hizo click en el paÃ±o");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el paÃ±o");
			e.printStackTrace();
		}
	}*/
	
	public void clickPanioGral() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(PanioGral));
			PanioGral.click();
			LogMobile.info("Se hizo click en el paÃ±o General");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el paÃ±o General");
			e.printStackTrace();
		}
	}
	/*
	public String recuperarVersion() {
		String texto = null;
		try {
			texto = labelTxtVersion.getText();
			LogMobile.info("Se recupera texto del elemento");
		} catch (Exception e){
			LogMobile.info("Fallo el recuperar el texto del elemento");
		}
		return texto;
	}
	
	public String recuperarTxtOSDE() {
		String texto = null;
		try {
			texto = labelTxtOSDE.getText();
			LogMobile.info("Se recupera texto del elemento");
		} catch (Exception e){
			LogMobile.info("Fallo el recuperar el texto del elemento");
		}
		return texto;
	}
	*/
	//----------------------
	// Autorizaciones
	//-----------------------
	
	public  Boolean esVisibleBtnAutorizaciones() {
		Boolean esVisible = false;
		try {
			waitFluent.until(ExpectedConditions.visibilityOf(BtnAutorizaciones));
			esVisible = BtnAutorizaciones.isDisplayed();
			Log.info("Se obtuvo el elemento Autorizaciones");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Autorizaciones");
		}
		return esVisible;
	}
	
	public void clickBtnAutorizaciones() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(BtnAutorizaciones));
			BtnAutorizaciones.click();
			LogMobile.info("Se hizo click en BotÃ³n Autorizaciones");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en BotÃ³n Autorizaciones");
			e.printStackTrace();
		}
	}
	
	public  Boolean esVisibleBtnPracticas() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(BtnPracticas));
			esVisible = BtnPracticas.isDisplayed();
			Log.info("Se obtuvo el elemento PrÃ¡cticas");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento PrÃ¡cticas");
		}
		return esVisible;
	}
	
	public void clickBtnPracticas() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(BtnPracticas));
			BtnPracticas.click();
			LogMobile.info("Se hizo click en BotÃ³n PrÃ¡cticas");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en BotÃ³n PrÃ¡cticas");
			e.printStackTrace();
		}
	}
	
	public  Boolean esVisibleBtnTraslados() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(BtnTraslados));
			esVisible = BtnTraslados.isDisplayed();
			Log.info("Se obtuvo el elemento Traslados");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Traslados");
		}
		return esVisible;
	}

	public  Boolean esVisibleBtnInternacion() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(BtnInternacion));
			esVisible = BtnInternacion.isDisplayed();
			Log.info("Se obtuvo el elemento InternaciÃ³n");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento InternaciÃ³n");
		}
		return esVisible;
	}
	
	////Metodos Fer/////
	public Boolean existenOpcionesEnListaAut() {
		Boolean existe = false;
		List<WebElement> lista = null;
		try {
			wait.until(ExpectedConditions.visibilityOf(contenedor_gral));
			lista = contenedor_gral.findElements(By.xpath("//android.view.View/android.view.View"));
			existe = lista.size()>0;
			LogMobile.info("Se obtiene correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Fallo al obtener el elemento");
		}
		return existe;
	}
	public void autorizacion_a_realizar(String autorizacion) {
		List<WebElement> lista = null;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(contenedor_gral));
			lista = contenedor_gral.findElements(By.xpath("//android.view.View/android.view.View"));
			for (WebElement aut : lista) {
				if (aut.getText().equalsIgnoreCase(autorizacion)) {
					aut.click();
					break;
				}
			}
			LogMobile.info("Se obtiene correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Fallo al obtener el elemento");
		}
	}
	public Boolean esVisibleTitulo() {
		Boolean esVisible = false;
		try {
			waitFluent.until(ExpectedConditions.elementToBeClickable(titulo_aut));
			esVisible = titulo_aut.getText().equals("Autorizaciones");
			LogMobile.info("Se obtiene correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Fallo al obtener el elemento");
		}
		return esVisible;
	}
	public Boolean esVisibleSubTitulo() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(subTitulo_aut));
			esVisible = subTitulo_aut.getText().equals("Seleccioná¡ la autorización a realizar");
			LogMobile.info("Se obtiene correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Fallo al obtener el elemento");
		}
		return esVisible;
	}
	//Paso1
	public Boolean autorizacionesDe(String claseAutorizacion) {
		Boolean existe = false;
		try {
			waitFluent.until(ExpectedConditions.visibilityOf(paso1_titulo_parte1));
			existe = paso1_titulo_parte1.getText().equals("Autorizaciones de")
					&& paso1_titulo_parte2.getText().equalsIgnoreCase(claseAutorizacion);
			LogMobile.info("Se obtiene correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Fallo al obtener el elemento");
		}
		return existe;
	}
	public Boolean existeSubtitulo(String subtitulo) {
		Boolean existe = false;
		try {
			existe = paso1_subtitulo.getText().equalsIgnoreCase(subtitulo);
			LogMobile.info("Se obtiene correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Fallo al obtener el elemento");
		}
		return existe;
	}
	public Boolean existeSociosEnLista() {
		Boolean existe = false;
		try {
			List<WebElement> lista = contenedor_gral.findElements(By.xpath("//*[contains(@resource-id,'socio-')]/android.view.View[@index='0']"));
			existe = lista.size()>0;
			LogMobile.info("Se obtiene correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Fallo al obtener el elemento");
		}
		return existe;
	}
	public Boolean existeTermCheckYProteccionDatos() {
		Boolean existe = false;
		try {
			existe = check_terminos.isDisplayed() && link_terminos.isDisplayed() && link_proteccion_datos.isDisplayed();
			LogMobile.info("Se obtienen correctamente los elementos");
		} catch (Exception e) {
			LogMobile.info("Fallo al obtener los elementos");
		}
		return existe;
	}
	public Boolean existeBtnSiguiente() {
		Boolean existe = false;
		try {
			existe = btn_siguiente.isDisplayed();
			LogMobile.info("Se obtiene correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Fallo al obtener el elemento");
		}
		return existe;
	}
	public void seleccionarSocio(String nombre) {
		try {
			List<WebElement> lista = contenedor_gral.findElements(By.xpath("//*[contains(@resource-id,'socio-')]/android.view.View[@index='0']"));
			for (WebElement socio : lista) {
				if (socio.getText().equalsIgnoreCase(nombre)) {
					socio.click();
					break;
				}
			}
			LogMobile.info("Se obtiene correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Fallo al obtener el elemento");
		}
	}
	
	public void clickSocio() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(Socio));
			Socio.click();
			LogMobile.info("Se hizo click en el Familiar");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Familiar");
			e.printStackTrace();
		}
	}
	public void clic_check() {
		try {
			waitFluent.until(ExpectedConditions.elementToBeClickable(check_terminos));
			check_terminos.click();
			LogMobile.info("Se obtiene correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Fallo al obtener el elemento");
		}
	}
	public void clic_boton_siguiente() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btn_siguiente));
			btn_siguiente.click();
			LogMobile.info("Se obtiene correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Fallo al obtener el elemento");
		}
	}
	public void clic_terminos() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(link_terminos));
			link_terminos.click();
			LogMobile.info("Se obtiene correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Fallo al obtener el elemento");
		}
	}
	public Boolean esVisibleTerminos() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(titulo_terminos));
			esVisible = titulo_terminos.getText().equals("TÃ©rminos y condiciones");
			LogMobile.info("Se obtiene correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Fallo al obtener el elemento");
		}
		return esVisible;
	}
	public void clic_cruz_terminos() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(cruz_terminos));
			cruz_terminos.click();
			LogMobile.info("Se obtiene correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Fallo al obtener el elemento");
		}
	}
	public void clic_proteccionDatos() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(link_proteccion_datos));
			link_proteccion_datos.click();
			LogMobile.info("Se obtiene correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Fallo al obtener el elemento");
		}
	}
	public Boolean esVisibleProteccionDatos() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(titulo_terminos));
			esVisible = titulo_terminos.getText().equals("PROTECCIÃ“N DE LOS DATOS PERSONALES");
			LogMobile.info("Se obtiene correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Fallo al obtener el elemento");
		}
		return esVisible;
	}
	public void clic_cruz_proteccion() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(cruz_proteccion));
			cruz_proteccion.click();
			LogMobile.info("Se obtiene correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Fallo al obtener el elemento");
		}
	}
	
	public Boolean apareceAvisoTerminos() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(aviso_popup_terminos));
			esVisible = aviso_popup_terminos.isDisplayed();
			LogMobile.info("Se obtiene correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Fallo al obtener el elemento");
		}
		return esVisible;
	}
	public Boolean apareceBtnAceptarTerminos() {
		Boolean esVisible = false;
		try {
			esVisible = btn_aceptar_terminos_popup.isDisplayed();
			LogMobile.info("Se obtiene correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Fallo al obtener el elemento");
		}
		return esVisible;
	}
	public void clicBtnAceptarTerminos() {
		try {
			btn_aceptar_terminos_popup.click();
			LogMobile.info("Se obtiene correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Fallo al obtener el elemento");
		}
	}
	
	//Paso2
	public Boolean existeTitulosDeCamposPaso2() {
		Boolean existen = false;
		try {
			existen = titulo_fecha_realizacion.getText().equals("Fecha de realización (*)")
					&& titulo_institucion_sanatorio.getText().equals("Institución / Sanatorio")
					&& titulo_profesional_efectua.getText().equals("Profesional que lo efectúa")
					&& titulo_observaciones.getText().equals("Observaciones")
					&& titulo_datos_obligatorios.getText().equals("Datos obligatorios (*)");
			LogMobile.info("Se obtiene correctamente los elementos");
		} catch (Exception e) {
			LogMobile.info("Fallo al obtener los elementos");
		}
		return existen;
	}
	public Boolean esVisibleBtnSiguientePaso2() {
		Boolean esVisible=false;
		try {
			esVisible = btn_siguiente_paso2.isDisplayed();
			LogMobile.info("Se obtiene correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Fallo al obtener el elemento");
		}
		return esVisible;
	}
	public void clic_fecha() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(input_fecha_realizacion));
			input_fecha_realizacion.click();
			LogMobile.info("Se obtiene correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Fallo al obtener el elemento");
		}
	}
	public void set_sanatorio_institucion(String sanatorio) {
		try {
			input_institucion_sanatorio.click();
			input_institucion_sanatorio.sendKeys(sanatorio);
			LogMobile.info("Se obtiene correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Fallo al obtener el elemento");
		}
	} 
	public void set_profesional(String profesional) {
		try {
			input_profesional_efectua.click();
			input_profesional_efectua.sendKeys(profesional);
			LogMobile.info("Se obtiene correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Fallo al obtener el elemento");
		}
	}
	public void set_observaciones(String observaciones) {
		try {
			input_observaciones.click();
			input_observaciones.sendKeys(observaciones);
			LogMobile.info("Se obtiene correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Fallo al obtener el elemento");
		}
	}
	public void clic_siguiente_paso2() {
		try {
			btn_siguiente_paso2.click();
			LogMobile.info("Se obtiene correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Fallo al obtener el elemento");
		}		
	}
	public Boolean esVisiblePopUpPaso2() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOfAllElements(titulo_popup));
			esVisible = titulo_popup.getText().equals("Aviso")
					&& contenido_popup.getText().equals("La gestiÃ³n de tu autorizaciÃ³n demora 72 horas hÃ¡biles. En caso de que la requieras con anticipaciÃ³n, llamanos al 0810-555-6733 o concurrÃ­ al Centro de AtenciÃ³n Personalizada mÃ¡s cercano")
					&& btn_volver_popup.isDisplayed()
					&& btn_continuar_popup.isDisplayed();
			LogMobile.info("Se obtiene correctamente los elementos");
		} catch (Exception e) {
			LogMobile.info("Fallo al obtener los elementos");
		}
		return esVisible;
	}
	public void clic_continuar_popup() {
		try {
			btn_continuar_popup.click();
			LogMobile.info("Se obtiene correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Fallo al obtener el elemento");
		}
	}
	public void clic_volver_popup() {
		try {
			btn_volver_popup.click();
			LogMobile.info("Se obtiene correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Fallo al obtener el elemento");
		}
	}
	public Boolean existeTitulosDeCamposPaso3() {
		Boolean existen = false;
		try {
			existen = titulo_pedido_medico.getText().equals("Pedido mÃ©dico (*)")
					&& input_adjuntar.isDisplayed()
					&& btn_doc_adicional.isDisplayed();
			LogMobile.info("Se obtiene correctamente los elementos");
		} catch (Exception e) {
			LogMobile.info("Fallo al obtener los elementos");
		}
		return existen;
	}
	public Boolean esVisibleBtnSiguiente() {
		Boolean esVisible=false;
		try {
			esVisible = btn_siguiente_paso3.isDisplayed();
			LogMobile.info("Se obtiene correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Fallo al obtener el elemento");
		}
		return esVisible;
	}
	public void click_adjuntar() {
		try {
			btn_adjuntar.click();
			LogMobile.info("Se obtiene correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Fallo al obtener el elemento");
		}
	}
	public Boolean nombreArchivoAdjunto(String nombreArch) {
		Boolean esCorrecto = false;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(input_adjuntar));
			esCorrecto = input_adjuntar.getText().equalsIgnoreCase(nombreArch);
			LogMobile.info("Se obtiene correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Fallo al obtener el elemento");
		}
		return esCorrecto;
	}
	public Boolean noHayArchivoAdjunto() {
		Boolean esCorrecto = false;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(input_adjuntar));
			esCorrecto = input_adjuntar.getText().isEmpty();
			LogMobile.info("Se obtiene correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Fallo al obtener el elemento");
		}
		return esCorrecto;
	}
	public void click_camara() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btn_camera));
			btn_camera.click();
			LogMobile.info("Se hace click en camara");
		} catch (Exception e) {
			LogMobile.info("Fallo al hacer click en camara");
			e.printStackTrace();
		}
	}
	public void clic_siguiente() {
		try {
			waitFluent.until(ExpectedConditions.elementToBeClickable(btn_siguiente_paso3));
			btn_siguiente_paso3.click();
			LogMobile.info("Se obtiene correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Fallo al obtener el elemento");
		}		
	}
	public Boolean seEncuentranBorrarYLupa() {
		Boolean esCorrecto = false;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(icono_basura));
			esCorrecto = icono_basura.isDisplayed() && icono_lupa.isDisplayed();
			LogMobile.info("Se obtiene correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Fallo al obtener el elemento");
		}
		return esCorrecto;
	}
	public void clic_borrar() {
		try {
			icono_basura.click();
			LogMobile.info("Se obtiene correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Fallo al obtener el elemento");
		}
	}
	public void clic_lupa() {
		try {
			icono_lupa.click();
			LogMobile.info("Se obtiene correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Fallo al obtener el elemento");
		}
	}
	public Boolean existeImagenPrevisualizada() {
		Boolean esCorrecto = false;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(imagen_previsualizada));
			esCorrecto = imagen_previsualizada.isDisplayed();
			LogMobile.info("Se obtiene correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Fallo al obtener el elemento");
		}
		return esCorrecto;
	}
	public Boolean esVisibleBtnAceptarPrev() {
		Boolean esCorrecto = false;
		try {
			esCorrecto = btn_aceptar_prev.isDisplayed();
			LogMobile.info("Se obtiene correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Fallo al obtener el elemento");
		}
		return esCorrecto;
	}
	public void clic_aceptarPrev() {
		try {
			btn_aceptar_prev.click();
			LogMobile.info("Se obtiene correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Fallo al obtener el elemento");
		}
	}
	
	//paso4
	public Boolean existeTitulosDeCamposPaso4() {
		Boolean existen = false;
		try {
			existen = titulo_email.getText().equals("Email (*)")
					&& titulo_tel.getText().equals("TelÃ©fono (*)")
					&& info_paso4.getText().equals("TenÃ© en cuenta que los datos ingresados no modifican tu informaciÃ³n de contacto existente en OSDE.");
			LogMobile.info("Se obtiene correctamente los elementos");
		} catch (Exception e) {
			LogMobile.info("Fallo al obtener los elementos");
		}
		return existen;
	}
	public void set_email(String email) {
		try {
			input_email.click();
			input_email.sendKeys(email);
			LogMobile.info("Se obtiene correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Fallo al obtener el elemento");
		}
	}
	public void set_telefono(String tel) {
		try {
			input_tel.click();
			input_tel.sendKeys(tel);
			LogMobile.info("Se obtiene correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Fallo al obtener el elemento");
		}
	}
	
	//paso5
	public Boolean existeTitulosDeCamposPaso5() {
		Boolean existen = false;
		try {
			existen = titulo_integrante_grupo_p5.getText().equals("Integrante del grupo familiar")
					&& lapiz_integrante_grupo_p5.isDisplayed()
					&& titulo_fecha_realizacion_p5.getText().equals("Fecha de realizaciÃ³n")
					&& lapiz_fecha_realizacion_p5.isDisplayed()
					&& titulo_inst_sanatorio_p5.getText().equals("InstituciÃ³n / Sanatorio")
					&& lapiz_inst_sanatorio_p5.isDisplayed()
					&& titulo_prof_que_realiza_p5.getText().equals("Profesional que lo realiza")
					&& lapiz_prof_que_realiza_p5.isDisplayed()
					&& titulo_observaciones_p5.getText().equals("Observaciones")
					&& lapiz_observaciones_p5.isDisplayed()
					&& titulo_ped_med_p5.getText().equals("Pedido MÃ©dico")
					&& lapiz_ped_med_p5.isDisplayed()
					&& titulo_doc_adicional_p5.getText().equals("Documentos Adicionales")
					&& lapiz_doc_adicional_p5.isDisplayed()
					&& titulo_email_p5.getText().equals("Email")
					&& lapiz_email_p5.isDisplayed()
					&& titulo_tel_p5.getText().equals("TelÃ©fono")
					&& lapiz_tel_p5.isDisplayed();
			LogMobile.info("Se obtiene correctamente los elementos");
		} catch (Exception e) {
			LogMobile.info("Fallo al obtener los elementos");
		}
		return existen;
	}
	public Boolean esVisibleBtnGenerar() {
		Boolean esVisible=false;
		try {
			esVisible = btn_generar_tramite.isDisplayed();
			LogMobile.info("Se obtiene correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Fallo al obtener el elemento");
		}
		return esVisible;
	}
	public void clic_generar_tramite() {
		try {
			btn_generar_tramite.click();
			LogMobile.info("Se obtiene correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Fallo al obtener el elemento");
		}
	}
	public Boolean verificaIntegranteFinal(String integrante) {
		Boolean verif = false;
		try {
			verif = input_integrante_grupo_p5.getText().equalsIgnoreCase(integrante);
			LogMobile.info("Se obtiene correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Fallo al obtener el elemento");
		}
		return verif;
	}
	public Boolean verificaFechaFinal(String fecha) {
		Boolean verif = false;
		try {
			verif = input_fecha_realizacion_p5.getText().equalsIgnoreCase(fecha);
			LogMobile.info("Se obtiene correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Fallo al obtener el elemento");
		}
		return verif;
	}
	public Boolean verificaInstSanatFinal(String institucion) {
		Boolean verif = false;
		try {
			verif = input_inst_sanatorio_p5.getText().equalsIgnoreCase(institucion);
			LogMobile.info("Se obtiene correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Fallo al obtener el elemento");
		}
		return verif;
	}
	public Boolean verificaProfesionalFinal(String prof) {
		Boolean verif = false;
		try {
			verif = input_prof_que_realiza_p5.getText().equalsIgnoreCase(prof);
			LogMobile.info("Se obtiene correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Fallo al obtener el elemento");
		}
		return verif;
	}
	public Boolean verificaObservacionesFinal(String observaciones) {
		Boolean verif = false;
		try {
			verif = input_observaciones_p5.getText().equalsIgnoreCase(observaciones);
			LogMobile.info("Se obtiene correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Fallo al obtener el elemento");
		}
		return verif;
	}
	public Boolean verificaPedMedicoFinal(String ped) {
		Boolean verif = false;
		try {
			verif = input_ped_med_p5.getText().equalsIgnoreCase(ped);
			LogMobile.info("Se obtiene correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Fallo al obtener el elemento");
		}
		return verif;
	}
	public Boolean existeDocAdicionalFinal() {
		Boolean existe = false;
		try {
			existe = input_doc_adicional_p5.isDisplayed();
			LogMobile.info("Se obtiene correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Fallo al obtener el elemento");
		}
		return existe;
	}
	public Boolean verificaEmailFinal(String mail) {
		Boolean verif = false;
		try {
			verif = input_email_p5.getText().equalsIgnoreCase(mail);
			LogMobile.info("Se obtiene correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Fallo al obtener el elemento");
		}
		return verif;
	}
	public Boolean verificaTelFinal(String tel) {
		Boolean verif = false;
		try {
			verif = input_tel_p5.getText().equalsIgnoreCase(tel);
			LogMobile.info("Se obtiene correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Fallo al obtener el elemento");
		}
		return verif;
	}
	
	public void clickEstablecerFecha() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(BtnEstablecerFecha));
			BtnEstablecerFecha.click();
			LogMobile.info("Se hizo click en Establecer Fecha");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en Establecer Fecha");
			e.printStackTrace();
		}
	}
	
	public void ingresarTxtBuscar_S(String TextoBuscar) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(input_institucion_sanatorio));
			input_institucion_sanatorio.sendKeys(TextoBuscar);
			Log.info("Se ingreso el Texto");
		} catch (Exception e) {
			Log.info("Fallo al ingresar el Texto");
			e.printStackTrace();
		}
	}
	
	public void ingresarTxtBuscar_P(String TextoBuscar) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(input_profesional_efectua));
			input_profesional_efectua.sendKeys(TextoBuscar);
			Log.info("Se ingreso el Texto");
		} catch (Exception e) {
			Log.info("Fallo al ingresar el Texto");
			e.printStackTrace();
		}
	}
	
	public void ingresarTxtBuscar_Obs(String TextoBuscar) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(input_observaciones));
			input_observaciones.sendKeys(TextoBuscar);
			Log.info("Se ingreso el Texto");
		} catch (Exception e) {
			Log.info("Fallo al ingresar el Texto");
			e.printStackTrace();
		}
	}
	
	public void clickPanio() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(Panio));
			Panio.click();
			LogMobile.info("Se hizo click en el panio General");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el panio General");
			e.printStackTrace();
		}
	}
}
