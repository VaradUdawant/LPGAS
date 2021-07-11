package StepsDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utilities.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminTrainingDetails extends Base{

	@Given("admin clicks on Training Enrolment")
	public void admin_clicks_on_training_enrolment() throws Exception {
		 Thread.sleep(2000);
		 action = new Actions(driver);
		 WebElement trainingdetails = driver.findElement(By.xpath("//span[normalize-space()='Training Enrolment']"));
		 action.moveToElement(trainingdetails).click().perform();
		
	}
	
	@When("select Training Details List from the drop down list")
	public void select_training_details_list_from_the_drop_down_list() throws Exception {
	 
		 Thread.sleep(1000);
		 action = new Actions(driver);
		 WebElement TrainingDetails  = driver.findElement(By.xpath("//a[@href='#/home/trainingEnrolmentdetails']"));
		 action.moveToElement(TrainingDetails).click().perform();
		
	}


	@When("click on view option")
	public void click_on_view_option() throws Exception {
		
		Thread.sleep(1000);
		WebElement edit2 = driver.findElement(By.xpath("//tbody/tr[1]/td[10]/input[1]"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", edit2);
	
	}

	@When("validate form by clicking on validate from button")
	public void validate_form_by_clicking_on_validate_from_button() throws Exception {
	 
		//validate form
		Thread.sleep(1000);
		WebElement validate = driver.findElement(By.xpath("//div//div//div//div[1]//div[2]//button[3]"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", validate);
			
	}
	
	
	@Then("write a comment {string} and click on accept button")
	public void write_a_comment_and_click_on_accept_button(String Valid) throws Exception {
	  
		 //Write Comment
		WebElement comment = driver.findElement(By.xpath("//textarea[@type='text']"));
		comment.sendKeys(Valid);
		Thread.sleep(1000);
		
	//Click on Approve	
		
		Thread.sleep(1000);
		WebElement approve = driver.findElement(By.xpath("//button[normalize-space()='Approve']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", approve);
	
		
	}


	

	
}
