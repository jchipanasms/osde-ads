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

public class CartillaOsdeViajaConVosServiciosEnExteriorStep extends BaseStepMobile {

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
			
			nombrePaso = "03_Se ingresa a servicios en el exterior, validamos el mensaje y presionamos en continuar";
			CurrentPage.As(CartillaMedicaPage.class).clicSubMenuOsdeViajaConVos("servicios en el exterior");
			assertTrue(CurrentPage.As(CartillaMedicaPage.class).seEncuentraMensajeImportante());
			CurrentPage.As(CartillaMedicaPage.class).clic_continuarEnMensaje();
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "04_Se valida la información de servicios en el exterior";
			assertTrue(CurrentPage.As(CartillaMedicaPage.class).seEncuentraLaInformacionEstatica());
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "05_Seleccionamos un pais y verificamos la información en pantalla";
			CurrentPage.As(CartillaMedicaPage.class).clic_enPais("uruguay");
			assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleTituloLista("uruguay"));
			assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleSubtituloLista("Servicios de urgencias en países limítrofes"));
			assertTrue(CurrentPage.As(CartillaMedicaPage.class).existenResultadosListaEspecialidad());			
			log.LogMobile.SuccessStep(nombrePaso);

		} catch (AssertionError ex) {
			log.LogMobile.info(ex.getMessage());
			log.LogMobile.FailStep(nombrePaso);
			Assert.fail("Fallo test - " + testName + " - Step: " + nombrePaso);
		}

		log.LogMobile.endTestCase(testName);
	}

}
