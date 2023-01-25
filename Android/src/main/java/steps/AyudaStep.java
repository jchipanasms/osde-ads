package steps;

import org.testng.Assert;
import base.BaseStepMobile;
import helpers.StepHelperMobile;
import log.LogMobile;
import pages.AyudaPage;
import pages.CartillaMedicaPage;
import pages.LoginPage;

public class AyudaStep extends BaseStepMobile {

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
			
			nombrePaso = "02_Se Ingresa a Ayuda";			
			CurrentPage = (new AyudaPage().GetInstance(AyudaPage.class));
			Assert.assertTrue(CurrentPage.As(AyudaPage.class).esVisibleBtnAyuda());
			CurrentPage.As(AyudaPage.class).clickAyuda();
			Assert.assertTrue(CurrentPage.As(AyudaPage.class).esVisibleVideo());
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "03_Se presiona Volver y se verifica esta accin";
			CurrentPage.As(AyudaPage.class).clickVolver();
			Assert.assertTrue(CurrentPage.As(AyudaPage.class).esVisibleBtnAyuda());
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
