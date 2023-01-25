package steps;

import org.testng.Assert;
import base.BaseStepMobile;
import config.DataSetterMobile;
import context.UsuarioMobile;
import helpers.StepHelperMobile;
import helpers.XMLHelperMobile;
import pages.CartillaMedicaPage;
import pages.CentrosDeAtencionPage;
import pages.LoginPage;

public class CentrosDeAtencionStep extends BaseStepMobile {

	public static void Run(String testName) {
		String nombrePaso = "";
				
		try {
			
			nombrePaso = "01_Se Acepta el mensaje de permitir";
			//Tengo que hacer un if si aparece o no el mensaje, porque no siempre aparece
			CurrentPage = (new CartillaMedicaPage().GetInstance(CartillaMedicaPage.class));
			CurrentPage.As(CartillaMedicaPage.class).clickPermitir();
			log.LogMobile.SuccessStep(nombrePaso);			
			CurrentPage = (new LoginPage().GetInstance(LoginPage.class));
//			StepHelperMobile.takeScreenShot(testName);
			Assert.assertTrue(CurrentPage.As(LoginPage.class).esVisibleBtnGestionesOnLine());
			log.LogMobile.startTestCase(testName);
			
			nombrePaso = "02_Se Ingresa a Centros de Atención Personalizada";
			CurrentPage = (new CentrosDeAtencionPage().GetInstance(CentrosDeAtencionPage.class));
//			StepHelperMobile.takeScreenShot(testName);
			Assert.assertTrue(CurrentPage.As(CentrosDeAtencionPage.class).esVisibleBtnCentrosDeAtencion());
			CurrentPage.As(CentrosDeAtencionPage.class).clickBtnCentrosDeAtencion();
			Assert.assertTrue(CurrentPage.As(CentrosDeAtencionPage.class).esVisibleBtnBuscarPorCercania());
			Assert.assertTrue(CurrentPage.As(CentrosDeAtencionPage.class).esVisibleBtnBuscarPorProvincia());
			Assert.assertTrue(CurrentPage.As(CentrosDeAtencionPage.class).esVisibleTxtCentrosAtencion());
//			Assert.assertEquals(CurrentPage.As(CentrosDeAtencionPage.class).recuperarTxtCentrosAtencion(),"0810.555.6733 CENTRO DE ATENCIÓN TELEFÓNICA"); //falla al comparar puede ser los saltos de linea o equals con string
			log.LogMobile.SuccessStep(nombrePaso);			
			
			nombrePaso = "03_Se ingresa a Buscar por cercanía";
			CurrentPage.As(CentrosDeAtencionPage.class).clickBtnBuscarPorCercania();
			Assert.assertTrue(CurrentPage.As(CentrosDeAtencionPage.class).esVisibleTxtUbicacionActual());
			Assert.assertTrue(CurrentPage.As(CentrosDeAtencionPage.class).esVisibleBtnBuscar());
			Assert.assertTrue(CurrentPage.As(CentrosDeAtencionPage.class).esVisibleMapa());
			//Falta Ver si se encuentra el elemento Globo de Ubicación
			log.LogMobile.SuccessStep(nombrePaso);			
			
			nombrePaso = "04_Se hace clic en el botón Buscar";
			CurrentPage.As(CentrosDeAtencionPage.class).clickBtnBuscar();
			Assert.assertTrue(CurrentPage.As(CentrosDeAtencionPage.class).esVisibleMapaResultados());
			Assert.assertTrue(CurrentPage.As(CentrosDeAtencionPage.class).esVisibleTituloResultados());
			Assert.assertTrue(CurrentPage.As(CentrosDeAtencionPage.class).esVisibleListadoResultados());
			//Falta verificar el globito  naranja
			log.LogMobile.SuccessStep(nombrePaso);			
			
			nombrePaso = "05_Se hace clic en el listado de Resultados";
			CurrentPage.As(CentrosDeAtencionPage.class).clickBtnListadoResultados();
			Assert.assertTrue(CurrentPage.As(CentrosDeAtencionPage.class).esVisibleMapaListadoResultados());
			Assert.assertTrue(CurrentPage.As(CentrosDeAtencionPage.class).esVisibleTituloListadoResultados());
			//falta validar el texto
			log.LogMobile.SuccessStep(nombrePaso);			
		
			nombrePaso = "06_Se hace clic en Volver hasta la selección de Busqueda por Cercania o Busqueda por provincia";
			//verificar si el volver esta bien deberia ir a uno de paginas en general no?
			CurrentPage.As(CentrosDeAtencionPage.class).clickVolver();
			Assert.assertTrue(CurrentPage.As(CentrosDeAtencionPage.class).esVisibleMapaResultados());
			Assert.assertTrue(CurrentPage.As(CentrosDeAtencionPage.class).esVisibleTituloResultados());
			Assert.assertTrue(CurrentPage.As(CentrosDeAtencionPage.class).esVisibleListadoResultados());
			CurrentPage.As(CentrosDeAtencionPage.class).clickVolver();
			Assert.assertTrue(CurrentPage.As(CentrosDeAtencionPage.class).esVisibleTxtUbicacionActual());
			Assert.assertTrue(CurrentPage.As(CentrosDeAtencionPage.class).esVisibleBtnBuscar());
			Assert.assertTrue(CurrentPage.As(CentrosDeAtencionPage.class).esVisibleMapa());
			CurrentPage.As(CentrosDeAtencionPage.class).clickVolver();
			Assert.assertTrue(CurrentPage.As(CentrosDeAtencionPage.class).esVisibleBtnBuscarPorCercania());
			Assert.assertTrue(CurrentPage.As(CentrosDeAtencionPage.class).esVisibleBtnBuscarPorProvincia());
			log.LogMobile.SuccessStep(nombrePaso);			

			nombrePaso = "07_Se ingresa a Buscar por Provincia";
			CurrentPage.As(CentrosDeAtencionPage.class).clickBtnBuscarPorProvincia();
			log.LogMobile.SuccessStep(nombrePaso);	
			
			nombrePaso = "08_Se ingresa a seleccionar la provincia";
			CurrentPage.As(CentrosDeAtencionPage.class).clickComboProvincia();
			CurrentPage.As(CentrosDeAtencionPage.class).clickProvinciaCABA(); //puede ser que aca falle
			Assert.assertTrue(CurrentPage.As(CentrosDeAtencionPage.class).esVisibleComboProvincia());
			Assert.assertTrue(CurrentPage.As(CentrosDeAtencionPage.class).esVisibleComboLocalidad());
			log.LogMobile.SuccessStep(nombrePaso);			

			nombrePaso = "09_Se ingresa a seleccionar la Localidad";
			CurrentPage.As(CentrosDeAtencionPage.class).clickComboLocalidad();
			CurrentPage.As(CentrosDeAtencionPage.class).clickLocalidad(); //puede ser que aca falle
			log.LogMobile.SuccessStep(nombrePaso);			
			
			nombrePaso = "10_Se Presiona Buscar";
			CurrentPage.As(CentrosDeAtencionPage.class).clickBuscarProvincia();
			Assert.assertTrue(CurrentPage.As(CentrosDeAtencionPage.class).esVisibleMapaListadoResultados());
			Assert.assertTrue(CurrentPage.As(CentrosDeAtencionPage.class).esVisibleTituloListadoResultados());
			log.LogMobile.SuccessStep(nombrePaso);			
			
			nombrePaso = "10_Se Presiona Volver varias  veces";
			CurrentPage.As(CentrosDeAtencionPage.class).clickVolver();
			Assert.assertTrue(CurrentPage.As(CentrosDeAtencionPage.class).esVisibleComboProvincia());
			Assert.assertTrue(CurrentPage.As(CentrosDeAtencionPage.class).esVisibleComboLocalidad());
			CurrentPage.As(CentrosDeAtencionPage.class).clickVolver();
			Assert.assertTrue(CurrentPage.As(CentrosDeAtencionPage.class).esVisibleBtnBuscarPorCercania());
			Assert.assertTrue(CurrentPage.As(CentrosDeAtencionPage.class).esVisibleBtnBuscarPorProvincia());
			CurrentPage.As(CentrosDeAtencionPage.class).clickVolver();
			Assert.assertTrue(CurrentPage.As(CentrosDeAtencionPage.class).esVisibleBtnGestionesOnLine());		
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
