package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static utilities.DriverConfiguration.*;
import utilities.ImportantMethods;

public class VehicleDataPage {
	
	WebDriverWait wait	= new WebDriverWait(getDriver(),10);		

	public VehicleDataPage typeModel(String model) throws Exception {

		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("model")));
			ImportantMethods.select(By.id("model"), model);
		}catch(Exception e){
			throw new Exception("It's not possible to type model. Please, verify this problem!");
		}
		return this;
	}
	public VehicleDataPage typeMake(String make) throws Exception {

		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("make")));
			ImportantMethods.select(By.id("make"), make);
		}catch(Exception e){
			throw new Exception("It's not possible to type make. Please, verify this problem!");

		}
		return this;
	}

	public VehicleDataPage typeCylinderCapacity(String ccm) throws Exception {
		try {

		}catch(Exception e) {
			throw new Exception("It's not possible to type Cylinder Capacity. Please, verify this problem!");

		}
		getDriver().findElement(By.id("cylindercapacity")).sendKeys(ccm);
		return this;
	}
	public VehicleDataPage typeEnginePerformance(String kw) throws Exception {
		try {
			getDriver().findElement(By.id("engineperformance")).sendKeys(kw);
		}catch(Exception e) {
			throw new Exception("It's not possible to type enginer performance. Please, verify this problem!");
		}

		return this;
	}

	public VehicleDataPage typeDate(String date) throws Exception {
		try {
			ImportantMethods.enterAnyDate(By.id("dateofmanufacture"), date);
		}catch(Exception e) {
			throw new Exception("It's not possible to enter data. Please, verify this problem!");

		}


		return this;
	}

	public VehicleDataPage clickRightHandDrive() throws Exception {
		try {
			getDriver().findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[1]/div[7]/p/label[2]")).click();
		}catch(Exception e) {
			throw new Exception("It's not possible to click about right hand drive. Please, verify this problem!");

		}

		return this;
	}

	public VehicleDataPage selectNumberOfSeats(String seats) throws Exception {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("numberofseats")));
			ImportantMethods.select(By.id("numberofseats"), seats);
		}catch(Exception e) {
			try {

			}catch(Exception e2) {
				throw new Exception("It's not possible to select number of seats. Please, verify this problem!");
			}
		}

		return this;
	}
	public VehicleDataPage selectNumberOfSeatsMotorcycle(String seats) throws Exception {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("numberofseatsmotorcycle")));
			ImportantMethods.select(By.id("numberofseatsmotorcycle"), seats);
		}catch(Exception e) {

			throw new Exception("It's not possible to select number of seats. Please, verify this problem!");

		}

		return this;
	}

	public VehicleDataPage selectFuelType(String fuel) throws Exception {
		try {
			ImportantMethods.select(By.id("fuel"), fuel);
		}catch(Exception e) {
			throw new Exception("It's not possible to type fuel type. Please, verify this problem!");

		}

		return this;
	}
	public VehicleDataPage typePayload(String payload) throws Exception {
		try {
			getDriver().findElement(By.id("payload")).sendKeys(payload);
		}catch(Exception e) {
			throw new Exception("It's not possible to type payload. Please, verify this problem!");
		}
		return this;
	}

	public VehicleDataPage typeTotalweight(String payload) throws Exception {
		try {
			getDriver().findElement(By.id("totalweight")).sendKeys(payload);
		}catch(Exception e) {
			throw new Exception("It's not possible to type total weight. Please, verify this problem!");

		}

		return this;
	}

	public VehicleDataPage listPrice(String price) throws Exception {
		try {
			getDriver().findElement(By.id("listprice")).sendKeys(price);
		}catch(Exception e) {
			throw new Exception("It's not possible to list price. Please, verify this problem!");

		}

		return this;
	}

	public VehicleDataPage typelicensePlateNumber(String licensePlateNumber) throws Exception {
		try {
			getDriver().findElement(By.id("licenseplatenumber")).sendKeys(licensePlateNumber);
		}catch(Exception e) {
			throw new Exception("It's not possible to type license plate number. Please, verify this problem!");

		}

		return this;
	}

	public VehicleDataPage typeAnnualMileage(String mi) throws Exception {
		try {
			getDriver().findElement(By.id("annualmileage")).sendKeys(mi);
		}catch(Exception e) {
			throw new Exception("It's not possible to type annual mileage. Please, verify this problem!");

		}

		return this;
	}



}
