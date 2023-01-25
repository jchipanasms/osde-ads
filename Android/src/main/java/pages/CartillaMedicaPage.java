package pages;


import static org.testng.Assert.assertTrue;

import java.util.List;

import org.apache.tools.ant.taskdefs.Sleep;
import org.jfree.util.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.BasePageMobile;
import log.LogMobile;

public class CartillaMedicaPage extends BasePageMobile {

	@FindBy (id = "com.android.packageinstaller:id/permission_allow_button")
	private WebElement btnPermitir;

	@FindBy (xpath = "//*[@resource-id='homeCartillaButton']")
	private WebElement btnCartillaMedica;
	
	@FindBy (id = "homeBusqPorCercaniaButton")
	private WebElement btnBuscarPorCercania;
	
	@FindBy (id = "homeBusqPorEspecialidadButton")
	private WebElement btnBuscarPorEspecialidad;	
	
	@FindBy (xpath = "//*[@resource-id='homeBusqAvanzadaButton']")
	private WebElement btnBuscarPorNombre;
	
	@FindBy (xpath = "//*[@resource-id='homeOSDEViajaConUstedButton']")
	private WebElement btnOsdeViajaConVos;
	
	@FindBy (id = "busqPorCercaniaPlanButton")
	private WebElement ComboPlan;
	
	@FindBy (id = "busqPorEspecialidadPlanButton")
	private WebElement E_ComboPlan;
	
	@FindBy (id = "busqPorCercaniaRubroButtonText")
	private WebElement ComboRubro;
	
	@FindBy (id = "busqPorEspecialidadRubroButton")
	private WebElement E_ComboRubro;
	
	@FindBy (id = "busqPorEspecialidadProvinciaButton")
	private WebElement ComboProvincia;
	
	@FindBy (id = "busqPorEspecialidadLocalidadButton")
	private WebElement ComboLocalidad;
	
	@FindBy (id = "busqPorEspecialidadEspecialidadButton")
	private WebElement ListadoEspecialidades_E;
	
	@FindBy (xpath = "//*[@resource-id='busqPorCercaniaEspecialidadButtonText']")
	private WebElement ComboEspecialidad;
	
	@FindBy (xpath = "//*[@resource-id='busqPorEspecialidadEspecialidadButton']")
	private WebElement E_ComboEspecialidad;
	
	@FindBy (xpath = "//*[@resource-id='nearSearchAddressButtonText']")
	private WebElement Seleccionarubicacion;
		
	@FindBy (xpath = "//*[@resource-id='busqPorEspecialidadAgreementsButton']")
	private WebElement LinkNormasGenerales_E;
	
	@FindBy (xpath = "//*[@resource-id='busqAvanzadaAgreementsButton']")
	private WebElement LinkNormasGenerales_N;
	
	@FindBy (id = "com.android.packageinstaller:id/dialog_container")
	private WebElement PopUpPermitir;
	
	@FindBy (id = "ext-element-197")
	private WebElement PopupUbicacion;
	
	/*@FindBy (id = "ext-element-201")
	private WebElement Texto;*/
	
	@FindBy (id = "normasGeneralesPlanButton")
	private WebElement ComboPlanNormasGenerales;
	
	@FindBy (id = "normasGeneralesPlanButtonText")
	private WebElement BtnPlanNormarGenerales;
	
	@FindBy (xpath = "//*[@resource-id='pickerControllerListView'][1]")
	private WebElement Plan450;
	
	
//	@FindBy (id = "ext-element-143") 
	@FindBy (xpath = "//*[@resource-id='normasGeneralesScreenCloseButton']")
	private WebElement CerrarNG;
	
	//normasGeneralesScreenCloseButton
	@FindBy (id = "pickerControllerCloseButton")
	private WebElement CerrarSeleccionPlan;
	
	//normasGeneralesPlanButton probar con este
	@FindBy (id = "ext-element-231")
	private WebElement PopUpSeleccionPlan;
	
	@FindBy (id = "ext-element-207")
	private WebElement ListadoPlanes;
	
//	@FindBy (xpath = "//*[@resource-id='ext-simplelistitem-16']")
	@FindBy(xpath = "//*[@class ='android.view.View' and @package='com.osde.ar'][2]")
	private WebElement Plan410;
	
//	@FindBy(xpath = "//*[@class ='android.view.View' and @package='com.osde.ar'][0]")
	@FindBy (xpath = "//*[@resource-id='ext-simplelistitem-6']")
	private WebElement Plan410_E;
	
	@FindBy (id = "busqPorCercaniaRubroButton")
	private WebElement ComboRubros;

	@FindBy(xpath = "//*[@class ='android.view.View' and @package='com.osde.ar'][4]")
	private WebElement RubroProfesionales;
	
	@FindBy (id = "listResultHeaderFiltroText")
	private WebElement ResultadoBusqueda;
	
	//-------------------------
	//------BUSQUEDA POR NOMBRE
	//-------------------------
	@FindBy (id = "busqAvanzadaPlanButton")
	private WebElement ComboPlan_N;
	
/*	@FindBy(xpath = "//*[@class ='android.view.View' and @package='com.osde.ar' and content-desc='Profesionales']")
	private WebElement RubroProfesionales;
	*/
	@FindBy (id = "busqAvanzadaRubroButton")
	private WebElement ComboRubro_N;
	
	@FindBy (id = "busqAvanzadaProvinciaButton")
	private WebElement ComboProvincia_N;
	

	//--------------------------------------------------
	//-----BUSQUEDA POR ESPECIALIDAD--------------------
	//--------------------------------------------------
	
//	@FindBy(xpath = "//*[@class ='android.widget.LinearLayout' and @package='com.osde.ar' and index='2']")
	@FindBy (id = "ext-simplelistitem-11")
	private WebElement Plan410_N;
	
	@FindBy(xpath = "//*[@class ='android.view.View' and @package='com.osde.ar'][1]")
	private WebElement RubroProfesionales_N;
	
	@FindBy (id = "busqPorCercaniaEspecialidadButton")
	private WebElement ComboEspecialidades;
	
	@FindBy(xpath = "//*[@class ='android.view.View' and @package='com.osde.ar'][1]")
	private WebElement EspecialidadCardiologia;
	
	@FindBy(xpath = "//*[@class ='android.view.View' and @package='com.osde.ar'][1]")
	private WebElement ProvinciaCaba;
	
	@FindBy(xpath = "//*[@class ='android.view.View' and @package='com.osde.ar'][5]")
	private WebElement LocalidadPalermo;
	
	@FindBy (xpath = "//*[@resource-id='busqPorEspecialidadSearchButton']")
	private WebElement BtnBuscarEspecilidad;
	
	@FindBy (xpath = "//*[@resource-id='busqPorCercaniaSearchButton']")
	private WebElement BtnBuscarCercania;
	
	@FindBy(xpath = "//*[@class ='android.view.View' and @package='com.osde.ar'][3]")
	private WebElement ProvinciaCaba_N;
	
	@FindBy (id = "busqAvanzadaSearchButton")
	private WebElement BtnBuscar_N;
	
	@FindBy (xpath = "//*[@resource-id='ext-input-2']")
	private WebElement TxtBuscarNombre;
	
	@FindBy (id = "ext-panel-5")
	private WebElement Panio;
	
	@FindBy(xpath = "//*[@class ='android.view.View' and @package='com.osde.ar'][1]")
	private WebElement InfoParticular;

	@FindBy (id = "detalleDePrestadorConsultorioDireccion")
	private WebElement DetallePrestador;
	
	@FindBy (xpath = "//*[@resource-id='ext-button-1']")
	private WebElement BtnVolver;
	
	@FindBy (id = "banner1")
	private WebElement PantallaPP;
	
	@FindBy (id = "contentSliderContainer")
	private WebElement PanioGral;
	
	//--------------------------
	//----REULTADOS ESPECIALIDAD
	//--------------------------

	@FindBy (xpath = "//*[@resource-id='nearResultListButton']")
	private WebElement BtnMapaCercania;
	
	@FindBy (xpath = "//*[@resource-id='nearResultHeaderTitleText']")
	private WebElement TituloEspecialidadCercania;
	
	//--------------------------
	//----REULTADOS CERCANIA
	//--------------------------

