package steps;

import org.testng.Assert;
import base.BaseStepMobile;
import config.DataSetterMobile;
import context.UsuarioMobile;
import helpers.StepHelperMobile;
import helpers.XMLHelperMobile;
import pages.CartillaMedicaPage;
import pages.CentrosDeAtencionPage;
import pages.LoginPage;

public class CentrosDeAtencionVisualizacionCercaniaStep extends BaseStepMobile {

	public static void Run(String testName) {
		String nombrePaso = "";
		log.LogMobile.startTestCase(testName);

		try {
			
			nombrePaso = "01_Se Acepta el mensaje de permitir";
			//Tengo que hacer un if si aparece o no el mensaje, porque no siempre aparece
			CurrentPage = (new CartillaMedicaPage().GetInstance(CartillaMedicaPage.class));
			CurrentPage.As(CartillaMedicaPage.class).clickPermitir();
			log.LogMobile.SuccessStep(nombrePaso);			
			CurrentPage = (new LoginPage().GetInstance(LoginPage.class));
//			StepHelperMobile.takeScreenShot(testName);
			Assert.assertTrue(CurrentPage.As(LoginPage.class).esVisibleBtnGestionesOnLine());
			
			nombrePaso = "02_Se Ingresa a Centros de Atención Personalizada";
			CurrentPage = (new CentrosDeAtencionPage().GetInstance(CentrosDeAtencionPage.class));
//			StepHelperMobile.takeScreenShot(testName);
			Assert.assertTrue(CurrentPage.As(CentrosDeAtencionPage.class).esVisibleBtnCentrosDeAtencion());
			CurrentPage.As(CentrosDeAtencionPage.class).clickBtnCentrosDeAtencion();
			log.LogMobile.SuccessStep(nombrePaso);			
			
			nombrePaso = "03_Se ingresa a Buscar por cercanía y validamos el contenido de la pagina";
			Assert.assertTrue(CurrentPage.As(CentrosDeAtencionPage.class).esVisibleBtnBuscarPorCercania());
			CurrentPage.As(CentrosDeAtencionPage.class).clickBtnBuscarPorCercania();
			Assert.assertTrue(CurrentPage.As(CentrosDeAtencionPage.class).esVisibleTxtUbicacionActual());
			Assert.assertTrue(CurrentPage.As(CentrosDeAtencionPage.class).esVisibleMapa());
			Assert.assertTrue(CurrentPage.As(CentrosDeAtencionPage.class).esVisibleBtnBuscar());
			log.LogMobile.SuccessStep(nombrePaso);			

		} catch (AssertionError ex) {
			log.LogMobile.info(ex.getMessage());
			log.LogMobile.FailStep(nombrePaso);
			Assert.fail("Fallo test - " + testName + " - Step: " + nombrePaso);
		}

		log.LogMobile.endTestCase(testName);
	}

}
