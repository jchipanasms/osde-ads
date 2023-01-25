package steps;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.ScreenOrientation;
import org.testng.Assert;
import base.BaseStepMobile;
import config.DataSetterMobile;
import context.UsuarioMobile;
import helpers.StepHelperMobile;
import helpers.XMLHelperMobile;
import pages.CamaraPage;
import pages.CartillaMedicaPage;
import pages.GestionesOnlinePage;
import pages.LoginPage;
import pages.ReintegrosPage;
import pages.CartillaMedicaPage;

public class ReintegrosVisualizarProteccionDatosStep extends BaseStepMobile {

	public static void Run(String testName) {
		String nombrePaso = "";
		log.LogMobile.startTestCase(testName);

		try {
			
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
						
			nombrePaso = "02_Se realiza clic en el modulo reintegros";
			CurrentPage = (new GestionesOnlinePage().GetInstance(GestionesOnlinePage.class));
			CurrentPage.As(GestionesOnlinePage.class).clickModulo("reintegros");
			log.LogMobile.SuccessStep(nombrePaso);	
			
			nombrePaso = "03_Se realiza clic en proteccion de datos personales";
			CurrentPage = (new ReintegrosPage().GetInstance(ReintegrosPage.class));
			CurrentPage.As(ReintegrosPage.class).click_proteccionDatos();
			assertTrue(CurrentPage.As(ReintegrosPage.class).visualizaTituloProteccion());
			log.LogMobile.SuccessStep(nombrePaso);

			nombrePaso = "04_Le damos clic al boton de cruz y verificamos que permanezca en el paso 1";
			CurrentPage.As(ReintegrosPage.class).click_cruz();
			assertTrue(CurrentPage.As(ReintegrosPage.class).estasEnPaso1());
			log.LogMobile.SuccessStep(nombrePaso);	
			
		} catch (AssertionError ex) {
			log.LogMobile.info(ex.getMessage());
			log.LogMobile.FailStep(nombrePaso);
			Assert.fail("Fallo test - " + testName + " - Step: " + nombrePaso);
		}

		log.LogMobile.endTestCase(testName);
	}

}
