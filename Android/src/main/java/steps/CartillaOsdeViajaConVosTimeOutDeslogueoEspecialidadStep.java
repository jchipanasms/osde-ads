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

public class CartillaOsdeViajaConVosTimeOutDeslogueoEspecialidadStep extends BaseStepMobile {

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
			
			nombrePaso = "03_Se ingresa a Buscar por especialidad y validamos que se encuentre el popup de timeout luego de 30seg";
			CurrentPage.As(CartillaMedicaPage.class).clicSubMenuOsdeViajaConVos("buscar por especialidad");
			try {
				Thread.sleep(33000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			CurrentPage = (new GestionesOnlinePage().GetInstance(GestionesOnlinePage.class));
			assertTrue(CurrentPage.As(GestionesOnlinePage.class).verificarTimeout());
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "04_Luego de los 30seg validamos que se encuentre deslogueado el usuario y este en pantalla de inicio";
			try {
				Thread.sleep(30000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			CurrentPage = (new CartillaMedicaPage().GetInstance(CartillaMedicaPage.class));
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
