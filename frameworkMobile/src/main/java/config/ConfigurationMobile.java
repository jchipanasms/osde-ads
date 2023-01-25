package config;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ConfigurationMobile {
	private String platformName;
	private String platformVersion;
	private String deviceName;
	private String apkPath;
	private String log4jPath;
	private String delivery;
	private String deliveryPath;
	private String reportPath;
	private String reportRepository;
	private String imageRepository;
	private String ipAppium;
	private int portAppium;
	private String browser;
	private String urlPrestadores;
	private String urlMedico;
	private String urlAdmin;
	private String urlSocio;
	private String correo;
	private String driverPath;
	private String urlDriver;
	private String pruebaRemota;
	
	public ConfigurationMobile() {
	}

	public ConfigurationMobile(String browser, String urlPrestadores, String urlMedico, String urlAdmin, String urlSocio, String driverPath,
			String log4jPath, String delivery, String reportPath, String reportRepository, String imageRepository,
			String deliveryPath, String urlDriver, String pruebaRemota, String correo, String platformName, 
			String platformVersion, String deviceName, String apkPath, String ipAppium, int portAppium) {
		this.platformName = platformName;
		this.apkPath = apkPath;
		this.log4jPath = log4jPath;
		this.delivery = delivery;
		this.ipAppium = ipAppium;
		this.portAppium = portAppium;
		this.deviceName = deviceName;
		this.platformVersion = platformVersion;
		this.browser = browser;
		this.driverPath = driverPath;
		this.reportPath = reportPath;
		this.reportRepository = reportRepository;
		this.imageRepository = imageRepository;
		this.deliveryPath = deliveryPath;
		this.urlDriver = urlDriver;
		this.pruebaRemota = pruebaRemota;
		this.urlPrestadores = urlPrestadores;
		this.urlMedico = urlMedico;
		this.urlAdmin = urlAdmin;
		this.urlSocio = urlSocio;
		this.correo = correo;
	}

	public int getPortAppium() {
		return portAppium;
	}

	@XmlElement
	public void setPortAppium(int portAppium) {
		this.portAppium = portAppium;
	}

	public String getIpAppium() {
		return ipAppium;
	}

	@XmlElement
	public void setIpAppium(String ipAppium) {
		this.ipAppium = ipAppium;
	}

	public String getDeliveryPath() {
		return deliveryPath;
	}

	@XmlElement
	public void setDeliveryPath(String deliveryPath) {
		this.deliveryPath = deliveryPath;
	}

	public String getApkPath() {
		return apkPath;
	}

	@XmlElement
	public void setApkPath(String apkPath) {
		this.apkPath = apkPath;
	}

	public String getLog4jPath() {
		return log4jPath;
	}

	@XmlElement
	public void setLog4jPath(String log4jPath) {
		this.log4jPath = log4jPath;
	}

	public String getDelivery() {
		return delivery;
	}

	@XmlElement
	public void setDelivery(String delivery) {
		this.delivery = delivery;
	}

	public String getReportPath() {
		return reportPath;
	}

	@XmlElement
	public void setReportPath(String reportPath) {
		this.reportPath = reportPath;
	}

	public String getReportRepository() {
		return reportRepository;
	}

	@XmlElement
	public void setReportRepository(String reportRepository) {
		this.reportRepository = reportRepository;
	}

	public String getImageRepository() {
		return imageRepository;
	}

	@XmlElement
	public void setImageRepository(String imageRepository) {
		this.imageRepository = imageRepository;
	}

	public String getPlatformVersion() {
		return platformVersion;
	}

	@XmlElement
	public void setPlatformVersion(String platformVersion) {
		this.platformVersion = platformVersion;
	}

	@XmlElement
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getDeviceName() {
		return deviceName;
	}
	
	public String getPlatformName() {
		return platformName;
	}

	@XmlElement
	public void setPlatformName(String platformName) {
		this.platformName = platformName;
	}

	public String getBrowser() {
		return browser;
	}

	public String getUrlPrestadores() {
		return urlPrestadores;
	}

	public String getUrlMedico() {
		return urlMedico;
	}

	public String getUrlAdmin() {
		return urlAdmin;
	}

	public String getUrlSocio() {
		return urlSocio;
	}

	public String getCorreo() {
		return correo;
	}

	public String getDriverPath() {
		return driverPath;
	}

	public String getUrlDriver() {
		return urlDriver;
	}

	public String getPruebaRemota() {
		return pruebaRemota;
	}

	@XmlElement
	public void setBrowser(String browser) {
		this.browser = browser;
	}

	@XmlElement
	public void setUrlPrestadores(String urlPrestadores) {
		this.urlPrestadores = urlPrestadores;
	}

	@XmlElement
	public void setUrlMedico(String urlMedico) {
		this.urlMedico = urlMedico;
	}

	@XmlElement
	public void setUrlAdmin(String urlAdmin) {
		this.urlAdmin = urlAdmin;
	}

	@XmlElement
	public void setUrlSocio(String urlSocio) {
		this.urlSocio = urlSocio;
	}

	@XmlElement
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@XmlElement
	public void setDriverPath(String driverPath) {
		this.driverPath = driverPath;
	}

	@XmlElement
	public void setUrlDriver(String urlDriver) {
		this.urlDriver = urlDriver;
	}

	@XmlElement
	public void setPruebaRemota(String pruebaRemota) {
		this.pruebaRemota = pruebaRemota;
	}

}
