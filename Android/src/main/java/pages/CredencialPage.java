package pages;


import org.jfree.util.Log;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.BasePageMobile;
import helpers.PageHelperMobile;
import log.LogMobile;

public class CredencialPage extends BasePageMobile {

	
	@FindBy (id = "credencialProvisoriaButton")
	private WebElement btnCredenciales;
	
	@FindBy (xpath = "//*[@resource-id='menuHeaderButton']")
	private WebElement btnMenuIniciarSesion;
	
	@FindBy (id = "homeGestionesOnlineButton")
	private WebElement btnGestionesOnLine;
	
	@FindBy (id = "id-generar-credencial")
	private WebElement btnGenerarCredencial;
	
//	@FindBy (id = "motivo-select")
//	@FindBy (xpath = "//*[@resource-id='motivo-select']")
//	@FindBy (xpath = "//*[@resource-id='id-picker-motivo']")
	
	@FindBy(xpath = "//*[@class ='android.widget.EditText' and @package='com.osde.ar'][1]")
	private WebElement SelectMotivo;
	
	@FindBy (xpath = "//*[@resource-id='motivo-select']")
	private WebElement SelectMotivoClic;
	
//	@FindBy (id = "miembro-familiar")
//	@FindBy (xpath = "//*[@resource-id='miembro-familiar']")
	@FindBy(xpath = "//*[@class ='android.widget.EditText' and @package='com.osde.ar'][2]")
	private WebElement SelectFamiliar;
	
	@FindBy (id = "id-condicion-servicio")
	private WebElement CondicionServicio;
	
	@FindBy (id = "id-generar")
	private WebElement GeneraCredencial;
	
	
	@FindBy (id = "id-li-2")
	private WebElement MotivoOlvido;
	
	@FindBy (id = "nombre-user")
	private WebElement NombreLogueo;
	
	
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
	
	public void clickBtnCredenciales() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnCredenciales));
			btnCredenciales.click();
			LogMobile.info("Se hizo click en el Botn de Credenciales");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Botn de Credenciales");
			e.printStackTrace();
		}
	}
	
	public  Boolean esVisibleBtnCredenciales() {
		Boolean esVisible = false;
		try {
			waitFluent.until(ExpectedConditions.visibilityOf(btnCredenciales));
			esVisible = btnCredenciales.isDisplayed();
			Log.info("Se obtuvo el elemento botn de Reintegros");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento botn de Reintegros");
		}
		return esVisible;
	}
	
	public void clickBtnGenerarCredencial() {
		try {
			waitFluent.until(ExpectedConditions.elementToBeClickable(btnGenerarCredencial));
			btnGenerarCredencial.click();
			LogMobile.info("Se hizo click en el Botn Generar Credencial");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Botn Generar Credencial");
			e.printStackTrace();
		}
	}
	
	public  Boolean esVisibleBtnGenerarCredencial() {
		Boolean esVisible = false;
		try {
			waitFluent.until(ExpectedConditions.visibilityOf(btnGenerarCredencial));
			esVisible = btnGenerarCredencial.isDisplayed();
			Log.info("Se obtuvo el elemento botn Generar Credencial");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento botn Generar Credencial");
		}
		return esVisible;
	}
	
	public  Boolean esVisibleSelectorMotivo() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(SelectMotivo));
			esVisible = SelectMotivo.isDisplayed();
			Log.info("Se obtuvo el elemento Seleccion de motivo");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Seleccion de motivo");
		}
		return esVisible;
	}
	
	public void clickBtnMotivo() {
		try {
			waitFluent.until(ExpectedConditions.elementToBeClickable(SelectMotivo));
			SelectMotivo.click();
			LogMobile.info("Se hizo click en el Botn Generar Credencial");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Botn Generar Credencial");
			e.printStackTrace();
		}
	}
	
	
	public  Boolean esVisibleSelectorFamiliar() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(SelectFamiliar));
			esVisible = SelectFamiliar.isDisplayed();
			Log.info("Se obtuvo el elemento Seleccion de Familiar");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Seleccion de Familiar");
		}
		return esVisible;
	}
	
	public void clicSelectFamiliar() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(SelectFamiliar));
			SelectFamiliar.click();
			LogMobile.info("Se hizo click en el Botn Generar Credencial");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Botn Generar Credencial");
			e.printStackTrace();
		}
	}
	
	public  Boolean esVisibleCondicionServicio() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(CondicionServicio));
			esVisible = CondicionServicio.isDisplayed();
			Log.info("Se obtuvo el elemento Seleccion de Familiar");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Seleccion de Familiar");
		}
		return esVisible;
	}
	
	public void clickCondicionServicio() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(CondicionServicio));
			CondicionServicio.click();
			LogMobile.info("Se hizo click en el Botn Generar Credencial");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Botn Generar Credencial");
			e.printStackTrace();
		}
	}
	
	public  Boolean esVisibleGenerarCredencial() {
		Boolean esVisible = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(GeneraCredencial));
			esVisible = GeneraCredencial.isDisplayed();
			Log.info("Se obtuvo el elemento Generar Credencial");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento Generar Credencial");
		}
		return esVisible;
	}
	
	public void clickMotivoOlvido() {
		try {
			waitFluent.until(ExpectedConditions.elementToBeClickable(MotivoOlvido));
			MotivoOlvido.click();
			LogMobile.info("Se hizo click en el Botn Generar Credencial");
		} catch (Exception e) {
			LogMobile.info("Fallo el hacer click en el Botn Generar Credencial");
			e.printStackTrace();
		}
	}
	
	public  Boolean esVisibleMotivoOlvido() {
		Boolean esVisible = false;
		try {
			waitFluent.until(ExpectedConditions.visibilityOf(MotivoOlvido));
			esVisible = MotivoOlvido.isDisplayed();
			Log.info("Se obtuvo el elemento botn Generar Credencial");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Fallo al obtener el elemento botn Generar Credencial");
		}
		return esVisible;
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
	
/*	public  String recuperarTxtTituloCredenciales() {
		String texto = null;
		try {
			texto = TituloTelefono.getAttribute("name");
			LogMobile.info("Se recupera texto del elemento");
		} catch (Exception e){
			LogMobile.info("Fallo el recuperar el texto del elemento");
		}
		return texto;
	}*/
	
}