	@FindBy (xpath = "//*[@resource-id='listResultHeaderMapButton']")
	private WebElement BtnMapa;
		
	@FindBy (xpath = "//*[@resource-id='listResultHeaderTitleText']")
	private WebElement TituloEspecialidad;
	
//	@FindBy (id = "sliderCanvas")	
	@FindBy (id = "canvas")
	private WebElement ProtectorPantalla;
	
//	@FindBy (xpath = "//android.webkit.WebView[@text='OSDE-TAS']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']")
	@FindBy (id = "ext-sheet-2")
	private WebElement titulo_advertencia_timeout;

	///////////////////////////FERNANDO///////////////////////////////////////
	@FindBy (xpath = "//*[@resource-id='userActiveLabel']/android.view.View/android.view.View")
	private WebElement label_usuario;
	@FindBy (xpath = "//*[@resource-id='homeNavMenuButtonCloseSession']")
	private WebElement btn_deslogueo;
	@FindBy (xpath = "//*[@text='Back']")
	private WebElement btn_volver;	
	@FindBy (xpath = "//*[@text='Aceptar']")
	private WebElement btn_deslogueo_aceptar;
	@FindBy (xpath = "//*[@text='Cancelar']")
	private WebElement btn_deslogueo_cancelar;
	
	//OSDE VIAJA CON VOS: submenu de opciones
	@FindBy (xpath = "//*[@resource-id='homeOsdeViajaConUstedBusqPorCercaniaButton']")
	private WebElement btn_osdeViaja_porCercania;
	@FindBy (xpath = "//*[@resource-id='homeOsdeViajaConUstedBusqPorEspecialidadButton']")
	private WebElement btn_osdeViaja_porEspecialidad;
	@FindBy (xpath = "//*[@resource-id='homeOsdeViajaConUstedBusqAvanzadaButton']")
	private WebElement btn_osdeViaja_porNombre;
	@FindBy (xpath = "//*[@resource-id='homeOsdeViajaConUstedServiciosEnElExteriorButton']")
	private WebElement btn_osdeViaja_servEnExterior;
	
	//Buscar por cercania
	@FindBy (xpath = "//*[@resource-id='urgBusqPorCercaniaPlanButton']")
	private WebElement input_plan_cercania;
//	@FindBy (xpath = "//*[@resource-id='pickerControllerTitle']")
//	private WebElement titulo_plan_y_especialidad;	//funciona tanto para plan como especialidad
//	@FindBy (xpath = "//*[@resource-id='pickerControllerCloseButton']/android.view.View")
//	private WebElement btn_cerrar_x;	//tambien funciona para combo especialidad
	
	@FindBy (xpath = "//*[@resource-id='urgBusqPorCercaniaEspecialidadButton']")
	private WebElement input_seleccione_especialidad_cercania;
	
	@FindBy (xpath = "//*[@resource-id='nearSearchAddressButtonText']")
	private WebElement input_ubicacion_cercania;
	@FindBy (xpath = "//*[@resource-id='streetSearchPickerTextField']/android.view.View/android.view.View/android.widget.EditText")
	private WebElement input_setear_ubicacion_cercania;
	@FindBy (xpath = "//*[@resource-id='streetSearchPickerListView']/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[@index='2']/android.view.View")
	private WebElement lista_direcciones_cercania;
	
	@FindBy (xpath = "//*[@resource-id='nearSearchLocationMap']")
	private WebElement contenido_mapa_cercania;
	@FindBy (xpath = "//*[@resource-id='urgBusqPorCercaniaAgreementsButton']/android.view.View")
	private WebElement link_nomas_generales_cercania;
	@FindBy (xpath = "//*[@resource-id='urgBusqPorCercaniaSearchButton']")
	private WebElement btn_buscar_cercania;
	
	@FindBy (xpath = "//*[@resource-id='nearResultHeaderTitleText']")
	private WebElement titulo_resultados_cercania;
	@FindBy (xpath = "//*[@resource-id='nearResultListButton']/android.view.View")
	private WebElement btn_verFormaListaResultadosCercania;
	@FindBy (xpath = "//*[@resource-id='nearResultMapView']")
	private WebElement vista_mapa_resultados_cercania;
	
	@FindBy (xpath = "//*[@resource-id='listResultHeaderTitleText']")
	private WebElement titulo_resultados_lista_cercania;
	@FindBy (xpath = "//*[@resource-id='listResultHeaderMapButton']/android.view.View")
	private WebElement btn_verFormaMapaResultadosCercania;
	@FindBy (xpath = "//*[@resource-id='listResultListView']/android.view.View/android.view.View/android.view.View/android.view.View[@index='2']/android.view.View")
	private WebElement lista_resultadosFinalesCercania;
	
	@FindBy (xpath = "//*[@resource-id='pickerControllerListView']/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[@index='2']/android.view.View")
	private WebElement lista_generica;
	
	//Buscar por especialidad
	@FindBy (xpath = "//*[@resource-id='urgBusqPorEspecialidadPlanButton']")
	private WebElement input_plan_especialidad;
	
	@FindBy (xpath = "//*[@resource-id='urgBusqPorEspecialidadProvinciaButton']")
	private WebElement input_provincia_especialidad;
	
	@FindBy (xpath = "//*[@resource-id='urgBusqPorEspecialidadLocalidadButton']")
	private WebElement input_localidad_especialidad;
	
	@FindBy (xpath = "//*[@resource-id='urgBusqPorEspecialidadEspecialidadButton']")
	private WebElement input_especialidad_especialidad;
	
	@FindBy (xpath = "//*[@resource-id='urgBusqPorEspecialidadNovedadesCheckBoxField']")
	private WebElement check_novedades_especialidad;
	@FindBy (xpath = "//*[@resource-id='busqPorEspecialidadNovedadesTextTitle']/android.view.View/android.view.View/android.view.View")
	private WebElement titulo_check_novedades_especialidad;
	@FindBy (xpath = "//*[@resource-id='urgBusqPorEspecialidadNovedadesDatePicker']")
	private WebElement input_calendario_especialidad;
	
	@FindBy (xpath = "//*[@resource-id='urgBusqPorEspecialidadAgreementsButton']/android.view.View")
	private WebElement link_normas_generales_especialidad;
	
	@FindBy (xpath = "//*[@resource-id='urgBusqPorEspecialidadSearchButton']")
	private WebElement btn_buscar_especialidad;
	
	@FindBy (xpath = "//*[@resource-id='listResultListView']/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[@index='2']/android.view.View")
	private WebElement lista_resultadosFinalesEspecialidad;
	
	@FindBy (xpath = "//*[@resource-id='listResultMapHeaderTitleText']")
	private WebElement titulo_al_ver_mapa;
	@FindBy (xpath = "//*[@resource-id='listResultMapListButton']/android.view.View")
	private WebElement btn_verLista_especialidad;
	@FindBy (xpath = "//*[@resource-id='listResultMapView']")
	private WebElement vista_mapa_resultados_especialidad;
		
	//Buscar por nombre
	@FindBy (xpath = "//*[@resource-id='urgBusqAvanzadaPlanButton']")
	private WebElement input_plan_nombre;
	@FindBy (xpath = "//*[@resource-id='urgBusqAvanzadaProvinciaButton']")
	private WebElement input_provincia_nombre;
	@FindBy (xpath = "//*[@resource-id='advancedSearchTextField']/android.view.View/android.view.View/android.widget.EditText")
	private WebElement input_ingresar_nombre;
	
	@FindBy (xpath = "//*[@resource-id='advancedSearchTextInformation']/android.view.View/android.view.View")
	private WebElement texto_nombre;
	
	@FindBy (xpath = "//*[@resource-id='urgBusqAvanzadaAgreementsButton']/android.view.View")
	private WebElement link_normas_generales_nombre;
	
	@FindBy (xpath = "//*[@resource-id='urgBusqAvanzadaSearchButton']")
	private WebElement btn_buscar_nombre;
	
	@FindBy (xpath = "//*[@resource-id='listResultHeaderFiltroText']")
	private WebElement subtituloTextoDeBusqueda;
	@FindBy (xpath = "//*[@resource-id='listResultMapHeaderFiltroText']")
	private WebElement subtituloTextoDeBusquedaMapa;	
	
