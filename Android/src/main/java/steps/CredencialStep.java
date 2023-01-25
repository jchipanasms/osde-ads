package steps;

import org.testng.Assert;
import base.BaseStepMobile;
import context.UsuarioMobile;
import helpers.StepHelperMobile;
import helpers.XMLHelperMobile;
import log.LogMobile;
import pages.CartillaMedicaPage;
import pages.CredencialPage;
import pages.LoginPage;

public class CredencialStep extends BaseStepMobile {

	public static void Run(String testName) {
		String nombrePaso = "";
				
		try {
			
			UsuarioMobile usr = XMLHelperMobile.object.getUsuarioMobile();
			
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
			
			nombrePaso = "02_Se ingresa a Gestiones Online";
			CurrentPage.As(LoginPage.class).clickGestionesOnLine();
			Assert.assertTrue(CurrentPage.As(LoginPage.class).esVisibleTxtDoc());
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "03_Se realiza el login";
			CurrentPage.As(LoginPage.class).ingresardocumento(usr.getDocumento());
			CurrentPage.As(LoginPage.class).clickPanio();
			CurrentPage.As(LoginPage.class).ingresarContrasenia(usr.getPassword());
			CurrentPage.As(LoginPage.class).clickIngresar();
			CurrentPage = (new CredencialPage().GetInstance(CredencialPage.class));			
			Assert.assertTrue(CurrentPage.As(CredencialPage.class).esVisibleBtnCredenciales());
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "04_Se ingresa a Credenciales";
			CurrentPage.As(CredencialPage.class).clickBtnCredenciales();
			Assert.assertTrue(CurrentPage.As(CredencialPage.class).esVisibleNombreLogueo());
		//	Assert.assertEquals(CurrentPage.As(TelefonosPage.class).recuperarTxtTituloCredenciales(),"Extraviaste tu credencial? Llegaste al consultorio y te la olvidaste? An no la recibiste en tu domicilio?");
			Assert.assertTrue(CurrentPage.As(CredencialPage.class).esVisibleBtnGenerarCredencial());
			CurrentPage.As(CredencialPage.class).clickBtnGenerarCredencial();
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "05_Se verifican los elementos de Credenciales";
			Assert.assertTrue(CurrentPage.As(CredencialPage.class).esVisibleSelectorMotivo());
			Assert.assertTrue(CurrentPage.As(CredencialPage.class).esVisibleSelectorFamiliar());
			Assert.assertTrue(CurrentPage.As(CredencialPage.class).esVisibleCondicionServicio());
			Assert.assertTrue(CurrentPage.As(CredencialPage.class).esVisibleGenerarCredencial());
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "06_Se Ingresa a Condiciones de Servicio";
			CurrentPage.As(CredencialPage.class).clickCondicionServicio();
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "07_Se verifica que se Existan los botones de atras y el de deslogueo";
			CurrentPage = (new LoginPage().GetInstance(LoginPage.class));
			Assert.assertTrue(CurrentPage.As(LoginPage.class).esVisibleBtnVolver());
			Assert.assertTrue(CurrentPage.As(LoginPage.class).esVisibleBtnCerrarSesion());
			//Assert.assertTrue(CurrentPage.As(LoginPage.class).esVisiblePopUpTiempo());
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "08_Se realiza el deslogueo";
			CurrentPage.As(LoginPage.class).clickBtnCerrarSesion();
			CurrentPage.As(LoginPage.class).clickBtnAceptarCerrarSesion();
			Assert.assertTrue(CurrentPage.As(LoginPage.class).esVisibleBtnGestionesOnLine());
			log.LogMobile.SuccessStep(nombrePaso);
			
			
		} catch (AssertionError ex) {
			log.LogMobile.info(ex.getMessage());
			log.LogMobile.FailStep(nombrePaso);
			Assert.fail("Fallo test - " + testName + " - Step: " + nombrePaso);
		}

		log.LogMobile.endTestCase(testName);
	}

}
