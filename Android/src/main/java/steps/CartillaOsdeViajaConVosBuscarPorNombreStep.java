package steps;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import base.BaseStepMobile;
import config.DataSetterMobile;
import context.UsuarioMobile;
import helpers.StepHelperMobile;
import helpers.XMLHelperMobile;
import pages.CartillaMedicaPage;
import pages.LoginPage;

public class CartillaOsdeViajaConVosBuscarPorNombreStep extends BaseStepMobile {

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
			
			nombrePaso = "03_Se ingresa a Buscar por nombre, completamos el formulario y buscar";
			CurrentPage.As(CartillaMedicaPage.class).clicSubMenuOsdeViajaConVos("buscar por nombre");
			CurrentPage.As(CartillaMedicaPage.class).clic_planes_desde("nombre");
			CurrentPage.As(CartillaMedicaPage.class).seleccionPlan("210");
			CurrentPage.As(CartillaMedicaPage.class).clic_provincia_desde("nombre");
			CurrentPage.As(CartillaMedicaPage.class).seleccionProvincia("buenos aires");
			CurrentPage.As(CartillaMedicaPage.class).ingresar_nombre("servicio de guardia");
			assertTrue(CurrentPage.As(CartillaMedicaPage.class).seEncuentraDescripcionBusqueda());
			CurrentPage.As(CartillaMedicaPage.class).clic_buscar_desde("nombre");
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "04_Se validan los resultados en pantalla";
			assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleTituloLista("buenos aires"));
			assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleSubtituloLista("servicio de guardia"));
			assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleBtnVerFormaMapa());
			assertTrue(CurrentPage.As(CartillaMedicaPage.class).existenResultadosListaEspecialidad());
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "05_Se validan los resultados en pantalla al presionar ver en forma mapa";
			CurrentPage.As(CartillaMedicaPage.class).clic_btnMapa();
			assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleTituloAlVerMapa("buenos aires"));
			assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleSubtituloMapa("servicio de guardia"));
			assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleBtnVerFormaLista_esp());
			assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleMapaResultados_esp());
			
			CurrentPage.As(CartillaMedicaPage.class).clic_btnLista_esp();
			assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleBtnVerFormaMapa());
			System.out.println("se ve boton ver en mapa");
			
			log.LogMobile.SuccessStep(nombrePaso);

		} catch (AssertionError ex) {
			log.LogMobile.info(ex.getMessage());
			log.LogMobile.FailStep(nombrePaso);
			Assert.fail("Fallo test - " + testName + " - Step: " + nombrePaso);
		}

		log.LogMobile.endTestCase(testName);
	}

}
