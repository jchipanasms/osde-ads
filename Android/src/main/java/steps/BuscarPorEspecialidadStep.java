package steps;

import org.testng.Assert;
import base.BaseStepMobile;
import config.DataSetterMobile;
import context.UsuarioMobile;
import helpers.StepHelperMobile;
import helpers.XMLHelperMobile;
import log.LogMobile;
import pages.CartillaMedicaPage;
import pages.LoginPage;

public class BuscarPorEspecialidadStep extends BaseStepMobile {

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
			
			nombrePaso = "02_Se Ingresa a Cartilla Mdica";
			
			CurrentPage = (new CartillaMedicaPage().GetInstance(CartillaMedicaPage.class));
			Assert.assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleBtnCartillaMedica());
			CurrentPage.As(CartillaMedicaPage.class).clickCartillaMedica();
			Assert.assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleBtnBuscarporCercania());
			Assert.assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleBtnBuscarporEspecialidad());
			Assert.assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleBtnBuscarporNombre());
			Assert.assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleBtnOSDEViajaConVos());
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "03_Se ingresa a Buscar por Especialidad";
			
			CurrentPage.As(CartillaMedicaPage.class).clickBuscarPorEspecialidad();
			Assert.assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleComboPlan_E());
			Assert.assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleComboProvincia());
			Assert.assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleComboLocalidad());
			Assert.assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleComboRubro_E());
			Assert.assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleEspecialidad_E());
			log.LogMobile.SuccessStep(nombrePaso);	
			
			nombrePaso = "04_Se Selecciona el plan";
			CurrentPage.As(CartillaMedicaPage.class).clicComboPlan_E();
			CurrentPage.As(CartillaMedicaPage.class).clicPlan410_N();
			Assert.assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleComboProvincia());
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "05_Se Selecciona la Provincia";
			CurrentPage.As(CartillaMedicaPage.class).clicComboProvincias();
			CurrentPage.As(CartillaMedicaPage.class).clicProvincia();
			Assert.assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleComboLocalidad());
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "06_Se Selecciona la Localidad";
			CurrentPage.As(CartillaMedicaPage.class).clicComboLocalidad();
			CurrentPage.As(CartillaMedicaPage.class).clicLocalidad();
			Assert.assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleComboRubro_E());
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "07_Se Selecciona el rubro";
			CurrentPage.As(CartillaMedicaPage.class).clicComboRubros_E();
			CurrentPage.As(CartillaMedicaPage.class).clicRubroProfesional();
			Assert.assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleEspecialidad_E());
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "08_Se Selecciona la  Especialidad";
			CurrentPage.As(CartillaMedicaPage.class).clicComboEspecialidades_E();
			CurrentPage.As(CartillaMedicaPage.class).clicEspecialidadCardiologia();
			Assert.assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleEspecialidad_E());
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "09_Se Presiona el botn Buscar";
			Assert.assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleBtnBuscar());
			CurrentPage.As(CartillaMedicaPage.class).clicBtnBuscarEspecialidad();
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "10_Se Verfican los elementos de la Bsqueda";
			Assert.assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleBtnMapa());
			Assert.assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleTituloEspecialidad());
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "11_Se Presiona Volver";
			CurrentPage.As(CartillaMedicaPage.class).clickVolver();
			log.LogMobile.SuccessStep(nombrePaso);

			
			nombrePaso = "12_Se hace click en normas generales";
			CurrentPage.As(CartillaMedicaPage.class).clickLinkNormasGenerales_E();
			Assert.assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleComboPlanNormasGenerales());
			log.LogMobile.SuccessStep(nombrePaso);
	
			nombrePaso = "13_Se Cierra normas Generales";
			CurrentPage.As(CartillaMedicaPage.class).clicCerrarNG();
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "14_Se Presiona Volver para ir a cartilla Mdica";
			CurrentPage.As(CartillaMedicaPage.class).clickVolver();
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "15_Se Presiona Volver para ir a la Pantalla de Inicio";
			CurrentPage.As(CartillaMedicaPage.class).clickVolver();
			log.LogMobile.SuccessStep(nombrePaso);

			
	/*		nombrePaso = "14_Se hace clic en el protector de pantalla";
			CurrentPage.As(CartillaMedicaPage.class).clicProtectorPantalla();
			log.LogMobile.SuccessStep(nombrePaso);
			
			*/
			StepHelperMobile.takeScreenShot(testName);

		} catch (AssertionError ex) {
			log.LogMobile.info(ex.getMessage());
			log.LogMobile.FailStep(nombrePaso);
			Assert.fail("Fallo test - " + testName + " - Step: " + nombrePaso);
		}

		log.LogMobile.endTestCase(testName);
	}

}
