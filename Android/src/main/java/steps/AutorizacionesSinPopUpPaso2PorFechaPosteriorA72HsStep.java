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

public class AutorizacionesSinPopUpPaso2PorFechaPosteriorA72HsStep extends BaseStepMobile {

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
			
			nombrePaso = "03_Se valida que nos encontremos en pantalla y hacemos clic en Internación - Cirugía";
			CurrentPage = (new AutorizacionesPage().GetInstance(AutorizacionesPage.class));
			Assert.assertTrue(CurrentPage.As(AutorizacionesPage.class).esVisibleTitulo());
			Assert.assertTrue(CurrentPage.As(AutorizacionesPage.class).esVisibleSubTitulo());
			CurrentPage.As(AutorizacionesPage.class).autorizacion_a_realizar("Internación - Cirugía");
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "04_Desde el paso 1 seleccionamos un socio, damos clic al check y presionamos siguiente";
			CurrentPage.As(AutorizacionesPage.class).seleccionarSocio("Bernardo Antonio Omar Rodriguez");
			CurrentPage.As(AutorizacionesPage.class).clic_check();
			CurrentPage.As(AutorizacionesPage.class).clic_boton_siguiente();
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "05_Desde el paso 2 seteamos una fecha posterior a 72hs para no visualizar el popup";
			CurrentPage.As(AutorizacionesPage.class).clic_fecha();
			CurrentPage = (new ReintegrosPage().GetInstance(ReintegrosPage.class));
			CurrentPage.As(ReintegrosPage.class).setFecha("10", "Sep.", "2020");
			CurrentPage = (new AutorizacionesPage().GetInstance(AutorizacionesPage.class));
			CurrentPage.As(AutorizacionesPage.class).clic_siguiente_paso2();
			log.LogMobile.SuccessStep(nombrePaso);

			nombrePaso = "06_Verificamos que nos encontremos en el paso 3";
			Assert.assertTrue(CurrentPage.As(AutorizacionesPage.class).autorizacionesDe("internación o cirugía"));
			Assert.assertTrue(CurrentPage.As(AutorizacionesPage.class).existeSubtitulo("Adjuntá el pedido del médico"));
			Assert.assertTrue(CurrentPage.As(AutorizacionesPage.class).existeTitulosDeCamposPaso3());
			Assert.assertTrue(CurrentPage.As(AutorizacionesPage.class).esVisibleBtnSiguiente());
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
