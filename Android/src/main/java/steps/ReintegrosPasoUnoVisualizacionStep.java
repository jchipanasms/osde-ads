package steps;

import org.testng.Assert;
import base.BaseStepMobile;
import context.UsuarioMobile;
import helpers.StepHelperMobile;
import helpers.XMLHelperMobile;
import pages.CartillaMedicaPage;
import pages.GestionesOnlinePage;
import pages.LoginPage;
import pages.ReintegrosPage;

public class ReintegrosPasoUnoVisualizacionStep extends BaseStepMobile {

	public static void Run(String testName) {
		String nombrePaso = "";
				
		try {
			
			log.LogMobile.startTestCase(testName);

			UsuarioMobile usr = XMLHelperMobile.object.getUsuarioMobile();
						
			nombrePaso = "01_Se realiza el login";
			CurrentPage = (new CartillaMedicaPage().GetInstance(CartillaMedicaPage.class));
			CurrentPage.As(CartillaMedicaPage.class).clickPermitir();
			
			CurrentPage = (new LoginPage().GetInstance(LoginPage.class));
			//StepHelperMobile.takeScreenShot(testName);				
			CurrentPage.As(LoginPage.class).clickIniciarSesion();
			
			CurrentPage.As(LoginPage.class).ingresardocumento(usr.getDocumento());
			CurrentPage.As(LoginPage.class).ingresarContrasenia(usr.getPassword());
			CurrentPage.As(LoginPage.class).clickIngresar();
			log.LogMobile.SuccessStep(nombrePaso);	
			
			//StepHelperMobile.takeScreenShot(testName);

			nombrePaso = "02_Se realiza clic en el modulo reintegros";
			CurrentPage = (new GestionesOnlinePage().GetInstance(GestionesOnlinePage.class));
			CurrentPage.As(GestionesOnlinePage.class).clickModulo("reintegros");
			log.LogMobile.SuccessStep(nombrePaso);	
			
			try {
				Thread.sleep(8000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			nombrePaso = "03_Se verifica el contenido del paso 1";
			Assert.assertTrue(CurrentPage.As(GestionesOnlinePage.class).esVisibleNombreSocio("anibal carlos rucco"));
			Assert.assertTrue(CurrentPage.As(GestionesOnlinePage.class).esVisibleBtnVolver());
			Assert.assertTrue(CurrentPage.As(GestionesOnlinePage.class).esVisibleBtnDeslogueo());
			CurrentPage = (new ReintegrosPage().GetInstance(ReintegrosPage.class));
			Assert.assertTrue(CurrentPage.As(ReintegrosPage.class).verificaElTextoPaso1());
			log.LogMobile.SuccessStep(nombrePaso);	
			
		} catch (AssertionError ex) {
			log.LogMobile.info(ex.getMessage());
			log.LogMobile.FailStep(nombrePaso);
			Assert.fail("Fallo test - " + testName + " - Step: " + nombrePaso);
		}

		log.LogMobile.endTestCase(testName);
	}

}
