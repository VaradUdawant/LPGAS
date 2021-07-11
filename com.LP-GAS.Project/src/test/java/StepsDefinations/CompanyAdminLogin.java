package StepsDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import Utilities.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CompanyAdminLogin extends Base {
	
	@Given("launching the application")
	public void launching_the_application() {
	  
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://3.10.128.142/lpgas_demo_frontend/#/home/dashboard");
		
		
		
	}

	@When("user login using username {string} password {string}")
	public void user_login_using_username_password(String username, String password) {
WebElement uname = driver.findElement(By.cssSelector("input[placeholder='Email Address']"));
		
		uname.sendKeys(username);
		
		WebElement passw = driver.findElement(By.cssSelector("input[placeholder='Password']"));
		//passw.clear();
		passw.sendKeys(password);
		
		
	}

	@When("Click on Login button")
	public void click_on_login_button() throws Exception {
	    
		WebElement LogIn = driver.findElement(By.xpath("//button[normalize-space()='Log In']"));
		LogIn.click();
		Thread.sleep(2000);
		
	
	}


}
