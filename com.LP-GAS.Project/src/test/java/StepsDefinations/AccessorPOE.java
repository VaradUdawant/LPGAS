package StepsDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import Utilities.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AccessorPOE extends Base{

	@Given("launching the application for accessor user")
	public void launching_the_application_for_accessor_user() {
	    
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://3.10.128.142/lpgas_demo_frontend/#/home/dashboard");
		
	}

	@When("user login with the  username {string} password {string}")
	public void user_login_with_the_username_password(String username, String password) {
	    
		//Username
		WebElement uname = driver.findElement(By.cssSelector("input[placeholder='Email Address']"));
		uname.sendKeys(username);
		
		
		//Password
		WebElement passw = driver.findElement(By.cssSelector("input[placeholder='Password']"));
		//passw.clear();
		passw.sendKeys(password);
		
		
	}

	@When("Click on the Login button given below")
	public void click_on_the_login_button_given_below() throws Exception {
		
		
		WebElement LogIn = driver.findElement(By.xpath("//button[normalize-space()='Log In']"));
		LogIn.click();
		Thread.sleep(2000);   
		
	}

	@Given("Click on POE")
	public void click_on_poe() throws Exception {
	    
		Thread.sleep(1000);
		WebElement poe = driver.findElement(By.xpath("//span[normalize-space()='POE']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", poe);
		
	}

	@When("Select POE list from drop down list")
	public void select_poe_list_from_drop_down_list() throws Exception {
	
		Thread.sleep(1000);
		WebElement poelist = driver.findElement(By.xpath("//span[normalize-space()='POE List']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", poelist);
	}

	
	@When("click on Edit option")
	public void click_on_edit_option() throws Exception {

		Thread.sleep(1000);
		WebElement edit1 = driver.findElement(By.xpath("//tbody/tr[1]/td[6]/input[1]"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", edit1);
		
	}

	@When("then verify POE by clicking on verify POE button")
	public void then_verify_poe_by_clicking_on_verify_poe_button() throws Exception {
	   
		Thread.sleep(1000);
		WebElement verify = driver.findElement(By.xpath("//button[normalize-space()='Verify POE']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", verify);
	}

	@Then("Enter comments {string} and click on approve button")
	public void enter_comments_and_click_on_approve_button(String Comment) throws Exception {
	 
		 //Write Comment
			WebElement comment = driver.findElement(By.xpath("//textarea[@type='text']"));
			comment.sendKeys(Comment);
			Thread.sleep(1000);
			
		//Click on Approve	
			Thread.sleep(1000);
			WebElement approve = driver.findElement(By.xpath("//button[normalize-space()='Approve']"));
			JavascriptExecutor js= (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", approve);

	}

	
}
