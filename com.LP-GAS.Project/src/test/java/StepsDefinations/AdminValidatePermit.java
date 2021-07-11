package StepsDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import Utilities.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminValidatePermit extends Base{
	
	
	@Given("Click on Grant Permit Module")
	public void click_on_grant_permit_module() throws Exception {
		WebElement permit = driver.findElement(By.xpath("//span[normalize-space()='Grant Permits']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", permit);
	
		Thread.sleep(1000);	
			
	}

	@When("Click on Appliances from drop down list")
	public void click_on_appliances_from_drop_down_list() throws Exception {
	 
		WebElement appliance = driver.findElement(By.xpath("//span[normalize-space()='Appliances']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", appliance);
		Thread.sleep(1000);	
		
		
	}

	@When("Click on edit or view option")
	public void click_on_edit_or_view_option() throws Exception {
	
		WebElement edit1 = driver.findElement(By.xpath("//tbody/tr[1]/td[9]/input[1]"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", edit1);
		Thread.sleep(1000);
		
	}

	@When("Click on Validate form button")
	public void click_on_validate_form_button() throws Exception {
	   
		WebElement valid = driver.findElement(By.xpath("//body/app-root/block-ui/div/div/section/app-home/app-permit-form/div[1]/div[1]/button[1]"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", valid);
		Thread.sleep(1000);
		
	}

	@When("Write in comment box {string}")
	public void write_in_comment_box(String Comment) throws Exception {
		WebElement comment1 = driver.findElement(By.xpath("//textarea[@formcontrolname='AcceptRejectFormComment']"));
		comment1.sendKeys(Comment);
		Thread.sleep(1000);
		
	}

	@Then("Click on the  Approve button")
	public void click_on_the_approve_button() throws Exception {
	   
		WebElement approve = driver.findElement(By.xpath("//button[normalize-space()='Approve']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",approve);
		Thread.sleep(1000);

	}


}
