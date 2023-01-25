package context;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class UsuarioMobile {
	
	
	private String documento;
	private String password;
	
	public UsuarioMobile(String Documento, String password) {
		this.documento = Documento;
		this.password = password;
	}
	
	public UsuarioMobile() {
		
	}
	
	
	public String getPassword() {
		return password;
	}
	

	@XmlElement
	public void setPassword(String Password) {
		this.password = Password;
	}

	public String getDocumento() {
		return documento;
	}

	@XmlElement
	public void setDocumento(String Documento) {
		this.documento = Documento;
	}
	

}

