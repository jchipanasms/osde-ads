package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.BasePageMobile;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import static java.time.Duration.ofMillis;

import java.util.List;

import io.appium.java_client.touch.offset.PointOption;
import log.LogMobile;

public class ReintegrosPage extends BasePageMobile {
	
	//Elementos del paso 1	
	@FindBy (xpath = "//android.widget.ListView")
	private WebElement lista_generica;

	@FindBy (xpath = "//*[@resource-id='id-seleccione-tipopractica']")
	private WebElement input_tipo_practica;
	
	@FindBy (xpath = "//*[@resource-id='id-seleccione-integrante']")
	private WebElement input_integrante;
	
	@FindBy (xpath = "//*[@resource-id='id-terminos']")
	private WebElement link_terminos;
	
	@FindBy (xpath = "//*[@resource-id='reintegrosModuleScreenIframe']/android.view.View/android.view.View/android.view.View[@index='2']/android.view.View[@index='0']")
	private WebElement titulo_terminos_y_proteccion;	//este xpath funciona para ambos titulos
	
	@FindBy (xpath = "//*[@resource-id='reintegrosModuleScreenIframe']/android.view.View/android.view.View/android.view.View[@index='2']/android.view.View[@index='2']/android.widget.Button")
	private WebElement btn_cruz_cerrar;
	
	@FindBy (xpath = "//*[@resource-id='id-proteccion']")
	private WebElement link_proteccion;
	
	@FindBy (xpath = "//*[@resource-id='id-continuar']")
	private WebElement btn_continuar;
	
	@FindBy (xpath = "//*[@resource-id='contenido-vista-general']/android.view.View/android.view.View/android.view.View/android.view.View[@index='1']/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[@index='0']")
	private WebElement titulo_paso1;
	@FindBy (xpath = "//*[@resource-id='contenido-vista-general']/android.view.View/android.view.View/android.view.View/android.view.View[@index='1']/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[@index='2']")
	private WebElement primerParrafo_paso1;
	@FindBy (xpath = "//*[@resource-id='contenido-vista-general']/android.view.View/android.view.View/android.view.View/android.view.View[@index='1']/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[@index='3']")
	private WebElement segundoParrafo_paso1;
	@FindBy (xpath = "//*[@resource-id='contenido-vista-general']/android.view.View/android.view.View/android.view.View/android.view.View[@index='1']/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[@index='5']")
	private WebElement titulo_paso1_datos_prestacion;
	@FindBy (xpath = "//*[@resource-id='contenido-vista-general']/android.view.View/android.view.View/android.view.View/android.view.View[@index='1']/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[@index='6']")
	private WebElement titulo_paso1_tipo_practica;
	@FindBy (xpath = "//*[@resource-id='contenido-vista-general']/android.view.View/android.view.View/android.view.View/android.view.View[@index='1']/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[@index='9']")
	private WebElement titulo_paso1_integrante;	//tambien es el xpath cuando se visualizan los mensajes de error
	@FindBy (xpath = "//*[@resource-id='contenido-vista-general']/android.view.View/android.view.View/android.view.View/android.view.View[@index='1']/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[@index='12']")
	private WebElement msje_error_2;
	
	//Elementos del paso 2
	@FindBy (xpath = "//*[@resource-id='cuit']")
	private WebElement input_cuit;
	
	@FindBy (xpath = "//*[@resource-id='id-seleccione-facturado']")
	private WebElement input_facturado_a;
	
	@FindBy (xpath = "//*[@resource-id='id-seleccione-tipo-documento']")
	private WebElement input_tipo_doc_receptor;
	
	@FindBy (xpath = "//*[@resource-id='documentoReceptor']")
	private WebElement input_doc_receptor;
	
	@FindBy (xpath = "//*[@resource-id='id-tipo-comprobante']/android.view.View")
	private WebElement input_tipo_comprobante;
	
	@FindBy (xpath = "//*[@resource-id='nroComprobantePrefijo']")
	private WebElement input_pto_venta;
	
	@FindBy (xpath = "//*[@resource-id='nroComprobante']")
	private WebElement input_nro_comprobante;
	
	@FindBy (xpath = "//*[@resource-id='idate']")
	private WebElement input_fecha_emision;
	
	@FindBy (xpath = "//*[@resource-id='CAE']")
	private WebElement input_cod_cae;
	
	@FindBy (xpath = "//*[@resource-id='caeVencimientoDate']")
	private WebElement input_fecha_vencimiento_cae;
	
