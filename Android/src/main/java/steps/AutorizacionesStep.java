package steps;

import org.openqa.selenium.ScreenOrientation;
import org.testng.Assert;
import base.BaseStepMobile;
import context.UsuarioMobile;
import helpers.StepHelperMobile;
import helpers.XMLHelperMobile;
import log.LogMobile;
import pages.AutorizacionesPage;
import pages.CamaraPage;
import pages.CartillaMedicaPage;
import pages.EmpadronamientoPage;
import pages.GestionesOnlinePage;
import pages.LoginPage;
import pages.ReintegrosPage;

public class AutorizacionesStep extends BaseStepMobile {

	public static void Run(String testName) {
		String nombrePaso = "";
		log.LogMobile.startTestCase(testName);

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
			
			nombrePaso = "03_Se realiza el login";
			CurrentPage.As(LoginPage.class).ingresardocumento(usr.getDocumento());
			CurrentPage.As(LoginPage.class).clickPanio();
			CurrentPage.As(LoginPage.class).ingresarContrasenia(usr.getPassword());
			CurrentPage.As(LoginPage.class).clickIngresar();
		//	Assert.assertFalse(CurrentPage.As(LoginPage.class).esVisibleNombreLogueo());
			log.LogMobile.SuccessStep(nombrePaso);
			

			nombrePaso = "04_Se realiza clic en el modulo autorizaciones";
			CurrentPage = (new GestionesOnlinePage().GetInstance(GestionesOnlinePage.class));
			CurrentPage.As(GestionesOnlinePage.class).clickBtnAutorizaciones();
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "05_Se validan los datos (nombre usuario, botones y titulo) en pantalla";
//			Assert.assertTrue(CurrentPage.As(GestionesOnlinePage.class).esVisibleNombreSocio("Bernardo Antonio Omar Rodriguez"));
			Assert.assertTrue(CurrentPage.As(GestionesOnlinePage.class).esVisibleBtnVolver());
			Assert.assertTrue(CurrentPage.As(GestionesOnlinePage.class).esVisibleBtnDeslogueo());
			CurrentPage = (new AutorizacionesPage().GetInstance(AutorizacionesPage.class));
			Assert.assertTrue(CurrentPage.As(AutorizacionesPage.class).esVisibleTitulo());
	//		Assert.assertTrue(CurrentPage.As(AutorizacionesPage.class).esVisibleSubTitulo());
			Assert.assertTrue(CurrentPage.As(AutorizacionesPage.class).existenOpcionesEnListaAut());
			log.LogMobile.SuccessStep(nombrePaso);	
			
			nombrePaso = "06_Hacemos clic en Internación - Cirugía";
			CurrentPage.As(AutorizacionesPage.class).autorizacion_a_realizar("Internación - Cirugía");
			log.LogMobile.SuccessStep(nombrePaso);	
			
			nombrePaso = "07_Se verifican los elementos y textos del paso 1";
			Assert.assertTrue(CurrentPage.As(AutorizacionesPage.class).autorizacionesDe("internación o cirugía"));
			Assert.assertTrue(CurrentPage.As(AutorizacionesPage.class).existeSubtitulo("¿Para quién es?"));
			Assert.assertTrue(CurrentPage.As(AutorizacionesPage.class).existeSociosEnLista());
	//		Assert.assertTrue(CurrentPage.As(AutorizacionesPage.class).existeTermCheckYProteccionDatos());
			Assert.assertTrue(CurrentPage.As(AutorizacionesPage.class).existeBtnSiguiente());
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "08_Seleccionamos un socio, damos clic al check y presionamos siguiente";
			CurrentPage.As(AutorizacionesPage.class).seleccionarSocio("Bernardo Antonio Omar Rodriguez");
			CurrentPage.As(AutorizacionesPage.class).clic_check();
			CurrentPage.As(AutorizacionesPage.class).clickSocio();
			CurrentPage.As(AutorizacionesPage.class).clic_boton_siguiente();
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "09_Se verifican los elementos y textos del paso 2";
			Assert.assertTrue(CurrentPage.As(AutorizacionesPage.class).autorizacionesDe("internación o cirugía"));
			Assert.assertTrue(CurrentPage.As(AutorizacionesPage.class).existeSubtitulo("Ingresá los datos"));
			Assert.assertTrue(CurrentPage.As(AutorizacionesPage.class).existeTitulosDeCamposPaso2());
			Assert.assertTrue(CurrentPage.As(AutorizacionesPage.class).esVisibleBtnSiguientePaso2());
			log.LogMobile.SuccessStep(nombrePaso);

			nombrePaso = "010_Se completa el paso 2 y presionamos en siguiente";
			CurrentPage.As(AutorizacionesPage.class).clic_fecha();
	//		CurrentPage = (new ReintegrosPage().GetInstance(ReintegrosPage.class));
		//	CurrentPage.As(ReintegrosPage.class).setFecha("04", "Ago.", "2020");
		//	CurrentPage = (new AutorizacionesPage().GetInstance(AutorizacionesPage.class));
			CurrentPage.As(AutorizacionesPage.class).clickEstablecerFecha();
		//	CurrentPage.As(AutorizacionesPage.class).clickPanio(); 
			CurrentPage.As(AutorizacionesPage.class).ingresarTxtBuscar_S("Sanatorio");
			CurrentPage.As(AutorizacionesPage.class).ingresarTxtBuscar_P("Profesional");
			CurrentPage.As(AutorizacionesPage.class).ingresarTxtBuscar_Obs("Prueba");
			/*
			CurrentPage.As(AutorizacionesPage.class).set_sanatorio_institucion("sanatorio");
			CurrentPage.As(AutorizacionesPage.class).set_profesional("profesional");
			CurrentPage.As(AutorizacionesPage.class).set_observaciones("Prueba");*/
			
			CurrentPage.As(AutorizacionesPage.class).clic_siguiente_paso2();
			log.LogMobile.SuccessStep(nombrePaso);

			//solo se puede validar este paso en caso de setear la fecha actual sino no muestra popup de advertencia
			nombrePaso = "11_Se verifica el popup antes de pasar al paso 3";
			Assert.assertTrue(CurrentPage.As(AutorizacionesPage.class).esVisiblePopUpPaso2());
			log.LogMobile.SuccessStep(nombrePaso);

			nombrePaso = "12_Presionamos en continuar al popup";
			CurrentPage.As(AutorizacionesPage.class).clic_continuar_popup();
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "13_Se verifican los elementos y textos del paso 3";
			Assert.assertTrue(CurrentPage.As(AutorizacionesPage.class).autorizacionesDe("internación o cirugía"));
			Assert.assertTrue(CurrentPage.As(AutorizacionesPage.class).existeSubtitulo("Adjuntá el pedido del médico"));
			Assert.assertTrue(CurrentPage.As(AutorizacionesPage.class).existeTitulosDeCamposPaso3());
			Assert.assertTrue(CurrentPage.As(AutorizacionesPage.class).esVisibleBtnSiguiente());
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "14_Se adjunta un pedido medico (validamos que se haya adjuntado) y presionamos en siguiente al paso 4";
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
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			driver.rotate(ScreenOrientation.LANDSCAPE);	//tuve que agregar esta linea para obligar a que este en modo vertical por la camara
			
			CurrentPage = (new AutorizacionesPage().GetInstance(AutorizacionesPage.class));
			Assert.assertTrue(CurrentPage.As(AutorizacionesPage.class).nombreArchivoAdjunto("pedido_medico.jpg"));
			CurrentPage.As(AutorizacionesPage.class).clic_siguiente();
			log.LogMobile.SuccessStep(nombrePaso);

			nombrePaso = "13_Se verifican los elementos y textos del paso 4";
			Assert.assertTrue(CurrentPage.As(AutorizacionesPage.class).autorizacionesDe("internación o cirugía"));
			Assert.assertTrue(CurrentPage.As(AutorizacionesPage.class).existeSubtitulo("Datos de contacto"));
			Assert.assertTrue(CurrentPage.As(AutorizacionesPage.class).existeTitulosDeCamposPaso4());
			Assert.assertTrue(CurrentPage.As(AutorizacionesPage.class).esVisibleBtnSiguiente());
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "14_Se editan los campos del paso 4 y presionamos en siguiente";
			CurrentPage.As(AutorizacionesPage.class).set_email("fer@fer.com");
			CurrentPage.As(AutorizacionesPage.class).set_telefono("12345678");
			CurrentPage.As(AutorizacionesPage.class).clic_siguiente();
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "15_Se verifican los elementos y textos del paso 5";
			Assert.assertTrue(CurrentPage.As(AutorizacionesPage.class).autorizacionesDe("internación o cirugía"));
			Assert.assertTrue(CurrentPage.As(AutorizacionesPage.class).existeSubtitulo("Verificá los datos"));
			Assert.assertTrue(CurrentPage.As(AutorizacionesPage.class).existeTitulosDeCamposPaso5());
			Assert.assertTrue(CurrentPage.As(AutorizacionesPage.class).verificaIntegranteFinal("Bernardo Antonio Omar Rodriguez"));
			Assert.assertTrue(CurrentPage.As(AutorizacionesPage.class).verificaFechaFinal("8/4/2020"));
			Assert.assertTrue(CurrentPage.As(AutorizacionesPage.class).verificaInstSanatFinal("sanatorio"));
			Assert.assertTrue(CurrentPage.As(AutorizacionesPage.class).verificaProfesionalFinal("profesional"));
			Assert.assertTrue(CurrentPage.As(AutorizacionesPage.class).verificaObservacionesFinal("esta es una observación"));
			Assert.assertTrue(CurrentPage.As(AutorizacionesPage.class).verificaPedMedicoFinal("pedido_medico.jpg"));
			Assert.assertFalse(CurrentPage.As(AutorizacionesPage.class).existeDocAdicionalFinal());
			Assert.assertTrue(CurrentPage.As(AutorizacionesPage.class).verificaEmailFinal("fer@fer.com"));
			Assert.assertTrue(CurrentPage.As(AutorizacionesPage.class).verificaTelFinal("12345678"));
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "16_Se verifica que se encuentre el boton de generar y presionamos en el mismo";
			Assert.assertTrue(CurrentPage.As(AutorizacionesPage.class).esVisibleBtnGenerar());
//			CurrentPage.As(AutorizacionesPage.class).clic_generar_tramite();
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