	//Servicios en el exterior
	@FindBy (xpath = "//*[@resource-id='urgImportantTextScreenContent']/android.view.View/android.view.View[@index='1']/android.view.View/android.view.View/android.view.View[@index='0']")
	private WebElement titulo_importante;
	@FindBy (xpath = "//*[@resource-id='urgImportantTextScreenContent']/android.view.View/android.view.View[@index='1']/android.view.View/android.view.View/android.view.View[@index='1']")
	private WebElement contenido_importante;
	@FindBy (xpath = "//*[@resource-id='continuarUrgImportantTextScreenButton']")
	private WebElement btn_continuar_mensaje_importante;
	
	@FindBy (xpath = "//*[@resource-id='urgServiciosEnElExteriorScreen']/android.view.View/android.view.View/android.view.View[@index='0']/android.view.View/android.view.View/android.view.View")
	private WebElement titulo_servicios;
	@FindBy (xpath = "//*[@resource-id='urgServiciosEnElExteriorScreen']/android.view.View/android.view.View/android.view.View[@index='1']/android.view.View/android.view.View/android.view.View")
	private WebElement subTitulo_servicios;
	@FindBy (xpath = "//*[@resource-id='urgServiciosEnElExteriorScreen']/android.view.View/android.view.View/android.view.View[@index='2']/android.view.View/android.view.View[@index='0']/android.view.View/android.view.View/android.view.View")
	private WebElement primerParrafo_servicios;
	@FindBy (xpath = "//*[@resource-id='urgServiciosEnElExteriorScreen']/android.view.View/android.view.View/android.view.View[@index='2']/android.view.View/android.view.View[@index='1']/android.view.View/android.view.View/android.view.View")
	private WebElement segundoParrafo_servicios_lista;
	@FindBy (xpath = "//*[@resource-id='urgServiciosEnElExteriorScreen']/android.view.View/android.view.View/android.view.View[@index='2']/android.view.View/android.view.View[@index='2']/android.view.View/android.view.View/android.view.View")
	private WebElement titulo_seleccionePais_servicios;
	@FindBy (xpath = "//*[@resource-id='urgServiciosEnElExteriorScreenPaisesLimitrofesList']/android.view.View/android.view.View/android.view.View/android.view.View[@index='2']/android.view.View")
	private WebElement listaPaises_servicios;
	
	//Normas generales
	@FindBy (xpath = "//*[@resource-id='normasGeneralesHeaderTitle']")
	private WebElement titulo_normas;
	@FindBy (xpath = "//*[@resource-id='normasGeneralesScreenCloseButton']/android.view.View")
	private WebElement btn_cerrar_normas;
	@FindBy (xpath = "//*[@resource-id='normasGeneralesPlanButton']")
	private WebElement combo_plan_normas;
	@FindBy (xpath = "//*[@resource-id='normasGeneralesScreenContent']/android.view.View/android.view.View[@index='1']/android.view.View/android.view.View[@index='1']/android.view.View[@index='0']")
	private WebElement titulo_plan_seleccionado;
	
//	@FindBy (id = "homeNavMenuButtonCloseSession")
	@FindBy (xpath = "//*[@resource-id='homeNavMenuButtonCloseSession']")
	private WebElement BtnCerrarSesion;
	
	@FindBy (id = "ext-button-3")
	private WebElement BtnAceptarCerrarSesion;
	
