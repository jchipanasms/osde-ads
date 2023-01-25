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
import pages.LoginPage;
import pages.ReintegrosPage;

public class CartillaOsdeViajaConVosBuscarPorEspecialidadStep extends BaseStepMobile {

	public static void Run(String testName) {
		String nombrePaso = "";
		log.LogMobile.startTestCase(testName);

		try {

			nombrePaso = "01_Se Acepta el mensaje de permitir";
			try {
				CurrentPage = (new CartillaMedicaPage().GetInstance(CartillaMedicaPage.class));
				CurrentPage.As(CartillaMedicaPage.class).clickPermitir();
			} catch (Exception e) {
				log.LogMobile.info("No se muestra alerta");
			}
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "02_Se Ingresa a Cartilla Médica y seleccionamos OSDE viaja con vos";
			//StepHelperMobile.takeScreenShot(testName);
			CurrentPage.As(CartillaMedicaPage.class).clickCartillaMedica();
			CurrentPage.As(CartillaMedicaPage.class).clic_osdeViajaConVos();
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "03_Se ingresa a Buscar por especialidad, completamos el formulario y buscar";
			CurrentPage.As(CartillaMedicaPage.class).clicSubMenuOsdeViajaConVos("buscar por especialidad");
			CurrentPage.As(CartillaMedicaPage.class).clic_planes_desde("especialidad");
			CurrentPage.As(CartillaMedicaPage.class).seleccionPlan("510");
			CurrentPage.As(CartillaMedicaPage.class).clic_provincia_desde("especialidad");
			CurrentPage.As(CartillaMedicaPage.class).seleccionProvincia("Ciudad de Buenos Aires");
			CurrentPage.As(CartillaMedicaPage.class).clic_localidad();
			CurrentPage.As(CartillaMedicaPage.class).seleccionLocalidad("Todas las localidades");
			CurrentPage.As(CartillaMedicaPage.class).clic_especialidad_desde("especialidad");
			CurrentPage.As(CartillaMedicaPage.class).seleccionEspecialidad("urgencias odontológicas");
			//quedan comentadas las siguientes lineas debido a que no trae resultados al buscar por fecha
//			CurrentPage.As(CartillaMedicaPage.class).clic_check_novedades();
//			CurrentPage.As(CartillaMedicaPage.class).clic_fecha_especialidad();
			
//			CurrentPage = (new ReintegrosPage().GetInstance(ReintegrosPage.class));
//			CurrentPage.As(ReintegrosPage.class).setFecha("24","jul.","2020");
//			CurrentPage = (new CartillaMedicaPage().GetInstance(CartillaMedicaPage.class));

			CurrentPage.As(CartillaMedicaPage.class).clic_buscar_desde("especialidad");
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "04_Se validan los resultados en pantalla";
			assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleTituloLista("urgencias odontológicas"));
			assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleBtnVerFormaMapa());
			assertTrue(CurrentPage.As(CartillaMedicaPage.class).existenResultadosListaEspecialidad());
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "05_Se validan los resultados en pantalla al presionar ver en forma mapa";
			CurrentPage.As(CartillaMedicaPage.class).clic_btnMapa();
			assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleTituloAlVerMapa("urgencias odontológicas"));
			assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleBtnVerFormaLista_esp());
			assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleMapaResultados_esp());
			
			CurrentPage.As(CartillaMedicaPage.class).clic_btnLista_esp();
			assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleBtnVerFormaMapa());
			log.LogMobile.SuccessStep(nombrePaso);

		} catch (AssertionError ex) {
			log.LogMobile.info(ex.getMessage());
			log.LogMobile.FailStep(nombrePaso);
			Assert.fail("Fallo test - " + testName + " - Step: " + nombrePaso);
		}

		log.LogMobile.endTestCase(testName);
	}

}
