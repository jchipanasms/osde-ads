package steps;

import org.testng.Assert;
import base.BaseStepMobile;
import helpers.StepHelperMobile;
import log.LogMobile;
import pages.CartillaMedicaPage;
import pages.LoginPage;
import pages.TelefonosPage;

public class TelefonosStep extends BaseStepMobile {

	public static void Run(String testName) {
		String nombrePaso = "";
						
		try {
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
			
			nombrePaso = "02_Se verifica que se muestre el titulo telefono";
			CurrentPage = (new TelefonosPage().GetInstance(TelefonosPage.class));
			CurrentPage.As(TelefonosPage.class).clickTelefonos();
			Assert.assertTrue(CurrentPage.As(TelefonosPage.class).esVisibleTituloTelefono());
			Assert.assertEquals(CurrentPage.As(TelefonosPage.class).recuperarTxtTelefono()," TELÉFONOS");
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "03_Se verifica que se muestre el titulo Urgencias y sus telefonos";
			Assert.assertEquals(CurrentPage.As(TelefonosPage.class).recuperarTxtTelefonoUrgencias()," URGENCIAS");
			Assert.assertEquals(CurrentPage.As(TelefonosPage.class).recuperarTxtTelefonoUrgenciasNro1(),"0810.888.7788");
			Assert.assertEquals(CurrentPage.As(TelefonosPage.class).recuperarTxtTelefonoUrgenciasNro2(),"0810.999.6300");			
			Assert.assertEquals(CurrentPage.As(TelefonosPage.class).recuperarTxtTelefonoUrgenciaWapp(),"(+54911) 4872 9100");
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "04_Se verifica que se muestre el titulo Riesgo de Vida y el telfono";
			Assert.assertEquals(CurrentPage.As(TelefonosPage.class).recuperarTxtTelefonoRiesgoVida()," RIESGO DE VIDA");
			Assert.assertEquals(CurrentPage.As(TelefonosPage.class).recuperarTxtTelefonoRiesgoVidaNro(),"0810.666.1111");
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "05_Se verifica que se muestre el titulo Centro de Atencin Telefnica y el telfono";
			Assert.assertEquals(CurrentPage.As(TelefonosPage.class).recuperarTxtTelefonoCentroAtencion()," CENTRO DE ATENCIÓN TELEFÓNICA\n Lunes a Viernes de 9 a 20 hs");
			Assert.assertEquals(CurrentPage.As(TelefonosPage.class).recuperarTxtTelefonoCentroAtencionNro(),"0810.555.6733");
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "06_Se verifica que se muestre el titulo Centro de Atencin Digital y el telfono";
			Assert.assertEquals(CurrentPage.As(TelefonosPage.class).recuperarTxtTelefonoCentroDigital()," CENTRO DE ATENCIÓN DIGITAL\n Lunes a Viernes de 9 a 20 hs");
			Assert.assertEquals(CurrentPage.As(TelefonosPage.class).recuperarTxtTelefonoCentroDigitalNro(),"(+54911) 4872 9000");
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "07_Se verifica que se Presione el Protector de pantalla";
			CurrentPage = (new CartillaMedicaPage().GetInstance(CartillaMedicaPage.class));
			Assert.assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleProtectorPantalla());
			CurrentPage.As(CartillaMedicaPage.class).clicProtectorPantalla();
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "08_Se verifica que se Presione el botn Volver y se vuelva a la pgina de inicio";
			CurrentPage.As(CartillaMedicaPage.class).clickVolver();
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