	@FindBy (xpath = "//*[@resource-id='importe']")
	private WebElement input_importe_total;
	
	@FindBy (xpath = "//*[@resource-id='id-adjuntar']/android.view.View")
	private WebElement input_adjuntar_comprobante;
	
	@FindBy (xpath = "//*[@resource-id='camera']")
	private WebElement btn_camera;
	
	@FindBy (xpath = "//android.widget.EditText[@resource-id='email']")
	private WebElement input_email;
	
	@FindBy (xpath = "//*[@resource-id='id-generar-tramite']")
	private WebElement btn_generar_tramite;
	
	@FindBy (xpath = "//*[@resource-id='contenido-vista-general']/android.view.View/android.view.View/android.view.View/android.view.View[@index='1']/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[@index='0']")
	private WebElement paso2_titulo_reintegros;
	@FindBy (xpath = "//*[@resource-id='contenido-vista-general']/android.view.View/android.view.View/android.view.View/android.view.View[@index='1']/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[@index='2']")
	private WebElement paso2_titulo_datos_factura;
	@FindBy (xpath = "//*[@resource-id='contenido-vista-general']/android.view.View/android.view.View/android.view.View/android.view.View[@index='1']/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[@index='3']")
	private WebElement paso2_primera_oracion;
	@FindBy (xpath = "//*[@resource-id='contenido-vista-general']/android.view.View/android.view.View/android.view.View/android.view.View[@index='1']/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[@index='5']")
	private WebElement paso2_segunda_oracion;
	@FindBy (xpath = "//*[@resource-id='contenido-vista-general']/android.view.View/android.view.View/android.view.View/android.view.View[@index='1']/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[@index='8']/android.view.View")
	private WebElement paso2_titulo_facturado_a;
	@FindBy (xpath = "//*[@resource-id='contenido-vista-general']/android.view.View/android.view.View/android.view.View/android.view.View[@index='1']/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[@index='11']")
	private WebElement paso2_titulo_tipo_doc_rec;	//tambien funciona como xpath para msje_error2
	@FindBy (xpath = "//*[@resource-id='contenido-vista-general']/android.view.View/android.view.View/android.view.View/android.view.View[@index='1']/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[@index='14']")
	private WebElement paso2_titulo_nro_doc_rec;
	@FindBy (xpath = "//*[@resource-id='contenido-vista-general']/android.view.View/android.view.View/android.view.View/android.view.View[@index='1']/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[@index='17']")
	private WebElement paso2_titulo_detalles_comprobante;
	@FindBy (xpath = "//*[@resource-id='contenido-vista-general']/android.view.View/android.view.View/android.view.View/android.view.View[@index='1']/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[@index='24']")
	private WebElement paso2_titulo_codigo_cae;
	@FindBy (xpath = "//*[@resource-id='contenido-vista-general']/android.view.View/android.view.View/android.view.View/android.view.View[@index='1']/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[@index='29']")
	private WebElement paso2_titulo_importe_total;
	@FindBy (xpath = "//*[@resource-id='contenido-vista-general']/android.view.View/android.view.View/android.view.View/android.view.View[@index='1']/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[@index='33']")
	private WebElement paso2_titulo_adjuntar_comprobante;	//tambien funciona como xpath para msje_error6
	@FindBy (xpath = "//*[@resource-id='contenido-vista-general']/android.view.View/android.view.View/android.view.View/android.view.View[@index='1']/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[@index='35']")
	private WebElement paso2_titulo_email_contacto;	//tambien funciona como xpath para msje_error7
	@FindBy (xpath = "//*[@resource-id='contenido-vista-general']/android.view.View/android.view.View/android.view.View/android.view.View[@index='1']/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[@index='36']/android.view.View[@index='0']")
	private WebElement paso2_titulo_sera_enviado_a;
	@FindBy (xpath = "//*[@resource-id='contenido-vista-general']/android.view.View/android.view.View/android.view.View/android.view.View[@index='1']/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[@index='8']")
	private WebElement paso2_msje_error1;
	@FindBy (xpath = "//*[@resource-id='contenido-vista-general']/android.view.View/android.view.View/android.view.View/android.view.View[@index='1']/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[@index='22']")
	private WebElement paso2_msje_error3;
	@FindBy (xpath = "//*[@resource-id='contenido-vista-general']/android.view.View/android.view.View/android.view.View/android.view.View[@index='1']/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[@index='26']")
	private WebElement paso2_msje_error4;
	@FindBy (xpath = "//*[@resource-id='contenido-vista-general']/android.view.View/android.view.View/android.view.View/android.view.View[@index='1']/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[@index='28']")
	private WebElement paso2_msje_error5;
	@FindBy (xpath = "//*[@resource-id='contenido-vista-general']/android.view.View/android.view.View/android.view.View/android.view.View[@index='1']/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[@index='40']")
	private WebElement paso2_msje_error8;
	@FindBy (xpath = "//*[@resource-id='contenido-vista-general']/android.view.View/android.view.View/android.view.View/android.view.View[@index='1']/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[@index='43']")
	private WebElement paso2_msje_error9;
	
