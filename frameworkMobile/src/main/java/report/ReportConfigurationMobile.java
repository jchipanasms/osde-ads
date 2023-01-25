package report;


import config.DataSetterMobile;
import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class ReportConfigurationMobile {

    public static String titleAddTitle;
    public static String titleAddSubject;
    public static String titleAddKeyWords;
    public static String titleAddAutor;
    public static String titleAddCreator;
    public static String titleTitle;
    public static String titleReportBy;
    public static String titleIntroDetails;
    public static String titleSecondTitle;
    public static String titleSecondDetails;
    public static String titleThirdTitle;
    public static String titleThirdDetails;
    public static String testContentTitle;
    public static String testContentExecuteBy;
    public static String testContentTestDescription;
    public static String testContentObjetiveDescription;

    public static ReportConfigurationMobile reportConfigurationMobile;

    public static ReportConfigurationMobile getInstance() {
        if (reportConfigurationMobile == null) {
            reportConfigurationMobile = new ReportConfigurationMobile();
            return reportConfigurationMobile;
        } else {
            return reportConfigurationMobile;
        }
    }

    public String getTitleAddTitle() {
        return titleAddTitle;
    }

    @XmlElement
    public void setTitleAddTitle(String titleAddTitle) {
        ReportConfigurationMobile.titleAddTitle = titleAddTitle;
    }

    public String getTitleAddSubject() {
        return titleAddSubject;
    }

    @XmlElement
    public void setTitleAddSubject(String titleAddSubject) {
        ReportConfigurationMobile.titleAddSubject = titleAddSubject;
    }

    public String getTitleAddKeyWords() {
        return titleAddKeyWords;
    }

    @XmlElement
    public void setTitleAddKeyWords(String titleAddKeyWords) {
        ReportConfigurationMobile.titleAddKeyWords = titleAddKeyWords;
    }

    public String getTitleAddAutor() {
        return titleAddAutor;
    }

    @XmlElement
    public void setTitleAddAutor(String titleAddAutor) {
        ReportConfigurationMobile.titleAddAutor = titleAddAutor;
    }

    public String getTitleAddCreator() {
        return titleAddCreator;
    }

    @XmlElement
    public void setTitleAddCreator(String titleAddCreator) {
        ReportConfigurationMobile.titleAddCreator = titleAddCreator;
    }

    public String getTitleTitle() {
        return titleTitle;
    }

    @XmlElement
    public void setTitleTitle(String titleTitle) {
        ReportConfigurationMobile.titleTitle = titleTitle;
    }

    public String getTitleReportBy() {
        return titleReportBy;
    }

    @XmlElement
    public void setTitleReportBy(String titleReportBy) {
        ReportConfigurationMobile.titleReportBy = titleReportBy;
    }

    public String getTitleIntroDetails() {
        return titleIntroDetails;
    }

    @XmlElement
    public void setTitleIntroDetails(String titleIntroDetails) {
        ReportConfigurationMobile.titleIntroDetails = titleIntroDetails;
    }

    public String getTitleSecondTitle() {
        return titleSecondTitle;
    }

    @XmlElement
    public void setTitleSecondTitle(String titleSecondTitle) {
        ReportConfigurationMobile.titleSecondTitle = titleSecondTitle;
    }

    public String getTitleSecondDetails() {
        return titleSecondDetails;
    }

    @XmlElement
    public void setTitleSecondDetails(String titleSecondDetails) {
        ReportConfigurationMobile.titleSecondDetails = titleSecondDetails;
    }

    public String getTitleThirdTitle() {
        return titleThirdTitle;
    }

    @XmlElement
    public void setTitleThirdTitle(String titleThirdTitle) {
        ReportConfigurationMobile.titleThirdTitle = titleThirdTitle;
    }

    public String getTitleThirdDetails() {
        return titleThirdDetails;
    }

    @XmlElement
    public void setTitleThirdDetails(String titleThirdDetails) {
        ReportConfigurationMobile.titleThirdDetails = titleThirdDetails;
    }

    public String getTestContentTitle() {
        return testContentTitle;
    }

    @XmlElement
    public void setTestContentTitle(String testContentTitle) {
        ReportConfigurationMobile.testContentTitle = testContentTitle;
    }

    public String getTestContentExecuteBy() {
        return testContentExecuteBy;
    }

    @XmlElement
    public void setTestContentExecuteBy(String testContentExecuteBy) {
        ReportConfigurationMobile.testContentExecuteBy = testContentExecuteBy;
    }

    public String getTestContentTestDescription() {
        return testContentTestDescription;
    }

    @XmlElement
    public void setTestContentTestDescription(String testContentTestDescription) {
        ReportConfigurationMobile.testContentTestDescription = testContentTestDescription;
    }

    public String getTestContentObjetiveDescription() {
        return testContentObjetiveDescription;
    }

    @XmlElement
    public void setTestContentObjetiveDescription(String testContentObjetiveDescription) {
        ReportConfigurationMobile.testContentObjetiveDescription = testContentObjetiveDescription;
    }

    public static void exitReport() {
        ReportMobile.generatePdfReport();
    }

    public static void getReportConfig(String testName) {
        try {
            File file = new File(DataSetterMobile.configurationMobile.getReportPath());
            JAXBContext jaxbContext = JAXBContext.newInstance(ReportConfigurationMobile.class);
            Unmarshaller jaxUnmarshaller = jaxbContext.createUnmarshaller();
            ReportConfigurationMobile obj = (ReportConfigurationMobile) jaxUnmarshaller.unmarshal(file);
            titleAddAutor = obj.getTitleAddAutor();
            titleAddTitle = obj.getTitleAddTitle();
            titleAddSubject = obj.getTitleAddSubject();
            titleAddKeyWords = obj.getTitleAddKeyWords();
            titleAddAutor = obj.getTitleAddCreator();
            titleAddCreator = obj.getTitleAddAutor();
            titleTitle = obj.getTitleTitle();
            titleReportBy = obj.getTitleReportBy();
            titleIntroDetails = obj.getTitleIntroDetails();
            titleSecondTitle = obj.getTitleSecondTitle();
            titleSecondDetails = obj.getTitleSecondDetails();
            titleThirdTitle = obj.getTitleThirdTitle();
            titleThirdDetails = obj.getTitleThirdDetails();
            testContentTitle = obj.getTestContentTitle();
            testContentExecuteBy = obj.getTestContentExecuteBy();
            testContentTestDescription = obj.getTestContentTestDescription();
            testContentObjetiveDescription = obj.getTestContentObjetiveDescription();
            //String test = testName;
        } catch (Exception ex) {
        	ex.printStackTrace();
            System.out.println("error reporte" + ex.getMessage());
        }
    }
    
}  