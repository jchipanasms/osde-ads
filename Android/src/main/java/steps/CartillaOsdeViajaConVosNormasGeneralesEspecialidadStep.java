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

public class CartillaOsdeViajaConVosNormasGeneralesEspecialidadStep extends BaseStepMobile {

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
			
			nombrePaso = "03_Se ingresa a Buscar por especialidad y le damos clic a normas generales";
			CurrentPage.As(CartillaMedicaPage.class).clicSubMenuOsdeViajaConVos("buscar por especialidad");
			CurrentPage.As(CartillaMedicaPage.class).clic_normas_desde("especialidad");
			assertTrue(CurrentPage.As(CartillaMedicaPage.class).seEncuentraTituloNormas());
			assertTrue(CurrentPage.As(CartillaMedicaPage.class).seEncuentraBtnCerrar());
			assertTrue(CurrentPage.As(CartillaMedicaPage.class).seEncuentraComboPlanes());
			log.LogMobile.SuccessStep(nombrePaso);

			nombrePaso = "04_Seleccionamos un plan y validamos lo seleccionado";
			CurrentPage.As(CartillaMedicaPage.class).clic_planes_normas();
			CurrentPage.As(CartillaMedicaPage.class).seleccionPlan("410");
			assertTrue(CurrentPage.As(CartillaMedicaPage.class).elTituloEsPlan("410"));
			CurrentPage.As(CartillaMedicaPage.class).clic_btnCerrar();
			log.LogMobile.SuccessStep(nombrePaso);

		} catch (AssertionError ex) {
			log.LogMobile.info(ex.getMessage());
			log.LogMobile.FailStep(nombrePaso);
			Assert.fail("Fallo test - " + testName + " - Step: " + nombrePaso);
		}

		log.LogMobile.endTestCase(testName);
	}

}
