package steps;

import org.testng.Assert;
import base.BaseStepMobile;
import config.DataSetterMobile;
import context.UsuarioMobile;
import helpers.StepHelperMobile;
import helpers.XMLHelperMobile;
import log.LogMobile;
import pages.CartillaMedicaPage;
import pages.EmpadronamientoPage;
import pages.FacturacionPage;
import pages.LoginPage;
import pages.ReintegrosPage;
import pages.TelefonosPage;
import pages.CartillaMedicaPage;

public class FacturacionStep extends BaseStepMobile {

	public static void Run(String testName) {
		String nombrePaso = "";
				
		try {
			
			UsuarioMobile usr = XMLHelperMobile.object.getUsuarioMobile();
		
			StepHelperMobile.takeScreenShot(testName);
			
	/*		nombrePaso = "01_Se Acepta el mensaje de permitir";
			//Tengo que hacer un if si aparece o no el mensaje, porque no siempre aparece esto debera hacerse ni bien se habre para todos
			CurrentPage = (new CartillaMedicaPage().GetInstance(CartillaMedicaPage.class));
			CurrentPage.As(CartillaMedicaPage.class).clickPermitir();
			CurrentPage = (new LoginPage().GetInstance(LoginPage.class));
			Assert.assertTrue(CurrentPage.As(LoginPage.class).esVisibleBtnGestionesOnLine());
			log.LogMobile.SuccessStep(nombrePaso);
			
			*/
			
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
	//		Assert.assertTrue(CurrentPage.As(LoginPage.class).esVisibleNombreLogueo());
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "04_Se verifica el boton Facturación";
			CurrentPage = (new FacturacionPage().GetInstance(FacturacionPage.class));
			Assert.assertTrue(CurrentPage.As(FacturacionPage.class).esVisibleBtnFacturacion());
			CurrentPage.As(FacturacionPage.class).clickBtnFacturacion();
			log.LogMobile.SuccessStep(nombrePaso);
				
			nombrePaso = "05_Se verifican los elementos";
			Assert.assertTrue(CurrentPage.As(FacturacionPage.class).esVisibleTitulo());	
			Assert.assertEquals(CurrentPage.As(FacturacionPage.class).recuperarTxtTitulo(),"Facturación");
		//	Assert.assertTrue(CurrentPage.As(FacturacionPage.class).esVisibleLeyendaSinComprobantes());
		//	Assert.assertEquals(CurrentPage.As(FacturacionPage.class).recuperarTxtLeyendaSinComprobantes(),"No se encontraron comprobantes.");
	
			CurrentPage.As(FacturacionPage.class).clickBtnEstadoCuenta();
			Assert.assertTrue(CurrentPage.As(FacturacionPage.class).esVisiblePopUpEnviarDocumentacion());
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "07_Se realiza el deslogueo";
			Assert.assertTrue(CurrentPage.As(FacturacionPage.class).esVisibleBtnVolver());
			Assert.assertTrue(CurrentPage.As(FacturacionPage.class).esVisibleBtnCerrarSesion());			
			CurrentPage.As(FacturacionPage.class).clickBtnCerrarSesion();
			CurrentPage.As(FacturacionPage.class).clickBtnAceptarCerrarSesion();
			CurrentPage = (new LoginPage().GetInstance(LoginPage.class));
			Assert.assertTrue(CurrentPage.As(LoginPage.class).esVisibleBtnGestionesOnLine());
		//	Assert.assertFalse(CurrentPage.As(LoginPage.class).esVisibleNombreLogueo());
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
