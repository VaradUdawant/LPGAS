package StepsDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import Utilities.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class firefoxLogin extends Base {

	
	@Given("user launching the application by firefox browser")
	public void user_launching_the_application_by_firefox_browser() {
	   
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("--disable-notifications");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		WebDriverManager.chromedriver().setup();
		driver = (WebDriver) new FirefoxOptions(options);
		driver.manage().window().maximize();
		driver.get("http://3.10.128.142/lpgas_demo_frontend/#/home/dashboard");
		
		
		
		
	}

	@When("user login module by using username {string} and password is {string}")
	public void user_login_module_by_using_username_and_password_is(String string, String string2) {
	   
	}

	@Then("user click on the Login button")
	public void user_click_on_the_login_button() {
	   
	}


	
	
}
