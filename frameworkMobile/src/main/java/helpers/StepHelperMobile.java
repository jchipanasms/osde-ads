package helpers;

import static base.BaseMobile.driver;
import static config.DataSetterMobile.configurationMobile;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.google.common.io.Files;

import base.BasePageMobile;
import base.BaseStepMobile;
import log.LogMobile;

import java.io.File;
import java.util.Random;

public class StepHelperMobile {

	public static String emailGenerator() {
		String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		StringBuilder salt = new StringBuilder();
		Random rnd = new Random();
		while (salt.length() < 6) {
			int index = (int) (rnd.nextFloat() * SALTCHARS.length());
			salt.append(SALTCHARS.charAt(index));
		}
		String saltStr = salt.toString();
		saltStr = "AutoIt" + saltStr + "@gmail.com";

		return saltStr;
	}

	public static String takeScreenShot(String imageName) {
		File Directory = new File(configurationMobile.getImageRepository());
		String pathImg = "";
		try {
			if (Directory.isDirectory()) {
				// Capturamos la pantalla de nuestro navegador
				File imagen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

				DateFormat dateFormat = new SimpleDateFormat("yyyyMMddhhmmss");
				Date date = new Date();
				String dateF = dateFormat.format(date);
				pathImg = Directory.getAbsolutePath() + "\\" + imageName + "_" + dateF + ".png";
				Files.copy(imagen, new File(pathImg));
			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		return pathImg;
	}

}
