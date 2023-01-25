package steps;

import org.testng.Assert;
import base.BaseStepMobile;
import config.DataSetterMobile;
import context.UsuarioMobile;
import helpers.StepHelperMobile;
import helpers.XMLHelperMobile;
import pages.CartillaMedicaPage;
import pages.CentrosDeAtencionPage;
import pages.GestionesOnlinePage;
import pages.LoginPage;

public class CentrosDeAtencionCercaniaLogueadoStep extends BaseStepMobile {

	public static void Run(String testName) {
		String nombrePaso = "";
		log.LogMobile.startTestCase(testName);

		try {
			
			UsuarioMobile usr = XMLHelperMobile.object.getUsuarioMobile();
			
			nombrePaso = "01_Se realiza el login y le damos clic atras para ir al inicio";
			CurrentPage = (new CartillaMedicaPage().GetInstance(CartillaMedicaPage.class));
			CurrentPage.As(CartillaMedicaPage.class).clickPermitir();
			CurrentPage = (new LoginPage().GetInstance(LoginPage.class));
			CurrentPage.As(LoginPage.class).clickIniciarSesion();
			CurrentPage.As(LoginPage.class).ingresardocumento(usr.getDocumento());
			CurrentPage.As(LoginPage.class).ingresarContrasenia(usr.getPassword());
			CurrentPage.As(LoginPage.class).clickIngresar();
			CurrentPage = (new GestionesOnlinePage().GetInstance(GestionesOnlinePage.class));
			Assert.assertTrue(CurrentPage.As(GestionesOnlinePage.class).esVisibleBtnVolver_tramites());
			CurrentPage.As(GestionesOnlinePage.class).clic_btn_volver_tramites();
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "02_Se Ingresa a Centros de Atención Personalizada";
			CurrentPage = (new CentrosDeAtencionPage().GetInstance(CentrosDeAtencionPage.class));
//			StepHelperMobile.takeScreenShot(testName);
			Assert.assertTrue(CurrentPage.As(CentrosDeAtencionPage.class).esVisibleBtnCentrosDeAtencion());
			CurrentPage.As(CentrosDeAtencionPage.class).clickBtnCentrosDeAtencion();
			log.LogMobile.SuccessStep(nombrePaso);			
			
			nombrePaso = "03_Se ingresa a Buscar por cercanía";
			Assert.assertTrue(CurrentPage.As(CentrosDeAtencionPage.class).esVisibleBtnBuscarPorCercania());
			CurrentPage.As(CentrosDeAtencionPage.class).clickBtnBuscarPorCercania();
			log.LogMobile.SuccessStep(nombrePaso);	
			
			nombrePaso = "04_Se validan la pantalla que aparezcan los elementos, nombre usuario, boton volver y deslogueo";
			Assert.assertTrue(CurrentPage.As(CentrosDeAtencionPage.class).esVisibleTxtUbicacionActual());
			Assert.assertTrue(CurrentPage.As(CentrosDeAtencionPage.class).esVisibleMapa());
			Assert.assertTrue(CurrentPage.As(CentrosDeAtencionPage.class).esVisibleBtnBuscar());
			CurrentPage = (new CartillaMedicaPage().GetInstance(CartillaMedicaPage.class));
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