	public void clickPermitir() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnPermitir));
			btnPermitir.click();
		//	PantallaPP.click();
			LogMobile.info("Se hizo click en Permitir el mensaje");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en Permitir el mensaje");
			e.printStackTrace();
		}
	}
	
	public  Boolean esVisiblePopUpPermitir() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(btnPermitir));
			esVisible = btnPermitir.isDisplayed();
			Log.info("Se obtuvo el elemento botón de PopUp Permitir");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento botón de PopUp Permitir");
		}
		return esVisible;
	}
	
	public void clickCartillaMedica() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnCartillaMedica));
			btnCartillaMedica.click();
			LogMobile.info("Se hizo click en el Item Cartilla Médica");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Item Cartilla Médica");
			e.printStackTrace();
		}
	}
	
	public void clickBuscarPorCercania() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnBuscarPorCercania));
			btnBuscarPorCercania.click();
			LogMobile.info("Se hizo click en el Item Buscar por Cercanía");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Item Buscar por Cercanía");
			e.printStackTrace();
		}
	}
	
	public void clickBuscarPorEspecialidad() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnBuscarPorEspecialidad));
			btnBuscarPorEspecialidad.click();
			LogMobile.info("Se hizo click en el Item Buscar por Especialidad");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Item Buscar por Especialidad");
			e.printStackTrace();
		}
	}
	
	public void clickBuscarPorNombre() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnBuscarPorNombre));
			btnBuscarPorNombre.click();
			LogMobile.info("Se hizo click en el Item Buscar por Nombre");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Item Buscar por Nombre");
			e.printStackTrace();
		}
	}
	
	public void clickLinkNormasGenerales_E() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(LinkNormasGenerales_E));
		//	LinkNormasGenerales.wait(10000);
			LinkNormasGenerales_E.click();
			LogMobile.info("Se hizo click en el Item Normas Generales");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Item Normas Generales");
			e.printStackTrace();
		}
	}
	
		
	public  Boolean esVisibleBtnCartillaMedica() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(btnCartillaMedica));
			esVisible = btnCartillaMedica.isDisplayed();
			Log.info("Se obtuvo el elemento botón de Cartilla Médica");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento botón de Cartilla Médica");
		}
		return esVisible;
	}
	
	public  Boolean esVisibleBtnBuscarporCercania() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(btnBuscarPorCercania));
			esVisible = btnBuscarPorCercania.isDisplayed();
			Log.info("Se obtuvo el elemento botón de Buscar por Cercacnía");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento botón de Buscar por Cercacnía");
		}
		return esVisible;
	}
	
	public  Boolean esVisibleBtnBuscarporEspecialidad() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(btnBuscarPorEspecialidad));
			esVisible = btnBuscarPorEspecialidad.isDisplayed();
			Log.info("Se obtuvo el elemento botón de Buscar por Especialidad");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento botón de Buscar por Especialidad");
		}
		return esVisible;
	}
	
	public  Boolean esVisibleBtnBuscarporNombre() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(btnBuscarPorNombre));
			esVisible = btnBuscarPorNombre.isDisplayed();
			Log.info("Se obtuvo el elemento botón de Buscar por Nombre");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento botón de Buscar por Nombre");
		}
		return esVisible;
	}
	
	//-------------------------
	//---------PLANES
	//-------------------------	
	public  Boolean esVisibleComboPlan() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(ComboPlan));
			esVisible = ComboPlan.isDisplayed();
			Log.info("Se obtuvo el elemento botón de Buscar por Especialidad");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento botón de Buscar por Especialidad");
		}
		return esVisible;
	}
	
	public  Boolean esVisibleComboPlan_E() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(E_ComboPlan));
			esVisible = E_ComboPlan.isDisplayed();
			Log.info("Se obtuvo el elemento botón de Buscar por Especialidad");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento botón de Buscar por Especialidad");
		}
		return esVisible;
	}
	
	public  Boolean esVisibleComboPlan_N() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(ComboPlan_N));
			esVisible = ComboPlan_N.isDisplayed();
			Log.info("Se obtuvo el elemento Combo Rubro de la busqueda por nonmbre");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Combo Rubro de la busqueda por nonmbre");
		}
		return esVisible;
	}
	
	public void clicComboPlan() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(ComboPlan));
		//	ComboPlan.wait(20000);
			ComboPlan.click();
			LogMobile.info("Se hizo click en el Combo de Planes");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Combo de Planes");
			e.printStackTrace();
		}
	}
	
	public void clicComboPlan_E() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(E_ComboPlan));
			E_ComboPlan.click();
			LogMobile.info("Se hizo click en el Combo de Planes");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Combo de Planes");
			e.printStackTrace();
		}
	}
	
	public void clicComboPlan_N() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(ComboPlan_N));
			ComboPlan_N.click();
			LogMobile.info("Se hizo click en el Combo de Planes de busqueda por nombre");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Combo de Planes de busqueda por nombre");
			e.printStackTrace();
		}
	}
	
	public Boolean esVisibleListadoPlanes() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(ListadoPlanes));
			esVisible = ListadoPlanes.isDisplayed();
			Log.info("Se obtuvo el elemento PopUp de Plan");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento PopUp de Plan");
		}
		return esVisible;
	}
	
	public void clicPlan410() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(Plan410));
	//		driver.findElement(By.name("submit")).sendKeys(Keys.ENTER);
			Plan410.click();
			LogMobile.info("Se hizo click en el plan");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Plan");
			e.printStackTrace();
		}
	}
	
	public Boolean esVisiblePlan410() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(Plan410));
			esVisible = Plan410.isDisplayed();
			Log.info("Se obtuvo el elemento Plan 410");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Plan 410");
		}
		return esVisible;
	}
	
	public void clicPlan410_E() {
		try {
			waitFluent.until(ExpectedConditions.elementToBeClickable(Plan410_E));
			Plan410_E.click();
			LogMobile.info("Se hizo click en el plan");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Plan");
			e.printStackTrace();
		}
	}
	
	public void clicPlan410_N() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(Plan410_N));
			Plan410_N.click();
			LogMobile.info("Se hizo click en el plan");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Plan");
			e.printStackTrace();
		}
	}
	
	//-------------------------
	//---------RUBRO
	//-------------------------
	public  Boolean esVisibleComboRubro() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(ComboRubro));
			esVisible = ComboRubro.isDisplayed();
			Log.info("Se obtuvo el elemento Combo Rubro");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Combo Rubro");
		}
		return esVisible;
	}
	
	public  Boolean esVisibleComboRubro_E() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(E_ComboRubro));
			esVisible = E_ComboRubro.isDisplayed();
			Log.info("Se obtuvo el elemento Combo Rubro");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Combo Rubro");
		}
		return esVisible;
	}
	
	public  Boolean esVisibleComboRubro_N() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(ComboRubro_N));
			esVisible = ComboRubro_N.isDisplayed();
			Log.info("Se obtuvo el elemento Combo Rubro de la busqueda por nombre");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Combo Rubro de la busqueda por nombre");
		}
		return esVisible;
	}
	
	public void clicComboRubros_E() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(E_ComboRubro));
			E_ComboRubro.click();
			LogMobile.info("Se hizo click en Combo Rubos");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en Combo rubros");
			e.printStackTrace();
		}
	}
	
	public void clicComboRubros() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(ComboRubros));
			ComboRubros.click();
			LogMobile.info("Se hizo click en Combo Rubos");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en Combo rubros");
			e.printStackTrace();
		}
	}
	
	public void clicComboRubros_N() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(ComboRubro_N));
			ComboRubro_N.click();
			LogMobile.info("Se hizo click en Combo Rubros");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en Combo rubros");
			e.printStackTrace();
		}
	}
	
	public void clicRubroProfesional() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(RubroProfesionales));
			RubroProfesionales.click();
			LogMobile.info("Se hizo click en Rubro Profesional");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Rubro Profesional");
			e.printStackTrace();
		}
	}
	
	public void clicRubroProfesionales_N() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(RubroProfesionales_N));
			RubroProfesionales_N.click();
			LogMobile.info("Se hizo click en Rubro Profesionales");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Rubro Profesionales");
			e.printStackTrace();
		}
	}
	
	//-------------------------
	//---------ESPECIALIDADES
	//-------------------------
	public  Boolean esVisibleEspecialidad() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(ComboEspecialidad));
			esVisible = ComboEspecialidad.isDisplayed();
			Log.info("Se obtuvo el elemento Especialidad");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Especialidad");
		}
		return esVisible;
	}
	
	public  Boolean esVisibleEspecialidad_E() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(E_ComboEspecialidad));
			esVisible = E_ComboEspecialidad.isDisplayed();
			Log.info("Se obtuvo el elemento Especialidad");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Especialidad");
		}
		return esVisible;
	}
	
	public void clicComboEspecialidades_E() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(E_ComboEspecialidad));
			E_ComboEspecialidad.click();
			LogMobile.info("Se hizo click en Combo Especialidades");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en Combo Especialidades");
			e.printStackTrace();
		}
	}	
	
	public void clicComboEspecialidades() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(ComboEspecialidades));
			ComboEspecialidades.click();
			LogMobile.info("Se hizo click en Combo Rubos");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en Combo rubros");
			e.printStackTrace();
		}
	}
	
	public void clicEspecialidadCardiologia() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(EspecialidadCardiologia));
			EspecialidadCardiologia.click();
			LogMobile.info("Se hizo click en Rubro Profesional");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Rubro Profesional");
			e.printStackTrace();
		}
	}
	
	//-------------------------
	//---------PROVINCIA
	//-------------------------
	public  Boolean esVisibleComboProvincia() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(ComboProvincia));
			esVisible = ComboProvincia.isDisplayed();
			Log.info("Se obtuvo el elemento Combo Provincia de Busqueda por Especialidad");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Combo Provincia de Busqueda por Especialidad");
		}
		return esVisible;
	}
	
	public  Boolean esVisibleComboProvincia_N() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(ComboProvincia_N));
			esVisible = ComboProvincia_N.isDisplayed();
			Log.info("Se obtuvo el elemento Combo Provincia de la busqueda por nombre");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Combo Provincia de la busqueda por nombre");
		}
		return esVisible;
	}
	
	public void clicComboProvincias() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(ComboProvincia));
			ComboProvincia.click();
			LogMobile.info("Se hizo click en Combo Rubos");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en Combo rubros");
			e.printStackTrace();
		}
	}
	
	public void clicComboProvincias_N() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(ComboProvincia_N));
			ComboProvincia_N.click();
			LogMobile.info("Se hizo click en Combo Rubos");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en Combo rubros");
			e.printStackTrace();
		}
	}
		
	public void clicProvincia() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(ProvinciaCaba));
			ProvinciaCaba.click();
			LogMobile.info("Se hizo click en Rubro Profesional");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Rubro Profesional");
			e.printStackTrace();
		}
	}
	
	public void clicCaba_N() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(ProvinciaCaba_N));
			//action.click(ProvinciaCaba_N);
			ProvinciaCaba_N.click();
			LogMobile.info("Se hizo click en la provincia CABA");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en la provincia CABA");
			e.printStackTrace();
		}
	}
	//-------------------------
	//---------LOCALIDAD
	//-------------------------
	public  Boolean esVisibleComboLocalidad() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(ComboLocalidad));
			esVisible = ComboLocalidad.isDisplayed();
			Log.info("Se obtuvo el elemento Combo Localidad");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Combo Localidad");
		}
		return esVisible;
	}
			
	public void clicComboLocalidad() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(ComboLocalidad));
			ComboPlan.wait(20000);
			ComboLocalidad.click();
			LogMobile.info("Se hizo click en el Combo de Localidades");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Combo de Localidades");
			e.printStackTrace();
		}
	}
	
	public void clicLocalidad() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(LocalidadPalermo));
			LocalidadPalermo.click();
			LogMobile.info("Se hizo click en la localidad de Belgrano");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en la localidad de Belgrano");
			e.printStackTrace();
		}
	}			
	
	
	//---------------------------
	//-------POP UP DE UBICACIÓN
	//---------------------------
	public  Boolean esVisibleUbicacion() {
		Boolean esVisible = false;
		try {
			waitFluent.until(ExpectedConditions.visibilityOf(Seleccionarubicacion));
			esVisible = Seleccionarubicacion.isDisplayed();
			Log.info("Se obtuvo el elemento Ubicacion");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Ubicacion");
		}
		return esVisible;
	}
	
	
	public Boolean esVisiblePopupUbicacion() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(PopupUbicacion));
			esVisible = PopupUbicacion.isDisplayed();
			Log.info("Se obtuvo el elemento PopUp Ubicacion");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento PopUp Ubicacion");
		}
		return esVisible;
	}
	
	//-------------------------
	//---------NORMAS GENERALES
	//-------------------------
