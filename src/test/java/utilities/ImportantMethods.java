package utilities;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import static utilities.DriverConfiguration.*;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class ImportantMethods {
	static Select combo;
	static WebElement element;
	static WebDriverWait wait;
	static SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
	static Date data = new Date();
	String data_atual = formatador.format(data);

	public static void select(By where, String choose) {
		 element = getDriver().findElement(where);
		 combo = new Select(element);
		 combo.selectByVisibleText(choose);
	}
	
	
	public WebElement waitMethod(int time, By element) {
		wait = new WebDriverWait(getDriver(), time);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(element));
	}
	
	
	
	public static void enterAnyDate(By campoData, String data)throws Exception {
		try {
			getDriver().findElement(campoData).clear();
			getDriver().findElement(campoData).click();
			getDriver().findElement(campoData).sendKeys(data);
		}catch(Exception e) {
			throw new Exception("Não foi possível localizar o campo 'data' e/ou inserir a data desejada");
		}
	}

	public void enterCurrentDate(By campoData) throws Exception {
		try {
			
			SimpleDateFormat formatador = new SimpleDateFormat ("dd/MM/yyyy hh:MM:ss");
			data = new Date();
			String dataformatada = formatador.format(data);
			getDriver().findElement(campoData).clear();
			getDriver().findElement(campoData).click();
			getDriver().findElement(campoData).sendKeys(dataformatada);
		}catch(Exception e) {
			throw new Exception("Não foi possível localizar o campo 'data' e/ou inserir a data do dia atual");
		}
	}
	
	public static void upload(By botaoNome, String arquivo)throws Exception {
		//getDriver().findElement(botaoNome).click();
		WebElement fileInput = getDriver().findElement(botaoNome);
		waitMethod(1);
		fileInput.sendKeys(System.getProperty("user.dir") + File.separator +"files"+ File.separator + arquivo);
	}
	
	public static boolean isPresent(By element) {
		try {
			getDriver().findElement(element).getText();
		}catch(NoSuchElementException e){
			return false;
		}
		return true;
	}
	
	public static void waitMethod(int intSegundo) {
		try {
			synchronized (getDriver()) {
				getDriver().wait(intSegundo * 1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
}
