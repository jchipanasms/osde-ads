package steps;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

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

public class AutorizacionesDeslogueoDesdePaso4Step extends BaseStepMobile {

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
			
			nombrePaso = "04_En el paso 1 seleccionamos un socio, damos clic al check y presionamos siguiente";
			Assert.assertTrue(CurrentPage.As(AutorizacionesPage.class).autorizacionesDe("internación o cirugía"));
			CurrentPage.As(AutorizacionesPage.class).seleccionarSocio("Bernardo Antonio Omar Rodriguez");
			CurrentPage.As(AutorizacionesPage.class).clic_check();
			CurrentPage.As(AutorizacionesPage.class).clic_boton_siguiente();
			log.LogMobile.SuccessStep(nombrePaso);

			nombrePaso = "05_Se completa el paso 2 y presionamos en siguiente";
			Assert.assertTrue(CurrentPage.As(AutorizacionesPage.class).autorizacionesDe("internación o cirugía"));
			CurrentPage.As(AutorizacionesPage.class).clic_fecha();
			CurrentPage = (new ReintegrosPage().GetInstance(ReintegrosPage.class));
			CurrentPage.As(ReintegrosPage.class).setFecha("04", "dic.", "2020");
			CurrentPage = (new AutorizacionesPage().GetInstance(AutorizacionesPage.class));
			CurrentPage.As(AutorizacionesPage.class).clic_siguiente_paso2();
			log.LogMobile.SuccessStep(nombrePaso);

			//solo se puede validar este paso en caso de setear la fecha actual sino no muestra popup de advertencia
//			nombrePaso = "09_Se verifica el popup antes de pasar al paso 3";
//			Assert.assertTrue(CurrentPage.As(AutorizacionesPage.class).esVisiblePopUpPaso2());
//			log.LogMobile.SuccessStep(nombrePaso);
//
//			nombrePaso = "10_Presionamos en continuar al popup";
//			CurrentPage.As(AutorizacionesPage.class).clic_continuar_popup();
//			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "06_Se adjunta un pedido medico (validamos que se haya adjuntado) y presionamos en siguiente";
			Assert.assertTrue(CurrentPage.As(AutorizacionesPage.class).autorizacionesDe("internación o cirugía"));
			Assert.assertTrue(CurrentPage.As(AutorizacionesPage.class).existeSubtitulo("Adjuntá el pedido del médico"));
			CurrentPage.As(AutorizacionesPage.class).click_adjuntar();
			CurrentPage.As(AutorizacionesPage.class).click_camara();
			
			//Paso para adjuntar comprobante con la camara		
			CurrentPage = (new CamaraPage().GetInstance(CamaraPage.class));
			CurrentPage.As(CamaraPage.class).click_otorgar_permiso_camara();
			driver.rotate(ScreenOrientation.LANDSCAPE);
			CurrentPage.As(CamaraPage.class).click_tomar_captura();
			try {
				Thread.sleep(7000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			CurrentPage.As(CamaraPage.class).click_confirmar_captura();
			//driver.rotate(ScreenOrientation.LANDSCAPE);
			
			CurrentPage = (new AutorizacionesPage().GetInstance(AutorizacionesPage.class));
			Assert.assertTrue(CurrentPage.As(AutorizacionesPage.class).nombreArchivoAdjunto("pedido_medico.jpg"));
			CurrentPage.As(AutorizacionesPage.class).clic_siguiente();
			log.LogMobile.SuccessStep(nombrePaso);

			nombrePaso = "07_Verificamos que nos encontremos en el paso 4";
			Assert.assertTrue(CurrentPage.As(AutorizacionesPage.class).autorizacionesDe("internación o cirugía"));
			Assert.assertTrue(CurrentPage.As(AutorizacionesPage.class).existeSubtitulo("Datos de contacto"));
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "08_Presionamos en el boton deslogueo y aceptamos";
			CurrentPage = (new GestionesOnlinePage().GetInstance(GestionesOnlinePage.class));
			Assert.assertTrue(CurrentPage.As(GestionesOnlinePage.class).esVisibleBtnDeslogueo());
			CurrentPage.As(GestionesOnlinePage.class).click_deslogueo();
			CurrentPage.As(GestionesOnlinePage.class).aceptar_deslogueo();
			log.LogMobile.SuccessStep(nombrePaso);	

			nombrePaso = "09_Verificamos que nos encontremos en inicio";
			CurrentPage = (new LoginPage().GetInstance(LoginPage.class));
			assertTrue(CurrentPage.As(LoginPage.class).esVisibleBtnGestionesOnLine());
			assertFalse(CurrentPage.As(LoginPage.class).esVisibleLabelSocio());
			assertFalse(CurrentPage.As(LoginPage.class).esVisibleBtnCerrarSesion());
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
