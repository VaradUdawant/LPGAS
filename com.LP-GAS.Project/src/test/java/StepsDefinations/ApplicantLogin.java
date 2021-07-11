package StepsDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utilities.Base;
import io.cucumber.java.en.When;

public class ApplicantLogin extends Base {

	@When("user login username {string} and paswd {string}")
	public void user_login_username_and_paswd(String username, String password) {
	WebElement uname = driver.findElement(By.xpath("//input[@placeholder='Email Address']"));
	uname.sendKeys(username);
		
	WebElement passw = driver.findElement(By.xpath("//input[@placeholder='Password']"));
	passw.sendKeys(password);

	}

	@When("click on login")
	public void click_on_login() throws Exception   {
		WebElement Login = driver.findElement(By.xpath("//button[@type='submit']"));
		Login.click();
		Thread.sleep(2000);
	}
	
}
