package steps;


import static utilities.DriverConfiguration.getDriver;

import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.AfterStep;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.InsurantDataPage;
import pageObjects.NavigationPage;
import pageObjects.PriceOptionPage;
import pageObjects.ProductDataPage;
import pageObjects.SendQuotePage;
import pageObjects.VehicleDataPage;
import utilities.DriverConfiguration;
import utilities.ImportantMethods;

public class TestAutomobileInsurance {
	WebDriverWait wait	= new WebDriverWait(getDriver(),10);

	//datas
	@After
	public void after() {	
		ImportantMethods.waitMethod(1);
		DriverConfiguration.killDriver();
	}
	
	
	
	//pages
	InsurantDataPage insurant = new InsurantDataPage();
	NavigationPage  nav = new NavigationPage();
	PriceOptionPage priceO = new PriceOptionPage();
	ProductDataPage productD = new ProductDataPage();
	SendQuotePage sendQuote = new SendQuotePage();
	VehicleDataPage vehicleData = new VehicleDataPage();
	
	

	//steps
	@Given("I access the website {string}")
	public void i_access_the_website(String website) throws Exception {
		nav.accessWebSite("http://sampleapp.tricentis.com/101/app.php");
	}
	
	
	@When("I enter Vehicle Data")
	public void i_enter_Vehicle_Data() throws Exception {
		
		vehicleData.typeMake("BMW")
		.typeModel("Scooter")
		.typeCylinderCapacity("555")
    	.typeEnginePerformance("1")
    	.typeDate("06/16/2021")
    	.selectNumberOfSeats("2")
    	.clickRightHandDrive()
    	.selectNumberOfSeatsMotorcycle("1")
    	.selectFuelType("Gas")
    	.typePayload("1")
    	.typeTotalweight("11111")
    	.listPrice("500")
    	.typelicensePlateNumber("123abc")
    	.typeAnnualMileage("100");
	}

	@When("I click on the tab {string}")
	public void i_click_on_the_tab(String tab) throws Exception {
	    nav.clickOnTheTab(tab);
	}
	
	@Then("I pressione next to go to the {string} tab")
	public void i_pressione_next_to_go_to_the_tab(String tab) throws Exception {
	    nav.clickNext(tab);
	}

	@When("I enter Insurant Data")
	public void i_enter_Insurant_Data() throws Exception {
		
		try {
			insurant
		    .typeFirstName("Teste")
		    .typeLastName("Teste")
		    .typeDateOfBirth("07/24/2001")
		    .clickGender("female")
		    .typeStreetAddress("street test")
		    .selectCountry("Brazil")
		    .typeZipCode("00000000")
		    .typeCity("teste")
		    .selectOccupation("Employee")
		    .clickHobbies()
		    .typeWebSite("https://github.com/NoelenGiovannaAS")
		    .sendAPicture("teste");
		}catch(Exception e){
			throw new Exception("It's not possible to enter insuranre data!");
		}
	    
	}

	@When("I enter Product Data")
	public void i_enter_Product_Data() throws Exception {
		try {
			productD
		    .typeStartDate("07/31/2021")
		    .selectInsuranceSum("3.000.000,00")
		    .selectMeritRating("Super Bonus")
		    .selectDamageInsurance("No Coverage")
		    .chooseOptionalProducts()
		    .selectCourtesyCar("No");
		}catch(Exception e) {
			throw new Exception("It's not possible to enter insuranre data!");
		}
	    
	}


	@When("I select price Option")
	public void i_select_price_Option() throws Exception {
	    priceO
	    .clickOption();
	    //.clickViewQuote();
	    //.clickDownloadQuote();
	}

	@When("I Send Quote")
	public void i_send_quote() throws Exception {
		sendQuote
		.typeEmail("teste@teste.com")
		.typePhone("11900000000")
		.typeUsername("teste")
		.typePassword("ABCabc123")
		.typeConfirmPassword("ABCabc123")
		.typeComments("Teste Teste Teste");
	}
	@When("I send")
	public void i_send() throws Exception {
	    nav.clickSend();
	}
	
	@When("I will see the message in the screen")
	public void i_will_see_the_message() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*/text()[normalize-space(.)='Sending e-mail success!']/parent::*")));
		String text = getDriver().findElement(By.xpath("//*/text()[normalize-space(.)='Sending e-mail success!']/parent::*")).getText();
		Assert.assertEquals("Sending e-mail success!", text);
	}
	
}
