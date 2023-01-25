package helpers;

import java.io.File;
import java.util.ArrayList;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import context.ContextManagerMobile;
import context.ObjectsMobile;
import context.PreObjectsMobile;
import context.UsuarioMobile;

public class XMLHelperMobile {

    public static ObjectsMobile object;
    public static ArrayList<PreObjectsMobile> preObjectsMobile = new ArrayList<PreObjectsMobile>();

    public static void guardarXml(String testName) {
        try {
            File file = new File("src\\main\\java\\context\\"+testName+".xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(ObjectsMobile.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            object.setNombreDeLaPrueba(testName);
            jaxbMarshaller.marshal(object, file);
            timer.TimersMobile.endTimer();
            object.setTiempoFinal(timer.TimersMobile.getTimer());
            ContextManagerMobile.putObject();
            //jaxbMarshaller.marshal(object, System.out);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void leerXml(String testName) {
        try {
        	File file = new File("src\\main\\java\\context\\"+testName+".xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(ObjectsMobile.class);
            Unmarshaller jaxbMarshaller = jaxbContext.createUnmarshaller();
            ObjectsMobile obj = (ObjectsMobile) jaxbMarshaller.unmarshal(file);
            object = obj;
            obj.getPasos().clear();
            timer.TimersMobile.startTimer();
            object.setTiempoInicio(String.valueOf(timer.TimersMobile.start / 1000));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex.getCause());
            System.out.println(ex.getStackTrace());
        }
    }

    public static void generarXml() {
    	UsuarioMobile usuarioMobile = new UsuarioMobile("prueba", "PASSTEST");
		ObjectsMobile obj = new ObjectsMobile(usuarioMobile, "TipoPrueba","Prioridad", "Referencia", "Asignado",
				"TiempoInicio", "TiempoFinal", "Estado", "Sprint", "version", "nombrePrueba","modulo", "descripcion","imgFalla");

        try {
            File file = new File("src/main/java/context/ObjectsMobile.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(ObjectsMobile.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.marshal(obj, file);
            jaxbMarshaller.marshal(obj, System.out);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
