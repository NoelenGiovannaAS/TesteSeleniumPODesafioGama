package pageObjects;

import static utilities.DriverConfiguration.getDriver;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.ImportantMethods;

public class PriceOptionPage {
	WebDriverWait wait	= new WebDriverWait(getDriver(),10);
	public PriceOptionPage clickOption() throws Exception {
		/*List<WebElement> checksOptions = getDriver().findElements(By.name("Select Option"));
		for(WebElement checks : checksOptions) {
			checks.click();
			getDriver().findElement(By.name("View Quote")).click();
			List<String> abas = new ArrayList<>(getDriver().getWindowHandles());
			getDriver().switchTo().window(abas.get(0));
			getDriver().findElement(By.name("Download Quote")).click();
		}
		 */	
		try {

			 getDriver().findElement(By.xpath("//th[2]/label[4]/span")).click();
			 return this;
		 }catch(Exception e) {
			 throw new Exception("It's not possible to click on an option");
		 }
	}
		 public PriceOptionPage clickDownloadQuote() {
			 ImportantMethods.waitMethod(1);
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("Download Quote")));
			 getDriver().findElement(By.name("Download Quote")).click();
			 ImportantMethods.waitMethod(1);


			 getDriver().findElement(By.xpath("//*[@id=\"downloadquote\"]/span")).click();
			 //List<String> abas = new ArrayList<>(getDriver().getWindowHandles());
			 //getDriver().switchTo().window(abas.get(0));
			 //getDriver().findElement(By.name("Download Quote")).click();


			 return this;
		 }

		 public PriceOptionPage clickViewQuote() {
			 ImportantMethods.waitMethod(1);
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("View Quote")));
			 getDriver().findElement(By.name("View Quote")).click();
			 ImportantMethods.waitMethod(10);
			 List<String> abas = new ArrayList<>(getDriver().getWindowHandles());
			 getDriver().switchTo().window(abas.get(1));
			 getDriver().close();
			 getDriver().switchTo().window(abas.get(0));
			 ImportantMethods.waitMethod(222);

			 return this;
		 }	
	}