	//Elementos del calendario
	@FindBy (xpath = "//android.widget.LinearLayout[@resource-id='android:id/day']/android.widget.EditText[@resource-id='android:id/numberpicker_input']")
	private WebElement input_dia;
	@FindBy (xpath = "//android.widget.LinearLayout[@resource-id='android:id/month']/android.widget.EditText[@resource-id='android:id/numberpicker_input']")
	private WebElement input_mes;
	@FindBy (xpath = "//android.widget.LinearLayout[@resource-id='android:id/month']/android.widget.ImageButton[@resource-id='android:id/decrement']")
	private WebElement btn_mes_menos;
	@FindBy (xpath = "//android.widget.LinearLayout[@resource-id='android:id/month']/android.widget.ImageButton[@resource-id='android:id/increment']")
	private WebElement btn_mes_mas;	
	@FindBy (xpath = "//android.widget.LinearLayout[@resource-id='android:id/year']/android.widget.EditText[@resource-id='android:id/numberpicker_input']")
	private WebElement input_anio;
	@FindBy (xpath = "//android.widget.LinearLayout[@resource-id='android:id/buttonPanel']/android.widget.LinearLayout/android.widget.Button[@resource-id='android:id/button1']")
	private WebElement btn_establecer;
	
	
	public void click_terminos() {
		try {
			waitFluent.until(ExpectedConditions.elementToBeClickable(link_terminos));
			link_terminos.click();
			LogMobile.info("Se pudo hacer click en terminos");
		} catch (Exception e) {
			LogMobile.info("Fallo al hacer click en terminos");
		}
	}
	
	public void click_proteccionDatos() {
		try {
			waitFluent.until(ExpectedConditions.elementToBeClickable(link_proteccion));
			link_proteccion.click();
			LogMobile.info("Se pudo hacer click en proteccion");
		} catch (Exception e) {
			LogMobile.info("Fallo al hacer click en proteccion");
		}
	}
	
