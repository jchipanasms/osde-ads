package steps;

import org.testng.Assert;
import base.BaseStepMobile;
import config.DataSetterMobile;
import context.UsuarioMobile;
import helpers.StepHelperMobile;
import helpers.XMLHelperMobile;
import pages.CartillaMedicaPage;
import pages.LoginPage;

public class CartillaOsdeViajaConVosVisualizacionStep extends BaseStepMobile {

	public static void Run(String testName) {
		String nombrePaso = "";
		log.LogMobile.startTestCase(testName);

		try {

			nombrePaso = "01_Se Acepta el mensaje de permitir";
			try {
				CurrentPage = (new CartillaMedicaPage().GetInstance(CartillaMedicaPage.class));
				CurrentPage.As(CartillaMedicaPage.class).clickPermitir();
			} catch (Exception e) {
				log.LogMobile.info("No se muestra alerta");
			}
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "02_Se Ingresa a Cartilla Médica";
			//StepHelperMobile.takeScreenShot(testName);
			CurrentPage.As(CartillaMedicaPage.class).clickCartillaMedica();
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "03_Se ingresa a OSDE viaja con vos y validamos que se encuentren todas las opciones";
			CurrentPage.As(CartillaMedicaPage.class).clic_osdeViajaConVos();
			Assert.assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleSubMenuOsdeViajaConVos("buscar por cercania"));
			Assert.assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleSubMenuOsdeViajaConVos("buscar por especialidad"));
			Assert.assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleSubMenuOsdeViajaConVos("buscar por nombre"));
			Assert.assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleSubMenuOsdeViajaConVos("servicios en el exterior"));			
			log.LogMobile.SuccessStep(nombrePaso);

		} catch (AssertionError ex) {
			log.LogMobile.info(ex.getMessage());
			log.LogMobile.FailStep(nombrePaso);
			Assert.fail("Fallo test - " + testName + " - Step: " + nombrePaso);
		}

		log.LogMobile.endTestCase(testName);
	}

}
