package delivery;


import config.DataSetterMobile;
import context.PreObjectsMobile;
import helpers.XMLHelperMobile;
import log.LogMobile;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class EmailSenderMobile {

    public static EmailSenderConfigurationMobile emailConfiguration;

    public static void getEmailDeliveyConfiguration() {
        try {
            File file = new File(DataSetterMobile.configurationMobile.getDeliveryPath());
            JAXBContext jaxbContext = JAXBContext.newInstance(EmailSenderConfigurationMobile.class);
            Unmarshaller jaxUnmarshaller = jaxbContext.createUnmarshaller();
            emailConfiguration = (EmailSenderConfigurationMobile) jaxUnmarshaller.unmarshal(file);
        } catch (Exception ex) {
            LogMobile.info(ex.getMessage());
        }
    }

    public static void InitializeEmailDeliveryConfiguration() {
        getEmailDeliveyConfiguration();
    }

    public static void exitDelivery() {
        sendEmail();
    }

    public static void sendEmail() {
        String from = emailConfiguration.getEmailFrom();
        Properties props = new Properties();
        props.put("mail.smtp.auth", emailConfiguration.getMailAuth());
        props.put("mail.smtp.starttls.enable", emailConfiguration.getMailStarttls());
        props.put("mail.smtp.host", emailConfiguration.getSmptHost());
        props.put("mail.smptp.port", emailConfiguration.getPort());

        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(EmailSenderConfigurationMobile.getUser(),
                        EmailSenderConfigurationMobile.getPassword());
            }
        });

        try {
            // Create a default MimeMessage object.
            Message message = new MimeMessage(session);

            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));

            // Set To: header field of the header.
            for (String e : emailConfiguration.getEmailGroup()) {
                message.addRecipient(Message.RecipientType.TO, new InternetAddress(e));
            }
            
           
            // Set Subject: header field
           message.setSubject(subjectBuilderMail());

                       
            // Create the message part
            BodyPart messageBodyPart = new MimeBodyPart();

            // Now set the actual message
            messageBodyPart.setContent(bodyBuilderMail(), "text/html");
            
            // Create a multipar message
            Multipart multipart = new MimeMultipart();

            // Set text message part
            multipart.addBodyPart(messageBodyPart);

            // Part two is attachment
            messageBodyPart = new MimeBodyPart();
            String filename = System.getProperty("user.dir") + DataSetterMobile.configurationMobile.getReportRepository();
            DataSource source = new FileDataSource(filename);
            messageBodyPart.setDataHandler(new DataHandler(source));
            messageBodyPart.setFileName("Reporte.pdf");
            multipart.addBodyPart(messageBodyPart);
         
            
            // Send the complete message parts
            message.setContent(multipart);

            // Send message
            Transport.send(message);
            
            LogMobile.info("Sent message successfully....");

        } catch (Exception e) {
        	System.out.println("Error email send  - " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public static String subjectBuilderMail() {
        String subject = "";
        subject += "REGRESSION :: VERSION [" + XMLHelperMobile.object.getVersion() + "] ::";
        subject += "SPRINT [" + XMLHelperMobile.object.getSprint() + "] ::";
        subject += getDate();

        return subject;
    }

    public static String bodyBuilderMail() {
        String body = "<!DOCTYPE html><html>";
        body += "<head>"
                + "Este email contiene informaci�n sobre la ejecuci�n autom�tica de"
                + " los test del d�a  ";
        body += getDate() + "<head><body>";
        body += "<br>" + "<b>Sprint</b>: " + XMLHelperMobile.object.getSprint();
        body += "<br>" + "<b>Version</b>: " + XMLHelperMobile.object.getVersion();
        body += "<br>"
                + "<br>";
        body += "<table width='100%' border='1' align='center'>"
                + "<tr>"
                + "<th>Id test</th>"
                + "<th>Version</th>"
                + "<th>Priority</th>"
                + "<th>Sprint</th>"
                + "<th>Duration</th>"
                + "<th>Status</th>"
                + "<tr>";
        for (PreObjectsMobile o : XMLHelperMobile.preObjectsMobile) {
            body += "<tr>"
                    + "<td>" + o.obj.getNombreDeLaPrueba() + "</td>";
            body += "<td>" + o.obj.getVersion() + "</td>";
            body += "<td>" + o.obj.getPrioridad() + "</td>";
            body += "<td>" + o.obj.getSprint() + "</td>";
            body += "<td>" + o.obj.getTiempoFinal() + "</td>";
            body += "<td>" + o.obj.getEstado() + "</td>";
        }

        body += "</table>"
                + "<br><br>"
                + "Automatic Delivery"
                + "<br>"
                + "<b>Automatizaci�n de Pruebas de Regresi�n</b>"
                + "<br>"
                + "</body>"
                + "</html>";

        return body;

    }

    public static String getDate() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }

}