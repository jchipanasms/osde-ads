package steps;

import org.openqa.selenium.ScreenOrientation;
import org.testng.Assert;
import base.BaseStepMobile;
import config.DataSetterMobile;
import context.UsuarioMobile;
import helpers.StepHelperMobile;
import helpers.XMLHelperMobile;
import log.LogMobile;
import pages.CamaraPage;
import pages.CartillaMedicaPage;
import pages.EmpadronamientoPage;
import pages.GestionesOnlinePage;
import pages.LoginPage;
import pages.ReintegrosPage;
import pages.CartillaMedicaPage;

public class ReintegrosStep extends BaseStepMobile {

	public static void Run(String testName) {
		String nombrePaso = "";
		log.LogMobile.startTestCase(testName);

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
			log.LogMobile.SuccessStep(nombrePaso);
			
	/*		CurrentPage = (new LoginPage().GetInstance(LoginPage.class));
			CurrentPage.As(LoginPage.class).clickIniciarSesion();
			
			CurrentPage.As(LoginPage.class).ingresardocumento(usr.getDocumento());
			CurrentPage.As(LoginPage.class).ingresarContrasenia(usr.getPassword());
			CurrentPage.As(LoginPage.class).clickIngresar();
			log.LogMobile.SuccessStep(nombrePaso);	*/
			
		
			nombrePaso = "04_Se realiza clic en el modulo reintegros";
			CurrentPage = (new GestionesOnlinePage().GetInstance(GestionesOnlinePage.class));
			CurrentPage.As(GestionesOnlinePage.class).clickModulo("reintegros");
			log.LogMobile.SuccessStep(nombrePaso);	
			
		/*	try {
				Thread.sleep(8000);
			} catch (Exception e) {
				// TODO: handle exception
			}*/
			
			nombrePaso = "05_Se completan los datos del paso 1 y continuar";
			CurrentPage = (new ReintegrosPage().GetInstance(ReintegrosPage.class));
			CurrentPage.As(ReintegrosPage.class).seleccionar_tipo_practica("Consulta médica");
			CurrentPage.As(ReintegrosPage.class).seleccionar_paciente("ANIBAL CARLOS rucco");
			CurrentPage.As(ReintegrosPage.class).click_continuar();
			log.LogMobile.SuccessStep(nombrePaso);	

			try {
				Thread.sleep(5000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			nombrePaso = "06_Se completan los datos del paso 2 y generar tramite";
			CurrentPage.As(ReintegrosPage.class).ingresar_cuit("20303690736");
			CurrentPage.As(ReintegrosPage.class).ingresar_facturado_a("claudia silvina horazi");
			CurrentPage.As(ReintegrosPage.class).ingresar_tipo_doc_receptor("cuit");
			CurrentPage.As(ReintegrosPage.class).ingresar_doc_receptor("20340057962");
			CurrentPage.As(ReintegrosPage.class).ingresar_tipo_comprobante("recibo c");
			CurrentPage.As(ReintegrosPage.class).ingresar_pto_venta("0001");
			CurrentPage.As(ReintegrosPage.class).ingresar_nro_comprobante("00000012");
			CurrentPage.As(ReintegrosPage.class).ingresar_fecha_emision("01", "feb.", "2020");
			
			CurrentPage.As(ReintegrosPage.class).swipe_vertical();

			CurrentPage.As(ReintegrosPage.class).ingresar_cod_cae("69366715149719");
			CurrentPage.As(ReintegrosPage.class).ingresar_vencimiento_cae("16", "Ago.", "2021");
			CurrentPage.As(ReintegrosPage.class).ingresar_importe("2329000");	//los ultimos 2 digitos son centavos
			
			//Paso para adjuntar comprobante con la camara
			CurrentPage.As(ReintegrosPage.class).click_adjuntar_comprobante();
			CurrentPage.As(ReintegrosPage.class).click_camara();		
			CurrentPage = (new CamaraPage().GetInstance(CamaraPage.class));
			CurrentPage.As(CamaraPage.class).click_otorgar_permiso_camara();
			CurrentPage.As(CamaraPage.class).click_tomar_captura();
			try {
				Thread.sleep(7000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			CurrentPage.As(CamaraPage.class).click_confirmar_captura();
		
			driver.rotate(ScreenOrientation.LANDSCAPE);	//tuve que agregar esta linea para obligar a que este en modo vertical por la camara
			
			CurrentPage = (new ReintegrosPage().GetInstance(ReintegrosPage.class));
			CurrentPage.As(ReintegrosPage.class).ingresar_email("jchipana@sms-sudamerica.com");
			//CurrentPage.As(ReintegrosPage.class).click_generar_tramite();
			log.LogMobile.SuccessStep(nombrePaso);	
						
			try {
				Thread.sleep(10000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		} catch (AssertionError ex) {
			log.LogMobile.info(ex.getMessage());
			log.LogMobile.FailStep(nombrePaso);
			Assert.fail("Fallo test - " + testName + " - Step: " + nombrePaso);
		}

		log.LogMobile.endTestCase(testName);
	}

}
