package StepsDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import Utilities.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogisticPaymentApproval extends Base{

	@Given("Click on Training Enrolment module")
	public void click_on_training_enrolment_module() throws Exception {
		WebElement TrainingEnrolment = driver.findElement(By.xpath("//span[normalize-space()='Training Enrolment']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", TrainingEnrolment);
		Thread.sleep(1000);
		
		
	}

	@When("Click on Logistic Details Module")
	public void click_on_logistic_details_module() throws Exception {
	    
		WebElement LogisticDetails = driver.findElement(By.xpath("//span[normalize-space()='Logistic Details List']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", LogisticDetails);
		Thread.sleep(1000);
	
		
		
	}

	@When("Click on the edit butoon in front of the application")
	public void click_on_the_edit_butoon_in_front_of_the_application() throws Exception {
		
		WebElement edit = driver.findElement(By.xpath("//tbody/tr[2]/td[8]/input[1]"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", edit);
		Thread.sleep(1000);
	}

	@When("Click on the Approve payment button given")
	public void click_on_the_approve_payment_button_given() throws Exception {
	    
		WebElement Approve = driver.findElement(By.xpath("//body/app-root/block-ui/div/div/section/app-home/app-logistics/div[1]/div[1]/button[1]"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", Approve);
		Thread.sleep(1000);

	}

	@When("Writte a comment in the  comment box {string}")
	public void writte_a_comment_in_the_comment_box(String validate) throws Exception {
		
		WebElement comment1 = driver.findElement(By.xpath("//textarea[@type='text']"));
		comment1.sendKeys(validate);
		Thread.sleep(1000);
		
		
	}

	@Then("click on the Approve button below")
	public void click_on_the_approve_button_below() throws Exception {
	  
		WebElement approve = driver.findElement(By.xpath("//button[normalize-space()='Approve']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", approve);
		Thread.sleep(1000);

	}


}
