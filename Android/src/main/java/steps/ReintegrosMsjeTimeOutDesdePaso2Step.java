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

public class ReintegrosMsjeTimeOutDesdePaso2Step extends BaseStepMobile {

	public static void Run(String testName) {
		String nombrePaso = "";
		log.LogMobile.startTestCase(testName);

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
			
			nombrePaso = "03_Se completan los datos del paso 1 y continuar";
			CurrentPage = (new ReintegrosPage().GetInstance(ReintegrosPage.class));
			CurrentPage.As(ReintegrosPage.class).seleccionar_tipo_practica("Consulta médica");
			CurrentPage.As(ReintegrosPage.class).seleccionar_paciente("ANIBAL CARLOS rucco");
			CurrentPage.As(ReintegrosPage.class).click_continuar();
			log.LogMobile.SuccessStep(nombrePaso);	
			
			nombrePaso = "04_Se espera el mensaje popup deslogueo luego de 30seg.";
			try {
				Thread.sleep(33000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			CurrentPage = (new GestionesOnlinePage().GetInstance(GestionesOnlinePage.class));
			assertTrue(CurrentPage.As(GestionesOnlinePage.class).verificarTimeout());
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "05_Una vez que desaparece el popup, verificamos que el usuario se encuentre deslogueado";
			try {
				Thread.sleep(30000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			CurrentPage = (new LoginPage().GetInstance(LoginPage.class));
			assertFalse(CurrentPage.As(LoginPage.class).esVisibleLabelSocio());
			assertTrue(CurrentPage.As(LoginPage.class).esVisibleBtnGestionesOnLine());
			log.LogMobile.SuccessStep(nombrePaso);	
			
		} catch (AssertionError ex) {
			log.LogMobile.info(ex.getMessage());
			log.LogMobile.FailStep(nombrePaso);
			Assert.fail("Fallo test - " + testName + " - Step: " + nombrePaso);
		}

		log.LogMobile.endTestCase(testName);
	}

}
