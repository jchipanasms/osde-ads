package steps;

import org.openqa.selenium.ScreenOrientation;
import org.testng.Assert;
import base.BaseStepMobile;
import config.DataSetterMobile;
import context.UsuarioMobile;
import helpers.StepHelperMobile;
import helpers.XMLHelperMobile;
import pages.AutorizacionesPage;
import pages.CamaraPage;
import pages.CartillaMedicaPage;
import pages.GestionesOnlinePage;
import pages.LoginPage;
import pages.ReintegrosPage;
import pages.CartillaMedicaPage;

public class AutorizacionesPresionarVolverDesdePaso1Step extends BaseStepMobile {

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
			CurrentPage.As(LoginPage.class).ingresardocumento(usr.getDocumento());
			CurrentPage.As(LoginPage.class).clickIngresar();
			log.LogMobile.SuccessStep(nombrePaso);	
			
			//StepHelperMobile.takeScreenShot(testName);

			nombrePaso = "02_Se realiza clic en el modulo autorizaciones";
			CurrentPage = (new GestionesOnlinePage().GetInstance(GestionesOnlinePage.class));
			CurrentPage.As(GestionesOnlinePage.class).clickModulo("autorizaciones");
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "03_Hacemos clic en Internación - Cirugía";
			CurrentPage = (new AutorizacionesPage().GetInstance(AutorizacionesPage.class));
			Assert.assertTrue(CurrentPage.As(AutorizacionesPage.class).esVisibleTitulo());
			Assert.assertTrue(CurrentPage.As(AutorizacionesPage.class).esVisibleSubTitulo());
			Assert.assertTrue(CurrentPage.As(AutorizacionesPage.class).existenOpcionesEnListaAut());
			CurrentPage.As(AutorizacionesPage.class).autorizacion_a_realizar("Internación - Cirugía");
			log.LogMobile.SuccessStep(nombrePaso);	
			
			nombrePaso = "05_Se verifica que nos encontremos en el paso 1";
			Assert.assertTrue(CurrentPage.As(AutorizacionesPage.class).autorizacionesDe("internación o cirugía"));
			Assert.assertTrue(CurrentPage.As(AutorizacionesPage.class).existeSubtitulo("¿Para quién es?"));
			Assert.assertTrue(CurrentPage.As(AutorizacionesPage.class).existeSociosEnLista());
			Assert.assertTrue(CurrentPage.As(AutorizacionesPage.class).existeTermCheckYProteccionDatos());
			Assert.assertTrue(CurrentPage.As(AutorizacionesPage.class).existeBtnSiguiente());
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "06_Presionamos en volver y verificamos que nos encontremos en la primera pantalla";
			CurrentPage = (new GestionesOnlinePage().GetInstance(GestionesOnlinePage.class));
			CurrentPage.As(GestionesOnlinePage.class).volver();
			Assert.assertTrue(CurrentPage.As(GestionesOnlinePage.class).esVisibleNombreSocio("Bernardo Antonio Omar Rodriguez"));
			Assert.assertTrue(CurrentPage.As(GestionesOnlinePage.class).esVisibleBtnVolver());
			Assert.assertTrue(CurrentPage.As(GestionesOnlinePage.class).esVisibleBtnDeslogueo());
			CurrentPage = (new AutorizacionesPage().GetInstance(AutorizacionesPage.class));
			Assert.assertTrue(CurrentPage.As(AutorizacionesPage.class).esVisibleTitulo());
			Assert.assertTrue(CurrentPage.As(AutorizacionesPage.class).esVisibleSubTitulo());
			Assert.assertTrue(CurrentPage.As(AutorizacionesPage.class).existenOpcionesEnListaAut());
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
