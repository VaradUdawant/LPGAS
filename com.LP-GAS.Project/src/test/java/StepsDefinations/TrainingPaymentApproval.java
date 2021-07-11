package StepsDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import Utilities.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TrainingPaymentApproval extends Base {

	@Given("Click on Training module")
	public void click_on_training_module() throws Exception {
	    
		WebElement Training = driver.findElement(By.xpath("//span[normalize-space()='Training Enrolment']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", Training);
		Thread.sleep(1000);
		
	}

	@When("Click on Training Details Module")
	public void click_on_training_details_module() throws Exception {
	   
		WebElement TrainingDetails = driver.findElement(By.xpath("//span[normalize-space()='Training Details List']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", TrainingDetails);
		Thread.sleep(1000);
	
	}

	@When("Click on the edit butoon in front of application")
	public void click_on_the_edit_butoon_in_front_of_application() throws Exception {
	   
		WebElement edit = driver.findElement(By.xpath("//tbody/tr[1]/td[10]/input[1]"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",edit);
		Thread.sleep(1000);

		
	}

	@When("Click on the Approve payment button")
	public void click_on_the_approve_payment_button() throws Exception {
		WebElement Payment = driver.findElement(By.xpath("//div//div//div//div[1]//div[2]//button[2]"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", Payment);
		Thread.sleep(1000);

		
	}

	@When("Writte a comment in comment box {string}")
	public void writte_a_comment_in_comment_box(String Validate) throws Exception {
	    
		WebElement comment1 = driver.findElement(By.xpath("//textarea[@type='text']"));
		comment1.sendKeys(Validate);
		Thread.sleep(1000);
	
		
	}

	@Then("Click on the Approve Button")
	public void click_on_the_approve_button() throws Exception {
	  
		WebElement approve = driver.findElement(By.xpath("//button[normalize-space()='Approve']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", approve);
		Thread.sleep(1000);
	
		
	}


}
