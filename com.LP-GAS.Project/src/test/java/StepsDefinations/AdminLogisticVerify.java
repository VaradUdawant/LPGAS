package StepsDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utilities.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminLogisticVerify extends Base {

	@Given("Select the training Module from list")
	public void select_the_training_module_from_list() throws Exception {
		action = new Actions(driver);
		WebElement membership = driver.findElement(By.xpath("//span[normalize-space()='Training Enrolment']"));
		action.moveToElement(membership).click().build().perform();
		Thread.sleep(1000);
	}

	@When("Select logistic details list")
	public void select_logistic_details_list() throws Exception {
	    
		action = new Actions(driver);
		WebElement membershipApp = driver.findElement(By.xpath("//span[normalize-space()='Logistic Details List']"));
		action.moveToElement(membershipApp).click().build().perform();
		Thread.sleep(1000);	
		
		
	}

	@When("Click on view option")
	public void click_on_view_option() throws Exception {
	    
		WebElement element = driver.findElement(By.xpath("//tbody/tr[1]/td[8]/input[1]"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
		Thread.sleep(1000);
		
	}

	@When("click on verify Document")
	public void click_on_verify_document() throws Exception {
		
		WebElement element = driver.findElement(By.xpath("//body/app-root/block-ui/div/div/section/app-home/app-logistics/div[1]/div[1]/button[1]"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
		Thread.sleep(1000);
	
	}

	@When("Write comment {string}")
	public void write_comment(String Payment) throws Exception {
	   
		WebElement comment = driver.findElement(By.xpath("//textarea[@type='text']"));
		comment.sendKeys(Payment);
		Thread.sleep(1000);
	}

	@Then("Click on Approve button")
	public void click_on_approve_button() throws Exception {
		
		WebElement element = driver.findElement(By.xpath("//button[normalize-space()='Approve']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
		Thread.sleep(1000);
	
	}

	
	
}
