package steps;

import org.testng.Assert;
import base.BaseStepMobile;
import config.DataSetterMobile;
import context.UsuarioMobile;
import helpers.StepHelperMobile;
import helpers.XMLHelperMobile;
import log.LogMobile;
import pages.AyudaPage;
import pages.CartillaMedicaPage;
import pages.CentrosDeAtencionProvinciaPage;
import pages.LoginPage;
import pages.TelefonosPage;

public class CentrosDeAtencionProvinciaStep extends BaseStepMobile {

	public static void Run(String testName) {
		String nombrePaso = "";
				
		try {
			
			log.LogMobile.startTestCase(testName);
			
			nombrePaso = "01_Se Acepta el mensaje de permitir";
			try {
				CurrentPage = (new CartillaMedicaPage().GetInstance(CartillaMedicaPage.class));
				CurrentPage.As(CartillaMedicaPage.class).clickPermitir();
			} catch (Exception e) {
				LogMobile.info("No se muestra alerta");
			}
			CurrentPage = (new LoginPage().GetInstance(LoginPage.class));
			Assert.assertTrue(CurrentPage.As(LoginPage.class).esVisibleBtnGestionesOnLine());
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "02_Se Ingresa a Centros de Atención Personalizada";
			CurrentPage = (new CentrosDeAtencionProvinciaPage().GetInstance(CentrosDeAtencionProvinciaPage.class));
			Assert.assertTrue(CurrentPage.As(CentrosDeAtencionProvinciaPage.class).esVisibleBtnCentrosDeAtencion());
			CurrentPage.As(CentrosDeAtencionProvinciaPage.class).clickBtnCentrosDeAtencion();
			Assert.assertTrue(CurrentPage.As(CentrosDeAtencionProvinciaPage.class).esVisibleBtnBuscarPorCercania());
			Assert.assertTrue(CurrentPage.As(CentrosDeAtencionProvinciaPage.class).esVisibleBtnBuscarPorProvincia());
			Assert.assertTrue(CurrentPage.As(CentrosDeAtencionProvinciaPage.class).esVisibleTxtCentrosAtencion());
			Assert.assertEquals(CurrentPage.As(CentrosDeAtencionProvinciaPage.class).recuperarTxtCentrosAtencion(),"0810.555.6733\n CENTRO DE ATENCIÓN\nTELEFÓNICA");
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "03_Se ingresa a Buscar por Provincia";
			CurrentPage.As(CentrosDeAtencionProvinciaPage.class).clickBtnBuscarPorProvincia();
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "04_Se hace selecciona la Provincia";
			CurrentPage.As(CentrosDeAtencionProvinciaPage.class).clickBtnBuscarPorProvincia();
			CurrentPage.As(CentrosDeAtencionProvinciaPage.class).clickComboProvincia();
			CurrentPage.As(CentrosDeAtencionProvinciaPage.class).clickProvinciaCABA();
			Assert.assertTrue(CurrentPage.As(CentrosDeAtencionProvinciaPage.class).esVisibleComboProvincia());
			Assert.assertTrue(CurrentPage.As(CentrosDeAtencionProvinciaPage.class).esVisibleComboLocalidad());
			log.LogMobile.SuccessStep(nombrePaso);

			nombrePaso = "05_Se ingresa a seleccionar la Localidad";
			CurrentPage.As(CentrosDeAtencionProvinciaPage.class).clickComboLocalidad();
			CurrentPage.As(CentrosDeAtencionProvinciaPage.class).clickLocalidad();
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "06_Se Presiona Buscar y se verifican los elementos del resultado";
			CurrentPage.As(CentrosDeAtencionProvinciaPage.class).clickBuscarProvincia();
			Assert.assertTrue(CurrentPage.As(CentrosDeAtencionProvinciaPage.class).esVisibleMapaListadoResultados());
			Assert.assertTrue(CurrentPage.As(CentrosDeAtencionProvinciaPage.class).esVisibleTituloListadoResultados());
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "07_Se verifica que se active el Protector de pantalla";
			CurrentPage = (new CartillaMedicaPage().GetInstance(CartillaMedicaPage.class));
			Assert.assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleProtectorPantalla());
			CurrentPage.As(CartillaMedicaPage.class).clicProtectorPantalla();
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "08_Se Presiona Volver varias  veces";
			CurrentPage = (new CentrosDeAtencionProvinciaPage().GetInstance(CentrosDeAtencionProvinciaPage.class));
			CurrentPage.As(CentrosDeAtencionProvinciaPage.class).clickVolver();
			Assert.assertTrue(CurrentPage.As(CentrosDeAtencionProvinciaPage.class).esVisibleComboProvincia());
			Assert.assertTrue(CurrentPage.As(CentrosDeAtencionProvinciaPage.class).esVisibleComboLocalidad());
			CurrentPage.As(CentrosDeAtencionProvinciaPage.class).clickVolver();
			Assert.assertTrue(CurrentPage.As(CentrosDeAtencionProvinciaPage.class).esVisibleBtnBuscarPorCercania());
			Assert.assertTrue(CurrentPage.As(CentrosDeAtencionProvinciaPage.class).esVisibleBtnBuscarPorProvincia());
			CurrentPage.As(CentrosDeAtencionProvinciaPage.class).clickVolver();
			Assert.assertTrue(CurrentPage.As(CentrosDeAtencionProvinciaPage.class).esVisibleBtnGestionesOnLine());
			log.LogMobile.SuccessStep(nombrePaso);
		
			StepHelperMobile.takeScreenShot(testName);

		} catch (AssertionError ex) {
			log.LogMobile.info(ex.getMessage());
			log.LogMobile.FailStep(nombrePaso);
			Assert.fail("Fallo test - " + testName + " - Step: " + nombrePaso);
		}

		log.LogMobile.endTestCase(testName);
	}

}
