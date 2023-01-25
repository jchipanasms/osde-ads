package steps;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import base.BaseStepMobile;
import config.DataSetterMobile;
import context.UsuarioMobile;
import helpers.StepHelperMobile;
import helpers.XMLHelperMobile;
import pages.CartillaMedicaPage;
import pages.GestionesOnlinePage;
import pages.LoginPage;

public class CartillaOsdeViajaConVosUsuarioLogueadoServiciosStep extends BaseStepMobile {

	public static void Run(String testName) {
		String nombrePaso = "";
		log.LogMobile.startTestCase(testName);

		try {

			UsuarioMobile usr = XMLHelperMobile.object.getUsuarioMobile();
						
			nombrePaso = "01_Se realiza el login y le damos clic atras para ir al inicio";
			CurrentPage = (new CartillaMedicaPage().GetInstance(CartillaMedicaPage.class));
			CurrentPage.As(CartillaMedicaPage.class).clickPermitir();
			
			CurrentPage = (new LoginPage().GetInstance(LoginPage.class));
			//StepHelperMobile.takeScreenShot(testName);				
			CurrentPage.As(LoginPage.class).clickIniciarSesion();
			CurrentPage.As(LoginPage.class).ingresardocumento(usr.getDocumento());
			CurrentPage.As(LoginPage.class).ingresarContrasenia(usr.getPassword());
			CurrentPage.As(LoginPage.class).clickIngresar();
			CurrentPage = (new GestionesOnlinePage().GetInstance(GestionesOnlinePage.class));
			Assert.assertTrue(CurrentPage.As(GestionesOnlinePage.class).esVisibleBtnVolver_tramites());
			CurrentPage.As(GestionesOnlinePage.class).clic_btn_volver_tramites();
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "02_Se ingresa a Cartilla Médica y seleccionamos OSDE viaja con vos";
			//StepHelperMobile.takeScreenShot(testName);
			CurrentPage = (new CartillaMedicaPage().GetInstance(CartillaMedicaPage.class));
			CurrentPage.As(CartillaMedicaPage.class).clickCartillaMedica();
			CurrentPage.As(CartillaMedicaPage.class).clic_osdeViajaConVos();			
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "03_Se ingresa a servicios en el exterior y validamos que se encuentre el nombre, volver y botón deslogueo";
			CurrentPage.As(CartillaMedicaPage.class).clicSubMenuOsdeViajaConVos("servicios en el exterior");
			//assertTrue(CurrentPage.As(CartillaMedicaPage.class).seEncuentraMensajeImportante());
			CurrentPage.As(CartillaMedicaPage.class).clic_continuarEnMensaje();
			Assert.assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleSocio("anibal carlos rucco"));
			Assert.assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleBtnVolver());
			Assert.assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleBtnDeslogueo());	
			log.LogMobile.SuccessStep(nombrePaso);

		} catch (AssertionError ex) {
			log.LogMobile.info(ex.getMessage());
			log.LogMobile.FailStep(nombrePaso);
			Assert.fail("Fallo test - " + testName + " - Step: " + nombrePaso);
		}

		log.LogMobile.endTestCase(testName);
	}

}
