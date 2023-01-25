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

public class CentrosDeAtencionCercaniaVolverResultadoListaStep extends BaseStepMobile {

	public static void Run(String testName) {
		String nombrePaso = "";
		log.LogMobile.startTestCase(testName);

		try {
			
			nombrePaso = "01_Se Acepta el mensaje de permitir";
			//Tengo que hacer un if si aparece o no el mensaje, porque no siempre aparece
			CurrentPage = (new CartillaMedicaPage().GetInstance(CartillaMedicaPage.class));
			CurrentPage.As(CartillaMedicaPage.class).clickPermitir();
			log.LogMobile.SuccessStep(nombrePaso);			
			
			nombrePaso = "02_Se Ingresa a Centros de Atención Personalizada";
			CurrentPage = (new CentrosDeAtencionPage().GetInstance(CentrosDeAtencionPage.class));
			CurrentPage.As(CentrosDeAtencionPage.class).clickBtnCentrosDeAtencion();
			log.LogMobile.SuccessStep(nombrePaso);			
			
			nombrePaso = "03_Se ingresa a Buscar por cercanía y establecemos una dirección especifica";
			CurrentPage.As(CentrosDeAtencionPage.class).clickBtnBuscarPorCercania();
			CurrentPage.As(CentrosDeAtencionPage.class).clic_ubicacion();
			CurrentPage.As(CentrosDeAtencionPage.class).setearUbicacion("av. rivadavia 3000, argentina");
			Assert.assertTrue(CurrentPage.As(CentrosDeAtencionPage.class).esVisibleBtnBuscar());
			log.LogMobile.SuccessStep(nombrePaso);			
			
			nombrePaso = "04_Se hace clic en el botón Buscar";
			CurrentPage.As(CentrosDeAtencionPage.class).clickBtnBuscar();
			Assert.assertTrue(CurrentPage.As(CentrosDeAtencionPage.class).esVisibleListadoResultados());
			log.LogMobile.SuccessStep(nombrePaso);	
			
			nombrePaso = "05_Se hace clic en el listado de Resultados y presionamos en volver";
			CurrentPage.As(CentrosDeAtencionPage.class).clickBtnListadoResultados();
			CurrentPage.As(CentrosDeAtencionPage.class).clickVolver();
			log.LogMobile.SuccessStep(nombrePaso);

			nombrePaso = "06_Validamos que nos encontremos en la pantalla de resultados por mapa";
			Assert.assertTrue(CurrentPage.As(CentrosDeAtencionPage.class).esCorrectoElTituloEnMapa());
			Assert.assertTrue(CurrentPage.As(CentrosDeAtencionPage.class).esVisibleListadoResultados());
			Assert.assertTrue(CurrentPage.As(CentrosDeAtencionPage.class).esVisibleMapaResultados());
			log.LogMobile.SuccessStep(nombrePaso);

		} catch (AssertionError ex) {
			log.LogMobile.info(ex.getMessage());
			log.LogMobile.FailStep(nombrePaso);
			Assert.fail("Fallo test - " + testName + " - Step: " + nombrePaso);
		}

		log.LogMobile.endTestCase(testName);
	}

}
