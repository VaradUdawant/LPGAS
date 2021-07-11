package StepsDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import Utilities.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CompanyPermitPaymentproof extends Base{
	
	
	@Given("Click on Appliance Permit")
	public void click_on_appliance_permit() throws Exception {
	  
		WebElement AppliancePermit = driver.findElement(By.xpath("//span[normalize-space()='Appliance Permit']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", AppliancePermit);
		Thread.sleep(1000);
	
	}

	@When("Select Permits module from the list")
	public void select_permits_module_from_the_list() throws Exception {
		
		WebElement Permit = driver.findElement(By.xpath("//span[normalize-space()='Permits']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", Permit);
		Thread.sleep(1000);
	
		
	}

	@When("Select edit or view option")
	public void select_edit_or_view_option() throws Exception {
		
		WebElement edit = driver.findElement(By.xpath("//tbody/tr[1]/td[9]/input[1]"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", edit);
		Thread.sleep(1000);
	    
	}

	@When("Chose file to be uploaded {string}")
	public void chose_file_to_be_uploaded(String file) throws Exception {
	 
		Thread.sleep(1000);
		
		WebElement upload_file = driver.findElement(By.xpath("//input[@id='file2']"));
		upload_file.sendKeys(file);
		
		
		
	}

	@Then("Click on upload payment proof button")
	public void click_on_upload_payment_proof_button() throws Exception {
	 
		WebElement upload = driver.findElement(By.xpath("//button[normalize-space()='Upload Payment Proof']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", upload);
		Thread.sleep(1000);
	    
		
	}


}
