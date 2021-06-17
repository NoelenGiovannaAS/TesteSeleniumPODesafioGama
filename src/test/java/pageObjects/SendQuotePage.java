package pageObjects;

import static utilities.DriverConfiguration.getDriver;

import java.sql.Driver;

import org.openqa.selenium.By;

public class SendQuotePage {
	public SendQuotePage typeEmail(String email) throws Exception {
		try {
			getDriver().findElement(By.id("email")).sendKeys(email);
			return this;
		}catch(Exception e) {
			throw new Exception("It's not possible to type e-mail");

		}

	}
	public SendQuotePage typeUsername(String username) throws Exception {

		try {
			getDriver().findElement(By.id("username")).sendKeys(username);
			return this;
		}catch(Exception e) {
			throw new Exception("It's not possible to type username");

		}
	}
	public SendQuotePage typePhone(String phone) throws Exception {

		try {
			getDriver().findElement(By.id("phone")).sendKeys(phone);
			return this;
		}catch(Exception e) {
			throw new Exception("It's not possible to type phone");

		}

	}
	public SendQuotePage typePassword(String password) throws Exception {
		try {
			getDriver().findElement(By.id("password")).sendKeys(password);
			return this;
		}catch(Exception e) {
			throw new Exception("It's not possible to type password");

		}


	}
	public SendQuotePage typeConfirmPassword(String confirmpassword) throws Exception {
		try {
			getDriver().findElement(By.id("confirmpassword")).sendKeys(confirmpassword);
			return this;
		}catch(Exception e) {
			throw new Exception("It's not possible to confirm password");

		}


	}
	public SendQuotePage typeComments(String comments) throws Exception {

		try {
			getDriver().findElement(By.id("Comments")).sendKeys(comments);
			return this;
		}catch(Exception e) {
			throw new Exception("It's not possible to type comments");

		}

	}


}
