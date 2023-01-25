package steps;

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

public class ReintegrosCancelarScaneoDeDocStep extends BaseStepMobile {

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

			try {
				Thread.sleep(5000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			nombrePaso = "04_Se toma captura y validamos que se haya adjuntado correctamente el comprobante";
			CurrentPage.As(ReintegrosPage.class).swipe_vertical();
			//Paso para adjuntar comprobante con la camara
			CurrentPage.As(ReintegrosPage.class).click_adjuntar_comprobante();
			CurrentPage.As(ReintegrosPage.class).click_camara();		
			CurrentPage = (new CamaraPage().GetInstance(CamaraPage.class));
			CurrentPage.As(CamaraPage.class).click_otorgar_permiso_camara();
			CurrentPage.As(CamaraPage.class).click_tomar_captura();
			try {
				Thread.sleep(7000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			CurrentPage.As(CamaraPage.class).click_cancelar_captura();
			assertTrue(CurrentPage.As(CamaraPage.class).esVisibleBtnTomarCaptura());
			System.out.println("pasa la validacion de boton capturar");
			log.LogMobile.SuccessStep(nombrePaso);	
			
		} catch (AssertionError ex) {
			log.LogMobile.info(ex.getMessage());
			log.LogMobile.FailStep(nombrePaso);
			Assert.fail("Fallo test - " + testName + " - Step: " + nombrePaso);
		}

		log.LogMobile.endTestCase(testName);
	}

}
