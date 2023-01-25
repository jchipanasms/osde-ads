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

public class EmpadronamientoStep extends BaseStepMobile {

	public static void Run(String testName) {
		String nombrePaso = "";
				
		try {
			
			UsuarioMobile usr = XMLHelperMobile.object.getUsuarioMobile();
			
			StepHelperMobile.takeScreenShot(testName);
			
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
		//	Assert.assertFalse(CurrentPage.As(LoginPage.class).esVisibleNombreLogueo());
			CurrentPage = (new EmpadronamientoPage().GetInstance(EmpadronamientoPage.class));
			Assert.assertTrue(CurrentPage.As(EmpadronamientoPage.class).esVisibleBtnEmpadronamiento());
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "04_Se ingresa a Empadronamiento";
			CurrentPage.As(EmpadronamientoPage.class).clickBtnEmpadronamiento();	
			log.LogMobile.SuccessStep(nombrePaso);		
			
			nombrePaso = "05_Se verifican los elementos de Empadronamiento";
			Assert.assertTrue(CurrentPage.As(EmpadronamientoPage.class).esVisibleTerminosCondiciones());
			Assert.assertTrue(CurrentPage.As(EmpadronamientoPage.class).esVisibleProteccionDatos());
			Assert.assertTrue(CurrentPage.As(EmpadronamientoPage.class).esVisibleFamiliar());
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "06_Se Selecciona el familiar y se verfica que se habilite el botón Siguiente";
			CurrentPage.As(EmpadronamientoPage.class).clickFamiliar();
			Assert.assertTrue(CurrentPage.As(EmpadronamientoPage.class).esVisibleBtnSiguiente());
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "07_Se Presiona Siguiente";
			CurrentPage.As(EmpadronamientoPage.class).clickBtnSiguiente();
			Assert.assertTrue(CurrentPage.As(EmpadronamientoPage.class).esVisibleAntecedentes());			
			Assert.assertTrue(CurrentPage.As(EmpadronamientoPage.class).esVisibleBtnSiguienteAntecedentes());			
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "08_Se Selecciona Ninguna de las anteriores y se presiona siguiente";
			CurrentPage.As(EmpadronamientoPage.class).clickCheckAntecedentes();			
			CurrentPage.As(EmpadronamientoPage.class).clickBtnSiguienteAntecedentes();
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "09_Se verifican los elementos de la página";
			Assert.assertTrue(CurrentPage.As(EmpadronamientoPage.class).esVisibleBtnEditarIntegrante());
			Assert.assertTrue(CurrentPage.As(EmpadronamientoPage.class).esVisibleMotivoPrescripcion());
			Assert.assertTrue(CurrentPage.As(EmpadronamientoPage.class).esVisibleBtnGenerarTramite());
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "10_Se vuelven dos pasos";
			CurrentPage.As(EmpadronamientoPage.class).clickBtnVolver();
			CurrentPage.As(EmpadronamientoPage.class).clickBtnVolver();
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "11_Se verifican los elementos de la pagina";
			Assert.assertTrue(CurrentPage.As(EmpadronamientoPage.class).esVisibleLnkProteccion());
			Assert.assertTrue(CurrentPage.As(EmpadronamientoPage.class).esVisibleLnkTerminos());
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "12_Se ingresa a el Link de protección de Datos";
			CurrentPage.As(EmpadronamientoPage.class).clickLnkProteccion();
			CurrentPage.As(EmpadronamientoPage.class).clickBtnCerrarLnks();
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "13_Se ingresa a el Link de Términos  y condiciones";
			CurrentPage.As(EmpadronamientoPage.class).clickLnkTerminos();
			CurrentPage.As(EmpadronamientoPage.class).clickBtnCerrarLnks();
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "14_Se realiza el deslogueo";			
			CurrentPage.As(EmpadronamientoPage.class).clickBtnCerrarSesion();
			CurrentPage.As(EmpadronamientoPage.class).clickBtnAceptarCerrarSesion();
			CurrentPage = (new LoginPage().GetInstance(LoginPage.class));
			Assert.assertTrue(CurrentPage.As(LoginPage.class).esVisibleBtnGestionesOnLine());
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
