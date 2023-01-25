package steps;

import static org.testng.Assert.assertFalse;
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

public class CartillaOsdeViajaConVosDeslogueoDesdeCercaniaStep extends BaseStepMobile {

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
			
			nombrePaso = "03_Se ingresa a Buscar por cercanía, completamos el formulario y buscar";
			CurrentPage.As(CartillaMedicaPage.class).clicSubMenuOsdeViajaConVos("buscar por cercania");
			CurrentPage.As(CartillaMedicaPage.class).clic_planes_desde("cercania");
			CurrentPage.As(CartillaMedicaPage.class).seleccionPlan("450");
			CurrentPage.As(CartillaMedicaPage.class).clic_especialidad_desde("cercania");
			CurrentPage.As(CartillaMedicaPage.class).seleccionEspecialidad("urgencias odontológicas");
			assertTrue(CurrentPage.As(CartillaMedicaPage.class).estaEnUbicacionActual());
			CurrentPage.As(CartillaMedicaPage.class).setearUbicacion("av. rivadavia 3000, argentina");
			assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleMapa());
			CurrentPage.As(CartillaMedicaPage.class).clic_buscar_desde("cercania");
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "04_Se desloguea al usuario";
			CurrentPage.As(CartillaMedicaPage.class).click_deslogueo();
			CurrentPage.As(CartillaMedicaPage.class).aceptar_deslogueo();
			log.LogMobile.SuccessStep(nombrePaso);

			nombrePaso = "05_Se validan que el usuario se encuentre deslogueado en el inicio";
			Assert.assertFalse(CurrentPage.As(CartillaMedicaPage.class).esVisibleBtnDeslogueo());	
			CurrentPage = (new LoginPage().GetInstance(LoginPage.class));
			assertTrue(CurrentPage.As(LoginPage.class).esVisibleBtnGestionesOnLine());
			assertFalse(CurrentPage.As(LoginPage.class).esVisibleLabelSocio());
			log.LogMobile.SuccessStep(nombrePaso);

		} catch (AssertionError ex) {
			log.LogMobile.info(ex.getMessage());
			log.LogMobile.FailStep(nombrePaso);
			Assert.fail("Fallo test - " + testName + " - Step: " + nombrePaso);
		}

		log.LogMobile.endTestCase(testName);
	}

}
