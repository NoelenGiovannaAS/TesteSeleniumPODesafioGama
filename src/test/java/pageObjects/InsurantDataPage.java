package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static utilities.DriverConfiguration.*;

import java.io.File;
import java.util.List;

import utilities.ImportantMethods;

public class InsurantDataPage {
	
	WebDriverWait wait	= new WebDriverWait(getDriver(),10);		

	public InsurantDataPage typeFirstName(String firstName) throws Exception {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstname")));
		    getDriver().findElement(By.id("firstname")).sendKeys(firstName);
		    return this;
		}catch(Exception e) {
			throw new Exception("It's not possible to type firstname");
			
		}
		
	}
	
	public InsurantDataPage typeLastName(String lastName) throws Exception {
		try {
			getDriver().findElement(By.id("lastname")).sendKeys(lastName);
			return this;
		}catch(Exception e) {
			throw new Exception("It's not possible to type lastName");
		}
	    
	}
	public InsurantDataPage typeDateOfBirth(String dateOfBirth) throws Exception {
		try {
			ImportantMethods.enterAnyDate(By.id("birthdate"), dateOfBirth);
			return this;
		}catch(Exception e) {
			throw new Exception("It's not possible to type dateOfBirth");

		}
	   
	}
	
	public InsurantDataPage clickGender(String gender) throws Exception {
		/*if(gender.equals("female")) {
			getDriver().findElement(By.id("genderfemale")).click();
		}else {
			getDriver().findElement(By.id("gendermale")).click();

		}*/
		try {
			getDriver().findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[2]/span")).click();
			return this;
		}catch(Exception e) {
			throw new Exception("It's not possible to click on gender");

		}
		
	}
	public InsurantDataPage typeStreetAddress(String street) throws Exception {
		try {
			getDriver().findElement(By.id("streetaddress")).sendKeys(street);
			return this;
		}catch(Exception e) {
			throw new Exception("It's not possible to type street");

		}
	    
	}
	public InsurantDataPage selectCountry(String country) throws Exception {
		try {
			ImportantMethods.select(By.id("country"), country);
			return this;
		}catch(Exception e) {
			throw new Exception("It's not possible to select country");

		}
		
	}
	public InsurantDataPage typeZipCode(String zipCode) throws Exception {
		try {
			getDriver().findElement(By.id("zipcode")).sendKeys(zipCode);
			return this;
		}catch(Exception e) {
			throw new Exception("It's not possible to type zipCode");

		}
		
	}
	public InsurantDataPage typeCity(String city) throws Exception {
		try {
			getDriver().findElement(By.id("city")).sendKeys(city);
			return this;
		}catch(Exception e) {
			throw new Exception("It's not possible to type city");

		}
		
	}
	public InsurantDataPage selectOccupation(String occupation) throws Exception {
		try {
			ImportantMethods.select(By.id("occupation"), occupation);
			return this;
		}catch(Exception e) {
			throw new Exception("It's not possible to select occupation");

		}
		
	}
	public InsurantDataPage clickHobbies() throws Exception {
		/*wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Hobbies")));

		List<WebElement> checks = getDriver().findElements(By.className("ideal-radiocheck-label"));
		for(WebElement check : checks) {
			
		}*/try {
			getDriver().findElement(By.xpath("//form[@id='insurance-form']/div/section[2]/div[10]/p/label[2]/span")).click();
	        getDriver().findElement(By.xpath("//form[@id='insurance-form']/div/section[2]/div[10]/p/label[4]/span")).click();
			return this;

		}catch(Exception e) {
			throw new Exception("It's not possible to click on hobbies");

		}
		
        
	}
	public InsurantDataPage typeWebSite(String website) throws Exception {
		try {
			getDriver().findElement(By.id("website")).sendKeys(website);
			return this;
		}catch(Exception e) {
			throw new Exception("It's not possible to type firstname");

		}
		
	}
	public InsurantDataPage sendAPicture(String picture) throws Exception {
		//ImportantMethods.upload(By.id("open"), picture);
		try {
			WebElement chooseFile = getDriver().findElement(By.id("picture"));
			chooseFile.sendKeys(System.getProperty("user.dir") + File.separator +"files"+ File.separator + picture);
			return this;
		}catch(Exception e) {
			throw new Exception("It's not possible to choose picture");
		}
		
	}
}
