package suiteTest;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

import components.HookMobile;
import steps.AutorizacionesDeslogueoAceptarStep;
import steps.AutorizacionesDeslogueoCancelarStep;
import steps.AutorizacionesDeslogueoDesdePaso1Step;
import steps.AutorizacionesDeslogueoDesdePaso2Step;
import steps.AutorizacionesDeslogueoDesdePaso3Step;
import steps.AutorizacionesDeslogueoDesdePaso4Step;
import steps.AutorizacionesDeslogueoDesdePaso5Step;
import steps.AutorizacionesPaso3EliminarAdjuntoStep;
import steps.AutorizacionesPaso3PrevisualizarAdjuntoStep;
import steps.AutorizacionesPopUpAvisoPresionarContinuarStep;
import steps.AutorizacionesPopUpAvisoPresionarVolverStep;
import steps.AutorizacionesPresionarSigEnPaso1SinCheckStep;
import steps.AutorizacionesPresionarVolveDesdePaso4Step;
import steps.AutorizacionesPresionarVolverDesdePaso1Step;
import steps.AutorizacionesPresionarVolverDesdePaso2Step;
import steps.AutorizacionesPresionarVolverDesdePaso3Step;
import steps.AutorizacionesPresionarVolverDesdePaso5Step;
import steps.AutorizacionesSinPopUpPaso2PorFechaPosteriorA72HsStep;
import steps.AutorizacionesStep;

import steps.AyudaStep;
import steps.BuscarPorCercaniaStep;
import steps.BuscarPorEspecialidadStep;
import steps.BuscarPorNombreStep;
import steps.CentrosDeAtencionProvinciaStep;
import steps.CredencialStep;
import steps.DatosdeContactoStep;
import steps.EmpadronamientoStep;
import steps.FacturacionStep;
import steps.LoginErroneoStep;
import steps.LoginPantallaPPStep;

import steps.AutorizacionesTimeOutDeslogueoStep;
import steps.AutorizacionesVisualizarProteccionDeDatosPersonalesStep;
import steps.AutorizacionesVisualizarTermYCondicionesStep;
import steps.AutorizacionesVolverAListaTramitesStep;
import steps.CartillaOsdeViajaConVosBuscarPorCercaniaStep;
import steps.CartillaOsdeViajaConVosBuscarPorEspecialidadStep;
import steps.CartillaOsdeViajaConVosBuscarPorNombreStep;
import steps.CartillaOsdeViajaConVosDeslogueoDesdeCercaniaStep;
import steps.CartillaOsdeViajaConVosDeslogueoDesdeEspecialidadStep;
import steps.CartillaOsdeViajaConVosDeslogueoDesdeNombreStep;
import steps.CartillaOsdeViajaConVosDeslogueoDesdeServiciosStep;
import steps.CartillaOsdeViajaConVosNormasGeneralesCercaniaStep;
import steps.CartillaOsdeViajaConVosNormasGeneralesEspecialidadStep;
import steps.CartillaOsdeViajaConVosNormasGeneralesNombreStep;
import steps.CartillaOsdeViajaConVosServiciosEnExteriorStep;
import steps.CartillaOsdeViajaConVosTimeOutDeslogueoCercaniaStep;
import steps.CartillaOsdeViajaConVosTimeOutDeslogueoEspecialidadStep;
import steps.CartillaOsdeViajaConVosTimeOutDeslogueoNombreStep;
import steps.CartillaOsdeViajaConVosTimeOutDeslogueoServiciosStep;
import steps.CartillaOsdeViajaConVosUsuarioLogueadoCercaniaStep;
import steps.CartillaOsdeViajaConVosUsuarioLogueadoEspecialidadStep;
import steps.CartillaOsdeViajaConVosUsuarioLogueadoNombreStep;
import steps.CartillaOsdeViajaConVosUsuarioLogueadoServiciosStep;
import steps.CartillaOsdeViajaConVosUsuarioLogueadoStep;
import steps.CartillaOsdeViajaConVosVisualizacionStep;
import steps.CentrosDeAtencionCercaniaDeslogueoResultadosListaStep;
import steps.CentrosDeAtencionCercaniaDeslogueoResultadosMapaStep;
import steps.CentrosDeAtencionCercaniaDeslogueoStep;
import steps.CentrosDeAtencionCercaniaLogueadoResultadosListaStep;
import steps.CentrosDeAtencionCercaniaLogueadoResultadosMapaStep;
import steps.CentrosDeAtencionCercaniaLogueadoStep;
import steps.CentrosDeAtencionCercaniaLogueadoVolverResultadosListaStep;
import steps.CentrosDeAtencionCercaniaLogueadoVolverResultadosMapaStep;
import steps.CentrosDeAtencionCercaniaTimeOutResultadosListaStep;
import steps.CentrosDeAtencionCercaniaTimeOutResultadosMapaStep;
import steps.CentrosDeAtencionCercaniaTimeOutStep;
import steps.CentrosDeAtencionCercaniaVolverResultadoListaStep;
import steps.CentrosDeAtencionCercaniaVolverResultadoMapaStep;
import steps.CentrosDeAtencionStep;
import steps.CentrosDeAtencionVisualizacionCercaniaResultadoListaStep;
import steps.CentrosDeAtencionVisualizacionCercaniaResultadoMapaStep;
import steps.CentrosDeAtencionVisualizacionCercaniaStep;

