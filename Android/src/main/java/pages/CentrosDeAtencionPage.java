package pages;


import org.apache.tools.ant.taskdefs.Sleep;
import org.jfree.util.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.BasePageMobile;
import log.LogMobile;

public class CentrosDeAtencionPage extends BasePageMobile {

	
	@FindBy (xpath = "//*[@resource-id='homeCAPsButton']")
	private WebElement btnCentrosDeAtencion;	
	
	@FindBy (xpath = "//*[@resource-id='homeCAPsBusqPorCercaniaButton']")
	private WebElement btnBuscarPorCercania;	

	@FindBy (xpath = "//*[@resource-id='homeCAPsBusqPorProvinciaButton']")
	private WebElement btnBuscarPorProvincia;
	
	@FindBy (xpath = "//*[@resource-id='nearSearchAddressButton']")
	private WebElement TxtUbicacionActual;
	
	@FindBy (xpath = "//*[@resource-id='capBusqPorCercaniaSearchButton']")
	private WebElement btnBuscar;
	
	@FindBy (xpath = "//*[@resource-id='capBusqPorProvinciaSearchButton']")
	private WebElement btnBuscarProvincia;
	
	@FindBy (xpath = "//*[@resource-id='nearSearchLocationMap']")
	private WebElement Mapa;
	
	@FindBy (xpath = "//*[@resource-id='nearResultMapView']")
	private WebElement MapaResultados;
	
	@FindBy (xpath = "//*[@resource-id='nearResultHeaderTitleText']")
	private WebElement TituloResultados;
	
	@FindBy (xpath = "//*[@resource-id='nearResultListButton']/android.view.View")
	private WebElement ListadoResultados;
	
	@FindBy (xpath = "//*[@resource-id='listResultHeaderMapButton']")
	private WebElement MapaListadoResultados;
	
	@FindBy (xpath = "//*[@resource-id='listResultHeaderTitleText']")
	private WebElement TituloListadoResultados;
	
	@FindBy (xpath = "//*[@resource-id='ext-element-234']")
	private WebElement MapaComoLLego;
	
	@FindBy (xpath = "//*[@resource-id='directionsOriginText']")
	private WebElement OrigenComoLLego;
	
	@FindBy (xpath = "//*[@resource-id='directionsDestinationText']")
	private WebElement DestinoComoLLego;
	
	@FindBy (xpath = "//*[@text='Back']")
	private WebElement BtnVolver;
	
	//Provincia

	@FindBy (xpath = "//*[@resource-id='capBusqPorProvinciaProvinciaButton']")
	private WebElement ComboProvincia;
	
	@FindBy(xpath = "//*[@class ='android.view.View' and @package='com.osde.ar'][3]")
	private WebElement ProvinciaBsAs;
	
	@FindBy (xpath = "//*[resource-id='capBusqPorProvinciaLocalidadButton']")
	private WebElement ComboLocalidad;
	
	@FindBy(xpath = "//*[@class ='android.view.View' and @package='com.osde.ar'][1]")
	private WebElement Localidad;
	
	@FindBy (id = "homeGestionesOnlineButton")
	private WebElement btnGestionesOnLine;
	
	@FindBy (xpath = "//*[@resource-id='homeCAPsCallCAPsButton']/android.view.View")
	private WebElement TxtCentrosAtencion;
	
	//FERNANDO-Cercania
	@FindBy (xpath = "//*[@resource-id='streetSearchPickerTextField']/android.view.View/android.view.View/android.widget.EditText")
	private WebElement input_setear_ubicacion_cercania;
	@FindBy (xpath = "//*[@resource-id='streetSearchPickerListView']/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[@index='2']/android.view.View")
	private WebElement lista_direcciones_cercania;
	
	
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
	
