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

public class LoginStep extends BaseStepMobile {

	public static void Run(String testName) {
		String nombrePaso = "";
				
		try {
			
			UsuarioMobile usr = XMLHelperMobile.object.getUsuarioMobile();
						
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
			
			nombrePaso = "03_Se Ingresa al Link de Politicas de Privacidad";
			CurrentPage = (new LoginPage().GetInstance(LoginPage.class));
			Assert.assertTrue(CurrentPage.As(LoginPage.class).esVisibleLnkPoliticasPrivacidad());
			CurrentPage.As(LoginPage.class).clickLnkPoliticasPrivacidad();
		//	Assert.assertTrue(CurrentPage.As(LoginPage.class).esVisibleTituloPoliticasPrivacidad());
		//	Assert.assertTrue(CurrentPage.As(LoginPage.class).esVisibleInfoPoliticasPrivacidad());
			CurrentPage.As(LoginPage.class).clickPanioGral();
			CurrentPage.As(LoginPage.class).clickBtnCerrarPoliticas();
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "04_Se Ingresa a Olvide mi contrasea";
			CurrentPage.As(LoginPage.class).clickLinkOlvideMiContrasea();
			Assert.assertTrue(CurrentPage.As(LoginPage.class).esVisibleLinkOlvideCorreoElectronico());
			Assert.assertTrue(CurrentPage.As(LoginPage.class).esVisibleBtnEnviar());
		//	CurrentPage.As(LoginPage.class).ingresardocumentoOlvideContrasenia(usr.getDocumento());
		//	CurrentPage.As(LoginPage.class).clickBtnCerrarOlvideContrasea();
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "05_Se Ingresa a Olvide mi correo electronico";
	  		CurrentPage.As(LoginPage.class).clickLinkOlvideCorreoElectronico();
	  		CurrentPage.As(LoginPage.class).clickPanioGral();
	  		CurrentPage.As(LoginPage.class).clickBtnCerrarOlvideMiCorreo();
	  		CurrentPage.As(LoginPage.class).clickPanioGral();
	  		CurrentPage.As(LoginPage.class).clickBtnCerrarOlvideContrasea();
	  		log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "06_Se Ingresa a Registrarme";
			CurrentPage.As(LoginPage.class).clickLinkRegistrarme();
			CurrentPage.As(LoginPage.class).clickBtnCerrarRegistrarme();
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "07_Se realiza el login";
			CurrentPage.As(LoginPage.class).ingresardocumento(usr.getDocumento());
			CurrentPage.As(LoginPage.class).clickPanio();
			CurrentPage.As(LoginPage.class).ingresarContrasenia(usr.getPassword());
			CurrentPage.As(LoginPage.class).clickPanio();
			CurrentPage.As(LoginPage.class).clickIngresar();
	//		Assert.assertTrue(CurrentPage.As(LoginPage.class).esVisibleNombreLogueo());
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "08_Se realiza el deslogueo";
			CurrentPage = (new CartillaMedicaPage().GetInstance(CartillaMedicaPage.class));
			CurrentPage.As(CartillaMedicaPage.class).clickBtnCerrarSesion();
			CurrentPage.As(CartillaMedicaPage.class).clickBtnAceptarCerrarSesion();
			Assert.assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleBtnCartillaMedica());
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
