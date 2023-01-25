package context;

import java.util.HashMap;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.http.auth.UsernamePasswordCredentials;

@XmlRootElement
public class ObjectsMobile {
	
	private UsuarioMobile usuarioMobile;
	private String TipoDePrueba;
	private String Prioridad;
	private String Referencia;
	private String Asignado;
	private String TiempoInicio;
	private String TiempoFinal;
	private String Estado;
	private String Sprint;
	private String Version;
	private HashMap<String, String> Pasos = new HashMap<String, String>();
	private String NombreDeLaPrueba;
	private String Modulo;
	private String Descripcion;
	private String ImgFalla;


	public ObjectsMobile() {
	}
	
	public ObjectsMobile (UsuarioMobile usuarioMobile) {
		this.usuarioMobile = usuarioMobile;
	}
	
	
	public ObjectsMobile (UsuarioMobile usser, String TipoDePrueba, String Prioridad, String Referencia, String Asignado, String TiempoInicio,
			String TiempoFinal, String Estado, String Sprint, String Version, String NombreDeLaPrueba,
			String Modulo, String Descripcion, String ImgFalla) {
		this.TipoDePrueba = TipoDePrueba;
		this.Prioridad = Prioridad;
		this.Referencia = Referencia;
		this.Asignado = Asignado;
		this.TiempoInicio = TiempoInicio;
		this.TiempoFinal = TiempoFinal;
		this.Estado = Estado;
		this.Sprint = Sprint;
		this.Version = Version;
		this.NombreDeLaPrueba = NombreDeLaPrueba;
		this.usuarioMobile = usser;
		this.Modulo = Modulo;
		this.Descripcion = Descripcion;
		this.ImgFalla = ImgFalla;
	}
	

	public UsuarioMobile getUsuarioMobile() {
		return usuarioMobile;
	}

	@XmlElement
	public void setUsuarioMobile(UsuarioMobile usuarioMobile) {
		this.usuarioMobile = usuarioMobile;
	}

	public String getNombreDeLaPrueba() {
		return NombreDeLaPrueba;
	}

	@XmlElement
	public void setNombreDeLaPrueba(String NombreDeLaPrueba) {
		this.NombreDeLaPrueba = NombreDeLaPrueba;
	}

	public String getTipoDePrueba() {
		return TipoDePrueba;
	}

	@XmlElement
	public void setTipoDePrueba(String TipoDePrueba) {
		this.TipoDePrueba = TipoDePrueba;
	}

	public String getPrioridad() {
		return Prioridad;
	}

	@XmlElement
	public void setPrioridad(String Prioridad) {
		this.Prioridad = Prioridad;
	}

	public String getReferencia() {
		return Referencia;
	}

	@XmlElement
	public void setReferencia(String Referencia) {
		this.Referencia = Referencia;
	}

	public String getAsignado() {
		return Asignado;
	}

	@XmlElement
	public void setAsignado(String Asignado) {
		this.Asignado = Asignado;
	}

	public String getTiempoInicio() {
		return TiempoInicio;
	}

	@XmlElement
	public void setTiempoInicio(String TiempoInicio) {
		this.TiempoInicio = TiempoInicio;
	}

	public String getTiempoFinal() {
		return TiempoFinal;
	}

	@XmlElement
	public void setTiempoFinal(String TiempoFinal) {
		this.TiempoFinal = TiempoFinal;
	}

	public String getEstado() {
		return Estado;
	}

	@XmlElement
	public void setEstado(String Estado) {
		this.Estado = Estado;
	}

	public String getSprint() {
		return Sprint;
	}

	@XmlElement
	public void setSprint(String Sprint) {
		this.Sprint = Sprint;
	}

	public String getVersion() {
		return Version;
	}

	@XmlElement
	public void setVersion(String Version) {
		this.Version = Version;
	}

	public HashMap<String, String> getPasos() {
		return Pasos;
	}

	@XmlElement
	public void setPasos(HashMap<String, String> Pasos) {
		this.Pasos = Pasos;
	}

	public String getModulo() {
		return Modulo;
	}

	@XmlElement
	public void setModulo(String modulo) {
		Modulo = modulo;
	}
	
	public String getDescripcion() {
		return Descripcion;
	}

	@XmlElement
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	
	public String getImgFalla() {
		return ImgFalla;
	}

	@XmlElement
	public void setImgFalla(String imgFalla) {
		ImgFalla = imgFalla;
	}
	

}
