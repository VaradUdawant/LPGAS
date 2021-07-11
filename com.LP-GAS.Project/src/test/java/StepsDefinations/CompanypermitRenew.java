package StepsDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utilities.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CompanypermitRenew extends Base{

	@Given("Click on appliance permit module")
	public void click_on_appliance_permit_module() throws Exception {
		WebElement Appliance = driver.findElement(By.xpath("//span[normalize-space()='Appliance Permit']"));
		Appliance.click();
		Thread.sleep(2000);
		
	}

	@When("select renewal permit from drop down")
	public void select_renewal_permit_from_drop_down() throws Exception {
		WebElement RenewPermit = driver.findElement(By.xpath("//span[contains(text(),'Renew Permit')]"));
		RenewPermit.click();
		Thread.sleep(2000);
	
	}

	@When("Click on edit\\/view option")
	public void click_on_edit_view_option() throws Exception {
	
		action = new Actions(driver);
		WebElement edit = driver.findElement(By.xpath("//tbody/tr[2]/td[9]/input[1]"));
		action.moveToElement(edit).click().build().perform();
		Thread.sleep(1000);
		
	}

	@When("Upload the Quality Management System {string} and Test Report {string}")
	public void upload_the_quality_management_system_and_test_report(String QMS, String Report) {
		//UploadQMS
		WebElement uploadqms = driver.findElement(By.xpath("//input[@id='file1']"));
		uploadqms.sendKeys(QMS);
		
		
		//UploadQMS
			WebElement uploadreport = driver.findElement(By.xpath("//input[@id='file3']"));
			uploadreport.sendKeys(Report);
				
		
	}

	@Then("Click on Renew Permit button")
	public void click_on_renew_permit_button() throws Exception {
	  
		Thread.sleep(1000);
		action = new Actions(driver);
		WebElement renew = driver.findElement(By.cssSelector("#btnSavePermitDetails"));
		action.moveToElement(renew).click().build().perform();
		
	}

	
	
}
