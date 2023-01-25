package config;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class DataSetterMobile {

    public static ConfigurationMobile configurationMobile;

    public static void getConfiguration() {
        try {
            File file = new File("src/main/java/configuration/ConfigurationFileMobile.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(ConfigurationMobile.class);
            Unmarshaller jaxUnmarshaller = jaxbContext.createUnmarshaller();
            configurationMobile = (ConfigurationMobile) jaxUnmarshaller.unmarshal(file);
        } catch (Exception ex) {
        	ex.printStackTrace();
            System.out.println(ex.getMessage());
        }
    }

    public static void dispose() {
        configurationMobile = null;
    }
}
