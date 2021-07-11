package StepsDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utilities.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ApplicantTrainingPayment extends Base{
	
	@Given("Select Training module")
	public void select_training_module() throws Exception {
		  
	action = new Actions(driver);
	WebElement Training = driver.findElement(By.xpath("//span[normalize-space()='Training Enrolment']"));
	action.moveToElement(Training).click().build().perform();
	Thread.sleep(1000);
		
	}

	@When("Select Training Details list")
	public void select_training_details_list() throws Exception {
	
		action = new Actions(driver);
		WebElement Traininglist = driver.findElement(By.xpath("//span[normalize-space()='Training Details List']"));
		action.moveToElement(Traininglist).click().build().perform();
		Thread.sleep(1000);

		
	}

	@When("Click on view option if front of appication")
	public void click_on_view_option_if_front_of_appication() throws Exception {
	    	
		Thread.sleep(1000);
		WebElement view1 = driver.findElement(By.xpath("//tbody/tr[1]/td[8]/input[1]"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", view1);
	
	}

	@When("Upload the payment proof {string}")
	public void upload_the_payment_proof(String upload) throws Exception {
		
		Thread.sleep(1000);
		WebElement upload_file = driver.findElement(By.xpath("//input[@id='file2']"));
		upload_file.sendKeys(upload);
		
		
	}

	@Then("click on upload payment proof button")
	public void click_on_upload_payment_proof_button() throws Exception {
		
		Thread.sleep(1000);
		WebElement submit = driver.findElement(By.xpath("//button[normalize-space()='Upload Payment Proofs']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", submit);	
	}

}
