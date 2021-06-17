package utilities;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class DriverConfiguration {
	private static WebDriver driver;
	private static String pathDriver = System.getProperty("user.dir") + File.separator + "drivers" + File.separator + "chromedriver.exe";			
	public DriverConfiguration() {
	}
	

	public static WebDriver getDriver() {
		if(driver == null) {
			System.setProperty("webdriver.chrome.driver", pathDriver);
			driver = new ChromeDriver();
			driver.manage().window().setSize(new Dimension (1360, 768));
			driver.manage().deleteAllCookies();
		}
		return driver;
	}
	
	
	public static void killDriver() {
		if(driver != null) {
			driver.quit();
			driver = null; 
		}
	}
}
