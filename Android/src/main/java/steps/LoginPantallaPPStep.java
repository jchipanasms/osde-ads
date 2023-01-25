package steps;

import org.testng.Assert;
import base.BaseStepMobile;
import context.UsuarioMobile;
import helpers.StepHelperMobile;
import helpers.XMLHelperMobile;
import log.LogMobile;
import pages.CartillaMedicaPage;
import pages.EmpadronamientoPage;
import pages.LoginPage;
import pages.PantallaInicioPage;
import pages.TelefonosPage;

public class LoginPantallaPPStep extends BaseStepMobile {

	public static void Run(String testName) {
		String nombrePaso = "";
						
		try {
			StepHelperMobile.takeScreenShot(testName);
			UsuarioMobile usr = XMLHelperMobile.object.getUsuarioMobile();
			
			nombrePaso = "01_Se Acepta el mensaje de permitir";
			try {
				CurrentPage = (new CartillaMedicaPage().GetInstance(CartillaMedicaPage.class));
				CurrentPage.As(CartillaMedicaPage.class).clickPermitir();
			} catch (Exception e) {
				LogMobile.info("No se muestra alerta");
			}
			
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "02_Se verifican los elementos de la Pantalla Principal";
			CurrentPage = (new PantallaInicioPage().GetInstance(PantallaInicioPage.class));
			Assert.assertTrue(CurrentPage.As(PantallaInicioPage.class).esVisibleBtnGestionesOnLine());
			Assert.assertTrue(CurrentPage.As(PantallaInicioPage.class).esVisibleBtnCartillaMedica());
			Assert.assertTrue(CurrentPage.As(PantallaInicioPage.class).esVisibleBtnTelefonos());
			Assert.assertTrue(CurrentPage.As(PantallaInicioPage.class).esVisibleBtnCentrosAtencion());
			Assert.assertTrue(CurrentPage.As(PantallaInicioPage.class).esVisibleBtnAyuda());
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "03_Se ingresa a Gestiones Online";
			CurrentPage.As(PantallaInicioPage.class).clickGestionesOnLine();
			CurrentPage = (new LoginPage().GetInstance(LoginPage.class));
			Assert.assertTrue(CurrentPage.As(LoginPage.class).esVisibleTxtDoc());
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "04_Se realiza el login";
			CurrentPage.As(LoginPage.class).ingresardocumento(usr.getDocumento());
			CurrentPage.As(LoginPage.class).clickPanio();
			CurrentPage.As(LoginPage.class).ingresarContrasenia(usr.getPassword());
			CurrentPage.As(LoginPage.class).clickIngresar();
			Assert.assertTrue(CurrentPage.As(LoginPage.class).esVisibleBtnEmpadronamiento());
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "05_Se vuelve a la pantalla de Inicio y se verifican los elementos";
			CurrentPage = (new CartillaMedicaPage().GetInstance(CartillaMedicaPage.class));
			Assert.assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleBtnVolver());
			Assert.assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleBtnCerrarSesion());
			CurrentPage.As(CartillaMedicaPage.class).clickPanioGral();
			CurrentPage.As(CartillaMedicaPage.class).clickVolver();
			Assert.assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleBtnCartillaMedica());
			log.LogMobile.SuccessStep(nombrePaso);
								
			nombrePaso = "06_Se verifica que se muestre el mensaje de deslogueo luego de los 30 segundos";
			Assert.assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleMsjDeslogueo());
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "07_Se hace click en el mensaje de deslogueo";
			CurrentPage.As(CartillaMedicaPage.class).clickMsjDeslogueo();
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "08_Se verifica que se continúe en la pantalla Principal";
			Assert.assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleBtnCartillaMedica());
			log.LogMobile.SuccessStep(nombrePaso);
					
			nombrePaso = "09_Se realiza el deslogueo";			
			CurrentPage.As(CartillaMedicaPage.class).clickBtnCerrarSesion();
			CurrentPage.As(CartillaMedicaPage.class).clickBtnAceptarCerrarSesion();
			Assert.assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleBtnCartillaMedica());
			log.LogMobile.SuccessStep(nombrePaso);
			
			
			nombrePaso = "10_Se verifica que se Presione el Protector de pantalla";
			Assert.assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleProtectorPantalla());
			CurrentPage.As(CartillaMedicaPage.class).clicProtectorPantalla();
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
