package steps;

import org.testng.Assert;
import base.BaseStepMobile;
import context.UsuarioMobile;
import helpers.StepHelperMobile;
import helpers.XMLHelperMobile;
import log.LogMobile;
import pages.CartillaMedicaPage;
import pages.DatosDeContactoPage;
import pages.LoginPage;

public class DatosdeContactoStep extends BaseStepMobile {

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
			CurrentPage = (new DatosDeContactoPage().GetInstance(DatosDeContactoPage.class));
			Assert.assertTrue(CurrentPage.As(DatosDeContactoPage.class).esVisibleBtnDatosContacto());
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "04_Se ingresa a Datos de contacto";
			CurrentPage.As(DatosDeContactoPage.class).clickBtnDatosContacto();
			log.LogMobile.SuccessStep(nombrePaso);		
			
			nombrePaso = "05_Se verifican los elementos del formulario";
			//agregar tiempo aca..
			Assert.assertTrue(CurrentPage.As(DatosDeContactoPage.class).esVisibleEmailContacto());
			Assert.assertTrue(CurrentPage.As(DatosDeContactoPage.class).esVisibleBtnAgregarEmail());
			Assert.assertTrue(CurrentPage.As(DatosDeContactoPage.class).esVisibleBtnModificarResidencia());
			Assert.assertTrue(CurrentPage.As(DatosDeContactoPage.class).esVisibleBtnModificarCorrespondencia());
			
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "06_Se ingresa a Agregar Email y se verfican los elementos";
			CurrentPage.As(DatosDeContactoPage.class).clickBtnAgregarEmail();
			Assert.assertTrue(CurrentPage.As(DatosDeContactoPage.class).esVisibleTxtEmail());
			Assert.assertTrue(CurrentPage.As(DatosDeContactoPage.class).esVisibleBtnCancelarEmail());
			Assert.assertTrue(CurrentPage.As(DatosDeContactoPage.class).esVisibleBtnGuardarEmail());
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "07_Se Cancela la Opcion de Agregar Email";
			CurrentPage.As(DatosDeContactoPage.class).clickBtnCancelarEmail();
			Assert.assertTrue(CurrentPage.As(DatosDeContactoPage.class).esVisibleEmailContacto());
			Assert.assertTrue(CurrentPage.As(DatosDeContactoPage.class).esVisibleBtnAgregarEmail());
			Assert.assertTrue(CurrentPage.As(DatosDeContactoPage.class).esVisibleBtnModificarResidencia());
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "08_Se ingresa a Modificar Residencia y se verifican los elementos";
			CurrentPage.As(DatosDeContactoPage.class).clickBtnModificarResidencia();
			Assert.assertTrue(CurrentPage.As(DatosDeContactoPage.class).esVisibleCmbProvincia());
			Assert.assertTrue(CurrentPage.As(DatosDeContactoPage.class).esVisibleCmbLocalidad());
			Assert.assertTrue(CurrentPage.As(DatosDeContactoPage.class).esVisibleTxtCodPostal());
			Assert.assertTrue(CurrentPage.As(DatosDeContactoPage.class).esVisibleCmbCalle());
			Assert.assertTrue(CurrentPage.As(DatosDeContactoPage.class).esVisibleTxtNro());
			Assert.assertTrue(CurrentPage.As(DatosDeContactoPage.class).esVisibleTxtPiso());
			Assert.assertTrue(CurrentPage.As(DatosDeContactoPage.class).esVisibleTxtBarrio());
			Assert.assertTrue(CurrentPage.As(DatosDeContactoPage.class).esVisibleTxtCodArea());
			Assert.assertTrue(CurrentPage.As(DatosDeContactoPage.class).esVisibleTxtInternoTelFijo());
			Assert.assertTrue(CurrentPage.As(DatosDeContactoPage.class).esVisibleTxtCodAreaMovil());
			Assert.assertTrue(CurrentPage.As(DatosDeContactoPage.class).esVisibleTxtNroTelMovil());
			Assert.assertTrue(CurrentPage.As(DatosDeContactoPage.class).esVisibleBtnMasTelefonos());
			Assert.assertTrue(CurrentPage.As(DatosDeContactoPage.class).esVisibleBtnCancelarDR());
			Assert.assertTrue(CurrentPage.As(DatosDeContactoPage.class).esVisibleBtnGuardarDR());
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "09_Se Accede al botn mas telfonos y se verifican los elementos";
			CurrentPage.As(DatosDeContactoPage.class).clickBtnMasTelefonos();
			Assert.assertTrue(CurrentPage.As(DatosDeContactoPage.class).esVisibleTxtTelMT());
			Assert.assertTrue(CurrentPage.As(DatosDeContactoPage.class).esVisibleTxtTelMTInt());
			Assert.assertTrue(CurrentPage.As(DatosDeContactoPage.class).esVisibleTxtTelMTMovil());
			Assert.assertTrue(CurrentPage.As(DatosDeContactoPage.class).esVisibleBtnCancelarTel());
			Assert.assertTrue(CurrentPage.As(DatosDeContactoPage.class).esVisibleBtnGuardarTel());
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "09_Se Cancela la modificacin de telefonos";
			CurrentPage.As(DatosDeContactoPage.class).clickBtnCancelarTel();	
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "10_Se Cancela la modificacin de Residencia";
			Assert.assertTrue(CurrentPage.As(DatosDeContactoPage.class).esVisibleBtnCancelarResidencia());
			Assert.assertTrue(CurrentPage.As(DatosDeContactoPage.class).esVisibleBtnGuardarResidencia());
			CurrentPage.As(DatosDeContactoPage.class).clickBtnCancelarResidencia();	
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "11_Se Ingresa a Modificar Domicilio de Correspondencia y se verifican los elementos";
			CurrentPage.As(DatosDeContactoPage.class).ScrollDown();
			CurrentPage.As(DatosDeContactoPage.class).clickBtnModificarCorrespondencia();	
			Assert.assertTrue(CurrentPage.As(DatosDeContactoPage.class).esVisibleCmbProvincia());
			Assert.assertTrue(CurrentPage.As(DatosDeContactoPage.class).esVisibleCmbLocalidad());
			Assert.assertTrue(CurrentPage.As(DatosDeContactoPage.class).esVisibleTxtCodPostal());
			Assert.assertTrue(CurrentPage.As(DatosDeContactoPage.class).esVisibleCmbCalle());
			Assert.assertTrue(CurrentPage.As(DatosDeContactoPage.class).esVisibleTxtNro());
			Assert.assertTrue(CurrentPage.As(DatosDeContactoPage.class).esVisibleTxtPiso());
			Assert.assertTrue(CurrentPage.As(DatosDeContactoPage.class).esVisibleTxtBarrio());
			Assert.assertTrue(CurrentPage.As(DatosDeContactoPage.class).esVisibleTxtCodArea());
			Assert.assertTrue(CurrentPage.As(DatosDeContactoPage.class).esVisibleTxtInternoTelFijo());
			Assert.assertTrue(CurrentPage.As(DatosDeContactoPage.class).esVisibleTxtCodAreaMovil());
			Assert.assertTrue(CurrentPage.As(DatosDeContactoPage.class).esVisibleTxtNroTelMovil());
			Assert.assertTrue(CurrentPage.As(DatosDeContactoPage.class).esVisibleBtnMasTelefonos());
			Assert.assertTrue(CurrentPage.As(DatosDeContactoPage.class).esVisibleBtnCancelarDR());
			Assert.assertTrue(CurrentPage.As(DatosDeContactoPage.class).esVisibleBtnGuardarDR());
		//	CurrentPage.As(DatosDeContactoPage.class).clickBtnCancelarResidencia();	
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "12_Se Accede al botn mas telfonos y se verifican los elementos";
			CurrentPage.As(DatosDeContactoPage.class).clickBtnMasTelefonos();
			Assert.assertTrue(CurrentPage.As(DatosDeContactoPage.class).esVisibleTxtTelMT());
			Assert.assertTrue(CurrentPage.As(DatosDeContactoPage.class).esVisibleTxtTelMTInt());
			Assert.assertTrue(CurrentPage.As(DatosDeContactoPage.class).esVisibleTxtTelMTMovil());
			Assert.assertTrue(CurrentPage.As(DatosDeContactoPage.class).esVisibleBtnCancelarTel());
			Assert.assertTrue(CurrentPage.As(DatosDeContactoPage.class).esVisibleBtnGuardarTel());
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "13_Se Cancela la modificacin de telefonos";
			CurrentPage.As(DatosDeContactoPage.class).clickBtnCancelarTel();	
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "14_Se Cancela la modificacin de Residencia";
			Assert.assertTrue(CurrentPage.As(DatosDeContactoPage.class).esVisibleBtnCancelarResidencia());
			Assert.assertTrue(CurrentPage.As(DatosDeContactoPage.class).esVisibleBtnGuardarResidencia());
			CurrentPage.As(DatosDeContactoPage.class).clickBtnCancelarResidencia();	
			Assert.assertTrue(CurrentPage.As(DatosDeContactoPage.class).esVisibleBtnAgregarEmail());
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "15_Se realiza el deslogueo";
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
