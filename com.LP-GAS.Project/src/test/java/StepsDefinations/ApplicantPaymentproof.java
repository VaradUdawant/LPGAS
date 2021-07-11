package StepsDefinations;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Utilities.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ApplicantPaymentproof extends Base{


	
	@Given("Click on the membership")
	public void click_on_the_membership() throws Exception {
	 
		 Thread.sleep(1000);
		 action = new Actions(driver);
		 WebElement MembershipApp = driver.findElement(By.xpath("//span[normalize-space()='Membership']"));
		 action.moveToElement(MembershipApp).click().perform();			
	
	}
	
	
	
	

	@When("select Membership Application  from drop down")
	public void select_membership_application_from_drop_down() throws Exception {
	 
		 Thread.sleep(1000);
		 action = new Actions(driver);
		 WebElement MembershipApp = driver.findElement(By.xpath("//span[normalize-space()='Membership Application']"));
		 action.moveToElement(MembershipApp).click().perform();	
	}
	
	
	
	@When("Click on view option in front of application id")
	public void click_on_view_option_in_front_of_application_id() throws Exception {
	
		Thread.sleep(1000);
		WebElement edit1 = driver.findElement(By.xpath("//tbody/tr[2]/td[10]/input[1]"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", edit1);
	

	}

	
	
	@When("upload the paymentproof by clicking on choose file {string}")
	public void upload_the_paymentproof_by_clicking_on_choose_file(String upload) throws Exception {
		
		//Upload pymentproof
	
		Thread.sleep(1000);
	
		WebElement upload_file = driver.findElement(By.id("file2"));
		upload_file.sendKeys(upload);
		
	}

	
	
	@Then("Clik on Pyament proof button")
	public void clik_on_pyament_proof_button() throws Exception {
		
		Thread.sleep(1000);
		WebElement paymentproof = driver.findElement(By.xpath("//button[normalize-space()='Upload Payment Proofs']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", paymentproof);
	
	}

	
}
