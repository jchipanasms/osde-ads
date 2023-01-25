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

public class BuscarPorCercaniaStep extends BaseStepMobile {

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
			
			nombrePaso = "02_Se Ingresa a Cartilla Médica";
			CurrentPage = (new CartillaMedicaPage().GetInstance(CartillaMedicaPage.class));
			Assert.assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleBtnCartillaMedica());
			CurrentPage.As(CartillaMedicaPage.class).clickCartillaMedica();
			Assert.assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleBtnBuscarporCercania());
			Assert.assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleBtnBuscarporEspecialidad());
			Assert.assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleBtnBuscarporNombre());
			Assert.assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleBtnOSDEViajaConVos());
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "03_Se ingresa a Buscar por cercanía";
			CurrentPage.As(CartillaMedicaPage.class).clickBuscarPorCercania();
			Assert.assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleComboPlan());
			Assert.assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleComboRubro());
			Assert.assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleEspecialidad());
			Assert.assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleUbicacion());
			log.LogMobile.SuccessStep(nombrePaso);	
			
			nombrePaso = "04_Se selecciona el plan";
			CurrentPage.As(CartillaMedicaPage.class).clicComboPlan();
			CurrentPage.As(CartillaMedicaPage.class).clicPlan410_N();
			Assert.assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleComboRubro());
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "06_Se selecciona el rubro";
			CurrentPage.As(CartillaMedicaPage.class).clicComboRubros();
			CurrentPage.As(CartillaMedicaPage.class).clicRubroProfesional();
			Assert.assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleEspecialidad());
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "07_Se selecciona la  Especialidad";
			CurrentPage.As(CartillaMedicaPage.class).clicComboEspecialidades();
			CurrentPage.As(CartillaMedicaPage.class).clicEspecialidadCardiologia();
			Assert.assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleEspecialidad());
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "08_Se Presiona el botón Buscar";
			Assert.assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleBtnBuscarPorCercania());
			CurrentPage.As(CartillaMedicaPage.class).clicBtnBuscarCercania();
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "09_Se Verfican los elementos de la Búsqueda";
			Assert.assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleBtnMapaCercania());
			Assert.assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleTituloEspecialidadCercania());
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "10_Se Presiona Volver";
			CurrentPage.As(CartillaMedicaPage.class).clickVolver();
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "11_Se hace click en normas generales";
			CurrentPage.As(CartillaMedicaPage.class).clickLinkNormasGenerales_E();
			Assert.assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleComboPlanNormasGenerales());
			log.LogMobile.SuccessStep(nombrePaso);
	
			nombrePaso = "12_Se Cierra normas Generales";
			CurrentPage.As(CartillaMedicaPage.class).clicCerrarNG();
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "13_Se Presiona Volver para ir a cartilla Médica";
			CurrentPage.As(CartillaMedicaPage.class).clickVolver();
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "14_Se Presiona Volver para ir a la Pantalla de Inicio";
			CurrentPage.As(CartillaMedicaPage.class).clickVolver();
			log.LogMobile.SuccessStep(nombrePaso);

	/*		nombrePaso = "04_Se hace click en normas generales";
			
			CurrentPage.As(CartillaMedicaPage.class).clickLinkNormasGenerales();
			Assert.assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleNormasGenerales());
			Assert.assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleComboPlanNormasGenerales());
		//	Assert.assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleNormasGenerales()); TEXTO QUE DIGA PLAN 210

			nombrePaso = "05_Se Cambia de plan para que traiga la info de plan 470";
			CurrentPage.As(CartillaMedicaPage.class).clicComboPlanesNG();
			Assert.assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisiblePopUpSeleccionPlan());
			
			
			nombrePaso = "06_Se Cierra normas Generales";
			
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