	public Boolean visualizaTituloTerminos() {
		Boolean visualiza = false;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(titulo_terminos_y_proteccion));
			visualiza = titulo_terminos_y_proteccion.getText().equals("TÉRMINOS Y CONDICIONES");
			LogMobile.info("Se pudo comprobar el titulo de terminos");
		} catch (Exception e) {
			LogMobile.info("Fallo al comprobar el titulo de terminos");
		}
		return visualiza;
	}
	
	public Boolean visualizaTituloProteccion() {
		Boolean visualiza = false;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(titulo_terminos_y_proteccion));
			visualiza = titulo_terminos_y_proteccion.getText().equals("PROTECCIÓN DE LOS DATOS PERSONALES");
			LogMobile.info("Se pudo comprobar el titulo de proteccion");
		} catch (Exception e) {
			LogMobile.info("Fallo al comprobar el titulo de proteccion");
		}
		return visualiza;
	}
	
	public void click_cruz() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btn_cruz_cerrar));
			btn_cruz_cerrar.click();;
			LogMobile.info("Se hizo clic en el boton cruz");
		} catch (Exception e) {
			LogMobile.info("Fallo al hacer clic en el boton cruz");
		}
	}
	
	public Boolean verificaElTextoPaso1() {
		Boolean verifica = false;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(titulo_paso1));
			verifica = titulo_paso1.getText().equals("Reintegros online") 
					&& primerParrafo_paso1.getText().equals("A través de este trámite podés solicitar un reintegro de un profesional de la salud que emita factura electrónica para determinadas prácticas.") 
					&& segundoParrafo_paso1.getText().equals("Cuenta de acreditación automática de reintegros - CBU") 
					&& titulo_paso1_datos_prestacion.getText().equals("Datos de la prestación") 
					&& titulo_paso1_tipo_practica.getText().equals("Tipo de práctica") 
					&& titulo_paso1_integrante.getText().equals("Integrante del grupo familiar que recibió la atención");
			LogMobile.info("Se pudo comprobar el contenido textual del paso 1");
		} catch (Exception e) {
			LogMobile.info("Fallo al comprobar el contenido textual del paso 1");
		}
		return verifica;
	}
	
	public Boolean verificaMsjesErrorPaso1() {
		Boolean verifica = false;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(titulo_paso1_integrante));
			verifica = titulo_paso1_integrante.getText().equals("Este campo no puede quedar en blanco.") 
					&& msje_error_2.getText().equals("Este campo no puede quedar en blanco.");
			LogMobile.info("Se pudo comprobar el contenido de los mensajes de error");
		} catch (Exception e) {
			LogMobile.info("Fallo al comprobar el contenido de los mensajes de error");
		}
		return verifica;
	}
	
	public Boolean verificaElTextoPaso2() {
		Boolean verifica = false;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(paso2_titulo_reintegros));
			verifica = paso2_titulo_reintegros.getText().equals("Reintegros online") 
					&& paso2_titulo_datos_factura.getText().equals("Datos de la factura electrónica") 
					&& paso2_primera_oracion.getText().equals("Es requisito que en la factura figure la matrícula y la especialidad del efector.") 
					&& paso2_segunda_oracion.getText().equals("Profesional de la salud que realizó la práctica") 
					&& paso2_titulo_facturado_a.getText().equals("Facturado a") 
					&& paso2_titulo_tipo_doc_rec.getText().equals("Tipo de documento del receptor") 
					&& paso2_titulo_nro_doc_rec.getText().equals("Nº de documento del receptor") 
					&& paso2_titulo_detalles_comprobante.getText().equals("Detalles del comprobante") 
					&& paso2_titulo_codigo_cae.getText().equals("Código de autorización (CAE)") 
					&& paso2_titulo_importe_total.getText().equals("Importe total") 
					&& paso2_titulo_adjuntar_comprobante.getText().equals("Adjuntar comprobante") 
					&& paso2_titulo_email_contacto.getText().equals("Email de contacto") 
					&& paso2_titulo_sera_enviado_a.getText().equals("La documentación será enviada a:");
			LogMobile.info("Se pudo comprobar el contenido textual del paso 1");
		} catch (Exception e) {
			LogMobile.info("Fallo al comprobar el contenido textual del paso 1");
		}
		return verifica;
	}

	public Boolean verificaMsjesErrorPaso2() {
		Boolean verifica = false;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(paso2_msje_error1));
			verifica = paso2_msje_error1.getText().equals("Este campo no puede quedar en blanco.") 
					&& paso2_titulo_tipo_doc_rec.getText().equals("Este campo no puede quedar en blanco.")
					&& paso2_msje_error3.getText().equals("Este campo no puede quedar en blanco.")
					&& paso2_msje_error4.getText().equals("Este campo no puede quedar en blanco.")
					&& paso2_msje_error5.getText().equals("Este campo no puede quedar en blanco.")
					&& paso2_titulo_adjuntar_comprobante.getText().equals("Este campo no puede quedar en blanco.")
					&& paso2_titulo_email_contacto.getText().equals("Este campo no puede quedar en blanco.")
					&& paso2_msje_error8.getText().equals("Este campo no puede quedar en blanco.")
					&& paso2_msje_error9.getText().equals("Este campo no puede quedar en blanco.");
			LogMobile.info("Se pudo comprobar el contenido de los mensajes de error");
		} catch (Exception e) {
			LogMobile.info("Fallo al comprobar el contenido de los mensajes de error");
		}
		return verifica;
	}
	
	public Boolean estasEnPaso1() {
		Boolean estas = false;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(input_tipo_practica));
			estas = input_tipo_practica.isDisplayed();
			LogMobile.info("Se pudo comprobar que estas en el paso 1");
		} catch (Exception e) {
			LogMobile.info("Fallo al comprobar que estas en el paso 1");
		}
		return estas;
	}
	
	public Boolean estasEnPaso2() {
		Boolean estas = false;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(input_cuit));
			estas = input_cuit.isDisplayed();
			LogMobile.info("Se pudo comprobar que estas en el paso 2");
		} catch (Exception e) {
			LogMobile.info("Fallo al comprobar que estas en el paso 2");
		}
		return estas;
	}
	
	public Boolean verificaTextoAdjuntar(String texto) {
		Boolean verifica = false;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(input_adjuntar_comprobante));
			verifica = input_adjuntar_comprobante.getText().equalsIgnoreCase(texto);
			LogMobile.info("Se pudo comprobar que verifica el texto");
		} catch (Exception e) {
			LogMobile.info("Fallo al comprobar el texto que verifica");
		}
		return verifica;
	}
	
	public List<WebElement> lista_contenedor() {
		List<WebElement> registros = null;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(lista_generica));
			registros = lista_generica.findElements(By.xpath("//android.view.View/android.view.View/android.view.View"));
			LogMobile.info("Se genero la lista con datos del contenedor");
		} catch (Exception e) {
			LogMobile.info("Fallo al generar la lista con datos del contenedor");
		}
		return registros;
	}
	
	public void seleccionar_opcion(String opcion) {
		try {
			String dato_casteado = null;
			for (WebElement dato : lista_contenedor()) {
				dato_casteado = dato.getText();
				if (dato_casteado.equalsIgnoreCase(opcion)) {
					dato.click();
					break;
				}
			}
			LogMobile.info("Se selecciono correctamente la opcion");
		} catch (Exception e) {
			LogMobile.info("Fallo al seleccionar o encontrar la opcion deseada");
		}
	}
	
	public void seleccionar_tipo_practica(String tipo) {
		try {
			waitFluent.until(ExpectedConditions.elementToBeClickable(input_tipo_practica));
			input_tipo_practica.click();
			seleccionar_opcion(tipo);
			LogMobile.info("Se hizo click en el campo "+tipo);
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el campo "+tipo);
			e.printStackTrace();
		}
	}
	
	public void seleccionar_paciente(String paciente) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(input_integrante));
			input_integrante.click();
			seleccionar_opcion(paciente);
			LogMobile.info("Se hizo click en el campo "+paciente);
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el campo "+paciente);
			e.printStackTrace();
		}
	}
	
	public void click_continuar() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btn_continuar));
			btn_continuar.click();
			LogMobile.info("Se hizo click en continuar");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en continuar");
			e.printStackTrace();
		}
	}
	
	public void ingresar_cuit(String valor) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(input_cuit));
			input_cuit.click();
			input_cuit.sendKeys(valor);
			LogMobile.info("Se ingreso el dato "+valor);
		} catch (Exception e) {
			LogMobile.info("Fallo al ingresar el dato "+valor);
			e.printStackTrace();
		}
	}
	public void ingresar_facturado_a(String valor) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(input_facturado_a));
			input_facturado_a.click();
			seleccionar_opcion(valor);
			LogMobile.info("Se ingreso el dato "+valor);
		} catch (Exception e) {
			LogMobile.info("Fallo al ingresar el dato "+valor);
			e.printStackTrace();
		}
	}
	public void ingresar_tipo_doc_receptor(String valor) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(input_tipo_doc_receptor));
			input_tipo_doc_receptor.click();
			seleccionar_opcion(valor);
			LogMobile.info("Se ingreso el dato "+valor);
		} catch (Exception e) {
			LogMobile.info("Fallo al ingresar el dato "+valor);
			e.printStackTrace();
		}
	}
	public void ingresar_doc_receptor(String valor) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(input_doc_receptor));
			input_doc_receptor.click();
			input_doc_receptor.sendKeys(valor);
			LogMobile.info("Se ingreso el dato "+valor);
		} catch (Exception e) {
			LogMobile.info("Fallo al ingresar el dato "+valor);
			e.printStackTrace();
		}
	}
	public void ingresar_tipo_comprobante(String valor) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(input_tipo_comprobante));
			input_tipo_comprobante.click();
			seleccionar_opcion(valor);
			LogMobile.info("Se ingreso el dato "+valor);
		} catch (Exception e) {
			LogMobile.info("Fallo al ingresar el dato "+valor);
			e.printStackTrace();
		}
	}
	public void ingresar_pto_venta(String valor) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(input_pto_venta));
			input_pto_venta.click();
			input_pto_venta.sendKeys(valor);
			LogMobile.info("Se ingreso el dato "+valor);
		} catch (Exception e) {
			LogMobile.info("Fallo al ingresar el dato "+valor);
			e.printStackTrace();
		}
	}
	public void ingresar_nro_comprobante(String valor) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(input_nro_comprobante));
			input_nro_comprobante.click();
			input_nro_comprobante.sendKeys(valor);
			LogMobile.info("Se ingreso el dato "+valor);
		} catch (Exception e) {
			LogMobile.info("Fallo al ingresar el dato "+valor);
			e.printStackTrace();
		}
	}
	public void ingresar_fecha_emision(String dia, String mes, String anio) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(input_fecha_emision));
			input_fecha_emision.click();
			setFecha(dia, mes, anio);
			LogMobile.info("Se pudo obtener el input de fecha");
		} catch (Exception e) {
			LogMobile.info("Fallo al obtener el input de fecha");
			e.printStackTrace();
		}
	}
	public void ingresar_cod_cae(String valor) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(input_cod_cae));
			input_cod_cae.click();
			input_cod_cae.sendKeys(valor);
			LogMobile.info("Se ingreso el dato "+valor);
		} catch (Exception e) {
			LogMobile.info("Fallo al ingresar el dato "+valor);
			e.printStackTrace();
		}
	}
	public void ingresar_vencimiento_cae(String dia, String mes, String anio) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(input_fecha_vencimiento_cae));
			input_fecha_vencimiento_cae.click();
			setFecha(dia, mes, anio);
			LogMobile.info("Se pudo obtener el input de fecha");
		} catch (Exception e) {
			LogMobile.info("Fallo al obtener el input de fecha");
			e.printStackTrace();
		}
	}
	public void ingresar_importe(String valor) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(input_importe_total));
			input_importe_total.clear();
			input_importe_total.click();
			input_importe_total.sendKeys(valor);
			LogMobile.info("Se ingreso el dato "+valor);
		} catch (Exception e) {
			LogMobile.info("Fallo al ingresar el dato "+valor);
			e.printStackTrace();
		}
	}
	public void click_adjuntar_comprobante() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(input_adjuntar_comprobante));
			input_adjuntar_comprobante.click();
			LogMobile.info("Se hizo clic en adjuntar");
		} catch (Exception e) {
			LogMobile.info("Se hizo clic en adjuntar");
			e.printStackTrace();
		}
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
	public void ingresar_email(String valor) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(input_email));
			input_email.clear();
			input_email.click();
			input_email.sendKeys(valor);
			LogMobile.info("Se ingreso el dato "+valor);
		} catch (Exception e) {
			LogMobile.info("Fallo al ingresar el dato "+valor);
			e.printStackTrace();
		}
	}
	public void click_generar_tramite() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btn_generar_tramite));
			btn_generar_tramite.click();
			LogMobile.info("Se hace click en generar");
		} catch (Exception e) {
			LogMobile.info("Fallo al hacer click en generar");
			e.printStackTrace();
		}
	}
	
    public void swipe_vertical() {
        int startX = input_email.getLocation().getX() + (input_email.getSize().getWidth() / 2);
        int startY = input_email.getLocation().getY() + (input_email.getSize().getHeight() / 2);

        int endX = input_cuit.getLocation().getX() + (input_cuit.getSize().getWidth() / 2);
        int endY = input_cuit.getLocation().getY() + (input_cuit.getSize().getHeight() / 2);

        new TouchAction(driver)
                .press(PointOption.point(startX,startY))
                .waitAction(WaitOptions.waitOptions(ofMillis(1000)))
                .moveTo(PointOption.point(endX, endY))
                .release().perform();
    }
    
    public void setFecha(String dia, String mes, String anio) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(input_dia));
			
			/*Debido al tramite reintegros tuve que setear al ppio el año ya que tiene validación de no setear
			 * una fecha menor a 1 año con lo cual se deshabilita el boton incrementar o decremetar mes*/ 
			String anio_actual = input_anio.getText();
			input_anio.clear();
			input_anio.click();
			input_anio.sendKeys(anio);

			String mes_default = input_mes.getText().toLowerCase();	
			
			if (anio_actual.equals(anio)) {
				while (!mes_default.equals(mes.toLowerCase())) {
					btn_mes_menos.click();
					mes_default = input_mes.getText().toLowerCase();
				}
				input_anio.clear();
				input_anio.click();
				input_anio.sendKeys(anio);
			} else {
				while (!mes_default.equals(mes.toLowerCase())) {
					btn_mes_mas.click();
					mes_default = input_mes.getText().toLowerCase();
				}
				input_anio.clear();
				input_anio.click();
				input_anio.sendKeys(anio);
			}
			
			input_dia.clear();
			input_dia.click();
			input_dia.sendKeys(dia);
			
			btn_establecer.click();
			LogMobile.info("Se realiza el seteo de la fecha");
		} catch (Exception e) {
			LogMobile.info("Fallo al setear la fecha");
			e.printStackTrace();
		}
    }
	
}