import steps.LoginStep;
import steps.ReintegrosCancelarScaneoDeDocStep;
import steps.ReintegrosClickTimeOutDesdePaso1Step;
import steps.ReintegrosClickTimeOutDesdePaso2Step;
import steps.ReintegrosDeslogueoDesdePaso1Step;
import steps.ReintegrosDeslogueoDesdePaso2Step;
import steps.ReintegrosMsjeTimeOutDesdePaso1Step;
import steps.ReintegrosMsjeTimeOutDesdePaso2Step;
import steps.ReintegrosPasoDosMensajesErrorStep;
import steps.ReintegrosPasoDosVisualizacionStep;
import steps.ReintegrosPasoUnoMensajesErrorStep;
import steps.ReintegrosPasoUnoVisualizacionStep;
import steps.ReintegrosScanearDocumentoStep;
import steps.ReintegrosStep;
import steps.ReintegrosVisualizarProteccionDatosStep;
import steps.ReintegrosVisualizarTerminosStep;
import steps.ReintegrosVolverDesdePaso1Step;
import steps.ReintegrosVolverDesdePaso2Step;
import steps.TelefonosStep;

public class Regresion extends HookMobile{
/*
	//OJO CON ESTE PORQUE BLOQUEA AL USUARIO
	@Test
	public void LoginErroneo(Method method) {
		LoginErroneoStep.Run(method.getName());
	}
	
	@Test (priority = 8)
	public void Login(Method method) {
		LoginStep.Run(method.getName());
	}
		
	//OK
	@Test (priority = 7)
	public void Empadronamiento(Method method) {
		EmpadronamientoStep.Run(method.getName());
	}
		
			
	//FALTAN IDS PEDIDO que no funcionan seleccionar el motivo de contac
	@Test (priority = 5)
	public void Credenciales(Method method) {
		CredencialStep.Run(method.getName());
	}
	
	//OK FAlla por el Scroll 
	@Test (priority = 6)
	public void DatosdeContacto(Method method) {
		DatosdeContactoStep.Run(method.getName());
	}
	/*
	//OK
	@Test 
	public void Facturacion(Method method) {
		FacturacionStep.Run(method.getName());
	}
	
	//NO FUNCIONA LA LOCALIZACION
	@Test
	public void CartillaMedica(Method method) {
		BuscarPorCercaniaStep.Run(method.getName());
	}
		
	
	//OK
	@Test (priority = 3)
	public void BusquedaPorNombre(Method method) {
		BuscarPorNombreStep.Run(method.getName());
	}

		
	//OK
	@Test (priority = 4)
	public void Especialidad(Method method) {
		BuscarPorEspecialidadStep.Run(method.getName());
	}
		
	//OK
	@Test (priority = 1)
	public void Ayuda(Method method) {
		AyudaStep.Run(method.getName());
	}
	
	//OK
	@Test (priority = 2)
	public void Telefonos(Method method) {
		TelefonosStep.Run(method.getName());
	}
	
	@Test (priority = 5)
	public void CentrosDeAtencionProvincia(Method method) {
		CentrosDeAtencionProvinciaStep.Run(method.getName());		
	}
		
	@Test (priority = 6)
	public void LoginPantallaPP(Method method) {
		LoginPantallaPPStep.Run(method.getName());
	}


	
//	CASOS DE PRUEBA DE REINTEGROS

	@Test
	public void Reintegros(Method method) {
		ReintegrosStep.Run(method.getName());
	}
	
	/*
	@Test
	public void ReintegrosPaso1(Method method) {
		ReintegrosPasoUnoVisualizacionStep.Run(method.getName());
	}

	@Test
	public void ReintegrosPaso1MensajesError(Method method) {
		ReintegrosPasoUnoMensajesErrorStep.Run(method.getName());
	}

	@Test
	public void ReintegrosPaso2(Method method) {
		ReintegrosPasoDosVisualizacionStep.Run(method.getName());
	}

	@Test
	public void ReintegrosPaso2MensajesError(Method method) {
		ReintegrosPasoDosMensajesErrorStep.Run(method.getName());
	}

	@Test
	public void ReintegrosDeslogueoPaso1(Method method) {
		ReintegrosDeslogueoDesdePaso1Step.Run(method.getName());
	}
	
	@Test
	public void ReintegrosDeslogueoPaso2(Method method) {
		ReintegrosDeslogueoDesdePaso2Step.Run(method.getName());
	}

	@Test
	public void ReintegrosVolverPaso1(Method method) {
		ReintegrosVolverDesdePaso1Step.Run(method.getName());
	}

	@Test
	public void ReintegrosVolverPaso2(Method method) {
		ReintegrosVolverDesdePaso2Step.Run(method.getName());
	}	
	
	@Test
	public void ReintegrosScaneoDoc(Method method) {
		ReintegrosScanearDocumentoStep.Run(method.getName());
	}
	
	@Test
	public void ReintegrosCancelarCapturaDoc(Method method) {
		ReintegrosCancelarScaneoDeDocStep.Run(method.getName());
	}

	@Test
	public void ReintegrosMsjeTimeOutPaso1(Method method) {
		ReintegrosMsjeTimeOutDesdePaso1Step.Run(method.getName());
	}

	@Test
	public void ReintegrosMsjeTimeOutPaso2(Method method) {
		ReintegrosMsjeTimeOutDesdePaso2Step.Run(method.getName());		
	}

	@Test
	public void ReintegrosClickTimeOutPaso1(Method method) {
		ReintegrosClickTimeOutDesdePaso1Step.Run(method.getName());
	}

	@Test
	public void ReintegrosClickTimeOutPaso2(Method method) {
		ReintegrosClickTimeOutDesdePaso2Step.Run(method.getName());		
	}

	@Test
	public void ReintegrosTerminos(Method method) {
		ReintegrosVisualizarTerminosStep.Run(method.getName());
	}
	
	@Test
	public void ReintegrosProteccionDatos(Method method) {
		ReintegrosVisualizarProteccionDatosStep.Run(method.getName());
	}	
	
//	CASOS DE PRUEBA DE CARTILLA MEDICA
	//Osde viaja con vos
	@Test
	public void CartillaOsdeViajaConVos(Method method) {
		CartillaOsdeViajaConVosVisualizacionStep.Run(method.getName());
	}

	@Test
	public void CartillaOsdeViajaBuscarCercania(Method method) {
		CartillaOsdeViajaConVosBuscarPorCercaniaStep.Run(method.getName());
	}
	
	@Test
	public void CartillaOsdeViajaBuscarEspecialidad(Method method) {
		CartillaOsdeViajaConVosBuscarPorEspecialidadStep.Run(method.getName());
	}

	@Test
	public void CartillaOsdeViajaBuscarNombre(Method method) {
		CartillaOsdeViajaConVosBuscarPorNombreStep.Run(method.getName());
	}

	@Test
	public void CartillaOsdeViajaServiciosExterior(Method method) {
		CartillaOsdeViajaConVosServiciosEnExteriorStep.Run(method.getName());
	}
	
	@Test
	public void CartillaOsdeViajaNormasCercania(Method method) {
		CartillaOsdeViajaConVosNormasGeneralesCercaniaStep.Run(method.getName());
	}
	
	@Test
	public void CartillaOsdeViajaNormasEspecialidad(Method method) {
		CartillaOsdeViajaConVosNormasGeneralesEspecialidadStep.Run(method.getName());
	}
	
	@Test
	public void CartillaOsdeViajaNormasNombre(Method method) {
		CartillaOsdeViajaConVosNormasGeneralesNombreStep.Run(method.getName());
	}
	
	@Test
	public void CartillaOsdeViajaUsuarioLogueado(Method method) {
		CartillaOsdeViajaConVosUsuarioLogueadoStep.Run(method.getName());
	}
	
	@Test
	public void CartillaOsdeViajaUsuarioLogCercania(Method method) {
		CartillaOsdeViajaConVosUsuarioLogueadoCercaniaStep.Run(method.getName());
	}
	
	@Test
	public void CartillaOsdeViajaUsuarioLogEspecialidad(Method method) {
		CartillaOsdeViajaConVosUsuarioLogueadoEspecialidadStep.Run(method.getName());
	}
	
	@Test
	public void CartillaOsdeViajaUsuarioLogNombre(Method method) {
		CartillaOsdeViajaConVosUsuarioLogueadoNombreStep.Run(method.getName());
	}
	
	@Test
	public void CartillaOsdeViajaUsuarioLogServicios(Method method) {
		CartillaOsdeViajaConVosUsuarioLogueadoServiciosStep.Run(method.getName());
	}
	
	@Test
	public void CartillaOsdeViajaDeslogueoCercania(Method method) {
		CartillaOsdeViajaConVosDeslogueoDesdeCercaniaStep.Run(method.getName());
	}
	
	@Test
	public void CartillaOsdeViajaDeslogueoEspecialidad(Method method) {
		CartillaOsdeViajaConVosDeslogueoDesdeEspecialidadStep.Run(method.getName());		
	}

	@Test
	public void CartillaOsdeViajaDeslogueoNombre(Method method) {
		CartillaOsdeViajaConVosDeslogueoDesdeNombreStep.Run(method.getName());
	}
	
	@Test
	public void CartillaOsdeViajaDeslogueoServicios(Method method) {
		CartillaOsdeViajaConVosDeslogueoDesdeServiciosStep.Run(method.getName());
	}
	
	@Test
	public void CartillaOsdeViajaTimeOutDeslogueoCercania(Method method) {
		CartillaOsdeViajaConVosTimeOutDeslogueoCercaniaStep.Run(method.getName());
	}
	
	@Test
	public void CartillaOsdeViajaTimeOutDeslogueoEspecialidad(Method method) {
		CartillaOsdeViajaConVosTimeOutDeslogueoEspecialidadStep.Run(method.getName());
	}
	
	@Test
	public void CartillaOsdeViajaTimeOutDeslogueoNombre(Method method) {
		CartillaOsdeViajaConVosTimeOutDeslogueoNombreStep.Run(method.getName());
	}
	
	@Test
	public void CartillaOsdeViajaTimeOutDeslogueoServicios(Method method) {
		CartillaOsdeViajaConVosTimeOutDeslogueoServiciosStep.Run(method.getName());
	}

//	CENTROS DE ATENCION PERSONALIZADA
//	@Test
//	public void CentrosDeAtencion(Method method) {
//		CentrosDeAtencionStep.Run(method.getName());
//	}
	//casos de cercania
	@Test
	public void CentrosAtencionCercania(Method method) {
		CentrosDeAtencionVisualizacionCercaniaStep.Run(method.getName());
	}
	
	@Test
	public void CentrosAtencionCercaniaResultMapa(Method method) {
		CentrosDeAtencionVisualizacionCercaniaResultadoMapaStep.Run(method.getName());
	}
	
	@Test
	public void CentrosAtencionCercaniaResultLista(Method method) {
		CentrosDeAtencionVisualizacionCercaniaResultadoListaStep.Run(method.getName());
	}

	@Test
	public void CentrosAtencionCercaniaVolverResultMapa(Method method) {
		CentrosDeAtencionCercaniaVolverResultadoMapaStep.Run(method.getName());
	}

	@Test
	public void CentrosAtencionCercaniaVolverResultLista(Method method) {
		CentrosDeAtencionCercaniaVolverResultadoListaStep.Run(method.getName());
	}

	@Test
	public void CentrosAtencionCercaniaLog(Method method) {
		CentrosDeAtencionCercaniaLogueadoStep.Run(method.getName());
	}

	@Test
	public void CentrosAtencionCercaniaLogResultMapa(Method method) {
		CentrosDeAtencionCercaniaLogueadoResultadosMapaStep.Run(method.getName());
	}
	
	@Test
	public void CentrosAtencionCercaniaLogResultLista(Method method) {
		CentrosDeAtencionCercaniaLogueadoResultadosListaStep.Run(method.getName());
	}

	@Test
	public void CentrosAtencionCercaniaLogVolverResultMapa(Method method) {
		CentrosDeAtencionCercaniaLogueadoVolverResultadosMapaStep.Run(method.getName());
	}

	@Test
	public void CentrosAtencionCercaniaLogVolverResultLista(Method method) {
		CentrosDeAtencionCercaniaLogueadoVolverResultadosListaStep.Run(method.getName());
	}
	
	@Test
	public void CentrosAtencionCercaniaDeslog(Method method) {
		CentrosDeAtencionCercaniaDeslogueoStep.Run(method.getName());
	}

	@Test
	public void CentrosAtencionCercaniaDeslogResultMapa(Method method) {
		CentrosDeAtencionCercaniaDeslogueoResultadosMapaStep.Run(method.getName());
	}

	@Test
	public void CentrosAtencionCercaniaDeslogResultLista(Method method) {
		CentrosDeAtencionCercaniaDeslogueoResultadosListaStep.Run(method.getName());
	}
	
	@Test
	public void CentrosAtencionCercaniaTimeOut(Method method) {
		CentrosDeAtencionCercaniaTimeOutStep.Run(method.getName());
	}
	
	@Test
	public void CentrosAtencionCercaniaTimeOutResultMapa(Method method) {
		CentrosDeAtencionCercaniaTimeOutResultadosMapaStep.Run(method.getName());
	}
	
	@Test
	public void CentrosAtencionCercaniaTimeOutResultLista(Method method) {
		CentrosDeAtencionCercaniaTimeOutResultadosListaStep.Run(method.getName());
	}
	*/
//	CASOS DE PRUEBA DE AUTORIZACIONES
	@Test
	public void Autorizaciones(Method method) {
		AutorizacionesStep.Run(method.getName());
	}
	/*
	@Test
	public void AutorizacionesTerminosYCondiciones(Method method) {
		AutorizacionesVisualizarTermYCondicionesStep.Run(method.getName());
	}
	
	@Test
	public void AutorizacionesProteccionDatos(Method method) {
		AutorizacionesVisualizarProteccionDeDatosPersonalesStep.Run(method.getName());
	}

	@Test
	public void AutorizacionesPaso2AvisoVolver(Method method) {
		AutorizacionesPopUpAvisoPresionarVolverStep.Run(method.getName());
	}

	@Test
	public void AutorizacionesPaso2AvisoContinuar(Method method) {
		AutorizacionesPopUpAvisoPresionarContinuarStep.Run(method.getName());
	}
	
	@Test
	public void AutorizacionesPaso2SinAvisoPorFecha(Method method) {
		AutorizacionesSinPopUpPaso2PorFechaPosteriorA72HsStep.Run(method.getName());
	}

	@Test
	public void AutorizacionesDeslogueoAceptar(Method method) {
		AutorizacionesDeslogueoAceptarStep.Run(method.getName());
	}
	
	@Test
	public void AutorizacionesDeslogueoCancelar(Method method) {
		AutorizacionesDeslogueoCancelarStep.Run(method.getName());
	}
	
	@Test
	public void AutorizacionesTimeOut(Method method) {
		AutorizacionesTimeOutDeslogueoStep.Run(method.getName());
	}
	
	@Test
	public void AutorizacionesVolver(Method method) {
		AutorizacionesVolverAListaTramitesStep.Run(method.getName());
	}
	
	@Test
	public void AutorizacionesVolverPaso1(Method method) {
		AutorizacionesPresionarVolverDesdePaso1Step.Run(method.getName());
	}
	@Test
	public void AutorizacionesVolverPaso2(Method method) {
		AutorizacionesPresionarVolverDesdePaso2Step.Run(method.getName());
	}
	@Test
	public void AutorizacionesVolverPaso3(Method method) {
		AutorizacionesPresionarVolverDesdePaso3Step.Run(method.getName());
	}
	@Test
	public void AutorizacionesVolverPaso4(Method method) {
		AutorizacionesPresionarVolveDesdePaso4Step.Run(method.getName());
	}
	@Test
	public void AutorizacionesVolverPaso5(Method method) {
		AutorizacionesPresionarVolverDesdePaso5Step.Run(method.getName());
	}

	@Test void AutorizacionesDeslogueoPaso1(Method method) {
		AutorizacionesDeslogueoDesdePaso1Step.Run(method.getName());
	}
	@Test void AutorizacionesDeslogueoPaso2(Method method) {
		AutorizacionesDeslogueoDesdePaso2Step.Run(method.getName());
	}
	@Test void AutorizacionesDeslogueoPaso3(Method method) {
		AutorizacionesDeslogueoDesdePaso3Step.Run(method.getName());
	}
	@Test void AutorizacionesDeslogueoPaso4(Method method) {
		AutorizacionesDeslogueoDesdePaso4Step.Run(method.getName());
	}
	@Test void AutorizacionesDeslogueoPaso5(Method method) {
		AutorizacionesDeslogueoDesdePaso5Step.Run(method.getName());
	}
	
	@Test
	public void AutorizacionesPaso1SiguienteSinCheck(Method method) {
		AutorizacionesPresionarSigEnPaso1SinCheckStep.Run(method.getName());
	}
	
	@Test
	public void AutorizacionesPaso3EliminarAdjunto(Method method) {
		AutorizacionesPaso3EliminarAdjuntoStep.Run(method.getName());
	}
	
	@Test
	public void AutorizacionesPaso3PrevisualizarAdjunto(Method method) {
		AutorizacionesPaso3PrevisualizarAdjuntoStep.Run(method.getName());
	}
	
*/
}
