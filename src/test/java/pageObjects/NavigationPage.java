package pageObjects;

import static utilities.DriverConfiguration.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.ImportantMethods;

public class NavigationPage {
	WebDriverWait wait	= new WebDriverWait(getDriver(),10);

	public NavigationPage accessWebSite(String website) throws Exception {
		try {
			
			getDriver().get(website);
			
		}catch(Exception e){
			throw new Exception("It's not possible to get the address. Please, verify this problem!");
		}
		
		return this;
	}
	
	public NavigationPage clickOnTheTab(String tab) throws Exception {
		try {
			getDriver().findElement(By.name(tab)).click();

		}catch(Exception e) {
			throw new Exception("It's not possible to click on the tab. Please, verify this problem!");

		}

		return this;
	}
	
	public NavigationPage clickNext(String next) throws Exception {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("Next (" + next +")")));
			getDriver().findElement(By.name("Next (" + next +")")).click();

		}catch(Exception e) {
			throw new Exception("It's not possible to click on Next button. Please, verify this problem!");

		}
		return this;
	}
	
	public NavigationPage clickSend() throws Exception {
		try {
			getDriver().findElement(By.id("sendemail")).click();
		}catch(Exception e) {
			throw new Exception("It's not clicking to send e-mail. Please verify");
		}
		return this;
	}
	
	
	
}
