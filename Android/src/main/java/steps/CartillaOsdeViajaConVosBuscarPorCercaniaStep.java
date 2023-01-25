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

public class CartillaOsdeViajaConVosBuscarPorCercaniaStep extends BaseStepMobile {

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
			
			nombrePaso = "03_Se ingresa a Buscar por cercanía, completamos el formulario y buscar";
			CurrentPage.As(CartillaMedicaPage.class).clicSubMenuOsdeViajaConVos("buscar por cercania");
			CurrentPage.As(CartillaMedicaPage.class).clic_planes_desde("cercania");
			CurrentPage.As(CartillaMedicaPage.class).seleccionPlan("450");
			CurrentPage.As(CartillaMedicaPage.class).clic_especialidad_desde("cercania");
			CurrentPage.As(CartillaMedicaPage.class).seleccionEspecialidad("urgencias odontológicas");
			assertTrue(CurrentPage.As(CartillaMedicaPage.class).estaEnUbicacionActual());
			CurrentPage.As(CartillaMedicaPage.class).setearUbicacion("av. rivadavia 3000, argentina");
			assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleMapa());
			CurrentPage.As(CartillaMedicaPage.class).clic_buscar_desde("cercania");
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "04_Se validan los resultados en pantalla";
			assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleTitulo("urgencias odontológicas"));
			assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleBtnVerFormaLista());
			assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleMapaResultados());
			log.LogMobile.SuccessStep(nombrePaso);

			nombrePaso = "05_Se validan los resultados en pantalla al presionar lista";
			CurrentPage.As(CartillaMedicaPage.class).clic_btnLista();
			assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleTituloLista("urgencias odontológicas"));
			assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleBtnVerFormaMapa());
			assertTrue(CurrentPage.As(CartillaMedicaPage.class).existenResultadosLista());
			CurrentPage.As(CartillaMedicaPage.class).clic_btnMapa();
			assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleBtnVerFormaLista());
			log.LogMobile.SuccessStep(nombrePaso);

		} catch (AssertionError ex) {
			log.LogMobile.info(ex.getMessage());
			log.LogMobile.FailStep(nombrePaso);
			Assert.fail("Fallo test - " + testName + " - Step: " + nombrePaso);
		}

		log.LogMobile.endTestCase(testName);
	}

}