/*	public Boolean esVisibleNormasGenerales() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(Texto));
			esVisible = Texto.isDisplayed();
			Log.info("Se obtuvo el elemento Texto");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Texto");
		}
		return esVisible;
	}*/
	
	public void clickLinkNormasGenerales_N() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(LinkNormasGenerales_N));
		//	LinkNormasGenerales.wait(10000);
			LinkNormasGenerales_N.click();
			LogMobile.info("Se hizo click en el Item Normas Generales");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Item Normas Generales");
			e.printStackTrace();
		}
	}

	
	public Boolean esVisibleComboPlanNormasGenerales() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(ComboPlanNormasGenerales));
			esVisible = ComboPlanNormasGenerales.isDisplayed();
			Log.info("Se obtuvo el elemento Texto");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Texto");
		}
		return esVisible;
	}
	
	public void clicComboPlanesNG() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(BtnPlanNormarGenerales));
	//		Plan450.wait(20000);
			BtnPlanNormarGenerales.click();
			LogMobile.info("Se hizo click en el Combo de Planes");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Combo de Planes");
			e.printStackTrace();
		}
	}
	
	public void clicPlan450() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(Plan450));
	//		Plan450.wait(20000);
			Plan450.click();
			LogMobile.info("Se hizo click en el Combo de Planes");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Combo de Planes");
			e.printStackTrace();
		}
	}
	public void clicCerrarNG() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(CerrarNG));
			CerrarNG.click();
			LogMobile.info("Se hizo click en Cerrar Normas Generales");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en Cerrar Normas Generales");
			e.printStackTrace();
		}
	}
	
	public Boolean esVisiblePopUpSeleccionPlan() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(PopUpSeleccionPlan));
			esVisible = PopUpSeleccionPlan.isDisplayed();
			Log.info("Se obtuvo el elemento PopUp de Plan");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento PopUp de Plan");
		}
		return esVisible;
	}
	
	public void ingresarTxtBuscar_N(String TextoBuscar) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(TxtBuscarNombre));
			TxtBuscarNombre.sendKeys(TextoBuscar);
			Log.info("Se ingreso el Texto");
		} catch (Exception e) {
			Log.info("Fallo al ingresar el Texto");
			e.printStackTrace();
		}
	}

	public void clicBtnBuscar_N() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(BtnBuscar_N));
			BtnBuscar_N.click();
			LogMobile.info("Se hizo click en el Botón buscar");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Botón buscar");
			e.printStackTrace();
		}
	}
	
	public  Boolean esVisibleResultadoBusqueda() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(ResultadoBusqueda));
			esVisible = ResultadoBusqueda.isDisplayed();
			Log.info("Se obtuvo el elemento Titulo del resultado de la búsqueda por nombre");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Titulo del resultado de la búsqueda por nombre");
		}
		return esVisible;
	}	
	
	public void clickPanio() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(Panio));
			Panio.click();
			LogMobile.info("Se hizo click en el paño");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el paño");
			e.printStackTrace();
		}
	}
	
	public void clickInfoParticular() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(InfoParticular));
			InfoParticular.click();
			LogMobile.info("Se hizo click en Información particular del médico");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en Información particular del médico");
			e.printStackTrace();
		}
	}
	public  Boolean esVisibleDetallePrestador() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(DetallePrestador));
			esVisible = DetallePrestador.isDisplayed();
			Log.info("Se obtuvo el elemento Detalle del prestador");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Detalle del prestador");
		}
		return esVisible;
	}	
	
	public void clickVolver() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(BtnVolver));
			BtnVolver.click();
			LogMobile.info("Se hizo click en el botón Volver");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el botón Volver");
			e.printStackTrace();
		}
	}
	
	public void clickPanioGral() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(PanioGral));
			PanioGral.click();
			LogMobile.info("Se hizo click en el paño General");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el paño General");
			e.printStackTrace();
		}
	}
	
	//-------------------------
	//---------ESPECIALIDAD
	//-------------------------
	public  Boolean esVisibleBtnBuscar() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(BtnBuscarEspecilidad));
			esVisible = BtnBuscarEspecilidad.isDisplayed();
			Log.info("Se obtuvo el elemento Botón Buscar");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Botón Buscar");
		}
		return esVisible;
	}
				
	public void clicBtnBuscarEspecialidad() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(BtnBuscarEspecilidad));
		//	ComboPlan.wait(20000);
			BtnBuscarEspecilidad.click();
			LogMobile.info("Se hizo click en el Botón Buscar");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Botón Buscar");
			e.printStackTrace();
		}
	}
	
	public void clicBtnBuscarCercania() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(BtnBuscarCercania));
		//	ComboPlan.wait(20000);
			BtnBuscarCercania.click();
			LogMobile.info("Se hizo click en el Botón Buscar");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Botón Buscar");
			e.printStackTrace();
		}
	}
	
	public  Boolean esVisibleBtnBuscarPorCercania() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(BtnBuscarCercania));
			esVisible = BtnBuscarCercania.isDisplayed();
			Log.info("Se obtuvo el elemento Botón Buscar");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Botón Buscar");
		}
		return esVisible;
	}
	
	public  Boolean esVisibleBtnMapa() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(BtnMapa));
			esVisible = BtnMapa.isDisplayed();
			Log.info("Se obtuvo el elemento Botón Mapa");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Botón Mapa");
		}
		return esVisible;
	}
	
	public  Boolean esVisibleTituloEspecialidad() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(TituloEspecialidad));
			esVisible = TituloEspecialidad.isDisplayed();
			Log.info("Se obtuvo el elemento Titulo de la Especialidad");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Titulo de la Especialidad");
		}
		return esVisible;
	}
	
	
	public  Boolean esVisibleBtnMapaCercania() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(BtnMapaCercania));
			esVisible = BtnMapaCercania.isDisplayed();
			Log.info("Se obtuvo el elemento Botón Mapa en Búsqueda por cercania");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Botón Mapa en Búsqueda por cercania");
		}
		return esVisible;
	}
	
	public  Boolean esVisibleTituloEspecialidadCercania() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(TituloEspecialidadCercania));
			esVisible = TituloEspecialidadCercania.isDisplayed();
			Log.info("Se obtuvo el elemento Titulo de la Especialidad en Búsqueda por cercanía");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Titulo de la Especialidad en Búsqueda por cercanía");
		}
		return esVisible;
	}
	
	public  Boolean esVisibleProtectorPantalla() {
		Boolean esVisible = false;
		try {
			waitFluent.until(ExpectedConditions.visibilityOf(ProtectorPantalla));
			esVisible = ProtectorPantalla.isDisplayed();
			Log.info("Se obtuvo el elemento Titulo de la Especialidad en Bsqueda por cercana");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Titulo de la Especialidad en Bsqueda por cercana");
		}
		return esVisible;
	}
	
	
	public void clicProtectorPantalla() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(ProtectorPantalla));
			ProtectorPantalla.click();
			LogMobile.info("Se hizo click en el protector de pantalla");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el protector de pantalla");
			e.printStackTrace();
		}
	}
	
	//----------------	
	//------------FER	
	//----------------
	
	
	//METODOS PARA OSDE VIAJA CON VOS
	
	public  Boolean esVisibleBtnOSDEViajaConVos() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(btnOsdeViajaConVos));
			esVisible = btnOsdeViajaConVos.isDisplayed();
			Log.info("Se obtuvo el elemento botón OSDE Viaja con vos");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento botón OSDE Viaja con vos");
		}
		return esVisible;
	}
	
	public void clic_osdeViajaConVos() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnOsdeViajaConVos));
			btnOsdeViajaConVos.click();
			Log.info("Se hizo clic en elemento en OSDE Viaja con vos");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Falló clic en elemento en OSDE Viaja con vos");
		}
	}
	
	public Boolean esVisibleSubMenuOsdeViajaConVos(String opcion) {
		Boolean visible = false;
		try {
			switch (opcion) {
			case "buscar por cercania":
				wait.until(ExpectedConditions.elementToBeClickable(btn_osdeViaja_porCercania));
				visible = btn_osdeViaja_porCercania.isDisplayed();
				Log.info("Es visible el elemento "+opcion);
				break;
			case "buscar por especialidad":
				wait.until(ExpectedConditions.elementToBeClickable(btn_osdeViaja_porEspecialidad));
				visible = btn_osdeViaja_porEspecialidad.isDisplayed();
				Log.info("Es visible el elemento "+opcion);
				break;
			case "buscar por nombre":
				wait.until(ExpectedConditions.elementToBeClickable(btn_osdeViaja_porNombre));
				visible = btn_osdeViaja_porNombre.isDisplayed();
				Log.info("Es visible el elemento "+opcion);
				break;
			case "servicios en el exterior":
				wait.until(ExpectedConditions.elementToBeClickable(btn_osdeViaja_servEnExterior));
				visible = btn_osdeViaja_servEnExterior.isDisplayed();
				Log.info("Es visible el elemento "+opcion);
				break;
			default:
				LogMobile.info("No existe el boton "+opcion);
				break;
			}
		} catch (Exception e) {
			LogMobile.info("Fallo al ver el botón "+opcion+" o puede que no este bien escrito");
			e.printStackTrace();
		}
		return visible;
	}
	
	public void clicSubMenuOsdeViajaConVos(String opcion) {
		try {
			switch (opcion) {
			case "buscar por cercania":
				wait.until(ExpectedConditions.elementToBeClickable(btn_osdeViaja_porCercania));
				btn_osdeViaja_porCercania.click();
				Log.info("Se pudo obtener el elemento "+opcion);
				break;
			case "buscar por especialidad":
				wait.until(ExpectedConditions.elementToBeClickable(btn_osdeViaja_porEspecialidad));
				btn_osdeViaja_porEspecialidad.click();
				Log.info("Se pudo obtener el elemento "+opcion);
				break;
			case "buscar por nombre":
				wait.until(ExpectedConditions.elementToBeClickable(btn_osdeViaja_porNombre));
				btn_osdeViaja_porNombre.click();
				Log.info("Se pudo obtener el elemento "+opcion);
				break;
			case "servicios en el exterior":
				wait.until(ExpectedConditions.elementToBeClickable(btn_osdeViaja_servEnExterior));
				btn_osdeViaja_servEnExterior.click();
				Log.info("Se pudo obtener el elemento "+opcion);
				break;
			default:
				LogMobile.info("No existe la opcion "+opcion);
				break;
			}
		} catch (Exception e) {
			LogMobile.info("Fallo al obtener el botón "+opcion+" o puede que no este bien escrito");
			e.printStackTrace();
		}
	}
	
	public void clic_planes_desde(String desdeModulo) {
		try {
			switch (desdeModulo) {
			case "cercania":
				waitFluent.until(ExpectedConditions.elementToBeClickable(input_plan_cercania));
				input_plan_cercania.click();
				Log.info("Se pudo obtener el elemento "+desdeModulo);
				break;
			case "especialidad":
				waitFluent.until(ExpectedConditions.elementToBeClickable(input_plan_especialidad));
				input_plan_especialidad.click();
				Log.info("Se pudo obtener el elemento "+desdeModulo);
				break;
			case "nombre":
				waitFluent.until(ExpectedConditions.elementToBeClickable(input_plan_nombre));
				input_plan_nombre.click();
				Log.info("Se pudo obtener el elemento "+desdeModulo);
				break;
			default:
				Log.info("No existe el elemento "+desdeModulo);
				break;
			}
		} catch (Exception e) {
			LogMobile.info("Fallo al obtener el elemento "+desdeModulo);
		}
	}
	
	public void seleccionPlan(String plan) {
		List<WebElement> planes = null;
		try {
			waitFluent.until(ExpectedConditions.elementToBeClickable(lista_generica));
			planes = lista_generica.findElements(By.xpath("//android.view.View/android.view.View/android.view.View[@text='Plan']"));
			switch (plan) {
			case "210":
				planes.get(0).click();
				LogMobile.info("Se obtuvo correctamente el elemento");
				break;
			case "310":
				planes.get(1).click();
				LogMobile.info("Se obtuvo correctamente el elemento");
				break;
			case "410":
				planes.get(2).click();
				LogMobile.info("Se obtuvo correctamente el elemento");
				break;
			case "450":
				planes.get(3).click();
				LogMobile.info("Se obtuvo correctamente el elemento");
				break;
			case "510":
				planes.get(4).click();
				LogMobile.info("Se obtuvo correctamente el elemento");
				break;
			default:
				LogMobile.info("No existe ese plan");
				break;
			}
		} catch (Exception e) {
			LogMobile.info("Falla al obtener el elemento");
		}
	}
	
	public void clic_especialidad_desde(String submodulo) {
		try {
			switch (submodulo) {
			case "cercania":
				wait.until(ExpectedConditions.elementToBeClickable(input_seleccione_especialidad_cercania));
				input_seleccione_especialidad_cercania.click();
				LogMobile.info("Se obtuvo correctamente el elemento");
				break;
			case "especialidad":
				wait.until(ExpectedConditions.elementToBeClickable(input_especialidad_especialidad));
				input_especialidad_especialidad.click();
				LogMobile.info("Se obtuvo correctamente el elemento");
				break;
			default:
				LogMobile.info("No existe la opcion ingresada");
				break;
			}
		} catch (Exception e) {
			LogMobile.info("Falla al obtener el elemento");
		}
	}
	
	public void seleccionEspecialidad(String especialidad) {
		List<WebElement> especialidades = null;
		try {
			waitFluent.until(ExpectedConditions.elementToBeClickable(lista_generica));
			especialidades = lista_generica.findElements(By.xpath("//android.view.View/android.view.View"));
			for (WebElement dato_esp : especialidades) {
				if (dato_esp.getText().equalsIgnoreCase(especialidad)) {
					dato_esp.click();
					break;
				}
			}
			LogMobile.info("Se obtuvo correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Falla al obtener el elemento");
		}
	}
	
	public Boolean estaEnUbicacionActual() {
		Boolean esta = false;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(input_ubicacion_cercania));
			esta = input_ubicacion_cercania.getText().equals("Tu ubicación actual");
			LogMobile.info("Se obtuvo correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Falla al obtener el elemento");
		}
		return esta;
	}
	
	public void setearUbicacion(String ubicacion) {
		WebElement resultado = null;
		try {
			input_ubicacion_cercania.click();
			waitFluent.until(ExpectedConditions.elementToBeClickable(input_setear_ubicacion_cercania));
			input_setear_ubicacion_cercania.click();
			input_setear_ubicacion_cercania.sendKeys(ubicacion);
			resultado = lista_direcciones_cercania.findElement(By.xpath("//android.view.View[@index='0']/android.view.View"));
			wait.until(ExpectedConditions.elementToBeClickable(resultado));
			resultado.click();
			LogMobile.info("Se obtuvo correctamente los elementos");
		} catch (Exception e) {
			LogMobile.info("Fallo al obtener los elementos");
		}
	}
	
	public Boolean esVisibleMapa() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(contenido_mapa_cercania));
			esVisible = contenido_mapa_cercania.isDisplayed();
			LogMobile.info("Se obtuvo correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Falla al obtener el elemento");
		}
		return esVisible;
	}
	

	public void clic_buscar_desde(String submodulo) {
		try {
			switch (submodulo) {
			case "cercania":
				waitFluent.until(ExpectedConditions.elementToBeClickable(btn_buscar_cercania));
				btn_buscar_cercania.click();
				LogMobile.info("Se obtuvo correctamente el elemento");
				break;
			case "especialidad":
				waitFluent.until(ExpectedConditions.elementToBeClickable(btn_buscar_especialidad));
				btn_buscar_especialidad.click();
				LogMobile.info("Se obtuvo correctamente el elemento");
				break;
			case "nombre":
				waitFluent.until(ExpectedConditions.elementToBeClickable(btn_buscar_nombre));
				btn_buscar_nombre.click();
				LogMobile.info("Se obtuvo correctamente el elemento");
				break;
			default:
				LogMobile.info("No existe la opcion ingresada");
				break;
			}
		} catch (Exception e) {
			LogMobile.info("Falla al obtener el elemento");
		}
	}
	
	public Boolean esVisibleTitulo(String titulo) {
		Boolean esVisible = false;
		try {
			waitFluent.until(ExpectedConditions.elementToBeClickable(titulo_resultados_cercania));
			esVisible = titulo_resultados_cercania.getText().equalsIgnoreCase(titulo);
			LogMobile.info("Se obtuvo correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Falla al obtener el elemento");
		}
		return esVisible;
	}
	
	public Boolean esVisibleBtnVerFormaLista() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btn_verFormaListaResultadosCercania));
			esVisible = btn_verFormaListaResultadosCercania.isDisplayed();
			LogMobile.info("Se obtuvo correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Falla al obtener el elemento");
		}
		return esVisible;
	}
	
	public void clic_btnLista() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btn_verFormaListaResultadosCercania));
			btn_verFormaListaResultadosCercania.click();
			LogMobile.info("Se obtuvo correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Falla al obtener el elemento");
		}
	}
	
	public Boolean esVisibleMapaResultados() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(vista_mapa_resultados_cercania));
			esVisible = vista_mapa_resultados_cercania.isDisplayed();
			LogMobile.info("Se obtuvo correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Falla al obtener el elemento");
		}
		return esVisible;
	}
	
	public Boolean esVisibleBtnVerFormaMapa() {
		Boolean esVisible = false;
		try {
			waitFluent.until(ExpectedConditions.elementToBeClickable(btn_verFormaMapaResultadosCercania));
			esVisible = btn_verFormaMapaResultadosCercania.isDisplayed();
			LogMobile.info("Se obtuvo correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Falla al obtener el elemento");
		}
		return esVisible;
	}
	


	public void clic_btnMapa() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btn_verFormaMapaResultadosCercania));
			btn_verFormaMapaResultadosCercania.click();
			LogMobile.info("Se obtuvo correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Falla al obtener el elemento");
		}
	}
	
	public Boolean esVisibleTituloLista(String titulo) {
		Boolean esVisible = false;
		try {
			waitFluent.until(ExpectedConditions.elementToBeClickable(titulo_resultados_lista_cercania));
			esVisible = titulo_resultados_lista_cercania.getText().equalsIgnoreCase(titulo);
			LogMobile.info("Se obtuvo correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Falla al obtener el elemento");
		}
		return esVisible;
	}
	
	public Boolean existenResultadosLista() {
		Boolean existe = false;
		List<WebElement> resultados = null;
		try {
			wait.until(ExpectedConditions.visibilityOf(lista_resultadosFinalesCercania));
			resultados = lista_resultadosFinalesCercania.findElements(By.xpath("//android.view.View"));
			if (resultados.size() > 0 || !resultados.isEmpty()) {
				existe = true;
			}
			LogMobile.info("Se obtuvo correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Falla al obtener el elemento");
		}
		return existe;
	}
	
	
	
	
	
	

	
	public void clic_provincia_desde(String desdeModulo) {
		try {
			switch (desdeModulo) {
			case "especialidad":
				wait.until(ExpectedConditions.elementToBeClickable(input_provincia_especialidad));
				input_provincia_especialidad.click();
				Log.info("Se pudo obtener el elemento "+desdeModulo);
				break;
			case "nombre":
				wait.until(ExpectedConditions.elementToBeClickable(input_provincia_nombre));
				input_provincia_nombre.click();
				Log.info("Se pudo obtener el elemento "+desdeModulo);
				break;
			default:
				Log.info("No existe el elemento "+desdeModulo);
				break;
			}
		} catch (Exception e) {
			LogMobile.info("Fallo al obtener el elemento "+desdeModulo);
		}
	}
	
	public void seleccionProvincia(String provincia) {
		List<WebElement> provincias = null;
		try {
			waitFluent.until(ExpectedConditions.elementToBeClickable(lista_generica));
			provincias = lista_generica.findElements(By.xpath("//android.view.View/android.view.View"));
			for (WebElement prov : provincias) {
				if (prov.getText().equalsIgnoreCase(provincia)) {
					prov.click();
					break;
				}
			}
			LogMobile.info("Se obtuvo correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Falla al obtener el elemento");
		}
	}
	
	public void clic_localidad() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(input_localidad_especialidad));
			input_localidad_especialidad.click();
			LogMobile.info("Se obtuvo correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Se obtuvo correctamente el elemento");
		}
	}
	
	public void seleccionLocalidad(String localidad) {
		List<WebElement> localidades = null;
		try {
			waitFluent.until(ExpectedConditions.elementToBeClickable(lista_generica));
			localidades = lista_generica.findElements(By.xpath("//android.view.View/android.view.View"));
			for (WebElement loc : localidades) {
				if (loc.getText().equalsIgnoreCase(localidad)) {
					loc.click();
					break;
				}
			}
			LogMobile.info("Se obtuvo correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Falla al obtener el elemento");
		}
	}
	
	public void clic_check_novedades() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(check_novedades_especialidad));
			check_novedades_especialidad.click();
			LogMobile.info("Se obtuvo correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Falla al obtener el elemento");
		}
	}
	
	public void clic_fecha_especialidad() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(input_calendario_especialidad));
			input_calendario_especialidad.click();
			LogMobile.info("Se obtuvo correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Falla al obtener el elemento");
		}
	}
	
	public Boolean existenResultadosListaEspecialidad() {
		Boolean existe = false;
		List<WebElement> resultados = null;
		try {
			wait.until(ExpectedConditions.visibilityOf(lista_resultadosFinalesEspecialidad));
			resultados = lista_resultadosFinalesEspecialidad.findElements(By.xpath("//android.view.View"));
			if (resultados.size() > 0 || !resultados.isEmpty()) {
				existe = true;
			}
			LogMobile.info("Se obtuvo correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Falla al obtener el elemento");
		}
		return existe;
	}
	
	public Boolean esVisibleTituloAlVerMapa(String titulo) {
		Boolean esVisible = false;
		try {
			waitFluent.until(ExpectedConditions.elementToBeClickable(titulo_al_ver_mapa));
			esVisible = titulo_al_ver_mapa.getText().equalsIgnoreCase(titulo);
			LogMobile.info("Se obtuvo correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Falla al obtener el elemento");
		}
		return esVisible;
	}
	
	public Boolean esVisibleBtnVerFormaLista_esp() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btn_verLista_especialidad));
			esVisible = btn_verLista_especialidad.isDisplayed();
			LogMobile.info("Se obtuvo correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Falla al obtener el elemento");
		}
		return esVisible;
	}
	
	public void clic_btnLista_esp() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btn_verLista_especialidad));
			btn_verLista_especialidad.click();
			LogMobile.info("Se obtuvo correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Falla al obtener el elemento");
		}
	}
	
	public Boolean esVisibleMapaResultados_esp() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(vista_mapa_resultados_especialidad));
			esVisible = vista_mapa_resultados_especialidad.isDisplayed();
			LogMobile.info("Se obtuvo correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Falla al obtener el elemento");
		}
		return esVisible;
	}
	
	public void ingresar_nombre(String nombre) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(input_ingresar_nombre));
			input_ingresar_nombre.click();
			input_ingresar_nombre.sendKeys(nombre);
			LogMobile.info("Se obtuvo correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Falla al obtener el elemento");
		}
	}
	
	public Boolean seEncuentraDescripcionBusqueda() {
		Boolean seEncuentra = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(texto_nombre));
			seEncuentra = texto_nombre.getText().equals("Podés realizar búsquedas por nombre, especialidad, localidad, barrio, teléfono o combinarlos.");
			LogMobile.info("Se obtuvo correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Falla al obtener el elemento");
		}
		return seEncuentra;
	}
	
	public Boolean esVisibleSubtituloLista(String subtitulo) {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(subtituloTextoDeBusqueda));
			esVisible = subtituloTextoDeBusqueda.getText().equalsIgnoreCase(subtitulo);
			LogMobile.info("Se obtuvo correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Falla al obtener el elemento");
		}
		return esVisible;
	}
	
	public Boolean esVisibleSubtituloMapa(String subtitulo) {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(subtituloTextoDeBusquedaMapa));
			esVisible = subtituloTextoDeBusquedaMapa.getText().equalsIgnoreCase(subtitulo);
			LogMobile.info("Se obtuvo correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Falla al obtener el elemento");
		}
		return esVisible;
	}
	
	public Boolean seEncuentraMensajeImportante() {
		Boolean seEncuentra = false;
		try {
			waitFluent.until(ExpectedConditions.elementToBeClickable(titulo_importante));
			seEncuentra = titulo_importante.getText().equals("Importante")
					&& contenido_importante.getText().equals("Vos y tu grupo familiar podrán ser atendidos en las instituciones detalladas para cada país. Te recordamos que la cobertura no incluye el traslado del paciente al centro asistencial y que alcanza solo a las prestaciones de urgencia, guardia general y gastos de internación. Por cuestiones locales, algunos servicios pueden quedar fuera de convenio (por ejemplo los honorarios del equipo médico); en estos casos podrás solicitar, a tu regreso, el reintegro correspondiente a tu plan OSDE.");
			LogMobile.info("Se obtuvo correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Falla al obtener el elemento");
		}
		return seEncuentra;
	}
	
	public void clic_continuarEnMensaje() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btn_continuar_mensaje_importante));
			btn_continuar_mensaje_importante.click();
			LogMobile.info("Se obtuvo correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Falla al obtener el elemento");
		}
	}
	
	public Boolean seEncuentraLaInformacionEstatica() {
		Boolean esCorrecto = false;
		List<WebElement> seg_parrafo = null;
		List<WebElement> lista_paises = null;
		try {
			waitFluent.until(ExpectedConditions.visibilityOf(titulo_servicios));
			seg_parrafo = segundoParrafo_servicios_lista.findElements(By.xpath("//android.view.View"));
			lista_paises = listaPaises_servicios.findElements(By.xpath("//android.view.View/android.view.View"));
			esCorrecto = titulo_servicios.getText().equals("Servicios en el exterior")
					&& subTitulo_servicios.getText().equals("Servicio de Urgencias en países limítrofes")
					&& primerParrafo_servicios.getText().equals("En vacaciones o viajes de negocios, los socios de OSDE cuentan con cobertura para las urgencias que pudieran surgir, con sólo presentar la credencial y el documento de identidad.")
					&& seg_parrafo.get(1).getText().equals("Ante cualquier duda pueden llamarnos al ")
					&& seg_parrafo.get(2).getText().equals("0810.555.6733")
					&& seg_parrafo.get(3).getText().equals(" o desde el exterior al ")
					&& seg_parrafo.get(4).getText().equals("54.11.5371.6490")
					&& titulo_seleccionePais_servicios.getText().equals("Seleccioná un país")
					&& (lista_paises.size() > 0);
			LogMobile.info("Se obtuvo correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Falla al obtener el elemento");
		}
		return esCorrecto;
	}
	
	public void clic_enPais(String pais) {
		List<WebElement> lista_paises = null;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(listaPaises_servicios));
			lista_paises = listaPaises_servicios.findElements(By.xpath("//android.view.View/android.view.View"));
			for (WebElement un_pais : lista_paises) {
				if (un_pais.getText().equalsIgnoreCase(pais)) {
					un_pais.click();
					break;
				}
			}
			LogMobile.info("Se obtuvo correctamente el elemento");
		} catch (Exception e) {
			LogMobile.info("Falla al obtener el elemento");
		}
	}
	
	public void clic_normas_desde(String desdeModulo) {
		try {
			switch (desdeModulo) {
			case "cercania":
				waitFluent.until(ExpectedConditions.elementToBeClickable(link_nomas_generales_cercania));
				link_nomas_generales_cercania.click();
				Log.info("Se pudo obtener el elemento "+desdeModulo);
				break;
			case "especialidad":
				waitFluent.until(ExpectedConditions.elementToBeClickable(link_normas_generales_especialidad));
				link_normas_generales_especialidad.click();
				Log.info("Se pudo obtener el elemento "+desdeModulo);
				break;
			case "nombre":
				waitFluent.until(ExpectedConditions.elementToBeClickable(link_normas_generales_nombre));
				link_normas_generales_nombre.click();
				Log.info("Se pudo obtener el elemento "+desdeModulo);
				break;
			default:
				Log.info("No existe el elemento "+desdeModulo);
				break;
			}
		} catch (Exception e) {
			LogMobile.info("Fallo al obtener el elemento "+desdeModulo);
		}
	}
	
	public Boolean seEncuentraTituloNormas() {
		Boolean seEncuentra = false;
		try {
			waitFluent.until(ExpectedConditions.elementToBeClickable(titulo_normas));
			seEncuentra = titulo_normas.getText().equals("Normas Generales");
			Log.info("Se pudo obtener el elemento");
		} catch (Exception e) {
			LogMobile.info("Fallo al obtener el elemento");
		}
		return seEncuentra;
	}
	
	public Boolean seEncuentraBtnCerrar() {
		Boolean seEncuentra = false;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btn_cerrar_normas));
			seEncuentra = btn_cerrar_normas.isDisplayed();
			Log.info("Se pudo obtener el elemento");
		} catch (Exception e) {
			LogMobile.info("Fallo al obtener el elemento");
		}
		return seEncuentra;
	}
	
	public void clic_btnCerrar() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btn_cerrar_normas));
			btn_cerrar_normas.click();
			Log.info("Se pudo obtener el elemento");
		} catch (Exception e) {
			LogMobile.info("Fallo al obtener el elemento");
		}
	}
	
	public Boolean seEncuentraComboPlanes() {
		Boolean seEncuentra = false;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(combo_plan_normas));
			seEncuentra = combo_plan_normas.isDisplayed();
			Log.info("Se pudo obtener el elemento");
		} catch (Exception e) {
			LogMobile.info("Fallo al obtener el elemento");
		}
		return seEncuentra;
	}
	
	public void clic_planes_normas() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(combo_plan_normas));
			combo_plan_normas.click();
			Log.info("Se pudo obtener el elemento");
		} catch (Exception e) {
			LogMobile.info("Fallo al obtener el elemento");
		}
	}
	
	public Boolean elTituloEsPlan(String plan) {
		Boolean esCorrecto = false;
		try {
			waitFluent.until(ExpectedConditions.elementToBeClickable(titulo_plan_seleccionado));
			esCorrecto = titulo_plan_seleccionado.getText().equals("PLAN "+plan);
			Log.info("Se pudo obtener el elemento");
		} catch (Exception e) {
			LogMobile.info("Fallo al obtener el elemento");
		}
		return esCorrecto;
	}
	
	public Boolean esVisibleSocio(String nombre) {
		Boolean esVisible = false;
		try {
			waitFluent.until(ExpectedConditions.elementToBeClickable(label_usuario));
			esVisible = label_usuario.getText().equalsIgnoreCase("Hola "+nombre);
			LogMobile.info("Se obtiene el label del usuario");
		} catch (Exception e) {
			LogMobile.info("Fallo el encontrar el elemento");
			e.printStackTrace();
		}
		return esVisible;
	}
	
	public Boolean esVisibleBtnVolver() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btn_volver));
			esVisible = btn_volver.isDisplayed();
			LogMobile.info("Se obtiene el elemento");
		} catch (Exception e) {
			LogMobile.info("Fallo el encontrar el elemento");
			e.printStackTrace();
		}
		return esVisible;
	}
	
	public Boolean esVisibleBtnDeslogueo() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btn_deslogueo));
			esVisible = btn_deslogueo.isDisplayed();
			LogMobile.info("Se obtiene el elemento");
		} catch (Exception e) {
			LogMobile.info("Fallo el encontrar el elemento");
			e.printStackTrace();
		}
		return esVisible;
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
	public  Boolean esVisibleMsjDeslogueo() {
		Boolean esVisible = false;
		try {
			waitFluent.until(ExpectedConditions.visibilityOf(titulo_advertencia_timeout));
			esVisible = titulo_advertencia_timeout.isDisplayed();
			Log.info("Se obtuvo el elemento Mensaje de deslogueo");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Mensaje de deslogueo");
		}
		return esVisible;
	}

	//------------------------------------------------
	public void clickMsjDeslogueo() {
		try {
			waitFluent.until(ExpectedConditions.elementToBeClickable(titulo_advertencia_timeout));
			titulo_advertencia_timeout.click();
			LogMobile.info("Se hizo click en el Mensaje de deslogueo");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Mensaje de deslogueo");
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
			LogMobile.info("Se hizo click en el Bot�n de Cerrar Sesion");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Bot�n de Cerrar Sesion");
			e.printStackTrace();
		}
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
	
	//VER que se repiten!!!
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

}
