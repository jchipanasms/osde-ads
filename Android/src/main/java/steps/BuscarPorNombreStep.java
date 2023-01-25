package steps;

import org.testng.Assert;
import base.BaseStepMobile;
import config.DataSetterMobile;
import context.UsuarioMobile;
import helpers.PageHelperMobile;
import helpers.StepHelperMobile;
import helpers.XMLHelperMobile;
import log.LogMobile;
import pages.CartillaMedicaPage;
import pages.LoginPage;

public class BuscarPorNombreStep extends BaseStepMobile {

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
			
			nombrePaso = "03_Se ingresa a Buscar por Nombre";
			
			CurrentPage.As(CartillaMedicaPage.class).clickBuscarPorNombre();
			Assert.assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleComboPlan_N());
			Assert.assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleComboRubro_N());
			Assert.assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleComboProvincia_N());
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "04_Se selecciona el plan";
			CurrentPage.As(CartillaMedicaPage.class).clicComboPlan_N();
			CurrentPage.As(CartillaMedicaPage.class).clicPlan410_N();
			Assert.assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleComboRubro_N());
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "05_Se selecciona el rubro";
			CurrentPage.As(CartillaMedicaPage.class).clicComboRubros_N();
			CurrentPage.As(CartillaMedicaPage.class).clicRubroProfesional();
			Assert.assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleComboProvincia_N());
			log.LogMobile.SuccessStep(nombrePaso);
				
			nombrePaso = "06_Se selecciona la Provincia";
			CurrentPage.As(CartillaMedicaPage.class).clicComboProvincias_N();
			CurrentPage.As(CartillaMedicaPage.class).clicProvincia();
			Assert.assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleComboPlan_N());
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "07_Se ingresa el  nombre a buscar";
			CurrentPage.As(CartillaMedicaPage.class).ingresarTxtBuscar_N("Hospital cordoba");
			CurrentPage.As(CartillaMedicaPage.class).clickPanio();
			CurrentPage.As(CartillaMedicaPage.class).clicBtnBuscar_N();
			Assert.assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleResultadoBusqueda());
			log.LogMobile.SuccessStep(nombrePaso);
			
			nombrePaso = "08_Se ingresa a la informacin del mdico";
			CurrentPage.As(CartillaMedicaPage.class).clickInfoParticular();
			Assert.assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleDetallePrestador());
			log.LogMobile.SuccessStep(nombrePaso);
					
			nombrePaso = "09_Se Vuelve dos pasos";
			CurrentPage.As(CartillaMedicaPage.class).clickVolver();
			Assert.assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleResultadoBusqueda());
			CurrentPage.As(CartillaMedicaPage.class).clickVolver();
			Assert.assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleComboPlan_N());
			log.LogMobile.SuccessStep(nombrePaso);
					
			nombrePaso = "10_Se hace click en normas generales";
			CurrentPage.As(CartillaMedicaPage.class).clickLinkNormasGenerales_N();
			Assert.assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleComboPlanNormasGenerales());
			log.LogMobile.SuccessStep(nombrePaso);
		
			/*		Falta validar que el TEXTO QUE DIGA PLAN 210
			 * Falta cambiar el  combo y que cambie la info del plan
			*/
			nombrePaso = "11_Se Cierra normas Generales";
			CurrentPage.As(CartillaMedicaPage.class).clicCerrarNG();
			Assert.assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleComboPlan_N());
			log.LogMobile.SuccessStep(nombrePaso);
		
			nombrePaso = "12_Se Vuelve dos pasos";
			CurrentPage.As(CartillaMedicaPage.class).clickVolver();
			log.LogMobile.SuccessStep(nombrePaso);

			Assert.assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleBtnBuscarporCercania());
			Assert.assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleBtnBuscarporEspecialidad());
			Assert.assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleBtnBuscarporNombre());
			Assert.assertTrue(CurrentPage.As(CartillaMedicaPage.class).esVisibleBtnOSDEViajaConVos());
			CurrentPage.As(CartillaMedicaPage.class).clickVolver();

			
			log.LogMobile.startTestCase(testName);
			StepHelperMobile.takeScreenShot(testName);

		} catch (AssertionError ex) {
			log.LogMobile.info(ex.getMessage());
			log.LogMobile.FailStep(nombrePaso);
			Assert.fail("Fallo test - " + testName + " - Step: " + nombrePaso);
		}

		log.LogMobile.endTestCase(testName);
	}

}
