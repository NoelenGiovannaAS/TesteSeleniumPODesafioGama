package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utilities.DriverConfiguration.*;

import java.util.List;

import utilities.ImportantMethods;

public class ProductDataPage {
	public ProductDataPage typeStartDate(String date) throws Exception {
		try {
			ImportantMethods.enterAnyDate(By.id("startdate"), date);
			return this;
		}catch(Exception e) {
			throw new Exception("It's not possible to type a date");
		}
		
	}
	
	public ProductDataPage selectInsuranceSum(String insurSum) throws Exception {
		try {
			ImportantMethods.select(By.id("insurancesum"), insurSum);
			return this;
		}catch(Exception e) {
			throw new Exception("It's not possible to select insurance sum");

		}
		
	}
	
	public ProductDataPage selectMeritRating(String meritRat) throws Exception {
		try {
			ImportantMethods.select(By.id("meritrating"), meritRat);
			return this;
		}catch(Exception e) {
			throw new Exception("It's not possible to select merit rating");

		}
		
	}
	public ProductDataPage selectDamageInsurance(String damageIns) throws Exception {
		try {
			ImportantMethods.select(By.id("damageinsurance"), damageIns);
			return this;
		}catch(Exception e) {
			throw new Exception("It's not possible to select to damage insurance");

		}
		
	}
	public ProductDataPage chooseOptionalProducts() throws Exception {
		/*List<WebElement> checks = getDriver().findElements(By.name("Optional Products[]"));
		for(WebElement check : checks) {
			check.click();
		}*/
		try {
			getDriver().findElement(By.xpath("//form[@id='insurance-form']/div/section[3]/div[5]/p/label/span")).click();

			
			return this;
		}catch(Exception e) {
			throw new Exception("It's not possible to choose Optional products");

		}
		
	}
	public ProductDataPage selectCourtesyCar(String courtesy) throws Exception {
		try {
			ImportantMethods.select(By.id("courtesycar"), courtesy);
			return this;	
		}catch(Exception e) {
			throw new Exception("It's not possible to select courtesy car");

		}
		
	}
}
