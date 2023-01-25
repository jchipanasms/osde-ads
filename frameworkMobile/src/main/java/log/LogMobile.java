package log;

import helpers.XMLHelperMobile;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import config.DataSetterMobile;


public class LogMobile {

    private static Logger logger = Logger.getLogger(LogMobile.class.getName());

    public static void intilizedLogger() {
        DOMConfigurator.configure(DataSetterMobile.configurationMobile.getLog4jPath());
    }

    public static void SuccessStep(String step) {
        try {
            String status = "Pasa";
            XMLHelperMobile.object.getPasos().put(step, status);
            XMLHelperMobile.object.setEstado(status);
            XMLHelperMobile.object.setImgFalla("");
            logger.info(step + ": " + status);
        } catch (Exception ex) {
        	LogMobile.info("Error al setear paso exitoso");
        }
    }

    public static void FailStep(String step) {
        try {
            String status = "Falla";
            XMLHelperMobile.object.getPasos().put(step, status);
            XMLHelperMobile.object.setEstado(status);
            logger.info(step + ": " + status);
        } catch (Exception ex) {
        	LogMobile.info("Error al setear paso fallido");
        }
    }

    public static void startTestCase(String sTestCaseName) {
        try {
            logger.info("Start test: " + sTestCaseName);
        } catch (Exception ex) {

        }
    }
    
    public static void endTestCase(String sTestCaseName) {
        try {
            logger.info("End test: " + sTestCaseName);
        } catch (Exception ex) {

        }
    }

    public static void info(String message) {
        logger.info(message);
    }

    public static void warn(String message) {
        logger.warn(message);
    }

    public static void debug(String message) {
        logger.debug(message);
    }
    
} 