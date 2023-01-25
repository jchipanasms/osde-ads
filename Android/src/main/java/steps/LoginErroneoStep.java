package steps;

import org.testng.Assert;
import base.BaseStepMobile;
import context.UsuarioMobile;
import helpers.StepHelperMobile;
import helpers.XMLHelperMobile;
import log.LogMobile;
import pages.CartillaMedicaPage;
import pages.LoginPage;

public class LoginErroneoStep extends BaseStepMobile {

	public static void Run(String testName) {
		String nombrePaso = "";
				
		try {
			
			UsuarioMobile usr = XMLHelperMobile.object.getUsuarioMobile();
			
			
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
			
			nombrePaso = "02_Se ingresa al Men Lateral";
			
			CurrentPage.As(LoginPage.class).clickMenuLateral();
			Assert.assertTrue(CurrentPage.As(LoginPage.class).esVisibleBtnIniciarSesion());
			log.LogMobile.startTestCase(testName);
			
			nombrePaso = "03_Se realiza click en Iniciar Sesin";
			
			CurrentPage.As(LoginPage.class).clickIniciarSesion();
			Assert.assertTrue(CurrentPage.As(LoginPage.class).esVisibleTxtDoc());
			log.LogMobile.startTestCase(testName);
			
			nombrePaso = "04_Se realiza el login";
				
			CurrentPage.As(LoginPage.class).ingresardocumento(usr.getDocumento());
			CurrentPage.As(LoginPage.class).clickPanio();
			CurrentPage.As(LoginPage.class).ingresarContrasenia(usr.getPassword());
			CurrentPage.As(LoginPage.class).clickPanio();
			CurrentPage.As(LoginPage.class).clickIngresar();
			Assert.assertTrue(CurrentPage.As(LoginPage.class).esVisiblePopUpDatosInvalidos());
			CurrentPage.As(LoginPage.class).clickBtnAceptarPopUp();
		//	CurrentPage.As(LoginPage.class).clickPao();
		//	CurrentPage.As(LoginPage.class).ingresardocumento(usr.getDocumento());
			
			log.LogMobile.startTestCase(testName);		
			
			StepHelperMobile.takeScreenShot(testName);

		} catch (AssertionError ex) {
			log.LogMobile.info(ex.getMessage());
			log.LogMobile.FailStep(nombrePaso);
			Assert.fail("Fallo test - " + testName + " - Step: " + nombrePaso);
		}

		log.LogMobile.endTestCase(testName);
	}

}