	public void clickBtnCentrosDeAtencion() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnCentrosDeAtencion));
			btnCentrosDeAtencion.click();
			LogMobile.info("Se hizo click en el botón Centros de Atención Personalizada");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el botón Centros de Atención Personalizada");
			e.printStackTrace();
		}
	}
	
	
	public  Boolean esVisibleBtnCentrosDeAtencion() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(btnCentrosDeAtencion));
			esVisible = btnCentrosDeAtencion.isDisplayed();
			Log.info("Se obtuvo el elemento botón de Centros de Atención");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento botón de Centros de Atención");
		}
		return esVisible;
	}
	
	public void clickBtnBuscarPorCercania() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnBuscarPorCercania));
			btnBuscarPorCercania.click();
			LogMobile.info("Se hizo click en el botón Buscar por Cercania");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el botón Buscar por Cercania");
			e.printStackTrace();
		}
	}
			
	public  Boolean esVisibleBtnBuscarPorCercania() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(btnBuscarPorCercania));
			esVisible = btnBuscarPorCercania.isDisplayed();
			Log.info("Se obtuvo el elemento botón Buscar por cercania");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento botón Buscar por cercania");
		}
		return esVisible;
	}
	
	public void clickBtnBuscarPorProvincia() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnBuscarPorProvincia));
			btnBuscarPorProvincia.click();
			LogMobile.info("Se hizo click en el botón Buscar por Provincia");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el botón Buscar por Provincia");
			e.printStackTrace();
		}
	}
			
	public  Boolean esVisibleBtnBuscarPorProvincia() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(btnBuscarPorProvincia));
			esVisible = btnBuscarPorProvincia.isDisplayed();
			Log.info("Se obtuvo el elemento botón Buscar por Provincia");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento botón Buscar por Provincia");
		}
		return esVisible;
	}
	
	public  Boolean esVisibleTxtUbicacionActual() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(TxtUbicacionActual));
			esVisible = TxtUbicacionActual.isDisplayed();
			Log.info("Se obtuvo el elemento Txt de ubicación actual");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Txt de ubicación actual");
		}
		return esVisible;
	}
	
	public void clickBtnBuscar() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnBuscar));
			btnBuscar.click();
			LogMobile.info("Se hizo click en el botón Buscar");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el botón Buscar");
			e.printStackTrace();
		}
	}
	public  Boolean esVisibleBtnBuscar() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(btnBuscar));
			esVisible = btnBuscar.isDisplayed();
			Log.info("Se obtuvo el elemento Botón Buscar");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Botón Buscar");
		}
		return esVisible;
	}
	
	public  Boolean esVisibleMapa() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(Mapa));
			esVisible = Mapa.isDisplayed();
			Log.info("Se obtuvo el elemento Mapa");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Mapa");
		}
		return esVisible;
	}
	
	public  Boolean esVisibleMapaResultados() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(MapaResultados));
			esVisible = MapaResultados.isDisplayed();
			Log.info("Se obtuvo el elemento Mapa de los resultados");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento mapa de los resultados");
		}
		return esVisible;
	}
	
	public  Boolean esVisibleTituloResultados() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(TituloResultados));
			esVisible = TituloResultados.isDisplayed();
			Log.info("Se obtuvo el elemento Listado de los resultados");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Listado de los resultados");
		}
		return esVisible;
	}

	public  Boolean esVisibleListadoResultados() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(ListadoResultados));
			esVisible = ListadoResultados.isDisplayed();
			Log.info("Se obtuvo el elemento Listado de los resultados");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Listado de los resultados");
		}
		return esVisible;
	}
	
	public void clickBtnListadoResultados() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(ListadoResultados));
			ListadoResultados.click();
			LogMobile.info("Se hizo click en el botón Listado Resultados");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Listado Resultados");
			e.printStackTrace();
		}
	}
	
	public  Boolean esVisibleMapaListadoResultados() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(MapaListadoResultados));
			esVisible = MapaListadoResultados.isDisplayed();
			Log.info("Se obtuvo el elemento Listado de los resultados");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Listado de los resultados");
		}
		return esVisible;
	}
	
	public  Boolean esVisibleTituloListadoResultados() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(TituloListadoResultados));
			esVisible = TituloListadoResultados.isDisplayed();
			Log.info("Se obtuvo el elemento Titulo del Listado de los resultados");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Titulo del Listado de los resultados");
		}
		return esVisible;
	}
	
	public  Boolean esVisibleMapaComoLLego() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(MapaComoLLego));
			esVisible = MapaComoLLego.isDisplayed();
			Log.info("Se obtuvo el elemento Mapa en la sección como llego");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Mapa en la sección como llego");
		}
		return esVisible;
	}
	
	public  Boolean esVisibleOrigenComoLLego() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(OrigenComoLLego));
			esVisible = OrigenComoLLego.isDisplayed();
			Log.info("Se obtuvo el elemento Origen en la sección como llego");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Origen en la sección como llego");
		}
		return esVisible;
	}
	
	public  Boolean esVisibleDestinoComoLLego() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(DestinoComoLLego));
			esVisible = DestinoComoLLego.isDisplayed();
			Log.info("Se obtuvo el elemento Destino en la sección como llego");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Destino en la sección como llego");
		}
		return esVisible;
	}
	
	public  Boolean esVisibleComboProvincia() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(ComboProvincia));
			esVisible = ComboProvincia.isDisplayed();
			Log.info("Se obtuvo el elemento ComboProvincia");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Combo Provincia");
		}
		return esVisible;
	}
	
	public void clickComboProvincia() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(ComboProvincia));
			ComboProvincia.click();
			LogMobile.info("Se hizo click en el botón de provincia");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el botón de Provincia");
			e.printStackTrace();
		}
	}
	
	public void clickProvinciaCABA() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(ProvinciaBsAs));
			ProvinciaBsAs.click();
			LogMobile.info("Se hizo click en el botón de provincia");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el botón de Provincia");
			e.printStackTrace();
		}
	}

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
	
	public void clickComboLocalidad() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(ComboLocalidad));
			ComboLocalidad.click();
			LogMobile.info("Se hizo click en el botón de Localidad");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el botón de Localidad");
			e.printStackTrace();
		}
	}
	
	public void clickLocalidad() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(Localidad));
			Localidad.click();
			LogMobile.info("Se hizo click en el botón de Localidad");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el botón de Localidad");
			e.printStackTrace();
		}
	}
	
	public void clickBuscarProvincia() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnBuscarProvincia));
			btnBuscarProvincia.click();
			LogMobile.info("Se hizo click en el botón de Buscar por Provincia");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el botón de Buscar por Provincia");
			e.printStackTrace();
		}
	}
	
	public  Boolean esVisibleBtnGestionesOnLine() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(btnGestionesOnLine));
			esVisible = btnGestionesOnLine.isDisplayed();
			Log.info("Se obtuvo el elemento botón de Gestiones On Line");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento botón de Gestiones On Line");
		}
		return esVisible;
	}
	
	public  Boolean esVisibleTxtCentrosAtencion() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(TxtCentrosAtencion));
			esVisible = TxtCentrosAtencion.isDisplayed();
			Log.info("Se obtuvo el elemento botón de Gestiones On Line");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento botón de Gestiones On Line");
		}
		return esVisible;
	}
	
	public  String recuperarTxtCentrosAtencion() {
		String texto = null;
		try {
			texto = TxtCentrosAtencion.getText();
			LogMobile.info("Se recupera texto del elemento");
		} catch (Exception e){
			LogMobile.info("Fallo el recuperar el texto del elemento");
		}
		return texto;
	}
	
	////////////////////////////////////////////////////////////
	//Metodos FERNANDO
	public  void clic_ubicacion() {
		try {
			wait.until(ExpectedConditions.visibilityOf(TxtUbicacionActual));
			TxtUbicacionActual.click();
			Log.info("Se obtuvo el elemento Txt de ubicación actual");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Txt de ubicación actual");
		}
	}
	
	public void setearUbicacion(String ubicacion) {
		WebElement resultado = null;
		try {
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
	
	public  Boolean esCorrectoElTitulo() {
		Boolean esCorrecto = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(TituloListadoResultados));
			esCorrecto = TituloListadoResultados.getText().equals("Centros de atención personalizada");
			Log.info("Se obtuvo el elemento Titulo del Listado de los resultados");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Titulo del Listado de los resultados");
		}
		return esCorrecto;
	}
	
	public  Boolean esCorrectoElTituloEnMapa() {
		Boolean esCorrecto = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(TituloResultados));
			esCorrecto = TituloResultados.getText().equals("Centros de atención personalizada");
			Log.info("Se obtuvo el elemento Titulo del Listado de los resultados");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Titulo del Listado de los resultados");
		}
		return esCorrecto;
	}
	
}

