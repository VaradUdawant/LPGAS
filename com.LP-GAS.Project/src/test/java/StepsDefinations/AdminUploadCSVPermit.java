package StepsDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import Utilities.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminUploadCSVPermit extends Base{

	@Given("Click  on GrantPermitModule")
	public void click_on_grant_permit_module() throws Exception {
		
		WebElement permit = driver.findElement(By.xpath("//span[normalize-space()='Grant Permits']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", permit);
	
		Thread.sleep(1000);	
		
	    
	}

	@When("Click on Appliance  from the list")
	public void click_on_appliance_from_the_list() throws Exception {

		WebElement appliance = driver.findElement(By.xpath("//span[normalize-space()='Appliances']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", appliance);
		Thread.sleep(1000);	
  
		
	}

	@When("Click on Upload Permit CSV {string}")
	public void click_on_upload_permit_csv(String Upload) throws Exception {
		
		//Click on Upload Permit CSV
		WebElement upload = driver.findElement(By.xpath("//button[normalize-space()='Upload Permit CSV']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", upload);
		Thread.sleep(1000);	
		
		
		//Upload CSV File
		WebElement upload_file = driver.findElement(By.xpath("//input[@id='file1']"));
		upload_file.sendKeys(Upload);
		Thread.sleep(1000);
	}

	@Then("Click on upload CSV button")
	public void click_on_upload_csv_button() throws Exception {
		

		WebElement upload1 = driver.findElement(By.xpath("//button[normalize-space()='Upload CSV']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", upload1);
		Thread.sleep(1000);	
	}

	
	
}
